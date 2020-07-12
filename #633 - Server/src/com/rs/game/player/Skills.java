package com.rs.game.player;

import java.io.Serializable;

import com.rs.Settings;

public final class Skills implements Serializable {

	private static final long serialVersionUID = -7086829989489745985L;

	public static final double MAXIMUM_EXP = 200000000;
	public static final int ATTACK = 0, DEFENCE = 1, STRENGTH = 2,
			HITPOINTS = 3, RANGE = 4, PRAYER = 5, MAGIC = 6, COOKING = 7,
			WOODCUTTING = 8, FLETCHING = 9, FISHING = 10, FIREMAKING = 11,
			CRAFTING = 12, SMITHING = 13, MINING = 14, HERBLORE = 15,
			AGILITY = 16, THIEVING = 17, SLAYER = 18, FARMING = 19,
			RUNECRAFTING = 20, CONSTRUCTION = 22, HUNTER = 21, SUMMONING = 23,
			DUNGEONEERING = 24;

	public static final String[] SKILL_NAME = { "Attack", "Defence",
			"Strength", "Constitution", "Ranging", "Prayer", "Magic",
			"Cooking", "Woodcutting", "Fletching", "Fishing", "Firemaking",
			"Crafting", "Smithing", "Mining", "Herblore", "Agility",
			"Thieving", "Slayer", "Farming", "Runecrafting", "Hunter",
			"Construction", "Summoning", "Dungeoneering" };

	private short level[];
	private double xp[];
	private int elapsedBonusMinutes;
	private int xpCounter;
	private transient double xpBonusTrack;

	private transient Player player;

	public void passLevels(Player p) {
		this.level = p.getSkills().level;
		this.xp = p.getSkills().xp;
	}

	public Skills() {
		level = new short[25];
		xp = new double[25];
		for (int i = 0; i < level.length; i++) {
			level[i] = 1;
			xp[i] = 0;
		}
		level[3] = 10;
		xp[3] = 1184;
		level[HERBLORE] = 3;
		xp[HERBLORE] = 250;

	}

	public void refreshCounterXp(int counter) {
		// player.getVarsManager().sendVar(counter == 0 ? 1801 : 2474 + counter,
		// (int) (xpTracks[counter] * 10));
	}

	public void restoreSkills() {
		for (int skill = 0; skill < level.length; skill++) {
			level[skill] = (short) getLevelForXp(skill);
			refresh(skill);
		}
	}

	public void setPlayer(Player player) {
		this.player = player;
		// temporary

	}

	public short[] getLevels() {
		return level;
	}

	public double[] getXp() {
		return xp;
	}

	public int getLevel(int skill) {
		return level[skill];
	}

	public double getXp(int skill) {
		return xp[skill];
	}

	public boolean hasRequiriments(int... skills) {
		for (int i = 0; i < skills.length; i += 2) {
			int skillId = skills[i];
			if (skillId == CONSTRUCTION || skillId == DUNGEONEERING
					|| skillId == SLAYER)
				continue;
			int skillLevel = skills[i + 1];
			if (getLevelForXp(skillId) < skillLevel)
				return false;

		}
		return true;
	}

	public int getCombatLevel() {
		int attack = getLevelForXp(0);
		int defence = getLevelForXp(1);
		int strength = getLevelForXp(2);
		int hp = getLevelForXp(3);
		int prayer = getLevelForXp(5);
		int ranged = getLevelForXp(4);
		int magic = getLevelForXp(6);
		int combatLevel = 3;
		combatLevel = (int) ((defence + hp + Math.floor(prayer / 2)) * 0.25) + 1;
		double melee = (attack + strength) * 0.325;
		double ranger = Math.floor(ranged * 1.5) * 0.325;
		double mage = Math.floor(magic * 1.5) * 0.325;
		if (melee >= ranger && melee >= mage) {
			combatLevel += melee;
		} else if (ranger >= melee && ranger >= mage) {
			combatLevel += ranger;
		} else if (mage >= melee && mage >= ranger) {
			combatLevel += mage;
		}
		return combatLevel;
	}

	public void set(int skill, int newLevel) {
		level[skill] = (short) newLevel;
		refresh(skill);
	}

	public int drainLevel(int skill, int drain) {
		int drainLeft = drain - level[skill];
		if (drainLeft < 0) {
			drainLeft = 0;
		}
		level[skill] -= drain;
		if (level[skill] < 0) {
			level[skill] = 0;
		}
		refresh(skill);
		return drainLeft;
	}

	public int getCombatLevelWithSummoning() {
		return getCombatLevel() + getSummoningCombatLevel();
	}

	public int getSummoningCombatLevel() {
		return getLevelForXp(Skills.SUMMONING) / 8;
	}

	public void drainSummoning(int amt) {
		int level = getLevel(Skills.SUMMONING);
		if (level == 0)
			return;
		set(Skills.SUMMONING, amt > level ? 0 : level - amt);
	}

	public static int getXPForLevel(int level) {
		int points = 0;
		int output = 0;
		for (int lvl = 1; lvl <= level; lvl++) {
			points += Math.floor(lvl + 300.0 * Math.pow(2.0, lvl / 7.0));
			if (lvl >= level) {
				return output;
			}
			output = (int) Math.floor(points / 4);
		}
		return 0;
	}

	public int getLevelForXp(int skill) {
		double exp = xp[skill];
		int points = 0;
		int output = 0;
		for (int lvl = 1; lvl <= (skill == DUNGEONEERING ? 120 : 99); lvl++) {
			points += Math.floor(lvl + 300.0 * Math.pow(2.0, lvl / 7.0));
			output = (int) Math.floor(points / 4);
			if ((output - 1) >= exp) {
				return lvl;
			}
		}
		return skill == DUNGEONEERING ? 120 : 99;
	}

	public void init() {
		for (int skill = 0; skill < level.length; skill++)
			refresh(skill);
		
		refreshXpCounter();
		if (!Settings.XP_BONUS_ENABLED)
			elapsedBonusMinutes = 0;
		else
			refreshXpBonus();
		
	}

	private double getXpBonusMultiplier() {
		if (elapsedBonusMinutes >= 600)
			return 1.1;
		double hours = elapsedBonusMinutes / 60;
		return Math.pow((hours - 10) / 7.5, 2) + 1.1;
	}

	public void refreshBonusXp() {
		player.getVarsManager().sendVar(1878, (int) (xpBonusTrack * 10)); // TODO
																			// find
																			// bonus
	}

	public void refreshXpBonus() {
		player.getVarsManager().sendVarBit(7232, 1); // TODO find bonus
		refreshElapsedBonusMinutes();
		refreshBonusXp();
	}

	public void increaseElapsedBonusMinues() {
		elapsedBonusMinutes++;
		refreshElapsedBonusMinutes();
	}

	public void refreshElapsedBonusMinutes() {
		player.getVarsManager().sendVarBit(7233, elapsedBonusMinutes);
	}

	public void refresh(int skill) {
		player.getPackets().sendSkillLevel(skill);
	}

	/*
	 * if(componentId == 33) setCounterSkill(4); else if(componentId == 34)
	 * setCounterSkill(2); else if(componentId == 35) setCounterSkill(3); else
	 * if(componentId == 42) setCounterSkill(18); else if(componentId == 49)
	 * setCounterSkill(11);
	 */

	public double addXp(int skill, double exp) {
		int rate = skill == ATTACK || skill == STRENGTH || skill == DEFENCE
				|| skill == HITPOINTS || skill == MAGIC || skill == RANGE
				|| skill == SUMMONING ? Settings.COMBAT_XP_RATE
				: Settings.XP_RATE;
		exp *= player.isExtremeDonator() ? rate + 2
				: player.isDonator() ? rate + 1 : rate;
		return addXpNormal(skill, exp);
	}

	public double addXpNormal(int skill, double exp) {
		player.getControlerManager().trackXP(skill, (int) exp);
		if (player.isXpLocked())
			return 0;
		if (player.getAuraManager().usingWisdom())
			exp *= 1.025;
		if (Settings.XP_BONUS_ENABLED) {
			double newexp = exp * getXpBonusMultiplier();
			xpBonusTrack += newexp - exp;
			exp = newexp;
			refreshBonusXp();
		}
		int oldLevel = getLevelForXp(skill);
		xp[skill] += exp;
		xpCounter += exp;
		refreshXpCounter();

		if (xp[skill] > MAXIMUM_EXP) {
			xp[skill] = MAXIMUM_EXP;
		}
		int newLevel = getLevelForXp(skill);
		int levelDiff = newLevel - oldLevel;
		if (newLevel > oldLevel) {
			level[skill] += levelDiff;
			player.getDialogueManager().startDialogue("LevelUp", skill);
			if (skill == SUMMONING || (skill >= ATTACK && skill <= MAGIC)) {
				player.getAppearence().generateAppearenceData();
				if (skill == HITPOINTS)
					player.heal(levelDiff * 10);
				else if (skill == PRAYER)
					player.getPrayer().restorePrayer(levelDiff * 10);
			}
			player.getQuestManager().checkCompleted();
		}
		refresh(skill);
		return exp;
	}

	public double addXpLamp(int skill, double exp) {
		player.getControlerManager().trackXP(skill, (int) exp);
		if (player.isXpLocked())
			return 0;
		exp *= Settings.LAMP_XP_RATE;
		int oldLevel = getLevelForXp(skill);
		xp[skill] += exp;
		xpCounter += exp;
		refreshXpCounter();

		if (xp[skill] > MAXIMUM_EXP) {
			xp[skill] = MAXIMUM_EXP;
		}
		int newLevel = getLevelForXp(skill);
		int levelDiff = newLevel - oldLevel;
		if (newLevel > oldLevel) {
			level[skill] += levelDiff;
			player.getDialogueManager().startDialogue("LevelUp", skill);
			if (skill == SUMMONING || (skill >= ATTACK && skill <= MAGIC)) {
				player.getAppearence().generateAppearenceData();
				if (skill == HITPOINTS)
					player.heal(levelDiff * 10);
				else if (skill == PRAYER)
					player.getPrayer().restorePrayer(levelDiff * 10);
			}
			player.getQuestManager().checkCompleted();
		}
		refresh(skill);
		return exp;
	}

	public void addSkillXpRefresh(int skill, double xp) {
		this.xp[skill] += xp;
		level[skill] = (short) getLevelForXp(skill);
	}

	public void resetSkillNoRefresh(int skill) {
		xp[skill] = 0;
		level[skill] = 1;
	}

	public void setXp(int skill, double exp) {
		xp[skill] = exp;
		refresh(skill);
	}

	public void refreshXpCounter() {
		player.getVarsManager().sendVar(1801, (int) (xpCounter * 10D));
	}

	public void resetXpCounter() {
		xpCounter = 0;
		refreshXpCounter();
	}
	
	public int getXpCounter() {
		return xpCounter;
	}


}
