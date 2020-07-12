/* Class141 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class141 {
	private Class178[] aClass178Array1901;
	private int anInt1902 = -1;
	static int anInt1903;
	private boolean aBool1904 = true;
	static int anInt1905;
	static Class281[] aClass281Array1906;
	private int anInt1907;
	static int anInt1908;
	private Class178 aClass178_1909;
	static int anInt1910;
	private int anInt1911;
	private Class253 aClass253_1912;
	private int anInt1913;
	static int anInt1914;
	static int anInt1915 = 0;
	static int anInt1916;
	private Class178[] aClass178Array1917;
	private int anInt1918;
	private int anInt1919;
	private int anInt1920;

	final boolean method890(int i, int i_0_, Class163 class163) {
		try {
			if (i_0_ != 12162)
				anInt1902 = 65;
			anInt1910++;
			if ((anInt1902 ^ 0xffffffff) != (i ^ 0xffffffff)) {
				anInt1902 = i;
				int i_1_ = Class94.method635(-1350259935, i);
				if ((i_1_ ^ 0xffffffff) < -513)
					i_1_ = 512;
				if (i_1_ <= 0)
					i_1_ = 1;
				if (i_1_ != anInt1919) {
					anInt1919 = i_1_;
					aClass253_1912 = null;
				}
				if (aClass178Array1901 != null) {
					anInt1907 = 0;
					int[] is = new int[aClass178Array1901.length];
					for (int i_2_ = 0; ((i_2_ ^ 0xffffffff) > (aClass178Array1901.length ^ 0xffffffff)); i_2_++) {
						Class178 class178 = aClass178Array1901[i_2_];
						if (class178.method1152(anInt1920, anInt1911,
								anInt1918, anInt1902)) {
							is[anInt1907] = ((Class178) class178).anInt2259;
							aClass178Array1917[anInt1907++] = class178;
						}
					}
					Class11_Sub11.method2371(0, aClass178Array1917, is, true,
							anInt1907 - 1);
				}
				aBool1904 = true;
			}
			boolean bool = false;
			if (aBool1904) {
				aBool1904 = false;
				for (int i_3_ = anInt1907 - 1; (i_3_ ^ 0xffffffff) <= -1; i_3_--) {
					boolean bool_4_ = aClass178Array1917[i_3_].method1156(
							class163, aClass178_1909);
					Class141 class141_5_ = this;
					class141_5_.aBool1904 = class141_5_.aBool1904 | !bool_4_;
					bool |= bool_4_;
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(
							runtimeexception,
							("fh.C(" + i + ',' + i_0_ + ','
									+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method891(byte i, boolean bool) {
		try {
			Class34.method304((byte) -99);
			anInt1905++;
			if (Class2_Sub5.method2400((byte) 35, Class285.anInt3846)) {
				Class70.anInt984++;
				if (Class70.anInt984 >= 50 || bool) {
					Class70.anInt984 = 0;
					if (i <= 43)
						aClass281Array1906 = null;
					if (!Class38.aBool505
							&& Class108_Sub2.aClass217_5081 != null) {
						Class11_Sub45_Sub1_Sub2.anInt9876++;
						Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
								(Class11_Sub3.aClass25_5113),
								(Class234_Sub1.aClass370_5644), (byte) -122);
						Class79.method541(class11_sub10, -89);
						try {
							Class234_Sub2_Sub2.method3540((byte) -13);
						} catch (java.io.IOException ioexception) {
							Class38.aBool505 = true;
						}
					}
					Class34.method304((byte) 85);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fh.B(" + i + ','
					+ bool + ')');
		}
	}

	public static void method892(int i) {
		do {
			try {
				aClass281Array1906 = null;
				if (i == -1)
					break;
				method892(-23);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "fh.E(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method893(int i, int i_6_, int i_7_, int i_8_, int i_9_,
			int i_10_, int i_11_, int i_12_, int i_13_, Class163 class163) {
		do {
			try {
				anInt1916++;
				i_6_ = i_9_ + i_6_ & 0x3fff;
				if (anInt1913 == -1 || (anInt1919 ^ 0xffffffff) == -1)
					class163.aa(i_11_, i_7_, i_13_, i_12_, i, 0);
				else {
					Class188 class188 = Class129.anInterface1_1753.method7(
							(byte) 127, anInt1913);
					if (aClass253_1912 == null
							&& Class129.anInterface1_1753.method2(anInt1913,
									115)) {
						int[] is = (((Class188) class188).anInt2425 != 2 ? Class129.anInterface1_1753
								.method6(false, anInt1919, 20377, anInt1919,
										0.7F, anInt1913)
								: (Class129.anInterface1_1753.method3(
										anInt1919, -117, false, 0.7F,
										anInt1919, anInt1913)));
						aClass253_1912 = class163.method1040(anInt1919,
								anInt1919, is, -1, anInt1919, 0);
					}
					if ((((Class188) class188).anInt2425 ^ 0xffffffff) == -3)
						class163.aa(i_11_, i_7_, i_13_, i_12_, i, 0);
					if (aClass253_1912 != null) {
						int i_14_ = ((Class188) class188).anInt2425 != 2 ? 0
								: 1;
						int i_15_ = i_12_ * i_10_ / -4096;
						int i_16_;
						for (i_16_ = (-i_12_ + i_13_) / 2 + i_12_ * i_6_ / 4096; i_16_ > i_12_; i_16_ -= i_12_) {
							/* empty */
						}
						for (/**/; (i_12_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff); i_15_ -= i_12_) {
							/* empty */
						}
						for (/**/; i_16_ < 0; i_16_ += i_12_) {
							/* empty */
						}
						for (/**/; (i_15_ ^ 0xffffffff) > -1; i_15_ += i_12_) {
							/* empty */
						}
						for (int i_17_ = -i_12_ + i_16_; i_13_ > i_17_; i_17_ += i_12_) {
							for (int i_18_ = i_15_ + -i_12_; (i_18_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff); i_18_ += i_12_)
								aClass253_1912.method1606(i_11_ + i_17_, i_18_
										- -i_7_, i_12_, i_12_, 1, 0, i_14_);
						}
					}
				}
				for (int i_19_ = -1 + anInt1907; (i_19_ ^ 0xffffffff) <= -1; i_19_--)
					aClass178Array1917[i_19_].method1153(class163, i_11_, i_7_,
							i_13_, i_12_, i_10_, i_6_);
				if (i_8_ == 5063)
					break;
				aClass281Array1906 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("fh.D(" + i + ','
						+ i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ','
						+ i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ','
						+ (class163 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method894(int i) {
		try {
			anInt1914++;
			if (aClass178Array1901 != null) {
				for (int i_20_ = 0; aClass178Array1901.length > i_20_; i_20_++)
					aClass178Array1901[i_20_].method1151();
			}
			if (i != 0)
				method895((byte) 33, null);
			aClass253_1912 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fh.F(" + i + ')');
		}
	}

	static final void method895(byte i, String string) {
		do {
			try {
				anInt1908++;
				System.out.println("Error: "
						+ Class266.method1683("%0a", "\n", 0, string));
				if (i == -103)
					break;
				anInt1903 = -88;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	Class141(int i, Class178[] class178s, int i_21_, int i_22_, int i_23_,
			int i_24_) {
		try {
			anInt1913 = i;
			anInt1911 = i_23_;
			aClass178Array1901 = class178s;
			anInt1918 = i_24_;
			anInt1920 = i_22_;
			if (class178s != null) {
				aClass178Array1917 = new Class178[class178s.length];
				aClass178_1909 = i_21_ >= 0 ? class178s[i_21_] : null;
			} else {
				aClass178Array1917 = null;
				aClass178_1909 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fh.<init>(" + i + ','
					+ (class178s != null ? "{...}" : "null") + ',' + i_21_
					+ ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ')'));
		}
	}

	static {
		aClass281Array1906 = new Class281[14];
		anInt1903 = -1;
	}
}
