package com.rs.game.player.dialogues.impl;

import com.rs.game.minigames.pest.CommendationExchange;
import com.rs.game.player.dialogues.Dialogue;

public class VoidKnightExchange extends Dialogue {

    private int npcId;

    @Override
    public void start() {
	npcId = (int) this.parameters[0];
	sendNPCDialogue(npcId, NORMAL, "Hi, how can I help you?");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Who are you?", "What is this place?", "Can you exchange my Commendations for training?", "I'm fine thanks.");
	    stage = 0;
	} else if (stage == 0) {
	    if (componentId == OPTION_1) {
		sendPlayerDialogue(NORMAL, "Who are you?");
		stage = 1;
	    } else if (componentId == OPTION_2) {
		sendPlayerDialogue(NORMAL, "What is this place?");
		stage = 2;
	    } else if (componentId == OPTION_3) {
		CommendationExchange.openExchangeShop(player);
		end();
	    } else {
		sendPlayerDialogue(NORMAL, "I'm fine, thanks.");
		stage = 3;
	    }
	} else if (stage == 1) { //sendNPCDialogue(npcId, NORMAL,"");
	    sendNPCDialogue(npcId, NORMAL, "A Void Knight, sir, fight for balance just like you.");
	    stage = 3;
	} else if (stage == 2) {
	    sendNPCDialogue(npcId, NORMAL, "Sir, this is our outpost. Be welcome.");
	    stage = 3;
	} else if (stage == 3) {
	    end();
	}
    }

    @Override
    public void finish() {

    }
}
