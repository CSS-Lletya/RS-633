package com.rs.game.npc.others;

import com.rs.game.ForceTalk;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.utils.Utils;

@SuppressWarnings("serial")
public class EconomyManager extends NPC {

   
    
    public EconomyManager(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean spawned) {
	super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
	setName("Oracle of Dawn");
	setRun(false);
    }
    
    @Override
    public void processNPC() {
	if (Utils.randomDouble() <= 0.01) {
	    setNextForceTalk(new ForceTalk(com.rs.game.player.content.EconomyManager.MANAGER_NPC_TEXTS[Utils.random(com.rs.game.player.content.EconomyManager.MANAGER_NPC_TEXTS.length)]));
	}
	super.processNPC();
    }
}
