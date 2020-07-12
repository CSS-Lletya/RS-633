/* Class28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;

abstract class Class28 {
	private Class11_Sub12_Sub4 aClass11_Sub12_Sub4_360;
	static int anInt361;
	private boolean aBool362;
	private boolean aBool363;
	static int anInt364;
	private OggSyncState anOggSyncState365;
	private Class11_Sub12_Sub2 aClass11_Sub12_Sub2_366;
	private boolean aBool367;
	private byte[] aByteArray368;
	private Class213 aClass213_369;
	static int anInt370;
	static int anInt371;
	private OggPacket anOggPacket372;
	private boolean aBool373;
	static int anInt374;
	static int anInt375;
	static int anInt376;
	static int anInt377;
	static int anInt378;
	private OggPage anOggPage379;
	static int anInt380;
	static int anInt381;
	private Class11_Sub12_Sub3 aClass11_Sub12_Sub3_382;
	static int anInt383;
	static Class22 aClass22_384 = new Class22(64);
	static int anInt385;
	private String aString386;
	static int anInt387;

	public static void method229(int i) {
		try {
			if (i != -2)
				method229(-74);
			aClass22_384 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nba.B(" + i + ')');
		}
	}

	final void method230(int i) throws IOException {
		try {
			anInt375++;
			if (!aBool373) {
				if (i < 80)
					method236(64);
				while (!aBool367) {
					Class11_Sub12 class11_sub12;
					if (!aBool362) {
						class11_sub12 = method243((byte) 48);
						if (class11_sub12 == null) {
							if (aBool363)
								method237(-2);
							break;
						}
						if (class11_sub12 == null)
							throw new IllegalStateException();
						aBool362 = true;
					} else
						class11_sub12 = ((Class11_Sub12) (aClass213_369
								.method1369((byte) 26,
										(long) anOggPage379.getSerialNumber())));
					if (class11_sub12 != aClass11_Sub12_Sub2_366) {
						if (!(class11_sub12 instanceof Class11_Sub12_Sub3)) {
							if (aClass11_Sub12_Sub4_360 == class11_sub12) {
								if (aClass11_Sub12_Sub2_366 == null
										&& !aBool373) {
									for (int i_0_ = 0; i_0_ < 10
											&& method234(0); i_0_++) {
										method231(1);
										if (aBool367)
											break;
									}
									break;
								}
							} else {
								while ((((Class11_Sub12) class11_sub12).anOggStreamState5443
										.packetOut(anOggPacket372) ^ 0xffffffff) == -2) {
									if (((((Class11_Sub12) class11_sub12).anInt5442) ^ 0xffffffff) == -2
											&& (class11_sub12 instanceof Class11_Sub12_Sub3))
										method242(10, aString386);
									class11_sub12.method2384((byte) 117,
											anOggPacket372);
								}
							}
						} else
							method241(0);
					} else {
						if ((aClass11_Sub12_Sub2_366.method3558(24) ^ 0xffffffff) <= -51)
							break;
						while (((Class11_Sub12) aClass11_Sub12_Sub2_366).anOggStreamState5443
								.packetOut(anOggPacket372) == 1) {
							aClass11_Sub12_Sub2_366.method2384((byte) 120,
									anOggPacket372);
							method241(0);
							if (aClass11_Sub12_Sub4_360 != null) {
								double d = aClass11_Sub12_Sub4_360
										.method3729(2048);
								for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -11
										&& method234(0); i_1_++) {
									method231(1);
									if (aBool367)
										return;
								}
								if (aClass11_Sub12_Sub4_360.method3729(2048) > d)
									return;
							}
							if ((aClass11_Sub12_Sub2_366.method3558(-106) ^ 0xffffffff) <= -51)
								return;
						}
					}
					aBool362 = false;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nba.J(" + i + ')');
		}
	}

	private final void method231(int i) throws IOException {
		do {
			try {
				anInt371++;
				while (((Class11_Sub12) aClass11_Sub12_Sub4_360).anOggStreamState5443
						.packetOut(anOggPacket372) != 1) {
					Class11_Sub12 class11_sub12 = method243((byte) 48);
					if (class11_sub12 == null) {
						if (aBool363)
							method237(i - 3);
						return;
					}
					if (class11_sub12 == aClass11_Sub12_Sub3_382)
						method241(i ^ 0x1);
				}
				aClass11_Sub12_Sub4_360.method2384((byte) 94, anOggPacket372);
				if (i == 1)
					break;
				method242(89, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "nba.I(" + i + ')');
			}
			break;
		} while (false);
	}

	final Class11_Sub12_Sub3 method232(byte i) {
		try {
			int i_2_ = 2 / ((i + 1) / 55);
			anInt364++;
			return aClass11_Sub12_Sub3_382;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nba.N(" + i + ')');
		}
	}

	final double method233(int i) {
		try {
			anInt361++;
			if (aClass11_Sub12_Sub2_366 != null)
				return aClass11_Sub12_Sub2_366.method3559(false);
			if (aClass11_Sub12_Sub4_360 != null)
				return aClass11_Sub12_Sub4_360.method3729(2048);
			int i_3_ = -6 % ((-20 - i) / 41);
			return 0.0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nba.C(" + i + ')');
		}
	}

	private final boolean method234(int i) {
		try {
			anInt374++;
			if (i != 0)
				return true;
			if (aClass11_Sub12_Sub2_366 != null) {
				if (aClass11_Sub12_Sub4_360.method3725(-1)
						&& !(method233(-125) > aClass11_Sub12_Sub4_360
								.method3729(2048)))
					return false;
				return true;
			}
			double d = (double) aClass11_Sub12_Sub4_360.method3724((byte) -43);
			if (d != 0.0
					&& !((double) Class137.method878((byte) -101) >= 1000.0 / d
							+ (double) aClass11_Sub12_Sub4_360.method3726(0)))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nba.H(" + i + ')');
		}
	}

	final void method235(int i, boolean bool) {
		try {
			anInt378++;
			if (i != -16426)
				aClass213_369 = null;
			if (aClass11_Sub12_Sub2_366 != null) {
				Class11_Sub6_Sub5 class11_sub6_sub5 = aClass11_Sub12_Sub2_366
						.method3561((byte) 87);
				if (class11_sub6_sub5 != null)
					class11_sub6_sub5.method3789((byte) -123, bool);
			}
			aBool373 = !aBool373;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nba.A(" + i + ','
					+ bool + ')');
		}
	}

	final Class11_Sub12_Sub4 method236(int i) {
		try {
			if (i != -2)
				return null;
			anInt387++;
			return aClass11_Sub12_Sub4_360;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nba.D(" + i + ')');
		}
	}

	private final void method237(int i) {
		while_243_: do {
			try {
				anInt380++;
				for (Class11_Sub12 class11_sub12 = (Class11_Sub12) aClass213_369
						.method1365(24490); class11_sub12 != null; class11_sub12 = ((Class11_Sub12) aClass213_369
						.method1367((byte) 71))) {
					if (class11_sub12 != aClass11_Sub12_Sub4_360) {
						while ((((Class11_Sub12) class11_sub12).anOggStreamState5443
								.packetOut() ^ 0xffffffff) == -2)
							class11_sub12.method2384((byte) 84, anOggPacket372);
					}
				}
				if (i != -2)
					aBool373 = true;
				if (aClass11_Sub12_Sub4_360 != null) {
					int i_4_ = 0;
					for (;;) {
						if (i_4_ >= 10)
							break while_243_;
						if (!method234(0))
							break;
						if ((((Class11_Sub12) aClass11_Sub12_Sub4_360).anOggStreamState5443
								.packetOut() ^ 0xffffffff) != -2) {
							method239(0);
							break;
						}
						aClass11_Sub12_Sub4_360.method2384((byte) 124,
								anOggPacket372);
						i_4_++;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "nba.L(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method238(int i) {
		try {
			anInt381++;
			if (!aBool367 && !aBool363)
				return false;
			if (aClass11_Sub12_Sub2_366 != null
					&& aClass11_Sub12_Sub2_366.method3558(119) > 0)
				return false;
			if (i != 0)
				anOggPage379 = null;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nba.G(" + i + ')');
		}
	}

	final void method239(int i) {
		try {
			anInt370++;
			if (!aBool367) {
				for (Class11_Sub12 class11_sub12 = (Class11_Sub12) aClass213_369
						.method1365(24490); class11_sub12 != null; class11_sub12 = ((Class11_Sub12) aClass213_369
						.method1367((byte) 71))) {
					class11_sub12.method2387(i - 110);
					((Class11_Sub12) class11_sub12).anOggStreamState5443
							.method871();
				}
				anOggPacket372.method871();
				if (i == 0) {
					anOggPage379.method871();
					anOggSyncState365.method871();
					aBool367 = true;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nba.F(" + i + ')');
		}
	}

	abstract int method240(byte i, byte[] is) throws IOException;

	private final void method241(int i) {
		try {
			if (i != 0)
				aByteArray368 = null;
			for (Class11_Sub12 class11_sub12 = (Class11_Sub12) aClass213_369
					.method1365(i + 24490); class11_sub12 != null; class11_sub12 = (Class11_Sub12) aClass213_369
					.method1367((byte) 71)) {
				if (class11_sub12 instanceof Class11_Sub12_Sub3) {
					Class11_Sub12_Sub3 class11_sub12_sub3 = (Class11_Sub12_Sub3) class11_sub12;
					while (((Class11_Sub12) class11_sub12_sub3).anInt5442 <= 8
							|| (method233(59) > (double) class11_sub12_sub3
									.method3603((byte) 64))) {
						if ((((Class11_Sub12) class11_sub12_sub3).anOggStreamState5443
								.packetOut(anOggPacket372) ^ 0xffffffff) != -2)
							break;
						class11_sub12_sub3
								.method2384((byte) 87, anOggPacket372);
					}
				}
			}
			anInt376++;
			method242(10, aString386);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nba.K(" + i + ')');
		}
	}

	final void method242(int i, String string) {
		do {
			try {
				anInt377++;
				aString386 = string;
				if (aString386 == null)
					aClass11_Sub12_Sub3_382 = null;
				else {
					if (aClass11_Sub12_Sub3_382 != null
							&& !aString386.equals(aClass11_Sub12_Sub3_382
									.method3604(false)))
						aClass11_Sub12_Sub3_382 = null;
					if (aClass11_Sub12_Sub3_382 == null) {
						for (Class11_Sub12 class11_sub12 = ((Class11_Sub12) aClass213_369
								.method1365(24490)); class11_sub12 != null; class11_sub12 = ((Class11_Sub12) aClass213_369
								.method1367((byte) 71))) {
							if (class11_sub12 instanceof Class11_Sub12_Sub3) {
								Class11_Sub12_Sub3 class11_sub12_sub3 = (Class11_Sub12_Sub3) class11_sub12;
								if (aString386.equals(class11_sub12_sub3
										.method3604(false))) {
									aClass11_Sub12_Sub3_382 = class11_sub12_sub3;
									return;
								}
							}
						}
					}
					if (i == 10)
						break;
					method244(true);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("nba.P(" + i + ','
						+ (string != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	private final Class11_Sub12 method243(byte i) throws IOException {
		try {
			anInt385++;
			if (aBool367)
				throw new IllegalStateException();
			if (aBool363)
				return null;
			while (anOggSyncState365.pageOut(anOggPage379) <= 0) {
				int i_5_ = method240((byte) 10, aByteArray368);
				if ((i_5_ ^ 0xffffffff) == 0) {
					aBool363 = true;
					return null;
				}
				if ((i_5_ ^ 0xffffffff) == -1)
					return null;
				if (!anOggSyncState365.write(aByteArray368, i_5_))
					throw new RuntimeException("");
			}
			if (i != 48)
				anOggPacket372 = null;
			int i_6_ = anOggPage379.getSerialNumber();
			if (anOggPage379.isBOS()) {
				OggStreamState oggstreamstate = new OggStreamState(i_6_);
				if (!oggstreamstate.pageIn(anOggPage379))
					throw new IllegalStateException();
				if ((oggstreamstate.packetPeek(anOggPacket372) ^ 0xffffffff) != -2)
					throw new IllegalStateException();
				Class11_Sub12 class11_sub12;
				if (aClass11_Sub12_Sub4_360 == null
						&& anOggPacket372.isTheora()) {
					aClass11_Sub12_Sub4_360 = new Class11_Sub12_Sub4(
							oggstreamstate);
					class11_sub12 = aClass11_Sub12_Sub4_360;
				} else if (aClass11_Sub12_Sub2_366 == null
						&& anOggPacket372.isVorbis()) {
					aClass11_Sub12_Sub2_366 = new Class11_Sub12_Sub2(
							oggstreamstate);
					class11_sub12 = aClass11_Sub12_Sub2_366;
				} else {
					byte[] is = anOggPacket372.getData();
					StringBuffer stringbuffer = new StringBuffer();
					for (int i_7_ = 1; (is.length ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
						if (!Character.isLetterOrDigit((char) is[i_7_]))
							break;
						stringbuffer.append((char) is[i_7_]);
					}
					String string = stringbuffer.toString();
					if (string.equals("kate"))
						class11_sub12 = new Class11_Sub12_Sub3(oggstreamstate);
					else
						class11_sub12 = new Class11_Sub12_Sub1(oggstreamstate);
				}
				aClass213_369
						.method1368((long) i_6_, class11_sub12, (byte) -26);
				return class11_sub12;
			}
			Class11_Sub12 class11_sub12 = ((Class11_Sub12) aClass213_369
					.method1369((byte) 26, (long) i_6_));
			if (!((Class11_Sub12) class11_sub12).anOggStreamState5443
					.pageIn(anOggPage379))
				throw new IllegalStateException();
			return class11_sub12;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nba.M(" + i + ')');
		}
	}

	Class28(int i) {
		try {
			if (!Class335_Sub3_Sub1.method3711("jagtheora", true))
				throw new RuntimeException("Failed to load jagtheora library");
			aByteArray368 = new byte[i];
			anOggSyncState365 = new OggSyncState();
			anOggPage379 = new OggPage();
			anOggPacket372 = new OggPacket();
			aClass213_369 = new Class213(8);
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, "nba.<init>(" + i + ')');
		}
	}

	final Class11_Sub12_Sub2 method244(boolean bool) {
		try {
			anInt383++;
			if (bool != false)
				method235(-11, true);
			return aClass11_Sub12_Sub2_366;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nba.E(" + bool + ')');
		}
	}
}
