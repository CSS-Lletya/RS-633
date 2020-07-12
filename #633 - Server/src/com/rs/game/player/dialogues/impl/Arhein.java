package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class Arhein extends Dialogue {

    private int npcId = 563; 

    @Override
    public void start() {
	sendNPCDialogue(npcId, NORMAL, "Hello! Would you like to trade? I've a variety of wares for sale, as well as a special supply of pineapples and seeweed!");
	stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) {
	stage++;
	if (stage == 0)
	    sendPlayerDialogue(NORMAL, "Lets trade!");
	else if (stage == 1) {
	    end();
	    ShopsHandler.openShop(player, 108);
	}
	    
    }

    @Override
    public void finish() {
	
    }
}
