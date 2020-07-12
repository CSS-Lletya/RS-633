/* Class360 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class360 {
	static IncomingPacket aClass160_4693 = new IncomingPacket(113, 3);
	static int anInt4694;
	static int anInt4695;
	static int[] anIntArray4696 = new int[2];

	static final void method2141(String string, byte i) {
		try {
			anInt4694++;
			if (i != -96)
				method2142(68);
			if (string != null) {
				if (string.startsWith("*"))
					string = string.substring(1);
				String string_0_ = Class282.method1742(i + 96, string);
				if (string_0_ != null) {
					for (int i_1_ = 0; ((i_1_ ^ 0xffffffff) > (Class94_Sub1.anInt5228 ^ 0xffffffff)); i_1_++) {
						String string_2_ = Class109.aStringArray1476[i_1_];
						if (string_2_.startsWith("*"))
							string_2_ = string_2_.substring(1);
						string_2_ = Class282.method1742(0, string_2_);
						if (string_2_ != null && string_2_.equals(string_0_)) {
							Class94_Sub1.anInt5228--;
							for (int i_3_ = i_1_; ((i_3_ ^ 0xffffffff) > (Class94_Sub1.anInt5228 ^ 0xffffffff)); i_3_++) {
								Class109.aStringArray1476[i_3_] = Class109.aStringArray1476[1 + i_3_];
								Class137.aStringArray1882[i_3_] = Class137.aStringArray1882[1 + i_3_];
								Class326.anIntArray4337[i_3_] = Class326.anIntArray4337[1 + i_3_];
								Class285.aStringArray3844[i_3_] = Class285.aStringArray3844[i_3_ + 1];
								Class101.anIntArray1351[i_3_] = Class101.anIntArray1351[1 + i_3_];
								Class376_Sub8.aBoolArray7757[i_3_] = Class376_Sub8.aBoolArray7757[i_3_ + 1];
							}
							Class321_Sub3.anInt7020++;
							Class315.anInt4170 = Class219_Sub1.anInt7238;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(IncomingPacket.aClass370_2078),
											(byte) -106);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeByte(Class98.method660(string, 0),
											i ^ 0x5b148540);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeString((byte) 27, string);
							Class79.method541(class11_sub10, -87);
							break;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wj.C("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method2142(int i) {
		try {
			aClass160_4693 = null;
			if (i != -15443)
				method2142(106);
			anIntArray4696 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wj.A(" + i + ')');
		}
	}

	static final int method2143(int i, int i_4_, int i_5_) {
		try {
			anInt4695++;
			if (i == -1)
				return 12345678;
			i_4_ = (i & 0x7f) * i_4_ >> 7;
			if (i_5_ != 3)
				return 58;
			if (i_4_ >= 2) {
				if ((i_4_ ^ 0xffffffff) < -127)
					i_4_ = 126;
			} else
				i_4_ = 2;
			return (i & 0xff80) - -i_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wj.B(" + i + ','
					+ i_4_ + ',' + i_5_ + ')'));
		}
	}
}
