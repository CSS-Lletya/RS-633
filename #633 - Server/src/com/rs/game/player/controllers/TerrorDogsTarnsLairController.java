package com.rs.game.player.controllers;

import com.rs.game.WorldObject;
import com.rs.game.WorldTile;


public class TerrorDogsTarnsLairController extends Controller {

    private boolean drain;

    @Override
    public void start() {
	player.useStairs(-1, new WorldTile(3149, 4658, 0), 0, 1);
    }

    @Override
    public boolean processObjectClick1(WorldObject object) {
	if(object.getId() == 20572 && object.getX() == 3149 && object.getY() == 4659) {
	    player.useStairs(-1, new WorldTile(3149, 4664, 0), 0, 1);
	    removeControler();
	    return false;
	}
	return true;
    }
    @Override
    public void process() {
	if((drain = !drain))
	    player.getPrayer().drainPrayer(10);    
    }
    
    @Override
    public boolean login() {
	return false;
    }

    @Override
    public boolean sendDeath() {
	removeControler();
	return true;
    }

    @Override
    public boolean logout() {
	return false; // so doesnt remove script
    }

    @Override
    public void forceClose() {
	
    }

    @Override
    public void magicTeleported(int type) {
	removeControler();
    }
}
