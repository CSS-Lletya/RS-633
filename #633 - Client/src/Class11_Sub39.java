/* Class11_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

final class Class11_Sub39 extends Class11 {
	private float[][] aFloatArrayArray7198;
	private Class213 aClass213_7199;
	static byte[][] aByteArrayArray7200;
	static int anInt7201;
	private float[][] aFloatArrayArray7202;
	private jaclib.memory.Stream aStream7203;
	private int anInt7204;
	private jaclib.memory.Stream aStream7205;
	private int anInt7206;
	static int anInt7207;
	private int anInt7208;
	private Class163_Sub2 aClass163_Sub2_7209;
	static int[][][] anIntArrayArrayArray7210 = new int[2][][];
	static int anInt7211;
	private Class11_Sub46 aClass11_Sub46_7212;
	private Interface27 anInterface27_7213;
	private int anInt7214;
	static int anInt7215;
	static Class79 aClass79_7216 = new Class79(1, 2, 2, 0);
	static int anInt7217;
	static int anInt7218;
	static int anInt7219;
	private int anInt7220;
	private Class12_Sub1 aClass12_Sub1_7221;
	private float[][] aFloatArrayArray7222;
	private int anInt7223;
	private Interface3 anInterface3_7224;

	private final void method2924(int i, short i_0_) {
		do {
			try {
				do {
					if (!jaclib.memory.Stream.method353()) {
						aStream7203.method346(i_0_);
						if (!client.aBool10531)
							break;
					}
					aStream7203.method345(i_0_);
				} while (false);
				anInt7211++;
				if (i == 255)
					break;
				anInt7206 = -35;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "mha.G(" + i + ','
						+ i_0_ + ')');
			}
			break;
		} while (false);
	}

	public static void method2925(int i) {
		try {
			aByteArrayArray7200 = null;
			aClass79_7216 = null;
			if (i == -4)
				anIntArrayArrayArray7210 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mha.C(" + i + ')');
		}
	}

	private final void method2926(int i, int i_1_, int i_2_, int i_3_,
			int i_4_, int i_5_, int i_6_) {
		try {
			anInt7207++;
			long l = -1L;
			int i_7_ = i_3_ + (i_1_ << ((Class12) aClass12_Sub1_7221).anInt97);
			int i_8_ = i - -(i_4_ << ((Class12) aClass12_Sub1_7221).anInt97);
			int i_9_ = aClass12_Sub1_7221.method130(i_8_, i_7_, i_5_ ^ 0x2d);
			if ((i_3_ & 0x7f ^ 0xffffffff) == -1
					|| (0x7f & i ^ 0xffffffff) == -1) {
				l = (0xffffL & (long) i_8_) << 16 | (long) i_7_ & 0xffffL;
				Class11 class11 = aClass213_7199.method1369((byte) 26, l);
				if (class11 != null) {
					method2924(
							255,
							(((Class11_Sub11) (Class11_Sub11) class11).aShort5399));
					return;
				}
			}
			short i_10_ = (short) anInt7220++;
			if ((l ^ 0xffffffffffffffffL) != 0L)
				aClass213_7199.method1368(l, new Class11_Sub11(i_10_),
						(byte) -26);
			float f;
			float f_11_;
			float f_12_;
			if ((i_3_ ^ 0xffffffff) != -1 || i != 0) {
				if (((i_3_ ^ 0xffffffff) == (((Class12) aClass12_Sub1_7221).anInt93 ^ 0xffffffff))
						&& i == 0) {
					f_11_ = aFloatArrayArray7202[i_6_ + 1][i_2_];
					f = aFloatArrayArray7222[1 + i_6_][i_2_];
					f_12_ = aFloatArrayArray7198[i_6_ + 1][i_2_];
				} else if (i_3_ == ((Class12) aClass12_Sub1_7221).anInt93
						&& ((Class12) aClass12_Sub1_7221).anInt93 == i) {
					f_11_ = aFloatArrayArray7202[1 + i_6_][i_2_ + 1];
					f_12_ = aFloatArrayArray7198[i_6_ + 1][1 + i_2_];
					f = aFloatArrayArray7222[i_6_ + 1][1 + i_2_];
				} else if ((i_3_ ^ 0xffffffff) != -1
						|| ((Class12) aClass12_Sub1_7221).anInt93 != i) {
					float f_13_ = ((float) i_3_ / (float) ((Class12) aClass12_Sub1_7221).anInt93);
					float f_14_ = ((float) i / (float) ((Class12) aClass12_Sub1_7221).anInt93);
					float f_15_ = aFloatArrayArray7202[i_6_][i_2_];
					float f_16_ = aFloatArrayArray7222[i_6_][i_2_];
					float f_17_ = aFloatArrayArray7198[i_6_][i_2_];
					float f_18_ = aFloatArrayArray7202[1 + i_6_][i_2_];
					float f_19_ = aFloatArrayArray7222[1 + i_6_][i_2_];
					f_18_ += f_13_
							* (aFloatArrayArray7202[1 + i_6_][1 + i_2_] - f_18_);
					f_15_ += ((aFloatArrayArray7202[i_6_][i_2_ + 1] - f_15_) * f_13_);
					f_16_ += ((-f_16_ + aFloatArrayArray7222[i_6_][i_2_ + 1]) * f_13_);
					f_17_ += f_13_
							* (-f_17_ + aFloatArrayArray7198[i_6_][i_2_ + 1]);
					f_19_ += f_13_
							* (aFloatArrayArray7222[i_6_ + 1][1 + i_2_] - f_19_);
					float f_20_ = aFloatArrayArray7198[i_6_ + 1][i_2_];
					f = f_16_ + (-f_16_ + f_19_) * f_14_;
					f_20_ += (aFloatArrayArray7198[1 + i_6_][1 + i_2_] - f_20_)
							* f_13_;
					f_11_ = f_14_ * (f_18_ - f_15_) + f_15_;
					f_12_ = f_17_ + f_14_ * (f_20_ - f_17_);
				} else {
					f = aFloatArrayArray7222[i_6_][i_2_ + 1];
					f_11_ = aFloatArrayArray7202[i_6_][1 + i_2_];
					f_12_ = aFloatArrayArray7198[i_6_][i_2_ + 1];
				}
			} else {
				f = aFloatArrayArray7222[i_6_][i_2_];
				f_11_ = aFloatArrayArray7202[i_6_][i_2_];
				f_12_ = aFloatArrayArray7198[i_6_][i_2_];
			}
			float f_21_ = (float) (aClass11_Sub46_7212.method3203(false) + -i_7_);
			float f_22_ = (float) (aClass11_Sub46_7212.method3205(-30) + -i_9_);
			float f_23_ = (float) (-i_8_ + aClass11_Sub46_7212.method3204(true));
			float f_24_ = (float) Math.sqrt((double) (f_23_ * f_23_ + (f_21_
					* f_21_ + f_22_ * f_22_)));
			float f_25_ = (float) i_5_ / f_24_;
			f_23_ *= f_25_;
			f_21_ *= f_25_;
			f_22_ *= f_25_;
			float f_26_ = f_24_ / (float) aClass11_Sub46_7212.method3208(-1);
			float f_27_ = -(f_26_ * f_26_) + 1.0F;
			if (f_27_ < 0.0F)
				f_27_ = 0.0F;
			float f_28_ = f_22_ * f + f_21_ * f_11_ + f_12_ * f_23_;
			if (f_28_ < 0.0F)
				f_28_ = 0.0F;
			float f_29_ = 2.0F * (f_28_ * f_27_);
			if (f_29_ > 1.0F)
				f_29_ = 1.0F;
			int i_30_ = aClass11_Sub46_7212.method3209((byte) 105);
			int i_31_ = (int) ((float) (i_30_ >> 16 & 0xff) * f_29_);
			if ((i_31_ ^ 0xffffffff) < -256)
				i_31_ = 255;
			int i_32_ = (int) (f_29_ * (float) ((0xff0f & i_30_) >> 8));
			if (i_32_ > 255)
				i_32_ = 255;
			int i_33_ = (int) (f_29_ * (float) (i_30_ & 0xff));
			if (jaclib.memory.Stream.method353()) {
				aStream7205.method357((float) i_7_);
				aStream7205.method357((float) i_9_);
				aStream7205.method357((float) i_8_);
			} else {
				aStream7205.method349((float) i_7_);
				aStream7205.method349((float) i_9_);
				aStream7205.method349((float) i_8_);
			}
			if (i_33_ > 255)
				i_33_ = 255;
			if (((Class163_Sub2) aClass163_Sub2_7209).anInt7608 != 0) {
				aStream7205.method355(i_31_);
				aStream7205.method355(i_32_);
				aStream7205.method355(i_33_);
			} else {
				aStream7205.method355(i_33_);
				aStream7205.method355(i_32_);
				aStream7205.method355(i_31_);
			}
			aStream7205.method355(255);
			method2924(255, i_10_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mha.D(" + i + ','
					+ i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_
					+ ',' + i_6_ + ')'));
		}
	}

	static final void method2927(boolean bool) {
		try {
			Class205.aClass302_2761.method1861(-14494);
			anInt7219++;
			Class58_Sub2_Sub2.aClass353_9819.method2116(-16505);
			Class2.aClass221_18.method1412(1);
			Class11_Sub4.aClass290_5237.method1788((byte) 26);
			Class11_Sub19.aClass318_5817.method1935(-51);
			Packet.aClass223_8723.method1424(10);
			Class108_Sub23.aClass198_7760.method1285(127);
			Class254.aClass227_3495.method1463(121);
			Class11_Sub50_Sub2.aClass369_9082.method2180(-1);
			Class91_Sub1.aClass171_6937.method1126(2);
			Class108_Sub26.aClass127_7833.method831(32);
			Class47.aClass29_741.method252(-67);
			Class168.aClass280_2160.method1728(-48);
			Class11_Sub12_Sub4.aClass273_9466.method1703(bool);
			Class187.aClass52_2388.method435((byte) -54);
			Class233.aClass379_3181.method2226(true);
			Class179.aClass154_2279.method967(18028);
			Class299.aClass85_4031.method597(0);
			Class369.aClass96_4847.method646(9441);
			Class11_Sub35_Sub1.aClass285_9126.method1759((byte) -19);
			Class183.method1201(-1842);
			Class11_Sub2_Sub16.method3551(65);
			Class11_Sub45_Sub5.method3438(-1);
			Class313.method1908(bool);
			Class236.method1501(2);
			Class11_Sub45_Sub1.aClass22_8487.method190(0);
			Class355.aClass22_4657.method190(0);
			Class163_Sub2_Sub1.aClass22_8565.method190(0);
			Class19_Sub1.aClass22_5758.method190(0);
			Class86.aClass22_1198.method190(0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mha.B(" + bool + ')');
		}
	}

	final void method2928(int i, int i_34_, boolean[][] bools, int i_35_,
			int i_36_) {
		do {
			try {
				anInt7201++;
				if (anInterface27_7213 != null
						&& (anInt7214 ^ 0xffffffff) >= (i_36_ + i_34_ ^ 0xffffffff)
						&& anInt7208 >= -i_36_ + i_34_
						&& (i_35_ + i_36_ ^ 0xffffffff) <= (anInt7223 ^ 0xffffffff)
						&& i_35_ - i_36_ <= anInt7206) {
					for (int i_37_ = anInt7223; (i_37_ ^ 0xffffffff) >= (anInt7206 ^ 0xffffffff); i_37_++) {
						for (int i_38_ = anInt7214; i_38_ <= anInt7208; i_38_++) {
							int i_39_ = -i_34_ + i_38_;
							int i_40_ = i_37_ + -i_35_;
							if (-i_36_ < i_39_
									&& i_39_ < i_36_
									&& (i_40_ ^ 0xffffffff) < (-i_36_ ^ 0xffffffff)
									&& i_40_ < i_36_
									&& bools[i_39_ - -i_36_][i_40_ - -i_36_]) {
								aClass163_Sub2_7209.method3003(-34,
										(byte) (int) (aClass11_Sub46_7212
												.method3211(-18277) * 255.0F));
								aClass163_Sub2_7209.method2996(0, 1,
										anInterface3_7224);
								aClass163_Sub2_7209
										.method3012(
												(((Class163_Sub2) aClass163_Sub2_7209).aClass219_7643),
												16);
								aClass163_Sub2_7209.method3063(anInt7220,
										anInt7204 / 3, Class346.aClass183_4590,
										-17390, 0, anInterface27_7213, 0);
								return;
							}
						}
					}
					if (i <= -53)
						break;
					anInt7215 = -55;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("mha.F(" + i + ','
						+ i_34_ + ',' + (bools != null ? "{...}" : "null")
						+ ',' + i_35_ + ',' + i_36_ + ')'));
			}
			break;
		} while (false);
	}

	static final String method2929(int i, int i_41_, int i_42_) {
		try {
			if (i != -29507)
				method2929(105, -28, -26);
			anInt7218++;
			int i_43_ = -i_42_ + i_41_;
			if (i_43_ < -9)
				return "<col=ff0000>";
			if ((i_43_ ^ 0xffffffff) > 5)
				return "<col=ff3000>";
			if ((i_43_ ^ 0xffffffff) > 2)
				return "<col=ff7000>";
			if ((i_43_ ^ 0xffffffff) > -1)
				return "<col=ffb000>";
			if (i_43_ > 9)
				return "<col=00ff00>";
			if (i_43_ > 6)
				return "<col=40ff00>";
			if ((i_43_ ^ 0xffffffff) < -4)
				return "<col=80ff00>";
			if ((i_43_ ^ 0xffffffff) < -1)
				return "<col=c0ff00>";
			return "<col=ffff00>";
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mha.E(" + i + ','
					+ i_41_ + ',' + i_42_ + ')'));
		}
	}

	Class11_Sub39(Class163_Sub2 class163_sub2, Class12_Sub1 class12_sub1,
			Class11_Sub46 class11_sub46, int[] is) {
		try {
			aClass11_Sub46_7212 = class11_sub46;
			aClass12_Sub1_7221 = class12_sub1;
			aClass163_Sub2_7209 = class163_sub2;
			int i = (aClass11_Sub46_7212.method3208(-1) + -(((Class12) class12_sub1).anInt93 >> 1));
			anInt7214 = (-i + aClass11_Sub46_7212.method3203(false) >> ((Class12) class12_sub1).anInt97);
			anInt7208 = (aClass11_Sub46_7212.method3203(false) + i >> ((Class12) class12_sub1).anInt97);
			anInt7223 = (aClass11_Sub46_7212.method3204(true) - i >> ((Class12) class12_sub1).anInt97);
			anInt7206 = (i + aClass11_Sub46_7212.method3204(true) >> ((Class12) class12_sub1).anInt97);
			int i_44_ = 1 + -anInt7214 + anInt7208;
			int i_45_ = -anInt7223 + anInt7206 + 1;
			aFloatArrayArray7202 = new float[1 + i_44_][i_45_ + 1];
			aFloatArrayArray7198 = new float[1 + i_44_][1 + i_45_];
			aFloatArrayArray7222 = new float[1 + i_44_][1 + i_45_];
			for (int i_46_ = 0; i_45_ >= i_46_; i_46_++) {
				int i_47_ = i_46_ + anInt7223;
				if (i_47_ > 0
						&& ((i_47_ ^ 0xffffffff) > (-1
								+ ((Class12) aClass12_Sub1_7221).anInt98 ^ 0xffffffff))) {
					for (int i_48_ = 0; i_48_ <= i_44_; i_48_++) {
						int i_49_ = anInt7214 + i_48_;
						if (i_49_ > 0
								&& ((i_49_ ^ 0xffffffff) > (((Class12) aClass12_Sub1_7221).anInt103 - 1 ^ 0xffffffff))) {
							int i_50_ = (class12_sub1.method131((byte) 7,
									i_47_, 1 + i_49_) - class12_sub1.method131(
									(byte) -63, i_47_, i_49_ - 1));
							int i_51_ = (class12_sub1.method131((byte) -82,
									i_47_ + 1, i_49_) - class12_sub1.method131(
									(byte) 123, i_47_ - 1, i_49_));
							float f = (float) (1.0 / (Math.sqrt((double) (65536
									+ i_50_ * i_50_ + i_51_ * i_51_))));
							aFloatArrayArray7202[i_48_][i_46_] = (float) i_50_
									* f;
							aFloatArrayArray7222[i_48_][i_46_] = -256.0F * f;
							aFloatArrayArray7198[i_48_][i_46_] = f
									* (float) i_51_;
						}
					}
				}
			}
			int i_52_ = 0;
			for (int i_53_ = anInt7223; anInt7206 >= i_53_; i_53_++) {
				if (i_53_ >= 0
						&& (i_53_ ^ 0xffffffff) > (((Class12) class12_sub1).anInt98 ^ 0xffffffff)) {
					for (int i_54_ = anInt7214; (i_54_ ^ 0xffffffff) >= (anInt7208 ^ 0xffffffff); i_54_++) {
						if (i_54_ >= 0
								&& (((Class12) class12_sub1).anInt103 ^ 0xffffffff) < (i_54_ ^ 0xffffffff)) {
							int i_55_ = is[i_52_];
							int[] is_56_ = (((Class12_Sub1) class12_sub1).anIntArrayArrayArray5131[i_54_][i_53_]);
							if (is_56_ != null && (i_55_ ^ 0xffffffff) != -1) {
								if (i_55_ != 1)
									anInt7204 += 3;
								else {
									int i_57_ = 0;
									while ((is_56_.length ^ 0xffffffff) < (i_57_ ^ 0xffffffff)) {
										if ((is_56_[i_57_++] ^ 0xffffffff) != 0
												&& is_56_[i_57_++] != -1
												&& ((is_56_[i_57_++] ^ 0xffffffff) != 0))
											anInt7204 += 3;
									}
								}
							}
						}
						i_52_++;
					}
				} else
					i_52_ += anInt7208 + -anInt7214;
			}
			if (anInt7204 > 0) {
				aClass213_7199 = new Class213(Class11_Sub2_Sub33.method3808(
						118, anInt7204));
				anInterface27_7213 = aClass163_Sub2_7209.method3016((byte) 64,
						false);
				anInterface27_7213.method17(anInt7204, (byte) 89);
				jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer = aClass163_Sub2_7209
						.method3025(-16455, 16 * anInt7204, false);
				aStream7205 = new jaclib.memory.Stream(nativeheapbuffer);
				for (;;) {
					Buffer buffer = anInterface27_7213.method12(27599, true);
					if (buffer != null) {
						aStream7203 = new jaclib.memory.Stream(buffer);
						int i_58_ = 0;
						i_52_ = 0;
						for (int i_59_ = anInt7223; (anInt7206 ^ 0xffffffff) <= (i_59_ ^ 0xffffffff); i_59_++) {
							if ((i_59_ ^ 0xffffffff) > -1
									|| (((Class12) class12_sub1).anInt98 ^ 0xffffffff) >= (i_59_ ^ 0xffffffff))
								i_52_ += -anInt7214 + anInt7208;
							else {
								int i_60_ = 0;
								for (int i_61_ = anInt7214; i_61_ <= anInt7208; i_61_++) {
									if (i_61_ >= 0
											&& ((((Class12) class12_sub1).anInt103 ^ 0xffffffff) < (i_61_ ^ 0xffffffff))) {
										int i_62_ = is[i_52_];
										int[] is_63_ = (((Class12_Sub1) class12_sub1).anIntArrayArrayArray5131[i_61_][i_59_]);
										if (is_63_ != null && i_62_ != 0) {
											if ((i_62_ ^ 0xffffffff) != -2) {
												if ((i_62_ ^ 0xffffffff) != -4) {
													if (i_62_ == 2) {
														method2926(
																0,
																i_61_,
																i_58_,
																(((Class12) class12_sub1).anInt93),
																i_59_, 1, i_60_);
														method2926(
																(((Class12) class12_sub1).anInt93),
																i_61_,
																i_58_,
																(((Class12) class12_sub1).anInt93),
																i_59_, 1, i_60_);
														method2926(0, i_61_,
																i_58_, 0,
																i_59_, 1, i_60_);
													} else if ((i_62_ ^ 0xffffffff) != -6) {
														if (i_62_ == 4) {
															method2926(
																	(((Class12) class12_sub1).anInt93),
																	i_61_,
																	i_58_, 0,
																	i_59_, 1,
																	i_60_);
															method2926(0,
																	i_61_,
																	i_58_, 0,
																	i_59_, 1,
																	i_60_);
															method2926(
																	(((Class12) class12_sub1).anInt93),
																	i_61_,
																	i_58_,
																	(((Class12) class12_sub1).anInt93),
																	i_59_, 1,
																	i_60_);
														}
													} else {
														method2926(
																(((Class12) class12_sub1).anInt93),
																i_61_,
																i_58_,
																(((Class12) class12_sub1).anInt93),
																i_59_, 1, i_60_);
														method2926(
																(((Class12) class12_sub1).anInt93),
																i_61_, i_58_,
																0, i_59_, 1,
																i_60_);
														method2926(
																0,
																i_61_,
																i_58_,
																(((Class12) class12_sub1).anInt93),
																i_59_, 1, i_60_);
													}
												} else {
													method2926(0, i_61_, i_58_,
															0, i_59_, 1, i_60_);
													method2926(
															0,
															i_61_,
															i_58_,
															(((Class12) class12_sub1).anInt93),
															i_59_, 1, i_60_);
													method2926(
															(((Class12) class12_sub1).anInt93),
															i_61_, i_58_, 0,
															i_59_, 1, i_60_);
												}
											} else {
												int[] is_64_ = (((Class12_Sub1) class12_sub1).anIntArrayArrayArray5135[i_61_][i_59_]);
												int[] is_65_ = (((Class12_Sub1) class12_sub1).anIntArrayArrayArray5134[i_61_][i_59_]);
												int i_66_ = 0;
												while ((is_63_.length ^ 0xffffffff) < (i_66_ ^ 0xffffffff)) {
													if (is_63_[i_66_] == -1
															|| (is_63_[1 + i_66_] == -1)
															|| (is_63_[i_66_ + 2] == -1))
														i_66_ += 3;
													else {
														method2926(
																is_65_[i_66_],
																i_61_, i_58_,
																is_64_[i_66_],
																i_59_, 1, i_60_);
														i_66_++;
														method2926(
																is_65_[i_66_],
																i_61_, i_58_,
																is_64_[i_66_],
																i_59_, 1, i_60_);
														i_66_++;
														method2926(
																is_65_[i_66_],
																i_61_, i_58_,
																is_64_[i_66_],
																i_59_, 1, i_60_);
														i_66_++;
													}
												}
											}
										}
									}
									i_52_++;
									i_60_++;
								}
							}
							i_58_++;
						}
						aStream7203.method347();
						if (anInterface27_7213.method40((byte) 111))
							break;
						aStream7205.method351(0);
						aClass213_7199.method1364((byte) 96);
					}
				}
				aStream7205.method347();
				anInterface3_7224 = aClass163_Sub2_7209
						.method3005(false, 30519);
				anInterface3_7224.method11(nativeheapbuffer, (byte) 83,
						16 * anInt7220, 16);
			} else {
				anInterface3_7224 = null;
				anInterface27_7213 = null;
			}
			aStream7205 = null;
			aStream7203 = null;
			aFloatArrayArray7202 = aFloatArrayArray7222 = aFloatArrayArray7198 = null;
			aClass213_7199 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mha.<init>("
					+ (class163_sub2 != null ? "{...}" : "null") + ','
					+ (class12_sub1 != null ? "{...}" : "null") + ','
					+ (class11_sub46 != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final byte[] method2930(int i, int i_67_, int i_68_, byte[] is) {
		try {
			anInt7217++;
			byte[] is_69_ = new byte[i];
			Class311.method1898(is, i_68_, is_69_, 0, i);
			if (i_67_ != 255)
				return null;
			return is_69_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mha.A(" + i + ','
					+ i_67_ + ',' + i_68_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}
}
