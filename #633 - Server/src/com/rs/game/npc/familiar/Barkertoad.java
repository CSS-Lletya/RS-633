package com.rs.game.npc.familiar;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.player.content.Summoning.Pouch;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class Barkertoad extends Familiar {

    private static final long serialVersionUID = 38784088080860925L;

    public Barkertoad(Player owner, Pouch pouch, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
	super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
    }

    @Override
    public String getSpecialName() {
	return "Toad Bark";
    }

    @Override
    public String getSpecialDescription() {
	return "A magic-based attack that can inflict up to 180 damage on an opponent is unleashed";
    }

    @Override
    public int getBOBSize() {
	return 0;
    }

    @Override
    public int getSpecialAmount() {
	return 6;
    }

    @Override
    public SpecialAttack getSpecialAttack() {
	return SpecialAttack.ENTITY;
    }

    @Override
    public boolean submitSpecial(Object object) {
	final Entity target = (Entity) object;
	getOwner().setNextGraphics(new Graphics(1316));
	getOwner().setNextAnimation(new Animation(7660));
	setNextAnimation(new Animation(7260));
	setNextGraphics(new Graphics(1403));
	WorldTasksManager.schedule(new WorldTask() {

	    @Override
	    public void run() {
		target.applyHit(new Hit(getOwner(), Utils.random(180), HitLook.MAGIC_DAMAGE));
		target.setNextGraphics(new Graphics(1404));
	    }
	}, 2);
	return true;
    }
}
