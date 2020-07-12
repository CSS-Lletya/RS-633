/* Class11_Sub2_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub36 extends Class11_Sub2 {
	static int anInt9751;
	static Class253 aClass253_9752;
	static int anInt9753;
	static int anInt9754;
	static int anInt9755;
	static int anInt9756;

	public static void method3838(byte i) {
		do {
			try {
				aClass253_9752 = null;
				if (i == 81)
					break;
				method3839((byte) 82);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ifa.E(" + i + ')');
			}
			break;
		} while (false);
	}

	final int[] method2254(int i, boolean bool) {
		try {
			anInt9756++;
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
				int[][] is_0_ = this.method2262(i, -83, 0);
				int[] is_1_ = is_0_[0];
				int[] is_2_ = is_0_[1];
				int[] is_3_ = is_0_[2];
				for (int i_4_ = 0; ((Class33_Sub2.anInt6696 ^ 0xffffffff) < (i_4_ ^ 0xffffffff)); i_4_++)
					is[i_4_] = (is_2_[i_4_] + (is_1_[i_4_] + is_3_[i_4_])) / 3;
			}
			if (bool != true)
				method3838((byte) 39);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ifa.A(" + i + ','
					+ bool + ')');
		}
	}

	static final void method3839(byte i) {
		try {
			for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -6; i_5_++)
				Class11_Sub45_Sub19.aBoolArray9711[i_5_] = false;
			anInt9751++;
			int i_6_ = -98 / ((-4 - i) / 40);
			Class191.anInt2453 = 1;
			Canvas_Sub1.anInt9233 = Class170.anInt2186 = -1;
			Class11_Sub2_Sub26.anInt9349 = 0;
			Class344.anInt4564 = -1;
			Class71.anInt989 = -1;
			Class374.anInt4894 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ifa.C(" + i + ')');
		}
	}

	public Class11_Sub2_Sub36() {
		super(1, true);
	}
}
