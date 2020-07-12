package com.rs.game.player.dialogues.impl;

import com.rs.game.item.Item;
import com.rs.game.player.QuestManager.Quests;
import com.rs.game.player.dialogues.Dialogue;

public class Dimintheis extends Dialogue {

    @Override
    public void start() {
	int npcId = (Integer) parameters[0];
	if(!player.getQuestManager().completedQuest(Quests.FAMILY_CREST)) {
	    stage = -2;
	    sendNPCDialogue(npcId, 9827, "Please come back after you have Family Crest requiriments.");
	}else
		sendNPCDialogue(npcId, 9827, "I've found some gloves on my garden. Want me to lend you them?");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	switch (stage) {
	    case -1:
		stage = 0;
		sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Yes, please.", "No thanks.");
		break;
	    case 0:
		if(componentId == OPTION_1) {
		    player.getInventory().addItem(new Item(775, 1));
		    player.getInventory().addItem(new Item(776, 1));
		    player.getInventory().addItem(new Item(777, 1));
		    player.getInventory().addItem(new Item(778, 1));
		}
		end();
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
