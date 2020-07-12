package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class Jossik extends Dialogue {

    private int npcId;

    @Override
    public void start() {
	npcId = (Integer) parameters[0];
	sendNPCDialogue(npcId, 9827, "Hello again, adventurer. What brings you this way?");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    stage = 0;
	    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Can I see your wares?", "Have you found any new prayer books?");
	} else if (stage == 0) {
	    if (componentId == OPTION_1) {
		stage = 1;
		sendPlayerDialogue(9827, "Can I see your wares?");
	    } else {
		ShopsHandler.openShop(player, 35);
		end();
	    }
	} else if (stage == 1) {
	    stage = 2;
	    sendNPCDialogue(npcId, 9827, "Sure thing! I think you'll agree, my prices are remarkable.");
	} else if (stage == 2) {
	    ShopsHandler.openShop(player, 36);
	    end();
	} else
	    end();

    }

    @Override
    public void finish() {
	// TODO Auto-generated method stub

    }

}
