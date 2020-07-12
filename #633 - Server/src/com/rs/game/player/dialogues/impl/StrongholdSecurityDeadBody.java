package com.rs.game.player.dialogues.impl;

import com.rs.game.Animation;
import com.rs.game.player.dialogues.Dialogue;

public class StrongholdSecurityDeadBody extends Dialogue {

    @Override
    public void start() {
	player.setNextAnimation(new Animation(881));
	player.getInventory().addItem(9004, 1);
	sendDialogue("You rummage arround in the dead explorer's bag....");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    stage = 0;
	    sendDialogue("You find a book of hand wrriten notes.");
	}else{
	    end();
	}
    }

    @Override
    public void finish() {
	

    }

}
