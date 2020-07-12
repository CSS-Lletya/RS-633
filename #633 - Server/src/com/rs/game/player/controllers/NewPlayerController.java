package com.rs.game.player.controllers;

import java.util.ArrayList;

import com.rs.Settings;
import com.rs.game.Entity;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.npc.NPC;
import com.rs.game.player.content.EconomyManager;
import com.rs.game.player.content.FriendChatsManager;
import com.rs.game.player.content.PlayerLook;
import com.rs.game.player.dialogues.Dialogue;

public class NewPlayerController extends Controller {
	private static ArrayList<String> ips = new ArrayList<String>();

	private NPC target;
	private int stage = 0;

	@Override
	public void start() {
		stage = 0;
		player.getMusicsManager().forcePlayMusic(2001);
	}

	private Dialogue getStartDialogue() {
		return new Dialogue() {
			@Override
			public void start() {
				sendEntityDialogue(
						Dialogue.IS_NPC,
						target != null ? target.getName() : "",
						target != null ? target.getId() : 0,
						9760,
						"Welcome to CorruptionX!",
						"To start playing, you must find me using the minimap arrow and then talk to me.",
						"Goodluck!");
			}

			@Override
			public void run(int interfaceId, int componentId) {
				end();
			}

			@Override
			public void finish() {
			}

		};
	}

	private Dialogue getEndDialogue() {
		return new Dialogue() {
			@Override
			public void start() {
				sendEntityDialogue(
						Dialogue.IS_NPC,
						target != null ? target.getName() : "",
						target != null ? target.getId() : 0,
						9760,
						"Good job! You found me!",
						"Now you can start playing and doing whatever you want.",
						"If you need any help or services, talk to me and I will always help you out.");
			}

			@Override
			public void run(int interfaceId, int componentId) {
				end();
			}

			@Override
			public void finish() {
			}

		};
	}

	@Override
	public void process() {
		if (stage == 0) {
			NPC closest = null;
			double dist = 999999;
			for (NPC npc : World.getNPCs()) {
				if (npc == null
						|| !EconomyManager.isEconomyManagerNpc(npc.getId()))
					continue;
				int xDelta = player.getX() - npc.getX();
				int yDelta = player.getY() - npc.getY();
				double d = Math.sqrt(xDelta * xDelta + yDelta * yDelta);
				if (closest == null || d < dist) {
					closest = npc;
					dist = d;
				}
			}

			if (closest != null) {
				target = closest;
				player.getHintIconsManager().addHintIcon(closest, 0, -1, false);
				stage = 1;
			}
		} else if (player.getDialogueManager().getLast() == null && stage == 1) {
			player.getDialogueManager().startDialogue(getStartDialogue());
			stage = 2;
		} else if (stage == 3 && player.getDialogueManager().getLast() == null) {
			player.getDialogueManager().startDialogue(getEndDialogue());
			stage = 4;
		} else if (stage == 4 && player.getDialogueManager().getLast() == null) {
			player.getControlerManager().forceStop();
		}
	}

	@Override
	public boolean processObjectClick1(WorldObject object) {
		return false;
	}

	@Override
	public boolean processObjectClick2(WorldObject object) {
		return false;
	}

	@Override
	public boolean processObjectClick3(WorldObject object) {
		return false;
	}

	@Override
	public boolean processNPCClick1(NPC npc) {
		if (stage == 2 && npc == target) {
			stage = 3;
		}
		return false;
	}

	/*
	 * return remove controler
	 */
	@Override
	public boolean login() {
		start();
		return false;
	}

	/*
	 * return remove controler
	 */
	@Override
	public boolean logout() {
		return false;
	}

	@Override
	public boolean processMagicTeleport(WorldTile toTile) {
		return false;
	}

	@Override
	public boolean keepCombating(Entity target) {
		return false;
	}

	@Override
	public boolean canAttack(Entity target) {
		return false;
	}

	@Override
	public boolean canHit(Entity target) {
		return false;
	}

	@Override
	public boolean processItemTeleport(WorldTile toTile) {
		return false;
	}

	@Override
	public boolean processObjectTeleport(WorldTile toTile) {
		return false;
	}

	@Override
	public void forceClose() {
		player.getHintIconsManager().removeUnsavedHintIcon();
		PlayerLook.openCharacterCustomizing(player);
		FriendChatsManager.joinChat("help", player);
		if (Settings.ECONOMY || Settings.ECONOMY_TEST) {
			String ip = player.getSession() != null ? player.getSession()
					.getIP() : null;
			if (ip != null && !ips.contains(ip)) {
				ips.add(ip);
				player.getInventory().addItem(new Item(995, 1000000));
			} else {
				player.getPackets()
						.sendGameMessage(
								"You have already received starting items on another account.");
			}
			player.getInventory().addItem(new Item(1333, 1));
			player.getInventory().addItem(new Item(1323, 1));
			player.getInventory().addItem(new Item(1153, 1));
			player.getInventory().addItem(new Item(1115, 1));
			player.getInventory().addItem(new Item(1067, 1));
			player.getInventory().addItem(new Item(1540, 1));
			player.getInventory().addItem(new Item(1712, 1));
			player.getInventory().addItem(new Item(2552, 1));
			player.getInventory().addItem(new Item(3853, 1));
			player.getInventory().addItem(new Item(386, 100));
		}
		player.getPackets().sendGameMessage(
				"Welcome to " + Settings.SERVER_NAME + ".");
		if (Settings.ECONOMY)
			player.getPackets().sendGameMessage(
					"The server is currently running in economy mode.");
		else if (Settings.ECONOMY_TEST)
			player.getPackets().sendGameMessage(
					"The server is currently running in economy test mode.");
		else
			player.getPackets().sendGameMessage(
					"The server is currently running in spawn mode.");
	}
}
