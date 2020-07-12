package com.rs.game.npc.others;

import com.rs.game.Entity;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;

@SuppressWarnings("serial")
public class RockCrabs extends NPC {

    private int realId;
    public RockCrabs(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean spawned) {
	super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
	realId = id;
	setForceAgressive(true); //to ignore combat lvl
    }
    
    @Override
    public void setTarget(Entity entity) {
	if(realId == getId()) {
	    this.setNextNPCTransformation(realId-1);
	    setHitpoints(getMaxHitpoints()); //rock/bulders have no hp
	}
	super.setTarget(entity);
    }
    
    @Override
    public void reset() {
	setNPC(realId);
	super.reset();
    }
    
}
