package com.rs.game.player;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.rs.utils.Utils;

public final class QuestManager implements Serializable {

	private static final long serialVersionUID = -8085932531253271252L;

	public static enum Quests {
		THE_TALE_OF_THE_MUSPAH, PERIL_OF_ICE_MONTAINS, VOID_STARES_BACK, NOMADS_REQUIEM, KINGS_RANSOM, ELEMENTAL_WORKSHOP_I, IN_SEARCH_OF_THE_MYREQUE, LEGENDS_QUEST, HEROES_QUEST, THE_SLUG_MENACE, LUNAR_DIPLOMACY, FAIRY_RING_III, FAMILY_CREST, THE_EYES_OF_GLOUPHIE;
	}

	private transient Player player;
	private List<Quests> completedQuests;
	private HashMap<Quests, Integer> questStages;

	public QuestManager() {
		completedQuests = new ArrayList<Quests>();
	}

	public void setPlayer(Player player) {
		this.player = player;
		if (questStages == null)
			questStages = new HashMap<Quests, Integer>();
	}

	public int getQuestStage(Quests quest) {
		if (completedQuests.contains(quest))
			return -1;
		Integer stage = questStages.get(quest);
		return stage == null ? -2 : stage;
	}

	public void setQuestStageAndRefresh(Quests quest, int stage) {
		setQuestStage(quest, stage);
		sendStageData(quest);
	}

	public void setQuestStage(Quests quest, int stage) {
		if (completedQuests.contains(quest))
			return;
		questStages.put(quest, stage);
	}

	public void init() {
		checkCompleted(); // temporary
		for (Quests quest : completedQuests)
			sendCompletedQuestsData(quest);
		for (Quests quest : questStages.keySet())
			sendStageData(quest);
	}

	public void checkCompleted() {
		if (!completedQuests.contains(Quests.PERIL_OF_ICE_MONTAINS)
				&& player.getSkills().hasRequiriments(Skills.CONSTRUCTION, 10,
						Skills.FARMING, 10, Skills.HUNTER, 10, Skills.THIEVING,
						11))
			completeQuest(Quests.PERIL_OF_ICE_MONTAINS);
		if (!completedQuests.contains(Quests.VOID_STARES_BACK)
				&& player.getSkills().hasRequiriments(Skills.MAGIC, 80,
						Skills.ATTACK, 78, Skills.STRENGTH, 78,
						Skills.FIREMAKING, 71, Skills.CONSTRUCTION, 70,
						Skills.CRAFTING, 70, Skills.SMITHING, 70,
						Skills.SUMMONING, 55, Skills.DEFENCE, 10))
			completeQuest(Quests.VOID_STARES_BACK);
		if (!completedQuests.contains(Quests.KINGS_RANSOM)
				&& player.getSkills().hasRequiriments(Skills.MAGIC, 45,
						Skills.DEFENCE, 65))
			completeQuest(Quests.KINGS_RANSOM);
		if (!completedQuests.contains(Quests.THE_TALE_OF_THE_MUSPAH)
				&& player.getSkills().hasRequiriments(Skills.FIREMAKING, 6,
						Skills.MINING, 8, Skills.MAGIC, 10, Skills.WOODCUTTING,
						10))
			completeQuest(Quests.THE_TALE_OF_THE_MUSPAH);
		if (!completedQuests.contains(Quests.ELEMENTAL_WORKSHOP_I)
				&& player.getSkills().hasRequiriments(Skills.MINING, 20,
						Skills.SMITHING, 20, Skills.CRAFTING, 20))
			completeQuest(Quests.ELEMENTAL_WORKSHOP_I);
		if (!completedQuests.contains(Quests.IN_SEARCH_OF_THE_MYREQUE)
				&& player.getSkills().hasRequiriments(Skills.AGILITY, 25))
			completeQuest(Quests.IN_SEARCH_OF_THE_MYREQUE);
		if (!completedQuests.contains(Quests.LEGENDS_QUEST)
				&& player.getSkills().hasRequiriments(Skills.AGILITY, 50,
						Skills.CRAFTING, 50, Skills.HERBLORE, 45, Skills.MAGIC,
						56, Skills.MINING, 52, Skills.PRAYER, 42,
						Skills.SMITHING, 50, Skills.STRENGTH, 50,
						Skills.THIEVING, 50, Skills.WOODCUTTING, 50))
			completeQuest(Quests.LEGENDS_QUEST);
		if (!completedQuests.contains(Quests.HEROES_QUEST)
				&& player.getSkills().hasRequiriments(Skills.COOKING, 53,
						Skills.FISHING, 53, Skills.HERBLORE, 25, Skills.MINING,
						50))
			completeQuest(Quests.HEROES_QUEST);
		if (!completedQuests.contains(Quests.THE_SLUG_MENACE)
				&& player.getSkills().hasRequiriments(Skills.CRAFTING, 30,
						Skills.RUNECRAFTING, 30, Skills.SLAYER, 30,
						Skills.THIEVING, 30))
			completeQuest(Quests.THE_SLUG_MENACE);
		if (!completedQuests.contains(Quests.LUNAR_DIPLOMACY)
				&& player.getSkills().hasRequiriments(Skills.CRAFTING, 61,
						Skills.DEFENCE, 40, Skills.FIREMAKING, 49,
						Skills.MINING, 60, Skills.HERBLORE, 5, Skills.MAGIC,
						65, Skills.WOODCUTTING, 55))
			completeQuest(Quests.LUNAR_DIPLOMACY);
		if (!completedQuests.contains(Quests.FAIRY_RING_III)
				&& player.getSkills().hasRequiriments(Skills.MAGIC, 59,
						Skills.FARMING, 54, Skills.THIEVING, 51,
						Skills.SUMMONING, 37, Skills.CRAFTING, 36))
			completeQuest(Quests.FAIRY_RING_III);
		if (!completedQuests.contains(Quests.FAMILY_CREST)
				&& player.getSkills().hasRequiriments(Skills.CRAFTING, 40,
						Skills.SMITHING, 40, Skills.MINING, 40, Skills.MAGIC,
						59))
			completeQuest(Quests.FAMILY_CREST);
		if (!completedQuests.contains(Quests.THE_EYES_OF_GLOUPHIE)
				&& player.getSkills().hasRequiriments(Skills.CONSTRUCTION, 5,
						Skills.MAGIC, 46))
			completeQuest(Quests.THE_EYES_OF_GLOUPHIE);
	}

	public void completeQuest(Quests quest) {
		completedQuests.add(quest);
		questStages.remove(quest);
		sendCompletedQuestsData(quest);
		player.getPackets().sendGameMessage(
				"<col=ff0000>You have completed quest: "
						+ Utils.formatPlayerNameForDisplay(quest.toString())
						+ ".");
		// message completed quest
	}

	public void sendCompletedQuestsData(Quests quest) {
		switch (quest) {
		case PERIL_OF_ICE_MONTAINS:
			player.getVarsManager().sendVarBit(4684, 150);
			break;
		case NOMADS_REQUIEM:
			player.getVarsManager().sendVarBit(6982, 1);
			break;
		case KINGS_RANSOM:
			player.getVarsManager().sendVarBit(3910, 1);
			break;
		case FAIRY_RING_III:
			player.getVarsManager().sendVarBit(7856, 1);
			player.getVarsManager().sendVarBit(7857, 1);
			break;
		case THE_EYES_OF_GLOUPHIE:
			player.getVarsManager().sendVarBit(2503, 1);
			break;
		default:
			break;
		}
	}

	private void sendStageData(Quests quest) {
		switch (quest) {
		case NOMADS_REQUIEM:
			player.getVarsManager().sendVarBit(6962, 3);
			break;
		default:
			break;
		}
	}

	public boolean completedQuest(Quests quest) {
		return completedQuests.contains(quest);
	}
}
