/* Class376_Sub7_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

final class Class376_Sub7_Sub2_Sub2 extends Class376_Sub7_Sub2 implements
		Interface13 {
	Class50 aClass50_10222;
	static Class347 aClass347_10223;
	static int anInt10224;
	static int anInt10225;
	static boolean aBool10226;
	static int anInt10227;
	static int anInt10228;
	static int anInt10229;
	static int anInt10230;
	static int anInt10231;
	static int anInt10232;
	static int anInt10233;
	private Class212 aClass212_10234;
	static int anInt10235;
	static int anInt10236;
	static int[] anIntArray10237;
	private boolean aBool10238 = false;
	static int anInt10239;
	static int anInt10240;
	static int[] anIntArray10241 = new int[14];
	static int anInt10242;
	static int anInt10243;
	static int anInt10244;
	static int anInt10245;
	static int anInt10246;
	private boolean aBool10247;
	static int anInt10248;
	static int anInt10249;
	static int[] anIntArray10250;

	final boolean method2863(int i) {
		try {
			anInt10224++;
			if (i > -106)
				method3944(null, 93);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ti.AA(" + i + ')');
		}
	}

	final void method2871(boolean bool, Class163 class163, int i, int i_0_,
			Class376_Sub7 class376_sub7, int i_1_, int i_2_) {
		try {
			anInt10228++;
			if (i_1_ != 22501)
				method3945(18);
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ti.G(" + bool + ','
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ',' + (class376_sub7 != null ? "{...}" : "null")
					+ ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	Class376_Sub7_Sub2_Sub2(Class163 class163, Class42 class42, int i,
			int i_3_, int i_4_, int i_5_, int i_6_, boolean bool, int i_7_,
			int i_8_) {
		super(i_4_, i_5_, i_6_, i, i_3_, ((Class42) class42).anInt607);
		try {
			((Class376_Sub7_Sub2_Sub2) this).aClass50_10222 = new Class50(
					class163, class42, 22, i_7_, i, i_3_, this, bool, i_8_);
			aBool10247 = ((Class42) class42).anInt664 != 0 && !bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ti.<init>("
					+ (class163 != null ? "{...}" : "null") + ','
					+ (class42 != null ? "{...}" : "null") + ',' + i + ','
					+ i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + bool
					+ ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	public final void method41(int i, Class163 class163) {
		try {
			if (i >= 15) {
				anInt10245++;
				((Class376_Sub7_Sub2_Sub2) this).aClass50_10222.method422(-1,
						class163);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ti.B(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method2870(boolean bool) {
		try {
			if (bool != false)
				method2867(4);
			anInt10225++;
			return aBool10238;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ti.DA(" + bool + ')');
		}
	}

	final Class376_Sub5 method2876(byte i, Class163 class163) {
		try {
			anInt10244++;
			Class206 class206 = ((Class376_Sub7_Sub2_Sub2) this).aClass50_10222
					.method424(false, -16386, true, class163, 2048);
			if (class206 == null)
				return null;
			Class33 class33 = class163.method1048();
			class33.method301(((Class376_Sub7) this).anInt7045,
					((Class376_Sub7) this).anInt7036,
					((Class376_Sub7) this).anInt7031);
			Class376_Sub5 class376_sub5 = Class11_Sub11.method2370(aBool10247,
					1, 24824);
			if (i != -127)
				method43((byte) 25);
			int i_9_ = ((Class376_Sub7) this).anInt7045 >> 9;
			int i_10_ = ((Class376_Sub7) this).anInt7031 >> 9;
			((Class376_Sub7_Sub2_Sub2) this).aClass50_10222.method427(class206,
					i_9_, true, class163, (byte) 76, class33, i_10_, i_9_,
					i_10_);
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
			if ((((Class50) ((Class376_Sub7_Sub2_Sub2) this).aClass50_10222).aClass376_Sub10_771) != null) {
				Class116 class116 = ((Class50) ((Class376_Sub7_Sub2_Sub2) this).aClass50_10222).aClass376_Sub10_771
						.method3172();
				if (Class11_Sub45_Sub1.aBool8490)
					class163.method1008(class116, Class117.anInt1597);
				else
					class163.method1010(class116);
			}
			aBool10238 = class206.F()
					|| (((Class50) (((Class376_Sub7_Sub2_Sub2) this).aClass50_10222)).aClass376_Sub10_771) != null;
			if (aClass212_10234 != null)
				Class149.method946(aClass212_10234,
						((Class376_Sub7) this).anInt7036,
						((Class376_Sub7) this).anInt7031,
						((Class376_Sub7) this).anInt7045, (byte) -83, class206);
			else
				aClass212_10234 = (Class236_Sub8.method2879(
						((Class376_Sub7) this).anInt7036, class206,
						((Class376_Sub7) this).anInt7045,
						((Class376_Sub7) this).anInt7031, (byte) 14));
			return class376_sub5;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ti.U(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	public final boolean method40(byte i) {
		try {
			if (i < 82)
				method3944(null, 21);
			anInt10233++;
			return ((Class376_Sub7_Sub2_Sub2) this).aClass50_10222
					.method417(-67);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ti.I(" + i + ')');
		}
	}

	final int method2867(int i) {
		try {
			if (i != 32767)
				method2867(-117);
			anInt10229++;
			return ((Class376_Sub7_Sub2_Sub2) this).aClass50_10222
					.method419((byte) -1);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ti.EA(" + i + ')');
		}
	}

	final int method2868(byte i) {
		try {
			if (i != 14)
				aClass212_10234 = null;
			anInt10243++;
			return ((Class376_Sub7_Sub2_Sub2) this).aClass50_10222
					.method425(-112);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ti.GA(" + i + ')');
		}
	}

	public final void method43(byte i) {
		do {
			try {
				anInt10230++;
				if (i == -62)
					break;
				aClass347_10223 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ti.E(" + i + ')');
			}
			break;
		} while (false);
	}

	public final int method29(byte i) {
		try {
			anInt10227++;
			if (i != -10)
				method2871(false, null, 4, 13, null, -8, -50);
			return (((Class50) ((Class376_Sub7_Sub2_Sub2) this).aClass50_10222).anInt767);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ti.J(" + i + ')');
		}
	}

	final void method2874(byte i, Class163 class163) {
		try {
			anInt10240++;
			Class206 class206 = ((Class376_Sub7_Sub2_Sub2) this).aClass50_10222
					.method424(true, -16386, true, class163, 262144);
			if (class206 != null) {
				int i_11_ = ((Class376_Sub7) this).anInt7045 >> 9;
				int i_12_ = ((Class376_Sub7) this).anInt7031 >> 9;
				Class33 class33 = class163.method1048();
				class33.method301(((Class376_Sub7) this).anInt7045,
						((Class376_Sub7) this).anInt7036,
						((Class376_Sub7) this).anInt7031);
				((Class376_Sub7_Sub2_Sub2) this).aClass50_10222.method427(
						class206, i_11_, false, class163, (byte) -125, class33,
						i_12_, i_11_, i_12_);
			}
			int i_13_ = 51 % ((i - 18) / 40);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ti.K(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	public final int method42(byte i) {
		try {
			if (i != -17)
				anInt10242 = -22;
			anInt10236++;
			return (((Class50) ((Class376_Sub7_Sub2_Sub2) this).aClass50_10222).anInt768);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ti.A(" + i + ')');
		}
	}

	public final int method30(int i) {
		try {
			anInt10249++;
			if (i != 30374)
				method2862(-62);
			return (((Class50) ((Class376_Sub7_Sub2_Sub2) this).aClass50_10222).anInt763);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ti.O(" + i + ')');
		}
	}

	static final void method3944(Class163 class163, int i) {
		try {
			anInt10239++;
			if (i != 18975)
				aBool10226 = false;
			if (Class352.aClass84_4630.method583(i - 18952) != 0) {
				if ((((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5696
						.method3181(false) ^ 0xffffffff) == -1) {
					for (Class11_Sub33 class11_sub33 = ((Class11_Sub33) Class352.aClass84_4630
							.method584(i ^ ~0x65fb)); class11_sub33 != null; class11_sub33 = (Class11_Sub33) Class352.aClass84_4630
							.method578(i ^ ~0x761f)) {
						Packet.aClass223_8723
								.method1426(
										((Class11_Sub33) class11_sub33).anInt6896,
										((Class11_Sub33) class11_sub33).anInt6898,
										false,
										((Class11_Sub33) class11_sub33).anInt6900,
										class163,
										Class298.aClass107_4028,
										(!((Class11_Sub33) class11_sub33).aBool6894 ? null
												: (((Player) (Class11_Sub2_Sub8.myPlayer)).aClass258_10418)),
										((Class11_Sub33) class11_sub33).anInt6901,
										((Class11_Sub33) class11_sub33).anInt6903,
										false, class163, false);
						class11_sub33.method122(-62);
					}
					Class307.method1879(-101);
				} else {
					if (Class186.aClass163_2375 == null) {
						Canvas canvas = new Canvas();
						canvas.setSize(36, 32);
						Class186.aClass163_2375 = NPCDefinitions.method1385(
								Class11_Sub31.aClass146_6703,
								Class24.anInterface1_252, 0, canvas, 0,
								(byte) -72);
						Class196.aClass107_2663 = (Class186.aClass163_2375
								.method1060(
										Class193.method1264((byte) -117, 0,
												(Class11_Sub18.aClass146_5781),
												(Class11_Sub45_Sub14.anInt9318)),
										Class80.method543(
												Class108_Sub7.aClass146_5636,
												(Class11_Sub45_Sub14.anInt9318),
												0), true));
					}
					for (Class11_Sub33 class11_sub33 = ((Class11_Sub33) Class352.aClass84_4630
							.method584(-12261)); class11_sub33 != null; class11_sub33 = ((Class11_Sub33) Class352.aClass84_4630
							.method578(-15361))) {
						Packet.aClass223_8723
								.method1426(
										((Class11_Sub33) class11_sub33).anInt6896,
										((Class11_Sub33) class11_sub33).anInt6898,
										false,
										((Class11_Sub33) class11_sub33).anInt6900,
										class163,
										Class196.aClass107_2663,
										(((Class11_Sub33) class11_sub33).aBool6894 ? (((Player) (Class11_Sub2_Sub8.myPlayer)).aClass258_10418)
												: null),
										((Class11_Sub33) class11_sub33).anInt6901,
										((Class11_Sub33) class11_sub33).anInt6903,
										false, Class186.aClass163_2375, false);
						class11_sub33.method122(-94);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ti.H("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final boolean method2862(int i) {
		try {
			anInt10235++;
			if (i > -103)
				method2876((byte) -62, null);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ti.W(" + i + ')');
		}
	}

	final Class212 method2860(int i, Class163 class163) {
		try {
			anInt10248++;
			if (i != 0)
				return null;
			return aClass212_10234;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ti.D(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3945(int i) {
		do {
			try {
				anIntArray10241 = null;
				anIntArray10250 = null;
				aClass347_10223 = null;
				anIntArray10237 = null;
				if (i <= -113)
					break;
				anInt10242 = -45;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ti.N(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method2873(Class163 class163, int i, int i_14_, int i_15_) {
		try {
			if (i != 0)
				return true;
			anInt10232++;
			Class206 class206 = ((Class376_Sub7_Sub2_Sub2) this).aClass50_10222
					.method424(false, -16386, false, class163, 131072);
			if (class206 == null)
				return false;
			Class33 class33 = class163.method1048();
			class33.method301(((Class376_Sub7) this).anInt7045,
					((Class376_Sub7) this).anInt7036,
					((Class376_Sub7) this).anInt7031);
			if (!Class11_Sub45_Sub1.aBool8490)
				return class206.method1309(i_15_, i_14_, class33, false, 0);
			return class206.method1305(i_15_, i_14_, class33, false, 0,
					Class117.anInt1597);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ti.M("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_14_ + ',' + i_15_ + ')'));
		}
	}

	public final void method44(Class163 class163, byte i) {
		try {
			anInt10246++;
			if (i == -73)
				((Class376_Sub7_Sub2_Sub2) this).aClass50_10222.method423(i
						^ ~0x4b, class163);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ti.F("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method2872(int i) {
		try {
			anInt10231++;
			if (i == 26062)
				throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ti.L(" + i + ')');
		}
	}

	static {
		aBool10226 = false;
		anIntArray10237 = new int[14];
		aClass347_10223 = new Class347("WTWIP", 3);
	}
}
