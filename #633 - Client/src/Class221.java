/* Class221 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class221 {
	static int anInt3029;
	static int anInt3030;
	static int anInt3031;
	private Class22 aClass22_3032 = new Class22(64);
	private Class146 aClass146_3033;
	static int anInt3034;
	static int anInt3035;
	static int anInt3036;
	static float aFloat3037;
	static int anInt3038;
	Class146 aClass146_3039;
	static int[] anIntArray3040 = new int[2];

	final Class207 method1408(int i, byte i_0_) {
		try {
			anInt3030++;
			Class207 class207;
			synchronized (aClass22_3032) {
				class207 = (Class207) aClass22_3032.method188((long) i,
						(byte) 119);
			}
			if (class207 != null)
				return class207;
			byte[] is;
			synchronized (aClass146_3033) {
				is = aClass146_3033.method930(i, (byte) 112, 3);
			}
			class207 = new Class207();
			((Class207) class207).aClass221_2786 = this;
			if (is != null)
				class207.method1331(new Stream(is), (byte) -36);
			synchronized (aClass22_3032) {
				aClass22_3032.method184((byte) 124, class207, (long) i);
			}
			if (i_0_ >= -3)
				method1415((byte) -122, -92);
			return class207;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "le.G(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method1409(boolean bool) {
		try {
			anInt3035++;
			if (bool == true) {
				synchronized (aClass22_3032) {
					aClass22_3032.method189((byte) -126);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "le.B(" + bool + ')');
		}
	}

	public static void method1410(int i) {
		do {
			try {
				anIntArray3040 = null;
				if (i <= -9)
					break;
				method1414(31, 13, -62);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "le.F(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method1411(boolean bool, int i, byte i_1_, int i_2_,
			int i_3_, int i_4_) {
		try {
			anInt3031++;
			int i_5_ = -65 % ((47 - i_1_) / 51);
			long l = (long) (i | (!bool ? 0 : -2147483648));
			Class11_Sub37 class11_sub37 = ((Class11_Sub37) Class376_Sub7_Sub1.aClass213_8798
					.method1369((byte) 26, l));
			if (class11_sub37 == null) {
				class11_sub37 = new Class11_Sub37();
				Class376_Sub7_Sub1.aClass213_8798.method1368(l, class11_sub37,
						(byte) -26);
			}
			if (i_3_ >= ((Class11_Sub37) class11_sub37).anIntArray7082.length) {
				int[] is = new int[i_3_ + 1];
				int[] is_6_ = new int[1 + i_3_];
				for (int i_7_ = 0; (((Class11_Sub37) class11_sub37).anIntArray7082.length > i_7_); i_7_++) {
					is[i_7_] = ((Class11_Sub37) class11_sub37).anIntArray7082[i_7_];
					is_6_[i_7_] = ((Class11_Sub37) class11_sub37).anIntArray7088[i_7_];
				}
				for (int i_8_ = (((Class11_Sub37) class11_sub37).anIntArray7082).length; i_3_ > i_8_; i_8_++) {
					is[i_8_] = -1;
					is_6_[i_8_] = 0;
				}
				((Class11_Sub37) class11_sub37).anIntArray7088 = is_6_;
				((Class11_Sub37) class11_sub37).anIntArray7082 = is;
			}
			((Class11_Sub37) class11_sub37).anIntArray7082[i_3_] = i_4_;
			((Class11_Sub37) class11_sub37).anIntArray7088[i_3_] = i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("le.H(" + bool + ',' + i + ',' + i_1_ + ',' + i_2_ + ','
							+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	final void method1412(int i) {
		try {
			anInt3038++;
			synchronized (aClass22_3032) {
				if (i != 1)
					aClass22_3032 = null;
				aClass22_3032.method190(0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "le.E(" + i + ')');
		}
	}

	static final void decodeGlobalPlayerUpdate(int i, Packet class11_sub20_sub1) {
		try {
			anInt3029++;
			class11_sub20_sub1.method3427(7);
			int i_9_ = 0;
			for (int i_10_ = 0; (Class190.anInt2446 ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++) {
				int i_11_ = Class6.anIntArray40[i_10_];
				if ((0x1 & Class218.aByteArray3011[i_11_]) == 0) {
					if ((i_9_ ^ 0xffffffff) < -1) {
						i_9_--;
						Class218.aByteArray3011[i_11_] = (byte) Class173
								.method1134((Class218.aByteArray3011[i_11_]), 2);
					} else {
						int i_12_ = class11_sub20_sub1
								.readBits(1, (byte) 108);
						if (i_12_ == 0) {
							i_9_ = (Class11_Sub45_Sub20_Sub2.method3939(
									(byte) -5, class11_sub20_sub1));
							Class218.aByteArray3011[i_11_] = (byte) Class173
									.method1134(
											(Class218.aByteArray3011[i_11_]), 2);
						} else
							Class11_Sub32.method2794(class11_sub20_sub1, false,
									i_11_);
					}
				}
			}
			class11_sub20_sub1.finishBitAccess((byte) 116);
			if (i_9_ != 0)
				throw new RuntimeException("nsn0");
			class11_sub20_sub1.method3427(7);
			for (int i_13_ = 0; i_13_ < Class190.anInt2446; i_13_++) {
				int i_14_ = Class6.anIntArray40[i_13_];
				if ((0x1 & Class218.aByteArray3011[i_14_] ^ 0xffffffff) != -1) {
					if ((i_9_ ^ 0xffffffff) < -1) {
						Class218.aByteArray3011[i_14_] = (byte) Class173
								.method1134((Class218.aByteArray3011[i_14_]), 2);
						i_9_--;
					} else {
						int i_15_ = class11_sub20_sub1
								.readBits(1, (byte) 108);
						if (i_15_ == 0) {
							i_9_ = (Class11_Sub45_Sub20_Sub2.method3939(
									(byte) -5, class11_sub20_sub1));
							Class218.aByteArray3011[i_14_] = (byte) Class173
									.method1134(
											(Class218.aByteArray3011[i_14_]), 2);
						} else
							Class11_Sub32.method2794(class11_sub20_sub1, false,
									i_14_);
					}
				}
			}
			class11_sub20_sub1.finishBitAccess((byte) 127);
			if (i_9_ != 0)
				throw new RuntimeException("nsn1");
			class11_sub20_sub1.method3427(7);
			for (int i_16_ = 0; ((i_16_ ^ 0xffffffff) > (Class11_Sub2_Sub38.anInt9794 ^ 0xffffffff)); i_16_++) {
				int i_17_ = Class373.anIntArray4886[i_16_];
				if ((Class218.aByteArray3011[i_17_] & 0x1 ^ 0xffffffff) != -1) {
					if ((i_9_ ^ 0xffffffff) < -1) {
						Class218.aByteArray3011[i_17_] = (byte) Class173
								.method1134((Class218.aByteArray3011[i_17_]), 2);
						i_9_--;
					} else {
						int i_18_ = class11_sub20_sub1
								.readBits(1, (byte) 108);
						if ((i_18_ ^ 0xffffffff) == -1) {
							i_9_ = (Class11_Sub45_Sub20_Sub2.method3939(
									(byte) -5, class11_sub20_sub1));
							Class218.aByteArray3011[i_17_] = (byte) Class173
									.method1134(
											(Class218.aByteArray3011[i_17_]), 2);
						} else if (Class33_Sub3.method2921(i_17_,
								class11_sub20_sub1, 0))
							Class218.aByteArray3011[i_17_] = (byte) Class173
									.method1134(
											(Class218.aByteArray3011[i_17_]), 2);
					}
				}
			}
			class11_sub20_sub1.finishBitAccess((byte) 115);
			if ((i_9_ ^ 0xffffffff) != -1)
				throw new RuntimeException("nsn2");
			class11_sub20_sub1.method3427(7);
			for (int i_19_ = 0; Class11_Sub2_Sub38.anInt9794 > i_19_; i_19_++) {
				int i_20_ = Class373.anIntArray4886[i_19_];
				if ((Class218.aByteArray3011[i_20_] & 0x1) == 0) {
					if (i_9_ > 0) {
						Class218.aByteArray3011[i_20_] = (byte) Class173
								.method1134((Class218.aByteArray3011[i_20_]), 2);
						i_9_--;
					} else {
						int i_21_ = class11_sub20_sub1
								.readBits(1, (byte) 108);
						if (i_21_ == 0) {
							i_9_ = (Class11_Sub45_Sub20_Sub2.method3939(
									(byte) -5, class11_sub20_sub1));
							Class218.aByteArray3011[i_20_] = (byte) Class173
									.method1134(
											(Class218.aByteArray3011[i_20_]), 2);
						} else if (Class33_Sub3.method2921(i_20_,
								class11_sub20_sub1, 0))
							Class218.aByteArray3011[i_20_] = (byte) Class173
									.method1134(
											(Class218.aByteArray3011[i_20_]), 2);
					}
				}
			}
			class11_sub20_sub1.finishBitAccess((byte) 109);
			if ((i_9_ ^ 0xffffffff) != -1)
				throw new RuntimeException("nsn3");
			Class190.anInt2446 = 0;
			Class11_Sub2_Sub38.anInt9794 = 0;
			if (i != -4023)
				method1416(-38, -5);
			for (int i_22_ = 1; i_22_ < 2048; i_22_++) {
				Class218.aByteArray3011[i_22_] >>= 1;
				Player class376_sub7_sub5_sub5_sub1 = Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_22_];
				if (class376_sub7_sub5_sub5_sub1 != null)
					Class6.anIntArray40[Class190.anInt2446++] = i_22_;
				else
					Class373.anIntArray4886[Class11_Sub2_Sub38.anInt9794++] = i_22_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("le.A(" + i + ','
					+ (class11_sub20_sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class364 method1414(int i, int i_23_, int i_24_) {
		if (Class181.aClass364ArrayArrayArray2336[i][i_23_][i_24_] == null) {
			boolean bool = ((Class181.aClass364ArrayArrayArray2336[0][i_23_][i_24_] != null) && ((Class364) (Class181.aClass364ArrayArrayArray2336[0][i_23_][i_24_])).aClass364_4783 != null);
			if (bool && i >= Class155.anInt2044 - 1)
				return null;
			Class108_Sub18.method2808(i, i_23_, i_24_);
		}
		return Class181.aClass364ArrayArrayArray2336[i][i_23_][i_24_];
	}

	final void method1415(byte i, int i_25_) {
		try {
			if (i != 48)
				method1415((byte) -70, -3);
			anInt3034++;
			synchronized (aClass22_3032) {
				aClass22_3032.method182(i_25_, (byte) -73);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "le.I(" + i + ','
					+ i_25_ + ')');
		}
	}

	static final boolean method1416(int i, int i_26_) {
		try {
			if (i_26_ != -8714)
				anIntArray3040 = null;
			anInt3036++;
			if ((i ^ 0xffffffff) != -8 && i != 8 && i != 9)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "le.D(" + i + ','
					+ i_26_ + ')');
		}
	}

	Class221(Class66 class66, int i, Class146 class146, Class146 class146_27_) {
		try {
			((Class221) this).aClass146_3039 = class146_27_;
			aClass146_3033 = class146;
			aClass146_3033.method914(3, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("le.<init>("
					+ (class66 != null ? "{...}" : "null") + ',' + i + ','
					+ (class146 != null ? "{...}" : "null") + ','
					+ (class146_27_ != null ? "{...}" : "null") + ')'));
		}
	}
}
