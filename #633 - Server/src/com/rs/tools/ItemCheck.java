package com.rs.tools;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import com.rs.cache.Cache;
import com.rs.cache.loaders.ClientScriptMap;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.utils.Utils;

public class ItemCheck {

    private static List<Integer> items = new LinkedList<Integer>();
    private static String[] IMPLING = new String[] { "Rune bar", "Onyx bolt tips", "Splitbark gauntlets", "Mystic boots", "Mystic gloves", "Rune claws", "Rune scimitar", "Rune warhammer", "Dragon dagger", "Opal machete", "Rune arrow", "Rune dart", "Rune knife", "Rune throwing axe", "Black dragonhide", "Prayer potion (3)", "Weapon poison+ (3)" };

    public static final void main(String[] args) throws IOException {
	Cache.init();
	
	ClientScriptMap map = ClientScriptMap.getMap(3063);
	for(Long k : map.getValues().keySet()) {
	    int component = (int) (k & 0xff);
	    String message = map.getStringValue(k);
	    String itemName = message.substring(0, message.indexOf(":"));
	    System.out.println("rewards.put("+component+", "+getItemId(itemName)+");");
	}
	
	/*StringBuilder builder = new StringBuilder();
	for (int itemId = 0; itemId < Utils.getItemDefinitionsSize(); itemId++) {
	    ItemDefinitions def = ItemDefinitions.getItemDefinitions(itemId);
	    if((def.equipSlot != Equipment.SLOT_WEAPON && def.equipSlot != Equipment.SLOT_ARROWS) || def.lended || def.noted) 
		continue;
	    if(isPoisoned(def))
		continue;
	    ItemDefinitions p = getPoison(def, "p");
	    ItemDefinitions p_ = getPoison(def, "p+");
	    ItemDefinitions p__ = getPoison(def, "p++");
	 //   System.out.println(p+", "+p_+", "+p__);
	    if(p == null)
		continue;
	    System.out.println(", "+(Utils.formatPlayerNameForProtocol(def.name).toUpperCase())+"("+itemId+", "+p.id+", "+p_.id+", "+p__.id+")");
	    
	    //System.out.println(itemId+", "+def.name+", "+p.id+", "+p.name+", "+p_.id+", "+p_.name+", "+p__.id+", "+p__.name);
	}*/
    }
    
    private static int getItemId(String name) {
	for (int itemId = 0; itemId < Utils.getItemDefinitionsSize(); itemId++) {
	    ItemDefinitions def = ItemDefinitions.getItemDefinitions(itemId);
	    name = name.replace(" legs", " platelegs");
	    name = name.replace(" body", " platebody");
	    if(def.name.equalsIgnoreCase(name))
		return itemId;
	}
	return -1;
	
    }
    

}
