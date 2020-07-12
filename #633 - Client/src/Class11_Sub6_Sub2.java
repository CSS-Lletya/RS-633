/* Class11_Sub6_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub6_Sub2 extends Class11_Sub6 {
	private int[] anIntArray8879;
	static int anInt8880;
	private int[] anIntArray8881;
	private int[] anIntArray8882;
	static int anInt8883;
	static int anInt8884;
	static int anInt8885;
	static int anInt8886;
	static int anInt8887;
	static int anInt8888;
	static int anInt8889;
	static int anInt8890;
	static int anInt8891;
	static int anInt8892;
	static int anInt8893;
	static int anInt8894;
	private int[] anIntArray8895;
	static int anInt8896;
	private int[] anIntArray8897;
	static int anInt8898;
	static int anInt8899;
	static int anInt8900;
	static int anInt8901;
	private int anInt8902;
	int[] anIntArray8903;
	static int anInt8904;
	static int anInt8905 = 0;
	static int anInt8906;
	static int anInt8907;
	static int anInt8908;
	private Class213 aClass213_8909;
	static int anInt8910;
	static int anInt8911;
	static int anInt8912;
	static int anInt8913;
	static int anInt8914;
	static int anInt8915;
	static int anInt8916;
	private int[] anIntArray8917;
	static int anInt8918;
	private int[] anIntArray8919;
	static int anInt8920;
	static int anInt8921;
	static int anInt8922;
	private Class11_Sub18[][] aClass11_Sub18ArrayArray8923;
	int[] anIntArray8924;
	private int[] anIntArray8925;
	static int anInt8926;
	static int anInt8927;
	int[] anIntArray8928;
	static int anInt8929;
	private Class11_Sub18[][] aClass11_Sub18ArrayArray8930;
	static int anInt8931;
	static int anInt8932;
	private int[] anIntArray8933;
	static int anInt8934;
	private int[] anIntArray8935;
	static int anInt8936;
	private int[] anIntArray8937;
	private int[] anIntArray8938;
	static int anInt8939;
	private int[] anIntArray8940;
	static int anInt8941;
	private int anInt8942;
	static int anInt8943;
	private Class247 aClass247_8944;
	private long aLong8945;
	private long aLong8946;
	private int anInt8947;
	private int anInt8948;
	private boolean aBool8949;
	private Class11_Sub6_Sub3 aClass11_Sub6_Sub3_8950;
	private int anInt8951;
	private Class11_Sub34 aClass11_Sub34_8952;
	private boolean aBool8953;

	private final void method3486(int i, byte i_0_, int i_1_) {
		try {
			anInt8941++;
			anIntArray8940[i] = i_1_;
			if (i_0_ != -40)
				method3510(44);
			((Class11_Sub6_Sub2) this).anIntArray8903[i] = (int) ((Math.pow(
					2.0, (double) i_1_ * 5.4931640625E-4) * 2097152.0) + 0.5);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("em.SA(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	private final void method3487(int i, int i_2_, int i_3_) {
		do {
			try {
				anInt8887++;
				if (i_3_ == 26115)
					break;
				method3494(30, -69, -52, 88);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("em.G(" + i + ','
						+ i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	final synchronized Class11_Sub6 method2319() {
		try {
			anInt8936++;
			return aClass11_Sub6_Sub3_8950;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "em.M(" + ')');
		}
	}

	final synchronized void method3488(int i) {
		do {
			try {
				anInt8913++;
				for (Class11_Sub43 class11_sub43 = (Class11_Sub43) aClass213_8909
						.method1365(24490); class11_sub43 != null; class11_sub43 = ((Class11_Sub43) aClass213_8909
						.method1367((byte) 71)))
					class11_sub43.method122(-111);
				if (i == 26920)
					break;
				((Class11_Sub6_Sub2) this).anIntArray8924 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "em.LA(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method3489(int i, int i_4_, int i_5_, int i_6_) {
		try {
			anInt8912++;
			Class11_Sub18 class11_sub18 = aClass11_Sub18ArrayArray8930[i_6_][i_5_];
			if (class11_sub18 != null) {
				aClass11_Sub18ArrayArray8930[i_6_][i_5_] = null;
				if (i_4_ != 12515)
					method3490(-40);
				if ((0x2 & ((Class11_Sub6_Sub2) this).anIntArray8924[i_6_]) == 0)
					((Class11_Sub18) class11_sub18).anInt5798 = 0;
				else {
					for (Class11_Sub18 class11_sub18_7_ = ((Class11_Sub18) ((Class11_Sub6_Sub3) aClass11_Sub6_Sub3_8950).aClass84_9127
							.method584(-12261)); class11_sub18_7_ != null; class11_sub18_7_ = ((Class11_Sub18) ((Class11_Sub6_Sub3) aClass11_Sub6_Sub3_8950).aClass84_9127
							.method578(-15361))) {
						if (((((Class11_Sub18) class11_sub18).anInt5803 ^ 0xffffffff) == (((Class11_Sub18) class11_sub18_7_).anInt5803 ^ 0xffffffff))
								&& ((Class11_Sub18) class11_sub18_7_).anInt5798 < 0
								&& class11_sub18_7_ != class11_sub18) {
							((Class11_Sub18) class11_sub18).anInt5798 = 0;
							break;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("em.E(" + i + ','
					+ i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	final synchronized void method3490(int i) {
		try {
			int i_8_ = 87 / ((i - 2) / 47);
			anInt8894++;
			method3523(true, (byte) 39);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "em.WA(" + i + ')');
		}
	}

	final synchronized void method3491(int i, byte i_9_, int i_10_) {
		try {
			anInt8939++;
			if (i_9_ != 113)
				anIntArray8879 = null;
			if ((i ^ 0xffffffff) > -1) {
				for (int i_11_ = 0; i_11_ < 16; i_11_++)
					anIntArray8935[i_11_] = i_10_;
			} else
				anIntArray8935[i] = i_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("em.HA(" + i + ','
					+ i_9_ + ',' + i_10_ + ')'));
		}
	}

	final synchronized void method3492(int i, int i_12_, int i_13_) {
		try {
			method3517(i_13_, (byte) -128, i_12_);
			if (i != -1)
				method3504(37, 1.4611924F);
			anInt8889++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("em.GA(" + i + ','
					+ i_12_ + ',' + i_13_ + ')'));
		}
	}

	final synchronized void method3493(boolean bool,
			Class11_Sub34 class11_sub34, boolean bool_14_, long l,
			boolean bool_15_) {
		try {
			if (bool_14_ != false)
				aClass11_Sub6_Sub3_8950 = null;
			anInt8918++;
			method3509(class11_sub34, bool, bool_14_, bool_15_);
			method3498(1, l * (long) ((Class247) aClass247_8944).anInt3340);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("em.K(" + bool + ','
					+ (class11_sub34 != null ? "{...}" : "null") + ','
					+ bool_14_ + ',' + l + ',' + bool_15_ + ')'));
		}
	}

	private final void method3494(int i, int i_16_, int i_17_, int i_18_) {
		do {
			try {
				anInt8926++;
				if (i_17_ == 19994)
					break;
				method3499(85, -15, (byte) -67);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("em.S(" + i + ','
						+ i_16_ + ',' + i_17_ + ',' + i_18_ + ')'));
			}
			break;
		} while (false);
	}

	private final int method3495(Class11_Sub18 class11_sub18, byte i) {
		try {
			anInt8907++;
			if ((anIntArray8935[((Class11_Sub18) class11_sub18).anInt5803] ^ 0xffffffff) == -1)
				return 0;
			if (i < 80)
				anInt8905 = -74;
			Class344 class344 = ((Class11_Sub18) class11_sub18).aClass344_5784;
			int i_19_ = (4096 + ((anIntArray8925[((Class11_Sub18) class11_sub18).anInt5803]) * (anIntArray8881[((Class11_Sub18) class11_sub18).anInt5803])) >> 13);
			i_19_ = i_19_ * i_19_ + 16384 >> 15;
			i_19_ = (((Class11_Sub18) class11_sub18).anInt5788 * i_19_ + 16384 >> 15);
			i_19_ = 128 + anInt8902 * i_19_ >> 8;
			i_19_ = (anIntArray8935[((Class11_Sub18) class11_sub18).anInt5803] * i_19_) + 128 >> 8;
			if (((Class344) class344).anInt4572 > 0)
				i_19_ = (int) ((Math
						.pow(0.5,
								((double) (((Class344) class344).anInt4572) * (1.953125E-5 * (double) (((Class11_Sub18) class11_sub18).anInt5800)))) * (double) i_19_) + 0.5);
			if (((Class344) class344).aByteArray4563 != null) {
				int i_20_ = ((Class11_Sub18) class11_sub18).anInt5787;
				int i_21_ = (((Class344) class344).aByteArray4563[1 + ((Class11_Sub18) class11_sub18).anInt5786]);
				if ((-2 + ((Class344) class344).aByteArray4563.length ^ 0xffffffff) < (((Class11_Sub18) class11_sub18).anInt5786 ^ 0xffffffff)) {
					int i_22_ = ((((Class344) class344).aByteArray4563[((Class11_Sub18) class11_sub18).anInt5786]) << 8 & 0xff00);
					int i_23_ = (0xff00 & ((((Class344) class344).aByteArray4563[((Class11_Sub18) class11_sub18).anInt5786 + 2]) << 8));
					i_21_ += ((-i_21_ + (((Class344) class344).aByteArray4563[3 + (((Class11_Sub18) class11_sub18).anInt5786)]))
							* (-i_22_ + i_20_) / (-i_22_ + i_23_));
				}
				i_19_ = i_21_ * i_19_ + 32 >> 6;
			}
			if ((((Class11_Sub18) class11_sub18).anInt5798 ^ 0xffffffff) < -1
					&& ((Class344) class344).aByteArray4571 != null) {
				int i_24_ = ((Class11_Sub18) class11_sub18).anInt5798;
				int i_25_ = (((Class344) class344).aByteArray4571[1 + ((Class11_Sub18) class11_sub18).anInt5805]);
				if ((((Class11_Sub18) class11_sub18).anInt5805 ^ 0xffffffff) > (((Class344) class344).aByteArray4571.length - 2 ^ 0xffffffff)) {
					int i_26_ = ((0xff & (((Class344) class344).aByteArray4571[((Class11_Sub18) class11_sub18).anInt5805])) << 8);
					int i_27_ = (((((Class344) class344).aByteArray4571[2 + ((Class11_Sub18) class11_sub18).anInt5805]) << 8) & 0xff00);
					i_25_ += ((i_24_ - i_26_)
							* ((((Class344) class344).aByteArray4571[(((Class11_Sub18) class11_sub18).anInt5805 + 3)]) + -i_25_) / (i_27_ + -i_26_));
				}
				i_19_ = 32 + i_19_ * i_25_ >> 6;
			}
			return i_19_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "em.IA("
					+ (class11_sub18 != null ? "{...}" : "null") + ',' + i
					+ ')');
		}
	}

	private final void method3496(boolean bool, boolean bool_28_) {
		try {
			anInt8901++;
			if (!bool_28_)
				method3511(99, -1);
			else
				method3508((byte) -114, -1);
			method3501(-1, (byte) 110);
			for (int i = 0; i < 16; i++)
				anIntArray8933[i] = anIntArray8882[i];
			if (bool == false) {
				for (int i = 0; (i ^ 0xffffffff) > -17; i++)
					anIntArray8917[i] = Class77.method529(anIntArray8882[i],
							-128);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "em.JA(" + bool + ','
					+ bool_28_ + ')');
		}
	}

	private final int method3497(byte i, Class11_Sub18 class11_sub18) {
		try {
			anInt8921++;
			if (i != 9)
				method3518(37);
			int i_29_ = anIntArray8937[((Class11_Sub18) class11_sub18).anInt5803];
			if (i_29_ >= 8192)
				return 16384 - (((16384 - i_29_) * (-((Class11_Sub18) class11_sub18).anInt5790 + 128)) + 32 >> 6);
			return 32 + i_29_ * ((Class11_Sub18) class11_sub18).anInt5790 >> 6;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("em.NA(" + i + ','
					+ (class11_sub18 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method3498(int i, long l) {
		do {
			try {
				anInt8932++;
				while ((aLong8946 ^ 0xffffffffffffffffL) >= (l ^ 0xffffffffffffffffL)) {
					int i_30_ = anInt8947;
					int i_31_ = anInt8948;
					long l_32_ = aLong8946;
					while ((anInt8948 ^ 0xffffffff) == (i_31_ ^ 0xffffffff)) {
						while ((i_31_ ^ 0xffffffff) == ((((Class247) aClass247_8944).anIntArray3336[i_30_]) ^ 0xffffffff)) {
							aClass247_8944.method1569(i_30_);
							int i_33_ = aClass247_8944.method1556(i_30_);
							if ((i_33_ ^ 0xffffffff) == -2) {
								aClass247_8944.method1564();
								aClass247_8944.method1559(i_30_);
								if (aClass247_8944.method1554()) {
									if (aBool8949 && (i_31_ ^ 0xffffffff) != -1)
										aClass247_8944.method1563(l_32_);
									else {
										method3496(false, true);
										aClass247_8944.method1561();
										return;
									}
								}
								break;
							}
							if ((i_33_ & 0x80) != 0 && (i_33_ & 0xf0) != 144)
								method3514(i_33_, (byte) -48);
							aClass247_8944.method1557(i_30_);
							aClass247_8944.method1559(i_30_);
						}
						aLong8945 = l_32_;
						i_30_ = aClass247_8944.method1558();
						i_31_ = (((Class247) aClass247_8944).anIntArray3336[i_30_]);
						l_32_ = aClass247_8944.method1566(i_31_);
					}
					anInt8947 = i_30_;
					aLong8946 = l_32_;
					anInt8948 = i_31_;
				}
				if (i == 1)
					break;
				method3494(-77, 101, -27, 20);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "em.KA(" + i + ','
						+ l + ')');
			}
			break;
		} while (false);
	}

	private final void method3499(int i, int i_34_, byte i_35_) {
		do {
			try {
				anInt8885++;
				if (anIntArray8933[i] != i_34_) {
					anIntArray8933[i] = i_34_;
					for (int i_36_ = 0; i_36_ < 128; i_36_++)
						aClass11_Sub18ArrayArray8923[i][i_36_] = null;
				}
				if (i_35_ > 84)
					break;
				aClass11_Sub34_8952 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("em.TA(" + i + ','
						+ i_34_ + ',' + i_35_ + ')'));
			}
			break;
		} while (false);
	}

	final synchronized boolean method3500(byte i) {
		try {
			if (i != 114)
				method3514(109, (byte) 19);
			anInt8943++;
			return aClass247_8944.method1567();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "em.VA(" + i + ')');
		}
	}

	private final void method3501(int i, byte i_37_) {
		try {
			anInt8934++;
			if (i_37_ != 110)
				method3519(-53, (byte) -27, -108);
			if (i < 0) {
				for (i = 0; i < 16; i++)
					method3501(i, (byte) 110);
			} else {
				anIntArray8881[i] = 12800;
				anIntArray8937[i] = 8192;
				anIntArray8925[i] = 16383;
				anIntArray8938[i] = 8192;
				anIntArray8895[i] = 0;
				anIntArray8879[i] = 8192;
				method3512(i, (byte) 83);
				method3521(-19016, i);
				((Class11_Sub6_Sub2) this).anIntArray8924[i] = 0;
				anIntArray8919[i] = 32767;
				anIntArray8897[i] = 256;
				((Class11_Sub6_Sub2) this).anIntArray8928[i] = 0;
				method3486(i, (byte) -40, 8192);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "em.AB(" + i + ','
					+ i_37_ + ')');
		}
	}

	final void method3502(boolean bool, Class11_Sub18 class11_sub18,
			boolean bool_38_) {
		try {
			if (bool != false)
				method3492(-38, 107, -3);
			anInt8915++;
			int i = (((Class11_Sub14_Sub1) ((Class11_Sub18) class11_sub18).aClass11_Sub14_Sub1_5799).aByteArray9358).length;
			int i_39_;
			if (!bool_38_
					|| !(((Class11_Sub14_Sub1) ((Class11_Sub18) class11_sub18).aClass11_Sub14_Sub1_5799).aBool9359))
				i_39_ = (int) ((long) (((Class11_Sub6_Sub2) this).anIntArray8928[(((Class11_Sub18) class11_sub18).anInt5803)])
						* (long) i >> 6);
			else {
				int i_40_ = (-(((Class11_Sub14_Sub1) (((Class11_Sub18) class11_sub18).aClass11_Sub14_Sub1_5799)).anInt9357)
						+ i + i);
				i_39_ = (int) ((long) (((Class11_Sub6_Sub2) this).anIntArray8928[(((Class11_Sub18) class11_sub18).anInt5803)])
						* (long) i_40_ >> 6);
				i <<= 8;
				if ((i_39_ ^ 0xffffffff) <= (i ^ 0xffffffff)) {
					i_39_ = -i_39_ - 1 + i + i;
					((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780
							.method3676(true);
				}
			}
			((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780
					.method3664(i_39_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("em.H(" + bool + ','
					+ (class11_sub18 != null ? "{...}" : "null") + ','
					+ bool_38_ + ')'));
		}
	}

	final boolean method3503(int i, int i_41_, int[] is, int i_42_,
			Class11_Sub18 class11_sub18) {
		try {
			((Class11_Sub18) class11_sub18).anInt5802 = Class119.anInt1610 / 100;
			anInt8927++;
			if (((Class11_Sub18) class11_sub18).anInt5798 >= 0
					&& ((((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780 == null) || ((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780
							.method3684())) {
				class11_sub18.method2479((byte) 93);
				class11_sub18.method122(i ^ ~0xe2);
				if (((((Class11_Sub18) class11_sub18).anInt5785 ^ 0xffffffff) < -1)
						&& (class11_sub18 == (aClass11_Sub18ArrayArray8923[((Class11_Sub18) class11_sub18).anInt5803][((Class11_Sub18) class11_sub18).anInt5785])))
					aClass11_Sub18ArrayArray8923[((Class11_Sub18) class11_sub18).anInt5803][((Class11_Sub18) class11_sub18).anInt5785] = null;
				return true;
			}
			int i_43_ = ((Class11_Sub18) class11_sub18).anInt5793;
			if ((i_43_ ^ 0xffffffff) < -1) {
				i_43_ -= (int) (0.5 + Math
						.pow(2.0,
								((double) (anIntArray8879[(((Class11_Sub18) class11_sub18).anInt5803)]) * 4.921259842519685E-4)) * 16.0);
				if ((i_43_ ^ 0xffffffff) > -1)
					i_43_ = 0;
				((Class11_Sub18) class11_sub18).anInt5793 = i_43_;
			}
			((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780
					.method3701(method3506(-7652, class11_sub18));
			Class344 class344 = ((Class11_Sub18) class11_sub18).aClass344_5784;
			((Class11_Sub18) class11_sub18).anInt5797 += ((Class344) class344).anInt4577;
			((Class11_Sub18) class11_sub18).anInt5782++;
			boolean bool = false;
			double d = ((double) ((-60
					+ ((Class11_Sub18) class11_sub18).anInt5789 << 8) + ((((Class11_Sub18) class11_sub18).anInt5793 * ((Class11_Sub18) class11_sub18).anInt5801) >> 12)) * 5.086263020833333E-6);
			if (((Class344) class344).anInt4572 > 0) {
				if (((Class344) class344).anInt4576 <= 0)
					((Class11_Sub18) class11_sub18).anInt5800 += 128;
				else
					((Class11_Sub18) class11_sub18).anInt5800 += (int) (0.5 + (128.0 * Math
							.pow(2.0,
									(double) (((Class344) class344).anInt4576)
											* d)));
				if (((((Class11_Sub18) class11_sub18).anInt5800 * ((Class344) class344).anInt4572) ^ 0xffffffff) <= -819201)
					bool = true;
			}
			if (((Class344) class344).aByteArray4563 != null) {
				if ((((Class344) class344).anInt4573 ^ 0xffffffff) >= -1)
					((Class11_Sub18) class11_sub18).anInt5787 += 128;
				else
					((Class11_Sub18) class11_sub18).anInt5787 += (int) (0.5 + (Math
							.pow(2.0,
									(double) (((Class344) class344).anInt4573)
											* d) * 128.0));
				for (/**/; (((((Class344) class344).aByteArray4563.length - 2 ^ 0xffffffff) < (((Class11_Sub18) class11_sub18).anInt5786 ^ 0xffffffff)) && (((Class11_Sub18) class11_sub18).anInt5787 > (0xff00 & (((Class344) class344).aByteArray4563[(((Class11_Sub18) class11_sub18).anInt5786 + 2)]) << 8))); ((Class11_Sub18) class11_sub18).anInt5786 += 2) {
					/* empty */
				}
				if (((-2 + ((Class344) class344).aByteArray4563.length ^ 0xffffffff) == (((Class11_Sub18) class11_sub18).anInt5786 ^ 0xffffffff))
						&& (((Class344) class344).aByteArray4563[1 + ((Class11_Sub18) class11_sub18).anInt5786]) == 0)
					bool = true;
			}
			if ((((Class11_Sub18) class11_sub18).anInt5798 ^ 0xffffffff) <= -1
					&& ((Class344) class344).aByteArray4571 != null
					&& ((((Class11_Sub6_Sub2) this).anIntArray8924[((Class11_Sub18) class11_sub18).anInt5803]) & 0x1) == 0
					&& (((((Class11_Sub18) class11_sub18).anInt5785 ^ 0xffffffff) > -1) || (class11_sub18 != (aClass11_Sub18ArrayArray8923[((Class11_Sub18) class11_sub18).anInt5803][((Class11_Sub18) class11_sub18).anInt5785])))) {
				if ((((Class344) class344).anInt4569 ^ 0xffffffff) >= -1)
					((Class11_Sub18) class11_sub18).anInt5798 += 128;
				else
					((Class11_Sub18) class11_sub18).anInt5798 += (int) (Math
							.pow(2.0,
									d
											* (double) (((Class344) class344).anInt4569)) * 128.0 + 0.5);
				for (/**/; ((((Class11_Sub18) class11_sub18).anInt5805 < -2
						+ ((Class344) class344).aByteArray4571.length) && ((((Class11_Sub18) class11_sub18).anInt5798 ^ 0xffffffff) < (0xff00 & (((Class344) class344).aByteArray4571[(((Class11_Sub18) class11_sub18).anInt5805) + 2]) << 8 ^ 0xffffffff))); ((Class11_Sub18) class11_sub18).anInt5805 += 2) {
					/* empty */
				}
				if ((-2 + ((Class344) class344).aByteArray4571.length ^ 0xffffffff) == (((Class11_Sub18) class11_sub18).anInt5805 ^ 0xffffffff))
					bool = true;
			}
			if (i != 128)
				return true;
			if (bool) {
				((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780
						.method3673(((Class11_Sub18) class11_sub18).anInt5802);
				if (is == null)
					((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780
							.method2315(i_42_);
				else
					((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780
							.method2318(is, i_41_, i_42_);
				if (((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780
						.method3663())
					((Class11_Sub6_Sub3) aClass11_Sub6_Sub3_8950).aClass11_Sub6_Sub1_9138
							.method3459(((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780);
				class11_sub18.method2479((byte) 111);
				if ((((Class11_Sub18) class11_sub18).anInt5798 ^ 0xffffffff) <= -1) {
					class11_sub18.method122(-33);
					if ((((Class11_Sub18) class11_sub18).anInt5785 ^ 0xffffffff) < -1
							&& ((aClass11_Sub18ArrayArray8923[((Class11_Sub18) class11_sub18).anInt5803][((Class11_Sub18) class11_sub18).anInt5785]) == class11_sub18))
						aClass11_Sub18ArrayArray8923[((Class11_Sub18) class11_sub18).anInt5803][((Class11_Sub18) class11_sub18).anInt5785] = null;
				}
				return true;
			}
			((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780.method3665(
					((Class11_Sub18) class11_sub18).anInt5802,
					method3495(class11_sub18, (byte) 120),
					method3497((byte) 9, class11_sub18));
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("em.F(" + i + ',' + i_41_
							+ ',' + (is != null ? "{...}" : "null") + ','
							+ i_42_ + ','
							+ (class11_sub18 != null ? "{...}" : "null") + ')'));
		}
	}

	final synchronized void method2318(int[] is, int i, int i_44_) {
		try {
			anInt8922++;
			if (aClass247_8944.method1567()) {
				int i_45_ = (anInt8942 * ((Class247) aClass247_8944).anInt3340 / Class119.anInt1610);
				do {
					long l = (long) i_44_ * (long) i_45_ + aLong8945;
					if (aLong8946 - l >= 0L) {
						aLong8945 = l;
						break;
					}
					int i_46_ = (int) ((-1L + -aLong8945 + (aLong8946 - -(long) i_45_)) / (long) i_45_);
					aLong8945 += (long) i_45_ * (long) i_46_;
					aClass11_Sub6_Sub3_8950.method2318(is, i, i_46_);
					i += i_46_;
					i_44_ -= i_46_;
					method3510(32570);
				} while (aClass247_8944.method1567());
			}
			aClass11_Sub6_Sub3_8950.method2318(is, i, i_44_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("em.A(" + (is != null ? "{...}" : "null") + ',' + i + ','
							+ i_44_ + ')'));
		}
	}

	static final float method3504(int i, float f) {
		try {
			if (i != -7700)
				method3507(-20, -105);
			anInt8914++;
			return f * (f * f) * (10.0F + (6.0F * f - 15.0F) * f);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "em.EA(" + i + ',' + f
					+ ')');
		}
	}

	final boolean method3505(byte i, Class11_Sub18 class11_sub18) {
		try {
			anInt8886++;
			if (((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780 == null) {
				if ((((Class11_Sub18) class11_sub18).anInt5798 ^ 0xffffffff) <= -1) {
					class11_sub18.method122(i ^ ~0x4f);
					if (((Class11_Sub18) class11_sub18).anInt5785 > 0
							&& ((aClass11_Sub18ArrayArray8923[((Class11_Sub18) class11_sub18).anInt5803][((Class11_Sub18) class11_sub18).anInt5785]) == class11_sub18))
						aClass11_Sub18ArrayArray8923[((Class11_Sub18) class11_sub18).anInt5803][((Class11_Sub18) class11_sub18).anInt5785] = null;
				}
				return true;
			}
			if (i != 98)
				return false;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("em.PA(" + i + ','
					+ (class11_sub18 != null ? "{...}" : "null") + ')'));
		}
	}

	private final int method3506(int i, Class11_Sub18 class11_sub18) {
		try {
			anInt8891++;
			if (i != -7652)
				aClass247_8944 = null;
			int i_47_ = (((((Class11_Sub18) class11_sub18).anInt5801 * ((Class11_Sub18) class11_sub18).anInt5793) >> 12) + ((Class11_Sub18) class11_sub18).anInt5796);
			i_47_ += ((-8192 + (anIntArray8938[((Class11_Sub18) class11_sub18).anInt5803])) * (anIntArray8897[((Class11_Sub18) class11_sub18).anInt5803])) >> 12;
			Class344 class344 = ((Class11_Sub18) class11_sub18).aClass344_5784;
			if ((((Class344) class344).anInt4577 ^ 0xffffffff) < -1
					&& ((((Class344) class344).anInt4574 ^ 0xffffffff) < -1 || (anIntArray8895[((Class11_Sub18) class11_sub18).anInt5803]) > 0)) {
				int i_48_ = ((Class344) class344).anInt4574 << 2;
				int i_49_ = ((Class344) class344).anInt4561 << 1;
				if ((((Class11_Sub18) class11_sub18).anInt5782 ^ 0xffffffff) > (i_49_ ^ 0xffffffff))
					i_48_ = (((Class11_Sub18) class11_sub18).anInt5782 * i_48_ / i_49_);
				i_48_ += (anIntArray8895[((Class11_Sub18) class11_sub18).anInt5803]) >> 7;
				double d = Math
						.sin(0.01227184630308513 * (double) ((((Class11_Sub18) class11_sub18).anInt5797) & 0x1ff));
				i_47_ += (int) (d * (double) i_48_);
			}
			int i_50_ = (int) (0.5 + ((double) (((Class11_Sub14_Sub1) (((Class11_Sub18) class11_sub18).aClass11_Sub14_Sub1_5799)).anInt9360 * 256)
					* Math.pow(2.0, 3.255208333333333E-4 * (double) i_47_) / (double) Class119.anInt1610));
			if (i_50_ < 1)
				return 1;
			return i_50_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("em.CB(" + i + ','
					+ (class11_sub18 != null ? "{...}" : "null") + ')'));
		}
	}

	final synchronized int method2314() {
		try {
			anInt8892++;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "em.J(" + ')');
		}
	}

	static final void method3507(int i, int i_51_) {
		do {
			try {
				Class127.anInt1720 = -1;
				Class14.anInt124 = i;
				Class11_Sub12.anInt5446 = -1;
				anInt8910++;
				Class283.method1744((byte) 56);
				if (i_51_ < -29)
					break;
				anInt8905 = 12;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "em.L(" + i + ','
						+ i_51_ + ')');
			}
			break;
		} while (false);
	}

	private final void method3508(byte i, int i_52_) {
		do {
			try {
				for (Class11_Sub18 class11_sub18 = ((Class11_Sub18) ((Class11_Sub6_Sub3) aClass11_Sub6_Sub3_8950).aClass84_9127
						.method584(-12261)); class11_sub18 != null; class11_sub18 = ((Class11_Sub18) ((Class11_Sub6_Sub3) aClass11_Sub6_Sub3_8950).aClass84_9127
						.method578(-15361))) {
					if ((i_52_ ^ 0xffffffff) > -1
							|| (((Class11_Sub18) class11_sub18).anInt5803 ^ 0xffffffff) == (i_52_ ^ 0xffffffff)) {
						if ((((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780) != null) {
							((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780
									.method3673(Class119.anInt1610 / 100);
							if (((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780
									.method3663())
								((Class11_Sub6_Sub3) aClass11_Sub6_Sub3_8950).aClass11_Sub6_Sub1_9138
										.method3459(((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780);
							class11_sub18.method2479((byte) 87);
						}
						if ((((Class11_Sub18) class11_sub18).anInt5798 ^ 0xffffffff) > -1)
							aClass11_Sub18ArrayArray8930[((Class11_Sub18) class11_sub18).anInt5803][((Class11_Sub18) class11_sub18).anInt5789] = null;
						class11_sub18.method122(-105);
					}
				}
				anInt8888++;
				if (i <= -107)
					break;
				aLong8946 = -64L;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "em.UA(" + i + ','
						+ i_52_ + ')');
			}
			break;
		} while (false);
	}

	private final synchronized void method3509(Class11_Sub34 class11_sub34,
			boolean bool, boolean bool_53_, boolean bool_54_) {
		try {
			method3523(bool, (byte) 61);
			anInt8929++;
			aClass247_8944
					.method1560(((Class11_Sub34) class11_sub34).aByteArray6921);
			aBool8949 = bool_54_;
			aLong8945 = 0L;
			if (bool_53_ != false)
				method3501(-99, (byte) 12);
			int i = aClass247_8944.method1565();
			for (int i_55_ = 0; i_55_ < i; i_55_++) {
				aClass247_8944.method1569(i_55_);
				aClass247_8944.method1557(i_55_);
				aClass247_8944.method1559(i_55_);
			}
			anInt8947 = aClass247_8944.method1558();
			anInt8948 = ((Class247) aClass247_8944).anIntArray3336[anInt8947];
			aLong8946 = aClass247_8944.method1566(anInt8948);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("em.BA("
					+ (class11_sub34 != null ? "{...}" : "null") + ',' + bool
					+ ',' + bool_53_ + ',' + bool_54_ + ')'));
		}
	}

	private final void method3510(int i) {
		do {
			try {
				anInt8911++;
				int i_56_ = anInt8947;
				int i_57_ = anInt8948;
				long l = aLong8946;
				if (aClass11_Sub34_8952 != null && i_57_ == anInt8951) {
					method3509(aClass11_Sub34_8952, aBool8953, false, aBool8949);
					method3510(32570);
				} else {
					while (i_57_ == anInt8948) {
						while (i_57_ == (((Class247) aClass247_8944).anIntArray3336[i_56_])) {
							aClass247_8944.method1569(i_56_);
							int i_58_ = aClass247_8944.method1556(i_56_);
							if (i_58_ == 1) {
								aClass247_8944.method1564();
								aClass247_8944.method1559(i_56_);
								if (aClass247_8944.method1554()) {
									if (aClass11_Sub34_8952 != null) {
										method3516(true, aClass11_Sub34_8952,
												aBool8949);
										method3510(32570);
										return;
									}
									if (aBool8949 && (i_57_ ^ 0xffffffff) != -1)
										aClass247_8944.method1563(l);
									else {
										method3496(false, true);
										aClass247_8944.method1561();
										return;
									}
								}
								break;
							}
							if ((0x80 & i_58_) != 0)
								method3514(i_58_, (byte) 116);
							aClass247_8944.method1557(i_56_);
							aClass247_8944.method1559(i_56_);
						}
						i_56_ = aClass247_8944.method1558();
						i_57_ = (((Class247) aClass247_8944).anIntArray3336[i_56_]);
						l = aClass247_8944.method1566(i_57_);
					}
					if (i != 32570)
						anIntArray8925 = null;
					anInt8947 = i_56_;
					anInt8948 = i_57_;
					aLong8946 = l;
					if (aClass11_Sub34_8952 == null
							|| (i_57_ ^ 0xffffffff) >= (anInt8951 ^ 0xffffffff))
						break;
					anInt8947 = -1;
					anInt8948 = anInt8951;
					aLong8946 = aClass247_8944.method1566(anInt8948);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "em.CA(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method3511(int i, int i_59_) {
		try {
			int i_60_ = -52 / ((i - 8) / 56);
			for (Class11_Sub18 class11_sub18 = ((Class11_Sub18) ((Class11_Sub6_Sub3) aClass11_Sub6_Sub3_8950).aClass84_9127
					.method584(-12261)); class11_sub18 != null; class11_sub18 = ((Class11_Sub18) ((Class11_Sub6_Sub3) aClass11_Sub6_Sub3_8950).aClass84_9127
					.method578(-15361))) {
				if (((i_59_ ^ 0xffffffff) > -1 || (((Class11_Sub18) class11_sub18).anInt5803 ^ 0xffffffff) == (i_59_ ^ 0xffffffff))
						&& ((Class11_Sub18) class11_sub18).anInt5798 < 0) {
					aClass11_Sub18ArrayArray8930[((Class11_Sub18) class11_sub18).anInt5803][((Class11_Sub18) class11_sub18).anInt5789] = null;
					((Class11_Sub18) class11_sub18).anInt5798 = 0;
				}
			}
			anInt8931++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "em.P(" + i + ','
					+ i_59_ + ')');
		}
	}

	private final void method3512(int i, byte i_61_) {
		do {
			try {
				anInt8893++;
				if ((((Class11_Sub6_Sub2) this).anIntArray8924[i] & 0x2) != 0) {
					for (Class11_Sub18 class11_sub18 = ((Class11_Sub18) ((Class11_Sub6_Sub3) aClass11_Sub6_Sub3_8950).aClass84_9127
							.method584(-12261)); class11_sub18 != null; class11_sub18 = ((Class11_Sub18) ((Class11_Sub6_Sub3) aClass11_Sub6_Sub3_8950).aClass84_9127
							.method578(-15361))) {
						if (i == ((Class11_Sub18) class11_sub18).anInt5803
								&& ((aClass11_Sub18ArrayArray8930[i][((Class11_Sub18) class11_sub18).anInt5789]) == null)
								&& ((Class11_Sub18) class11_sub18).anInt5798 < 0)
							((Class11_Sub18) class11_sub18).anInt5798 = 0;
					}
				}
				if (i_61_ >= 82)
					break;
				((Class11_Sub6_Sub2) this).anIntArray8903 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "em.O(" + i + ','
						+ i_61_ + ')');
			}
			break;
		} while (false);
	}

	final synchronized boolean method3513(int i, int i_62_, Class146 class146,
			Class365 class365, Class11_Sub34 class11_sub34) {
		try {
			anInt8904++;
			class11_sub34.method2804();
			boolean bool = true;
			int[] is = null;
			if ((i_62_ ^ 0xffffffff) < -1)
				is = new int[] { i_62_ };
			for (Class11_Sub47 class11_sub47 = (Class11_Sub47) ((Class11_Sub34) class11_sub34).aClass213_6920
					.method1365(i + 5294); class11_sub47 != null; class11_sub47 = (Class11_Sub47) ((Class11_Sub34) class11_sub34).aClass213_6920
					.method1367((byte) 71)) {
				int i_63_ = (int) ((Class11) class11_sub47).aLong91;
				Class11_Sub43 class11_sub43 = ((Class11_Sub43) aClass213_8909
						.method1369((byte) 26, (long) i_63_));
				if (class11_sub43 == null) {
					class11_sub43 = Class11_Sub46_Sub3.method3767(i_63_, false,
							class146);
					if (class11_sub43 == null) {
						bool = false;
						continue;
					}
					aClass213_8909.method1368((long) i_63_, class11_sub43,
							(byte) -26);
				}
				if (!class11_sub43.method2965(class365, is,
						(((Class11_Sub47) class11_sub47).aByteArray7986),
						-1881228126))
					bool = false;
			}
			if (i != 19196)
				method3508((byte) -76, -60);
			if (bool)
				class11_sub34.method2803();
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("em.N(" + i + ','
					+ i_62_ + ',' + (class146 != null ? "{...}" : "null") + ','
					+ (class365 != null ? "{...}" : "null") + ','
					+ (class11_sub34 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method3514(int i, byte i_64_) {
		try {
			anInt8890++;
			int i_65_ = i & 0xf0;
			if ((i_65_ ^ 0xffffffff) == -129) {
				int i_66_ = 0xf & i;
				int i_67_ = (0x7f8b & i) >> 8;
				int i_68_ = 0x7f & i >> 16;
				method3489(i_68_, 12515, i_67_, i_66_);
			} else {
				int i_69_ = -36 % ((-10 - i_64_) / 37);
				if (i_65_ == 144) {
					int i_70_ = i & 0xf;
					int i_71_ = (i & 0x7f3a) >> 8;
					int i_72_ = 0x7f & i >> 16;
					if ((i_72_ ^ 0xffffffff) < -1)
						method3520(i_72_, -3404, i_71_, i_70_);
					else
						method3489(64, 12515, i_71_, i_70_);
				} else if (i_65_ == 160) {
					int i_73_ = 0xf & i;
					int i_74_ = i >> 8 & 0x7f;
					int i_75_ = i >> 16 & 0x7f;
					method3494(i_73_, i_75_, 19994, i_74_);
				} else if ((i_65_ ^ 0xffffffff) == -177) {
					int i_76_ = i & 0xf;
					int i_77_ = 0x7f & i >> 8;
					int i_78_ = 0x7f & i >> 16;
					if ((i_77_ ^ 0xffffffff) == -1)
						anIntArray8917[i_76_] = Class77.method529(
								anIntArray8917[i_76_], -2080769)
								- -(i_78_ << 14);
					if ((i_77_ ^ 0xffffffff) == -33)
						anIntArray8917[i_76_] = ((i_78_ << 7) + Class77
								.method529(-16257, anIntArray8917[i_76_]));
					if ((i_77_ ^ 0xffffffff) == -2)
						anIntArray8895[i_76_] = ((i_78_ << 7) + Class77
								.method529(anIntArray8895[i_76_], -16257));
					if (i_77_ == 33)
						anIntArray8895[i_76_] = (Class77.method529(
								anIntArray8895[i_76_], -128) - -i_78_);
					if ((i_77_ ^ 0xffffffff) == -6)
						anIntArray8879[i_76_] = ((i_78_ << 7) + Class77
								.method529(-16257, anIntArray8879[i_76_]));
					if (i_77_ == 37)
						anIntArray8879[i_76_] = i_78_
								+ Class77
										.method529(-128, anIntArray8879[i_76_]);
					if ((i_77_ ^ 0xffffffff) == -8)
						anIntArray8881[i_76_] = (Class77.method529(-16257,
								anIntArray8881[i_76_]) - -(i_78_ << 7));
					if (i_77_ == 39)
						anIntArray8881[i_76_] = (Class77.method529(-128,
								anIntArray8881[i_76_]) - -i_78_);
					if ((i_77_ ^ 0xffffffff) == -11)
						anIntArray8937[i_76_] = ((i_78_ << 7) + Class77
								.method529(-16257, anIntArray8937[i_76_]));
					if ((i_77_ ^ 0xffffffff) == -43)
						anIntArray8937[i_76_] = (Class77.method529(
								anIntArray8937[i_76_], -128) + i_78_);
					if (i_77_ == 11)
						anIntArray8925[i_76_] = ((i_78_ << 7) + Class77
								.method529(-16257, anIntArray8925[i_76_]));
					if (i_77_ == 43)
						anIntArray8925[i_76_] = (Class77.method529(-128,
								anIntArray8925[i_76_]) - -i_78_);
					if ((i_77_ ^ 0xffffffff) == -65) {
						if ((i_78_ ^ 0xffffffff) > -65)
							((Class11_Sub6_Sub2) this).anIntArray8924[i_76_] = Class77
									.method529(
											(((Class11_Sub6_Sub2) this).anIntArray8924[i_76_]),
											-2);
						else
							((Class11_Sub6_Sub2) this).anIntArray8924[i_76_] = Class173
									.method1134(
											(((Class11_Sub6_Sub2) this).anIntArray8924[i_76_]),
											1);
					}
					if ((i_77_ ^ 0xffffffff) == -66) {
						if (i_78_ >= 64)
							((Class11_Sub6_Sub2) this).anIntArray8924[i_76_] = Class173
									.method1134(
											(((Class11_Sub6_Sub2) this).anIntArray8924[i_76_]),
											2);
						else {
							method3512(i_76_, (byte) 124);
							((Class11_Sub6_Sub2) this).anIntArray8924[i_76_] = Class77
									.method529(
											(((Class11_Sub6_Sub2) this).anIntArray8924[i_76_]),
											-3);
						}
					}
					if ((i_77_ ^ 0xffffffff) == -100)
						anIntArray8919[i_76_] = (Class77.method529(127,
								anIntArray8919[i_76_]) + (i_78_ << 7));
					if ((i_77_ ^ 0xffffffff) == -99)
						anIntArray8919[i_76_] = i_78_
								+ Class77.method529(16256,
										anIntArray8919[i_76_]);
					if ((i_77_ ^ 0xffffffff) == -102)
						anIntArray8919[i_76_] = 16384 - (-Class77.method529(
								127, (anIntArray8919[i_76_])) - (i_78_ << 7));
					if ((i_77_ ^ 0xffffffff) == -101)
						anIntArray8919[i_76_] = (16384 - (-Class77.method529(
								16256, anIntArray8919[i_76_]) + -i_78_));
					if (i_77_ == 120)
						method3508((byte) -118, i_76_);
					if ((i_77_ ^ 0xffffffff) == -122)
						method3501(i_76_, (byte) 110);
					if ((i_77_ ^ 0xffffffff) == -124)
						method3511(-82, i_76_);
					if (i_77_ == 6) {
						int i_79_ = anIntArray8919[i_76_];
						if (i_79_ == 16384)
							anIntArray8897[i_76_] = Class77.method529(
									anIntArray8897[i_76_], -16257)
									+ (i_78_ << 7);
					}
					if (i_77_ == 38) {
						int i_80_ = anIntArray8919[i_76_];
						if ((i_80_ ^ 0xffffffff) == -16385)
							anIntArray8897[i_76_] = (i_78_ + Class77.method529(
									anIntArray8897[i_76_], -128));
					}
					if ((i_77_ ^ 0xffffffff) == -17)
						((Class11_Sub6_Sub2) this).anIntArray8928[i_76_] = (Class77
								.method529(
										-16257,
										(((Class11_Sub6_Sub2) this).anIntArray8928[i_76_])) - -(i_78_ << 7));
					if ((i_77_ ^ 0xffffffff) == -49)
						((Class11_Sub6_Sub2) this).anIntArray8928[i_76_] = (i_78_ + Class77
								.method529(
										-128,
										(((Class11_Sub6_Sub2) this).anIntArray8928[i_76_])));
					if (i_77_ == 81) {
						if ((i_78_ ^ 0xffffffff) > -65) {
							method3521(-19016, i_76_);
							((Class11_Sub6_Sub2) this).anIntArray8924[i_76_] = Class77
									.method529(
											(((Class11_Sub6_Sub2) this).anIntArray8924[i_76_]),
											-5);
						} else
							((Class11_Sub6_Sub2) this).anIntArray8924[i_76_] = Class173
									.method1134(
											(((Class11_Sub6_Sub2) this).anIntArray8924[i_76_]),
											4);
					}
					if (i_77_ == 17)
						method3486(i_76_, (byte) -40, (i_78_ << 7)
								+ (anIntArray8940[i_76_] & ~0x3f80));
					if ((i_77_ ^ 0xffffffff) == -50)
						method3486(i_76_, (byte) -40,
								(~0x7f & anIntArray8940[i_76_]) - -i_78_);
				} else if ((i_65_ ^ 0xffffffff) == -193) {
					int i_81_ = 0xf & i;
					int i_82_ = 0x7f & i >> 8;
					method3499(i_81_, anIntArray8917[i_81_] + i_82_, (byte) 90);
				} else if ((i_65_ ^ 0xffffffff) == -209) {
					int i_83_ = 0xf & i;
					int i_84_ = (0x7fe3 & i) >> 8;
					method3487(i_84_, i_83_, 26115);
				} else if (i_65_ == 224) {
					int i_85_ = i & 0xf;
					int i_86_ = (0x3f80 & i >> 9) - -(0x7f & i >> 8);
					method3519(i_85_, (byte) -117, i_86_);
				} else {
					i_65_ = i & 0xff;
					if ((i_65_ ^ 0xffffffff) == -256)
						method3496(false, true);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "em.BB(" + i + ','
					+ i_64_ + ')');
		}
	}

	final synchronized void method3515(int i, int i_87_) {
		try {
			anInt8896++;
			anInt8902 = i;
			int i_88_ = -26 % ((i_87_ - 3) / 42);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "em.B(" + i + ','
					+ i_87_ + ')');
		}
	}

	final synchronized void method3516(boolean bool,
			Class11_Sub34 class11_sub34, boolean bool_89_) {
		try {
			method3509(class11_sub34, bool, false, bool_89_);
			anInt8898++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("em.MA(" + bool + ','
					+ (class11_sub34 != null ? "{...}" : "null") + ','
					+ bool_89_ + ')'));
		}
	}

	private final void method3517(int i, byte i_90_, int i_91_) {
		try {
			anInt8884++;
			anIntArray8882[i] = i_91_;
			int i_92_ = 10 / ((-64 - i_90_) / 60);
			anIntArray8917[i] = Class77.method529(-128, i_91_);
			method3499(i, i_91_, (byte) 121);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("em.DA(" + i + ','
					+ i_90_ + ',' + i_91_ + ')'));
		}
	}

	final int method3518(int i) {
		try {
			if (i > -40)
				aClass11_Sub18ArrayArray8930 = null;
			anInt8880++;
			return anInt8902;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "em.QA(" + i + ')');
		}
	}

	private final void method3519(int i, byte i_93_, int i_94_) {
		try {
			if (i_93_ != -117)
				method3522((byte) -89);
			anInt8906++;
			anIntArray8938[i] = i_94_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("em.OA(" + i + ','
					+ i_93_ + ',' + i_94_ + ')'));
		}
	}

	private final void method3520(int i, int i_95_, int i_96_, int i_97_) {
		try {
			anInt8920++;
			method3489(64, 12515, i_96_, i_97_);
			if ((((Class11_Sub6_Sub2) this).anIntArray8924[i_97_] & 0x2 ^ 0xffffffff) != -1) {
				for (Class11_Sub18 class11_sub18 = ((Class11_Sub18) ((Class11_Sub6_Sub3) aClass11_Sub6_Sub3_8950).aClass84_9127
						.method582(105)); class11_sub18 != null; class11_sub18 = ((Class11_Sub18) ((Class11_Sub6_Sub3) aClass11_Sub6_Sub3_8950).aClass84_9127
						.method579(true))) {
					if ((((Class11_Sub18) class11_sub18).anInt5803 ^ 0xffffffff) == (i_97_ ^ 0xffffffff)
							&& (((Class11_Sub18) class11_sub18).anInt5798 ^ 0xffffffff) > -1) {
						aClass11_Sub18ArrayArray8930[i_97_][((Class11_Sub18) class11_sub18).anInt5789] = null;
						aClass11_Sub18ArrayArray8930[i_97_][i_96_] = class11_sub18;
						int i_98_ = (((Class11_Sub18) class11_sub18).anInt5796 + ((((Class11_Sub18) class11_sub18).anInt5801 * ((Class11_Sub18) class11_sub18).anInt5793) >> 12));
						((Class11_Sub18) class11_sub18).anInt5796 += (-((Class11_Sub18) class11_sub18).anInt5789 + i_96_) << 8;
						((Class11_Sub18) class11_sub18).anInt5801 = (i_98_ - ((Class11_Sub18) class11_sub18).anInt5796);
						((Class11_Sub18) class11_sub18).anInt5789 = i_96_;
						((Class11_Sub18) class11_sub18).anInt5793 = 4096;
						return;
					}
				}
			}
			Class11_Sub43 class11_sub43 = ((Class11_Sub43) aClass213_8909
					.method1369((byte) 26, (long) anIntArray8933[i_97_]));
			if (class11_sub43 != null) {
				Class11_Sub14_Sub1 class11_sub14_sub1 = (((Class11_Sub43) class11_sub43).aClass11_Sub14_Sub1Array7332[i_96_]);
				if (i_95_ != -3404)
					method2314();
				if (class11_sub14_sub1 != null) {
					Class11_Sub18 class11_sub18 = new Class11_Sub18();
					((Class11_Sub18) class11_sub18).aClass11_Sub14_Sub1_5799 = class11_sub14_sub1;
					((Class11_Sub18) class11_sub18).anInt5803 = i_97_;
					((Class11_Sub18) class11_sub18).aClass11_Sub43_5791 = class11_sub43;
					((Class11_Sub18) class11_sub18).aClass344_5784 = (((Class11_Sub43) class11_sub43).aClass344Array7331[i_96_]);
					((Class11_Sub18) class11_sub18).anInt5785 = (((Class11_Sub43) class11_sub43).aByteArray7326[i_96_]);
					((Class11_Sub18) class11_sub18).anInt5789 = i_96_;
					((Class11_Sub18) class11_sub18).anInt5788 = i
							* (i * ((Class11_Sub43) class11_sub43).anInt7334 * (((Class11_Sub43) class11_sub43).aByteArray7329[i_96_]))
							+ 1024 >> 11;
					((Class11_Sub18) class11_sub18).anInt5790 = 0xff & (((Class11_Sub43) class11_sub43).aByteArray7330[i_96_]);
					((Class11_Sub18) class11_sub18).anInt5796 = -(0x7fff & (((Class11_Sub43) class11_sub43).aShortArray7335[i_96_]))
							+ (i_96_ << 8);
					((Class11_Sub18) class11_sub18).anInt5805 = 0;
					((Class11_Sub18) class11_sub18).anInt5800 = 0;
					((Class11_Sub18) class11_sub18).anInt5798 = -1;
					((Class11_Sub18) class11_sub18).anInt5786 = 0;
					((Class11_Sub18) class11_sub18).anInt5787 = 0;
					if ((((Class11_Sub6_Sub2) this).anIntArray8928[i_97_] ^ 0xffffffff) != -1) {
						((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780 = (Class11_Sub6_Sub4
								.method3674(
										class11_sub14_sub1,
										method3506(i_95_ - 4248, class11_sub18),
										0, method3497((byte) 9, class11_sub18)));
						method3502(
								false,
								class11_sub18,
								((((Class11_Sub43) class11_sub43).aShortArray7335[i_96_]) ^ 0xffffffff) > -1);
					} else
						((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780 = (Class11_Sub6_Sub4
								.method3674(
										class11_sub14_sub1,
										method3506(i_95_ - 4248, class11_sub18),
										method3495(class11_sub18, (byte) 104),
										method3497((byte) 9, class11_sub18)));
					if (((Class11_Sub43) class11_sub43).aShortArray7335[i_96_] < 0)
						((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780
								.method3668(-1);
					if ((((Class11_Sub18) class11_sub18).anInt5785 ^ 0xffffffff) <= -1) {
						Class11_Sub18 class11_sub18_99_ = (aClass11_Sub18ArrayArray8923[i_97_][((Class11_Sub18) class11_sub18).anInt5785]);
						if (class11_sub18_99_ != null
								&& (((Class11_Sub18) class11_sub18_99_).anInt5798 ^ 0xffffffff) > -1) {
							aClass11_Sub18ArrayArray8930[i_97_][((Class11_Sub18) class11_sub18_99_).anInt5789] = null;
							((Class11_Sub18) class11_sub18_99_).anInt5798 = 0;
						}
						aClass11_Sub18ArrayArray8923[i_97_][((Class11_Sub18) class11_sub18).anInt5785] = class11_sub18;
					}
					((Class11_Sub6_Sub3) aClass11_Sub6_Sub3_8950).aClass84_9127
							.method589((byte) -13, class11_sub18);
					aClass11_Sub18ArrayArray8930[i_97_][i_96_] = class11_sub18;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("em.W(" + i + ','
					+ i_95_ + ',' + i_96_ + ',' + i_97_ + ')'));
		}
	}

	private final void method3521(int i, int i_100_) {
		try {
			if ((((Class11_Sub6_Sub2) this).anIntArray8924[i_100_] & 0x4) != 0) {
				for (Class11_Sub18 class11_sub18 = ((Class11_Sub18) ((Class11_Sub6_Sub3) aClass11_Sub6_Sub3_8950).aClass84_9127
						.method584(i ^ 0x65a3)); class11_sub18 != null; class11_sub18 = ((Class11_Sub18) ((Class11_Sub6_Sub3) aClass11_Sub6_Sub3_8950).aClass84_9127
						.method578(-15361))) {
					if ((((Class11_Sub18) class11_sub18).anInt5803 ^ 0xffffffff) == (i_100_ ^ 0xffffffff))
						((Class11_Sub18) class11_sub18).anInt5783 = 0;
				}
			}
			if (i == -19016)
				anInt8908++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "em.AA(" + i + ','
					+ i_100_ + ')');
		}
	}

	final synchronized void method3522(byte i) {
		do {
			try {
				anInt8900++;
				for (Class11_Sub43 class11_sub43 = (Class11_Sub43) aClass213_8909
						.method1365(24490); class11_sub43 != null; class11_sub43 = ((Class11_Sub43) aClass213_8909
						.method1367((byte) 71)))
					class11_sub43.method2968(2);
				if (i == 125)
					break;
				anIntArray8940 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "em.C(" + i + ')');
			}
			break;
		} while (false);
	}

	private final synchronized void method3523(boolean bool, byte i) {
		try {
			aClass247_8944.method1561();
			anInt8899++;
			aClass11_Sub34_8952 = null;
			int i_101_ = 1 / ((i + 82) / 36);
			method3496(false, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "em.RA(" + bool + ','
					+ i + ')');
		}
	}

	final synchronized Class11_Sub6 method2316() {
		try {
			anInt8916++;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "em.I(" + ')');
		}
	}

	final synchronized void method2315(int i) {
		try {
			anInt8883++;
			if (aClass247_8944.method1567()) {
				int i_102_ = (anInt8942 * ((Class247) aClass247_8944).anInt3340 / Class119.anInt1610);
				do {
					long l = aLong8945 + (long) i * (long) i_102_;
					if ((-l + aLong8946 ^ 0xffffffffffffffffL) <= -1L) {
						aLong8945 = l;
						break;
					}
					int i_103_ = (int) (((long) i_102_ + -aLong8945 + (aLong8946 + -1L)) / (long) i_102_);
					aLong8945 += (long) i_102_ * (long) i_103_;
					i -= i_103_;
					aClass11_Sub6_Sub3_8950.method2315(i_103_);
					method3510(32570);
				} while (aClass247_8944.method1567());
			}
			aClass11_Sub6_Sub3_8950.method2315(i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "em.D(" + i + ')');
		}
	}

	public Class11_Sub6_Sub2() {
		anIntArray8895 = new int[16];
		((Class11_Sub6_Sub2) this).anIntArray8903 = new int[16];
		anIntArray8879 = new int[16];
		anIntArray8882 = new int[16];
		((Class11_Sub6_Sub2) this).anIntArray8924 = new int[16];
		((Class11_Sub6_Sub2) this).anIntArray8928 = new int[16];
		anInt8902 = 256;
		anIntArray8897 = new int[16];
		anIntArray8925 = new int[16];
		anIntArray8881 = new int[16];
		anIntArray8935 = new int[16];
		anIntArray8919 = new int[16];
		anIntArray8933 = new int[16];
		aClass11_Sub18ArrayArray8930 = new Class11_Sub18[16][128];
		anIntArray8938 = new int[16];
		anIntArray8940 = new int[16];
		aClass11_Sub18ArrayArray8923 = new Class11_Sub18[16][128];
		anIntArray8917 = new int[16];
		anInt8942 = 1000000;
		anIntArray8937 = new int[16];
		aClass247_8944 = new Class247();
		aClass11_Sub6_Sub3_8950 = new Class11_Sub6_Sub3(this);
		try {
			aClass213_8909 = new Class213(128);
			method3491(-1, (byte) 113, 256);
			method3496(false, true);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "em.<init>(" + ')');
		}
	}

	Class11_Sub6_Sub2(Class11_Sub6_Sub2 class11_sub6_sub2_104_) {
		anIntArray8895 = new int[16];
		((Class11_Sub6_Sub2) this).anIntArray8903 = new int[16];
		anIntArray8879 = new int[16];
		anIntArray8882 = new int[16];
		((Class11_Sub6_Sub2) this).anIntArray8924 = new int[16];
		((Class11_Sub6_Sub2) this).anIntArray8928 = new int[16];
		anInt8902 = 256;
		anIntArray8897 = new int[16];
		anIntArray8925 = new int[16];
		anIntArray8881 = new int[16];
		anIntArray8935 = new int[16];
		anIntArray8919 = new int[16];
		anIntArray8933 = new int[16];
		aClass11_Sub18ArrayArray8930 = new Class11_Sub18[16][128];
		anIntArray8938 = new int[16];
		anIntArray8940 = new int[16];
		aClass11_Sub18ArrayArray8923 = new Class11_Sub18[16][128];
		anIntArray8917 = new int[16];
		anInt8942 = 1000000;
		anIntArray8937 = new int[16];
		aClass247_8944 = new Class247();
		aClass11_Sub6_Sub3_8950 = new Class11_Sub6_Sub3(this);
		try {
			aClass213_8909 = class11_sub6_sub2_104_.aClass213_8909;
			method3491(-1, (byte) 113, 256);
			method3496(false, true);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("em.<init>("
							+ (class11_sub6_sub2_104_ != null ? "{...}"
									: "null") + ')'));
		}
	}
}
