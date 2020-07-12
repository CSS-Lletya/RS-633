/* Class222 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class222 implements Interface16 {
	static int anInt3041;
	static int anInt3042;
	static int anInt3043;
	private Class146 aClass146_3044;
	static int anInt3045;
	static int anInt3046;
	static int anInt3047;
	static int anInt3048;

	Class222(Class146 class146) {
		try {
			aClass146_3044 = class146;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lg.<init>("
					+ (class146 != null ? "{...}" : "null") + ')'));
		}
	}

	public final Class117 method47(int i) {
		try {
			int i_0_ = -58 % ((-19 - i) / 60);
			anInt3045++;
			return Class117.aClass117_1587;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lg.B(" + i + ')');
		}
	}

	static final Class338 method1417(int i, int i_1_, byte i_2_) {
		try {
			anInt3043++;
			Class338 class338 = new Class338();
			((Class338) class338).anInt4465 = -1;
			((Class338) class338).anInt4468 = i_1_ + 6;
			((Class338) class338).anInt4470 = -1;
			((Class338) class338).anInt4475 = 5 + (i + 1);
			((Class338) class338).anIntArrayArray4459 = (new int[((Class338) class338).anInt4475][((Class338) class338).anInt4468]);
			if (i_2_ < 64)
				return null;
			class338.method2044((byte) 93);
			return class338;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lg.D(" + i + ','
					+ i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method1418(int i) {
		try {
			Class11_Sub2_Sub14.aClass22_9013.method189((byte) -15);
			anInt3046++;
			int i_3_ = 30 / ((i + 56) / 44);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lg.C(" + i + ')');
		}
	}

	public final int method30(int i) {
		try {
			anInt3042++;
			if (i != 6340)
				return -19;
			if (aClass146_3044.method916(i ^ ~0x4bb))
				return 100;
			return aClass146_3044.method912(0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lg.A(" + i + ')');
		}
	}

	static final void method1419(Class11_Sub45_Sub1 class11_sub45_sub1, int i,
			int i_4_, int i_5_, boolean[] bools) {
		if (Class315.aClass12Array4179 != Class234_Sub1_Sub1.aClass12Array9729) {
			int i_6_ = Class11_Sub2_Sub38.aClass12Array9796[i].method130(i_5_,
					i_4_, -126);
			for (int i_7_ = 0; i_7_ <= i; i_7_++) {
				if (bools == null || bools[i_7_]) {
					Class12 class12 = Class11_Sub2_Sub38.aClass12Array9796[i_7_];
					if (class12 != null)
						class12.wa(class11_sub45_sub1, i_4_,
								i_6_ - class12.method130(i_5_, i_4_, -126),
								i_5_, 0, false);
				}
			}
		}
	}
}
