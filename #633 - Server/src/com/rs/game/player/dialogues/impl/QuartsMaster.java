package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class QuartsMaster extends Dialogue {

    @Override
    public void start() {
	sendNPCDialogue(1208, NORMAL, "Oh, hello there! Your just in time.");
	stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    sendPlayerDialogue(CONFUSED, "In time for what?");
	    stage = 0;
	} else if (stage == 0) {
	    sendNPCDialogue(1208, NORMAL, "I've just received a new stock of the finest halberds.");
	    stage = 1;
	} else if (stage == 1) {
	    sendNPCDialogue(1208, NORMAL, "Would you like to see?");
	    stage = 2;
	} else if (stage == 2) {
	    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Yes.", "No.");
	    stage = 3;
	} else if (stage == 3) {
	    if (componentId == OPTION_1)
		ShopsHandler.openShop(player, 73);
	    end();
	}
    }

    @Override
    public void finish() {

    }
}
