/* Class231 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

final class Class231 {
	static int anInt3156;
	static int anInt3157;
	private BigInteger aBigInteger3158;
	private Stream aClass11_Sub20_3159;
	static int anInt3160;
	static int anInt3161;
	static int anInt3162;
	private Class19_Sub1[] aClass19_Sub1Array3163;
	static int anInt3164;
	static int anInt3165;
	static int anInt3166;
	private Class82 aClass82_3167;
	static int anInt3168 = 0;
	private Class187 aClass187_3169;
	static int anInt3170 = 0;
	private Class11_Sub45_Sub20_Sub2 aClass11_Sub45_Sub20_Sub2_3171;
	private BigInteger aBigInteger3172;

	static final int method1477(int i, byte i_0_, int i_1_, int i_2_) {
		try {
			anInt3161++;
			if ((i_1_ ^ 0xffffffff) == (i ^ 0xffffffff))
				return i_1_;
			int i_3_ = 128 + -i_2_;
			int i_4_ = -118 / ((i_0_ + 28) / 51);
			int i_5_ = (i & 0x7f) * i_2_ + (i_1_ & 0x7f) * i_3_ >> 7;
			int i_6_ = (i_1_ & 0x380) * i_3_ + i_2_ * (i & 0x380) >> 7;
			int i_7_ = (i & 0xfc00) * i_2_ + i_3_ * (i_1_ & 0xfc00) >> 7;
			return 0x7f & i_5_ | (i_6_ & 0x380 | i_7_ & 0xfc00);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mb.C(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final int method1478(int i, int i_8_) {
		try {
			anInt3165++;
			if (i_8_ >= -104)
				method1478(30, 5);
			return i & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mb.G(" + i + ','
					+ i_8_ + ')');
		}
	}

	private final Class19_Sub1 method1479(int i, Class243 class243,
			Class243 class243_9_, boolean bool, byte i_10_) {
		try {
			anInt3157++;
			if (aClass11_Sub20_3159 == null)
				throw new RuntimeException();
			if (i < 0 || aClass19_Sub1Array3163.length <= i)
				throw new RuntimeException();
			if (aClass19_Sub1Array3163[i] != null)
				return aClass19_Sub1Array3163[i];
			((Stream) aClass11_Sub20_3159).position = 6 + 72 * i;
			if (i_10_ <= 33)
				anInt3160 = 27;
			int i_11_ = aClass11_Sub20_3159.readInt(102);
			int i_12_ = aClass11_Sub20_3159.readInt(105);
			byte[] is = new byte[64];
			aClass11_Sub20_3159.readBytes(is, 4, 64, 0);
			Class19_Sub1 class19_sub1 = new Class19_Sub1(i, class243,
					class243_9_, aClass187_3169, aClass82_3167, i_11_, is,
					i_12_, bool);
			aClass19_Sub1Array3163[i] = class19_sub1;
			return class19_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mb.B(" + i + ','
					+ (class243 != null ? "{...}" : "null") + ','
					+ (class243_9_ != null ? "{...}" : "null") + ',' + bool
					+ ',' + i_10_ + ')'));
		}
	}

	static final int method1480(int i, int i_13_, int i_14_) {
		try {
			anInt3164++;
			int i_15_ = (InputStream_Sub1.method2665(-1 + i_13_,
					i + 2013416686, -1 + i_14_)
					- -InputStream_Sub1.method2665(i_13_ - 1, i ^ 0x78024d12,
							i_14_ + 1) - (-InputStream_Sub1.method2665(
					i_13_ + 1, 2013416941, i_14_ - 1) + -InputStream_Sub1
					.method2665(1 + i_13_, i ^ 0x78024d12, 1 + i_14_)));
			if (i != 255)
				return -31;
			int i_16_ = (InputStream_Sub1.method2665(i_13_, 2013416941, -1
					+ i_14_) - (-InputStream_Sub1.method2665(i_13_, 2013416941,
					1 + i_14_)
					- InputStream_Sub1.method2665(-1 + i_13_, i + 2013416686,
							i_14_) - InputStream_Sub1.method2665(1 + i_13_,
					2013416941, i_14_)));
			int i_17_ = InputStream_Sub1.method2665(i_13_, 2013416941, i_14_);
			return i_15_ / 16 + i_16_ / 8 - -(i_17_ / 4);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mb.A(" + i + ','
					+ i_13_ + ',' + i_14_ + ')'));
		}
	}

	final boolean method1481(int i) {
		try {
			anInt3162++;
			if (aClass11_Sub20_3159 != null)
				return true;
			if (aClass11_Sub45_Sub20_Sub2_3171 == null) {
				if (aClass187_3169.method1229((byte) 109))
					return false;
				aClass11_Sub45_Sub20_Sub2_3171 = aClass187_3169.method1217(
						(byte) 75, true, (byte) 0, 255, 255);
			}
			if (((Class11_Sub45_Sub20) aClass11_Sub45_Sub20_Sub2_3171).aBool9737)
				return false;
			Stream stream = new Stream(
					aClass11_Sub45_Sub20_Sub2_3171.method3833((byte) 68));
			((Stream) stream).position = 5;
			int i_18_ = stream.readUnsignedByte((byte) 35);
			((Stream) stream).position += 72 * i_18_;
			byte[] is = new byte[(((Stream) stream).buffer.length + -((Stream) stream).position)];
			stream.readBytes(is, 4, is.length, 0);
			byte[] is_19_;
			if (aBigInteger3172 == null || aBigInteger3158 == null)
				is_19_ = is;
			else {
				BigInteger biginteger = new BigInteger(is);
				BigInteger biginteger_20_ = biginteger.modPow(aBigInteger3172,
						aBigInteger3158);
				is_19_ = biginteger_20_.toByteArray();
			}
			if (is_19_.length != i && is_19_.length != 64)
				throw new RuntimeException();
			byte[] is_21_ = (Class91_Sub3_Sub1.method3652(
					((Stream) stream).buffer, -is.length
							+ (((Stream) stream).position - 5), 35, 5));
			for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > -65; i_22_++) {
				if ((is_19_[i_22_ + (is_19_.length == 65 ? 1 : 0)] ^ 0xffffffff) != (is_21_[i_22_] ^ 0xffffffff))
					throw new RuntimeException();
			}
			aClass11_Sub20_3159 = stream;
			aClass19_Sub1Array3163 = new Class19_Sub1[i_18_];
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mb.D(" + i + ')');
		}
	}

	final void method1482(byte i) {
		try {
			anInt3166++;
			if (aClass19_Sub1Array3163 != null) {
				for (int i_23_ = 0; ((aClass19_Sub1Array3163.length ^ 0xffffffff) < (i_23_ ^ 0xffffffff)); i_23_++) {
					if (aClass19_Sub1Array3163[i_23_] != null)
						aClass19_Sub1Array3163[i_23_].method2466((byte) 102);
				}
				for (int i_24_ = 0; ((i_24_ ^ 0xffffffff) > (aClass19_Sub1Array3163.length ^ 0xffffffff)); i_24_++) {
					if (aClass19_Sub1Array3163[i_24_] != null)
						aClass19_Sub1Array3163[i_24_].method2467((byte) -120);
				}
				int i_25_ = -34 % ((i + 13) / 40);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mb.F(" + i + ')');
		}
	}

	Class231(Class187 class187, Class82 class82, BigInteger biginteger,
			BigInteger biginteger_26_) {
		do {
			try {
				aClass82_3167 = class82;
				aBigInteger3158 = biginteger_26_;
				aBigInteger3172 = biginteger;
				aClass187_3169 = class187;
				if (aClass187_3169.method1229((byte) 114))
					break;
				aClass11_Sub45_Sub20_Sub2_3171 = aClass187_3169.method1217(
						(byte) 75, true, (byte) 0, 255, 255);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("mb.<init>("
						+ (class187 != null ? "{...}" : "null") + ','
						+ (class82 != null ? "{...}" : "null") + ','
						+ (biginteger != null ? "{...}" : "null") + ','
						+ (biginteger_26_ != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final Class19_Sub1 method1483(int i, int i_27_, Class243 class243,
			Class243 class243_28_) {
		try {
			if (i_27_ != 1)
				method1480(-29, 61, 77);
			anInt3156++;
			return method1479(i, class243_28_, class243, true, (byte) 70);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mb.E(" + i + ','
					+ i_27_ + ',' + (class243 != null ? "{...}" : "null") + ','
					+ (class243_28_ != null ? "{...}" : "null") + ')'));
		}
	}
}
