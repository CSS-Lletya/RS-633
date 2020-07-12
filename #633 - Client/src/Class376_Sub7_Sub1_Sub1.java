/* Class376_Sub7_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class376_Sub7_Sub1_Sub1 extends Class376_Sub7_Sub1 {
	static int anInt10079;
	static int anInt10080;
	static Class253[] aClass253Array10081;
	int anInt10082;
	static int anInt10083;
	static int anInt10084;
	static int[] anIntArray10085 = new int[1];
	private int anInt10086;
	static int anInt10087;
	static int anInt10088;
	static int anInt10089;
	int anInt10090;
	int anInt10091;
	static int anInt10092;
	int anInt10093 = 0;
	private boolean aBool10094;
	static int anInt10095;
	static int anInt10096 = 1406;
	int anInt10097;
	static int anInt10098;
	int anInt10099;
	int anInt10100;
	static int anInt10101;

	final boolean method2863(int i) {
		try {
			anInt10089++;
			if (i >= -106)
				((Class376_Sub7_Sub1_Sub1) this).anInt10100 = -98;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nk.AA(" + i + ')');
		}
	}

	Class376_Sub7_Sub1_Sub1(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		super(i, i_0_, i_1_, i_2_, i_3_);
		anInt10086 = 0;
		aBool10094 = false;
		((Class376_Sub7_Sub1_Sub1) this).anInt10100 = -1;
		((Class376_Sub7_Sub1_Sub1) this).anInt10082 = -1;
	}

	final boolean method2870(boolean bool) {
		try {
			if (bool != false)
				method2860(124, null);
			anInt10079++;
			return aBool10094;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nk.DA(" + bool + ')');
		}
	}

	final int method2868(byte i) {
		try {
			if (i != 14)
				anInt10086 = 76;
			anInt10080++;
			return anInt10086;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nk.GA(" + i + ')');
		}
	}

	final Class212 method2860(int i, Class163 class163) {
		try {
			if (i != 0)
				method2868((byte) 107);
			anInt10088++;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nk.D(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3920(int i) {
		try {
			if (i > -35)
				method3921(8);
			aClass253Array10081 = null;
			anIntArray10085 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nk.B(" + i + ')');
		}
	}

	static final void method3921(int i) {
		try {
			Class11_Sub2_Sub23.aclient9263.method3996(-1);
			anInt10087++;
			Class58_Sub2.method3152(0);
			((Stream) Class3.packetStream).position = 0;
			Class334.anInt4423 = 0;
			Class266.aClass160_3621 = null;
			int i_4_ = -73 / ((i + 35) / 49);
			Class47.anInt742 = 0;
			Class336.aClass160_4440 = null;
			Class340.aClass160_4489 = null;
			Class376_Sub7.method2866(1);
			Class94_Sub1.anInt5228 = 0;
			Class1_Sub1.anInt7124 = 0;
			Class12_Sub1.anInt5159 = 0;
			Class81.aClass92Array1096 = null;
			Class7.aString44 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nk.A(" + i + ')');
		}
	}

	final Class376_Sub5 method2876(byte i, Class163 class163) {
		try {
			anInt10084++;
			Class140 class140 = InputStream_Sub2
					.method2813(
							((Class376_Sub7) this).aByte7047,
							(((Class376_Sub7) this).anInt7045 >> Class11_Sub2_Sub8.anInt8751),
							(((Class376_Sub7) this).anInt7031 >> (Class11_Sub2_Sub8.anInt8751)));
			if (class140 != null
					&& (((Class376_Sub7_Sub5) ((Class140) class140).aClass376_Sub7_Sub5_1896).aBool9625)) {
				int i_5_ = ((Class140) class140).aClass376_Sub7_Sub5_1896
						.method2867(32767);
				if ((((Class376_Sub7_Sub1_Sub1) this).anInt10093 ^ 0xffffffff) != (i_5_ ^ 0xffffffff)) {
					((Class376_Sub7) this).anInt7036 -= ((Class376_Sub7_Sub1_Sub1) this).anInt10093;
					((Class376_Sub7_Sub1_Sub1) this).anInt10093 = i_5_;
					((Class376_Sub7) this).anInt7036 += i_5_;
				}
			}
			if (i != -127)
				method2868((byte) 75);
			Class33 class33 = class163.method1048();
			class33.method289();
			if (class140 == null
					|| !(((Class376_Sub7_Sub5) ((Class140) class140).aClass376_Sub7_Sub5_1896).aBool9625)) {
				boolean bool = false;
				boolean bool_6_ = false;
				boolean bool_7_ = false;
				Class12 class12 = (Class315.aClass12Array4179[((Class376_Sub7) this).aByte7039]);
				int i_8_ = anInt10086 << 1;
				int i_9_ = i_8_;
				int i_10_ = -i_8_ / 2;
				int i_11_ = -i_9_ / 2;
				int i_12_ = class12.method130(
						(((Class376_Sub7) this).anInt7031 + i_11_), i_10_
								+ (((Class376_Sub7) this).anInt7045), -127);
				int i_13_ = i_8_ / 2;
				int i_14_ = -i_9_ / 2;
				int i_15_ = class12.method130(
						(((Class376_Sub7) this).anInt7031 - -i_14_),
						(((Class376_Sub7) this).anInt7045 - -i_13_), i ^ ~0x6a);
				int i_16_ = -i_8_ / 2;
				int i_17_ = i_9_ / 2;
				int i_18_ = class12.method130(
						(((Class376_Sub7) this).anInt7031 + i_17_),
						(((Class376_Sub7) this).anInt7045 + i_16_), -128);
				int i_19_ = i_8_ / 2;
				int i_20_ = i_9_ / 2;
				int i_21_ = class12.method130(i_20_
						+ (((Class376_Sub7) this).anInt7031), i_19_
						+ (((Class376_Sub7) this).anInt7045), 23);
				int i_22_ = ((i_15_ ^ 0xffffffff) >= (i_12_ ^ 0xffffffff) ? i_15_
						: i_12_);
				int i_23_ = ((i_18_ ^ 0xffffffff) > (i_21_ ^ 0xffffffff) ? i_18_
						: i_21_);
				int i_24_ = i_15_ < i_21_ ? i_15_ : i_21_;
				if ((i_9_ ^ 0xffffffff) != -1) {
					int i_25_ = ((int) (2607.5945876176133 * Math.atan2(
							(double) (i_22_ - i_23_), (double) i_9_)) & 0x3fff);
					if ((i_25_ ^ 0xffffffff) != -1)
						class33.method303(i_25_);
				}
				int i_26_ = ((i_18_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff) ? i_12_
						: i_18_);
				int i_27_ = i_21_ + i_12_;
				if (i_8_ != 0) {
					int i_28_ = ((int) (Math.atan2((double) (-i_24_ + i_26_),
							(double) i_8_) * 2607.5945876176133) & 0x3fff);
					if (i_28_ != 0)
						class33.method297(-i_28_);
				}
				if ((i_27_ ^ 0xffffffff) < (i_18_ + i_15_ ^ 0xffffffff))
					i_27_ = i_18_ + i_15_;
				i_27_ = -((Class376_Sub7) this).anInt7036 + (i_27_ >> 1);
				if ((i_27_ ^ 0xffffffff) != -1)
					class33.method299(0, i_27_, 0);
			}
			class33.method299(((Class376_Sub7) this).anInt7045,
					((Class376_Sub7) this).anInt7036 - 10,
					((Class376_Sub7) this).anInt7031);
			Class376_Sub5 class376_sub5 = Class11_Sub11.method2370(true, 3,
					24824);
			aBool10094 = false;
			anInt10086 = 0;
			if (((Class376_Sub7_Sub1_Sub1) this).anInt10082 != -1) {
				Class206 class206 = (Packet.aClass223_8723.method1430(
						((Class376_Sub7_Sub1_Sub1) this).anInt10082, false)
						.method1587(2048, false, class163, null,
								((Class376_Sub7_Sub1_Sub1) this).anInt10091,
								-1, null, 0, 0));
				if (class206 != null) {
					if (Class11_Sub45_Sub1.aBool8490)
						class206.method1329(
								class33,
								(((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[2]),
								Class117.anInt1597, 0);
					else
						class206.method1321(
								class33,
								(((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[2]),
								0);
					aBool10094 |= class206.F();
					anInt10086 = class206.ma();
				}
			}
			if ((((Class376_Sub7_Sub1_Sub1) this).anInt10100 ^ 0xffffffff) != 0) {
				Class206 class206 = (Packet.aClass223_8723.method1430(
						((Class376_Sub7_Sub1_Sub1) this).anInt10100, false)
						.method1587(2048, false, class163, null,
								((Class376_Sub7_Sub1_Sub1) this).anInt10099,
								-1, null, 0, 0));
				if (class206 != null) {
					if (!Class11_Sub45_Sub1.aBool8490)
						class206.method1321(
								class33,
								(((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[1]),
								0);
					else
						class206.method1329(
								class33,
								(((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[1]),
								Class117.anInt1597, 0);
					aBool10094 |= class206.F();
					if (class206.ma() > anInt10086)
						anInt10086 = class206.ma();
				}
			}
			Class206 class206 = (Packet.aClass223_8723.method1430(
					((Class376_Sub7_Sub1_Sub1) this).anInt10097, false)
					.method1587(2048, false, class163, null,
							((Class376_Sub7_Sub1_Sub1) this).anInt10090, -1,
							null, 0, 0));
			if (class206 != null) {
				if (Class11_Sub45_Sub1.aBool8490)
					class206.method1329(
							class33,
							(((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[0]),
							Class117.anInt1597, 0);
				else
					class206.method1321(
							class33,
							(((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[0]),
							0);
				aBool10094 |= class206.F();
				if ((class206.ma() ^ 0xffffffff) < (anInt10086 ^ 0xffffffff))
					anInt10086 = class206.ma();
			}
			return class376_sub5;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nk.U(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	final int method2864(int i) {
		try {
			anInt10101++;
			if (i <= 72)
				return -38;
			Class249 class249 = (Packet.aClass223_8723.method1430(
					((Class376_Sub7_Sub1_Sub1) this).anInt10097, false));
			int i_29_ = ((Class249) class249).anInt3409;
			if ((((Class376_Sub7_Sub1_Sub1) this).anInt10100 ^ 0xffffffff) != 0) {
				Class249 class249_30_ = (Packet.aClass223_8723.method1430(
						((Class376_Sub7_Sub1_Sub1) this).anInt10100, false));
				if (((Class249) class249_30_).anInt3409 > i_29_)
					i_29_ = ((Class249) class249_30_).anInt3409;
			}
			if (((Class376_Sub7_Sub1_Sub1) this).anInt10082 != -1) {
				Class249 class249_31_ = (Packet.aClass223_8723.method1430(
						((Class376_Sub7_Sub1_Sub1) this).anInt10082, false));
				if ((((Class249) class249_31_).anInt3409 ^ 0xffffffff) < (i_29_ ^ 0xffffffff))
					i_29_ = ((Class249) class249_31_).anInt3409;
			}
			return i_29_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nk.TA(" + i + ')');
		}
	}

	final int method2867(int i) {
		try {
			if (i != 32767)
				return -15;
			anInt10083++;
			return -10;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nk.EA(" + i + ')');
		}
	}

	final void method2874(byte i, Class163 class163) {
		try {
			int i_32_ = -113 % ((18 - i) / 40);
			anInt10092++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nk.K(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method2873(Class163 class163, int i, int i_33_, int i_34_) {
		try {
			anInt10098++;
			Class33 class33 = class163.method1048();
			class33.method301(((Class376_Sub7) this).anInt7045,
					((Class376_Sub7) this).anInt7036 - 10,
					((Class376_Sub7) this).anInt7031);
			Class249 class249 = (Packet.aClass223_8723.method1430(
					((Class376_Sub7_Sub1_Sub1) this).anInt10097, false));
			Class206 class206 = class249.method1587(131072, false, class163,
					null, (((Class376_Sub7_Sub1_Sub1) this).anInt10090), -1,
					null, i, 0);
			if (class206 != null
					&& (!Class11_Sub45_Sub1.aBool8490 ? class206.method1309(
							i_34_, i_33_, class33, true,
							((Class249) class249).anInt3409) : class206
							.method1305(i_34_, i_33_, class33, true,
									((Class249) class249).anInt3409,
									Class117.anInt1597)))
				return true;
			if (((Class376_Sub7_Sub1_Sub1) this).anInt10100 != -1) {
				Class249 class249_35_ = (Packet.aClass223_8723.method1430(
						((Class376_Sub7_Sub1_Sub1) this).anInt10100, false));
				class206 = class249_35_.method1587(131072, false, class163,
						null, (((Class376_Sub7_Sub1_Sub1) this).anInt10099),
						-1, null, 0, 0);
				if (class206 != null
						&& (Class11_Sub45_Sub1.aBool8490 ? class206.method1305(
								i_34_, i_33_, class33, true,
								(((Class249) class249_35_).anInt3409),
								Class117.anInt1597) : class206.method1309(
								i_34_, i_33_, class33, true,
								(((Class249) class249_35_).anInt3409))))
					return true;
			}
			if ((((Class376_Sub7_Sub1_Sub1) this).anInt10082 ^ 0xffffffff) != 0) {
				Class249 class249_36_ = (Packet.aClass223_8723.method1430(
						((Class376_Sub7_Sub1_Sub1) this).anInt10082, false));
				class206 = class249_36_.method1587(131072, false, class163,
						null, (((Class376_Sub7_Sub1_Sub1) this).anInt10091),
						-1, null, 0, 0);
				if (class206 != null
						&& (!Class11_Sub45_Sub1.aBool8490 ? class206
								.method1309(i_34_, i_33_, class33, true,
										(((Class249) class249_36_).anInt3409))
								: class206.method1305(i_34_, i_33_, class33,
										true,
										(((Class249) class249_36_).anInt3409),
										Class117.anInt1597)))
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nk.M("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_33_ + ',' + i_34_ + ')'));
		}
	}
}
