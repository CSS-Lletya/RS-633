/* Class313 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class313 {
	static Class153 aClass153_4152;
	static boolean aBool4153;
	private Class213 aClass213_4154;
	static Class253[] aClass253Array4155;
	static int anInt4156;
	static int anInt4157;
	static int anInt4158;
	static boolean[] aBoolArray4159 = new boolean[100];
	private int anInt4160 = 0;
	static long aLong4161;
	static int anInt4162;
	static int anInt4163;
	private Class11 aClass11_4164;

	final Class11 method1905(byte i) {
		try {
			anInt4158++;
			if ((anInt4160 ^ 0xffffffff) < -1
					&& (((Class213) aClass213_4154).aClass11Array2883[-1
							+ anInt4160]) != aClass11_4164) {
				Class11 class11 = aClass11_4164;
				aClass11_4164 = ((Class11) class11).aClass11_88;
				return class11;
			}
			while ((anInt4160 ^ 0xffffffff) > (((Class213) aClass213_4154).anInt2886 ^ 0xffffffff)) {
				Class11 class11 = (((Class11) (((Class213) aClass213_4154).aClass11Array2883[anInt4160++])).aClass11_88);
				if (class11 != (((Class213) aClass213_4154).aClass11Array2883[-1
						+ anInt4160])) {
					aClass11_4164 = ((Class11) class11).aClass11_88;
					return class11;
				}
			}
			if (i >= -82)
				method1906(-111, (byte) 84, -124);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sh.E(" + i + ')');
		}
	}

	static final boolean method1906(int i, byte i_0_, int i_1_) {
		try {
			if (i_0_ <= 58)
				anInt4162 = -116;
			anInt4163++;
			if ((i & 0x800 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sh.D(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	final Class11 method1907(int i) {
		try {
			anInt4160 = i;
			anInt4156++;
			return method1905((byte) -113);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sh.B(" + i + ')');
		}
	}

	static final void method1908(boolean bool) {
		do {
			try {
				anInt4157++;
				Class195_Sub1.aClass22_6153.method190(0);
				if (bool == false)
					break;
				method1909(-18);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "sh.C(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	public static void method1909(int i) {
		try {
			aClass153_4152 = null;
			aBoolArray4159 = null;
			if (i == 30328)
				aClass253Array4155 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sh.A(" + i + ')');
		}
	}

	public Class313() {
		/* empty */
	}

	Class313(Class213 class213) {
		try {
			aClass213_4154 = class213;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sh.<init>("
					+ (class213 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aBool4153 = true;
		aLong4161 = 0L;
		anInt4162 = 0;
	}
}
