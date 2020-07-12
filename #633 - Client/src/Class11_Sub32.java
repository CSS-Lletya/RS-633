/* Class11_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub32 extends Class11 {
	static Class40 aClass40_6869;
	static int anInt6870;
	private int anInt6871;
	static int anInt6872;
	static int anInt6873;
	private int anInt6874;
	int anInt6875;
	static int anInt6876;
	static int anInt6877;
	static String[] aStringArray6878 = { "en", "de", "fr", "pt", "nl" };
	private int anInt6879;
	static int anInt6880;
	static int anInt6881;
	static int anInt6882;
	int anInt6883;
	static int anInt6884;
	int anInt6885;
	static int anInt6886;
	private int anInt6887;
	int anInt6888;
	private int anInt6889;
	static int[] anIntArray6890;
	static int[][] anIntArrayArray6891;
	static int anInt6892;
	static int anInt6893;

	final boolean method2787(int i, int i_0_, byte i_1_) {
		try {
			anInt6876++;
			if (i_1_ <= 4)
				method2791((byte) -82);
			if (((Class11_Sub32) this).anInt6875 <= i_0_
					&& ((Class11_Sub32) this).anInt6885 >= i_0_
					&& i >= ((Class11_Sub32) this).anInt6888
					&& ((Class11_Sub32) this).anInt6883 >= i)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("oga.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final Class376_Sub7_Sub1 method2788(int i, int i_2_, int i_3_) {
		Class364 class364 = Class181.aClass364ArrayArrayArray2336[i][i_2_][i_3_];
		if (class364 == null)
			return null;
		Class376_Sub7_Sub1 class376_sub7_sub1 = ((Class364) class364).aClass376_Sub7_Sub1_4782;
		((Class364) class364).aClass376_Sub7_Sub1_4782 = null;
		Class351.method2105(class376_sub7_sub1);
		return class376_sub7_sub1;
	}

	final boolean method2789(int i, int i_4_, int i_5_) {
		try {
			anInt6893++;
			if (i_5_ < 52)
				method2787(-122, -61, (byte) 119);
			if (i >= anInt6889 && anInt6887 >= i
					&& (anInt6871 ^ 0xffffffff) >= (i_4_ ^ 0xffffffff)
					&& i_4_ <= anInt6874)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("oga.E(" + i + ','
					+ i_4_ + ',' + i_5_ + ')'));
		}
	}

	final void method2790(int i, int i_6_, int[] is, int i_7_) {
		try {
			is[0] = 0;
			anInt6881++;
			if (i_7_ == -9528) {
				is[1] = i_6_ - (-((Class11_Sub32) this).anInt6875 + anInt6889);
				is[2] = i + (-anInt6871 + ((Class11_Sub32) this).anInt6888);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("oga.F(" + i + ',' + i_6_
							+ ',' + (is != null ? "{...}" : "null") + ','
							+ i_7_ + ')'));
		}
	}

	public static void method2791(byte i) {
		try {
			aClass40_6869 = null;
			if (i > 113) {
				anIntArray6890 = null;
				anIntArrayArray6891 = null;
				aStringArray6878 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oga.G(" + i + ')');
		}
	}

	final boolean method2792(int i, int i_8_, int i_9_, byte i_10_) {
		try {
			if (i_10_ > -100)
				method2795(null, (byte) 95);
			anInt6884++;
			if (anInt6879 != i_9_ || anInt6889 > i_8_
					|| (anInt6887 ^ 0xffffffff) > (i_8_ ^ 0xffffffff)
					|| i < anInt6871
					|| (anInt6874 ^ 0xffffffff) > (i ^ 0xffffffff))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("oga.H(" + i + ','
					+ i_8_ + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	final void method2793(int[] is, int i, int i_11_, int i_12_) {
		try {
			is[2] = i_12_ + (anInt6871 - ((Class11_Sub32) this).anInt6888);
			is[1] = i + (-((Class11_Sub32) this).anInt6875 + anInt6889);
			anInt6892++;
			is[i_11_] = anInt6879;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("oga.D("
					+ (is != null ? "{...}" : "null") + ',' + i + ',' + i_11_
					+ ',' + i_12_ + ')'));
		}
	}

	static final void method2794(Packet class11_sub20_sub1, boolean bool, int i) {
		do {
			try {
				anInt6880++;
				boolean bool_13_ = class11_sub20_sub1.readBits(1, (byte) 108) == 1;
				if (bool_13_)
					Class11_Sub45_Sub7.anIntArray8801[Class56.anInt841++] = i;
				int i_14_ = class11_sub20_sub1.readBits(2, (byte) 108);
				Player class376_sub7_sub5_sub5_sub1 = Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i];
				if (i_14_ == 0) {
					if (bool_13_)
						((Player) class376_sub7_sub5_sub5_sub1).aBool10393 = false;
					else {
						if (i == Class11_Sub44.anInt7791)
							throw new RuntimeException("s:lr");
						Class362 class362 = Class38.aClass362Array510[i] = new Class362();
						((Class362) class362).anInt4706 = (((Class194.anInt2641 - -(((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10370[0])) >> 6 << 14)
								+ (((Class376_Sub7) class376_sub7_sub5_sub5_sub1).aByte7047 << 28) - -((Class118.anInt1605 + (((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10376[0])) >> 6));
						if ((((Player) class376_sub7_sub5_sub5_sub1).anInt10401 ^ 0xffffffff) != 0)
							((Class362) class362).anInt4709 = ((Player) class376_sub7_sub5_sub5_sub1).anInt10401;
						else
							((Class362) class362).anInt4709 = ((Actor) class376_sub7_sub5_sub5_sub1).aClass173_10278
									.method1140(-1);
						((Class362) class362).anInt4708 = ((Actor) class376_sub7_sub5_sub5_sub1).faceEntity;
						((Class362) class362).aBool4712 = ((Player) class376_sub7_sub5_sub5_sub1).aBool10420;
						if (((Player) class376_sub7_sub5_sub5_sub1).anInt10383 > 0)
							Class167.method1101(120,
									class376_sub7_sub5_sub5_sub1);
						Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i] = null;
						if (class11_sub20_sub1.readBits(1, (byte) 108) != 0)
							Class33_Sub3.method2921(i, class11_sub20_sub1, 0);
					}
				} else if ((i_14_ ^ 0xffffffff) == -2) {
					int i_15_ = class11_sub20_sub1.readBits(3, (byte) 108);
					int i_16_ = (((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10370[0]);
					int i_17_ = (((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10376[0]);
					if ((i_15_ ^ 0xffffffff) != -1) {
						if (i_15_ != 1) {
							if (i_15_ == 2) {
								i_16_++;
								i_17_--;
							} else if ((i_15_ ^ 0xffffffff) == -4)
								i_16_--;
							else if ((i_15_ ^ 0xffffffff) != -5) {
								if ((i_15_ ^ 0xffffffff) == -6) {
									i_16_--;
									i_17_++;
								} else if ((i_15_ ^ 0xffffffff) == -7)
									i_17_++;
								else if (i_15_ == 7) {
									i_17_++;
									i_16_++;
								}
							} else
								i_16_++;
						} else
							i_17_--;
					} else {
						i_17_--;
						i_16_--;
					}
					if (!bool_13_)
						class376_sub7_sub5_sub5_sub1.method3971(false, i_16_,
								i_17_, Class206.movementTypes[i]);
					else {
						((Player) class376_sub7_sub5_sub5_sub1).anInt10402 = i_17_;
						((Player) class376_sub7_sub5_sub5_sub1).anInt10424 = i_16_;
						((Player) class376_sub7_sub5_sub5_sub1).aBool10393 = true;
					}
				} else if (i_14_ == 2) {
					int i_18_ = class11_sub20_sub1.readBits(4, (byte) 108);
					int i_19_ = (((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10370[0]);
					int i_20_ = (((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10376[0]);
					if ((i_18_ ^ 0xffffffff) != -1) {
						if ((i_18_ ^ 0xffffffff) != -2) {
							if ((i_18_ ^ 0xffffffff) == -3)
								i_20_ -= 2;
							else if ((i_18_ ^ 0xffffffff) == -4) {
								i_19_++;
								i_20_ -= 2;
							} else if ((i_18_ ^ 0xffffffff) == -5) {
								i_19_ += 2;
								i_20_ -= 2;
							} else if (i_18_ != 5) {
								if ((i_18_ ^ 0xffffffff) == -7) {
									i_19_ += 2;
									i_20_--;
								} else if (i_18_ == 7)
									i_19_ -= 2;
								else if ((i_18_ ^ 0xffffffff) != -9) {
									if (i_18_ == 9) {
										i_20_++;
										i_19_ -= 2;
									} else if (i_18_ == 10) {
										i_20_++;
										i_19_ += 2;
									} else if (i_18_ != 11) {
										if (i_18_ != 12) {
											if (i_18_ != 13) {
												if (i_18_ != 14) {
													if ((i_18_ ^ 0xffffffff) == -16) {
														i_19_ += 2;
														i_20_ += 2;
													}
												} else {
													i_19_++;
													i_20_ += 2;
												}
											} else
												i_20_ += 2;
										} else {
											i_20_ += 2;
											i_19_--;
										}
									} else {
										i_20_ += 2;
										i_19_ -= 2;
									}
								} else
									i_19_ += 2;
							} else {
								i_19_ -= 2;
								i_20_--;
							}
						} else {
							i_19_--;
							i_20_ -= 2;
						}
					} else {
						i_19_ -= 2;
						i_20_ -= 2;
					}
					if (!bool_13_)
						class376_sub7_sub5_sub5_sub1.method3971(bool, i_19_,
								i_20_, Class206.movementTypes[i]);
					else {
						((Player) class376_sub7_sub5_sub5_sub1).anInt10424 = i_19_;
						((Player) class376_sub7_sub5_sub5_sub1).anInt10402 = i_20_;
						((Player) class376_sub7_sub5_sub5_sub1).aBool10393 = true;
					}
				} else {
					int i_21_ = class11_sub20_sub1.readBits(1, (byte) 108);
					if (i_21_ == 0) {
						int i_22_ = class11_sub20_sub1.readBits(12,
								(byte) 108);
						int i_23_ = i_22_ >> 10;
						int i_24_ = (0x3f1 & i_22_) >> 5;
						if (i_24_ > 15)
							i_24_ -= 32;
						int i_25_ = i_22_ & 0x1f;
						if (i_25_ > 15)
							i_25_ -= 32;
						int i_26_ = ((((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10370[0]) - -i_24_);
						int i_27_ = i_25_
								+ (((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10376[0]);
						if (bool_13_) {
							((Player) class376_sub7_sub5_sub5_sub1).anInt10424 = i_26_;
							((Player) class376_sub7_sub5_sub5_sub1).aBool10393 = true;
							((Player) class376_sub7_sub5_sub5_sub1).anInt10402 = i_27_;
						} else
							class376_sub7_sub5_sub5_sub1.method3971(false,
									i_26_, i_27_, Class206.movementTypes[i]);
						((Class376_Sub7) class376_sub7_sub5_sub5_sub1).aByte7047 = ((Class376_Sub7) class376_sub7_sub5_sub5_sub1).aByte7039 = (byte) (0x3 & i_23_
								+ (((Class376_Sub7) class376_sub7_sub5_sub5_sub1).aByte7047));
						if (Class321_Sub3_Sub1.method3613((byte) -71, i_26_,
								i_27_))
							((Class376_Sub7) class376_sub7_sub5_sub5_sub1).aByte7039++;
						if ((Class11_Sub44.anInt7791 ^ 0xffffffff) == (i ^ 0xffffffff)) {
							if ((((Class376_Sub7) class376_sub7_sub5_sub5_sub1).aByte7047) != Class376_Sub7_Sub2.anInt9242)
								Class333.aBool4411 = true;
							Class376_Sub7_Sub2.anInt9242 = ((Class376_Sub7) class376_sub7_sub5_sub5_sub1).aByte7047;
						}
					} else if (bool == false) {
						int i_28_ = class11_sub20_sub1.readBits(30,
								(byte) 108);
						int i_29_ = i_28_ >> 28;
						int i_30_ = (0xfffe8c2 & i_28_) >> 14;
						int i_31_ = i_28_ & 0x3fff;
						int i_32_ = (((i_30_ + Class194.anInt2641 + (((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10370[0])) & 0x3fff) + -Class194.anInt2641);
						int i_33_ = (-Class118.anInt1605 + (((((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10376[0]) - (-Class118.anInt1605 - i_31_)) & 0x3fff));
						if (!bool_13_)
							class376_sub7_sub5_sub5_sub1.method3971(false,
									i_32_, i_33_, Class206.movementTypes[i]);
						else {
							((Player) class376_sub7_sub5_sub5_sub1).anInt10424 = i_32_;
							((Player) class376_sub7_sub5_sub5_sub1).aBool10393 = true;
							((Player) class376_sub7_sub5_sub5_sub1).anInt10402 = i_33_;
						}
						((Class376_Sub7) class376_sub7_sub5_sub5_sub1).aByte7047 = ((Class376_Sub7) class376_sub7_sub5_sub5_sub1).aByte7039 = (byte) ((((Class376_Sub7) class376_sub7_sub5_sub5_sub1).aByte7047 + i_29_) & 0x3);
						if (Class321_Sub3_Sub1.method3613((byte) -9, i_32_,
								i_33_))
							((Class376_Sub7) class376_sub7_sub5_sub5_sub1).aByte7039++;
						if (i != Class11_Sub44.anInt7791)
							break;
						Class376_Sub7_Sub2.anInt9242 = (((Class376_Sub7) class376_sub7_sub5_sub5_sub1).aByte7047);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("oga.I("
						+ (class11_sub20_sub1 != null ? "{...}" : "null") + ','
						+ bool + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	Class11_Sub32(int i, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_,
			int i_39_, int i_40_, int i_41_) {
		try {
			((Class11_Sub32) this).anInt6883 = i_41_;
			((Class11_Sub32) this).anInt6885 = i_40_;
			anInt6887 = i_36_;
			anInt6874 = i_37_;
			anInt6879 = i;
			anInt6871 = i_35_;
			anInt6889 = i_34_;
			((Class11_Sub32) this).anInt6875 = i_38_;
			((Class11_Sub32) this).anInt6888 = i_39_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("oga.<init>(" + i + ',' + i_34_ + ',' + i_35_ + ','
							+ i_36_ + ',' + i_37_ + ',' + i_38_ + ',' + i_39_
							+ ',' + i_40_ + ',' + i_41_ + ')'));
		}
	}

	static final String method2795(int[] is, byte i) {
		try {
			anInt6877++;
			StringBuffer stringbuffer = new StringBuffer();
			int i_42_ = -63 % ((64 - i) / 35);
			int i_43_ = Class11_Sub45_Sub11.anInt9153;
			for (int i_44_ = 0; i_44_ < is.length; i_44_++) {
				Class101 class101 = Class11_Sub12_Sub4.aClass273_9466
						.method1702(is[i_44_], (byte) 75);
				if ((((Class101) class101).anInt1333 ^ 0xffffffff) != 0) {
					Class253 class253 = (Class253) (Class19_Sub1.aClass22_5758
							.method188((long) ((Class101) class101).anInt1333,
									(byte) 92));
					if (class253 == null) {
						Class80 class80 = Class80.method545(
								Class108_Sub7.aClass146_5636,
								(((Class101) class101).anInt1333), 0);
						if (class80 != null) {
							class253 = Class321_Sub2.aClass163_6648.method1081(
									class80, true);
							Class19_Sub1.aClass22_5758.method184((byte) 127,
									class253,
									(long) ((Class101) class101).anInt1333);
						}
					}
					if (class253 != null) {
						Class46.aClass253Array722[i_43_] = class253;
						stringbuffer.append(" <img=").append(i_43_).append(">");
						i_43_++;
					}
				}
			}
			return stringbuffer.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oga.C("
					+ (is != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static {
		anInt6873 = -1;
		anIntArrayArray6891 = new int[][] { { 2, 4, 6, 0 },
				{ 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 },
				{ 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 },
				{ 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 },
				{ 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 },
				{ 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };
		anIntArray6890 = new int[] { -1, -1, 1, 1 };
	}
}
