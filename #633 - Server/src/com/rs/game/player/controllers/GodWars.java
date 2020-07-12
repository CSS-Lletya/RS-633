package com.rs.game.player.controllers;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.Animation;
import com.rs.game.ForceMovement;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Smithing;
import com.rs.game.player.content.agility.Agility;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.net.decoders.handlers.ObjectHandler;
import com.rs.utils.Utils;

public class GodWars extends Controller {

	public static final WorldTile[] GODS = { new WorldTile(2863, 5357, 0),
			new WorldTile(2862, 5357, 0), // bandos
			new WorldTile(2835, 5295, 0), new WorldTile(2835, 5294, 0), // armadyl
			new WorldTile(2923, 5256, 0), new WorldTile(2923, 5257, 0), // saradomin
			new WorldTile(2925, 5332, 0), new WorldTile(2925, 5333, 0), // zamorak
	};
	private int[] killCount = new int[5];
	private long lastPrayerRecharge;

	@Override
	public void start() {
		sendInterfaces(0);
	}

	@Override
	public boolean logout() {
		setArguments(new Object[] { killCount, lastPrayerRecharge });
		return false; // so doesnt remove script
	}

	@Override
	public boolean login() {
		killCount = (int[]) this.getArguments()[0];
		if (getArguments().length == 2)
			lastPrayerRecharge = (long) this.getArguments()[1];
		sendInterfaces();
		sendZarosScript();
		refresh();
		return false; // so doesnt remove script
	}

	@Override
	public void sendInterfaces() {
		sendInterfaces(player.withinArea(2916, 5317, 2937, 5332) ? 2
				: inZamorakPrepare(player) ? 1 : 0);
	}

	private void sendZarosScript() {
		if (inZarosArea(player))
			player.getPackets().sendRunScript(1171);
	}

	private static boolean hasFullCerimonial(Player player) {
		int helmId = player.getEquipment().getHatId();
		int chestId = player.getEquipment().getChestId();
		int legsId = player.getEquipment().getLegsId();
		int bootsId = player.getEquipment().getBootsId();
		int glovesId = player.getEquipment().getGlovesId();
		if (helmId == -1 || chestId == -1 || legsId == -1 || bootsId == -1
				|| glovesId == -1)
			return false;
		return ItemDefinitions.getItemDefinitions(helmId).getName()
				.contains("Ancient ceremonial")
				&& ItemDefinitions.getItemDefinitions(chestId).getName()
						.contains("Ancient ceremonial")
				&& ItemDefinitions.getItemDefinitions(legsId).getName()
						.contains("Ancient ceremonial")
				&& ItemDefinitions.getItemDefinitions(bootsId).getName()
						.contains("Ancient ceremonial")
				&& ItemDefinitions.getItemDefinitions(glovesId).getName()
						.contains("Ancient ceremonial");
	}

	@Override
	public boolean processObjectClick1(final WorldObject object) {
		if (object.getId() == 57225) {
			player.getDialogueManager().startDialogue("NexEntrance");
			return false;
		} else if (object.getId() == 26287 || object.getId() == 26286
				|| object.getId() == 26288 || object.getId() == 26289) {
			if (lastPrayerRecharge >= Utils.currentTimeMillis()) {
				player.getPackets()
						.sendGameMessage(
								"You must wait a total of 10 minutes before being able to recharge your prayer points.");
				return false;
			} else if (player.getAttackedByDelay() >= Utils.currentTimeMillis()) {
				player.getPackets()
						.sendGameMessage(
								"You cannot recharge your prayer while engaged in combat.");
				return false;
			}
			player.getPrayer().restorePrayer(
					player.getSkills().getLevelForXp(Skills.PRAYER) * 10);
			player.setNextAnimation(new Animation(645));
			player.getPackets().sendGameMessage(
					"Your prayer points feel rejuvinated.");
			lastPrayerRecharge = 600000 + Utils.currentTimeMillis();
		} else if (object.getId() == 57264) {
			player.getDialogueManager().startDialogue("SimpleMessage",
					"KUS UMAK (PM Cjay0091 if you know what this means).");
			return false;
		} else if (object.getId() == 57258) {
			boolean withinBankArea = player.getX() >= 2900;
			boolean hasCerimonial = hasFullCerimonial(player);
			if (killCount[4] >= 40 || withinBankArea || hasCerimonial) {
				if (hasCerimonial && !withinBankArea)
					player.getPackets()
							.sendGameMessage(
									"The door recognises your familiarity with the area and allows you to pass through.");
				if (!withinBankArea) {
					if (killCount[4] >= 40)
						killCount[4] -= 40;
					refresh();
				}
				player.addWalkSteps(withinBankArea ? 2899 : 2900, 5203, -1,
						false);
			} else
				player.getPackets()
						.sendGameMessage(
								"You don't have enough kills to enter the lair of Zaros.");
			return false;
		} else if (object.getId() == 57234) {
			if (!Agility.hasLevel(player, 70))
				return false;
			boolean travelingEast = player.getX() < 2863;
			player.setNextAnimation(new Animation(1133));
			final WorldTile tile = new WorldTile(
					2863 + (travelingEast ? 0 : -3), 5219, 0);
			player.setNextForceMovement(new ForceMovement(tile, 1,
					travelingEast ? ForceMovement.EAST : ForceMovement.WEST));
			WorldTasksManager.schedule(new WorldTask() {

				@Override
				public void run() {
					player.setNextWorldTile(tile);
				}
			}, 1);
			return false;
		} else if (object.getId() == 75089) {
			boolean insideGate = player.getY() <= 5278;
			if (insideGate) {
				player.getDialogueManager()
						.startDialogue("SimpleMessage",
								"You pull out your key once more but the door doesn't respond.");
				return false;
			}
			if (player.getInventory().containsItem(20120, 1)) {
				player.getPackets().sendGameMessage(
						"You flash the key in front of the door");
				player.useStairs(1133, new WorldTile(2887, 5278, 0), 1, 2,
						"...and a strange force flings you in.");
			} else
				player.getDialogueManager()
						.startDialogue(
								"SimpleMessage",
								"You try to push the door open, but it wont budge.... It looks like there is some kind of key hole.");
			return false;
		} else if (object.getId() == 57256) {
			sendZarosScript();
			player.useStairs(-1, new WorldTile(2855, 5222, 0), 1, 2,
					"You climb down the stairs.");
			return false;
		} else if (object.getId() == 57260) {
			player.useStairs(-1, new WorldTile(2887, 5276, 0), 1, 2,
					"You climb up the stairs.");
			return false;
		} else if (object.getId() == 26293) {
			player.useStairs(828, new WorldTile(2913, 3741, 0), 1, 2);
			player.getControlerManager().forceStop();
		} else if (object.getId() == 26384) { // bandos
			if (!player.getInventory().containsItemToolBelt(Smithing.HAMMER)) {
				player.getPackets()
						.sendGameMessage(
								"You look at the door but find no knob, maybe it opens some other way.");
				return false;
			}
			if (player.getSkills().getLevel(Skills.STRENGTH) < 70) {
				player.getPackets()
						.sendGameMessage(
								"You attempt to hit the door, but realize that you are not yet experienced enough.");
				return false;
			}
			final boolean withinBandos = inBandosPrepare(player);
			if (!withinBandos)
				player.setNextAnimation(new Animation(7002));
			WorldTasksManager.schedule(new WorldTask() {

				@Override
				public void run() {
					ObjectHandler.handleDoor(player, object, 1000);
					player.addWalkSteps(withinBandos ? 2851 : 2850, 5334, -1,
							false);
				}
			}, withinBandos ? 0 : 1);
			return false;
		} else if (object.getId() == 26439) {
			if (!Agility.hasLevel(player, 70))
				return false;
			final boolean withinZamorak = inZamorakPrepare(player);
			final WorldTile tile = new WorldTile(2887, withinZamorak ? 5336
					: 5346, 0);
			player.lock();
			player.setNextWorldTile(object);
			WorldTasksManager.schedule(new WorldTask() {

				@Override
				public void run() {
					player.setNextAnimation(new Animation(17454));
					if (withinZamorak)
						sendInterfaces(0);
					else {
						sendInterfaces(1);
						player.getPrayer().drainPrayer();
					}
					player.setNextFaceWorldTile(tile);
				}
			}, 1);
			WorldTasksManager.schedule(new WorldTask() {

				@Override
				public void run() {
					player.unlock();
					player.setNextAnimation(new Animation(-1));
					player.setNextWorldTile(tile);
				}
			}, 5);
			return false;
		} else if (object.getId() == 75462) {
			if (object.getX() == 2912
					&& (object.getY() == 5298 || object.getY() == 5299))
				useAgilityStones(player, object,
						new WorldTile(2915, object.getY(), 0), 70, 15239, 7);
			else if (object.getX() == 2914
					&& (object.getY() == 5298 || object.getY() == 5299))
				useAgilityStones(player, object,
						new WorldTile(2911, object.getY(), 0), 70, 3378, 7);
			else if ((object.getX() == 2919 || object.getX() == 2920)
					&& object.getY() == 5278)
				useAgilityStones(player, object, new WorldTile(object.getX(),
						5275, 0), 70, 15239, 7);
			else if ((object.getX() == 2920 || object.getX() == 2919)
					&& object.getY() == 5276)
				useAgilityStones(player, object, new WorldTile(object.getX(),
						5279, 0), 70, 3378, 7);
		} else if (object.getId() >= 26425 && object.getId() <= 26428) {
			int index = object.getId() - 26425;
			boolean returning = player.withinArea(2819, 5295, 2839, 5309)
					|| player.withinArea(2863, 5352, 2878, 5375)
					|| player.withinArea(2916, 5317, 2937, 5332)
					|| player.withinArea(2915, 5242, 2931, 5256);
			int requiredKc = player.isDonator() ? 10 : 15;
			if (returning || killCount[index] >= requiredKc) {
				if (returning && object.getId() == 26428)
					sendInterfaces(1);
				else if (returning)
					sendInterfaces(0);
				else if (object.getId() == 26428)
					sendInterfaces(2);
				WorldTile tile = GODS[returning ? (index * 2) + 1 : (index * 2)];
				player.addWalkSteps(tile.getX(), tile.getY(), -1, false);
				if (!returning) {
					killCount[index] -= requiredKc;
					refresh();
				}
			} else
				player.getPackets()
						.sendGameMessage(
								"You don't have enough kills to enter the lair of the gods.");
			return false;
		}
		return true;
	}

	@Override
	public boolean processObjectClick2(WorldObject object) {
		if (object.getId() == 26287 || object.getId() == 26286
				|| object.getId() == 26288 || object.getId() == 26289) {
			int index = object.getId() == 26289 ? 0
					: object.getId() == 26286 ? 3 : object.getId() == 26287 ? 2
							: 1;
			player.getPackets()
					.sendGameMessage(
							"The god's pitty you and allow you to leave the encampment.");
			player.useStairs(-1, GODS[(index * 2) + 1], 1, 2);
			return false;
		}
		return true;
	}

	public void incrementKillCount(int index) {
		killCount[index]++;
		refresh();
	}

	public void resetKillCount(int index) {
		killCount[index] = 0;
		refresh();
	}

	public void refresh() {
		player.getVarsManager().sendVarBit(3939, killCount[1]); // arma
		player.getVarsManager().sendVarBit(3941, killCount[0]); // bando
		player.getVarsManager().sendVarBit(3938, killCount[2]);// sara
		player.getVarsManager().sendVarBit(3942, killCount[3]);// zamy
		player.getVarsManager().sendVarBit(8725, killCount[4]);
	}

	public static void useAgilityStones(final Player player,
			final WorldObject object, final WorldTile tile, int levelRequired,
			final int emote, final int delay) {
		if (!Agility.hasLevel(player, levelRequired))
			return;
		player.faceObject(object);
		player.addWalkSteps(object.getX(), object.getY());
		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				player.useStairs(emote, tile, delay, delay + 1);
			}
		}, 1);
	}

	private static final int[] INTERFACES = new int[] { 601, 599, 598 };

	public void sendInterfaces(int interfaceIndex) {
		player.getInterfaceManager().setOverlay(INTERFACES[interfaceIndex],
				true);
		refresh();
	}

	public static boolean inZarosArea(Player player) {
		return player.withinArea(2843, 5184, 2944, 5228);
	}

	@Override
	public boolean sendDeath() {
		player.getControlerManager().forceStop();
		return true;
	}

	@Override
	public void magicTeleported(int type) {
		player.getControlerManager().forceStop();
	}

	@Override
	public void forceClose() {
		player.getInterfaceManager().removeOverlay(true);
	}

	public static boolean inArmadylPrepare(Player player) {
		return player.withinArea(2866, 5268, 2874, 5273);
	}

	public static boolean inBandosPrepare(Player player) {
		return player.withinArea(2823, 5313, 2850, 5432);
	}

	public static boolean inZamorakPrepare(Player player) {
		return player.withinArea(2884, 5343, 2890, 5352);
	}

	public static void passGiantBoulder(Player player, WorldObject object,
			boolean liftBoulder) {
		if (player.getSkills().getLevel(
				liftBoulder ? Skills.STRENGTH : Skills.AGILITY) < 60) {
			player.getPackets().sendGameMessage(
					"You need a " + (liftBoulder ? "Agility" : "Strength")
							+ " of 60 in order to "
							+ (liftBoulder ? "lift" : "squeeze past")
							+ "this boulder.");
			return;
		}
		if (liftBoulder)
			World.sendObjectAnimation(object, new Animation(318));
		boolean isReturning = player.getY() >= 3709;
		int baseAnimation = liftBoulder ? 3725 : 3466;
		player.useStairs(isReturning ? baseAnimation-- : baseAnimation,
				new WorldTile(player.getX(), player.getY()
						+ (isReturning ? -4 : 4), 0), liftBoulder ? 10 : 5,
				liftBoulder ? 11 : 6, null, true);
	}
}
