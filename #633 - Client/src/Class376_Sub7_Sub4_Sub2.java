/* Class376_Sub7_Sub4_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class376_Sub7_Sub4_Sub2 extends Class376_Sub7_Sub4 implements
		Interface13 {
	static int anInt10026;
	private Class212 aClass212_10027;
	static int[] anIntArray10028 = new int[1];
	static int anInt10029;
	private boolean aBool10030;
	static int anInt10031;
	static int anInt10032;
	static int anInt10033;
	static int anInt10034;
	static int anInt10035;
	static int anInt10036;
	static int anInt10037;
	static int anInt10038;
	static int anInt10039;
	private boolean aBool10040 = false;
	static int anInt10041;
	static int anInt10042;
	static int anInt10043;
	static int anInt10044;
	static int anInt10045;
	static int anInt10046;
	static int anInt10047;
	Class50 aClass50_10048;
	static int anInt10049;

	public final void method41(int i, Class163 class163) {
		try {
			anInt10026++;
			if (i <= 15)
				aBool10030 = false;
			((Class376_Sub7_Sub4_Sub2) this).aClass50_10048.method422(-1,
					class163);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hw.B(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	public final int method42(byte i) {
		try {
			anInt10043++;
			if (i != -17)
				method41(9, null);
			return (((Class50) ((Class376_Sub7_Sub4_Sub2) this).aClass50_10048).anInt768);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hw.A(" + i + ')');
		}
	}

	final int method2867(int i) {
		try {
			anInt10042++;
			if (i != 32767)
				method3913(null, (byte) -27, null);
			return ((Class376_Sub7_Sub4_Sub2) this).aClass50_10048
					.method419((byte) -17);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hw.EA(" + i + ')');
		}
	}

	final boolean method2873(Class163 class163, int i, int i_0_, int i_1_) {
		try {
			anInt10031++;
			Class206 class206 = ((Class376_Sub7_Sub4_Sub2) this).aClass50_10048
					.method424(false, i - 16386, false, class163, 131072);
			if (class206 == null)
				return false;
			Class33 class33 = class163.method1048();
			if (i != 0)
				((Class376_Sub7_Sub4_Sub2) this).aClass50_10048 = null;
			class33.method301(
					(((Class376_Sub7) this).anInt7045 - -((Class376_Sub7_Sub4) this).aShort9536),
					((Class376_Sub7) this).anInt7036,
					(((Class376_Sub7_Sub4) this).aShort9541 + ((Class376_Sub7) this).anInt7031));
			if (Class11_Sub45_Sub1.aBool8490)
				return class206.method1305(i_1_, i_0_, class33, false, 0,
						Class117.anInt1597);
			return class206.method1309(i_1_, i_0_, class33, false, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hw.M("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final boolean method3911(int i, int i_2_, int i_3_) {
		try {
			anInt10036++;
			if (!Class11_Sub45_Sub20_Sub1.method3893(i ^ ~0x10cb, i_2_, i_3_))
				return false;
			if ((i_2_ & 0xb000 ^ 0xffffffff) != -1
					| Class155.method972(9, i_2_, i_3_)
					| Class173.method1135(i_2_, 58, i_3_))
				return true;
			if (i != 4285)
				method3913(null, (byte) -61, null);
			return ((i_3_ & 0x37) == 0 & (Class351.method2104(100, i_3_, i_2_) | Class254_Sub3
					.method3239(127, i_3_, i_2_)));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hw.P(" + i + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	final boolean method2870(boolean bool) {
		try {
			if (bool != false)
				((Class376_Sub7_Sub4_Sub2) this).aClass50_10048 = null;
			anInt10037++;
			return aBool10040;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hw.DA(" + bool + ')');
		}
	}

	final Class212 method2860(int i, Class163 class163) {
		try {
			if (i != 0)
				method2863(-2);
			anInt10044++;
			return aClass212_10027;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hw.D(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3912(byte i) {
		try {
			if (i > -21)
				anIntArray10028 = null;
			for (int i_4_ = 0; ((Class11_Sub45_Sub10.anInt8958 ^ 0xffffffff) < (i_4_ ^ 0xffffffff)); i_4_++) {
				int i_5_ = (InputStream_Sub2.method2812(i_4_
						- -Class128.anInt1727, (Class11_Sub45_Sub10.anInt8958),
						false) * Class39.anInt556);
				for (int i_6_ = 0; i_6_ < Class39.anInt556; i_6_++) {
					int i_7_ = (InputStream_Sub2.method2812(
							(Class275.anInt3696 + i_6_), Class39.anInt556,
							false) + i_5_);
					if ((Class175.anIntArray2231[i_7_] ^ 0xffffffff) == (Class78.anInt1057 ^ 0xffffffff))
						Class286.anInterface10Array3872[i_7_].method35(0, 0,
								Class11_Sub27.anInt6556,
								Class11_Sub24.anInt6238,
								Class11_Sub27.anInt6556 * i_6_,
								Class11_Sub24.anInt6238 * i_4_, true, true);
				}
			}
			anInt10034++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hw.N(" + i + ')');
		}
	}

	final boolean method2863(int i) {
		try {
			if (i >= -106)
				return true;
			anInt10049++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hw.AA(" + i + ')');
		}
	}

	public final void method44(Class163 class163, byte i) {
		do {
			try {
				((Class376_Sub7_Sub4_Sub2) this).aClass50_10048.method423(3,
						class163);
				anInt10038++;
				if (i == -73)
					break;
				anIntArray10028 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("hw.F(" + (class163 != null ? "{...}" : "null") + ','
								+ i + ')'));
			}
			break;
		} while (false);
	}

	final Class376_Sub5 method2876(byte i, Class163 class163) {
		try {
			anInt10047++;
			if (i != -127)
				return null;
			Class206 class206 = ((Class376_Sub7_Sub4_Sub2) this).aClass50_10048
					.method424(false, -16386, true, class163, 2048);
			if (class206 == null)
				return null;
			Class33 class33 = class163.method1048();
			class33.method301(
					(((Class376_Sub7) this).anInt7045 + ((Class376_Sub7_Sub4) this).aShort9536),
					((Class376_Sub7) this).anInt7036,
					(((Class376_Sub7) this).anInt7031 + ((Class376_Sub7_Sub4) this).aShort9541));
			Class376_Sub5 class376_sub5 = Class11_Sub11.method2370(aBool10030,
					1, i ^ ~0x6086);
			int i_8_ = ((Class376_Sub7) this).anInt7045 >> 9;
			int i_9_ = ((Class376_Sub7) this).anInt7031 >> 9;
			((Class376_Sub7_Sub4_Sub2) this).aClass50_10048.method427(class206,
					i_8_, true, class163, (byte) 36, class33, i_9_, i_8_, i_9_);
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
			if ((((Class50) ((Class376_Sub7_Sub4_Sub2) this).aClass50_10048).aClass376_Sub10_771) != null) {
				Class116 class116 = ((Class50) ((Class376_Sub7_Sub4_Sub2) this).aClass50_10048).aClass376_Sub10_771
						.method3172();
				if (Class11_Sub45_Sub1.aBool8490)
					class163.method1008(class116, Class117.anInt1597);
				else
					class163.method1010(class116);
			}
			aBool10040 = class206.F()
					|| (((Class50) (((Class376_Sub7_Sub4_Sub2) this).aClass50_10048)).aClass376_Sub10_771) != null;
			if (aClass212_10027 == null)
				aClass212_10027 = (Class236_Sub8.method2879(
						((Class376_Sub7) this).anInt7036, class206,
						((Class376_Sub7) this).anInt7045,
						((Class376_Sub7) this).anInt7031, (byte) 14));
			else
				Class149.method946(aClass212_10027,
						((Class376_Sub7) this).anInt7036,
						((Class376_Sub7) this).anInt7031,
						((Class376_Sub7) this).anInt7045, (byte) -102, class206);
			return class376_sub5;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hw.U(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	public final int method30(int i) {
		try {
			anInt10045++;
			if (i != 30374)
				((Class376_Sub7_Sub4_Sub2) this).aClass50_10048 = null;
			return (((Class50) ((Class376_Sub7_Sub4_Sub2) this).aClass50_10048).anInt763);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hw.O(" + i + ')');
		}
	}

	public final void method43(byte i) {
		try {
			if (i != -62)
				((Class376_Sub7_Sub4_Sub2) this).aClass50_10048 = null;
			anInt10046++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hw.E(" + i + ')');
		}
	}

	public final boolean method40(byte i) {
		try {
			anInt10029++;
			if (i < 82)
				aBool10040 = true;
			return ((Class376_Sub7_Sub4_Sub2) this).aClass50_10048
					.method417(109);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hw.I(" + i + ')');
		}
	}

	public final int method29(byte i) {
		try {
			if (i != -10)
				method40((byte) 66);
			anInt10035++;
			return (((Class50) ((Class376_Sub7_Sub4_Sub2) this).aClass50_10048).anInt767);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hw.J(" + i + ')');
		}
	}

	static final void method3913(int[] is, byte i, long[] ls) {
		try {
			if (i != -122)
				method3913(null, (byte) 15, null);
			Class108_Sub11.method2620(852, -1 + ls.length, ls, 0, is);
			anInt10033++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hw.C("
					+ (is != null ? "{...}" : "null") + ',' + i + ','
					+ (ls != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3914(boolean bool) {
		try {
			if (bool != true)
				method3914(true);
			anIntArray10028 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hw.Q(" + bool + ')');
		}
	}

	static final void method3915(int i, int i_10_) {
		try {
			anInt10032++;
			Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
					-652872096, i_10_, i);
			class11_sub45_sub15.method3660(i_10_ - 9);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hw.H(" + i + ','
					+ i_10_ + ')');
		}
	}

	Class376_Sub7_Sub4_Sub2(Class163 class163, Class42 class42, int i,
			int i_11_, int i_12_, int i_13_, int i_14_, boolean bool,
			int i_15_, int i_16_, int i_17_, int i_18_, int i_19_) {
		super(i_12_, i_13_, i_14_, i, i_11_, i_15_, i_16_);
		try {
			((Class376_Sub7_Sub4_Sub2) this).aClass50_10048 = new Class50(
					class163, class42, i_17_, i_18_,
					((Class376_Sub7) this).aByte7047, i_11_, this, bool, i_19_);
			aBool10030 = ((Class42) class42).anInt664 != 0 && !bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hw.<init>("
					+ (class163 != null ? "{...}" : "null") + ','
					+ (class42 != null ? "{...}" : "null") + ',' + i + ','
					+ i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ','
					+ bool + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ','
					+ i_18_ + ',' + i_19_ + ')'));
		}
	}

	final void method2874(byte i, Class163 class163) {
		do {
			try {
				int i_20_ = -52 / ((i - 18) / 40);
				anInt10039++;
				Class206 class206 = ((Class376_Sub7_Sub4_Sub2) this).aClass50_10048
						.method424(false, -16386, true, class163, 262144);
				if (class206 == null)
					break;
				int i_21_ = ((Class376_Sub7) this).anInt7045 >> 9;
				int i_22_ = ((Class376_Sub7) this).anInt7031 >> 9;
				Class33 class33 = class163.method1048();
				class33.method301(((Class376_Sub7) this).anInt7045,
						((Class376_Sub7) this).anInt7036,
						((Class376_Sub7) this).anInt7031);
				((Class376_Sub7_Sub4_Sub2) this).aClass50_10048.method427(
						class206, i_21_, false, class163, (byte) -128, class33,
						i_22_, i_21_, i_22_);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("hw.K(" + i + ','
						+ (class163 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final int method2868(byte i) {
		try {
			anInt10041++;
			if (i != 14)
				method2867(-7);
			return ((Class376_Sub7_Sub4_Sub2) this).aClass50_10048
					.method425(-102);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hw.GA(" + i + ')');
		}
	}
}
