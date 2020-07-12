/* Class156 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class156 {
	private int anInt2045;
	static int anInt2046;
	private Class367[][] aClass367ArrayArray2047;
	static int anInt2048;
	private Class163_Sub3 aClass163_Sub3_2049;
	static int anInt2050;
	private Class12_Sub3 aClass12_Sub3_2051;
	private int anInt2052;
	byte[] aByteArray2053;
	static int anInt2054;
	int anInt2055;
	private int anInt2056;
	static int anInt2057;
	static int anInt2058;
	static int anInt2059;
	static int anInt2060;
	private int anInt2061;

	final void method974(int i, int i_0_, boolean bool,
			Class11_Sub45_Sub1 class11_sub45_sub1) {
		try {
			anInt2060++;
			Class11_Sub45_Sub1_Sub2 class11_sub45_sub1_sub2 = (Class11_Sub45_Sub1_Sub2) class11_sub45_sub1;
			i_0_ += 1 + (((Class11_Sub45_Sub1_Sub2) class11_sub45_sub1_sub2).anInt9873);
			i += (((Class11_Sub45_Sub1_Sub2) class11_sub45_sub1_sub2).anInt9883 + 1);
			int i_1_ = i + i_0_ * ((Class156) this).anInt2055;
			int i_2_ = 0;
			if (bool == false) {
				int i_3_ = (((Class11_Sub45_Sub1_Sub2) class11_sub45_sub1_sub2).anInt9875);
				int i_4_ = (((Class11_Sub45_Sub1_Sub2) class11_sub45_sub1_sub2).anInt9872);
				int i_5_ = -i_4_ + ((Class156) this).anInt2055;
				int i_6_ = 0;
				if (i_0_ <= 0) {
					int i_7_ = -i_0_ + 1;
					i_0_ = 1;
					i_1_ += i_7_ * ((Class156) this).anInt2055;
					i_3_ -= i_7_;
					i_2_ += i_7_ * i_4_;
				}
				if (i_0_ - -i_3_ >= anInt2056) {
					int i_8_ = -anInt2056 + 1 + (i_3_ + i_0_);
					i_3_ -= i_8_;
				}
				if (i <= 0) {
					int i_9_ = 1 - i;
					i_6_ += i_9_;
					i_2_ += i_9_;
					i_1_ += i_9_;
					i = 1;
					i_5_ += i_9_;
					i_4_ -= i_9_;
				}
				if ((i + i_4_ ^ 0xffffffff) <= (((Class156) this).anInt2055 ^ 0xffffffff)) {
					int i_10_ = -((Class156) this).anInt2055 + (i + (i_4_ + 1));
					i_6_ += i_10_;
					i_5_ += i_10_;
					i_4_ -= i_10_;
				}
				if ((i_4_ ^ 0xffffffff) < -1 && i_3_ > 0) {
					Class77.method530(
							i_5_,
							i_1_,
							i_2_,
							-24147,
							((Class156) this).aByteArray2053,
							i_3_,
							((Class11_Sub45_Sub1_Sub2) class11_sub45_sub1_sub2).aByteArray9881,
							i_4_, i_6_);
					method977(i_0_, i_4_, i, i_3_, -1);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gk.G(" + i + ','
					+ i_0_ + ',' + bool + ','
					+ (class11_sub45_sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method975(boolean bool, boolean[][] bools, int i, byte i_11_,
			int i_12_, int i_13_) {
		try {
			aClass163_Sub3_2049.method3267(false, -25994);
			anInt2050++;
			aClass163_Sub3_2049.method3250((byte) 87, false);
			int i_14_ = -41 % ((i_11_ + 5) / 59);
			aClass163_Sub3_2049.method3291(-65, -2);
			aClass163_Sub3_2049.method3260(1, (byte) 17);
			aClass163_Sub3_2049.method3283(1, 1);
			float f = 1.0F / (float) (128 * (((Class163_Sub3) aClass163_Sub3_2049).anInt8275));
			if (!bool) {
				for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > (anInt2061 ^ 0xffffffff); i_15_++) {
					int i_16_ = i_15_ << anInt2045;
					int i_17_ = i_15_ + 1 << anInt2045;
					for (int i_18_ = 0; anInt2052 > i_18_; i_18_++) {
						int i_19_ = 0;
						int i_20_ = i_18_ << anInt2045;
						int i_21_ = i_18_ + 1 << anInt2045;
						Class11_Sub20_Sub2 class11_sub20_sub2 = (((Class163_Sub3) aClass163_Sub3_2049).aClass11_Sub20_Sub2_8406);
						((Stream) class11_sub20_sub2).position = 0;
						for (int i_22_ = i_16_; i_22_ < i_17_; i_22_++) {
							if (-i_12_ <= i_22_ - i && -i + i_22_ <= i_12_) {
								int i_23_ = i_20_
										+ i_22_
										* (((Class12) aClass12_Sub3_2051).anInt103);
								for (int i_24_ = i_20_; i_21_ > i_24_; i_24_++) {
									if (-i_12_ <= -i_13_ + i_24_
											&& ((i_24_ + -i_13_ ^ 0xffffffff) >= (i_12_ ^ 0xffffffff))
											&& (bools[i_12_ + i_24_ - i_13_][i_22_
													- (i + -i_12_)])) {
										short[] is = (((Class12_Sub3) aClass12_Sub3_2051).aShortArrayArray6458[i_23_]);
										if (is != null) {
											if (((Class163_Sub3) aClass163_Sub3_2049).aBool8348) {
												for (int i_25_ = 0; i_25_ < is.length; i_25_++) {
													class11_sub20_sub2
															.writeShort(
																	-123,
																	is[i_25_] & 0xffff);
													i_19_++;
												}
											} else {
												for (int i_26_ = 0; ((is.length ^ 0xffffffff) < (i_26_ ^ 0xffffffff)); i_26_++) {
													i_19_++;
													class11_sub20_sub2
															.method2539(
																	0xffff & is[i_26_],
																	-1682769048);
												}
											}
										}
									}
									i_23_++;
								}
							}
						}
						if (i_19_ > 0) {
							OpenGL.glMatrixMode(5890);
							OpenGL.glLoadIdentity();
							OpenGL.glScalef(f, f, 1.0F);
							OpenGL.glTranslatef((float) -i_18_ / f,
									(float) -i_15_ / f, 1.0F);
							OpenGL.glMatrixMode(5888);
							aClass367ArrayArray2047[i_18_][i_15_].method2170(
									i_19_, (byte) -45, 5123,
									((Stream) class11_sub20_sub2).buffer);
						}
					}
				}
			} else {
				for (int i_27_ = 0; i_27_ < anInt2061; i_27_++) {
					int i_28_ = i_27_ << anInt2045;
					int i_29_ = 1 + i_27_ << anInt2045;
					for (int i_30_ = 0; anInt2052 > i_30_; i_30_++) {
						int i_31_ = i_30_ << anInt2045;
						int i_32_ = i_30_ + 1 << anInt2045;
						while_49_: for (int i_33_ = i_31_; (i_33_ ^ 0xffffffff) > (i_32_ ^ 0xffffffff); i_33_++) {
							if ((-i_12_ ^ 0xffffffff) >= (-i_13_ + i_33_ ^ 0xffffffff)
									&& i_12_ >= i_33_ - i_13_) {
								for (int i_34_ = i_28_; i_34_ < i_29_; i_34_++) {
									if (((i_34_ - i ^ 0xffffffff) <= (-i_12_ ^ 0xffffffff))
											&& ((-i + i_34_ ^ 0xffffffff) >= (i_12_ ^ 0xffffffff))
											&& (bools[i_33_ + -i_13_ + i_12_][-i
													+ i_34_ - -i_12_])) {
										OpenGL.glMatrixMode(5890);
										OpenGL.glLoadIdentity();
										OpenGL.glScalef(f, f, 1.0F);
										OpenGL.glTranslatef((float) -i_30_ / f,
												(float) -i_27_ / f, 1.0F);
										OpenGL.glMatrixMode(5888);
										aClass367ArrayArray2047[i_30_][i_27_]
												.method2168(128);
										break while_49_;
									}
								}
							}
						}
					}
				}
			}
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gk.H(" + bool + ','
					+ (bools != null ? "{...}" : "null") + ',' + i + ','
					+ i_11_ + ',' + i_12_ + ',' + i_13_ + ')'));
		}
	}

	static final Class254_Sub2_Sub1 method976(int i, Stream stream) {
		try {
			anInt2057++;
			Class254_Sub2 class254_sub2 = Class153.method962(-102, stream);
			int i_35_ = stream.method2508((byte) 97);
			if (i > -31)
				return null;
			return (new Class254_Sub2_Sub1(
					((Class254) class254_sub2).aClass118_3483,
					((Class254) class254_sub2).aClass150_3492,
					((Class254) class254_sub2).anInt3487,
					((Class254) class254_sub2).anInt3491,
					((Class254) class254_sub2).anInt3489,
					((Class254) class254_sub2).anInt3490,
					((Class254) class254_sub2).anInt3481,
					((Class254) class254_sub2).anInt3480,
					((Class254) class254_sub2).anInt3488,
					((Class254_Sub2) class254_sub2).anInt6991,
					((Class254_Sub2) class254_sub2).anInt6984,
					((Class254_Sub2) class254_sub2).anInt6988,
					((Class254_Sub2) class254_sub2).anInt6993,
					((Class254_Sub2) class254_sub2).anInt6985,
					((Class254_Sub2) class254_sub2).anInt6986, i_35_));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gk.A(" + i + ','
					+ (stream != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method977(int i, int i_36_, int i_37_, int i_38_,
			int i_39_) {
		try {
			anInt2058++;
			if (aClass367ArrayArray2047 != null) {
				int i_40_ = -1 + i_37_ >> 7;
				int i_41_ = i_39_ + i_37_ + (i_36_ - 1) >> 7;
				int i_42_ = -1 + i >> 7;
				int i_43_ = -1 + i - (-i_38_ + 1) >> 7;
				for (int i_44_ = i_40_; i_41_ >= i_44_; i_44_++) {
					Class367[] class367s = aClass367ArrayArray2047[i_44_];
					for (int i_45_ = i_42_; i_43_ >= i_45_; i_45_++)
						((Class367) class367s[i_45_]).aBool4819 = true;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gk.F(" + i + ','
					+ i_36_ + ',' + i_37_ + ',' + i_38_ + ',' + i_39_ + ')'));
		}
	}

	final void method978(int i) {
		try {
			aClass367ArrayArray2047 = new Class367[anInt2052][anInt2061];
			anInt2054++;
			int i_46_ = -125 % ((i - 42) / 56);
			for (int i_47_ = 0; (i_47_ ^ 0xffffffff) > (anInt2061 ^ 0xffffffff); i_47_++) {
				for (int i_48_ = 0; (anInt2052 ^ 0xffffffff) < (i_48_ ^ 0xffffffff); i_48_++)
					aClass367ArrayArray2047[i_48_][i_47_] = new Class367(
							aClass163_Sub3_2049, this, aClass12_Sub3_2051,
							i_48_, i_47_, anInt2045, 1 + 128 * i_48_,
							1 + i_47_ * 128);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gk.E(" + i + ')');
		}
	}

	static final boolean method979(int i, int i_49_, int i_50_) {
		try {
			if (i_49_ != 0)
				return true;
			anInt2048++;
			if ((0x400 & i_50_) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gk.D(" + i + ','
					+ i_49_ + ',' + i_50_ + ')'));
		}
	}

	final boolean method980(int i, Class11_Sub45_Sub1 class11_sub45_sub1,
			int i_51_, byte i_52_) {
		try {
			anInt2046++;
			Class11_Sub45_Sub1_Sub2 class11_sub45_sub1_sub2 = (Class11_Sub45_Sub1_Sub2) class11_sub45_sub1;
			i_51_ += 1 + (((Class11_Sub45_Sub1_Sub2) class11_sub45_sub1_sub2).anInt9883);
			i += (((Class11_Sub45_Sub1_Sub2) class11_sub45_sub1_sub2).anInt9873 + 1);
			int i_53_ = i * ((Class156) this).anInt2055 + i_51_;
			int i_54_ = (((Class11_Sub45_Sub1_Sub2) class11_sub45_sub1_sub2).anInt9875);
			int i_55_ = (((Class11_Sub45_Sub1_Sub2) class11_sub45_sub1_sub2).anInt9872);
			int i_56_ = -i_55_ + ((Class156) this).anInt2055;
			if (i <= 0) {
				int i_57_ = -i + 1;
				i_54_ -= i_57_;
				i_53_ += ((Class156) this).anInt2055 * i_57_;
				i = 1;
			}
			if (i_52_ < 75)
				return true;
			if ((anInt2056 ^ 0xffffffff) >= (i - -i_54_ ^ 0xffffffff)) {
				int i_58_ = 1 + i + i_54_ + -anInt2056;
				i_54_ -= i_58_;
			}
			if (i_51_ <= 0) {
				int i_59_ = -i_51_ + 1;
				i_51_ = 1;
				i_55_ -= i_59_;
				i_53_ += i_59_;
				i_56_ += i_59_;
			}
			if (((Class156) this).anInt2055 <= i_51_ + i_55_) {
				int i_60_ = 1 + i_55_ + (i_51_ + -((Class156) this).anInt2055);
				i_56_ += i_60_;
				i_55_ -= i_60_;
			}
			if (i_55_ <= 0 || i_54_ <= 0)
				return false;
			int i_61_ = 8;
			i_56_ += (i_61_ - 1) * ((Class156) this).anInt2055;
			return Class45.method396((byte) -53, i_56_,
					((Class156) this).aByteArray2053, i_53_, i_54_, i_61_,
					i_55_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gk.C(" + i + ','
					+ (class11_sub45_sub1 != null ? "{...}" : "null") + ','
					+ i_51_ + ',' + i_52_ + ')'));
		}
	}

	final void method981(int i, int i_62_, int i_63_,
			Class11_Sub45_Sub1 class11_sub45_sub1) {
		try {
			anInt2059++;
			Class11_Sub45_Sub1_Sub2 class11_sub45_sub1_sub2 = (Class11_Sub45_Sub1_Sub2) class11_sub45_sub1;
			i_63_ += 1 + (((Class11_Sub45_Sub1_Sub2) class11_sub45_sub1_sub2).anInt9873);
			i_62_ += 1 + (((Class11_Sub45_Sub1_Sub2) class11_sub45_sub1_sub2).anInt9883);
			int i_64_ = i_62_ - -(i_63_ * ((Class156) this).anInt2055);
			int i_65_ = 0;
			int i_66_ = (((Class11_Sub45_Sub1_Sub2) class11_sub45_sub1_sub2).anInt9875);
			int i_67_ = (((Class11_Sub45_Sub1_Sub2) class11_sub45_sub1_sub2).anInt9872);
			int i_68_ = -i_67_ + ((Class156) this).anInt2055;
			int i_69_ = 0;
			if ((i_63_ ^ 0xffffffff) >= -1) {
				int i_70_ = 1 - i_63_;
				i_64_ += ((Class156) this).anInt2055 * i_70_;
				i_66_ -= i_70_;
				i_63_ = 1;
				i_65_ += i_67_ * i_70_;
			}
			if ((i_66_ + i_63_ ^ 0xffffffff) <= (anInt2056 ^ 0xffffffff)) {
				int i_71_ = i_66_ + (i_63_ + 1 + -anInt2056);
				i_66_ -= i_71_;
			}
			if (i <= (i_62_ ^ 0xffffffff)) {
				int i_72_ = -i_62_ + 1;
				i_67_ -= i_72_;
				i_62_ = 1;
				i_69_ += i_72_;
				i_65_ += i_72_;
				i_64_ += i_72_;
				i_68_ += i_72_;
			}
			if ((i_62_ - -i_67_ ^ 0xffffffff) <= (((Class156) this).anInt2055 ^ 0xffffffff)) {
				int i_73_ = i_67_ + (i_62_ + 1 + -((Class156) this).anInt2055);
				i_68_ += i_73_;
				i_67_ -= i_73_;
				i_69_ += i_73_;
			}
			if (i_67_ > 0 && (i_66_ ^ 0xffffffff) < -1) {
				Class134.method868(
						((Class156) this).aByteArray2053,
						i_65_,
						i_69_,
						1,
						i_64_,
						i_66_,
						i_68_,
						i_67_,
						((Class11_Sub45_Sub1_Sub2) class11_sub45_sub1_sub2).aByteArray9881);
				method977(i_63_, i_67_, i_62_, i_66_, -1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gk.B(" + i + ','
					+ i_62_ + ',' + i_63_ + ','
					+ (class11_sub45_sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	Class156(Class163_Sub3 class163_sub3, Class12_Sub3 class12_sub3) {
		try {
			aClass12_Sub3_2051 = class12_sub3;
			aClass163_Sub3_2049 = class163_sub3;
			((Class156) this).anInt2055 = 2 + ((((Class12) aClass12_Sub3_2051).anInt93 * ((Class12) aClass12_Sub3_2051).anInt103) >> ((Class163_Sub3) aClass163_Sub3_2049).anInt8269);
			anInt2056 = ((((Class12) aClass12_Sub3_2051).anInt98 * ((Class12) aClass12_Sub3_2051).anInt93) >> ((Class163_Sub3) aClass163_Sub3_2049).anInt8269) + 2;
			anInt2045 = (7 + ((Class163_Sub3) aClass163_Sub3_2049).anInt8269 + -((Class12) aClass12_Sub3_2051).anInt97);
			((Class156) this).aByteArray2053 = new byte[anInt2056
					* ((Class156) this).anInt2055];
			anInt2052 = ((Class12) aClass12_Sub3_2051).anInt103 >> anInt2045;
			anInt2061 = ((Class12) aClass12_Sub3_2051).anInt98 >> anInt2045;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gk.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ','
					+ (class12_sub3 != null ? "{...}" : "null") + ')'));
		}
	}
}
