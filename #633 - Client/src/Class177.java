/* Class177 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class177 {
	static int anInt2238;
	static int anInt2239;
	Interface7[] anInterface7Array2240 = null;
	private Class163_Sub2 aClass163_Sub2_2241;
	static double aDouble2242;
	boolean aBool2243;
	private Interface7[] anInterface7Array2244 = null;
	static int anInt2245 = 64;
	static int anInt2246 = 0;
	Interface17 anInterface17_2247 = null;
	Interface17 anInterface17_2248 = null;
	static short[] aShortArray2249;
	static int anInt2250;

	static final void method1147(byte i, int i_0_) {
		try {
			anInt2239++;
			Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
					-652872096, 1, i_0_);
			if (i == 113)
				class11_sub45_sub15.method3660(i - 113);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ic.D(" + i + ','
					+ i_0_ + ')');
		}
	}

	final boolean method1148(boolean bool) {
		try {
			if (((Class177) this).anInterface17_2248 == null) {
				if (Class11_Sub2_Sub29.anObject9467 == null) {
					byte[] is = Class108_Sub11.method2624(0.5F, 16, 128,
							new Class328_Sub1(419684), 128, 8, 16.0F, 4.0F, 0,
							0.6F, 4.0F);
					Class11_Sub2_Sub29.anObject9467 = Class254_Sub3.method3238(
							110, false, is);
				}
				byte[] is = Class236_Sub9.method3122(2, false,
						(Class11_Sub2_Sub29.anObject9467));
				byte[] is_1_ = new byte[4 * is.length];
				int i = 0;
				for (int i_2_ = 0; i_2_ < 16; i_2_++) {
					int i_3_ = 128 * i_2_ * 128;
					int i_4_ = i_3_;
					for (int i_5_ = 0; i_5_ < 128; i_5_++) {
						int i_6_ = i_4_ - -(i_5_ * 128);
						int i_7_ = i_4_ - -(128 * (0x7f & -1 + i_5_));
						int i_8_ = i_4_ + 128 * (i_5_ + 1 & 0x7f);
						for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -129; i_9_++) {
							float f = (float) (-(0xff & is[i_8_ - -i_9_]) + (0xff & is[i_9_
									+ i_7_]));
							float f_10_ = (float) ((0xff & is[(i_9_ - 1 & 0x7f)
									+ i_6_]) - (is[(0x7f & 1 + i_9_) + i_6_] & 0xff));
							float f_11_ = (float) (128.0 / Math
									.sqrt((double) (f_10_ * f_10_ + 16384.0F + f
											* f)));
							is_1_[i++] = (byte) (int) (f_10_ * f_11_ + 127.0F);
							is_1_[i++] = (byte) (int) (127.0F + f_11_ * 128.0F);
							is_1_[i++] = (byte) (int) (127.0F + f * f_11_);
							is_1_[i++] = is[i_3_++];
						}
					}
				}
				((Class177) this).anInterface17_2248 = aClass163_Sub2_2241
						.method3028(128, (byte) -120, 16,
								Class364.aClass98_4774, 128, is_1_);
			}
			if (bool != false)
				return false;
			anInt2238++;
			if (((Class177) this).anInterface17_2248 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ic.B(" + bool + ')');
		}
	}

	final boolean method1149(int i) {
		try {
			if (i != -30571)
				aShortArray2249 = null;
			anInt2250++;
			if (!((Class177) this).aBool2243) {
				if (((Class177) this).anInterface7Array2240 == null)
					return false;
				return true;
			}
			if (((Class177) this).anInterface17_2247 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ic.C(" + i + ')');
		}
	}

	Class177(Class163_Sub2 class163_sub2) {
		try {
			aClass163_Sub2_2241 = class163_sub2;
			((Class177) this).aBool2243 = ((Class163_Sub2) aClass163_Sub2_2241).aBool7612;
			if (((Class177) this).aBool2243
					&& !aClass163_Sub2_2241.method2977(Class366.aClass366_4808,
							Class376_Sub6.aClass98_6952, 98))
				((Class177) this).aBool2243 = false;
			if (((Class177) this).aBool2243
					|| aClass163_Sub2_2241.method3009(Class366.aClass366_4808,
							Class376_Sub6.aClass98_6952, (byte) -45)) {
				Class104.method688(16);
				if (!((Class177) this).aBool2243) {
					((Class177) this).anInterface7Array2240 = new Interface7[16];
					for (int i = 0; i < 16; i++) {
						byte[] is = Class376_Sub1.method2272(
								Class229.anObject3153, 128 * (128 * i * 2), 0,
								32768);
						((Class177) this).anInterface7Array2240[i] = aClass163_Sub2_2241
								.method3011(true,
										(Class376_Sub6.aClass98_6952), is, 94,
										128, 128);
					}
					anInterface7Array2244 = new Interface7[16];
					for (int i = 0; (i ^ 0xffffffff) > -17; i++) {
						byte[] is = Class376_Sub1.method2272(
								Class118.anObject1608, 2 * (i * 128) * 128, 0,
								32768);
						anInterface7Array2244[i] = aClass163_Sub2_2241
								.method3011(true,
										(Class376_Sub6.aClass98_6952), is, 107,
										128, 128);
					}
				} else {
					byte[] is = Class236_Sub9.method3122(2, false,
							Class229.anObject3153);
					((Class177) this).anInterface17_2247 = aClass163_Sub2_2241
							.method3028(128, (byte) -102, 16,
									(Class376_Sub6.aClass98_6952), 128, is);
					is = Class236_Sub9.method3122(2, false,
							Class118.anObject1608);
					aClass163_Sub2_2241.method3028(128, (byte) -96, 16,
							Class376_Sub6.aClass98_6952, 128, is);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ic.<init>("
					+ (class163_sub2 != null ? "{...}" : "null") + ')');
		}
	}

	public static void method1150(int i) {
		try {
			if (i <= 5)
				aDouble2242 = 0.12382061902172252;
			aShortArray2249 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ic.A(" + i + ')');
		}
	}
}
