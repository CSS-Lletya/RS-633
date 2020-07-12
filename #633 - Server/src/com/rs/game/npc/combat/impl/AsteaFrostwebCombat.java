package com.rs.game.npc.combat.impl;

import java.util.ArrayList;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.npc.dungeonnering.AsteaFrostweb;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class AsteaFrostwebCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
	return new Object[] { "Astea Frostweb" };
    }

    @Override
    public int attack(final NPC npc, final Entity target) {
	final NPCCombatDefinitions defs = npc.getCombatDefinitions();
	if (Utils.getRandom(10) == 0) {
	    AsteaFrostweb boss = (AsteaFrostweb) npc;
	    boss.spawnSpider();
	}
	if (Utils.getRandom(10) == 0) { // spikes
	    ArrayList<Entity> possibleTargets = npc.getPossibleTargets();
	    npc.setNextAnimation(new Animation(defs.getAttackEmote()));
	    for (Entity t : possibleTargets)
		delayHit(npc, 1, t, new Hit(npc, Utils.getRandom(npc.getMaxHit()), HitLook.REGULAR_DAMAGE));
	    return defs.getAttackDelay();
	} else {
	    int attackStyle = Utils.getRandom(1);
	    if (attackStyle == 1) { // check melee
		if (Utils.getDistance(npc.getX(), npc.getY(), target.getX(), target.getY()) > 1)
		    attackStyle = 0; // set mage
		else { // melee
		    npc.setNextAnimation(new Animation(defs.getAttackEmote()));
		    delayHit(npc, 0, target, getMeleeHit(npc, getRandomMaxHit(npc, npc.getMaxHit(), NPCCombatDefinitions.MELEE, target)));
		    return defs.getAttackDelay();
		}
	    }
	    if (attackStyle == 0) { // mage
		npc.setNextAnimation(new Animation(defs.getAttackEmote()));
		ArrayList<Entity> possibleTargets = npc.getPossibleTargets();

		int d = getRandomMaxHit(npc, npc.getMaxHit(), NPCCombatDefinitions.MAGE, target);
		delayHit(npc, 1, target, getMagicHit(npc, d));
		if (d != 0) {
		    WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {
			    if (target.getFreezeDelay() >= Utils.currentTimeMillis())
				target.setNextGraphics(new Graphics(1677, 0, 100));
			    else {
				target.setNextGraphics(new Graphics(369));
				target.addFreezeDelay(10000);
			    }
			}
		    }, 1);
		    for (final Entity t : possibleTargets) {
			if (t != target && t.withinDistance(target, 2)) {
			    int damage = getRandomMaxHit(npc, npc.getMaxHit(), NPCCombatDefinitions.MAGE, t);
			    delayHit(npc, 1, t, getMagicHit(npc, damage));
			    if (damage != 0) {
				WorldTasksManager.schedule(new WorldTask() {
				    @Override
				    public void run() {
					if (t.getFreezeDelay() >= Utils.currentTimeMillis())
					    t.setNextGraphics(new Graphics(1677, 0, 100));
					else {
					    t.setNextGraphics(new Graphics(369));
					    t.addFreezeDelay(10000);
					}
				    }
				}, 1);
			    }

			}
		    }
		}
		if (Utils.getDistance(npc.getX(), npc.getY(), target.getX(), target.getY()) <= 1) { // lure
												    // after
												    // freeze
		    npc.resetWalkSteps();
		    npc.addWalkSteps(target.getX() + Utils.getRandom(2), target.getY() + Utils.getRandom(2));
		}
	    }
	}
	return defs.getAttackDelay();
    }
}
