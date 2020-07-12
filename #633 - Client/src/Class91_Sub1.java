/* Class91_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class91_Sub1 extends Class91 {
	static int anInt6934;
	static boolean aBool6935;
	static boolean aBool6936 = false;
	static Class171 aClass171_6937;
	static int anInt6938;

	static final void method2810(int i, int i_0_, int i_1_, boolean bool,
			int i_2_, int i_3_, int i_4_) {
		try {
			Class97.method659(128, i);
			anInt6934++;
			int i_5_ = 0;
			int i_6_ = i + -i_2_;
			if (i_6_ < 0)
				i_6_ = 0;
			if (bool == true) {
				int i_7_ = i;
				int i_8_ = -i;
				int i_9_ = i_6_;
				int i_10_ = -i_6_;
				int i_11_ = -1;
				if ((i_0_ ^ 0xffffffff) <= (Class292.anInt3962 ^ 0xffffffff)
						&& (i_0_ ^ 0xffffffff) >= (Class351.anInt4618 ^ 0xffffffff)) {
					int[] is = Class297.anIntArrayArray4026[i_0_];
					int i_12_ = Class244.method1540(i_1_ + -i,
							Class26.anInt340, false,
							(Class11_Sub45_Sub1_Sub2.anInt9880));
					int i_13_ = Class244.method1540(i + i_1_, Class26.anInt340,
							false, (Class11_Sub45_Sub1_Sub2.anInt9880));
					int i_14_ = Class244.method1540(i_1_ - i_6_,
							Class26.anInt340, false,
							(Class11_Sub45_Sub1_Sub2.anInt9880));
					int i_15_ = Class244.method1540(i_6_ + i_1_,
							Class26.anInt340, false,
							(Class11_Sub45_Sub1_Sub2.anInt9880));
					Class11_Sub2_Sub32_Sub1.method3883(i_12_, is, (byte) 69,
							i_3_, i_14_);
					Class11_Sub2_Sub32_Sub1.method3883(i_14_, is, (byte) 97,
							i_4_, i_15_);
					Class11_Sub2_Sub32_Sub1.method3883(i_15_, is, (byte) 57,
							i_3_, i_13_);
				}
				int i_16_ = -1;
				while ((i_5_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff)) {
					i_11_ += 2;
					i_16_ += 2;
					i_10_ += i_16_;
					i_8_ += i_11_;
					if ((i_10_ ^ 0xffffffff) <= -1 && (i_9_ ^ 0xffffffff) <= -2) {
						i_9_--;
						Class91_Sub3_Sub1.anIntArray9340[i_9_] = i_5_;
						i_10_ -= i_9_ << 1;
					}
					i_5_++;
					if (i_8_ >= 0) {
						i_7_--;
						i_8_ -= i_7_ << 1;
						int i_17_ = -i_7_ + i_0_;
						int i_18_ = i_0_ - -i_7_;
						if ((i_18_ ^ 0xffffffff) <= (Class292.anInt3962 ^ 0xffffffff)
								&& i_17_ <= Class351.anInt4618) {
							if ((i_6_ ^ 0xffffffff) >= (i_7_ ^ 0xffffffff)) {
								int i_19_ = (Class244.method1540(i_5_ + i_1_,
										Class26.anInt340, false,
										Class11_Sub45_Sub1_Sub2.anInt9880));
								int i_20_ = (Class244.method1540(-i_5_ + i_1_,
										Class26.anInt340, false,
										Class11_Sub45_Sub1_Sub2.anInt9880));
								if ((Class351.anInt4618 ^ 0xffffffff) <= (i_18_ ^ 0xffffffff))
									Class11_Sub2_Sub32_Sub1
											.method3883(
													i_20_,
													Class297.anIntArrayArray4026[i_18_],
													(byte) 50, i_3_, i_19_);
								if ((i_17_ ^ 0xffffffff) <= (Class292.anInt3962 ^ 0xffffffff))
									Class11_Sub2_Sub32_Sub1
											.method3883(
													i_20_,
													Class297.anIntArrayArray4026[i_17_],
													(byte) 100, i_3_, i_19_);
							} else {
								int i_21_ = Class91_Sub3_Sub1.anIntArray9340[i_7_];
								int i_22_ = (Class244.method1540(i_5_ + i_1_,
										Class26.anInt340, false,
										Class11_Sub45_Sub1_Sub2.anInt9880));
								int i_23_ = (Class244.method1540(i_1_ - i_5_,
										Class26.anInt340, false,
										Class11_Sub45_Sub1_Sub2.anInt9880));
								int i_24_ = (Class244.method1540(i_1_ + i_21_,
										Class26.anInt340, false,
										Class11_Sub45_Sub1_Sub2.anInt9880));
								int i_25_ = (Class244.method1540(-i_21_ + i_1_,
										Class26.anInt340, false,
										Class11_Sub45_Sub1_Sub2.anInt9880));
								if ((Class351.anInt4618 ^ 0xffffffff) <= (i_18_ ^ 0xffffffff)) {
									int[] is = Class297.anIntArrayArray4026[i_18_];
									Class11_Sub2_Sub32_Sub1.method3883(i_23_,
											is, (byte) 66, i_3_, i_25_);
									Class11_Sub2_Sub32_Sub1.method3883(i_25_,
											is, (byte) 69, i_4_, i_24_);
									Class11_Sub2_Sub32_Sub1.method3883(i_24_,
											is, (byte) 80, i_3_, i_22_);
								}
								if ((Class292.anInt3962 ^ 0xffffffff) >= (i_17_ ^ 0xffffffff)) {
									int[] is = Class297.anIntArrayArray4026[i_17_];
									Class11_Sub2_Sub32_Sub1.method3883(i_23_,
											is, (byte) 89, i_3_, i_25_);
									Class11_Sub2_Sub32_Sub1.method3883(i_25_,
											is, (byte) 57, i_4_, i_24_);
									Class11_Sub2_Sub32_Sub1.method3883(i_24_,
											is, (byte) 120, i_3_, i_22_);
								}
							}
						}
					}
					int i_26_ = -i_5_ + i_0_;
					int i_27_ = i_0_ + i_5_;
					if (i_27_ >= Class292.anInt3962
							&& (i_26_ ^ 0xffffffff) >= (Class351.anInt4618 ^ 0xffffffff)) {
						int i_28_ = i_1_ + i_7_;
						int i_29_ = -i_7_ + i_1_;
						if (i_28_ >= Class26.anInt340
								&& ((i_29_ ^ 0xffffffff) >= (Class11_Sub45_Sub1_Sub2.anInt9880 ^ 0xffffffff))) {
							i_28_ = Class244.method1540(i_28_,
									Class26.anInt340, false,
									(Class11_Sub45_Sub1_Sub2.anInt9880));
							i_29_ = Class244.method1540(i_29_,
									Class26.anInt340, !bool,
									(Class11_Sub45_Sub1_Sub2.anInt9880));
							if ((i_5_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff)) {
								int i_30_ = ((i_5_ ^ 0xffffffff) < (i_9_ ^ 0xffffffff) ? Class91_Sub3_Sub1.anIntArray9340[i_5_]
										: i_9_);
								int i_31_ = (Class244.method1540(i_1_ + i_30_,
										Class26.anInt340, false,
										Class11_Sub45_Sub1_Sub2.anInt9880));
								int i_32_ = (Class244.method1540(i_1_ + -i_30_,
										Class26.anInt340, !bool,
										Class11_Sub45_Sub1_Sub2.anInt9880));
								if ((Class351.anInt4618 ^ 0xffffffff) <= (i_27_ ^ 0xffffffff)) {
									int[] is = Class297.anIntArrayArray4026[i_27_];
									Class11_Sub2_Sub32_Sub1.method3883(i_29_,
											is, (byte) 114, i_3_, i_32_);
									Class11_Sub2_Sub32_Sub1.method3883(i_32_,
											is, (byte) 122, i_4_, i_31_);
									Class11_Sub2_Sub32_Sub1.method3883(i_31_,
											is, (byte) 65, i_3_, i_28_);
								}
								if ((Class292.anInt3962 ^ 0xffffffff) >= (i_26_ ^ 0xffffffff)) {
									int[] is = Class297.anIntArrayArray4026[i_26_];
									Class11_Sub2_Sub32_Sub1.method3883(i_29_,
											is, (byte) 83, i_3_, i_32_);
									Class11_Sub2_Sub32_Sub1.method3883(i_32_,
											is, (byte) 58, i_4_, i_31_);
									Class11_Sub2_Sub32_Sub1.method3883(i_31_,
											is, (byte) 64, i_3_, i_28_);
								}
							} else {
								if ((i_27_ ^ 0xffffffff) >= (Class351.anInt4618 ^ 0xffffffff))
									Class11_Sub2_Sub32_Sub1
											.method3883(
													i_29_,
													Class297.anIntArrayArray4026[i_27_],
													(byte) 117, i_3_, i_28_);
								if (i_26_ >= Class292.anInt3962)
									Class11_Sub2_Sub32_Sub1
											.method3883(
													i_29_,
													Class297.anIntArrayArray4026[i_26_],
													(byte) 117, i_3_, i_28_);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nm.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + bool + ',' + i_2_ + ',' + i_3_
					+ ',' + i_4_ + ')'));
		}
	}

	public static void method2811(byte i) {
		do {
			try {
				aClass171_6937 = null;
				if (i == -74)
					break;
				method2811((byte) 10);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "nm.C(" + i + ')');
			}
			break;
		} while (false);
	}
}
