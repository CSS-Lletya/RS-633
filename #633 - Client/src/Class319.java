/* Class319 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class319 {
	static int anInt4237;
	int anInt4238;
	static int anInt4239;
	static int anInt4240;
	int anInt4241;
	static int anInt4242;
	static int anInt4243;
	Class96 aClass96_4244;
	private int anInt4245;
	static int anInt4246;
	static int anInt4247;

	static final void method1937(int i) {
		try {
			anInt4237++;
			int i_0_ = 512 * Class251_Sub1.anInt5417 + 256;
			int i_1_ = 512 * Class270.anInt3650 + 256;
			int i_2_ = (Class318.method1931(i ^ ~0x8c, i_1_,
					Class376_Sub7_Sub2.anInt9242, i_0_) - Class12_Sub1.anInt5156);
			do {
				if ((Class108_Sub17.anInt6623 ^ 0xffffffff) > -101) {
					if ((Class11_Sub45_Sub11.anInt9157 ^ 0xffffffff) > (i_0_ ^ 0xffffffff)) {
						Class11_Sub45_Sub11.anInt9157 += (((-Class11_Sub45_Sub11.anInt9157 + i_0_)
								* Class108_Sub17.anInt6623 / 1000) + Class324.anInt4323);
						if ((Class11_Sub45_Sub11.anInt9157 ^ 0xffffffff) < (i_0_ ^ 0xffffffff))
							Class11_Sub45_Sub11.anInt9157 = i_0_;
					}
					if (Class218.anInt3007 < i_2_) {
						Class218.anInt3007 += ((i_2_ + -Class218.anInt3007)
								* Class108_Sub17.anInt6623 / 1000)
								+ Class324.anInt4323;
						if (Class218.anInt3007 > i_2_)
							Class218.anInt3007 = i_2_;
					}
					if (Class11_Sub45_Sub11.anInt9157 > i_0_) {
						Class11_Sub45_Sub11.anInt9157 -= (((-i_0_ + Class11_Sub45_Sub11.anInt9157)
								* Class108_Sub17.anInt6623 / 1000) + Class324.anInt4323);
						if (i_0_ > Class11_Sub45_Sub11.anInt9157)
							Class11_Sub45_Sub11.anInt9157 = i_0_;
					}
					if ((Class303.anInt4088 ^ 0xffffffff) > (i_1_ ^ 0xffffffff)) {
						Class303.anInt4088 += ((i_1_ + -Class303.anInt4088)
								* Class108_Sub17.anInt6623 / 1000)
								+ Class324.anInt4323;
						if ((Class303.anInt4088 ^ 0xffffffff) < (i_1_ ^ 0xffffffff))
							Class303.anInt4088 = i_1_;
					}
					if ((i_2_ ^ 0xffffffff) > (Class218.anInt3007 ^ 0xffffffff)) {
						Class218.anInt3007 -= (Class108_Sub17.anInt6623
								* (-i_2_ + Class218.anInt3007) / 1000)
								+ Class324.anInt4323;
						if (i_2_ > Class218.anInt3007)
							Class218.anInt3007 = i_2_;
					}
					if (i_1_ >= Class303.anInt4088)
						break;
					Class303.anInt4088 -= (Class108_Sub17.anInt6623
							* (Class303.anInt4088 - i_1_) / 1000)
							+ Class324.anInt4323;
					if ((i_1_ ^ 0xffffffff) >= (Class303.anInt4088 ^ 0xffffffff))
						break;
					Class303.anInt4088 = i_1_;
					if (!client.aBool10531)
						break;
				}
				Class11_Sub45_Sub11.anInt9157 = 256 + Class251_Sub1.anInt5417 * 512;
				Class303.anInt4088 = 512 * Class270.anInt3650 + 256;
				Class218.anInt3007 = (Class318.method1931(121,
						Class303.anInt4088, Class376_Sub7_Sub2.anInt9242,
						Class11_Sub45_Sub11.anInt9157) - Class12_Sub1.anInt5156);
			} while (false);
			i_0_ = Class17.anInt146 * 512 - i;
			i_1_ = Class316.anInt4189 * 512 + 256;
			i_2_ = Class318.method1931(84, i_1_, Class376_Sub7_Sub2.anInt9242,
					i_0_) - Class253_Sub2.anInt6534;
			int i_3_ = i_0_ + -Class11_Sub45_Sub11.anInt9157;
			int i_4_ = i_2_ - Class218.anInt3007;
			int i_5_ = -Class303.anInt4088 + i_1_;
			int i_6_ = (int) Math.sqrt((double) (i_5_ * i_5_ + i_3_ * i_3_));
			int i_7_ = ((int) (Math.atan2((double) i_4_, (double) i_6_) * 2607.5945876176133) & 0x3fff);
			int i_8_ = 0x3fff & (int) (Math.atan2((double) i_3_, (double) i_5_) * -2607.5945876176133);
			if (i_7_ < 1024)
				i_7_ = 1024;
			if ((i_7_ ^ 0xffffffff) < -3073)
				i_7_ = 3072;
			if (i_7_ > Class266.anInt3616) {
				Class266.anInt3616 += ((-Class266.anInt3616 + i_7_ >> 3)
						* Class374.anInt4894 / 1000)
						+ Class11_Sub2_Sub26.anInt9349 << 3;
				if (i_7_ < Class266.anInt3616)
					Class266.anInt3616 = i_7_;
			}
			if ((i_7_ ^ 0xffffffff) > (Class266.anInt3616 ^ 0xffffffff)) {
				Class266.anInt3616 -= (Class11_Sub2_Sub26.anInt9349 - -(Class374.anInt4894
						* (-i_7_ + Class266.anInt3616 >> 3) / 1000)) << 3;
				if (i_7_ > Class266.anInt3616)
					Class266.anInt3616 = i_7_;
			}
			int i_9_ = i_8_ + -Class171.anInt2193;
			if ((i_9_ ^ 0xffffffff) < -8193)
				i_9_ -= 16384;
			if (i_9_ < -8192)
				i_9_ += 16384;
			i_9_ >>= 3;
			if ((i_9_ ^ 0xffffffff) < -1) {
				Class171.anInt2193 += (Class374.anInt4894 * i_9_ / 1000 + Class11_Sub2_Sub26.anInt9349) << 3;
				Class171.anInt2193 &= 0x3fff;
			}
			if (i_9_ < 0) {
				Class171.anInt2193 -= (Class11_Sub2_Sub26.anInt9349 + -i_9_
						* Class374.anInt4894 / 1000) << 3;
				Class171.anInt2193 &= 0x3fff;
			}
			int i_10_ = -Class171.anInt2193 + i_8_;
			if ((i_10_ ^ 0xffffffff) < -8193)
				i_10_ -= 16384;
			if ((i_10_ ^ 0xffffffff) > 8191)
				i_10_ += 16384;
			if (i_10_ < 0 && (i_9_ ^ 0xffffffff) < -1 || i_10_ > 0 && i_9_ < 0)
				Class171.anInt2193 = i_8_;
			Class211.anInt2857 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "su.D(" + i + ')');
		}
	}

	final synchronized Class80 method1938(int i) {
		try {
			anInt4247++;
			Class80 class80 = ((Class80) ((Class96) ((Class319) this).aClass96_4244).aClass22_1290
					.method188((long) anInt4245, (byte) 79));
			if (i != 1757380419)
				return null;
			if (class80 != null)
				return class80;
			class80 = Class80
					.method545(
							(((Class96) ((Class319) this).aClass96_4244).aClass146_1284),
							anInt4245, 0);
			if (class80 != null)
				((Class96) ((Class319) this).aClass96_4244).aClass22_1290
						.method184((byte) 127, class80, (long) anInt4245);
			return class80;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "su.C(" + i + ')');
		}
	}

	final void method1939(Stream stream, int i) {
		try {
			if (i != 3)
				anInt4245 = -58;
			anInt4246++;
			for (;;) {
				int i_11_ = stream.readUnsignedByte((byte) 35);
				if (i_11_ == 0)
					break;
				method1940(i_11_, i ^ ~0x7c24, stream);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "su.A("
					+ (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public Class319() {
		/* empty */
	}

	private final void method1940(int i, int i_12_, Stream stream) {
		try {
			if ((i ^ 0xffffffff) != -2) {
				if ((i ^ 0xffffffff) == -3) {
					((Class319) this).anInt4241 = stream
							.readUnsignedByte((byte) 35);
					((Class319) this).anInt4238 = stream
							.readUnsignedByte((byte) 35);
				}
			} else
				anInt4245 = stream.readUnsignedShort((byte) -65);
			if (i_12_ != -31784)
				anInt4245 = 101;
			anInt4239++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("su.E(" + i + ','
					+ i_12_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	static final boolean method1941(int i, int i_13_, boolean bool, int i_14_,
			byte[] is, int i_15_, int i_16_) {
		try {
			anInt4243++;
			if (bool != false)
				anInt4242 = 79;
			int i_17_ = i % i_16_;
			int i_18_;
			if ((i_17_ ^ 0xffffffff) != -1)
				i_18_ = -i_17_ + i_16_;
			else
				i_18_ = 0;
			int i_19_ = -((i_13_ - (-i_16_ + 1)) / i_16_);
			int i_20_ = -((i + (i_16_ - 1)) / i_16_);
			for (int i_21_ = i_19_; i_21_ < 0; i_21_++) {
				for (int i_22_ = i_20_; i_22_ < 0; i_22_++) {
					if ((is[i_15_] ^ 0xffffffff) == -1)
						return true;
					i_15_ += i_16_;
				}
				i_15_ -= i_18_;
				if (is[i_15_ - 1] == 0)
					return true;
				i_15_ += i_14_;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("su.B(" + i + ','
					+ i_13_ + ',' + bool + ',' + i_14_ + ','
					+ (is != null ? "{...}" : "null") + ',' + i_15_ + ','
					+ i_16_ + ')'));
		}
	}
}
