/* Class305 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class305 {
	private int anInt4095 = 0;
	Class236_Sub8 aClass236_Sub8_4096;
	static OutgoingPacket aClass370_4097;
	static int anInt4098;
	private Class163_Sub3 aClass163_Sub3_4099;
	static int anInt4100;
	private Class299 aClass299_4101;
	private Class236[] aClass236Array4102;
	private int anInt4103;
	static int anInt4104 = 0;
	private int anInt4105 = 0;
	static int anInt4106;

	static final void method1871(boolean bool, byte[][][] is, int i, byte i_0_,
			int i_1_, int i_2_, boolean bool_3_) {
		int i_4_ = bool ? 1 : 0;
		Class12.anInt96 = 0;
		Class376_Sub7_Sub2_Sub1.anInt10206 = 0;
		Class11_Sub2_Sub11.anInt8861++;
		if ((i_2_ & 0x2) == 0) {
			for (Class376_Sub7 class376_sub7 = Class382.aClass376_Sub7Array4971[i_4_]; class376_sub7 != null; class376_sub7 = ((Class376_Sub7) class376_sub7).aClass376_Sub7_7032) {
				if (!Class11_Sub30_Sub1.method3531(class376_sub7, bool, is, i,
						i_0_)) {
					Class11_Sub45_Sub16_Sub2.method3927(class376_sub7);
					if (((Class376_Sub7) class376_sub7).anInt7041 != -1)
						Class11_Sub28.aClass376_Sub7Array6568[Class12.anInt96++] = class376_sub7;
				}
			}
		}
		if ((i_2_ & 0x1) == 0) {
			for (Class376_Sub7 class376_sub7 = Class11_Sub2_Sub25.aClass376_Sub7Array9326[i_4_]; class376_sub7 != null; class376_sub7 = ((Class376_Sub7) class376_sub7).aClass376_Sub7_7032) {
				if (!Class11_Sub30_Sub1.method3531(class376_sub7, bool, is, i,
						i_0_)) {
					Class11_Sub45_Sub16_Sub2.method3927(class376_sub7);
					if (((Class376_Sub7) class376_sub7).anInt7041 != -1)
						Class11_Sub2_Sub23.aClass376_Sub7Array9265[Class376_Sub7_Sub2_Sub1.anInt10206++] = class376_sub7;
				}
			}
			for (Class376_Sub7 class376_sub7 = Class11_Sub45_Sub4.aClass376_Sub7Array8534[i_4_]; class376_sub7 != null; class376_sub7 = ((Class376_Sub7) class376_sub7).aClass376_Sub7_7032) {
				if (!Class11_Sub30_Sub1.method3531(class376_sub7, bool, is, i,
						i_0_)) {
					if (class376_sub7.method2870(false)) {
						Class11_Sub45_Sub16_Sub2.method3927(class376_sub7);
						if (((Class376_Sub7) class376_sub7).anInt7041 != -1)
							Class11_Sub2_Sub23.aClass376_Sub7Array9265[Class376_Sub7_Sub2_Sub1.anInt10206++] = class376_sub7;
					} else {
						Class11_Sub45_Sub16_Sub2.method3927(class376_sub7);
						if (((Class376_Sub7) class376_sub7).anInt7041 != -1)
							Class11_Sub28.aClass376_Sub7Array6568[Class12.anInt96++] = class376_sub7;
					}
				}
			}
			if (!bool) {
				for (int i_5_ = 0; i_5_ < Class174.anInt2226; i_5_++) {
					if (!Class11_Sub30_Sub1.method3531(
							Class286.aClass376_Sub7_Sub5Array3869[i_5_], bool,
							is, i, i_0_)) {
						Class11_Sub45_Sub16_Sub2
								.method3927(Class286.aClass376_Sub7_Sub5Array3869[i_5_]);
						if ((((Class376_Sub7) Class286.aClass376_Sub7_Sub5Array3869[i_5_]).anInt7041) != -1) {
							if (Class286.aClass376_Sub7_Sub5Array3869[i_5_]
									.method2870(false))
								Class11_Sub2_Sub23.aClass376_Sub7Array9265[Class376_Sub7_Sub2_Sub1.anInt10206++] = (Class286.aClass376_Sub7_Sub5Array3869[i_5_]);
							else
								Class11_Sub28.aClass376_Sub7Array6568[Class12.anInt96++] = (Class286.aClass376_Sub7_Sub5Array3869[i_5_]);
						}
					}
				}
			}
		}
		if (Class12.anInt96 > 0) {
			Class9.method113(Class11_Sub28.aClass376_Sub7Array6568, 0,
					Class12.anInt96 - 1);
			for (int i_6_ = 0; i_6_ < Class12.anInt96; i_6_++)
				Class110.method737(Class11_Sub28.aClass376_Sub7Array6568[i_6_],
						true, bool_3_);
		}
		if (Class11_Sub2_Sub17.aBool9051)
			Class87.aClass163_1210.method1001(0, null);
		if ((i_2_ & 0x2) == 0) {
			for (int i_7_ = Class11_Sub45_Sub7.anInt8803; i_7_ < Class155.anInt2044; i_7_++) {
				if (i_7_ >= i && is != null) {
					int i_8_ = Class11_Sub2_Sub19.aBoolArrayArray9091.length;
					if ((Class244.anInt3312 + Class11_Sub2_Sub19.aBoolArrayArray9091.length) > Class138.anInt1886)
						i_8_ -= (Class244.anInt3312
								+ Class11_Sub2_Sub19.aBoolArrayArray9091.length - Class138.anInt1886);
					int i_9_ = Class11_Sub2_Sub19.aBoolArrayArray9091[0].length;
					if ((Class33.anInt456 + Class11_Sub2_Sub19.aBoolArrayArray9091[0].length) > Class82.anInt1133)
						i_9_ -= (Class33.anInt456
								+ (Class11_Sub2_Sub19.aBoolArrayArray9091[0]).length - Class82.anInt1133);
					boolean[][] bools = Class106.aBoolArrayArray1426;
					if (Class246.aBool3327) {
						if (Class376_Sub1.aBool5098)
							bools = (Class11_Sub2_Sub25.aBoolArrayArrayArray9331[i_7_]);
						for (int i_10_ = Class219.anInt3018; i_10_ < i_8_; i_10_++) {
							int i_11_ = (i_10_ + Class244.anInt3312 - Class219.anInt3018);
							for (int i_12_ = Player.anInt10411; i_12_ < i_9_; i_12_++) {
								bools[i_10_][i_12_] = false;
								if (Class11_Sub2_Sub19.aBoolArrayArray9091[i_10_][i_12_]) {
									int i_13_ = (i_12_ + Class33.anInt456 - (Player.anInt10411));
									for (int i_14_ = i_7_; i_14_ >= 0; i_14_--) {
										if ((Class181.aClass364ArrayArrayArray2336[i_14_][i_11_][i_13_]) != null
												&& (((Class364) (Class181.aClass364ArrayArrayArray2336[i_14_][i_11_][i_13_])).aByte4785) == i_7_) {
											if (i_14_ >= i
													&& (is[i_14_][i_11_][i_13_]) == i_0_
													|| (Class11_Sub2_Sub30
															.method3792(i_7_,
																	843095752,
																	i_13_,
																	i_11_)))
												bools[i_10_][i_12_] = false;
											else
												bools[i_10_][i_12_] = true;
											break;
										}
									}
								}
							}
						}
					}
					if (Class376_Sub1.aBool5098) {
						if (i_1_ >= 0)
							Class315.aClass12Array4179[i_7_].method135(0, 0, 0,
									null, false, i_1_, i_2_);
						else
							Class315.aClass12Array4179[i_7_].method132(0, 0, 0,
									null, false, i_2_);
						for (int i_15_ = 0; i_15_ < Class68.anInt974; i_15_++)
							Class376_Sub1_Sub1.aClass322Array8690[i_15_]
									.method1966(new Class376_Sub6(i_7_ + 1),
											-20613);
					} else if (i_1_ >= 0)
						Class315.aClass12Array4179[i_7_]
								.method135(Class11_Sub45_Sub7.anInt8807,
										Class15.anInt134,
										Class94_Sub4.anInt7730,
										Class106.aBoolArrayArray1426, false,
										i_1_, i_2_);
					else
						Class315.aClass12Array4179[i_7_].method132(
								Class11_Sub45_Sub7.anInt8807, Class15.anInt134,
								Class94_Sub4.anInt7730,
								Class106.aBoolArrayArray1426, false, i_2_);
				} else {
					int i_16_ = Class11_Sub2_Sub19.aBoolArrayArray9091.length;
					if ((Class244.anInt3312 + Class11_Sub2_Sub19.aBoolArrayArray9091.length) > Class138.anInt1886)
						i_16_ -= (Class244.anInt3312
								+ Class11_Sub2_Sub19.aBoolArrayArray9091.length - Class138.anInt1886);
					int i_17_ = Class11_Sub2_Sub19.aBoolArrayArray9091[0].length;
					if ((Class33.anInt456 + Class11_Sub2_Sub19.aBoolArrayArray9091[0].length) > Class82.anInt1133)
						i_17_ -= (Class33.anInt456
								+ (Class11_Sub2_Sub19.aBoolArrayArray9091[0]).length - Class82.anInt1133);
					boolean[][] bools = Class106.aBoolArrayArray1426;
					if (Class246.aBool3327) {
						if (Class376_Sub1.aBool5098)
							bools = (Class11_Sub2_Sub25.aBoolArrayArrayArray9331[i_7_]);
						for (int i_18_ = Class219.anInt3018; i_18_ < i_16_; i_18_++) {
							int i_19_ = (i_18_ + Class244.anInt3312 - Class219.anInt3018);
							for (int i_20_ = Player.anInt10411; i_20_ < i_17_; i_20_++) {
								if ((Class11_Sub2_Sub19.aBoolArrayArray9091[i_18_][i_20_])
										&& !(Class11_Sub2_Sub30
												.method3792(
														i_7_,
														843095752,
														(i_20_
																+ Class33.anInt456 - (Player.anInt10411)),
														i_19_)))
									bools[i_18_][i_20_] = true;
								else
									bools[i_18_][i_20_] = false;
							}
						}
					}
					if (Class376_Sub1.aBool5098) {
						if (i_1_ >= 0)
							Class315.aClass12Array4179[i_7_].method135(0, 0, 0,
									null, false, i_1_, i_2_);
						else
							Class315.aClass12Array4179[i_7_].method132(0, 0, 0,
									null, false, i_2_);
						for (int i_21_ = 0; i_21_ < Class68.anInt974; i_21_++)
							Class376_Sub1_Sub1.aClass322Array8690[i_21_]
									.method1966(new Class376_Sub6(i_7_ + 1),
											-20613);
					} else if (i_1_ >= 0)
						Class315.aClass12Array4179[i_7_].method135(
								Class11_Sub45_Sub7.anInt8807, Class15.anInt134,
								Class94_Sub4.anInt7730,
								Class106.aBoolArrayArray1426, true, i_1_, i_2_);
					else
						Class315.aClass12Array4179[i_7_].method132(
								Class11_Sub45_Sub7.anInt8807, Class15.anInt134,
								Class94_Sub4.anInt7730,
								Class106.aBoolArrayArray1426, true, i_2_);
				}
			}
		}
		if (Class376_Sub7_Sub2_Sub1.anInt10206 > 0) {
			Class10.method120(Class11_Sub2_Sub23.aClass376_Sub7Array9265, 0,
					Class376_Sub7_Sub2_Sub1.anInt10206 - 1);
			for (int i_22_ = 0; i_22_ < Class376_Sub7_Sub2_Sub1.anInt10206; i_22_++)
				Class110.method737(
						(Class11_Sub2_Sub23.aClass376_Sub7Array9265[i_22_]),
						true, bool_3_);
		}
	}

	final boolean method1872(int i, Class321 class321, int i_23_) {
		try {
			anInt4106++;
			if (anInt4095 == 0)
				return false;
			aClass236Array4102[i_23_ & anInt4095].method1504(i, -40, class321);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("rm.D(" + i + ',' + (class321 != null ? "{...}" : "null")
							+ ',' + i_23_ + ')'));
		}
	}

	final boolean method1873(int i, int i_24_) {
		try {
			anInt4100++;
			if (i_24_ != -1312)
				method1873(50, -54);
			return aClass236Array4102[i].method1500((byte) 56);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rm.A(" + i + ','
					+ i_24_ + ')');
		}
	}

	final void method1874(int i, int i_25_, boolean bool, boolean bool_26_,
			int i_27_, int i_28_) {
		do {
			try {
				anInt4098++;
				if (i_25_ != 1)
					anInt4095 = -25;
				bool &= aClass163_Sub3_4099.method1019();
				if (!bool
						&& ((i_28_ ^ 0xffffffff) == -5
								|| (i_28_ ^ 0xffffffff) == -9 || i_28_ == 9)) {
					if (i_28_ == 4)
						i_27_ = i;
					i_28_ = 2;
				}
				if (i_28_ != 0 && bool_26_)
					i_28_ |= ~0x7fffffff;
				if (anInt4095 != i_28_) {
					if ((anInt4095 ^ 0xffffffff) != -1)
						aClass236Array4102[anInt4095 & 0x7fffffff]
								.method1502(98);
					if ((i_28_ ^ 0xffffffff) != -1) {
						aClass236Array4102[0x7fffffff & i_28_].method1505(true,
								bool_26_);
						aClass236Array4102[i_28_ & 0x7fffffff].method1508(
								17660, bool_26_);
						aClass236Array4102[0x7fffffff & i_28_].method1506(i,
								114, i_27_);
					}
					anInt4103 = i;
					anInt4105 = i_27_;
					anInt4095 = i_28_;
				} else {
					if ((anInt4095 ^ 0xffffffff) == -1)
						break;
					aClass236Array4102[0x7fffffff & anInt4095].method1508(
							i_25_ ^ 0x44fd, bool_26_);
					if ((i ^ 0xffffffff) != (anInt4103 ^ 0xffffffff)
							|| i_27_ != anInt4105) {
						aClass236Array4102[0x7fffffff & anInt4095].method1506(
								i, i_25_ + 95, i_27_);
						anInt4105 = i_27_;
						anInt4103 = i;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("rm.C(" + i + ','
						+ i_25_ + ',' + bool + ',' + bool_26_ + ',' + i_27_
						+ ',' + i_28_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method1875(byte i) {
		try {
			if (i == -122)
				aClass370_4097 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rm.B(" + i + ')');
		}
	}

	Class305(Class163_Sub3 class163_sub3) {
		anInt4103 = 0;
		do {
			try {
				aClass163_Sub3_4099 = class163_sub3;
				aClass299_4101 = new Class299(class163_sub3);
				aClass236Array4102 = new Class236[10];
				aClass236Array4102[1] = new Class236_Sub7(class163_sub3);
				aClass236Array4102[2] = new Class236_Sub2(class163_sub3,
						aClass299_4101);
				aClass236Array4102[4] = new Class236_Sub3(class163_sub3,
						aClass299_4101);
				aClass236Array4102[5] = new Class236_Sub5(class163_sub3,
						aClass299_4101);
				aClass236Array4102[6] = new Class236_Sub6(class163_sub3);
				aClass236Array4102[7] = new Class236_Sub4(class163_sub3);
				aClass236Array4102[3] = ((Class305) this).aClass236_Sub8_4096 = new Class236_Sub8(
						class163_sub3);
				aClass236Array4102[8] = new Class236_Sub9(class163_sub3,
						aClass299_4101);
				aClass236Array4102[9] = new Class236_Sub1(class163_sub3,
						aClass299_4101);
				if (!aClass236Array4102[8].method1500((byte) -127))
					aClass236Array4102[8] = aClass236Array4102[4];
				if (aClass236Array4102[9].method1500((byte) 59))
					break;
				aClass236Array4102[9] = aClass236Array4102[8];
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "rm.<init>("
						+ (class163_sub3 != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	static {
		aClass370_4097 = new OutgoingPacket(79, -1);
	}
}
