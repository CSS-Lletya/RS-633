package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

public class MiladeDeathD extends Dialogue {

    private int npcId = 14872;

    @Override
    public void start() {
	sendNPCDialogue(npcId, NORMAL, "What do you want you scum...");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Who are you?", "What are you rambling about?", "Can you teleport me?", "Nothing, nevermind.");
	    stage = 0;
	} else if (stage == 0) {
	    if (componentId == OPTION_1) {
		sendPlayerDialogue(NORMAL, "Who are you?");
		stage = 1;
	    } else if (componentId == OPTION_2) {
		sendPlayerDialogue(NORMAL, "What are you rambling about?");
		stage = 6;
	    } else if (componentId == OPTION_3) {
		sendPlayerDialogue(NORMAL, "Can you teleport me?");
		stage = 17;
	    } else if (componentId == OPTION_4) {
		sendNPCDialogue(npcId, NORMAL, "Good bye, I will enjoy taking your life in the near future...");
		stage = 20;
	    }
	} else if (stage == 1) {
	    sendNPCDialogue(npcId, NORMAL, "Me? Why I'm death.");
	    stage = 2;
	} else if (stage == 2) {
	    sendPlayerDialogue(SCARED, "That's.... IMPOSSIBLE!");
	    stage = 3;
	} else if (stage == 3) {
	    sendNPCDialogue(45802, NORMAL, "Oh really?");
	    stage = 4;
	} else if (stage == 4) {
	    sendPlayerDialogue(SCARED, "AHHHHHHHHHHHHHH!");
	    stage = 5;
	} else if (stage == 5) {
	    sendNPCDialogue(npcId, NORMAL, "Yea... I know shocker. Death is a girl. Now, I'm busy with ruining lives, so.... bug someone else.");
	    stage = 20;
	} else if (stage == 6) {
	    sendNPCDialogue(npcId, NORMAL, "I don't like your tone.... However, you could prove useful to me. I'm talking of course about the Slaughter fields!");
	    stage = 7;
	} else if (stage == 7) {
	    sendPlayerDialogue(NORMAL, "Slaughter fields? I've never heard of a place called that.");
	    stage = 8;
	} else if (stage == 8) {
	    sendNPCDialogue(npcId, NORMAL, "The death count has been low lately, so I've invested into this area called the Slaughter fields. It has four different arena setups, which would you like to talk about?");
	    stage = 9;
	} else if (stage == 9) {
	    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Free for all", "Melee only", "Range only", "Magic only", "Special zone");
	    stage = 10;
	} else if (stage == 10) {
	    if (componentId == OPTION_1) {
		sendPlayerDialogue(NORMAL, "Free for all, please.");
		stage = 11;
	    } else if (componentId == OPTION_2) {
		sendPlayerDialogue(NORMAL, "Melee only, please.");
		stage = 13;
	    } else if (componentId == OPTION_3) {
		sendPlayerDialogue(NORMAL, "Range only, please.");
		stage = 14;
	    } else if (componentId == OPTION_4) {
		sendPlayerDialogue(NORMAL, "Magic only, please.");
		stage = 15;
	    } else if (componentId == OPTION_5) {
		sendPlayerDialogue(NORMAL, "Special zone, please.");
		stage = 16;
	    }
	} else if (stage == 11) {
	    sendNPCDialogue(npcId, NORMAL, "Ahhh, my favorite...");
	    stage = 12;
	} else if (stage == 12) {
	    sendNPCDialogue(npcId, NORMAL, "All players begin in this area. The area itself has no restrictions other than no prod armours or familiars (as all areas do). This is a single combat arena. Around the area are objects, click on those to move to the next stages.");
	    stage = 20;
	} else if (stage == 13) {
	    sendNPCDialogue(npcId, NORMAL, "This area can be accessed by hitting the dummy located at the right of the ffa zone. Melee is the only acceptable style, all others will not be allowed and result in penalty.");
	    stage = 20;
	} else if (stage == 14) {
	    sendNPCDialogue(npcId, NORMAL, "This area can be accessed by hitting the target located at the left of the ffa zone. Range is the only acceptable style, all others will not be allowed and result in penalty.");
	    stage = 20;
	} else if (stage == 15) {
	    sendNPCDialogue(npcId, NORMAL, "This area can be accessed by clicking on the portal located at the left of the ffa zone. Magic is the only acceptable style, all others will not be allowed and result in penalty.");
	    stage = 20;
	} else if (stage == 16) {
	    sendNPCDialogue(npcId, NORMAL, "This area is a variation of all three zones, it has climates and random attacks. The attacks change randomly and will cause changes within the field.");
	    stage = 20;
	} else if (stage == 17) {
	    sendNPCDialogue(npcId, NORMAL, "This area is dangerous, you will lose your items if you die. Would you still like to proceed?");
	    stage = 18;
	} else if (stage == 18) {
	    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Yes, I'm fearless.", "I'm not quite ready.");
	    stage = 19;
	} else if (stage == 19) {
	    if (componentId == OPTION_1)
		player.getControlerManager().startControler("SlaughterFieldsControler");
	    end();
	} else if (stage == 20) {
	    end();
	}
    }

    @Override
    public void finish() {

    }
}
