/* Class12_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

final class Class12_Sub1 extends Class12 {
	static int anInt5119;
	private int anInt5120;
	static int anInt5121;
	static int anInt5122;
	private float aFloat5123 = -3.4028235E38F;
	static int anInt5124;
	short[][] aShortArrayArray5125;
	static int anInt5126;
	private byte[][] aByteArrayArray5127;
	static Class298 aClass298_5128 = new Class298("", 11);
	static int anInt5129;
	private int anInt5130;
	int[][][] anIntArrayArrayArray5131;
	static int anInt5132;
	static int anInt5133;
	int[][][] anIntArrayArrayArray5134;
	int[][][] anIntArrayArrayArray5135;
	private int anInt5136;
	static int anInt5137;
	private int anInt5138;
	private int[][][] anIntArrayArrayArray5139;
	static int anInt5140;
	static int anInt5141;
	private int[][][] anIntArrayArrayArray5142;
	private Class84 aClass84_5143;
	static int anInt5144;
	Class163_Sub2 aClass163_Sub2_5145;
	static int anInt5146;
	private float aFloat5147 = 3.4028235E38F;
	private Class11_Sub44[][][] aClass11_Sub44ArrayArrayArray5148;
	int anInt5149;
	static int anInt5150;
	private int[][][] anIntArrayArrayArray5151;
	static int anInt5152;
	static int anInt5153;
	static int anInt5154;
	private Class226 aClass226_5155;
	static int anInt5156;
	private Class213 aClass213_5157;
	Class219 aClass219_5158;
	static int anInt5159 = 0;
	private Interface3 anInterface3_5160;
	private byte[][] aByteArrayArray5161;
	private Interface3 anInterface3_5162;
	private int anInt5163;
	private int anInt5164;
	private float[][] aFloatArrayArray5165;
	private float[][] aFloatArrayArray5166;
	private Class11_Sub44[] aClass11_Sub44Array5167;
	private float[][] aFloatArrayArray5168;

	final void method135(int i, int i_0_, int i_1_, boolean[][] bools,
			boolean bool, int i_2_, int i_3_) {
		try {
			anInt5121++;
			method2292(bool, (byte) -116, i_2_, bools, i_0_, i_3_, i, i_1_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("aca.H(" + i + ','
					+ i_0_ + ',' + i_1_ + ','
					+ (bools != null ? "{...}" : "null") + ',' + bool + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	Class12_Sub1(Class163_Sub2 class163_sub2, int i, int i_4_, int i_5_,
			int i_6_, int[][] is, int[][] is_7_, int i_8_) {
		super(i_5_, i_6_, i_8_, is);
		aClass84_5143 = new Class84();
		do {
			try {
				anInt5120 = -2 + ((Class12) this).anInt97;
				((Class12_Sub1) this).aClass163_Sub2_5145 = class163_sub2;
				aFloatArrayArray5165 = (new float[1 + ((Class12) this).anInt103][((Class12) this).anInt98 + 1]);
				anIntArrayArrayArray5151 = new int[i_5_][i_6_][];
				aClass11_Sub44ArrayArrayArray5148 = new Class11_Sub44[i_5_][i_6_][];
				anIntArrayArrayArray5142 = new int[i_5_][i_6_][];
				aByteArrayArray5127 = new byte[i_5_][i_6_];
				((Class12_Sub1) this).anIntArrayArrayArray5134 = new int[i_5_][i_6_][];
				aByteArrayArray5161 = new byte[i_5_ + 1][i_6_ + 1];
				((Class12_Sub1) this).anInt5149 = i_4_;
				((Class12_Sub1) this).anIntArrayArrayArray5131 = new int[i_5_][i_6_][];
				anInt5138 = 1 << anInt5120;
				aFloatArrayArray5168 = (new float[((Class12) this).anInt103 + 1][((Class12) this).anInt98 + 1]);
				((Class12_Sub1) this).aShortArrayArray5125 = new short[i_5_
						* i_6_][];
				((Class12_Sub1) this).anIntArrayArrayArray5135 = new int[i_5_][i_6_][];
				aFloatArrayArray5166 = (new float[((Class12) this).anInt103 + 1][1 + ((Class12) this).anInt98]);
				for (int i_9_ = 0; ((Class12) this).anInt98 >= i_9_; i_9_++) {
					for (int i_10_ = 0; ((((Class12) this).anInt103 ^ 0xffffffff) <= (i_10_ ^ 0xffffffff)); i_10_++) {
						int i_11_ = ((Class12) this).anIntArrayArray100[i_10_][i_9_];
						if (aFloat5123 < (float) i_11_)
							aFloat5123 = (float) i_11_;
						if (aFloat5147 > (float) i_11_)
							aFloat5147 = (float) i_11_;
						if ((i_10_ ^ 0xffffffff) < -1
								&& i_9_ > 0
								&& ((i_10_ ^ 0xffffffff) > (((Class12) this).anInt103 ^ 0xffffffff))
								&& ((((Class12) this).anInt98 ^ 0xffffffff) < (i_9_ ^ 0xffffffff))) {
							int i_12_ = (is_7_[i_10_ + 1][i_9_] - is_7_[-1
									+ i_10_][i_9_]);
							int i_13_ = (-is_7_[i_10_][-1 + i_9_] + is_7_[i_10_][i_9_ + 1]);
							float f = (float) (1.0 / (Math
									.sqrt((double) (i_8_ * 4 * i_8_ + i_12_
											* i_12_ - -(i_13_ * i_13_)))));
							aFloatArrayArray5165[i_10_][i_9_] = f
									* (float) i_12_;
							aFloatArrayArray5166[i_10_][i_9_] = (float) (2 * -i_8_)
									* f;
							aFloatArrayArray5168[i_10_][i_9_] = (float) i_13_
									* f;
						}
					}
				}
				aFloat5147--;
				aFloat5123++;
				aClass213_5157 = new Class213(128);
				if ((((Class12_Sub1) this).anInt5149 & 0x10) == 0)
					break;
				aClass226_5155 = new Class226(
						((Class12_Sub1) this).aClass163_Sub2_5145, this);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("aca.<init>("
								+ (class163_sub2 != null ? "{...}" : "null")
								+ ',' + i + ',' + i_4_ + ',' + i_5_ + ','
								+ i_6_ + ',' + (is != null ? "{...}" : "null")
								+ ',' + (is_7_ != null ? "{...}" : "null")
								+ ',' + i_8_ + ')'));
			}
			break;
		} while (false);
	}

	final boolean method128(Class11_Sub45_Sub1 class11_sub45_sub1, int i,
			int i_14_, int i_15_, int i_16_, boolean bool) {
		try {
			anInt5119++;
			if (aClass226_5155 == null || class11_sub45_sub1 == null)
				return false;
			int i_17_ = (i
					- (i_14_
							* (((Class163_Sub2) ((Class12_Sub1) this).aClass163_Sub2_5145).anInt7611) >> 8) >> ((Class163_Sub2) ((Class12_Sub1) this).aClass163_Sub2_5145).anInt7634);
			int i_18_ = (-(((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).anInt7587
					* i_14_ >> 8)
					+ i_15_ >> ((Class163_Sub2) ((Class12_Sub1) this).aClass163_Sub2_5145).anInt7634);
			return aClass226_5155.method1454(class11_sub45_sub1, i_17_, i_18_,
					-7219);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("aca.J(" + (class11_sub45_sub1 != null ? "{...}" : "null")
							+ ',' + i + ',' + i_14_ + ',' + i_15_ + ',' + i_16_
							+ ',' + bool + ')'));
		}
	}

	private final void method2288(
			Class11_Sub45_Sub1_Sub1 class11_sub45_sub1_sub1, int i, int i_19_,
			int i_20_) {
		try {
			anInt5153++;
			int[] is = ((Class12_Sub1) this).anIntArrayArrayArray5135[i_20_][i_19_];
			int[] is_21_ = ((Class12_Sub1) this).anIntArrayArrayArray5134[i_20_][i_19_];
			int i_22_ = is.length;
			if ((Class2_Sub6.anIntArray5553.length ^ 0xffffffff) > (i_22_ ^ 0xffffffff)) {
				Class2_Sub6.anIntArray5553 = new int[i_22_];
				Class377.anIntArray4916 = new int[i_22_];
			}
			for (int i_23_ = 0; i_22_ > i_23_; i_23_++) {
				Class2_Sub6.anIntArray5553[i_23_] = is[i_23_] >> (((Class163_Sub2) ((Class12_Sub1) this).aClass163_Sub2_5145).anInt7634);
				Class377.anIntArray4916[i_23_] = (is_21_[i_23_] >> ((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).anInt7634);
			}
			if (i != 255)
				method2292(false, (byte) 23, 123, null, -6, -43, -32, 91);
			int i_24_ = 0;
			while (i_24_ < i_22_) {
				int i_25_ = Class2_Sub6.anIntArray5553[i_24_];
				int i_26_ = Class377.anIntArray4916[i_24_++];
				int i_27_ = Class2_Sub6.anIntArray5553[i_24_];
				int i_28_ = Class377.anIntArray4916[i_24_++];
				int i_29_ = Class2_Sub6.anIntArray5553[i_24_];
				int i_30_ = Class377.anIntArray4916[i_24_++];
				if ((-i_30_ + i_28_) * (i_25_ - i_27_)
						+ -((-i_26_ + i_28_) * (i_29_ - i_27_)) > 0)
					class11_sub45_sub1_sub1.method3863(i_29_, i_25_, i_27_,
							i_26_, (byte) -34, i_28_, i_30_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("aca.Q("
					+ (class11_sub45_sub1_sub1 != null ? "{...}" : "null")
					+ ',' + i + ',' + i_19_ + ',' + i_20_ + ')'));
		}
	}

	final void CA(Class11_Sub45_Sub1 class11_sub45_sub1, int i, int i_31_,
			int i_32_, int i_33_, boolean bool) {
		try {
			anInt5129++;
			if (aClass226_5155 != null && class11_sub45_sub1 != null) {
				int i_34_ = (i
						+ -(i_31_
								* (((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).anInt7611) >> 8) >> ((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).anInt7634);
				int i_35_ = (-((((Class163_Sub2) ((Class12_Sub1) this).aClass163_Sub2_5145).anInt7587 * i_31_) >> 8)
						+ i_32_ >> ((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).anInt7634);
				aClass226_5155.method1459(class11_sub45_sub1, 2048, i_35_,
						i_34_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("aca.CA("
							+ (class11_sub45_sub1 != null ? "{...}" : "null")
							+ ',' + i + ',' + i_31_ + ',' + i_32_ + ',' + i_33_
							+ ',' + bool + ')'));
		}
	}

	final Class11_Sub45_Sub1 fa(int i, int i_36_,
			Class11_Sub45_Sub1 class11_sub45_sub1) {
		try {
			anInt5150++;
			if ((0x1 & aByteArrayArray5127[i][i_36_]) == 0)
				return null;
			int i_37_ = (((Class12) this).anInt93 >> ((Class163_Sub2) ((Class12_Sub1) this).aClass163_Sub2_5145).anInt7634);
			Class11_Sub45_Sub1_Sub1 class11_sub45_sub1_sub1 = (Class11_Sub45_Sub1_Sub1) class11_sub45_sub1;
			Class11_Sub45_Sub1_Sub1 class11_sub45_sub1_sub1_38_;
			do {
				if (class11_sub45_sub1_sub1 != null
						&& class11_sub45_sub1_sub1.method3867(27928, i_37_,
								i_37_)) {
					class11_sub45_sub1_sub1_38_ = class11_sub45_sub1_sub1;
					class11_sub45_sub1_sub1_38_.method3865((byte) 114);
					if (!client.aBool10531)
						break;
				}
				class11_sub45_sub1_sub1_38_ = new Class11_Sub45_Sub1_Sub1(
						(((Class12_Sub1) this).aClass163_Sub2_5145), i_37_,
						i_37_);
			} while (false);
			class11_sub45_sub1_sub1_38_.method3866(0, i_37_, i_37_, -18678, 0);
			method2288(class11_sub45_sub1_sub1_38_, 255, i_36_, i);
			return class11_sub45_sub1_sub1_38_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("aca.fa(" + i + ','
					+ i_36_ + ','
					+ (class11_sub45_sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method137(int i, int i_39_, int[] is, int[] is_40_,
			int[] is_41_, int[] is_42_, int[] is_43_, int[] is_44_,
			int[] is_45_, int[] is_46_, int[] is_47_, int[] is_48_,
			int[] is_49_, int i_50_, int i_51_, int i_52_, boolean bool) {
		try {
			anInt5140++;
			int i_53_ = is_46_.length;
			int[] is_54_ = new int[3 * i_53_];
			int[] is_55_ = new int[i_53_ * 3];
			int[] is_56_ = new int[3 * i_53_];
			int[] is_57_ = new int[3 * i_53_];
			int[] is_58_ = new int[3 * i_53_];
			int[] is_59_ = new int[3 * i_53_];
			int[] is_60_ = is_40_ == null ? null : new int[3 * i_53_];
			int[] is_61_ = is_42_ != null ? new int[i_53_ * 3] : null;
			int i_62_ = 0;
			for (int i_63_ = 0; (i_63_ ^ 0xffffffff) > (i_53_ ^ 0xffffffff); i_63_++) {
				int i_64_ = is_43_[i_63_];
				int i_65_ = is_44_[i_63_];
				int i_66_ = is_45_[i_63_];
				is_54_[i_62_] = is[i_64_];
				is_55_[i_62_] = is_41_[i_64_];
				is_56_[i_62_] = is_46_[i_63_];
				is_58_[i_62_] = is_48_[i_63_];
				is_59_[i_62_] = is_49_[i_63_];
				is_57_[i_62_] = is_47_ == null ? is_46_[i_63_] : is_47_[i_63_];
				if (is_40_ != null)
					is_60_[i_62_] = is_40_[i_64_];
				if (is_42_ != null)
					is_61_[i_62_] = is_42_[i_64_];
				i_62_++;
				is_54_[i_62_] = is[i_65_];
				is_55_[i_62_] = is_41_[i_65_];
				is_56_[i_62_] = is_46_[i_63_];
				is_58_[i_62_] = is_48_[i_63_];
				is_59_[i_62_] = is_49_[i_63_];
				is_57_[i_62_] = is_47_ != null ? is_47_[i_63_] : is_46_[i_63_];
				if (is_40_ != null)
					is_60_[i_62_] = is_40_[i_65_];
				if (is_42_ != null)
					is_61_[i_62_] = is_42_[i_65_];
				i_62_++;
				is_54_[i_62_] = is[i_66_];
				is_55_[i_62_] = is_41_[i_66_];
				is_56_[i_62_] = is_46_[i_63_];
				is_58_[i_62_] = is_48_[i_63_];
				is_59_[i_62_] = is_49_[i_63_];
				is_57_[i_62_] = is_47_ == null ? is_46_[i_63_] : is_47_[i_63_];
				if (is_40_ != null)
					is_60_[i_62_] = is_40_[i_66_];
				if (is_42_ != null)
					is_61_[i_62_] = is_42_[i_66_];
				i_62_++;
			}
			U(i, i_39_, is_54_, is_60_, is_55_, is_61_, is_56_, is_57_, is_58_,
					is_59_, i_50_, i_51_, i_52_, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("aca.C(" + i + ','
					+ i_39_ + ',' + (is != null ? "{...}" : "null") + ','
					+ (is_40_ != null ? "{...}" : "null") + ','
					+ (is_41_ != null ? "{...}" : "null") + ','
					+ (is_42_ != null ? "{...}" : "null") + ','
					+ (is_43_ != null ? "{...}" : "null") + ','
					+ (is_44_ != null ? "{...}" : "null") + ','
					+ (is_45_ != null ? "{...}" : "null") + ','
					+ (is_46_ != null ? "{...}" : "null") + ','
					+ (is_47_ != null ? "{...}" : "null") + ','
					+ (is_48_ != null ? "{...}" : "null") + ','
					+ (is_49_ != null ? "{...}" : "null") + ',' + i_50_ + ','
					+ i_51_ + ',' + i_52_ + ',' + bool + ')'));
		}
	}

	static final boolean method2289(char c, byte i) {
		try {
			anInt5124++;
			if ((c ^ 0xffffffff) <= -33 && c <= 126)
				return true;
			if (i != -85)
				anInt5156 = 75;
			if (c >= 160 && (c ^ 0xffffffff) >= -256)
				return true;
			if ((c ^ 0xffffffff) == -8365 || c == 338 || c == 8212
					|| (c ^ 0xffffffff) == -340 || c == 376)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aca.P(" + c + ',' + i
					+ ')');
		}
	}

	final void wa(Class11_Sub45_Sub1 class11_sub45_sub1, int i, int i_67_,
			int i_68_, int i_69_, boolean bool) {
		try {
			anInt5152++;
			if (aClass226_5155 != null && class11_sub45_sub1 != null) {
				int i_70_ = (i
						+ -((((Class163_Sub2) ((Class12_Sub1) this).aClass163_Sub2_5145).anInt7611)
								* i_67_ >> 8) >> ((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).anInt7634);
				int i_71_ = (-(i_67_
						* (((Class163_Sub2) ((Class12_Sub1) this).aClass163_Sub2_5145).anInt7587) >> 8)
						+ i_68_ >> ((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).anInt7634);
				aClass226_5155.method1458(i_71_, class11_sub45_sub1,
						(byte) 111, i_70_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("aca.wa("
							+ (class11_sub45_sub1 != null ? "{...}" : "null")
							+ ',' + i + ',' + i_67_ + ',' + i_68_ + ',' + i_69_
							+ ',' + bool + ')'));
		}
	}

	public static void method2290(int i) {
		try {
			if (i <= 107)
				method2291(false);
			aClass298_5128 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aca.N(" + i + ')');
		}
	}

	final void method132(int i, int i_72_, int i_73_, boolean[][] bools,
			boolean bool, int i_74_) {
		try {
			method2292(bool, (byte) 25, -1, bools, i_72_, i_74_, i, i_73_);
			anInt5122++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("aca.F(" + i + ','
					+ i_72_ + ',' + i_73_ + ','
					+ (bools != null ? "{...}" : "null") + ',' + bool + ','
					+ i_74_ + ')'));
		}
	}

	static final void method2291(boolean bool) {
		do {
			try {
				Class11_Sub45_Sub20_Sub1.aClass84_9948 = new Class84();
				anInt5141++;
				if (bool == false)
					break;
				method2291(true);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "aca.O(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	final void method133(int i, int i_75_, int i_76_, int i_77_, int i_78_,
			int i_79_, int i_80_, boolean[][] bools) {
		do {
			try {
				anInt5137++;
				if (anInt5164 > 0) {
					Interface27 interface27 = ((Class12_Sub1) this).aClass163_Sub2_5145
							.method3052(-14589, anInt5136);
					int i_81_ = 0;
					int i_82_ = 32767;
					int i_83_ = -32768;
					for (int i_84_ = 0; (i_84_ ^ 0xffffffff) > -5; i_84_++) {
						i_81_ = 0;
						Buffer buffer = interface27.method12(27599, true);
						if (buffer != null) {
							jaclib.memory.Stream stream = ((Class12_Sub1) this).aClass163_Sub2_5145
									.method3098(buffer, true);
							if (!jaclib.memory.Stream.method353()) {
								for (int i_85_ = i_78_; i_80_ > i_85_; i_85_++) {
									int i_86_ = (i_85_
											* ((Class12) this).anInt103 + i_77_);
									for (int i_87_ = i_77_; ((i_87_ ^ 0xffffffff) > (i_79_ ^ 0xffffffff)); i_87_++) {
										if (bools[i_87_ - i_77_][-i_78_ + i_85_]) {
											short[] is = (((Class12_Sub1) this).aShortArrayArray5125[i_86_]);
											if (is != null) {
												for (int i_88_ = 0; ((i_88_ ^ 0xffffffff) > (is.length ^ 0xffffffff)); i_88_++) {
													int i_89_ = is[i_88_] & 0xffff;
													stream.method346(i_89_);
													if ((i_89_ ^ 0xffffffff) > (i_82_ ^ 0xffffffff))
														i_82_ = i_89_;
													i_81_++;
													if ((i_83_ ^ 0xffffffff) > (i_89_ ^ 0xffffffff))
														i_83_ = i_89_;
												}
											}
										}
										i_86_++;
									}
								}
							} else {
								for (int i_90_ = i_78_; i_80_ > i_90_; i_90_++) {
									int i_91_ = (((Class12) this).anInt103
											* i_90_ + i_77_);
									for (int i_92_ = i_77_; ((i_79_ ^ 0xffffffff) < (i_92_ ^ 0xffffffff)); i_92_++) {
										if (bools[i_92_ + -i_77_][-i_78_
												+ i_90_]) {
											short[] is = (((Class12_Sub1) this).aShortArrayArray5125[i_91_]);
											if (is != null) {
												for (int i_93_ = 0; i_93_ < is.length; i_93_++) {
													int i_94_ = is[i_93_] & 0xffff;
													i_81_++;
													if (i_83_ < i_94_)
														i_83_ = i_94_;
													if (i_94_ < i_82_)
														i_82_ = i_94_;
													stream.method345(i_94_);
												}
											}
										}
										i_91_++;
									}
								}
							}
							stream.method347();
							if (interface27.method40((byte) 106))
								break;
						}
					}
					if (i_81_ <= 0)
						break;
					((Class12_Sub1) this).aClass163_Sub2_5145.method3019(false);
					((Class12_Sub1) this).aClass163_Sub2_5145.method3057(false,
							8406);
					((Class12_Sub1) this).aClass163_Sub2_5145.method3068(false,
							-22042);
					((Class12_Sub1) this).aClass163_Sub2_5145.method3050(false,
							-32);
					((Class12_Sub1) this).aClass163_Sub2_5145.method3039(false,
							(byte) -85);
					((Class12_Sub1) this).aClass163_Sub2_5145.method2994(-1, 0);
					((Class12_Sub1) this).aClass163_Sub2_5145.method2998(false,
							-2, 32242, false);
					((Class12_Sub1) this).aClass163_Sub2_5145.method3094(null,
							-2);
					Class33_Sub2 class33_sub2 = ((Class12_Sub1) this).aClass163_Sub2_5145
							.method2969(3);
					float[] fs = ((Class12_Sub1) this).aClass163_Sub2_5145
							.method3092(-10579);
					fs[9] = 0.0F;
					fs[0] = ((float) i_76_ / (128.0F * (float) ((Class12) this).anInt93 * (float) ((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).anInt7393));
					fs[7] = 0.0F;
					fs[1] = 0.0F;
					fs[5] = ((float) i_76_ / ((float) ((Class12) this).anInt93 * 128.0F * (float) ((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).anInt7421));
					fs[8] = 0.0F;
					fs[14] = -aFloat5147 / (-aFloat5147 + aFloat5123);
					fs[15] = 1.0F;
					fs[11] = 0.0F;
					fs[2] = 0.0F;
					fs[4] = 0.0F;
					fs[12] = -(((float) (i_76_ * i_77_) / 128.0F - (float) (2 * i)) / (float) (((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).anInt7393))
							+ -1.0F;
					fs[3] = 0.0F;
					fs[13] = -(((float) (i_75_ * 2) + (float) (i_76_ * i_80_) / 128.0F) / (float) (((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).anInt7421)) + 1.0F;
					fs[10] = 1.0F / (aFloat5123 - aFloat5147);
					fs[6] = 0.0F;
					class33_sub2.method2760(false, 1.0F, 1.0F, 0.0F, 0.0F,
							0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
					((Class12_Sub1) this).aClass163_Sub2_5145
							.method3100((byte) 118);
					((Class12_Sub1) this).aClass163_Sub2_5145.method3093(2);
					if ((((Class12_Sub1) this).anInt5149 & 0x7) != 0) {
						((Class12_Sub1) this).aClass163_Sub2_5145.method3068(
								true, -22042);
						((Class12_Sub1) this).aClass163_Sub2_5145.method3080(1);
					} else
						((Class12_Sub1) this).aClass163_Sub2_5145.method3068(
								false, -22042);
					((Class12_Sub1) this).aClass163_Sub2_5145.method3042(
							(byte) 115, false);
					((Class12_Sub1) this).aClass163_Sub2_5145.method2996(0, 1,
							anInterface3_5162);
					((Class12_Sub1) this).aClass163_Sub2_5145.method2996(1, 1,
							anInterface3_5160);
					((Class12_Sub1) this).aClass163_Sub2_5145.method3012(
							((Class12_Sub1) this).aClass219_5158, 16);
					((Class12_Sub1) this).aClass163_Sub2_5145.method3063(-i_82_
							+ i_83_ + 1, i_81_ / 3, Class346.aClass183_4590,
							-17390, i_82_, interface27, 0);
					((Class12_Sub1) this).aClass163_Sub2_5145.method3042(
							(byte) 115, true);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("aca.D(" + i + ','
						+ i_75_ + ',' + i_76_ + ',' + i_77_ + ',' + i_78_ + ','
						+ i_79_ + ',' + i_80_ + ','
						+ (bools != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void U(int i, int i_95_, int[] is, int[] is_96_, int[] is_97_,
			int[] is_98_, int[] is_99_, int[] is_100_, int[] is_101_,
			int[] is_102_, int i_103_, int i_104_, int i_105_, boolean bool) {
		try {
			anInt5144++;
			if (is_96_ != null && anIntArrayArrayArray5142 == null)
				anIntArrayArrayArray5142 = (new int[((Class12) this).anInt103][((Class12) this).anInt98][]);
			Interface1 interface1 = (((Class163) ((Class12_Sub1) this).aClass163_Sub2_5145).anInterface1_2118);
			if (is_98_ != null && anIntArrayArrayArray5139 == null)
				anIntArrayArrayArray5139 = (new int[((Class12) this).anInt103][((Class12) this).anInt98][]);
			((Class12_Sub1) this).anIntArrayArrayArray5135[i][i_95_] = is;
			((Class12_Sub1) this).anIntArrayArrayArray5134[i][i_95_] = is_97_;
			((Class12_Sub1) this).anIntArrayArrayArray5131[i][i_95_] = is_99_;
			anIntArrayArrayArray5151[i][i_95_] = is_100_;
			if (anIntArrayArrayArray5139 != null)
				anIntArrayArrayArray5139[i][i_95_] = is_98_;
			if (anIntArrayArrayArray5142 != null)
				anIntArrayArrayArray5142[i][i_95_] = is_96_;
			Class11_Sub44[] class11_sub44s = (aClass11_Sub44ArrayArrayArray5148[i][i_95_] = new Class11_Sub44[is_99_.length]);
			for (int i_106_ = 0; (i_106_ ^ 0xffffffff) > (is_99_.length ^ 0xffffffff); i_106_++) {
				int i_107_ = is_101_[i_106_];
				int i_108_ = is_102_[i_106_];
				if ((0x20 & ((Class12_Sub1) this).anInt5149 ^ 0xffffffff) != -1
						&& i_107_ != -1
						&& (((Class188) interface1.method7((byte) 127, i_107_)).aBool2416)) {
					i_107_ = -1;
					i_108_ = 128;
				}
				long l = ((long) i_105_ << 48 | (long) i_104_ << 42
						| (long) i_103_ << 28 | (long) (i_108_ << 14) | (long) i_107_);
				Class11 class11;
				for (class11 = aClass213_5157.method1369((byte) 26, l); class11 != null; class11 = aClass213_5157
						.method1363(0)) {
					Class11_Sub44 class11_sub44 = (Class11_Sub44) class11;
					if (((Class11_Sub44) class11_sub44).anInt7789 == i_107_
							&& ((float) i_108_ == ((Class11_Sub44) class11_sub44).aFloat7775)
							&& ((i_103_ ^ 0xffffffff) == (((Class11_Sub44) class11_sub44).anInt7780 ^ 0xffffffff))
							&& ((Class11_Sub44) class11_sub44).anInt7778 == i_104_
							&& (((Class11_Sub44) class11_sub44).anInt7774 ^ 0xffffffff) == (i_105_ ^ 0xffffffff))
						break;
				}
				if (class11 == null) {
					class11_sub44s[i_106_] = new Class11_Sub44(this, i_107_,
							i_108_, i_103_, i_104_, i_105_);
					aClass213_5157.method1368(l, class11_sub44s[i_106_],
							(byte) -26);
				} else
					class11_sub44s[i_106_] = (Class11_Sub44) class11;
			}
			if (bool)
				aByteArrayArray5127[i][i_95_] = (byte) Class173.method1134(
						aByteArrayArray5127[i][i_95_], 1);
			if (is_99_.length > anInt5163)
				anInt5163 = is_99_.length;
			anInt5164 += is_99_.length;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("aca.U(" + i + ','
					+ i_95_ + ',' + (is != null ? "{...}" : "null") + ','
					+ (is_96_ != null ? "{...}" : "null") + ','
					+ (is_97_ != null ? "{...}" : "null") + ','
					+ (is_98_ != null ? "{...}" : "null") + ','
					+ (is_99_ != null ? "{...}" : "null") + ','
					+ (is_100_ != null ? "{...}" : "null") + ','
					+ (is_101_ != null ? "{...}" : "null") + ','
					+ (is_102_ != null ? "{...}" : "null") + ',' + i_103_ + ','
					+ i_104_ + ',' + i_105_ + ',' + bool + ')'));
		}
	}

	final void YA() {
		try {
			anInt5126++;
			if (anInt5164 <= 0)
				aClass226_5155 = null;
			else {
				byte[][] is = (new byte[1 + ((Class12) this).anInt103][1 + ((Class12) this).anInt98]);
				for (int i = 1; ((((Class12) this).anInt103 ^ 0xffffffff) < (i ^ 0xffffffff)); i++) {
					for (int i_109_ = 1; i_109_ < ((Class12) this).anInt98; i_109_++)
						is[i][i_109_] = (byte) ((aByteArrayArray5161[i][i_109_] >> 1) + ((aByteArrayArray5161[i][1 + i_109_] >> 3) + ((aByteArrayArray5161[i][i_109_ - 1] >> 2)
								+ ((aByteArrayArray5161[i - 1][i_109_]) >> 2) + ((aByteArrayArray5161[1 + i][i_109_]) >> 3))));
				}
				Class11_Sub44[] class11_sub44s = new Class11_Sub44[aClass213_5157
						.method1366(58)];
				aClass213_5157.method1370(class11_sub44s, -1);
				for (int i = 0; (i ^ 0xffffffff) > (class11_sub44s.length ^ 0xffffffff); i++)
					class11_sub44s[i].method3137(anInt5164, 31601);
				int i = 20;
				if (anIntArrayArrayArray5139 != null)
					i += 4;
				if ((((Class12_Sub1) this).anInt5149 & 0x7 ^ 0xffffffff) != -1)
					i += 12;
				jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer = ((Class163_Sub2) ((Class12_Sub1) this).aClass163_Sub2_5145).aNativeHeap7426
						.method531(4 * anInt5164, false);
				jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer_110_ = ((Class163_Sub2) ((Class12_Sub1) this).aClass163_Sub2_5145).aNativeHeap7426
						.method531(i * anInt5164, false);
				jaclib.memory.Stream stream = new jaclib.memory.Stream(
						nativeheapbuffer_110_);
				jaclib.memory.Stream stream_111_ = new jaclib.memory.Stream(
						nativeheapbuffer);
				Class11_Sub44[] class11_sub44s_112_ = new Class11_Sub44[anInt5164];
				int i_113_ = Class94.method635(-1350259935, anInt5164 / 4);
				if (i_113_ < 1)
					i_113_ = 1;
				Class213 class213 = new Class213(i_113_);
				Class11_Sub44[] class11_sub44s_114_ = new Class11_Sub44[anInt5163];
				for (int i_115_ = 0; ((((Class12) this).anInt103 ^ 0xffffffff) < (i_115_ ^ 0xffffffff)); i_115_++) {
					for (int i_116_ = 0; ((((Class12) this).anInt98 ^ 0xffffffff) < (i_116_ ^ 0xffffffff)); i_116_++) {
						if ((((Class12_Sub1) this).anIntArrayArrayArray5131[i_115_][i_116_]) != null) {
							Class11_Sub44[] class11_sub44s_117_ = (aClass11_Sub44ArrayArrayArray5148[i_115_][i_116_]);
							int[] is_118_ = (((Class12_Sub1) this).anIntArrayArrayArray5135[i_115_][i_116_]);
							int[] is_119_ = (((Class12_Sub1) this).anIntArrayArrayArray5134[i_115_][i_116_]);
							int[] is_120_ = anIntArrayArrayArray5151[i_115_][i_116_];
							int[] is_121_ = (((Class12_Sub1) this).anIntArrayArrayArray5131[i_115_][i_116_]);
							int[] is_122_ = (anIntArrayArrayArray5142 != null ? anIntArrayArrayArray5142[i_115_][i_116_]
									: null);
							int[] is_123_ = (anIntArrayArrayArray5139 != null ? anIntArrayArrayArray5139[i_115_][i_116_]
									: null);
							if (is_120_ == null)
								is_120_ = is_121_;
							float f = aFloatArrayArray5165[i_115_][i_116_];
							float f_124_ = aFloatArrayArray5166[i_115_][i_116_];
							float f_125_ = aFloatArrayArray5168[i_115_][i_116_];
							float f_126_ = aFloatArrayArray5165[i_115_][i_116_ + 1];
							float f_127_ = aFloatArrayArray5166[i_115_][1 + i_116_];
							float f_128_ = aFloatArrayArray5168[i_115_][i_116_ + 1];
							float f_129_ = aFloatArrayArray5165[1 + i_115_][1 + i_116_];
							float f_130_ = aFloatArrayArray5166[1 + i_115_][1 + i_116_];
							float f_131_ = aFloatArrayArray5168[1 + i_115_][1 + i_116_];
							float f_132_ = aFloatArrayArray5165[1 + i_115_][i_116_];
							float f_133_ = aFloatArrayArray5166[i_115_ + 1][i_116_];
							float f_134_ = aFloatArrayArray5168[i_115_ + 1][i_116_];
							int i_135_ = is[i_115_][i_116_] & 0xff;
							int i_136_ = is[i_115_][i_116_ + 1] & 0xff;
							int i_137_ = is[i_115_ + 1][i_116_ + 1] & 0xff;
							int i_138_ = is[1 + i_115_][i_116_] & 0xff;
							int i_139_ = 0;
							while_41_: for (int i_140_ = 0; ((i_140_ ^ 0xffffffff) > (is_121_.length ^ 0xffffffff)); i_140_++) {
								Class11_Sub44 class11_sub44 = class11_sub44s_117_[i_140_];
								for (int i_141_ = 0; i_139_ > i_141_; i_141_++) {
									if (class11_sub44 == class11_sub44s_114_[i_141_])
										continue while_41_;
								}
								class11_sub44s_114_[i_139_++] = class11_sub44;
							}
							short[] is_142_ = (((Class12_Sub1) this).aShortArrayArray5125[(i_115_ + ((Class12) this).anInt103
									* i_116_)] = new short[is_121_.length]);
							for (int i_143_ = 0; is_121_.length > i_143_; i_143_++) {
								int i_144_ = ((i_115_ << ((Class12) this).anInt97) + is_118_[i_143_]);
								int i_145_ = ((i_116_ << ((Class12) this).anInt97) + is_119_[i_143_]);
								int i_146_ = i_144_ >> anInt5120;
								int i_147_ = i_145_ >> anInt5120;
								int i_148_ = is_121_[i_143_];
								int i_149_ = is_120_[i_143_];
								int i_150_ = is_122_ == null ? 0
										: is_122_[i_143_];
								long l = ((long) i_147_ | ((long) (i_146_ << 16) | ((long) i_148_ << 32 | (long) i_149_ << 48)));
								int i_151_ = is_118_[i_143_];
								int i_152_ = is_119_[i_143_];
								int i_153_ = 74;
								int i_154_ = 0;
								float f_155_;
								float f_156_;
								float f_157_;
								if (i_151_ == 0 && (i_152_ ^ 0xffffffff) == -1) {
									i_153_ -= i_135_;
									f_156_ = f_124_;
									f_155_ = f;
									f_157_ = f_125_;
								} else if (i_151_ != 0
										|| (((Class12) this).anInt93 != i_152_)) {
									if ((((Class12) this).anInt93 ^ 0xffffffff) == (i_151_ ^ 0xffffffff)
											&& ((((Class12) this).anInt93 ^ 0xffffffff) == (i_152_ ^ 0xffffffff))) {
										i_153_ -= i_137_;
										f_155_ = f_129_;
										f_156_ = f_130_;
										f_157_ = f_131_;
									} else if (((((Class12) this).anInt93 ^ 0xffffffff) == (i_151_ ^ 0xffffffff))
											&& ((i_152_ ^ 0xffffffff) == -1)) {
										f_156_ = f_133_;
										i_153_ -= i_138_;
										f_155_ = f_132_;
										f_157_ = f_134_;
									} else {
										float f_158_ = ((float) i_151_ / (float) (((Class12) this).anInt93));
										float f_159_ = ((float) i_152_ / (float) (((Class12) this).anInt93));
										float f_160_ = f_158_ * (-f + f_132_)
												+ f;
										float f_161_ = (f_158_
												* (-f_124_ + f_133_) + f_124_);
										float f_162_ = (f_125_ + (-f_125_ + f_134_)
												* f_158_);
										float f_163_ = (f_126_ + (f_129_ - f_126_)
												* f_158_);
										float f_164_ = (f_158_
												* (-f_127_ + f_130_) + f_127_);
										f_156_ = f_161_
												+ ((f_164_ - f_161_) * f_159_);
										f_155_ = ((-f_160_ + f_163_) * f_159_ + f_160_);
										float f_165_ = (f_128_ + f_158_
												* (f_131_ - f_128_));
										f_157_ = f_162_
												+ ((f_165_ - f_162_) * f_159_);
										int i_166_ = ((i_151_
												* (-i_135_ + i_138_) >> ((Class12) this).anInt97) + i_135_);
										int i_167_ = ((i_151_
												* (-i_136_ + i_137_) >> ((Class12) this).anInt97) + i_136_);
										i_153_ -= (((-i_166_ + i_167_) * i_152_ >> ((Class12) this).anInt97) + i_166_);
									}
								} else {
									f_157_ = f_128_;
									i_153_ -= i_136_;
									f_156_ = f_127_;
									f_155_ = f_126_;
								}
								float f_168_ = 1.0F;
								if ((i_148_ ^ 0xffffffff) != 0) {
									int i_169_ = (0x7f & i_148_) * i_153_ >> 7;
									if ((i_169_ ^ 0xffffffff) <= -3) {
										if (i_169_ > 126)
											i_169_ = 126;
									} else
										i_169_ = 2;
									if ((0x7 & ((Class12_Sub1) this).anInt5149) == 0) {
										f_168_ = ((((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).aFloatArray7578[2])
												* f_157_ + (((((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).aFloatArray7578[1]) * f_156_) + ((((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).aFloatArray7578[0]) * f_155_)));
										f_168_ = ((((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).aFloat7606) + (f_168_ * (!(f_168_ > 0.0F) ? (((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).aFloat7588)
												: (((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).aFloat7589))));
									}
									i_154_ = (Class27.anIntArray359[i_148_
											& 0xff80 | i_169_]);
								}
								Class11 class11 = null;
								if (((i_144_ & -1 + anInt5138 ^ 0xffffffff) == -1)
										&& (-1 + anInt5138 & i_145_) == 0)
									class11 = class213.method1369((byte) 26, l);
								int i_170_;
								if (class11 == null) {
									int i_171_;
									if ((i_149_ ^ 0xffffffff) == (i_148_ ^ 0xffffffff))
										i_171_ = i_154_;
									else {
										int i_172_ = i_153_ * (i_149_ & 0x7f) >> 7;
										if (i_172_ >= 2) {
											if (i_172_ > 126)
												i_172_ = 126;
										} else
											i_172_ = 2;
										i_171_ = (Class27.anIntArray359[0xff80
												& i_149_ | i_172_]);
										if (((((Class12_Sub1) this).anInt5149 & 0x7) ^ 0xffffffff) == -1) {
											float f_173_ = (((((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).aFloatArray7578[2]) * f_157_) + ((((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).aFloatArray7578[1])
													* f_156_ + (((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).aFloatArray7578[0])
													* f_155_));
											f_173_ = ((f_168_ > 0.0F ? (((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).aFloat7589)
													: (((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).aFloat7588))
													* f_168_ + (((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).aFloat7606));
											int i_174_ = i_171_ >> 16 & 0xff;
											int i_175_ = i_171_ >> 8 & 0xff;
											int i_176_ = i_171_ & 0xff;
											i_174_ *= f_173_;
											i_175_ *= f_173_;
											if ((i_174_ ^ 0xffffffff) <= -1) {
												if (i_174_ > 255)
													i_174_ = 255;
											} else
												i_174_ = 0;
											if ((i_175_ ^ 0xffffffff) > -1)
												i_175_ = 0;
											else if ((i_175_ ^ 0xffffffff) < -256)
												i_175_ = 255;
											i_176_ *= f_173_;
											if ((i_176_ ^ 0xffffffff) > -1)
												i_176_ = 0;
											else if (i_176_ > 255)
												i_176_ = 255;
											i_171_ = (i_174_ << 16
													| i_175_ << 8 | i_176_);
										}
									}
									if (!jaclib.memory.Stream.method353()) {
										stream.method349((float) i_144_);
										stream.method349((float) (i_150_ + this
												.method130(i_145_, i_144_, 108)));
										stream.method349((float) i_145_);
										stream.method349((float) i_144_);
										stream.method349((float) i_145_);
										if (anIntArrayArrayArray5139 != null)
											stream.method349((float) (is_123_ != null ? is_123_[i_143_] - 1
													: 0));
										if (((((Class12_Sub1) this).anInt5149 & 0x7) ^ 0xffffffff) != -1) {
											stream.method349(f_155_);
											stream.method349(f_156_);
											stream.method349(f_157_);
										}
									} else {
										stream.method357((float) i_144_);
										stream.method357((float) (this
												.method130(i_145_, i_144_, -123) + i_150_));
										stream.method357((float) i_145_);
										stream.method357((float) i_144_);
										stream.method357((float) i_145_);
										if (anIntArrayArrayArray5139 != null)
											stream.method357((float) (is_123_ != null ? is_123_[i_143_] - 1
													: 0));
										if ((0x7 & ((Class12_Sub1) this).anInt5149) != 0) {
											stream.method357(f_155_);
											stream.method357(f_156_);
											stream.method357(f_157_);
										}
									}
									if ((((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).anInt7608 ^ 0xffffffff) == -1)
										stream_111_.method344(~0xffffff
												| i_171_);
									else
										stream_111_.method354(~0xffffff
												| i_171_);
									i_170_ = anInt5130++;
									is_142_[i_143_] = (short) i_170_;
									if (i_148_ != -1)
										class11_sub44s_112_[i_170_] = class11_sub44s_117_[i_143_];
									class213.method1368(l, new Class11_Sub11(
											is_142_[i_143_]), (byte) -26);
								} else {
									is_142_[i_143_] = ((Class11_Sub11) (Class11_Sub11) class11).aShort5399;
									i_170_ = 0xffff & is_142_[i_143_];
									if ((i_148_ ^ 0xffffffff) != 0
											&& (((Class11) (class11_sub44s_117_[i_143_])).aLong91 < ((Class11) (class11_sub44s_112_[i_170_])).aLong91))
										class11_sub44s_112_[i_170_] = class11_sub44s_117_[i_143_];
								}
								for (int i_177_ = 0; ((i_139_ ^ 0xffffffff) < (i_177_ ^ 0xffffffff)); i_177_++)
									class11_sub44s_114_[i_177_]
											.method3132(f_168_, i_170_, i_154_,
													i_153_, 125);
								anInt5136++;
							}
						}
					}
				}
				for (int i_178_ = 0; (anInt5130 ^ 0xffffffff) < (i_178_ ^ 0xffffffff); i_178_++) {
					Class11_Sub44 class11_sub44 = class11_sub44s_112_[i_178_];
					if (class11_sub44 != null)
						class11_sub44.method3136((byte) -80, i_178_);
				}
				for (int i_179_ = 0; ((i_179_ ^ 0xffffffff) > (((Class12) this).anInt103 ^ 0xffffffff)); i_179_++) {
					for (int i_180_ = 0; ((Class12) this).anInt98 > i_180_; i_180_++) {
						short[] is_181_ = (((Class12_Sub1) this).aShortArrayArray5125[i_179_
								+ i_180_ * ((Class12) this).anInt103]);
						if (is_181_ != null) {
							int i_182_ = 0;
							int i_183_ = 0;
							while (i_183_ < is_181_.length) {
								int i_184_ = 0xffff & is_181_[i_183_++];
								int i_185_ = is_181_[i_183_++] & 0xffff;
								int i_186_ = is_181_[i_183_++] & 0xffff;
								Class11_Sub44 class11_sub44 = class11_sub44s_112_[i_184_];
								Class11_Sub44 class11_sub44_187_ = class11_sub44s_112_[i_185_];
								Class11_Sub44 class11_sub44_188_ = class11_sub44s_112_[i_186_];
								Class11_Sub44 class11_sub44_189_ = null;
								if (class11_sub44 != null) {
									class11_sub44_189_ = class11_sub44;
									class11_sub44.method3135(i_182_, -99,
											i_179_, i_180_);
								}
								if (class11_sub44_187_ != null) {
									class11_sub44_187_.method3135(i_182_, -89,
											i_179_, i_180_);
									if (class11_sub44_189_ == null
											|| ((((Class11) class11_sub44_187_).aLong91) < (((Class11) class11_sub44_189_).aLong91)))
										class11_sub44_189_ = class11_sub44_187_;
								}
								if (class11_sub44_188_ != null) {
									class11_sub44_188_.method3135(i_182_, -50,
											i_179_, i_180_);
									if (class11_sub44_189_ == null
											|| (((((Class11) class11_sub44_188_).aLong91) ^ 0xffffffffffffffffL) > ((((Class11) class11_sub44_189_).aLong91) ^ 0xffffffffffffffffL)))
										class11_sub44_189_ = class11_sub44_188_;
								}
								if (class11_sub44_189_ != null) {
									if (class11_sub44 != null)
										class11_sub44_189_.method3136(
												(byte) -45, i_184_);
									if (class11_sub44_187_ != null)
										class11_sub44_189_.method3136(
												(byte) -54, i_185_);
									if (class11_sub44_188_ != null)
										class11_sub44_189_.method3136(
												(byte) -103, i_186_);
									class11_sub44_189_.method3135(i_182_, -56,
											i_179_, i_180_);
								}
								i_182_++;
							}
						}
					}
				}
				stream.method347();
				stream_111_.method347();
				anInterface3_5160 = ((Class12_Sub1) this).aClass163_Sub2_5145
						.method3005(false, 30519);
				anInterface3_5160.method11(nativeheapbuffer, (byte) -84,
						anInt5130 * 4, 4);
				anInterface3_5162 = ((Class12_Sub1) this).aClass163_Sub2_5145
						.method3005(false, 30519);
				anInterface3_5162.method11(nativeheapbuffer_110_, (byte) 120, i
						* anInt5130, i);
				if ((0x7 & ((Class12_Sub1) this).anInt5149) != 0) {
					if (anIntArrayArrayArray5139 == null)
						((Class12_Sub1) this).aClass219_5158 = (((Class12_Sub1) this).aClass163_Sub2_5145
								.method3018((new Class315[] {
										new Class315(new Class27[] {
												Class27.aClass27_345,
												Class27.aClass27_354,
												Class27.aClass27_351 }),
										new Class315(Class27.aClass27_352) }),
										(byte) 70));
					else
						((Class12_Sub1) this).aClass219_5158 = (((Class12_Sub1) this).aClass163_Sub2_5145
								.method3018((new Class315[] {
										new Class315(new Class27[] {
												Class27.aClass27_345,
												Class27.aClass27_354,
												Class27.aClass27_353,
												Class27.aClass27_351 }),
										new Class315(Class27.aClass27_352) }),
										(byte) 78));
				} else if (anIntArrayArrayArray5139 != null)
					((Class12_Sub1) this).aClass219_5158 = (((Class12_Sub1) this).aClass163_Sub2_5145
							.method3018((new Class315[] {
									new Class315(new Class27[] {
											Class27.aClass27_345,
											Class27.aClass27_354,
											Class27.aClass27_353 }),
									new Class315(Class27.aClass27_352) }),
									(byte) -91));
				else
					((Class12_Sub1) this).aClass219_5158 = (((Class12_Sub1) this).aClass163_Sub2_5145
							.method3018((new Class315[] {
									new Class315(new Class27[] {
											Class27.aClass27_345,
											Class27.aClass27_354 }),
									new Class315(Class27.aClass27_352) }),
									(byte) 94));
				int i_190_ = 0;
				for (int i_191_ = 0; ((i_191_ ^ 0xffffffff) > (class11_sub44s.length ^ 0xffffffff)); i_191_++) {
					if (((Class11_Sub44) class11_sub44s[i_191_]).anInt7781 > 0)
						class11_sub44s[i_190_++] = class11_sub44s[i_191_];
				}
				aClass11_Sub44Array5167 = new Class11_Sub44[i_190_];
				long[] ls = new long[i_190_];
				for (int i_192_ = 0; i_192_ < i_190_; i_192_++) {
					Class11_Sub44 class11_sub44 = class11_sub44s[i_192_];
					ls[i_192_] = ((Class11) class11_sub44).aLong91;
					aClass11_Sub44Array5167[i_192_] = class11_sub44;
					class11_sub44.method3133(4, anInt5130);
				}
				Class234_Sub1_Sub1.method3828(ls, 0, aClass11_Sub44Array5167);
				if (aClass226_5155 != null)
					aClass226_5155.method1455((byte) -128);
			}
			aFloatArrayArray5165 = aFloatArrayArray5166 = aFloatArrayArray5168 = null;
			anIntArrayArrayArray5151 = null;
			anIntArrayArrayArray5139 = null;
			((Class12_Sub1) this).anIntArrayArrayArray5135 = ((Class12_Sub1) this).anIntArrayArrayArray5134 = null;
			anIntArrayArrayArray5142 = null;
			((Class12_Sub1) this).anIntArrayArrayArray5131 = null;
			aClass11_Sub44ArrayArrayArray5148 = null;
			aByteArrayArray5161 = null;
			aClass213_5157 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aca.YA(" + ')');
		}
	}

	private final void method2292(boolean bool, byte i, int i_193_,
			boolean[][] bools, int i_194_, int i_195_, int i_196_, int i_197_) {
		do {
			try {
				int i_198_ = -63 % ((i + 80) / 36);
				anInt5133++;
				if (aClass11_Sub44Array5167 == null)
					break;
				int i_199_ = i_197_ + (i_197_ + 1);
				i_199_ *= i_199_;
				if (i_199_ > Class376_Sub7_Sub1_Sub1.anIntArray10085.length)
					Class376_Sub7_Sub1_Sub1.anIntArray10085 = new int[i_199_];
				int i_200_ = -i_197_ + i_196_;
				int i_201_ = i_200_;
				if ((i_200_ ^ 0xffffffff) > -1)
					i_200_ = 0;
				int i_202_ = -i_197_ + i_194_;
				int i_203_ = i_202_;
				if (i_202_ < 0)
					i_202_ = 0;
				int i_204_ = i_197_ + i_196_;
				if (i_204_ > ((Class12) this).anInt103 - 1)
					i_204_ = ((Class12) this).anInt103 - 1;
				int i_205_ = i_194_ + i_197_;
				client.anInt10529 = 0;
				if (i_205_ > ((Class12) this).anInt98 - 1)
					i_205_ = ((Class12) this).anInt98 - 1;
				for (int i_206_ = i_200_; (i_206_ ^ 0xffffffff) >= (i_204_ ^ 0xffffffff); i_206_++) {
					boolean[] bools_207_ = bools[i_206_ + -i_201_];
					for (int i_208_ = i_202_; (i_208_ ^ 0xffffffff) >= (i_205_ ^ 0xffffffff); i_208_++) {
						if (bools_207_[i_208_ + -i_203_])
							Class376_Sub7_Sub1_Sub1.anIntArray10085[client.anInt10529++] = i_208_
									* ((Class12) this).anInt103 - -i_206_;
					}
				}
				if ((i_193_ ^ 0xffffffff) == 0)
					((Class12_Sub1) this).aClass163_Sub2_5145.method2997(false);
				else {
					((Class12_Sub1) this).aClass163_Sub2_5145.method3069(
							(float) i_193_, 31823);
					((Class12_Sub1) this).aClass163_Sub2_5145.method2995(1);
				}
				((Class12_Sub1) this).aClass163_Sub2_5145
						.method3090((byte) 115);
				((Class12_Sub1) this).aClass163_Sub2_5145.method3068(
						(0x7 & ((Class12_Sub1) this).anInt5149) != 0, -22042);
				((Class12_Sub1) this).aClass163_Sub2_5145.method2998(false, -1,
						32242, false);
				((Class12_Sub1) this).aClass163_Sub2_5145.method2996(0, 1,
						anInterface3_5162);
				for (int i_209_ = 0; aClass11_Sub44Array5167.length > i_209_; i_209_++)
					aClass11_Sub44Array5167[i_209_].method3134(0,
							Class376_Sub7_Sub1_Sub1.anIntArray10085,
							client.anInt10529);
				Class33_Sub2 class33_sub2 = ((Class12_Sub1) this).aClass163_Sub2_5145
						.method2969(3);
				class33_sub2.method301(0, -1, 0);
				((Class12_Sub1) this).aClass163_Sub2_5145.method3093(2);
				if (!aClass84_5143.method576((byte) 27)) {
					int i_210_ = (((Class163_Sub2) ((Class12_Sub1) this).aClass163_Sub2_5145).anInt7636);
					int i_211_ = (((Class163_Sub2) ((Class12_Sub1) this).aClass163_Sub2_5145).anInt7600);
					((Class12_Sub1) this).aClass163_Sub2_5145
							.L(0,
									i_211_,
									((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).anInt7628);
					((Class12_Sub1) this).aClass163_Sub2_5145.method3068(false,
							-22042);
					((Class12_Sub1) this).aClass163_Sub2_5145.method3039(false,
							(byte) -123);
					((Class12_Sub1) this).aClass163_Sub2_5145.method2994(-1,
							128);
					((Class12_Sub1) this).aClass163_Sub2_5145.method2998(false,
							-2, 32242, false);
					((Class12_Sub1) this).aClass163_Sub2_5145
							.method3094(
									(((Class163_Sub2) ((Class12_Sub1) this).aClass163_Sub2_5145).anInterface15_7637),
									-2);
					((Class12_Sub1) this).aClass163_Sub2_5145.method3013(-30,
							Class188.aClass314_2424, Class121.aClass314_1643);
					((Class12_Sub1) this).aClass163_Sub2_5145.method3095(
							(byte) -91, Class68.aClass218_962, 0);
					((Class12_Sub1) this).aClass163_Sub2_5145.method2993(
							Class345.aClass218_4579, 0, 256);
					for (Class11 class11 = aClass84_5143.method584(-12261); class11 != null; class11 = aClass84_5143
							.method578(-15361)) {
						Class11_Sub39 class11_sub39 = (Class11_Sub39) class11;
						class11_sub39.method2928(-71, i_196_, bools, i_194_,
								i_197_);
					}
					((Class12_Sub1) this).aClass163_Sub2_5145.method3095(
							(byte) -111, Class11_Sub45_Sub12.aClass218_9187, 0);
					((Class12_Sub1) this).aClass163_Sub2_5145.method2993(
							Class11_Sub45_Sub12.aClass218_9187, 0, 256);
					((Class12_Sub1) this).aClass163_Sub2_5145.method3094(null,
							-2);
					((Class12_Sub1) this).aClass163_Sub2_5145
							.L(i_210_,
									i_211_,
									((Class163_Sub2) (((Class12_Sub1) this).aClass163_Sub2_5145)).anInt7628);
				}
				if (aClass226_5155 == null)
					break;
				((Class12_Sub1) this).aClass163_Sub2_5145.method2996(0, 1,
						anInterface3_5162);
				((Class12_Sub1) this).aClass163_Sub2_5145.method2996(1, 1,
						anInterface3_5160);
				((Class12_Sub1) this).aClass163_Sub2_5145.method3012(
						((Class12_Sub1) this).aClass219_5158, 16);
				aClass226_5155.method1457(i_194_, i_197_, (byte) 111, bool,
						bools, i_196_);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("aca.M(" + bool
						+ ',' + i + ',' + i_193_ + ','
						+ (bools != null ? "{...}" : "null") + ',' + i_194_
						+ ',' + i_195_ + ',' + i_196_ + ',' + i_197_ + ')'));
			}
			break;
		} while (false);
	}

	final void method127(int i, int i_212_) {
		try {
			anInt5154++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aca.I(" + i + ','
					+ i_212_ + ')');
		}
	}

	final void ka(int i, int i_213_, int i_214_) {
		try {
			if ((0xff & aByteArrayArray5161[i][i_213_]) < i_214_)
				aByteArrayArray5161[i][i_213_] = (byte) i_214_;
			anInt5132++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("aca.ka(" + i + ','
					+ i_213_ + ',' + i_214_ + ')'));
		}
	}

	final void method136(Class11_Sub46 class11_sub46, int[] is) {
		try {
			aClass84_5143.method589((byte) -13, new Class11_Sub39(
					(((Class12_Sub1) this).aClass163_Sub2_5145), this,
					class11_sub46, is));
			anInt5146++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("aca.B("
					+ (class11_sub46 != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}
}
