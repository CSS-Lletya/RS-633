package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.ForceTalk;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.game.player.content.Slayer;
import com.rs.utils.Utils;

public class CaveHorrerCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
	return new Object[] { "Cave horror" };
    }

    @Override
    public int attack(NPC npc, Entity target) {
	NPCCombatDefinitions def = npc.getCombatDefinitions();
	if (!Slayer.hasWitchWoodIcon(target)) {
	    Player targetPlayer = (Player) target;
	    int randomSkill = Utils.random(0, 6);
	    int currentLevel = targetPlayer.getSkills().getLevel(randomSkill);
	    targetPlayer.getSkills().set(randomSkill, currentLevel < 5 ? 0 : currentLevel - 5);
	    targetPlayer.getPackets().sendGameMessage("The screams of the cave horrer make you feel slightly weaker.");
	    npc.setNextForceTalk(new ForceTalk("*OOOoooAHHHH*"));
	    delayHit(npc, 0, target, getMeleeHit(npc, targetPlayer.getMaxHitpoints() / 3));
	} else
	    delayHit(npc, 0, target, getMeleeHit(npc, getRandomMaxHit(npc, npc.getMaxHit(), def.getAttackStyle(), target)));
	npc.setNextAnimation(new Animation(def.getAttackEmote()));
	return def.getAttackDelay();
    }
}
