package com.rs.tools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.alex.store.Index;
import com.alex.store.Store;
import com.rs.cache.Cache;
import com.rs.io.InputStream;
import com.rs.utils.Logger;
import com.rs.utils.MapArchiveKeys;

public class NPCSpawnsDumper {

	private static int writtenCount;

	public static final void main(String[] args) throws IOException {
		int i = 3932338;
		System.out.println((i >> 16));
		System.out.println((i & 0xff));
		Cache.STORE = new Store("C:/Users/alexandre/Downloads/rscd/rscd/data/");
		Index mapIndex = Cache.STORE.getIndexes()[5];
		for (int archiveId : mapIndex.getTable().getValidArchiveIds()) {
			int rx = archiveId & 0xff;
			int ry = archiveId >> 7;
			int regionId = ry | rx << 8;
			// System.out.println((mapIndex.getLastFileId(archiveId)+1)+", "+mapIndex.getValidFilesCount(archiveId));
			byte[] data = mapIndex.getFile(archiveId, 2);
			/*
			 * if(data != null && data.length != 0)
			 * System.out.println(archiveId+", "+rx+", "+ry+", "+regionId);
			 */
			// System.out.println(data == null);
			int baseX = rx * 64;
			int baseY = ry * 64;
			if (data != null) {
				// System.out.println("--------------------------------region "+regionId+", "+writtenCount);
				InputStream stream = new InputStream(data);
				while (stream.getRemaining() > 0) {
					int hash = stream.readUnsignedShort();
					int npcId = stream.readUnsignedShort();
					int plane = hash >> 758085070;
					int localX = (0x1f92 & hash) >> -585992921;
					int x = baseX + localX;
					int localY = 0x3f & hash;
					int y = baseY + localY;
					writtenCount++;
					// System.out.println(npcId+". "+x+", "+y+", "+plane);
				}
			}

		}
	}

	public static final void main4(String[] args) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(
				"data/npcs/unpackedSpawnsList.txt", true));
		Logger.log("Launcher", "Initing Cache...");
		Cache.init();
		Logger.log("Launcher", "Initing Data File...");
		MapArchiveKeys.init();
		for (int regionId = 0; regionId < 31000; regionId++) {
			if (new File("data/npcs/packedSpawns/" + regionId + ".ns").exists())
				continue;
			dumpRegionNPCs(regionId, out);
		}
		out.close();
		System.out.println("found " + writtenCount + " npc spawns on cache.");

	}

	public static final void dumpRegionNPCs(int regionId, BufferedWriter writer)
			throws IOException {
		writer.flush();
		int regionX = (regionId >> 8) * 64;
		int regionY = (regionId & 0xff) * 64;
		int npcSpawnsContainerId = Cache.STORE.getIndexes()[5].getArchiveId("n"
				+ ((regionX >> 3) / 8) + "_" + ((regionY >> 3) / 8));
		if (npcSpawnsContainerId == -1)
			return;
		byte[] npcSpawnsContainerData = Cache.STORE.getIndexes()[5].getFile(
				npcSpawnsContainerId, 0, MapArchiveKeys.getMapKeys(regionId));
		if (npcSpawnsContainerData == null)
			return;
		System.out.println(regionId);
		InputStream stream = new InputStream(npcSpawnsContainerData);
		while (stream.getRemaining() > 0) {
			int hash = stream.readUnsignedShort();
			int npcId = stream.readUnsignedShort();
			int plane = hash >> 758085070;
			int localX = (0x1f92 & hash) >> -585992921;
			int x = regionX + localX;
			int localY = 0x3f & hash;
			int y = regionY + localY;
			writer.newLine();
			writer.write(npcId + " - " + x + " " + y + " " + plane);
			writer.flush();
			writtenCount++;
			System.out.println("123");
		}
	}

}
