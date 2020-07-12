package com.rs.game.player.dialogues.impl;

import java.util.LinkedList;
import java.util.List;

import com.rs.game.player.dialogues.Dialogue;

/**
 * 
 * @author Khaled
 *
 */
public class MindSpikeD extends Dialogue {

    private static final String[] NAMES = { "Air", "Water", "Earth", "Fire" };

    private int slot;
    private List<String> options;

    @Override
    public void start() {
	int index = (int) this.parameters[0] - 23044;
	slot = (int) this.parameters[1];
	options = new LinkedList<String>();
	for (int i = 0; i < NAMES.length; i++) {
	    if (i == index)
		continue;
	    options.add(NAMES[i]);
	}
	options.add("None");
	sendOptionsDialogue("What would you like to bind?", options.toArray(new String[3]));
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (componentId != OPTION_4) {
	    player.getInventory().replaceItem(getTransformationForId(componentId == OPTION_1 ? 0 : componentId == OPTION_2 ? 1 : 2), 1, slot);
	    player.getPackets().sendGameMessage("You alter your staff's elemental alignment.");
	}
	end();
    }

    private int getTransformationForId(int index) {
	String selected = options.get(index);
	for (int i = 0; i < NAMES.length; i++) {
	    if (selected == NAMES[i])
		return 23044 + i;
	}
	return -1;
    }

    @Override
    public void finish() {

    }
}
