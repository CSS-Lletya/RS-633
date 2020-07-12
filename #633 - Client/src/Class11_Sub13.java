/* Class11_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub13 extends Class11 {
	private static float[] aFloatArray5447;
	private boolean aBool5448;
	private static int anInt5449;
	private static Class169[] aClass169Array5450;
	private int anInt5451;
	private int anInt5452;
	private int anInt5453;
	private static float[] aFloatArray5454;
	private static int[] anIntArray5455;
	private float[] aFloatArray5456;
	private int anInt5457;
	private static Class132[] aClass132Array5458;
	static Class354[] aClass354Array5459;
	private static Class263[] aClass263Array5460;
	private static boolean aBool5461 = false;
	private int anInt5462;
	private static float[] aFloatArray5463;
	private int anInt5464;
	private static boolean[] aBoolArray5465;
	private static float[] aFloatArray5466;
	private static int[] anIntArray5467;
	private boolean aBool5468;
	private static int anInt5469;
	private static byte[] aByteArray5470;
	private static float[] aFloatArray5471;
	private static float[] aFloatArray5472;
	private byte[][] aByteArrayArray5473;
	private static int anInt5474;
	private static float[] aFloatArray5475;
	private static int[] anIntArray5476;
	private static int anInt5477;
	private int anInt5478;
	private byte[] aByteArray5479;
	private int anInt5480;

	static final Class11_Sub13 method2388(Class146 class146, int i) {
		if (!method2394(class146)) {
			class146.method918(i, -36);
			return null;
		}
		byte[] is = class146.method938(i, 0);
		if (is == null)
			return null;
		return new Class11_Sub13(is);
	}

	static final float method2389(int i) {
		int i_0_ = i & 0x1fffff;
		int i_1_ = i & ~0x7fffffff;
		int i_2_ = (i & 0x7fe00000) >> 21;
		if (i_1_ != 0)
			i_0_ = -i_0_;
		return (float) ((double) i_0_ * Math.pow(2.0, (double) (i_2_ - 788)));
	}

	static final int method2390() {
		int i = aByteArray5470[anInt5449] >> anInt5477 & 0x1;
		anInt5477++;
		anInt5449 += anInt5477 >> 3;
		anInt5477 &= 0x7;
		return i;
	}

	private static final void method2391(byte[] is, int i) {
		aByteArray5470 = is;
		anInt5449 = i;
		anInt5477 = 0;
	}

	private final void method2392(byte[] is) {
		Stream stream = new Stream(is);
		anInt5457 = stream.readInt(102);
		anInt5452 = stream.readInt(106);
		anInt5451 = stream.readInt(92);
		anInt5464 = stream.readInt(109);
		if (anInt5464 < 0) {
			anInt5464 = anInt5464 ^ 0xffffffff;
			aBool5468 = true;
		}
		int i = stream.readInt(107);
		aByteArrayArray5473 = new byte[i][];
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			int i_4_ = 0;
			int i_5_;
			do {
				i_5_ = stream.readUnsignedByte((byte) 35);
				i_4_ += i_5_;
			} while (i_5_ >= 255);
			byte[] is_6_ = new byte[i_4_];
			stream.readBytes(is_6_, 4, i_4_, 0);
			aByteArrayArray5473[i_3_] = is_6_;
		}
	}

	private final float[] method2393(int i) {
		method2391(aByteArrayArray5473[i], 0);
		method2390();
		int i_7_ = method2397(Class163_Sub2_Sub1.method3406((byte) 111,
				(anIntArray5476.length - 1)));
		boolean bool = aBoolArray5465[i_7_];
		int i_8_ = bool ? anInt5469 : anInt5474;
		boolean bool_9_ = false;
		boolean bool_10_ = false;
		if (bool) {
			bool_9_ = method2390() != 0;
			bool_10_ = method2390() != 0;
		}
		int i_11_ = i_8_ >> 1;
		int i_12_;
		int i_13_;
		int i_14_;
		if (bool && !bool_9_) {
			i_12_ = (i_8_ >> 2) - (anInt5474 >> 2);
			i_13_ = (i_8_ >> 2) + (anInt5474 >> 2);
			i_14_ = anInt5474 >> 1;
		} else {
			i_12_ = 0;
			i_13_ = i_11_;
			i_14_ = i_8_ >> 1;
		}
		int i_15_;
		int i_16_;
		int i_17_;
		if (bool && !bool_10_) {
			i_15_ = i_8_ - (i_8_ >> 2) - (anInt5474 >> 2);
			i_16_ = i_8_ - (i_8_ >> 2) + (anInt5474 >> 2);
			i_17_ = anInt5474 >> 1;
		} else {
			i_15_ = i_11_;
			i_16_ = i_8_;
			i_17_ = i_8_ >> 1;
		}
		Class263 class263 = aClass263Array5460[anIntArray5476[i_7_]];
		int i_18_ = ((Class263) class263).anInt3596;
		int i_19_ = ((Class263) class263).anIntArray3597[i_18_];
		boolean bool_20_ = !aClass169Array5450[i_19_].method1110();
		boolean bool_21_ = bool_20_;
		for (int i_22_ = 0; i_22_ < ((Class263) class263).anInt3598; i_22_++) {
			Class132 class132 = (aClass132Array5458[((Class263) class263).anIntArray3595[i_22_]]);
			float[] fs = aFloatArray5475;
			class132.method858(fs, i_8_ >> 1, bool_21_);
		}
		if (!bool_20_) {
			int i_23_ = ((Class263) class263).anInt3596;
			int i_24_ = ((Class263) class263).anIntArray3597[i_23_];
			aClass169Array5450[i_24_].method1108(aFloatArray5475, i_8_ >> 1);
		}
		if (bool_20_) {
			for (int i_25_ = i_8_ >> 1; i_25_ < i_8_; i_25_++)
				aFloatArray5475[i_25_] = 0.0F;
		} else {
			int i_26_ = i_8_ >> 1;
			int i_27_ = i_8_ >> 2;
			int i_28_ = i_8_ >> 3;
			float[] fs = aFloatArray5475;
			for (int i_29_ = 0; i_29_ < i_26_; i_29_++)
				fs[i_29_] *= 0.5F;
			for (int i_30_ = i_26_; i_30_ < i_8_; i_30_++)
				fs[i_30_] = -fs[i_8_ - i_30_ - 1];
			float[] fs_31_ = bool ? aFloatArray5454 : aFloatArray5447;
			float[] fs_32_ = bool ? aFloatArray5463 : aFloatArray5466;
			float[] fs_33_ = bool ? aFloatArray5472 : aFloatArray5471;
			int[] is = bool ? anIntArray5455 : anIntArray5467;
			for (int i_34_ = 0; i_34_ < i_27_; i_34_++) {
				float f = fs[4 * i_34_] - fs[i_8_ - 4 * i_34_ - 1];
				float f_35_ = fs[4 * i_34_ + 2] - fs[i_8_ - 4 * i_34_ - 3];
				float f_36_ = fs_31_[2 * i_34_];
				float f_37_ = fs_31_[2 * i_34_ + 1];
				fs[i_8_ - 4 * i_34_ - 1] = f * f_36_ - f_35_ * f_37_;
				fs[i_8_ - 4 * i_34_ - 3] = f * f_37_ + f_35_ * f_36_;
			}
			for (int i_38_ = 0; i_38_ < i_28_; i_38_++) {
				float f = fs[i_26_ + 3 + 4 * i_38_];
				float f_39_ = fs[i_26_ + 1 + 4 * i_38_];
				float f_40_ = fs[4 * i_38_ + 3];
				float f_41_ = fs[4 * i_38_ + 1];
				fs[i_26_ + 3 + 4 * i_38_] = f + f_40_;
				fs[i_26_ + 1 + 4 * i_38_] = f_39_ + f_41_;
				float f_42_ = fs_31_[i_26_ - 4 - 4 * i_38_];
				float f_43_ = fs_31_[i_26_ - 3 - 4 * i_38_];
				fs[4 * i_38_ + 3] = (f - f_40_) * f_42_ - (f_39_ - f_41_)
						* f_43_;
				fs[4 * i_38_ + 1] = (f_39_ - f_41_) * f_42_ + (f - f_40_)
						* f_43_;
			}
			int i_44_ = Class163_Sub2_Sub1.method3406((byte) 102, i_8_ - 1);
			for (int i_45_ = 0; i_45_ < i_44_ - 3; i_45_++) {
				int i_46_ = i_8_ >> i_45_ + 2;
				int i_47_ = 8 << i_45_;
				for (int i_48_ = 0; i_48_ < 2 << i_45_; i_48_++) {
					int i_49_ = i_8_ - i_46_ * 2 * i_48_;
					int i_50_ = i_8_ - i_46_ * (2 * i_48_ + 1);
					for (int i_51_ = 0; i_51_ < i_8_ >> i_45_ + 4; i_51_++) {
						int i_52_ = 4 * i_51_;
						float f = fs[i_49_ - 1 - i_52_];
						float f_53_ = fs[i_49_ - 3 - i_52_];
						float f_54_ = fs[i_50_ - 1 - i_52_];
						float f_55_ = fs[i_50_ - 3 - i_52_];
						fs[i_49_ - 1 - i_52_] = f + f_54_;
						fs[i_49_ - 3 - i_52_] = f_53_ + f_55_;
						float f_56_ = fs_31_[i_51_ * i_47_];
						float f_57_ = fs_31_[i_51_ * i_47_ + 1];
						fs[i_50_ - 1 - i_52_] = (f - f_54_) * f_56_
								- (f_53_ - f_55_) * f_57_;
						fs[i_50_ - 3 - i_52_] = (f_53_ - f_55_) * f_56_
								+ (f - f_54_) * f_57_;
					}
				}
			}
			for (int i_58_ = 1; i_58_ < i_28_ - 1; i_58_++) {
				int i_59_ = is[i_58_];
				if (i_58_ < i_59_) {
					int i_60_ = 8 * i_58_;
					int i_61_ = 8 * i_59_;
					float f = fs[i_60_ + 1];
					fs[i_60_ + 1] = fs[i_61_ + 1];
					fs[i_61_ + 1] = f;
					f = fs[i_60_ + 3];
					fs[i_60_ + 3] = fs[i_61_ + 3];
					fs[i_61_ + 3] = f;
					f = fs[i_60_ + 5];
					fs[i_60_ + 5] = fs[i_61_ + 5];
					fs[i_61_ + 5] = f;
					f = fs[i_60_ + 7];
					fs[i_60_ + 7] = fs[i_61_ + 7];
					fs[i_61_ + 7] = f;
				}
			}
			for (int i_62_ = 0; i_62_ < i_26_; i_62_++)
				fs[i_62_] = fs[2 * i_62_ + 1];
			for (int i_63_ = 0; i_63_ < i_28_; i_63_++) {
				fs[i_8_ - 1 - 2 * i_63_] = fs[4 * i_63_];
				fs[i_8_ - 2 - 2 * i_63_] = fs[4 * i_63_ + 1];
				fs[i_8_ - i_27_ - 1 - 2 * i_63_] = fs[4 * i_63_ + 2];
				fs[i_8_ - i_27_ - 2 - 2 * i_63_] = fs[4 * i_63_ + 3];
			}
			for (int i_64_ = 0; i_64_ < i_28_; i_64_++) {
				float f = fs_33_[2 * i_64_];
				float f_65_ = fs_33_[2 * i_64_ + 1];
				float f_66_ = fs[i_26_ + 2 * i_64_];
				float f_67_ = fs[i_26_ + 2 * i_64_ + 1];
				float f_68_ = fs[i_8_ - 2 - 2 * i_64_];
				float f_69_ = fs[i_8_ - 1 - 2 * i_64_];
				float f_70_ = f_65_ * (f_66_ - f_68_) + f * (f_67_ + f_69_);
				fs[i_26_ + 2 * i_64_] = (f_66_ + f_68_ + f_70_) * 0.5F;
				fs[i_8_ - 2 - 2 * i_64_] = (f_66_ + f_68_ - f_70_) * 0.5F;
				f_70_ = f_65_ * (f_67_ + f_69_) - f * (f_66_ - f_68_);
				fs[i_26_ + 2 * i_64_ + 1] = (f_67_ - f_69_ + f_70_) * 0.5F;
				fs[i_8_ - 1 - 2 * i_64_] = (-f_67_ + f_69_ + f_70_) * 0.5F;
			}
			for (int i_71_ = 0; i_71_ < i_27_; i_71_++) {
				fs[i_71_] = (fs[2 * i_71_ + i_26_] * fs_32_[2 * i_71_] + fs[2
						* i_71_ + 1 + i_26_]
						* fs_32_[2 * i_71_ + 1]);
				fs[i_26_ - 1 - i_71_] = (fs[2 * i_71_ + i_26_]
						* fs_32_[2 * i_71_ + 1] - fs[2 * i_71_ + 1 + i_26_]
						* fs_32_[2 * i_71_]);
			}
			for (int i_72_ = 0; i_72_ < i_27_; i_72_++)
				fs[i_8_ - i_27_ + i_72_] = -fs[i_72_];
			for (int i_73_ = 0; i_73_ < i_27_; i_73_++)
				fs[i_73_] = fs[i_27_ + i_73_];
			for (int i_74_ = 0; i_74_ < i_27_; i_74_++)
				fs[i_27_ + i_74_] = -fs[i_27_ - i_74_ - 1];
			for (int i_75_ = 0; i_75_ < i_27_; i_75_++)
				fs[i_26_ + i_75_] = fs[i_8_ - i_75_ - 1];
			for (int i_76_ = i_12_; i_76_ < i_13_; i_76_++) {
				float f = (float) Math.sin(((double) (i_76_ - i_12_) + 0.5)
						/ (double) i_14_ * 0.5 * 3.141592653589793);
				aFloatArray5475[i_76_] *= (float) Math.sin(1.5707963267948966
						* (double) f * (double) f);
			}
			for (int i_77_ = i_15_; i_77_ < i_16_; i_77_++) {
				float f = (float) Math
						.sin((((double) (i_77_ - i_15_) + 0.5) / (double) i_17_
								* 0.5 * 3.141592653589793) + 1.5707963267948966);
				aFloatArray5475[i_77_] *= (float) Math.sin(1.5707963267948966
						* (double) f * (double) f);
			}
		}
		float[] fs = null;
		if (anInt5453 > 0) {
			int i_78_ = anInt5453 + i_8_ >> 2;
			fs = new float[i_78_];
			if (!aBool5448) {
				for (int i_79_ = 0; i_79_ < anInt5462; i_79_++) {
					int i_80_ = (anInt5453 >> 1) + i_79_;
					fs[i_79_] += aFloatArray5456[i_80_];
				}
			}
			if (!bool_20_) {
				for (int i_81_ = i_12_; i_81_ < i_8_ >> 1; i_81_++) {
					int i_82_ = fs.length - (i_8_ >> 1) + i_81_;
					fs[i_82_] += aFloatArray5475[i_81_];
				}
			}
		}
		float[] fs_83_ = aFloatArray5456;
		aFloatArray5456 = aFloatArray5475;
		aFloatArray5475 = fs_83_;
		anInt5453 = i_8_;
		anInt5462 = i_16_ - (i_8_ >> 1);
		aBool5448 = bool_20_;
		return fs;
	}

	private static final boolean method2394(Class146 class146) {
		if (!aBool5461) {
			byte[] is = class146.method930(0, (byte) 112, 0);
			if (is == null)
				return false;
			method2399(is);
		}
		return true;
	}

	static final Class11_Sub13 method2395(Class146 class146, int i, int i_84_) {
		if (!method2394(class146)) {
			class146.method927((byte) -107, i, i_84_);
			return null;
		}
		byte[] is = class146.method930(i_84_, (byte) 112, i);
		if (is == null)
			return null;
		return new Class11_Sub13(is);
	}

	public static void method2396() {
		aByteArray5470 = null;
		aClass354Array5459 = null;
		aClass169Array5450 = null;
		aClass132Array5458 = null;
		aClass263Array5460 = null;
		aBoolArray5465 = null;
		anIntArray5476 = null;
		aFloatArray5475 = null;
		aFloatArray5447 = null;
		aFloatArray5466 = null;
		aFloatArray5471 = null;
		aFloatArray5454 = null;
		aFloatArray5463 = null;
		aFloatArray5472 = null;
		anIntArray5467 = null;
		anIntArray5455 = null;
	}

	static final int method2397(int i) {
		int i_85_ = 0;
		int i_86_ = 0;
		int i_87_;
		for (/**/; i >= 8 - anInt5477; i -= i_87_) {
			i_87_ = 8 - anInt5477;
			int i_88_ = (1 << i_87_) - 1;
			i_85_ += (aByteArray5470[anInt5449] >> anInt5477 & i_88_) << i_86_;
			anInt5477 = 0;
			anInt5449++;
			i_86_ += i_87_;
		}
		if (i > 0) {
			i_87_ = (1 << i) - 1;
			i_85_ += (aByteArray5470[anInt5449] >> anInt5477 & i_87_) << i_86_;
			anInt5477 += i;
		}
		return i_85_;
	}

	final Class11_Sub14_Sub1 method2398(int[] is) {
		if (is != null && is[0] <= 0)
			return null;
		if (aByteArray5479 == null) {
			anInt5453 = 0;
			aFloatArray5456 = new float[anInt5469];
			aByteArray5479 = new byte[anInt5452];
			anInt5480 = 0;
			anInt5478 = 0;
		}
		for (/**/; anInt5478 < aByteArrayArray5473.length; anInt5478++) {
			if (is != null && is[0] <= 0)
				return null;
			float[] fs = method2393(anInt5478);
			if (fs != null) {
				int i = anInt5480;
				int i_89_ = fs.length;
				if (i_89_ > anInt5452 - i)
					i_89_ = anInt5452 - i;
				for (int i_90_ = 0; i_90_ < i_89_; i_90_++) {
					int i_91_ = (int) (128.0F + fs[i_90_] * 128.0F);
					if ((i_91_ & ~0xff) != 0)
						i_91_ = (i_91_ ^ 0xffffffff) >> 31;
					aByteArray5479[i++] = (byte) (i_91_ - 128);
				}
				if (is != null)
					is[0] -= i - anInt5480;
				anInt5480 = i;
			}
		}
		aFloatArray5456 = null;
		byte[] is_92_ = aByteArray5479;
		aByteArray5479 = null;
		return new Class11_Sub14_Sub1(anInt5457, is_92_, anInt5451, anInt5464,
				aBool5468);
	}

	private static final void method2399(byte[] is) {
		method2391(is, 0);
		anInt5474 = 1 << method2397(4);
		anInt5469 = 1 << method2397(4);
		aFloatArray5475 = new float[anInt5469];
		for (int i = 0; i < 2; i++) {
			int i_93_ = i != 0 ? anInt5469 : anInt5474;
			int i_94_ = i_93_ >> 1;
			int i_95_ = i_93_ >> 2;
			int i_96_ = i_93_ >> 3;
			float[] fs = new float[i_94_];
			for (int i_97_ = 0; i_97_ < i_95_; i_97_++) {
				fs[2 * i_97_] = (float) Math.cos((double) (4 * i_97_)
						* 3.141592653589793 / (double) i_93_);
				fs[2 * i_97_ + 1] = -(float) Math.sin((double) (4 * i_97_)
						* 3.141592653589793 / (double) i_93_);
			}
			float[] fs_98_ = new float[i_94_];
			for (int i_99_ = 0; i_99_ < i_95_; i_99_++) {
				fs_98_[2 * i_99_] = (float) Math.cos((double) (2 * i_99_ + 1)
						* 3.141592653589793 / (double) (2 * i_93_));
				fs_98_[2 * i_99_ + 1] = (float) Math
						.sin((double) (2 * i_99_ + 1) * 3.141592653589793
								/ (double) (2 * i_93_));
			}
			float[] fs_100_ = new float[i_95_];
			for (int i_101_ = 0; i_101_ < i_96_; i_101_++) {
				fs_100_[2 * i_101_] = (float) Math
						.cos((double) (4 * i_101_ + 2) * 3.141592653589793
								/ (double) i_93_);
				fs_100_[2 * i_101_ + 1] = -(float) Math
						.sin((double) (4 * i_101_ + 2) * 3.141592653589793
								/ (double) i_93_);
			}
			int[] is_102_ = new int[i_96_];
			int i_103_ = Class163_Sub2_Sub1.method3406((byte) 71, i_96_ - 1);
			for (int i_104_ = 0; i_104_ < i_96_; i_104_++)
				is_102_[i_104_] = Class19_Sub1.method2465((byte) 61, i_103_,
						i_104_);
			if (i != 0) {
				aFloatArray5454 = fs;
				aFloatArray5463 = fs_98_;
				aFloatArray5472 = fs_100_;
				anIntArray5455 = is_102_;
			} else {
				aFloatArray5447 = fs;
				aFloatArray5466 = fs_98_;
				aFloatArray5471 = fs_100_;
				anIntArray5467 = is_102_;
			}
		}
		int i = method2397(8) + 1;
		aClass354Array5459 = new Class354[i];
		for (int i_105_ = 0; i_105_ < i; i_105_++)
			aClass354Array5459[i_105_] = new Class354();
		int i_106_ = method2397(6) + 1;
		for (int i_107_ = 0; i_107_ < i_106_; i_107_++)
			method2397(16);
		int i_108_ = method2397(6) + 1;
		aClass169Array5450 = new Class169[i_108_];
		for (int i_109_ = 0; i_109_ < i_108_; i_109_++)
			aClass169Array5450[i_109_] = new Class169();
		int i_110_ = method2397(6) + 1;
		aClass132Array5458 = new Class132[i_110_];
		for (int i_111_ = 0; i_111_ < i_110_; i_111_++)
			aClass132Array5458[i_111_] = new Class132();
		int i_112_ = method2397(6) + 1;
		aClass263Array5460 = new Class263[i_112_];
		for (int i_113_ = 0; i_113_ < i_112_; i_113_++)
			aClass263Array5460[i_113_] = new Class263();
		int i_114_ = method2397(6) + 1;
		aBoolArray5465 = new boolean[i_114_];
		anIntArray5476 = new int[i_114_];
		for (int i_115_ = 0; i_115_ < i_114_; i_115_++) {
			aBoolArray5465[i_115_] = method2390() != 0;
			method2397(16);
			method2397(16);
			anIntArray5476[i_115_] = method2397(8);
		}
		aBool5461 = true;
	}

	private Class11_Sub13(byte[] is) {
		method2392(is);
	}
}
