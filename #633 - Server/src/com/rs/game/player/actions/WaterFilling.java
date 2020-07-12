package com.rs.game.player.actions;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.Animation;
import com.rs.game.item.Item;
import com.rs.game.player.Player;

public class WaterFilling extends Action {

    public enum Fill {
	VIAL(229, 227), BOWL(1923, 1921), BUCKET(1925, 1929), JUG(1937, 1935), VASE(3734, 3735), PLANT_POT(5350, 5354);
	private int empty, full;

	private Fill(int empty, int full) {
	    this.empty = empty;
	    this.full = full;
	}

	public int getEmpty() {
	    return empty;
	}

    }

    public static boolean isFilling(Player player, int empty, boolean isSpot) {
	for (Fill fill : Fill.values()) {
	    if (fill.empty == empty) {
		if (isSpot && fill.ordinal() <= 4)
		    return false;
		fill(player, fill);
		return true;
	    }
	}
	return false;
    }

    private static void fill(Player player, Fill fill) {
	if (player.getInventory().getItems().getNumberOf(new Item(fill.empty, 1)) <= 1) // contains
											// just
	    // 1 lets start
	    player.getActionManager().setAction(new WaterFilling(fill, 1));
	else
	    player.getDialogueManager().startDialogue("WaterFillingD", fill);
    }

    private Fill fill;
    private int quantity;

    public WaterFilling(Fill fill, int quantity) {
	this.fill = fill;
	this.quantity = quantity;
    }

    public boolean checkAll(Player player) {
	if (!player.getInventory().containsOneItem(fill.empty)) {
	    player.getDialogueManager().startDialogue("SimpleMessage", "You don't have any " + ItemDefinitions.getItemDefinitions(fill.empty).getName().toLowerCase() + " to fill.");
	    return false;
	}
	return true;
    }

    @Override
    public boolean start(Player player) {
	if (checkAll(player)) {
	    setActionDelay(player, 1);
	    player.setNextAnimation(new Animation(832));
	    player.getPackets().sendGameMessage("You fill the " + ItemDefinitions.getItemDefinitions(fill.full).getName() + ".");
	    return true;
	}
	return false;
    }

    @Override
    public boolean process(Player player) {
	return checkAll(player);
    }

    @Override
    public int processWithDelay(Player player) {
	player.getInventory().deleteItem(fill.empty, 1);
	player.getInventory().addItem(fill.full, 1);
	quantity--;
	if (quantity <= 0)
	    return -1;
	player.setNextAnimation(new Animation(fill.ordinal() == 5 ? 2272 : 832));
	return fill.ordinal() == 5 ? 3 : 0;
    }

    @Override
    public void stop(final Player player) {
	setActionDelay(player, 3);
    }
}
