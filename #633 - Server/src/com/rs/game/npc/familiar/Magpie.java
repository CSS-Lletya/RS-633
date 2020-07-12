package com.rs.game.npc.familiar;

import com.rs.game.Animation;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.content.Summoning.Pouch;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class Magpie extends Familiar {

    private static final int[] RANDOM_ITEMS = { 1617, 1619, 1621, 1623, 1625, 1627, 1629, 1631, 1635, 1637, 1639, 1641, 1643, 1645, 2552, 2568, 2572, 2570, 2550 };

    private static final long serialVersionUID = 1124069837190223150L;
    private int theivingTicks;

    public Magpie(Player owner, Pouch pouch, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
	super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
    }

    @Override
    public void processNPC() {
	super.processNPC();
	if (!getWalkSteps().isEmpty())
	    theivingTicks += 2;
	else
	    theivingTicks++;
	if (theivingTicks == 30) {
	    getBob().getBeastItems().add(new Item(RANDOM_ITEMS[Utils.random(RANDOM_ITEMS.length)], 1));
	    theivingTicks = 0;
	} else if (theivingTicks % 50 == 0)
	    setNextForceTalk(new ForceTalk("*Tweet*"));
    }

    @Override
    public String getSpecialName() {
	return "Thieving Fingers";
    }

    @Override
    public String getSpecialDescription() {
	return "Increases theiving level by two.";
    }

    @Override
    public int getBOBSize() {
	return 30;
    }

    @Override
    public int getSpecialAmount() {
	return 5;
    }

    @Override
    public SpecialAttack getSpecialAttack() {
	return SpecialAttack.CLICK;
    }

    @Override
    public boolean submitSpecial(Object object) {
	final Player player = (Player) object;
	int newLevel = player.getSkills().getLevel(Skills.THIEVING) + 2;
	if (newLevel > player.getSkills().getLevelForXp(Skills.THIEVING) + 2)
	    newLevel = player.getSkills().getLevelForXp(Skills.THIEVING) + 2;
	setNextGraphics(new Graphics(1336));
	setNextAnimation(new Animation(8020));
	player.setNextAnimation(new Animation(7660));
	WorldTasksManager.schedule(new WorldTask() {

	    @Override
	    public void run() {
		player.setNextGraphics(new Graphics(1300));
	    }
	}, 3);
	player.getSkills().set(Skills.THIEVING, newLevel);
	return true;
    }
}
