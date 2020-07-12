package com.rs.game.player.content;

import com.rs.game.item.Item;
import com.rs.game.player.Player;

public class StealingCreationShop {

    private static final int[] POINTS_COST = { 20, 20, 30, 28, 24, 26, 200 };
    private static final int[] DEFAULT_PRODUCTS = { 14098, 14106, 14094, 14095, 14096, 14097, 21527 };

    public static void openInterface(final Player player) {
	refresh(player);
	player.getInterfaceManager().sendInterface(1128);
	player.getPackets().sendRunScriptBlank(5248);
	player.getPackets().sendHideIComponent(1128, 330, true);
	player.getPackets().sendIComponentText(1128, 13, "" + player.getStealingCreationPoints());
	player.setCloseInterfacesEvent(new Runnable() {

	    @Override
	    public void run() {
		resetSelection(player);
	    }
	});
    }

    public static void select(Player player, int index) {
	boolean[] selectedList = (boolean[]) player.getTemporaryAttributtes().get("sc_shop_selected");
	if (selectedList == null)
	    selectedList = new boolean[7];
	if (selectedList[index])
	    selectedList[index] = false;
	else
	    selectedList[index] = true;
	player.getTemporaryAttributtes().put("sc_shop_selected", selectedList);
    }

    private static void resetSelection(Player player) {
	player.getTemporaryAttributtes().remove("sc_shop_selected");
    }

    public static void purchase(Player player) {
	boolean[] requestedList = (boolean[]) player.getTemporaryAttributtes().get("sc_shop_selected");
	if (requestedList == null) {
	    player.getPackets().sendGameMessage("You have nothing selected to purchase / re-charge");
	    return;
	}
	int totalCost = 0;
	for (int index = 0; index < requestedList.length; index++) {
	    if (requestedList[index])
		totalCost += POINTS_COST[index];
	}
	if (player.getStealingCreationPoints() < totalCost) {
	    player.getPackets().sendGameMessage("You don't have enough points.");
	    resetSelection(player);
	    return;
	} else if (player.getInventory().getFreeSlots() < requestedList.length) {
	    player.getPackets().sendGameMessage("You don't have enough space for the requested items.");
	    resetSelection(player);
	    return;
	}
	for (int index = 0; index < requestedList.length; index++) {
	    if (requestedList[index])
		player.getInventory().addItem(new Item(DEFAULT_PRODUCTS[index]));
	}
	player.increaseStealingCreationPoints(-totalCost);
	refresh(player);
    }

    private static void refresh(Player player) {
	player.getVarsManager().sendVarBit(5505, player.getStealingCreationPoints());
    }
}
