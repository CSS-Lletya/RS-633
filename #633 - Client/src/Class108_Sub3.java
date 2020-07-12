/* Class108_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108_Sub3 extends Class108 {
	static int anInt5326;
	static int anInt5327;
	static int anInt5328;
	static int anInt5329;
	static int anInt5330;
	static int anInt5331;
	static int anInt5332;
	static int anInt5333;

	Class108_Sub3(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}

	final boolean method2346(byte i) {
		try {
			if (i != -53)
				return false;
			anInt5326++;
			if (((Class108) this).aClass11_Sub17_1458.method2456(i ^ 0x47f0))
				return false;
			if (((Class108) this).aClass11_Sub17_1458.method2454(-21) == Class142.aClass66_1925)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nia.D(" + i + ')');
		}
	}

	Class108_Sub3(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
	}

	final int method721(int i, int i_0_) {
		try {
			anInt5329++;
			if (((Class108) this).aClass11_Sub17_1458.method2456(-18373))
				return 3;
			if (i_0_ < 10)
				return 114;
			if (((Class108) this).aClass11_Sub17_1458.method2454(-21) == Class142.aClass66_1925)
				return 1;
			return 3;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nia.F(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method728(int i, int i_1_) {
		try {
			anInt5333++;
			if (i != 0)
				method728(71, 122);
			((Class108) this).anInt1459 = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nia.C(" + i + ','
					+ i_1_ + ')');
		}
	}

	final void method726(boolean bool) {
		do {
			try {
				do {
					if (((Class108) this).aClass11_Sub17_1458.method2454(-21) != Class142.aClass66_1925) {
						((Class108) this).anInt1459 = 1;
						if (!client.aBool10531)
							break;
					}
					if (((Class108) this).aClass11_Sub17_1458
							.method2456(-18373))
						((Class108) this).anInt1459 = 0;
				} while (false);
				if (bool != false)
					anInt5328 = 66;
				anInt5332++;
				if ((((Class108) this).anInt1459 ^ 0xffffffff) == -1
						|| ((Class108) this).anInt1459 == 1)
					break;
				((Class108) this).anInt1459 = method725((byte) -26);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "nia.E(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	final int method725(byte i) {
		try {
			int i_2_ = -111 / ((70 - i) / 51);
			anInt5327++;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nia.A(" + i + ')');
		}
	}

	final int method2347(boolean bool) {
		try {
			anInt5331++;
			if (bool != false)
				method721(108, 92);
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nia.B(" + bool + ')');
		}
	}
}
