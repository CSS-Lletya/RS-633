package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.utils.Utils;

public class Kreearra extends CombatScript {

    @Override
    public Object[] getKeys() {
	return new Object[] { 6222 };
    }

    @Override
    public int attack(NPC npc, Entity target) {
	final NPCCombatDefinitions defs = npc.getCombatDefinitions();
	if (!npc.isUnderCombat()) {
	    npc.setNextAnimation(new Animation(17396));
	    delayHit(npc, 1, target, getMeleeHit(npc, getRandomMaxHit(npc, 260, NPCCombatDefinitions.MELEE, target)));
	    return defs.getAttackDelay();
	}
	npc.setNextAnimation(new Animation(17397));
	npc.setNextGraphics(new Graphics(3348));
	for (Entity t : npc.getPossibleTargets()) {
	    if (Utils.getRandom(2) == 0)
		sendMagicAttack(npc, t);
	    else {
		delayHit(npc, 1, t, getRangeHit(npc, getRandomMaxHit(npc, 720, NPCCombatDefinitions.RANGE, t)));
		World.sendProjectile(npc, t, 3349, 41, 16, 41, 35, 16, 0);
		for (int c = 0; c < 10; c++) {
		    int dir = Utils.random(Utils.DIRECTION_DELTA_X.length);
		    if (World.checkWalkStep(target.getPlane(), target.getX(), target.getY(), dir, 1)) {
			t.setNextWorldTile(new WorldTile(target.getX() + Utils.DIRECTION_DELTA_X[dir], target.getY() + Utils.DIRECTION_DELTA_Y[dir], target.getPlane()));
			t.setNextGraphics(new Graphics(3351));
			break;
		    }
		}
	    }
	}
	return defs.getAttackDelay();
    }

    private void sendMagicAttack(NPC npc, Entity target) {
	npc.setNextAnimation(new Animation(17397));
	npc.setNextGraphics(new Graphics(3387));
	for (Entity t : npc.getPossibleTargets()) {
	    delayHit(npc, 1, t, getMagicHit(npc, getRandomMaxHit(npc, 210, NPCCombatDefinitions.MAGE, t)));
	    World.sendProjectile(npc, t, 3388, 41, 16, 41, 35, 16, 0);
	}
    }
}
