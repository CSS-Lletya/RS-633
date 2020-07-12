package com.rs.game.player;

import java.io.Serializable;

public class TreasureTrailsManager implements Serializable {

    private static final long serialVersionUID = 9153704778933553926L;

    private static final int EASY = 0, MEDIUM = 1, HARD = 2, ELITE = 3;

    private Clue[] clues;
    private int[] cluesCount;
    private transient Player player;

    public TreasureTrailsManager() {
	clues = new Clue[ELITE + 1];
	cluesCount = new int[ELITE + 1];
    }

    private static final int COORDINATE = 0, EMOTE = 1, MAP = 2, SIMPLE = 3,
	    ANAGRAM = 5, UNUSED = -1;
    private static final int TILE = 0, OBJECT = 1, NPC = 2;
    private static final int NORTH = 0, SOUTH = 1, WEST = 2, EAST = 3;

    private static enum ClueDetails {
	// simple clues
	SIMPLE_A_1(EASY, SIMPLE, OBJECT, 2609, "A crate found in the tower of a church is your next location."), SIMPLE_D_1(MEDIUM, SIMPLE, OBJECT, 24911, "A town with a different sort of night-life is your destination", "Search for some crates in one of the houses."), SIMPLE_G_1(EASY, SIMPLE, TILE, 3935665, "Dig near some giant mushrooms behind", "the Grand Tree."), SIMPLE_L_1(EASY, SIMPLE, OBJECT, 37011, "Go to the village being attacked by trolls and search the", "drawers in one of the houses."), SIMPLE_N_1(MEDIUM, SIMPLE, OBJECT, 10159, "North of the best monkey restaurant on Karamja,", "look for the centre of the triangle of boats and", "search there."), SIMPLE_O_1(EASY, SIMPLE, NPC, 376, "One of the sailors in Port Sarim is your", "next destination."), SIMPLE_S_1(EASY, SIMPLE, OBJECT, 66875, "Search a barrel near the Combat.", "Skill SlayerMasterD at the combat", "training area, in Burthorpe."), SIMPLE_S_2(EASY, SIMPLE, OBJECT, 66875, "Search a barrel outside the Pick", "and Lute inn, in Taverley."), SIMPLE_S_3(EASY, SIMPLE, OBJECT, 66875, "Search a barrel outside the mill,", "in Taverley."), SIMPLE_S_4(EASY, SIMPLE, OBJECT, 40093, "Search chests found in the ,", "upstairs of shops in Port Sarim."), SIMPLE_S_5(EASY, SIMPLE, OBJECT, 48998, "Search for a crate in a building in", "Hemenster."), SIMPLE_S_6(EASY, SIMPLE, OBJECT, 46266, "Search for a crate in Varrock", "Palace."), SIMPLE_S_7(EASY, SIMPLE, OBJECT, 25775, "Search for a crate on the ground", "floor of a house in Seers' Village."), SIMPLE_S_8(EASY, SIMPLE, OBJECT, 11745, "Search in the basement of the", "Artisan Dwarves' workshop in", "Falador."), SIMPLE_S_9(EASY, SIMPLE, OBJECT, 76811, "Search the boxes in one of the", "tents in Al Kharid."), SIMPLE_S_10(EASY, SIMPLE, OBJECT, 46237, "Search the boxes in the Goblin", "house near Lumbridge."), SIMPLE_S_11(EASY, SIMPLE, OBJECT, 46236, "Search the boxes in the house", "near the South entrance of", "Varrock."), SIMPLE_S_12(EASY, SIMPLE, OBJECT, 34586, "Search the crate just outside", "the Armour shop in east", "Ardougne."), SIMPLE_S_13(EASY, SIMPLE, OBJECT, 76811, "Search the crates in the house in", "Al Kharid with racks of silk."), SIMPLE_S_14(EASY, SIMPLE, OBJECT, 11745, "Search the crates of Falador's", "general store."), SIMPLE_S_15(EASY, SIMPLE, OBJECT, 37010, "Search the chest in the Duke of", "Lumbridge's bedroom."), SIMPLE_S_16(EASY, SIMPLE, OBJECT, 25593, "Search the chest in the left-hand", "tower of Camelot castle."), SIMPLE_S_17(EASY, SIMPLE, OBJECT, 30928, "Search the chests in the", "Dwarven Mine."), SIMPLE_S_18(EASY, SIMPLE, OBJECT, 76216, "Search the chests in Al", "Kharid palace."), SIMPLE_S_19(EASY, SIMPLE, OBJECT, 21806, "Search the crate in the left-hand ", "tower of Lumbridge castle."), SIMPLE_S_20(EASY, SIMPLE, OBJECT, 46270, "Search the crate near a cart in", "Port Khazard."), SIMPLE_S_21(EASY, SIMPLE, OBJECT, 24202, "Search the crates in a house in", "Yanille that has a piano.")
	// no longer exists,SIMPLE_S_22(EASY, SIMPLE, OBJECT, -1,
	// "Search the crates in a shop in", "Taverley.")
	, SIMPLE_S_23(EASY, SIMPLE, OBJECT, 24911, "Search the crates in Canifis."), SIMPLE_S_24(EASY, SIMPLE, OBJECT, 47560, "Search the crates in Draynor", "Manor."), SIMPLE_S_25(EASY, SIMPLE, OBJECT, 34585, "Search the crates in East", "Ardougne's general store."), SIMPLE_S_26(EASY, SIMPLE, OBJECT, 46269, "Search the crates in Horvik's", "armoury."), SIMPLE_S_27(EASY, SIMPLE, OBJECT, 11600, "Search the crates in", "Gunnarsgrunn (Barbarian Village)", "helmet shop."), SIMPLE_S_28(EASY, SIMPLE, OBJECT, 34585, "Search the crates in the guard", "house of the northern gate of", "East Ardougne."), SIMPLE_S_29(EASY, SIMPLE, OBJECT, 76811, "Search the crates in the", "northernmost house in Al Kharid."), SIMPLE_S_30(EASY, SIMPLE, OBJECT, 40021, "Search the crates in the Port", "Sarim fishing shop."), SIMPLE_S_31(EASY, SIMPLE, OBJECT, 34586, "Search the crates in the shed", "just north of east Ardougne."), SIMPLE_S_32(EASY, SIMPLE, OBJECT, 46269, "Search the crates near a cart in", "Varrock."), SIMPLE_S_33(EASY, SIMPLE, OBJECT, 24294, "Search the drawers above", "Varrock's shops."), SIMPLE_S_34(EASY, SIMPLE, OBJECT, 34482, "Search the drawers found", "upstairs in the houses of East", "Ardougne."), SIMPLE_S_35(EASY, SIMPLE, OBJECT, 2631, "Search the drawers in a house in", "Draynor Village."), SIMPLE_S_36(EASY, SIMPLE, OBJECT, 348, "Search the drawers in Falador's", "chainmail shop."), SIMPLE_S_37(EASY, SIMPLE, OBJECT, 33931, "Search the drawers in Catherby's", "Archery Shop."), SIMPLE_S_38(EASY, SIMPLE, OBJECT, 24294, "Search the drawers in one of", "Gertrude's bedrooms."), SIMPLE_S_39(EASY, SIMPLE, OBJECT, 350, "Search the drawers in the ground", "floor of a shop in Yanille."), SIMPLE_S_40(EASY, SIMPLE, OBJECT, 33931, "Search the drawers in the", "upstairs of a house in Catherby."), SIMPLE_S_41(EASY, SIMPLE, OBJECT, 24294, "Search the drawers upstairs in", "the bank to the East of Varrock."), SIMPLE_S_42(EASY, SIMPLE, OBJECT, 37011, "Search the drawers of houses in", "Burthorpe."), SIMPLE_S_43(EASY, SIMPLE, OBJECT, 34482, "Search the drawers on the first", "floor of a building overlooking", "Ardougne market."), SIMPLE_S_44(EASY, SIMPLE, OBJECT, 348, "Search the drawers upstairs in", "Falador's shield shop."), SIMPLE_S_45(EASY, SIMPLE, OBJECT, 11745, "Search the crates upstairs of", "houses in eastern part of", "Falador.")
	// no longer exists, ,SIMPLE_S_46(EASY, SIMPLE, OBJECT, -1,
	// "Search the tents in the imperial", "guard camp in Burthorpe for",
	// "some boxes.")
	, SIMPLE_S_47(MEDIUM, SIMPLE, OBJECT, 348, "Search the upstairs drawers of a", "house in a village were pirates", "are known to have a good time."), SIMPLE_S_48(EASY, SIMPLE, OBJECT, 375, "Search through chests found in", "the upstairs of houses in eastern", "Falador.")
	// no longer exists, ,SIMPLE_S_49(EASY, SIMPLE, OBJECT, -1,
	// "Search through some drawers", "found in Taverley's houses.")
	, SIMPLE_S_50(EASY, SIMPLE, OBJECT, 352, "Search through some drawers in ", "the upstairs of a house in", "Rimmington."), SIMPLE_S_51(EASY, SIMPLE, OBJECT, 25766, "Search upstairs in the houses of", "Seers' Village for some drawers."), SIMPLE_S_52(EASY, SIMPLE, NPC, 969, "Someone watching the fights in", "the duel arena is your next", "destination."), SIMPLE_S_53(MEDIUM, SIMPLE, NPC, 635, "Speak to a referee."), SIMPLE_S_54(EASY, SIMPLE, NPC, 563, "Speak to Arhein in Catherby."), SIMPLE_S_55(MEDIUM, SIMPLE, NPC, 171, "Speak to Brimstail."), SIMPLE_S_56(EASY, SIMPLE, NPC, 806, "Speak to Donovan the Family", "Handyman."), SIMPLE_S_57(EASY, SIMPLE, NPC, 284, "Speak to Doric who lives north of", "Falador."), SIMPLE_S_58(EASY, SIMPLE, NPC, 2824, "Speak to Ellis in Al Kharid."), SIMPLE_S_59(EASY, SIMPLE, NPC, 586, "Speak to Gaius in Burthorpe."), SIMPLE_S_60(MEDIUM, SIMPLE, NPC, 510, "Speak to Hajedy."), SIMPLE_S_61(EASY, SIMPLE, NPC, 0, "Speak to Hans."), SIMPLE_S_62(MEDIUM, SIMPLE, NPC, 669, "Speak to Hazelmere."), SIMPLE_S_63(EASY, SIMPLE, NPC, 918, "Speak to Ned in Draynor Village."), SIMPLE_S_64(EASY, SIMPLE, NPC, 1042, "Speak to Roavar."), SIMPLE_S_65(EASY, SIMPLE, NPC, 241, "Speak to Sir Kay in Camelot", "Castle."), SIMPLE_S_66(EASY, SIMPLE, NPC, 733, "Speak to the bartender of the", "Blue Moon Inn in Varrock."), SIMPLE_S_67(EASY, SIMPLE, NPC, 809, "Speak to the staff of Sinclair", "Mansion."), SIMPLE_S_68(EASY, SIMPLE, NPC, 1054, "Speak to Ulizius."), SIMPLE_T_1(EASY, SIMPLE, NPC, 734, "Talk to the bartender of the Rusty", "Anchor in Port Sarim."), SIMPLE_T_2(EASY, SIMPLE, NPC, 606, "Talk to the Squire in the White", "Knights' castle in Falador."), SIMPLE_T_3(EASY, SIMPLE, NPC, 541, "Talk to Zeke in Al Kharid."), SIMPLE_T_4(MEDIUM, SIMPLE, TILE, 54988211, "The treasure is buried in a small", "building full of bones. Here is a hint: ", "it's not near a graveyard.")

	, COORDINATE_00_1(HARD, COORDINATE, TILE, UNUSED, 0, 0, NORTH, 7, 13, WEST) // fight
										    // here
	, COORDINATE_00_2(MEDIUM, COORDINATE, TILE, UNUSED, 0, 5, SOUTH, 1, 13, EAST)

	, COORDINATE_00_3(MEDIUM, COORDINATE, TILE, UNUSED, 0, 13, SOUTH, 13, 58, EAST)

	, COORDINATE_00_4(MEDIUM, COORDINATE, TILE, UNUSED, 0, 18, SOUTH, 9, 28, EAST)

	, COORDINATE_00_5(MEDIUM, COORDINATE, TILE, UNUSED, 0, 20, SOUTH, 23, 15, EAST)

	, COORDINATE_00_6(MEDIUM, COORDINATE, TILE, UNUSED, 0, 30, NORTH, 24, 16, EAST)

	, COORDINATE_00_7(MEDIUM, COORDINATE, TILE, UNUSED, 0, 31, SOUTH, 17, 43, EAST)

	, COORDINATE_00_8(MEDIUM, COORDINATE, TILE, UNUSED, 1, 18, SOUTH, 14, 15, EAST)

	, COORDINATE_00_9(MEDIUM, COORDINATE, TILE, UNUSED, 1, 24, NORTH, 8, 5, WEST)

	, COORDINATE_00_10(MEDIUM, COORDINATE, TILE, UNUSED, 1, 26, NORTH, 8, 1, EAST)

	, COORDINATE_00_11(MEDIUM, COORDINATE, TILE, UNUSED, 1, 35, SOUTH, 7, 28, EAST)

	, COORDINATE_00_12(MEDIUM, COORDINATE, TILE, UNUSED, 2, 46, NORTH, 29, 11, EAST)

	, COORDINATE_00_13(MEDIUM, COORDINATE, TILE, UNUSED, 2, 48, NORTH, 22, 30, EAST)

	, COORDINATE_00_14(MEDIUM, COORDINATE, TILE, UNUSED, 2, 50, NORTH, 6, 20, EAST)

	, COORDINATE_00_15(MEDIUM, COORDINATE, TILE, UNUSED, 3, 35, SOUTH, 13, 35, EAST)

	, COORDINATE_00_16(HARD, COORDINATE, TILE, UNUSED, 3, 45, SOUTH, 22, 45, EAST) // fight
										       // here
	, COORDINATE_00_17(MEDIUM, COORDINATE, TILE, UNUSED, 4, 0, SOUTH, 12, 46, EAST)

	, COORDINATE_00_18(HARD, COORDINATE, TILE, UNUSED, 4, 3, SOUTH, 3, 11, EAST) // fight
										     // here
	, COORDINATE_00_19(HARD, COORDINATE, TILE, UNUSED, 4, 5, SOUTH, 4, 24, EAST) // fight
										     // here
	, COORDINATE_00_20(MEDIUM, COORDINATE, TILE, UNUSED, 4, 13, NORTH, 12, 45, EAST)

	, COORDINATE_00_21(HARD, COORDINATE, TILE, UNUSED, 4, 16, SOUTH, 16, 16, EAST) // fight
										       // here
	, COORDINATE_00_22(HARD, COORDINATE, TILE, UNUSED, 4, 41, NORTH, 3, 9, WEST) // fight
										     // here
	, COORDINATE_00_23(MEDIUM, COORDINATE, TILE, UNUSED, 5, 20, SOUTH, 3, 9, EAST)

	, COORDINATE_00_24(HARD, COORDINATE, TILE, UNUSED, 5, 37, NORTH, 31, 15, EAST) // fight
										       // here
	, COORDINATE_00_25(MEDIUM, COORDINATE, TILE, UNUSED, 5, 43, NORTH, 23, 5, EAST)

	, COORDINATE_00_26(HARD, COORDINATE, TILE, UNUSED, 5, 50, SOUTH, 10, 5, EAST) // fight
										      // here
	, COORDINATE_00_27(HARD, COORDINATE, TILE, UNUSED, 6, 0, SOUTH, 21, 48, EAST) // fight
										      // here
	, COORDINATE_00_28(HARD, COORDINATE, TILE, UNUSED, 6, 11, SOUTH, 15, 7, EAST) // fight
										      // here
	, COORDINATE_00_29(MEDIUM, COORDINATE, TILE, UNUSED, 6, 31, NORTH, 1, 46, WEST)

	, COORDINATE_00_30(MEDIUM, COORDINATE, TILE, UNUSED, 7, 5, NORTH, 30, 56, EAST)

	, COORDINATE_00_31(MEDIUM, COORDINATE, TILE, UNUSED, 7, 33, NORTH, 15, 0, EAST)

	, COORDINATE_00_32(HARD, COORDINATE, TILE, UNUSED, 7, 43, SOUTH, 12, 26, EAST) // fight
										       // here
	, COORDINATE_00_33(HARD, COORDINATE, TILE, UNUSED, 8, 3, NORTH, 31, 16, EAST) // fight
										      // here
	, COORDINATE_00_34(HARD, COORDINATE, TILE, UNUSED, 8, 5, SOUTH, 15, 56, EAST) // fight
										      // here
	, COORDINATE_00_35(HARD, COORDINATE, TILE, UNUSED, 8, 26, SOUTH, 10, 28, EAST) // fight
										       // here
	, COORDINATE_00_36(MEDIUM, COORDINATE, TILE, UNUSED, 8, 33, NORTH, 1, 39, WEST)

	, COORDINATE_00_37(MEDIUM, COORDINATE, TILE, UNUSED, 9, 33, NORTH, 2, 15, EAST)

	, COORDINATE_00_38(MEDIUM, COORDINATE, TILE, UNUSED, 9, 48, NORTH, 17, 39, EAST)

	, COORDINATE_00_39(MEDIUM, COORDINATE, TILE, UNUSED, 11, 3, NORTH, 31, 20, EAST)

	, COORDINATE_00_40(MEDIUM, COORDINATE, TILE, UNUSED, 11, 5, NORTH, 0, 45, WEST)

	, COORDINATE_00_41(MEDIUM, COORDINATE, TILE, UNUSED, 11, 41, NORTH, 14, 58, EAST)

	, COORDINATE_00_42(HARD, COORDINATE, TILE, UNUSED, 12, 48, NORTH, 20, 20, EAST) // fight
											// here
	, COORDINATE_00_43(HARD, COORDINATE, TILE, UNUSED, 13, 46, NORTH, 21, 1, EAST) // fight
										       // here
	, COORDINATE_00_44(MEDIUM, COORDINATE, TILE, UNUSED, 14, 54, NORTH, 9, 13, EAST)

	, COORDINATE_00_45(HARD, COORDINATE, TILE, UNUSED, 15, 48, NORTH, 13, 52, EAST) // fight
											// here
	, COORDINATE_00_46(HARD, COORDINATE, TILE, UNUSED, 16, 3, NORTH, 14, 7, EAST) // fight
										      // here
	, COORDINATE_00_47(HARD, COORDINATE, TILE, UNUSED, 16, 20, NORTH, 12, 45, EAST) // fight
											// here
	, COORDINATE_00_48(HARD, COORDINATE, TILE, UNUSED, 16, 35, NORTH, 27, 1, EAST) // fight
										       // here
	, COORDINATE_00_49(HARD, COORDINATE, TILE, UNUSED, 16, 43, NORTH, 19, 11, EAST) // fight
											// here
	, COORDINATE_00_50(HARD, COORDINATE, TILE, UNUSED, 17, 50, NORTH, 8, 30, EAST) // fight
										       // here
	, COORDINATE_00_51(HARD, COORDINATE, TILE, UNUSED, 18, 3, NORTH, 25, 16, EAST) // fight
										       // here
	, COORDINATE_00_52(HARD, COORDINATE, TILE, UNUSED, 18, 22, NORTH, 16, 33, EAST) // fight
											// here
	, COORDINATE_00_53(HARD, COORDINATE, TILE, UNUSED, 19, 43, NORTH, 25, 7, EAST) // fight
										       // here
	, COORDINATE_00_54(HARD, COORDINATE, TILE, UNUSED, 20, 5, NORTH, 21, 52, EAST) // fight
										       // here
	, COORDINATE_00_55(HARD, COORDINATE, TILE, UNUSED, 20, 7, NORTH, 18, 33, EAST) // fight
										       // here
	, COORDINATE_00_56(HARD, COORDINATE, TILE, UNUSED, 20, 33, NORTH, 15, 48, EAST) // fight
											// here
	, COORDINATE_00_57(HARD, COORDINATE, TILE, UNUSED, 21, 24, NORTH, 17, 54, EAST) // fight
											// here
	, COORDINATE_00_58(MEDIUM, COORDINATE, TILE, UNUSED, 22, 30, NORTH, 3, 1, EAST)

	, COORDINATE_00_59(HARD, COORDINATE, TILE, UNUSED, 22, 35, NORTH, 19, 18, EAST) // fight
											// here
	, COORDINATE_00_60(HARD, COORDINATE, TILE, UNUSED, 22, 45, NORTH, 26, 33, EAST) // fight
											// here
	, COORDINATE_00_61(HARD, COORDINATE, TILE, UNUSED, 24, 24, NORTH, 26, 24, EAST) // fight
											// here
	, COORDINATE_00_62(HARD, COORDINATE, TILE, UNUSED, 24, 56, NORTH, 22, 28, EAST) // fight
											// here
	, COORDINATE_00_63(HARD, COORDINATE, TILE, UNUSED, 24, 58, NORTH, 18, 43, EAST) // fight
											// here
	, COORDINATE_00_64(HARD, COORDINATE, TILE, UNUSED, 25, 3, NORTH, 17, 5, EAST) // fight
										      // here
	, COORDINATE_00_65(HARD, COORDINATE, TILE, UNUSED, 25, 3, NORTH, 23, 24, EAST) // fight
										       // here
	, ANAGRAM_A_1(HARD, ANAGRAM, NPC, -1, "A Zen ", "She")

	;

	// ,SIMPLE_S_0(EASY, SIMPLE, OBJECT, -1, "")
	private ClueDetails(int level, int type, int idType, int id, Object... parameters) {

	}
    }

    private static class Clue implements Serializable {

	private static final long serialVersionUID = -1028796694563388699L;

	private ClueDetails details;
	private int cluesCount;

	public Clue(ClueDetails details, int cluesCount) {
	    this.details = details;
	    this.cluesCount = cluesCount;
	}
    }
}
