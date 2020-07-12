package com.rs.game.player.controllers;

import java.util.TimerTask;

import com.rs.cores.CoresManager;
import com.rs.game.Animation;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.player.Skills;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class JadinkoLair extends Controller { // 10, 13, 50

    public static int playersCount;
    private static final int[] JADE_ROOTS = { 12290, 12291, 12272, 12274 };
    private static final WorldTile[] JADE_WORLDTILE = { new WorldTile(3053, 9239, 0), new WorldTile(3055, 9246, 0), new WorldTile(3056, 9250, 0), new WorldTile(3061, 9240, 0), new WorldTile(3048, 9233, 0), new WorldTile(3044, 9237, 0), new WorldTile(3036, 9241, 0), new WorldTile(3026, 9237, 0), new WorldTile(3023, 9232, 0), new WorldTile(3035, 9233, 0), new WorldTile(3035, 9233, 0), new WorldTile(3035, 9233, 0), new WorldTile(3033, 9231, 0), new WorldTile(3033, 9231, 0), new WorldTile(3023, 9229, 0), new WorldTile(3020, 9243, 0), new WorldTile(3015, 9252, 0), new WorldTile(3024, 9252, 0), new WorldTile(3023, 9257, 0), new WorldTile(3040, 9262, 0), new WorldTile(3041, 9268, 0), new WorldTile(3046, 9268, 0), new WorldTile(3046, 9268, 0), new WorldTile(3046, 9268, 0), new WorldTile(3053, 9249, 0), new WorldTile(3058, 9251, 0), new WorldTile(3058, 9251, 0), new WorldTile(3064, 9238, 0), new WorldTile(3059, 9241, 0), new WorldTile(3056, 9237, 0), new WorldTile(3060, 9243, 0), new WorldTile(3026, 9234, 0), new WorldTile(3038, 9237, 0), new WorldTile(3041, 9263, 0), new WorldTile(3040, 9269, 0), new WorldTile(3047, 9265, 0), new WorldTile(3046, 9273, 0), new WorldTile(3045, 9270, 0), new WorldTile(3044, 9263, 0), new WorldTile(3043, 9259, 0), new WorldTile(3037, 9265, 0), new WorldTile(3040, 9260, 0), new WorldTile(3043, 9264, 0), new WorldTile(3021, 9257, 0), new WorldTile(3017, 9259, 0), new WorldTile(3015, 9263, 0), new WorldTile(3011, 9261, 0), new WorldTile(3017, 9251, 0), new WorldTile(3020, 9252, 0), new WorldTile(3020, 9256, 0), new WorldTile(3021, 9260, 0), new WorldTile(3024, 9257, 0), new WorldTile(3021, 9252, 0), new WorldTile(3022, 9238, 0), new WorldTile(3021, 9234, 0), new WorldTile(3020, 9229, 0), new WorldTile(3028, 9232, 0), new WorldTile(3026, 9236, 0), new WorldTile(3022, 9236, 0), new WorldTile(3026, 9236, 0), new WorldTile(3027, 9233, 0), new WorldTile(3029, 9231, 0), new WorldTile(3028, 9237, 0), new WorldTile(3030, 9236, 0), new WorldTile(3033, 9239, 0), new WorldTile(3034, 9235, 0), new WorldTile(3035, 9237, 0), new WorldTile(3036, 9232, 0), new WorldTile(3036, 9237, 0), new WorldTile(3036, 9241, 0), new WorldTile(3041, 9236, 0), new WorldTile(3040, 9241, 0), new WorldTile(3043, 9229, 0), new WorldTile(3045, 9234, 0), new WorldTile(3041, 9238, 0), new WorldTile(3047, 9234, 0), new WorldTile(3042, 9243, 0), new WorldTile(3054, 9238, 0), new WorldTile(3055, 9244, 0), new WorldTile(3054, 9249, 0), new WorldTile(3058, 9249, 0), new WorldTile(3059, 9245, 0), new WorldTile(3063, 9241, 0), new WorldTile(3062, 9237, 0), new WorldTile(3059, 9240, 0), new WorldTile(3064, 9242, 0), new WorldTile(3062, 9246, 0), new WorldTile(3063, 9236, 0), new WorldTile(3041, 9265, 0), new WorldTile(3042, 9261, 0), new WorldTile(3045, 9262, 0), new WorldTile(3048, 9266, 0), new WorldTile(3042, 9271, 0) };

    public static void init() {
	CoresManager.fastExecutor.schedule(new JadinkoTimer(), 600, 600);
	for (WorldTile tile : JADE_WORLDTILE) {
	    if (Utils.random(2) == 0)
		continue;
	    createJadeRoot(JADE_ROOTS[Utils.random(JADE_ROOTS.length)], tile, true);
	}
    }

    static class JadinkoTimer extends TimerTask {

	int ticks;

	@Override
	public void run() {
	    ticks++;
	    if (ticks % 10 == 0) {
		if (playersCount != 0) {
		    for (int i = 0; i < Utils.random(Utils.random(JADE_ROOTS.length)); i++)
			createJadeRoot(JADE_ROOTS[Utils.random(JADE_ROOTS.length)], JADE_WORLDTILE[Utils.random(JADE_WORLDTILE.length)], false);
		}
	    }
	}
    }

    private static void createJadeRoot(int id, WorldTile tile, boolean permenant) {
	if (World.getStandartObject(tile) != null)
	    return;
	WorldObject o = new WorldObject(id, 10, 0, tile);
	if (permenant)
	    World.spawnObject(o);
	else
	    World.spawnObjectTemporary(o, Utils.random(10000, 30000));
    }

    @Override
    public boolean processObjectClick1(final WorldObject object) {
	if (object.getId() == 12284) {
	    if (!player.getInventory().containsItemToolBelt(590) || !player.getInventory().containsItem(21350, 1)) {
		player.getPackets().sendGameMessage("You do not have the required items to light this.");
		return false;
	    } else if (player.getSkills().getLevel(Skills.FIREMAKING) < 83) {
		player.getPackets().sendGameMessage("You do not have the required level to light this.");
		return false;
	    }
	    player.lock(5);
	    player.setNextAnimation(new Animation(827));
	    WorldTasksManager.schedule(new WorldTask() {

		byte ticks = 0;

		@Override
		public void run() {
		    ticks++;
		    if (ticks == 2) {
			player.getInventory().deleteItem(21350, 1);
			World.spawnObjectTemporary(new WorldObject(object.getId() + 1, object.getType(), object.getRotation(), object), 2000);
		    } else if (ticks == 3) {
			player.setNextAnimation(new Animation(16700));
		    } else if (ticks == 4) {
			World.spawnObjectTemporary(new WorldObject(object.getId() + 2, object.getType(), object.getRotation(), object), 30000);
			player.getSkills().addXp(Skills.FIREMAKING, 378.7);
			player.setFavorPoints(3 + player.getFavorPoints());
			player.refreshFavorPoints();
			stop();
			return;
		    }
		}
	    }, 0, 0);
	    return false;
	} else if (object.getId() == 12327) {
	    player.getControlerManager().forceStop();
	    player.useStairs(-1, new WorldTile(2948, 2955, 0), 1, 2);
	    return false;
	} else if (object.getId() == 12321) {
	    player.useStairs(3414, new WorldTile(2946, 2886, 0), 2, 3);
	    WorldTasksManager.schedule(new WorldTask() {

		@Override
		public void run() {
		    player.setNextFaceWorldTile(new WorldTile(2946, 2887, 0));
		    player.setNextAnimation(new Animation(11043));
		    player.getControlerManager().forceStop();
		}
	    }, 3);
	    return false;
	}
	return true;
    }

    @Override
    public void start() {
	playersCount++;
	sendInterfaces();
    }

    @Override
    public void sendInterfaces() {
	player.getInterfaceManager().setOverlay(715, true);
	player.refreshFavorPoints();
    }

    @Override
    public void magicTeleported(int teleType) {
	player.getControlerManager().forceStop();
    }

    @Override
    public boolean logout() {
	playersCount--;
	return false;
    }

    @Override
    public boolean login() {
	start();
	return false;
    }

    @Override
    public void forceClose() {
	playersCount--;
	player.getInterfaceManager().removeOverlay(true);
    }
}
