package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.game.player.content.Slayer;
import com.rs.utils.Utils;

public class AberrantSpectre extends CombatScript {

    @Override
    public Object[] getKeys() {
	return new Object[] { "Aberrant spectre" };
    }

    @Override
    public int attack(NPC npc, Entity target) {
	NPCCombatDefinitions def = npc.getCombatDefinitions();
	if (!Slayer.hasNosepeg(target)) {
	    Player targetPlayer = (Player) target;
	    if (!targetPlayer.getPrayer().isMageProtecting()) {
		int randomSkill = Utils.random(0, 6);
		int currentLevel = targetPlayer.getSkills().getLevel(randomSkill);
		targetPlayer.getSkills().set(randomSkill, currentLevel < 5 ? 0 : currentLevel - 5);
		targetPlayer.getPackets().sendGameMessage("The smell of the abberrant spectre make you feel slightly weaker.");
	    }
	    delayHit(npc, 1, target, getMagicHit(npc, targetPlayer.getMaxHitpoints() / 10));
	    // TODO player emote hands on ears
	} else
	    delayHit(npc, 1, target, getMagicHit(npc, getRandomMaxHit(npc, npc.getMaxHit(), def.getAttackStyle(), target)));
	World.sendProjectile(npc, target, def.getAttackProjectile(), 18, 18, 50, 25, 0, 0);
	npc.setNextAnimation(new Animation(def.getAttackEmote()));
	return def.getAttackDelay();
    }
}
