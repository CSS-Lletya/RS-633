package com.rs.game.player.dialogues.impl;

import com.rs.game.player.Player;
import com.rs.game.player.actions.Herblore;
import com.rs.game.player.dialogues.Dialogue;

public class NeemDrupeSqueeze extends Dialogue {
    @Override
    public void start() {
	boolean hasOil = player.getInventory().containsItem(22444, 1);
	if (!hasOil && !player.getInventory().containsItem(1935, 1)) {
	    sendItemDialogue(1935, "I should get an empty jug to hold the juice before I squeeze the neem drupe.");
	} else if (!player.getInventory().containsItemToolBelt(Herblore.PESTLE_AND_MORTAR)) 
	    sendItemDialogue(Herblore.PESTLE_AND_MORTAR, "I should get a pestle and mortal before I squeeze the neem drupe.");
	else {
	    if(!hasOil) {
		   player.getInventory().deleteItem(1935, 1);
		   player.getInventory().addItem(22444, 1);
		   player.getCharges().resetCharges(22444);
	    }
	    int count = player.getInventory().getAmountOf(22445);
	    player.getInventory().deleteItem(22445, count);
	    player.getCharges().addCharges(22444, count, 2000);
	    sendItemDialogue(22444, "You squeeze the neem drupe into a jug.");
	}
    }
    
    public static void removeCharge(Player player) {
	player.getCharges().addCharges(22444, -1, 2000);
	if(player.getCharges().getCharges(22444) == 0)  {
	    player.getInventory().deleteItem(22444, 1);
	    player.getInventory().addItem(1935, 1);
	    player.getPackets().sendGameMessage("There is no more oil in the jug.");
	}
    }

    @Override
    public void run(int interfaceId, int componentId) {
	switch (stage) {
	    default:
		end();
		break;
	}

    }

    @Override
    public void finish() {
	// TODO Auto-generated method stub

    }

}
