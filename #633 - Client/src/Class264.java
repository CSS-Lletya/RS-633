/* Class264 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class264 {
	static int anInt3599;
	static OutgoingPacket aClass370_3600 = new OutgoingPacket(70, 4);
	static int anInt3601 = -1;
	static IncomingPacket aClass160_3602;
	static int anInt3603 = 1;
	static int anInt3604;

	public Class264() {
		/* empty */
	}

	final int method1672(long l, int i) {
		try {
			anInt3599++;
			if (i != 4)
				method1673((byte) 127);
			long l_0_ = method1675(i - 9880);
			if ((l_0_ ^ 0xffffffffffffffffL) < -1L)
				Class11_Sub51.method3236(l_0_, 0);
			return method1674(70, l);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "on.G(" + l + ',' + i
					+ ')');
		}
	}

	abstract long method1673(byte i);

	abstract int method1674(int i, long l);

	abstract long method1675(int i);

	public static void method1676(byte i) {
		try {
			aClass370_3600 = null;
			if (i <= 96)
				method1676((byte) -68);
			aClass160_3602 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "on.F(" + i + ')');
		}
	}

	abstract void method1677(int i);

	static {
		aClass160_3602 = new IncomingPacket(58, 8);
	}
}
