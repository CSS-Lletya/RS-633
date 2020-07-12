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

public class Vampirebat extends Familiar {

    /**
	 * 
	 */
    private static final long serialVersionUID = 586089784797828590L;

    public Vampirebat(Player owner, Pouch pouch, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
	super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
    }

    @Override
    public String getSpecialName() {
	return "Vampyre Touch";
    }

    @Override
    public String getSpecialDescription() {
	return "Deals damage to your opponents, with a maximum hit of 120. It also has a chance of healing your lifepoints by 20.";
    }

    @Override
    public int getBOBSize() {
	return 0;
    }

    @Override
    public int getSpecialAmount() {
	return 4;
    }

    @Override
    public SpecialAttack getSpecialAttack() {
	return SpecialAttack.ENTITY;
    }

    @Override
    public boolean submitSpecial(Object object) {
	Player player = getOwner();
	player.setNextGraphics(new Graphics(1316));
	player.setNextAnimation(new Animation(7660));
	setNextAnimation(new Animation(8275));
	setNextGraphics(new Graphics(1323));
	final Entity target = (Entity) object;
	WorldTasksManager.schedule(new WorldTask() {

	    @Override
	    public void run() {
		target.applyHit(new Hit(getOwner(), Utils.random(130), HitLook.MAGIC_DAMAGE));
	    }
	}, 1);
	return false;
    }
}
