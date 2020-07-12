package com.rs.game.player.dialogues.impl;

import com.rs.game.npc.NPC;
import com.rs.game.player.controllers.RuneEssenceController;
import com.rs.game.player.dialogues.Dialogue;

public class Brimstail extends Dialogue {

    private int npcId = 171;

    @Override
    public void start() {
	sendNPCDialogue(npcId, NORMAL, "Hello adventurer, what can I do for you?");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Hello, just wanted a chat.", "I've been investigating another watcher in the Tree Gnome Village.", "I need to mine some rune essence.", "I'd like another crystal please.", "Nevermind.");
	    stage = 0;
	} else if (stage == 0) {
	    if (componentId == OPTION_1) {
		sendPlayerDialogue(NORMAL, "Hello, just wanted a chat.");
		stage = 1;
	    } else if (componentId == OPTION_2) {
		sendPlayerDialogue(NORMAL, "I've been investigating another watcher in the Tree Gnome Village.");
		stage = 4;
	    } else if (componentId == OPTION_3) {
		sendPlayerDialogue(NORMAL, "I need to mine some rune essence.");
		stage = 8;
	    } else if (componentId == OPTION_4) {
		sendPlayerDialogue(NORMAL, "I'd like another crystal please.");
		stage = 10;
	    } else {
		end();
	    }
	} else if (stage == 1) {
	    sendNPCDialogue(npcId, NORMAL, "It's always a pleasure to catch up with another mage! Especially one who has helped me so much! How are your researches going?");
	    stage = 2;
	} else if (stage == 2) {
	    sendPlayerDialogue(NORMAL, "Oh, not so bad. I'll let you know if I find anything I think you'll find interesting...");
	    stage = 3;
	} else if (stage == 3) {
	    sendNPCDialogue(npcId, NORMAL, "Thanks! I'd appreciate that.");
	    stage = 15;
	} else if (stage == 4) {
	    sendPlayerDialogue(NORMAL, "I've been investigating another watcher in the Tree Gnome Village. And, as a consequence, I've found an underground cave complex full of warped terrorbirds and tortoises. It seems to be underneath Arposandra or, at least, a city with gnomes in that use talking terrorbirds as guards.");
	    stage = 5;
	} else if (stage == 5) {
	    sendNPCDialogue(npcId, NORMAL, "Wow! You've really found Arposandra.");
	    stage = 6;
	} else if (stage == 6) {
	    sendPlayerDialogue(NORMAL, "I think so, though I can't get in. It's all blocked up. But I'll find a way...eventually.");
	    stage = 7;
	} else if (stage == 7) {
	    sendNPCDialogue(npcId, NORMAL, "Well, good luck!");
	    stage = 15;
	} else if (stage == 8) {
	    sendPlayerDialogue(NORMAL, "Can you teleport me to the Rune Essence?");
	    stage = 9;
	} else if (stage == 9) {
	    sendNPCDialogue(npcId, NORMAL, "Okay. Hold onto your hat!");
	    RuneEssenceController.teleport(player, (NPC) this.parameters[0]);
	    stage = 15;
	} else if (stage == 10) {
	    sendNPCDialogue(npcId, NORMAL, "Why of course!");
	    stage = 11;
	} else if (stage == 11) {
	    sendEntityDialogue(IS_ITEM, "", 9626, -1, "Brimstail hands you a small crystal.");
	    player.getInventory().addItem(9626, 1);
	    stage = 12;
	} else if (stage == 12) {
	    sendPlayerDialogue(NORMAL, "Thank you!");
	    stage = 14;
	} else if (stage == 14) {
	    sendNPCDialogue(npcId, NORMAL, "Anything for a fellow magician, just dont lose it. I have a very limited supply of them that flows from our local mine.");
	    stage = 15;
	} else if (stage == 15) {
	    end();
	}
    }

    @Override
    public void finish() {

    }
}
