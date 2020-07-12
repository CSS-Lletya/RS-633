/* Class108_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108_Sub24 extends Class108 {
	static int anInt7810;
	static int anInt7811;
	static int anInt7812;
	static int anInt7813;
	static int anInt7814;

	final void method726(boolean bool) {
		try {
			if (bool == false) {
				if (((Class11_Sub17) ((Class108) this).aClass11_Sub17_1458).aClass108_Sub17_5731
						.method2736((byte) -114)
						&& ((Class108) this).anInt1459 == 2)
					((Class108) this).anInt1459 = 1;
				anInt7811++;
				if ((((Class108) this).anInt1459 ^ 0xffffffff) > -1
						|| (((Class108) this).anInt1459 ^ 0xffffffff) < -3)
					((Class108) this).anInt1459 = method725((byte) -90);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tq.E(" + bool + ')');
		}
	}

	Class108_Sub24(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}

	Class108_Sub24(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
	}

	final int method721(int i, int i_0_) {
		try {
			if (i_0_ <= 10)
				method725((byte) -128);
			anInt7810++;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tq.F(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method728(int i, int i_1_) {
		try {
			((Class108) this).anInt1459 = i_1_;
			if (i == 0)
				anInt7812++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tq.C(" + i + ','
					+ i_1_ + ')');
		}
	}

	final int method725(byte i) {
		try {
			anInt7813++;
			int i_2_ = 98 / ((70 - i) / 51);
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tq.A(" + i + ')');
		}
	}

	final int method3144(boolean bool) {
		try {
			anInt7814++;
			if (bool != false)
				return -120;
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tq.B(" + bool + ')');
		}
	}
}
