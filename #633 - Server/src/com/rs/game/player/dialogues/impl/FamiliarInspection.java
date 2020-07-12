package com.rs.game.player.dialogues.impl;

import com.rs.game.WorldTile;
import com.rs.game.player.content.Magic;
import com.rs.game.player.dialogues.Dialogue;

public class FamiliarInspection extends Dialogue {

    @Override
    public void start() {
	sendOptionsDialogue("Teleport to " + parameters[0] + "?", "Yes.", "No.");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (componentId == OPTION_1)
	    Magic.sendNormalTeleportSpell(player, 1, 0, (WorldTile) parameters[1]);
	end();
    }

    @Override
    public void finish() {

    }
}
