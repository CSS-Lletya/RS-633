package com.rs.utils;

import java.util.concurrent.CopyOnWriteArrayList;

import com.rs.game.player.Player;

public final class IPBanL {

    public static CopyOnWriteArrayList<String> ipList;

    private static boolean edited;

    public static void init() {
	ipList = SerializableFilesManager.loadIPBans();
    }

    public static final void save() {
	if (!edited)
	    return;
	SerializableFilesManager.saveIPBans(ipList);
	edited = false;
    }

    public static boolean isBanned(String ip) {
	return ipList.contains(ip);
    }

    public static void ban(Player player, boolean loggedIn) {
	player.setPermBanned(true);
	if (loggedIn) {
	    ipList.add(player.getSession().getIP());
	    player.getSession().getChannel().disconnect();
	} else {
	    ipList.add(player.getLastIP());
	    SerializableFilesManager.savePlayer(player);
	}
	edited = true;
    }

    public static void unban(Player player) {
	player.setPermBanned(false);
	player.setBanned(0);
	ipList.remove(player.getLastIP());
	edited = true;
	save();
    }

    public static CopyOnWriteArrayList<String> getList() {
	return ipList;
    }

}
