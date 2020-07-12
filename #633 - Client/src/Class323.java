/* Class323 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class323 {
	static int anInt4316;
	static int anInt4317;
	static Class83 aClass83_4318 = new Class83(1, 8);
	static int anInt4319;
	static int anInt4320;

	static final boolean method1972(int i, byte i_0_) {
		try {
			anInt4316++;
			int i_1_ = 54 / ((i_0_ - 62) / 52);
			if ((i ^ 0xffffffff) != -4 && i != 7 && (i ^ 0xffffffff) != -11)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tj.B(" + i + ','
					+ i_0_ + ')');
		}
	}

	public static void method1973(int i) {
		try {
			if (i == 14006)
				aClass83_4318 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tj.A(" + i + ')');
		}
	}
}
