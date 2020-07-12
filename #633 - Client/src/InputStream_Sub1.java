/* InputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.InputStream;

final class InputStream_Sub1 extends InputStream {
	static int[] anIntArray6284 = new int[1];
	static int anInt6285;
	static boolean aBool6286 = true;
	static int anInt6287;

	public static void method2664(boolean bool) {
		do {
			try {
				anIntArray6284 = null;
				if (bool == false)
					break;
				method2665(88, 100, -13);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "hh.B(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	public final int read() {
		try {
			Class11_Sub51.method3236(30000L, 0);
			anInt6287++;
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hh.read(" + ')');
		}
	}

	static final int method2665(int i, int i_0_, int i_1_) {
		try {
			anInt6285++;
			int i_2_ = i_1_ + i * 57;
			if (i_0_ != 2013416941)
				method2665(35, -66, 70);
			i_2_ ^= i_2_ << 13;
			int i_3_ = (0x7fffffff & i_2_ * (15731 * (i_2_ * i_2_) - -789221)
					+ 1376312589);
			return (0x7fa9cb3 & i_3_) >> 19;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hh.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}
}
