package com.rs.game.player.content.grandExchange;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.player.Player;
import com.rs.utils.SerializableFilesManager;
import com.rs.utils.Utils;

public class GrandExchange {

    private static final Object LOCK = new Object();
    // offer uid
    private static HashMap<Long, Offer> OFFERS;
    private static ArrayList<OfferHistory> OFFERS_TRACK;
    private static HashMap<Integer, Integer> PRICES;


    private static boolean edited;


    public static void init() {
	OFFERS = SerializableFilesManager.loadGEOffers();
	OFFERS_TRACK = SerializableFilesManager.loadGEHistory();
	PRICES = SerializableFilesManager.loadGEPrices();
    }
    
    public static void reset(boolean track, boolean price) {
	if(track)
	    OFFERS_TRACK.clear();
	if(price)
	    PRICES.clear();
	recalcPrices();
    }
    

    public static void recalcPrices() {
	ArrayList<OfferHistory> track = new ArrayList<OfferHistory>(OFFERS_TRACK);
	HashMap<Integer, BigInteger> averagePrice = new HashMap<Integer, BigInteger>();
	HashMap<Integer, BigInteger> averageQuantity = new HashMap<Integer, BigInteger>();
	for (OfferHistory o : track) {
	    BigInteger price = averagePrice.get(o.getId());
	    if (price != null) {
		BigInteger quantity = averageQuantity.get(o.getId());
		averagePrice.put(o.getId(), price.add(BigInteger.valueOf(o.getPrice())));
		averageQuantity.put(o.getId(), quantity.add(BigInteger.valueOf(o.getQuantity())));
	    } else {
		averagePrice.put(o.getId(), BigInteger.valueOf(o.getPrice()));
		averageQuantity.put(o.getId(), BigInteger.valueOf(o.getQuantity()));
	    }
	}

	for (int id : averagePrice.keySet()) {
	    BigInteger price = averagePrice.get(id);
	    BigInteger quantity = averageQuantity.get(id);

	    long oldPrice = getPrice(id);
	    long newPrice = price.divide(quantity).longValue();
	    long min = (long) ((double) oldPrice * 0.8D) - 100;
	    long max = (long) ((double) oldPrice * 1.2D) + 100;
	    if (newPrice < min)
		newPrice = min;
	    else if (newPrice > max)
		newPrice = max;

	    if (newPrice < 1)
		newPrice = 1;
	    else if (newPrice > Integer.MAX_VALUE)
		newPrice = Integer.MAX_VALUE;

	    PRICES.put(id, (int) newPrice);
	}
	savePrices();
    }

    private static void savePrices() {
	SerializableFilesManager.saveGEPrices(PRICES);
    }

    public static final void save() {
	if (!edited)
	    return;
	SerializableFilesManager.saveGEOffers(OFFERS);
	SerializableFilesManager.saveGEHistory(OFFERS_TRACK);
	edited = false;
    }

    public static void linkOffers(Player player) {
	boolean itemsWaiting = false;
	for (int slot = 0; slot < player.getGeManager().getOfferUIds().length; slot++) {
	    Offer offer = getOffer(player, slot);
	    if (offer == null)
		continue;
	    offer.link(slot, player);
	    offer.update();
	    if (!itemsWaiting && offer.hasItemsWaiting()) {
		itemsWaiting = true;
		player.getPackets().sendGameMessage("You have items from the Grand Exchange waiting in your collection box.");
	    }
	}
    }

    public static Offer getOffer(Player player, int slot) {
	synchronized (LOCK) {
	    long uid = player.getGeManager().getOfferUIds()[slot];
	    if (uid == 0)
		return null;
	    Offer offer = OFFERS.get(uid);
	    if (offer == null) {
		player.getGeManager().getOfferUIds()[slot] = 0; // offer
								// disapeared
								// within time
		return null;
	    }
	    return offer;
	}

    }

    public static void sendOffer(Player player, int slot, int itemId, int amount, int price, boolean buy) {
	synchronized (LOCK) {
	    Offer offer = new Offer(itemId, amount, price, buy);
	    player.getGeManager().getOfferUIds()[slot] = createOffer(offer);
	    offer.link(slot, player);
	    findBuyerSeller(offer);
	}
    }

    public static void abortOffer(Player player, int slot) {
	synchronized (LOCK) {
	    Offer offer = getOffer(player, slot);
	    if (offer == null)
		return;
	    edited = true;
	    if (offer.cancel() && offer.forceRemove())
		deleteOffer(player, slot); // shouldnt here happen anyway
	}
    }

    public static void collectItems(Player player, int slot, int invSlot, int option) {
	synchronized (LOCK) {
	    Offer offer = getOffer(player, slot);
	    if (offer == null)
		return;
	    edited = true;
	    if (offer.collectItems(invSlot, option) && offer.forceRemove()) {
		deleteOffer(player, slot); // should happen after none left and
					   // offer completed
		if (offer.getTotalAmmountSoFar() != 0) {
		    OfferHistory o = new OfferHistory(offer.getId(), offer.getTotalAmmountSoFar(), offer.getTotalPriceSoFar(), offer.isBuying());
		    OFFERS_TRACK.add(o);
		    player.getGeManager().addOfferHistory(o);
		}
	    }
	}
    }

    private static void deleteOffer(Player player, int slot) {
	player.getGeManager().cancelOffer(); // sends back to original screen if
					     // seeing an offer
	OFFERS.remove(player.getGeManager().getOfferUIds()[slot]);
	player.getGeManager().getOfferUIds()[slot] = 0;
    }

    private static void findBuyerSeller(Offer offer) {
	while (!offer.isCompleted()) {
	    Offer bestOffer = null;
	    for (Offer o : OFFERS.values()) {
		if (o.isBuying() == offer.isBuying() || o.getId() != offer.getId() || o.isCompleted() || (offer.isBuying() && o.getPrice() > offer.getPrice()) || (!offer.isBuying() && o.getPrice() < offer.getPrice()) || offer.isOfferTooHigh(o))
		    continue;
		if (bestOffer == null || (offer.isBuying() && o.getPrice() < bestOffer.getPrice()) || (!offer.isBuying() && o.getPrice() > bestOffer.getPrice()))
		    bestOffer = o;
	    }
	    if (bestOffer == null)
		break;
	    offer.updateOffer(bestOffer);
	}
	offer.update();
    }

    private static long createOffer(Offer offer) {
	edited = true;
	long uid = getUId();
	OFFERS.put(uid, offer);
	return uid;
    }

    private static long getUId() {
	while (true) {
	    long uid = Utils.RANDOM.nextLong();
	    if (OFFERS.containsKey(uid))
		continue;
	    return uid;
	}
    }

    public static int getPrice(int itemId) {
	ItemDefinitions defs = ItemDefinitions.getItemDefinitions(itemId);
	if (defs.isNoted())
	    itemId = defs.getCertId();
	else if (defs.isLended())
	    itemId = defs.getLendId();
	Integer price = PRICES.get(itemId);
	return price != null && price != 0 ? price : defs.getValue();
    }

    // in order not to keep player saved on memory in offers after player leaves
    // <.<
    public static void unlinkOffers(Player player) {
	for (int slot = 0; slot < player.getGeManager().getOfferUIds().length; slot++) {
	    Offer offer = getOffer(player, slot);
	    if (offer == null)
		continue;
	    offer.unlink();
	}
    }
    
    
    public static List<OfferHistory> getHistory() {
	return OFFERS_TRACK;
    }
}
