package com.rs.game.player.content;

import com.rs.game.Animation;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Smithing;

public class SpiritshieldCreating {

	public static final int SPIRIT_SHIELD = 13734, HOLY_ELIXIR = 13754,
			BLESSED_SPIRIT_SHIELD = 13736;

	private static final int[] SIGILGS = new int[] { 13746, 13748, 13750, 13752 };

	public static boolean isSigil(int itemId) {
		for (int item : SIGILGS)
			if (item == itemId)
				return true;
		return false;
	}

	public static void attachShield(Player player, Item sigil, boolean smith) {
		if (!player.getInventory().containsItem(BLESSED_SPIRIT_SHIELD, 1)) {
			player.getPackets().sendGameMessage(
					"You need a spirit shield to attach sigil to it.");
			return;
		}
		if (!smith) {
			if (player.getInventory().getCoinsAmount() < 1500000) {
				player.getPackets()
						.sendGameMessage(
								"Brother Bordiss wants 1.5m to attach sigil to the blessed spirit shield.");
				return;
			}
			player.getInventory().deleteItem(new Item(995, 1500000));
		} else {
			if (!player.getInventory().containsItemToolBelt(Smithing.HAMMER)) {
				player.getDialogueManager()
						.startDialogue("SimpleMessage",
								"You need a hammer in order to work with spirit shields.");
				return;
			}
			if (player.getSkills().getLevel(Skills.SMITHING) < 85) {
				player.getDialogueManager()
						.startDialogue("SimpleMessage",
								"You need a Smithing level of 85 to attach sigil to the blessed spirit shield.");
				return;
			}
			if (player.getSkills().getLevel(Skills.PRAYER) < 90) {
				player.getPackets()
						.sendGameMessage(
								"You need 90 prayer to to attach sigil to the blessed spirit shield.");
				return;
			}
			player.setNextAnimation(new Animation(898));
		}
		player.lock(2);
		int shield = (sigil.getId() - 13746) / 2;
		player.getInventory().deleteItem(BLESSED_SPIRIT_SHIELD, 1);
		player.getInventory().deleteItem(sigil);
		player.getInventory().addItem(13738 + shield * 2, 1);
		player.getDialogueManager()
				.startDialogue(
						"SimpleMessage",
						(smith ? "You" : "Brother Bordiss")
								+ " succesfuly attach the sigil to the blessed spirit shield.");

	}

	public static void blessShield(Player player, boolean altar) {
		if (!player.getInventory().containsItem(HOLY_ELIXIR, 1)
				|| !player.getInventory().containsItem(SPIRIT_SHIELD, 1)) {
			player.getPackets().sendGameMessage(
					"You need a spirit shield and a holy elixir to bless it.");
			return;
		}
		if (!altar) {
			if (player.getInventory().getCoinsAmount() < 1000000) {
				player.getPackets().sendGameMessage(
						"Brother Jered wants 1m to bless the spirit shield.");
				return;
			}
			player.getInventory().deleteItem(new Item(995, 1000000));
		} else {
			if (player.getSkills().getLevel(Skills.PRAYER) < 85) {
				player.getPackets().sendGameMessage(
						"You need 85 prayer to bless the spirit shield.");
				return;
			}
		}
		player.lock(2);
		player.getInventory().deleteItem(SPIRIT_SHIELD, 1);
		player.getInventory().deleteItem(HOLY_ELIXIR, 1);
		player.getInventory().addItem(BLESSED_SPIRIT_SHIELD, 1);
		player.getDialogueManager()
				.startDialogue(
						"SimpleMessage",
						(altar ? "You" : "Brother Jered")
								+ " succesfully bless the shield using the holy elixir and the powers of Saradomin.");

	}

}
