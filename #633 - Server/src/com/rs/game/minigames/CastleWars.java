package com.rs.game.minigames;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;

import com.rs.Settings;
import com.rs.cache.loaders.ClientScriptMap;
import com.rs.cores.CoresManager;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.npc.others.CastleWarBarricade;
import com.rs.game.player.Equipment;
import com.rs.game.player.Player;
import com.rs.game.player.content.Foods.Food;
import com.rs.game.player.controllers.castlewars.CastleWarsPlaying;
import com.rs.game.player.dialogues.impl.CastleWarsScoreboard;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.net.decoders.WorldPacketsDecoder;
import com.rs.utils.ItemExamines;

public final class CastleWars {
    public static final int CW_TICKET = 4067;
    public static final int SARADOMIN = 0;
    public static final int ZAMORAK = 1;
    private static final int GUTHIX = 2;
    @SuppressWarnings("unchecked")
    private static final List<Player>[] waiting = new List[2];
    @SuppressWarnings("unchecked")
    private static final List<Player>[] playing = new List[2];
    private static int[] seasonWins = new int[2];
    public static final WorldTile LOBBY = new WorldTile(2442, 3090, 0),
	    SARA_WAITING = new WorldTile(2381, 9489, 0),
	    ZAMO_WAITING = new WorldTile(2421, 9523, 0),
	    SARA_BASE = new WorldTile(2426, 3076, 1),
	    ZAMO_BASE = new WorldTile(2373, 3131, 1);

    private static PlayingGame playingGame;
    private static final Map<Integer, Integer> rewards = new HashMap<Integer, Integer>();
    

    static {
	init();
    }

    public static void init() {
	for (int i = 0; i < waiting.length; i++)
	    waiting[i] = Collections.synchronizedList(new LinkedList<Player>());
	for (int i = 0; i < playing.length; i++)
	    playing[i] = Collections.synchronizedList(new LinkedList<Player>());
	rewards.put(178, 4069);
	rewards.put(58, 18735);
	rewards.put(57, 18731);
	rewards.put(56, 18715);
	rewards.put(183, 4070);
	rewards.put(118, 3847);
	rewards.put(117, 18747);
	rewards.put(49, 18712);
	rewards.put(116, 18746);
	rewards.put(48, 18711);
	rewards.put(115, 18745);
	rewards.put(55, 18714);
	rewards.put(114, 18744);
	rewards.put(54, 18713);
	rewards.put(113, 18743);
	rewards.put(188, 4072);
	rewards.put(112, 18742);
	rewards.put(110, 18740);
	rewards.put(163, 4511);
	rewards.put(111, 18741);
	rewards.put(108, 4515);
	rewards.put(109, 18739);
	rewards.put(167, 4508);
	rewards.put(47, 18710);
	rewards.put(166, 4512);
	rewards.put(165, 4510);
	rewards.put(164, 4509);
	rewards.put(171, 18709);
	rewards.put(103, 4513);
	rewards.put(170, 18707);
	rewards.put(169, 18706);
	rewards.put(168, 18708);
	rewards.put(98, 4516);
	rewards.put(173, 4071);
	rewards.put(172, 18705);
	rewards.put(93, 4514);
	rewards.put(213, 4507);
	rewards.put(208, 4505);
	rewards.put(7, 21531);
	rewards.put(218, 4503);
	rewards.put(198, 4506);
	rewards.put(193, 4068);
	rewards.put(203, 4504);
	rewards.put(263, 21531);
    }

    public static void viewScoreBoard(Player player) {
	player.getInterfaceManager().sendChatBoxInterface(55);
	player.getPackets().sendIComponentText(55, 1, "Saradomin: " + seasonWins[SARADOMIN]);
	player.getPackets().sendIComponentText(55, 2, "Zamorak: " + seasonWins[ZAMORAK]);
    }

    public static int getPowerfullestTeam() {
	int zamorak = waiting[ZAMORAK].size() + playing[ZAMORAK].size();
	int saradomin = waiting[SARADOMIN].size() + playing[SARADOMIN].size();
	if (saradomin == zamorak)
	    return GUTHIX;
	if (zamorak > saradomin)
	    return ZAMORAK;
	return SARADOMIN;
    }

    public static void joinPortal(Player player, int team) {
	if (player.getEquipment().getHatId() != -1 || player.getEquipment().getCapeId() != -1) {
	    player.getPackets().sendGameMessage("You cannot wear hats, capes or helms in the arena.");
	    return;
	}
	if (player.containsOneItem(4037, 4039)) {
	    player.getPackets().sendGameMessage("You cannot take flags in the arena.");
	    return;
	}
	for (Item item : player.getInventory().getItems().getItems()) {
	    if (item == null)
		continue;
	    if (Food.forId(item.getId()) != null) {
		player.getPackets().sendGameMessage("You cannot bring food into the arena.");
		return;
	    }
	}
	int powerfullestTeam = getPowerfullestTeam();
	if (team == GUTHIX) {
	    team = powerfullestTeam == ZAMORAK ? SARADOMIN : ZAMORAK;
	} else if (team == powerfullestTeam) {
	    if (team == ZAMORAK)
		player.getPackets().sendGameMessage("The Zamorak team is powerful enough already! Guthix demands balance - join the Saradomin team instead!");
	    else if (team == SARADOMIN)
		player.getPackets().sendGameMessage("The Saradomin team is powerful enough already! Guthix demands balance - join the Zamorak team instead!");
	    return;
	}
	player.lock(2);
	player.stopAll();
	waiting[team].add(player);
	setCape(player, new Item(team == ZAMORAK ? 4042 : 4041));
	setHood(player, new Item(team == ZAMORAK ? 4515 : 4513));
	player.getControlerManager().startControler("CastleWarsWaiting", team);
	player.setNextWorldTile(new WorldTile(team == ZAMORAK ? ZAMO_WAITING : SARA_WAITING, 1));
	player.getMusicsManager().playMusic(318); // temp testing else 5
	if (playingGame == null && waiting[team].size() >= 3) // at least
	    // 9players to
	    // start
	    createPlayingGame();
	else
	    refreshTimeLeft(player);
	// You cannot take non-combat items into the arena
    }

    public static void setHood(Player player, Item hood) {
	player.getEquipment().getItems().set(Equipment.SLOT_HAT, hood);
	player.getEquipment().refresh(Equipment.SLOT_HAT);
	player.getAppearence().generateAppearenceData();
    }

    public static void setCape(Player player, Item cape) {
	player.getEquipment().getItems().set(Equipment.SLOT_CAPE, cape);
	player.getEquipment().refresh(Equipment.SLOT_CAPE);
	player.getAppearence().generateAppearenceData();
    }

    public static void setWeapon(Player player, Item weapon) {
	player.getEquipment().getItems().set(Equipment.SLOT_WEAPON, weapon);
	player.getEquipment().refresh(Equipment.SLOT_WEAPON);
	player.getAppearence().generateAppearenceData();
    }

    public static void createPlayingGame() {
	playingGame = new PlayingGame();
	CoresManager.fastExecutor.scheduleAtFixedRate(playingGame, 60000, 60000);
	refreshAllPlayersTime();
    }

    public static void destroyPlayingGame() {
	playingGame.cancel();
	playingGame = null;
	refreshAllPlayersTime();
	leavePlayersSafely();
    }

    public static void leavePlayersSafely() {
	leavePlayersSafely(-1);
    }

    public static void leavePlayersSafely(final int winner) {
	for (int i = 0; i < playing.length; i++) {
	    for (final Player player : playing[i]) {
		player.lock(7);
		player.stopAll();
	    }
	}
	WorldTasksManager.schedule(new WorldTask() {
	    @Override
	    public void run() {
		for (int i = 0; i < playing.length; i++)
		    for (Player player : playing[i].toArray(new Player[playing[i].size()])) {
			forceRemovePlayingPlayer(player);
			if (winner != -1) {
			    player.increaseFinishedCastleWars();
			    if (winner == -2) {
				player.getPackets().sendGameMessage("You draw.");
				player.getInventory().addItem(CW_TICKET, 1 * Settings.DROP_QUANTITY_RATE);
			    } else if (winner == i) {
				player.getPackets().sendGameMessage("You won.");
				player.getInventory().addItem(CW_TICKET, 2 * Settings.DROP_QUANTITY_RATE);
			    } else
				player.getPackets().sendGameMessage("You lost.");
			}
		    }
	    }
	}, 6);
    }

    // unused
    public static void forceRemoveWaitingPlayer(Player player) {
	player.getControlerManager().forceStop();
    }

    public static void removeWaitingPlayer(Player player, int team) {
	player.lock(2);
	player.stopAll();
	waiting[team].remove(player);
	setCape(player, null);
	setHood(player, null);
	player.setNextWorldTile(new WorldTile(LOBBY, 2));
	if (playingGame != null && waiting[team].size() == 0 && playing[team].size() == 0)
	    destroyPlayingGame(); // cancels if 0 players playing/waiting on any
	// of the tea
    }

    public static void refreshTimeLeft(Player player) {
	player.getVarsManager().sendVar(380, playingGame == null ? 0 : playingGame.minutesLeft - (player.getControlerManager().getControler() instanceof CastleWarsPlaying ? 5 : 0));
    }

    public static void startGame() {
	for (int i = 0; i < waiting.length; i++) {
	    for (Player player : waiting[i].toArray(new Player[waiting[i].size()])) {
		joinPlayingGame(player, i);
	    }
	}
    }

    public static void forceRemovePlayingPlayer(Player player) {
	player.getControlerManager().forceStop();
    }

    public static void removePlayingPlayer(Player player, int team) {
	playing[team].remove(player);
	player.reset();
	player.setCanPvp(false);
	// remove the items
	setCape(player, null);
	setHood(player, null);
	int weaponId = player.getEquipment().getWeaponId();
	if (weaponId == 4037 || weaponId == 4039) {
	    CastleWars.setWeapon(player, null);
	    CastleWars.dropFlag(player.getLastWorldTile(), weaponId == 4037 ? CastleWars.SARADOMIN : CastleWars.ZAMORAK);
	}
	player.closeInterfaces();
	player.getInventory().deleteItem(4049, Integer.MAX_VALUE); // bandages
	player.getInventory().deleteItem(4053, Integer.MAX_VALUE); // barricades

	player.getHintIconsManager().removeUnsavedHintIcon();
	player.getMusicsManager().reset();
	player.useStairs(-1, new WorldTile(LOBBY, 2), 0, 1);
	if (playingGame != null && waiting[team].size() == 0 && playing[team].size() == 0)
	    destroyPlayingGame(); // cancels if 0 players playing/waiting on any
	// of the tea
    }

    public static void joinPlayingGame(Player player, int team) {
	player.lock(2);
	player.stopAll();
	playingGame.refresh(player);
	waiting[team].remove(player);
	player.getControlerManager().removeControlerWithoutCheck();
	player.getInterfaceManager().removeOverlay(true);
	playing[team].add(player);
	player.setCanPvp(true);
	player.getControlerManager().startControler("CastleWarsPlaying", team);
	player.setNextWorldTile(new WorldTile(team == ZAMORAK ? ZAMO_BASE : SARA_BASE, 1));
    }

    public static void endGame(int winner) {
	if (winner != -2)
	    seasonWins[winner]++;
	leavePlayersSafely(winner);
    }

    public static void refreshAllPlayersTime() {
	for (int i = 0; i < waiting.length; i++)
	    for (Player player : waiting[i])
		refreshTimeLeft(player);
	for (int i = 0; i < playing.length; i++)
	    for (Player player : playing[i]) {
		player.getMusicsManager().playMusic(i == ZAMORAK ? 845 : 314);
		refreshTimeLeft(player);
	    }
    }

    public static void refreshAllPlayersPlaying() {
	for (int i = 0; i < playing.length; i++)
	    for (Player player : playing[i])
		playingGame.refresh(player);
    }

    public static void addHintIcon(int team, Player target) {
	for (Player player : playing[team]) {
	    player.getHintIconsManager().addHintIcon(target, 0, -1, false);
	}
    }

    public static void removeHintIcon(int team) {
	for (Player player : playing[team]) {
	    player.getHintIconsManager().removeUnsavedHintIcon();
	}
    }

    public static void addScore(Player player, int team, int flagTeam) {
	if (playingGame == null)
	    return;
	playingGame.addScore(player, team, flagTeam);
    }

    public static void takeFlag(Player player, int team, int flagTeam, WorldObject object, boolean droped) {
	if (playingGame == null)
	    return;
	playingGame.takeFlag(player, team, flagTeam, object, droped);
    }

    public static void dropFlag(WorldTile tile, int flagTeam) {
	if (playingGame == null)
	    return;
	playingGame.dropFlag(tile, flagTeam);
    }

    public static void removeBarricade(int team, CastleWarBarricade npc) {
	if (playingGame == null)
	    return;
	playingGame.removeBarricade(team, npc);
    }

    public static void addBarricade(int team, Player player) {
	if (playingGame == null)
	    return;
	playingGame.addBarricade(team, player);
    }

    public static boolean isBarricadeAt(WorldTile tile) {
	if (playingGame == null)
	    return false;
	return playingGame.isBarricadeAt(tile);
    }

    private static class PlayingGame extends TimerTask {

	private static final int SAFE = 0, TAKEN = 1, DROPPED = 2;
	private int minutesLeft;
	private int[] score;
	private int[] flagStatus;
	private int[] barricadesCount;
	private final LinkedList<WorldObject> spawnedObjects = new LinkedList<WorldObject>();
	private final LinkedList<CastleWarBarricade> barricades = new LinkedList<CastleWarBarricade>();

	public PlayingGame() {
	    reset();
	}

	public void reset() {
	    minutesLeft = 5;
	    score = new int[2];
	    flagStatus = new int[2];
	    barricadesCount = new int[2];
	    for (WorldObject object : spawnedObjects)
		World.removeObject(object);
	    spawnedObjects.clear();
	    for (CastleWarBarricade npc : barricades)
		npc.finish();
	    barricades.clear();
	}

	public boolean isBarricadeAt(WorldTile tile) {
	    for (Iterator<CastleWarBarricade> it = barricades.iterator(); it.hasNext();) {
		CastleWarBarricade npc = it.next();
		if (npc.isDead() || npc.hasFinished()) {
		    it.remove();
		    continue;
		}
		if (npc.getX() == tile.getX() && npc.getY() == tile.getY() && tile.getPlane() == tile.getPlane())
		    return true;
	    }
	    return false;
	}

	public void addBarricade(int team, Player player) {
	    if (barricadesCount[team] >= 10) {
		player.getPackets().sendGameMessage("Each team in the activity can have a maximum of 10 barricades set up.");
		return;
	    }
	    player.getInventory().deleteItem(new Item(4053, 1));
	    barricadesCount[team]++;
	    barricades.add(new CastleWarBarricade(team, new WorldTile(player)));
	}

	public void removeBarricade(int team, CastleWarBarricade npc) {
	    barricadesCount[team]--;
	    barricades.remove(npc);
	}

	public void takeFlag(Player player, int team, int flagTeam, WorldObject object, boolean droped) {
	    if (!droped && team == flagTeam)
		return;
	    if (droped && flagStatus[flagTeam] != DROPPED)
		return;
	    else if (!droped && flagStatus[flagTeam] != SAFE)
		return;

	    if (flagTeam != team && (player.getEquipment().getWeaponId() != -1 || player.getEquipment().getShieldId() != -1)) {
		// TODO no space message
		player.getPackets().sendGameMessage("You can't take flag while wearing something in your hands.");
		return;
	    }
	    if (!droped) {
		WorldObject flagStand = new WorldObject(flagTeam == SARADOMIN ? 4377 : 4378, object.getType(), object.getRotation(), object.getX(), object.getY(), object.getPlane());
		spawnedObjects.add(flagStand);
		World.spawnObject(flagStand);
	    } else {
		spawnedObjects.remove(object);
		World.removeObject(object);
		if (flagTeam == team) {
		    makeSafe(flagTeam);
		    return;
		}
	    }
	    addHintIcon(flagTeam, player);
	    flagStatus[flagTeam] = TAKEN;
	    setWeapon(player, new Item(flagTeam == SARADOMIN ? 4037 : 4039, 1));
	    refreshAllPlayersPlaying();
	}

	public void addScore(Player player, int team, int flagTeam) {
	    setWeapon(player, null);
	    removeHintIcon(team);
	    player.setCapturedCastleWarsFlag();
	    score[team] += 1;
	    makeSafe(flagTeam);
	}

	private void makeSafe(int flagTeam) {
	    WorldObject flagStand = null;
	    for (WorldObject object : spawnedObjects) {
		if (object.getId() == (flagTeam == SARADOMIN ? 4377 : 4378)) {
		    flagStand = object;
		    break;
		}
	    }
	    if (flagStand == null)
		return;
	    World.removeObject(flagStand);
	    flagStatus[flagTeam] = SAFE;
	    refreshAllPlayersPlaying();
	}

	public void dropFlag(WorldTile tile, int flagTeam) {
	    removeHintIcon(flagTeam);
	    WorldObject flagDroped = new WorldObject(flagTeam == SARADOMIN ? 4900 : 4901, 10, 0, tile.getX(), tile.getY(), tile.getPlane());
	    spawnedObjects.add(flagDroped);
	    World.spawnObject(flagDroped);
	    flagStatus[flagTeam] = DROPPED;
	    refreshAllPlayersPlaying();
	}

	public void refresh(Player player) {
	    player.getVarsManager().sendVarBit(143, flagStatus[SARADOMIN]);
	    player.getVarsManager().sendVarBit(145, score[SARADOMIN]);
	    player.getVarsManager().sendVarBit(153, flagStatus[ZAMORAK]);
	    player.getVarsManager().sendVarBit(155, score[ZAMORAK]);
	}

	@Override
	public void run() {
	    minutesLeft--;
	    if (minutesLeft == 5) {
		endGame(score[SARADOMIN] == score[ZAMORAK] ? -2 : score[SARADOMIN] > score[ZAMORAK] ? SARADOMIN : ZAMORAK);
		reset();
	    } else if (minutesLeft == 0) {
		minutesLeft = 25;
		startGame();
	    } else if (minutesLeft > 6) // adds ppl waiting on lobby
		startGame();
	    refreshAllPlayersTime();
	}
    }

    public static void handleInterfaces(Player player, int interfaceId, int componentId, int packetId) {
	if (interfaceId == 60)
	    if(componentId != 1 && componentId != 5 && componentId != 9)
		interactCastleWarsTicketExchange(player, componentId, packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET);
    }
    
    public static void openCastleWarsTicketExchange(Player player) {
	player.stopAll();
	player.getInterfaceManager().sendInterface(60);
    }
    public static void interactCastleWarsTicketExchange(Player player, int componentId, boolean buy) {
	Integer id = (Integer) rewards.get(componentId);
	if(id == null)
	    return;
	if(buy) {
	    int cost = ClientScriptMap.getMap(3059).getIntValue(id);
	    if(!player.getInventory().containsItem(CW_TICKET, cost)) {
		player.getPackets().sendGameMessage("You don't have enough tickets to buy this item.");
		return;
	    }
	    if(!player.getInventory().addItem(new Item(id, 1)))
		return;
	    player.getInventory().deleteItem(CW_TICKET, cost);
	    player.getPackets().sendGameMessage(ClientScriptMap.getMap(3061).getStringValue(id));
	}else
	    player.getPackets().sendGameMessage(ItemExamines.getExamine(new Item(id)));
    }

    public static boolean handleObjects(Player player, int objectId) {
	if (objectId == 4484) { // scoreboard
	    player.getDialogueManager().startDialogue(new CastleWarsScoreboard());
	    return true;
	}
	if (objectId == 4388) {
	    joinPortal(player, ZAMORAK);
	    return true;
	}
	if (objectId == 4408) {
	    joinPortal(player, GUTHIX);
	    return true;
	}
	if (objectId == 4387) {
	    joinPortal(player, SARADOMIN);
	    return true;
	}
	return false;
    }

    public static List<Player>[] getPlaying() {
	return playing;
    }
}
