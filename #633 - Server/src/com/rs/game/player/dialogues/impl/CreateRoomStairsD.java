package com.rs.game.player.dialogues.impl;

import com.rs.game.player.content.construction.House.RoomReference;
import com.rs.game.player.content.construction.HouseConstants.Builds;
import com.rs.game.player.content.construction.HouseConstants.Room;
import com.rs.game.player.dialogues.Dialogue;

public class CreateRoomStairsD extends Dialogue {

    private RoomReference room;
    private boolean up;
    
    @Override
    public void start() {
	this.room = (RoomReference) parameters[0];
	up = (boolean) parameters[1];
	sendOptionsDialogue("These stairs do not lead anywhere. Do you want to build a room at the "+(up? "top" : "bottom") +"?", "Yes.", "No.");

    }
    
    @Override
    public void run(int interfaceId, int componentId) {
	if(stage == -1) {
	    if(componentId == OPTION_1) {
		stage = 0;
		if(room.getPlane() == 1 && !up)
		    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Skill hall", "Quest hall", "Dungeon stairs room");
		else
		    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Skill hall", "Quest hall");
		return;
	    }
	}else{
	    Room r = room.getPlane() == 1 && !up && componentId == OPTION_3 ? Room.DUNGEON_STAIRS : 
		componentId == OPTION_2 ? up ? Room.HALL_QUEST_DOWN : Room.HALL_QUEST : up ? Room.HALL_SKILL_DOWN : Room.HALL_SKILL;
	    Builds stair = room.getPlane() == 1 && !up && componentId == OPTION_3 ? Builds.STAIRCASE_2 : 
	  		componentId == OPTION_2 ? up ? Builds.STAIRCASE_DOWN_1 : Builds.STAIRCASE_1 : up ? Builds.STAIRCASE_DOWN : Builds.STAIRCASE;
	    RoomReference newRoom = new RoomReference(r, room.getX(), room.getY(), room.getPlane() + (up ? 1 : -1), room.getRotation());
	    int slot = room.getStaircaseSlot();
	    System.out.println(slot);
	    if(slot != -1) {
		newRoom.addObject(stair, slot);
		player.getHouse().createRoom(newRoom);
	    }
	}
	end();

    }

    @Override
    public void finish() {

    }

}
