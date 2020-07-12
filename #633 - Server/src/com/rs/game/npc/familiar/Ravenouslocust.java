package com.rs.game.npc.familiar;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.content.Foods.Food;
import com.rs.game.player.content.Summoning.Pouch;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public class Ravenouslocust extends Familiar {

    private static final long serialVersionUID = -176892505925306625L;

    public Ravenouslocust(Player owner, Pouch pouch, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
	super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
    }

    @Override
    public String getSpecialName() {
	return "Famine";
    }

    @Override
    public String getSpecialDescription() {
	return "Eats a peice of an opponent's food.";
    }

    @Override
    public int getBOBSize() {
	return 0;
    }

    @Override
    public int getSpecialAmount() {
	return 12;
    }

    @Override
    public SpecialAttack getSpecialAttack() {
	return SpecialAttack.ENTITY;
    }

    @Override
    public boolean submitSpecial(Object object) {
	final Entity target = (Entity) object;
	final Familiar npc = this;
	setNextGraphics(new Graphics(1346));
	setNextAnimation(new Animation(7998));
	WorldTasksManager.schedule(new WorldTask() {

	    @Override
	    public void run() {
		World.sendProjectile(npc, target, 1347, 34, 16, 30, 35, 16, 0);
		WorldTasksManager.schedule(new WorldTask() {

		    @Override
		    public void run() {
			target.setNextGraphics(new Graphics(1348));
			if (target instanceof Player) {
			    Player playerTarget = (Player) target;
			    itemLoop: for (Item item : playerTarget.getInventory().getItems().getItems()) {
				if (item == null)
				    continue;
				Food food = Food.forId(item.getId());
				if (food == null)
				    continue;
				playerTarget.getInventory().deleteItem(item);
				break itemLoop;
			    }
			}
		    }
		}, 2);
	    }
	});
	return true;
    }
}
