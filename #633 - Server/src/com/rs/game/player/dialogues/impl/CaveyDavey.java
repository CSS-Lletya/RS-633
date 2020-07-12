package com.rs.game.player.dialogues.impl;

import com.rs.game.WorldTile;
import com.rs.game.player.dialogues.Dialogue;

public class CaveyDavey extends Dialogue {

    private int npcId = 4358;

    @Override
    public void start() {
	sendNPCDialogue(npcId, NORMAL, "Be ye mad? There be Horrors in this cave!");
	if (player.getEquipment().getAmuletId() == 8923)
	    stage = 15;
	else
	    stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    sendPlayerDialogue(NORMAL, "What do you mean?");
	    stage = 0;
	} else if (stage == 0) {
	    sendNPCDialogue(npcId, NORMAL, "Have ye ever head of the sort of evil, flesh-eatin' horros that dwell in the darkest pits of the world?");
	    stage = 1;
	} else if (stage == 1) {
	    sendNPCDialogue(npcId, NORMAL, "The sort of dark, sanity-breaking' THINGS that cause the livin' to dorp to their knees and weep for the fate of all creation,");
	    stage = 2;
	} else if (stage == 2) {
	    sendNPCDialogue(npcId, NORMAL, "Well, have ye?");
	    stage = 3;
	} else if (stage == 3) {
	    sendPlayerDialogue(NORMAL, "Yes, I think i've killed a few of them as well.");
	    stage = 4;
	} else if (stage == 4) {
	    sendNPCDialogue(npcId, NORMAL, "Well, that's ok then.");
	    stage = 5;
	} else if (stage == 5) {
	    sendNPCDialogue(npcId, NORMAL, "But, ye'll need a Witchwood Icon from a slayer master if ye want te go in these caves and live.");
	    stage = 6;
	} else if (stage == 6) {
	    sendPlayerDialogue(NORMAL, "Why?");
	    stage = 7;
	} else if (stage == 7) {
	    sendNPCDialogue(npcId, NORMAL, "Well, ye see them Jungle Horrers? Well down in the caves there be Cave Horrers.");
	    stage = 8;
	} else if (stage == 8) {
	    sendNPCDialogue(npcId, NORMAL, "They are bigger, badder, meaner, and have a howl that freezes the blood in yer veins.");
	    stage = 9;
	} else if (stage == 9) {
	    sendNPCDialogue(npcId, NORMAL, "Wearin' earmuffs or a helmet won't work, cos them masks they wear make the sound magical. Only thing that works is wearin' a Witchwood Icon.");
	    stage = 10;
	} else if (stage == 10) {
	    sendNPCDialogue(npcId, NORMAL, "That is, o' course, if ye can see them cos if ye don't have any light down there then yer likely te be picked te bones by the insects before the Horrers get ye.");
	    stage = 11;
	} else if (stage == 11) {
	    sendPlayerDialogue(NORMAL, "I see, thanks for the warning.");
	    stage = 12;
	} else if (stage == 12) {
	    sendNPCDialogue(npcId, NORMAL, "Yer welcome.");
	    stage = 13;
	} else if (stage == 13) {
	    sendOptionsDialogue("Do you still want to proceed?", "Yes, I am not afraid to be killed in nasty ways." ,"No, I think I need to go get one of these Icon things.");
	    stage = 14;
	} else if (stage == 14) {
	    if (componentId == OPTION_1) {
		player.useStairs(-1, new WorldTile(3748,9373,0), 1, 2);
		player.getControlerManager().startControler("UnderGroundDungeon", false, true);
	    }
	    end();
	} else if (stage == 15) {
	    sendDialogue("You look in the cave enterance, and see its very, very dark. It also sounds like there are many large creatures moving around in there.");
	    stage = 16;
	} else if (stage == 16) {
	    sendOptionsDialogue("Do you still want to proceed?", "Yes, I think I am fully prepared.", "No, I think I need to go get food, weapons and a light source.");
	    stage = 14;
	}
    }

    @Override
    public void finish() {

    }
}
