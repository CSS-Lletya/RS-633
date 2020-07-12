package com.rs.game.npc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.rs.Settings;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.cores.CoresManager;
import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.npc.combat.NPCCombat;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.player.Player;
import com.rs.game.player.SlayerManager;
import com.rs.game.player.content.FriendChatsManager;
import com.rs.game.player.controllers.Wilderness;
import com.rs.game.route.RouteFinder;
import com.rs.game.route.strategy.FixedTileStrategy;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Logger;
import com.rs.utils.MapAreas;
import com.rs.utils.NPCBonuses;
import com.rs.utils.NPCCombatDefinitionsL;
import com.rs.utils.NPCDrops;
import com.rs.utils.Utils;

public class NPC extends Entity implements Serializable {

	public static int NORMAL_WALK = 0x2, WATER_WALK = 0x4, FLY_WALK = 0x8;

	private static final long serialVersionUID = -4794678936277614443L;

	private int id;
	private WorldTile respawnTile;
	private int mapAreaNameHash;
	private boolean canBeAttackFromOutOfArea;
	private int walkType;
	private int[] bonuses; // 0 stab, 1 slash, 2 crush,3 mage, 4 range, 5 stab
	// def, blahblah till 9
	private boolean spawned;
	private transient NPCCombat combat;
	public WorldTile forceWalk;

	private long lastAttackedByTarget;
	private boolean cantInteract;
	private int capDamage;
	private int lureDelay;
	private boolean cantFollowUnderCombat;
	private boolean forceAgressive;
	private int forceTargetDistance;
	private boolean forceFollowClose;
	private boolean forceMultiAttacked;
	private boolean noDistanceCheck;
	private boolean intelligentRouteFinder;

	// npc masks
	private transient Transformation nextTransformation;
	// name changing masks
	private String name;
	private transient boolean changedName;
	private int combatLevel;
	private transient boolean changedCombatLevel;
	private transient boolean locked;
	private transient double dropRateFactor;

	public NPC(int id, WorldTile tile, int mapAreaNameHash,
			boolean canBeAttackFromOutOfArea) {
		this(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, false);
	}

	/*
	 * creates and adds npc
	 */
	public NPC(int id, WorldTile tile, int mapAreaNameHash,
			boolean canBeAttackFromOutOfArea, boolean spawned) {
		super(tile);
		this.id = id;
		this.respawnTile = new WorldTile(tile);
		this.mapAreaNameHash = mapAreaNameHash;
		this.canBeAttackFromOutOfArea = canBeAttackFromOutOfArea;
		this.spawned = spawned;
		combatLevel = -1;
		setHitpoints(getMaxHitpoints());
		setDirection(getRespawnDirection());
		// int walkType = t(id);
		setRandomWalk(getDefinitions().walkMask);
		setBonuses();
		combat = new NPCCombat(this);
		capDamage = -1;
		lureDelay = 12000;
		// npc is inited on creating instance
		initEntity();
		World.addNPC(this);
		World.updateEntityRegion(this);
		// npc is started on creating instance
		loadMapRegions();
		checkMultiArea();
	}

	public void setBonuses() {
		bonuses = NPCBonuses.getBonuses(id);
		if (bonuses == null) {
			bonuses = new int[10];
			int level = getCombatLevel();
			for (int i = 0; i < bonuses.length; i++)
				bonuses[i] = level;
		}
	}

	@Override
	public boolean needMasksUpdate() {
		return super.needMasksUpdate() || nextTransformation != null
				|| getCustomName() != null || getCustomCombatLevel() >= 0 /*
																		 * *
																		 * changedName
																		 */;
	}

	public void setNextNPCTransformation(int id) {
		setNPC(id);
		nextTransformation = new Transformation(id);
		if (getCustomCombatLevel() != -1)
			changedCombatLevel = true;
		if (getCustomName() != null)
			changedName = true;
	}

	public void setNPC(int id) {
		this.id = id;
		setBonuses();
	}

	@Override
	public void resetMasks() {
		super.resetMasks();
		nextTransformation = null;
		changedCombatLevel = false;
		changedName = false;
	
	}

	public int getMapAreaNameHash() {
		return mapAreaNameHash;
	}

	public void setCanBeAttackFromOutOfArea(boolean b) {
		canBeAttackFromOutOfArea = b;
	}

	public boolean canBeAttackFromOutOfArea() {
		return canBeAttackFromOutOfArea;
	}

	public NPCDefinitions getDefinitions() {
		return NPCDefinitions.getNPCDefinitions(id);
	}

	public NPCCombatDefinitions getCombatDefinitions() {
		return NPCCombatDefinitionsL.getNPCCombatDefinitions(id);
	}

	@Override
	public int getMaxHitpoints() {
		return getCombatDefinitions().getHitpoints();
	}

	public int getId() {
		return id;
	}

	public void processNPC() {
		if (isDead() || locked)
			return;
		if (!combat.process()) { // if not under combat
			if (!isForceWalking()) {// combat still processed for attack delay
				// go down
				// random walk
				if (!cantInteract) {
					if (!checkAgressivity()) {
						if (getFreezeDelay() < Utils.currentTimeMillis()) {
							if (!hasWalkSteps()
									&& (walkType & NORMAL_WALK) != 0) {
								boolean can = false;
								for (int i = 0; i < 2; i++) {
									if (Math.random() * 1000.0 < 100.0) {
										can = true;
										break;
									}
								}

								if (can) {
									int moveX = (int) Math
											.round(Math.random() * 10.0 - 5.0);
									int moveY = (int) Math
											.round(Math.random() * 10.0 - 5.0);
									resetWalkSteps();
									if (getMapAreaNameHash() != -1) {
										if (!MapAreas.isAtArea(
												getMapAreaNameHash(), this)) {
											forceWalkRespawnTile();
											return;
										}
										// fly walk noclips for now, nothing
										// uses it anyway
										addWalkSteps(getX() + moveX, getY()
												+ moveY, 5,
												(walkType & FLY_WALK) == 0);
									} else
										addWalkSteps(
												respawnTile.getX() + moveX,
												respawnTile.getY() + moveY, 5,
												(walkType & FLY_WALK) == 0);
								}

							}
						}
					}
				}
			}
		}
		if (isForceWalking()) {
			if (getFreezeDelay() < Utils.currentTimeMillis()) {
				if (getX() != forceWalk.getX() || getY() != forceWalk.getY()) {
					if (!hasWalkSteps()) {
						int steps = RouteFinder.findRoute(
								RouteFinder.WALK_ROUTEFINDER, getX(), getY(),
								getPlane(), getSize(), new FixedTileStrategy(
										forceWalk.getX(), forceWalk.getY()),
								true);
						int[] bufferX = RouteFinder.getLastPathBufferX();
						int[] bufferY = RouteFinder.getLastPathBufferY();
						for (int i = steps - 1; i >= 0; i--) {
							if (!addWalkSteps(bufferX[i], bufferY[i], 25, true))
								break;
						}
					}
					if (!hasWalkSteps()) { // failing finding route
						setNextWorldTile(new WorldTile(forceWalk)); // force
						// tele
						// to
						// the
						// forcewalk
						// place
						forceWalk = null; // so ofc reached forcewalk place
					}
				} else
					// walked till forcewalk place
					forceWalk = null;
			}
		}
	}

	@Override
	public void processEntity() {
		super.processEntity();
		processNPC();
	}

	public int getRespawnDirection() {
		NPCDefinitions definitions = getDefinitions();
		if (definitions.anInt853 << 32 != 0 && definitions.respawnDirection > 0
				&& definitions.respawnDirection <= 8)
			return (4 + definitions.respawnDirection) << 11;
		return 0;
	}

	/*
	 * forces npc to random walk even if cache says no, used because of fake
	 * cache information
	 */
	/*
	 * private static int walkType(int npcId) { switch (npcId) { case 11226:
	 * return RANDOM_WALK; case 3341: case 3342: case 3343: return RANDOM_WALK;
	 * default: return -1; } }
	 */

	public void sendSoulSplit(final Hit hit, final Entity user) {
		final NPC target = this;
		if (hit.getDamage() > 0)
			World.sendProjectile(user, this, 2263, 11, 11, 20, 5, 0, 0);
		user.heal(hit.getDamage() / 5);
		WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {
				setNextGraphics(new Graphics(2264));
				if (hit.getDamage() > 0)
					World.sendProjectile(target, user, 2263, 11, 11, 20, 5, 0,
							0);
			}
		}, 1);
	}

	@Override
	public void handleIngoingHit(final Hit hit) {
		if (capDamage != -1 && hit.getDamage() > capDamage)
			hit.setDamage(capDamage);
		if (hit.getLook() != HitLook.MELEE_DAMAGE
				&& hit.getLook() != HitLook.RANGE_DAMAGE
				&& hit.getLook() != HitLook.MAGIC_DAMAGE)
			return;
		Entity source = hit.getSource();
		if (source == null)
			return;
		if (source instanceof Player) {
			final Player p2 = (Player) source;
			if (p2.getPrayer().hasPrayersOn()) {
				if (p2.getPrayer().usingPrayer(1, 18))
					sendSoulSplit(hit, p2);
				if (hit.getDamage() == 0)
					return;
				if (!p2.getPrayer().isBoostedLeech()) {
					if (hit.getLook() == HitLook.MELEE_DAMAGE) {
						if (p2.getPrayer().usingPrayer(1, 19)) {
							p2.getPrayer().increaseTurmoilBonus(this);
							p2.getPrayer().setBoostedLeech(true);
							return;
						} else if (p2.getPrayer().usingPrayer(1, 1)) { // sap
							// att
							if (Utils.getRandom(4) == 0) {
								if (p2.getPrayer().reachedMax(0)) {
									p2.getPackets()
											.sendGameMessage(
													"Your opponent has been weakened so much that your sap curse has no effect.",
													true);
								} else {
									p2.getPrayer().increaseLeechBonus(0);
									p2.getPackets()
											.sendGameMessage(
													"Your curse drains Attack from the enemy, boosting your Attack.",
													true);
								}
								p2.setNextAnimation(new Animation(12569));
								p2.setNextGraphics(new Graphics(2214));
								p2.getPrayer().setBoostedLeech(true);
								World.sendProjectile(p2, this, 2215, 35, 35,
										20, 5, 0, 0);
								WorldTasksManager.schedule(new WorldTask() {
									@Override
									public void run() {
										setNextGraphics(new Graphics(2216));
									}
								}, 1);
								return;
							}
						} else {
							if (p2.getPrayer().usingPrayer(1, 10)) {
								if (Utils.getRandom(7) == 0) {
									if (p2.getPrayer().reachedMax(3)) {
										p2.getPackets()
												.sendGameMessage(
														"Your opponent has been weakened so much that your leech curse has no effect.",
														true);
									} else {
										p2.getPrayer().increaseLeechBonus(3);
										p2.getPackets()
												.sendGameMessage(
														"Your curse drains Attack from the enemy, boosting your Attack.",
														true);
									}
									p2.setNextAnimation(new Animation(12575));
									p2.getPrayer().setBoostedLeech(true);
									World.sendProjectile(p2, this, 2231, 35,
											35, 20, 5, 0, 0);
									WorldTasksManager.schedule(new WorldTask() {
										@Override
										public void run() {
											setNextGraphics(new Graphics(2232));
										}
									}, 1);
									return;
								}
							}
							if (p2.getPrayer().usingPrayer(1, 14)) {
								if (Utils.getRandom(7) == 0) {
									if (p2.getPrayer().reachedMax(7)) {
										p2.getPackets()
												.sendGameMessage(
														"Your opponent has been weakened so much that your leech curse has no effect.",
														true);
									} else {
										p2.getPrayer().increaseLeechBonus(7);
										p2.getPackets()
												.sendGameMessage(
														"Your curse drains Strength from the enemy, boosting your Strength.",
														true);
									}
									p2.setNextAnimation(new Animation(12575));
									p2.getPrayer().setBoostedLeech(true);
									World.sendProjectile(p2, this, 2248, 35,
											35, 20, 5, 0, 0);
									WorldTasksManager.schedule(new WorldTask() {
										@Override
										public void run() {
											setNextGraphics(new Graphics(2250));
										}
									}, 1);
									return;
								}
							}

						}
					}
					if (hit.getLook() == HitLook.RANGE_DAMAGE) {
						if (p2.getPrayer().usingPrayer(1, 2)) { // sap range
							if (Utils.getRandom(4) == 0) {
								if (p2.getPrayer().reachedMax(1)) {
									p2.getPackets()
											.sendGameMessage(
													"Your opponent has been weakened so much that your sap curse has no effect.",
													true);
								} else {
									p2.getPrayer().increaseLeechBonus(1);
									p2.getPackets()
											.sendGameMessage(
													"Your curse drains Range from the enemy, boosting your Range.",
													true);
								}
								p2.setNextAnimation(new Animation(12569));
								p2.setNextGraphics(new Graphics(2217));
								p2.getPrayer().setBoostedLeech(true);
								World.sendProjectile(p2, this, 2218, 35, 35,
										20, 5, 0, 0);
								WorldTasksManager.schedule(new WorldTask() {
									@Override
									public void run() {
										setNextGraphics(new Graphics(2219));
									}
								}, 1);
								return;
							}
						} else if (p2.getPrayer().usingPrayer(1, 11)) {
							if (Utils.getRandom(7) == 0) {
								if (p2.getPrayer().reachedMax(4)) {
									p2.getPackets()
											.sendGameMessage(
													"Your opponent has been weakened so much that your leech curse has no effect.",
													true);
								} else {
									p2.getPrayer().increaseLeechBonus(4);
									p2.getPackets()
											.sendGameMessage(
													"Your curse drains Range from the enemy, boosting your Range.",
													true);
								}
								p2.setNextAnimation(new Animation(12575));
								p2.getPrayer().setBoostedLeech(true);
								World.sendProjectile(p2, this, 2236, 35, 35,
										20, 5, 0, 0);
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
						if (p2.getPrayer().usingPrayer(1, 3)) { // sap mage
							if (Utils.getRandom(4) == 0) {
								if (p2.getPrayer().reachedMax(2)) {
									p2.getPackets()
											.sendGameMessage(
													"Your opponent has been weakened so much that your sap curse has no effect.",
													true);
								} else {
									p2.getPrayer().increaseLeechBonus(2);
									p2.getPackets()
											.sendGameMessage(
													"Your curse drains Magic from the enemy, boosting your Magic.",
													true);
								}
								p2.setNextAnimation(new Animation(12569));
								p2.setNextGraphics(new Graphics(2220));
								p2.getPrayer().setBoostedLeech(true);
								World.sendProjectile(p2, this, 2221, 35, 35,
										20, 5, 0, 0);
								WorldTasksManager.schedule(new WorldTask() {
									@Override
									public void run() {
										setNextGraphics(new Graphics(2222));
									}
								}, 1);
								return;
							}
						} else if (p2.getPrayer().usingPrayer(1, 12)) {
							if (Utils.getRandom(7) == 0) {
								if (p2.getPrayer().reachedMax(5)) {
									p2.getPackets()
											.sendGameMessage(
													"Your opponent has been weakened so much that your leech curse has no effect.",
													true);
								} else {
									p2.getPrayer().increaseLeechBonus(5);
									p2.getPackets()
											.sendGameMessage(
													"Your curse drains Magic from the enemy, boosting your Magic.",
													true);
								}
								p2.setNextAnimation(new Animation(12575));
								p2.getPrayer().setBoostedLeech(true);
								World.sendProjectile(p2, this, 2240, 35, 35,
										20, 5, 0, 0);
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

					if (p2.getPrayer().usingPrayer(1, 13)) { // leech defence
						if (Utils.getRandom(10) == 0) {
							if (p2.getPrayer().reachedMax(6)) {
								p2.getPackets()
										.sendGameMessage(
												"Your opponent has been weakened so much that your leech curse has no effect.",
												true);
							} else {
								p2.getPrayer().increaseLeechBonus(6);
								p2.getPackets()
										.sendGameMessage(
												"Your curse drains Defence from the enemy, boosting your Defence.",
												true);
							}
							p2.setNextAnimation(new Animation(12575));
							p2.getPrayer().setBoostedLeech(true);
							World.sendProjectile(p2, this, 2244, 35, 35, 20, 5,
									0, 0);
							WorldTasksManager.schedule(new WorldTask() {
								@Override
								public void run() {
									setNextGraphics(new Graphics(2246));
								}
							}, 1);
							return;
						}
					}
				}
			}
		}

	}

	@Override
	public void reset() {
		super.reset();
		setDirection(getRespawnDirection());
		combat.reset();
		setBonuses(); // back to real bonuses
		forceWalk = null;
	}

	@Override
	public void finish() {
		if (hasFinished())
			return;
		setFinished(true);
		World.updateEntityRegion(this);
		World.removeNPC(this);
	}

	public void setRespawnTask() {
		if (!hasFinished()) {
			reset();
			setLocation(respawnTile);
			finish();
		}
		CoresManager.slowExecutor.schedule(new Runnable() {
			@Override
			public void run() {
				try {
					spawn();
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}
		}, getCombatDefinitions().getRespawnDelay() * 600,
				TimeUnit.MILLISECONDS);
	}

	public void deserialize() {
		if (combat == null)
			combat = new NPCCombat(this);
		spawn();
	}

	public void spawn() {
		setFinished(false);
		World.addNPC(this);
		setLastRegionId(0);
		World.updateEntityRegion(this);
		loadMapRegions();
		checkMultiArea();
	}

	public NPCCombat getCombat() {
		return combat;
	}

	@Override
	public void sendDeath(final Entity source) {
		final NPCCombatDefinitions defs = getCombatDefinitions();
		resetWalkSteps();
		combat.removeTarget();
		setNextAnimation(null);
		WorldTasksManager.schedule(new WorldTask() {
			int loop;

			@Override
			public void run() {
				if (loop == 0) {
					setNextAnimation(new Animation(defs.getDeathEmote()));
				} else if (loop >= defs.getDeathDelay()) {
					if (source instanceof Player)
						((Player) source).getControlerManager()
								.processNPCDeath(getId());
					drop();
					reset();
					setLocation(respawnTile);
					finish();
					if (!isSpawned())
						setRespawnTask();
					if (source.getAttackedBy() == NPC.this) { // no need to wait
																// after u kill
						source.setAttackedByDelay(0);
						source.setAttackedBy(null);
						source.setFindTargetDelay(0);
					}
					stop();
				}
				loop++;
			}
		}, 0, 1);
	}

	public void drop() {
		if (getCombatDefinitions() == NPCCombatDefinitionsL.DEFAULT_DEFINITION
				|| getMaxHitpoints() == 1)
			return;
		Player killer = getMostDamageReceivedSourcePlayer();
		if (killer == null)
			return;
		Player otherPlayer = killer.getSlayerManager().getSocialPlayer();
		SlayerManager manager = killer.getSlayerManager();
		if (manager.isValidTask(getName()))
			manager.checkCompletedTask(getDamageReceived(killer),
					otherPlayer != null ? getDamageReceived(otherPlayer) : 0);
		Drops drops = NPCDrops.getDrops(id);
		if (drops == null)
			return;
		List<Drop> dropL = drops.generateDrops(killer.getDropRate()
				+ dropRateFactor);
		drops.addCharms(dropL, getSize());
		List<Player> players = FriendChatsManager.getLootSharingPeople(killer);
		if (players == null || players.size() == 1) {
			for (Drop drop : dropL)
				sendDrop(killer, drop);
		} else {
			for (Drop drop : dropL) {
				Player luckyPlayer = players.get(Utils.random(players.size()));
				Item item = sendDrop(luckyPlayer, drop);
				luckyPlayer.getPackets().sendGameMessage(
						"<col=00FF00>You received: " + item.getAmount() + " "
								+ item.getName() + ".");
				for (Player p2 : players) {
					if (p2 == luckyPlayer)
						continue;
					p2.getPackets().sendGameMessage(
							"<col=66FFCC>" + luckyPlayer.getDisplayName()
									+ "</col> received: " + item.getAmount()
									+ " " + item.getName() + ".");
					p2.getPackets().sendGameMessage(
							"Your chance of receiving loot has improved.");
				}
			}
		}
	}

	public Item sendDrop(Player player, Drop drop) {
		int size = getSize();
		Item item = ItemDefinitions.getItemDefinitions(drop.getItemId())
				.isStackable() ? new Item(drop.getItemId(),
				(drop.getMinAmount() * Settings.DROP_QUANTITY_RATE)
						+ Utils.getRandom(drop.getExtraAmount()
								* Settings.DROP_QUANTITY_RATE)) : new Item(
				drop.getItemId(), drop.getMinAmount()
						+ Utils.getRandom(drop.getExtraAmount()));
		if (item.getId() == 995)
			player.getInventory().addItem(item);
		else
			World.addGroundItem(item, new WorldTile(getCoordFaceX(size),
					getCoordFaceY(size), getPlane()), player, true, 60);
		return item;
	}

	@Override
	public int getSize() {
		return getDefinitions().size;
	}

	public int getMaxHit() {
		return getCombatDefinitions().getMaxHit();
	}

	public int[] getBonuses() {
		return bonuses;
	}

	@Override
	public double getMagePrayerMultiplier() {
		return 0;
	}

	@Override
	public double getRangePrayerMultiplier() {
		return 0;
	}

	@Override
	public double getMeleePrayerMultiplier() {
		return 0;
	}

	public WorldTile getRespawnTile() {
		return respawnTile;
	}

	public boolean isUnderCombat() {
		return combat.underCombat();
	}

	@Override
	public void setAttackedBy(Entity target) {
		super.setAttackedBy(target);
		if (target == combat.getTarget()
				&& !(combat.getTarget() instanceof Familiar))
			lastAttackedByTarget = Utils.currentTimeMillis();
	}

	public boolean canBeAttackedByAutoRelatie() {
		return Utils.currentTimeMillis() - lastAttackedByTarget > lureDelay;
	}

	public boolean isForceWalking() {
		return forceWalk != null;
	}

	public void setTarget(Entity entity) {
		if (isForceWalking()) // if force walk not gonna get target
			return;
		combat.setTarget(entity);
		lastAttackedByTarget = Utils.currentTimeMillis();
	}

	public void removeTarget() {
		if (combat.getTarget() == null)
			return;
		combat.removeTarget();
	}

	public void forceWalkRespawnTile() {
		setForceWalk(respawnTile);
	}

	public void setForceWalk(WorldTile tile) {
		resetWalkSteps();
		forceWalk = tile;
	}

	public boolean hasForceWalk() {
		return forceWalk != null;
	}

	public ArrayList<Entity> getPossibleTargets(boolean checkNPCs,
			boolean checkPlayers) {
		int size = getSize();
		int agroRatio = getCombatDefinitions().getAgroRatio();
		ArrayList<Entity> possibleTarget = new ArrayList<Entity>();
		for (int regionId : getMapRegionsIds()) {
			if (checkPlayers) {
				List<Integer> playerIndexes = World.getRegion(regionId)
						.getPlayerIndexes();
				if (playerIndexes != null) {
					for (int playerIndex : playerIndexes) {
						Player player = World.getPlayers().get(playerIndex);
						if (player == null
								|| player.isDead()
								|| player.hasFinished()
								|| !player.isRunning()
								|| player.getAppearence().isHidden()
								|| !Utils
										.isOnRange(
												getX(),
												getY(),
												size,
												player.getX(),
												player.getY(),
												player.getSize(),
												forceTargetDistance > 0 ? forceTargetDistance
														: agroRatio)
								|| (!forceMultiAttacked
										&& (!isAtMultiArea() || !player
												.isAtMultiArea()) && (player
										.getAttackedBy() != this && (player
										.getAttackedByDelay() > Utils
										.currentTimeMillis() || player
										.getFindTargetDelay() > Utils
										.currentTimeMillis())))
								|| !clipedProjectile(player, false)
								|| (!forceAgressive
										&& !Wilderness.isAtWild(this) && player
										.getSkills()
										.getCombatLevelWithSummoning() >= getCombatLevel() * 2))
							continue;
						possibleTarget.add(player);
					}
				}
			}
			if (checkNPCs) {
				List<Integer> npcsIndexes = World.getRegion(regionId)
						.getNPCsIndexes();
				if (npcsIndexes != null) {
					for (int npcIndex : npcsIndexes) {
						NPC npc = World.getNPCs().get(npcIndex);
						if (npc == null
								|| npc == this
								|| npc.isDead()
								|| npc.hasFinished()
								|| !Utils
										.isOnRange(
												getX(),
												getY(),
												size,
												npc.getX(),
												npc.getY(),
												npc.getSize(),
												forceTargetDistance > 0 ? forceTargetDistance
														: agroRatio)
								|| !npc.getDefinitions().hasAttackOption()
								|| ((!isAtMultiArea() || !npc.isAtMultiArea())
										&& npc.getAttackedBy() != this && npc
										.getAttackedByDelay() > Utils
										.currentTimeMillis())
								|| !clipedProjectile(npc, false))
							continue;
						possibleTarget.add(npc);
					}
				}
			}
		}
		return possibleTarget;
	}

	public ArrayList<Entity> getPossibleTargets() {
		return getPossibleTargets(false, true);
	}

	public boolean checkAgressivity() {
		if (!(Wilderness.isAtWild(this) && getDefinitions().hasAttackOption())) {
			if (!forceAgressive) {
				NPCCombatDefinitions defs = getCombatDefinitions();
				if (defs.getAgressivenessType() == NPCCombatDefinitions.PASSIVE)
					return false;
			}
		}
		ArrayList<Entity> possibleTarget = getPossibleTargets();
		if (!possibleTarget.isEmpty()) {
			Entity target = possibleTarget.get(Utils.random(possibleTarget
					.size()));
			setTarget(target);
			target.setAttackedBy(target);
			target.setFindTargetDelay(Utils.currentTimeMillis() + 10000);
			return true;
		}
		return false;
	}

	public boolean isCantInteract() {
		return cantInteract;
	}

	public void setCantInteract(boolean cantInteract) {
		this.cantInteract = cantInteract;
		if (cantInteract)
			combat.reset();
	}

	public int getCapDamage() {
		return capDamage;
	}

	public void setCapDamage(int capDamage) {
		this.capDamage = capDamage;
	}

	public int getLureDelay() {
		return lureDelay;
	}

	public void setLureDelay(int lureDelay) {
		this.lureDelay = lureDelay;
	}

	public boolean isCantFollowUnderCombat() {
		return cantFollowUnderCombat;
	}

	public void setCantFollowUnderCombat(boolean canFollowUnderCombat) {
		this.cantFollowUnderCombat = canFollowUnderCombat;
	}

	public Transformation getNextTransformation() {
		return nextTransformation;
	}

	@Override
	public String toString() {
		return getDefinitions().getName() + " - " + id + " - " + getX() + " "
				+ getY() + " " + getPlane();
	}

	public boolean isForceAgressive() {
		return forceAgressive;
	}

	public void setForceAgressive(boolean forceAgressive) {
		this.forceAgressive = forceAgressive;
	}

	public int getForceTargetDistance() {
		return forceTargetDistance;
	}

	public void setForceTargetDistance(int forceTargetDistance) {
		this.forceTargetDistance = forceTargetDistance;
	}

	public boolean isForceFollowClose() {
		return forceFollowClose;
	}

	public void setForceFollowClose(boolean forceFollowClose) {
		this.forceFollowClose = forceFollowClose;
	}

	public boolean isForceMultiAttacked() {
		return forceMultiAttacked;
	}

	public void setForceMultiAttacked(boolean forceMultiAttacked) {
		this.forceMultiAttacked = forceMultiAttacked;
	}

	public void setRandomWalk(int forceRandomWalk) {
		this.walkType = forceRandomWalk;
	}

	public String getCustomName() {
		return name;
	}

	public void setName(String string) {
		this.name = getDefinitions().getName().equals(string) ? null : string;
		changedName = true;
	}

	public int getCustomCombatLevel() {
		return combatLevel;
	}

	public int getCombatLevel() {
		return combatLevel >= 0 ? combatLevel : getDefinitions().combatLevel;
	}

	public String getName() {
		return name != null ? name : getDefinitions().getName();
	}

	public void setCombatLevel(int level) {
		combatLevel = getDefinitions().combatLevel == level ? -1 : level;
		changedCombatLevel = true;
	}

	public boolean hasChangedName() {
		return changedName;
	}

	public boolean hasChangedCombatLevel() {
		return changedCombatLevel;
	}

	public boolean isSpawned() {
		return spawned;
	}

	public void setSpawned(boolean spawned) {
		this.spawned = spawned;
	}

	public boolean isNoDistanceCheck() {
		return noDistanceCheck;
	}

	public void setNoDistanceCheck(boolean noDistanceCheck) {
		this.noDistanceCheck = noDistanceCheck;
	}

	public boolean withinDistance(Player tile, int distance) {
		return super.withinDistance(tile, distance);
	}

	/**
	 * Gets the locked.
	 * 
	 * @return The locked.
	 */
	public boolean isLocked() {
		return locked;
	}

	/**
	 * Sets the locked.
	 * 
	 * @param locked
	 *            The locked to set.
	 */
	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public boolean isIntelligentRouteFinder() {
		return intelligentRouteFinder;
	}

	public void setIntelligentRouteFinder(boolean intelligentRouteFinder) {
		this.intelligentRouteFinder = intelligentRouteFinder;
	}

	public double getDropRateFactor() {
		return dropRateFactor;
	}

	public void setDropRateFactor(double dropRateFactor) {
		this.dropRateFactor = dropRateFactor;
	}
}
