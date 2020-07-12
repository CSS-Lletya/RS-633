/* RuntimeException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class RuntimeException_Sub1 extends RuntimeException {
	Throwable aThrowable9962;
	String aString9963;
	static int anInt9964;
	static String aString9965 = null;
	static float aFloat9966;
	static int anInt9967;

	static final byte method3896(int i, int i_0_, int i_1_) {
		try {
			if (i_1_ > -46)
				method3897(-127);
			anInt9967++;
			if ((i ^ 0xffffffff) != -10)
				return (byte) 0;
			if ((0x1 & i_0_) != 0)
				return (byte) 2;
			return (byte) 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fl.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	public static void method3897(int i) {
		try {
			if (i != 0)
				anInt9964 = 42;
			aString9965 = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	RuntimeException_Sub1(Throwable throwable, String string) {
		try {
			((RuntimeException_Sub1) this).aString9963 = string;
			((RuntimeException_Sub1) this).aThrowable9962 = throwable;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
