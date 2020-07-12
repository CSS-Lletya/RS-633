/* Class376_Sub7_Sub5_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

final class Class376_Sub7_Sub5_Sub2 extends Class376_Sub7_Sub5 {
	private Class376_Sub10 aClass376_Sub10_9970;
	private Class281 aClass281_9971;
	private int anInt9972;
	static int anInt9973;
	private int anInt9974;
	static int anInt9975;
	static int anInt9976;
	private int anInt9977;
	static int anInt9978;
	static int anInt9979;
	int anInt9980;
	private int anInt9981 = 0;
	int anInt9982;
	static int anInt9983;
	static CRC32 aCRC32_9984 = new CRC32();
	private int anInt9985;
	static int anInt9986;
	private double aDouble9987;
	static int anInt9988;
	static int anInt9989;
	static int anInt9990;
	private double aDouble9991;
	private int anInt9992;
	private int anInt9993;
	private double aDouble9994;
	private double aDouble9995;
	static int anInt9996;
	private boolean aBool9997;
	private int anInt9998;
	private int anInt9999;
	static int anInt10000;
	private int anInt10001;
	static int anInt10002;
	private int anInt10003;
	static int anInt10004;
	private double aDouble10005;
	private double aDouble10006;
	private boolean aBool10007;
	static int anInt10008;
	static int anInt10009;
	private double aDouble10010;
	static int anInt10011;
	private boolean aBool10012;
	static int anInt10013;
	int anInt10014;
	static int anInt10015;
	private int anInt10016;
	int anInt10017;
	private double aDouble10018;
	static int anInt10019;
	static int anInt10020;
	static int anInt10021;
	private int anInt10022;
	static int anInt10023;
	static int anInt10024;
	static boolean aBool10025 = false;

	final void method3899(byte i) {
		do {
			try {
				if (i > 55) {
					anInt10024++;
					if (!aBool10012) {
						if ((anInt9992 ^ 0xffffffff) == -1)
							break;
						Actor class376_sub7_sub5_sub5 = null;
						if (anInt9992 < 0) {
							int i_0_ = -anInt9992 - 1;
							if (Class11_Sub44.anInt7791 != i_0_)
								class376_sub7_sub5_sub5 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_0_]);
							else
								class376_sub7_sub5_sub5 = (Class11_Sub2_Sub8.myPlayer);
						} else {
							int i_1_ = -1 + anInt9992;
							Class11_Sub25 class11_sub25 = ((Class11_Sub25) Class11_Sub2_Sub25.aClass213_9322
									.method1369((byte) 26, (long) i_1_));
							if (class11_sub25 != null)
								class376_sub7_sub5_sub5 = (((Class11_Sub25) class11_sub25).aNpc_2373);
						}
						if (class376_sub7_sub5_sub5 == null)
							break;
						((Class376_Sub7) this).anInt7045 = (((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045);
						((Class376_Sub7) this).anInt7031 = (((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031);
						((Class376_Sub7) this).anInt7036 = Class318
								.method1931(
										89,
										(((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031),
										(((Class376_Sub7) this).aByte7047),
										(((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045))
								+ -anInt9999;
						if (anInt10001 < 0)
							break;
						Class39 class39 = class376_sub7_sub5_sub5
								.method3960(21816);
						int i_2_ = 0;
						int i_3_ = 0;
						if (((Class39) class39).anIntArrayArray564 != null
								&& (((Class39) class39).anIntArrayArray564[anInt10001]) != null) {
							i_3_ += (((Class39) class39).anIntArrayArray564[anInt10001][2]);
							i_2_ += (((Class39) class39).anIntArrayArray564[anInt10001][0]);
						}
						if (((Class39) class39).anIntArrayArray529 != null
								&& (((Class39) class39).anIntArrayArray529[anInt10001]) != null) {
							i_3_ += (((Class39) class39).anIntArrayArray529[anInt10001][2]);
							i_2_ += (((Class39) class39).anIntArrayArray529[anInt10001][0]);
						}
						if (i_2_ != 0 || (i_3_ ^ 0xffffffff) != -1) {
							int i_4_ = ((Actor) class376_sub7_sub5_sub5).aClass173_10278
									.method1140(-1);
							int i_5_ = i_4_;
							if ((((Actor) class376_sub7_sub5_sub5).anIntArray10324 != null)
									&& (((Actor) class376_sub7_sub5_sub5).anIntArray10324[anInt10001]) != -1)
								i_5_ = (((Actor) class376_sub7_sub5_sub5).anIntArray10324[anInt10001]);
							int i_6_ = i_5_ + -i_4_ & 0x3fff;
							int i_7_ = Class335.anIntArray4436[i_6_];
							int i_8_ = Class335.anIntArray4430[i_6_];
							int i_9_ = i_2_ * i_8_ + i_3_ * i_7_ >> 14;
							i_3_ = i_8_ * i_3_ - i_2_ * i_7_ >> 14;
							i_2_ = i_9_;
							((Class376_Sub7) this).anInt7031 += i_3_;
							((Class376_Sub7) this).anInt7045 += i_2_;
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "qga.C(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method2862(int i) {
		try {
			if (i > -103)
				method3903(-17, -53, -45, -24, 119);
			anInt9986++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qga.W(" + i + ')');
		}
	}

	final boolean method2863(int i) {
		try {
			if (i > -106)
				method2874((byte) 120, null);
			anInt10019++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qga.AA(" + i + ')');
		}
	}

	private final Class206 method3900(byte i, Class163 class163, int i_10_) {
		try {
			if (i != 3)
				method2867(-10);
			anInt10020++;
			Class224 class224 = Class254.aClass227_3495.method1465(anInt9993,
					(byte) -92);
			return class224
					.method1436(class163, (byte) 6, anInt10016, anInt9985,
							anInt10003, i_10_, Class108_Sub23.aClass198_7760);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("qga.J(" + i + ',' + (class163 != null ? "{...}" : "null")
							+ ',' + i_10_ + ')'));
		}
	}

	final void method3901(int i) {
		do {
			try {
				anInt9978++;
				if (i != 16383)
					method3906(77, 38, -69, 120);
				if (aClass376_Sub10_9970 == null)
					break;
				aClass376_Sub10_9970.method3171();
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "qga.O(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method2872(int i) {
		try {
			anInt10002++;
			if (i != 26062)
				finalize();
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qga.L(" + i + ')');
		}
	}

	final void method2874(byte i, Class163 class163) {
		try {
			anInt9990++;
			Class206 class206 = method3900((byte) 3, class163, 0);
			if (class206 != null) {
				Class33 class33 = class163.method1048();
				class33.method286(anInt9977);
				class33.method293(anInt9972);
				class33.method299((int) aDouble10006, (int) aDouble10018,
						(int) aDouble9987);
				anInt9974 = class206.fa();
				anInt9981 = class206.ma();
				method3909(class163, class33, class206, 107);
				int i_11_ = 35 / ((i - 18) / 40);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qga.K(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3902(byte i) {
		try {
			if (i < 105)
				method3907(85, -19, -27);
			aCRC32_9984 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qga.F(" + i + ')');
		}
	}

	final void method3903(int i, int i_12_, int i_13_, int i_14_, int i_15_) {
		try {
			if (!aBool10012) {
				double d = (double) (-((Class376_Sub7) this).anInt7045 + i_12_);
				double d_16_ = (double) (i_14_ + -((Class376_Sub7) this).anInt7031);
				double d_17_ = Math.sqrt(d_16_ * d_16_ + d * d);
				aDouble9987 = ((double) ((Class376_Sub7) this).anInt7031 + d_16_
						* (double) anInt9998 / d_17_);
				aDouble10006 = ((double) ((Class376_Sub7) this).anInt7045 + (double) anInt9998
						* d / d_17_);
				if (!aBool10007)
					aDouble10018 = (double) ((Class376_Sub7) this).anInt7036;
				else
					aDouble10018 = (double) (Class318.method1931(81,
							(int) aDouble9987,
							(((Class376_Sub7) this).aByte7047),
							(int) aDouble10006) - anInt9999);
			}
			if (i_13_ == 0) {
				anInt10008++;
				double d = (double) (((Class376_Sub7_Sub5_Sub2) this).anInt9980 + (1 + -i_15_));
				aDouble9994 = (-aDouble10006 + (double) i_12_) / d;
				aDouble9995 = (-aDouble9987 + (double) i_14_) / d;
				aDouble10005 = Math.sqrt(aDouble9994 * aDouble9994
						+ aDouble9995 * aDouble9995);
				if (anInt10022 != -1) {
					if (!aBool10012)
						aDouble9991 = (-aDouble10005 * Math
								.tan((double) anInt10022 * 0.02454369));
					aDouble10010 = 2.0
							* (-(d * aDouble9991) + (-aDouble10018 + (double) i))
							/ (d * d);
				} else
					aDouble9991 = ((double) i - aDouble10018) / d;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qga.E(" + i + ','
					+ i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ')'));
		}
	}

	static final int method3904(String string, boolean bool, Stream stream) {
		try {
			anInt9989++;
			int i = ((Stream) stream).position;
			if (bool != false)
				method3907(-107, -104, -96);
			byte[] is = Class103.method686(string, 80);
			stream.method2537(is.length, (byte) 127);
			((Stream) stream).position += Class314.aClass78_4169.method534(0,
					is, (((Stream) stream).position), (byte) 31, is.length,
					(((Stream) stream).buffer));
			return ((Stream) stream).position - i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qga.I("
					+ (string != null ? "{...}" : "null") + ',' + bool + ','
					+ (stream != null ? "{...}" : "null") + ')'));
		}
	}

	final int method2868(byte i) {
		try {
			if (i != 14)
				method3904(null, false, null);
			anInt10009++;
			return anInt9981;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qga.GA(" + i + ')');
		}
	}

	static final void method3905(boolean bool, Class163 class163) {
		try {
			for (Class376_Sub10 class376_sub10 = ((Class376_Sub10) IncomingPacket.aClass131_2086
					.method847(-31182)); class376_sub10 != null; class376_sub10 = ((Class376_Sub10) IncomingPacket.aClass131_2086
					.method856(125))) {
				if (((Class376_Sub10) class376_sub10).aBool7888)
					class376_sub10.method3173(class163);
			}
			if (bool != false)
				aCRC32_9984 = null;
			anInt10004++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qga.Q(" + bool + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class11_Sub10 method3906(int i, int i_18_, int i_19_, int i_20_) {
		try {
			anInt10023++;
			Class11_Sub10 class11_sub10 = null;
			if ((i_20_ ^ 0xffffffff) == -1) {
				class11_sub10 = Class11_Sub48.method3215(
						Class11_Sub3.aClass25_5113,
						(Class11_Sub45_Sub16.WALKING_OUT_PACKET), (byte) 93);
				Class11_Sub45_Sub10.anInt8959++;
			}
			if ((i_20_ ^ 0xffffffff) == -2) {
				Class218.anInt3008++;
				class11_sub10 = Class11_Sub48.method3215(
						Class11_Sub3.aClass25_5113,
						Class355.MINIMAP_WALKING_OUT_PACKET, (byte) 99);
			}
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
					.writeByte128((byte) -5, Class11_Sub2_Sub19.aClass1_9098
							.method60(0, 82) ? 1 : 0);
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
					.writeShortLE128((byte) 111, Class118.anInt1605 + i_19_);
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
					.writeShortLE(1815869672, i_18_ + Class194.anInt2641);
			Class321.anInt4284 = i_18_;
			Class220_Sub1.anInt7153 = i_19_;
			Class11_Sub2_Sub3.aBool8473 = false;
			Class11_Sub45_Sub1.method3344(107);
			return class11_sub10;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qga.P(" + i + ','
					+ i_18_ + ',' + i_19_ + ',' + i_20_ + ')'));
		}
	}

	final boolean method2870(boolean bool) {
		try {
			if (bool != false)
				((Class376_Sub7_Sub5_Sub2) this).anInt10017 = 22;
			anInt10015++;
			return aBool9997;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qga.DA(" + bool + ')');
		}
	}

	final Class212 method2860(int i, Class163 class163) {
		try {
			anInt10000++;
			if (i != 0)
				return null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qga.D(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3907(int i, int i_22_, int i_23_) {
		do {
			try {
				Class11_Sub2_Sub33.method3805(0, i, i_23_);
				anInt10013++;
				if (i_22_ >= 84)
					break;
				method3904(null, true, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("qga.B(" + i + ','
						+ i_22_ + ',' + i_23_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2871(boolean bool, Class163 class163, int i, int i_24_,
			Class376_Sub7 class376_sub7, int i_25_, int i_26_) {
		try {
			if (i_25_ != 22501)
				anInt9999 = -18;
			anInt10011++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qga.G(" + bool + ','
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_24_ + ',' + (class376_sub7 != null ? "{...}" : "null")
					+ ',' + i_25_ + ',' + i_26_ + ')'));
		}
	}

	final int method2867(int i) {
		try {
			if (i != 32767)
				aDouble10010 = 0.5072362021674551;
			anInt10021++;
			return anInt9974;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qga.EA(" + i + ')');
		}
	}

	Class376_Sub7_Sub5_Sub2(int i, int i_27_, int i_28_, int i_29_, int i_30_,
			int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_,
			int i_37_, int i_38_, boolean bool, int i_39_) {
		super(i_27_, i_28_, i_29_, Class318.method1931(85, i_30_, i_27_, i_29_)
				- i_31_, i_30_, i_29_ >> 9, i_29_ >> 9, i_30_ >> 9, i_30_ >> 9,
				false, (byte) 0);
		anInt9974 = 0;
		anInt10003 = 0;
		aBool9997 = false;
		anInt9985 = 0;
		anInt10016 = -1;
		aBool10012 = false;
		try {
			((Class376_Sub7_Sub5_Sub2) this).anInt10014 = i_38_;
			anInt9992 = i_36_;
			anInt9999 = i_31_;
			aBool10012 = false;
			anInt10022 = i_34_;
			anInt10001 = i_39_;
			((Class376_Sub7_Sub5_Sub2) this).anInt9982 = i_37_;
			aBool10007 = bool;
			anInt9993 = i;
			((Class376_Sub7_Sub5_Sub2) this).anInt10017 = i_32_;
			((Class376_Sub7_Sub5_Sub2) this).anInt9980 = i_33_;
			anInt9998 = i_35_;
			int i_40_ = (((Class224) Class254.aClass227_3495.method1465(
					anInt9993, (byte) 93)).anInt3079);
			if ((i_40_ ^ 0xffffffff) == 0)
				aClass281_9971 = null;
			else
				aClass281_9971 = Class108_Sub23.aClass198_7760.method1284(
						i_40_, (byte) 98);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qga.<init>(" + i
					+ ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_
					+ ',' + i_31_ + ',' + i_32_ + ',' + i_33_ + ',' + i_34_
					+ ',' + i_35_ + ',' + i_36_ + ',' + i_37_ + ',' + i_38_
					+ ',' + bool + ',' + i_39_ + ')'));
		}
	}

	static final void method3908(byte i) {
		try {
			InputStream_Sub2.aClass143Array6948 = null;
			if (i != 38)
				method3908((byte) -124);
			anInt9976++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qga.A(" + i + ')');
		}
	}

	protected final void finalize() {
		try {
			if (aClass376_Sub10_9970 != null)
				aClass376_Sub10_9970.method3171();
			anInt9983++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qga.finalize(" + ')');
		}
	}

	final void method3797(boolean bool) {
		try {
			((Class376_Sub7_Sub5) this).aShort9629 = ((Class376_Sub7_Sub5) this).aShort9620 = (short) (int) (aDouble9987 / 512.0);
			anInt9973++;
			if (bool != true)
				method3902((byte) -20);
			((Class376_Sub7_Sub5) this).aShort9626 = ((Class376_Sub7_Sub5) this).aShort9624 = (short) (int) (aDouble10006 / 512.0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qga.MA(" + bool + ')');
		}
	}

	private final void method3909(Class163 class163, Class33 class33,
			Class206 class206, int i) {
		do {
			try {
				class206.method1318(class33);
				anInt9975++;
				Class110[] class110s = class206.method1307();
				Class261[] class261s = class206.method1325();
				if ((aClass376_Sub10_9970 == null || ((Class376_Sub10) aClass376_Sub10_9970).aBool7877)
						&& (class110s != null || class261s != null))
					aClass376_Sub10_9970 = Class376_Sub10.method3166(
							Class11_Sub25.anInt6279, true);
				int i_41_ = -116 % ((-6 - i) / 57);
				if (aClass376_Sub10_9970 == null)
					break;
				aClass376_Sub10_9970.method3176(class163,
						(long) Class11_Sub25.anInt6279, class110s, class261s,
						false);
				aClass376_Sub10_9970.method3170(
						((Class376_Sub7) this).aByte7047,
						((Class376_Sub7_Sub5) this).aShort9626,
						((Class376_Sub7_Sub5) this).aShort9624,
						((Class376_Sub7_Sub5) this).aShort9629,
						((Class376_Sub7_Sub5) this).aShort9620);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("qga.N(" + (class163 != null ? "{...}" : "null") + ','
								+ (class33 != null ? "{...}" : "null") + ','
								+ (class206 != null ? "{...}" : "null") + ','
								+ i + ')'));
			}
			break;
		} while (false);
	}

	final Class376_Sub5 method2876(byte i, Class163 class163) {
		try {
			anInt9988++;
			Class206 class206 = method3900((byte) 3, class163, 2048);
			if (class206 == null)
				return null;
			Class33 class33 = class163.method1048();
			class33.method286(anInt9977);
			class33.method293(anInt9972);
			class33.method299((int) aDouble10006, (int) aDouble10018,
					(int) aDouble9987);
			method3909(class163, class33, class206, -91);
			Class376_Sub5 class376_sub5 = Class11_Sub11.method2370(false, 1,
					24824);
			if (!Class11_Sub45_Sub1.aBool8490)
				class206.method1321(
						class33,
						(((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[0]),
						0);
			else
				class206.method1329(
						class33,
						(((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[0]),
						Class117.anInt1597, 0);
			if (i != -127)
				method2860(21, null);
			if (aClass376_Sub10_9970 != null) {
				Class116 class116 = aClass376_Sub10_9970.method3172();
				if (Class11_Sub45_Sub1.aBool8490)
					class163.method1008(class116, Class117.anInt1597);
				else
					class163.method1010(class116);
			}
			aBool9997 = class206.F();
			anInt9974 = class206.fa();
			anInt9981 = class206.ma();
			return class376_sub5;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qga.U(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method2873(Class163 class163, int i, int i_42_, int i_43_) {
		try {
			if (i != 0)
				method3903(26, 63, -100, -125, -114);
			anInt9979++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qga.M("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_42_ + ',' + i_43_ + ')'));
		}
	}

	final void method3910(int i, byte i_44_) {
		do {
			try {
				aBool10012 = true;
				int i_45_ = -36 % ((-87 - i_44_) / 36);
				anInt9996++;
				aDouble10006 += (double) i * aDouble9994;
				aDouble9987 += aDouble9995 * (double) i;
				if (aBool10007)
					aDouble10018 = (double) (Class318.method1931(88,
							(int) aDouble9987,
							(((Class376_Sub7) this).aByte7047),
							(int) aDouble10006) - anInt9999);
				else if (anInt10022 == -1)
					aDouble10018 += (double) i * aDouble9991;
				else {
					aDouble10018 += ((double) i * aDouble9991 + (double) i
							* (aDouble10010 * 0.5 * (double) i));
					aDouble9991 += (double) i * aDouble10010;
				}
				anInt9972 = ((int) (2607.5945876176133 * Math.atan2(
						aDouble9994, aDouble9995)) + 8192) & 0x3fff;
				anInt9977 = (int) (2607.5945876176133 * Math.atan2(aDouble9991,
						aDouble10005)) & 0x3fff;
				if (aClass281_9971 == null)
					break;
				anInt10003 += i;
				while (anInt10003 > (((Class281) aClass281_9971).anIntArray3817[anInt9985])) {
					anInt10003 -= (((Class281) aClass281_9971).anIntArray3817[anInt9985]);
					anInt9985++;
					if ((anInt9985 ^ 0xffffffff) <= (((Class281) aClass281_9971).anIntArray3794.length ^ 0xffffffff)) {
						anInt9985 -= ((Class281) aClass281_9971).anInt3808;
						if ((anInt9985 ^ 0xffffffff) > -1
								|| anInt9985 >= (((Class281) aClass281_9971).anIntArray3794).length)
							anInt9985 = 0;
					}
					anInt10016 = anInt9985 + 1;
					if (anInt10016 >= ((Class281) aClass281_9971).anIntArray3794.length) {
						anInt10016 -= ((Class281) aClass281_9971).anInt3808;
						if (anInt10016 < 0
								|| (((Class281) aClass281_9971).anIntArray3794).length <= anInt10016)
							anInt10016 = -1;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "qga.H(" + i + ','
						+ i_44_ + ')');
			}
			break;
		} while (false);
	}
}
