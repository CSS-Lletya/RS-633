package com.rs.game.player.controllers.slaughterfields;

import java.util.ArrayList;
import java.util.List;

import com.rs.cores.CoresManager;
import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.map.MapBuilder;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.PlayerCombat;
import com.rs.game.player.content.Magic;
import com.rs.game.player.controllers.Controller;
import com.rs.game.player.controllers.Wilderness;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

/**
 * The Slaughter fields controller.
 * @author Emperor
 *
 */
public final class SlaughterFieldsControler extends Controller {

    /**
     * The region base world tile.
     */
    private static WorldTile regionBase;

    /**
     * A list of players in the ffa zone.
     */
    protected static List<Player> ffaPlayers = new ArrayList<Player>();

    /**
     * A list of players in the pure zone.
     */
    protected static List<Player> purePlayers = new ArrayList<Player>();

    /**
     * A list of players in the dangerous zone.
     */
    protected static List<Player> dangerousPlayers = new ArrayList<Player>();

    /**
     * A list of players in the no-melee zone.
     */
    protected static List<Player> meleeDisabledPlayers = new ArrayList<Player>();

    /**
     * A list of players in the no-range zone.
     */
    protected static List<Player> rangeDisabledPlayers = new ArrayList<Player>();

    /**
     * A list of players in the no-magic zone.
     */
    protected static List<Player> magicDisabledPlayers = new ArrayList<Player>();

    public static int areaCount = 0;

    /**
     * Loads the "Slaughter fields".
     */
    public static void load() {
	int[] newCoords = new int[] { 50, 50 };
	WorldTile t = new WorldTile(2576, 3752, 0);
	for (int x = 0; x < 32; x += 8) {
	    for (int y = 0; y < 32; y += 8) {
		MapBuilder.copyAllPlanesMap(t.getChunkX(), t.getChunkY(), newCoords[0] + x, newCoords[1] + y, 8, 8);
	    }
	}
	t = new WorldTile(3534, 3206, 0);
	/*
	 * Ffa-zone (center)
	 */
	MapBuilder.copyAllPlanesMap(t.getChunkX(), t.getChunkY(), newCoords[0] + 1 + 7, newCoords[1] + 1 + 7, 6, 6);
	/*
	 * Pure-zone (south)
	 */
	t = new WorldTile(3264, 2872, 0);
	MapBuilder.copyAllPlanesMap(t.getChunkX(), t.getChunkY(), newCoords[0] + 1 + 7, newCoords[1] + 1, 6, 6);
	/*
	 * No-melee zone (west)
	 */
	t = new WorldTile(3352, 3872, 0);
	MapBuilder.copyAllPlanesMap(t.getChunkX(), t.getChunkY(), newCoords[0] + 3, newCoords[1] + 9, 5, 4);
	/*
	 * No-range zone (north)
	 */
	t = new WorldTile(3328, 3904, 0);
	MapBuilder.copyAllPlanesMap(t.getChunkX(), t.getChunkY(), newCoords[0] + 7, newCoords[1] + 15, 8, 10);
	/*
	 * No-magic zone (east)
	 */
	t = new WorldTile(3784, 3520, 0);
	MapBuilder.copyAllPlanesMap(t.getChunkX(), t.getChunkY(), newCoords[0] + 15, newCoords[1] + 8, 7, 8);
	regionBase = new WorldTile(newCoords[0] << 3, newCoords[1] << 3, 0);
	/*
	 * Dangerous zone (north of no-range)
	 */
	t = new WorldTile(3168, 3800, 0);
	MapBuilder.copyAllPlanesMap(t.getChunkX(), t.getChunkY(), newCoords[0] + 7, newCoords[1] + 30, 9, 7);
	/*
	 * Entrance to no-melee zone
	 */
	World.spawnObject(new WorldObject(13403, 10, 3, regionBase.getX() + 65, regionBase.getY() + 80, 0));
	World.spawnObject(new WorldObject(13397, 10, 3, regionBase.getX() + 65, regionBase.getY() + 82, 0));
	World.spawnObject(new WorldObject(8987, 10, 0, regionBase.getX() + 57, regionBase.getY() + 83, 0));
	/*
	 * Entrance to no-range zone
	 */
	World.spawnObject(new WorldObject(13397, 10, 0, regionBase.getX() + 96, regionBase.getY() + 110, 0));
	World.spawnObject(new WorldObject(15624, 10, 0, regionBase.getX() + 94, regionBase.getY() + 110, 0));
	World.spawnObject(new WorldObject(8987, 10, 0, regionBase.getX() + 96, regionBase.getY() + 124, 0));
	/*
	 * Entrance to no-magic zone
	 */
	World.spawnObject(new WorldObject(13403, 10, 1, regionBase.getX() + 109, regionBase.getY() + 103, 0));
	World.spawnObject(new WorldObject(15624, 10, 1, regionBase.getX() + 109, regionBase.getY() + 105, 0));
	World.spawnObject(new WorldObject(8987, 10, 0, regionBase.getX() + 121, regionBase.getY() + 102, 0));
	/*
	 * Entrance to pure zone
	 */
	World.spawnObject(new WorldObject(13403, 10, 2, regionBase.getX() + 80, regionBase.getY() + 65, 0));
	World.spawnObject(new WorldObject(13397, 10, 2, regionBase.getX() + 81, regionBase.getY() + 65, 0));
	World.spawnObject(new WorldObject(15624, 10, 2, regionBase.getX() + 82, regionBase.getY() + 65, 0));
	World.spawnObject(new WorldObject(8987, 10, 0, regionBase.getX() + 81, regionBase.getY() + 53, 0));
	/*
	 * Entrance to dangerous zone.
	 */
	World.spawnObject(new WorldObject(11354, 10, 0, regionBase.getX() + 88, regionBase.getY() + 95, 0));
	/*
	 * Exit of dangerous zone.
	 */
	World.spawnObject(new WorldObject(11354, 10, 0, regionBase.getX() + 78, regionBase.getY() + 248, 0));
	/*
	 * Exit the Slaughter fields.
	 */
	World.spawnObject(new WorldObject(8987, 10, 0, regionBase.getX() + 66, regionBase.getY() + 76, 0));

	/*
	 * Person who handles teleporting.
	 */
	World.spawnNPC(14872, new WorldTile(3089, 3498, 0), -1, true);
    }

    public static void initArea() {
	CoresManager.fastExecutor.schedule(new AreaEffect(), 20000, 5000);
    }

    @Override
    public void start() {
	if (hasOverpoweredGear(player)) {
	    player.getControlerManager().forceStop();
	    return;
	}
	Wilderness.checkBoosts(player);
	sendInterfaces();
	player.setCanPvp(true);
	player.setNextWorldTile(regionBase.transform(66, 74, 0));
	areaCount++;
	if (areaCount == 1)
	    initArea();
    }

    @Override
    public void sendInterfaces() {
	updateWildernessLevel(player);
    }

    @Override
    public void moved() {
	updateWildernessLevel(player);
    }

    @Override
    public boolean login() {
	if (isFfaZone(player)) {
	    ffaPlayers.add(player);
	} else if (isPureZone(player)) {
	    purePlayers.add(player);
	} else if (isNonMeleeZone(player)) {
	    meleeDisabledPlayers.add(player);
	} else if (isNonRangeZone(player)) {
	    rangeDisabledPlayers.add(player);
	} else if (isNonMagicZone(player)) {
	    magicDisabledPlayers.add(player);
	}
	player.setCanPvp(true);
	updateWildernessLevel(player);
	areaCount++;
	if (areaCount == 1)
	    initArea();
	return false;
    }

    @Override
    public boolean logout() {
	unregister(player, true);
	return false;
    }

    @Override
    public boolean canSummonFamiliar() {
	player.getPackets().sendGameMessage("You cannot summon familiars in the slaughter fields");
	return false;
    }

    @Override
    public boolean processMagicTeleport(WorldTile toTile) {
	if (isDangerousZone(player)) {
	    player.getPackets().sendGameMessage("You can't teleport in the dangerous zone.");
	    return false;
	}
	return true;
    }

    @Override
    public boolean processItemTeleport(WorldTile toTile) {
	if (isDangerousZone(player)) {
	    player.getPackets().sendGameMessage("You can't teleport in the dangerous zone.");
	    return false;
	}
	return true;
    }

    @Override
    public boolean sendDeath() {
	player.getControlerManager().forceStop();
	return true;
    }

    @Override
    public void forceClose() {
	unregister(player, false);
    }

    @Override
    public boolean keepCombating(Entity target) {
	if (target instanceof NPC) {
	    return true;
	}
	boolean isRanging = PlayerCombat.isRanging(player) != 0;
	if (player.getCombatDefinitions().getSpellId() > 0 && isNonMagicZone(player)) {
	    player.getPackets().sendGameMessage("Magic combat has been disabled in this area!", true);
	    return false;
	} else if (isRanging && isNonRangeZone(player)) {
	    player.getPackets().sendGameMessage("Ranged combat has been disabled in this area!", true);
	    return false;
	} else if (!isRanging && isNonMeleeZone(player) && player.getCombatDefinitions().getSpellId() <= 0) {
	    player.getPackets().sendGameMessage("Melee combat has been disabled in this area!", true);
	    return false;
	}
	if (isSafe(target)) {
	    player.getPackets().sendGameMessage("This player is in the safe zone.");
	    return false;
	} else if (isSafe(player)) {
	    player.getPackets().sendGameMessage("You can't attack players in the safe zone.");
	    return false;
	}
	if (target.getAttackedBy() != player && player.getAttackedBy() != target) {
	    player.setWildernessSkull();
	}
	return true;
    }

    @Override
    public boolean canAttack(Entity target) {
	if (target instanceof Player) {
	    Player p = (Player) target;
	    if (player.isCanPvp() && !p.isCanPvp()) {
		player.getPackets().sendGameMessage("That player is not in the dangerous part of the fields.");
		return false;
	    }
	    return true;
	}
	return true;
    }

    @Override
    public boolean canHit(Entity target) {
	if (target instanceof NPC) {
	    return true;
	}
	Player p = (Player) target;
	if (isDangerousZone(player) && isDangerousZone(p))
	    return true;
	if (Math.abs(player.getSkills().getCombatLevel() - p.getSkills().getCombatLevel()) > 20)
	    return false;
	return true;
    }

    /**
     * Unregisters the player.
     * @param player The player.
     * @param logout If the player is logging out.
     */
    private static void unregister(Player player, boolean logout) {
	areaCount--;
	ffaPlayers.remove(player);
	purePlayers.remove(player);
	meleeDisabledPlayers.remove(player);
	rangeDisabledPlayers.remove(player);
	magicDisabledPlayers.remove(player);
	dangerousPlayers.remove(player);
	if (!logout) {
	    if (player.getInterfaceManager().hasRezizableScreen())
		player.getPackets().sendIComponentText(746, 17, "");
	    player.getPackets().sendIComponentText(548, 10, "");
	    player.getPackets().sendIComponentText(548, 11, "");
	    player.setCanPvp(false);
	}
    }

    @Override
    public boolean processObjectClick1(WorldObject object) {
	switch (object.getId()) {
	    case 13397: //Magic entrance way (3583-3585 anim)
		handleElementalBalance(player, object);
		return false;
	    case 13403: //Range entrance way
		handleRangeTarget(player, object);
		return false;
	    case 15624: //Melee entrance way
		handleMeleeTarget(player, object);
		return false;
	    case 8987: //Portal
		if (object.matches(regionBase.transform(81, 53, 0))) {
		    purePlayers.remove(player);
		    Magic.sendObjectTeleportSpell(player, false, regionBase.transform(81, 66, 0));
		} else if (object.matches(regionBase.transform(57, 83, 0))) {
		    meleeDisabledPlayers.remove(player);
		    Magic.sendObjectTeleportSpell(player, false, regionBase.transform(66, 81, 0));
		} else if (object.matches(regionBase.transform(96, 124, 0))) {
		    rangeDisabledPlayers.remove(player);
		    Magic.sendObjectTeleportSpell(player, false, regionBase.transform(95, 109, 0));
		} else if (object.matches(regionBase.transform(121, 102, 0))) {
		    magicDisabledPlayers.remove(player);
		    Magic.sendObjectTeleportSpell(player, false, regionBase.transform(108, 104, 0));
		} else if (object.matches(regionBase.transform(66, 76, 0))) {
		    Magic.sendObjectTeleportSpell(player, false, new WorldTile(3088, 3498, 0));
		    player.getControlerManager().forceStop();
		} else {
		    return true;
		}
		ffaPlayers.add(player);
		return false;
	    case 11354: //Dangerous zone.
		if (isDangerousZone(player)) {
		    Magic.sendObjectTeleportSpell(player, false, regionBase.transform(89, 94, 0));
		    dangerousPlayers.remove(player);
		    ffaPlayers.add(player);
		    return false;
		}
		ffaPlayers.remove(player);
		dangerousPlayers.add(player);
		Magic.sendObjectTeleportSpell(player, false, regionBase.transform(79, 249, 0));
		return false;
	}
	return true;
    }

    /**
     * Handles the melee target object action.
     * @param p The player.
     * @param o The object.
     */
    private static void handleMeleeTarget(final Player p, final WorldObject o) {
	WorldTile destination = null;
	switch (o.getRotation()) {
	    case 0:
		destination = regionBase.transform(96, 125, 0);
		break;
	    case 1:
		destination = regionBase.transform(122, 102, 0);
		break;
	    case 2:
		if (p.getSkills().getLevelForXp(Skills.DEFENCE) != 1) {
		    p.getPackets().sendGameMessage("You can only enter this area with 1 defence.");
		    return;
		}
		destination = regionBase.transform(81, 52, 0);
		break;
	    default:
		return;
	}
	if (PlayerCombat.isRanging(p) != 0) {
	    p.getPackets().sendGameMessage("You can't use a range weapon to hit this dummy.");
	    return;
	}
	final WorldTile dest = destination;
	p.lock();
	WorldTasksManager.schedule(new WorldTask() {
	    @Override
	    public void run() {
		p.setNextAnimation(new Animation(PlayerCombat.getWeaponAttackEmote(p.getEquipment().getWeaponId(), 1)));
		WorldTasksManager.schedule(new WorldTask() {
		    @Override
		    public void run() {
			p.unlock();
			p.getPackets().sendGameMessage("You hit the dummy and hear a clicking sound.");
			Magic.sendObjectTeleportSpell(p, false, dest);
			register(p, o.getRotation());
		    }
		}, 1);
	    }
	}, 1);
    }

    @Override
    public void magicTeleported(int type) {
	if (type == Magic.OBJECT_TELEPORT)
	    return;
	else
	    player.getControlerManager().forceStop();
    }

    /**
     * Handles the magic target object action.
     * @param p The player.
     * @param o The object.
     */
    private static void handleElementalBalance(final Player p, final WorldObject o) {
	WorldTile destination = null;
	switch (o.getRotation()) {
	    case 0:
		destination = regionBase.transform(96, 125, 0);
		break;
	    case 2:
		if (p.getSkills().getLevelForXp(Skills.DEFENCE) != 1) {
		    p.getPackets().sendGameMessage("You can only enter this area with 1 defence.");
		    return;
		}
		destination = regionBase.transform(81, 52, 0);
		break;
	    case 3:
		destination = regionBase.transform(56, 83, 0);
		break;
	    default:
		return;
	}
	final WorldTile dest = destination;
	p.lock();
	p.getPackets().sendObjectAnimation(o, new Animation(3583));
	WorldTasksManager.schedule(new WorldTask() {
	    @Override
	    public void run() {
		p.setNextGraphics(new Graphics(2728));
		p.setNextAnimation(new Animation(2791));
		p.getPackets().sendObjectAnimation(o, new Animation(3584));
		World.sendProjectile(p, o, 2735, 18, 36, 50, 50, 3, 0);
		World.sendProjectile(p, o, 2736, 18, 36, 50, 50, 20, 0);
		World.sendProjectile(p, o, 2736, 18, 36, 50, 50, 110, 0);
		WorldTasksManager.schedule(new WorldTask() {
		    @Override
		    public void run() {
			p.unlock();
			p.getPackets().sendObjectAnimation(o, new Animation(3585));
			p.getPackets().sendGraphics(new Graphics(2741, 0, 165 << 2), o);
			p.getPackets().sendGameMessage("The elemental balance starts to glow as you heat it, and draws you to the other side.");
			Magic.sendObjectTeleportSpell(p, false, dest);
			register(p, o.getRotation());
		    }
		}, 1);
	    }
	}, 1);
    }

    /**
     * Handles the range target object action.
     * @param p The player.
     * @param o The object.
     */
    private static void handleRangeTarget(final Player p, final WorldObject o) {
	WorldTile destination = null;
	int x = 0, y = 0;
	switch (o.getRotation()) {
	    case 1:
		destination = regionBase.transform(122, 102, 0);
		x = -1;
		break;
	    case 2:
		if (p.getSkills().getLevelForXp(Skills.DEFENCE) != 1) {
		    p.getPackets().sendGameMessage("You can only enter this area with 1 defence.");
		    return;
		}
		destination = regionBase.transform(81, 52, 0);
		y = 1;
		break;
	    case 3:
		destination = regionBase.transform(56, 83, 0);
		x = 1;
		break;
	    default:
		return;
	}
	if (!o.transform(x, y, 0).matches(p)) {
	    p.getPackets().sendGameMessage("You can't fire the target from here.");
	    return;
	}
	if (PlayerCombat.isRanging(p) == 0) {
	    p.getPackets().sendGameMessage("You need a range weapon to shoot the target.");
	    return;
	}
	final WorldTile dest = destination;
	p.lock();
	WorldTasksManager.schedule(new WorldTask() {
	    @Override
	    public void run() {
		Item weapon = p.getEquipment().getItem(3);
		if (weapon == null) {
		    return;
		}
		if (weapon.getDefinitions().getName().contains("handcannon")) {
		    p.getPackets().sendGameMessage("Shooting the target with a handcannon would destroy the target.");
		    return;
		}
		p.setNextAnimation(new Animation(PlayerCombat.getWeaponAttackEmote(weapon.getId(), 0)));
		if (weapon.getDefinitions().getName().contains("crossbow") || weapon.getDefinitions().getName().contains("c'bow")) {
		    World.sendProjectile(p, o, 27, 38, 36, 41, 32, 5, 0);
		} else if (weapon.getDefinitions().getName().contains("knife") || weapon.getDefinitions().getName().contains("dart") || weapon.getDefinitions().getName().contains("axe") || weapon.getDefinitions().getName().contains("javelin")) {
		    p.setNextGraphics(new Graphics(PlayerCombat.getKnifeThrowGfxId(weapon.getId()), 0, 100));
		    World.sendProjectile(p, o, PlayerCombat.getKnifeThrowGfxId(weapon.getId()), 41, 36, 41, 32, 15, 0);
		} else if (weapon.getDefinitions().getName().contains("rystal bow")) {
		    p.setNextGraphics(new Graphics(250, 0, 96));
		    World.sendProjectile(p, o, 249, 41, 36, 41, 35, 0, 0);
		} else {
		    p.setNextGraphics(new Graphics(19, 0, 96));
		    World.sendProjectile(p, o, 10, 41, 36, 20, 35, 16, 0);
		}
		WorldTasksManager.schedule(new WorldTask() {
		    @Override
		    public void run() {
			p.unlock();
			p.getPackets().sendGameMessage("Bulls-eye! A magical force teleports you to the other side...");
			Magic.sendObjectTeleportSpell(p, false, dest);
			register(p, o.getRotation());
		    }
		}, 1);
	    }
	}, 1);
    }

    /**
     * Registers the player to one of the lists when teleported.
     * @param p The player.
     * @param rotation The rotation of the object used to teleport.
     */
    private static void register(Player p, int rotation) {
	switch (rotation) {
	    case 0:
		rangeDisabledPlayers.add(p);
		break;
	    case 1:
		magicDisabledPlayers.add(p);
		break;
	    case 2:
		purePlayers.add(p);
		break;
	    case 3:
		meleeDisabledPlayers.add(p);
		break;
	    default:
		return;
	}
	ffaPlayers.remove(p);
    }

    /**
     * Updates the wilderness level etc.
     */
    private static void updateWildernessLevel(Player player) {
	String allowedCombat;
	int combatHash = getPossibleCombat(player);
	if (combatHash == 14) {
	    allowedCombat = "Melee, range, magic     ";
	} else if (combatHash == 6) {
	    allowedCombat = "Melee, range";
	} else if (combatHash == 10) {
	    allowedCombat = "Melee, magic";
	} else {
	    allowedCombat = "Range, magic";
	}
	int level = isDangerousZone(player) ? 15 : 8;
	if (player.getInterfaceManager().hasRezizableScreen()) {
	    player.getPackets().sendIComponentText(746, 17, "Level: " + level + "<br><col=ff0000>" + allowedCombat + "</col>");
	    return;
	}
	player.getPackets().sendIComponentText(548, 10, "Level: " + level);
	player.getPackets().sendIComponentText(548, 11, "<col=ff0000>" + allowedCombat + "</col>");
    }

    /**
     * Gets the wilderness level of the world tile.
     * @param w The world tile.
     * @return The wilderness level.
     */
    private static int getPossibleCombat(WorldTile w) {
	int combatHash = 0;
	if (isFfaZone(w) || isPureZone(w) || isDangerousZone(w)) {
	    combatHash |= 0x2; //Melee
	    combatHash |= 0x4; //Range
	    combatHash |= 0x8; //Magic
	} else if (isNonRangeZone(w)) {
	    combatHash |= 0x2;
	    combatHash |= 0x8;
	} else if (isNonMeleeZone(w)) {
	    combatHash |= 0x4;
	    combatHash |= 0x8;
	} else if (isNonMagicZone(w)) {
	    combatHash |= 0x2;
	    combatHash |= 0x4;
	}
	return combatHash;
    }

    /**
     * Checks if the world tile is in the pure-only zone.
     * @param w The world tile.
     * @return {@code True} if so.
     */
    public static final boolean isPureZone(WorldTile w) {
	return w.getX() > (regionBase.getX() + 60) && w.getX() < regionBase.getX() + 120 && w.getY() < (regionBase.getY() + 60) && w.getY() >= regionBase.getY();
    }

    /**
     * Checks if the world tile is in the ffa zone.
     * @param w The world tile.
     * @return {@code True} if so.
     */
    public static final boolean isFfaZone(WorldTile w) {
	return w.getX() > (regionBase.getX() + 60) && w.getX() < regionBase.getX() + 120 && w.getY() < (regionBase.getY() + 120) && w.getY() >= regionBase.getY() + 60;
    }

    /**
     * Checks if the world tile is in the dangerous zone.
     * @param w The world tile.
     * @return {@code True} if so.
     */
    public static final boolean isDangerousZone(WorldTile w) {
	return w.getX() > (regionBase.getX() + 54) && w.getX() < regionBase.getX() + 129 && w.getY() < (regionBase.getY() + 296) && w.getY() >= regionBase.getY() + 239;
    }

    /**
     * Checks if the world tile is in the non-range zone.
     * @param w The world tile.
     * @return {@code True} if so.
     */
    public static final boolean isNonRangeZone(WorldTile w) {
	return w.getX() > (regionBase.getX() + 50) && w.getX() < regionBase.getX() + 120 && w.getY() < (regionBase.getY() + 200) && w.getY() >= regionBase.getY() + 120;
    }

    /**
     * Checks if the world tile is in the non-melee zone.
     * @param w The world tile.
     * @return {@code True} if so.
     */
    public static final boolean isNonMeleeZone(WorldTile w) {
	return w.getX() > regionBase.getX() && w.getX() < regionBase.getX() + 60 && w.getY() < (regionBase.getY() + 120) && w.getY() >= regionBase.getY() + 64;
    }

    /**
     * Checks if the world tile is in the non-magic zone.
     * @param w The world tile.
     * @return {@code True} if so.
     */
    public static final boolean isNonMagicZone(WorldTile w) {
	return w.getX() >= (regionBase.getX() + 120) && w.getX() < regionBase.getX() + 180 && w.getY() < (regionBase.getY() + 130) && w.getY() >= regionBase.getY() + 60;
    }

    /**
     * Checks if the world tile is in the safe area.
     * @param w The world tile.
     * @return {@code True} if so.
     */
    public static final boolean isSafe(WorldTile w) {
	return w.getX() > regionBase.getX() + 63 && w.getX() < regionBase.getX() + 68 && w.getY() > regionBase.getY() + 70 && w.getY() < regionBase.getY() + 77;
    }

    /**
     * Checks if the world tile is in multi-combat zone.
     * @param w The world tile.
     * @return {@code True} if so.
     */
    public static boolean isMulti(WorldTile w) {
	return w.getX() > regionBase.getX() + 61 && w.getX() < regionBase.getX() + 114 && w.getY() > regionBase.getY() + 42 && w.getY() < regionBase.getY() + 58 //Pure zone
		|| w.getX() > regionBase.getX() + 61 && w.getX() < regionBase.getX() + 114 && w.getY() > regionBase.getY() + 100 && w.getY() < regionBase.getY() + 113 //Ffa zone
		|| w.getX() > regionBase.getX() + 19 && w.getX() < regionBase.getX() + 62 && w.getY() > regionBase.getY() + 92 && w.getY() < regionBase.getY() + 102 //No melee zone
		|| w.getX() > regionBase.getX() + 116 && w.getX() < regionBase.getX() + 173 && w.getY() > regionBase.getY() + 100 && w.getY() < regionBase.getY() + 120 //No magic zone
		|| w.getX() > regionBase.getX() + 52 && w.getX() < regionBase.getX() + 123 && w.getY() > regionBase.getY() + 160 && w.getY() < regionBase.getY() + 191 //No range zone
		|| w.getX() > regionBase.getX() + 51 && w.getX() < regionBase.getX() + 132 && w.getY() > regionBase.getY() + 265 && w.getY() < regionBase.getY() + 297; //Dangerous zone
    }

    /**
     * Checks if the player has overpowered gear with him.
     * @param p The player.
     * @return {@code True} if so.
     */
    public static boolean hasOverpoweredGear(Player p) {
	if (p.getFamiliar() != null || p.getPet() != null) {
	    p.getPackets().sendGameMessage("You cannot bring followers into the Slaughter Fields.");
	    return true;
	}
	for (Item item : p.getInventory().getItems().getItems()) {
	    if (item == null) {
		continue;
	    }
	    if (isOverpowered(item)) {
		p.getPackets().sendGameMessage("You can't bring " + item.getDefinitions().getName() + " to the Slaughter fields.");
		return true;
	    }
	}
	for (Item item : p.getEquipment().getItems().getItems()) {
	    if (item == null) {
		continue;
	    }
	    if (isOverpowered(item)) {
		p.getPackets().sendGameMessage("You can't bring " + item.getDefinitions().getName() + " to the Slaughter fields.");
		return true;
	    }
	}
	/*	if (p.getFamiliar() == null) {
		    return false;
		}
		String familiarName = (p.getFamiliar().getName() + "").toLowerCase();
		if (familiarName.contains("war tort") || familiarName.contains("pack yak") || familiarName.contains("titan")) {
		    p.getPackets().sendGameMessage("You can't bring this familiar to the Slaughter fields.");
		    return true;
		}
		if (p.getFamiliar().getBob() != null) {
		    for (Item item : p.getFamiliar().getBob().getBeastItems().getItems()) {
			if (item == null) {
			    continue;
			}
			if (isOverpowered(item)) {
			    p.getPackets().sendGameMessage("Your familiar is not allowed to bring " + item.getDefinitions().getName() + " to the Slaughter fields.");
			    return true;
			}
		    }
		}
	*/return false;
    }

    /**
     * Checks if the item is overpowered.
     * @param item The item.
     * @return {@code True} if so.
     */
    private static boolean isOverpowered(Item item) {
	String name = (item.getDefinitions().getName() + "").toLowerCase();
	if (name.contains("zuriel") || name.contains("vesta") || name.contains("statius") || name.contains("morrigan")) {
	    return true;
	}
	if (name.contains("chaotic") || name.contains("primal") || name.contains("prometh") || name.contains("gorgonite")) {
	    return true;
	}
	if (name.contains("torva") || name.contains("pernix") || name.contains("virtus")) {
	    return true;
	}
	if (name.contains("divine spirit") || name.contains("elysian spirit")) {
	    return true;
	}
	if (name.contains("ganodermic") || name.contains("sacred clay")) {
	    return true;
	}
	if (name.contains("polypore") || name.contains("armadyl rune")) {
	    return true;
	}
	if (name.contains("dominion")) {
	    return true;
	}
	if (name.contains("steadfast") || name.contains("glaiven") || name.contains("ragefire")) {
	    return true;
	}
	if (name.contains("overload") || name.contains("extreme")) {
	    return true;
	}
	if (name.contains("celestial") || name.contains("catalytic") || name.contains("max cape")) {
	    return true;
	}
	return false;
    }

    /**
     * Gets the region base world tile.
     * @return The region base world tile.
     */
    public static WorldTile getRegionBase() {
	return regionBase;
    }

}