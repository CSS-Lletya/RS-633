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
import java.util.HashMap;

import com.rs.game.npc.combat.NPCCombatDefinitions;

public final class NPCCombatDefinitionsL {

    public final static HashMap<Integer, NPCCombatDefinitions> npcCombatDefinitions = new HashMap<Integer, NPCCombatDefinitions>();
    public final static NPCCombatDefinitions DEFAULT_DEFINITION = new NPCCombatDefinitions(1, -1, -1, -1, 5, 1, 33, 0, NPCCombatDefinitions.MELEE, -1, -1, NPCCombatDefinitions.PASSIVE, 4);
    private static final String PACKED_PATH = "data/npcs/packedCombatDefinitions.ncd";

    public static void init() {
	if (new File(PACKED_PATH).exists())
	    loadPackedNPCCombatDefinitions();
	else
	    loadUnpackedNPCCombatDefinitions();
    }

    public static NPCCombatDefinitions getNPCCombatDefinitions(int npcId) {
	NPCCombatDefinitions def = npcCombatDefinitions.get(npcId);
	if (def == null)
	    return DEFAULT_DEFINITION;
	return def;
    }

    private static void loadUnpackedNPCCombatDefinitions() {
	int count = 0;
	Logger.log("NPCCombatDefinitionsL", "Packing npc combat definitions...");
	try {
	    DataOutputStream out = new DataOutputStream(new FileOutputStream(PACKED_PATH));
	    BufferedReader in = new BufferedReader(new FileReader("data/npcs/unpackedCombatDefinitionsList.txt"));
	    while (true) {
		String line = in.readLine();
		count++;
		if (line == null)
		    break;
		if (line.startsWith("//"))
		    continue;
		String[] splitedLine = line.split(" - ", 2);
		if (splitedLine.length != 2) {
		    in.close();
		    out.close();
		    throw new RuntimeException("Invalid NPC Combat Definitions line: " + count + ", " + line);
		}
		int npcId = Integer.parseInt(splitedLine[0]);
		String[] splitedLine2 = splitedLine[1].split(" ", 13);
		if (splitedLine2.length != 13) {
		    in.close();
		    out.close();
		    throw new RuntimeException("Invalid NPC Combat Definitions line: " + count + ", " + line);
		}
		int hitpoints = Integer.parseInt(splitedLine2[0]);
		int attackAnim = Integer.parseInt(splitedLine2[1]);
		int defenceAnim = Integer.parseInt(splitedLine2[2]);
		int deathAnim = Integer.parseInt(splitedLine2[3]);
		int attackDelay = Integer.parseInt(splitedLine2[4]);
		int deathDelay = Integer.parseInt(splitedLine2[5]);
		int respawnDelay = Integer.parseInt(splitedLine2[6]);
		int maxHit = Integer.parseInt(splitedLine2[7]);
		int attackStyle;
		if (splitedLine2[8].equalsIgnoreCase("MELEE"))
		    attackStyle = NPCCombatDefinitions.MELEE;
		else if (splitedLine2[8].equalsIgnoreCase("RANGE"))
		    attackStyle = NPCCombatDefinitions.RANGE;
		else if (splitedLine2[8].equalsIgnoreCase("MAGE"))
		    attackStyle = NPCCombatDefinitions.MAGE;
		else if (splitedLine2[8].equalsIgnoreCase("RANGE_FOLLOW"))
		    attackStyle = NPCCombatDefinitions.RANGE_FOLLOW;
		else if (splitedLine2[8].equalsIgnoreCase("MAGE_FOLLOW"))
		    attackStyle = NPCCombatDefinitions.MAGE_FOLLOW;
		else {
		    in.close();
		    out.close();
		    throw new RuntimeException("Invalid NPC Combat Definitions line: " + line);
		}
		int attackGfx = Integer.parseInt(splitedLine2[9]);
		int attackProjectile = Integer.parseInt(splitedLine2[10]);
		int agressivenessType;
		if (splitedLine2[11].equalsIgnoreCase("PASSIVE"))
		    agressivenessType = NPCCombatDefinitions.PASSIVE;
		else if (splitedLine2[11].equalsIgnoreCase("AGRESSIVE"))
		    agressivenessType = NPCCombatDefinitions.AGRESSIVE;
		else {
		    in.close();
		    out.close();
		    throw new RuntimeException("Invalid NPC Combat Definitions line: " + line);
		}
		int agroRatio = Integer.parseInt(splitedLine2[12]);
		out.writeShort(npcId);
		out.writeShort(hitpoints);
		out.writeShort(attackAnim);
		out.writeShort(defenceAnim);
		out.writeShort(deathAnim);
		out.writeByte(attackDelay);
		out.writeByte(deathDelay);
		out.writeInt(respawnDelay);
		out.writeShort(maxHit);
		out.writeByte(attackStyle);
		out.writeShort(attackGfx);
		out.writeShort(attackProjectile);
		out.writeByte(agressivenessType);
		out.writeByte(agroRatio);
		npcCombatDefinitions.put(npcId, new NPCCombatDefinitions(hitpoints, attackAnim, defenceAnim, deathAnim, attackDelay, deathDelay, respawnDelay, maxHit, attackStyle, attackGfx, attackProjectile, agressivenessType, agroRatio));
	    }
	    in.close();
	    out.close();
	}
	catch (Throwable e) {
	    Logger.handle(e);
	}
    }

    private static void loadPackedNPCCombatDefinitions() {
	try {
	    RandomAccessFile in = new RandomAccessFile(PACKED_PATH, "r");
	    FileChannel channel = in.getChannel();
	    ByteBuffer buffer = channel.map(MapMode.READ_ONLY, 0, channel.size());
	    while (buffer.hasRemaining()) {
		int npcId = buffer.getShort() & 0xffff;
		int hitpoints = buffer.getShort() & 0xffff;
		int attackAnim = buffer.getShort() & 0xffff;
		if (attackAnim == 65535)
		    attackAnim = -1;
		int defenceAnim = buffer.getShort() & 0xffff;
		if (defenceAnim == 65535)
		    defenceAnim = -1;
		int deathAnim = buffer.getShort() & 0xffff;
		if (deathAnim == 65535)
		    deathAnim = -1;
		int attackDelay = buffer.get() & 0xff;
		int deathDelay = buffer.get() & 0xff;
		int respawnDelay = buffer.getInt();
		int maxHit = buffer.getShort() & 0xffff;
		int attackStyle = buffer.get() & 0xff;
		int attackGfx = buffer.getShort() & 0xffff;
		if (attackGfx == 65535)
		    attackGfx = -1;
		int attackProjectile = buffer.getShort() & 0xffff;
		if (attackProjectile == 65535)
		    attackProjectile = -1;
		int agressivenessType = buffer.get() & 0xff;
		int agroRatio = buffer.get() & 0xff;
		npcCombatDefinitions.put(npcId, new NPCCombatDefinitions(hitpoints, attackAnim, defenceAnim, deathAnim, attackDelay, deathDelay, respawnDelay, maxHit, attackStyle, attackGfx, attackProjectile, agressivenessType, agroRatio));
	    }
	    channel.close();
	    in.close();
	}
	catch (Throwable e) {
	    Logger.handle(e);
	}
    }

    private NPCCombatDefinitionsL() {

    }

}
