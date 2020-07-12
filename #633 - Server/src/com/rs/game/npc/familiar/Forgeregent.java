package com.rs.game.npc.familiar;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.player.actions.PlayerCombat;
import com.rs.game.player.content.Summoning.Pouch;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.net.decoders.handlers.ButtonHandler;
import com.rs.utils.Utils;

public class Forgeregent extends Familiar {

    private static final long serialVersionUID = 7925379318994294024L;

    public Forgeregent(Player owner, Pouch pouch, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
	super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
    }

    @Override
    public String getSpecialName() {
	return "Inferno";
    }

    @Override
    public String getSpecialDescription() {
	return "A magical attack that disarms an enemy's weapon or shield.";
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
	setNextAnimation(new Animation(7871));
	setNextGraphics(new Graphics(1394));
	WorldTasksManager.schedule(new WorldTask() {

	    @Override
	    public void run() {
		if (target instanceof Player) {
		    Player playerTarget = (Player) target;
		    int weaponId = playerTarget.getEquipment().getWeaponId();
		    if (weaponId != -1) {
			if (PlayerCombat.getWeaponAttackEmote(weaponId, 1) != 423) {
			    ButtonHandler.sendRemove(playerTarget, 3);
			}
		    }
		    int shieldId = playerTarget.getEquipment().getShieldId();
		    if (shieldId != -1) {
			ButtonHandler.sendRemove(playerTarget, 5);
		    }
		}
		target.setNextGraphics(new Graphics(1393));
		target.applyHit(new Hit(getOwner(), Utils.random(200), HitLook.MELEE_DAMAGE));
	    }
	}, 2);
	return true;
    }
}
