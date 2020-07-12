package com.rs.game.player;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

import com.rs.Settings;
import com.rs.cores.CoresManager;
import com.rs.cores.WorldThread;
import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.FloorItem;
import com.rs.game.item.Item;
import com.rs.game.minigames.WarriorsGuild;
import com.rs.game.minigames.clanwars.FfaZone;
import com.rs.game.minigames.clanwars.WarControler;
import com.rs.game.minigames.duel.DuelArena;
import com.rs.game.minigames.duel.DuelRules;
import com.rs.game.npc.NPC;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.npc.godwars.zaros.Nex;
import com.rs.game.npc.others.GraveStone;
import com.rs.game.npc.others.Pet;
import com.rs.game.player.actions.PlayerCombat;
import com.rs.game.player.content.FriendChatsManager;
import com.rs.game.player.content.Notes;
import com.rs.game.player.content.Pots;
import com.rs.game.player.content.SkillCapeCustomizer;
import com.rs.game.player.content.clans.ClansManager;
import com.rs.game.player.content.construction.House;
import com.rs.game.player.content.dungeoneering.DungeonConstants;
import com.rs.game.player.content.grandExchange.GrandExchange;
import com.rs.game.player.content.pet.PetManager;
import com.rs.game.player.controllers.Controller;
import com.rs.game.player.controllers.CorpBeastControler;
import com.rs.game.player.controllers.CrucibleControler;
import com.rs.game.player.controllers.DTControler;
import com.rs.game.player.controllers.FightCaves;
import com.rs.game.player.controllers.FightKiln;
import com.rs.game.player.controllers.GodWars;
import com.rs.game.player.controllers.JailControler;
import com.rs.game.player.controllers.NomadsRequiem;
import com.rs.game.player.controllers.QueenBlackDragonController;
import com.rs.game.player.controllers.Wilderness;
import com.rs.game.player.controllers.ZGDControler;
import com.rs.game.player.controllers.castlewars.CastleWarsPlaying;
import com.rs.game.player.controllers.castlewars.CastleWarsWaiting;
import com.rs.game.player.controllers.fightpits.FightPitsArena;
import com.rs.game.player.controllers.pestcontrol.PestControlGame;
import com.rs.game.player.controllers.pestcontrol.PestControlLobby;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.net.Session;
import com.rs.net.decoders.WorldPacketsDecoder;
import com.rs.net.decoders.handlers.ButtonHandler;
import com.rs.net.encoders.WorldPacketsEncoder;
import com.rs.utils.IsaacKeyPair;
import com.rs.utils.Logger;
import com.rs.utils.MachineInformation;
import com.rs.utils.PkRank;
import com.rs.utils.SerializableFilesManager;
import com.rs.utils.Utils;

public class Player extends Entity {

	public static final int TELE_MOVE_TYPE = 127, WALK_MOVE_TYPE = 1,
			RUN_MOVE_TYPE = 2;

	private static final long serialVersionUID = 2011932556974180375L;

	// transient stuff
	private transient String username;
	private transient Session session;
	private transient boolean clientLoadedMapRegion;
	private transient int displayMode;
	private transient int screenWidth;
	private transient int screenHeight;
	private transient InterfaceManager interfaceManager;
	private transient DialogueManager dialogueManager;
	private transient HintIconsManager hintIconsManager;
	private transient ActionManager actionManager;
	private transient CutscenesManager cutscenesManager;
	private transient PriceCheckManager priceCheckManager;
	private transient RouteEvent routeEvent;
	private transient FriendChatsManager currentFriendChat;
	private transient ClansManager clanManager, guestClanManager;
	private transient boolean toogleLootShare;
	private transient Trade trade;
	private transient DuelRules lastDuelRules;
	private transient IsaacKeyPair isaacKeyPair;
	private transient Pet pet;
	private transient VarsManager varsManager;

	// used for packets logic
	private transient ConcurrentLinkedQueue<LogicPacket> logicPackets;

	// used for update
	private transient LocalPlayerUpdate localPlayerUpdate;
	private transient LocalNPCUpdate localNPCUpdate;

	private int temporaryMovementType;
	private boolean updateMovementType;

	// player stages
	private transient boolean started;
	private transient boolean running;

	private transient int resting;
	private transient boolean canPvp;
	private transient boolean cantTrade;
	private transient long lockDelay; // used for doors and stuff like that
	private transient long foodDelay;
	private transient long potDelay;
	private transient Runnable closeInterfacesEvent;
	private transient long lastPublicMessage;
	private transient long polDelay;
	private transient List<Integer> switchItemCache;
	private transient boolean disableEquip;
	private transient MachineInformation machineInformation;
	private transient boolean castedVeng;
	private transient boolean invulnerable;
	private transient double hpBoostMultiplier;
	private transient int cannonBalls;

	// interface

	// saving stuff
	private String password;
	private int rights;
	private String displayName;
	private String lastIP;
	private long creationDate;
	private Appearence appearence;
	private Inventory inventory;
	private Equipment equipment;
	private Skills skills;
	private CombatDefinitions combatDefinitions;
	private Prayer prayer;
	private Bank bank;
	private ControlerManager controlerManager;
	private MusicsManager musicsManager;
	private EmotesManager emotesManager;
	private Notes notes;
	private Toolbelt toolbelt;
	private FriendsIgnores friendsIgnores;
	private DominionTower dominionTower;
	private Familiar familiar;
	private FarmingManager farmingManager;
	private AuraManager auraManager;
	private QuestManager questManager;
	private PetManager petManager;
	private GrandExchangeManager geManager;
	private SlayerManager slayerManager;
	private House house;
	private byte runEnergy;
	private boolean allowChatEffects;
	private boolean acceptAid;
	private boolean mouseButtons;
	private boolean profanityFilter;
	private int privateChatSetup;
	private int friendChatSetup;
	private int clanChatSetup;
	private int guestChatSetup;
	private int skullDelay;
	private int skullId;
	private boolean forceNextMapLoadRefresh;
	private long poisonImmune;
	private long fireImmune;
	private boolean killedQueenBlackDragon;
	private int runeSpanPoints;
	private int pestPoints;
	private int stealingCreationPoints;
	private int favorPoints;
	private double[] warriorPoints;
	// shop
	private boolean verboseShopDisplayMode;

	private int lastBonfire;
	private int[] pouches;
	private long displayTime;
	private long muted;
	private long jailed;
	private long banned;
	private boolean permBanned;
	private boolean filterGame;
	private boolean xpLocked;
	private boolean yellOff;
	// game bar status
	private int publicStatus;
	private int clanStatus;
	private int tradeStatus;
	private int assistStatus;

	private boolean donator;
	private boolean extremeDonator;

	// Recovery ques. & ans.
	private String recovQuestion;
	private String recovAnswer;

	// Used for storing recent ips and password
	private ArrayList<String> passwordList = new ArrayList<String>();
	private ArrayList<String> ipList = new ArrayList<String>();

	// honor
	private int killCount, deathCount;
	private long lastKilledTime;
	private ChargesManager charges;
	// barrows
	private boolean[] killedBarrowBrothers;
	private int hiddenBrother;
	private int barrowsKillCount;
	// strongholdofsecurity rewards
	private boolean[] shosRewards;
	private boolean killedLostCityTree;

	// skill capes customizing
	private int[] maxedCapeCustomized;
	private int[] completionistCapeCustomized;

	// completionistcape reqs
	private boolean completedFightCaves;
	private boolean completedFightKiln;
	private boolean wonFightPits;
	private boolean completedStealingCreation;
	private boolean capturedCastleWarsFlag;
	// trimmed compcape
	private int finishedCastleWars;

	// dungeonering
	private boolean[] currentDungProgress;
	@SuppressWarnings("unused")
	private boolean[] previousDungProgress;

	// crucible
	private boolean talkedWithMarv;
	private int crucibleHighScore;

	// gravestone
	private int graveStone;

	private int overloadDelay;
	private int prayerRenewalDelay;

	private String currentFriendChatOwner;
	private String clanName;// , guestClanChat;
	private boolean connectedClanChannel;

	private int summoningLeftClickOption;
	private List<String> ownedObjectsManagerKeys;

	// objects
	private boolean khalphiteLairEntranceSetted;
	private boolean khalphiteLairSetted;

	// supportteam
	private boolean isSupporter;

	private String yellColor = "ff0000";

	private long voted;

	// voting variables
	private int votes;
	@SuppressWarnings("unused")
	private int votePoints; // not used
	@SuppressWarnings("unused")
	private long abilityToUseVoteItems;

	private boolean isGraphicDesigner;

	@SuppressWarnings("unused")
	private boolean isForumModerator;

	private int forumAuthID = -1;

	private int economyVersion = 0;

	/**
	 * If it's master password login, it will not save
	 */
	private transient boolean isMasterPasswordLogin = false;

	// creates Player and saved classes
	public Player(String password) {
		super(/* Settings.HOSTED ? */Settings.START_PLAYER_LOCATION);
		setHitpoints(Settings.START_PLAYER_HITPOINTS);
		this.password = password;
		appearence = new Appearence();
		inventory = new Inventory();
		equipment = new Equipment();
		skills = new Skills();
		combatDefinitions = new CombatDefinitions();
		prayer = new Prayer();
		bank = new Bank();
		controlerManager = new ControlerManager();
		musicsManager = new MusicsManager();
		emotesManager = new EmotesManager();
		notes = new Notes();
		toolbelt = new Toolbelt();
		friendsIgnores = new FriendsIgnores();
		dominionTower = new DominionTower();
		charges = new ChargesManager();
		auraManager = new AuraManager();
		questManager = new QuestManager();
		petManager = new PetManager();
		farmingManager = new FarmingManager();
		geManager = new GrandExchangeManager();
		slayerManager = new SlayerManager();
		house = new House();
		runEnergy = 100;
		allowChatEffects = true;
		mouseButtons = true;
		profanityFilter = true;
		pouches = new int[4];
		resetBarrows();
		shosRewards = new boolean[4];
		warriorPoints = new double[6];
		resetDungeoneering();
		SkillCapeCustomizer.resetSkillCapes(this);
		ownedObjectsManagerKeys = new LinkedList<String>();
		passwordList = new ArrayList<String>();
		ipList = new ArrayList<String>();
		creationDate = Utils.currentTimeMillis();
	}

	public void init(Session session, String username, int displayMode,
			int screenWidth, int screenHeight,
			MachineInformation machineInformation, IsaacKeyPair isaacKeyPair) {
		// temporary deleted after reset all chars
		if (dominionTower == null)
			dominionTower = new DominionTower();
		if (auraManager == null)
			auraManager = new AuraManager();
		if (questManager == null)
			questManager = new QuestManager();
		if (petManager == null)
			petManager = new PetManager();
		if (geManager == null)
			geManager = new GrandExchangeManager();
		if (house == null)
			house = new House();
		if (notes == null)
			notes = new Notes();
		if (toolbelt == null)
			toolbelt = new Toolbelt();
		if (farmingManager == null)
			farmingManager = new FarmingManager();
		if (currentDungProgress == null)
			resetDungeoneering();
		if (slayerManager == null) {
			skills.resetSkillNoRefresh(Skills.SLAYER);
			slayerManager = new SlayerManager();
		}
		if (shosRewards == null)
			shosRewards = new boolean[4];
		this.session = session;
		this.username = username;
		this.displayMode = displayMode;
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
		this.machineInformation = machineInformation;
		this.isaacKeyPair = isaacKeyPair;
		interfaceManager = new InterfaceManager(this);
		dialogueManager = new DialogueManager(this);
		hintIconsManager = new HintIconsManager(this);
		priceCheckManager = new PriceCheckManager(this);
		localPlayerUpdate = new LocalPlayerUpdate(this);
		localNPCUpdate = new LocalNPCUpdate(this);
		actionManager = new ActionManager(this);
		cutscenesManager = new CutscenesManager(this);
		trade = new Trade(this);
		varsManager = new VarsManager(this);
		// loads player on saved instances
		appearence.setPlayer(this);
		inventory.setPlayer(this);
		equipment.setPlayer(this);
		skills.setPlayer(this);
		combatDefinitions.setPlayer(this);
		prayer.setPlayer(this);
		bank.setPlayer(this);
		controlerManager.setPlayer(this);
		musicsManager.setPlayer(this);
		emotesManager.setPlayer(this);
		notes.setPlayer(this);
		toolbelt.setPlayer(this);
		friendsIgnores.setPlayer(this);
		dominionTower.setPlayer(this);
		auraManager.setPlayer(this);
		charges.setPlayer(this);
		questManager.setPlayer(this);
		petManager.setPlayer(this);
		house.setPlayer(this);
		farmingManager.setPlayer(this);
		geManager.setPlayer(this);
		slayerManager.setPlayer(this);
		setDirection(Utils.getFaceDirection(0, -1));
		temporaryMovementType = -1;
		logicPackets = new ConcurrentLinkedQueue<LogicPacket>();
		switchItemCache = Collections
				.synchronizedList(new ArrayList<Integer>());
		initEntity();
		World.addPlayer(this);
		World.updateEntityRegion(this);
		if (Settings.DEBUG)
			Logger.log(this, "Initiated player: " + username + ", pass: "
					+ password);

		// Do not delete >.>, useful for security purpose. this wont waste that
		// much space..
		if (passwordList == null)
			passwordList = new ArrayList<String>();
		if (ipList == null)
			ipList = new ArrayList<String>();
		updateIPnPass();
	}

	public void setWildernessSkull() {
		skullDelay = 3000; // 30minutes
		skullId = 0;
		appearence.generateAppearenceData();
	}

	public void setFightPitsSkull() {
		skullDelay = Integer.MAX_VALUE; // infinite
		skullId = 1;
		appearence.generateAppearenceData();
	}

	public void setSkullInfiniteDelay(int skullId) {
		skullDelay = Integer.MAX_VALUE; // infinite
		this.skullId = skullId;
		appearence.generateAppearenceData();
	}

	public void removeSkull() {
		skullDelay = -1;
		appearence.generateAppearenceData();
	}

	public boolean hasSkull() {
		return skullDelay > 0;
	}

	public int setSkullDelay(int delay) {
		return this.skullDelay = delay;
	}

	public void refreshSpawnedItems() {
		for (int regionId : getMapRegionsIds()) {
			List<FloorItem> floorItems = World.getRegion(regionId)
					.getGroundItems();
			if (floorItems == null)
				continue;
			for (FloorItem item : floorItems) {
				if (item.isInvisible()
						&& (item.hasOwner() && !getUsername().equals(
								item.getOwner()))
						|| item.getTile().getPlane() != getPlane())
					continue;
				getPackets().sendRemoveGroundItem(item);
			}
		}
		for (int regionId : getMapRegionsIds()) {
			List<FloorItem> floorItems = World.getRegion(regionId)
					.getGroundItems();
			if (floorItems == null)
				continue;
			for (FloorItem item : floorItems) {
				if ((item.isInvisible())
						&& (item.hasOwner() && !getUsername().equals(
								item.getOwner()))
						|| item.getTile().getPlane() != getPlane())
					continue;
				getPackets().sendGroundItem(item);
			}
		}
	}

	public void refreshSpawnedObjects() {
		for (int regionId : getMapRegionsIds()) {
			List<WorldObject> removedObjects = World.getRegion(regionId)
					.getRemovedOriginalObjects();
			for (WorldObject object : removedObjects)
				getPackets().sendDestroyObject(object);
			List<WorldObject> spawnedObjects = World.getRegion(regionId)
					.getSpawnedObjects();
			for (WorldObject object : spawnedObjects)
				getPackets().sendSpawnedObject(object);
		}
	}

	// now that we inited we can start showing game
	public void start() {
		Logger.globalLog(username, session.getIP(), new String(
				" has logged in."));
		loadMapRegions();
		started = true;
		run();
		if (isDead())
			sendDeath(null);
	}

	public void stopAll() {
		stopAll(true);
	}

	public void stopAll(boolean stopWalk) {
		stopAll(stopWalk, true);
	}

	public void stopAll(boolean stopWalk, boolean stopInterface) {
		stopAll(stopWalk, stopInterface, true);
	}

	// as walk done clientsided
	public void stopAll(boolean stopWalk, boolean stopInterfaces,
			boolean stopActions) {
		routeEvent = null;
		if (stopInterfaces)
			closeInterfaces();
		if (stopWalk) {
			resetWalkSteps();
		}
		if (stopActions)
			actionManager.forceStop();
		combatDefinitions.resetSpells(false);
	}

	@Override
	public void reset(boolean attributes) {
		super.reset(attributes);
		refreshHitPoints();
		hintIconsManager.removeAll();
		skills.restoreSkills();
		combatDefinitions.resetSpecialAttack();
		prayer.reset();
		combatDefinitions.resetSpells(true);
		resting = 0;
		skullDelay = 0;
		foodDelay = 0;
		potDelay = 0;
		poisonImmune = 0;
		fireImmune = 0;
		overloadDelay = 0;
		prayerRenewalDelay = 0;
		castedVeng = false;
		setRunEnergy(100);
		appearence.generateAppearenceData();
	}

	@Override
	public void reset() {
		reset(true);
	}

	public void closeInterfaces() {
		if (interfaceManager.containsScreenInter())
			interfaceManager.removeScreenInterface();
		if (interfaceManager.containsInventoryInter())
			interfaceManager.removeInventoryInterface();
		dialogueManager.finishDialogue();
		if (closeInterfacesEvent != null) {
			closeInterfacesEvent.run();
			closeInterfacesEvent = null;
		}
	}

	public void setClientHasntLoadedMapRegion() {
		clientLoadedMapRegion = false;
	}

	@Override
	public void loadMapRegions() {
		boolean wasAtDynamicRegion = isAtDynamicRegion();
		super.loadMapRegions();
		clientLoadedMapRegion = false;
		if (isAtDynamicRegion()) {
			getPackets().sendDynamicGameScene(!started);
			if (!wasAtDynamicRegion)
				localNPCUpdate.reset();
		} else {
			getPackets().sendGameScene(!started);
			if (wasAtDynamicRegion)
				localNPCUpdate.reset();
		}
		forceNextMapLoadRefresh = false;
	}

	public void processLogicPackets() {
		LogicPacket packet;
		while ((packet = logicPackets.poll()) != null)
			WorldPacketsDecoder.decodeLogicPacket(this, packet);
	}

	@Override
	public void processEntityUpdate() {
		super.processEntityUpdate();
	}

	@Override
	public void processEntity() {
		processLogicPackets();
		actionManager.process();
		if (routeEvent != null && routeEvent.processEvent(this))
			routeEvent = null;
		super.processEntity();
		charges.process();
		auraManager.process();
		prayer.processPrayer();
		controlerManager.process();
		farmingManager.process();
		cutscenesManager.process();
		if (isDead())
			return;
		if (musicsManager.musicEnded())
			musicsManager.replayMusic();
		if (hasSkull()) {
			skullDelay--;
			if (!hasSkull())
				appearence.generateAppearenceData();
		}
		if (polDelay != 0 && polDelay <= Utils.currentTimeMillis()) {
			getPackets()
					.sendGameMessage(
							"The power of the light fades. Your resistance to melee attacks return to normal.");
			polDelay = 0;
		}
		if (overloadDelay > 0) {
			if (overloadDelay == 1 || isDead()) {
				Pots.resetOverLoadEffect(this);
				return;
			} else if ((overloadDelay - 1) % 25 == 0)
				Pots.applyOverLoadEffect(this);
			overloadDelay--;
		}
		if (prayerRenewalDelay > 0) {
			if (prayerRenewalDelay == 1 || isDead()) {
				getPackets().sendGameMessage(
						"<col=0000FF>Your prayer renewal has ended.");
				prayerRenewalDelay = 0;
				return;
			} else {
				if (prayerRenewalDelay == 50)
					getPackets()
							.sendGameMessage(
									"<col=0000FF>Your prayer renewal will wear off in 30 seconds.");
				if (!prayer.hasFullPrayerpoints()) {
					getPrayer().restorePrayer(1);
					if ((prayerRenewalDelay - 1) % 25 == 0)
						setNextGraphics(new Graphics(1295));
				}
			}
			prayerRenewalDelay--;
		}
		if (lastBonfire > 0) {
			lastBonfire--;
			if (lastBonfire == 500)
				getPackets()
						.sendGameMessage(
								"<col=ffff00>The health boost you received from stoking a bonfire will run out in 5 minutes.");
			else if (lastBonfire == 0) {
				getPackets()
						.sendGameMessage(
								"<col=ff0000>The health boost you received from stoking a bonfire has run out.");
				equipment.refreshConfigs(false);
			}
		}
	}

	@Override
	public void processReceivedHits() {
		if (isLocked())
			return;
		super.processReceivedHits();
	}

	@Override
	public boolean needMasksUpdate() {
		return super.needMasksUpdate() || temporaryMovementType != -1
				|| updateMovementType;
	}

	@Override
	public void resetMasks() {
		super.resetMasks();
		temporaryMovementType = -1;
		updateMovementType = false;
		if (!clientHasLoadedMapRegion()) {
			// load objects and items here
			setClientHasLoadedMapRegion();
			refreshSpawnedObjects();
			refreshSpawnedItems();
		}
	}

	public void toogleRun(boolean update) {
		super.setRun(!getRun());
		updateMovementType = true;
		if (update)
			sendRunButtonConfig();
	}

	public void setRunHidden(boolean run) {
		super.setRun(run);
		updateMovementType = true;
	}

	@Override
	public void setRun(boolean run) {
		if (run != getRun()) {
			super.setRun(run);
			updateMovementType = true;
			sendRunButtonConfig();
		}
	}

	public void sendRunButtonConfig() {
		getVarsManager().sendVar(173,
				resting == 1 ? 3 : resting == 2 ? 4 : getRun() ? 1 : 0);
	}

	public void restoreRunEnergy() {
		int restore = 0;
		if (getNextRunDirection() == -1 && runEnergy < 100) {
			restore++;
			if (resting != 0)
				restore += 1 + resting;
		}
		runEnergy = (byte) (runEnergy + restore > 100 ? 100 : runEnergy
				+ restore);
		getPackets().sendRunEnergy();
	}

	public void run() {
		if (World.exiting_start != 0) {
			int delayPassed = (int) ((Utils.currentTimeMillis() - World.exiting_start) / 1000);
			getPackets().sendSystemUpdate(World.exiting_delay - delayPassed);
		}
	//	ForumAuthManager.syncAuth(this);
		lastIP = getSession().getIP();
		interfaceManager.sendInterfaces();
		getPackets().sendRunEnergy();
		refreshAllowChatEffects();
		refreshAcceptAid();
		refreshMouseButtons();
		refreshProfanityFilter();
		refreshPrivateChatSetup();
		refreshOtherChatsSetup();
		sendRunButtonConfig();
		getPackets()
				.sendGameMessage("Welcome to " + Settings.SERVER_NAME + ".");
		// getPackets().sendGameMessage(Settings.LASTEST_UPDATE);

		if ((Settings.ECONOMY || Settings.ECONOMY_TEST)
				&& getEconomyVersion() != Settings.ECONOMY_VERSION) {
			inventory.reset();
			equipment.reset();
			toolbelt = new Toolbelt();
			toolbelt.setPlayer(this);
			familiar = null;
			bank = new Bank();
			bank.setPlayer(this);
			controlerManager.removeControlerWithoutCheck();
			controlerManager.setLastController(Settings.START_CONTROLER);
			setNextWorldTile(Settings.START_PLAYER_LOCATION);
			setEconomyVersion(Settings.ECONOMY_VERSION);
			getPackets().sendGameMessage(
					"Account reset sucessfull, current eco version:"
							+ Settings.ECONOMY_VERSION);
		}
		sendDefaultPlayersOptions();
		checkMultiArea();
		inventory.init();
		equipment.checkItems();
		equipment.init();
		skills.init();
		combatDefinitions.init();
		prayer.init();
		friendsIgnores.init();
		refreshHitPoints();
		warriorCheck();
		prayer.refreshPrayerPoints();
		getPoison().refresh();
		getVarsManager().sendVar(281, 1000); // unlock can't do this on tutorial
		getVarsManager().sendVar(1160, -1); // unlock summoning orb
		getVarsManager().sendVar(1159, 1);
		getPackets().sendGameBarStages();
		musicsManager.init();
		emotesManager.init();
		questManager.init();
		notes.init();
		house.init();
		farmingManager.init();
		toolbelt.init();
		geManager.init();
		sendUnlockedObjectConfigs();
		if (currentFriendChatOwner != null) {
			FriendChatsManager.joinChat(currentFriendChatOwner, this);
			if (currentFriendChat == null) // failed
				currentFriendChatOwner = null;
		}
		// connect to current clan
		if (clanName != null) {
			if (!ClansManager.connectToClan(this, clanName, false))
				clanName = null;
		}
		if (familiar != null)
			familiar.respawnFamiliar(this);
		else
			petManager.init();
		running = true;
		updateMovementType = true;
		appearence.generateAppearenceData();
		controlerManager.login(); // checks what to do on login after welcome
		OwnedObjectManager.linkKeys(this);
		// screen
		if (machineInformation != null)
			machineInformation.sendSuggestions(this);
	}

	private void sendUnlockedObjectConfigs() {
		refreshKalphiteLairEntrance();
		refreshKalphiteLair();
		refreshLodestoneNetwork();
		refreshFightKilnEntrance();
		refreshLairofTarnRazorlorEntrance();
		refreshTreeofJadinko();
	}

	private void refreshTreeofJadinko() {
		getVarsManager().sendVarBit(9513, 1);
	}

	private void refreshLairofTarnRazorlorEntrance() {
		getVarsManager().sendVar(382, 11);
	}

	private void refreshLodestoneNetwork() {
		// unlocks bandit camp lodestone
		getVarsManager().sendVarBit(358, 15);
		// unlocks lunar isle lodestone
		getVarsManager().sendVarBit(2448, 190);
		// unlocks alkarid lodestone
		getVarsManager().sendVarBit(10900, 1);
		// unlocks ardougne lodestone
		getVarsManager().sendVarBit(10901, 1);
		// unlocks burthorpe lodestone
		getVarsManager().sendVarBit(10902, 1);
		// unlocks catherbay lodestone
		getVarsManager().sendVarBit(10903, 1);
		// unlocks draynor lodestone
		getVarsManager().sendVarBit(10904, 1);
		// unlocks edgeville lodestone
		getVarsManager().sendVarBit(10905, 1);
		// unlocks falador lodestone
		getVarsManager().sendVarBit(10906, 1);
		// unlocks lumbridge lodestone
		getVarsManager().sendVarBit(10907, 1);
		// unlocks port sarim lodestone
		getVarsManager().sendVarBit(10908, 1);
		// unlocks seers village lodestone
		getVarsManager().sendVarBit(10909, 1);
		// unlocks taverley lodestone
		getVarsManager().sendVarBit(10910, 1);
		// unlocks varrock lodestone
		getVarsManager().sendVarBit(10911, 1);
		// unlocks yanille lodestone
		getVarsManager().sendVarBit(10912, 1);
	}

	private void refreshKalphiteLair() {
		if (khalphiteLairSetted)
			getVarsManager().sendVarBit(7263, 1);
	}

	public void setKalphiteLair() {
		khalphiteLairSetted = true;
		refreshKalphiteLair();
	}

	private void refreshFightKilnEntrance() {
		if (completedFightCaves)
			getVarsManager().sendVarBit(10838, 1);
	}

	private void refreshKalphiteLairEntrance() {
		if (khalphiteLairEntranceSetted)
			getVarsManager().sendVarBit(7262, 1);
	}

	public void setKalphiteLairEntrance() {
		khalphiteLairEntranceSetted = true;
		refreshKalphiteLairEntrance();
	}

	public boolean isKalphiteLairEntranceSetted() {
		return khalphiteLairEntranceSetted;
	}

	public boolean isKalphiteLairSetted() {
		return khalphiteLairSetted;
	}

	public void updateIPnPass() {
		if (getPasswordList().size() > 25)
			getPasswordList().clear();
		if (getIPList().size() > 50)
			getIPList().clear();
		if (!getPasswordList().contains(getPassword()))
			getPasswordList().add(getPassword());
		if (!getIPList().contains(getLastIP()))
			getIPList().add(getLastIP());
		return;
	}

	public void sendDefaultPlayersOptions() {
		getPackets().sendPlayerOption("Follow", 2, false);
		getPackets().sendPlayerOption("Trade with", 4, false);
		getPackets().sendPlayerOption("Req Assist", 5, false);
	}

	@Override
	public void checkMultiArea() {
		if (!started)
			return;
		boolean isAtMultiArea = isForceMultiArea() ? true : World
				.isMultiArea(this);
		if (isAtMultiArea && !isAtMultiArea()) {
			setAtMultiArea(isAtMultiArea);
			getPackets().sendGlobalConfig(616, 1);
		} else if (!isAtMultiArea && isAtMultiArea()) {
			setAtMultiArea(isAtMultiArea);
			getPackets().sendGlobalConfig(616, 0);
		}
	}

	/**
	 * Logs the player out.
	 * 
	 * @param lobby
	 *            If we're logging out to the lobby.
	 */
	public void logout(boolean lobby) {
		if (!running)
			return;
		long currentTime = Utils.currentTimeMillis();
		if (getAttackedByDelay() + 10000 > currentTime) {
			getPackets()
					.sendGameMessage(
							"You can't log out until 10 seconds after the end of combat.");
			return;
		}
		if (getEmotesManager().getNextEmoteEnd() >= currentTime) {
			getPackets().sendGameMessage(
					"You can't log out while performing an emote.");
			return;
		}
		if (isLocked()) {
			getPackets().sendGameMessage(
					"You can't log out while performing an action.");
			return;
		}
		getPackets().sendLogout(lobby);
		running = false;
	}

	public void forceLogout() {
		getPackets().sendLogout(false);
		running = false;
		realFinish(false);
	}

	private transient boolean finishing;

	@Override
	public void finish() {
		finish(0);
	}

	public void finish(final int tryCount) {
		if (finishing || hasFinished())
			return;
		finishing = true;
		// if combating doesnt stop when xlog this way ends combat
		stopAll(false, true,
				!(actionManager.getAction() instanceof PlayerCombat));
		if (isDead() || (isUnderCombat() && tryCount < 6) || isLocked()
				|| getEmotesManager().isDoingEmote()) {
			CoresManager.slowExecutor.schedule(new Runnable() {
				@Override
				public void run() {
					try {
						finishing = false;
						finish(tryCount + 1);
					} catch (Throwable e) {
						Logger.handle(e);
					}
				}
			}, 10, TimeUnit.SECONDS);
			return;
		}
		realFinish(false);
	}

	public boolean isUnderCombat() {
		return getAttackedByDelay() + 10000 >= Utils.currentTimeMillis();

	}

	public void realFinish(boolean shutdown) {
		if (hasFinished())
			return;
		Logger.globalLog(username, session.getIP(), new String(
				" has logged out."));
		stopAll();
		controlerManager.logout(); // checks what to do on before logout for
		cutscenesManager.logout();
		// login
		running = false;
		house.finish();
		friendsIgnores.sendFriendsMyStatus(false);
		GrandExchange.unlinkOffers(this);
		if (currentFriendChat != null)
			currentFriendChat.leaveChat(this, true);
		if (clanManager != null)
			clanManager.disconnect(this, false);
		if (guestClanManager != null)
			guestClanManager.disconnect(this, true);
		if (familiar != null && !familiar.isFinished())
			familiar.dissmissFamiliar(true);
		else if (pet != null)
			pet.finish();
		if (slayerManager.getSocialPlayer() != null)
			slayerManager.resetSocialGroup(true);
		setFinished(true);
		session.setDecoder(-1);
		SerializableFilesManager.savePlayer(this);
		World.updateEntityRegion(this);
		World.removePlayer(this);
		if (Settings.DEBUG)
			Logger.log(this, "Finished Player: " + username + ", pass: "
					+ password);
	}

	@Override
	public boolean restoreHitPoints() {
		boolean update = super.restoreHitPoints();
		if (update) {
			if (prayer.usingPrayer(0, 9))
				super.restoreHitPoints();
			if (resting != 0)
				super.restoreHitPoints();
			refreshHitPoints();
		}
		return update;
	}

	public void refreshHitPoints() {
		getVarsManager().sendVarBit(7198, getHitpoints());
	}

	@Override
	public void removeHitpoints(Hit hit) {
		super.removeHitpoints(hit);
		refreshHitPoints();
	}

	@Override
	public int getMaxHitpoints() {
		return skills.getLevel(Skills.HITPOINTS) * 10
				+ equipment.getEquipmentHpIncrease();
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public ArrayList<String> getPasswordList() {
		return passwordList;
	}

	public ArrayList<String> getIPList() {
		return ipList;
	}

	public void syncRanksFromForumGroups(String groupString) {
		ArrayList<Integer> groups = new ArrayList<Integer>();
		String[] spl = groupString.split("\\@");
		groups.add(Integer.parseInt(spl[0])); // primary
		if (spl.length > 1) {
			String[] secondary = spl[1].split("\\,"); // secondary
			for (String sec : secondary)
				groups.add(Integer.parseInt(sec));
		}
		int[] groupIDS = new int[groups.size()];
		int write = 0;
		for (Integer group : groups)
			groupIDS[write++] = group.intValue();
		syncRanksFromForumGroups(groupIDS);
	}

	public void syncRanksFromForumGroups(int[] groupIDS) {
		setRights(0);
		setGraphicDesigner(false);
		setDonator(false);
		setExtremeDonator(false);
		setSupporter(false);
		/*
		 * Administrator - 5, 6, 51 Global modetator - 7 Game moderator - 25
		 * Graphics designer - 10 Support member - 52 Donator - 53 Extreme
		 * donator - 54
		 */
		for (int forumGroupID : groupIDS) {
			if (forumGroupID == 5 || forumGroupID == 6 || forumGroupID == 51) {
				setRights(2);
			} else if (forumGroupID == 7 || forumGroupID == 25) {
				setRights(1);
			} else if (forumGroupID == 10) {
				setGraphicDesigner(true);
			} else if (forumGroupID == 52) {
				setSupporter(true);
			} else if (forumGroupID == 53 || forumGroupID == 15) {
				setDonator(true);
			} else if (forumGroupID == 54 || forumGroupID == 14) {
				setExtremeDonator(true);
			}
		}
	}

	public void setRights(int rights) {
		this.rights = rights;
	}

	public int getRights() {
		return rights;
	}

	@SuppressWarnings("unused")
	public int getMessageIcon() {
		return getRights() == 2 || getRights() == 1 ? getRights() : false ? 10
				: isGraphicDesigner() ? 9 : isExtremeDonator() ? 11
						: isDonator() ? 8 : getRights();
	}

	public WorldPacketsEncoder getPackets() {
		return session.getWorldPackets();
	}

	public boolean hasStarted() {
		return started;
	}

	public boolean isRunning() {
		return running;
	}

	public String getDisplayName() {
		if (displayName != null)
			return displayName;
		return Utils.formatPlayerNameForDisplay(username);
	}

	public boolean hasDisplayName() {
		return displayName != null;
	}

	public Appearence getAppearence() {
		return appearence;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public int getTemporaryMoveType() {
		return temporaryMovementType;
	}

	public void setTemporaryMoveType(int temporaryMovementType) {
		this.temporaryMovementType = temporaryMovementType;
	}

	public LocalPlayerUpdate getLocalPlayerUpdate() {
		return localPlayerUpdate;
	}

	public LocalNPCUpdate getLocalNPCUpdate() {
		return localNPCUpdate;
	}

	public int getDisplayMode() {
		return displayMode;
	}

	public InterfaceManager getInterfaceManager() {
		return interfaceManager;
	}

	public Session getSession() {
		return session;
	}

	public void setScreenWidth(int screenWidth) {
		this.screenWidth = screenWidth;
	}

	public int getScreenWidth() {
		return screenWidth;
	}

	public void setScreenHeight(int screenHeight) {
		this.screenHeight = screenHeight;
	}

	public int getScreenHeight() {
		return screenHeight;
	}

	public boolean clientHasLoadedMapRegion() {
		return clientLoadedMapRegion;
	}

	public void setClientHasLoadedMapRegion() {
		clientLoadedMapRegion = true;
	}

	public void setDisplayMode(int displayMode) {
		this.displayMode = displayMode;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public Skills getSkills() {
		return skills;
	}

	public byte getRunEnergy() {
		return runEnergy;
	}

	public void drainRunEnergy() {
		setRunEnergy(runEnergy - 1);
	}

	public void setRunEnergy(int runEnergy) {
		if (runEnergy < 0)
			runEnergy = 0;
		else if (runEnergy > 100)
			runEnergy = 100;
		this.runEnergy = (byte) runEnergy;
		getPackets().sendRunEnergy();
	}

	public boolean isResting() {
		return resting != 0;
	}

	public void setResting(int resting) {
		this.resting = resting;
		sendRunButtonConfig();
	}

	public ActionManager getActionManager() {
		return actionManager;
	}

	public void setRouteEvent(RouteEvent routeEvent) {
		this.routeEvent = routeEvent;
	}

	public DialogueManager getDialogueManager() {
		return dialogueManager;
	}

	public CombatDefinitions getCombatDefinitions() {
		return combatDefinitions;
	}

	@Override
	public double getMagePrayerMultiplier() {
		return 0.6;
	}

	@Override
	public double getRangePrayerMultiplier() {
		return 0.6;
	}

	@Override
	public double getMeleePrayerMultiplier() {
		return 0.6;
	}

	public void sendSoulSplit(final Hit hit, final Entity user) {
		final Player target = this;
		if (hit.getDamage() > 0)
			World.sendProjectile(user, this, 2263, 11, 11, 20, 5, 0, 0);
		user.heal(hit.getDamage() / 5);
		prayer.drainPrayer(hit.getDamage() / 5);
		WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {
				setNextGraphics(new Graphics(2264));
				if (hit.getDamage() > 0)
					World.sendProjectile(target, user, 2263, 11, 11, 20, 5, 0,
							0);
			}
		}, 0);
	}

	@Override
	public void handleIngoingHit(final Hit hit) {
		if (hit.getLook() != HitLook.MELEE_DAMAGE
				&& hit.getLook() != HitLook.RANGE_DAMAGE
				&& hit.getLook() != HitLook.MAGIC_DAMAGE)
			return;
		if (invulnerable) {
			hit.setDamage(0);
			return;
		}
		if (auraManager.usingPenance()) {
			int amount = (int) (hit.getDamage() * 0.2);
			if (amount > 0)
				prayer.restorePrayer(amount);
		}
		Entity source = hit.getSource();
		if (source == null)
			return;
		if (polDelay > Utils.currentTimeMillis())
			hit.setDamage((int) (hit.getDamage() * 0.5));
		if (prayer.hasPrayersOn() && hit.getDamage() != 0) {
			if (hit.getLook() == HitLook.MAGIC_DAMAGE) {
				if (prayer.usingPrayer(0, 17))
					hit.setDamage((int) (hit.getDamage() * source
							.getMagePrayerMultiplier()));
				else if (prayer.usingPrayer(1, 7)) {
					int deflectedDamage = source instanceof Nex ? 0
							: (int) (hit.getDamage() * 0.1);
					hit.setDamage((int) (hit.getDamage() * source
							.getMagePrayerMultiplier()));
					if (deflectedDamage > 0) {
						source.applyHit(new Hit(this, deflectedDamage,
								HitLook.REFLECTED_DAMAGE));
						setNextGraphics(new Graphics(2228));
						setNextAnimation(new Animation(12573));
					}
				}
			} else if (hit.getLook() == HitLook.RANGE_DAMAGE) {
				if (prayer.usingPrayer(0, 18))
					hit.setDamage((int) (hit.getDamage() * source
							.getRangePrayerMultiplier()));
				else if (prayer.usingPrayer(1, 8)) {
					int deflectedDamage = source instanceof Nex ? 0
							: (int) (hit.getDamage() * 0.1);
					hit.setDamage((int) (hit.getDamage() * source
							.getRangePrayerMultiplier()));
					if (deflectedDamage > 0) {
						source.applyHit(new Hit(this, deflectedDamage,
								HitLook.REFLECTED_DAMAGE));
						setNextGraphics(new Graphics(2229));
						setNextAnimation(new Animation(12573));
					}
				}
			} else if (hit.getLook() == HitLook.MELEE_DAMAGE) {
				if (prayer.usingPrayer(0, 19))
					hit.setDamage((int) (hit.getDamage() * source
							.getMeleePrayerMultiplier()));
				else if (prayer.usingPrayer(1, 9)) {
					int deflectedDamage = source instanceof Nex ? 0
							: (int) (hit.getDamage() * 0.1);
					hit.setDamage((int) (hit.getDamage() * source
							.getMeleePrayerMultiplier()));
					if (deflectedDamage > 0) {
						source.applyHit(new Hit(this, deflectedDamage,
								HitLook.REFLECTED_DAMAGE));
						setNextGraphics(new Graphics(2230));
						setNextAnimation(new Animation(12573));
					}
				}
			}
		}
		if (hit.getDamage() > 200) {
			if (hit.getLook() == HitLook.MELEE_DAMAGE) {
				int reducedDamage = (hit.getDamage() - 200)
						* combatDefinitions.getBonuses()[CombatDefinitions.ABSORB_MELEE]
						/ 100;
				if (reducedDamage > 0) {
					hit.setDamage(hit.getDamage() - reducedDamage);
					hit.setSoaking(new Hit(source, reducedDamage,
							HitLook.ABSORB_DAMAGE));
				}
			} else if (hit.getLook() == HitLook.RANGE_DAMAGE) {
				int reducedDamage = (hit.getDamage() - 200)
						* combatDefinitions.getBonuses()[CombatDefinitions.ABSORB_RANGE]
						/ 100;
				if (reducedDamage > 0) {
					hit.setDamage(hit.getDamage() - reducedDamage);
					hit.setSoaking(new Hit(source, reducedDamage,
							HitLook.ABSORB_DAMAGE));
				}
			} else if (hit.getLook() == HitLook.MAGIC_DAMAGE) {
				int reducedDamage = (hit.getDamage() - 200)
						* combatDefinitions.getBonuses()[CombatDefinitions.ABSORB_MAGIC]
						/ 100;
				if (reducedDamage > 0) {
					hit.setDamage(hit.getDamage() - reducedDamage);
					hit.setSoaking(new Hit(source, reducedDamage,
							HitLook.ABSORB_DAMAGE));
				}
			}
		}
		int shieldId = equipment.getShieldId();
		if (shieldId == 13742) { // elsyian
			if (Utils.getRandom(100) <= 70)
				hit.setDamage((int) (hit.getDamage() * 0.75));
		} else if (shieldId == 13740) { // divine
			int drain = (int) (Math.ceil(hit.getDamage() * 0.3) / 2);
			if (prayer.getPrayerpoints() >= drain) {
				hit.setDamage((int) (hit.getDamage() * 0.70));
				prayer.drainPrayer(drain);
			}
		}
		if (castedVeng && hit.getDamage() >= 4) {
			castedVeng = false;
			setNextForceTalk(new ForceTalk("Taste vengeance!"));
			source.applyHit(new Hit(this, (int) (hit.getDamage() * 0.75),
					HitLook.REGULAR_DAMAGE));
		}
		if (source instanceof Player) {
			final Player p2 = (Player) source;
			if (p2.prayer.hasPrayersOn()) {
				if (p2.prayer.usingPrayer(0, 24)) { // smite
					int drain = hit.getDamage() / 4;
					if (drain > 0)
						prayer.drainPrayer(drain);
				} else {
					if (hit.getDamage() == 0)
						return;
					if (!p2.prayer.isBoostedLeech()) {
						if (hit.getLook() == HitLook.MELEE_DAMAGE) {
							if (p2.prayer.usingPrayer(1, 19)) {
								if (Utils.getRandom(4) == 0) {
									p2.prayer.increaseTurmoilBonus(this);
									p2.prayer.setBoostedLeech(true);
									return;
								}
							} else if (p2.prayer.usingPrayer(1, 1)) { // sap att
								if (Utils.getRandom(4) == 0) {
									if (p2.prayer.reachedMax(0)) {
										p2.getPackets()
												.sendGameMessage(
														"Your opponent has been weakened so much that your sap curse has no effect.",
														true);
									} else {
										p2.prayer.increaseLeechBonus(0);
										p2.getPackets()
												.sendGameMessage(
														"Your curse drains Attack from the enemy, boosting your Attack.",
														true);
									}
									p2.setNextAnimation(new Animation(12569));
									p2.setNextGraphics(new Graphics(2214));
									p2.prayer.setBoostedLeech(true);
									World.sendProjectile(p2, this, 2215, 35,
											35, 20, 5, 0, 0);
									WorldTasksManager.schedule(new WorldTask() {
										@Override
										public void run() {
											setNextGraphics(new Graphics(2216));
										}
									}, 1);
									return;
								}
							} else {
								if (p2.prayer.usingPrayer(1, 10)) {
									if (Utils.getRandom(7) == 0) {
										if (p2.prayer.reachedMax(3)) {
											p2.getPackets()
													.sendGameMessage(
															"Your opponent has been weakened so much that your leech curse has no effect.",
															true);
										} else {
											p2.prayer.increaseLeechBonus(3);
											p2.getPackets()
													.sendGameMessage(
															"Your curse drains Attack from the enemy, boosting your Attack.",
															true);
										}
										p2.setNextAnimation(new Animation(12575));
										p2.prayer.setBoostedLeech(true);
										World.sendProjectile(p2, this, 2231,
												35, 35, 20, 5, 0, 0);
										WorldTasksManager.schedule(
												new WorldTask() {
													@Override
													public void run() {
														setNextGraphics(new Graphics(
																2232));
													}
												}, 1);
										return;
									}
								}
								if (p2.prayer.usingPrayer(1, 14)) {
									if (Utils.getRandom(7) == 0) {
										if (p2.prayer.reachedMax(7)) {
											p2.getPackets()
													.sendGameMessage(
															"Your opponent has been weakened so much that your leech curse has no effect.",
															true);
										} else {
											p2.prayer.increaseLeechBonus(7);
											p2.getPackets()
													.sendGameMessage(
															"Your curse drains Strength from the enemy, boosting your Strength.",
															true);
										}
										p2.setNextAnimation(new Animation(12575));
										p2.prayer.setBoostedLeech(true);
										World.sendProjectile(p2, this, 2248,
												35, 35, 20, 5, 0, 0);
										WorldTasksManager.schedule(
												new WorldTask() {
													@Override
													public void run() {
														setNextGraphics(new Graphics(
																2250));
													}
												}, 1);
										return;
									}
								}

							}
						}
						if (hit.getLook() == HitLook.RANGE_DAMAGE) {
							if (p2.prayer.usingPrayer(1, 2)) { // sap range
								if (Utils.getRandom(4) == 0) {
									if (p2.prayer.reachedMax(1)) {
										p2.getPackets()
												.sendGameMessage(
														"Your opponent has been weakened so much that your sap curse has no effect.",
														true);
									} else {
										p2.prayer.increaseLeechBonus(1);
										p2.getPackets()
												.sendGameMessage(
														"Your curse drains Range from the enemy, boosting your Range.",
														true);
									}
									p2.setNextAnimation(new Animation(12569));
									p2.setNextGraphics(new Graphics(2217));
									p2.prayer.setBoostedLeech(true);
									World.sendProjectile(p2, this, 2218, 35,
											35, 20, 5, 0, 0);
									WorldTasksManager.schedule(new WorldTask() {
										@Override
										public void run() {
											setNextGraphics(new Graphics(2219));
										}
									}, 1);
									return;
								}
							} else if (p2.prayer.usingPrayer(1, 11)) {
								if (Utils.getRandom(7) == 0) {
									if (p2.prayer.reachedMax(4)) {
										p2.getPackets()
												.sendGameMessage(
														"Your opponent has been weakened so much that your leech curse has no effect.",
														true);
									} else {
										p2.prayer.increaseLeechBonus(4);
										p2.getPackets()
												.sendGameMessage(
														"Your curse drains Range from the enemy, boosting your Range.",
														true);
									}
									p2.setNextAnimation(new Animation(12575));
									p2.prayer.setBoostedLeech(true);
									World.sendProjectile(p2, this, 2236, 35,
											35, 20, 5, 0, 0);
									WorldTasksManager.schedule(new WorldTask() {
										@Override
										public void run() {
											setNextGraphics(new Graphics(2238));
										}
									});
									return;
								}
							}
						}
						if (hit.getLook() == HitLook.MAGIC_DAMAGE) {
							if (p2.prayer.usingPrayer(1, 3)) { // sap mage
								if (Utils.getRandom(4) == 0) {
									if (p2.prayer.reachedMax(2)) {
										p2.getPackets()
												.sendGameMessage(
														"Your opponent has been weakened so much that your sap curse has no effect.",
														true);
									} else {
										p2.prayer.increaseLeechBonus(2);
										p2.getPackets()
												.sendGameMessage(
														"Your curse drains Magic from the enemy, boosting your Magic.",
														true);
									}
									p2.setNextAnimation(new Animation(12569));
									p2.setNextGraphics(new Graphics(2220));
									p2.prayer.setBoostedLeech(true);
									World.sendProjectile(p2, this, 2221, 35,
											35, 20, 5, 0, 0);
									WorldTasksManager.schedule(new WorldTask() {
										@Override
										public void run() {
											setNextGraphics(new Graphics(2222));
										}
									}, 1);
									return;
								}
							} else if (p2.prayer.usingPrayer(1, 12)) {
								if (Utils.getRandom(7) == 0) {
									if (p2.prayer.reachedMax(5)) {
										p2.getPackets()
												.sendGameMessage(
														"Your opponent has been weakened so much that your leech curse has no effect.",
														true);
									} else {
										p2.prayer.increaseLeechBonus(5);
										p2.getPackets()
												.sendGameMessage(
														"Your curse drains Magic from the enemy, boosting your Magic.",
														true);
									}
									p2.setNextAnimation(new Animation(12575));
									p2.prayer.setBoostedLeech(true);
									World.sendProjectile(p2, this, 2240, 35,
											35, 20, 5, 0, 0);
									WorldTasksManager.schedule(new WorldTask() {
										@Override
										public void run() {
											setNextGraphics(new Graphics(2242));
										}
									}, 1);
									return;
								}
							}
						}

						// overall

						if (p2.prayer.usingPrayer(1, 13)) { // leech defence
							if (Utils.getRandom(10) == 0) {
								if (p2.prayer.reachedMax(6)) {
									p2.getPackets()
											.sendGameMessage(
													"Your opponent has been weakened so much that your leech curse has no effect.",
													true);
								} else {
									p2.prayer.increaseLeechBonus(6);
									p2.getPackets()
											.sendGameMessage(
													"Your curse drains Defence from the enemy, boosting your Defence.",
													true);
								}
								p2.setNextAnimation(new Animation(12575));
								p2.prayer.setBoostedLeech(true);
								World.sendProjectile(p2, this, 2244, 35, 35,
										20, 5, 0, 0);
								WorldTasksManager.schedule(new WorldTask() {
									@Override
									public void run() {
										setNextGraphics(new Graphics(2246));
									}
								}, 1);
								return;
							}
						}

						if (p2.prayer.usingPrayer(1, 15)) {
							if (Utils.getRandom(10) == 0) {
								if (getRunEnergy() <= 0) {
									p2.getPackets()
											.sendGameMessage(
													"Your opponent has been weakened so much that your leech curse has no effect.",
													true);
								} else {
									p2.setRunEnergy(p2.getRunEnergy() > 90 ? 100
											: p2.getRunEnergy() + 10);
									setRunEnergy(p2.getRunEnergy() > 10 ? getRunEnergy() - 10
											: 0);
								}
								p2.setNextAnimation(new Animation(12575));
								p2.prayer.setBoostedLeech(true);
								World.sendProjectile(p2, this, 2256, 35, 35,
										20, 5, 0, 0);
								WorldTasksManager.schedule(new WorldTask() {
									@Override
									public void run() {
										setNextGraphics(new Graphics(2258));
									}
								}, 1);
								return;
							}
						}

						if (p2.prayer.usingPrayer(1, 16)) {
							if (Utils.getRandom(10) == 0) {
								if (combatDefinitions
										.getSpecialAttackPercentage() <= 0) {
									p2.getPackets()
											.sendGameMessage(
													"Your opponent has been weakened so much that your leech curse has no effect.",
													true);
								} else {
									p2.combatDefinitions.restoreSpecialAttack();
									combatDefinitions
											.desecreaseSpecialAttack(10);
								}
								p2.setNextAnimation(new Animation(12575));
								p2.prayer.setBoostedLeech(true);
								World.sendProjectile(p2, this, 2252, 35, 35,
										20, 5, 0, 0);
								WorldTasksManager.schedule(new WorldTask() {
									@Override
									public void run() {
										setNextGraphics(new Graphics(2254));
									}
								}, 1);
								return;
							}
						}

						if (p2.prayer.usingPrayer(1, 4)) { // sap spec
							if (Utils.getRandom(10) == 0) {
								p2.setNextAnimation(new Animation(12569));
								p2.setNextGraphics(new Graphics(2223));
								p2.prayer.setBoostedLeech(true);
								if (combatDefinitions
										.getSpecialAttackPercentage() <= 0) {
									p2.getPackets()
											.sendGameMessage(
													"Your opponent has been weakened so much that your sap curse has no effect.",
													true);
								} else {
									combatDefinitions
											.desecreaseSpecialAttack(10);
								}
								World.sendProjectile(p2, this, 2224, 35, 35,
										20, 5, 0, 0);
								WorldTasksManager.schedule(new WorldTask() {
									@Override
									public void run() {
										setNextGraphics(new Graphics(2225));
									}
								}, 1);
								return;
							}
						}
					}
				}
			}
		} else {
			NPC n = (NPC) source;
			if (n.getId() == 13448)
				sendSoulSplit(hit, n);
		}
	}

	@Override
	public void sendDeath(final Entity source) {
		if (prayer.hasPrayersOn()
				&& getTemporaryAttributtes().get("startedDuel") != Boolean.TRUE) {
			if (prayer.usingPrayer(0, 22)) {
				setNextGraphics(new Graphics(437));
				final Player target = this;
				if (isAtMultiArea()) {
					for (int regionId : getMapRegionsIds()) {
						List<Integer> playersIndexes = World
								.getRegion(regionId).getPlayerIndexes();
						if (playersIndexes != null) {
							for (int playerIndex : playersIndexes) {
								Player player = World.getPlayers().get(
										playerIndex);
								if (player == null
										|| !player.hasStarted()
										|| player.isDead()
										|| player.hasFinished()
										|| !player.withinDistance(this, 1)
										|| !player.isCanPvp()
										|| !target.getControlerManager()
												.canHit(player))
									continue;
								player.applyHit(new Hit(
										target,
										Utils.getRandom((int) (skills
												.getLevelForXp(Skills.PRAYER) * 2.5)),
										HitLook.REGULAR_DAMAGE));
							}
						}
						List<Integer> npcsIndexes = World.getRegion(regionId)
								.getNPCsIndexes();
						if (npcsIndexes != null) {
							for (int npcIndex : npcsIndexes) {
								NPC npc = World.getNPCs().get(npcIndex);
								if (npc == null
										|| npc.isDead()
										|| npc.hasFinished()
										|| !npc.withinDistance(this, 1)
										|| !npc.getDefinitions()
												.hasAttackOption()
										|| !target.getControlerManager()
												.canHit(npc))
									continue;
								npc.applyHit(new Hit(
										target,
										Utils.getRandom((int) (skills
												.getLevelForXp(Skills.PRAYER) * 2.5)),
										HitLook.REGULAR_DAMAGE));
							}
						}
					}
				} else {
					if (source != null && source != this && !source.isDead()
							&& !source.hasFinished()
							&& source.withinDistance(this, 1))
						source.applyHit(new Hit(target, Utils
								.getRandom((int) (skills
										.getLevelForXp(Skills.PRAYER) * 2.5)),
								HitLook.REGULAR_DAMAGE));
				}
				WorldTasksManager.schedule(new WorldTask() {
					@Override
					public void run() {
						World.sendGraphics(target, new Graphics(438),
								new WorldTile(target.getX() - 1, target.getY(),
										target.getPlane()));
						World.sendGraphics(target, new Graphics(438),
								new WorldTile(target.getX() + 1, target.getY(),
										target.getPlane()));
						World.sendGraphics(target, new Graphics(438),
								new WorldTile(target.getX(), target.getY() - 1,
										target.getPlane()));
						World.sendGraphics(target, new Graphics(438),
								new WorldTile(target.getX(), target.getY() + 1,
										target.getPlane()));
						World.sendGraphics(target, new Graphics(438),
								new WorldTile(target.getX() - 1,
										target.getY() - 1, target.getPlane()));
						World.sendGraphics(target, new Graphics(438),
								new WorldTile(target.getX() - 1,
										target.getY() + 1, target.getPlane()));
						World.sendGraphics(target, new Graphics(438),
								new WorldTile(target.getX() + 1,
										target.getY() - 1, target.getPlane()));
						World.sendGraphics(target, new Graphics(438),
								new WorldTile(target.getX() + 1,
										target.getY() + 1, target.getPlane()));
					}
				});
			} else if (prayer.usingPrayer(1, 17)) {
				World.sendProjectile(this, new WorldTile(getX() + 2,
						getY() + 2, getPlane()), 2260, 24, 0, 41, 35, 30, 0);
				World.sendProjectile(this, new WorldTile(getX() + 2, getY(),
						getPlane()), 2260, 41, 0, 41, 35, 30, 0);
				World.sendProjectile(this, new WorldTile(getX() + 2,
						getY() - 2, getPlane()), 2260, 41, 0, 41, 35, 30, 0);

				World.sendProjectile(this, new WorldTile(getX() - 2,
						getY() + 2, getPlane()), 2260, 41, 0, 41, 35, 30, 0);
				World.sendProjectile(this, new WorldTile(getX() - 2, getY(),
						getPlane()), 2260, 41, 0, 41, 35, 30, 0);
				World.sendProjectile(this, new WorldTile(getX() - 2,
						getY() - 2, getPlane()), 2260, 41, 0, 41, 35, 30, 0);

				World.sendProjectile(this, new WorldTile(getX(), getY() + 2,
						getPlane()), 2260, 41, 0, 41, 35, 30, 0);
				World.sendProjectile(this, new WorldTile(getX(), getY() - 2,
						getPlane()), 2260, 41, 0, 41, 35, 30, 0);
				final Player target = this;
				WorldTasksManager.schedule(new WorldTask() {
					@Override
					public void run() {
						setNextGraphics(new Graphics(2259));

						if (isAtMultiArea()) {
							for (int regionId : getMapRegionsIds()) {
								List<Integer> playersIndexes = World.getRegion(
										regionId).getPlayerIndexes();
								if (playersIndexes != null) {
									for (int playerIndex : playersIndexes) {
										Player player = World.getPlayers().get(
												playerIndex);
										if (player == null
												|| !player.hasStarted()
												|| player.isDead()
												|| player.hasFinished()
												|| !player.isCanPvp()
												|| !player.withinDistance(
														target, 2)
												|| !target
														.getControlerManager()
														.canHit(player))
											continue;
										player.applyHit(new Hit(
												target,
												Utils.getRandom((skills
														.getLevelForXp(Skills.PRAYER) * 3)),
												HitLook.REGULAR_DAMAGE));
									}
								}
								List<Integer> npcsIndexes = World.getRegion(
										regionId).getNPCsIndexes();
								if (npcsIndexes != null) {
									for (int npcIndex : npcsIndexes) {
										NPC npc = World.getNPCs().get(npcIndex);
										if (npc == null
												|| npc.isDead()
												|| npc.hasFinished()
												|| !npc.withinDistance(target,
														2)
												|| !npc.getDefinitions()
														.hasAttackOption()
												|| !target
														.getControlerManager()
														.canHit(npc))
											continue;
										npc.applyHit(new Hit(
												target,
												Utils.getRandom((skills
														.getLevelForXp(Skills.PRAYER) * 3)),
												HitLook.REGULAR_DAMAGE));
									}
								}
							}
						} else {
							if (source != null && source != target
									&& !source.isDead()
									&& !source.hasFinished()
									&& source.withinDistance(target, 2))
								source.applyHit(new Hit(
										target,
										Utils.getRandom((skills
												.getLevelForXp(Skills.PRAYER) * 3)),
										HitLook.REGULAR_DAMAGE));
						}

						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() + 2, getY() + 2,
										getPlane()));
						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() + 2, getY(), getPlane()));
						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() + 2, getY() - 2,
										getPlane()));

						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() - 2, getY() + 2,
										getPlane()));
						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() - 2, getY(), getPlane()));
						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() - 2, getY() - 2,
										getPlane()));

						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX(), getY() + 2, getPlane()));
						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX(), getY() - 2, getPlane()));

						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() + 1, getY() + 1,
										getPlane()));
						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() + 1, getY() - 1,
										getPlane()));
						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() - 1, getY() + 1,
										getPlane()));
						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() - 1, getY() - 1,
										getPlane()));
					}
				});
			}
		}
		setNextAnimation(new Animation(-1));
		if (!controlerManager.sendDeath())
			return;
		lock(7);
		stopAll();
		if (familiar != null)
			familiar.sendDeath(this);
		final WorldTile deathTile = new WorldTile(this);
		WorldTasksManager.schedule(new WorldTask() {
			int loop;

			@Override
			public void run() {
				if (loop == 0) {
					setNextAnimation(new Animation(836));
				} else if (loop == 1) {
					getPackets().sendGameMessage("Oh dear, you have died.");
				} else if (loop == 3) {
					controlerManager.startControler("DeathEvent", deathTile,
							hasSkull());
				} else if (loop == 4) {
					getPackets().sendMusicEffect(90);
					stop();
				}
				loop++;
			}
		}, 0, 1);
	}

	/*
	 * default items on death, now only used for wilderness
	 */
	public void sendItemsOnDeath(Player killer, boolean dropItems) {
		Integer[][] slots = GraveStone.getItemSlotsKeptOnDeath(this, true,
				dropItems, getPrayer().isProtectingItem());
		sendItemsOnDeath(killer, new WorldTile(this), new WorldTile(this),
				true, slots);
	}

	/*
	 * default items on death, now only used for wilderness
	 */
	public void sendItemsOnDeath(Player killer) {
		sendItemsOnDeath(killer, hasSkull());
	}

	public void sendItemsOnDeath(Player killer, WorldTile deathTile,
			WorldTile respawnTile, boolean wilderness, Integer[][] slots) {
		if (getRights() == 2 && Settings.HOSTED)
			return;
		charges.die(slots[1], slots[3]); // degrades droped and lost items only
		auraManager.removeAura();
		Item[][] items = GraveStone.getItemsKeptOnDeath(this, slots);
		inventory.reset();
		equipment.reset();
		appearence.generateAppearenceData();
		for (Item item : items[0])
			inventory.addItemDrop(item.getId(), item.getAmount(), respawnTile);
		if (items[1].length != 0) {
			if (wilderness) {
				for (Item item : items[1])
					World.addGroundItem(item, deathTile, killer == null ? this
							: killer, true, 60, 0);
			} else
				new GraveStone(this, deathTile, items[1]);
			if (killer != null)
				Logger.globalLog(
						username,
						session.getIP(),
						new String(killer.getUsername()
								+ " has killed "
								+ username
								+ " with the ip: "
								+ killer.getSession().getIP()
								+ " items are as follows:"
								+ Arrays.toString(items[1])
										.replace("null,", "") + " ."));
			else
				Logger.globalLog(username, session.getIP(), new String(
						"has died "
								+ username
								+ " items are as follows:"
								+ Arrays.toString(items[1])
										.replace("null,", "") + "."));
		}
	}

	public boolean increaseKillCount(Player killed) {
		killed.deathCount++;
		PkRank.checkRank(killed);
		if (killed.getSession().getIP().equals(getSession().getIP()))
			return false;
		if ((Utils.currentTimeMillis() - lastKilledTime) > 300000) { // give
			// spin
			// only if
			// 5
			// minutes
			// passed,
			// this is
			// to
			// prevent
			// farming
			lastKilledTime = Utils.currentTimeMillis();
		}
		killCount++;
		getPackets().sendGameMessage(
				"<col=ff0000>You have killed " + killed.getDisplayName()
						+ ", you have now " + killCount + " kills.");
		PkRank.checkRank(this);
		return true;
	}

	public void sendRandomJail(Player p) {
		p.resetWalkSteps();
		switch (Utils.getRandom(6)) {
		case 0:
			p.setNextWorldTile(new WorldTile(2669, 10387, 0));
			break;
		case 1:
			p.setNextWorldTile(new WorldTile(2669, 10383, 0));
			break;
		case 2:
			p.setNextWorldTile(new WorldTile(2669, 10379, 0));
			break;
		case 3:
			p.setNextWorldTile(new WorldTile(2673, 10379, 0));
			break;
		case 4:
			p.setNextWorldTile(new WorldTile(2673, 10385, 0));
			break;
		case 5:
			p.setNextWorldTile(new WorldTile(2677, 10387, 0));
			break;
		case 6:
			p.setNextWorldTile(new WorldTile(2677, 10383, 0));
			break;
		}
	}

	@Override
	public int getSize() {
		return appearence.getSize();
	}

	public boolean isCanPvp() {
		return canPvp;
	}

	public void setCanPvp(boolean canPvp) {
		this.canPvp = canPvp;
		appearence.generateAppearenceData();
		getPackets().sendPlayerOption(canPvp ? "Attack" : "null", 1, true);
		getPackets().sendPlayerUnderNPCPriority(canPvp);
	}

	public Prayer getPrayer() {
		return prayer;
	}

	public boolean isLocked() {
		return lockDelay > WorldThread.WORLD_CYCLE;// Utils.currentTimeMillis();
	}

	public void lock() {
		lockDelay = Long.MAX_VALUE;
	}

	public void lock(long time) {
		lockDelay = time == -1 ? Long.MAX_VALUE : WorldThread.WORLD_CYCLE
				+ time;/*
						 * Utils . currentTimeMillis ( ) + ( time * 600 )
						 */
		;
	}

	public void unlock() {
		lockDelay = 0;
	}

	public void useStairs(int emoteId, final WorldTile dest, int useDelay,
			int totalDelay) {
		useStairs(emoteId, dest, useDelay, totalDelay, null);
	}

	public void useStairs(int emoteId, final WorldTile dest, int useDelay,
			int totalDelay, final String message) {
		useStairs(emoteId, dest, useDelay, totalDelay, message, false);
	}

	public void useStairs(int emoteId, final WorldTile dest, int useDelay,
			int totalDelay, final String message, final boolean resetAnimation) {
		stopAll();
		lock(totalDelay);
		if (emoteId != -1)
			setNextAnimation(new Animation(emoteId));
		if (useDelay == 0)
			setNextWorldTile(dest);
		else {
			WorldTasksManager.schedule(new WorldTask() {
				@Override
				public void run() {
					if (isDead())
						return;
					if (resetAnimation)
						setNextAnimation(new Animation(-1));
					setNextWorldTile(dest);
					if (message != null)
						getPackets().sendGameMessage(message);
				}
			}, useDelay - 1);
		}
	}

	public Bank getBank() {
		return bank;
	}

	public ControlerManager getControlerManager() {
		return controlerManager;
	}

	public void switchMouseButtons() {
		mouseButtons = !mouseButtons;
		refreshMouseButtons();
	}

	public void switchAllowChatEffects() {
		allowChatEffects = !allowChatEffects;
		refreshAllowChatEffects();
	}

	public void switchAcceptAid() {
		acceptAid = !acceptAid;
		refreshAcceptAid();
	}

	public void switchProfanityFilter() {
		profanityFilter = !profanityFilter;
		refreshProfanityFilter();
	}


	public void refreshAllowChatEffects() {
		getVarsManager().sendVar(171, allowChatEffects ? 0 : 1);
	}

	public void refreshAcceptAid() {
		getVarsManager().sendVar(427, acceptAid ? 1 : 0);
	}

	public void refreshProfanityFilter() {
		getVarsManager().sendVarBit(8780, profanityFilter ? 0 : 1);
	}

	public void refreshMouseButtons() {
		getVarsManager().sendVar(170, mouseButtons ? 0 : 1);
	}

	public void refreshPrivateChatSetup() {
		getVarsManager().sendVar(287, privateChatSetup);
	}

	public void refreshOtherChatsSetup() {
		getVarsManager().setVarBit(9188, friendChatSetup);
		getVarsManager().setVarBit(3612, clanChatSetup);
		getVarsManager().forceSendVarBit(9191, guestChatSetup);
	}

	public void setPrivateChatSetup(int privateChatSetup) {
		this.privateChatSetup = privateChatSetup;
	}

	public void setClanChatSetup(int clanChatSetup) {
		this.clanChatSetup = clanChatSetup;
	}

	public void setGuestChatSetup(int guestChatSetup) {
		this.guestChatSetup = guestChatSetup;
	}

	public void setFriendChatSetup(int friendChatSetup) {
		this.friendChatSetup = friendChatSetup;
	}

	public int getPrivateChatSetup() {
		return privateChatSetup;
	}

	public boolean isForceNextMapLoadRefresh() {
		return forceNextMapLoadRefresh;
	}

	public void setForceNextMapLoadRefresh(boolean forceNextMapLoadRefresh) {
		this.forceNextMapLoadRefresh = forceNextMapLoadRefresh;
	}

	public FriendsIgnores getFriendsIgnores() {
		return friendsIgnores;
	}

	/*
	 * do not use this, only used by pm
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public void addPotDelay(long time) {
		potDelay = time + Utils.currentTimeMillis();
	}

	public long getPotDelay() {
		return potDelay;
	}

	public void addFoodDelay(long time) {
		foodDelay = time + Utils.currentTimeMillis();
	}

	public long getFoodDelay() {
		return foodDelay;
	}

	public void addPoisonImmune(long time) {
		poisonImmune = time + Utils.currentTimeMillis();
		getPoison().reset();
	}

	public long getPoisonImmune() {
		return poisonImmune;
	}

	public void addFireImmune(long time) {
		fireImmune = time + Utils.currentTimeMillis();
	}

	public long getFireImmune() {
		return fireImmune;
	}

	@Override
	public void heal(int ammount, int extra) {
		super.heal(ammount, extra);
		refreshHitPoints();
	}

	public MusicsManager getMusicsManager() {
		return musicsManager;
	}

	public HintIconsManager getHintIconsManager() {
		return hintIconsManager;
	}

	public boolean isCastVeng() {
		return castedVeng;
	}

	public void setCastVeng(boolean castVeng) {
		this.castedVeng = castVeng;
	}

	public int getKillCount() {
		return killCount;
	}

	public int getBarrowsKillCount() {
		return barrowsKillCount;
	}

	public int setBarrowsKillCount(int barrowsKillCount) {
		return this.barrowsKillCount = barrowsKillCount;
	}

	public int setKillCount(int killCount) {
		return this.killCount = killCount;
	}

	public int getDeathCount() {
		return deathCount;
	}

	public int setDeathCount(int deathCount) {
		return this.deathCount = deathCount;
	}

	public void setCloseInterfacesEvent(Runnable closeInterfacesEvent) {
		this.closeInterfacesEvent = closeInterfacesEvent;
	}

	public long getMuted() {
		return muted;
	}

	public void setMuted(long muted) {
		this.muted = muted;
	}

	public long getJailed() {
		return jailed;
	}

	public void setJailed(long jailed) {
		this.jailed = jailed;
	}

	public boolean isPermBanned() {
		return permBanned;
	}

	public void setPermBanned(boolean permBanned) {
		this.permBanned = permBanned;
	}

	public long getBanned() {
		return banned;
	}

	public void setBanned(long banned) {
		this.banned = banned;
	}

	public ChargesManager getCharges() {
		return charges;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean[] getKilledBarrowBrothers() {
		return killedBarrowBrothers;
	}

	public void setHiddenBrother(int hiddenBrother) {
		this.hiddenBrother = hiddenBrother;
	}

	public int getHiddenBrother() {
		return hiddenBrother;
	}

	public void resetBarrows() {
		hiddenBrother = -1;
		killedBarrowBrothers = new boolean[7]; // includes new bro for future
		// use
		barrowsKillCount = 0;
	}

	public void resetDungeoneering() {
		currentDungProgress = new boolean[DungeonConstants.FLOORS_COUNT];
		previousDungProgress = new boolean[DungeonConstants.FLOORS_COUNT];
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
		voted = Utils.currentTimeMillis() + (24 * 60 * 60 * 1000);
	}

	public boolean isDonator() {
		return isExtremeDonator() || donator;
	}

	public boolean isExtremeDonator() {
		return extremeDonator || rights >= 1;
	}

	public void setExtremeDonator(boolean extremeDonator) {
		this.extremeDonator = extremeDonator;
	}

	public boolean isGraphicDesigner() {
		return isGraphicDesigner;
	}

	public void setGraphicDesigner(boolean isGraphicDesigner) {
		this.isGraphicDesigner = isGraphicDesigner;
	}

	public void setDonator(boolean donator) {
		this.donator = donator;
	}

	public String getRecovQuestion() {
		return recovQuestion;
	}

	public void setRecovQuestion(String recovQuestion) {
		this.recovQuestion = recovQuestion;
	}

	public String getRecovAnswer() {
		return recovAnswer;
	}

	public void setRecovAnswer(String recovAnswer) {
		this.recovAnswer = recovAnswer;
	}

	public int[] getPouches() {
		return pouches;
	}

	public EmotesManager getEmotesManager() {
		return emotesManager;
	}

	public String getLastIP() {
		return lastIP;
	}

	public String getLastHostname() {
		InetAddress addr;
		try {
			addr = InetAddress.getByName(getLastIP());
			String hostname = addr.getHostName();
			return hostname;
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return null;
	}

	public PriceCheckManager getPriceCheckManager() {
		return priceCheckManager;
	}

	public void setPestPoints(int pestPoints) {
		if (pestPoints >= 500) {
			this.pestPoints = 500;
			getPackets()
					.sendGameMessage(
							"You have reached the maximum amount of commendation points, you may only have 500 at one time.");
			return;
		}
		this.pestPoints = pestPoints;
	}

	public int getPestPoints() {
		return pestPoints;
	}

	public void increaseStealingCreationPoints(int scPoints) {
		stealingCreationPoints += scPoints;
	}

	public int getStealingCreationPoints() {
		return stealingCreationPoints;
	}

	public boolean isUpdateMovementType() {
		return updateMovementType;
	}

	public long getLastPublicMessage() {
		return lastPublicMessage;
	}

	public void setLastPublicMessage(long lastPublicMessage) {
		this.lastPublicMessage = lastPublicMessage;
	}

	public CutscenesManager getCutscenesManager() {
		return cutscenesManager;
	}

	public void kickPlayerFromClanChannel(String name) {
		if (clanManager == null)
			return;
		clanManager.kickPlayerFromChat(this, name);
	}

	public void kickPlayerFromFriendsChannel(String name) {
		if (currentFriendChat == null)
			return;
		currentFriendChat.kickPlayerFromChat(this, name);
	}

	public void sendFriendsChannelMessage(ChatMessage message) {
		if (currentFriendChat == null)
			return;
		currentFriendChat.sendMessage(this, message);
	}

	public void sendClanChannelMessage(ChatMessage message) {
		if (clanManager == null)
			return;
		clanManager.sendMessage(this, message);
	}

	public void sendGuestClanChannelMessage(ChatMessage message) {
		if (guestClanManager == null)
			return;
		guestClanManager.sendMessage(this, message);
	}

	public void sendClanChannelQuickMessage(QuickChatMessage message) {
		if (clanManager == null)
			return;
		clanManager.sendQuickMessage(this, message);
	}

	public void sendGuestClanChannelQuickMessage(QuickChatMessage message) {
		if (guestClanManager == null)
			return;
		guestClanManager.sendQuickMessage(this, message);
	}

	public void sendFriendsChannelQuickMessage(QuickChatMessage message) {
		if (currentFriendChat == null)
			return;
		currentFriendChat.sendQuickMessage(this, message);
	}

	public void sendPublicChatMessage(PublicChatMessage message) {
		for (int regionId : getMapRegionsIds()) {
			List<Integer> playersIndexes = World.getRegion(regionId)
					.getPlayerIndexes();
			if (playersIndexes == null)
				continue;
			for (Integer playerIndex : playersIndexes) {
				Player p = World.getPlayers().get(playerIndex);
				if (p == null
						|| !p.hasStarted()
						|| p.hasFinished()
						|| p.getLocalPlayerUpdate().getLocalPlayers()[getIndex()] == null)
					continue;
				p.getPackets().sendPublicMessage(this, message);
			}
		}
	}

	public int[] getCompletionistCapeCustomized() {
		return completionistCapeCustomized;
	}

	public void setCompletionistCapeCustomized(int[] skillcapeCustomized) {
		this.completionistCapeCustomized = skillcapeCustomized;
	}

	public int[] getMaxedCapeCustomized() {
		return maxedCapeCustomized;
	}

	public void setMaxedCapeCustomized(int[] maxedCapeCustomized) {
		this.maxedCapeCustomized = maxedCapeCustomized;
	}

	public void setSkullId(int skullId) {
		this.skullId = skullId;
	}

	public int getSkullId() {
		return skullId;
	}

	public boolean isFilterGame() {
		return filterGame;
	}

	public void setFilterGame(boolean filterGame) {
		this.filterGame = filterGame;
	}

	public void addLogicPacketToQueue(LogicPacket packet) {
		for (LogicPacket p : logicPackets) {
			if (p.getId() == packet.getId()) {
				logicPackets.remove(p);
				break;
			}
		}
		logicPackets.add(packet);
	}

	public DominionTower getDominionTower() {
		return dominionTower;
	}

	public void setPrayerRenewalDelay(int delay) {
		this.prayerRenewalDelay = delay;
	}

	public int getOverloadDelay() {
		return overloadDelay;
	}

	public void setOverloadDelay(int overloadDelay) {
		this.overloadDelay = overloadDelay;
	}

	public Trade getTrade() {
		return trade;
	}

	public void setTeleBlockDelay(long teleDelay) {
		getTemporaryAttributtes().put("TeleBlocked",
				teleDelay + Utils.currentTimeMillis());
	}

	public long getTeleBlockDelay() {
		Long teleblock = (Long) getTemporaryAttributtes().get("TeleBlocked");
		if (teleblock == null)
			return 0;
		return teleblock;
	}

	public void setPrayerDelay(long teleDelay) {
		getTemporaryAttributtes().put("PrayerBlocked",
				teleDelay + Utils.currentTimeMillis());
		prayer.closeProtectionPrayers();
	}

	public long getPrayerDelay() {
		Long teleblock = (Long) getTemporaryAttributtes().get("PrayerBlocked");
		if (teleblock == null)
			return 0;
		return teleblock;
	}

	public Familiar getFamiliar() {
		return familiar;
	}

	public void setFamiliar(Familiar familiar) {
		this.familiar = familiar;
	}

	public FriendChatsManager getCurrentFriendChat() {
		return currentFriendChat;
	}

	public void setCurrentFriendChat(FriendChatsManager currentFriendChat) {
		this.currentFriendChat = currentFriendChat;
	}

	public String getCurrentFriendChatOwner() {
		return currentFriendChatOwner;
	}

	public void setCurrentFriendChatOwner(String currentFriendChatOwner) {
		this.currentFriendChatOwner = currentFriendChatOwner;
	}

	public int getSummoningLeftClickOption() {
		return summoningLeftClickOption;
	}

	public void setSummoningLeftClickOption(int summoningLeftClickOption) {
		this.summoningLeftClickOption = summoningLeftClickOption;
	}

	public boolean containsOneItem(int... itemIds) {
		if (getInventory().containsOneItem(itemIds))
			return true;
		if (getEquipment().containsOneItem(itemIds))
			return true;
		Familiar familiar = getFamiliar();
		if (familiar != null
				&& ((familiar.getBob() != null
						&& familiar.getBob().containsOneItem(itemIds) || familiar
							.isFinished())))
			return true;
		return false;
	}

	public boolean canSpawn() {
		if (Wilderness.isAtWild(this)
				|| getControlerManager().getControler() instanceof FightPitsArena
				|| getControlerManager().getControler() instanceof CorpBeastControler
				|| getControlerManager().getControler() instanceof PestControlLobby
				|| getControlerManager().getControler() instanceof PestControlGame
				|| getControlerManager().getControler() instanceof ZGDControler
				|| getControlerManager().getControler() instanceof GodWars
				|| getControlerManager().getControler() instanceof DTControler
				|| getControlerManager().getControler() instanceof DuelArena
				|| getControlerManager().getControler() instanceof CastleWarsPlaying
				|| getControlerManager().getControler() instanceof CastleWarsWaiting
				|| getControlerManager().getControler() instanceof FightCaves
				|| getControlerManager().getControler() instanceof FightKiln
				|| FfaZone.inPvpArea(this)
				|| getControlerManager().getControler() instanceof NomadsRequiem
				|| getControlerManager().getControler() instanceof QueenBlackDragonController
				|| getControlerManager().getControler() instanceof WarControler
				|| getControlerManager().getControler() instanceof JailControler) {
			return false;
		}
		if (getControlerManager().getControler() instanceof CrucibleControler) {
			CrucibleControler controler = (CrucibleControler) getControlerManager()
					.getControler();
			return !controler.isInside();
		}
		return true;
	}

	public long getPolDelay() {
		return polDelay;
	}

	public void addPolDelay(long delay) {
		polDelay = delay + Utils.currentTimeMillis();
	}

	public void setPolDelay(long delay) {
		this.polDelay = delay;
	}

	public List<Integer> getSwitchItemCache() {
		return switchItemCache;
	}

	public AuraManager getAuraManager() {
		return auraManager;
	}

	public int getMovementType() {
		if (getTemporaryMoveType() != -1)
			return getTemporaryMoveType();
		return getRun() ? RUN_MOVE_TYPE : WALK_MOVE_TYPE;
	}

	public List<String> getOwnedObjectManagerKeys() {
		if (ownedObjectsManagerKeys == null) // temporary
			ownedObjectsManagerKeys = new LinkedList<String>();
		return ownedObjectsManagerKeys;
	}

	public boolean hasInstantSpecial(final int weaponId) {
		switch (weaponId) {
		case 4153:
		case 15486:
		case 22207:
		case 22209:
		case 22211:
		case 22213:
		case 1377:
		case 13472:
		case 35:// Excalibur
		case 8280:
		case 14632:
		case 24455:
		case 24456:
		case 24457:
		case 14679:
			return true;
		default:
			return false;
		}
	}

	public void performInstantSpecial(final int weaponId) {
		int specAmt = PlayerCombat.getSpecialAmmount(weaponId);
		if (combatDefinitions.hasRingOfVigour())
			specAmt *= 0.9;
		if (combatDefinitions.getSpecialAttackPercentage() < specAmt) {
			getPackets().sendGameMessage("You don't have enough power left.");
			combatDefinitions.desecreaseSpecialAttack(0);
			return;
		}
		if (this.getSwitchItemCache().size() > 0) {
			ButtonHandler.submitSpecialRequest(this);
			return;
		}
		switch (weaponId) {
		case 24455:
		case 24456:
		case 24457:
			getPackets().sendGameMessage("Aren't you strong enough already?");
			break;
		case 4153:
		case 14679:
			if (!(getActionManager().getAction() instanceof PlayerCombat)) {
				getPackets()
						.sendGameMessage(
								"Warning: Since the maul's special is an instant attack, it will be wasted when used on a first strike.");
				combatDefinitions.switchUsingSpecialAttack();
				return;
			}
			PlayerCombat combat = (PlayerCombat) getActionManager().getAction();
			Entity target = combat.getTarget();
			if (!Utils.isOnRange(getX(), getY(), getSize(), target.getX(),
					target.getY(), target.getSize(), 5)) {
				combatDefinitions.switchUsingSpecialAttack();
				return;
			}
			setNextAnimation(new Animation(1667));
			setNextGraphics(new Graphics(340, 0, 96 << 16));
			int attackStyle = getCombatDefinitions().getAttackStyle();
			combat.delayNormalHit(weaponId, attackStyle, combat.getMeleeHit(
					this, combat.getRandomMaxHit(this, weaponId, attackStyle,
							false, true, 1.1, true)));
			combatDefinitions.desecreaseSpecialAttack(specAmt);
			break;
		case 1377:
		case 13472:
			setNextAnimation(new Animation(1056));
			setNextGraphics(new Graphics(246));
			setNextForceTalk(new ForceTalk("Raarrrrrgggggghhhhhhh!"));
			int defence = (int) (skills.getLevelForXp(Skills.DEFENCE) * 0.90D);
			int attack = (int) (skills.getLevelForXp(Skills.ATTACK) * 0.90D);
			int range = (int) (skills.getLevelForXp(Skills.RANGE) * 0.90D);
			int magic = (int) (skills.getLevelForXp(Skills.MAGIC) * 0.90D);
			int strength = (int) (skills.getLevelForXp(Skills.STRENGTH) * 1.2D);
			skills.set(Skills.DEFENCE, defence);
			skills.set(Skills.ATTACK, attack);
			skills.set(Skills.RANGE, range);
			skills.set(Skills.MAGIC, magic);
			skills.set(Skills.STRENGTH, strength);
			combatDefinitions.desecreaseSpecialAttack(specAmt);
			break;
		case 35:// Excalibur
		case 8280:
		case 14632:
			setNextAnimation(new Animation(1168));
			setNextGraphics(new Graphics(247));
			setNextForceTalk(new ForceTalk("For " + Settings.SERVER_NAME + "!"));
			final boolean enhanced = weaponId == 14632;
			skills.set(
					Skills.DEFENCE,
					enhanced ? (int) (skills.getLevelForXp(Skills.DEFENCE) * 1.15D)
							: (skills.getLevel(Skills.DEFENCE) + 8));
			WorldTasksManager.schedule(new WorldTask() {
				int count = 5;

				@Override
				public void run() {
					if (isDead() || hasFinished()
							|| getHitpoints() >= getMaxHitpoints()) {
						stop();
						return;
					}
					heal(enhanced ? 80 : 40);
					if (count-- == 0) {
						stop();
						return;
					}
				}
			}, 4, 2);
			combatDefinitions.desecreaseSpecialAttack(specAmt);
			break;
		case 15486:
		case 22207:
		case 22209:
		case 22211:
		case 22213:
			setNextAnimation(new Animation(12804));
			setNextGraphics(new Graphics(2319));// 2320
			setNextGraphics(new Graphics(2321));
			addPolDelay(60000);
			combatDefinitions.desecreaseSpecialAttack(specAmt);
			break;
		}
	}

	public void setDisableEquip(boolean equip) {
		disableEquip = equip;
	}

	public boolean isEquipDisabled() {
		return disableEquip;
	}

	public void addDisplayTime(long i) {
		this.displayTime = i + Utils.currentTimeMillis();
	}

	public long getDisplayTime() {
		return displayTime;
	}

	public int getPublicStatus() {
		return publicStatus;
	}

	public void setPublicStatus(int publicStatus) {
		this.publicStatus = publicStatus;
	}

	public int getClanStatus() {
		return clanStatus;
	}

	public void setClanStatus(int clanStatus) {
		this.clanStatus = clanStatus;
	}

	public int getTradeStatus() {
		return tradeStatus;
	}

	public void setTradeStatus(int tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public int getAssistStatus() {
		return assistStatus;
	}

	public void setAssistStatus(int assistStatus) {
		this.assistStatus = assistStatus;
	}

	public Notes getNotes() {
		return notes;
	}

	public IsaacKeyPair getIsaacKeyPair() {
		return isaacKeyPair;
	}

	public QuestManager getQuestManager() {
		return questManager;
	}

	public boolean isCompletedFightCaves() {
		return completedFightCaves;
	}

	public void setCompletedFightCaves() {
		if (!completedFightCaves) {
			completedFightCaves = true;
			refreshFightKilnEntrance();
		}
	}

	public boolean isCompletedFightKiln() {
		return completedFightKiln;
	}

	public void setCompletedFightKiln() {
		completedFightKiln = true;
	}

	public boolean isCompletedStealingCreation() {
		return completedStealingCreation;
	}

	public void setCompletedStealingCreation() {
		completedStealingCreation = true;
	}

	public boolean isWonFightPits() {
		return wonFightPits;
	}

	public void setWonFightPits() {
		wonFightPits = true;
	}

	public boolean isCantTrade() {
		return cantTrade;
	}

	public void setCantTrade(boolean canTrade) {
		this.cantTrade = canTrade;
	}

	public String getYellColor() {
		return yellColor;
	}

	public void setYellColor(String yellColor) {
		this.yellColor = yellColor;
	}

	/**
	 * Gets the pet.
	 * 
	 * @return The pet.
	 */
	public Pet getPet() {
		return pet;
	}

	/**
	 * Sets the pet.
	 * 
	 * @param pet
	 *            The pet to set.
	 */
	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public boolean isSupporter() {
		return isSupporter;
	}

	public void setSupporter(boolean isSupporter) {
		this.isSupporter = isSupporter;
	}

	/**
	 * Gets the petManager.
	 * 
	 * @return The petManager.
	 */
	public PetManager getPetManager() {
		return petManager;
	}

	/**
	 * Sets the petManager.
	 * 
	 * @param petManager
	 *            The petManager to set.
	 */
	public void setPetManager(PetManager petManager) {
		this.petManager = petManager;
	}

	public boolean isXpLocked() {
		return xpLocked;
	}

	public void setXpLocked(boolean locked) {
		this.xpLocked = locked;
	}

	public int getLastBonfire() {
		return lastBonfire;
	}

	public void setLastBonfire(int lastBonfire) {
		this.lastBonfire = lastBonfire;
		equipment.refreshConfigs(false);
	}

	public boolean isYellOff() {
		return yellOff;
	}

	public void setYellOff(boolean yellOff) {
		this.yellOff = yellOff;
	}

	public void setInvulnerable(boolean invulnerable) {
		this.invulnerable = invulnerable;
	}

	public double getHpBoostMultiplier() {
		return hpBoostMultiplier;
	}

	public void setHpBoostMultiplier(double hpBoostMultiplier) {
		this.hpBoostMultiplier = hpBoostMultiplier;
	}

	/**
	 * Gets the killedQueenBlackDragon.
	 * 
	 * @return The killedQueenBlackDragon.
	 */
	public boolean isKilledQueenBlackDragon() {
		return killedQueenBlackDragon;
	}

	/**
	 * Sets the killedQueenBlackDragon.
	 * 
	 * @param killedQueenBlackDragon
	 *            The killedQueenBlackDragon to set.
	 */
	public void setKilledQueenBlackDragon(boolean killedQueenBlackDragon) {
		this.killedQueenBlackDragon = killedQueenBlackDragon;
	}
	/**
	 * @return the runeSpanPoint
	 */
	public int getRuneSpanPoints() {
		return runeSpanPoints;
	}

	/**
	 * @param runeSpanPoints
	 *            the runeSpanPoint to set
	 */
	public void setRuneSpanPoint(int runeSpanPoints) {
		this.runeSpanPoints = runeSpanPoints;
	}

	/**
	 * Adds points
	 * 
	 * @param points
	 */
	public void addRunespanPoints(int points) {
		this.runeSpanPoints += points;
	}

	public DuelRules getLastDuelRules() {
		return lastDuelRules;
	}

	public void setLastDuelRules(DuelRules duelRules) {
		this.lastDuelRules = duelRules;
	}

	public boolean isTalkedWithMarv() {
		return talkedWithMarv;
	}

	public void setTalkedWithMarv() {
		talkedWithMarv = true;
	}

	public int getCrucibleHighScore() {
		return crucibleHighScore;
	}

	public void increaseCrucibleHighScore() {
		crucibleHighScore++;
	}

	public long getCreationDate() {
		return creationDate;
	}

	public House getHouse() {
		return house;
	}

	public boolean isAcceptingAid() {
		return acceptAid;
	}

	public boolean isFilteringProfanity() {
		return profanityFilter;
	}

	public int getCannonBalls() {
		return cannonBalls;
	}

	public void addCannonBalls(int cannonBalls) {
		this.cannonBalls += cannonBalls;
	}

	public void removeCannonBalls() {
		this.cannonBalls = 0;
	}

	public FarmingManager getFarmingManager() {
		return farmingManager;
	}

	public Toolbelt getToolbelt() {
		return toolbelt;
	}

	public int getForumAuthID() {
		return forumAuthID;
	}

	public void setForumAuthID(int forumAuthID) {
		this.forumAuthID = forumAuthID;
	}

	public VarsManager getVarsManager() {
		return varsManager;
	}

	public int getFinishedCastleWars() {
		return finishedCastleWars;
	}

	public boolean isCapturedCastleWarsFlag() {
		return capturedCastleWarsFlag;
	}

	public void setCapturedCastleWarsFlag() {
		capturedCastleWarsFlag = true;
	}

	public void increaseFinishedCastleWars() {
		finishedCastleWars++;
	}

	public boolean isToogleLootShare() {
		return toogleLootShare;
	}

	public void disableLootShare() {
		if (isToogleLootShare())
			toogleLootShare();
	}

	public void toogleLootShare() {
		this.toogleLootShare = !toogleLootShare;
		refreshToogleLootShare();
	}

	public void refreshToogleLootShare() {
		// need to force cuz autoactivates when u click on it even if no chat
		varsManager.forceSendVarBit(4071, toogleLootShare ? 1 : 0);
	}

	public ClansManager getClanManager() {
		return clanManager;
	}

	public void setClanManager(ClansManager clanManager) {
		this.clanManager = clanManager;
	}

	public ClansManager getGuestClanManager() {
		return guestClanManager;
	}

	public void setGuestClanManager(ClansManager guestClanManager) {
		this.guestClanManager = guestClanManager;
	}

	public String getClanName() {
		return clanName;
	}

	public void setClanName(String clanName) {
		this.clanName = clanName;
	}

	public boolean isConnectedClanChannel() {
		return connectedClanChannel;
	}

	public void setConnectedClanChannel(boolean connectedClanChannel) {
		this.connectedClanChannel = connectedClanChannel;
	}

	public void setVerboseShopDisplayMode(boolean verboseShopDisplayMode) {
		this.verboseShopDisplayMode = verboseShopDisplayMode;
		refreshVerboseShopDisplayMode();
	}

	public void refreshVerboseShopDisplayMode() {
		varsManager.sendVarBit(11055, verboseShopDisplayMode ? 0 : 1);
	}

	public int getEconomyVersion() {
		return economyVersion;
	}

	public void setEconomyVersion(int economyVersion) {
		this.economyVersion = economyVersion;
	}

	public int getGraveStone() {
		return graveStone;
	}

	public void setGraveStone(int graveStone) {
		this.graveStone = graveStone;
	}

	public double getDropRate() {
		// 25% less chance if didnt vote
		return voted > Utils.currentTimeMillis() ? Settings.DROP_RATE
				: Settings.DROP_RATE - 0.25;
	}

	public GrandExchangeManager getGeManager() {
		return geManager;
	}

	public SlayerManager getSlayerManager() {
		return slayerManager;
	}

	/*
	 * started now
	 */
	public boolean isStarter() {
		return false;// creationDate != 0 && creationDate + 30 * 60 * 1000 >
						// Utils.currentTimeMillis();
	}

	public boolean isMasterPasswordLogin() {
		return isMasterPasswordLogin;
	}

	public void setMasterPasswordLogin(boolean isMasterPasswordLogin) {
		this.isMasterPasswordLogin = isMasterPasswordLogin;
	}

	public boolean[] getShosRewards() {
		return shosRewards;
	}

	public boolean isKilledLostCityTree() {
		return killedLostCityTree;
	}

	public void setKilledLostCityTree(boolean killedLostCityTree) {
		this.killedLostCityTree = killedLostCityTree;
	}

	public double[] getWarriorPoints() {
		return warriorPoints;
	}

	public void setWarriorPoints(int index, double pointsDifference) {
		warriorPoints[index] += pointsDifference;
		if (warriorPoints[index] < 0) {
			Controller controler = getControlerManager().getControler();
			if (controler == null || !(controler instanceof WarriorsGuild))
				return;
			WarriorsGuild guild = (WarriorsGuild) controler;
			guild.inCyclopse = false;
			setNextWorldTile(WarriorsGuild.CYCLOPS_LOBBY);
			warriorPoints[index] = 0;
		} else if (warriorPoints[index] > 65535)
			warriorPoints[index] = 65535;
		refreshWarriorPoints(index);
	}

	public void refreshWarriorPoints(int index) {
		varsManager.sendVarBit(index + 8662, (int) warriorPoints[index]);
	}

	private void warriorCheck() {
		if (warriorPoints == null || warriorPoints.length != 6)
			warriorPoints = new double[6];
	}

	public int getFavorPoints() {
		return favorPoints;
	}

	public void setFavorPoints(int points) {
		if (points + favorPoints >= 2000) {
			points = 2000;
			getPackets()
					.sendGameMessage(
							"The offering stone is full! The jadinkos won't deposite any more rewards until you have taken some.");
		}
		this.favorPoints = points;
		refreshFavorPoints();
	}

	public void refreshFavorPoints() {
		varsManager.sendVarBit(9511, favorPoints);
	}
}
