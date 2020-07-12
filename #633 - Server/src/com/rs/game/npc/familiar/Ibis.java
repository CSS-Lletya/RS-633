package com.rs.game.npc.familiar;

import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Fishing;
import com.rs.game.player.content.Summoning.Pouch;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class Ibis extends Familiar {

    private static final long serialVersionUID = -1499396381299006274L;
    private int forageTicks;

    public Ibis(Player owner, Pouch pouch, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
	super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
    }

    @Override
    public void processNPC() {
	super.processNPC();
	boolean isFishing = getOwner().getActionManager().getAction() != null && getOwner().getActionManager().getAction() instanceof Fishing;
	if (isFishing) {
	    forageTicks++;
	    if (forageTicks == 300)
		giveReward();
	}
    }

    private void giveReward() {
	boolean isSwordFish = Utils.random(3) == 0;
	int foragedItem = isSwordFish ? 371 : 359;
	if (isSwordFish)
	    getOwner().getSkills().addXp(Skills.FISHING, 10);
	getBob().getBeastItems().add(new Item(foragedItem, 1));
	forageTicks = 0;
    }

    @Override
    public String getSpecialName() {
	return "Fish rain";
    }

    @Override
    public String getSpecialDescription() {
	return "Makes fish (raw shrimp, bass, cod, and mackerel) fall out of the sky.";
    }

    @Override
    public int getBOBSize() {
	return 10;
    }

    @Override
    public int getSpecialAmount() {
	return 12;
    }

    @Override
    public SpecialAttack getSpecialAttack() {
	return SpecialAttack.CLICK;
    }

    @Override
    public boolean submitSpecial(Object object) {
	final Player player = (Player) object;
	getOwner().setNextGraphics(new Graphics(1300));
	getOwner().setNextAnimation(new Animation(7660));
	setNextAnimation(new Animation(8201));
	final WorldTile firstTile = new WorldTile(player.getX() + 1, player.getY() + 1, player.getPlane());
	final WorldTile secondTile = new WorldTile(player.getX() - 1, player.getY() - 1, player.getPlane());
	World.sendGraphics(player, new Graphics(1337), firstTile);
	World.sendGraphics(player, new Graphics(1337), secondTile);
	WorldTasksManager.schedule(new WorldTask() {

	    @Override
	    public void run() {
		World.addGroundItem(new Item(1, 1), firstTile, player, true, 180);
		World.addGroundItem(new Item(1, 1), secondTile, player, true, 180);
	    }
	}, 2);
	return true;
    }
}
