package com.rs.game.player.dialogues.impl;

import com.rs.game.player.content.CarrierTravel;
import com.rs.game.player.content.CarrierTravel.Carrier;
import com.rs.game.player.dialogues.Dialogue;

public class BoatingDialouge extends Dialogue {

    private int npcId, cost;
    private boolean returning;
    private Carrier ship;

    @Override
    public void start() {
	npcId = (Integer) parameters[0];
	sendNPCDialogue(npcId, 9827, "Hello adventurer, how can I help you today?");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    stage = 0;
	    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Where does this boat take me?", "Nothing, nevermind.");
	} else if (stage == 0) {
	    if (componentId == OPTION_1) {
		stage = 1;
		sendPlayerDialogue(9827, "Where does this boat take me?");
	    } else {
		sendPlayerDialogue(9827, "Nothing, nevermind.");
		stage = 4;
	    }
	} else if (stage == 1) {
	    stage = 2;
	    Object[] attributes = getBoatForShip(npcId);
	    if (attributes == null) {
		end();
		return;
	    }
	    ship = (Carrier) attributes[0];
	    returning = (Boolean) attributes[1];
	    cost = ship.getCosts()[0];
	    if (cost == -1)
		sendNPCDialogue(npcId, 9827, "This boat? Why this boat takes you to " + ship.getFixedName(returning) + ".");
	    else
		sendNPCDialogue(npcId, 9827, "This boat? Why this boat takes you to " + ship.getFixedName(returning) + ", for a small fee of " + cost + " coins.");
	} else if (stage == 2) {
	    if (cost != -1)
		sendOptionsDialogue("Pay the price of " + cost + " coins?", "Yes, board the ship.", "I can't affored that!");
	    else
		sendOptionsDialogue("Board the ship?", "Yes, board the ship.", "No, sometime later.");
	    stage = 3;
	} else if (stage == 3) {
	    if (componentId == OPTION_1)
		CarrierTravel.sendCarrier(player, ship, returning);
	    end();
	} else if (stage == 4) {
	    sendNPCDialogue(npcId, 9827, "Oh alright then, have a splended day.");
	    stage = 5;
	} else if (stage == 5) {
	    end();
	}
    }

    public static Object[] getBoatForShip(int npcId) {
	switch (npcId) {
	    case 376:
	    case 377:
	    case 378:
		return new Object[] { Carrier.Karamja_Fare, false };
	    case 381:
		return new Object[] { Carrier.Karamja_Fare, true };
	    case 744:
		return new Object[] { Carrier.Cranador_Fare, false };
	    case 2728:
	    case 2729:
	    case 657:
		return new Object[] { Carrier.Etrana_Fare, false };
	    case 2730:
		return new Object[] { Carrier.Etrana_Fare, true };
	    case 3801:
		return new Object[] { Carrier.Void_Outpost_Fare, false };
	    case 3800:
		return new Object[] { Carrier.Void_Outpost_Fare, true };
	    case 4962:
		return new Object[] { Carrier.Brimhaven_Fare, false };
	    case 380:
		return new Object[] { Carrier.Brimhaven_Fare, true };
	    case 5482:
		return new Object[] { Carrier.Jatizo, true };
	    case 5481:
		return new Object[] { Carrier.Jatizo, false };
	    case 5508:
		return new Object[] { Carrier.Neitznot, false };
	    case 5507:
		return new Object[] { Carrier.Neitznot, true };
	    case 1304:
		return new Object[] { Carrier.Miscellenia, false };
	    case 1385:
		return new Object[] { Carrier.Miscellenia, true };
	    case 413:
		return new Object[] { Carrier.Pirates_Cove, false };
	    case 4537:
		return new Object[] { Carrier.Pirates_Cove, true };
	    case 2437:
		return new Object[] { Carrier.Waterbirth, false };
	    case 2438:
		return new Object[] { Carrier.Waterbirth, true };
	}
	return null;
    }

    @Override
    public void finish() {

    }
}
