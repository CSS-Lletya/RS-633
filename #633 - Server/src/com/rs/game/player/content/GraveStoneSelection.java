package com.rs.game.player.content;

import com.rs.game.item.Item;
import com.rs.game.player.Player;

public class GraveStoneSelection {

    public static void openSelectionInterface(Player player) {
	player.getInterfaceManager().sendInterface(652);
	player.getPackets().sendUnlockIComponentOptionSlots(652, 31, 0, 78, 0, 1);
	player.getPackets().sendUnlockIComponentOptionSlots(652, 34, 0, 13, 0, 1);
	player.getVarsManager().sendVar(1146, player.getGraveStone() | 262112);
    }

    public static void handleSelectionInterface(Player player, int slot) {
	player.getTemporaryAttributtes().put("grave_selected_slot", slot);
	player.getTemporaryAttributtes().put("grave_selected_price", -1);
	if (slot == 1) {
	    player.getTemporaryAttributtes().put("grave_selected_price", 50);
	} else if (slot == 2) {
	    player.getTemporaryAttributtes().put("grave_selected_price", 500);
	} else if (slot == 3) {
	    player.getTemporaryAttributtes().put("grave_selected_price", 5000);
	} else if (slot > 3 && slot < 12) {
	    player.getTemporaryAttributtes().put("grave_selected_price", 50000);
	} else if (slot > 11) {
	    player.getTemporaryAttributtes().put("grave_selected_price", 500000);
	}
    }

    public static void confirmSelection(Player player) {
	int selectedSlot = (int) player.getTemporaryAttributtes().get("grave_selected_slot");
	int selectedPrice = (int) player.getTemporaryAttributtes().get("grave_selected_price");
	if (selectedSlot != -1) {
	    if (!player.isDonator() && selectedSlot == 12) {
		player.getPackets().sendGameMessage("You need to be a donator to be able to purchase this gravestone.");
		return;
	    } else if (!player.isExtremeDonator() && selectedSlot == 13) {
		player.getPackets().sendGameMessage("You need to be an exteme donator to be able to purchase this gravestone.");
		return;
	    } else if (selectedPrice != -1) {
		if (player.getInventory().getCoinsAmount() < selectedPrice) {
					player.getPackets()
							.sendGameMessage(
									"You don't have enough coins to purchase this gravestone.");
		    return;
		}
		player.getInventory().deleteItem(new Item(995, selectedPrice));
	    }
	    player.setGraveStone(selectedSlot);
	    player.closeInterfaces();
	}
    }
}
