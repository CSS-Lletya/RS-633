/* Class339 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class339 {
	static Class146 aClass146_4481;
	static int anInt4482 = 2;
	static OutgoingPacket aClass370_4483 = new OutgoingPacket(30, 7);
	static int anInt4484;
	static int anInt4485;
	static String[] aStringArray4486;
	static Class84 aClass84_4487 = new Class84();
	static int[] anIntArray4488 = new int[5];

	static final void method2048(int i, int i_0_) {
		try {
			anInt4484++;
			Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
					-652872096, i_0_, i);
			class11_sub45_sub15.method3660(0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ida.A(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final void method2049(int i) {
		try {
			anInt4485++;
			if (i > 98) {
				for (int i_1_ = 0; (Class11_Sub45_Sub17.aByteArrayArrayArray9509.length > i_1_); i_1_++) {
					for (int i_2_ = 0; ((Class11_Sub45_Sub17.aByteArrayArrayArray9509[0]).length > i_2_); i_2_++) {
						for (int i_3_ = 0; ((i_3_ ^ 0xffffffff) > ((Class11_Sub45_Sub17.aByteArrayArrayArray9509[0][0]).length ^ 0xffffffff)); i_3_++)
							Class11_Sub45_Sub17.aByteArrayArrayArray9509[i_1_][i_2_][i_3_] = (byte) 0;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ida.B(" + i + ')');
		}
	}

	public static void method2050(int i) {
		try {
			aStringArray4486 = null;
			if (i != 0)
				method2049(89);
			aClass146_4481 = null;
			aClass370_4483 = null;
			aClass84_4487 = null;
			anIntArray4488 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ida.C(" + i + ')');
		}
	}
}
