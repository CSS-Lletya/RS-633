package com.rs.game.player.controllers;

import com.rs.game.Animation;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.player.controllers.events.DeathEvent;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public class CorpBeastControler extends Controller {

    @Override
    public void start() {

    }

    @Override
    public boolean processObjectClick1(WorldObject object) {
	if (object.getId() == 37929 || object.getId() == 38811) {
	    removeControler();
	    player.stopAll();
	    player.setNextWorldTile(new WorldTile(2970, 4384, player.getPlane()));
	    return false;
	}
	return true;
    }

    @Override
    public void magicTeleported(int type) {
	removeControler();
    }

    @Override
    public boolean sendDeath() {
	player.lock(7);
	player.stopAll();
	WorldTasksManager.schedule(new WorldTask() {
	    int loop;

	    @Override
	    public void run() {
		if (loop == 0) {
		    player.setNextAnimation(new Animation(836));
		} else if (loop == 1) {
		    player.getPackets().sendGameMessage("Oh dear, you have died.");
		} else if (loop == 3) {
		    player.sendItemsOnDeath(null);
		    player.reset();
		    player.setNextWorldTile(DeathEvent.getRespawnHub(player));
		    player.setNextAnimation(new Animation(-1));
		} else if (loop == 4) {
		    removeControler();
		    player.getPackets().sendMusicEffect(90);
		    stop();
		}
		loop++;
	    }
	}, 0, 1);
	return false;
    }

    @Override
    public boolean login() {
	return false; // so doesnt remove script
    }

    @Override
    public boolean logout() {
	return false; // so doesnt remove script
    }

}
