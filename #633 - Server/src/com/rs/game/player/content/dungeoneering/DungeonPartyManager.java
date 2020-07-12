package com.rs.game.player.content.dungeoneering;

import java.util.concurrent.CopyOnWriteArrayList;

import com.rs.game.player.Player;
import com.rs.game.player.Skills;

@SuppressWarnings("unused")
public final class DungeonPartyManager {

    private String leader; // username
    private int floor;
    private int complexity;
    private int size;
    private CopyOnWriteArrayList<DungeonPartyPlayer> team;
    private DungeonManager dungeon;

    public DungeonPartyManager(Player player, Player[] otherPlayers, int size) {
	this.size = size;
	leader = player.getUsername();
	team = new CopyOnWriteArrayList<DungeonPartyPlayer>();
	for (Player p : otherPlayers)
	    team.add(new DungeonPartyPlayer(p));
	setDefaults();
	start(size); // temporary
    }

    public void setDefaults() {
	floor = 1;
	complexity = 6;
    }

    public void remove(DungeonPartyPlayer dungeonPartyPlayer) {
	team.remove(dungeonPartyPlayer);
	if (dungeon != null && team.size() == 0)
	    dungeon.destroy();
    }

    public void lockParty() {
	for (DungeonPartyPlayer player : team)
	    player.getPlayer().lock();
    }

    public void start(int size) {
	if (dungeon != null)
	    return;
	dungeon = new DungeonManager(this, size);
    }

    public int getComplexity() {
	return complexity;
    }

    public int getFloor() {
	return floor;
    }

    public int getFloorType() {
	return DungeonUtils.getFloorType(floor);
    }

    public int getDungeoneeringLevel() {
	int level = 120;
	for (DungeonPartyPlayer player : team) {
	    int playerLevel = player.getPlayer().getSkills().getLevelForXp(Skills.DUNGEONEERING);
	    if (playerLevel < level)
		level = playerLevel;
	}
	return level;
    }

    public DungeonPartyPlayer getDPlayer(Player player) {
	for (DungeonPartyPlayer p : team)
	    if (p.getPlayer() == player)
		return p;
	return null;
    }

    public int getCombatLevel() {
	int level = 0;
	for (DungeonPartyPlayer player : team)
	    level += player.getPlayer().getSkills().getCombatLevelWithSummoning();
	return level;
    }

    public int getDefenceLevel() {
	int level = 0;
	for (DungeonPartyPlayer player : team)
	    level += player.getPlayer().getSkills().getLevelForXp(Skills.DEFENCE);
	return level / team.size();
    }

    public int getAttackLevel() {
	int level = 0;
	for (DungeonPartyPlayer player : team)
	    level += player.getPlayer().getSkills().getLevelForXp(Skills.ATTACK);
	return level / team.size();
    }

    public int getMagicLevel() {
	int level = 0;
	for (DungeonPartyPlayer player : team)
	    level += player.getPlayer().getSkills().getLevelForXp(Skills.MAGIC);
	return level / team.size();
    }

    public int getRangeLevel() {
	int level = 0;
	for (DungeonPartyPlayer player : team)
	    level += player.getPlayer().getSkills().getLevelForXp(Skills.RANGE);
	return level / team.size();
    }

    public CopyOnWriteArrayList<DungeonPartyPlayer> getTeam() {
	return team;
    }

}
