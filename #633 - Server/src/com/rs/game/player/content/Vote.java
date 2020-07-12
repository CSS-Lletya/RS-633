package com.rs.game.player.content;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;

import com.rs.Settings;
import com.rs.cores.CoresManager;
import com.rs.game.World;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.utils.Utils;

public class Vote {

    public static void checkVote(final Player player) {
	player.getTemporaryAttributtes().put("vote_enterauth", Boolean.TRUE);
	player.getPackets().sendInputLongTextScript("Enter your vote auth code:");
    }
    
    public static void checkVoteAuth(final String auth, final Player player) {
	if (player.getTemporaryAttributtes().get("CheckingVote") != null) {
	    player.getPackets().sendGameMessage("Your vote is already being checked, please be patient.");
	    return;
	}
	else if (auth.length() != 8) {
	    player.getDialogueManager().startDialogue("SimpleMessage", "Specified auth code is invalid.");
	    return;
	}
	else if (player.getInventory().getFreeSlots() <= 0) {
	    player.getDialogueManager().startDialogue("SimpleMessage", "Your inventory is full.");
	    return;
	}
	player.getTemporaryAttributtes().put("CheckingVote", Boolean.TRUE);
	

	
	player.getDialogueManager().startDialogue("SimpleMessage", "Checking your vote...");
	CoresManager.slowExecutor.schedule(new Runnable() {
	    @Override
	    public void run() {
		try {
		    URLConnection c = new URL(Settings.VOTE_API_LINK + "?action=ajax&claim_auth=" + URLEncoder.encode(auth, "UTF-8")).openConnection();
		    c.setConnectTimeout(5000);
		    BufferedReader reader = new BufferedReader(new InputStreamReader(c.getInputStream()));
		    final int points = Integer.parseInt(reader.readLine());
		    reader.close();

		    if (points <= 0) {
			player.getDialogueManager().startDialogue("SimpleMessage", "Specified auth code is invalid.");
		    } else {
			World.sendWorldMessage("<img=7><col=D80000> News: " + Utils.formatPlayerNameForDisplay(player.getDisplayName()) + " has just voted and received " + points + " vote tokens! (::vote)", false);
			player.getInventory().addItem(new Item(Settings.VOTE_TOKENS_ITEM_ID, points));
			player.getDialogueManager().startDialogue("SimpleMessage", "You have been given " + points + " vote tokens.");
			player.setVotes(player.getVotes() + 1);
		    }
		}
		catch (Throwable t) {
		    player.getDialogueManager().startDialogue("SimpleMessage", "An error occured, please try again later.");
		}
		player.getTemporaryAttributtes().remove("CheckingVote");
	    }
	}, 0, TimeUnit.MILLISECONDS);
    }
}
