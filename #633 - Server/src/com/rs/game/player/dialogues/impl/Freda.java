package com.rs.game.player.dialogues.impl;

import com.rs.game.item.Item;
import com.rs.game.player.dialogues.Dialogue;

public class Freda extends Dialogue {

    private int npcId = 15099;

    @Override
    public void start() {
	sendPlayerDialogue(NORMAL, "Hello.");
	stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    sendNPCDialogue(npcId, NORMAL, "Well hello there! My, your a cheerful one! How can I help you?");
	    stage = 0;
	} else if (stage == 0) {
	    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Who are you?", "Aren't you afraid of the trolls up here?", "Can I purchase those boots?", "That's all, thanks.");
	    stage = 1;
	} else if (stage == 1) {
	    if (componentId == OPTION_1) {
		sendNPCDialogue(npcId, SAD, "I'm Freda, welcome to my humble home!", "My husband, Sabbot, and I came here to start a trading post. You know, selling dwarven arms to the Gaurds.", "Then the trolls came and took over the platue before we could get established, so I came to live here.");
		stage = 2;
	    } else if (componentId == OPTION_2) {
		stage = 4;
		sendNPCDialogue(npcId, NORMAL, "Not at all. There used to be a few around here, but I soon dealt with them.");
	    } else if (componentId == OPTION_3) {
		stage = 13;
		sendPlayerDialogue(NORMAL, "What are those boots you are wearing?");
	    } else
		end();
	} else if (stage == 2) {
	    sendPlayerDialogue(NORMAL, "What about your husband?");
	    stage = 3;
	} else if (stage == 3) {
	    sendNPCDialogue(npcId, NORMAL, "That stubborn old mule won't leave the cave we were into! He'd rather die than let the trolls win.", "I send him soup and letters now and then, and those nice men in town make sure he's okay.", "Is there anything else you want?");
	    stage = 0;
	} else if (stage == 4) {
	    sendPlayerDialogue(NORMAL, "How? Aren't trolls really fierce in combat?");
	    stage = 5;
	} else if (stage == 5) {
	    sendNPCDialogue(npcId, NORMAL, "Yes, but I'm fiercer!");
	    stage = 6;
	} else if (stage == 6) {
	    sendNPCDialogue(npcId, NORMAL, "I'll have you know I've not been a trader all my life. I do know which end of an axe will do the most damage to a troll.");
	    stage = 7;
	} else if (stage == 7) {
	    sendNPCDialogue(npcId, NORMAL, "Besides, some of those nice you men fro mtown give me a hand if the trolls come in numbers. But after the last time the trolls seem to have got the hint.");
	    stage = 8;
	} else if (stage == 8) {
	    sendNPCDialogue(npcId, NORMAL, "It's astonishing what waving an axe at groin height will do to break the will of even the biggest troll!");
	    stage = 9;
	} else if (stage == 9) {
	    sendPlayerDialogue(NORMAL, "So why don't you live with your husband then?");
	    stage = 10;
	} else if (stage == 10) {
	    sendNPCDialogue(npcId, NORMAL, "Well, I can take on the occasional wandering troll, but a whole horde of them is something else entirely.");
	    stage = 11;
	} else if (stage == 11) {
	    sendNPCDialogue(npcId, NORMAL, "This place may not be that safe, but at least it's not the middle of a warzone.");
	    stage = 12;
	} else if (stage == 12) {
	    sendNPCDialogue(npcId, NORMAL, "Anything else I can help you with?");
	    stage = 0;
	} else if (stage == 13) {
	    sendNPCDialogue(npcId, NORMAL, "Oh these things, I made them during our merchanting days in order to sell to the local soldiers.");
	    stage = 14;
	} else if (stage == 14) {
	    sendNPCDialogue(npcId, NORMAL, "Unfortuntely, the heard of trolls scared the buisness out of this land.");
	    stage = 15;
	} else if (stage == 15) {
	    sendNPCDialogue(npcId, NORMAL, "Would you be interested in buying a pair for 12 coins?");
	    stage = 16;
	} else if (stage == 16) {
	    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Yes.", "No.");
	    stage = 17;
	} else if (stage == 17) {
	    if (componentId == OPTION_1) {
		if (player.getInventory().getCoinsAmount() > 22500) {
		    sendPlayerDialogue(NORMAL, "Yes, please!");
		    player.getInventory().deleteItem(new Item(995, 22500));
		    stage = 18;
		} else {
		    sendPlayerDialogue(SAD, "I would... but I don't have enough coins.");
		    stage = 20;
		}
	    } else {
		sendNPCDialogue(npcId, NORMAL, "Oh, alright then. Anything else I can help you with?");
		stage = 0;
	    }
	} else if (stage == 18) {
	    sendNPCDialogue(npcId, NORMAL, "Here you are doll... They look like they fit perfectly!");
	    player.getInventory().addItem(3105, 1);
	    stage = 19;
	} else if (stage == 19) {
	    sendPlayerDialogue(NORMAL, "Hopefully they will, thank you.");
	    stage = 12;
	} else if (stage == 20) {
	    sendNPCDialogue(npcId, NORMAL, "Oh, well then... Come back when you have the appropriate amount of coins.");
	    stage = 12;
	}
    }

    @Override
    public void finish() {

    }
}
