/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class44 {
	static OutgoingPacket aClass370_707;
	static int[] anIntArray708 = { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };
	static int[] anIntArray709;

	public static void method394(byte i) {
		try {
			aClass370_707 = null;
			if (i < -19) {
				anIntArray709 = null;
				anIntArray708 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hca.A(" + i + ')');
		}
	}

	static {
		aClass370_707 = new OutgoingPacket(13, 7);
		anIntArray709 = new int[32];
	}
}
