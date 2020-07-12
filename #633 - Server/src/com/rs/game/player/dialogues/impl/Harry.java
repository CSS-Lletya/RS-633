package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class Harry extends Dialogue {

    private int npcId = 576;

    @Override
    public void start() {
	sendNPCDialogue(npcId, NORMAL, "Welcome! You can buy Fishing equipment at my store. We'll also give you a good price for any fish that you catch.");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Let's see what you've got, then.", "Sorry, I'm not interested.");
	    stage = 0;
	} else if (stage == 0) {
	    if (componentId == OPTION_1) {
		ShopsHandler.openShop(player, 110);
		end();
	    } else {
		sendPlayerDialogue(NORMAL, "Sorry, I'm not interested.");
		stage = 1;
	    }
	} else if (stage == 1) {
	    end();
	}
    }

    @Override
    public void finish() {

    }
}
