package com.rs.game.npc.dungeonnering;

import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.player.content.dungeoneering.DungeonManager;

@SuppressWarnings("serial")
public class DungeonNPC extends NPC {

    protected DungeonManager manager;
    private int[] bonuses;

    public DungeonNPC(int id, WorldTile tile, DungeonManager manager) {
	super(id, tile, -1, true, true);
	this.manager = manager;
	if (getCombatLevel() != 0) {
	    int level = manager.getTargetLevel(this instanceof DungeonBoss);
	    setCombatLevel(level);
	    setHitpoints(getMaxHitpoints());
	    bonuses = manager.getBonuses(this instanceof DungeonBoss, level);
	}
	setForceMultiArea(true);
    }

    @Override
    public int getMaxHitpoints() {
	return (getCombatLevel() * 10) + 1;
    }

    public int getMaxHit() {
	return getCombatLevel();
    }

    @Override
    public int[] getBonuses() {
	return bonuses == null ? this.getBonuses() : bonuses;
    }

}
