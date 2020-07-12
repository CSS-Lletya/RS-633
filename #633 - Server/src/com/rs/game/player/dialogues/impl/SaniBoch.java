package com.rs.game.player.dialogues.impl;

import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.player.dialogues.Dialogue;

public class SaniBoch extends Dialogue {

	int npcId = 1595;
	boolean clickedObject = false;

	@Override
	public void start() {
		clickedObject = (boolean) parameters[0];
		if (clickedObject) {
			if (player.getTemporaryAttributtes().get("payed_saniboch") == null) {
				sendNPCDialogue(npcId, MAD,
						"Hey! You can't go in there without paying.");
				stage = 5;
			} else {
				player.useStairs(-1, new WorldTile(2710, 9564, 0), 1, 2);
				player.getTemporaryAttributtes().remove("payed_saniboch");
				end();
			}
		} else {
			if (player.getInventory().getCoinsAmount() < 875) {
				sendPlayerDialogue(NORMAL,
						"I don't have any money at the moment.");
				stage = 2;
			} else {
				sendPlayerDialogue(NORMAL, "Here you go.");
				stage = 0;
			}
		}
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == 0) {
			sendItemDialogue(995, "You hand Saniboch 875 coins.");
			player.getInventory().deleteItem(new Item(995, 875));
			player.getTemporaryAttributtes().put("payed_saniboch", true);
			stage = 1;
		} else if (stage == 1) {
			sendNPCDialogue(npcId, NORMAL,
					"Many thanks. You may now pass the door, may your death be a glorious one.");
			stage = 5;
		} else if (stage == 2) {
			sendNPCDialogue(
					npcId,
					NORMAL,
					"Well this is a dungeon for the more wealthy discerning adventuruer, be gone with you riff raff.");
			stage = 3;
		} else if (stage == 3) {
			sendPlayerDialogue(NORMAL,
					"But you don't even have clothes, how can you seriously call anyone riff raff?");
			stage = 4;
		} else if (stage == 4) {
			sendNPCDialogue(npcId, NORMAL, "Humpfff.");
			stage = 5;
		} else if (stage == 5) {
			end();
		}
	}

	@Override
	public void finish() {

	}
}
