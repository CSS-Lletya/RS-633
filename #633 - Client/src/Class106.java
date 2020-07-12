/* Class106 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class106 {
	static int anInt1422;
	static int anInt1423;
	static int anInt1424;
	static int anInt1425;
	static boolean[][] aBoolArrayArray1426;
	private int anInt1427;
	private boolean aBool1428;
	private boolean aBool1429;
	static int anInt1430;
	static Class240 aClass240_1431 = new Class240();
	private int anInt1432;
	static Class213 aClass213_1433 = new Class213(64);
	static int anInt1434 = 16777215;

	static final int method697(byte i) {
		try {
			if (i < 65)
				method697((byte) 58);
			anInt1424++;
			return Class318.anInt4227++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cw.E(" + i + ')');
		}
	}

	final boolean method698(int i) {
		try {
			anInt1422++;
			if (i != 64)
				return false;
			return aBool1429;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cw.A(" + i + ')');
		}
	}

	public static void method699(int i) {
		try {
			aClass213_1433 = null;
			aClass240_1431 = null;
			if (i >= -95)
				anInt1434 = 107;
			aBoolArrayArray1426 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cw.C(" + i + ')');
		}
	}

	final int method700(boolean bool) {
		try {
			if (bool != false)
				aBool1428 = true;
			anInt1430++;
			return anInt1432;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cw.D(" + bool + ')');
		}
	}

	final boolean method701(byte i) {
		try {
			anInt1423++;
			if (i != -19)
				method700(true);
			return aBool1428;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cw.B(" + i + ')');
		}
	}

	Class106(boolean bool, int i, int i_0_, boolean bool_1_) {
		try {
			anInt1427 = i;
			aBool1428 = bool;
			aBool1429 = bool_1_;
			anInt1432 = i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("cw.<init>(" + bool
					+ ',' + i + ',' + i_0_ + ',' + bool_1_ + ')'));
		}
	}

	final int method702(byte i) {
		try {
			if (i != -83)
				aClass240_1431 = null;
			anInt1425++;
			return anInt1427;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cw.F(" + i + ')');
		}
	}
}
