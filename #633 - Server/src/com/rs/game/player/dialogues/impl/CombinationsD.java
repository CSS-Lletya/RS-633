package com.rs.game.player.dialogues.impl;

import java.util.LinkedList;
import java.util.List;

import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.content.SkillsDialogue.ItemNameFilter;
import com.rs.game.player.dialogues.Dialogue;

public class CombinationsD extends Dialogue {

    private static final int PUT = 0, MIX = 1, COMBINE = 2, CUTT = 3;
    private static final int BOWL = 1923, POT = 1931, KNIFE = 946,
	    BUCKET = 1925, JUG = 1935;
    private Combinations combination;

    @Override
    public void start() {
	combination = (Combinations) parameters[0];
	int[] ids = new int[combination.getProducedNodes().length];
	for (int i = 0; i < ids.length; i++)
	    ids[i] = combination.getProducedNodes()[i].getId();
	SkillsDialogue.sendSkillsDialogue(player, SkillsDialogue.MAKE, "How many would you like to make?<br>Choose a number, then click the hide to begin.", 28, ids, new ItemNameFilter() {

	    @Override
	    public String rename(String name) {
		int levelRequired = combination.getRequiredLevel();
		if (player.getSkills().getLevel(Skills.COOKING) < levelRequired)
		    name = "<col=ff0000>" + name + "<br><col=ff0000>Level " + levelRequired;
		return name;
	    }
	});
    }

    @Override
    public void run(int interfaceId, int componentId) {
	end();
	final int componentIndex = SkillsDialogue.getItemSlot(componentId);
	if (componentIndex > combination.getProducedNodes().length) {
	    return;
	}
	player.getActionManager().setAction(new Action() {

	    @Override
	    public boolean start(Player player) {
		return process(player);
	    }

	    @Override
	    public boolean process(Player player) {
		if (player.getSkills().getLevel(Skills.COOKING) < combination.getRequiredLevel()) {
		    player.getPackets().sendGameMessage("You need a cooking level of " + combination.getRequiredLevel() + " in order to be able to create this.");
		    return false;
		}
		for (Item item : combination.getRequirements()) {
		    if (!player.getInventory().containsItemToolBelt(item.getId(), item.getAmount())) {
			String requirmentMessage = "";
			if (combination.getType() == PUT || combination.getType() == COMBINE || combination.getType() == CUTT)
			    requirmentMessage = "You have run out of " + item.getName().toLowerCase() + ".";
			else if (combination.getType() == MIX)
			    requirmentMessage = "You need a in order to chop this " + item.getName().toLowerCase() + ".";
			player.getDialogueManager().startDialogue("ItemMessage", requirmentMessage, item.getId());
			return false;
		    }
		}
		return true;
	    }

	    @Override
	    public int processWithDelay(Player player) {
		for (Item item : combination.getDeletedItems()) {
		    if (item == null)
			continue;
		    player.getInventory().deleteItem(new Item(item));
		}
		player.getInventory().addItem(new Item(combination.getProducedNodes()[componentIndex]));
		player.getSkills().addXp(Skills.COOKING, combination.getExperience()[componentIndex]);
		if (combination.getType() == COMBINE)
		    player.getPackets().sendGameMessage("You combine the ingredients to make a topping.");
		else if (combination.getType() == MIX)
		    player.getPackets().sendGameMessage("You add the " + combination.getInitialNode().getName().toLowerCase() + " to the " + combination.getSecondaryNode().getName().toLowerCase() + ".");
		else if (combination.getType() == PUT) {
		    if (combination.toString().contains("_BOWL"))
			player.getInventory().addItem(new Item(BOWL, 1));
		    if (combination.toString().contains("_POT"))
			player.getInventory().addItem(new Item(POT, 1));
		    if (combination.toString().contains("_BUCKET"))
			player.getInventory().addItem(new Item(BUCKET, 1));
		    if (combination.toString().contains("_JUG"))
			player.getInventory().addItem(new Item(JUG, 1));
		    player.getPackets().sendGameMessage("You place the topping onto the " + combination.getInitialNode().getName().toLowerCase() + ".");
		} else if (combination.getType() == CUTT)
		    player.getPackets().sendGameMessage("You chop the " + combination.getInitialNode().getName().toLowerCase() + " into little pieces.");
		return 3;
	    }

	    @Override
	    public void stop(Player player) {
		setActionDelay(player, 3);
	    }
	});
    }

    @Override
    public void finish() {

    }

    public enum Combinations {

	/**
	 * Potatoes
	 */
	BUTTERED_POTATO(39, 95.5, new Item(6697), new Item(6703), COMBINE, new Item(6701)),

	CHILLI_POTATO_BOWL(41, 165.5, new Item(7062), new Item(7054), PUT, new Item(6703)),

	CHEESE_WITH_POTATO(47, 199.5, new Item(1985), new Item(6705), COMBINE, new Item(6703)),

	EGG_POTATO_BOWL(51, 195.5, new Item(7064), new Item(7056), PUT, new Item(6703)),

	MUSHROOM_POTATO_BOWL(64, 270.5, new Item(7066), new Item(7058), PUT, new Item(6703)),

	TUNA_POTATO_BOWL(68, 305.5, new Item(7068), new Item(7060), PUT, new Item(6703)),

	/**
	 * Bowls (combination)
	 */
	SPICY_SAUCE(9, 25, new Item(2169), new Item(7072), COMBINE, new Item(1550), new Item(BOWL)),

	CHILLI_CON_CARNE(11, 55, new Item(7060), new Item(7062), COMBINE, new Item(2142), new Item(BOWL)),

	SCRAMBLED_EGGS(1, 0, new Item(1944), new Item(7076), COMBINE, new Item(BOWL)),

	EGGS_AND_TOMATOES(23, 50, new Item(1982), new Item(7064), COMBINE, new Item(1944), new Item(BOWL)),

	CHOPPED_ONIONS(1, 0, new Item(1957), new Item(1871), CUTT, new Item(KNIFE), new Item(BOWL)),

	CHOPPED_MUSHROOMS(1, 0, new Item(6004), new Item(7080), CUTT, new Item(KNIFE), new Item(BOWL)),

	MUSHROOM_AND_ONIONS_BOWL(57, 120, new Item(1871), new Item(7066), PUT, new Item(7080)),

	TUNA_IN_BOWL(1, 0, new Item(361), new Item(7086), COMBINE, new Item(BOWL), new Item(KNIFE)),

	TUNA_AND_SWEETCORN(67, 204, new Item(7086), new Item(7068), MIX, new Item(5988), new Item(KNIFE)),

	/**
	 * Dairy
	 */
	CHOCOLATE_MILK(4, 0, new Item(1975), new Item(1977), COMBINE, new Item(1927)),

	JUG_OF_WINE(35, 200, new Item(1987), new Item(1993), COMBINE, new Item(1937)),

	NETTLE_TEA(20, 52, new Item(1921), new Item(4237), COMBINE, new Item(4241)),

	FULL_KETTLE_BOWL(1, 0, new Item(7688), new Item(7690), PUT, new Item(4237)),

	/**
	 * Pizza
	 */
	INCOMPLETE_PIZZA(1, 0, new Item(2283), new Item(2285), COMBINE, new Item(1982)),

	RAW_PLAIN_PIZZA(1, 0, new Item(2285), new Item(2287), COMBINE, new Item(1985)),

	MEAT_PIZZA(45, 26, new Item(2142), new Item(2293), COMBINE, new Item(2289)),

	ANCHOVY_PIZZA(55, 39, new Item(319), new Item(2297), COMBINE, new Item(2289)),

	PINEAPPLE_PIZZA1(65, 52, new Item(2116), new Item(2301), COMBINE, new Item(2289)), PINEAPPLE_PIZZA2(65, 52, new Item(2118), new Item(2301), COMBINE, new Item(2289)), PINEAPPLE(1, new double[] { 0, 0 }, new Item(2114), new Item[] { new Item(2116), new Item(2118, 4) }, CUTT, new Item(KNIFE)),

	/**
	 * Cakes yum :)
	 */
	RAW_FISH_CAKE1(1, 0, new Item(7528), new Item(7529), COMBINE, new Item(7527), new Item(7517), new Item(7515)),

	NORMAL_CAKE1_POT(1, 0, new Item(1887), new Item(1889), PUT, new Item(1933), new Item(1944), new Item(1927)), NORMAL_CAKE2_POT(1, 0, new Item(1887), new Item(1889), PUT, new Item(1944), new Item(1933), new Item(1927)), NORMAL_CAKE3_POT(1, 0, new Item(1887), new Item(1889), PUT, new Item(1927), new Item(1944), new Item(1933)),

	CHOCOLATE_CAKE1(50, 210, new Item(1891), new Item(1897), COMBINE, new Item(1973)), CHOCOLATE_CAKE2(50, 210, new Item(1891), new Item(1897), COMBINE, new Item(1975)),

	/**
	 * Pies Apple and cherry (Y)
	 */

	PIE_SHELL(1, 0, new Item(2313), new Item(2315), COMBINE, new Item(1953)),

	REDBERRY_PIE(1, 0, new Item(2315), new Item(2321), COMBINE, new Item(1951)),

	MEAT_PIE(1, 0, new Item(2315), new Item(2319), COMBINE, new Item(2142)),

	APPLE_PIE(1, 0, new Item(2315), new Item(2317), COMBINE, new Item(1955)),

	GARDEN_PART1(1, 0, new Item(2315), new Item(7172), COMBINE, new Item(1982)), GARDEN_PART2(1, 0, new Item(7174), new Item(7174), COMBINE, new Item(1957)), GARDEN_PART3(1, 0, new Item(7174), new Item(7176), COMBINE, new Item(1965)),

	FISH_PART1(1, 0, new Item(2315), new Item(7182), COMBINE, new Item(333)), FISH_PART2(1, 0, new Item(7182), new Item(7184), COMBINE, new Item(339)), FISH_PART3(1, 0, new Item(7184), new Item(7186), COMBINE, new Item(1942)),

	ADMIRAL_PART1(1, 0, new Item(2315), new Item(7192), COMBINE, new Item(329)), ADMIRAL_PART2(1, 0, new Item(7192), new Item(7194), COMBINE, new Item(361)), ADMIRAL_PART3(1, 0, new Item(7194), new Item(7196), COMBINE, new Item(1942)),

	WILD_PART1(1, 0, new Item(2315), new Item(7202), COMBINE, new Item(2136)), WILD_PART2(1, 0, new Item(7202), new Item(7204), COMBINE, new Item(2876)), WILD_PART3(1, 0, new Item(7204), new Item(7206), COMBINE, new Item(3226)),

	SUMMER_PART1(1, 0, new Item(2315), new Item(7212), COMBINE, new Item(5504)), SUMMER_PART2(1, 0, new Item(7212), new Item(7214), COMBINE, new Item(5982)), SUMMER_PART3(1, 0, new Item(7214), new Item(7216), COMBINE, new Item(1955)),

	/**
	 * Breads
	 */
	BREAD_JUG_POT(1, new double[] { 0, 0, 0 }, new Item(1933), new Item[] { new Item(2307), new Item(1863), new Item(1953) }, PUT, new Item(1937)), BREAD_BUCKET_POT(1, new double[] { 0, 0, 0 }, new Item(1933), new Item[] { new Item(2307), new Item(1863), new Item(1953) }, PUT, new Item(1929)), BREADCRUMBS(1, 0, new Item(2309), new Item(7515), CUTT, new Item(KNIFE)),

	CLAY_BUCKET(1, 0, new Item(434), new Item(1761), PUT, new Item(1929)),

	CLAY_JUG(1, 0, new Item(434), new Item(1761), PUT, new Item(1937)),
	
	MASKED_EARMUFFS(1, 0, new Item(4166), new Item(13277), 20, new Item(4164));

	private Item initialNode;
	private Item[] producedNodes;
	private double[] experience;
	private int requiredLevel;
	private Object[] parameters; // type, requirments for certain type

	Combinations(int requiredLevel, double[] experience, Item initialNode, Item[] producedNodes, Object... parameters) {
	    this.requiredLevel = requiredLevel;
	    this.experience = experience;
	    this.initialNode = initialNode;
	    this.producedNodes = producedNodes;
	    this.parameters = parameters;
	}

	Combinations(int requiredLevel, double experience, Item initialNode, Item producedNode, Object... parameters) {
	    this(requiredLevel, new double[] { experience }, initialNode, new Item[] { producedNode }, parameters);
	}

	public static Combinations isCombining(int initialNode, int appliedNode) {
	    for (Combinations combination : Combinations.values()) {
		if (combination.getInitialNode().getId() == initialNode && combination.getSecondaryNode().getId() == appliedNode || combination.getInitialNode().getId() == appliedNode && combination.getSecondaryNode().getId() == initialNode)
		    return combination;
	    }
	    return null;
	}

	public int getType() {
	    return (Integer) parameters[0];
	}

	public Item getInitialNode() {
	    return initialNode;
	}

	public Item getSecondaryNode() {
	    return (Item) parameters[1];
	}

	public Item[] getProducedNodes() {
	    return producedNodes;
	}

	public List<Item> getRequirements() {
	    List<Item> items = new LinkedList<Item>();
	    for (Object object : parameters) {
		if (object instanceof Item)
		    items.add((Item) object);
	    }
	    items.add(getInitialNode());
	    return items;
	}

	public List<Item> getDeletedItems() {
	    List<Item> deletedItems = new LinkedList<Item>();
	    for (Item item : getRequirements()) {
		if (item.getId() == KNIFE)
		    continue;
		deletedItems.add(item);
	    }
	    return deletedItems;
	}

	public double[] getExperience() {
	    return experience;
	}

	public int getRequiredLevel() {
	    return requiredLevel;
	}

	public Object[] getObject() {
	    return parameters;
	}
    }
}
