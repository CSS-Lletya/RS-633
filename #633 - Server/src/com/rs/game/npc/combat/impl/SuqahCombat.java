package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class SuqahCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
	return new Object[] { "Suqah" };
    }

    @Override
    public int attack(NPC npc, final Entity target) {
	NPCCombatDefinitions defs = npc.getCombatDefinitions();
	if (Utils.getRandom(3) == 0) {// barrage
	    boolean hit = Utils.getRandom(1) == 0;
	    delayHit(npc, 2, target, getMagicHit(npc, hit ? 100 : 0));
	    WorldTasksManager.schedule(new WorldTask() {

		@Override
		public void run() {
		    target.setNextGraphics(new Graphics(369));
		    target.addFreezeDelay(5000);
		}
	    });
	} else {
	    npc.setNextAnimation(new Animation(defs.getAttackEmote()));
	    delayHit(npc, 0, target, getMeleeHit(npc, getRandomMaxHit(npc, defs.getMaxHit(), defs.getAttackStyle(), target)));
	}
	return defs.getAttackDelay();
    }
}
