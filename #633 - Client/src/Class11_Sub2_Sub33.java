/* Class11_Sub2_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class11_Sub2_Sub33 extends Class11_Sub2 {
	private int anInt9658 = 81;
	private int anInt9659;
	private int[][] anIntArrayArray9660;
	private int anInt9661;
	static int anInt9662;
	private int anInt9663;
	static int anInt9664;
	private int anInt9665;
	static int anInt9666;
	private int anInt9667 = 1024;
	static float aFloat9668;
	static int anInt9669;
	static int anInt9670;
	static int anInt9671;
	private int anInt9672;
	static float aFloat9673;
	private int anInt9674 = 4;
	static int anInt9675;
	private int anInt9676;
	static int anInt9677;
	static int anInt9678 = 0;
	private int anInt9679;
	private int[] anIntArray9680;
	static int anInt9681;
	private int anInt9682;
	static int anInt9683;
	static int anInt9684;
	private int[][] anIntArrayArray9685;

	final void method2263(int i, Stream stream, int i_0_) {
		do {
			try {
				anInt9670++;
				int i_1_ = i_0_;
				while_163_: do {
					while_162_: do {
						while_161_: do {
							while_160_: do {
								while_159_: do {
									while_158_: do {
										do {
											if ((i_1_ ^ 0xffffffff) != -1) {
												if ((i_1_ ^ 0xffffffff) != -2) {
													if (i_1_ != 2) {
														if (i_1_ != 3) {
															if ((i_1_ ^ 0xffffffff) != -5) {
																if (i_1_ != 5) {
																	if (i_1_ != 6) {
																		if (i_1_ != 7)
																			break while_163_;
																	} else
																		break while_161_;
																	break while_162_;
																}
															} else
																break while_159_;
															break while_160_;
														}
													} else
														break;
													break while_158_;
												}
											} else {
												anInt9674 = (stream
														.readUnsignedByte((byte) 35));
												break while_163_;
											}
											anInt9676 = stream
													.readUnsignedByte((byte) 35);
											break while_163_;
										} while (false);
										anInt9679 = stream
												.readUnsignedShort((byte) -65);
										break while_163_;
									} while (false);
									anInt9659 = stream
											.readUnsignedShort((byte) -65);
									break while_163_;
								} while (false);
								anInt9667 = stream
										.readUnsignedShort((byte) -65);
								break while_163_;
							} while (false);
							anInt9682 = stream.readUnsignedShort((byte) -65);
							break while_163_;
						} while (false);
						anInt9658 = stream.readUnsignedShort((byte) -65);
						break while_163_;
					} while (false);
					anInt9672 = stream.readUnsignedShort((byte) -65);
				} while (false);
				if (i == 3731)
					break;
				aFloat9668 = -0.16622394F;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("ut.B(" + i + ','
								+ (stream != null ? "{...}" : "null") + ','
								+ i_0_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method3805(int i, int i_2_, int i_3_) {
		try {
			if ((Class318.anInt4230 ^ 0xffffffff) != -1) {
				if (i_2_ < 0) {
					for (int i_4_ = 0; i_4_ < 16; i_4_++)
						Class301.anIntArray4058[i_4_] = i_3_;
				} else
					Class301.anIntArray4058[i_2_] = i_3_;
			}
			if (i != 0)
				aFloat9673 = -0.51017433F;
			anInt9671++;
			Class364.aClass11_Sub6_Sub2_4773.method3491(i_2_, (byte) 113, i_3_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ut.J(" + i + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final int method3806(byte i, int i_5_, String string, boolean bool) {
		try {
			anInt9683++;
			if ((i_5_ ^ 0xffffffff) > -3 || (i_5_ ^ 0xffffffff) < -37)
				throw new IllegalArgumentException("Invalid radix:" + i_5_);
			boolean bool_6_ = false;
			boolean bool_7_ = false;
			if (i != -21)
				return 60;
			int i_8_ = 0;
			int i_9_ = string.length();
			for (int i_10_ = 0; i_9_ > i_10_; i_10_++) {
				int i_11_ = string.charAt(i_10_);
				if (i_10_ == 0) {
					if ((i_11_ ^ 0xffffffff) == -46) {
						bool_6_ = true;
						continue;
					}
					if ((i_11_ ^ 0xffffffff) == -44 && bool)
						continue;
				}
				if ((i_11_ ^ 0xffffffff) <= -49 && (i_11_ ^ 0xffffffff) >= -58)
					i_11_ -= 48;
				else if (i_11_ >= 65 && i_11_ <= 90)
					i_11_ -= 55;
				else {
					if (i_11_ < 97 || i_11_ > 122)
						throw new NumberFormatException();
					i_11_ -= 87;
				}
				if ((i_11_ ^ 0xffffffff) <= (i_5_ ^ 0xffffffff))
					throw new NumberFormatException();
				if (bool_6_)
					i_11_ = -i_11_;
				int i_12_ = i_5_ * i_8_ - -i_11_;
				if ((i_12_ / i_5_ ^ 0xffffffff) != (i_8_ ^ 0xffffffff))
					throw new NumberFormatException();
				i_8_ = i_12_;
				bool_7_ = true;
			}
			if (!bool_7_)
				throw new NumberFormatException();
			return i_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ut.C(" + i + ','
					+ i_5_ + ',' + (string != null ? "{...}" : "null") + ','
					+ bool + ')'));
		}
	}

	static final String method3807(int i, byte i_13_,
			IComponentDefinitions class192) {
		try {
			anInt9664++;
			if (!client.method4013(class192).method2348(i_13_ ^ ~0x46, i)
					&& ((IComponentDefinitions) class192).anObjectArray2555 == null)
				return null;
			if (((IComponentDefinitions) class192).aStringArray2520 == null
					|| ((i ^ 0xffffffff) <= (((IComponentDefinitions) class192).aStringArray2520.length ^ 0xffffffff))
					|| ((IComponentDefinitions) class192).aStringArray2520[i] == null
					|| (((IComponentDefinitions) class192).aStringArray2520[i]
							.trim().length() == 0)) {
				if (Class11_Sub2_Sub14.aBool9010)
					return "Hidden-" + i;
				return null;
			}
			if (i_13_ != 113)
				return null;
			return ((IComponentDefinitions) class192).aStringArray2520[i];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ut.E(" + i + ',' + i_13_ + ','
							+ (class192 != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method3808(int i, int i_14_) {
		try {
			i_14_--;
			anInt9677++;
			if (i < 105)
				return 101;
			i_14_ |= i_14_ >>> 1;
			i_14_ |= i_14_ >>> 2;
			i_14_ |= i_14_ >>> 4;
			i_14_ |= i_14_ >>> 8;
			i_14_ |= i_14_ >>> 16;
			return 1 + i_14_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ut.F(" + i + ','
					+ i_14_ + ')');
		}
	}

	private final void method3809(int i) {
		try {
			anInt9666++;
			Random random = new Random((long) anInt9676);
			anInt9661 = anInt9658 / 2;
			anInt9663 = 4096 / anInt9674;
			anInt9665 = 4096 / anInt9676;
			if (i <= -79) {
				int i_15_ = anInt9663 / 2;
				anIntArrayArray9660 = new int[anInt9676][anInt9674];
				anIntArray9680 = new int[anInt9676 + 1];
				anIntArrayArray9685 = new int[anInt9676][1 + anInt9674];
				int i_16_ = anInt9665 / 2;
				anIntArray9680[0] = 0;
				for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > (anInt9676 ^ 0xffffffff); i_17_++) {
					if ((i_17_ ^ 0xffffffff) < -1) {
						int i_18_ = anInt9665;
						int i_19_ = ((Class302.method1863(4096, random,
								(byte) -119) - 2048) * anInt9659 >> 12);
						i_18_ += i_16_ * i_19_ >> 12;
						anIntArray9680[i_17_] = i_18_
								+ anIntArray9680[-1 + i_17_];
					}
					anIntArrayArray9685[i_17_][0] = 0;
					for (int i_20_ = 0; anInt9674 > i_20_; i_20_++) {
						if ((i_20_ ^ 0xffffffff) < -1) {
							int i_21_ = anInt9663;
							int i_22_ = ((Class302.method1863(4096, random,
									(byte) -119) - 2048) * anInt9679 >> 12);
							i_21_ += i_22_ * i_15_ >> 12;
							anIntArrayArray9685[i_17_][i_20_] = (i_21_ + anIntArrayArray9685[i_17_][-1
									+ i_20_]);
						}
						anIntArrayArray9660[i_17_][i_20_] = ((anInt9672 ^ 0xffffffff) >= -1 ? 4096
								: -Class302.method1863(anInt9672, random,
										(byte) -119) + 4096);
					}
					anIntArrayArray9685[i_17_][anInt9674] = 4096;
				}
				anIntArray9680[anInt9676] = 4096;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ut.G(" + i + ')');
		}
	}

	final void method2256(int i) {
		try {
			method3809(-94);
			if (i != 7)
				anIntArrayArray9660 = null;
			anInt9684++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ut.D(" + i + ')');
		}
	}

	static final void method3810(byte i) {
		do {
			try {
				anInt9675++;
				if ((((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub24_5684
						.method3144(false) ^ 0xffffffff) == -3) {
					byte i_23_ = (byte) (-4 + Class283.anInt3835 & 0xff);
					int i_24_ = Class283.anInt3835 % Class300.anInt4051;
					for (int i_25_ = 0; i_25_ < 4; i_25_++) {
						for (int i_26_ = 0; i_26_ < Class108_Sub12.anInt6228; i_26_++)
							Class1_Sub1.aByteArrayArrayArray7130[i_25_][i_24_][i_26_] = i_23_;
					}
					if (Class376_Sub7_Sub2.anInt9242 != 3) {
						for (int i_27_ = 0; (i_27_ ^ 0xffffffff) > -3; i_27_++) {
							Class234.anIntArray3208[i_27_] = -1000000;
							Class151.anIntArray2008[i_27_] = 1000000;
							Class11_Sub20_Sub2.anIntArray9503[i_27_] = 0;
							Class360.anIntArray4696[i_27_] = 1000000;
							Class221.anIntArray3040[i_27_] = 0;
						}
						int i_28_ = (((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7045);
						if (i == 116) {
							int i_29_ = (((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7031);
							if ((Class191.anInt2453 ^ 0xffffffff) != -2
									&& (Canvas_Sub1.anInt9233 ^ 0xffffffff) == 0) {
								int i_30_ = Class318.method1931(101,
										Class303.anInt4088,
										(Class376_Sub7_Sub2.anInt9242),
										(Class11_Sub45_Sub11.anInt9157));
								if (i_30_ + -Class218.anInt3007 < 3200
										&& (0x4 & (Class11_Sub45_Sub17.aByteArrayArrayArray9509[Class376_Sub7_Sub2.anInt9242][(Class11_Sub45_Sub11.anInt9157 >> 9)][Class303.anInt4088 >> 9]) ^ 0xffffffff) != -1)
									Class307.method1882(
											Class181.aClass364ArrayArrayArray2336,
											Class303.anInt4088 >> 9,
											Class11_Sub45_Sub11.anInt9157 >> 9,
											false, 1, 6721);
							} else {
								if (Class191.anInt2453 != 1) {
									i_28_ = Canvas_Sub1.anInt9233;
									i_29_ = Class170.anInt2186;
								}
								if ((0x4 & (Class11_Sub45_Sub17.aByteArrayArrayArray9509[Class376_Sub7_Sub2.anInt9242][i_28_ >> 9][i_29_ >> 9])) != 0)
									Class307.method1882(
											Class181.aClass364ArrayArrayArray2336,
											i_29_ >> 9, i_28_ >> 9, false, 0,
											i + 6605);
								if ((Class266.anInt3616 ^ 0xffffffff) <= -2561)
									break;
								int i_31_ = Class11_Sub45_Sub11.anInt9157 >> 9;
								int i_32_ = Class303.anInt4088 >> 9;
								int i_33_ = i_28_ >> 9;
								int i_34_ = i_29_ >> 9;
								int i_35_;
								if ((i_33_ ^ 0xffffffff) >= (i_31_ ^ 0xffffffff))
									i_35_ = -i_33_ + i_31_;
								else
									i_35_ = -i_31_ + i_33_;
								int i_36_;
								if ((i_32_ ^ 0xffffffff) > (i_34_ ^ 0xffffffff))
									i_36_ = i_34_ - i_32_;
								else
									i_36_ = -i_34_ + i_32_;
								if (i_35_ == 0 && i_36_ == 0
										|| -Class300.anInt4051 >= i_35_
										|| i_35_ >= Class300.anInt4051
										|| -Class108_Sub12.anInt6228 >= i_36_
										|| Class108_Sub12.anInt6228 <= i_36_)
									Class11_Sub12_Sub3
											.method3602(
													(byte) -104,
													("RC: "
															+ i_31_
															+ ","
															+ i_32_
															+ " "
															+ i_33_
															+ ","
															+ i_34_
															+ " "
															+ Class194.anInt2641
															+ "," + Class118.anInt1605),
													null);
								else if ((i_35_ ^ 0xffffffff) < (i_36_ ^ 0xffffffff)) {
									int i_37_ = i_36_ * 65536 / i_35_;
									int i_38_ = 32768;
									while (i_33_ != i_31_) {
										if ((i_31_ ^ 0xffffffff) <= (i_33_ ^ 0xffffffff)) {
											if ((i_31_ ^ 0xffffffff) < (i_33_ ^ 0xffffffff))
												i_31_--;
										} else
											i_31_++;
										if (((Class11_Sub45_Sub17.aByteArrayArrayArray9509[Class376_Sub7_Sub2.anInt9242][i_31_][i_32_]) & 0x4) != 0) {
											Class307.method1882(
													(Class181.aClass364ArrayArrayArray2336),
													i_32_, i_31_, false, 1,
													i + 6605);
											break;
										}
										i_38_ += i_37_;
										if ((i_38_ ^ 0xffffffff) <= -65537) {
											if (i_32_ >= i_34_) {
												if ((i_32_ ^ 0xffffffff) < (i_34_ ^ 0xffffffff))
													i_32_--;
											} else
												i_32_++;
											i_38_ -= 65536;
											if (((0x4 & (Class11_Sub45_Sub17.aByteArrayArrayArray9509[(Class376_Sub7_Sub2.anInt9242)][i_31_][i_32_])) ^ 0xffffffff) != -1) {
												Class307.method1882(
														(Class181.aClass364ArrayArrayArray2336),
														i_32_, i_31_, false, 1,
														i + 6605);
												break;
											}
										}
									}
								} else {
									int i_39_ = 65536 * i_35_ / i_36_;
									int i_40_ = 32768;
									while (i_32_ != i_34_) {
										if (i_32_ >= i_34_) {
											if ((i_34_ ^ 0xffffffff) > (i_32_ ^ 0xffffffff))
												i_32_--;
										} else
											i_32_++;
										if (((Class11_Sub45_Sub17.aByteArrayArrayArray9509[Class376_Sub7_Sub2.anInt9242][i_31_][i_32_]) & 0x4) != 0) {
											Class307.method1882(
													(Class181.aClass364ArrayArrayArray2336),
													i_32_, i_31_, false, 1,
													i ^ 0x1a35);
											break;
										}
										i_40_ += i_39_;
										if (i_40_ >= 65536) {
											i_40_ -= 65536;
											if (i_31_ < i_33_)
												i_31_++;
											else if ((i_31_ ^ 0xffffffff) < (i_33_ ^ 0xffffffff))
												i_31_--;
											if (((Class11_Sub45_Sub17.aByteArrayArrayArray9509[(Class376_Sub7_Sub2.anInt9242)][i_31_][i_32_]) & 0x4 ^ 0xffffffff) != -1) {
												Class307.method1882(
														(Class181.aClass364ArrayArrayArray2336),
														i_32_, i_31_, false, 1,
														6721);
												break;
											}
										}
									}
								}
							}
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ut.H(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method3811(int i, int i_41_) {
		try {
			anInt9681++;
			int i_42_ = -102 / ((i - 2) / 46);
			Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
					-652872096, 2, i_41_);
			class11_sub45_sub15.method3660(0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ut.K(" + i + ','
					+ i_41_ + ')');
		}
	}

	public Class11_Sub2_Sub33() {
		super(0, true);
		anInt9672 = 1024;
		anInt9682 = 0;
		anInt9679 = 409;
		anInt9676 = 8;
		anInt9659 = 204;
	}

	final int[] method2254(int i, boolean bool) {
		try {
			anInt9662++;
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (bool != true)
				return null;
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
				int i_43_ = 0;
				int i_44_;
				for (i_44_ = anInt9682 + Class171.anIntArray2199[i]; (i_44_ ^ 0xffffffff) > -1; i_44_ += 4096) {
					/* empty */
				}
				for (/**/; (i_44_ ^ 0xffffffff) < -4097; i_44_ -= 4096) {
					/* empty */
				}
				for (/**/; anInt9676 > i_43_; i_43_++) {
					if (i_44_ < anIntArray9680[i_43_])
						break;
				}
				int i_45_ = -1 + i_43_;
				boolean bool_46_ = (i_43_ & 0x1) == 0;
				int i_47_ = anIntArray9680[i_43_];
				int i_48_ = anIntArray9680[-1 + i_43_];
				if (i_44_ > i_48_ + anInt9661 && i_44_ < -anInt9661 + i_47_) {
					for (int i_49_ = 0; ((i_49_ ^ 0xffffffff) > (Class33_Sub2.anInt6696 ^ 0xffffffff)); i_49_++) {
						int i_50_ = 0;
						int i_51_ = bool_46_ ? anInt9667 : -anInt9667;
						int i_52_;
						for (i_52_ = ((i_51_ * anInt9663 >> 12) + Class208.anIntArray2808[i_49_]); i_52_ < 0; i_52_ += 4096) {
							/* empty */
						}
						for (/**/; (i_52_ ^ 0xffffffff) < -4097; i_52_ -= 4096) {
							/* empty */
						}
						for (/**/; i_50_ < anInt9674; i_50_++) {
							if ((anIntArrayArray9685[i_45_][i_50_] ^ 0xffffffff) < (i_52_ ^ 0xffffffff))
								break;
						}
						int i_53_ = -1 + i_50_;
						int i_54_ = anIntArrayArray9685[i_45_][i_53_];
						int i_55_ = anIntArrayArray9685[i_45_][i_50_];
						if (anInt9661 + i_54_ >= i_52_
								|| ((-anInt9661 + i_55_ ^ 0xffffffff) >= (i_52_ ^ 0xffffffff)))
							is[i_49_] = 0;
						else
							is[i_49_] = anIntArrayArray9660[i_45_][i_53_];
					}
				} else
					Class311.method1899(is, 0, Class33_Sub2.anInt6696, 0);
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ut.A(" + i + ','
					+ bool + ')');
		}
	}
}
