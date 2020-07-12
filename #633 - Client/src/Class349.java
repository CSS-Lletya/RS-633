/* Class349 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class349 {
	static int anInt4606;
	static int anInt4607;

	static final void method2099(boolean bool) {
		try {
			anInt4606++;
			if (bool == false) {
				Class11_Sub2_Sub2.method3335(1);
				Class34.method304((byte) 82);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vo.B(" + bool + ')');
		}
	}

	static final void method2100(byte i) {
		try {
			if (((Class341) Class108_Sub21.aClass341_7304).aBool4520
					&& (((Class46) Class11_Sub45_Sub20_Sub1.aClass46_9960).anInt730 ^ 0xffffffff) != 0)
				Class175.method1144(
						(byte) 49,
						((Class46) (Class11_Sub45_Sub20_Sub1.aClass46_9960)).aString733,
						((Class46) (Class11_Sub45_Sub20_Sub1.aClass46_9960)).anInt730);
			if (i < 48)
				method2100((byte) 109);
			anInt4607++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vo.A(" + i + ')');
		}
	}
}
