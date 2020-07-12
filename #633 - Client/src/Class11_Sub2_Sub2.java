/* Class11_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub2 extends Class11_Sub2 {
	static int anInt8453;
	static int anInt8454;
	static OutgoingPacket aClass370_8455 = new OutgoingPacket(21, 3);
	static int anInt8456;
	static int anInt8457;
	static int anInt8458;
	static int anInt8459;
	static int anInt8460;
	static Class146 aClass146_8461;
	private Class256[] aClass256Array8462;
	static Class240 aClass240_8463 = new Class240();
	static int anInt8464;
	static int anInt8465;

	static final int method3332(int i, byte i_0_) {
		try {
			anInt8465++;
			if (i_0_ != -128)
				return 69;
			return i >>> 8;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "c.J(" + i + ',' + i_0_
					+ ')');
		}
	}

	final int[] method2254(int i, boolean bool) {
		try {
			anInt8464++;
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (bool != true)
				method3334((byte) -5);
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421)
				method3336(-1,
						((Class11_Sub2) this).aClass105_5043.method692(bool));
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "c.A(" + i + ',' + bool
					+ ')');
		}
	}

	static final Class11_Sub10 method3333(boolean bool) {
		try {
			anInt8457++;
			if (bool != false)
				anInt8459 = -119;
			if ((Class240.anInt3257 ^ 0xffffffff) == -1)
				return new Class11_Sub10();
			return Class340.aClass11_Sub10Array4499[--Class240.anInt3257];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "c.C(" + bool + ')');
		}
	}

	public static void method3334(byte i) {
		do {
			try {
				aClass370_8455 = null;
				aClass240_8463 = null;
				aClass146_8461 = null;
				if (i >= 20)
					break;
				anInt8459 = -16;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "c.F(" + i + ')');
			}
			break;
		} while (false);
	}

	final int[][] method2255(int i, int i_1_) {
		try {
			anInt8454++;
			if (i_1_ != 1)
				return null;
			int[][] is = ((Class11_Sub2) this).aClass291_5038.method1799(0, i);
			if (((Class291) ((Class11_Sub2) this).aClass291_5038).aBool3943) {
				int i_2_ = Class33_Sub2.anInt6696;
				int i_3_ = Class29.anInt398;
				int[][] is_4_ = new int[i_3_][i_2_];
				int[][][] is_5_ = ((Class11_Sub2) this).aClass291_5038
						.method1798(1);
				method3336(i_1_ - 2, is_4_);
				for (int i_6_ = 0; i_6_ < Class29.anInt398; i_6_++) {
					int[] is_7_ = is_4_[i_6_];
					int[][] is_8_ = is_5_[i_6_];
					int[] is_9_ = is_8_[0];
					int[] is_10_ = is_8_[1];
					int[] is_11_ = is_8_[2];
					for (int i_12_ = 0; i_12_ < Class33_Sub2.anInt6696; i_12_++) {
						int i_13_ = is_7_[i_12_];
						is_11_[i_12_] = Class77.method529(i_13_ << 4, 4080);
						is_10_[i_12_] = Class77.method529(i_13_, 65280) >> 4;
						is_9_[i_12_] = Class77.method529(i_13_, 16711680) >> 12;
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "c.I(" + i + ',' + i_1_
					+ ')');
		}
	}

	final void method2263(int i, Stream stream, int i_14_) {
		do {
			try {
				if ((i_14_ ^ 0xffffffff) == -1) {
					aClass256Array8462 = new Class256[stream
							.readUnsignedByte((byte) 35)];
					while_95_: for (int i_15_ = 0; ((i_15_ ^ 0xffffffff) > (aClass256Array8462.length ^ 0xffffffff)); i_15_++) {
						int i_16_ = stream.readUnsignedByte((byte) 35);
						int i_17_ = i_16_;
						while_93_: do {
							do {
								if (i_17_ != 0) {
									if (i_17_ != 1) {
										if ((i_17_ ^ 0xffffffff) != -3) {
											if ((i_17_ ^ 0xffffffff) != -4)
												continue while_95_;
										} else
											break;
										break while_93_;
									}
								} else {
									aClass256Array8462[i_15_] = Class359
											.method2133(stream, (byte) 111);
									continue while_95_;
								}
								aClass256Array8462[i_15_] = Class206
										.method1308(stream, (byte) -115);
								continue while_95_;
							} while (false);
							aClass256Array8462[i_15_] = Class301.method1856(
									stream, (byte) 110);
							continue while_95_;
						} while (false);
						aClass256Array8462[i_15_] = Class213.method1371(
								(byte) 57, stream);
					}
				} else if ((i_14_ ^ 0xffffffff) == -2)
					((Class11_Sub2) this).aBool5044 = stream
							.readUnsignedByte((byte) 35) == 1;
				anInt8458++;
				if (i == 3731)
					break;
				aClass370_8455 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("c.B(" + i + ',' + (stream != null ? "{...}" : "null")
								+ ',' + i_14_ + ')'));
			}
			break;
		} while (false);
	}

	public Class11_Sub2_Sub2() {
		super(0, true);
	}

	static final void method3335(int i) {
		do {
			try {
				anInt8456++;
				try {
					do {
						if (Class318.anInt4230 == i) {
							int i_18_ = Class364.aClass11_Sub6_Sub2_4773
									.method3518(-108);
							if (i_18_ > 0
									&& Class364.aClass11_Sub6_Sub2_4773
											.method3500((byte) 114)) {
								i_18_ -= Class78.anInt1060;
								if ((i_18_ ^ 0xffffffff) > -1)
									i_18_ = 0;
								Class364.aClass11_Sub6_Sub2_4773.method3515(
										i_18_, -111);
								return;
							}
							Class364.aClass11_Sub6_Sub2_4773
									.method3490(i - 123);
							Class364.aClass11_Sub6_Sub2_4773.method3488(26920);
							Class66.aClass11_Sub34_949 = null;
							Class108_Sub8.aClass365_5740 = null;
							if (Class29.aClass146_397 != null) {
								Class318.anInt4230 = 2;
								if (!client.aBool10531)
									break;
							}
							Class318.anInt4230 = 0;
						}
					} while (false);
					if (Class318.anInt4230 != 3)
						break;
					int i_19_ = Class364.aClass11_Sub6_Sub2_4773
							.method3518(-80);
					if (Class376_Sub7_Sub3.anInt9278 > i_19_
							&& Class364.aClass11_Sub6_Sub2_4773
									.method3500((byte) 114)) {
						i_19_ += IncomingPacket.anInt2084;
						if (i_19_ > Class376_Sub7_Sub3.anInt9278)
							i_19_ = Class376_Sub7_Sub3.anInt9278;
						Class364.aClass11_Sub6_Sub2_4773.method3515(i_19_, -59);
					} else {
						Class318.anInt4230 = 0;
						IncomingPacket.anInt2084 = 0;
					}
				} catch (Exception exception) {
					exception.printStackTrace();
					Class364.aClass11_Sub6_Sub2_4773.method3490(87);
					Class108_Sub8.aClass365_5740 = null;
					Class318.anInt4230 = 0;
					Class66.aClass11_Sub34_949 = null;
					Class334.aClass11_Sub6_Sub2_4425 = null;
					Class29.aClass146_397 = null;
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "c.H(" + i + ')');
			}
		} while (false);
	}

	private final void method3336(int i, int[][] is) {
		do {
			try {
				anInt8453++;
				int i_20_ = Class33_Sub2.anInt6696;
				if (i == -1) {
					int i_21_ = Class29.anInt398;
					Class122.method800(is, 108);
					Class32_Sub1.method2440(Class297.anInt4024,
							(Class11_Sub45_Sub16_Sub2.anInt10167), 0, 0,
							(byte) 37);
					if (aClass256Array8462 == null)
						break;
					for (int i_22_ = 0; ((i_22_ ^ 0xffffffff) > (aClass256Array8462.length ^ 0xffffffff)); i_22_++) {
						Class256 class256 = aClass256Array8462[i_22_];
						int i_23_ = ((Class256) class256).anInt3510;
						int i_24_ = ((Class256) class256).anInt3506;
						if ((i_23_ ^ 0xffffffff) <= -1) {
							if (i_24_ < 0)
								class256.method1637(false, i_21_, i_20_);
							else
								class256.method1636(i_20_, -113, i_21_);
						} else if ((i_24_ ^ 0xffffffff) <= -1)
							class256.method1639(i_21_, -12939, i_20_);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("c.E(" + i + ','
						+ (is != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final void method3337(byte i) {
		try {
			Class205.aClass302_2761.method1862((byte) -63);
			anInt8460++;
			Class58_Sub2_Sub2.aClass353_9819.method2112((byte) -93);
			Class2.aClass221_18.method1409(true);
			Class11_Sub4.aClass290_5237.method1790((byte) 73);
			Class11_Sub19.aClass318_5817.method1934(true);
			Packet.aClass223_8723.method1423(137);
			Class108_Sub23.aClass198_7760.method1282(true);
			Class254.aClass227_3495.method1466((byte) 78);
			Class11_Sub50_Sub2.aClass369_9082.method2178(i ^ 0x3d);
			Class91_Sub1.aClass171_6937.method1123(15);
			Class108_Sub26.aClass127_7833.method830(-123);
			Class47.aClass29_741.method246(2060105417);
			Class168.aClass280_2160.method1723((byte) -86);
			Class11_Sub12_Sub4.aClass273_9466.method1705(35);
			Class187.aClass52_2388.method433(0);
			Class233.aClass379_3181.method2221(102);
			Class179.aClass154_2279.method970(true);
			Class299.aClass85_4031.method592(i + 194);
			if (i != -73)
				method3332(-45, (byte) 78);
			Class369.aClass96_4847.method648(0);
			Class11_Sub35_Sub1.aClass285_9126.method1760(200);
			Class11_Sub2_Sub3.method3341(true);
			Class108_Sub4.method2361(0);
			Class108_Sub18.method2807((byte) -118);
			Class32_Sub1.method2442((byte) -11);
			if (Class11_Sub2_Sub24.aClass347_9284 != Class362.aClass347_4711) {
				for (int i_25_ = 0; i_25_ < Class91_Sub3_Sub1.aByteArrayArray9337.length; i_25_++)
					Class91_Sub3_Sub1.aByteArrayArray9337[i_25_] = null;
				Class11_Sub45.anInt7905 = 0;
			}
			Class46.method402(0);
			Class205.method1299(93);
			Class205.method1301(true);
			Class2_Sub6.method2415(0);
			Class362.method2147(i ^ ~0x1c);
			Class86.aClass22_1198.method189((byte) -33);
			Class321_Sub2.aClass163_6648.method1005();
			Class123.method805(true);
			InputStream_Sub2.method2815(0);
			Class321.aClass146_4293.method911(-96);
			Class335_Sub3_Sub1.aClass146_9417.method911(-96);
			Class11_Sub2_Sub15.aClass146_9023.method911(i ^ 0x2f);
			Class282.aClass146_3824.method911(-84);
			Class135.aClass146_1863.method911(-94);
			Class14.aClass146_125.method911(-124);
			Class58_Sub2_Sub1.aClass146_9250.method911(-97);
			Class265.aClass146_3607.method911(-83);
			Class108_Sub7.aClass146_5636.method911(-82);
			Class11_Sub45_Sub1_Sub2.aClass146_9886.method911(-117);
			Class194.aClass146_2640.method911(-84);
			Class150.aClass146_2002.method911(-94);
			Class335.aClass146_4433.method911(-94);
			Class11_Sub18.aClass146_5781.method911(-103);
			Class280.aClass146_3789.method911(-106);
			aClass146_8461.method911(-83);
			Class308.aClass146_4128.method911(-93);
			Class108_Sub1.aClass146_5026.method911(-115);
			Class131.aClass146_1825.method911(-97);
			Class47.aClass146_744.method911(i ^ 0x2b);
			Class217_Sub1.aClass146_5538.method911(-85);
			Class256_Sub1.aClass146_5323.method911(i ^ 0x3c);
			Class287.aClass146_3887.method911(-94);
			Class11_Sub2_Sub30.aClass146_9618.method911(-127);
			Class234_Sub2.aClass146_5987.method911(-104);
			Class11_Sub45_Sub11.aClass146_9165.method911(-103);
			Class11_Sub45_Sub19.aClass146_9707.method911(-85);
			Class2.aClass146_15.method911(-83);
			Class11_Sub49.aClass146_8012.method911(-124);
			Class216.aClass146_2987.method911(-89);
			Class335_Sub1.aClass146_6443.method911(-100);
			Class11_Sub31.aClass146_6703.method911(i - 35);
			Class11_Sub8.aClass146_5310.method911(-84);
			Class11_Sub45_Sub1.aClass22_8487.method189((byte) -128);
			Class355.aClass22_4657.method189((byte) -11);
			Class163_Sub2_Sub1.aClass22_8565.method189((byte) -126);
			Class19_Sub1.aClass22_5758.method189((byte) -127);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "c.G(" + i + ')');
		}
	}
}
