package com.rs.game.player.dialogues.impl;

import com.rs.game.item.Item;
import com.rs.game.player.Skills;
import com.rs.game.player.dialogues.Dialogue;

public class LadyOfTheLake extends Dialogue {

    public static final boolean IGNORE_QUEST = true;

    private int npcId = 250;

    @Override
    public void start() {
	sendNPCDialogue(npcId, NORMAL, "Good day to you, " + (player.getAppearence().isMale() ? "Sir" : "Madam") + ".");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    sendOptionsDialogue("What would you like to say?", "Who are you?", "I seek the sword Excalibur.", "Goodbye.");
	    stage = 0;
	} else if (stage == 0) {
	    if (componentId == OPTION_1) {
		sendPlayerDialogue(NORMAL, "Who are you?");
		stage = 1;
	    } else if (componentId == OPTION_2) {
		sendPlayerDialogue(NORMAL, "I seek the sword Excalibur.");
		stage = 4;
	    } else {
		sendPlayerDialogue(NORMAL, "Good day.");
		stage = 14;
	    }
	} else if (stage == 1) {
	    sendNPCDialogue(npcId, NORMAL, "I am the Lady of the Lake.");
	    stage = 2;
	} else if (stage == 2) {
	    sendOptionsDialogue("What would you like to say?", "I seek the sword Excalibur.", "Goodbye.");
	    stage = 3;
	} else if (stage == 3) {
	    if (componentId == OPTION_1) {
		sendPlayerDialogue(NORMAL, "I seek the sword Excalibur.");
		stage = 4;
	    } else {
		sendPlayerDialogue(NORMAL, "Good day.");
		stage = 14;
	    }
	} else if (stage == 4) {
	    if (IGNORE_QUEST) { //player.getQuestManager().completedQuest(Quests.MERLINS_CRYSTAL)
		sendNPCDialogue(npcId, NORMAL, "I recall you have already proven yourself to be worthy of wielding it. I shall return it to you if you can prove yourself to still be worthy.");
		stage = 5;
	    } else {
		sendNPCDialogue(npcId, NORMAL, "You are not worthy of wielding this magnificent weapon.");
		stage = 14;
	    }
	} else if (stage == 5) {
	    sendPlayerDialogue(NORMAL, "And how can I do that?");
	    stage = 6;
	} else if (stage == 6) {
	    sendNPCDialogue(npcId, NORMAL, "Why, by proving yourself to be above material goods.");
	    stage = 7;
	} else if (stage == 7) {
	    sendPlayerDialogue(NORMAL, "...And how can I do that?");
	    stage = 8;
	} else if (stage == 8) {
	    sendNPCDialogue(npcId, NORMAL, "500 coins outa do it.");
	    stage = 9;
	} else if (stage == 9) {
	    if (player.getInventory().getCoinsAmount() < 500) {
		sendPlayerDialogue(NORMAL, "I don't have that kind of money.");
		stage = 11;
	    } else {
		sendPlayerDialogue(NORMAL, "Here you go.");
		stage = 10;
	    }
	} else if (stage == 10) {
	    sendNPCDialogue(npcId, NORMAL, "Thanks. I'm saving up for a new dress!");
	    stage = 12;
	} else if (stage == 11) {
	    sendNPCDialogue(npcId, NORMAL, "Well then, come back when you do.");
	    stage = 14;
	} else if (stage == 12) {
	    player.getInventory().deleteItem(new Item(995, 500));
	    int itemId = player.getSkills().hasRequiriments(Skills.COOKING, 80, Skills.FLETCHING, 80, Skills.FISHING, 76, Skills.FIREMAKING, 75, Skills.DEFENCE, 70, Skills.PRAYER, 70, Skills.WOODCUTTING, 60, Skills.MAGIC, 56, Skills.RANGE, 39, Skills.AGILITY, 36, Skills.STRENGTH, 22) ? 14632 : 35;
	    player.getInventory().addItemDrop(itemId, 1);
	    sendEntityDialogue(IS_ITEM, "", itemId, -1, "The Lady of the Lake hands you an " + (itemId == 35 ? "Excalibur" : "Enhanced Excalibur") + ".");
	    stage = 14;
	} else if (stage == 14) {
	    end();
	}
    }

    @Override
    public void finish() {

    }
}
