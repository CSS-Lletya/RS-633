/* Class376_Sub7_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class376_Sub7_Sub3_Sub2 extends Class376_Sub7_Sub3 implements
		Interface13 {
	static int anInt10135;
	static int anInt10136;
	private boolean aBool10137;
	static int anInt10138;
	private boolean aBool10139 = false;
	static int anInt10140;
	static int anInt10141;
	static int anInt10142;
	static int anInt10143;
	static int anInt10144;
	static boolean aBool10145 = false;
	static int anInt10146;
	static int anInt10147;
	Class50 aClass50_10148;
	static int anInt10149;
	static int anInt10150;
	static int anInt10151;
	static int anInt10152;
	static int anInt10153;
	private Class212 aClass212_10154;
	static int anInt10155;
	static int anInt10156;
	static int anInt10157;
	static int anInt10158;
	static int anInt10159;
	static int anInt10160;

	final void method2872(int i) {
		try {
			if (i != 26062)
				method2872(-69);
			anInt10149++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nw.L(" + i + ')');
		}
	}

	public final int method42(byte i) {
		try {
			if (i != -17)
				return 42;
			anInt10155++;
			return (((Class50) ((Class376_Sub7_Sub3_Sub2) this).aClass50_10148).anInt768);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nw.A(" + i + ')');
		}
	}

	Class376_Sub7_Sub3_Sub2(Class163 class163, Class42 class42, int i,
			int i_0_, int i_1_, int i_2_, int i_3_, boolean bool, int i_4_,
			int i_5_, int i_6_) {
		super(i_1_, i_2_, i_3_, i, i_0_, Class11_Sub2_Sub6.method3413(i_4_,
				i_5_, true));
		try {
			((Class376_Sub7_Sub3_Sub2) this).aClass50_10148 = new Class50(
					class163, class42, i_4_, i_5_,
					((Class376_Sub7) this).aByte7047, i_0_, this, bool, i_6_);
			aBool10137 = ((Class42) class42).anInt664 != 0 && !bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nw.<init>("
					+ (class163 != null ? "{...}" : "null") + ','
					+ (class42 != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + bool
					+ ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	public final int method29(byte i) {
		try {
			if (i != -10)
				aBool10145 = true;
			anInt10159++;
			return (((Class50) ((Class376_Sub7_Sub3_Sub2) this).aClass50_10148).anInt767);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nw.J(" + i + ')');
		}
	}

	public final void method43(byte i) {
		try {
			if (i != -62)
				anInt10143 = -102;
			anInt10147++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nw.E(" + i + ')');
		}
	}

	static final void method3926(Class253[] class253s, int i) {
		try {
			Class11_Sub45_Sub11.anInt9153 = class253s.length;
			anInt10136++;
			Class46.aClass253Array722 = new Class253[10 + Class11_Sub45_Sub11.anInt9153];
			Class376_Sub7_Sub5_Sub4.anIntArray10126 = new int[10 + Class11_Sub45_Sub11.anInt9153];
			Class311.method1901(class253s, 0, Class46.aClass253Array722, 0,
					Class11_Sub45_Sub11.anInt9153);
			int i_7_ = 25 % ((-78 - i) / 37);
			for (int i_8_ = 0; ((Class11_Sub45_Sub11.anInt9153 ^ 0xffffffff) < (i_8_ ^ 0xffffffff)); i_8_++)
				Class376_Sub7_Sub5_Sub4.anIntArray10126[i_8_] = Class46.aClass253Array722[i_8_]
						.method1622();
			for (int i_9_ = Class11_Sub45_Sub11.anInt9153; ((i_9_ ^ 0xffffffff) > (Class46.aClass253Array722.length ^ 0xffffffff)); i_9_++)
				Class376_Sub7_Sub5_Sub4.anIntArray10126[i_9_] = 12;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nw.C("
					+ (class253s != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method2874(byte i, Class163 class163) {
		do {
			try {
				anInt10150++;
				int i_10_ = -12 % ((i - 18) / 40);
				Class206 class206 = ((Class376_Sub7_Sub3_Sub2) this).aClass50_10148
						.method424(true, -16386, true, class163, 262144);
				if (class206 == null)
					break;
				int i_11_ = ((Class376_Sub7) this).anInt7045 >> 9;
				int i_12_ = ((Class376_Sub7) this).anInt7031 >> 9;
				Class33 class33 = class163.method1048();
				class33.method301(((Class376_Sub7) this).anInt7045,
						((Class376_Sub7) this).anInt7036,
						((Class376_Sub7) this).anInt7031);
				((Class376_Sub7_Sub3_Sub2) this).aClass50_10148.method427(
						class206, i_11_, false, class163, (byte) 92, class33,
						i_12_, i_11_, i_12_);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("nw.K(" + i + ','
						+ (class163 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public final int method30(int i) {
		try {
			anInt10144++;
			if (i != 30374)
				method3926(null, -63);
			return (((Class50) ((Class376_Sub7_Sub3_Sub2) this).aClass50_10148).anInt763);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nw.O(" + i + ')');
		}
	}

	final boolean method2870(boolean bool) {
		try {
			anInt10138++;
			if (bool != false)
				return false;
			return aBool10139;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nw.DA(" + bool + ')');
		}
	}

	final int method2868(byte i) {
		try {
			if (i != 14)
				return -128;
			anInt10140++;
			return ((Class376_Sub7_Sub3_Sub2) this).aClass50_10148
					.method425(-71);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nw.GA(" + i + ')');
		}
	}

	public final boolean method40(byte i) {
		try {
			if (i < 82)
				return true;
			anInt10158++;
			return ((Class376_Sub7_Sub3_Sub2) this).aClass50_10148.method417(6);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nw.I(" + i + ')');
		}
	}

	public final void method44(Class163 class163, byte i) {
		do {
			try {
				((Class376_Sub7_Sub3_Sub2) this).aClass50_10148.method423(3,
						class163);
				anInt10153++;
				if (i == -73)
					break;
				method40((byte) -15);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("nw.F(" + (class163 != null ? "{...}" : "null") + ','
								+ i + ')'));
			}
			break;
		} while (false);
	}

	final int method2867(int i) {
		try {
			if (i != 32767)
				return -93;
			anInt10142++;
			return ((Class376_Sub7_Sub3_Sub2) this).aClass50_10148
					.method419((byte) 124);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nw.EA(" + i + ')');
		}
	}

	final Class376_Sub5 method2876(byte i, Class163 class163) {
		try {
			anInt10160++;
			Class206 class206 = ((Class376_Sub7_Sub3_Sub2) this).aClass50_10148
					.method424(false, -16386, true, class163, 2048);
			if (class206 == null)
				return null;
			Class33 class33 = class163.method1048();
			class33.method301(((Class376_Sub7) this).anInt7045,
					((Class376_Sub7) this).anInt7036,
					((Class376_Sub7) this).anInt7031);
			Class376_Sub5 class376_sub5 = Class11_Sub11.method2370(aBool10137,
					1, 24824);
			int i_13_ = ((Class376_Sub7) this).anInt7045 >> 9;
			int i_14_ = ((Class376_Sub7) this).anInt7031 >> 9;
			((Class376_Sub7_Sub3_Sub2) this).aClass50_10148.method427(class206,
					i_13_, true, class163, (byte) -125, class33, i_14_, i_13_,
					i_14_);
			if (i != -127)
				return null;
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
			if ((((Class50) ((Class376_Sub7_Sub3_Sub2) this).aClass50_10148).aClass376_Sub10_771) != null) {
				Class116 class116 = ((Class50) ((Class376_Sub7_Sub3_Sub2) this).aClass50_10148).aClass376_Sub10_771
						.method3172();
				if (Class11_Sub45_Sub1.aBool8490)
					class163.method1008(class116, Class117.anInt1597);
				else
					class163.method1010(class116);
			}
			aBool10139 = class206.F()
					|| (((Class50) (((Class376_Sub7_Sub3_Sub2) this).aClass50_10148)).aClass376_Sub10_771) != null;
			if (aClass212_10154 != null)
				Class149.method946(aClass212_10154,
						((Class376_Sub7) this).anInt7036,
						((Class376_Sub7) this).anInt7031,
						((Class376_Sub7) this).anInt7045, (byte) -93, class206);
			else
				aClass212_10154 = (Class236_Sub8.method2879(
						((Class376_Sub7) this).anInt7036, class206,
						((Class376_Sub7) this).anInt7045,
						((Class376_Sub7) this).anInt7031, (byte) 14));
			return class376_sub5;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nw.U(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	public final void method41(int i, Class163 class163) {
		try {
			((Class376_Sub7_Sub3_Sub2) this).aClass50_10148.method422(-1,
					class163);
			if (i <= 15)
				aBool10145 = false;
			anInt10152++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nw.B(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2871(boolean bool, Class163 class163, int i, int i_15_,
			Class376_Sub7 class376_sub7, int i_16_, int i_17_) {
		try {
			if (i_16_ != 22501)
				aBool10139 = true;
			anInt10156++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nw.G(" + bool + ','
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_15_ + ',' + (class376_sub7 != null ? "{...}" : "null")
					+ ',' + i_16_ + ',' + i_17_ + ')'));
		}
	}

	final boolean method2863(int i) {
		try {
			if (i > -106)
				method41(-65, null);
			anInt10135++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nw.AA(" + i + ')');
		}
	}

	final Class212 method2860(int i, Class163 class163) {
		try {
			if (i != 0)
				method40((byte) -78);
			anInt10157++;
			return aClass212_10154;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nw.D(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method2862(int i) {
		try {
			anInt10146++;
			if (i >= -103)
				return false;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nw.W(" + i + ')');
		}
	}

	final boolean method2873(Class163 class163, int i, int i_18_, int i_19_) {
		try {
			anInt10151++;
			Class206 class206 = ((Class376_Sub7_Sub3_Sub2) this).aClass50_10148
					.method424(false, i ^ ~0x4001, false, class163, 131072);
			if (class206 == null)
				return false;
			if (i != 0)
				aBool10137 = false;
			Class33 class33 = class163.method1048();
			class33.method301(((Class376_Sub7) this).anInt7045,
					((Class376_Sub7) this).anInt7036,
					((Class376_Sub7) this).anInt7031);
			if (Class11_Sub45_Sub1.aBool8490)
				return class206.method1305(i_19_, i_18_, class33, false, 0,
						Class117.anInt1597);
			return class206.method1309(i_19_, i_18_, class33, false, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nw.M("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_18_ + ',' + i_19_ + ')'));
		}
	}
}
