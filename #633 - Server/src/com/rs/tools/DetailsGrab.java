package com.rs.tools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import com.rs.cache.Cache;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.utils.Utils;

public class DetailsGrab {

    public static void main(String[] args) throws IOException {
	Cache.init();
	BufferedWriter writer = new BufferedWriter(new FileWriter(new File("./data.xml"), true));
	for (int i = 0; i < Utils.getItemDefinitionsSize(); i++) {
	    writer.write("<item>" + "\n");
	    writer.write("\t" + "<itemName>" + ItemDefinitions.getItemDefinitions(i).getName() + "</itemName>" + "\n");
	    writer.write("\t" + "<Stackable_items>" + ItemDefinitions.getItemDefinitions(i).isStackable() + "</Stackable_items>" + "\n");
	    writer.write("\t" + "<Equipment>" + ItemDefinitions.getItemDefinitions(i).isWearItem() + "</Equipment>" + "\n");
	    writer.write("\t" + "<Destroyable>" + ItemDefinitions.getItemDefinitions(i).isDestroyItem() + "</Destroyable>" + "\n");
	    writer.write("\t" + "<SpecialBar>" + ItemDefinitions.getItemDefinitions(i).hasSpecialBar() + "</SpecialBar>" + "\n");

	    HashMap<Integer, Integer> requirements = ItemDefinitions.getItemDefinitions(i).getWearingSkillRequiriments();
	    if (requirements != null) {
		if (requirements.size() != 0) {
		    for (int l = 0; l < requirements.size(); l++) {
			if (requirements.get(l) != null) {
			    int requirement = requirements.get(l);
			    writer.write("\t" + "<" + getSkill(l) + "Level>" + requirement + "</" + getSkill(l) + "Level>" + "\n");
			}
		    }
		}
	    }

	    writer.write("</item>" + "\n");
	}
	writer.close();
	System.out.println("Done");
    }

    public static String getSkill(int index) {
	return SKILL_NAME[index].toLowerCase();
    }

    public static final String[] SKILL_NAME = { "Attack", "Defence", "Strength", "Hitpoints", "Range", "Prayer", "Magic", "Cooking", "Woodcutting", "Fletching", "Fishing", "Firemaking", "Crafting", "Smithing", "Mining", "Herblore", "Agility", "Thieving", "Slayer", "Farming", "Runecrafting", "Construction" };

}