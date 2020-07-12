/* Class108_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108_Sub12 extends Class108 {
	static int anInt6223;
	static int anInt6224;
	static int anInt6225;
	static int anInt6226;
	static int anInt6227;
	static int anInt6228 = 104;
	static int anInt6229;
	static int anInt6230;
	static int anInt6231;
	static int anInt6232;

	Class108_Sub12(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}

	final void method728(int i, int i_0_) {
		do {
			try {
				anInt6224++;
				((Class108) this).anInt1459 = i_0_;
				if (i == 0)
					break;
				anInt6226 = -35;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "gn.C(" + i + ','
						+ i_0_ + ')');
			}
			break;
		} while (false);
	}

	final int method2642(boolean bool) {
		try {
			if (bool != false)
				anInt6228 = 62;
			anInt6227++;
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gn.B(" + bool + ')');
		}
	}

	final int method725(byte i) {
		try {
			anInt6223++;
			int i_1_ = -98 / ((i - 70) / 51);
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gn.A(" + i + ')');
		}
	}

	final int method721(int i, int i_2_) {
		try {
			anInt6230++;
			if (i_2_ <= 10)
				return 53;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gn.F(" + i + ','
					+ i_2_ + ')');
		}
	}

	final void method726(boolean bool) {
		try {
			if ((((Class108) this).anInt1459 ^ 0xffffffff) != -2
					&& (((Class108) this).anInt1459 ^ 0xffffffff) != -1)
				((Class108) this).anInt1459 = method725((byte) 123);
			if (bool == false)
				anInt6232++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gn.E(" + bool + ')');
		}
	}

	static final Class62 method2643(int i) {
		try {
			anInt6229++;
			try {
				if (i != 104)
					anInt6228 = 14;
				return (Class62) Class.forName("Class62_Sub1").newInstance();
			} catch (Throwable throwable) {
				return null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gn.D(" + i + ')');
		}
	}

	Class108_Sub12(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
	}
}
