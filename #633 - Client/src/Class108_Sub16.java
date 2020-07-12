/* Class108_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

final class Class108_Sub16 extends Class108 {
	static Applet anApplet6538;
	static int anInt6539;
	static int anInt6540;
	static int anInt6541;
	static Class80 aClass80_6542;
	static int anInt6543;
	static int anInt6544;
	static int anInt6545 = 0;
	static int anInt6546;
	static int anInt6547;
	static int anInt6548;
	static Class253 aClass253_6549;
	static int anInt6550 = 0;
	static int anInt6551 = 0;
	static int anInt6552;

	final boolean method2709(byte i) {
		try {
			anInt6547++;
			if (((Class108) this).aClass11_Sub17_1458.method2456(-18373))
				return false;
			if (i != -53)
				method2710(false);
			if (((Class108) this).aClass11_Sub17_1458.method2454(-21) == Class142.aClass66_1925)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jf.D(" + i + ')');
		}
	}

	final int method2710(boolean bool) {
		try {
			anInt6540++;
			if (bool != false)
				method2713((byte) -80, 36, null, 42);
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jf.B(" + bool + ')');
		}
	}

	public static void method2711(boolean bool) {
		try {
			aClass253_6549 = null;
			if (bool == false) {
				aClass80_6542 = null;
				anApplet6538 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jf.H(" + bool + ')');
		}
	}

	final int method725(byte i) {
		try {
			anInt6544++;
			int i_0_ = -33 % ((i - 70) / 51);
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jf.A(" + i + ')');
		}
	}

	final void method726(boolean bool) {
		do {
			try {
				anInt6548++;
				if (bool != false)
					method721(102, -11);
				do {
					if (((Class108) this).aClass11_Sub17_1458.method2454(-21) == Class142.aClass66_1925) {
						if (!((Class108) this).aClass11_Sub17_1458
								.method2456(-18373))
							break;
						((Class108) this).anInt1459 = 0;
						if (!client.aBool10531)
							break;
					}
					((Class108) this).anInt1459 = 1;
				} while (false);
				if ((((Class108) this).anInt1459 ^ 0xffffffff) == -1
						|| (((Class108) this).anInt1459 ^ 0xffffffff) == -2)
					break;
				((Class108) this).anInt1459 = method725((byte) -111);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "jf.E(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	Class108_Sub16(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}

	final int method721(int i, int i_1_) {
		try {
			anInt6546++;
			if (i_1_ <= 10)
				anInt6539 = -40;
			if (((Class108) this).aClass11_Sub17_1458.method2456(-18373))
				return 3;
			if (((Class108) this).aClass11_Sub17_1458.method2454(-21) == Class142.aClass66_1925) {
				if ((i ^ 0xffffffff) == -1) {
					if ((((Class11_Sub17) ((Class108) this).aClass11_Sub17_1458).aClass108_Sub19_5732
							.method2892(false) ^ 0xffffffff) == -2)
						return 2;
					if (((Class11_Sub17) ((Class108) this).aClass11_Sub17_1458).aClass108_Sub6_5697
							.method2429(false) == 1)
						return 2;
					if ((((Class11_Sub17) ((Class108) this).aClass11_Sub17_1458).aClass108_Sub5_5695
							.method2373(false) ^ 0xffffffff) < -1)
						return 2;
				}
				return 1;
			}
			return 3;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jf.F(" + i + ','
					+ i_1_ + ')');
		}
	}

	static final boolean method2712(String string, int i) {
		try {
			anInt6541++;
			if (i != -17633)
				anApplet6538 = null;
			return Class95.method641((byte) 66, string, 10, true);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jf.I("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method728(int i, int i_2_) {
		do {
			try {
				((Class108) this).anInt1459 = i_2_;
				anInt6552++;
				if (i == 0)
					break;
				method2713((byte) -81, 2, null, -102);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "jf.C(" + i + ','
						+ i_2_ + ')');
			}
			break;
		} while (false);
	}

	Class108_Sub16(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
	}

	static final void method2713(byte i, int i_3_,
			Class11_Sub45_Sub14 class11_sub45_sub14, int i_4_) {
		try {
			anInt6543++;
			if (Class306.aBool4114) {
				int i_5_ = 0;
				for (Class11_Sub45_Sub5 class11_sub45_sub5 = ((Class11_Sub45_Sub5) ((Class11_Sub45_Sub14) class11_sub45_sub14).aClass38_9312
						.method331((byte) -7)); class11_sub45_sub5 != null; class11_sub45_sub5 = ((Class11_Sub45_Sub5) ((Class11_Sub45_Sub14) class11_sub45_sub14).aClass38_9312
						.method333(-103))) {
					int i_6_ = Class278.method1715(4, class11_sub45_sub5);
					if (i_6_ > i_5_)
						i_5_ = i_6_;
				}
				if (i != -82)
					anApplet6538 = null;
				i_5_ += 8;
				int i_7_ = 21 + 16 * (((Class11_Sub45_Sub14) class11_sub45_sub14).anInt9313);
				Class98.anInt1305 = (((Class11_Sub45_Sub14) class11_sub45_sub14).anInt9313 * 16)
						- -(Class254_Sub3.aBool8049 ? 26 : 22);
				int i_8_ = Class205.anInt2757 + Class319.anInt4242;
				if ((i_5_ + i_8_ ^ 0xffffffff) < (Class11_Sub36.anInt7079 ^ 0xffffffff))
					i_8_ = -i_5_ + Class319.anInt4242;
				if ((i_8_ ^ 0xffffffff) > -1)
					i_8_ = 0;
				int i_9_ = !Class254_Sub3.aBool8049 ? 31 : 33;
				int i_10_ = 13 + i_4_ + -i_9_;
				if (i_7_ + i_10_ > Class153.anInt2025)
					i_10_ = Class153.anInt2025 - i_7_;
				if (i_10_ < 0)
					i_10_ = 0;
				Class66.anInt942 = i_8_;
				Class58.aClass11_Sub45_Sub14_873 = class11_sub45_sub14;
				Class11_Sub2_Sub36.anInt9753 = i_5_;
				Class11_Sub2_Sub25.anInt9328 = i_10_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jf.G(" + i + ','
					+ i_3_ + ','
					+ (class11_sub45_sub14 != null ? "{...}" : "null") + ','
					+ i_4_ + ')'));
		}
	}
}
