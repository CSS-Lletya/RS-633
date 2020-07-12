package com.rs.tools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;

import com.rs.cache.Cache;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.utils.Utils;

public class RuneWikiPriceDumper {

    static File file = null;
    static BufferedWriter writer = null;

    public static final void main(String[] args) throws IOException {
	System.out.println("Starting..");
	Cache.init();
	file = new File("./prices.txt");
	writer = new BufferedWriter(new FileWriter(file));
	for (int itemId = 9846; itemId < Utils.getItemDefinitionsSize(); itemId++) {
	    if (!ItemDefinitions.getItemDefinitions(itemId).isNoted())
		if (!dumpItem(itemId))
		    System.out.println("Failed");
	}
	writer.close();
    }

    public static boolean dumpItem(int itemId) {
	String pageName = ItemDefinitions.getItemDefinitions(itemId).getName().replace(" (black)", "").replace(" (white)", "").replace(" (yellow)", "").replace(" (red)", "");
	if (pageName == null || pageName.equals("null"))
	    return false;
	pageName = pageName.replace(" (p)", "");
	pageName = pageName.replace(" (p+)", "");
	pageName = pageName.replace(" (p++)", "");
	pageName = pageName.replace(" Broken", "");
	pageName = pageName.replace(" 25", "");
	pageName = pageName.replace(" 50", "");
	pageName = pageName.replace(" 75", "");
	pageName = pageName.replace(" 100", "");
	pageName = pageName.replace("jav'n", "javelin");
	pageName = pageName.replaceAll(" ", "_");

	try {
	    WebPage page = new WebPage("http://web.archive.org/web/20121017202526/http://runescape.wikia.com/wiki/" + pageName);
	    try {
		page.load();
	    }
	    catch (Exception e) {
		System.out.println("Invalid page: " + itemId + ", " + pageName);
		return false;
	    }
	    int price = 0;
	    stringLoop: for (String line : page.getLines()) {
		if (line.contains("GEItem")) {
		    price = getValue(line);
		    System.out.println("Dumped: " + pageName + " and price is " + price);
		    break stringLoop;
		}
	    }
	    writer.write(itemId + " - " + price);
	    writer.newLine();
	    return true;
	}
	catch (MalformedURLException e) {
	    e.printStackTrace();
	}
	catch (Exception e) {
	    e.printStackTrace();
	}
	return false;
    }

    public static int getValue(String s) {
	s = s.replaceAll(", ", "").replaceAll(",", "");
	StringBuilder sb = new StringBuilder();
	char c;
	boolean foundStart = false;
	for (int i = 0; i < s.length(); i++) {
	    c = s.charAt(i);
	    if (Character.isDigit(c) || c == '-') {
		sb.append(c);
		foundStart = true;
	    } else if (foundStart) {
		break;
	    }
	}
	try {
	    int amount = Integer.parseInt(sb.toString());
	    return amount;
	}
	catch (NumberFormatException e) {
	    return 0;
	}
    }

}
