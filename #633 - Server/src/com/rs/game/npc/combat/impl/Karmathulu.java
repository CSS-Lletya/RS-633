package com.rs.game.npc.combat.impl;

import com.rs.game.Entity;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.utils.Utils;

public class Karmathulu extends CombatScript {

    @Override
    public Object[] getKeys() {
	return new Object[] { "karmathulu" };
    }

    @Override
    public int attack(NPC npc, Entity target) {
	NPCCombatDefinitions def = npc.getCombatDefinitions();
	int attackStyle = Utils.getRandom(2);
	switch (attackStyle) {
	    case 0:
		sendRangeAttack(target, npc);
		break;
	    case 1:
		if (npc.withinDistance(target, 1))
		    sendMeleeAttack(target, npc);
		else
		    sendRandomAttack(target, npc);
		break;
	    case 2:
		sendMagicAttack(target, npc);
		break;
	}
	if (Utils.getRandom(2) == 0)
	    sendRandomAttack(target, npc);
	return def.getAttackDelay();
    }

    private void sendRandomAttack(Entity target, NPC npc) {
	int attackStyle = Utils.getRandom(2);
	switch (attackStyle) {
	    case 0:
	    case 1:
		sendMagicAttack(target, npc);
		break;
	    case 2:
		sendRangeAttack(target, npc);
		break;
	}
    }

    private void sendMagicAttack(Entity target, NPC npc) {
	//
    }

    private void sendMeleeAttack(Entity target, NPC npc) {
	//
    }

    private void sendRangeAttack(Entity target, NPC npc) {
	//
    }
}
