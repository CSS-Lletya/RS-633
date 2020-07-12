package com.rs.game.player.controllers;

import com.rs.game.Animation;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.player.content.LightSource;
import com.rs.game.player.content.Slayer;
import com.rs.utils.Utils;

public class UnderGroundDungeon extends Controller {

    transient int ticks;
    boolean hasStench, requiresLightSource;
    transient boolean initial;

    @Override
    public void start() {
	init();
	setArguments(null);
    }

    private void init() {
	if (this.getArguments() != null) {
	    hasStench = (boolean) this.getArguments()[0];
	    requiresLightSource = (boolean) this.getArguments()[1];
	}
	ticks = 0;
	initial = true;
	sendInterfaces();
    }

    @Override
    public void sendInterfaces() {
	if (requiresLightSource) {
	    boolean hasLight = LightSource.hasLightSource(player);
	    player.getInterfaceManager().setOverlay(hasLight ? (LightSource.hasExplosiveSource(player) ? 98 : 97) : 96, true);
	    if (!hasLight)
		player.getPackets().sendBlackOut(2);
	    else
		player.getPackets().sendBlackOut(0);
	}
    }

    private void checkRequriments() {
	boolean lastInitial = initial;
	if (hasStench) {
	    if (!Slayer.hasNosepeg(player) && !Slayer.hasMask(player)) {
		if (initial)
		    player.getPackets().sendGameMessage("The stench of the monsters begins to reach your nose..");
		initial = false;
	    } else
		initial = true;
	}
	if (requiresLightSource) {
	    if (!LightSource.hasLightSource(player)) {
		if (initial)
		    player.getPackets().sendGameMessage("You hear tiny insects skittering over the ground...");
		initial = false;
	    } else
		initial = true;
	}
	if (lastInitial != initial)
	    sendInterfaces();
    }

    @Override
    public void process() {
	checkRequriments();
	if (initial)
	    return;
	ticks++;
	if (hasStench) {
	    if (ticks % 12 == 0) {
		player.getPackets().sendGameMessage("The strench of the monsters burns your innards.");
		player.applyHit(new Hit(player, 200, HitLook.REGULAR_DAMAGE));
	    }
	}
	if (requiresLightSource) {
	    if (ticks % 2 == 0) {
		if (!LightSource.hasLightSource(player)) {
		    if (!player.isLocked())
			player.applyHit(new Hit(player, Utils.random(10, 100), HitLook.REGULAR_DAMAGE));
		}
	    }
	}
    }

    @Override
    public boolean processObjectClick1(final WorldObject object) {
	if (object.getId() == 31316) {
	    player.useStairs(-1, new WorldTile(3360, 2971, 0), 1, 2);
	    player.getControlerManager().forceStop();
	    return false;
	} else if (object.getId() == 5946) {
	    player.useStairs(828, new WorldTile(3168, 3171, 0), 1, 2);
	    player.getControlerManager().forceStop();
	    return false;
	} else if (object.getId() == 32944) {
	    player.useStairs(-1, new WorldTile(3219, 9532, 2), 1, 2);
	    player.getControlerManager().forceStop();
	    return false;
	} else if (object.getId() == 31435) {
	    return false;
	} else if (object.getId() == 15811) {
	    player.useStairs(-1, new WorldTile(3749, 2973, 0), 1, 2);
	    return false;
	} else if (object.getId() == 15790) {
	    if (object.getX() == 3829)
		player.useStairs(-1, new WorldTile(3831, 3062, 0), 1, 2);
	    if (object.getX() == 3814)
		player.useStairs(-1, new WorldTile(3816, 3062, 0), 1, 2);
	    player.getControlerManager().forceStop();
	    return false;
	} else if (object.getId() == 15812) {
	    player.useStairs(-1, new WorldTile(3749, 2973, 0), 1, 2);
	    player.getControlerManager().forceStop();
	    return false;
	} else if (object.getId() == 6912) {
	    player.setNextAnimation(new Animation(10578));
	    player.useStairs(-1, object, 1, 2);
	    player.useStairs(10579, new WorldTile(player.getX(), player.getY() == 9601 ? player.getY() + 2 : player.getY() - 2, 0), 1, 2);
	    return false;
	} else if (object.getId() == 6899) {
	    player.setNextAnimation(new Animation(10578));
	    player.useStairs(-1, object, 1, 2);
	    player.useStairs(10579, new WorldTile(3219, 9618, 0), 1, 2);
	    player.getControlerManager().forceStop();
	    player.getPackets().sendGameMessage("You squeeze through the hole.");
	    return false;
	} else if (object.getId() == 6439) {
	    player.useStairs(828, new WorldTile(3310, 2961, 0), 1, 2);
	    player.getControlerManager().forceStop();
	    return false;
	} else if (object.getId() == 31390) {
	    player.useStairs(-1, new WorldTile(3318, 9355, 0), 1, 2, "You tumble into the darkness, arriving on a different cave level.");
	    return false;
	} else if (object.getId() == 31367) {
	    player.useStairs(-1, new WorldTile(3338, 9350, 0), 1, 2, "You tumble into the darkness, arriving on a different cave level.");
	    return false;
	}
	return true;
    }

    @Override
    public void magicTeleported(int type) {
	player.getControlerManager().forceStop();
    }

    @Override
    public void forceClose() {
	player.getPackets().sendBlackOut(0);
	player.getInterfaceManager().removeOverlay(true);
    }

    @Override
    public boolean login() {
	init();
	return false;
    }

    @Override
    public boolean logout() {
	return false;
    }
}
