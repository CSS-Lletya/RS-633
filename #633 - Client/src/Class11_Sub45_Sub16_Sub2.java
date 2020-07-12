/* Class11_Sub45_Sub16_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub45_Sub16_Sub2 extends Class11_Sub45_Sub16 {
	static int anInt10162;
	private Object anObject10163;
	static Class22 aClass22_10164 = new Class22(20);
	static int anInt10165;
	static int anInt10166;
	static int anInt10167;
	static int anInt10168;
	static int anInt10169;
	static Class146 aClass146_10170;
	static byte[][] aByteArrayArray10171;
	/* synthetic */static Class aClass10172;

	static final void method3927(Class376_Sub7 class376_sub7) {
		Class87.aClass163_1210.H(((Class376_Sub7) class376_sub7).anInt7045,
				(((Class376_Sub7) class376_sub7).anInt7036 + (class376_sub7
						.method2867(32767) >> 1)),
				((Class376_Sub7) class376_sub7).anInt7031,
				Class376.anIntArray4907);
		((Class376_Sub7) class376_sub7).anInt7034 = Class376.anIntArray4907[0];
		((Class376_Sub7) class376_sub7).anInt7048 = Class376.anIntArray4907[1];
		((Class376_Sub7) class376_sub7).anInt7041 = Class376.anIntArray4907[2];
	}

	final Object method3703(int i) {
		try {
			anInt10165++;
			if (i != -11907)
				return null;
			return anObject10163;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qt.A(" + i + ')');
		}
	}

	static final void method3928(int i) {
		do {
			try {
				Class237.aClass253_3237 = null;
				anInt10169++;
				Class228.anInt3150 = -1;
				if (i == 16598)
					break;
				method3930(null, -29, -22);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "qt.F(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method3929(byte i) {
		try {
			aByteArrayArray10171 = null;
			aClass146_10170 = null;
			int i_0_ = -79 % ((4 - i) / 44);
			aClass22_10164 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qt.G(" + i + ')');
		}
	}

	final boolean method3704(int i) {
		try {
			anInt10162++;
			if (i != 16311)
				return false;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qt.B(" + i + ')');
		}
	}

	static final boolean method3930(Class163 class163, int i, int i_1_) {
		try {
			anInt10168++;
			if (i_1_ != 4)
				return false;
			int i_2_ = (-104 + Class300.anInt4051) / 2;
			int i_3_ = (-104 + Class108_Sub12.anInt6228) / 2;
			boolean bool = true;
			for (int i_4_ = i_2_; i_2_ + 104 > i_4_; i_4_++) {
				for (int i_5_ = i_3_; (104 + i_3_ ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
					for (int i_6_ = i; (i_6_ ^ 0xffffffff) >= -4; i_6_++) {
						if (Class173.method1131(i_5_, -1, i_6_, i_4_, i)) {
							int i_7_ = i_6_;
							if (Class321_Sub3_Sub1.method3613((byte) -50, i_4_,
									i_5_))
								i_7_--;
							if (i_7_ >= 0)
								bool &= (Class376_Sub7_Sub2_Sub1.method3933(
										(byte) 92, i_5_, i_4_, i_7_));
						}
					}
				}
			}
			if (!bool)
				return false;
			int[] is = new int[262144];
			for (int i_8_ = 0; i_8_ < is.length; i_8_++)
				is[i_8_] = -16777216;
			Class237.aClass253_3237 = class163.method1040(512, 512, is, i_1_
					^ ~0x4, 512, 0);
			Class1.method64((byte) 126);
			int i_9_ = (~0xffffff | ((int) (Math.random() * 20.0) + 238 + (-10 + ((-10
					+ (238 + (int) (Math.random() * 20.0)) << 8) + (-10
					+ (int) (Math.random() * 20.0) + 238 << 16)))));
			int i_10_ = 228 + (int) (20.0 * Math.random()) << 16 | ~0xffffff;
			int i_11_ = ((int) (Math.random() * 8.0) | ((int) (8.0 * Math
					.random()) << 16 | (int) (Math.random() * 8.0) << 8));
			boolean[][] bools = (new boolean[1 + Class11_Sub2_Sub6.anInt8707 + 2][1 + Class11_Sub2_Sub6.anInt8707 + 2]);
			for (int i_12_ = i_2_; i_2_ + 104 > i_12_; i_12_ += Class11_Sub2_Sub6.anInt8707) {
				for (int i_13_ = i_3_; (i_13_ ^ 0xffffffff) > (104 + i_3_ ^ 0xffffffff); i_13_ += Class11_Sub2_Sub6.anInt8707) {
					int i_14_ = 0;
					int i_15_ = 0;
					int i_16_ = i_12_;
					if ((i_16_ ^ 0xffffffff) < -1) {
						i_16_--;
						i_14_ += 4;
					}
					int i_17_ = i_13_;
					if (i_17_ > 0)
						i_17_--;
					int i_18_ = Class11_Sub2_Sub6.anInt8707 + i_12_;
					if (i_18_ < 104)
						i_18_++;
					int i_19_ = i_13_ + Class11_Sub2_Sub6.anInt8707;
					if (i_19_ < 104) {
						i_19_++;
						i_15_ += 4;
					}
					class163.KA(0, 0, i_14_
							- -(4 * Class11_Sub2_Sub6.anInt8707), 4
							* Class11_Sub2_Sub6.anInt8707 + i_15_);
					class163.GA(-16777216);
					for (int i_20_ = i; (i_20_ ^ 0xffffffff) >= -4; i_20_++) {
						for (int i_21_ = 0; i_21_ <= Class11_Sub2_Sub6.anInt8707; i_21_++) {
							for (int i_22_ = 0; ((Class11_Sub2_Sub6.anInt8707 ^ 0xffffffff) <= (i_22_ ^ 0xffffffff)); i_22_++)
								bools[i_21_][i_22_] = Class173.method1131(i_22_
										+ i_17_, -1, i_20_, i_16_ + i_21_, i);
						}
						Class11_Sub2_Sub38.aClass12Array9796[i_20_].method133(
								0, 0, 1024, i_16_, i_17_, i_18_, i_19_, bools);
						if (!Class63.aBool923) {
							for (int i_23_ = -4; Class11_Sub2_Sub6.anInt8707 > i_23_; i_23_++) {
								for (int i_24_ = -4; Class11_Sub2_Sub6.anInt8707 > i_24_; i_24_++) {
									int i_25_ = i_12_ - -i_23_;
									int i_26_ = i_24_ + i_13_;
									if (i_25_ >= i_2_
											&& ((i_3_ ^ 0xffffffff) >= (i_26_ ^ 0xffffffff))
											&& Class173.method1131(i_26_, -1,
													i_20_, i_25_, i)) {
										int i_27_ = i_20_;
										if (Class321_Sub3_Sub1.method3613(
												(byte) -128, i_25_, i_26_))
											i_27_--;
										if ((i_27_ ^ 0xffffffff) <= -1)
											Class11_Sub2_Sub25
													.method3643(
															i_26_,
															i_23_ * 4 + i_14_,
															i_9_,
															i_25_,
															i_27_,
															i_10_,
															class163,
															-4
																	+ (4 * ((Class11_Sub2_Sub6.anInt8707) - i_24_) + i_15_),
															i_1_ - 19);
									}
								}
							}
						}
					}
					if (Class63.aBool923) {
						Class338 class338 = Class235.aClass338Array3217[i];
						for (int i_28_ = 0; ((Class11_Sub2_Sub6.anInt8707 ^ 0xffffffff) < (i_28_ ^ 0xffffffff)); i_28_++) {
							for (int i_29_ = 0; ((Class11_Sub2_Sub6.anInt8707 ^ 0xffffffff) < (i_29_ ^ 0xffffffff)); i_29_++) {
								int i_30_ = i_12_ - -i_28_;
								int i_31_ = i_13_ + i_29_;
								int i_32_ = (((Class338) class338).anIntArrayArray4459[(-((Class338) class338).anInt4470 + i_30_)][(-((Class338) class338).anInt4465 + i_31_)]);
								if ((i_32_ & 0x40240000) == 0) {
									if ((i_32_ & 0x800000 ^ 0xffffffff) != -1)
										class163.method1059(
												i_14_ + 4 * i_28_,
												((-i_29_ + Class11_Sub2_Sub6.anInt8707) * 4)
														+ (i_15_ - 4), 8985, 4,
												-1713569622);
									else if ((i_32_ & 0x2000000 ^ 0xffffffff) != -1)
										class163.method1022(
												i_1_ ^ 0x7b,
												i_28_ * 4 + (i_14_ + 3),
												4
														* (Class11_Sub2_Sub6.anInt8707 - i_29_)
														+ i_15_ - 4, 4,
												-1713569622);
									else if ((i_32_ & 0x8000000) != 0)
										class163.method1059(
												i_14_ + 4 * i_28_,
												(i_15_
														- (-((Class11_Sub2_Sub6.anInt8707 - i_29_) * 4) + 4) + 3),
												8985, 4, -1713569622);
									else if ((i_32_ & 0x20000000) != 0)
										class163.method1022(
												124,
												i_14_ + 4 * i_28_,
												-4
														+ (i_15_ + (-i_29_ + (Class11_Sub2_Sub6.anInt8707)) * 4),
												4, -1713569622);
								} else
									class163.method1035(
											-1713569622,
											i_14_ + i_28_ * 4,
											-4
													+ (i_15_ + (-i_29_ + (Class11_Sub2_Sub6.anInt8707)) * 4),
											(byte) 65, 4, 4);
							}
						}
					}
					class163.aa(i_14_, i_15_, 4 * Class11_Sub2_Sub6.anInt8707,
							4 * Class11_Sub2_Sub6.anInt8707, i_11_, 2);
					Class237.aClass253_3237
							.method1611(
									(-i_2_ + i_12_) * 4 + 48,
									(-(4 * (-i_3_ + i_13_)) + 464 + -(4 * Class11_Sub2_Sub6.anInt8707)),
									Class11_Sub2_Sub6.anInt8707 * 4,
									4 * Class11_Sub2_Sub6.anInt8707, i_14_,
									i_15_);
				}
			}
			class163.la();
			class163.GA(-16777215);
			Class307.method1879(-101);
			NPCDefinitions.anInt2906 = 0;
			Class361.aClass84_4700.method586((byte) -19);
			if (!Class63.aBool923) {
				for (int i_33_ = i_2_; i_2_ + 104 > i_33_; i_33_++) {
					for (int i_34_ = i_3_; i_34_ < 104 + i_3_; i_34_++) {
						for (int i_35_ = i; ((i_35_ ^ 0xffffffff) >= (i + 1 ^ 0xffffffff) && (i_35_ ^ 0xffffffff) >= -4); i_35_++) {
							if (Class173.method1131(i_34_, -1, i_35_, i_33_, i)) {
								Interface13 interface13 = ((Interface13) Class159
										.method988(i_35_, i_33_, i_34_));
								if (interface13 == null)
									interface13 = ((Interface13) (Class180
											.method1185(
													i_35_,
													i_33_,
													i_34_,
													(aClass10172 != null ? aClass10172
															: (aClass10172 = getClassByName("Interface13"))))));
								if (interface13 == null)
									interface13 = ((Interface13) Class209
											.method1342(i_35_, i_33_, i_34_));
								if (interface13 == null)
									interface13 = ((Interface13) Class108_Sub9
											.method2608(i_35_, i_33_, i_34_));
								if (interface13 != null) {
									Class42 class42 = (Class11_Sub4.aClass290_5237
											.method1793((byte) -32, interface13
													.method42((byte) -17)));
									if (!((Class42) class42).aBool675
											|| Class233.aBool3197) {
										int i_36_ = ((Class42) class42).anInt637;
										if (((Class42) class42).anIntArray683 != null) {
											for (int i_37_ = 0; ((i_37_ ^ 0xffffffff) > ((((Class42) class42).anIntArray683).length ^ 0xffffffff)); i_37_++) {
												if (((((Class42) class42).anIntArray683[i_37_]) ^ 0xffffffff) != 0) {
													Class42 class42_38_ = (Class11_Sub4.aClass290_5237
															.method1793(
																	(byte) 126,
																	(((Class42) class42).anIntArray683[i_37_])));
													if (((Class42) class42_38_).anInt637 >= 0)
														i_36_ = (((Class42) class42_38_).anInt637);
												}
											}
										}
										if ((i_36_ ^ 0xffffffff) <= -1) {
											boolean bool_39_ = false;
											if (i_36_ >= 0) {
												Class23 class23 = (Class168.aClass280_2160
														.method1726((byte) -89,
																i_36_));
												if (class23 != null
														&& (((Class23) class23).aBool239))
													bool_39_ = true;
											}
											int i_40_ = i_33_;
											int i_41_ = i_34_;
											if (bool_39_) {
												int[][] is_42_ = (((Class338) (Class235.aClass338Array3217[i_35_])).anIntArrayArray4459);
												int i_43_ = (((Class338) (Class235.aClass338Array3217[i_35_])).anInt4470);
												int i_44_ = (((Class338) (Class235.aClass338Array3217[i_35_])).anInt4465);
												for (int i_45_ = 0; i_45_ < 10; i_45_++) {
													int i_46_ = (int) (4.0 * (Math
															.random()));
													if (i_46_ == 0
															&& i_40_ > i_2_
															&& ((i_33_ - 3 ^ 0xffffffff) > (i_40_ ^ 0xffffffff))
															&& (((0x2c0108 & (is_42_[(-i_43_ - 1 + i_40_)][(-i_44_ + i_41_)])) ^ 0xffffffff) == -1))
														i_40_--;
													if (i_46_ == 1
															&& 103 + i_2_ > i_40_
															&& i_40_ < i_33_ + 3
															&& ((is_42_[(1 + i_40_ + -i_43_)][i_41_
																	+ -i_44_]) & 0x2c0180) == 0)
														i_40_++;
													if (i_46_ == 2
															&& ((i_41_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff))
															&& ((i_41_ ^ 0xffffffff) < (-3
																	+ i_34_ ^ 0xffffffff))
															&& (((0x2c0102 & (is_42_[(-i_43_ + i_40_)][(i_41_ - 1 + -i_44_)])) ^ 0xffffffff) == -1))
														i_41_--;
													if (((i_46_ ^ 0xffffffff) == -4)
															&& ((i_3_ + 103 ^ 0xffffffff) < (i_41_ ^ 0xffffffff))
															&& i_41_ < i_34_ + 3
															&& (((0x2c0120 & (is_42_[(i_40_ + -i_43_)][(-i_44_ + (i_41_ + 1))])) ^ 0xffffffff) == -1))
														i_41_++;
												}
											}
											Class70.anIntArray981[(NPCDefinitions.anInt2906)] = ((Class42) class42).anInt693;
											Class277.anIntArray3744[NPCDefinitions.anInt2906] = i_40_;
											Class50.anIntArray782[(NPCDefinitions.anInt2906)] = i_41_;
											NPCDefinitions.anInt2906++;
										}
									}
								}
							}
						}
					}
				}
				if (Class204.aClass342_2749 != null) {
					((Class146) Class11_Sub2_Sub15.aClass146_9023).anInt1987 = 1;
					Class168.aClass280_2160.method1724(64, (byte) -16, 1024);
					for (int i_47_ = 0; ((((Class342) Class204.aClass342_2749).anInt4539 ^ 0xffffffff) < (i_47_ ^ 0xffffffff)); i_47_++) {
						int i_48_ = (((Class342) Class204.aClass342_2749).anIntArray4533[i_47_]);
						if (((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047 == i_48_ >> 28) {
							int i_49_ = -Class194.anInt2641
									+ (i_48_ >> 14 & 0x3fff);
							int i_50_ = -Class118.anInt1605 + (0x3fff & i_48_);
							if ((i_49_ ^ 0xffffffff) > -1
									|| (i_49_ ^ 0xffffffff) <= (Class300.anInt4051 ^ 0xffffffff)
									|| (i_50_ ^ 0xffffffff) > -1
									|| ((Class108_Sub12.anInt6228 ^ 0xffffffff) >= (i_50_ ^ 0xffffffff))) {
								Class23 class23 = (Class168.aClass280_2160
										.method1726(
												(byte) -111,
												(((Class342) Class204.aClass342_2749).anIntArray4534[i_47_])));
								if (((Class23) class23).anIntArray242 != null
										&& (i_49_
												+ ((Class23) class23).anInt225 ^ 0xffffffff) <= -1
										&& (((Class23) class23).anInt234
												+ i_49_ < Class300.anInt4051)
										&& (((Class23) class23).anInt204
												+ i_50_ >= 0)
										&& ((Class108_Sub12.anInt6228 ^ 0xffffffff) < (((Class23) class23).anInt241
												+ i_50_ ^ 0xffffffff)))
									Class361.aClass84_4700.method589(
											(byte) -13,
											new Class11_Sub51(i_47_));
							} else
								Class361.aClass84_4700.method589((byte) -13,
										new Class11_Sub51(i_47_));
						}
					}
					Class168.aClass280_2160.method1724(64, (byte) -16, 128);
					((Class146) Class11_Sub2_Sub15.aClass146_9023).anInt1987 = 2;
					Class11_Sub2_Sub15.aClass146_9023.method911(-91);
				}
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qt.E("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_1_ + ')'));
		}
	}

	Class11_Sub45_Sub16_Sub2(Interface5 interface5, Object object, int i) {
		super(interface5, i);
		try {
			anObject10163 = object;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qt.<init>("
					+ (interface5 != null ? "{...}" : "null") + ','
					+ (object != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final boolean method3931(int i, int i_51_) {
		try {
			if (i != 8071)
				return false;
			anInt10166++;
			if (i_51_ == 3 || (i_51_ ^ 0xffffffff) == -14
					|| (i_51_ ^ 0xffffffff) == -59
					|| (i_51_ ^ 0xffffffff) == -9 || i_51_ == 1001)
				return true;
			if ((i_51_ ^ 0xffffffff) == -52 || (i_51_ ^ 0xffffffff) == -1005)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qt.C(" + i + ','
					+ i_51_ + ')');
		}
	}

	/* synthetic */static Class getClassByName(String string) {
		try {
			System.out.println(string);
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
