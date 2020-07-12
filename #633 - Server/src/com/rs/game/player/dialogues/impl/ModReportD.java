package com.rs.game.player.dialogues.impl;

import com.rs.game.player.Player;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.IPBanL;
import com.rs.utils.Utils;

public class ModReportD extends Dialogue {

    private Player target;

    @Override
    public void start() {
	target = (Player) parameters[0];
	sendOptionsDialogue("How do you want to punish " + target.getDisplayName() + "?", "Mute 1 Hour.", "Mute 48 Hours.", "Ban 48 Hours.", "Ban Permanently!", "Ban ip adress + account Permanently!");
    }

    @Override
    public void run(int interfaceId, int componentId) {
	switch (componentId) {
	    case OPTION_1:
		target.setMuted(Utils.currentTimeMillis() + (1 * 60 * 60 * 1000));
		target.getPackets().sendGameMessage("You've been muted for 1 hour by " + player.getDisplayName() + ".");
		player.getPackets().sendGameMessage("You've muted " + target.getDisplayName() + " for 1 hour.");
		break;
	    case OPTION_2:
		target.setMuted(Utils.currentTimeMillis() + (48 * 60 * 60 * 1000));
		target.getPackets().sendGameMessage("You've been muted for 48 hours by " + player.getDisplayName() + ".");
		player.getPackets().sendGameMessage("You've muted " + target.getDisplayName() + " for 48 hours.");
		break;
	    case OPTION_3:
		target.setBanned(Utils.currentTimeMillis() + (48 * 60 * 60 * 1000));
		target.getSession().getChannel().close();
		player.getPackets().sendGameMessage("You've banned " + target.getDisplayName() + " for 48 hours.");
		break;
	    case OPTION_4:
		target.setPermBanned(true);
		target.getSession().getChannel().close();
		player.getPackets().sendGameMessage("You've banned " + target.getDisplayName() + "  permanently.");
		break;
	    case OPTION_5:
		target.setPermBanned(true);
		IPBanL.ban(target, true);
		player.getPackets().sendGameMessage("You've banned " + target.getDisplayName() + "  permanently.");
		break;
	}
	end();
    }

    @Override
    public void finish() {

    }

}
