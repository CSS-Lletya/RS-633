/* Class25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ISAAC {
	private int anInt259;
	private int anInt260;
	private int anInt261;
	static int anInt262;
	static Class66 aClass66_263 = new Class66("stellardawn", 1);
	private int anInt264;
	static Class84 aClass84_265;
	private int[] anIntArray266;
	static int anInt267;
	static int anInt268;
	static int anInt269;
	private int[] anIntArray270;

	final int method212(int i) {
		try {
			int i_0_ = 6 / ((55 - i) / 53);
			anInt268++;
			if (anInt259 == 0) {
				method213(0);
				anInt259 = 256;
			}
			return RunClient.ENABLE_ISAAC ? anIntArray270[--anInt259] : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pea.C(" + i + ')');
		}
	}

	private final void method213(int i) {
		try {
			anInt267++;
			anInt264 += ++anInt261;
			for (int i_1_ = i; i_1_ < 256; i_1_++) {
				int i_2_ = anIntArray266[i_1_];
				if ((i_1_ & 0x2) == 0) {
					if ((i_1_ & 0x1 ^ 0xffffffff) != -1)
						anInt260 ^= anInt260 >>> 6;
					else
						anInt260 ^= anInt260 << 13;
				} else if ((0x1 & i_1_ ^ 0xffffffff) != -1)
					anInt260 ^= anInt260 >>> 16;
				else
					anInt260 ^= anInt260 << 2;
				anInt260 += anIntArray266[i_1_ + 128 & 0xff];
				int i_3_;
				anIntArray266[i_1_] = i_3_ = (anInt264 + anInt260 + anIntArray266[Class77
						.method529(1020, i_2_) >> 2]);
				anIntArray270[i_1_] = anInt264 = i_2_
						+ (anIntArray266[Class77.method529(i_3_, 261282) >> 8 >> 2]);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pea.E(" + i + ')');
		}
	}

	final int method214(int i) {
		try {
			if (anInt259 == 0) {
				method213(i ^ 0x100);
				anInt259 = 256;
			}
			if (i != 256)
				aClass66_263 = null;
			anInt262++;
			if (RunClient.ENABLE_ISAAC)
				return anIntArray270[-1 + anInt259];
			else
				return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pea.D(" + i + ')');
		}
	}

	private final void method215(int i) {
		try {
			anInt269++;
			if (i >= -91)
				aClass84_265 = null;
			int i_5_;
			int i_6_;
			int i_7_;
			int i_8_;
			int i_9_;
			int i_10_;
			int i_11_;
			int i_4_ = (i_5_ = i_6_ = i_7_ = i_8_ = i_9_ = i_10_ = i_11_ = -1640531527);
			for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > -5; i_12_++) {
				i_4_ ^= i_5_ << 11;
				i_7_ += i_4_;
				i_5_ += i_6_;
				i_5_ ^= i_6_ >>> 2;
				i_8_ += i_5_;
				i_6_ += i_7_;
				i_6_ ^= i_7_ << 8;
				i_7_ += i_8_;
				i_9_ += i_6_;
				i_7_ ^= i_8_ >>> 16;
				i_10_ += i_7_;
				i_8_ += i_9_;
				i_8_ ^= i_9_ << 10;
				i_9_ += i_10_;
				i_11_ += i_8_;
				i_9_ ^= i_10_ >>> 4;
				i_10_ += i_11_;
				i_4_ += i_9_;
				i_10_ ^= i_11_ << 8;
				i_5_ += i_10_;
				i_11_ += i_4_;
				i_11_ ^= i_4_ >>> 9;
				i_6_ += i_11_;
				i_4_ += i_5_;
			}
			for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > -257; i_13_ += 8) {
				i_4_ += anIntArray270[i_13_];
				i_10_ += anIntArray270[6 + i_13_];
				i_7_ += anIntArray270[3 + i_13_];
				i_6_ += anIntArray270[2 + i_13_];
				i_9_ += anIntArray270[5 + i_13_];
				i_8_ += anIntArray270[i_13_ + 4];
				i_11_ += anIntArray270[7 + i_13_];
				i_5_ += anIntArray270[i_13_ + 1];
				i_4_ ^= i_5_ << 11;
				i_7_ += i_4_;
				i_5_ += i_6_;
				i_5_ ^= i_6_ >>> 2;
				i_8_ += i_5_;
				i_6_ += i_7_;
				i_6_ ^= i_7_ << 8;
				i_9_ += i_6_;
				i_7_ += i_8_;
				i_7_ ^= i_8_ >>> 16;
				i_10_ += i_7_;
				i_8_ += i_9_;
				i_8_ ^= i_9_ << 10;
				i_9_ += i_10_;
				i_11_ += i_8_;
				i_9_ ^= i_10_ >>> 4;
				i_4_ += i_9_;
				i_10_ += i_11_;
				i_10_ ^= i_11_ << 8;
				i_11_ += i_4_;
				i_5_ += i_10_;
				i_11_ ^= i_4_ >>> 9;
				i_6_ += i_11_;
				i_4_ += i_5_;
				anIntArray266[i_13_] = i_4_;
				anIntArray266[i_13_ + 1] = i_5_;
				anIntArray266[i_13_ + 2] = i_6_;
				anIntArray266[3 + i_13_] = i_7_;
				anIntArray266[4 + i_13_] = i_8_;
				anIntArray266[i_13_ + 5] = i_9_;
				anIntArray266[6 + i_13_] = i_10_;
				anIntArray266[i_13_ + 7] = i_11_;
			}
			for (int i_14_ = 0; i_14_ < 256; i_14_ += 8) {
				i_10_ += anIntArray266[i_14_ + 6];
				i_8_ += anIntArray266[i_14_ + 4];
				i_5_ += anIntArray266[i_14_ + 1];
				i_9_ += anIntArray266[5 + i_14_];
				i_4_ += anIntArray266[i_14_];
				i_11_ += anIntArray266[i_14_ + 7];
				i_6_ += anIntArray266[2 + i_14_];
				i_7_ += anIntArray266[i_14_ + 3];
				i_4_ ^= i_5_ << 11;
				i_5_ += i_6_;
				i_7_ += i_4_;
				i_5_ ^= i_6_ >>> 2;
				i_8_ += i_5_;
				i_6_ += i_7_;
				i_6_ ^= i_7_ << 8;
				i_7_ += i_8_;
				i_9_ += i_6_;
				i_7_ ^= i_8_ >>> 16;
				i_10_ += i_7_;
				i_8_ += i_9_;
				i_8_ ^= i_9_ << 10;
				i_11_ += i_8_;
				i_9_ += i_10_;
				i_9_ ^= i_10_ >>> 4;
				i_10_ += i_11_;
				i_4_ += i_9_;
				i_10_ ^= i_11_ << 8;
				i_5_ += i_10_;
				i_11_ += i_4_;
				i_11_ ^= i_4_ >>> 9;
				i_4_ += i_5_;
				i_6_ += i_11_;
				anIntArray266[i_14_] = i_4_;
				anIntArray266[1 + i_14_] = i_5_;
				anIntArray266[2 + i_14_] = i_6_;
				anIntArray266[3 + i_14_] = i_7_;
				anIntArray266[4 + i_14_] = i_8_;
				anIntArray266[i_14_ + 5] = i_9_;
				anIntArray266[6 + i_14_] = i_10_;
				anIntArray266[7 + i_14_] = i_11_;
			}
			method213(0);
			anInt259 = 256;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pea.A(" + i + ')');
		}
	}

	public static void method216(boolean bool) {
		do {
			try {
				aClass66_263 = null;
				aClass84_265 = null;
				if (bool == false)
					break;
				method216(false);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "pea.B(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	private ISAAC() {
		/* empty */
	}

	ISAAC(int[] is) {
		try {
			anIntArray266 = new int[256];
			anIntArray270 = new int[256];
			for (int i = 0; (is.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
				anIntArray270[i] = is[i];
			method215(-101);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pea.<init>("
					+ (is != null ? "{...}" : "null") + ')');
		}
	}
}
