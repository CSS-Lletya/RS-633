/* Class12_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class12_Sub3 extends Class12 {
	int[][][] anIntArrayArrayArray6446;
	static int anInt6447;
	static int anInt6448;
	private Class156 aClass156_6449;
	static int anInt6450;
	private int[][][] anIntArrayArrayArray6451;
	int anInt6452;
	static int anInt6453;
	static int anInt6454;
	static int anInt6455;
	private int[][][] anIntArrayArrayArray6456;
	static int anInt6457;
	short[][] aShortArrayArray6458;
	static int anInt6459;
	private int anInt6460;
	static int anInt6461;
	private Class84 aClass84_6462 = new Class84();
	static int anInt6463;
	private int anInt6464;
	private int[][][] anIntArrayArrayArray6465;
	int[][][] anIntArrayArrayArray6466;
	int[][][] anIntArrayArrayArray6467;
	static int anInt6468;
	static int anInt6469;
	private int anInt6470;
	static int anInt6471;
	static int anInt6472;
	static int anInt6473;
	private Class11_Sub7[][][] aClass11_Sub7ArrayArrayArray6474;
	private byte[][] aByteArrayArray6475;
	Class163_Sub3 aClass163_Sub3_6476;
	private int anInt6477;
	private float[][] aFloatArrayArray6478;
	private float[][] aFloatArrayArray6479;
	private float[][] aFloatArrayArray6480;
	private Interface9 anInterface9_6481;
	Class350 aClass350_6482;
	private byte[][] aByteArrayArray6483;
	Class350 aClass350_6484;
	Class350 aClass350_6485;
	private int anInt6486;
	private Class350 aClass350_6487;
	private Class11_Sub7[] aClass11_Sub7Array6488;
	private int anInt6489;
	private Class213 aClass213_6490;

	final void method136(Class11_Sub46 class11_sub46, int[] is) {
		try {
			anInt6469++;
			aClass84_6462.method589((byte) -13, new Class11_Sub28(
					(((Class12_Sub3) this).aClass163_Sub3_6476), this,
					class11_sub46, is));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("io.B("
					+ (class11_sub46 != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final Class11_Sub45_Sub1 fa(int i, int i_0_,
			Class11_Sub45_Sub1 class11_sub45_sub1) {
		try {
			anInt6457++;
			if ((0x1 & aByteArrayArray6475[i][i_0_] ^ 0xffffffff) == -1)
				return null;
			int i_1_ = (((Class12) this).anInt93 >> ((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).anInt8269);
			Class11_Sub45_Sub1_Sub2 class11_sub45_sub1_sub2 = (Class11_Sub45_Sub1_Sub2) class11_sub45_sub1;
			Class11_Sub45_Sub1_Sub2 class11_sub45_sub1_sub2_2_;
			do {
				if (class11_sub45_sub1_sub2 == null
						|| !class11_sub45_sub1_sub2.method3874(i_1_, i_1_,
								(byte) 60)) {
					class11_sub45_sub1_sub2_2_ = new Class11_Sub45_Sub1_Sub2(
							(((Class12_Sub3) this).aClass163_Sub3_6476), i_1_,
							i_1_);
					if (!client.aBool10531)
						break;
				}
				class11_sub45_sub1_sub2_2_ = class11_sub45_sub1_sub2;
				class11_sub45_sub1_sub2_2_.method3877(100);
			} while (false);
			class11_sub45_sub1_sub2_2_.method3875(0, i_1_, 0, i_1_, 0);
			method2696((byte) 102, i, i_0_, class11_sub45_sub1_sub2_2_);
			return class11_sub45_sub1_sub2_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("io.fa(" + i + ','
					+ i_0_ + ','
					+ (class11_sub45_sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method132(int i, int i_3_, int i_4_, boolean[][] bools,
			boolean bool, int i_5_) {
		try {
			method2695(i, bools, -2, i_5_, -1, bool, i_3_, i_4_);
			anInt6447++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("io.F(" + i + ','
					+ i_3_ + ',' + i_4_ + ','
					+ (bools != null ? "{...}" : "null") + ',' + bool + ','
					+ i_5_ + ')'));
		}
	}

	final void CA(Class11_Sub45_Sub1 class11_sub45_sub1, int i, int i_6_,
			int i_7_, int i_8_, boolean bool) {
		try {
			anInt6472++;
			if (aClass156_6449 != null && class11_sub45_sub1 != null) {
				int i_9_ = (-((((Class163_Sub3) ((Class12_Sub3) this).aClass163_Sub3_6476).anInt8362 * i_6_) >> 8)
						+ i >> ((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).anInt8269);
				int i_10_ = (-((((Class163_Sub3) ((Class12_Sub3) this).aClass163_Sub3_6476).anInt8339 * i_6_) >> 8)
						+ i_7_ >> ((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).anInt8269);
				aClass156_6449.method981(-1, i_9_, i_10_, class11_sub45_sub1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("io.CA("
					+ (class11_sub45_sub1 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + bool + ')'));
		}
	}

	final void ka(int i, int i_11_, int i_12_) {
		do {
			try {
				anInt6455++;
				if ((aByteArrayArray6483[i][i_11_] & 0xff ^ 0xffffffff) <= (i_12_ ^ 0xffffffff))
					break;
				aByteArrayArray6483[i][i_11_] = (byte) i_12_;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("io.ka(" + i + ','
						+ i_11_ + ',' + i_12_ + ')'));
			}
			break;
		} while (false);
	}

	final void wa(Class11_Sub45_Sub1 class11_sub45_sub1, int i, int i_13_,
			int i_14_, int i_15_, boolean bool) {
		try {
			anInt6461++;
			if (aClass156_6449 != null && class11_sub45_sub1 != null) {
				int i_16_ = (-((((Class163_Sub3) ((Class12_Sub3) this).aClass163_Sub3_6476).anInt8362 * i_13_) >> 8)
						+ i >> ((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).anInt8269);
				int i_17_ = (-(i_13_
						* (((Class163_Sub3) ((Class12_Sub3) this).aClass163_Sub3_6476).anInt8339) >> 8)
						+ i_14_ >> ((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).anInt8269);
				aClass156_6449.method974(i_16_, i_17_, false,
						class11_sub45_sub1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("io.wa(" + (class11_sub45_sub1 != null ? "{...}" : "null")
							+ ',' + i + ',' + i_13_ + ',' + i_14_ + ',' + i_15_
							+ ',' + bool + ')'));
		}
	}

	Class12_Sub3(Class163_Sub3 class163_sub3, int i, int i_18_, int i_19_,
			int i_20_, int[][] is, int[][] is_21_, int i_22_) {
		super(i_19_, i_20_, i_22_, is);
		do {
			try {
				anInt6470 = -2 + ((Class12) this).anInt97;
				((Class12_Sub3) this).aClass163_Sub3_6476 = class163_sub3;
				((Class12_Sub3) this).anInt6452 = i_18_;
				anIntArrayArrayArray6456 = new int[i_19_][i_20_][];
				aFloatArrayArray6479 = (new float[((Class12) this).anInt103 + 1][((Class12) this).anInt98 + 1]);
				((Class12_Sub3) this).anIntArrayArrayArray6466 = new int[i_19_][i_20_][];
				aFloatArrayArray6480 = (new float[1 + ((Class12) this).anInt103][1 + ((Class12) this).anInt98]);
				aClass11_Sub7ArrayArrayArray6474 = new Class11_Sub7[i_19_][i_20_][];
				aByteArrayArray6475 = new byte[i_19_][i_20_];
				((Class12_Sub3) this).anIntArrayArrayArray6467 = new int[i_19_][i_20_][];
				aByteArrayArray6483 = new byte[1 + i_19_][i_20_ + 1];
				((Class12_Sub3) this).anIntArrayArrayArray6446 = new int[i_19_][i_20_][];
				anIntArrayArrayArray6451 = new int[i_19_][i_20_][];
				aFloatArrayArray6478 = (new float[((Class12) this).anInt103 + 1][((Class12) this).anInt98 + 1]);
				((Class12_Sub3) this).aShortArrayArray6458 = new short[i_19_
						* i_20_][];
				anInt6477 = 1 << anInt6470;
				for (int i_23_ = 1; ((i_23_ ^ 0xffffffff) > (((Class12) this).anInt98 ^ 0xffffffff)); i_23_++) {
					for (int i_24_ = 1; ((i_24_ ^ 0xffffffff) > (((Class12) this).anInt103 ^ 0xffffffff)); i_24_++) {
						int i_25_ = (-is_21_[i_24_ - 1][i_23_] + is_21_[1 + i_24_][i_23_]);
						int i_26_ = (is_21_[i_24_][i_23_ + 1] - is_21_[i_24_][i_23_ - 1]);
						float f = (float) (1.0 / (Math
								.sqrt((double) (i_26_ * i_26_ + (i_25_ * i_25_ - -(4 * i_22_ * i_22_))))));
						aFloatArrayArray6480[i_24_][i_23_] = (float) i_25_ * f;
						aFloatArrayArray6478[i_24_][i_23_] = f
								* (float) (2 * -i_22_);
						aFloatArrayArray6479[i_24_][i_23_] = f * (float) i_26_;
					}
				}
				aClass213_6490 = new Class213(128);
				if ((0x10 & ((Class12_Sub3) this).anInt6452 ^ 0xffffffff) == -1)
					break;
				aClass156_6449 = new Class156(
						((Class12_Sub3) this).aClass163_Sub3_6476, this);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("io.<init>("
								+ (class163_sub3 != null ? "{...}" : "null")
								+ ',' + i + ',' + i_18_ + ',' + i_19_ + ','
								+ i_20_ + ',' + (is != null ? "{...}" : "null")
								+ ',' + (is_21_ != null ? "{...}" : "null")
								+ ',' + i_22_ + ')'));
			}
			break;
		} while (false);
	}

	final void method127(int i, int i_27_) {
		try {
			anInt6463++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "io.I(" + i + ','
					+ i_27_ + ')');
		}
	}

	final void method133(int i, int i_28_, int i_29_, int i_30_, int i_31_,
			int i_32_, int i_33_, boolean[][] bools) {
		do {
			try {
				anInt6448++;
				if ((anInt6486 ^ 0xffffffff) < -1) {
					((Class12_Sub3) this).aClass163_Sub3_6476.method3281(6);
					((Class12_Sub3) this).aClass163_Sub3_6476.method3254(false,
							(byte) 83);
					((Class12_Sub3) this).aClass163_Sub3_6476.method3267(false,
							-25994);
					((Class12_Sub3) this).aClass163_Sub3_6476.method3248(false,
							89);
					((Class12_Sub3) this).aClass163_Sub3_6476.method3250(
							(byte) 87, false);
					((Class12_Sub3) this).aClass163_Sub3_6476.method3283(1, 0);
					((Class12_Sub3) this).aClass163_Sub3_6476.method3291(113,
							-2);
					((Class12_Sub3) this).aClass163_Sub3_6476.method3295(null,
							92);
					Class108_Sub6.aFloatArray5630[14] = 0.0F;
					Class108_Sub6.aFloatArray5630[5] = ((float) i_29_ / (128.0F * (float) ((Class12) this).anInt93 * (float) ((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).anInt8141));
					Class108_Sub6.aFloatArray5630[9] = 0.0F;
					Class108_Sub6.aFloatArray5630[6] = 0.0F;
					Class108_Sub6.aFloatArray5630[12] = -1.0F
							- (((float) -(i * 2) + (float) (i_30_ * i_29_) / 128.0F) / (float) (((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).anInt8248));
					Class108_Sub6.aFloatArray5630[8] = 0.0F;
					Class108_Sub6.aFloatArray5630[4] = 0.0F;
					Class108_Sub6.aFloatArray5630[15] = 1.0F;
					Class108_Sub6.aFloatArray5630[7] = 0.0F;
					Class108_Sub6.aFloatArray5630[1] = 0.0F;
					Class108_Sub6.aFloatArray5630[3] = 0.0F;
					Class108_Sub6.aFloatArray5630[11] = 0.0F;
					Class108_Sub6.aFloatArray5630[13] = 1.0F - (((float) (i_29_ * i_33_) / 128.0F + (float) (i_28_ * 2)) / (float) (((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).anInt8141));
					Class108_Sub6.aFloatArray5630[10] = 0.0F;
					Class108_Sub6.aFloatArray5630[2] = 0.0F;
					Class108_Sub6.aFloatArray5630[0] = ((float) i_29_ / ((float) (((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).anInt8248) * (128.0F * (float) ((Class12) this).anInt93)));
					OpenGL.glMatrixMode(5889);
					OpenGL.glLoadMatrixf(Class108_Sub6.aFloatArray5630, 0);
					Class108_Sub6.aFloatArray5630[6] = 1.0F;
					Class108_Sub6.aFloatArray5630[4] = 0.0F;
					Class108_Sub6.aFloatArray5630[9] = 1.0F;
					Class108_Sub6.aFloatArray5630[14] = 0.0F;
					Class108_Sub6.aFloatArray5630[0] = 1.0F;
					Class108_Sub6.aFloatArray5630[11] = 0.0F;
					Class108_Sub6.aFloatArray5630[10] = 0.0F;
					Class108_Sub6.aFloatArray5630[15] = 1.0F;
					Class108_Sub6.aFloatArray5630[3] = 0.0F;
					Class108_Sub6.aFloatArray5630[5] = 0.0F;
					Class108_Sub6.aFloatArray5630[1] = 0.0F;
					Class108_Sub6.aFloatArray5630[13] = 0.0F;
					Class108_Sub6.aFloatArray5630[8] = 0.0F;
					Class108_Sub6.aFloatArray5630[7] = 0.0F;
					Class108_Sub6.aFloatArray5630[12] = 0.0F;
					Class108_Sub6.aFloatArray5630[2] = 0.0F;
					OpenGL.glMatrixMode(5888);
					OpenGL.glLoadMatrixf(Class108_Sub6.aFloatArray5630, 0);
					if ((0x7 & ((Class12_Sub3) this).anInt6452 ^ 0xffffffff) != -1) {
						((Class12_Sub3) this).aClass163_Sub3_6476.method3267(
								true, -25994);
						((Class12_Sub3) this).aClass163_Sub3_6476
								.method3316(false);
					} else
						((Class12_Sub3) this).aClass163_Sub3_6476.method3267(
								false, -25994);
					((Class12_Sub3) this).aClass163_Sub3_6476.method3304(
							((Class12_Sub3) this).aClass350_6485,
							((Class12_Sub3) this).aClass350_6482,
							aClass350_6487, (byte) 125,
							((Class12_Sub3) this).aClass350_6484);
					if (anInt6464 * 2 > (((Stream) (((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).aClass11_Sub20_Sub2_8406)).buffer).length)
						((Class163_Sub3) ((Class12_Sub3) this).aClass163_Sub3_6476).aClass11_Sub20_Sub2_8406 = new Class11_Sub20_Sub2(
								2 * anInt6464);
					else
						((Stream) (((Class163_Sub3) ((Class12_Sub3) this).aClass163_Sub3_6476).aClass11_Sub20_Sub2_8406)).position = 0;
					int i_34_ = 0;
					Class11_Sub20_Sub2 class11_sub20_sub2 = (((Class163_Sub3) ((Class12_Sub3) this).aClass163_Sub3_6476).aClass11_Sub20_Sub2_8406);
					if (!((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).aBool8348) {
						for (int i_35_ = i_31_; i_35_ < i_33_; i_35_++) {
							int i_36_ = i_30_ + ((Class12) this).anInt103
									* i_35_;
							for (int i_37_ = i_30_; i_32_ > i_37_; i_37_++) {
								if (bools[-i_30_ + i_37_][i_35_ + -i_31_]) {
									short[] is = (((Class12_Sub3) this).aShortArrayArray6458[i_36_]);
									if (is != null) {
										for (int i_38_ = 0; ((i_38_ ^ 0xffffffff) > (is.length ^ 0xffffffff)); i_38_++) {
											i_34_++;
											class11_sub20_sub2.method2539(
													0xffff & is[i_38_],
													-1682769048);
										}
									}
								}
								i_36_++;
							}
						}
					} else {
						for (int i_39_ = i_31_; (i_33_ ^ 0xffffffff) < (i_39_ ^ 0xffffffff); i_39_++) {
							int i_40_ = i_39_ * ((Class12) this).anInt103
									+ i_30_;
							for (int i_41_ = i_30_; (i_41_ ^ 0xffffffff) > (i_32_ ^ 0xffffffff); i_41_++) {
								if (bools[-i_30_ + i_41_][-i_31_ + i_39_]) {
									short[] is = (((Class12_Sub3) this).aShortArrayArray6458[i_40_]);
									if (is != null) {
										for (int i_42_ = 0; i_42_ < is.length; i_42_++) {
											i_34_++;
											class11_sub20_sub2.writeShort(-125,
													0xffff & is[i_42_]);
										}
									}
								}
								i_40_++;
							}
						}
					}
					if ((i_34_ ^ 0xffffffff) >= -1)
						break;
					Class75_Sub1 class75_sub1 = (new Class75_Sub1(
							((Class12_Sub3) this).aClass163_Sub3_6476, 5123,
							((Stream) class11_sub20_sub2).buffer,
							((Stream) class11_sub20_sub2).position));
					((Class12_Sub3) this).aClass163_Sub3_6476.method3288(111,
							0, 4, i_34_, class75_sub1);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("io.D(" + i + ','
						+ i_28_ + ',' + i_29_ + ',' + i_30_ + ',' + i_31_ + ','
						+ i_32_ + ',' + i_33_ + ','
						+ (bools != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method135(int i, int i_43_, int i_44_, boolean[][] bools,
			boolean bool, int i_45_, int i_46_) {
		try {
			anInt6450++;
			method2695(i, bools, -2, i_46_, i_45_, bool, i_43_, i_44_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("io.H(" + i + ','
					+ i_43_ + ',' + i_44_ + ','
					+ (bools != null ? "{...}" : "null") + ',' + bool + ','
					+ i_45_ + ',' + i_46_ + ')'));
		}
	}

	private final void method2695(int i, boolean[][] bools, int i_47_,
			int i_48_, int i_49_, boolean bool, int i_50_, int i_51_) {
		try {
			if (i_47_ != -2)
				anInt6486 = 10;
			if (aClass11_Sub7Array6488 != null) {
				int i_52_ = 1 + (i_51_ + i_51_);
				i_52_ *= i_52_;
				if ((i_52_ ^ 0xffffffff) < ((((Class163_Sub3) ((Class12_Sub3) this).aClass163_Sub3_6476).anIntArray8417).length ^ 0xffffffff))
					((Class163_Sub3) ((Class12_Sub3) this).aClass163_Sub3_6476).anIntArray8417 = new int[i_52_];
				if ((anInt6464 * 2 ^ 0xffffffff) < ((((Stream) (((Class163_Sub3) ((Class12_Sub3) this).aClass163_Sub3_6476).aClass11_Sub20_Sub2_8406)).buffer).length ^ 0xffffffff))
					((Class163_Sub3) ((Class12_Sub3) this).aClass163_Sub3_6476).aClass11_Sub20_Sub2_8406 = new Class11_Sub20_Sub2(
							2 * anInt6464);
				int i_53_ = -i_51_ + i;
				int i_54_ = i_53_;
				if ((i_53_ ^ 0xffffffff) > -1)
					i_53_ = 0;
				int i_55_ = -i_51_ + i_50_;
				int i_56_ = i_55_;
				if ((i_55_ ^ 0xffffffff) > -1)
					i_55_ = 0;
				int i_57_ = i_51_ + i;
				if ((i_57_ ^ 0xffffffff) < (-1 + ((Class12) this).anInt103 ^ 0xffffffff))
					i_57_ = -1 + ((Class12) this).anInt103;
				int i_58_ = i_51_ + i_50_;
				if ((((Class12) this).anInt98 - 1 ^ 0xffffffff) > (i_58_ ^ 0xffffffff))
					i_58_ = ((Class12) this).anInt98 - 1;
				int i_59_ = 0;
				int[] is = (((Class163_Sub3) ((Class12_Sub3) this).aClass163_Sub3_6476).anIntArray8417);
				for (int i_60_ = i_53_; i_57_ >= i_60_; i_60_++) {
					boolean[] bools_61_ = bools[-i_54_ + i_60_];
					for (int i_62_ = i_55_; (i_58_ ^ 0xffffffff) <= (i_62_ ^ 0xffffffff); i_62_++) {
						if (bools_61_[-i_56_ + i_62_])
							is[i_59_++] = i_60_ + i_62_
									* ((Class12) this).anInt103;
					}
				}
				if (i_49_ != -1) {
					((Class12_Sub3) this).aClass163_Sub3_6476.method3321(
							(float) i_49_, (byte) -79);
					((Class12_Sub3) this).aClass163_Sub3_6476.method3279(-17);
				} else
					((Class12_Sub3) this).aClass163_Sub3_6476.method3308(32);
				((Class12_Sub3) this).aClass163_Sub3_6476
						.method3267(
								((0x7 & ((Class12_Sub3) this).anInt6452 ^ 0xffffffff) != -1),
								i_47_ - 25992);
				for (int i_63_ = 0; aClass11_Sub7Array6488.length > i_63_; i_63_++)
					aClass11_Sub7Array6488[i_63_].method2324(i_59_,
							(byte) -103, is);
				if (!aClass84_6462.method576((byte) 27)) {
					int i_64_ = (((Class163_Sub3) ((Class12_Sub3) this).aClass163_Sub3_6476).anInt8337);
					int i_65_ = (((Class163_Sub3) ((Class12_Sub3) this).aClass163_Sub3_6476).anInt8323);
					((Class12_Sub3) this).aClass163_Sub3_6476
							.L(0,
									i_65_,
									((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).anInt8314);
					((Class12_Sub3) this).aClass163_Sub3_6476.method3267(false,
							i_47_ - 25992);
					((Class12_Sub3) this).aClass163_Sub3_6476.method3250(
							(byte) 87, false);
					((Class12_Sub3) this).aClass163_Sub3_6476
							.method3283(1, 128);
					((Class12_Sub3) this).aClass163_Sub3_6476
							.method3291(75, -2);
					((Class12_Sub3) this).aClass163_Sub3_6476
							.method3295(
									(((Class163_Sub3) ((Class12_Sub3) this).aClass163_Sub3_6476).aClass321_Sub3_8321),
									48);
					((Class12_Sub3) this).aClass163_Sub3_6476.method3315(false,
							8448, 7681);
					((Class12_Sub3) this).aClass163_Sub3_6476.method3252(
							(byte) 34, 0, 770, 34166);
					((Class12_Sub3) this).aClass163_Sub3_6476.method3317(34167,
							0, 770, (byte) 122);
					for (Class11 class11 = aClass84_6462.method584(-12261); class11 != null; class11 = aClass84_6462
							.method578(i_47_ - 15359)) {
						Class11_Sub28 class11_sub28 = (Class11_Sub28) class11;
						class11_sub28.method2720((byte) -125, i_51_, bools, i,
								i_50_);
					}
					((Class12_Sub3) this).aClass163_Sub3_6476.method3252(
							(byte) 34, 0, 768, 5890);
					((Class12_Sub3) this).aClass163_Sub3_6476.method3317(5890,
							0, 770, (byte) 121);
					((Class12_Sub3) this).aClass163_Sub3_6476.method3295(null,
							100);
					((Class12_Sub3) this).aClass163_Sub3_6476
							.L(i_64_,
									i_65_,
									((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).anInt8314);
				}
				if (aClass156_6449 != null) {
					OpenGL.glPushMatrix();
					OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
					((Class12_Sub3) this).aClass163_Sub3_6476.method3304(null,
							((Class12_Sub3) this).aClass350_6482, null,
							(byte) 113, ((Class12_Sub3) this).aClass350_6484);
					aClass156_6449.method975(bool, bools, i_50_, (byte) -69,
							i_51_, i);
					OpenGL.glPopMatrix();
				}
			}
			anInt6454++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("io.N(" + i + ','
					+ (bools != null ? "{...}" : "null") + ',' + i_47_ + ','
					+ i_48_ + ',' + i_49_ + ',' + bool + ',' + i_50_ + ','
					+ i_51_ + ')'));
		}
	}

	final void YA() {
		try {
			if (anInt6486 <= 0)
				aClass156_6449 = null;
			else {
				byte[][] is = (new byte[1 + ((Class12) this).anInt103][((Class12) this).anInt98 + 1]);
				for (int i = 1; ((Class12) this).anInt103 > i; i++) {
					for (int i_66_ = 1; ((i_66_ ^ 0xffffffff) > (((Class12) this).anInt98 ^ 0xffffffff)); i_66_++)
						is[i][i_66_] = (byte) ((aByteArrayArray6483[i][i_66_ - 1] >> 2)
								+ (aByteArrayArray6483[i + 1][i_66_] >> 3) + ((aByteArrayArray6483[i - 1][i_66_] >> 2)
								+ (aByteArrayArray6483[i][i_66_ + 1] >> 3) + (aByteArrayArray6483[i][i_66_] >> 1)));
				}
				aClass11_Sub7Array6488 = new Class11_Sub7[aClass213_6490
						.method1366(-72)];
				aClass213_6490.method1370(aClass11_Sub7Array6488, -1);
				for (int i = 0; aClass11_Sub7Array6488.length > i; i++)
					aClass11_Sub7Array6488[i].method2329(-68, anInt6486);
				int i = 24;
				if (anIntArrayArrayArray6465 != null)
					i += 4;
				if ((0x7 & ((Class12_Sub3) this).anInt6452) != 0)
					i += 12;
				jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer = ((Class163_Sub3) ((Class12_Sub3) this).aClass163_Sub3_6476).aNativeHeap8271
						.method531(anInt6486 * i, false);
				jaclib.memory.Stream stream = new jaclib.memory.Stream(
						nativeheapbuffer);
				Class11_Sub7[] class11_sub7s = new Class11_Sub7[anInt6486];
				int i_67_ = Class94.method635(-1350259935, anInt6486 / 4);
				if (i_67_ < 1)
					i_67_ = 1;
				Class213 class213 = new Class213(i_67_);
				Class11_Sub7[] class11_sub7s_68_ = new Class11_Sub7[anInt6489];
				for (int i_69_ = 0; ((((Class12) this).anInt103 ^ 0xffffffff) < (i_69_ ^ 0xffffffff)); i_69_++) {
					for (int i_70_ = 0; i_70_ < ((Class12) this).anInt98; i_70_++) {
						if ((((Class12_Sub3) this).anIntArrayArrayArray6466[i_69_][i_70_]) != null) {
							Class11_Sub7[] class11_sub7s_71_ = (aClass11_Sub7ArrayArrayArray6474[i_69_][i_70_]);
							int[] is_72_ = (((Class12_Sub3) this).anIntArrayArrayArray6467[i_69_][i_70_]);
							int[] is_73_ = (((Class12_Sub3) this).anIntArrayArrayArray6446[i_69_][i_70_]);
							int[] is_74_ = anIntArrayArrayArray6451[i_69_][i_70_];
							int[] is_75_ = (((Class12_Sub3) this).anIntArrayArrayArray6466[i_69_][i_70_]);
							int[] is_76_ = (anIntArrayArrayArray6456 == null ? null
									: anIntArrayArrayArray6456[i_69_][i_70_]);
							int[] is_77_ = (anIntArrayArrayArray6465 != null ? anIntArrayArrayArray6465[i_69_][i_70_]
									: null);
							if (is_74_ == null)
								is_74_ = is_75_;
							float f = aFloatArrayArray6480[i_69_][i_70_];
							float f_78_ = aFloatArrayArray6478[i_69_][i_70_];
							float f_79_ = aFloatArrayArray6479[i_69_][i_70_];
							float f_80_ = aFloatArrayArray6480[i_69_][i_70_ + 1];
							float f_81_ = aFloatArrayArray6478[i_69_][i_70_ + 1];
							float f_82_ = aFloatArrayArray6479[i_69_][i_70_ + 1];
							float f_83_ = aFloatArrayArray6480[i_69_ + 1][i_70_ + 1];
							float f_84_ = aFloatArrayArray6478[1 + i_69_][1 + i_70_];
							float f_85_ = aFloatArrayArray6479[1 + i_69_][i_70_ + 1];
							float f_86_ = aFloatArrayArray6480[1 + i_69_][i_70_];
							float f_87_ = aFloatArrayArray6478[i_69_ + 1][i_70_];
							float f_88_ = aFloatArrayArray6479[i_69_ + 1][i_70_];
							int i_89_ = 0xff & is[i_69_][i_70_];
							int i_90_ = 0xff & is[i_69_][i_70_ + 1];
							int i_91_ = is[i_69_ + 1][1 + i_70_] & 0xff;
							int i_92_ = 0xff & is[i_69_ + 1][i_70_];
							int i_93_ = 0;
							while_35_: for (int i_94_ = 0; is_75_.length > i_94_; i_94_++) {
								Class11_Sub7 class11_sub7 = class11_sub7s_71_[i_94_];
								for (int i_95_ = 0; i_93_ > i_95_; i_95_++) {
									if (class11_sub7s_68_[i_95_] == class11_sub7)
										continue while_35_;
								}
								class11_sub7s_68_[i_93_++] = class11_sub7;
							}
							short[] is_96_ = (((Class12_Sub3) this).aShortArrayArray6458[(i_70_
									* ((Class12) this).anInt103 - -i_69_)] = new short[is_75_.length]);
							for (int i_97_ = 0; is_75_.length > i_97_; i_97_++) {
								int i_98_ = ((i_69_ << ((Class12) this).anInt97) + is_72_[i_97_]);
								int i_99_ = ((i_70_ << ((Class12) this).anInt97) - -is_73_[i_97_]);
								int i_100_ = i_98_ >> anInt6470;
								int i_101_ = i_99_ >> anInt6470;
								int i_102_ = is_75_[i_97_];
								int i_103_ = is_74_[i_97_];
								int i_104_ = is_76_ == null ? 0 : is_76_[i_97_];
								long l = ((long) (i_100_ << 16)
										| ((long) i_103_ << 48 | (long) i_102_ << 32) | (long) i_101_);
								int i_105_ = is_72_[i_97_];
								int i_106_ = is_73_[i_97_];
								int i_107_ = 74;
								int i_108_ = 0;
								float f_109_ = 1.0F;
								float f_110_;
								float f_111_;
								float f_112_;
								if ((i_105_ ^ 0xffffffff) != -1 || i_106_ != 0) {
									if ((i_105_ ^ 0xffffffff) == -1
											&& (i_106_ == ((Class12) this).anInt93)) {
										f_112_ = f_80_;
										i_107_ -= i_90_;
										f_111_ = f_81_;
										f_110_ = f_82_;
									} else if (((i_105_ ^ 0xffffffff) != (((Class12) this).anInt93 ^ 0xffffffff))
											|| i_106_ != (((Class12) this).anInt93)) {
										if (((((Class12) this).anInt93 ^ 0xffffffff) == (i_105_ ^ 0xffffffff))
												&& i_106_ == 0) {
											f_112_ = f_86_;
											i_107_ -= i_92_;
											f_110_ = f_88_;
											f_111_ = f_87_;
										} else {
											float f_113_ = ((float) i_105_ / (float) (((Class12) this).anInt93));
											float f_114_ = ((float) i_106_ / (float) (((Class12) this).anInt93));
											float f_115_ = f_113_ * (f_86_ - f)
													+ f;
											float f_116_ = f_78_
													+ ((-f_78_ + f_87_) * f_113_);
											float f_117_ = (f_79_ + (f_88_ - f_79_)
													* f_113_);
											float f_118_ = ((f_83_ - f_80_)
													* f_113_ + f_80_);
											float f_119_ = (f_113_
													* (f_84_ - f_81_) + f_81_);
											f_111_ = f_116_
													+ ((-f_116_ + f_119_) * f_114_);
											float f_120_ = (f_82_ + (f_85_ - f_82_)
													* f_113_);
											f_112_ = (f_114_
													* (-f_115_ + f_118_) + f_115_);
											f_110_ = ((-f_117_ + f_120_)
													* f_114_ + f_117_);
											int i_121_ = (((i_92_ + -i_89_)
													* i_105_ >> (((Class12) this).anInt97)) + i_89_);
											int i_122_ = (((-i_90_ + i_91_)
													* i_105_ >> (((Class12) this).anInt97)) + i_90_);
											i_107_ -= (i_106_
													* (-i_121_ + i_122_) >> (((Class12) this).anInt97))
													+ i_121_;
										}
									} else {
										f_111_ = f_84_;
										f_112_ = f_83_;
										i_107_ -= i_91_;
										f_110_ = f_85_;
									}
								} else {
									f_110_ = f_79_;
									i_107_ -= i_89_;
									f_111_ = f_78_;
									f_112_ = f;
								}
								if (i_102_ != -1) {
									int i_123_ = i_107_ * (i_102_ & 0x7f) >> 7;
									if (i_123_ >= 2) {
										if ((i_123_ ^ 0xffffffff) < -127)
											i_123_ = 126;
									} else
										i_123_ = 2;
									i_108_ = (Class27.anIntArray359[i_123_
											| i_102_ & 0xff80]);
									if ((((Class12_Sub3) this).anInt6452 & 0x7 ^ 0xffffffff) == -1) {
										f_109_ = ((f_112_ * (((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).aFloatArray8328[0]))
												+ (((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).aFloatArray8328[1])
												* f_111_ + ((((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).aFloatArray8328[2]) * f_110_));
										f_109_ = ((f_109_ * (!(f_109_ > 0.0F) ? (((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).aFloat8403)
												: (((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).aFloat8375))) + (((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).aFloat8349));
									}
								}
								Class11 class11 = null;
								if ((-1 + anInt6477 & i_98_ ^ 0xffffffff) == -1
										&& (-1 + anInt6477 & i_99_) == 0)
									class11 = class213.method1369((byte) 26, l);
								int i_124_;
								if (class11 != null) {
									is_96_[i_97_] = ((Class11_Sub11) (Class11_Sub11) class11).aShort5399;
									i_124_ = is_96_[i_97_] & 0xffff;
									if ((i_102_ ^ 0xffffffff) != 0
											&& (((((Class11) class11_sub7s[i_124_]).aLong91) ^ 0xffffffffffffffffL) < (((Class11) (class11_sub7s_71_[i_97_])).aLong91 ^ 0xffffffffffffffffL)))
										class11_sub7s[i_124_] = class11_sub7s_71_[i_97_];
								} else {
									int i_125_;
									if (i_103_ == i_102_)
										i_125_ = i_108_;
									else {
										int i_126_ = i_107_ * (i_103_ & 0x7f) >> 7;
										if (i_126_ < 2)
											i_126_ = 2;
										else if (i_126_ > 126)
											i_126_ = 126;
										i_125_ = (Class27.anIntArray359[0xff80
												& i_103_ | i_126_]);
										if (((((Class12_Sub3) this).anInt6452 & 0x7) ^ 0xffffffff) == -1) {
											float f_127_ = ((f_111_ * (((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).aFloatArray8328[1]))
													+ ((((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).aFloatArray8328[0]) * f_112_) + ((((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).aFloatArray8328[2]) * f_110_));
											f_127_ = ((f_109_ * (f_109_ > 0.0F ? (((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).aFloat8375)
													: (((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).aFloat8403))) + (((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).aFloat8349));
											int i_128_ = i_125_ >> 16 & 0xff;
											int i_129_ = (i_125_ & 0xff1c) >> 8;
											int i_130_ = 0xff & i_125_;
											i_128_ *= f_127_;
											if (i_128_ >= 0) {
												if (i_128_ > 255)
													i_128_ = 255;
											} else
												i_128_ = 0;
											i_129_ *= f_127_;
											i_130_ *= f_127_;
											if (i_129_ >= 0) {
												if (i_129_ > 255)
													i_129_ = 255;
											} else
												i_129_ = 0;
											if ((i_130_ ^ 0xffffffff) <= -1) {
												if ((i_130_ ^ 0xffffffff) < -256)
													i_130_ = 255;
											} else
												i_130_ = 0;
											i_125_ = (i_129_ << 8
													| i_128_ << 16 | i_130_);
										}
									}
									if (!((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).aBool8348) {
										stream.method349((float) i_98_);
										stream.method349((float) (this
												.method130(i_99_, i_98_, -128) - -i_104_));
										stream.method349((float) i_99_);
										stream.method355((byte) (i_125_ >> 16));
										stream.method355((byte) (i_125_ >> 8));
										stream.method355((byte) i_125_);
										stream.method355(-1);
										stream.method349((float) i_98_);
										stream.method349((float) i_99_);
										if (anIntArrayArrayArray6465 != null)
											stream.method349((float) (is_77_ == null ? 0
													: (is_77_[i_97_] - 1)));
										if ((0x7 & ((Class12_Sub3) this).anInt6452) != 0) {
											stream.method349(f_112_);
											stream.method349(f_111_);
											stream.method349(f_110_);
										}
									} else {
										stream.method357((float) i_98_);
										stream.method357((float) (i_104_ + this
												.method130(i_99_, i_98_, 55)));
										stream.method357((float) i_99_);
										stream.method355((byte) (i_125_ >> 16));
										stream.method355((byte) (i_125_ >> 8));
										stream.method355((byte) i_125_);
										stream.method355(-1);
										stream.method357((float) i_98_);
										stream.method357((float) i_99_);
										if (anIntArrayArrayArray6465 != null)
											stream.method357((float) (is_77_ != null ? -1
													+ is_77_[i_97_]
													: 0));
										if ((0x7 & (((Class12_Sub3) this).anInt6452) ^ 0xffffffff) != -1) {
											stream.method357(f_112_);
											stream.method357(f_111_);
											stream.method357(f_110_);
										}
									}
									i_124_ = anInt6460++;
									is_96_[i_97_] = (short) i_124_;
									if ((i_102_ ^ 0xffffffff) != 0)
										class11_sub7s[i_124_] = class11_sub7s_71_[i_97_];
									class213.method1368(l, new Class11_Sub11(
											is_96_[i_97_]), (byte) -26);
								}
								for (int i_131_ = 0; ((i_131_ ^ 0xffffffff) > (i_93_ ^ 0xffffffff)); i_131_++)
									class11_sub7s_68_[i_131_].method2323(255,
											f_109_, i_107_, i_108_, i_124_);
								anInt6464++;
							}
						}
					}
				}
				for (int i_132_ = 0; (i_132_ ^ 0xffffffff) > (anInt6460 ^ 0xffffffff); i_132_++) {
					Class11_Sub7 class11_sub7 = class11_sub7s[i_132_];
					if (class11_sub7 != null)
						class11_sub7.method2322(i_132_, (byte) 46);
				}
				for (int i_133_ = 0; ((Class12) this).anInt103 > i_133_; i_133_++) {
					for (int i_134_ = 0; ((i_134_ ^ 0xffffffff) > (((Class12) this).anInt98 ^ 0xffffffff)); i_134_++) {
						short[] is_135_ = (((Class12_Sub3) this).aShortArrayArray6458[i_134_
								* ((Class12) this).anInt103 - -i_133_]);
						if (is_135_ != null) {
							int i_136_ = 0;
							int i_137_ = 0;
							while ((is_135_.length ^ 0xffffffff) < (i_137_ ^ 0xffffffff)) {
								int i_138_ = 0xffff & is_135_[i_137_++];
								int i_139_ = 0xffff & is_135_[i_137_++];
								int i_140_ = 0xffff & is_135_[i_137_++];
								Class11_Sub7 class11_sub7 = class11_sub7s[i_138_];
								Class11_Sub7 class11_sub7_141_ = class11_sub7s[i_139_];
								Class11_Sub7 class11_sub7_142_ = class11_sub7s[i_140_];
								Class11_Sub7 class11_sub7_143_ = null;
								if (class11_sub7 != null) {
									class11_sub7_143_ = class11_sub7;
									class11_sub7.method2328(i_133_, i_134_,
											i_136_, (byte) 59);
								}
								if (class11_sub7_141_ != null) {
									class11_sub7_141_.method2328(i_133_,
											i_134_, i_136_, (byte) -109);
									if (class11_sub7_143_ == null
											|| ((((Class11) class11_sub7_143_).aLong91) > (((Class11) class11_sub7_141_).aLong91)))
										class11_sub7_143_ = class11_sub7_141_;
								}
								if (class11_sub7_142_ != null) {
									class11_sub7_142_.method2328(i_133_,
											i_134_, i_136_, (byte) -125);
									if (class11_sub7_143_ == null
											|| ((((Class11) class11_sub7_142_).aLong91) < (((Class11) class11_sub7_143_).aLong91)))
										class11_sub7_143_ = class11_sub7_142_;
								}
								if (class11_sub7_143_ != null) {
									if (class11_sub7 != null)
										class11_sub7_143_.method2322(i_138_,
												(byte) 46);
									if (class11_sub7_141_ != null)
										class11_sub7_143_.method2322(i_139_,
												(byte) 46);
									if (class11_sub7_142_ != null)
										class11_sub7_143_.method2322(i_140_,
												(byte) 46);
									class11_sub7_143_.method2328(i_133_,
											i_134_, i_136_, (byte) -108);
								}
								i_136_++;
							}
						}
					}
				}
				stream.method347();
				anInterface9_6481 = (((Class12_Sub3) this).aClass163_Sub3_6476
						.method3289(i, nativeheapbuffer, 5890, false,
								stream.method352()));
				((Class12_Sub3) this).aClass350_6482 = new Class350(
						anInterface9_6481, 5126, 3, 0);
				aClass350_6487 = new Class350(anInterface9_6481, 5121, 4, 12);
				int i_144_;
				if (anIntArrayArrayArray6465 == null) {
					((Class12_Sub3) this).aClass350_6484 = new Class350(
							anInterface9_6481, 5126, 2, 16);
					i_144_ = 24;
				} else {
					i_144_ = 28;
					((Class12_Sub3) this).aClass350_6484 = new Class350(
							anInterface9_6481, 5126, 3, 16);
				}
				if ((((Class12_Sub3) this).anInt6452 & 0x7) != 0)
					((Class12_Sub3) this).aClass350_6485 = new Class350(
							anInterface9_6481, 5126, 3, i_144_);
				long[] ls = new long[aClass11_Sub7Array6488.length];
				for (int i_145_ = 0; ((i_145_ ^ 0xffffffff) > (aClass11_Sub7Array6488.length ^ 0xffffffff)); i_145_++) {
					Class11_Sub7 class11_sub7 = aClass11_Sub7Array6488[i_145_];
					ls[i_145_] = ((Class11) class11_sub7).aLong91;
					class11_sub7.method2327((byte) -99, anInt6460);
				}
				Class234_Sub1_Sub1.method3828(ls, 0, aClass11_Sub7Array6488);
				if (aClass156_6449 != null)
					aClass156_6449.method978(-106);
			}
			anInt6468++;
			anIntArrayArrayArray6465 = null;
			aByteArrayArray6483 = null;
			aFloatArrayArray6480 = aFloatArrayArray6478 = aFloatArrayArray6479 = null;
			((Class12_Sub3) this).anIntArrayArrayArray6466 = null;
			anIntArrayArrayArray6456 = null;
			aClass213_6490 = null;
			anIntArrayArrayArray6451 = null;
			((Class12_Sub3) this).anIntArrayArrayArray6467 = ((Class12_Sub3) this).anIntArrayArrayArray6446 = null;
			aClass11_Sub7ArrayArrayArray6474 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "io.YA(" + ')');
		}
	}

	final void U(int i, int i_146_, int[] is, int[] is_147_, int[] is_148_,
			int[] is_149_, int[] is_150_, int[] is_151_, int[] is_152_,
			int[] is_153_, int i_154_, int i_155_, int i_156_, boolean bool) {
		try {
			anInt6471++;
			Interface1 interface1 = (((Class163) ((Class12_Sub3) this).aClass163_Sub3_6476).anInterface1_2118);
			if (is_147_ != null && anIntArrayArrayArray6456 == null)
				anIntArrayArrayArray6456 = (new int[((Class12) this).anInt103][((Class12) this).anInt98][]);
			if (is_149_ != null && anIntArrayArrayArray6465 == null)
				anIntArrayArrayArray6465 = (new int[((Class12) this).anInt103][((Class12) this).anInt98][]);
			((Class12_Sub3) this).anIntArrayArrayArray6467[i][i_146_] = is;
			((Class12_Sub3) this).anIntArrayArrayArray6446[i][i_146_] = is_148_;
			((Class12_Sub3) this).anIntArrayArrayArray6466[i][i_146_] = is_150_;
			anIntArrayArrayArray6451[i][i_146_] = is_151_;
			if (anIntArrayArrayArray6465 != null)
				anIntArrayArrayArray6465[i][i_146_] = is_149_;
			if (anIntArrayArrayArray6456 != null)
				anIntArrayArrayArray6456[i][i_146_] = is_147_;
			Class11_Sub7[] class11_sub7s = (aClass11_Sub7ArrayArrayArray6474[i][i_146_] = new Class11_Sub7[is_150_.length]);
			for (int i_157_ = 0; i_157_ < is_150_.length; i_157_++) {
				int i_158_ = is_152_[i_157_];
				int i_159_ = is_153_[i_157_];
				if ((((Class12_Sub3) this).anInt6452 & 0x20) != 0
						&& i_158_ != -1
						&& (((Class188) interface1.method7((byte) 127, i_158_)).aBool2416)) {
					i_158_ = -1;
					i_159_ = 128;
				}
				long l = ((long) i_158_ | ((long) i_154_ << 28
						| ((long) i_155_ << 42 | (long) i_156_ << 48) | (long) (i_159_ << 14)));
				Class11 class11;
				for (class11 = aClass213_6490.method1369((byte) 26, l); class11 != null; class11 = aClass213_6490
						.method1363(0)) {
					Class11_Sub7 class11_sub7 = (Class11_Sub7) class11;
					if (((((Class11_Sub7) class11_sub7).anInt5271 ^ 0xffffffff) == (i_158_ ^ 0xffffffff))
							&& (((Class11_Sub7) class11_sub7).aFloat5267 == (float) i_159_)
							&& (((Class11_Sub7) class11_sub7).anInt5266 ^ 0xffffffff) == (i_154_ ^ 0xffffffff)
							&& ((Class11_Sub7) class11_sub7).anInt5250 == i_155_
							&& ((i_156_ ^ 0xffffffff) == (((Class11_Sub7) class11_sub7).anInt5255 ^ 0xffffffff)))
						break;
				}
				if (class11 == null) {
					class11_sub7s[i_157_] = new Class11_Sub7(this, i_158_,
							i_159_, i_154_, i_155_, i_156_);
					aClass213_6490.method1368(l, class11_sub7s[i_157_],
							(byte) -26);
				} else
					class11_sub7s[i_157_] = (Class11_Sub7) class11;
			}
			if (bool)
				aByteArrayArray6475[i][i_146_] = (byte) Class173.method1134(
						(aByteArrayArray6475[i][i_146_]), 1);
			if (is_150_.length > anInt6489)
				anInt6489 = is_150_.length;
			anInt6486 += is_150_.length;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("io.U(" + i + ','
					+ i_146_ + ',' + (is != null ? "{...}" : "null") + ','
					+ (is_147_ != null ? "{...}" : "null") + ','
					+ (is_148_ != null ? "{...}" : "null") + ','
					+ (is_149_ != null ? "{...}" : "null") + ','
					+ (is_150_ != null ? "{...}" : "null") + ','
					+ (is_151_ != null ? "{...}" : "null") + ','
					+ (is_152_ != null ? "{...}" : "null") + ','
					+ (is_153_ != null ? "{...}" : "null") + ',' + i_154_ + ','
					+ i_155_ + ',' + i_156_ + ',' + bool + ')'));
		}
	}

	final void method137(int i, int i_160_, int[] is, int[] is_161_,
			int[] is_162_, int[] is_163_, int[] is_164_, int[] is_165_,
			int[] is_166_, int[] is_167_, int[] is_168_, int[] is_169_,
			int[] is_170_, int i_171_, int i_172_, int i_173_, boolean bool) {
		try {
			anInt6473++;
			int i_174_ = is_167_.length;
			int[] is_175_ = new int[i_174_ * 3];
			int[] is_176_ = new int[i_174_ * 3];
			int[] is_177_ = new int[i_174_ * 3];
			int[] is_178_ = new int[i_174_ * 3];
			int[] is_179_ = new int[i_174_ * 3];
			int[] is_180_ = new int[i_174_ * 3];
			int[] is_181_ = is_161_ != null ? new int[3 * i_174_] : null;
			int[] is_182_ = is_163_ == null ? null : new int[3 * i_174_];
			int i_183_ = 0;
			for (int i_184_ = 0; (i_184_ ^ 0xffffffff) > (i_174_ ^ 0xffffffff); i_184_++) {
				int i_185_ = is_164_[i_184_];
				int i_186_ = is_165_[i_184_];
				int i_187_ = is_166_[i_184_];
				is_175_[i_183_] = is[i_185_];
				is_176_[i_183_] = is_162_[i_185_];
				is_177_[i_183_] = is_167_[i_184_];
				is_179_[i_183_] = is_169_[i_184_];
				is_180_[i_183_] = is_170_[i_184_];
				is_178_[i_183_] = is_168_ != null ? is_168_[i_184_]
						: is_167_[i_184_];
				if (is_161_ != null)
					is_181_[i_183_] = is_161_[i_185_];
				if (is_163_ != null)
					is_182_[i_183_] = is_163_[i_185_];
				i_183_++;
				is_175_[i_183_] = is[i_186_];
				is_176_[i_183_] = is_162_[i_186_];
				is_177_[i_183_] = is_167_[i_184_];
				is_179_[i_183_] = is_169_[i_184_];
				is_180_[i_183_] = is_170_[i_184_];
				is_178_[i_183_] = is_168_ == null ? is_167_[i_184_]
						: is_168_[i_184_];
				if (is_161_ != null)
					is_181_[i_183_] = is_161_[i_186_];
				if (is_163_ != null)
					is_182_[i_183_] = is_163_[i_186_];
				i_183_++;
				is_175_[i_183_] = is[i_187_];
				is_176_[i_183_] = is_162_[i_187_];
				is_177_[i_183_] = is_167_[i_184_];
				is_179_[i_183_] = is_169_[i_184_];
				is_180_[i_183_] = is_170_[i_184_];
				is_178_[i_183_] = is_168_ == null ? is_167_[i_184_]
						: is_168_[i_184_];
				if (is_161_ != null)
					is_181_[i_183_] = is_161_[i_187_];
				if (is_163_ != null)
					is_182_[i_183_] = is_163_[i_187_];
				i_183_++;
			}
			U(i, i_160_, is_175_, is_181_, is_176_, is_182_, is_177_, is_178_,
					is_179_, is_180_, i_171_, i_172_, i_173_, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("io.C(" + i + ','
					+ i_160_ + ',' + (is != null ? "{...}" : "null") + ','
					+ (is_161_ != null ? "{...}" : "null") + ','
					+ (is_162_ != null ? "{...}" : "null") + ','
					+ (is_163_ != null ? "{...}" : "null") + ','
					+ (is_164_ != null ? "{...}" : "null") + ','
					+ (is_165_ != null ? "{...}" : "null") + ','
					+ (is_166_ != null ? "{...}" : "null") + ','
					+ (is_167_ != null ? "{...}" : "null") + ','
					+ (is_168_ != null ? "{...}" : "null") + ','
					+ (is_169_ != null ? "{...}" : "null") + ','
					+ (is_170_ != null ? "{...}" : "null") + ',' + i_171_ + ','
					+ i_172_ + ',' + i_173_ + ',' + bool + ')'));
		}
	}

	private final void method2696(byte i, int i_188_, int i_189_,
			Class11_Sub45_Sub1_Sub2 class11_sub45_sub1_sub2) {
		try {
			anInt6453++;
			int[] is = (((Class12_Sub3) this).anIntArrayArrayArray6467[i_188_][i_189_]);
			int[] is_190_ = (((Class12_Sub3) this).anIntArrayArrayArray6446[i_188_][i_189_]);
			int i_191_ = is.length;
			if ((((Class163_Sub3) ((Class12_Sub3) this).aClass163_Sub3_6476).anIntArray8422).length < i_191_) {
				((Class163_Sub3) ((Class12_Sub3) this).aClass163_Sub3_6476).anIntArray8420 = new int[i_191_];
				((Class163_Sub3) ((Class12_Sub3) this).aClass163_Sub3_6476).anIntArray8422 = new int[i_191_];
			}
			int[] is_192_ = (((Class163_Sub3) ((Class12_Sub3) this).aClass163_Sub3_6476).anIntArray8422);
			int[] is_193_ = (((Class163_Sub3) ((Class12_Sub3) this).aClass163_Sub3_6476).anIntArray8420);
			for (int i_194_ = 0; (i_191_ ^ 0xffffffff) < (i_194_ ^ 0xffffffff); i_194_++) {
				is_192_[i_194_] = is[i_194_] >> (((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).anInt8269);
				is_193_[i_194_] = (is_190_[i_194_] >> ((Class163_Sub3) (((Class12_Sub3) this).aClass163_Sub3_6476)).anInt8269);
			}
			if (i != 102)
				U(105, 94, null, null, null, null, null, null, null, null, 87,
						-123, 7, true);
			int i_195_ = 0;
			while ((i_191_ ^ 0xffffffff) < (i_195_ ^ 0xffffffff)) {
				int i_196_ = is_192_[i_195_];
				int i_197_ = is_193_[i_195_++];
				int i_198_ = is_192_[i_195_];
				int i_199_ = is_193_[i_195_++];
				int i_200_ = is_192_[i_195_];
				int i_201_ = is_193_[i_195_++];
				if ((((-i_198_ + i_196_) * (i_199_ - i_201_) + -((-i_197_ + i_199_) * (i_200_ - i_198_))) ^ 0xffffffff) < -1)
					class11_sub45_sub1_sub2.method3878(i_196_, i_198_, i_200_,
							-122, i_197_, i_199_, i_201_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("io.M("
							+ i
							+ ','
							+ i_188_
							+ ','
							+ i_189_
							+ ','
							+ (class11_sub45_sub1_sub2 != null ? "{...}"
									: "null") + ')'));
		}
	}

	final boolean method128(Class11_Sub45_Sub1 class11_sub45_sub1, int i,
			int i_202_, int i_203_, int i_204_, boolean bool) {
		try {
			anInt6459++;
			if (aClass156_6449 == null || class11_sub45_sub1 == null)
				return false;
			int i_205_ = (i
					- ((((Class163_Sub3) ((Class12_Sub3) this).aClass163_Sub3_6476).anInt8362 * i_202_) >> 8) >> ((Class163_Sub3) ((Class12_Sub3) this).aClass163_Sub3_6476).anInt8269);
			int i_206_ = (-((((Class163_Sub3) ((Class12_Sub3) this).aClass163_Sub3_6476).anInt8339 * i_202_) >> 8)
					+ i_203_ >> ((Class163_Sub3) ((Class12_Sub3) this).aClass163_Sub3_6476).anInt8269);
			return aClass156_6449.method980(i_206_, class11_sub45_sub1, i_205_,
					(byte) 104);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("io.J(" + (class11_sub45_sub1 != null ? "{...}" : "null")
							+ ',' + i + ',' + i_202_ + ',' + i_203_ + ','
							+ i_204_ + ',' + bool + ')'));
		}
	}
}
