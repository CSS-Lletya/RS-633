package com.rs.game.player.dialogues.impl;

import com.rs.game.player.QuestManager.Quests;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class Oneiromancer extends Dialogue {

    @Override
    public void start() {
	int npcId = (Integer) parameters[0];
	if(!player.getQuestManager().completedQuest(Quests.LUNAR_DIPLOMACY)) {
	    stage = -2;
	    sendNPCDialogue(npcId, 9827, "Please come back after you have Lunar Diplomacy requiriments.");
	}else
		sendNPCDialogue(npcId, 9827, "Would you like to see my stock?");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	switch (stage) {
	    case -1:
		stage = 0;
		sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Yes, please.", "No thanks.");
		break;
	    case 0:
		if(componentId == OPTION_1)
		    ShopsHandler.openShop(player, 117);
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
