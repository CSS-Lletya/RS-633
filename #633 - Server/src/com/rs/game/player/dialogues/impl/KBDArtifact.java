package com.rs.game.player.dialogues.impl;

import com.rs.game.WorldTile;
import com.rs.game.player.content.Magic;
import com.rs.game.player.dialogues.Dialogue;

public class KBDArtifact extends Dialogue {

    @Override
    public void start() {
	player.getInterfaceManager().sendInterface(1361);
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (componentId == 13)
	    Magic.pushLeverTeleport(player, new WorldTile(2273, 4681, 0), 827, "You activate the artefact...", "and teleport into the lair of the King Black Dragon!");
	player.stopAll();
    }

    @Override
    public void finish() {

    }

}
