/* Class362 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class362 {
	static int anInt4705;
	int anInt4706;
	static int anInt4707;
	int anInt4708;
	int anInt4709;
	static int anInt4710;
	static Class347 aClass347_4711 = new Class347("LIVE", 0);
	boolean aBool4712;
	static int anInt4713;
	static OutgoingPacket aClass370_4714 = new OutgoingPacket(38, 3);
	static int anInt4715 = 1407;
	static int anInt4716 = 0;
	static OutgoingPacket aClass370_4717 = new OutgoingPacket(33, 16);
	static int anInt4718 = -1;

	static final int method2146(int i, int i_0_, int i_1_) {
		try {
			anInt4713++;
			if (i != -30231)
				return 118;
			if (i_0_ == 1 || (i_0_ ^ 0xffffffff) == -4)
				return (Player.anIntArray10421[i_1_ & 0x3]);
			return Class62.anIntArray906[i_1_ & 0x3];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wl.D(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method2147(int i) {
		do {
			try {
				Class28.aClass22_384.method189((byte) -124);
				anInt4707++;
				if (i >= 63)
					break;
				aClass370_4714 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "wl.A(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method2148(int i) {
		try {
			aClass347_4711 = null;
			aClass370_4714 = null;
			if (i != -10869)
				anInt4718 = 31;
			aClass370_4717 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wl.B(" + i + ')');
		}
	}

	static final void method2149(int i, int i_2_, int i_3_) {
		do {
			try {
				anInt4705++;
				if (ISAAC.aClass66_263 != Class198.aClass66_2679) {
					if (Class64.method485(-3, 0, 1, 1, 1, 0, i_2_, false, i_3_))
						break;
					Class64.method485(-2, 0, 1, 1, 1, 0, i_2_, false, i_3_);
				} else {
					if (Class64.method485(-2, 0, 1, 1, 1, 0, i_2_, false, i_3_))
						break;
					Class64.method485(-3, 0, 1, 1, 1, 0, i_2_, false, i_3_);
				}
				if (i == 0)
					break;
				anInt4718 = -80;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("wl.C(" + i + ','
						+ i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	public Class362() {
		/* empty */
	}

	static final void method2150(int i, int i_4_, int i_5_, int i_6_, int i_7_,
			int i_8_) {
		try {
			anInt4710++;
			int i_9_ = 0;
			int i_10_ = i_8_;
			int i_11_ = i_7_ * i_7_;
			int i_12_ = i_8_ * i_8_;
			if (i_4_ != 22195)
				anInt4716 = -105;
			int i_13_ = i_12_ << 1;
			int i_14_ = i_11_ << 1;
			int i_15_ = i_8_ << 1;
			int i_16_ = i_11_ * (1 + -i_15_) + i_13_;
			int i_17_ = -((i_15_ - 1) * i_14_) + i_12_;
			int i_18_ = i_11_ << 2;
			int i_19_ = i_12_ << 2;
			int i_20_ = (3 + (i_9_ << 1)) * i_13_;
			int i_21_ = ((i_10_ << 1) - 3) * i_14_;
			int i_22_ = i_19_ * (1 + i_9_);
			if (i_6_ >= Class292.anInt3962
					&& (Class351.anInt4618 ^ 0xffffffff) <= (i_6_ ^ 0xffffffff)) {
				int i_23_ = Class244.method1540(i_7_ + i_5_, Class26.anInt340,
						false, Class11_Sub45_Sub1_Sub2.anInt9880);
				int i_24_ = Class244.method1540(i_5_ + -i_7_, Class26.anInt340,
						false, Class11_Sub45_Sub1_Sub2.anInt9880);
				Class11_Sub2_Sub32_Sub1.method3883(i_24_,
						(Class297.anIntArrayArray4026[i_6_]), (byte) 110, i,
						i_23_);
			}
			int i_25_ = i_18_ * (-1 + i_10_);
			while (i_10_ > 0) {
				if (i_16_ < 0) {
					while (i_16_ < 0) {
						i_16_ += i_20_;
						i_17_ += i_22_;
						i_9_++;
						i_22_ += i_19_;
						i_20_ += i_19_;
					}
				}
				if ((i_17_ ^ 0xffffffff) > -1) {
					i_16_ += i_20_;
					i_17_ += i_22_;
					i_9_++;
					i_22_ += i_19_;
					i_20_ += i_19_;
				}
				i_17_ += -i_21_;
				i_16_ += -i_25_;
				i_25_ -= i_18_;
				i_21_ -= i_18_;
				i_10_--;
				int i_26_ = i_6_ + -i_10_;
				int i_27_ = i_6_ - -i_10_;
				if ((i_27_ ^ 0xffffffff) <= (Class292.anInt3962 ^ 0xffffffff)
						&& (Class351.anInt4618 ^ 0xffffffff) <= (i_26_ ^ 0xffffffff)) {
					int i_28_ = Class244.method1540(i_5_ - -i_9_,
							Class26.anInt340, false,
							(Class11_Sub45_Sub1_Sub2.anInt9880));
					int i_29_ = Class244.method1540(i_5_ - i_9_,
							Class26.anInt340, false,
							(Class11_Sub45_Sub1_Sub2.anInt9880));
					if (Class292.anInt3962 <= i_26_)
						Class11_Sub2_Sub32_Sub1.method3883(i_29_,
								Class297.anIntArrayArray4026[i_26_], (byte) 84,
								i, i_28_);
					if ((i_27_ ^ 0xffffffff) >= (Class351.anInt4618 ^ 0xffffffff))
						Class11_Sub2_Sub32_Sub1.method3883(i_29_,
								Class297.anIntArrayArray4026[i_27_],
								(byte) 114, i, i_28_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("wl.E(" + i + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ','
							+ i_7_ + ',' + i_8_ + ')'));
		}
	}
}
