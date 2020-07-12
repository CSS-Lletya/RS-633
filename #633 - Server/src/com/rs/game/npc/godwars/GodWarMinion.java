package com.rs.game.npc.godwars;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

@SuppressWarnings("serial")
public class GodWarMinion extends NPC {

    int ticks = 10;

    public GodWarMinion(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean spawned) {
	super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
    }

    @Override
    public void processNPC() {
	super.processNPC();
	if (getCombat().underCombat()) {
	    if (ticks-- == 0) {
		ticks = 10;
		getCombat().removeTarget();
	    }
	}
    }

    /*
     * gotta override else setRespawnTask override doesnt work
     */
    @Override
    public void sendDeath(Entity source) {
	final NPCCombatDefinitions defs = getCombatDefinitions();
	resetWalkSteps();
	getCombat().removeTarget();
	setNextAnimation(null);
	WorldTasksManager.schedule(new WorldTask() {
	    int loop;

	    @Override
	    public void run() {
		if (loop == 0) {
		    setNextAnimation(new Animation(defs.getDeathEmote()));
		} else if (loop >= defs.getDeathDelay()) {
		    drop();
		    reset();
		    setLocation(getRespawnTile());
		    finish();
		    setRespawnTask();
		    stop();
		}
		loop++;
	    }
	}, 0, 1);
    }

    @Override
    public void setRespawnTask() {
	if (!hasFinished()) {
	    reset();
	    setLocation(getRespawnTile());
	    finish();
	}
    }

    public void respawn() {
	setFinished(false);
	World.addNPC(this);
	setLastRegionId(0);
	World.updateEntityRegion(this);
	loadMapRegions();
	checkMultiArea();
    }

}
