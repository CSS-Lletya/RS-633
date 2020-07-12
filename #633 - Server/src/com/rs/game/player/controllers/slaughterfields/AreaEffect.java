package com.rs.game.player.controllers.slaughterfields;

import java.util.List;
import java.util.Random;
import java.util.TimerTask;

import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

/**
 * Handles the area effects for each area.
 * @author Emperor
 *
 */
public final class AreaEffect extends TimerTask {

    /**
     * The random instance, used for randomizing values.
     */
    private static final Random RANDOM = new Random();

    @Override
    public void run() {
	if (SlaughterFieldsControler.areaCount == 0) {
	    this.cancel();
	    return;
	}
	boolean dangerous = false;
	for (int i = 0; i < 6; i++) {
	    dangerous = i == 5;
	    if (RANDOM.nextDouble() < 0.1) {
		if (dangerous) {
		    for (int j = 0; j < RANDOM.nextInt(2) + 1; j++) {
			fireEvent(RANDOM.nextInt(5), dangerous);
		    }
		    continue;
		}
		fireEvent(i, dangerous);
	    }
	}
    }

    /**
     * Fires an area event.
     * @param areaType The area type.
     * @param dangerous If we are using this for dangerous zone.
     */
    private static void fireEvent(int areaType, boolean dangerous) {
	switch (areaType) {
	    case 0:
		handleMeteorCrash(dangerous);
		break;
	    case 1:
		handleSandstorm(dangerous);
		break;
	    case 2:
		handleLightningStruck(dangerous);
		break;
	    case 3:
		handleEarthquake(dangerous);
		break;
	    case 4:
		handleScorpionBite(dangerous);
		break;
	}
    }

    /**
     * No-range zone area effect.
     * @param dangerous If we are using this effect for the Dangerous zone.
     */
    private static void handleMeteorCrash(final boolean dangerous) {
	final Player p = getTarget(SlaughterFieldsControler.rangeDisabledPlayers, dangerous);
	if (p == null) {
	    return;
	}
	final WorldTile tile = p.transform(0, 0, 0);
	World.sendProjectile(tile.transform(-2, -3, 0), p, 58, 120, 0, 50, 50, 0, 0);
	WorldTasksManager.schedule(new WorldTask() {
	    @Override
	    public void run() {
		World.sendGraphics(p, new Graphics(659), tile);
		for (Player p : dangerous ? SlaughterFieldsControler.dangerousPlayers : SlaughterFieldsControler.rangeDisabledPlayers) {
		    if (tile.withinDistance(p, 1)) {
			p.getPackets().sendGameMessage("You've been hit by a meteor crash.");
			p.applyHit(new Hit(null, 100 + RANDOM.nextInt(201), HitLook.REGULAR_DAMAGE));
		    }
		}
	    }
	}, 2);
    }

    /**
     * Pure zone area effect.
     * @param dangerous If we are using this effect for the Dangerous zone.
     */
    private static void handleSandstorm(boolean dangerous) {
	final Player p = getTarget(SlaughterFieldsControler.purePlayers, dangerous);
	if (p == null) {
	    return;
	}
	p.setNextGraphics(new Graphics(1340));
	p.getPackets().sendGameMessage("You get suffocated in a sandstorm.");
	p.applyHit(new Hit(null, 20 + RANDOM.nextInt(120), HitLook.REGULAR_DAMAGE, 50));
    }

    /**
     * Ffa zone area effect.
     * @param dangerous If we are using this effect for the Dangerous zone.
     */
    private static void handleLightningStruck(final boolean dangerous) {
	final Player p = getTarget(SlaughterFieldsControler.ffaPlayers, dangerous);
	if (p == null) {
	    return;
	}
	final WorldTile tile = p.transform(0, 0, 0);
	World.sendGraphics(p, new Graphics(1740), tile);
	WorldTasksManager.schedule(new WorldTask() {
	    @Override
	    public void run() {
		for (Player p : dangerous ? SlaughterFieldsControler.dangerousPlayers : SlaughterFieldsControler.ffaPlayers) {
		    if (tile.withinDistance(p, 1)) {
			p.getPackets().sendGameMessage("You've been struck by lightning.");
			p.applyHit(new Hit(null, 90 + RANDOM.nextInt(70), HitLook.REGULAR_DAMAGE));
		    }
		}
	    }
	}, 1);
    }

    /**
     * No-magic zone area effect.
     * @param dangerous If we are using this effect for the Dangerous zone.
     */
    private static void handleEarthquake(final boolean dangerous) {
	final Player p = getTarget(SlaughterFieldsControler.magicDisabledPlayers, dangerous);
	if (p == null) {
	    return;
	}
	final WorldTile tile = p.transform(0, 0, 0);
	World.sendGraphics(p, new Graphics(884), tile);
	WorldTasksManager.schedule(new WorldTask() {
	    @Override
	    public void run() {
		for (final Player p : dangerous ? SlaughterFieldsControler.dangerousPlayers : SlaughterFieldsControler.magicDisabledPlayers) {
		    if (tile.withinDistance(p, 1)) {
			p.getPackets().sendCameraShake(3, 25, 50, 25, 50);
			p.getPackets().sendGameMessage("You get hit by an earthquake.");
			p.applyHit(new Hit(null, 90 + RANDOM.nextInt(70), HitLook.REGULAR_DAMAGE));
			WorldTasksManager.schedule(new WorldTask() {
			    @Override
			    public void run() {
				p.getPackets().sendStopCameraShake();
			    }
			}, 1);
		    }
		}
	    }
	}, 1);
    }

    /**
     * No-melee zone area effect.
     * @param dangerous If we are using this effect for the Dangerous zone.
     */
    private static void handleScorpionBite(boolean dangerous) {
	final Player p = getTarget(SlaughterFieldsControler.meleeDisabledPlayers, dangerous);
	if (p == null) {
	    return;
	}
	p.getPackets().sendGameMessage("You've been bitten by a scorpion.");
	p.setNextForceTalk(new ForceTalk("Ow!"));
	p.applyHit(new Hit(null, 40 + RANDOM.nextInt(50), HitLook.REGULAR_DAMAGE));
	p.getPoison().makePoisoned(108);
    }

    /**
     * Gets the target.
     * @param list The player list.
     * @param dangerous If we are targetting a player in the dangerous zone.
     * @return The player to hit.
     */
    private static Player getTarget(List<Player> list, boolean dangerous) {
	if (dangerous) {
	    list = SlaughterFieldsControler.dangerousPlayers;
	}
	if (list.isEmpty()) {
	    return null;
	}
	return list.get(RANDOM.nextInt(list.size()));
    }
}