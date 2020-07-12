package com.rs.game.minigames.duel;

import java.util.Arrays;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.ForceTalk;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.actions.PlayerCombat;
import com.rs.game.player.content.Foods.Food;
import com.rs.game.player.content.ItemConstants;
import com.rs.game.player.content.Pots.Pot;
import com.rs.game.player.controllers.Controller;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.net.decoders.WorldPacketsDecoder;
import com.rs.net.decoders.handlers.ButtonHandler;
import com.rs.utils.Logger;
import com.rs.utils.Utils;

public class DuelArena extends Controller {

    private static final int LOGOUT = 0, TELEPORT = 1, DUEL_END_LOSE = 2,
	    DUEL_END_WIN = 3;
    private Player target;
    private volatile boolean ifFriendly, isDueling;

    private final Item[] FUN_WEAPONS = { new Item(4566) };
    private final WorldTile[] LOBBY_TELEPORTS = { new WorldTile(3367, 3275, 0), new WorldTile(3360, 3275, 0), new WorldTile(3358, 3270, 0), new WorldTile(3363, 3268, 0), new WorldTile(3370, 3268, 0), new WorldTile(3367, 3267, 0), new WorldTile(3376, 3275, 0), new WorldTile(3377, 3271, 0), new WorldTile(3375, 3269, 0), new WorldTile(3381, 3277, 0) };

    @Override
    public void start() {
	this.target = (Player) getArguments()[0];
	ifFriendly = (boolean) getArguments()[1];
	setArguments(null);
	openDuelScreen(target, ifFriendly);
    }

    private void openDuelScreen(Player target, boolean ifFriendly) {
	synchronized (this) {
	    if (!ifFriendly) {
		sendOptions(player);
		player.getLastDuelRules().getStake().clear();
	    }
	    player.getTemporaryAttributtes().put("acceptedDuel", false);
	    player.getPackets().sendItems(134, false, player.getLastDuelRules().getStake());
	    player.getPackets().sendItems(134, true, player.getLastDuelRules().getStake());
	    player.getPackets().sendIComponentText(ifFriendly ? 637 : 631, ifFriendly ? 16 : 38, " " + Utils.formatPlayerNameForDisplay(target.getUsername()));
	    player.getPackets().sendIComponentText(ifFriendly ? 637 : 631, ifFriendly ? 18 : 40, "" + (target.getSkills().getCombatLevel()));
	    player.getVarsManager().sendVar(286, 0);
	    player.getTemporaryAttributtes().put("firstScreen", true);
	    player.getInterfaceManager().sendInterface(ifFriendly ? 637 : 631);
	    refreshScreenMessage(true, ifFriendly);
	    player.setCloseInterfacesEvent(new Runnable() {
		@Override
		public void run() {
		    closeDuelInteraction(DuelStage.DECLINED);
		}
	    });
	}
    }

    public void accept(boolean firstStage) {
	synchronized (this) {
	    if (!hasTarget())
		return;
	    boolean targetAccepted = (Boolean) target.getTemporaryAttributtes().get("acceptedDuel");
	    DuelRules rules = player.getLastDuelRules();
	    if (!rules.canAccept(player.getLastDuelRules().getStake()))
		return;
	    synchronized (target.getControlerManager().getControler()) {
		if (targetAccepted) {
		    if (firstStage) {
			if (nextStage())
			    ((DuelArena) target.getControlerManager().getControler()).nextStage();
		    } else {
			player.setCloseInterfacesEvent(null);
			player.closeInterfaces();
			closeDuelInteraction(DuelStage.DONE);
		    }
		    return;
		}
		player.getTemporaryAttributtes().put("acceptedDuel", true);
		refreshScreenMessages(firstStage, ifFriendly);
	    }
	}
    }

    public void closeDuelInteraction(DuelStage stage) {
	synchronized (this) {
	    final Player oldTarget = target;
	    Controller controler = oldTarget == null ? null : oldTarget.getControlerManager().getControler();
	    if (controler == null || !(controler instanceof DuelArena))
		return;
	    DuelArena targetConfiguration = (DuelArena) controler;
	    synchronized (controler) {
		if (hasTarget() && targetConfiguration.hasTarget()) {
		    if (controler instanceof DuelArena) {
			player.setCloseInterfacesEvent(null);
			player.closeInterfaces();
			oldTarget.setCloseInterfacesEvent(null);
			oldTarget.closeInterfaces();
			if (stage != DuelStage.DONE) {
			    reset();
			    targetConfiguration.reset();
			    player.getInventory().getItems().addAll(player.getLastDuelRules().getStake());
			    oldTarget.getInventory().getItems().addAll(oldTarget.getLastDuelRules().getStake());
			    oldTarget.getLastDuelRules().getStake().clear();
			    player.getLastDuelRules().getStake().clear();
			    player.getInventory().init();
			    oldTarget.getInventory().init();
			    WorldTasksManager.schedule(new WorldTask() {

				@Override
				public void run() {
				    player.getControlerManager().startControler("DuelControler");
				    oldTarget.getControlerManager().startControler("DuelControler");
				}
			    }, 1);
			} else {
			    removeEquipment();
			    targetConfiguration.removeEquipment();
			    beginBattle(true);
			    targetConfiguration.beginBattle(false);
			}
			if (stage == DuelStage.DONE)
			    player.getPackets().sendGameMessage("Your battle will begin shortly.");
			else if (stage == DuelStage.SECOND)
			    player.getPackets().sendGameMessage("<col=ff0000>Please check if these settings are correct.");
			else if (stage == DuelStage.DECLINED)
			    oldTarget.getPackets().sendGameMessage("<col=ff0000>Other player declined the duel!");
			else if (stage == DuelStage.DECLINED) {
			    oldTarget.getPackets().sendGameMessage("You do not have enough space to continue!");
			    oldTarget.getPackets().sendGameMessage("Other player does not have enough space to continue!");
			}
		    }
		}
	    }
	}
    }

    private void reset() {
	target = null;
	player.getTemporaryAttributtes().put("acceptedDuel", false);
    }

    public void addItem(int slot, int amount) {
	synchronized (this) {
	    if (!hasTarget())
		return;
	    Controller controler = target.getControlerManager().getControler();
	    if (controler == null || !(controler instanceof DuelArena))
		return;
	    synchronized (target.getControlerManager().getControler()) {
		Item item = player.getInventory().getItem(slot);
		if (item == null)
		    return;
		if (!ItemConstants.isTradeable(item)) {
		    player.getPackets().sendGameMessage("That item cannot be staked!");
		    return;
		}
		Item[] itemsBefore = player.getLastDuelRules().getStake().getItemsCopy();
		int maxAmount = player.getInventory().getItems().getNumberOf(item);
		item = new Item(item.getId(), amount < maxAmount ? amount : maxAmount);
		player.getLastDuelRules().getStake().add(item);
		player.getInventory().deleteItem(slot, item);
		refreshItems(itemsBefore);
		cancelAccepted();
	    }
	}
    }

    public void removeItem(final int slot, int amount) {
	synchronized (this) {
	    if (!hasTarget())
		return;
	    Controller controler = target.getControlerManager().getControler();
	    if (controler == null || !(controler instanceof DuelArena))
		return;
	    synchronized (target.getControlerManager().getControler()) {
		Item item = player.getLastDuelRules().getStake().get(slot);
		if (item == null)
		    return;
		Item[] itemsBefore = player.getLastDuelRules().getStake().getItemsCopy();
		int maxAmount = player.getLastDuelRules().getStake().getNumberOf(item);
		item = new Item(item.getId(), amount < maxAmount ? amount : maxAmount);
		player.getLastDuelRules().getStake().remove(slot, item);
		player.getInventory().addItem(item);
		refreshItems(itemsBefore);
		cancelAccepted();
	    }
	}
    }

    private void refreshItems(Item[] itemsBefore) {
	int[] changedSlots = new int[itemsBefore.length];
	int count = 0;
	for (int index = 0; index < itemsBefore.length; index++) {
	    Item item = player.getLastDuelRules().getStake().getItems()[index];
	    if (itemsBefore[index] != item) {
		if (itemsBefore[index] != null && (item == null || item.getId() != itemsBefore[index].getId() || item.getAmount() < itemsBefore[index].getAmount()))
		    sendFlash(index);
		changedSlots[count++] = index;
	    }
	}
	int[] finalChangedSlots = new int[count];
	System.arraycopy(changedSlots, 0, finalChangedSlots, 0, count);
	refresh(finalChangedSlots);
    }

    private void sendFlash(int slot) {
	player.getPackets().sendInterFlashScript(631, 47, 4, 7, slot);
	target.getPackets().sendInterFlashScript(631, 50, 4, 7, slot);
    }

    private void sendRuleFlash(int componentId, int slot) {
	//player.getPackets().sendInterFlashScript(ifFriendly ? 637 : 631, componentId, 11, 2, slot);
	//target.getPackets().sendInterFlashScript(ifFriendly ? 637 : 631, componentId, 11, 2, slot);
    }

    private void refresh(int... slots) {
	player.getPackets().sendUpdateItems(134, player.getLastDuelRules().getStake(), slots);
	target.getPackets().sendUpdateItems(134, true, player.getLastDuelRules().getStake().getItems(), slots);
    }

    public void cancelAccepted() {
	boolean canceled = false;
	if ((Boolean) player.getTemporaryAttributtes().get("acceptedDuel")) {
	    player.getTemporaryAttributtes().put("acceptedDuel", false);
	    canceled = true;
	}
	if ((Boolean) target.getTemporaryAttributtes().get("acceptedDuel")) {
	    target.getTemporaryAttributtes().put("acceptedDuel", false);
	    canceled = true;
	}
	if (canceled)
	    refreshScreenMessages(canceled, ifFriendly);
    }

    private void openConfirmationScreen(boolean ifFriendly) {
	player.getInterfaceManager().sendInterface(ifFriendly ? 639 : 626);
	refreshScreenMessage(false, ifFriendly);
    }

    private void refreshScreenMessages(boolean firstStage, boolean ifFriendly) {
	refreshScreenMessage(firstStage, ifFriendly);
	((DuelArena) target.getControlerManager().getControler()).refreshScreenMessage(firstStage, ifFriendly);
    }

    private void refreshScreenMessage(boolean firstStage, boolean ifFriendly) {
	player.getPackets().sendIComponentText(firstStage ? (ifFriendly ? 637 : 631) : (ifFriendly ? 639 : 626), firstStage ? (ifFriendly ? 20 : 41) : (ifFriendly ? 23 : 35), "<col=ff0000>" + getAcceptMessage(firstStage));
    }

    private String getAcceptMessage(boolean firstStage) {
	if (target.getTemporaryAttributtes().get("acceptedDuel") == Boolean.TRUE)
	    return "Other player has accepted.";
	else if (player.getTemporaryAttributtes().get("acceptedDuel") == Boolean.TRUE)
	    return "Waiting for other player...";
	return firstStage ? "" : "Please look over the agreements to the duel.";
    }

    public boolean nextStage() {
	if (!hasTarget())
	    return false;
	if (player.getInventory().getItems().getUsedSlots() + target.getLastDuelRules().getStake().getUsedSlots() > 28) {
	    player.setCloseInterfacesEvent(null);
	    player.closeInterfaces();
	    closeDuelInteraction(DuelStage.NO_SPACE);
	    return false;
	}
	player.getTemporaryAttributtes().put("acceptedDuel", false);
	openConfirmationScreen(false);
	player.getInterfaceManager().removeInventoryInterface();
	return true;
    }

    private void sendOptions(Player player) {
	player.getInterfaceManager().sendInventoryInterface(628);
	player.getPackets().sendUnlockIComponentOptionSlots(628, 0, 0, 27, 0, 1, 2, 3, 4, 5);
	player.getPackets().sendInterSetItemsOptionsScript(628, 0, 93, 4, 7, "Stake 1", "Stake 5", "Stake 10", "Stake All", "Examine");
	player.getPackets().sendUnlockIComponentOptionSlots(631, 47, 0, 27, 0, 1, 2, 3, 4, 5);
	player.getPackets().sendInterSetItemsOptionsScript(631, 0, 120, 4, 7, "Remove 1", "Remove 5", "Remove 10", "Remove All", "Examine");
    }

    public void endDuel(final Player victor, final Player loser, boolean isDraw) {
	startEndingTeleport(victor, false);
	startEndingTeleport(loser, false);
	if (!isDueling)
	    return;
	Controller controler = target == null ? null : target.getControlerManager().getControler();
	if (controler == null || !(controler instanceof DuelArena))
	    return;
	DuelArena targetConfiguration = (DuelArena) controler;
	targetConfiguration.isDueling = false;
	isDueling = false;
	DuelRules rules = victor == null ? loser.getLastDuelRules() : victor.getLastDuelRules();
	if (rules != null && !rules.hasRewardGiven()) {
	    DuelRules.sendRewardGivenUpdate(victor, loser, true);
	    for (Item item : victor.getLastDuelRules().getStake().getItems()) {
		if (item == null)
		    continue;
		victor.getInventory().addItemDrop(item.getId(), item.getAmount());
	    }
	    for (Item item : loser.getLastDuelRules().getStake().getItems()) {
		if (item == null)
		    continue;
		if (isDraw)
		    loser.getInventory().addItemDrop(item.getId(), item.getAmount());
		else
		    victor.getInventory().addItemDrop(item.getId(), item.getAmount());
	    }
	    Logger.globalLog(victor.getUsername(), victor.getSession().getIP(), new String(" completed the duel with " + loser.getUsername() + " previous items are: " + Arrays.toString(victor.getLastDuelRules().getStake().getShiftedItem()) + " new items are " + Arrays.toString(loser.getLastDuelRules().getStake().getShiftedItem())));
	    victor.getLastDuelRules().getStake().clear();
	    loser.getLastDuelRules().getStake().clear();
	}
	loser.getPackets().sendGameMessage(isDraw ? "The battle has ended in a draw." : "Oh dear, it seems you have lost to " + victor.getDisplayName() + ".");
	victor.getPackets().sendGameMessage(isDraw ? "The battle has ended in a draw." : "Congradulations! You easily defeated " + loser.getDisplayName() + ".");
	loser.setCanPvp(false);
	loser.getHintIconsManager().removeUnsavedHintIcon();
	loser.reset();
	loser.closeInterfaces();
	loser.getControlerManager().removeControlerWithoutCheck();
	victor.setCanPvp(false);
	victor.getHintIconsManager().removeUnsavedHintIcon();
	victor.reset();
	victor.closeInterfaces();
	victor.getControlerManager().removeControlerWithoutCheck();
	WorldTasksManager.schedule(new WorldTask() {
	    @Override
	    public void run() {
		loser.getControlerManager().startControler("DuelControler");
		victor.getControlerManager().startControler("DuelControler");
	    }
	});
    }

    private void startEndingTeleport(Player player, boolean loggedOut) {
	WorldTile tile = LOBBY_TELEPORTS[Utils.random(LOBBY_TELEPORTS.length)];
	WorldTile teleTile = tile;
	for (int trycount = 0; trycount < 10; trycount++) {
	    teleTile = new WorldTile(tile, 2);
	    if (World.isTileFree(tile.getPlane(), teleTile.getX(), teleTile.getY(), player.getSize()))
		break;
	    teleTile = tile;
	}
	if (loggedOut) {
	    player.setLocation(teleTile);
	    return;
	}
	player.setNextWorldTile(teleTile);
    }

    private void removeEquipment() {
	int slot = 0;
	for (int i = 10; i < 23; i++) {
	    if (i == 14) {
		if (player.getEquipment().hasTwoHandedWeapon())
		    ButtonHandler.sendRemove(target, 3);
	    }
	    if (player.getLastDuelRules().getRule(i)) {
		slot = i - 10;
		ButtonHandler.sendRemove(player, slot);
	    }
	}
    }

    private void beginBattle(boolean started) {
	isDueling = true;
	if (started)
	    battleTeleport(player, target);
	player.stopAll();
	player.lock(2); // fixes mass click steps
	player.setLastBonfire(0);
	player.reset();
	player.getTemporaryAttributtes().put("startedDuel", true);
	player.getTemporaryAttributtes().put("canFight", false);
	player.setCanPvp(true);
	player.getHintIconsManager().addHintIcon(target, 1, -1, false);
	WorldTasksManager.schedule(new WorldTask() {
	    int count = 3;

	    @Override
	    public void run() {
		if (count > 0)
		    player.setNextForceTalk(new ForceTalk("" + count));
		if (count == 0) {
		    player.getTemporaryAttributtes().put("canFight", true);
		    player.setNextForceTalk(new ForceTalk("FIGHT!"));
		    this.stop();
		    return;
		}
		count--;
	    }
	}, 0, 2);
    }

    @Override
    public boolean canEat(Food food) {
	if (player.getLastDuelRules().getRule(4) && isDueling) {
	    player.getPackets().sendGameMessage("You cannot eat during this duel.", true);
	    return false;
	}
	return true;
    }

    @Override
    public boolean canPot(Pot pot) {
	if (player.getLastDuelRules().getRule(3) && isDueling) {
	    player.getPackets().sendGameMessage("You cannot drink during this duel.");
	    return false;
	}
	return true;
    }

    @Override
    public boolean canMove(int dir) {
	if (isDueling && player.getLastDuelRules().getRule(25)) {
	    player.getPackets().sendGameMessage("You cannot move during this duel!");
	    return false;
	}
	return true;
    }

    @Override
    public boolean canSummonFamiliar() {
	if (player.getLastDuelRules().getRule(24) && isDueling)
	    return true;
	player.getPackets().sendGameMessage("Summoning has been disabled during this duel!");
	return false;
    }

    @Override
    public void process() {
	if (!hasTarget() || target.getControlerManager().getControler() != null && !(target.getControlerManager().getControler() instanceof DuelArena)) {
	    end(DUEL_END_LOSE);
	    return;
	}
    }

    @Override
    public boolean processMagicTeleport(WorldTile toTile) {
	player.getDialogueManager().startDialogue("SimpleMessage", "A magical force prevents you from teleporting from the arena.");
	return false;
    }

    @Override
    public boolean processItemTeleport(WorldTile toTile) {
	player.getDialogueManager().startDialogue("SimpleMessage", "A magical force prevents you from teleporting from the arena.");
	return false;
    }

    @Override
    public void magicTeleported(int type) {
	end(TELEPORT);
    }

    @Override
    public boolean processObjectClick1(WorldObject object) {
	player.getDialogueManager().startDialogue("ForfeitDialouge");
	return true;
    }

    @Override
    public boolean sendDeath() {
	player.lock(7);
	player.stopAll();
	WorldTasksManager.schedule(new WorldTask() {
	    int loop;

	    @Override
	    public void run() {
		player.stopAll();
		if (loop == 0) {
		    player.setNextAnimation(new Animation(836));
		} else if (loop == 1) {
		    player.getPackets().sendGameMessage("Oh dear, you have died.");
		} else if (loop == 3) {
		    player.setNextAnimation(new Animation(-1));
		    end(DUEL_END_LOSE);
		    this.stop();
		}
		loop++;
	    }
	}, 0, 1);
	return false;
    }

    @Override
    public boolean login() {
	return true;
    }

    @Override
    public boolean logout() {
	end(LOGOUT);
	startEndingTeleport(player, true);
	return false;
    }

    @Override
    public void forceClose() {
	end(DUEL_END_LOSE);
    }

    @Override
    public boolean keepCombating(Entity victim) {
	DuelRules rules = player.getLastDuelRules();
	boolean isRanging = PlayerCombat.isRanging(player) != 0;
	if (player.getTemporaryAttributtes().get("canFight") == Boolean.FALSE) {
	    player.getPackets().sendGameMessage("The duel hasn't started yet.");
	    return false;
	}
	if (target != victim) {
	    player.getPackets().sendGameMessage("You may only attack your target, you can find your target by following the hint icon on your map.");
	    return false;
	}
	if ((player.getEquipment().getWeaponId() == 22496 || player.getCombatDefinitions().getSpellId() > 0) && rules.getRule(2) && isDueling) {
	    player.getPackets().sendGameMessage("You cannot use Magic in this duel!");
	    return false;
	} else if (isRanging && rules.getRule(0) && isDueling) {
	    player.getPackets().sendGameMessage("You cannot use Range in this duel!");
	    return false;
	} else if (!isRanging && rules.getRule(1) && player.getCombatDefinitions().getSpellId() <= 0 && isDueling) {
	    player.getPackets().sendGameMessage("You cannot use Melee in this duel!");
	    return false;
	} else {
	    for (Item item : FUN_WEAPONS) {
		if (rules.getRule(8) && !player.getInventory().containsItem(item.getId(), item.getAmount())) {
		    player.getPackets().sendGameMessage("You can only use fun weapons in this duel!");
		    return false;
		}
	    }
	}
	return true;
    }

    @Override
    public boolean canEquip(int slotId, int itemId) {
	DuelRules rules = player.getLastDuelRules();
	if (isDueling) {
	    if (rules.getRule(10 + slotId)) {
		player.getPackets().sendGameMessage("You can't equip " + ItemDefinitions.getItemDefinitions(itemId).getName().toLowerCase() + " during this duel.");
		return false;
	    }
	    if (slotId == 3 && player.getEquipment().hasTwoHandedWeapon() && rules.getRule(15)) {
		player.getPackets().sendGameMessage("You can't equip " + ItemDefinitions.getItemDefinitions(itemId).getName().toLowerCase() + " during this duel.");
		return false;
	    }
	}
	return true;
    }

    // Regular, Summoning, Obsticals
    private static final WorldTile[][] POSSIBLE_TILE_CENTRE = { { new WorldTile(3346, 3251, 0), new WorldTile(3376, 3232, 0) }, { new WorldTile(3346, 3214, 0) }, { new WorldTile(3345, 3231, 0), new WorldTile(3376, 3213, 0) } };

    private static void battleTeleport(Player player, Player target) {
	DuelRules rules = player.getLastDuelRules();
	boolean noMovement = rules.getRule(25);
	WorldTile tile = rules.getRule(24) ? POSSIBLE_TILE_CENTRE[1][0] : rules.getRule(6) ? POSSIBLE_TILE_CENTRE[2][Utils.random(POSSIBLE_TILE_CENTRE[2].length)] : POSSIBLE_TILE_CENTRE[0][Utils.random(POSSIBLE_TILE_CENTRE[0].length)], teleTile = tile;
	for (int trycount = 0; trycount < 10; trycount++) {
	    teleTile = new WorldTile(tile, 7);
	    if (World.isTileFree(teleTile.getPlane(), teleTile.getX(), teleTile.getY(), player.getSize()))
		break;
	    teleTile = tile;
	}
	player.setNextWorldTile(teleTile);
	final WorldTile location = teleTile;
	for (int trycount = 0; trycount < 10; trycount++) {
	    teleTile = new WorldTile(noMovement ? location : tile, noMovement ? 1 : 7);
	    if (World.isTileFree(teleTile.getPlane(), teleTile.getX(), teleTile.getY(), player.getSize()) && !teleTile.withinDistance(location, 0))
		break;
	    teleTile = tile;
	}
	target.setNextWorldTile(teleTile);
    }

    private void setRules(DuelRules rules, int componentId, int slotId) {
	sendRuleFlash(slotId, componentId);
	rules.setRules(slotId);
    }

    private void end(int type) {
	if (isDueling) {
	    if (type == LOGOUT || type == DUEL_END_LOSE || type == TELEPORT)
		endDuel(target, player, World.exiting_start != 0);
	    else if (type == DUEL_END_WIN)
		endDuel(player, target, false);
	} else
	    closeDuelInteraction(DuelStage.DECLINED);
    }

    @Override
    public boolean processButtonClick(int interfaceId, int componentId, int slotId, int slotId2, int packetId) {
	synchronized (this) {
	    if (target == null || target.getControlerManager().getControler() == null || !(target.getControlerManager().getControler() instanceof DuelArena) || player.getControlerManager().getControler() == null || !(player.getControlerManager().getControler() instanceof DuelArena))
		return false;
	    synchronized (target.getControlerManager().getControler()) {
		DuelRules rules = player.getLastDuelRules();
		switch (interfaceId) {
		    case 271:
		    case 749:
			if (rules.getRule(5)) {
			    if (interfaceId == 749 && componentId != 4)
				return true;
			    player.getPackets().sendGameMessage("You can't use prayers in this duel.");
			    return false;
			}
			return true;
		    case 193:
		    case 430:
		    case 192:
			if (rules.getRule(2) && isDueling)
			    return false;
			return true;
		    case 884:
			if (componentId == 4) {
			    if (rules.getRule(9)) {
				player.getPackets().sendGameMessage("You can't use special attacks in this duel.");
				return false;
			    }
			}
			return true;
		    case 631:
			switch (componentId) {
			    case 56: // no range
				setRules(rules, componentId, 0);
				return false;
			    case 57: // no melee
				setRules(rules, componentId, 1);
				return false;
			    case 58: // no magic
				setRules(rules, componentId, 2);
				return false;
			    case 59: // fun wep
				setRules(rules, componentId, 8);
				return false;
			    case 60: // no forfiet
				setRules(rules, componentId, 7);
				return false;
			    case 61: // no drinks
				setRules(rules, componentId, 3);
				return false;
			    case 62: // no food
				setRules(rules, componentId, 4);
				return false;
			    case 63: // no prayer
				setRules(rules, componentId, 5);
				return false;
			    case 64: // no movement
				setRules(rules, componentId, 25);
				if (rules.getRule(6)) {
				    rules.setRule(6, false);
				    player.getPackets().sendGameMessage("You can't have movement without obstacles.");
				}
				return false;
			    case 65: // obstacles
				setRules(rules, componentId, 6);
				if (rules.getRule(25)) {
				    rules.setRule(25, false);
				    player.getPackets().sendGameMessage("You can't have obstacles without movement.");
				}
				return false;
			    case 66: // enable summoning
				setRules(rules, componentId, 24);
				return false;
			    case 67:// no spec
				setRules(rules, componentId, 9);
				return false;
			    case 21:// no helm
				setRules(rules, componentId, 10);
				return false;
			    case 22:// no cape
				setRules(rules, componentId, 11);
				return false;
			    case 23:// no ammy
				setRules(rules, componentId, 12);
				return false;
			    case 31:// arrows
				setRules(rules, componentId, 23);
				return false;
			    case 24:// weapon
				setRules(rules, componentId, 13);
				return false;
			    case 25:// body
				setRules(rules, componentId, 14);
				return false;
			    case 26:// shield
				setRules(rules, componentId, 15);
				return false;
			    case 27:// legs
				setRules(rules, componentId, 17);
				return false;
			    case 28:// ring
				setRules(rules, componentId, 19);
				return false;
			    case 29: // bots
				setRules(rules, componentId, 20);
				return false;
			    case 30: // gloves
				setRules(rules, componentId, 22);
				return false;
			    case 107:
				closeDuelInteraction(DuelStage.DECLINED);
				return false;
			    case 46:
				accept(true);
				return false;
			    case 47:
				switch (packetId) {
				    case WorldPacketsDecoder.ACTION_BUTTON1_PACKET:
					removeItem(slotId, 1);
					return false;
				    case WorldPacketsDecoder.ACTION_BUTTON2_PACKET:
					removeItem(slotId, 5);
					return false;
				    case WorldPacketsDecoder.ACTION_BUTTON3_PACKET:
					removeItem(slotId, 10);
					return false;
				    case WorldPacketsDecoder.ACTION_BUTTON4_PACKET:
					Item item = player.getInventory().getItems().get(slotId);
					if (item == null)
					    return false;
					removeItem(slotId, player.getInventory().getItems().getNumberOf(item));
					return false;
				    case WorldPacketsDecoder.ACTION_BUTTON5_PACKET:
					player.getInventory().sendExamine(slotId);
					return false;
				}
				return false;
			}
		    case 628:
			switch (packetId) {
			    case WorldPacketsDecoder.ACTION_BUTTON1_PACKET:
				addItem(slotId, 1);
				return false;
			    case WorldPacketsDecoder.ACTION_BUTTON2_PACKET:
				addItem(slotId, 5);
				return false;
			    case WorldPacketsDecoder.ACTION_BUTTON3_PACKET:
				addItem(slotId, 10);
				return false;
			    case WorldPacketsDecoder.ACTION_BUTTON4_PACKET:
				Item item = player.getInventory().getItems().get(slotId);
				if (item == null)
				    return false;
				addItem(slotId, player.getInventory().getItems().getNumberOf(item));
				return false;
			    case WorldPacketsDecoder.ACTION_BUTTON5_PACKET:
				player.getInventory().sendExamine(slotId);
				return false;
			}
		    case 626:
			switch (componentId) {
			    case 43:
				accept(false);
				return false;
			}
		    case 637: // friendly
			switch (componentId) {
			    case 25: // no range
				setRules(rules, componentId, 0);
				return false;
			    case 26: // no melee
				setRules(rules, componentId, 1);
				return false;
			    case 27: // no magic
				setRules(rules, componentId, 2);
				return false;
			    case 28: // fun wep
				setRules(rules, componentId, 8);
				return false;
			    case 29: // no forfiet
				setRules(rules, componentId, 7);
				return false;
			    case 30: // no drinks
				setRules(rules, componentId, 3);
				return false;
			    case 31: // no food
				setRules(rules, componentId, 4);
				return false;
			    case 32: // no prayer
				setRules(rules, componentId, 5);
				return false;
			    case 33: // no movement
				setRules(rules, componentId, 25);
				if (rules.getRule(6)) {
				    rules.setRule(6, false);
				    player.getPackets().sendGameMessage("You can't have movement without obstacles.");
				}
				return false;
			    case 34: // obstacles
				setRules(rules, componentId, 6);
				if (rules.getRule(25)) {
				    rules.setRule(25, false);
				    player.getPackets().sendGameMessage("You can't have obstacles without movement.");
				}
				return false;
			    case 35: // enable summoning
				setRules(rules, componentId, 24);
				return false;
			    case 36:// no spec
				setRules(rules, componentId, 9);
				return false;
			    case 43:// no helm
				setRules(rules, componentId, 10);
				return false;
			    case 44:// no cape
				setRules(rules, componentId, 11);
				return false;
			    case 45:// no ammy
				setRules(rules, componentId, 12);
				return false;
			    case 53:// arrows
				setRules(rules, componentId, 23);
				return false;
			    case 46:// weapon
				setRules(rules, componentId, 13);
				return false;
			    case 47:// body
				setRules(rules, componentId, 14);
				return false;
			    case 48:// shield
				setRules(rules, componentId, 15);
				return false;
			    case 49:// legs
				setRules(rules, componentId, 17);
				return false;
			    case 50:// ring
				setRules(rules, componentId, 19);
				return false;
			    case 51: // bots
				setRules(rules, componentId, 20);
				return false;
			    case 52: // gloves
				setRules(rules, componentId, 22);
				return false;
			    case 86:
				closeDuelInteraction(DuelStage.DECLINED);
				return false;
			    case 21:
				accept(true);
				return false;
			}
		    case 639:
			switch (componentId) {
			    case 25:
				accept(false);
				return false;
			}
		}
	    }
	}
	return true;
    }

    public boolean isDueling() {
	return isDueling;
    }

    public boolean hasTarget() {
	return target != null;
    }

    public boolean isConfiguring() {
	return !isDueling;
    }

    public Entity getTarget() {
	if (hasTarget())
	    return target;
	return null;
    }

    enum DuelStage {
	DECLINED, NO_SPACE, SECOND, DONE
    }
}
