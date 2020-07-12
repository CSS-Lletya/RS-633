package com.rs.tools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import com.rs.cache.Cache;
import com.rs.cache.loaders.ClientScriptMap;
import com.rs.cache.loaders.GeneralRequirementMap;

public class ItemListDumper {

    public static void main(String[] args) {
	try {
	    new ItemListDumper();
	}
	catch (IOException e) {
	    e.printStackTrace();
	}
    }

    public ItemListDumper() throws IOException {
	//Cache.STORE = new Store("C:\\Users\\khaled\\Dropbox\\Matrix745\\data\\cache/");
    	Cache.init();
	File file = new File("grmap.txt"); // = new
					   // File("information/itemlist.txt");
	BufferedWriter writer = new BufferedWriter(new FileWriter(file));
	// writer.append("//Version = 709\n");
	writer.append("//Version = 718\n");
	writer.flush();
	for (int i = 0; i < 10000; i++) {
	    HashMap<Long, Object> map = GeneralRequirementMap.getMap(i).getValues();
	    if (map != null && !map.isEmpty()) {
		writer.append(i + " - " + map.toString());
		writer.newLine();
		writer.flush();
	    }
	}
	writer.close();
	file = new File("csmap.txt"); // = new File("information/itemlist.txt");
	writer = new BufferedWriter(new FileWriter(file));
	// writer.append("//Version = 709\n");
	writer.append("//Version = 718\n");
	writer.flush();
	for (int i = 0; i < 10000; i++) {
	    HashMap<Long, Object> map = ClientScriptMap.getMap(i).getValues();
	    int v = ClientScriptMap.getMap(i).getDefaultIntValue();
	    String s = ClientScriptMap.getMap(i).getDefaultStringValue();
	    if (map != null) {
		writer.append(i + " - " + v + " - " + s + " - " + map.toString());
		writer.newLine();
		writer.flush();
	    }
	}
	writer.close();
    }

    public static int convertInt(String str) {
	try {
	    int i = Integer.parseInt(str);
	    return i;
	}
	catch (NumberFormatException e) {
	}
	return 0;
    }

}
