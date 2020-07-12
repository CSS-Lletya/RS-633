package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.utils.Utils;

public class SkeletalWyvernCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
	return new Object[] { 3068, 3069, 3070, 3071 };
    }

    private static boolean hasShield(Entity target) {
	if(!(target instanceof Player))
	    return true;
	int shieldId = ((Player) target).getEquipment().getShieldId();
	return shieldId == 2890 || shieldId == 9731 || shieldId == 20436 || shieldId == 20438 || shieldId == 18691 || (shieldId >= 11283 && shieldId <= 12285);
    }
    
    @Override
    public int attack(NPC npc, Entity target) {
	NPCCombatDefinitions defs = npc.getCombatDefinitions();
	int attackStyle = Utils.random(Utils.isOnRange(npc.getX(), npc.getY(), npc.getSize(), target.getX(), target.getY(), target.getSize(), 0) ? 3 : 2);
	switch(attackStyle) {
	    case 0:
		npc.setNextAnimation(new Animation(1592));
		npc.setNextGraphics(new Graphics(501));
		target.setNextGraphics(new Graphics(502));
		if(Utils.random(10) == 0)
		    target.addFreezeDelay(5000);
		delayHit(npc, 1, target, getRegularHit(npc, Utils.getRandom(hasShield(target) ? 150 : 600)));
		break;
	    case 1:
		npc.setNextAnimation(new Animation(1593));
		npc.setNextGraphics(new Graphics(499));
		delayHit(npc, 1, target, getRangeHit(npc, getRandomMaxHit(npc, defs.getMaxHit(), NPCCombatDefinitions.RANGE, target)));
		break;
	    case 2:
		npc.setNextAnimation(new Animation(1589 + Utils.random(2)));
		delayHit(npc, 0, target, getMeleeHit(npc, getRandomMaxHit(npc, defs.getMaxHit(), NPCCombatDefinitions.MELEE, target)));
		break;
	}
	return defs.getAttackDelay();
    }

}
