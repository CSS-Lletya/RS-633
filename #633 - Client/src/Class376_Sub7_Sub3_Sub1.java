/* Class376_Sub7_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class376_Sub7_Sub3_Sub1 extends Class376_Sub7_Sub3 implements
		Interface13 {
	static int anInt9838;
	static int anInt9839;
	static int anInt9840;
	static int anInt9841;
	private Class11_Sub45_Sub1 aClass11_Sub45_Sub1_9842;
	static int anInt9843;
	static int anInt9844;
	static Class282 aClass282_9845 = new Class282();
	static int anInt9846;
	static Class11_Sub17 aClass11_Sub17_9847;
	static int anInt9848;
	static int anInt9849;
	private boolean aBool9850;
	static int anInt9851;
	private boolean aBool9852;
	static int anInt9853;
	private boolean aBool9854;
	private short aShort9855;
	Class206 aClass206_9856;
	private byte aByte9857;
	static int anInt9858;
	static int anInt9859;
	static int anInt9860;
	private boolean aBool9861;
	static int anInt9862;
	static int anInt9863 = 0;
	static int anInt9864;
	static int anInt9865;
	static int anInt9866;
	static int anInt9867;
	private Class212 aClass212_9868;
	static int anInt9869;
	static int anInt9870;
	private byte aByte9871;

	final void method2871(boolean bool, Class163 class163, int i, int i_0_,
			Class376_Sub7 class376_sub7, int i_1_, int i_2_) {
		do {
			try {
				if (i_1_ != 22501)
					aBool9852 = false;
				anInt9840++;
				if (class376_sub7 instanceof Class376_Sub7_Sub3_Sub1) {
					Class376_Sub7_Sub3_Sub1 class376_sub7_sub3_sub1_3_ = (Class376_Sub7_Sub3_Sub1) class376_sub7;
					if (((Class376_Sub7_Sub3_Sub1) this).aClass206_9856 != null
							&& ((Class376_Sub7_Sub3_Sub1) class376_sub7_sub3_sub1_3_).aClass206_9856 != null)
						((Class376_Sub7_Sub3_Sub1) this).aClass206_9856
								.method1311(
										((Class376_Sub7_Sub3_Sub1) class376_sub7_sub3_sub1_3_).aClass206_9856,
										i_2_, i, i_0_, bool);
				} else {
					if (!(class376_sub7 instanceof Class376_Sub7_Sub5_Sub4))
						break;
					Class376_Sub7_Sub5_Sub4 class376_sub7_sub5_sub4 = (Class376_Sub7_Sub5_Sub4) class376_sub7;
					if (((Class376_Sub7_Sub3_Sub1) this).aClass206_9856 == null
							|| (((Class376_Sub7_Sub5_Sub4) class376_sub7_sub5_sub4).aClass206_10114) == null)
						break;
					((Class376_Sub7_Sub3_Sub1) this).aClass206_9856
							.method1311(
									(((Class376_Sub7_Sub5_Sub4) class376_sub7_sub5_sub4).aClass206_10114),
									i_2_, i, i_0_, bool);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("nda.G(" + bool
						+ ',' + (class163 != null ? "{...}" : "null") + ',' + i
						+ ',' + i_0_ + ','
						+ (class376_sub7 != null ? "{...}" : "null") + ','
						+ i_1_ + ',' + i_2_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2874(byte i, Class163 class163) {
		try {
			anInt9848++;
			int i_4_ = -36 % ((18 - i) / 40);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nda.K(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	public final int method29(byte i) {
		try {
			anInt9841++;
			if (i != -10)
				method2873(null, 46, -114, -10);
			return aByte9857;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nda.J(" + i + ')');
		}
	}

	private final Class189 method3871(Class163 class163, boolean bool,
			boolean bool_5_, int i) {
		try {
			if (bool_5_ != true)
				aShort9855 = (short) -108;
			anInt9860++;
			Class42 class42 = Class11_Sub4.aClass290_5237.method1793(
					(byte) 111, 0xffff & aShort9855);
			Class12 class12;
			Class12 class12_6_;
			if (aBool9850) {
				class12_6_ = Class11_Sub2_Sub38.aClass12Array9796[0];
				class12 = (Class234_Sub1_Sub1.aClass12Array9729[((Class376_Sub7) this).aByte7039]);
			} else {
				class12 = (Class11_Sub2_Sub38.aClass12Array9796[((Class376_Sub7) this).aByte7039]);
				if ((((Class376_Sub7) this).aByte7039 ^ 0xffffffff) > -4)
					class12_6_ = (Class11_Sub2_Sub38.aClass12Array9796[((Class376_Sub7) this).aByte7039 + 1]);
				else
					class12_6_ = null;
			}
			return class42.method384(-111, ((Class376_Sub7) this).anInt7036,
					class12, class12_6_, bool, aByte9871,
					((Class376_Sub7) this).anInt7045,
					((Class376_Sub7) this).anInt7031, class163, i, aByte9857);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nda.C("
					+ (class163 != null ? "{...}" : "null") + ',' + bool + ','
					+ bool_5_ + ',' + i + ')'));
		}
	}

	final void method2872(int i) {
		do {
			try {
				anInt9851++;
				if (i != 26062)
					aBool9850 = true;
				aBool9861 = false;
				if (((Class376_Sub7_Sub3_Sub1) this).aClass206_9856 == null)
					break;
				((Class376_Sub7_Sub3_Sub1) this).aClass206_9856.s(~0x10000
						& ((Class376_Sub7_Sub3_Sub1) this).aClass206_9856.ua());
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "nda.L(" + i + ')');
			}
			break;
		} while (false);
	}

	private final Class206 method3872(int i, int i_7_, Class163 class163) {
		try {
			if (i_7_ >= -73)
				return null;
			anInt9869++;
			if (((Class376_Sub7_Sub3_Sub1) this).aClass206_9856 != null
					&& (class163.method1065(
							((Class376_Sub7_Sub3_Sub1) this).aClass206_9856
									.ua(), i) ^ 0xffffffff) == -1)
				return ((Class376_Sub7_Sub3_Sub1) this).aClass206_9856;
			Class189 class189 = method3871(class163, false, true, i);
			if (class189 == null)
				return null;
			return ((Class189) class189).aClass206_2431;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(
							runtimeexception,
							("nda.N(" + i + ',' + i_7_ + ','
									+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	public final void method44(Class163 class163, byte i) {
		do {
			try {
				anInt9859++;
				if (i != -73)
					aBool9861 = true;
				Object object = null;
				Class11_Sub45_Sub1 class11_sub45_sub1;
				if (aClass11_Sub45_Sub1_9842 != null || !aBool9854) {
					class11_sub45_sub1 = aClass11_Sub45_Sub1_9842;
					aClass11_Sub45_Sub1_9842 = null;
				} else {
					Class189 class189 = method3871(class163, true, true, 262144);
					class11_sub45_sub1 = (class189 != null ? ((Class189) class189).aClass11_Sub45_Sub1_2432
							: null);
				}
				if (class11_sub45_sub1 == null)
					break;
				Class222.method1419(class11_sub45_sub1,
						((Class376_Sub7) this).aByte7039,
						((Class376_Sub7) this).anInt7045,
						((Class376_Sub7) this).anInt7031, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("nda.F(" + (class163 != null ? "{...}" : "null") + ','
								+ i + ')'));
			}
			break;
		} while (false);
	}

	final boolean method2873(Class163 class163, int i, int i_8_, int i_9_) {
		try {
			anInt9866++;
			Class206 class206 = method3872(131072, -86, class163);
			if (class206 != null) {
				Class33 class33 = class163.method1048();
				class33.method301(((Class376_Sub7) this).anInt7045,
						((Class376_Sub7) this).anInt7036,
						((Class376_Sub7) this).anInt7031);
				if (!Class11_Sub45_Sub1.aBool8490)
					return class206.method1309(i_9_, i_8_, class33, false, 0);
				return class206.method1305(i_9_, i_8_, class33, false, 0,
						Class117.anInt1597);
			}
			if (i != 0)
				return false;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nda.M("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_8_ + ',' + i_9_ + ')'));
		}
	}

	final Class212 method2860(int i, Class163 class163) {
		try {
			if (i != 0)
				((Class376_Sub7_Sub3_Sub1) this).aClass206_9856 = null;
			anInt9864++;
			if (aClass212_9868 == null)
				aClass212_9868 = (Class236_Sub8.method2879(
						((Class376_Sub7) this).anInt7036,
						method3872(0, -105, class163),
						((Class376_Sub7) this).anInt7045,
						((Class376_Sub7) this).anInt7031, (byte) 14));
			return aClass212_9868;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nda.D(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	final Class376_Sub5 method2876(byte i, Class163 class163) {
		try {
			anInt9843++;
			if (((Class376_Sub7_Sub3_Sub1) this).aClass206_9856 == null)
				return null;
			if (i != -127)
				aBool9861 = false;
			Class33 class33 = class163.method1048();
			class33.method301(((Class376_Sub7) this).anInt7045,
					((Class376_Sub7) this).anInt7036,
					((Class376_Sub7) this).anInt7031);
			Class376_Sub5 class376_sub5 = Class11_Sub11.method2370(aBool9852,
					1, 24824);
			do {
				if (!Class11_Sub45_Sub1.aBool8490) {
					((Class376_Sub7_Sub3_Sub1) this).aClass206_9856
							.method1321(
									class33,
									(((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[0]),
									0);
					if (!client.aBool10531)
						break;
				}
				((Class376_Sub7_Sub3_Sub1) this).aClass206_9856
						.method1329(
								class33,
								(((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[0]),
								Class117.anInt1597, 0);
			} while (false);
			return class376_sub5;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nda.U(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	public final void method41(int i, Class163 class163) {
		do {
			try {
				anInt9853++;
				Object object = null;
				if (i <= 15)
					anInt9863 = -71;
				Class11_Sub45_Sub1 class11_sub45_sub1;
				if (aClass11_Sub45_Sub1_9842 == null && aBool9854) {
					Class189 class189 = method3871(class163, true, true, 262144);
					class11_sub45_sub1 = (class189 == null ? null
							: ((Class189) class189).aClass11_Sub45_Sub1_2432);
				} else {
					class11_sub45_sub1 = aClass11_Sub45_Sub1_9842;
					aClass11_Sub45_Sub1_9842 = null;
				}
				if (class11_sub45_sub1 == null)
					break;
				Class11_Sub45.method3188(class11_sub45_sub1,
						((Class376_Sub7) this).aByte7039,
						((Class376_Sub7) this).anInt7045,
						((Class376_Sub7) this).anInt7031, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("nda.B(" + i + ','
						+ (class163 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public final int method30(int i) {
		try {
			anInt9862++;
			if (i != 30374)
				aClass282_9845 = null;
			return aByte9871;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nda.O(" + i + ')');
		}
	}

	public static void method3873(int i) {
		try {
			aClass11_Sub17_9847 = null;
			if (i >= -97)
				anInt9863 = -96;
			aClass282_9845 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nda.H(" + i + ')');
		}
	}

	public final int method42(byte i) {
		try {
			if (i != -17)
				((Class376_Sub7_Sub3_Sub1) this).aClass206_9856 = null;
			anInt9838++;
			return aShort9855 & 0xffff;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nda.A(" + i + ')');
		}
	}

	public final boolean method40(byte i) {
		try {
			if (i < 82)
				return true;
			anInt9865++;
			return aBool9854;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nda.I(" + i + ')');
		}
	}

	final int method2867(int i) {
		try {
			if (i != 32767)
				return 40;
			anInt9839++;
			if (((Class376_Sub7_Sub3_Sub1) this).aClass206_9856 == null)
				return 0;
			return ((Class376_Sub7_Sub3_Sub1) this).aClass206_9856.fa();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nda.EA(" + i + ')');
		}
	}

	final boolean method2863(int i) {
		try {
			anInt9858++;
			if (i >= -106)
				aShort9855 = (short) 122;
			if (((Class376_Sub7_Sub3_Sub1) this).aClass206_9856 == null)
				return true;
			if (((Class376_Sub7_Sub3_Sub1) this).aClass206_9856.r())
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nda.AA(" + i + ')');
		}
	}

	Class376_Sub7_Sub3_Sub1(Class163 class163, Class42 class42, int i,
			int i_10_, int i_11_, int i_12_, int i_13_, boolean bool,
			int i_14_, int i_15_, boolean bool_16_) {
		super(i_11_, i_12_, i_13_, i, i_10_, Class362.method2146(-30231, i_14_,
				i_15_));
		do {
			try {
				aBool9861 = bool_16_;
				aBool9852 = ((Class42) class42).anInt664 != 0 && !bool;
				aByte9857 = (byte) i_14_;
				((Class376_Sub7) this).anInt7045 = i_11_;
				((Class376_Sub7) this).anInt7031 = i_13_;
				aByte9871 = (byte) i_15_;
				aBool9850 = bool;
				aShort9855 = (short) ((Class42) class42).anInt693;
				aBool9854 = (class163.method1084()
						&& ((Class42) class42).aBool634 && !aBool9850 && (((Class11_Sub17) aClass11_Sub17_9847).aClass108_Sub26_5717
						.method3147(false) ^ 0xffffffff) != -1);
				int i_17_ = 2048;
				if (aBool9861)
					i_17_ |= 0x10000;
				Class189 class189 = method3871(class163, aBool9854, true, i_17_);
				if (class189 == null)
					break;
				aClass11_Sub45_Sub1_9842 = ((Class189) class189).aClass11_Sub45_Sub1_2432;
				((Class376_Sub7_Sub3_Sub1) this).aClass206_9856 = ((Class189) class189).aClass206_2431;
				if (!aBool9861)
					break;
				((Class376_Sub7_Sub3_Sub1) this).aClass206_9856 = ((Class376_Sub7_Sub3_Sub1) this).aClass206_9856
						.method1313((byte) 0, i_17_, false);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("nda.<init>(" + (class163 != null ? "{...}" : "null")
								+ ',' + (class42 != null ? "{...}" : "null")
								+ ',' + i + ',' + i_10_ + ',' + i_11_ + ','
								+ i_12_ + ',' + i_13_ + ',' + bool + ','
								+ i_14_ + ',' + i_15_ + ',' + bool_16_ + ')'));
			}
			break;
		} while (false);
	}

	final int method2868(byte i) {
		try {
			if (i != 14)
				method2876((byte) 56, null);
			anInt9846++;
			if (((Class376_Sub7_Sub3_Sub1) this).aClass206_9856 != null)
				return ((Class376_Sub7_Sub3_Sub1) this).aClass206_9856.ma();
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nda.GA(" + i + ')');
		}
	}

	public final void method43(byte i) {
		try {
			if (i != -62)
				aClass11_Sub17_9847 = null;
			if (((Class376_Sub7_Sub3_Sub1) this).aClass206_9856 != null)
				((Class376_Sub7_Sub3_Sub1) this).aClass206_9856.method1306();
			anInt9844++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nda.E(" + i + ')');
		}
	}

	final boolean method2870(boolean bool) {
		try {
			anInt9870++;
			if (bool != false)
				method2867(-127);
			if (((Class376_Sub7_Sub3_Sub1) this).aClass206_9856 != null)
				return ((Class376_Sub7_Sub3_Sub1) this).aClass206_9856.F();
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nda.DA(" + bool + ')');
		}
	}

	final boolean method2862(int i) {
		try {
			anInt9849++;
			if (i >= -103)
				aClass11_Sub17_9847 = null;
			return aBool9861;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nda.W(" + i + ')');
		}
	}
}
