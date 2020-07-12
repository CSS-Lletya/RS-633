package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class EcoTestDialog extends Dialogue {

    private int step = 0;

    @Override
    public void start() {
	if (((Boolean) parameters[0]).booleanValue()) {
	    step = 3;
	}
	runStep();
    }

    private void runStep() {
	if (step == 0) {
	    this.sendPlayerDialogue(9760, "Hello");
	} else if (step == 1) {
	    this.sendEntityDialogue(Dialogue.IS_NPC, "Suspicious merchant", 1282, 9770, "Psst! Be quiet!", "I can sell you forbidden goods, want some?");
	} else if (step == 2) {
	    this.sendOptionsDialogue("Do you want to buy some goods?", "Yes", "No");
	} else if (step == 3) {
	    this.sendOptionsDialogue("Select shop", "Melee", "Ranged", "Magic", "Food & Potions", "Next");
	} else if (step == 4) {
	    this.sendOptionsDialogue("Select shop", "Rings & Amulets & Gloves", "Capes", "Skilling items 1", "Skilling items 2", "Vote items");
	}
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (step < 2) {
	    step++;
	    runStep();
	} else if (step == 2) {
	    if (componentId == Dialogue.OPTION_1) {
		step++;
		runStep();
	    } else {
		end();
	    }
	} else if (step == 3) {
	    int option = -1;
	    if (componentId == Dialogue.OPTION_1)
		option = 1;
	    else if (componentId == Dialogue.OPTION_2)
		option = 2;
	    else if (componentId == Dialogue.OPTION_3)
		option = 3;
	    else if (componentId == Dialogue.OPTION_4)
		option = 4;
	    else if (componentId == Dialogue.OPTION_5)
		option = 5;

	    if (option != -1 && option < 5) {
		end();
		ShopsHandler.openShop(player, 100 + option);
	    } else if (option == 5) {
		step++;
		runStep();
	    } else {
		end();
	    }
	} else if (step == 4) {
	    int option = -1;
	    if (componentId == Dialogue.OPTION_1)
		option = 1;
	    else if (componentId == Dialogue.OPTION_2)
		option = 2;
	    else if (componentId == Dialogue.OPTION_3)
		option = 3;
	    else if (componentId == Dialogue.OPTION_4)
		option = 4;
	    else if (componentId == Dialogue.OPTION_5)
		option = 5;

	    end();
	    if (option != -1) {
		ShopsHandler.openShop(player, 104 + option);
	    }
	}
    }

    @Override
    public void finish() {
    }

}
