package com.rs.game.npc.familiar;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.content.Summoning.Pouch;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class Spiritlarupia extends Familiar {

    private static final long serialVersionUID = 3060058918310360114L;

    public Spiritlarupia(Player owner, Pouch pouch, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
	super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
    }

    @Override
    public String getSpecialName() {
	return "Rending";
    }

    @Override
    public String getSpecialDescription() {
	return "Attacks the player's opponent with a magic attack, and also drains opponent's Strength. ";
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
	Player player = getOwner();
	final int damage = Utils.getRandom(107);
	setNextGraphics(new Graphics(1370));
	setNextAnimation(new Animation(7919));
	player.setNextAnimation(new Animation(7660));
	player.setNextGraphics(new Graphics(1316));
	World.sendProjectile(this, target, 1371, 34, 16, 30, 35, 16, 0);
	if (damage > 20)
	    if (target instanceof Player)
		((Player) target).getSkills().set(Skills.STRENGTH, ((Player) target).getSkills().getLevel(Skills.STRENGTH) - (damage / 20));
	WorldTasksManager.schedule(new WorldTask() {

	    @Override
	    public void run() {
		target.applyHit(new Hit(getOwner(), damage, HitLook.MAGIC_DAMAGE));
	    }
	}, 2);
	return true;
    }
}
