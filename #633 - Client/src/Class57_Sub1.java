/* Class57_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class57_Sub1 extends Class57 {
	static int anInt5881;
	static IncomingPacket aClass160_5882 = new IncomingPacket(60, 12);
	int anInt5883;
	static int anInt5884;
	static int anInt5885;
	static Class79 aClass79_5886 = new Class79(4, 1, 1, 1);
	static int anInt5887;
	static float[] aFloatArray5888 = new float[4];

	Class57_Sub1(int i, Class118 class118, Class150 class150, int i_0_,
			int i_1_, int i_2_) {
		super(i, class118, class150, i_0_, i_1_);
		try {
			((Class57_Sub1) this).anInt5883 = i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ed.<init>(" + i + ','
					+ (class118 != null ? "{...}" : "null") + ','
					+ (class150 != null ? "{...}" : "null") + ',' + i_0_ + ','
					+ i_1_ + ',' + i_2_ + ')'));
		}
	}

	public final Class9 method21(boolean bool) {
		try {
			anInt5885++;
			if (bool != false)
				aFloatArray5888 = null;
			return Class117.aClass9_1594;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ed.A(" + bool + ')');
		}
	}

	public static void method2487(byte i) {
		try {
			aFloatArray5888 = null;
			if (i <= 25)
				method2487((byte) 31);
			aClass79_5886 = null;
			aClass160_5882 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ed.E(" + i + ')');
		}
	}

	static final boolean method2488(boolean bool, int i, int i_3_) {
		try {
			anInt5881++;
			if (bool != true)
				method2488(true, -97, -16);
			if ((0x800 & i_3_ ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ed.D(" + bool + ','
					+ i + ',' + i_3_ + ')'));
		}
	}

	static final float method2489(int i, float f, float f_4_, float f_5_) {
		try {
			anInt5887++;
			if (i != 1)
				return -2.144353F;
			return (f_4_ - f) * f_5_ + f;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ed.C(" + i + ',' + f
					+ ',' + f_4_ + ',' + f_5_ + ')'));
		}
	}
}
