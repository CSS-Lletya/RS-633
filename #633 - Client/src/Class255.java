/* Class255 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class255 {
	static int anInt3499;
	static long aLong3500;
	static int[] anIntArray3501 = { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };
	static int anInt3502;
	static int anInt3503 = 0;
	static int anInt3504;

	static final void method1632(int i, boolean bool, int i_0_) {
		try {
			anInt3504++;
			Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
					-652872096, 1, i_0_);
			class11_sub45_sub15.method3661(0);
			if (bool != false)
				method1635(null, -68, null);
			((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mea.A(" + i + ','
					+ bool + ',' + i_0_ + ')'));
		}
	}

	static final int method1633(int i) {
		try {
			if (i != 1)
				anInt3503 = 30;
			anInt3499++;
			return Class120.method784(-73, false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mea.B(" + i + ')');
		}
	}

	public static void method1634(byte i) {
		try {
			if (i > -13)
				aLong3500 = -83L;
			anIntArray3501 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mea.D(" + i + ')');
		}
	}

	static final void method1635(String string, int i, String string_1_) {
		try {
			Class108_Sub23.anInt7766 = -1;
			Class11_Sub45_Sub1_Sub2.anInt9885 = RunClient.ENABLE_LOBBY ? 1 : 2;
			anInt3502++;
			Class11_Sub2_Sub4.method3352(string, false, 0, string_1_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mea.C("
					+ (string != null ? "{...}" : "null") + ',' + i + ','
					+ (string_1_ != null ? "{...}" : "null") + ')'));
		}
	}
}
