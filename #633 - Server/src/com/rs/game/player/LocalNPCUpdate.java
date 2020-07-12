package com.rs.game.player;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.rs.Settings;
import com.rs.game.Hit;
import com.rs.game.SecondaryBar;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.io.OutputStream;
import com.rs.utils.Utils;

public final class LocalNPCUpdate {

	private Player player;
	private LinkedList<NPC> localNPCs;

	public void reset() {
		localNPCs.clear();
	}

	public LocalNPCUpdate(Player player) {
		this.player = player;
		localNPCs = new LinkedList<NPC>();
	}

	public OutputStream createPacketAndProcess() {
		OutputStream stream = new OutputStream();
		OutputStream updateBlockData = new OutputStream();
		stream.writePacketVarShort(player, 16);
		processLocalNPCsInform(stream, updateBlockData);
		stream.writeBytes(updateBlockData.getBuffer(), 0,
				updateBlockData.getOffset());
		stream.endPacketVarShort();
		return stream;
	}

	private void processLocalNPCsInform(OutputStream stream,
			OutputStream updateBlockData) {
		stream.initBitAccess();
		processInScreenNPCs(stream, updateBlockData);
		addInScreenNPCs(stream, updateBlockData);
		if (updateBlockData.getOffset() > 0)
			stream.writeBits(15, 32767);
		stream.finishBitAccess();
	}

	private void processInScreenNPCs(OutputStream stream,
			OutputStream updateBlockData) {
		stream.writeBits(8, localNPCs.size());
		// for (NPC n : localNPCs.toArray(new NPC[localNPCs.size()])) {
		for (Iterator<NPC> it = localNPCs.iterator(); it.hasNext();) {
			NPC n = it.next();
			if (n.hasFinished() || !n.withinDistance(player, 14)
					|| n.hasTeleported()) {
				stream.writeBits(1, 1);
				stream.writeBits(2, 3);
				it.remove();
				continue;
			}
			boolean needUpdate = n.needMasksUpdate();
			boolean walkUpdate = n.getNextWalkDirection() != -1;
			stream.writeBits(1, (needUpdate || walkUpdate) ? 1 : 0);
			if (walkUpdate) {
				stream.writeBits(2, n.getNextRunDirection() == -1 ? 1 : 2);
				if (n.getNextRunDirection() != -1)
					stream.writeBits(1, 1);
				stream.writeBits(3,
						Utils.getNpcMoveDirection(n.getNextWalkDirection()));
				if (n.getNextRunDirection() != -1)
					stream.writeBits(3,
							Utils.getNpcMoveDirection(n.getNextRunDirection()));
				stream.writeBits(1, needUpdate ? 1 : 0);
			} else if (needUpdate)
				stream.writeBits(2, 0);
			if (needUpdate)
				appendUpdateBlock(n, updateBlockData, false);
		}
	}

	private void addInScreenNPCs(OutputStream stream,
			OutputStream updateBlockData) {
		for (int regionId : player.getMapRegionsIds()) {
			List<Integer> indexes = World.getRegion(regionId).getNPCsIndexes();
			if (indexes == null)
				continue;
			for (int npcIndex : indexes) {
				if (localNPCs.size() == Settings.LOCAL_NPCS_LIMIT)
					break;
				NPC n = World.getNPCs().get(npcIndex);
				if (n == null || n.hasFinished() || localNPCs.contains(n)
						|| !n.withinDistance(player, 14) || n.isDead())
					continue;
				boolean needUpdate = n.needMasksUpdate()
						|| n.getLastFaceEntity() != -1
						|| n.getCustomCombatLevel() >= 0
						|| n.getCustomName() != null;
				int x = n.getX() - player.getX();
				int y = n.getY() - player.getY();
				stream.writeBits(15, n.getIndex());
				
			
				stream.writeBits(1,  n.hasTeleported()  ? 1: 0);
				stream.writeBits(1, needUpdate ? 1 : 0);
				stream.writeBits(14, n.getId());
				stream.writeBits(3, (n.getDirection() >> 11) - 4);
				if (x < 15)
					x += 32;
				stream.writeBits(5, x);
				stream.writeBits(2, n.getPlane());
				if (y < 15)
					y += 32;
				stream.writeBits(5, y);
				localNPCs.add(n);
				if (needUpdate)
					appendUpdateBlock(n, updateBlockData, true);
			}
		}
	}

	private void appendUpdateBlock(NPC n, OutputStream data, boolean added) {
		int maskData = 0;
		
		if (n.getNextForceTalk() != null) { //3
			maskData |= 0x3;
		}
		
		if (!n.getNextHits().isEmpty()) { //4
			maskData |= 0x40;
		}

		
		if (n.getNextFaceWorldTile() != null && n.getNextRunDirection() == -1
				&& n.getNextWalkDirection() == -1) { //5
			maskData |= 0x20;
		}
		
		if (n.getNextFaceEntity() != -2
				|| (added && n.getLastFaceEntity() != -1)) { //6
			maskData |= 0x10;
		}
		
		if (n.getNextGraphics1() != null) { //8
			maskData |= 0x4;
		}
		
		if (n.getNextGraphics2() != null) { //9
			maskData |= 0x2000;
		}
		
		
		if (n.getNextAnimation() != null) { //11
			maskData |= 0x80;
		}
		
		if (n.getNextTransformation() != null) {//12
			maskData |= 0x8;
		}
		
		if (maskData > 128)
			maskData |= 0x2;
		data.writeByte(maskData);
		if (maskData > 128)
			data.writeByte(maskData >> 8);
		
		if (n.getNextForceTalk() != null) { //3
			applyForceTalkMask(n, data);
		}
		
		if (!n.getNextHits().isEmpty()) { //4
			applyHitMask(n, data);
		}

		
		
		if (n.getNextFaceWorldTile() != null) { //5
			applyFaceWorldTileMask(n, data);
		}

		if (n.getNextFaceEntity() != -2
				|| (added && n.getLastFaceEntity() != -1)) { //6
			applyFaceEntityMask(n, data);
		}

		if (n.getNextGraphics1() != null) { //8
			applyGraphicsMask1(n, data);
		}

		if (n.getNextGraphics2() != null) { //9
			applyGraphicsMask2(n, data);
		}
		
		if (n.getNextAnimation() != null) { //11
			applyAnimationMask(n, data);
		}
		

		if (n.getNextTransformation() != null) { //12
			applyTransformationMask(n, data);
		}
		

/*
	

	
		
	

	

		// if (n.getNextForceMovement() != null) { TODO
		// // maskData |= 0x1000;
		// }

		if (!n.getNextHits().isEmpty()) {
			maskData |= 0x40;
		}

	

		
		if (n.getNextSecondaryBar() != null) {
			maskData |= 0x800;
		}

		

		
		
		
	
		// if (n.getNextForceMovement() != null) { TODO
		// applyForceMovementMask(n, data);
		// }
		
		
		 if ((maskdata & 0x2000) != 0) { // color mask used in temple treking and nex
		    ((Entity) curnpc).Ub = Class_wh.b.ReadSignedByteC(-622951480); TODO
		    ((Entity) curnpc).X = Class_wh.b.ReadSignedByteS(-27697);
		    ((Entity) curnpc).jc = Class_wh.b.ReadSignedByteC(i + -622885944);
		    ((Entity) curnpc).sc = (byte) Class_wh.b.ReadUnsignedByte(255);
		    ((Entity) curnpc).Nb = or.o + Class_wh.b.ReadUnsignedShort(842397944);
		    ((Entity) curnpc).Pb = or.o + Class_wh.b.ReadUnsignedShort(842397944);
		}
		

		if (!n.getNextHits().isEmpty()) {
			applyHitMask(n, data);
		}

	

	

		if (n.getNextSecondaryBar() != null) {
			applySecondaryBar(n, data);
		}

		
		/*/

	}

	private void applySecondaryBar(NPC n, OutputStream data) {
		SecondaryBar bar = n.getNextSecondaryBar();
		boolean permanant = bar.isPermenant();
		int unknownV = bar.getTotalUnits();
		data.writeShort((permanant ? 8000 : 0) | (unknownV & 0x7fff));
		data.write128Byte(bar.getBeginningOffset());
		data.write128Byte(bar.getIncrementalUnits());
	}

	private void applyTransformationMask(NPC n, OutputStream data) {
		data.writeShort128(n.getNextTransformation().getToNPCId());
	}

	private void applyForceTalkMask(NPC n, OutputStream data) {
		data.writeString(n.getNextForceTalk().getText());
	}

	@SuppressWarnings("unused")
	private void applyForceMovementMask(NPC n, OutputStream data) {
		data.write128Byte(n.getNextForceMovement().getToFirstTile().getX()
				- n.getX());
		data.writeByte(n.getNextForceMovement().getToFirstTile().getY()
				- n.getY());
		data.writeByteC(n.getNextForceMovement().getToSecondTile() == null ? 0
				: n.getNextForceMovement().getToSecondTile().getX() - n.getX());
		data.writeByteC(n.getNextForceMovement().getToSecondTile() == null ? 0
				: n.getNextForceMovement().getToSecondTile().getY() - n.getY());
		data.writeShortLE((n.getNextForceMovement().getFirstTileTicketDelay() * 600) / 20);
		data.writeShortLE128(n.getNextForceMovement().getToSecondTile() == null ? 0
				: ((n.getNextForceMovement().getSecondTileTicketDelay() * 600) / 20));
		data.writeShort128(n.getNextForceMovement().getDirection());
	}

	private void applyFaceWorldTileMask(NPC n, OutputStream data) {
		data.writeShortLE((n.getNextFaceWorldTile().getX() * 2)
				+ n.getNextFaceWorldTile().getSizeX());
		data.writeShort128((n.getNextFaceWorldTile().getY() * 2)
				+ n.getNextFaceWorldTile().getSizeY());
	}

	private void applyHitMask(NPC n, OutputStream data) {
		
		// TODO fix this as this was just for testing
		Hit hit = n.getNextHits().get(0);
		data.writeSmart(hit.getDamage());
		data.writeByte128(hit.getMark(player, n));
		int hp = n.getHitpoints();
		int maxHp = n.getMaxHitpoints();
		if (hp > maxHp)
			hp = maxHp;
		int hpBarPercentage = hp * 255 / maxHp;
		data.writeByte128(hpBarPercentage);
		
//		int count = n.getNextHits().size();
//		data.write128Byte(count);
//		if (count > 0) {
//			int hp = n.getHitpoints();
//			int maxHp = n.getMaxHitpoints();
//			if (hp > maxHp)
//				hp = maxHp;
//			int hpBarPercentage = hp * 255 / maxHp;
//			for (Hit hit : n.getNextHits()) {
//				boolean interactingWith = hit.interactingWith(player, n);
//				if (hit.getDamage() < 0) {
//					hit.setDamage(0);
//				}
//				if (hit.missed() && !interactingWith)
//					data.writeSmart(32766);
//				else {
//					if (hit.getSoaking() != null) {
//						data.writeSmart(32767);
//						data.writeSmart(hit.getMark(player, n));
//						data.writeSmart(hit.getDamage());
//						data.writeSmart(hit.getSoaking().getMark(player, n));
//						data.writeSmart(hit.getSoaking().getDamage());
//					} else {
//						data.writeSmart(hit.getMark(player, n));
//						data.writeSmart(hit.getDamage());
//					}
//				}
//				data.writeSmart(hit.getDelay());
//				data.writeByte(hpBarPercentage);
//			}
//		}
	}

	private void applyFaceEntityMask(NPC n, OutputStream data) {
		data.writeShort128(n.getNextFaceEntity() == -2 ? n.getLastFaceEntity() : n
				.getNextFaceEntity());
	}

	private void applyAnimationMask(NPC n, OutputStream data) {
		for (int id : n.getNextAnimation().getIds())
			data.writeShort128(id);
		data.writeByteC(n.getNextAnimation().getSpeed());
	}

	private void applyGraphicsMask2(NPC n, OutputStream data) {
		data.writeShort(n.getNextGraphics2().getId());
		data.writeIntV1(n.getNextGraphics2().getSettingsHash());
		data.writeByte(n.getNextGraphics2().getSettings2Hash());
	}

	private void applyGraphicsMask1(NPC n, OutputStream data) {
		data.writeShort128(n.getNextGraphics1().getId());
		data.writeIntV2(n.getNextGraphics1().getSettingsHash());
		data.writeByteC(n.getNextGraphics1().getSettings2Hash());
	}

}
