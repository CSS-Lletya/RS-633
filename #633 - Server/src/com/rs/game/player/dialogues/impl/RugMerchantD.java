package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

public class RugMerchantD extends Dialogue {

    @SuppressWarnings("unused")
    private int location;
    @Override
    public void start() {
	location = (int) parameters[1];
	if((boolean) parameters[0])
	    sendTravelOptions();
	else
	    sendPlayerDialogue(9827, "<p=2>Hello.");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	switch(stage) {
	    case -1:
		stage = 0;
		sendNPCDialogue(2291, 9827, "Greetings, desert traveller. Do you require the services of Ali Morrisane's flying carpet fleet?");
		break;
	    case 0:
		stage = 1;
		sendOptionsDialogue("Choose an option:", "Tell me about Ali Morrisane.", "Tell me about this magic carpet fleet.", "Yes.", "No.");
		break;
	    case 1:
		switch(componentId) {
		    case OPTION_1:
			stage = 2;
			sendPlayerDialogue(9827, "<p=2>Tell me about Ali Morrisane.");
			break;
		    case OPTION_2:
			stage = 12;
			sendPlayerDialogue(9827, "<p=2>Tell me about this magic carpet fleet.");
			break;
		    case OPTION_3:
			stage = 16;
			sendNPCDialogue(2291, 9827, "<p=2>From here you can travel to Uzer, the Bedabin Camp or to<br>north Pollnivneach.");
			break;
		    default:
			stage = -2;
			sendPlayerDialogue(9827, "No.");
			break;
		}
		break;
	    case 2:
		stage = 3;
		sendNPCDialogue(2291, 9827, "<p=13>What? You haven't heard of Ali Morrisane? Possibly the<br>greatest salesman in all the Kharidian Desert, if not all<br>RuneScape?");
		break;
	    case 3:
		stage = 4;
		sendPlayerDialogue(9827, "<p=2>I can't say that I have, but he must be the ambitious type<br>to set up his own airline.");
		break;
	    case 4:
		stage = 5;
		sendNPCDialogue(2291, 9827, "<p=2>I reckon that he's trying to take on those gnomes at their<br>own game, and I'd bet good money that he'll probably win.");
		break;
	    case 5:
		stage = 6;
		sendPlayerDialogue(9827, "<p=2>Huh? You've lost me.");
		break;
	    case 6:
		stage = 7;
		sendNPCDialogue(2291, 9827, "<p=2>You know, the little guys...the ones that aren't dwarves.");
		break;
	    case 7:
		stage = 8;
		sendPlayerDialogue(9827, "<p=2>Yeah, gnomes - I'm with you that far.");
		break;
	    case 8:
		stage = 9;
		sendNPCDialogue(2291, 9827, "<p=2>Well, they have already established Gnome Air...");
		break;
	    case 9:
		stage = 10;
		sendPlayerDialogue(9827, "<p=2>Go on.");
		break;
	    case 10:
		stage = 11;
		sendNPCDialogue(2291, 9827, "<p=2>Anyway, I think Ali M's setup here will prove really<br>successful, and maybe once we're properly established we<br>could compete with those gnomes.");
		break;
	    case 11:
		stage = -2;
		sendPlayerDialogue(9827, "<p=2>I'll watch this space.");
		break;
	    case 12:
		stage = 13;
		sendNPCDialogue(2291, 9827, "<p=2>The latest idea from the great Ali Morrisane. Desert<br>travel will never be the same again.");
		break;
	    case 13:
		stage = 14;
		sendPlayerDialogue(9827, "<p=2>So how does it work?");
		break;
	    case 14:
		stage = 15;
		sendNPCDialogue(2291, 9827, "<p=2>The carpet or the whole enterprise?");
		break;
	    case 15:
		stage = -2;
		sendPlayerDialogue(9827, "Nevermind.");
		break;
	    case 16:
		stage = 17;
		sendNPCDialogue(2291, 9827, "<p=2>The second major carpet hub station in south Pollnivneach<br>is in easy walking distance from there.");
		break;
	    case 17:
		sendTravelOptions();
		break;
	    case 18:
		switch(componentId) {
		    case OPTION_1:
			
			break;
		}
	    default:
		end();
		break;
	}
    }
    
    private void sendTravelOptions() {
	stage = 18;
	sendOptionsDialogue("Where do you wish to travel?", "I want to travel to Uzer.", "I want to travel to the Bedabin Camp.", "I want to travel to north Pollnivneach.", "I don't want to travel any of those places.");
    }

    @Override
    public void finish() {

    }

}
