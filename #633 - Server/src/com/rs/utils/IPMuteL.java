package com.rs.utils;

import java.util.concurrent.CopyOnWriteArrayList;

import com.rs.game.player.Player;

public class IPMuteL {

    public static CopyOnWriteArrayList<String> ipList;

    private static boolean edited;

    public static void init() {
	ipList = SerializableFilesManager.loadIPMutes();
    }

    public static final void save() {
	if (!edited)
	    return;
	SerializableFilesManager.saveIPMutes(ipList);
	edited = false;
    }

    public static boolean isMuted(String ip) {
	return ipList.contains(ip);
    }

    public static void mute(Player player, boolean loggedIn) {
	if (loggedIn)
	    ipList.add(player.getSession().getIP());
	else {
	    ipList.add(player.getLastIP());
	    SerializableFilesManager.savePlayer(player);
	}
	edited = true;
    }

    public static void unmute(Player player) {
	ipList.remove(player.getLastIP());
	edited = true;
	save();
    }

    public static CopyOnWriteArrayList<String> getList() {
	return ipList;
    }
}
