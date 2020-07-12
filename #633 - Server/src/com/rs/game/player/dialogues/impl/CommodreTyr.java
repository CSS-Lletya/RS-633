package com.rs.game.player.dialogues.impl;

import com.rs.game.item.Item;
import com.rs.game.player.QuestManager.Quests;
import com.rs.game.player.dialogues.Dialogue;

public class CommodreTyr extends Dialogue {

    int npcId;

    @Override
    public void start() {
	npcId = (Integer) parameters[0];
	if (!player.getQuestManager().completedQuest(Quests.VOID_STARES_BACK)) {
	    player.getPackets().sendGameMessage("The knight ignores you, perhaps you can get his attention some other way.");
	    end();
	    return;
	}
	sendPlayerDialogue(9827, "Commodre Tyr.");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    stage = 0;
	    sendNPCDialogue(npcId, 9827, "O 1k wishes, it's good to see you. What can I do for you?");
	} else if (stage == 0) {
	    stage = 1;
	    sendPlayerDialogue(9827, "I've lost Korasi's sword.");
	} else if (stage == 1) {
	    stage = 2;
	    sendNPCDialogue(npcId, 9827, "Really? Well let's take a look...");
	} else if (stage == 2) {
	    stage = 3;
	    sendNPCDialogue(npcId, 9827, "Ah yes, it's returned home. I can give you it to you again, but I'll have to ask you for 250,000 coins to honour those who died in the Pest Queen conflict.");
	} else if (stage == 3) {
	    stage = 4;
	    sendOptionsDialogue("Will you pay 250,000 coins to retreive the sword?", "Yes.", "No.");
	} else if (stage == 4) {
	    stage = 5;
	    if (componentId == OPTION_1) {
		if (player.getInventory().getCoinsAmount() >= 250000) {
		    sendNPCDialogue(npcId, 9827, "Korasi's sword is now once yours again. Look after it.");
		    player.getInventory().deleteItem(new Item(995, 250000));
		    player.getInventory().addItem(new Item(19784));
		} else
		    sendNPCDialogue(npcId, 9827, "It seems that you cannot affored to pay in honour of this omen. Come back when you can affored it.");
	    } else {
		sendPlayerDialogue(9827, "No thank you.");
	    }
	} else if (stage == 5) {
	    end();
	}
    }

    @Override
    public void finish() {

    }
}
