package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

public class Gamfried extends Dialogue {
    
    private int npcId;

    @Override
    public void start() {
	sendNPCDialogue(npcId, NORMAL, "");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	
    }

    @Override
    public void finish() {
	
    }
}
