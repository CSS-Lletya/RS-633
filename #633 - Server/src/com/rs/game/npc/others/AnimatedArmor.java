package com.rs.game.npc.others;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.minigames.WarriorsGuild;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

@SuppressWarnings("serial")
public class AnimatedArmor extends NPC {

    private transient Player player;
    
    public AnimatedArmor(Player player, int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
	super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
	this.player = player;
    }

    @Override
    public void processNPC() {
	super.processNPC();
	if (!getCombat().underCombat())
	    finish();
    }

    @Override
    public void sendDeath(final Entity source) {
	final NPCCombatDefinitions defs = getCombatDefinitions();
	resetWalkSteps();
	getCombat().removeTarget();
	setNextAnimation(null);
	WorldTasksManager.schedule(new WorldTask() {
	    int loop;

	    @Override
	    public void run() {
		if (loop == 0) {
		    setNextAnimation(new Animation(defs.getDeathEmote()));
		} else if (loop >= defs.getDeathDelay()) {
		    if (source instanceof Player) {
			Player player = (Player) source;
			for (Integer items : getDroppedItems()) {
			    if (items == -1)
				continue;
			    World.addGroundItem(new Item(items), new WorldTile(getCoordFaceX(getSize()), getCoordFaceY(getSize()), getPlane()), player, true, 60);
			}
			player.setWarriorPoints(3, WarriorsGuild.ARMOR_POINTS[getId() - 4278]);
		    }
		    finish();
		    stop();
		}
		loop++;
	    }
	}, 0, 1);
    }

    public int[] getDroppedItems() {
	int index = getId() - 4278;
	int[] droppedItems = WarriorsGuild.ARMOUR_SETS[index];
	if (Utils.getRandom(15) == 0) // 1/15 chance of losing
	    droppedItems[Utils.random(0, 2)] = -1;
	return droppedItems;
    }

    @Override
    public void finish() {
	if (hasFinished())
	    return;
	super.finish();
	if (player != null) {
	    player.getTemporaryAttributtes().remove("animator_spawned");
	    if (!isDead()) {
		for (int item : getDroppedItems()) {
		    if (item == -1)
			continue;
		    player.getInventory().addItemDrop(item, 1);
		}
	    }
	}
    }
}
