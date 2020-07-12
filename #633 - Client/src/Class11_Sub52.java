/* Class11_Sub52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub52 extends Class11 {
	static int anInt8050;
	static boolean aBool8051 = false;
	long aLong8052;
	static boolean aBool8053 = false;
	static int[] anIntArray8054 = new int[1024];

	public static void method3241(int i) {
		try {
			anIntArray8054 = null;
			int i_0_ = 66 / ((81 - i) / 45);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eda.B(" + i + ')');
		}
	}

	public Class11_Sub52() {
		/* empty */
	}

	Class11_Sub52(long l) {
		try {
			((Class11_Sub52) this).aLong8052 = l;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, "eda.<init>(" + l + ')');
		}
	}

	static final void method3242(int i, byte i_1_) {
		try {
			anInt8050++;
			if (i_1_ != 102)
				anIntArray8054 = null;
			Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(i_1_
					+ -652872198, 17, i);
			class11_sub45_sub15.method3660(0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eda.A(" + i + ','
					+ i_1_ + ')');
		}
	}
}
