package com.rs.script;

import com.rs.game.player.Player;

public abstract class ButtonScript {

	public abstract boolean handle(Player player, int slotId, int itemId,
			int packetId);

}
