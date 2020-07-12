package com.rs.game.item;

import java.io.Serializable;
import java.util.Arrays;

import com.rs.cache.loaders.ItemDefinitions;

/**
 * @author MangiS
 */
public class ItemsContainerNew implements Serializable {
    
    private static final long serialVersionUID = 1099313426737026107L;// same serial so once it get's replaced serializer wont spike
    
    /**
     * Items data.
     */
    private Item[] data;
    /**
     * Whether items with same ID always stack.
     */
    private boolean alwaysStackable;
    
    /**
     * Contains container updates data.
     */
    private transient boolean[] updates;
    /**
     * Amount of free slots we have + 1.
     */
    private transient int freeSlots;

    public ItemsContainerNew(int size, boolean alwaysStack) {
	this.data = new Item[size];
	this.alwaysStackable = alwaysStack;
    }
    
    
    /**
     * Get's item at specific slot, might return null.
     */
    public Item get(int slot) {
	if (slot < 0 || slot >= data.length)
	    return null;
	return data[slot];
    }
    
    /**
     * Get's item slot by it's id.
     */
    public int getSlotForId(int id) {
	for (int i = 0; i < data.length; i++)
	    if (data[i] != null && data[i].getId() == id)
		return i;
	return -1;
    }
    
    /**
     * Get's item slot by it's id.
     */
    private int getSlotForIdInternal(int id, int preferred) {
	if (preferred >= 0 && preferred < data.length && data[preferred] != null && data[preferred].getId() == id)
	    return preferred;
	return getSlotForId(id);    
    }
    
    /**
     * Get's count of specific item.
     */
    public int getCountOf(int id) {
	int count = 0;
	for (int i = 0; i < data.length; i++)
	    if (data[i] != null && data[i].getId() == id)
		count += data[i].getAmount();
	return count;
    }
    
    /**
     * Get's amount of free slots.
     */
    public int getFreeSlots() {
	ensureFreeSlotsCalculated();
	return freeSlots - 1;
    }
    
    /**
     * Swap's two slots.
     * Returns true if operation performed succesfully.
     */
    public boolean swap(int slot1, int slot2) {
	if (slot1 < 0 || slot1 >= data.length || slot2 < 0 || slot2 >= data.length)
	    return false;
	Item i1 = data[slot1];
	Item i2 = data[slot2];
	data[slot1] = i2;
	data[slot2] = i1;
	markAsUpdated(slot1);
	markAsUpdated(slot2);
	return true;
    }
    
    /**
     * Replace's item in specific slot with new item.
     * Returns true if operation performed succesfully.
     */
    public boolean replace(int slot, int id, int amount) {
	if (slot < 0 || slot >= data.length)
	    return false;
	data[slot] = id >= 0 ? new Item(id, amount) : null;
	markAsUpdated(slot);
	return true;
    }
    
    /**
     * Sort's items by removing the spaces (null items).
     */
    public void sort() {
	int write = 0;
	for (int i = 0; i < data.length; i++) {
	    if (data[i] != null) {
		Item item = data[i];
		data[i] = null;
		data[write] = item;
		markAsUpdated(i);
		markAsUpdated(write++);
	    }
	}
    }
    
    /**
     * Reset's all items.
     */
    public void reset() {
	Arrays.fill(data, null); // better than reallocating
	freeSlots = data.length + 1;
	markFullUpdate();
    }
    
    /**
     * Whether we have space for given item.
     */
    public boolean hasSpaceFor(int id, int amount) {
	ItemDefinitions defs = ItemDefinitions.getItemDefinitions(id);
	if (alwaysStackable || defs.isStackable() || defs.isNoted()) {
	    int existing = getSlotForId(id);
	    if (existing == -1)
		return getFreeSlots() >= 1;
	    else {
		long total = (long)data[existing].getAmount() + (long)amount;
		return total > 0 && total <= Integer.MAX_VALUE;
	    }
	}
	else {
	    return getFreeSlots() >= amount;
	}
    }
    
    /**
     * Whether we contain at least given amount of item with given id.
     */
    public boolean containsAtLeast(int id, int amount) {
	ItemDefinitions defs = ItemDefinitions.getItemDefinitions(id);
	if (alwaysStackable || defs.isStackable() || defs.isNoted()) {
	    int existing = getSlotForId(id);
	    return existing != -1 && data[existing].getAmount() >= amount;
	}
	else {
	    return getCountOf(id) >= amount;
	}
    }
    
    /**
     * Whether container contains all of those items.
     */
    public boolean containsAll(Item[] items) {
	// this is costly method, but we can't do anything, we NEED to copy ids and amounts.
	int[] ids = new int[data.length];
	int[] amts = new int[data.length];
	for (int i = 0; i < data.length; i++) {
	    if (data[i] != null) {
		ids[i] = data[i].getId();
	    	amts[i] = data[i].getAmount();
	    }
	    else {
		ids[i] = -1;
	    }
	}

	for (int a = 0; a < items.length; a++) {
	    if (items[a] == null)
		continue;
	    int id = items[a].getId();
	    int amount = items[a].getAmount();
	    ItemDefinitions defs = ItemDefinitions.getItemDefinitions(id);
	    if (alwaysStackable || defs.isStackable() || defs.isNoted()) {
		int slot = internalGetSlotForId(ids, id);
		if (slot == -1 || amts[slot] < amount)
		    return false;
		
		amts[slot] -= amount;
		if (amount <= 0)
		    ids[slot] = -1;
	    }
	    else {
		int x = 0;
		while (x < amount) {
		    int nextSlot = internalGetSlotForId(ids, id);
		    if (nextSlot == -1)
			return false;
		    
		    int left = amount - x;
		    if (amts[nextSlot] > left) {
			x += left;
			amts[nextSlot] -= left;
		    }
		    else {
			x += amts[nextSlot];
			ids[nextSlot] = -1;
			amts[nextSlot] = 0;
		    }		    
		}
	    }
	    
	}
	return true;
    }
    
    /**
     * Whether container contains all of those items.
     */
    public boolean containsAll(ItemsContainerNew items) {
	// this is costly method, but we can't do anything, we NEED to copy ids and amounts.
	int[] ids = new int[data.length];
	int[] amts = new int[data.length];
	for (int i = 0; i < data.length; i++) {
	    if (data[i] != null) {
		ids[i] = data[i].getId();
	    	amts[i] = data[i].getAmount();
	    }
	    else {
		ids[i] = -1;
	    }
	}

	for (int a = 0; a < items.getSize(); a++) {
	    Item item = items.get(a);
	    if (item == null)
		continue;
	    int id = item.getId();
	    int amount = item.getAmount();
	    ItemDefinitions defs = ItemDefinitions.getItemDefinitions(id);
	    if (alwaysStackable || defs.isStackable() || defs.isNoted()) {
		int slot = internalGetSlotForId(ids, id);
		if (slot == -1 || amts[slot] < amount)
		    return false;
		
		amts[slot] -= amount;
		if (amount <= 0)
		    ids[slot] = -1;
	    }
	    else {
		int x = 0;
		while (x < amount) {
		    int nextSlot = internalGetSlotForId(ids, id);
		    if (nextSlot == -1)
			return false;
		    
		    int left = amount - x;
		    if (amts[nextSlot] > left) {
			x += left;
			amts[nextSlot] -= left;
		    }
		    else {
			x += amts[nextSlot];
			ids[nextSlot] = -1;
			amts[nextSlot] = 0;
		    }		    
		}
	    }
	    
	}
	return true;
    }
    
    /**
     * Whether we have space for given items.
     */
    public boolean hasSpaceFor(Item[] items) {
	// this is costly method, but we can't do anything, we NEED to copy ids and amounts.
	int[] ids = new int[data.length];
	int[] amts = new int[data.length];
	for (int i = 0; i < data.length; i++) {
	    if (data[i] != null) {
		ids[i] = data[i].getId();
	    	amts[i] = data[i].getAmount();
	    }
	    else {
		ids[i] = -1;
	    }
	}
	ensureFreeSlotsCalculated();
	int slots = freeSlots - 1;
	
	for (int a = 0; a < items.length; a++) {
	    if (items[a] == null)
		continue;
	    int id = items[a].getId();
	    int amount = items[a].getAmount();
	    ItemDefinitions defs = ItemDefinitions.getItemDefinitions(id);
	    if (alwaysStackable || defs.isStackable() || defs.isNoted()) {
		int slot = internalGetSlotForId(ids, id);
		if (slot == -1) {
		    if (slots < 1)
			return false;
		    int freeSlot = internalGetSlotForId(ids, -1);
		    ids[freeSlot] = id;
		    amts[freeSlot] = amount;
		    slots--;
		}
		else {
		    long total = (long)amts[slot] + (long)amount;
		    if (total < 0  || total >= Integer.MAX_VALUE)
			return false;
		    amts[slot] += amount;
		}
	    }
	    else {
		if (slots < amount)
		    return false;
		for (int x = 0; x < amount; x++) {
		    int freeSlot = internalGetSlotForId(ids, -1);
		    ids[freeSlot] = id;
		    amts[freeSlot] = 1;
		    slots--;
		}
	    }
	    
	}
	
	return true;
    }
    
    /**
     * Whether we have space for given items.
     */
    public boolean hasSpaceFor(ItemsContainerNew items) {
	// this is costly method, but we can't do anything, we NEED to copy ids and amounts.
	int[] ids = new int[data.length];
	int[] amts = new int[data.length];
	for (int i = 0; i < data.length; i++) {
	    if (data[i] != null) {
		ids[i] = data[i].getId();
	    	amts[i] = data[i].getAmount();
	    }
	    else {
		ids[i] = -1;
	    }
	}
	ensureFreeSlotsCalculated();
	int slots = freeSlots - 1;
	
	for (int a = 0; a < items.getSize(); a++) {
	    Item item = items.get(a);
	    if (item == null)
		continue;
	    int id = item.getId();
	    int amount = item.getAmount();
	    ItemDefinitions defs = ItemDefinitions.getItemDefinitions(id);
	    if (alwaysStackable || defs.isStackable() || defs.isNoted()) {
		int slot = internalGetSlotForId(ids, id);
		if (slot == -1) {
		    if (slots < 1)
			return false;
		    int freeSlot = internalGetSlotForId(ids, -1);
		    ids[freeSlot] = id;
		    amts[freeSlot] = amount;
		    slots--;
		}
		else {
		    long total = (long)amts[slot] + (long)amount;
		    if (total < 0  || total >= Integer.MAX_VALUE)
			return false;
		    amts[slot] += amount;
		}
	    }
	    else {
		if (slots < amount)
		    return false;
		for (int x = 0; x < amount; x++) {
		    int freeSlot = internalGetSlotForId(ids, -1);
		    ids[freeSlot] = id;
		    amts[freeSlot] = 1;
		    slots--;
		}
	    }
	    
	}
	
	return true;
    }
    
    private int internalGetSlotForId(int[] ids, int searchFor) {
	for (int i = 0; i < ids.length; i++)
	    if (ids[i] == searchFor)
		return i;
	return -1;
    }
    
    /**
     * Add's item to container.
     */
    public boolean addItem(int id, int amount) {
	ItemDefinitions defs = ItemDefinitions.getItemDefinitions(id);
	if (alwaysStackable || defs.isStackable() || defs.isNoted()) {
	    int existing = getSlotForId(id);
	    if (existing == -1)
		return addNewStackableInternal(id, amount);
	    else
		return addAdjustInternal(existing, amount);
	}
	else {
	    return addNewNonStackableInternal(id, amount);
	}
    }
    
    /**
     * Remove's item from container.
     */
    public boolean removeItem(int id, int amount) {
	ItemDefinitions defs = ItemDefinitions.getItemDefinitions(id);
	if (alwaysStackable || defs.isStackable() || defs.isNoted()) {
	    int existing = getSlotForId(id);
	    if (existing == -1)
		return false; 
	    return removeStackableInternal(existing, amount);
	}
	else {
	    return removeNonStackableInternal(id, amount);
	}
    }
    
    /**
     * Remove's item from container.
     */
    public boolean removeItem(int id, int amount, int preferredSlot) {
	ItemDefinitions defs = ItemDefinitions.getItemDefinitions(id);
	if (alwaysStackable || defs.isStackable() || defs.isNoted()) {
	    int existing = getSlotForIdInternal(id, preferredSlot);
	    if (existing == -1)
		return false; 
	    return removeStackableInternal(existing, amount);
	}
	else {
	    return removeNonStackableInternal(id, amount, preferredSlot);
	}
    }
    
    private boolean removeNonStackableInternal(int id, int amount) {
	int amt = getCountOf(id);
	if (amt < amount)
	    return false;
	
	for (int i = 0; i < data.length; i++) {
	    if (data[i] != null && data[i].getId() == id) {
		amount -= data[i].getAmount();
		data[i] = null;
		markAsUpdated(i);
		allocateFreeSlot();
		if (amount <= 0)
		    return true;
	    }
	}
	throw new RuntimeException("impossible or multithreading issue");
    }
    
    
    private boolean removeNonStackableInternal(int id, int amount, int preferredSlot) {
	int amt = getCountOf(id);
	if (amt < amount)
	    return false;
	
	if (preferredSlot >= 0 && preferredSlot < data.length && data[preferredSlot] != null && data[preferredSlot].getId() == id) {
	    amount -= data[preferredSlot].getAmount();
	    data[preferredSlot] = null;
	    markAsUpdated(preferredSlot);
	    allocateFreeSlot();
	    if (amount <= 0)
		return true;
	}
	
	for (int i = 0; i < data.length; i++) {
	    if (data[i] != null && data[i].getId() == id) {
		amount -= data[i].getAmount();
		data[i] = null;
		markAsUpdated(i);
		allocateFreeSlot();
		if (amount <= 0)
		    return true;
	    }
	}
	throw new RuntimeException("impossible or multithreading issue");
    }
    
    private boolean removeStackableInternal(int slot, int amount) {
	if (data[slot].getAmount() > amount) {
	    data[slot].setAmount(data[slot].getAmount() - amount);
	    markAsUpdated(slot);
	    return true;
	}
	else if (data[slot].getAmount() == amount) {
	    data[slot] = null;
	    markAsUpdated(slot);
	    allocateFreeSlot();
	    return true;
	}
	else {
	    return false;
	}
    }
    
    private boolean addNewStackableInternal(int id, int amount) {
	if (getFreeSlots() < 1)
	    return false;
	for (int i = 0; i < data.length; i++) {
	    if (data[i] == null) {
		data[i] = new Item(id, amount);
		markAsUpdated(i);
		deallocateFreeSlot();
		return true;
	    }
	}
	throw new RuntimeException("impossible or multithreading issue");
    }
    
    private boolean addNewNonStackableInternal(int id, int amount) {
	if (getFreeSlots() < amount)
	    return false;
	for (int i = 0; i < data.length; i++) {
	    if (data[i] == null) {
		data[i] = new Item(id, 1);
		markAsUpdated(i);
		deallocateFreeSlot();
		if (--amount <= 0)
		    return true;
	    }
	}
	throw new RuntimeException("impossible or multithreading issue");
    }
    
    private boolean addAdjustInternal(int slot, int amount) {
	long newAmount = (long)data[slot].getAmount() + (long)amount;
	if (newAmount < 0 || newAmount > Integer.MAX_VALUE)
	    return false;
	data[slot].setAmount((int)newAmount);
	markAsUpdated(slot);
	return true;
    }
    
    private void ensureFreeSlotsCalculated() {
	if (freeSlots == 0) {
	    // not calculated
	    freeSlots = 1;
	    for (int i = 0; i < data.length; i++)
		if (data[i] == null)
		    freeSlots++;
	}
    }
    
    private void allocateFreeSlot() {
	ensureFreeSlotsCalculated();
	freeSlots++;
    }
    
    private void deallocateFreeSlot() {
	ensureFreeSlotsCalculated();
	freeSlots--;
    }
   
    private void markAsUpdated(int slot) {
	if (updates == null)
	    updates = new boolean[data.length];
	updates[slot] = true;
    }
    
    private void markFullUpdate() {
	if (updates == null)
	    updates = new boolean[data.length];
	Arrays.fill(updates, true);
    }
    
    public boolean needsUpdating(int slot) {
	if (updates == null || slot < 0 || slot >= updates.length)
	    return false;
	return updates[slot];
    }
    
    public void resetUpdates() {
	if (updates == null)
	    return;
	Arrays.fill(updates, false); // better than setting updates to null then later reallocating
    }
    
    
    public int getSize() {
	return data.length;
    }
    
    public boolean isAlwaysStackable() {
	return alwaysStackable;
    }
    
    

}
