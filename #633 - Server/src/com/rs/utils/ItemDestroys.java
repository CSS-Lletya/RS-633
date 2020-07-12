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

import com.rs.game.item.Item;

public class ItemDestroys {

    private final static HashMap<Integer, String> itemDestroys = new HashMap<Integer, String>();
    private final static String PACKED_PATH = "data/items/packedDestroys.d";
    private final static String UNPACKED_PATH = "data/items/unpackedDestroys.txt";

    public static final void init() {
	if (new File(PACKED_PATH).exists())
	    loadPackedItemDestroys();
	else
	    loadUnpackedItemDestroys();
    }

    public static final String getDestroy(Item item) {
	String examine = itemDestroys.get(item.getId());
	if (examine != null)
	    return examine;
	return "You can reclaim this item from the place you found it.";
    }

    private static void loadPackedItemDestroys() {
	try {
	    RandomAccessFile in = new RandomAccessFile(PACKED_PATH, "r");
	    FileChannel channel = in.getChannel();
	    ByteBuffer buffer = channel.map(MapMode.READ_ONLY, 0, channel.size());
	    while (buffer.hasRemaining())
		itemDestroys.put(buffer.getShort() & 0xffff, readAlexString(buffer));
	    channel.close();
	    in.close();
	}
	catch (Throwable e) {
	    Logger.handle(e);
	}
    }

    private static void loadUnpackedItemDestroys() {
	Logger.log("ItemExamines", "Packing item examines...");
	try {
	    BufferedReader in = new BufferedReader(new FileReader(UNPACKED_PATH));
	    DataOutputStream out = new DataOutputStream(new FileOutputStream(PACKED_PATH));
	    while (true) {
		String line = in.readLine();
		if (line == null)
		    break;
		if (line.startsWith("//"))
		    continue;
		line = line.replace("﻿", "");
		String[] splitedLine = line.split(" - ", 2);
		if (splitedLine.length < 2) {
		    in.close();
		    throw new RuntimeException("Invalid list for item examine line: " + line);
		}
		int itemId = Integer.valueOf(splitedLine[0]);
		if (splitedLine[1].length() > 255)
		    continue;
		out.writeShort(itemId);
		writeAlexString(out, splitedLine[1]);
		itemDestroys.put(itemId, splitedLine[1]);
	    }

	    in.close();
	    out.flush();
	    out.close();
	}
	catch (FileNotFoundException e) {
	    e.printStackTrace();
	}
	catch (IOException e) {
	    e.printStackTrace();
	}

    }

    public static String readAlexString(ByteBuffer buffer) {
	int count = buffer.get() & 0xff;
	byte[] bytes = new byte[count];
	buffer.get(bytes, 0, count);
	return new String(bytes);
    }

    public static void writeAlexString(DataOutputStream out, String string) throws IOException {
	byte[] bytes = string.getBytes();
	out.writeByte(bytes.length);
	out.write(bytes);
    }
}
