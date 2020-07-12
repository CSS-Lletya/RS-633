/* Class11_Sub20_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;
import java.util.TimeZone;

final class Packet extends Stream {
	static int anInt8709;
	private ISAAC aClass25_8710;
	private int anInt8711;
	static int anInt8712;
	static Calendar aCalendar8713 = Calendar.getInstance(TimeZone
			.getTimeZone("GMT"));
	static int anInt8714;
	static int anInt8715;
	static int anInt8716;
	static int anInt8717;
	static int anInt8718;
	static int anInt8719;
	static int anInt8720;
	static int anInt8721;
	static int anInt8722;
	static Class223 aClass223_8723;
	static Class13[] aClass13Array8724;
	static int anInt8725;
	static int anInt8726;

	static final void method3414(int i) {
		try {
			anInt8716++;
			if (i != -5685)
				aClass223_8723 = null;
			for (Class11_Sub26 class11_sub26 = ((Class11_Sub26) Class111.aClass213_1522
					.method1365(24490)); class11_sub26 != null; class11_sub26 = (Class11_Sub26) Class111.aClass213_1522
					.method1367((byte) 71))
				Class46.method404(((Class11_Sub26) class11_sub26).anInt6297,
						(byte) 122);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ag.E(" + i + ')');
		}
	}

	static final void method3415(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		try {
			anInt8726++;
			if ((i_1_ ^ 0xffffffff) <= (Class292.anInt3962 ^ 0xffffffff)
					&& (Class351.anInt4618 ^ 0xffffffff) <= (i_1_ ^ 0xffffffff)) {
				i_3_ = Class244.method1540(i_3_, Class26.anInt340, false,
						Class11_Sub45_Sub1_Sub2.anInt9880);
				i_0_ = Class244.method1540(i_0_, Class26.anInt340, false,
						Class11_Sub45_Sub1_Sub2.anInt9880);
				Class11_Sub45_Sub13.method3636(i_3_, i_1_, (byte) 97, i, i_0_);
			}
			int i_4_ = 13 % ((i_2_ - 36) / 62);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ag.K(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	final int readPacket(byte i) {
		try {
			anInt8712++;
			int i_5_ = ((((Stream) this).buffer[((Stream) this).position++] + -aClass25_8710
					.method212(-94)) & 0xff);
			if (i != -21)
				return 59;
			if (i_5_ < 128)
				return i_5_;
			return (-128 + i_5_ << 8)
					+ (((((Stream) this).buffer[((Stream) this).position++]) + -aClass25_8710
							.method212(-19)) & 0xff);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ag.B(" + i + ')');
		}
	}

	final int readBits(int i, byte i_6_) {
		try {
			if (i_6_ != 108)
				readBits(-105, (byte) -1);
			anInt8719++;
			int i_7_ = anInt8711 >> 3;
			int i_8_ = 8 + -(anInt8711 & 0x7);
			anInt8711 += i;
			int i_9_ = 0;
			for (/**/; (i_8_ ^ 0xffffffff) > (i ^ 0xffffffff); i_8_ = 8) {
				i_9_ += (OutputStream_Sub1.anIntArray5847[i_8_] & ((Stream) this).buffer[i_7_++]) << i
						- i_8_;
				i -= i_8_;
			}
			if ((i_8_ ^ 0xffffffff) == (i ^ 0xffffffff))
				i_9_ += (((Stream) this).buffer[i_7_] & OutputStream_Sub1.anIntArray5847[i_8_]);
			else
				i_9_ += (((Stream) this).buffer[i_7_] >> i_8_ - i & OutputStream_Sub1.anIntArray5847[i]);
			return i_9_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ag.H(" + i + ','
					+ i_6_ + ')');
		}
	}

	Packet(int i) {
		super(i);
	}

	final boolean method3418(byte i) {
		try {
			anInt8722++;
			int i_10_ = 111 / ((i - 23) / 57);
			int i_11_ = ((((Stream) this).buffer[((Stream) this).position] - aClass25_8710
					.method214(256)) & 0xff);
			if ((i_11_ ^ 0xffffffff) > -129)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ag.G(" + i + ')');
		}
	}

	public static void method3419(byte i) {
		try {
			int i_12_ = -5 % ((-49 - i) / 47);
			aClass13Array8724 = null;
			aClass223_8723 = null;
			aCalendar8713 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ag.L(" + i + ')');
		}
	}

	final void method3420(int i, int i_13_) {
		try {
			if (i != -16073)
				method3421(-33, -72, 30);
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i_13_ + aClass25_8710
					.method212(i + 16188));
			anInt8717++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ag.C(" + i + ','
					+ i_13_ + ')');
		}
	}

	static final Class11_Sub45_Sub15 method3421(int i, int i_14_, int i_15_) {
		try {
			anInt8721++;
			Class11_Sub45_Sub15 class11_sub45_sub15 = ((Class11_Sub45_Sub15) Class219.aClass213_3020
					.method1369((byte) 26, ((long) i_15_ | (long) i_14_ << 32)));
			if (class11_sub45_sub15 == null) {
				class11_sub45_sub15 = new Class11_Sub45_Sub15(i_14_, i_15_);
				Class219.aClass213_3020.method1368(
						(((Class11) class11_sub45_sub15).aLong91),
						class11_sub45_sub15, (byte) -26);
			}
			if (i != -652872096)
				return null;
			return class11_sub45_sub15;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ag.J(" + i + ','
					+ i_14_ + ',' + i_15_ + ')'));
		}
	}

	final void method3422(ISAAC class25, int i) {
		try {
			aClass25_8710 = class25;
			if (i != 12693)
				method3418((byte) -86);
			anInt8714++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ag.I("
					+ (class25 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void finishBitAccess(byte i) {
		try {
			((Stream) this).position = (anInt8711 + 7) / 8;
			if (i <= 103)
				method3419((byte) 93);
			anInt8709++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ag.N(" + i + ')');
		}
	}

	final void method3424(int[] is, int i) {
		try {
			if (i != -16797)
				method3425(-93, 48);
			anInt8720++;
			aClass25_8710 = new ISAAC(is);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ag.M("
					+ (is != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final int method3425(int i, int i_16_) {
		try {
			if (i_16_ != -3)
				aClass223_8723 = null;
			anInt8715++;
			return i * 8 + -anInt8711;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ag.F(" + i + ','
					+ i_16_ + ')');
		}
	}

	final void method3426(boolean bool, int i, int i_17_, byte[] is) {
		do {
			try {
				for (int i_18_ = 0; i_18_ < i_17_; i_18_++)
					is[i + i_18_] = (byte) ((((Stream) this).buffer[((Stream) this).position++]) + -aClass25_8710
							.method212(-107));
				anInt8718++;
				if (bool == true)
					break;
				method3419((byte) -73);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ag.A(" + bool
						+ ',' + i + ',' + i_17_ + ','
						+ (is != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method3427(int i) {
		do {
			try {
				anInt8725++;
				anInt8711 = ((Stream) this).position * 8;
				if (i == 7)
					break;
				method3414(-83);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ag.D(" + i + ')');
			}
			break;
		} while (false);
	}
}
