package com.rs.game.npc.familiar;

import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.player.content.Summoning.Pouch;

public class Hydra extends Familiar {

    private static final long serialVersionUID = -3444038441050159955L;

    public Hydra(Player owner, Pouch pouch, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
	super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
    }

    @Override
    public String getSpecialName() {
	return "Regrowth";
    }

    @Override
    public String getSpecialDescription() {
	return "Automatically regrows the associated tree without delay.";
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
	return SpecialAttack.CLICK;
    }

    @Override
    public boolean submitSpecial(Object object) {
	Player player = (Player) object;
	setNextGraphics(new Graphics(1487));
	setNextAnimation(new Animation(7939));
	player.getFarmingManager().resetTreeTrunks();
	return false;
    }
}
