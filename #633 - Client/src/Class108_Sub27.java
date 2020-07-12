/* Class108_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108_Sub27 extends Class108 {
	static int anInt7861;
	static int anInt7862;
	static int anInt7863;
	static int[] anIntArray7864;
	static String[] aStringArray7865 = new String[5];
	static int anInt7866;
	static int anInt7867;

	final int method721(int i, int i_0_) {
		try {
			anInt7863++;
			if (i_0_ <= 10)
				anIntArray7864 = null;
			return 3;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ui.F(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method728(int i, int i_1_) {
		try {
			if (i != 0)
				method3159((byte) 13);
			anInt7862++;
			((Class108) this).anInt1459 = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ui.C(" + i + ','
					+ i_1_ + ')');
		}
	}

	final int method3158(boolean bool) {
		try {
			if (bool != false)
				anIntArray7864 = null;
			anInt7867++;
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ui.B(" + bool + ')');
		}
	}

	Class108_Sub27(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}

	final void method726(boolean bool) {
		try {
			((Class108) this).anInt1459 = method725((byte) 125);
			if (bool != false)
				method728(-70, -61);
			anInt7861++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ui.E(" + bool + ')');
		}
	}

	public static void method3159(byte i) {
		do {
			try {
				aStringArray7865 = null;
				anIntArray7864 = null;
				if (i == -64)
					break;
				method3159((byte) 105);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ui.D(" + i + ')');
			}
			break;
		} while (false);
	}

	Class108_Sub27(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
	}

	final int method725(byte i) {
		try {
			anInt7866++;
			int i_2_ = 101 / ((70 - i) / 51);
			if ((((Class108) this).aClass11_Sub17_1458.method2454(-21) == Class142.aClass66_1925)
					&& ((Class108) this).aClass11_Sub17_1458.method2456(-18373))
				return 0;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ui.A(" + i + ')');
		}
	}
}
