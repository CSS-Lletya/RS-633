package com.rs.net.decoders.handlers;

import com.rs.Settings;
import com.rs.game.Animation;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.minigames.CastleWars;
import com.rs.game.minigames.PuroPuro;
import com.rs.game.minigames.pest.CommendationExchange;
import com.rs.game.npc.NPC;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.npc.familiar.Pyrelord;
import com.rs.game.npc.others.ConditionalDeath;
import com.rs.game.npc.others.FireSpirit;
import com.rs.game.npc.others.GraveStone;
import com.rs.game.npc.others.LivingRock;
import com.rs.game.npc.others.MutatedZygomites;
import com.rs.game.npc.others.Pet;
import com.rs.game.npc.others.PolyporeCreature;
import com.rs.game.npc.others.Strykewyrm;
import com.rs.game.player.Player;
import com.rs.game.player.QuestManager.Quests;
import com.rs.game.player.RouteEvent;
import com.rs.game.player.SlayerManager;
import com.rs.game.player.actions.Fishing;
import com.rs.game.player.actions.Fishing.FishingSpots;
import com.rs.game.player.actions.Rest;
import com.rs.game.player.actions.mining.LivingMineralMining;
import com.rs.game.player.actions.mining.MiningBase;
import com.rs.game.player.actions.runecrafting.SiphonActionCreatures;
import com.rs.game.player.actions.thieving.PickPocketAction;
import com.rs.game.player.actions.thieving.PickPocketableNPC;
import com.rs.game.player.content.AbbysObsticals;
import com.rs.game.player.content.CarrierTravel;
import com.rs.game.player.content.CarrierTravel.Carrier;
import com.rs.game.player.content.EconomyManager;
import com.rs.game.player.content.GnomeGlider;
import com.rs.game.player.content.Hunter;
import com.rs.game.player.content.ItemConstants;
import com.rs.game.player.content.ItemSets;
import com.rs.game.player.content.PlayerLook;
import com.rs.game.player.content.SheepShearing;
import com.rs.game.player.content.Slayer.SlayerMaster;
import com.rs.game.player.content.SpiritshieldCreating;
import com.rs.game.player.content.StealingCreationShop;
import com.rs.game.player.content.Summoning.Pouch;
import com.rs.game.player.controllers.RuneEssenceController;
import com.rs.game.player.controllers.SorceressGarden;
import com.rs.game.player.dialogues.impl.BoatingDialouge;
import com.rs.game.player.dialogues.impl.FremennikShipmaster;
import com.rs.io.InputStream;
import com.rs.utils.Logger;
import com.rs.utils.NPCExamines;
import com.rs.utils.ShopsHandler;
import com.rs.utils.Utils;

public class NPCHandler {

    public static void handleExamine(final Player player, InputStream stream) {
	int npcIndex = stream.readUnsignedShort128();
	boolean forceRun = stream.read128Byte() == 1;
	if (forceRun)
	    player.setRun(forceRun);
	final NPC npc = World.getNPCs().get(npcIndex);
	if (npc == null || npc.hasFinished() || !player.getMapRegionsIds().contains(npc.getRegionId()))
	    return;
	player.getPackets().sendNPCMessage(0, 15263739, npc, NPCExamines.getExamine(npc));
	player.getPackets().sendResetMinimapFlag();
	if (Settings.DEBUG)
	    Logger.log("NPCHandler", "examined npc: " + npcIndex + ", " + npc.getId());
    }

    public static void handleOption1(final Player player, final InputStream stream) {
	int npcIndex = stream.readUnsignedShort128();
	boolean forceRun = stream.read128Byte() == 1;
	final NPC npc = World.getNPCs().get(npcIndex);
	if (npc == null || npc.isCantInteract() || npc.isDead() || npc.hasFinished() || !player.getMapRegionsIds().contains(npc.getRegionId()) || player.isLocked())
	    return;
	player.stopAll();
	if (forceRun)
	    player.setRun(forceRun);
	if (npc.getId() == 4296 || npc.getDefinitions().name.toLowerCase().contains("banker")) {
	    player.setRouteEvent(new RouteEvent(npc, new Runnable() {
		@Override
		public void run() {
		    player.faceEntity(npc);
		    if (!player.withinDistance(npc, 2))
			return;
		    npc.faceEntity(player);
		    player.getDialogueManager().startDialogue("Banker", npc.getId());
		    return;
		}
	    }, true));
	    return;
	}
	if (SiphonActionCreatures.siphon(player, npc))
	    return;
	player.setRouteEvent(new RouteEvent(npc, new Runnable() {
	    @Override
	    public void run() {
		npc.resetWalkSteps();
		player.faceEntity(npc);
		if (!player.getControlerManager().processNPCClick1(npc))
		    return;
		FishingSpots spot = FishingSpots.forId(npc.getId() | 1 << 24);
		if (spot != null) {
		    player.getActionManager().setAction(new Fishing(spot, npc));
		    return; // its a spot, they wont face us
		} else if (npc.getId() >= 8837 && npc.getId() <= 8839) {
		    player.getActionManager().setAction(new LivingMineralMining((LivingRock) npc));
		    return;
		} else if (npc instanceof Familiar) {
		    Familiar familiar = (Familiar) npc;
		    if (player.getFamiliar() != familiar) {
			player.getPackets().sendGameMessage("That isn't your familiar.");
			return;
		    } else if (familiar.getDefinitions().hasOption("interact")) {
			Object[] paramaters = new Object[2];
			Pouch pouch = player.getFamiliar().getPouch();
			if (pouch == Pouch.SPIRIT_GRAAHK) {
			    paramaters[0] = "Karamja's Hunter Area";
			    paramaters[1] = new WorldTile(2787, 3000, 0);
			} else if (pouch == Pouch.SPIRIT_KYATT) {
			    paramaters[0] = "Piscatorius Hunter Area";
			    paramaters[1] = new WorldTile(2339, 3636, 0);
			} else if (pouch == Pouch.SPIRIT_LARUPIA) {
			    paramaters[0] = "Feldip Hills Hunter Area";
			    paramaters[1] = new WorldTile(2557, 2913, 0);
			} else if (pouch == Pouch.ARCTIC_BEAR) {
			    paramaters[0] = "Rellekka Hills Hunter Area";
			    paramaters[1] = new WorldTile(2721, 3779, 0);
			} else if (pouch == Pouch.LAVA_TITAN) {
			    paramaters[0] = "Lava Maze - *Deep Wilderness*";
			    paramaters[1] = new WorldTile(3028, 3840, 0);
			} else
			    return;
			player.getDialogueManager().startDialogue("FamiliarInspection", paramaters[0], paramaters[1]);
		    }
		    return;
		} else if (npc instanceof GraveStone) {
		    GraveStone grave = (GraveStone) npc;
		    grave.sendGraveInscription(player);
		    return;
		}
		npc.faceEntity(player);
		Object[] shipAttributes = BoatingDialouge.getBoatForShip(npc.getId());
		if (shipAttributes != null) {
		    player.getDialogueManager().startDialogue("BoatingDialouge", npc.getId());
		} else if (npc.getId() == 3709)
		    player.getDialogueManager().startDialogue("MrEx", npc.getId());
		else if (npc.getId() == 2290)
		    player.getDialogueManager().startDialogue("SirTiffyCashien", npc.getId());
		else if (npc.getId() == 4511)
		    player.getDialogueManager().startDialogue("Oneiromancer", npc.getId());
		else if (npc.getId() == 8171 || npc.getId() == 8172)
		    player.getDialogueManager().startDialogue("Dimintheis", npc.getId());
		else if (npc.getId() == 8266)
		    player.getDialogueManager().startDialogue("Ghommel");
		else if (npc.getId() == 5532)
		    player.getDialogueManager().startDialogue("SorceressGardenNPCs", npc);
		else if (npc.getId() == 5563)
		    player.getDialogueManager().startDialogue("SorceressGardenNPCs", npc);
		else if (npc.getId() == 15907)
		    player.getDialogueManager().startDialogue("OsmanDialogue", npc.getId());
		else if (npc.getId() == 837)
		    player.getDialogueManager().startDialogue("ShantyGuardD", npc.getId());
		else if (npc.getId() == 836)
		    player.getDialogueManager().startDialogue("ShantyD");
		else if (npc.getId() == 2301)
		    player.getDialogueManager().startDialogue("ShantyMonkeyD");
		else if (npc.getId() == 5915)
		    player.getDialogueManager().startDialogue("ClaimClanItem", npc.getId(), 20709);
		else if (npc.getId() == 14872)
		    player.getDialogueManager().startDialogue("MiladeDeathD");
		else if (npc.getId() == 1526)
		    player.getDialogueManager().startDialogue("Lanthus", npc.getId());
		else if (npc.getId() == 13633)
		    player.getDialogueManager().startDialogue("ClaimClanItem", npc.getId(), 20708);
		else if (npc.getId() == 2291)
		    player.getDialogueManager().startDialogue("RugMerchantD", false, 0);
		else if (npc.getId() == 171)
		    player.getDialogueManager().startDialogue("Brimstail", npc);
		else if (npc.getId() == 250)
		    player.getDialogueManager().startDialogue("LadyOfTheLake");
		else if (EconomyManager.isEconomyManagerNpc(npc.getId()))
		    EconomyManager.processManagerNpcClick(player, npc.getId());
		else if (npc.getId() == 5559)
		    player.sendDeath(npc);
		else if (npc.getId() == 15451 && npc instanceof FireSpirit) {
		    FireSpirit spirit = (FireSpirit) npc;
		    spirit.giveReward(player);
		} else if (npc.getId() == 1204 || npc.getId() == 1206 || npc.getId() == 4649) {
		    boolean onDuty = Utils.random(2) == 0;
		    player.getDialogueManager().startDialogue("SimpleNPCMessage", npc.getId(), onDuty ? "I'm on duty, this isn't the time to be talking to strangers" : "It isn't safe here, its best for you to leave now...");
		    player.getPackets().sendGameMessage("After all I've been through I think I can handle myself...");
		} else if (npc.getId() == 398 || npc.getId() == 399)
		    player.getDialogueManager().startDialogue("SimpleNPCMessage", npc.getId(), "Welcome. I hope you enjoy your time in the Legends' Guild.");
		else if (npc.getId() >= 1 && npc.getId() <= 6 || npc.getId() >= 7875 && npc.getId() <= 7884)
		    player.getDialogueManager().startDialogue("Man", npc.getId());
		else if (npc.getId() == 198)
		    player.getDialogueManager().startDialogue("Guildmaster", npc.getId());
		else if (npc.getId() == 11509)
		    player.getDialogueManager().startDialogue("CommodreTyr", npc.getId());
		else if (npc.getId() == 9462 || npc.getId() == 9464 || npc.getId() == 9466)
		    Strykewyrm.handleStomping(player, npc);
		else if (npc.getId() == 1208)
		    player.getDialogueManager().startDialogue("QuartsMaster");
		else if (npc.getId() == 9707)
		    player.getDialogueManager().startDialogue("FremennikShipmaster", npc.getId(), true);
		else if (npc.getId() == 9708)
		    player.getDialogueManager().startDialogue("FremennikShipmaster", npc.getId(), false);
		else if (npc.getId() == 456)
		    player.getDialogueManager().startDialogue("FatherAereck", npc.getId());
		else if (npc.getId() == 1793)
		    player.getDialogueManager().startDialogue("CraftingMaster", npc.getId());
		else if (npc.getId() == 3344 || npc.getId() == 3345)
		    MutatedZygomites.transform(player, npc);
		else if (npc.getId() == 11270)
		    ShopsHandler.openShop(player, 19);
		else if (npc.getId() == 562)// 107
		    player.getDialogueManager().startDialogue("CandleMaker");
		else if (npc.getId() == 576)
		    player.getDialogueManager().startDialogue("Harry");
		else if (npc.getId() == 563)
		    player.getDialogueManager().startDialogue("Arhein");
		else if (npc.getId() == 575)
		    player.getDialogueManager().startDialogue("Hickton");
		else if (npc.getId() == 2305)
		    player.getDialogueManager().startDialogue("Vannesa");
		else if (npc.getId() == 8527) // nomad capes
		    player.getDialogueManager().startDialogue("SimpleNPCMessage", 8527, player.getQuestManager().completedQuest(Quests.NOMADS_REQUIEM) ? "Right click me to see my rewards brother!" : "You must kill nomad inside the tent there to see my rewards.");
		else if (npc.getId() == 6537 || npc.getId() == 6539)
		    player.getDialogueManager().startDialogue("Mandrith_Nastroth", npc.getId());
		else if (npc.getId() == 2676)
		    player.getDialogueManager().startDialogue("MakeOverMage", npc.getId(), 0);
		else if (npc.getId() == 598)
		    player.getDialogueManager().startDialogue("Hairdresser", npc.getId());
		else if (npc.getId() == 548)
		    player.getDialogueManager().startDialogue("Thessalia", npc.getId());
		else if (npc.getId() == 659)
		    player.getDialogueManager().startDialogue("PartyPete");
		else if (npc.getId() == 579)
		    player.getDialogueManager().startDialogue("DrogoDwarf", npc.getId());
		else if (npc.getId() == 3799) // void general store
		    player.getDialogueManager().startDialogue("GeneralStore", npc.getId(), 122);
		else if (npc.getId() == 582) // dwarves general store
		    player.getDialogueManager().startDialogue("GeneralStore", npc.getId(), 31);
		else if (npc.getId() == 1917)
		    player.getDialogueManager().startDialogue("GeneralStore", npc.getId(), 106);
		else if (npc.getId() == 932)
		    player.getDialogueManager().startDialogue("GeneralStore", npc.getId(), 113);
		else if (npc.getId() == 1040)
		    player.getDialogueManager().startDialogue("GeneralStore", npc.getId(), 81);
		else if (npc.getId() == 209) // cannon shop
		    player.getDialogueManager().startDialogue("Nulodion", npc.getId());
		else if (npc.getId() == 15099)
		    player.getDialogueManager().startDialogue("Freda");
		else if (npc.getId() == 4358)
		    player.getDialogueManager().startDialogue("CaveyDavey");
		else if (npc.getId() == 15087)
		    player.getDialogueManager().startDialogue("DeathPlatueSoldier");
		else if (npc.getId() == 1334)
		    player.getDialogueManager().startDialogue("Jossik", npc.getId());
		else if (npc.getId() == 904)
		    player.getDialogueManager().startDialogue("ChamberGaurdian", npc.getId());
		else if (npc.getId() == 2259)
		    player.getDialogueManager().startDialogue("MageOfZamorak");
		else if (npc.getId() == 903)
		    player.getDialogueManager().startDialogue("Lundail", npc.getId());
		else if (npc.getId() == 528 || npc.getId() == 529) // edge
		    player.getDialogueManager().startDialogue("GeneralStore", npc.getId(), 1);
		else if (npc.getId() == 522 || npc.getId() == 523) // varrock
		    player.getDialogueManager().startDialogue("GeneralStore", npc.getId(), 8);
		else if (npc.getId() == 520 || npc.getId() == 521) // lumbridge
		    player.getDialogueManager().startDialogue("GeneralStore", npc.getId(), 4);
		else if (npc.getId() == 2825 || npc.getId() == 2826)
		    player.getDialogueManager().startDialogue("PiratePete", npc);
		else if (npc.getId() == 1301)
		    player.getDialogueManager().startDialogue("Yrsa");
		else if (npc.getId() == 594)
		    player.getDialogueManager().startDialogue("Nurmof", npc.getId());
		else if (npc.getId() == 665)
		    player.getDialogueManager().startDialogue("BootDwarf", npc.getId());
		else if (npc.getId() == 5913) // Aubury
		    player.getDialogueManager().startDialogue("Aubury", npc);
		else if (npc.getId() == 382 || npc.getId() == 3294 || npc.getId() == 4316)
		    player.getDialogueManager().startDialogue("MiningGuildDwarf", npc.getId(), false);
		else if (npc.getId() == 3295)
		    player.getDialogueManager().startDialogue("MiningGuildDwarf", npc.getId(), true);
		else if (npc.getId() == 537)
		    player.getDialogueManager().startDialogue("Scavvo", npc.getId());
		else if (npc.getId() == 536)
		    player.getDialogueManager().startDialogue("GeneralStore", npc.getId(), 17);
		else if (npc.getId() == 4563) // Crossbow Shop
		    player.getDialogueManager().startDialogue("Hura", npc.getId());
		else if (npc.getId() == 2617)
		    player.getDialogueManager().startDialogue("TzHaarMejJal", npc.getId());
		else if (npc.getId() == 3802 || npc.getId() == 6140 || npc.getId() == 6141)
		    player.getDialogueManager().startDialogue("LanderSquire", npc.getId());
		else if (npc.getId() == 2618)
		    player.getDialogueManager().startDialogue("TzHaarMejKah", npc.getId());
		else if (npc.getId() == 1595)
		    player.getDialogueManager().startDialogue("SaniBoch", false);
		else if (npc.getId() == 15149)
		    player.getDialogueManager().startDialogue("MasterOfFear", 0);
		else if (SlayerMaster.startInteractionForId(player, npc.getId(), 1))
		    return;
		else if (npc.getId() == 1282)
		    player.getDialogueManager().startDialogue("EcoTestDialog", false);
		else if (npc.getId() == 11519)
		    player.getDialogueManager().startDialogue("Mariah");
		else if (npc.getId() == 11516)
		    player.getDialogueManager().startDialogue("TerryGord");
		else if (npc.getId() == 11517)
		    player.getDialogueManager().startDialogue("MrsGord");
		else if (npc.getId() == 3797)
		    player.getDialogueManager().startDialogue("RepairSquire");
		else if (npc.getId() == 3790 || npc.getId() == 3791 || npc.getId() == 3792)
		    player.getDialogueManager().startDialogue("VoidKnightExchange", npc.getId());
		else if (npc.getName().toLowerCase().contains("impling")) {
		    Hunter.captureFlyingEntity(player, npc);
		} else if (npc instanceof Pet) {
		    Pet pet = (Pet) npc;
		    if (pet != player.getPet()) {
			player.getPackets().sendGameMessage("This isn't your pet.");
			return;
		    }
		    player.setNextAnimation(new Animation(827));
		    pet.pickup();
		} else if (npc.getDefinitions().hasOption("Trade")) {
		    player.getDialogueManager().startDialogue("DefaultTradeDialouge", npc.getId(), stream);
		} else {
		    switch (npc.getDefinitions().name.toLowerCase()) {
			case "void knight":
			    player.getDialogueManager().startDialogue("VoidKnightExchange", npc.getId());
			    break;
			case "sheep":
			    SheepShearing.shearAttempt(player, npc);
			    break;
			case "musician":
			case "drummer":
			    if (player.isResting()) {
				player.stopAll();
				return;
			    }
			    if (player.getEmotesManager().isDoingEmote()) {
				player.getPackets().sendGameMessage("You can't rest while perfoming an emote.");
				return;
			    }
			    if (player.isLocked()) {
				player.getPackets().sendGameMessage("You can't rest while perfoming an action.");
				return;
			    }
			    player.stopAll();
			    player.getActionManager().setAction(new Rest(true));
			    break;
			default:
			    player.getPackets().sendGameMessage("Nothing interesting happens.");
			    if (Settings.DEBUG)
				System.out.println("cliked 1 at npc[" + npc.getIndex() + "] id : " + npc.getId() + ", " + npc.getX() + ", " + npc.getY() + ", " + npc.getPlane());
			    break;
		    }
		}
	    }
	}));
    }

    public static void handleOption2(final Player player, InputStream stream) {
	int npcIndex = stream.readUnsignedShort128();
	boolean forceRun = stream.read128Byte() == 1;
	final NPC npc = World.getNPCs().get(npcIndex);
	if (npc == null || npc.isCantInteract() || npc.isDead() || npc.hasFinished() || !player.getMapRegionsIds().contains(npc.getRegionId()) || player.isLocked())
	    return;
	player.stopAll();
	if (forceRun)
	    player.setRun(forceRun);
	if (npc.getId() == 4296 || npc.getDefinitions().name.contains("Banker") || npc.getDefinitions().name.contains("banker")) {
	    player.setRouteEvent(new RouteEvent(npc, new Runnable() {
		@Override
		public void run() {
		    player.faceEntity(npc);
		    if (!player.withinDistance(npc, 2))
			return;
		    npc.faceEntity(player);
		    player.getBank().openBank();
		    return;
		}
	    }, true));
	    return;
	}
	if (npc.getDefinitions().name.toLowerCase().equals("grand exchange clerk")) {
	    player.setRouteEvent(new RouteEvent(npc, new Runnable() {
		@Override
		public void run() {
		    player.faceEntity(npc);
		    if (!player.withinDistance(npc, 2))
			return;
		    npc.faceEntity(player);
		    player.getGeManager().openGrandExchange();
		    return;
		}
	    }, true));
	    return;
	}
	player.setRouteEvent(new RouteEvent(npc, new Runnable() {
	    @Override
	    public void run() {
		npc.resetWalkSteps();
		player.faceEntity(npc);
		FishingSpots spot = FishingSpots.forId(npc.getId() | (2 << 24));
		if (spot != null) {
		    player.getActionManager().setAction(new Fishing(spot, npc));
		    return;
		}
		PickPocketableNPC pocket = PickPocketableNPC.get(npc.getId());
		if (pocket != null) {
		    player.getActionManager().setAction(new PickPocketAction(npc, pocket));
		    return;
		} else if (npc instanceof Familiar) {
		    Familiar familiar = (Familiar) npc;
		    if (player.getFamiliar() != familiar) {
			player.getPackets().sendGameMessage("That isn't your familiar.");
			return;
		    }
		    if (familiar.getDefinitions().hasOption("store") || npc.getDefinitions().hasOption("withdraw")) {
			player.getFamiliar().store();
		    } else if (familiar.getDefinitions().hasOption("cure")) {
			if (!player.getPoison().isPoisoned()) {
			    player.getPackets().sendGameMessage("Your arent poisoned or diseased.");
			    return;
			} else {
			    player.getFamiliar().drainSpecial(2);
			    player.addPoisonImmune(120);
			}
		    } else if (familiar.getDefinitions().hasOption("interact")) {
			Object[] paramaters = new Object[2];
			Pouch pouch = player.getFamiliar().getPouch();
			if (pouch == Pouch.SPIRIT_GRAAHK) {
			    paramaters[0] = "Karamja's Hunter Area";
			    paramaters[1] = new WorldTile(2787, 3000, 0);
			} else if (pouch == Pouch.SPIRIT_KYATT) {
			    paramaters[0] = "Piscatorius Hunter Area";
			    paramaters[1] = new WorldTile(2339, 3636, 0);
			} else if (pouch == Pouch.SPIRIT_LARUPIA) {
			    paramaters[0] = "Feldip Hills Hunter Area";
			    paramaters[1] = new WorldTile(2557, 2913, 0);
			} else if (pouch == Pouch.ARCTIC_BEAR) {
			    paramaters[0] = "Rellekka Hills Hunter Area";
			    paramaters[1] = new WorldTile(2721, 3779, 0);
			} else if (pouch == Pouch.LAVA_TITAN) {
			    paramaters[0] = "Lava Maze - *Deep Wilderness*";
			    paramaters[1] = new WorldTile(3028, 3840, 0);
			} else
			    return;
			player.getDialogueManager().startDialogue("FamiliarInspection", paramaters[0], paramaters[1]);
		    }
		    return;
		} else if (npc instanceof GraveStone) {
		    GraveStone grave = (GraveStone) npc;
		    grave.repair(player, false);
		    return;
		}
		npc.faceEntity(player);
		if (!player.getControlerManager().processNPCClick2(npc))
		    return;
		switch (npc.getDefinitions().name.toLowerCase()) {
		    case "void knight":
			CommendationExchange.openExchangeShop(player);
			break;
		}
		Object[] shipAttributes = BoatingDialouge.getBoatForShip(npc.getId());
		if (shipAttributes != null) {
		    CarrierTravel.sendCarrier(player, (Carrier) shipAttributes[0], (boolean) shipAttributes[1]);
		} else if (npc.getId() == 9707)
		    FremennikShipmaster.sail(player, true);
		else if (npc.getId() == 9708)
		    FremennikShipmaster.sail(player, false);
		else if (SlayerMaster.startInteractionForId(player, npc.getId(), 2))
		    return;
		else if (npc.getId() == 2619 || npc.getId() == 13455 || npc.getId() == 2617 || npc.getId() == 2618 || npc.getId() == 15194)
		    player.getBank().openBank();
		else if (npc.getId() == 14849 && npc instanceof ConditionalDeath)
		    ((ConditionalDeath) npc).useHammer(player);
		else if (npc.getId() == 528 || npc.getId() == 529)
		    ShopsHandler.openShop(player, 1);
		else if (npc.getId() == 3799)
		    ShopsHandler.openShop(player, 122);
		else if (npc.getId() == 9159)
		    ShopsHandler.openShop(player, 123);
		else if (npc.getId() == 2291)
		    player.getDialogueManager().startDialogue("RugMerchantD", true, 0);
		else if (npc.getId() == 519)
		    ShopsHandler.openShop(player, 2);
		else if (npc.getId() == 520 || npc.getId() == 521)
		    ShopsHandler.openShop(player, 4);
		else if (npc.getId() == 538)
		    ShopsHandler.openShop(player, 6);
		else if (npc.getId() == 522 || npc.getId() == 523)
		    ShopsHandler.openShop(player, 8);
		else if (npc.getId() == 797)
		    ShopsHandler.openShop(player, 115);
		else if (npc.getId() == 546)
		    ShopsHandler.openShop(player, 10);
		else if (npc.getId() == 4293)
		    ShopsHandler.openShop(player, 120);
		else if (npc.getId() == 4294)
		    ShopsHandler.openShop(player, 121);
		else if (npc.getId() == 4295)
		    ShopsHandler.openShop(player, 119);
		else if (npc.getId() == 14620)
		    ShopsHandler.openShop(player, 118);
		else if (npc.getId() == 5915)
		    player.getDialogueManager().startDialogue("ClaimClanItem", npc.getId(), 20709);
		else if (npc.getId() == 13633)
		    player.getDialogueManager().startDialogue("ClaimClanItem", npc.getId(), 20708);
		else if (npc.getId() == 2824 || npc.getId() == 1041)
		    player.getDialogueManager().startDialogue("TanningD", npc.getId());
		else if (npc.getId() == 535 || npc.getId() == 534)
		    ShopsHandler.openShop(player, 55);
		else if (npc.getId() == 836)
		    ShopsHandler.openShop(player, 92);
		else if (npc.getId() == 2352)
		    ShopsHandler.openShop(player, 74);
		else if (npc.getId() == 2259)
		    ShopsHandler.openShop(player, 112);
		else if (npc.getId() == 1917)
		    ShopsHandler.openShop(player, 106);
		else if (npc.getId() == 932)
		    ShopsHandler.openShop(player, 113);
		else if (npc.getId() == 933)
		    ShopsHandler.openShop(player, 114);
		else if (npc.getId() == 747)
		    ShopsHandler.openShop(player, 7);
		else if (npc.getId() == 2353)
		    ShopsHandler.openShop(player, 75);
		else if (npc.getId() == 2356)
		    ShopsHandler.openShop(player, 76);
		else if (npc.getId() == 3166)
		    ShopsHandler.openShop(player, 89);
		else if (npc.getId() == 3161)
		    ShopsHandler.openShop(player, 90);
		else if (npc.getId() == 2154)
		    ShopsHandler.openShop(player, 105);
		else if (npc.getId() == 2160)
		    ShopsHandler.openShop(player, 99);
		else if (npc.getId() == 2151)
		    ShopsHandler.openShop(player, 104);
		else if (npc.getId() == 563)
		    ShopsHandler.openShop(player, 108);
		else if (npc.getId() == 576)
		    ShopsHandler.openShop(player, 110);
		else if (npc.getId() == 562)
		    ShopsHandler.openShop(player, 107);
		else if (npc.getId() == 575)
		    ShopsHandler.openShop(player, 109);
		else if (npc.getId() == 2305)
		    ShopsHandler.openShop(player, 111);
		else if (npc.getId() == 2161)
		    ShopsHandler.openShop(player, 103);
		else if (npc.getId() == 2152)
		    ShopsHandler.openShop(player, 100);
		else if (npc.getId() == 2153)
		    ShopsHandler.openShop(player, 101);
		else if (npc.getId() == 4248)
		    ShopsHandler.openShop(player, 102);
		else if (npc.getId() == 3162)
		    ShopsHandler.openShop(player, 91);
		else if (npc.getId() == 564)
		    ShopsHandler.openShop(player, 53);
		else if (npc.getId() == 4516)
		    ShopsHandler.openShop(player, 70);
		else if (npc.getId() == 4518)
		    ShopsHandler.openShop(player, 66);
		else if (npc.getId() == 566)
		    ShopsHandler.openShop(player, 52);
		else if (npc.getId() == 540)
		    ShopsHandler.openShop(player, 61);
		else if (npc.getId() == 541)
		    ShopsHandler.openShop(player, 62);
		else if (npc.getId() == 542)
		    ShopsHandler.openShop(player, 63);
		else if (npc.getId() == 544)
		    ShopsHandler.openShop(player, 64);
		else if (npc.getId() == 2620) // TzHaar-Hur-Tel's Equipment
					      // Store
		    ShopsHandler.openShop(player, 77);
		else if (npc.getId() == 2622) // TzHaar-Hur-Lek's Ore and Gem
					      // Store
		    ShopsHandler.openShop(player, 78);
		else if (npc.getId() == 2623) // TzHaar-Mej-Roh's Rune Store
		    ShopsHandler.openShop(player, 79);
		else if (npc.getId() == 583) // Betty's Magic Emporium
		    ShopsHandler.openShop(player, 67);
		else if (npc.getId() == 587) // Jatix's Herblore Shop
		    ShopsHandler.openShop(player, 69);
		else if (npc.getId() == 545)
		    ShopsHandler.openShop(player, 65);
		else if (npc.getId() == 5510)
		    ShopsHandler.openShop(player, 56);
		else if (npc.getId() == 6892)
		    ShopsHandler.openShop(player, 57);
		else if (npc.getId() == 11475)
		    ShopsHandler.openShop(player, 9);
		else if (npc.getId() == 1658)
		    ShopsHandler.openShop(player, 58);
		else if (npc.getId() == 461)
		    ShopsHandler.openShop(player, 59);
		else if (npc.getId() == 8228)
		    StealingCreationShop.openInterface(player);
		else if (npc.getId() == 593)
		    ShopsHandler.openShop(player, 60);
		else if (npc.getId() == 5113) // Hunter Expert's shop
		    ShopsHandler.openShop(player, 22);
		else if (npc.getId() == 8527) // nomad capes
		    if (player.getQuestManager().completedQuest(Quests.NOMADS_REQUIEM))
			ShopsHandler.openShop(player, 51);
		    else
			player.getDialogueManager().startDialogue("SimpleNPCMessage", 8527, "You must kill nomad inside the tent there to see my rewards.");
		else if (npc.getId() == 1595)
		    player.getDialogueManager().startDialogue("SaniBoch", false);
		else if (npc.getId() == 3810)
		    GnomeGlider.openInterface(player, 1);
		else if (npc.getId() == 3809)
		    GnomeGlider.openInterface(player, 3);
		else if (npc.getId() == 3812)
		    GnomeGlider.openInterface(player, 4);
		else if (npc.getId() == 1800)
		    GnomeGlider.openInterface(player, 5);
		else if (npc.getId() == 3811)
		    GnomeGlider.openInterface(player, 0);
		else if (npc.getId() == 1301)
		    ShopsHandler.openShop(player, 50);
		else if (npc.getId() == 551)
		    ShopsHandler.openShop(player, 13);
		else if (npc.getId() == 550)
		    ShopsHandler.openShop(player, 14);
		else if (npc.getId() == 549)
		    ShopsHandler.openShop(player, 15);
		else if (npc.getId() == 548)
		    ShopsHandler.openShop(player, 18); // thesalia
		else if (npc.getId() == 2233 || npc.getId() == 3671)
		    ShopsHandler.openShop(player, 20);
		else if (npc.getId() == 970)
		    ShopsHandler.openShop(player, 21);
		else if (npc.getId() == 579) // Drogo's mining Emporium
		    ShopsHandler.openShop(player, 30);
		else if (npc.getId() == 582) // dwarves general store
		    ShopsHandler.openShop(player, 31);
		else if (npc.getId() == 1040)
		    ShopsHandler.openShop(player, 81);
		else if (npc.getId() == 1039)
		    ShopsHandler.openShop(player, 82);
		else if (npc.getId() == 1038)
		    ShopsHandler.openShop(player, 83);
		else if (npc.getId() == 558) // Gerrant's Fishy Business
		    ShopsHandler.openShop(player, 84);
		else if (npc.getId() == 556) // Grum's Gold Exchange
		    ShopsHandler.openShop(player, 85);
		else if (npc.getId() == 559) // Brian's Battleaxe Bazaar
		    ShopsHandler.openShop(player, 86);
		else if (npc.getId() == 557) // Wydin's Food Store
		    ShopsHandler.openShop(player, 87);
		else if (npc.getId() >= 4650 && npc.getId() <= 4656) // Trader
								     // Stan's
								     // Trading
								     // Post
		    ShopsHandler.openShop(player, 88);
		else if (npc.getId() == 209) // cannon shop
		    ShopsHandler.openShop(player, 34);
		else if (npc.getId() == 1334) // The Lighthouse Store
		    ShopsHandler.openShop(player, 36);
		else if (npc.getId() == 594) // Nurmof's Pickaxe Shop
		    ShopsHandler.openShop(player, 32);
		else if (npc.getId() == 537) // Scavvo's Rune Store
		    ShopsHandler.openShop(player, 12);
		else if (npc.getId() == 536) // Valaine's Shop of Champions
		    ShopsHandler.openShop(player, 17);
		else if (npc.getId() == 4563) // Crossbow Shop
		    ShopsHandler.openShop(player, 33);
		else if (npc.getId() == 6070)
		    PuroPuro.openPuroInterface(player);
		else if (npc.getId() == 904)
		    ShopsHandler.openShop(player, 37);
		else if (npc.getId() == 1303)
		    ShopsHandler.openShop(player, 42);
		else if (npc.getId() == 903)
		    ShopsHandler.openShop(player, 38);
		else if (npc.getId() == 6988)
		    ShopsHandler.openShop(player, 39);
		else if (npc.getId() == 1316)
		    ShopsHandler.openShop(player, 43);
		else if (npc.getId() == 1315 || npc.getId() == 5484 || npc.getId() == 5487)
		    ShopsHandler.openShop(player, 45);
		else if (npc.getId() == 5485)
		    ShopsHandler.openShop(player, 47);
		else if (npc.getId() == 5483)
		    ShopsHandler.openShop(player, 46);
		else if (npc.getId() == 5509)
		    ShopsHandler.openShop(player, 48);
		else if (npc.getId() == 3798)
		    ShopsHandler.openShop(player, 40);
		else if (npc.getId() == 3796)
		    ShopsHandler.openShop(player, 41);
		else if (npc.getId() == 15149)
		    player.getDialogueManager().startDialogue("MasterOfFear", 3);
		else if (npc.getId() == 462) // Aubury
		    RuneEssenceController.teleport(player, npc);
		else if (npc.getId() == 2676)
		    PlayerLook.openMageMakeOver(player);
		else if (npc.getId() == 598)
		    PlayerLook.openHairdresserSalon(player);
		else if (npc.getId() == 1282)
		    player.getDialogueManager().startDialogue("EcoTestDialog", true);
		else if (npc.getId() == 171) // Brimstail
		    RuneEssenceController.teleport(player, npc);
		else if (npc instanceof Pet) {
		    if (npc != player.getPet()) {
			player.getPackets().sendGameMessage("This isn't your pet!");
			return;
		    }
		    Pet pet = player.getPet();
		    player.getPackets().sendMessage(99, "Pet [id=" + pet.getId() + ", hunger=" + pet.getDetails().getHunger() + ", growth=" + pet.getDetails().getGrowth() + ", stage=" + pet.getDetails().getStage() + "].", player);
		} else {
		    player.getPackets().sendGameMessage("Nothing interesting happens.");
		    if (Settings.DEBUG)
			System.out.println("cliked 2 at npc id : " + npc.getId() + ", " + npc.getX() + ", " + npc.getY() + ", " + npc.getPlane());
		}
	    }
	}));
    }

    public static void handleOption3(final Player player, InputStream stream) {
	int npcIndex = stream.readUnsignedShort128();
	boolean forceRun = stream.read128Byte() == 1;
	final NPC npc = World.getNPCs().get(npcIndex);
	if (npc == null || npc.isCantInteract() || npc.isDead() || npc.hasFinished() || !player.getMapRegionsIds().contains(npc.getRegionId()) || player.isLocked())
	    return;
	player.stopAll(false);
	if (forceRun)
	    player.setRun(forceRun);
	if (npc.getId() == 4296 || npc.getDefinitions().name.toLowerCase().contains("banker")) {
	    player.setRouteEvent(new RouteEvent(npc, new Runnable() {
		@Override
		public void run() {
		    player.faceEntity(npc);
		    if (!player.withinDistance(npc, 2))
			return;
		    npc.faceEntity(player);
		    player.getGeManager().openCollectionBox();
		    return;
		}
	    }, true));
	    return;
	}
	if (npc.getDefinitions().name.toLowerCase().equals("grand exchange clerk")) {
	    player.setRouteEvent(new RouteEvent(npc, new Runnable() {
		@Override
		public void run() {
		    player.faceEntity(npc);
		    if (!player.withinDistance(npc, 2))
			return;
		    npc.faceEntity(player);
		    player.getGeManager().openHistory();
		    return;
		}
	    }, true));
	    return;
	}
	player.setRouteEvent(new RouteEvent(npc, new Runnable() {
	    @Override
	    public void run() {
		npc.resetWalkSteps();
		if (!player.getControlerManager().processNPCClick3(npc))
		    return;
		player.faceEntity(npc);
		if (npc.getId() >= 8837 && npc.getId() <= 8839) {
		    MiningBase.propect(player, "You examine the remains...", "The remains contain traces of living minerals.");
		    return;
		} else if (npc.getDefinitions().hasOption("Charter")) {
		    CarrierTravel.openCharterInterface(player);
		    return;
		} else if (npc instanceof GraveStone) {
		    GraveStone grave = (GraveStone) npc;
		    grave.repair(player, true);
		    return;
		}
		npc.faceEntity(player);
		if (SlayerMaster.startInteractionForId(player, npc.getId(), 3))
		    ShopsHandler.openShop(player, 29);
		else if (npc.getId() == 2619)
		    player.getGeManager().openCollectionBox();
		else if (npc.getId() == 1526)
		    CastleWars.openCastleWarsTicketExchange(player);
		else if (npc.getId() == 14877)
		    player.getDialogueManager().startDialogue("TanningD", npc.getId());
		else if (npc.getId() == 548)
		    PlayerLook.openThessaliasMakeOver(player);
		else if (npc.getId() == 1301)
		    PlayerLook.openYrsaShop(player);
		else if (npc.getId() == 2259)
		    AbbysObsticals.teleport(player, npc);
		else if (npc.getId() == 4287)
		    player.getDialogueManager().startDialogue("GamfriedShield");
		else if (npc.getId() == 5532)
		    SorceressGarden.teleportToSorceressGardenNPC(npc, player);
		else if (npc.getId() == 1334) // Book Shop
		    ShopsHandler.openShop(player, 35);
		else if (npc.getId() == 5913) // Aubury
		    ShopsHandler.openShop(player, 11);
		else
		    player.getPackets().sendGameMessage("Nothing interesting happens.");
	    }
	}));
	if (Settings.DEBUG)
	    System.out.println("cliked 3 at npc id : " + npc.getId() + ", " + npc.getX() + ", " + npc.getY() + ", " + npc.getPlane());
    }

    public static void handleOption4(final Player player, InputStream stream) {
	int npcIndex = stream.readUnsignedShort128();
	boolean forceRun = stream.read128Byte() == 1;
	final NPC npc = World.getNPCs().get(npcIndex);
	if (npc == null || npc.isCantInteract() || npc.isDead() || npc.hasFinished() || !player.getMapRegionsIds().contains(npc.getRegionId()) || player.isLocked())
	    return;
	player.stopAll(false);
	if (forceRun)
	    player.setRun(forceRun);
	if (npc.getDefinitions().name.toLowerCase().equals("grand exchange clerk")) {
	    player.setRouteEvent(new RouteEvent(npc, new Runnable() {
		@Override
		public void run() {
		    player.faceEntity(npc);
		    if (!player.withinDistance(npc, 2))
			return;
		    npc.faceEntity(player);
		    ItemSets.openSets(player);
		    return;
		}
	    }, true));
	    return;
	}
	player.setRouteEvent(new RouteEvent(npc, new Runnable() {
	    @Override
	    public void run() {
		npc.resetWalkSteps();
		if (!player.getControlerManager().processNPCClick4(npc))
		    return;
		player.faceEntity(npc);
		if (npc instanceof GraveStone) {
		    GraveStone grave = (GraveStone) npc;
		    grave.demolish(player);
		    return;
		}
		npc.faceEntity(player);
		if (npc.getId() == 14866)
		    ShopsHandler.openShop(player, 39);
		else if (npc.getId() == 6070)
		    ShopsHandler.openShop(player, 54);
		else if (npc.getId() == 5913) // Aubury
		    RuneEssenceController.teleport(player, npc);
		else if (npc.getId() == 14872)
		    player.getDialogueManager().startDialogue("KillingQuickD");
		else if (npc.getId() == 5110) // Aleck's Hunter Emporium
		    ShopsHandler.openShop(player, 56);
		else if (npc.getId() == 14854) // Poletax's Herblore Shop
		    ShopsHandler.openShop(player, 68);
		else if (SlayerMaster.startInteractionForId(player, npc.getId(), 4))
		    player.getSlayerManager().sendSlayerInterface(SlayerManager.BUY_INTERFACE);
		else
		    player.getPackets().sendGameMessage("Nothing interesting happens.");
	    }
	}));
	if (Settings.DEBUG)
	    System.out.println("cliked 4 at npc id : " + npc.getId() + ", " + npc.getX() + ", " + npc.getY() + ", " + npc.getPlane());

    }

    public static void handleItemOnNPC(final Player player, final NPC npc, final Item item) {
	if (item == null)
	    return;
	player.setRouteEvent(new RouteEvent(npc, new Runnable() {
	    @Override
	    public void run() {
		if (!player.getInventory().containsItem(item.getId(), item.getAmount())) {
		    return;
		}
		if (npc instanceof Familiar) {
		    Familiar familiar = (Familiar) npc;
		    if (npc.getId() == 7378 || npc.getId() == 7377)
			if (Pyrelord.lightLog(familiar, item))
			    return;
		    if (npc.getId() == 7339 || npc.getId() == 7339) {
			if ((item.getId() >= 1704 && item.getId() <= 1710 && item.getId() % 2 == 0) || (item.getId() >= 10356 && item.getId() <= 10366 && item.getId() % 2 == 0) || (item.getId() == 2572 || (item.getId() >= 20653 && item.getId() <= 20657 && item.getId() % 2 != 0))) {
			    for (Item item : player.getInventory().getItems().getItems()) {
				if (item == null)
				    continue;
				if (item.getId() >= 1704 && item.getId() <= 1710 && item.getId() % 2 == 0)
				    item.setId(1712);
				else if (item.getId() >= 10356 && item.getId() <= 10366 && item.getId() % 2 == 0)
				    item.setId(10354);
				else if (item.getId() == 2572 || (item.getId() >= 20653 && item.getId() <= 20657 && item.getId() % 2 != 0))
				    item.setId(20659);
			    }
			    player.getInventory().refresh();
			    player.getDialogueManager().startDialogue("ItemMessage", "Your ring of wealth and amulet of glory have all been recharged.", 1712);
			}
		    }
		}
		if (npc instanceof Pet) {
		    player.faceEntity(npc);
		    player.getPetManager().eat(item.getId(), (Pet) npc);
		    return;
		} else if (npc instanceof ConditionalDeath)
		    ((ConditionalDeath) npc).useHammer(player);
		else if (item.getId() == 22444)
		    PolyporeCreature.sprinkleOil(player, npc);
		else if (item.getId() == SpiritshieldCreating.SPIRIT_SHIELD || item.getId() == SpiritshieldCreating.HOLY_ELIXIR && npc.getId() == 802) {
		    SpiritshieldCreating.blessShield(player, false);
		} else if (npc.getId() == 7729 && SpiritshieldCreating.isSigil(item.getId()))
		    SpiritshieldCreating.attachShield(player, item, false);
		else if ((npc.getId() == 519 || npc.getId() == 3797) && ItemConstants.repairItem(player, player.getInventory().getItems().getThisItemSlot(item)))
		    return;
		else
		    player.getPackets().sendGameMessage("Nothing interesting happens.");
	    }
	}));
    }
}
