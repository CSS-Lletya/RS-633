package com.rs.script;

import java.util.HashMap;
import java.util.Map;

import com.rs.game.player.Player;
import com.rs.utils.Logger;

public final class ScriptContext {
	private final Map<Integer, ButtonScript> buttonHandlers = new HashMap<>();

	private static ScriptContext scriptContext = new ScriptContext();

	public ScriptContext() {
	}

	/**
	 * Adds a button dispatcher handler to the list of handlers.
	 * 
	 * @param handler
	 *            The button handler to add.
	 */
	public void addButtonHandler(int interfaceId, int componentId,
			ButtonScript handler) {
		int hash = getInterfaceHash(interfaceId, componentId);
		buttonHandlers.put(hash, handler);
	}

	public boolean handleButtonClick(Player player, int interfaceId,
			int componentId, int slot, int itemId, int packetId) {
		boolean handled = false;
		ButtonScript hook = buttonHandlers.get(getInterfaceHash(interfaceId,
				componentId));
		if (hook != null) {
			if (hook.handle(player, slot, itemId, packetId)) {
				handled = true;
			}
		}
		if (handled)
			Logger.log("Button", "InterfaceId " + interfaceId
					+ ", componentId " + componentId + ", slotId " + slot
					+ ", PacketId: " + packetId);

		return handled;
	}

	/**
	 * Purges all the handlers from the context.
	 */
	public void purge() {
		buttonHandlers.clear();
	}

	private int getInterfaceHash(int parent, int child) {
		return parent << 16 | child;
	}

	public static ScriptContext getScriptContext() {
		return scriptContext;
	}

}
