package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.game.player.content.Slayer;
import com.rs.utils.Utils;

public class CockatriceCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
	return new Object[] { 1620 };
    }

    @Override
    public int attack(NPC npc, final Entity target) {
	NPCCombatDefinitions def = npc.getCombatDefinitions();
	if (!Slayer.hasReflectiveEquipment(target)) {
	    Player targetPlayer = (Player) target;
	    int randomSkill = Utils.random(0, 6);
	    int currentLevel = targetPlayer.getSkills().getLevel(randomSkill);
	    targetPlayer.getSkills().set(randomSkill, currentLevel < 3 ? 0 : currentLevel / 4);
	    delayHit(npc, 1, target, getMagicHit(npc, targetPlayer.getMaxHitpoints() / 10));
	    npc.setNextAnimation(new Animation(7766));
	    npc.setNextGraphics(new Graphics(1467));
	    World.sendProjectile(npc, target, 1468, 34, 16, 30, 35, 16, 0);
	} else
	    delayHit(npc, 1, target, getMagicHit(npc, getRandomMaxHit(npc, npc.getMaxHit(), def.getAttackStyle(), target)));
	npc.setNextAnimation(new Animation(def.getAttackEmote()));
	return def.getAttackDelay();
    }
}
