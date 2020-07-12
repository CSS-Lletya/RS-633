package com.rs.game.player.content.grandExchange;

import com.rs.cache.loaders.ClientScriptMap;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.item.Item;
import com.rs.game.item.ItemsContainer;
import com.rs.game.player.Player;
import com.rs.utils.Utils;

public class Offer extends Item {

    private static final long serialVersionUID = -4065899425889989474L;

    public Offer(int id, int ammount, int price, boolean buy) {
	// item id buying or selling
	// total amount buying or selling
	super(id, ammount);
	this.price = price;
	buying = buy;
	receivedItems = new ItemsContainer<Item>(2, true);
    }

    // offer will contain the owner, its the most efficient way to update in
    // terms speed
    // owner needs to be deleted when logs out from here else it caches player
    // on memory
    private transient Player owner;
    private transient int slot;

    private int price; // price per item selling or buying
    private int totalPriceSoFar; // total profit received so far or spent
    private int totalAmmountSoFar; // amt of items sold or bought
    private ItemsContainer<Item> receivedItems;
    private boolean canceled;
    private boolean buying;
    @SuppressWarnings("unused")
    private long data;

    public void link(int slot, Player owner) {
	this.slot = slot;
	this.owner = owner;
	this.data = Utils.currentTimeMillis();
    }

    public void unlink() {
	owner = null;
    }

    public void update() {
	if (owner == null)
	    return;
	owner.getPackets().sendGrandExchangeOffer(this);
	sendItems();
    }

    public void sendItems() {
	if (owner == null)
	    return;
	owner.getPackets().sendItems(ClientScriptMap.getMap(1079).getIntValue(slot), receivedItems);
    }

    public int getPrice() {
	return price;
    }

    public boolean forceRemove() {
	return isCompleted() && !hasItemsWaiting();
    }

    protected boolean isCompleted() {
	return canceled || totalAmmountSoFar >= getAmount();
    }

    public int getPercentage() {
	return totalAmmountSoFar * getAmount() / 100;
    }

    public int getTotalAmmountSoFar() {
	return totalAmmountSoFar;
    }

    public int getTotalPriceSoFar() {
	return totalPriceSoFar;
    }

    public int getSlot() {
	return slot;
    }

    public int getStage() {
	if (forceRemove())
	    return 0;
	if (isCompleted())
	    return buying ? 5 : 13;
	return buying ? 2 : 10;
    }

    public boolean isBuying() {
	return buying;
    }

    // TODO canceling message
    public boolean cancel() {
	if (isCompleted())
	    return false;
	canceled = true;
	if (buying)
	    receivedItems.add(new Item(995, (getAmount() - totalAmmountSoFar) * price));
	else
	    receivedItems.add(new Item(getId(), getAmount() - totalAmmountSoFar));
	update();
	return true;
    }

    public void sendUpdateWarning() {
	if (owner == null)
	    return;
	owner.getPackets().sendGameMessage("One or more of your Grand Exchange offers have been updated.");
	owner.getPackets().sendMusicEffect(284);
	update();
    }

    public boolean isOfferTooHigh(Offer fromOffer) {
	int left = getAmount() - totalAmmountSoFar;
	int leftFrom = fromOffer.getAmount() - fromOffer.totalAmmountSoFar;
	int exchangeAmt = left > leftFrom ? leftFrom : left;
	int totalPrice = exchangeAmt * fromOffer.price;
	int amtCoins = receivedItems.getNumberOf(995);
	
	if (buying) {
	    if (fromOffer.receivedItems.getNumberOf(995) + totalPrice <= 0)
		return true;
	    int leftcoins = exchangeAmt * price - totalPrice;
	    if (leftcoins > 0 && amtCoins + leftcoins <= 0) 
		 return true;
	} else {
	    if (amtCoins + totalPrice <= 0) 
		return true;
	}
	return false;
	
    }
    
    public void updateOffer(Offer fromOffer) {
	int left = getAmount() - totalAmmountSoFar;
	int leftFrom = fromOffer.getAmount() - fromOffer.totalAmmountSoFar;
	int exchangeAmt = left > leftFrom ? leftFrom : left;
	int totalPrice = exchangeAmt * fromOffer.price;
	//int amtCoins = receivedItems.getNumberOf(995);
	if (buying) {
	    /*if (fromOffer.receivedItems.getNumberOf(995) + totalPrice <= 0) // too
									    // high
		return;*/
	    int leftcoins = exchangeAmt * price - totalPrice;
	    if (leftcoins > 0) {
		/*if (amtCoins + leftcoins <= 0) // too high
		    return;*/
		receivedItems.add(new Item(995, leftcoins));
	    }
	    // offer sells for less or same as urs
	    receivedItems.add(buying ? new Item(getId(), exchangeAmt) : new Item(getId(), exchangeAmt));
	    fromOffer.receivedItems.add(new Item(995, totalPrice));
	} else {
	  /*  if (amtCoins + totalPrice <= 0) // too high
		return;*/
	    // offer buys for more or same as urs
	    fromOffer.receivedItems.add(new Item(getId(), exchangeAmt));
	    receivedItems.add(new Item(995, totalPrice));
	}
	totalAmmountSoFar += exchangeAmt;
	fromOffer.totalAmmountSoFar += exchangeAmt;
	totalPriceSoFar += totalPrice;
	fromOffer.totalPriceSoFar += totalPrice;
	fromOffer.sendUpdateWarning();
    }

    public boolean collectItems(int slot, int option) {
	if (owner == null)
	    return false;
	int freeSlots = owner.getInventory().getFreeSlots();
	if (freeSlots == 0) {
	    owner.getPackets().sendGameMessage("Not enough space in your inventory.");
	    return false;
	}
	Item item = receivedItems.get(slot);
	if (item == null)
	    return false;
		ItemDefinitions defs = item.getDefinitions();
		if (!defs.isStackable() && option == (item.getAmount() == 1 ? 0 : 1)) {
	    Item add = new Item(item.getId(), item.getAmount() > freeSlots ? freeSlots : item.getAmount());
	    owner.getInventory().addItem(add);
	    receivedItems.remove(add);
	} else {
	    owner.getInventory().addItem(new Item(defs.certId != -1 ? defs.certId : item.getId(), item.getAmount()));
	    receivedItems.remove(item);
	}
	update();
	return true;
    }

    public boolean hasItemsWaiting() {
	return receivedItems.getFreeSlots() != 2;
    }

}
