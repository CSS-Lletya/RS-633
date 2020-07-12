/* Class108_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108_Sub5 extends Class108 {
	static Class79 aClass79_5403 = new Class79(15, 0, 1, 0);
	static int anInt5404;
	static int anInt5405;
	static int anInt5406;
	static int anInt5407;
	static int anInt5408;
	static int anInt5409;

	final int method2373(boolean bool) {
		try {
			if (bool != false)
				return 126;
			anInt5406++;
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "daa.B(" + bool + ')');
		}
	}

	final int method721(int i, int i_0_) {
		try {
			anInt5408++;
			if (i_0_ <= 10)
				aClass79_5403 = null;
			if (((Class108) this).aClass11_Sub17_1458.method2456(-18373))
				return 3;
			if (i == 0
					|| ((Class11_Sub17) ((Class108) this).aClass11_Sub17_1458).aClass108_Sub16_5721
							.method2710(false) == 1)
				return 1;
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "daa.F(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method726(boolean bool) {
		do {
			try {
				if (((Class108) this).aClass11_Sub17_1458.method2456(-18373))
					((Class108) this).anInt1459 = 0;
				anInt5404++;
				if (((Class108) this).anInt1459 < 0
						&& ((Class108) this).anInt1459 > 2)
					((Class108) this).anInt1459 = method725((byte) 15);
				if (bool == false)
					break;
				method2373(true);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "daa.E(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	final int method725(byte i) {
		try {
			int i_1_ = -60 % ((i - 70) / 51);
			anInt5407++;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "daa.A(" + i + ')');
		}
	}

	final boolean method2374(byte i) {
		try {
			anInt5409++;
			if (((Class108) this).aClass11_Sub17_1458.method2456(i ^ 0x47f0))
				return false;
			if (i != -53)
				method2373(false);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "daa.D(" + i + ')');
		}
	}

	public static void method2375(int i) {
		try {
			if (i != 12275)
				aClass79_5403 = null;
			aClass79_5403 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "daa.G(" + i + ')');
		}
	}

	final void method728(int i, int i_2_) {
		try {
			if (i != 0)
				aClass79_5403 = null;
			((Class108) this).anInt1459 = i_2_;
			anInt5405++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "daa.C(" + i + ','
					+ i_2_ + ')');
		}
	}

	Class108_Sub5(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
	}

	Class108_Sub5(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}
}
