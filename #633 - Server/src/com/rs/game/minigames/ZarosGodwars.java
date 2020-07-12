package com.rs.game.minigames;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.rs.cores.CoresManager;
import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.npc.godwars.zaros.Nex;
import com.rs.game.npc.godwars.zaros.Nex.NexPhase;
import com.rs.game.npc.godwars.zaros.NexMinion;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class ZarosGodwars {

    private static final Animation START = new Animation(17412),
	    SECOND_START = new Animation(17413),
	    THIRD_START = new Animation(17414);
    private static WorldTile[] MINION_SPAWNS = { new WorldTile(2913, 5215, 0), new WorldTile(2937, 5215, 0), new WorldTile(2937, 5191, 0), new WorldTile(2913, 5191, 0) };
    private static Graphics[] MINION_GRAPHICS = { new Graphics(3359), new Graphics(3361), new Graphics(3358), new Graphics(3360) };
    public static final int[] STAT_DRAIN = { 0, 1, 2, 4, 6 };
    public static final int[] HIT_SOUNDS = { 3326, 3324, 3320, 3319, 3318, 3315, 3311, 3309, 3305, 3301, 3300, 3297 };
    private static final List<Player> players = new LinkedList<Player>();
    public static Nex nex;

    public static void addPlayer(final Player player) {
	synchronized (players) {
	    players.add(player);
	    if (players.size() == 1)
		start();
	}
    }

    public static void removePlayer(Player player) {
	synchronized (players) {
	    players.remove(player);
	    if (players.size() == 0)
		end();
	}
    }

    public static Entity getRandomNexTarget() {
	synchronized (players) {
	    if (players.isEmpty())
		return null;
	    return players.get(Utils.random(players.size()));
	}
    }

    public static int TASK_UID;

    public static void start() {
	TASK_UID++;
	WorldTasksManager.schedule(new WorldTask() {
	    int stage = 0;

	    @Override
	    public void run() {
		if (players.isEmpty() || (nex != null && nex.getTaskUID() != TASK_UID)) {
		    stop();
		    return;
		}
		if (stage == 0) {
		    World.spawnNPC(13447, new WorldTile(2924, 5202, 0), -1, true, true);
		    sendBeginningAction(NexPhase.values()[stage]);
		} else if (stage < 5) {
		    NexMinion nexMinion = (NexMinion) World.spawnNPC(13450 + stage, MINION_SPAWNS[stage - 1], 0, true, true);
		    nex.setMinion(stage - 1, nexMinion);
		    nexMinion.setNextAnimation(new Animation(17403));
		    nexMinion.setNextGraphics(MINION_GRAPHICS[stage - 1]);
		    sendBeginningAction(NexPhase.values()[stage]);
		} else if (stage == 5)
		    incrementStage(NexPhase.START);
		else if (stage == 6) {
		    stop();
		    nex.start();
		}
		stage++;
	    }
	}, 4, 3);
    }

    public static void end() {
	synchronized (players) {
	    if (nex != null) {
		for (NexMinion minion : nex.nexMinions) {
		    if (minion == null || minion.isDead())
			continue;
		    minion.finish();
		}
		nex.finish();
		nex = null;
	    }
	    if (players.isEmpty())
		return;
	    CoresManager.slowExecutor.schedule(new Runnable() {

		@Override
		public void run() {
		    try {
			if (players.isEmpty() || (nex != null && nex.getTaskUID() != TASK_UID))
			    return;
			start();
		    }
		    catch (Throwable e) {
			e.printStackTrace();
		    }
		}
	    }, 1, TimeUnit.MINUTES);
	}
    }

    public static void incrementStage(final NexPhase lastPhase) {
	NexPhase phase = NexPhase.values()[lastPhase.getPhaseValue() + 1];
	nex.setCurrentPhase(phase);
	nex.setFirstStageAttack(true);
	nex.setNextForceTalk(phase.getMessage());
	nex.playSound(phase.getSecondSound(), 2);
	nex.setCapDamage(500);
	if (lastPhase == NexPhase.SMOKE)
	    nex.removeInfectedPlayers();
	else if (lastPhase == NexPhase.SHADOW)
	    nex.removeShadow();
	if (phase == NexPhase.ZAROS)
	    nex.sendFinalStage();
	if (phase != NexPhase.ZAROS)
	    World.sendProjectile(nex.getMinion(phase.getPhaseValue() - 1), nex, 2244, 18, 18, 60, 30, 0, 0);
    }

    public static void sendBeginningAction(NexPhase phase) {
	nex.setNextForceTalk(new ForceTalk(phase.getMinionName()));
	nex.setNextAnimation((phase == NexPhase.SHADOW || phase == NexPhase.ICE) ? THIRD_START : phase == NexPhase.START ? START : SECOND_START);
	if (phase == NexPhase.START)
	    nex.setNextGraphics(new Graphics(3353));
	nex.playSound(phase.getFirstSound(), 2);
	if (phase.getPhaseValue() == 0)
	    return;
	NexMinion nexMinion = nex.getMinion(phase.getPhaseValue() - 1);
	if (nexMinion != null) {
	    World.sendProjectile(nex, nexMinion, 2244, 18, 18, 60, 30, 0, 0);
	    nexMinion.faceEntity(nex);
	    nexMinion.setCantInteract(false);
	    nex.faceEntity(nexMinion);
	}
    }

    public static List<Player> getPlayers() {
	return players;
    }
}
