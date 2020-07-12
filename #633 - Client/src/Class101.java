/* Class101 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class101 {
	int anInt1333 = -1;
	private String[] aStringArray1334;
	private String aString1335;
	static int anInt1336;
	private int[] anIntArray1337;
	private String aString1338;
	static int anInt1339;
	private Class213 aClass213_1340;
	static int anInt1341;
	private int[] anIntArray1342;
	private int[] anIntArray1343;
	private int[] anIntArray1344;
	static int anInt1345;
	static int anInt1346;
	private int[] anIntArray1347;
	static int anInt1348;
	private int[][] anIntArrayArray1349;
	static int anInt1350;
	static int[] anIntArray1351 = new int[200];
	private int[][] anIntArrayArray1352;
	private int[] anIntArray1353;
	private String[] aStringArray1354;
	private int[] anIntArray1355;
	private int[] anIntArray1356;
	static int anInt1357 = 0;
	private int[][] anIntArrayArray1358;

	static final void method670(byte i) {
		try {
			anInt1336++;
			if (!Class108_Sub2.method2268(Class285.anInt3846, (byte) -90)
					&& !Class221.method1416(Class285.anInt3846, -8714)) {
				int i_0_ = ((((Actor) Class11_Sub2_Sub8.myPlayer).anIntArray10370[0]) >> 3);
				int i_1_ = ((((Actor) Class11_Sub2_Sub8.myPlayer).anIntArray10376[0]) >> 3);
				if ((i_0_ ^ 0xffffffff) > -1 || Class300.anInt4051 >> 3 <= i_0_
						|| i_1_ < 0 || i_1_ >= Class108_Sub12.anInt6228 >> 3)
					Class256_Sub1.method2340(Class108_Sub12.anInt6228 >> 4,
							Class300.anInt4051 >> 4, 16777215, 0);
				else
					Class256_Sub1.method2340(i_1_, i_0_, 16777215, 5000);
			} else
				Class256_Sub1.method2340(Class303.anInt4088 >> 12,
						Class11_Sub45_Sub11.anInt9157 >> 12, 16777215, 5000);
			if (i < -46) {
				Class376_Sub1.method2275(5);
				Class351.method2103(-5100);
				Class11_Sub2_Sub28.method3718(126);
				Class38.method329(27920);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cj.A(" + i + ')');
		}
	}

	static final void method671(byte i) {
		do {
			try {
				int i_2_ = 125 / ((i + 47) / 50);
				for (int i_3_ = 0; Class376_Sub7_Sub3_Sub1.anInt9863 > i_3_; i_3_++) {
					Class56 class56 = Class343.aClass56Array4543[i_3_];
					boolean bool = false;
					if (((Class56) class56).aClass11_Sub6_Sub4_851 != null) {
						if (!((Class56) class56).aClass11_Sub6_Sub4_851
								.method124(0))
							bool = true;
					} else {
						((Class56) class56).anInt845--;
						if ((((Class56) class56).anInt845 ^ 0xffffffff) <= ((!class56
								.method451((byte) -87) ? -10 : -1500) ^ 0xffffffff)) {
							if (((((Class56) class56).aByte844 ^ 0xffffffff) == -2)
									&& ((Class56) class56).aClass69_848 == null) {
								((Class56) class56).aClass69_848 = Class69
										.method506((Class135.aClass146_1863),
												(((Class56) class56).anInt843),
												0);
								if (((Class56) class56).aClass69_848 == null)
									continue;
								((Class56) class56).anInt845 += ((Class56) class56).aClass69_848
										.method507();
							} else if (class56.method451((byte) -87)
									&& ((((Class56) class56).aClass11_Sub13_838) == null || ((((Class56) class56).aClass11_Sub14_Sub1_842) == null))) {
								if (((Class56) class56).aClass11_Sub13_838 == null)
									((Class56) class56).aClass11_Sub13_838 = (Class11_Sub13
											.method2388(
													Class280.aClass146_3789,
													((Class56) class56).anInt843));
								if (((Class56) class56).aClass11_Sub13_838 == null)
									continue;
								if (((Class56) class56).aClass11_Sub14_Sub1_842 == null) {
									((Class56) class56).aClass11_Sub14_Sub1_842 = ((Class56) class56).aClass11_Sub13_838
											.method2398(new int[] { 22050 });
									if ((((Class56) class56).aClass11_Sub14_Sub1_842) == null)
										continue;
								}
							}
							if ((((Class56) class56).anInt845 ^ 0xffffffff) > -1) {
								int i_4_ = 8192;
								int i_5_;
								if (((Class56) class56).anInt850 == 0)
									i_5_ = (((Class56) class56).anInt847 * (((Class56) class56).aByte844 == 3 ? ((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub8_5720
											.method2462(false)
											: ((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub8_5702
													.method2462(false))) >> 2;
								else {
									int i_6_ = ((0x3f44704 & ((Class56) class56).anInt850) >> 24);
									if ((i_6_ ^ 0xffffffff) != ((((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047) ^ 0xffffffff))
										i_5_ = 0;
									else {
										int i_7_ = ((((Class56) class56).anInt850 & 0xff) << 9);
										int i_8_ = Class11_Sub2_Sub8.myPlayer
												.method3968((byte) 127) << 8;
										int i_9_ = ((((Class56) class56).anInt850 >> 16) & 0xff);
										int i_10_ = (i_8_
												+ (-(((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7045) + 256) + (i_9_ << 9));
										int i_11_ = ((0xffc2 & ((Class56) class56).anInt850) >> 8);
										int i_12_ = ((i_11_ << 9) + (256 - (((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7031) + i_8_));
										int i_13_ = (Math.abs(i_10_) - (-Math
												.abs(i_12_) + 512));
										if (i_7_ < i_13_) {
											((Class56) class56).anInt845 = -99999;
											continue;
										}
										if (i_13_ < 0)
											i_13_ = 0;
										i_5_ = (((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub8_5725
												.method2462(false)
												* (i_7_ + -i_13_)
												* ((Class56) class56).anInt847 / i_7_) >> 2;
										if ((((Class56) class56).aClass376_Sub7_839) != null
												&& ((((Class56) class56).aClass376_Sub7_839) instanceof Class376_Sub7_Sub5)) {
											Class376_Sub7_Sub5 class376_sub7_sub5 = ((Class376_Sub7_Sub5) (((Class56) class56).aClass376_Sub7_839));
											short i_14_ = (((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9626);
											short i_15_ = (((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9629);
										}
										if (i_10_ != 0 || i_12_ != 0) {
											int i_16_ = (0x3fff & (-4096 + (-Class171.anInt2193 - (int) (2607.5945876176133 * (Math
													.atan2((double) i_10_,
															(double) i_12_))))));
											if ((i_16_ ^ 0xffffffff) < -8193)
												i_16_ = 16384 + -i_16_;
											int i_17_;
											if (i_13_ <= 0)
												i_17_ = 8192;
											else if (i_13_ >= 4096)
												i_17_ = 16384;
											else
												i_17_ = ((-i_13_ + 8192) / 4096 + 8192);
											i_4_ = (i_16_ * i_17_ / 8192 + (16384 + -i_17_ >> 1));
										}
									}
								}
								if ((i_5_ ^ 0xffffffff) < -1) {
									Class11_Sub14_Sub1 class11_sub14_sub1 = null;
									if ((((Class56) class56).aByte844 ^ 0xffffffff) != -2) {
										if (class56.method451((byte) -87))
											class11_sub14_sub1 = (((Class56) class56).aClass11_Sub14_Sub1_842);
									} else
										class11_sub14_sub1 = (((Class56) class56).aClass69_848
												.method504()
												.method3654(Class11_Sub33.aClass165_6902));
									Class11_Sub6_Sub4 class11_sub6_sub4 = (((Class56) class56).aClass11_Sub6_Sub4_851 = (Class11_Sub6_Sub4
											.method3674(
													class11_sub14_sub1,
													((Class56) class56).anInt840,
													i_5_, i_4_)));
									class11_sub6_sub4.method3668(-1
											+ ((Class56) class56).anInt852);
									Class233.aClass11_Sub6_Sub1_3185
											.method3459(class11_sub6_sub4);
								}
							}
						} else
							bool = true;
					}
					if (bool) {
						Class376_Sub7_Sub3_Sub1.anInt9863--;
						for (int i_18_ = i_3_; ((Class376_Sub7_Sub3_Sub1.anInt9863 ^ 0xffffffff) < (i_18_ ^ 0xffffffff)); i_18_++)
							Class343.aClass56Array4543[i_18_] = Class343.aClass56Array4543[i_18_ + 1];
						i_3_--;
					}
				}
				anInt1346++;
				if (Class376_Sub7.aBool7049
						&& !Class11_Sub12_Sub4.method3722(-21552)) {
					if ((((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5722
							.method2462(false) ^ 0xffffffff) != -1
							&& Class11_Sub12_Sub1.anInt8828 != -1) {
						if (Class11_Sub29.aClass11_Sub6_Sub2_6591 != null)
							Class163_Sub2_Sub1
									.method3405(
											Class11_Sub12_Sub1.anInt8828,
											((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5722
													.method2462(false),
											Class58_Sub2_Sub1.aClass146_9250,
											(byte) 107,
											Class11_Sub29.aClass11_Sub6_Sub2_6591,
											false, 0);
						else
							Class91_Sub2
									.method3111(
											((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5722
													.method2462(false),
											Class11_Sub12_Sub1.anInt8828, 0,
											false,
											Class58_Sub2_Sub1.aClass146_9250, 0);
					}
					Class376_Sub7.aBool7049 = false;
					Class11_Sub29.aClass11_Sub6_Sub2_6591 = null;
				} else {
					if ((((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5722
							.method2462(false) ^ 0xffffffff) == -1
							|| (Class11_Sub12_Sub1.anInt8828 ^ 0xffffffff) == 0
							|| Class11_Sub12_Sub4.method3722(-21552))
						break;
					Class11_Sub2.anInt5041++;
					Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
							Class11_Sub3.aClass25_5113,
							Class170.aClass370_2180, (byte) 118);
					((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
							.writeInt(-49, Class11_Sub12_Sub1.anInt8828);
					Class79.method541(class11_sub10, -115);
					Class11_Sub12_Sub1.anInt8828 = -1;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "cj.F(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method672(Stream stream, int i) {
		try {
			for (;;) {
				int i_19_ = stream.readUnsignedByte((byte) 35);
				if (i_19_ == 0)
					break;
				method674(stream, i_19_, (byte) -20);
			}
			if (i > 122)
				anInt1348++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cj.D("
					+ (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method673(int i) {
		do {
			try {
				anInt1350++;
				if (aString1338 == null)
					aString1338 = aString1335;
				if (i == -16661)
					break;
				anIntArrayArray1349 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "cj.G(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method674(Stream stream, int i, byte i_20_) {
		try {
			if (i_20_ == -20) {
				anInt1341++;
				if (i != 1) {
					if (i == 2)
						aString1338 = stream.method2528(-61);
					else if ((i ^ 0xffffffff) != -4) {
						if ((i ^ 0xffffffff) != -5) {
							if (i == 5)
								stream.readUnsignedShort((byte) -65);
							else if (i != 6) {
								if (i == 7)
									stream.readUnsignedByte((byte) 35);
								else if ((i ^ 0xffffffff) != -9) {
									if ((i ^ 0xffffffff) == -10)
										stream.readUnsignedByte((byte) 35);
									else if ((i ^ 0xffffffff) == -11) {
										int i_21_ = stream
												.readUnsignedByte((byte) 35);
										anIntArray1347 = new int[i_21_];
										for (int i_22_ = 0; ((i_21_ ^ 0xffffffff) < (i_22_ ^ 0xffffffff)); i_22_++)
											anIntArray1347[i_22_] = stream
													.readInt(98);
									} else if (i == 12)
										stream.readInt(i_20_ ^ ~0x6b);
									else if ((i ^ 0xffffffff) == -14) {
										int i_23_ = stream
												.readUnsignedByte((byte) 35);
										anIntArray1337 = new int[i_23_];
										for (int i_24_ = 0; ((i_24_ ^ 0xffffffff) > (i_23_ ^ 0xffffffff)); i_24_++)
											anIntArray1337[i_24_] = stream
													.readUnsignedShort((byte) -65);
									} else if ((i ^ 0xffffffff) != -15) {
										if ((i ^ 0xffffffff) != -16) {
											if (i != 17) {
												if (i != 18) {
													if (i == 19) {
														int i_25_ = (stream
																.readUnsignedByte((byte) 35));
														anIntArray1356 = new int[i_25_];
														anIntArray1344 = new int[i_25_];
														aStringArray1354 = (new String[i_25_]);
														anIntArray1342 = new int[i_25_];
														for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
															anIntArray1356[i_26_] = (stream
																	.readInt(Class77
																			.method527(
																					i_20_,
																					-127)));
															anIntArray1344[i_26_] = (stream
																	.readInt(Class77
																			.method527(
																					i_20_,
																					-74)));
															anIntArray1342[i_26_] = (stream
																	.readInt(114));
															aStringArray1354[i_26_] = (stream
																	.readString(-1));
														}
													} else if ((i ^ 0xffffffff) == -250) {
														int i_27_ = (stream
																.readUnsignedByte((byte) 35));
														if (aClass213_1340 == null) {
															int i_28_ = (Class11_Sub2_Sub33
																	.method3808(
																			122,
																			i_27_));
															aClass213_1340 = (new Class213(
																	i_28_));
														}
														for (int i_29_ = 0; i_27_ > i_29_; i_29_++) {
															boolean bool = ((stream
																	.readUnsignedByte((byte) 35)) == 1);
															int i_30_ = (stream
																	.method2558(false));
															Class11 class11;
															if (bool)
																class11 = (new Class11_Sub3(
																		stream.readString(-1)));
															else
																class11 = (new Class11_Sub51(
																		stream.readInt(114)));
															aClass213_1340
																	.method1368(
																			(long) i_30_,
																			class11,
																			(byte) -26);
														}
													}
												} else {
													int i_31_ = (stream
															.readUnsignedByte((byte) 35));
													anIntArray1353 = new int[i_31_];
													anIntArray1355 = new int[i_31_];
													anIntArray1343 = new int[i_31_];
													aStringArray1334 = new String[i_31_];
													for (int i_32_ = 0; i_31_ > i_32_; i_32_++) {
														anIntArray1343[i_32_] = (stream
																.readInt(109));
														anIntArray1355[i_32_] = (stream
																.readInt(126));
														anIntArray1353[i_32_] = (stream
																.readInt(117));
														aStringArray1334[i_32_] = (stream
																.readString(-1));
													}
												}
											} else
												((Class101) this).anInt1333 = (stream
														.readUnsignedShort((byte) -65));
										} else
											stream.readUnsignedShort((byte) -65);
									} else {
										int i_33_ = stream
												.readUnsignedByte((byte) 35);
										anIntArrayArray1349 = new int[i_33_][2];
										for (int i_34_ = 0; i_33_ > i_34_; i_34_++) {
											anIntArrayArray1349[i_34_][0] = stream
													.readUnsignedByte((byte) 35);
											anIntArrayArray1349[i_34_][1] = stream
													.readUnsignedByte((byte) 35);
										}
									}
								}
							} else
								stream.readUnsignedByte((byte) 35);
						} else {
							int i_35_ = stream.readUnsignedByte((byte) 35);
							anIntArrayArray1358 = new int[i_35_][3];
							for (int i_36_ = 0; (i_36_ ^ 0xffffffff) > (i_35_ ^ 0xffffffff); i_36_++) {
								anIntArrayArray1358[i_36_][0] = stream
										.readUnsignedShort((byte) -65);
								anIntArrayArray1358[i_36_][1] = stream
										.readInt(i_20_ + 127);
								anIntArrayArray1358[i_36_][2] = stream
										.readInt(96);
							}
						}
					} else {
						int i_37_ = stream.readUnsignedByte((byte) 35);
						anIntArrayArray1352 = new int[i_37_][3];
						for (int i_38_ = 0; i_37_ > i_38_; i_38_++) {
							anIntArrayArray1352[i_38_][0] = stream
									.readUnsignedShort((byte) -65);
							anIntArrayArray1352[i_38_][1] = stream.readInt(112);
							anIntArrayArray1352[i_38_][2] = stream.readInt(118);
						}
					}
				} else
					aString1335 = stream.method2528(-73);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("cj.E("
					+ (stream != null ? "{...}" : "null") + ',' + i + ','
					+ i_20_ + ')'));
		}
	}

	static final int method675(int i, String string) {
		try {
			if (i != 8192)
				anIntArray1351 = null;
			anInt1345++;
			return 2 + string.length();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("cj.B(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method676(boolean bool) {
		try {
			if (bool != true)
				anIntArray1351 = null;
			anIntArray1351 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cj.C(" + bool + ')');
		}
	}

	public Class101() {
		/* empty */
	}
}
