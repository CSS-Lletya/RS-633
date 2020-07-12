package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public class SpiritualMage extends CombatScript {

    @Override
    public Object[] getKeys() {
	return new Object[] { 6257, 6221, 6278 };
    }

    @Override
    public int attack(NPC npc, final Entity target) {
	final NPCCombatDefinitions defs = npc.getCombatDefinitions();
	npc.setNextAnimation(new Animation(defs.getAttackEmote()));
	int damage = getRandomMaxHit(npc, defs.getMaxHit(), NPCCombatDefinitions.MAGE, target);
	npc.setNextGraphics(new Graphics(defs.getAttackGfx()));
	delayHit(npc, 2, target, getMagicHit(npc, damage));
	if (damage > 0) {
	    WorldTasksManager.schedule(new WorldTask() {

		@Override
		public void run() {
		    target.setNextGraphics(new Graphics(defs.getAttackProjectile()));
		}
	    }, 2);
	}
	return defs.getAttackDelay() + 2;
    }

}
