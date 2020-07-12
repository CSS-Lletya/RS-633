package com.rs.game.player;

import java.io.Serializable;
import java.util.ArrayList;

import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.Animation;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.net.decoders.WorldPacketsDecoder;
import com.rs.utils.Utils;

public final class EmotesManager implements Serializable {

	private static final long serialVersionUID = 8489480378717534336L;

	private ArrayList<Integer> unlockedEmotes;
	private transient Player player;
	private transient long nextEmoteEnd;

	public EmotesManager() {
		unlockedEmotes = new ArrayList<Integer>();
		for (int emoteId = 2; emoteId < 24; emoteId++)
			unlockedEmotes.add(emoteId);
		unlockedEmotes.add(39); // skillcape
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void unlockEmote(int id) {
		if (unlockedEmotes.contains(id))
			return;
		if (unlockedEmotes.add(id))
			refreshListConfigs();
	}

	public static int getId(int slotId, int packetId) {
		switch (slotId) {
		case 0:
			return 2;
		case 1:
			return 3;
		case 2:
			if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
				return 4;
			else
				return -1; // TODO new bow emote
		case 3:
			return 5;
		case 4:
			return 6;
		case 5:
			return 7;
		case 6:
			return 8;
		case 7:
			return 9;
		case 8:
			return 10;
		case 9:
			return 12;
		case 10:
			return 11;
		case 11:
			return 13;
		case 12:
			return 14;
		case 13:
			return 15;
		case 14:
			return 16;
		case 15:
			return 17;
		case 16:
			return 18;
		case 17:
			return 19;
		case 18:
			return 20;
		case 19:
			return 21;
		case 20:
			return 22;
		case 21:
			return 23;
		case 22:
			return 24;
		case 23:
			return 25;
		case 24:
			return 26;
		case 25:
			return 27;
		case 26:
			return 28;
		case 27:
			return 29;
		case 28:
			return 30;
		case 29:
			return 31;
		case 30:
			return 32;
		case 31:
			return 33;
		case 32:
			return 34;
		case 33:
			return 35;
		case 34:
			return 36;
		case 35:
			return 37;
		case 36:
			return 38;
		case 37:
			return 39;
		case 38:
			return 40;
		case 39:
			return 41;
		case 40:
			return 42;
		case 41:
			return 43;
		case 42:
			return 44;
		case 43:
			return 45;
		case 44:
			return 46;
		case 45:
			return 47;
		case 46:
			return 48;
		case 47:
			return 49;
		case 48:
			return 50;
		case 49:
			return 51;
		case 50:
			return 52;
		case 51:
			return 53;
		case 52:
			return 54;
		case 53:
			return 55;
		case 54:
			return 56;
		case 55:
			return 57;
		case 56:
			return 58;
		case 57:
			return 59;
		case 58:
			return 60;
		case 59:
			return 61;
		case 60:
			return 62;
		case 61:
			return 63;
		case 62:
			return 64;
		case 63:
			return 65;
		case 64:
			return 66;
		case 65:
			return 67;
		case 66:
			return 68;
		case 67:
			return 69;
		case 68:
			return 70;
		case 69:
			return 71;
		case 70:
			return 72;
		case 71:
			return 73;
		case 72:
			return 74;
		case 73:
			return 75;
		case 74:
			return 76;
		case 75:
			return 77;
		case 76:
			return 78;
		case 77:
			return 79;
		case 78:
			return 80;
		case 79:
			return 81;
		case 80:
			return 82;
		case 81:
			return 83;
		case 82:
			return 84;
		case 83:
			return 85;
		case 84:
			return 86;
		case 85:
			return 87;
		case 86:
			return 88;
		case 87:
			return 89;
		case 88:
			return 90;
		case 89:
			return 91;
		case 90:
			return 92;
		case 91:
			return 93;
		case 92:
			return 94;
		case 93:
			return 95;
		case 94:
			return 96;
		case 95:
			return 97;
		case 96:
			return 98;
		case 97:
			return 99;
		case 98:
			return 100;
		case 99:
			return 101;
		case 100:
			return 102;
		case 101:
			return 103;
		case 102:
			return 104;
		case 103:
			return 105;
		case 104:
			return 106;
		case 105:
			return 107;
		case 106:
			return 108;
		case 107:
			return 109;
		case 108:
			return 110;
		case 109:
			return 111;
		case 110:
			return 112;
		case 111:
			return 113;
		case 112:
			return 114;
		case 113:
			return 115;
		case 114:
			return 116;
		case 115:
			return 117;
		case 116:
			return 118;
		case 117:
			return 119;
		case 118:
			return 120;
		default:
			return -1;
		}
	}

	public void useBookEmote(int id) {
		if (player.getAttackedByDelay() + 10000 > Utils.currentTimeMillis()) {
			player.getPackets().sendGameMessage(
					"You can't perform while you're under combat.");
			return;
		} else if (isDoingEmote()) {
			player.getPackets().sendGameMessage(
					"You're already doing an emote!");
			return;
		}
		player.stopAll();
		if (id == 2) {// Yes
			player.setNextAnimation(new Animation(855));
		} else if (id == 3) {// No
			player.setNextAnimation(new Animation(856));
		} else if (id == 4) {// Bow
			player.setNextAnimation(new Animation(858));
		} else if (id == 5) {// Angry
			player.setNextAnimation(new Animation(859));
		} else if (id == 6) {// Think
			player.setNextAnimation(new Animation(857));
		} else if (id == 7) {// Wave
			player.setNextAnimation(new Animation(14001));
		} else if (id == 8) {// Shrug
			player.setNextAnimation(new Animation(2113));
		} else if (id == 9) {// Cheer
			player.setNextAnimation(new Animation(862));
		} else if (id == 10) {// Beckon
			player.setNextAnimation(new Animation(864));
		} else if (id == 12) {// Laugh
			player.setNextAnimation(new Animation(861));
		} else if (id == 11) {// Jump For Joy
			player.setNextAnimation(new Animation(2109));
		} else if (id == 13) {// Yawn
			player.setNextAnimation(new Animation(2111));
		} else if (id == 14) {// Dance
			player.setNextAnimation(new Animation(866));
		} else if (id == 15) {// Jig
			player.setNextAnimation(new Animation(2106));
		} else if (id == 16) {// Twirl
			player.setNextAnimation(new Animation(2107));
		} else if (id == 17) {// Headbang
			player.setNextAnimation(new Animation(2108));
		} else if (id == 18) {// Cry
			player.setNextAnimation(new Animation(860));
		} else if (id == 19) {// Blow kiss
			player.setNextAnimation(new Animation(1374));
			player.setNextGraphics(new Graphics(1702));
		} else if (id == 20) {// Panic
			player.setNextAnimation(new Animation(2105));
		} else if (id == 21) {// RaspBerry
			player.setNextAnimation(new Animation(2110));
		} else if (id == 22) {// Clap
			player.setNextAnimation(new Animation(865));
		} else if (id == 23) {// Salute
			player.setNextAnimation(new Animation(2112));
		} else if (id == 24) {// Goblin Bow
			player.setNextAnimation(new Animation(0x84F));
		} else if (id == 25) {// Goblin Salute
			player.setNextAnimation(new Animation(0x850));
		} else if (id == 26) {// Glass Box
			player.setNextAnimation(new Animation(1131));
		} else if (id == 27) {// Climb Rope
			player.setNextAnimation(new Animation(1130));
		} else if (id == 28) {// Lean
			player.setNextAnimation(new Animation(1129));
		} else if (id == 29) {// Glass Wall
			player.setNextAnimation(new Animation(1128));
		} else if (id == 30) {// Idea
			player.setNextAnimation(new Animation(4275));
		} else if (id == 31) {// Stomp
			player.setNextAnimation(new Animation(1745));
		} else if (id == 32) {// Flap
			player.setNextAnimation(new Animation(4280));
		} else if (id == 33) {// Slap Head
			player.setNextAnimation(new Animation(4276));
		} else if (id == 34) {// Zombie Walk
			player.setNextAnimation(new Animation(3544));
		} else if (id == 35) {// Zombie Dance
			player.setNextAnimation(new Animation(3543));
		} else if (id == 36) {// Zombie Hand
			player.setNextAnimation(new Animation(7272));
			player.setNextGraphics(new Graphics(1244));
		} else if (id == 37) {// Scared
			player.setNextAnimation(new Animation(2836));
		} else if (id == 38) {// Bunny-hop
			player.setNextAnimation(new Animation(6111));
		} else if (id == 39) {// Skillcapes
			final int capeId = player.getEquipment().getCapeId();
			switch (capeId) {
			case 9747:
			case 9748:
			case 10639: // Attack cape
				player.setNextAnimation(new Animation(4959));
				player.setNextGraphics(new Graphics(823));
				break;
			case 9753:
			case 9754:
			case 10641: // Defence cape
				player.setNextAnimation(new Animation(4961));
				player.setNextGraphics(new Graphics(824));
				break;
			case 9750:
			case 9751:
			case 10640: // Strength cape
				player.setNextAnimation(new Animation(4981));
				player.setNextGraphics(new Graphics(828));
				break;
			case 9768:
			case 9769:
			case 10647: // Hitpoints cape
				player.setNextAnimation(new Animation(14242));
				player.setNextGraphics(new Graphics(2745));
				break;
			case 9756:
			case 9757:
			case 10642: // Ranged cape
				player.setNextAnimation(new Animation(4973));
				player.setNextGraphics(new Graphics(832));
				break;
			case 9762:
			case 9763:
			case 10644: // Magic cape
				player.setNextAnimation(new Animation(4939));
				player.setNextGraphics(new Graphics(813));
				break;
			case 9759:
			case 9760:
			case 10643: // Prayer cape
				player.setNextAnimation(new Animation(4979));
				player.setNextGraphics(new Graphics(829));
				break;
			case 9801:
			case 9802:
			case 10658: // Cooking cape
				player.setNextAnimation(new Animation(4955));
				player.setNextGraphics(new Graphics(821));
				break;
			case 9807:
			case 9808:
			case 10660: // Woodcutting cape
				player.setNextAnimation(new Animation(4957));
				player.setNextGraphics(new Graphics(822));
				break;
			case 9783:
			case 9784:
			case 10652: // Fletching cape
				player.setNextAnimation(new Animation(4937));
				player.setNextGraphics(new Graphics(812));
				break;
			case 9798:
			case 9799:
			case 10657: // Fishing cape
				player.setNextAnimation(new Animation(4951));
				player.setNextGraphics(new Graphics(819));
				break;
			case 9804:
			case 9805:
			case 10659: // Firemaking cape
				player.setNextAnimation(new Animation(4975));
				player.setNextGraphics(new Graphics(831));
				break;
			case 9780:
			case 9781:
			case 10651: // Crafting cape
				player.setNextAnimation(new Animation(4949));
				player.setNextGraphics(new Graphics(818));
				break;
			case 9795:
			case 9796:
			case 10656: // Smithing cape
				player.setNextAnimation(new Animation(4943));
				player.setNextGraphics(new Graphics(815));
				break;
			case 9792:
			case 9793:
			case 10655: // Mining cape
				player.setNextAnimation(new Animation(4941));
				player.setNextGraphics(new Graphics(814));
				break;
			case 9774:
			case 9775:
			case 10649: // Herblore cape
				player.setNextAnimation(new Animation(4969));
				player.setNextGraphics(new Graphics(835));
				break;
			case 9771:
			case 9772:
			case 10648: // Agility cape
				player.setNextAnimation(new Animation(4977));
				player.setNextGraphics(new Graphics(830));
				break;
			case 9777:
			case 9778:
			case 10650: // Thieving cape
				player.setNextAnimation(new Animation(4965));
				player.setNextGraphics(new Graphics(826));
				break;
			case 9786:
			case 9787:
			case 10653: // Slayer cape
				player.setNextAnimation(new Animation(4967));
				player.setNextGraphics(new Graphics(1656));
				break;
			case 9810:
			case 9811:
			case 10611: // Farming cape
				player.setNextAnimation(new Animation(4963));
				player.setNextGraphics(new Graphics(825));
				break;
			case 9765:
			case 9766:
			case 10645: // Runecrafting cape
				player.setNextAnimation(new Animation(4947));
				player.setNextGraphics(new Graphics(817));
				break;
			case 9789:
			case 9790:
			case 10654: // Construction cape
				player.setNextAnimation(new Animation(4953));
				player.setNextGraphics(new Graphics(820));
				break;
			case 12169:
			case 12170:
			case 12524: // Summoning cape
				player.setNextAnimation(new Animation(8525));
				player.setNextGraphics(new Graphics(1515));
				break;
			case 9948:
			case 9949:
			case 10646: // Hunter cape
				player.setNextAnimation(new Animation(5158));
				player.setNextGraphics(new Graphics(907));
				break;
			case 9813:
			case 10662: // Quest cape
				player.setNextAnimation(new Animation(4945));
				player.setNextGraphics(new Graphics(816));
				break;
			case 18508:
			case 18509: // Dungeoneering cape
				final int rand = (int) (Math.random() * (2 + 1));
				player.setNextAnimation(new Animation(13190));
				player.setNextGraphics(new Graphics(2442));
				WorldTasksManager.schedule(new WorldTask() {
					int step;

					@Override
					public void run() {
						if (step == 1) {
							player.getAppearence().transformIntoNPC(
									(rand == 0 ? 11227 : (rand == 1 ? 11228
											: 11229)));
							player.setNextAnimation(new Animation(
									((rand > 0 ? 13192 : (rand == 1 ? 13193
											: 13194)))));
						}
						if (step == 3) {
							player.getAppearence().transformIntoNPC(-1);
							stop();
						}
						step++;
					}
				}, 0, 1);
				break;
			/*
			 * //TODO fix lulz case 19709: case 19710: // SlayerMasterD
			 * dungeoneering cape nextEmoteEnd = Utils.currentTimeMillis() + (20
			 * * 600); WorldTasksManager.schedule(new WorldTask() { int step;
			 * private NPC dung1, dung2, dung3, dung4;
			 * 
			 * @Override public void run() { if (step == 1) { player.lock(12);
			 * player.getAppearence().transformIntoNPC(11229);
			 * player.setNextAnimation(new Animation(14608)); dung1 = new
			 * NPC(-1, new WorldTile(player.getX(), player.getY() - 1,
			 * player.getPlane()), -1, true); player.setNextFaceEntity(dung1);
			 * dung1.setLocation(dung1); dung1.setNextGraphics(new
			 * Graphics(2777)); dung2 = new NPC(-1, new WorldTile( player.getX()
			 * + 1, player.getY() - 1, player.getPlane()), -1, true); } if (step
			 * == 2) { player.setNextFaceEntity(null); dung1.finish();
			 * player.getAppearence().transformIntoNPC(11228);
			 * dung2.setLocation(dung2); player.setNextAnimation(new
			 * Animation(14609)); player.setNextGraphics(new Graphics(2782));
			 * dung2.setNextGraphics(new Graphics(2778)); dung3 = new NPC(-1,
			 * new WorldTile(player.getX(), player.getY() - 1,
			 * player.getPlane()), -1, true); dung4 = new NPC(-1, new
			 * WorldTile(player.getX(), player.getY() + 1, player.getPlane()),
			 * -1, true); } if (step == 3) { dung2.finish();
			 * player.getAppearence().transformIntoNPC(11227);
			 * dung3.setLocation(dung3); dung4.setLocation(dung4);
			 * dung4.setNextFaceEntity(player); player.setNextAnimation(new
			 * Animation(14610)); dung3.setNextGraphics(new Graphics(2779));
			 * dung4.setNextGraphics(new Graphics(2780)); } if (step > 4) {
			 * dung4.setNextFaceEntity(null);
			 * player.getAppearence().transformIntoNPC(-1); dung3.finish();
			 * dung4.finish(); stop(); player.unlock(); } step++; } }, 0, 1);
			 * 
			 * break;
			 */
			case 24709: // Veteran cape 10years
				if (!World.isTileFree(player.getPlane(), player.getX(),
						player.getY(), 3)) {
					player.getPackets()
							.sendGameMessage(
									"You need clear space outside in order to perform this emote.");
					return;
				} else if (player.getControlerManager().getControler() != null) {
					player.getPackets().sendGameMessage(
							"You can't do this here.");
					return;
				}
				player.setNextAnimation(new Animation(17118));
				player.setNextGraphics(new Graphics(3227));
				break;
			case 20763: // Veteran cape
				if (!World.isTileFree(player.getPlane(), player.getX(),
						player.getY(), 3)) {
					player.getPackets()
							.sendGameMessage(
									"You need clear space outside in order to perform this emote.");
					return;
				} else if (player.getControlerManager().getControler() != null) {
					player.getPackets().sendGameMessage(
							"You can't do this here.");
					return;
				}
				player.setNextAnimation(new Animation(352));
				player.setNextGraphics(new Graphics(1446));
				break;
			case 20765: // Classic cape
				if (player.getControlerManager().getControler() != null) {
					player.getPackets().sendGameMessage(
							"You cannot do this here!");
					return;
				}
				int random = Utils.getRandom(2);
				player.setNextAnimation(new Animation(122));
				player.setNextGraphics(new Graphics(random == 0 ? 1471 : 1466));
				break;
			case 20767: // Max cape
				if (player.getControlerManager().getControler() != null) {
					player.getPackets().sendGameMessage(
							"You can't do this here.");
					return;
				}
				int size = NPCDefinitions.getNPCDefinitions(1224).size;
				WorldTile spawnTile = new WorldTile(new WorldTile(
						player.getX() + 1, player.getY(), player.getPlane()));
				if (!World.isTileFree(spawnTile.getPlane(), spawnTile.getX(),
						spawnTile.getY(), size)) {
					spawnTile = null;
					int[][] dirs = Utils.getCoordOffsetsNear(size);
					for (int dir = 0; dir < dirs[0].length; dir++) {
						final WorldTile tile = new WorldTile(new WorldTile(
								player.getX() + dirs[0][dir], player.getY()
										+ dirs[1][dir], player.getPlane()));
						if (World.isTileFree(tile.getPlane(), tile.getX(),
								tile.getY(), size)) {
							spawnTile = tile;
							break;
						}
					}
				}
				if (spawnTile == null) {
					player.getPackets()
							.sendGameMessage(
									"You need clear space outside in order to perform this emote.");
					return;
				}
				nextEmoteEnd = Utils.currentTimeMillis() + (25 * 600);
				final WorldTile npcTile = spawnTile;
				WorldTasksManager.schedule(new WorldTask() {
					private int step;
					private NPC npc;

					@Override
					public void run() { // TODO fix delays
						if (step == 0) {
							npc = new NPC(1224, npcTile, -1, true);
							npc.setNextAnimation(new Animation(1434));
							npc.setNextGraphics(new Graphics(1482));
							player.setNextAnimation(new Animation(1179));
							npc.setNextFaceEntity(player);
							player.setNextFaceEntity(npc);
						} else if (step == 2) {
							npc.setNextAnimation(new Animation(1436));
							npc.setNextGraphics(new Graphics(1486));
							player.setNextAnimation(new Animation(1180));
						} else if (step == 3) {
							npc.setNextGraphics(new Graphics(1498));
							player.setNextAnimation(new Animation(1181));
						} else if (step == 4) {
							player.setNextAnimation(new Animation(1182));
						} else if (step == 5) {
							npc.setNextAnimation(new Animation(1448));
							player.setNextAnimation(new Animation(1250));
						} else if (step == 6) {
							player.setNextAnimation(new Animation(1251));
							player.setNextGraphics(new Graphics(1499));
							npc.setNextAnimation(new Animation(1454));
							npc.setNextGraphics(new Graphics(1504));
						} else if (step == 11) {
							player.setNextAnimation(new Animation(1291));
							player.setNextGraphics(new Graphics(1686));
							player.setNextGraphics(new Graphics(1598));
							npc.setNextAnimation(new Animation(1440));
						} else if (step == 16) {
							player.setNextFaceEntity(null);
							npc.finish();
							stop();
						}
						step++;
					}

				}, 0, 1);
				break;
			case 20769:
			case 20771: // Completionist cape
				if (!World.isTileFree(player.getPlane(), player.getX(),
						player.getY(), 3)) {
					player.getPackets()
							.sendGameMessage(
									"You need clear space outside in order to perform this emote.");
					return;
				} else if (player.getControlerManager().getControler() != null) {
					player.getPackets().sendGameMessage(
							"You can't do this here.");
					return;
				}
				nextEmoteEnd = Utils.currentTimeMillis() + (20 * 600);
				WorldTasksManager.schedule(new WorldTask() {
					private int step;

					@Override
					public void run() {
						if (step == 0) {
							player.setNextAnimation(new Animation(356));
							player.setNextGraphics(new Graphics(307));
						} else if (step == 2) {
							player.getAppearence().transformIntoNPC(
									capeId == 20769 ? 1830 : 3372);
							player.setNextAnimation(new Animation(1174));
							player.setNextGraphics(new Graphics(1443));
						} else if (step == 4) {
							player.getPackets().sendCameraShake(3, 25, 50, 25,
									50);
						} else if (step == 5) {
							player.getPackets().sendStopCameraShake();
						} else if (step == 8) {
							player.getAppearence().transformIntoNPC(-1);
							player.setNextAnimation(new Animation(1175));
							stop();
						}
						step++;
					}

				}, 0, 1);
				break;
			default:
				player.getPackets()
						.sendGameMessage(
								"You need to be wearing a skillcape in order to perform this emote.");
				break;
			}
			return;
		} else if (id == 40) {// Snowman Dance
			player.setNextAnimation(new Animation(7531));
		} else if (id == 41) {// Air Guitar
			player.setNextAnimation(new Animation(2414));
			player.setNextGraphics(new Graphics(1537));
			player.getPackets().sendMusicEffect(302);
		} else if (id == 42) {// Safety First
			player.setNextAnimation(new Animation(8770));
			player.setNextGraphics(new Graphics(1553));
		} else if (id == 43) {// Explore
			player.setNextAnimation(new Animation(9990));
			player.setNextGraphics(new Graphics(1734));
		} else if (id == 44) {// Trick
			player.setNextAnimation(new Animation(10530));
			player.setNextGraphics(new Graphics(1864));
		} else if (id == 45) {// Freeze
			player.setNextAnimation(new Animation(11044));
			player.setNextGraphics(new Graphics(1973));
		} else if (id == 46) {// Give Thanks
			player.lock(10);
			nextEmoteEnd = Utils.currentTimeMillis() + (10 * 600);
			WorldTasksManager.schedule(new WorldTask() {

				@Override
				public void run() {
					if (step == 0) {
						player.setNextAnimation(new Animation(10994));
						player.setNextGraphics(new Graphics(86));
					} else if (step == 1) {
						player.setNextAnimation(new Animation(10996));
						player.getAppearence().transformIntoNPC(8499);
					} else if (step == 6) {
						player.setNextAnimation(new Animation(10995));
						player.setNextGraphics(new Graphics(86));
						player.getAppearence().transformIntoNPC(-1);
						stop();
					}
					step++;
				}

				private int step;

			}, 0, 1);
		} else if (id == 47) {// Around the world in Eggy days
			player.setNextAnimation(new Animation(11542));
			player.setNextGraphics(new Graphics(2037));
		} else if (id == 48) {// Dramatic Point
			player.setNextAnimation(new Animation(12658));
			player.setNextGraphics(new Graphics(780));
		} else if (id == 49) {// Faint
			player.setNextAnimation(new Animation(14165));
		} else if (id == 50) {// Puppet SlayerMasterD
			player.setNextAnimation(new Animation(14869));
			player.setNextGraphics(new Graphics(2837));
		} else if (id == 51) {// Taskmaster
			player.setNextAnimation(new Animation(player.getAppearence()
					.isMale() ? 15033 : 15034));
			player.setNextGraphics(new Graphics(2930));
		} else if (id == 52) {// Seal Of Approval
			nextEmoteEnd = Utils.currentTimeMillis() + (20 * 600);
			WorldTasksManager.schedule(new WorldTask() {
				int random = (int) (Math.random() * (2 + 1));

				@Override
				public void run() {
					if (step == 0) {
						player.setNextAnimation(new Animation(15104));
						player.setNextGraphics(new Graphics(1287));
					} else if (step == 1) {
						player.setNextAnimation(new Animation(15106));
						player.getAppearence().transformIntoNPC(
								random == 0 ? 13255 : (random == 1 ? 13256
										: 13257));
					} else if (step == 2) {
						player.setNextAnimation(new Animation(15108));
					} else if (step == 3) {
						player.setNextAnimation(new Animation(15105));
						player.setNextGraphics(new Graphics(1287));
						player.getAppearence().transformIntoNPC(-1);
						stop();
					}
					step++;
				}

				private int step;

			}, 0, 1);
		} else if (id == 53) {// Cat fight
			player.setNextAnimation(new Animation(2252));
		} else if (id == 54) {// Talk to the Hand
			player.setNextAnimation(new Animation(2416));
		} else if (id == 55) {// Shake Hands
			player.setNextAnimation(new Animation(2303));
		} else if (id == 56) {// High Five
			player.setNextAnimation(new Animation(2312));
		} else if (id == 57) {// Face-palm
			player.setNextAnimation(new Animation(2254));
		} else if (id == 58) {// Surrender
			player.setNextAnimation(new Animation(2360));
		} else if (id == 59) {// Levitate
			player.setNextAnimation(new Animation(2327));
		} else if (id == 60) {// Muscle-man Pose
			player.setNextAnimation(new Animation(2566));
		} else if (id == 61) {// ROFL
			player.setNextAnimation(new Animation(2347));
		} else if (id == 62) {// Breathe Fire
			player.setNextAnimation(new Animation(2238));
			player.setNextGraphics(new Graphics(358));
		} else if (id == 63) {// Storm
			player.setNextAnimation(new Animation(2563));
			player.setNextGraphics(new Graphics(365));
		} else if (id == 64) {// Snow
			player.setNextAnimation(new Animation(2417));
			player.setNextGraphics(new Graphics(364));
		} else if (id == 65) {// Invoke Spring
			player.setNextAnimation(new Animation(15357));
			player.setNextGraphics(new Graphics(1391));
		} else if (id == 66) {// Head in sand
			player.setNextAnimation(new Animation(12926));
			player.setNextGraphics(new Graphics(1761));
		} else if (id == 67) {// Hula-hoop
			player.setNextAnimation(new Animation(12928));
		} else if (id == 68) {// Disappear
			player.setNextAnimation(new Animation(12929));
			player.setNextGraphics(new Graphics(1760));
		} else if (id == 69) {// Ghost
			player.setNextAnimation(new Animation(12932));
			player.setNextGraphics(new Graphics(1762));
		} else if (id == 70) {// Bring It!
			player.setNextAnimation(new Animation(12934));
		} else if (id == 71) {// Palm-fist
			player.setNextAnimation(new Animation(12931));
		} else if (id == 72) {// Kneel

		} else if (id == 73) {// Begging

		} else if (id == 74) {// Stir Cauldron

		} else if (id == 75) {// Cheer

		} else if (id == 76) {// Tantrum

		} else if (id == 77) {// Dramatic Death

		} else if (id == 78) {// Jump & Yell

		} else if (id == 79) {// Point

		} else if (id == 80) {// Punch

		} else if (id == 81) {// Raise Hand

		} else if (id == 82) {// Make Speach

		} else if (id == 83) {// Sword Fight

		} else if (id == 84) {// Raise Hand (Sitting)

		} else if (id == 85) {// Wave (Sitting)

		} else if (id == 86) {// Cheer (Sitting)

		} else if (id == 87) {// Throw Tomato (Sitting)

		} else if (id == 88) {// Throw Flowers (Sitting)

		} else if (id == 89) {// Agree (Sitting)

		} else if (id == 90) {// Point (Sitting)

		} else if (id == 91) {// Whistle (Sitting)

		} else if (id == 92) {// Thumbs-Up (Sitting)

		} else if (id == 93) {// Thumbs-Down (Sitting)

		} else if (id == 94) {// Clap (Sitting)

		} else if (id == 95) {// Living on borrowed time
			if (!World.isTileFree(player.getPlane(), player.getX(),
					player.getY(), 3)) {
				player.getPackets().sendGameMessage(
						"You need clear space in order to perform this emote.");
				return;
			} else if (player.getControlerManager().getControler() != null) {
				player.getPackets().sendGameMessage("You can't do this here.");
				return;
			}
			final NPC n = new NPC(14388, new WorldTile(player.getX(),
					player.getY() + 2, player.getPlane()), 0, false);
			n.setLocation(n);
			n.setNextFaceEntity(player);
			player.setNextFaceEntity(n);
			WorldTasksManager.schedule(new WorldTask() {
				int emote = 10;

				@Override
				public void run() {
					if (emote <= 0 || player.hasFinished()) {
						this.stop();
					}
					if (emote == 10) {
						n.setNextAnimation(new Animation(13964));
						player.setNextGraphics(new Graphics(1766));
						player.setNextAnimation(new Animation(13965));
					}
					if (emote == 1) {
						n.setFinished(true);
						World.removeNPC(n);
						n.setNextFaceEntity(null);
					}
					if (emote == 0) {
						player.setNextForceTalk(new ForceTalk(
								"Phew! Close call."));
						player.setNextFaceEntity(null);
						emote = 0;
					}
					if (emote > 0) {
						emote--;
					}
				}
			}, 1, 1);
		} else if (id == 96) {// Troubadour dance
			player.setNextAnimation(new Animation(15424));
		} else if (id == 97) {// Evil Laugh
			player.setNextAnimation(new Animation(player.getAppearence()
					.isMale() ? 15535 : 15536));
		} else if (id == 98) {// Golf Clap
			player.setNextAnimation(new Animation(15520));
		} else if (id == 99) {// LOLcano
			player.setNextAnimation(new Animation(player.getAppearence()
					.isMale() ? 15532 : 15533));
			player.setNextGraphics(new Graphics(2191));
		} else if (id == 100) {// Infernal power
			player.setNextAnimation(new Animation(15529));
			player.setNextGraphics(new Graphics(2197));
		} else if (id == 101) {// Divine power
			player.setNextAnimation(new Animation(15524));
			player.setNextGraphics(new Graphics(2195));
		} else if (id == 102) {// You're dead
			player.setNextAnimation(new Animation(14195));
		} else if (id == 103) {// Scream
			player.setNextAnimation(new Animation(player.getAppearence()
					.isMale() ? 15526 : 15527));
		} else if (id == 104) {// Tornado
			player.setNextAnimation(new Animation(15530));
			player.setNextGraphics(new Graphics(2196));
		} else if (id == 105) {// Chaotic cookery
			player.setNextAnimation(new Animation(15604));
			player.setNextGraphics(new Graphics(2239));
		} else if (id == 106) {// ROFLCopter
			player.setNextAnimation(new Animation(player.getAppearence()
					.isMale() ? 16373 : 16374));
			player.setNextGraphics(new Graphics(3010));
		} else if (id == 107) {// Nature's Might
			player.setNextAnimation(new Animation(16376));
			player.setNextGraphics(new Graphics(3011));
		} else if (id == 108) {// Inner Power
			player.setNextAnimation(new Animation(16382));
			player.setNextGraphics(new Graphics(3014));
		} else if (id == 109) { // Werewolf transformation
			player.setNextAnimation(new Animation(16380));
			player.setNextGraphics(new Graphics(3013));
			player.setNextGraphics(new Graphics(3016));
		} else if (id == 110) {// Celebrate
			player.setNextAnimation(new Animation(16913));
			player.setNextGraphics(new Graphics(3175));
		} else if (id == 111) {
			player.setNextAnimation(new Animation(17079));
		} else if (id == 112) {
			player.setNextAnimation(new Animation(17103));
			player.setNextGraphics(new Graphics(3222));
		} else if (id == 113) {// TODO
			if (!World.isTileFree(player.getPlane(), player.getX(),
					player.getY(), 1)) {
				player.getPackets()
						.sendGameMessage(
								"There is not enough space around you to do this emote.");
				return;
			}
			player.setNextAnimation(new Animation(17076));
			player.setNextGraphics(new Graphics(3226));
		} else if (id == 114) {// TODO
			if (!World.isTileFree(player.getPlane(), player.getX(),
					player.getY(), 3)) {
				player.getPackets()
						.sendGameMessage(
								"There is not enough space around you to do this emote.");
				return;
			}
			player.setNextAnimation(new Animation(17101));
			player.setNextGraphics(new Graphics(3221));
		} else if (id == 115) {
			player.setNextAnimation(new Animation(17077));
			player.setNextGraphics(new Graphics(3219));
		} else if (id == 116) {
			player.setNextAnimation(new Animation(17080));
			player.setNextGraphics(new Graphics(3220));
		} else if (id == 117) {
			player.setNextAnimation(new Animation(17163));
		} else if (id == 118) {
			player.setNextAnimation(new Animation(17166));
		} else if (id == 119) {
			player.setNextAnimation(new Animation(player.getAppearence()
					.isMale() ? 17212 : 17213));
			player.setNextGraphics(new Graphics(3257));
		} else if (id == 120) {
			player.setNextAnimation(new Animation(17186));
			player.setNextGraphics(new Graphics(3252));
			WorldTasksManager.schedule(new WorldTask() {

				@Override
				public void run() {
					// TODO
				}
			});
		} else if (id == 121) {
			// 3252
		}
		if (!isDoingEmote())
			setNextEmoteEnd();
	}

	public void setNextEmoteEnd() {
		nextEmoteEnd = player.getLastAnimationEnd() - 600;
	}

	public void setNextEmoteEnd(long delay) {
		nextEmoteEnd = Utils.currentTimeMillis() + delay;
	}

	public void init() {
		refreshListConfigs();
	}

	private void refreshListConfigs() {
		if (unlockedEmotes.contains(24) && unlockedEmotes.contains(25))
			player.getVarsManager().sendVar(465, 7); // goblin quest emotes
		int value1 = 0;
		if (unlockedEmotes.contains(32))
			value1 += 1;
		if (unlockedEmotes.contains(30))
			value1 += 2;
		if (unlockedEmotes.contains(33))
			value1 += 4;
		if (unlockedEmotes.contains(31))
			value1 += 8;
		if (value1 > 0)
			player.getVarsManager().sendVar(802, value1); // stronghold of
		// security emotes
		if (unlockedEmotes.contains(36))
			player.getVarsManager().sendVar(1085, 249852); // hallowen hand
		// emote
		int value2 = 0;
		if (unlockedEmotes.contains(29))
			value2 += 1;
		if (unlockedEmotes.contains(26))
			value2 += 2;
		if (unlockedEmotes.contains(27))
			value2 += 4;
		if (unlockedEmotes.contains(28))
			value2 += 8;
		if (unlockedEmotes.contains(37))
			value2 += 16;
		if (unlockedEmotes.contains(35))
			value2 += 32;
		if (unlockedEmotes.contains(34))
			value2 += 64;
		if (unlockedEmotes.contains(38))
			value2 += 128;
		if (unlockedEmotes.contains(39))
			value2 += 256;
		if (unlockedEmotes.contains(40))
			value2 += 512;
		if (unlockedEmotes.contains(41))
			value2 += 1024;
		if (unlockedEmotes.contains(42))
			value2 += 2048;
		if (unlockedEmotes.contains(43))
			value2 += 4096;
		if (unlockedEmotes.contains(44))
			value2 += 8192;
		if (unlockedEmotes.contains(46))
			value2 += 16384;
		if (unlockedEmotes.contains(45))
			value2 += 32768;
		if (value2 > 0)
			player.getVarsManager().sendVar(313, value2); //
		player.getVarsManager().sendVar(313, 1);
		if (unlockedEmotes.contains(47))
			player.getVarsManager().sendVar(818, 1);
		player.getVarsManager().sendVar(465, 7);
		player.getVarsManager().sendVar(802, -1);
		player.getVarsManager().sendVar(1085, 249852);
		player.getVarsManager().sendVar(313, -1);
		player.getVarsManager().sendVar(2033, 1043648799);
		player.getVarsManager().sendVar(2032, 7341);
		player.getVarsManager().sendVar(1921, -893736236);
		player.getVarsManager().sendVar(1404, 123728213);
		player.getVarsManager().sendVar(2169, -1);
		player.getVarsManager().sendVar(2230, -1);
		player.getVarsManager().sendVar(1597, -1);
		player.getVarsManager().sendVar(1842, -1);
		player.getVarsManager().sendVar(2432, -1);
		player.getVarsManager().sendVar(1958, 534);
		player.getVarsManager().sendVar(2405, -1);
		player.getVarsManager().sendVar(2458, -1);
	}

	public long getNextEmoteEnd() {
		return nextEmoteEnd;
	}

	public boolean isDoingEmote() {
		return nextEmoteEnd >= Utils.currentTimeMillis();
	}

	public void unlockEmotesBook() {
		player.getPackets().sendUnlockIComponentOptionSlots(590, 8, 0, 118, 0,
				1);
	}
}
