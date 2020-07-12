package com.rs.game.player;

public class AssistManager {

    private static final byte[] SKILL_ORDER = { Skills.RUNECRAFTING, Skills.CRAFTING, Skills.FLETCHING, Skills.CONSTRUCTION, Skills.FARMING, Skills.MAGIC, Skills.SMITHING, Skills.COOKING, Skills.HERBLORE };

    private Player player, assistor;
    private int[] assistedSkills;
    private double[] collectedExperience;

    public AssistManager(Player player, Player assistor) { //gfx 1247
	this.player = player;
	this.assistor = assistor;
	fillArray();
    }

    private void fillArray() {
	int index = -1;
	for (int skill : SKILL_ORDER) {
	    index++;
	    assistedSkills[index] = assistor.getSkills().getLevel(skill);
	}
    }

    public int getTotalExperience() {
	int total = 0;
	for (double exp : collectedExperience) {
	    total += exp;
	}
	return total;
    }
}
