package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

public class RepairSquire extends Dialogue {

    private int npcId = 3797;

    @Override
    public void start() {
	sendPlayerDialogue(NORMAL, "Can you repair my items for me?");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	stage++;
	if (stage == 0)
	    sendNPCDialogue(npcId, NORMAL, "Of course I'll repair it, through the materials may cost you. Just hand me the item and I'll have a look.");
	else
	    end();
    }

    @Override
    public void finish() {

    }
}
