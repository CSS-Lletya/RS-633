package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

public class Shanomi extends Dialogue {

    private int npcId = 4290;

    @Override
    public void start() {
	sendNPCDialogue(npcId, NORMAL, "Greetings " + player.getDisplayName() + " Welcome you are in the test of combat.");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "What do I do here?", "Where do the machines come from?", "Bye!");
	    stage = 0;
	} else if (stage == 0) {
	    if (componentId == OPTION_1) {
		sendPlayerDialogue(NORMAL, "What do I do here?");
		stage = 1;
	    } else if (componentId == OPTION_2) {
		sendPlayerDialogue(NORMAL, "Where do the machines come from?");
		stage = 10;
	    } else if (componentId == OPTION_3) {
		sendPlayerDialogue(NORMAL, "Bye!");
		stage = 15;
	    }
	} else if (stage == 1) {
	    sendNPCDialogue(npcId, NORMAL, "A spare suit of armor need you will. Full helm, plate leggings and platebody yes? Placing it in the centre of the magical machines you will be doing. KA-POOF! The armor, it attaks its most furiously as if alive! Kill it you must, yes.");
	    stage = 2;
	} else if (stage == 2) {
	    sendPlayerDialogue(NORMAL, "So I use a full set of plate armor on the centre plate of the machines and it will animate it? Then I have to kill my own armor... how bizzare!");
	    stage = 3;
	} else if (stage == 3) {
	    sendNPCDialogue(npcId, NORMAL, "Yes. It is as you are saying. For this earn tokens you will. Also gain experience in combat you will. Trained long and hard here have I.");
	    stage = 4;
	} else if (stage == 4) {
	    sendPlayerDialogue(NORMAL, "Your not from around here are you?");
	    stage = 5;
	} else if (stage == 5) {
	    sendNPCDialogue(npcId, NORMAL, "Yes. It is as you say.");
	    stage = 6;
	} else if (stage == 6) {
	    sendPlayerDialogue(NORMAL, "So can my armor get damaged?");
	    stage = 7;
	} else if (stage == 7) {
	    sendNPCDialogue(npcId, NORMAL, "Lose armor you will if damaged too much it becomes. Rare this is, but still possible. If kill you the armor does, also lose armor you will.");
	    stage = 8;
	} else if (stage == 8) {
	    sendPlayerDialogue(NORMAL, "So, occasionally I might lose a bit because it's being bashed about and I'll obviously lose it if I die... that it?");
	    stage = 9;
	} else if (stage == 9) {
	    sendNPCDialogue(npcId, NORMAL, "It is as you say.");
	    stage = -1;
	} else if (stage == 10) {
	    sendNPCDialogue(npcId, NORMAL, "Make them I did, with magics.");
	    stage = 11;
	} else if (stage == 11) {
	    sendPlayerDialogue(NORMAL, "Magic, in the Warrior's Guild?");
	    stage = 13;
	} else if (stage == 13) {
	    sendNPCDialogue(npcId, NORMAL, "A skilled warrior also am I. Harallak mistakes does not make. Potential in my invention he sees and opprotunity grasps.");
	    stage = 14;
	} else if (stage == 14) {
	    sendPlayerDialogue(NORMAL, "I see, so you made the magical machines and Harrallak saw how they could be used in the guild to train warrior's combat... interesting. Harrallak certainly is an intellegent guy.");
	    stage = 9;
	} else if (stage == 15) {
	    sendNPCDialogue(npcId, NORMAL, "Health be with you travelling.");
	    stage = 16;
	} else if (stage == 16) {
	    end();
	}
    }

    @Override
    public void finish() {

    }
}
