package com.rs.game.player.dialogues.impl;

import com.rs.game.player.content.CarrierTravel;
import com.rs.game.player.content.CarrierTravel.Carrier;
import com.rs.game.player.dialogues.Dialogue;

public class QuickCharter extends Dialogue {

    private Carrier ship;
    private int stage;

    @Override
    public void start() {
	ship = (Carrier) parameters[0];
	if (ship == null) // shouldn't happen but just incase
	    end();
	sendDialogue("To sail to " + ship.getFixedName(false) + " from here will cost you " + parameters[1] + " gold. Are you sure you want to pay that?");
	stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Okay", "Choose Again", "No");
	    stage = 0;
	} else {
	    if (componentId == OPTION_1)
		CarrierTravel.sendCarrier(player, ship, false);
	    else if (componentId == OPTION_2)
		CarrierTravel.openCharterInterface(player);
	    end();
	}
    }

    @Override
    public void finish() {

    }
}
