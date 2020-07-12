package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class Anton extends Dialogue {

    private int npcId = 4295;

    @Override
    public void start() {
	sendNPCDialogue(npcId, NORMAL, "Ahhhh, hello there. How can I help?");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	stage++;
	if (stage == 0)
	    sendPlayerDialogue(NORMAL, "Looks like you have a good selection of weapons around here...");
	else if (stage == 1)
	    sendNPCDialogue(npcId, NORMAL, "Indeed so, specially imported from the finest smiths around the lands, take a look at my wares.");
	else if (stage == 2) {
	    ShopsHandler.openShop(player, 119);
	    end();
	}
    }

    @Override
    public void finish() {

    }
}
