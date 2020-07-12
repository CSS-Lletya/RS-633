/* Class213 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class213 {
	Class11[] aClass11Array2883;
	static int anInt2884;
	static int anInt2885;
	int anInt2886;
	static int anInt2887;
	static int anInt2888;
	static int anInt2889;
	static int anInt2890;
	static int anInt2891;
	static int anInt2892;
	static int anInt2893;
	private Class11 aClass11_2894;
	static int anInt2895;
	private long aLong2896;
	private Class11 aClass11_2897;
	private int anInt2898 = 0;

	final Class11 method1363(int i) {
		try {
			anInt2885++;
			if (i != 0)
				method1371((byte) -41, null);
			if (aClass11_2894 == null)
				return null;
			for (Class11 class11 = (((Class213) this).aClass11Array2883[(int) (aLong2896 & (long) (-1 + ((Class213) this).anInt2886))]); class11 != aClass11_2894; aClass11_2894 = ((Class11) aClass11_2894).aClass11_88) {
				if ((((Class11) aClass11_2894).aLong91 ^ 0xffffffffffffffffL) == (aLong2896 ^ 0xffffffffffffffffL)) {
					Class11 class11_0_ = aClass11_2894;
					aClass11_2894 = ((Class11) aClass11_2894).aClass11_88;
					return class11_0_;
				}
			}
			aClass11_2894 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kk.B(" + i + ')');
		}
	}

	final void method1364(byte i) {
		try {
			anInt2888++;
			if (i >= 67) {
				for (int i_1_ = 0; ((Class213) this).anInt2886 > i_1_; i_1_++) {
					Class11 class11 = ((Class213) this).aClass11Array2883[i_1_];
					for (;;) {
						Class11 class11_2_ = ((Class11) class11).aClass11_88;
						if (class11_2_ == class11)
							break;
						class11_2_.method122(-31);
					}
				}
				aClass11_2897 = null;
				aClass11_2894 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kk.F(" + i + ')');
		}
	}

	final Class11 method1365(int i) {
		try {
			anInt2898 = 0;
			if (i != 24490)
				return null;
			anInt2895++;
			return method1367((byte) 71);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kk.H(" + i + ')');
		}
	}

	final int method1366(int i) {
		try {
			anInt2892++;
			int i_3_ = -113 % ((2 - i) / 34);
			int i_4_ = 0;
			for (int i_5_ = 0; ((((Class213) this).anInt2886 ^ 0xffffffff) < (i_5_ ^ 0xffffffff)); i_5_++) {
				Class11 class11 = ((Class213) this).aClass11Array2883[i_5_];
				for (Class11 class11_6_ = ((Class11) class11).aClass11_88; class11_6_ != class11; class11_6_ = ((Class11) class11_6_).aClass11_88)
					i_4_++;
			}
			return i_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kk.I(" + i + ')');
		}
	}

	final Class11 method1367(byte i) {
		try {
			anInt2890++;
			if (anInt2898 > 0
					&& (aClass11_2897 != ((Class213) this).aClass11Array2883[-1
							+ anInt2898])) {
				Class11 class11 = aClass11_2897;
				aClass11_2897 = ((Class11) class11).aClass11_88;
				return class11;
			}
			if (i != 71)
				method1364((byte) -104);
			while (anInt2898 < ((Class213) this).anInt2886) {
				Class11 class11 = (((Class11) ((Class213) this).aClass11Array2883[anInt2898++]).aClass11_88);
				if (class11 != ((Class213) this).aClass11Array2883[-1
						+ anInt2898]) {
					aClass11_2897 = ((Class11) class11).aClass11_88;
					return class11;
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kk.A(" + i + ')');
		}
	}

	final void method1368(long l, Class11 class11, byte i) {
		try {
			if (((Class11) class11).aClass11_90 != null)
				class11.method122(i - 16);
			anInt2887++;
			if (i == -26) {
				Class11 class11_7_ = (((Class213) this).aClass11Array2883[(int) (l & (long) (((Class213) this).anInt2886 - 1))]);
				((Class11) class11).aClass11_88 = class11_7_;
				((Class11) class11).aClass11_90 = ((Class11) class11_7_).aClass11_90;
				((Class11) ((Class11) class11).aClass11_90).aClass11_88 = class11;
				((Class11) class11).aLong91 = l;
				((Class11) ((Class11) class11).aClass11_88).aClass11_90 = class11;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kk.C(" + l + ','
					+ (class11 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final Class11 method1369(byte i, long l) {
		try {
			anInt2891++;
			aLong2896 = l;
			Class11 class11 = (((Class213) this).aClass11Array2883[(int) ((long) (-1 + ((Class213) this).anInt2886) & l)]);
			if (i != 26)
				anInt2898 = 88;
			for (aClass11_2894 = ((Class11) class11).aClass11_88; aClass11_2894 != class11; aClass11_2894 = ((Class11) aClass11_2894).aClass11_88) {
				if (l == ((Class11) aClass11_2894).aLong91) {
					Class11 class11_8_ = aClass11_2894;
					aClass11_2894 = ((Class11) aClass11_2894).aClass11_88;
					return class11_8_;
				}
			}
			aClass11_2894 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kk.J(" + i + ',' + l
					+ ')');
		}
	}

	final int method1370(Class11[] class11s, int i) {
		try {
			anInt2889++;
			if (i != -1)
				((Class213) this).anInt2886 = 88;
			int i_9_ = 0;
			for (int i_10_ = 0; i_10_ < ((Class213) this).anInt2886; i_10_++) {
				Class11 class11 = ((Class213) this).aClass11Array2883[i_10_];
				for (Class11 class11_11_ = ((Class11) class11).aClass11_88; class11_11_ != class11; class11_11_ = ((Class11) class11_11_).aClass11_88)
					class11s[i_9_++] = class11_11_;
			}
			return i_9_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kk.G("
					+ (class11s != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final Class256_Sub1 method1371(byte i, Stream stream) {
		try {
			if (i != 57)
				method1371((byte) 112, null);
			anInt2884++;
			return new Class256_Sub1(stream.method2508((byte) 66),
					stream.method2508((byte) -123),
					stream.method2508((byte) -88),
					stream.method2508((byte) -84), stream.method2558(false),
					stream.method2558(false),
					stream.readUnsignedByte((byte) 35));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kk.D(" + i + ','
					+ (stream != null ? "{...}" : "null") + ')'));
		}
	}

	final int method1372(int i) {
		try {
			if (i != 0)
				method1368(45L, null, (byte) -45);
			anInt2893++;
			return ((Class213) this).anInt2886;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kk.E(" + i + ')');
		}
	}

	Class213(int i) {
		try {
			((Class213) this).aClass11Array2883 = new Class11[i];
			((Class213) this).anInt2886 = i;
			for (int i_12_ = 0; i_12_ < i; i_12_++) {
				Class11 class11 = (((Class213) this).aClass11Array2883[i_12_] = new Class11());
				((Class11) class11).aClass11_90 = class11;
				((Class11) class11).aClass11_88 = class11;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kk.<init>(" + i + ')');
		}
	}
}
