package com.rs.game.player.controllers;

import java.util.HashMap;
import java.util.Map;

import com.rs.game.Animation;
import com.rs.game.ForceTalk;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.HerbCleaning;
import com.rs.game.player.actions.HerbCleaning.Herbs;
import com.rs.game.player.content.FadingScreen;
import com.rs.game.player.content.Magic;
import com.rs.game.player.dialogues.impl.SqirkFruitSqueeze.SqirkFruit;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class SorceressGarden extends Controller {

    private static final WorldTile MIDDLE = new WorldTile(2916, 5475, 0);

    public enum Gate {

	WINTER(21709, 1, new WorldTile(2902, 5470, 0), new WorldTile(2903, 5470, 0), 231), SPRING(21753, 25, new WorldTile(2921, 5473, 0), new WorldTile(2920, 5473, 0), 228), AUTUMN(21731, 45, new WorldTile(2913, 5462, 0), new WorldTile(2913, 5463, 0), 229), SUMMER(21687, 65, new WorldTile(2910, 5481, 0), new WorldTile(2910, 5480, 0), 230);

	private int objectId;
	private int levelReq;
	private int musicId;
	private WorldTile inside, outside;

	private static Map<Integer, Gate> Gates = new HashMap<Integer, Gate>();

	private Gate(int objectId, int lvlReq, WorldTile inside, WorldTile outside, int musicId) {
	    this.objectId = objectId;
	    this.levelReq = lvlReq;
	    this.inside = inside; 
	    this.outside = outside;
	    this.musicId = musicId;
	}

	static {
	    for (Gate gate : Gate.values()) {
		Gates.put(gate.getObjectId(), gate);
	    }
	}

	/**
	 * 
	 * @param player
	 *            the Player
	 * @param objectId
	 *            Object id
	 * @param lvlReq
	 *            Level required for entrance
	 * @param toTile
	 *            Where the player will be spawned
	 */
	public static void handleGates(Player player, int objectId, int lvlReq, WorldTile toTile, int musicId) {
	    if (lvlReq > player.getSkills().getLevelForXp(Skills.THIEVING)) {
		player.getDialogueManager().startDialogue("SimpleMessage", "You need " + lvlReq + " thieving level to pick this gate.");
		return;
	    }
	    player.useStairs(-1, toTile, 0, 1);
	    player.getMusicsManager().playMusic(musicId);
	}

	public static Gate forId(int id) {
	    return Gates.get(id);
	}

	public int getObjectId() {
	    return objectId;
	}

	public int getLeveLReq() {
	    return levelReq;
	}

	public WorldTile getInsideTile() {
	    return inside;
	}

	public WorldTile getOutsideTile() {
	    return outside;
	}
    }

    @Override
    public void magicTeleported(int type) {
	removeControler();

    }

    public static void teleportToSorceressGardenNPC(NPC npc, final Player player) {
	npc.setNextForceTalk(new ForceTalk("Senventior Disthinte Molesko!"));
	SorceressGarden.teleportToSocreressGarden(player, false);
    }

    public static void teleportToSocreressGarden(final Player player, boolean broomstick) {
	if (player.getControlerManager().getControler() instanceof SorceressGarden) {
	    player.getPackets().sendGameMessage("You can't teleport to the Sorceress's Garden whilst you're in the Sorceress's Garden!");
	    return;
	}
	boolean teleport;
	if (!broomstick)
	    teleport = Magic.sendNormalTeleportSpell(player, 0, 0, MIDDLE);
	else
	    teleport = Magic.sendTeleportSpell(player, 10538, 10537, -1, -1, 0, 0, MIDDLE, 4, true, Magic.MAGIC_TELEPORT);
	if (teleport) {
	    WorldTasksManager.schedule(new WorldTask() {

		@Override
		public void run() {
		    player.getControlerManager().startControler("SorceressGarden");
		}
	    }, 4);
	}
    }

    @Override
    public void start() {

    }

    @Override
    public boolean login() {
	return false;
    }

    @Override
    public boolean logout() {
	return false;
    }

    @Override
    public boolean sendDeath() {
	removeControler();
	return true;
    }

    @Override
    public boolean processObjectClick1(WorldObject object) {
	if (object.getId() == 21764) {
	    player.lock();
	    player.setNextAnimation(new Animation(5796));
	    WorldTasksManager.schedule(new WorldTask() {

		@Override
		public void run() {
		    player.unlock();
		    Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3321, 3141, 0));
		}
	    }, 1);
	    return false;
	} else if (object.getId() == 21768) {
	    player.setNextAnimation(new Animation(2280));
	    player.getInventory().addItem(SqirkFruit.AUTUMM.getFruitId(), 1);
	    player.getSkills().addXp(Skills.FARMING, 50);
	    teleMiddle();
	} else if (object.getId() == 21769) {
	    player.setNextAnimation(new Animation(2280));
	    player.getInventory().addItem(SqirkFruit.WINTER.getFruitId(), 1);
	    player.getSkills().addXp(Skills.FARMING, 30);
	    teleMiddle();
	    return false;
	} else if (object.getId() == 21766) {
	    player.setNextAnimation(new Animation(2280));
	    player.getInventory().addItem(SqirkFruit.SUMMER.getFruitId(), 1);
	    player.getSkills().addXp(Skills.FARMING, 60);
	    teleMiddle();
	    return false;
	} else if (object.getId() == 21767) {
	    player.setNextAnimation(new Animation(2280));
	    player.getInventory().addItem(SqirkFruit.SPRING.getFruitId(), 1);
	    player.getSkills().addXp(Skills.FARMING, 40);
	    teleMiddle();
	    return false;
	} else if (object.getDefinitions().name.toLowerCase().contains("gate")) {
	    final Gate gate = Gate.forId(object.getId());
	    if (gate != null) {
		Gate.handleGates(player, gate.getObjectId(), gate.getLeveLReq(), inGardens(player) ? gate.getOutsideTile() : gate.getInsideTile(), gate.musicId);
		return false;
	    }
	} else if (object.getDefinitions().name.toLowerCase().equals("herbs")) {
	    player.setNextAnimation(new Animation(827));
	    Herbs[] herbs = HerbCleaning.Herbs.values();
	    player.getInventory().addItem(herbs[Utils.random(herbs.length)].getHerbId(), 1);
	    player.getInventory().addItem(herbs[Utils.random(herbs.length)].getHerbId(), 1);
	    player.getSkills().addXp(Skills.FARMING, SorceressGarden.inAutumnGarden(player) ? 50 : (SorceressGarden.inSpringGarden(player) ? 40 : (SorceressGarden.inSummerGarden(player) ? 60 : 30)));
	    teleMiddle();
	    return false;
	}
	return true;
    }

    public void teleMiddle() {
	player.lock();
	player.getPackets().sendGameMessage("An elemental force enamating from the garden teleports you away.");
	FadingScreen.fade(player, new Runnable() {
	    @Override
	    public void run() {
		player.setNextWorldTile(new WorldTile(2913, 5467, 0));
		player.lock(3);
	    }

	});
    }

    /**
     * Checks if the player is in any garden
     */
    public static boolean inGarden(WorldTile tile) {
	return ((tile.getX() >= 2880 && tile.getX() <= 2943) && (tile.getY() >= 5440 && tile.getY() <= 5503));
    }

    public static boolean inGardens(WorldTile tile) {
	return inWinterGarden(tile) || inAutumnGarden(tile) || inSpringGarden(tile) || inSummerGarden(tile);
    }

    /**
     * Checks if the player is at Winter Garden or not
     */
    public static boolean inWinterGarden(WorldTile tile) {
	return ((tile.getX() >= 2886 && tile.getX() <= 2902) && (tile.getY() >= 5464 && tile.getY() <= 5487));
    }

    /**
     * Checks if the player is at Spring Garden or not
     */
    public static boolean inSummerGarden(WorldTile tile) {
	return ((tile.getX() >= 2904 && tile.getX() <= 2927) && (tile.getY() >= 5481 && tile.getY() <= 5497));
    }

    /**
     * Checks if the player is at Summer Garden or not
     */
    public static boolean inSpringGarden(WorldTile tile) {
	return ((tile.getX() >= 2921 && tile.getX() <= 2937) && (tile.getY() >= 5456 && tile.getY() <= 5479));
    }

    /**
     * Checks if the player is at Autumn Garden or not
     */
    public static boolean inAutumnGarden(WorldTile tile) {
	return ((tile.getX() >= 2896 && tile.getX() <= 2919) && (tile.getY() >= 5446 && tile.getY() <= 5462));
    }

}