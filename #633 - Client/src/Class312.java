/* Class312 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class312 {
	static Class260 aClass260_4149;
	static IncomingPacket aClass160_4150 = new IncomingPacket(9, 7);
	static int anInt4151;

	public static void method1903(byte i) {
		try {
			aClass260_4149 = null;
			aClass160_4150 = null;
			int i_0_ = 89 % ((i - 62) / 35);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sf.B(" + i + ')');
		}
	}

	static final short[][] method1904(float[][] fs, int i, short[][] is) {
		try {
			for (int i_1_ = i; i_1_ < fs.length; i_1_++) {
				for (int i_2_ = 0; is[i_1_].length > i_2_; i_2_++)
					is[i_1_][i_2_] = (short) (int) (fs[i_1_][i_2_] * 16383.0F);
			}
			anInt4151++;
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sf.A("
					+ (fs != null ? "{...}" : "null") + ',' + i + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}
}
