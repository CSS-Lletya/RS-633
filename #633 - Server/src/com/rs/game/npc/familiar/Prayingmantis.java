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

public class Prayingmantis extends Familiar {

    private static final long serialVersionUID = -2129621856723157961L;

    public Prayingmantis(Player owner, Pouch pouch, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
	super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
    }

    @Override
    public String getSpecialName() {
	return "Mantis Strike";
    }

    @Override
    public String getSpecialDescription() {
	return "Uses a magic based attack (max hit 170) which always drains the opponent's prayer and binds if it deals any damage.";
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
	setNextAnimation(new Animation(8071));
	setNextGraphics(new Graphics(1422));
	final int hitDamage = Utils.random(170);
	if (hitDamage > 0) {
	    if (target instanceof Player)
		((Player) target).getPrayer().drainPrayer(hitDamage);
	}
	WorldTasksManager.schedule(new WorldTask() {

	    @Override
	    public void run() {
		target.setNextGraphics(new Graphics(1423));
		target.applyHit(new Hit(getOwner(), hitDamage, HitLook.MAGIC_DAMAGE));
	    }
	}, 2);
	return true;
    }
}
