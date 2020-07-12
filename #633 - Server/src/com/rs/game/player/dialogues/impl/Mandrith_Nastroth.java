package com.rs.game.player.dialogues.impl;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.item.Item;
import com.rs.game.player.dialogues.Dialogue;

public class Mandrith_Nastroth extends Dialogue {

	private int npcId;

	private static int ARTEFACTS[] = new int[] { 14876, 14877, 14878, 14879,
			14880, 14881, 14882, 14883, 14884, 14885, 14886, 14887, 14888,
			14889, 14890, 14891, 14892 };

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		if (player.getInventory().containsOneItem(ARTEFACTS)) {
			stage = 19;
			sendNPCDialogue(
					npcId,
					9827,
					"Glorious, brave warrior! I see you found some of the ancient artefacts my brother and I are seeking.");
			return;
		}
		sendNPCDialogue(npcId, 9827, "How can I help you?");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch (stage) {
		case -1:
			stage = 0;
			sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Who are you?",
					"Oh, sorry, I thought you were someone else.");
			break;
		case 0:
			if (componentId == OPTION_1) {
				stage = 2;
				sendPlayerDialogue(9827, "Who are you?");
			} else {
				stage = 1;
				sendPlayerDialogue(9827,
						"Oh, sorry, I thought you were someone else.");
			}
			break;
		case 1:
			stage = -2;
			sendNPCDialogue(npcId, 9827,
					"I'm not sure how you could confuse ME with anyone!");
			break;
		case 2:
			stage = 3;
			sendNPCDialogue(
					npcId,
					9827,
					"Why, I'm "
							+ NPCDefinitions.getNPCDefinitions(npcId).getName()
							+ "! Inspiration to combatants both mighty and punny! Okay... fair enough.");
			break;
		case 3:
			stage = 4;
			sendPlayerDialogue(9827, "Okay...fair enough.");
			break;
		case 4:
			stage = 5;
			sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "What do you do here?",
					"Erm, what's with the outfit?", "I have to go now.");
			break;
		case 5:
			if (componentId == OPTION_1) {
				stage = 8;
				sendPlayerDialogue(9827, "What do you do here?");
			} else if (componentId == OPTION_2) {
				stage = 6;
				sendPlayerDialogue(9827, "Erm, what's with the outfit?");
			} else {
				stage = -2;
				sendPlayerDialogue(9827, "I have to go now.");
			}
			break;
		case 6:
			stage = 7;
			sendNPCDialogue(
					npcId,
					9827,
					"You like not my kingly robes? They were my fathre's and his father's before him, and his father's before him, and his father's before him, and-");
			break;
		case 7:
			stage = -2;
			sendPlayerDialogue(9827, "Okay! Okay! I get the picture.");
			break;
		case 8:
			stage = 9;
			sendNPCDialogue(
					npcId,
					9827,
					"I am here to collect ancient artefacts, acquired by adventurers in return for some well-deserved money.");
			break;
		case 9:
			stage = 10;
			sendOptionsDialogue(DEFAULT_OPTIONS_TITLE,
					"What ancient artfacts?", "That sounds great. Goodbye.");
			break;
		case 10:
			if (componentId == OPTION_1) {
				stage = 11;
				sendPlayerDialogue(9827, "What ancient artfacts?");
			} else {
				stage = -2;
				sendPlayerDialogue(9827, "That sounds great. Goodbye.");
			}
			break;
		case 11:
			stage = 12;
			sendNPCDialogue(npcId, 9827,
					"Haha! I can tell you are new to these parts.");
			break;
		case 12:
			stage = 13;
			sendNPCDialogue(
					npcId,
					9827,
					"As the blood of warriors is spilled on the group, as it once was during God Wars, relics of that age feel the call of battle and aredrawn into rays of sun once more. If you happen to come across any of those ancient items,");
			break;
		case 13:
			stage = 14;
			sendNPCDialogue(
					npcId,
					9827,
					"bring them to me or my brother, and we will pay you a fair price for them. We don't accept them noted, thought, so remember that. Also, we dont want to buy any weapons or armour.");
			break;
		case 14:
			stage = 15;
			sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "You have a brother?",
					"Why won't you buy weapons or armour?",
					"That sounds great. Goodbye.");
			break;
		case 15:
			if (componentId == OPTION_1) {
				stage = 16;
				sendPlayerDialogue(9827, "You have a brother?");
			} else if (componentId == OPTION_2) {
				stage = 18;
				sendPlayerDialogue(9827, "Why won't you buy weapons or armour?");
			} else {
				stage = -2;
				sendPlayerDialogue(9827, "That sounds great. Goodbye.");
			}
			break;
		case 16:
			stage = 17;
			sendNPCDialogue(npcId, 9827,
					"Yes, why else would I have referred to him as such?");
			break;
		case 17:
			stage = -2;
			sendPlayerDialogue(9827, "You make a good point.");
			break;
		case 18:
			stage = -2;
			sendNPCDialogue(
					npcId,
					9827,
					"They should be used as they were meant to be used, and not traded in for money.");
			break;
		case 19:
			stage = 20;
			sendNPCDialogue(npcId, 9827,
					"You wouldn't be willing to sell them to me?");
			break;
		case 20:
			stage = 21;
			sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Sure, I can do that.",
					"No, sorry.");
			break;
		case 21:
			if (componentId == OPTION_1) {
				stage = 22;
				sendPlayerDialogue(9827, "Sure, I can do that.");
			} else {
				stage = -2;
				sendPlayerDialogue(9827, "No, sorry.");
			}
			break;
		case 22:
			stage = -2;
			int coins = 0;
			for (int i : ARTEFACTS) {
				int amt = player.getInventory().getAmountOf(i);
				if (amt != 0) {
					coins += ItemDefinitions.getItemDefinitions(i).getValue()
							* amt;
					player.getInventory().deleteItem(i, amt);
				}
			}
			player.getInventory().addItem(new Item(995, coins));
			sendDialogue("You sold the artifacts for " + coins + " coins.");
			break;
		default:
			end();
			break;
		}

	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub

	}

}
