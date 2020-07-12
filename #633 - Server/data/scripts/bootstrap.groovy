/*
 * DO NOT MODIFIY UNLESS YOU KNOW WHAT YOU ARE DOING!
 * Apollo's bootstrap.rb converted to groovy.
 * Credits to Graham.
 */
import groovy.lang.Closure;

import com.rs.game.player.Player;
import com.rs.script.ButtonScript;


class ProcButtonHandler extends ButtonScript {

	Closure closure

	ProcButtonHandler(closure) {
		this.closure = closure
	}

	@Override
	boolean handle(Player player,
			int slotId, int itemId, int packetId) {
		closure(player, slotId, itemId, packetId)
	}
}

def on(type, args, Closure closure) {
	switch (type) {
		case "btn":
			onButton(args, closure)
			break
	}
}

/**
 * 
 * @param args - The arguments used for the button click event. 
 * 				In this case, it only requires two arguments: interfaceId and componentId.
 * @param closure
 */
def onButton(args, Closure closure) {
	int interfaceId = args[0]
	int componentId = args[1]
	ctx.addButtonHandler(interfaceId, componentId, new ProcButtonHandler(closure))
}