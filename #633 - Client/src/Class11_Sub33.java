/* Class11_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub33 extends Class11 {
	boolean aBool6894;
	static Class253[] aClass253Array6895;
	int anInt6896;
	static int anInt6897;
	int anInt6898;
	static int anInt6899;
	int anInt6900;
	int anInt6901;
	static Class165 aClass165_6902;
	int anInt6903;

	static final void method2796(int i, byte i_0_, int i_1_, int i_2_,
			int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		do {
			try {
				anInt6899++;
				if (i_5_ < 512
						|| (i_8_ ^ 0xffffffff) > -513
						|| ((Class300.anInt4051 * 512 - 1024 ^ 0xffffffff) > (i_5_ ^ 0xffffffff))
						|| ((i_8_ ^ 0xffffffff) < ((-2 + Class108_Sub12.anInt6228) * 512 ^ 0xffffffff)))
					Class12.anIntArray104[0] = Class12.anIntArray104[1] = -1;
				else {
					int i_9_ = Class318.method1931(97, i_8_, i_1_, i_5_) + -i;
					if (Class11_Sub2_Sub19.aBool9087)
						Class63.method480(2, true);
					else {
						Class236.aClass33_3224.method299(i_6_, 0, 0);
						Class321_Sub2.aClass163_6648
								.method1080(Class236.aClass33_3224);
					}
					if (Class11_Sub45_Sub1.aBool8490)
						Class321_Sub2.aClass163_6648.HA(i_5_, i_9_, i_8_,
								Class117.anInt1597, Class12.anIntArray104);
					else
						Class321_Sub2.aClass163_6648.da(i_5_, i_9_, i_8_,
								Class12.anIntArray104);
					if (!Class11_Sub2_Sub19.aBool9087) {
						Class236.aClass33_3224.method299(-i_6_, 0, 0);
						Class321_Sub2.aClass163_6648
								.method1080(Class236.aClass33_3224);
					} else
						Class52.method437((byte) 94);
					if (i_0_ == -59)
						break;
					method2796(31, (byte) 6, 27, -6, 23, -21, -93, 67, -49, 0);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("lu.A(" + i + ','
						+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ','
						+ i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ','
						+ i_8_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method2797(byte i) {
		try {
			aClass253Array6895 = null;
			if (i <= 79)
				anInt6897 = 66;
			aClass165_6902 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lu.B(" + i + ')');
		}
	}

	Class11_Sub33(int i, int i_10_, int i_11_, int i_12_, int i_13_,
			boolean bool) {
		try {
			((Class11_Sub33) this).anInt6901 = i;
			((Class11_Sub33) this).anInt6903 = i_13_;
			((Class11_Sub33) this).anInt6896 = i_11_;
			((Class11_Sub33) this).anInt6900 = i_12_;
			((Class11_Sub33) this).anInt6898 = i_10_;
			((Class11_Sub33) this).aBool6894 = bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lu.<init>(" + i + ','
					+ i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ','
					+ bool + ')'));
		}
	}
}
