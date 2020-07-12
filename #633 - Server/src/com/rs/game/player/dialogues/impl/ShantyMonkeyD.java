package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

public class ShantyMonkeyD extends Dialogue {

    @Override
    public void start() {
	sendPlayerDialogue(9827, "<p=2>Who's a cute little monkey?");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	switch(stage) {
	    case -1:
		stage = -2;
		sendNPCDialogue(2301, 9827, "<p=2>Ukkuk oook! Eeek aka, ahh aka gonk.");
		break;
	    default:
		end();
		break;
	}
    }

    @Override
    public void finish() {

    }

}
