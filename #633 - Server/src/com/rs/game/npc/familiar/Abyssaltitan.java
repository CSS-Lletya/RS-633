package com.rs.game.npc.familiar;

import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.player.content.Summoning.Pouch;

public class Abyssaltitan extends Familiar {

    /**
	 * 
	 */
    private static final long serialVersionUID = 7635947578932404484L;

    public Abyssaltitan(Player owner, Pouch pouch, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
	super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
    }

    @Override
    public String getSpecialName() {
	return "Essence Shipment";
    }

    @Override
    public String getSpecialDescription() {
	return "Sends all your inventory and beast's essence to your bank.";
    }

    @Override
    public int getBOBSize() {
	return 7;
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
	if (getOwner().getBank().hasBankSpace()) {
	    if (getBob().getBeastItems().getUsedSlots() == 0) {
		getOwner().getPackets().sendGameMessage("Your familiar has no essence to deposit.");
		return false;
	    }
	    getOwner().getBank().depositAllBob(false);
	    getOwner().setNextGraphics(new Graphics(1316));
	    getOwner().setNextAnimation(new Animation(7660));
	    return true;
	}
	return false;
    }
}
