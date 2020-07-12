/* Class154 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class154 {
	static boolean[][] aBoolArrayArray2029;
	private Class146 aClass146_2030;
	static int anInt2031;
	static int anInt2032 = 0;
	static int anInt2033;
	static int anInt2034;
	static int anInt2035;
	private Class22 aClass22_2036 = new Class22(16);
	static int anInt2037;
	static int anInt2038;
	static int anInt2039;
	static int anInt2040;
	static int anInt2041;

	static final void method963(int i, int i_0_, int i_1_, Class146 class146,
			int i_2_, int i_3_, boolean bool) {
		try {
			int i_4_ = 30 % ((i_0_ + 54) / 38);
			anInt2034++;
			if (i_2_ > 0) {
				Class226.aBool3113 = bool;
				Class376_Sub7_Sub3.anInt9278 = i_1_;
				Class318.anInt4230 = 1;
				Class29.aClass146_397 = class146;
				Class234_Sub2.anInt5986 = i_3_;
				Class334.aClass11_Sub6_Sub2_4425 = null;
				Class108_Sub16.anInt6539 = i;
				Class78.anInt1060 = Class364.aClass11_Sub6_Sub2_4773
						.method3518(-88) / i_2_;
				if ((Class78.anInt1060 ^ 0xffffffff) > -2)
					Class78.anInt1060 = 1;
			} else
				Class91_Sub2.method3111(i_1_, i, 0, bool, class146, i_3_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gi.D(" + i + ','
					+ i_0_ + ',' + i_1_ + ','
					+ (class146 != null ? "{...}" : "null") + ',' + i_2_ + ','
					+ i_3_ + ',' + bool + ')'));
		}
	}

	static final boolean method964(int i, Class11_Sub21 class11_sub21,
			int i_5_, Class23 class23, Class163 class163, byte i_6_) {
		try {
			anInt2037++;
			int i_7_ = 2147483647;
			int i_8_ = -2147483648;
			int i_9_ = 2147483647;
			int i_10_ = -2147483648;
			if (((Class23) class23).anIntArray242 != null) {
				i_9_ = (Class32.anInt448 + -((Class32.anInt448 + -Class32.anInt436)
						* (-Class32.anInt440 + (((Class11_Sub21) class11_sub21).anInt5969 + ((Class23) class23).anInt204)) / (Class32.anInt435 - Class32.anInt440)));
				i_8_ = ((-Class32.anInt453 + Class32.anInt445)
						* (((Class11_Sub21) class11_sub21).anInt5970 + (((Class23) class23).anInt225 + -Class32.anInt439)) / (Class32.anInt433 - Class32.anInt439))
						+ Class32.anInt453;
				i_7_ = (((-Class32.anInt439
						+ ((Class11_Sub21) class11_sub21).anInt5970 + ((Class23) class23).anInt234)
						* (-Class32.anInt453 + Class32.anInt445) / (Class32.anInt433 - Class32.anInt439)) + Class32.anInt453);
				i_10_ = (Class32.anInt448 - ((Class32.anInt448 + -Class32.anInt436)
						* (-Class32.anInt440 + (((Class11_Sub21) class11_sub21).anInt5969 + ((Class23) class23).anInt241)) / (Class32.anInt435 + -Class32.anInt440)));
			}
			Class253 class253 = null;
			int i_11_ = 0;
			int i_12_ = 0;
			int i_13_ = 0;
			if (i_6_ != -83)
				aBoolArrayArray2029 = null;
			int i_14_ = 0;
			if ((((Class23) class23).anInt203 ^ 0xffffffff) != 0) {
				if (!((Class11_Sub21) class11_sub21).aBool5961
						|| ((Class23) class23).anInt205 == -1)
					class253 = class23.method203(class163, (byte) -127, false);
				else
					class253 = class23.method203(class163, (byte) -55, true);
				if (class253 != null) {
					i_11_ = (((Class11_Sub21) class11_sub21).anInt5965 + -(class253
							.method1608() + 1 >> 1));
					if (i_11_ < i_7_)
						i_7_ = i_11_;
					i_12_ = (((Class11_Sub21) class11_sub21).anInt5965 - -(1 + class253
							.method1608() >> 1));
					if ((i_8_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff))
						i_8_ = i_12_;
					i_13_ = (((Class11_Sub21) class11_sub21).anInt5967 - (class253
							.method1622() + 1 >> 1));
					if ((i_13_ ^ 0xffffffff) > (i_9_ ^ 0xffffffff))
						i_9_ = i_13_;
					i_14_ = (((Class11_Sub21) class11_sub21).anInt5967 + (class253
							.method1622() + 1 >> 1));
					if ((i_14_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff))
						i_10_ = i_14_;
				}
			}
			Class40 class40 = null;
			int i_15_ = 0;
			int i_16_ = 0;
			int i_17_ = 0;
			int i_18_ = 0;
			int i_19_ = 0;
			int i_20_ = 0;
			int i_21_ = 0;
			int i_22_ = 0;
			if (((Class23) class23).aString247 != null) {
				class40 = Class326.method1980(-1, ((Class23) class23).anInt208);
				if (class40 != null) {
					i_15_ = (Class11_Sub45_Sub2.aClass292_8511.method1806(
							((Class23) class23).aString247,
							Class108_Sub27.aStringArray7865, null, 60, null));
					i_16_ = (((Class11_Sub21) class11_sub21).anInt5965 - -(((Class23) class23).anInt211
							* (-Class32.anInt453 + Class32.anInt445) / (-Class32.anInt439 + Class32.anInt433)));
					i_17_ = (((Class11_Sub21) class11_sub21).anInt5967 + -((-Class32.anInt436 + Class32.anInt448)
							* ((Class23) class23).anInt218 / (Class32.anInt435 + -Class32.anInt440)));
					if (class253 != null)
						i_17_ -= ((class253.method1622() >> 1) - -(i_15_ * class40
								.method359()));
					else
						i_17_ -= i_15_ * class40.method358() / 2;
					for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff); i_23_++) {
						String string = Class108_Sub27.aStringArray7865[i_23_];
						if (-1 + i_15_ > i_23_)
							string = string.substring(0, string.length() - 4);
						int i_24_ = class40.method360(string);
						if (i_24_ > i_18_)
							i_18_ = i_24_;
					}
					i_19_ = i_5_ + -(i_18_ / 2) + i_16_;
					i_20_ = i_5_ + i_16_ + i_18_ / 2;
					if (i_7_ > i_19_)
						i_7_ = i_19_;
					i_21_ = i_17_ + i;
					if ((i_8_ ^ 0xffffffff) > (i_20_ ^ 0xffffffff))
						i_8_ = i_20_;
					i_22_ = i + (i_15_ * class40.method359() + i_17_);
					if (i_9_ > i_21_)
						i_9_ = i_21_;
					if (i_10_ < i_22_)
						i_10_ = i_22_;
				}
			}
			if (Class32.anInt453 > i_8_
					|| (Class32.anInt445 ^ 0xffffffff) > (i_7_ ^ 0xffffffff)
					|| i_10_ < Class32.anInt436
					|| (i_9_ ^ 0xffffffff) < (Class32.anInt448 ^ 0xffffffff))
				return true;
			Class32.method278(class163, class11_sub21, class23);
			if (class253 != null) {
				if (Class308.anInt4126 > 0
						&& ((Class108_Sub8.anInt5737 != -1 && (Class108_Sub8.anInt5737 == ((Class11_Sub21) class11_sub21).anInt5964)) || ((Class134.anInt1848 ^ 0xffffffff) != 0 && ((Class134.anInt1848 ^ 0xffffffff) == (((Class23) class23).anInt207 ^ 0xffffffff))))) {
					int i_25_;
					if ((Class108.anInt1455 ^ 0xffffffff) >= -51)
						i_25_ = Class108.anInt1455 * 2;
					else
						i_25_ = -(Class108.anInt1455 * 2) + 200;
					int i_26_ = i_25_ << 24 | 0xffff00;
					class163.method1039(i_26_,
							((Class11_Sub21) class11_sub21).anInt5965,
							class253.method1609() / 2 + 7, (byte) 104,
							((Class11_Sub21) class11_sub21).anInt5967);
					class163.method1039(i_26_,
							((Class11_Sub21) class11_sub21).anInt5965,
							5 + class253.method1609() / 2, (byte) 96,
							((Class11_Sub21) class11_sub21).anInt5967);
					class163.method1039(i_26_,
							((Class11_Sub21) class11_sub21).anInt5965,
							class253.method1609() / 2 + 3, (byte) 126,
							((Class11_Sub21) class11_sub21).anInt5967);
					class163.method1039(i_26_,
							((Class11_Sub21) class11_sub21).anInt5965,
							1 + class253.method1609() / 2, (byte) 109,
							((Class11_Sub21) class11_sub21).anInt5967);
					class163.method1039(i_26_,
							(((Class11_Sub21) class11_sub21).anInt5965),
							class253.method1609() / 2, (byte) 98,
							(((Class11_Sub21) class11_sub21).anInt5967));
				}
				class253.method1610(
						(((Class11_Sub21) class11_sub21).anInt5965 + -(class253
								.method1608() >> 1)),
						(((Class11_Sub21) class11_sub21).anInt5967 - (class253
								.method1622() >> 1)));
			}
			if (((Class23) class23).aString247 != null && class40 != null)
				Class254_Sub2.method2828(i_18_, i_16_, class40, i_15_,
						class163, -92, class11_sub21, class23, i_17_);
			if (((Class23) class23).anInt203 != -1
					|| ((Class23) class23).aString247 != null) {
				Class11_Sub22 class11_sub22 = new Class11_Sub22(class11_sub21);
				((Class11_Sub22) class11_sub22).anInt5975 = i_14_;
				((Class11_Sub22) class11_sub22).anInt5976 = i_13_;
				((Class11_Sub22) class11_sub22).anInt5979 = i_20_;
				((Class11_Sub22) class11_sub22).anInt5978 = i_11_;
				((Class11_Sub22) class11_sub22).anInt5974 = i_21_;
				((Class11_Sub22) class11_sub22).anInt5977 = i_19_;
				((Class11_Sub22) class11_sub22).anInt5973 = i_12_;
				((Class11_Sub22) class11_sub22).anInt5972 = i_22_;
				ISAAC.aClass84_265.method589((byte) -13, class11_sub22);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("gi.G(" + i + ','
							+ (class11_sub21 != null ? "{...}" : "null") + ','
							+ i_5_ + ',' + (class23 != null ? "{...}" : "null")
							+ ',' + (class163 != null ? "{...}" : "null") + ','
							+ i_6_ + ')'));
		}
	}

	final void method965(boolean bool, int i) {
		try {
			anInt2033++;
			synchronized (aClass22_2036) {
				if (bool != true)
					method966((byte) 110, -37);
				aClass22_2036.method182(i, (byte) -73);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gi.E(" + bool + ','
					+ i + ')');
		}
	}

	static final void method966(byte i, int i_27_) {
		do {
			try {
				if (i == 50) {
					anInt2040++;
					Class11_Sub26 class11_sub26 = ((Class11_Sub26) Class111.aClass213_1522
							.method1369((byte) 26, (long) i_27_));
					if (class11_sub26 == null)
						break;
					((Class11_Sub26) class11_sub26).aBool6304 = !((Class11_Sub26) class11_sub26).aBool6304;
					((Class11_Sub26) class11_sub26).aClass28_Sub1_6305
							.method235(-16426,
									((Class11_Sub26) class11_sub26).aBool6304);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "gi.F(" + i + ','
						+ i_27_ + ')');
			}
			break;
		} while (false);
	}

	final void method967(int i) {
		try {
			synchronized (aClass22_2036) {
				aClass22_2036.method190(0);
			}
			if (i == 18028)
				anInt2031++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gi.A(" + i + ')');
		}
	}

	static final boolean method968(int i, byte i_28_) {
		try {
			anInt2039++;
			int i_29_ = 0xff & i_28_;
			if ((i_29_ ^ 0xffffffff) == i)
				return false;
			if (i_29_ >= 128
					&& (i_29_ ^ 0xffffffff) > -161
					&& (Class108.aCharArray1465[-128 + i_29_] ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gi.I(" + i + ','
					+ i_28_ + ')');
		}
	}

	final Class375 method969(int i, int i_30_) {
		try {
			anInt2038++;
			if (i_30_ != -7588)
				return null;
			Class375 class375;
			synchronized (aClass22_2036) {
				class375 = (Class375) aClass22_2036.method188((long) i,
						(byte) 126);
			}
			if (class375 != null)
				return class375;
			byte[] is;
			synchronized (aClass146_2030) {
				is = aClass146_2030.method930(i, (byte) 112, 30);
			}
			class375 = new Class375();
			if (is != null)
				class375.method2204(false, new Stream(is));
			synchronized (aClass22_2036) {
				aClass22_2036.method184((byte) 125, class375, (long) i);
			}
			return class375;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gi.C(" + i + ','
					+ i_30_ + ')');
		}
	}

	final void method970(boolean bool) {
		try {
			synchronized (aClass22_2036) {
				if (bool != true)
					aClass22_2036 = null;
				aClass22_2036.method189((byte) -124);
			}
			anInt2041++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gi.H(" + bool + ')');
		}
	}

	public static void method971(byte i) {
		do {
			try {
				aBoolArrayArray2029 = null;
				if (i <= -80)
					break;
				method966((byte) 120, -14);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "gi.B(" + i + ')');
			}
			break;
		} while (false);
	}

	Class154(Class66 class66, int i, Class146 class146) {
		try {
			aClass146_2030 = class146;
			aClass146_2030.method914(30, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gi.<init>("
					+ (class66 != null ? "{...}" : "null") + ',' + i + ','
					+ (class146 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aBoolArrayArray2029 = new boolean[][] {
				new boolean[13],
				{ false, false, true, true, true, true, true, false, false,
						false, false, false, true },
				{ true, true, true, true, true, true, false, false, false,
						false, false, false, false },
				{ true, true, true, false, false, true, true, true, false,
						false, false, false, false },
				{ true, false, false, false, false, true, true, true, false,
						false, false, false, false },
				{ false, false, true, true, true, true, false, false, false,
						false, false, false, false },
				{ false, true, true, true, true, true, false, false, false,
						false, false, false, true },
				{ false, true, true, true, true, true, true, true, false,
						false, false, false, true },
				{ true, true, false, false, false, false, false, true, false,
						false, false, false, false },
				{ true, true, true, true, true, false, false, false, true,
						true, false, false, false },
				{ true, false, false, false, true, true, true, true, true,
						true, false, false, false },
				{ true, false, true, true, true, true, true, true, false,
						false, true, true, false },
				{ true, true, true, true, true, true, true, true, true, true,
						true, true, true },
				new boolean[13],
				{ true, true, true, true, true, true, true, true, true, true,
						true, true, true } };
	}
}
