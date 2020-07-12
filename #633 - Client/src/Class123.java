/* Class123 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class123 {
	static int anInt1663;
	static IncomingPacket aClass160_1664 = new IncomingPacket(87, 6);
	static IncomingPacket aClass160_1665;
	static int[] anIntArray1666 = { 2047, 16383, 65535 };
	static IncomingPacket aClass160_1667;

	public static void method804(byte i) {
		try {
			aClass160_1665 = null;
			aClass160_1667 = null;
			aClass160_1664 = null;
			int i_0_ = 74 % ((i - 84) / 35);
			anIntArray1666 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "du.B(" + i + ')');
		}
	}

	static final void method805(boolean bool) {
		try {
			Class376_Sub7_Sub5_Sub1.aClass124_9902.method807(63);
			if (bool != true)
				method804((byte) 9);
			anInt1663++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "du.A(" + bool + ')');
		}
	}

	static {
		aClass160_1665 = new IncomingPacket(32, 8);
		aClass160_1667 = new IncomingPacket(41, -2);
	}
}
