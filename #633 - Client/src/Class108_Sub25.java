/* Class108_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108_Sub25 extends Class108 {
	static int anInt7815;
	static int anInt7816;
	static int anInt7817;
	static int anInt7818;
	static int anInt7819;
	static int anInt7820;
	static int anInt7821;

	final int method725(byte i) {
		try {
			anInt7815++;
			int i_0_ = 9 % ((i - 70) / 51);
			if (((Class108) this).aClass11_Sub17_1458.method2456(-18373))
				return 1;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tu.A(" + i + ')');
		}
	}

	static final void method3145(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		if (Class108_Sub26.anIntArrayArray7831 != null)
			Class108_Sub26.anIntArrayArray7831[i][i_1_] = ~0xffffff | i_2_;
		if (Class11_Sub50_Sub2.aShortArrayArray9079 != null)
			Class11_Sub50_Sub2.aShortArrayArray9079[i][i_1_] = (short) i_3_;
		if (Class11_Sub39.aByteArrayArray7200 != null)
			Class11_Sub39.aByteArrayArray7200[i][i_1_] = (byte) i_4_;
	}

	Class108_Sub25(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
	}

	Class108_Sub25(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}

	final int method3146(boolean bool) {
		try {
			anInt7820++;
			if (bool != false)
				method725((byte) -124);
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tu.B(" + bool + ')');
		}
	}

	final int method721(int i, int i_5_) {
		try {
			anInt7818++;
			if (i_5_ <= 10)
				anInt7817 = 52;
			return 3;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tu.F(" + i + ','
					+ i_5_ + ')');
		}
	}

	final void method728(int i, int i_6_) {
		do {
			try {
				((Class108) this).anInt1459 = i_6_;
				anInt7816++;
				if (i == 0)
					break;
				anInt7821 = 7;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "tu.C(" + i + ','
						+ i_6_ + ')');
			}
			break;
		} while (false);
	}

	final void method726(boolean bool) {
		try {
			((Class108) this).anInt1459 = method725((byte) 127);
			if (bool != false)
				anInt7821 = 1;
			anInt7819++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tu.E(" + bool + ')');
		}
	}
}
