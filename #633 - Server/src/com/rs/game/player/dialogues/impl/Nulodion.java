package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class Nulodion extends Dialogue {

    private int npcId;

    @Override
    public void start() {
	npcId = (Integer) parameters[0];
	sendPlayerDialogue(9827, "Hello!");

    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    stage = 0;
	    sendNPCDialogue(npcId, 9827, "Hello traveler, how's things?");
	} else if (stage == 0) {
	    stage = 1;
	    sendPlayerDialogue(9827, "Not bad thanks, yourself?");
	} else if (stage == 1) {
	    stage = 2;
	    sendNPCDialogue(npcId, 9827, "I'm good, just working hard as usual...");
	} else if (stage == 2) {
	    stage = 3;
	    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "I was hoping you might sell me a cannon?", "Well, take care of yourself then.", "I want to know more about the cannon.");
	} else if (stage == 3) {
	    if (componentId == OPTION_1) {
		ShopsHandler.openShop(player, 34);
		end();
	    } else if (componentId == OPTION_2) {
		stage = 4;
		sendPlayerDialogue(9827, "Well, take care of yourself then.");
	    } else {
		stage = 5;
		sendPlayerDialogue(9827, "I want to know more about the cannon.");
	    }
	} else if (stage == 4) {
	    stage = -2;
	    sendNPCDialogue(npcId, 9827, "Indeed I will adventurer.");
	} else if (stage == 5) {
	    stage = 6;
	    sendNPCDialogue(npcId, 9827, "There's only so much I can tell you, adventurer. We've been working on this little beauty for some time now.");
	} else if (stage == 6) {
	    stage = 7;
	    sendPlayerDialogue(9827, "Is it effective?");
	} else if (stage == 7) {
	    stage = -2;
	    sendNPCDialogue(npcId, 9827, "In short bursts it's very effective, the most destructive weapon to date. The cannon automatically targets monsters close by. You just have to make the ammo and let rip.");
	} else
	    end();

    }

    @Override
    public void finish() {
	// TODO Auto-generated method stub

    }

}
