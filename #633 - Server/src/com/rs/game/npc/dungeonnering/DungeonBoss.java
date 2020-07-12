package com.rs.game.npc.dungeonnering;

import com.rs.game.Entity;
import com.rs.game.WorldTile;
import com.rs.game.player.content.dungeoneering.DungeonManager;
import com.rs.game.player.content.dungeoneering.RoomReference;

@SuppressWarnings("serial")
public class DungeonBoss extends DungeonNPC {

    private RoomReference reference;

    public DungeonBoss(int id, WorldTile tile, DungeonManager manager, RoomReference reference) {
	super(id, tile, manager);
	this.reference = reference;
	setForceAgressive(true);
    }

    @Override
    public void sendDeath(Entity source) {
	super.sendDeath(source);
	manager.openStairs(reference);
    }

}
