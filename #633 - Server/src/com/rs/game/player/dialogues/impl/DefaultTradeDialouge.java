package com.rs.game.player.dialogues.impl;

import com.rs.game.World;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.io.InputStream;
import com.rs.net.decoders.handlers.NPCHandler;

public class DefaultTradeDialouge extends Dialogue {

    InputStream stream;
    int npcId;

    @Override
    public void start() {
	npcId = (int) parameters[0];
	stream = (InputStream) parameters[1];
	sendNPCDialogue(npcId, 9827, "Hello young traveler. How can I help you today?");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    stage = 0;
	    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "How are you?", "What does your shop offer?", "Nothing, nevermind.");
	} else if (stage == 0) {
	    if (componentId == OPTION_1) {
		sendPlayerDialogue(9827, "How are you?");
		stage = 1;
	    } else if (componentId == OPTION_2) {
		sendPlayerDialogue(9827, "What does your shop offer?");
		stage = 5;
	    } else {
		sendPlayerDialogue(9827, "Nothing, nevermind.");
		stage = 7;
	    }
	} else if (stage == 1) {
	    sendNPCDialogue(npcId, 9827, "I'm doing fine, although the store seems to be a tad empty...");
	    stage = 2;
	} else if (stage == 2) {
	    stage = 3;
	    sendPlayerDialogue(9827, "Well... what do you expect! There are only " + World.getPlayers().size() + " players who can buy from you anyways.");
	} else if (stage == 3) {
	    stage = 4;
	    sendNPCDialogue(npcId, 9827, ".... Good point. Well young traveler, you should be heading off now.");
	} else if (stage == 4) {
	    sendPlayerDialogue(9827, "Oh, you are correct. I'll see you in the near future.");
	    stage = 7;
	} else if (stage == 5) {
	    sendNPCDialogue(npcId, 9827, "Only the finest items you can possibly imagine!");
	    stage = 6;
	} else if (stage == 6) {
	    NPCHandler.handleOption2(player, new InputStream(stream.getBuffer()));
	    end();
	} else if (stage == 7) {
	    end();
	}
    }

    @Override
    public void finish() {

    }
}
