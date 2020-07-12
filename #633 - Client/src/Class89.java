/* Class89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class89 {
	static Class82 aClass82_1221;
	static int anInt1222;
	static long aLong1223 = -1L;
	static int anInt1224;
	static char[] aCharArray1225 = { ' ', '\u00a0', '_', '-', '\u00e0',
			'\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0', '\u00c1',
			'\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea',
			'\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed',
			'\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2',
			'\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3',
			'\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa', '\u00fb',
			'\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7',
			'\u00c7', '\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df' };

	public static void method619(int i) {
		try {
			aCharArray1225 = null;
			if (i < 97)
				aCharArray1225 = null;
			aClass82_1221 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bo.A(" + i + ')');
		}
	}

	static final Class153 method620(int i, int i_0_) {
		try {
			anInt1224++;
			int i_1_ = -90 % ((42 - i) / 43);
			Class153[] class153s = Class1_Sub1.method2898(-1);
			for (int i_2_ = 0; (class153s.length ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
				Class153 class153 = class153s[i_2_];
				if ((i_0_ ^ 0xffffffff) == (((Class153) class153).anInt2021 ^ 0xffffffff))
					return class153;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bo.B(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final void method621(int i) {
		try {
			anInt1222++;
			Class161.method998((byte) -108);
			int i_3_ = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub17_5731
					.method2734(false);
			do {
				if ((i_3_ ^ 0xffffffff) != -3) {
					if ((i_3_ ^ 0xffffffff) != -4)
						break;
				} else {
					Class237.method1515(Class11_Sub36.anInt7079, 100, 100,
							Class153.anInt2025, Class321_Sub2.aClass163_6648,
							-1);
					break;
				}
				Class54.method445(Class321_Sub2.aClass163_6648,
						Class134.anInt1854, Class11_Sub36.anInt7079, -107,
						Player.anInt10425, 2, 2, Class153.anInt2025);
			} while (false);
			if (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub17_5731
					.method2736((byte) 100))
				Class355.method2123(-128, Class11_Sub45_Sub13.aCanvas9308);
			if (Class321_Sub2.aClass163_6648 != null)
				Class235.method1499(97);
			Class11_Sub45_Sub1.aBool8490 = i != (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub17_5731
					.method2734(false) ^ 0xffffffff);
			Class11_Sub2_Sub19.aBool9087 = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub17_5731
					.method2736((byte) 125);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bo.C(" + i + ')');
		}
	}
}
