package com.rs.net.decoders;

import com.rs.Settings;
import com.rs.game.World;
import com.rs.game.player.Player;
import com.rs.io.InputStream;
import com.rs.net.Session;
import com.rs.utils.AntiFlood;
import com.rs.utils.Encrypt;
import com.rs.utils.IPBanL;
import com.rs.utils.IsaacKeyPair;
import com.rs.utils.Logger;
import com.rs.utils.MachineInformation;
import com.rs.utils.SerializableFilesManager;
import com.rs.utils.Utils;

public final class LoginPacketsDecoder extends Decoder {

	private static final Object LOGIN_LOCK = new Object();

	public LoginPacketsDecoder(Session session) {
		super(session);
	}

	@Override
	public void decode(InputStream stream) {
		session.setDecoder(-1);
		if (IPBanL.isBanned(session.getIP())) {
			session.getLoginPackets().sendClientPacket(26);
			return;
		}
		if (World.exiting_start != 0) {
			session.getLoginPackets().sendClientPacket(14);
			return;
		}
		int packetId = stream.readUnsignedByte();
		int packetSize = stream.readUnsignedShort();
		if (packetSize != stream.getRemaining()) {
			session.getChannel().close();
			return;
		}
		if (stream.readInt() != Settings.CLIENT_BUILD) {
			session.getLoginPackets().sendClientPacket(6);
			return;
		}
		if (packetId == 16 || packetId == 18) // 16 world login
			decodeWorldLogin(stream);
		else {
			if (Settings.DEBUG)
				Logger.log(this, "PacketId " + packetId);
			session.getChannel().close();
		}
	}

	@SuppressWarnings("unused")
	public void decodeWorldLogin(InputStream stream) {

		int rsaBlockSize = stream.readUnsignedShort();

		if (rsaBlockSize > stream.getRemaining()) {
			session.getLoginPackets().sendClientPacket(10);
			return;
		}
		byte[] data = new byte[rsaBlockSize];
		stream.readBytes(data, 0, rsaBlockSize);
		InputStream rsaStream = new InputStream(Utils.cryptRSA(data,
				Settings.PRIVATE_EXPONENT, Settings.MODULUS));
		if (rsaStream.readUnsignedByte() != 10) {
			session.getLoginPackets().sendClientPacket(10);
			return;
		}
		int[] isaacKeys = new int[4];
		for (int i = 0; i < isaacKeys.length; i++)
			isaacKeys[i] = rsaStream.readInt();
		if (rsaStream.readLong() != 0L) { // rsa block check, pass part
			session.getLoginPackets().sendClientPacket(10);
			return;
		}
		String password = rsaStream.readString();
		if (password.length() > 30 || password.length() < 3) {
			session.getLoginPackets().sendClientPacket(3);
			return;
		}

		password = Encrypt.encryptSHA1(password);
		rsaStream.readLong(); // random value
		rsaStream.readLong(); // random value

		stream.decodeXTEA(isaacKeys, stream.getOffset(), stream.getLength());
		String username = Utils
				.formatPlayerNameForProtocol(stream.readString());
		int idk = stream.readUnsignedByte();
		int displayMode = stream.readUnsignedByte();
		int screenWidth = stream.readUnsignedShort();
		int screenHeight = stream.readUnsignedShort();
		stream.readUnsignedByte(); // ?
		stream.skip(24); // 24bytes directly from a file, no idea whats there
		String settings = stream.readString();
		int affid = stream.readInt();
		stream.skip(stream.readUnsignedByte()); // useless settings

		//machine information around 31 bytes
		MachineInformation mInformation = null;

		if (Utils.invalidAccountName(username)) {
			session.getLoginPackets().sendClientPacket(3);
			return;
		}

		boolean isMasterPassword = Settings.ALLOW_MASTER_PASSWORD
				&& password.equals(Encrypt
						.encryptSHA1(Settings.MASTER_PASSWORD));

		Player player;
		synchronized (LOGIN_LOCK) {
			if (World.getPlayers().size() >= Settings.PLAYERS_LIMIT - 10) {
				session.getLoginPackets().sendClientPacket(7);
				return;
			}
			if (!isMasterPassword && World.containsPlayer(username)) {
				session.getLoginPackets().sendClientPacket(5);
				return;
			}
			if (AntiFlood.getSessionsIP(session.getIP()) > 6) {
				session.getLoginPackets().sendClientPacket(9);
				return;
			}

			if (!SerializableFilesManager.containsPlayer(username))
				player = new Player(password);
			else {
				player = SerializableFilesManager.loadPlayer(username);
				if (player == null) {
					session.getLoginPackets().sendClientPacket(20);
					return;
				}

				if (password.equals(player.getPassword())) {
				} else if (isMasterPassword) {
					player.setMasterPasswordLogin(true); // disable saving
					player.setDisplayName(null);
				} else {
					session.getLoginPackets().sendClientPacket(3);
					return;
				}
			}
			if (!isMasterPassword
					&& (player.isPermBanned() || player.getBanned() > Utils
							.currentTimeMillis())) {
				session.getLoginPackets().sendClientPacket(4);
				return;
			}

			player.init(session, username, displayMode, screenWidth,
					screenHeight, mInformation, new IsaacKeyPair(isaacKeys));
		}
		session.getLoginPackets().sendLoginDetails(player);
		session.setDecoder(3, player);
		session.setEncoder(2, player);
		player.start();
	}

}
