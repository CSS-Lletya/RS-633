package com.rs.utils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.HashMap;

import com.rs.utils.Logger;

public class AttackSpeeds {

	private final static HashMap<Integer, Integer> attackSpeeds = new HashMap<Integer, Integer>();
	private final static String PACKED_PATH = "data/items/packedAttackSpeeds.e";
	private final static String UNPACKED_PATH = "data/items/unpackedAttackSpeeds.txt";

	public static final void init() {
		if (new File(PACKED_PATH).exists())
			loadPackedSpeeds();
		else
			loadUnpackedSpeeds();
	}

	private static void loadPackedSpeeds() {
		try {
			RandomAccessFile in = new RandomAccessFile(PACKED_PATH, "r");
			FileChannel channel = in.getChannel();
			ByteBuffer buffer = channel.map(MapMode.READ_ONLY, 0,
					channel.size());
			while (buffer.hasRemaining()) {
				int id = buffer.getShort() & 0xffff;
				int speed = buffer.get();
				attackSpeeds.put(id, speed);

			}
			channel.close();
			in.close();
		} catch (Throwable e) {
			Logger.handle(e);
		}
	}

	private static void loadUnpackedSpeeds() {
		Logger.log("AttackSpeeds", "Packing attack speeds...");
		try {
			BufferedReader in = new BufferedReader(
					new FileReader(UNPACKED_PATH));
			DataOutputStream out = new DataOutputStream(new FileOutputStream(
					PACKED_PATH));
			while (true) {
				String line = in.readLine();
				if (line == null)
					break;
				if (line.startsWith("//"))
					continue;
				String[] splitedLine = line.split(" - ", 2);
				if (splitedLine.length < 2) {
					in.close();
					out.close();
					throw new RuntimeException("Invalid list for speed line: "
							+ line);
				}

				int id = Integer.valueOf(splitedLine[0]);
				int speed = Integer.valueOf(splitedLine[1]);
				out.writeShort(id);
				out.writeByte(speed);
				attackSpeeds.put(id, speed);

			}

			in.close();
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int getAttackSpeed(int id) {
		if (attackSpeeds.get(id) == null)
			return 4;
		return attackSpeeds.get(id);
	}

}
