/* Class260 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class260 {
	static int anInt3573;
	static int anInt3574;
	private Class146 aClass146_3575;
	int anInt3576;

	static final boolean method1662(byte i) {
		try {
			anInt3574++;
			Class11_Sub41 class11_sub41 = (Class11_Sub41) Class11_Sub45_Sub20_Sub1.aClass84_9948
					.method584(i - 12146);
			if (class11_sub41 == null)
				return false;
			if (i != -115)
				anInt3573 = 64;
			for (int i_0_ = 0; ((((Class11_Sub41) class11_sub41).anInt7251 ^ 0xffffffff) < (i_0_ ^ 0xffffffff)); i_0_++) {
				if ((((Class11_Sub41) class11_sub41).aClass368Array7250[i_0_] != null)
						&& ((((Class11_Sub41) class11_sub41).aClass368Array7250[i_0_].anInt4837) ^ 0xffffffff) == -1)
					return false;
				if ((((Class11_Sub41) class11_sub41).aClass368Array7253[i_0_] != null)
						&& (((Class11_Sub41) class11_sub41).aClass368Array7253[i_0_].anInt4837) == 0)
					return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oi.A(" + i + ')');
		}
	}

	Class260(Class66 class66, int i, Class146 class146) {
		new Class22(64);
		try {
			aClass146_3575 = class146;
			((Class260) this).anInt3576 = aClass146_3575.method914(15, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("oi.<init>("
					+ (class66 != null ? "{...}" : "null") + ',' + i + ','
					+ (class146 != null ? "{...}" : "null") + ')'));
		}
	}
}
