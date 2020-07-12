package com.rs.game.player.controllers;

import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class RuneEssenceController extends Controller {

    private static final WorldTile[] ESSENCE_COORDS = new WorldTile[] { new WorldTile(2911, 4832, 0), new WorldTile(2924, 4818, 0), new WorldTile(2900, 4818, 0), new WorldTile(2900, 4843, 0), new WorldTile(2922, 4844, 0) };

    @Override
    public void start() {
	
    }

    @Override
    public boolean logout() {
	return false; // so doesnt remove script
    }

    @Override
    public boolean login() {
	return false; // so doesnt remove script
    }

    @Override
    public boolean sendDeath() {
	removeControler();
	return true;
    }

    @Override
    public void magicTeleported(int type) {
	removeControler();
    }

    /**
     * return process normaly
     */
    public boolean processObjectClick1(WorldObject object) {
	if (object.getId() == 2503) {
	    player.lock();
	    player.setNextGraphics(new Graphics(110));
	    WorldTasksManager.schedule(new WorldTask() {

		@Override
		public void run() {
		    player.useStairs(-1, (WorldTile) getArguments()[0], 0, 1);
		    removeControler();
		}
	    }, 2);
	    return false;
	}
	return true;
    }

    public static void teleport(final Player player, NPC npc) {
	player.lock();
	npc.setNextForceTalk(new ForceTalk("Seventior disthiae molenko!"));
	npc.setNextGraphics(new Graphics(108));
	player.setNextGraphics(new Graphics(110));
	WorldTasksManager.schedule(new WorldTask() {

	    @Override
	    public void run() {
		player.getControlerManager().startControler("RuneEssenceController", new WorldTile(player));
		player.useStairs(-1, ESSENCE_COORDS[Utils.random(ESSENCE_COORDS.length)], 0, 1);
	    }
	}, 2);
    }

}
