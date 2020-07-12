/* Class95 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class95 {
	static int anInt1272;
	static int anInt1273;
	private Class163_Sub3 aClass163_Sub3_1274;
	static int anInt1275;
	static int anInt1276;
	static Class164 aClass164_1277 = new Class164();
	static int anInt1278;
	long aLong1279;

	static final void method640(boolean bool, boolean bool_0_, byte i) {
		do {
			try {
				anInt1273++;
				if (i != 66)
					aClass164_1277 = null;
				if (bool) {
					Class367.anInt4822--;
					if ((Class367.anInt4822 ^ 0xffffffff) == -1)
						Class27.anIntArray359 = null;
				}
				if (!bool_0_)
					break;
				InterfaceSettings.anInt5351--;
				if (InterfaceSettings.anInt5351 != 0)
					break;
				Class219_Sub1.anIntArray7248 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("bu.B(" + bool
						+ ',' + bool_0_ + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final boolean method641(byte i, String string, int i_1_, boolean bool) {
		try {
			anInt1272++;
			if (i_1_ < 2 || i_1_ > 36)
				throw new IllegalArgumentException("Invalid radix:" + i_1_);
			if (i < 61)
				method641((byte) -126, null, -45, true);
			boolean bool_2_ = false;
			boolean bool_3_ = false;
			int i_4_ = 0;
			int i_5_ = string.length();
			for (int i_6_ = 0; (i_5_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++) {
				int i_7_ = string.charAt(i_6_);
				if (i_6_ == 0) {
					if ((i_7_ ^ 0xffffffff) == -46) {
						bool_2_ = true;
						continue;
					}
					if (i_7_ == 43 && bool)
						continue;
				}
				if (i_7_ < 48 || (i_7_ ^ 0xffffffff) < -58) {
					if ((i_7_ ^ 0xffffffff) > -66 || (i_7_ ^ 0xffffffff) < -91) {
						if (i_7_ >= 97 && i_7_ <= 122)
							i_7_ -= 87;
						else
							return false;
					} else
						i_7_ -= 55;
				} else
					i_7_ -= 48;
				if (i_1_ <= i_7_)
					return false;
				if (bool_2_)
					i_7_ = -i_7_;
				int i_8_ = i_1_ * i_4_ - -i_7_;
				if (i_4_ != i_8_ / i_1_)
					return false;
				i_4_ = i_8_;
				bool_3_ = true;
			}
			return bool_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bu.C(" + i + ','
					+ (string != null ? "{...}" : "null") + ',' + i_1_ + ','
					+ bool + ')'));
		}
	}

	protected final void finalize() throws Throwable {
		try {
			aClass163_Sub3_1274.method3299(((Class95) this).aLong1279, -1);
			anInt1275++;
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bu.finalize(" + ')');
		}
	}

	static final boolean method642(byte i, int i_9_, int i_10_) {
		try {
			if (i != 9)
				return false;
			anInt1278++;
			if ((0x100 & i_10_ ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bu.D(" + i + ','
					+ i_9_ + ',' + i_10_ + ')'));
		}
	}

	static final boolean method643(int i, int i_11_, int i_12_, int i_13_,
			int i_14_) {
		try {
			anInt1276++;
			if (!Class108_Sub10.aBool6130 || !Class236_Sub5.aBool6848)
				return false;
			if ((Class217.anInt3003 ^ 0xffffffff) > -101)
				return false;
			if (!Class11_Sub2_Sub30.method3792(i_14_, 843095752, i_12_, i_13_))
				return false;
			int i_15_ = i_13_ << Class11_Sub2_Sub8.anInt8751;
			int i_16_ = i_12_ << Class11_Sub2_Sub8.anInt8751;
			if (Class243.method1536(i, Class376_Sub7_Sub3_Sub2.anInt10141,
					Class376_Sub7_Sub3_Sub2.anInt10141, i_16_, (byte) 108,
					Class315.aClass12Array4179[i_14_].method131((byte) -126,
							i_12_, i_13_), i_15_)) {
				Class112.anInt1540++;
				return true;
			}
			if (i_11_ < 54)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bu.E(" + i + ','
					+ i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}

	Class95(Class163_Sub3 class163_sub3, long l, int i) {
		try {
			aClass163_Sub3_1274 = class163_sub3;
			((Class95) this).aLong1279 = l;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bu.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + l
					+ ',' + i + ')'));
		}
	}

	public static void method644(int i) {
		try {
			if (i != 36)
				aClass164_1277 = null;
			aClass164_1277 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bu.A(" + i + ')');
		}
	}
}
