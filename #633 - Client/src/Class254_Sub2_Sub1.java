/* Class254_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class254_Sub2_Sub1 extends Class254_Sub2 {
	static Class146 aClass146_9493;
	int anInt9494;
	static int anInt9495;

	Class254_Sub2_Sub1(Class118 class118, Class150 class150, int i, int i_0_,
			int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_,
			int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		super(class118, class150, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_,
				i_7_, i_8_, i_9_, i_10_, i_11_);
		try {
			((Class254_Sub2_Sub1) this).anInt9494 = i_12_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ra.<init>("
					+ (class118 != null ? "{...}" : "null") + ','
					+ (class150 != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ','
					+ i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ')'));
		}
	}

	public final Class9 method21(boolean bool) {
		try {
			anInt9495++;
			if (bool != false)
				return null;
			return Class33.aClass9_454;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ra.A(" + bool + ')');
		}
	}

	public static void method3742(byte i) {
		try {
			if (i > -94)
				aClass146_9493 = null;
			aClass146_9493 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ra.B(" + i + ')');
		}
	}
}
