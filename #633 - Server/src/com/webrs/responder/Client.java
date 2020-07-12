package com.webrs.responder;

import com.rs.Settings;
import com.rs.game.World;
import com.rs.game.player.Player;
import com.rs.utils.Encrypt;
import com.rs.utils.SerializableFilesManager;
import com.rs.utils.Utils;

public class Client {

    /**
     * Connection instance for this client.
     */
    private Connection connection;
    /**
     * Buffer that is used to process data.
     */
    private byte[] buffer;

    /**
     * Whether this client was 'accepted', which means
     * that the password was ok.
     */
    private boolean accepted;

    public Client(Connection connection) {
	this.connection = connection;
	this.buffer = new byte[65535];
    }

    public void process() {
	if (!isAlive()) {
	    return;
	} else if (connection.isDead()) {
	    connection.disconnect();
	    connection = null;
	    return;
	}

	main: for (int amt = connection.peek(buffer, 0, buffer.length); amt > 0; amt = connection.peek(buffer, 0, buffer.length)) {
	    for (int i = 0; i < amt; i++) {
		if (buffer[i] == '\n') {
		    StringBuilder msg = new StringBuilder(i);
		    for (int a = 0; a < (amt - 1); a++)
			msg.append((char) buffer[a]);
		    processMessage(msg.toString());
		    if (!isAlive()) {
			break main;
		    }

		    connection.discardBuffer(i + 1);
		    continue main;
		}
	    }
	    break;
	}

    }

    private void processMessage(String msg) {
	if (!accepted && !msg.startsWith("PSWD:")) {
	   // System.err.println("No password, received (" + msg + ") instead.");
	    connection.disconnect();
	    connection = null;
	    return;
	} else if (!accepted && !msg.substring(5).equals(Settings.WEB_RESPONDER_PASSWORD)) {
	    //System.err.println("Invalid password.");
	    connection.disconnect();
	    connection = null;
	    return;
	} else if (!accepted) {
	    //System.err.println("Client accepted!");
	    accepted = true;
	    return;
	}
	
	System.err.println("Received message:" + msg);
	try {
	    if (msg.startsWith("LOGIN:")) {
    	    	String[] data = msg.substring(6).split("\\@");
    	    	String username = data.length >= 1 ? Utils.formatPlayerNameForProtocol(data[0]) : null;
    	    	String password = data.length >= 2 ? data[1] : null;
    	    	Player player = null;
    	    	if (data.length != 2 || username.length() <= 0 || password.length() <= 0) {
    	    	    sendMessage("error");
    	    	}
    	    	else if ((player = World.getPlayer(username)) != null) {
    	    	    if (player.getPassword().equals(Encrypt.encryptSHA1(password))) {
    	    		sendMessage("loginok");
    	    	    }
    	    	    else {
    	    		sendMessage("error");
    	    	    }
    	    	}
    	    	else {
    	    	    player = SerializableFilesManager.loadPlayer(username);
    	    	    if (player != null && player.getPassword().equals(Encrypt.encryptSHA1(password))) {
    	    		sendMessage("loginok");
    	    	    }
    	    	    else {
    	    		sendMessage("error");
    	    	    }
    	    	}
	    } else if (msg.startsWith("GET_RIGHTS:")) {
    	    	String username = Utils.formatPlayerNameForProtocol(msg.substring(11));
    	    	Player player = null;
    	    	if (username.length() <= 0) {
    	    	    sendMessage("0");
    	    	}
    	    	else if ((player = World.getPlayer(username)) != null) {
    	    	    sendMessage("" + player.getRights() + "");
    	    	}
    	    	else {
    	    	    player = SerializableFilesManager.loadPlayer(username);
    	    	    if (player != null) {
    	    		sendMessage("" + player.getRights() + "");
    	    	    }
    	    	    else {
    	    		sendMessage("0");
    	    	    }
    	    	}
	    } else if (msg.startsWith("CHANGE_PASSWORD:")) {
		String[] data = msg.substring(16).split("\\@");
		String username = data.length >= 1 ? Utils.formatPlayerNameForProtocol(data[0]) : null;
		String current_password = data.length >= 2 ? data[1] : null;
		String change_password = data.length >= 3 ? data[2] : null;
		Player player = null;
		if (data.length != 3 || username.length() <= 0 || current_password.length() <= 0 || change_password.length() <= 0) {
		    sendMessage("error");
		}
		else if ((player = World.getPlayer(username)) != null) {
    	    	    if (player.getPassword().equals(Encrypt.encryptSHA1(current_password))) {
    	    		player.setPassword(Encrypt.encryptSHA1(change_password));
    	    		sendMessage("changeok");
    	    	    }
    	    	    else {
    	    		sendMessage("error");
    	    	    }
		}
		else {
    	    	    player = SerializableFilesManager.loadPlayer(username);
    	    	    if (player != null && player.getPassword().equals(Encrypt.encryptSHA1(current_password))) {
    	    		player.setUsername(username);
    	    		player.setPassword(Encrypt.encryptSHA1(change_password));
    	    		SerializableFilesManager.savePlayer(player);
    	    		sendMessage("changeok");
    	    	    }
    	    	    else {
    	    		sendMessage("error");
    	    	    }
		}
	    } else if (msg.startsWith("GET_VAR:")) {
		String var_name = msg.substring(8);
		if (var_name.equals("players_online")) {
		    sendMessage("" + World.getPlayers().size() + "");
		}
		else {
		    sendMessage("error");
		}
	    }
	    else {
    	    	// unknown option
    	    	connection.disconnect();
    	    	connection = null;
	    }
	}
	catch (Throwable t) {
	    t.printStackTrace();
	    connection.disconnect();
	    connection = null;
	}

    }

    private void sendMessage(String msg) {
	byte[] buffer = new byte[msg.length() + 1];
	for (int i = 0; i < msg.length(); i++)
	    buffer[i] = (byte) msg.charAt(i);
	buffer[buffer.length - 1] = '\n';
	connection.write(buffer, 0, buffer.length);
    }

    public boolean isAlive() {
	return connection != null;
    }

}
