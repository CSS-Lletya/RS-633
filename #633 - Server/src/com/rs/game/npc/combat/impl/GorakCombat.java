package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;

public class GorakCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
	return new Object[] { "Gorak" };
    }

    @Override
    public int attack(NPC npc, Entity target) {
	NPCCombatDefinitions defs = npc.getCombatDefinitions();
	int damage = getRandomMaxHit(npc, defs.getMaxHit(), NPCCombatDefinitions.MELEE, target);
	npc.setNextAnimation(new Animation(defs.getAttackEmote()));
	delayHit(npc, 0, target, new Hit(npc, damage, HitLook.REGULAR_DAMAGE));
	return defs.getAttackDelay();
    }
}
