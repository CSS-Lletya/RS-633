package com.rs.game.npc.familiar;

import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.content.Summoning.Pouch;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public class Abyssallurker extends Familiar {

    private static final long serialVersionUID = -6066778023905647435L;

    public Abyssallurker(Player owner, Pouch pouch, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
	super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
    }

    @Override
    public String getSpecialName() {
	return "Abyssal Stealth";
    }

    @Override
    public String getSpecialDescription() {
	return "Temporarily increases a player's Agility and Thieving by 4 levels.";
    }

    @Override
    public int getBOBSize() {
	return 7;
    }

    @Override
    public int getSpecialAmount() {
	return 3;
    }

    @Override
    public SpecialAttack getSpecialAttack() {
	return SpecialAttack.CLICK;
    }

    @Override
    public boolean submitSpecial(Object object) {
	final Player player = (Player) object;
	int newTheiving = player.getSkills().getLevel(Skills.THIEVING) + 4;
	if (newTheiving > player.getSkills().getLevelForXp(Skills.THIEVING) + 4)
	    newTheiving = player.getSkills().getLevelForXp(Skills.THIEVING) + 4;
	int newAgility = player.getSkills().getLevel(Skills.AGILITY) + 4;
	if (newAgility > player.getSkills().getLevelForXp(Skills.AGILITY) + 4)
	    newAgility = player.getSkills().getLevelForXp(Skills.AGILITY) + 4;
	setNextGraphics(new Graphics(1336));
	setNextAnimation(new Animation(7682));
	player.setNextAnimation(new Animation(7660));
	WorldTasksManager.schedule(new WorldTask() {

	    @Override
	    public void run() {
		player.setNextGraphics(new Graphics(1300));
	    }
	}, 3);
	player.getSkills().set(Skills.THIEVING, newTheiving);
	player.getSkills().set(Skills.AGILITY, newAgility);
	return false;
    }
}
