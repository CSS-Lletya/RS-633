package com.rs.game.player.content;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.Animation;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Smithing;

public class GodswordCreating {

    public static void joinPieces(Player player, boolean anvil) {
	if (!anvil) {
	    player.getPackets().sendGameMessage("Those pieces of the godsword can't be joined together like that - try forging them.");
	    return;
	} else {
	    if (!player.getInventory().containsItemToolBelt(Smithing.HAMMER)) {
		player.getDialogueManager().startDialogue("SimpleMessage", "You need a hammer in order to work with shards.");
		return;
	    }
	    if (player.getSkills().getLevel(Skills.SMITHING) < 80) {
		player.getDialogueManager().startDialogue("SimpleMessage", "You need a Smithing level of 80 to forge godsword shards.");
		return;
	    }
	    if (!player.getInventory().containsItems(SHARDS)) {
		player.getDialogueManager().startDialogue("SimpleMessage", "You need godsword shards to forge a godsword blade.");
		return;
	    }
	    player.lock(2);
	    player.setNextAnimation(new Animation(898));
	    player.getInventory().removeItems(SHARDS);
	    player.getInventory().addItem(11690, 1);
	    player.getSkills().addXp(Skills.SMITHING, 200);
	    player.getDialogueManager().startDialogue("SimpleDialogue", "Even for an experienced smith it is not an easy task, but eventually it is done.");

	}
    }

    private static final Item[] SHARDS = new Item[] { new Item(11710, 1), new Item(11712, 1), new Item(11714, 1) };

    public static boolean isShard(int itemId) {
	for (Item item : SHARDS)
	    if (item.getId() == itemId)
		return true;
	return false;
    }

    private static final int[] KEYS = { 20121, 20122, 20123, 20124 };

    public static boolean isKey(int itemId) {
	for (int key : KEYS) {
	    if (itemId == key)
		return true;
	}
	return false;
    }

    public static void attachKeys(Player player) {
	if (!player.getInventory().containsItems(KEYS, new int[] { 1, 1, 1, 1 })) {
	    player.getPackets().sendGameMessage("You need all key peices in order to form a frozen key.");
	    return;
	}
	for (int key : KEYS)
	    player.getInventory().deleteItem(key, 1);
	player.getInventory().addItem(new Item(20120, 1));
	player.getPackets().sendGameMessage("You attach the key peices together to form a frozen key.");
    }

    public static void attachHilt(Player player, int gs) {
	player.getInventory().deleteItem(new Item(11690, 1));
	player.getInventory().deleteItem(new Item(11702 + gs * 2, 1));
	int gsId = 11694 + gs * 2;
	player.getInventory().addItem(gsId, 1);
	player.getPackets().sendGameMessage("You attach the hilt to the blade and make a " + ItemDefinitions.getItemDefinitions(gsId).name + ".");
    }

    public static void dismantleGS(Player player, Item item, int slot) {
	int gs = (item.getId() - 11694) / 2;
	if (!player.getInventory().hasFreeSlots()) {
	    player.getPackets().sendGameMessage("Not enough space in your inventory.");
	    return;
	}
	item.setId(11690);
	player.getInventory().addItem(11702 + gs * 2, 1);
	player.getInventory().refresh(slot);
	player.getPackets().sendGameMessage("You dismantle the godsword");

    }

}
