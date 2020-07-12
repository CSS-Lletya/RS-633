package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.minigames.ZarosGodwars;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;

public class CruorCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
	return new Object[] { 13453 };
    }

    @Override
    public int attack(final NPC npc, final Entity target) {
	final NPCCombatDefinitions defs = npc.getCombatDefinitions();
	npc.setNextAnimation(new Animation(defs.getAttackEmote()));
	npc.setNextGraphics(new Graphics(3354));
	for (final Entity t : ZarosGodwars.nex.getPossibleTargets()) {
	    World.sendProjectile(npc, t, 374, 41, 25, 20, 1, 25, 10);
	    int damage = getRandomMaxHit(npc, defs.getMaxHit(), NPCCombatDefinitions.MAGE, t);
	    delayHit(npc, 1, t, getMagicHit(npc, damage));
	    t.setNextGraphics(new Graphics(375));
	}
	return defs.getAttackDelay();
    }
}