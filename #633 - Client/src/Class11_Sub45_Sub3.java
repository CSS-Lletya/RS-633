/* Class11_Sub45_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub45_Sub3 extends Class11_Sub45 {
	double aDouble8524;
	static int anInt8525;
	static int anInt8526;
	short[][] aShortArrayArray8527;
	static int anInt8528;
	static boolean aBool8529 = false;
	static Class347 aClass347_8530 = new Class347("WTQA", 2);

	public static void method3383(byte i) {
		try {
			if (i == -75)
				aClass347_8530 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nea.D(" + i + ')');
		}
	}

	static final String method3384(IComponentDefinitions class192, int i) {
		try {
			anInt8526++;
			if ((client.method4013(class192).method2353(false) ^ 0xffffffff) == -1)
				return null;
			if (((IComponentDefinitions) class192).aString2614 == null
					|| (((IComponentDefinitions) class192).aString2614.trim()
							.length() ^ 0xffffffff) == -1) {
				if (Class11_Sub2_Sub14.aBool9010)
					return "Hidden-use";
				return null;
			}
			if (i != -10402)
				aBool8529 = false;
			return ((IComponentDefinitions) class192).aString2614;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nea.B("
					+ (class192 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final long method3385(byte i) {
		try {
			if (i != -6)
				return -31L;
			anInt8528++;
			return (long) ((((Class11_Sub45_Sub3) this).aShortArrayArray8527).length << 0 | (((Class11_Sub45_Sub3) this).aShortArrayArray8527[0]).length);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nea.A(" + i + ')');
		}
	}

	static final Class206 method3386(int i, int i_0_, int i_1_, int i_2_,
			int i_3_, Class163 class163, int i_4_, Class206 class206, int i_5_,
			int i_6_, int i_7_, int i_8_, Class281 class281, int i_9_) {
		try {
			anInt8525++;
			if (class206 == null)
				return null;
			int i_10_ = 2055;
			if (class281 != null) {
				i_10_ |= class281.method1738(-1, i_4_ ^ 0x5015, false, i_8_);
				i_10_ &= ~0x200;
			}
			long l = (((long) i_5_ << 32) + ((long) ((i_3_ << 24) + (i << 16) + i_6_) + ((long) i_7_ << 48)));
			if (i_4_ != 21525)
				return null;
			Class206 class206_11_;
			synchronized (Class207.aClass22_2795) {
				class206_11_ = (Class206) Class207.aClass22_2795.method188(l,
						(byte) -114);
			}
			if (class206_11_ == null
					|| (class163.method1065(class206_11_.ua(), i_10_) ^ 0xffffffff) != -1) {
				if (class206_11_ != null)
					i_10_ = class163.method1077(i_10_, class206_11_.ua());
				int i_12_;
				if ((i_6_ ^ 0xffffffff) != -2) {
					if (i_6_ != 2) {
						if (i_6_ == 3)
							i_12_ = 15;
						else if ((i_6_ ^ 0xffffffff) == -5)
							i_12_ = 18;
						else
							i_12_ = 21;
					} else
						i_12_ = 12;
				} else
					i_12_ = 9;
				int i_13_ = 3;
				int[] is = { 64, 96, 128 };
				Class179 class179 = new Class179(1 + i_12_ * i_13_, -i_12_
						+ i_12_ * i_13_ * 2, 0);
				int i_14_ = class179.method1164(true, 0, 0, 0);
				int[][] is_15_ = new int[i_13_][i_12_];
				for (int i_16_ = 0; i_13_ > i_16_; i_16_++) {
					int i_17_ = is[i_16_];
					int i_18_ = is[i_16_];
					for (int i_19_ = 0; (i_19_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff); i_19_++) {
						int i_20_ = (i_19_ << 14) / i_12_;
						int i_21_ = i_17_ * Class335.anIntArray4436[i_20_] >> 14;
						int i_22_ = i_18_ * Class335.anIntArray4430[i_20_] >> 14;
						is_15_[i_16_][i_19_] = class179.method1164(true, i_22_,
								i_21_, 0);
					}
				}
				for (int i_23_ = 0; i_13_ > i_23_; i_23_++) {
					int i_24_ = (i_23_ * 256 + 128) / i_13_;
					int i_25_ = 256 + -i_24_;
					byte i_26_ = (byte) (i * i_25_ + i_24_ * i_3_ >> 8);
					short i_27_ = (short) (((0xfc0000 & ((i_5_ & 0xfc00)
							* i_25_ + i_24_ * (i_7_ & 0xfc00)))
							+ (((i_5_ & 0x380) * i_25_ + (i_7_ & 0x380) * i_24_) & 0x38000) + (0x7f00 & ((i_5_ & 0x7f)
							* i_25_ + i_24_ * (0x7f & i_7_)))) >> 8);
					for (int i_28_ = 0; i_12_ > i_28_; i_28_++) {
						if ((i_23_ ^ 0xffffffff) != -1) {
							class179.method1173((is_15_[i_23_][(i_28_ + 1)
									% i_12_]), i_26_, (short) -1, i_27_,
									(byte) 1, (byte) -1,
									is_15_[i_23_ - 1][i_28_],
									(is_15_[i_23_ - 1][(1 + i_28_) % i_12_]),
									i_4_ - 31898);
							class179.method1173(is_15_[i_23_][i_28_], i_26_,
									(short) -1, i_27_, (byte) 1, (byte) -1,
									is_15_[-1 + i_23_][i_28_],
									(is_15_[i_23_][(i_28_ + 1) % i_12_]),
									-10373);
						} else
							class179.method1173(is_15_[0][i_28_], i_26_,
									(short) -1, i_27_, (byte) 1, (byte) -1,
									i_14_, is_15_[0][(1 + i_28_) % i_12_],
									-10373);
					}
				}
				class206_11_ = class163.method1020(class179, i_10_,
						Class11_Sub45_Sub1.anInt8492, 64, 768);
				synchronized (Class207.aClass22_2795) {
					Class207.aClass22_2795.method184((byte) 124, class206_11_,
							l);
				}
			}
			int i_29_ = class206.V();
			int i_30_ = class206.RA();
			int i_31_ = class206.HA();
			int i_32_ = class206.G();
			Class11_Sub45_Sub18 class11_sub45_sub18 = null;
			if (class281 != null) {
				i_8_ = ((Class281) class281).anIntArray3794[i_8_];
				class11_sub45_sub18 = Class108_Sub23.aClass198_7760.method1280(
						17, i_8_ >> 16);
				i_8_ &= 0xffff;
			}
			if (class11_sub45_sub18 == null) {
				class206_11_ = class206_11_.method1313((byte) 3, i_10_, true);
				class206_11_.O(i_30_ - i_29_ >> 1, 128, -i_31_ + i_32_ >> 1);
				class206_11_.H(i_30_ + i_29_ >> 1, 0, i_32_ + i_31_ >> 1);
			} else {
				class206_11_ = class206_11_.method1313((byte) 3, i_10_, true);
				class206_11_.O(-i_29_ + i_30_ >> 1, 128, -i_31_ + i_32_ >> 1);
				class206_11_.H(i_29_ + i_30_ >> 1, 0, i_32_ + i_31_ >> 1);
				class206_11_.method1315(i_8_, 30626, class11_sub45_sub18);
			}
			if ((i_0_ ^ 0xffffffff) != -1)
				class206_11_.FA(i_0_);
			if (i_1_ != 0)
				class206_11_.VA(i_1_);
			if ((i_2_ ^ 0xffffffff) != -1)
				class206_11_.H(0, i_2_, 0);
			return class206_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("nea.C(" + i + ',' + i_0_
							+ ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ','
							+ (class163 != null ? "{...}" : "null") + ','
							+ i_4_ + ','
							+ (class206 != null ? "{...}" : "null") + ','
							+ i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ','
							+ (class281 != null ? "{...}" : "null") + ','
							+ i_9_ + ')'));
		}
	}

	Class11_Sub45_Sub3(short[][] is, double d) {
		try {
			((Class11_Sub45_Sub3) this).aDouble8524 = d;
			((Class11_Sub45_Sub3) this).aShortArrayArray8527 = is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nea.<init>("
					+ (is != null ? "{...}" : "null") + ',' + d + ')'));
		}
	}
}
