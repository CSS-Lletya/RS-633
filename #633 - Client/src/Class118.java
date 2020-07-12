/* Class118 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

final class Class118 {
	static int anInt1599;
	static int anInt1600;
	static int anInt1601;
	static boolean aBool1602 = false;
	static int anInt1603;
	static IncomingPacket PLAYER_UPDATE_IN_PACKET = new IncomingPacket(33, -2);
	static int anInt1605;
	static int anInt1606;
	static long aLong1607 = 0L;
	static Object anObject1608;

	public static void method770(byte i) {
		do {
			try {
				PLAYER_UPDATE_IN_PACKET = null;
				anObject1608 = null;
				if (i == -68)
					break;
				method773(null, (byte) 118, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "dp.E(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method771(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_, int i_5_, int i_6_) {
		try {
			anInt1600++;
			int i_7_ = 0;
			int i_8_ = i_1_;
			int i_9_ = 0;
			if (i_5_ == -1587516607) {
				int i_10_ = i_4_ - i_6_;
				int i_11_ = -i_6_ + i_1_;
				int i_12_ = i_4_ * i_4_;
				int i_13_ = i_1_ * i_1_;
				int i_14_ = i_10_ * i_10_;
				int i_15_ = i_11_ * i_11_;
				int i_16_ = i_13_ << 1;
				int i_17_ = i_12_ << 1;
				int i_18_ = i_15_ << 1;
				int i_19_ = i_14_ << 1;
				int i_20_ = i_1_ << 1;
				int i_21_ = i_11_ << 1;
				int i_22_ = i_16_ + (-i_20_ + 1) * i_12_;
				int i_23_ = -((-1 + i_20_) * i_17_) + i_13_;
				int i_24_ = i_18_ + i_14_ * (1 - i_21_);
				int i_25_ = i_15_ + -((-1 + i_21_) * i_19_);
				int i_26_ = i_12_ << 2;
				int i_27_ = i_13_ << 2;
				int i_28_ = i_14_ << 2;
				int i_29_ = i_15_ << 2;
				int i_30_ = i_16_ * 3;
				int i_31_ = i_17_ * (-3 + i_20_);
				int i_32_ = i_18_ * 3;
				int i_33_ = (-3 + i_21_) * i_19_;
				int i_34_ = i_27_;
				int i_35_ = i_26_ * (-1 + i_1_);
				int i_36_ = i_29_;
				int i_37_ = i_28_ * (i_11_ - 1);
				if (Class292.anInt3962 <= i_0_ && i_0_ <= Class351.anInt4618) {
					int[] is = Class297.anIntArrayArray4026[i_0_];
					int i_38_ = Class244.method1540(i - i_4_, Class26.anInt340,
							false, (Class11_Sub45_Sub1_Sub2.anInt9880));
					int i_39_ = Class244.method1540(i_4_ + i, Class26.anInt340,
							false, (Class11_Sub45_Sub1_Sub2.anInt9880));
					int i_40_ = Class244.method1540(-i_10_ + i,
							Class26.anInt340, false,
							(Class11_Sub45_Sub1_Sub2.anInt9880));
					int i_41_ = Class244.method1540(i - -i_10_,
							Class26.anInt340, false,
							(Class11_Sub45_Sub1_Sub2.anInt9880));
					Class11_Sub2_Sub32_Sub1.method3883(i_38_, is, (byte) 74,
							i_2_, i_40_);
					Class11_Sub2_Sub32_Sub1.method3883(i_40_, is, (byte) 70,
							i_3_, i_41_);
					Class11_Sub2_Sub32_Sub1.method3883(i_41_, is, (byte) 67,
							i_2_, i_39_);
				}
				while (i_8_ > 0) {
					boolean bool = (i_11_ ^ 0xffffffff) <= (i_8_ ^ 0xffffffff);
					if (bool) {
						if ((i_24_ ^ 0xffffffff) > -1) {
							while (i_24_ < 0) {
								i_24_ += i_32_;
								i_25_ += i_36_;
								i_32_ += i_29_;
								i_36_ += i_29_;
								i_9_++;
							}
						}
						if ((i_25_ ^ 0xffffffff) > -1) {
							i_25_ += i_36_;
							i_24_ += i_32_;
							i_36_ += i_29_;
							i_32_ += i_29_;
							i_9_++;
						}
						i_25_ += -i_33_;
						i_24_ += -i_37_;
						i_37_ -= i_28_;
						i_33_ -= i_28_;
					}
					if (i_22_ < 0) {
						while (i_22_ < 0) {
							i_22_ += i_30_;
							i_23_ += i_34_;
							i_30_ += i_27_;
							i_34_ += i_27_;
							i_7_++;
						}
					}
					if ((i_23_ ^ 0xffffffff) > -1) {
						i_22_ += i_30_;
						i_23_ += i_34_;
						i_7_++;
						i_34_ += i_27_;
						i_30_ += i_27_;
					}
					i_23_ += -i_31_;
					i_22_ += -i_35_;
					i_31_ -= i_26_;
					i_8_--;
					i_35_ -= i_26_;
					int i_42_ = -i_8_ + i_0_;
					int i_43_ = i_0_ - -i_8_;
					if ((Class292.anInt3962 ^ 0xffffffff) >= (i_43_ ^ 0xffffffff)
							&& i_42_ <= Class351.anInt4618) {
						int i_44_ = Class244.method1540(i_7_ + i,
								Class26.anInt340, false,
								(Class11_Sub45_Sub1_Sub2.anInt9880));
						int i_45_ = Class244.method1540(i + -i_7_,
								Class26.anInt340, false,
								(Class11_Sub45_Sub1_Sub2.anInt9880));
						if (bool) {
							int i_46_ = Class244.method1540(i - -i_9_,
									Class26.anInt340, false,
									(Class11_Sub45_Sub1_Sub2.anInt9880));
							int i_47_ = Class244.method1540(i - i_9_,
									Class26.anInt340, false,
									(Class11_Sub45_Sub1_Sub2.anInt9880));
							if (i_42_ >= Class292.anInt3962) {
								int[] is = Class297.anIntArrayArray4026[i_42_];
								Class11_Sub2_Sub32_Sub1.method3883(i_45_, is,
										(byte) 57, i_2_, i_47_);
								Class11_Sub2_Sub32_Sub1.method3883(i_47_, is,
										(byte) 106, i_3_, i_46_);
								Class11_Sub2_Sub32_Sub1.method3883(i_46_, is,
										(byte) 99, i_2_, i_44_);
							}
							if ((Class351.anInt4618 ^ 0xffffffff) <= (i_43_ ^ 0xffffffff)) {
								int[] is = Class297.anIntArrayArray4026[i_43_];
								Class11_Sub2_Sub32_Sub1.method3883(i_45_, is,
										(byte) 78, i_2_, i_47_);
								Class11_Sub2_Sub32_Sub1.method3883(i_47_, is,
										(byte) 80, i_3_, i_46_);
								Class11_Sub2_Sub32_Sub1.method3883(i_46_, is,
										(byte) 121, i_2_, i_44_);
							}
						} else {
							if ((i_42_ ^ 0xffffffff) <= (Class292.anInt3962 ^ 0xffffffff))
								Class11_Sub2_Sub32_Sub1.method3883(i_45_,
										Class297.anIntArrayArray4026[i_42_],
										(byte) 102, i_2_, i_44_);
							if (i_43_ <= Class351.anInt4618)
								Class11_Sub2_Sub32_Sub1.method3883(i_45_,
										Class297.anIntArrayArray4026[i_43_],
										(byte) 95, i_2_, i_44_);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("dp.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	final int method772(int i, int i_48_, int i_49_) {
		try {
			anInt1599++;
			int i_50_ = ((i ^ 0xffffffff) <= (Class11_Sub36.anInt7079 ^ 0xffffffff) ? i
					: Class11_Sub36.anInt7079);
			if (this == Class102.aClass118_1364)
				return 0;
			if (i_49_ > -62)
				PLAYER_UPDATE_IN_PACKET = null;
			if (this == Class47.aClass118_740)
				return -i_48_ + i_50_;
			if (this == Class376_Sub7_Sub2_Sub1.aClass118_10207)
				return (i_50_ - i_48_) / 2;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("dp.C(" + i + ','
					+ i_48_ + ',' + i_49_ + ')'));
		}
	}

	static final void method773(Class341 class341, byte i, Frame frame) {
		do {
			try {
				for (;;) {
					Class368 class368 = class341.method2071(frame, -108);
					while ((class368.anInt4837 ^ 0xffffffff) == -1)
						Class11_Sub51.method3236(10L, i ^ ~0x67);
					if ((class368.anInt4837 ^ 0xffffffff) == -2)
						break;
					Class11_Sub51.method3236(100L, 0);
				}
				anInt1606++;
				frame.setVisible(false);
				frame.dispose();
				if (i == -104)
					break;
				aLong1607 = 85L;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("dp.D("
						+ (class341 != null ? "{...}" : "null") + ',' + i + ','
						+ (frame != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final void method774(int i, int i_51_, int i_52_) {
		try {
			anInt1603++;
			if (i_51_ > 100) {
				int i_53_ = (Class256_Sub1.aClass292_5320.method1805(
						Class26.aClass26_300.method217((byte) 95,
								(Class11_Sub45_Sub1_Sub2.anInt9884)),
						(byte) -99));
				int i_54_;
				if (!Class11_Sub2_Sub14.aBool9015) {
					for (Class11_Sub45_Sub5 class11_sub45_sub5 = ((Class11_Sub45_Sub5) Class94_Sub1.aClass84_5220
							.method584(-12261)); class11_sub45_sub5 != null; class11_sub45_sub5 = (Class11_Sub45_Sub5) Class94_Sub1.aClass84_5220
							.method578(-15361)) {
						int i_55_ = Class278.method1715(4, class11_sub45_sub5);
						if (i_53_ < i_55_)
							i_53_ = i_55_;
					}
					i_54_ = 21 + 16 * Class52.anInt802;
					Class239_Sub1.anInt7270 = (!Class254_Sub3.aBool8049 ? 22
							: 26) + Class52.anInt802 * 16;
					i_53_ += 8;
				} else {
					for (Class11_Sub45_Sub14 class11_sub45_sub14 = ((Class11_Sub45_Sub14) Class161.aClass38_2097
							.method331((byte) -7)); class11_sub45_sub14 != null; class11_sub45_sub14 = ((Class11_Sub45_Sub14) Class161.aClass38_2097
							.method333(-58))) {
						int i_56_;
						if ((((Class11_Sub45_Sub14) class11_sub45_sub14).anInt9313) != 1)
							i_56_ = IComponentDefinitions.method1258(
									class11_sub45_sub14, (byte) -83);
						else
							i_56_ = (Class278
									.method1715(
											4,
											((Class11_Sub45_Sub5) (((Class11_Sub45) (((Class38) (((Class11_Sub45_Sub14) class11_sub45_sub14).aClass38_9312)).aClass11_Sub45_515)).aClass11_Sub45_7903))));
						if ((i_56_ ^ 0xffffffff) < (i_53_ ^ 0xffffffff))
							i_53_ = i_56_;
					}
					Class239_Sub1.anInt7270 = 16 * Class307.anInt4123
							+ (Class254_Sub3.aBool8049 ? 26 : 22);
					i_53_ += 8;
					i_54_ = 16 * Class307.anInt4123 + 21;
				}
				int i_57_ = i_52_ + -(i_53_ / 2);
				if (i_53_ + i_57_ > Class11_Sub36.anInt7079)
					i_57_ = Class11_Sub36.anInt7079 + -i_53_;
				if ((i_57_ ^ 0xffffffff) > -1)
					i_57_ = 0;
				int i_58_ = i;
				if (i_58_ - -i_54_ > Class153.anInt2025)
					i_58_ = -i_54_ + Class153.anInt2025;
				if ((i_58_ ^ 0xffffffff) > -1)
					i_58_ = 0;
				Class319.anInt4242 = i_57_;
				Class306.aBool4114 = true;
				Class205.anInt2757 = i_53_;
				Class144.anInt1944 = i_58_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("dp.B(" + i + ','
					+ i_51_ + ',' + i_52_ + ')'));
		}
	}

	public Class118() {
		/* empty */
	}

	public final String toString() {
		try {
			anInt1601++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dp.toString(" + ')');
		}
	}
}
