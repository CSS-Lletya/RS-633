/* Class108_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108_Sub6 extends Class108 {
	static int anInt5623;
	static int anInt5624;
	static int anInt5625;
	static int anInt5626;
	static Class364[][][] aClass364ArrayArrayArray5627;
	static int anInt5628;
	static int anInt5629;
	static float[] aFloatArray5630 = new float[16];
	static int anInt5631;
	static int anInt5632 = -2;
	static int anInt5633;

	final int method725(byte i) {
		try {
			int i_0_ = -83 / ((70 - i) / 51);
			anInt5631++;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bi.A(" + i + ')');
		}
	}

	final int method2429(boolean bool) {
		try {
			if (bool != false)
				method726(false);
			anInt5629++;
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bi.B(" + bool + ')');
		}
	}

	final boolean method2430(byte i) {
		try {
			anInt5628++;
			if (((Class108) this).aClass11_Sub17_1458.method2454(-21) == Class142.aClass66_1925) {
				if (((Class108) this).aClass11_Sub17_1458.method2456(-18373))
					return false;
				return true;
			}
			if (i != -53)
				method2433(-63, (byte) -28, 80, true, 64, -64, -71);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bi.D(" + i + ')');
		}
	}

	static final boolean method2431(int i, int i_1_, byte i_2_) {
		try {
			anInt5626++;
			int i_3_ = 117 % ((i_2_ + 87) / 37);
			if (!Class321.method1962((byte) -97, i, i_1_)
					&& !Class219.method1404(false, i_1_, i))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bi.H(" + i + ','
					+ i_1_ + ',' + i_2_ + ')'));
		}
	}

	Class108_Sub6(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
	}

	final void method726(boolean bool) {
		do {
			try {
				anInt5633++;
				if (bool == false) {
					if (((Class108) this).aClass11_Sub17_1458.method2454(-21) != Class142.aClass66_1925)
						((Class108) this).anInt1459 = 1;
					else if (((Class108) this).aClass11_Sub17_1458
							.method2456(-18373))
						((Class108) this).anInt1459 = 0;
					if (((Class108) this).anInt1459 == 0
							|| (((Class108) this).anInt1459 ^ 0xffffffff) == -2)
						break;
					((Class108) this).anInt1459 = method725((byte) 121);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "bi.E(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	public static void method2432(boolean bool) {
		try {
			if (bool != true)
				method2431(-51, -72, (byte) -53);
			aFloatArray5630 = null;
			aClass364ArrayArrayArray5627 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bi.I(" + bool + ')');
		}
	}

	final int method721(int i, int i_4_) {
		try {
			anInt5625++;
			if (((Class108) this).aClass11_Sub17_1458.method2454(-21) == Class142.aClass66_1925) {
				if (((Class108) this).aClass11_Sub17_1458.method2456(-18373))
					return 3;
				if (i == 0
						|| (((Class11_Sub17) ((Class108) this).aClass11_Sub17_1458).aClass108_Sub16_5721
								.method2710(false) ^ 0xffffffff) == -2)
					return 1;
				return 2;
			}
			if (i_4_ < 10)
				aFloatArray5630 = null;
			return 3;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bi.F(" + i + ','
					+ i_4_ + ')');
		}
	}

	static final void method2433(int i, byte i_5_, int i_6_, boolean bool,
			int i_7_, int i_8_, int i_9_) {
		do {
			try {
				Class108_Sub17.anInt6623 = i;
				anInt5624++;
				Class12_Sub1.anInt5156 = i_9_;
				Class251_Sub1.anInt5417 = i_6_;
				Class270.anInt3650 = i_7_;
				Class324.anInt4323 = i_8_;
				if (bool && Class108_Sub17.anInt6623 >= 100) {
					Class11_Sub45_Sub11.anInt9157 = Class251_Sub1.anInt5417 * 512 + 256;
					Class303.anInt4088 = Class270.anInt3650 * 512 + 256;
					Class218.anInt3007 = (Class318.method1931(71,
							Class303.anInt4088, Class376_Sub7_Sub2.anInt9242,
							Class11_Sub45_Sub11.anInt9157) + -Class12_Sub1.anInt5156);
				}
				Canvas_Sub1.anInt9233 = Class170.anInt2186 = -1;
				Class191.anInt2453 = 2;
				if (i_5_ <= -15)
					break;
				aFloatArray5630 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("bi.G(" + i + ','
						+ i_5_ + ',' + i_6_ + ',' + bool + ',' + i_7_ + ','
						+ i_8_ + ',' + i_9_ + ')'));
			}
			break;
		} while (false);
	}

	Class108_Sub6(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}

	final void method728(int i, int i_10_) {
		try {
			((Class108) this).anInt1459 = i_10_;
			if (i != 0)
				method2430((byte) -121);
			anInt5623++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bi.C(" + i + ','
					+ i_10_ + ')');
		}
	}
}
