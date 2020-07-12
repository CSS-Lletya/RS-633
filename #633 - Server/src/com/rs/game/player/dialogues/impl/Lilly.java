package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class Lilly extends Dialogue {

    private int npcId = 4294;

    @Override
    public void start() {
	sendNPCDialogue(npcId, NORMAL, "Uhh... hi... didn't see ya there. Can.... I help you?");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    sendPlayerDialogue(CONFUSED, "Umm... do you sell potions?");
	    stage = 0;
	} else if (stage == 0) {
	    sendNPCDialogue(npcId, NORMAL, "Erm... yes. When I'm not drinking them.");
	    stage = 1;
	} else if (stage == 1) {
	    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "I'd like to see what you have for sale.", "That's a pretty wall hanging.", "Bye!");
	    stage = 2;
	} else if (stage == 2) {
	    if (componentId == OPTION_1) {
		ShopsHandler.openShop(player, 121);
		end();
	    } else if (componentId == OPTION_2) {
		sendPlayerDialogue(NORMAL, "That's a pretty wall hanging.");
		stage = 4;
	    } else {
		stage = 8;
		sendPlayerDialogue(CONFUSED, "Bye!");
	    }
	} else if (stage == 4) {
	    sendNPCDialogue(npcId, NORMAL, "Do you think so? I made it myself.");
	    stage = 5;
	} else if (stage == 5) {
	    sendPlayerDialogue(NORMAL, "Really? Is that why there is all this cloth and die lying around?");
	    stage = 6;
	} else if (stage == 6) {
	    sendNPCDialogue(npcId, NORMAL, "Yes, it is a hobby of mine when I'm.... relaxing.");
	    stage = 7;
	} else if (stage == 7) {
	    end();
	} else if (stage == 8) {
	    stage = 7;
	    sendNPCDialogue(npcId, NORMAL, "Have some fun and come back soon!");
	}
    }

    @Override
    public void finish() {

    }
}
