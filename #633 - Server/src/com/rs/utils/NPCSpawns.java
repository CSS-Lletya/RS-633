package com.rs.utils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.ArrayList;
import java.util.List;

import com.rs.game.World;
import com.rs.game.WorldTile;

public final class NPCSpawns {

	public static final void init() {
		if (!new File("./data/npcs/packedSpawns").exists()) {
			Logger.log("NPCSpawns", "Packing npc spawns...");
			if (!new File("data/npcs/packedSpawns").mkdir())
				throw new RuntimeException(
						"Couldn't create packedSpawns directory.");
			packSpawnsList("data/npcs/unpackedSpawnsList.txt");
			packSpawnsList("data/npcs/unpackedCustomSpawnsList.txt");
			// packNPCSpawns2();
		}
	}

	private static final void packSpawnsList(String path) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(path));
			int count = 0;
			while (true) {
				count++;
				String line = in.readLine();
				if (line == null)
					break;
				if (line.startsWith("//") || line.startsWith("RSBOT"))
					continue;
				String[] splitedLine = line.split(" - ", 2);
				
				if (splitedLine.length != 2) {
					in.close();
					throw new RuntimeException("Invalid NPC Spawn line: "
							+ line + " , line number: " + count);
				}
				int npcId = Integer.parseInt(splitedLine[0]);
				if (npcId >= Utils.getNPCDefinitionsSize())
					continue;
				String[] splitedLine2 = splitedLine[1].split(" ", 5);
				if (splitedLine2.length != 3 && splitedLine2.length != 5) {
					in.close();
					throw new RuntimeException("Invalid NPC Spawn line: "
							+ line + " , line number: " + count);
				}
				WorldTile tile = new WorldTile(
						Integer.parseInt(splitedLine2[0]),
						Integer.parseInt(splitedLine2[1]),
						Integer.parseInt(splitedLine2[2]));
				int mapAreaNameHash = -1;
				boolean canBeAttackFromOutOfArea = true;
				if (splitedLine2.length == 5) {
					mapAreaNameHash = Utils.getNameHash(splitedLine2[3]);
					canBeAttackFromOutOfArea = Boolean
							.parseBoolean(splitedLine2[4]);
				}
				addNPCSpawn(npcId, tile.getRegionId(), tile, mapAreaNameHash,
						canBeAttackFromOutOfArea);
			}
			in.close();
		} catch (Throwable e) {
			Logger.handle(e);
		}
	}

	private static final void packDumps() {
		try {
			List<Integer> repeats = new ArrayList<Integer>();
			BufferedReader in = new BufferedReader(new FileReader(
					"data/npcs/spawns_dump.txt"));
			for (String line = in.readLine(); line != null; line = in
					.readLine()) {
				if (line.length() <= 0 || line.startsWith("#")
						|| line.startsWith("//"))
					continue;

				String[] spl = line.split("\\s");

				int index = Integer.parseInt(spl[0]);
				int npcId = Integer.parseInt(spl[1]);
				int x = Integer.parseInt(spl[2]);
				int y = Integer.parseInt(spl[3]);
				int z = Integer.parseInt(spl[4]);
				int rotDegree = Integer.parseInt(spl[5]);

				if (repeats.contains(index)) {
					System.err.println("Repeated npc index:" + index);
					continue;
				}

				repeats.add(index);
				addNPCSpawn(npcId, new WorldTile(x, y, z).getRegionId(),
						new WorldTile(x, y, z), -1, true);

			}
			in.close();
		} catch (Throwable e) {
			Logger.handle(e);
		}
	}

	public static final void loadNPCSpawns(int regionId) {
		File file = new File("data/npcs/packedSpawns/" + regionId + ".ns");
		if (!file.exists())
			return;
		try {
			RandomAccessFile in = new RandomAccessFile(file, "r");
			FileChannel channel = in.getChannel();
			ByteBuffer buffer = channel.map(MapMode.READ_ONLY, 0,
					channel.size());
			while (buffer.hasRemaining()) {
				int npcId = buffer.getShort() & 0xffff;
				int plane = buffer.get() & 0xff;
				int x = buffer.getShort() & 0xffff;
				int y = buffer.getShort() & 0xffff;
				boolean hashExtraInformation = buffer.get() == 1;
				int mapAreaNameHash = -1;
				boolean canBeAttackFromOutOfArea = true;
				if (hashExtraInformation) {
					mapAreaNameHash = buffer.getInt();
					canBeAttackFromOutOfArea = buffer.get() == 1;
				}
				World.spawnNPC(npcId, new WorldTile(x, y, plane),
						mapAreaNameHash, canBeAttackFromOutOfArea);
			}
			channel.close();
			in.close();
		} catch (Throwable e) {
			Logger.handle(e);
		}
	}

	private static final void addNPCSpawn(int npcId, int regionId,
			WorldTile tile, int mapAreaNameHash,
			boolean canBeAttackFromOutOfArea) {
		try {
			DataOutputStream out = new DataOutputStream(new FileOutputStream(
					"data/npcs/packedSpawns/" + regionId + ".ns", true));
			out.writeShort(npcId);
			out.writeByte(tile.getPlane());
			out.writeShort(tile.getX());
			out.writeShort(tile.getY());
			out.writeBoolean(mapAreaNameHash != -1);
			if (mapAreaNameHash != -1) {
				out.writeInt(mapAreaNameHash);
				out.writeBoolean(canBeAttackFromOutOfArea);
			}
			out.flush();
			out.close();
		} catch (Throwable e) {
			Logger.handle(e);
		}
	}

	private NPCSpawns() {
	}
}
