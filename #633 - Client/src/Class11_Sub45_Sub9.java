/* Class11_Sub45_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class11_Sub45_Sub9 extends Class11_Sub45 {
	static IncomingPacket SEND_VAR_BIT_SMALL = new IncomingPacket(81, 3);
	static int anInt8876;
	int anInt8877;
	static int anInt8878;

	static final void method3482(byte i, int i_0_) {
		try {
			anInt8876++;
			Class52.anInt812 = i_0_;
			int i_1_ = 79 / ((i + 32) / 37);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ei.E(" + i + ','
					+ i_0_ + ')');
		}
	}

	abstract Object method3483(int i);

	public static void method3484(int i) {
		try {
			if (i == -10550)
				SEND_VAR_BIT_SMALL = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ei.F(" + i + ')');
		}
	}

	abstract boolean method3485(byte i);

	Class11_Sub45_Sub9(int i) {
		try {
			((Class11_Sub45_Sub9) this).anInt8877 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ei.<init>(" + i + ')');
		}
	}
}
