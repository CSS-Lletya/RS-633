/* Class72 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class72 {
	static OutgoingPacket aClass370_1001 = new OutgoingPacket(81, 4);
	static Class35[] aClass35Array1002;
	static int[] anIntArray1003 = new int[13];
	static IComponentDefinitions aClass192_1004 = null;

	public Class72() {
		/* empty */
	}

	public static void method517(int i) {
		try {
			anIntArray1003 = null;
			aClass370_1001 = null;
			aClass35Array1002 = null;
			if (i <= 77)
				method517(-10);
			aClass192_1004 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aa.A(" + i + ')');
		}
	}
}
