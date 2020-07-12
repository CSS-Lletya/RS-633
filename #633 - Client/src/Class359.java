/* Class359 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class359 {
	static int anInt4674;
	static int anInt4675;
	static int anInt4676;
	private long[] aLongArray4677;
	static int anInt4678;
	private byte[] aByteArray4679;
	private long[] aLongArray4680 = new long[8];
	private int anInt4681;
	static int anInt4682;
	static int anInt4683;
	static int anInt4684;
	static long aLong4685;
	private byte[] aByteArray4686;
	static int anInt4687;
	static String[] aStringArray4688 = { "Jan", "Feb", "Mar", "Apr", "May",
			"Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	private long[] aLongArray4689;
	private long[] aLongArray4690;
	private int anInt4691;
	private long[] aLongArray4692;

	static final void method2132(int i) {
		try {
			Class108_Sub16.anInt6551 = 0;
			Class93.aClass203Array1248 = new Class203[500];
			if (i == -1) {
				Class367.anInt4830 = Class376_Sub7_Sub3_Sub2.anInt10141;
				anInt4678++;
				Class321_Sub3.anIntArrayArrayArray7024 = (new int[Class155.anInt2044][1 + Class138.anInt1886][Class82.anInt1133 + 1]);
				Class11_Sub2_Sub28.aClass203Array9423 = new Class203[2000];
				Class58_Sub1_Sub1.aClass203Array9173 = new Class203[1000];
				Class265.anInt3614 = 0;
				Class57.aBool856 = false;
				InterfaceSettings.anInt5353 = Class376_Sub7_Sub3_Sub2.anInt10141;
				Class142.anInt1926 = 0;
				Class11_Sub30.anInt6612 = 0;
				Class242.aClass203Array3287 = new Class203[500];
				if (!(Class87.aClass163_1210 instanceof oa))
					Class108_Sub10.aBool6130 = true;
				else
					Class108_Sub10.aBool6130 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wh.B(" + i + ')');
		}
	}

	static final Class256_Sub4 method2133(Stream stream, byte i) {
		try {
			anInt4675++;
			if (i <= 88)
				return null;
			return new Class256_Sub4(stream.method2508((byte) 47),
					stream.method2508((byte) -114),
					stream.method2508((byte) 83),
					stream.method2508((byte) -81), stream.method2558(false),
					stream.readUnsignedByte((byte) 35));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wh.H("
					+ (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void method2134(byte i) {
		try {
			for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -6; i_0_++)
				Class11_Sub45_Sub19.aBoolArray9711[i_0_] = false;
			anInt4682++;
			Class71.anInt989 = -1;
			Class191.anInt2453 = 5;
			Canvas_Sub1.anInt9233 = Class170.anInt2186 = -1;
			Class130.anInt1821 = Class266.anInt3616;
			Class11_Sub41.anInt7255 = Class11_Sub25.anInt6279;
			Class259.anInt3571 = Class218.anInt3007;
			Class11_Sub2_Sub26.anInt9349 = 0;
			Class135.anInt1866 = Class11_Sub45_Sub11.anInt9157;
			Class344.anInt4564 = -1;
			Class374.anInt4894 = 0;
			Class260.anInt3573 = Class171.anInt2193;
			if (i > -59)
				aStringArray4688 = null;
			Class11_Sub32.anInt6870 = Class303.anInt4088;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wh.D(" + i + ')');
		}
	}

	final void method2135(byte i, long l, byte[] is) {
		try {
			anInt4684++;
			int i_1_ = 0;
			if (i < -34) {
				int i_2_ = -(0x7 & (int) l) + 8 & 0x7;
				int i_3_ = anInt4681 & 0x7;
				long l_4_ = l;
				int i_5_ = 31;
				int i_6_ = 0;
				for (/**/; i_5_ >= 0; i_5_--) {
					i_6_ += (0xff & aByteArray4679[i_5_]) + ((int) l_4_ & 0xff);
					aByteArray4679[i_5_] = (byte) i_6_;
					l_4_ >>>= 8;
					i_6_ >>>= 8;
				}
				while (l > 8L) {
					int i_7_ = (is[i_1_] << i_2_ & 0xff | (is[1 + i_1_] & 0xff) >>> 8 + -i_2_);
					if ((i_7_ ^ 0xffffffff) > -1 || i_7_ >= 256)
						throw new RuntimeException("LOGIC ERROR");
					aByteArray4686[anInt4691] = (byte) Class173.method1134(
							aByteArray4686[anInt4691], i_7_ >>> i_3_);
					anInt4681 += -i_3_ + 8;
					anInt4691++;
					if (anInt4681 == 512) {
						method2140((byte) 112);
						anInt4681 = anInt4691 = 0;
					}
					aByteArray4686[anInt4691] = (byte) Class77.method529(255,
							i_7_ << 8 + -i_3_);
					anInt4681 += i_3_;
					l -= 8L;
					i_1_++;
				}
				int i_8_;
				if ((l ^ 0xffffffffffffffffL) >= -1L)
					i_8_ = 0;
				else {
					i_8_ = is[i_1_] << i_2_ & 0xff;
					aByteArray4686[anInt4691] = (byte) Class173.method1134(
							aByteArray4686[anInt4691], i_8_ >>> i_3_);
				}
				if ((l + (long) i_3_ ^ 0xffffffffffffffffL) > -9L)
					anInt4681 += l;
				else {
					anInt4691++;
					anInt4681 += 8 - i_3_;
					l -= (long) (8 + -i_3_);
					if (anInt4681 == 512) {
						method2140((byte) 109);
						anInt4681 = anInt4691 = 0;
					}
					aByteArray4686[anInt4691] = (byte) Class77.method529(255,
							i_8_ << 8 + -i_3_);
					anInt4681 += (int) l;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wh.A(" + i + ',' + l
					+ ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2136(int i, Class163 class163, int i_9_, int i_10_,
			byte i_11_, int i_12_) {
		do {
			try {
				class163.KA(i, i_10_, i_12_ + i, i_10_ + i_9_);
				anInt4683++;
				class163.method1035(-16777216, i, i_10_, (byte) 119, i_9_,
						i_12_);
				if ((Class164.anInt2133 ^ 0xffffffff) <= -101) {
					float f = (float) Class32.anInt447
							/ (float) Class32.anInt432;
					int i_13_ = i_12_;
					int i_14_ = i_9_;
					if (!(f < 1.0F))
						i_13_ = (int) ((float) i_9_ / f);
					else
						i_14_ = (int) ((float) i_12_ * f);
					int i_15_ = -13 % ((i_11_ + 27) / 57);
					i_10_ += (-i_14_ + i_9_) / 2;
					i += (-i_13_ + i_12_) / 2;
					if (Class272.aClass253_3673 == null
							|| ((Class272.aClass253_3673.method1609() ^ 0xffffffff) != (i_12_ ^ 0xffffffff))
							|| Class272.aClass253_3673.method1615() != i_9_) {
						Class32.method269(Class32.anInt441, Class32.anInt447
								+ Class32.anInt451, Class32.anInt432
								+ Class32.anInt441, Class32.anInt451, i, i_10_,
								i - -i_13_, i_10_ - -i_14_);
						Class32.method261(class163);
						Class272.aClass253_3673 = class163.method1014(i, i_10_,
								i_13_, i_14_, false);
					}
					Class272.aClass253_3673.method1610(i, i_10_);
					int i_16_ = (Class91_Sub3_Sub1.anInt9343 * i_13_ / Class32.anInt432);
					int i_17_ = i_14_ * Class320.anInt4259 / Class32.anInt447;
					int i_18_ = i_13_ * Class189.anInt2433 / Class32.anInt432
							+ i;
					int i_19_ = -i_17_
							+ -(i_14_ * Class104.anInt1395 / Class32.anInt447)
							+ i_10_ + i_14_;
					int i_20_ = -1996554240;
					if (Class198.aClass66_2679 == ISAAC.aClass66_263)
						i_20_ = -1996488705;
					class163.aa(i_18_, i_19_, i_16_, i_17_, i_20_, 1);
					class163.method1051(i_18_, i_19_, i_16_, i_17_, i_20_, 0);
					if ((Class308.anInt4126 ^ 0xffffffff) >= -1)
						break;
					int i_21_;
					if ((Class108.anInt1455 ^ 0xffffffff) >= -51)
						i_21_ = Class108.anInt1455 * 5;
					else
						i_21_ = 5 * (100 + -Class108.anInt1455);
					for (Class11_Sub21 class11_sub21 = ((Class11_Sub21) Class32.aClass84_425
							.method584(-12261)); class11_sub21 != null; class11_sub21 = ((Class11_Sub21) Class32.aClass84_425
							.method578(-15361))) {
						Class23 class23 = (Class32.aClass280_420.method1726(
								(byte) -80,
								((Class11_Sub21) class11_sub21).anInt5964));
						if (Class283.method1748(81, class23)) {
							if (((Class11_Sub21) class11_sub21).anInt5964 == Class108_Sub8.anInt5737) {
								int i_22_ = (i_13_
										* (((Class11_Sub21) class11_sub21).anInt5970)
										/ Class32.anInt432 + i);
								int i_23_ = (i_10_ + (i_14_
										* (Class32.anInt447 - (((Class11_Sub21) class11_sub21).anInt5969)) / Class32.anInt447));
								class163.method1035(i_21_ << 24 | 0xffff00, -2
										+ i_22_, i_23_ - 2, (byte) 98, 4, 4);
							} else if (Class134.anInt1848 != -1
									&& (Class134.anInt1848 == ((Class23) class23).anInt207)) {
								int i_24_ = i
										- -((((Class11_Sub21) class11_sub21).anInt5970)
												* i_13_ / Class32.anInt432);
								int i_25_ = (i_10_ - -(i_14_
										* (-(((Class11_Sub21) class11_sub21).anInt5969) + Class32.anInt447) / Class32.anInt447));
								class163.method1035(i_21_ << 24 | 0xffff00,
										i_24_ - 2, i_25_ - 2, (byte) 74, 4, 4);
							}
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("wh.I(" + i + ','
						+ (class163 != null ? "{...}" : "null") + ',' + i_9_
						+ ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method2137(int i) {
		try {
			if (i != 512)
				aLong4685 = 30L;
			aStringArray4688 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wh.G(" + i + ')');
		}
	}

	final void method2138(int i, int i_26_, byte[] is) {
		try {
			if (i > 82) {
				aByteArray4686[anInt4691] = (byte) (Class173.method1134(
						aByteArray4686[anInt4691],
						128 >>> Class77.method529(7, anInt4681)));
				anInt4687++;
				anInt4691++;
				if (anInt4691 > 32) {
					while (anInt4691 < 64)
						aByteArray4686[anInt4691++] = (byte) 0;
					method2140((byte) 117);
					anInt4691 = 0;
				}
				while ((anInt4691 ^ 0xffffffff) > -33)
					aByteArray4686[anInt4691++] = (byte) 0;
				Class311.method1898(aByteArray4679, 0, aByteArray4686, 32, 32);
				method2140((byte) 86);
				int i_27_ = 0;
				int i_28_ = i_26_;
				for (/**/; (i_27_ ^ 0xffffffff) > -9; i_27_++) {
					long l = aLongArray4689[i_27_];
					is[i_28_] = (byte) (int) (l >>> 56);
					is[i_28_ + 1] = (byte) (int) (l >>> 48);
					is[i_28_ + 2] = (byte) (int) (l >>> 40);
					is[i_28_ + 3] = (byte) (int) (l >>> 32);
					is[i_28_ + 4] = (byte) (int) (l >>> 24);
					is[5 + i_28_] = (byte) (int) (l >>> 16);
					is[6 + i_28_] = (byte) (int) (l >>> 8);
					is[i_28_ + 7] = (byte) (int) l;
					i_28_ += 8;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wh.F(" + i + ','
					+ i_26_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2139(int i) {
		try {
			if (i == -2) {
				anInt4676++;
				for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > -33; i_29_++)
					aByteArray4679[i_29_] = (byte) 0;
				anInt4681 = anInt4691 = 0;
				aByteArray4686[0] = (byte) 0;
				for (int i_30_ = 0; i_30_ < 8; i_30_++)
					aLongArray4689[i_30_] = 0L;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wh.C(" + i + ')');
		}
	}

	private final void method2140(byte i) {
		try {
			int i_31_ = 0;
			int i_32_ = 0;
			for (/**/; (i_31_ ^ 0xffffffff) > -9; i_31_++) {
				aLongArray4680[i_31_] = (Class7
						.method92(
								(Class7.method92(
										(Class58_Sub1_Sub1
												.method3583(
														255L,
														(long) (aByteArray4686[i_32_ + 6])) << 8),
										(Class7.method92(
												(Class7.method92(
														(Class58_Sub1_Sub1
																.method3583(
																		255L << 24,
																		(long) aByteArray4686[4 + i_32_] << 24)),
														(Class7.method92(
																(Class58_Sub1_Sub1
																		.method3583(
																				(long) aByteArray4686[3 + i_32_] << 32,
																				255L << 32)),
																(Class7.method92(
																		Class7.method92(
																				((long) aByteArray4686[i_32_] << 56),
																				(Class58_Sub1_Sub1
																						.method3583(
																								255L << 48,
																								((long) (aByteArray4686[i_32_ + 1]) << 48)))),
																		(Class58_Sub1_Sub1
																				.method3583(
																						255L << 40,
																						((long) aByteArray4686[i_32_ + 2] << 40))))))))),
												Class58_Sub1_Sub1
														.method3583(
																(long) (aByteArray4686[5 + i_32_]),
																255L) << 16)))),
								Class58_Sub1_Sub1.method3583(
										(long) (aByteArray4686[i_32_ + 7]),
										255L)));
				i_32_ += 8;
			}
			anInt4674++;
			for (int i_33_ = 0; (i_33_ ^ 0xffffffff) > -9; i_33_++)
				aLongArray4677[i_33_] = Class7.method92(aLongArray4680[i_33_],
						(aLongArray4692[i_33_] = aLongArray4689[i_33_]));
			for (int i_34_ = 1; (i_34_ ^ 0xffffffff) >= -11; i_34_++) {
				for (int i_35_ = 0; i_35_ < 8; i_35_++) {
					aLongArray4690[i_35_] = 0L;
					int i_36_ = 0;
					int i_37_ = 56;
					while (i_36_ < 8) {
						aLongArray4690[i_35_] = Class7
								.method92(
										aLongArray4690[i_35_],
										(Class12.aLongArrayArray99[i_36_][(Class77
												.method529(
														(int) ((aLongArray4692[(Class77
																.method529(
																		7,
																		i_35_
																				+ -i_36_))]) >>> i_37_),
														255))]));
						i_36_++;
						i_37_ -= 8;
					}
				}
				for (int i_38_ = 0; (i_38_ ^ 0xffffffff) > -9; i_38_++)
					aLongArray4692[i_38_] = aLongArray4690[i_38_];
				aLongArray4692[0] = Class7.method92(aLongArray4692[0],
						Class12.aLongArray102[i_34_]);
				for (int i_39_ = 0; i_39_ < 8; i_39_++) {
					aLongArray4690[i_39_] = aLongArray4692[i_39_];
					int i_40_ = 0;
					int i_41_ = 56;
					for (/**/; (i_40_ ^ 0xffffffff) > -9; i_40_++) {
						aLongArray4690[i_39_] = (Class7
								.method92(
										aLongArray4690[i_39_],
										(Class12.aLongArrayArray99[i_40_][(Class77
												.method529(
														255,
														(int) ((aLongArray4677[Class77
																.method529(
																		-i_40_
																				+ i_39_,
																		7)]) >>> i_41_)))])));
						i_41_ -= 8;
					}
				}
				for (int i_42_ = 0; i_42_ < 8; i_42_++)
					aLongArray4677[i_42_] = aLongArray4690[i_42_];
			}
			if (i >= 81) {
				for (int i_43_ = 0; (i_43_ ^ 0xffffffff) > -9; i_43_++)
					aLongArray4689[i_43_] = Class7.method92(
							aLongArray4689[i_43_], Class7.method92(
									(aLongArray4680[i_43_]),
									(aLongArray4677[i_43_])));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wh.E(" + i + ')');
		}
	}

	public Class359() {
		aLongArray4677 = new long[8];
		aByteArray4679 = new byte[32];
		aByteArray4686 = new byte[64];
		anInt4681 = 0;
		aLongArray4690 = new long[8];
		aLongArray4689 = new long[8];
		anInt4691 = 0;
		aLongArray4692 = new long[8];
	}
}
