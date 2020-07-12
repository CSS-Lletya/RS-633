/* Class11_Sub45_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

abstract class Class11_Sub45_Sub1 extends Class11_Sub45 {
	static int anInt8485;
	static int anInt8486;
	static Class22 aClass22_8487 = new Class22(4);
	static int anInt8488;
	static int anInt8489;
	static boolean aBool8490 = false;
	static int anInt8491;
	static int anInt8492;
	static int anInt8493 = 0;

	static final void method3344(int i) {
		try {
			anInt8491++;
			if (i < 104)
				method3346(-123, (byte) -71, null, -22, 108, 92, 109, -61);
			Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
					-652872096, 15, 0);
			class11_sub45_sub15.method3660(0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "r.M(" + i + ')');
		}
	}

	public Class11_Sub45_Sub1() {
		/* empty */
	}

	static final void method3345(boolean bool, int i) {
		do {
			try {
				if (i != -1)
					anInt8492 = -77;
				anInt8488++;
				Class321_Sub3_Sub1.anInt9258++;
				Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
						Class11_Sub3.aClass25_5113, Class249.aClass370_3433,
						(byte) -38);
				Class79.method541(class11_sub10, -122);
				for (Class11_Sub24 class11_sub24 = (Class11_Sub24) Class75_Sub2.aClass213_7160
						.method1365(i ^ ~0x5faa); class11_sub24 != null; class11_sub24 = (Class11_Sub24) Class75_Sub2.aClass213_7160
						.method1367((byte) 71)) {
					if (!class11_sub24.method124(0)) {
						class11_sub24 = ((Class11_Sub24) Class75_Sub2.aClass213_7160
								.method1365(24490));
						if (class11_sub24 == null)
							break;
					}
					if ((((Class11_Sub24) class11_sub24).anInt6236 ^ 0xffffffff) == -1)
						NPCDefinitions.method1377(bool, true, class11_sub24, -57);
				}
				if (Class72.aClass192_1004 == null)
					break;
				Class232.method1484(Class72.aClass192_1004, i + 2);
				Class72.aClass192_1004 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "r.K(" + bool + ','
						+ i + ')');
			}
			break;
		} while (false);
	}

	static final void method3346(int i, byte i_0_, int[] is, int i_1_,
			int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			anInt8489++;
			if ((i_1_ ^ 0xffffffff) < -1
					&& !Class261.method1669(i_1_, (byte) 100))
				throw new IllegalArgumentException("");
			if (i_3_ > 0 && !Class261.method1669(i_3_, (byte) 48))
				throw new IllegalArgumentException("");
			if (i_2_ != 32993)
				throw new IllegalArgumentException("");
			int i_6_ = 0;
			int i_7_ = (i_1_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff) ? i_1_ : i_3_;
			int i_8_ = i_1_ >> 1;
			int i_9_ = i_3_ >> 1;
			int[] is_10_ = is;
			int[] is_11_ = new int[i_9_ * i_8_];
			if (i_0_ != -90)
				method3348((byte) 30);
			for (;;) {
				OpenGL.glTexImage2Di(i, i_6_, i_4_, i_1_, i_3_, 0, i_2_, i_5_,
						is_10_, 0);
				if (i_7_ <= 1)
					break;
				int i_12_ = 0;
				int i_13_ = 0;
				int i_14_ = i_13_ - -i_1_;
				for (int i_15_ = 0; (i_9_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
					for (int i_16_ = 0; i_8_ > i_16_; i_16_++) {
						int i_17_ = is_10_[i_13_++];
						int i_18_ = is_10_[i_13_++];
						int i_19_ = is_10_[i_14_++];
						int i_20_ = is_10_[i_14_++];
						int i_21_ = i_17_ >> 16 & 0xff;
						int i_22_ = (i_17_ & 0xff93) >> 8;
						int i_23_ = 0xff & i_17_;
						int i_24_ = i_17_ >> 24 & 0xff;
						i_21_ += (0xff84dc & i_18_) >> 16;
						i_23_ += 0xff & i_18_;
						i_24_ += i_18_ >> 24 & 0xff;
						i_22_ += i_18_ >> 8 & 0xff;
						i_22_ += (i_19_ & 0xffaf) >> 8;
						i_24_ += i_19_ >> 24 & 0xff;
						i_21_ += (0xff3406 & i_19_) >> 16;
						i_23_ += i_19_ & 0xff;
						i_24_ += i_20_ >> 24 & 0xff;
						i_22_ += (0xff91 & i_20_) >> 8;
						i_23_ += i_20_ & 0xff;
						i_21_ += 0xff & i_20_ >> 16;
						is_11_[i_12_++] = (Class173.method1134(Class77
								.method529(255, i_23_ >> 2), (Class173
								.method1134((Class173.method1134(Class77
										.method529(1020, i_21_) << 14, Class77
										.method529(i_24_ << 22, -16777216))),
										Class77.method529(1020, i_22_) << 6))));
					}
					i_14_ += i_1_;
					i_13_ += i_1_;
				}
				int[] is_25_ = is_11_;
				is_11_ = is_10_;
				i_1_ = i_8_;
				i_3_ = i_9_;
				is_10_ = is_25_;
				i_9_ >>= 1;
				i_7_ >>= 1;
				i_6_++;
				i_8_ >>= 1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("r.O(" + i + ','
					+ i_0_ + ',' + (is != null ? "{...}" : "null") + ',' + i_1_
					+ ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	public static void method3347(byte i) {
		try {
			if (i != -76)
				method3348((byte) 21);
			aClass22_8487 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "r.L(" + i + ')');
		}
	}

	static final void method3348(byte i) {
		do {
			try {
				anInt8486++;
				if (i != -95)
					anInt8492 = 63;
				if (Class254.aClass37_3498 != null)
					Class254.aClass37_3498.method322((byte) -108);
				if (Class343.aClass37_4540 == null)
					break;
				Class343.aClass37_4540.method322((byte) -126);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "r.J(" + i + ')');
			}
			break;
		} while (false);
	}

	static final short[] method3349(int i, short[] is, byte i_26_) {
		try {
			anInt8485++;
			short[] is_27_ = new short[i];
			if (i_26_ != -75)
				anInt8492 = -6;
			Class311.method1900(is, 0, is_27_, 0, i);
			return is_27_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("r.N(" + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_26_ + ')'));
		}
	}
}
