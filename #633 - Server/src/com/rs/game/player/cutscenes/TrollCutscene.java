package com.rs.game.player.cutscenes;

import java.util.ArrayList;

import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.player.Player;
import com.rs.game.player.cutscenes.actions.CreateNPCAction;
import com.rs.game.player.cutscenes.actions.CutsceneAction;
import com.rs.game.player.cutscenes.actions.CutsceneCodeAction;
import com.rs.game.player.cutscenes.actions.DestroyCachedObjectAction;
import com.rs.game.player.cutscenes.actions.NPCAnimationAction;
import com.rs.game.player.cutscenes.actions.NPCFaceTileAction;
import com.rs.game.player.cutscenes.actions.NPCForceTalkAction;
import com.rs.game.player.cutscenes.actions.NPCGraphicAction;
import com.rs.game.player.dialogues.Dialogue;

public class TrollCutscene extends Cutscene {

    @Override
    public boolean hiddenMinimap() {
	return false;
    }

    private static int DRAGONKK = 1, APACHE = 2;

    @Override
    public CutsceneAction[] getActions(final Player player) {
	ArrayList<CutsceneAction> actionsList = new ArrayList<CutsceneAction>();
	
	actionsList.add(new CutsceneCodeAction(new Runnable() { public void run() { } }, 6));
	actionsList.add(new CutsceneCodeAction(new Runnable() { 
	    public void run() { 
		player.getDialogueManager().finishDialogue();
		Dialogue.sendEmptyDialogue(player);
	    } 
	}, -1));
	actionsList.add(new CreateNPCAction(DRAGONKK, 15784, 3092, 3497, 0, "Vision of dragonkk", 1337, -1));
	actionsList.add(new CreateNPCAction(APACHE, 15783, 3093, 3497, 0, "Apache ah64", -1, -1));
	actionsList.add(new NPCFaceTileAction(DRAGONKK, 3903, 3497, -1));
	actionsList.add(new NPCFaceTileAction(APACHE, 3902, 3497, -1));
	
	actionsList.add(new NPCForceTalkAction(DRAGONKK, "It's time for you to die apache!", 4));
	actionsList.add(new NPCForceTalkAction(APACHE, "Noooooooooo, please, i will kiss your ass all day!", 4));
	actionsList.add(new NPCForceTalkAction(DRAGONKK, "Fucking die!", 4));
	actionsList.add(new NPCAnimationAction(APACHE, new Animation(17542), -1));
	actionsList.add(new NPCGraphicAction(APACHE, new Graphics(3402), 13));
	actionsList.add(new DestroyCachedObjectAction(APACHE, -1));
	actionsList.add(new NPCFaceTileAction(DRAGONKK, player.getX(), player.getY(), -1));
	actionsList.add(new NPCForceTalkAction(DRAGONKK, "And you, " + player.getDisplayName() + ", stop looking at me!", 4));
	return actionsList.toArray(new CutsceneAction[actionsList.size()]);
    }
    
    @Override
    public void stopCutscene(Player player) {
	player.getPackets().sendOpenURL("http://www.youtube.com/watch?v=cbJ89efvKqM");
	super.stopCutscene(player);
    }
    

}
