/* Class94_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class94_Sub1 extends Class94 implements Interface7 {
	static int anInt5218;
	static int anInt5219;
	static Class84 aClass84_5220 = new Class84();
	private int anInt5221;
	static int anInt5222;
	static int anInt5223;
	static int anInt5224;
	static int anInt5225;
	private int anInt5226;
	static int anInt5227;
	static int anInt5228 = 0;
	static int anInt5229;
	static int anInt5230;
	static int loginStep = 0;

	public final int method29(byte i) {
		try {
			anInt5227++;
			if (i >= -2)
				return -23;
			return anInt5221;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cha.I(" + i + ')');
		}
	}

	public final void method26(int i, boolean bool, boolean bool_0_) {
		try {
			if (i != 28970)
				anInt5228 = -98;
			anInt5219++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("cha.F(" + i + ','
					+ bool + ',' + bool_0_ + ')'));
		}
	}

	Class94_Sub1(Class163_Sub2_Sub1 class163_sub2_sub1, Class98 class98, int i,
			int i_1_, float[] fs, int i_2_, int i_3_) {
		super(class163_sub2_sub1, 34037, class98, Class366.aClass366_4812, i
				* i_1_, false);
		try {
			anInt5226 = i;
			anInt5221 = i_1_;
			((Class94) this).aClass163_Sub2_Sub1_1259.method3094(this, -2);
			OpenGL.glPixelStorei(3314, i_3_);
			OpenGL.glTexImage2Df(((Class94) this).anInt1261, 0, this
					.method637(-83), i, i_1_, 0, Class11_Sub45_Sub17
					.method3749((byte) -108, ((Class94) this).aClass98_1269),
					5126, fs, 4 * i_2_);
			OpenGL.glPixelStorei(3314, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("cha.<init>("
					+ (class163_sub2_sub1 != null ? "{...}" : "null") + ','
					+ (class98 != null ? "{...}" : "null") + ',' + i + ','
					+ i_1_ + ',' + (fs != null ? "{...}" : "null") + ',' + i_2_
					+ ',' + i_3_ + ')'));
		}
	}

	Class94_Sub1(Class163_Sub2_Sub1 class163_sub2_sub1, Class98 class98, int i,
			int i_4_, byte[] is, int i_5_, int i_6_) {
		super(class163_sub2_sub1, 34037, class98, Class366.aClass366_4808, i
				* i_4_, false);
		try {
			anInt5221 = i_4_;
			anInt5226 = i;
			((Class94) this).aClass163_Sub2_Sub1_1259.method3094(this, -2);
			OpenGL.glPixelStorei(3317, 1);
			OpenGL.glPixelStorei(3314, i_6_);
			OpenGL.glTexImage2Dub(((Class94) this).anInt1261, 0, this
					.method637(-116), i, i_4_, 0, Class11_Sub45_Sub17
					.method3749((byte) -87, ((Class94) this).aClass98_1269),
					5121, is, i_5_);
			OpenGL.glPixelStorei(3314, 0);
			OpenGL.glPixelStorei(3317, 4);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("cha.<init>("
					+ (class163_sub2_sub1 != null ? "{...}" : "null") + ','
					+ (class98 != null ? "{...}" : "null") + ',' + i + ','
					+ i_4_ + ',' + (is != null ? "{...}" : "null") + ',' + i_5_
					+ ',' + i_6_ + ')'));
		}
	}

	Class94_Sub1(Class163_Sub2_Sub1 class163_sub2_sub1, Class98 class98,
			Class366 class366, int i, int i_7_) {
		super(class163_sub2_sub1, 34037, class98, class366, i * i_7_, false);
		try {
			anInt5221 = i_7_;
			anInt5226 = i;
			((Class94) this).aClass163_Sub2_Sub1_1259.method3094(this, -2);
			OpenGL.glTexImage2Dub(((Class94) this).anInt1261, 0, this
					.method637(-89), i, i_7_, 0, Class11_Sub45_Sub17
					.method3749((byte) -117, ((Class94) this).aClass98_1269),
					Class11_Sub45_Sub13.method3634(101,
							((Class94) this).aClass366_1263), null, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("cha.<init>("
					+ (class163_sub2_sub1 != null ? "{...}" : "null") + ','
					+ (class98 != null ? "{...}" : "null") + ','
					+ (class366 != null ? "{...}" : "null") + ',' + i + ','
					+ i_7_ + ')'));
		}
	}

	public final float method28(boolean bool, float f) {
		try {
			if (bool != true)
				anInt5221 = 80;
			anInt5225++;
			return f;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cha.E(" + bool + ','
					+ f + ')');
		}
	}

	public static void method2309(int i) {
		do {
			try {
				aClass84_5220 = null;
				if (i >= 48)
					break;
				method2309(4);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "cha.C(" + i + ')');
			}
			break;
		} while (false);
	}

	public final void method25(int i, int i_8_, int[] is, int i_9_,
			boolean bool, int i_10_, int i_11_, int i_12_) {
		do {
			try {
				((Class94) this).aClass163_Sub2_Sub1_1259.method3094(this, -2);
				if (i_8_ == 0)
					i_8_ = i_11_;
				anInt5229++;
				if ((i_8_ ^ 0xffffffff) != (i_11_ ^ 0xffffffff))
					OpenGL.glPixelStorei(3314, i_8_);
				if (bool != true)
					method25(101, 81, null, -45, false, 7, 105, 0);
				OpenGL.glTexSubImage2Di(
						((Class94) this).anInt1261,
						0,
						i_9_,
						i_12_,
						i_11_,
						i,
						32993,
						(((Class163_Sub2_Sub1) (((Class94) this).aClass163_Sub2_Sub1_1259)).anInt8677),
						is, i_10_);
				if ((i_8_ ^ 0xffffffff) == (i_11_ ^ 0xffffffff))
					break;
				OpenGL.glPixelStorei(3314, 0);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("cha.D(" + i + ','
						+ i_8_ + ',' + (is != null ? "{...}" : "null") + ','
						+ i_9_ + ',' + bool + ',' + i_10_ + ',' + i_11_ + ','
						+ i_12_ + ')'));
			}
			break;
		} while (false);
	}

	public final void method27(int i, int i_13_, int i_14_, int i_15_,
			int i_16_, int i_17_, int[] is) {
		try {
			anInt5224++;
			int[] is_18_ = new int[anInt5226 * anInt5221];
			((Class94) this).aClass163_Sub2_Sub1_1259.method3094(this, -2);
			OpenGL.glGetTexImagei(((Class94) this).anInt1261, 0, 32993, 5121,
					is_18_, 0);
			for (int i_19_ = 0; (i_13_ ^ 0xffffffff) < (i_19_ ^ 0xffffffff); i_19_++)
				Class311.method1896(is_18_, anInt5226
						* (-i_19_ + (i_16_ - (1 + -i_13_))), is, i_14_ + i_19_
						* i_15_, i_15_);
			int i_20_ = 100 / ((i_17_ - 16) / 62);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("cha.J(" + i + ','
					+ i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ','
					+ i_17_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	public final float method22(byte i, float f) {
		try {
			int i_21_ = -82 / ((64 - i) / 52);
			anInt5230++;
			return f;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cha.G(" + i + ',' + f
					+ ')');
		}
	}

	public final int method4(byte i) {
		try {
			if (i >= -57)
				anInt5228 = -32;
			anInt5223++;
			return anInt5226;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cha.L(" + i + ')');
		}
	}

	public final boolean method24(int i) {
		try {
			if (i != -4111)
				return true;
			anInt5218++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cha.K(" + i + ')');
		}
	}

	public final void method23(int i, Class98 class98, int i_22_, int i_23_,
			int i_24_, byte[] is, boolean bool, int i_25_, int i_26_) {
		do {
			try {
				anInt5222++;
				if ((i_25_ ^ 0xffffffff) == -1)
					i_25_ = i_24_;
				((Class94) this).aClass163_Sub2_Sub1_1259.method3094(this, -2);
				OpenGL.glPixelStorei(3317, 1);
				if (i_25_ != i_24_)
					OpenGL.glPixelStorei(3314, i_25_);
				OpenGL.glTexSubImage2Dub(((Class94) this).anInt1261, 0, i,
						i_23_, i_24_, i_22_,
						Class11_Sub45_Sub17.method3749((byte) -126, class98),
						5121, is, i_26_);
				if ((i_25_ ^ 0xffffffff) != (i_24_ ^ 0xffffffff))
					OpenGL.glPixelStorei(3314, 0);
				OpenGL.glPixelStorei(3317, 4);
				if (bool == true)
					break;
				method28(true, 1.8515702F);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("cha.H(" + i + ','
						+ (class98 != null ? "{...}" : "null") + ',' + i_22_
						+ ',' + i_23_ + ',' + i_24_ + ','
						+ (is != null ? "{...}" : "null") + ',' + bool + ','
						+ i_25_ + ',' + i_26_ + ')'));
			}
			break;
		} while (false);
	}

	Class94_Sub1(Class163_Sub2_Sub1 class163_sub2_sub1, int i, int i_27_,
			int[] is, int i_28_, int i_29_) {
		super(class163_sub2_sub1, 34037, Class364.aClass98_4774,
				Class366.aClass366_4808, i * i_27_, false);
		try {
			anInt5221 = i_27_;
			anInt5226 = i;
			((Class94) this).aClass163_Sub2_Sub1_1259.method3094(this, -2);
			OpenGL.glPixelStorei(3314, i_29_);
			OpenGL.glTexImage2Di(
					((Class94) this).anInt1261,
					0,
					6408,
					anInt5226,
					anInt5221,
					0,
					32993,
					(((Class163_Sub2_Sub1) ((Class94) this).aClass163_Sub2_Sub1_1259).anInt8677),
					is, 4 * i_28_);
			OpenGL.glPixelStorei(3314, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("cha.<init>("
					+ (class163_sub2_sub1 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_27_ + ',' + (is != null ? "{...}" : "null") + ','
					+ i_28_ + ',' + i_29_ + ')'));
		}
	}
}
