/* Class58_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class58_Sub2_Sub1 extends Class58_Sub2 {
	static int anInt9244;
	static int anInt9245;
	static int anInt9246;
	static int[] anIntArray9247 = { 28, 35, 40, 44 };
	static Class253[] aClass253Array9248;
	private byte[] aByteArray9249;
	static Class146 aClass146_9250;
	static int anInt9251;

	final void method3151(boolean bool, byte i, int i_0_) {
		try {
			anInt9244++;
			int i_1_ = 2 * i_0_;
			if (bool == true) {
				int i_2_ = 0xff & i;
				aByteArray9249[i_1_++] = (byte) (i_2_ * 3 >> 5);
				aByteArray9249[i_1_] = (byte) (i_2_ * 3 >> 5);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lk.C(" + bool + ','
					+ i + ',' + i_0_ + ')'));
		}
	}

	public static void method3611(byte i) {
		try {
			anIntArray9247 = null;
			aClass146_9250 = null;
			if (i >= -107)
				anInt9251 = -50;
			aClass253Array9248 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lk.T(" + i + ')');
		}
	}

	final byte[] method3612(int i, int i_3_, int i_4_, boolean bool) {
		try {
			anInt9245++;
			aByteArray9249 = new byte[2 * (i * i_3_ * i_4_)];
			this.method457(i_3_, i_4_, bool, i);
			return aByteArray9249;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lk.U(" + i + ','
					+ i_3_ + ',' + i_4_ + ',' + bool + ')'));
		}
	}

	public Class58_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}
}
