package com.rs.game.player.dialogues.impl;

import com.rs.game.WorldObject;
import com.rs.game.player.dialogues.Dialogue;

public class ClimbHouseStairD extends Dialogue {

    private WorldObject object;
    
    @Override
    public void start() {
	this.object = (WorldObject) parameters[0];
	sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Climb up.", "Climb down.", "Cancel");

    }
    
    @Override
    public void run(int interfaceId, int componentId) {
	end();
	if(componentId != OPTION_3)
	    player.getHouse().climbStaircase(object, componentId == OPTION_1);

    }

    @Override
    public void finish() {

    }

}
