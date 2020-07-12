package com.rs.game.npc.others;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

@SuppressWarnings("serial")
public class Werewolf extends NPC {

    private int realId;

    public Werewolf(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean spawned) {
	super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
	realId = id;
    }

    public boolean hasWolfbane(Entity target) {
	if(target instanceof NPC)
	    return false;
	return ((Player) target).getEquipment().getWeaponId() == 2952;
    }
    @Override
    public void processNPC() {
	if (isDead() || isCantInteract())
	    return;
	if(isUnderCombat() && getId() == realId && Utils.random(5) == 0) {
	    final Entity target = getCombat().getTarget();
	    if(!hasWolfbane(target)) {
		    setNextAnimation(new Animation(6554));
		    setCantInteract(true);
		    WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {
			    setNextNPCTransformation(realId-20);
			    setNextAnimation(new Animation(-1));
			    setCantInteract(false);
			    setTarget(target);
			}
		    }, 1);
		    return;
	    }
	}
	super.processNPC();
    }

    @Override
    public void reset() {
	setNPC(realId);
	super.reset();
    }

}
