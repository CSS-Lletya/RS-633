package com.rs;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import com.alex.store.Index;
import com.rs.cache.Cache;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.cache.loaders.ObjectDefinitions;
import com.rs.cores.CoresManager;
import com.rs.game.Region;
import com.rs.game.World;
import com.rs.game.map.MapBuilder;
import com.rs.game.npc.combat.CombatScriptsHandler;
import com.rs.game.player.Player;
import com.rs.game.player.content.FishingSpotsHandler;
import com.rs.game.player.content.FriendChatsManager;
import com.rs.game.player.content.clans.ClansManager;
import com.rs.game.player.content.grandExchange.GrandExchange;
import com.rs.game.player.controllers.ControlerHandler;
import com.rs.game.player.cutscenes.CutscenesHandler;
import com.rs.game.player.dialogues.DialogueHandler;
import com.rs.net.ServerChannelHandler;
import com.rs.script.ScriptLoader;
import com.rs.utils.AttackSpeeds;
import com.rs.utils.Censor;
import com.rs.utils.DTRank;
import com.rs.utils.DisplayNames;
import com.rs.utils.EquipData;
import com.rs.utils.IPBanL;
import com.rs.utils.IPMuteL;
import com.rs.utils.ItemBonuses;
import com.rs.utils.ItemDestroys;
import com.rs.utils.ItemExamines;
import com.rs.utils.ItemSpawns;
import com.rs.utils.Logger;
import com.rs.utils.MapArchiveKeys;
import com.rs.utils.MapAreas;
import com.rs.utils.MusicHints;
import com.rs.utils.NPCBonuses;
import com.rs.utils.NPCCombatDefinitionsL;
import com.rs.utils.NPCDrops;
import com.rs.utils.NPCSpawns;
import com.rs.utils.ObjectSpawns;
import com.rs.utils.PkRank;
import com.rs.utils.SerializableFilesManager;
import com.rs.utils.ShopsHandler;
import com.rs.utils.Utils;
import com.rs.utils.huffman.Huffman;
import com.webrs.responder.Responder;

public class Launcher {

	public static void main(String[] args) throws Exception {
		if (args.length < 3) {
			System.out
					.println("USE: guimode(boolean) debug(boolean) hosted(boolean)");
			return;
		}
		Settings.HOSTED = Boolean.parseBoolean(args[2]);
		Settings.DEBUG = Boolean.parseBoolean(args[1]);
		long currentTime = Utils.currentTimeMillis();
		Logger.log("Launcher", "Initing Cache...");
		Cache.init();
		Huffman.init();
		Logger.log("Launcher", "Initing scripts...");
		ScriptLoader.init();
		Logger.log("Launcher", "Initing Data Files...");
		EquipData.init();
		AttackSpeeds.init();
		ItemBonuses.init();
		Censor.init();
		DisplayNames.init();
		IPBanL.init();
		IPMuteL.init();
		PkRank.init();
		DTRank.init();
		MapArchiveKeys.init();
		MapAreas.init();
		ObjectSpawns.init();
		NPCSpawns.init();
		NPCCombatDefinitionsL.init();
		NPCBonuses.init();
		NPCDrops.init();
		// NPCExamines.init();
		ItemExamines.init();
		ItemDestroys.init();
		ItemSpawns.init();
		MusicHints.init();
		ShopsHandler.init();
		GrandExchange.init();
		Logger.log("Launcher", "Initing Controlers...");
		ControlerHandler.init();
		Logger.log("Launcher", "Initing Fishing Spots...");
		FishingSpotsHandler.init();
		Logger.log("Launcher", "Initing NPC Combat Scripts...");
		CombatScriptsHandler.init();
		Logger.log("Launcher", "Initing Dialogues...");
		DialogueHandler.init();
		Logger.log("Launcher", "Initing Cutscenes...");
		CutscenesHandler.init();
		Logger.log("Launcher", "Initing Friend Chats Manager...");
		FriendChatsManager.init();
		Logger.log("Launcher", "Initing Clans Manager...");
		ClansManager.init();
		Logger.log("Launcher", "Initing Cores Manager...");
		CoresManager.init();
		Logger.log("Launcher", "Initing World...");
		World.init();
		Logger.log("Launcher", "Initing Region Builder...");
		MapBuilder.init();
		Logger.log("Launcher", "Initing Server Channel Handler...");
		try {
			ServerChannelHandler.init();
		} catch (Throwable e) {
			Logger.handle(e);
			Logger.log("Launcher",
					"Failed initing Server Channel Handler. Shutting down...");
			System.exit(1);
			return;
		}
		Logger.log("Launcher", "Initing Web responder...");
		try {
			if (!Settings.HOSTED)
				Responder.init();
		} catch (Throwable e) {
			Logger.handle(e);
			Logger.log("Launcher",
					"Failed initing web responder... Shutting down...");
			System.exit(1);
			return;
		}
		Logger.log("Launcher", "Server took "
				+ (Utils.currentTimeMillis() - currentTime)
				+ " milli seconds to launch.");
		addFilesSavingTask();
		addCleanMemoryTask();
		addrecalcPricesTask();
	}

	private static void addCleanMemoryTask() {
		CoresManager.slowExecutor.scheduleWithFixedDelay(new Runnable() {
			@Override
			public void run() {
				try {
					cleanMemory(Runtime.getRuntime().freeMemory() < Settings.MIN_FREE_MEM_ALLOWED);
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}
		}, 0, 10, TimeUnit.MINUTES);
	}

	private static void addFilesSavingTask() {
		CoresManager.slowExecutor.scheduleWithFixedDelay(new Runnable() {
			@Override
			public void run() {
				try {
					saveFiles();
				} catch (Throwable e) {
					Logger.handle(e);
				}

			}
		}, 15, 15, TimeUnit.MINUTES);
	}

	private static void addrecalcPricesTask() {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		int minutes = (int) ((c.getTimeInMillis() - Utils.currentTimeMillis()) / 1000 / 60);
		int halfDay = 12 * 60;
		if (minutes > halfDay)
			minutes -= halfDay;
		CoresManager.slowExecutor.scheduleWithFixedDelay(new Runnable() {
			@Override
			public void run() {
				try {
					GrandExchange.recalcPrices();
				} catch (Throwable e) {
					Logger.handle(e);
				}

			}
		}, minutes, halfDay, TimeUnit.MINUTES);
	}

	private static void saveFiles() {
		for (Player player : World.getPlayers()) {
			if (player == null || !player.hasStarted() || player.hasFinished())
				continue;
			SerializableFilesManager.savePlayer(player);
		}
		saveOtherFiles();
	}

	public static void saveOtherFiles() {
		DisplayNames.save();
		IPBanL.save();
		IPMuteL.save();
		PkRank.save();
		DTRank.save();
		GrandExchange.save();
	}

	public static void cleanMemory(boolean force) {
		if (force) {
			ItemDefinitions.clearItemsDefinitions();
			NPCDefinitions.clearNPCDefinitions();
			ObjectDefinitions.clearObjectDefinitions();
			skip: for (Region region : World.getRegions().values()) {
				for (int regionId : MapBuilder.FORCE_LOAD_REGIONS)
					if (regionId == region.getRegionId())
						continue skip;
				region.unloadMap();
			}
		}
		for (Index index : Cache.STORE.getIndexes()) {
			if (index == null)
				continue;

			index.resetCachedFiles();
		}
		CoresManager.fastExecutor.purge();
		System.gc();
	}

	public static void shutdown() {
		try {
			closeServices();
		} finally {
			System.exit(0);
		}
	}

	public static void closeServices() {
		if (!Settings.HOSTED)
			Responder.shutdown();
		ServerChannelHandler.shutdown();
		CoresManager.shutdown();
	}

	public static void restart() {
		closeServices();
		System.gc();
		try {
			Runtime.getRuntime()
					.exec("java -server -Xms2048m -Xmx20000m -cp bin;/data/libs/netty-3.2.7.Final.jar;/data/libs/FileStore.jar Launcher false false true false");
			System.exit(0);
		} catch (Throwable e) {
			Logger.handle(e);
		}

	}

	private Launcher() {

	}

}
