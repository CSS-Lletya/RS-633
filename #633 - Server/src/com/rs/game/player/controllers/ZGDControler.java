package com.rs.game.player.controllers;

import com.rs.game.minigames.ZarosGodwars;

public class ZGDControler extends Controller {

    @Override
    public void start() {
	ZarosGodwars.addPlayer(player);
	sendInterfaces();
    }

    @Override
    public boolean logout() {
	ZarosGodwars.removePlayer(player);
	return false; // so doesnt remove script
    }

    @Override
    public boolean login() {
	ZarosGodwars.addPlayer(player);
	sendInterfaces();
	return false; // so doesnt remove script
    }

    @Override
    public void sendInterfaces() {
	player.getInterfaceManager().setOverlay(601, true);
    }

    @Override
    public boolean sendDeath() {
	remove();
	removeControler();
	return true;
    }

    @Override
    public void magicTeleported(int type) {
	remove();
	removeControler();
    }

    @Override
    public void forceClose() {
	remove();
    }

    public void remove() {
	ZarosGodwars.removePlayer(player);
	player.getPackets().sendGlobalConfig(1435, 255);
	player.getInterfaceManager().setOverlay(601, false);
    }
}
