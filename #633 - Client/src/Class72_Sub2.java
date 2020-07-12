/* Class72_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class72_Sub2 extends Class72 {
	int[] anIntArray6909;
	static int anInt6910;
	int[] anIntArray6911;
	static int anInt6912;

	Class72_Sub2(int i, int i_0_, int[] is, int[] is_1_) {
		try {
			((Class72_Sub2) this).anIntArray6909 = is;
			((Class72_Sub2) this).anIntArray6911 = is_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mi.<init>(" + i + ','
					+ i_0_ + ',' + (is != null ? "{...}" : "null") + ','
					+ (is_1_ != null ? "{...}" : "null") + ')'));
		}
	}

	static final boolean method2799(int i, int i_2_, int i_3_, int i_4_,
			int i_5_, int i_6_) {
		try {
			anInt6910++;
			int i_7_ = i_3_;
			int i_8_ = -118 % ((-19 - i_6_) / 57);
			for (/**/; (i_5_ ^ 0xffffffff) <= (i_7_ ^ 0xffffffff); i_7_++) {
				for (int i_9_ = i; (i_9_ ^ 0xffffffff) >= (i_2_ ^ 0xffffffff); i_9_++) {
					if (((i_4_ ^ 0xffffffff) == (Class11_Sub2_Sub30.anIntArrayArray9617[i_7_][i_9_] ^ 0xffffffff))
							&& (Class108_Sub4.anIntArrayArray5386[i_7_][i_9_] ^ 0xffffffff) >= -2)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("mi.B(" + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ','
							+ i_5_ + ',' + i_6_ + ')'));
		}
	}
}
