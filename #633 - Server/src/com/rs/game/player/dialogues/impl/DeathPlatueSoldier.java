package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

public class DeathPlatueSoldier extends Dialogue {

    private int npcId = 15087;

    @Override
    public void start() {
	sendPlayerDialogue(NORMAL, "Are you OK?");
	stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) {
	stage++;
	if (stage == 0)
	    sendNPCDialogue(npcId, NORMAL, "Urrrgggh....I'll be OK, the trolls only leave the platue at nightfall. The guys are bringing a strecher shortly.");
	else if (stage == 1)
	    sendPlayerDialogue(NORMAL, "As long as you're sure.");
	else if (stage == 2)
	    sendNPCDialogue(npcId, NORMAL, "It's my own fault really, I was having a walk and wandered too far past the danger sign. THe trollows throug hrocks down at anyone who goes up the path!");
	else if (stage == 3)
	    sendNPCDialogue(npcId, NORMAL,"Don't go up there!");
	else if (stage == 4)
	    sendPlayerDialogue(NORMAL, "OK, thanks for the warning.");
    }

    @Override
    public void finish() {

    }
}
