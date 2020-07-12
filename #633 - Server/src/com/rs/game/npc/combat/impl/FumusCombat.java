package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.minigames.ZarosGodwars;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class FumusCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
	return new Object[] { 13451 };
    }

    @Override
    public int attack(final NPC npc, final Entity target) {
	final NPCCombatDefinitions defs = npc.getCombatDefinitions();
	npc.setNextAnimation(new Animation(defs.getAttackEmote()));
	npc.setNextGraphics(new Graphics(3355));
	for (final Entity t : ZarosGodwars.nex.getPossibleTargets()) {
	    World.sendProjectile(npc, t, 386, 41, 20, 20, 1, 25, 10);
	    int damage = getRandomMaxHit(npc, defs.getMaxHit(), NPCCombatDefinitions.MAGE, t);
	    delayHit(npc, 1, t, getMagicHit(npc, damage));
	    if (damage > 0 && Utils.getRandom(5) == 0) {
		WorldTasksManager.schedule(new WorldTask() {
		    @Override
		    public void run() {
			t.getPoison().makePoisoned(80);
			t.setNextGraphics(new Graphics(388));
		    }
		}, 2);

	    }
	}
	return defs.getAttackDelay();
    }
}