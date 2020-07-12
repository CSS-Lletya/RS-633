package com.rs.game.npc.familiar;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.player.content.Summoning.Pouch;
import com.rs.utils.Utils;

public class Smokedevil extends Familiar {

    private static final long serialVersionUID = -2734031002616044128L;

    public Smokedevil(Player owner, Pouch pouch, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
	super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
    }

    @Override
    public String getSpecialName() {
	return "Dust Cloud";
    }

    @Override
    public String getSpecialDescription() {
	return "Hit up to 80 damage to all people within 1 square of you.";
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
	getOwner().setNextGraphics(new Graphics(1316));
	getOwner().setNextAnimation(new Animation(7660));
	setNextAnimation(new Animation(7820));
	setNextGraphics(new Graphics(1470));
	for (Entity entity : this.getPossibleTargets()) {
	    if (entity == null || entity == getOwner() || !entity.withinDistance(this, 1))
		continue;
	    entity.applyHit(new Hit(this, Utils.random(80), HitLook.MAGIC_DAMAGE));
	}
	return true;
    }
}
