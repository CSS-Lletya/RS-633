/* Class376_Sub7_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class376_Sub7_Sub2 extends Class376_Sub7 {
	short aShort9237;
	static int anInt9238 = 0;
	static int anInt9239;
	static int anInt9240;
	static int anInt9241;
	static int anInt9242;
	static int anInt9243;

	final boolean method2865(int i) {
		try {
			if (i >= -85)
				anInt9238 = -23;
			anInt9241++;
			return (Class11_Sub2_Sub30
					.method3792(
							((Class376_Sub7) this).aByte7039,
							843095752,
							(((Class376_Sub7) this).anInt7031 >> Class11_Sub2_Sub8.anInt8751),
							(((Class376_Sub7) this).anInt7045 >> Class11_Sub2_Sub8.anInt8751)));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lh.JA(" + i + ')');
		}
	}

	Class376_Sub7_Sub2(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		try {
			((Class376_Sub7) this).anInt7036 = i_0_;
			((Class376_Sub7) this).anInt7031 = i_1_;
			((Class376_Sub7) this).aByte7039 = (byte) i_3_;
			((Class376_Sub7_Sub2) this).aShort9237 = (short) i_4_;
			((Class376_Sub7) this).aByte7047 = (byte) i_2_;
			((Class376_Sub7) this).anInt7045 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("lh.<init>(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_
							+ ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	static final void method3610(boolean bool, int i, int i_5_, int i_6_,
			int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_,
			IComponentDefinitions[] class192s) {
		try {
			anInt9243++;
			Class321_Sub2.aClass163_6648.KA(i_8_, i_11_, i_6_, i_7_);
			if (i_5_ != -13123)
				method3610(false, -37, -104, 16, 76, -34, 124, -25, 49, 68,
						null);
			int i_13_ = 0;
			for (/**/; (class192s.length ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_13_++) {
				IComponentDefinitions class192 = class192s[i_13_];
				if (class192 != null
						&& (i == ((IComponentDefinitions) class192).anInt2593 || (i == -1412584499 && (Class11_Sub2_Sub32_Sub1.aClass192_9889 == class192)))) {
					int i_14_ = ((IComponentDefinitions) class192).anInt2469
							+ i_12_;
					int i_15_ = ((IComponentDefinitions) class192).anInt2490
							- -i_10_;
					int i_16_ = 1 + (((IComponentDefinitions) class192).anInt2610 + i_14_);
					int i_17_ = ((IComponentDefinitions) class192).anInt2546
							+ (i_15_ + 1);
					int i_18_;
					if (i_9_ != -1)
						i_18_ = i_9_;
					else {
						Class93.aRectangleArray1249[Class11_Sub2_Sub6.anInt8702]
								.setBounds(
										((IComponentDefinitions) class192).anInt2469
												+ i_12_,
										((IComponentDefinitions) class192).anInt2490
												- -i_10_,
										((IComponentDefinitions) class192).anInt2610,
										((IComponentDefinitions) class192).anInt2546);
						i_18_ = Class11_Sub2_Sub6.anInt8702++;
					}
					((IComponentDefinitions) class192).anInt2525 = i_18_;
					((IComponentDefinitions) class192).anInt2608 = Class11_Sub25.anInt6279;
					if (!client.method4010(class192)) {
						if (((IComponentDefinitions) class192).anInt2536 != 0)
							Class244.method1543(0, class192);
						int i_19_ = i_12_
								+ ((IComponentDefinitions) class192).anInt2469;
						int i_20_ = ((IComponentDefinitions) class192).anInt2490
								+ i_10_;
						int i_21_ = 0;
						int i_22_ = 0;
						if (Class11_Sub2_Sub19.aBool9087) {
							i_21_ = Class54.method443(i_5_ + 18590);
							i_22_ = Class376_Sub7_Sub4_Sub1
									.method3887((byte) -125);
						}
						int i_23_ = ((IComponentDefinitions) class192).anInt2585;
						if (Class11_Sub2_Sub14.aBool9010
								&& (((((InterfaceSettings) client
										.method4013(class192)).anInt5349) ^ 0xffffffff) != -1 || (((IComponentDefinitions) class192).anInt2531 ^ 0xffffffff) == -1)
								&& i_23_ > 127)
							i_23_ = 127;
						if (Class11_Sub2_Sub32_Sub1.aClass192_9889 == class192) {
							if ((i ^ 0xffffffff) != 1412584498
									&& ((Class138.anInt1887 == ((IComponentDefinitions) class192).anInt2557) || ((((IComponentDefinitions) class192).anInt2557 ^ 0xffffffff) == (Class204.anInt2754 ^ 0xffffffff)))) {
								Class11_Sub30.aClass192Array6614 = class192s;
								Class239_Sub2.anInt7915 = i_12_;
								Class165.anInt2139 = i_10_;
								continue;
							}
							if (Class234_Sub2_Sub2.aBool8995
									&& Class376_Sub6.aBool6950) {
								int i_24_ = (Class280.aClass225_3786
										.method1449(i_5_ + 13036) - -i_21_);
								int i_25_ = i_22_
										+ Class280.aClass225_3786
												.method1448((byte) -63);
								i_24_ -= Class15.anInt133;
								i_25_ -= Class11_Sub45_Sub16.anInt9391;
								if (i_24_ < IOException_Sub1.anInt9969)
									i_24_ = IOException_Sub1.anInt9969;
								if ((i_24_
										- -((IComponentDefinitions) class192).anInt2610 ^ 0xffffffff) < (((((IComponentDefinitions) Exception_Sub1.aClass192_9486).anInt2610) + IOException_Sub1.anInt9969) ^ 0xffffffff))
									i_24_ = ((((IComponentDefinitions) Exception_Sub1.aClass192_9486).anInt2610)
											+ IOException_Sub1.anInt9969 + -((IComponentDefinitions) class192).anInt2610);
								if (Class73.anInt1007 > i_25_)
									i_25_ = Class73.anInt1007;
								i_19_ = i_24_;
								if (i_25_
										- -((IComponentDefinitions) class192).anInt2546 > (Class73.anInt1007 - -(((IComponentDefinitions) Exception_Sub1.aClass192_9486).anInt2546)))
									i_25_ = (Class73.anInt1007 - (-(((IComponentDefinitions) Exception_Sub1.aClass192_9486).anInt2546) - -(((IComponentDefinitions) class192).anInt2546)));
								i_20_ = i_25_;
							}
							if ((((IComponentDefinitions) class192).anInt2557 ^ 0xffffffff) == (Class204.anInt2754 ^ 0xffffffff))
								i_23_ = 128;
						}
						int i_26_;
						int i_27_;
						int i_28_;
						int i_29_;
						if (((IComponentDefinitions) class192).anInt2531 == 2) {
							i_27_ = i_11_;
							i_28_ = i_6_;
							i_29_ = i_7_;
							i_26_ = i_8_;
						} else {
							int i_30_ = i_19_
									+ ((IComponentDefinitions) class192).anInt2610;
							int i_31_ = i_20_
									+ ((IComponentDefinitions) class192).anInt2546;
							i_26_ = i_8_ >= i_19_ ? i_8_ : i_19_;
							if ((((IComponentDefinitions) class192).anInt2531 ^ 0xffffffff) == -10) {
								i_31_++;
								i_30_++;
							}
							i_27_ = ((i_11_ ^ 0xffffffff) <= (i_20_ ^ 0xffffffff) ? i_11_
									: i_20_);
							i_28_ = ((i_30_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff) ? i_30_
									: i_6_);
							i_29_ = ((i_31_ ^ 0xffffffff) <= (i_7_ ^ 0xffffffff) ? i_7_
									: i_31_);
						}
						if ((i_28_ ^ 0xffffffff) < (i_26_ ^ 0xffffffff)
								&& (i_29_ ^ 0xffffffff) < (i_27_ ^ 0xffffffff)) {
							if (((IComponentDefinitions) class192).anInt2536 != 0) {
								if ((Class78.anInt1056 == ((IComponentDefinitions) class192).anInt2536)
										|| ((((IComponentDefinitions) class192).anInt2536 ^ 0xffffffff) == (Class11_Sub7.anInt5251 ^ 0xffffffff))) {
									Class330.method1996(i_19_, i_20_, class192,
											0);
									if (!Class11_Sub2_Sub19.aBool9087) {
										Class11_Sub2_Sub30
												.method3794(
														(((IComponentDefinitions) class192).anInt2536 == Class11_Sub7.anInt5251),
														((IComponentDefinitions) class192).anInt2546,
														((IComponentDefinitions) class192).anInt2610,
														(byte) -128, i_19_,
														i_20_);
										Class321_Sub2.aClass163_6648.KA(i_8_,
												i_11_, i_6_, i_7_);
									}
									Class11_Sub45.aBoolArray7907[i_18_] = true;
									continue;
								}
								if ((((IComponentDefinitions) class192).anInt2536 ^ 0xffffffff) == (Class119.anInt1619 ^ 0xffffffff)) {
									if (class192.method1254((byte) 117,
											(Class321_Sub2.aClass163_6648)) != null) {
										Class34.method304((byte) -126);
										Class183.method1200(i_20_,
												(Class321_Sub2.aClass163_6648),
												1, i_19_, class192);
										Class254.aBoolArray3493[i_18_] = true;
										Class321_Sub2.aClass163_6648.KA(i_8_,
												i_11_, i_6_, i_7_);
										if (Class11_Sub2_Sub19.aBool9087) {
											if (bool)
												Class11.method123(i_17_, i_16_,
														(byte) -98, i_14_,
														i_15_);
											else
												Class108_Sub20.method2936(
														i_16_, i_17_, -1,
														i_14_, i_15_);
										}
									}
									continue;
								}
								if ((Class199.anInt2697 ^ 0xffffffff) == (((IComponentDefinitions) class192).anInt2536 ^ 0xffffffff)) {
									if (class192.method1254((byte) 120,
											(Class321_Sub2.aClass163_6648)) != null) {
										Class75_Sub2.method2917(i_20_,
												(byte) -98, i_19_, class192);
										Class254.aBoolArray3493[i_18_] = true;
										Class321_Sub2.aClass163_6648.KA(i_8_,
												i_11_, i_6_, i_7_);
										if (Class11_Sub2_Sub19.aBool9087) {
											if (bool)
												Class11.method123(i_17_, i_16_,
														(byte) -77, i_14_,
														i_15_);
											else
												Class108_Sub20.method2936(
														i_16_, i_17_, -1,
														i_14_, i_15_);
										}
									}
									continue;
								}
								if ((Class181.anInt2335 ^ 0xffffffff) == (((IComponentDefinitions) class192).anInt2536 ^ 0xffffffff)) {
									Class203.method1292(
											((IComponentDefinitions) class192).anInt2610,
											(byte) -80,
											Class321_Sub2.aClass163_6648,
											i_20_,
											i_19_,
											Class24.anInterface1_252,
											((IComponentDefinitions) class192).anInt2546);
									Class11_Sub45.aBoolArray7907[i_18_] = true;
									Class321_Sub2.aClass163_6648.KA(i_8_,
											i_11_, i_6_, i_7_);
									continue;
								}
								if ((Class331.anInt4395 ^ 0xffffffff) == (((IComponentDefinitions) class192).anInt2536 ^ 0xffffffff)) {
									Class359.method2136(
											i_19_,
											Class321_Sub2.aClass163_6648,
											((IComponentDefinitions) class192).anInt2546,
											i_20_,
											(byte) 101,
											((IComponentDefinitions) class192).anInt2610);
									Class11_Sub45.aBoolArray7907[i_18_] = true;
									Class321_Sub2.aClass163_6648.KA(i_8_,
											i_11_, i_6_, i_7_);
									continue;
								}
								if ((Class73.anInt1014 ^ 0xffffffff) == (((IComponentDefinitions) class192).anInt2536 ^ 0xffffffff)) {
									if (Class107.aBool1454 || Class4.aBool27) {
										int i_32_ = i_19_
												- -(((IComponentDefinitions) class192).anInt2610);
										if (Class11_Sub2_Sub19.aBool9087) {
											if (!bool)
												Class108_Sub20.method2936(
														i_16_, i_17_, -1,
														i_14_, i_15_);
											else
												Class11.method123(i_17_, i_16_,
														(byte) -92, i_14_,
														i_15_);
										}
										int i_33_ = i_20_ + 15;
										if (Class107.aBool1454) {
											int i_34_ = -256;
											if ((Class11_Sub2_Sub11.anInt8855 ^ 0xffffffff) > -21)
												i_34_ = -65536;
											OutputStream_Sub2.aClass107_7949
													.method716(
															(byte) -88,
															-1,
															i_32_,
															"Fps:"
																	+ (Class11_Sub2_Sub11.anInt8855),
															i_34_, i_33_);
											i_33_ += 15;
											Runtime runtime = Runtime
													.getRuntime();
											int i_35_ = (int) ((runtime
													.totalMemory() - runtime
													.freeMemory()) / 1024L);
											int i_36_ = -256;
											if (i_35_ > 98304) {
												if (Class147.aBool1992) {
													Class11_Sub39
															.method2927(false);
													for (int i_37_ = 0; i_37_ < 10; i_37_++)
														System.gc();
													i_35_ = (int) (((runtime
															.totalMemory()) - (runtime
															.freeMemory())) / 1024L);
													if (i_35_ > 65536)
														Class11_Sub2_Sub28
																.method3715(
																		true,
																		4,
																		"WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
												}
												i_36_ = -65536;
											}
											OutputStream_Sub2.aClass107_7949
													.method716((byte) -104, -1,
															i_32_, "Mem:"
																	+ i_35_
																	+ "k",
															i_36_, i_33_);
											i_33_ += 15;
											OutputStream_Sub2.aClass107_7949
													.method716(
															(byte) -103,
															-1,
															i_32_,
															("In:"
																	+ Class228.anInt3147
																	+ "B/s Out:"
																	+ Class266.anInt3623 + "B/s"),
															-256, i_33_);
											i_33_ += 15;
											int i_38_ = (Class321_Sub2.aClass163_6648
													.E() / 1024);
											OutputStream_Sub2.aClass107_7949
													.method716(
															(byte) -84,
															-1,
															i_32_,
															"Offheap:" + i_38_
																	+ "k",
															i_38_ > 65536 ? -65536
																	: -256,
															i_33_);
											i_33_ += 15;
											int i_39_ = 0;
											int i_40_ = 0;
											int i_41_ = 0;
											for (int i_42_ = 0; (i_42_ ^ 0xffffffff) > -38; i_42_++) {
												if ((Class11_Sub2_Sub31.aClass19_Sub1Array9644[i_42_]) != null) {
													i_39_ += Class11_Sub2_Sub31.aClass19_Sub1Array9644[i_42_]
															.method2469(0);
													i_40_ += (Class11_Sub2_Sub31.aClass19_Sub1Array9644[i_42_]
															.method2474(true));
													i_41_ += (Class11_Sub2_Sub31.aClass19_Sub1Array9644[i_42_]
															.method2470(false));
												}
											}
											int i_43_ = i_41_ * 100 / i_39_;
											int i_44_ = i_40_ * 10000 / i_39_;
											String string = ("Cache:"
													+ (Class142.method897(
															(byte) 113, true,
															0, (long) i_44_, 2))
													+ "% (" + i_43_ + "%)");
											Class298.aClass107_4028.method716(
													(byte) -95, -1, i_32_,
													string, -256, i_33_);
											i_33_ += 12;
										}
										if (Class305.anInt4104 > 0)
											Class298.aClass107_4028
													.method716(
															(byte) -114,
															-1,
															i_32_,
															("Particles: "
																	+ Class140.anInt1897
																	+ " / " + Class305.anInt4104),
															-256, i_33_);
										i_33_ += 12;
										if (Class4.aBool27) {
											Class298.aClass107_4028
													.method716(
															(byte) -116,
															-1,
															i_32_,
															("Polys: "
																	+ Class321_Sub2.aClass163_6648
																			.I()
																	+ " Models: " + Class321_Sub2.aClass163_6648
																	.M()),
															-256, i_33_);
											i_33_ += 12;
											Class298.aClass107_4028
													.method716(
															(byte) -114,
															-1,
															i_32_,
															("Ls: "
																	+ OutgoingPacket.anInt4857
																	+ " La: "
																	+ Class79.anInt1066
																	+ " NPC: "
																	+ Class11_Sub6_Sub2.anInt8905
																	+ " Pl: " + Class376_Sub3.anInt6120),
															-256, i_33_);
											i_33_ += 12;
											Class116.method763((byte) -101);
										}
										Class11_Sub45.aBoolArray7907[i_18_] = true;
									}
									continue;
								}
							}
							if (((IComponentDefinitions) class192).anInt2531 == 0) {
								if ((Class362.anInt4715 == ((IComponentDefinitions) class192).anInt2536)
										&& Class321_Sub2.aClass163_6648
												.method1086())
									Class321_Sub2.aClass163_6648
											.method1083(
													i_19_,
													i_20_,
													((IComponentDefinitions) class192).anInt2610,
													((IComponentDefinitions) class192).anInt2546);
								method3610(
										bool,
										((IComponentDefinitions) class192).anInt2471,
										-13123,
										i_28_,
										i_29_,
										i_26_,
										i_18_,
										i_20_
												+ -(((IComponentDefinitions) class192).anInt2588),
										i_27_,
										(-((IComponentDefinitions) class192).anInt2561 + i_19_),
										class192s);
								if (((IComponentDefinitions) class192).aClass192Array2524 != null)
									method3610(
											bool,
											((IComponentDefinitions) class192).anInt2471,
											-13123,
											i_28_,
											i_29_,
											i_26_,
											i_18_,
											-(((IComponentDefinitions) class192).anInt2588)
													+ i_20_,
											i_27_,
											-(((IComponentDefinitions) class192).anInt2561)
													+ i_19_,
											(((IComponentDefinitions) class192).aClass192Array2524));
								Class11_Sub24 class11_sub24 = ((Class11_Sub24) (Class75_Sub2.aClass213_7160
										.method1369(
												(byte) 26,
												(long) (((IComponentDefinitions) class192).anInt2471))));
								if (class11_sub24 != null)
									Class261.method1665(
											50,
											i_27_,
											i_20_,
											i_28_,
											i_26_,
											(((Class11_Sub24) class11_sub24).anInt6233),
											i_19_, i_18_, i_29_);
								if (((Class362.anInt4715 ^ 0xffffffff) == (((IComponentDefinitions) class192).anInt2536 ^ 0xffffffff))
										&& Class321_Sub2.aClass163_6648
												.method1086())
									Class321_Sub2.aClass163_6648.method1070();
								Class321_Sub2.aClass163_6648.KA(i_8_, i_11_,
										i_6_, i_7_);
							}
							if (Class363.aBoolArray4732[i_18_]
									|| Class11_Sub2_Sub31.anInt9640 > 1) {
								if (((IComponentDefinitions) class192).anInt2531 == 3) {
									if ((i_23_ ^ 0xffffffff) != -1) {
										if (((IComponentDefinitions) class192).aBool2542)
											Class321_Sub2.aClass163_6648
													.aa(i_19_,
															i_20_,
															(((IComponentDefinitions) class192).anInt2610),
															(((IComponentDefinitions) class192).anInt2546),
															((0xffffff & (((IComponentDefinitions) class192).anInt2577)) | (-(0xff & i_23_) + 255 << 24)),
															1);
										else
											Class321_Sub2.aClass163_6648
													.method1051(
															i_19_,
															i_20_,
															(((IComponentDefinitions) class192).anInt2610),
															(((IComponentDefinitions) class192).anInt2546),
															((((IComponentDefinitions) class192).anInt2577) & 0xffffff | (-(0xff & i_23_) + 255 << 24)),
															1);
									} else if (((IComponentDefinitions) class192).aBool2542)
										Class321_Sub2.aClass163_6648
												.aa(i_19_,
														i_20_,
														((IComponentDefinitions) class192).anInt2610,
														((IComponentDefinitions) class192).anInt2546,
														((IComponentDefinitions) class192).anInt2577,
														0);
									else
										Class321_Sub2.aClass163_6648
												.method1051(
														i_19_,
														i_20_,
														((IComponentDefinitions) class192).anInt2610,
														((IComponentDefinitions) class192).anInt2546,
														((IComponentDefinitions) class192).anInt2577,
														0);
									if (Class11_Sub2_Sub19.aBool9087) {
										if (bool)
											Class11.method123(i_17_, i_16_,
													(byte) -92, i_14_, i_15_);
										else
											Class108_Sub20.method2936(i_16_,
													i_17_, -1, i_14_, i_15_);
									}
								} else if ((((IComponentDefinitions) class192).anInt2531 ^ 0xffffffff) == -5) {
									Class107 class107 = (class192.method1252(
											Class321_Sub2.aClass163_6648, i_5_
													^ ~0x3342));
									if (class107 == null) {
										if (Class376_Sub7_Sub3_Sub2.aBool10145)
											Class232.method1484(class192, 1);
									} else {
										int i_45_ = ((IComponentDefinitions) class192).anInt2577;
										String string = (((IComponentDefinitions) class192).aString2481);
										if (((IComponentDefinitions) class192).anInt2467 != -1) {
											Class249 class249 = (Packet.aClass223_8723
													.method1430(
															(((IComponentDefinitions) class192).anInt2467),
															false));
											string = (((Class249) class249).aString3359);
											if (string == null)
												string = "null";
											if ((((((Class249) class249).anInt3416) ^ 0xffffffff) == -2 || (((IComponentDefinitions) class192).anInt2572) != 1)
													&& (((IComponentDefinitions) class192).anInt2572) != -1)
												string = ("<col=ff9040>"
														+ string + "</col> x" + (Class65
														.method488(
																(((IComponentDefinitions) class192).anInt2572),
																i_5_ + 13215)));
										}
										if ((((IComponentDefinitions) class192).anInt2552 ^ 0xffffffff) != 0) {
											string = (Class11_Sub45_Sub16
													.method3702(
															false,
															(((IComponentDefinitions) class192).anInt2552)));
											if (string == null)
												string = "";
										}
										if (class192 == Class72.aClass192_1004) {
											string = (Class26.aClass26_307
													.method217(
															(byte) 119,
															(Class11_Sub45_Sub1_Sub2.anInt9884)));
											i_45_ = (((IComponentDefinitions) class192).anInt2577);
										}
										if (Class11_Sub52.aBool8051)
											Class321_Sub2.aClass163_6648
													.T(i_19_,
															i_20_,
															i_19_
																	+ (((IComponentDefinitions) class192).anInt2610),
															i_20_
																	+ (((IComponentDefinitions) class192).anInt2546));
										class107.method710(
												((IComponentDefinitions) class192).anInt2543,
												111,
												(Class376_Sub7_Sub1_Sub1.aClass253Array10081),
												((IComponentDefinitions) class192).anInt2476,
												0,
												((IComponentDefinitions) class192).anInt2607,
												0,
												((IComponentDefinitions) class192).anInt2610,
												(!((IComponentDefinitions) class192).aBool2509 ? -1
														: 255 + -(0xff & i_23_) << 24),
												((IComponentDefinitions) class192).anInt2589,
												i_20_,
												((IComponentDefinitions) class192).anInt2546,
												null,
												(i_45_ | -(i_23_ & 0xff) + 255 << 24),
												string, i_19_, null);
										if (Class11_Sub52.aBool8051)
											Class321_Sub2.aClass163_6648.KA(
													i_8_, i_11_, i_6_, i_7_);
										if (string.trim().length() > 0) {
											if (Class11_Sub52.aBool8051) {
												if (Class11_Sub2_Sub19.aBool9087) {
													if (bool)
														Class11.method123(
																i_17_, i_16_,
																(byte) -85,
																i_14_, i_15_);
													else
														Class108_Sub20
																.method2936(
																		i_16_,
																		i_17_,
																		-1,
																		i_14_,
																		i_15_);
												}
											} else {
												Class292 class292 = (Class42
														.method376(
																-78,
																(Class321_Sub2.aClass163_6648),
																(((IComponentDefinitions) class192).anInt2488)));
												int i_46_ = (class292
														.method1811(
																174,
																(((IComponentDefinitions) class192).anInt2610),
																string,
																(Class376_Sub7_Sub1_Sub1.aClass253Array10081)));
												int i_47_ = (class292
														.method1809(
																0,
																string,
																(((IComponentDefinitions) class192).anInt2610),
																(((IComponentDefinitions) class192).anInt2476),
																(Class376_Sub7_Sub1_Sub1.aClass253Array10081)));
												if (Class11_Sub2_Sub19.aBool9087) {
													if (!bool)
														Class108_Sub20
																.method2936(
																		i_46_
																				+ i_19_,
																		i_47_
																				+ i_20_,
																		-1,
																		i_19_,
																		i_20_);
													else
														Class11.method123(i_20_
																+ i_47_, i_46_
																+ i_19_,
																(byte) -114,
																i_19_, i_20_);
												}
											}
										}
									}
								} else if ((((IComponentDefinitions) class192).anInt2531 ^ 0xffffffff) == -6) {
									if (((IComponentDefinitions) class192).anInt2603 < 0) {
										Class253 class253;
										if (((IComponentDefinitions) class192).anInt2467 != -1) {
											Class258 class258 = ((((IComponentDefinitions) class192).aBool2485) ? (((Player) (Class11_Sub2_Sub8.myPlayer)).aClass258_10418)
													: null);
											class253 = (Packet.aClass223_8723
													.method1420(
															(Class321_Sub2.aClass163_6648),
															(((IComponentDefinitions) class192).anInt2554)
																	| ~0xffffff,
															(((IComponentDefinitions) class192).anInt2474),
															(((IComponentDefinitions) class192).anInt2466),
															class258,
															(byte) -100,
															(((IComponentDefinitions) class192).anInt2572),
															(((IComponentDefinitions) class192).anInt2467)));
										} else if (((((IComponentDefinitions) class192).anInt2552) ^ 0xffffffff) == 0)
											class253 = (class192
													.method1248(
															(Class321_Sub2.aClass163_6648),
															-1));
										else
											class253 = (Class161
													.method997(
															2107742921,
															(((IComponentDefinitions) class192).anInt2552),
															(Class321_Sub2.aClass163_6648)));
										if (class253 == null) {
											if (Class376_Sub7_Sub3_Sub2.aBool10145)
												Class232.method1484(class192, 1);
										} else {
											int i_48_ = class253.method1608();
											int i_49_ = class253.method1622();
											int i_50_ = ((((((IComponentDefinitions) class192).anInt2577) ^ 0xffffffff) == -1 ? 16777215
													: (0xffffff & (((IComponentDefinitions) class192).anInt2577))) | (255 + -(0xff & i_23_) << 24));
											if (!((IComponentDefinitions) class192).aBool2482) {
												if ((((IComponentDefinitions) class192).anInt2577) != 0
														|| i_23_ != 0) {
													if ((((IComponentDefinitions) class192).anInt2587) == 0) {
														if ((i_48_ == (((IComponentDefinitions) class192).anInt2610))
																&& (i_49_ == (((IComponentDefinitions) class192).anInt2546)))
															class253.method1624(
																	i_19_,
																	i_20_, 0,
																	i_50_, 1);
														else
															class253.method1606(
																	i_19_,
																	i_20_,
																	(((IComponentDefinitions) class192).anInt2610),
																	(((IComponentDefinitions) class192).anInt2546),
																	0, i_50_, 1);
													} else
														class253.method1621(
																(((float) (((IComponentDefinitions) class192).anInt2610) / 2.0F) + (float) i_19_),
																((float) i_20_ + ((float) (((IComponentDefinitions) class192).anInt2546) / 2.0F)),
																(4096 * (((IComponentDefinitions) class192).anInt2610) / i_48_),
																(((IComponentDefinitions) class192).anInt2587),
																0, i_50_, 1);
												} else if (((IComponentDefinitions) class192).anInt2587 != 0)
													class253.method1616(
															((float) i_19_ + ((float) (((IComponentDefinitions) class192).anInt2610) / 2.0F)),
															(((float) (((IComponentDefinitions) class192).anInt2546) / 2.0F) + (float) i_20_),
															(4096 * (((IComponentDefinitions) class192).anInt2610) / i_48_),
															(((IComponentDefinitions) class192).anInt2587));
												else if (((((IComponentDefinitions) class192).anInt2610 ^ 0xffffffff) != (i_48_ ^ 0xffffffff))
														|| (((((IComponentDefinitions) class192).anInt2546) ^ 0xffffffff) != (i_49_ ^ 0xffffffff)))
													class253.method1620(
															i_19_,
															i_20_,
															(((IComponentDefinitions) class192).anInt2610),
															(((IComponentDefinitions) class192).anInt2546));
												else
													class253.method1610(i_19_,
															i_20_);
											} else {
												Class321_Sub2.aClass163_6648
														.T(i_19_,
																i_20_,
																(i_19_ - -(((IComponentDefinitions) class192).anInt2610)),
																(((IComponentDefinitions) class192).anInt2546)
																		+ i_20_);
												if (((((IComponentDefinitions) class192).anInt2587) ^ 0xffffffff) == -1) {
													if (((((IComponentDefinitions) class192).anInt2577) ^ 0xffffffff) != -1
															|| i_23_ != 0)
														class253.method1625(
																i_19_,
																i_20_,
																(((IComponentDefinitions) class192).anInt2610),
																(((IComponentDefinitions) class192).anInt2546),
																0, i_50_, 1);
													else
														class253.method1618(
																i_19_,
																i_20_,
																(((IComponentDefinitions) class192).anInt2610),
																(((IComponentDefinitions) class192).anInt2546));
												} else {
													int i_51_ = ((i_48_ + (-1 + (((IComponentDefinitions) class192).anInt2610))) / i_48_);
													int i_52_ = ((-1 + (i_49_ + (((IComponentDefinitions) class192).anInt2546))) / i_49_);
													for (int i_53_ = 0; ((i_53_ ^ 0xffffffff) > (i_51_ ^ 0xffffffff)); i_53_++) {
														for (int i_54_ = 0; ((i_54_ ^ 0xffffffff) > (i_52_ ^ 0xffffffff)); i_54_++) {
															if ((((IComponentDefinitions) class192).anInt2577) != 0)
																class253.method1621(
																		(((float) i_48_ / 2.0F) + (float) (i_19_ - -(i_48_ * i_53_))),
																		(((float) i_49_ / 2.0F) + (float) (i_20_ + i_49_
																				* i_54_)),
																		4096,
																		(((IComponentDefinitions) class192).anInt2587),
																		0,
																		i_50_,
																		1);
															else
																class253.method1616(
																		((float) (i_19_ - -(i_48_ * i_53_)) + ((float) i_48_ / 2.0F)),
																		((float) (i_49_
																				* i_54_ + i_20_) + ((float) i_49_ / 2.0F)),
																		4096,
																		(((IComponentDefinitions) class192).anInt2587));
														}
													}
												}
												Class321_Sub2.aClass163_6648
														.KA(i_8_, i_11_, i_6_,
																i_7_);
											}
										}
									} else
										class192.method1246(-117,
												Class233.aClass379_3181,
												Class179.aClass154_2279)
												.method893(
														0,
														(((IComponentDefinitions) class192).anInt2510 << 3),
														i_20_,
														5063,
														0,
														(((IComponentDefinitions) class192).anInt2486 << 3),
														i_19_,
														((IComponentDefinitions) class192).anInt2546,
														((IComponentDefinitions) class192).anInt2610,
														Class321_Sub2.aClass163_6648);
									if (Class11_Sub2_Sub19.aBool9087) {
										if (!bool)
											Class108_Sub20.method2936(i_16_,
													i_17_, i_5_ ^ 0x3342,
													i_14_, i_15_);
										else
											Class11.method123(i_17_, i_16_,
													(byte) -76, i_14_, i_15_);
									}
								} else if ((((IComponentDefinitions) class192).anInt2531 ^ 0xffffffff) == -7) {
									Class1.method64((byte) 126);
									Class206 class206 = null;
									int i_55_ = 0;
									if (((IComponentDefinitions) class192).anInt2467 == -1) {
										if (((IComponentDefinitions) class192).anInt2597 == 5) {
											int i_56_ = (((IComponentDefinitions) class192).anInt2512);
											if (i_56_ >= 0 && i_56_ < 2048) {
												Player class376_sub7_sub5_sub5_sub1 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_56_]);
												Class281 class281 = (((((IComponentDefinitions) class192).anInt2491) ^ 0xffffffff) != 0 ? (Class108_Sub23.aClass198_7760
														.method1284(
																(((IComponentDefinitions) class192).anInt2491),
																(byte) 95))
														: null);
												if ((class376_sub7_sub5_sub5_sub1 != null)
														&& (((i_56_ ^ 0xffffffff) == ((Class11_Sub44.anInt7791) ^ 0xffffffff)) || ((Class11_Sub2_Sub30
																.method3795(
																		(((Player) class376_sub7_sub5_sub5_sub1).aString10400),
																		-27550)) == (((IComponentDefinitions) class192).anInt2562))))
													class206 = (((Player) class376_sub7_sub5_sub5_sub1).aClass258_10418
															.method1646(
																	(((IComponentDefinitions) class192).anInt2502),
																	2048,
																	null,
																	-1,
																	0,
																	(Packet.aClass223_8723),
																	0,
																	(Class108_Sub26.aClass127_7833),
																	(Class321_Sub2.aClass163_6648),
																	0,
																	class281,
																	null,
																	(((IComponentDefinitions) class192).anInt2545),
																	(Class2.aClass221_18),
																	(Class108_Sub23.aClass198_7760),
																	true,
																	null,
																	(((IComponentDefinitions) class192).anInt2539),
																	(Class11_Sub19.aClass318_5817),
																	(Class11_Sub26.aClass97_6296),
																	i_5_
																			^ ~0x3342));
											}
										} else if (((((IComponentDefinitions) class192).anInt2597) ^ 0xffffffff) != -9
												&& (((IComponentDefinitions) class192).anInt2597) != 9) {
											if (((IComponentDefinitions) class192).anInt2491 != -1) {
												Class281 class281 = (Class108_Sub23.aClass198_7760
														.method1284(
																(((IComponentDefinitions) class192).anInt2491),
																(byte) 111));
												class206 = (class192
														.method1247(
																(Class11_Sub26.aClass97_6296),
																(((IComponentDefinitions) class192).anInt2545),
																(((IComponentDefinitions) class192).anInt2539),
																class281,
																(Class11_Sub19.aClass318_5817),
																(Packet.aClass223_8723),
																(((Player) (Class11_Sub2_Sub8.myPlayer)).aClass258_10418),
																15859,
																2048,
																Class2.aClass221_18,
																(Class108_Sub23.aClass198_7760),
																(Class108_Sub26.aClass127_7833),
																(Class321_Sub2.aClass163_6648),
																(((IComponentDefinitions) class192).anInt2502)));
												if (class206 == null
														&& (Class376_Sub7_Sub3_Sub2.aBool10145))
													Class232.method1484(
															class192, 1);
											} else {
												class206 = (class192
														.method1247(
																(Class11_Sub26.aClass97_6296),
																-1,
																-1,
																null,
																(Class11_Sub19.aClass318_5817),
																(Packet.aClass223_8723),
																(((Player) (Class11_Sub2_Sub8.myPlayer)).aClass258_10418),
																15859,
																2048,
																Class2.aClass221_18,
																(Class108_Sub23.aClass198_7760),
																(Class108_Sub26.aClass127_7833),
																(Class321_Sub2.aClass163_6648),
																0));
												if (class206 == null
														&& (Class376_Sub7_Sub3_Sub2.aBool10145))
													Class232.method1484(
															class192, 1);
											}
										} else {
											Class11_Sub37 class11_sub37 = (Class26
													.method218(
															false,
															-9854,
															(((IComponentDefinitions) class192).anInt2512)));
											Class281 class281 = (((((IComponentDefinitions) class192).anInt2491) ^ 0xffffffff) != 0 ? (Class108_Sub23.aClass198_7760
													.method1284(
															(((IComponentDefinitions) class192).anInt2491),
															(byte) 127))
													: null);
											if (class11_sub37 != null) {
												Class258 class258 = (!(((IComponentDefinitions) class192).aBool2485) ? null
														: (((Player) (Class11_Sub2_Sub8.myPlayer)).aClass258_10418));
												class206 = (class11_sub37
														.method2889(
																((((IComponentDefinitions) class192).anInt2597) ^ 0xffffffff) == -10,
																(byte) -104,
																class281,
																(((IComponentDefinitions) class192).anInt2562),
																(Class321_Sub2.aClass163_6648),
																2048,
																(((IComponentDefinitions) class192).anInt2545),
																(((IComponentDefinitions) class192).anInt2502),
																(((IComponentDefinitions) class192).anInt2539),
																class258));
											}
										}
									} else {
										Class249 class249 = (Packet.aClass223_8723
												.method1430(
														(((IComponentDefinitions) class192).anInt2467),
														false));
										if (class249 != null) {
											class249 = (class249
													.method1577(
															(((IComponentDefinitions) class192).anInt2572),
															false));
											Class281 class281 = (((((IComponentDefinitions) class192).anInt2491) ^ 0xffffffff) != 0 ? (Class108_Sub23.aClass198_7760
													.method1284(
															(((IComponentDefinitions) class192).anInt2491),
															(byte) 124))
													: null);
											Class258 class258 = ((((IComponentDefinitions) class192).aBool2485) ? (((Player) (Class11_Sub2_Sub8.myPlayer)).aClass258_10418)
													: null);
											class206 = (class249
													.method1587(
															2048,
															false,
															(Class321_Sub2.aClass163_6648),
															class258,
															1,
															(((IComponentDefinitions) class192).anInt2545),
															class281,
															(((IComponentDefinitions) class192).anInt2502),
															(((IComponentDefinitions) class192).anInt2539)));
											if (class206 != null)
												i_55_ = -class206.fa() >> 1;
											else
												Class232.method1484(class192,
														(i_5_ + 13124));
										}
									}
									if (class206 != null) {
										int i_57_;
										if (((IComponentDefinitions) class192).anInt2616 <= 0)
											i_57_ = 512;
										else
											i_57_ = (((((IComponentDefinitions) class192).anInt2610) << 9) / (((IComponentDefinitions) class192).anInt2616));
										int i_58_;
										if ((((IComponentDefinitions) class192).anInt2580 ^ 0xffffffff) >= -1)
											i_58_ = 512;
										else
											i_58_ = (((((IComponentDefinitions) class192).anInt2546) << 9) / (((IComponentDefinitions) class192).anInt2580));
										int i_59_ = i_19_
												- -((((IComponentDefinitions) class192).anInt2610) / 2);
										int i_60_ = i_20_
												+ (((IComponentDefinitions) class192).anInt2546)
												/ 2;
										if (!((IComponentDefinitions) class192).aBool2499) {
											i_59_ += (i_57_ * (((IComponentDefinitions) class192).anInt2533)) >> 9;
											i_60_ += (((IComponentDefinitions) class192).anInt2548)
													* i_58_ >> 9;
										}
										Class236.aClass33_3224.method289();
										Class321_Sub2.aClass163_6648
												.method1080(Class236.aClass33_3224);
										Class321_Sub2.aClass163_6648.DA(i_59_,
												i_60_, i_57_, i_58_);
										Class321_Sub2.aClass163_6648.ya();
										if (((IComponentDefinitions) class192).aBool2592)
											Class321_Sub2.aClass163_6648
													.C(false);
										if (!((IComponentDefinitions) class192).aBool2499) {
											int i_61_ = ((((((IComponentDefinitions) class192).anInt2598) << 2) * (Class335.anIntArray4436[(((IComponentDefinitions) class192).anInt2496) << 3])) >> 14);
											int i_62_ = (((Class335.anIntArray4430[(((IComponentDefinitions) class192).anInt2496) << 3]) * ((((IComponentDefinitions) class192).anInt2598) << 2)) >> 14);
											Class219.aClass33_3017
													.method288(-(((IComponentDefinitions) class192).anInt2526) << 3);
											Class219.aClass33_3017
													.method293((((IComponentDefinitions) class192).anInt2578) << 3);
											Class219.aClass33_3017
													.method299(
															(((IComponentDefinitions) class192).anInt2595) << 2,
															i_55_
																	+ (i_61_ + ((((IComponentDefinitions) class192).anInt2516) << 2)),
															i_62_
																	+ (((IComponentDefinitions) class192).anInt2516 << 2));
											Class219.aClass33_3017
													.method303((((IComponentDefinitions) class192).anInt2496) << 3);
										} else {
											Class219.aClass33_3017
													.method286(((IComponentDefinitions) class192).anInt2496);
											Class219.aClass33_3017
													.method293(((IComponentDefinitions) class192).anInt2578);
											Class219.aClass33_3017
													.method297(((IComponentDefinitions) class192).anInt2526);
											Class219.aClass33_3017
													.method299(
															(((IComponentDefinitions) class192).anInt2533),
															(((IComponentDefinitions) class192).anInt2548),
															(((IComponentDefinitions) class192).anInt2470));
										}
										class192.method1262((byte) 116,
												Class11_Sub25.anInt6279,
												Class219.aClass33_3017,
												Class321_Sub2.aClass163_6648,
												class206);
										if (Class11_Sub52.aBool8051)
											Class321_Sub2.aClass163_6648
													.T(i_19_,
															i_20_,
															i_19_
																	- -((IComponentDefinitions) class192).anInt2610,
															(((IComponentDefinitions) class192).anInt2546)
																	+ i_20_);
										if (!((IComponentDefinitions) class192).aBool2499) {
											if (!((IComponentDefinitions) class192).aBool2565) {
												class206.method1321(
														Class219.aClass33_3017,
														null, 1);
												if ((((IComponentDefinitions) class192).aClass376_Sub10_2576) != null)
													Class321_Sub2.aClass163_6648
															.method1010(((IComponentDefinitions) class192).aClass376_Sub10_2576
																	.method3178());
											} else
												class206.method1329(
														Class219.aClass33_3017,
														null,
														(((IComponentDefinitions) class192).anInt2598) << 2,
														1);
										} else if (((IComponentDefinitions) class192).aBool2565)
											class206.method1329(
													Class219.aClass33_3017,
													null,
													(((IComponentDefinitions) class192).anInt2598),
													1);
										else {
											class206.method1321(
													Class219.aClass33_3017,
													null, 1);
											if ((((IComponentDefinitions) class192).aClass376_Sub10_2576) != null)
												Class321_Sub2.aClass163_6648
														.method1010(((IComponentDefinitions) class192).aClass376_Sub10_2576
																.method3178());
										}
										if (Class11_Sub52.aBool8051)
											Class321_Sub2.aClass163_6648.KA(
													i_8_, i_11_, i_6_, i_7_);
										if (((IComponentDefinitions) class192).aBool2592)
											Class321_Sub2.aClass163_6648
													.C(true);
									}
									if (Class11_Sub2_Sub19.aBool9087) {
										if (bool)
											Class11.method123(i_17_, i_16_,
													(byte) -89, i_14_, i_15_);
										else
											Class108_Sub20.method2936(i_16_,
													i_17_, -1, i_14_, i_15_);
									}
								} else if (((IComponentDefinitions) class192).anInt2531 == 9) {
									int i_63_;
									int i_64_;
									int i_65_;
									int i_66_;
									if (((IComponentDefinitions) class192).aBool2505) {
										i_66_ = i_20_;
										i_63_ = i_19_;
										i_65_ = (((IComponentDefinitions) class192).anInt2546 + i_20_);
										i_64_ = i_19_
												+ (((IComponentDefinitions) class192).anInt2610);
									} else {
										i_63_ = i_19_;
										i_64_ = (((IComponentDefinitions) class192).anInt2610 + i_19_);
										i_65_ = i_20_;
										i_66_ = (((IComponentDefinitions) class192).anInt2546 + i_20_);
									}
									if ((((IComponentDefinitions) class192).anInt2492 ^ 0xffffffff) != -2)
										Class321_Sub2.aClass163_6648
												.method1046(
														i_63_,
														i_65_,
														i_64_,
														i_66_,
														((IComponentDefinitions) class192).anInt2577,
														((IComponentDefinitions) class192).anInt2492,
														0);
									else
										Class321_Sub2.aClass163_6648
												.method1007(
														i_63_,
														i_65_,
														i_64_,
														i_66_,
														((IComponentDefinitions) class192).anInt2577,
														0);
									if (Class11_Sub2_Sub19.aBool9087) {
										if (!bool)
											Class108_Sub20.method2936(i_16_,
													i_17_, -1, i_14_, i_15_);
										else
											Class11.method123(i_17_, i_16_,
													(byte) -80, i_14_, i_15_);
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lh.C(" + bool + ','
					+ i + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_
					+ ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_
					+ ',' + (class192s != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method2869(int i) {
		try {
			anInt9240++;
			if (i != -21499)
				method2869(-20);
			return (Class11_Sub2_Sub19.aBoolArrayArray9091[(Class94_Sub4.anInt7730
					+ -Class11_Sub45_Sub7.anInt8807 + (((Class376_Sub7) this).anInt7045 >> Class11_Sub2_Sub8.anInt8751))][((((Class376_Sub7) this).anInt7031 >> Class11_Sub2_Sub8.anInt8751)
					- Class15.anInt134 + Class94_Sub4.anInt7730)]);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lh.LA(" + i + ')');
		}
	}

	final int method2859(Class11_Sub46[] class11_sub46s, int i) {
		try {
			if (i != -1)
				method2865(15);
			anInt9239++;
			return this
					.method2857(
							(((Class376_Sub7) this).anInt7045 >> Class11_Sub2_Sub8.anInt8751),
							class11_sub46s,
							(byte) -22,
							(((Class376_Sub7) this).anInt7031 >> Class11_Sub2_Sub8.anInt8751));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lh.OA("
					+ (class11_sub46s != null ? "{...}" : "null") + ',' + i
					+ ')');
		}
	}
}
