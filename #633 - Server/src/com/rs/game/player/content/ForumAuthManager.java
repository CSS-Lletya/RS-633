package com.rs.game.player.content;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;

import com.rs.Settings;
import com.rs.cores.CoresManager;
import com.rs.game.player.Player;

public class ForumAuthManager {

    
    public static void registerAuth(final Player player, final String username, final String password) {
	if (!Settings.HOSTED) {
	    player.getPackets().sendGameMessage("Can't auth \"" + username + "\" \"" + password + "\", running in local mode.");
	    return;
	}
	if (player.getForumAuthID() != -1) {
	    player.getPackets().sendGameMessage("Your forum account is already authorised.");
	    return;
	}
	player.getPackets().sendGameMessage("Connecting to auth server...");
	player.lock();
	CoresManager.slowExecutor.schedule(new Runnable() {
	    @Override
	    public void run() {
		try {
		    int gameRank = 0;
		    //if (player.isDonator())
			//gameRank = 1;
		    //if (player.isExtremeDonator())
			//gameRank = 2;
		    String link = Settings.WEB_API_LINK + "?secret=" + Settings.WEB_API_SECRET + "&action=regauth" + "&username=" + URLEncoder.encode(username.toString(), "UTF-8") + "&password=" + URLEncoder.encode(password.toString(), "UTF-8") + "&gameuser=" + URLEncoder.encode(player.getUsername(), "UTF-8") + "&gamerank=" + gameRank;
		    URLConnection c = new URL(link).openConnection();
		    c.setConnectTimeout(5000);
		    BufferedReader reader = new BufferedReader(new InputStreamReader(c.getInputStream()));
		    String response = reader.readLine();
		    reader.close();
		    if (response.startsWith("reg-ok:")) {
			String[] spl = response.split("\\:");
			int userID = Integer.parseInt(spl[1]);
			String ranks = spl[2];
			player.setForumAuthID(userID);
			player.syncRanksFromForumGroups(ranks);
			player.getPackets().sendGameMessage("Forum account " + username.toString() + " has been authorized to your game account sucessfully.");
		    } else if (response.equals("error")) {
			throw new RuntimeException();
		    } else if (response.equals("reg-alreadyauthed")) {
			player.getPackets().sendGameMessage("That account is already authorised by someone else.");
		    } else if (response.equals("reg-wronginfo")) {
			player.getPackets().sendGameMessage("You have entered incorrect username or password.");
		    } else {
			player.getPackets().sendGameMessage("Unexpected server response.");
		    }
		}
		catch (Throwable t) {
		    t.printStackTrace();
		    player.getPackets().sendGameMessage("An error occured, please try again later.");
		}
		player.unlock();
	    }
	}, 0L, TimeUnit.MILLISECONDS);
    }
    
    public static void syncAuth(final Player player) {
	if (Settings.HOSTED) {
	    if (player.getForumAuthID() <= 0) {
		player.setForumAuthID(-1);
	    }
	    if (player.getForumAuthID() != -1) {
		CoresManager.slowExecutor.schedule(new Runnable() {
		    @Override
		    public void run() {
			try {
			    String link = Settings.WEB_API_LINK + "?secret=" + Settings.WEB_API_SECRET + "&action=auth&gameuser=" + URLEncoder.encode(player.getUsername(), "UTF-8") + "&userid=" + player.getForumAuthID();
			    URLConnection c = new URL(link).openConnection();
			    c.setConnectTimeout(1000);
			    BufferedReader reader = new BufferedReader(new InputStreamReader(c.getInputStream()));
			    String response = reader.readLine();
			    if (response.startsWith("ok-")) {
				player.syncRanksFromForumGroups(response.substring(3));
			    } else if (response.equals("notauthed") || response.equals("gusermismatch")) {
				player.setForumAuthID(-1);
				player.syncRanksFromForumGroups(new int[] { 2 }); // standart users.
				player.getPackets().sendGameMessage("Your forum account was unauthorised automatically.");
			    } else {
				player.getPackets().sendGameMessage("An unknown response was received while trying to verify your forum account auth key.");
			    }
			    reader.close();

			}
			catch (Throwable t) {
			    t.printStackTrace();
			    player.getPackets().sendGameMessage("An error occured while trying to verify your forum account auth key.");
			}
		    }
		}, 0, TimeUnit.MILLISECONDS);
	    } else {
		boolean donator = player.isDonator();
		boolean extreme = player.isExtremeDonator();
		player.syncRanksFromForumGroups(new int[] { 2 });
		if (donator)
		    player.setDonator(true);
		if (extreme)
		    player.setExtremeDonator(true);
		// temp fix so ppl who don't have forum donator can sync
		player.getPackets().sendGameMessage("You currently don't have have forum account authorised. Talk to closest oracle of dawn to authorize it.");
	    }
	} else {
	    player.getPackets().sendGameMessage("Auth cycle skipped: running in nonhost mode.");
	}
    }

}
