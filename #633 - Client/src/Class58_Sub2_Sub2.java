/* Class58_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class58_Sub2_Sub2 extends Class58_Sub2 {
	static int anInt9816;
	static int anInt9817;
	private byte[] aByteArray9818;
	static Class353 aClass353_9819;
	static char[] aCharArray9820 = { '[', ']', '#' };

	final void method3151(boolean bool, byte i, int i_0_) {
		try {
			anInt9817++;
			if (bool != true)
				aClass353_9819 = null;
			int i_1_ = 2 * i_0_;
			int i_2_ = 0xff & i;
			aByteArray9818[i_1_++] = (byte) -1;
			aByteArray9818[i_1_] = (byte) (3 * i_2_ >> 5);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("efa.C(" + bool + ','
					+ i + ',' + i_0_ + ')'));
		}
	}

	public static void method3858(int i) {
		try {
			aClass353_9819 = null;
			if (i != 8)
				aClass353_9819 = null;
			aCharArray9820 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "efa.T(" + i + ')');
		}
	}

	public Class58_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	final byte[] method3859(int i, int i_3_, int i_4_, boolean bool) {
		try {
			aByteArray9818 = new byte[2 * (i_3_ * i * i_4_)];
			anInt9816++;
			this.method457(i_3_, i_4_, bool, i);
			return aByteArray9818;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("efa.U(" + i + ','
					+ i_3_ + ',' + i_4_ + ',' + bool + ')'));
		}
	}
}
