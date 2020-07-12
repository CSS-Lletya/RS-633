/* Class236_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class236_Sub4 extends Class236 {
	static OutgoingPacket aClass370_6706;
	static int anInt6707;
	static int[] anIntArray6708 = new int[14];
	static int anInt6709;
	static int anInt6710;
	static int anInt6711;
	private boolean aBool6712 = false;
	static int anInt6713;
	static int anInt6714;
	static int anInt6715;
	static int anInt6716;
	private Class337 aClass337_6717;
	static int anInt6718;
	static IncomingPacket aClass160_6719;
	static int anInt6720;

	final void method1508(int i, boolean bool) {
		try {
			((Class236) this).aClass163_Sub3_3222.method3315(false, 8448, 7681);
			if (i == 17660)
				anInt6710++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lf.A(" + i + ','
					+ bool + ')');
		}
	}

	final boolean method1500(byte i) {
		try {
			anInt6707++;
			int i_0_ = 58 % ((i + 9) / 53);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lf.D(" + i + ')');
		}
	}

	final void method1504(int i, int i_1_, Class321 class321) {
		try {
			anInt6714++;
			int i_2_ = 5 % ((i_1_ - 52) / 62);
			((Class236) this).aClass163_Sub3_3222.method3295(class321, 110);
			((Class236) this).aClass163_Sub3_3222.method3260(i, (byte) 17);
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(
							runtimeexception,
							("lf.I(" + i + ',' + i_1_ + ','
									+ (class321 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1505(boolean bool, boolean bool_3_) {
		try {
			anInt6718++;
			Class321_Sub1 class321_sub1 = ((Class236) this).aClass163_Sub3_3222
					.method3298(0);
			if (bool != true)
				method1502(-112);
			if (aClass337_6717 != null && class321_sub1 != null && bool_3_) {
				aClass337_6717.method2026(-119, '\0');
				((Class236) this).aClass163_Sub3_3222.method3253(1, true);
				((Class236) this).aClass163_Sub3_3222.method3295(class321_sub1,
						50);
				OpenGL.glMatrixMode(5890);
				OpenGL.glLoadMatrixf(
						((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aClass33_Sub1_8306
								.method2635((byte) -115), 0);
				OpenGL.glMatrixMode(5888);
				((Class236) this).aClass163_Sub3_3222.method3253(0, true);
				aBool6712 = true;
			} else
				((Class236) this).aClass163_Sub3_3222.method3317(34168, 0, 770,
						(byte) 63);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lf.H(" + bool + ','
					+ bool_3_ + ')');
		}
	}

	public static void method2767(byte i) {
		try {
			aClass160_6719 = null;
			if (i != -85)
				method2768(-76, (byte) -125);
			aClass370_6706 = null;
			anIntArray6708 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lf.L(" + i + ')');
		}
	}

	Class236_Sub4(Class163_Sub3 class163_sub3) {
		super(class163_sub3);
		do {
			try {
				if (!((Class163_Sub3) class163_sub3).aBool8369)
					break;
				aClass337_6717 = new Class337(class163_sub3, 2);
				aClass337_6717.method2028(0, 91);
				((Class236) this).aClass163_Sub3_3222.method3253(1, true);
				((Class236) this).aClass163_Sub3_3222.method3315(false, 34165,
						7681);
				((Class236) this).aClass163_Sub3_3222.method3252((byte) 34, 2,
						770, 34168);
				((Class236) this).aClass163_Sub3_3222.method3317(34167, 0, 770,
						(byte) -128);
				OpenGL.glTexGeni(8192, 9472, 34066);
				OpenGL.glTexGeni(8193, 9472, 34066);
				OpenGL.glTexGeni(8194, 9472, 34066);
				OpenGL.glEnable(3168);
				OpenGL.glEnable(3169);
				OpenGL.glEnable(3170);
				((Class236) this).aClass163_Sub3_3222.method3253(0, true);
				aClass337_6717.method2027(-50135600);
				aClass337_6717.method2028(1, 89);
				((Class236) this).aClass163_Sub3_3222.method3253(1, true);
				((Class236) this).aClass163_Sub3_3222.method3315(false, 8448,
						8448);
				((Class236) this).aClass163_Sub3_3222.method3252((byte) 34, 2,
						770, 34166);
				((Class236) this).aClass163_Sub3_3222.method3317(5890, 0, 770,
						(byte) 104);
				OpenGL.glDisable(3168);
				OpenGL.glDisable(3169);
				OpenGL.glDisable(3170);
				OpenGL.glMatrixMode(5890);
				OpenGL.glLoadIdentity();
				OpenGL.glMatrixMode(5888);
				((Class236) this).aClass163_Sub3_3222.method3253(0, true);
				aClass337_6717.method2027(-50135600);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "lf.<init>("
						+ (class163_sub3 != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	static final boolean method2768(int i, byte i_4_) {
		try {
			if (i_4_ >= -26)
				method2767((byte) 48);
			anInt6713++;
			for (Class11_Sub45_Sub5 class11_sub45_sub5 = ((Class11_Sub45_Sub5) Class94_Sub1.aClass84_5220
					.method584(-12261)); class11_sub45_sub5 != null; class11_sub45_sub5 = ((Class11_Sub45_Sub5) Class94_Sub1.aClass84_5220
					.method578(-15361))) {
				if (Class26.method221(
						((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760,
						(byte) -94)
						&& (((long) i ^ 0xffffffffffffffffL) == (((Class11_Sub45_Sub5) class11_sub45_sub5).aLong8771 ^ 0xffffffffffffffffL)))
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lf.K(" + i + ','
					+ i_4_ + ')');
		}
	}

	final void method1506(int i, int i_5_, int i_6_) {
		do {
			try {
				anInt6709++;
				if (i_5_ >= 72)
					break;
				method1505(true, false);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("lf.B(" + i + ','
						+ i_5_ + ',' + i_6_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1502(int i) {
		try {
			anInt6711++;
			if (i < 74)
				aClass160_6719 = null;
			do {
				if (!aBool6712) {
					((Class236) this).aClass163_Sub3_3222.method3317(5890, 0,
							770, (byte) 122);
					if (!client.aBool10531)
						break;
				}
				aClass337_6717.method2026(-103, '\001');
				((Class236) this).aClass163_Sub3_3222.method3253(1, true);
				((Class236) this).aClass163_Sub3_3222.method3295(null, 61);
				((Class236) this).aClass163_Sub3_3222.method3253(0, true);
			} while (false);
			((Class236) this).aClass163_Sub3_3222.method3315(false, 8448, 8448);
			aBool6712 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lf.C(" + i + ')');
		}
	}

	static final void method2769(int i) {
		do {
			try {
				anInt6716++;
				for (Class11_Sub26 class11_sub26 = ((Class11_Sub26) Class111.aClass213_1522
						.method1365(24490)); class11_sub26 != null; class11_sub26 = ((Class11_Sub26) Class111.aClass213_1522
						.method1367((byte) 71))) {
					if (!((Class11_Sub26) class11_sub26).aBool6293)
						Class46.method404(
								(((Class11_Sub26) class11_sub26).anInt6297),
								(byte) 84);
					else
						((Class11_Sub26) class11_sub26).aBool6293 = false;
				}
				if (i < -41)
					break;
				aClass160_6719 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "lf.J(" + i + ')');
			}
			break;
		} while (false);
	}

	static {
		aClass370_6706 = new OutgoingPacket(42, 2);
		anInt6720 = 1;
		aClass160_6719 = new IncomingPacket(49, -1);
	}
}
