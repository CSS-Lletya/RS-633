/* Class376_Sub7_Sub5_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class376_Sub7_Sub5_Sub3 extends Class376_Sub7_Sub5 {
	static int anInt10050;
	private boolean aBool10051;
	static int anInt10052;
	static int anInt10053;
	static int anInt10054;
	static int anInt10055;
	private int anInt10056 = 0;
	static int anInt10057;
	private int anInt10058;
	private int anInt10059 = 0;
	static int anInt10060;
	private Class376_Sub10 aClass376_Sub10_10061;
	static int anInt10062;
	static int anInt10063;
	private int anInt10064 = 0;
	int anInt10065;
	boolean aBool10066;
	static int anInt10067;
	private int anInt10068;
	private int anInt10069 = 0;
	static int anInt10070;
	private int anInt10071;
	private Class281 aClass281_10072;
	static int anInt10073;
	static int anInt10074;
	static int anInt10075;
	static int anInt10076;
	static int anInt10077;

	private final Class206 method3916(int i, int i_0_, int i_1_,
			Class163 class163) {
		try {
			int i_2_ = 116 / ((26 - i_1_) / 35);
			anInt10077++;
			Class224 class224 = Class254.aClass227_3495.method1465(i_0_,
					(byte) -63);
			Class12 class12 = (Class11_Sub2_Sub38.aClass12Array9796[((Class376_Sub7) this).aByte7047]);
			Class12 class12_3_ = (((Class376_Sub7) this).aByte7039 < 3 ? (Class11_Sub2_Sub38.aClass12Array9796[1 + ((Class376_Sub7) this).aByte7039])
					: null);
			if (((Class376_Sub7_Sub5_Sub3) this).aBool10066)
				return class224.method1438(class12_3_,
						((Class376_Sub7) this).anInt7036, (byte) -45, -1, -1,
						class163, i, true, Class108_Sub23.aClass198_7760,
						((Class376_Sub7) this).anInt7031, class12, 0,
						((Class376_Sub7) this).anInt7045);
			return class224.method1438(class12_3_,
					((Class376_Sub7) this).anInt7036, (byte) 126, anInt10071,
					anInt10064, class163, i, true,
					Class108_Sub23.aClass198_7760,
					((Class376_Sub7) this).anInt7031, class12, anInt10068,
					((Class376_Sub7) this).anInt7045);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lc.FA(" + i + ','
					+ i_0_ + ',' + i_1_ + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	final int method2868(byte i) {
		try {
			anInt10073++;
			if (i != 14)
				finalize();
			return anInt10059;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lc.GA(" + i + ')');
		}
	}

	protected final void finalize() {
		try {
			if (aClass376_Sub10_10061 != null)
				aClass376_Sub10_10061.method3171();
			anInt10055++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lc.finalize(" + ')');
		}
	}

	final Class212 method2860(int i, Class163 class163) {
		try {
			if (i != 0)
				aBool10051 = false;
			anInt10062++;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lc.D(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2871(boolean bool, Class163 class163, int i, int i_4_,
			Class376_Sub7 class376_sub7, int i_5_, int i_6_) {
		try {
			if (i_5_ != 22501)
				method2870(false);
			anInt10054++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lc.G(" + bool + ','
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_4_ + ',' + (class376_sub7 != null ? "{...}" : "null")
					+ ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	Class376_Sub7_Sub5_Sub3(int i, int i_7_, int i_8_, int i_9_, int i_10_,
			int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_,
			int i_17_, int i_18_) {
		super(i_9_, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, i_16_, i_17_,
				false, (byte) 0);
		anInt10068 = 0;
		aBool10051 = true;
		((Class376_Sub7_Sub5_Sub3) this).aBool10066 = false;
		anInt10071 = -1;
		do {
			try {
				anInt10058 = i;
				((Class376_Sub7_Sub5_Sub3) this).anInt10065 = i_8_ + i_7_;
				anInt10069 = i_18_;
				Class224 class224 = Class254.aClass227_3495.method1465(
						anInt10058, (byte) 110);
				int i_19_ = ((Class224) class224).anInt3079;
				if (i_19_ != -1) {
					aClass281_10072 = Class108_Sub23.aClass198_7760.method1284(
							i_19_, (byte) 97);
					((Class376_Sub7_Sub5_Sub3) this).aBool10066 = false;
				} else
					((Class376_Sub7_Sub5_Sub3) this).aBool10066 = true;
				if (i_8_ != ((Class376_Sub7_Sub5_Sub3) this).anInt10065)
					break;
				Class268.method1690(-701644944, anInt10064, this,
						aClass281_10072);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("lc.<init>(" + i + ',' + i_7_ + ',' + i_8_ + ','
								+ i_9_ + ',' + i_10_ + ',' + i_11_ + ','
								+ i_12_ + ',' + i_13_ + ',' + i_14_ + ','
								+ i_15_ + ',' + i_16_ + ',' + i_17_ + ','
								+ i_18_ + ')'));
			}
			break;
		} while (false);
	}

	final boolean method2873(Class163 class163, int i, int i_20_, int i_21_) {
		try {
			if (i != 0)
				method3919((byte) 112, null, null, null);
			anInt10070++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lc.M("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_20_ + ',' + i_21_ + ')'));
		}
	}

	final boolean method2863(int i) {
		try {
			if (i > -106)
				anInt10056 = 120;
			anInt10057++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lc.AA(" + i + ')');
		}
	}

	final void method2872(int i) {
		try {
			if (i != 26062)
				anInt10069 = 116;
			anInt10063++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lc.L(" + i + ')');
		}
	}

	final void method3917(byte i, int i_22_) {
		do {
			try {
				anInt10067++;
				if (!((Class376_Sub7_Sub5_Sub3) this).aBool10066 && i >= 94) {
					anInt10068 += i_22_;
					while (anInt10068 > (((Class281) aClass281_10072).anIntArray3817[anInt10064])) {
						anInt10068 -= (((Class281) aClass281_10072).anIntArray3817[anInt10064]);
						anInt10064++;
						if ((anInt10064 ^ 0xffffffff) <= ((((Class281) aClass281_10072).anIntArray3794).length ^ 0xffffffff)) {
							((Class376_Sub7_Sub5_Sub3) this).aBool10066 = true;
							break;
						}
					}
					if (((Class376_Sub7_Sub5_Sub3) this).aBool10066)
						break;
					Class268.method1690(-701644944, anInt10064, this,
							aClass281_10072);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "lc.HA(" + i + ','
						+ i_22_ + ')');
			}
			break;
		} while (false);
	}

	final boolean method2870(boolean bool) {
		try {
			if (bool != false)
				anInt10068 = 66;
			anInt10052++;
			return aBool10051;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lc.DA(" + bool + ')');
		}
	}

	final void method3918(byte i) {
		try {
			if (i == -120) {
				if (aClass376_Sub10_10061 != null)
					aClass376_Sub10_10061.method3171();
				anInt10074++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lc.CA(" + i + ')');
		}
	}

	final Class376_Sub5 method2876(byte i, Class163 class163) {
		try {
			anInt10050++;
			Class206 class206 = method3916(((anInt10069 ^ 0xffffffff) != -1 ? 5
					: 0) | 0x800, anInt10058, 122, class163);
			if (class206 == null)
				return null;
			if (i != -127)
				method3919((byte) 122, null, null, null);
			if (anInt10069 != 0)
				class206.a(anInt10069 * 2048);
			Class33 class33 = class163.method1048();
			class33.method301(((Class376_Sub7) this).anInt7045,
					((Class376_Sub7) this).anInt7036,
					((Class376_Sub7) this).anInt7031);
			method3919((byte) 49, class206, class33, class163);
			Class376_Sub5 class376_sub5 = Class11_Sub11.method2370(false, 1, i
					^ ~0x6086);
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
			if (aClass376_Sub10_10061 != null) {
				Class116 class116 = aClass376_Sub10_10061.method3172();
				if (Class11_Sub45_Sub1.aBool8490)
					class163.method1008(class116, Class117.anInt1597);
				else
					class163.method1010(class116);
			}
			aBool10051 = class206.F();
			anInt10056 = class206.fa();
			anInt10059 = class206.ma();
			return class376_sub5;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lc.U(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	final int method2867(int i) {
		try {
			anInt10060++;
			if (i != 32767)
				aClass281_10072 = null;
			return anInt10056;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lc.EA(" + i + ')');
		}
	}

	private final void method3919(byte i, Class206 class206, Class33 class33,
			Class163 class163) {
		do {
			try {
				class206.method1318(class33);
				anInt10053++;
				Class110[] class110s = class206.method1307();
				if (i == 49) {
					Class261[] class261s = class206.method1325();
					if ((aClass376_Sub10_10061 == null || ((Class376_Sub10) aClass376_Sub10_10061).aBool7877)
							&& (class110s != null || class261s != null))
						aClass376_Sub10_10061 = Class376_Sub10.method3166(
								Class11_Sub25.anInt6279, true);
					if (aClass376_Sub10_10061 == null)
						break;
					aClass376_Sub10_10061.method3176(class163,
							(long) (Class11_Sub25.anInt6279), class110s,
							class261s, false);
					aClass376_Sub10_10061.method3170(
							((Class376_Sub7) this).aByte7047,
							((Class376_Sub7_Sub5) this).aShort9626,
							((Class376_Sub7_Sub5) this).aShort9624,
							((Class376_Sub7_Sub5) this).aShort9629,
							((Class376_Sub7_Sub5) this).aShort9620);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("lc.BA(" + i + ','
						+ (class206 != null ? "{...}" : "null") + ','
						+ (class33 != null ? "{...}" : "null") + ','
						+ (class163 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final boolean method2862(int i) {
		try {
			if (i > -103)
				aClass281_10072 = null;
			anInt10075++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lc.W(" + i + ')');
		}
	}

	final void method2874(byte i, Class163 class163) {
		try {
			anInt10076++;
			Class206 class206 = method3916(0, anInt10058, 113, class163);
			if (class206 != null) {
				Class33 class33 = class163.method1048();
				class33.method301(((Class376_Sub7) this).anInt7045,
						((Class376_Sub7) this).anInt7036,
						((Class376_Sub7) this).anInt7031);
				method3919((byte) 49, class206, class33, class163);
			}
			int i_23_ = -125 % ((i - 18) / 40);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lc.K(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}
}
