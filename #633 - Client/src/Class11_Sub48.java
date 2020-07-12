/* Class11_Sub48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub48 extends Class11 {
	int anInt7989;
	int anInt7990;
	IComponentDefinitions aClass192_7991;
	int anInt7992;
	Object[] parameters;
	static int anInt7994;
	static int anInt7995;
	static int anInt7996;
	String aString7997;
	int anInt7998;
	IComponentDefinitions aClass192_7999;
	static int anInt8000 = 0;
	int anInt8001;
	int anInt8002;
	static Class16 aClass16_8003 = new Class16();
	boolean aBool8004;
	static String[] aStringArray8005 = new String[100];

	static final Class11_Sub10 method3215(ISAAC class25,
			OutgoingPacket class370, byte i) {
		try {
			anInt7995++;
			Class11_Sub10 class11_sub10 = Class11_Sub2_Sub2.method3333(false);
			((Class11_Sub10) class11_sub10).aClass370_5394 = class370;
			((Class11_Sub10) class11_sub10).anInt5395 = ((OutgoingPacket) class370).anInt4861;
			int i_0_ = -80 / ((13 - i) / 34);
			if ((((Class11_Sub10) class11_sub10).anInt5395 ^ 0xffffffff) != 0) {
				if (((Class11_Sub10) class11_sub10).anInt5395 != -2) {
					if ((((Class11_Sub10) class11_sub10).anInt5395 ^ 0xffffffff) >= -19)
						((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397 = new Packet(
								20);
					else if ((((Class11_Sub10) class11_sub10).anInt5395 ^ 0xffffffff) >= -99)
						((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397 = new Packet(
								100);
					else
						((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397 = new Packet(
								260);
				} else
					((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397 = new Packet(
							10000);
			} else
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397 = new Packet(
						260);
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
					.method3422(class25, 12693);
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
					.method3420(-16073,
							((Class11_Sub10) class11_sub10).aClass370_5394
									.method2186(-20537));
			((Class11_Sub10) class11_sub10).anInt5392 = 0;
			return class11_sub10;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ws.A("
					+ (class25 != null ? "{...}" : "null") + ','
					+ (class370 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final void method3216(Stream stream, int i, int i_1_) {
		do {
			try {
				if (Class11_Sub30_Sub1.aClass182_8980 != null) {
					try {
						Class11_Sub30_Sub1.aClass182_8980.method1192(0L, true);
						Class11_Sub30_Sub1.aClass182_8980.method1189(24,
								(byte) 72, ((Stream) stream).buffer, i_1_);
					} catch (Exception exception) {
						/* empty */
					}
				}
				anInt7996++;
				if (i == 0)
					break;
				method3218(false);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ws.B("
						+ (stream != null ? "{...}" : "null") + ',' + i + ','
						+ i_1_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method3217(Class23 class23, int i, Class163 class163,
			Class11_Sub21 class11_sub21) {
		try {
			anInt7994++;
			Class253 class253 = class23.method202(class163, 131072);
			if (class253 != null) {
				int i_2_ = class253.method1609();
				if (class253.method1615() > i_2_)
					i_2_ = class253.method1615();
				if (i != 0)
					method3217(null, -75, null, null);
				int i_3_ = 10;
				int i_4_ = ((Class11_Sub21) class11_sub21).anInt5965;
				int i_5_ = ((Class11_Sub21) class11_sub21).anInt5967;
				int i_6_ = 0;
				int i_7_ = 0;
				int i_8_ = 0;
				if (((Class23) class23).aString247 != null) {
					i_6_ = (Class11_Sub45_Sub2.aClass292_8511.method1806(
							((Class23) class23).aString247,
							Class108_Sub27.aStringArray7865, null, 60, null));
					for (int i_9_ = 0; (i_6_ ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++) {
						String string = Class108_Sub27.aStringArray7865[i_9_];
						if ((i_6_ - 1 ^ 0xffffffff) < (i_9_ ^ 0xffffffff))
							string = string.substring(0, -4 + string.length());
						int i_10_ = Class357.aClass40_4667.method360(string);
						if (i_10_ > i_7_)
							i_7_ = i_10_;
					}
					i_8_ = (Class357.aClass40_4667.method359() * i_6_ + Class357.aClass40_4667
							.method358() / 2);
				}
				int i_11_ = i_2_ / 2
						+ ((Class11_Sub21) class11_sub21).anInt5965;
				int i_12_ = ((Class11_Sub21) class11_sub21).anInt5967;
				if (Class32.anInt453 - -i_2_ > i_4_) {
					i_11_ = i_7_ / 2
							+ (i_3_ + (i_2_ / 2 + Class32.anInt453) + 5);
					i_4_ = Class32.anInt453;
				} else if (i_4_ > -i_2_ + Class32.anInt445) {
					i_4_ = Class32.anInt445 + -i_2_;
					i_11_ = -i_3_ + Class32.anInt445 - i_2_ / 2
							+ (-(i_7_ / 2) - 5);
				}
				if ((i_5_ ^ 0xffffffff) <= (i_2_ + Class32.anInt436 ^ 0xffffffff)) {
					if (i_5_ > -i_2_ + Class32.anInt448) {
						i_5_ = -i_2_ + Class32.anInt448;
						i_12_ = Class32.anInt448 + -(i_2_ / 2) - (i_3_ + i_8_);
					}
				} else {
					i_5_ = Class32.anInt436;
					i_12_ = i_3_ + Class32.anInt436 + i_2_ / 2;
				}
				int i_13_ = ((int) (32767.0 * (Math
						.atan2((double) (i_4_ + -(((Class11_Sub21) class11_sub21).anInt5965)),
								(double) (i_5_ - (((Class11_Sub21) class11_sub21).anInt5967))) / 3.141592653589793)) & 0xffff);
				class253.method1616((float) i_4_ + (float) i_2_ / 2.0F,
						(float) i_2_ / 2.0F + (float) i_5_, 4096, i_13_);
				int i_14_ = -2;
				int i_15_ = -2;
				int i_16_ = -2;
				int i_17_ = -2;
				if (((Class23) class23).aString247 != null) {
					i_15_ = i_12_;
					i_14_ = -(i_7_ / 2) + (i_11_ - 5);
					i_17_ = Class357.aClass40_4667.method359() * i_6_
							+ (i_15_ + 3);
					i_16_ = i_7_ + i_14_ + 10;
					if ((((Class23) class23).anInt229 ^ 0xffffffff) != -1)
						class163.method1035(((Class23) class23).anInt229,
								i_14_, i_15_, (byte) 72, i_17_ + -i_15_, -i_14_
										+ i_16_);
					if (((Class23) class23).anInt224 != 0)
						class163.method1018(i_15_,
								((Class23) class23).anInt224, -i_15_ + i_17_,
								i_16_ - i_14_, 120, i_14_);
					for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_18_++) {
						String string = Class108_Sub27.aStringArray7865[i_18_];
						if ((-1 + i_6_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff))
							string = string.substring(0, -4 + string.length());
						Class357.aClass40_4667.method362(class163, string,
								i_11_, i_12_, (((Class23) class23).anInt246),
								true);
						i_12_ += Class357.aClass40_4667.method359();
					}
				}
				if ((((Class23) class23).anInt203 ^ 0xffffffff) != 0
						|| ((Class23) class23).aString247 != null) {
					Class11_Sub22 class11_sub22 = new Class11_Sub22(
							class11_sub21);
					i_2_ >>= 1;
					((Class11_Sub22) class11_sub22).anInt5979 = i_16_;
					((Class11_Sub22) class11_sub22).anInt5976 = i_5_ + -i_2_;
					((Class11_Sub22) class11_sub22).anInt5973 = i_2_ + i_4_;
					((Class11_Sub22) class11_sub22).anInt5974 = i_15_;
					((Class11_Sub22) class11_sub22).anInt5975 = i_2_ + i_5_;
					((Class11_Sub22) class11_sub22).anInt5977 = i_14_;
					((Class11_Sub22) class11_sub22).anInt5972 = i_17_;
					((Class11_Sub22) class11_sub22).anInt5978 = i_4_ + -i_2_;
					ISAAC.aClass84_265.method589((byte) -13, class11_sub22);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ws.D("
					+ (class23 != null ? "{...}" : "null") + ',' + i + ','
					+ (class163 != null ? "{...}" : "null") + ','
					+ (class11_sub21 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3218(boolean bool) {
		do {
			try {
				aClass16_8003 = null;
				aStringArray8005 = null;
				if (bool == false)
					break;
				method3216(null, 87, -122);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ws.C(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	public Class11_Sub48() {
		/* empty */
	}
}
