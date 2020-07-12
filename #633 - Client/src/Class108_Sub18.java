/* Class108_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108_Sub18 extends Class108 {
	static Class140 aClass140_6922;
	static int[][][] anIntArrayArrayArray6923;
	static Class141 aClass141_6924;
	static int anInt6925;
	static int anInt6926;
	static int anInt6927;
	static int anInt6928;
	static int anInt6929;
	static int anInt6930;
	static int anInt6931;
	static Class146 aClass146_6932;
	static float aFloat6933;

	static final int method2805(int i) {
		try {
			anInt6927++;
			if (Class306.aBool4114)
				return 6;
			if (Class11_Sub19.aClass11_Sub45_Sub5_5815 == null)
				return 0;
			int i_0_ = (((Class11_Sub45_Sub5) Class11_Sub19.aClass11_Sub45_Sub5_5815).anInt8760);
			if (i < 52)
				method2808(69, -122, 52);
			if (Class135.method874(-1003, i_0_))
				return 1;
			if (Class135.method872(-46, i_0_))
				return 2;
			if (Class11_Sub45_Sub16_Sub2.method3931(8071, i_0_))
				return 3;
			if (Class26.method221(i_0_, (byte) -94))
				return 4;
			return 5;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nh.H(" + i + ')');
		}
	}

	public static void method2806(byte i) {
		try {
			aClass146_6932 = null;
			anIntArrayArrayArray6923 = null;
			if (i <= 92)
				aClass140_6922 = null;
			aClass140_6922 = null;
			aClass141_6924 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nh.I(" + i + ')');
		}
	}

	static final void method2807(byte i) {
		try {
			Class11_Sub45_Sub16_Sub2.aClass22_10164.method189((byte) -127);
			if (i != -118)
				anIntArrayArrayArray6923 = null;
			anInt6930++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nh.G(" + i + ')');
		}
	}

	static final void method2808(int i, int i_1_, int i_2_) {
		boolean bool = (Class181.aClass364ArrayArrayArray2336[0][i_1_][i_2_] != null && ((Class364) (Class181.aClass364ArrayArrayArray2336[0][i_1_][i_2_])).aClass364_4783 != null);
		for (int i_3_ = i; i_3_ >= 0; i_3_--) {
			if (Class181.aClass364ArrayArrayArray2336[i_3_][i_1_][i_2_] == null) {
				Class364 class364 = (Class181.aClass364ArrayArrayArray2336[i_3_][i_1_][i_2_] = new Class364(
						i_3_));
				if (bool)
					((Class364) class364).aByte4785++;
			}
		}
	}

	Class108_Sub18(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}

	final void method726(boolean bool) {
		try {
			if (((Class108) this).aClass11_Sub17_1458.method2454(-21) == ISAAC.aClass66_263)
				((Class108) this).anInt1459 = 2;
			if (bool == false) {
				anInt6925++;
				if (((Class108) this).anInt1459 < 0
						|| ((Class108) this).anInt1459 > 2)
					((Class108) this).anInt1459 = method725((byte) -118);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nh.E(" + bool + ')');
		}
	}

	final void method728(int i, int i_4_) {
		do {
			try {
				((Class108) this).anInt1459 = i_4_;
				anInt6928++;
				if (i == 0)
					break;
				method2805(86);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "nh.C(" + i + ','
						+ i_4_ + ')');
			}
			break;
		} while (false);
	}

	final int method721(int i, int i_5_) {
		try {
			anInt6926++;
			if (i_5_ <= 10)
				anIntArrayArrayArray6923 = null;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nh.F(" + i + ','
					+ i_5_ + ')');
		}
	}

	Class108_Sub18(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
	}

	final int method2809(boolean bool) {
		try {
			anInt6931++;
			if (bool != false)
				method2808(87, -62, 74);
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nh.B(" + bool + ')');
		}
	}

	final int method725(byte i) {
		try {
			anInt6929++;
			int i_6_ = -40 % ((70 - i) / 51);
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nh.A(" + i + ')');
		}
	}
}
