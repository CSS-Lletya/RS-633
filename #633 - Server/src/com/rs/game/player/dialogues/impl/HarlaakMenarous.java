package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

public class HarlaakMenarous extends Dialogue {

    private int npcId = 8267;// FUCKING TOOK FOREVER TO MAKE THIS DIALOUGE

    @Override
    public void start() {
	sendNPCDialogue(npcId, NORMAL, "Welcome to my humble guild, " + player.getDisplayName() + ".");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Quite a place you've got here. Tell me more about it.", "You any good with a sword?", "Bye!");
	    stage = 0;
	} else if (stage == 0) {
	    if (componentId == OPTION_1) {
		sendPlayerDialogue(NORMAL, "Quite a place you've got here. Tell me more about it.");
		stage = 1;
	    } else if (componentId == OPTION_2) {
		sendPlayerDialogue(NORMAL, "You any good with a sword?");
		stage = 42;
	    } else {
		sendPlayerDialogue(NORMAL, "Bye!");
		stage = 51;
	    }
	} else if (stage == 1) {
	    sendNPCDialogue(npcId, NORMAL, "Yes indeed. What would you like to know?");
	    stage = 2;
	} else if (stage == 2) {
	    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Tell me about the Strength training area.", "Tell me about the Attack training area.", "Tell me about the Defence training area.", "Tell me about the Combat training area.", "Tell me about tokens.");
	    stage = 3;
	} else if (stage == 3) {
	    if (componentId == OPTION_1) {
		sendPlayerDialogue(NORMAL, "Tell me about the Strength training area.");
		stage = 14;
	    } else if (componentId == OPTION_2) {
		sendPlayerDialogue(NORMAL, "Tell me about the Attack training area.");
		stage = 30;
	    } else if (componentId == OPTION_3) {
		sendPlayerDialogue(NORMAL, "Tell me about the Defence training area.");
		stage = 18;
	    } else if (componentId == OPTION_4) {
		sendPlayerDialogue(NORMAL, "Tell me about the Combat training area.");
		stage = 35;
	    } else if (componentId == OPTION_5) {
		sendPlayerDialogue(NORMAL, "Tell me about tokens.");
		stage = 4;
	    }
	} else if (stage == 4) {
	    sendNPCDialogue(npcId, NORMAL, "Ahh, yes! The tokens allow you to spend an amount of time with my 'discovery', located at the top floor of the guild. Now, the amount of tokens you collect from the five activites around the guild will dedicate how long Kamfreena");
	    stage = 5;
	} else if (stage == 5) {
	    sendNPCDialogue(npcId, NORMAL, "will allow you in the enclosure on the very top floor. More tokens equal more time. There are also some bonuses available should you take part in all the activities around the guild.");
	    stage = 6;
	} else if (stage == 6) {
	    sendPlayerDialogue(NORMAL, "Okay okay. So, how do I earn these tokens?");
	    stage = 7;
	} else if (stage == 7) {
	    sendNPCDialogue(npcId, NORMAL, "You can earn them by simply using the training excerises around the guild. The staff will enter your token earnings into a ledger as you play.");
	    stage = 8;
	} else if (stage == 8) {
	    sendPlayerDialogue(NORMAL, "Sounds easy enough. What are the bonuses?");
	    stage = 9;
	} else if (stage == 9) {
	    sendNPCDialogue(npcId, NORMAL, "Should you take part in all five activities around the guild you can choose to pay for your time on the top floor with tokens of all types. Should you do this then you will find yourself spending less tokens overall and have a better chance of");
	    stage = 10;
	} else if (stage == 10) {
	    sendNPCDialogue(npcId, NORMAL, "getting the dragon dagger, amongst other things.");
	    stage = 11;
	} else if (stage == 11) {
	    sendPlayerDialogue(NORMAL, "Excellent, so what's on the top floor?");
	    stage = 12;
	} else if (stage == 12) {
	    sendNPCDialogue(npcId, NORMAL, "Well, without giving up too much away, they're big and mean and you get to fight them for your defenders. If you are really lucky, they'll summon a cyclosses... although that might be unlucky. Still, if you manage to defeat him, you could win his hat. ");
	    stage = 13;
	} else if (stage == 13) {
	    sendPlayerDialogue(NORMAL, "Interesting... I'll have to go to that floor then!");
	    stage = 2;
	} else if (stage == 14) {
	    sendNPCDialogue(npcId, NORMAL, "Ahhh, the might warrior Sloane, gaurd the Strength training area. This intreguing little area consists of two shotput lanes for different weights of shot. It's fairly simple, the referee or Salone can explain more. There's");
	    stage = 15;
	} else if (stage == 15) {
	    sendNPCDialogue(npcId, NORMAL, "also the store room next door where Jimmy might share his talents with you, but don't tell him that I know he is not on gaurd duty.");
	    stage = 16;
	} else if (stage == 16) {
	    sendPlayerDialogue(NORMAL, "Oh? Why?");
	    stage = 17;
	} else if (stage == 17) {
	    sendNPCDialogue(npcId, NORMAL, "Well, he's doing no harm and let's face it, with all these warriors around, the guild is hardly ungaurded. You can find the strength area just up the stairs behind the bank.");
	    stage = 2;
	} else if (stage == 18) {
	    sendNPCDialogue(npcId, NORMAL, "To polish your defensive skills to the very heighest level, we've employed a most inventive dwarf and a catapult.");
	    stage = 19;
	} else if (stage == 19) {
	    sendPlayerDialogue(NORMAL, "Your going to throw Dwarves at me?");
	    stage = 20;
	} else if (stage == 20) {
	    sendNPCDialogue(npcId, NORMAL, "Oh my, No! I think Gamfreed would strongely object to that most strongly. ");
	    stage = 21;
	} else if (stage == 21) {
	    sendNPCDialogue(npcId, NORMAL, "He's an inventor, you see, and has built a marvelous contraption that can throw all sorts of things at you. Things such as magic missles...");
	    stage = 22;
	} else if (stage == 22) {
	    sendPlayerDialogue(NORMAL, "Mmmm?");
	    stage = 23;
	} else if (stage == 23) {
	    sendNPCDialogue(npcId, NORMAL, "... spiked iron balls...");
	    stage = 24;
	} else if (stage == 24) {
	    sendPlayerDialogue(WORRIED, "Er...");
	    stage = 25;
	} else if (stage == 25) {
	    sendNPCDialogue(npcId, NORMAL, "... spinning slashing blades...");
	    stage = 26;
	} else if (stage == 26) {
	    sendPlayerDialogue(WORRIED, "Ummmmm...");
	    stage = 27;
	} else if (stage == 27) {
	    sendNPCDialogue(npcId, NORMAL, "... and flying anvils.");
	    stage = 28;
	} else if (stage == 28) {
	    sendPlayerDialogue(WORRIED, "ANVILS?!");
	    stage = 29;
	} else if (stage == 29) {
	    sendNPCDialogue(npcId, NORMAL, "No need to be afraid, it's all under very controlled conditions! You can find it just up the stairs behind the bank.");
	    stage = 2;
	} else if (stage == 30) {
	    sendNPCDialogue(npcId, NORMAL, "Ahhh dummies.");
	    stage = 31;
	} else if (stage == 31) {
	    sendPlayerDialogue(CONFUSED, "I'm no dummy, I just want to know what is there!");
	    stage = 32;
	} else if (stage == 32) {
	    sendNPCDialogue(npcId, NORMAL, "Oh no my dear man, I did not mean it at you at all! The training area has mechinical dummies that pop up out of the holes of the floor. The noble dwarf, Gamfred, invented the mechanism and Ajjat can explain more of what to do there.");
	    stage = 33;
	} else if (stage == 33) {
	    sendPlayerDialogue(NORMAL, "Oh okay, I'll have to try it out.");
	    stage = 34;
	} else if (stage == 34) {
	    sendNPCDialogue(npcId, NORMAL, "You can find it just down the corridor and on your right.");
	    stage = 2;
	} else if (stage == 35) {
	    sendNPCDialogue(npcId, NORMAL, "Ahh, yes our resident magician from forgein lands created a most amazing gadget that can turn your own armor against you! It's really quite intreging.");
	    stage = 36;
	} else if (stage == 36) {
	    sendPlayerDialogue(NORMAL, "That sounds dangerous. What if I'm wearing it at the time?");
	    stage = 37;
	} else if (stage == 37) {
	    sendNPCDialogue(npcId, NORMAL, "So far, that hasn't happened. You need to speak to Shannomi about the specifics of the process, but as I understand it, putting a suit of armor in one of these devices will make it come to life somehow. The better the");
	    stage = 38;
	} else if (stage == 38) {
	    sendNPCDialogue(npcId, NORMAL, "armor, the harder it is to defeat.");
	    stage = 39;
	} else if (stage == 39) {
	    sendPlayerDialogue(NORMAL, "Fighting my own armor sounds weird. I could be killed by it...");
	    stage = 40;
	} else if (stage == 40) {
	    sendNPCDialogue(npcId, NORMAL, "Indeed, we have had a few causalites from warriors overstreching themselves and not knowing their limits. Start small and work up, is my motto! That and go see Lidio for some food if you need it.");
	    stage = 41;
	} else if (stage == 41) {
	    sendPlayerDialogue(NORMAL, "Okay, thanks for the warning.");
	    stage = 2;
	} else if (stage == 42) {
	    sendNPCDialogue(npcId, NORMAL, "Am I any good with a sword? Have you any clue who I am? ");
	    stage = 43;
	} else if (stage == 43) {
	    sendPlayerDialogue(NORMAL, "Not really, no.");
	    stage = 44;
	} else if (stage == 44) {
	    sendNPCDialogue(npcId, NORMAL, "Why I can beat any person alive in a rapier duel!");
	    stage = 45;
	} else if (stage == 45) {
	    sendPlayerDialogue(NORMAL, "Try me, then!");
	    stage = 47;
	} else if (stage == 47) {
	    sendNPCDialogue(npcId, NORMAL, "My dear man, I couldn't possibly duel you, I might hurt you and then what would happen to my reputation! Besides, I have this wonderful guild to run. Why don't you take a look at the various activities we have. You might even collect");
	    stage = 48;
	} else if (stage == 48) {
	    sendNPCDialogue(npcId, NORMAL, "enough tokens to be able to kill the strange beasts from the east!");
	    stage = 2;
	} else if (stage == 49) {
	    sendPlayerDialogue(NORMAL, "Bye!");
	    stage = 50;
	} else if (stage == 51) {
	    sendNPCDialogue(npcId, NORMAL, "Farewell, brave warrior, I do hope you enjoy my guild.");
	    stage = 52;
	} else if (stage == 52)
	    end();
    }

    @Override
    public void finish() {

    }

}
