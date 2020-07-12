package com.rs.game.npc.godwars.zaros;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.game.player.controllers.Controller;
import com.rs.game.player.controllers.GodWars;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

@SuppressWarnings("serial")
public class ZarosMinion extends NPC {

    public ZarosMinion(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
	super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
    }

    @Override
    public void sendDeath(final Entity source) {
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
		    if (source instanceof Player) {
			Player player = (Player) source;
			Controller controler = player.getControlerManager().getControler();
			if (controler != null && controler instanceof GodWars) {
			    GodWars godControler = (GodWars) controler;
			    godControler.incrementKillCount(4);
			}
		    }
		    drop();
		    reset();
		    setLocation(getRespawnTile());
		    finish();
		    if (!isSpawned())
			setRespawnTask();
		    stop();
		}
		loop++;
	    }
	}, 0, 1);
    }
}