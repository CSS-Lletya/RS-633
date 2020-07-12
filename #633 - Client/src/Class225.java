/* Class225 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class225 {
	static int anInt3097;
	static int anInt3098;
	static int anInt3099;
	static boolean aBool3100 = false;
	static int anInt3101;
	static int anInt3102;
	static int anInt3103;

	public Class225() {
		/* empty */
	}

	abstract void method1439(int i);

	final boolean method1440(int i) {
		try {
			if (i != -1)
				method1447(100);
			anInt3103++;
			if (!method1444(0) && !method1447(-1) && !method1452((byte) 46))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lp.Q(" + i + ')');
		}
	}

	abstract void method1441(int i);

	static final void method1442(int i, String string, boolean bool) {
		try {
			if (i != 17936)
				aBool3100 = true;
			anInt3097++;
			Class108_Sub15.method2699(string, bool, -127, -1, -1);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lp.P(" + i + ','
					+ (string != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	static final Class195_Sub1 method1443(int i) {
		try {
			anInt3098++;
			Class11_Sub2_Sub22.anInt9208 = i;
			return Class239.method1523(1554);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lp.S(" + i + ')');
		}
	}

	abstract boolean method1444(int i);

	abstract Class11_Sub23 method1445(int i);

	static final boolean method1446(int i) {
		try {
			if (i != 0)
				return false;
			anInt3101++;
			if (Class11_Sub52.aBool8053) {
				try {
					Class36.method311("showVideoAd", 85,
							Class108_Sub16.anApplet6538);
					return true;
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lp.N(" + i + ')');
		}
	}

	abstract boolean method1447(int i);

	abstract int method1448(byte i);

	abstract int method1449(int i);

	static final int method1450(boolean bool, int i) {
		try {
			anInt3102++;
			if (i != 0)
				aBool3100 = true;
			int i_0_ = OutputStream_Sub1.anInt5845;
			while_56_: do {
				while_55_: do {
					do {
						if (i_0_ != 0) {
							if ((i_0_ ^ 0xffffffff) == -2)
								break;
							if ((i_0_ ^ 0xffffffff) != -3)
								break while_56_;
							if (!client.aBool10531)
								break while_55_;
						}
						if (!bool)
							return Class218.anInt3004;
						return 0;
					} while (false);
					return Class218.anInt3004;
				} while (false);
				return 0;
			} while (false);
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lp.R(" + bool + ','
					+ i + ')');
		}
	}

	static final void method1451(int i, Object[] objects, int[] is) {
		try {
			int i_1_ = 104 / ((i - 64) / 41);
			Class11_Sub11.method2371(0, objects, is, true, -1 + is.length);
			anInt3099++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lp.O(" + i + ','
					+ (objects != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	abstract boolean method1452(byte i);
}
