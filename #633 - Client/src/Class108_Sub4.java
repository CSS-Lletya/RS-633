/* Class108_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108_Sub4 extends Class108 {
	static int anInt5378;
	static int anInt5379;
	static int anInt5380;
	static int anInt5381;
	static int anInt5382;
	static int anInt5383;
	static int anInt5384;
	static int anInt5385 = 0;
	static int[][] anIntArrayArray5386;
	static int anInt5387;
	static int anInt5388;

	static final void method2361(int i) {
		try {
			if (i == 0) {
				anInt5383++;
				Class11_Sub5.aClass22_5238.method189((byte) -128);
				Class376_Sub7_Sub2_Sub1.aClass22_10204.method189((byte) 65);
				Class256_Sub3.aClass22_7956.method189((byte) 82);
				Class220.aClass22_3025.method189((byte) 54);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uaa.G(" + i + ')');
		}
	}

	final int method725(byte i) {
		try {
			anInt5380++;
			if (((Class108) this).aClass11_Sub17_1458.method2458(true)
					.method702((byte) -83) < 96)
				return 0;
			int i_0_ = 116 % ((i - 70) / 51);
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uaa.A(" + i + ')');
		}
	}

	final int method2362(boolean bool) {
		try {
			if (bool != false)
				anIntArrayArray5386 = null;
			anInt5379++;
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uaa.B(" + bool + ')');
		}
	}

	final int method721(int i, int i_1_) {
		try {
			anInt5382++;
			if ((((Class108) this).aClass11_Sub17_1458.method2458(true)
					.method702((byte) -83) ^ 0xffffffff) > -97)
				return 3;
			if (i_1_ < 10)
				method721(42, 115);
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uaa.F(" + i + ','
					+ i_1_ + ')');
		}
	}

	Class108_Sub4(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
		try {
			Class11_Sub45_Sub12.method3593((byte) 127,
					((Class108) this).anInt1459);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("uaa.<init>(" + i
					+ ',' + (class11_sub17 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method726(boolean bool) {
		try {
			if (((Class108) this).aClass11_Sub17_1458.method2458(true)
					.method702((byte) -83) < 96)
				((Class108) this).anInt1459 = 0;
			anInt5378++;
			if (bool == false) {
				if (((Class108) this).anInt1459 < 0
						|| ((Class108) this).anInt1459 > 2)
					((Class108) this).anInt1459 = method725((byte) -68);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uaa.E(" + bool + ')');
		}
	}

	final void method728(int i, int i_2_) {
		try {
			anInt5388++;
			((Class108) this).anInt1459 = i_2_;
			if (i != 0)
				method2361(117);
			Class11_Sub45_Sub12.method3593((byte) 126,
					((Class108) this).anInt1459);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uaa.C(" + i + ','
					+ i_2_ + ')');
		}
	}

	Class108_Sub4(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
		try {
			Class11_Sub45_Sub12.method3593((byte) -19,
					((Class108) this).anInt1459);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uaa.<init>("
					+ (class11_sub17 != null ? "{...}" : "null") + ')');
		}
	}

	static final int method2363(boolean bool) {
		try {
			anInt5381++;
			if (bool != true)
				return -125;
			return Class108_Sub25.anInt7821;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uaa.J(" + bool + ')');
		}
	}

	public static void method2364(int i) {
		try {
			if (i < 29)
				method2365((byte) 110);
			anIntArrayArray5386 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uaa.H(" + i + ')');
		}
	}

	static final int method2365(byte i) {
		try {
			if (i != 53)
				method2361(-59);
			anInt5387++;
			if ((OutputStream_Sub1.anInt5845 ^ 0xffffffff) == -2)
				return Class11_Sub33.anInt6897;
			return Class376_Sub7_Sub3_Sub2.anInt10143;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uaa.I(" + i + ')');
		}
	}

	final boolean method2366(byte i) {
		try {
			if (i != -53)
				anIntArrayArray5386 = null;
			anInt5384++;
			if ((((Class108) this).aClass11_Sub17_1458.method2458(true)
					.method702((byte) -83) ^ 0xffffffff) > -97)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uaa.D(" + i + ')');
		}
	}
}
