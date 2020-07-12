package com.rs.game.npc.others;

import java.util.List;
import java.util.concurrent.TimeUnit;

import com.rs.cores.CoresManager;
import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

@SuppressWarnings("serial")
public final class TormentedDemon extends NPC {

    private boolean[] demonPrayer;
    private int[] cachedDamage;
    private int shieldTimer, fixedAmount, prayerTimer, fixedCombatType,
	    lastType;

    public TormentedDemon(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean spawned) {
	super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
	demonPrayer = new boolean[3];
	cachedDamage = new int[3];
	shieldTimer = 0;
	switchPrayers(0);
    }

    public void switchPrayers(int type) {
	if (type == 1)
	    type = 2;
	else if (type == 2)
	    type = 1;
	setNextNPCTransformation(8349 + type);
	demonPrayer[type] = true;
	resetPrayerTimer();
    }

    private void resetPrayerTimer() {
	prayerTimer = 16;
    }

    @Override
    public void processNPC() {
	super.processNPC();
	if (isDead())
	    return;
	if (Utils.getRandom(40) <= 2)
	    sendRandomProjectile();
	if (getCombat().process()) {// no point in processing
	    if (shieldTimer > 0)
		shieldTimer--;
	    if (prayerTimer > 0)
		prayerTimer--;
	    if (prayerTimer == 0) {
		for (int i = 0; i < cachedDamage.length; i++) {
		    if (cachedDamage[i] >= 310) {
			demonPrayer = new boolean[3];
			switchPrayers(i);
			cachedDamage = new int[3];
		    }
		}
	    }
	    for (int i = 0; i < cachedDamage.length; i++) {
		if (cachedDamage[i] >= 310) {
		    demonPrayer = new boolean[3];
		    switchPrayers(i);
		    cachedDamage = new int[3];
		}
	    }
	}
    }

    @Override
    public void handleIngoingHit(final Hit hit) {
	super.handleIngoingHit(hit);
	if (hit.getSource() instanceof Player) {// darklight
	    Player player = (Player) hit.getSource();
	    if ((player.getEquipment().getWeaponId() == 6746 || player.getEquipment().getWeaponId() == 2402) && hit.getLook() == HitLook.MELEE_DAMAGE && hit.getDamage() > 0) {
		shieldTimer = 60;
		player.getPackets().sendGameMessage("The demon is temporarily weakend by your weapon.");
	    }
	}
	if (shieldTimer <= 0) {// 75% of damage is absorbed
	    hit.setDamage((int) (hit.getDamage() * 0.25));
	    setNextGraphics(new Graphics(1885));
	}
	for (int attackType = 0; attackType < demonPrayer.length; attackType++) {
	    if (hit.getLook().getMark() == attackType) {
		lastType = attackType;
		if (demonPrayer[attackType])
		    hit.setDamage((int) (hit.getDamage() * .4));
		cachedDamage[hit.getLook().getMark()] += hit.getDamage();
	    } else if (hit.getLook() == HitLook.MISSED) {
		cachedDamage[lastType] += 20;
	    }
	}
    }

    @Override
    public void sendDeath(Entity source) {
	final NPCCombatDefinitions defs = getCombatDefinitions();
	resetWalkSteps();
	getCombat().removeTarget();
	setNextAnimation(null);
	shieldTimer = 0;
	WorldTasksManager.schedule(new WorldTask() {
	    int loop;

	    @Override
	    public void run() {
		if (loop == 0) {
		    setNextAnimation(new Animation(defs.getDeathEmote()));
		} else if (loop >= defs.getDeathDelay()) {
		    drop();
		    reset();
		    setLocation(getRespawnTile());
		    finish();
		    setRespawnTask();
		    stop();
		}
		loop++;
	    }
	}, 0, 1);
    }

    private void sendRandomProjectile() {
	WorldTile tile = new WorldTile(getX() + Utils.random(7), getY() + Utils.random(7), getPlane());
	setNextAnimation(new Animation(10918));
	World.sendProjectile(this, tile, 1887, 34, 16, 40, 35, 16, 0);
	for (int regionId : getMapRegionsIds()) {
	    List<Integer> playerIndexes = World.getRegion(regionId).getPlayerIndexes();
	    if (playerIndexes != null) {
		for (int npcIndex : playerIndexes) {
		    Player player = World.getPlayers().get(npcIndex);
		    if (player == null || player.isDead() || player.hasFinished() || !player.hasStarted() || !player.withinDistance(tile, 3))
			continue;
		    player.getPackets().sendGameMessage("The demon's magical attack splashes on you.");
		    player.applyHit(new Hit(this, 281, HitLook.MAGIC_DAMAGE, 1));
		}
	    }
	}
    }

    @Override
    public void setRespawnTask() {
	if (!hasFinished()) {
	    reset();
	    setLocation(getRespawnTile());
	    finish();
	}
	final NPC npc = this;
	CoresManager.slowExecutor.schedule(new Runnable() {
	    @Override
	    public void run() {
		setFinished(false);
		World.addNPC(npc);
		npc.setLastRegionId(0);
		World.updateEntityRegion(npc);
		loadMapRegions();
		checkMultiArea();
		shieldTimer = 0;
		fixedCombatType = 0;
		fixedAmount = 0;
	    }
	}, getCombatDefinitions().getRespawnDelay() * 600, TimeUnit.MILLISECONDS);
    }

    public static boolean atTD(WorldTile tile) {
	if ((tile.getX() >= 2560 && tile.getX() <= 2630) && (tile.getY() >= 5710 && tile.getY() <= 5753))
	    return true;
	return false;
    }

    public int getFixedCombatType() {
	return fixedCombatType;
    }

    public void setFixedCombatType(int fixedCombatType) {
	this.fixedCombatType = fixedCombatType;
    }

    public int getFixedAmount() {
	return fixedAmount;
    }

    public void setFixedAmount(int fixedAmount) {
	this.fixedAmount = fixedAmount;
    }
}
