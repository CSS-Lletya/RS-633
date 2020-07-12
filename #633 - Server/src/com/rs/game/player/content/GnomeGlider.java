package com.rs.game.player.content;

import com.rs.game.WorldTile;
import com.rs.game.player.Player;

public class GnomeGlider {

    private static final int GLIDER_INTEFACE = 138;
    private static final WorldTile[] GLIDERS = { new WorldTile(2464, 3503, 3), new WorldTile(2845, 3501, 0), new WorldTile(3322, 3431, 0), new WorldTile(3284, 3213, 0), new WorldTile(2973, 2969, 0), new WorldTile(2545, 2972, 0) };
    private static final long[] DELAY = { 1, 1, 2, 2, 2, 1 };
    private static final int[][] CONFIGS = { { -1, 1, 3, 4, 7, 10 }, { -1, 2, -1, 5, 6, 11 } };

    public static void openInterface(Player player, int index) {
	if (index != 0)
	    sendGlider(player, index, true);
	player.getInterfaceManager().sendInterface(GLIDER_INTEFACE);
    }

    public static void sendGlider(final Player player, final int index, final boolean isReturning) {
	player.getVarsManager().sendVar(153, CONFIGS[isReturning ? 1 : 0][index]);
	player.getTemporaryAttributtes().put("using_carrier", true);
	FadingScreen.fade(player, DELAY[index] + 1, new Runnable() {

	    @Override
	    public void run() {
		int delay = (int) DELAY[index];
		player.useStairs(-1, GLIDERS[isReturning ? 0 : index], delay - 1, delay + 1);
		player.closeInterfaces();
		player.getTemporaryAttributtes().remove("using_carrier");
		player.getVarsManager().sendVar(153, 0);
	    }
	});
    }
}
