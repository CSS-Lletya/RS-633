/* Class205 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class205 {
	static Class11_Sub16 aClass11_Sub16_2755;
	static int anInt2756;
	static int anInt2757;
	public static int anInt2758;
	static int anInt2759;
	static Class240 aClass240_2760;
	static Class302 aClass302_2761;
	static int anInt2762;
	static int anInt2763 = 1;
	static int anInt2764;

	public static void method1297(byte i) {
		try {
			if (i == -117) {
				aClass11_Sub16_2755 = null;
				aClass302_2761 = null;
				aClass240_2760 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw method1298(runtimeexception, "maa.D(" + i + ')');
		}
	}

	static final RuntimeException_Sub1 method1298(Throwable throwable,
			String string) {
		try {
			anInt2756++;
			RuntimeException_Sub1 runtimeexception_sub1;
			if (throwable instanceof RuntimeException_Sub1) {
				runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
				((RuntimeException_Sub1) runtimeexception_sub1).aString9963 += ' ' + (String) string;
			} else
				runtimeexception_sub1 = new RuntimeException_Sub1(throwable,
						string);
			return runtimeexception_sub1;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static final void method1299(int i) {
		try {
			Class195_Sub1.aClass22_6153.method189((byte) 19);
			if (i >= 0)
				anInt2764++;
		} catch (RuntimeException runtimeexception) {
			throw method1298(runtimeexception, "maa.E(" + i + ')');
		}
	}

	static final int method1300(int i, int i_0_) {
		try {
			int i_1_ = 122 % ((-32 - i) / 53);
			anInt2759++;
			return 0x3ff & i_0_;
		} catch (RuntimeException runtimeexception) {
			throw method1298(runtimeexception, "maa.B(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method1301(boolean bool) {
		try {
			synchronized (Class207.aClass22_2795) {
				Class207.aClass22_2795.method189((byte) 121);
				if (bool != true)
					anInt2757 = -127;
			}
			anInt2762++;
		} catch (RuntimeException runtimeexception) {
			throw method1298(runtimeexception, "maa.C(" + bool + ')');
		}
	}

	static {
		aClass240_2760 = new Class240();
	}
}
