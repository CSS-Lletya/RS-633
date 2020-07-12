package com.rs.game.player.content;

import com.rs.game.Animation;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Smithing;

public class DragonfireShieldCreating {

    public static void joinPieces(Player player) {
	if (!player.getInventory().containsItemToolBelt(Smithing.HAMMER)) {
	    player.getDialogueManager().startDialogue("SimpleMessage", "You need a hammer in order to work with the visage.");
	    return;
	}
	if (player.getSkills().getLevel(Skills.SMITHING) < 90) {
	    player.getDialogueManager().startDialogue("SimpleMessage", "You need a Smithing level of 90 to forge a dragonfire shield.");
	    return;
	}
	if (!player.getInventory().containsItem(1540, 1)) {
	    player.getDialogueManager().startDialogue("SimpleMessage", "You need a anti-dragon shield to forge a dragonfire shield.");
	    return;
	}
	if (!player.getInventory().containsItem(11286, 1)) {
	    player.getDialogueManager().startDialogue("SimpleMessage", "You need a dragonic visage to forge a dragonfire shield.");
	    return;
	}
	player.lock(2);
	player.setNextAnimation(new Animation(898));
	player.getInventory().deleteItem(1540, 1);
	player.getInventory().deleteItem(11286, 1);
	player.getInventory().addItem(11284, 1);
	player.getSkills().addXp(Skills.SMITHING, 2000);
	player.getDialogueManager().startDialogue("SimpleDialogue", "Even for an experienced smith it is not an easy task, but eventually it is done.");
    }

    public static boolean isDragonFireShield(int id) {
	if (id == 1540 || id == 11286)
	    return true;
	return false;
    }
}
