/* Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class62 {
	static boolean aBool904;
	static int[] anIntArray905 = new int[8];
	static int[] anIntArray906 = { 1, 2, 4, 8 };
	static int anInt907;
	static int anInt908;

	abstract Class11_Sub45_Sub9 method474(int i,
			Class11_Sub45_Sub9 class11_sub45_sub9);

	static final void method475(Class103 class103) {
		Class206.aClass103_2779 = class103;
	}

	public static void method476(byte i) {
		try {
			int i_0_ = -111 % ((-56 - i) / 34);
			anIntArray905 = null;
			anIntArray906 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uda.C(" + i + ')');
		}
	}

	static final boolean method477(int i, int i_1_, int i_2_) {
		try {
			if (i_2_ >= -70)
				aBool904 = true;
			anInt907++;
			if ((i & 0x800) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("uda.D(" + i + ','
					+ i_1_ + ',' + i_2_ + ')'));
		}
	}

	static {
		aBool904 = false;
	}
}
