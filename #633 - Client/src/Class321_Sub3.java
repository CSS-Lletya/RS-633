/* Class321_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

class Class321_Sub3 extends Class321 {
	static int anInt7015;
	int anInt7016;
	static Class217 aClass217_7017;
	static int anInt7018;
	static int anInt7019;
	static int anInt7020;
	private int anInt7021 = -1;
	int anInt7022;
	static int anInt7023;
	static int[][][] anIntArrayArrayArray7024;
	static int anInt7025;
	static int anInt7026;
	static int anInt7027;
	static int anInt7028;
	static int anInt7029;
	private int anInt7030 = -1;

	final void method2849(int i, int i_0_, int i_1_, int i_2_) {
		do {
			try {
				OpenGL.glFramebufferTexture2DEXT(i_0_, i,
						((Class321) this).anInt4302,
						((Class321) this).anInt4283, i_2_);
				anInt7019++;
				anInt7030 = i_0_;
				anInt7021 = i;
				if (i_1_ == -1)
					break;
				method2849(12, -106, -93, 21);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("mfa.AA(" + i
						+ ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
			}
			break;
		} while (false);
	}

	Class321_Sub3(Class163_Sub3 class163_sub3, int i, int i_3_, int i_4_,
			int i_5_) {
		super(class163_sub3, i, i_3_, i_5_ * i_4_, false);
		try {
			((Class321_Sub3) this).anInt7016 = i_4_;
			((Class321_Sub3) this).anInt7022 = i_5_;
			((Class321) this).aClass163_Sub3_4282.method3295(this, 55);
			OpenGL.glTexImage2Dub(((Class321) this).anInt4302, 0,
					((Class321) this).anInt4297, i_4_, i_5_, 0,
					Class6.method88(true, ((Class321) this).anInt4297), 5121,
					null, 0);
			this.method1963(true, false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mfa.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	final void method2850(int i, int i_6_, int[] is, boolean bool, int i_7_,
			int i_8_, int i_9_, int i_10_, int i_11_) {
		do {
			try {
				anInt7018++;
				if (i_6_ == 0)
					i_6_ = i_7_;
				if (bool) {
					int[] is_12_ = new int[i_11_ * i_7_];
					for (int i_13_ = 0; i_13_ < i_11_; i_13_++) {
						int i_14_ = i_7_ * i_13_;
						int i_15_ = i_10_ + i_6_ * (-1 + -i_13_ + i_11_);
						for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff); i_16_++)
							is_12_[i_14_++] = is[i_15_++];
					}
					is = is_12_;
				}
				((Class321) this).aClass163_Sub3_4282.method3295(this, 42);
				if ((i_7_ ^ 0xffffffff) != (i_6_ ^ 0xffffffff))
					OpenGL.glPixelStorei(3314, i_6_);
				if (i_9_ > -39)
					anInt7021 = 43;
				OpenGL.glTexSubImage2Di(
						((Class321) this).anInt4302,
						0,
						i_8_,
						i,
						i_7_,
						i_11_,
						32993,
						((Class163_Sub3) (((Class321) this).aClass163_Sub3_4282)).anInt8332,
						is, i_10_);
				if (i_6_ == i_7_)
					break;
				OpenGL.glPixelStorei(3314, 0);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("mfa.DA(" + i
						+ ',' + i_6_ + ',' + (is != null ? "{...}" : "null")
						+ ',' + bool + ',' + i_7_ + ',' + i_8_ + ',' + i_9_
						+ ',' + i_10_ + ',' + i_11_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method2851(String string, int i, byte i_17_, boolean bool) {
		try {
			anInt7028++;
			Class304.method1870(-19310);
			Class97.method658(-26159);
			Class335_Sub2.method2822(110);
			Class336.method2017(i, (byte) -21, bool, string);
			Class376_Sub7_Sub5_Sub2.method3908((byte) 38);
			Class94.method631(255, Class321_Sub2.aClass163_6648);
			Class55.method449(Class321_Sub2.aClass163_6648, (byte) 124);
			Class282.method1743(Class321_Sub2.aClass163_6648, false,
					Class108_Sub7.aClass146_5636);
			if (i_17_ >= -23)
				method2851(null, -12, (byte) 26, false);
			Class14.method146((byte) -126);
			Class376_Sub7_Sub3_Sub2.method3926(
					Class376_Sub7_Sub1_Sub1.aClass253Array10081, -122);
			Class307.method1879(-101);
			Class108_Sub13.method2653((byte) -109);
			if ((Class285.anInt3846 ^ 0xffffffff) == -4)
				Class83.method575(false, 4);
			else if ((Class285.anInt3846 ^ 0xffffffff) == -8)
				Class83.method575(false, 8);
			else if (Class285.anInt3846 == 10)
				Class83.method575(false, 11);
			else if (Class285.anInt3846 == 1 || Class285.anInt3846 == 2)
				Class143.method901(0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mfa.T("
					+ (string != null ? "{...}" : "null") + ',' + i + ','
					+ i_17_ + ',' + bool + ')'));
		}
	}

	static final void method2852(boolean bool, int i, int i_18_, int i_19_) {
		try {
			anInt7025++;
			if (i_19_ < 52)
				aClass217_7017 = null;
			if (i < 8000 || i > 48000)
				throw new IllegalArgumentException();
			Class236_Sub1.aBool6092 = bool;
			Class119.anInt1610 = i;
			Class218.anInt3010 = i_18_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mfa.BA(" + bool + ','
					+ i + ',' + i_18_ + ',' + i_19_ + ')'));
		}
	}

	Class321_Sub3(Class163_Sub3 class163_sub3, int i, int i_20_, int i_21_,
			int i_22_, int i_23_) {
		super(class163_sub3, i, 6407, i_22_ * i_23_, false);
		try {
			((Class321_Sub3) this).anInt7016 = i_22_;
			((Class321_Sub3) this).anInt7022 = i_23_;
			int i_24_ = ((((Class163_Sub3) ((Class321) this).aClass163_Sub3_4282).anInt8141) - (i_21_ + i_23_));
			((Class321) this).aClass163_Sub3_4282.method3295(this, 100);
			OpenGL.glCopyTexImage2D(((Class321) this).anInt4302, 0,
					((Class321) this).anInt4297, i_20_, i_24_, i_22_, i_23_, 0);
			this.method1963(true, false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("mfa.<init>(" + (class163_sub3 != null ? "{...}" : "null")
							+ ',' + i + ',' + i_20_ + ',' + i_21_ + ',' + i_22_
							+ ',' + i_23_ + ')'));
		}
	}

	Class321_Sub3(Class163_Sub3 class163_sub3, int i, int i_25_, int i_26_,
			int i_27_, boolean bool, byte[] is, int i_28_, boolean bool_29_) {
		super(class163_sub3, i, i_25_, i_27_ * i_26_, bool);
		try {
			((Class321_Sub3) this).anInt7016 = i_26_;
			((Class321_Sub3) this).anInt7022 = i_27_;
			if (bool_29_) {
				byte[] is_30_ = new byte[is.length];
				for (int i_31_ = 0; (i_31_ ^ 0xffffffff) > (i_27_ ^ 0xffffffff); i_31_++) {
					int i_32_ = i_26_ * i_31_;
					int i_33_ = i_26_ * (-1 + i_27_ + -i_31_);
					for (int i_34_ = 0; i_34_ < i_26_; i_34_++)
						is_30_[i_32_++] = is[i_33_++];
				}
				is = is_30_;
			}
			((Class321) this).aClass163_Sub3_4282.method3295(this, 100);
			OpenGL.glPixelStorei(3317, 1);
			if (!bool || ((Class321) this).anInt4302 == 34037) {
				OpenGL.glTexImage2Dub(((Class321) this).anInt4302, 0,
						((Class321) this).anInt4297,
						((Class321_Sub3) this).anInt7016,
						((Class321_Sub3) this).anInt7022, 0, i_28_, 5121, is, 0);
				this.method1954(10240, false);
			} else {
				Class91_Sub3_Sub1.method3649(i_27_, i, i_26_, 79, i_25_, i_28_,
						is);
				this.method1954(10240, true);
			}
			OpenGL.glPixelStorei(3317, 4);
			this.method1963(true, false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mfa.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_25_ + ',' + i_26_ + ',' + i_27_ + ',' + bool
					+ ',' + (is != null ? "{...}" : "null") + ',' + i_28_ + ','
					+ bool_29_ + ')'));
		}
	}

	public final void method8(int i) {
		try {
			if (i < -38) {
				anInt7015++;
				OpenGL.glFramebufferTexture2DEXT(anInt7030, anInt7021,
						((Class321) this).anInt4302, 0, 0);
				anInt7021 = -1;
				anInt7030 = -1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mfa.S(" + i + ')');
		}
	}

	Class321_Sub3(Class163_Sub3 class163_sub3, int i, int i_35_, int i_36_,
			int i_37_, boolean bool, int[] is, int i_38_, int i_39_,
			boolean bool_40_) {
		super(class163_sub3, i, i_35_, i_36_ * i_37_, bool);
		try {
			((Class321_Sub3) this).anInt7022 = i_37_;
			((Class321_Sub3) this).anInt7016 = i_36_;
			if (bool_40_) {
				int[] is_41_ = new int[is.length];
				for (int i_42_ = 0; (i_42_ ^ 0xffffffff) > (i_37_ ^ 0xffffffff); i_42_++) {
					int i_43_ = i_42_ * i_36_;
					int i_44_ = (-1 + -i_42_ + i_37_) * i_36_;
					for (int i_45_ = 0; (i_36_ ^ 0xffffffff) < (i_45_ ^ 0xffffffff); i_45_++)
						is_41_[i_43_++] = is[i_44_++];
				}
				is = is_41_;
			}
			((Class321) this).aClass163_Sub3_4282.method3295(this, 91);
			if (((Class321) this).anInt4302 == 34037 || !bool || i_38_ != 0
					|| (i_39_ ^ 0xffffffff) != -1) {
				OpenGL.glPixelStorei(3314, i_38_);
				OpenGL.glTexImage2Di(
						((Class321) this).anInt4302,
						0,
						((Class321) this).anInt4297,
						((Class321_Sub3) this).anInt7016,
						((Class321_Sub3) this).anInt7022,
						0,
						32993,
						(((Class163_Sub3) ((Class321) this).aClass163_Sub3_4282).anInt8332),
						is, i_39_ * 4);
				OpenGL.glPixelStorei(3314, 0);
				this.method1954(10240, false);
			} else {
				Class11_Sub45_Sub1
						.method3346(
								((Class321) this).anInt4302,
								(byte) -90,
								is,
								((Class321_Sub3) this).anInt7016,
								32993,
								((Class321_Sub3) this).anInt7022,
								((Class321) this).anInt4297,
								(((Class163_Sub3) ((Class321) this).aClass163_Sub3_4282).anInt8332));
				this.method1954(10240, true);
			}
			this.method1963(true, false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mfa.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_35_ + ',' + i_36_ + ',' + i_37_ + ',' + bool
					+ ',' + (is != null ? "{...}" : "null") + ',' + i_38_ + ','
					+ i_39_ + ',' + bool_40_ + ')'));
		}
	}

	public static void method2853(int i) {
		do {
			try {
				aClass217_7017 = null;
				anIntArrayArrayArray7024 = null;
				if (i == 14701)
					break;
				anIntArrayArrayArray7024 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "mfa.V(" + i + ')');
			}
			break;
		} while (false);
	}

	Class321_Sub3(Class163_Sub3 class163_sub3, int i, int i_46_, int i_47_,
			int i_48_, boolean bool, float[] fs, int i_49_) {
		super(class163_sub3, i, i_46_, i_47_ * i_48_, bool);
		try {
			((Class321_Sub3) this).anInt7022 = i_48_;
			((Class321_Sub3) this).anInt7016 = i_47_;
			((Class321) this).aClass163_Sub3_4282.method3295(this, 125);
			if (!bool || ((Class321) this).anInt4302 == 34037) {
				OpenGL.glTexImage2Df(((Class321) this).anInt4302, 0,
						((Class321) this).anInt4297,
						((Class321_Sub3) this).anInt7016,
						((Class321_Sub3) this).anInt7022, 0, i_49_, 5126, fs, 0);
				this.method1954(10240, false);
			} else {
				Class119.method779(i_49_, 114, i_47_, fs, i, i_46_, i_48_);
				this.method1954(10240, true);
			}
			this.method1963(true, false);
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("mfa.<init>("
							+ (class163_sub3 != null ? "{...}" : "null") + ','
							+ i + ',' + i_46_ + ',' + i_47_ + ',' + i_48_ + ','
							+ bool + ',' + (fs != null ? "{...}" : "null")
							+ ',' + i_49_ + ')'));
		}
	}

	final void method2854(int i, int i_50_, int i_51_, int i_52_, int i_53_,
			int i_54_, int i_55_) {
		do {
			try {
				anInt7027++;
				int i_56_ = ((((Class163_Sub3) ((Class321) this).aClass163_Sub3_4282).anInt8141) - (i_54_ + i_51_));
				((Class321) this).aClass163_Sub3_4282.method3295(this, 51);
				OpenGL.glCopyTexSubImage2D(((Class321) this).anInt4302, 0,
						i_53_, -i_52_ + -i_54_
								+ ((Class321_Sub3) this).anInt7022, i_50_,
						i_56_, i_55_, i_54_);
				OpenGL.glFlush();
				if (i == 28490)
					break;
				method2849(-19, -113, 115, 44);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("mfa.W(" + i + ','
						+ i_50_ + ',' + i_51_ + ',' + i_52_ + ',' + i_53_ + ','
						+ i_54_ + ',' + i_55_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2855(boolean bool, boolean bool_57_, int i) {
		try {
			if (i >= 68) {
				if (((Class321) this).anInt4302 == 3553) {
					((Class321) this).aClass163_Sub3_4282.method3295(this, 93);
					OpenGL.glTexParameteri(((Class321) this).anInt4302, 10242,
							!bool_57_ ? 33071 : 10497);
					OpenGL.glTexParameteri(((Class321) this).anInt4302, 10243,
							!bool ? 33071 : 10497);
				}
				anInt7029++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mfa.U(" + bool + ','
					+ bool_57_ + ',' + i + ')'));
		}
	}

	final void method2856(int i, boolean bool, int i_58_, boolean bool_59_,
			int i_60_, byte[] is, int i_61_, int i_62_, int i_63_, int i_64_) {
		try {
			if (i_58_ == 0)
				i_58_ = i;
			anInt7023++;
			if (bool) {
				int i_65_ = Class58_Sub1_Sub1.method3584(i_60_, true);
				int i_66_ = i * i_65_;
				int i_67_ = i_65_ * i_58_;
				byte[] is_68_ = new byte[i_62_ * i_66_];
				for (int i_69_ = 0; i_62_ > i_69_; i_69_++) {
					int i_70_ = i_66_ * i_69_;
					int i_71_ = (-i_69_ + i_62_ - 1) * i_67_ + i_63_;
					for (int i_72_ = 0; i_66_ > i_72_; i_72_++)
						is_68_[i_70_++] = is[i_71_++];
				}
				is = is_68_;
			}
			((Class321) this).aClass163_Sub3_4282.method3295(this, 88);
			OpenGL.glPixelStorei(3317, 1);
			if (bool_59_ != false)
				anIntArrayArrayArray7024 = null;
			if ((i ^ 0xffffffff) != (i_58_ ^ 0xffffffff))
				OpenGL.glPixelStorei(3314, i_58_);
			OpenGL.glTexSubImage2Dub(((Class321) this).anInt4302, 0, i_64_,
					i_61_, i, i_62_, i_60_, 5121, is, i_63_);
			if ((i ^ 0xffffffff) != (i_58_ ^ 0xffffffff))
				OpenGL.glPixelStorei(3314, 0);
			OpenGL.glPixelStorei(3317, 4);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mfa.CA(" + i + ','
					+ bool + ',' + i_58_ + ',' + bool_59_ + ',' + i_60_ + ','
					+ (is != null ? "{...}" : "null") + ',' + i_61_ + ','
					+ i_62_ + ',' + i_63_ + ',' + i_64_ + ')'));
		}
	}
}
