/* Class165 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class165 {
	static IncomingPacket aClass160_2134 = new IncomingPacket(65, 7);
	static int anInt2135;
	static int anInt2136;
	static int anInt2137;
	static int anInt2138;
	static int anInt2139;
	private int[][] anIntArrayArray2140;
	static int anInt2141;
	static int[][] anIntArrayArray2142 = { { 6, 6 }, { 6, 6 }, { 6, 5, 5 },
			{ 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 },
			{ 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 },
			{ 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 },
			{ 7, 7, 1, 2 }, { 7, 7, 1, 2 } };
	static int anInt2143;
	private int anInt2144;
	static Class282 aClass282_2145 = new Class282();
	private int anInt2146;

	public static void method1094(int i) {
		try {
			aClass282_2145 = null;
			if (i == 4) {
				anIntArrayArray2142 = null;
				aClass160_2134 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bia.D(" + i + ')');
		}
	}

	final byte[] method1095(boolean bool, byte[] is) {
		try {
			anInt2138++;
			if (anIntArrayArray2140 != null) {
				int i = 14 + (int) ((long) anInt2146 * (long) is.length / (long) anInt2144);
				int[] is_0_ = new int[i];
				int i_1_ = 0;
				int i_2_ = 0;
				for (int i_3_ = 0; is.length > i_3_; i_3_++) {
					int i_4_ = is[i_3_];
					int[] is_5_ = anIntArrayArray2140[i_2_];
					for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -15; i_6_++)
						is_0_[i_1_ + i_6_] += i_4_ * is_5_[i_6_];
					i_2_ += anInt2146;
					int i_7_ = i_2_ / anInt2144;
					i_2_ -= anInt2144 * i_7_;
					i_1_ += i_7_;
				}
				is = new byte[i];
				for (int i_8_ = 0; i > i_8_; i_8_++) {
					int i_9_ = is_0_[i_8_] - -32768 >> 16;
					if (i_9_ >= -128) {
						if (i_9_ > 127)
							is[i_8_] = (byte) 127;
						else
							is[i_8_] = (byte) i_9_;
					} else
						is[i_8_] = (byte) -128;
				}
			}
			if (bool != true)
				method1094(111);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bia.B(" + bool + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class347 method1096(byte i, int i_10_) {
		try {
			anInt2135++;
			Class347[] class347s = Class153.method961((byte) 119);
			int i_11_ = -126 / ((73 - i) / 34);
			for (int i_12_ = 0; class347s.length > i_12_; i_12_++) {
				Class347 class347 = class347s[i_12_];
				if ((i_10_ ^ 0xffffffff) == (((Class347) class347).anInt4597 ^ 0xffffffff))
					return class347;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bia.A(" + i + ','
					+ i_10_ + ')');
		}
	}

	final int method1097(int i, int i_13_) {
		try {
			if (i_13_ != 14)
				return 17;
			if (anIntArrayArray2140 != null)
				i = (int) ((long) anInt2146 * (long) i / (long) anInt2144);
			anInt2137++;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bia.E(" + i + ','
					+ i_13_ + ')');
		}
	}

	final short[] method1098(int i, short[] is) {
		try {
			if (anIntArrayArray2140 != null) {
				int i_14_ = ((int) ((long) anInt2146 * (long) is.length / (long) anInt2144) + 14);
				int[] is_15_ = new int[i_14_];
				int i_16_ = 0;
				int i_17_ = 0;
				for (int i_18_ = 0; i_18_ < is.length; i_18_++) {
					int i_19_ = is[i_18_];
					int[] is_20_ = anIntArrayArray2140[i_17_];
					for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > -15; i_21_++)
						is_15_[i_16_ + i_21_] += is_20_[i_21_] * i_19_ >> 2;
					i_17_ += anInt2146;
					int i_22_ = i_17_ / anInt2144;
					i_17_ -= i_22_ * anInt2144;
					i_16_ += i_22_;
				}
				is = new short[i_14_];
				for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > (i_14_ ^ 0xffffffff); i_23_++) {
					int i_24_ = is_15_[i_23_] + 8192 >> 14;
					if ((i_24_ ^ 0xffffffff) <= 32767) {
						if (i_24_ > 32767)
							is[i_23_] = (short) 32767;
						else
							is[i_23_] = (short) i_24_;
					} else
						is[i_23_] = (short) -32768;
				}
			}
			anInt2143++;
			if (i != -1554766238)
				method1097(-114, -125);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bia.C(" + i + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final int method1099(int i, int i_25_) {
		try {
			if (anIntArrayArray2140 != null)
				i_25_ = (int) ((long) i_25_ * (long) anInt2146 / (long) anInt2144) + 6;
			anInt2141++;
			if (i != 10)
				anIntArrayArray2140 = null;
			return i_25_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bia.F(" + i + ','
					+ i_25_ + ')');
		}
	}

	Class165(int i, int i_26_) {
		try {
			if ((i_26_ ^ 0xffffffff) != (i ^ 0xffffffff)) {
				int i_27_ = Class11_Sub6_Sub3.method3572(i, -1, i_26_);
				i /= i_27_;
				i_26_ /= i_27_;
				anInt2144 = i;
				anInt2146 = i_26_;
				anIntArrayArray2140 = new int[i][14];
				for (int i_28_ = 0; (i_28_ ^ 0xffffffff) > (i ^ 0xffffffff); i_28_++) {
					int[] is = anIntArrayArray2140[i_28_];
					double d = (double) i_28_ / (double) i + 6.0;
					int i_29_ = (int) Math.floor(d - 7.0 + 1.0);
					if ((i_29_ ^ 0xffffffff) > -1)
						i_29_ = 0;
					int i_30_ = (int) Math.ceil(d + 7.0);
					if ((i_30_ ^ 0xffffffff) < -15)
						i_30_ = 14;
					double d_31_ = (double) i_26_ / (double) i;
					for (/**/; i_30_ > i_29_; i_29_++) {
						double d_32_ = 3.141592653589793 * ((double) i_29_ - d);
						double d_33_ = d_31_;
						if (d_32_ < -1.0E-4 || d_32_ > 1.0E-4)
							d_33_ *= Math.sin(d_32_) / d_32_;
						d_33_ *= 0.46 * Math
								.cos(((double) i_29_ - d) * 0.2243994752564138) + 0.54;
						is[i_29_] = (int) Math.floor(d_33_ * 65536.0 + 0.5);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bia.<init>(" + i + ','
					+ i_26_ + ')');
		}
	}
}
