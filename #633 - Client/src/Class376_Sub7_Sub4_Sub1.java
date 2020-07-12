/* Class376_Sub7_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class376_Sub7_Sub4_Sub1 extends Class376_Sub7_Sub4 implements
		Interface13 {
	private Class206 aClass206_9920;
	private Class212 aClass212_9921;
	static int anInt9922;
	static int anInt9923;
	private boolean aBool9924;
	private boolean aBool9925;
	static int anInt9926;
	static int anInt9927;
	static int anInt9928;
	static int anInt9929;
	static int anInt9930;
	private Class11_Sub45_Sub1 aClass11_Sub45_Sub1_9931;
	static int anInt9932;
	private byte aByte9933;
	static int anInt9934;
	private short aShort9935;
	static int anInt9936;
	static int anInt9937;
	static int anInt9938;
	static int anInt9939;
	private boolean aBool9940;
	static int anInt9941;
	static Class83 aClass83_9942 = new Class83(3, 5);
	static int anInt9943;
	static int anInt9944;
	static int anInt9945;
	static int anInt9946;
	private byte aByte9947;

	public final int method30(int i) {
		try {
			anInt9943++;
			if (i != 30374)
				method44(null, (byte) -66);
			return aByte9947;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fia.O(" + i + ')');
		}
	}

	Class376_Sub7_Sub4_Sub1(Class163 class163, Class42 class42, int i,
			int i_0_, int i_1_, int i_2_, int i_3_, boolean bool, int i_4_,
			int i_5_, int i_6_, int i_7_) {
		super(i_1_, i_2_, i_3_, i, i_0_, i_4_, i_5_);
		do {
			try {
				((Class376_Sub7) this).anInt7031 = i_3_;
				aBool9924 = ((((Class42) class42).anInt664 ^ 0xffffffff) != -1 && !bool);
				aByte9947 = (byte) i_7_;
				((Class376_Sub7) this).anInt7045 = i_1_;
				aShort9935 = (short) ((Class42) class42).anInt693;
				aByte9933 = (byte) i_6_;
				aBool9925 = bool;
				aBool9940 = (class163.method1084()
						&& ((Class42) class42).aBool634 && !aBool9925 && ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub26_5717
						.method3147(false) != 0);
				Class189 class189 = method3888(class163, aBool9940, 2048,
						(byte) 71);
				if (class189 == null)
					break;
				aClass206_9920 = ((Class189) class189).aClass206_2431;
				aClass11_Sub45_Sub1_9931 = ((Class189) class189).aClass11_Sub45_Sub1_2432;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("fia.<init>("
						+ (class163 != null ? "{...}" : "null") + ','
						+ (class42 != null ? "{...}" : "null") + ',' + i + ','
						+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ','
						+ bool + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ','
						+ i_7_ + ')'));
			}
			break;
		} while (false);
	}

	final Class212 method2860(int i, Class163 class163) {
		try {
			if (i != 0)
				method3890(false);
			anInt9946++;
			if (aClass212_9921 == null)
				aClass212_9921 = (Class236_Sub8.method2879(
						((Class376_Sub7) this).anInt7036,
						method3889(class163, 9757, 0),
						((Class376_Sub7) this).anInt7045,
						((Class376_Sub7) this).anInt7031, (byte) 14));
			return aClass212_9921;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fia.D(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	public final boolean method40(byte i) {
		try {
			anInt9941++;
			if (i <= 82)
				return false;
			return aBool9940;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fia.I(" + i + ')');
		}
	}

	static final int method3887(byte i) {
		try {
			anInt9922++;
			if (i >= -100)
				aClass83_9942 = null;
			if ((OutputStream_Sub1.anInt5845 ^ 0xffffffff) == -2)
				return Class218.anInt3004;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fia.H(" + i + ')');
		}
	}

	final int method2867(int i) {
		try {
			anInt9929++;
			if (i != 32767)
				return 42;
			if (aClass206_9920 != null)
				return aClass206_9920.fa();
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fia.EA(" + i + ')');
		}
	}

	private final Class189 method3888(Class163 class163, boolean bool, int i,
			byte i_8_) {
		try {
			anInt9938++;
			if (i_8_ != 71)
				method3887((byte) 55);
			Class42 class42 = Class11_Sub4.aClass290_5237.method1793((byte) 35,
					aShort9935 & 0xffff);
			Class12 class12;
			Class12 class12_9_;
			if (aBool9925) {
				class12 = Class11_Sub2_Sub38.aClass12Array9796[0];
				class12_9_ = (Class234_Sub1_Sub1.aClass12Array9729[((Class376_Sub7) this).aByte7039]);
			} else {
				if (((Class376_Sub7) this).aByte7039 >= 3)
					class12 = null;
				else
					class12 = (Class11_Sub2_Sub38.aClass12Array9796[1 + ((Class376_Sub7) this).aByte7039]);
				class12_9_ = (Class11_Sub2_Sub38.aClass12Array9796[((Class376_Sub7) this).aByte7039]);
			}
			return class42.method384(i_8_ ^ ~0x19,
					((Class376_Sub7) this).anInt7036, class12_9_, class12,
					bool, aByte9947, ((Class376_Sub7) this).anInt7045,
					((Class376_Sub7) this).anInt7031, class163, i, aByte9933);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fia.N("
					+ (class163 != null ? "{...}" : "null") + ',' + bool + ','
					+ i + ',' + i_8_ + ')'));
		}
	}

	final boolean method2870(boolean bool) {
		try {
			if (bool != false)
				method3889(null, -48, 20);
			anInt9926++;
			if (aClass206_9920 == null)
				return false;
			return aClass206_9920.F();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fia.DA(" + bool + ')');
		}
	}

	final Class376_Sub5 method2876(byte i, Class163 class163) {
		try {
			anInt9927++;
			if (aClass206_9920 == null)
				return null;
			if (i != -127)
				method3889(null, 88, 108);
			Class33 class33 = class163.method1048();
			class33.method301(
					(((Class376_Sub7_Sub4) this).aShort9536 + ((Class376_Sub7) this).anInt7045),
					((Class376_Sub7) this).anInt7036,
					(((Class376_Sub7_Sub4) this).aShort9541 + ((Class376_Sub7) this).anInt7031));
			Class376_Sub5 class376_sub5 = Class11_Sub11.method2370(aBool9924,
					1, 24824);
			do {
				if (!Class11_Sub45_Sub1.aBool8490) {
					aClass206_9920
							.method1321(
									class33,
									(((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[0]),
									0);
					if (!client.aBool10531)
						break;
				}
				aClass206_9920
						.method1329(
								class33,
								(((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[0]),
								Class117.anInt1597, 0);
			} while (false);
			return class376_sub5;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fia.U(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2874(byte i, Class163 class163) {
		try {
			anInt9939++;
			int i_10_ = 27 / ((18 - i) / 40);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fia.K(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	private final Class206 method3889(Class163 class163, int i, int i_11_) {
		try {
			anInt9932++;
			if (i != 9757)
				method2863(-43);
			if (aClass206_9920 != null
					&& (class163.method1065(aClass206_9920.ua(), i_11_) ^ 0xffffffff) == -1)
				return aClass206_9920;
			Class189 class189 = method3888(class163, false, i_11_, (byte) 71);
			if (class189 == null)
				return null;
			return ((Class189) class189).aClass206_2431;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fia.P("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_11_ + ')'));
		}
	}

	public final int method42(byte i) {
		try {
			if (i != -17)
				method2876((byte) 74, null);
			anInt9930++;
			return 0xffff & aShort9935;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fia.A(" + i + ')');
		}
	}

	public final void method41(int i, Class163 class163) {
		do {
			try {
				anInt9937++;
				Object object = null;
				Class11_Sub45_Sub1 class11_sub45_sub1;
				if (aClass11_Sub45_Sub1_9931 != null || !aBool9940) {
					class11_sub45_sub1 = aClass11_Sub45_Sub1_9931;
					aClass11_Sub45_Sub1_9931 = null;
				} else {
					Class189 class189 = method3888(class163, true, 262144,
							(byte) 71);
					class11_sub45_sub1 = (class189 == null ? null
							: ((Class189) class189).aClass11_Sub45_Sub1_2432);
				}
				if (class11_sub45_sub1 != null)
					Class11_Sub45.method3188(class11_sub45_sub1,
							((Class376_Sub7) this).aByte7039,
							((Class376_Sub7) this).anInt7045,
							((Class376_Sub7) this).anInt7031, null);
				if (i > 15)
					break;
				method2874((byte) 125, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("fia.B(" + i + ','
						+ (class163 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public final int method29(byte i) {
		try {
			if (i != -10)
				return 78;
			anInt9923++;
			return aByte9933;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fia.J(" + i + ')');
		}
	}

	final int method2868(byte i) {
		try {
			if (i != 14)
				aBool9940 = false;
			anInt9928++;
			if (aClass206_9920 == null)
				return 0;
			return aClass206_9920.ma();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fia.GA(" + i + ')');
		}
	}

	final boolean method2863(int i) {
		try {
			if (i > -106)
				aClass206_9920 = null;
			anInt9945++;
			if (aClass206_9920 == null)
				return true;
			if (aClass206_9920.r())
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fia.AA(" + i + ')');
		}
	}

	final boolean method2873(Class163 class163, int i, int i_12_, int i_13_) {
		try {
			anInt9944++;
			Class206 class206 = method3889(class163, 9757, 131072);
			if (class206 != null) {
				Class33 class33 = class163.method1048();
				class33.method301(((Class376_Sub7) this).anInt7045,
						((Class376_Sub7) this).anInt7036,
						((Class376_Sub7) this).anInt7031);
				if (Class11_Sub45_Sub1.aBool8490)
					return class206.method1305(i_13_, i_12_, class33, false, 0,
							Class117.anInt1597);
				return class206.method1309(i_13_, i_12_, class33, false, 0);
			}
			if (i != 0)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fia.M("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_12_ + ',' + i_13_ + ')'));
		}
	}

	public final void method44(Class163 class163, byte i) {
		do {
			try {
				if (i != -73)
					method2873(null, 116, -70, -29);
				anInt9936++;
				Object object = null;
				Class11_Sub45_Sub1 class11_sub45_sub1;
				if (aClass11_Sub45_Sub1_9931 == null && aBool9940) {
					Class189 class189 = method3888(class163, true, 262144,
							(byte) 71);
					class11_sub45_sub1 = (class189 == null ? null
							: ((Class189) class189).aClass11_Sub45_Sub1_2432);
				} else {
					class11_sub45_sub1 = aClass11_Sub45_Sub1_9931;
					aClass11_Sub45_Sub1_9931 = null;
				}
				if (class11_sub45_sub1 == null)
					break;
				Class222.method1419(class11_sub45_sub1,
						((Class376_Sub7) this).aByte7039,
						((Class376_Sub7) this).anInt7045,
						((Class376_Sub7) this).anInt7031, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("fia.F(" + (class163 != null ? "{...}" : "null") + ','
								+ i + ')'));
			}
			break;
		} while (false);
	}

	public static void method3890(boolean bool) {
		do {
			try {
				aClass83_9942 = null;
				if (bool == true)
					break;
				aClass83_9942 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "fia.C(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	public final void method43(byte i) {
		do {
			try {
				if (i != -62)
					aBool9940 = false;
				anInt9934++;
				if (aClass206_9920 == null)
					break;
				aClass206_9920.method1306();
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "fia.E(" + i + ')');
			}
			break;
		} while (false);
	}
}
