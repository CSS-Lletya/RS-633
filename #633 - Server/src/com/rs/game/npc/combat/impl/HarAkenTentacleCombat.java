package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.utils.Utils;

public class HarAkenTentacleCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
	return new Object[] { 15209, 15210 };
    }

    @Override
    public int attack(NPC npc, Entity target) {
	final NPCCombatDefinitions defs = npc.getCombatDefinitions();
	int attackStyle = !Utils.isOnRange(npc.getX(), npc.getY(), npc.getSize(), target.getX(), target.getY(), target.getSize(), 0) ? 1 : Utils.random(2);
	switch (attackStyle) {
	    case 0:
		npc.setNextAnimation(new Animation(defs.getAttackEmote()));
		delayHit(npc, 0, target, getMeleeHit(npc, getRandomMaxHit(npc, defs.getMaxHit() - 36, NPCCombatDefinitions.MELEE, target)));
		break;
	    case 1:
		npc.setNextAnimation(new Animation(npc.getId() == 15209 ? 16253 : 16242));
		World.sendProjectile(npc, target, npc.getId() == 15209 ? 3004 : 2922, 140, 35, 80, 35, 16, 0);
		if (npc.getId() == 15209)
		    delayHit(npc, 2, target, getRangeHit(npc, getRandomMaxHit(npc, defs.getMaxHit(), NPCCombatDefinitions.RANGE, target)));
		else
		    delayHit(npc, 2, target, getMagicHit(npc, getRandomMaxHit(npc, defs.getMaxHit(), NPCCombatDefinitions.MAGE, target)));
		break;
	}
	return defs.getAttackDelay();
    }
}
