/* Class195 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class195 {
	static int anInt2647;
	static int anInt2648;
	int anInt2649;
	int anInt2650;
	static int anInt2651;
	static int anInt2652;
	int anInt2653;
	static OutgoingPacket aClass370_2654 = new OutgoingPacket(78, -1);
	static int anInt2655;

	final boolean method1272(int i) {
		try {
			int i_0_ = 100 / ((i - 52) / 40);
			anInt2651++;
			if ((((Class195) this).anInt2649 & 0x4 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jh.E(" + i + ')');
		}
	}

	final boolean method1273(byte i) {
		try {
			anInt2647++;
			if (i < 121)
				return true;
			if ((0x2 & ((Class195) this).anInt2649) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jh.G(" + i + ')');
		}
	}

	public static void method1274(int i) {
		do {
			try {
				aClass370_2654 = null;
				if (i <= -122)
					break;
				aClass370_2654 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "jh.F(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method1275(int i) {
		try {
			if (i != -1)
				method1274(-41);
			anInt2652++;
			if ((0x8 & ((Class195) this).anInt2649) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jh.H(" + i + ')');
		}
	}

	public Class195() {
		/* empty */
	}

	final boolean method1276(int i) {
		try {
			anInt2648++;
			if (i != -1)
				((Class195) this).anInt2649 = 48;
			if ((0x1 & ((Class195) this).anInt2649 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jh.I(" + i + ')');
		}
	}
}
