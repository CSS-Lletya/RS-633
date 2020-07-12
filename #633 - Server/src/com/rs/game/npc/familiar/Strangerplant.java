package com.rs.game.npc.familiar;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.content.Summoning.Pouch;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class Strangerplant extends Familiar {

    private static final long serialVersionUID = 2827958223981739176L;

    private int forageTicks;

    public Strangerplant(Player player, Pouch pouch, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
	super(player, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
	int currentLevel = player.getSkills().getLevelForXp(Skills.FARMING);
	player.getSkills().set(Skills.FARMING, (int) ((1 + (currentLevel * .04)) + currentLevel));
	player.getPackets().sendGameMessage("You feel a sudden urge to plant flowers.");
    }

    @Override
    public void processNPC() {
	super.processNPC();
	forageTicks++;
	if (forageTicks == 750)
	    addStrangeFruit();
    }

    private void addStrangeFruit() {
	getBob().getBeastItems().add(new Item(464, 1));
	forageTicks = 0;
    }

    @Override
    public String getSpecialName() {
	return "Poisonous Blast";
    }

    @Override
    public String getSpecialDescription() {
	return "Attack with 50% chance of poisoning your opponent and inflicting 20 damage";
    }

    @Override
    public int getBOBSize() {
	return 30;
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
	setNextAnimation(new Animation(8211));
	World.sendProjectile(this, target, 1508, 34, 16, 30, 35, 16, 0);
	WorldTasksManager.schedule(new WorldTask() {

	    @Override
	    public void run() {
		target.applyHit(new Hit(getOwner(), Utils.random(20), HitLook.MAGIC_DAMAGE));
		if (Utils.random(1) == 0)
		    target.getPoison().makePoisoned(60);
		target.setNextGraphics(new Graphics(1511));
	    }
	}, 2);
	return true;
    }
}
