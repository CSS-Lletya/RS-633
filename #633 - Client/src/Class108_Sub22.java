/* Class108_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108_Sub22 extends Class108 {
	static double aDouble7317;
	static int anInt7318;
	static int anInt7319;
	static int anInt7320;
	static int anInt7321;
	static int anInt7322;
	static int anInt7323;
	static int anInt7324;
	static int anInt7325;

	Class108_Sub22(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}

	final int method725(byte i) {
		try {
			anInt7318++;
			int i_0_ = 123 / ((i - 70) / 51);
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sp.A(" + i + ')');
		}
	}

	final void method728(int i, int i_1_) {
		try {
			if (i != 0)
				method726(true);
			((Class108) this).anInt1459 = i_1_;
			anInt7322++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sp.C(" + i + ','
					+ i_1_ + ')');
		}
	}

	Class108_Sub22(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
	}

	static final void method2961(Class84 class84, Class163 class163, int i,
			int i_2_, int i_3_) {
		do {
			try {
				anInt7325++;
				ISAAC.aClass84_265.method586((byte) -19);
				if (!Class350.aBool4615) {
					for (Class11_Sub21 class11_sub21 = (Class11_Sub21) class84
							.method584(-12261); class11_sub21 != null; class11_sub21 = (Class11_Sub21) class84
							.method578(-15361)) {
						Class23 class23 = (Class32.aClass280_420.method1726(
								(byte) -111,
								((Class11_Sub21) class11_sub21).anInt5964));
						if (Class283.method1748(83, class23)) {
							boolean bool = Class154.method964(i_3_,
									class11_sub21, i_2_, class23, class163,
									(byte) -83);
							if (bool)
								Class11_Sub48.method3217(class23, 0, class163,
										class11_sub21);
						}
					}
					if (i == 1)
						break;
					method2963(false, -14, 107, null, true, 90, false, -118,
							-127L, -95L, null, -89, -6);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("sp.H("
						+ (class84 != null ? "{...}" : "null") + ','
						+ (class163 != null ? "{...}" : "null") + ',' + i + ','
						+ i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	final int method2962(boolean bool) {
		try {
			anInt7323++;
			if (bool != false)
				aDouble7317 = 0.07145571476750219;
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sp.B(" + bool + ')');
		}
	}

	static final void method2963(boolean bool, int i, int i_4_, String string,
			boolean bool_5_, int i_6_, boolean bool_7_, int i_8_, long l,
			long l_9_, String string_10_, int i_11_, int i_12_) {
		try {
			anInt7320++;
			if (!Class306.aBool4114 && Class52.anInt802 < 500) {
				i_6_ = (i_6_ ^ 0xffffffff) != i_12_ ? i_6_ : Class325.anInt4329;
				Class11_Sub45_Sub5 class11_sub45_sub5 = new Class11_Sub45_Sub5(
						string, string_10_, i_6_, i_8_, i_4_, l_9_, i_11_, i,
						bool_7_, bool, l, bool_5_);
				Class84.method587(class11_sub45_sub5, false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sp.D(" + bool + ','
					+ i + ',' + i_4_ + ','
					+ (string != null ? "{...}" : "null") + ',' + bool_5_ + ','
					+ i_6_ + ',' + bool_7_ + ',' + i_8_ + ',' + l + ',' + l_9_
					+ ',' + (string_10_ != null ? "{...}" : "null") + ','
					+ i_11_ + ',' + i_12_ + ')'));
		}
	}

	final void method726(boolean bool) {
		try {
			if (bool != false)
				aDouble7317 = 2.0508715910873483;
			if (((Class108) this).anInt1459 != 1
					&& (((Class108) this).anInt1459 ^ 0xffffffff) != -1)
				((Class108) this).anInt1459 = method725((byte) -66);
			anInt7321++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sp.E(" + bool + ')');
		}
	}

	static final void method2964(int i, int i_13_, int[] is, int i_14_,
			int[] is_15_, int i_16_, float[] fs, int i_17_, int i_18_,
			int i_19_, float[] fs_20_, int i_21_, int i_22_) {
		try {
			anInt7324++;
			int i_23_ = i + i_17_ * i_16_;
			if (i_19_ <= -93) {
				int i_24_ = i_22_ * i_14_ + i_21_;
				int i_25_ = -i_18_ + i_16_;
				int i_26_ = i_14_ - i_18_;
				if (is_15_ != null) {
					if (fs_20_ == null) {
						for (int i_27_ = 0; i_27_ < i_13_; i_27_++) {
							int i_28_ = i_18_ + i_23_;
							while (i_28_ > i_23_)
								is[i_24_++] = is_15_[i_23_++];
							i_23_ += i_25_;
							i_24_ += i_26_;
						}
					} else {
						for (int i_29_ = 0; i_29_ < i_13_; i_29_++) {
							int i_30_ = i_23_ + i_18_;
							while ((i_23_ ^ 0xffffffff) > (i_30_ ^ 0xffffffff)) {
								is[i_24_] = is_15_[i_23_];
								fs[i_24_++] = fs_20_[i_23_++];
							}
							i_23_ += i_25_;
							i_24_ += i_26_;
						}
					}
				} else {
					for (int i_31_ = 0; (i_31_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff); i_31_++) {
						int i_32_ = i_18_ + i_23_;
						while ((i_23_ ^ 0xffffffff) > (i_32_ ^ 0xffffffff))
							fs[i_24_++] = fs_20_[i_23_++];
						i_24_ += i_26_;
						i_23_ += i_25_;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sp.G(" + i + ','
					+ i_13_ + ',' + (is != null ? "{...}" : "null") + ','
					+ i_14_ + ',' + (is_15_ != null ? "{...}" : "null") + ','
					+ i_16_ + ',' + (fs != null ? "{...}" : "null") + ','
					+ i_17_ + ',' + i_18_ + ',' + i_19_ + ','
					+ (fs_20_ != null ? "{...}" : "null") + ',' + i_21_ + ','
					+ i_22_ + ')'));
		}
	}

	final int method721(int i, int i_33_) {
		try {
			if (i_33_ <= 10)
				aDouble7317 = 1.033663394373885;
			anInt7319++;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sp.F(" + i + ','
					+ i_33_ + ')');
		}
	}
}
