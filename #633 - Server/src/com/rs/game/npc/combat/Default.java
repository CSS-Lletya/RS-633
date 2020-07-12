package com.rs.game.npc.combat;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.npc.familiar.Familiar.SpecialAttack;

public class Default extends CombatScript {

    @Override
    public Object[] getKeys() {
	return new Object[] { "Default" };
    }

    @Override
    public int attack(NPC npc, Entity target) {
	NPCCombatDefinitions defs = npc.getCombatDefinitions();
	int attackStyle = defs.getAttackStyle();
	if (npc instanceof Familiar) {
	    Familiar familiar = (Familiar) npc;
	    if (familiar.getSpecialAttack() == SpecialAttack.ENTITY && familiar.hasSpecialOn())
		if (familiar.submitSpecial(target))
		    return defs.getAttackDelay();
	}
	if (attackStyle == NPCCombatDefinitions.MELEE) {
	    delayHit(npc, 0, target, getMeleeHit(npc, getRandomMaxHit(npc, npc.getMaxHit(), attackStyle, target)));
	} else {
	    int damage = getRandomMaxHit(npc, npc.getMaxHit(), attackStyle, target);
	    delayHit(npc, 2, target, attackStyle == NPCCombatDefinitions.RANGE || attackStyle == NPCCombatDefinitions.RANGE_FOLLOW ? getRangeHit(npc, damage) : getMagicHit(npc, damage));
	    if (defs.getAttackProjectile() != -1)
		World.sendProjectile(npc, target, defs.getAttackProjectile(), 41, 16, 41, 35, 16, 0);
	}
	if (defs.getAttackGfx() != -1)
	    npc.setNextGraphics(new Graphics(defs.getAttackGfx(), 0,  attackStyle == NPCCombatDefinitions.RANGE  ? 100 : 0));
	npc.setNextAnimation(new Animation(defs.getAttackEmote()));
	return defs.getAttackDelay();
    }
}
