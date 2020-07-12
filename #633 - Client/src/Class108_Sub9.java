/* Class108_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108_Sub9 extends Class108 {
	static int anInt6096;
	static int anInt6097;
	static int anInt6098;
	static int anInt6099;
	static int anInt6100;
	static int anInt6101;
	static int anInt6102;

	final int method725(byte i) {
		try {
			anInt6096++;
			int i_0_ = 46 / ((i - 70) / 51);
			return 3;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fc.A(" + i + ')');
		}
	}

	final int method2607(boolean bool) {
		try {
			anInt6097++;
			if (bool != false)
				method721(-10, 80);
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fc.B(" + bool + ')');
		}
	}

	static final Class376_Sub7_Sub4 method2608(int i, int i_1_, int i_2_) {
		Class364 class364 = Class181.aClass364ArrayArrayArray2336[i][i_1_][i_2_];
		if (class364 == null)
			return null;
		return ((Class364) class364).aClass376_Sub7_Sub4_4778;
	}

	final void method728(int i, int i_3_) {
		try {
			((Class108) this).anInt1459 = i_3_;
			if (i != 0)
				anInt6099 = 89;
			anInt6101++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fc.C(" + i + ','
					+ i_3_ + ')');
		}
	}

	final void method726(boolean bool) {
		do {
			try {
				if (((Class108) this).anInt1459 < 0
						|| (((Class108) this).anInt1459 ^ 0xffffffff) < -5)
					((Class108) this).anInt1459 = method725((byte) 6);
				anInt6102++;
				if (bool == false)
					break;
				anInt6100 = -114;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "fc.E(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	Class108_Sub9(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}

	final int method721(int i, int i_4_) {
		try {
			anInt6098++;
			if (i_4_ <= 10)
				anInt6100 = 78;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fc.F(" + i + ','
					+ i_4_ + ')');
		}
	}

	Class108_Sub9(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
	}
}
