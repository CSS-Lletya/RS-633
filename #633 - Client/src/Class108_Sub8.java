/* Class108_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108_Sub8 extends Class108 {
	static IComponentDefinitions aClass192_5734 = null;
	static int anInt5735;
	static int anInt5736;
	static int anInt5737 = -1;
	static int anInt5738;
	static int anInt5739;
	static Class365 aClass365_5740;
	static int anInt5741;
	static int anInt5742;
	static int[][] anIntArrayArray5743 = { { 0, 2, 4, 6 }, { 6, 0, 2, 4 },
			{ 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 },
			{ 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 },
			{ 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 },
			{ 0, 2, 4, 6 } };

	final int method721(int i, int i_0_) {
		try {
			if (i_0_ <= 10)
				method2464(false);
			anInt5739++;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cn.F(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method726(boolean bool) {
		do {
			try {
				if ((((Class108) this).anInt1459 ^ 0xffffffff) > -1
						&& ((Class108) this).anInt1459 > 127)
					((Class108) this).anInt1459 = method725((byte) -95);
				anInt5741++;
				if (bool == false)
					break;
				anIntArrayArray5743 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "cn.E(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	Class108_Sub8(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}

	final int method725(byte i) {
		try {
			anInt5742++;
			int i_1_ = -56 % ((70 - i) / 51);
			return 127;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cn.A(" + i + ')');
		}
	}

	final void method728(int i, int i_2_) {
		try {
			if (i == 0) {
				((Class108) this).anInt1459 = i_2_;
				anInt5736++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cn.C(" + i + ','
					+ i_2_ + ')');
		}
	}

	final int method2462(boolean bool) {
		try {
			anInt5735++;
			if (bool != false)
				anIntArrayArray5743 = null;
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cn.B(" + bool + ')');
		}
	}

	Class108_Sub8(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
	}

	static final void method2463(int i, int i_3_) {
		try {
			Class335_Sub3.anInt7796 = i_3_;
			if (i != -247)
				method2463(-31, -63);
			anInt5738++;
			Class376_Sub7_Sub2_Sub1.aClass22_10204.method189((byte) 69);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cn.G(" + i + ','
					+ i_3_ + ')');
		}
	}

	public static void method2464(boolean bool) {
		try {
			anIntArrayArray5743 = null;
			aClass192_5734 = null;
			if (bool != true)
				method2464(false);
			aClass365_5740 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cn.D(" + bool + ')');
		}
	}
}
