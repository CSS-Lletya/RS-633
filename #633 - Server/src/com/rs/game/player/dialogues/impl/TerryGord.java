package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

public class TerryGord extends Dialogue {

    private int npcId = 11516;

    @Override
    public void start() {
	sendNPCDialogue(npcId, SAD, "I heard about the landing party. All my friends... and the Commodore...");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	stage++;
	if (stage == 0)
	    sendPlayerDialogue(NORMAL, "Does it make you think twice about wanting to become a Void Knight?");
	else if (stage == 1)
	    sendNPCDialogue(npcId, SAD, "Yes and no. I want to become one to honour their memory and keep the fight going, but to lose so many...");
	else if (stage == 2)
	    end();
    }

    @Override
    public void finish() {

    }
}
