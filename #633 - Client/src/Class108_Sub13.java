/* Class108_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108_Sub13 extends Class108 {
	static int anInt6255;
	static int anInt6256;
	static int anInt6257;
	static int anInt6258;
	static IncomingPacket aClass160_6259 = new IncomingPacket(104, 2);
	static int anInt6260;
	static int anInt6261;
	static int anInt6262;
	static boolean[][][] aBoolArrayArrayArray6263;
	static Class84 aClass84_6264 = new Class84();
	static int anInt6265;
	static IncomingPacket LOCAL_NPC_UPDATE_IN_PACKET = new IncomingPacket(16, -2);
	static Class368 aClass368_6267;

	final int method725(byte i) {
		try {
			anInt6257++;
			int i_0_ = -70 % ((70 - i) / 51);
			if (((Class108) this).aClass11_Sub17_1458.method2458(true)
					.method698(64))
				return 3;
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gs.A(" + i + ')');
		}
	}

	public static void method2651(boolean bool) {
		try {
			LOCAL_NPC_UPDATE_IN_PACKET = null;
			if (bool != false)
				aClass160_6259 = null;
			aBoolArrayArrayArray6263 = null;
			aClass84_6264 = null;
			aClass160_6259 = null;
			aClass368_6267 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gs.D(" + bool + ')');
		}
	}

	final void method728(int i, int i_1_) {
		do {
			try {
				anInt6258++;
				((Class108) this).anInt1459 = i_1_;
				if (i == 0)
					break;
				LOCAL_NPC_UPDATE_IN_PACKET = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "gs.C(" + i + ','
						+ i_1_ + ')');
			}
			break;
		} while (false);
	}

	static final void method2652(boolean bool) {
		do {
			try {
				anInt6265++;
				int[] is = new int[(((Class223) Packet.aClass223_8723).anInt3062)];
				int i = 0;
				for (int i_2_ = 0; i_2_ < (((Class223) Packet.aClass223_8723).anInt3062); i_2_++) {
					Class249 class249 = Packet.aClass223_8723.method1430(i_2_,
							false);
					if ((((Class249) class249).anInt3371 ^ 0xffffffff) <= -1
							|| ((Class249) class249).anInt3393 >= 0)
						is[i++] = i_2_;
				}
				Class143.anIntArray1929 = new int[i];
				for (int i_3_ = 0; (i ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++)
					Class143.anIntArray1929[i_3_] = is[i_3_];
				if (bool == false)
					break;
				method2653((byte) 4);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "gs.H(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	final int method721(int i, int i_4_) {
		try {
			if (i_4_ < 10)
				method2653((byte) 67);
			anInt6260++;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gs.F(" + i + ','
					+ i_4_ + ')');
		}
	}

	Class108_Sub13(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}

	Class108_Sub13(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
	}

	final void method726(boolean bool) {
		do {
			try {
				if (((Class108) this).anInt1459 < 1
						|| ((Class108) this).anInt1459 > 3)
					((Class108) this).anInt1459 = method725((byte) -84);
				anInt6262++;
				if (bool == false)
					break;
				LOCAL_NPC_UPDATE_IN_PACKET = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "gs.E(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method2653(byte i) {
		try {
			anInt6256++;
			int i_5_ = 0;
			if (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub11_5723
					.method2623(false) == 1) {
				i_5_ |= 0x1;
				i_5_ |= 0x10;
				i_5_ |= 0x20;
				i_5_ |= 0x2;
				i_5_ |= 0x4;
			}
			if (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub6_5697
					.method2429(false) == 0)
				i_5_ |= 0x40;
			Class108_Sub8.method2463(-247, i_5_);
			Class11_Sub4.aClass290_5237.method1791(125, i_5_);
			Packet.aClass223_8723.method1429((byte) -27, i_5_);
			Class11_Sub19.aClass318_5817.method1928(i_5_, 50);
			Class254.aClass227_3495.method1467(i_5_, (byte) 115);
			if (i <= -105) {
				Class92.method626(i_5_, 28456);
				Class87.method614(i_5_, false);
				Class174.method1142(15094, i_5_);
				Class338.method2046(i_5_, 0);
				Class114.method758(3);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gs.I(" + i + ')');
		}
	}

	final int method2654(boolean bool) {
		try {
			anInt6255++;
			if (bool != false)
				aBoolArrayArrayArray6263 = null;
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gs.B(" + bool + ')');
		}
	}

	static final void method2655(byte i, int i_6_, int i_7_, int i_8_,
			int i_9_, int i_10_, int i_11_) {
		try {
			if (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5702
					.method2462(false) != 0
					&& (i_11_ ^ 0xffffffff) != -1
					&& Class376_Sub7_Sub3_Sub1.anInt9863 < 50
					&& (i_8_ ^ 0xffffffff) != 0)
				Class343.aClass56Array4543[Class376_Sub7_Sub3_Sub1.anInt9863++] = new Class56(
						(byte) 1, i_8_, i_11_, i_9_, i_7_, i_6_, i_10_, null);
			if (i != 1)
				aClass84_6264 = null;
			anInt6261++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gs.G(" + i + ','
					+ i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_
					+ ',' + i_11_ + ')'));
		}
	}
}
