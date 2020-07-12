/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class30 {
	static int anInt402;
	static Class175 aClass175_403;
	static int anInt404;
	static boolean aBool405 = false;
	static int anInt406;
	static volatile long aLong407 = 0L;

	public static void method254(byte i) {
		try {
			aClass175_403 = null;
			int i_0_ = -114 / ((47 - i) / 55);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pga.C(" + i + ')');
		}
	}

	static final boolean method255(char c, boolean bool) {
		try {
			anInt406++;
			if (bool != false)
				aClass175_403 = null;
			if (c != '\u00a0' && c != ' ' && c != '_' && c != '-')
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pga.B(" + c + ','
					+ bool + ')');
		}
	}

	static final void method256(Player class376_sub7_sub5_sub5_sub1, int i,
			byte i_1_, int i_2_) {
		try {
			anInt402++;
			if (i_1_ != 4)
				method254((byte) 7);
			int[] is = new int[4];
			Class311.method1899(is, 0, is.length, i);
			Class11_Sub46_Sub1.method3468(i_1_ ^ ~0x4, is, i_2_,
					class376_sub7_sub5_sub5_sub1);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pga.A("
					+ (class376_sub7_sub5_sub5_sub1 != null ? "{...}" : "null")
					+ ',' + i + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}
}
