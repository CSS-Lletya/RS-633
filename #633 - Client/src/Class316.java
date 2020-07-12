/* Class316 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class316 {
	static int anInt4180;
	static Class307 aClass307_4181 = new Class307("WIP", 2);
	static int anInt4182;
	static int anInt4183;
	static int anInt4184;
	static int anInt4185 = 0;
	static int anInt4186;
	static int anInt4187;
	static Interface25[] anInterface25Array4188 = new Interface25[75];
	static int anInt4189;

	static final void method1918(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			byte i_4_) {
		try {
			Class11_Sub2_Sub26.anInt9349 = i_0_;
			Class253_Sub2.anInt6534 = i_1_;
			Class17.anInt146 = i_2_;
			if (i_4_ <= 44)
				anInt4185 = 78;
			anInt4189 = i;
			anInt4180++;
			Class374.anInt4894 = i_3_;
			if (Class374.anInt4894 >= 100) {
				int i_5_ = Class17.anInt146 * 512 + 256;
				int i_6_ = 256 + anInt4189 * 512;
				int i_7_ = (Class318.method1931(116, i_6_,
						Class376_Sub7_Sub2.anInt9242, i_5_) + -Class253_Sub2.anInt6534);
				int i_8_ = -Class11_Sub45_Sub11.anInt9157 + i_5_;
				int i_9_ = -Class218.anInt3007 + i_7_;
				int i_10_ = -Class303.anInt4088 + i_6_;
				int i_11_ = (int) Math.sqrt((double) (i_10_ * i_10_ + i_8_
						* i_8_));
				Class266.anInt3616 = 0x3fff & (int) (Math.atan2((double) i_9_,
						(double) i_11_) * 2607.5945876176133);
				Class171.anInt2193 = 0x3fff & (int) (-2607.5945876176133 * Math
						.atan2((double) i_8_, (double) i_10_));
				if (Class266.anInt3616 < 1024)
					Class266.anInt3616 = 1024;
				Class211.anInt2857 = 0;
				if ((Class266.anInt3616 ^ 0xffffffff) < -3073)
					Class266.anInt3616 = 3072;
			}
			Canvas_Sub1.anInt9233 = Class170.anInt2186 = -1;
			Class191.anInt2453 = 2;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("sk.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ','
							+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	public static void method1919(byte i) {
		try {
			if (i >= -47)
				method1918(119, -71, -4, -49, 4, (byte) 24);
			aClass307_4181 = null;
			anInterface25Array4188 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sk.C(" + i + ')');
		}
	}

	static final int method1920(int i, byte i_12_) {
		try {
			anInt4187++;
			int i_13_ = i * (i * i >> 12) >> 12;
			if (i_12_ > -48)
				method1921(-104, 103, -95, -51, -92, 86, -31);
			int i_14_ = i * 6 + -61440;
			int i_15_ = 40960 - -(i_14_ * i >> 12);
			return i_15_ * i_13_ >> 12;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sk.A(" + i + ','
					+ i_12_ + ')');
		}
	}

	static final void method1921(int i, int i_16_, int i_17_, int i_18_,
			int i_19_, int i_20_, int i_21_) {
		try {
			anInt4184++;
			if (i_19_ >= 107) {
				if ((Class26.anInt340 ^ 0xffffffff) >= (i_16_ ^ 0xffffffff)
						&& ((i_18_ ^ 0xffffffff) >= (Class11_Sub45_Sub1_Sub2.anInt9880 ^ 0xffffffff))
						&& Class292.anInt3962 <= i_20_
						&& (i ^ 0xffffffff) >= (Class351.anInt4618 ^ 0xffffffff)) {
					if ((i_17_ ^ 0xffffffff) != -2)
						Class122.method799(i_18_, i, i_16_, 1, i_21_, i_20_,
								i_17_);
					else
						Class236_Sub2.method2640(i_18_, i_21_, 118, i_20_, i,
								i_16_);
				} else if (i_17_ != 1)
					Class11_Sub2_Sub32_Sub1.method3882(i_17_, i, i_18_, true,
							i_21_, i_20_, i_16_);
				else
					Class124.method808(i, i_21_, i_18_, -178792918, i_20_,
							i_16_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sk.F(" + i + ','
					+ i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ','
					+ i_20_ + ',' + i_21_ + ')'));
		}
	}

	static final int method1922(int i) {
		try {
			anInt4183++;
			if (Class244.anIntArray3314 == null)
				return 0;
			if (i != -2)
				method1921(72, -57, -112, -25, -54, 21, 67);
			return 2 * Class244.anIntArray3314.length;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sk.E(" + i + ')');
		}
	}

	static final int method1923(byte i, int i_22_, int i_23_, int i_24_) {
		try {
			anInt4182++;
			i_24_ &= 0x3;
			if ((i_24_ ^ 0xffffffff) == -1)
				return i_22_;
			if (i != 16)
				method1918(-58, 59, 59, 126, 97, (byte) 41);
			if ((i_24_ ^ 0xffffffff) == -2)
				return i_23_;
			if ((i_24_ ^ 0xffffffff) == -3)
				return -i_22_ + 7;
			return 7 - i_23_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sk.D(" + i + ','
					+ i_22_ + ',' + i_23_ + ',' + i_24_ + ')'));
		}
	}

	static {
		anInt4186 = 0;
	}
}
