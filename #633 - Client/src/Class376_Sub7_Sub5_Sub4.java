/* Class376_Sub7_Sub5_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class376_Sub7_Sub5_Sub4 extends Class376_Sub7_Sub5 implements
		Interface13 {
	static int anInt10102;
	static int anInt10103;
	static int anInt10104;
	static int anInt10105;
	static int anInt10106;
	static int anInt10107;
	private Class212 aClass212_10108;
	static int anInt10109;
	private boolean aBool10110;
	static int anInt10111;
	private Class11_Sub45_Sub1 aClass11_Sub45_Sub1_10112;
	static int anInt10113;
	Class206 aClass206_10114;
	private byte aByte10115;
	static int anInt10116;
	static int anInt10117;
	private byte aByte10118;
	static int anInt10119;
	private boolean aBool10120;
	private boolean aBool10121;
	static int anInt10122;
	static int anInt10123;
	static int anInt10124;
	static int anInt10125;
	static int[] anIntArray10126;
	static int anInt10127;
	private boolean aBool10128;
	private short aShort10129;
	static int anInt10130;
	static Class213 aClass213_10131 = new Class213(16);
	static int anInt10132;
	static int anInt10133;
	static int anInt10134;

	final boolean method2873(Class163 class163, int i, int i_0_, int i_1_) {
		try {
			anInt10109++;
			if (i != 0)
				aShort10129 = (short) -68;
			Class206 class206 = method3924(131072, class163, i - 1);
			if (class206 != null) {
				Class33 class33 = class163.method1048();
				class33.method301(((Class376_Sub7) this).anInt7045,
						((Class376_Sub7) this).anInt7036,
						((Class376_Sub7) this).anInt7031);
				if (!Class11_Sub45_Sub1.aBool8490)
					return class206.method1309(i_1_, i_0_, class33, false, 0);
				return class206.method1305(i_1_, i_0_, class33, false, 0,
						Class117.anInt1597);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nv.M("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	public final int method30(int i) {
		try {
			if (i != 30374)
				method3922(94);
			anInt10102++;
			return aByte10118;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nv.O(" + i + ')');
		}
	}

	final void method2874(byte i, Class163 class163) {
		try {
			anInt10132++;
			int i_2_ = 59 / ((18 - i) / 40);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nv.K(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	final Class212 method2860(int i, Class163 class163) {
		try {
			if (i != 0)
				return null;
			anInt10117++;
			if (aClass212_10108 == null)
				aClass212_10108 = (Class236_Sub8.method2879(
						((Class376_Sub7) this).anInt7036,
						method3924(0, class163, -1),
						((Class376_Sub7) this).anInt7045,
						((Class376_Sub7) this).anInt7031, (byte) 14));
			return aClass212_10108;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nv.D(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	public final void method43(byte i) {
		do {
			try {
				anInt10111++;
				if (i == -62) {
					if (((Class376_Sub7_Sub5_Sub4) this).aClass206_10114 == null)
						break;
					((Class376_Sub7_Sub5_Sub4) this).aClass206_10114
							.method1306();
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "nv.E(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method3922(int i) {
		try {
			int i_3_ = -33 % ((69 - i) / 56);
			anInt10124++;
			if (((Class376_Sub7_Sub5_Sub4) this).aClass206_10114 != null)
				return (((Class376_Sub7_Sub5_Sub4) this).aClass206_10114.na() / 4);
			return 15;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nv.C(" + i + ')');
		}
	}

	final void method2871(boolean bool, Class163 class163, int i, int i_4_,
			Class376_Sub7 class376_sub7, int i_5_, int i_6_) {
		try {
			if (i_5_ != 22501)
				aClass212_10108 = null;
			if (!(class376_sub7 instanceof Class376_Sub7_Sub3_Sub1)) {
				if (class376_sub7 instanceof Class376_Sub7_Sub5_Sub4) {
					Class376_Sub7_Sub5_Sub4 class376_sub7_sub5_sub4_7_ = (Class376_Sub7_Sub5_Sub4) class376_sub7;
					if ((((Class376_Sub7_Sub5_Sub4) this).aClass206_10114 != null)
							&& (((Class376_Sub7_Sub5_Sub4) class376_sub7_sub5_sub4_7_).aClass206_10114 != null))
						((Class376_Sub7_Sub5_Sub4) this).aClass206_10114
								.method1311(
										((Class376_Sub7_Sub5_Sub4) class376_sub7_sub5_sub4_7_).aClass206_10114,
										i_6_, i, i_4_, bool);
				}
			} else {
				Class376_Sub7_Sub3_Sub1 class376_sub7_sub3_sub1 = (Class376_Sub7_Sub3_Sub1) class376_sub7;
				if (((Class376_Sub7_Sub5_Sub4) this).aClass206_10114 != null
						&& (((Class376_Sub7_Sub3_Sub1) class376_sub7_sub3_sub1).aClass206_9856) != null)
					((Class376_Sub7_Sub5_Sub4) this).aClass206_10114
							.method1311(
									(((Class376_Sub7_Sub3_Sub1) class376_sub7_sub3_sub1).aClass206_9856),
									i_6_, i, i_4_, bool);
			}
			anInt10122++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nv.G(" + bool + ','
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_4_ + ',' + (class376_sub7 != null ? "{...}" : "null")
					+ ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	public final void method44(Class163 class163, byte i) {
		do {
			try {
				if (i != -73)
					aByte10118 = (byte) -100;
				anInt10130++;
				Object object = null;
				Class11_Sub45_Sub1 class11_sub45_sub1;
				if (aClass11_Sub45_Sub1_10112 != null || !aBool10128) {
					class11_sub45_sub1 = aClass11_Sub45_Sub1_10112;
					aClass11_Sub45_Sub1_10112 = null;
				} else {
					Class189 class189 = method3925(262144, true, class163,
							(byte) -121);
					class11_sub45_sub1 = (class189 == null ? null
							: ((Class189) class189).aClass11_Sub45_Sub1_2432);
				}
				if (class11_sub45_sub1 == null)
					break;
				Class222.method1419(class11_sub45_sub1,
						((Class376_Sub7) this).aByte7039,
						((Class376_Sub7) this).anInt7045,
						((Class376_Sub7) this).anInt7031, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("nv.F(" + (class163 != null ? "{...}" : "null") + ','
								+ i + ')'));
			}
			break;
		} while (false);
	}

	public final int method29(byte i) {
		try {
			if (i != -10)
				method2876((byte) 121, null);
			anInt10105++;
			return aByte10115;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nv.J(" + i + ')');
		}
	}

	public static void method3923(int i) {
		do {
			try {
				aClass213_10131 = null;
				anIntArray10126 = null;
				if (i >= 71)
					break;
				method3923(4);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "nv.P(" + i + ')');
			}
			break;
		} while (false);
	}

	public final int method42(byte i) {
		try {
			if (i != -17)
				method2860(84, null);
			anInt10127++;
			return aShort10129 & 0xffff;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nv.A(" + i + ')');
		}
	}

	final void method2872(int i) {
		do {
			try {
				anInt10134++;
				if (i != 26062)
					method2872(-16);
				aBool10121 = false;
				if (((Class376_Sub7_Sub5_Sub4) this).aClass206_10114 == null)
					break;
				((Class376_Sub7_Sub5_Sub4) this).aClass206_10114
						.s(~0x10000
								& ((Class376_Sub7_Sub5_Sub4) this).aClass206_10114
										.ua());
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "nv.L(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method2867(int i) {
		try {
			anInt10123++;
			if (i != 32767)
				return -78;
			if (((Class376_Sub7_Sub5_Sub4) this).aClass206_10114 == null)
				return 0;
			return ((Class376_Sub7_Sub5_Sub4) this).aClass206_10114.fa();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nv.EA(" + i + ')');
		}
	}

	final boolean method2863(int i) {
		try {
			anInt10116++;
			if (((Class376_Sub7_Sub5_Sub4) this).aClass206_10114 != null) {
				if (((Class376_Sub7_Sub5_Sub4) this).aClass206_10114.r())
					return false;
				return true;
			}
			if (i > -106)
				aClass213_10131 = null;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nv.AA(" + i + ')');
		}
	}

	public final boolean method40(byte i) {
		try {
			anInt10125++;
			if (i < 82)
				method2871(false, null, -2, -91, null, -5, -47);
			return aBool10128;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nv.I(" + i + ')');
		}
	}

	private final Class206 method3924(int i, Class163 class163, int i_8_) {
		try {
			anInt10133++;
			if (((Class376_Sub7_Sub5_Sub4) this).aClass206_10114 != null
					&& (class163.method1065(
							((Class376_Sub7_Sub5_Sub4) this).aClass206_10114
									.ua(), i) ^ 0xffffffff) == -1)
				return ((Class376_Sub7_Sub5_Sub4) this).aClass206_10114;
			if (i_8_ != -1)
				return null;
			Class189 class189 = method3925(i, false, class163, (byte) -89);
			if (class189 == null)
				return null;
			return ((Class189) class189).aClass206_2431;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("nv.H(" + i + ','
							+ (class163 != null ? "{...}" : "null") + ','
							+ i_8_ + ')'));
		}
	}

	final boolean method2870(boolean bool) {
		try {
			anInt10113++;
			if (bool != false)
				return true;
			if (((Class376_Sub7_Sub5_Sub4) this).aClass206_10114 != null)
				return ((Class376_Sub7_Sub5_Sub4) this).aClass206_10114.F();
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nv.DA(" + bool + ')');
		}
	}

	final Class376_Sub5 method2876(byte i, Class163 class163) {
		try {
			anInt10104++;
			if (((Class376_Sub7_Sub5_Sub4) this).aClass206_10114 == null)
				return null;
			Class33 class33 = class163.method1048();
			class33.method301(((Class376_Sub7) this).anInt7045,
					((Class376_Sub7) this).anInt7036,
					((Class376_Sub7) this).anInt7031);
			if (i != -127)
				method2874((byte) -1, null);
			Class376_Sub5 class376_sub5 = Class11_Sub11.method2370(aBool10120,
					1, i ^ ~0x6086);
			do {
				if (Class11_Sub45_Sub1.aBool8490) {
					((Class376_Sub7_Sub5_Sub4) this).aClass206_10114
							.method1329(
									class33,
									(((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[0]),
									Class117.anInt1597, 0);
					if (!client.aBool10531)
						break;
				}
				((Class376_Sub7_Sub5_Sub4) this).aClass206_10114
						.method1321(
								class33,
								(((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[0]),
								0);
			} while (false);
			return class376_sub5;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nv.U(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	final int method2868(byte i) {
		try {
			if (i != 14)
				aShort10129 = (short) -8;
			anInt10103++;
			if (((Class376_Sub7_Sub5_Sub4) this).aClass206_10114 == null)
				return 0;
			return ((Class376_Sub7_Sub5_Sub4) this).aClass206_10114.ma();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nv.GA(" + i + ')');
		}
	}

	Class376_Sub7_Sub5_Sub4(Class163 class163, Class42 class42, int i,
			int i_9_, int i_10_, int i_11_, int i_12_, boolean bool, int i_13_,
			int i_14_, int i_15_, int i_16_, int i_17_, int i_18_,
			boolean bool_19_) {
		super(i, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, i_16_,
				((Class42) class42).anInt660 == 1, Class11_Sub5.method2313(
						(byte) -32, i_17_, i_18_));
		do {
			try {
				((Class376_Sub7) this).aByte7039 = (byte) i_9_;
				aByte10115 = (byte) i_17_;
				aBool10120 = ((((Class42) class42).anInt664 ^ 0xffffffff) != -1 && !bool);
				aBool10110 = bool;
				aBool10121 = bool_19_;
				aShort10129 = (short) ((Class42) class42).anInt693;
				aByte10118 = (byte) i_18_;
				aBool10128 = (class163.method1084()
						&& ((Class42) class42).aBool634 && !aBool10110 && (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub26_5717
						.method3147(false) ^ 0xffffffff) != -1);
				int i_20_ = 2048;
				if (aBool10121)
					i_20_ |= 0x10000;
				Class189 class189 = method3925(i_20_, aBool10128, class163,
						(byte) 45);
				if (class189 == null)
					break;
				((Class376_Sub7_Sub5_Sub4) this).aClass206_10114 = ((Class189) class189).aClass206_2431;
				aClass11_Sub45_Sub1_10112 = ((Class189) class189).aClass11_Sub45_Sub1_2432;
				if (!aBool10121)
					break;
				((Class376_Sub7_Sub5_Sub4) this).aClass206_10114 = ((Class376_Sub7_Sub5_Sub4) this).aClass206_10114
						.method1313((byte) 0, i_20_, false);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("nv.<init>(" + (class163 != null ? "{...}" : "null")
								+ ',' + (class42 != null ? "{...}" : "null")
								+ ',' + i + ',' + i_9_ + ',' + i_10_ + ','
								+ i_11_ + ',' + i_12_ + ',' + bool + ','
								+ i_13_ + ',' + i_14_ + ',' + i_15_ + ','
								+ i_16_ + ',' + i_17_ + ',' + i_18_ + ','
								+ bool_19_ + ')'));
			}
			break;
		} while (false);
	}

	public final void method41(int i, Class163 class163) {
		do {
			try {
				anInt10107++;
				Object object = null;
				if (i > 15) {
					Class11_Sub45_Sub1 class11_sub45_sub1;
					if (aClass11_Sub45_Sub1_10112 == null && aBool10128) {
						Class189 class189 = method3925(262144, true, class163,
								(byte) 52);
						class11_sub45_sub1 = (class189 == null ? null
								: (((Class189) class189).aClass11_Sub45_Sub1_2432));
					} else {
						class11_sub45_sub1 = aClass11_Sub45_Sub1_10112;
						aClass11_Sub45_Sub1_10112 = null;
					}
					if (class11_sub45_sub1 == null)
						break;
					Class11_Sub45.method3188(class11_sub45_sub1,
							((Class376_Sub7) this).aByte7039,
							((Class376_Sub7) this).anInt7045,
							((Class376_Sub7) this).anInt7031, null);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("nv.B(" + i + ','
						+ (class163 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final boolean method2862(int i) {
		try {
			if (i > -103)
				aBool10121 = false;
			anInt10106++;
			return aBool10121;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nv.W(" + i + ')');
		}
	}

	private final Class189 method3925(int i, boolean bool, Class163 class163,
			byte i_21_) {
		try {
			anInt10119++;
			Class42 class42 = Class11_Sub4.aClass290_5237.method1793(
					(byte) 111, 0xffff & aShort10129);
			int i_22_ = -118 % ((-25 - i_21_) / 61);
			Class12 class12;
			Class12 class12_23_;
			if (aBool10110) {
				class12 = Class11_Sub2_Sub38.aClass12Array9796[0];
				class12_23_ = (Class234_Sub1_Sub1.aClass12Array9729[((Class376_Sub7) this).aByte7039]);
			} else {
				if (((Class376_Sub7) this).aByte7039 >= 3)
					class12 = null;
				else
					class12 = (Class11_Sub2_Sub38.aClass12Array9796[((Class376_Sub7) this).aByte7039 + 1]);
				class12_23_ = (Class11_Sub2_Sub38.aClass12Array9796[((Class376_Sub7) this).aByte7039]);
			}
			return class42.method384(-65, ((Class376_Sub7) this).anInt7036,
					class12_23_, class12, bool,
					(aByte10115 != 11 ? (int) aByte10118 : 4 + aByte10118),
					((Class376_Sub7) this).anInt7045,
					((Class376_Sub7) this).anInt7031, class163, i,
					aByte10115 == 11 ? 10 : aByte10115);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nv.N(" + i + ','
					+ bool + ',' + (class163 != null ? "{...}" : "null") + ','
					+ i_21_ + ')'));
		}
	}
}
