package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.player.Player;

public class SapGlacite extends CombatScript {

    @Override
    public Object[] getKeys() {
	return new Object[] { 14303 };
    }

    @Override
    public int attack(NPC npc, Entity target) {
	NPCCombatDefinitions defs = npc.getCombatDefinitions();
	if (target instanceof Player) {
	    Player player = (Player) target;
	    player.getPrayer().drainPrayer((int) (player.getPrayer().getPrayerpoints() * .05));
	}
	npc.setNextAnimation(new Animation(defs.getAttackEmote()));
	delayHit(npc, 0, target, getMeleeHit(npc, getRandomMaxHit(npc, defs.getMaxHit(), defs.getAttackStyle(), target)));
	return defs.getAttackDelay();
    }
}
