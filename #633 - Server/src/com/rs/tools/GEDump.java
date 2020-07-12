package com.rs.tools;

import java.util.List;

import com.rs.cache.Cache;
import com.rs.game.player.content.grandExchange.GrandExchange;
import com.rs.game.player.content.grandExchange.OfferHistory;

public class GEDump {

    public static void main(String[] args) throws Throwable {
	Cache.init(); // needed for ge
	GrandExchange.init(); // load prices
	
	
	List<OfferHistory> history = GrandExchange.getHistory();
	System.out.println("Offers amount:" + history.size());
	for (OfferHistory h : history) {
	    System.out.println("Item:" + h.getId() + ", quantity:" + h.getQuantity() + ", price:" + h.getPrice() + ", isBuy:" + h.isBought());
	}

    }
 
}