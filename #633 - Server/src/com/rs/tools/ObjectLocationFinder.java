package com.rs.tools;

import java.io.IOException;

import com.rs.Settings;
import com.rs.cache.Cache;
import com.rs.game.WorldObject;
import com.rs.io.InputStream;
import com.rs.utils.Logger;
import com.rs.utils.MapArchiveKeys;

public class ObjectLocationFinder {// cus im lazy

    public static final void main(String[] args) throws IOException {
	System.out.println("Starting..");
	Cache.init();
	
	int id = 66016;
	
	for(int regionId = 0; regionId < Short.MAX_VALUE; regionId++) {
		int regionX = (regionId >> 8) * 64;
		int regionY = (regionId & 0xff) * 64;
		int landArchiveId = Cache.STORE.getIndexes()[5].getArchiveId("l" + ((regionX >> 3) / 8) + "_" + ((regionY >> 3) / 8));
		byte[] landContainerData = landArchiveId == -1 ? null : Cache.STORE.getIndexes()[5].getFile(landArchiveId, 0, MapArchiveKeys.getMapKeys(regionId));
		int mapArchiveId = Cache.STORE.getIndexes()[5].getArchiveId("m" + ((regionX >> 3) / 8) + "_" + ((regionY >> 3) / 8));
		byte[] mapContainerData = mapArchiveId == -1 ? null : Cache.STORE.getIndexes()[5].getFile(mapArchiveId, 0);
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
		    for (int plane = 0; plane < 4; plane++) {
			for (int x = 0; x < 64; x++) {
			    for (int y = 0; y < 64; y++) {
				if ((mapSettings[plane][x][y] & 0x1) == 1) {
				    int realPlane = plane;
				    if ((mapSettings[1][x][y] & 2) == 2)
					realPlane--;
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
			    int localX = (location >> 6 & 0x3f);
			    int localY = (location & 0x3f);
			    int plane = location >> 12;
			    int objectData = landStream.readUnsignedByte();
			    int type = objectData >> 2;
			    int rotation = objectData & 0x3;
			    if (localX < 0 || localX >= 64 || localY < 0 || localY >= 64)
				continue;
			    int objectPlane = plane;
			    if (mapSettings != null && (mapSettings[1][localX][localY] & 2) == 2)
				objectPlane--;
			    if (objectPlane < 0 || objectPlane >= 4 || plane < 0 || plane >= 4)
				continue;
			    WorldObject object = new WorldObject(objectId, type, rotation, localX + regionX, localY + regionY, objectPlane);
			    if(object.getId() == id)
				System.out.println(object.getId()+" ,"+object.getX()+", "+object.getY()+", "+object.getPlane()+", "+type+", "+rotation);
			}
		    }
		}
		if (Settings.DEBUG && landContainerData == null && landArchiveId != -1 && MapArchiveKeys.getMapKeys(regionId) != null)
		    Logger.log("Test", "Missing xteas for region " + regionId + ".");
	}
    }
}