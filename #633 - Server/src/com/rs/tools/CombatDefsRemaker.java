package com.rs.tools;

import com.rs.utils.NPCCombatDefinitionsL;

public class CombatDefsRemaker {

    /**
     * @param args
     */
    public static void main(String[] args) {
	NPCCombatDefinitionsL.init();
	System.out.println(NPCCombatDefinitionsL.npcCombatDefinitions.size());

    }

}
