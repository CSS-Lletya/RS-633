/* Class11_Sub45_Sub9_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub45_Sub9_Sub2 extends Class11_Sub45_Sub9 {
	static int anInt10260;
	static IncomingPacket aClass160_10261 = new IncomingPacket(15, 10);
	static int anInt10262;
	private Object anObject10263;
	static int anInt10264;
	static float[][] aFloatArrayArray10265 = {
			{ -0.333333F, -0.333333F, -0.333333F },
			{ 0.333333F, -0.333333F, -0.333333F },
			{ -0.333333F, 0.333333F, -0.333333F },
			{ 0.333333F, 0.333333F, -0.333333F },
			{ -0.333333F, -0.333333F, 0.333333F },
			{ 0.333333F, -0.333333F, 0.333333F },
			{ -0.333333F, 0.333333F, 0.333333F },
			{ 0.333333F, 0.333333F, 0.333333F } };

	Class11_Sub45_Sub9_Sub2(Object object, int i) {
		super(i);
		try {
			anObject10263 = object;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("uo.<init>("
					+ (object != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final boolean method3951(byte i, int i_0_, int i_1_) {
		try {
			anInt10264++;
			int i_2_ = -40 / ((i + 38) / 62);
			if ((i_0_ & 0x22) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("uo.D(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	final Object method3483(int i) {
		try {
			if (i <= 43)
				return null;
			anInt10262++;
			return anObject10263;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uo.A(" + i + ')');
		}
	}

	final boolean method3485(byte i) {
		try {
			anInt10260++;
			if (i <= 97)
				method3952((byte) 71);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uo.C(" + i + ')');
		}
	}

	public static void method3952(byte i) {
		do {
			try {
				aFloatArrayArray10265 = null;
				aClass160_10261 = null;
				if (i <= -117)
					break;
				aClass160_10261 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "uo.B(" + i + ')');
			}
			break;
		} while (false);
	}
}
