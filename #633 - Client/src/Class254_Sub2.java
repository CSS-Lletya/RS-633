/* Class254_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class254_Sub2 extends Class254 {
	int anInt6984;
	int anInt6985;
	int anInt6986;
	static Class111[] aClass111Array6987 = new Class111[6];
	int anInt6988;
	static int anInt6989;
	static int anInt6990;
	int anInt6991;
	static int anInt6992;
	int anInt6993;
	static boolean aBool6994 = false;
	static int anInt6995;

	static final void method2827(int i, int i_0_, int i_1_, boolean bool,
			int i_2_) {
		try {
			anInt6992++;
			float f = (float) Class32.anInt447 / (float) Class32.anInt432;
			int i_3_ = i;
			if (bool != false)
				aClass111Array6987 = null;
			int i_4_ = i_0_;
			do {
				if (!(f < 1.0F)) {
					i_3_ = (int) ((float) i_0_ / f);
					if (!client.aBool10531)
						break;
				}
				i_4_ = (int) ((float) i * f);
			} while (false);
			i_1_ -= (-i_3_ + i) / 2;
			i_2_ -= (-i_4_ + i_0_) / 2;
			Class239_Sub2.anInt7912 = Class32.anInt447
					+ -(Class32.anInt447 * i_2_ / i_4_);
			Class11_Sub12.anInt5446 = -1;
			Class14.anInt124 = Class32.anInt432 * i_1_ / i_3_;
			Class127.anInt1720 = -1;
			Class283.method1744((byte) 56);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("oq.E(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + bool + ',' + i_2_ + ')'));
		}
	}

	static final void method2828(int i, int i_5_, Class40 class40, int i_6_,
			Class163 class163, int i_7_, Class11_Sub21 class11_sub21,
			Class23 class23, int i_8_) {
		try {
			anInt6990++;
			int i_9_ = -5 + i_5_ + -(i / 2);
			int i_10_ = 2 + i_8_;
			if (((Class23) class23).anInt229 != 0)
				class163.method1035(((Class23) class23).anInt229, i_9_, i_10_,
						(byte) 112,
						-i_10_ + (i_8_ - (-(i_6_ * class40.method359()) - 1)),
						i + 10);
			if (((Class23) class23).anInt224 != 0)
				class163.method1018(i_10_, ((Class23) class23).anInt224, 1
						+ class40.method359() * i_6_ + (i_8_ - i_10_), i + 10,
						102, i_9_);
			int i_11_ = 119 / ((i_7_ + 25) / 54);
			int i_12_ = ((Class23) class23).anInt246;
			if (((Class11_Sub21) class11_sub21).aBool5961
					&& (((Class23) class23).anInt244 ^ 0xffffffff) != 0)
				i_12_ = ((Class23) class23).anInt244;
			for (int i_13_ = 0; i_13_ < i_6_; i_13_++) {
				String string = Class108_Sub27.aStringArray7865[i_13_];
				if ((i_13_ ^ 0xffffffff) > (i_6_ - 1 ^ 0xffffffff))
					string = string.substring(0, string.length() - 4);
				class40.method362(class163, string, i_5_, i_8_, i_12_, true);
				i_8_ += class40.method359();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(
							runtimeexception,
							("oq.D("
									+ i
									+ ','
									+ i_5_
									+ ','
									+ (class40 != null ? "{...}" : "null")
									+ ','
									+ i_6_
									+ ','
									+ (class163 != null ? "{...}" : "null")
									+ ','
									+ i_7_
									+ ','
									+ (class11_sub21 != null ? "{...}" : "null")
									+ ','
									+ (class23 != null ? "{...}" : "null")
									+ ',' + i_8_ + ')'));
		}
	}

	public Class9 method21(boolean bool) {
		try {
			anInt6989++;
			if (bool != false)
				((Class254_Sub2) this).anInt6986 = -126;
			return Class70.aClass9_983;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oq.A(" + bool + ')');
		}
	}

	public static void method2829(int i) {
		try {
			if (i <= 6)
				aClass111Array6987 = null;
			aClass111Array6987 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oq.C(" + i + ')');
		}
	}

	Class254_Sub2(Class118 class118, Class150 class150, int i, int i_14_,
			int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_,
			int i_21_, int i_22_, int i_23_, int i_24_, int i_25_) {
		super(class118, class150, i, i_14_, i_15_, i_16_, i_17_, i_18_, i_19_);
		try {
			((Class254_Sub2) this).anInt6986 = i_25_;
			((Class254_Sub2) this).anInt6985 = i_24_;
			((Class254_Sub2) this).anInt6984 = i_21_;
			((Class254_Sub2) this).anInt6991 = i_20_;
			((Class254_Sub2) this).anInt6993 = i_23_;
			((Class254_Sub2) this).anInt6988 = i_22_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("oq.<init>("
					+ (class118 != null ? "{...}" : "null") + ','
					+ (class150 != null ? "{...}" : "null") + ',' + i + ','
					+ i_14_ + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ','
					+ i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ','
					+ i_22_ + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ')'));
		}
	}

	static final int method2830(byte[][] is, byte[] is_26_, int[] is_27_,
			int i, int i_28_, byte[][] is_29_, int i_30_, int[] is_31_) {
		try {
			anInt6995++;
			int i_32_ = is_27_[i_28_];
			int i_33_ = i_32_ + is_31_[i_28_];
			int i_34_ = is_27_[i_30_];
			int i_35_ = is_31_[i_30_] + i_34_;
			int i_36_ = i_32_;
			if ((i_32_ ^ 0xffffffff) > (i_34_ ^ 0xffffffff))
				i_36_ = i_34_;
			int i_37_ = i_33_;
			if ((i_33_ ^ 0xffffffff) < (i_35_ ^ 0xffffffff))
				i_37_ = i_35_;
			int i_38_ = 0xff & is_26_[i_28_];
			if ((i & is_26_[i_30_] ^ 0xffffffff) > (i_38_ ^ 0xffffffff))
				i_38_ = is_26_[i_30_] & 0xff;
			byte[] is_39_ = is_29_[i_28_];
			byte[] is_40_ = is[i_30_];
			int i_41_ = i_36_ - i_32_;
			int i_42_ = i_36_ + -i_34_;
			for (int i_43_ = i_36_; i_37_ > i_43_; i_43_++) {
				int i_44_ = is_40_[i_42_++] + is_39_[i_41_++];
				if ((i_38_ ^ 0xffffffff) < (i_44_ ^ 0xffffffff))
					i_38_ = i_44_;
			}
			return -i_38_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("oq.F("
					+ (is != null ? "{...}" : "null") + ','
					+ (is_26_ != null ? "{...}" : "null") + ','
					+ (is_27_ != null ? "{...}" : "null") + ',' + i + ','
					+ i_28_ + ',' + (is_29_ != null ? "{...}" : "null") + ','
					+ i_30_ + ',' + (is_31_ != null ? "{...}" : "null") + ')'));
		}
	}
}
