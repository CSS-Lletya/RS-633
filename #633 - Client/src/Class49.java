/* Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class49 {
	static int anInt754;
	static int[][] anIntArrayArray755;
	static Class343[] aClass343Array756 = new Class343[16];

	public static void method416(int i) {
		try {
			aClass343Array756 = null;
			if (i >= 98)
				anIntArrayArray755 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hea.A(" + i + ')');
		}
	}

	public Class49() {
		/* empty */
	}

	static {
		anIntArrayArray755 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 },
				{ 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 },
				{ 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 },
				{ -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 },
				{ 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
	}
}
