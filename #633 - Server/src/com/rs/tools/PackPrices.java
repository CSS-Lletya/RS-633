package com.rs.tools;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class PackPrices {

    public static void main(String[] args) {
	try {
	    BufferedReader in = new BufferedReader(new FileReader("./information/prices.txt"));
	    DataOutputStream out = new DataOutputStream(new FileOutputStream("./data/items/grand_exchange_prices.dat"));
	    while (true) {
		String line = in.readLine();
		if (line == null)
		    break;
		if (line.startsWith("//"))
		    continue;
		line = line.replace("﻿", "");
		String[] splitedLine = line.split(" - ", 2);
		if (splitedLine.length < 2) {
		    in.close();
		    throw new RuntimeException("Invalid list for item examine line: " + line);
		}
		int itemId = Integer.valueOf(splitedLine[0]);
		out.writeShort(itemId);
		int value = Integer.valueOf(splitedLine[1]);
		out.writeInt(value);
		System.out.println(itemId + " , " + value);
	    }
	    in.close();
	    out.flush();
	    out.close();
	}
	catch (FileNotFoundException e) {
	    e.printStackTrace();
	}
	catch (IOException e) {
	    e.printStackTrace();
	}
    }
}
