/* Class143 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class143 {
	static int anInt1928;
	static int[] anIntArray1929;
	static int anInt1930;
	Class292 aClass292_1931;
	Class107 aClass107_1932 = null;
	static int anInt1933;

	static final int method899(String string, int i, char c) {
		try {
			anInt1930++;
			int i_0_ = 0;
			int i_1_ = string.length();
			for (int i_2_ = 0; i_1_ > i_2_; i_2_++) {
				if (string.charAt(i_2_) == c)
					i_0_++;
			}
			if (i != -8657)
				anIntArray1929 = null;
			return i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("fj.B(" + (string != null ? "{...}" : "null") + ',' + i
							+ ',' + c + ')'));
		}
	}

	public static void method900(byte i) {
		try {
			if (i >= 48)
				anIntArray1929 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fj.A(" + i + ')');
		}
	}

	static final void method901(int i) {
		try {
			if (i == 0) {
				if (Class111.anInterface11Array1524 != null) {
					Interface11[] interface11s = Class111.anInterface11Array1524;
					for (int i_3_ = 0; ((interface11s.length ^ 0xffffffff) < (i_3_ ^ 0xffffffff)); i_3_++) {
						Interface11 interface11 = interface11s[i_3_];
						interface11.method39(-60);
					}
				}
				anInt1933++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fj.C(" + i + ')');
		}
	}

	Class143(Class107 class107) {
		((Class143) this).aClass292_1931 = null;
		try {
			((Class143) this).aClass107_1932 = class107;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fj.<init>("
					+ (class107 != null ? "{...}" : "null") + ')'));
		}
	}

	Class143(Class107 class107, Class292 class292) {
		((Class143) this).aClass292_1931 = null;
		try {
			((Class143) this).aClass292_1931 = class292;
			((Class143) this).aClass107_1932 = class107;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fj.<init>("
					+ (class107 != null ? "{...}" : "null") + ','
					+ (class292 != null ? "{...}" : "null") + ')'));
		}
	}
}
