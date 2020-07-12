/* Class249 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class249 {
	String aString3359;
	String[] aStringArray3360;
	int[] anIntArray3361;
	int anInt3362;
	private int anInt3363;
	static int anInt3364;
	private int anInt3365;
	static int anInt3366;
	static int anInt3367;
	int[] anIntArray3368;
	static int anInt3369;
	private short[] aShortArray3370;
	int anInt3371;
	private short[] aShortArray3372;
	static int anInt3373;
	boolean aBool3374;
	int anInt3375;
	private int anInt3376;
	int anInt3377;
	static int anInt3378;
	int anInt3379;
	int anInt3380;
	private int anInt3381;
	private int anInt3382;
	int anInt3383 = 0;
	static int anInt3384;
	private int anInt3385;
	private int anInt3386;
	int anInt3387;
	Class223 aClass223_3388;
	int anInt3389;
	int anInt3390;
	int anInt3391;
	private short[] aShortArray3392;
	int anInt3393;
	int anInt3394;
	int anInt3395;
	static int anInt3396;
	boolean aBool3397;
	Class213 aClass213_3398;
	static int anInt3399;
	int anInt3400;
	static int anInt3401;
	int anInt3402;
	int anInt3403;
	int anInt3404;
	private int anInt3405;
	private int anInt3406;
	int anInt3407;
	int anInt3408;
	int anInt3409;
	private byte[] aByteArray3410;
	static int[] anIntArray3411 = { -1, 8192, 0, -1, 12288, 10240, 14336, -1,
			4096, 6144, 2048 };
	private int anInt3412;
	int anInt3413;
	private int anInt3414;
	private int anInt3415;
	int anInt3416;
	private int anInt3417;
	static int anInt3418;
	static int anInt3419;
	static int anInt3420;
	private int anInt3421;
	static int anInt3422;
	private int anInt3423;
	int anInt3424;
	int anInt3425;
	String[] aStringArray3426;
	int anInt3427;
	private int anInt3428;
	int[] anIntArray3429;
	private int anInt3430;
	static int anInt3431;
	private short[] aShortArray3432;
	static OutgoingPacket aClass370_3433 = new OutgoingPacket(50, 0);
	int anInt3434;
	private int anInt3435;
	static int anInt3436;
	static int anInt3437;
	private int anInt3438;
	static int anInt3439;
	static int[] anIntArray3440;
	private int anInt3441;
	static int anInt3442 = 1;

	final boolean method1576(boolean bool, byte i) {
		try {
			anInt3396++;
			int i_0_ = ((Class249) this).anInt3371;
			int i_1_ = anInt3406;
			int i_2_ = anInt3423;
			if (bool) {
				i_1_ = anInt3428;
				i_2_ = anInt3382;
				i_0_ = ((Class249) this).anInt3393;
			}
			if ((i_0_ ^ 0xffffffff) == 0)
				return true;
			if (i <= 26)
				anInt3414 = 47;
			boolean bool_3_ = true;
			if (!((Class223) ((Class249) this).aClass223_3388).aClass146_3054
					.method927((byte) -110, i_0_, 0))
				bool_3_ = false;
			if ((i_1_ ^ 0xffffffff) != 0
					&& !((Class223) ((Class249) this).aClass223_3388).aClass146_3054
							.method927((byte) -102, i_1_, 0))
				bool_3_ = false;
			if (i_2_ != -1
					&& !((Class223) ((Class249) this).aClass223_3388).aClass146_3054
							.method927((byte) -109, i_2_, 0))
				bool_3_ = false;
			return bool_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nl.L(" + bool + ','
					+ i + ')');
		}
	}

	final Class249 method1577(int i, boolean bool) {
		try {
			anInt3367++;
			if (bool != false)
				method1594(null, null, -42);
			if (((Class249) this).anIntArray3429 != null
					&& (i ^ 0xffffffff) < -2) {
				int i_4_ = -1;
				for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -11; i_5_++) {
					if (((Class249) this).anIntArray3361[i_5_] <= i
							&& (((Class249) this).anIntArray3361[i_5_] ^ 0xffffffff) != -1)
						i_4_ = ((Class249) this).anIntArray3429[i_5_];
				}
				if ((i_4_ ^ 0xffffffff) != 0)
					return ((Class249) this).aClass223_3388.method1430(i_4_,
							bool);
			}
			return this;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nl.M(" + i + ','
					+ bool + ')');
		}
	}

	final void method1578(Class249 class249_6_, byte i, Class249 class249_7_) {
		try {
			anInt3405 = class249_7_.anInt3405;
			((Class249) this).anInt3383 = ((Class249) class249_6_).anInt3383;
			((Class249) this).anInt3413 = ((Class249) class249_6_).anInt3413;
			((Class249) this).anInt3424 = ((Class249) class249_7_).anInt3424;
			((Class249) this).anInt3379 = ((Class249) class249_6_).anInt3379;
			((Class249) this).aString3359 = ((Class249) class249_7_).aString3359;
			anInt3412 = class249_7_.anInt3412;
			anInt3435 = class249_7_.anInt3435;
			aByteArray3410 = class249_7_.aByteArray3410;
			anInt3441 = class249_7_.anInt3441;
			((Class249) this).aClass213_3398 = ((Class249) class249_7_).aClass213_3398;
			if (i == 78) {
				anInt3382 = class249_7_.anInt3382;
				anInt3415 = class249_7_.anInt3415;
				aShortArray3392 = class249_7_.aShortArray3392;
				((Class249) this).anInt3387 = ((Class249) class249_6_).anInt3387;
				((Class249) this).aBool3374 = ((Class249) class249_7_).aBool3374;
				anInt3406 = class249_7_.anInt3406;
				((Class249) this).anInt3394 = ((Class249) class249_6_).anInt3394;
				anInt3438 = class249_7_.anInt3438;
				anInt3399++;
				anInt3376 = class249_7_.anInt3376;
				aShortArray3432 = class249_7_.aShortArray3432;
				((Class249) this).aStringArray3360 = ((Class249) class249_7_).aStringArray3360;
				anInt3430 = class249_6_.anInt3430;
				aShortArray3370 = class249_7_.aShortArray3370;
				aShortArray3372 = class249_7_.aShortArray3372;
				anInt3385 = class249_7_.anInt3385;
				((Class249) this).anInt3393 = ((Class249) class249_7_).anInt3393;
				((Class249) this).aStringArray3426 = new String[5];
				((Class249) this).anInt3408 = ((Class249) class249_6_).anInt3408;
				anInt3386 = class249_7_.anInt3386;
				anInt3417 = class249_7_.anInt3417;
				((Class249) this).anInt3390 = 0;
				anInt3428 = class249_7_.anInt3428;
				((Class249) this).anInt3371 = ((Class249) class249_7_).anInt3371;
				anInt3423 = class249_7_.anInt3423;
				if (((Class249) class249_7_).aStringArray3426 != null) {
					for (int i_8_ = 0; i_8_ < 4; i_8_++)
						((Class249) this).aStringArray3426[i_8_] = ((Class249) class249_7_).aStringArray3426[i_8_];
				}
				((Class249) this).aStringArray3426[4] = Class26.aClass26_282
						.method217(
								(byte) 96,
								(((Class223) (((Class249) this).aClass223_3388)).anInt3064));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nl.F("
					+ (class249_6_ != null ? "{...}" : "null") + ',' + i + ','
					+ (class249_7_ != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method1579(Stream stream, byte i, int i_9_) {
		do {
			try {
				if (i_9_ == 1)
					anInt3430 = stream.readUnsignedShort((byte) -65);
				else if (i_9_ == 2)
					((Class249) this).aString3359 = stream.readString(-1);
				else if (i_9_ == 4)
					((Class249) this).anInt3387 = stream
							.readUnsignedShort((byte) -65);
				else if ((i_9_ ^ 0xffffffff) != -6) {
					if (i_9_ == 6)
						((Class249) this).anInt3408 = stream
								.readUnsignedShort((byte) -65);
					else if ((i_9_ ^ 0xffffffff) == -8) {
						((Class249) this).anInt3413 = stream
								.readUnsignedShort((byte) -65);
						if ((((Class249) this).anInt3413 ^ 0xffffffff) < -32768)
							((Class249) this).anInt3413 -= 65536;
					} else if ((i_9_ ^ 0xffffffff) == -9) {
						((Class249) this).anInt3379 = stream
								.readUnsignedShort((byte) -65);
						if (((Class249) this).anInt3379 > 32767)
							((Class249) this).anInt3379 -= 65536;
					} else if (i_9_ == 11)
						((Class249) this).anInt3416 = 1;
					else if (i_9_ != 12) {
						if (i_9_ != 16) {
							if (i_9_ != 18) {
								if (i_9_ == 23)
									((Class249) this).anInt3371 = stream
											.readUnsignedShort((byte) -65);
								else if ((i_9_ ^ 0xffffffff) != -25) {
									if ((i_9_ ^ 0xffffffff) != -26) {
										if (i_9_ != 26) {
											if ((i_9_ ^ 0xffffffff) > -31
													|| i_9_ >= 35) {
												if (i_9_ < 35 || i_9_ >= 40) {
													if ((i_9_ ^ 0xffffffff) == -41) {
														int i_10_ = (stream
																.readUnsignedByte((byte) 35));
														aShortArray3370 = new short[i_10_];
														aShortArray3392 = new short[i_10_];
														for (int i_11_ = 0; ((i_10_ ^ 0xffffffff) < (i_11_ ^ 0xffffffff)); i_11_++) {
															aShortArray3392[i_11_] = (short) (stream
																	.readUnsignedShort((byte) -65));
															aShortArray3370[i_11_] = (short) (stream
																	.readUnsignedShort((byte) -65));
														}
													} else if (i_9_ == 41) {
														int i_12_ = (stream
																.readUnsignedByte((byte) 35));
														aShortArray3432 = new short[i_12_];
														aShortArray3372 = new short[i_12_];
														for (int i_13_ = 0; i_12_ > i_13_; i_13_++) {
															aShortArray3432[i_13_] = (short) (stream
																	.readUnsignedShort((byte) -65));
															aShortArray3372[i_13_] = (short) (stream
																	.readUnsignedShort((byte) -65));
														}
													} else if ((i_9_ ^ 0xffffffff) == -43) {
														int i_14_ = (stream
																.readUnsignedByte((byte) 35));
														aByteArray3410 = new byte[i_14_];
														for (int i_15_ = 0; ((i_15_ ^ 0xffffffff) > (i_14_ ^ 0xffffffff)); i_15_++)
															aByteArray3410[i_15_] = (stream
																	.readByte(1854307120));
													} else if ((i_9_ ^ 0xffffffff) == -66)
														((Class249) this).aBool3397 = true;
													else if (i_9_ != 78) {
														if (i_9_ == 79)
															anInt3382 = (stream
																	.readUnsignedShort((byte) -65));
														else if (i_9_ != 90) {
															if (i_9_ == 91)
																anInt3441 = (stream
																		.readUnsignedShort((byte) -65));
															else if ((i_9_ ^ 0xffffffff) != -93) {
																if (i_9_ == 93)
																	anInt3435 = (stream
																			.readUnsignedShort((byte) -65));
																else if ((i_9_ ^ 0xffffffff) != -96) {
																	if (i_9_ == 96)
																		((Class249) this).anInt3400 = stream
																				.readUnsignedByte((byte) 35);
																	else if ((i_9_ ^ 0xffffffff) == -98)
																		((Class249) this).anInt3395 = stream
																				.readUnsignedShort((byte) -65);
																	else if ((i_9_ ^ 0xffffffff) != -99) {
																		if ((i_9_ ^ 0xffffffff) > -101
																				|| i_9_ >= 110) {
																			if ((i_9_ ^ 0xffffffff) != -111) {
																				if ((i_9_ ^ 0xffffffff) == -112)
																					anInt3365 = stream
																							.readUnsignedShort((byte) -65);
																				else if ((i_9_ ^ 0xffffffff) == -113)
																					anInt3381 = stream
																							.readUnsignedShort((byte) -65);
																				else if ((i_9_ ^ 0xffffffff) == -114)
																					anInt3414 = stream
																							.readByte(1854307120);
																				else if ((i_9_ ^ 0xffffffff) == -115)
																					anInt3363 = 5 * stream
																							.readByte(1854307120);
																				else if (i_9_ != 115) {
																					if ((i_9_ ^ 0xffffffff) == -122)
																						((Class249) this).anInt3402 = stream
																								.readUnsignedShort((byte) -65);
																					else if (i_9_ == 122)
																						((Class249) this).anInt3407 = stream
																								.readUnsignedShort((byte) -65);
																					else if ((i_9_ ^ 0xffffffff) != -126) {
																						if ((i_9_ ^ 0xffffffff) == -127) {
																							anInt3415 = stream
																									.readByte(1854307120) << 2;
																							anInt3438 = stream
																									.readByte(1854307120) << 2;
																							anInt3417 = stream
																									.readByte(1854307120) << 2;
																						} else if ((i_9_ ^ 0xffffffff) != -128) {
																							if (i_9_ == 128) {
																								((Class249) this).anInt3391 = stream
																										.readUnsignedByte((byte) 35);
																								((Class249) this).anInt3375 = stream
																										.readUnsignedShort((byte) -65);
																							} else if (i_9_ == 129) {
																								((Class249) this).anInt3404 = stream
																										.readUnsignedByte((byte) 35);
																								((Class249) this).anInt3434 = stream
																										.readUnsignedShort((byte) -65);
																							} else if (i_9_ != 130) {
																								if (i_9_ != 132) {
																									if (i_9_ == 134)
																										((Class249) this).anInt3409 = stream
																												.readUnsignedByte((byte) 35);
																									else if (i_9_ == 249) {
																										int i_16_ = stream
																												.readUnsignedByte((byte) 35);
																										if (((Class249) this).aClass213_3398 == null) {
																											int i_17_ = Class11_Sub2_Sub33
																													.method3808(
																															123,
																															i_16_);
																											((Class249) this).aClass213_3398 = new Class213(
																													i_17_);
																										}
																										for (int i_18_ = 0; (i_16_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff); i_18_++) {
																											boolean bool = stream
																													.readUnsignedByte((byte) 35) == 1;
																											int i_19_ = stream
																													.method2558(false);
																											Class11 class11;
																											if (!bool)
																												class11 = new Class11_Sub51(
																														stream.readInt(122));
																											else
																												class11 = new Class11_Sub3(
																														stream.readString(-1));
																											((Class249) this).aClass213_3398
																													.method1368(
																															(long) i_19_,
																															class11,
																															(byte) -26);
																										}
																									}
																								} else {
																									int i_20_ = stream
																											.readUnsignedByte((byte) 35);
																									((Class249) this).anIntArray3368 = new int[i_20_];
																									for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > (i_20_ ^ 0xffffffff); i_21_++)
																										((Class249) this).anIntArray3368[i_21_] = stream
																												.readUnsignedShort((byte) -65);
																								}
																							} else {
																								((Class249) this).anInt3377 = stream
																										.readUnsignedByte((byte) 35);
																								((Class249) this).anInt3427 = stream
																										.readUnsignedShort((byte) -65);
																							}
																						} else {
																							((Class249) this).anInt3403 = stream
																									.readUnsignedByte((byte) 35);
																							((Class249) this).anInt3425 = stream
																									.readUnsignedShort((byte) -65);
																						}
																					} else {
																						anInt3386 = stream
																								.readByte(1854307120) << 2;
																						anInt3405 = stream
																								.readByte(1854307120) << 2;
																						anInt3385 = stream
																								.readByte(1854307120) << 2;
																					}
																				} else
																					((Class249) this).anInt3424 = stream
																							.readUnsignedByte((byte) 35);
																			} else
																				anInt3421 = stream
																						.readUnsignedShort((byte) -65);
																		} else {
																			if (((Class249) this).anIntArray3429 == null) {
																				((Class249) this).anIntArray3361 = new int[10];
																				((Class249) this).anIntArray3429 = new int[10];
																			}
																			((Class249) this).anIntArray3429[-100
																					+ i_9_] = stream
																					.readUnsignedShort((byte) -65);
																			((Class249) this).anIntArray3361[-100
																					+ i_9_] = stream
																					.readUnsignedShort((byte) -65);
																		}
																	} else
																		((Class249) this).anInt3389 = stream
																				.readUnsignedShort((byte) -65);
																} else
																	((Class249) this).anInt3394 = (stream
																			.readUnsignedShort((byte) -65));
															} else
																anInt3412 = (stream
																		.readUnsignedShort((byte) -65));
														} else
															anInt3376 = (stream
																	.readUnsignedShort((byte) -65));
													} else
														anInt3423 = (stream
																.readUnsignedShort((byte) -65));
												} else
													((Class249) this).aStringArray3426[-35
															+ i_9_] = stream
															.readString(-1);
											} else
												((Class249) this).aStringArray3360[-30
														+ i_9_] = stream
														.readString(-1);
										} else
											anInt3428 = stream
													.readUnsignedShort((byte) -65);
									} else
										((Class249) this).anInt3393 = stream
												.readUnsignedShort((byte) -65);
								} else
									anInt3406 = stream
											.readUnsignedShort((byte) -65);
							} else
								((Class249) this).anInt3380 = stream
										.readUnsignedShort((byte) -65);
						} else
							((Class249) this).aBool3374 = true;
					} else
						((Class249) this).anInt3390 = stream.readInt(94);
				} else
					((Class249) this).anInt3383 = stream
							.readUnsignedShort((byte) -65);
				anInt3366++;
				if (i <= -92)
					break;
				((Class249) this).aClass223_3388 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("nl.K("
						+ (stream != null ? "{...}" : "null") + ',' + i + ','
						+ i_9_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1580(int i) {
		do {
			try {
				anInt3378++;
				if (i >= 110)
					break;
				method1591(true, 89);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "nl.Q(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1581(Stream stream, boolean bool) {
		do {
			try {
				anInt3439++;
				for (;;) {
					int i = stream.readUnsignedByte((byte) 35);
					if ((i ^ 0xffffffff) == -1)
						break;
					method1579(stream, (byte) -125, i);
				}
				if (bool == false)
					break;
				((Class249) this).anInt3400 = 38;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("nl.J(" + (stream != null ? "{...}" : "null") + ','
								+ bool + ')'));
			}
			break;
		} while (false);
	}

	private final void method1582(int i, int[] is, int i_22_) {
		try {
			if (i == 8407) {
				for (int i_23_ = 31; i_23_ > 0; i_23_--) {
					int i_24_ = i_23_ * 36;
					for (int i_25_ = 35; i_25_ > 0; i_25_--) {
						if (is[i_25_ - -i_24_] == 0
								&& ((is[-36 + i_25_ + (i_24_ - 1)] ^ 0xffffffff) != -1))
							is[i_25_ - -i_24_] = i_22_;
					}
				}
				anInt3369++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nl.N(" + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_22_ + ')'));
		}
	}

	public static void method1583(int i) {
		try {
			anIntArray3440 = null;
			aClass370_3433 = null;
			int i_26_ = 111 % ((-72 - i) / 45);
			anIntArray3411 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nl.B(" + i + ')');
		}
	}

	final Class179 method1584(boolean bool, int i) {
		try {
			anInt3384++;
			int i_27_ = ((Class249) this).anInt3371;
			int i_28_ = anInt3406;
			int i_29_ = anInt3423;
			if (bool) {
				i_29_ = anInt3382;
				i_28_ = anInt3428;
				i_27_ = ((Class249) this).anInt3393;
			}
			if ((i_27_ ^ 0xffffffff) == 0)
				return null;
			Class179 class179 = Class11_Sub16
					.method2443(
							0,
							(((Class223) (((Class249) this).aClass223_3388)).aClass146_3054),
							i_27_, 0);
			if ((((Class179) class179).anInt2277 ^ 0xffffffff) > -14)
				class179.method1166(2, true);
			if (i_28_ != -1) {
				Class179 class179_30_ = Class11_Sub16
						.method2443(
								0,
								(((Class223) (((Class249) this).aClass223_3388)).aClass146_3054),
								i_28_, 0);
				if (((Class179) class179_30_).anInt2277 < 13)
					class179_30_.method1166(2, true);
				if ((i_29_ ^ 0xffffffff) == 0) {
					Class179[] class179s = { class179, class179_30_ };
					class179 = new Class179(class179s, 2);
				} else {
					Class179 class179_31_ = Class11_Sub16
							.method2443(
									0,
									(((Class223) (((Class249) this).aClass223_3388)).aClass146_3054),
									i_29_, 0);
					if ((((Class179) class179_31_).anInt2277 ^ 0xffffffff) > -14)
						class179_31_.method1166(2, true);
					Class179[] class179s = { class179, class179_30_,
							class179_31_ };
					class179 = new Class179(class179s, 3);
				}
			}
			if (class179 == null)
				return null;
			if (!bool
					&& ((anInt3386 ^ 0xffffffff) != -1
							|| (anInt3405 ^ 0xffffffff) != -1 || (anInt3385 ^ 0xffffffff) != -1))
				class179.method1163(anInt3405, (byte) 86, anInt3385, anInt3386);
			if (bool && (anInt3415 != 0 || anInt3438 != 0 || anInt3417 != 0))
				class179.method1163(anInt3438, (byte) 101, anInt3417, anInt3415);
			if (aShortArray3392 != null) {
				for (int i_32_ = 0; ((i_32_ ^ 0xffffffff) > (aShortArray3392.length ^ 0xffffffff)); i_32_++)
					class179.method1169(aShortArray3370[i_32_],
							aShortArray3392[i_32_], (byte) -1);
			}
			if (i != 4371)
				return null;
			if (aShortArray3432 != null) {
				for (int i_33_ = 0; ((i_33_ ^ 0xffffffff) > (aShortArray3432.length ^ 0xffffffff)); i_33_++)
					class179.method1167(aShortArray3432[i_33_],
							aShortArray3372[i_33_], -122);
			}
			return class179;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nl.I(" + bool + ','
					+ i + ')');
		}
	}

	static final boolean method1585(int i, int i_34_, int i_35_) {
		try {
			if (i_35_ != -14976)
				return true;
			anInt3401++;
			if (!(Class173.method1135(i_34_, 52, i) | (i_34_ & 0x40000) != 0)
					&& !Class376_Sub7_Sub4_Sub2.method3911(4285, i_34_, i))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nl.P(" + i + ','
					+ i_34_ + ',' + i_35_ + ')'));
		}
	}

	final int[] method1586(boolean bool, Class163 class163, int i, int i_36_,
			Class258 class258, int i_37_, Class163 class163_38_, int i_39_,
			Class107 class107, int i_40_) {
		try {
			anInt3373++;
			Class179 class179 = Class11_Sub16
					.method2443(
							0,
							(((Class223) (((Class249) this).aClass223_3388)).aClass146_3054),
							anInt3430, 0);
			if (class179 == null)
				return null;
			if (((Class179) class179).anInt2277 < 13)
				class179.method1166(2, true);
			if (aShortArray3392 != null) {
				for (int i_41_ = 0; ((i_41_ ^ 0xffffffff) > (aShortArray3392.length ^ 0xffffffff)); i_41_++) {
					if (aByteArray3410 == null
							|| ((aByteArray3410.length ^ 0xffffffff) >= (i_41_ ^ 0xffffffff)))
						class179.method1169(aShortArray3370[i_41_],
								aShortArray3392[i_41_], (byte) -1);
					else
						class179.method1169(
								(Class11_Sub28.aShortArray6587[0xff & aByteArray3410[i_41_]]),
								aShortArray3392[i_41_], (byte) -1);
				}
			}
			if (aShortArray3432 != null) {
				for (int i_42_ = 0; aShortArray3432.length > i_42_; i_42_++)
					class179.method1167(aShortArray3432[i_42_],
							aShortArray3372[i_42_], -117);
			}
			if (class258 != null) {
				for (int i_43_ = 0; (i_43_ ^ 0xffffffff) > -6; i_43_++) {
					for (int i_44_ = 0; Class34.aShortArrayArrayArray463.length > i_44_; i_44_++) {
						if ((((Class258) class258).anIntArray3529[i_43_] ^ 0xffffffff) > ((Class34.aShortArrayArrayArray463[i_44_][i_43_]).length ^ 0xffffffff))
							class179.method1169(
									(Class34.aShortArrayArrayArray463[i_44_][i_43_][(((Class258) class258).anIntArray3529[i_43_])]),
									(Class11_Sub46.aShortArrayArray7982[i_44_][i_43_]),
									(byte) -1);
					}
				}
			}
			int i_45_ = 2048;
			boolean bool_46_ = false;
			if (anInt3421 != 128 || (anInt3365 ^ 0xffffffff) != -129
					|| anInt3381 != 128) {
				i_45_ |= 0x7;
				bool_46_ = true;
			}
			Class206 class206 = class163_38_.method1020(class179, i_45_, 64,
					64 + anInt3414, 768 + anInt3363);
			if (!class206.method1328())
				return null;
			if (bool_46_)
				class206.O(anInt3421, anInt3365, anInt3381);
			Class253 class253 = null;
			if ((((Class249) this).anInt3389 ^ 0xffffffff) == 0) {
				if ((((Class249) this).anInt3407 ^ 0xffffffff) != 0) {
					class253 = (((Class249) this).aClass223_3388.method1426(
							i_37_, i_39_, false, i_40_, class163, class107,
							class258, ((Class249) this).anInt3402, 0, true,
							class163_38_, false));
					if (class253 == null)
						return null;
				}
			} else {
				class253 = (((Class249) this).aClass223_3388.method1426(1, 10,
						false, 0, class163, class107, class258,
						((Class249) this).anInt3395, 0, true, class163_38_,
						true));
				if (class253 == null)
					return null;
			}
			int i_47_;
			if (!bool) {
				if (i_37_ != 2)
					i_47_ = ((Class249) this).anInt3387 << 2;
				else
					i_47_ = ((int) (1.04 * (double) ((Class249) this).anInt3387) << 2);
			} else
				i_47_ = (int) ((double) ((Class249) this).anInt3387 * 1.5) << 2;
			class163_38_.DA(16, 16, 512, 512);
			Class33 class33 = class163_38_.method1041();
			class33.method289();
			class163_38_.method1080(class33);
			class163_38_.xa(1.0F);
			class163_38_.ZA(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
			Class33 class33_48_ = class163_38_.method1048();
			class33_48_.method288(-((Class249) this).anInt3394 << 3);
			class33_48_.method293(((Class249) this).anInt3408 << 3);
			class33_48_
					.method299(
							((Class249) this).anInt3413 << 2,
							(((i_47_ * (Class335.anIntArray4436[((Class249) this).anInt3383 << 3])) >> 14) + (-(class206
									.fa() / 2) + (((Class249) this).anInt3379 << 2))),
							(((i_47_ * (Class335.anIntArray4430[((Class249) this).anInt3383 << 3])) >> 14) - -(((Class249) this).anInt3379 << 2)));
			class33_48_.method303(((Class249) this).anInt3383 << 3);
			int i_49_ = class163_38_.i();
			int i_50_ = class163_38_.XA();
			class163_38_.f(50, 2147483647);
			class163_38_.ya();
			class163_38_.la();
			class163_38_.aa(0, 0, 36, 32, 0, 0);
			class206.method1321(class33_48_, null, 1);
			class163_38_.f(i_49_, i_50_);
			int[] is = class163_38_.na(0, 0, 36, 32);
			if ((i_37_ ^ 0xffffffff) <= -2) {
				is = method1588(127, is, -16777214);
				if ((i_37_ ^ 0xffffffff) <= -3)
					is = method1588(126, is, -1);
			}
			if (i_36_ != (i_40_ ^ 0xffffffff))
				method1582(8407, is, i_40_);
			class163_38_.method1040(36, 32, is, -1, 36, 0).method1610(0, 0);
			if ((((Class249) this).anInt3389 ^ 0xffffffff) != 0)
				class253.method1610(0, 0);
			else if ((((Class249) this).anInt3407 ^ 0xffffffff) != 0)
				class253.method1610(0, 0);
			if (i == 1
					|| ((i ^ 0xffffffff) == -3
							&& (((Class249) this).anInt3416 == 1 || (i_39_ ^ 0xffffffff) != -2) && i_39_ != -1))
				class107.method708(0, 173, -256, 9,
						method1592((byte) 75, i_39_), -16777215);
			is = class163_38_.na(0, 0, 36, 32);
			for (int i_51_ = 0; is.length > i_51_; i_51_++) {
				if ((0xffffff & is[i_51_]) == 0)
					is[i_51_] = 0;
				else
					is[i_51_] = Class173.method1134(is[i_51_], -16777216);
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nl.O(" + bool + ','
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_36_ + ',' + (class258 != null ? "{...}" : "null") + ','
					+ i_37_ + ',' + (class163_38_ != null ? "{...}" : "null")
					+ ',' + i_39_ + ',' + (class107 != null ? "{...}" : "null")
					+ ',' + i_40_ + ')'));
		}
	}

	final Class206 method1587(int i, boolean bool, Class163 class163,
			Class258 class258, int i_52_, int i_53_, Class281 class281,
			int i_54_, int i_55_) {
		try {
			anInt3436++;
			if (((Class249) this).anIntArray3429 != null
					&& (i_52_ ^ 0xffffffff) < -2) {
				int i_56_ = -1;
				for (int i_57_ = 0; (i_57_ ^ 0xffffffff) > -11; i_57_++) {
					if (((Class249) this).anIntArray3361[i_57_] <= i_52_
							&& ((Class249) this).anIntArray3361[i_57_] != 0)
						i_56_ = ((Class249) this).anIntArray3429[i_57_];
				}
				if ((i_56_ ^ 0xffffffff) != 0)
					return (((Class249) this).aClass223_3388.method1430(i_56_,
							false).method1587(i, false, class163, class258, 1,
							i_53_, class281, i_54_, i_55_));
			}
			int i_58_ = i;
			if (class281 != null)
				i_58_ |= class281.method1738(i_53_, 1024, true, i_55_);
			Class206 class206;
			synchronized (((Class223) ((Class249) this).aClass223_3388).aClass22_3065) {
				class206 = ((Class206) (((Class223) ((Class249) this).aClass223_3388).aClass22_3065
						.method188(
								(long) (((Class249) this).anInt3362 | ((Class163) class163).anInt2103 << 29),
								(byte) 103)));
			}
			if (bool != false)
				method1590((byte) -12, true);
			if (class206 == null
					|| (class163.method1065(class206.ua(), i_58_) ^ 0xffffffff) != -1) {
				if (class206 != null)
					i_58_ = class163.method1077(i_58_, class206.ua());
				int i_59_ = i_58_;
				if (aShortArray3432 != null)
					i_59_ |= 0x8000;
				if (aShortArray3392 != null || class258 != null)
					i_59_ |= 0x4000;
				if (anInt3421 != 128)
					i_59_ |= 0x1;
				if ((anInt3421 ^ 0xffffffff) != -129)
					i_59_ |= 0x2;
				if (anInt3421 != 128)
					i_59_ |= 0x4;
				Class179 class179 = Class11_Sub16
						.method2443(
								0,
								(((Class223) (((Class249) this).aClass223_3388)).aClass146_3054),
								anInt3430, 0);
				if (class179 == null)
					return null;
				if ((((Class179) class179).anInt2277 ^ 0xffffffff) > -14)
					class179.method1166(2, true);
				class206 = class163
						.method1020(
								class179,
								i_59_,
								(((Class223) ((Class249) this).aClass223_3388).anInt3071),
								anInt3414 + 64, anInt3363 + 850);
				if ((anInt3421 ^ 0xffffffff) != -129 || anInt3365 != 128
						|| (anInt3381 ^ 0xffffffff) != -129)
					class206.O(anInt3421, anInt3365, anInt3381);
				if (aShortArray3392 != null) {
					for (int i_60_ = 0; ((aShortArray3392.length ^ 0xffffffff) < (i_60_ ^ 0xffffffff)); i_60_++) {
						if (aByteArray3410 != null
								&& i_60_ < aByteArray3410.length)
							class206.ia(
									aShortArray3392[i_60_],
									(Class11_Sub28.aShortArray6587[0xff & aByteArray3410[i_60_]]));
						else
							class206.ia(aShortArray3392[i_60_],
									aShortArray3370[i_60_]);
					}
				}
				if (aShortArray3432 != null) {
					for (int i_61_ = 0; ((aShortArray3432.length ^ 0xffffffff) < (i_61_ ^ 0xffffffff)); i_61_++)
						class206.aa(aShortArray3432[i_61_],
								aShortArray3372[i_61_]);
				}
				if (class258 != null) {
					for (int i_62_ = 0; (i_62_ ^ 0xffffffff) > -6; i_62_++) {
						for (int i_63_ = 0; i_63_ < Class34.aShortArrayArrayArray463.length; i_63_++) {
							if ((((Class258) class258).anIntArray3529[i_62_] ^ 0xffffffff) > ((Class34.aShortArrayArrayArray463[i_63_][i_62_]).length ^ 0xffffffff))
								class206.ia(
										(Class11_Sub46.aShortArrayArray7982[i_63_][i_62_]),
										(Class34.aShortArrayArrayArray463[i_63_][i_62_][(((Class258) class258).anIntArray3529[i_62_])]));
						}
					}
				}
				class206.s(i_58_);
				synchronized (((Class223) ((Class249) this).aClass223_3388).aClass22_3065) {
					((Class223) ((Class249) this).aClass223_3388).aClass22_3065
							.method184(
									(byte) 125,
									class206,
									(long) (((Class249) this).anInt3362 | ((Class163) class163).anInt2103 << 29));
				}
			}
			if (class281 != null)
				class206 = class281.method1734(-1, class206, i_53_, i_58_,
						i_54_, i_55_);
			class206.s(i);
			return class206;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nl.D(" + i + ','
					+ bool + ',' + (class163 != null ? "{...}" : "null") + ','
					+ (class258 != null ? "{...}" : "null") + ',' + i_52_ + ','
					+ i_53_ + ',' + (class281 != null ? "{...}" : "null") + ','
					+ i_54_ + ',' + i_55_ + ')'));
		}
	}

	private final int[] method1588(int i, int[] is, int i_64_) {
		try {
			anInt3419++;
			if (i < 125)
				((Class249) this).anInt3380 = -73;
			int[] is_65_ = new int[1152];
			int i_66_ = 0;
			for (int i_67_ = 0; (i_67_ ^ 0xffffffff) > -33; i_67_++) {
				for (int i_68_ = 0; (i_68_ ^ 0xffffffff) > -37; i_68_++) {
					int i_69_ = is[i_66_];
					if (i_69_ == 0) {
						if ((i_68_ ^ 0xffffffff) < -1
								&& (is[i_66_ - 1] ^ 0xffffffff) != -1)
							i_69_ = i_64_;
						else if ((i_67_ ^ 0xffffffff) < -1
								&& (is[i_66_ - 36] ^ 0xffffffff) != -1)
							i_69_ = i_64_;
						else if (i_68_ >= 35
								|| (is[i_66_ + 1] ^ 0xffffffff) == -1) {
							if ((i_67_ ^ 0xffffffff) > -32
									&& (is[36 + i_66_] ^ 0xffffffff) != -1)
								i_69_ = i_64_;
						} else
							i_69_ = i_64_;
					}
					is_65_[i_66_++] = i_69_;
				}
			}
			return is_65_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nl.C(" + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_64_ + ')'));
		}
	}

	final String method1589(int i, byte i_70_, String string) {
		try {
			anInt3437++;
			if (((Class249) this).aClass213_3398 == null)
				return string;
			int i_71_ = -40 / (i_70_ / 38);
			Class11_Sub3 class11_sub3 = ((Class11_Sub3) ((Class249) this).aClass213_3398
					.method1369((byte) 26, (long) i));
			if (class11_sub3 == null)
				return string;
			return ((Class11_Sub3) class11_sub3).aString5110;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nl.S(" + i + ','
					+ i_70_ + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final Class179 method1590(byte i, boolean bool) {
		try {
			anInt3422++;
			if (i != 57)
				return null;
			int i_72_ = anInt3376;
			int i_73_ = anInt3412;
			if (bool) {
				i_73_ = anInt3435;
				i_72_ = anInt3441;
			}
			if (i_72_ == -1)
				return null;
			Class179 class179 = Class11_Sub16
					.method2443(
							i ^ 0x39,
							(((Class223) ((Class249) this).aClass223_3388).aClass146_3054),
							i_72_, 0);
			if (((Class179) class179).anInt2277 < 13)
				class179.method1166(2, true);
			if (i_73_ != -1) {
				Class179 class179_74_ = Class11_Sub16
						.method2443(
								0,
								(((Class223) (((Class249) this).aClass223_3388)).aClass146_3054),
								i_73_, 0);
				if ((((Class179) class179_74_).anInt2277 ^ 0xffffffff) > -14)
					class179_74_.method1166(2, true);
				Class179[] class179s = { class179, class179_74_ };
				class179 = new Class179(class179s, 2);
			}
			if (aShortArray3392 != null) {
				for (int i_75_ = 0; ((i_75_ ^ 0xffffffff) > (aShortArray3392.length ^ 0xffffffff)); i_75_++)
					class179.method1169(aShortArray3370[i_75_],
							aShortArray3392[i_75_], (byte) -1);
			}
			if (aShortArray3432 != null) {
				for (int i_76_ = 0; i_76_ < aShortArray3432.length; i_76_++)
					class179.method1167(aShortArray3432[i_76_],
							aShortArray3372[i_76_], -127);
			}
			return class179;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nl.H(" + i + ','
					+ bool + ')');
		}
	}

	final boolean method1591(boolean bool, int i) {
		try {
			anInt3431++;
			int i_77_ = anInt3376;
			int i_78_ = anInt3412;
			if (bool) {
				i_78_ = anInt3435;
				i_77_ = anInt3441;
			}
			if (i_77_ == -1)
				return true;
			if (i != -29669)
				return true;
			boolean bool_79_ = true;
			if (!((Class223) ((Class249) this).aClass223_3388).aClass146_3054
					.method927((byte) -117, i_77_, 0))
				bool_79_ = false;
			if ((i_78_ ^ 0xffffffff) != 0
					&& !((Class223) ((Class249) this).aClass223_3388).aClass146_3054
							.method927((byte) -95, i_78_, 0))
				bool_79_ = false;
			return bool_79_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nl.E(" + bool + ','
					+ i + ')');
		}
	}

	private final String method1592(byte i, int i_80_) {
		try {
			anInt3418++;
			if (i_80_ < 100000)
				return "<col=ffff00>" + i_80_ + "</col>";
			if (i_80_ < 10000000)
				return ("<col=ffffff>"
						+ i_80_
						/ 1000
						+ Class26.aClass26_312
								.method217(
										(byte) 125,
										(((Class223) (((Class249) this).aClass223_3388)).anInt3064)) + "</col>");
			int i_81_ = 108 / ((i + 65) / 55);
			return ("<col=00ff80>"
					+ i_80_
					/ 1000000
					+ Class26.aClass26_310
							.method217(
									(byte) 122,
									(((Class223) (((Class249) this).aClass223_3388)).anInt3064)) + "</col>");
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nl.R(" + i + ','
					+ i_80_ + ')');
		}
	}

	final int method1593(int i, int i_82_, int i_83_) {
		try {
			if (i_83_ < 23)
				((Class249) this).anInt3383 = 101;
			anInt3420++;
			if (((Class249) this).aClass213_3398 == null)
				return i;
			Class11_Sub51 class11_sub51 = ((Class11_Sub51) ((Class249) this).aClass213_3398
					.method1369((byte) 26, (long) i_82_));
			if (class11_sub51 == null)
				return i;
			return ((Class11_Sub51) class11_sub51).anInt8036;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nl.A(" + i + ','
					+ i_82_ + ',' + i_83_ + ')'));
		}
	}

	final void method1594(Class249 class249_84_, Class249 class249_85_, int i) {
		try {
			((Class249) this).anInt3387 = ((Class249) class249_85_).anInt3387;
			((Class249) this).anInt3383 = ((Class249) class249_85_).anInt3383;
			aShortArray3372 = class249_85_.aShortArray3372;
			((Class249) this).anInt3394 = ((Class249) class249_85_).anInt3394;
			aByteArray3410 = class249_85_.aByteArray3410;
			aShortArray3370 = class249_85_.aShortArray3370;
			aShortArray3432 = class249_85_.aShortArray3432;
			anInt3430 = class249_85_.anInt3430;
			((Class249) this).anInt3408 = ((Class249) class249_85_).anInt3408;
			((Class249) this).aBool3374 = ((Class249) class249_84_).aBool3374;
			((Class249) this).anInt3413 = ((Class249) class249_85_).anInt3413;
			((Class249) this).anInt3379 = ((Class249) class249_85_).anInt3379;
			((Class249) this).anInt3390 = ((Class249) class249_84_).anInt3390;
			aShortArray3392 = class249_85_.aShortArray3392;
			anInt3364++;
			((Class249) this).aString3359 = ((Class249) class249_84_).aString3359;
			((Class249) this).anInt3416 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("nl.G(" + (class249_84_ != null ? "{...}" : "null") + ','
							+ (class249_85_ != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	public Class249() {
		anInt3376 = -1;
		anInt3382 = -1;
		((Class249) this).anInt3394 = 0;
		((Class249) this).anInt3379 = 0;
		anInt3386 = 0;
		anInt3365 = 128;
		anInt3381 = 128;
		((Class249) this).anInt3371 = -1;
		anInt3406 = -1;
		((Class249) this).anInt3403 = -1;
		anInt3363 = 0;
		anInt3412 = -1;
		((Class249) this).anInt3413 = 0;
		anInt3405 = 0;
		((Class249) this).anInt3387 = 2000;
		((Class249) this).anInt3393 = -1;
		anInt3414 = 0;
		((Class249) this).anInt3389 = -1;
		anInt3415 = 0;
		((Class249) this).anInt3407 = -1;
		((Class249) this).anInt3416 = 0;
		((Class249) this).anInt3377 = -1;
		((Class249) this).anInt3400 = 0;
		((Class249) this).aBool3397 = false;
		((Class249) this).anInt3391 = -1;
		anInt3417 = 0;
		((Class249) this).anInt3409 = 0;
		anInt3421 = 128;
		((Class249) this).anInt3424 = 0;
		anInt3385 = 0;
		anInt3428 = -1;
		((Class249) this).anInt3375 = -1;
		((Class249) this).anInt3425 = -1;
		((Class249) this).anInt3404 = -1;
		((Class249) this).anInt3427 = -1;
		((Class249) this).anInt3380 = -1;
		((Class249) this).anInt3395 = -1;
		((Class249) this).anInt3402 = -1;
		anInt3423 = -1;
		((Class249) this).anInt3434 = -1;
		((Class249) this).aBool3374 = false;
		anInt3438 = 0;
		anInt3435 = -1;
		((Class249) this).aString3359 = "null";
		((Class249) this).anInt3408 = 0;
		((Class249) this).anInt3390 = 1;
		anInt3441 = -1;
	}
}
