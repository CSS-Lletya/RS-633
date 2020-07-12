/* Class350 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class350 {
	static Class307 aClass307_4608 = new Class307("LIVE", 0);
	byte aByte4609;
	static int anInt4610;
	short aShort4611;
	byte aByte4612;
	Interface9 anInterface9_4613;
	static Class183 aClass183_4614 = new Class183();
	static boolean aBool4615 = false;
	static int anInt4616;
	static int anInt4617;

	static final boolean method2101(int i, int i_0_, int i_1_, byte i_2_,
			int i_3_, int i_4_, int[] is, int i_5_) {
		try {
			if (i_4_ > Class2_Sub1.anInt5065)
				i_4_ = Class2_Sub1.anInt5065;
			anInt4610++;
			if (i_1_ < 0)
				i_1_ = 0;
			if (i_4_ <= i_1_)
				return true;
			i_3_ = -i_1_ + i_4_ >> 2;
			i += i_0_ * i_1_;
			i_5_ += i_1_ - 1;
			int i_6_ = -49 % ((-5 - i_2_) / 38);
			if (Class126.anInt1708 != 1) {
				i -= 38400;
				while (--i_3_ >= 0) {
					if ((i ^ 0xffffffff) > (is[++i_5_] ^ 0xffffffff))
						return false;
					i += i_0_;
					if ((is[++i_5_] ^ 0xffffffff) < (i ^ 0xffffffff))
						return false;
					i += i_0_;
					if ((i ^ 0xffffffff) > (is[++i_5_] ^ 0xffffffff))
						return false;
					i += i_0_;
					if (i < is[++i_5_])
						return false;
					i += i_0_;
				}
				i_3_ = 0x3 & i_4_ + -i_1_;
				while (--i_3_ >= 0) {
					if (is[++i_5_] > i)
						return false;
					i += i_0_;
				}
			} else {
				Class217.anInt3003 += i_3_;
				while (--i_3_ >= 0) {
					if ((i ^ 0xffffffff) > (is[++i_5_] ^ 0xffffffff))
						is[i_5_] = i;
					i += i_0_;
					if (is[++i_5_] > i)
						is[i_5_] = i;
					i += i_0_;
					if (i < is[++i_5_])
						is[i_5_] = i;
					i += i_0_;
					if (i < is[++i_5_])
						is[i_5_] = i;
					i += i_0_;
				}
				i_3_ = -i_1_ + i_4_ & 0x3;
				while (--i_3_ >= 0) {
					if ((i ^ 0xffffffff) > (is[++i_5_] ^ 0xffffffff))
						is[i_5_] = i;
					i += i_0_;
				}
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("vp.B(" + i + ',' + i_0_
							+ ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
							+ ',' + (is != null ? "{...}" : "null") + ','
							+ i_5_ + ')'));
		}
	}

	Class350(Interface9 interface9, int i, int i_7_, int i_8_) {
		try {
			((Class350) this).aByte4609 = (byte) i_8_;
			((Class350) this).aByte4612 = (byte) i_7_;
			((Class350) this).aShort4611 = (short) i;
			((Class350) this).anInterface9_4613 = interface9;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vp.<init>("
					+ (interface9 != null ? "{...}" : "null") + ',' + i + ','
					+ i_7_ + ',' + i_8_ + ')'));
		}
	}

	public static void method2102(int i) {
		try {
			if (i != 20816)
				aBool4615 = false;
			aClass307_4608 = null;
			aClass183_4614 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vp.A(" + i + ')');
		}
	}
}
