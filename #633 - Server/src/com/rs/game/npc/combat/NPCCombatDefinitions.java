package com.rs.game.npc.combat;


public class NPCCombatDefinitions {

    public static final int MELEE = 0;
    public static final int RANGE = 1;
    public static final int MAGE = 2;
    public static final int RANGE_FOLLOW = 3;
    public static final int MAGE_FOLLOW = 4;
    public static final int PASSIVE = 0;
    public static final int AGRESSIVE = 1;

    // public static final int MELEE = 0, RANGE = 1, MAGIC = 2, RANGE_FOLLOW =
    // 3, , RANGE_FOLLOW = 4;

    private int hitpoints;
    private int attackAnim;
    private int defenceAnim;
    private int deathAnim;
    private int attackDelay;
    private int deathDelay;
    private int respawnDelay;
    private int maxHit;
    private int attackStyle;
    private int attackGfx;
    private int attackProjectile;
    private int agressivenessType;
    private int agroRatio;

    public NPCCombatDefinitions(int hitpoints, int attackAnim, int defenceAnim, int deathAnim, int attackDelay, int deathDelay, int respawnDelay, int maxHit, int attackStyle, int attackGfx, int attackProjectile, int agressivenessType, int agroRatio) {
	this.hitpoints = hitpoints;
	this.attackAnim = attackAnim;
	this.defenceAnim = defenceAnim;
	this.deathAnim = deathAnim;
	this.attackDelay = attackDelay;
	this.deathDelay = deathDelay;
	this.respawnDelay = respawnDelay;
	this.maxHit = maxHit;
	this.attackStyle = attackStyle;
	this.attackGfx = attackGfx;
	this.attackProjectile = attackProjectile;
	this.agressivenessType = agressivenessType;
	this.agroRatio = agroRatio;
    }

    public int getRespawnDelay() {
	return respawnDelay;
    }

    public int getDeathEmote() {
	return deathAnim;
    }

    public int getDefenceEmote() {
	return defenceAnim;
    }

    public int getAttackEmote() {
	return attackAnim;
    }

    public int getAttackGfx() {
	return attackGfx;
    }

    public int getAgressivenessType() {
	return agressivenessType;
    }

    public int getAttackProjectile() {
	return attackProjectile;
    }

    public int getAttackStyle() {
	return attackStyle;
    }

    public int getAttackDelay() {
	return attackDelay;
    }

    public void setHitpoints(int amount) {
	this.hitpoints = amount;
    }

    public int getMaxHit() {
	return maxHit;
    }

    public int getHitpoints() {
	return hitpoints;
    }

    public int getDeathDelay() {
	return deathDelay;
    }

    public int getAgroRatio() {
	return agroRatio;
    }
}
