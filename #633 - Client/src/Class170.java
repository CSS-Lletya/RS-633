/* Class170 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class170 {
	static int anInt2179;
	static OutgoingPacket aClass370_2180 = new OutgoingPacket(83, 4);
	static String aString2181;
	static int anInt2182;
	static int anInt2183;
	static int anInt2184;
	static Class104 aClass104_2185;
	static int anInt2186;

	static final int method1114(int i, byte i_0_) {
		try {
			anInt2183++;
			if (i_0_ != -68)
				method1118(null, true, 82);
			return 0xff & i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hm.E(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final float[] method1115(int i, float[] fs, int i_1_) {
		try {
			int i_2_ = -105 % ((46 - i) / 61);
			anInt2184++;
			float[] fs_3_ = new float[i_1_];
			Class311.method1897(fs, 0, fs_3_, 0, i_1_);
			return fs_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hm.A(" + i + ','
					+ (fs != null ? "{...}" : "null") + ',' + i_1_ + ')'));
		}
	}

	static final void method1116(int i, int i_4_, int i_5_, int i_6_, int i_7_) {
		try {
			anInt2182++;
			if (i_7_ == -8220) {
				if (i_6_ <= i_4_) {
					for (int i_8_ = i_6_; i_8_ < i_4_; i_8_++)
						Class297.anIntArrayArray4026[i_8_][i] = i_5_;
				} else {
					for (int i_9_ = i_4_; (i_6_ ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++)
						Class297.anIntArrayArray4026[i_9_][i] = i_5_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hm.B(" + i + ','
					+ i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	public static void method1117(int i) {
		try {
			if (i != 255)
				aClass370_2180 = null;
			aClass104_2185 = null;
			aString2181 = null;
			aClass370_2180 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hm.C(" + i + ')');
		}
	}

	static final void method1118(Class104 class104, boolean bool, int i) {
		try {
			if (bool != false)
				method1118(null, false, -107);
			anInt2179++;
			if (Class219_Sub1.aBool7241) {
				Class219_Sub1.aBool7241 = false;
				i = 0;
			}
			if (Class191.aClass104_2455 == null
					|| !Class191.aClass104_2455.method689(class104, (byte) 115)) {
				Class191.aClass104_2455 = class104;
				Class251.aLong3460 = Class137.method878((byte) -66);
				Class376_Sub7_Sub2.anInt9238 = Class81.anInt1093 = i;
				if ((Class376_Sub7_Sub2.anInt9238 ^ 0xffffffff) == -1)
					Class376_Sub1.method2275(5);
				else {
					Class236_Sub6.aFloat6963 = Class57.aFloat862;
					Class108_Sub12.anInt6225 = Class346.anInt4588;
					Class259.aClass234_3572 = Class372.aClass234_4876;
					Class23.anInt250 = Class119.anInt1617;
					Class93.aFloat1250 = Class11_Sub20_Sub2.aFloat9496;
					Class11_Sub6_Sub3.anInt9141 = Class206_Sub3.anInt6833;
					Class161.aFloat2099 = Class221.aFloat3037;
					Class286.aFloat3875 = Class245.aFloat3318;
					Class334.aFloat4421 = Class11_Sub31.aFloat6705;
					Class182.aFloat2343 = Class11_Sub2_Sub29.aFloat9469;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hm.D("
					+ (class104 != null ? "{...}" : "null") + ',' + bool + ','
					+ i + ')'));
		}
	}
}
