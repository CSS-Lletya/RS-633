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

public class Giantent extends Familiar {

    private static final long serialVersionUID = -743802297641852412L;

    public Giantent(Player owner, Pouch pouch, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
	super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
    }

    @Override
    public String getSpecialName() {
	return "Acorn Missile";
    }

    @Override
    public String getSpecialDescription() {
	return "Hits all players around a tile radius (not including you) with damage that could inflict up to 187 points.";
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
	Player player = getOwner();
	player.setNextAnimation(new Animation(7858));
	player.setNextGraphics(new Graphics(1316));
	WorldTasksManager.schedule(new WorldTask() {

	    @Override
	    public void run() {
		WorldTasksManager.schedule(new WorldTask() {

		    @Override
		    public void run() {
			target.applyHit(new Hit(getOwner(), Utils.getRandom(150), HitLook.MAGIC_DAMAGE));
			target.setNextGraphics(new Graphics(1363));
		    }
		}, 2);
		World.sendProjectile(npc, target, 1362, 34, 16, 30, 35, 16, 0);
	    }
	}, 1);
	return true;
    }
}
