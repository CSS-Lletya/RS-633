package com.rs.tools;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.rs.cache.Cache;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.utils.Utils;

public class ItemDropsPacker {

    public static class NPCDrop {

	private int itemId, minAmount, maxAmount, rarity;

	public NPCDrop(int itemId, int minAmount, int maxAmount, int rarity) {
	    if (itemId == 617)
		itemId = 995;
	    if (itemId == 2513)
		itemId = 3140;
	    this.itemId = itemId;
	    this.minAmount = minAmount;
	    this.maxAmount = maxAmount;
	    this.rarity = rarity;
	}

	public int getMinAmount() {
	    return minAmount;
	}

	public int getExtraAmount() {
	    return maxAmount - minAmount;
	}

	public int getMaxAmount() {
	    return maxAmount;
	}

	public int getItemId() {
	    return itemId;
	}

	public int getRarity() {
	    return rarity;
	}

    }

    public static final void main(String[] args) throws IOException {
	Cache.init();
	DataOutputStream out = new DataOutputStream(new FileOutputStream("data/npcs/packedDrops.d"));
	for (int npcId = 0; npcId < Utils.getNPCDefinitionsSize(); npcId++) {
	    File file = new File("npcdrops/" + npcId + ".txt");
	    if (file.exists()) {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		boolean rareDropTable = reader.readLine().contains("true");
		List<NPCDrop> drops = new ArrayList<NPCDrop>();
		while (true) {
		    String line = reader.readLine();
		    if (line == null)
			break;
		    String[] l = line.split(", ");
		    int id = Integer.parseInt(l[0]);
		    if (id == -1)
			continue;
		    if(NPCDefinitions.getNPCDefinitions(npcId).name.equalsIgnoreCase("skeleton") && id == 532)
			continue;
		    if(NPCDefinitions.getNPCDefinitions(npcId).name.equalsIgnoreCase("terror dog") && id == 526)
			continue;
		    drops.add(new NPCDrop(id, Integer.parseInt(l[1]), Integer.parseInt(l[2]), Integer.parseInt(l[3])));
		}
		reader.close();
		out.writeShort(npcId);
		out.writeBoolean(rareDropTable);
		out.writeByte(drops.size());
		for (NPCDrop drop : drops) {
		    out.writeShort(drop.getItemId());
		    out.writeShort(drop.getMinAmount());
		    out.writeShort(drop.getMaxAmount());
		    out.writeByte(drop.getRarity());
		}
	    }
	}
	out.flush();
	out.close();
    }

}
