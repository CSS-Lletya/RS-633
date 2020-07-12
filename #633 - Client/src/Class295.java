/* Class295 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class295 {
	static IncomingPacket aClass160_3980;
	static int[] anIntArray3981 = new int[50];
	static int anInt3982 = 0;
	static int anInt3983;
	static int anInt3984;
	static int anInt3985;
	static OutgoingPacket ACTION_BUTTON2;
	static int[] anIntArray3987;
	static int anInt3988;
	static boolean aBool3989;

	static final synchronized void method1828(byte[] is, int i) {
		do {
			try {
				anInt3985++;
				if (is.length == i && Class11_Sub45_Sub2.anInt8515 < 1000)
					Class11_Sub2_Sub34.aByteArrayArray9691[Class11_Sub45_Sub2.anInt8515++] = is;
				else if ((is.length ^ 0xffffffff) == -5001
						&& (Class108_Sub15.anInt6503 ^ 0xffffffff) > -251)
					Class219_Sub1.aByteArrayArray7242[Class108_Sub15.anInt6503++] = is;
				else if (is.length == 30000
						&& (Class321_Sub3_Sub1.anInt9252 ^ 0xffffffff) > -51)
					Class51.aByteArrayArray797[Class321_Sub3_Sub1.anInt9252++] = is;
				else {
					if (Class59.aByteArrayArrayArray884 == null)
						break;
					for (int i_0_ = 0; ((Class4.anIntArray32.length ^ 0xffffffff) < (i_0_ ^ 0xffffffff)); i_0_++) {
						if (is.length == Class4.anIntArray32[i_0_]
								&& ((Class59.aByteArrayArrayArray884[i_0_].length ^ 0xffffffff) < (Class11_Sub37.anIntArray7085[i_0_] ^ 0xffffffff))) {
							Class59.aByteArrayArrayArray884[i_0_][Class11_Sub37.anIntArray7085[i_0_]++] = is;
							break;
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("qr.A("
						+ (is != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final void method1829(int i) {
		try {
			anInt3988++;
			Class11_Sub2_Sub33.method3805(0, i, 255);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qr.D(" + i + ')');
		}
	}

	static final void method1830(int i, int i_1_, int i_2_, int i_3_) {
		try {
			anInt3984++;
			int i_4_ = i_1_ - -Class194.anInt2641;
			int i_5_ = i - -Class118.anInt1605;
			if (Class181.aClass364ArrayArrayArray2336 != null
					&& (i_1_ ^ 0xffffffff) <= -1
					&& (i ^ 0xffffffff) <= -1
					&& (Class300.anInt4051 ^ 0xffffffff) < (i_1_ ^ 0xffffffff)
					&& i < Class108_Sub12.anInt6228
					&& (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub27_5707
							.method3158(false) != 0 || i_3_ == (((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047))) {
				long l = (long) (i_4_ | (i_3_ << 28 | i_5_ << 14));
				Class11_Sub27 class11_sub27 = ((Class11_Sub27) Class106.aClass213_1433
						.method1369((byte) 26, l));
				if (i_2_ != -10615)
					anIntArray3987 = null;
				if (class11_sub27 == null)
					Class11_Sub32.method2788(i_3_, i_1_, i);
				else {
					Class11_Sub36 class11_sub36 = (Class11_Sub36) ((Class11_Sub27) class11_sub27).aClass84_6554
							.method584(-12261);
					if (class11_sub36 == null)
						Class11_Sub32.method2788(i_3_, i_1_, i);
					else {
						Class376_Sub7_Sub1_Sub1 class376_sub7_sub1_sub1 = ((Class376_Sub7_Sub1_Sub1) Class11_Sub32
								.method2788(i_3_, i_1_, i));
						if (class376_sub7_sub1_sub1 != null)
							((Class376_Sub7_Sub1_Sub1) class376_sub7_sub1_sub1).anInt10100 = ((Class376_Sub7_Sub1_Sub1) class376_sub7_sub1_sub1).anInt10082 = -1;
						else
							class376_sub7_sub1_sub1 = (new Class376_Sub7_Sub1_Sub1(
									i_1_ << 9,
									Class315.aClass12Array4179[i_3_].method131(
											(byte) 126, i, i_1_), i << 9, i_3_,
									i_3_));
						((Class376_Sub7_Sub1_Sub1) class376_sub7_sub1_sub1).anInt10090 = ((Class11_Sub36) class11_sub36).anInt7078;
						((Class376_Sub7_Sub1_Sub1) class376_sub7_sub1_sub1).anInt10097 = ((Class11_Sub36) class11_sub36).anInt7081;
						while_190_: do {
							Class11_Sub36 class11_sub36_6_;
							do {
								class11_sub36_6_ = ((Class11_Sub36) ((Class11_Sub27) class11_sub27).aClass84_6554
										.method578(-15361));
								if (class11_sub36_6_ == null)
									break while_190_;
							} while (((Class376_Sub7_Sub1_Sub1) class376_sub7_sub1_sub1).anInt10097 == (((Class11_Sub36) class11_sub36_6_).anInt7081));
							((Class376_Sub7_Sub1_Sub1) class376_sub7_sub1_sub1).anInt10100 = ((Class11_Sub36) class11_sub36_6_).anInt7081;
							((Class376_Sub7_Sub1_Sub1) class376_sub7_sub1_sub1).anInt10099 = ((Class11_Sub36) class11_sub36_6_).anInt7078;
							for (;;) {
								Class11_Sub36 class11_sub36_7_ = ((Class11_Sub36) ((Class11_Sub27) class11_sub27).aClass84_6554
										.method578(-15361));
								if (class11_sub36_7_ == null)
									break;
								if ((((((Class11_Sub36) class11_sub36_7_).anInt7081) ^ 0xffffffff) != (((Class376_Sub7_Sub1_Sub1) class376_sub7_sub1_sub1).anInt10097 ^ 0xffffffff))
										&& ((((Class376_Sub7_Sub1_Sub1) class376_sub7_sub1_sub1).anInt10100 ^ 0xffffffff) != ((((Class11_Sub36) class11_sub36_7_).anInt7081) ^ 0xffffffff))) {
									((Class376_Sub7_Sub1_Sub1) class376_sub7_sub1_sub1).anInt10091 = (((Class11_Sub36) class11_sub36_7_).anInt7078);
									((Class376_Sub7_Sub1_Sub1) class376_sub7_sub1_sub1).anInt10082 = (((Class11_Sub36) class11_sub36_7_).anInt7081);
								}
							}
						} while (false);
						int i_8_ = Class318.method1931(96, 256 + (i << 9),
								i_3_, 256 + (i_1_ << 9));
						((Class376_Sub7_Sub1_Sub1) class376_sub7_sub1_sub1).anInt10093 = 0;
						((Class376_Sub7) class376_sub7_sub1_sub1).aByte7047 = (byte) i_3_;
						((Class376_Sub7) class376_sub7_sub1_sub1).anInt7045 = i_1_ << 9;
						((Class376_Sub7) class376_sub7_sub1_sub1).anInt7036 = i_8_;
						((Class376_Sub7) class376_sub7_sub1_sub1).aByte7039 = (byte) i_3_;
						((Class376_Sub7) class376_sub7_sub1_sub1).anInt7031 = i << 9;
						if (Class321_Sub3_Sub1.method3613((byte) -115, i_1_, i))
							((Class376_Sub7) class376_sub7_sub1_sub1).aByte7039++;
						Class365.method2163(i_3_, i_1_, i, i_8_,
								class376_sub7_sub1_sub1);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qr.C(" + i + ','
					+ i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	public static void method1831(int i) {
		try {
			anIntArray3981 = null;
			aClass160_3980 = null;
			if (i == 30000) {
				ACTION_BUTTON2 = null;
				anIntArray3987 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qr.E(" + i + ')');
		}
	}

	static final synchronized byte[] method1832(int i, int i_9_) {
		try {
			anInt3983++;
			if ((i_9_ ^ 0xffffffff) == -101 && Class11_Sub45_Sub2.anInt8515 > 0) {
				byte[] is = (Class11_Sub2_Sub34.aByteArrayArray9691[--Class11_Sub45_Sub2.anInt8515]);
				Class11_Sub2_Sub34.aByteArrayArray9691[(Class11_Sub45_Sub2.anInt8515)] = null;
				return is;
			}
			if (i != -7251)
				return null;
			if (i_9_ == 5000 && Class108_Sub15.anInt6503 > 0) {
				byte[] is = (Class219_Sub1.aByteArrayArray7242[--Class108_Sub15.anInt6503]);
				Class219_Sub1.aByteArrayArray7242[Class108_Sub15.anInt6503] = null;
				return is;
			}
			if (i_9_ == 30000 && Class321_Sub3_Sub1.anInt9252 > 0) {
				byte[] is = (Class51.aByteArrayArray797[--Class321_Sub3_Sub1.anInt9252]);
				Class51.aByteArrayArray797[Class321_Sub3_Sub1.anInt9252] = null;
				return is;
			}
			if (Class59.aByteArrayArrayArray884 != null) {
				for (int i_10_ = 0; Class4.anIntArray32.length > i_10_; i_10_++) {
					if (Class4.anIntArray32[i_10_] == i_9_
							&& Class11_Sub37.anIntArray7085[i_10_] > 0) {
						byte[] is = (Class59.aByteArrayArrayArray884[i_10_][--Class11_Sub37.anIntArray7085[i_10_]]);
						Class59.aByteArrayArrayArray884[i_10_][Class11_Sub37.anIntArray7085[i_10_]] = null;
						return is;
					}
				}
			}
			return new byte[i_9_];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qr.B(" + i + ','
					+ i_9_ + ')');
		}
	}

	static {
		aClass160_3980 = new IncomingPacket(76, -1);
		anIntArray3987 = new int[1];
		aBool3989 = false;
		ACTION_BUTTON2 = new OutgoingPacket(29, 8);
	}
}
