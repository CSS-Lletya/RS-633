/* Class376_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class376_Sub1_Sub1 extends Class376_Sub1 {
	int anInt8684;
	static Class22 aClass22_8685;
	boolean aBool8686;
	static int anInt8687;
	static int[] anIntArray8688 = { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
	int anInt8689;
	static Class322[] aClass322Array8690;
	int anInt8691;
	int anInt8692;
	static int anInt8693;
	int anInt8694;
	static int anInt8695 = 2;
	int anInt8696;
	byte aByte8697 = 5;

	static final Actor method3409(int i, int i_0_, int i_1_,
			int i_2_) {
		try {
			anInt8693++;
			Class364 class364 = Class181.aClass364ArrayArrayArray2336[i_1_][i_2_][i_0_];
			if (class364 == null)
				return null;
			Actor class376_sub7_sub5_sub5 = null;
			int i_3_ = -1;
			Class140 class140 = ((Class364) class364).aClass140_4781;
			if (i != 4)
				method3411(true);
			for (/**/; class140 != null; class140 = ((Class140) class140).aClass140_1895) {
				Class376_Sub7_Sub5 class376_sub7_sub5 = ((Class140) class140).aClass376_Sub7_Sub5_1896;
				if (class376_sub7_sub5 instanceof Actor) {
					Actor class376_sub7_sub5_sub5_4_ = (Actor) class376_sub7_sub5;
					int i_5_ = (256 * class376_sub7_sub5_sub5_4_
							.method3968((byte) 127) - 4);
					int i_6_ = -i_5_
							+ (((Class376_Sub7) class376_sub7_sub5_sub5_4_).anInt7045) >> 9;
					int i_7_ = -i_5_
							+ (((Class376_Sub7) class376_sub7_sub5_sub5_4_).anInt7031) >> 9;
					int i_8_ = ((((Class376_Sub7) class376_sub7_sub5_sub5_4_).anInt7045)
							+ i_5_ >> 9);
					int i_9_ = (i_5_
							+ (((Class376_Sub7) class376_sub7_sub5_sub5_4_).anInt7031) >> 9);
					if (i_2_ >= i_6_ && i_7_ <= i_0_ && i_8_ >= i_2_
							&& (i_0_ ^ 0xffffffff) >= (i_9_ ^ 0xffffffff)) {
						int i_10_ = (i_9_ + 1 + -i_0_) * (i_8_ + 1 + -i_2_);
						if ((i_3_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff)) {
							i_3_ = i_10_;
							class376_sub7_sub5_sub5 = class376_sub7_sub5_sub5_4_;
						}
					}
				}
			}
			return class376_sub7_sub5_sub5;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ab.J(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final byte[][][] method3410(int i, byte i_11_) {
		try {
			anInt8687++;
			byte[][][] is = new byte[8][4][];
			int i_12_ = i;
			int i_13_ = i;
			byte[] is_14_ = new byte[i_12_ * i_13_];
			int i_15_ = 0;
			int i_16_ = 0;
			if (i_11_ != 87)
				anIntArray8688 = null;
			for (/**/; (i_13_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++) {
				for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff); i_17_++) {
					if (i_16_ >= i_17_)
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[0][0] = is_14_;
			is_14_ = new byte[i_13_ * i_12_];
			i_15_ = 0;
			for (int i_18_ = -1 + i_13_; (i_18_ ^ 0xffffffff) <= -1; i_18_--) {
				for (int i_19_ = 0; i_13_ > i_19_; i_19_++) {
					if (i_19_ <= i_18_)
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[0][1] = is_14_;
			is_14_ = new byte[i_12_ * i_13_];
			i_15_ = 0;
			for (int i_20_ = 0; i_20_ < i_13_; i_20_++) {
				for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff); i_21_++) {
					if ((i_21_ ^ 0xffffffff) <= (i_20_ ^ 0xffffffff))
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[0][2] = is_14_;
			i_15_ = 0;
			is_14_ = new byte[i_12_ * i_13_];
			for (int i_22_ = i_13_ - 1; i_22_ >= 0; i_22_--) {
				for (int i_23_ = 0; i_12_ > i_23_; i_23_++) {
					if ((i_23_ ^ 0xffffffff) <= (i_22_ ^ 0xffffffff))
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[0][3] = is_14_;
			i_15_ = 0;
			is_14_ = new byte[i_13_ * i_12_];
			for (int i_24_ = -1 + i_13_; i_24_ >= 0; i_24_--) {
				for (int i_25_ = 0; i_12_ > i_25_; i_25_++) {
					if ((i_25_ ^ 0xffffffff) >= (i_24_ >> 1 ^ 0xffffffff))
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[1][0] = is_14_;
			i_15_ = 0;
			is_14_ = new byte[i_13_ * i_12_];
			for (int i_26_ = 0; i_13_ > i_26_; i_26_++) {
				for (int i_27_ = 0; (i_12_ ^ 0xffffffff) < (i_27_ ^ 0xffffffff); i_27_++) {
					if (i_15_ < 0
							|| (i_15_ ^ 0xffffffff) <= (is_14_.length ^ 0xffffffff))
						i_15_++;
					else {
						if ((i_27_ ^ 0xffffffff) <= (i_26_ << 1 ^ 0xffffffff))
							is_14_[i_15_] = (byte) -1;
						i_15_++;
					}
				}
			}
			is[1][1] = is_14_;
			is_14_ = new byte[i_12_ * i_13_];
			i_15_ = 0;
			for (int i_28_ = 0; (i_28_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff); i_28_++) {
				for (int i_29_ = -1 + i_12_; i_29_ >= 0; i_29_--) {
					if (i_28_ >> 1 >= i_29_)
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[1][2] = is_14_;
			is_14_ = new byte[i_13_ * i_12_];
			i_15_ = 0;
			for (int i_30_ = i_13_ - 1; (i_30_ ^ 0xffffffff) <= -1; i_30_--) {
				for (int i_31_ = i_12_ - 1; i_31_ >= 0; i_31_--) {
					if (i_30_ << 1 <= i_31_)
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[1][3] = is_14_;
			is_14_ = new byte[i_13_ * i_12_];
			i_15_ = 0;
			for (int i_32_ = i_13_ - 1; i_32_ >= 0; i_32_--) {
				for (int i_33_ = -1 + i_12_; i_33_ >= 0; i_33_--) {
					if (i_32_ >> 1 >= i_33_)
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[2][0] = is_14_;
			is_14_ = new byte[i_12_ * i_13_];
			i_15_ = 0;
			for (int i_34_ = i_13_ - 1; (i_34_ ^ 0xffffffff) <= -1; i_34_--) {
				for (int i_35_ = 0; (i_12_ ^ 0xffffffff) < (i_35_ ^ 0xffffffff); i_35_++) {
					if ((i_35_ ^ 0xffffffff) <= (i_34_ << 1 ^ 0xffffffff))
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[2][1] = is_14_;
			is_14_ = new byte[i_13_ * i_12_];
			i_15_ = 0;
			for (int i_36_ = 0; i_13_ > i_36_; i_36_++) {
				for (int i_37_ = 0; i_12_ > i_37_; i_37_++) {
					if ((i_36_ >> 1 ^ 0xffffffff) <= (i_37_ ^ 0xffffffff))
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[2][2] = is_14_;
			is_14_ = new byte[i_12_ * i_13_];
			i_15_ = 0;
			for (int i_38_ = 0; (i_13_ ^ 0xffffffff) < (i_38_ ^ 0xffffffff); i_38_++) {
				for (int i_39_ = i_12_ - 1; (i_39_ ^ 0xffffffff) <= -1; i_39_--) {
					if ((i_38_ << 1 ^ 0xffffffff) >= (i_39_ ^ 0xffffffff))
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[2][3] = is_14_;
			is_14_ = new byte[i_12_ * i_13_];
			i_15_ = 0;
			for (int i_40_ = -1 + i_13_; i_40_ >= 0; i_40_--) {
				for (int i_41_ = 0; i_41_ < i_12_; i_41_++) {
					if ((i_41_ ^ 0xffffffff) <= (i_40_ >> 1 ^ 0xffffffff))
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[3][0] = is_14_;
			is_14_ = new byte[i_12_ * i_13_];
			i_15_ = 0;
			for (int i_42_ = 0; (i_13_ ^ 0xffffffff) < (i_42_ ^ 0xffffffff); i_42_++) {
				for (int i_43_ = 0; (i_12_ ^ 0xffffffff) < (i_43_ ^ 0xffffffff); i_43_++) {
					if (i_43_ <= i_42_ << 1)
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[3][1] = is_14_;
			is_14_ = new byte[i_12_ * i_13_];
			i_15_ = 0;
			for (int i_44_ = 0; (i_13_ ^ 0xffffffff) < (i_44_ ^ 0xffffffff); i_44_++) {
				for (int i_45_ = i_12_ - 1; (i_45_ ^ 0xffffffff) <= -1; i_45_--) {
					if (i_44_ >> 1 <= i_45_)
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[3][2] = is_14_;
			is_14_ = new byte[i_12_ * i_13_];
			i_15_ = 0;
			for (int i_46_ = -1 + i_13_; (i_46_ ^ 0xffffffff) <= -1; i_46_--) {
				for (int i_47_ = i_12_ - 1; i_47_ >= 0; i_47_--) {
					if (i_47_ <= i_46_ << 1)
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[3][3] = is_14_;
			is_14_ = new byte[i_12_ * i_13_];
			i_15_ = 0;
			for (int i_48_ = i_13_ - 1; i_48_ >= 0; i_48_--) {
				for (int i_49_ = -1 + i_12_; (i_49_ ^ 0xffffffff) <= -1; i_49_--) {
					if (i_48_ >> 1 <= i_49_)
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[4][0] = is_14_;
			i_15_ = 0;
			is_14_ = new byte[i_13_ * i_12_];
			for (int i_50_ = -1 + i_13_; (i_50_ ^ 0xffffffff) <= -1; i_50_--) {
				for (int i_51_ = 0; i_51_ < i_12_; i_51_++) {
					if ((i_50_ << 1 ^ 0xffffffff) <= (i_51_ ^ 0xffffffff))
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[4][1] = is_14_;
			is_14_ = new byte[i_13_ * i_12_];
			i_15_ = 0;
			for (int i_52_ = 0; i_13_ > i_52_; i_52_++) {
				for (int i_53_ = 0; i_12_ > i_53_; i_53_++) {
					if (i_53_ >= i_52_ >> 1)
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[4][2] = is_14_;
			is_14_ = new byte[i_12_ * i_13_];
			i_15_ = 0;
			for (int i_54_ = 0; i_13_ > i_54_; i_54_++) {
				for (int i_55_ = i_12_ - 1; i_55_ >= 0; i_55_--) {
					if ((i_55_ ^ 0xffffffff) >= (i_54_ << 1 ^ 0xffffffff))
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[4][3] = is_14_;
			i_15_ = 0;
			is_14_ = new byte[i_12_ * i_13_];
			for (int i_56_ = 0; (i_13_ ^ 0xffffffff) < (i_56_ ^ 0xffffffff); i_56_++) {
				for (int i_57_ = 0; i_57_ < i_12_; i_57_++) {
					if (i_12_ / 2 >= i_57_)
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[5][0] = is_14_;
			is_14_ = new byte[i_12_ * i_13_];
			i_15_ = 0;
			for (int i_58_ = 0; i_13_ > i_58_; i_58_++) {
				for (int i_59_ = 0; (i_59_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff); i_59_++) {
					if ((i_58_ ^ 0xffffffff) >= (i_13_ / 2 ^ 0xffffffff))
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[5][1] = is_14_;
			is_14_ = new byte[i_12_ * i_13_];
			i_15_ = 0;
			for (int i_60_ = 0; (i_60_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff); i_60_++) {
				for (int i_61_ = 0; i_12_ > i_61_; i_61_++) {
					if ((i_12_ / 2 ^ 0xffffffff) >= (i_61_ ^ 0xffffffff))
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[5][2] = is_14_;
			is_14_ = new byte[i_13_ * i_12_];
			i_15_ = 0;
			for (int i_62_ = 0; (i_13_ ^ 0xffffffff) < (i_62_ ^ 0xffffffff); i_62_++) {
				for (int i_63_ = 0; (i_63_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff); i_63_++) {
					if (i_62_ >= i_13_ / 2)
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[5][3] = is_14_;
			i_15_ = 0;
			is_14_ = new byte[i_12_ * i_13_];
			for (int i_64_ = 0; i_13_ > i_64_; i_64_++) {
				for (int i_65_ = 0; (i_65_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff); i_65_++) {
					if (-(i_13_ / 2) + i_64_ >= i_65_)
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[6][0] = is_14_;
			is_14_ = new byte[i_13_ * i_12_];
			i_15_ = 0;
			for (int i_66_ = i_13_ - 1; (i_66_ ^ 0xffffffff) <= -1; i_66_--) {
				for (int i_67_ = 0; (i_12_ ^ 0xffffffff) < (i_67_ ^ 0xffffffff); i_67_++) {
					if ((i_67_ ^ 0xffffffff) >= (i_66_ - i_13_ / 2 ^ 0xffffffff))
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[6][1] = is_14_;
			is_14_ = new byte[i_12_ * i_13_];
			i_15_ = 0;
			for (int i_68_ = -1 + i_13_; (i_68_ ^ 0xffffffff) <= -1; i_68_--) {
				for (int i_69_ = -1 + i_12_; i_69_ >= 0; i_69_--) {
					if ((-(i_13_ / 2) + i_68_ ^ 0xffffffff) <= (i_69_ ^ 0xffffffff))
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[6][2] = is_14_;
			is_14_ = new byte[i_12_ * i_13_];
			i_15_ = 0;
			for (int i_70_ = 0; i_70_ < i_13_; i_70_++) {
				for (int i_71_ = -1 + i_12_; i_71_ >= 0; i_71_--) {
					if (-(i_13_ / 2) + i_70_ >= i_71_)
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[6][3] = is_14_;
			is_14_ = new byte[i_13_ * i_12_];
			i_15_ = 0;
			for (int i_72_ = 0; (i_72_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff); i_72_++) {
				for (int i_73_ = 0; (i_73_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff); i_73_++) {
					if ((i_73_ ^ 0xffffffff) <= (-(i_13_ / 2) + i_72_ ^ 0xffffffff))
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[7][0] = is_14_;
			is_14_ = new byte[i_12_ * i_13_];
			i_15_ = 0;
			for (int i_74_ = i_13_ - 1; i_74_ >= 0; i_74_--) {
				for (int i_75_ = 0; (i_12_ ^ 0xffffffff) < (i_75_ ^ 0xffffffff); i_75_++) {
					if (i_74_ - i_13_ / 2 <= i_75_)
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[7][1] = is_14_;
			i_15_ = 0;
			is_14_ = new byte[i_12_ * i_13_];
			for (int i_76_ = i_13_ - 1; i_76_ >= 0; i_76_--) {
				for (int i_77_ = -1 + i_12_; (i_77_ ^ 0xffffffff) <= -1; i_77_--) {
					if (-(i_13_ / 2) + i_76_ <= i_77_)
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[7][2] = is_14_;
			i_15_ = 0;
			is_14_ = new byte[i_13_ * i_12_];
			for (int i_78_ = 0; i_13_ > i_78_; i_78_++) {
				for (int i_79_ = i_12_ - 1; i_79_ >= 0; i_79_--) {
					if ((i_79_ ^ 0xffffffff) <= (-(i_13_ / 2) + i_78_ ^ 0xffffffff))
						is_14_[i_15_] = (byte) -1;
					i_15_++;
				}
			}
			is[7][3] = is_14_;
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ab.I(" + i + ','
					+ i_11_ + ')');
		}
	}

	public static void method3411(boolean bool) {
		do {
			try {
				anIntArray8688 = null;
				aClass22_8685 = null;
				aClass322Array8690 = null;
				if (bool == false)
					break;
				method3409(89, 115, -93, 101);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ab.H(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	public Class376_Sub1_Sub1() {
		/* empty */
	}

	static {
		aClass22_8685 = new Class22(260);
	}
}
