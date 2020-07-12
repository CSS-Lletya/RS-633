/* Class226 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

final class Class226 {
	private int anInt3104;
	static Class376_Sub10[] aClass376_Sub10Array3105;
	byte[] aByteArray3106;
	static int anInt3107;
	static int anInt3108;
	static int anInt3109;
	static int anInt3110;
	private int anInt3111;
	static int anInt3112;
	static boolean aBool3113;
	private int anInt3114;
	private Class278[][] aClass278ArrayArray3115;
	static int anInt3116;
	private Class163_Sub2 aClass163_Sub2_3117;
	private Class12_Sub1 aClass12_Sub1_3118;
	private int anInt3119;
	int anInt3120;
	static int anInt3121;

	static final boolean method1453(int i, int i_0_, int i_1_) {
		try {
			anInt3108++;
			if (i != -6794)
				return true;
			if ((0x800 & i_0_ ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lr.D(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	final boolean method1454(Class11_Sub45_Sub1 class11_sub45_sub1, int i,
			int i_2_, int i_3_) {
		try {
			anInt3121++;
			Class11_Sub45_Sub1_Sub1 class11_sub45_sub1_sub1 = (Class11_Sub45_Sub1_Sub1) class11_sub45_sub1;
			i += 1 + (((Class11_Sub45_Sub1_Sub1) class11_sub45_sub1_sub1).anInt9834);
			i_2_ += 1 + (((Class11_Sub45_Sub1_Sub1) class11_sub45_sub1_sub1).anInt9823);
			int i_4_ = i_2_ * ((Class226) this).anInt3120 + i;
			if (i_3_ != -7219)
				method1453(-85, -102, -100);
			int i_5_ = (((Class11_Sub45_Sub1_Sub1) class11_sub45_sub1_sub1).anInt9829);
			int i_6_ = (((Class11_Sub45_Sub1_Sub1) class11_sub45_sub1_sub1).anInt9827);
			int i_7_ = -i_6_ + ((Class226) this).anInt3120;
			if (i_2_ <= 0) {
				int i_8_ = 1 - i_2_;
				i_2_ = 1;
				i_5_ -= i_8_;
				i_4_ += i_8_ * ((Class226) this).anInt3120;
			}
			if ((i_5_ + i_2_ ^ 0xffffffff) <= (anInt3114 ^ 0xffffffff)) {
				int i_9_ = -anInt3114 + (i_2_ + i_5_) + 1;
				i_5_ -= i_9_;
			}
			if (i <= 0) {
				int i_10_ = -i + 1;
				i_4_ += i_10_;
				i_7_ += i_10_;
				i_6_ -= i_10_;
				i = 1;
			}
			if (((Class226) this).anInt3120 <= i + i_6_) {
				int i_11_ = -((Class226) this).anInt3120 + (1 + i + i_6_);
				i_7_ += i_11_;
				i_6_ -= i_11_;
			}
			if ((i_6_ ^ 0xffffffff) >= -1 || i_5_ <= 0)
				return false;
			int i_12_ = 8;
			i_7_ += (i_12_ - 1) * ((Class226) this).anInt3120;
			return Class319.method1941(i_6_, i_5_, false, i_7_,
					((Class226) this).aByteArray3106, i_4_, i_12_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lr.C("
					+ (class11_sub45_sub1 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	final void method1455(byte i) {
		try {
			anInt3107++;
			aClass278ArrayArray3115 = new Class278[anInt3111][anInt3119];
			if (i >= -112)
				method1453(77, 37, -97);
			for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > (anInt3119 ^ 0xffffffff); i_13_++) {
				for (int i_14_ = 0; (anInt3111 ^ 0xffffffff) < (i_14_ ^ 0xffffffff); i_14_++) {
					aClass278ArrayArray3115[i_14_][i_13_] = new Class278(
							aClass163_Sub2_3117, this, aClass12_Sub1_3118,
							i_14_, i_13_, anInt3104, 1 + i_14_ * 128,
							1 + i_13_ * 128);
					if ((((Class278) aClass278ArrayArray3115[i_14_][i_13_]).anInt3749) == 0)
						aClass278ArrayArray3115[i_14_][i_13_] = null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lr.F(" + i + ')');
		}
	}

	public static void method1456(byte i) {
		try {
			aClass376_Sub10Array3105 = null;
			int i_15_ = 80 % ((i + 77) / 45);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lr.E(" + i + ')');
		}
	}

	final void method1457(int i, int i_16_, byte i_17_, boolean bool,
			boolean[][] bools, int i_18_) {
		try {
			if (i_17_ <= 33)
				method1459(null, 27, -91, -34);
			aClass163_Sub2_3117.method3068(false, -22042);
			anInt3110++;
			aClass163_Sub2_3117.method3039(false, (byte) -51);
			aClass163_Sub2_3117.method2994(-1, 1);
			aClass163_Sub2_3117.method3037((byte) 108, 1);
			aClass163_Sub2_3117.method2998(false, -2, 32242, false);
			float f = 1.0F / (float) (128 * (((Class163_Sub2) aClass163_Sub2_3117).anInt7603));
			if (bool) {
				for (int i_19_ = 0; anInt3119 > i_19_; i_19_++) {
					int i_20_ = i_19_ << anInt3104;
					int i_21_ = 1 + i_19_ << anInt3104;
					for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > (anInt3111 ^ 0xffffffff); i_22_++) {
						if (aClass278ArrayArray3115[i_22_][i_19_] != null) {
							int i_23_ = i_22_ << anInt3104;
							int i_24_ = 1 + i_22_ << anInt3104;
							while_54_: for (int i_25_ = i_23_; (i_24_ ^ 0xffffffff) < (i_25_ ^ 0xffffffff); i_25_++) {
								if (-i_16_ <= i_25_ - i_18_
										&& -i_18_ + i_25_ <= i_16_) {
									for (int i_26_ = i_20_; i_21_ > i_26_; i_26_++) {
										if (-i + i_26_ >= -i_16_
												&& ((i_16_ ^ 0xffffffff) <= (-i
														+ i_26_ ^ 0xffffffff))
												&& (bools[i_25_ - i_18_
														- -i_16_][i_26_ - i
														+ i_16_])) {
											Class33_Sub2 class33_sub2 = aClass163_Sub2_3117
													.method2975(-57);
											class33_sub2.method2759(f, 0, f,
													1.0F);
											class33_sub2.method299(-i_22_,
													-i_19_, 0);
											aClass163_Sub2_3117
													.method2989(
															(byte) 95,
															(Class11_Sub2_Sub2.aClass240_8463));
											aClass278ArrayArray3115[i_22_][i_19_]
													.method1719(0);
											break while_54_;
										}
									}
								}
							}
						}
					}
				}
			} else {
				for (int i_27_ = 0; anInt3119 > i_27_; i_27_++) {
					int i_28_ = i_27_ << anInt3104;
					int i_29_ = 1 + i_27_ << anInt3104;
					for (int i_30_ = 0; (anInt3111 ^ 0xffffffff) < (i_30_ ^ 0xffffffff); i_30_++) {
						Class278 class278 = aClass278ArrayArray3115[i_30_][i_27_];
						if (class278 != null) {
							Interface27 interface27 = (aClass163_Sub2_3117
									.method3052(-14589,
											((Class278) class278).anInt3749 * 3));
							Buffer buffer = interface27.method12(27599, true);
							if (buffer != null) {
								jaclib.memory.Stream stream = aClass163_Sub2_3117
										.method3098(buffer, true);
								int i_31_ = 0;
								int i_32_ = i_30_ << anInt3104;
								int i_33_ = 1 + i_30_ << anInt3104;
								for (int i_34_ = i_28_; i_34_ < i_29_; i_34_++) {
									if ((-i_16_ ^ 0xffffffff) >= (i_34_ + -i ^ 0xffffffff)
											&& i_34_ - i <= i_16_) {
										int i_35_ = (i_32_ + i_34_
												* (((Class12) aClass12_Sub1_3118).anInt103));
										for (int i_36_ = i_32_; ((i_33_ ^ 0xffffffff) < (i_36_ ^ 0xffffffff)); i_36_++) {
											if (((i_36_ + -i_18_ ^ 0xffffffff) <= (-i_16_ ^ 0xffffffff))
													&& i_36_ + -i_18_ <= i_16_
													&& (bools[i_36_
															- (i_18_ + -i_16_)][-i
															+ (i_34_ - -i_16_)])) {
												short[] is = (((Class12_Sub1) aClass12_Sub1_3118).aShortArrayArray5125[i_35_]);
												if (is != null) {
													if (jaclib.memory.Stream
															.method353()) {
														for (int i_37_ = 0; ((i_37_ ^ 0xffffffff) > (is.length ^ 0xffffffff)); i_37_++) {
															stream.method345(is[i_37_] & 0xffff);
															i_31_++;
														}
													} else {
														for (int i_38_ = 0; ((is.length ^ 0xffffffff) < (i_38_ ^ 0xffffffff)); i_38_++) {
															stream.method346(is[i_38_] & 0xffff);
															i_31_++;
														}
													}
												}
											}
											i_35_++;
										}
									}
								}
								stream.method347();
								if (interface27.method40((byte) 118)
										&& i_31_ > 0) {
									Class33_Sub2 class33_sub2 = aClass163_Sub2_3117
											.method2975(127);
									class33_sub2.method2759(f, 0, f, 1.0F);
									class33_sub2.method299(-i_30_, -i_27_, 0);
									aClass163_Sub2_3117.method2989((byte) 95,
											Class11_Sub2_Sub2.aClass240_8463);
									class278.method1717(20369, interface27,
											i_31_ / 3);
								}
							}
						}
					}
				}
			}
			aClass163_Sub2_3117.method3048((byte) -103);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lr.G(" + i + ','
					+ i_16_ + ',' + i_17_ + ',' + bool + ','
					+ (bools != null ? "{...}" : "null") + ',' + i_18_ + ')'));
		}
	}

	final void method1458(int i, Class11_Sub45_Sub1 class11_sub45_sub1,
			byte i_39_, int i_40_) {
		try {
			anInt3109++;
			Class11_Sub45_Sub1_Sub1 class11_sub45_sub1_sub1 = (Class11_Sub45_Sub1_Sub1) class11_sub45_sub1;
			i_40_ += 1 + (((Class11_Sub45_Sub1_Sub1) class11_sub45_sub1_sub1).anInt9834);
			i += (((Class11_Sub45_Sub1_Sub1) class11_sub45_sub1_sub1).anInt9823 + 1);
			int i_41_ = -91 / ((37 - i_39_) / 58);
			int i_42_ = i * ((Class226) this).anInt3120 + i_40_;
			int i_43_ = 0;
			int i_44_ = (((Class11_Sub45_Sub1_Sub1) class11_sub45_sub1_sub1).anInt9829);
			int i_45_ = (((Class11_Sub45_Sub1_Sub1) class11_sub45_sub1_sub1).anInt9827);
			int i_46_ = ((Class226) this).anInt3120 + -i_45_;
			int i_47_ = 0;
			if (i <= 0) {
				int i_48_ = 1 - i;
				i_43_ += i_45_ * i_48_;
				i = 1;
				i_42_ += ((Class226) this).anInt3120 * i_48_;
				i_44_ -= i_48_;
			}
			if (anInt3114 <= i_44_ + i) {
				int i_49_ = i + i_44_ + (1 - anInt3114);
				i_44_ -= i_49_;
			}
			if (i_40_ <= 0) {
				int i_50_ = 1 + -i_40_;
				i_45_ -= i_50_;
				i_42_ += i_50_;
				i_43_ += i_50_;
				i_40_ = 1;
				i_47_ += i_50_;
				i_46_ += i_50_;
			}
			if (i_40_ + i_45_ >= ((Class226) this).anInt3120) {
				int i_51_ = -((Class226) this).anInt3120
						+ (i_45_ + (i_40_ + 1));
				i_46_ += i_51_;
				i_45_ -= i_51_;
				i_47_ += i_51_;
			}
			if (i_45_ > 0 && (i_44_ ^ 0xffffffff) < -1) {
				Class27.method226(
						-1,
						((Class226) this).aByteArray3106,
						i_43_,
						i_45_,
						i_47_,
						((Class11_Sub45_Sub1_Sub1) class11_sub45_sub1_sub1).aByteArray9825,
						i_42_, i_44_, i_46_);
				method1460(i_44_, i_45_, i, -1, i_40_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lr.B(" + i + ','
					+ (class11_sub45_sub1 != null ? "{...}" : "null") + ','
					+ i_39_ + ',' + i_40_ + ')'));
		}
	}

	Class226(Class163_Sub2 class163_sub2, Class12_Sub1 class12_sub1) {
		try {
			aClass12_Sub1_3118 = class12_sub1;
			aClass163_Sub2_3117 = class163_sub2;
			((Class226) this).anInt3120 = ((((Class12) aClass12_Sub1_3118).anInt93 * ((Class12) aClass12_Sub1_3118).anInt103) >> ((Class163_Sub2) aClass163_Sub2_3117).anInt7634) + 2;
			anInt3114 = 2 + ((((Class12) aClass12_Sub1_3118).anInt98 * ((Class12) aClass12_Sub1_3118).anInt93) >> ((Class163_Sub2) aClass163_Sub2_3117).anInt7634);
			anInt3104 = (-((Class12) aClass12_Sub1_3118).anInt97 + (7 + ((Class163_Sub2) aClass163_Sub2_3117).anInt7634));
			((Class226) this).aByteArray3106 = new byte[anInt3114
					* ((Class226) this).anInt3120];
			anInt3111 = ((Class12) aClass12_Sub1_3118).anInt103 >> anInt3104;
			anInt3119 = ((Class12) aClass12_Sub1_3118).anInt98 >> anInt3104;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lr.<init>("
					+ (class163_sub2 != null ? "{...}" : "null") + ','
					+ (class12_sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1459(Class11_Sub45_Sub1 class11_sub45_sub1, int i,
			int i_52_, int i_53_) {
		try {
			anInt3116++;
			Class11_Sub45_Sub1_Sub1 class11_sub45_sub1_sub1 = (Class11_Sub45_Sub1_Sub1) class11_sub45_sub1;
			i_52_ += (((Class11_Sub45_Sub1_Sub1) class11_sub45_sub1_sub1).anInt9823) + 1;
			i_53_ += (((Class11_Sub45_Sub1_Sub1) class11_sub45_sub1_sub1).anInt9834) + 1;
			int i_54_ = i_53_ - -(i_52_ * ((Class226) this).anInt3120);
			int i_55_ = 0;
			int i_56_ = (((Class11_Sub45_Sub1_Sub1) class11_sub45_sub1_sub1).anInt9829);
			int i_57_ = (((Class11_Sub45_Sub1_Sub1) class11_sub45_sub1_sub1).anInt9827);
			int i_58_ = -i_57_ + ((Class226) this).anInt3120;
			int i_59_ = 0;
			if (i != 2048)
				((Class226) this).anInt3120 = 86;
			if ((i_52_ ^ 0xffffffff) >= -1) {
				int i_60_ = -i_52_ + 1;
				i_55_ += i_60_ * i_57_;
				i_54_ += i_60_ * ((Class226) this).anInt3120;
				i_56_ -= i_60_;
				i_52_ = 1;
			}
			if ((anInt3114 ^ 0xffffffff) >= (i_56_ + i_52_ ^ 0xffffffff)) {
				int i_61_ = i_56_ + (i_52_ + (1 + -anInt3114));
				i_56_ -= i_61_;
			}
			if (i_53_ <= 0) {
				int i_62_ = -i_53_ + 1;
				i_53_ = 1;
				i_57_ -= i_62_;
				i_58_ += i_62_;
				i_55_ += i_62_;
				i_59_ += i_62_;
				i_54_ += i_62_;
			}
			if (i_53_ - -i_57_ >= ((Class226) this).anInt3120) {
				int i_63_ = -((Class226) this).anInt3120 + 1 + i_57_ + i_53_;
				i_59_ += i_63_;
				i_57_ -= i_63_;
				i_58_ += i_63_;
			}
			if (i_57_ > 0 && (i_56_ ^ 0xffffffff) < -1) {
				Class11_Sub2
						.method2264(
								i_58_,
								i_57_,
								i_54_,
								(((Class11_Sub45_Sub1_Sub1) class11_sub45_sub1_sub1).aByteArray9825),
								i_56_, ((Class226) this).aByteArray3106, i_55_,
								i_59_, i ^ ~0x845);
				method1460(i_56_, i_57_, i_52_, i - 2049, i_53_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lr.H("
					+ (class11_sub45_sub1 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_52_ + ',' + i_53_ + ')'));
		}
	}

	private final void method1460(int i, int i_64_, int i_65_, int i_66_,
			int i_67_) {
		try {
			anInt3112++;
			if (aClass278ArrayArray3115 != null) {
				int i_68_ = i_67_ - 1 >> 7;
				int i_69_ = i_64_ - 1 + i_67_ - 1 >> 7;
				int i_70_ = i_65_ - 1 >> 7;
				int i_71_ = i_66_ + i + (i_65_ - 1) >> 7;
				for (int i_72_ = i_68_; (i_72_ ^ 0xffffffff) >= (i_69_ ^ 0xffffffff); i_72_++) {
					Class278[] class278s = aClass278ArrayArray3115[i_72_];
					for (int i_73_ = i_70_; (i_71_ ^ 0xffffffff) <= (i_73_ ^ 0xffffffff); i_73_++) {
						if (class278s[i_73_] != null)
							((Class278) class278s[i_73_]).aBool3761 = true;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lr.A(" + i + ','
					+ i_64_ + ',' + i_65_ + ',' + i_66_ + ',' + i_67_ + ')'));
		}
	}
}
