package com.rs.game.player;

import java.io.Serializable;
import java.util.HashMap;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.item.Item;
import com.rs.game.player.content.ItemConstants;
import com.rs.game.player.content.Shop;
import com.rs.game.player.content.grandExchange.GrandExchange;
import com.rs.game.player.content.grandExchange.Offer;
import com.rs.game.player.content.grandExchange.OfferHistory;
import com.rs.net.decoders.WorldPacketsDecoder;
import com.rs.utils.ItemExamines;
import com.rs.utils.Utils;

public class GrandExchangeManager implements Serializable {

    private static final long serialVersionUID = -866326987352331696L;

    private transient Player player;

    private long[] offerUIds;
    private OfferHistory[] history;

    public GrandExchangeManager() {
	offerUIds = new long[6];
	history = new OfferHistory[5];
    }

    public void setPlayer(Player player) {
	this.player = player;
    }

    public void init() {
	GrandExchange.linkOffers(player);
    }

    public void stop() {
	GrandExchange.unlinkOffers(player);
    }

    public long[] getOfferUIds() {
	return offerUIds;
    }

    public boolean isSlotFree(int slot) {
	return offerUIds[slot] == 0;
    }

    public void addOfferHistory(OfferHistory o) {
	OfferHistory[] dest = new OfferHistory[history.length];
	dest[0] = o;
	System.arraycopy(history, 0, dest, 1, history.length - 1);
	history = dest;
    }

    public void openHistory() {
	player.getInterfaceManager().sendInterface(643);
	for (int i = 0; i < history.length; i++) {
	    OfferHistory o = history[i];
	    player.getPackets().sendIComponentText(643, 25 + i, o == null ? "" : o.isBought() ? "You bought" : "You sold");
	    player.getPackets().sendIComponentText(643, 35 + i, o == null ? "" : ItemDefinitions.getItemDefinitions(o.getId()).getName());
	    player.getPackets().sendIComponentText(643, 30 + i, o == null ? "" : Utils.getFormattedNumber(o.getQuantity()));
	    player.getPackets().sendIComponentText(643, 40 + i, o == null ? "" : Utils.getFormattedNumber(o.getPrice()));
	}
    }

    public void openGrandExchange() {
	player.getInterfaceManager().sendInterface(105);
	player.getPackets().sendUnlockIComponentOptionSlots(105, 206, -1, 0, 0, 1);
	player.getPackets().sendUnlockIComponentOptionSlots(105, 208, -1, 0, 0, 1);
	cancelOffer();
	player.setCloseInterfacesEvent(new Runnable() {
	    @Override
	    public void run() {
		if (getType() == 0)
		    player.getPackets().sendRunScript(571);
		player.getInterfaceManager().removeInterfaceByParent(752, 7);
	    }
	});
    }

    public void openCollectionBox() {
	player.getInterfaceManager().sendInterface(109);
	player.getPackets().sendUnlockIComponentOptionSlots(109, 19, 0, 2, 0, 1);
	player.getPackets().sendUnlockIComponentOptionSlots(109, 23, 0, 2, 0, 1);
	player.getPackets().sendUnlockIComponentOptionSlots(109, 27, 0, 2, 0, 1);
	player.getPackets().sendUnlockIComponentOptionSlots(109, 32, 0, 2, 0, 1);
	player.getPackets().sendUnlockIComponentOptionSlots(109, 37, 0, 2, 0, 1);
	player.getPackets().sendUnlockIComponentOptionSlots(109, 42, 0, 2, 0, 1);
    }

    public void setSlot(int slot) {
	player.getVarsManager().sendVar(1112, slot);
    }

    public void setMarketPrice(int price) {
	player.getVarsManager().sendVar(1114, price);
    }

    public void setPricePerItem(int price) {
	player.getVarsManager().sendVar(1111, price);
    }

    public int getPricePerItem() {
	return player.getVarsManager().getValue(1111);
    }

    public int getCurrentSlot() {
	return player.getVarsManager().getValue(1112);
    }

    public void setItemId(int id) {
	player.getVarsManager().sendVar(1109, id);
    }

    public int getItemId() {
	return player.getVarsManager().getValue(1109);
    }

    public void setAmount(int amount) {
	player.getVarsManager().sendVar(1110, amount);
    }

    public int getAmount() {
	return player.getVarsManager().getValue(1110);
    }

    public void setType(int amount) {
	player.getVarsManager().sendVar(1113, amount);
    }

    public int getType() {
	return player.getVarsManager().getValue(1113);
    }

    public void handleButtons(int interfaceId, int componentId, int slotId, int packetId) {
	if (interfaceId == 105) {
	    switch (componentId) {
		case 19:
		    if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
			viewOffer(0);
		    else
			abortOffer(0);
		    break;
		case 35:
		    if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
			viewOffer(1);
		    else
			abortOffer(1);
		    break;
		case 51:
		    if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
			viewOffer(2);
		    else
			abortOffer(2);
		    break;
		case 70:
		    if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
			viewOffer(3);
		    else
			abortOffer(3);
		    break;
		case 89:
		    if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
			viewOffer(4);
		    else
			abortOffer(4);
		    break;
		case 108:
		    if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
			viewOffer(5);
		    else
			abortOffer(5);
		    break;
		case 200:
		    abortCurrentOffer();
		    break;
		case 31:
		    makeOffer(0, false);
		    break;
		case 32:
		    makeOffer(0, true);
		    break;
		case 47:
		    makeOffer(1, false);
		    break;
		case 48:
		    makeOffer(1, true);
		    break;
		case 63:
		    makeOffer(2, false);
		    break;
		case 64:
		    makeOffer(2, true);
		    break;
		case 82:
		    makeOffer(3, false);
		    break;
		case 83:
		    makeOffer(3, true);
		    break;
		case 101:
		    makeOffer(4, false);
		    break;
		case 102:
		    makeOffer(4, true);
		    break;
		case 120:
		    makeOffer(5, false);
		    break;
		case 121:
		    makeOffer(5, true);
		    break;
		case 128:
		    cancelOffer();
		    break;
		case 155:
		    modifyAmount(getAmount() - 1);
		    break;
		case 157:
		    modifyAmount(getAmount() + 1);
		    break;
		case 160:
		    modifyAmount(getAmount() + 1);
		    break;
		case 162:
		    modifyAmount(getAmount() + 10);
		    break;
		case 164:
		    modifyAmount(getAmount() + 100);
		    break;
		case 166:
		    modifyAmount(getType() == 0 ? getAmount() + 1000 : getItemAmount(new Item(getItemId())));
		    break;
		case 168:
		    editAmount();
		    break;
		case 169:
		    modifyPricePerItem(getPricePerItem() - 1);
		    break;
		case 171:
		    modifyPricePerItem(getPricePerItem() + 1);
		    break;
		case 175:
		    modifyPricePerItem(GrandExchange.getPrice(getItemId()));
		    break;
		case 177:
		    editPrice();
		    break;
		case 179:
		    modifyPricePerItem((int) (Math.ceil(getPricePerItem() * 1.05)));
		    break;
		case 181:
		    modifyPricePerItem((int) (getPricePerItem() * 0.95));
		    break;
		case 186:
		    confirmOffer();
		    break;
		case 190:
		    chooseItem();
		    break;
		case 206:
		    collectItems(getCurrentSlot(), 0, packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET ? 0 : 1);
		    break;
		case 208:
		    collectItems(getCurrentSlot(), 1, packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET ? 0 : 1);
		    break;
	    }
	} else if (interfaceId == 107 && componentId == 18)
	    offer(slotId);
	else if (interfaceId == 449 && componentId == 1)
	    player.getInterfaceManager().removeInventoryInterface();
	else if (interfaceId == 109) {
	    switch (componentId) {
		case 19:
		    collectItems(0, slotId == 0 ? 0 : 1, packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET ? 0 : 1);
		    break;
		case 23:
		    collectItems(1, slotId == 0 ? 0 : 1, packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET ? 0 : 1);
		    break;
		case 27:
		    collectItems(2, slotId == 0 ? 0 : 1, packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET ? 0 : 1);
		    break;
		case 32:
		    collectItems(3, slotId == 0 ? 0 : 1, packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET ? 0 : 1);
		    break;
		case 37:
		    collectItems(4, slotId == 0 ? 0 : 1, packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET ? 0 : 1);
		    break;
		case 42:
		    collectItems(5, slotId == 0 ? 0 : 1, packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET ? 0 : 1);
		    break;
	    }
	}
    }

    /*
     * public static final int ITEMID_CONFIG = 1109, AMOUNT_CONFIG = 1110,
     * PRICE_PER_CONFIG = 1111, SLOT_CONFIG = 1112, TYPE_CONFIG = 1113;
     */

    public void cancelOffer() {
	setItemId(-1);
	setAmount(0);
	setPricePerItem(1);
	setMarketPrice(0);
	setSlot(-1);
	if (getType() == 0)
	    player.getPackets().sendRunScript(571);
	player.getInterfaceManager().removeInventoryInterface();
	player.getInterfaceManager().removeInterfaceByParent(752, 7);
	setType(-1);
    }

    public void editAmount() {
	if (getType() == -1)
	    return;
	player.getTemporaryAttributtes().put("GEQUANTITYSET", Boolean.TRUE);
	player.getPackets().sendInputIntegerScript("Enter the quantity you wish to " + (getType() == 0 ? "purchase" : "sell") + ":");
    }

    public void editPrice() {
	if (getType() == -1)
	    return;
	if (getItemId() == -1) {
	    player.getPackets().sendGameMessage("You must choose an item first.");
	    return;
	}
	player.getTemporaryAttributtes().put("GEPRICESET", Boolean.TRUE);
	player.getPackets().sendInputIntegerScript("Enter the price you wish to to " + (getType() == 0 ? "buy" : "sell") + " for:");
    }

    public void modifyPricePerItem(int value) {
	if (getType() == -1)
	    return;
	if (getItemId() == -1) {
	    player.getPackets().sendGameMessage("You must choose an item first.");
	    return;
	}
	if (value < 1)
	    value = 1;
	setPricePerItem(value);
    }

    public void modifyAmount(int value) {
	if (getType() == -1)
	    return;
	if (value < 0)
	    value = 0;
	setAmount(value);
    }

    public void abortCurrentOffer() {
	int slot = getCurrentSlot();
	if (slot == -1)
	    return;
	abortOffer(slot);
    }

    public void abortOffer(int slot) {
	if (isSlotFree(slot))
	    return;
	GrandExchange.abortOffer(player, slot);
	player.getPackets().sendGameMessage("Abort request acknowledged. Please be aware that your offer may have already been completed.");
    }

    public void collectItems(int slot, int invSlot, int option) {
	if (slot == -1 || isSlotFree(slot))
	    return;
	GrandExchange.collectItems(player, slot, invSlot, option);
    }

    public void viewOffer(int slot) {
	if (isSlotFree(slot) || getCurrentSlot() != -1) {
	    return;
	}
	Offer offer = GrandExchange.getOffer(player, slot);
	if (offer == null)
	    return;
	setSlot(slot);
	setExtraDetails(offer.getId());
    }

    /*
     * includes noted
     */
    public int getItemAmount(Item item) {
	int notedId = item.getDefinitions().certId;
	return player.getInventory().getAmountOf(item.getId()) + player.getInventory().getAmountOf(notedId);
    }

    public void chooseItem(int id) {
	if (!player.getInterfaceManager().containsInterface(105))
	    return;
	setItem(new Item(id), false);
    }

    public void sendInfo(Item item) {
	player.getInterfaceManager().sendInventoryInterface(449);
	player.getPackets().sendGlobalConfig(741, item.getId());
	player.getPackets().sendGlobalString(25, ItemExamines.getExamine(item));
	player.getPackets().sendGlobalString(34, ""); // quest id for some items
	int[] bonuses = new int[18];
	ItemDefinitions defs = item.getDefinitions();
	bonuses[CombatDefinitions.STAB_ATTACK] += defs.getStabAttack();
	bonuses[CombatDefinitions.SLASH_ATTACK] += defs.getSlashAttack();
	bonuses[CombatDefinitions.CRUSH_ATTACK] += defs.getCrushAttack();
	bonuses[CombatDefinitions.MAGIC_ATTACK] += defs.getMagicAttack();
	bonuses[CombatDefinitions.RANGE_ATTACK] += defs.getRangeAttack();
	bonuses[CombatDefinitions.STAB_DEF] += defs.getStabDef();
	bonuses[CombatDefinitions.SLASH_DEF] += defs.getSlashDef();
	bonuses[CombatDefinitions.CRUSH_DEF] += defs.getCrushDef();
	bonuses[CombatDefinitions.MAGIC_DEF] += defs.getMagicDef();
	bonuses[CombatDefinitions.RANGE_DEF] += defs.getRangeDef();
	bonuses[CombatDefinitions.SUMMONING_DEF] += defs.getSummoningDef();
	bonuses[CombatDefinitions.ABSORB_MELEE] += defs.getAbsorptionMeleeBonus();
	bonuses[CombatDefinitions.ABSORB_MAGIC] += defs.getAbsorptionMageBonus();
	bonuses[CombatDefinitions.ABSORB_RANGE] += defs.getAbsorptionRangeBonus();
	bonuses[CombatDefinitions.STRENGTH_BONUS] += defs.getStrengthBonus();
	bonuses[CombatDefinitions.RANGED_STR_BONUS] += defs.getRangedStrBonus();
	bonuses[CombatDefinitions.PRAYER_BONUS] += defs.getPrayerBonus();
	bonuses[CombatDefinitions.MAGIC_DAMAGE] += defs.getMagicDamage();
	boolean hasBonus = false;
	for (int bonus : bonuses)
	    if (bonus != 0) {
		hasBonus = true;
		break;
	    }
	if (hasBonus) {
	    HashMap<Integer, Integer> requiriments = item.getDefinitions().getWearingSkillRequiriments();
	    if (requiriments != null && !requiriments.isEmpty()) {
		String reqsText = "";
		for (int skillId : requiriments.keySet()) {
		    if (skillId > 24 || skillId < 0)
			continue;
		    int level = requiriments.get(skillId);
		    if (level < 0 || level > 120)
			continue;
		    boolean hasReq = player.getSkills().getLevelForXp(skillId) >= level;
		    reqsText += "<br>" + (hasReq ? "<col=00ff00>" : "<col=ff0000>") + "Level " + level + " " + Skills.SKILL_NAME[skillId];
		}
		player.getPackets().sendGlobalString(26, "<br>Worn on yourself, requiring: " + reqsText);
	    } else
		player.getPackets().sendGlobalString(26, "<br>Worn on yourself");
	    player.getPackets().sendGlobalString(35, "<br>Attack<br><col=ffff00>+" + bonuses[CombatDefinitions.STAB_ATTACK] + "<br><col=ffff00>+" + bonuses[CombatDefinitions.SLASH_ATTACK] + "<br><col=ffff00>+" + bonuses[CombatDefinitions.CRUSH_ATTACK] + "<br><col=ffff00>+" + bonuses[CombatDefinitions.MAGIC_ATTACK] + "<br><col=ffff00>+" + bonuses[CombatDefinitions.RANGE_ATTACK] + "<br><col=ffff00>---" + "<br>Strength" + "<br>Ranged Strength" + "<br>Magic Damage" + "<br>Absorve Melee" + "<br>Absorve Magic" + "<br>Absorve Ranged" + "<br>Prayer Bonus");
	    player.getPackets().sendGlobalString(36, "<br><br>Stab<br>Slash<br>Crush<br>Magic<br>Ranged<br>Summoning");
	    player.getPackets().sendGlobalString(52, "<<br>Defence<br><col=ffff00>+" + bonuses[CombatDefinitions.STAB_DEF] + "<br><col=ffff00>+" + bonuses[CombatDefinitions.SLASH_DEF] + "<br><col=ffff00>+" + bonuses[CombatDefinitions.CRUSH_DEF] + "<br><col=ffff00>+" + bonuses[CombatDefinitions.MAGIC_DEF] + "<br><col=ffff00>+" + bonuses[CombatDefinitions.RANGE_DEF] + "<br><col=ffff00>+" + bonuses[CombatDefinitions.SUMMONING_DEF] + "<br><col=ffff00>+" + bonuses[CombatDefinitions.STRENGTH_BONUS] + "<br><col=ffff00>" + bonuses[CombatDefinitions.RANGED_STR_BONUS] + "<br><col=ffff00>" + bonuses[CombatDefinitions.MAGIC_DAMAGE] + "%<br><col=ffff00>" + bonuses[CombatDefinitions.ABSORB_MELEE] + "%<br><col=ffff00>" + bonuses[CombatDefinitions.ABSORB_MAGIC] + "%<br><col=ffff00>" + bonuses[CombatDefinitions.ABSORB_RANGE] + "%<br><col=ffff00>" + bonuses[CombatDefinitions.PRAYER_BONUS]);
	} else {
	    player.getPackets().sendGlobalString(26, "");
	    player.getPackets().sendGlobalString(35, "");
	    player.getPackets().sendGlobalString(36, "");
	    player.getPackets().sendGlobalString(52, "");
	}

    }

    public void chooseItem() {
	if (getType() != 0)
	    return;
	player.getInterfaceManager().setInterface(true, 752, 7, 389);
	player.getPackets().sendRunScript(570, "Grand Exchange Item Search");
    }

    public void offer(int slot) {
	Item item = player.getInventory().getItem(slot);
	if (item == null)
	    return;
	setItem(item, true);
    }

    public void setExtraDetails(int id) {
	setItemId(id);
	setMarketPrice(GrandExchange.getPrice(id));
	player.getPackets().sendIComponentText(105, 143, ItemExamines.getExamine(new Item(id)));
    }

    public void setItem(Item item, boolean sell) {
	if (item.getId() == Shop.COINS || !ItemConstants.isTradeable(item)) {
	    player.getPackets().sendGameMessage("This item cannot be sold on the Grand Exchange.");
	    return;
	}
	if (item.getDefinitions().isNoted() && item.getDefinitions().getCertId() != -1)
	    item = new Item(item.getDefinitions().getCertId(), item.getAmount());
	int price = GrandExchange.getPrice(item.getId());
	setPricePerItem(price);
	setAmount(item.getAmount());
	setExtraDetails(item.getId());
	if (!sell)
	    sendInfo(item);
    }

    public void confirmOffer() {
	int type = getType();
	if (type == -1)
	    return;
	int slot = getCurrentSlot();
	if (slot == -1 || !isSlotFree(slot))
	    return;
	boolean buy = type == 0;
	int itemId = getItemId();
	if (itemId == -1) {
	    player.getPackets().sendGameMessage("You must choose an item to " + (buy ? "buy" : "sell") + "!");
	    return;
	}
	int amount = getAmount();
	if (amount == 0) {
	    player.getPackets().sendGameMessage("You must choose the quantity you wish to " + (buy ? "buy" : "sell") + "!");
	    return;
	}
	int pricePerItem = getPricePerItem();
	if (pricePerItem != 0) {
	    if (amount > 2147483647 / pricePerItem) { // TOO HIGH
		player.getPackets().sendGameMessage("You do not have enough coins to cover the offer.");
		return;
	    }
	}
	if (buy) {
	    int price = pricePerItem * amount;
	    if (player.getInventory().getCoinsAmount() < price) {
		player.getPackets().sendGameMessage("You do not have enough coins to cover the offer.");
		return;
	    }
	    player.getInventory().deleteItem(new Item(995, price));
	} else {
	    int inventoryAmount = getItemAmount(new Item(itemId));
	    if (amount > inventoryAmount) {
		player.getPackets().sendGameMessage("You do not have enough of this item in your inventory to cover the offer.");
		return;
	    }
	    int notedId = ItemDefinitions.getItemDefinitions(itemId).certId; // -1
									     // if
									     // not
									     // noteable
									     // anyway
	    int notedAmount = player.getInventory().getAmountOf(notedId);
	    if (notedAmount < amount) {
		player.getInventory().deleteItem(notedId, notedAmount);
		player.getInventory().deleteItem(itemId, amount - notedAmount);
	    } else
		player.getInventory().deleteItem(notedId, amount);
	}
	GrandExchange.sendOffer(player, slot, itemId, amount, pricePerItem, buy);
	cancelOffer();
    }

    public void makeOffer(int slot, boolean sell) {
	if (!isSlotFree(slot) || getCurrentSlot() != -1) {
	    return;
	}
	if (slot > 2 && !player.isDonator()) {
	    player.getPackets().sendGameMessage("You must be donator to use over 3 slots!");
	    return;
	}
	setType(sell ? 1 : 0);
	setSlot(slot);
	if (sell) {
	    player.getPackets().sendHideIComponent(105, 196, true);
	    player.getInterfaceManager().sendInventoryInterface(107);
	    player.getPackets().sendUnlockIComponentOptionSlots(107, 18, 0, 27, 0);
	    player.getPackets().sendInterSetItemsOptionsScript(107, 18, 93, 4, 7, "Offer");
	} else {
	    player.getInterfaceManager().setInterface(true, 752, 7, 389);
	    player.getPackets().sendRunScript(570, "Grand Exchange Item Search");
	}
    }

}
