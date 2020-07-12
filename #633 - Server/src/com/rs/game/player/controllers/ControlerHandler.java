package com.rs.game.player.controllers;

import java.util.HashMap;

import com.rs.game.minigames.BrimhavenAgility;
import com.rs.game.minigames.PuroPuro;
import com.rs.game.minigames.WarriorsGuild;
import com.rs.game.minigames.clanwars.FfaZone;
import com.rs.game.minigames.clanwars.RequestController;
import com.rs.game.minigames.clanwars.WarControler;
import com.rs.game.minigames.duel.DuelArena;
import com.rs.game.minigames.duel.DuelControler;
import com.rs.game.player.controllers.castlewars.CastleWarsPlaying;
import com.rs.game.player.controllers.castlewars.CastleWarsWaiting;
import com.rs.game.player.controllers.events.DeathEvent;
import com.rs.game.player.controllers.fightpits.FightPitsArena;
import com.rs.game.player.controllers.fightpits.FightPitsLobby;
import com.rs.game.player.controllers.pestcontrol.PestControlGame;
import com.rs.game.player.controllers.pestcontrol.PestControlLobby;
import com.rs.utils.Logger;

public class ControlerHandler {

	private static final HashMap<Object, Class<? extends Controller>> handledControlers = new HashMap<Object, Class<? extends Controller>>();

	@SuppressWarnings("unchecked")
	public static final void init() {
		try {
			Class<Controller> value1 = (Class<Controller>) Class
					.forName(Wilderness.class.getCanonicalName());
			handledControlers.put("Wilderness", value1);
			Class<Controller> value2 = (Class<Controller>) Class
					.forName(Kalaboss.class.getCanonicalName());
			handledControlers.put("Kalaboss", value2);
			Class<Controller> value4 = (Class<Controller>) Class
					.forName(GodWars.class.getCanonicalName());
			handledControlers.put("GodWars", value4);
			Class<Controller> value5 = (Class<Controller>) Class
					.forName(ZGDControler.class.getCanonicalName());
			handledControlers.put("ZGDControler", value5);
			Class<Controller> value9 = (Class<Controller>) Class
					.forName(DuelArena.class.getCanonicalName());
			handledControlers.put("DuelArena", value9);
			Class<Controller> value10 = (Class<Controller>) Class
					.forName(DuelControler.class.getCanonicalName());
			handledControlers.put("DuelControler", value10);
			Class<Controller> value11 = (Class<Controller>) Class
					.forName(CorpBeastControler.class.getCanonicalName());
			handledControlers.put("CorpBeastControler", value11);
			Class<Controller> value14 = (Class<Controller>) Class
					.forName(DTControler.class.getCanonicalName());
			handledControlers.put("DTControler", value14);
			Class<Controller> value15 = (Class<Controller>) Class
					.forName(JailControler.class.getCanonicalName());
			handledControlers.put("JailControler", value15);
			Class<Controller> value17 = (Class<Controller>) Class
					.forName(CastleWarsPlaying.class.getCanonicalName());
			handledControlers.put("CastleWarsPlaying", value17);
			Class<Controller> value18 = (Class<Controller>) Class
					.forName(CastleWarsWaiting.class.getCanonicalName());
			handledControlers.put("CastleWarsWaiting", value18);
			handledControlers.put("DungeonControler", DungeonControler.class);
			handledControlers.put("clan_wars_request",
					(Class<Controller>) Class.forName(RequestController.class
							.getCanonicalName()));
			handledControlers.put("clan_war", (Class<Controller>) Class
					.forName(WarControler.class.getCanonicalName()));
			handledControlers.put("clan_wars_ffa", (Class<Controller>) Class
					.forName(FfaZone.class.getCanonicalName()));
			handledControlers.put("NomadsRequiem", (Class<Controller>) Class
					.forName(NomadsRequiem.class.getCanonicalName()));
			handledControlers.put("BorkControler", (Class<Controller>) Class
					.forName(BorkControler.class.getCanonicalName()));
			handledControlers.put("BrimhavenAgility", (Class<Controller>) Class
					.forName(BrimhavenAgility.class.getCanonicalName()));
			handledControlers.put("FightCavesControler",
					(Class<Controller>) Class.forName(FightCaves.class
							.getCanonicalName()));
			handledControlers.put("FightKilnControler",
					(Class<Controller>) Class.forName(FightKiln.class
							.getCanonicalName()));
			handledControlers.put("FightPitsLobby", (Class<Controller>) Class
					.forName(FightPitsLobby.class.getCanonicalName()));
			handledControlers.put("FightPitsArena", (Class<Controller>) Class
					.forName(FightPitsArena.class.getCanonicalName()));
			handledControlers.put("PestControlGame", (Class<Controller>) Class
					.forName(PestControlGame.class.getCanonicalName()));
			handledControlers.put("PestControlLobby", (Class<Controller>) Class
					.forName(PestControlLobby.class.getCanonicalName()));
			handledControlers.put("Barrows", (Class<Controller>) Class
					.forName(Barrows.class.getCanonicalName()));
			handledControlers.put("Falconry", (Class<Controller>) Class
					.forName(Falconry.class.getCanonicalName()));
			handledControlers.put("QueenBlackDragonControler",
					(Class<Controller>) Class
							.forName(QueenBlackDragonController.class
									.getCanonicalName()));
			handledControlers.put("HouseControler", (Class<Controller>) Class
					.forName(HouseControler.class.getCanonicalName()));
			handledControlers.put("RuneSpanControler",
					(Class<Controller>) Class.forName(RunespanControler.class
							.getCanonicalName()));
			handledControlers.put("DeathEvent", (Class<Controller>) Class
					.forName(DeathEvent.class.getCanonicalName()));
			handledControlers.put("SorceressGarden", (Class<Controller>) Class
					.forName(SorceressGarden.class.getCanonicalName()));
			handledControlers.put("CrucibleControler",
					(Class<Controller>) Class.forName(CrucibleControler.class
							.getCanonicalName()));
			handledControlers.put("NewPlayerController",
					(Class<Controller>) Class.forName(NewPlayerController.class
							.getCanonicalName()));
			handledControlers.put("PuroPuro", (Class<Controller>) Class
					.forName(PuroPuro.class.getCanonicalName()));
			handledControlers.put("RuneEssenceController",
					(Class<Controller>) Class
							.forName(RuneEssenceController.class
									.getCanonicalName()));
			handledControlers.put("UnderGroundDungeon",
					(Class<Controller>) Class.forName(UnderGroundDungeon.class
							.getCanonicalName()));
			handledControlers.put("TerrorDogsTarnsLairController",
					(Class<Controller>) Class
							.forName(TerrorDogsTarnsLairController.class
									.getCanonicalName()));
			handledControlers.put("WarriorsGuild", (Class<Controller>) Class
					.forName(WarriorsGuild.class.getCanonicalName()));
			handledControlers.put("JadinkoLair", (Class<Controller>) Class
					.forName(JadinkoLair.class.getCanonicalName()));
			// handledControlers.put("SlaughterFieldsControler",
			// (Class<Controller>)
			// Class.forName(SlaughterFieldsControler.class.getCanonicalName()));
		} catch (Throwable e) {
			Logger.handle(e);
		}
	}

	public static final void reload() {
		handledControlers.clear();
		init();
	}

	public static final Controller getControler(Object key) {
		if (key instanceof Controller)
			return (Controller) key;
		Class<? extends Controller> classC = handledControlers.get(key);
		if (classC == null)
			return null;
		try {
			return classC.newInstance();
		} catch (Throwable e) {
			Logger.handle(e);
		}
		return null;
	}
}
