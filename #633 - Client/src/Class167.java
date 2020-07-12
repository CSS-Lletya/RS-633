/* Class167 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class167 implements Interface6 {
	static int anInt2150;
	static long aLong2151;
	static int anInt2152;
	int anInt2153;
	static int anInt2154 = 0;

	static final void method1101(int i, Player class376_sub7_sub5_sub5_sub1) {
		do {
			try {
				anInt2150++;
				if (i <= 5)
					anInt2154 = -22;
				Class11_Sub19 class11_sub19 = ((Class11_Sub19) (Class151.aClass213_2009
						.method1369(
								(byte) 26,
								(long) ((Actor) class376_sub7_sub5_sub5_sub1).anInt10319)));
				if (class11_sub19 == null)
					break;
				if (((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830 != null) {
					Class233.aClass11_Sub6_Sub1_3185
							.method3464(((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830);
					((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830 = null;
				}
				class11_sub19.method122(-113);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("hg.B("
						+ i
						+ ','
						+ ((class376_sub7_sub5_sub5_sub1 != null) ? "{...}"
								: "null") + ')'));
			}
			break;
		} while (false);
	}

	public final Class9 method21(boolean bool) {
		try {
			if (bool != false)
				method21(false);
			anInt2152++;
			return Class291.aClass9_3944;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hg.A(" + bool + ')');
		}
	}

	Class167(int i) {
		try {
			((Class167) this).anInt2153 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hg.<init>(" + i + ')');
		}
	}
}
