/* Class67 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class67 {
	static int anInt950;
	static int anInt951;
	private int[] anIntArray952;
	static int anInt953;

	final int method495(boolean bool, int i) {
		try {
			anInt953++;
			int i_0_ = -1 + (anIntArray952.length >> 1);
			int i_1_ = i_0_ & i;
			if (bool != false)
				anInt950 = -57;
			for (;;) {
				int i_2_ = anIntArray952[i_1_ + i_1_ + 1];
				if (i_2_ == -1)
					return -1;
				if (i == anIntArray952[i_1_ - -i_1_])
					return i_2_;
				i_1_ = i_1_ + 1 & i_0_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dda.A(" + bool + ','
					+ i + ')');
		}
	}

	Class67(int[] is) {
		try {
			int i;
			for (i = 1; (((is.length >> 1) + is.length ^ 0xffffffff) <= (i ^ 0xffffffff)); i <<= 1) {
				/* empty */
			}
			anIntArray952 = new int[i + i];
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (i + i ^ 0xffffffff); i_3_++)
				anIntArray952[i_3_] = -1;
			for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_4_++) {
				int i_5_;
				for (i_5_ = is[i_4_] & i - 1; (anIntArray952[i_5_ + (i_5_ + 1)] ^ 0xffffffff) != 0; i_5_ = i_5_
						+ 1 & -1 + i) {
					/* empty */
				}
				anIntArray952[i_5_ - -i_5_] = is[i_4_];
				anIntArray952[i_5_ + i_5_ + 1] = i_4_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dda.<init>("
					+ (is != null ? "{...}" : "null") + ')');
		}
	}
}
