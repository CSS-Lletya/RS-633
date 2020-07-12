/* Class11_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub36 extends Class11 {
	static int anInt7077;
	int anInt7078;
	static int anInt7079;
	static int anInt7080 = 0;
	int anInt7081;

	static final boolean method2884(int i, int i_0_, int i_1_) {
		try {
			anInt7077++;
			if (i != 33)
				return false;
			if ((i_1_ & 0x21 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pr.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	Class11_Sub36(int i, int i_2_) {
		try {
			((Class11_Sub36) this).anInt7078 = i_2_;
			((Class11_Sub36) this).anInt7081 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pr.<init>(" + i + ','
					+ i_2_ + ')');
		}
	}
}
