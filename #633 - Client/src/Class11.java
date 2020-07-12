/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class11 {
	static int anInt84;
	static int anInt85;
	static int anInt86;
	static int anInt87;
	Class11 aClass11_88;
	static int anInt89;
	Class11 aClass11_90;
	long aLong91;
	static int anInt92;

	static final boolean method121(int i, int i_0_, int i_1_) {
		try {
			if (i_1_ != 0)
				return true;
			anInt85++;
			if (!Class234.method1495(false, i, i_0_)
					&& !Class46.method403(i, i_0_, 55))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("m.R(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method122(int i) {
		try {
			anInt86++;
			if (i >= -26)
				anInt84 = 33;
			if (((Class11) this).aClass11_90 != null) {
				((Class11) ((Class11) this).aClass11_90).aClass11_88 = ((Class11) this).aClass11_88;
				((Class11) ((Class11) this).aClass11_88).aClass11_90 = ((Class11) this).aClass11_90;
				((Class11) this).aClass11_90 = null;
				((Class11) this).aClass11_88 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "m.V(" + i + ')');
		}
	}

	static final void method123(int i, int i_2_, byte i_3_, int i_4_, int i_5_) {
		do {
			try {
				anInt89++;
				if (OutputStream_Sub1.anInt5845 == 1) {
					int i_6_ = i_4_ / Class11_Sub27.anInt6556;
					int i_7_ = i_2_ / Class11_Sub27.anInt6556;
					int i_8_ = i_5_ / Class11_Sub24.anInt6238;
					int i_9_ = i / Class11_Sub24.anInt6238;
					if ((Class39.anInt556 ^ 0xffffffff) < (i_6_ ^ 0xffffffff)
							&& i_7_ >= 0
							&& Class11_Sub45_Sub10.anInt8958 > i_8_
							&& (i_9_ ^ 0xffffffff) <= -1) {
						if ((i_6_ ^ 0xffffffff) > -1)
							i_6_ = 0;
						if ((i_9_ ^ 0xffffffff) <= (Class11_Sub45_Sub10.anInt8958 ^ 0xffffffff))
							i_9_ = -1 + Class11_Sub45_Sub10.anInt8958;
						if ((i_7_ ^ 0xffffffff) <= (Class39.anInt556 ^ 0xffffffff))
							i_7_ = Class39.anInt556 - 1;
						if ((i_8_ ^ 0xffffffff) > -1)
							i_8_ = 0;
						for (int i_10_ = i_8_; i_10_ <= i_9_; i_10_++) {
							int i_11_ = ((InputStream_Sub2.method2812(
									Class128.anInt1727 + i_10_,
									Class11_Sub45_Sub10.anInt8958, false)) * Class39.anInt556);
							for (int i_12_ = i_6_; i_12_ <= i_7_; i_12_++) {
								int i_13_ = i_11_
										+ (InputStream_Sub2.method2812(i_12_
												+ Class275.anInt3696,
												Class39.anInt556, false));
								Class175.anIntArray2231[i_13_] = Class78.anInt1057;
							}
						}
						if (i_3_ < -60)
							break;
						anInt84 = -93;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("m.T(" + i + ','
						+ i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
			}
			break;
		} while (false);
	}

	final boolean method124(int i) {
		try {
			if (i != 0)
				return true;
			anInt87++;
			if (((Class11) this).aClass11_90 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "m.Q(" + i + ')');
		}
	}

	public Class11() {
		/* empty */
	}

	static final void method125(byte i) {
		try {
			Class11_Sub46_Sub2.aBool9060 = true;
			if (i >= -66)
				anInt84 = -80;
			anInt92++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "m.U(" + i + ')');
		}
	}
}
