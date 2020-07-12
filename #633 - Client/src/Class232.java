/* Class232 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class232 {
	static int anInt3173;
	static int anInt3174 = 0;
	static int[] anIntArray3175;
	static boolean[] aBoolArray3176;
	static boolean aBool3177 = true;
	static int anInt3178;

	static final void method1484(IComponentDefinitions class192, int i) {
		do {
			try {
				if (i == 1) {
					anInt3178++;
					if ((Class11_Sub2_Sub37.anInt9757 ^ 0xffffffff) != (((IComponentDefinitions) class192).anInt2608 ^ 0xffffffff))
						break;
					Class11_Sub45.aBoolArray7907[(((IComponentDefinitions) class192).anInt2525)] = true;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("md.C(" + (class192 != null ? "{...}" : "null") + ','
								+ i + ')'));
			}
			break;
		} while (false);
	}

	static final void method1485(int i, String string) {
		try {
			anInt3173++;
			if (string != null) {
				if (string.startsWith("*"))
					string = string.substring(1);
				String string_0_ = Class282.method1742(i, string);
				if (string_0_ != null) {
					for (int i_1_ = 0; ((Class231.anInt3168 ^ 0xffffffff) < (i_1_ ^ 0xffffffff)); i_1_++) {
						String string_2_ = Class11_Sub2_Sub16.aStringArray9034[i_1_];
						if (string_2_.startsWith("*"))
							string_2_ = string_2_.substring(1);
						string_2_ = Class282.method1742(0, string_2_);
						if (string_2_ != null && string_2_.equals(string_0_)) {
							Class231.anInt3168--;
							for (int i_3_ = i_1_; ((Class231.anInt3168 ^ 0xffffffff) < (i_3_ ^ 0xffffffff)); i_3_++) {
								Class11_Sub2_Sub16.aStringArray9034[i_3_] = (Class11_Sub2_Sub16.aStringArray9034[1 + i_3_]);
								Class335_Sub3_Sub1.aStringArray9416[i_3_] = (Class335_Sub3_Sub1.aStringArray9416[i_3_ + 1]);
								Class345.aStringArray4584[i_3_] = Class345.aStringArray4584[i_3_ + 1];
								Class11_Sub2_Sub21.aStringArray9195[i_3_] = (Class11_Sub2_Sub21.aStringArray9195[i_3_ + 1]);
								Class313.aBoolArray4159[i_3_] = Class313.aBoolArray4159[i_3_ + 1];
							}
							Class166.anInt2148++;
							Class315.anInt4170 = Class219_Sub1.anInt7238;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215(
											(Class11_Sub3.aClass25_5113),
											(Class11_Sub45_Sub13.aClass370_9290),
											(byte) -32);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeByte(Class98.method660(string, 0), i
											^ ~0x5b14851f);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeString((byte) 27, string);
							Class79.method541(class11_sub10, -21);
							break;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("md.A(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1486(int i) {
		try {
			if (i != -1)
				anInt3174 = 18;
			anIntArray3175 = null;
			aBoolArray3176 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "md.B(" + i + ')');
		}
	}
}
