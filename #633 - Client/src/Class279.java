/* Class279 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class279 {
	static IncomingPacket aClass160_3768;
	static int anInt3769;
	static int anInt3770 = 0;
	static int anInt3771;
	static int anInt3772;

	static final void method1720(int i, byte i_0_) {
		try {
			anInt3769++;
			if (i_0_ >= -12)
				method1720(99, (byte) -114);
			Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
					-652872096, 11, i);
			class11_sub45_sub15.method3660(0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pq.B(" + i + ','
					+ i_0_ + ')');
		}
	}

	public static void method1721(byte i) {
		do {
			try {
				aClass160_3768 = null;
				if (i <= -38)
					break;
				anInt3772 = 62;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "pq.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static {
		aClass160_3768 = new IncomingPacket(74, 0);
		anInt3772 = 503;
	}
}
