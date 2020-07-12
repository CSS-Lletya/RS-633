package com.rs.game.minigames;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TimerTask;

import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.content.Foods.Food;

@SuppressWarnings("unchecked")
public class SoulWars {

    private static final List<Player>[] waiting = new LinkedList[2];
    private static final List<Player>[] playing = new LinkedList[2];
    private static final int RED = 0, BLUE = 1, GREEN = 2;

    private static PlayingGame playingGame;

    static {
	init();
    }

    public static void init() {
	for (int i = 0; i < waiting.length; i++)
	    waiting[i] = Collections.synchronizedList(new LinkedList<Player>());
	for (int i = 0; i < playing.length; i++)
	    playing[i] = Collections.synchronizedList(new LinkedList<Player>());
    }

    public class PlayingGame extends TimerTask {

	@Override
	public void run() {

	}
    }

    public class LobbyGame extends TimerTask {

	@Override
	public void run() {

	}
    }

    public static void passBarrier(Player player, int team) {// sarah 0, zammy
							     // 1, guthix 2
	if (player.getEquipment().getCapeId() != -1) {
	    player.getPackets().sendGameMessage("You cannot bring a cape into the arena.");
	    return;
	}
	for (Item item : player.getInventory().getItems().getItems()) {
	    if (item == null)
		continue;
	    if (Food.forId(item.getId()) != null) {
		player.getPackets().sendGameMessage("You cannot bring food into the arena.");
		return;
	    }
	}
	player.lock(2);
	player.stopAll();
	waiting[team].add(player);
	// player.setNextWorldTile(new WorldTile(team == ZAMORAK ? ZAMO_WAITING
	// : SARA_WAITING, 1));
	player.getMusicsManager().playMusic(318);
	// if (playingGame == null && waiting[team].size() >= 3)
	// createPlayingGame();
	// else
	// refreshTimeLeft(player);
    }

    public static int getStrongestTeam() {
	int blue = waiting[RED].size() + playing[RED].size();
	int red = waiting[BLUE].size() + playing[BLUE].size();
	if (red == blue)
	    return GREEN;
	if (blue > red)
	    return RED;
	return BLUE;
    }
}
