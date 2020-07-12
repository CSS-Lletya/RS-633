/* Class114 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class114 {
	static int anInt1562;
	static double aDouble1563;
	static int anInt1564;
	static Class253 aClass253_1565;
	static short[] aShortArray1566;

	static final void method758(int i) {
		try {
			if (Class285.anInt3846 != i) {
				if ((Class285.anInt3846 ^ 0xffffffff) != -8) {
					if (Class285.anInt3846 == 10)
						Class83.method575(false, 11);
				} else
					Class83.method575(false, 8);
			} else
				Class83.method575(false, 4);
			anInt1564++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dk.C(" + i + ')');
		}
	}

	public static void method759(int i) {
		try {
			if (i == 8) {
				aClass253_1565 = null;
				aShortArray1566 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dk.B(" + i + ')');
		}
	}

	static final void method760(boolean bool) {
		do {
			try {
				anInt1562++;
				Class376_Sub7_Sub1.aClass213_8798.method1364((byte) 91);
				if (bool == true)
					break;
				aClass253_1565 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "dk.A(" + bool
						+ ')');
			}
			break;
		} while (false);
	}
}
