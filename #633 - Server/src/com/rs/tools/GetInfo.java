package com.rs.tools;

import java.util.Date;

import com.rs.Settings;
import com.rs.cache.Cache;
import com.rs.game.player.Player;
import com.rs.utils.SerializableFilesManager;

public class GetInfo {

    public static void main(String[] args) throws Throwable {
	Settings.HOSTED = true;
	Cache.init();
	try {
	    Player player = SerializableFilesManager.loadPlayer(args[0]);
	    if (player == null) {
		System.out.println("Account is null.");
		return;
	    }
	    
	    System.out.println("Account name:" + args[0]);
	    System.out.println("Current password:" + player.getPassword());
	    System.out.println(" -- Passwords -- ");
	    for (String password : player.getPasswordList())
		System.out.println(password);
	    System.out.println(" --------------- ");
	    
	    System.out.println(" -- IPS -- ");
	    if (player.getIPList() != null) {
    	    	for (String ip : player.getIPList())
    	    	    System.out.println(ip);
	    }
	    System.out.println(" --------- ");
	    
	    if (player.getCreationDate() == 0)
		System.out.println("No creation date available.");
	    else {
		Date date = new Date(player.getCreationDate());
		System.out.println("Creation date:" + date.toString());
	    }
	    
	    System.out.println("Times voted:" + player.getVotes());
	    System.out.println("Recovery question: " + (player.getRecovQuestion() != null ? player.getRecovQuestion() : "none available."));
	    System.out.println("Recovery answer: " + (player.getRecovAnswer() != null ? player.getRecovAnswer() : "none available."));
	}
	catch (Throwable t) {
	    System.out.println("Error occured:");
	    t.printStackTrace();
	}

    }
    
    

}