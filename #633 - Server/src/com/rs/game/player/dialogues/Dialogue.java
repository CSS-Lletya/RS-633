package com.rs.game.player.dialogues;

import java.security.InvalidParameterException;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.player.Player;

public abstract class Dialogue {

    protected Player player;
    protected byte stage = -1;

    public Dialogue() {

    }

    public Object[] parameters;

    public void setPlayer(Player player) {
	this.player = player;
    }

    public abstract void start();

    public abstract void run(int interfaceId, int componentId);

    public abstract void finish();

    protected final void end() {
	player.getDialogueManager().finishDialogue();
    }

    public static final int NORMAL = 9827, WORRIED = 9775, CONFUSED = 9830, DRUNK = 9835, MAD = 9785, ANGERY = 9790, SAD = 9775, SCARED = 9780;
    protected static final String DEFAULT_OPTIONS_TITLE = "Select an option";
    protected static final short SEND_1_TEXT_CHAT = 241;
    protected static final short SEND_2_TEXT_CHAT = 242;
    protected static final short SEND_3_TEXT_CHAT = 243;
    protected static final short SEND_4_TEXT_CHAT = 244;
    protected static final byte IS_NOTHING = -1, IS_PLAYER = 0, IS_NPC = 1, IS_ITEM = 2;

    public void hideContinueOption(int type) {
	player.getPackets().sendHideIComponent(type == IS_PLAYER ? 1191 : 1184, 18, true);
    }
    
    public void sendContinueOption(int type) {
   	player.getPackets().sendHideIComponent(type == IS_PLAYER ? 1191 : 1184, 18, false);
       }


    public boolean sendNPCDialogue(int npcId, int animationId, String... text) {
	return sendEntityDialogue(IS_NPC, npcId, animationId, text);
    }

    public boolean sendItemDialogue(int itemId, String... text) {
	return sendEntityDialogue(IS_ITEM, itemId, -1, text);
    }

    public boolean sendPlayerDialogue(int animationId, String... text) {
	return sendEntityDialogue(IS_PLAYER, -1, animationId, text);
    }

    /*
     * 
     * auto selects title, new dialogues
     */
	public boolean sendEntityDialogue(int type, int entityId, int animationId, String... text) {
	String title = "";
	if (type == IS_PLAYER) {
	    title = player.getDisplayName();
	} else if (type == IS_NPC) {
	    title = NPCDefinitions.getNPCDefinitions(entityId).getName();
	} else if (type == IS_ITEM)
	    title = ItemDefinitions.getItemDefinitions(entityId).getName();
	return sendEntityDialogue(type, title, entityId, animationId, text);
    }

    /*
     * idk what it for
     */
    public int getP() {
	return 1;
    }

    public static final int OPTION_1 = 11, OPTION_2 = 13, OPTION_3 = 14,
	    OPTION_4 = 15, OPTION_5 = 16;

    public boolean sendOptionsDialogue(String title, String... options) {
	if (options.length > 5) {
	    throw new InvalidParameterException("The max options length is 5.");
	}
	String[] newopts = new String[5];
	for (int i = 0; i < 5; i++)
	    newopts[i] = "";
	int ptr = 0;
	for (String s : options) {
	    if (s != null) {
		newopts[ptr++] = s;
	    }
	}
	player.getInterfaceManager().sendChatBoxInterface(1188);
	player.getPackets().sendIComponentText(1188, 20, title);
	player.getPackets().sendRunScript(5589, newopts[4], newopts[3], newopts[2], newopts[1], newopts[0], options.length);
	return true;
    }

    public static boolean sendNPCDialogueNoContinue(Player player, int npcId, int animationId, String... text) {
	return sendEntityDialogueNoContinue(player, IS_NPC, npcId, animationId, text);
    }

    public static boolean sendPlayerDialogueNoContinue(Player player, int animationId, String... text) {
	return sendEntityDialogueNoContinue(player, IS_PLAYER, -1, animationId, text);
    }

    /*
     * 
     * auto selects title, new dialogues
     */
    public static boolean sendEntityDialogueNoContinue(Player player, int type, int entityId, int animationId, String... text) {
	String title = "";
	if (type == IS_PLAYER) {
	    title = player.getDisplayName();
	} else if (type == IS_NPC) {
	    title = NPCDefinitions.getNPCDefinitions(entityId).getName();
	} else if (type == IS_ITEM)
	    title = ItemDefinitions.getItemDefinitions(entityId).getName();
	return sendEntityDialogueNoContinue(player, type, title, entityId, animationId, text);
    }

    public static boolean sendEntityDialogueNoContinue(Player player, int type, String title, int entityId, int animationId, String... texts) {
	StringBuilder builder = new StringBuilder();
	for (int line = 0; line < texts.length; line++)
	    builder.append(" " + texts[line]);
	String text = builder.toString();
	player.getInterfaceManager().replaceRealChatBoxInterface(1192);
	player.getPackets().sendIComponentText(1192, 16, title);
	player.getPackets().sendIComponentText(1192, 12, text);
	player.getPackets().sendEntityOnIComponent(type == IS_PLAYER, entityId, 1192, 11);
	if (animationId != -1)
	    player.getPackets().sendIComponentAnimation(animationId, 1192, 11);
	return true;
    }

    public static boolean sendEmptyDialogue(Player player) {
	player.getInterfaceManager().replaceRealChatBoxInterface(89);
	return true;
    }

    public static void closeNoContinueDialogue(Player player) {
	player.getInterfaceManager().closeReplacedRealChatBoxInterface();
    }

    /*
     * new dialogues
     */
    public boolean sendEntityDialogue(int type, String title, int entityId, int animationId, String... texts) {
	StringBuilder builder = new StringBuilder();
	for (int line = 0; line < texts.length; line++)
	    builder.append(" " + texts[line]);
	String text = builder.toString();
	if (type == IS_NPC) {
	    player.getInterfaceManager().sendChatBoxInterface(1184);
	    player.getPackets().sendIComponentText(1184, 17, title);
	    player.getPackets().sendIComponentText(1184, 13, text);
	    player.getPackets().sendNPCOnIComponent(1184, 11, entityId);
	    if (animationId != -1)
		player.getPackets().sendIComponentAnimation(animationId, 1184, 11);
	} else if (type == IS_PLAYER) {
	    player.getInterfaceManager().sendChatBoxInterface(1191);
	    player.getPackets().sendIComponentText(1191, 8, title);
	    player.getPackets().sendIComponentText(1191, 17, text);
	    player.getPackets().sendPlayerOnIComponent(1191, 15);
	    if (animationId != -1)
		player.getPackets().sendIComponentAnimation(animationId, 1191, 15);
	} else if (type == IS_ITEM) {
	    player.getInterfaceManager().sendChatBoxInterface(1184);
	    for (int i = 0; i < 3; i++)
		player.getPackets().sendHideIComponent(1184, 14 + i, true);
	    player.getPackets().sendIComponentText(1184, 17, title);
	    player.getPackets().sendIComponentText(1184, 13, text);
	    player.getPackets().sendItemOnIComponent(1184, 11, entityId, 1); // there
	    // is
	    // a
	    // config
	    // for
	    // this
	    if (animationId != -1)
		player.getPackets().sendIComponentAnimation(animationId, 1184, 11);
	}
	return true;
    }

    public boolean sendDialogue(String... texts) {
	StringBuilder builder = new StringBuilder();
	for (int line = 0; line < texts.length; line++)
	    builder.append((line == 0 ? "<p=" + getP() + ">" : "<br>") + texts[line]);
	String text = builder.toString();
	player.getInterfaceManager().sendChatBoxInterface(1186);
	player.getPackets().sendIComponentText(1186, 1, text);
	return true;
    }

    public boolean sendEntityDialogue(short interId, String[] talkDefinitons, byte type, int entityId, int animationId) {
	if (type == IS_PLAYER || type == IS_NPC) { // auto convert to new
	    // dialogue all old dialogues
	    String[] texts = new String[talkDefinitons.length - 1];
	    for (int i = 0; i < texts.length; i++)
		texts[i] = talkDefinitons[i + 1];
	    sendEntityDialogue(type, talkDefinitons[0], entityId, animationId, texts);
	    return true;
	}
	return true;
    }
}
