package com.rs.game.npc;

public class Drop {

    private int itemId, minAmount, maxAmount;

    public Drop(int itemId, int minAmount, int maxAmount) {
	this.itemId = itemId;
	this.minAmount = minAmount;
	this.maxAmount = maxAmount;
    }

    public int getMinAmount() {
	return minAmount;
    }

    public int getExtraAmount() {
	return maxAmount - minAmount;
    }

    public int getMaxAmount() {
	return maxAmount;
    }

    public int getItemId() {
	return itemId;
    }

}
