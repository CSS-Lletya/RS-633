package com.rs.game.player.content;

import com.rs.game.Animation;
import com.rs.game.ForceTalk;
import com.rs.game.item.Item;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class SheepShearing {

    public static final Animation SHEARING = new Animation(893);

    public static void shearAttempt(final Player player, final NPC npc) {
	if (!player.getInventory().containsItemToolBelt(1735)) {
	    player.getPackets().sendGameMessage("You need a pair of shears in order to sheer the sheep.");
	    return;
	}
	final boolean isBlack = npc.getId() == 8876;
	player.lock(3);
	npc.addFreezeDelay(3000);
	player.setNextAnimation(SHEARING);
	if (Utils.random(5) != 0) {
	    WorldTasksManager.schedule(new WorldTask() {

		@Override
		public void run() {
		    npc.faceEntity(player);
		    player.getInventory().addItem(new Item(isBlack ? 15415 : 1737, 1));
		    npc.setNextNPCTransformation(isBlack ? 8877 : npc.getId() == 43 ? 42 : 5152);
		    player.getPackets().sendGameMessage("You get some wool.");
		}
	    }, 2);
	} else {
	    player.getPackets().sendGameMessage("The sheep manages to get away from you.");
	    npc.addWalkSteps(player.getX() - 5, player.getX() - 5);
	    if (Utils.random(2) == 0)
		npc.setNextForceTalk(new ForceTalk("Baaa"));
	}
    }
}
