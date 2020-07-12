/* Class322 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class322 {
	static int anInt4303;
	static int anInt4304;
	String aString4305;
	static int anInt4306;
	static int anInt4307;
	static int anInt4308;
	private Class131 aClass131_4309 = new Class131();
	static int anInt4310;
	static int anInt4311;
	static int anInt4312;
	static int anInt4313;
	private volatile int anInt4314;
	private Class13 aClass13_4315;

	final Class376 method1965(boolean bool) {
		try {
			anInt4313++;
			if (bool != true)
				aClass131_4309 = null;
			Object object = null;
			Class376 class376;
			synchronized (aClass131_4309) {
				class376 = aClass131_4309.method847(-31182);
				class376.method2207((byte) -121);
				anInt4314--;
			}
			return class376;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tc.F(" + bool + ')');
		}
	}

	final void method1966(Class376_Sub6 class376_sub6, int i) {
		try {
			synchronized (aClass131_4309) {
				aClass131_4309.method853(0, class376_sub6);
				anInt4314++;
			}
			anInt4306++;
			if (i != -20613)
				method1968(null, -5);
			if (aClass13_4315 != null) {
				synchronized (aClass13_4315) {
					aClass13_4315.notify();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tc.D("
					+ (class376_sub6 != null ? "{...}" : "null") + ',' + i
					+ ')');
		}
	}

	static final boolean method1967(int i, byte i_0_, int i_1_) {
		try {
			if (i_0_ != -44)
				return false;
			anInt4304++;
			return ((Class351.method2104(i_0_ + 144, i, i_1_)
					| (0x2000 & i_1_) != 0 | Class254_Sub3.method3239(127, i,
					i_1_)) & Class37.method315(i_1_, i, i_0_ + 44));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tc.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method1968(Class376_Sub7 class376_sub7, int i) {
		try {
			anInt4308++;
			((Class376_Sub7) class376_sub7).aBool7043 = true;
			synchronized (aClass131_4309) {
				if (i != 8192)
					return;
				aClass131_4309.method853(0, class376_sub7);
				anInt4314++;
			}
			if (aClass13_4315 != null) {
				synchronized (aClass13_4315) {
					aClass13_4315.notify();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tc.E("
					+ (class376_sub7 != null ? "{...}" : "null") + ',' + i
					+ ')');
		}
	}

	final boolean method1969(int i) {
		try {
			anInt4310++;
			if (i <= 59)
				return false;
			if ((anInt4314 ^ 0xffffffff) != -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tc.C(" + i + ')');
		}
	}

	final void method1970(Class13 class13, boolean bool) {
		try {
			if (bool == false) {
				aClass13_4315 = class13;
				anInt4303++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tc.A("
					+ (class13 != null ? "{...}" : "null") + ',' + bool + ')');
		}
	}

	final void method1971(int i, Class376_Sub7 class376_sub7) {
		try {
			((Class376_Sub7) class376_sub7).aBool7043 = false;
			anInt4307++;
			if (i != -1)
				anInt4314 = 13;
			synchronized (aClass131_4309) {
				aClass131_4309.method853(0, class376_sub7);
				anInt4314++;
			}
			if (aClass13_4315 != null) {
				synchronized (aClass13_4315) {
					aClass13_4315.notify();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tc.G(" + i + ','
					+ (class376_sub7 != null ? "{...}" : "null") + ')'));
		}
	}

	Class322(String string) {
		try {
			((Class322) this).aString4305 = string;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tc.<init>("
					+ (string != null ? "{...}" : "null") + ')');
		}
	}
}
