package com.rs.game.npc.others;

import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.utils.Utils;

@SuppressWarnings("serial")
public class AbyssalDemon extends NPC {

    public AbyssalDemon(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
	super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
    }

    @Override
    public void processNPC() {
	super.processNPC();
	Entity target = getCombat().getTarget();
	if (target != null && Utils.isOnRange(target.getX(), target.getY(), target.getSize(), getX(), getY(), getSize(), 4) && Utils.random(50) == 0) 
		sendTeleport(Utils.random(2) == 0 ? target : this);
    }

    private void sendTeleport(Entity entity) {
	int entitySize = entity.getSize();
	for (int c = 0; c < 10; c++) {
	    int dir = Utils.random(Utils.DIRECTION_DELTA_X.length);
	    if (World.checkWalkStep(entity.getPlane(), entity.getX(), entity.getY(), dir, entitySize)) {
		entity.setNextGraphics(new Graphics(409));
		entity.setNextWorldTile(new WorldTile(getX() + Utils.DIRECTION_DELTA_X[dir], getY() + Utils.DIRECTION_DELTA_Y[dir], getPlane()));
		break;
	    }
	}
    }
}
