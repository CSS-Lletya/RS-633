package com.rs.game.npc.familiar;

import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.content.Summoning.Pouch;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public class Spiritcobra extends Familiar {

    private static final long serialVersionUID = 5680976975276635201L;

    public Spiritcobra(Player owner, Pouch pouch, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
	super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
    }

    @Override
    public String getSpecialName() {
	return "Ophidian Incubation";
    }

    @Override
    public String getSpecialDescription() {
	return "Transforms a single egg from the player's inventory into a corresponding variety of Cockatrice egg.";
    }

    @Override
    public int getBOBSize() {
	return 0;
    }

    @Override
    public int getSpecialAmount() {
	return 3;
    }

    @Override
    public SpecialAttack getSpecialAttack() {
	return SpecialAttack.CLICK;
    }

    @Override
    public boolean submitSpecial(Object object) {
	final Player player = (Player) object;
	final Familiar npc = this;
	WorldTasksManager.schedule(new WorldTask() {

	    @Override
	    public void run() {
		World.sendProjectile(npc, player, 1389, 34, 16, 30, 35, 16, 0);
	    }
	}, 2);
	setNextGraphics(new Graphics(1388));
	setNextAnimation(new Animation(8159));
	itemLoop: for (Item item : player.getInventory().getItems().getItems()) {
	    if (item == null)
		continue;
	    int replacement = getChocoTriceEgg(item.getId());
	    if (replacement != item.getId()) {
		int itemSlot = player.getInventory().getItems().getThisItemSlot(item);
		player.getInventory().getItem(itemSlot).setId(replacement);
		player.getInventory().refresh(itemSlot);
		break itemLoop;
	    }
	}
	return true;
    }

    private int getChocoTriceEgg(int itemId) {
	switch (itemId) {
	    case 1944:
		return 12109;
	    case 5076:
		return 12113;
	    case 5077:
		return 12115;
	    case 5078:
		return 12111;
	    case 11964:
		return 12119;
	    case 12483:
		return 12117;
	    case 11965:
		return 12121;
	}
	return itemId;
    }
}
