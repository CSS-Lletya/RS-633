package com.rs.utils;

import java.util.ArrayList;

import com.rs.game.player.Player;
import com.rs.game.player.content.FriendChatsManager;

public final class DisplayNames {

    private static ArrayList<String> cachedNames;

    private DisplayNames() {

    }

    public static void init() {
	cachedNames = SerializableFilesManager.loadDisplayNames();
    }

    public static void save() {
	SerializableFilesManager.saveDisplayNames(cachedNames);
    }

    public static boolean setDisplayName(Player player, String displayName) {
	synchronized (cachedNames) {
	    if ((SerializableFilesManager.containsPlayer(Utils.formatPlayerNameForProtocol(displayName)) || cachedNames.contains(displayName) || !cachedNames.add(displayName)))
		return false;
	    if (player.hasDisplayName())
		cachedNames.remove(player.getDisplayName());
	}
	player.setDisplayName(displayName);
	FriendChatsManager.refreshChat(player);
	// Highscores.highscores(player, displayname);
	player.getAppearence().generateAppearenceData();
	return true;
    }

    public static boolean removeDisplayName(Player player) {
	if (!player.hasDisplayName())
	    return false;
	synchronized (cachedNames) {
	    cachedNames.remove(player.getDisplayName());
	}
	player.setDisplayName(null);
	player.getAppearence().generateAppearenceData();
	return true;
    }
}
