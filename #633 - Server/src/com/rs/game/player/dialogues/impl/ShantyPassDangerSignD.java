package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

public class ShantyPassDangerSignD extends Dialogue {

    @Override
    public void start() {
	sendDialogue("The warning signs in front of the huge stone gate state:");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	switch(stage) {
	    case -1:
		stage = 0;
		sendDialogue("<col=800000>The Kharidian Desert is a VERY dangerous place. Beware of high<br><col=800000>temperatures, sandstorms, quicksand, bandits, slavers, kalphites,<br><col=800000>monkeys, crocodiles, and acts of vengeful goddesses bent on the total<br><col=800000>destruction of all life in the desert.");
		break;
	    case 0:
		stage = 1;
		sendDialogue("No responsibility is taken by Shantay if anything bad should happen to you<br>under any circumstances whatsoever.");
		break;
	    case 1:
		stage = 2;
		sendDialogue("Despite this warning, lots of people seem to pass through the gate.");
		break;
	    default:
		end();
		break;
	}
    }

    @Override
    public void finish() {

    }

}
