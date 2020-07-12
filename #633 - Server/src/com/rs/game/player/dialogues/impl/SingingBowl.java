package com.rs.game.player.dialogues.impl;

import com.rs.game.item.Item;
import com.rs.game.player.dialogues.Dialogue;

public class SingingBowl extends Dialogue {

    Item item;

    @Override
    public void start() {
	item = (Item) this.parameters[0];
	sendDialogue("You use the seed on the bowl and it begins to shine.");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	stage++;
	if (stage == 0) {
	    sendOptionsDialogue("What would you like to make?", "Crystal saw.", "Crystal Chime.", "Nothing.");
	} else if (stage == 1) {
	    if (componentId == OPTION_1) {
		player.getInventory().addItem(9625, 1);
		player.getInventory().deleteItem(9626, 1);
	    } else if (componentId == OPTION_2) {
		player.getInventory().addItem(11749, 1);
		player.getInventory().deleteItem(9626, 1);
	    }
	    end();
	}
    }

    @Override
    public void finish() {

    }
}
