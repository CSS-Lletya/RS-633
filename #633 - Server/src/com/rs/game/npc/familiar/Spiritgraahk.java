package com.rs.game.npc.familiar;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.player.content.Summoning.Pouch;

public class Spiritgraahk extends Familiar {

    private static final long serialVersionUID = 3032896343400261649L;

    public Spiritgraahk(Player owner, Pouch pouch, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
	super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
    }

    @Override
    public String getSpecialName() {
	return "Groad";
    }

    @Override
    public String getSpecialDescription() {
	return "Attack the selected opponent at the cost of 3 special attack points.";
    }

    @Override
    public int getBOBSize() {
	return 0;
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
	Entity entity = (Entity) object;
	if (getAttackedBy() != null) {
	    getOwner().getPackets().sendGameMessage("Your grahaak already has a target in its sights!");
	    return false;
	}
	getOwner().setNextAnimation(new Animation(7660));
	getOwner().setNextGraphics(new Graphics(1316));
	this.getCombat().setTarget(entity);
	return false;
    }
}
