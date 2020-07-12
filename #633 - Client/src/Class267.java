/* Class267 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class267 {
	static String aString3625 = "";
	static InterfaceSettings aClass11_Sub9_3626 = new InterfaceSettings(0, -1);
	static int anInt3627;
	static int anInt3628 = 0;

	static final void method1685(int i, int i_0_) {
		try {
			anInt3627++;
			Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
					-652872096, 3, i);
			class11_sub45_sub15.method3660(i_0_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ov.A(" + i + ','
					+ i_0_ + ')');
		}
	}

	public static void method1686(int i) {
		try {
			if (i == 3) {
				aString3625 = null;
				aClass11_Sub9_3626 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ov.B(" + i + ')');
		}
	}
}
