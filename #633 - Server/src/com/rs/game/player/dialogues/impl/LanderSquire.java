package com.rs.game.player.dialogues.impl;

import com.rs.game.minigames.pest.Lander;
import com.rs.game.player.dialogues.Dialogue;

public class LanderSquire extends Dialogue {

    private int npcId;

    @Override
    public void start() {
	npcId = (int) this.parameters[0];
	sendNPCDialogue(npcId, NORMAL, "Hi, how can I help you?");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Who are you?", "What's going on here?", "I'm fine thanks.");
	    stage = 0;
	} else if (stage == 0) {
	    if (componentId == OPTION_1) {
		sendPlayerDialogue(NORMAL, "Who are you?");
		stage = 1;
	    } else if (componentId == OPTION_2) {
		sendPlayerDialogue(NORMAL, "What's going on around here?");
		stage = 3;
	    } else {
		sendPlayerDialogue(NORMAL, "I'm fine thanks.");
		stage = 10;
	    }
	} else if (stage == 1) {
	    sendNPCDialogue(npcId, NORMAL, "I'm a Void Knight squire, my lord.");
	    stage = 2;
	} else if (stage == 2) {
	    sendPlayerDialogue(NORMAL, "So I see. Well, keep up the good work.");
	    stage = 10;
	} else if (stage == 3) {
	    sendNPCDialogue(npcId, NORMAL, "This is where we launch our landers to ocmbat the invasion of nearby islands. You'll see three landers - one for novice, intermediate, and verteran adventurers. Each has a different difficulty, but they therefore offer");
	    stage = 4;
	} else if (stage == 4) {
	    sendNPCDialogue(npcId, NORMAL, "varying rewards.");
	    stage = 5;
	} else if (stage == 5) {
	    sendPlayerDialogue(CONFUSED, "And this lander is...?");
	    stage = 6;
	} else if (stage == 6) {
	    sendNPCDialogue(npcId, NORMAL, "The " + Lander.getLanders()[getIndex()].toString().toLowerCase() + ".");
	    stage = 7;
	} else if (stage == 7) {
	    sendPlayerDialogue(CONFUSED, "So how do they work?");
	    stage = 8;
	} else if (stage == 8) {
	    sendNPCDialogue(npcId, NORMAL, "Simple. We send each lander out every five minutes, however we need at least five volunteers or it's a suicide mission. The lander can only hold a maxmimum of twenty five people though, so we do send them out early if they");
	    stage = 9;
	} else if (stage == 9) {
	    sendNPCDialogue(npcId, NORMAL, "get full. If you'd be willing to help us then just wait in the lander and we'll launch it as soon as it's ready. However you will need a combat level of " + Lander.getLanders()[getIndex()].getLanderRequierment().getRequirement() + " to use this lander.");
	    stage = 10;
	} else if (stage == 10) {
	    end();
	}
    }

    private int getIndex() {
	switch (npcId) {
	    case 3802:
		return 0;
	    case 6140:
		return 1;
	    case 6141:
		return 2;
	}
	return -1;
    }

    @Override
    public void finish() {

    }
}
