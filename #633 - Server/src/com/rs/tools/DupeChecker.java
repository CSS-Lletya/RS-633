package com.rs.tools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.rs.Settings;
import com.rs.cache.Cache;
import com.rs.game.item.Item;
import com.rs.game.item.ItemsContainer;
import com.rs.game.player.Player;
import com.rs.game.player.content.grandExchange.GrandExchange;
import com.rs.utils.SerializableFilesManager;

public class DupeChecker {

	public static void main(String[] args) throws Throwable {
		Settings.HOSTED = true;
		Cache.init(); // needed for ge
		GrandExchange.init(); // load prices

		long check_amount = args.length > 0 ? Long.parseLong(args[0])
				: 2000000000L;

		BufferedWriter suspects = new BufferedWriter(new FileWriter(new File(
				"suspected_dupers.txt")));

		String[] players = SerializableFilesManager.getAllPlayers();
		for (String p : players) {
			String acc = p.replace("characters/", "").replace(".p", "");
			Player player = SerializableFilesManager.loadPlayer(acc);
			if (player == null
					|| player.getEconomyVersion() != Settings.ECONOMY_VERSION)
				continue;

			long value = calculateValue(player);
			System.out.println(acc + " is worth " + value + " gp.");

			if (value >= check_amount) {
				suspects.write(acc + " is worth " + value + " gp.\r\n");
				suspects.flush();
			}
		}

		suspects.close();

	}

	@SuppressWarnings("unchecked")
	public static long calculateValue(Player player) {
		long total = 0;

		total += player.getInventory().getCoinsAmount();

		ItemsContainer<Item>[] containers = (ItemsContainer<Item>[]) new ItemsContainer[3];
		containers[0] = player.getInventory().getItems();
		containers[1] = player.getEquipment().getItems();
		if (player.getFamiliar() != null
				&& player.getFamiliar().getBob() != null)
			containers[2] = player.getFamiliar().getBob().getBeastItems();

		for (int i = 0; i < containers.length; i++) {
			ItemsContainer<Item> container = containers[i];
			if (container == null)
				continue;

			for (int a = 0; a < container.getItems().length; a++) {
				Item item = container.getItems()[a];
				if (item == null)
					continue;

				long price = GrandExchange.getPrice(item.getId());
				if (price == 0)
					price = 1;
				else if (price < 0)
					price = Integer.MAX_VALUE;
				price *= item.getAmount();
				if (price < 0)
					price = Long.MAX_VALUE;

				total += price;
				if (total < 0) {
					// oh god, we had long overflow, that person must have
					// really big dupe bank if he more than 2^63 coins worth
					return Long.MAX_VALUE;
				}
			}
		}

		Item[] bank = player.getBank().generateContainer();
		for (int a = 0; a < bank.length; a++) {
			Item item = bank[a];
			if (item == null)
				continue;

			long price = GrandExchange.getPrice(item.getId());
			if (price == 0)
				price = 1;
			else if (price < 0)
				price = Integer.MAX_VALUE;
			price *= item.getAmount();
			if (price < 0)
				price = Long.MAX_VALUE;

			total += price;
			if (total < 0) {
				// oh god, we had long overflow, that person must have really
				// big dupe bank if he more than 2^63 coins worth
				return Long.MAX_VALUE;
			}
		}

		return total;
	}
}