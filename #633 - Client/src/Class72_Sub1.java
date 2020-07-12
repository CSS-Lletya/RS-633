/* Class72_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class72_Sub1 extends Class72 {
	Interface7 anInterface7_5070;

	Class72_Sub1(Class163_Sub2 class163_sub2, int i, int i_0_, byte[] is) {
		try {
			((Class72_Sub1) this).anInterface7_5070 = class163_sub2.method3011(
					false, Class128.aClass98_1726, is, 120, i, i_0_);
			((Class72_Sub1) this).anInterface7_5070.method26(28970, false,
					false);
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("aba.<init>("
							+ (class163_sub2 != null ? "{...}" : "null") + ','
							+ i + ',' + i_0_ + ','
							+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	Class72_Sub1(Class163_Sub2 class163_sub2, int i, int i_1_, int[] is) {
		try {
			((Class72_Sub1) this).anInterface7_5070 = class163_sub2.method3075(
					i_1_, is, false, i, false);
			((Class72_Sub1) this).anInterface7_5070.method26(28970, false,
					false);
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("aba.<init>("
							+ (class163_sub2 != null ? "{...}" : "null") + ','
							+ i + ',' + i_1_ + ','
							+ (is != null ? "{...}" : "null") + ')'));
		}
	}
}
