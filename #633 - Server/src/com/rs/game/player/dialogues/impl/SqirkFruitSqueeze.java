package com.rs.game.player.dialogues.impl;

import com.rs.game.player.Skills;
import com.rs.game.player.actions.Herblore;
import com.rs.game.player.dialogues.Dialogue;

public class SqirkFruitSqueeze extends Dialogue {

    public static final int BEER_GLASS = 1919;

    public static enum SqirkFruit {
	WINTER(10847, 5, 10851), SPRING(10844, 4, 10848), AUTUMM(10846, 3, 10850), SUMMER(10845, 2, 10849);

	private int fruitId, amtRequired, resultId;

	private SqirkFruit(int fruitId, int amtRequired, int resultId) {
	    this.fruitId = fruitId;
	    this.amtRequired = amtRequired;
	    this.resultId = resultId;
	}

	public int getFruitId() {
	    return fruitId;
	}
    }

    private SqirkFruit fruit;

    @Override
    public void start() {
	fruit = (SqirkFruit) parameters[0];
	if (!player.getInventory().containsItem(BEER_GLASS, 1)) {
	    sendItemDialogue(BEER_GLASS, "I should get an empty beer glass to hold the juice before I squeeze the fruit.");
	    stage = -2;
	} else if (!player.getInventory().containsItemToolBelt(Herblore.PESTLE_AND_MORTAR)) {
	    sendItemDialogue(BEER_GLASS, "I should get a pestle and mortal before I squeeze the fruit.");
	    stage = -2;
	} else if (!player.getInventory().containsItem(fruit.fruitId, fruit.amtRequired))
	    sendPlayerDialogue(9827, "I think I should wait until I have enough fruit to make a full glass.");
	else {
	    player.getInventory().deleteItem(fruit.fruitId, fruit.amtRequired);
	    player.getInventory().deleteItem(BEER_GLASS, 1);
	    player.getInventory().addItem(fruit.resultId, 1);
	    player.getSkills().addXp(Skills.HERBLORE, 5);
	    sendItemDialogue(BEER_GLASS, "You squeeze " + fruit.amtRequired + " sq'irks into an empty glass.");
	    stage = -2;
	}
    }

    @Override
    public void run(int interfaceId, int componentId) {
	switch (stage) {
	    case -1:
		stage = -2;
		sendItemDialogue(fruit.fruitId, "You need " + fruit.amtRequired + " sq'irks to fill a glass of juice.");
		break;
	    default:
		end();
		break;
	}

    }

    @Override
    public void finish() {
	// TODO Auto-generated method stub

    }

}
