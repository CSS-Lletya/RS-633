/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class125 {
	static int anInt1686;
	static int anInt1687;
	static int anInt1688;

	static final byte[] method816(int i, byte[] is, int i_0_) {
		try {
			anInt1688++;
			byte[] is_1_ = new byte[i_0_];
			if (i != 27773)
				method817(-99, -66, 83, (byte) -69, -110);
			Class311.method1898(is, 0, is_1_, 0, i_0_);
			return is_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bfa.A(" + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_0_ + ')'));
		}
	}

	static final void method817(int i, int i_2_, int i_3_, byte i_4_, int i_5_) {
		try {
			if (i_4_ != -81)
				method816(122, null, -36);
			anInt1686++;
			Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
					-652872096, 8, i_2_);
			class11_sub45_sub15.method3661(i_4_ + 81);
			((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9367 = i_3_;
			((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363 = i_5_;
			((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9369 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bfa.B(" + i + ','
					+ i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}
}
