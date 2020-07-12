/* Class105 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class105 {
	static int anInt1406;
	static int anInt1407;
	static double aDouble1408;
	private Class84 aClass84_1409;
	static int anInt1410;
	static int[] anIntArray1411;
	static int anInt1412;
	static int anInt1413;
	private int anInt1414;
	static int anInt1415;
	private Class11_Sub4[] aClass11_Sub4Array1416;
	private int anInt1417;
	private int anInt1418;
	private int anInt1419 = 0;
	private int[][] anIntArrayArray1420;
	boolean aBool1421;

	static final boolean method691(int i, int i_0_, byte i_1_) {
		try {
			if (i_1_ != 5)
				return false;
			anInt1410++;
			if (!(Class321_Sub2.method2741(i, (byte) -113, i_0_) | (0x800 & i_0_ ^ 0xffffffff) != -1)
					&& !Class376_Sub7_Sub4_Sub2.method3911(4285, i_0_, i))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("cv.E(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	final int[][] method692(boolean bool) {
		try {
			anInt1406++;
			if ((anInt1418 ^ 0xffffffff) != (anInt1414 ^ 0xffffffff))
				throw new RuntimeException(
						"Can only retrieve a full image cache");
			if (bool != true)
				aClass11_Sub4Array1416 = null;
			for (int i = 0; anInt1418 > i; i++)
				aClass11_Sub4Array1416[i] = Class128.aClass11_Sub4_1724;
			return anIntArrayArray1420;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cv.F(" + bool + ')');
		}
	}

	final int[] method693(int i, byte i_2_) {
		try {
			if (i_2_ != -42)
				return null;
			anInt1415++;
			if (anInt1418 != anInt1414) {
				if (anInt1418 != 1) {
					Class11_Sub4 class11_sub4 = aClass11_Sub4Array1416[i];
					if (class11_sub4 == null) {
						((Class105) this).aBool1421 = true;
						if ((anInt1418 ^ 0xffffffff) < (anInt1419 ^ 0xffffffff)) {
							class11_sub4 = new Class11_Sub4(i, anInt1419);
							anInt1419++;
						} else {
							Class11_Sub4 class11_sub4_3_ = ((Class11_Sub4) aClass84_1409
									.method582(i_2_ ^ ~0x5c));
							class11_sub4 = new Class11_Sub4(
									i,
									(((Class11_Sub4) class11_sub4_3_).anInt5234));
							aClass11_Sub4Array1416[((Class11_Sub4) class11_sub4_3_).anInt5233] = null;
							class11_sub4_3_.method122(-106);
						}
						aClass11_Sub4Array1416[i] = class11_sub4;
					} else
						((Class105) this).aBool1421 = false;
					aClass84_1409.method588(class11_sub4, i_2_ + 128);
					return (anIntArrayArray1420[((Class11_Sub4) class11_sub4).anInt5234]);
				}
				((Class105) this).aBool1421 = i != anInt1417;
				anInt1417 = i;
				return anIntArrayArray1420[0];
			}
			((Class105) this).aBool1421 = aClass11_Sub4Array1416[i] == null;
			aClass11_Sub4Array1416[i] = Class128.aClass11_Sub4_1724;
			return anIntArrayArray1420[i];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cv.D(" + i + ','
					+ i_2_ + ')');
		}
	}

	final void method694(int i) {
		do {
			try {
				anInt1412++;
				for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (anInt1418 ^ 0xffffffff); i_4_++)
					anIntArrayArray1420[i_4_] = null;
				aClass11_Sub4Array1416 = null;
				anIntArrayArray1420 = null;
				aClass84_1409.method586((byte) -19);
				aClass84_1409 = null;
				if (i == -15341)
					break;
				anIntArray1411 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "cv.B(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method695(int i) {
		try {
			if (i > -97)
				method691(-99, 23, (byte) 42);
			anIntArray1411 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cv.C(" + i + ')');
		}
	}

	static final boolean method696(byte i, int i_5_) {
		try {
			int i_6_ = -27 % ((i - 22) / 35);
			anInt1413++;
			if (i_5_ != 0 && i_5_ != 1 && i_5_ != 2)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cv.A(" + i + ','
					+ i_5_ + ')');
		}
	}

	Class105(int i, int i_7_, int i_8_) {
		anInt1417 = -1;
		aClass84_1409 = new Class84();
		((Class105) this).aBool1421 = false;
		try {
			anInt1414 = i_7_;
			anInt1418 = i;
			anIntArrayArray1420 = new int[anInt1418][i_8_];
			aClass11_Sub4Array1416 = new Class11_Sub4[anInt1414];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("cv.<init>(" + i + ','
					+ i_7_ + ',' + i_8_ + ')'));
		}
	}
}
