/* RunClient - Decompiled by JODE
 * Visit 
 */
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RunClient extends Applet {

	private static final long serialVersionUID = 1L;
	public static Properties params = new Properties();
	public JFrame mainFrame;
	public JPanel mainPane = new JPanel();
	public static String mainurl = "127.0.0.1";
	public int lang = 0;
	public String frameName = "Jagex";
	public JPanel totalPanel;
	public static boolean rs = false;

	public static final boolean ENABLE_LOBBY = false;
	public static final boolean ENABLE_ISAAC = false;

	public static void main(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].equalsIgnoreCase("servaddr"))
				mainurl = strings[++i];
		}
		if (!rs) {
			mainurl = "127.0.0.1";
		}
		RunClient runclient = new RunClient();
		runclient.doFrame();
	}

	public void init() {
		if (!rs) {
			mainurl = "127.0.0.1";
		}
		doApplet();
	}

	void doApplet() {
		try {
			readVars();
			startClient();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void doFrame() {
		try {
			readVars();
			openFrame();
			startClient();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void readVars() throws IOException {
		params.put("cabbase", "g.cab");
		params.put("java_arguments", "-Xmx102m -Dsun.java2d.noddraw=true");
		params.put("colourid", "0");
		params.put("worldid", "1");
		params.put("lobbyid", "1");
		params.put("lobbyaddress", "127.0.0.1");
		params.put("demoid", "0");
		params.put("demoaddress", "");
		params.put("modewhere", "0");
		params.put("modewhat", "0");
		params.put("lang", "0");
		params.put("objecttag", "0");
		params.put("js", "1");
		params.put("game", "0");
		params.put("affid", "0");
		params.put("advert", "1");
		params.put("settings", "wwGlrZHF5gJcZl7tf7KSRh0MZLhiU0gI0xDX6DwZ-Qk");
		params.put("country", "0");
		params.put("haveie6", "0");
		params.put("havefirefox", "1");
		params.put("cookieprefix", "");
		params.put("cookiehost", "127.0.0.1");
		params.put("cachesubdirid", "0");
		params.put("crashurl", "");
		params.put("unsignedurl", "");
		params.put("sitesettings_member", "1");
		params.put("frombilling", "false");
		params.put("sskey", "");
		params.put("force64mb", "false");
		params.put("worldflags", "8");
	}

	public void openFrame() {
		mainPane.setLayout(new BorderLayout());
		mainPane.add(this);
		mainPane.setPreferredSize(new Dimension(765, 503));
		totalPanel = new JPanel();
		totalPanel.setPreferredSize(new Dimension(765, 503));
		totalPanel.setLayout(new BorderLayout());
		totalPanel.add(mainPane, "Center");
		mainFrame = new JFrame(frameName);
		mainFrame.setLayout(new BorderLayout());
		mainFrame.getContentPane().add(totalPanel);
		mainFrame.setDefaultCloseOperation(3);
		mainFrame.pack();
		mainFrame.setVisible(true);
	}

	public void startClient() {
		try {
			client.provideLoaderApplet(this);
			client var_client = new client();
			var_client.init();
			var_client.start();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public String getParameter(String string) {
		if (!rs) {
			if (string.equals("lobbyaddress")) {
				return "127.0.0.1";
			}
			if (string.equals("worldid")) {
				return "1";
			}
			if (string.equals("lobbyid")) {
				return "1";
			}
		}
		return (String) params.get(string);
	}

	public URL getDocumentBase() {
		return getCodeBase();
	}

	public URL getCodeBase() {
		URL url;
		try {
			url = new URL(new StringBuilder().append("http://").append(mainurl)
					.toString());
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
		return url;
	}
}
