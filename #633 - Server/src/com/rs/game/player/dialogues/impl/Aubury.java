package com.rs.game.player.dialogues.impl;

import com.rs.game.npc.NPC;
import com.rs.game.player.controllers.RuneEssenceController;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class Aubury extends Dialogue {

    private NPC npc;

    @Override
    public void start() {
	npc = (NPC) parameters[0];
	sendNPCDialogue(npc.getId(), 9827, "Do you want to buy some runes?");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	switch (stage) {
	    case -1:
		stage = 0;
		sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Yes, please.", "No thanks.", "Can you teleport me to the rune essence?");
		break;
	    case 0:
		switch (componentId) {
		    case OPTION_1:
			ShopsHandler.openShop(player, 11);
			end();
			break;
		    case OPTION_2:
			stage = -2;
			sendPlayerDialogue(9827, "No thanks.");
			break;
		    case OPTION_3:
			stage = 1;
			sendPlayerDialogue(9827, "Can you teleport me to the rune essence?");
			break;
		    default:
			end();
			break;
		}
		break;
	    case 1:
		RuneEssenceController.teleport(player, npc);
		end();
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
