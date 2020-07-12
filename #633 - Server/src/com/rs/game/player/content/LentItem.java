package com.rs.game.player.content;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.item.Item;
import com.rs.game.player.Equipment;
import com.rs.game.player.Player;
import com.rs.utils.Utils;

public class LentItem {

    private Player player;
    
    private String providerUsername;// who borrowed your item
    private int lentItemId;// the id of the item
    private long lendDelay;// the length of time it is borrowed

    //if either player logs out, removeLentItem should be called. 

    public void logoutAction() {
	removeLentItem(false);
    }

    //TODO find usage for this
    public void removeLentItem(boolean forceRequest) { // hardest part
	if (lentItemId != -1 && lendDelay < Utils.currentTimeMillis()) {
	    int actualLentId = ItemDefinitions.getItemDefinitions(lentItemId).getLendId();
	    if (actualLentId == -1) {
		throw new RuntimeException("Shouldn't even happen.");
	    }
	    Item item = player.getEquipment().getItem(Equipment.getItemSlot(actualLentId));
	    if (item != null) {
		player.getEquipment().deleteItem(actualLentId, 1);
		if (forceRequest)
		    player.getEquipment().refresh();
	    } else if (player.getInventory().containsItem(actualLentId, 1)) {
		player.getInventory().deleteItem(actualLentId, 1);
		if (forceRequest)
		    player.getInventory().refresh();
	    } else if (player.getBank().removeItem(player.getBank().getItemSlot(actualLentId), 1, true, true)) {
		return;
	    }
	}
    }
}
