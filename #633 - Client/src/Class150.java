/* Class150 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class150 {
	static int anInt2001;
	static Class146 aClass146_2002;
	static int anInt2003 = 0;
	static int anInt2004;
	static int anInt2005;
	static int anInt2006;

	final int method948(int i, int i_0_, int i_1_) {
		try {
			anInt2004++;
			int i_2_ = ((i_1_ ^ 0xffffffff) <= (Class153.anInt2025 ^ 0xffffffff) ? i_1_
					: Class153.anInt2025);
			if (this == Class11_Sub2_Sub3.aClass150_8466)
				return 0;
			if (i_0_ != 0)
				method948(29, 54, 64);
			if (this == Class108_Sub1.aClass150_5028)
				return i_2_ + -i;
			if (this == Class53.aClass150_816)
				return (-i + i_2_) / 2;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fv.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	public final String toString() {
		try {
			anInt2006++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fv.toString(" + ')');
		}
	}

	public Class150() {
		/* empty */
	}

	public static void method949(int i) {
		try {
			if (i != 2)
				method949(-13);
			aClass146_2002 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fv.A(" + i + ')');
		}
	}

	static final void method950(boolean bool, int i, byte i_3_) {
		try {
			anInt2005++;
			if (i_3_ != 95)
				anInt2001 = 34;
			Class11_Sub37 class11_sub37 = Class26.method218(bool, i_3_ - 9949,
					i);
			if (class11_sub37 != null)
				class11_sub37.method122(-82);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fv.C(" + bool + ','
					+ i + ',' + i_3_ + ')'));
		}
	}
}
