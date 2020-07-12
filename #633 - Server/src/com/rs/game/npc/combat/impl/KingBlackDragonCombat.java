package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.game.player.content.Combat;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class KingBlackDragonCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
	return new Object[] { 50 };
    }

    @Override
    public int attack(final NPC npc, final Entity target) {
	final NPCCombatDefinitions defs = npc.getCombatDefinitions();
	int attackStyle = Utils.getRandom(5);
	int size = npc.getSize();
	if (target instanceof Player) {
	    final Player player = (Player) target;
	    if (attackStyle == 0) {
		if (!Utils.isOnRange(npc.getX(), npc.getY(), size, target.getX(), target.getY(), target.getSize(), 0))
		    attackStyle = Utils.getRandom(4) + 1;
		else {
		    delayHit(npc, 0, target, getMeleeHit(npc, getRandomMaxHit(npc, defs.getMaxHit(), NPCCombatDefinitions.MELEE, target)));
		    npc.setNextAnimation(new Animation(defs.getAttackEmote()));
		    return defs.getAttackDelay();
		}
	    } else if (attackStyle == 1 || attackStyle == 2) {
		int damage = 100 + Utils.getRandom(550);
		if (player != null) {
		    boolean hasShield = Combat.hasAntiDragProtection(target);
		    boolean hasPrayer = player.getPrayer().isMageProtecting();
		    boolean hasPot = player.getFireImmune() >= Utils.currentTimeMillis();
		    if (hasPot) {
			damage = Utils.random(100);
			player.getPackets().sendGameMessage("Your potion absorbs most of the dragon's breath!", true);
		    }
		    if (hasPrayer || hasShield) {
			if (damage >= 100) {
			    damage = Utils.random(100);
			    player.getPackets().sendGameMessage("Your " + (hasShield ? "shield" : "prayer") + " absorbs most of the dragon's breath!", true);
			} else
			    damage = 0;
		    } else if (!hasPot)
			player.getPackets().sendGameMessage("You are hit by the dragon's fiery breath!", true);
		}
		npc.setNextGraphics(new Graphics(3441));
		delayHit(npc, 2, target, getRegularHit(npc, damage));
		World.sendProjectile(npc, target, 3442, 20, 16, 30, 35, 16, 0);
		npc.setNextAnimation(new Animation(17786));
		WorldTasksManager.schedule(new WorldTask() {

		    @Override
		    public void run() {
			player.setNextGraphics(new Graphics(3443));
		    }
		}, 2);
	    } else if (attackStyle == 3) {
		int damage;
		if (Combat.hasAntiDragProtection(target)) {
		    damage =  Utils.random(165);
		    sendMessage(player, attackStyle, true, false);
		} else if (hasProtectionPrayer(player)) {
		    damage = Utils.random(165);
		    sendMessage(player, attackStyle, true, true);
		} else {
		    damage = Utils.getRandom(650);
		    sendMessage(player, attackStyle, false, false);
		}
		if (Utils.getRandom(2) == 0)
		    target.getPoison().makePoisoned(80);
		delayHit(npc, 2, target, getRegularHit(npc, damage));
		World.sendProjectile(npc, target, 3436, 34, 16, 30, 35, 16, 0);
		npc.setNextAnimation(new Animation(17785));
		npc.setNextGraphics(new Graphics(3435));
		WorldTasksManager.schedule(new WorldTask() {

		    @Override
		    public void run() {
			target.setNextGraphics(new Graphics(3437));
		    }
		}, 2);
	    } else if (attackStyle == 4) {
		int damage;
		if (Combat.hasAntiDragProtection(target)) {
		    damage =  Utils.random(165);
		    sendMessage(player, attackStyle, true, false);
		} else if (hasProtectionPrayer(player)) {
		    damage = Utils.random(165);
		    sendMessage(player, attackStyle, true, true);
		} else {
		    damage = Utils.getRandom(650);
		    sendMessage(player, attackStyle, false, false);
		}
		if (Utils.getRandom(2) == 0)
		    target.addFreezeDelay(15000);
		delayHit(npc, 2, target, getRegularHit(npc, damage));
		World.sendProjectile(npc, target, 3439, 34, 16, 30, 35, 16, 0);
		npc.setNextGraphics(new Graphics(3438));
		npc.setNextAnimation(new Animation(17783));
		WorldTasksManager.schedule(new WorldTask() {

		    @Override
		    public void run() {
			target.setNextGraphics(new Graphics(3440));
		    }
		}, 2);
	    } else {
		int damage;
		if (Combat.hasAntiDragProtection(target)) {
		    damage =  Utils.random(165);
		    sendMessage(player, attackStyle, true, false);
		} else if (hasProtectionPrayer(player)) {
		    damage = Utils.random(165);
		    sendMessage(player, attackStyle, true, true);
		} else {
		    damage = Utils.getRandom(650);
		    sendMessage(player, attackStyle, false, false);
		}
		delayHit(npc, 2, target, getRegularHit(npc, damage));
		World.sendProjectile(npc, target, 3433, 34, 16, 30, 35, 16, 0);
		npc.setNextGraphics(new Graphics(3432));
		npc.setNextAnimation(new Animation(17784));
		WorldTasksManager.schedule(new WorldTask() {

		    @Override
		    public void run() {
			target.setNextGraphics(new Graphics(3434));
		    }
		}, 2);
	    }
	}
	return defs.getAttackDelay();

    }

    String[] ADVERBS = { "", "fiery", "fiery", "poisonous", "freezing", "shocking" };

    private void sendMessage(Player player, int type, boolean absorbed, boolean prayer) {
	String message;
	if (type == 0)
	    return;
	if (absorbed)
	    message = "Your " + (prayer ? "prayer " : "shield ") + " absorbs most of the dragon's " + ADVERBS[type] + " breath!";
	else
	    message = "You are hit by the dragon's " + ADVERBS[type] + " breath!";
	player.getPackets().sendGameMessage(message, true);
    }

    private boolean hasProtectionPrayer(Player player) {
	return player.getPrayer().usingPrayer(0, 17) || player.getPrayer().usingPrayer(1, 7);
    }
}
