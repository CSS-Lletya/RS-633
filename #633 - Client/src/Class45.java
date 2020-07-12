/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class45 {
	int anInt710 = -1;
	int anInt711 = -1;
	static int anInt712;
	static int anInt713;
	static int anInt714;
	static int anInt715;
	int[] anIntArray716;
	static byte[] aByteArray717 = { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127,
			-29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118,
			118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126,
			17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29,
			101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91,
			11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60,
			-36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7,
			24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5,
			25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6,
			40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40,
			42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2,
			-108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38,
			-78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96,
			104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18,
			-110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106,
			86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17,
			-111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101,
			-27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38,
			79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39,
			-14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18,
			58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107,
			-85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123,
			-2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97,
			-65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117,
			-119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2,
			65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70,
			14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84,
			116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35,
			-50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79,
			48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22,
			-16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2,
			0, 0 };
	static int anInt718;

	private final void method395(Stream stream, byte i, int i_0_) {
		do {
			try {
				if (i != -25)
					((Class45) this).anIntArray716 = null;
				anInt718++;
				if ((i_0_ ^ 0xffffffff) == -2)
					((Class45) this).anInt711 = stream
							.readUnsignedShort((byte) -65);
				else if ((i_0_ ^ 0xffffffff) == -3) {
					((Class45) this).anIntArray716 = new int[stream
							.readUnsignedByte((byte) 35)];
					for (int i_1_ = 0; ((Class45) this).anIntArray716.length > i_1_; i_1_++)
						((Class45) this).anIntArray716[i_1_] = stream
								.readUnsignedShort((byte) -65);
				} else {
					if (i_0_ != 3)
						break;
					((Class45) this).anInt710 = stream
							.readUnsignedByte((byte) 35);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("jha.B("
						+ (stream != null ? "{...}" : "null") + ',' + i + ','
						+ i_0_ + ')'));
			}
			break;
		} while (false);
	}

	static final boolean method396(byte i, int i_2_, byte[] is, int i_3_,
			int i_4_, int i_5_, int i_6_) {
		try {
			anInt712++;
			int i_7_ = i_6_ % i_5_;
			if (i != -53)
				aByteArray717 = null;
			int i_8_;
			if (i_7_ != 0)
				i_8_ = i_5_ - i_7_;
			else
				i_8_ = 0;
			int i_9_ = -((i_5_ + i_4_ - 1) / i_5_);
			int i_10_ = -((-1 + (i_6_ - -i_5_)) / i_5_);
			for (int i_11_ = i_9_; (i_11_ ^ 0xffffffff) > -1; i_11_++) {
				for (int i_12_ = i_10_; (i_12_ ^ 0xffffffff) > -1; i_12_++) {
					if ((is[i_3_] ^ 0xffffffff) == -1)
						return true;
					i_3_ += i_5_;
				}
				i_3_ -= i_8_;
				if ((is[i_3_ - 1] ^ 0xffffffff) == -1)
					return true;
				i_3_ += i_2_;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jha.D(" + i + ','
					+ i_2_ + ',' + (is != null ? "{...}" : "null") + ',' + i_3_
					+ ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	final void method397(Stream stream, byte i) {
		try {
			anInt713++;
			if (i == -101) {
				for (;;) {
					int i_13_ = stream.readUnsignedByte((byte) 35);
					if ((i_13_ ^ 0xffffffff) == -1)
						break;
					method395(stream, (byte) -25, i_13_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jha.A("
					+ (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void method398(int i, int i_14_, int i_15_, int i_16_,
			int i_17_, int i_18_, int i_19_, int i_20_) {
		try {
			anInt714++;
			int i_21_ = 0;
			int i_22_ = i;
			int i_23_ = 0;
			int i_24_ = -i_15_ + i_20_;
			int i_25_ = -i_15_ + i;
			int i_26_ = i_20_ * i_20_;
			int i_27_ = i * i;
			int i_28_ = i_24_ * i_24_;
			int i_29_ = i_25_ * i_25_;
			int i_30_ = i_27_ << 1;
			int i_31_ = i_26_ << 1;
			int i_32_ = i_29_ << 1;
			int i_33_ = i_28_ << 1;
			int i_34_ = i << 1;
			int i_35_ = i_25_ << 1;
			int i_36_ = i_30_ + (-i_34_ + 1) * i_26_;
			int i_37_ = i_27_ + -((i_34_ - 1) * i_31_);
			int i_38_ = i_28_ * (-i_35_ + 1) + i_32_;
			int i_39_ = i_29_ - i_33_ * (-1 + i_35_);
			int i_40_ = i_26_ << 2;
			int i_41_ = i_27_ << 2;
			int i_42_ = i_28_ << 2;
			int i_43_ = i_29_ << 2;
			int i_44_ = 3 * i_30_;
			int i_45_ = i_31_ * (i_34_ - 3);
			int i_46_ = i_32_ * 3;
			int i_47_ = i_33_ * (i_35_ - 3);
			int i_48_ = i_41_;
			if (i_16_ >= 47) {
				int i_49_ = i_40_ * (-1 + i);
				int i_50_ = i_43_;
				int i_51_ = (i_25_ - 1) * i_42_;
				int[] is = Class297.anIntArrayArray4026[i_17_];
				Class11_Sub2_Sub32_Sub1.method3883(i_18_ + -i_20_, is,
						(byte) 91, i_19_, -i_24_ + i_18_);
				Class11_Sub2_Sub32_Sub1.method3883(-i_24_ + i_18_, is,
						(byte) 116, i_14_, i_24_ + i_18_);
				Class11_Sub2_Sub32_Sub1.method3883(i_18_ + i_24_, is,
						(byte) 105, i_19_, i_20_ + i_18_);
				while ((i_22_ ^ 0xffffffff) < -1) {
					boolean bool = i_25_ >= i_22_;
					if (i_36_ < 0) {
						while (i_36_ < 0) {
							i_37_ += i_48_;
							i_36_ += i_44_;
							i_21_++;
							i_48_ += i_41_;
							i_44_ += i_41_;
						}
					}
					if (bool) {
						if ((i_38_ ^ 0xffffffff) > -1) {
							while (i_38_ < 0) {
								i_39_ += i_50_;
								i_38_ += i_46_;
								i_23_++;
								i_46_ += i_43_;
								i_50_ += i_43_;
							}
						}
						if ((i_39_ ^ 0xffffffff) > -1) {
							i_39_ += i_50_;
							i_38_ += i_46_;
							i_50_ += i_43_;
							i_23_++;
							i_46_ += i_43_;
						}
						i_39_ += -i_47_;
						i_38_ += -i_51_;
						i_51_ -= i_42_;
						i_47_ -= i_42_;
					}
					if ((i_37_ ^ 0xffffffff) > -1) {
						i_36_ += i_44_;
						i_37_ += i_48_;
						i_44_ += i_41_;
						i_48_ += i_41_;
						i_21_++;
					}
					i_37_ += -i_45_;
					i_36_ += -i_49_;
					i_22_--;
					i_45_ -= i_40_;
					i_49_ -= i_40_;
					int i_52_ = -i_22_ + i_17_;
					int i_53_ = i_17_ - -i_22_;
					int i_54_ = i_21_ + i_18_;
					int i_55_ = i_18_ - i_21_;
					if (!bool) {
						Class11_Sub2_Sub32_Sub1.method3883(i_55_,
								Class297.anIntArrayArray4026[i_52_], (byte) 48,
								i_19_, i_54_);
						Class11_Sub2_Sub32_Sub1.method3883(i_55_,
								Class297.anIntArrayArray4026[i_53_], (byte) 53,
								i_19_, i_54_);
					} else {
						int i_56_ = i_18_ + i_23_;
						int i_57_ = i_18_ + -i_23_;
						Class11_Sub2_Sub32_Sub1.method3883(i_55_,
								Class297.anIntArrayArray4026[i_52_], (byte) 53,
								i_19_, i_57_);
						Class11_Sub2_Sub32_Sub1.method3883(i_57_,
								Class297.anIntArrayArray4026[i_52_],
								(byte) 125, i_14_, i_56_);
						Class11_Sub2_Sub32_Sub1.method3883(i_56_,
								Class297.anIntArrayArray4026[i_52_], (byte) 75,
								i_19_, i_54_);
						Class11_Sub2_Sub32_Sub1.method3883(i_55_,
								Class297.anIntArrayArray4026[i_53_],
								(byte) 117, i_19_, i_57_);
						Class11_Sub2_Sub32_Sub1.method3883(i_57_,
								Class297.anIntArrayArray4026[i_53_], (byte) 99,
								i_14_, i_56_);
						Class11_Sub2_Sub32_Sub1.method3883(i_56_,
								Class297.anIntArrayArray4026[i_53_], (byte) 78,
								i_19_, i_54_);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jha.C(" + i + ','
					+ i_14_ + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ','
					+ i_18_ + ',' + i_19_ + ',' + i_20_ + ')'));
		}
	}

	public static void method399(boolean bool) {
		do {
			try {
				aByteArray717 = null;
				if (bool == true)
					break;
				method400(75);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "jha.F(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	public Class45() {
		/* empty */
	}

	static final void method400(int i) {
		do {
			try {
				anInt715++;
				Class287.aClass213_3883.method1364((byte) 95);
				Class161.aClass213_2098.method1364((byte) 122);
				if (i <= -32)
					break;
				method399(true);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "jha.E(" + i + ')');
			}
			break;
		} while (false);
	}
}
