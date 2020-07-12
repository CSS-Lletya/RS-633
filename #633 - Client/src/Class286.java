/* Class286 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class286 {
	static int anInt3847;
	static int anInt3848;
	static int anInt3849;
	private byte[][][] aByteArrayArrayArray3850;
	static int anInt3851;
	private byte[][][] aByteArrayArrayArray3852;
	private Class302 aClass302_3853;
	private Class353 aClass353_3854;
	static int anInt3855;
	byte[][][] aByteArrayArrayArray3856;
	byte[][][] aByteArrayArrayArray3857;
	static int anInt3858;
	static int anInt3859;
	static int anInt3860;
	private int[] anIntArray3861 = { 0, 0, 0, 256, 512, 512, 512, 256, 256,
			384, 128, 128, 256 };
	static int anInt3862;
	static int anInt3863;
	private byte[][][] aByteArrayArrayArray3864;
	int anInt3865;
	int[][][] anIntArrayArrayArray3866;
	private int[] anIntArray3867 = { 0, 256, 512, 512, 512, 256, 0, 0, 128,
			256, 128, 384, 256 };
	static Class79 aClass79_3868 = new Class79(14, 0, 4, 1);
	static Class376_Sub7_Sub5[] aClass376_Sub7_Sub5Array3869;
	boolean aBool3870;
	static int anInt3871;
	static Interface10[] anInterface10Array3872;
	static int anInt3873;
	static String aString3874 = null;
	static float aFloat3875;
	int anInt3876;
	private byte[][][] aByteArrayArrayArray3877;
	static int anInt3878;
	static float aFloat3879;
	int anInt3880;

	final void method1764(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_) {
		do {
			try {
				int i_5_ = i_0_;
				if (i_4_ != 29274)
					((Class286) this).anInt3865 = 113;
				for (/**/; (i_0_ + i ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
					for (int i_6_ = i_1_; (i_6_ ^ 0xffffffff) > (i_2_ + i_1_ ^ 0xffffffff); i_6_++) {
						if ((i_6_ ^ 0xffffffff) <= -1
								&& ((((Class286) this).anInt3865 ^ 0xffffffff) < (i_6_ ^ 0xffffffff))
								&& i_5_ >= 0
								&& ((((Class286) this).anInt3876 ^ 0xffffffff) < (i_5_ ^ 0xffffffff)))
							((Class286) this).anIntArrayArrayArray3866[i_3_][i_6_][i_5_] = ((i_3_ ^ 0xffffffff) < -1 ? (((Class286) this).anIntArrayArrayArray3866[i_3_ - 1][i_6_][i_5_]) - 960
									: 0);
					}
				}
				anInt3851++;
				if ((i_1_ ^ 0xffffffff) < -1
						&& i_1_ < ((Class286) this).anInt3865) {
					for (int i_7_ = i_0_ + 1; i_7_ < i_0_ - -i; i_7_++) {
						if ((i_7_ ^ 0xffffffff) <= -1
								&& ((Class286) this).anInt3876 > i_7_)
							((Class286) this).anIntArrayArrayArray3866[i_3_][i_1_][i_7_] = (((Class286) this).anIntArrayArrayArray3866[i_3_][-1
									+ i_1_][i_7_]);
					}
				}
				if (i_0_ > 0 && ((Class286) this).anInt3876 > i_0_) {
					for (int i_8_ = 1 + i_1_; i_2_ + i_1_ > i_8_; i_8_++) {
						if (i_8_ >= 0
								&& (((Class286) this).anInt3865 ^ 0xffffffff) < (i_8_ ^ 0xffffffff))
							((Class286) this).anIntArrayArrayArray3866[i_3_][i_8_][i_0_] = (((Class286) this).anIntArrayArrayArray3866[i_3_][i_8_][-1
									+ i_0_]);
					}
				}
				if ((i_1_ ^ 0xffffffff) > -1 || (i_0_ ^ 0xffffffff) > -1
						|| i_1_ >= ((Class286) this).anInt3865
						|| ((Class286) this).anInt3876 <= i_0_)
					break;
				if ((i_3_ ^ 0xffffffff) == -1) {
					if (i_1_ > 0
							&& (((Class286) this).anIntArrayArrayArray3866[i_3_][-1
									+ i_1_][i_0_]) != 0)
						((Class286) this).anIntArrayArrayArray3866[i_3_][i_1_][i_0_] = (((Class286) this).anIntArrayArrayArray3866[i_3_][-1
								+ i_1_][i_0_]);
					else if ((i_0_ ^ 0xffffffff) >= -1
							|| (((Class286) this).anIntArrayArrayArray3866[i_3_][i_1_][-1
									+ i_0_]) == 0) {
						if (i_1_ > 0
								&& i_0_ > 0
								&& ((((Class286) this).anIntArrayArrayArray3866[i_3_][-1
										+ i_1_][i_0_ - 1]) ^ 0xffffffff) != -1)
							((Class286) this).anIntArrayArrayArray3866[i_3_][i_1_][i_0_] = (((Class286) this).anIntArrayArrayArray3866[i_3_][-1
									+ i_1_][-1 + i_0_]);
					} else
						((Class286) this).anIntArrayArrayArray3866[i_3_][i_1_][i_0_] = (((Class286) this).anIntArrayArrayArray3866[i_3_][i_1_][-1
								+ i_0_]);
				} else if (i_1_ > 0
						&& (((((Class286) this).anIntArrayArrayArray3866[i_3_][i_1_ - 1][i_0_]) ^ 0xffffffff) != ((((Class286) this).anIntArrayArrayArray3866[-1
								+ i_3_][-1 + i_1_][i_0_]) ^ 0xffffffff)))
					((Class286) this).anIntArrayArrayArray3866[i_3_][i_1_][i_0_] = (((Class286) this).anIntArrayArrayArray3866[i_3_][i_1_ - 1][i_0_]);
				else {
					if ((i_0_ ^ 0xffffffff) >= -1
							|| (((((Class286) this).anIntArrayArrayArray3866[i_3_][i_1_][i_0_ - 1]) ^ 0xffffffff) == ((((Class286) this).anIntArrayArrayArray3866[-1
									+ i_3_][i_1_][i_0_ - 1]) ^ 0xffffffff))) {
						if ((i_1_ ^ 0xffffffff) < -1
								&& i_0_ > 0
								&& ((((Class286) this).anIntArrayArrayArray3866[-1
										+ i_3_][i_1_ - 1][i_0_ - 1]) != (((Class286) this).anIntArrayArrayArray3866[i_3_][-1
										+ i_1_][i_0_ - 1])))
							((Class286) this).anIntArrayArrayArray3866[i_3_][i_1_][i_0_] = (((Class286) this).anIntArrayArrayArray3866[i_3_][-1
									+ i_1_][i_0_ - 1]);
						break;
					}
					((Class286) this).anIntArrayArrayArray3866[i_3_][i_1_][i_0_] = (((Class286) this).anIntArrayArrayArray3866[i_3_][i_1_][i_0_ - 1]);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("qd.R(" + i + ','
						+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ','
						+ i_4_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1765(int[][] is, boolean bool, int i) {
		try {
			anInt3873++;
			int[][] is_9_ = ((Class286) this).anIntArrayArrayArray3866[i];
			if (bool != true)
				method1771(null, null, null, -95);
			for (int i_10_ = 0; ((1 + ((Class286) this).anInt3865 ^ 0xffffffff) < (i_10_ ^ 0xffffffff)); i_10_++) {
				for (int i_11_ = 0; 1 + ((Class286) this).anInt3876 > i_11_; i_11_++)
					is_9_[i_10_][i_11_] += is[i_10_][i_11_];
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("qd.S(" + (is != null ? "{...}" : "null") + ',' + bool
							+ ',' + i + ')'));
		}
	}

	public static void method1766(int i) {
		try {
			if (i != -3053)
				method1766(-43);
			aString3874 = null;
			anInterface10Array3872 = null;
			aClass79_3868 = null;
			aClass376_Sub7_Sub5Array3869 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qd.O(" + i + ')');
		}
	}

	final void method1767(int i, int i_12_, Stream stream, int i_13_,
			Class338[] class338s, int i_14_, int i_15_, int i_16_, byte i_17_,
			int i_18_) {
		try {
			anInt3855++;
			int i_19_ = (0x7 & i_15_) * 8;
			int i_20_ = (i_12_ & 0x7) * 8;
			if (!((Class286) this).aBool3870) {
				Class338 class338 = class338s[i_16_];
				for (int i_21_ = 0; i_21_ < 8; i_21_++) {
					for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > -9; i_22_++) {
						int i_23_ = (Class316.method1923((byte) 16,
								0x7 & i_21_, i_22_ & 0x7, i_14_) + i_13_);
						int i_24_ = (Class78.method535(i_14_, 0x7 & i_22_, 3,
								0x7 & i_21_) + i_18_);
						if (i_23_ > 0
								&& ((Class286) this).anInt3865 - 1 > i_23_
								&& i_24_ > 0
								&& ((((Class286) this).anInt3876 - 1 ^ 0xffffffff) < (i_24_ ^ 0xffffffff)))
							class338.method2036((byte) -47, i_24_, i_23_);
					}
				}
			}
			int i_25_ = ~0x3f & i_15_ << 3;
			int i_26_ = (~0x7 & i_12_) << 3;
			int i_27_ = 0;
			if (i_17_ < -107) {
				int i_28_ = 0;
				if (i_14_ == 1)
					i_28_ = 1;
				else if (i_14_ == 2) {
					i_27_ = 1;
					i_28_ = 1;
				} else if ((i_14_ ^ 0xffffffff) == -4)
					i_27_ = 1;
				for (int i_29_ = 0; ((Class286) this).anInt3880 > i_29_; i_29_++) {
					for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > -65; i_30_++) {
						for (int i_31_ = 0; i_31_ < 64; i_31_++) {
							if (i_29_ != i
									|| i_19_ > i_30_
									|| (i_30_ ^ 0xffffffff) < (8 + i_19_ ^ 0xffffffff)
									|| (i_20_ ^ 0xffffffff) < (i_31_ ^ 0xffffffff)
									|| (i_31_ ^ 0xffffffff) < (i_20_ + 8 ^ 0xffffffff))
								method1774(stream, 0, 0, true, 0, false, 0, -1,
										0, 0, -1);
							else {
								int i_32_;
								int i_33_;
								if (8 + i_19_ == i_30_
										|| ((i_20_ + 8 ^ 0xffffffff) == (i_31_ ^ 0xffffffff))) {
									if (i_14_ != 0) {
										if (i_14_ == 1) {
											i_32_ = i_13_ - -i_31_ - i_20_;
											i_33_ = i_18_ + 8
													+ (i_19_ + -i_30_);
										} else if (i_14_ != 2) {
											i_32_ = i_13_
													+ (8 - -i_20_ - i_31_);
											i_33_ = i_30_ + -i_19_ + i_18_;
										} else {
											i_33_ = i_20_ - i_31_ + (i_18_ + 8);
											i_32_ = i_13_
													+ (8 - (i_30_ - i_19_));
										}
									} else {
										i_33_ = i_18_ - (i_20_ + -i_31_);
										i_32_ = i_13_ + i_30_ + -i_19_;
									}
									method1774(stream, i_16_, 0, true, 0, true,
											0, i_32_, i_26_ - -i_31_, i_25_
													+ i_30_, i_33_);
								} else {
									i_32_ = Class316.method1923((byte) 16,
											0x7 & i_30_, i_31_ & 0x7, i_14_)
											+ i_13_;
									i_33_ = (Class78.method535(i_14_,
											0x7 & i_31_, 3, i_30_ & 0x7) + i_18_);
									method1774(stream, i_16_, i_14_, true,
											i_27_, false, i_28_, i_32_, i_31_
													+ i_26_, i_25_ + i_30_,
											i_33_);
								}
								if ((i_30_ ^ 0xffffffff) == -64 || i_31_ == 63) {
									int i_34_ = 1;
									if (i_30_ == 63
											&& (i_31_ ^ 0xffffffff) == -64)
										i_34_ = 3;
									for (int i_35_ = 0; i_34_ > i_35_; i_35_++) {
										int i_36_ = i_30_;
										int i_37_ = i_31_;
										if (i_35_ == 0) {
											i_36_ = i_30_ == 63 ? 64 : i_30_;
											i_37_ = ((i_31_ ^ 0xffffffff) != -64 ? i_31_
													: 64);
										} else if (i_35_ != 1) {
											if ((i_35_ ^ 0xffffffff) == -3)
												i_37_ = 64;
										} else
											i_36_ = 64;
										int i_38_;
										int i_39_;
										if ((i_14_ ^ 0xffffffff) != -1) {
											if (i_14_ != 1) {
												if ((i_14_ ^ 0xffffffff) != -3) {
													i_39_ = i_36_
															- (i_19_ - i_18_);
													i_38_ = (i_13_ + 8 + (-i_37_ - -i_20_));
												} else {
													i_38_ = i_13_
															- (-8 + -i_19_ + i_36_);
													i_39_ = (i_18_ + 8 + (i_20_ + -i_37_));
												}
											} else {
												i_38_ = i_37_ + -i_20_ + i_13_;
												i_39_ = 8 + (i_18_ - i_36_ + i_19_);
											}
										} else {
											i_38_ = i_36_ + -i_19_ + i_13_;
											i_39_ = i_18_ - i_20_ - -i_37_;
										}
										if (i_38_ >= 0
												&& ((((Class286) this).anInt3865 ^ 0xffffffff) < (i_38_ ^ 0xffffffff))
												&& i_39_ >= 0
												&& (((Class286) this).anInt3876 > i_39_))
											((Class286) this).anIntArrayArrayArray3866[i_16_][i_38_][i_39_] = (((Class286) this).anIntArrayArrayArray3866[i_16_][i_27_
													+ i_32_][i_33_ + i_28_]);
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qd.U(" + i + ','
					+ i_12_ + ',' + (stream != null ? "{...}" : "null") + ','
					+ i_13_ + ',' + (class338s != null ? "{...}" : "null")
					+ ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ',' + i_17_
					+ ',' + i_18_ + ')'));
		}
	}

	private final void method1768(Class12 class12, int[][] is,
			Class12 class12_40_, Class163 class163, int i, byte i_41_,
			Class12 class12_42_) {
		try {
			anInt3847++;
			byte[][] is_43_ = aByteArrayArrayArray3877[i];
			byte[][] is_44_ = aByteArrayArrayArray3850[i];
			if (i_41_ != -71)
				aByteArrayArrayArray3864 = null;
			byte[][] is_45_ = aByteArrayArrayArray3852[i];
			byte[][] is_46_ = aByteArrayArrayArray3864[i];
			for (int i_47_ = 0; i_47_ < ((Class286) this).anInt3865; i_47_++) {
				int i_48_ = (((Class286) this).anInt3865 - 1 <= i_47_ ? i_47_
						: i_47_ + 1);
				for (int i_49_ = 0; ((((Class286) this).anInt3876 ^ 0xffffffff) < (i_49_ ^ 0xffffffff)); i_49_++) {
					int i_50_ = (-1 + ((Class286) this).anInt3876 > i_49_ ? i_49_ + 1
							: i_49_);
					if (Class2_Sub5.anInt5507 == -1
							|| Class173.method1131(i_49_, -1, i, i_47_,
									Class2_Sub5.anInt5507)) {
						boolean bool = false;
						boolean bool_51_ = false;
						boolean[] bools = new boolean[4];
						byte i_52_ = is_43_[i_47_][i_49_];
						int i_53_ = is_44_[i_47_][i_49_];
						int i_54_ = is_46_[i_47_][i_49_] & 0xff;
						int i_55_ = 0xff & is_45_[i_47_][i_49_];
						int i_56_ = 0xff & is_45_[i_47_][i_50_];
						int i_57_ = 0xff & is_45_[i_48_][i_50_];
						int i_58_ = is_45_[i_48_][i_49_] & 0xff;
						if (i_54_ != 0 || (i_55_ ^ 0xffffffff) != -1) {
							Class233 class233 = ((i_54_ ^ 0xffffffff) != -1 ? aClass302_3853
									.method1865(i_41_ + 75, -1 + i_54_) : null);
							if (i_52_ == 0 && class233 == null)
								i_52_ = (byte) 12;
							Class327 class327 = ((i_55_ ^ 0xffffffff) != -1 ? aClass353_3854
									.method2113(-1 + i_55_, true) : null);
							Class233 class233_59_ = class233;
							if (class233 != null) {
								if ((((Class233) class233).anInt3187 ^ 0xffffffff) == 0
										&& ((Class233) class233).anInt3183 == -1) {
									class233_59_ = class233;
									class233 = null;
								} else if (class327 != null
										&& (i_52_ ^ 0xffffffff) != -1)
									bool_51_ = ((Class233) class233).aBool3199;
							}
							if (((i_52_ ^ 0xffffffff) == -1 || i_52_ == 12)
									&& i_47_ > 0
									&& i_49_ > 0
									&& ((Class286) this).anInt3865 > i_47_
									&& ((i_49_ ^ 0xffffffff) > (((Class286) this).anInt3876 ^ 0xffffffff))) {
								int i_60_ = 0;
								int i_61_ = 0;
								int i_62_ = 0;
								i_61_ = i_61_
										+ (((i_55_ ^ 0xffffffff) != (is_45_[i_48_][i_49_ - 1] ^ 0xffffffff)) ? -1
												: 1);
								i_60_ = i_60_
										- (((is_45_[i_47_ - 1][i_49_ - 1] ^ 0xffffffff) == (i_55_ ^ 0xffffffff)) ? 1
												: 1);
								int i_63_ = 0;
								i_62_ = i_62_
										+ (((i_55_ ^ 0xffffffff) != (is_45_[i_48_][i_50_] ^ 0xffffffff)) ? -1
												: 1);
								if ((i_55_ ^ 0xffffffff) != (is_45_[i_47_][-1
										+ i_49_] ^ 0xffffffff)) {
									i_61_--;
									i_60_--;
								} else {
									i_60_++;
									i_61_++;
								}
								i_63_ = (i_63_ - (is_45_[-1 + i_47_][i_50_] == i_55_ ? 1
										: 1));
								if ((is_45_[i_48_][i_49_] ^ 0xffffffff) == (i_55_ ^ 0xffffffff)) {
									i_61_++;
									i_62_++;
								} else {
									i_62_--;
									i_61_--;
								}
								if ((is_45_[i_47_][i_50_] ^ 0xffffffff) == (i_55_ ^ 0xffffffff)) {
									i_63_++;
									i_62_++;
								} else {
									i_63_--;
									i_62_--;
								}
								if ((is_45_[-1 + i_47_][i_49_] ^ 0xffffffff) == (i_55_ ^ 0xffffffff)) {
									i_63_++;
									i_60_++;
								} else {
									i_60_--;
									i_63_--;
								}
								int i_64_ = -i_62_ + i_60_;
								if (i_64_ < 0)
									i_64_ = -i_64_;
								int i_65_ = i_61_ + -i_63_;
								if ((i_65_ ^ 0xffffffff) > -1)
									i_65_ = -i_65_;
								if ((i_64_ ^ 0xffffffff) == (i_65_ ^ 0xffffffff)) {
									i_64_ = (class12_40_.method131((byte) -102,
											i_49_, i_47_) + -class12_40_
											.method131((byte) 127, i_50_, i_48_));
									if ((i_64_ ^ 0xffffffff) > -1)
										i_64_ = -i_64_;
									i_65_ = (class12_40_.method131((byte) -14,
											i_49_, i_48_) + -class12_40_
											.method131((byte) 46, i_50_, i_47_));
									if ((i_65_ ^ 0xffffffff) > -1)
										i_65_ = -i_65_;
								}
								i_53_ = i_64_ < i_65_ ? 1 : 0;
							}
							for (int i_66_ = 0; i_66_ < 13; i_66_++) {
								Class376_Sub7_Sub2_Sub1.anIntArray10208[i_66_] = -1;
								Class124.anIntArray1683[i_66_] = 1;
							}
							boolean[] bools_67_ = ((class233 != null && ((Class233) class233).aBool3199) ? Class11_Sub3.aBoolArrayArray5115[i_52_]
									: (Class11_Sub45_Sub20.aBoolArrayArray9738[i_52_]));
							method1772(i_53_, i_52_,
									((Class286) this).anInt3865, is_43_,
									is_44_, (byte) 116, is_46_, class327,
									class233, i_47_,
									((Class286) this).anInt3876, bools,
									class163, i_49_);
							boolean bool_68_ = (class233 != null && (((Class233) class233).anInt3187 != ((Class233) class233).anInt3183));
							if (!bool_68_) {
								for (int i_69_ = 0; (i_69_ ^ 0xffffffff) > -9; i_69_++) {
									if (((Class376_Sub7_Sub2_Sub1.anIntArray10208[i_69_]) ^ 0xffffffff) <= -1
											&& (Class72.anIntArray1003[i_69_] != (Class173.anIntArray2221[i_69_]))) {
										bool_68_ = true;
										break;
									}
								}
							}
							if (!bools_67_[0x3 & 1 - -i_53_])
								bools[1] = (Class12
										.method126(
												bools[1],
												(Class77.method529(
														(Class124.anIntArray1683[4]),
														(Class124.anIntArray1683[2])) ^ 0xffffffff) == -1));
							if (!bools_67_[0x3 & 3 + i_53_])
								bools[3] = (Class12
										.method126(
												bools[3],
												(Class77.method529(
														(Class124.anIntArray1683[0]),
														(Class124.anIntArray1683[6])) ^ 0xffffffff) == -1));
							if (!bools_67_[i_53_ & 0x3])
								bools[0] = (Class12
										.method126(
												bools[0],
												Class77.method529(
														(Class124.anIntArray1683[2]),
														(Class124.anIntArray1683[0])) == 0));
							if (!bools_67_[0x3 & i_53_ + 2])
								bools[2] = (Class12
										.method126(
												bools[2],
												Class77.method529(
														(Class124.anIntArray1683[4]),
														(Class124.anIntArray1683[6])) == 0));
							if (!bool_51_ && (i_52_ == 0 || i_52_ == 12)) {
								if (bools[0] && !bools[1] && !bools[2]
										&& bools[3]) {
									bools[0] = bools[3] = false;
									i_52_ = i_52_ == 0 ? (byte) 13 : (byte) 14;
									i_53_ = 0;
								} else if (bools[0] && bools[1] && !bools[2]
										&& !bools[3]) {
									i_53_ = 3;
									i_52_ = ((i_52_ ^ 0xffffffff) == -1 ? (byte) 13
											: (byte) 14);
									bools[0] = bools[1] = false;
								} else if (!bools[0] && bools[1] && bools[2]
										&& !bools[3]) {
									i_52_ = i_52_ != 0 ? (byte) 14 : (byte) 13;
									bools[1] = bools[2] = false;
									i_53_ = 2;
								} else if (!bools[0] && !bools[1] && bools[2]
										&& bools[3]) {
									i_52_ = i_52_ == 0 ? (byte) 13 : (byte) 14;
									i_53_ = 1;
									bools[2] = bools[3] = false;
								}
							}
							boolean bool_70_ = (!bool_51_ && !bools[0]
									&& !bools[2] && !bools[1] && !bools[3]);
							int[] is_71_ = null;
							int[] is_72_;
							int[] is_73_;
							int i_74_;
							int i_75_;
							int[] is_76_;
							if (!bool_70_) {
								if (bool_51_) {
									is_76_ = (Class2_Sub3.anIntArrayArray5359[i_52_]);
									is_72_ = (Class11_Sub45_Sub15.anIntArrayArray9373[i_52_]);
									is_73_ = (Class11_Sub32.anIntArrayArray6891[i_52_]);
									i_74_ = (class327 != null ? Class44.anIntArray708[i_52_]
											: 0);
									i_75_ = (class233 != null ? Class194.anIntArray2644[i_52_]
											: 0);
									is_71_ = Class346.anIntArrayArray4592[i_52_];
								} else {
									is_72_ = (Class108_Sub8.anIntArrayArray5743[i_52_]);
									i_74_ = (class327 == null ? 0
											: Class255.anIntArray3501[i_52_]);
									is_73_ = (Class11_Sub2_Sub28.anIntArrayArray9433[i_52_]);
									is_71_ = Class49.anIntArrayArray755[i_52_];
									is_76_ = (Class2_Sub9.anIntArrayArray7277[i_52_]);
									i_75_ = class233 != null ? (Class251_Sub1.anIntArray5420[i_52_])
											: 0;
								}
							} else {
								is_72_ = (Class108_Sub19.anIntArrayArray7113[i_52_]);
								is_73_ = Class159.anIntArrayArray2073[i_52_];
								i_74_ = (class327 == null ? 0
										: Class159.anIntArray2072[i_52_]);
								i_75_ = (class233 == null ? 0
										: (Class376_Sub1_Sub1.anIntArray8688[i_52_]));
								is_76_ = Class165.anIntArrayArray2142[i_52_];
							}
							int i_77_ = i_74_ + i_75_;
							if (i_77_ <= 0)
								Class108_Sub18.method2808(i, i_47_, i_49_);
							else {
								if (bools[0])
									i_77_++;
								if (bools[2])
									i_77_++;
								if (bools[1])
									i_77_++;
								if (bools[3])
									i_77_++;
								int i_78_ = 0;
								int i_79_ = 0;
								int i_80_ = i_77_ * 3;
								int[] is_81_ = bool_68_ ? new int[i_80_] : null;
								int[] is_82_ = new int[i_80_];
								int[] is_83_ = new int[i_80_];
								int[] is_84_ = new int[i_80_];
								int[] is_85_ = new int[i_80_];
								int[] is_86_ = new int[i_80_];
								int[] is_87_ = class12 != null ? new int[i_80_]
										: null;
								int[] is_88_ = (class12 == null
										&& class12_42_ == null ? null
										: new int[i_80_]);
								int i_89_ = -1;
								int i_90_ = -1;
								int i_91_ = 256;
								if (class233 == null) {
									if (!bool_70_) {
										if (!bool_51_)
											i_78_ += (Class251_Sub1.anIntArray5420[i_52_]);
										else
											i_78_ += (Class194.anIntArray2644[i_52_]);
									} else
										i_78_ += (Class376_Sub1_Sub1.anIntArray8688[i_52_]);
								} else {
									i_91_ = ((Class233) class233).anInt3179;
									i_89_ = ((Class233) class233).anInt3187;
									i_90_ = ((Class233) class233).anInt3188;
									int i_92_ = Class381.method2229(class163,
											true, class233);
									for (int i_93_ = 0; i_75_ > i_93_; i_93_++) {
										boolean bool_94_ = false;
										int i_95_;
										if (!bools[0x3 & -i_53_]
												|| ((is_71_[0] ^ 0xffffffff) != (i_78_ ^ 0xffffffff))) {
											if (bools[2 + -i_53_ & 0x3]
													&& ((is_71_[2] ^ 0xffffffff) == (i_78_ ^ 0xffffffff))) {
												Class11_Sub50_Sub1.anIntArray8844[0] = is_72_[i_78_];
												Class11_Sub50_Sub1.anIntArray8844[1] = 5;
												Class11_Sub50_Sub1.anIntArray8844[2] = is_76_[i_78_];
												Class11_Sub50_Sub1.anIntArray8844[3] = 5;
												Class11_Sub50_Sub1.anIntArray8844[4] = is_73_[i_78_];
												i_95_ = 6;
												Class11_Sub50_Sub1.anIntArray8844[5] = is_76_[i_78_];
											} else if (!bools[1 - i_53_ & 0x3]
													|| i_78_ != is_71_[1]) {
												if (!bools[-i_53_ + 3 & 0x3]
														|| ((is_71_[3] ^ 0xffffffff) != (i_78_ ^ 0xffffffff))) {
													Class11_Sub50_Sub1.anIntArray8844[0] = is_72_[i_78_];
													Class11_Sub50_Sub1.anIntArray8844[1] = is_73_[i_78_];
													i_95_ = 3;
													Class11_Sub50_Sub1.anIntArray8844[2] = is_76_[i_78_];
												} else {
													Class11_Sub50_Sub1.anIntArray8844[0] = is_72_[i_78_];
													Class11_Sub50_Sub1.anIntArray8844[1] = 7;
													Class11_Sub50_Sub1.anIntArray8844[2] = is_76_[i_78_];
													Class11_Sub50_Sub1.anIntArray8844[3] = 7;
													Class11_Sub50_Sub1.anIntArray8844[4] = is_73_[i_78_];
													Class11_Sub50_Sub1.anIntArray8844[5] = is_76_[i_78_];
													i_95_ = 6;
												}
											} else {
												Class11_Sub50_Sub1.anIntArray8844[0] = is_72_[i_78_];
												Class11_Sub50_Sub1.anIntArray8844[1] = 3;
												Class11_Sub50_Sub1.anIntArray8844[2] = is_76_[i_78_];
												Class11_Sub50_Sub1.anIntArray8844[3] = 3;
												Class11_Sub50_Sub1.anIntArray8844[4] = is_73_[i_78_];
												Class11_Sub50_Sub1.anIntArray8844[5] = is_76_[i_78_];
												i_95_ = 6;
											}
										} else {
											Class11_Sub50_Sub1.anIntArray8844[0] = is_72_[i_78_];
											Class11_Sub50_Sub1.anIntArray8844[1] = 1;
											Class11_Sub50_Sub1.anIntArray8844[2] = is_76_[i_78_];
											Class11_Sub50_Sub1.anIntArray8844[3] = 1;
											Class11_Sub50_Sub1.anIntArray8844[4] = is_73_[i_78_];
											Class11_Sub50_Sub1.anIntArray8844[5] = is_76_[i_78_];
											i_95_ = 6;
										}
										i_78_++;
										for (int i_96_ = 0; i_96_ < i_95_; i_96_++) {
											int i_97_ = (Class11_Sub50_Sub1.anIntArray8844[i_96_]);
											int i_98_ = i_97_ + -(2 * i_53_)
													& 0x7;
											int i_99_ = anIntArray3867[i_97_];
											int i_100_ = anIntArray3861[i_97_];
											int i_101_;
											int i_102_;
											if (i_53_ != 1) {
												if (i_53_ == 2) {
													i_102_ = 512 - i_99_;
													i_101_ = -i_100_ + 512;
												} else if (i_53_ == 3) {
													i_101_ = i_99_;
													i_102_ = 512 + -i_100_;
												} else {
													i_101_ = i_100_;
													i_102_ = i_99_;
												}
											} else {
												i_101_ = 512 + -i_99_;
												i_102_ = i_100_;
											}
											is_82_[i_79_] = i_102_;
											is_83_[i_79_] = i_101_;
											if (is_87_ != null
													&& (Class282.aBoolArrayArray3823[i_52_][i_97_])) {
												int i_103_ = i_102_
														+ (i_47_ << 9);
												int i_104_ = (i_49_ << 9)
														- -i_101_;
												is_87_[i_79_] = ((class12
														.method130(i_104_,
																i_103_, 119)) + -(class12_40_
														.method130(i_104_,
																i_103_, -11)));
											}
											if (is_88_ != null) {
												if (class12 == null
														|| (Class282.aBoolArrayArray3823[i_52_][i_97_])) {
													if (class12_42_ != null
															&& !(Class154.aBoolArrayArray2029[i_52_][i_97_])) {
														int i_105_ = ((i_47_ << 9) + i_102_);
														int i_106_ = ((i_49_ << 9) + i_101_);
														is_88_[i_79_] = ((class12_42_
																.method130(
																		i_106_,
																		i_105_,
																		64)) - (class12_40_
																.method130(
																		i_106_,
																		i_105_,
																		-125)));
													}
												} else {
													int i_107_ = (i_102_ + (i_47_ << 9));
													int i_108_ = ((i_49_ << 9) + i_101_);
													is_88_[i_79_] = ((class12_40_
															.method130(i_108_,
																	i_107_, 69)) - (class12
															.method130(i_108_,
																	i_107_,
																	-125)));
												}
											}
											if (i_97_ >= 8
													|| ((Class376_Sub7_Sub2_Sub1.anIntArray10208[i_98_]) <= (((Class233) class233).anInt3192))) {
												if (is_81_ != null)
													is_81_[i_79_] = i_92_;
												is_85_[i_79_] = (((Class233) class233).anInt3188);
												is_86_[i_79_] = (((Class233) class233).anInt3179);
												is_84_[i_79_] = i_89_;
											} else {
												if (is_81_ != null)
													is_81_[i_79_] = (Class72.anIntArray1003[i_98_]);
												is_86_[i_79_] = (Class227.anIntArray3133[i_98_]);
												is_85_[i_79_] = (Class242.anIntArray3282[i_98_]);
												is_84_[i_79_] = (Class173.anIntArray2221[i_98_]);
											}
											i_79_++;
										}
									}
									if (!((Class286) this).aBool3870
											&& (i ^ 0xffffffff) == -1)
										Class108_Sub25
												.method3145(
														i_47_,
														i_49_,
														((Class233) class233).anInt3194,
														8 * (((Class233) class233).anInt3184),
														((Class233) class233).anInt3198);
									if (i_52_ != 12
											&& (((Class233) class233).anInt3187 != -1)
											&& ((Class233) class233).aBool3182)
										bool = true;
								}
								if (class327 != null) {
									if ((i_56_ ^ 0xffffffff) == -1)
										i_56_ = i_55_;
									if (i_57_ == 0)
										i_57_ = i_55_;
									if ((i_58_ ^ 0xffffffff) == -1)
										i_58_ = i_55_;
									Class327 class327_109_ = aClass353_3854
											.method2113(i_55_ - 1, true);
									Class327 class327_110_ = aClass353_3854
											.method2113(i_56_ - 1, true);
									Class327 class327_111_ = aClass353_3854
											.method2113(-1 + i_57_, true);
									Class327 class327_112_ = aClass353_3854
											.method2113(i_58_ - 1, true);
									for (int i_113_ = 0; ((i_113_ ^ 0xffffffff) > (i_74_ ^ 0xffffffff)); i_113_++) {
										boolean bool_114_ = false;
										int i_115_;
										if (bools[-i_53_ & 0x3]
												&& i_78_ == is_71_[0]) {
											Class11_Sub50_Sub1.anIntArray8844[0] = is_72_[i_78_];
											Class11_Sub50_Sub1.anIntArray8844[1] = 1;
											Class11_Sub50_Sub1.anIntArray8844[2] = is_76_[i_78_];
											Class11_Sub50_Sub1.anIntArray8844[3] = 1;
											Class11_Sub50_Sub1.anIntArray8844[4] = is_73_[i_78_];
											i_115_ = 6;
											Class11_Sub50_Sub1.anIntArray8844[5] = is_76_[i_78_];
										} else if (!bools[2 + -i_53_ & 0x3]
												|| is_71_[2] != i_78_) {
											if (bools[1 + -i_53_ & 0x3]
													&& i_78_ == is_71_[1]) {
												Class11_Sub50_Sub1.anIntArray8844[0] = is_72_[i_78_];
												Class11_Sub50_Sub1.anIntArray8844[1] = 3;
												Class11_Sub50_Sub1.anIntArray8844[2] = is_76_[i_78_];
												Class11_Sub50_Sub1.anIntArray8844[3] = 3;
												Class11_Sub50_Sub1.anIntArray8844[4] = is_73_[i_78_];
												Class11_Sub50_Sub1.anIntArray8844[5] = is_76_[i_78_];
												i_115_ = 6;
											} else if (bools[0x3 & 3 + -i_53_]
													&& ((is_71_[3] ^ 0xffffffff) == (i_78_ ^ 0xffffffff))) {
												Class11_Sub50_Sub1.anIntArray8844[0] = is_72_[i_78_];
												Class11_Sub50_Sub1.anIntArray8844[1] = 7;
												Class11_Sub50_Sub1.anIntArray8844[2] = is_76_[i_78_];
												Class11_Sub50_Sub1.anIntArray8844[3] = 7;
												Class11_Sub50_Sub1.anIntArray8844[4] = is_73_[i_78_];
												i_115_ = 6;
												Class11_Sub50_Sub1.anIntArray8844[5] = is_76_[i_78_];
											} else {
												Class11_Sub50_Sub1.anIntArray8844[0] = is_72_[i_78_];
												Class11_Sub50_Sub1.anIntArray8844[1] = is_73_[i_78_];
												Class11_Sub50_Sub1.anIntArray8844[2] = is_76_[i_78_];
												i_115_ = 3;
											}
										} else {
											Class11_Sub50_Sub1.anIntArray8844[0] = is_72_[i_78_];
											Class11_Sub50_Sub1.anIntArray8844[1] = 5;
											Class11_Sub50_Sub1.anIntArray8844[2] = is_76_[i_78_];
											Class11_Sub50_Sub1.anIntArray8844[3] = 5;
											Class11_Sub50_Sub1.anIntArray8844[4] = is_73_[i_78_];
											Class11_Sub50_Sub1.anIntArray8844[5] = is_76_[i_78_];
											i_115_ = 6;
										}
										for (int i_116_ = 0; i_115_ > i_116_; i_116_++) {
											int i_117_ = (Class11_Sub50_Sub1.anIntArray8844[i_116_]);
											int i_118_ = -(i_53_ * 2) + i_117_
													& 0x7;
											int i_119_ = anIntArray3867[i_117_];
											int i_120_ = anIntArray3861[i_117_];
											int i_121_;
											int i_122_;
											if (i_53_ != 1) {
												if (i_53_ != 2) {
													if ((i_53_ ^ 0xffffffff) == -4) {
														i_121_ = i_119_;
														i_122_ = -i_120_ + 512;
													} else {
														i_121_ = i_120_;
														i_122_ = i_119_;
													}
												} else {
													i_122_ = -i_119_ + 512;
													i_121_ = -i_120_ + 512;
												}
											} else {
												i_121_ = 512 - i_119_;
												i_122_ = i_120_;
											}
											is_82_[i_79_] = i_122_;
											is_83_[i_79_] = i_121_;
											if (is_87_ != null
													&& (Class282.aBoolArrayArray3823[i_52_][i_117_])) {
												int i_123_ = i_122_
														+ (i_47_ << 9);
												int i_124_ = (i_49_ << 9)
														- -i_121_;
												is_87_[i_79_] = ((class12
														.method130(
																i_124_,
																i_123_,
																(Class77.method527(
																		i_41_,
																		63)))) - (class12_40_
														.method130(i_124_,
																i_123_, -125)));
											}
											if (is_88_ != null) {
												if (class12 == null
														|| (Class282.aBoolArrayArray3823[i_52_][i_117_])) {
													if (class12_42_ != null
															&& !(Class154.aBoolArrayArray2029[i_52_][i_117_])) {
														int i_125_ = ((i_47_ << 9) - -i_122_);
														int i_126_ = (i_121_ + (i_49_ << 9));
														is_88_[i_79_] = ((class12_42_
																.method130(
																		i_126_,
																		i_125_,
																		-126)) - (class12_40_
																.method130(
																		i_126_,
																		i_125_,
																		-26)));
													}
												} else {
													int i_127_ = (i_122_ + (i_47_ << 9));
													int i_128_ = ((i_49_ << 9) - -i_121_);
													is_88_[i_79_] = ((class12_40_
															.method130(i_128_,
																	i_127_, 103)) + -(class12
															.method130(i_128_,
																	i_127_,
																	-124)));
												}
											}
											if (i_117_ < 8
													&& ((Class376_Sub7_Sub2_Sub1.anIntArray10208[i_118_]) ^ 0xffffffff) <= -1) {
												if (is_81_ != null)
													is_81_[i_79_] = (Class72.anIntArray1003[i_118_]);
												is_86_[i_79_] = (Class227.anIntArray3133[i_118_]);
												is_85_[i_79_] = (Class242.anIntArray3282[i_118_]);
												is_84_[i_79_] = (Class173.anIntArray2221[i_118_]);
											} else {
												if (!bool_51_
														|| !(Class282.aBoolArrayArray3823[i_52_][i_117_])) {
													if (((i_122_ ^ 0xffffffff) == -1)
															&& ((i_121_ ^ 0xffffffff) == -1)) {
														is_84_[i_79_] = is[i_47_][i_49_];
														is_85_[i_79_] = (((Class327) class327_109_).anInt4353);
														is_86_[i_79_] = (((Class327) class327_109_).anInt4354);
													} else if (((i_122_ ^ 0xffffffff) == -1)
															&& (i_121_ == 512)) {
														is_84_[i_79_] = is[i_47_][i_50_];
														is_85_[i_79_] = (((Class327) class327_110_).anInt4353);
														is_86_[i_79_] = (((Class327) class327_110_).anInt4354);
													} else if (i_122_ != 512
															|| (i_121_ != 512)) {
														if (i_122_ == 512
																&& i_121_ == 0) {
															is_84_[i_79_] = (is[i_48_][i_49_]);
															is_85_[i_79_] = (((Class327) class327_112_).anInt4353);
															is_86_[i_79_] = (((Class327) class327_112_).anInt4354);
														} else {
															if (i_122_ < 256) {
																if (i_121_ < 256) {
																	is_85_[i_79_] = (((Class327) class327_109_).anInt4353);
																	is_86_[i_79_] = (((Class327) class327_109_).anInt4354);
																} else {
																	is_85_[i_79_] = (((Class327) class327_110_).anInt4353);
																	is_86_[i_79_] = (((Class327) class327_110_).anInt4354);
																}
															} else if (i_121_ >= 256) {
																is_85_[i_79_] = (((Class327) class327_111_).anInt4353);
																is_86_[i_79_] = (((Class327) class327_111_).anInt4354);
															} else {
																is_85_[i_79_] = (((Class327) class327_112_).anInt4353);
																is_86_[i_79_] = (((Class327) class327_112_).anInt4354);
															}
															int i_129_ = (Class231
																	.method1477(
																			(is[i_48_][i_49_]),
																			(byte) 101,
																			(is[i_47_][i_49_]),
																			(i_122_ << 7 >> 9)));
															int i_130_ = (Class231
																	.method1477(
																			(is[i_48_][i_50_]),
																			(byte) 79,
																			(is[i_47_][i_50_]),
																			(i_122_ << 7 >> 9)));
															is_84_[i_79_] = (Class231
																	.method1477(
																			i_130_,
																			(byte) 50,
																			i_129_,
																			(i_121_ << 7 >> 9)));
														}
													} else {
														is_84_[i_79_] = is[i_48_][i_50_];
														is_85_[i_79_] = (((Class327) class327_111_).anInt4353);
														is_86_[i_79_] = (((Class327) class327_111_).anInt4354);
													}
												} else {
													is_85_[i_79_] = i_90_;
													is_86_[i_79_] = i_91_;
													is_84_[i_79_] = i_89_;
												}
												if (is_81_ != null)
													is_81_[i_79_] = is_84_[i_79_];
											}
											i_79_++;
										}
										i_78_++;
									}
									if (i_52_ != 0
											&& ((Class327) class327).aBool4356)
										bool = true;
								}
								int i_131_ = class12_40_.method131((byte) 125,
										i_49_, i_47_);
								int i_132_ = class12_40_.method131((byte) 123,
										i_49_, i_48_);
								int i_133_ = class12_40_.method131((byte) 125,
										i_50_, i_48_);
								int i_134_ = class12_40_.method131((byte) 48,
										i_50_, i_47_);
								boolean bool_135_ = Class321_Sub3_Sub1
										.method3613((byte) -70, i_47_, i_49_);
								if (bool_135_ && (i ^ 0xffffffff) < -2
										|| !bool_135_ && i > 0) {
									boolean bool_136_ = true;
									if (class327 != null
											&& !((Class327) class327).aBool4364)
										bool_136_ = false;
									else if ((i_55_ ^ 0xffffffff) != -1
											|| i_52_ == 0) {
										if (i_54_ > 0
												&& class233_59_ != null
												&& !(((Class233) class233_59_).aBool3195))
											bool_136_ = false;
									} else
										bool_136_ = false;
									if (bool_136_
											&& ((i_132_ ^ 0xffffffff) == (i_131_ ^ 0xffffffff))
											&& i_133_ == i_131_
											&& ((i_131_ ^ 0xffffffff) == (i_134_ ^ 0xffffffff)))
										((Class286) this).aByteArrayArrayArray3857[i][i_47_][i_49_] = (byte) (Class173
												.method1134(
														(((Class286) this).aByteArrayArrayArray3857[i][i_47_][i_49_]),
														4));
								}
								int i_137_ = 0;
								int i_138_ = 0;
								int i_139_ = 0;
								if (((Class286) this).aBool3870) {
									i_137_ = Class108_Sub17.method2733(i_47_,
											i_49_);
									i_138_ = Class29.method249(i_47_, i_49_);
									i_139_ = Class140.method888(i_47_, i_49_);
								}
								class12_40_.U(i_47_, i_49_, is_82_, is_87_,
										is_83_, is_88_, is_84_, is_81_, is_85_,
										is_86_, i_137_, i_138_, i_139_, bool);
								Class108_Sub18.method2808(i, i_47_, i_49_);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("qd.T(" + (class12 != null ? "{...}" : "null") + ','
							+ (is != null ? "{...}" : "null") + ','
							+ (class12_40_ != null ? "{...}" : "null") + ','
							+ (class163 != null ? "{...}" : "null") + ',' + i
							+ ',' + i_41_ + ','
							+ (class12_42_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1769(Stream stream, int i, int i_140_, int i_141_,
			int i_142_, Class338[] class338s, int i_143_) {
		try {
			anInt3878++;
			if (!((Class286) this).aBool3870) {
				for (int i_144_ = 0; i_144_ < 4; i_144_++) {
					Class338 class338 = class338s[i_144_];
					for (int i_145_ = 0; i_145_ < 64; i_145_++) {
						for (int i_146_ = 0; (i_146_ ^ 0xffffffff) > -65; i_146_++) {
							int i_147_ = i_140_ - -i_145_;
							int i_148_ = i_146_ + i;
							if (i_147_ >= 0
									&& ((i_147_ ^ 0xffffffff) > (((Class286) this).anInt3865 ^ 0xffffffff))
									&& i_148_ >= 0
									&& ((i_148_ ^ 0xffffffff) > (((Class286) this).anInt3876 ^ 0xffffffff)))
								class338.method2036((byte) -47, i_148_, i_147_);
						}
					}
				}
			}
			int i_149_ = i_140_ + i_143_;
			int i_150_ = i + i_142_;
			for (int i_151_ = i_141_; ((((Class286) this).anInt3880 ^ 0xffffffff) < (i_151_ ^ 0xffffffff)); i_151_++) {
				for (int i_152_ = 0; i_152_ < 64; i_152_++) {
					for (int i_153_ = 0; (i_153_ ^ 0xffffffff) > -65; i_153_++)
						method1774(stream, i_151_, 0, true, 0, false, 0, i_140_
								+ i_152_, i_153_ + i_150_, i_149_ + i_152_,
								i_153_ + i);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("qd.M(" + (stream != null ? "{...}" : "null") + ',' + i
							+ ',' + i_140_ + ',' + i_141_ + ',' + i_142_ + ','
							+ (class338s != null ? "{...}" : "null") + ','
							+ i_143_ + ')'));
		}
	}

	private final void method1770(Class12 class12, Class163 class163,
			int[][] is, int i, int i_154_, Class12 class12_155_,
			Class12 class12_156_) {
		try {
			int i_157_ = 0;
			if (i != 1)
				method1772(-122, -119, 16, null, null, (byte) -110, null, null,
						null, 93, -101, null, null, -11);
			for (/**/; i_157_ < ((Class286) this).anInt3865; i_157_++) {
				for (int i_158_ = 0; ((i_158_ ^ 0xffffffff) > (((Class286) this).anInt3876 ^ 0xffffffff)); i_158_++) {
					if ((Class2_Sub5.anInt5507 ^ 0xffffffff) == 0
							|| Class173.method1131(i_158_, -1, i_154_, i_157_,
									Class2_Sub5.anInt5507)) {
						byte i_159_ = aByteArrayArrayArray3877[i_154_][i_157_][i_158_];
						byte i_160_ = aByteArrayArrayArray3850[i_154_][i_157_][i_158_];
						int i_161_ = (aByteArrayArrayArray3864[i_154_][i_157_][i_158_] & 0xff);
						int i_162_ = 0xff & (aByteArrayArrayArray3852[i_154_][i_157_][i_158_]);
						Class233 class233 = (i_161_ == 0 ? null
								: aClass302_3853.method1865(4, i_161_ - 1));
						Class327 class327 = (i_162_ != 0 ? aClass353_3854
								.method2113(-1 + i_162_, true) : null);
						if (i_159_ == 0 && class233 == null)
							i_159_ = (byte) 12;
						int i_163_ = 0;
						int i_164_ = 0;
						if (i_159_ != 0) {
							i_164_ = class233 == null ? 0
									: (Class376_Sub1_Sub1.anIntArray8688[i_159_]);
							i_163_ = (class327 != null ? Class159.anIntArray2072[i_159_]
									: 0);
						} else if (class233 != null)
							i_164_ = Class376_Sub1_Sub1.anIntArray8688[i_159_];
						else if (class327 != null)
							i_163_ = Class376_Sub1_Sub1.anIntArray8688[i_159_];
						int i_165_ = i_163_ + i_164_;
						int i_166_ = 0;
						if (i_165_ != 0) {
							int i_167_ = (class233 != null ? ((Class233) class233).anInt3188
									: -1);
							int i_168_ = (class327 != null ? ((Class327) class327).anInt4353
									: -1);
							int[] is_169_ = new int[i_165_];
							int[] is_170_ = new int[i_165_];
							int[] is_171_ = new int[i_165_];
							int[] is_172_ = new int[i_165_];
							boolean bool = false;
							boolean bool_173_ = false;
							if (class233 != null
									&& (((Class233) class233).anInt3187 != -1
											|| ((Class233) class233).anInt3183 != -1 || i_167_ != -1)) {
								for (int i_174_ = 0; i_174_ < i_164_; i_174_++) {
									is_171_[i_166_] = i_167_;
									is_172_[i_166_] = ((Class233) class233).anInt3179;
									if ((((Class233) class233).anInt3187 ^ 0xffffffff) != 0)
										is_169_[i_166_] = ((Class233) class233).anInt3187;
									else
										is_169_[i_166_] = -1;
									if ((((Class233) class233).anInt3183 ^ 0xffffffff) == 0)
										is_170_[i_166_] = -1;
									else {
										bool = true;
										is_170_[i_166_] = ((Class233) class233).anInt3183;
									}
									i_166_++;
								}
								if (!((Class286) this).aBool3870
										&& (i_154_ ^ 0xffffffff) == -1)
									Class108_Sub25
											.method3145(
													i_157_,
													i_158_,
													((Class233) class233).anInt3194,
													8 * ((Class233) class233).anInt3184,
													((Class233) class233).anInt3198);
							} else {
								bool_173_ = true;
								for (int i_175_ = 0; ((i_164_ ^ 0xffffffff) < (i_175_ ^ 0xffffffff)); i_175_++) {
									is_169_[i_166_] = -1;
									i_166_++;
								}
							}
							if (!bool)
								is_170_ = null;
							if (class327 == null) {
								if (bool_173_)
									continue;
								for (int i_176_ = 0; ((i_163_ ^ 0xffffffff) < (i_176_ ^ 0xffffffff)); i_176_++) {
									is_169_[i_166_] = -1;
									i_166_++;
								}
							} else {
								for (int i_177_ = 0; ((i_177_ ^ 0xffffffff) > (i_163_ ^ 0xffffffff)); i_177_++) {
									is_171_[i_166_] = i_168_;
									is_172_[i_166_] = ((Class327) class327).anInt4354;
									is_169_[i_166_] = is[i_157_][i_158_];
									if (is_170_ != null)
										is_170_[i_166_] = -1;
									i_166_++;
								}
							}
							int i_178_ = anIntArray3867.length;
							int[] is_179_ = new int[i_178_];
							int[] is_180_ = new int[i_178_];
							int[] is_181_ = class12 == null ? null
									: new int[i_178_];
							int[] is_182_ = (class12 != null
									|| class12_156_ != null ? new int[i_178_]
									: null);
							for (int i_183_ = 0; i_183_ < i_178_; i_183_++) {
								int i_184_ = anIntArray3867[i_183_];
								int i_185_ = anIntArray3861[i_183_];
								if (i_160_ != 0) {
									if (i_160_ == 1) {
										int i_186_ = i_184_;
										is_179_[i_183_] = i_185_;
										is_180_[i_183_] = 512 + -i_186_;
									} else if (i_160_ == 2) {
										is_179_[i_183_] = -i_184_ + 512;
										is_180_[i_183_] = -i_185_ + 512;
									} else if (i_160_ == 3) {
										is_179_[i_183_] = 512 - i_185_;
										int i_187_ = i_184_;
										is_180_[i_183_] = i_187_;
									}
								} else {
									is_179_[i_183_] = i_184_;
									is_180_[i_183_] = i_185_;
								}
								if (is_181_ != null
										&& (Class282.aBoolArrayArray3823[i_159_][i_183_])) {
									int i_188_ = is_179_[i_183_]
											+ (i_157_ << 9);
									int i_189_ = (i_158_ << 9)
											+ is_180_[i_183_];
									is_181_[i_183_] = (class12.method130(
											i_189_, i_188_, -127) - class12_155_
											.method130(i_189_, i_188_, -127));
								}
								if (is_182_ != null) {
									if (class12 != null
											&& !(Class282.aBoolArrayArray3823[i_159_][i_183_])) {
										int i_190_ = (i_157_ << 9)
												+ is_179_[i_183_];
										int i_191_ = (i_158_ << 9)
												+ is_180_[i_183_];
										is_182_[i_183_] = (class12_155_
												.method130(i_191_, i_190_, 45) - class12
												.method130(i_191_, i_190_, 3));
									} else if (class12_156_ != null
											&& !(Class154.aBoolArrayArray2029[i_159_][i_183_])) {
										int i_192_ = is_179_[i_183_]
												+ (i_157_ << 9);
										int i_193_ = (i_158_ << 9)
												+ is_180_[i_183_];
										is_182_[i_183_] = (class12_156_
												.method130(i_193_, i_192_, 82) - class12_155_
												.method130(i_193_, i_192_, -123));
									}
								}
							}
							int i_194_ = class12_155_.method131((byte) 123,
									i_158_, i_157_);
							int i_195_ = class12_155_.method131((byte) 127,
									i_158_, i_157_ + 1);
							int i_196_ = class12_155_.method131((byte) -41,
									1 + i_158_, i_157_ + 1);
							int i_197_ = class12_155_.method131((byte) 126,
									i_158_ + 1, i_157_);
							boolean bool_198_ = Class321_Sub3_Sub1.method3613(
									(byte) -57, i_157_, i_158_);
							if (bool_198_ && i_154_ > 1 || !bool_198_
									&& i_154_ > 0) {
								boolean bool_199_ = true;
								if (class327 != null
										&& !((Class327) class327).aBool4364)
									bool_199_ = false;
								else if ((i_162_ ^ 0xffffffff) != -1
										|| (i_159_ ^ 0xffffffff) == -1) {
									if ((i_161_ ^ 0xffffffff) < -1
											&& class233 != null
											&& !((Class233) class233).aBool3195)
										bool_199_ = false;
								} else
									bool_199_ = false;
								if (bool_199_ && i_194_ == i_195_
										&& i_194_ == i_196_ && i_194_ == i_197_)
									((Class286) this).aByteArrayArrayArray3857[i_154_][i_157_][i_158_] = (byte) (Class173
											.method1134(
													(((Class286) this).aByteArrayArrayArray3857[i_154_][i_157_][i_158_]),
													4));
							}
							int i_200_ = 0;
							int i_201_ = 0;
							int i_202_ = 0;
							if (((Class286) this).aBool3870) {
								i_200_ = Class108_Sub17.method2733(i_157_,
										i_158_);
								i_201_ = Class29.method249(i_157_, i_158_);
								i_202_ = Class140.method888(i_157_, i_158_);
							}
							class12_155_.method137(i_157_, i_158_, is_179_,
									is_181_, is_180_, is_182_,
									Class108_Sub19.anIntArrayArray7113[i_159_],
									Class159.anIntArrayArray2073[i_159_],
									Class165.anIntArrayArray2142[i_159_],
									is_169_, is_170_, is_171_, is_172_, i_200_,
									i_201_, i_202_, false);
							Class108_Sub18.method2808(i_154_, i_157_, i_158_);
						}
					}
				}
			}
			anInt3862++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qd.J("
					+ (class12 != null ? "{...}" : "null") + ','
					+ (class163 != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ',' + i + ',' + i_154_
					+ ',' + (class12_155_ != null ? "{...}" : "null") + ','
					+ (class12_156_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1771(Class338[] class338s, int[][][] is,
			Class163 class163, int i) {
		try {
			int i_203_ = 37 / ((i + 54) / 33);
			anInt3871++;
			if (!((Class286) this).aBool3870) {
				for (int i_204_ = 0; i_204_ < 4; i_204_++) {
					for (int i_205_ = 0; ((Class286) this).anInt3865 > i_205_; i_205_++) {
						for (int i_206_ = 0; ((Class286) this).anInt3876 > i_206_; i_206_++) {
							if ((0x1 & (Class11_Sub45_Sub17.aByteArrayArrayArray9509[i_204_][i_205_][i_206_])) != 0) {
								int i_207_ = i_204_;
								if ((0x2 & (Class11_Sub45_Sub17.aByteArrayArrayArray9509[1][i_205_][i_206_])) != 0)
									i_207_--;
								if ((i_207_ ^ 0xffffffff) <= -1)
									class338s[i_207_].method2040(i_205_, false,
											i_206_);
							}
						}
					}
				}
			}
			for (int i_208_ = 0; ((Class286) this).anInt3880 > i_208_; i_208_++) {
				int i_209_ = 0;
				int i_210_ = 0;
				if (!((Class286) this).aBool3870) {
					if (Class134.aBool1853)
						i_209_ |= 0x2;
					if (Class30.aBool405)
						i_210_ |= 0x8;
					if ((Class227.anInt3135 ^ 0xffffffff) != -1) {
						if ((i_208_ ^ 0xffffffff) == -1 | Class2_Sub1.aBool5069)
							i_210_ |= 0x10;
						i_209_ |= 0x1;
					}
				}
				if (Class134.aBool1853)
					i_210_ |= 0x7;
				if (!Class273.aBool3680)
					i_210_ |= 0x20;
				int[][] is_211_ = (is != null && i_208_ < is.length ? is[i_208_]
						: ((Class286) this).anIntArrayArrayArray3866[i_208_]);
				Class254_Sub1.method2408(i_208_, class163.method1036(
						((Class286) this).anInt3865,
						((Class286) this).anInt3876,
						(((Class286) this).anIntArrayArrayArray3866[i_208_]),
						is_211_, 512, i_209_, i_210_));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qd.L("
					+ (class338s != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ','
					+ (class163 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	private final void method1772(int i, int i_212_, int i_213_, byte[][] is,
			byte[][] is_214_, byte i_215_, byte[][] is_216_, Class327 class327,
			Class233 class233, int i_217_, int i_218_, boolean[] bools,
			Class163 class163, int i_219_) {
		do {
			try {
				anInt3859++;
				boolean[] bools_220_ = (class233 == null
						|| !((Class233) class233).aBool3199 ? Class11_Sub45_Sub20.aBoolArrayArray9738[i_212_]
						: Class11_Sub3.aBoolArrayArray5115[i_212_]);
				if ((i_219_ ^ 0xffffffff) < -1) {
					if (i_217_ > 0) {
						int i_221_ = is_216_[i_217_ - 1][-1 + i_219_] & 0xff;
						if (i_221_ > 0) {
							Class233 class233_222_ = aClass302_3853.method1865(
									4, -1 + i_221_);
							if (((Class233) class233_222_).anInt3187 != -1
									&& ((Class233) class233_222_).aBool3199) {
								byte i_223_ = is[-1 + i_217_][-1 + i_219_];
								int i_224_ = (is_214_[-1 + i_217_][i_219_ - 1] * 2 + 4 & 0x7);
								int i_225_ = Class381.method2229(class163,
										true, class233_222_);
								if (Class282.aBoolArrayArray3823[i_223_][i_224_]) {
									Class173.anIntArray2221[0] = ((Class233) class233_222_).anInt3187;
									Class72.anIntArray1003[0] = i_225_;
									Class242.anIntArray3282[0] = ((Class233) class233_222_).anInt3188;
									Class227.anIntArray3133[0] = ((Class233) class233_222_).anInt3179;
									Class376_Sub7_Sub2_Sub1.anIntArray10208[0] = ((Class233) class233_222_).anInt3192;
									Class124.anIntArray1683[0] = 256;
								}
							}
						}
					}
					if (i_217_ < i_213_ - 1) {
						int i_226_ = is_216_[i_217_ + 1][i_219_ - 1] & 0xff;
						if (i_226_ > 0) {
							Class233 class233_227_ = aClass302_3853.method1865(
									4, -1 + i_226_);
							if ((((Class233) class233_227_).anInt3187 ^ 0xffffffff) != 0
									&& ((Class233) class233_227_).aBool3199) {
								byte i_228_ = is[i_217_ + 1][-1 + i_219_];
								int i_229_ = 0x7 & 6 - -(2 * (is_214_[1 + i_217_][i_219_ - 1]));
								int i_230_ = Class381.method2229(class163,
										true, class233_227_);
								if (Class282.aBoolArrayArray3823[i_228_][i_229_]) {
									Class173.anIntArray2221[2] = ((Class233) class233_227_).anInt3187;
									Class72.anIntArray1003[2] = i_230_;
									Class242.anIntArray3282[2] = ((Class233) class233_227_).anInt3188;
									Class227.anIntArray3133[2] = ((Class233) class233_227_).anInt3179;
									Class376_Sub7_Sub2_Sub1.anIntArray10208[2] = ((Class233) class233_227_).anInt3192;
									Class124.anIntArray1683[2] = 512;
								}
							}
						}
					}
				}
				if ((i_219_ ^ 0xffffffff) > (-1 + i_218_ ^ 0xffffffff)) {
					if (i_217_ > 0) {
						int i_231_ = is_216_[i_217_ - 1][i_219_ + 1] & 0xff;
						if (i_231_ > 0) {
							Class233 class233_232_ = aClass302_3853.method1865(
									4, -1 + i_231_);
							if ((((Class233) class233_232_).anInt3187 ^ 0xffffffff) != 0
									&& ((Class233) class233_232_).aBool3199) {
								byte i_233_ = is[-1 + i_217_][1 + i_219_];
								int i_234_ = 0x7 & 2 - -(2 * (is_214_[-1
										+ i_217_][i_219_ + 1]));
								int i_235_ = Class381.method2229(class163,
										true, class233_232_);
								if (Class282.aBoolArrayArray3823[i_233_][i_234_]) {
									Class173.anIntArray2221[6] = ((Class233) class233_232_).anInt3187;
									Class72.anIntArray1003[6] = i_235_;
									Class242.anIntArray3282[6] = ((Class233) class233_232_).anInt3188;
									Class227.anIntArray3133[6] = ((Class233) class233_232_).anInt3179;
									Class376_Sub7_Sub2_Sub1.anIntArray10208[6] = ((Class233) class233_232_).anInt3192;
									Class124.anIntArray1683[6] = 64;
								}
							}
						}
					}
					if ((i_217_ ^ 0xffffffff) > (-1 + i_213_ ^ 0xffffffff)) {
						int i_236_ = is_216_[i_217_ + 1][1 + i_219_] & 0xff;
						if (i_236_ > 0) {
							Class233 class233_237_ = aClass302_3853.method1865(
									4, -1 + i_236_);
							if ((((Class233) class233_237_).anInt3187 ^ 0xffffffff) != 0
									&& ((Class233) class233_237_).aBool3199) {
								byte i_238_ = is[1 + i_217_][1 + i_219_];
								int i_239_ = (is_214_[1 + i_217_][1 + i_219_] * 2 & 0x7);
								int i_240_ = Class381.method2229(class163,
										true, class233_237_);
								if (Class282.aBoolArrayArray3823[i_238_][i_239_]) {
									Class173.anIntArray2221[4] = ((Class233) class233_237_).anInt3187;
									Class72.anIntArray1003[4] = i_240_;
									Class242.anIntArray3282[4] = ((Class233) class233_237_).anInt3188;
									Class227.anIntArray3133[4] = ((Class233) class233_237_).anInt3179;
									Class376_Sub7_Sub2_Sub1.anIntArray10208[4] = ((Class233) class233_237_).anInt3192;
									Class124.anIntArray1683[4] = 128;
								}
							}
						}
					}
				}
				if (i_219_ > 0) {
					int i_241_ = 0xff & is_216_[i_217_][i_219_ - 1];
					if (i_241_ > 0) {
						Class233 class233_242_ = aClass302_3853.method1865(4,
								-1 + i_241_);
						if (((Class233) class233_242_).anInt3187 != -1) {
							byte i_243_ = is[i_217_][-1 + i_219_];
							int i_244_ = is_214_[i_217_][i_219_ - 1];
							if (((Class233) class233_242_).aBool3199) {
								int i_245_ = 2;
								int i_246_ = i_244_ * 2 + 4;
								int i_247_ = Class381.method2229(class163,
										true, class233_242_);
								for (int i_248_ = 0; i_248_ < 3; i_248_++) {
									i_245_ &= 0x7;
									i_246_ &= 0x7;
									if ((Class282.aBoolArrayArray3823[i_243_][i_246_])
											&& (((((Class233) class233_242_).anInt3192) ^ 0xffffffff) <= ((Class376_Sub7_Sub2_Sub1.anIntArray10208[i_245_]) ^ 0xffffffff))) {
										Class173.anIntArray2221[i_245_] = (((Class233) class233_242_).anInt3187);
										Class72.anIntArray1003[i_245_] = i_247_;
										Class242.anIntArray3282[i_245_] = (((Class233) class233_242_).anInt3188);
										Class227.anIntArray3133[i_245_] = (((Class233) class233_242_).anInt3179);
										if (((((Class233) class233_242_).anInt3192) ^ 0xffffffff) == ((Class376_Sub7_Sub2_Sub1.anIntArray10208[i_245_]) ^ 0xffffffff))
											Class124.anIntArray1683[i_245_] = (Class173
													.method1134(
															(Class124.anIntArray1683[i_245_]),
															32));
										else
											Class124.anIntArray1683[i_245_] = 32;
										Class376_Sub7_Sub2_Sub1.anIntArray10208[i_245_] = (((Class233) class233_242_).anInt3192);
									}
									i_246_++;
									i_245_--;
								}
								if (!bools_220_[i & 0x3])
									bools[0] = (Class11_Sub3.aBoolArrayArray5115[i_243_][Class77
											.method529(3, i_244_ + 2)]);
							} else if (!bools_220_[i & 0x3])
								bools[0] = (Class11_Sub45_Sub20.aBoolArrayArray9738[i_243_][Class77
										.method529(3, 2 + i_244_)]);
						}
					}
				}
				if ((i_219_ ^ 0xffffffff) > (-1 + i_218_ ^ 0xffffffff)) {
					int i_249_ = 0xff & is_216_[i_217_][i_219_ + 1];
					if ((i_249_ ^ 0xffffffff) < -1) {
						Class233 class233_250_ = aClass302_3853.method1865(4,
								i_249_ - 1);
						if (((Class233) class233_250_).anInt3187 != -1) {
							byte i_251_ = is[i_217_][1 + i_219_];
							int i_252_ = is_214_[i_217_][1 + i_219_];
							if (((Class233) class233_250_).aBool3199) {
								int i_253_ = 4;
								int i_254_ = 2 - -(2 * i_252_);
								int i_255_ = Class381.method2229(class163,
										true, class233_250_);
								for (int i_256_ = 0; (i_256_ ^ 0xffffffff) > -4; i_256_++) {
									i_254_ &= 0x7;
									i_253_ = 0x7 & i_253_;
									if ((Class282.aBoolArrayArray3823[i_251_][i_254_])
											&& ((Class376_Sub7_Sub2_Sub1.anIntArray10208[i_253_]) <= (((Class233) class233_250_).anInt3192))) {
										Class173.anIntArray2221[i_253_] = (((Class233) class233_250_).anInt3187);
										Class72.anIntArray1003[i_253_] = i_255_;
										Class242.anIntArray3282[i_253_] = (((Class233) class233_250_).anInt3188);
										Class227.anIntArray3133[i_253_] = (((Class233) class233_250_).anInt3179);
										if ((((Class233) class233_250_).anInt3192) != (Class376_Sub7_Sub2_Sub1.anIntArray10208[i_253_]))
											Class124.anIntArray1683[i_253_] = 16;
										else
											Class124.anIntArray1683[i_253_] = (Class173
													.method1134(
															(Class124.anIntArray1683[i_253_]),
															16));
										Class376_Sub7_Sub2_Sub1.anIntArray10208[i_253_] = (((Class233) class233_250_).anInt3192);
									}
									i_253_++;
									i_254_--;
								}
								if (!bools_220_[2 + i & 0x3])
									bools[2] = (Class11_Sub3.aBoolArrayArray5115[i_251_][Class77
											.method529(i_252_, 3)]);
							} else if (!bools_220_[0x3 & 2 + i])
								bools[2] = (Class11_Sub45_Sub20.aBoolArrayArray9738[i_251_][Class77
										.method529(--i_252_, 3)]);
						}
					}
				}
				if (i_217_ > 0) {
					int i_257_ = is_216_[-1 + i_217_][i_219_] & 0xff;
					if (i_257_ > 0) {
						Class233 class233_258_ = aClass302_3853.method1865(4,
								i_257_ - 1);
						if (((Class233) class233_258_).anInt3187 != -1) {
							byte i_259_ = is[i_217_ - 1][i_219_];
							int i_260_ = is_214_[-1 + i_217_][i_219_];
							if (((Class233) class233_258_).aBool3199) {
								int i_261_ = 6;
								int i_262_ = 4 + i_260_ * 2;
								int i_263_ = Class381.method2229(class163,
										true, class233_258_);
								for (int i_264_ = 0; i_264_ < 3; i_264_++) {
									i_261_ &= 0x7;
									i_262_ &= 0x7;
									if ((Class282.aBoolArrayArray3823[i_259_][i_262_])
											&& ((Class376_Sub7_Sub2_Sub1.anIntArray10208[i_261_]) <= (((Class233) class233_258_).anInt3192))) {
										Class173.anIntArray2221[i_261_] = (((Class233) class233_258_).anInt3187);
										Class72.anIntArray1003[i_261_] = i_263_;
										Class242.anIntArray3282[i_261_] = (((Class233) class233_258_).anInt3188);
										Class227.anIntArray3133[i_261_] = (((Class233) class233_258_).anInt3179);
										if (((Class376_Sub7_Sub2_Sub1.anIntArray10208[i_261_]) ^ 0xffffffff) == ((((Class233) class233_258_).anInt3192) ^ 0xffffffff))
											Class124.anIntArray1683[i_261_] = (Class173
													.method1134(
															(Class124.anIntArray1683[i_261_]),
															8));
										else
											Class124.anIntArray1683[i_261_] = 8;
										Class376_Sub7_Sub2_Sub1.anIntArray10208[i_261_] = (((Class233) class233_258_).anInt3192);
									}
									i_262_--;
									i_261_++;
								}
								if (!bools_220_[0x3 & 3 - -i])
									bools[3] = (Class11_Sub3.aBoolArrayArray5115[i_259_][Class77
											.method529(1 - -i_260_, 3)]);
							} else if (!bools_220_[3 - -i & 0x3])
								bools[3] = (Class11_Sub45_Sub20.aBoolArrayArray9738[i_259_][Class77
										.method529(1 - -i_260_, 3)]);
						}
					}
				}
				if (i_215_ < 115)
					method1768(null, null, null, null, 8, (byte) 94, null);
				if (i_217_ < i_213_ - 1) {
					int i_265_ = 0xff & is_216_[i_217_ + 1][i_219_];
					if (i_265_ > 0) {
						Class233 class233_266_ = aClass302_3853.method1865(4,
								-1 + i_265_);
						if (((Class233) class233_266_).anInt3187 != -1) {
							byte i_267_ = is[i_217_ + 1][i_219_];
							int i_268_ = is_214_[i_217_ + 1][i_219_];
							if (!((Class233) class233_266_).aBool3199) {
								if (!bools_220_[1 + i & 0x3])
									bools[1] = (Class11_Sub45_Sub20.aBoolArrayArray9738[i_267_][Class77
											.method529(3 - -i_268_, 3)]);
							} else {
								int i_269_ = 4;
								int i_270_ = 2 * i_268_ + 6;
								int i_271_ = Class381.method2229(class163,
										true, class233_266_);
								for (int i_272_ = 0; i_272_ < 3; i_272_++) {
									i_269_ &= 0x7;
									i_270_ &= 0x7;
									if ((Class282.aBoolArrayArray3823[i_267_][i_270_])
											&& (((Class376_Sub7_Sub2_Sub1.anIntArray10208[i_269_]) ^ 0xffffffff) >= ((((Class233) class233_266_).anInt3192) ^ 0xffffffff))) {
										Class173.anIntArray2221[i_269_] = (((Class233) class233_266_).anInt3187);
										Class72.anIntArray1003[i_269_] = i_271_;
										Class242.anIntArray3282[i_269_] = (((Class233) class233_266_).anInt3188);
										Class227.anIntArray3133[i_269_] = (((Class233) class233_266_).anInt3179);
										if (((Class376_Sub7_Sub2_Sub1.anIntArray10208[i_269_]) ^ 0xffffffff) == ((((Class233) class233_266_).anInt3192) ^ 0xffffffff))
											Class124.anIntArray1683[i_269_] = (Class173
													.method1134(
															(Class124.anIntArray1683[i_269_]),
															4));
										else
											Class124.anIntArray1683[i_269_] = 4;
										Class376_Sub7_Sub2_Sub1.anIntArray10208[i_269_] = (((Class233) class233_266_).anInt3192);
									}
									i_270_++;
									i_269_--;
								}
								if (!bools_220_[1 + i & 0x3])
									bools[1] = (Class11_Sub3.aBoolArrayArray5115[i_267_][Class77
											.method529(i_268_ + 3, 3)]);
							}
						}
					}
				}
				if (class233 == null)
					break;
				int i_273_ = Class381.method2229(class163, true, class233);
				if (!((Class233) class233).aBool3199)
					break;
				for (int i_274_ = 0; i_274_ < 8; i_274_++) {
					int i_275_ = 0x7 & -(2 * i) + i_274_;
					if (Class282.aBoolArrayArray3823[i_212_][i_274_]
							&& ((Class376_Sub7_Sub2_Sub1.anIntArray10208[i_275_] ^ 0xffffffff) >= (((Class233) class233).anInt3192 ^ 0xffffffff))) {
						Class173.anIntArray2221[i_275_] = ((Class233) class233).anInt3187;
						Class72.anIntArray1003[i_275_] = i_273_;
						Class242.anIntArray3282[i_275_] = ((Class233) class233).anInt3188;
						Class227.anIntArray3133[i_275_] = ((Class233) class233).anInt3179;
						if ((((Class233) class233).anInt3192 ^ 0xffffffff) == (Class376_Sub7_Sub2_Sub1.anIntArray10208[i_275_] ^ 0xffffffff))
							Class124.anIntArray1683[i_275_] = Class173
									.method1134(
											(Class124.anIntArray1683[i_275_]),
											2);
						else
							Class124.anIntArray1683[i_275_] = 2;
						Class376_Sub7_Sub2_Sub1.anIntArray10208[i_275_] = ((Class233) class233).anInt3192;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("qd.P(" + i + ',' + i_212_ + ',' + i_213_ + ','
								+ (is != null ? "{...}" : "null") + ','
								+ (is_214_ != null ? "{...}" : "null") + ','
								+ i_215_ + ','
								+ (is_216_ != null ? "{...}" : "null") + ','
								+ (class327 != null ? "{...}" : "null") + ','
								+ (class233 != null ? "{...}" : "null") + ','
								+ i_217_ + ',' + i_218_ + ','
								+ (bools != null ? "{...}" : "null") + ','
								+ (class163 != null ? "{...}" : "null") + ','
								+ i_219_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1773(Class12 class12, int i, Class163 class163,
			Class12 class12_276_) {
		try {
			anInt3849++;
			if (i == -1) {
				if (Class12.anIntArray105 == null
						|| (((Class286) this).anInt3876 != Class12.anIntArray105.length)) {
					Class12.anIntArray105 = new int[((Class286) this).anInt3876];
					Class204.anIntArray2744 = new int[((Class286) this).anInt3876];
					Class289.anIntArray3902 = new int[((Class286) this).anInt3876];
					Class232.anIntArray3175 = new int[((Class286) this).anInt3876];
					Class100.anIntArray1329 = new int[((Class286) this).anInt3876];
				}
				int[][] is = (new int[((Class286) this).anInt3865][((Class286) this).anInt3876]);
				for (int i_277_ = 0; i_277_ < ((Class286) this).anInt3880; i_277_++) {
					for (int i_278_ = 0; ((((Class286) this).anInt3876 ^ 0xffffffff) < (i_278_ ^ 0xffffffff)); i_278_++) {
						Class12.anIntArray105[i_278_] = 0;
						Class232.anIntArray3175[i_278_] = 0;
						Class289.anIntArray3902[i_278_] = 0;
						Class100.anIntArray1329[i_278_] = 0;
						Class204.anIntArray2744[i_278_] = 0;
					}
					for (int i_279_ = -5; ((((Class286) this).anInt3865 ^ 0xffffffff) < (i_279_ ^ 0xffffffff)); i_279_++) {
						for (int i_280_ = 0; ((((Class286) this).anInt3876 ^ 0xffffffff) < (i_280_ ^ 0xffffffff)); i_280_++) {
							int i_281_ = 5 + i_279_;
							if (((Class286) this).anInt3865 > i_281_) {
								int i_282_ = ((aByteArrayArrayArray3852[i_277_][i_281_][i_280_]) & 0xff);
								if (i_282_ > 0) {
									Class327 class327 = aClass353_3854
											.method2113(i_282_ - 1, true);
									Class12.anIntArray105[i_280_] += ((Class327) class327).anInt4360;
									Class232.anIntArray3175[i_280_] += ((Class327) class327).anInt4361;
									Class289.anIntArray3902[i_280_] += ((Class327) class327).anInt4366;
									Class100.anIntArray1329[i_280_] += ((Class327) class327).anInt4365;
									Class204.anIntArray2744[i_280_]++;
								}
							}
							int i_283_ = i_279_ - 5;
							if ((i_283_ ^ 0xffffffff) <= -1) {
								int i_284_ = ((aByteArrayArrayArray3852[i_277_][i_283_][i_280_]) & 0xff);
								if (i_284_ > 0) {
									Class327 class327 = aClass353_3854
											.method2113(i_284_ - 1, true);
									Class12.anIntArray105[i_280_] -= ((Class327) class327).anInt4360;
									Class232.anIntArray3175[i_280_] -= ((Class327) class327).anInt4361;
									Class289.anIntArray3902[i_280_] -= ((Class327) class327).anInt4366;
									Class100.anIntArray1329[i_280_] -= ((Class327) class327).anInt4365;
									Class204.anIntArray2744[i_280_]--;
								}
							}
						}
						if ((i_279_ ^ 0xffffffff) <= -1) {
							int i_285_ = 0;
							int i_286_ = 0;
							int i_287_ = 0;
							int i_288_ = 0;
							int i_289_ = 0;
							for (int i_290_ = -5; ((Class286) this).anInt3876 > i_290_; i_290_++) {
								int i_291_ = i_290_ + 5;
								if ((((Class286) this).anInt3876 ^ 0xffffffff) < (i_291_ ^ 0xffffffff)) {
									i_289_ += Class204.anIntArray2744[i_291_];
									i_287_ += Class289.anIntArray3902[i_291_];
									i_285_ += Class12.anIntArray105[i_291_];
									i_286_ += Class232.anIntArray3175[i_291_];
									i_288_ += Class100.anIntArray1329[i_291_];
								}
								int i_292_ = -5 + i_290_;
								if ((i_292_ ^ 0xffffffff) <= -1) {
									i_286_ -= Class232.anIntArray3175[i_292_];
									i_288_ -= Class100.anIntArray1329[i_292_];
									i_287_ -= Class289.anIntArray3902[i_292_];
									i_285_ -= Class12.anIntArray105[i_292_];
									i_289_ -= Class204.anIntArray2744[i_292_];
								}
								if ((i_290_ ^ 0xffffffff) <= -1 && i_288_ > 0
										&& i_289_ > 0)
									is[i_279_][i_290_] = (OutputStream_Sub2
											.method3194(i_286_ / i_289_,
													-1260895222, i_287_
															/ i_289_, i_285_
															* 256 / i_288_));
							}
						}
					}
					if (Class14.aBool129)
						method1768(((i_277_ ^ 0xffffffff) == -1 ? class12_276_
								: null), is,
								Class315.aClass12Array4179[i_277_], class163,
								i_277_, (byte) -71,
								((i_277_ ^ 0xffffffff) != -1 ? null : class12));
					else
						method1770(i_277_ == 0 ? class12_276_ : null, class163,
								is, 1, i_277_,
								Class315.aClass12Array4179[i_277_],
								i_277_ == 0 ? class12 : null);
					aByteArrayArrayArray3852[i_277_] = null;
					aByteArrayArrayArray3864[i_277_] = null;
					aByteArrayArrayArray3877[i_277_] = null;
					aByteArrayArrayArray3850[i_277_] = null;
				}
				if (!((Class286) this).aBool3870) {
					if ((Class227.anInt3135 ^ 0xffffffff) != -1)
						Class11_Sub46.method3210();
					if (Class134.aBool1853)
						Class134.method866();
				}
				for (int i_293_ = 0; ((i_293_ ^ 0xffffffff) > (((Class286) this).anInt3880 ^ 0xffffffff)); i_293_++)
					Class315.aClass12Array4179[i_293_].YA();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qd.V("
					+ (class12 != null ? "{...}" : "null") + ',' + i + ','
					+ (class163 != null ? "{...}" : "null") + ','
					+ (class12_276_ != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method1774(Stream stream, int i, int i_294_,
			boolean bool, int i_295_, boolean bool_296_, int i_297_,
			int i_298_, int i_299_, int i_300_, int i_301_) {
		try {
			if ((i_294_ ^ 0xffffffff) != -2) {
				if ((i_294_ ^ 0xffffffff) != -3) {
					if (i_294_ == 3)
						i_295_ = 1;
				} else {
					i_295_ = 1;
					i_297_ = 1;
				}
			} else
				i_297_ = 1;
			anInt3860++;
			if (bool != true)
				method1773(null, 30, null, null);
			if ((i_298_ ^ 0xffffffff) > -1
					|| (i_298_ ^ 0xffffffff) <= (((Class286) this).anInt3865 ^ 0xffffffff)
					|| (i_301_ ^ 0xffffffff) > -1
					|| i_301_ >= ((Class286) this).anInt3876) {
				for (;;) {
					int i_302_ = stream.readUnsignedByte((byte) 35);
					if ((i_302_ ^ 0xffffffff) == -1)
						break;
					if ((i_302_ ^ 0xffffffff) == -2) {
						stream.readUnsignedByte((byte) 35);
						break;
					}
					if (i_302_ <= 49)
						stream.readUnsignedByte((byte) 35);
				}
			} else {
				if (!((Class286) this).aBool3870 && !bool_296_)
					Class11_Sub45_Sub17.aByteArrayArrayArray9509[i][i_298_][i_301_] = (byte) 0;
				for (;;) {
					int i_303_ = stream.readUnsignedByte((byte) 35);
					if ((i_303_ ^ 0xffffffff) == -1) {
						if (((Class286) this).aBool3870)
							((Class286) this).anIntArrayArrayArray3866[0][i_298_
									- -i_295_][i_297_ + i_301_] = 0;
						else {
							if ((i ^ 0xffffffff) != -1)
								((Class286) this).anIntArrayArrayArray3866[i][i_295_
										+ i_298_][i_301_ - -i_297_] = -960
										+ (((Class286) this).anIntArrayArrayArray3866[-1
												+ i][i_295_ + i_298_][i_301_
												+ i_297_]);
							else {
								((Class286) this).anIntArrayArrayArray3866[0][i_298_
										- -i_295_][i_301_ - -i_297_] = 8 * -(Class234_Sub1_Sub1
										.method3824(false, 932731 - -i_300_,
												i_299_ + 556238)) << 2;
								break;
							}
							break;
						}
						break;
					}
					if (i_303_ == 1) {
						int i_304_ = stream.readUnsignedByte((byte) 35);
						if (!((Class286) this).aBool3870) {
							if (i_304_ == 1)
								i_304_ = 0;
							if (i == 0)
								((Class286) this).anIntArrayArrayArray3866[0][i_295_
										+ i_298_][i_301_ + i_297_] = -i_304_ * 8 << 2;
							else
								((Class286) this).anIntArrayArrayArray3866[i][i_295_
										+ i_298_][i_301_ + i_297_] = ((((Class286) this).anIntArrayArrayArray3866[i - 1][i_298_
										- -i_295_][i_297_ + i_301_]) - (i_304_ * 8 << 2));
						} else {
							((Class286) this).anIntArrayArrayArray3866[0][i_295_
									+ i_298_][i_301_ - -i_297_] = i_304_ * 8 << 2;
							break;
						}
						break;
					}
					if (i_303_ <= 49) {
						if (bool_296_)
							stream.readUnsignedByte((byte) 35);
						else {
							aByteArrayArrayArray3864[i][i_298_][i_301_] = stream
									.readByte(1854307120);
							aByteArrayArrayArray3877[i][i_298_][i_301_] = (byte) ((i_303_ - 2) / 4);
							aByteArrayArrayArray3850[i][i_298_][i_301_] = (byte) Class77
									.method529(3, (i_303_ + (-2 + i_294_)));
						}
					} else if ((i_303_ ^ 0xffffffff) >= -82) {
						if (!((Class286) this).aBool3870 && !bool_296_)
							Class11_Sub45_Sub17.aByteArrayArrayArray9509[i][i_298_][i_301_] = (byte) (i_303_ - 49);
					} else if (!bool_296_)
						aByteArrayArrayArray3852[i][i_298_][i_301_] = (byte) (-81 + i_303_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qd.N("
					+ (stream != null ? "{...}" : "null") + ',' + i + ','
					+ i_294_ + ',' + bool + ',' + i_295_ + ',' + bool_296_
					+ ',' + i_297_ + ',' + i_298_ + ',' + i_299_ + ',' + i_300_
					+ ',' + i_301_ + ')'));
		}
	}

	static final void method1775(int i, int i_305_, int i_306_, int i_307_,
			int i_308_, int i_309_) {
		try {
			anInt3863++;
			int i_310_ = i;
			int i_311_ = i_306_;
			int i_312_ = i_305_ * i_305_;
			int i_313_ = i_306_ * i_306_;
			int i_314_ = i_313_ << 1;
			int i_315_ = i_312_ << 1;
			int i_316_ = i_306_ << 1;
			int i_317_ = i_312_ * (1 - i_316_) + i_314_;
			int i_318_ = i_313_ + -(i_315_ * (-1 + i_316_));
			int i_319_ = i_312_ << 2;
			int i_320_ = i_313_ << 2;
			int i_321_ = i_314_ * (3 + (i_310_ << 1));
			int i_322_ = i_315_ * ((i_311_ << 1) - 3);
			int i_323_ = i_320_ * (i_310_ + 1);
			Class11_Sub2_Sub32_Sub1.method3883(-i_305_ + i_308_,
					(Class297.anIntArrayArray4026[i_307_]), (byte) 58, i_309_,
					i_308_ - -i_305_);
			int i_324_ = i_319_ * (i_311_ - 1);
			while ((i_311_ ^ 0xffffffff) < -1) {
				if ((i_317_ ^ 0xffffffff) > -1) {
					while (i_317_ < 0) {
						i_318_ += i_323_;
						i_317_ += i_321_;
						i_310_++;
						i_323_ += i_320_;
						i_321_ += i_320_;
					}
				}
				if ((i_318_ ^ 0xffffffff) > -1) {
					i_317_ += i_321_;
					i_318_ += i_323_;
					i_321_ += i_320_;
					i_323_ += i_320_;
					i_310_++;
				}
				i_318_ += -i_322_;
				i_317_ += -i_324_;
				i_322_ -= i_319_;
				i_311_--;
				i_324_ -= i_319_;
				int i_325_ = -i_311_ + i_307_;
				int i_326_ = i_307_ + i_311_;
				int i_327_ = i_310_ + i_308_;
				int i_328_ = i_308_ + -i_310_;
				Class11_Sub2_Sub32_Sub1.method3883(i_328_,
						(Class297.anIntArrayArray4026[i_325_]), (byte) 91,
						i_309_, i_327_);
				Class11_Sub2_Sub32_Sub1.method3883(i_328_,
						(Class297.anIntArrayArray4026[i_326_]), (byte) 66,
						i_309_, i_327_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qd.Q(" + i + ','
					+ i_305_ + ',' + i_306_ + ',' + i_307_ + ',' + i_308_ + ','
					+ i_309_ + ')'));
		}
	}

	final void method1776(int i, int i_329_, int i_330_, int i_331_, byte i_332_) {
		try {
			anInt3858++;
			int i_333_ = -68 % ((i_332_ - 38) / 61);
			for (int i_334_ = 0; ((Class286) this).anInt3880 > i_334_; i_334_++)
				method1764(i_331_, i, i_330_, i_329_, i_334_, 29274);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("qd.K(" + i + ',' + i_329_ + ',' + i_330_ + ',' + i_331_
							+ ',' + i_332_ + ')'));
		}
	}

	Class286(int i, int i_335_, int i_336_, boolean bool, Class302 class302,
			Class353 class353) {
		try {
			aClass353_3854 = class353;
			((Class286) this).aBool3870 = bool;
			aClass302_3853 = class302;
			((Class286) this).anInt3880 = i;
			((Class286) this).anInt3865 = i_335_;
			((Class286) this).anInt3876 = i_336_;
			aByteArrayArrayArray3877 = (new byte[((Class286) this).anInt3880][((Class286) this).anInt3865][((Class286) this).anInt3876]);
			aByteArrayArrayArray3852 = (new byte[((Class286) this).anInt3880][((Class286) this).anInt3865][((Class286) this).anInt3876]);
			((Class286) this).anIntArrayArrayArray3866 = (new int[((Class286) this).anInt3880][((Class286) this).anInt3865 + 1][1 + ((Class286) this).anInt3876]);
			((Class286) this).aByteArrayArrayArray3857 = (new byte[((Class286) this).anInt3880][1 + ((Class286) this).anInt3865][1 + ((Class286) this).anInt3876]);
			aByteArrayArrayArray3850 = (new byte[((Class286) this).anInt3880][((Class286) this).anInt3865][((Class286) this).anInt3876]);
			aByteArrayArrayArray3864 = (new byte[((Class286) this).anInt3880][((Class286) this).anInt3865][((Class286) this).anInt3876]);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qd.<init>(" + i + ','
					+ i_335_ + ',' + i_336_ + ',' + bool + ','
					+ (class302 != null ? "{...}" : "null") + ','
					+ (class353 != null ? "{...}" : "null") + ')'));
		}
	}
}
