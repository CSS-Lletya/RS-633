/* Class234_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class234_Sub2 extends Class234 {
	static int anInt5984;
	static IncomingPacket aClass160_5985 = new IncomingPacket(0, 3);
	static int anInt5986;
	static Class146 aClass146_5987;

	abstract Class321_Sub1 method2565(byte i);

	static final void method2566(byte i) {
		try {
			anInt5984++;
			int i_0_ = 0;
			if (i == -94) {
				for (int i_1_ = 0; Class300.anInt4051 > i_1_; i_1_++) {
					for (int i_2_ = 0; ((Class108_Sub12.anInt6228 ^ 0xffffffff) < (i_2_ ^ 0xffffffff)); i_2_++) {
						if (Class307.method1882(
								Class181.aClass364ArrayArrayArray2336, i_2_,
								i_1_, true, i_0_, i + 6815))
							i_0_++;
						if (i_0_ >= 512)
							return;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "en.H(" + i + ')');
		}
	}

	public static void method2567(int i) {
		try {
			aClass146_5987 = null;
			if (i != 0)
				method2566((byte) 106);
			aClass160_5985 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "en.O(" + i + ')');
		}
	}
}
