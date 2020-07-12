/* Class372 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class372 {
	static int anInt4871;
	static OutgoingPacket aClass370_4872 = new OutgoingPacket(49, -1);
	static int anInt4873;
	static int anInt4874;
	static int anInt4875;
	static Class234 aClass234_4876;

	static final boolean method2193(int i, int i_0_, int i_1_) {
		try {
			int i_2_ = 23 % ((i_1_ - 65) / 50);
			anInt4873++;
			if ((i & 0xc580) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vca.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	public static void method2194(byte i) {
		try {
			aClass234_4876 = null;
			int i_3_ = 117 % ((i + 3) / 45);
			aClass370_4872 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vca.B(" + i + ')');
		}
	}

	static final Class307 method2195(int i, int i_4_) {
		try {
			anInt4871++;
			Class307[] class307s = Class11_Sub2_Sub37.method3842(12686);
			int i_5_ = 0;
			if (i != 26496)
				aClass370_4872 = null;
			for (/**/; i_5_ < class307s.length; i_5_++) {
				Class307 class307 = class307s[i_5_];
				if ((i_4_ ^ 0xffffffff) == (((Class307) class307).anInt4115 ^ 0xffffffff))
					return class307;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vca.C(" + i + ','
					+ i_4_ + ')');
		}
	}
}
