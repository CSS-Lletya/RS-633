package com.rs.game.player.content;

import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.player.Equipment;
import com.rs.game.player.Player;

public class ItemTransportation {

    private static final WorldTile[][] COORDINATES = new WorldTile[][] {
	{ new WorldTile(3316, 3232, 0), new WorldTile(2443, 3089, 0), new WorldTile(2416, 2836, 0), new WorldTile(1701, 5600, 0) }
	, { new WorldTile(2880, 3559, 0), new WorldTile(2519, 3571, 0), new WorldTile(2970, 9679, 0), new WorldTile(2886, 4377, 0), }
	, { new WorldTile(3087, 3496, 0), new WorldTile(2918, 3176, 0), new WorldTile(3105, 3251, 0), new WorldTile(3293, 3163, 0) }
	, { new WorldTile(3087, 3496, 0), new WorldTile(2918, 3176, 0), new WorldTile(3105, 3251, 0), new WorldTile(3293, 3163, 0) }
	, { new WorldTile(2614, 3386, 0), new WorldTile(3032, 3337, 0), new WorldTile(2933, 3291, 0), new WorldTile(3143, 3442, 0) }
	, { new WorldTile(2878, 3542, 0), new WorldTile(3191, 3363, 0), new WorldTile(2606, 3220, 0), new WorldTile(2657, 3238, 0) }
	, { new WorldTile(3356, 3421, 0) }, { new WorldTile(3167, 3492, 0), new WorldTile(2527, 3860, 0) }, { new WorldTile(3353, 3006, 0), new WorldTile(3427, 3538, 0), new WorldTile(2787, 3616, 0), new WorldTile(3150, 4666, 0) }
	, { new WorldTile(4744, 5156, 0), new WorldTile(4599, 5062, 0), new WorldTile(4613, 5128, 0), new WorldTile(4744, 5170, 0) }
	, { new WorldTile(2339, 3171, 0) }, { new WorldTile(3305, 3489, 0) }, { new WorldTile(3423, 2914, 0) }, { new WorldTile(2796, 3082, 0) }
	, { new WorldTile(3170, 2982, 0) }, { new WorldTile(2294, 3626, 0) }, { new WorldTile(2519, 3860, 0) }, { new WorldTile(3054, 3295, 0) }
	, { new WorldTile(3565, 3312, 0), new WorldTile(3491, 3199, 0), new WorldTile(3626, 9618, 0), new WorldTile(3628, 3364, 0), new WorldTile(3633, 9696, 0) } };
    private static final String[] ITEM_NAMES = new String[] { "ring of duelling", "games necklace", "amulet of glory (t", "amulet of glory", "skills necklace", "combat bracelet", "digsite", "ring of wealth", "ring of slaying", "tokkul-zo (charged)", "teleport crystal", "lumber yard", "nardah", "tai bwo wannai", "bandit camp", "phoenix lair", "miscellania", "explorer's ring", "drakan's medallion" };
    private static final String[][] TELEPORT_NAMES = new String[][] { { "Al Kharid Duel Arena", "Castle Wars Arena", "Mobilizing Armies Command Centre", "Fist Of Guthix", "Nowhere" }, { "Burthrope Games Room", "Barbarian Outpost", "Gamers' Grotto", "Corporeal Beast", "Nowhere" }, { "Edgeville", "Karamja", "Draynor Village", "Al Kharid", "Nowhere" }, { "Edgeville", "Karamja", "Draynor Village", "Al Kharid", "Nowhere" }, { "Fishing Guild", "Mining Guild", "Crafting Guild", "Cooking Guild", "Nowhere" }, { "Warrior's Guild", "Champions Guild", "Monastery", "Ranging Guild", "Nowhere" }, { "Digsite", "Nowhere" }, { "Grand Exchange", "Miscellania", "Nowhere" }, { "Sumona's Lair", "Slayer Tower", "Freminek Slayer Dungeon", "Tarn's Lair", "Nowhere" }, { "Main Plaza", "Fight Pits", "Fight Caves", "Fight Kiln", "Nowhere" }, { "Lletya", "Nowhere" }, { "Lumber Yard", "Nowhere" }, { "Nardah", "Nowhere" }, { "Tai Bwo Wannai", "Nowhere" }, { "Bandit camp", "Nowhere" }, { "Phoenix lair", "Nowhere" }, { "Miscellania", "Nowhere" }, { "Cabbage Port", "Nowhere" }, { "Barrows", "Burgh de Rott", "Meiyerditch", "Darkmeyer", "Meiyerditch Labritories" } };
    private static final int[] LOWEST_AMOUNT = new int[] { 2566, 3867, 1706, 10362, 11113, 11126, 11190, 20651, 13288, 23643, 6102, 19480, 19475, 19479, 19476, 19478, 19477, 19760, -1 };
    public static final int EMOTE = 9603, GFX = 1684, SCROLL_EMOTE = 14293,
	    SCROLL_GFX = 94, FIRST_CABBAGE_EMOTE = 804,
	    SECOND_CABBAGE_EMOTE = 803, FIRST_CABBAGE_GFX = 1731,
	    SECOND_CABBAGE_GFX = 1732;

    public static boolean transportationDialogue(Player player, Item item) {
	int index = getIndex(item);
	if (!checkAll(player, item, index, 0, 1))
	    return false;
	player.getDialogueManager().startDialogue("Transportation", TELEPORT_NAMES[index], item.getId());
	return true;
    }

    private static boolean checkAll(Player player, Item item, int index, int optionsIndex, int optionsLength) {
	if (index == -1) 
	    return false;
	if(optionsIndex >= optionsLength) {
	    player.stopAll(); //nowhere option
	    return false;
	}
	else if (hasCharges(index) && !isScrollTeleport(index) && (item.getId() == 10362 || !item.getName().toLowerCase().contains("("))) {
	    player.getPackets().sendGameMessage("Your " + item.getName().toLowerCase() + " has ran out of charges. You need to recharge it if you wish it use it once more.");
	    return false;
	}
	return true;
    }

    public static void sendTeleport(Player player, Item item, int optionIndex, boolean equipmentTeleport) {
	sendTeleport(player, item, optionIndex, equipmentTeleport, 4);
    }

    public static void sendTeleport(Player player, Item item, int optionIndex, boolean equipmentTeleport, int optionslength) {
	int index = getIndex(item);
	if (!checkAll(player, item, index, optionIndex, optionslength))
	    return; 
	if (Magic.sendTeleportSpell(player, getFirstEmote(index), getSecondEmote(index), getFirstGFX(index), getSecondGFX(index), 0, 0, COORDINATES[index][optionIndex], 4, true, Magic.ITEM_TELEPORT)) {
	    if (hasCharges(index)) {
		int newItemId = item.getId() + ((isNegative(index) ? -1 : 1) * (isIncremented(index) ? 2 : 1)), slot = equipmentTeleport ? Equipment.getItemSlot(item.getId()) : player.getInventory().getItems().getThisItemSlot(item);
		if (item.getId() == LOWEST_AMOUNT[index] && destroyOnEmpty(index)) {
		    if (equipmentTeleport)
			player.getEquipment().deleteItem(item.getId(), item.getAmount());
		    else
			player.getInventory().deleteItem(slot, item);
		    player.getPackets().sendGameMessage("Your " + item.getName().toLowerCase().replace(" (1)", "") + " has crumbled to dust.");
		} else {
		    if (newItemId == 20652)
			newItemId = 2572;
		    item.setId(newItemId);
		    if (equipmentTeleport)
			player.getEquipment().refresh(slot);
		    else
			player.getInventory().refresh(slot);
		}
	    } else
		return;
	}
    }

    private static boolean isScrollTeleport(int index) {
	return index >= 11 && index <= 16;
    }

    public static int getFirstEmote(int index) {
	if (isScrollTeleport(index))
	    return SCROLL_EMOTE;
	else if (index == 17)
	    return FIRST_CABBAGE_EMOTE;
	else if (index == 18)
	    return 8939;
	return EMOTE;
    }

    public static int getFirstGFX(int index) {
	if (isScrollTeleport(index))
	    return SCROLL_GFX;
	else if (index == 17)
	    return FIRST_CABBAGE_GFX;
	else if (index == 18)
	    return 1864;
	return GFX;
    }

    public static int getSecondEmote(int index) {
	if (index == 17)
	    return SECOND_CABBAGE_EMOTE;
	else if (index == 18)
	    return 8941;
	return -1;
    }

    public static int getSecondGFX(int index) {
	if (index == 17)
	    return SECOND_CABBAGE_GFX;
	else if (index == 18)
	    return 1864;
	return -1;
    }

    private static int getIndex(Item item) {
	for (int i = 0; i < ITEM_NAMES.length; i++) {
	    if (item.getName().toLowerCase().contains(ITEM_NAMES[i]))
		return i;
	}
	return -1;
    }

    private static boolean hasCharges(int index) {
	if (index == 9 || index == 17 || index == 18)
	    return false;
	return true;
    }

    private static boolean isNegative(int index) {
	return index == 3 || index == 6 || index == 7;
    }

    private static boolean isIncremented(int index) {
	return index == 0 || index == 1 || index == 2 || index == 3 || index == 4 || index == 5 || index == 7;
    }

    private static boolean destroyOnEmpty(int index) {
	return index == 0 || index == 1 || index == 6 || index == 8 || isScrollTeleport(index);
    }
}
