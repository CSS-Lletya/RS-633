/* Class11_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub28 extends Class11 {
	private int anInt6557;
	static String aString6558;
	static Class376_Sub1_Sub1_Sub1[] aClass376_Sub1_Sub1_Sub1Array6559;
	private float[][] aFloatArrayArray6560;
	private float[][] aFloatArrayArray6561;
	private Class350 aClass350_6562;
	static int anInt6563;
	private Class213 aClass213_6564;
	private Class11_Sub46 aClass11_Sub46_6565;
	static int anInt6566;
	private float[][] aFloatArrayArray6567;
	static Class376_Sub7[] aClass376_Sub7Array6568;
	private Stream aClass11_Sub20_6569;
	static int anInt6570;
	static int anInt6571;
	private int anInt6572;
	private Class163_Sub3 aClass163_Sub3_6573;
	private Interface19 anInterface19_6574;
	static int anInt6575 = -1;
	static boolean aBool6576;
	private Interface9 anInterface9_6577;
	static int anInt6578;
	private Class11_Sub20_Sub2 aClass11_Sub20_Sub2_6579;
	private int anInt6580;
	private int anInt6581;
	private Class350 aClass350_6582;
	static int[] anIntArray6583 = new int[1000];
	static int anInt6584;
	private Class12_Sub3 aClass12_Sub3_6585;
	private int anInt6586;
	static short[] aShortArray6587;
	static int anInt6588;
	private int anInt6589;

	private final void method2716(int i, int i_0_, int i_1_, int i_2_,
			int i_3_, int i_4_, int i_5_) {
		try {
			anInt6578++;
			long l = -1L;
			int i_6_ = i_5_ + (i_3_ << ((Class12) aClass12_Sub3_6585).anInt97);
			if (i_4_ == -563) {
				int i_7_ = (i << ((Class12) aClass12_Sub3_6585).anInt97) + i_0_;
				int i_8_ = aClass12_Sub3_6585.method130(i_7_, i_6_, -124);
				if ((0x7f & i_5_ ^ 0xffffffff) == -1 || (0x7f & i_0_) == 0) {
					l = (0xffffL & (long) i_7_) << 16 | 0xffffL & (long) i_6_;
					Class11 class11 = aClass213_6564.method1369((byte) 26, l);
					if (class11 != null) {
						method2717(
								(((Class11_Sub11) (Class11_Sub11) class11).aShort5399),
								4);
						return;
					}
				}
				short i_9_ = (short) anInt6572++;
				if (l != -1L)
					aClass213_6564.method1368(l, new Class11_Sub11(i_9_),
							(byte) -26);
				float f;
				float f_10_;
				float f_11_;
				if ((i_5_ ^ 0xffffffff) == -1 && (i_0_ ^ 0xffffffff) == -1) {
					f_11_ = aFloatArrayArray6567[i_2_][i_1_];
					f_10_ = aFloatArrayArray6561[i_2_][i_1_];
					f = aFloatArrayArray6560[i_2_][i_1_];
				} else if (((i_5_ ^ 0xffffffff) == (((Class12) aClass12_Sub3_6585).anInt93 ^ 0xffffffff))
						&& i_0_ == 0) {
					f = aFloatArrayArray6560[1 + i_2_][i_1_];
					f_10_ = aFloatArrayArray6561[1 + i_2_][i_1_];
					f_11_ = aFloatArrayArray6567[1 + i_2_][i_1_];
				} else if (((i_5_ ^ 0xffffffff) == (((Class12) aClass12_Sub3_6585).anInt93 ^ 0xffffffff))
						&& i_0_ == ((Class12) aClass12_Sub3_6585).anInt93) {
					f_10_ = aFloatArrayArray6561[1 + i_2_][1 + i_1_];
					f = aFloatArrayArray6560[1 + i_2_][1 + i_1_];
					f_11_ = aFloatArrayArray6567[1 + i_2_][i_1_ + 1];
				} else if ((i_5_ ^ 0xffffffff) != -1
						|| ((Class12) aClass12_Sub3_6585).anInt93 != i_0_) {
					float f_12_ = ((float) i_5_ / (float) ((Class12) aClass12_Sub3_6585).anInt93);
					float f_13_ = ((float) i_0_ / (float) ((Class12) aClass12_Sub3_6585).anInt93);
					float f_14_ = aFloatArrayArray6561[i_2_][i_1_];
					float f_15_ = aFloatArrayArray6560[i_2_][i_1_];
					float f_16_ = aFloatArrayArray6567[i_2_][i_1_];
					float f_17_ = aFloatArrayArray6561[i_2_ + 1][i_1_];
					float f_18_ = aFloatArrayArray6560[i_2_ + 1][i_1_];
					f_16_ += f_12_
							* (-f_16_ + aFloatArrayArray6567[i_2_][i_1_ + 1]);
					f_18_ += f_12_
							* (aFloatArrayArray6560[i_2_ + 1][i_1_ + 1] - f_18_);
					f_14_ += ((-f_14_ + aFloatArrayArray6561[i_2_][1 + i_1_]) * f_12_);
					float f_19_ = aFloatArrayArray6567[i_2_ + 1][i_1_];
					f_15_ += ((-f_15_ + aFloatArrayArray6560[i_2_][i_1_ + 1]) * f_12_);
					f_17_ += ((-f_17_ + aFloatArrayArray6561[1 + i_2_][i_1_ + 1]) * f_12_);
					f_19_ += (aFloatArrayArray6567[1 + i_2_][i_1_ + 1] - f_19_)
							* f_12_;
					f_10_ = f_14_ + f_13_ * (f_17_ - f_14_);
					f = f_15_ + (-f_15_ + f_18_) * f_13_;
					f_11_ = f_16_ + (f_19_ - f_16_) * f_13_;
				} else {
					f_11_ = aFloatArrayArray6567[i_2_][i_1_ + 1];
					f_10_ = aFloatArrayArray6561[i_2_][i_1_ + 1];
					f = aFloatArrayArray6560[i_2_][i_1_ + 1];
				}
				float f_20_ = (float) (aClass11_Sub46_6565.method3203(false) + -i_6_);
				float f_21_ = (float) (-i_8_ + aClass11_Sub46_6565
						.method3205(i_4_ + 540));
				float f_22_ = (float) (-i_7_ + aClass11_Sub46_6565
						.method3204(true));
				float f_23_ = (float) Math.sqrt((double) (f_20_ * f_20_ + f_21_
						* f_21_ + f_22_ * f_22_));
				float f_24_ = 1.0F / f_23_;
				f_21_ *= f_24_;
				f_22_ *= f_24_;
				f_20_ *= f_24_;
				float f_25_ = (f_23_ / (float) aClass11_Sub46_6565
						.method3208(i_4_ + 562));
				float f_26_ = -(f_25_ * f_25_) + 1.0F;
				if (f_26_ < 0.0F)
					f_26_ = 0.0F;
				float f_27_ = f * f_21_ + f_20_ * f_10_ + f_22_ * f_11_;
				if (f_27_ < 0.0F)
					f_27_ = 0.0F;
				float f_28_ = 2.0F * (f_27_ * f_26_);
				if (f_28_ > 1.0F)
					f_28_ = 1.0F;
				int i_29_ = aClass11_Sub46_6565.method3209((byte) 92);
				int i_30_ = (int) (f_28_ * (float) ((i_29_ & 0xffb2c3) >> 16));
				if (i_30_ > 255)
					i_30_ = 255;
				int i_31_ = (int) (f_28_ * (float) ((i_29_ & 0xff1a) >> 8));
				if (i_31_ > 255)
					i_31_ = 255;
				int i_32_ = (int) (f_28_ * (float) (0xff & i_29_));
				if (!((Class163_Sub3) aClass163_Sub3_6573).aBool8348) {
					aClass11_Sub20_Sub2_6579.method3743(-1526311408,
							(float) i_6_);
					aClass11_Sub20_Sub2_6579.method3743(-1526311408,
							(float) i_8_);
					aClass11_Sub20_Sub2_6579.method3743(-1526311408,
							(float) i_7_);
				} else {
					aClass11_Sub20_Sub2_6579.method3744((float) i_6_, -32197);
					aClass11_Sub20_Sub2_6579.method3744((float) i_8_, -32197);
					aClass11_Sub20_Sub2_6579.method3744((float) i_7_, -32197);
				}
				if (i_32_ > 255)
					i_32_ = 255;
				aClass11_Sub20_Sub2_6579.writeByte(i_30_, -1528071456);
				aClass11_Sub20_Sub2_6579.writeByte(i_31_, -1528071456);
				aClass11_Sub20_Sub2_6579.writeByte(i_32_, -1528071456);
				aClass11_Sub20_Sub2_6579.writeByte(255, i_4_ ^ 0x5b14872d);
				method2717(i_9_, 4);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jr.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ')'));
		}
	}

	private final void method2717(short i, int i_33_) {
		do {
			try {
				do {
					if (!((Class163_Sub3) aClass163_Sub3_6573).aBool8348) {
						aClass11_Sub20_6569.method2539(i, -1682769048);
						if (!client.aBool10531)
							break;
					}
					aClass11_Sub20_6569.writeShort(-128, i);
				} while (false);
				anInt6563++;
				if (i_33_ == 4)
					break;
				method2716(65, 79, 26, -61, 69, 123, -42);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "jr.D(" + i + ','
						+ i_33_ + ')');
			}
			break;
		} while (false);
	}

	public static void method2718(int i) {
		try {
			aShortArray6587 = null;
			if (i != -3625)
				method2718(11);
			aString6558 = null;
			anIntArray6583 = null;
			aClass376_Sub7Array6568 = null;
			aClass376_Sub1_Sub1_Sub1Array6559 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jr.E(" + i + ')');
		}
	}

	static final float method2719(float f, int i, float f_34_, byte i_35_,
			float f_36_) {
		try {
			if (i_35_ > -38)
				aClass376_Sub1_Sub1_Sub1Array6559 = null;
			anInt6566++;
			float[] fs = Class11_Sub45_Sub9_Sub2.aFloatArrayArray10265[i];
			return f_36_ * fs[2] + (f_34_ * fs[1] + f * fs[0]);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jr.C(" + f + ',' + i
					+ ',' + f_34_ + ',' + i_35_ + ',' + f_36_ + ')'));
		}
	}

	final void method2720(byte i, int i_37_, boolean[][] bools, int i_38_,
			int i_39_) {
		try {
			anInt6571++;
			if (anInterface19_6574 != null
					&& (anInt6580 ^ 0xffffffff) >= (i_37_ + i_38_ ^ 0xffffffff)
					&& (anInt6581 ^ 0xffffffff) <= (-i_37_ + i_38_ ^ 0xffffffff)
					&& anInt6589 <= i_37_ + i_39_ && anInt6586 >= i_39_ - i_37_) {
				int i_40_ = 121 % ((i + 32) / 62);
				for (int i_41_ = anInt6589; (i_41_ ^ 0xffffffff) >= (anInt6586 ^ 0xffffffff); i_41_++) {
					for (int i_42_ = anInt6580; (anInt6581 ^ 0xffffffff) <= (i_42_ ^ 0xffffffff); i_42_++) {
						int i_43_ = i_42_ - i_38_;
						int i_44_ = -i_39_ + i_41_;
						if ((-i_37_ ^ 0xffffffff) > (i_43_ ^ 0xffffffff)
								&& (i_37_ ^ 0xffffffff) < (i_43_ ^ 0xffffffff)
								&& (-i_37_ ^ 0xffffffff) > (i_44_ ^ 0xffffffff)
								&& (i_37_ ^ 0xffffffff) < (i_44_ ^ 0xffffffff)
								&& bools[i_37_ + i_43_][i_44_ - -i_37_]) {
							aClass163_Sub3_6573
									.method3302(
											(int) (aClass11_Sub46_6565
													.method3211(-18277) * 255.0F) << 24,
											(byte) 28);
							aClass163_Sub3_6573.method3304(null,
									aClass350_6562, aClass350_6582, (byte) 106,
									null);
							aClass163_Sub3_6573.method3288(82, 0, 4, anInt6557,
									anInterface19_6574);
							return;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jr.A(" + i + ','
					+ i_37_ + ',' + (bools != null ? "{...}" : "null") + ','
					+ i_38_ + ',' + i_39_ + ')'));
		}
	}

	Class11_Sub28(Class163_Sub3 class163_sub3, Class12_Sub3 class12_sub3,
			Class11_Sub46 class11_sub46, int[] is) {
		try {
			aClass12_Sub3_6585 = class12_sub3;
			aClass11_Sub46_6565 = class11_sub46;
			aClass163_Sub3_6573 = class163_sub3;
			int i = (aClass11_Sub46_6565.method3208(-1) + -(((Class12) class12_sub3).anInt93 >> 1));
			anInt6580 = (-i + aClass11_Sub46_6565.method3203(false) >> ((Class12) class12_sub3).anInt97);
			anInt6581 = (i + aClass11_Sub46_6565.method3203(false) >> ((Class12) class12_sub3).anInt97);
			anInt6589 = (aClass11_Sub46_6565.method3204(true) + -i >> ((Class12) class12_sub3).anInt97);
			anInt6586 = (i + aClass11_Sub46_6565.method3204(true) >> ((Class12) class12_sub3).anInt97);
			int i_45_ = -anInt6580 + (anInt6581 + 1);
			int i_46_ = anInt6586 - (anInt6589 - 1);
			aFloatArrayArray6561 = new float[1 + i_45_][1 + i_46_];
			aFloatArrayArray6567 = new float[i_45_ + 1][i_46_ + 1];
			aFloatArrayArray6560 = new float[1 + i_45_][i_46_ + 1];
			for (int i_47_ = 0; (i_46_ ^ 0xffffffff) <= (i_47_ ^ 0xffffffff); i_47_++) {
				int i_48_ = anInt6589 + i_47_;
				if ((i_48_ ^ 0xffffffff) < -1
						&& -1 + ((Class12) aClass12_Sub3_6585).anInt98 > i_48_) {
					for (int i_49_ = 0; (i_49_ ^ 0xffffffff) >= (i_45_ ^ 0xffffffff); i_49_++) {
						int i_50_ = anInt6580 + i_49_;
						if (i_50_ > 0
								&& ((i_50_ ^ 0xffffffff) > (((Class12) aClass12_Sub3_6585).anInt103 - 1 ^ 0xffffffff))) {
							int i_51_ = (class12_sub3.method131((byte) 126,
									i_48_, 1 + i_50_) + -class12_sub3
									.method131((byte) -23, i_48_, i_50_ - 1));
							int i_52_ = (class12_sub3.method131((byte) -10,
									i_48_ + 1, i_50_) + -class12_sub3
									.method131((byte) 17, i_48_ - 1, i_50_));
							float f = (float) (1.0 / (Math.sqrt((double) (65536
									+ i_51_ * i_51_ + i_52_ * i_52_))));
							aFloatArrayArray6561[i_49_][i_47_] = (float) i_51_
									* f;
							aFloatArrayArray6560[i_49_][i_47_] = -256.0F * f;
							aFloatArrayArray6567[i_49_][i_47_] = f
									* (float) i_52_;
						}
					}
				}
			}
			int i_53_ = 0;
			for (int i_54_ = anInt6589; (anInt6586 ^ 0xffffffff) <= (i_54_ ^ 0xffffffff); i_54_++) {
				if ((i_54_ ^ 0xffffffff) > -1
						|| ((i_54_ ^ 0xffffffff) <= (((Class12) class12_sub3).anInt98 ^ 0xffffffff)))
					i_53_ += anInt6581 - anInt6580;
				else {
					for (int i_55_ = anInt6580; (anInt6581 ^ 0xffffffff) <= (i_55_ ^ 0xffffffff); i_55_++) {
						if (i_55_ >= 0
								&& ((i_55_ ^ 0xffffffff) > (((Class12) class12_sub3).anInt103 ^ 0xffffffff))) {
							int i_56_ = is[i_53_];
							int[] is_57_ = (((Class12_Sub3) class12_sub3).anIntArrayArrayArray6466[i_55_][i_54_]);
							if (is_57_ != null && (i_56_ ^ 0xffffffff) != -1) {
								if (i_56_ != 1)
									anInt6557 += 3;
								else {
									int i_58_ = 0;
									while ((is_57_.length ^ 0xffffffff) < (i_58_ ^ 0xffffffff)) {
										if ((is_57_[i_58_++] ^ 0xffffffff) != 0
												&& ((is_57_[i_58_++] ^ 0xffffffff) != 0)
												&& ((is_57_[i_58_++] ^ 0xffffffff) != 0))
											anInt6557 += 3;
									}
								}
							}
						}
						i_53_++;
					}
				}
			}
			if ((anInt6557 ^ 0xffffffff) >= -1) {
				aClass350_6562 = null;
				aClass350_6582 = null;
				anInterface9_6577 = null;
				anInterface19_6574 = null;
			} else {
				aClass11_Sub20_6569 = new Stream(2 * anInt6557);
				aClass11_Sub20_Sub2_6579 = new Class11_Sub20_Sub2(
						16 * anInt6557);
				aClass213_6564 = new Class213(Class11_Sub2_Sub33.method3808(
						114, anInt6557));
				i_53_ = 0;
				int i_59_ = 0;
				for (int i_60_ = anInt6589; (anInt6586 ^ 0xffffffff) <= (i_60_ ^ 0xffffffff); i_60_++) {
					if (i_60_ < 0 || i_60_ >= ((Class12) class12_sub3).anInt98)
						i_53_ += anInt6581 + -anInt6580;
					else {
						int i_61_ = 0;
						for (int i_62_ = anInt6580; (i_62_ ^ 0xffffffff) >= (anInt6581 ^ 0xffffffff); i_62_++) {
							if (i_62_ >= 0
									&& ((Class12) class12_sub3).anInt103 > i_62_) {
								int i_63_ = is[i_53_];
								int[] is_64_ = (((Class12_Sub3) class12_sub3).anIntArrayArrayArray6466[i_62_][i_60_]);
								if (is_64_ != null
										&& (i_63_ ^ 0xffffffff) != -1) {
									if (i_63_ != 1) {
										if ((i_63_ ^ 0xffffffff) != -4) {
											if ((i_63_ ^ 0xffffffff) == -3) {
												method2716(
														i_60_,
														0,
														i_59_,
														i_61_,
														i_62_,
														-563,
														(((Class12) class12_sub3).anInt93));
												method2716(
														i_60_,
														(((Class12) class12_sub3).anInt93),
														i_59_,
														i_61_,
														i_62_,
														-563,
														(((Class12) class12_sub3).anInt93));
												method2716(i_60_, 0, i_59_,
														i_61_, i_62_, -563, 0);
											} else if (i_63_ != 5) {
												if (i_63_ == 4) {
													method2716(
															i_60_,
															(((Class12) class12_sub3).anInt93),
															i_59_, i_61_,
															i_62_, -563, 0);
													method2716(i_60_, 0, i_59_,
															i_61_, i_62_, -563,
															0);
													method2716(
															i_60_,
															(((Class12) class12_sub3).anInt93),
															i_59_,
															i_61_,
															i_62_,
															-563,
															(((Class12) class12_sub3).anInt93));
												}
											} else {
												method2716(
														i_60_,
														(((Class12) class12_sub3).anInt93),
														i_59_,
														i_61_,
														i_62_,
														-563,
														(((Class12) class12_sub3).anInt93));
												method2716(
														i_60_,
														(((Class12) class12_sub3).anInt93),
														i_59_, i_61_, i_62_,
														-563, 0);
												method2716(
														i_60_,
														0,
														i_59_,
														i_61_,
														i_62_,
														-563,
														(((Class12) class12_sub3).anInt93));
											}
										} else {
											method2716(i_60_, 0, i_59_, i_61_,
													i_62_, -563, 0);
											method2716(
													i_60_,
													0,
													i_59_,
													i_61_,
													i_62_,
													-563,
													((Class12) class12_sub3).anInt93);
											method2716(
													i_60_,
													((Class12) class12_sub3).anInt93,
													i_59_, i_61_, i_62_, -563,
													0);
										}
									} else {
										int[] is_65_ = (((Class12_Sub3) class12_sub3).anIntArrayArrayArray6467[i_62_][i_60_]);
										int[] is_66_ = (((Class12_Sub3) class12_sub3).anIntArrayArrayArray6446[i_62_][i_60_]);
										int i_67_ = 0;
										while (is_64_.length > i_67_) {
											if (is_64_[i_67_] == -1
													|| is_64_[1 + i_67_] == -1
													|| is_64_[2 + i_67_] == -1)
												i_67_ += 3;
											else {
												method2716(i_60_,
														is_66_[i_67_], i_59_,
														i_61_, i_62_, -563,
														is_65_[i_67_]);
												i_67_++;
												method2716(i_60_,
														is_66_[i_67_], i_59_,
														i_61_, i_62_, -563,
														is_65_[i_67_]);
												i_67_++;
												method2716(i_60_,
														is_66_[i_67_], i_59_,
														i_61_, i_62_, -563,
														is_65_[i_67_]);
												i_67_++;
											}
										}
									}
								}
							}
							i_61_++;
							i_53_++;
						}
					}
					i_59_++;
				}
				anInterface19_6574 = (aClass163_Sub3_6573.method3245(-16889,
						((Stream) aClass11_Sub20_6569).buffer,
						((Stream) aClass11_Sub20_6569).position, 5123, false));
				anInterface9_6577 = (aClass163_Sub3_6573.method3272(
						((Stream) aClass11_Sub20_Sub2_6579).buffer,
						((Stream) aClass11_Sub20_Sub2_6579).position, 16,
						false, (byte) 46));
				aClass350_6562 = new Class350(anInterface9_6577, 5126, 3, 0);
				aClass350_6582 = new Class350(anInterface9_6577, 5121, 4, 12);
			}
			aClass213_6564 = null;
			aClass11_Sub20_6569 = null;
			aClass11_Sub20_Sub2_6579 = null;
			aFloatArrayArray6561 = aFloatArrayArray6560 = aFloatArrayArray6567 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jr.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ','
					+ (class12_sub3 != null ? "{...}" : "null") + ','
					+ (class11_sub46 != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aBool6576 = false;
		aShortArray6587 = new short[256];
	}
}
