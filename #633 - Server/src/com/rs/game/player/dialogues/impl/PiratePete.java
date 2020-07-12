package com.rs.game.player.dialogues.impl;

import com.rs.game.Animation;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.player.content.FadingScreen;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public class PiratePete extends Dialogue {

    private NPC npc;
    private boolean isBraindeadIsland = false;

    @Override
    public void start() {
	npc = (NPC) this.parameters[0];
	isBraindeadIsland = npc.getId() == 2826;
	sendNPCDialogue(npc.getId(), NORMAL, "Are you ready to travel to " + (isBraindeadIsland ? "Port Phasmatys" : "Braindead Island") + "?");
	stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    sendOptionsDialogue("Would you like to travel?", "Yes. What are we waiting for?", "No, it seems too dangerous.");
	    stage = 0;
	} else if (stage == 0) {
	    if (componentId == OPTION_1) {
		sendPlayerDialogue(NORMAL, "Yes. What are we waiting for?");
		stage = 1;
	    } else {
		sendPlayerDialogue(WORRIED, "No, it seems too dangerous");
		stage = 2;
	    }
	} else if (stage == 1) {
	    sendNPCDialogue(npc.getId(), NORMAL, "Certainly, by the way you have a spider in your hair.");
	    stage = 3;
	} else if (stage == 2) {
	    stage = 8;
	    sendNPCDialogue(npc.getId(), NORMAL, "Alright then, just come again if you would like to travel.");
	} else if (stage == 3) {
	    sendPlayerDialogue(WORRIED, "Oh no! Get it out. Get it out!");
	    stage = 4;
	} else if (stage == 4) {
	    sendNPCDialogue(npc.getId(), NORMAL, "Sure. But quickly, close your eyes!");
	    hideContinueOption(IS_NPC);
	    stage = 5;
	    player.lock();
	    npc.setNextAnimation(new Animation(422));
	    npc.setNextForceTalk(new ForceTalk("*Hehehee*"));
	    player.setNextGraphics(new Graphics(80, 5, 60));
	    final WorldTile tile = isBraindeadIsland ? new WorldTile(3680, 3536, 0) : new WorldTile(2162, 5115, 1);
	    WorldTasksManager.schedule(new WorldTask() {

		@Override
		public void run() {
		    FadingScreen.fade(player, 3000, new Runnable() {

			@Override
			public void run() {
			    player.unlock();
			    sendNPCDialogue(npc.getId(), NORMAL, "Wake up... we have arrived!");
			    player.setNextWorldTile(tile);
			}
		    });
		}
	    });
	} else if (stage == 5) {
	    sendPlayerDialogue(DRUNK, "Oohhh... my head...");
	    stage = 6;
	} else if (stage == 6) {
	    sendNPCDialogue(npc.getId(), NORMAL, "I hit you in the hea... I mean.. *err* you slipped and fell on the dock. Its slippery ya know!");
	    stage = 7;
	} else if (stage == 7) {
	    sendNPCDialogue(npc.getId(), NORMAL, "Anyways, be off now. You seem to have recovered from the fall.");
	    stage = 8;
	} else if (stage == 8) {
	    sendPlayerDialogue(NORMAL, "Oh... alright then. Thank you for the lift.");
	    stage = 9;
	} else if (stage == 9) {
	    end();
	}
    }

    @Override
    public void finish() {

    }
}
