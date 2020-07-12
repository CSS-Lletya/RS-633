package com.rs.game.player.content;

import java.util.TimerTask;

import com.rs.Settings;
import com.rs.cache.loaders.ClientScriptMap;
import com.rs.cores.CoresManager;
import com.rs.game.ForceTalk;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.DisplayNames;
import com.rs.utils.PkRank;
import com.rs.utils.ShopsHandler;
import com.rs.utils.Utils;

public class EconomyManager {

	private static int[] ROOT_COMPONENTS = new int[] { 5, 6, 7, 8, 9, 10, 11,
			12, 13 };
	private static int[] TEXT_COMPONENTS = new int[] { 38, 46, 54, 62, 70, 78,
			86, 94, 102 };
	private static int[] CLICK_COMPONENTS = new int[] { 35, 43, 51, 59, 67, 75,
			83, 91, 99 };

	private static String[] SHOPS_NAMES = new String[] { "General store",
			"Vote items 1", "Vote items 2", "Vote items 3", "Melee", "Ranged",
			"Magic", "Food & Potions", "Rings & Amulets & Gloves", "Capes",
			"Skilling items 1", "Skilling items 2", "Herblore Secondaries 1",
			"Herblore Secondaries 2", "Back" };
	private static int[] SHOPS_IDS = new int[] { 200, 209, 212, 213, 201, 202,
			203, 204, 205, 206, 207, 208, 210, 211, -1 };

	public static int[] MANAGER_NPC_IDS = new int[] { 13930, 15158 };
	public static String[] MANAGER_NPC_TEXTS = new String[] {
			"I seek the evil power!", "I smell the darkness...",
			"I sense the darkness...", "Evil forces are getting stronger...",
			"Come to me, traveler!" };

	private static String[] NEWBIE_LOC_NAMES = new String[] {
			"Stronghold of security", "Karamja & Crandor", "Rock Crabs", "Back" };
	private static WorldTile[] NEWBIE_LOCATIONS = new WorldTile[] {
			new WorldTile(3080, 3418, 0), new WorldTile(2861, 9570, 0),
			new WorldTile(2674, 3710, 0), null };

	private static String[] CITIES_NAMES = new String[] { "Lumbridge",
			"Varrock", "Edgeville", "Falador", "Seer's village", "Ardougne",
			"Yannile", "Keldagrim", "Dorgesh-Kan", "Lletya", "Etceteria",
			"Daemonheim", "Canifis", "Tzhaar area", "Burthrope", "Al-Kharid",
			"Draynor village", "Zanaris", "Shilo village", "Darkmeyer", "Back" };
	private static WorldTile[] CITIES_LOCATIONS = new WorldTile[] {
			new WorldTile(3222, 3219, 0), new WorldTile(3212, 3422, 0),
			new WorldTile(3094, 3502, 0), new WorldTile(2965, 3386, 0),
			new WorldTile(2725, 3491, 0), new WorldTile(2662, 3305, 0),
			new WorldTile(2605, 3093, 0), new WorldTile(2845, 10210, 0),
			new WorldTile(2720, 5351, 0), new WorldTile(2341, 3171, 0),
			new WorldTile(2614, 3894, 0), new WorldTile(3450, 3718, 0),
			new WorldTile(3496, 3489, 0), new WorldTile(4651, 5151, 0),
			new WorldTile(2889, 3528, 0), new WorldTile(3275, 3166, 0),
			new WorldTile(3079, 3250, 0), new WorldTile(2386, 4458, 0),
			new WorldTile(2849, 2958, 0), new WorldTile(3613, 3371, 0), null };

	private static String[] DUNGEON_NAMES = new String[] {
			"Stronghold of security", "Karamja & Crandor", "Brimhaven dungeon",
			"TzHaar", "Jungle Strykewyrms", "Desert Skrykewyrms",
			"Ice Strykewyrms", "Kalphite hive", "Asgarnia ice dungeon",
			"Mos le harmless jungle", "Gorak", "Lumbridge swamp caves",
			"Grotworm lair (QBD)", "Framenik slayer dungeon",
			"King black dragon", "Corporeal beast", "Tormented demons",
			"God Wars", "Back" };
	private static WorldTile[] DUNGEON_LOCATIONS = new WorldTile[] {
			new WorldTile(3080, 3418, 0), new WorldTile(2861, 9570, 0),
			new WorldTile(2745, 3152, 0), new WorldTile(4673, 5116, 0),
			new WorldTile(2450, 2898, 0), new WorldTile(3381, 3162, 0),
			new WorldTile(3508, 5516, 0), new WorldTile(3228, 3106, 0),
			new WorldTile(3010, 3150, 0), new WorldTile(3731, 3039, 0),
			new WorldTile(3035, 5346, 0), new WorldTile(3169, 3171, 0),
			new WorldTile(2990, 3237, 0), new WorldTile(2794, 3615, 0),
			new WorldTile(3051, 3519, 0), new WorldTile(2966, 4383, 2),
			new WorldTile(2562, 5739, 0), new WorldTile(2857, 3573, 0), null };

	private static String[] MINIGAMES_NAMES = new String[] { "Duel arena",
			"Dominion tower", "God Wars", "Barrows", "Fight pits",
			"Fight caves", "Kiln", "Puro-puro",
			"Clan wars & Stealing creations", "High & Low runespan",
			"Sorceror's garden", "Crucible", "Pest Control", "Back" };
	private static WorldTile[] MINIGAMES_LOCATIONS = new WorldTile[] {
			new WorldTile(3370, 3270, 0), new WorldTile(3361, 3082, 0),
			new WorldTile(2857, 3573, 0), new WorldTile(3565, 3306, 0),
			new WorldTile(4602, 5062, 0), new WorldTile(4615, 5129, 0),
			new WorldTile(4743, 5170, 0), new WorldTile(2428, 4441, 0),
			new WorldTile(2961, 9675, 0), new WorldTile(3106, 3160, 0),
			new WorldTile(3323, 3139, 0), new WorldTile(3120, 3519, 0),
			new WorldTile(2659, 2676, 0), null };

	private static String[] OTHER_NAMES = new String[] { "Mages bank",
			"Multi pvp (Wilderness)", "Wests (Wilderness)",
			"Easts (Wilderness)", "Back" };
	private static WorldTile[] OTHER_LOCATIONS = new WorldTile[] {
			new WorldTile(2538, 4715, 0), new WorldTile(3240, 3611, 0),
			new WorldTile(2984, 3596, 0), new WorldTile(3360, 3658, 0), null };

	/**
	 * Whether task was submitted.
	 */
	private static boolean eventTaskSubmitted;
	/**
	 * Whether event is happening.
	 */
	private static boolean eventHappening;
	/**
	 * The location of event.
	 */
	private static WorldTile eventTile;
	/**
	 * The invite text of event.
	 */
	private static String eventText;

	public static synchronized void startEvent(String text, WorldTile tile) {
		if (!eventTaskSubmitted) {
			eventTaskSubmitted = true;
			CoresManager.fastExecutor.schedule(new TimerTask() {
				@Override
				public void run() {
					if (!eventHappening)
						return;

					for (NPC npc : World.getNPCs()) {
						if (npc == null || npc.isDead()
								|| npc.getNextForceTalk() != null)
							continue;
						int deltaX = npc.getX() - eventTile.getX();
						int deltaY = npc.getY() - eventTile.getY();
						if (npc.getPlane() == eventTile.getPlane()
								&& !(deltaX < -25 || deltaX > 25
										|| deltaY < -25 || deltaY > 25))
							continue;
						if (Utils.random(10) != 0)
							continue;

						String message = "An "
								+ eventText
								+ " is currently happening! Talk to Oracle of Dawn to get there!";
						if (isEconomyManagerNpc(npc.getId()))
							message = message.replace("Oracle of Dawn", "me");
						npc.setNextForceTalk(new ForceTalk(message));
					}
				}
			}, 0, 600);
		}
		eventTile = tile;
		eventText = text;
		eventHappening = true;
	}

	public static synchronized void stopEvent() {
		eventHappening = false;
	}

	public static boolean isEconomyManagerNpc(int id) {
		for (int i = 0; i < MANAGER_NPC_IDS.length; i++)
			if (MANAGER_NPC_IDS[i] == id)
				return true;
		return false;
	}

	private static void sendOptionsInterface(Player player) {
		player.getInterfaceManager().sendInterface(1312);
		player.getPackets().sendHideIComponent(1312, 26, true);
	}

	private static void setupInterface(Player player, String[] options) {
		for (int i = 0; i < ROOT_COMPONENTS.length; i++) {
			if (options[i] == null) {
				player.getPackets().sendHideIComponent(1312,
						ROOT_COMPONENTS[i], true);
			} else {
				player.getPackets().sendHideIComponent(1312,
						ROOT_COMPONENTS[i], false);
				player.getPackets().sendIComponentText(1312,
						TEXT_COMPONENTS[i], options[i]);
			}
		}
	}

	public static void processManagerNpcClick(final Player player,
			final int npcId) {
		player.getDialogueManager().startDialogue(new Dialogue() {
			private int pageId = 0;
			private String[] currentOptions;
			private int currentOptionsOffset;

			@Override
			public void start() {
				sendOptionsInterface(player);
				setTitlePage();
			}

			@Override
			public void run(int interfaceId, int componentId) {
				int buttonId = -1;
				for (int i = 0; i < CLICK_COMPONENTS.length; i++) {
					if (componentId == CLICK_COMPONENTS[i]) {
						buttonId = i;
						break;
					}
				}

				if (currentOptions == null || buttonId == -1)
					return;

				int length = currentOptions.length - currentOptionsOffset;
				if (currentOptionsOffset != 0 || length > 9) {
					if (buttonId >= 0 && buttonId <= 7) {
						if ((buttonId + currentOptionsOffset) >= currentOptions.length
								|| currentOptions[buttonId
										+ currentOptionsOffset] == null)
							return;
						handlePage(currentOptionsOffset + buttonId);
					} else {
						// more button
						if ((currentOptionsOffset + 8) >= currentOptions.length) {
							currentOptionsOffset = 0;
						} else {
							currentOptionsOffset += 8;
						}
						updateCurrentPage();
					}
				} else {
					if ((buttonId + currentOptionsOffset) >= currentOptions.length
							|| currentOptions[buttonId + currentOptionsOffset] == null)
						return;
					handlePage(currentOptionsOffset + buttonId);
				}
			}

			private void setPage(int page, String tip, String... options) {
				pageId = page;
				currentOptions = options;
				currentOptionsOffset = 0;
				sendEntityDialogueNoContinue(player, Dialogue.IS_NPC,
						"Oracle of Dawn", npcId, 9810, tip);
				updateCurrentPage();
			}

			private void updateCurrentPage() {
				String[] buffer = new String[9];
				int length = currentOptions.length - currentOptionsOffset;
				if (currentOptionsOffset != 0 || length > 9) {
					System.arraycopy(currentOptions, currentOptionsOffset,
							buffer, 0, Math.min(length, 8));
					buffer[8] = "More"; // copy up to 8 options + more button
				} else {
					System.arraycopy(currentOptions, currentOptionsOffset,
							buffer, 0, length);
				}

				setupInterface(player, buffer);
			}

			private void handlePage(int optionId) {
				if (pageId == 0) { // title page
					if (optionId == 0) // information & links
						setPage(1,
								"This section contains links to our websites and wiki<br>If you are beginner, it is strongly advisted to read our beginners guide.",
								"Website & Forums", "Wiki", "Beginners guide",
								"Back");
					else if (optionId == 1) // Account & character management.
						setManagementPage();
					else if (optionId == 2) // Teleports
						setTeleportsTitlePage();
					else if (optionId == 3) { // PK ranks
						end();
						PkRank.showRanks(player);
					} else if (optionId == 4) // Shops
						setPage(4, "Here you can access various global shops.",
								SHOPS_NAMES);
					else if (optionId == 5) // Vote
						setPage(5,
								"This section contains links to our vote page, as well as ability to claim your reward.",
								"Vote", "Claim your reward", "Back");
					else if (optionId == 6) // Donate
						player.getPackets().sendOpenURL(Settings.DONATE_LINK);
					else if (optionId == 7) { // Ticket
						if (player.getMuted() > Utils.currentTimeMillis()) {
							player.getPackets()
									.sendGameMessage(
											"You are muted. Please recheck in 48 hours.");
							return;
						}
						end();
						TicketSystem.requestTicket(player);
					} else if (optionId == 8) // nevermind
						end();
				} else if (pageId == 1) { // information & links
					if (optionId == 0)
						player.getPackets().sendOpenURL(Settings.WEBSITE_LINK);
					else if (optionId == 1)
						player.getPackets().sendOpenURL(Settings.WIKI_LINK);
					else if (optionId == 2)
						player.getPackets().sendOpenURL(Settings.HELP_LINK);
					else if (optionId == 3)
						setTitlePage();
				} else if (pageId == 2) { // character management
					if (optionId == 0) { // change your password
						player.getTemporaryAttributtes().put("change_pass",
								true);
						player.getPackets().sendInputLongTextScript(
								"Enter your new password:");
					} else if (optionId == 1) { // auth forum acc
						player.getTemporaryAttributtes().put(
								"forum_authuserinput", true);
						player.getPackets().sendInputNameScript(
								"Enter your forum username:");
					} else if (optionId == 2) { // display name
						setPage(10,
								"Here you can set your display name or remove it.",
								"Set display name", "Remove display name",
								"Back");
					} else if (optionId == 3) { // switch items look
						// player.switchItemsLook();
						setManagementPage();
					} else if (optionId == 4) { // title select
						String[] page = getTitlesPage();
						setPage(11,
								"Here you can set your title, which will be displayed before or after your characters name.",
								page);
					} else if (optionId == 5) { // lock xp
						player.setXpLocked(!player.isXpLocked());
						setManagementPage();
					} else if (optionId == 6) { // toogle yell
						player.setYellOff(!player.isYellOff());
						setManagementPage();
					} else if (optionId == 7) { // set yell color
						if (!player.isExtremeDonator()) {
							player.getPackets()
									.sendGameMessage(
											"This feature is only available to extreme donators!");
							return;
						}
						player.getTemporaryAttributtes().put("yellcolor",
								Boolean.TRUE);
						player.getPackets().sendInputLongTextScript(
								"Please enter the yell color in HEX format.");
					} else if (optionId == 8) { // set baby troll name
						if (!player.isExtremeDonator()) {
							player.getPackets()
									.sendGameMessage(
											"This feature is only available to extreme donators!");
							return;
						}
						player.getTemporaryAttributtes().put(
								"change_troll_name", true);
						player.getPackets()
								.sendInputLongTextScript(
										"Enter your baby troll name (type none for default):");
					} else if (optionId == 9) { // redesign character
						if (!player.isExtremeDonator()) {
							player.getPackets()
									.sendGameMessage(
											"This feature is only available to extreme donators!");
							return;
						}
						end();
						PlayerLook.openCharacterCustomizing(player);
					} else if (optionId == 10) { // back
						setTitlePage();
					}
				} else if (pageId == 3) { // teleports
					if (optionId == 0) { // current event
						if (!eventHappening) {
							player.getPackets()
									.sendGameMessage(
											"No official event is currently happening.");
						} else {
							Magic.sendNormalTeleportSpell(player, 0, 0,
									eventTile);
						}
					} else if (optionId == 1) { // current starter town
						Magic.sendNormalTeleportSpell(player, 0, 0,
								Settings.START_PLAYER_LOCATION);
					} else if (optionId == 2) { // safe pvp
						end();
						player.setNextWorldTile(new WorldTile(2815, 5511, 0));
						player.getControlerManager().startControler(
								"clan_wars_ffa", false);
					} else if (optionId == 3) { // recommended for beginners
						setPage(12,
								"This section contains various teleports to locations recommended for beginners.",
								NEWBIE_LOC_NAMES);
					} else if (optionId == 4) { // cities & towns
						setPage(13,
								"This section contains teleports to various cities & towns.",
								CITIES_NAMES);
					} else if (optionId == 5) { // dungeons & pvm
						setPage(14,
								"This section contains teleports to various pvm locations.",
								DUNGEON_NAMES);
					} else if (optionId == 6) { // minigames
						setPage(15,
								"This section contains teleports to various minigames locations.",
								MINIGAMES_NAMES);
					} else if (optionId == 7) { // others
						setPage(16,
								"This section contains various miscellaneous teleports.",
								OTHER_NAMES);
					} else if (optionId == 8) { // back
						setTitlePage();
					}
				} else if (pageId == 4) { // shops
					int shopId = SHOPS_IDS[optionId];
					if (shopId < 0) { // back
						setTitlePage();
					} else {
						end();
						ShopsHandler.openShop(player, shopId);
					}
				} else if (pageId == 5) { // vote
					if (optionId == 0) // vote link
						player.getPackets().sendOpenURL(Settings.VOTE_LINK);
					else if (optionId == 1) { // claim reward
						end();
						Vote.checkVote(player);
					} else if (optionId == 2)
						setTitlePage();
				} else if (pageId == 10) { // display name management
					if (optionId == 0) { // set display name
						if (!player.isDonator()) {
							player.getPackets()
									.sendGameMessage(
											"This feature is only available to donators!");
							return;
						}
						player.getTemporaryAttributtes().put("setdisplay",
								Boolean.TRUE);
						player.getPackets().sendInputLongTextScript(
								"Enter display name you want to be set:");
					} else if (optionId == 1) { // remove display name
						player.getPackets()
								.sendGameMessage(
										DisplayNames.removeDisplayName(player) ? "Your display name was successfully removed."
												: "You don't have display name to remove.");
					} else if (optionId == 2) { // back
						setManagementPage();
					}
				} else if (pageId == 11) { // titles page
					int[] ids = getTitlesIds();
					if (currentOptions.length != ids.length) {
						// error
						setManagementPage();
						return;
					}

					int titleId = ids[optionId];
					if (titleId == -2) { // back button
						setManagementPage();
					} else if (titleId == -1) { // no title
						player.getAppearence().setTitle(0);
						setManagementPage();
					} else if (titleId > 0) {
						player.getAppearence().setTitle(titleId);
						setManagementPage();
					} else {
						setManagementPage();
					}
				} else if (pageId == 12) { // newbie teles
					if (NEWBIE_LOCATIONS[optionId] == null) { // back
						setTeleportsTitlePage();
					} else {
						Magic.sendLunarTeleportSpell(player, 0, 0,
								NEWBIE_LOCATIONS[optionId]);
					}
				} else if (pageId == 13) { // teleports cities & towns
					if (CITIES_LOCATIONS[optionId] == null) { // back
						setTeleportsTitlePage();
					} else {
						Magic.sendLunarTeleportSpell(player, 0, 0,
								CITIES_LOCATIONS[optionId]);
					}
				} else if (pageId == 14) { // dungeons
					if (DUNGEON_LOCATIONS[optionId] == null) { // back
						setTeleportsTitlePage();
					} else {
						if (DUNGEON_NAMES[optionId].contains("(GWD)")) {
							player.setNextWorldTile(DUNGEON_LOCATIONS[optionId]);
							player.stopAll();
							player.getControlerManager().startControler(
									"GodWars");
						} else {
							Magic.sendLunarTeleportSpell(player, 0, 0,
									DUNGEON_LOCATIONS[optionId]);
						}
					}
				} else if (pageId == 15) { // minigames
					if (MINIGAMES_LOCATIONS[optionId] == null) { // back
						setTeleportsTitlePage();
					} else {
						Magic.sendLunarTeleportSpell(player, 0, 0,
								MINIGAMES_LOCATIONS[optionId]);
					}
				} else if (pageId == 16) { // others
					if (OTHER_LOCATIONS[optionId] == null) { // back
						setTeleportsTitlePage();
					} else {
						Magic.sendLunarTeleportSpell(player, 0, 0,
								OTHER_LOCATIONS[optionId]);
						if (OTHER_NAMES[optionId].contains("(Wilderness")) {
							player.getControlerManager().startControler(
									"Wilderness");
						}
					}
				} else if (pageId == 99) { // temp page
					setTeleportsTitlePage();
				}
			}

			private void setTitlePage() {
				setPage(0,
						"Welcome to "
								+ Settings.SERVER_NAME
								+ "!<br>I provide various services to make your life here easier.",
						"Information & Links",
						"Account & Character management",
						eventHappening ? "Teleports (Click here for event)"
								: "Teleports", "PK Ranks", "Shops", "Vote",
						"Donate", "Submit a ticket", "Nevermind");
			}

			private void setManagementPage() {
				setPage(2,
						"This section contains features, which will help you to manage your account easier.",
						"Change password", "Authenticate your forum account",
						"Display name management", "Set your title", player
								.isXpLocked() ? "Unlock XP" : "Lock XP", player
								.isYellOff() ? "Toogle yell on"
								: "Toogle yell off", "Set yell color",
						"Set baby troll name", "Redesign character", "Back");
			}

			private void setTeleportsTitlePage() {
				setPage(3,
						"This section contains teleports to various different locations.",
						"Current event", "Current starting town", "Safe PvP",
						"Recommended for beginners", "Cities & Towns",
						"Dungeons & PVM Locations", "Minigames", "Others",
						"Back");
			}

			private String[] getTitlesPage() {
				String[] buffer = new String[102];
				int count = 0;

				buffer[count++] = "No title";

				ClientScriptMap map = player.getAppearence().isMale() ? ClientScriptMap
						.getMap(1093) : ClientScriptMap.getMap(3872);
				for (Object value : map.getValues().values()) {
					if (value instanceof String
							&& ((String) value).length() > 0) {
						buffer[count++] = (String) value;
					}

					if (count >= (buffer.length - 2))
						break;
				}

				buffer[count++] = "Back";

				if (count != buffer.length) {
					String[] rebuff = new String[count];
					System.arraycopy(buffer, 0, rebuff, 0, rebuff.length);
					return rebuff;
				} else {
					return buffer;
				}
			}

			private int[] getTitlesIds() {
				int[] buffer = new int[102];
				int count = 0;

				buffer[count++] = -1;

				ClientScriptMap map = player.getAppearence().isMale() ? ClientScriptMap
						.getMap(1093) : ClientScriptMap.getMap(3872);
				for (Object value : map.getValues().values()) {
					if (value instanceof String
							&& ((String) value).length() > 0) {
						buffer[count++] = (int) map.getKeyForValue(value);
					}

					if (count >= (buffer.length - 2))
						break;
				}

				buffer[count++] = -2;

				if (count != buffer.length) {
					int[] rebuff = new int[count];
					System.arraycopy(buffer, 0, rebuff, 0, rebuff.length);
					return rebuff;
				} else {
					return buffer;
				}
			}

			@Override
			public void finish() {
				closeNoContinueDialogue(player);
				player.getInterfaceManager().removeScreenInterface();

			}

		});
	}

}
