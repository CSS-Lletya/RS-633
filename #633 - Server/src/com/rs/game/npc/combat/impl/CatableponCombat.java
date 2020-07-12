package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.utils.Utils;

public class CatableponCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
	return new Object[] {4397, 4398, 4399 };
    }

    @Override
    public int attack(NPC npc, final Entity target) {
	NPCCombatDefinitions def = npc.getCombatDefinitions();
	if (Utils.random(10) == 0 && target instanceof Player) {
	    Player playerTarget = (Player) target;
	    int strLvl = playerTarget.getSkills().getLevelForXp(Skills.STRENGTH);
	    if(strLvl - playerTarget.getSkills().getLevel(Skills.STRENGTH) < 8) {
		playerTarget.getSkills().drainLevel(Skills.STRENGTH, (int) (strLvl * 0.15));
		npc.setNextAnimation(new Animation(4272));
		delayHit(npc, 1, target, getMagicHit(npc, getRandomMaxHit(npc, npc.getMaxHit(), NPCCombatDefinitions.MAGE, target)));
		return def.getAttackDelay();
	    }
	   
	}
	delayHit(npc, 0, target, getMeleeHit(npc, getRandomMaxHit(npc, npc.getMaxHit(), def.getAttackStyle(), target)));
	npc.setNextAnimation(new Animation(def.getAttackEmote()));
	return def.getAttackDelay();
    }
}
