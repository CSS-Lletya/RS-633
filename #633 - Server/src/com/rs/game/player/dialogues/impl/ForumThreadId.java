package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

public class ForumThreadId extends Dialogue {

    @Override
    public void start() {
	player.getInterfaceManager().sendChatBoxInterface(1100);
    }

    @Override
    public void run(int interfaceId, int componentId) {
	end();

    }

    @Override
    public void finish() {

    }

}
