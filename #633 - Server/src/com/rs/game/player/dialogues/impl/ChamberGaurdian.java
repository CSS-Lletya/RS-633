package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class ChamberGaurdian extends Dialogue {

    private int npcId;

    @Override
    public void start() {
	npcId = (Integer) parameters[0];
	sendNPCDialogue(npcId, 9827, "Hello again, adventurer, are you looking for another staff?");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    stage = 0;
	    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "What do you have to offer?", "No thanks.");
	} else if (stage == 0) {
	    if (componentId == OPTION_1) {
		ShopsHandler.openShop(player, 37);
		stage = 1;
	    }
	    end();
	}
    }

    @Override
    public void finish() {

    }
}
