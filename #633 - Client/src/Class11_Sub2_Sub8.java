/* Class11_Sub2_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class11_Sub2_Sub8 extends Class11_Sub2 {
	static int anInt8737;
	private int anInt8738;
	static int anInt8739;
	static int anInt8740;
	private int anInt8741 = 1024;
	private int anInt8742;
	private int anInt8743;
	private int anInt8744;
	private int anInt8745;
	static int anInt8746;
	static IncomingPacket aClass160_8747 = new IncomingPacket(82, 6);
	static int anInt8748;
	private int anInt8749;
	private int anInt8750;
	static int anInt8751;
	static Player myPlayer;
	private int anInt8753;
	private int anInt8754;
	static int anInt8755;

	static final void method3430(int i, int i_0_) {
		try {
			Class226.aBool3113 = false;
			Class78.anInt1060 = i;
			Class234_Sub2.anInt5986 = -1;
			Class108_Sub16.anInt6539 = -1;
			Class334.aClass11_Sub6_Sub2_4425 = null;
			anInt8748++;
			Class376_Sub7_Sub3.anInt9278 = 0;
			Class318.anInt4230 = i_0_;
			Class29.aClass146_397 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bca.C(" + i + ','
					+ i_0_ + ')');
		}
	}

	public static void method3431(int i) {
		try {
			aClass160_8747 = null;
			if (i != 0)
				method3430(-71, 122);
			myPlayer = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bca.G(" + i + ')');
		}
	}

	private final void method3432(int i, int[][] is, byte i_1_, int i_2_,
			int i_3_, int i_4_, Random random) {
		try {
			anInt8755++;
			int i_5_ = ((anInt8745 ^ 0xffffffff) >= -1 ? 4096 : 4096 - Class302
					.method1863(anInt8745, random, (byte) -119));
			int i_6_ = 76 % ((i_1_ - 6) / 52);
			int i_7_ = anInt8744 * anInt8741 >> 12;
			int i_8_ = (anInt8744 - (i_7_ > 0 ? Class302.method1863(i_7_,
					random, (byte) -119) : 0));
			if (i_4_ >= Class33_Sub2.anInt6696)
				i_4_ -= Class33_Sub2.anInt6696;
			if (i_8_ <= 0) {
				if (i_4_ + i > Class33_Sub2.anInt6696) {
					int i_9_ = Class33_Sub2.anInt6696 - i_4_;
					for (int i_10_ = 0; i_10_ < i_3_; i_10_++) {
						int[] is_11_ = is[i_10_ + i_2_];
						Class311.method1899(is_11_, i_4_, i_9_, i_5_);
						Class311.method1899(is_11_, 0, -i_9_ + i, i_5_);
					}
				} else {
					for (int i_12_ = 0; i_12_ < i_3_; i_12_++)
						Class311.method1899(is[i_12_ + i_2_], i_4_, i, i_5_);
				}
			} else if ((i_3_ ^ 0xffffffff) < -1 && i > 0) {
				int i_13_ = i / 2;
				int i_14_ = i_3_ / 2;
				int i_15_ = ((i_8_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff) ? i_13_
						: i_8_);
				int i_16_ = i_8_ <= i_14_ ? i_8_ : i_14_;
				int i_17_ = i_4_ - -i_15_;
				int i_18_ = i - i_15_ * 2;
				for (int i_19_ = 0; i_3_ > i_19_; i_19_++) {
					int[] is_20_ = is[i_19_ - -i_2_];
					if ((i_19_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff)) {
						int i_21_ = i_5_ * i_19_ / i_16_;
						if (anInt8743 == 0) {
							for (int i_22_ = 0; (i_15_ ^ 0xffffffff) < (i_22_ ^ 0xffffffff); i_22_++) {
								int i_23_ = i_22_ * i_5_ / i_15_;
								is_20_[Class77.method529(Class297.anInt4024,
										i_22_ + i_4_)] = is_20_[Class77
										.method529((Class297.anInt4024), -1
												+ (i + i_4_ - i_22_))] = i_23_
										* i_21_ >> 12;
							}
						} else {
							for (int i_24_ = 0; i_15_ > i_24_; i_24_++) {
								int i_25_ = i_24_ * i_5_ / i_15_;
								is_20_[Class77.method529(i_24_ + i_4_,
										Class297.anInt4024)] = is_20_[Class77
										.method529((Class297.anInt4024),
												(-i_24_ + i + i_4_ - 1))] = ((i_25_ ^ 0xffffffff) <= (i_21_ ^ 0xffffffff) ? i_21_
										: i_25_);
							}
						}
						if (Class33_Sub2.anInt6696 >= i_18_ + i_17_)
							Class311.method1899(is_20_, i_17_, i_18_, i_21_);
						else {
							int i_26_ = Class33_Sub2.anInt6696 + -i_17_;
							Class311.method1899(is_20_, i_17_, i_26_, i_21_);
							Class311.method1899(is_20_, 0, -i_26_ + i_18_,
									i_21_);
						}
					} else {
						int i_27_ = -1 + i_3_ - i_19_;
						if ((i_27_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff)) {
							int i_28_ = i_5_ * i_27_ / i_16_;
							if (anInt8743 == 0) {
								for (int i_29_ = 0; ((i_15_ ^ 0xffffffff) < (i_29_ ^ 0xffffffff)); i_29_++) {
									int i_30_ = i_29_ * i_5_ / i_15_;
									is_20_[Class77.method529(
											(Class297.anInt4024), i_29_ + i_4_)] = is_20_[Class77
											.method529(
													(-i_29_ + i_4_ + (i - 1)),
													(Class297.anInt4024))] = i_28_
											* i_30_ >> 12;
								}
							} else {
								for (int i_31_ = 0; ((i_15_ ^ 0xffffffff) < (i_31_ ^ 0xffffffff)); i_31_++) {
									int i_32_ = i_31_ * i_5_ / i_15_;
									is_20_[Class77.method529(
											(Class297.anInt4024), i_4_ + i_31_)] = is_20_[(Class77
											.method529(Class297.anInt4024,
													-i_31_ + i + (i_4_ - 1)))] = i_32_ >= i_28_ ? i_28_
											: i_32_;
								}
							}
							if (Class33_Sub2.anInt6696 >= i_18_ + i_17_)
								Class311.method1899(is_20_, i_17_, i_18_, i_28_);
							else {
								int i_33_ = -i_17_ + Class33_Sub2.anInt6696;
								Class311.method1899(is_20_, i_17_, i_33_, i_28_);
								Class311.method1899(is_20_, 0, i_18_ - i_33_,
										i_28_);
							}
						} else {
							for (int i_34_ = 0; (i_15_ ^ 0xffffffff) < (i_34_ ^ 0xffffffff); i_34_++)
								is_20_[Class77.method529(i_4_ + i_34_,
										Class297.anInt4024)] = is_20_[Class77
										.method529(-i_34_ + (i + i_4_ - 1),
												(Class297.anInt4024))] = i_5_
										* i_34_ / i_15_;
							if ((i_17_ + i_18_ ^ 0xffffffff) < (Class33_Sub2.anInt6696 ^ 0xffffffff)) {
								int i_35_ = -i_17_ + Class33_Sub2.anInt6696;
								Class311.method1899(is_20_, i_17_, i_35_, i_5_);
								Class311.method1899(is_20_, 0, -i_35_ + i_18_,
										i_5_);
							} else
								Class311.method1899(is_20_, i_17_, i_18_, i_5_);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bca.F(" + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_
					+ ',' + i_3_ + ',' + i_4_ + ','
					+ (random != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3433(Class292 class292, String string,
			boolean bool, int i, Class107 class107, Class163 class163) {
		try {
			anInt8739++;
			boolean bool_36_ = !Class91_Sub1.aBool6935
					|| Class108.method722(402);
			if (bool_36_) {
				if (Class91_Sub1.aBool6935 && bool_36_) {
					class292 = Class327.aClass292_4362;
					class107 = class163.method1060(class292,
							(Class11_Sub2_Sub18.aClass80Array9055), true);
					int i_37_ = class292.method1811(174, 250, string, null);
					int i_38_ = class292.method1809(0, string, 250,
							((Class292) class292).anInt3947, null);
					int i_39_ = ((Class80) Class233.aClass80_3189).anInt1075;
					int i_40_ = 4 + i_39_;
					i_37_ += 2 * i_40_;
					i_38_ += i_40_ * 2;
					if ((Class219_Sub1.anInt7240 ^ 0xffffffff) < (i_38_ ^ 0xffffffff))
						i_38_ = Class219_Sub1.anInt7240;
					if ((i_37_ ^ 0xffffffff) > (OutputStream_Sub1.anInt5846 ^ 0xffffffff))
						i_37_ = OutputStream_Sub1.anInt5846;
					int i_41_ = (Class70.aClass118_986.method772(
							Class233.anInt3186, i_37_, -115) + Class376_Sub7_Sub1_Sub1.anInt10095);
					int i_42_ = (Class91_Sub2.aClass150_7699.method948(i_38_,
							0, Class279.anInt3772) + Class199.anInt2688);
					if (Class11_Sub2_Sub19.aBool9087) {
						i_41_ += Class54.method443(5467);
						i_42_ += Class376_Sub7_Sub4_Sub1
								.method3887((byte) -119);
					}
					class163.method1081(Class108_Sub16.aClass80_6542, false)
							.method1625(
									((Class80) Class135.aClass80_1867).anInt1075
											+ i_41_,
									i_42_
											- -((Class80) Class135.aClass80_1867).anInt1082,
									(-(((Class80) Class135.aClass80_1867).anInt1075 * 2) + i_37_),
									(i_38_ - 2 * ((Class80) Class135.aClass80_1867).anInt1082),
									1, 0, 0);
					class163.method1081(Class135.aClass80_1867, true)
							.method1610(i_41_, i_42_);
					Class135.aClass80_1867.method547();
					class163.method1081(Class135.aClass80_1867, true)
							.method1610(i_37_ + (i_41_ - i_39_), i_42_);
					Class135.aClass80_1867.method548();
					class163.method1081(Class135.aClass80_1867, true)
							.method1610(-i_39_ + i_41_ + i_37_,
									-i_39_ + (i_42_ - -i_38_));
					Class135.aClass80_1867.method547();
					class163.method1081(Class135.aClass80_1867, true)
							.method1610(i_41_, i_42_ - (-i_38_ + i_39_));
					Class135.aClass80_1867.method548();
					class163.method1081(Class233.aClass80_3189, true)
							.method1618(
									i_41_,
									i_42_
											+ ((Class80) Class135.aClass80_1867).anInt1082,
									i_39_,
									(-(((Class80) Class135.aClass80_1867).anInt1082 * 2) + i_38_));
					Class233.aClass80_3189.method546();
					class163.method1081(Class233.aClass80_3189, true)
							.method1618(
									i_41_
											- -((Class80) Class135.aClass80_1867).anInt1075,
									i_42_,
									(i_37_ - ((Class80) Class135.aClass80_1867).anInt1075 * 2),
									i_39_);
					Class233.aClass80_3189.method546();
					class163.method1081(Class233.aClass80_3189, true)
							.method1618(
									i_37_ + i_41_ + -i_39_,
									i_42_
											- -((Class80) Class135.aClass80_1867).anInt1082,
									i_39_,
									(-(2 * ((Class80) Class135.aClass80_1867).anInt1082) + i_38_));
					Class233.aClass80_3189.method546();
					class163.method1081(Class233.aClass80_3189, true)
							.method1618(
									((Class80) Class135.aClass80_1867).anInt1075
											+ i_41_,
									-i_39_ + i_38_ + i_42_,
									(-(2 * ((Class80) Class135.aClass80_1867).anInt1075) + i_37_),
									i_39_);
					Class233.aClass80_3189.method546();
					class107.method720(i_40_ + i_42_, 0, i_37_ + -(i_40_ * 2),
							null, 0, Class11_Sub6_Sub5.anInt9606 | ~0xffffff,
							null, 1, -1, i_38_ + -(2 * i_40_), 1, 0, i_41_
									- -i_40_, null, string, (byte) 100);
					Class304.method1869(i_37_, i_38_, -17012, i_42_, i_41_);
				} else {
					int i_43_ = class292.method1811(174, 250, string, null);
					int i_44_ = (class292.method1813((byte) 114, string, null,
							250) * 13);
					int i_45_ = 4;
					int i_46_ = i_45_ + 6;
					int i_47_ = 6 - -i_45_;
					class163.aa(-i_45_ + i_46_, i_47_ + -i_45_, i_45_
							+ (i_45_ + i_43_), i_44_ + i_45_ + i_45_,
							-16777216, 0);
					class163.method1051(-i_45_ + i_46_, -i_45_ + i_47_, i_45_
							+ i_43_ - -i_45_, i_45_ + i_44_ + i_45_, -1, 0);
					class107.method720(i_47_, 0, i_43_, null, 0, -1, null, 1,
							-1, i_44_, 1, 0, i_46_, null, string, (byte) 100);
					Class304.method1869(i_45_ + i_45_ + i_43_, i_45_
							+ (i_44_ + i_45_), -17012, i_47_ - i_45_, i_46_
							+ -i_45_);
				}
				int i_48_ = 127 / ((59 - i) / 45);
				if (bool) {
					try {
						if (Class11_Sub2_Sub19.aBool9087)
							Class204.method1295((byte) 95);
						else
							class163.method1056(0);
					} catch (Exception_Sub1 exception_sub1) {
						/* empty */
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bca.E("
					+ (class292 != null ? "{...}" : "null") + ','
					+ (string != null ? "{...}" : "null") + ',' + bool + ','
					+ i + ',' + (class107 != null ? "{...}" : "null") + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2256(int i) {
		try {
			if (i != 7)
				method3430(91, 11);
			anInt8737++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bca.D(" + i + ')');
		}
	}

	public Class11_Sub2_Sub8() {
		super(0, true);
		anInt8738 = 409;
		anInt8745 = 1024;
		anInt8743 = 0;
		anInt8749 = 1024;
		anInt8750 = 1024;
		anInt8742 = 0;
		anInt8754 = 2048;
		anInt8753 = 819;
	}

	final void method2263(int i, Stream stream, int i_49_) {
		try {
			if (i == 3731) {
				int i_50_ = i_49_;
				while_112_: do {
					while_111_: do {
						while_110_: do {
							while_109_: do {
								while_108_: do {
									while_107_: do {
										while_106_: do {
											do {
												if ((i_50_ ^ 0xffffffff) != -1) {
													if (i_50_ != 1) {
														if ((i_50_ ^ 0xffffffff) != -3) {
															if ((i_50_ ^ 0xffffffff) != -4) {
																if ((i_50_ ^ 0xffffffff) != -5) {
																	if (i_50_ != 5) {
																		if (i_50_ != 6) {
																			if (i_50_ != 7) {
																				if (i_50_ == 8)
																					break while_111_;
																				break while_112_;
																			}
																		} else
																			break while_109_;
																		break while_110_;
																	}
																} else
																	break while_107_;
																break while_108_;
															}
														} else
															break;
														break while_106_;
													}
												} else {
													anInt8742 = (stream
															.readUnsignedByte((byte) 35));
													break while_112_;
												}
												anInt8750 = (stream
														.readUnsignedShort((byte) -65));
												break while_112_;
											} while (false);
											anInt8754 = stream
													.readUnsignedShort((byte) -65);
											break while_112_;
										} while (false);
										anInt8738 = stream
												.readUnsignedShort((byte) -65);
										break while_112_;
									} while (false);
									anInt8753 = stream
											.readUnsignedShort((byte) -65);
									break while_112_;
								} while (false);
								anInt8749 = stream
										.readUnsignedShort((byte) -65);
								break while_112_;
							} while (false);
							anInt8743 = stream.readUnsignedByte((byte) 35);
							break while_112_;
						} while (false);
						anInt8741 = stream.readUnsignedShort((byte) -65);
						break while_112_;
					} while (false);
					anInt8745 = stream.readUnsignedShort((byte) -65);
				} while (false);
				anInt8740++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bca.B(" + i + ','
					+ (stream != null ? "{...}" : "null") + ',' + i_49_ + ')'));
		}
	}

	final int[] method2254(int i, boolean bool) {
		try {
			anInt8746++;
			if (bool != true)
				method3430(109, 119);
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
				int[][] is_51_ = ((Class11_Sub2) this).aClass105_5043
						.method692(true);
				int i_52_ = 0;
				int i_53_ = 0;
				int i_54_ = 0;
				int i_55_ = 0;
				int i_56_ = 0;
				boolean bool_57_ = true;
				boolean bool_58_ = true;
				int i_59_ = 0;
				int i_60_ = 0;
				int i_61_ = anInt8750 * Class33_Sub2.anInt6696 >> 12;
				int i_62_ = anInt8754 * Class33_Sub2.anInt6696 >> 12;
				int i_63_ = Class29.anInt398 * anInt8738 >> 12;
				int i_64_ = anInt8753 * Class29.anInt398 >> 12;
				if (i_64_ <= 1)
					return is_51_[i];
				anInt8744 = anInt8749 * (Class33_Sub2.anInt6696 / 8) >> 12;
				int i_65_ = 1 - -(Class33_Sub2.anInt6696 / i_61_);
				int[][] is_66_ = new int[i_65_][3];
				int[][] is_67_ = new int[i_65_][3];
				Random random = new Random((long) anInt8742);
				for (;;) {
					int i_68_ = (Class302.method1863(i_62_ + -i_61_, random,
							(byte) -119) + i_61_);
					int i_69_ = (Class302.method1863(i_64_ + -i_63_, random,
							(byte) -119) + i_63_);
					int i_70_ = i_55_ + i_68_;
					if ((Class33_Sub2.anInt6696 ^ 0xffffffff) > (i_70_ ^ 0xffffffff)) {
						i_70_ = Class33_Sub2.anInt6696;
						i_68_ = Class33_Sub2.anInt6696 - i_55_;
					}
					int i_71_;
					if (bool_58_)
						i_71_ = 0;
					else {
						int i_72_ = i_56_;
						int[] is_73_ = is_67_[i_56_];
						int i_74_ = 0;
						int i_75_ = i_70_ + i_52_;
						if (i_75_ < 0)
							i_75_ += Class33_Sub2.anInt6696;
						if (Class33_Sub2.anInt6696 < i_75_)
							i_75_ -= Class33_Sub2.anInt6696;
						for (;;) {
							int[] is_76_ = is_67_[i_72_];
							if ((is_76_[0] ^ 0xffffffff) >= (i_75_ ^ 0xffffffff)
									&& (is_76_[1] ^ 0xffffffff) <= (i_75_ ^ 0xffffffff))
								break;
							i_74_++;
							if (i_59_ <= ++i_72_)
								i_72_ = 0;
						}
						i_71_ = is_73_[2];
						if ((i_56_ ^ 0xffffffff) != (i_72_ ^ 0xffffffff)) {
							int i_77_ = i_55_ - -i_52_;
							if (i_77_ < 0)
								i_77_ += Class33_Sub2.anInt6696;
							if ((Class33_Sub2.anInt6696 ^ 0xffffffff) > (i_77_ ^ 0xffffffff))
								i_77_ -= Class33_Sub2.anInt6696;
							for (int i_78_ = 1; i_78_ <= i_74_; i_78_++) {
								int[] is_79_ = is_67_[(i_78_ + i_56_) % i_59_];
								i_71_ = Math.max(i_71_, is_79_[2]);
							}
							for (int i_80_ = 0; (i_80_ ^ 0xffffffff) >= (i_74_ ^ 0xffffffff); i_80_++) {
								int[] is_81_ = is_67_[(i_56_ + i_80_) % i_59_];
								int i_82_ = is_81_[2];
								if (i_71_ != i_82_) {
									int i_83_ = is_81_[0];
									int i_84_ = is_81_[1];
									int i_85_;
									int i_86_;
									if ((i_77_ ^ 0xffffffff) <= (i_75_ ^ 0xffffffff)) {
										if (i_83_ != 0) {
											i_85_ = Math.max(i_77_, i_83_);
											i_86_ = Class33_Sub2.anInt6696;
										} else {
											i_86_ = Math.min(i_75_, i_84_);
											i_85_ = 0;
										}
									} else {
										i_85_ = Math.max(i_77_, i_83_);
										i_86_ = Math.min(i_75_, i_84_);
									}
									method3432(i_86_ - i_85_, is_51_,
											(byte) -75, i_82_, i_71_ - i_82_,
											i_85_ - -i_54_, random);
								}
							}
						}
						i_56_ = i_72_;
					}
					if (i_69_ + i_71_ > Class29.anInt398)
						i_69_ = -i_71_ + Class29.anInt398;
					else
						bool_57_ = false;
					if ((i_70_ ^ 0xffffffff) != (Class33_Sub2.anInt6696 ^ 0xffffffff)) {
						int[] is_87_ = is_66_[i_60_++];
						is_87_[0] = i_55_;
						is_87_[2] = i_71_ - -i_69_;
						is_87_[1] = i_70_;
						method3432(i_68_, is_51_, (byte) 71, i_71_, i_69_,
								i_55_ + i_53_, random);
						i_55_ = i_70_;
					} else {
						method3432(i_68_, is_51_, (byte) 99, i_71_, i_69_,
								i_53_ + i_55_, random);
						if (bool_57_)
							break;
						bool_57_ = true;
						int[] is_88_ = is_66_[i_60_++];
						is_88_[0] = i_55_;
						is_88_[2] = i_71_ - -i_69_;
						is_88_[1] = i_70_;
						int[][] is_89_ = is_67_;
						is_67_ = is_66_;
						i_59_ = i_60_;
						is_66_ = is_89_;
						i_54_ = i_53_;
						i_60_ = 0;
						i_53_ = Class302.method1863(Class33_Sub2.anInt6696,
								random, (byte) -119);
						i_52_ = i_53_ + -i_54_;
						i_55_ = 0;
						int i_90_ = i_52_;
						if ((i_90_ ^ 0xffffffff) > -1)
							i_90_ += Class33_Sub2.anInt6696;
						if (i_90_ > Class33_Sub2.anInt6696)
							i_90_ -= Class33_Sub2.anInt6696;
						i_56_ = 0;
						bool_58_ = false;
						for (;;) {
							int[] is_91_ = is_67_[i_56_];
							if (i_90_ >= is_91_[0] && is_91_[1] >= i_90_)
								break;
							if (++i_56_ >= i_59_)
								i_56_ = 0;
						}
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bca.A(" + i + ','
					+ bool + ')');
		}
	}
}
