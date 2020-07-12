package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

public class MageOfZamorak extends Dialogue {

    private int npcId = 2258;

    @Override
    public void start() {
	sendNPCDialogue(npcId, MAD, "This is no place to talk!", "Meet me at the Varrock Choas Temple!");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1)
	    end();
    }

    @Override
    public void finish() {

    }
}
