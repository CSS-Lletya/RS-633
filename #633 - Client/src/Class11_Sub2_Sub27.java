/* Class11_Sub2_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub27 extends Class11_Sub2 {
	static IncomingPacket SEND_VARP_SMALL_IN_PACKET = new IncomingPacket(7, 3);
	static int anInt9397;
	private int anInt9398;
	static int anInt9399;
	private int anInt9400;
	private int anInt9401;
	static int anInt9402;
	private int anInt9403 = 8192;
	static int anInt9404;
	static int anInt9405;
	private int anInt9406;
	private int anInt9407;
	private int anInt9408;
	static int anInt9409;
	static int anInt9410;
	static float aFloat9411 = 1.0F;

	private final boolean method3706(int i, int i_0_, int i_1_) {
		try {
			anInt9404++;
			int i_2_ = (i + i_0_) * anInt9400 >> 12;
			if (i_1_ != -956730100)
				method2256(-42);
			int i_3_ = Class191.anIntArray2457[i_2_ * 255 >> 12 & 0xff];
			i_3_ = (i_3_ << 12) / anInt9400;
			i_3_ = (i_3_ << 12) / anInt9403;
			i_3_ = i_3_ * anInt9408 >> 12;
			if (i_0_ - i >= i_3_ || -i_3_ >= -i + i_0_)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ot.G(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	public static void method3707(int i) {
		try {
			if (i >= -39)
				method3710(-89, 2);
			SEND_VARP_SMALL_IN_PACKET = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ot.F(" + i + ')');
		}
	}

	static final Class11_Sub2 method3708(int i, int i_4_) {
		try {
			anInt9399++;
			if (i > -12)
				method3707(-105);
			int i_5_ = i_4_;
			while_230_: do {
				while_229_: do {
					while_228_: do {
						while_227_: do {
							while_226_: do {
								while_225_: do {
									while_224_: do {
										while_223_: do {
											while_222_: do {
												while_221_: do {
													while_220_: do {
														while_219_: do {
															while_218_: do {
																while_217_: do {
																	while_216_: do {
																		while_215_: do {
																			while_214_: do {
																				while_213_: do {
																					while_212_: do {
																						while_211_: do {
																							while_210_: do {
																								while_209_: do {
																									while_208_: do {
																										while_207_: do {
																											while_206_: do {
																												while_205_: do {
																													while_204_: do {
																														while_203_: do {
																															while_202_: do {
																																while_201_: do {
																																	while_200_: do {
																																		while_199_: do {
																																			while_198_: do {
																																				while_197_: do {
																																					while_196_: do {
																																						while_195_: do {
																																							while_194_: do {
																																								while_193_: do {
																																									while_192_: do {
																																										do {
																																											if ((i_5_ ^ 0xffffffff) != -1) {
																																												if (i_5_ == 1)
																																													break;
																																												if ((i_5_ ^ 0xffffffff) == -3)
																																													break while_192_;
																																												if (i_5_ == 3)
																																													break while_193_;
																																												if (i_5_ == 4)
																																													break while_194_;
																																												if ((i_5_ ^ 0xffffffff) == -6)
																																													break while_195_;
																																												if (i_5_ == 6)
																																													break while_196_;
																																												if (i_5_ == 7)
																																													break while_197_;
																																												if ((i_5_ ^ 0xffffffff) == -9)
																																													break while_198_;
																																												if (i_5_ == 9)
																																													break while_199_;
																																												if ((i_5_ ^ 0xffffffff) == -11)
																																													break while_200_;
																																												if (i_5_ == 11)
																																													break while_201_;
																																												if (i_5_ == 12)
																																													break while_202_;
																																												if ((i_5_ ^ 0xffffffff) == -14)
																																													break while_203_;
																																												if ((i_5_ ^ 0xffffffff) == -15)
																																													break while_204_;
																																												if (i_5_ == 15)
																																													break while_205_;
																																												if ((i_5_ ^ 0xffffffff) == -17)
																																													break while_206_;
																																												if ((i_5_ ^ 0xffffffff) == -18)
																																													break while_207_;
																																												if (i_5_ == 18)
																																													break while_208_;
																																												if (i_5_ == 19)
																																													break while_209_;
																																												if (i_5_ == 20)
																																													break while_210_;
																																												if ((i_5_ ^ 0xffffffff) == -22)
																																													break while_211_;
																																												if (i_5_ == 22)
																																													break while_212_;
																																												if (i_5_ == 23)
																																													break while_213_;
																																												if (i_5_ == 24)
																																													break while_214_;
																																												if (i_5_ == 25)
																																													break while_215_;
																																												if (i_5_ == 26)
																																													break while_216_;
																																												if ((i_5_ ^ 0xffffffff) == -28)
																																													break while_217_;
																																												if (i_5_ == 28)
																																													break while_218_;
																																												if (i_5_ == 29)
																																													break while_219_;
																																												if ((i_5_ ^ 0xffffffff) == -31)
																																													break while_220_;
																																												if ((i_5_ ^ 0xffffffff) == -32)
																																													break while_221_;
																																												if ((i_5_ ^ 0xffffffff) == -33)
																																													break while_222_;
																																												if ((i_5_ ^ 0xffffffff) == -34)
																																													break while_223_;
																																												if (i_5_ == 34)
																																													break while_224_;
																																												if ((i_5_ ^ 0xffffffff) == -36)
																																													break while_225_;
																																												if (i_5_ == 36)
																																													break while_226_;
																																												if ((i_5_ ^ 0xffffffff) == -38)
																																													break while_227_;
																																												if (i_5_ == 38)
																																													break while_228_;
																																												if ((i_5_ ^ 0xffffffff) != -40)
																																													break while_230_;
																																												if (!client.aBool10531)
																																													break while_229_;
																																											}
																																											return new Class11_Sub2_Sub22();
																																										} while (false);
																																										return new Class11_Sub2_Sub11();
																																									} while (false);
																																									return new Class11_Sub2_Sub23();
																																								} while (false);
																																								return new Class11_Sub2_Sub37();
																																							} while (false);
																																							return new Class11_Sub2_Sub33();
																																						} while (false);
																																						return new Class11_Sub2_Sub7();
																																					} while (false);
																																					return new Class11_Sub2_Sub30();
																																				} while (false);
																																				return new Class11_Sub2_Sub35();
																																			} while (false);
																																			return new Class11_Sub2_Sub38();
																																		} while (false);
																																		return new Class11_Sub2_Sub17();
																																	} while (false);
																																	return new Class11_Sub2_Sub13();
																																} while (false);
																																return new Class11_Sub2_Sub25();
																															} while (false);
																															return new Class11_Sub2_Sub6();
																														} while (false);
																														return new Class11_Sub2_Sub24();
																													} while (false);
																													return new Class11_Sub2_Sub18();
																												} while (false);
																												return new Class11_Sub2_Sub15();
																											} while (false);
																											return new Class11_Sub2_Sub4();
																										} while (false);
																										return new Class11_Sub2_Sub3();
																									} while (false);
																									return new Class11_Sub2_Sub32_Sub1();
																								} while (false);
																								return new Class11_Sub2_Sub16();
																							} while (false);
																							return new Class11_Sub2_Sub5();
																						} while (false);
																						return new Class11_Sub2_Sub10();
																					} while (false);
																					return new Class11_Sub2_Sub34();
																				} while (false);
																				return new Class11_Sub2_Sub21();
																			} while (false);
																			return new Class11_Sub2_Sub36();
																		} while (false);
																		return new Class11_Sub2_Sub28();
																	} while (false);
																	return (new Class11_Sub2_Sub20());
																} while (false);
																return (new Class11_Sub2_Sub12());
															} while (false);
															return (new Class11_Sub2_Sub8());
														} while (false);
														return (new Class11_Sub2_Sub2());
													} while (false);
													return (new Class11_Sub2_Sub14());
												} while (false);
												return new Class11_Sub2_Sub9();
											} while (false);
											return new Class11_Sub2_Sub31();
										} while (false);
										return new Class11_Sub2_Sub1();
									} while (false);
									return new Class11_Sub2_Sub39();
								} while (false);
								return new Class11_Sub2_Sub19();
							} while (false);
							return new Class11_Sub2_Sub26();
						} while (false);
						return new Class11_Sub2_Sub27();
					} while (false);
					return new Class11_Sub2_Sub29();
				} while (false);
				return new Class11_Sub2_Sub32();
			} while (false);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ot.E(" + i + ','
					+ i_4_ + ')');
		}
	}

	public Class11_Sub2_Sub27() {
		super(0, true);
		anInt9398 = 0;
		anInt9406 = 2048;
		anInt9408 = 4096;
		anInt9407 = 2048;
		anInt9400 = 12288;
		anInt9401 = 0;
	}

	final int[] method2254(int i, boolean bool) {
		try {
			anInt9410++;
			if (bool != true)
				return null;
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
				int i_6_ = -2048 + Class171.anIntArray2199[i];
				for (int i_7_ = 0; ((i_7_ ^ 0xffffffff) > (Class33_Sub2.anInt6696 ^ 0xffffffff)); i_7_++) {
					int i_8_ = Class208.anIntArray2808[i_7_] - 2048;
					int i_9_ = i_8_ + anInt9406;
					i_9_ = (i_9_ ^ 0xffffffff) <= 2047 ? i_9_ : i_9_ + 4096;
					i_9_ = (i_9_ ^ 0xffffffff) < -2049 ? -4096 + i_9_ : i_9_;
					int i_10_ = i_6_ - -anInt9401;
					i_10_ = i_10_ >= -2048 ? i_10_ : 4096 + i_10_;
					i_10_ = (i_10_ ^ 0xffffffff) < -2049 ? i_10_ - 4096 : i_10_;
					int i_11_ = anInt9398 + i_8_;
					i_11_ = i_11_ < -2048 ? i_11_ + 4096 : i_11_;
					i_11_ = i_11_ > 2048 ? -4096 + i_11_ : i_11_;
					int i_12_ = i_6_ + anInt9407;
					i_12_ = (i_12_ ^ 0xffffffff) <= 2047 ? i_12_ : 4096 + i_12_;
					i_12_ = (i_12_ ^ 0xffffffff) >= -2049 ? i_12_
							: i_12_ - 4096;
					is[i_7_] = ((!method3709(i_9_, -1712624916, i_10_) && !method3706(
							i_11_, i_12_, -956730100)) ? 0 : 4096);
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ot.A(" + i + ','
					+ bool + ')');
		}
	}

	final void method2263(int i, Stream stream, int i_13_) {
		while_236_: do {
			try {
				if (i != 3731)
					aFloat9411 = 0.109181575F;
				anInt9409++;
				int i_14_ = i_13_;
				while_235_: do {
					while_234_: do {
						while_233_: do {
							while_232_: do {
								while_231_: do {
									do {
										if (i_14_ != 0) {
											if ((i_14_ ^ 0xffffffff) == -2)
												break;
											if ((i_14_ ^ 0xffffffff) == -3)
												break while_231_;
											if (i_14_ == 3)
												break while_232_;
											if (i_14_ == 4)
												break while_233_;
											if ((i_14_ ^ 0xffffffff) == -6)
												break while_234_;
											if (i_14_ != 6)
												break while_236_;
											if (!client.aBool10531)
												break while_235_;
										}
										anInt9406 = stream
												.readUnsignedShort((byte) -65);
										return;
									} while (false);
									anInt9401 = stream
											.readUnsignedShort((byte) -65);
									return;
								} while (false);
								anInt9398 = stream
										.readUnsignedShort((byte) -65);
								return;
							} while (false);
							anInt9407 = stream.readUnsignedShort((byte) -65);
							return;
						} while (false);
						anInt9400 = stream.readUnsignedShort((byte) -65);
						return;
					} while (false);
					anInt9408 = stream.readUnsignedShort((byte) -65);
					return;
				} while (false);
				anInt9403 = stream.readUnsignedShort((byte) -65);
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("ot.B(" + i + ','
								+ (stream != null ? "{...}" : "null") + ','
								+ i_13_ + ')'));
			}
		} while (false);
	}

	private final boolean method3709(int i, int i_15_, int i_16_) {
		try {
			anInt9405++;
			int i_17_ = anInt9400 * (i_16_ - i) >> 12;
			int i_18_ = Class191.anIntArray2457[0xff & i_17_ * 255 >> 12];
			if (i_15_ != -1712624916)
				method3708(-94, 53);
			i_18_ = (i_18_ << 12) / anInt9400;
			i_18_ = (i_18_ << 12) / anInt9403;
			i_18_ = i_18_ * anInt9408 >> 12;
			if ((i_18_ ^ 0xffffffff) >= (i_16_ + i ^ 0xffffffff)
					|| (i - -i_16_ ^ 0xffffffff) >= (-i_18_ ^ 0xffffffff))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ot.H(" + i + ','
					+ i_15_ + ',' + i_16_ + ')'));
		}
	}

	static final int method3710(int i, int i_19_) {
		try {
			if (i != -10391)
				return -113;
			anInt9397++;
			return 0x7f & i_19_ >> 11;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ot.C(" + i + ','
					+ i_19_ + ')');
		}
	}

	final void method2256(int i) {
		try {
			if (i != 7)
				anInt9408 = -122;
			anInt9402++;
			Class234_Sub1_Sub1.method3829(false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ot.D(" + i + ')');
		}
	}
}
