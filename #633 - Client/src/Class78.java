/* Class78 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class78 {
	static int anInt1049;
	static Class146 aClass146_1050;
	static int anInt1051;
	static int anInt1052;
	private int[] anIntArray1053;
	static int anInt1054;
	private byte[] aByteArray1055;
	static int anInt1056 = 1337;
	static int anInt1057 = 1;
	static int anInt1058;
	static int anInt1059;
	static int anInt1060;
	static Class253 aClass253_1061;
	private int[] anIntArray1062;
	static int anInt1063;

	final int method534(int i, byte[] is, int i_0_, byte i_1_, int i_2_,
			byte[] is_3_) {
		try {
			if (i_1_ != 31)
				method539(-50, -112, true, null);
			anInt1049++;
			int i_4_ = 0;
			int i_5_ = i_0_ << 3;
			for (i_2_ += i; (i ^ 0xffffffff) > (i_2_ ^ 0xffffffff); i++) {
				int i_6_ = is[i] & 0xff;
				int i_7_ = anIntArray1062[i_6_];
				int i_8_ = aByteArray1055[i_6_];
				if (i_8_ == 0)
					throw new RuntimeException("No codeword for data value "
							+ i_6_);
				int i_9_ = i_5_ >> 3;
				int i_10_ = i_5_ & 0x7;
				i_4_ &= -i_10_ >> 31;
				int i_11_ = i_9_ - -(-1 + (i_8_ + i_10_) >> 3);
				i_10_ += 24;
				is_3_[i_9_] = (byte) (i_4_ = Class173.method1134(i_4_,
						i_7_ >>> i_10_));
				if ((i_9_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff)) {
					i_10_ -= 8;
					i_9_++;
					is_3_[i_9_] = (byte) (i_4_ = i_7_ >>> i_10_);
					if (i_9_ < i_11_) {
						i_10_ -= 8;
						i_9_++;
						is_3_[i_9_] = (byte) (i_4_ = i_7_ >>> i_10_);
						if (i_9_ < i_11_) {
							i_10_ -= 8;
							i_9_++;
							is_3_[i_9_] = (byte) (i_4_ = i_7_ >>> i_10_);
							if (i_9_ < i_11_) {
								i_10_ -= 8;
								i_9_++;
								is_3_[i_9_] = (byte) (i_4_ = i_7_ << -i_10_);
							}
						}
					}
				}
				i_5_ += i_8_;
			}
			return -i_0_ + (i_5_ + 7 >> 3);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ar.D(" + i + ',' + (is != null ? "{...}" : "null") + ','
							+ i_0_ + ',' + i_1_ + ',' + i_2_ + ','
							+ (is_3_ != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method535(int i, int i_12_, int i_13_, int i_14_) {
		try {
			anInt1059++;
			i &= i_13_;
			if (i == 0)
				return i_12_;
			if (i == 1)
				return 7 - i_14_;
			if ((i ^ 0xffffffff) == -3)
				return -i_12_ + 7;
			return i_14_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ar.E(" + i + ','
					+ i_12_ + ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}

	public static void method536(int i) {
		try {
			aClass253_1061 = null;
			if (i == -1141)
				aClass146_1050 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ar.F(" + i + ')');
		}
	}

	static final Class321_Sub3_Sub1 method537(byte i, int i_15_,
			Class163_Sub3 class163_sub3, int i_16_, int i_17_) {
		try {
			if (i <= 49)
				return null;
			anInt1063++;
			if (!((Class163_Sub3) class163_sub3).aBool8352
					&& (!Class261.method1669(i_16_, (byte) 92) || !Class261
							.method1669(i_15_, (byte) 121))) {
				if (((Class163_Sub3) class163_sub3).aBool8389)
					return new Class321_Sub3_Sub1(class163_sub3, 34037, i_17_,
							i_16_, i_15_);
				return new Class321_Sub3_Sub1(class163_sub3, i_17_, i_16_,
						i_15_, Class11_Sub2_Sub33.method3808(115, i_16_),
						Class11_Sub2_Sub33.method3808(125, i_15_));
			}
			return new Class321_Sub3_Sub1(class163_sub3, 3553, i_17_, i_16_,
					i_15_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ar.B(" + i + ','
					+ i_15_ + ',' + (class163_sub3 != null ? "{...}" : "null")
					+ ',' + i_16_ + ',' + i_17_ + ')'));
		}
	}

	final int method538(byte[] is, int i, int i_18_, byte[] is_19_, int i_20_,
			int i_21_) {
		try {
			anInt1054++;
			if (i_20_ == 0)
				return 0;
			int i_22_ = i;
			i_20_ += i_21_;
			int i_23_ = i_18_;
			for (;;) {
				byte i_24_ = is[i_23_];
				if ((i_24_ ^ 0xffffffff) > -1)
					i_22_ = anIntArray1053[i_22_];
				else
					i_22_++;
				int i_25_;
				if ((i_25_ = anIntArray1053[i_22_]) < 0) {
					is_19_[i_21_++] = (byte) (i_25_ ^ 0xffffffff);
					if ((i_20_ ^ 0xffffffff) >= (i_21_ ^ 0xffffffff))
						break;
					i_22_ = 0;
				}
				if ((0x40 & i_24_ ^ 0xffffffff) == -1)
					i_22_++;
				else
					i_22_ = anIntArray1053[i_22_];
				if (((i_25_ = anIntArray1053[i_22_]) ^ 0xffffffff) > -1) {
					is_19_[i_21_++] = (byte) (i_25_ ^ 0xffffffff);
					if ((i_20_ ^ 0xffffffff) >= (i_21_ ^ 0xffffffff))
						break;
					i_22_ = 0;
				}
				if ((0x20 & i_24_) != 0)
					i_22_ = anIntArray1053[i_22_];
				else
					i_22_++;
				if ((i_25_ = anIntArray1053[i_22_]) < 0) {
					is_19_[i_21_++] = (byte) (i_25_ ^ 0xffffffff);
					if ((i_21_ ^ 0xffffffff) <= (i_20_ ^ 0xffffffff))
						break;
					i_22_ = 0;
				}
				if ((i_24_ & 0x10 ^ 0xffffffff) == -1)
					i_22_++;
				else
					i_22_ = anIntArray1053[i_22_];
				if (((i_25_ = anIntArray1053[i_22_]) ^ 0xffffffff) > -1) {
					is_19_[i_21_++] = (byte) (i_25_ ^ 0xffffffff);
					if ((i_20_ ^ 0xffffffff) >= (i_21_ ^ 0xffffffff))
						break;
					i_22_ = 0;
				}
				if ((0x8 & i_24_ ^ 0xffffffff) != -1)
					i_22_ = anIntArray1053[i_22_];
				else
					i_22_++;
				if ((i_25_ = anIntArray1053[i_22_]) < 0) {
					is_19_[i_21_++] = (byte) (i_25_ ^ 0xffffffff);
					if ((i_21_ ^ 0xffffffff) <= (i_20_ ^ 0xffffffff))
						break;
					i_22_ = 0;
				}
				if ((i_24_ & 0x4 ^ 0xffffffff) == -1)
					i_22_++;
				else
					i_22_ = anIntArray1053[i_22_];
				if ((i_25_ = anIntArray1053[i_22_]) < 0) {
					is_19_[i_21_++] = (byte) (i_25_ ^ 0xffffffff);
					if (i_21_ >= i_20_)
						break;
					i_22_ = 0;
				}
				if ((i_24_ & 0x2 ^ 0xffffffff) != -1)
					i_22_ = anIntArray1053[i_22_];
				else
					i_22_++;
				if (((i_25_ = anIntArray1053[i_22_]) ^ 0xffffffff) > -1) {
					is_19_[i_21_++] = (byte) (i_25_ ^ 0xffffffff);
					if (i_20_ <= i_21_)
						break;
					i_22_ = 0;
				}
				if ((0x1 & i_24_ ^ 0xffffffff) != -1)
					i_22_ = anIntArray1053[i_22_];
				else
					i_22_++;
				if ((i_25_ = anIntArray1053[i_22_]) < 0) {
					is_19_[i_21_++] = (byte) (i_25_ ^ 0xffffffff);
					if ((i_21_ ^ 0xffffffff) <= (i_20_ ^ 0xffffffff))
						break;
					i_22_ = 0;
				}
				i_23_++;
			}
			return 1 + i_23_ - i_18_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ar.A("
					+ (is != null ? "{...}" : "null") + ',' + i + ',' + i_18_
					+ ',' + (is_19_ != null ? "{...}" : "null") + ',' + i_20_
					+ ',' + i_21_ + ')'));
		}
	}

	static final void method539(int i, int i_26_, boolean bool,
			IComponentDefinitions class192) {
		do {
			try {
				anInt1058++;
				if (Class11_Sub2_Sub32_Sub1.aClass192_9889 == null
						&& !Class306.aBool4114
						&& (class192 != null && Class280.method1729((byte) 51,
								class192) != null)) {
					Class11_Sub2_Sub32_Sub1.aClass192_9889 = class192;
					Exception_Sub1.aClass192_9486 = Class280.method1729(
							(byte) 80, class192);
					Exception_Sub1.anInt9480 = 0;
					Class234_Sub2_Sub2.aBool8995 = false;
					Class15.anInt133 = i_26_;
					Class11_Sub45_Sub16.anInt9391 = i;
					if (bool == true)
						break;
					method539(66, 120, false, null);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ar.C(" + i + ','
						+ i_26_ + ',' + bool + ','
						+ (class192 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	Class78(byte[] is) {
		try {
			int i = is.length;
			anIntArray1062 = new int[i];
			aByteArray1055 = is;
			anIntArray1053 = new int[8];
			int[] is_27_ = new int[33];
			int i_28_ = 0;
			for (int i_29_ = 0; i_29_ < i; i_29_++) {
				int i_30_ = is[i_29_];
				if ((i_30_ ^ 0xffffffff) != -1) {
					int i_31_ = 1 << -i_30_ + 32;
					int i_32_ = is_27_[i_30_];
					anIntArray1062[i_29_] = i_32_;
					int i_33_;
					if ((i_32_ & i_31_ ^ 0xffffffff) != -1)
						i_33_ = is_27_[i_30_ - 1];
					else {
						i_33_ = i_31_ | i_32_;
						for (int i_34_ = -1 + i_30_; (i_34_ ^ 0xffffffff) <= -2; i_34_--) {
							int i_35_ = is_27_[i_34_];
							if (i_35_ != i_32_)
								break;
							int i_36_ = 1 << -i_34_ + 32;
							if ((i_35_ & i_36_ ^ 0xffffffff) != -1) {
								is_27_[i_34_] = is_27_[i_34_ - 1];
								break;
							}
							is_27_[i_34_] = Class173.method1134(i_36_, i_35_);
						}
					}
					is_27_[i_30_] = i_33_;
					for (int i_37_ = i_30_ + 1; (i_37_ ^ 0xffffffff) >= -33; i_37_++) {
						if (is_27_[i_37_] == i_32_)
							is_27_[i_37_] = i_33_;
					}
					int i_38_ = 0;
					for (int i_39_ = 0; i_30_ > i_39_; i_39_++) {
						int i_40_ = -2147483648 >>> i_39_;
						if ((i_40_ & i_32_) == 0)
							i_38_++;
						else {
							if (anIntArray1053[i_38_] == 0)
								anIntArray1053[i_38_] = i_28_;
							i_38_ = anIntArray1053[i_38_];
						}
						if ((i_38_ ^ 0xffffffff) <= (anIntArray1053.length ^ 0xffffffff)) {
							int[] is_41_ = new int[anIntArray1053.length * 2];
							for (int i_42_ = 0; ((i_42_ ^ 0xffffffff) > (anIntArray1053.length ^ 0xffffffff)); i_42_++)
								is_41_[i_42_] = anIntArray1053[i_42_];
							anIntArray1053 = is_41_;
						}
						i_40_ >>>= 1;
					}
					anIntArray1053[i_38_] = i_29_ ^ 0xffffffff;
					if ((i_28_ ^ 0xffffffff) >= (i_38_ ^ 0xffffffff))
						i_28_ = 1 + i_38_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ar.<init>("
					+ (is != null ? "{...}" : "null") + ')');
		}
	}
}
