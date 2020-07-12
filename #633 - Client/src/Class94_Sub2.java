/* Class94_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class94_Sub2 extends Class94 implements Interface7 {
	static int anInt5580;
	static int anInt5581;
	private int anInt5582;
	static int anInt5583;
	static int anInt5584;
	static int anInt5585;
	static int anInt5586;
	static int anInt5587;
	static int anInt5588;
	static int anInt5589;
	static int anInt5590;
	private int anInt5591;
	static int anInt5592;
	static int anInt5593;

	Class94_Sub2(Class163_Sub2_Sub1 class163_sub2_sub1, Class98 class98, int i,
			int i_0_, boolean bool, byte[] is, int i_1_, int i_2_) {
		super(class163_sub2_sub1, 3553, class98, Class366.aClass366_4808, i
				* i_0_, bool);
		try {
			anInt5591 = i;
			anInt5582 = i_0_;
			((Class94) this).aClass163_Sub2_Sub1_1259.method3094(this, -2);
			OpenGL.glPixelStorei(3317, 1);
			do {
				if (bool && i_2_ == 0 && i_1_ == 0) {
					this.method634(-72, ((Class94) this).anInt1261, is, i, i_0_);
					if (!client.aBool10531)
						break;
				}
				OpenGL.glPixelStorei(3314, i_2_);
				OpenGL.glTexImage2Dub(((Class94) this).anInt1261, 0, this
						.method637(-30), i, i_0_, 0,
						(Class11_Sub45_Sub17.method3749((byte) -82,
								((Class94) this).aClass98_1269)), 5121, is,
						i_1_);
				OpenGL.glPixelStorei(3314, 0);
			} while (false);
			OpenGL.glPixelStorei(3317, 4);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("au.<init>("
					+ (class163_sub2_sub1 != null ? "{...}" : "null") + ','
					+ (class98 != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ',' + bool + ',' + (is != null ? "{...}" : "null")
					+ ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	public final void method26(int i, boolean bool, boolean bool_3_) {
		try {
			anInt5592++;
			((Class94) this).aClass163_Sub2_Sub1_1259.method3094(this, -2);
			OpenGL.glTexParameteri(((Class94) this).anInt1261, 10242,
					!bool ? 33071 : 10497);
			if (i == 28970)
				OpenGL.glTexParameteri(((Class94) this).anInt1261, 10243,
						bool_3_ ? 10497 : 33071);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("au.F(" + i + ','
					+ bool + ',' + bool_3_ + ')'));
		}
	}

	public final void method25(int i, int i_4_, int[] is, int i_5_,
			boolean bool, int i_6_, int i_7_, int i_8_) {
		try {
			if (bool == true) {
				((Class94) this).aClass163_Sub2_Sub1_1259.method3094(this, -2);
				anInt5580++;
				OpenGL.glPixelStorei(3314, i_4_);
				OpenGL.glTexSubImage2Di(
						((Class94) this).anInt1261,
						0,
						i_5_,
						i_8_,
						i_7_,
						i,
						32993,
						(((Class163_Sub2_Sub1) (((Class94) this).aClass163_Sub2_Sub1_1259)).anInt8677),
						is, i_6_);
				OpenGL.glPixelStorei(3314, 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("au.D(" + i + ','
					+ i_4_ + ',' + (is != null ? "{...}" : "null") + ',' + i_5_
					+ ',' + bool + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	public final float method28(boolean bool, float f) {
		try {
			if (bool != true)
				anInt5588 = 16;
			anInt5590++;
			return f / (float) anInt5582;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "au.E(" + bool + ','
					+ f + ')');
		}
	}

	public final int method29(byte i) {
		try {
			if (i > -2)
				return 66;
			anInt5584++;
			return anInt5582;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "au.I(" + i + ')');
		}
	}

	public final float method22(byte i, float f) {
		try {
			anInt5593++;
			int i_9_ = 13 % ((i - 64) / 52);
			return f / (float) anInt5591;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "au.G(" + i + ',' + f
					+ ')');
		}
	}

	final void method2422(int i, int i_10_, int i_11_, int i_12_, int i_13_,
			Class98 class98, int i_14_, int i_15_, float[] fs) {
		try {
			anInt5585++;
			((Class94) this).aClass163_Sub2_Sub1_1259.method3094(this, -2);
			OpenGL.glPixelStorei(3314, i_15_);
			OpenGL.glTexSubImage2Df(((Class94) this).anInt1261, 0, i_12_,
					i_11_, i_10_, i_14_,
					Class11_Sub45_Sub17.method3749((byte) -99, class98), 5121,
					fs, i);
			if (i_13_ == 33071)
				OpenGL.glPixelStorei(3314, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("au.M(" + i + ','
					+ i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ','
					+ (class98 != null ? "{...}" : "null") + ',' + i_14_ + ','
					+ i_15_ + ',' + (fs != null ? "{...}" : "null") + ')'));
		}
	}

	Class94_Sub2(Class163_Sub2_Sub1 class163_sub2_sub1, Class98 class98,
			Class366 class366, int i, int i_16_) {
		super(class163_sub2_sub1, 3553, class98, class366, i * i_16_, false);
		try {
			anInt5582 = i_16_;
			anInt5591 = i;
			((Class94) this).aClass163_Sub2_Sub1_1259.method3094(this, -2);
			OpenGL.glTexImage2Dub(((Class94) this).anInt1261, 0, this
					.method637(-88), i, i_16_, 0, Class11_Sub45_Sub17
					.method3749((byte) -123, ((Class94) this).aClass98_1269),
					Class11_Sub45_Sub13.method3634(57,
							((Class94) this).aClass366_1263), null, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("au.<init>("
					+ (class163_sub2_sub1 != null ? "{...}" : "null") + ','
					+ (class98 != null ? "{...}" : "null") + ','
					+ (class366 != null ? "{...}" : "null") + ',' + i + ','
					+ i_16_ + ')'));
		}
	}

	Class94_Sub2(Class163_Sub2_Sub1 class163_sub2_sub1, int i, int i_17_,
			boolean bool, int[] is, int i_18_, int i_19_) {
		super(class163_sub2_sub1, 3553, Class364.aClass98_4774,
				Class366.aClass366_4808, i * i_17_, bool);
		try {
			anInt5591 = i;
			anInt5582 = i_17_;
			((Class94) this).aClass163_Sub2_Sub1_1259.method3094(this, -2);
			if (bool && i_19_ == 0 && (i_18_ ^ 0xffffffff) == -1)
				this.method636(i_17_, (byte) -2, ((Class94) this).anInt1261, i,
						is);
			else {
				OpenGL.glPixelStorei(3314, i_19_);
				OpenGL.glTexImage2Di(
						((Class94) this).anInt1261,
						0,
						6408,
						anInt5591,
						anInt5582,
						0,
						32993,
						((Class163_Sub2_Sub1) (((Class94) this).aClass163_Sub2_Sub1_1259)).anInt8677,
						is, 4 * i_18_);
				OpenGL.glPixelStorei(3314, 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("au.<init>("
					+ (class163_sub2_sub1 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_17_ + ',' + bool + ','
					+ (is != null ? "{...}" : "null") + ',' + i_18_ + ','
					+ i_19_ + ')'));
		}
	}

	public final void method27(int i, int i_20_, int i_21_, int i_22_,
			int i_23_, int i_24_, int[] is) {
		try {
			anInt5587++;
			int[] is_25_ = new int[anInt5582 * anInt5591];
			((Class94) this).aClass163_Sub2_Sub1_1259.method3094(this, -2);
			OpenGL.glGetTexImagei(((Class94) this).anInt1261, 0, 32993, 5121,
					is_25_, 0);
			int i_26_ = -10 % ((16 - i_24_) / 62);
			for (int i_27_ = 0; (i_20_ ^ 0xffffffff) < (i_27_ ^ 0xffffffff); i_27_++)
				Class311.method1896(is_25_, anInt5591
						* (i_23_ - -i_20_ + (-1 - i_27_)), is, i_27_ * i_22_
						+ i_21_, i_22_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("au.J(" + i + ','
					+ i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ','
					+ i_24_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	Class94_Sub2(Class163_Sub2_Sub1 class163_sub2_sub1, Class98 class98, int i,
			int i_28_, boolean bool, float[] fs, int i_29_, int i_30_) {
		super(class163_sub2_sub1, 3553, class98, Class366.aClass366_4812, i_28_
				* i, bool);
		try {
			anInt5582 = i_28_;
			anInt5591 = i;
			((Class94) this).aClass163_Sub2_Sub1_1259.method3094(this, -2);
			if (!bool && i_30_ == 0 && i_29_ == 0)
				this.method633(fs, i_28_, ((Class94) this).anInt1261, i, false);
			else {
				OpenGL.glPixelStorei(3314, i_30_);
				OpenGL.glTexImage2Df(((Class94) this).anInt1261, 0, this
						.method637(-87), i, i_28_, 0,
						(Class11_Sub45_Sub17.method3749((byte) -121,
								((Class94) this).aClass98_1269)), 5126, fs,
						4 * i_29_);
				OpenGL.glPixelStorei(3314, 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("au.<init>("
					+ (class163_sub2_sub1 != null ? "{...}" : "null") + ','
					+ (class98 != null ? "{...}" : "null") + ',' + i + ','
					+ i_28_ + ',' + bool + ','
					+ (fs != null ? "{...}" : "null") + ',' + i_29_ + ','
					+ i_30_ + ')'));
		}
	}

	public final boolean method24(int i) {
		try {
			anInt5583++;
			if (i != -4111)
				anInt5589 = -26;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "au.K(" + i + ')');
		}
	}

	public final int method4(byte i) {
		try {
			if (i >= -57)
				anInt5588 = 69;
			anInt5586++;
			return anInt5591;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "au.L(" + i + ')');
		}
	}

	public final void method23(int i, Class98 class98, int i_31_, int i_32_,
			int i_33_, byte[] is, boolean bool, int i_34_, int i_35_) {
		try {
			anInt5581++;
			if (bool != true)
				anInt5591 = -63;
			((Class94) this).aClass163_Sub2_Sub1_1259.method3094(this, -2);
			OpenGL.glPixelStorei(3317, 1);
			OpenGL.glPixelStorei(3314, i_34_);
			OpenGL.glTexSubImage2Dub(((Class94) this).anInt1261, 0, i, i_32_,
					i_33_, i_31_,
					Class11_Sub45_Sub17.method3749((byte) -81, class98), 5121,
					is, i_35_);
			OpenGL.glPixelStorei(3314, 0);
			OpenGL.glPixelStorei(3317, 4);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("au.H(" + i + ','
					+ (class98 != null ? "{...}" : "null") + ',' + i_31_ + ','
					+ i_32_ + ',' + i_33_ + ','
					+ (is != null ? "{...}" : "null") + ',' + bool + ','
					+ i_34_ + ',' + i_35_ + ')'));
		}
	}
}
