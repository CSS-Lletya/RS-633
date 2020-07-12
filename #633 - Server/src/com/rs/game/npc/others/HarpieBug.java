package com.rs.game.npc.others;

import com.rs.game.Hit;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;

@SuppressWarnings("serial")
public class HarpieBug extends NPC {

    public HarpieBug(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
	super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
    }

    @Override
    public void handleIngoingHit(Hit hit) {
	if (hit.getSource() instanceof Player) {
	    Player player = (Player) hit.getSource();
	    if (player.getEquipment().getShieldId() != 7053)
		hit.setDamage(0);
	}
	super.handleIngoingHit(hit);
    }

}
