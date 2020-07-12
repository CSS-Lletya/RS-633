package com.rs.tools;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Clues {

    public static void main(String[] args) {
	try {
	    WebPage page = new WebPage("http://runescape.wikia.com/wiki/Treasure_Trails/Guide/Coordinates");
	    page.load();
	    ArrayList<String> lines = page.getLines();
	    if (lines == null) {
		return;
	    }
	    Iterator<String> iterator = lines.iterator();
	    boolean nextLine = false;
	    while (iterator.hasNext()) {
		String line = iterator.next();
		String result = line.replace("</td><td style=\"width:25%\"> ", "").replace("<p>", "").replace(",<br />", "").replace(".", ",").replace("N", ",NORTH").replace("S", ",SOUTH").replace("E", ",EAST").replace("W", ",WEST");
		if (line.contains("None") || line.contains("<img alt") || line.contains("degrees ") || line.contains("<a href")) {
		    if (!nextLine)
			continue;
		} else if (line.startsWith("</td><td style=\"width:25%\"> ")) {
		    System.out.println(result);
		    nextLine = true;
		}
	    }
	}
	catch (IOException e) {
	    e.printStackTrace();
	}
    }
}
