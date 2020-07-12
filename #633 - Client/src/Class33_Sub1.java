/* Class33_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class33_Sub1 extends Class33 {
	float aFloat6162;
	static int anInt6163;
	float aFloat6164;
	static int anInt6165;
	static int anInt6166;
	static int anInt6167;
	float aFloat6168;
	static int anInt6169;
	static int anInt6170;
	static int anInt6171;
	static int anInt6172;
	static int anInt6173;
	float aFloat6174;
	static int anInt6175;
	static String[] aStringArray6176;
	static int anInt6177;
	static int anInt6178 = 0;
	float aFloat6179;
	static int anInt6180;
	static int anInt6181;
	static int anInt6182;
	float aFloat6183;
	static int anInt6184;
	float aFloat6185;
	static int anInt6186;
	static int anInt6187;
	static int anInt6188;
	static int anInt6189;
	static int anInt6190;
	float aFloat6191;
	float aFloat6192;
	static int anInt6193;
	static int anInt6194;
	static int anInt6195;
	static int anInt6196;
	float aFloat6197;
	static int anInt6198;
	static int anInt6199;
	float aFloat6200;
	float aFloat6201;

	final void method294(int i, int i_0_, int i_1_, int[] is) {
		try {
			anInt6190++;
			is[2] = (int) (((Class33_Sub1) this).aFloat6174 * (float) i_1_ + ((float) i_0_
					* ((Class33_Sub1) this).aFloat6192 + ((Class33_Sub1) this).aFloat6197
					* (float) i));
			is[0] = (int) ((float) i_0_ * ((Class33_Sub1) this).aFloat6200
					+ (float) i * ((Class33_Sub1) this).aFloat6164 + ((Class33_Sub1) this).aFloat6179
					* (float) i_1_);
			is[1] = (int) (((Class33_Sub1) this).aFloat6183 * (float) i_1_ + (((Class33_Sub1) this).aFloat6185
					* (float) i_0_ + (float) i
					* ((Class33_Sub1) this).aFloat6162));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("fw.DA(" + i + ',' + i_0_ + ',' + i_1_ + ','
							+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method301(int i, int i_2_, int i_3_) {
		try {
			((Class33_Sub1) this).aFloat6162 = ((Class33_Sub1) this).aFloat6197 = ((Class33_Sub1) this).aFloat6200 = ((Class33_Sub1) this).aFloat6192 = ((Class33_Sub1) this).aFloat6179 = ((Class33_Sub1) this).aFloat6183 = 0.0F;
			((Class33_Sub1) this).aFloat6191 = (float) i_2_;
			((Class33_Sub1) this).aFloat6168 = (float) i_3_;
			((Class33_Sub1) this).aFloat6164 = ((Class33_Sub1) this).aFloat6185 = ((Class33_Sub1) this).aFloat6174 = 1.0F;
			anInt6163++;
			((Class33_Sub1) this).aFloat6201 = (float) i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fw.Q(" + i + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	final void method300(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		try {
			anInt6196++;
			float f = Class376_Sub7_Sub3.aFloatArray9276[0x3fff & i_6_];
			float f_9_ = Class376_Sub7_Sub3.aFloatArray9279[0x3fff & i_6_];
			float f_10_ = Class376_Sub7_Sub3.aFloatArray9276[i_7_ & 0x3fff];
			float f_11_ = Class376_Sub7_Sub3.aFloatArray9279[0x3fff & i_7_];
			float f_12_ = Class376_Sub7_Sub3.aFloatArray9276[0x3fff & i_8_];
			float f_13_ = Class376_Sub7_Sub3.aFloatArray9279[i_8_ & 0x3fff];
			float f_14_ = f_9_ * f_12_;
			float f_15_ = f_13_ * f_9_;
			((Class33_Sub1) this).aFloat6162 = f_13_ * -f_10_ + f_14_ * f_11_;
			((Class33_Sub1) this).aFloat6174 = f_10_ * f;
			((Class33_Sub1) this).aFloat6197 = f_11_ * f;
			((Class33_Sub1) this).aFloat6200 = f * f_13_;
			((Class33_Sub1) this).aFloat6183 = f_14_ * f_10_ + f_11_ * f_13_;
			((Class33_Sub1) this).aFloat6164 = f_11_ * f_15_ + f_10_ * f_12_;
			((Class33_Sub1) this).aFloat6192 = -f_9_;
			((Class33_Sub1) this).aFloat6185 = f_12_ * f;
			((Class33_Sub1) this).aFloat6179 = f_10_ * f_15_ + f_12_ * -f_11_;
			((Class33_Sub1) this).aFloat6168 = (-((float) i_5_ * ((Class33_Sub1) this).aFloat6174) + (-(((Class33_Sub1) this).aFloat6192 * (float) i_4_) + (float) -i
					* ((Class33_Sub1) this).aFloat6197));
			((Class33_Sub1) this).aFloat6201 = (-(((Class33_Sub1) this).aFloat6179 * (float) i_5_) + ((float) -i
					* ((Class33_Sub1) this).aFloat6164 - (float) i_4_
					* ((Class33_Sub1) this).aFloat6200));
			((Class33_Sub1) this).aFloat6191 = (-((float) i_4_ * ((Class33_Sub1) this).aFloat6185)
					+ ((Class33_Sub1) this).aFloat6162 * (float) -i - ((Class33_Sub1) this).aFloat6183
					* (float) i_5_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("fw.S(" + i + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ','
							+ i_7_ + ',' + i_8_ + ')'));
		}
	}

	final void method2629(float f, float f_16_, float[] fs, float f_17_,
			float f_18_, byte i) {
		try {
			anInt6171++;
			if (i < 122)
				anInt6178 = -14;
			fs[2] = (f_16_ * ((Class33_Sub1) this).aFloat6192 + f_18_
					* ((Class33_Sub1) this).aFloat6197 + f_17_
					* ((Class33_Sub1) this).aFloat6174);
			fs[0] = (((Class33_Sub1) this).aFloat6164 * f_18_
					+ ((Class33_Sub1) this).aFloat6200 * f_16_ + f_17_
					* ((Class33_Sub1) this).aFloat6179);
			float f_19_;
			float f_20_;
			float f_21_;
			if (f_18_ > 0.00390625F || f_18_ < -0.00390625F) {
				float f_22_ = -f / f_18_;
				f_20_ = (f_22_ * ((Class33_Sub1) this).aFloat6164 + ((Class33_Sub1) this).aFloat6201);
				f_21_ = (((Class33_Sub1) this).aFloat6197 * f_22_ + ((Class33_Sub1) this).aFloat6168);
				f_19_ = (f_22_ * ((Class33_Sub1) this).aFloat6162 + ((Class33_Sub1) this).aFloat6191);
			} else if (!(f_16_ > 0.00390625F) && !(f_16_ < -0.00390625F)) {
				float f_23_ = -f / f_17_;
				f_19_ = (((Class33_Sub1) this).aFloat6191 + f_23_
						* ((Class33_Sub1) this).aFloat6183);
				f_20_ = (((Class33_Sub1) this).aFloat6201 + ((Class33_Sub1) this).aFloat6179
						* f_23_);
				f_21_ = (((Class33_Sub1) this).aFloat6174 * f_23_ + ((Class33_Sub1) this).aFloat6168);
			} else {
				float f_24_ = -f / f_16_;
				f_20_ = (((Class33_Sub1) this).aFloat6201 + ((Class33_Sub1) this).aFloat6200
						* f_24_);
				f_21_ = (((Class33_Sub1) this).aFloat6168 + f_24_
						* ((Class33_Sub1) this).aFloat6192);
				f_19_ = (f_24_ * ((Class33_Sub1) this).aFloat6185 + ((Class33_Sub1) this).aFloat6191);
			}
			fs[1] = (((Class33_Sub1) this).aFloat6183 * f_17_ + (f_16_
					* ((Class33_Sub1) this).aFloat6185 + f_18_
					* ((Class33_Sub1) this).aFloat6162));
			fs[3] = -(f_20_ * fs[0] + f_19_ * fs[1] + f_21_ * fs[2]);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fw.H(" + f + ','
					+ f_16_ + ',' + (fs != null ? "{...}" : "null") + ','
					+ f_17_ + ',' + f_18_ + ',' + i + ')'));
		}
	}

	final void method288(int i) {
		try {
			anInt6169++;
			((Class33_Sub1) this).aFloat6174 = 1.0F;
			((Class33_Sub1) this).aFloat6164 = ((Class33_Sub1) this).aFloat6185 = Class376_Sub7_Sub3.aFloatArray9276[0x3fff & i];
			((Class33_Sub1) this).aFloat6162 = Class376_Sub7_Sub3.aFloatArray9279[0x3fff & i];
			((Class33_Sub1) this).aFloat6200 = -((Class33_Sub1) this).aFloat6162;
			((Class33_Sub1) this).aFloat6179 = ((Class33_Sub1) this).aFloat6201 = ((Class33_Sub1) this).aFloat6183 = ((Class33_Sub1) this).aFloat6191 = ((Class33_Sub1) this).aFloat6197 = ((Class33_Sub1) this).aFloat6192 = ((Class33_Sub1) this).aFloat6168 = 0.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fw.A(" + i + ')');
		}
	}

	public static void method2630(int i) {
		do {
			try {
				aStringArray6176 = null;
				if (i == 6)
					break;
				aStringArray6176 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "fw.M(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method296(Class33 class33) {
		try {
			anInt6182++;
			Class33_Sub1 class33_sub1_25_ = (Class33_Sub1) class33;
			((Class33_Sub1) this).aFloat6191 = ((Class33_Sub1) class33_sub1_25_).aFloat6191;
			((Class33_Sub1) this).aFloat6201 = ((Class33_Sub1) class33_sub1_25_).aFloat6201;
			((Class33_Sub1) this).aFloat6185 = ((Class33_Sub1) class33_sub1_25_).aFloat6185;
			((Class33_Sub1) this).aFloat6168 = ((Class33_Sub1) class33_sub1_25_).aFloat6168;
			((Class33_Sub1) this).aFloat6200 = ((Class33_Sub1) class33_sub1_25_).aFloat6200;
			((Class33_Sub1) this).aFloat6179 = ((Class33_Sub1) class33_sub1_25_).aFloat6179;
			((Class33_Sub1) this).aFloat6164 = ((Class33_Sub1) class33_sub1_25_).aFloat6164;
			((Class33_Sub1) this).aFloat6192 = ((Class33_Sub1) class33_sub1_25_).aFloat6192;
			((Class33_Sub1) this).aFloat6174 = ((Class33_Sub1) class33_sub1_25_).aFloat6174;
			((Class33_Sub1) this).aFloat6197 = ((Class33_Sub1) class33_sub1_25_).aFloat6197;
			((Class33_Sub1) this).aFloat6162 = ((Class33_Sub1) class33_sub1_25_).aFloat6162;
			((Class33_Sub1) this).aFloat6183 = ((Class33_Sub1) class33_sub1_25_).aFloat6183;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fw.C("
					+ (class33 != null ? "{...}" : "null") + ')');
		}
	}

	final void method2631(Class33 class33, byte i) {
		try {
			anInt6198++;
			Class33_Sub1 class33_sub1_26_ = (Class33_Sub1) class33;
			((Class33_Sub1) this).aFloat6179 = ((Class33_Sub1) class33_sub1_26_).aFloat6197;
			((Class33_Sub1) this).aFloat6164 = ((Class33_Sub1) class33_sub1_26_).aFloat6164;
			int i_27_ = 62 % ((i - 40) / 61);
			((Class33_Sub1) this).aFloat6200 = ((Class33_Sub1) class33_sub1_26_).aFloat6162;
			((Class33_Sub1) this).aFloat6185 = ((Class33_Sub1) class33_sub1_26_).aFloat6185;
			((Class33_Sub1) this).aFloat6183 = ((Class33_Sub1) class33_sub1_26_).aFloat6192;
			((Class33_Sub1) this).aFloat6197 = ((Class33_Sub1) class33_sub1_26_).aFloat6179;
			((Class33_Sub1) this).aFloat6162 = ((Class33_Sub1) class33_sub1_26_).aFloat6200;
			((Class33_Sub1) this).aFloat6192 = ((Class33_Sub1) class33_sub1_26_).aFloat6183;
			((Class33_Sub1) this).aFloat6174 = ((Class33_Sub1) class33_sub1_26_).aFloat6174;
			((Class33_Sub1) this).aFloat6201 = -((((Class33_Sub1) this).aFloat6179 * ((Class33_Sub1) class33_sub1_26_).aFloat6168) + ((((Class33_Sub1) this).aFloat6200 * ((Class33_Sub1) class33_sub1_26_).aFloat6191) + (((Class33_Sub1) this).aFloat6164 * ((Class33_Sub1) class33_sub1_26_).aFloat6201)));
			((Class33_Sub1) this).aFloat6191 = -((((Class33_Sub1) class33_sub1_26_).aFloat6168 * ((Class33_Sub1) this).aFloat6183) + ((((Class33_Sub1) class33_sub1_26_).aFloat6191 * ((Class33_Sub1) this).aFloat6185) + (((Class33_Sub1) this).aFloat6162 * ((Class33_Sub1) class33_sub1_26_).aFloat6201)));
			((Class33_Sub1) this).aFloat6168 = -((((Class33_Sub1) class33_sub1_26_).aFloat6201 * ((Class33_Sub1) this).aFloat6197)
					+ (((Class33_Sub1) class33_sub1_26_).aFloat6191 * ((Class33_Sub1) this).aFloat6192) + (((Class33_Sub1) this).aFloat6174 * ((Class33_Sub1) class33_sub1_26_).aFloat6168));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fw.K("
					+ (class33 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final int[] method2632(int i, float f, int i_28_, int i_29_,
			int i_30_, boolean bool, int i_31_, int i_32_) {
		try {
			anInt6199++;
			int[] is = new int[i_29_];
			Class11_Sub2_Sub39 class11_sub2_sub39 = new Class11_Sub2_Sub39();
			((Class11_Sub2_Sub39) class11_sub2_sub39).anInt9798 = i_32_;
			((Class11_Sub2_Sub39) class11_sub2_sub39).anInt9800 = i_28_;
			int i_33_ = 110 % ((i_30_ - 42) / 45);
			((Class11_Sub2_Sub39) class11_sub2_sub39).aBool9806 = bool;
			((Class11_Sub2_Sub39) class11_sub2_sub39).anInt9814 = (int) (f * 4096.0F);
			((Class11_Sub2_Sub39) class11_sub2_sub39).anInt9804 = i;
			((Class11_Sub2_Sub39) class11_sub2_sub39).anInt9812 = i_31_;
			class11_sub2_sub39.method2256(7);
			Class239_Sub2.method3189(-11775, i_29_, 1);
			class11_sub2_sub39.method3857(false, 0, is);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fw.N(" + i + ',' + f
					+ ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ',' + bool
					+ ',' + i_31_ + ',' + i_32_ + ')'));
		}
	}

	final void method293(int i) {
		try {
			anInt6165++;
			float f = Class376_Sub7_Sub3.aFloatArray9276[i & 0x3fff];
			float f_34_ = Class376_Sub7_Sub3.aFloatArray9279[i & 0x3fff];
			float f_35_ = ((Class33_Sub1) this).aFloat6164;
			float f_36_ = ((Class33_Sub1) this).aFloat6200;
			float f_37_ = ((Class33_Sub1) this).aFloat6179;
			float f_38_ = ((Class33_Sub1) this).aFloat6201;
			((Class33_Sub1) this).aFloat6164 = f_34_
					* ((Class33_Sub1) this).aFloat6197 + f * f_35_;
			((Class33_Sub1) this).aFloat6197 = ((Class33_Sub1) this).aFloat6197
					* f - f_34_ * f_35_;
			((Class33_Sub1) this).aFloat6200 = f_36_ * f + f_34_
					* ((Class33_Sub1) this).aFloat6192;
			((Class33_Sub1) this).aFloat6179 = f_34_
					* ((Class33_Sub1) this).aFloat6174 + f_37_ * f;
			((Class33_Sub1) this).aFloat6192 = -(f_34_ * f_36_)
					+ ((Class33_Sub1) this).aFloat6192 * f;
			((Class33_Sub1) this).aFloat6201 = ((Class33_Sub1) this).aFloat6168
					* f_34_ + f_38_ * f;
			((Class33_Sub1) this).aFloat6174 = -(f_37_ * f_34_)
					+ ((Class33_Sub1) this).aFloat6174 * f;
			((Class33_Sub1) this).aFloat6168 = f
					* ((Class33_Sub1) this).aFloat6168 - f_34_ * f_38_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fw.W(" + i + ')');
		}
	}

	final void method302(int[] is) {
		try {
			anInt6194++;
			float f = (float) is[0] - ((Class33_Sub1) this).aFloat6201;
			float f_39_ = -((Class33_Sub1) this).aFloat6191 + (float) is[1];
			float f_40_ = -((Class33_Sub1) this).aFloat6168 + (float) is[2];
			is[1] = (int) (((Class33_Sub1) this).aFloat6192 * f_40_ + (((Class33_Sub1) this).aFloat6200
					* f + f_39_ * ((Class33_Sub1) this).aFloat6185));
			is[2] = (int) (f_40_ * ((Class33_Sub1) this).aFloat6174 + (((Class33_Sub1) this).aFloat6179
					* f + ((Class33_Sub1) this).aFloat6183 * f_39_));
			is[0] = (int) (f_40_ * ((Class33_Sub1) this).aFloat6197 + (((Class33_Sub1) this).aFloat6164
					* f + ((Class33_Sub1) this).aFloat6162 * f_39_));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fw.R("
					+ (is != null ? "{...}" : "null") + ')');
		}
	}

	final Class33 method292() {
		try {
			anInt6187++;
			Class33_Sub1 class33_sub1_41_ = new Class33_Sub1();
			((Class33_Sub1) class33_sub1_41_).aFloat6162 = ((Class33_Sub1) this).aFloat6162;
			((Class33_Sub1) class33_sub1_41_).aFloat6168 = ((Class33_Sub1) this).aFloat6168;
			((Class33_Sub1) class33_sub1_41_).aFloat6164 = ((Class33_Sub1) this).aFloat6164;
			((Class33_Sub1) class33_sub1_41_).aFloat6185 = ((Class33_Sub1) this).aFloat6185;
			((Class33_Sub1) class33_sub1_41_).aFloat6200 = ((Class33_Sub1) this).aFloat6200;
			((Class33_Sub1) class33_sub1_41_).aFloat6201 = ((Class33_Sub1) this).aFloat6201;
			((Class33_Sub1) class33_sub1_41_).aFloat6197 = ((Class33_Sub1) this).aFloat6197;
			((Class33_Sub1) class33_sub1_41_).aFloat6192 = ((Class33_Sub1) this).aFloat6192;
			((Class33_Sub1) class33_sub1_41_).aFloat6174 = ((Class33_Sub1) this).aFloat6174;
			((Class33_Sub1) class33_sub1_41_).aFloat6191 = ((Class33_Sub1) this).aFloat6191;
			((Class33_Sub1) class33_sub1_41_).aFloat6183 = ((Class33_Sub1) this).aFloat6183;
			((Class33_Sub1) class33_sub1_41_).aFloat6179 = ((Class33_Sub1) this).aFloat6179;
			return class33_sub1_41_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fw.O(" + ')');
		}
	}

	final void method303(int i) {
		try {
			anInt6175++;
			float f = Class376_Sub7_Sub3.aFloatArray9276[i & 0x3fff];
			float f_42_ = Class376_Sub7_Sub3.aFloatArray9279[i & 0x3fff];
			float f_43_ = ((Class33_Sub1) this).aFloat6162;
			float f_44_ = ((Class33_Sub1) this).aFloat6185;
			float f_45_ = ((Class33_Sub1) this).aFloat6183;
			((Class33_Sub1) this).aFloat6162 = f_43_ * f
					- ((Class33_Sub1) this).aFloat6197 * f_42_;
			float f_46_ = ((Class33_Sub1) this).aFloat6191;
			((Class33_Sub1) this).aFloat6197 = f
					* ((Class33_Sub1) this).aFloat6197 + f_43_ * f_42_;
			((Class33_Sub1) this).aFloat6185 = -(f_42_ * ((Class33_Sub1) this).aFloat6192)
					+ f_44_ * f;
			((Class33_Sub1) this).aFloat6192 = f_42_ * f_44_
					+ ((Class33_Sub1) this).aFloat6192 * f;
			((Class33_Sub1) this).aFloat6183 = -(f_42_ * ((Class33_Sub1) this).aFloat6174)
					+ f_45_ * f;
			((Class33_Sub1) this).aFloat6191 = f_46_ * f
					- ((Class33_Sub1) this).aFloat6168 * f_42_;
			((Class33_Sub1) this).aFloat6174 = ((Class33_Sub1) this).aFloat6174
					* f + f_45_ * f_42_;
			((Class33_Sub1) this).aFloat6168 = f_46_ * f_42_
					+ ((Class33_Sub1) this).aFloat6168 * f;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fw.D(" + i + ')');
		}
	}

	final void method289() {
		try {
			((Class33_Sub1) this).aFloat6164 = ((Class33_Sub1) this).aFloat6185 = ((Class33_Sub1) this).aFloat6174 = 1.0F;
			((Class33_Sub1) this).aFloat6162 = ((Class33_Sub1) this).aFloat6197 = ((Class33_Sub1) this).aFloat6200 = ((Class33_Sub1) this).aFloat6192 = ((Class33_Sub1) this).aFloat6179 = ((Class33_Sub1) this).aFloat6183 = ((Class33_Sub1) this).aFloat6201 = ((Class33_Sub1) this).aFloat6191 = ((Class33_Sub1) this).aFloat6168 = 0.0F;
			anInt6189++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fw.U(" + ')');
		}
	}

	static final void method2633(Interface1 interface1, Class163 class163, int i) {
		try {
			anInt6193++;
			if (Class32.aClass11_Sub45_Sub19_418 != null) {
				if (Class164.anInt2133 < 10) {
					if (!Class32.aClass146_416
							.method921(
									((Class11_Sub45_Sub19) Class32.aClass11_Sub45_Sub19_418).aString9696,
									-2)) {
						Class164.anInt2133 = (Class11_Sub2_Sub30.aClass146_9618
								.method908(
										((Class11_Sub45_Sub19) Class32.aClass11_Sub45_Sub19_418).aString9696,
										(byte) 110)) / 10;
						return;
					}
					Class11_Sub12_Sub4.method3727(-1);
					Class164.anInt2133 = 10;
				}
				if ((Class164.anInt2133 ^ 0xffffffff) == -11) {
					Class32.anInt441 = (((Class11_Sub45_Sub19) Class32.aClass11_Sub45_Sub19_418).anInt9709) >> 6 << 6;
					Class32.anInt451 = (((Class11_Sub45_Sub19) Class32.aClass11_Sub45_Sub19_418).anInt9700) >> 6 << 6;
					Class32.anInt432 = (((Class11_Sub45_Sub19) Class32.aClass11_Sub45_Sub19_418).anInt9702 >> 6 << 6)
							+ (-Class32.anInt441 + 64);
					Class32.anInt447 = (-Class32.anInt451 + ((((Class11_Sub45_Sub19) Class32.aClass11_Sub45_Sub19_418).anInt9713 >> 6 << 6) + 64));
					int[] is = new int[3];
					int i_47_ = -1;
					int i_48_ = -1;
					if (Class32.aClass11_Sub45_Sub19_418
							.method3818(
									((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047,
									(((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7031 >> 9)
											+ Class118.anInt1605,
									(byte) 21,
									(((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7045 >> 9)
											+ Class194.anInt2641, is)) {
						i_48_ = is[2] - Class32.anInt451;
						i_47_ = -Class32.anInt441 + is[1];
					}
					if (!Class376_Sub7_Sub2_Sub2.aBool10226
							&& i_47_ >= 0
							&& i_47_ < Class32.anInt432
							&& i_48_ >= 0
							&& (Class32.anInt447 ^ 0xffffffff) < (i_48_ ^ 0xffffffff)) {
						i_47_ += -5 + (int) (10.0 * Math.random());
						i_48_ += -5 + (int) (Math.random() * 10.0);
						Class14.anInt124 = i_47_;
						Class239_Sub2.anInt7912 = i_48_;
					} else if (Class11_Sub28.anInt6575 == -1
							|| ((Class108_Sub1.anInt5027 ^ 0xffffffff) == 0)) {
						Class32.aClass11_Sub45_Sub19_418
								.method3816(
										0x3fff & (((Class11_Sub45_Sub19) Class32.aClass11_Sub45_Sub19_418).anInt9695),
										is,
										(((Class11_Sub45_Sub19) Class32.aClass11_Sub45_Sub19_418).anInt9695 >> 14) & 0x3fff,
										(byte) 106);
						Class14.anInt124 = is[1] - Class32.anInt441;
						Class239_Sub2.anInt7912 = is[2] + -Class32.anInt451;
					} else {
						Class32.aClass11_Sub45_Sub19_418.method3816(
								Class108_Sub1.anInt5027, is,
								Class11_Sub28.anInt6575, (byte) 101);
						Class376_Sub7_Sub2_Sub2.aBool10226 = false;
						if (is != null) {
							Class14.anInt124 = -Class32.anInt441 + is[1];
							Class239_Sub2.anInt7912 = -Class32.anInt451 + is[2];
						}
						Class11_Sub28.anInt6575 = Class108_Sub1.anInt5027 = -1;
					}
					if ((((Class11_Sub45_Sub19) Class32.aClass11_Sub45_Sub19_418).anInt9704 ^ 0xffffffff) == -38)
						Class32.aFloat429 = Class32.aFloat428 = 3.0F;
					else if (((Class11_Sub45_Sub19) Class32.aClass11_Sub45_Sub19_418).anInt9704 == 50)
						Class32.aFloat429 = Class32.aFloat428 = 4.0F;
					else if ((((Class11_Sub45_Sub19) Class32.aClass11_Sub45_Sub19_418).anInt9704 ^ 0xffffffff) != -76) {
						if (((Class11_Sub45_Sub19) Class32.aClass11_Sub45_Sub19_418).anInt9704 != 100) {
							if ((((Class11_Sub45_Sub19) Class32.aClass11_Sub45_Sub19_418).anInt9704 ^ 0xffffffff) == -201)
								Class32.aFloat429 = Class32.aFloat428 = 16.0F;
							else
								Class32.aFloat429 = Class32.aFloat428 = 8.0F;
						} else
							Class32.aFloat429 = Class32.aFloat428 = 8.0F;
					} else
						Class32.aFloat429 = Class32.aFloat428 = 6.0F;
					Class32.anInt422 = (int) Class32.aFloat428 >> 1;
					Class32.aByteArrayArrayArray424 = Class376_Sub1_Sub1
							.method3410(Class32.anInt422, (byte) 87);
					Class283.method1744((byte) 56);
					Class32.method272();
					ISAAC.aClass84_265 = new Class84();
					Class32.anInt430 += (int) (Math.random() * 5.0) - 2;
					if ((Class32.anInt430 ^ 0xffffffff) > 7)
						Class32.anInt430 = -8;
					if ((Class32.anInt430 ^ 0xffffffff) < -9)
						Class32.anInt430 = 8;
					Class32.anInt426 += (int) (5.0 * Math.random()) - 2;
					if ((Class32.anInt426 ^ 0xffffffff) > 15)
						Class32.anInt426 = -16;
					if (Class32.anInt426 > 16)
						Class32.anInt426 = 16;
					Class32.method263(interface1, Class32.anInt430 >> 2 << 10,
							Class32.anInt426 >> 1);
					Class32.aClass280_420.method1724(256, (byte) -16, 1024);
					Class32.aClass29_419.method251(2060105417, 256, 256);
					Class32.aClass290_415.method1792(4096, 120);
					Class11_Sub50_Sub2.aClass369_9082.method2181(-1, 256);
					Class164.anInt2133 = 20;
				} else if (Class164.anInt2133 == 20) {
					Class141.method891((byte) 116, true);
					Class32.method280(class163, Class32.anInt430,
							Class32.anInt426);
					Class164.anInt2133 = 60;
					Class141.method891((byte) 75, true);
					Class250.method1595((byte) -88);
				} else if ((Class164.anInt2133 ^ 0xffffffff) == -61) {
					if (!Class32.aClass146_416
							.method923(
									(byte) 33,
									(((Class11_Sub45_Sub19) Class32.aClass11_Sub45_Sub19_418).aString9696)
											+ "_staticelements"))
						Class32.aClass342_431 = new Class342(0);
					else {
						if (!Class32.aClass146_416
								.method921(
										(((Class11_Sub45_Sub19) Class32.aClass11_Sub45_Sub19_418).aString9696 + "_staticelements"),
										-2))
							return;
						Class32.aClass342_431 = Class53
								.method438(
										Class233.aBool3197,
										Class32.aClass146_416,
										(byte) -77,
										((((Class11_Sub45_Sub19) (Class32.aClass11_Sub45_Sub19_418)).aString9696) + "_staticelements"));
					}
					Class32.method270();
					Class164.anInt2133 = 70;
					Class141.method891((byte) 52, true);
					Class250.method1595((byte) 78);
				} else if ((Class164.anInt2133 ^ 0xffffffff) == -71) {
					Class211.aClass40_2860 = new Class40(class163, 11, true,
							Class11_Sub45_Sub13.aCanvas9308);
					Class164.anInt2133 = 73;
					Class141.method891((byte) 94, true);
					Class250.method1595((byte) 110);
				} else if (Class164.anInt2133 == 73) {
					Class108_Sub11.aClass40_6150 = new Class40(class163, 12,
							true, Class11_Sub45_Sub13.aCanvas9308);
					Class164.anInt2133 = 76;
					Class141.method891((byte) 86, true);
					Class250.method1595((byte) 86);
				} else if (Class164.anInt2133 == 76) {
					Class357.aClass40_4667 = new Class40(class163, 14, true,
							Class11_Sub45_Sub13.aCanvas9308);
					Class164.anInt2133 = 79;
					Class141.method891((byte) 113, true);
					Class250.method1595((byte) 80);
				} else if (Class164.anInt2133 == 79) {
					Class300.aClass40_4048 = new Class40(class163, 17, true,
							Class11_Sub45_Sub13.aCanvas9308);
					Class164.anInt2133 = 82;
					Class141.method891((byte) 94, true);
					Class250.method1595((byte) -80);
				} else if (Class164.anInt2133 == 82) {
					Class117.aClass40_1596 = new Class40(class163, 19, true,
							Class11_Sub45_Sub13.aCanvas9308);
					Class164.anInt2133 = 85;
					Class141.method891((byte) 84, true);
					Class250.method1595((byte) 107);
				} else if (Class164.anInt2133 == 85) {
					Class11_Sub32.aClass40_6869 = new Class40(class163, 22,
							true, Class11_Sub45_Sub13.aCanvas9308);
					Class164.anInt2133 = 88;
					Class141.method891((byte) 100, true);
					Class250.method1595((byte) 102);
				} else if (Class164.anInt2133 == 88) {
					Class112.aClass40_1543 = new Class40(class163, 26, true,
							Class11_Sub45_Sub13.aCanvas9308);
					Class164.anInt2133 = 91;
					Class141.method891((byte) 114, true);
					Class250.method1595((byte) -104);
				} else {
					Class11_Sub45_Sub12.aClass40_9190 = new Class40(class163,
							30, true, Class11_Sub45_Sub13.aCanvas9308);
					Class164.anInt2133 = 100;
					if (i > 43) {
						Class141.method891((byte) 74, true);
						Class250.method1595((byte) 83);
						System.gc();
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fw.CA("
					+ (interface1 != null ? "{...}" : "null") + ','
					+ (class163 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method287(int i, int i_49_, int i_50_, int[] is) {
		try {
			i_50_ -= ((Class33_Sub1) this).aFloat6168;
			i_49_ -= ((Class33_Sub1) this).aFloat6191;
			anInt6177++;
			i -= ((Class33_Sub1) this).aFloat6201;
			is[2] = (int) ((float) i_49_ * ((Class33_Sub1) this).aFloat6183
					+ ((Class33_Sub1) this).aFloat6179 * (float) i + (float) i_50_
					* ((Class33_Sub1) this).aFloat6174);
			is[0] = (int) (((Class33_Sub1) this).aFloat6197 * (float) i_50_ + (((Class33_Sub1) this).aFloat6164
					* (float) i + ((float) i_49_ * ((Class33_Sub1) this).aFloat6162)));
			is[1] = (int) ((float) i_50_ * ((Class33_Sub1) this).aFloat6192 + (((Class33_Sub1) this).aFloat6200
					* (float) i + (((Class33_Sub1) this).aFloat6185 * (float) i_49_)));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fw.G(" + i + ','
					+ i_49_ + ',' + i_50_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final float[] method2634(int i) {
		try {
			Class366.aFloatArray4815[4] = ((Class33_Sub1) this).aFloat6200;
			Class366.aFloatArray4815[13] = ((Class33_Sub1) this).aFloat6191;
			Class366.aFloatArray4815[2] = ((Class33_Sub1) this).aFloat6197;
			Class366.aFloatArray4815[1] = ((Class33_Sub1) this).aFloat6162;
			Class366.aFloatArray4815[12] = ((Class33_Sub1) this).aFloat6201;
			Class366.aFloatArray4815[10] = ((Class33_Sub1) this).aFloat6174;
			Class366.aFloatArray4815[8] = ((Class33_Sub1) this).aFloat6179;
			Class366.aFloatArray4815[6] = ((Class33_Sub1) this).aFloat6192;
			Class366.aFloatArray4815[5] = ((Class33_Sub1) this).aFloat6185;
			Class366.aFloatArray4815[9] = ((Class33_Sub1) this).aFloat6183;
			Class366.aFloatArray4815[0] = ((Class33_Sub1) this).aFloat6164;
			Class366.aFloatArray4815[14] = ((Class33_Sub1) this).aFloat6168;
			anInt6173++;
			if (i <= 16)
				method295(13, 19, -69, null);
			return Class366.aFloatArray4815;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fw.I(" + i + ')');
		}
	}

	final float[] method2635(byte i) {
		try {
			Class366.aFloatArray4815[1] = ((Class33_Sub1) this).aFloat6162;
			Class366.aFloatArray4815[14] = 0.0F;
			Class366.aFloatArray4815[9] = ((Class33_Sub1) this).aFloat6183;
			Class366.aFloatArray4815[2] = ((Class33_Sub1) this).aFloat6197;
			Class366.aFloatArray4815[5] = ((Class33_Sub1) this).aFloat6185;
			Class366.aFloatArray4815[10] = ((Class33_Sub1) this).aFloat6174;
			Class366.aFloatArray4815[6] = ((Class33_Sub1) this).aFloat6192;
			Class366.aFloatArray4815[8] = ((Class33_Sub1) this).aFloat6179;
			anInt6170++;
			Class366.aFloatArray4815[0] = ((Class33_Sub1) this).aFloat6164;
			Class366.aFloatArray4815[12] = 0.0F;
			Class366.aFloatArray4815[4] = ((Class33_Sub1) this).aFloat6200;
			Class366.aFloatArray4815[13] = 0.0F;
			int i_51_ = 12 % ((-11 - i) / 39);
			return Class366.aFloatArray4815;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fw.T(" + i + ')');
		}
	}

	final void method297(int i) {
		try {
			anInt6172++;
			float f = Class376_Sub7_Sub3.aFloatArray9276[0x3fff & i];
			float f_52_ = Class376_Sub7_Sub3.aFloatArray9279[i & 0x3fff];
			float f_53_ = ((Class33_Sub1) this).aFloat6164;
			float f_54_ = ((Class33_Sub1) this).aFloat6200;
			float f_55_ = ((Class33_Sub1) this).aFloat6179;
			float f_56_ = ((Class33_Sub1) this).aFloat6201;
			((Class33_Sub1) this).aFloat6164 = -(((Class33_Sub1) this).aFloat6162 * f_52_)
					+ f * f_53_;
			((Class33_Sub1) this).aFloat6200 = f_54_ * f
					- ((Class33_Sub1) this).aFloat6185 * f_52_;
			((Class33_Sub1) this).aFloat6162 = ((Class33_Sub1) this).aFloat6162
					* f + f_53_ * f_52_;
			((Class33_Sub1) this).aFloat6179 = -(((Class33_Sub1) this).aFloat6183 * f_52_)
					+ f_55_ * f;
			((Class33_Sub1) this).aFloat6185 = ((Class33_Sub1) this).aFloat6185
					* f + f_54_ * f_52_;
			((Class33_Sub1) this).aFloat6201 = -(f_52_ * ((Class33_Sub1) this).aFloat6191)
					+ f_56_ * f;
			((Class33_Sub1) this).aFloat6183 = ((Class33_Sub1) this).aFloat6183
					* f + f_55_ * f_52_;
			((Class33_Sub1) this).aFloat6191 = ((Class33_Sub1) this).aFloat6191
					* f + f_52_ * f_56_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fw.EA(" + i + ')');
		}
	}

	final void method295(int i, int i_57_, int i_58_, int[] is) {
		try {
			is[1] = (int) ((float) i_58_
					* ((Class33_Sub1) this).aFloat6183
					+ ((float) i_57_ * ((Class33_Sub1) this).aFloat6185 + (float) i
							* ((Class33_Sub1) this).aFloat6162) + ((Class33_Sub1) this).aFloat6191);
			is[0] = (int) (((Class33_Sub1) this).aFloat6201 + (((Class33_Sub1) this).aFloat6179
					* (float) i_58_ + (((Class33_Sub1) this).aFloat6200
					* (float) i_57_ + (((Class33_Sub1) this).aFloat6164 * (float) i))));
			anInt6186++;
			is[2] = (int) (((Class33_Sub1) this).aFloat6168 + ((float) i_57_
					* ((Class33_Sub1) this).aFloat6192
					+ ((Class33_Sub1) this).aFloat6197 * (float) i + (((Class33_Sub1) this).aFloat6174 * (float) i_58_)));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fw.BA(" + i + ','
					+ i_57_ + ',' + i_58_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2636(int i, int i_59_, float f, int i_60_, float f_61_,
			float f_62_, int i_63_) {
		try {
			do {
				if (i_63_ != 0) {
					float f_64_ = Class376_Sub7_Sub3.aFloatArray9276[0x3fff & i_63_];
					float f_65_ = Class376_Sub7_Sub3.aFloatArray9279[i_63_ & 0x3fff];
					((Class33_Sub1) this).aFloat6174 = 1.0F;
					((Class33_Sub1) this).aFloat6200 = (float) i_59_ * -f_65_;
					((Class33_Sub1) this).aFloat6185 = f_64_ * (float) i_59_;
					((Class33_Sub1) this).aFloat6162 = f_65_ * (float) i_60_;
					((Class33_Sub1) this).aFloat6164 = (float) i_60_ * f_64_;
					((Class33_Sub1) this).aFloat6197 = ((Class33_Sub1) this).aFloat6192 = ((Class33_Sub1) this).aFloat6179 = ((Class33_Sub1) this).aFloat6183 = 0.0F;
					if (!client.aBool10531)
						break;
				}
				((Class33_Sub1) this).aFloat6185 = (float) i_59_;
				((Class33_Sub1) this).aFloat6162 = ((Class33_Sub1) this).aFloat6197 = ((Class33_Sub1) this).aFloat6200 = ((Class33_Sub1) this).aFloat6192 = ((Class33_Sub1) this).aFloat6179 = ((Class33_Sub1) this).aFloat6183 = 0.0F;
				((Class33_Sub1) this).aFloat6174 = 1.0F;
				((Class33_Sub1) this).aFloat6164 = (float) i_60_;
			} while (false);
			if (i == 1) {
				anInt6188++;
				((Class33_Sub1) this).aFloat6168 = f;
				((Class33_Sub1) this).aFloat6191 = f_62_;
				((Class33_Sub1) this).aFloat6201 = f_61_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fw.E(" + i + ','
					+ i_59_ + ',' + f + ',' + i_60_ + ',' + f_61_ + ',' + f_62_
					+ ',' + i_63_ + ')'));
		}
	}

	static final void method2637(int i, int i_66_) {
		try {
			anInt6167++;
			if (Class11_Sub16.method2449(126, i) && i_66_ <= -59)
				Class11_Sub45_Sub8.method3453(
						(Class11_Sub45_Sub5.aClass192ArrayArray8772[i]),
						(byte) -9, -1);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fw.B(" + i + ','
					+ i_66_ + ')');
		}
	}

	final void method299(int i, int i_67_, int i_68_) {
		try {
			((Class33_Sub1) this).aFloat6191 += (float) i_67_;
			((Class33_Sub1) this).aFloat6201 += (float) i;
			((Class33_Sub1) this).aFloat6168 += (float) i_68_;
			anInt6181++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fw.V(" + i + ','
					+ i_67_ + ',' + i_68_ + ')'));
		}
	}

	final void method2638(int i) {
		try {
			if (i == 11) {
				((Class33_Sub1) this).aFloat6174 = -((Class33_Sub1) this).aFloat6174;
				((Class33_Sub1) this).aFloat6162 = -((Class33_Sub1) this).aFloat6162;
				((Class33_Sub1) this).aFloat6183 = -((Class33_Sub1) this).aFloat6183;
				((Class33_Sub1) this).aFloat6185 = -((Class33_Sub1) this).aFloat6185;
				((Class33_Sub1) this).aFloat6197 = -((Class33_Sub1) this).aFloat6197;
				((Class33_Sub1) this).aFloat6191 = -((Class33_Sub1) this).aFloat6191;
				((Class33_Sub1) this).aFloat6168 = -((Class33_Sub1) this).aFloat6168;
				((Class33_Sub1) this).aFloat6192 = -((Class33_Sub1) this).aFloat6192;
				anInt6166++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fw.F(" + i + ')');
		}
	}

	final void method286(int i) {
		try {
			anInt6184++;
			((Class33_Sub1) this).aFloat6164 = 1.0F;
			((Class33_Sub1) this).aFloat6185 = ((Class33_Sub1) this).aFloat6174 = Class376_Sub7_Sub3.aFloatArray9276[0x3fff & i];
			((Class33_Sub1) this).aFloat6192 = Class376_Sub7_Sub3.aFloatArray9279[i & 0x3fff];
			((Class33_Sub1) this).aFloat6183 = -((Class33_Sub1) this).aFloat6192;
			((Class33_Sub1) this).aFloat6200 = ((Class33_Sub1) this).aFloat6179 = ((Class33_Sub1) this).aFloat6201 = ((Class33_Sub1) this).aFloat6162 = ((Class33_Sub1) this).aFloat6191 = ((Class33_Sub1) this).aFloat6197 = ((Class33_Sub1) this).aFloat6168 = 0.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fw.GA(" + i + ')');
		}
	}

	final void method298(int i) {
		try {
			anInt6195++;
			((Class33_Sub1) this).aFloat6185 = 1.0F;
			((Class33_Sub1) this).aFloat6164 = ((Class33_Sub1) this).aFloat6174 = Class376_Sub7_Sub3.aFloatArray9276[0x3fff & i];
			((Class33_Sub1) this).aFloat6179 = Class376_Sub7_Sub3.aFloatArray9279[0x3fff & i];
			((Class33_Sub1) this).aFloat6197 = -((Class33_Sub1) this).aFloat6179;
			((Class33_Sub1) this).aFloat6200 = ((Class33_Sub1) this).aFloat6201 = ((Class33_Sub1) this).aFloat6162 = ((Class33_Sub1) this).aFloat6183 = ((Class33_Sub1) this).aFloat6191 = ((Class33_Sub1) this).aFloat6192 = ((Class33_Sub1) this).aFloat6168 = 0.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fw.L(" + i + ')');
		}
	}

	public Class33_Sub1() {
		try {
			method289();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fw.<init>(" + ')');
		}
	}

	static {
		aStringArray6176 = new String[100];
	}
}
