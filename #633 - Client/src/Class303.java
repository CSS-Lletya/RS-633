/* Class303 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class303 implements Interface11 {
	private Interface22[] anInterface22Array4075;
	private Class163 aClass163_4076;
	static int anInt4077;
	static int anInt4078;
	private boolean aBool4079;
	static int anInt4080;
	static int anInt4081;
	private Class10 aClass10_4082;
	static int anInt4083;
	static int anInt4084;
	static int anInt4085;
	static int[] anIntArray4086 = new int[3];
	static int anInt4087;
	static int anInt4088;

	public final void method39(int i) {
		try {
			if (aClass163_4076 != Class321_Sub2.aClass163_6648) {
				aBool4079 = true;
				aClass163_4076 = Class321_Sub2.aClass163_6648;
			}
			anInt4085++;
			aClass163_4076.GA(0);
			Interface22[] interface22s = anInterface22Array4075;
			for (int i_0_ = 0; i_0_ < interface22s.length; i_0_++) {
				Interface22 interface22 = interface22s[i_0_];
				if (interface22 != null)
					interface22.method39(11133);
			}
			int i_1_ = -119 % ((15 - i) / 44);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rk.F(" + i + ')');
		}
	}

	public final int method30(int i) {
		try {
			anInt4081++;
			int i_2_ = -110 % ((-16 - i) / 47);
			int i_3_ = 0;
			Interface22[] interface22s = anInterface22Array4075;
			for (int i_4_ = 0; interface22s.length > i_4_; i_4_++) {
				Interface22 interface22 = interface22s[i_4_];
				if (interface22 == null || interface22.method24(-32252))
					i_3_++;
			}
			return 100 * i_3_ / anInterface22Array4075.length;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rk.C(" + i + ')');
		}
	}

	public final boolean method38(long l, int i) {
		try {
			if (i != 14320)
				anIntArray4086 = null;
			anInt4078++;
			if (Class137.method878((byte) -77) < l
					- -(long) ((Class10) aClass10_4082).anInt79)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rk.A(" + l + ',' + i
					+ ')');
		}
	}

	static final void method1866(int i, int i_5_, int i_6_, byte i_7_,
			int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		try {
			if (i_7_ < -17) {
				Class11_Sub33.method2796(i_5_, (byte) -59, i_6_, i_9_, i_8_,
						i_11_, i, 0, i_10_, i_12_);
				anInt4087++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rk.B(" + i + ','
					+ i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_
					+ ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ')'));
		}
	}

	public final void method36(boolean bool, int i) {
		try {
			bool = true;
			anInt4080++;
			Interface22[] interface22s = anInterface22Array4075;
			for (int i_13_ = 0; interface22s.length > i_13_; i_13_++) {
				Interface22 interface22 = interface22s[i_13_];
				if (interface22 != null)
					interface22.method36(bool || aBool4079, -3340);
			}
			if (i != 13751)
				method36(false, -23);
			aBool4079 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rk.J(" + bool + ','
					+ i + ')');
		}
	}

	public final int method4(byte i) {
		try {
			anInt4077++;
			if (i <= 114)
				return 29;
			return ((Class10) aClass10_4082).anInt73;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rk.H(" + i + ')');
		}
	}

	public static void method1867(byte i) {
		try {
			if (i != -86)
				method1868((byte) 3);
			anIntArray4086 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rk.E(" + i + ')');
		}
	}

	public final void method37(boolean bool) {
		try {
			if (bool == true)
				anInt4083++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rk.D(" + bool + ')');
		}
	}

	Class303(Class10 class10, Class265 class265) {
		try {
			aClass10_4082 = class10;
			anInterface22Array4075 = (new Interface22[((Class10) aClass10_4082).anInterface6Array76.length]);
			for (int i = 0; (i ^ 0xffffffff) > (anInterface22Array4075.length ^ 0xffffffff); i++)
				anInterface22Array4075[i] = class265.method1681(5,
						(((Class10) aClass10_4082).anInterface6Array76[i]));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rk.<init>("
					+ (class10 != null ? "{...}" : "null") + ','
					+ (class265 != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method1868(byte i) {
		try {
			anInt4084++;
			int i_14_ = 5 / ((-9 - i) / 40);
			return Class11_Sub45_Sub2.anInt8512;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rk.G(" + i + ')');
		}
	}
}
