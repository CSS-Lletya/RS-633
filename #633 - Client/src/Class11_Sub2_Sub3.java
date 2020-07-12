/* Class11_Sub2_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub3 extends Class11_Sub2 {
	static Class150 aClass150_8466;
	private int anInt8467;
	static int anInt8468;
	private int anInt8469 = 0;
	static int anInt8470;
	private int anInt8471;
	private int anInt8472;
	static boolean aBool8473 = true;
	static int anInt8474;
	static int anInt8475;
	private int anInt8476;
	private int anInt8477 = 0;
	static int anInt8478;
	static int anInt8479;
	static int anInt8480;
	private int anInt8481;
	static int anInt8482;
	private int anInt8483 = 0;
	private int anInt8484;

	static final boolean method3338(byte i, String string) {
		try {
			int i_0_ = 68 % ((i - 73) / 53);
			anInt8470++;
			return Class11_Sub3.aHashtable5114.containsKey(string);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("o.G(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2263(int i, Stream stream, int i_1_) {
		while_97_: do {
			try {
				if (i != 3731)
					anInt8467 = 7;
				anInt8480++;
				int i_2_ = i_1_;
				while_96_: do {
					do {
						if (i_2_ != 0) {
							if (i_2_ == 1)
								break;
							if ((i_2_ ^ 0xffffffff) != -3)
								break while_97_;
							if (!client.aBool10531)
								break while_96_;
						}
						anInt8483 = stream.method2508((byte) -117);
						return;
					} while (false);
					anInt8469 = (stream.readByte(1854307120) << 12) / 100;
					return;
				} while (false);
				anInt8477 = (stream.readByte(1854307120) << 12) / 100;
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("o.B(" + i + ',' + (stream != null ? "{...}" : "null")
								+ ',' + i_1_ + ')'));
			}
		} while (false);
	}

	static final void method3339(boolean bool, byte i,
			Class11_Sub6_Sub2 class11_sub6_sub2) {
		do {
			try {
				if (i > -6)
					method3343((byte) 76);
				anInt8475++;
				Class254.aClass37_3498.method326(true, class11_sub6_sub2);
				if (!bool)
					break;
				Class211.method1351(Class135.aClass146_1863, 93,
						class11_sub6_sub2, Class254.aClass37_3498,
						Class11_Sub2_Sub2.aClass146_8461,
						Class280.aClass146_3789);
			} catch (RuntimeException runtimeexception) {
				throw Class205
						.method1298(runtimeexception,
								("o.F("
										+ bool
										+ ','
										+ i
										+ ','
										+ (class11_sub6_sub2 != null ? "{...}"
												: "null") + ')'));
			}
			break;
		} while (false);
	}

	final int[][] method2255(int i, int i_3_) {
		try {
			anInt8468++;
			if (i_3_ != 1)
				anInt8469 = 110;
			int[][] is = ((Class11_Sub2) this).aClass291_5038.method1799(0, i);
			if (((Class291) ((Class11_Sub2) this).aClass291_5038).aBool3943) {
				int[][] is_4_ = this.method2262(i, 125, 0);
				int[] is_5_ = is_4_[0];
				int[] is_6_ = is_4_[1];
				int[] is_7_ = is_4_[2];
				int[] is_8_ = is[0];
				int[] is_9_ = is[1];
				int[] is_10_ = is[2];
				for (int i_11_ = 0; ((i_11_ ^ 0xffffffff) > (Class33_Sub2.anInt6696 ^ 0xffffffff)); i_11_++) {
					method3340(-125, is_7_[i_11_], is_6_[i_11_], is_5_[i_11_]);
					anInt8481 += anInt8477;
					anInt8484 += anInt8483;
					anInt8471 += anInt8469;
					for (/**/; anInt8484 < 0; anInt8484 += 4096) {
						/* empty */
					}
					for (/**/; (anInt8484 ^ 0xffffffff) < -4097; anInt8484 -= 4096) {
						/* empty */
					}
					if ((anInt8471 ^ 0xffffffff) > -1)
						anInt8471 = 0;
					if (anInt8471 > 4096)
						anInt8471 = 4096;
					if (anInt8481 < 0)
						anInt8481 = 0;
					if (anInt8481 > 4096)
						anInt8481 = 4096;
					method3342(anInt8471, anInt8484, (byte) -98, anInt8481);
					is_8_[i_11_] = anInt8472;
					is_9_[i_11_] = anInt8467;
					is_10_[i_11_] = anInt8476;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "o.I(" + i + ',' + i_3_
					+ ')');
		}
	}

	private final void method3340(int i, int i_12_, int i_13_, int i_14_) {
		do {
			try {
				anInt8482++;
				int i_15_ = ((i_14_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff) ? i_14_
						: i_13_);
				i_15_ = ((i_12_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff) ? i_12_
						: i_15_);
				int i_16_ = ((i_14_ ^ 0xffffffff) <= (i_13_ ^ 0xffffffff) ? i_13_
						: i_14_);
				i_16_ = i_12_ >= i_16_ ? i_16_ : i_12_;
				anInt8481 = (i_15_ + i_16_) / 2;
				int i_17_ = i_15_ - i_16_;
				if ((anInt8481 ^ 0xffffffff) >= -1 || anInt8481 >= 4096)
					anInt8471 = 0;
				else
					anInt8471 = (i_17_ << 12)
							/ ((anInt8481 ^ 0xffffffff) >= -2049 ? 2 * anInt8481
									: 8192 - 2 * anInt8481);
				if (i_17_ > 0) {
					int i_18_ = (-i_14_ + i_15_ << 12) / i_17_;
					int i_19_ = (-i_13_ + i_15_ << 12) / i_17_;
					int i_20_ = (-i_12_ + i_15_ << 12) / i_17_;
					if (i_15_ == i_14_)
						anInt8484 = i_13_ == i_16_ ? 20480 + i_20_
								: 4096 + -i_19_;
					else if (i_15_ == i_13_)
						anInt8484 = i_12_ != i_16_ ? 12288 + -i_20_
								: i_18_ + 4096;
					else
						anInt8484 = ((i_14_ ^ 0xffffffff) != (i_16_ ^ 0xffffffff) ? 20480 + -i_18_
								: i_19_ + 12288);
					anInt8484 /= 6;
				} else
					anInt8484 = 0;
				if (i < -92)
					break;
				anInt8467 = -22;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("o.J(" + i + ','
						+ i_12_ + ',' + i_13_ + ',' + i_14_ + ')'));
			}
			break;
		} while (false);
	}

	public Class11_Sub2_Sub3() {
		super(1, false);
	}

	static final void method3341(boolean bool) {
		try {
			synchronized (Class376_Sub1_Sub1.aClass22_8685) {
				Class376_Sub1_Sub1.aClass22_8685.method189((byte) -127);
			}
			anInt8474++;
			if (bool == true) {
				synchronized (Class186.aClass22_2379) {
					Class186.aClass22_2379.method189((byte) -125);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "o.H(" + bool + ')');
		}
	}

	private final void method3342(int i, int i_21_, byte i_22_, int i_23_) {
		do {
			try {
				anInt8479++;
				int i_24_ = (i_23_ <= 2048 ? i_23_ * (i + 4096) >> 12 : i
						+ i_23_ - (i_23_ * i >> 12));
				while_101_: do {
					if (i_24_ <= 0)
						anInt8472 = anInt8467 = anInt8476 = i_23_;
					else {
						i_21_ *= 6;
						int i_25_ = -i_24_ + (i_23_ + i_23_);
						int i_26_ = (-i_25_ + i_24_ << 12) / i_24_;
						int i_27_ = i_21_ >> 12;
						int i_28_ = -(i_27_ << 12) + i_21_;
						int i_29_ = i_24_;
						i_29_ = i_26_ * i_29_ >> 12;
						i_29_ = i_28_ * i_29_ >> 12;
						int i_30_ = i_29_ + i_25_;
						int i_31_ = -i_29_ + i_24_;
						int i_32_ = i_27_;
						while_100_: do {
							while_99_: do {
								while_98_: do {
									do {
										if ((i_32_ ^ 0xffffffff) != -1) {
											if ((i_32_ ^ 0xffffffff) != -2) {
												if (i_32_ != 2) {
													if (i_32_ != 3) {
														if ((i_32_ ^ 0xffffffff) != -5) {
															if (i_32_ != 5)
																break while_101_;
														} else
															break while_99_;
														break while_100_;
													}
												} else
													break;
												break while_98_;
											}
										} else {
											anInt8472 = i_24_;
											anInt8467 = i_30_;
											anInt8476 = i_25_;
											break while_101_;
										}
										anInt8467 = i_24_;
										anInt8472 = i_31_;
										anInt8476 = i_25_;
										break while_101_;
									} while (false);
									anInt8467 = i_24_;
									anInt8476 = i_30_;
									anInt8472 = i_25_;
									break while_101_;
								} while (false);
								anInt8472 = i_25_;
								anInt8476 = i_24_;
								anInt8467 = i_31_;
								break while_101_;
							} while (false);
							anInt8467 = i_25_;
							anInt8476 = i_24_;
							anInt8472 = i_30_;
							break while_101_;
						} while (false);
						anInt8472 = i_24_;
						anInt8476 = i_31_;
						anInt8467 = i_25_;
					}
				} while (false);
				if (i_22_ == -98)
					break;
				anInt8476 = 49;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("o.C(" + i + ','
						+ i_21_ + ',' + i_22_ + ',' + i_23_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method3343(byte i) {
		try {
			aClass150_8466 = null;
			int i_33_ = 120 / ((-56 - i) / 37);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "o.E(" + i + ')');
		}
	}

	static {
		aClass150_8466 = new Class150();
	}
}
