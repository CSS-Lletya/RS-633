/* Class108_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108_Sub28 extends Class108 {
	private boolean aBool7890;
	static int anInt7891;
	static int anInt7892;
	static int anInt7893;
	boolean aBool7894 = false;
	static int anInt7895;
	static int anInt7896;
	static int anInt7897;
	static int anInt7898;
	static int anInt7899;
	static int anInt7900;
	static boolean aBool7901 = true;

	final void method726(boolean bool) {
		do {
			try {
				if (!((Class108) this).aClass11_Sub17_1458.method2458(!bool)
						.method701((byte) -19))
					((Class108) this).anInt1459 = 0;
				anInt7899++;
				if ((((Class108) this).anInt1459 ^ 0xffffffff) > -1
						|| (((Class108) this).anInt1459 ^ 0xffffffff) < -6)
					((Class108) this).anInt1459 = method725((byte) 5);
				if (bool == false)
					break;
				method3183(-57);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "uw.E(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	static final boolean method3180(int i, boolean bool) {
		try {
			anInt7895++;
			if (bool != false)
				aBool7901 = false;
			if ((i ^ 0xffffffff) != -2 && i != 3 && i != 5)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uw.I(" + i + ','
					+ bool + ')');
		}
	}

	Class108_Sub28(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
		aBool7890 = true;
	}

	final int method3181(boolean bool) {
		try {
			anInt7897++;
			if (bool != false)
				aBool7890 = true;
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uw.B(" + bool + ')');
		}
	}

	final boolean method3182(byte i) {
		try {
			anInt7893++;
			if (!((Class108) this).aClass11_Sub17_1458.method2458(true)
					.method701((byte) -19))
				return false;
			if (i != -53)
				return true;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uw.D(" + i + ')');
		}
	}

	final boolean method3183(int i) {
		try {
			if (i != 5)
				aBool7890 = false;
			anInt7892++;
			return aBool7890;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uw.G(" + i + ')');
		}
	}

	final int method721(int i, int i_0_) {
		try {
			anInt7900++;
			if (!((Class108) this).aClass11_Sub17_1458.method2458(true)
					.method701((byte) -19))
				return 3;
			if (i == 3 && !Class193.method1266("jagdx", -26))
				return 3;
			if (i_0_ <= 10)
				return 58;
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uw.F(" + i + ','
					+ i_0_ + ')');
		}
	}

	Class108_Sub28(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
		aBool7890 = true;
	}

	final void method3184(boolean bool, boolean bool_1_) {
		do {
			try {
				aBool7890 = bool_1_;
				anInt7891++;
				if (bool == false)
					break;
				method3183(-100);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("uw.H(" + bool
						+ ',' + bool_1_ + ')'));
			}
			break;
		} while (false);
	}

	final void method728(int i, int i_2_) {
		try {
			if (i != 0)
				aBool7890 = false;
			((Class108) this).anInt1459 = i_2_;
			anInt7896++;
			((Class108_Sub28) this).aBool7894 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uw.C(" + i + ','
					+ i_2_ + ')');
		}
	}

	final int method725(byte i) {
		try {
			anInt7898++;
			((Class108_Sub28) this).aBool7894 = true;
			int i_3_ = 78 % ((i - 70) / 51);
			if (!((Class108) this).aClass11_Sub17_1458.method2458(true)
					.method701((byte) -19))
				return 0;
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uw.A(" + i + ')');
		}
	}
}
