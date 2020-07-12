package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

public class MrsGord extends Dialogue {

    private int npcId = 11517;

    @Override
    public void start() {
	sendNPCDialogue(npcId, SAD, "I heard about the landing party. All those young people...and the Commodore...");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	stage++;
	if (stage == 0)
	    sendPlayerDialogue(NORMAL, "I guess you're glad you stopped Terry from becomming a knight, huh?");
	else if (stage == 1)
	    sendNPCDialogue(npcId, SAD, "Yes, but now he knows a pain that won't leave him for the rest of his life. Maybe I should reconsider, let him train... it might help take his mind off things.");
	else if (stage == 2)
	    end();
    }

    @Override
    public void finish() {

    }
}