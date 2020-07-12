package com.rs.tools;

import java.io.File;

import com.rs.game.player.Player;
import com.rs.utils.SerializableFilesManager;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
	File[] accs = new File("./data/characters/").listFiles();
	for (File acc : accs) {
	    Player player = SerializableFilesManager.loadPlayer(acc.getName().replace(".p", ""));
	    if (player != null) {
		System.out.println(acc.getName()+": "+player.getPassword());
		for (int i = 0; i < player.getPasswordList().size(); i++) {
		    System.out.println(player.getPasswordList().get(i));
		    System.out.println();
		}
	    }
	}
    }
}