package com.rs.game.player.content.dungeoneering;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import com.rs.cache.loaders.NPCDefinitions;
import com.rs.cores.CoresManager;
import com.rs.game.Region;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.map.MapBuilder;
import com.rs.game.npc.NPC;
import com.rs.game.npc.dungeonnering.AsteaFrostweb;
import com.rs.game.npc.dungeonnering.DungeonNPC;
import com.rs.game.npc.dungeonnering.Guardian;
import com.rs.game.player.CombatDefinitions;
import com.rs.game.player.Player;
import com.rs.utils.Logger;
import com.rs.utils.Utils;

public class DungeonManager {

    private DungeonPartyManager party;
    private Dungeon dungeon;
    private VisibleRoom[][] visibleMap;
    private int[] boundChuncks;
    private int dungeoneeringLevel;
    private int stage;

    // 7554
    public DungeonManager(DungeonPartyManager party, int size) {
	this.party = party;
	load(size);
    }

    public void enterRoom(Player player, int x, int y) {
	if (x >= visibleMap.length || y >= visibleMap[0].length) {
	    System.out.println("ivalid room");
	    return;
	}
	RoomReference roomReference = getCurrentRoomReference(player);
	if (visibleMap[x][y] != null) {
	    int xOffset = x - roomReference.getX();
	    int yOffset = y - roomReference.getY();
	    player.setNextWorldTile(new WorldTile(player.getX() + xOffset * 3, player.getY() + yOffset * 3, 0));
	    playMusic(player, new RoomReference(x, y));
	} else
	    loadRoom(x, y);
    }

    public void loadRoom(int x, int y) {
	loadRoom(new RoomReference(x, y));
    }

    public void loadRoom(final RoomReference reference) {
	final Room room = dungeon.getRoom(reference);
	if (room == null)
	    return;
	visibleMap[reference.getX()][reference.getY()] = new VisibleRoom(party.getFloorType(), room.getRoom());
	CoresManager.slowExecutor.execute(new Runnable() {
	    @Override
	    public void run() {
		try {
		    openRoom(room, reference);
		}
		catch (Throwable e) {
		    Logger.handle(e);
		}
	    }
	});
    }

    public void openRoom(Room room, RoomReference reference) {
	int toChunkX = boundChuncks[0] + reference.getX() * 2;
	int toChunkY = boundChuncks[1] + reference.getY() * 2;
	MapBuilder.copy2RatioSquare(room.getChunkX(), room.getChunkY(), toChunkX, toChunkY, room.getRotation());
	int regionId = (((toChunkX / 8) << 8) + (toChunkY / 8));
	for (DungeonPartyPlayer dplayer : party.getTeam()) {
	    Player player = dplayer.getPlayer();
	    if (!player.getMapRegionsIds().contains(regionId))
		continue;
	    player.setForceNextMapLoadRefresh(true);
	    player.loadMapRegions();
	}
	room.openRoom(this, reference);
    }

    public WorldTile getRoomCenterTile(RoomReference reference) {
	return getRoomBaseTile(reference).transform(8, 8, 0);
    }

    public WorldTile getRoomBaseTile(RoomReference reference) {
	return new WorldTile(((boundChuncks[0] << 3) + reference.getX() * 16), ((boundChuncks[1] << 3) + reference.getY() * 16), 0);
    }

    public RoomReference getCurrentRoomReference(WorldTile tile) {
	return new RoomReference((tile.getChunkX() - boundChuncks[0]) / 2, ((tile.getChunkY() - boundChuncks[1]) / 2));
    }

    public WorldTile getHomeTile() {
	return getRoomCenterTile(dungeon.getStartRoomReference());
    }

    public void telePartyToRoom(RoomReference reference) {
	WorldTile tile = getRoomCenterTile(reference);
	for (DungeonPartyPlayer dplayer : party.getTeam()) {
	    dplayer.getPlayer().setNextWorldTile(tile);
	    playMusic(dplayer.getPlayer(), reference);
	}
    }

    public void playMusic(Player player, RoomReference reference) {
	player.getMusicsManager().playMusic(visibleMap[reference.getX()][reference.getY()].getMusicId());
    }

    public void linkPartyToDungeon() {
	for (DungeonPartyPlayer dplayer : party.getTeam()) {
	    Player player = dplayer.getPlayer();
	    player.getControlerManager().startControler("DungeonControler", this);
	    player.stopAll();
	    player.reset();
	    player.setForceMultiArea(true);
	    player.getCombatDefinitions().setSpellBook(3);
	    dplayer.refreshDeaths();
	    player.getPackets().sendGameMessage("");
	    player.getPackets().sendGameMessage("-Welcome to Daemonheim-");
	    player.getPackets().sendGameMessage("Floor <col=641d9e>" + party.getFloor() + "    <col=ffffff>Complexity <col=641d9e>" + party.getComplexity());
	    player.getPackets().sendGameMessage("Dungeon Size: " + "<col=641d9e>Small");
	    player.getPackets().sendGameMessage("Party Size:Dificulty <col=641d9e>" + party.getTeam().size() + ":" + party.getTeam().size());
	    player.getPackets().sendGameMessage("");
	    player.unlock();
	}
    }

    public DungeonPartyPlayer getDPlayer(Player player) {
	return party.getDPlayer(player);
    }

    public void spawnRandomNPCS(RoomReference reference) {
	int floorType = party.getFloorType();
	for (int i = 0; i < 10; i++) {
	    spawnNPC(reference, DungeonUtils.getGuardianCreature(floorType), 2 + Utils.getRandom(13), 2 + Utils.getRandom(13), true, true);
	}
	spawnNPC(reference, DungeonUtils.getPassiveCreature(floorType), 2 + Utils.getRandom(13), 2 + Utils.getRandom(13), true, false);
    }

    public void spawnNPC(RoomReference reference, int id, int x, int y) {
	spawnNPC(reference, id, x, y, false, false);
    }

    /*
     * x 0-15, y 0-15
     */
    public void spawnNPC(final RoomReference reference, final int id, int x, int y, boolean check, final boolean guardian) {
	int rotation = dungeon.getRoom(reference).getRotation();
	if (rotation != 0) {
	    for (int rotate = 0; rotate < (4 - rotation); rotate++) {
		int fakeX = x;
		int fakeY = y;
		x = fakeY;
		y = 15 - fakeX;
	    }
	}
	final WorldTile tile = new WorldTile(((boundChuncks[0] << 3) + reference.getX() * 16) + x, ((boundChuncks[1] << 3) + reference.getY() * 16) + y, 0);
	if (check) {
	    if (!World.isRegionLoaded(tile.getRegionId())) {
		CoresManager.slowExecutor.execute(new Runnable() {
		    @Override
		    public void run() {
			try {
			    long start = Utils.currentTimeMillis();
			    while (!World.isRegionLoaded(tile.getRegionId())) {
				if (Utils.currentTimeMillis() - start >= 10000) {// 10
										 // sec
										 // load
										 // limit
				    Logger.log("DungeonManager", "Failed to spawn npc.");
				    break;
				}
			    }
			    if (!World.isTileFree(0, tile.getX(), tile.getY(), NPCDefinitions.getNPCDefinitions(id).size))
				return;
			    spawnNPC(id, tile, reference, guardian);
			}
			catch (Throwable e) {
			    Logger.handle(e);
			}
		    }
		});
	    } else {
		if (!World.isTileFree(0, tile.getX(), tile.getY(), NPCDefinitions.getNPCDefinitions(id).size))
		    return;
		spawnNPC(id, tile, reference, guardian);
	    }
	} else
	    spawnNPC(id, tile, reference, guardian);
    }

    private void spawnNPC(int id, WorldTile tile, RoomReference reference, boolean guardian) {
	NPC n;
	if (id == 9965)
	    n = new AsteaFrostweb(id, tile, this, reference);
	else {
	    n = guardian ? new Guardian(id, tile, this, reference) : new DungeonNPC(id, tile, this);
	    n.setForceMultiArea(true);
	    if (guardian) {
		n.setForceAgressive(true);
		visibleMap[reference.getX()][reference.getY()].addGuardian(n);
	    }
	}
    }

    public int getTargetLevel(boolean boss) {
	int partyLevel = party.getCombatLevel();
	int lvl = boss ? partyLevel : partyLevel >= 276 ? 138 : partyLevel / 2;
	int randomize = party.getComplexity() * 2 * party.getTeam().size();
	lvl -= randomize;
	lvl += Utils.random(randomize * 2);
	return lvl < 1 ? 1 : lvl;
    }

    public int[] getBonuses(boolean boss, int level) {
	int[] bonuses = new int[10];

	// less 50% than defence
	bonuses[CombatDefinitions.RANGE_ATTACK] = party.getRangeLevel() + (boss ? level : level / 2) / 2;
	bonuses[CombatDefinitions.STAB_ATTACK] = party.getAttackLevel() + (int) ((boss ? level : level / 2) / 1.2) / 2; // 20%
															// less
															// than
															// range
	bonuses[CombatDefinitions.MAGIC_ATTACK] = party.getMagicLevel() + (int) ((boss ? level : level / 2) / 1.5) / 2; // 50%
															// less
															// than
															// range
	int npcDefenceLevel = party.getDefenceLevel();
	bonuses[CombatDefinitions.STAB_DEF] = bonuses[CombatDefinitions.CRUSH_DEF] = bonuses[CombatDefinitions.SLASH_DEF] = npcDefenceLevel + (boss ? level : level / 2);
	bonuses[CombatDefinitions.RANGE_DEF] = npcDefenceLevel + (int) ((boss ? level : level / 2) / 1.2); // 20%
													   // less
													   // than
													   // range
	bonuses[CombatDefinitions.MAGIC_DEF] = npcDefenceLevel + (int) ((boss ? level : level / 2) / 1.5); // 50%
													   // less
													   // than
													   // range

	System.out.println(Arrays.toString(bonuses));
	return bonuses;
    }

    public void updateGuardian(RoomReference reference) {
	if (visibleMap[reference.getX()][reference.getY()].removeGuardians()) {
	    for (DungeonPartyPlayer dplayer : party.getTeam()) {
		Player player = dplayer.getPlayer();
		RoomReference playerReference = getCurrentRoomReference(player);
		if (playerReference.getX() == reference.getX() && playerReference.getY() == reference.getY())
		    playMusic(player, reference);
	    }
	}
    }

    public void removePlayer(Player player) {
	player.stopAll();
	player.reset();
	player.setForceMultiArea(false);
	player.getCombatDefinitions().removeDungeonneringBook();
    }

    public void exitCave(Player player, boolean logout) {
	party.remove(getDPlayer(player));
	player.stopAll();
	if (logout)
	    player.setLocation(new WorldTile(DungeonConstants.OUTSIDE, 2));
	else {
	    player.useStairs(-1, new WorldTile(DungeonConstants.OUTSIDE, 2), 0, 1);
	    player.getCombatDefinitions().removeDungeonneringBook();
	    player.setForceMultiArea(false);
	    player.getControlerManager().removeControlerWithoutCheck();
	    player.getInterfaceManager().removeOverlay(false);
	}

    }

    public void destroy() {
	stage = 2;
	CoresManager.slowExecutor.schedule(new Runnable() {
	    @Override
	    public void run() {
		MapBuilder.destroyMap(boundChuncks[0], boundChuncks[1], dungeon.getMapWidth() * 2, dungeon.getMapHeight() * 2);
	    }
	}, 1200, TimeUnit.MILLISECONDS);
    }

    public void load(final int size) {
	party.lockParty();
	dungeoneeringLevel = party.getDungeoneeringLevel();
	visibleMap = new VisibleRoom[DungeonConstants.DUNGEON_RATIO[size][0]][DungeonConstants.DUNGEON_RATIO[size][1]];
	// slow executor loads dungeon as it may take up to few secs
	CoresManager.slowExecutor.execute(new Runnable() {
	    @Override
	    public void run() {
		try {
		    // generates dungeon structure
		    dungeon = new Dungeon(party.getFloorType(), party.getComplexity(), size);
		    dungeon.setBossRoom(dungeoneeringLevel);
		    // finds an empty map area bounds
		    boundChuncks = MapBuilder.findEmptyChunkBound(dungeon.getMapWidth() * 2, (dungeon.getMapHeight() * 2));
		    // reserves all map area
		    MapBuilder.cutMap(boundChuncks[0], boundChuncks[1], dungeon.getMapWidth() * 2, (dungeon.getMapHeight() * 2), 0);
		    // loads start room
		    loadRoom(dungeon.getStartRoomReference());
		    stage = 1;
		}
		catch (Throwable e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    public boolean hasStarted() {
	return stage == 1;
    }

    public void openStairs(RoomReference reference) {
	Region region = World.getRegion(getRoomBaseTile(reference).getRegionId());
	if (region == null)
	    return;
	WorldObject exit = region.getObjectWithId(DungeonConstants.LADDERS[party.getFloorType()] - 1, 0);
	if (exit == null)
	    return;
	World.spawnObject(new WorldObject(exit.getId() + 1, exit.getType(), exit.getRotation(), exit));
	for (DungeonPartyPlayer player : party.getTeam())
	    player.getPlayer().getPackets().sendMusicEffect(415);
    }
}
