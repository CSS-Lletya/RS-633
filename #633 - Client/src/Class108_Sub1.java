/* Class108_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108_Sub1 extends Class108 {
	static int anInt5024;
	static int anInt5025;
	static Class146 aClass146_5026;
	static int anInt5027 = -1;
	static Class150 aClass150_5028 = new Class150();
	static int anInt5029;
	static int anInt5030;
	static int anInt5031;
	static int anInt5032;
	static int anInt5033;

	Class108_Sub1(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}

	final int method2250(boolean bool) {
		try {
			if (bool != false)
				method2250(false);
			anInt5025++;
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cea.B(" + bool + ')');
		}
	}

	final int method725(byte i) {
		try {
			anInt5030++;
			int i_0_ = 53 / ((i - 70) / 51);
			if ((((Class108) this).aClass11_Sub17_1458.method2458(true)
					.method700(false) ^ 0xffffffff) < -2)
				return 4;
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cea.A(" + i + ')');
		}
	}

	final void method726(boolean bool) {
		do {
			try {
				anInt5024++;
				if (bool != false)
					aClass150_5028 = null;
				if (((Class108) this).anInt1459 >= 0
						|| (((Class108) this).anInt1459 ^ 0xffffffff) >= -5)
					break;
				((Class108) this).anInt1459 = method725((byte) -88);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "cea.E(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	Class108_Sub1(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
	}

	static final boolean method2251(char c, boolean bool) {
		try {
			if (bool != false)
				anInt5029 = -75;
			anInt5031++;
			if ((c ^ 0xffffffff) < -1 && (c ^ 0xffffffff) > -129 || c >= 160
					&& c <= 255)
				return true;
			if (c != 0) {
				char[] cs = Class108.aCharArray1465;
				for (int i = 0; (i ^ 0xffffffff) > (cs.length ^ 0xffffffff); i++) {
					int i_1_ = cs[i];
					if ((i_1_ ^ 0xffffffff) == (c ^ 0xffffffff))
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cea.G(" + c + ','
					+ bool + ')');
		}
	}

	final void method728(int i, int i_2_) {
		do {
			try {
				((Class108) this).anInt1459 = i_2_;
				anInt5032++;
				if (i == 0)
					break;
				aClass150_5028 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "cea.C(" + i + ','
						+ i_2_ + ')');
			}
			break;
		} while (false);
	}

	public static void method2252(int i) {
		try {
			if (i != -129)
				method2252(99);
			aClass150_5028 = null;
			aClass146_5026 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cea.D(" + i + ')');
		}
	}

	final int method721(int i, int i_3_) {
		try {
			anInt5033++;
			if (i_3_ < 10)
				return -29;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cea.F(" + i + ','
					+ i_3_ + ')');
		}
	}
}
