package com.rs.game.player.dialogues.impl;

import com.rs.game.player.Skills;
import com.rs.game.player.content.Slayer.SlayerMaster;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;
import com.rs.utils.Utils;

public class SlayerMasterD extends Dialogue {

    private int npcId;
    private SlayerMaster master;

    @Override
    public void start() {
	npcId = (Integer) parameters[0];
	master = (SlayerMaster) parameters[1];
	sendNPCDialogue(npcId, 9827, "'Ello and what are you after then?");
	if (player.getSlayerManager().getCurrentMaster() != master)
	    stage = 2;
	else
	    stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    if (player.getSlayerManager().getCurrentTask() != null) {
		sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "How many monsters do I have left?", "What do you have in your shop?", "Give me a tip.", "Nothing, Nevermind.");
		stage = 0;
	    } else {
		sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Please give me a task.", "What do you have in your shop?", "Nothing, Nevermind.");
		stage = 1;
	    }
	} else if (stage == 0) {
	    if (componentId == OPTION_1) {
		player.getSlayerManager().checkKillsLeft();
		end();
	    } else if (componentId == OPTION_2) {
		sendNPCDialogue(npcId, 9827, "Only the best slayer equipment money could buy. Come check it out.");
		stage = 5;
	    } else if (componentId == OPTION_3) {
		stage = 6;
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
	    if (componentId == OPTION_1) {
		player.getSlayerManager().setCurrentTask(true);
		sendNPCDialogue(npcId, 9827, "Your new assignment is: " + player.getSlayerManager().getCurrentTask().getName() + "; only " + player.getSlayerManager().getCount() + " more to go.");
		stage = 6;
	    } else if (componentId == OPTION_2) {
		sendNPCDialogue(npcId, 9827, "Only the best slayer equipment money could buy. Come check it out.");
		stage = 5;
	    } else
		end();
	} else if (stage == 2) {
	    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Can you become my master?", "What do you have in your shop?", "Nothing, Nevermind.");
	    stage = 3;
	} else if (stage == 3) {
	    if (componentId == OPTION_1) {
		stage = 6;
		if (player.getSlayerManager().getCurrentTask() != null) {
		    sendNPCDialogue(npcId, 9827, "I don't think that "+player.getSlayerManager().getCurrentMaster().toString().toLowerCase()+ " would be happy if I took one of his students just like that. Complete your task then return to me.");
		} else if (player.getSkills().getCombatLevelWithSummoning() < master.getRequiredCombatLevel())
		    sendNPCDialogue(npcId, 9827, "Your too weak overall, come back when you've become stronger.");
		else if (player.getSkills().getLevel(Skills.SLAYER) < master.getRequiredSlayerLevel()) {
		    sendNPCDialogue(npcId, 9827, "Your slayer level is too low to take on my challenges, come back when you have a level of at least "+master.getRequiredSlayerLevel()+ " slayer.");
		} else {
		    sendNPCDialogue(npcId, 9827, "You meet my requirements, so therefore I will agree to leading you. Good luck adventurer, you will need it.");
		    player.getSlayerManager().setCurrentMaster(master);
		}
	    } else if (componentId == OPTION_2) {
		stage = 5;
		sendNPCDialogue(npcId, 9827, "Only the best slayer equipment money could buy. Come check it out.");
	    } else {
		end();
	    }
	} else if (stage == 5) {
	    ShopsHandler.openShop(player, 29);
	    end();
	} else if (stage == 6) 
	    end();
    }

    @Override
    public void finish() {

    }

}
