/* Class240 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class240 {
	static int[] anIntArray3256;
	static int anInt3257 = 0;
	static short[][] aShortArrayArray3258;
	static boolean aBool3259 = false;
	static float[] aFloatArray3260 = new float[16];
	private static short[] aShortArray3261 = { -1, -1, -1, -1, -1 };
	private static short[] aShortArray3262;
	static int anInt3263 = -1;
	static int anInt3264;
	static int anInt3265;
	private static short[] aShortArray3266;

	public final String toString() {
		try {
			anInt3265++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ms.toString(" + ')');
		}
	}

	public Class240() {
		/* empty */
	}

	public static void method1525(boolean bool) {
		try {
			aFloatArray3260 = null;
			aShortArray3262 = null;
			aShortArray3266 = null;
			aShortArrayArray3258 = null;
			anIntArray3256 = null;
			if (bool == true)
				aShortArray3261 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ms.B(" + bool + ')');
		}
	}

	static final void method1526(int i, int i_0_) {
		try {
			anInt3264++;
			Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
					-652872096, 8, i_0_);
			if (i > -53)
				method1526(-72, -126);
			class11_sub45_sub15.method3660(0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ms.A(" + i + ','
					+ i_0_ + ')');
		}
	}

	static {
		anIntArray3256 = new int[5];
		aShortArray3262 = new short[] { -1, -1, -1, -1, -1 };
		aShortArray3266 = new short[] { 6798, 8741, 25238, 4626, 4550 };
		aShortArrayArray3258 = new short[][] { aShortArray3266,
				aShortArray3262, aShortArray3261 };
	}
}
