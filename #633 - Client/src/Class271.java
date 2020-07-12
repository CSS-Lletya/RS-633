/* Class271 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class271 {
	static IncomingPacket SEND_VARP_BIG = new IncomingPacket(8, 6);
	short[] aShortArray3653;
	short[] aShortArray3654;
	static Class34 aClass34_3655 = new Class34();
	short[] aShortArray3656;
	byte[] aByteArray3657;

	public static void method1697(int i) {
		try {
			aClass34_3655 = null;
			if (i != 8)
				method1697(103);
			SEND_VARP_BIG = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pi.A(" + i + ')');
		}
	}
}
