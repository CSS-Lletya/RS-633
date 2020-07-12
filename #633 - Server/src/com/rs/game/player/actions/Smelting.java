package com.rs.game.player.actions;

import com.rs.Settings;
import com.rs.game.Animation;
import com.rs.game.WorldObject;
import com.rs.game.item.Item;
import com.rs.game.player.Equipment;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.utils.Utils;

public class Smelting extends Action {

    public enum SmeltingBar {

	BRONZE(1, 6.2, new Item[] { new Item(436), new Item(438) }, new Item(2349)),

	BLURITE(8, 8.0, new Item[] { new Item(668) }, new Item(9467)),

	IRON(15, 12.5, new Item[] { new Item(440) }, new Item(2351)),

	SILVER(20, 13.7, new Item[] { new Item(442) }, new Item(2355)),

	STEEL(30, 17.5, new Item[] { new Item(440), new Item(453, 2) }, new Item(2353)),

	GOLD(40, 22.5, new Item[] { new Item(444) }, new Item(2357)),

	MITHRIL(50, 30, new Item[] { new Item(447), new Item(453, 4) }, new Item(2359)),

	ADAMANT(70, 37.5, new Item[] { new Item(449), new Item(453, 6) }, new Item(2361)),

	RUNE(85, 50, new Item[] { new Item(451), new Item(453, 8) }, new Item(2363)),

	CANNON_BALLS(35, 25.6, new Item[] { new Item(2353, 1), new Item(4, 1) }, new Item(2, 4));

	public static SmeltingBar getBar(int buttonId) {
	    if(buttonId >= SmeltingBar.values().length)
		return SmeltingBar.BRONZE;
	    return SmeltingBar.values()[buttonId];
	}

	private int levelRequired;
	private double experience;
	private Item[] itemsRequired;
	private int buttonId;
	private Item producedBar;

	private SmeltingBar(int levelRequired, double experience, Item[] itemsRequired, Item producedBar) {
	    this.levelRequired = levelRequired;
	    this.experience = experience;
	    this.itemsRequired = itemsRequired;
	    this.producedBar = producedBar;
	}

	public Item[] getItemsRequired() {
	    return itemsRequired;
	}

	public int getLevelRequired() {
	    return levelRequired;
	}

	public Item getProducedBar() {
	    return producedBar;
	}

	public double getExperience() {
	    return experience;
	}

	public int getButtonId() {
	    return buttonId;
	}
    }

    public SmeltingBar bar;
    public WorldObject object;
    public int ticks;

    public Smelting(SmeltingBar bar, WorldObject object, int ticks) {
	this.object = object;
	this.bar = bar;
	this.ticks = ticks;
    }

    @Override
    public boolean start(Player player) {
	if (bar == null || player == null || object == null) {
	    return false;
	}
	if (!player.getInventory().containsItemToolBelt(bar.getItemsRequired()[0].getId(), bar.getItemsRequired()[0].getAmount())) {
	    player.getPackets().sendGameMessage("You need " + bar.getItemsRequired()[0].getDefinitions().getName() + " to create a " + bar.getProducedBar().getDefinitions().getName() + ".");
	    return false;
	}
	if (bar.getItemsRequired().length > 1) {
	    if (!player.getInventory().containsItemToolBelt(bar.getItemsRequired()[1].getId(), bar.getItemsRequired()[1].getAmount())) {
		player.getPackets().sendGameMessage("You need " + bar.getItemsRequired()[1].getDefinitions().getName() + " to create a " + bar.getProducedBar().getDefinitions().getName() + ".");
		return false;
	    }
	}
	if (player.getSkills().getLevel(Skills.SMITHING) < bar.getLevelRequired()) {
	    player.getPackets().sendGameMessage("You need a Smithing level of at least " + bar.getLevelRequired() + " to smelt " + bar.getProducedBar().getDefinitions().getName());
	    return false;
	}
	player.getPackets().sendGameMessage("You place the required ores and attempt to create a bar of " + bar.getProducedBar().getDefinitions().getName().toLowerCase().replace(" bar", "") + ".", true);
	return true;
    }

    @Override
    public boolean process(Player player) {
	if (bar == null || player == null || object == null) {
	    return false;
	}
	if (!player.getInventory().containsItemToolBelt(bar.getItemsRequired()[0].getId(), bar.getItemsRequired()[0].getAmount())) {
	    player.getPackets().sendGameMessage("You need " + bar.getItemsRequired()[0].getDefinitions().getName() + " to create a " + bar.getProducedBar().getDefinitions().getName() + ".");
	    return false;
	}
	if (bar.getItemsRequired().length > 1) {
	    if (!player.getInventory().containsItemToolBelt(bar.getItemsRequired()[1].getId(), bar.getItemsRequired()[1].getAmount())) {
		player.getPackets().sendGameMessage("You need " + bar.getItemsRequired()[1].getDefinitions().getName() + " to create a " + bar.getProducedBar().getDefinitions().getName() + ".");
		return false;
	    }
	}
	if (player.getSkills().getLevel(Skills.SMITHING) < bar.getLevelRequired()) {
	    player.getPackets().sendGameMessage("You need a Smithing level of at least " + bar.getLevelRequired() + " to smelt " + bar.getProducedBar().getDefinitions().getName());
	    return false;
	}
	player.faceObject(object);
	return true;
    }

    public boolean isSuccessFull(Player player) {
	if (bar == SmeltingBar.IRON) {
	    if (player.getEquipment().getItem(Equipment.SLOT_RING) != null && player.getEquipment().getItem(Equipment.SLOT_RING).getId() == 2568) {
		return true;
	    } else {
		return Utils.getRandom(100) <= (player.getSkills().getLevel(Skills.SMITHING) >= 45 ? 80 : 50);
	    }
	}
	return true;
    }

    @Override
    public int processWithDelay(Player player) {
	ticks--;
	player.setNextAnimation(new Animation(3243));
	double xp = bar.getExperience();
	if(bar == SmeltingBar.GOLD && player.getEquipment().getGlovesId() == 776)
	    xp *= 2;
	player.getSkills().addXp(Skills.SMITHING, xp);
	for (Item required : bar.getItemsRequired()) {
	    if (required.getName().toLowerCase().contains("mould"))
		continue;
	    player.getInventory().deleteItem(required.getId(), required.getAmount());
	}
	if (isSuccessFull(player)) {
	    int amount = bar.getProducedBar().getAmount();
	    if(bar.getProducedBar().getDefinitions().isStackable())
		amount *= Settings.CRAFT_RATE;
	    player.getInventory().addItem(bar.getProducedBar().getId(), amount);
	    player.getPackets().sendGameMessage("You retrieve a bar of " + bar.getProducedBar().getDefinitions().getName().toLowerCase().replace(" bar", "") + ".", true);
	} else {
	    player.getPackets().sendGameMessage("The ore is too impure and you fail to refine it.", true);
	}
	if (ticks > 0) {
	    return 1;
	}
	return -1;
    }

    @Override
    public void stop(Player player) {
	this.setActionDelay(player, 3);
    }
}
