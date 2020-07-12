/* Class11_Sub2_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub13 extends Class11_Sub2 {
	static int anInt8983;
	static int anInt8984;
	static int anInt8985;
	private int[] anIntArray8986 = new int[257];
	private int[][] anIntArrayArray8987;
	static int anInt8988;
	static int anInt8989;
	static int anInt8990;
	static int anInt8991;

	final void method2256(int i) {
		try {
			anInt8984++;
			if (anIntArrayArray8987 == null)
				method3536(77, 1);
			if (i != 7)
				anIntArrayArray8987 = null;
			method3534((byte) -39);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fg.D(" + i + ')');
		}
	}

	static final IComponentDefinitions method3533(byte i, int i_0_) {
		try {
			anInt8985++;
			int i_1_ = i_0_ >> 16;
			int i_2_ = i_0_ & 0xffff;
			if (Class11_Sub45_Sub5.aClass192ArrayArray8772[i_1_] == null
					|| (Class11_Sub45_Sub5.aClass192ArrayArray8772[i_1_][i_2_] == null)) {
				boolean bool = Class11_Sub16.method2449(119, i_1_);
				if (!bool)
					return null;
			}
			if (i > -77)
				return null;
			return Class11_Sub45_Sub5.aClass192ArrayArray8772[i_1_][i_2_];
		} catch (RuntimeException runtimeexception) {
			runtimeexception.printStackTrace();
			return null;
			// throw Class205.method1298(runtimeexception,
			// "fg.E(" + i + ',' + i_0_ + ')');
		}
	}

	final void method2263(int i, Stream stream, int i_3_) {
		do {
			try {
				if (i == 3731) {
					anInt8988++;
					if ((i_3_ ^ 0xffffffff) != -1)
						break;
					int i_4_ = stream.readUnsignedByte((byte) 35);
					if ((i_4_ ^ 0xffffffff) != -1)
						method3536(-128, i_4_);
					else {
						anIntArrayArray8987 = new int[stream
								.readUnsignedByte((byte) 35)][4];
						for (int i_5_ = 0; ((anIntArrayArray8987.length ^ 0xffffffff) < (i_5_ ^ 0xffffffff)); i_5_++) {
							anIntArrayArray8987[i_5_][0] = stream
									.readUnsignedShort((byte) -65);
							anIntArrayArray8987[i_5_][1] = stream
									.readUnsignedByte((byte) 35) << 4;
							anIntArrayArray8987[i_5_][2] = stream
									.readUnsignedByte((byte) 35) << 4;
							anIntArrayArray8987[i_5_][3] = stream
									.readUnsignedByte((byte) 35) << 4;
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("fg.B(" + i + ','
								+ (stream != null ? "{...}" : "null") + ','
								+ i_3_ + ')'));
			}
			break;
		} while (false);
	}

	private final void method3534(byte i) {
		do {
			try {
				anInt8991++;
				int i_6_ = -119 % ((15 - i) / 50);
				int i_7_ = anIntArrayArray8987.length;
				if ((i_7_ ^ 0xffffffff) >= -1)
					break;
				for (int i_8_ = 0; i_8_ < 257; i_8_++) {
					int i_9_ = 0;
					int i_10_ = i_8_ << 4;
					for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff); i_11_++) {
						if ((i_10_ ^ 0xffffffff) > (anIntArrayArray8987[i_11_][0] ^ 0xffffffff))
							break;
						i_9_++;
					}
					int i_12_;
					int i_13_;
					int i_14_;
					if (i_7_ > i_9_) {
						int[] is = anIntArrayArray8987[i_9_];
						if (i_9_ > 0) {
							int[] is_15_ = anIntArrayArray8987[-1 + i_9_];
							int i_16_ = ((-is_15_[0] + i_10_ << 12) / (-is_15_[0] + is[0]));
							int i_17_ = -i_16_ + 4096;
							i_12_ = is[2] * i_16_ + is_15_[2] * i_17_ >> 12;
							i_14_ = is[3] * i_16_ - -(is_15_[3] * i_17_) >> 12;
							i_13_ = i_17_ * is_15_[1] + i_16_ * is[1] >> 12;
						} else {
							i_14_ = is[3];
							i_13_ = is[1];
							i_12_ = is[2];
						}
					} else {
						int[] is = anIntArrayArray8987[-1 + i_7_];
						i_12_ = is[2];
						i_13_ = is[1];
						i_14_ = is[3];
					}
					i_12_ >>= 4;
					i_14_ >>= 4;
					i_13_ >>= 4;
					if ((i_13_ ^ 0xffffffff) > -1)
						i_13_ = 0;
					else if (i_13_ > 255)
						i_13_ = 255;
					if (i_14_ < 0)
						i_14_ = 0;
					else if ((i_14_ ^ 0xffffffff) < -256)
						i_14_ = 255;
					if ((i_12_ ^ 0xffffffff) <= -1) {
						if (i_12_ > 255)
							i_12_ = 255;
					} else
						i_12_ = 0;
					anIntArray8986[i_8_] = Class173
							.method1134(Class173.method1134(i_12_ << 8,
									i_13_ << 16), i_14_);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "fg.G(" + i + ')');
			}
			break;
		} while (false);
	}

	public Class11_Sub2_Sub13() {
		super(1, false);
	}

	static final int method3535(byte i, boolean bool, int i_18_, int i_19_) {
		try {
			if (i != 24)
				return 120;
			anInt8983++;
			Class11_Sub37 class11_sub37 = Class26.method218(bool, i ^ ~0x2665,
					i_18_);
			if (class11_sub37 == null)
				return -1;
			if (i_19_ < 0
					|| ((i_19_ ^ 0xffffffff) <= (((Class11_Sub37) class11_sub37).anIntArray7082.length ^ 0xffffffff)))
				return -1;
			return ((Class11_Sub37) class11_sub37).anIntArray7082[i_19_];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fg.F(" + i + ','
					+ bool + ',' + i_18_ + ',' + i_19_ + ')'));
		}
	}

	final int[][] method2255(int i, int i_20_) {
		try {
			anInt8989++;
			if (i_20_ != 1)
				anIntArray8986 = null;
			int[][] is = ((Class11_Sub2) this).aClass291_5038.method1799(0, i);
			if (((Class291) ((Class11_Sub2) this).aClass291_5038).aBool3943) {
				int[] is_21_ = this.method2260(4463, 0, i);
				int[] is_22_ = is[0];
				int[] is_23_ = is[1];
				int[] is_24_ = is[2];
				for (int i_25_ = 0; ((i_25_ ^ 0xffffffff) > (Class33_Sub2.anInt6696 ^ 0xffffffff)); i_25_++) {
					int i_26_ = is_21_[i_25_] >> 4;
					if ((i_26_ ^ 0xffffffff) > -1)
						i_26_ = 0;
					if (i_26_ > 256)
						i_26_ = 256;
					i_26_ = anIntArray8986[i_26_];
					is_22_[i_25_] = Class77.method529(i_26_, 16711680) >> 12;
					is_23_[i_25_] = Class77.method529(65280, i_26_) >> 4;
					is_24_[i_25_] = Class77.method529(i_26_ << 4, 4080);
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fg.I(" + i + ','
					+ i_20_ + ')');
		}
	}

	private final void method3536(int i, int i_27_) {
		try {
			anInt8990++;
			while_121_: do {
				if ((i_27_ ^ 0xffffffff) != -1) {
					int i_28_ = i_27_;
					while_120_: do {
						while_119_: do {
							while_118_: do {
								while_117_: do {
									do {
										if (i_28_ != 1) {
											if ((i_28_ ^ 0xffffffff) != -3) {
												if ((i_28_ ^ 0xffffffff) != -4) {
													if (i_28_ != 4) {
														if (i_28_ != 5) {
															if ((i_28_ ^ 0xffffffff) != -7)
																break while_120_;
														} else
															break while_118_;
														break while_119_;
													}
												} else
													break;
												break while_117_;
											}
										} else {
											anIntArrayArray8987 = new int[2][4];
											anIntArrayArray8987[0][2] = 0;
											anIntArrayArray8987[0][1] = 0;
											anIntArrayArray8987[0][0] = 0;
											anIntArrayArray8987[0][3] = 0;
											anIntArrayArray8987[1][3] = 4096;
											anIntArrayArray8987[1][2] = 4096;
											anIntArrayArray8987[1][0] = 4096;
											anIntArrayArray8987[1][1] = 4096;
											break while_121_;
										}
										anIntArrayArray8987 = new int[8][4];
										anIntArrayArray8987[0][2] = 2602;
										anIntArrayArray8987[0][0] = 0;
										anIntArrayArray8987[0][1] = 2650;
										anIntArrayArray8987[0][3] = 2361;
										anIntArrayArray8987[1][1] = 2313;
										anIntArrayArray8987[1][2] = 1799;
										anIntArrayArray8987[1][0] = 2867;
										anIntArrayArray8987[1][3] = 1558;
										anIntArrayArray8987[2][2] = 1734;
										anIntArrayArray8987[2][1] = 2618;
										anIntArrayArray8987[2][0] = 3072;
										anIntArrayArray8987[2][3] = 1413;
										anIntArrayArray8987[3][2] = 1220;
										anIntArrayArray8987[3][0] = 3276;
										anIntArrayArray8987[3][3] = 947;
										anIntArrayArray8987[3][1] = 2296;
										anIntArrayArray8987[4][3] = 722;
										anIntArrayArray8987[4][0] = 3481;
										anIntArrayArray8987[4][2] = 963;
										anIntArrayArray8987[4][1] = 2072;
										anIntArrayArray8987[5][3] = 1766;
										anIntArrayArray8987[5][1] = 2730;
										anIntArrayArray8987[5][2] = 2152;
										anIntArrayArray8987[5][0] = 3686;
										anIntArrayArray8987[6][0] = 3891;
										anIntArrayArray8987[6][1] = 2232;
										anIntArrayArray8987[6][3] = 915;
										anIntArrayArray8987[6][2] = 1060;
										anIntArrayArray8987[7][0] = 4096;
										anIntArrayArray8987[7][1] = 1686;
										anIntArrayArray8987[7][3] = 1140;
										anIntArrayArray8987[7][2] = 1413;
										break while_121_;
									} while (false);
									anIntArrayArray8987 = new int[7][4];
									anIntArrayArray8987[0][0] = 0;
									anIntArrayArray8987[0][1] = 0;
									anIntArrayArray8987[0][2] = 0;
									anIntArrayArray8987[0][3] = 4096;
									anIntArrayArray8987[1][0] = 663;
									anIntArrayArray8987[1][1] = 0;
									anIntArrayArray8987[1][3] = 4096;
									anIntArrayArray8987[1][2] = 4096;
									anIntArrayArray8987[2][1] = 0;
									anIntArrayArray8987[2][2] = 4096;
									anIntArrayArray8987[2][3] = 0;
									anIntArrayArray8987[2][0] = 1363;
									anIntArrayArray8987[3][0] = 2048;
									anIntArrayArray8987[3][3] = 0;
									anIntArrayArray8987[3][1] = 4096;
									anIntArrayArray8987[3][2] = 4096;
									anIntArrayArray8987[4][3] = 0;
									anIntArrayArray8987[4][2] = 0;
									anIntArrayArray8987[4][0] = 2727;
									anIntArrayArray8987[4][1] = 4096;
									anIntArrayArray8987[5][3] = 4096;
									anIntArrayArray8987[5][0] = 3411;
									anIntArrayArray8987[5][1] = 4096;
									anIntArrayArray8987[5][2] = 0;
									anIntArrayArray8987[6][2] = 0;
									anIntArrayArray8987[6][1] = 0;
									anIntArrayArray8987[6][0] = 4096;
									anIntArrayArray8987[6][3] = 4096;
									break while_121_;
								} while (false);
								anIntArrayArray8987 = new int[6][4];
								anIntArrayArray8987[0][2] = 0;
								anIntArrayArray8987[0][0] = 0;
								anIntArrayArray8987[0][3] = 0;
								anIntArrayArray8987[0][1] = 0;
								anIntArrayArray8987[1][0] = 1843;
								anIntArrayArray8987[1][2] = 0;
								anIntArrayArray8987[1][3] = 1493;
								anIntArrayArray8987[1][1] = 0;
								anIntArrayArray8987[2][3] = 2939;
								anIntArrayArray8987[2][1] = 0;
								anIntArrayArray8987[2][0] = 2457;
								anIntArrayArray8987[2][2] = 0;
								anIntArrayArray8987[3][1] = 0;
								anIntArrayArray8987[3][0] = 2781;
								anIntArrayArray8987[3][3] = 3565;
								anIntArrayArray8987[3][2] = 1124;
								anIntArrayArray8987[4][0] = 3481;
								anIntArrayArray8987[4][1] = 546;
								anIntArrayArray8987[4][2] = 3084;
								anIntArrayArray8987[4][3] = 4031;
								anIntArrayArray8987[5][3] = 4096;
								anIntArrayArray8987[5][1] = 4096;
								anIntArrayArray8987[5][0] = 4096;
								anIntArrayArray8987[5][2] = 4096;
								break while_121_;
							} while (false);
							anIntArrayArray8987 = new int[16][4];
							anIntArrayArray8987[0][0] = 0;
							anIntArrayArray8987[0][1] = 80;
							anIntArrayArray8987[0][2] = 192;
							anIntArrayArray8987[0][3] = 321;
							anIntArrayArray8987[1][0] = 155;
							anIntArrayArray8987[1][2] = 449;
							anIntArrayArray8987[1][1] = 321;
							anIntArrayArray8987[1][3] = 562;
							anIntArrayArray8987[2][1] = 578;
							anIntArrayArray8987[2][0] = 389;
							anIntArrayArray8987[2][2] = 690;
							anIntArrayArray8987[2][3] = 803;
							anIntArrayArray8987[3][2] = 995;
							anIntArrayArray8987[3][0] = 671;
							anIntArrayArray8987[3][3] = 1140;
							anIntArrayArray8987[3][1] = 947;
							anIntArrayArray8987[4][2] = 1397;
							anIntArrayArray8987[4][3] = 1509;
							anIntArrayArray8987[4][0] = 897;
							anIntArrayArray8987[4][1] = 1285;
							anIntArrayArray8987[5][1] = 1525;
							anIntArrayArray8987[5][2] = 1429;
							anIntArrayArray8987[5][3] = 1413;
							anIntArrayArray8987[5][0] = 1175;
							anIntArrayArray8987[6][3] = 1333;
							anIntArrayArray8987[6][2] = 1461;
							anIntArrayArray8987[6][0] = 1368;
							anIntArrayArray8987[6][1] = 1734;
							anIntArrayArray8987[7][0] = 1507;
							anIntArrayArray8987[7][1] = 1413;
							anIntArrayArray8987[7][3] = 1702;
							anIntArrayArray8987[7][2] = 1525;
							anIntArrayArray8987[8][3] = 2056;
							anIntArrayArray8987[8][2] = 1590;
							anIntArrayArray8987[8][0] = 1736;
							anIntArrayArray8987[8][1] = 1108;
							anIntArrayArray8987[9][3] = 2666;
							anIntArrayArray8987[9][0] = 2088;
							anIntArrayArray8987[9][1] = 1766;
							anIntArrayArray8987[9][2] = 2056;
							anIntArrayArray8987[10][3] = 3276;
							anIntArrayArray8987[10][0] = 2355;
							anIntArrayArray8987[10][2] = 2586;
							anIntArrayArray8987[10][1] = 2409;
							anIntArrayArray8987[11][2] = 3148;
							anIntArrayArray8987[11][1] = 3116;
							anIntArrayArray8987[11][3] = 3228;
							anIntArrayArray8987[11][0] = 2691;
							anIntArrayArray8987[12][1] = 3806;
							anIntArrayArray8987[12][3] = 3196;
							anIntArrayArray8987[12][0] = 3031;
							anIntArrayArray8987[12][2] = 3710;
							anIntArrayArray8987[13][0] = 3522;
							anIntArrayArray8987[13][1] = 3437;
							anIntArrayArray8987[13][3] = 3019;
							anIntArrayArray8987[13][2] = 3421;
							anIntArrayArray8987[14][1] = 3116;
							anIntArrayArray8987[14][2] = 3148;
							anIntArrayArray8987[14][3] = 3228;
							anIntArrayArray8987[14][0] = 3727;
							anIntArrayArray8987[15][0] = 4096;
							anIntArrayArray8987[15][2] = 2505;
							anIntArrayArray8987[15][1] = 2377;
							anIntArrayArray8987[15][3] = 2746;
							break while_121_;
						} while (false);
						anIntArrayArray8987 = new int[4][4];
						anIntArrayArray8987[0][0] = 2048;
						anIntArrayArray8987[0][2] = 4096;
						anIntArrayArray8987[0][3] = 0;
						anIntArrayArray8987[0][1] = 0;
						anIntArrayArray8987[1][0] = 2867;
						anIntArrayArray8987[1][2] = 4096;
						anIntArrayArray8987[1][3] = 0;
						anIntArrayArray8987[1][1] = 4096;
						anIntArrayArray8987[2][0] = 3276;
						anIntArrayArray8987[2][3] = 0;
						anIntArrayArray8987[2][1] = 4096;
						anIntArrayArray8987[2][2] = 4096;
						anIntArrayArray8987[3][3] = 0;
						anIntArrayArray8987[3][1] = 4096;
						anIntArrayArray8987[3][2] = 0;
						anIntArrayArray8987[3][0] = 4096;
						break while_121_;
					} while (false);
					throw new RuntimeException("Invalid gradient preset");
				}
			} while (false);
			int i_29_ = 4 % ((i + 64) / 54);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fg.C(" + i + ','
					+ i_27_ + ')');
		}
	}
}
