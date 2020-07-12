package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

public class Mariah extends Dialogue {

    private int npcId = 11519;

    @Override
    public void start() {
	sendNPCDialogue(npcId, SAD, "He's dead! He's dead! My Mikhal is dead!");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	stage++;
	if (stage == 0)
	    sendPlayerDialogue(NORMAL, "Maybe you should go  back to the mainland, see some family?");
	else if (stage == 1)
	    sendNPCDialogue(npcId, NORMAL, "And leave his grave?, Never! I'm going to say here, with him.");
	else if (stage == 2)
	    end();
    }

    @Override
    public void finish() {
	
    }
}
