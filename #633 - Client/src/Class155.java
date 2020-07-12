/* Class155 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class155 {
	static int anInt2042;
	static int[] anIntArray2043 = { 7, 8, 9, 10, 11, 12, 13, 15 };
	static int anInt2044;

	static final boolean method972(int i, int i_0_, int i_1_) {
		try {
			if (i != 9)
				return true;
			anInt2042++;
			if ((0x84080 & i_0_ ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gj.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	public static void method973(int i) {
		try {
			if (i != 12)
				anIntArray2043 = null;
			anIntArray2043 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gj.B(" + i + ')');
		}
	}
}
