/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class2 {
	static int anInt7;
	static int anInt8;
	static int anInt9;
	static int anInt10;
	static int anInt11;
	static Class22 aClass22_12 = new Class22(64);
	Class163_Sub2 aClass163_Sub2_13;
	static int anInt14;
	static Class146 aClass146_15;
	static int anInt16;
	static int anInt17;
	static Class221 aClass221_18;
	static int anInt19;
	static long aLong20;

	static final int method66(int i, int i_0_) {
		try {
			int i_1_ = 105 / ((12 - i) / 57);
			anInt9++;
			int i_2_ = i_0_ & 0x3f;
			int i_3_ = i_0_ >> 6 & 0x3;
			if (i_2_ == 18) {
				if (i_3_ == 0)
					return 1;
				if (i_3_ == 1)
					return 2;
				if (i_3_ == 2)
					return 4;
				if (i_3_ == 3)
					return 8;
			} else if (i_2_ == 19 || i_2_ == 21) {
				if (i_3_ == 0)
					return 16;
				if ((i_3_ ^ 0xffffffff) == -2)
					return 32;
				if ((i_3_ ^ 0xffffffff) == -3)
					return 64;
				if ((i_3_ ^ 0xffffffff) == -4)
					return 128;
			}
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "raa.T(" + i + ','
					+ i_0_ + ')');
		}
	}

	abstract void method67(byte i);

	abstract void method68(boolean bool, int i);

	void method69(byte i) {
		try {
			if (i > -111)
				method67((byte) -74);
			anInt10++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "raa.R(" + i + ')');
		}
	}

	abstract void method70(Interface15 interface15, int i, int i_4_);

	abstract void method71(int i, boolean bool);

	void method72(boolean bool) {
		do {
			try {
				anInt14++;
				if (bool == true)
					break;
				method66(-65, -86);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "raa.P(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	void method73(int i) {
		try {
			if (i >= -62)
				aLong20 = -69L;
			anInt17++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "raa.K(" + i + ')');
		}
	}

	void method74(int i) {
		try {
			if (i != 25411)
				method66(22, 53);
			anInt11++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "raa.L(" + i + ')');
		}
	}

	abstract boolean method75(int i);

	void method76(int i) {
		try {
			if (i != 64)
				method72(true);
			anInt7++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "raa.S(" + i + ')');
		}
	}

	void method77(byte i) {
		do {
			try {
				anInt8++;
				if (i == -122)
					break;
				aLong20 = 49L;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "raa.Q(" + i + ')');
			}
			break;
		} while (false);
	}

	Class2(Class163_Sub2 class163_sub2) {
		try {
			((Class2) this).aClass163_Sub2_13 = class163_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "raa.<init>("
					+ (class163_sub2 != null ? "{...}" : "null") + ')');
		}
	}

	abstract void method78(int i, int i_5_, int i_6_);

	public static void method79(int i) {
		do {
			try {
				aClass221_18 = null;
				aClass22_12 = null;
				aClass146_15 = null;
				if (i >= 65)
					break;
				aClass22_12 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "raa.U(" + i + ')');
			}
			break;
		} while (false);
	}
}
