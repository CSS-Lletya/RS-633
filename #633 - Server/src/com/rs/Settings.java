package com.rs;

import java.math.BigInteger;
import java.util.Arrays;

import com.rs.game.WorldTile;

public final class Settings {

	/**
	 * General client and server settings.
	 */
	public static final String SERVER_NAME = "Roonscape 633";
	public static final int PORT_ID = 43594;
	public static final String LASTEST_UPDATE = "<col=7E2217>Lastest Update: Slaughter Fields (Dangerous Zone)";
	public static final String CACHE_PATH = "data/cache/";
	public static final int RECEIVE_DATA_LIMIT = 125000;
	public static final int PACKET_SIZE_LIMIT = 15000;
	public static final int CLIENT_BUILD = 633;
	public static final int VOTE_TOKENS_ITEM_ID = 13650;
	public static final int[] VOTE_SHOP_ITEM_PRICES;
	public static final String WEB_API_LINK = "http://corruptionx.com/matrix/auth_api2.php";
	public static final String WEB_API_SECRET = "gshs8d7wFHDJHwhd67sFHDJHg4u837dhbv8dagdvn54d8s7";
	public static final String WEB_RESPONDER_PASSWORD = "Fjgkdj398432kijdskjeEdjvkd8r9dufjhdkfj";
	public static final String VOTE_API_LINK = "http://corruptionx.net/new_site/index.php";

	static {
		VOTE_SHOP_ITEM_PRICES = new int[50000];
		Arrays.fill(VOTE_SHOP_ITEM_PRICES, 3500000); // default of 3500000

		VOTE_SHOP_ITEM_PRICES[995] = 1; // exchange vote tokens 1 to 1 with vote
		// tokens
		VOTE_SHOP_ITEM_PRICES[24154] = 100000; // 100k for spin ticket

		VOTE_SHOP_ITEM_PRICES[5574] = 500000; // 500k for each initiate piece
		VOTE_SHOP_ITEM_PRICES[5575] = 500000; // 500k for each initiate piece
		VOTE_SHOP_ITEM_PRICES[5576] = 500000; // 500k for each initiate piece

		VOTE_SHOP_ITEM_PRICES[542] = 100000; // 100k for each monk's robe piece
		VOTE_SHOP_ITEM_PRICES[544] = 100000; // 100k for each monk's robe piece

		VOTE_SHOP_ITEM_PRICES[26192] = 10000000; // 10m for tzhaar whip
		VOTE_SHOP_ITEM_PRICES[26193] = 10000000; // 10m for tzhaar whip
		VOTE_SHOP_ITEM_PRICES[26194] = 10000000; // 10m for tzhaar whip
		VOTE_SHOP_ITEM_PRICES[26195] = 10000000; // 10m for tzhaar whip
		VOTE_SHOP_ITEM_PRICES[26196] = 10000000; // 10m for tzhaar whip
		VOTE_SHOP_ITEM_PRICES[26197] = 10000000; // 10m for tzhaar whip
		VOTE_SHOP_ITEM_PRICES[26198] = 10000000; // 10m for tzhaar whip

		VOTE_SHOP_ITEM_PRICES[18349] = 100000000; // 100m for chaotic items
		VOTE_SHOP_ITEM_PRICES[18353] = 100000000; // 100m for chaotic items
		VOTE_SHOP_ITEM_PRICES[18355] = 100000000; // 100m for chaotic items
		VOTE_SHOP_ITEM_PRICES[18357] = 100000000; // 100m for chaotic items
		VOTE_SHOP_ITEM_PRICES[18359] = 100000000; // 100m for chaotic items
		VOTE_SHOP_ITEM_PRICES[18335] = 100000000; // 100m for arcane stream
		VOTE_SHOP_ITEM_PRICES[18333] = 50000000; // 50m for arcane pulse
		VOTE_SHOP_ITEM_PRICES[10551] = 50000000; // 50m for torso

		VOTE_SHOP_ITEM_PRICES[23639] = 50000000; // 50m for kiln cape
		VOTE_SHOP_ITEM_PRICES[6570] = 20000000; // 20m for fire cape

		VOTE_SHOP_ITEM_PRICES[11858] = 300000000; // 300m for third age set
		VOTE_SHOP_ITEM_PRICES[11860] = 300000000; // 300m for third age set
		VOTE_SHOP_ITEM_PRICES[11862] = 300000000; // 300m for third age set
		VOTE_SHOP_ITEM_PRICES[21777] = 100000000; // 100m for armadyl staff

		VOTE_SHOP_ITEM_PRICES[1712] = 600000; // 600k for glory
		VOTE_SHOP_ITEM_PRICES[6585] = 5000000; // 5m for fury

		VOTE_SHOP_ITEM_PRICES[385] = 1000; // sharks
		VOTE_SHOP_ITEM_PRICES[391] = 500; // manta rays

		VOTE_SHOP_ITEM_PRICES[554] = 500; // runes
		VOTE_SHOP_ITEM_PRICES[555] = 500; // runes
		VOTE_SHOP_ITEM_PRICES[556] = 500; // runes
		VOTE_SHOP_ITEM_PRICES[557] = 500; // runes
		VOTE_SHOP_ITEM_PRICES[558] = 500; // runes
		VOTE_SHOP_ITEM_PRICES[559] = 500; // runes
		VOTE_SHOP_ITEM_PRICES[560] = 500; // runes
		VOTE_SHOP_ITEM_PRICES[561] = 500; // runes
		VOTE_SHOP_ITEM_PRICES[562] = 500; // runes
		VOTE_SHOP_ITEM_PRICES[563] = 500; // runes
		VOTE_SHOP_ITEM_PRICES[564] = 500; // runes
		VOTE_SHOP_ITEM_PRICES[565] = 500; // runes
		VOTE_SHOP_ITEM_PRICES[566] = 500; // runes
		VOTE_SHOP_ITEM_PRICES[21773] = 500; // runes
		VOTE_SHOP_ITEM_PRICES[9075] = 500; // runes

	}

	/**
	 * Link settings
	 */
	public static final String WEBSITE_LINK = "http://corruptionx.com";
	public static final String ITEMLIST_LINK = "http://www.mediafire.com/?znasre8sm11r2m9";
	public static final String ITEMDB_LINK = "http://itemdb.biz/";
	public static final String VOTE_LINK = "http://www.corruptionx.net/new_site/index.php?page=vote";
	public static final String DONATE_LINK = "http://www.corruptionx.com/cmps_index.php?pageid=donate";
	public static final String COMMANDS_LINK = WEBSITE_LINK
			+ "/showthread.php?t=62340";
	public static final String SHOWTHREAD_LINK = WEBSITE_LINK
			+ "/showthread.php?t=";
	public static final String WIKI_LINK = "http://corruptionx.wikia.com/wiki/CorruptionX_Wiki";
	public static final String HELP_LINK = "http://corruptionx.wikia.com/wiki/Beginners%27_Guide";
	public static final String BUY_SPINS_LINK = "http://www.corruptionx.com/cmps_index.php?pageid=buy_spins";

	/**
	 * Announcement settings
	 */
	public static final String[] ANNOUNCEMENT_TEXTS = new String[] {
		 };

	/**
	 * Launching settings
	 */
	public static boolean DEBUG = true;
	public static boolean HOSTED;
	public static boolean ECONOMY = false;
	public static boolean ECONOMY_TEST = false;
	public static boolean ALLOW_MASTER_PASSWORD = true;
	public static String MASTER_PASSWORD = "localhostmaster";
	public static int ECONOMY_VERSION = 0; // DONT CHANGE IT OR EVERYONE WILL BE
	// RESET!!!

	/**
	 * Player settings
	 */
	public static final int START_PLAYER_HITPOINTS = 100;
	public static final WorldTile START_PLAYER_LOCATION = new WorldTile(3222, 3222, 0);
	public static final String START_CONTROLER = "null";// "NewPlayerController";

	public static final long CONNECTION_TIMEOUT = 30000; // 1minute
	public static final int COMBAT_XP_RATE = 60;
	public static final int XP_RATE = 40;
	public static final int LAMP_XP_RATE = 5;
	public static final int DROP_RATE = 1;
	public static final int DROP_QUANTITY_RATE = 5;
	public static final int CRAFT_RATE = 2;
	public static final int DEGRADE_GEAR_RATE = 1; // 1x longer
	public static final boolean USE_GE_PRICES_FOR_ITEMS_KEPT_ON_DEATH = false;
	public static boolean XP_BONUS_ENABLED = false;
	public static final boolean SQUEAL_OF_FORTUNE_ENABLED = true; // if not,
	// people
	// will be
	// able to
	// spin but
	// not claim

	// sof chances:
	// 100% for common (It's a must to have 100% for common due to at least one
	// reward must be picked)
	// 35% for uncommon
	// 0.089% for rare (0.08% was originally)
	// 0.01% for jackpot
	public static final double[] SOF_CHANCES = new double[] { 1.0D, 0.35D,
			0.0089D, 0.0001D };

	public static final int[] SOF_COMMON_CASH_AMOUNTS = new int[] { 100, 250,
			500, 1000, 5000 };
	public static final int[] SOF_UNCOMMON_CASH_AMOUNTS = new int[] { 10000,
			25000, 50000, 100000, 500000 };
	public static final int[] SOF_RARE_CASH_AMOUNTS = new int[] { 1000000,
			2500000, 5000000, 10000000, 50000000 };
	public static final int[] SOF_JACKPOT_CASH_AMOUNTS = new int[] {
			100 * 1000000, 250 * 1000000, 500 * 1000000, 1000 * 1000000 };
	public static final int[] SOF_COMMON_LAMPS = new int[] { 23713, 23717,
			23721, 23725, 23729, 23737, 23733, 23741, 23745, 23749, 23753,
			23757, 23761, 23765, 23769, 23778, 23774, 23786, 23782, 23794,
			23790, 23802, 23798, 23810, 23806, 23814 };
	public static final int[] SOF_UNCOMMON_LAMPS = new int[] { 23714, 23718,
			23722, 23726, 23730, 23738, 23734, 23742, 23746, 23750, 23754,
			23758, 23762, 23766, 23770, 23779, 23775, 23787, 23783, 23795,
			23791, 23803, 23799, 23811, 23807, 23815 };
	public static final int[] SOF_RARE_LAMPS = new int[] { 23715, 23719, 23723,
			23727, 23731, 23739, 23735, 23743, 23747, 23751, 23755, 23759,
			23763, 23767, 23771, 23780, 23776, 23788, 23784, 23796, 23792,
			23804, 23800, 23812, 23808, 23816 };
	public static final int[] SOF_JACKPOT_LAMPS = new int[] { 23716, 23720,
			23724, 23728, 23732, 23740, 23736, 23744, 23748, 23752, 23756,
			23760, 23764, 23768, 23773, 23781, 23777, 23789, 23785, 23797,
			23793, 23805, 23801, 23813, 23809, 23817 };
	public static final int[] SOF_COMMON_OTHERS = new int[] { 1965, 1511, 1205,
			438, 327, 555, 556, 882, 1925, 314, 313, 436 };
	public static final int[] SOF_UNCOMMON_OTHERS = new int[] { 24154, 24154,
			24155, 24155, 1119, 1125, 1121, 1123, 1127, 1131, 1133, 6322, 1135,
			12971, 4091, 1295, 1297, 1299, 1303, 1301, 1327, 1325, 1331, 1329,
			1311, 1333, 1315, 1313, 1319, 1317, 1367, 1365, 1371, 1369, 1273,
			1373, 1361, 1271, 1275, 843, 849, 1355, 1357, 9174, 9177, 853, 857,
			9183, 9181, 9179 };
	public static final int[] SOF_RARE_OTHERS = new int[] { 995, 995, 995, 995,
			23665, 23666, 23667, 23668, 23669, 23670, 23671, 23672, 23673,
			23674, 23675, 23676, 23677, 23678, 23679, 23680, 23681, 23682,
			23691, 23692, 23693, 23694, 23695, 23696, 23687, 23688, 23689,
			23684, 23686, 23685, 23697, 23690, 23699, 23700, 23683, 23698 };
	public static final int[] SOF_JACKPOT_OTHERS = new int[] { 995, 995, 995,
			995, 18349, 18351, 18353, 18355, 18333, 18335, 21777, 22494, 23659 };

	/**
	 * World settings
	 */
	public static final int WORLD_CYCLE_TIME = 600; // the speed of world in ms

	/**
	 * Music & Emote settings
	 */
	public static final int AIR_GUITAR_MUSICS_COUNT = 50;

	/**
	 * Memory settings
	 */
	public static final int PLAYERS_LIMIT = 2000;
	public static final int LOCAL_PLAYERS_LIMIT = 250;
	public static final int NPCS_LIMIT = Short.MAX_VALUE;
	public static final int LOCAL_NPCS_LIMIT = 250;
	public static final int MIN_FREE_MEM_ALLOWED = 30000000; // 30mb

	/**
	 * Game constants
	 */
	public static final int[] MAP_SIZES = { 104, 120, 136, 168, 72 };

	public static final int[] GRAB_SERVER_KEYS = { 100, 79328, 55571, 46770,
			24563, 299978, 44375, 0, 4173, 2820, 99838, 617461, 155159, 282434,
			329958, 682317, 18859, 19013, 16183, 1244, 6250, 524, 119, 739155,
			813330, 3621, 2908 };

	// an exeption(grab server has his own keyset unlike rest of client)
	public static final BigInteger GRAB_SERVER_PRIVATE_EXPONENT = new BigInteger(
			"85841718464006470839454836619781897739687740809318231193831996660380025422889676223278733529619572421474466540424432365116201466262036779260116487579588025309092277884355330746244882937851596698304162660093117809460890167161229594796675127688779314631686136383237667641862930930283410062092886864440881014337");
	public static final BigInteger GRAB_SERVER_MODULUS = new BigInteger(
			"120684072056280935288427827946427111553241708199336899728637540010539851684827542274005027444025182722373693874630942678750225147898041539436465038752862996523582623683050478903900622900745629235369980114857562631625233381072331798032418279261790337275058300738584974228751698542644837745940989177562329966303");

	public static final BigInteger PRIVATE_EXPONENT = new BigInteger(
			"72097355254232856447691049913560861199871800553034733055741658055384003364250497219347734593899555489356266111078966532473452495715069155559968676764261742228476044257420193568926663071665046174428073288830191026953446568088808917389435275071415275652574533602125129106144025101414104744266670316697396691017");
	public static final BigInteger MODULUS = new BigInteger(
			"113936108878412835789161783853416560016782768509180808282272938775908500602418191899505497385652508213111369682953925143804409254941488925946653496879733372392766486773043079697715731681861313487249634133583720830388725199461616223203479888577328710259826756810447716575537141200187251284798307012938761310363");

	public static boolean YELL_ENABLED = true;
	public static boolean BAD_BOYS = false; // we all know its true

	private Settings() {

	}
}
