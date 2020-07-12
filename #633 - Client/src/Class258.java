/* Class258 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class258 {
	static int anInt3514;
	static int anInt3515 = -1;
	int anInt3516 = -1;
	private long aLong3517;
	private int anInt3518;
	static int anInt3519;
	static int anInt3520;
	static int anInt3521;
	static int anInt3522;
	static int anInt3523;
	static int anInt3524;
	static int anInt3525;
	private int[] anIntArray3526;
	private long aLong3527;
	static float aFloat3528;
	int[] anIntArray3529;
	static int anInt3530;
	static int anInt3531;
	static int[] anIntArray3532;
	boolean aBool3533;

	final Class206 method1645(Class221 class221, Class281 class281,
			Class198 class198, int i, int i_0_, Class318 class318,
			Interface20 interface20, int i_1_, int i_2_, Class163 class163,
			Class223 class223, int i_3_) {
		try {
			if (i != -4414)
				method1650(null, 108, 7, -108);
			anInt3519++;
			if ((((Class258) this).anInt3516 ^ 0xffffffff) != 0)
				return (class318.getNPCDefinitions(((Class258) this).anInt3516, false)
						.method1382(i_2_, class281, i_3_, class163,
								interface20, class198, i_0_, i_1_, (byte) -89));
			int i_4_ = i_2_;
			if (class281 != null) {
				boolean bool = false;
				boolean bool_5_ = false;
				boolean bool_6_ = false;
				boolean bool_7_ = false;
				int i_8_ = -1;
				int i_9_ = -1;
				Object object = null;
				i_4_ |= 0x20;
				i_8_ = ((Class281) class281).anIntArray3794[i_1_];
				Object object_10_ = null;
				int i_11_ = i_8_ >>> 16;
				Class11_Sub45_Sub18 class11_sub45_sub18 = class198.method1280(
						i ^ 0x114c, i_11_);
				i_8_ &= 0xffff;
				if (class11_sub45_sub18 != null) {
					bool_5_ |= class11_sub45_sub18.method3760(false, i_8_);
					bool |= class11_sub45_sub18.method3759(i + 4527, i_8_);
					bool_7_ |= class11_sub45_sub18
							.method3755(i_8_, i ^ ~0x113c);
					bool_6_ |= ((Class281) class281).aBool3820;
				}
				if ((((Class281) class281).aBool3798 || Class11_Sub2_Sub11.aBool8858)
						&& (i_3_ ^ 0xffffffff) != 0
						&& ((i_3_ ^ 0xffffffff) > (((Class281) class281).anIntArray3794.length ^ 0xffffffff))) {
					i_9_ = ((Class281) class281).anIntArray3794[i_3_];
					int i_12_ = i_9_ >>> 16;
					Class11_Sub45_Sub18 class11_sub45_sub18_13_ = (i_12_ != i_11_ ? class198
							.method1280(68, i_12_) : class11_sub45_sub18);
					i_9_ &= 0xffff;
					if (class11_sub45_sub18_13_ != null) {
						bool_5_ |= class11_sub45_sub18_13_.method3760(false,
								i_9_);
						bool |= class11_sub45_sub18_13_.method3759(123, i_9_);
						bool_7_ |= class11_sub45_sub18_13_.method3755(i_9_, 1);
					}
				}
				if (bool_5_)
					i_4_ |= 0x80;
				if (bool)
					i_4_ |= 0x100;
				if (bool_6_)
					i_4_ |= 0x200;
				if (bool_7_)
					i_4_ |= 0x400;
			}
			Class206 class206;
			synchronized (Class186.aClass22_2379) {
				class206 = (Class206) Class186.aClass22_2379.method188(
						aLong3527, (byte) 80);
			}
			if (class206 == null
					|| (class163.method1065(class206.ua(), i_4_) ^ 0xffffffff) != -1) {
				if (class206 != null)
					i_4_ = class163.method1077(i_4_, class206.ua());
				int i_14_ = i_4_;
				boolean bool = false;
				for (int i_15_ = 0; i_15_ < 12; i_15_++) {
					int i_16_ = anIntArray3526[i_15_];
					if ((i_16_ & 0x40000000 ^ 0xffffffff) == -1) {
						if ((~0x7fffffff & i_16_ ^ 0xffffffff) != -1
								&& !class221.method1408(0x3fffffff & i_16_,
										(byte) -81).method1330(25))
							bool = true;
					} else if (!class223.method1430(i_16_ & 0x3fffffff, false)
							.method1591(((Class258) this).aBool3533, -29669))
						bool = true;
				}
				if (bool)
					return null;
				Class179[] class179s = new Class179[12];
				int i_17_ = 0;
				for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > -13; i_18_++) {
					int i_19_ = anIntArray3526[i_18_];
					if ((0x40000000 & i_19_ ^ 0xffffffff) == -1) {
						if ((~0x7fffffff & i_19_) != 0) {
							Class179 class179 = class221.method1408(
									i_19_ & 0x3fffffff, (byte) -50).method1339(
									(byte) -20);
							if (class179 != null)
								class179s[i_17_++] = class179;
						}
					} else {
						Class179 class179 = (class223.method1430(
								0x3fffffff & i_19_, false).method1590(
								(byte) 57, ((Class258) this).aBool3533));
						if (class179 != null)
							class179s[i_17_++] = class179;
					}
				}
				Class179 class179 = new Class179(class179s, i_17_);
				i_14_ |= 0x4000;
				class206 = class163.method1020(class179, i_14_,
						Class11_Sub4.anInt5235, 64, 768);
				for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > -6; i_20_++) {
					for (int i_21_ = 0; i_21_ < Class34.aShortArrayArrayArray463.length; i_21_++) {
						if ((Class34.aShortArrayArrayArray463[i_21_][i_20_]).length > ((Class258) this).anIntArray3529[i_20_])
							class206.ia(
									(Class11_Sub46.aShortArrayArray7982[i_21_][i_20_]),
									(Class34.aShortArrayArrayArray463[i_21_][i_20_][(((Class258) this).anIntArray3529[i_20_])]));
					}
				}
				class206.s(i_4_);
				synchronized (Class186.aClass22_2379) {
					Class186.aClass22_2379.method184((byte) 126, class206,
							aLong3527);
				}
			}
			if (class281 == null)
				return class206;
			Class206 class206_22_ = class206.method1313((byte) 4, i_4_, true);
			class206_22_ = class281.method1734(-1, class206, i_3_, i_2_, i_0_,
					i_1_);
			return class206_22_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("of.H(" + (class221 != null ? "{...}" : "null") + ','
							+ (class281 != null ? "{...}" : "null") + ','
							+ (class198 != null ? "{...}" : "null") + ',' + i
							+ ',' + i_0_ + ','
							+ (class318 != null ? "{...}" : "null") + ','
							+ (interface20 != null ? "{...}" : "null") + ','
							+ i_1_ + ',' + i_2_ + ','
							+ (class163 != null ? "{...}" : "null") + ','
							+ (class223 != null ? "{...}" : "null") + ','
							+ i_3_ + ')'));
		}
	}

	final Class206 method1646(int i, int i_23_, Class281 class281, int i_24_,
			int i_25_, Class223 class223, int i_26_, Class127 class127,
			Class163 class163, int i_27_, Class281 class281_28_, int[] is,
			int i_29_, Class221 class221, Class198 class198, boolean bool,
			Class208[] class208s, int i_30_, Class318 class318,
			Interface20 interface20, int i_31_) {
		try {
			anInt3514++;
			if (((Class258) this).anInt3516 != -1)
				return (class318.getNPCDefinitions(((Class258) this).anInt3516, false)
						.method1381(i, class198, i_25_, interface20, i_24_,
								i_29_, class208s, class163, i_27_, i_26_,
								class281_28_, true, i_23_, class281, class127,
								is, i_30_));
			int i_32_ = i_23_;
			long l = aLong3527;
			int[] is_33_ = anIntArray3526;
			if (class281_28_ != null
					&& ((((Class281) class281_28_).anInt3815 ^ 0xffffffff) <= -1 || ((Class281) class281_28_).anInt3803 >= 0)) {
				is_33_ = new int[12];
				for (int i_34_ = 0; (i_34_ ^ 0xffffffff) > -13; i_34_++)
					is_33_[i_34_] = anIntArray3526[i_34_];
				if (((Class281) class281_28_).anInt3815 >= 0) {
					if ((((Class281) class281_28_).anInt3815 ^ 0xffffffff) == -65536) {
						is_33_[5] = 0;
						l ^= ~0xffffffffL;
					} else {
						is_33_[5] = Class173.method1134(
								(((Class281) class281_28_).anInt3815),
								1073741824);
						l ^= (long) is_33_[5] << 32;
					}
				}
				if (((Class281) class281_28_).anInt3803 >= 0) {
					if (((Class281) class281_28_).anInt3803 != 65535) {
						is_33_[3] = Class173.method1134(
								(((Class281) class281_28_).anInt3803),
								1073741824);
						l ^= (long) is_33_[3];
					} else {
						is_33_[3] = 0;
						l ^= 0xffffffffL;
					}
				}
			}
			boolean bool_35_ = false;
			boolean bool_36_ = false;
			boolean bool_37_ = false;
			boolean bool_38_ = class281_28_ != null || class281 != null;
			int i_39_ = class208s == null ? 0 : class208s.length;
			for (int i_40_ = 0; i_40_ < i_39_; i_40_++) {
				Class308.aClass11_Sub45_Sub18Array4125[i_40_] = null;
				if (class208s[i_40_] != null) {
					Class281 class281_41_ = class198.method1284(
							(((Class208) class208s[i_40_]).anInt2807),
							(byte) -36);
					if (((Class281) class281_41_).anIntArray3794 != null) {
						Class141.aClass281Array1906[i_40_] = class281_41_;
						bool_38_ = true;
						int i_42_ = ((Class208) class208s[i_40_]).anInt2805;
						int i_43_ = ((Class208) class208s[i_40_]).anInt2803;
						int i_44_ = ((Class281) class281_41_).anIntArray3794[i_42_];
						Class308.aClass11_Sub45_Sub18Array4125[i_40_] = class198
								.method1280(Class77.method527(i_31_, -106),
										i_44_ >>> 16);
						i_44_ &= 0xffff;
						Class376_Sub7_Sub2_Sub2.anIntArray10241[i_40_] = i_44_;
						if (Class308.aClass11_Sub45_Sub18Array4125[i_40_] != null) {
							bool_36_ |= Class308.aClass11_Sub45_Sub18Array4125[i_40_]
									.method3760(false, i_44_);
							bool_35_ |= Class308.aClass11_Sub45_Sub18Array4125[i_40_]
									.method3759(115, i_44_);
							bool_37_ |= Class308.aClass11_Sub45_Sub18Array4125[i_40_]
									.method3755(i_44_, 1);
						}
						if ((!((Class281) class281_41_).aBool3798 && !Class11_Sub2_Sub11.aBool8858)
								|| (i_43_ ^ 0xffffffff) == 0
								|| (((Class281) class281_41_).anIntArray3794.length <= i_43_)) {
							Class73.anIntArray1017[i_40_] = 0;
							Class236_Sub4.anIntArray6708[i_40_] = 0;
							Class326.aClass11_Sub45_Sub18Array4349[i_40_] = null;
							Class376_Sub7_Sub2_Sub2.anIntArray10237[i_40_] = -1;
						} else {
							Class73.anIntArray1017[i_40_] = (((Class281) class281_41_).anIntArray3817[i_42_]);
							Class236_Sub4.anIntArray6708[i_40_] = ((Class208) class208s[i_40_]).anInt2810;
							int i_45_ = (((Class281) class281_41_).anIntArray3794[i_43_]);
							Class326.aClass11_Sub45_Sub18Array4349[i_40_] = class198
									.method1280(-123, i_45_ >>> 16);
							i_45_ &= 0xffff;
							Class376_Sub7_Sub2_Sub2.anIntArray10237[i_40_] = i_45_;
							if (Class326.aClass11_Sub45_Sub18Array4349[i_40_] != null) {
								bool_36_ |= Class326.aClass11_Sub45_Sub18Array4349[i_40_]
										.method3760(false, i_45_);
								bool_35_ |= Class326.aClass11_Sub45_Sub18Array4349[i_40_]
										.method3759(i_31_ + 126, i_45_);
								bool_37_ |= Class326.aClass11_Sub45_Sub18Array4349[i_40_]
										.method3755(i_45_, 1);
							}
						}
					}
				}
			}
			int i_46_ = -1;
			int i_47_ = -1;
			int i_48_ = i_31_;
			Class11_Sub45_Sub18 class11_sub45_sub18 = null;
			Class11_Sub45_Sub18 class11_sub45_sub18_49_ = null;
			int i_50_ = -1;
			int i_51_ = -1;
			int i_52_ = 0;
			Class11_Sub45_Sub18 class11_sub45_sub18_53_ = null;
			Class11_Sub45_Sub18 class11_sub45_sub18_54_ = null;
			if (bool_38_) {
				i_32_ |= 0x20;
				if (class281_28_ != null) {
					i_46_ = ((Class281) class281_28_).anIntArray3794[i_30_];
					int i_55_ = i_46_ >>> 16;
					i_46_ &= 0xffff;
					class11_sub45_sub18 = class198.method1280(43, i_55_);
					if (class11_sub45_sub18 != null) {
						bool_36_ |= class11_sub45_sub18
								.method3760(false, i_46_);
						bool_35_ |= class11_sub45_sub18.method3759(113, i_46_);
						bool_37_ |= class11_sub45_sub18.method3755(i_46_, 1);
					}
					if ((((Class281) class281_28_).aBool3798 || Class11_Sub2_Sub11.aBool8858)
							&& i_29_ != -1
							&& (((Class281) class281_28_).anIntArray3794.length > i_29_)) {
						i_48_ = ((Class281) class281_28_).anIntArray3817[i_30_];
						i_47_ = ((Class281) class281_28_).anIntArray3794[i_29_];
						int i_56_ = i_47_ >>> 16;
						i_47_ &= 0xffff;
						class11_sub45_sub18_49_ = (i_56_ != i_55_ ? class198
								.method1280(-111, i_56_) : class11_sub45_sub18);
						if (class11_sub45_sub18_49_ != null) {
							bool_36_ |= class11_sub45_sub18_49_.method3760(
									false, i_47_);
							bool_35_ |= class11_sub45_sub18_49_.method3759(
									i_31_ ^ 0x7a, i_47_);
							bool_37_ |= class11_sub45_sub18_49_.method3755(
									i_47_, 1);
						}
					}
				}
				if (class281 != null) {
					i_50_ = ((Class281) class281).anIntArray3794[i_25_];
					int i_57_ = i_50_ >>> 16;
					class11_sub45_sub18_53_ = class198.method1280(-111, i_57_);
					i_50_ &= 0xffff;
					if (class11_sub45_sub18_53_ != null) {
						bool_36_ |= class11_sub45_sub18_53_.method3760(false,
								i_50_);
						bool_35_ |= class11_sub45_sub18_53_.method3759(118,
								i_50_);
						bool_37_ |= class11_sub45_sub18_53_
								.method3755(i_50_, 1);
					}
					if ((((Class281) class281).aBool3798 || Class11_Sub2_Sub11.aBool8858)
							&& (i_24_ ^ 0xffffffff) != 0
							&& (((Class281) class281).anIntArray3794.length > i_24_)) {
						i_51_ = ((Class281) class281).anIntArray3794[i_24_];
						i_52_ = ((Class281) class281).anIntArray3817[i_25_];
						int i_58_ = i_51_ >>> 16;
						i_51_ &= 0xffff;
						class11_sub45_sub18_54_ = (i_58_ == i_57_ ? class11_sub45_sub18_53_
								: class198.method1280(-121, i_58_));
						if (class11_sub45_sub18_54_ != null) {
							bool_36_ |= class11_sub45_sub18_54_.method3760(
									false, i_51_);
							bool_35_ |= class11_sub45_sub18_54_.method3759(119,
									i_51_);
							bool_37_ |= class11_sub45_sub18_54_.method3755(
									i_51_, i_31_ ^ 0x1);
						}
					}
				}
				if (bool_36_)
					i_32_ |= 0x80;
				if (bool_35_)
					i_32_ |= 0x100;
				if (bool_37_)
					i_32_ |= 0x400;
			}
			Class206 class206;
			synchronized (Class376_Sub1_Sub1.aClass22_8685) {
				class206 = (Class206) Class376_Sub1_Sub1.aClass22_8685
						.method188(l, (byte) 76);
			}
			Class39 class39 = null;
			if ((anInt3518 ^ 0xffffffff) != 0)
				class39 = class127.method829(anInt3518, 64);
			if (class206 == null
					|| (class163.method1065(class206.ua(), i_32_) ^ 0xffffffff) != -1) {
				if (class206 != null)
					i_32_ = class163.method1077(i_32_, class206.ua());
				int i_59_ = i_32_;
				boolean bool_60_ = false;
				for (int i_61_ = 0; i_61_ < 12; i_61_++) {
					int i_62_ = is_33_[i_61_];
					if ((i_62_ & 0x40000000 ^ 0xffffffff) == -1) {
						if ((~0x7fffffff & i_62_ ^ 0xffffffff) != -1
								&& !class221.method1408(0x3fffffff & i_62_,
										(byte) -21).method1335(10779))
							bool_60_ = true;
					} else if (!class223.method1430(i_62_ & 0x3fffffff, false)
							.method1576(((Class258) this).aBool3533, (byte) 65))
						bool_60_ = true;
				}
				if (!bool_60_) {
					Class179[] class179s = new Class179[12];
					for (int i_63_ = 0; (i_63_ ^ 0xffffffff) > -13; i_63_++) {
						int i_64_ = is_33_[i_63_];
						if ((i_64_ & 0x40000000 ^ 0xffffffff) != -1) {
							Class179 class179 = (class223.method1430(
									i_64_ & 0x3fffffff, false).method1584(
									((Class258) this).aBool3533, 4371));
							if (class179 != null)
								class179s[i_63_] = class179;
						} else if ((~0x7fffffff & i_64_) != 0) {
							Class179 class179 = class221.method1408(
									0x3fffffff & i_64_, (byte) -7).method1337(
									(byte) 20);
							if (class179 != null)
								class179s[i_63_] = class179;
						}
					}
					if (class39 != null
							&& ((Class39) class39).anIntArrayArray564 != null) {
						for (int i_65_ = 0; (((Class39) class39).anIntArrayArray564.length > i_65_); i_65_++) {
							if (class179s[i_65_] != null) {
								int i_66_ = 0;
								int i_67_ = 0;
								int i_68_ = 0;
								int i_69_ = 0;
								int i_70_ = 0;
								int i_71_ = 0;
								if ((((Class39) class39).anIntArrayArray564[i_65_]) != null) {
									i_66_ = (((Class39) class39).anIntArrayArray564[i_65_][0]);
									i_70_ = (((Class39) class39).anIntArrayArray564[i_65_][4]) << 3;
									i_71_ = (((Class39) class39).anIntArrayArray564[i_65_][5]) << 3;
									i_67_ = (((Class39) class39).anIntArrayArray564[i_65_][1]);
									i_69_ = (((Class39) class39).anIntArrayArray564[i_65_][3]) << 3;
									i_68_ = (((Class39) class39).anIntArrayArray564[i_65_][2]);
								}
								if ((i_69_ ^ 0xffffffff) != -1 || i_70_ != 0
										|| (i_71_ ^ 0xffffffff) != -1)
									class179s[i_65_].method1172(i_69_, i_71_,
											i_31_, i_70_);
								if (i_66_ != 0 || (i_67_ ^ 0xffffffff) != -1
										|| i_68_ != 0)
									class179s[i_65_].method1163(i_67_,
											(byte) 115, i_68_, i_66_);
							}
						}
					}
					Class179 class179 = new Class179(class179s,
							class179s.length);
					i_59_ |= 0x4000;
					class206 = class163.method1020(class179, i_59_,
							Class11_Sub4.anInt5235, 64, 850);
					for (int i_72_ = 0; i_72_ < 5; i_72_++) {
						for (int i_73_ = 0; i_73_ < Class34.aShortArrayArrayArray463.length; i_73_++) {
							if ((Class34.aShortArrayArrayArray463[i_73_][i_72_]).length > ((Class258) this).anIntArray3529[i_72_])
								class206.ia(
										(Class11_Sub46.aShortArrayArray7982[i_73_][i_72_]),
										(Class34.aShortArrayArrayArray463[i_73_][i_72_][(((Class258) this).anIntArray3529[i_72_])]));
						}
					}
					if (bool) {
						class206.s(i_32_);
						synchronized (Class376_Sub1_Sub1.aClass22_8685) {
							Class376_Sub1_Sub1.aClass22_8685.method184(
									(byte) 126, class206, l);
						}
						aLong3517 = l;
					}
				} else {
					if ((aLong3517 ^ 0xffffffffffffffffL) != 0L) {
						synchronized (Class376_Sub1_Sub1.aClass22_8685) {
							class206 = ((Class206) Class376_Sub1_Sub1.aClass22_8685
									.method188(aLong3517, (byte) 103));
						}
					}
					if (class206 == null
							|| class163.method1065(class206.ua(), i_32_) != 0)
						return null;
				}
			}
			Class206 class206_74_ = class206.method1313((byte) 4, i_32_, true);
			boolean bool_75_ = false;
			if (is != null) {
				for (int i_76_ = 0; (i_76_ ^ 0xffffffff) > -13; i_76_++) {
					if ((is[i_76_] ^ 0xffffffff) != 0)
						bool_75_ = true;
				}
			}
			if (!bool_38_ && !bool_75_)
				return class206_74_;
			Class33[] class33s = null;
			if (class39 != null)
				class33s = class39.method341(class163, i_31_ + 107);
			if (bool_75_ && class33s != null) {
				for (int i_77_ = 0; i_77_ < 12; i_77_++) {
					if (class33s[i_77_] != null)
						class206_74_.method1302(class33s[i_77_], 1 << i_77_,
								true);
				}
			}
			int i_78_ = 0;
			int i_79_ = 1;
			while (i_39_ > i_78_) {
				if (Class308.aClass11_Sub45_Sub18Array4125[i_78_] != null)
					class206_74_
							.method1327(
									Class376_Sub7_Sub2_Sub2.anIntArray10237[i_78_],
									false,
									Class376_Sub7_Sub2_Sub2.anIntArray10241[i_78_],
									i_79_,
									(byte) -103,
									Class308.aClass11_Sub45_Sub18Array4125[i_78_],
									0,
									Class73.anIntArray1017[i_78_],
									-1 + Class236_Sub4.anIntArray6708[i_78_],
									Class326.aClass11_Sub45_Sub18Array4349[i_78_],
									null);
				i_78_++;
				i_79_ <<= 1;
			}
			if (bool_75_) {
				for (int i_80_ = 0; (i_80_ ^ 0xffffffff) > -13; i_80_++) {
					if (is[i_80_] != -1) {
						int i_81_ = -i_27_ + is[i_80_];
						i_81_ &= 0x3fff;
						Class33 class33 = class163.method1041();
						class33.method298(i_81_);
						class206_74_.method1302(class33, 1 << i_80_, false);
					}
				}
			}
			if (bool_75_ && class33s != null) {
				for (int i_82_ = 0; (i_82_ ^ 0xffffffff) > -13; i_82_++) {
					if (class33s[i_82_] != null)
						class206_74_.method1302(class33s[i_82_], 1 << i_82_,
								false);
				}
			}
			if (class11_sub45_sub18 == null || class11_sub45_sub18_53_ == null) {
				if (class11_sub45_sub18 != null)
					class206_74_.method1304(class11_sub45_sub18, i - 1, i_46_,
							i_47_, false, 0, i_48_, class11_sub45_sub18_49_,
							i_31_ ^ 0x3e8);
				else if (class11_sub45_sub18_53_ != null)
					class206_74_.method1304(class11_sub45_sub18_53_,
							-1 + i_26_, i_50_, i_51_, false, 0, i_52_,
							class11_sub45_sub18_54_, 1000);
			} else
				class206_74_.method1314(-1 + i_26_, i - 1, i_47_, i_50_, i_52_,
						(((Class281) class281_28_).aBoolArray3814),
						class11_sub45_sub18_49_, i_31_ ^ ~0x76, i_48_, i_46_,
						class11_sub45_sub18_53_, i_51_, false,
						class11_sub45_sub18, class11_sub45_sub18_54_);
			for (int i_83_ = 0; (i_83_ ^ 0xffffffff) > (i_39_ ^ 0xffffffff); i_83_++) {
				Class308.aClass11_Sub45_Sub18Array4125[i_83_] = null;
				Class326.aClass11_Sub45_Sub18Array4349[i_83_] = null;
				Class141.aClass281Array1906[i_83_] = null;
			}
			return class206_74_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("of.K(" + i + ',' + i_23_ + ','
							+ (class281 != null ? "{...}" : "null") + ','
							+ i_24_ + ',' + i_25_ + ','
							+ (class223 != null ? "{...}" : "null") + ','
							+ i_26_ + ','
							+ (class127 != null ? "{...}" : "null") + ','
							+ (class163 != null ? "{...}" : "null") + ','
							+ i_27_ + ','
							+ (class281_28_ != null ? "{...}" : "null") + ','
							+ (is != null ? "{...}" : "null") + ',' + i_29_
							+ ',' + (class221 != null ? "{...}" : "null") + ','
							+ (class198 != null ? "{...}" : "null") + ','
							+ bool + ','
							+ (class208s != null ? "{...}" : "null") + ','
							+ i_30_ + ','
							+ (class318 != null ? "{...}" : "null") + ','
							+ (interface20 != null ? "{...}" : "null") + ','
							+ i_31_ + ')'));
		}
	}

	final Class206 method1647(int i, int i_84_, int i_85_, Class163 class163,
			int i_86_, Class221 class221, int i_87_, Class281 class281,
			int i_88_, int i_89_, int i_90_, Class198 class198) {
		try {
			anInt3522++;
			int i_91_ = i_89_;
			if (class281 != null) {
				boolean bool = false;
				boolean bool_92_ = false;
				boolean bool_93_ = false;
				boolean bool_94_ = false;
				int i_95_ = -1;
				int i_96_ = -1;
				Object object = null;
				Object object_97_ = null;
				i_91_ |= 0x20;
				i_95_ = ((Class281) class281).anIntArray3794[i_90_];
				int i_98_ = i_95_ >>> 16;
				Class11_Sub45_Sub18 class11_sub45_sub18 = class198.method1280(
						-106, i_98_);
				i_95_ &= 0xffff;
				if (class11_sub45_sub18 != null) {
					bool_92_ |= class11_sub45_sub18.method3760(false, i_95_);
					bool |= class11_sub45_sub18.method3759(121, i_95_);
					bool_94_ |= class11_sub45_sub18.method3755(i_95_, 1);
					bool_93_ |= ((Class281) class281).aBool3820;
				}
				if ((((Class281) class281).aBool3798 || Class11_Sub2_Sub11.aBool8858)
						&& i_85_ != -1
						&& ((Class281) class281).anIntArray3794.length > i_85_) {
					i_96_ = ((Class281) class281).anIntArray3794[i_85_];
					int i_99_ = i_96_ >>> 16;
					i_96_ &= 0xffff;
					Class11_Sub45_Sub18 class11_sub45_sub18_100_;
					if ((i_99_ ^ 0xffffffff) != (i_98_ ^ 0xffffffff))
						class11_sub45_sub18_100_ = class198.method1280(84,
								i_96_ >>> 16);
					else
						class11_sub45_sub18_100_ = class11_sub45_sub18;
					if (class11_sub45_sub18_100_ != null) {
						bool_92_ |= class11_sub45_sub18_100_.method3760(false,
								i_96_);
						bool |= class11_sub45_sub18_100_.method3759(114, i_96_);
						bool_94_ |= class11_sub45_sub18_100_.method3755(i_96_,
								1);
					}
				}
				if (bool_92_)
					i_91_ |= 0x80;
				if (bool)
					i_91_ |= 0x100;
				if (bool_93_)
					i_91_ |= 0x200;
				if (bool_94_)
					i_91_ |= 0x400;
			}
			long l = (long) i_88_ << 32 | (long) (i_86_ << 16) | (long) i_84_;
			Class206 class206;
			synchronized (Class186.aClass22_2379) {
				int i_101_ = 121 / ((30 - i_87_) / 60);
				class206 = (Class206) Class186.aClass22_2379.method188(l,
						(byte) 90);
			}
			if (class206 == null
					|| class163.method1065(class206.ua(), i_91_) != 0) {
				if (class206 != null)
					i_91_ = class163.method1077(i_91_, class206.ua());
				int i_102_ = i_91_;
				Class179[] class179s = new Class179[3];
				int i_103_ = 0;
				if (!class221.method1408(i_84_, (byte) -34).method1330(-91)
						|| !class221.method1408(i_86_, (byte) -124).method1330(
								-103)
						|| !class221.method1408(i_88_, (byte) -6).method1330(
								-115))
					return null;
				Class179 class179 = class221.method1408(i_84_, (byte) -91)
						.method1339((byte) -20);
				if (class179 != null)
					class179s[i_103_++] = class179;
				class179 = class221.method1408(i_86_, (byte) -4).method1339(
						(byte) -61);
				if (class179 != null)
					class179s[i_103_++] = class179;
				class179 = class221.method1408(i_88_, (byte) -26).method1339(
						(byte) -72);
				if (class179 != null)
					class179s[i_103_++] = class179;
				class179 = new Class179(class179s, i_103_);
				i_102_ |= 0x4000;
				class206 = class163.method1020(class179, i_102_,
						Class11_Sub4.anInt5235, 64, 768);
				for (int i_104_ = 0; (i_104_ ^ 0xffffffff) > -6; i_104_++) {
					for (int i_105_ = 0; ((Class34.aShortArrayArrayArray463.length ^ 0xffffffff) < (i_105_ ^ 0xffffffff)); i_105_++) {
						if (((Class258) this).anIntArray3529[i_104_] < (Class34.aShortArrayArrayArray463[i_105_][i_104_]).length)
							class206.ia(
									(Class11_Sub46.aShortArrayArray7982[i_105_][i_104_]),
									(Class34.aShortArrayArrayArray463[i_105_][i_104_][(((Class258) this).anIntArray3529[i_104_])]));
					}
				}
				class206.s(i_91_);
				synchronized (Class186.aClass22_2379) {
					Class186.aClass22_2379.method184((byte) 124, class206, l);
				}
			}
			if (class281 == null)
				return class206;
			class206 = class206.method1313((byte) 4, i_91_, true);
			class206 = class281
					.method1734(-1, class206, i_85_, i_89_, i, i_90_);
			return class206;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("of.A(" + i + ','
					+ i_84_ + ',' + i_85_ + ','
					+ (class163 != null ? "{...}" : "null") + ',' + i_86_ + ','
					+ (class221 != null ? "{...}" : "null") + ',' + i_87_ + ','
					+ (class281 != null ? "{...}" : "null") + ',' + i_88_ + ','
					+ i_89_ + ',' + i_90_ + ','
					+ (class198 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1648(int i, boolean bool, boolean bool_106_) {
		do {
			try {
				if (bool) {
					InterfaceSettings.anInt5351++;
					Class172.method1127(1);
				}
				anInt3531++;
				if (i >= -12)
					anIntArray3532 = null;
				if (!bool_106_)
					break;
				Class367.anInt4822++;
				Class363.method2155((byte) 102);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("of.E(" + i + ','
						+ bool + ',' + bool_106_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method1649(byte i) {
		do {
			try {
				anIntArray3532 = null;
				if (i > 22)
					break;
				method1649((byte) -55);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "of.J(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1650(Class221 class221, int i, int i_107_, int i_108_) {
		try {
			anInt3520++;
			int i_109_ = Class248.anIntArray3349[i];
			if (class221.method1408(i_108_, (byte) -83) != null) {
				anIntArray3526[i_109_] = Class173.method1134(-2147483648,
						i_108_);
				if (i_107_ <= 98)
					method1649((byte) 104);
				method1653(255);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("of.F("
					+ (class221 != null ? "{...}" : "null") + ',' + i + ','
					+ i_107_ + ',' + i_108_ + ')'));
		}
	}

	final void method1651(int i, int i_110_, int i_111_) {
		try {
			if (i == -27417) {
				((Class258) this).anIntArray3529[i_110_] = i_111_;
				anInt3521++;
				method1653(255);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("of.D(" + i + ','
					+ i_110_ + ',' + i_111_ + ')'));
		}
	}

	final void method1652(boolean bool, byte i) {
		do {
			try {
				anInt3525++;
				((Class258) this).aBool3533 = bool;
				method1653(255);
				if (i == 122)
					break;
				method1655(null, -99, 13, 97);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "of.B(" + bool
						+ ',' + i + ')');
			}
			break;
		} while (false);
	}

	private final void method1653(int i) {
		try {
			anInt3524++;
			aLong3527 = -1L;
			long[] ls = Class23.aLongArray228;
			aLong3527 = (ls[(int) (0xffL & (aLong3527 ^ (long) (anInt3518 >> 8)))] ^ aLong3527 >>> 8);
			aLong3527 = (ls[(int) ((aLong3527 ^ (long) anInt3518) & (long) i)] ^ aLong3527 >>> 8);
			for (int i_112_ = 0; (i_112_ ^ 0xffffffff) > -13; i_112_++) {
				aLong3527 = ls[(int) (((long) (anIntArray3526[i_112_] >> 24) ^ aLong3527) & 0xffL)]
						^ aLong3527 >>> 8;
				aLong3527 = ls[(int) ((aLong3527 ^ (long) (anIntArray3526[i_112_] >> 16)) & 0xffL)]
						^ aLong3527 >>> 8;
				aLong3527 = (aLong3527 >>> 8 ^ ls[(int) (((long) (anIntArray3526[i_112_] >> 8) ^ aLong3527) & 0xffL)]);
				aLong3527 = (aLong3527 >>> 8 ^ ls[(int) (((long) anIntArray3526[i_112_] ^ aLong3527) & 0xffL)]);
			}
			for (int i_113_ = 0; i_113_ < 5; i_113_++)
				aLong3527 = ls[(int) (((long) (((Class258) this).anIntArray3529[i_113_]) ^ aLong3527) & 0xffL)]
						^ aLong3527 >>> 8;
			aLong3527 = (aLong3527 >>> 8 ^ ls[(int) (0xffL & (aLong3527 ^ (long) (((Class258) this).aBool3533 ? 1
					: 0)))]);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "of.I(" + i + ')');
		}
	}

	final void method1654(int[] is, int[] is_114_, int i, byte i_115_,
			int i_116_, boolean bool) {
		try {
			if (i_116_ != anInt3518)
				anInt3518 = i_116_;
			int i_117_ = -89 % ((-64 - i_115_) / 35);
			anIntArray3526 = is_114_;
			((Class258) this).aBool3533 = bool;
			((Class258) this).anIntArray3529 = is;
			anInt3523++;
			((Class258) this).anInt3516 = i;
			method1653(255);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("of.G("
					+ (is != null ? "{...}" : "null") + ','
					+ (is_114_ != null ? "{...}" : "null") + ',' + i + ','
					+ i_115_ + ',' + i_116_ + ',' + bool + ')'));
		}
	}

	final void method1655(Class223 class223, int i, int i_118_, int i_119_) {
		do {
			try {
				anInt3530++;
				if (i_118_ != -1) {
					if (class223.method1430(i_118_, false) == null)
						break;
					anIntArray3526[i] = Class173.method1134(1073741824, i_118_);
					method1653(255);
				} else
					anIntArray3526[i] = 0;
				if (i_119_ == 0)
					break;
				aLong3517 = 116L;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("of.C("
						+ (class223 != null ? "{...}" : "null") + ',' + i + ','
						+ i_118_ + ',' + i_119_ + ')'));
			}
			break;
		} while (false);
	}

	public Class258() {
		/* empty */
	}
}
