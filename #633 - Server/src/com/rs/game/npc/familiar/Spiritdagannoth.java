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

public class Spiritdagannoth extends Familiar {

    private static final long serialVersionUID = -494712406261011797L;

    public Spiritdagannoth(Player owner, Pouch pouch, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
	super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
    }

    @Override
    public String getSpecialName() {
	return "Spike Shot";
    }

    @Override
    public String getSpecialDescription() {
	return "Inflicts damage to your target from up to 180 hitpoints.";
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
	final Familiar npc = this;
	getOwner().setNextGraphics(new Graphics(1316));
	getOwner().setNextAnimation(new Animation(7660));
	setNextAnimation(new Animation(7787));
	setNextGraphics(new Graphics(1467));
	WorldTasksManager.schedule(new WorldTask() {

	    @Override
	    public void run() {
		WorldTasksManager.schedule(new WorldTask() {

		    @Override
		    public void run() {
			int hitDamage = Utils.random(180);
			if (hitDamage > 0) {
			    if (target instanceof Player)
				((Player) target).lock(6);
			    else
				target.addFreezeDelay(6000);
			}
			target.applyHit(new Hit(getOwner(), hitDamage, HitLook.MAGIC_DAMAGE));
			target.setNextGraphics(new Graphics(1428));
		    }
		}, 2);
		World.sendProjectile(npc, target, 1426, 34, 16, 30, 35, 16, 0);
	    }
	});
	return true;
    }
}
