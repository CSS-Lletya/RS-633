/* Class11_Sub2_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub16 extends Class11_Sub2 {
	static int anInt9033;
	static String[] aStringArray9034 = new String[100];
	static int anInt9035;
	static int anInt9036;
	private int anInt9037 = 32768;
	static int anInt9038;
	static int anInt9039;
	static int anInt9040;
	static int anInt9041;
	static int anInt9042;
	static int anInt9043;

	public static void method3548(int i) {
		do {
			try {
				aStringArray9034 = null;
				if (i == -7286)
					break;
				anInt9038 = 127;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "oba.G(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method2263(int i, Stream stream, int i_0_) {
		while_138_: do {
			try {
				if (i != 3731)
					aStringArray9034 = null;
				anInt9039++;
				int i_1_ = i_0_;
				do {
					if (i_1_ != 0) {
						if (i_1_ != 1)
							break while_138_;
						if (!client.aBool10531)
							break;
					}
					anInt9037 = stream.readUnsignedShort((byte) -65) << 4;
					return;
				} while (false);
				((Class11_Sub2) this).aBool5044 = (stream
						.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2;
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("oba.B(" + i + ','
								+ (stream != null ? "{...}" : "null") + ','
								+ i_0_ + ')'));
			}
		} while (false);
	}

	final int[][] method2255(int i, int i_2_) {
		try {
			anInt9033++;
			if (i_2_ != 1)
				return null;
			int[][] is = ((Class11_Sub2) this).aClass291_5038.method1799(
					i_2_ - 1, i);
			if (((Class291) ((Class11_Sub2) this).aClass291_5038).aBool3943) {
				int[] is_3_ = this.method2260(4463, 1, i);
				int[] is_4_ = this.method2260(4463, 2, i);
				int[] is_5_ = is[0];
				int[] is_6_ = is[1];
				int[] is_7_ = is[2];
				for (int i_8_ = 0; i_8_ < Class33_Sub2.anInt6696; i_8_++) {
					int i_9_ = (0xff7c2 & is_3_[i_8_] * 255) >> 12;
					int i_10_ = anInt9037 * is_4_[i_8_] >> 12;
					int i_11_ = i_10_ * Class191.anIntArray2457[i_9_] >> 12;
					int i_12_ = i_10_ * Class11_Sub19.anIntArray5818[i_9_] >> 12;
					int i_13_ = Class297.anInt4024 & (i_11_ >> 12) + i_8_;
					int i_14_ = (Class11_Sub45_Sub16_Sub2.anInt10167 & (i_12_ >> 12)
							+ i);
					int[][] is_15_ = this.method2262(i_14_, 127, 0);
					is_5_[i_8_] = is_15_[0][i_13_];
					is_6_[i_8_] = is_15_[1][i_13_];
					is_7_[i_8_] = is_15_[2][i_13_];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oba.I(" + i + ','
					+ i_2_ + ')');
		}
	}

	final void method2256(int i) {
		try {
			if (i == 7) {
				Class234_Sub1_Sub1.method3829(false);
				anInt9040++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oba.D(" + i + ')');
		}
	}

	static final void method3549(int i, String string, int i_16_) {
		do {
			try {
				anInt9036++;
				if (i_16_ >= -75)
					aStringArray9034 = null;
				int i_17_ = Class190.anInt2446;
				int[] is = Class6.anIntArray40;
				boolean bool = false;
				for (int i_18_ = 0; i_17_ > i_18_; i_18_++) {
					Player class376_sub7_sub5_sub5_sub1 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[is[i_18_]]);
					if (class376_sub7_sub5_sub5_sub1 != null
							&& ((Class11_Sub2_Sub8.myPlayer) != class376_sub7_sub5_sub5_sub1)
							&& ((Player) class376_sub7_sub5_sub5_sub1).aString10400 != null
							&& ((Player) class376_sub7_sub5_sub5_sub1).aString10400
									.equalsIgnoreCase(string)) {
						bool = true;
						if ((i ^ 0xffffffff) == -2) {
							Class91_Sub1.anInt6938++;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class206.aClass370_2781),
											(byte) -52);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort128(is[i_18_], (byte) -50);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeByte128((byte) -5, 0);
							Class79.method541(class11_sub10, -82);
						} else if (i == 4) {
							Class11_Sub2_Sub28.anInt9428++;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class163_Sub3.aClass370_8216),
											(byte) -115);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeByte(0, -1528071456);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort128(is[i_18_], (byte) -78);
							Class79.method541(class11_sub10, -75);
						} else if ((i ^ 0xffffffff) == -6) {
							Class33_Sub1.anInt6180++;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class335_Sub1.aClass370_6445),
											(byte) -39);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE128((byte) 85, is[i_18_]);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeByte(0, -1528071456);
							Class79.method541(class11_sub10, -49);
						} else if (i != 6) {
							if (i == 7) {
								Class236_Sub2.anInt6209++;
								Class11_Sub10 class11_sub10 = (Class11_Sub48
										.method3215(Class11_Sub3.aClass25_5113,
												Class77.aClass370_1043,
												(byte) 64));
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeShort128(is[i_18_], (byte) -128);
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeByte(0, -1528071456);
								Class79.method541(class11_sub10, -31);
							}
						} else {
							Class143.anInt1928++;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class362.aClass370_4714),
											(byte) -95);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort128(is[i_18_], (byte) -120);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.method2553((byte) -108, 0);
							Class79.method541(class11_sub10, -80);
						}
						break;
					}
				}
				if (bool)
					break;
				Class11_Sub2_Sub28.method3715(
						true,
						4,
						Class26.aClass26_297.method217((byte) 105,
								(Class11_Sub45_Sub1_Sub2.anInt9884)) + string);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("oba.C(" + i + ','
								+ (string != null ? "{...}" : "null") + ','
								+ i_16_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method3550(String string, boolean bool) {
		try {
			anInt9042++;
			Class11_Sub10 class11_sub10 = Class11_Sub45_Sub6.method3441(-115);
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397.writeByte(
					((Class289) Class11_Sub37.aClass289_7103).opcode,
					-1528071456);
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
					.writeShort(-122, 0);
			int i = (((Stream) ((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397).position);
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
					.writeShort(-116, 633);
			int[] is = Class292.method1814(9108, class11_sub10);
			int i_19_ = (((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position);
			if (bool != false)
				anInt9038 = -121;
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
					.writeString((byte) 27, string);
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397.writeByte(
					Class11_Sub45_Sub1_Sub2.anInt9884, -1528071456);
			((Stream) ((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397).position += 7;
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
					.encryptXTEA(
							((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position,
							is, 116, i_19_);
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
					.endPacketVarShort(
							((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position
									+ -i, (byte) -87);
			Class79.method541(class11_sub10, -27);
			Class207.anInt2800 = 0;
			Class255.anInt3503 = 0;
			Class108_Sub6.anInt5632 = -3;
			Class313.anInt4162 = 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("oba.E("
					+ (string != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final int[] method2254(int i, boolean bool) {
		try {
			anInt9041++;
			if (bool != true)
				method3551(-50);
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
				int[] is_20_ = this.method2260(4463, 1, i);
				int[] is_21_ = this.method2260(4463, 2, i);
				for (int i_22_ = 0; ((i_22_ ^ 0xffffffff) > (Class33_Sub2.anInt6696 ^ 0xffffffff)); i_22_++) {
					int i_23_ = is_20_[i_22_] >> 4 & 0xff;
					int i_24_ = is_21_[i_22_] * anInt9037 >> 12;
					int i_25_ = Class191.anIntArray2457[i_23_] * i_24_ >> 12;
					int i_26_ = i_24_ * Class11_Sub19.anIntArray5818[i_23_] >> 12;
					int i_27_ = Class297.anInt4024 & (i_25_ >> 12) + i_22_;
					int i_28_ = (Class11_Sub45_Sub16_Sub2.anInt10167 & i
							+ (i_26_ >> 12));
					int[] is_29_ = this.method2260(4463, 0, i_28_);
					is[i_22_] = is_29_[i_27_];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oba.A(" + i + ','
					+ bool + ')');
		}
	}

	static final void method3551(int i) {
		try {
			Class11_Sub5.aClass22_5238.method190(0);
			anInt9035++;
			Class376_Sub7_Sub2_Sub1.aClass22_10204.method190(0);
			if (i <= 7)
				method3551(-67);
			Class256_Sub3.aClass22_7956.method190(0);
			Class220.aClass22_3025.method190(0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oba.F(" + i + ')');
		}
	}

	public Class11_Sub2_Sub16() {
		super(3, false);
	}
}
