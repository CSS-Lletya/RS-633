package com.rs.game.player.content;

import com.rs.game.Animation;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class CrystalChest {

    private final static Item REWARDS[][] = { { new Item(1631), new Item(1969), new Item(995, 2000) }, { new Item(1631) }, { new Item(1631), new Item(554, 50), new Item(556, 50), new Item(555, 50), new Item(557, 50), new Item(559, 50), new Item(558, 50), new Item(560, 10), new Item(561, 10), new Item(562, 10), new Item(563, 10), new Item(564, 10) }, { new Item(1631), new Item(2363, 10) }, { new Item(1631), new Item(454, 100) }, { new Item(1631), new Item(441, 150) }, { new Item(1631), new Item(1603, 2), new Item(1601, 2) }, { new Item(1631), new Item(371, 5), new Item(995, 1000) }, { new Item(1631), new Item(987), new Item(995, 750) }, { new Item(1631), new Item(985), new Item(995, 750) }, { new Item(1631), new Item(1183) }, { new Item(1631), new Item(1079), new Item(1093) } };

    public static void openChest(final Player player, final WorldObject object) {
	player.getInventory().deleteItem(989, 1);
	double random = Utils.random(0, 100);
	final int reward = random <= 39.69 ? 0 : random <= 56.41 ? 1 : random <= 64.41 ? 2 : random <= 67.65 ? 3 : random <= 74.2 ? 4 : random <= 76.95 ? 5 : random <= 81.18 ? 6 : random <= 91.75 ? 7 : random <= 95.01 ? 8 : random <= 98.68 ? 9 : random <= 99.74 ? 10 : 11;
	player.setNextAnimation(new Animation(536));
	player.lock(2);
	player.getPackets().sendGameMessage("You unlock the chest with your key.");
	WorldTasksManager.schedule(new WorldTask() {
	    @Override
	    public void run() {
		WorldObject openedChest = new WorldObject(object.getId() + 1, object.getType(), object.getRotation(), object.getX(), object.getY(), object.getPlane());
		World.spawnObjectTemporary(openedChest, 600);
		player.getPackets().sendGameMessage("You find some treasure in the chest!");
		for (Item item : REWARDS[reward])
		    player.getInventory().addItemDrop(item.getId(), item.getAmount());
	    }
	}, 0);
    }
}
