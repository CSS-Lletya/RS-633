/* Class236_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class236_Sub6 extends Class236 {
	static int anInt6961;
	static int anInt6962;
	static float aFloat6963;
	static int anInt6964;
	static int anInt6965;
	static Class341 aClass341_6966;
	static int anInt6967;
	static int anInt6968;
	static int anInt6969;

	static final boolean method2823(char c, int i) {
		try {
			anInt6967++;
			if (i != -98)
				aFloat6963 = 0.52886814F;
			if (((c ^ 0xffffffff) > -49 || (c ^ 0xffffffff) < -58)
					&& (c < 65 || (c ^ 0xffffffff) < -91)
					&& ((c ^ 0xffffffff) > -98 || (c ^ 0xffffffff) < -123))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "od.K(" + c + ',' + i
					+ ')');
		}
	}

	Class236_Sub6(Class163_Sub3 class163_sub3) {
		super(class163_sub3);
	}

	final void method1504(int i, int i_0_, Class321 class321) {
		try {
			anInt6961++;
			int i_1_ = -40 % ((52 - i_0_) / 62);
			((Class236) this).aClass163_Sub3_3222.method3295(class321, 107);
			((Class236) this).aClass163_Sub3_3222.method3260(i, (byte) 17);
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(
							runtimeexception,
							("od.I(" + i + ',' + i_0_ + ','
									+ (class321 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2824(int i) {
		do {
			try {
				aClass341_6966 = null;
				if (i < -124)
					break;
				aFloat6963 = -0.97898906F;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "od.J(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1508(int i, boolean bool) {
		try {
			if (i != 17660)
				method1505(false, false);
			anInt6962++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "od.A(" + i + ','
					+ bool + ')');
		}
	}

	final void method1506(int i, int i_2_, int i_3_) {
		do {
			try {
				anInt6964++;
				if (i_2_ >= 72)
					break;
				aFloat6963 = 1.147347F;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("od.B(" + i + ','
						+ i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1502(int i) {
		try {
			((Class236) this).aClass163_Sub3_3222.method3285((byte) -54, false);
			if (i < 74)
				aClass341_6966 = null;
			anInt6965++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "od.C(" + i + ')');
		}
	}

	final void method1505(boolean bool, boolean bool_4_) {
		try {
			anInt6969++;
			((Class236) this).aClass163_Sub3_3222.method3285((byte) -93, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "od.H(" + bool + ','
					+ bool_4_ + ')');
		}
	}

	final boolean method1500(byte i) {
		try {
			anInt6968++;
			int i_5_ = 97 % ((i + 9) / 53);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "od.D(" + i + ')');
		}
	}
}
