package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class Lundail extends Dialogue {

    private int npcId;

    @Override
    public void start() {
	npcId = (Integer) parameters[0];
	sendNPCDialogue(npcId, 9827, "Hello sir.");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    stage = 0;
	    sendNPCDialogue(npcId, 9827, "How can I help you, brave adventurer?");
	} else if (stage == 0) {
	    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "What are you selling?", "What is that big old building above us?");
	    stage = 1;
	} else if (stage == 1) {
	    if (componentId == OPTION_1) {
		stage = 2;
		sendPlayerDialogue(9827, "What are you selling?");
	    } else {
		sendPlayerDialogue(9827, "What is that big old building above us?");
		stage = 4;
	    }
	} else if (stage == 2) {
	    sendNPCDialogue(npcId, 9827, "I sell rune stones. I've got some good stuff, some really powerful little rocks. Take a look.");
	    stage = 3;
	} else if (stage == 3) {
	    ShopsHandler.openShop(player, 38);
	    end();
	} else if (stage == 4) {
	    stage = 5;
	    sendNPCDialogue(npcId, 9827, "That my friend, is the mage battle arena. Top mages come from all over Runescape to compete in the arena.");
	} else if (stage == 5) {
	    stage = 6;
	    sendPlayerDialogue(9827, "Wow.");
	} else if (stage == 6) {
	    stage = 7;
	    sendNPCDialogue(npcId, 9827, "Few return, most get fried, hence the smell.");
	} else if (stage == 7) {
	    stage = 8;
	    sendPlayerDialogue(9827, "Hmmm..I did notice.");
	} else if (stage == 8) {
	    end();
	}
    }

    @Override
    public void finish() {

    }
}
