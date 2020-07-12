package com.rs.game;

import java.util.ArrayList;
import java.util.List;

import com.rs.Settings;
import com.rs.cache.Cache;
import com.rs.cache.loaders.ObjectDefinitions;
import com.rs.io.InputStream;
import com.rs.utils.Logger;
import com.rs.utils.MapArchiveKeys;

public class DynamicRegion extends Region {

    /**
     * Contains render coordinates.
     */
    private int[][][][] regionCoords;
    private boolean[][][] needsReload;
    private boolean recheckReload;

    public DynamicRegion(int regionId) {
	super(regionId);
	// plane,x,y,(real x, real y,or real plane coord, or rotation)
	regionCoords = new int[4][8][8][4];
	needsReload = new boolean[4][8][8];
	for (int z = 0; z < 4; z++) {
	    for (int x = 0; x < 8; x++) {
		for (int y = 0; y < 8; y++) {
		    needsReload[z][x][y] = true;
		}
	    }
	}
	recheckReload = false;
    }

    @Override
    public void checkLoadMap() {
	if (recheckReload) {
	    setLoadMapStage(0);
	    recheckReload = false;
	}
	super.checkLoadMap();
    }

    @Override
    public void loadRegionMap() {
	
	for (int dynZ = 0; dynZ < 4; dynZ++) {
	    for (int dynX = 0; dynX < 8; dynX++) {
		for (int dynY = 0; dynY < 8; dynY++) {
		    if (!needsReload[dynZ][dynX][dynY])
			continue;
		    unloadChunk(dynX, dynY, dynZ);
		}
	    }
	}
		                           
	
	for (int dynZ = 0; dynZ < 4; dynZ++) {
	    for (int dynX = 0; dynX < 8; dynX++) {
		for (int dynY = 0; dynY < 8; dynY++) {
		    if (!needsReload[dynZ][dynX][dynY])
			continue;
		    needsReload[dynZ][dynX][dynY] = false;

		    int renderChunkX = regionCoords[dynZ][dynX][dynY][0];
		    int renderChunkY = regionCoords[dynZ][dynX][dynY][1];
		    int renderChunkZ = regionCoords[dynZ][dynX][dynY][2];
		    int rotation = regionCoords[dynZ][dynX][dynY][3];
		    int renderLocalChunkX = renderChunkX - ((renderChunkX >> 3) << 3);
		    int renderLocalChunkY = renderChunkY - ((renderChunkY >> 3) << 3);

		    if (renderChunkX == 0 && renderChunkY == 0 && renderChunkZ == 0 && rotation == 0) {
			continue;
		    }

		    int mapID = (renderChunkX >> 3) << 8 | (renderChunkY >> 3);
		    int landArchiveId = Cache.STORE.getIndexes()[5].getArchiveId("l" + (mapID >> 8) + "_" + (mapID & 0xFF));
		    int mapArchiveId = Cache.STORE.getIndexes()[5].getArchiveId("m" + (mapID >> 8) + "_" + (mapID & 0xFF));
		    byte[] mapContainerData = mapArchiveId == -1 ? null : Cache.STORE.getIndexes()[5].getFile(mapArchiveId, 0);
		    byte[] landContainerData = landArchiveId == -1 ? null : Cache.STORE.getIndexes()[5].getFile(landArchiveId, 0, MapArchiveKeys.getMapKeys(mapID));
		    byte[][][] mapSettings = mapContainerData == null ? null : new byte[4][64][64];
		    if (mapContainerData != null) {
			InputStream mapStream = new InputStream(mapContainerData);
			for (int plane = 0; plane < 4; plane++) {
			    for (int x = 0; x < 64; x++) {
				for (int y = 0; y < 64; y++) {
				    while (true) {
					int value = mapStream.readUnsignedByte();
					if (value == 0) {
					    break;
					} else if (value == 1) {
					    mapStream.readByte();
					    break;
					} else if (value <= 49) {
					    mapStream.readByte();

					} else if (value <= 81) {
					    mapSettings[plane][x][y] = (byte) (value - 49);
					}
				    }
				}
			    }
			}

			for (int z = 0; z < 4; z++) {
			    for (int x = 0; x < 64; x++) {
				for (int y = 0; y < 64; y++) {
				    if ((mapSettings[z][x][y] & 0x1) == 1) {
					int realZ = z;
					if ((mapSettings[1][x][y] & 0x2) == 2) {
					    realZ--;
					}
					if (realZ == renderChunkZ && (x >> 3) == renderLocalChunkX && (y >> 3) == renderLocalChunkY) {
					    int[] coords = translate(x & 0x7, y & 0x7, rotation);
					    forceGetRegionMap().addUnwalkable(dynZ, (dynX << 3) | coords[0], (dynY << 3) | coords[1]);
					}
				    }
				}
			    }
			}
		    }
		    else {
			for (int z = 0; z < 4; z++) {
			    for (int x = 0; x < 64; x++) {
				for (int y = 0; y < 64; y++) {
				    if (z == renderChunkZ && (x >> 3) == renderLocalChunkX && (y >> 3) == renderLocalChunkY) {
					int[] coords = translate(x & 0x7, y & 0x7, rotation);
					forceGetRegionMap().addUnwalkable(dynZ, (dynX << 3) | coords[0], (dynY << 3) | coords[1]);
				    }
				}
			    }
			}
		    }

		    if (landContainerData != null) {
			InputStream landStream = new InputStream(landContainerData);
			int objectId = -1;
			int incr;
			while ((incr = landStream.readSmart2()) != 0) {
			    objectId += incr;
			    int location = 0;
			    int incr2;
			    while ((incr2 = landStream.readUnsignedSmart()) != 0) {
				location += incr2 - 1;
				int x = (location >> 6 & 0x3f);
				int y = (location & 0x3f);
				int z = location >> 12;
				int objectData = landStream.readUnsignedByte();
				int type = objectData >> 2;
				int rot = objectData & 0x3;
				int realZ = z;
				if (mapSettings != null && (mapSettings[1][x][y] & 2) == 2)
				    realZ--;
				if (realZ == renderChunkZ && (x >> 3) == renderLocalChunkX && (y >> 3) == renderLocalChunkY) {
				    ObjectDefinitions definition = ObjectDefinitions.getObjectDefinitions(objectId);
				    int[] coords = translate(x & 0x7, y & 0x7, rotation, definition.sizeX, definition.sizeY, rot);
				    spawnObject(new WorldObject(objectId, type, (rotation + rot) & 0x3, (dynX << 3) + coords[0] + ((getRegionId() >> 8) << 6), (dynY << 3) + coords[1] + ((getRegionId() & 0xFF) << 6), dynZ), dynZ, (dynX << 3) + coords[0], (dynY << 3) + coords[1], true);
				}
			    }
			}
		    }

		    if (Settings.DEBUG && landContainerData == null && landArchiveId != -1 && MapArchiveKeys.getMapKeys(mapID) != null)
			Logger.log(this, "Missing xteas for region " + mapID + ".");
		}
	    }
	}
    }

    private void unloadChunk(int chunkX, int chunkY, int chunkZ) {
	for (int x = 0; x < 8; x++) {
	    for (int y = 0; y < 8; y++) {
		int fullX = (chunkX << 3) | x;
		int fullY = (chunkY << 3) | y;
		if (objects != null) {
		    for (int slot = 0; slot < 4; slot++) {
			objects[chunkZ][fullX][fullY][slot] = null;
		    }
		}
		if (map != null)
		    map.setMask(chunkZ, fullX, fullY, 0);
		if (clipedOnlyMap != null)
		    clipedOnlyMap.setMask(chunkZ, fullX, fullY, 0);

		List<WorldObject> ro = new ArrayList<WorldObject>(removedOriginalObjects);
		// List<WorldObject> ao = new
		// ArrayList<WorldObject>(spawnedObjects);
		for (WorldObject removed : ro)
		    if (removed.getPlane() == chunkZ && removed.getChunkX() == chunkX && removed.getChunkY() == chunkY)
			removedOriginalObjects.remove(removed);
		/*
		 * for (WorldObject added : ro) if (added.getPlane() == chunkZ
		 * && added.getChunkX() == chunkX && added.getChunkY() ==
		 * chunkY) spawnedObjects.remove(ao);
		 */
	    }
	}
    }

    public static int[] translate(int x, int y, int rotation) {
	int[] coords = new int[2];
	if (rotation == 0) {
	    coords[0] = x;
	    coords[1] = y;
	} else if (rotation == 1) {
	    coords[0] = y;
	    coords[1] = 7 - x;
	} else if (rotation == 2) {
	    coords[0] = 7 - x;
	    coords[1] = 7 - y;
	} else {
	    coords[0] = 7 - y;
	    coords[1] = x;
	}
	return coords;
    }

    public static int[] translate(int x, int y, int mapRotation, int sizeX, int sizeY, int objectRotation) {
	int[] coords = new int[2];
	if ((objectRotation & 0x1) == 1) {
	    int prevSizeX = sizeX;
	    sizeX = sizeY;
	    sizeY = prevSizeX;
	}
	if (mapRotation == 0) {
	    coords[0] = x;
	    coords[1] = y;
	} else if (mapRotation == 1) {
	    coords[0] = y;
	    coords[1] = 7 - x - (sizeX - 1);
	} else if (mapRotation == 2) {
	    coords[0] = 7 - x - (sizeX - 1);
	    coords[1] = 7 - y - (sizeY - 1);
	} else if (mapRotation == 3) {
	    coords[0] = 7 - y - (sizeY - 1);
	    coords[1] = x;
	}
	return coords;
    }

    @Override
    public int getRotation(int plane, int x, int y) {
	return regionCoords[plane][x][y][3];
    }

    public void setRotation(int plane, int x, int y, int rotation) {
	regionCoords[plane][x][y][3] = rotation;
	setReloadObjects(plane, x, y);
    }

    public void setReloadObjects(int plane, int x, int y) {
	needsReload[plane][x][y] = true;
	recheckReload = true;
    }

    public int[][][][] getRegionCoords() {
	return regionCoords;
    }
}
