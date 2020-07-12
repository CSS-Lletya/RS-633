/* Class11_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub24 extends Class11 {
	int anInt6233;
	static OutgoingPacket aClass370_6234 = new OutgoingPacket(64, -1);
	static int anInt6235;
	int anInt6236;
	static int anInt6237;
	static int anInt6238;
	static int[] anIntArray6239 = new int[4096];

	static final short[] method2644(short[] is, int i) {
		try {
			anInt6235++;
			if (is == null)
				return null;
			if (i < 13)
				method2644(null, 65);
			short[] is_0_ = new short[is.length];
			Class311.method1900(is, 0, is_0_, 0, is.length);
			return is_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gp.B("
					+ (is != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method2645(byte i) {
		do {
			try {
				aClass370_6234 = null;
				anIntArray6239 = null;
				if (i == -38)
					break;
				anIntArray6239 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "gp.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final int method2646(boolean bool, Class195_Sub1 class195_sub1,
			int i, int i_1_, Class195_Sub1 class195_sub1_2_) {
		try {
			anInt6237++;
			if (i_1_ == 1) {
				int i_3_ = ((Class195) class195_sub1).anInt2650;
				int i_4_ = ((Class195) class195_sub1_2_).anInt2650;
				if (!bool) {
					if ((i_4_ ^ 0xffffffff) == 0)
						i_4_ = 2001;
					if ((i_3_ ^ 0xffffffff) == 0)
						i_3_ = 2001;
				}
				return i_3_ + -i_4_;
			}
			if (i_1_ == 2)
				return (Class11_Sub45_Sub20_Sub1
						.method3894(-1, Class11_Sub45_Sub1_Sub2.anInt9884,
								(((Class193) class195_sub1
										.method2626((byte) 111)).aString2631),
								(((Class193) class195_sub1_2_
										.method2626((byte) 111)).aString2631)));
			if ((i_1_ ^ 0xffffffff) == -4) {
				if (((Class195_Sub1) class195_sub1).aString6160.equals("-")) {
					if (((Class195_Sub1) class195_sub1_2_).aString6160
							.equals("-"))
						return 0;
					if (bool)
						return -1;
					return 1;
				}
				if (((Class195_Sub1) class195_sub1_2_).aString6160.equals("-")) {
					if (!bool)
						return -1;
					return 1;
				}
				return (Class11_Sub45_Sub20_Sub1.method3894(-1,
						Class11_Sub45_Sub1_Sub2.anInt9884,
						((Class195_Sub1) class195_sub1).aString6160,
						((Class195_Sub1) class195_sub1_2_).aString6160));
			}
			if ((i_1_ ^ 0xffffffff) == -5) {
				if (!class195_sub1.method1275(-1)) {
					if (!class195_sub1_2_.method1275(-1))
						return 0;
					return -1;
				}
				if (!class195_sub1_2_.method1275(-1))
					return 1;
				return 0;
			}
			if ((i_1_ ^ 0xffffffff) == -6) {
				if (class195_sub1.method1273((byte) 126)) {
					if (class195_sub1_2_.method1273((byte) 125))
						return 0;
					return 1;
				}
				if (!class195_sub1_2_.method1273((byte) 126))
					return 0;
				return -1;
			}
			if ((i_1_ ^ 0xffffffff) == -7) {
				if (class195_sub1.method1272(-88)) {
					if (class195_sub1_2_.method1272(109))
						return 0;
					return 1;
				}
				if (class195_sub1_2_.method1272(119))
					return -1;
				return 0;
			}
			if ((i_1_ ^ 0xffffffff) == -8) {
				if (!class195_sub1.method1276(-1)) {
					if (class195_sub1_2_.method1276(-1))
						return -1;
					return 0;
				}
				if (!class195_sub1_2_.method1276(-1))
					return 1;
				return 0;
			}
			if ((i_1_ ^ 0xffffffff) == -9) {
				int i_5_ = ((Class195_Sub1) class195_sub1).anInt6156;
				int i_6_ = ((Class195_Sub1) class195_sub1_2_).anInt6156;
				if (!bool) {
					if (i_6_ == -1)
						i_6_ = 1000;
					if (i_5_ == -1)
						i_5_ = 1000;
				} else {
					if ((i_6_ ^ 0xffffffff) == -1001)
						i_6_ = -1;
					if (i_5_ == 1000)
						i_5_ = -1;
				}
				return -i_6_ + i_5_;
			}
			if (i >= -120)
				aClass370_6234 = null;
			return (((Class195_Sub1) class195_sub1).anInt6159 - ((Class195_Sub1) class195_sub1_2_).anInt6159);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gp.C(" + bool + ','
					+ (class195_sub1 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_1_ + ','
					+ (class195_sub1_2_ != null ? "{...}" : "null") + ')'));
		}
	}

	public Class11_Sub24() {
		/* empty */
	}

	static {
		for (int i = 0; (i ^ 0xffffffff) > -4097; i++)
			anIntArray6239[i] = Class316.method1920(i, (byte) -106);
	}
}
