/* Class172 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class172 implements Interface22 {
	static int anInt2201;
	private Class146 aClass146_2202;
	static int anInt2203;
	private Class253 aClass253_2204;
	static int anInt2205;
	static int anInt2206;
	private Class204 aClass204_2207;
	static int anInt2208;
	static int anInt2209;

	static final void method1127(int i) {
		try {
			anInt2201++;
			if (Class219_Sub1.anIntArray7248 == null) {
				Class219_Sub1.anIntArray7248 = new int[65536];
				if (i == 1) {
					double d = -0.015 + Math.random() * 0.03 + 0.7;
					int i_0_ = 0;
					for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -513; i_1_++) {
						float f = ((0.0078125F + (float) (i_1_ >> 3) / 64.0F) * 360.0F);
						float f_2_ = 0.0625F + (float) (0x7 & i_1_) / 8.0F;
						for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -129; i_3_++) {
							float f_4_ = (float) i_3_ / 128.0F;
							float f_5_ = 0.0F;
							float f_6_ = 0.0F;
							float f_7_ = 0.0F;
							float f_8_ = f / 60.0F;
							int i_9_ = (int) f_8_;
							int i_10_ = i_9_ % 6;
							float f_11_ = (float) -i_9_ + f_8_;
							float f_12_ = f_4_ * (1.0F - f_2_);
							float f_13_ = f_4_ * (-(f_2_ * f_11_) + 1.0F);
							float f_14_ = (-(f_2_ * (1.0F - f_11_)) + 1.0F)
									* f_4_;
							if ((i_10_ ^ 0xffffffff) != -1) {
								if (i_10_ == 1) {
									f_6_ = f_4_;
									f_7_ = f_12_;
									f_5_ = f_13_;
								} else if (i_10_ == 2) {
									f_5_ = f_12_;
									f_6_ = f_4_;
									f_7_ = f_14_;
								} else if (i_10_ == 3) {
									f_5_ = f_12_;
									f_7_ = f_4_;
									f_6_ = f_13_;
								} else if (i_10_ == 4) {
									f_6_ = f_12_;
									f_7_ = f_4_;
									f_5_ = f_14_;
								} else if ((i_10_ ^ 0xffffffff) == -6) {
									f_5_ = f_4_;
									f_6_ = f_12_;
									f_7_ = f_13_;
								}
							} else {
								f_6_ = f_14_;
								f_7_ = f_12_;
								f_5_ = f_4_;
							}
							f_5_ = (float) Math.pow((double) f_5_, d);
							f_6_ = (float) Math.pow((double) f_6_, d);
							f_7_ = (float) Math.pow((double) f_7_, d);
							int i_15_ = (int) (f_5_ * 256.0F);
							int i_16_ = (int) (f_6_ * 256.0F);
							int i_17_ = (int) (256.0F * f_7_);
							int i_18_ = ((i_16_ << 8) + (-16777216 - (-(i_15_ << 16) + -i_17_)));
							Class219_Sub1.anIntArray7248[i_0_++] = i_18_;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hp.D(" + i + ')');
		}
	}

	public final boolean method24(int i) {
		try {
			if (i != -32252)
				method36(false, 81);
			anInt2205++;
			return aClass146_2202.method918(
					((Class204) aClass204_2207).anInt2745, -85);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hp.G(" + i + ')');
		}
	}

	public final void method36(boolean bool, int i) {
		try {
			if (i != -3340)
				method36(true, 84);
			if (bool) {
				int i_19_ = (((Class233.anInt3186 ^ 0xffffffff) > (Class11_Sub36.anInt7079 ^ 0xffffffff)) ? Class11_Sub36.anInt7079
						: Class233.anInt3186);
				int i_20_ = ((Class153.anInt2025 ^ 0xffffffff) < (Class279.anInt3772 ^ 0xffffffff) ? Class153.anInt2025
						: Class279.anInt3772);
				int i_21_ = aClass253_2204.method1608();
				int i_22_ = aClass253_2204.method1622();
				int i_23_ = 0;
				int i_24_ = i_19_;
				int i_25_ = i_22_ * i_19_ / i_21_;
				int i_26_ = (i_20_ - i_25_) / 2;
				if (i_20_ < i_25_) {
					i_24_ = i_20_ * i_21_ / i_22_;
					i_26_ = 0;
					i_25_ = i_20_;
					i_23_ = (-i_24_ + i_19_) / 2;
				}
				aClass253_2204.method1620(i_23_, i_26_, i_24_, i_25_);
			}
			anInt2209++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hp.F(" + bool + ','
					+ i + ')');
		}
	}

	Class172(Class146 class146, Class204 class204) {
		try {
			aClass146_2202 = class146;
			aClass204_2207 = class204;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hp.<init>("
					+ (class146 != null ? "{...}" : "null") + ','
					+ (class204 != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class11_Sub21 method1128(byte i) {
		try {
			anInt2208++;
			if (Class32.aClass84_425 == null || Class47.aClass336_737 == null)
				return null;
			int i_27_ = -65 / ((54 - i) / 62);
			Class47.aClass336_737.method2019(Class32.aClass84_425, -1819659005);
			Class11_Sub21 class11_sub21 = (Class11_Sub21) Class47.aClass336_737
					.method2018(11034);
			if (class11_sub21 == null)
				return null;
			Class23 class23 = Class32.aClass280_420.method1726((byte) -87,
					((Class11_Sub21) class11_sub21).anInt5964);
			if (class23 != null && ((Class23) class23).aBool206
					&& class23.method196(Class32.anInterface20_421, 2))
				return class11_sub21;
			return Class153.method956(true);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hp.A(" + i + ')');
		}
	}

	public final void method39(int i) {
		do {
			try {
				anInt2206++;
				aClass253_2204 = Class228.method1473(-20770, aClass146_2202,
						(((Class204) aClass204_2207).anInt2745));
				if (i == 11133)
					break;
				method1129(-40, -86);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "hp.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method1129(int i, int i_28_) {
		try {
			if (i_28_ > 104) {
				anInt2203++;
				Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
						-652872096, 12, i);
				class11_sub45_sub15.method3660(0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hp.C(" + i + ','
					+ i_28_ + ')');
		}
	}
}
