package com.rs.game.player.dialogues.impl;

import com.rs.game.minigames.WarriorsGuild;
import com.rs.game.player.dialogues.Dialogue;

public class KamfreendaDefender extends Dialogue {

    private int npcId = 4289;

    @Override
    public void start() {
	if (WarriorsGuild.getBestDefender(player) == 8844)
	    sendNPCDialogue(npcId, NORMAL, "It seems that you do not have a defender.");
	else
	    sendNPCDialogue(npcId, NORMAL, "Ah, I see that you have one of the defenders already! Well done.");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	stage++;
	if (stage == 0)
	    sendNPCDialogue(npcId, NORMAL, "I'll release some cyclopses that might drop the next defender for you. Have fun in there.");
	else if (stage == 1)
	    sendNPCDialogue(npcId, NORMAL, "Oh, and be careful; the cyclopses will occasionally summon a cyclossus. They are rather mean and can only be hurt with a rune or dragon defender.");
	else if (stage == 2) {
	    end();
	    player.getInterfaceManager().sendInterface(1058);

	}
    }

    @Override
    public void finish() {

    }
}
