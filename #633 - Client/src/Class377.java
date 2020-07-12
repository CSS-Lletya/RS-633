/* Class377 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class377 implements Interface26 {
	static double aDouble4912;
	static int anInt4913;
	int anInt4914;
	int anInt4915;
	static int[] anIntArray4916 = new int[1];
	float[] aFloatArray4917;
	static int anInt4918;

	static final boolean method2208(int i, byte i_0_) {
		try {
			anInt4918++;
			if (i_0_ != 120)
				return true;
			if ((i ^ 0xffffffff) != -1 && (i ^ 0xffffffff) != -3)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tba.A(" + i + ','
					+ i_0_ + ')');
		}
	}

	public static void method2209(byte i) {
		do {
			try {
				anIntArray4916 = null;
				if (i > 12)
					break;
				anIntArray4916 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "tba.B(" + i + ')');
			}
			break;
		} while (false);
	}

	Class377(int i, int i_1_) {
		try {
			((Class377) this).anInt4914 = i;
			((Class377) this).anInt4915 = i_1_;
			((Class377) this).aFloatArray4917 = new float[i_1_ * i];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tba.<init>(" + i + ','
					+ i_1_ + ')');
		}
	}
}
