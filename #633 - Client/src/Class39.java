/* Class39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class39 {
	int anInt521 = 0;
	static int anInt522;
	private int anInt523;
	int anInt524;
	int anInt525;
	int anInt526;
	int anInt527 = -1;
	int anInt528;
	int[][] anIntArrayArray529;
	static int anInt530;
	int anInt531 = -1;
	int anInt532;
	int anInt533;
	boolean aBool534;
	int anInt535;
	int anInt536;
	int[] anIntArray537;
	int anInt538;
	static int anInt539;
	int anInt540;
	int anInt541;
	int anInt542;
	int anInt543;
	int[] anIntArray544;
	int anInt545;
	int anInt546;
	int[] anIntArray547;
	private int anInt548;
	private Class33[] aClass33Array549;
	int anInt550;
	int anInt551;
	int anInt552;
	int[] anIntArray553;
	static Class240 aClass240_554 = new Class240();
	int anInt555;
	static int anInt556;
	int anInt557;
	int anInt558;
	int anInt559;
	static int anInt560;
	int anInt561;
	int anInt562;
	int anInt563;
	int[][] anIntArrayArray564;
	int anInt565;
	int anInt566;
	int anInt567;
	int anInt568;
	int anInt569;
	static int anInt570;
	int anInt571;
	static OutgoingPacket ACTION_BUTTON7 = new OutgoingPacket(19, 8);
	int anInt573;
	int anInt574;
	int anInt575;

	final int method337(int i) {
		try {
			anInt539++;
			if (((Class39) this).anInt528 != i)
				return ((Class39) this).anInt528;
			if (((Class39) this).anIntArray547 != null) {
				int i_0_ = (int) (Math.random() * (double) anInt548);
				int i_1_;
				for (i_1_ = 0; i_0_ >= ((Class39) this).anIntArray544[i_1_]; i_1_++)
					i_0_ -= ((Class39) this).anIntArray544[i_1_];
				return ((Class39) this).anIntArray547[i_1_];
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jda.E(" + i + ')');
		}
	}

	public static void method338(int i) {
		try {
			ACTION_BUTTON7 = null;
			int i_2_ = 54 % ((i + 8) / 59);
			aClass240_554 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jda.D(" + i + ')');
		}
	}

	final boolean method339(int i, byte i_3_) {
		try {
			anInt560++;
			if ((i ^ 0xffffffff) == 0)
				return false;
			if (((Class39) this).anInt528 == i)
				return true;
			if (((Class39) this).anIntArray547 != null) {
				for (int i_4_ = 0; ((((Class39) this).anIntArray547.length ^ 0xffffffff) < (i_4_ ^ 0xffffffff)); i_4_++) {
					if (i == ((Class39) this).anIntArray547[i_4_])
						return true;
				}
			}
			int i_5_ = 60 % ((-13 - i_3_) / 39);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jda.A(" + i + ','
					+ i_3_ + ')');
		}
	}

	final void method340(Stream stream, int i) {
		do {
			try {
				anInt522++;
				for (;;) {
					int i_6_ = stream.readUnsignedByte((byte) 35);
					if ((i_6_ ^ 0xffffffff) == -1)
						break;
					method342(stream, -65536, i_6_);
				}
				if (i < -31)
					break;
				method342(null, 99, 57);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("jda.B("
						+ (stream != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final Class33[] method341(Class163 class163, int i) {
		try {
			anInt530++;
			if (aClass33Array549 != null
					&& anInt523 == ((Class163) class163).anInt2103)
				return aClass33Array549;
			if (((Class39) this).anIntArrayArray564 == null)
				return null;
			aClass33Array549 = new Class33[((Class39) this).anIntArrayArray564.length];
			int i_7_ = 0;
			int i_8_ = -3 % ((i - 25) / 53);
			for (/**/; ((Class39) this).anIntArrayArray564.length > i_7_; i_7_++) {
				int i_9_ = 0;
				int i_10_ = 0;
				int i_11_ = 0;
				int i_12_ = 0;
				int i_13_ = 0;
				int i_14_ = 0;
				if (((Class39) this).anIntArrayArray564[i_7_] != null) {
					i_12_ = ((Class39) this).anIntArrayArray564[i_7_][3] << 3;
					i_13_ = ((Class39) this).anIntArrayArray564[i_7_][4] << 3;
					i_10_ = ((Class39) this).anIntArrayArray564[i_7_][1];
					i_14_ = ((Class39) this).anIntArrayArray564[i_7_][5] << 3;
					i_9_ = ((Class39) this).anIntArrayArray564[i_7_][0];
					i_11_ = ((Class39) this).anIntArrayArray564[i_7_][2];
				}
				if ((i_9_ ^ 0xffffffff) != -1 || i_10_ != 0 || i_11_ != 0
						|| (i_12_ ^ 0xffffffff) != -1 || i_13_ != 0
						|| i_14_ != 0) {
					Class33 class33 = aClass33Array549[i_7_] = class163
							.method1041();
					if ((i_14_ ^ 0xffffffff) != -1)
						class33.method297(i_14_);
					if (i_12_ != 0)
						class33.method303(i_12_);
					if ((i_13_ ^ 0xffffffff) != -1)
						class33.method293(i_13_);
					class33.method299(i_9_, i_10_, i_11_);
				}
			}
			return aClass33Array549;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jda.F("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	private final void method342(Stream stream, int i, int i_15_) {
		try {
			if (i_15_ != 1) {
				if ((i_15_ ^ 0xffffffff) != -3) {
					if (i_15_ != 3) {
						if (i_15_ == 4)
							((Class39) this).anInt551 = stream
									.readUnsignedShort((byte) -65);
						else if (i_15_ == 5)
							((Class39) this).anInt546 = stream
									.readUnsignedShort((byte) -65);
						else if (i_15_ == 6)
							((Class39) this).anInt525 = stream
									.readUnsignedShort((byte) -65);
						else if ((i_15_ ^ 0xffffffff) == -8)
							((Class39) this).anInt573 = stream
									.readUnsignedShort((byte) -65);
						else if (i_15_ == 8)
							((Class39) this).anInt569 = stream
									.readUnsignedShort((byte) -65);
						else if (i_15_ != 9) {
							if (i_15_ != 26) {
								if ((i_15_ ^ 0xffffffff) != -28) {
									if ((i_15_ ^ 0xffffffff) == -29) {
										((Class39) this).anIntArray553 = new int[12];
										for (int i_16_ = 0; i_16_ < 12; i_16_++) {
											((Class39) this).anIntArray553[i_16_] = stream
													.readUnsignedByte((byte) 35);
											if (((((Class39) this).anIntArray553[i_16_]) ^ 0xffffffff) == -256)
												((Class39) this).anIntArray553[i_16_] = -1;
										}
									} else if ((i_15_ ^ 0xffffffff) == -30)
										((Class39) this).anInt526 = stream
												.readUnsignedByte((byte) 35);
									else if ((i_15_ ^ 0xffffffff) != -31) {
										if ((i_15_ ^ 0xffffffff) != -32) {
											if (i_15_ != 32) {
												if ((i_15_ ^ 0xffffffff) == -34)
													((Class39) this).anInt562 = (stream
															.method2508((byte) 92));
												else if (i_15_ == 34)
													((Class39) this).anInt550 = (stream
															.readUnsignedByte((byte) 35));
												else if ((i_15_ ^ 0xffffffff) != -36) {
													if ((i_15_ ^ 0xffffffff) != -37) {
														if (i_15_ == 37)
															((Class39) this).anInt533 = (stream
																	.readUnsignedByte((byte) 35));
														else if (i_15_ == 38)
															((Class39) this).anInt538 = (stream
																	.readUnsignedShort((byte) -65));
														else if (i_15_ != 39) {
															if (i_15_ == 40)
																((Class39) this).anInt567 = (stream
																		.readUnsignedShort((byte) -65));
															else if ((i_15_ ^ 0xffffffff) != -42) {
																if ((i_15_ ^ 0xffffffff) != -43) {
																	if (i_15_ == 43)
																		((Class39) this).anInt542 = stream
																				.readUnsignedShort((byte) -65);
																	else if ((i_15_ ^ 0xffffffff) != -45) {
																		if ((i_15_ ^ 0xffffffff) == -46)
																			((Class39) this).anInt565 = stream
																					.readUnsignedShort((byte) -65);
																		else if ((i_15_ ^ 0xffffffff) != -47) {
																			if (i_15_ != 47) {
																				if (i_15_ == 48)
																					((Class39) this).anInt527 = stream
																							.readUnsignedShort((byte) -65);
																				else if (i_15_ == 49)
																					((Class39) this).anInt574 = stream
																							.readUnsignedShort((byte) -65);
																				else if (i_15_ != 50) {
																					if ((i_15_ ^ 0xffffffff) == -52)
																						((Class39) this).anInt532 = stream
																								.readUnsignedShort((byte) -65);
																					else if ((i_15_ ^ 0xffffffff) == -53) {
																						int i_17_ = stream
																								.readUnsignedByte((byte) 35);
																						((Class39) this).anIntArray544 = new int[i_17_];
																						((Class39) this).anIntArray547 = new int[i_17_];
																						for (int i_18_ = 0; i_17_ > i_18_; i_18_++) {
																							((Class39) this).anIntArray547[i_18_] = stream
																									.readUnsignedShort((byte) -65);
																							int i_19_ = stream
																									.readUnsignedByte((byte) 35);
																							((Class39) this).anIntArray544[i_18_] = i_19_;
																							anInt548 += i_19_;
																						}
																					} else if ((i_15_ ^ 0xffffffff) == -54)
																						((Class39) this).aBool534 = false;
																					else if ((i_15_ ^ 0xffffffff) != -55) {
																						if (i_15_ == 55) {
																							if (((Class39) this).anIntArray537 == null)
																								((Class39) this).anIntArray537 = new int[12];
																							int i_20_ = stream
																									.readUnsignedByte((byte) 35);
																							((Class39) this).anIntArray537[i_20_] = stream
																									.readUnsignedShort((byte) -65);
																						} else if ((i_15_ ^ 0xffffffff) == -57) {
																							if (((Class39) this).anIntArrayArray529 == null)
																								((Class39) this).anIntArrayArray529 = new int[12][];
																							int i_21_ = stream
																									.readUnsignedByte((byte) 35);
																							((Class39) this).anIntArrayArray529[i_21_] = new int[3];
																							for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > -4; i_22_++)
																								((Class39) this).anIntArrayArray529[i_21_][i_22_] = stream
																										.method2508((byte) -78);
																						}
																					} else {
																						((Class39) this).anInt535 = stream
																								.readUnsignedByte((byte) 35) << 6;
																						((Class39) this).anInt575 = stream
																								.readUnsignedByte((byte) 35) << 6;
																					}
																				} else
																					((Class39) this).anInt559 = stream
																							.readUnsignedShort((byte) -65);
																			} else
																				((Class39) this).anInt557 = stream
																						.readUnsignedShort((byte) -65);
																		} else
																			((Class39) this).anInt566 = stream
																					.readUnsignedShort((byte) -65);
																	} else
																		((Class39) this).anInt545 = stream
																				.readUnsignedShort((byte) -65);
																} else
																	((Class39) this).anInt531 = (stream
																			.readUnsignedShort((byte) -65));
															} else
																((Class39) this).anInt524 = (stream
																		.readUnsignedShort((byte) -65));
														} else
															((Class39) this).anInt552 = (stream
																	.readUnsignedShort((byte) -65));
													} else
														((Class39) this).anInt563 = (stream
																.method2508((byte) 71));
												} else
													((Class39) this).anInt536 = (stream
															.readUnsignedShort((byte) -65));
											} else
												((Class39) this).anInt543 = (stream
														.readUnsignedShort((byte) -65));
										} else
											((Class39) this).anInt541 = stream
													.readUnsignedByte((byte) 35);
									} else
										((Class39) this).anInt521 = stream
												.readUnsignedShort((byte) -65);
								} else {
									if (((Class39) this).anIntArrayArray564 == null)
										((Class39) this).anIntArrayArray564 = new int[12][];
									int i_23_ = stream
											.readUnsignedByte((byte) 35);
									((Class39) this).anIntArrayArray564[i_23_] = new int[6];
									for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > -7; i_24_++)
										((Class39) this).anIntArrayArray564[i_23_][i_24_] = stream
												.method2508((byte) 45);
								}
							} else {
								((Class39) this).anInt558 = (short) (4 * stream
										.readUnsignedByte((byte) 35));
								((Class39) this).anInt571 = (short) (4 * stream
										.readUnsignedByte((byte) 35));
							}
						} else
							((Class39) this).anInt555 = stream
									.readUnsignedShort((byte) -65);
					} else
						((Class39) this).anInt568 = stream
								.readUnsignedShort((byte) -65);
				} else
					((Class39) this).anInt540 = stream
							.readUnsignedShort((byte) -65);
			} else {
				((Class39) this).anInt528 = stream
						.readUnsignedShort((byte) -65);
				((Class39) this).anInt561 = stream
						.readUnsignedShort((byte) -65);
				if ((((Class39) this).anInt561 ^ 0xffffffff) == -65536)
					((Class39) this).anInt561 = -1;
				if ((((Class39) this).anInt528 ^ 0xffffffff) == -65536)
					((Class39) this).anInt528 = -1;
			}
			if (i == -65536)
				anInt570++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jda.C("
					+ (stream != null ? "{...}" : "null") + ',' + i + ','
					+ i_15_ + ')'));
		}
	}

	public Class39() {
		((Class39) this).anInt524 = -1;
		((Class39) this).anInt541 = 0;
		anInt523 = -1;
		((Class39) this).aBool534 = true;
		((Class39) this).anInt533 = -1;
		((Class39) this).anInt532 = -1;
		((Class39) this).anInt526 = 0;
		((Class39) this).anIntArray544 = null;
		((Class39) this).anInt543 = 0;
		((Class39) this).anInt536 = 0;
		((Class39) this).anInt535 = 0;
		anInt548 = 0;
		((Class39) this).anIntArray547 = null;
		((Class39) this).anInt551 = -1;
		((Class39) this).anInt528 = -1;
		((Class39) this).anInt545 = -1;
		((Class39) this).anInt525 = -1;
		((Class39) this).anInt563 = 0;
		((Class39) this).anInt550 = 0;
		((Class39) this).anInt542 = -1;
		((Class39) this).anInt562 = 0;
		((Class39) this).anInt546 = -1;
		((Class39) this).anInt540 = -1;
		((Class39) this).anInt561 = -1;
		((Class39) this).anInt558 = 0;
		((Class39) this).anInt566 = -1;
		((Class39) this).anInt565 = -1;
		((Class39) this).anInt552 = -1;
		((Class39) this).anInt555 = -1;
		((Class39) this).anInt568 = -1;
		((Class39) this).anInt559 = -1;
		((Class39) this).anInt557 = -1;
		((Class39) this).anInt573 = -1;
		((Class39) this).anInt567 = -1;
		((Class39) this).anInt574 = -1;
		((Class39) this).anInt575 = 0;
		((Class39) this).anInt538 = -1;
		((Class39) this).anInt569 = -1;
		((Class39) this).anInt571 = 0;
	}
}
