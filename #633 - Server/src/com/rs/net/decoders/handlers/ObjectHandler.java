package com.rs.net.decoders.handlers;

import java.util.List;

import com.rs.Settings;
import com.rs.cache.loaders.ObjectDefinitions;
import com.rs.game.Animation;
import com.rs.game.ForceMovement;
import com.rs.game.ForceTalk;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.NewForceMovement;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.minigames.CastleWars;
import com.rs.game.minigames.Crucible;
import com.rs.game.minigames.FightPits;
import com.rs.game.minigames.PuroPuro;
import com.rs.game.minigames.WarriorsGuild;
import com.rs.game.minigames.pest.Lander;
import com.rs.game.npc.NPC;
import com.rs.game.npc.others.PolyporeCreature;
import com.rs.game.npc.others.TreeSpirit;
import com.rs.game.player.Equipment;
import com.rs.game.player.OwnedObjectManager;
import com.rs.game.player.Player;
import com.rs.game.player.QuestManager.Quests;
import com.rs.game.player.RouteEvent;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Bonfire;
import com.rs.game.player.actions.BoxAction.HunterEquipment;
import com.rs.game.player.actions.BoxAction.HunterNPC;
import com.rs.game.player.actions.Cooking;
import com.rs.game.player.actions.Cooking.Cookables;
import com.rs.game.player.actions.CowMilkingAction;
import com.rs.game.player.actions.PlayerCombat;
import com.rs.game.player.actions.Smelting.SmeltingBar;
import com.rs.game.player.actions.Smithing.ForgingBar;
import com.rs.game.player.actions.Smithing.ForgingInterface;
import com.rs.game.player.actions.WaterFilling;
import com.rs.game.player.actions.Woodcutting;
import com.rs.game.player.actions.Woodcutting.HatchetDefinitions;
import com.rs.game.player.actions.Woodcutting.TreeDefinitions;
import com.rs.game.player.actions.mining.EssenceMining;
import com.rs.game.player.actions.mining.EssenceMining.EssenceDefinitions;
import com.rs.game.player.actions.mining.JemMining;
import com.rs.game.player.actions.mining.Mining;
import com.rs.game.player.actions.mining.Mining.RockDefinitions;
import com.rs.game.player.actions.mining.MiningBase;
import com.rs.game.player.actions.runecrafting.SiphionActionNodes;
import com.rs.game.player.actions.thieving.Thieving;
import com.rs.game.player.content.AbbysObsticals;
import com.rs.game.player.content.Canoes;
import com.rs.game.player.content.CrystalChest;
import com.rs.game.player.content.DragonfireShieldCreating;
import com.rs.game.player.content.DwarfMultiCannon;
import com.rs.game.player.content.FairyRings;
import com.rs.game.player.content.GodswordCreating;
import com.rs.game.player.content.Hunter;
import com.rs.game.player.content.JewllerySmithing;
import com.rs.game.player.content.Magic;
import com.rs.game.player.content.PartyRoom;
import com.rs.game.player.content.Runecrafting;
import com.rs.game.player.content.SpiritTree;
import com.rs.game.player.content.SpiritshieldCreating;
import com.rs.game.player.content.Summoning;
import com.rs.game.player.content.WildernessObelisk;
import com.rs.game.player.content.agility.Agility;
import com.rs.game.player.content.agility.BarbarianOutpostAgility;
import com.rs.game.player.content.agility.GnomeAgility;
import com.rs.game.player.content.agility.WildernessAgility;
import com.rs.game.player.controllers.Falconry;
import com.rs.game.player.controllers.FightCaves;
import com.rs.game.player.controllers.FightKiln;
import com.rs.game.player.controllers.GodWars;
import com.rs.game.player.controllers.NomadsRequiem;
import com.rs.game.player.controllers.Wilderness;
import com.rs.game.player.dialogues.impl.MiningGuildDwarf;
import com.rs.game.player.dialogues.impl.SqirkFruitSqueeze;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.io.InputStream;
import com.rs.utils.Logger;
import com.rs.utils.PkRank;
import com.rs.utils.ShopsHandler;
import com.rs.utils.Utils;

public final class ObjectHandler {

	private ObjectHandler() {

	}

	public static void handleOption(final Player player, InputStream stream,
			int option) {
		if (!player.hasStarted() || !player.clientHasLoadedMapRegion()
				|| player.isDead())
			return;
		if (player.isLocked()
				|| player.getEmotesManager().getNextEmoteEnd() >= Utils
						.currentTimeMillis())
			return;
		boolean forceRun = stream.readUnsignedByte128() == 1;
		final int id = stream.readIntLE();
		int x = stream.readUnsignedShortLE();
		int y = stream.readUnsignedShortLE128();
		final WorldTile tile = new WorldTile(x, y, player.getPlane());
		final int regionId = tile.getRegionId();
		player.getPackets().sendMessage(0, "First option click packet! (Tile: " + tile.getX() + " " + tile.getY() + " " + regionId + ")", player);
		if (player.getMapRegionsIds().contains(regionId)) {
			System.out.println("no");
			return;
		}
			
		WorldObject mapObject = World.getObjectWithId(tile, id);
		if (mapObject == null || mapObject.getId() != id)
			return;
		final WorldObject object = mapObject;
		player.stopAll();
		if (forceRun)
			player.setRun(forceRun);
		switch (option) {
		case 1:
			handleOption1(player, object);
			break;
		case 2:
			handleOption2(player, object);
			break;
		case 3:
			handleOption3(player, object);
			break;
		case 4:
			handleOption4(player, object);
			break;
		case 5:
			handleOption5(player, object);
			break;
		case -1:
			handleOptionExamine(player, object);
			break;
		}
	}

	private static void handleOption1(final Player player,
			final WorldObject object) {
		final ObjectDefinitions objectDef = object.getDefinitions();
		final int id = object.getId();
		final int x = object.getX();
		final int y = object.getY();
		if (id == 67044) {
			player.setRouteEvent(new RouteEvent(object, new Runnable() {
				@Override
				public void run() {
					// unreachable objects exception
					player.faceObject(object);
					player.useStairs(-1, new WorldTile(2924, 3408, 0), 0, 1);
				}
			}, true));
			return;
		}
		if (id == 43529 || id == 69514 || (id >= 4550 && id <= 4559)) {
			player.setRouteEvent(new RouteEvent(object, new Runnable() {
				@Override
				public void run() {
					// unreachable agility objects exception
					player.faceObject(object);
					if (id == 43529) {
						GnomeAgility.preSwing(player, object);
					} else if (id == 69514) {
						GnomeAgility.runGnomeBoard(player, object);
					} else if (id >= 4550 && id <= 4559) {
						if (!Agility.hasLevel(player, 35))
							return;
						if (object.withinDistance(player, 2)) {
							if (!Agility.hasLevel(player, 35))
								return;
							player.setNextForceMovement(new NewForceMovement(
									player, 1, object, 2, Utils
											.getFaceDirection(
													object.getX()
															- player.getX(),
													object.getY()
															- player.getY())));
							player.useStairs(-1, object, 1, 2);
							player.setNextAnimation(new Animation(769));
							player.getSkills().addXp(Skills.AGILITY, 2);
						}
					}
				}
			}, true));
			return;
		}

		if (SiphionActionNodes.siphion(player, object))
			return;
		if (id == 75463) {
			if (object.withinDistance(player, 7)) {
				final boolean withinArmadyl = GodWars.inArmadylPrepare(player);
				final WorldTile tile = new WorldTile(2872, withinArmadyl ? 5280
						: 5272, 0);
				WorldTasksManager.schedule(new WorldTask() {

					int ticks = 0;

					@Override
					public void run() {
						ticks++;
						if (ticks == 1) {
							player.setNextAnimation(new Animation(827));
							player.setNextFaceWorldTile(tile);
							player.lock();
						} else if (ticks == 3)
							player.setNextAnimation(new Animation(385));
						else if (ticks == 5) {
							player.setNextAnimation(new Animation(16635));
						} else if (ticks == 6) {
							player.getAppearence().setHidden(true);
							World.sendProjectile(player, tile, 2699, 18, 18,
									20, 50, 175, 0);
							player.setNextForceMovement(new ForceMovement(
									player, 1, tile, 6,
									withinArmadyl ? ForceMovement.NORTH
											: ForceMovement.SOUTH));
						} else if (ticks == 9) {
							player.getAppearence().setHidden(false);
							player.setNextAnimation(new Animation(16672));
							player.setNextWorldTile(tile);
							player.unlock();
							stop();
							return;
						}
					}
				}, 0, 1);
			}
			return;
		} else if (object.getId() == 5949) {
			final boolean isSouth = player.getY() > 9553;
			player.getPackets().sendGameMessage(
					"You leap across with a mighty leap!");
			WorldTasksManager.schedule(new WorldTask() {
				int ticks = 0;

				@Override
				public void run() {
					ticks++;
					int direction = isSouth ? NewForceMovement.SOUTH
							: NewForceMovement.NORTH;
					WorldTile tile = new WorldTile(3221, isSouth ? 9552 : 9556,
							0);
					if (ticks == 1) {
						player.setNextForceMovement(new ForceMovement(player,
								1, object, 2, direction));
						player.setNextAnimation(new Animation(769));
					} else if (ticks == 2) {
						player.useStairs(769, object, 0, 1);
					} else if (ticks == 3) {
						player.setNextAnimation(new Animation(769));
						player.setNextForceMovement(new ForceMovement(player,
								1, tile, 2, direction));
					} else if (ticks == 4) {
						player.useStairs(-1, tile, 0, 1);
						stop();
						return;
					}
				}
			}, 0, 1);
			return;
		}
		player.setRouteEvent(new RouteEvent(object, new Runnable() {
			@Override
			public void run() {
				player.stopAll();
				player.faceObject(object);
				if (!player.getControlerManager().processObjectClick1(object))
					return;
				if (CastleWars.handleObjects(player, id))
					return;
				if (player.getFarmingManager().isFarming(id, null, 1))
					return;
				if (object.getId() == 19205)
					Hunter.createLoggedObject(player, object, true);
				HunterNPC hunterNpc = HunterNPC.forObjectId(id);
				if (hunterNpc != null) {
					if (OwnedObjectManager.removeObject(player, object)) {
						player.setNextAnimation(hunterNpc.getEquipment()
								.getPickUpAnimation());
						for (Item item : hunterNpc.getItems())
							player.getInventory().addItem(item);
						player.getInventory().addItem(
								hunterNpc.getEquipment().getId(), 1);
						player.getSkills().addXp(Skills.HUNTER,
								hunterNpc.getXp());
					} else {
						player.getPackets().sendGameMessage(
								"This isn't your trap.");
					}
				} else if (id == HunterEquipment.BOX.getObjectId()
						|| id == 19192) {
					if (OwnedObjectManager.removeObject(player, object)) {
						player.setNextAnimation(new Animation(5208));
						player.getInventory().addItem(
								HunterEquipment.BOX.getId(), 1);
					} else
						player.getPackets().sendGameMessage(
								"This isn't your trap.");
				} else if (id == HunterEquipment.BRID_SNARE.getObjectId()
						|| id == 19174) {
					if (OwnedObjectManager.removeObject(player, object)) {
						player.setNextAnimation(new Animation(5207));
						player.getInventory().addItem(
								HunterEquipment.BRID_SNARE.getId(), 1);
					} else
						player.getPackets().sendGameMessage(
								"This isn't your trap.");
				} else if (id == 77461) {
					player.getPackets()
							.sendGameMessage(
									"Looks like you need special gloves to make this jump.");
					return;
				} else if (id == 2350
						&& (object.getX() == 3352 && object.getY() == 3417 && object
								.getPlane() == 0))
					player.useStairs(832, new WorldTile(3177, 5731, 0), 1, 2);
				// entrana dungeon
				else if (id == 2408 && x == 2820 && y == 3374)
					player.useStairs(828, new WorldTile(2829, 9773, 0), 1, 2);
				else if (id == 2407)
					player.useStairs(-1, new WorldTile(2453, 4476, 0), 0, 1);
				else if (id >= 65616 && id <= 65622)
					WildernessObelisk.activateObelisk(id, player);
				// polypore dungon
				else if (id == 64125) {
					int value = player.getVarsManager().getBitValue(10232);
					if (value == 7)
						return;
					player.lock(2);
					player.setNextAnimation(new Animation(15460));
					player.getInventory().addItem(22445, 1);
					if (value == 0) {
						WorldTasksManager.schedule(new WorldTask() {

							@Override
							public void run() {
								int value = player.getVarsManager()
										.getBitValue(10232);
								player.getVarsManager().sendVarBit(10232,
										value - 1);
								if (value == 1)
									stop();
							}
						}, 9, 9);
					}
					player.getVarsManager().sendVarBit(10232, value + 1);
				} else if (id == 64360 && x == 4629 && y == 5453)
					PolyporeCreature.useStairs(player, new WorldTile(4629,
							5451, 2), true);
				else if (id == 64361 && x == 4629 && y == 5452)
					PolyporeCreature.useStairs(player, new WorldTile(4629,
							5454, 3), false);
				else if (id == 64359 && x == 4632 && y == 5443)
					PolyporeCreature.useStairs(player, new WorldTile(4632,
							5443, 1), true);
				else if (id == 64361 && x == 4632 && y == 5442)
					PolyporeCreature.useStairs(player, new WorldTile(4632,
							5444, 2), false);
				else if (id == 64359 && x == 4632 && y == 5409)
					PolyporeCreature.useStairs(player, new WorldTile(4632,
							5409, 2), true);
				else if (id == 64361 && x == 4633 && y == 5409)
					PolyporeCreature.useStairs(player, new WorldTile(4631,
							5409, 3), false);
				else if (id == 64359 && x == 4642 && y == 5389)
					PolyporeCreature.useStairs(player, new WorldTile(4642,
							5389, 1), true);
				else if (id == 64361 && x == 4643 && y == 5389)
					PolyporeCreature.useStairs(player, new WorldTile(4641,
							5389, 2), false);
				else if (id == 64359 && x == 4652 && y == 5388)
					PolyporeCreature.useStairs(player, new WorldTile(4652,
							5388, 0), true);
				else if (id == 64362 && x == 4652 && y == 5387)
					PolyporeCreature.useStairs(player, new WorldTile(4652,
							5389, 1), false);
				else if (id == 64359 && x == 4691 && y == 5469)
					PolyporeCreature.useStairs(player, new WorldTile(4691,
							5469, 2), true);
				else if (id == 64361 && x == 4691 && y == 5468)
					PolyporeCreature.useStairs(player, new WorldTile(4691,
							5470, 3), false);
				else if (id == 64359 && x == 4689 && y == 5479)
					PolyporeCreature.useStairs(player, new WorldTile(4689,
							5479, 1), true);
				else if (id == 64361 && x == 4689 && y == 5480)
					PolyporeCreature.useStairs(player, new WorldTile(4689,
							5478, 2), false);
				else if (id == 64359 && x == 4698 && y == 5459)
					PolyporeCreature.useStairs(player, new WorldTile(4698,
							5459, 2), true);
				else if (id == 64361 && x == 4699 && y == 5459)
					PolyporeCreature.useStairs(player, new WorldTile(4697,
							5459, 3), false);
				else if (id == 64359 && x == 4705 && y == 5460)
					PolyporeCreature.useStairs(player, new WorldTile(4704,
							5461, 1), true);
				else if (id == 64361 && x == 4705 && y == 5461)
					PolyporeCreature.useStairs(player, new WorldTile(4705,
							5459, 2), false);
				else if (id == 64359 && x == 4718 && y == 5467)
					PolyporeCreature.useStairs(player, new WorldTile(4718,
							5467, 0), true);
				else if (id == 64361 && x == 4718 && y == 5466)
					PolyporeCreature.useStairs(player, new WorldTile(4718,
							5468, 1), false);
				else if (id == 12290 || id == 12272) {
					if (id == 12290)
						player.setFavorPoints(1 - player.getFavorPoints());
					player.getActionManager()
							.setAction(
									new Woodcutting(object,
											TreeDefinitions.STRAIT_VINE));// start
																			// of
																			// jadinkos
				} else if (id == 12328) {
					player.useStairs(3527, new WorldTile(3012, 9275, 0), 5, 6);
					player.setNextForceMovement(new ForceMovement(player, 3,
							object, 2, ForceMovement.WEST));
					WorldTasksManager.schedule(new WorldTask() {

						@Override
						public void run() {
							player.setNextFaceWorldTile(new WorldTile(3012,
									9274, 0));
							player.setNextAnimation(new Animation(11043));
							player.getControlerManager().startControler(
									"JadinkoLair");
						}
					}, 4);
				} else if (id == 12277)
					player.getActionManager().setAction(
							new Woodcutting(object,
									TreeDefinitions.STRAIT_VINE_COLLECTABLE));// start
																				// of
																				// jadinkos
				else if (id == 12291)
					player.getActionManager().setAction(
							new Woodcutting(object,
									TreeDefinitions.MUTATED_VINE));
				else if (id == 12274)
					player.getActionManager()
							.setAction(
									new Woodcutting(object,
											TreeDefinitions.CURLY_VINE));
				else if (id == 12279)
					player.getActionManager().setAction(
							new Woodcutting(object,
									TreeDefinitions.CURLY_VINE_COLLECTABLE));
				else if (id == 26684 || id == 26685 || id == 26686) // poison
																	// waste
																	// cave
					player.useStairs(-1, new WorldTile(1989, 4174, 0), 1, 2,
							"You enter the murky cave...");
				else if (id == 26571 || id == 26572 || id == 26573
						|| id == 26574)
					player.useStairs(-1, new WorldTile(2321, 3100, 0), 1, 2);
				else if (id == 26560 && x == 2015 && y == 4255)
					player.getDialogueManager()
							.startDialogue(
									"SimpleMessage",
									"The room beyond the door is covred in gas, it is probably dangerous to go in there.");
				else if (id == 26519) {
					if (x == 1991 && y == 4175)
						player.useStairs(827, new WorldTile(1991, 4175, 0), 1,
								2);
					else if (x == 1998 && y == 4218)
						player.useStairs(827, new WorldTile(1998, 4218, 0), 1,
								2);
					else if (x == 2011 && y == 4218)
						player.useStairs(827, new WorldTile(2011, 4218, 0), 1,
								2);
					else
						player.useStairs(827, new WorldTile(x - 1, y, 0), 1, 2);
				} else if (id == 26518) {
					if (x == 1991 && y == 4175)
						player.useStairs(828, new WorldTile(1991, 4176, 1), 1,
								2);
					else if (x == 1998 && y == 4218)
						player.useStairs(828, new WorldTile(1998, 4219, 1), 1,
								2);
					else if (x == 2011 && y == 4218)
						player.useStairs(828, new WorldTile(2011, 4219, 1), 1,
								2);
					else
						player.useStairs(828, new WorldTile(x + 1, y, 1), 1, 2);
				} else if (id == 17270 || id == 17269)
					player.addWalkSteps(x, id == 17270 ? 9817 : 9814, -1, false);
				else if (id == 17239)
					player.getDialogueManager()
							.startDialogue("SimpleMessage",
									"You look into the bowl and a strange feeling goes amonst your body.");
				// wizards guild
				else if (id == 1722 && x == 2590 && y == 3089)
					player.useStairs(-1, new WorldTile(2590, 3092, 1), 0, 1);
				else if (id == 1723 && x == 2590 && y == 3090)
					player.useStairs(-1, new WorldTile(2590, 3088, 0), 0, 1);
				else if (id == 1722 && x == 2590 && y == 3084)
					player.useStairs(-1, new WorldTile(2590, 3087, 2), 0, 1);
				else if (id == 1723 && x == 2590 && y == 3085)
					player.useStairs(-1, new WorldTile(2591, 3083, 1), 0, 1);
				else if (id == 2158)
					player.useStairs(-1, new WorldTile(3104, 3163, 2), 0, 1);
				else if (id == 2157)
					player.useStairs(-1, new WorldTile(2908, 3332, 2), 0, 1);
				else if (id == 2156)
					player.useStairs(-1, new WorldTile(2702, 3405, 3), 0, 1);
				else if (id == 1754 && x == 2594 && y == 3085)
					player.useStairs(827, new WorldTile(2594, 9486, 0), 1, 2);
				else if (id == 1757 && x == 2594 && y == 9485)
					player.useStairs(828, new WorldTile(2594, 3086, 0), 1, 2);
				else if (id == 65203) {
					if (x == 3118 && y == 3570)
						player.useStairs(827, new WorldTile(3249, 5491, 0), 1,
								2);
					else if (x == 3058 && y == 3550)
						player.useStairs(827, new WorldTile(3184, 5471, 0), 1,
								2);
					else if (x == 3129 && y == 3587)
						player.useStairs(827, new WorldTile(3235, 5560, 0), 1,
								2);
					else if (x == 3176 && y == 3585)
						player.useStairs(827, new WorldTile(3290, 5539, 0), 1,
								2);
					else if (x == 3164 && y == 3561)
						player.useStairs(827, new WorldTile(3292, 5479, 0), 1,
								2);
				} else if (id == 28782) {
					if (x == 3183 && y == 5470)
						player.useStairs(828, new WorldTile(3057, 3551, 0), 1,
								2);
					else if (x == 3248 && y == 5490)
						player.useStairs(828, new WorldTile(3119, 3570, 0), 1,
								2);
					else if (x == 3234 && y == 5559)
						player.useStairs(828, new WorldTile(3130, 3586, 0), 1,
								2);
					else if (x == 3291 && y == 5538)
						player.useStairs(828, new WorldTile(3177, 3585, 0), 1,
								2);
					else if (x == 3292 && y == 5479)
						player.useStairs(828, new WorldTile(3165, 3562, 0), 1,
								2);
					player.getControlerManager().startControler("Wilderness");
				} else if (id == 77745) {
					player.addWalkSteps(object.getX(), object.getY(), -1, false);
					WorldTasksManager.schedule(new WorldTask() {

						@Override
						public void run() {
							if (getRepeatedTele(player, 3285, 5474, 0, 3286,
									5470, 0))
								return;
							else if (getRepeatedTele(player, 3302, 5469, 0,
									3290, 5463, 0))
								return;
							else if (getRepeatedTele(player, 3280, 5460, 0,
									3273, 5460, 0))
								return;
							else if (getRepeatedTele(player, 3299, 5450, 0,
									3296, 5455, 0))
								return;
							else if (getRepeatedTele(player, 3283, 5448, 0,
									3287, 5448, 0))
								return;
							else if (getRepeatedTele(player, 3260, 5491, 0,
									3266, 5446, 0))
								return;
							else if (getRepeatedTele(player, 3239, 5498, 0,
									3244, 5495, 0))
								return;
							else if (getRepeatedTele(player, 3238, 5507, 0,
									3232, 5501, 0))
								return;
							else if (getRepeatedTele(player, 3222, 5488, 0,
									3218, 5497, 0))
								return;
							else if (getRepeatedTele(player, 3222, 5474, 0,
									3224, 5479, 0))
								return;
							else if (getRepeatedTele(player, 3215, 5475, 0,
									3218, 5478, 0))
								return;
							else if (getRepeatedTele(player, 3210, 5477, 0,
									3208, 5471, 0))
								return;
							else if (getRepeatedTele(player, 3212, 5452, 0,
									3214, 5456, 0))
								return;
							else if (getRepeatedTele(player, 3235, 5457, 0,
									3229, 5454, 0))
								return;
							else if (getRepeatedTele(player, 3204, 5445, 0,
									3197, 5448, 0))
								return;
							else if (getRepeatedTele(player, 3191, 5495, 0,
									3194, 5490, 0))
								return;
							else if (getRepeatedTele(player, 3185, 5478, 0,
									3191, 5482, 0))
								return;
							else if (getRepeatedTele(player, 3186, 5472, 0,
									3192, 5472, 0))
								return;
							else if (getRepeatedTele(player, 3189, 5444, 0,
									3187, 5460, 0))
								return;
							else if (getRepeatedTele(player, 3178, 5460, 0,
									3168, 5456, 0))
								return;
							else if (getRepeatedTele(player, 3171, 5478, 0,
									3167, 5478, 0))
								return;
							else if (getRepeatedTele(player, 3171, 5473, 0,
									3167, 5471, 0))
								return;
							else if (getRepeatedTele(player, 3142, 5489, 0,
									3141, 5480, 0))
								return;
							else if (getRepeatedTele(player, 3142, 5462, 0,
									3154, 5462, 0))
								return;
							else if (getRepeatedTele(player, 3155, 5449, 0,
									3143, 5443, 0))
								return;
							else if (getRepeatedTele(player, 3303, 5477, 0,
									3299, 5484, 0))
								return;
							else if (getRepeatedTele(player, 3318, 5481, 0,
									3322, 5480, 0))
								return;
							else if (getRepeatedTele(player, 3307, 5496, 0,
									3317, 5496, 0))
								return;
							else if (getRepeatedTele(player, 3265, 5491, 0,
									3260, 5491, 0))
								return;
							else if (getRepeatedTele(player, 3297, 5510, 0,
									3300, 5514, 0))
								return;
							else if (getRepeatedTele(player, 3325, 5518, 0,
									3323, 5531, 0))
								return;
							else if (getRepeatedTele(player, 3321, 5554, 0,
									3315, 5552, 0))
								return;
							else if (getRepeatedTele(player, 3291, 5555, 0,
									3285, 5556, 0))
								return;
							else if (getRepeatedTele(player, 3285, 5508, 0,
									3280, 5501, 0))
								return;
							else if (getRepeatedTele(player, 3285, 5527, 0,
									3282, 5531, 0))
								return;
							else if (getRepeatedTele(player, 3289, 5532, 0,
									3288, 5536, 0))
								return;
							else if (getRepeatedTele(player, 3266, 5552, 0,
									3262, 5552, 0))
								return;
							else if (getRepeatedTele(player, 3268, 5534, 0,
									3261, 5536, 0))
								return;
							else if (getRepeatedTele(player, 3248, 5547, 0,
									3253, 5561, 0))
								return;
							else if (getRepeatedTele(player, 3256, 5561, 0,
									3252, 5543, 0))
								return;
							else if (getRepeatedTele(player, 3244, 5526, 0,
									3241, 5529, 0))
								return;
							else if (getRepeatedTele(player, 3230, 5547, 0,
									3226, 5553, 0))
								return;
							else if (getRepeatedTele(player, 3206, 5553, 0,
									3204, 5546, 0))
								return;
							else if (getRepeatedTele(player, 3211, 5533, 0,
									3214, 5533, 0))
								return;
							else if (getRepeatedTele(player, 3208, 5527, 0,
									3211, 5523, 0))
								return;
							else if (getRepeatedTele(player, 3201, 5531, 0,
									3197, 5529, 0))
								return;
							else if (getRepeatedTele(player, 3202, 5516, 0,
									3196, 5512, 0))
								return;
						}
					});
				} else if (id == 28779) {
					player.addWalkSteps(object.getX(), object.getY(), -1, false);
					WorldTasksManager.schedule(new WorldTask() {

						@Override
						public void run() {
							if (getRepeatedTele(player, 3197, 5529, 0, 3201,
									5531, 0))
								return;
							else if (getRepeatedTele(player, 3165, 5515, 0,
									3173, 5530, 0))
								return;
							else if (getRepeatedTele(player, 3156, 5523, 0,
									3152, 5520, 0))
								return;
							else if (getRepeatedTele(player, 3148, 5533, 0,
									3153, 5537, 0))
								return;
							else if (getRepeatedTele(player, 3143, 5535, 0,
									3147, 5541, 0))
								return;
							else if (getRepeatedTele(player, 3158, 5561, 0,
									3162, 5557, 0))
								return;
							else if (getRepeatedTele(player, 3162, 5545, 0,
									3166, 5553, 0))
								return;
							else if (getRepeatedTele(player, 3168, 5541, 0,
									3171, 5542, 0))
								return;
							else if (getRepeatedTele(player, 3190, 5549, 0,
									3190, 5554, 0))
								return;
							else if (getRepeatedTele(player, 3180, 5557, 0,
									3174, 5558, 0))
								return;
							else if (getRepeatedTele(player, 3190, 5519, 0,
									3190, 5515, 0))
								return;
							else if (getRepeatedTele(player, 3185, 5518, 0,
									3181, 5517, 0))
								return;
							else if (getRepeatedTele(player, 3196, 5512, 0,
									3202, 5516, 0))
								return;
						}
					});
				} else if (id == 1600 || id == 1601) {
					if (player.getSkills().getLevel(Skills.MAGIC) < 66) {
						player.getDialogueManager()
								.startDialogue("SimpleNPCMessage", 13,
										"Sorry, but you need level 66 Magic to enter here.");
						return;
					}
					player.lock(1);
					player.addWalkSteps(player.getX() == x ? x - 1 : x,
							object.getY(), 1, false);
				}
				// heroes guild
				else if (id == 2624 || id == 2625) {
					if (!player.getQuestManager().completedQuest(
							Quests.HEROES_QUEST)) {
						player.getPackets()
								.sendGameMessage(
										"Please come back after you have Heroes' Quest quest requiriments.");
						return;
					}
					player.lock(1);
					player.addWalkSteps(player.getX() == x ? x - 1 : x,
							object.getY(), 1, false);
				} else if (id == 67346 && x == 2908 && y == 3512)
					player.useStairs(-1, new WorldTile(2912, 3514, 2), 0, 1);
				else if (id == 67694 && x == 2911 && y == 3513)
					player.useStairs(-1, new WorldTile(2907, 3514, 1), 0, 1);
				else if (id == 67690 && x == 2905 && y == 3516)
					player.useStairs(-1, new WorldTile(2893, 9907, 0), 0, 1);
				else if (id == 67691 && x == 2892 && y == 9907)
					player.useStairs(-1, new WorldTile(2906, 3516, 0), 0, 1);
				else if (id == 15653) {
					if (World.isSpawnedObject(object)
							|| !WarriorsGuild.canEnter(player))
						return;
					player.lock(2);
					WorldObject opened = new WorldObject(object.getId(), object
							.getType(), object.getRotation() - 1,
							object.getX(), object.getY(), object.getPlane());
					World.spawnObjectTemporary(opened, 600);
					player.addWalkSteps(object.getX() - 1, player.getY(), 2,
							false);
				}
				// tarns lair
				else if (id == 20573 && x == 3149 && y == 4663)
					player.getControlerManager().startControler(
							"TerrorDogsTarnsLairController");
				else if (id == 4918 && x == 3445 && y == 3236)
					player.useStairs(4853, new WorldTile(
							player.getX() == 3446 ? 3444 : 3446, object.getY(),
							0), 2, 3);
				else if (id == 12776)
					player.useStairs(4853, new WorldTile(
							player.getX() == 3474 ? 3473 : 3474, object.getY(),
							0), 2, 3);
				else if (id == 17757 || id == 17760)
					player.useStairs(4853,
							new WorldTile(object.getX(),
									object.getY() == player.getY() ? 3243
											: 3244, 0), 2, 3);
				else if (id == 20979)
					player.useStairs(-1, new WorldTile(3149, 4666, 0), 0, 1);
				else if (id == 4913 && x == 3440 && y == 3232)
					player.useStairs(-1, new WorldTile(3436, 9637, 0), 0, 1);
				else if (id == 4920 && x == 3437 && y == 9637)
					player.useStairs(-1, new WorldTile(3441, 3232, 0), 0, 1);
				else if (id == 4914 && x == 3430 && y == 3233)
					player.useStairs(-1, new WorldTile(3405, 9631, 0), 0, 1);
				else if (id == 4921 && x == 3404 && y == 9631)
					player.useStairs(-1, new WorldTile(3429, 3233, 0), 0, 1);
				else if (id == 20524 && x == 3408 && y == 9623)
					player.useStairs(-1, new WorldTile(3428, 3225, 0), 0, 1);
				else if (id == 4915 && x == 3429 && y == 3225)
					player.useStairs(-1, new WorldTile(3409, 9623, 0), 0, 1);
				else if (id == 28515)
					player.useStairs(4853, new WorldTile(3420, 2803, 1), 2, 3);
				// scabaras florest
				else if (id == 28515)
					player.useStairs(4853, new WorldTile(3420, 2803, 1), 2, 3);
				else if (id == 28516)
					player.useStairs(4853, new WorldTile(3420, 2801, 0), 2, 3);
				// legends guild
				else if (id == 41435 && x == 2732 && y == 3377)
					player.useStairs(-1, new WorldTile(2732, 3380, 1), 0, 1);
				else if (id == 41436 && x == 2732 && y == 3378)
					player.useStairs(-1, new WorldTile(2732, 3376, 0), 0, 1);
				else if (id == 41425 && x == 2724 && y == 3374)
					player.useStairs(-1, new WorldTile(2720, 9775, 0), 0, 1);
				else if (id == 32048 && x == 2717 && y == 9773)
					player.useStairs(-1, new WorldTile(2723, 3375, 0), 0, 1);
				else if (id == 41449 || id == 66449)
					player.getBank().openBank();
				else if (id == 2938) { // recharge combat bracelet + skill
					// necklackes
					for (Item item : player.getInventory().getItems()
							.getItems()) {
						if (item == null)
							continue;
						if (item.getId() >= 11120 && item.getId() <= 11126
								&& item.getId() % 2 == 0)
							item.setId(11118);
						else if (item.getId() >= 11107 && item.getId() <= 11113
								&& item.getId() % 2 != 0)
							item.setId(11105);
					}
					player.getInventory().refresh();
					player.getDialogueManager()
							.startDialogue(
									"ItemMessage",
									"Your combat bracelet and skill necklace have all been recharged.",
									11105);
				} else if (id == 2896 || id == 2897) {
					player.lock(1);
					player.addWalkSteps(object.getX(),
							player.getY() == y ? y + 1 : y, 1, false);
				} else if (id == 2391 || id == 2392) {
					if (!player.getQuestManager().completedQuest(
							Quests.LEGENDS_QUEST)) {
						player.getPackets()
								.sendGameMessage(
										"Please come back after you have Legends' Quest quest requiriments.");
						return;
					}
					player.lock(1);
					player.addWalkSteps(object.getX(),
							player.getY() == y ? y + 1 : y, 1, false);
					if (player.getY() == y) {
						List<Integer> indexes = World.getRegion(10804)
								.getNPCsIndexes();
						if (indexes != null) {
							for (Integer index : indexes) {
								NPC npc = World.getNPCs().get(index);
								if (npc == null
										|| (npc.getId() != 398 && npc.getId() != 399))
									continue;
								npc.setNextForceTalk(new ForceTalk(
										"Legends' guild member approaching!"));
							}
						}
					}
				}
				// start of death platue
				else if (id == 34877 || id == 34878 || id == 9303 || id == 9304
						|| id == 9305 || id == 9306) {
					if (!Agility.hasLevel(player, 61))
						return;
					WorldTasksManager.schedule(new WorldTask() {

						@Override
						public void run() {
							boolean isGoingDown = id == 34877 ? player.getY() >= 3620
									: id == 34878 ? player.getY() >= 9587
											: id == 9303 ? player.getX() >= 2856
													: id == 9306 ? player
															.getX() <= 2909
															: id == 9305 ? player
																	.getX() <= 2894
																	: player.getY() >= 3662;
							if (isGoingDown)
								player.useStairs(
										3382,
										id == 34877 ? new WorldTile(2877, 3618,
												0)
												: id == 34878 ? new WorldTile(
														2875, 3594, 0)
														: id == 9303 ? new WorldTile(
																2854, 3664, 0)
																: id == 9306 ? new WorldTile(
																		2912,
																		3687, 0)
																		: id == 9305 ? new WorldTile(
																				2897,
																				3674,
																				0)
																				: new WorldTile(
																						2875,
																						3659,
																						0),
										6, 7, null, true);
							else
								player.useStairs(
										3381,
										id == 34877 ? new WorldTile(2876, 3622,
												0)
												: id == 34878 ? new WorldTile(
														2875, 3598, 0)
														: id == 9303 ? new WorldTile(
																2858, 3664, 0)
																: id == 9306 ? new WorldTile(
																		2908,
																		3686, 0)
																		: id == 9305 ? new WorldTile(
																				2893,
																				3673,
																				0)
																				: new WorldTile(
																						2874,
																						3663,
																						0),
										6, 7, null, true);
						}
					}, 1);
				} else if (id == 3803) {
					if (!Agility.hasLevel(player, 64))
						return;
					WorldTasksManager.schedule(new WorldTask() {

						@Override
						public void run() {
							boolean isGoingDown = player.getX() >= 2877;
							if (isGoingDown)
								player.useStairs(15239, new WorldTile(2875,
										3672, 0), 4, 5, null, true);
							else
								player.useStairs(3378, new WorldTile(2879,
										3673, 0), 4, 5, null, true);
						}
					}, 1);
				} else if (id == 3748 || id == 5847) {
					if (!Agility.hasLevel(player, 41))
						return;
					WorldTasksManager.schedule(new WorldTask() {

						@Override
						public void run() {
							boolean isFailed = Utils.getRandom(3) == 0;
							if (isFailed) {
								player.applyHit(new Hit(player, Utils.random(
										20, 50), HitLook.REGULAR_DAMAGE));
								player.getPackets().sendGameMessage(
										"You skid your knee across the rocks.");
							}
							boolean isTravelingEast = id == 5847 ? player
									.getX() >= 2760 : (x == 2817 && y == 3630)
									&& player.getX() >= 2817;
							boolean isTravelingNorth = isTravelingEast ? false
									: (x == 2846 && y == 3620) ? player.getY() >= 3620
											: player.getY() >= 3675;

							if (x == 2846 && y == 3620) {
								if (player.getEquipment().getBootsId() != 3105
										&& player.getEquipment().getBootsId() != 6145) {
									player.getDialogueManager()
											.startDialogue("SimpleMessage",
													"You need rock climbing boots in order to jump this ledge.");
									return;
								}
							}
							player.useStairs(3377, new WorldTile(
									isTravelingNorth ? player.getX()
											: (isTravelingEast ? -1 : 1) + x,
									(isTravelingEast
											|| (x == 2817 && y == 3630)
											|| id == 5847 ? 0
											: (isTravelingNorth ? -2 : 2))
											+ player.getY(), 0), 4, 5, null,
									true);
						}
					});
				} else if (id == 35391) {
					if (!Agility.hasLevel(player, 41))
						return;
					player.addWalkSteps(x, y);
					WorldTasksManager.schedule(new WorldTask() {

						@Override
						public void run() {
							boolean isTravelingWest = (x == 2834 && y == 3626) ? player
									.getX() >= 2834 : player.getX() >= 2900;
							player.useStairs(3303, new WorldTile(
									(isTravelingWest ? -2 : 2) + player.getX(),
									player.getY(), 0), 4, 5, null, true);
						}
					});
				} else if (id == 34839 || id == 34836) {
					boolean firstDoor = x == 2912;
					boolean withinArea = firstDoor ? player.getX() > 2912
							: player.getY() < 3619;
					WorldObject opened = new WorldObject(object.getId(), object
							.getType(), object.getRotation() - 1,
							object.getX(), object.getY(), object.getPlane());
					World.spawnObjectTemporary(opened, 600);
					if (firstDoor)
						player.addWalkSteps(withinArea ? x : x + 1,
								player.getY(), 1, false);
					else
						player.addWalkSteps(player.getX(), withinArea ? y
								: y - 1, 1, false);
				} else if (id == 3758) {
					if (x == 2906 && y == 10017)
						player.useStairs(-1, new WorldTile(2911, 3636, 0), 1, 2);
					else if (x == 2906 && y == 10036)
						player.useStairs(-1, new WorldTile(2922, 3658, 0), 1, 2);
				} else if (id == 34395) {
					if (x == 2910 && y == 3637)
						player.useStairs(-1, new WorldTile(2907, 10019, 0), 1,
								2);
					else if (x == 2920 && y == 3654)
						player.useStairs(-1, new WorldTile(2907, 10035, 0), 1,
								2);
					else if (x == 2796 && y == 3614)
						player.useStairs(-1, new WorldTile(2808, 10002, 0), 1,
								2);
				} else if (id == 35390)
					GodWars.passGiantBoulder(player, object, true);
				// shanty pass
				else if (id == 76651 || id == 76652)
					player.getDialogueManager().startDialogue(
							"ShantyPassDangerSignD");
				else if (id == 12774) {
					player.lock(3);
					player.addWalkSteps(player.getX(),
							player.getY() <= object.getY() ? 3118 : 3115, 3,
							false);
					// stronghold of security
				} else if (id == 16154) // entrance
					player.useStairs(-1, new WorldTile(1859, 5243, 0), 0, 1);
				else if (id == 16148 || id == 16146) // stairs entrance up
					player.useStairs(828, new WorldTile(3081, 3421, 0), 1, 2,
							"You climb up the ladder to the surface.");
				else if (id == 16640 && object.getX() == 2330
						&& object.getY() == 10353)
					player.useStairs(828, new WorldTile(2141, 3944, 0), 1, 2);
				else if (id == 36306 && object.getX() == 2142
						&& object.getY() == 3944)
					player.useStairs(833, new WorldTile(2329, 10353, 2), 1, 2);
				else if (id == 16150) { // portal
					if (!player.getShosRewards()[0]) {
						player.getPackets()
								.sendGameMessage(
										"You can't use this portal without looting the rewards on this floor first.");
						return;
					}
					player.useStairs(-1, new WorldTile(1914, 5222, 0), 0, 1);
				} else if (id == 16149) // stairs down
					player.useStairs(828, new WorldTile(2042, 5245, 0), 1, 2,
							"You climb down the ladder to the next level.");
				else if (id == 16082) { // portal
					if (!player.getShosRewards()[1]) {
						player.getPackets()
								.sendGameMessage(
										"You can't use this portal without looting the rewards on this floor first.");
						return;
					}
					player.useStairs(-1, new WorldTile(2021, 5223, 0), 0, 1);
				} else if (id == 16080 || id == 16078) // stairs up
					player.useStairs(828, new WorldTile(1859, 5243, 0), 1, 2,
							"You climb up the ladder to the level above.");
				else if (id == 16081) // stairs down
					player.useStairs(828, new WorldTile(2123, 5252, 0), 1, 2,
							"You climb down the ladder to the next level.");
				else if (id == 16116) { // portal
					if (!player.getShosRewards()[2]) {
						player.getPackets()
								.sendGameMessage(
										"You can't use this portal without looting the rewards on this floor first.");
						return;
					}
					player.useStairs(-1, new WorldTile(2146, 5287, 0), 0, 1);
				} else if (id == 7143 || id == 7153)
					AbbysObsticals.clearRocks(player, object);
				else if (id == 7152 || id == 7144)
					AbbysObsticals.clearTendrills(player, object,
							new WorldTile(id == 7144 ? 3028 : 3051, 4824, 0));
				else if (id == 7150 || id == 7146)
					AbbysObsticals.clearEyes(player, object, new WorldTile(
							object.getX() == 3021 ? 3028 : 3050, 4839, 0));
				else if (id == 7147)
					AbbysObsticals.clearGap(player, object, new WorldTile(3030,
							4843, 0), false);
				else if (id == 7148)
					AbbysObsticals.clearGap(player, object, new WorldTile(3040,
							4845, 0), true);
				else if (id == 7149)
					AbbysObsticals.clearGap(player, object, new WorldTile(3048,
							4842, 0), false);
				else if (id == 7151)
					AbbysObsticals.burnGout(player, object, new WorldTile(3053,
							4831, 0));
				else if (id == 7145)
					AbbysObsticals.burnGout(player, object, new WorldTile(3024,
							4834, 0));
				else if (id == 7137)
					Runecrafting.enterWaterAltar(player);
				else if (id == 7139)
					Runecrafting.enterAirAltar(player);
				else if (id == 7140)
					Runecrafting.enterMindAltar(player);
				else if (id == 7131)
					Runecrafting.enterBodyAltar(player);
				else if (id == 7130)
					Runecrafting.enterEarthAltar(player);
				else if (id == 7129)
					Runecrafting.enterFireAltar(player);
				else if (id == 7133)
					Runecrafting.enterNatureAltar(player);
				else if (id == 7132)
					Runecrafting.enterCosmicAltar(player);
				else if (id == 7141)
					Runecrafting.enterBloodAltar(player);
				else if (id == 7134)
					Runecrafting.enterChoasAltar(player);
				else if (id == 7138)
					player.getPackets().sendGameMessage(
							"A strange power blocks your exit..");
				else if (id == 26341) {
					player.useStairs(827, new WorldTile(2882, 5311, 0), 2, 1,
							"You climb down the rope...");
					player.getControlerManager().startControler("GodWars");
				} else if (id == 7135) {
					boolean hasEquip = false;
					for (Item item : player.getInventory().getItems()
							.getItems()) {
						if (item == null)
							continue;
						if (Equipment.getItemSlot(item.getId()) != -1) {
							hasEquip = true;
							break;
						}
					}
					if (player.getEquipment().wearingArmour() || hasEquip) {
						player.getPackets()
								.sendGameMessage(
										"The monk notices that you tried to fool him. Deposit your armor near the deposite box to travel to Entrana.");
						return;
					}
					Runecrafting.enterLawAltar(player);
				} else if (id == 7136)
					Runecrafting.enterDeathAltar(player);
				else if (id == 2469)
					player.useStairs(-1, new WorldTile(3315, 3253, 0), 1, 2);
				else if (id == 2468)// leaving earth
					player.useStairs(-1, new WorldTile(3308, 3476, 0), 1, 2);
				else if (id == 2470)// leaving body
					player.useStairs(-1, new WorldTile(3056, 3443, 0), 1, 2);
				else if (id == 2466)// leaving mind
					player.useStairs(-1, new WorldTile(2985, 3512, 0), 1, 2);
				else if (id == 2465)// leaving air
					player.useStairs(-1, new WorldTile(3051, 3443, 0), 1, 2);
				else if (id == 2467)// leaving water
					player.useStairs(-1, new WorldTile(3188, 3162, 0), 1, 2);
				else if (id == 2473)// leaving nature
					player.useStairs(-1, new WorldTile(2872, 3020, 0), 1, 2);
				else if (id == 2475)// leaving death
					player.useStairs(-1, new WorldTile(1865, 4639, 0), 1, 2);
				else if (id == 2477)// leaving blood
					player.useStairs(-1, new WorldTile(3559, 9778, 0), 1, 2);
				else if (id == 2472)// leaving law
					player.useStairs(-1, new WorldTile(2857, 3378, 0), 1, 2);
				else if (id == 2474) {// leaving choas
					player.useStairs(-1, new WorldTile(3058, 3588, 0), 1, 2);
					player.getControlerManager().startControler("Wilderness");
				} else if (id == 2471)// leaving cosmic
					player.useStairs(-1, new WorldTile(2409, 4380, 0), 1, 2);
				else if (id == 16114 || id == 16112) // stairs up
					player.useStairs(828, new WorldTile(2042, 5245, 0), 1, 2,
							"You climb up the ladder to the level above.");
				else if (id == 16115) // stairs down
					player.useStairs(828, new WorldTile(2358, 5215, 0), 1, 2,
							"You climb down the ladder to the next level.");
				else if (id == 16050) { // portal
					if (!player.getShosRewards()[3]) {
						player.getPackets()
								.sendGameMessage(
										"You can't use this portal without looting the rewards on this floor first.");
						return;
					}
					player.useStairs(-1, new WorldTile(2341, 5219, 0), 0, 1);
				} else if (id == 16050 || id == 16048) // stairs up
					player.useStairs(828, new WorldTile(3081, 3421, 0), 1, 2,
							"You climb up the ladder, which seems to twist wind in all directions.");
				else if (id == 16123 || id == 16124 || id == 16065
						|| id == 16066 || id == 16089 || id == 16090
						|| id == 16043 || id == 16044) { // stronghold
					// doors
					player.lock(3);
					player.setNextAnimation(new Animation(4282));
					WorldTasksManager.schedule(new WorldTask() {
						@Override
						public void run() {
							WorldTile tile;
							switch (object.getRotation()) {
							case 0:
								tile = new WorldTile(object.getX() == player
										.getX() ? object.getX() - 1 : object
										.getX(), player.getY(), 0);
								break;
							case 1:
								tile = new WorldTile(player.getX(), object
										.getY() == player.getY() ? object
										.getY() + 1 : object.getY(), 0);
								break;
							case 2:
								tile = new WorldTile(object.getX() == player
										.getX() ? object.getX() + 1 : object
										.getX(), player.getY(), 0);
								break;
							case 3:
							default:
								tile = new WorldTile(player.getX(), object
										.getY() == player.getY() ? object
										.getY() - 1 : object.getY(), 0);
								break;
							}
							player.setNextWorldTile(tile);
							player.setNextAnimation(new Animation(4283));
							player.faceObject(object);
						}
					}, 0);
				} else if (id == 16135) {
					if (player.getShosRewards()[0]) {
						player.getPackets()
								.sendGameMessage(
										"You have already claimed your reward from this level.");
						return;
					}
					player.getDialogueManager().startDialogue(
							"StrongHoldOfSecurityRewards", 0);
				} else if (id == 16077) {
					if (player.getShosRewards()[1]) {
						player.getPackets()
								.sendGameMessage(
										"You have already claimed your reward from this level.");
						return;
					}
					player.getDialogueManager().startDialogue(
							"StrongHoldOfSecurityRewards", 1);
				} else if (id == 16118) {
					if (player.getShosRewards()[2]) {
						player.getPackets()
								.sendGameMessage(
										"You have already claimed your reward from this level.");
						return;
					}
					player.getDialogueManager().startDialogue(
							"StrongHoldOfSecurityRewards", 2);
				} else if (id == 16047)
					player.getDialogueManager().startDialogue(
							"StrongHoldOfSecurityRewards", 3);
				else if (id == 16152)
					player.getDialogueManager().startDialogue(
							"StrongholdSecurityDeadBody");
				else if (id == 23157)
					player.useStairs(-1, new WorldTile(2729, 3734, 0), 1, 2);
				else if (id == 492 && x == 2856 && y == 3168) // karamja
					// underground and
					// crandor
					player.useStairs(827, new WorldTile(2856, 9570, 0), 1, 2);
				else if (id == 1764 && x == 2856 && y == 9569)
					player.useStairs(828, new WorldTile(2855, 3169, 0), 1, 2);
				else if (id == 2606 && x == 2836 && y == 9600) {
					if (World.isSpawnedObject(object))
						return;
					player.lock(1);
					WorldObject opened = new WorldObject(object.getId(), object
							.getType(), object.getRotation() - 1,
							object.getX(), object.getY(), object.getPlane());
					World.spawnObjectTemporary(opened, 1200);
					player.addWalkSteps(2836, player.getY() == y ? y - 1 : y,
							1, false);
				} else if (id == 25154)
					player.useStairs(827, new WorldTile(2834, 9657, 0), 1, 2);
				else if (id == 25213 && x == 2833 && y == 9657)
					player.useStairs(828, new WorldTile(2834, 3258, 0), 1, 2);
				else if (id == 68134) // thzaar entrance
					player.useStairs(-1, new WorldTile(4667, 5059, 0), 0, 1);
				else if (id == 68135)
					player.useStairs(-1, new WorldTile(2845, 3170, 0), 0, 1);
				// alkarid east area,(abbey + desert wyverms)
				else if (id == 75882) {
					player.lock(3);
					player.addWalkSteps(player.getX() > object.getX() ? 3332
							: 3335, player.getY(), 3, false);
					// elemental workshop
				} else if (id == 26114 || id == 26115) {
					if (World.isSpawnedObject(object))
						return;
					if (!player.getQuestManager().completedQuest(
							Quests.ELEMENTAL_WORKSHOP_I)) {
						player.getPackets()
								.sendGameMessage(
										"Please come back after you have Elemental Workshop I quest requiriments.");
						return;
					}
					player.lock(1);
					World.spawnObjectTemporary(
							new WorldObject(object.getId(), object.getType(),
									object.getRotation() - 1, object.getX(),
									object.getY(), object.getPlane()), 1200);
					player.addWalkSteps(object.getX(),
							player.getY() == y ? y + 1 : y, 1, false);
				} else if (id == 3415 && x == 2710 && y == 3497)
					player.useStairs(-1, new WorldTile(2716, 9888, 0), 0, 1);
				else if (id == 3416 && x == 2714 && y == 9887)
					player.useStairs(-1, new WorldTile(2709, 3498, 0), 0, 1);
				else if (id == 34395 && object.getX() == 2796
						&& object.getY() == 3614)
					player.useStairs(-1, new WorldTile(2808, 10003, 0), 0, 1);
				else if (id == 77053 && object.getX() == 2809
						&& object.getY() == 10001)
					player.useStairs(-1, new WorldTile(2795, 3616, 0), 0, 1);
				else if (id == 21585)
					player.getPackets()
							.sendGameMessage(
									"The doors seem to be frozen shut. Perhaps there is another way to enter.");
				else if (id == 21584) {
					player.getPackets()
							.sendGameMessage(
									"The doors seem to be barricaded by a pile of rocks. You decide to enter anyways.");
					player.useStairs(-1, new WorldTile(2394, 10299, 1), 1, 2);
				} else if (id == 21598)
					player.useStairs(-1, new WorldTile(2402, 3887, 0), 1, 2);
				else if (id == 3413)
					ShopsHandler.openShop(player, 80);
				// canafis shortcutbehind bar
				else if (id == 5055 && x == 3495 && y == 3465)
					player.useStairs(827, new WorldTile(3477, 9845, 0), 1, 2);
				else if (id == 5054 && x == 3477 && y == 9846)
					player.useStairs(828, new WorldTile(3494, 3465, 0), 1, 2);
				else if (id == 5052) {
					if (World.isSpawnedObject(object))
						return;
					if (!player.getQuestManager().completedQuest(
							Quests.IN_SEARCH_OF_THE_MYREQUE)) {
						player.getPackets()
								.sendGameMessage(
										"Please come back after you have Elemental Workshop I quest requiriments.");
						return;
					}
					WorldObject opened = new WorldObject(object.getId(), object
							.getType(), object.getRotation() - 1,
							object.getX(), object.getY(), object.getPlane());
					World.spawnObjectTemporary(opened, 1200);
					player.lock(1);
					player.addWalkSteps(object.getX(),
							player.getY() == y ? y - 1 : y, 1, false);
				} else if (id == 30261 || id == 30262)
					player.useStairs(-1, new WorldTile(3491, 3411, 0), 0, 1);
				// mortayna obstacles
				else if (id == 5005 && x == 3502 && y == 3431)
					player.useStairs(828, new WorldTile(3502, 3425, 0), 1, 2);
				else if (id == 5005 && x == 3502 && y == 3426)
					player.useStairs(828, new WorldTile(3502, 3432, 0), 1, 2);
				// agarnia ice dungeon
				else if (id == 9472 && x == 3008 && y == 3150)
					player.useStairs(-1, new WorldTile(3009, 9550, 0), 0, 1);
				else if (id == 32015 && x == 3008 && y == 9550)
					player.useStairs(-1, new WorldTile(3009, 3150, 0), 0, 1);
				else if (id == 33173)
					player.useStairs(-1, new WorldTile(3056, 9555, 0), 0, 1);
				else if (id == 33174)
					player.useStairs(-1, new WorldTile(3056, 9562, 0), 0, 1);
				// Gnome Stronghold Brimstail cave
				else if (id == 5083)
					player.getDialogueManager().startDialogue("SaniBoch", true);
				else if (id == 77421)
					player.useStairs(-1, new WorldTile(2745, 3152, 0), 0, 1);
				else if (id == 17222 || id == 17223)
					player.useStairs(-1, new WorldTile(2402, 3419, 0), 0, 1);
				else if (id == 17209)
					player.useStairs(-1, new WorldTile(2408, 9812, 0), 0, 1);
				// The Tale of the Muspah cave
				else if (id == 42793 && x == 2737 && y == 3729)
					player.useStairs(
							-1,
							new WorldTile(
									player.getQuestManager().completedQuest(
											Quests.THE_TALE_OF_THE_MUSPAH) ? 3485
											: 3421, 5511, 0), 0, 1);
				else if (id == 42891)
					player.useStairs(-1, new WorldTile(2736, 3731, 0), 0, 1);
				else if (id == 52626 || id == 52627)
					player.addWalkSteps(player.getX(), 2937, -1, false);
				else if (id == 52628 || id == 52629)
					player.addWalkSteps(player.getX(), 2940, -1, false);
				else if (id == 52624 || id == 52625)
					player.addWalkSteps(3754, player.getY(), -1, false);
				else if (id == 52622 || id == 52623)
					player.addWalkSteps(3751, player.getY(), -1, false);
				else if (id == 42794)
					player.useStairs(-1,
							new WorldTile(object.getX(), object.getY() + 7, 0),
							0, 1);
				else if (id == 42795)
					player.useStairs(-1,
							new WorldTile(object.getX(), object.getY() - 6, 0),
							0, 1);
				else if (id == 48188)
					player.useStairs(-1, new WorldTile(3435, 5646, 0), 0, 1);
				else if (id == 48189)
					player.useStairs(-1, new WorldTile(3509, 5515, 0), 0, 1);
				else if (id == 15767)
					player.getDialogueManager().startDialogue("CaveyDavey");
				// slayer tower
				else if (id == 9319) {
					if (!Agility.hasLevel(player, x == 3422 && y == 3550 ? 61
							: 71))
						return;
					player.useStairs(
							828,
							new WorldTile(player.getX(), player.getY(), player
									.getPlane() + 1), 1, 2);
				} else if (id == 9320) {
					if (!Agility.hasLevel(player, 61))
						return;
					player.useStairs(
							827,
							new WorldTile(player.getX(), player.getY(), player
									.getPlane() - 1), 1, 2);
				} else if (object.getId() == 15791) {
					if (object.getX() == 3829)
						player.useStairs(-1, new WorldTile(3830, 9461, 0), 1, 2);
					if (object.getX() == 3814)
						player.useStairs(-1, new WorldTile(3815, 9461, 0), 1, 2);
					player.getControlerManager().startControler(
							"UnderGroundDungeon", false, true);
				} else if (object.getId() == 6898) {
					player.setNextAnimation(new Animation(10578));
					player.useStairs(-1, object, 1, 2);
					player.useStairs(10579, new WorldTile(3221, 9618, 0), 1, 2);
					player.getControlerManager().startControler(
							"UnderGroundDungeon", false, true);
					player.getPackets().sendGameMessage(
							"You squeeze through the hole.");
					return;
				} else if (id == 36002) {
					player.getControlerManager().startControler(
							"UnderGroundDungeon", true, false);
					player.useStairs(833, new WorldTile(3206, 9379, 0), 1, 2);
				} else if (id == 4493 && x == 3434 && y == 3537)
					player.useStairs(-1, new WorldTile(3433, 3538, 1), 0, 1);
				else if (id == 4494 && x == 3434 && y == 3537)
					player.useStairs(-1, new WorldTile(3438, 3538, 0), 0, 1);
				else if (id == 4495 && x == 3413 && y == 3540)
					player.useStairs(-1, new WorldTile(3417, 3541, 2), 0, 1);
				else if (id == 4496 && x == 3415 && y == 3540)
					player.useStairs(-1, new WorldTile(3412, 3541, 1), 0, 1);
				// Paterdomus underground
				else if (id == 30572 && x == 3405 && y == 3507)
					player.useStairs(827, new WorldTile(3405, 9906, 0), 1, 2);
				else if (id == 30575 && x == 3405 && y == 9907)
					player.useStairs(828, new WorldTile(3405, 3506, 0), 1, 2);
				else if (id == 3443)
					player.useStairs(-1, new WorldTile(3423, 3484, 0), 0, 1);
				else if (id == 30574 && x == 3422 && y == 3484)
					player.useStairs(827, new WorldTile(3440, 9887, 0), 1, 2);
				// artisian workshop stairs
				else if (id == 29392)
					player.useStairs(-1, new WorldTile(3061, 3335, 0), 0, 1);
				else if (id == 29385 || id == 29385)
					player.useStairs(-1, new WorldTile(3067, 9710, 0), 0, 1);
				else if (id == 29387)
					player.useStairs(-1, new WorldTile(3035, 9713, 0), 0, 1);
				else if (id == 29391)
					player.useStairs(-1, new WorldTile(3037, 3342, 0), 0, 1);
				else if (id == 29375) {
					final boolean isNorth = player.getY() > 9964;
					final WorldTile tile = new WorldTile(player.getX(), player
							.getY() + (isNorth ? -7 : 7), 0);
					player.setNextAnimation(new Animation(745));
					player.setNextForceMovement(new ForceMovement(player, 1,
							tile, 5, isNorth ? ForceMovement.SOUTH
									: ForceMovement.NORTH));
					WorldTasksManager.schedule(new WorldTask() {
						int ticks = 0;

						@Override
						public void run() {
							ticks++;
							if (ticks > 1)
								player.setNextAnimation(new Animation(744));
							if (ticks == 5) {
								player.setNextWorldTile(tile);
								stop();
								return;
							}
						}
					}, 0, 0);
				} else if (id == 44339) {
					if (!Agility.hasLevel(player, 81))
						return;
					boolean isEast = player.getX() > 2772;
					final WorldTile tile = new WorldTile(isEast ? 2768 : 2775,
							10002, 0);
					WorldTasksManager.schedule(new WorldTask() {

						int ticks = -1;

						@Override
						public void run() {
							ticks++;
							if (ticks == 0)
								player.setNextFaceWorldTile(object);
							else if (ticks == 1) {
								player.setNextAnimation(new Animation(10738));
								player.setNextForceMovement(new NewForceMovement(
										player, 0, tile, 5,
										Utils.getFaceDirection(object.getX()
												- player.getX(), object.getY()
												- player.getY())));
							} else if (ticks == 3)
								player.setNextWorldTile(tile);
							else if (ticks == 4) {
								player.getPackets().sendGameMessage(
										"Your feet skid as you land floor.");
								stop();
								return;
							}
						}
					}, 0, 0);
				} else if (id == 77052) {
					if (!Agility.hasLevel(player, 70))
						return;
					boolean isEast = player.getX() > 2734;
					final WorldTile tile = new WorldTile(isEast ? 2730 : 2735,
							10008, 0);
					WorldTasksManager.schedule(new WorldTask() {

						int ticks = -1;

						@Override
						public void run() {
							ticks++;
							if (ticks == 0)
								player.setNextFaceWorldTile(object);
							else if (ticks == 1)
								player.setNextAnimation(new Animation(17811));
							else if (ticks == 9)
								player.setNextWorldTile(tile);
							else if (ticks == 10) {
								stop();
								return;
							}
						}
					}, 0, 0);
				} else if (id == 9311 || id == 9312) {
					if (!Agility.hasLevel(player, 21))
						return;
					WorldTasksManager.schedule(new WorldTask() {

						int ticks = 0;

						@Override
						public void run() {
							boolean withinGE = id == 9312;
							WorldTile tile = withinGE ? new WorldTile(3139,
									3516, 0) : new WorldTile(3143, 3514, 0);
							player.lock();
							ticks++;
							if (ticks == 1) {
								player.setNextAnimation(new Animation(2589));
								player.setNextForceMovement(new ForceMovement(
										object, 1,
										withinGE ? ForceMovement.WEST
												: ForceMovement.EAST));
							} else if (ticks == 3) {
								player.setNextWorldTile(new WorldTile(3141,
										3515, 0));
								player.setNextAnimation(new Animation(2590));
							} else if (ticks == 5) {
								player.setNextAnimation(new Animation(2591));
								player.setNextWorldTile(tile);
							} else if (ticks == 6) {
								player.setNextWorldTile(new WorldTile(tile
										.getX() + (withinGE ? -1 : 1), tile
										.getY(), tile.getPlane()));
								player.unlock();
								stop();
							}
						}
					}, 0, 0);
				} else if (id == 2878 || id == 2879) {
					player.getDialogueManager()
							.startDialogue(
									"SimpleMessage",
									"You step into the pool of sparkling water. You feel the energy rush through your veins.");
					final boolean isLeaving = id == 2879;
					final WorldTile tile = isLeaving ? new WorldTile(2509,
							4687, 0) : new WorldTile(2542, 4720, 0);
					player.setNextForceMovement(new ForceMovement(player, 1,
							tile, 2, isLeaving ? ForceMovement.SOUTH
									: ForceMovement.NORTH));
					WorldTasksManager.schedule(new WorldTask() {

						@Override
						public void run() {
							player.setNextAnimation(new Animation(13842));
							WorldTasksManager.schedule(new WorldTask() {

								@Override
								public void run() {
									player.setNextAnimation(new Animation(-1));
									player.setNextWorldTile(isLeaving ? new WorldTile(
											2542, 4718, 0) : new WorldTile(
											2509, 4689, 0));
								}
							}, 2);
						}
					});
				} else if (id == 24991) {
					WorldTasksManager.schedule(new WorldTask() {

						@Override
						public void run() {
							player.getControlerManager().startControler(
									"PuroPuro");
						}
					}, 10);
					Magic.sendTeleportSpell(player, 6601, -1, 1118, -1, 0, 0,
							new WorldTile(2591, 4320, 0), 9, false,
							Magic.OBJECT_TELEPORT);
				} else if (id == 2873 || id == 2874 || id == 2875) {
					player.getPackets().sendGameMessage(
							"You kneel and begin to chant to "
									+ objectDef.name.replace("Statue of ", "")
									+ "...");
					player.setNextAnimation(new Animation(645));
					WorldTasksManager.schedule(new WorldTask() {

						@Override
						public void run() {
							player.getDialogueManager()
									.startDialogue(
											"SimpleMessage",
											"You feel a rush of energy charge through your veins. Suddenly a cape appears before you.");
							World.addGroundItem(new Item(id == 2873 ? 2412
									: id == 2874 ? 2414 : 2413), new WorldTile(
									object.getX(), object.getY() - 1, 0));
						}
					}, 3);
				} else if (id == 18050) {
					return;
				} else if (id == 77574 || id == 77573) {
					boolean back = id == 77573;
					player.lock(4);
					final WorldTile tile = back ? new WorldTile(2687, 9506, 0)
							: new WorldTile(2682, 9506, 0);
					final boolean isRun = player.isRunning();
					player.setRun(false);
					player.addWalkSteps(tile.getX(), tile.getY(), -1, false);
					WorldTasksManager.schedule(new WorldTask() {

						@Override
						public void run() {
							player.setRun(isRun);
						}
					}, 4);
				} else if (id == 77377 || id == 77379 || id == 77375
						|| id == 77373 || id == 77371) {
					final HatchetDefinitions hatchet = Woodcutting
							.getHatchet(player);
					if (hatchet == null) {
						player.getPackets()
								.sendGameMessage(
										"You dont have the required level to use that axe or you don't have a hatchet.");
						return;
					}
					player.lock();
					WorldTasksManager.schedule(new WorldTask() {

						@Override
						public void run() {
							player.setNextAnimation(new Animation(hatchet
									.getEmoteId()));
							if (Utils.getRandom(13 - hatchet.getAxeTime()) <= 3) {
								stop();
								WorldObject o = new WorldObject(object);
								o.setId(object.getId() - 1);
								World.spawnObjectTemporary(o, 10000);
								player.addWalkSteps(x, y, 1, false);
								player.unlock();
							}
						}
					}, 1, 1);
				} else if (id == 77506 || id == 77507) {
					player.useStairs(-1,
							new WorldTile(player.getX(), player.getY()
									+ (id == 77506 ? -9 : 9), id == 77506 ? 2
									: 0), 1, 2);
				} else if (id == 77508 || id == 77509) {
					player.useStairs(-1, id == 77508 ? new WorldTile(2643,
							9595, 2) : new WorldTile(2649, 9591, 0), 1, 2);
				} else if (id >= 77570 && id <= 77572) {
					player.lock(1);
					player.setNextAnimation(new Animation(741));
					player.setNextForceMovement(new NewForceMovement(player, 0,
							object, 1, Utils.getFaceDirection(object.getX()
									- player.getX(),
									object.getY() - player.getY())));
					WorldTasksManager.schedule(new WorldTask() {

						@Override
						public void run() {
							player.setNextWorldTile(object);
						}
					});
				} else if (id == 73681) {
					WorldTile dest = new WorldTile(player.getX() == 2595 ? 2598
							: 2595, 3608, 0);
					player.setNextForceMovement(new NewForceMovement(player, 1,
							dest, 2, Utils.getFaceDirection(dest.getX()
									- player.getX(),
									dest.getY() - player.getY())));
					player.useStairs(-1, dest, 1, 2);
					player.setNextAnimation(new Animation(769));
				} else if (id == 2406) {
					if (FairyRings.checkAll(player)) {
						player.useStairs(-1, new WorldTile(2452, 4473, 0), 1, 2);
						return;
					}
				} else if (id == 1) {

				} else if (id == 74867 && object.getX() == 2842
						&& object.getY() == 3424) {
					player.useStairs(833, new WorldTile(2842, 9823, 0), 1, 2);
				} else if (id == 74866 && object.getX() == 2842
						&& object.getY() == 9824) {
					player.useStairs(828, new WorldTile(2842, 3423, 0), 1, 2);
				} else if (id == 9294) {
					if (!Agility.hasLevel(player, 80))
						return;
					final boolean isRunning = player.getRun();
					final boolean isSouth = player.getY() > 9813;
					final WorldTile tile = isSouth ? new WorldTile(2878, 9812,
							0) : new WorldTile(2881, 9814, 0);
					player.setRun(true);
					player.addWalkSteps(isSouth ? 2881 : 2877, isSouth ? 9814
							: 9812);
					WorldTasksManager.schedule(new WorldTask() {
						int ticks = 0;

						@Override
						public void run() {
							ticks++;
							if (ticks == 2)
								player.setNextFaceWorldTile(object);
							else if (ticks == 3) {
								player.setNextAnimation(new Animation(1995));
								player.setNextForceMovement(new NewForceMovement(
										player, 0, tile, 4,
										Utils.getFaceDirection(object.getX()
												- player.getX(), object.getY()
												- player.getY())));
							} else if (ticks == 4)
								player.setNextAnimation(new Animation(1603));
							else if (ticks == 7) {
								player.setNextWorldTile(tile);
								player.setRun(isRunning);
								stop();
								return;
							}
						}
					}, 0, 0);
				} else if (id == 2333 || id == 2334 || id == 2335) {
					if (!Agility.hasLevel(player, 74))
						return;
					player.lock(2);
					player.setNextAnimation(new Animation(741));
					player.setNextForceMovement(new ForceMovement(object, 1,
							Utils.getMoveDirection(
									player.getX() - object.getX(),
									player.getY() - object.getY()) == 6 ? 0 : 2));
					WorldTasksManager.schedule(new WorldTask() {

						@Override
						public void run() {
							player.setNextWorldTile(object);
						}
					});
				} else if (id == 70794) {
					player.useStairs(-1, new WorldTile(1340, 6488, 0), 1, 2);
				} else if (id == 70795) {
					if (!Agility.hasLevel(player, 50))
						return;
					player.getDialogueManager().startDialogue("GrotwormLairD",
							true);
				} else if (id == 70812) {
					player.getDialogueManager().startDialogue("GrotwormLairD",
							false);
				} else if (id == 70799) {
					player.useStairs(-1, new WorldTile(1178, 6355, 0), 1, 2);
				} else if (id == 70796) {
					player.useStairs(-1, new WorldTile(1090, 6360, 0), 1, 2);
				} else if (id == 70798) {
					player.useStairs(-1, new WorldTile(1340, 6380, 0), 1, 2);
				} else if (id == 70797) {
					player.useStairs(-1, new WorldTile(1090, 6497, 0), 1, 2);
				} else if (id == 70792) {
					player.useStairs(-1, new WorldTile(1206, 6371, 0), 1, 2);
				} else if (id == 70793) {
					player.useStairs(-1, new WorldTile(2989, 3237, 0), 1, 2);
				} else if (id == 2353
						&& (object.getX() == 3177 && object.getY() == 5730 && object
								.getPlane() == 0))
					player.useStairs(828, new WorldTile(3353, 3416, 0), 1, 2);
				else if (id == 11554 || id == 11552)
					player.getPackets().sendGameMessage(
							"That rock is currently unavailable.");
				else if (id == 38279)
					player.getDialogueManager()
							.startDialogue("RunespanPortalD");
				else if (id == 31359) {
					player.useStairs(-1, new WorldTile(3360, 9352, 0), 1, 2);
					player.getControlerManager().startControler(
							"UnderGroundDungeon", true, true);
				} else if (id == 8929)
					player.useStairs(-1, new WorldTile(2442, 10147, 0), 1, 2);
				else if (id == 8966)
					player.useStairs(-1, new WorldTile(2523, 3739, 0), 1, 2);
				else if (id == 76219) {
					player.getPackets().sendGameMessage(
							"You search the shelves...");
					player.lock();
					WorldTasksManager.schedule(new WorldTask() {

						@Override
						public void run() {
							player.unlock();
							player.getPackets()
									.sendGameMessage(
											"...and among the strange paraphernalia, you find an empty beer glass.");
							player.getInventory().addItem(
									SqirkFruitSqueeze.BEER_GLASS, 1);
						}
					}, 2);
				} else if (id == 12163 || id == 12164 || id == 12165
						|| id == 12166) {
					if (player.getTemporaryAttributtes().get("canoe_shaped") != null
							&& (boolean) player.getTemporaryAttributtes().get(
									"canoe_shaped"))
						Canoes.openTravelInterface(player, id - 12163);
					else if (player.getTemporaryAttributtes().get(
							"canoe_chopped") != null
							&& (boolean) player.getTemporaryAttributtes().get(
									"canoe_chopped"))
						Canoes.openSelectionInterface(player);
					else
						Canoes.chopCanoeTree(player, id - 12163);
				} else if (id == 76499) {
					player.lock(1);
					player.addWalkSteps(player.getX(),
							player.getY() == 3164 ? 3163 : 3164, 1, false);
				} else if (id == 11195 || id == 11194 || id == 11364)
					player.getActionManager().setAction(new JemMining(object));
				else if (id == 2491 || id == 16684)
					player.getActionManager()
							.setAction(
									new EssenceMining(
											object,
											player.getSkills().getLevel(
													Skills.MINING) < 30 ? EssenceDefinitions.Rune_Essence
													: EssenceDefinitions.Pure_Essence));
				else if (id == 2478)
					Runecrafting.craftEssence(player, 556, 1, 5, false, 11, 2,
							22, 3, 34, 4, 44, 5, 55, 6, 66, 7, 77, 88, 9, 99,
							10);
				else if (id == 2479)
					Runecrafting.craftEssence(player, 558, 2, 5.5, false, 14,
							2, 28, 3, 42, 4, 56, 5, 70, 6, 84, 7, 98, 8);
				else if (id == 2480)
					Runecrafting.craftEssence(player, 555, 5, 6, false, 19, 2,
							38, 3, 57, 4, 76, 5, 95, 6);
				else if (id == 63093)
					player.useStairs(-1, new WorldTile(4620, 5458, 3), 0, 1);
				else if (id == 63094)
					player.useStairs(-1, new WorldTile(3410, 3329, 0), 0, 1);
				else if (id == 64294 || id == 64295) {
					if (!Agility.hasLevel(player, 73)) {
						player.getDialogueManager().startDialogue(
								"SimplePlayerMessage",
								"A fall would be a long way down.");
						return;
					}
					player.setNextAnimation(new Animation(6132));
					player.lock(3);
					final WorldTile toTile;
					if (id == 64295 && x == 4661 && y == 5476)
						toTile = new WorldTile(4658, 5476, 3);
					else if (id == 64295 && x == 4682 && y == 5476)
						toTile = new WorldTile(4685, 5476, 3);
					else if (id == 64294 && x == 4684 && y == 5476)
						toTile = new WorldTile(4681, 5476, 3);
					else
						toTile = new WorldTile(4662, 5476, 3);
					player.setNextForceMovement(new ForceMovement(player, 0,
							toTile, 2,
							object.getRotation() == 2 ? ForceMovement.EAST
									: ForceMovement.WEST));
					WorldTasksManager.schedule(new WorldTask() {

						@Override
						public void run() {
							player.setNextWorldTile(toTile);
						}
					}, 1);
				} else if (id == 2481)
					Runecrafting.craftEssence(player, 557, 9, 6.5, false, 26,
							2, 52, 3, 78, 4);
				else if (id == 2482)
					Runecrafting.craftEssence(player, 554, 14, 7, false, 35, 2,
							70, 3);
				else if (id == 2483)
					Runecrafting.craftEssence(player, 559, 20, 7.5, false, 46,
							2, 92, 3);
				else if (id == 2484)
					Runecrafting.craftEssence(player, 564, 27, 8, true, 59, 2);
				else if (id == 2487)
					Runecrafting
							.craftEssence(player, 562, 35, 8.5, true, 74, 2);
				else if (id == 17010)
					Runecrafting.craftEssence(player, 9075, 40, 8.7, true, 82,
							2);
				else if (id == 2486)
					Runecrafting.craftEssence(player, 561, 45, 9, true, 91, 2);
				else if (id == 2485)
					Runecrafting.craftEssence(player, 563, 50, 9.5, true);
				else if (id == 2488)
					Runecrafting.craftEssence(player, 560, 65, 10, true);
				else if (id == 30624)
					Runecrafting.craftEssence(player, 565, 77, 10.5, true);
				else if (id == 2452) {
					int hatId = player.getEquipment().getHatId();
					if (hatId == Runecrafting.AIR_TIARA
							|| hatId == Runecrafting.OMNI_TIARA
							|| player.getInventory().containsItem(1438, 1))
						Runecrafting.enterAirAltar(player);
				} else if (id == 2455) {
					int hatId = player.getEquipment().getHatId();
					if (hatId == Runecrafting.EARTH_TIARA
							|| hatId == Runecrafting.OMNI_TIARA
							|| player.getInventory().containsItem(1440, 1))
						Runecrafting.enterEarthAltar(player);
				} else if (id == 2456) {
					int hatId = player.getEquipment().getHatId();
					if (hatId == Runecrafting.FIRE_TIARA
							|| hatId == Runecrafting.OMNI_TIARA
							|| player.getInventory().containsItem(1442, 1))
						Runecrafting.enterFireAltar(player);
				} else if (id == 2454) {
					int hatId = player.getEquipment().getHatId();
					if (hatId == Runecrafting.WATER_TIARA
							|| hatId == Runecrafting.OMNI_TIARA
							|| player.getInventory().containsItem(1444, 1))
						Runecrafting.enterWaterAltar(player);
				} else if (id == 2457) {
					int hatId = player.getEquipment().getHatId();
					if (hatId == Runecrafting.BODY_TIARA
							|| hatId == Runecrafting.OMNI_TIARA
							|| player.getInventory().containsItem(1446, 1))
						Runecrafting.enterBodyAltar(player);
				} else if (id == 2453) {
					int hatId = player.getEquipment().getHatId();
					if (hatId == Runecrafting.MIND_TIARA
							|| hatId == Runecrafting.OMNI_TIARA
							|| player.getInventory().containsItem(1448, 1))
						Runecrafting.enterMindAltar(player);
				} else if (id == 47120) { // zaros altar
					// recharge if needed
					if (player.getPrayer().getPrayerpoints() < player
							.getSkills().getLevelForXp(Skills.PRAYER) * 10) {
						player.lock(12);
						player.setNextAnimation(new Animation(12563));
						player.getPrayer().setPrayerpoints(
								(int) ((player.getSkills().getLevelForXp(
										Skills.PRAYER) * 10) * 1.15));
						player.getPrayer().refreshPrayerPoints();
					}
					player.getDialogueManager().startDialogue("ZarosAltar");
				} else if (id == 19222)
					Falconry.beginFalconry(player);
				else if (id == 5947) {
					player.useStairs(540, new WorldTile(3170, 9571, 0), 8, 9);
					WorldTasksManager.schedule(new WorldTask() {

						@Override
						public void run() {
							player.getControlerManager().startControler(
									"UnderGroundDungeon", false, true);
							player.setNextAnimation(new Animation(-1));
						}
					}, 8);
					return;
				} else if (object.getId() == 6658) {
					player.useStairs(-1, new WorldTile(3226, 9542, 0), 1, 2);
					player.getControlerManager().startControler(
							"UnderGroundDungeon", false, true);
				} else if (object.getId() == 6673) {
					player.useStairs(-1,
							new WorldTile(
									player.getX() == 3239 ? player.getX() + 3
											: player.getX() - 3, player.getY(),
									player.getPlane()), 1, 2);
				} else if (id == 10137) {
					if (player.getX() == 2153 && player.getY() == 5108)
						player.useStairs(-1, new WorldTile(2150, 5109, 0), 1, 2);
					else if (player.getX() == 2130 && player.getY() == 5096)
						player.useStairs(-1, new WorldTile(2129, 5093, 0), 1, 2);
					else
						player.useStairs(-1, new WorldTile(player.getX() + 3,
								player.getY() - 1, 0), 1, 2);
				} else if (id == 10136) {
					if (player.getX() == 2150 && player.getY() == 5109)
						player.useStairs(-1, new WorldTile(2153, 5108, 1), 1, 2);
					else if (player.getX() == 2129 && player.getY() == 5093)
						player.useStairs(-1, new WorldTile(2130, 5096, 1), 1, 2);
					else
						player.useStairs(-1, new WorldTile(player.getX() - 3,
								player.getY() + 1, 1), 1, 2);
				} else if (id == 36786)
					player.getDialogueManager().startDialogue("Banker", 4907);
				else if (id == 42377 || id == 42378)
					player.getDialogueManager().startDialogue("Banker", 2759);
				else if (id == 42217 || id == 782 || id == 34752)
					player.getDialogueManager().startDialogue("Banker", 553);
				else if (id == 57437 || id == 12309 || id == 2693)
					player.getBank().openBank();
				else if (id == 9356)
					FightCaves.enterFightCaves(player);
				else if (id == 68107)
					FightKiln.enterFightKiln(player, false);
				else if (id == 68223)
					FightPits.enterLobby(player, false);
				else if (id == 9293) {
					if (player.getSkills().getLevel(Skills.AGILITY) < 70) {
						player.getPackets()
								.sendGameMessage(
										"You need an agility level of 70 to use this obstacle.",
										true);
						return;
					}
					int x = player.getX() == 2886 ? 2892 : 2886;
					WorldTasksManager.schedule(new WorldTask() {

						@Override
						public void run() {
							player.setNextAnimation(new Animation(10580));
						}
					}, 0);
					player.setNextForceMovement(new ForceMovement(
							new WorldTile(x, 9799, 0), 3,
							player.getX() == 2886 ? 1 : 3));
					player.useStairs(-1, new WorldTile(x, 9799, 0), 3, 4);
				} else if (id == 29370
						&& (object.getX() == 3150 || object.getX() == 3153)
						&& object.getY() == 9906) { // edgeville
					// dungeon
					// cut
					if (player.getSkills().getLevel(Skills.AGILITY) < 53) {
						player.getPackets()
								.sendGameMessage(
										"You need an agility level of 53 to use this obstacle.");
						return;
					}
					final boolean running = player.getRun();
					player.setRunHidden(false);
					player.lock(8);
					player.addWalkSteps(x == 3150 ? 3155 : 3149, 9906, -1,
							false);
					player.getPackets().sendGameMessage(
							"You pulled yourself through the pipes.", true);
					WorldTasksManager.schedule(new WorldTask() {
						boolean secondloop;

						@Override
						public void run() {
							if (!secondloop) {
								secondloop = true;
								player.getAppearence().setRenderEmote(295);
							} else {
								player.getAppearence().setRenderEmote(-1);
								player.setRunHidden(running);
								player.getSkills().addXp(Skills.AGILITY, 7);
								stop();
							}
						}
					}, 0, 5);
				}
				// start forinthry dungeon
				else if (id == 18341 && object.getX() == 3036
						&& object.getY() == 10172)
					player.useStairs(-1, new WorldTile(3039, 3765, 0), 0, 1);
				else if (id == 20599 && object.getX() == 3038
						&& object.getY() == 3761)
					player.useStairs(-1, new WorldTile(3037, 10171, 0), 0, 1);
				else if (id == 18342 && object.getX() == 3075
						&& object.getY() == 10057)
					player.useStairs(-1, new WorldTile(3071, 3649, 0), 0, 1);
				else if (id == 20600 && object.getX() == 3072
						&& object.getY() == 3648)
					player.useStairs(-1, new WorldTile(3077, 10058, 0), 0, 1);
				// nomads requiem
				else if (id == 18425
						&& !player.getQuestManager().completedQuest(
								Quests.NOMADS_REQUIEM))
					NomadsRequiem.enterNomadsRequiem(player);
				else if (id == 42219) {
					player.useStairs(-1, new WorldTile(1886, 3178, 0), 0, 1);
					if (player.getQuestManager().getQuestStage(
							Quests.NOMADS_REQUIEM) == -2) // for
						// now,
						// on
						// future
						// talk
						// with
						// npc
						// +
						// quest
						// reqs
						player.getQuestManager().setQuestStageAndRefresh(
								Quests.NOMADS_REQUIEM, 0);
				} else if (id == 8689)
					player.getActionManager().setAction(new CowMilkingAction());
				else if (id == 42220)
					player.useStairs(-1, new WorldTile(3082, 3475, 0), 0, 1);
				else if (id == 67043)
					player.useStairs(-1, new WorldTile(2219, 4532, 0), 0, 1);
				// start falador mininig
				else if (id == 30942 && object.getX() == 3019
						&& object.getY() == 3450)
					player.useStairs(828, new WorldTile(3020, 9850, 0), 1, 2);
				else if (id == 6226 && object.getX() == 3019
						&& object.getY() == 9850)
					player.useStairs(833, new WorldTile(3018, 3450, 0), 1, 2);
				else if (id == 31002
						&& player.getQuestManager().completedQuest(
								Quests.PERIL_OF_ICE_MONTAINS))
					player.useStairs(833, new WorldTile(2998, 3452, 0), 1, 2);
				else if (id == 31012
						&& player.getQuestManager().completedQuest(
								Quests.PERIL_OF_ICE_MONTAINS))
					player.useStairs(828, new WorldTile(2996, 9845, 0), 1, 2);
				else if (id == 30943 && object.getX() == 3059
						&& object.getY() == 9776)
					player.useStairs(-1, new WorldTile(3061, 3376, 0), 0, 1);
				else if (id == 30944 && object.getX() == 3059
						&& object.getY() == 3376)
					player.useStairs(-1, new WorldTile(3058, 9776, 0), 0, 1);
				else if (id == 2112 && object.getX() == 3046
						&& object.getY() == 9756) {
					if (player.getSkills().getLevelForXp(Skills.MINING) < 60) {
						player.getDialogueManager()
								.startDialogue(
										"SimpleNPCMessage",
										MiningGuildDwarf
												.getClosestDwarfID(player),
										"Sorry, but you need level 60 Mining to go in there.");
						return;
					}
					WorldObject openedDoor = new WorldObject(object.getId(),
							object.getType(), object.getRotation() - 1, object
									.getX(), object.getY() + 1, object
									.getPlane());
					if (World.removeObjectTemporary(object, 1200)) {
						World.spawnObjectTemporary(openedDoor, 1200);
						player.lock(2);
						player.stopAll();
						player.addWalkSteps(3046,
								player.getY() > object.getY() ? object.getY()
										: object.getY() + 1, -1, false);
					}
				} else if (id == 2113) {
					if (player.getSkills().getLevelForXp(Skills.MINING) < 60) {
						player.getDialogueManager()
								.startDialogue(
										"SimpleNPCMessage",
										MiningGuildDwarf
												.getClosestDwarfID(player),
										"Sorry, but you need level 60 Mining to go in there.");
						return;
					}
					player.useStairs(-1, new WorldTile(3021, 9739, 0), 0, 1);
				} else if (id == 6226 && object.getX() == 3019
						&& object.getY() == 9740)
					player.useStairs(828, new WorldTile(3019, 3341, 0), 1, 2);
				else if (id == 6226 && object.getX() == 3019
						&& object.getY() == 9738)
					player.useStairs(828, new WorldTile(3019, 3337, 0), 1, 2);
				else if (id == 6226 && object.getX() == 3018
						&& object.getY() == 9739)
					player.useStairs(828, new WorldTile(3017, 3339, 0), 1, 2);
				else if (id == 6226 && object.getX() == 3020
						&& object.getY() == 9739)
					player.useStairs(828, new WorldTile(3021, 3339, 0), 1, 2);
				else if (id == 30963)
					player.getBank().openBank();
				else if (id == 6045)
					player.getPackets().sendGameMessage(
							"You search the cart but find nothing.");
				else if (id == 5906) {
					if (player.getSkills().getLevel(Skills.AGILITY) < 42) {
						player.getPackets()
								.sendGameMessage(
										"You need an agility level of 42 to use this obstacle.");
						return;
					}
					player.lock();
					WorldTasksManager.schedule(new WorldTask() {
						int count = 0;

						@Override
						public void run() {
							if (count == 0) {
								player.setNextAnimation(new Animation(2594));
								WorldTile tile = new WorldTile(
										object.getX()
												+ (object.getRotation() == 2 ? -2
														: +2), object.getY(), 0);
								player.setNextForceMovement(new ForceMovement(
										tile, 4, Utils.getMoveDirection(
												tile.getX() - player.getX(),
												tile.getY() - player.getY())));
							} else if (count == 2) {
								WorldTile tile = new WorldTile(
										object.getX()
												+ (object.getRotation() == 2 ? -2
														: +2), object.getY(), 0);
								player.setNextWorldTile(tile);
							} else if (count == 5) {
								player.setNextAnimation(new Animation(2590));
								WorldTile tile = new WorldTile(
										object.getX()
												+ (object.getRotation() == 2 ? -5
														: +5), object.getY(), 0);
								player.setNextForceMovement(new ForceMovement(
										tile, 4, Utils.getMoveDirection(
												tile.getX() - player.getX(),
												tile.getY() - player.getY())));
							} else if (count == 7) {
								WorldTile tile = new WorldTile(
										object.getX()
												+ (object.getRotation() == 2 ? -5
														: +5), object.getY(), 0);
								player.setNextWorldTile(tile);
							} else if (count == 10) {
								player.setNextAnimation(new Animation(2595));
								WorldTile tile = new WorldTile(
										object.getX()
												+ (object.getRotation() == 2 ? -6
														: +6), object.getY(), 0);
								player.setNextForceMovement(new ForceMovement(
										tile, 4, Utils.getMoveDirection(
												tile.getX() - player.getX(),
												tile.getY() - player.getY())));
							} else if (count == 12) {
								WorldTile tile = new WorldTile(
										object.getX()
												+ (object.getRotation() == 2 ? -6
														: +6), object.getY(), 0);
								player.setNextWorldTile(tile);
							} else if (count == 14) {
								stop();
								player.unlock();
							}
							count++;
						}

					}, 0, 0);
					// BarbarianOutpostAgility start
				} else if (id == 20210)
					BarbarianOutpostAgility.enterObstaclePipe(player, object);
				else if (id == 43526)
					BarbarianOutpostAgility.swingOnRopeSwing(player, object);
				else if (id == 43595 && x == 2550 && y == 3546)
					BarbarianOutpostAgility
							.walkAcrossLogBalance(player, object);
				else if (id == 20211 && x == 2538 && y == 3545)
					BarbarianOutpostAgility.climbObstacleNet(player, object);
				else if (id == 2302 && x == 2535 && y == 3547)
					BarbarianOutpostAgility.walkAcrossBalancingLedge(player,
							object);
				else if (id == 1948)
					BarbarianOutpostAgility.climbOverCrumblingWall(player,
							object);
				else if (id == 43533)
					BarbarianOutpostAgility.runUpWall(player, object);
				else if (id == 43597)
					BarbarianOutpostAgility.climbUpWall(player, object);
				else if (id == 43587)
					BarbarianOutpostAgility.fireSpringDevice(player, object);
				else if (id == 43527)
					BarbarianOutpostAgility.crossBalanceBeam(player, object);
				else if (id == 43531)
					BarbarianOutpostAgility.jumpOverGap(player, object);
				else if (id == 43532)
					BarbarianOutpostAgility.slideDownRoof(player, object);
				// Wilderness course start
				else if (id == 64698)
					WildernessAgility.walkAcrossLogBalance(player, object);
				else if (id == 64699)
					WildernessAgility.jumpSteppingStones(player, object);
				else if (id == 65362)
					WildernessAgility.enterWildernessPipe(player,
							object.getX(), object.getY());
				else if (id == 65734)
					WildernessAgility.climbUpWall(player, object);
				else if (id == 64696)
					WildernessAgility.swingOnRopeSwing(player, object);
				else if (id == 65365)
					WildernessAgility.enterWildernessCourse(player);
				else if (id == 65367)
					WildernessAgility.exitWildernessCourse(player);
				// rock living caverns
				else if (id == 45077) {
					player.lock();
					if (player.getX() != object.getX()
							|| player.getY() != object.getY())
						player.addWalkSteps(object.getX(), object.getY(), -1,
								false);
					WorldTasksManager.schedule(new WorldTask() {

						private int count;

						@Override
						public void run() {
							if (count == 0) {
								player.setNextFaceWorldTile(new WorldTile(
										object.getX() - 1, object.getY(), 0));
								player.setNextAnimation(new Animation(12216));
								player.unlock();
							} else if (count == 2) {
								player.setNextWorldTile(new WorldTile(3651,
										5122, 0));
								player.setNextFaceWorldTile(new WorldTile(3651,
										5121, 0));
								player.setNextAnimation(new Animation(12217));
							} else if (count == 3) {
								// TODO find emote
								// player.getPackets().sendObjectAnimation(new
								// WorldObject(45078, 0, 3, 3651, 5123, 0), new
								// Animation(12220));
							} else if (count == 5) {
								player.unlock();
								stop();
							}
							count++;
						}

					}, 1, 0);
				} else if (id == 45076)
					player.getActionManager().setAction(
							new Mining(object, RockDefinitions.LRC_Gold_Ore));
				else if (id == 5999)
					player.getActionManager().setAction(
							new Mining(object, RockDefinitions.LRC_Coal_Ore));
				else if (id == 45078)
					player.useStairs(2413, new WorldTile(3012, 9832, 0), 2, 2);
				else if (id == 45079)
					player.getBank().openDepositBox();
				// champion guild
				else if (id == 24357 && object.getX() == 3188
						&& object.getY() == 3355)
					player.useStairs(-1, new WorldTile(3189, 3354, 1), 0, 1);
				else if (id == 24359 && object.getX() == 3188
						&& object.getY() == 3355)
					player.useStairs(-1, new WorldTile(3189, 3358, 0), 0, 1);
				else if (id == 1805 && object.getX() == 3191
						&& object.getY() == 3363) {
					if (World.isSpawnedObject(object))
						return;
					WorldObject openedDoor = new WorldObject(object.getId(),
							object.getType(), object.getRotation() - 1, object
									.getX(), object.getY(), object.getPlane());
					World.spawnObjectTemporary(openedDoor, 1200);
					player.lock(2);
					player.stopAll();
					player.addWalkSteps(3191,
							player.getY() >= object.getY() ? object.getY() - 1
									: object.getY(), -1, false);
					if (player.getY() >= object.getY())
						player.getDialogueManager()
								.startDialogue(
										"SimpleNPCMessage",
										198,
										"Greetings bolt adventurer. Welcome to the guild of",
										"Champions.");
				}
				// lighthouse dungeon
				else if (id == 4383)
					player.useStairs(833, new WorldTile(2519, 9993, 1), 1, 2);
				else if (id == 4412)
					player.useStairs(828, new WorldTile(2510, 3644, 0), 1, 2);
				else if (id == 4546) {
					if (player.getY() <= 10002) {
						player.getPackets().sendGameMessage(
								"This door cannot be opened from this side.");
						return;
					}
					player.lock(2);
					player.addWalkSteps(2513, 10002, 1, false);
				} else if (id == 4545) {
					if (player.getY() >= 10003) {
						player.getPackets().sendGameMessage(
								"This door cannot be opened from this side.");
						return;
					}
					player.lock(2);
					player.addWalkSteps(2516, 10003, 1, false);
				} else if (id == 4544)
					player.getInterfaceManager().sendInterface(142);
				else if (id == 29355 && object.getX() == 3209
						&& object.getY() == 9616)
					player.useStairs(828, new WorldTile(3210, 3216, 0), 1, 2);
				else if (id == 36687 && object.getX() == 3209
						&& object.getY() == 3216)
					player.useStairs(833, new WorldTile(3208, 9616, 0), 1, 2);
				else if (id == 4485)
					player.useStairs(828, new WorldTile(2515, 10007, 0), 1, 2);
				else if (id == 4413)
					player.useStairs(828, new WorldTile(2515, 10005, 1), 1, 2);
				// start of varrock dungeon
				else if (id == 29355 && object.getX() == 3230
						&& object.getY() == 9904) // varrock
					// dungeon
					// climb
					// to
					// bear
					player.useStairs(828, new WorldTile(3229, 3503, 0), 1, 2);
				else if (id == 24264)
					player.useStairs(833, new WorldTile(3229, 9904, 0), 1, 2);
				else if (id == 24366)
					player.useStairs(828, new WorldTile(3237, 3459, 0), 1, 2);
				else if (id == 882 && object.getX() == 3237
						&& object.getY() == 3458)
					player.useStairs(833, new WorldTile(3237, 9858, 0), 1, 2);
				else if (id == 29355 && object.getX() == 3097
						&& object.getY() == 9868) // edge
					// dungeon
					// climb
					player.useStairs(828, new WorldTile(3096, 3468, 0), 1, 2);
				else if (id == 26934 && x == 3097 && y == 3468)
					player.useStairs(833, new WorldTile(3096, 9868, 0), 1, 2);
				else if (id == 74864)
					player.useStairs(-1, new WorldTile(2885, 3395, 0), 1, 2);
				else if (id == 66991)
					player.useStairs(-1, new WorldTile(2885, 9795, 0), 1, 2);
				else if (id == 29355 && object.getX() == 3088
						&& object.getY() == 9971)
					player.useStairs(828, new WorldTile(3087, 3571, 0), 1, 2);
				else if (id == 65453)
					player.useStairs(833, new WorldTile(3089, 9971, 0), 1, 2);
				else if (id == 12389 && object.getX() == 3116
						&& object.getY() == 3452)
					player.useStairs(833, new WorldTile(3117, 9852, 0), 1, 2);
				else if (id == 29355 && object.getX() == 3116
						&& object.getY() == 9852)
					player.useStairs(833, new WorldTile(3115, 3452, 0), 1, 2);
				else if (id == 69526)
					GnomeAgility.walkGnomeLog(player);
				else if (id == 69383)
					GnomeAgility.climbGnomeObstacleNet(player);
				else if (id == 69508)
					GnomeAgility.climbUpGnomeTreeBranch(player);
				else if (id == 2312)
					GnomeAgility.walkGnomeRope(player);
				else if (id == 4059)
					GnomeAgility.walkBackGnomeRope(player);
				else if (id == 69507)
					GnomeAgility.climbDownGnomeTreeBranch(player);
				else if (id == 69384)
					GnomeAgility.climbGnomeObstacleNet2(player);
				else if (id == 69377 || id == 69378)
					GnomeAgility.enterGnomePipe(player, object.getX(),
							object.getY());
				else if (id == 69389)
					GnomeAgility.jumpDown(player, object);
				else if (id == 69506)
					GnomeAgility.climbUpTree(player);
				else if (Wilderness.isDitch(id)) {// wild ditch
					player.getDialogueManager().startDialogue(
							"WildernessDitch", object);
				} else if (id == 42611) {// Magic Portal
					player.getDialogueManager().startDialogue("MagicPortal");
				} else if (object.getDefinitions().name
						.equalsIgnoreCase("Obelisk") && object.getY() > 3525) {
					// Who the fuck removed the controler class and the code
					// from SONIC!!!!!!!!!!
					// That was an hour of collecting coords :fp: Now ima kill
					// myself.
				} else if (id == 27254) {// Edgeville portal
					player.getPackets().sendGameMessage(
							"You enter the portal...");
					player.useStairs(10584, new WorldTile(3087, 3488, 0), 2, 3,
							"..and are transported to Edgeville.");
					player.addWalkSteps(1598, 4506, -1, false);
				} else if (id == 12202) {// mole entrance
					if (!player.getInventory().containsItemToolBelt(952)) {
						player.getPackets().sendGameMessage(
								"You need a spade to dig this.");
						return;
					}
					if (player.getX() != object.getX()
							|| player.getY() != object.getY()) {
						player.lock();
						player.addWalkSteps(object.getX(), object.getY());
						WorldTasksManager.schedule(new WorldTask() {
							@Override
							public void run() {
								InventoryOptionsHandler.dig(player);
							}

						}, 1);
					} else
						InventoryOptionsHandler.dig(player);
				} else if (id == 12230 && object.getX() == 1752
						&& object.getY() == 5136)// mole
					// exit
					player.setNextWorldTile(new WorldTile(2986, 3316, 0));
				else if (id == 66115 || id == 66116)
					InventoryOptionsHandler.dig(player);
				else if (id == 15522) {// portal sign
					if (player.withinDistance(new WorldTile(1598, 4504, 0), 1)) {// PORTAL
						// 1
						player.getInterfaceManager().sendInterface(327);
						player.getPackets().sendIComponentText(327, 13,
								"Edgeville");
						player.getPackets()
								.sendIComponentText(
										327,
										14,
										"This portal will take you to edgeville. There "
												+ "you can multi pk once past the wilderness ditch.");
					}
					if (player.withinDistance(new WorldTile(1598, 4508, 0), 1)) {// PORTAL
						// 2
						player.getInterfaceManager().sendInterface(327);
						player.getPackets().sendIComponentText(327, 13,
								"Mage Bank");
						player.getPackets()
								.sendIComponentText(
										327,
										14,
										"This portal will take you to the mage bank. "
												+ "The mage bank is a 1v1 deep wilderness area.");
					}
					if (player.withinDistance(new WorldTile(1598, 4513, 0), 1)) {// PORTAL
						// 3
						player.getInterfaceManager().sendInterface(327);
						player.getPackets().sendIComponentText(327, 13,
								"Magic's Portal");
						player.getPackets()
								.sendIComponentText(
										327,
										14,
										"This portal will allow you to teleport to areas that "
												+ "will allow you to change your magic spell book.");
					}
				} else if (id == 38811 || id == 37929) {// corp beast
					if (object.getX() == 2971 && object.getY() == 4382)
						player.getInterfaceManager().sendInterface(650);
					else if (object.getX() == 2918 && object.getY() == 4382) {
						player.stopAll();
						player.setNextWorldTile(new WorldTile(
								player.getX() == 2921 ? 2917 : 2921, player
										.getY(), player.getPlane()));
					}
				} else if (id == 37928 && object.getX() == 2883
						&& object.getY() == 4370) {
					player.stopAll();
					player.setNextWorldTile(new WorldTile(3214, 3782, 0));
					player.getControlerManager().startControler("Wilderness");
				} else if (id == 38815 && object.getX() == 3209
						&& object.getY() == 3780 && object.getPlane() == 0) {
					if (player.getSkills().getLevelForXp(Skills.WOODCUTTING) < 37
							|| player.getSkills().getLevelForXp(Skills.MINING) < 45
							|| player.getSkills().getLevelForXp(
									Skills.SUMMONING) < 23
							|| player.getSkills().getLevelForXp(
									Skills.FIREMAKING) < 47
							|| player.getSkills().getLevelForXp(Skills.PRAYER) < 55) {
						player.getPackets()
								.sendGameMessage(
										"You need 23 Summoning, 37 Woodcutting, 45 Mining, 47 Firemaking and 55 Prayer to enter this dungeon.");
						return;
					}
					player.stopAll();
					player.setNextWorldTile(new WorldTile(2885, 4372, 2));
					player.getControlerManager().forceStop();
					// TODO all reqs, skills not added
				} else if (id == 48803 && player.isKalphiteLairSetted()) {
					player.setNextWorldTile(new WorldTile(3508, 9494, 0));
				} else if (id == 48802) {
					if (player.isKalphiteLairEntranceSetted())
						player.setNextWorldTile(new WorldTile(3420, 9510, 0));
					else if (player.getInventory().containsItem(954, 1)) {
						player.getInventory().deleteItem(954, 1);
						player.setKalphiteLairEntrance();
					} else
						player.getPackets().sendGameMessage(
								"You need a rope to climb down.");
				} else if (id == 3829) {
					if (object.getX() == 3419 && object.getY() == 9510) {
						player.useStairs(828, new WorldTile(3226, 3108, 0), 1,
								2);
					}
				} else if (id == 3832) {
					if (object.getX() == 3508 && object.getY() == 9494) {
						player.useStairs(828, new WorldTile(3446, 9496, 0), 1,
								2);
					}
				} else if (id == 9369) {
					player.getControlerManager().startControler("FightPits");
				} else if (id == 54019 || id == 54020 || id == 55301)
					PkRank.showRanks(player);
				else if (id == 1817)// kbd lever
					Magic.pushLeverTeleport(player,
							new WorldTile(3048, 3519, 0), 827,
							"You activate the artefact...",
							"and teleport out of the dragon's lair.");
				else if (id == 77834)
					player.getDialogueManager().startDialogue("KBDArtifact");
				else if (id == 1816 && object.getX() == 3067
						&& object.getY() == 10252) { // kbd
					// out
					// lever
					Magic.pushLeverTeleport(player,
							new WorldTile(2273, 4681, 0));
				} else if (id == 32015 && object.getX() == 3069
						&& object.getY() == 10256) { // kbd
					// stairs
					player.useStairs(828, new WorldTile(3017, 3848, 0), 1, 2);
					player.getControlerManager().startControler("Wilderness");
				} else if (id == 1765 && object.getX() == 3017
						&& object.getY() == 3849) { // kbd
					// out
					// stairs
					player.stopAll();
					player.setNextWorldTile(new WorldTile(3069, 10255, 0));
					player.getControlerManager().forceStop();
				} else if (id == 14315) {
					if (Lander.canEnter(player, 0))
						return;
				} else if (id == 25631) {
					if (Lander.canEnter(player, 1))
						return;
				} else if (id == 25632) {
					if (Lander.canEnter(player, 2))
						return;
				} else if (id == 5959) {
					Magic.pushLeverTeleport(player,
							new WorldTile(2539, 4712, 0));
				} else if (id == 5960) {
					Magic.pushLeverTeleport(player,
							new WorldTile(3089, 3957, 0));
				} else if (id == 1814) {
					Magic.pushLeverTeleport(player,
							new WorldTile(3155, 3923, 0));
				} else if (id == 1815) {
					Magic.pushLeverTeleport(player,
							new WorldTile(2561, 3311, 0));
				} else if (id == 62675)
					player.getCutscenesManager().play("DTPreview");
				else if (id == 62681)
					player.getDominionTower().viewScoreBoard();
				else if (id == 62678 || id == 62679)
					player.getDominionTower().openModes();
				else if (id == 62688)
					player.getDialogueManager().startDialogue("DTClaimRewards");
				else if (id == 62677)
					player.getDominionTower().talkToFace();
				else if (id == 62680)
					player.getDominionTower().openBankChest();
				else if (id == 48797)
					player.useStairs(-1, new WorldTile(3877, 5526, 1), 0, 1);
				else if (id == 48798)
					player.useStairs(-1, new WorldTile(3246, 3198, 0), 0, 1);
				else if (id == 48678 && x == 3858 && y == 5533)
					player.useStairs(-1, new WorldTile(3861, 5533, 0), 0, 1);
				else if (id == 48678 && x == 3858 && y == 5543)
					player.useStairs(-1, new WorldTile(3861, 5543, 0), 0, 1);
				else if (id == 48678 && x == 3858 && y == 5533)
					player.useStairs(-1, new WorldTile(3861, 5533, 0), 0, 1);
				else if (id == 48677 && x == 3858 && y == 5543)
					player.useStairs(-1, new WorldTile(3856, 5543, 1), 0, 1);
				else if (id == 48677 && x == 3858 && y == 5533)
					player.useStairs(-1, new WorldTile(3856, 5533, 1), 0, 1);
				else if (id == 48679)
					player.useStairs(-1, new WorldTile(3875, 5527, 1), 0, 1);
				else if (id == 48688)
					player.useStairs(-1, new WorldTile(3972, 5565, 0), 0, 1);
				else if (id == 48683)
					player.useStairs(-1, new WorldTile(3868, 5524, 0), 0, 1);
				else if (id == 48682)
					player.useStairs(-1, new WorldTile(3869, 5524, 0), 0, 1);
				else if (id == 62676) { // dominion exit
					player.useStairs(-1, new WorldTile(3374, 3093, 0), 0, 1);
				} else if (id == 62674) { // dominion entrance
					player.useStairs(-1, new WorldTile(3744, 6405, 0), 0, 1);
				} else if (id == 11993) {
					player.useStairs(-1, new WorldTile(3106, 3162, 0), 0, 1);
				} else if (id == 3192) {
					PkRank.showRanks(player);
				} else if (id == 65349) {
					player.useStairs(-1, new WorldTile(3044, 10325, 0), 0, 1);
				} else if (id == 32048 && object.getX() == 3043
						&& object.getY() == 10328) {
					player.useStairs(-1, new WorldTile(3045, 3927, 0), 0, 1);
				} else if (id == 26194) {
					player.getDialogueManager().startDialogue("PartyRoomLever");
				} else if (id == 61190 || id == 61191 || id == 61192
						|| id == 61193) {
					if (objectDef.containsOption(0, "Chop down"))
						player.getActionManager()
								.setAction(
										new Woodcutting(object,
												TreeDefinitions.NORMAL));
				} else if (id == 20573)
					player.getControlerManager().startControler("RefugeOfFear");
				// crucible
				else if (id == 67050)
					player.useStairs(-1, new WorldTile(3359, 6110, 0), 0, 1);
				else if (id == 9662) {
					player.setNextAnimation(new Animation(832));
					player.getInventory().addItem(952, 1);
					player.lock(2);
					World.removeObjectTemporary(object, 60000);
				} else if (id == 67053)
					player.useStairs(-1, new WorldTile(3120, 3519, 0), 0, 1);
				else if (id == 20602) // gamers groto
					player.useStairs(-1, new WorldTile(2954, 9675, 0), 0, 1);
				else if (id == 20604) // gamers groto
					player.useStairs(-1, new WorldTile(3018, 3404, 0), 0, 1);
				else if (id == 4577) {
					player.lock(2);
					player.addWalkSteps(2509, player.getY() == 3635 ? 3636
							: 3635, 1, false);
				} else if (id == 67051)
					player.getDialogueManager().startDialogue("Marv", false);
				else if (id == 67052)
					Crucible.enterCrucibleEntrance(player);
				else if (id == 6) {
					if (OwnedObjectManager.isPlayerObject(player, object))
						DwarfMultiCannon.fire(player);
					else
						player.getPackets().sendGameMessage(
								"This is not your cannon!");

				} else if (id == 9)
					DwarfMultiCannon.pickupCannon(player, 3, object);
				else if (id == 8)
					DwarfMultiCannon.pickupCannon(player, 2, object);
				else if (id == 7)
					DwarfMultiCannon.pickupCannon(player, 1, object);
				else if (id == 172)
					player.getPackets().sendGameMessage(
							"This chest is securely locked shut.");
				else if (id == 16944)
					FairyRings.openRingInterface(player, object, false);
				else if (id == 26723)
					player.getDialogueManager()
							.startDialogue(
									"SpiritTreeD",
									(object.getId() == 68973 && object.getId() == 68974) ? 3637
											: 3636);
				else {
					switch (objectDef.name.toLowerCase()) {
					case "trapdoor":
					case "manhole":
						if (objectDef.containsOption(0, "Open")) {
							WorldObject openedHole = new WorldObject(object
									.getId() + 1, object.getType(), object
									.getRotation(), object.getX(), object
									.getY(), object.getPlane());
							World.spawnObjectTemporary(openedHole, 60000);
						}
						break;
					case "closed chest":
						if (objectDef.containsOption(0, "Open")
								&& (ObjectDefinitions
										.getObjectDefinitions(object.getId() + 1).name
										.toLowerCase().equals("open chest"))) {
							player.setNextAnimation(new Animation(536));
							player.lock(2);
							WorldObject openedChest = new WorldObject(object
									.getId() + 1, object.getType(), object
									.getRotation(), object.getX(), object
									.getY(), object.getPlane());
							World.spawnObjectTemporary(openedChest, 60000);
						}
						break;
					case "open chest":
						if (objectDef.containsOption(0, "Search"))
							player.getPackets().sendGameMessage(
									"You search the chest but find nothing.");
						break;
					case "spirit tree":
						player.getDialogueManager()
								.startDialogue(
										"SpiritTreeD",
										(object.getId() == 68973 && object
												.getId() == 68974) ? 3637
												: 3636);
						break;
					case "fairy ring":
					case "enchanted land":
						FairyRings.openRingInterface(player, object,
								id == 12128);
						break;
					case "spiderweb":
						if (object.getRotation() == 2) {
							player.lock(2);
							if (Utils.getRandom(1) == 0) {
								player.addWalkSteps(player.getX(), player
										.getY() < y ? object.getY() + 2
										: object.getY() - 1, -1, false);
								player.getPackets().sendGameMessage(
										"You squeeze though the web.");
							} else
								player.getPackets()
										.sendGameMessage(
												"You fail to squeeze though the web; perhaps you should try again.");
						}
						break;
					case "web":
						if (objectDef.containsOption(0, "Slash")) {
							player.setNextAnimation(new Animation(PlayerCombat
									.getWeaponAttackEmote(player.getEquipment()
											.getWeaponId(), player
											.getCombatDefinitions()
											.getAttackStyle())));
							slashWeb(player, object);
						}
						break;
					case "anvil":
						if (objectDef.containsOption(0, "Smith")) {
							ForgingBar bar = ForgingBar.getBar(player);
							if (bar != null)
								ForgingInterface.sendSmithingInterface(player,
										bar);
							else
								player.getPackets()
										.sendGameMessage(
												"You have no bars which you have smithing level to use.");
						}
						break;
					case "potter's wheel":
						player.getDialogueManager().startDialogue(
								"PotteryWheel");
						break;
					case "pottery oven":
						player.getDialogueManager().startDialogue(
								"PotteryFurnace");
						break;
					case "tin ore rocks":
						player.getActionManager().setAction(
								new Mining(object, RockDefinitions.Tin_Ore));
						break;
					case "gold ore rocks":
						player.getActionManager().setAction(
								new Mining(object, RockDefinitions.Gold_Ore));
						break;
					case "iron ore rocks":
						player.getActionManager().setAction(
								new Mining(object, RockDefinitions.Iron_Ore));
						break;
					case "silver ore rocks":
						player.getActionManager().setAction(
								new Mining(object, RockDefinitions.Silver_Ore));
						break;
					case "coal rocks":
						player.getActionManager().setAction(
								new Mining(object, RockDefinitions.Coal_Ore));
						break;
					case "clay rocks":
						player.getActionManager().setAction(
								new Mining(object, RockDefinitions.Clay_Ore));
						break;
					case "copper ore rocks":
						player.getActionManager().setAction(
								new Mining(object, RockDefinitions.Copper_Ore));
						break;
					case "blurite ore rocks":
						player.getActionManager()
								.setAction(
										new Mining(object,
												RockDefinitions.Blurite_Ore));
						break;
					case "adamantite ore rocks":
						player.getActionManager()
								.setAction(
										new Mining(object,
												RockDefinitions.Adamant_Ore));
						break;
					case "runite ore rocks":
						player.getActionManager().setAction(
								new Mining(object, RockDefinitions.Runite_Ore));
						break;
					case "granite rocks":
						player.getActionManager()
								.setAction(
										new Mining(object,
												RockDefinitions.Granite_Ore));
						break;
					case "sandstone rocks":
						player.getActionManager().setAction(
								new Mining(object,
										RockDefinitions.Sandstone_Ore));
						break;
					case "mithril ore rocks":
						player.getActionManager()
								.setAction(
										new Mining(object,
												RockDefinitions.Mithril_Ore));
						break;
					case "bank deposit box":
						if (objectDef.containsOption(0, "Deposit"))
							player.getBank().openDepositBox();
						break;
					case "bank":
					case "bank chest":
					case "bank booth":
					case "counter":
						if (objectDef.containsOption(0, "Bank")
								|| objectDef.containsOption(0, "Use"))
							player.getBank().openBank();
						break;
					// Woodcutting start
					case "dramen tree":
						if (objectDef.containsOption(0, "Chop down")) {
							if (!player.isKilledLostCityTree()) {
								if (player.getTemporaryAttributtes().get(
										"HAS_SPIRIT_TREE") != null)
									return;
								new TreeSpirit(player, new WorldTile(2859,
										9734, 0));
								return;
							}
							player.getActionManager().setAction(
									new Woodcutting(object,
											TreeDefinitions.DRAMEN));
						}
						break;
					case "tree":
						if (objectDef.containsOption(0, "Chop down"))
							player.getActionManager().setAction(
									new Woodcutting(object,
											TreeDefinitions.NORMAL));
						break;
					case "evergreen":
						if (objectDef.containsOption(0, "Chop down"))
							player.getActionManager().setAction(
									new Woodcutting(object,
											TreeDefinitions.EVERGREEN));
						break;
					case "dead tree":
						if (objectDef.containsOption(0, "Chop down"))
							player.getActionManager().setAction(
									new Woodcutting(object,
											TreeDefinitions.DEAD));
						break;
					case "oak":
						if (objectDef.containsOption(0, "Chop down"))
							player.getActionManager()
									.setAction(
											new Woodcutting(object,
													TreeDefinitions.OAK));
						break;
					case "willow":
						if (objectDef.containsOption(0, "Chop down"))
							player.getActionManager().setAction(
									new Woodcutting(object,
											TreeDefinitions.WILLOW));
						break;
					case "maple tree":
						if (objectDef.containsOption(0, "Chop down"))
							player.getActionManager().setAction(
									new Woodcutting(object,
											TreeDefinitions.MAPLE));
						break;
					case "ivy":
						if (objectDef.containsOption(0, "Chop"))
							player.getActionManager()
									.setAction(
											new Woodcutting(object,
													TreeDefinitions.IVY));
						break;
					case "yew":
						if (objectDef.containsOption(0, "Chop down"))
							player.getActionManager()
									.setAction(
											new Woodcutting(object,
													TreeDefinitions.YEW));
						break;
					case "magic tree":
						if (objectDef.containsOption(0, "Chop down"))
							player.getActionManager().setAction(
									new Woodcutting(object,
											TreeDefinitions.MAGIC));
						break;
					case "cursed magic tree":
						if (objectDef.containsOption(0, "Chop down"))
							player.getActionManager().setAction(
									new Woodcutting(object,
											TreeDefinitions.CURSED_MAGIC));
						break;
					// Woodcutting end
					case "gate":
					case "large door":
					case "metal door":
						if (objectDef.containsOption(0, "Open"))
							if (!handleGate(player, object))
								handleDoor(player, object);
						break;
					case "door":
						if ((objectDef.containsOption(0, "Open") || objectDef
								.containsOption(0, "Unlock")))
							handleDoor(player, object);
						break;
					case "ladder":
						handleLadder(player, object, 1);
						break;
					case "stairs":
					case "staircase":
						handleStaircases(player, object, 1);
						break;
					case "small obelisk":
						if (objectDef.containsOption(0, "Renew-points"))
							renewSummoningPoints(player);
						break;
					case "obelisk":
						if (objectDef.containsOption(0, "Infuse-pouch"))
							Summoning.openInfusionInterface(player);
						break;
					case "altar":
						if (objectDef.containsOption(0, "Pray")
								|| objectDef.containsOption(0, "Pray-at")) {
							final int maxPrayer = player.getSkills()
									.getLevelForXp(Skills.PRAYER) * 10;
							if (player.getPrayer().getPrayerpoints() < maxPrayer) {
								player.lock(5);
								player.getPackets().sendGameMessage(
										"You pray to the gods...", true);
								player.setNextAnimation(new Animation(645));
								WorldTasksManager.schedule(new WorldTask() {
									@Override
									public void run() {
										player.getPrayer().restorePrayer(
												maxPrayer);
										player.getPackets()
												.sendGameMessage(
														"...and recharged your prayer.",
														true);
									}
								}, 2);
							} else
								player.getPackets().sendGameMessage(
										"You already have full prayer.");
							if (id == 6552)
								player.getDialogueManager().startDialogue(
										"AncientAltar");
						}
						break;
					default:
						player.getPackets().sendGameMessage(
								"Nothing interesting happens.");
						break;
					}
				}
				if (Settings.DEBUG)
					Logger.log(
							"ObjectHandler",
							"clicked 1 at object id : " + id + ", "
									+ object.getX() + ", " + object.getY()
									+ ", " + object.getPlane() + ", "
									+ object.getType() + ", "
									+ object.getRotation() + ", "
									+ object.getDefinitions().name + ", "
									+ object.getDefinitions().getSizeX() + ", "
									+ object.getDefinitions().getSizeY());
			}
		}));
	}

	private static boolean getRepeatedTele(Player player, int x1, int y1,
			int p1, int x2, int y2, int p2) {
		if (player.getX() == x1 && player.getY() == y1) {
			player.useStairs(17803, new WorldTile(x2, y2, p2), 2, 3);
			return true;
		} else if (player.getX() == x2 && player.getY() == y2) {
			player.useStairs(17803, new WorldTile(x1, y1, p1), 2, 3);
			return true;
		}
		return false;
	}

	public static void renewSummoningPoints(Player player) {
		int summonLevel = player.getSkills().getLevelForXp(Skills.SUMMONING);
		if (player.getSkills().getLevel(Skills.SUMMONING) < summonLevel) {
			player.lock(3);
			player.setNextAnimation(new Animation(8502));
			player.getSkills().set(Skills.SUMMONING, summonLevel);
			player.getPackets().sendGameMessage(
					"You have recharged your Summoning points.", true);
		} else
			player.getPackets().sendGameMessage(
					"You already have full Summoning points.");
	}

	private static void handleOption2(final Player player,
			final WorldObject object) {
		final ObjectDefinitions objectDef = object.getDefinitions();
		final int id = object.getId();
		player.setRouteEvent(new RouteEvent(object, new Runnable() {
			@Override
			public void run() {
				player.stopAll();
				player.faceObject(object);
				if (!player.getControlerManager().processObjectClick2(object))
					return;
				else if (player.getFarmingManager().isFarming(id, null, 2))
					return;
				else if (id == 17010)
					player.getDialogueManager().startDialogue("LunarAltar");
				else if (id == 12774)
					player.getDialogueManager().startDialogue(
							"ShantyPassDangerSignD");
				else if (id == 62677)
					player.getDominionTower().openRewards();
				else if (id == 2491)
					MiningBase.propect(player,
							"This rock contains unbound Rune Stone essence.");
				else if (id == 62688)
					player.getDialogueManager().startDialogue(
							"SimpleMessage",
							"You have a Dominion Factor of "
									+ player.getDominionTower()
											.getDominionFactor() + ".");
				else if (id == 68107)
					FightKiln.enterFightKiln(player, true);
				else if (id == 34384 || id == 34383 || id == 14011
						|| id == 7053 || id == 34387 || id == 34386
						|| id == 34385)
					Thieving.handleStalls(player, object);
				else if (id == 2693)
					player.getGeManager().openCollectionBox();
				else if (id == 35390)
					GodWars.passGiantBoulder(player, object, false);
				else if (id == 2418)
					PartyRoom.openPartyChest(player);
				else if (id == 67051)
					player.getDialogueManager().startDialogue("Marv", true);
				else if (id == 12309) {
					ShopsHandler.openShop(player, 72);
				} else if (id == 6) {
					DwarfMultiCannon.pickupCannon(player, 4, object);
				} else {
					switch (objectDef.name.toLowerCase()) {
					case "furnace":
					case "lava furnace":
						player.getDialogueManager().startDialogue("SmeltingD",
								object);
						break;
					case "cabbage":
						if (objectDef.containsOption(1, "Pick")
								&& player.getInventory().addItem(1965, 1)) {
							player.setNextAnimation(new Animation(827));
							player.lock(2);
							World.removeObjectTemporary(object, 60000);
						}
						break;
					case "flax":
						if (objectDef.containsOption(1, "Pick")
								&& player.getInventory().addItem(1779, 1)) {
							player.setNextAnimation(new Animation(827));
							player.lock(2);
							World.removeObjectTemporary(object, 60000);
						}
						break;
					case "spinning wheel":
						player.getDialogueManager().startDialogue("SpinningD");
						break;
					case "bank":
					case "bank chest":
					case "bank booth":
					case "counter":
						if (objectDef.containsOption(1, "Bank"))
							player.getBank().openBank();
						break;
					case "bank deposit box":
						if (objectDef.containsOption(1, "Deposit-all")) {
							player.getBank().depositAllInventory(false);
							player.getBank().depositAllEquipment(false);
							player.getBank().depositAllBob(false);
							player.getPackets()
									.sendGameMessage(
											"You deposit all of your items into the deposit box");
						}
						break;
					case "spirit tree":
						SpiritTree.openInterface(player,
								object.getId() != 68973
										&& object.getId() != 68974);
						break;
					case "gates":
					case "gate":
					case "metal door":
						if (objectDef.containsOption(1, "Open"))
							handleGate(player, object);
						break;
					case "door":
						if (objectDef.containsOption(1, "Open"))
							handleDoor(player, object);
						break;
					case "ladder":
						handleLadder(player, object, 2);
						break;
					case "stairs":
					case "staircase":
						handleStaircases(player, object, 2);
						break;
					case "summoning obelisk":
						if (objectDef.containsOption(1, "Renew-points"))
							renewSummoningPoints(player);
						break;
					default:
						player.getPackets().sendGameMessage(
								"Nothing interesting happens.");
						break;
					}
				}
				if (Settings.DEBUG)
					Logger.log("ObjectHandler", "clicked 2 at object id : "
							+ id + ", " + object.getX() + ", " + object.getY()
							+ ", " + object.getPlane());
			}
		}));
	}

	private static void handleOption3(final Player player,
			final WorldObject object) {
		final ObjectDefinitions objectDef = object.getDefinitions();
		final int id = object.getId();
		player.setRouteEvent(new RouteEvent(object, new Runnable() {
			@Override
			public void run() {
				player.stopAll();
				player.faceObject(object);
				if (!player.getControlerManager().processObjectClick3(object))
					return;
				else if (player.getFarmingManager().isFarming(id, null, 3))
					return;
				else if (id == 12309)
					ShopsHandler.openShop(player, 71);
				switch (objectDef.name.toLowerCase()) {
				case "gate":
				case "metal door":
					if (objectDef.containsOption(2, "Open"))
						handleGate(player, object);
					break;
				case "door":
					if (objectDef.containsOption(2, "Open"))
						handleDoor(player, object);
					break;
				case "ladder":
					handleLadder(player, object, 3);
					break;
				case "stairs":
				case "staircase":
					handleStaircases(player, object, 3);
					break;
				default:
					player.getPackets().sendGameMessage(
							"Nothing interesting happens.");
					break;
				}
				if (Settings.DEBUG)
					Logger.log("ObjectHandler", "cliked 3 at object id : " + id
							+ ", " + object.getX() + ", " + object.getY()
							+ ", " + object.getPlane() + ", ");
			}
		}));
	}

	private static void handleOption4(final Player player,
			final WorldObject object) {
		final ObjectDefinitions objectDef = object.getDefinitions();
		final int id = object.getId();
		player.setRouteEvent(new RouteEvent(object, new Runnable() {
			@Override
			public void run() {
				player.stopAll();
				player.faceObject(object);
				if (!player.getControlerManager().processObjectClick4(object))
					return;
				// living rock Caverns
				if (id == 45076)
					MiningBase
							.propect(player,
									"This rock contains a large concentration of gold.");
				else if (id == 5999)
					MiningBase
							.propect(player,
									"This rock contains a large concentration of coal.");
				else {
					switch (objectDef.name.toLowerCase()) {
					default:
						player.getPackets().sendGameMessage(
								"Nothing interesting happens.");
						break;
					}
				}
				if (Settings.DEBUG)
					Logger.log("ObjectHandler", "cliked 4 at object id : " + id
							+ ", " + object.getX() + ", " + object.getY()
							+ ", " + object.getPlane() + ", ");
			}
		}));
	}

	private static void handleOption5(final Player player,
			final WorldObject object) {
		final ObjectDefinitions objectDef = object.getDefinitions();
		final int id = object.getId();
		player.setRouteEvent(new RouteEvent(object, new Runnable() {
			@Override
			public void run() {
				player.stopAll();
				player.faceObject(object);
				if (!player.getControlerManager().processObjectClick5(object))
					return;
				if (id == -1) {
					// unused
				} else {
					switch (objectDef.name.toLowerCase()) {
					case "fire":
						if (objectDef.containsOption(4, "Add-logs"))
							Bonfire.addLogs(player, object);
						break;
					case "magical wheat":
						PuroPuro.pushThrough(player, object);
						break;
					default:
						player.getPackets().sendGameMessage(
								"Nothing interesting happens.");
						break;
					}
				}
				if (Settings.DEBUG)
					Logger.log("ObjectHandler", "cliked 5 at object id : " + id
							+ ", " + object.getX() + ", " + object.getY()
							+ ", " + object.getPlane() + ", ");
			}
		}));
	}

	private static void handleOptionExamine(final Player player,
			final WorldObject object) {
		player.getPackets().sendObjectMessage(0, 15263739, object,
				"It's a " + object.getDefinitions().name + ".");
		player.getPackets().sendResetMinimapFlag();
		if (Settings.DEBUG)
			Logger.log(
					"ObjectHandler",
					"examined object id : " + object.getId() + ", "
							+ object.getX() + ", " + object.getY() + ", "
							+ object.getPlane() + ", " + object.getType()
							+ ", " + object.getRotation() + ", "
							+ object.getDefinitions().name);
	}

	private static void slashWeb(Player player, WorldObject object) {
		if (Utils.getRandom(1) == 0) {
			World.spawnObjectTemporary(new WorldObject(object.getId() + 1,
					object.getType(), object.getRotation(), object.getX(),
					object.getY(), object.getPlane()), 60000);
			player.getPackets().sendGameMessage("You slash through the web!");
		} else
			player.getPackets().sendGameMessage(
					"You fail to cut through the web.");
	}

	private static boolean handleGate(Player player, WorldObject object) {
		if (World.isSpawnedObject(object))
			return false;
		if (object.getRotation() == 0) {
			boolean south = true;
			WorldObject otherDoor = World.getObjectWithType(new WorldTile(
					object.getX(), object.getY() + 1, object.getPlane()),
					object.getType());
			if (otherDoor == null
					|| otherDoor.getRotation() != object.getRotation()
					|| otherDoor.getType() != object.getType()
					|| !otherDoor.getDefinitions().name.equalsIgnoreCase(object
							.getDefinitions().name)) {
				otherDoor = World.getObjectWithType(new WorldTile(
						object.getX(), object.getY() - 1, object.getPlane()),
						object.getType());
				if (otherDoor == null
						|| otherDoor.getRotation() != object.getRotation()
						|| otherDoor.getType() != object.getType()
						|| !otherDoor.getDefinitions().name
								.equalsIgnoreCase(object.getDefinitions().name))
					return false;
				south = false;
			}
			WorldObject openedDoor1 = new WorldObject(object.getId(),
					object.getType(), object.getRotation() + 1, object.getX(),
					object.getY(), object.getPlane());
			WorldObject openedDoor2 = new WorldObject(otherDoor.getId(),
					otherDoor.getType(), otherDoor.getRotation() + 1,
					otherDoor.getX(), otherDoor.getY(), otherDoor.getPlane());
			if (south) {
				openedDoor1.moveLocation(-1, 0, 0);
				openedDoor1.setRotation(3);
				openedDoor2.moveLocation(-1, 0, 0);
			} else {
				openedDoor1.moveLocation(-1, 0, 0);
				openedDoor2.moveLocation(-1, 0, 0);
				openedDoor2.setRotation(3);
			}

			if (World.removeObjectTemporary(object, 60000)
					&& World.removeObjectTemporary(otherDoor, 60000)) {
				player.faceObject(openedDoor1);
				World.spawnObjectTemporary(openedDoor1, 60000);
				World.spawnObjectTemporary(openedDoor2, 60000);
				return true;
			}
		} else if (object.getRotation() == 2) {

			boolean south = true;
			WorldObject otherDoor = World.getObjectWithType(new WorldTile(
					object.getX(), object.getY() + 1, object.getPlane()),
					object.getType());
			if (otherDoor == null
					|| otherDoor.getRotation() != object.getRotation()
					|| otherDoor.getType() != object.getType()
					|| !otherDoor.getDefinitions().name.equalsIgnoreCase(object
							.getDefinitions().name)) {
				otherDoor = World.getObjectWithType(new WorldTile(
						object.getX(), object.getY() - 1, object.getPlane()),
						object.getType());
				if (otherDoor == null
						|| otherDoor.getRotation() != object.getRotation()
						|| otherDoor.getType() != object.getType()
						|| !otherDoor.getDefinitions().name
								.equalsIgnoreCase(object.getDefinitions().name))
					return false;
				south = false;
			}
			WorldObject openedDoor1 = new WorldObject(object.getId(),
					object.getType(), object.getRotation() + 1, object.getX(),
					object.getY(), object.getPlane());
			WorldObject openedDoor2 = new WorldObject(otherDoor.getId(),
					otherDoor.getType(), otherDoor.getRotation() + 1,
					otherDoor.getX(), otherDoor.getY(), otherDoor.getPlane());
			if (south) {
				openedDoor1.moveLocation(1, 0, 0);
				openedDoor2.setRotation(1);
				openedDoor2.moveLocation(1, 0, 0);
			} else {
				openedDoor1.moveLocation(1, 0, 0);
				openedDoor1.setRotation(1);
				openedDoor2.moveLocation(1, 0, 0);
			}
			if (World.removeObjectTemporary(object, 60000)
					&& World.removeObjectTemporary(otherDoor, 60000)) {
				player.faceObject(openedDoor1);
				World.spawnObjectTemporary(openedDoor1, 60000);
				World.spawnObjectTemporary(openedDoor2, 60000);
				return true;
			}
		} else if (object.getRotation() == 3) {

			boolean right = true;
			WorldObject otherDoor = World.getObjectWithType(new WorldTile(
					object.getX() - 1, object.getY(), object.getPlane()),
					object.getType());
			if (otherDoor == null
					|| otherDoor.getRotation() != object.getRotation()
					|| otherDoor.getType() != object.getType()
					|| !otherDoor.getDefinitions().name.equalsIgnoreCase(object
							.getDefinitions().name)) {
				otherDoor = World.getObjectWithType(new WorldTile(
						object.getX() + 1, object.getY(), object.getPlane()),
						object.getType());
				if (otherDoor == null
						|| otherDoor.getRotation() != object.getRotation()
						|| otherDoor.getType() != object.getType()
						|| !otherDoor.getDefinitions().name
								.equalsIgnoreCase(object.getDefinitions().name))
					return false;
				right = false;
			}
			WorldObject openedDoor1 = new WorldObject(object.getId(),
					object.getType(), object.getRotation() + 1, object.getX(),
					object.getY(), object.getPlane());
			WorldObject openedDoor2 = new WorldObject(otherDoor.getId(),
					otherDoor.getType(), otherDoor.getRotation() + 1,
					otherDoor.getX(), otherDoor.getY(), otherDoor.getPlane());
			if (right) {
				openedDoor1.moveLocation(0, -1, 0);
				openedDoor2.setRotation(0);
				openedDoor1.setRotation(2);
				openedDoor2.moveLocation(0, -1, 0);
			} else {
				openedDoor1.moveLocation(0, -1, 0);
				openedDoor1.setRotation(0);
				openedDoor2.setRotation(2);
				openedDoor2.moveLocation(0, -1, 0);
			}
			if (World.removeObjectTemporary(object, 60000)
					&& World.removeObjectTemporary(otherDoor, 60000)) {
				player.faceObject(openedDoor1);
				World.spawnObjectTemporary(openedDoor1, 60000);
				World.spawnObjectTemporary(openedDoor2, 60000);
				return true;
			}
		} else if (object.getRotation() == 1) {

			boolean right = true;
			WorldObject otherDoor = World.getObjectWithType(new WorldTile(
					object.getX() - 1, object.getY(), object.getPlane()),
					object.getType());
			if (otherDoor == null
					|| otherDoor.getRotation() != object.getRotation()
					|| otherDoor.getType() != object.getType()
					|| !otherDoor.getDefinitions().name.equalsIgnoreCase(object
							.getDefinitions().name)) {
				otherDoor = World.getObjectWithType(new WorldTile(
						object.getX() + 1, object.getY(), object.getPlane()),
						object.getType());
				if (otherDoor == null
						|| otherDoor.getRotation() != object.getRotation()
						|| otherDoor.getType() != object.getType()
						|| !otherDoor.getDefinitions().name
								.equalsIgnoreCase(object.getDefinitions().name))
					return false;
				right = false;
			}
			WorldObject openedDoor1 = new WorldObject(object.getId(),
					object.getType(), object.getRotation() + 1, object.getX(),
					object.getY(), object.getPlane());
			WorldObject openedDoor2 = new WorldObject(otherDoor.getId(),
					otherDoor.getType(), otherDoor.getRotation() + 1,
					otherDoor.getX(), otherDoor.getY(), otherDoor.getPlane());
			if (right) {
				openedDoor1.moveLocation(0, 1, 0);
				openedDoor1.setRotation(0);
				openedDoor2.moveLocation(0, 1, 0);
			} else {
				openedDoor1.moveLocation(0, 1, 0);
				openedDoor2.setRotation(0);
				openedDoor2.moveLocation(0, 1, 0);
			}
			if (World.removeObjectTemporary(object, 60000)
					&& World.removeObjectTemporary(otherDoor, 60000)) {
				player.faceObject(openedDoor1);
				World.spawnObjectTemporary(openedDoor1, 60000);
				World.spawnObjectTemporary(openedDoor2, 60000);
				return true;
			}
		}
		return false;
	}

	public static boolean handleDoor(Player player, WorldObject object,
			long timer) {
		if (World.isSpawnedObject(object)) {
			// World.removeObject(object);
			return false;
		}
		WorldObject openedDoor = new WorldObject(object.getId(),
				object.getType(), (object.getRotation() + 1) & 0x3,
				object.getX(), object.getY(), object.getPlane());
		World.spawnObjectTemporary(openedDoor, timer);
		return false;
	}

	private static boolean handleDoor(Player player, WorldObject object) {
		return handleDoor(player, object, 60000);
	}

	public static WorldTile getClimbTile(WorldObject object, boolean up) {
		int x;
		int y;
		if (up) {
			switch (object.getRotation()) {
			case 0:
				x = object.getX() + object.getDefinitions().getSizeX() - 1;
				y = object.getY() + object.getDefinitions().getSizeY();
				break;
			case 1:
				x = object.getX() + object.getDefinitions().getSizeY();
				y = object.getY() + object.getDefinitions().getSizeX() - 1;
				break;
			case 2:
				x = object.getX() + object.getDefinitions().getSizeX() - 1;
				y = object.getY() - 1;
				break;
			case 3:
			default:
				x = object.getX() - 1;
				y = object.getY() + object.getDefinitions().getSizeX() - 1;
				break;
			}
		} else {
			switch (object.getRotation()) {
			case 0:
				x = object.getX() + object.getDefinitions().getSizeX() - 1;
				y = object.getY() - 1;
				break;
			case 1:
				x = object.getX() - object.getDefinitions().getSizeY();
				y = object.getY() - 1;
				break;
			case 2:
				x = object.getX() + object.getDefinitions().getSizeX() - 1;
				y = object.getY() - object.getDefinitions().getSizeY();
				break;
			case 3:
			default:
				x = object.getX() + object.getDefinitions().getSizeY();
				y = object.getY() + object.getDefinitions().getSizeX() - 1;
				break;
			}
		}
		return new WorldTile(x, y, object.getPlane() + (up ? 1 : -1));
	}

	private static boolean handleStaircases(Player player, WorldObject object,
			int optionId) {
		String option = object.getDefinitions().getOption(optionId);
		if (option.equalsIgnoreCase("Climb-up")) {
			if (player.getPlane() == 3)
				return false;
			player.useStairs(-1, player.transform(0, 0, 1), 0, 1);
		} else if (option.equalsIgnoreCase("Climb-down")) {
			if (player.getPlane() == 0)
				return false;
			player.useStairs(-1, player.transform(0, 0, -1), 0, 1);
		} else if (option.equalsIgnoreCase("Climb")) {
			if (player.getPlane() == 3 || player.getPlane() == 0)
				return false;
			player.getDialogueManager().startDialogue("ClimbNoEmoteStairs",
					player.transform(0, 0, 1), player.transform(0, 0, -1),
					"Go up the stairs.", "Go down the stairs.");
		} else
			return false;
		return false;
	}

	private static boolean handleLadder(Player player, WorldObject object,
			int optionId) {
		String option = object.getDefinitions().getOption(optionId);
		if (option.equalsIgnoreCase("Climb-up")) {
			if (player.getPlane() == 3)
				return false;
			player.useStairs(828, new WorldTile(player.getX(), player.getY(),
					player.getPlane() + 1), 1, 2);
		} else if (option.equalsIgnoreCase("Climb-down")) {
			if (player.getPlane() == 0)
				return false;
			player.useStairs(828, new WorldTile(player.getX(), player.getY(),
					player.getPlane() - 1), 1, 2);
		} else if (option.equalsIgnoreCase("Climb")) {
			if (player.getPlane() == 3 || player.getPlane() == 0)
				return false;
			player.getDialogueManager().startDialogue(
					"ClimbEmoteStairs",
					new WorldTile(player.getX(), player.getY(), player
							.getPlane() + 1),
					new WorldTile(player.getX(), player.getY(), player
							.getPlane() - 1), "Climb up the ladder.",
					"Climb down the ladder.", 828);
		} else
			return false;
		return true;
	}

	public static void handleItemOnObject(final Player player,
			final WorldObject object, final int interfaceId, final Item item) {
		final int itemId = item.getId();
		final ObjectDefinitions objectDef = object.getDefinitions();
		player.setRouteEvent(new RouteEvent(object, new Runnable() {
			@Override
			public void run() {
				if (!player.getControlerManager().handleItemOnObject(object,
						item))
					return;
				player.faceObject(object);
				if (itemId == 1438 && object.getId() == 2452) {
					Runecrafting.enterAirAltar(player);
				} else if (itemId == 1440 && object.getId() == 2455) {
					Runecrafting.enterEarthAltar(player);
				} else if (itemId == 1442 && object.getId() == 2456) {
					Runecrafting.enterFireAltar(player);
				} else if (itemId == 1444 && object.getId() == 2454) {
					Runecrafting.enterWaterAltar(player);
				} else if (itemId == 1446 && object.getId() == 2457) {
					Runecrafting.enterBodyAltar(player);
				} else if (itemId == 1448 && object.getId() == 2453) {
					Runecrafting.enterMindAltar(player);
				} else if (itemId == 1456 && object.getId() == 2462) {
					Runecrafting.enterDeathAltar(player);
				} else if (itemId == 1452 && object.getId() == 2461) {
					Runecrafting.enterChoasAltar(player);
				} else if (itemId == 1450 && object.getId() == 2464) {
					Runecrafting.enterBloodAltar(player);
				} else if (itemId == 1454 && object.getId() == 2458) {
					Runecrafting.enterCosmicAltar(player);
				} else if (itemId == 1462 && object.getId() == 2460) {
					Runecrafting.enterNatureAltar(player);
				} else if (player.getFarmingManager().isFarming(object.getId(),
						item, 0)) {
					return;
				} else if (object.getId() == 733 || object.getId() == 64729) {
					player.setNextAnimation(new Animation(PlayerCombat
							.getWeaponAttackEmote(-1, 0)));
					slashWeb(player, object);
				} else if (object.getId() == 48803 && itemId == 954) {
					if (player.isKalphiteLairSetted())
						return;
					player.getInventory().deleteItem(954, 1);
					player.setKalphiteLair();
				} else if (object.getId() == 48802 && itemId == 954) {
					if (player.isKalphiteLairEntranceSetted())
						return;
					player.getInventory().deleteItem(954, 1);
					player.setKalphiteLairEntrance();
				} else if (object.getId() == 172 && itemId == 989)
					CrystalChest.openChest(player, object);
				else if (object.getId() == 17239 && itemId == 9626)
					player.getDialogueManager().startDialogue("SingingBowl",
							item);
				else if ((item.getId() >= 1704 && item.getId() <= 1710 && item
						.getId() % 2 == 0)
						|| (item.getId() >= 10356 && item.getId() <= 10366 && item
								.getId() % 2 == 0)
						|| (item.getId() == 2572 || (item.getId() >= 20653
								&& item.getId() <= 20657 && item.getId() % 2 != 0))) {
					for (Item item : player.getInventory().getItems()
							.getItems()) {
						if (item == null)
							continue;
						if (item.getId() >= 1704 && item.getId() <= 1710
								&& item.getId() % 2 == 0)
							item.setId(1712);
						else if (item.getId() >= 10356 && item.getId() <= 10366
								&& item.getId() % 2 == 0)
							item.setId(10354);
						else if (item.getId() == 2572
								|| (item.getId() >= 20653
										&& item.getId() <= 20657 && item
										.getId() % 2 != 0))
							item.setId(20659);
					}
					player.getInventory().refresh();
					player.getDialogueManager()
							.startDialogue(
									"ItemMessage",
									"Your ring of wealth and amulet of glory have all been recharged.",
									1712);

				} else {
					switch (objectDef.name.toLowerCase()) {
					case "fountain":
					case "well":
					case "sink":
						if (WaterFilling.isFilling(player, itemId, false))
							return;
						break;
					case "anvil":
						if (GodswordCreating.isShard(itemId)) {
							GodswordCreating.joinPieces(player, true);
							return;
						} else if (SpiritshieldCreating.isSigil(item.getId())) {
							SpiritshieldCreating.attachShield(player, item,
									true);
							return;
						} else if (DragonfireShieldCreating
								.isDragonFireShield(item.getId())) {
							DragonfireShieldCreating.joinPieces(player);
							return;
						}
						ForgingBar bar = ForgingBar.forId(itemId);
						if (bar != null)
							ForgingInterface.sendSmithingInterface(player, bar);
						break;
					case "furnace":
					case "lava furnace":
						if (item.getId() == 2353 || item.getId() == 4)
							player.getDialogueManager().startDialogue(
									"SingleSmithingD", object,
									SmeltingBar.CANNON_BALLS);
						else if (item.getId() == 2357)
							JewllerySmithing.openInterface(player);
						break;
					case "altar":
						if (itemId == SpiritshieldCreating.SPIRIT_SHIELD
								|| itemId == SpiritshieldCreating.HOLY_ELIXIR) {
							SpiritshieldCreating.blessShield(player, true);
							return;
						}
						break;
					case "fire":
					case "firepit":
						if (objectDef.containsOption(4, "Add-logs")
								&& Bonfire.addLog(player, object, item))
							return;
					case "range":
					case "cooking range":
					case "stove":
						Cookables cook = Cooking.isCookingSkill(item);
						if (cook != null) {
							player.getDialogueManager().startDialogue(
									"CookingD", cook, object);
							return;
						}
						player.getDialogueManager()
								.startDialogue(
										"SimpleMessage",
										"You can't cook that on a "
												+ (objectDef.name
														.equals("Fire") ? "fire"
														: "range") + ".");
						break;
					default:
						player.getPackets().sendGameMessage(
								"Nothing interesting happens.");
						break;
					}
					if (Settings.DEBUG)
						System.out.println("Item on object: " + object.getId());
				}
			}
		}));
	}
}
