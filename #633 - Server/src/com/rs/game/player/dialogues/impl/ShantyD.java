package com.rs.game.player.dialogues.impl;

import com.rs.game.player.actions.thieving.Thieving;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class ShantyD extends Dialogue {

    @Override
    public void start() {
	sendNPCDialogue(836, 9827, "<p=2>Hello, effendi.");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	switch(stage) {
	    case -1:
		stage = 0;
		sendNPCDialogue(836, 9827, "<p=2>Please read the billboard poster before going into the<br>desert. It'll give you details on the dangers you can face.");
		break;
	    case 0:
		stage = 1;
		sendOptionsDialogue("Select an Option", "What is this place?", "Can I see what you have to sell, please?", "I must be going.");
		break;
	    case 1:
		switch(componentId) {
		    case OPTION_1:
			stage = 2;
			sendPlayerDialogue(9827, "<p=2>What is this place?");
			break;
		    case OPTION_2:
			stage = 15;
			sendPlayerDialogue(9827, "<p=2>Can I see what you have to sell, please?");
			break;
		    default:
			stage = 10;
			sendPlayerDialogue(9827, "<p=2>I must be going.");
			break;
			
		}
		break;
	    case 2:
		stage = 3;
		sendNPCDialogue(836, 9827, "<p=2>This is Shantay Pass. I guard this area with my men. I am<br>responsible for keeping this pass open and repaired.");
		break;
	    case 3:
		stage = 4;
		sendNPCDialogue(836, 9827, "<p=2>My men and I prevent outlaws from getting out of the<br>desert. And we stop the inexperienced from a dry death in<br>the sands. Which would you say you were?");
		break;
	    case 4:
		stage = 5;
		sendOptionsDialogue("Select an Option", "I am definitely an outlaw, prepare to die!", "I am a little inexperienced.",  "<p=2>Er, neither, I'm an adventurer.");
		break;
	    case 5:
		switch(componentId) {
		    case OPTION_1:
			stage = 6;
			sendPlayerDialogue(9827, "<p=2>I am definitely an outlaw, prepare to die!");
			break;
		    case OPTION_2:
			stage = 7;
			sendPlayerDialogue(9827, "<p=2>I am a little inexperienced.");
			break;
		    default:
			stage = 11;
			sendPlayerDialogue(9827, "<p=2>Er, neither, I'm an adventurer.");
			break;
			
		}
		break;
	    case 6:
		stage = -2;
		sendNPCDialogue(836, 9827, "<p=2>Haha, very funny...<br>Guards, arrest "+(player.getAppearence().isMale() ? "him" : "her") + "!");
		Thieving.checkGuards(player);
		break;
	    case 7:
		stage = 8;
		sendNPCDialogue(836, 9827, "<p=2>Can I recommend that you take at least one full<br>waterskin into the desert. The sun is very hot, and<br>without water to drink you may die of thirst.");
		break;
	    case 8:
		stage = 9;
		sendNPCDialogue(836, 9827, "<p=2>I see you carry a knife already on your tool belt. If your<br>waterskins are running dry, you can cut the cacti you see<br>to replenish them.");
		break;
	    case 9:
		stage = 10;
		sendPlayerDialogue(9827, "<p=2>I must be going.");
		break;
	    case 10:
		stage = -2;
		sendNPCDialogue(836, 9827, "<p=2>So long...");
		break;
	    case 11:
		stage = 12;
		sendNPCDialogue(836, 9827, "<p=2>Good, I have just the thing for the desert adventurer:<br>clothes that will keep you cool in the heat of the sun.");
		break;
	    case 12:
		stage = 13;
		sendNPCDialogue(836, 9827, "<p=2>I also sell waterskins, which will help you survive from<br>dying of thirst.");
		break;
	    case 14:
		stage = 9;
		sendNPCDialogue(836, 9827, "<p=2>And you are free to use the bank chest here. It is unwise<br>to travel the desert wearing thick and heavy armour - you<br>will only dehydrate faster.");
		break;
	    case 15:
		stage = 16;
		sendNPCDialogue(836, 9827, "<p=2>Absolutely, effendi!");
		break;
	    case 16:
		ShopsHandler.openShop(player, 92);
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
