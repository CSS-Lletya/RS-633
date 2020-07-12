package com.rs.game.player.dialogues.impl;

import com.rs.game.minigames.CastleWars;
import com.rs.game.player.dialogues.Dialogue;

public class Lanthus extends Dialogue {

    private int npcId;

    @Override
    public void start() {
	npcId = (int) parameters[0];
	sendNPCDialogue(npcId, NORMAL, "Good day! How may I help you?");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "What is this place?", "What do you have for trade?", "How many Castle Wars games have I finished?");
	    stage = 0;
	} else if (stage == 0) {
	    if (componentId == OPTION_1) {
		sendPlayerDialogue(NORMAL, "What is this place?");
		stage = 1;
	    } else if (componentId == OPTION_2) {
		sendPlayerDialogue(NORMAL, "What do you have for trade?");
		stage = 2;
	    }else if (componentId == OPTION_3) {
		sendPlayerDialogue(NORMAL, "How many castle wars game have I won?");
		stage = 3;
	    } else {
		end();
	    }
	} else if (stage == 1) {
	    sendNPCDialogue(npcId, NORMAL, "This is the great Castle Wars arena! Here you can fight for the glory of Saradomin or Zamorak.");
	    stage = -2;
	}else if (stage == 2) {
	    CastleWars.openCastleWarsTicketExchange(player);
	} else if (stage == 3) {
	    sendNPCDialogue(npcId, NORMAL, "You have finished "+player.getFinishedCastleWars()+" Castle Wars games so far, my son.");
	    stage = -2;
	}else {
	    end();
	}
    }

    @Override
    public void finish() {

    }
}
