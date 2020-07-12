package com.rs.game.player.controllers.events;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import com.rs.Settings;
import com.rs.cores.CoresManager;
import com.rs.game.Animation;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.FloorItem;
import com.rs.game.item.Item;
import com.rs.game.map.MapBuilder;
import com.rs.game.npc.others.GraveStone;
import com.rs.game.player.Player;
import com.rs.game.player.content.Magic;
import com.rs.game.player.controllers.Controller;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.net.decoders.WorldPacketsDecoder;
import com.rs.utils.Logger;
import com.rs.utils.Utils;

public class DeathEvent extends Controller {
    public static final WorldTile[] HUBS = {
	    //Lumbridge
    new WorldTile(3222, 3219, 0)
	    //Varrock
    , new WorldTile(3212, 3422, 0)
	    //EDGEVILLE
    , new WorldTile(3094, 3502, 0)
	    //FALADOR
    , new WorldTile(2965, 3386, 0)
	    //SEERS VILLAGE
    , new WorldTile(2725, 3491, 0)
	    //ARDOUDGE
    , new WorldTile(2662, 3305, 0)
	    //YANNILE
    , new WorldTile(2605, 3093, 0)
	    //KELDAGRIM
    , new WorldTile(2845, 10210, 0)
	    //DORGESH-KAN
    , new WorldTile(2720, 5351, 0)
	    //LYETYA
    , new WorldTile(2341, 3171, 0)
	    //ETCETERIA
    , new WorldTile(2614, 3894, 0)
	    //DAEMONHEIM
    , new WorldTile(3450, 3718, 0)
	    //CANIFIS
    , new WorldTile(3496, 3489, 0)
	    //THZAAR AREA
    , new WorldTile(4651, 5151, 0)
	    //BURTHORPE
    , new WorldTile(2889, 3528, 0)
	    //ALKARID
    , new WorldTile(3275, 3166, 0)
	    //DRAYNOR VILLAGE
    , new WorldTile(3079, 3250, 0) };

    //3796 - 0 - Lumbridge Castle - {1=Falador Castle, 2=Camelot, 3=Soul Wars, 4=Burthorpe}
    public static final WorldTile[] RESPAWN_LOCATIONS = { new WorldTile(3222, 3219, 0), new WorldTile(2971, 3343, 0), new WorldTile(2758, 3486, 0), new WorldTile(1891, 3177, 0), new WorldTile(2889, 3528, 0) };

    public static int getCurrentHub(WorldTile tile) {
	int nearestHub = -1;
	int distance = 0;
	for (int i = 0; i < HUBS.length; i++) {
	    int d = Utils.getDistance(HUBS[i], tile);
	    if (nearestHub == -1 || d < distance) {
		distance = d;
		nearestHub = i;
	    }
	}
	return nearestHub;
    }

    public static WorldTile getRespawnHub(Player player) {
	return HUBS[getCurrentHub(player)];
    }

    private int[] boundChuncks;
    private Stages stage;
    private Integer[][] slots;
    private int currentHub;

    @Override
    public void start() {
	loadRoom();
    }

    public boolean login() {
	loadRoom();
	return false;
    }

    public boolean logout() {
	player.setLocation(new WorldTile(1978, 5302, 0));
	destroyRoom();
	return false;
    }

    public boolean canTakeItem(FloorItem item) {
	return false;
    }

    public boolean canEquip(int slotId, int itemId) {
	return false;
    }

    public boolean canPlayerOption1(Player target) {
	return false;
    }

    public boolean canPlayerOption2(Player target) {
	return false;
    }

    public boolean canPlayerOption3(Player target) {
	return false;
    }

    public boolean canPlayerOption4(Player target) {
	return false;
    }

    private static enum Stages {
	LOADING, RUNNING, DESTROYING
    }

    @Override
    public void sendInterfaces() {
	player.getInterfaceManager().closeCombatStyles();
	player.getInterfaceManager().closeTaskSystem();
	player.getInterfaceManager().closeSkills();
	player.getInterfaceManager().closeInventory();
	player.getInterfaceManager().closeEquipment();
	player.getInterfaceManager().closePrayerBook();
	player.getInterfaceManager().closeMagicBook();
	player.getInterfaceManager().closeEmotes();
    }

    public void loadRoom() {
	stage = Stages.LOADING;
	player.lock(); // locks player
	CoresManager.slowExecutor.execute(new Runnable() {
	    @Override
	    public void run() {
		try {
			boundChuncks = MapBuilder.findEmptyChunkBound(2, 2);
			MapBuilder.copyMap(246, 662, boundChuncks[0], boundChuncks[1], 2, 2, new int[1], new int[1]);
			player.reset();
			player.setNextWorldTile(new WorldTile(boundChuncks[0] * 8 + 10, boundChuncks[1] * 8 + 6, 0));
			// 1delay because player cant walk while teleing :p, + possible
			// issues avoid
			WorldTasksManager.schedule(new WorldTask() {
			    @Override
			    public void run() {
				player.setNextAnimation(new Animation(-1));
				player.getMusicsManager().playMusic(683);
				player.getPackets().sendBlackOut(2);
				sendInterfaces();
				player.unlock(); // unlocks player
				stage = Stages.RUNNING;
			    }

			}, 1);
		}catch(Throwable e) {
		    Logger.handle(e);
		}
	    }
	});
    }

    @Override
    public boolean processMagicTeleport(WorldTile toTile) {
	return false;
    }

    @Override
    public boolean processItemTeleport(WorldTile toTile) {
	return false;
    }

    /**
     * return process normaly
     */
    public boolean processObjectClick1(WorldObject object) {
	if (object.getId() == 45803) {
	    if (getArguments() == null || getArguments().length < 2)
		Magic.sendObjectTeleportSpell(player, true, Settings.START_PLAYER_LOCATION);
	    else
		getReadyToRespawn();
	    return false;
	}
	return true;
    }

    /**
     * return process normaly
     */
    public boolean processButtonClick(int interfaceId, int componentId, int slotId, int slotId2, int packetId) {
	if (interfaceId == 18) {
	    if (componentId == 9) {
		if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
		    unprotect(slotId);
	    } else if (componentId == 17) {
		if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
		    protect(slotId2);
	    } else if (componentId == 45) {
		//slotid - 1
		if (slotId > RESPAWN_LOCATIONS.length)
		    return false;
		currentHub = 255 + slotId;
	    }
	    return false;
	}
	return true;
    }

    public void getReadyToRespawn() {
	slots = GraveStone.getItemSlotsKeptOnDeath(player, false, hadSkull(), player.getPrayer().isProtectingItem());
	player.getInterfaceManager().sendInterface(18);
	if (slots[0].length > 0) {
	    player.getVarsManager().sendVarBit(9227, slots[0].length);
	    sendProtectedItems();
	} else {
	    player.getVarsManager().sendVarBit(9222, -1);
	    player.getVarsManager().sendVarBit(9227, 1);
	}
	player.getVarsManager().sendVarBit(668, 1); //unlocks camelot respawn spot
	player.getVarsManager().sendVar(105, -1);
	player.getVarsManager().sendVarBit(9231, currentHub = getCurrentHub(getDeathTile()));
	player.getPackets().sendUnlockIComponentOptionSlots(18, 9, 0, slots[0].length, 0);
	player.getPackets().sendUnlockIComponentOptionSlots(18, 17, 0, 100, 0);
	player.getPackets().sendUnlockIComponentOptionSlots(18, 45, 0, RESPAWN_LOCATIONS.length, 0);
	player.setCloseInterfacesEvent(new Runnable() {

	    @Override
	    public void run() {
		WorldTile respawnTile = currentHub >= 256 ? RESPAWN_LOCATIONS[currentHub - 256] : HUBS[currentHub];
		synchronized (slots) {
		    player.sendItemsOnDeath(null, getDeathTile(), respawnTile, false, slots);
		}
		player.setCloseInterfacesEvent(null);
		Magic.sendObjectTeleportSpell(player, true, respawnTile);
	    }

	});
    }

    public void sendProtectedItems() {
	for (int i = 0; i < getProtectSlots(); i++)
	    player.getVarsManager().sendVarBit(9222 + i, i >= slots[0].length ? -1 : slots[0][i]);
    }

    public void protect(int itemId) {
	synchronized (slots) {
	    int slot = -1;
	    for (int i = 0; i < slots[1].length; i++) {

		Item item = slots[1][i] >= 16 ? player.getInventory().getItem(slots[1][i] - 16) : player.getEquipment().getItem(slots[1][i] - 1);
		if (item == null)
		    continue;
		if (item.getId() == itemId) {
		    slot = i;
		    break;
		}
	    }
	    if (slot == -1 || getProtectSlots() <= slots[0].length)
		return;
	    slots[0] = Arrays.copyOf(slots[0], slots[0].length + 1);
	    slots[0][slots[0].length - 1] = slots[1][slot];
	    Integer[] lItems = new Integer[slots[1].length - 1];
	    System.arraycopy(slots[1], 0, lItems, 0, slot);
	    System.arraycopy(slots[1], slot + 1, lItems, slot, lItems.length - slot);
	    slots[1] = lItems;
	    sendProtectedItems();
	}

    }

    public void unprotect(int slot) {
	synchronized (slots) {
	    if (slot >= slots[0].length)
		return;
	    slots[1] = Arrays.copyOf(slots[1], slots[1].length + 1);
	    slots[1][slots[1].length - 1] = slots[0][slot];
	    Integer[] pItems = new Integer[slots[0].length - 1];
	    System.arraycopy(slots[0], 0, pItems, 0, slot);
	    System.arraycopy(slots[0], slot + 1, pItems, slot, pItems.length - slot);
	    slots[0] = pItems;
	    sendProtectedItems();
	}

    }

    public int getProtectSlots() {
	return player.getVarsManager().getBitValue(9227);
    }

    public WorldTile getDeathTile() {
	if (getArguments() == null || getArguments().length < 2)
	    return Settings.START_PLAYER_LOCATION;
	return (WorldTile) getArguments()[0];
    }

    public boolean hadSkull() {
	if (getArguments() == null || getArguments().length < 2)
	    return false;
	return (boolean) getArguments()[1];
    }

    @Override
    public void magicTeleported(int type) {
	destroyRoom();
	player.getPackets().sendBlackOut(0);
	player.getInterfaceManager().sendCombatStyles();
	player.getCombatDefinitions().sendUnlockAttackStylesButtons();
	player.getInterfaceManager().sendSkills();
	player.getInterfaceManager().sendInventory();
	player.getInventory().unlockInventoryOptions();
	player.getInterfaceManager().sendEquipment();
	player.getInterfaceManager().sendPrayerBook();
	player.getPrayer().unlockPrayerBookButtons();
	player.getInterfaceManager().sendMagicBook();
	player.getInterfaceManager().sendEmotes();
	player.getEmotesManager().unlockEmotesBook();
	removeControler();
    }

    public void destroyRoom() {
	if (stage != Stages.RUNNING)
	    return;
	stage = Stages.DESTROYING;
	CoresManager.slowExecutor.schedule(new Runnable() {
	    @Override
	    public void run() {
		try {
			MapBuilder.destroyMap(boundChuncks[0], boundChuncks[1], 8, 8);
		}catch(Throwable e) {
		    Logger.handle(e);
		}
	    }
	}, 1200, TimeUnit.MILLISECONDS);
    }

    @Override
    public void forceClose() {
	destroyRoom();
    }

}
