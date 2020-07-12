package com.rs.game.npc.others;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

@SuppressWarnings("serial")
public class MutatedZygomites extends ConditionalDeath {

    boolean lvl74;

    public MutatedZygomites(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
	super(7421, null, false, id, tile, mapAreaNameHash, true);
	this.lvl74 = id == 3344;
    }

    @Override
    public void processNPC() {
	super.processNPC();
	if (!getCombat().process())
	    resetNPC();
    }

    @Override
    public void sendDeath(final Entity source) {
	super.sendDeath(source);
	if (getHitpoints() != 1)
	    resetNPC();
    }

    private void resetNPC() {
	setNPC(lvl74 ? 3344 : 3345);
	setNextNPCTransformation(lvl74 ? 3344 : 3345);
    }

    public static void transform(final Player player, final NPC npc) {
	player.setNextAnimation(new Animation(2988));
	npc.setNextNPCTransformation(npc.getId() + 2);
	npc.setNPC(npc.getId() + 2);
	npc.setNextAnimation(new Animation(2982));
	WorldTasksManager.schedule(new WorldTask() {

	    @Override
	    public void run() {
		npc.getCombat().setTarget(player);
		npc.setCantInteract(false);
	    }
	});
    }
}
