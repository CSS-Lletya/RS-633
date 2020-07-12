/* Class173 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Method;

final class Class173 {
	static int anInt2210;
	static int anInt2211;
	static int anInt2212;
	static int anInt2213;
	static int anInt2214;
	static int anInt2215;
	static int anInt2216;
	static int anInt2217;
	static int anInt2218;
	private int anInt2219;
	int anInt2220;
	static int[] anIntArray2221 = new int[13];
	/* synthetic */static Class aClass2222;

	final void method1130(int i) {
		try {
			((Class173) this).anInt2220 &= i;
			anInt2215++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hs.D(" + i + ')');
		}
	}

	static final boolean method1131(int i, int i_0_, int i_1_, int i_2_,
			int i_3_) {
		try {
			anInt2216++;
			if (i_0_ != ((Class11_Sub45_Sub17.aByteArrayArrayArray9509[0][i_2_][i] & 0x2) ^ 0xffffffff))
				return true;
			if ((0x10 & Class11_Sub45_Sub17.aByteArrayArrayArray9509[i_1_][i_2_][i]) != 0)
				return false;
			if (Class376_Sub2.method2416(i, (byte) 107, i_2_, i_1_) == i_3_)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hs.G(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	public static void method1132(int i) {
		do {
			try {
				anIntArray2221 = null;
				if (i == -20169)
					break;
				anIntArray2221 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "hs.F(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method1133(int i) {
		try {
			anInt2211++;
			if (i != -1)
				anIntArray2221 = null;
			Class121.anInt1633++;
			Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
					Class11_Sub3.aClass25_5113, Class108_Sub26.aClass370_7825,
					(byte) 93);
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
					.writeShort(-123, Class199.anInt2692);
			Class79.method541(class11_sub10, -52);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hs.C(" + i + ')');
		}
	}

	static int method1134(int i, int i_4_) {
		try {
			return i | i_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hs.J(" + i + ','
					+ i_4_ + ')');
		}
	}

	static final boolean method1135(int i, int i_5_, int i_6_) {
		try {
			if (i_5_ <= 43)
				method1131(-65, 81, 120, -127, 45);
			anInt2217++;
			if ((0x100100 & i) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hs.H(" + i + ','
					+ i_5_ + ',' + i_6_ + ')'));
		}
	}

	static final void method1136(int i) {
		try {
			do {
				if (!((Class341) Class108_Sub21.aClass341_7304).aBool4502) {
					try {
						Method method = (aClass2222 != null ? aClass2222
								: (aClass2222 = getClassByName("java.lang.Runtime")))
								.getMethod("maxMemory", new Class[0]);
						if (method != null) {
							try {
								Runtime runtime = Runtime.getRuntime();
								Long var_long = (Long) method.invoke(runtime,
										null);
								Class177.anInt2245 = 1 + (int) (var_long
										.longValue() / 1048576L);
							} catch (Throwable throwable) {
								/* empty */
							}
						}
						break;
					} catch (Exception exception) {
						if (!client.aBool10531)
							break;
					}
				}
				Class177.anInt2245 = 96;
			} while (false);
			if (i < 99)
				method1133(79);
			anInt2218++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hs.E(" + i + ')');
		}
	}

	final void method1137(int i, int i_7_) {
		do {
			try {
				anInt2219 = 0;
				anInt2214++;
				((Class173) this).anInt2220 = i_7_;
				if (i == -24223)
					break;
				method1132(-2);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "hs.A(" + i + ','
						+ i_7_ + ')');
			}
			break;
		} while (false);
	}

	final boolean method1138(int i, int i_8_, int i_9_, int i_10_) {
		try {
			anInt2213++;
			int i_11_ = anInt2219;
			if (i_8_ == ((Class173) this).anInt2220
					&& (anInt2219 ^ 0xffffffff) == -1)
				return false;
			boolean bool;
			if (anInt2219 != 0) {
				if ((anInt2219 ^ 0xffffffff) >= -1
						|| ((((Class173) this).anInt2220 ^ 0xffffffff) <= (i_8_ ^ 0xffffffff))) {
					if ((anInt2219 ^ 0xffffffff) > -1
							&& ((Class173) this).anInt2220 > i_8_) {
						int i_12_ = anInt2219 * anInt2219 / (i_9_ * 2);
						int i_13_ = ((Class173) this).anInt2220 - i_12_;
						if ((i_13_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff)
								&& ((((Class173) this).anInt2220 ^ 0xffffffff) <= (i_13_ ^ 0xffffffff)))
							bool = true;
						else
							bool = false;
					} else
						bool = false;
				} else {
					int i_14_ = anInt2219 * anInt2219 / (2 * i_9_);
					int i_15_ = i_14_ + ((Class173) this).anInt2220;
					if ((i_8_ ^ 0xffffffff) >= (i_15_ ^ 0xffffffff)
							|| i_15_ < ((Class173) this).anInt2220)
						bool = false;
					else
						bool = true;
				}
			} else {
				if ((i_8_ > ((Class173) this).anInt2220 && i_8_ <= i_9_
						+ ((Class173) this).anInt2220)
						|| (((Class173) this).anInt2220 > i_8_ && ((Class173) this).anInt2220
								- i_9_ <= i_8_)) {
					((Class173) this).anInt2220 = i_8_;
					return false;
				}
				bool = true;
			}
			if (bool) {
				if ((((Class173) this).anInt2220 ^ 0xffffffff) > (i_8_ ^ 0xffffffff)) {
					anInt2219 += i_9_;
					if ((i_10_ ^ 0xffffffff) != -1
							&& (anInt2219 ^ 0xffffffff) < (i_10_ ^ 0xffffffff))
						anInt2219 = i_10_;
				} else {
					anInt2219 -= i_9_;
					if ((i_10_ ^ 0xffffffff) != -1
							&& (anInt2219 ^ 0xffffffff) > (-i_10_ ^ 0xffffffff))
						anInt2219 = -i_10_;
				}
				if (i_11_ != anInt2219) {
					int i_16_ = anInt2219 * anInt2219 / (2 * i_9_);
					if ((((Class173) this).anInt2220 ^ 0xffffffff) > (i_8_ ^ 0xffffffff)) {
						if ((i_8_ ^ 0xffffffff) > (i_16_
								+ ((Class173) this).anInt2220 ^ 0xffffffff))
							anInt2219 = i_11_;
					} else if (((((Class173) this).anInt2220 ^ 0xffffffff) < (i_8_ ^ 0xffffffff))
							&& (((Class173) this).anInt2220 + -i_16_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff))
						anInt2219 = i_11_;
				}
			} else if ((anInt2219 ^ 0xffffffff) >= -1) {
				anInt2219 += i_9_;
				if ((anInt2219 ^ 0xffffffff) < -1)
					anInt2219 = 0;
			} else {
				anInt2219 -= i_9_;
				if ((anInt2219 ^ 0xffffffff) > -1)
					anInt2219 = 0;
			}
			if (i != 16383)
				method1140(50);
			((Class173) this).anInt2220 += i_11_ + anInt2219 >> 1;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hs.I(" + i + ','
					+ i_8_ + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	public Class173() {
		/* empty */
	}

	static final int method1139(String string, int i) {
		try {
			if (i != -23213)
				anIntArray2221 = null;
			anInt2212++;
			return Class11_Sub2_Sub33.method3806((byte) -21, 10, string, true);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hs.K("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final int method1140(int i) {
		try {
			if (i != -1)
				method1138(-89, 11, -92, 14);
			anInt2210++;
			return ((Class173) this).anInt2220 & 0x3fff;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hs.B(" + i + ')');
		}
	}

	/* synthetic */static Class getClassByName(String string) {
		try {
			System.out.println(string);
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
