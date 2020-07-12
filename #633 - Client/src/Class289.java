/* Class289 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class289 {
	static int anInt3895;
	static int[] anIntArray3896;
	int opcode;
	static int anInt3898;
	static int anInt3899;
	static Interface25[] anInterface25Array3900 = new Interface25[128];
	static int anInt3901;
	static int[] anIntArray3902;

	public final String toString() {
		try {
			anInt3898++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qg.toString(" + ')');
		}
	}

	Class289(int i, int i_0_) {
		try {
			((Class289) this).opcode = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qg.<init>(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final void method1781(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		try {
			anInt3895++;
			int i_5_ = 0;
			int i_6_ = i_1_;
			int i_7_ = -i_1_;
			if (i_4_ <= -120) {
				int i_8_ = -1;
				int i_9_ = Class244.method1540(i_3_ - -i_1_, Class26.anInt340,
						false, Class11_Sub45_Sub1_Sub2.anInt9880);
				int i_10_ = Class244.method1540(i_3_ - i_1_, Class26.anInt340,
						false, Class11_Sub45_Sub1_Sub2.anInt9880);
				Class11_Sub2_Sub32_Sub1.method3883(i_10_,
						(Class297.anIntArrayArray4026[i]), (byte) 64, i_2_,
						i_9_);
				while (i_5_ < i_6_) {
					i_8_ += 2;
					i_7_ += i_8_;
					if (i_7_ > 0) {
						i_6_--;
						i_7_ -= i_6_ << 1;
						int i_11_ = i + -i_6_;
						int i_12_ = i_6_ + i;
						if ((Class292.anInt3962 ^ 0xffffffff) >= (i_12_ ^ 0xffffffff)
								&& Class351.anInt4618 >= i_11_) {
							int i_13_ = Class244.method1540(i_5_ + i_3_,
									Class26.anInt340, false,
									(Class11_Sub45_Sub1_Sub2.anInt9880));
							int i_14_ = Class244.method1540(i_3_ + -i_5_,
									Class26.anInt340, false,
									(Class11_Sub45_Sub1_Sub2.anInt9880));
							if (Class351.anInt4618 >= i_12_)
								Class11_Sub2_Sub32_Sub1.method3883(i_14_,
										Class297.anIntArrayArray4026[i_12_],
										(byte) 50, i_2_, i_13_);
							if ((Class292.anInt3962 ^ 0xffffffff) >= (i_11_ ^ 0xffffffff))
								Class11_Sub2_Sub32_Sub1.method3883(i_14_,
										Class297.anIntArrayArray4026[i_11_],
										(byte) 77, i_2_, i_13_);
						}
					}
					i_5_++;
					int i_15_ = i + -i_5_;
					int i_16_ = i_5_ + i;
					if ((i_16_ ^ 0xffffffff) <= (Class292.anInt3962 ^ 0xffffffff)
							&& (i_15_ ^ 0xffffffff) >= (Class351.anInt4618 ^ 0xffffffff)) {
						int i_17_ = Class244.method1540(i_3_ + i_6_,
								Class26.anInt340, false,
								(Class11_Sub45_Sub1_Sub2.anInt9880));
						int i_18_ = Class244.method1540(-i_6_ + i_3_,
								Class26.anInt340, false,
								(Class11_Sub45_Sub1_Sub2.anInt9880));
						if (Class351.anInt4618 >= i_16_)
							Class11_Sub2_Sub32_Sub1.method3883(i_18_,
									Class297.anIntArrayArray4026[i_16_],
									(byte) 111, i_2_, i_17_);
						if (i_15_ >= Class292.anInt3962)
							Class11_Sub2_Sub32_Sub1.method3883(i_18_,
									Class297.anIntArrayArray4026[i_15_],
									(byte) 86, i_2_, i_17_);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qg.C(" + i + ','
					+ i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	static final int method1782(int i, int i_19_, int i_20_) {
		try {
			anInt3901++;
			i_20_ = (i_19_ & 0x7f) * i_20_ >> 7;
			if (i_20_ < 2)
				i_20_ = 2;
			else if ((i_20_ ^ 0xffffffff) < -127)
				i_20_ = 126;
			int i_21_ = -10 / ((29 - i) / 41);
			return i_20_ + (i_19_ & 0xff80);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qg.A(" + i + ','
					+ i_19_ + ',' + i_20_ + ')'));
		}
	}

	public static void method1783(int i) {
		try {
			anIntArray3902 = null;
			if (i < 36)
				anIntArray3896 = null;
			anInterface25Array3900 = null;
			anIntArray3896 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qg.B(" + i + ')');
		}
	}

	static final void method1784(int i, int i_22_, int i_23_) {
		try {
			Class234_Sub1_Sub1.anInt9734++;
			anInt3899++;
			if (i_23_ != 2)
				method1782(108, 84, 76);
			Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
					Class11_Sub3.aClass25_5113, Class183.aClass370_2366,
					(byte) 90);
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
					.writeShortLE128((byte) 85, i);
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
					.method2551(i_22_, (byte) -81);
			Class79.method541(class11_sub10, i_23_ - 10);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qg.D(" + i + ','
					+ i_22_ + ',' + i_23_ + ')'));
		}
	}

	static {
		anIntArray3896 = new int[] { 104, 120, 136, 168 };
	}
}
