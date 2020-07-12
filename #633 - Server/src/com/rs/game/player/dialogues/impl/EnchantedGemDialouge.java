package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.Utils;

public class EnchantedGemDialouge extends Dialogue {

    private int npcId;

    @Override
    public void start() {
	npcId = (int) this.parameters[0];
	sendNPCDialogue(npcId, 9827, "'Ello and what are you after then?");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    stage = 0;
	    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "How many monsters do I have left?", "Give me a tip.", "Nothing, Nevermind.");
	} else if (stage == 0) {
	    if (componentId == OPTION_1) {
		player.getSlayerManager().checkKillsLeft();
		 end();
	    } else if (componentId == OPTION_2) {
		stage = 1;
		if (player.getSlayerManager().getCurrentTask() == null) {
		    sendNPCDialogue(npcId, 9827, "You currently don't have a task.");
		    return;
		}
		String[] tipDialouges = player.getSlayerManager().getCurrentTask().getTips();
		if (tipDialouges != null && tipDialouges.length != 0) {
		    String chosenDialouge = tipDialouges[Utils.random(tipDialouges.length)];
		    if (chosenDialouge == null || chosenDialouge.equals(""))
			sendNPCDialogue(npcId, 9827, "I don't have any tips for you currently.");
		    else
			sendNPCDialogue(npcId, 9827, chosenDialouge);
		} else
		    sendNPCDialogue(npcId, 9827, "I don't have any tips for you currently.");
	    } else
		end();
	} else if (stage == 1) {
	    end();
	}
    }

    @Override
    public void finish() {

    }
}
