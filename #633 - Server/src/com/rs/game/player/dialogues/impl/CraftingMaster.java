package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

public class CraftingMaster extends Dialogue {

    private int npcId;

    @Override
    public void start() {
	npcId = (int) this.parameters[0];
	sendNPCDialogue(npcId, NORMAL, "Please feel free to use this pottery wheel, I won't be using it all the time. Put your pots in the kiln when you've made one.");
	stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) {
	stage++;
	if (stage == 0)
	    sendNPCDialogue(npcId, MAD, "And make sure you've tidey up after yourself!");
	else
	    end();
    }

    @Override
    public void finish() {

    }
}
