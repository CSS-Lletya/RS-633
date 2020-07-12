package com.rs.game.player;

import java.util.concurrent.ConcurrentHashMap;

import com.rs.Settings;
import com.rs.game.player.content.clans.ClansManager;

public class InterfaceManager {

	public static final int FIXED_WINDOW_ID = 548;
	public static final int RESIZABLE_WINDOW_ID = 746;
	public static final int CHAT_BOX_COMPONENT = 13;
	public static final int FIXED_SCREEN_COMPONENT_ID = 18;
	public static final int RESIZABLE_SCREEN_COMPONENT_ID = 8;
	public static final int FIXED_INV_COMPONENT_ID = 197;
	public static final int RESIZABLE_INV_COMPONENT_ID = 83;
	private Player player;

	private static final int FIXED_TAB_OFFSET = 201;
	private static final int RESIZABLE_TAB_OFFSET = 87;

	public final class Tab {

		public static final int ATTACK = 0;
		public static final int SKILLS = 1;
		public static final int QUEST = 2;
		public static final int ACHIEVEMENT = 3;
		public static final int INVENTORY = 4;
		public static final int EQUIPMENT = 5;
		public static final int PRAYER = 6;
		public static final int MAGIC = 7;
		public static final int SUMMONING = 8;// also tasks? 1056 TODO find
		public static final int FRIENDS = 9;
		public static final int IGNORES = 10;
		public static final int CLAN = 11;
		public static final int SETTINGS = 12;
		public static final int EMOTES = 13;
		public static final int MUSIC = 14;
		public static final int NOTES = 15;
		public static final int LOGOUT = 18;

		private Tab() {

		}

	}

	// TODO CLOSE interface tab ids
	private final ConcurrentHashMap<Integer, Integer> openedinterfaces = new ConcurrentHashMap<Integer, Integer>();

	private boolean resizableScreen;
	private int rootInterface;

	public InterfaceManager(Player player) {
		this.player = player;
	}

	public void setWindowInterface(int componentId, int interfaceId) {
		setInterface(true, resizableScreen ? RESIZABLE_WINDOW_ID
				: FIXED_WINDOW_ID, componentId, interfaceId);
	}

	public void removeWindowInterface(int componentId) {
		removeInterfaceByParent(resizableScreen ? RESIZABLE_WINDOW_ID
				: FIXED_WINDOW_ID, componentId);
	}

	public void sendChatBoxInterface(int interfaceId) {
		setInterface(true, 752, CHAT_BOX_COMPONENT, interfaceId);
	}

	public void closeChatBoxInterface() {
		removeInterfaceByParent(752, CHAT_BOX_COMPONENT);
	}

	public boolean containsChatBoxInter() {
		return containsInterfaceAtParent(752, CHAT_BOX_COMPONENT);
	}

	public void setOverlay(int interfaceId, boolean fullScreen) {
		setWindowInterface(resizableScreen ? fullScreen ? 1 : 11 : 0,
				interfaceId);
	}

	public void removeOverlay(boolean fullScreen) {
		removeWindowInterface(resizableScreen ? fullScreen ? 1 : 11 : 0);
	}

	public void sendInterface(int interfaceId) {
		setInterface(false, resizableScreen ? RESIZABLE_WINDOW_ID
				: FIXED_WINDOW_ID,
				resizableScreen ? RESIZABLE_SCREEN_COMPONENT_ID
						: FIXED_SCREEN_COMPONENT_ID, interfaceId);
	}

	public void sendInventoryInterface(int interfaceId) {
		setInterface(false, resizableScreen ? RESIZABLE_WINDOW_ID
				: FIXED_WINDOW_ID, resizableScreen ? RESIZABLE_INV_COMPONENT_ID
				: FIXED_INV_COMPONENT_ID, interfaceId);
	}

	public final void sendInterfaces() {
		if (player.getDisplayMode() == 2 || player.getDisplayMode() == 3) {
			resizableScreen = true;
		} else {
			resizableScreen = false;
		}
		sendGameInterfaces();
		player.getCombatDefinitions().sendUnlockAttackStylesButtons();
		player.getMusicsManager().unlockMusicPlayer();
		player.getEmotesManager().unlockEmotesBook();
		player.getInventory().unlockInventoryOptions();
		player.getPrayer().unlockPrayerBookButtons();
		ClansManager.unlockBanList(player);
		if (player.getFamiliar() != null && player.isRunning())
			player.getFamiliar().unlock();
		player.getControlerManager().sendInterfaces();
	}

	public boolean containsReplacedChatBoxInter() {
		return containsInterfaceAtParent(752, 11);
	}

	public void replaceRealChatBoxInterface(int interfaceId) {
		setInterface(true, 752, 11, interfaceId);
	}

	public void closeReplacedRealChatBoxInterface() {
		removeInterfaceByParent(752, 11);
	}

	public void setDefaultRootInterface() {
		setRootInterface(resizableScreen ? 746 : 548, false);
	}

	public void sendGameInterfaces() {
		setDefaultRootInterface();
		sendOrbs();
		sendChatOptions();
		sendChatBox();
		sendPMChatArea();
		sendCombatStyles();
		sendAchievement();
		sendSkills();
		sendQuest();
		sendInventory();
		sendEquipment();
		sendPrayerBook();
		sendMagicBook();
		sendSettings();
		sendEmotes();
		sendMusic();
		sendNotes();
		sendIgnores();
		sendFriends();
		sendClanChat();
		sendLogout();
		
		setInterface(true, 752, 9, 137);

		// setWindowInterface(11, 745);// TODO check something to do with multi
		// icon

		/*
		 * setWindowInterface(192, 752); setWindowInterface(67, 751);
		 * setWindowInterface(14, 745); setWindowInterface(16, 754);
		 * setWindowInterface(187, 747); setWindowInterface(182, 748);
		 * setWindowInterface(184, 749); setWindowInterface(185, 750);
		 */
	}

	public void sendOrbs() {
		setWindowInterface(resizableScreen ? 172 : 181, 748);// hp
		setWindowInterface(resizableScreen ? 173 : 183, 749);// pray
		setWindowInterface(resizableScreen ? 174 : 184, 750);// run
		setWindowInterface(resizableScreen ? 175 : 186, 747);// summon
	}

	public void sendChatBox() {
		setWindowInterface(resizableScreen ? 69 : 190, 752);
	}

	public void sendPMChatArea() {// 191 for fixed?
		setWindowInterface(resizableScreen ? 70 : 191, 754);// TODO check for
															// fixed!
	}

	public void sendChatOptions() {
		setWindowInterface(resizableScreen ? 15 : 67, 751);
	}

	public void sendLogout() {
		setWindowInterface(resizableScreen ? RESIZABLE_TAB_OFFSET + Tab.LOGOUT
				: FIXED_TAB_OFFSET + Tab.LOGOUT, 182);
	}

	public void sendQuest() {
		setWindowInterface(resizableScreen ? RESIZABLE_TAB_OFFSET + Tab.QUEST
				: FIXED_TAB_OFFSET + Tab.QUEST, 190);
	}

	public void sendFriends() {
		setWindowInterface(resizableScreen ? RESIZABLE_TAB_OFFSET + Tab.FRIENDS
				: FIXED_TAB_OFFSET + Tab.FRIENDS, 550);
	}

	public void sendClanChat() {
		setWindowInterface(resizableScreen ? RESIZABLE_TAB_OFFSET + Tab.CLAN
				: FIXED_TAB_OFFSET + Tab.CLAN, 589);
	}

	public void sendIgnores() {
		setWindowInterface(resizableScreen ? RESIZABLE_TAB_OFFSET + Tab.IGNORES
				: FIXED_TAB_OFFSET + Tab.IGNORES, 551);
	}

	public void sendMusic() {
		setWindowInterface(resizableScreen ? RESIZABLE_TAB_OFFSET + Tab.MUSIC
				: FIXED_TAB_OFFSET + Tab.MUSIC, 187);
	}

	public void sendNotes() {
		setWindowInterface(resizableScreen ? RESIZABLE_TAB_OFFSET + Tab.NOTES
				: FIXED_TAB_OFFSET + Tab.NOTES, 34);
	}

	public void sendEquipment() {
		setWindowInterface(resizableScreen ? RESIZABLE_TAB_OFFSET
				+ Tab.EQUIPMENT : FIXED_TAB_OFFSET + Tab.EQUIPMENT, 387);
	}

	public void closeEquipment() {
		removeWindowInterface(resizableScreen ? 116 : 176);
	}

	public void sendInventory() {
		setWindowInterface(resizableScreen ? RESIZABLE_TAB_OFFSET
				+ Tab.INVENTORY : FIXED_TAB_OFFSET + Tab.INVENTORY,
				Inventory.INVENTORY_INTERFACE);
	}

	public void closeInventory() {
		removeWindowInterface(resizableScreen ? 115 : 175);
	}

	public void closeSkills() {
		removeWindowInterface(resizableScreen ? 113 : 206);
	}

	public void closeCombatStyles() {
		removeWindowInterface(resizableScreen ? 111 : 204);
	}

	public void closeTaskSystem() {
		removeWindowInterface(resizableScreen ? 112 : 205);
	}

	public void sendCombatStyles() {
		setWindowInterface(resizableScreen ? RESIZABLE_TAB_OFFSET + Tab.ATTACK
				: FIXED_TAB_OFFSET + Tab.ATTACK, 884);
	}

	public void sendAchievement() {
		setWindowInterface(resizableScreen ? RESIZABLE_TAB_OFFSET
				+ Tab.ACHIEVEMENT : FIXED_TAB_OFFSET + Tab.ACHIEVEMENT, 259);
	}

	public void sendSkills() {
		setWindowInterface(resizableScreen ? RESIZABLE_TAB_OFFSET + Tab.SKILLS
				: FIXED_TAB_OFFSET + Tab.SKILLS, 320);
	}

	public void sendSettings() {
		sendSettings(261);
	}

	public void sendSettings(int interfaceId) {
		setWindowInterface(resizableScreen ? RESIZABLE_TAB_OFFSET
				+ Tab.SETTINGS : FIXED_TAB_OFFSET + Tab.SETTINGS, interfaceId);
	}

	public void sendPrayerBook() {
		setWindowInterface(resizableScreen ? RESIZABLE_TAB_OFFSET + Tab.PRAYER
				: FIXED_TAB_OFFSET + Tab.PRAYER, 271);
	}

	public void closePrayerBook() {
		removeWindowInterface(resizableScreen ? 117 : 210);
	}

	public void sendMagicBook() {
		setWindowInterface(resizableScreen ? RESIZABLE_TAB_OFFSET + Tab.MAGIC
				: FIXED_TAB_OFFSET + Tab.MAGIC, player.getCombatDefinitions()
				.getSpellBook());
	}

	public void closeMagicBook() {
		removeWindowInterface(resizableScreen ? 118 : 211);
	}

	public void sendEmotes() {
		setWindowInterface(resizableScreen ? RESIZABLE_TAB_OFFSET + Tab.EMOTES
				: FIXED_TAB_OFFSET + Tab.EMOTES, 464);
	}

	public void closeEmotes() {
		removeWindowInterface(resizableScreen ? 124 : 217);
	}

	public void setInterface(boolean clickThrought, int parentInterfaceId,
			int parentInterfaceComponentId, int interfaceId) {
		if (Settings.DEBUG) {
			if (parentInterfaceId != rootInterface
					&& !containsInterface(parentInterfaceId))
				System.out
						.println("The parent interface isnt setted so where are u trying to set it? "
								+ parentInterfaceId
								+ ", "
								+ parentInterfaceComponentId
								+ ", "
								+ interfaceId);
			/*
			 * if(containsInterface(interfaceId))
			 * System.out.println("Already have "
			 * +interfaceId+" in another component.");
			 */
		}
		// even so lets set it for now
		int parentUID = getComponentUId(parentInterfaceId,
				parentInterfaceComponentId);
		Integer oldInterface = openedinterfaces.get(parentUID);
		if (oldInterface != null)
			clearChilds(oldInterface);
		openedinterfaces.put(parentUID, interfaceId); // replaces inter if
														// theres one in that
														// component already
		player.getPackets()
				.sendInterface(clickThrought, parentUID, interfaceId);
	}

	public void removeInterfaceByParent(int parentInterfaceId,
			int parentInterfaceComponentId) {
		removeInterfaceByParent(getComponentUId(parentInterfaceId,
				parentInterfaceComponentId));
	}

	public void removeInterfaceByParent(int parentUID) {
		Integer removedInterface = openedinterfaces.remove(parentUID);
		if (removedInterface != null) {
			clearChilds(removedInterface);
			player.getPackets().closeInterface(parentUID);
		}
	}

	private void clearChilds(int parentInterfaceId) {
		for (int key : openedinterfaces.keySet()) {
			if (key >> 16 == parentInterfaceId)
				openedinterfaces.remove(key);
		}
	}

	public void removeInterface(int interfaceId) {
		int parentUID = getInterfaceParentId(interfaceId);
		if (parentUID == -1)
			return;
		removeInterfaceByParent(parentUID);
	}

	public void setRootInterface(int rootInterface, boolean gc) {
		this.rootInterface = rootInterface;
		player.getPackets().sendRootInterface(rootInterface, gc ? 3 : 0);
	}

	public static int getComponentUId(int interfaceId, int componentId) {
		return interfaceId << 16 | componentId;
	}

	public int getInterfaceParentId(int interfaceId) {
		if (interfaceId == rootInterface)
			return -1;
		for (int key : openedinterfaces.keySet()) {
			int value = openedinterfaces.get(key);
			if (value == interfaceId)
				return key;
		}
		return -1;
	}

	public boolean containsInterfaceAtParent(int parentInterfaceId,
			int parentInterfaceComponentId) {
		return openedinterfaces.containsKey(getComponentUId(parentInterfaceId,
				parentInterfaceComponentId));
	}

	public boolean containsInterface(int interfaceId) {
		if (interfaceId == rootInterface)
			return true;
		for (int value : openedinterfaces.values())
			if (value == interfaceId)
				return true;
		return false;
	}

	public void removeAll() {
		openedinterfaces.clear();
	}

	public boolean containsWindowInterfaceAtParent(int componentId) {
		return containsInterfaceAtParent(resizableScreen ? RESIZABLE_WINDOW_ID
				: FIXED_WINDOW_ID, componentId);
	}

	public boolean containsScreenInter() {
		return containsWindowInterfaceAtParent(resizableScreen ? RESIZABLE_SCREEN_COMPONENT_ID
				: FIXED_SCREEN_COMPONENT_ID);
	}

	public void removeScreenInterface() {
		removeWindowInterface(resizableScreen ? RESIZABLE_SCREEN_COMPONENT_ID
				: FIXED_SCREEN_COMPONENT_ID);
	}

	public boolean containsInventoryInter() {
		return containsWindowInterfaceAtParent(resizableScreen ? RESIZABLE_INV_COMPONENT_ID
				: FIXED_INV_COMPONENT_ID);
	}

	public void removeInventoryInterface() {
		removeWindowInterface(resizableScreen ? RESIZABLE_INV_COMPONENT_ID
				: FIXED_INV_COMPONENT_ID);
	}

	public void setFadingInterface(int backgroundInterface) {
		setWindowInterface(hasRezizableScreen() ? 12 : 11, backgroundInterface);
	}

	public void closeFadingInterface() {
		removeWindowInterface(hasRezizableScreen() ? 12 : 11);
	}

	public void setScreenInterface(int backgroundInterface, int interfaceId) {
		removeScreenInterface();
		setWindowInterface(hasRezizableScreen() ? 40 : 200, backgroundInterface);
		setWindowInterface(hasRezizableScreen() ? 41 : 201, interfaceId);

		player.setCloseInterfacesEvent(new Runnable() {
			@Override
			public void run() {
				removeWindowInterface(hasRezizableScreen() ? 40 : 200);
				removeWindowInterface(hasRezizableScreen() ? 41 : 201);
			}
		});
	}

	public boolean hasRezizableScreen() {
		return resizableScreen;
	}

	public void setWindowsPane(int windowsPane) {
		this.rootInterface = windowsPane;
	}

	public int getWindowsPane() {
		return rootInterface;
	}

	public void gazeOrbOfOculus() {
		setRootInterface(475, false);
		setInterface(true, 475, 57, 751);
		setInterface(true, 475, 55, 752);
		player.setCloseInterfacesEvent(new Runnable() {

			@Override
			public void run() {
				setDefaultRootInterface();
				player.getPackets().sendResetCamera();
			}

		});
	}

	/*
	 * returns lastGameTab
	 */
	public int openGameTab(int tabId) {
		player.getPackets().sendGlobalConfig(168, tabId);
		int lastTab = 4; // tabId
		// tab = tabId;
		return lastTab;
	}

}
