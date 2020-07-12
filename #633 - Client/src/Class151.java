/* Class151 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class151 {
	static OutgoingPacket aClass370_2007;
	static int[] anIntArray2008 = new int[2];
	static Class213 aClass213_2009;
	static OutgoingPacket aClass370_2010;

	public static void method951(byte i) {
		try {
			aClass213_2009 = null;
			anIntArray2008 = null;
			aClass370_2007 = null;
			int i_0_ = 86 % ((i + 14) / 53);
			aClass370_2010 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ga.A(" + i + ')');
		}
	}

	static {
		aClass370_2007 = new OutgoingPacket(56, 4);
		aClass213_2009 = new Class213(16);
		aClass370_2010 = new OutgoingPacket(41, 2);
	}
}
