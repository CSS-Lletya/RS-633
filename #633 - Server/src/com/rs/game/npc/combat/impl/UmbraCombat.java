package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.minigames.ZarosGodwars;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class UmbraCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
	return new Object[] { 13452 };
    }

    @Override
    public int attack(final NPC npc, final Entity target) {
	final NPCCombatDefinitions defs = npc.getCombatDefinitions();
	npc.setNextAnimation(new Animation(defs.getAttackEmote()));
	npc.setNextGraphics(new Graphics(3357));
	for (final Entity t : ZarosGodwars.nex.getPossibleTargets()) {
	    World.sendProjectile(npc, t, 380, 20, 20, 20, 1, 0, 0);
	    int damage = getRandomMaxHit(npc, defs.getMaxHit(), NPCCombatDefinitions.MAGE, t);
	    delayHit(npc, 1, t, getMagicHit(npc, damage));
	    if (damage > 0 && Utils.getRandom(5) == 0) {
		WorldTasksManager.schedule(new WorldTask() {
		    @Override
		    public void run() {
			if (t instanceof Player)
			    ((Player) t).getSkills().drainLevel(Skills.ATTACK, (int) (((Player) t).getSkills().getLevel(Skills.ATTACK) * 0.1));
			t.setNextGraphics(new Graphics(381));
		    }
		}, 2);
	    }
	}
	return defs.getAttackDelay();
    }
}