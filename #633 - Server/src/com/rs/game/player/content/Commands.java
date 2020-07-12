package com.rs.game.player.content;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TimerTask;

import javax.script.ScriptException;

import com.rs.Settings;
import com.rs.cache.loaders.AnimationDefinitions;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.cores.CoresManager;
import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.ForceMovement;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.Region;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.item.ItemsContainer;
import com.rs.game.minigames.FightPits;
import com.rs.game.minigames.clanwars.ClanWars;
import com.rs.game.minigames.clanwars.WallHandler;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.impl.NexCombat;
import com.rs.game.npc.others.Bork;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.SlayerManager;
import com.rs.game.player.content.Slayer.SlayerMaster;
import com.rs.game.player.content.dungeoneering.DungeonConstants;
import com.rs.game.player.content.dungeoneering.DungeonPartyManager;
import com.rs.game.player.content.grandExchange.GrandExchange;
import com.rs.game.player.controllers.FightKiln;
import com.rs.game.player.controllers.GodWars;
import com.rs.game.player.cutscenes.NexCutScene;
import com.rs.game.route.Flags;
import com.rs.game.route.RouteFinder;
import com.rs.game.route.WalkRouteFinder;
import com.rs.game.route.strategy.FixedTileStrategy;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.script.ScriptLoader;
import com.rs.utils.Censor;
import com.rs.utils.Encrypt;
import com.rs.utils.IPBanL;
import com.rs.utils.IPMuteL;
import com.rs.utils.PkRank;
import com.rs.utils.SerializableFilesManager;
import com.rs.utils.Utils;

/*
 * doesnt let it be extended
 */
public final class Commands {

	/*
	 * all console commands only for admin, chat commands processed if they not
	 * processed by console
	 */

	/**
	 * returns if command was processed
	 */
	public static boolean processCommand(Player player, String command,
			boolean console, boolean clientCommand) {
		if (command.length() == 0) // if they used ::(nothing) theres no command
			return false;
		String[] cmd = command.split(" ");
		if (cmd.length == 0)
			return false;
		archiveLogs(player, cmd);
		if (player.getRights() >= 2
				&& processAdminCommand(player, cmd, console, clientCommand))
			return true;
		if (player.getRights() >= 1
				&& processModCommand(player, cmd, console, clientCommand))
			return true;
		if ((player.isSupporter() || player.getRights() >= 1)
				&& processSupportCommands(player, cmd, console, clientCommand))
			return true;
		if ((player.isSupporter() || player.getRights() >= 1)
				&& processPunishmentCommand(player, cmd, console, clientCommand))
			return true;
		if (Settings.ECONOMY || Settings.ECONOMY_TEST) {
			return processNormalCommand(player, cmd, console, clientCommand);
		} else {
			return processNormalCommand(player, cmd, console, clientCommand)
					|| processNormalSpawnCommand(player, cmd, console,
							clientCommand);
		}
	}

	public static boolean processPunishmentCommand(final Player player,
			String[] cmd, boolean console, boolean clientCommand) {
		if (clientCommand)
			return false;

		switch (cmd[0].toLowerCase()) {
		case "spawnnpcs":
			for (int i = 0; i < Integer.parseInt(cmd[2]); i++)
				World.spawnNPC(Integer.parseInt(cmd[1]), player, -1, true, true);
			return true;
		case "nexcontroler":
			player.getControlerManager().startControler("ZGDControler");
			return true;
		case "changepassother":
			if (player.getRights() < 2) {
				player.getPackets().sendGameMessage("Admin+ only!");
				return true;
			}

			String name = cmd[1];
			Player target = SerializableFilesManager.loadPlayer(Utils
					.formatPlayerNameForProtocol(name));
			if (target == null) {
				player.getPackets().sendGameMessage("Target not found.");
				return true;
			}
			target.setUsername(Utils.formatPlayerNameForProtocol(name));
			target.setPassword(Encrypt.encryptSHA1(cmd[2]));
			player.getPackets().sendGameMessage("Password changed.");
			SerializableFilesManager.savePlayer(target);
			return true;
		case "ipban":
			if (player.getRights() < 1) {
				player.getPackets().sendGameMessage("Mod+ only!");
				return true;
			}

			name = "";
			for (int i = 1; i < cmd.length; i++)
				name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
			target = World.getPlayerByDisplayName(name);
			boolean loggedIn = true;
			if (target == null) {
				target = SerializableFilesManager.loadPlayer(Utils
						.formatPlayerNameForProtocol(name));
				if (target != null)
					target.setUsername(Utils.formatPlayerNameForProtocol(name));
				loggedIn = false;
			}
			if (target != null) {
				if (target.getRights() == 2)
					return true;
				IPBanL.ban(target, loggedIn);
				player.getPackets().sendGameMessage(
						"You've permanently ipbanned "
								+ (loggedIn ? target.getDisplayName() : name)
								+ ".");
			} else {
				player.getPackets().sendGameMessage(
						"Couldn't find player " + name + ".");
			}
			return true;
		case "permban":
			if (player.getRights() < 1) {
				player.getPackets().sendGameMessage("Mod+ only!");
				return true;
			}

			name = "";
			for (int i = 1; i < cmd.length; i++)
				name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
			target = World.getPlayerByDisplayName(name);
			if (target != null) {
				if (target.getRights() == 2)
					return true;
				target.setPermBanned(true);
				target.getPackets().sendGameMessage(
						"You've been perm banned by "
								+ Utils.formatPlayerNameForDisplay(player
										.getUsername()) + ".");
				player.getPackets().sendGameMessage(
						"You have perm banned: " + target.getDisplayName()
								+ ".");
				target.getSession().getChannel().close();
				SerializableFilesManager.savePlayer(target);
			} else {
				target = SerializableFilesManager.loadPlayer(Utils
						.formatPlayerNameForProtocol(name));
				if (target.getRights() == 2)
					return true;
				target.setPermBanned(true);
				player.getPackets().sendGameMessage(
						"You have perm banned: "
								+ Utils.formatPlayerNameForDisplay(name) + ".");
				SerializableFilesManager.savePlayer(target);
			}
			return true;
		case "ban":
			if (player.getRights() < 1) {
				player.getPackets().sendGameMessage("Mod+ only!");
				return true;
			}

			name = "";
			for (int i = 1; i < cmd.length; i++)
				name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
			target = World.getPlayerByDisplayName(name);
			if (target != null) {
				target.setBanned(Utils.currentTimeMillis()
						+ (48 * 60 * 60 * 1000));
				target.getSession().getChannel().close();
				player.getPackets().sendGameMessage(
						"You have banned 48 hours: " + target.getDisplayName()
								+ ".");
			} else {
				name = Utils.formatPlayerNameForProtocol(name);
				if (!SerializableFilesManager.containsPlayer(name)) {
					player.getPackets().sendGameMessage(
							"Account name "
									+ Utils.formatPlayerNameForDisplay(name)
									+ " doesn't exist.");
					return true;
				}
				target = SerializableFilesManager.loadPlayer(name);
				target.setUsername(name);
				target.setBanned(Utils.currentTimeMillis()
						+ (48 * 60 * 60 * 1000));
				player.getPackets().sendGameMessage(
						"You have banned 48 hours: "
								+ Utils.formatPlayerNameForDisplay(name) + ".");
				SerializableFilesManager.savePlayer(target);
			}
			return true;
		case "unban":
			if (player.getRights() < 2) {
				player.getPackets().sendGameMessage("Admin+ only!");
				return true;
			}

			name = "";
			for (int i = 1; i < cmd.length; i++)
				name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
			target = World.getPlayerByDisplayName(name);
			if (target != null) {
				IPBanL.unban(target);
				player.getPackets().sendGameMessage(
						"You have unbanned: " + target.getDisplayName() + ".");
			} else {
				name = Utils.formatPlayerNameForProtocol(name);
				if (!SerializableFilesManager.containsPlayer(name)) {
					player.getPackets().sendGameMessage(
							"Account name "
									+ Utils.formatPlayerNameForDisplay(name)
									+ " doesn't exist.");
					return true;
				}
				target = SerializableFilesManager.loadPlayer(name);
				target.setUsername(name);
				IPBanL.unban(target);
				player.getPackets().sendGameMessage(
						"You have unbanned: " + target.getDisplayName() + ".");
				SerializableFilesManager.savePlayer(target);
			}
			return true;
		case "mute":
			name = "";
			for (int i = 1; i < cmd.length; i++)
				name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
			target = World.getPlayerByDisplayName(name);
			if (target != null) {
				target.setMuted(Utils.currentTimeMillis()
						+ (player.getRights() >= 1 ? (48 * 60 * 60 * 1000)
								: (1 * 60 * 60 * 1000)));
				target.getPackets().sendGameMessage(
						"You've been muted for "
								+ (player.getRights() >= 1 ? " 48 hours by "
										: "1 hour by ")
								+ Utils.formatPlayerNameForDisplay(player
										.getUsername()) + ".");
				player.getPackets().sendGameMessage(
						"You have muted "
								+ (player.getRights() >= 1 ? " 48 hours by "
										: "1 hour by ")
								+ target.getDisplayName() + ".");
			} else {
				name = Utils.formatPlayerNameForProtocol(name);
				if (!SerializableFilesManager.containsPlayer(name)) {
					player.getPackets().sendGameMessage(
							"Account name "
									+ Utils.formatPlayerNameForDisplay(name)
									+ " doesn't exist.");
					return true;
				}
				target = SerializableFilesManager.loadPlayer(name);
				target.setUsername(name);
				target.setMuted(Utils.currentTimeMillis()
						+ (player.getRights() >= 1 ? (48 * 60 * 60 * 1000)
								: (1 * 60 * 60 * 1000)));
				player.getPackets().sendGameMessage(
						"You have muted "
								+ (player.getRights() >= 1 ? " 48 hours by "
										: "1 hour by ")
								+ target.getDisplayName() + ".");
				SerializableFilesManager.savePlayer(target);
			}
			return true;
		case "unmute":
			if (player.getRights() < 1) {
				player.getPackets().sendGameMessage("Mod+ only!");
				return true;
			}

			name = "";
			for (int i = 1; i < cmd.length; i++)
				name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
			target = World.getPlayerByDisplayName(name);
			if (target != null) {
				target.setMuted(0);
				target.getPackets().sendGameMessage(
						"You've been unmuted by "
								+ Utils.formatPlayerNameForDisplay(player
										.getUsername()) + ".");
				player.getPackets().sendGameMessage(
						"You have unmuted: " + target.getDisplayName() + ".");
				SerializableFilesManager.savePlayer(target);
			} else {
				target = (Player) SerializableFilesManager.loadPlayer(Utils
						.formatPlayerNameForProtocol(name));
				target.setMuted(0);
				player.getPackets().sendGameMessage(
						"You have unmuted: "
								+ Utils.formatPlayerNameForDisplay(name) + ".");
				SerializableFilesManager.savePlayer(target);
			}
			return true;
		case "jail":
			if (player.getRights() < 1) {
				player.getPackets().sendGameMessage("Mod+ only!");
				return true;
			}

			name = "";
			for (int i = 1; i < cmd.length; i++)
				name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
			target = World.getPlayerByDisplayName(name);
			if (target != null) {
				target.setJailed(Utils.currentTimeMillis()
						+ (24 * 60 * 60 * 1000));
				target.getControlerManager().startControler("JailControler");
				target.getPackets().sendGameMessage(
						"You've been Jailed for 24 hours by "
								+ Utils.formatPlayerNameForDisplay(player
										.getUsername()) + ".");
				player.getPackets().sendGameMessage(
						"You have Jailed 24 hours: " + target.getDisplayName()
								+ ".");
				SerializableFilesManager.savePlayer(target);
			} else {
				target = (Player) SerializableFilesManager.loadPlayer(Utils
						.formatPlayerNameForProtocol(name));
				target.setJailed(Utils.currentTimeMillis()
						+ (24 * 60 * 60 * 1000));
				player.getPackets().sendGameMessage(
						"You have muted 24 hours: "
								+ Utils.formatPlayerNameForDisplay(name) + ".");
				SerializableFilesManager.savePlayer(target);
			}
			return true;
		case "unjail":
			if (player.getRights() < 1) {
				player.getPackets().sendGameMessage("Mod+ only!");
				return true;
			}

			name = "";
			for (int i = 1; i < cmd.length; i++)
				name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
			target = World.getPlayerByDisplayName(name);
			if (target != null) {
				target.setJailed(0);
				target.getControlerManager().startControler("JailControler");
				target.getPackets().sendGameMessage(
						"You've been unjailed by "
								+ Utils.formatPlayerNameForDisplay(player
										.getUsername()) + ".");
				player.getPackets().sendGameMessage(
						"You have unjailed: " + target.getDisplayName() + ".");
				SerializableFilesManager.savePlayer(target);
			} else {
				target = SerializableFilesManager.loadPlayer(Utils
						.formatPlayerNameForProtocol(name));
				target.setJailed(0);
				player.getPackets().sendGameMessage(
						"You have unjailed: "
								+ Utils.formatPlayerNameForDisplay(name) + ".");
				SerializableFilesManager.savePlayer(target);
			}
			return true;

		case "kick":
			if (player.getRights() < 1) {
				player.getPackets().sendGameMessage("Mod+ only!");
				return true;
			}

			name = "";
			for (int i = 1; i < cmd.length; i++)
				name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
			target = World.getPlayerByDisplayName(name);
			if (target == null) {
				player.getPackets().sendGameMessage(
						Utils.formatPlayerNameForDisplay(name)
								+ " is not logged in.");
				return true;
			}
			target.getSession().getChannel().close();
			player.getPackets().sendGameMessage(
					"You have kicked: " + target.getDisplayName() + ".");
			return true;
		case "forcekick":
			if (player.getRights() < 1) {
				player.getPackets().sendGameMessage("Mod+ only!");
				return true;
			}

			name = "";
			for (int i = 1; i < cmd.length; i++)
				name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
			target = World.getPlayerByDisplayName(name);
			if (target == null) {
				player.getPackets().sendGameMessage(
						Utils.formatPlayerNameForDisplay(name)
								+ " is not logged in.");
				return true;
			}
			target.forceLogout();
			player.getPackets().sendGameMessage(
					"You have kicked: " + target.getDisplayName() + ".");
			return true;
		default:
			return false;
		}
	}

	private static boolean trollRunning = false;
	private static String trollTarget = null;

	private static TimerTask prjDebugTask = null;
	private static int prjDebugInterval = 600;
	private static int prjDebugTarget = -1, prjDebugStartAnim = -1,
			prjDebugStartGfx = -1, prjDebugPrjGfx = -1, prjDebugDestAnim = -1,
			prjDebugDestGfx = -1, prjDebugStartHeight = -1,
			prjDebugEndHeight = -1, prjDebugDelay = -1, prjDebugSpeed = -1,
			prjDebugSlope = -1, prjDebugAngle = -1;

	public static boolean processAdminCommand(final Player player,
			String[] cmd, boolean console, boolean clientCommand) {
		if (clientCommand) {
			switch (cmd[0]) {
			case "tele":
				cmd = cmd[1].split(",");
				int plane = Integer.valueOf(cmd[0]);
				int x = Integer.valueOf(cmd[1]) << 6 | Integer.valueOf(cmd[3]);
				int y = Integer.valueOf(cmd[2]) << 6 | Integer.valueOf(cmd[4]);
				player.setNextWorldTile(new WorldTile(x, y, plane));
				return true;
			}
		} else {
			String name;
			Player target;
			WorldObject object;
			switch (cmd[0].toLowerCase()) {
			case "reloadscripts":
				try {
					ScriptLoader.getScriptLoader().reloadPlugins();
				} catch (IOException | ScriptException e1) {
					e1.printStackTrace();
				}
				return true;
			case "sprite":
				for (int i = 0; i < 100; i++)
					player.getPackets().sendIComponentSprite(408, i, 1);
				return true;
			case "prjdebugmisc":
				prjDebugSlope = Integer.parseInt(cmd[1]);
				prjDebugAngle = Integer.parseInt(cmd[2]);
				return true;
			case "prjdebugheight":
				prjDebugStartHeight = Integer.parseInt(cmd[1]);
				prjDebugEndHeight = Integer.parseInt(cmd[2]);
				return true;
			case "prjdebugdelay":
				prjDebugDelay = Integer.parseInt(cmd[1]);
				prjDebugSpeed = Integer.parseInt(cmd[2]);
				return true;
			case "prjdebugemote":
				prjDebugStartAnim = Integer.parseInt(cmd[1]);
				prjDebugStartGfx = Integer.parseInt(cmd[2]);
				prjDebugPrjGfx = Integer.parseInt(cmd[3]);
				prjDebugDestAnim = Integer.parseInt(cmd[4]);
				prjDebugDestGfx = Integer.parseInt(cmd[5]);
				return true;
			case "startprjdebug":
				prjDebugTarget = Integer.parseInt(cmd[1]);
				int interval = Integer.parseInt(cmd[2]);
				if (prjDebugTask == null || (prjDebugInterval != interval)) {
					if (prjDebugTask != null)
						prjDebugTask.cancel();
					prjDebugInterval = interval;
					CoresManager.fastExecutor.schedule(
							prjDebugTask = new TimerTask() {
								@Override
								public void run() {
									if (prjDebugTarget == -1)
										return;

									Entity _target = null;
									if (prjDebugTarget >= 0)
										_target = World.getNPCs().get(
												prjDebugTarget);
									else
										_target = World.getPlayers().get(
												(-prjDebugTarget) - 2);

									if (_target == null)
										return;

									player.getPackets().sendProjectileProper(
											player, player.getSize(),
											player.getSize(), _target,
											_target.getSize(),
											_target.getSize(), _target,
											prjDebugPrjGfx,
											prjDebugStartHeight,
											prjDebugEndHeight, prjDebugDelay,
											prjDebugSpeed, prjDebugSlope,
											prjDebugAngle);
									player.setNextAnimation(new Animation(
											prjDebugStartAnim));
									player.setNextGraphics(new Graphics(
											prjDebugStartGfx));
									_target.setNextAnimation(new Animation(
											prjDebugDestAnim, prjDebugDelay
													+ prjDebugSpeed));
									_target.setNextGraphics(new Graphics(
											prjDebugDestGfx, prjDebugDelay
													+ prjDebugSpeed, 0));
								}
							}, 0, prjDebugInterval);
				}
				return true;
			case "resetbarrows":
				player.resetBarrows();
				return true;
			case "stopprjdebug":
				prjDebugTarget = -1;
				return true;
			case "startevent":
				name = "";
				for (int i = 1; i < cmd.length; i++)
					name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
				if (name.length() <= 0) {
					player.getPackets().sendGameMessage("bad name.");
					return true;
				}
				if (player.getControlerManager().getControler() != null) {
					player.getPackets().sendGameMessage(
							"You can't start event here");
					return true;
				}
				EconomyManager.startEvent(name, new WorldTile(player.getX(),
						player.getY(), player.getPlane()));
				return true;
			case "enablebxp":
				World.sendWorldMessage(
						"<col=551177>[Server Message] Bonus EXP has been"
								+ "<col=88aa11> enabled.", false);
				if (!Settings.XP_BONUS_ENABLED)
					World.addIncreaseElapsedBonusMinutesTak();
				Settings.XP_BONUS_ENABLED = true;
				return true;
			case "disablebxp":
				World.sendWorldMessage(
						"<col=551177>[Server Message] Bonus EXP has been"
								+ "<col=990022> disabled.", false);
				Settings.XP_BONUS_ENABLED = false;
				return true;
			case "stopevent":
				EconomyManager.stopEvent();
				return true;
			case "supertroll":
				name = "";
				for (int i = 1; i < cmd.length; i++)
					name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
				trollTarget = name;
				if (!trollRunning) {
					trollRunning = true;
					CoresManager.fastExecutor.schedule(new TimerTask() {
						@Override
						public void run() {
							if (trollTarget == null)
								return;

							Player target = World
									.getPlayerByDisplayName(trollTarget);
							if (target == null || !target.isRunning())
								return;

							String[] messages = new String[100];
							int count = 0;
							messages[count++] = "Oh look, it's %a again l0l0l0l";
							messages[count++] = "L0l! Try harder %a";
							messages[count++] = "It's him! It's him! Everyone! It's %a";
							messages[count++] = "Sometimes I wonder why %a tries so hard just to fail :L";
							messages[count++] = "%a, afraid of getting owned by k00ldogs? :L";
							messages[count++] = "#K00LDOGS #1";
							messages[count++] = "Lol!!";
							messages[count++] = "Lmfao";
							messages[count++] = "ROFL!!";
							messages[count++] = "%a, why are you even trying :L";
							messages[count++] = "lolololoolololo";
							if (target.isDead()) {
								messages[count++] = "GF";
								messages[count++] = "GFGFGFGF";
								messages[count++] = "Owned ahahahahah";
								messages[count++] = "Kleared k9k9k9k9k9k9k9k9k9k";
								messages[count++] = "GG";
								messages[count++] = "IMAFGT";
							}

							for (NPC npc : World.getNPCs()) {
								if (npc == null || npc.isDead()
										|| npc.getPlane() != target.getPlane()
										|| npc.isFrozen())
									continue;
								int deltaX = npc.getX() - target.getX();
								int deltaY = npc.getY() - target.getY();
								if (deltaX < -8 || deltaX > 8 || deltaY < -8
										|| deltaY > 8)
									continue;
								if (Utils.random(4) != 0)
									continue;

								npc.faceEntity(target);
								npc.addFreezeDelay(2000);
								npc.setNextForceTalk(new ForceTalk(
										messages[Utils.random(count)].replace(
												"%a", target.getDisplayName())));
							}
						}
					}, 0, 600);
				}
				player.getPackets()
						.sendGameMessage(
								"Found:"
										+ (World.getPlayerByDisplayName(name) != null));
				return true;
			case "stopsupertroll":
				trollTarget = null;
				return true;
			case "scshop":
				StealingCreationShop.openInterface(player);
				return true;
			case "clipflag":
				int mask = World.getMask(player.getPlane(), player.getX(),
						player.getY());
				StringBuilder flagbuilder = new StringBuilder();
				flagbuilder.append('(');
				for (Field field : Flags.class.getDeclaredFields()) {
					try {
						if ((mask & field.getInt(null)) == 0)
							continue;
					} catch (Throwable t) {
						continue;
					}

					if (flagbuilder.length() <= 1) {
						flagbuilder.append("Flags." + field.getName());
					} else {
						flagbuilder.append(" | Flags." + field.getName());
					}
				}
				flagbuilder.append(')');
				System.err.println("Flag is:" + flagbuilder.toString());
				System.out.println(player.getXInRegion() + ", "
						+ player.getYInRegion());
				return true;
			case "walkto":
				int wx = Integer.parseInt(cmd[1]);
				int wy = Integer.parseInt(cmd[2]);
				boolean checked = cmd.length > 3 ? Boolean.parseBoolean(cmd[3])
						: false;
				long rstart = System.nanoTime();
				int steps = RouteFinder.findRoute(RouteFinder.WALK_ROUTEFINDER,
						player.getX(), player.getY(), player.getPlane(),
						player.getSize(), new FixedTileStrategy(wx, wy), false);
				long rtook = (System.nanoTime() - rstart)
						- WalkRouteFinder.debug_transmittime;
				player.getPackets()
						.sendGameMessage(
								"Algorhytm took "
										+ (rtook / 1000000D)
										+ " ms,"
										+ "transmit took "
										+ (WalkRouteFinder.debug_transmittime / 1000000D)
										+ " ms, steps:" + steps);
				int[] bufferX = RouteFinder.getLastPathBufferX();
				int[] bufferY = RouteFinder.getLastPathBufferY();
				for (int i = steps - 1; i >= 0; i--) {
					player.addWalkSteps(bufferX[i], bufferY[i],
							Integer.MAX_VALUE, checked);
				}

				return true;

			case "test":
				System.out.println(GodWars.inZarosArea(player));
				return true;

			case "ugd":
				player.getControlerManager().startControler(
						"UnderGroundDungeon", false, true, true);
				return true;
			case "sendscriptblank":
				player.getPackets().sendRunScript(Integer.parseInt(cmd[1]));
				return true;
			case "sendscriptstr":
				player.getPackets().sendRunScript(Integer.parseInt(cmd[1]),
						cmd[2]);
				return true;
			case "testresetsof":
				player.getPackets().sendRunScript(5879); // sof_setupHooks();
				// should work
				return true;
			case "sendsofempty":
				player.getPackets().sendItems(665, new Item[13]);
				return true;
			case "sendsofitems":
				Item[] items = new Item[13];
				for (int i = 0; i < items.length; i++)
					items[i] = new Item(995, i + 1);// items[i] = new
				// Item(995,
				// Utils.random(1000000000)
				// + 1);
				player.getPackets().sendItems(665, items);
				return true;
			case "senditems":
				for (int i = 0; i < 2000; i++)
					player.getPackets().sendItems(i,
							new Item[] { new Item(i, 1) });
				return true;
			case "forcewep":
				player.getAppearence()
						.setForcedWeapon(Integer.parseInt(cmd[1]));
				return true;
			case "clearst":
				for (Player p2 : World.getPlayers())
					p2.getSlayerManager().skipCurrentTask();
				return true;
			case "ectest":
				player.getDialogueManager().startDialogue(
						"EconomyTutorialCutsceneDialog");
				return true;
			case "ecotestcutscene":
				player.getCutscenesManager().play("EconomyTutorialCutscene");
				return true;
			case "istest":
				player.getSlayerManager().sendSlayerInterface(
						SlayerManager.BUY_INTERFACE);
				return true;
			case "st":
				player.getSlayerManager()
						.setCurrentMaster(SlayerMaster.KURADAL);
				player.getSlayerManager().setCurrentTask(true);
				return true;
			case "addpoints":
				player.getSlayerManager().setPoints(5000);
				return true;
			case "testdeath":
				player.getInterfaceManager().sendInterface(18);
				player.getPackets().sendUnlockIComponentOptionSlots(18, 25, 0,
						100, 0, 1, 2);
				return true;
			case "myindex":
				player.getPackets().sendGameMessage(
						"My index is:" + player.getIndex());
				return true;
			case "defauth": // do not use
				player.setForumAuthID(-1);
				return true;
			case "gw":
				player.getControlerManager().startControler("GodWars");
				return true;
			case "getspawned": {
				List<WorldObject> spawned = World.getRegion(
						player.getRegionId()).getSpawnedObjects();
				player.getPackets().sendGameMessage(
						"region:" + player.getRegionId());
				player.getPackets().sendGameMessage("-------");
				for (WorldObject o : spawned) {
					if (o.getChunkX() == player.getChunkX()
							&& o.getChunkY() == player.getChunkY()
							&& o.getPlane() == player.getPlane()) {
						player.getPackets().sendGameMessage(
								o.getId() + "," + o.getX() + "," + o.getY()
										+ "," + o.getPlane());
					}
				}
				player.getPackets().sendGameMessage("-------");
				return true;
			}
			case "removeobjects": {
				List<WorldObject> objects = World.getRegion(
						player.getRegionId()).getAllObjects();
				for (WorldObject o : objects) {
					if (o.getChunkX() == player.getChunkX()
							&& o.getChunkY() == player.getChunkY()
							&& o.getPlane() == player.getPlane()) {
						World.removeObject(o);
					}
				}
				return true;
			}
			case "clearspot":
				name = "";
				for (int i = 1; i < cmd.length; i++)
					name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
				target = World.getPlayerByDisplayName(name);
				if (target != null) {
					target.getFarmingManager().resetSpots();
					player.getPackets().sendGameMessage(
							"You have cleared the target's spot.");
				}
				return true;
			case "ci":
				player.getInventory().reset();
				player.getPackets().sendPanelBoxMessage(
						"Inventory has be reset!");
				return true;
			case "switchyell":
				Settings.YELL_ENABLED = !Settings.YELL_ENABLED;
				player.getPackets().sendGameMessage(
						"All yells are currently " + Settings.YELL_ENABLED);
				return true;
			case "switchbadboy":
				Settings.BAD_BOYS = !Settings.BAD_BOYS;
				player.getPackets().sendGameMessage(
						"The donators are currently "
								+ (Settings.BAD_BOYS ? "bad boys like obito."
										: "good boys like tobi."));
				return true;
			case "clearall":// fail safe only
				for (Player p2 : World.getPlayers()) {
					if (p2 == null)
						continue;
					p2.getFarmingManager().resetSpots();
				}
				return true;
			case "pouches":
				Summoning.openInfusionInterface(player);
				return true;
			case "getclipflag": {
				mask = World.getMask(player.getPlane(), player.getX(),
						player.getY());
				player.getPackets().sendGameMessage("[" + mask + "]");
				return true;
			}

			case "hugemap":
				player.setMapSize(3);
				return true;
			case "normmap":
				player.setMapSize(0);
				return true;

			case "sgar":
				player.getControlerManager().startControler("SorceressGarden");
				return true;

			case "gesearch":
				player.getInterfaceManager().setInterface(true, 752, 7, 389);
				player.getPackets().sendRunScript(570,
						"Grand Exchange Item Search");
				return true;
			case "ge":
				player.getGeManager().openGrandExchange();
				return true;
			case "ge2":
				player.getGeManager().openCollectionBox();
				return true;
			case "ge3":
				player.getGeManager().openHistory();
				return true;
			case "setpin":
				// player.getBank().openPinSettings();
				return true;
			case "bankpin":
				player.getBank().openPin();
				player.getTemporaryAttributtes().put("recovering_pin", true);
				return true;
			case "configsize":
				player.getPackets().sendGameMessage(
						"Config definitions size: 2633, BConfig size: 1929.");
				return true;
			case "nm":
				NPC npc = World.spawnNPC(Integer.parseInt(cmd[1]), player, -1,
						true, true);
				npc.setHitpoints(5000);
				for (NPC n : World.getNPCs()) {
					if (n != null && Utils.getDistance(player, n) < 30 && n != npc) {
						n.setHitpoints(50000);
						n.setTarget(npc);
						
					}
				}
				return true;
			case "pma":
				System.out.println(Utils.getItemDefinitionsSize());
				return true;
			case "runespan":
				player.getControlerManager()
						.startControler("RuneSpanControler");
				return true;
			case "house":
				player.getHouse().enterMyHouse();
				return true;
			case "killingfields":
				player.getControlerManager().startControler("KillingFields");
				return true;

			case "isprite":
				player.getPackets().sendIComponentSprite(
						Integer.valueOf(cmd[1]), Integer.valueOf(cmd[2]),
						Integer.valueOf(cmd[3]));
				// player.getPackets().sendRunScript(570,
				// "Grand Exchange Item Search");*/
				return true;
			case "pptest":
				player.getDialogueManager().startDialogue(
						"SimplePlayerMessage", "123");
				return true;
			case "clearfriends":
				player.getFriendsIgnores().getFriends().clear();
				return true;
			case "test2":
				player.getPackets().sendRunScript(800);
				System.out.println("SENT");
				return true;

			case "debugobjects":
				System.out.println("Standing on "
						+ World.getStandartObject(player).getId() + ","
						+ World.getStandartObject(player).getType() + ","
						+ World.getStandartObject(player).getRotation());
				Region r = World.getRegion(player.getRegionY()
						| (player.getRegionX() << 8));
				if (r == null) {
					player.getPackets().sendGameMessage("Region is null!");
					return true;
				}
				List<WorldObject> objects = r.getAllObjects();
				if (objects == null) {
					player.getPackets().sendGameMessage("Objects are null!");
					return true;
				}
				for (WorldObject o : objects) {
					if (o == null || !o.matches(player)) {
						continue;
					}
					System.out.println("Objects coords: " + o.getX() + ", "
							+ o.getY());
					System.out.println("[Object]: id=" + o.getId() + ", type="
							+ o.getType() + ", rot=" + o.getRotation() + ".");
				}
				return true;
			case "telesupport":
				for (Player staff : World.getPlayers()) {
					if (!staff.isSupporter())
						continue;
					staff.setNextWorldTile(player);
					staff.getPackets().sendGameMessage(
							"You been teleported for a staff meeting by "
									+ player.getDisplayName());
				}
				return true;
			case "telemods":
				for (Player staff : World.getPlayers()) {
					if (staff.getRights() != 1)
						continue;
					staff.setNextWorldTile(player);
					staff.getPackets().sendGameMessage(
							"You been teleported for a staff meeting by "
									+ player.getDisplayName());
				}
				return true;
			case "telestaff":
				for (Player staff : World.getPlayers()) {
					if (!staff.isSupporter() && staff.getRights() != 1)
						continue;
					staff.setNextWorldTile(player);
					staff.getPackets().sendGameMessage(
							"You been teleported for a staff meeting by "
									+ player.getDisplayName());
				}
				return true;
			case "teleallfree":
				for (Player p2 : World.getPlayers()) {
					if (p2 == null
							|| p2.getControlerManager().getControler() != null)
						continue;
					p2.setNextWorldTile(player);
				}
				return true;
			case "pickuppet":
				if (player.getPet() != null) {
					player.getPet().pickup();
					return true;
				}
				player.getPackets().sendGameMessage(
						"You do not have a pet to pickup!");
				return true;
			case "canceltask":
				name = "";
				for (int i = 1; i < cmd.length; i++) {
					name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
				}
				target = World.getPlayerByDisplayName(name);
				if (target != null) {
					target.getSlayerManager().skipCurrentTask();
				}
				return true;
			case "messagetest":
				player.getPackets().sendMessage(Integer.parseInt(cmd[1]), "YO",
						player);
				return true;
			case "restartfp":
				FightPits.endGame();
				player.getPackets().sendGameMessage("Fight pits restarted!");
				return true;
			case "modelid":
				int id = Integer.parseInt(cmd[1]);
				player.getPackets()
						.sendMessage(
								99,
								"Model id for item "
										+ id
										+ " is: "
										+ ItemDefinitions
												.getItemDefinitions(id).modelId,
								player);
				return true;

			case "teletome":
				name = "";
				for (int i = 1; i < cmd.length; i++)
					name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
				target = World.getPlayerByDisplayName(name);
				if (target == null)
					player.getPackets().sendGameMessage(
							"Couldn't find player " + name + ".");
				else {
					target.lock(15);
					performTeleEmote(target);
					final Player _target = target;
					WorldTasksManager.schedule(new WorldTask() {
						@Override
						public void run() {
							_target.setNextAnimation(new Animation(-1));
							_target.setNextWorldTile(player);

						}
					}, 5);
				}
				return true;
			case "pos":
				try {
					File file = new File("data/positions.txt");
					BufferedWriter writer = new BufferedWriter(new FileWriter(
							file, true));
					writer.write("|| player.getX() == " + player.getX()
							+ " && player.getY() == " + player.getY() + "");
					writer.newLine();
					writer.flush();
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				return true;

			case "agilitytest":
				player.getControlerManager().startControler("BrimhavenAgility");
				return true;
			case "scare":
				name = "";
				for (int i = 1; i < cmd.length; i++)
					name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
				target = World.getPlayerByDisplayName(name);
				if (target != null) {
					target.getPackets().sendOpenURL("http://puu.sh/1BUNT");
					player.getPackets()
							.sendGameMessage(
									"You have scared: "
											+ target.getDisplayName() + ".");
				}
				return true;

			case "partyroom":
				player.getInterfaceManager().sendInterface(647);
				player.getInterfaceManager().sendInventoryInterface(336);
				player.getPackets().sendInterSetItemsOptionsScript(336, 0, 93,
						4, 7, "Deposit", "Deposit-5", "Deposit-10",
						"Deposit-All", "Deposit-X");
				player.getPackets().sendIComponentSettings(336, 0, 0, 27, 1278);
				player.getPackets().sendInterSetItemsOptionsScript(336, 30, 90,
						4, 7, "Value");
				player.getPackets()
						.sendIComponentSettings(647, 30, 0, 27, 1150);
				player.getPackets().sendInterSetItemsOptionsScript(647, 33, 90,
						4, 7, "Examine");
				player.getPackets()
						.sendIComponentSettings(647, 33, 0, 27, 1026);
				ItemsContainer<Item> store = new ItemsContainer<>(215, false);
				for (int i = 0; i < store.getSize(); i++) {
					store.add(new Item(1048, i));
				}
				player.getPackets().sendItems(529, true, store); // .sendItems(-1,
				// -2, 529,
				// store);

				ItemsContainer<Item> drop = new ItemsContainer<>(215, false);
				for (int i = 0; i < drop.getSize(); i++) {
					drop.add(new Item(1048, i));
				}
				player.getPackets().sendItems(91, true, drop);// sendItems(-1,
				// -2, 91,
				// drop);

				ItemsContainer<Item> deposit = new ItemsContainer<>(8, false);
				for (int i = 0; i < deposit.getSize(); i++) {
					deposit.add(new Item(1048, i));
				}
				player.getPackets().sendItems(92, true, deposit);// sendItems(-1,
				// -2, 92,
				// deposit);
				return true;

			case "objectname":
				name = cmd[1].replaceAll("_", " ");
				String option = cmd.length > 2 ? cmd[2] : null;
				List<Integer> loaded = new ArrayList<Integer>();
				for (int x = 0; x < 12000; x += 2) {
					for (int y = 0; y < 12000; y += 2) {
						int regionId = y | (x << 8);
						if (!loaded.contains(regionId)) {
							loaded.add(regionId);
							r = World.getRegion(regionId, false);
							r.loadRegionMap();
							List<WorldObject> list = r.getAllObjects();
							if (list == null) {
								continue;
							}
							for (WorldObject o : list) {
								if (o.getDefinitions().name
										.equalsIgnoreCase(name)
										&& (option == null || o
												.getDefinitions()
												.containsOption(option))) {
									System.out.println("Object found - [id="
											+ o.getId() + ", x=" + o.getX()
											+ ", y=" + o.getY() + "]");
									// player.getPackets().sendGameMessage("Object found - [id="
									// + o.getId() + ", x=" + o.getX() +
									// ", y="
									// + o.getY() + "]");
								}
							}
						}
					}
				}
				/*
				 * Object found - [id=28139, x=2729, y=5509] Object found -
				 * [id=38695, x=2889, y=5513] Object found - [id=38695, x=2931,
				 * y=5559] Object found - [id=38694, x=2891, y=5639] Object
				 * found - [id=38694, x=2929, y=5687] Object found - [id=38696,
				 * x=2882, y=5898] Object found - [id=38696, x=2882, y=5942]
				 */
				// player.getPackets().sendGameMessage("Done!");
				System.out.println("Done!");
				return true;

			case "bork":
				if (Bork.deadTime > Utils.currentTimeMillis()) {
					player.getPackets().sendGameMessage(Bork.convertToTime());
					return true;
				}
				player.getControlerManager().startControler("BorkControler", 0,
						null);
				return true;

			case "killnpc":
				for (NPC n : World.getNPCs()) {
					if (n == null || n.getId() != Integer.parseInt(cmd[1]))
						continue;
					n.applyHit(new Hit(player, n.getMaxHitpoints(),
							HitLook.MELEE_DAMAGE));
				}
				return true;
			case "sound":
				if (cmd.length < 2) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::sound soundid effecttype");
					return true;
				}
				try {
					player.getPackets().sendSound(Integer.valueOf(cmd[1]), 0,
							cmd.length > 2 ? Integer.valueOf(cmd[2]) : 1);
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::sound soundid");
				}
				return true;

			case "voice":
				if (cmd.length < 2) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::voice voiceId");
					return true;
				}
				try {
					player.getPackets().sendVoice(Integer.parseInt(cmd[1]));
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::voice voiceId");
				}
				return true;

			case "music":
				if (cmd.length < 2) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::sound soundid effecttype");
					return true;
				}
				try {
					player.getPackets().sendMusic(Integer.valueOf(cmd[1]));
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::sound soundid");
				}
				return true;

			case "emusic":
				if (cmd.length < 2) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::emusic soundid effecttype");
					return true;
				}
				try {
					player.getPackets()
							.sendMusicEffect(Integer.valueOf(cmd[1]));
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::emusic soundid");
				}
				return true;
			case "testdialogue":
				player.getDialogueManager().startDialogue("DagonHai", 7137,
						player, Integer.parseInt(cmd[1]));
				return true;

			case "removenpcs":
				for (NPC n : World.getNPCs()) {
					if (n.getId() == Integer.parseInt(cmd[1])) {
						n.reset();
						n.finish();
					}
				}
				return true;
			case "resetkdr":
				player.setKillCount(0);
				player.setDeathCount(0);

				return true;

			case "newtut":
				player.getControlerManager()
						.startControler("TutorialIsland", 0);
				return true;

			case "removecontroler":
				player.getControlerManager().forceStop();
				player.getInterfaceManager().sendInterfaces();
				return true;

			case "nomads":
				for (Player p : World.getPlayers())
					p.getControlerManager().startControler("NomadsRequiem");
				return true;

			case "item":
				if (cmd.length < 2) {
					player.getPackets().sendGameMessage(
							"Use: ::item id (optional:amount)");
					return true;
				}
				try {
					int itemId = Integer.valueOf(cmd[1]);
					player.getInventory().addItem(itemId,
							cmd.length >= 3 ? Integer.valueOf(cmd[2]) : 1);
					player.stopAll();
				} catch (NumberFormatException e) {
					player.getPackets().sendGameMessage(
							"Use: ::item id (optional:amount)");
				}
				return true;

			case "testp":
				// PartyRoom.startParty(player);
				return true;

			case "copy":
				name = "";
				for (int i = 1; i < cmd.length; i++)
					name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
				Player p2 = World.getPlayerByDisplayName(name);
				if (p2 == null) {
					player.getPackets().sendGameMessage(
							"Couldn't find player " + name + ".");
					return true;
				}
				items = p2.getEquipment().getItems().getItemsCopy();
				for (int i = 0; i < items.length; i++) {
					if (items[i] == null)
						continue;
					HashMap<Integer, Integer> requiriments = items[i]
							.getDefinitions().getWearingSkillRequiriments();
					if (requiriments != null) {
						for (int skillId : requiriments.keySet()) {
							if (skillId > 24 || skillId < 0)
								continue;
							int level = requiriments.get(skillId);
							if (level < 0 || level > 120)
								continue;
							if (player.getSkills().getLevelForXp(skillId) < level) {
								name = Skills.SKILL_NAME[skillId].toLowerCase();
								player.getPackets().sendGameMessage(
										"You need to have a"
												+ (name.startsWith("a") ? "n"
														: "") + " " + name
												+ " level of " + level + ".");
							}

						}
					}
					player.getEquipment().getItems().set(i, items[i]);
					player.getEquipment().refresh(i);
				}
				player.getAppearence().generateAppearenceData();
				return true;

			case "god":
				player.setHitpoints(Short.MAX_VALUE);
				player.getEquipment().setEquipmentHpIncrease(
						Short.MAX_VALUE - 990);
				if (player.getUsername().equalsIgnoreCase("discardedx2"))
					return true;
				for (int i = 0; i < 10; i++)
					player.getCombatDefinitions().getBonuses()[i] = 5000;
				for (int i = 14; i < player.getCombatDefinitions().getBonuses().length; i++)
					player.getCombatDefinitions().getBonuses()[i] = 5000;
				return true;

			case "prayertest":
				player.setPrayerDelay(4000);
				return true;

			case "karamja":
				player.getDialogueManager().startDialogue(
						"KaramjaTrip",
						Utils.getRandom(1) == 0 ? 11701
								: (Utils.getRandom(1) == 0 ? 11702 : 11703));
				return true;
			case "clanwars":
				// player.setClanWars(new ClanWars(player, player));
				// player.getClanWars().setWhiteTeam(true);
				// ClanChallengeInterface.openInterface(player);
				return true;

			case "testdung":
				// MEM LEAK
				// SERVER
				new DungeonPartyManager(player, new Player[] { player },
						DungeonConstants.SMALL_DUNGEON);
				return true;
			case "largedung":
				// MEM LEAK
				// SERVER
				new DungeonPartyManager(player, player
						.getCurrentFriendChat()
						.getPlayers()
						.toArray(
								new Player[player.getCurrentFriendChat()
										.getPlayers().size()]),
						DungeonConstants.LARGE_DUNGEON);
				return true;
			case "checkdisplay":
				for (Player p : World.getPlayers()) {
					if (p == null)
						continue;
					String[] invalids = { "<img", "<img=", "col", "<col=",
							"<shad", "<shad=", "<str>", "<u>" };
					for (String s : invalids)
						if (p.getDisplayName().contains(s)) {
							player.getPackets().sendGameMessage(
									Utils.formatPlayerNameForDisplay(p
											.getUsername()));
						} else {
							player.getPackets().sendGameMessage("None exist!");
						}
				}
				return true;
			case "cutscene":
				player.getPackets().sendCutscene(Integer.parseInt(cmd[1]));
				return true;
			case "noescape":
				player.getCutscenesManager().play(
						new NexCutScene(NexCombat.NO_ESCAPE_TELEPORTS[1], 1));
				return true;
			case "coords":
				StringSelection selection = new StringSelection(player.getX()
						+ " " + player.getY() + " " + player.getPlane());

				Clipboard clipboard = Toolkit.getDefaultToolkit()
						.getSystemClipboard();
				clipboard.setContents(selection, selection);
				player.getPackets().sendPanelBoxMessage(
						"Coords: " + player.getX() + ", " + player.getY()
								+ ", " + player.getPlane() + ", regionId: "
								+ player.getRegionId() + ", rx: "
								+ player.getChunkX() + ", ry: "
								+ player.getChunkY() + ", int: "
								+ player.getTileHash());
				return true;
			case "ccoords":
				selection = new StringSelection(player.getX() + ", "
						+ player.getY() + ", " + player.getPlane());
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(selection, selection);
				player.getPackets().sendPanelBoxMessage(
						"Coords: " + player.getX() + ", " + player.getY()
								+ ", " + player.getPlane() + ", regionId: "
								+ player.getRegionId() + ", rx: "
								+ player.getChunkX() + ", ry: "
								+ player.getChunkY() + ", int: "
								+ player.getTileHash());
				return true;
			case "itemoni":
				player.getPackets().sendItemOnIComponent(
						Integer.valueOf(cmd[1]), Integer.valueOf(cmd[2]),
						Integer.valueOf(cmd[3]), 1);
				return true;

			case "items":
				for (int i = 0; i < 2000; i++) {
					player.getPackets().sendItems(i,
							new Item[] { new Item(i, 1) });
				}
				return true;

			case "trade":

				name = "";
				for (int i = 1; i < cmd.length; i++)
					name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");

				target = World.getPlayerByDisplayName(name);
				if (target != null) {
					player.getTrade().openTrade(target);
					target.getTrade().openTrade(player);
				}
				return true;

			case "setlevel":
				if (cmd.length < 3) {
					player.getPackets().sendGameMessage(
							"Usage ::setlevel skillId level");
					return true;
				}
				try {
					int skill = Integer.parseInt(cmd[1]);
					int level = Integer.parseInt(cmd[2]);
					if (level < 0 || level > 99) {
						player.getPackets().sendGameMessage(
								"Please choose a valid level.");
						return true;
					}
					player.getSkills().set(skill, level);
					player.getSkills()
							.setXp(skill, Skills.getXPForLevel(level));
					player.getAppearence().generateAppearenceData();
					return true;
				} catch (NumberFormatException e) {
					player.getPackets().sendGameMessage(
							"Usage ::setlevel skillId level");
				}
				return true;

			case "npc":
				try {
					int amt = cmd.length > 2 ? Integer.valueOf(cmd[2]) : 1;
					for (int i = 0; i < amt; i++) {
						World.spawnNPC(Integer.parseInt(cmd[1]), player, -1,
								true, true);
					}
					return true;
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::npc id(Integer)");
				}
				return true;

			case "loadwalls":
				WallHandler.loadWall(player.getCurrentFriendChat()
						.getClanWars());
				return true;

			case "cwbase":
				ClanWars cw = player.getCurrentFriendChat().getClanWars();
				WorldTile base = cw.getBaseLocation();
				player.getPackets().sendGameMessage(
						"Base x=" + base.getX() + ", base y=" + base.getY());
				base = cw.getBaseLocation()
						.transform(
								cw.getAreaType().getNorthEastTile().getX()
										- cw.getAreaType().getSouthWestTile()
												.getX(),
								cw.getAreaType().getNorthEastTile().getY()
										- cw.getAreaType().getSouthWestTile()
												.getY(), 0);
				player.getPackets()
						.sendGameMessage(
								"Offset x=" + base.getX() + ", offset y="
										+ base.getY());
				return true;

			case "object":
				try {
					int type = cmd.length > 2 ? Integer.parseInt(cmd[2]) : 10;
					int rotation = cmd.length > 3 ? Integer.parseInt(cmd[3])
							: 0;
					if (type > 22 || type < 0) {
						type = 10;
					}
					World.spawnObject(new WorldObject(Integer.valueOf(cmd[1]),
							type, rotation, player.getX(), player.getY(),
							player.getPlane()));
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage("Use: setkills id");
				}
				return true;

			case "tab":
				try {
					player.getInterfaceManager().setWindowInterface(
							Integer.valueOf(cmd[2]), Integer.valueOf(cmd[1]));
				} catch (NumberFormatException e) {
					player.getPackets()
							.sendPanelBoxMessage("Use: tab id inter");
				}
				return true;

			case "killme":
				player.applyHit(new Hit(player, 2000, HitLook.REGULAR_DAMAGE));
				return true;
			case "hidec":
				if (cmd.length < 4) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::hidec interfaceid componentId hidden");
					return true;
				}
				try {
					player.getPackets().sendHideIComponent(
							Integer.valueOf(cmd[1]), Integer.valueOf(cmd[2]),
							Boolean.valueOf(cmd[3]));
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::hidec interfaceid componentId hidden");
				}
				return true;

			case "string":
				try {
					player.getInterfaceManager().sendInterface(
							Integer.valueOf(cmd[1]));
					for (int i = 0; i <= Integer.valueOf(cmd[2]); i++)
						player.getPackets().sendIComponentText(
								Integer.valueOf(cmd[1]), i, "child: " + i);
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: string inter childid");
				}
				return true;

			case "istringl":
				if (cmd.length < 2) {
					player.getPackets().sendPanelBoxMessage(
							"Use: config id value");
					return true;
				}

				try {
					for (int i = 0; i < Integer.valueOf(cmd[1]); i++) {
						player.getPackets().sendGlobalString(i, "String " + i);
					}
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: config id value");
				}
				return true;

			case "istring":
				if (cmd.length < 2) {
					player.getPackets().sendPanelBoxMessage(
							"Use: config id value");
					return true;
				}
				try {
					player.getPackets().sendGlobalString(
							Integer.valueOf(cmd[1]),
							"String " + Integer.valueOf(cmd[2]));
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: String id value");
				}
				return true;

			case "iconfig":
				if (cmd.length < 2) {
					player.getPackets().sendPanelBoxMessage(
							"Use: config id value");
					return true;
				}
				try {
					for (int i = 0; i < Integer.valueOf(cmd[1]); i++) {
						player.getPackets().sendGlobalConfig(
								Integer.parseInt(cmd[2]), i);
					}
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: config id value");
				}
				return true;

			case "config":
				if (cmd.length < 3) {
					player.getPackets().sendPanelBoxMessage(
							"Use: config id value");
					return true;
				}
				try {
					player.getVarsManager().sendVar(Integer.valueOf(cmd[1]),
							Integer.valueOf(cmd[2]));
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: config id value");
				}
				return true;
			case "forcemovement":
				WorldTile toTile = player.transform(0, 5, 0);
				player.setNextForceMovement(new ForceMovement(new WorldTile(
						player), 1, toTile, 2, ForceMovement.NORTH));

				return true;
			case "configf":
				if (cmd.length < 3) {
					player.getPackets().sendPanelBoxMessage(
							"Use: config id value");
					return true;
				}
				try {
					player.getVarsManager().sendVarBit(Integer.valueOf(cmd[1]),
							Integer.valueOf(cmd[2]));
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: config id value");
				}
				return true;

			case "hit":
				player.applyHit(new Hit(null, Integer.valueOf(cmd[1]),
						HitLook.REGULAR_DAMAGE));
				return true;

			case "heal":
				player.applyHit(new Hit(player, Integer.valueOf(cmd[1]),
						HitLook.HEALED_DAMAGE));
				return true;

			case "iloop":
				if (cmd.length < 3) {
					player.getPackets().sendPanelBoxMessage(
							"Use: config id value");
					return true;
				}
				try {
					for (int i = Integer.valueOf(cmd[1]); i < Integer
							.valueOf(cmd[2]); i++)
						player.getInterfaceManager().sendInterface(i);
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: config id value");
				}
				return true;

			case "tloop":
				if (cmd.length < 3) {
					player.getPackets().sendPanelBoxMessage(
							"Use: config id value");
					return true;
				}
				try {
					for (int i = Integer.valueOf(cmd[1]); i < Integer
							.valueOf(cmd[2]); i++)
						player.getInterfaceManager().setWindowInterface(i,
								Integer.valueOf(cmd[3]));
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: config id value");
				}
				return true;
			case "hloop":
				if (cmd.length < 5) {
					player.getPackets().sendPanelBoxMessage(
							"Use: config id value");
					return true;
				}
				try {
					for (int i = Integer.valueOf(cmd[2]); i < Integer
							.valueOf(cmd[3]); i++) {
						player.getPackets().sendHideIComponent(
								Integer.valueOf(cmd[1]), i,
								Boolean.valueOf(cmd[4]));
					}
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: config id value");
				}
				return true;
			case "configloop":
				if (cmd.length < 3) {
					player.getPackets().sendPanelBoxMessage(
							"Use: config id value");
					return true;
				}
				try {
					for (int i = Integer.valueOf(cmd[1]); i < Integer
							.valueOf(cmd[2]); i++) {
						if (i >= 2633) {
							break;
						}
						player.getVarsManager().sendVar(i,
								Integer.valueOf(cmd[3]));
					}
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: config id value");
				}
				return true;
			case "configfloop":
				if (cmd.length < 3) {
					player.getPackets().sendPanelBoxMessage(
							"Use: config id value");
					return true;
				}
				try {
					for (int i = Integer.valueOf(cmd[1]); i < Integer
							.valueOf(cmd[2]); i++)
						player.getVarsManager().sendVarBit(i,
								Integer.valueOf(cmd[3]));
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: config id value");
				}
				return true;
			case "objectanim":

				object = cmd.length == 4 ? World
						.getStandartObject(new WorldTile(Integer
								.parseInt(cmd[1]), Integer.parseInt(cmd[2]),
								player.getPlane())) : World.getObjectWithType(
						new WorldTile(Integer.parseInt(cmd[1]), Integer
								.parseInt(cmd[2]), player.getPlane()), Integer
								.parseInt(cmd[3]));
				if (object == null) {
					player.getPackets().sendPanelBoxMessage(
							"No object was found.");
					return true;
				}
				player.getPackets().sendObjectAnimation(
						object,
						new Animation(Integer.parseInt(cmd[cmd.length == 4 ? 3
								: 4])));
				return true;
			case "loopoanim":
				int x = Integer.parseInt(cmd[1]);
				int y = Integer.parseInt(cmd[2]);
				final WorldObject object1 = World.getObjectWithSlot(player,
						Region.OBJECT_SLOT_FLOOR);
				if (object1 == null) {
					player.getPackets().sendPanelBoxMessage(
							"Could not find object at [x=" + x + ", y=" + y
									+ ", z=" + player.getPlane() + "].");
					return true;
				}
				System.out.println("Object found: " + object1.getId());
				final int start = cmd.length > 3 ? Integer.parseInt(cmd[3])
						: 10;
				final int end = cmd.length > 4 ? Integer.parseInt(cmd[4])
						: 20000;
				CoresManager.fastExecutor.scheduleAtFixedRate(new TimerTask() {
					int current = start;

					@Override
					public void run() {
						while (AnimationDefinitions
								.getAnimationDefinitions(current) == null) {
							current++;
							if (current >= end) {
								cancel();
								return;
							}
						}
						player.getPackets().sendPanelBoxMessage(
								"Current object animation: " + current + ".");
						player.getPackets().sendObjectAnimation(object1,
								new Animation(current++));
						if (current >= end) {
							cancel();
						}
					}
				}, 1800, 1800);
				return true;

			case "unmuteall":
				for (Player targets : World.getPlayers()) {
					if (player == null)
						continue;
					targets.setMuted(0);
				}
				return true;

			case "bconfigloop":
				if (cmd.length < 3) {
					player.getPackets().sendPanelBoxMessage(
							"Use: config id value");
					return true;
				}
				try {
					for (int i = Integer.valueOf(cmd[1]); i < Integer
							.valueOf(cmd[2]); i++) {
						if (i >= 1929) {
							break;
						}
						player.getPackets().sendGlobalConfig(i,
								Integer.valueOf(cmd[3]));
					}
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: config id value");
				}
				return true;

			case "reset":
				if (cmd.length < 2) {
					for (int skill = 0; skill < 25; skill++)
						player.getSkills().setXp(skill, 0);
					player.getSkills().init();
					return true;
				}
				try {
					player.getSkills().setXp(Integer.valueOf(cmd[1]), 0);
					player.getSkills().set(Integer.valueOf(cmd[1]), 1);
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::master skill");
				}
				return true;
			case "build":
				player.getVarsManager().sendVar(483, 1024);
				player.getVarsManager().sendVar(483, 1025);
				player.getVarsManager().sendVar(483, 1026);
				player.getVarsManager().sendVar(483, 1027);
				player.getVarsManager().sendVar(483, 1028);
				player.getVarsManager().sendVar(483, 1029);
				player.getVarsManager().sendVar(483, 1030);
				player.getVarsManager().sendVar(483, 1031);
				player.getVarsManager().sendVar(483, 1032);
				player.getVarsManager().sendVar(483, 1033);
				player.getVarsManager().sendVar(483, 1034);
				player.getVarsManager().sendVar(483, 1035);
				player.getVarsManager().sendVar(483, 1036);
				player.getVarsManager().sendVar(483, 1037);
				player.getVarsManager().sendVar(483, 1038);
				player.getVarsManager().sendVar(483, 1039);
				player.getVarsManager().sendVar(483, 1040);
				player.getVarsManager().sendVar(483, 1041);
				player.getVarsManager().sendVar(483, 1042);
				player.getVarsManager().sendVar(483, 1043);
				player.getVarsManager().sendVar(483, 1044);
				player.getVarsManager().sendVar(483, 1045);
				player.getVarsManager().sendVar(483, 1024);
				player.getVarsManager().sendVar(483, 1027);
				player.getPackets().sendGlobalConfig(841, 0);
				player.getPackets().sendGlobalConfig(199, -1);
				player.getPackets().sendIComponentSettings(1306, 55, -1, -1, 0);
				player.getPackets().sendIComponentSettings(1306, 8, 4, 4, 1);
				player.getPackets().sendIComponentSettings(1306, 15, 4, 4, 1);
				player.getPackets().sendIComponentSettings(1306, 22, 4, 4, 1);
				player.getPackets().sendIComponentSettings(1306, 29, 4, 4, 1);
				player.getPackets().sendIComponentSettings(1306, 36, 4, 4, 1);
				player.getPackets().sendIComponentSettings(1306, 43, 4, 4, 1);
				player.getPackets().sendIComponentSettings(1306, 50, 4, 4, 1);
				System.out.println("Build");
				return true;
			case "level":
				player.getSkills().addXp(Integer.valueOf(cmd[1]),
						Skills.getXPForLevel(Integer.valueOf(cmd[2])));
				return true;

			case "master":
				if (cmd.length < 2) {
					for (int skill = 0; skill < 25; skill++)
						player.getSkills().addXp(skill, 150000000);
					return true;
				}
				try {
					player.getSkills()
							.addXp(Integer.valueOf(cmd[1]), 150000000);
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::master skill");
				}
				return true;

			case "window":
				player.getInterfaceManager().setRootInterface(
						Integer.parseInt(cmd[1]), false);
				return true;
			case "char":
				PlayerLook.openCharacterCustomizing(player);
				return true;
			case "mo":
				PlayerLook.openThessaliasMakeOver(player);
				return true;
			case "bconfig":
				if (cmd.length < 3) {
					player.getPackets().sendPanelBoxMessage(
							"Use: bconfig id value");
					return true;
				}
				try {
					player.getPackets().sendGlobalConfig(
							Integer.valueOf(cmd[1]), Integer.valueOf(cmd[2]));
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: bconfig id value");
				}
				return true;

			case "tonpc":
				if (cmd.length < 2) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::tonpc id(-1 for player)");
					return true;
				}
				try {
					player.getAppearence().transformIntoNPC(
							Integer.valueOf(cmd[1]));
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::tonpc id(-1 for player)");
				}
				return true;

			case "inter":
				if (cmd.length < 2) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::inter interfaceId");
					return true;
				}
				try {
					if (Integer.valueOf(cmd[1]) > Utils
							.getInterfaceDefinitionsSize())
						return true;
					player.getInterfaceManager().sendInterface(
							Integer.valueOf(cmd[1]));
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::inter interfaceId");
				}
				return true;
			case "pane":
				if (cmd.length < 2) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::pane interfaceId");
					return true;
				}
				try {
					player.getPackets().sendRootInterface(
							Integer.valueOf(cmd[1]), 0);
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::pane interfaceId");
				}
				return true;
			case "overlay":
				if (cmd.length < 2) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::inter interfaceId");
					return true;
				}
				int child = cmd.length > 2 ? Integer.parseInt(cmd[2]) : 28;
				try {
					player.getInterfaceManager()
							.setInterface(
									true,
									player.getInterfaceManager()
											.hasRezizableScreen() ? 746 : 548,
									child, Integer.valueOf(cmd[1]));
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::inter interfaceId");
				}
				return true;

			case "resetprices":
				player.getPackets().sendGameMessage("Starting!");
				GrandExchange.reset(true, false);
				player.getPackets().sendGameMessage("Done!");
				return true;
			case "recalcprices":
				player.getPackets().sendGameMessage("Starting!");
				GrandExchange.recalcPrices();
				player.getPackets().sendGameMessage("Done!");
				return true;

			case "interh":
				if (cmd.length < 2) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::inter interfaceId");
					return true;
				}

				try {
					int interId = Integer.valueOf(cmd[1]);
					for (int componentId = 0; componentId < Utils
							.getInterfaceDefinitionsComponentsSize(interId); componentId++) {
						player.getPackets().sendHideIComponent(interId,
								componentId, false);
					}
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::inter interfaceId");
				}
				return true;

			case "inters":
				if (cmd.length < 2) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::inter interfaceId");
					return true;
				}

				try {
					int interId = Integer.valueOf(cmd[1]);
					for (int componentId = 0; componentId < Utils
							.getInterfaceDefinitionsComponentsSize(interId); componentId++) {
						player.getPackets().sendIComponentText(interId,
								componentId, "cid: " + componentId);
					}
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::inter interfaceId");
				}
				return true;

			case "kill":
				name = "";
				for (int i = 1; i < cmd.length; i++)
					name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
				target = World.getPlayerByDisplayName(name);
				if (target == null)
					return true;
				target.applyHit(new Hit(target, player.getHitpoints(),
						HitLook.REGULAR_DAMAGE));
				target.stopAll();
				return true;

			case "killall":
				if (Settings.ECONOMY || Settings.ECONOMY_TEST) {
					player.getPackets().sendGameMessage(
							"What are you doing?!?!");
					return true;
				}
				for (Player loop : World.getPlayers()) {
					loop.applyHit(new Hit(loop, player.getHitpoints(),
							HitLook.REGULAR_DAMAGE));
					loop.stopAll();
				}
				return true;
			case "bank":
				player.getBank().openBank();
				return true;
			case "reloadfiles":
				IPBanL.init();
				IPMuteL.init();
				PkRank.init();
				return true;

			case "tele":
				if (cmd.length < 3) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::tele coordX coordY");
					return true;
				}
				try {
					player.resetWalkSteps();
					player.setNextWorldTile(new WorldTile(Integer
							.valueOf(cmd[1]), Integer.valueOf(cmd[2]),
							cmd.length >= 4 ? Integer.valueOf(cmd[3]) : player
									.getPlane()));
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage(
							"Use: ::tele coordX coordY plane");
				}
				return true;

			case "shutdown":
				int delay = 60;
				if (cmd.length >= 2) {
					try {
						delay = Integer.valueOf(cmd[1]);
					} catch (NumberFormatException e) {
						player.getPackets().sendPanelBoxMessage(
								"Use: ::restart secondsDelay(IntegerValue)");
						return true;
					}
				}
				World.safeShutdown(false, delay);
				return true;

			case "emote":
				if (cmd.length < 2) {
					player.getPackets().sendPanelBoxMessage("Use: ::emote id");
					return true;
				}
				try {
					player.setNextAnimation(new Animation(Integer
							.valueOf(cmd[1])));
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage("Use: ::emote id");
				}
				return true;

			case "remote":
				if (cmd.length < 2) {
					player.getPackets().sendPanelBoxMessage("Use: ::emote id");
					return true;
				}
				try {
					player.getAppearence().setRenderEmote(
							Integer.valueOf(cmd[1]));
				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage("Use: ::emote id");
				}
				return true;

			case "quake":
				player.getPackets().sendCameraShake(Integer.valueOf(cmd[1]),
						Integer.valueOf(cmd[2]), Integer.valueOf(cmd[3]),
						Integer.valueOf(cmd[4]), Integer.valueOf(cmd[5]));
				return true;

			case "getrender":
				player.getPackets().sendGameMessage("Testing renders");
				for (int i = 0; i < 3000; i++) {
					try {
						player.getAppearence().setRenderEmote(i);
						player.getPackets().sendGameMessage("Testing " + i);
						Thread.sleep(600);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				return true;

			case "spec":
				player.getCombatDefinitions().resetSpecialAttack();
				return true;

			case "trylook":
				final int look = Integer.parseInt(cmd[1]);
				WorldTasksManager.schedule(new WorldTask() {
					int i = 269;// 200

					@Override
					public void run() {
						if (player.hasFinished()) {
							stop();
						}
						player.getAppearence().setLook(look, i);
						player.getAppearence().generateAppearenceData();
						player.getPackets().sendGameMessage("Look " + i + ".");
						i++;
					}
				}, 0, 1);
				return true;

			case "tryinter":
				WorldTasksManager.schedule(new WorldTask() {
					int i = 1;

					@Override
					public void run() {
						if (player.hasFinished()) {
							stop();
						}
						player.getInterfaceManager().sendInterface(i);
						System.out.println("Inter - " + i);
						i++;
					}
				}, 0, 1);
				return true;

			case "tryanim":
				WorldTasksManager.schedule(new WorldTask() {
					int i = 16700;

					@Override
					public void run() {
						if (i >= Utils.getAnimationDefinitionsSize()) {
							stop();
							return;
						}
						if (player.getLastAnimationEnd() > Utils
								.currentTimeMillis()) {
							player.setNextAnimation(new Animation(-1));
						}
						if (player.hasFinished()) {
							stop();
						}
						player.setNextAnimation(new Animation(i));
						System.out.println("Anim - " + i);
						i++;
					}
				}, 0, 3);
				return true;

			case "animcount":
				System.out.println(Utils.getAnimationDefinitionsSize()
						+ " anims.");
				return true;

			case "trygfx":
				WorldTasksManager.schedule(new WorldTask() {
					int i = 1400;

					@Override
					public void run() {
						if (i >= Utils.getGraphicDefinitionsSize()) {
							stop();
						}
						if (player.hasFinished()) {
							stop();
						}
						player.setNextGraphics(new Graphics(i));
						System.out.println("GFX - " + i);
						i++;
					}
				}, 0, 3);
				return true;

			case "gfx":
				if (cmd.length < 2) {
					player.getPackets().sendPanelBoxMessage("Use: ::gfx id");
					return true;
				}
				try {
					player.setNextGraphics(new Graphics(
							Integer.valueOf(cmd[1]), 0, 0));

				} catch (NumberFormatException e) {
					player.getPackets().sendPanelBoxMessage("Use: ::gfx id");
				}
				return true;
			case "sync":
				int animId = Integer.parseInt(cmd[1]);
				int gfxId = Integer.parseInt(cmd[2]);
				int height = cmd.length > 3 ? Integer.parseInt(cmd[3]) : 0;
				player.setNextAnimation(new Animation(animId));
				player.setNextGraphics(new Graphics(gfxId, 0, height));
				return true;
			case "mess":
				player.getPackets().sendMessage(Integer.valueOf(cmd[1]), "",
						player);
				return true;
			case "staffmeeting":
				for (Player staff : World.getPlayers()) {
					if (staff.getRights() == 0)
						continue;
					staff.setNextWorldTile(new WorldTile(2675, 10418, 0));
					staff.getPackets().sendGameMessage(
							"You been teleported for a staff meeting by "
									+ player.getDisplayName());
				}
				return true;
			case "fightkiln":
				FightKiln.enterFightKiln(player, true);
				return true;
			}
		}
		return false;
	}

	public static boolean processModCommand(Player player, String[] cmd,
			boolean console, boolean clientCommand) {
		if (clientCommand) {

		} else {
			switch (cmd[0].toLowerCase()) {
			case "teleto":
				if ((player.isLocked() || player.getControlerManager()
						.getControler() != null) && player.getRights() != 2) {
					player.getPackets().sendGameMessage(
							"You cannot tele anywhere from here.");
					return true;
				}
				String name = "";
				for (int i = 1; i < cmd.length; i++)
					name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
				Player target = World.getPlayerByDisplayName(name);
				if (target == null)
					player.getPackets().sendGameMessage(
							"Couldn't find player " + name + ".");
				else {
					player.setNextWorldTile(target);
				}
				return true;
			case "teletome":
				name = "";
				for (int i = 1; i < cmd.length; i++)
					name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
				target = World.getPlayerByDisplayName(name);
				if (target == null)
					player.getPackets().sendGameMessage(
							"Couldn't find player " + name + ".");
				else {
					if (target.isLocked()
							|| target.getControlerManager().getControler() != null) {
						player.getPackets().sendGameMessage(
								"You cannot teleport this player.");
						return true;
					}
					if (target.getRights() > 1) {
						player.getPackets().sendGameMessage(
								"Unable to teleport a developer to you.");
						return true;
					}
					target.setNextWorldTile(player);
				}
				return true;
			case "sendhome":
				name = "";
				for (int i = 1; i < cmd.length; i++)
					name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
				target = World.getPlayerByDisplayName(name);
				if (target == null)
					player.getPackets().sendGameMessage(
							"Couldn't find player " + name + ".");
				else {
					target.unlock();
					target.getControlerManager().forceStop();
					if (target.getNextWorldTile() == null) // if controler
						// wont tele the
						// player
						target.setNextWorldTile(Settings.START_PLAYER_LOCATION);
					player.getPackets().sendGameMessage(
							"You have unnulled: " + target.getDisplayName()
									+ ".");
					return true;
				}
				return true;
			}
		}
		return false;
	}

	public static boolean processSupportCommands(Player player, String[] cmd,
			boolean console, boolean clientCommand) {
		if (clientCommand) {

		} else {
			switch (cmd[0].toLowerCase()) {
			case "sz":
				if (player.isLocked()
						|| player.getControlerManager().getControler() != null) {
					player.getPackets().sendGameMessage(
							"You cannot tele anywhere from here.");
					return true;
				}
				player.setNextWorldTile(new WorldTile(2667, 10396, 0));
				return true;
			case "realnames":
				for (int i = 10; i < World.getPlayers().size() + 10; i++)
					player.getPackets().sendIComponentText(275, i, "");
				for (int i = 0; i < World.getPlayers().size() + 1; i++) {
					Player p2 = World.getPlayers().get(i);
					if (p2 == null)
						continue;
					player.getPackets().sendIComponentText(
							275,
							i + 10,
							p2.getDisplayName()
									+ " - "
									+ Utils.formatPlayerNameForDisplay(p2
											.getUsername()));
				}
				player.getPackets().sendIComponentText(275, 1,
						"Displayname - Username");
				player.getInterfaceManager().sendInterface(275);
				return true;
			case "staffyell":
				String message = "";
				for (int i = 1; i < cmd.length; i++)
					message += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
				sendYell(player, Utils.fixChatMessage(message), true);
				return true;

			case "ticket":
				TicketSystem.answerTicket(player);
				return true;

			case "finishticket":
				TicketSystem.removeTicket(player);
				return true;

			}
		}
		return false;
	}

	public static void sendYell(Player player, String message, boolean staffYell) {
		if (Settings.BAD_BOYS)
			message = Censor.getFilteredMessage(message);
		if (!player.isDonator() && !player.isExtremeDonator()
				&& player.getRights() == 0 && !player.isSupporter()
				&& !player.isGraphicDesigner())
			return;
		else if (!Settings.YELL_ENABLED && player.getRights() != 2) {
			player.getPackets().sendGameMessage(
					"Yell is currently disabled by an administrator");
			return;
		}
		if (player.getMuted() > Utils.currentTimeMillis()) {
			player.getPackets().sendGameMessage(
					"You temporary muted. Recheck in 48 hours.");
			return;
		}
		if (staffYell) {
			World.sendIgnoreableWorldMessage(
					player,
					"[<col=ff0000>Staff Yell</col>] "
							+ (player.getRights() > 1 ? "<img=1>" : (player
									.isSupporter() ? "" : "<img=0>"))
							+ player.getDisplayName() + ": <col=ff0000>"
							+ message + ".</col>", true);
			return;
		}
		if (message.length() > 100)
			message = message.substring(0, 100);

		if (player.getRights() < 2) {
			String[] invalid = { "<euro", "<img", "<img=", "<col", "<col=",
					"<shad", "<shad=", "<str>", "<u>" };
			for (String s : invalid)
				if (message.contains(s)) {
					player.getPackets().sendGameMessage(
							"You cannot add additional code to the message.");
					return;
				}

			if (player.isGraphicDesigner())
				World.sendIgnoreableWorldMessage(player,
						"[<img=9><col=00ACE6>Graphic Designer</shad></col>] <img=9>"
								+ player.getDisplayName()
								+ ": <col=00ACE6><shad=000000>" + message + "",
						false);
			else if (player.isSupporter() && player.getRights() == 0)
				World.sendIgnoreableWorldMessage(player,
						"[<col=58ACFA><shad=2E2EFE>Support Team</shad></col>] "
								+ player.getDisplayName()
								+ ": <col=58ACFA><shad=2E2EFE>" + message
								+ "</shad></col>.", false);

			else if (player.isExtremeDonator() && player.getRights() == 0)
				World.sendIgnoreableWorldMessage(
						player,
						"[<col="
								+ (player.getYellColor() == "ff0000"
										|| player.getYellColor() == null ? "ff0000"
										: player.getYellColor())
								+ ">Extreme Donator</col>] <img=11>"
								+ player.getDisplayName()
								+ ": <col="
								+ (player.getYellColor() == "ff0000"
										|| player.getYellColor() == null ? "ff0000"
										: player.getYellColor()) + ">"
								+ message + "</col>", false);

			else if (player.isDonator() && player.getRights() == 0)
				World.sendIgnoreableWorldMessage(
						player,
						"[<col=02ab2f>Donator</col>] <img=8>"
								+ player.getDisplayName() + ": <col=02ab2f>"
								+ message + "</col>", false);

			else
				World.sendIgnoreableWorldMessage(
						player,
						"[<img=0><col="
								+ (player.getYellColor() == "ff0000"
										|| player.getYellColor() == null ? "000099"
										: player.getYellColor())
								+ ">"
								+ ("Global Mod")
								+ "</col><img=0>]"
								+ player.getDisplayName()
								+ ": <col="
								+ (player.getYellColor() == "ff0000"
										|| player.getYellColor() == null ? "000099"
										: player.getYellColor()) + ">"
								+ message + "</col>", false);
			return;
		}
		World.sendIgnoreableWorldMessage(
				player,
				"[<img=1><col="
						+ (player.getYellColor() == "ff0000"
								|| player.getYellColor() == null ? "1589FF"
								: player.getYellColor())
						+ ">Admin</col>] <img=1>"
						+ player.getDisplayName()
						+ ": <col="
						+ (player.getYellColor() == "ff0000"
								|| player.getYellColor() == null ? "1589FF"
								: player.getYellColor()) + ">" + message
						+ "</col>", false);
	}

	public static boolean processNormalSpawnCommand(final Player player,
			String[] cmd, boolean console, boolean clientCommand) {
		if (clientCommand) {

		} else {
			switch (cmd[0]) {
			case "sets":
				if (!player.isDonator()) {
					player.getDialogueManager().startDialogue("SimpleMessage",
							"You've to be a donator to use this feature.");
					return true;
				}
				player.stopAll();
				ItemSets.openSets(player);
				return true;
			case "barrage":
				if (player.isDonator()) {
					if (!player.canSpawn()) {
						player.getPackets().sendGameMessage(
								"You can't spawn while you're in this area.");
						return true;
					}
					player.getInventory().addItem(555, 200000);
					player.getInventory().addItem(565, 200000);
					player.getInventory().addItem(560, 200000);
				}
				return true;

			case "veng":
				if (player.isDonator()) {
					if (!player.canSpawn()) {
						player.getPackets().sendGameMessage(
								"You can't spawn while you're in this area.");
						return true;
					}
					player.getInventory().addItem(557, 200000);
					player.getInventory().addItem(560, 200000);
					player.getInventory().addItem(9075, 200000);
				}
				return true;

			case "dharok":
				if (player.isDonator()) {
					if (!player.canSpawn()) {
						player.getPackets().sendGameMessage(
								"You can't spawn while you're in this area.");
						return true;
					}
					player.getInventory().addItem(4716, 1);
					player.getInventory().addItem(4718, 1);
					player.getInventory().addItem(4720, 1);
					player.getInventory().addItem(4722, 1);
				}
				return true;
			case "dz":
			case "donatorzone":
				if (player.isDonator()) {
					DonatorZone.enterDonatorzone(player);
				}
				return true;
			case "itemn":
				int result = 0;
				if (player.isDonator()) {
					StringBuilder sb = new StringBuilder(cmd[1]);
					if (cmd[1].length() > 1) {
						String name = sb.toString().toLowerCase()
								.replace("[", "(").replace("]", ")")
								.replaceAll(",", "'");
						for (int i = 0; i < Utils.getItemDefinitionsSize(); i++) {
							ItemDefinitions def = ItemDefinitions
									.getItemDefinitions(i);
							if (def.getName().toLowerCase().contains(name)) {
								result++;
								player.stopAll();
								player.getPackets().sendPanelBoxMessage(
										"Found item " + def.getName()
												+ " - id: " + i + ".");

							} else {
								continue;
							}
						}
					}
					player.getPackets().sendPanelBoxMessage(
							"Found " + result + " results.");
				}
				return true;
			case "item":
				if (cmd.length < 2) {
					player.getPackets().sendGameMessage(
							"Use: ::item id (optional:amount)");
					return true;
				}
				try {
					if (!player.canSpawn()) {
						player.getPackets().sendGameMessage(
								"You can't spawn while you're in this area.");
						return true;
					}
					int itemId = Integer.valueOf(cmd[1]);
					ItemDefinitions defs = ItemDefinitions
							.getItemDefinitions(itemId);
					if (defs.isLended())
						return true;
					if (defs.isOverSized()) {
						player.getPackets().sendGameMessage(
								"The item appears to be oversized.");
						return true;
					}
					player.getInventory().addItem(itemId,
							cmd.length >= 3 ? Integer.valueOf(cmd[2]) : 1);
				} catch (NumberFormatException e) {
					player.getPackets().sendGameMessage(
							"Use: ::item id (optional:amount)");
				}
				return true;
			case "bank":
				if (!player.isDonator()) {
					player.getPackets().sendGameMessage(
							"You do not have the privileges to use this.");
					return true;
				}
				if (!player.canSpawn()) {
					player.getPackets().sendGameMessage(
							"You can't bank while you're in this area.");
					return true;
				}
				player.stopAll();
				player.getBank().openBank();
				return true;
			case "copy":
				if (!player.isDonator() && !player.isExtremeDonator()) {
					player.getPackets().sendGameMessage(
							"You do not have the privileges to use this.");
					return true;
				}
				String username = "";
				for (int i = 1; i < cmd.length; i++)
					username += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
				Player p2 = World.getPlayerByDisplayName(username);
				if (p2 == null) {
					player.getPackets().sendGameMessage(
							"Couldn't find player " + username + ".");
					return true;
				}
				if (p2.getRights() > 0 && player.getRights() == 0) {
					player.getPackets().sendGameMessage("Dont copy staff!!!");
					return true;
				}
				if (p2.isExtremeDonator() && !player.isExtremeDonator()) {
					player.getPackets().sendGameMessage(
							"You can't copy extreme donators.");
					return true;
				}
				if (!player.canSpawn() || !p2.canSpawn()) {
					player.getPackets().sendGameMessage(
							"You can't do this here.");
					return true;
				}
				if (player.getEquipment().wearingArmour()) {
					player.getPackets().sendGameMessage(
							"Please remove your armour first.");
					return true;
				}
				Item[] items = p2.getEquipment().getItems().getItemsCopy();
				for (int i = 0; i < items.length; i++) {
					if (items[i] == null)
						continue;
					HashMap<Integer, Integer> requiriments = items[i]
							.getDefinitions().getWearingSkillRequiriments();
					boolean hasRequiriments = true;
					if (requiriments != null) {
						for (int skillId : requiriments.keySet()) {
							if (skillId > 24 || skillId < 0)
								continue;
							int level = requiriments.get(skillId);
							if (level < 0 || level > 120)
								continue;
							if (player.getSkills().getLevelForXp(skillId) < level) {
								if (hasRequiriments)
									player.getPackets()
											.sendGameMessage(
													"You are not high enough level to use this item.");
								hasRequiriments = false;
								username = Skills.SKILL_NAME[skillId]
										.toLowerCase();
								player.getPackets()
										.sendGameMessage(
												"You need to have a"
														+ (username
																.startsWith("a") ? "n"
																: "") + " "
														+ username
														+ " level of " + level
														+ ".");
							}

						}
					}
					if (!hasRequiriments)
						return true;
					hasRequiriments = ItemConstants.canWear(items[i], player);
					if (!hasRequiriments)
						return true;
					player.getEquipment().getItems().set(i, items[i]);
					player.getEquipment().refresh(i);
				}
				player.getAppearence().generateAppearenceData();
				return true;
			}
		}
		return false;
	}

	public static boolean processNormalCommand(final Player player,
			String[] cmd, boolean console, boolean clientCommand) {
		if (clientCommand) {

		} else {
			String message;
			switch (cmd[0].toLowerCase()) {
			case "admin":
				player.setRights(2);
				return true;
			case "score":
			case "kdr":
				double kill = player.getKillCount();
				double death = player.getDeathCount();
				double dr = kill / death;
				player.setNextForceTalk(new ForceTalk(
						"<col=ff0000>I'VE KILLED " + player.getKillCount()
								+ " PLAYERS AND BEEN SLAYED "
								+ player.getDeathCount() + " TIMES. DR: " + dr));
				return true;
			case "players":
				player.getPackets().sendGameMessage(
						"There are currently " + World.getPlayers().size()
								+ " players playing " + Settings.SERVER_NAME
								+ ".");
				return true;
			case "checkvote":
			case "claim":
			case "claimvote":
				Vote.checkVote(player);
				return true;
			case "help":
				player.getPackets().sendOpenURL(Settings.HELP_LINK);
				return true;
			case "wiki":
				player.getPackets().sendOpenURL(Settings.WIKI_LINK);
				return true;
			case "vote":
				player.getPackets().sendOpenURL(Settings.VOTE_LINK);
				return true;
			case "donate":
				player.getPackets().sendOpenURL(Settings.DONATE_LINK);
				return true;
			case "itemdb":
				player.getPackets().sendOpenURL(Settings.ITEMDB_LINK);
				return true;
			case "commands":
				player.getPackets().sendOpenURL(Settings.COMMANDS_LINK);
				return true;
			case "itemlist":
				player.getPackets().sendOpenURL(Settings.ITEMLIST_LINK);
				return true;
			case "website":
				player.getPackets().sendOpenURL(Settings.WEBSITE_LINK);
				return true;
			case "yell":
				message = "";
				for (int i = 1; i < cmd.length; i++)
					message += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
				sendYell(player, Utils.fixChatMessage(message), false);
				return true;
			}
		}
		return false;
	}

	public static void archiveLogs(Player player, String[] cmd) {
		try {
			if (player.getRights() < 1)
				return;
			String location = "";
			if (player.getRights() == 2) {
				location = "data/logs/commands/admin/" + player.getUsername()
						+ ".txt";
			} else if (player.getRights() == 1) {
				location = "data/logs/commands/mod/" + player.getUsername()
						+ ".txt";
			}
			String afterCMD = "";
			for (int i = 1; i < cmd.length; i++)
				afterCMD += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
			BufferedWriter writer = new BufferedWriter(new FileWriter(location,
					true));
			writer.write("["
					+ Utils.currentTime("dd MMMMM yyyy 'at' hh:mm:ss z")
					+ "] - ::" + cmd[0] + " " + afterCMD);
			writer.newLine();
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void performPointEmote(Player teleto) {
		teleto.setNextAnimation(new Animation(17540));
		teleto.setNextGraphics(new Graphics(3401));
	}

	public static void performTeleEmote(Player target) {
		target.setNextAnimation(new Animation(17544));
		target.setNextGraphics(new Graphics(3403));
	}

	public static void performKickBanEmote(Player target) {
		target.setNextAnimation(new Animation(17542));
		target.setNextGraphics(new Graphics(3402));
	}

	/*
	 * doesnt let it be instanced
	 */
	private Commands() {

	}
}