package com.rs.game.npc.familiar;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.player.content.Summoning.Pouch;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class Abyssalparasite extends Familiar {

    private static final long serialVersionUID = 7051216741726595486L;

    public Abyssalparasite(Player owner, Pouch pouch, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
	super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
    }

    @Override
    public String getSpecialName() {
	return "Abyssal drain";
    }

    @Override
    public String getSpecialDescription() {
	return "Lowers an opponent's prayer with a magic attack.";
    }

    @Override
    public int getBOBSize() {
	return 7;
    }

    @Override
    public int getSpecialAmount() {
	return 3;
    }

    @Override
    public SpecialAttack getSpecialAttack() {
	return SpecialAttack.ENTITY;
    }

    @Override
    public boolean submitSpecial(Object object) {
	final Entity target = (Entity) object;
	final int damage = Utils.random(100);
	setNextAnimation(new Animation(7675));
	setNextGraphics(new Graphics(1422));
	World.sendProjectile(this, target, 1423, 34, 16, 30, 35, 16, 0);
	if (target instanceof Player)
	    ((Player) target).getPrayer().drainPrayer(damage / 2);
	WorldTasksManager.schedule(new WorldTask() {

	    @Override
	    public void run() {
		target.applyHit(new Hit(getOwner(), damage, HitLook.MAGIC_DAMAGE));
	    }
	}, 2);
	return false;
    }
}
