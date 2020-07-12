package com.rs.game.player.dialogues.impl;

import com.rs.game.item.Item;
import com.rs.game.player.dialogues.Dialogue;

public class StrongHoldOfSecurityRewards extends Dialogue {

    private int reward;
    @Override
    public void start() {
	reward = (int) parameters[0];
	if(reward == 0)
	    sendDialogue("The box hinges and crack and appear to be forming audible words....");
	else if(reward == 1)
	    sendDialogue("The grain shifts in the sack, sighing audible words....");
	else if(reward == 2)
	    sendDialogue("The box hinges creak and appear to be forming audible words....");
	else
	    sendDialogue("As your hand touches the cradle, you hear the voices of a million dead adventurers...");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if(stage == -1) {
	    if(reward == 3) {
		sendDialogue("Welcome adventurer... you appear to have a choise...");
		stage = 1;
	    }else{
		    stage = 0;
		    if(reward == 0) 
			sendDialogue("...contragulations adventurer, you have been deemed worthy of this reward. You have also unlocked the Flap emote!");
		    else if(reward == 1) 
			sendDialogue("...contragulations adventurer, you have been deemed worthy of this reward. You have also unlocked the Slap Head emote!");
		    else if (reward == 2)
			sendDialogue("...congratulations adventurer, you have been deemed worthy of this reward. You have also unlocked the Idea emote!");
	    }
	}else if(stage == 1) {
		sendDialogue("You can choose between these two pairs of boots. They will both protect your feet in exactly same manner; however, they look very different. You can always come back and get another pair if you lose them, or even swap them for the other style!"); 
		stage = 2;
	}else if (stage == 2) {
	    sendOptionsDialogue("Choose your style of boots", "I'll take the colourful ones.", "I'll take teh fighting ones.");
	    stage = 3;
	}else if (stage == 3) {
	    boolean fancy = componentId == OPTION_1;
	    sendPlayerDialogue(9827, fancy ? "I'll take the colourful ones." : "I'll take teh fighting ones.");
	    stage = (byte) (fancy ? 4 : 5);
	}else if (stage == 4 || stage == 5) {
	    player.getInventory().addItem(new Item(stage == 4 ? 9005 : 9006));
	    stage = 0;
	    if(player.getShosRewards()[reward]) 
		sendDialogue("Enjoy your boots.");
	    else{
		sendDialogue("Congratulations! You have succefully nagivated the Stronghold of secuity and learned to secure your account. You have unlocked the 'Stamp Foot'emote. Remember to keep your account secured in the future!");
		player.getEmotesManager().unlockEmote(31);
		player.getShosRewards()[reward] = true;
	    }
	}else{
	    player.getShosRewards()[reward] = true;
	    if(reward == 0) {
		player.getInventory().addItem(new Item(995, 2000));
		player.getEmotesManager().unlockEmote(32);
	    }else if(reward == 1) {
		player.getInventory().addItem(new Item(995, 3000));
		player.getEmotesManager().unlockEmote(33);
	    }else if(reward == 2) {
				player.getInventory().addItem(new Item(995, 5000));
	 	player.getEmotesManager().unlockEmote(30);
	 	player.getPackets().sendGameMessage("You feel refreshed.");
	 	player.reset();
	    }
	    end();
	}
    }

    @Override
    public void finish() {
	

    }

}
