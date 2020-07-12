package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.player.Player;

public class ClayFamiliarCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
	return new Object[] { 8241, 8243, 8245, 8247, 8249 };
    }

    @Override
    public int attack(NPC npc, Entity target) {
	NPCCombatDefinitions def = npc.getCombatDefinitions();
	if (target instanceof Player) {
	    Player player = (Player) target;
	    if (player.getAppearence().isNPC()) {
		npc.getCombat().removeTarget();
		return def.getAttackDelay();
	    }
	}
	delayHit(npc, 0, target, getMeleeHit(npc, getRandomMaxHit(npc, npc.getMaxHit(), def.getAttackStyle(), target)));
	npc.setNextAnimation(new Animation(def.getAttackEmote()));
	return def.getAttackDelay();
    }
}
