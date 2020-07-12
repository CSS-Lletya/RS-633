package com.rs.game.player.dialogues.impl;

import com.rs.game.player.content.PlayerLook;
import com.rs.game.player.dialogues.Dialogue;

public class Yrsa extends Dialogue {

    int YRSA = 1301;

    @Override
    public void start() {
	sendNPCDialogue(YRSA, 9827, "Welcome to my clothes shop.", "I can change your shoes, or I've got a fine selection of clothes for sale.");
	stage = 0;
    }

    @Override
    public void run(int interfaceId, int componentId) {
	switch (stage) {
	    case 0:
		sendOptionsDialogue("Select an Option", "I'd like to buy some clothes.", "I'd like to change my shoes.");
		stage = 1;
		break;
	    case 1:
		if (componentId == OPTION_1) {// TODO

		} else if (componentId == OPTION_2) {
		    sendPlayerDialogue(9827, "I'd like to change my shoes.");
		    stage = 2;
		}
		break;
	    case 2:
		end();
		PlayerLook.openYrsaShop(player);
		break;
	}
    }

    @Override
    public void finish() {

    }
}
