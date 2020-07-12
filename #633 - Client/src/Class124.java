/* Class124 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class124 {
	static int anInt1668;
	static int anInt1669;
	static int anInt1670;
	static int anInt1671;
	static int anInt1672;
	static Class153 aClass153_1673 = new Class153(0);
	static int anInt1674;
	static int anInt1675;
	static int anInt1676;
	static int anInt1677 = 0;
	private Class11_Sub45 aClass11_Sub45_1678 = new Class11_Sub45();
	static Class253 aClass253_1679;
	static IncomingPacket aClass160_1680 = new IncomingPacket(95, 6);
	private int anInt1681;
	private int anInt1682;
	static int[] anIntArray1683 = new int[13];
	private Class213 aClass213_1684;
	private Class38 aClass38_1685 = new Class38();

	static final void method806() {
		for (;;) {
			boolean bool = true;
			for (int i = 0; i < Packet.aClass13Array8724.length; i++) {
				if (!Packet.aClass13Array8724[i].method143()) {
					synchronized (Packet.aClass13Array8724[i]) {
						Packet.aClass13Array8724[i].notify();
					}
					bool = false;
				} else
					Class220_Sub1.aLongArray7154[i] = Packet.aClass13Array8724[i]
							.method141();
			}
			if (bool)
				break;
			try {
				Class11_Sub51.method3236(1L, 0);
			} catch (Exception exception) {
				/* empty */
			}
		}
		Packet.aClass13Array8724[Packet.aClass13Array8724.length - 1]
				.method138();
		Class358.method2131(1);
		for (;;) {
			boolean bool = true;
			for (int i = 0; i < Packet.aClass13Array8724.length - 1; i++) {
				if (!Packet.aClass13Array8724[i].method143()) {
					synchronized (Packet.aClass13Array8724[i]) {
						Packet.aClass13Array8724[i].notify();
					}
					bool = false;
				}
			}
			if (bool)
				break;
			try {
				Class11_Sub51.method3236(1L, 0);
			} catch (Exception exception) {
				/* empty */
			}
		}
		for (int i = 1; i < Packet.aClass13Array8724.length - 2; i++)
			Packet.aClass13Array8724[i].method138();
		Class358.method2131(2);
		while (!Packet.aClass13Array8724[0].method143()) {
			synchronized (Packet.aClass13Array8724[0]) {
				Packet.aClass13Array8724[0].notify();
			}
			try {
				Class11_Sub51.method3236(1L, 0);
			} catch (Exception exception) {
				/* empty */
			}
		}
		Packet.aClass13Array8724[0].method138();
	}

	final void method807(int i) {
		try {
			if (i != 63)
				aClass153_1673 = null;
			aClass38_1685.method334(3);
			anInt1674++;
			aClass213_1684.method1364((byte) 82);
			aClass11_Sub45_1678 = new Class11_Sub45();
			anInt1681 = anInt1682;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dv.E(" + i + ')');
		}
	}

	static final void method808(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_) {
		do {
			try {
				anInt1671++;
				if ((Class351.anInt4618 ^ 0xffffffff) <= (i_3_ ^ 0xffffffff)
						&& Class292.anInt3962 <= i) {
					boolean bool;
					if ((Class26.anInt340 ^ 0xffffffff) >= (i_4_ ^ 0xffffffff)) {
						if (i_4_ <= Class11_Sub45_Sub1_Sub2.anInt9880)
							bool = true;
						else {
							bool = false;
							i_4_ = Class11_Sub45_Sub1_Sub2.anInt9880;
						}
					} else {
						bool = false;
						i_4_ = Class26.anInt340;
					}
					boolean bool_5_;
					if (i_1_ < Class26.anInt340) {
						bool_5_ = false;
						i_1_ = Class26.anInt340;
					} else if ((i_1_ ^ 0xffffffff) >= (Class11_Sub45_Sub1_Sub2.anInt9880 ^ 0xffffffff))
						bool_5_ = true;
					else {
						bool_5_ = false;
						i_1_ = Class11_Sub45_Sub1_Sub2.anInt9880;
					}
					if ((Class292.anInt3962 ^ 0xffffffff) >= (i_3_ ^ 0xffffffff))
						Class11_Sub2_Sub32_Sub1.method3883(i_4_,
								Class297.anIntArrayArray4026[i_3_++],
								(byte) 83, i_0_, i_1_);
					else
						i_3_ = Class292.anInt3962;
					if (i > Class351.anInt4618)
						i = Class351.anInt4618;
					else
						Class11_Sub2_Sub32_Sub1.method3883(i_4_,
								Class297.anIntArrayArray4026[i--], (byte) 88,
								i_0_, i_1_);
					if (!bool || !bool_5_) {
						if (bool) {
							for (int i_6_ = i_3_; (i ^ 0xffffffff) <= (i_6_ ^ 0xffffffff); i_6_++)
								Class297.anIntArrayArray4026[i_6_][i_4_] = i_0_;
						} else if (bool_5_) {
							for (int i_7_ = i_3_; i >= i_7_; i_7_++)
								Class297.anIntArrayArray4026[i_7_][i_1_] = i_0_;
						}
					} else {
						for (int i_8_ = i_3_; i >= i_8_; i_8_++) {
							int[] is = Class297.anIntArrayArray4026[i_8_];
							is[i_4_] = is[i_1_] = i_0_;
						}
					}
				}
				if (i_2_ == -178792918)
					break;
				method814(false, -51);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("dv.B(" + i + ','
						+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ','
						+ i_4_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method809(int i) {
		try {
			aClass153_1673 = null;
			aClass253_1679 = null;
			anIntArray1683 = null;
			if (i != 8)
				anInt1677 = -99;
			aClass160_1680 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dv.C(" + i + ')');
		}
	}

	final void method810(long l, byte i) {
		do {
			try {
				anInt1670++;
				Class11_Sub45 class11_sub45 = (Class11_Sub45) aClass213_1684
						.method1369((byte) 26, l);
				if (i < 126)
					aClass253_1679 = null;
				if (class11_sub45 == null)
					break;
				class11_sub45.method122(-92);
				class11_sub45.method3187(100);
				anInt1681++;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "dv.G(" + l + ','
						+ i + ')');
			}
			break;
		} while (false);
	}

	static final void method811(int i, boolean bool, int i_9_, int i_10_,
			boolean bool_11_) {
		try {
			anInt1672++;
			if (bool
					|| (i_9_ ^ 0xffffffff) != (Class350.anInt4617 ^ 0xffffffff)
					|| ((Class376_Sub7_Sub3_Sub1.anInt9867 ^ 0xffffffff) != (i_10_ ^ 0xffffffff))
					|| (Class51.anInt800 != Class376_Sub7_Sub2.anInt9242 && (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub27_5707
							.method3158(false) ^ 0xffffffff) != -2)) {
				Class51.anInt800 = Class376_Sub7_Sub2.anInt9242;
				Class350.anInt4617 = i_9_;
				Class376_Sub7_Sub3_Sub1.anInt9867 = i_10_;
				if ((((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub27_5707
						.method3158(false) ^ 0xffffffff) == -2)
					Class51.anInt800 = 0;
				Class83.method575(bool_11_, i);
				Class11_Sub2_Sub8.method3433(Class161.aClass292_2096,
						Class26.aClass26_288.method217((byte) 91,
								(Class11_Sub45_Sub1_Sub2.anInt9884)), true,
						117, OutputStream_Sub2.aClass107_7949,
						Class321_Sub2.aClass163_6648);
				int i_12_ = Class194.anInt2641;
				Class194.anInt2641 = (Class350.anInt4617 + -(Class300.anInt4051 >> 4)) * 8;
				int i_13_ = Class118.anInt1605;
				Class118.anInt1605 = (-(Class108_Sub12.anInt6228 >> 4) + Class376_Sub7_Sub3_Sub1.anInt9867) * 8;
				Class113.aClass11_Sub45_Sub19_1559 = Class32.method264(
						8 * Class350.anInt4617,
						Class376_Sub7_Sub3_Sub1.anInt9867 * 8);
				Class204.aClass342_2749 = null;
				int i_14_ = -i_12_ + Class194.anInt2641;
				int i_15_ = Class118.anInt1605 + -i_13_;
				if (i != 11) {
					boolean bool_16_ = false;
					Class23.anInt249 = 0;
					int i_17_ = Class300.anInt4051 * 512 - 512;
					int i_18_ = (Class108_Sub12.anInt6228 - 1) * 512;
					for (int i_19_ = 0; ((i_19_ ^ 0xffffffff) > (Class108_Sub17.anInt6619 ^ 0xffffffff)); i_19_++) {
						Class11_Sub25 class11_sub25 = Class369.aClass11_Sub25Array4842[i_19_];
						if (class11_sub25 != null) {
							Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) class11_sub25).aNpc_2373);
							((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7045 -= 512 * i_14_;
							((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7031 -= 512 * i_15_;
							if ((((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7045 ^ 0xffffffff) <= -1
									&& ((i_17_ ^ 0xffffffff) <= ((((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7045) ^ 0xffffffff))
									&& (((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7031 ^ 0xffffffff) <= -1
									&& i_18_ >= (((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7031)) {
								boolean bool_20_ = true;
								for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > -11; i_21_++) {
									((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10370[i_21_] -= i_14_;
									((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10376[i_21_] -= i_15_;
									if ((((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10370[i_21_]) < 0
											|| ((((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10370[i_21_]) >= Class300.anInt4051)
											|| (((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10376[i_21_]) < 0
											|| (((((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10376[i_21_]) ^ 0xffffffff) <= (Class108_Sub12.anInt6228 ^ 0xffffffff)))
										bool_20_ = false;
								}
								if (bool_20_)
									Class11_Sub52.anIntArray8054[Class23.anInt249++] = (((Actor) class376_sub7_sub5_sub5_sub2).anInt10319);
								else {
									class376_sub7_sub5_sub5_sub2.method4005(-1,
											null);
									bool_16_ = true;
									class11_sub25.method122(-30);
								}
							} else {
								class376_sub7_sub5_sub5_sub2.method4005(-1,
										null);
								class11_sub25.method122(-56);
								bool_16_ = true;
							}
						}
					}
					if (bool_16_) {
						Class108_Sub17.anInt6619 = Class11_Sub2_Sub25.aClass213_9322
								.method1366(115);
						Class11_Sub2_Sub25.aClass213_9322.method1370(
								Class369.aClass11_Sub25Array4842, -1);
					}
				} else {
					for (int i_22_ = 0; i_22_ < Class108_Sub17.anInt6619; i_22_++) {
						Class11_Sub25 class11_sub25 = Class369.aClass11_Sub25Array4842[i_22_];
						if (class11_sub25 != null) {
							Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) class11_sub25).aNpc_2373);
							for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > -11; i_23_++) {
								((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10370[i_23_] -= i_14_;
								((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10376[i_23_] -= i_15_;
							}
							((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7031 -= i_15_ * 512;
							((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7045 -= 512 * i_14_;
						}
					}
				}
				for (int i_24_ = 0; i_24_ < 2048; i_24_++) {
					Player class376_sub7_sub5_sub5_sub1 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_24_]);
					if (class376_sub7_sub5_sub5_sub1 != null) {
						for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > -11; i_25_++) {
							((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10370[i_25_] -= i_14_;
							((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10376[i_25_] -= i_15_;
						}
						((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7031 -= 512 * i_15_;
						((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7045 -= i_14_ * 512;
					}
				}
				Class275[] class275s = IncomingPacket.aClass275Array2082;
				for (int i_26_ = 0; class275s.length > i_26_; i_26_++) {
					Class275 class275 = class275s[i_26_];
					if (class275 != null) {
						((Class275) class275).anInt3704 -= 512 * i_14_;
						((Class275) class275).anInt3699 -= 512 * i_15_;
					}
				}
				for (Class11_Sub15 class11_sub15 = ((Class11_Sub15) Class198.aClass84_2686
						.method584(-12261)); class11_sub15 != null; class11_sub15 = (Class11_Sub15) Class198.aClass84_2686
						.method578(-15361)) {
					((Class11_Sub15) class11_sub15).anInt5595 -= i_15_;
					((Class11_Sub15) class11_sub15).anInt5596 -= i_14_;
					if (Class141.anInt1915 != 4
							&& ((((Class11_Sub15) class11_sub15).anInt5596 ^ 0xffffffff) > -1
									|| (((Class11_Sub15) class11_sub15).anInt5595 ^ 0xffffffff) > -1
									|| ((Class300.anInt4051 ^ 0xffffffff) >= (((Class11_Sub15) class11_sub15).anInt5596 ^ 0xffffffff)) || ((((Class11_Sub15) class11_sub15).anInt5595 ^ 0xffffffff) <= (Class108_Sub12.anInt6228 ^ 0xffffffff))))
						class11_sub15.method122(-105);
				}
				if ((Class141.anInt1915 ^ 0xffffffff) != -5) {
					for (Class11_Sub27 class11_sub27 = ((Class11_Sub27) Class106.aClass213_1433
							.method1365(24490)); class11_sub27 != null; class11_sub27 = (Class11_Sub27) Class106.aClass213_1433
							.method1367((byte) 71)) {
						int i_27_ = (int) (((Class11) class11_sub27).aLong91 & 0x3fffL);
						int i_28_ = i_27_ - Class194.anInt2641;
						int i_29_ = (int) (0x3fffL & (((Class11) class11_sub27).aLong91 >> 14));
						int i_30_ = i_29_ - Class118.anInt1605;
						if ((i_28_ ^ 0xffffffff) > -1
								|| (i_30_ ^ 0xffffffff) > -1
								|| (i_28_ ^ 0xffffffff) <= (Class300.anInt4051 ^ 0xffffffff)
								|| ((i_30_ ^ 0xffffffff) <= (Class108_Sub12.anInt6228 ^ 0xffffffff)))
							class11_sub27.method122(-60);
					}
				}
				if (Class321.anInt4284 != 0) {
					Class220_Sub1.anInt7153 -= i_15_;
					Class321.anInt4284 -= i_14_;
				}
				Class72_Sub3.method2959(118);
				if (i == 11) {
					if (Class191.anInt2453 != 4) {
						Class191.anInt2453 = 1;
						Canvas_Sub1.anInt9233 = Class170.anInt2186 = -1;
					} else {
						Class94_Sub4.anInt7728 -= i_14_ * 512;
						Class279.anInt3771 -= 512 * i_15_;
						Class201.anInt2713 -= i_15_ * 512;
						Class38.anInt508 -= i_14_ * 512;
					}
				} else {
					Class303.anInt4088 -= i_15_ * 512;
					Class316.anInt4189 -= i_15_;
					Class251_Sub1.anInt5417 -= i_14_;
					Class270.anInt3650 -= i_15_;
					Class11_Sub45_Sub11.anInt9157 -= i_14_ * 512;
					Class17.anInt146 -= i_14_;
					if (Math.abs(i_14_) > Class300.anInt4051
							|| Math.abs(i_15_) > Class108_Sub12.anInt6228)
						Class376_Sub1.method2276(16711680);
				}
				Class11_Sub41.method2940(0);
				Class11_Sub45_Sub16_Sub2.method3928(16598);
				Class376.aClass84_4911.method586((byte) -19);
				Class51.aClass84_796.method586((byte) -19);
				Class163_Sub2.aClass131_7378.method850(-86);
				Class24.method207(8);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("dv.A(" + i + ','
					+ bool + ',' + i_9_ + ',' + i_10_ + ',' + bool_11_ + ')'));
		}
	}

	final void method812(Class11_Sub45 class11_sub45, byte i, long l) {
		try {
			anInt1669++;
			if (anInt1681 == 0) {
				Class11_Sub45 class11_sub45_31_ = aClass38_1685
						.method328(i - 36);
				class11_sub45_31_.method122(-73);
				class11_sub45_31_.method3187(100);
				if (aClass11_Sub45_1678 == class11_sub45_31_) {
					class11_sub45_31_ = aClass38_1685.method328(0);
					class11_sub45_31_.method122(-30);
					class11_sub45_31_.method3187(100);
				}
			} else
				anInt1681--;
			if (i != 36)
				method808(97, -41, 22, 89, -127, -6);
			aClass213_1684.method1368(l, class11_sub45, (byte) -26);
			aClass38_1685.method330(class11_sub45, 21934);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("dv.J("
					+ (class11_sub45 != null ? "{...}" : "null") + ',' + i
					+ ',' + l + ')'));
		}
	}

	final Class11_Sub45 method813(int i, long l) {
		try {
			anInt1676++;
			Class11_Sub45 class11_sub45 = (Class11_Sub45) aClass213_1684
					.method1369((byte) 26, l);
			if (class11_sub45 != null)
				aClass38_1685.method330(class11_sub45, 21934);
			int i_32_ = -97 / ((i + 61) / 48);
			return class11_sub45;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dv.D(" + i + ',' + l
					+ ')');
		}
	}

	static final int method814(boolean bool, int i) {
		try {
			anInt1668++;
			double d = (double) ((0xffe783 & i) >> 16) / 256.0;
			double d_33_ = (double) (i >> 8 & 0xff) / 256.0;
			if (bool != false)
				aClass153_1673 = null;
			double d_34_ = (double) (i & 0xff) / 256.0;
			double d_35_ = d;
			if (d_33_ < d_35_)
				d_35_ = d_33_;
			if (d_34_ < d_35_)
				d_35_ = d_34_;
			double d_36_ = d;
			if (d_33_ > d_36_)
				d_36_ = d_33_;
			if (d_36_ < d_34_)
				d_36_ = d_34_;
			double d_37_ = 0.0;
			double d_38_ = 0.0;
			double d_39_ = (d_36_ + d_35_) / 2.0;
			if (d_36_ != d_35_) {
				if (d_39_ < 0.5)
					d_38_ = (-d_35_ + d_36_) / (d_35_ + d_36_);
				if (d_39_ >= 0.5)
					d_38_ = (d_36_ - d_35_) / (-d_36_ + 2.0 - d_35_);
				if (d != d_36_) {
					if (d_33_ != d_36_) {
						if (d_36_ == d_34_)
							d_37_ = (-d_33_ + d) / (-d_35_ + d_36_) + 4.0;
					} else
						d_37_ = 2.0 + (d_34_ - d) / (d_36_ - d_35_);
				} else
					d_37_ = (d_33_ - d_34_) / (d_36_ - d_35_);
			}
			d_37_ /= 6.0;
			int i_40_ = (int) (d_37_ * 256.0);
			int i_41_ = (int) (256.0 * d_38_);
			if (i_41_ >= 0) {
				if (i_41_ > 255)
					i_41_ = 255;
			} else
				i_41_ = 0;
			int i_42_ = (int) (d_39_ * 256.0);
			if ((i_42_ ^ 0xffffffff) > -1)
				i_42_ = 0;
			else if ((i_42_ ^ 0xffffffff) < -256)
				i_42_ = 255;
			if ((i_42_ ^ 0xffffffff) >= -244) {
				if ((i_42_ ^ 0xffffffff) >= -218) {
					if ((i_42_ ^ 0xffffffff) < -193)
						i_41_ >>= 2;
					else if (i_42_ > 179)
						i_41_ >>= 1;
				} else
					i_41_ >>= 3;
			} else
				i_41_ >>= 4;
			return ((i_41_ >> 5 << 7) + (((0x3f & i_40_ >> 2) << 10) - -(i_42_ >> 1)));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dv.H(" + bool + ','
					+ i + ')');
		}
	}

	static final void method815(byte i) {
		try {
			Class376_Sub7_Sub3.anInt9277++;
			if (i >= -55)
				method811(118, false, -77, 98, true);
			anInt1675++;
			Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
					Class11_Sub3.aClass25_5113, Class11_Sub15.aClass370_5605,
					(byte) -89);
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397.writeByte(
					0, -1528071456);
			Class79.method541(class11_sub10, -20);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dv.I(" + i + ')');
		}
	}

	Class124(int i) {
		try {
			anInt1682 = i;
			anInt1681 = i;
			int i_43_;
			for (i_43_ = 1; (i_43_ - -i_43_ ^ 0xffffffff) > (i ^ 0xffffffff); i_43_ += i_43_) {
				/* empty */
			}
			aClass213_1684 = new Class213(i_43_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dv.<init>(" + i + ')');
		}
	}
}
