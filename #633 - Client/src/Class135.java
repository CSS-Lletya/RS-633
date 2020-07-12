/* Class135 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class135 {
	static Class146 aClass146_1863;
	static int anInt1864;
	static int anInt1865;
	static int anInt1866;
	static Class80 aClass80_1867;

	static final boolean method872(int i, int i_0_) {
		try {
			anInt1865++;
			if (i == (i_0_ ^ 0xffffffff) || i_0_ == 17 || i_0_ == 47
					|| i_0_ == 10 || i_0_ == 57)
				return true;
			if ((i_0_ ^ 0xffffffff) == -10 || i_0_ == 1006)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sha.B(" + i + ','
					+ i_0_ + ')');
		}
	}

	public static void method873(boolean bool) {
		do {
			try {
				aClass146_1863 = null;
				aClass80_1867 = null;
				if (bool == false)
					break;
				anInt1866 = 1;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "sha.A(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	static final boolean method874(int i, int i_1_) {
		try {
			anInt1864++;
			if (i != -1003)
				aClass80_1867 = null;
			if (i_1_ != 25 && (i_1_ ^ 0xffffffff) != -31
					&& (i_1_ ^ 0xffffffff) != -1003 && i_1_ != 15 && i_1_ != 12)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sha.C(" + i + ','
					+ i_1_ + ')');
		}
	}
}
