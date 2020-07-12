/* Class91_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class91_Sub2 extends Class91 {
	static Class150 aClass150_7699;
	static Class183 aClass183_7700 = new Class183();
	static Class107 aClass107_7701;
	static int anInt7702;

	public static void method3110(int i) {
		try {
			aClass183_7700 = null;
			aClass107_7701 = null;
			if (i != 1388)
				aClass150_7699 = null;
			aClass150_7699 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sv.A(" + i + ')');
		}
	}

	static final void method3111(int i, int i_0_, int i_1_, boolean bool,
			Class146 class146, int i_2_) {
		try {
			anInt7702++;
			Class335_Sub2.method2821(bool, i, (long) i_1_, (byte) -105, i_0_,
					i_2_, class146);
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("sv.B(" + i + ',' + i_0_
							+ ',' + i_1_ + ',' + bool + ','
							+ (class146 != null ? "{...}" : "null") + ','
							+ i_2_ + ')'));
		}
	}
}
