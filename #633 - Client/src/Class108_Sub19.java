/* Class108_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108_Sub19 extends Class108 {
	static int anInt7105;
	static int anInt7106;
	static int anInt7107;
	static int anInt7108;
	static int anInt7109 = -1;
	static int anInt7110;
	static int anInt7111;
	static int anInt7112;
	static int[][] anIntArrayArray7113 = { { 0, 2 }, { 0, 2 }, { 0, 0, 2 },
			{ 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 },
			{ 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 },
			{ 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 },
			{ 0, 4, 4, 4 }, { 0, 4, 4, 4 } };
	static int anInt7114;

	final int method721(int i, int i_0_) {
		try {
			anInt7107++;
			if ((i ^ 0xffffffff) == -1
					|| ((Class11_Sub17) ((Class108) this).aClass11_Sub17_1458).aClass108_Sub16_5721
							.method2710(false) == 1)
				return 1;
			if (i_0_ <= 10)
				return -42;
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pu.F(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final void method2890(int i, int i_1_, byte[][][] is, int i_2_,
			int i_3_, Class163 class163, int i_4_, int i_5_, int i_6_,
			int i_7_, boolean bool, int i_8_, int i_9_) {
		do {
			try {
				anInt7111++;
				if (i_2_ != 0 && i_3_ != 0) {
					if (i_2_ == 9) {
						i_2_ = 1;
						i_9_ = 0x3 & 1 + i_9_;
					}
					if (i_2_ == 10) {
						i_9_ = 3 + i_9_ & 0x3;
						i_2_ = 1;
					}
					if ((i_2_ ^ 0xffffffff) == -12) {
						i_9_ = i_9_ + 3 & 0x3;
						i_2_ = 8;
					}
					class163.Q(i, i_8_, i_6_, i_1_, i_7_, i_4_,
							is[i_2_ - 1][i_9_], i_3_, i_5_);
					if (bool == true)
						break;
					method2893(-43);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("pu.I(" + i + ','
						+ i_1_ + ',' + (is != null ? "{...}" : "null") + ','
						+ i_2_ + ',' + i_3_ + ','
						+ (class163 != null ? "{...}" : "null") + ',' + i_4_
						+ ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + bool
						+ ',' + i_8_ + ',' + i_9_ + ')'));
			}
			break;
		} while (false);
	}

	static final boolean method2891(int i, int i_10_, int i_11_) {
		try {
			if (i_11_ > 0)
				anInt7109 = 58;
			anInt7110++;
			return (Class180.method1178(8, i_10_, i) & Class363.method2152(i,
					false, i_10_));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pu.G(" + i + ','
					+ i_10_ + ',' + i_11_ + ')'));
		}
	}

	final int method2892(boolean bool) {
		try {
			if (bool != false)
				anIntArrayArray7113 = null;
			anInt7105++;
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pu.B(" + bool + ')');
		}
	}

	final void method728(int i, int i_12_) {
		do {
			try {
				((Class108) this).anInt1459 = i_12_;
				anInt7108++;
				if (i == 0)
					break;
				method2890(-86, 48, null, -61, -120, null, -15, 57, -121, 63,
						false, -19, -100);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "pu.C(" + i + ','
						+ i_12_ + ')');
			}
			break;
		} while (false);
	}

	final void method726(boolean bool) {
		try {
			if ((((Class108) this).anInt1459 ^ 0xffffffff) != -1
					&& (((Class11_Sub17) ((Class108) this).aClass11_Sub17_1458).aClass108_Sub16_5721
							.method2710(false) ^ 0xffffffff) != -2)
				((Class108) this).anInt1459 = 0;
			if (bool == false) {
				anInt7114++;
				if (((Class108) this).anInt1459 < 0
						|| (((Class108) this).anInt1459 ^ 0xffffffff) < -2)
					((Class108) this).anInt1459 = method725((byte) 127);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pu.E(" + bool + ')');
		}
	}

	public static void method2893(int i) {
		do {
			try {
				anIntArrayArray7113 = null;
				if (i == 0)
					break;
				anInt7109 = -52;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "pu.H(" + i + ')');
			}
			break;
		} while (false);
	}

	Class108_Sub19(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
	}

	final boolean method2894(byte i) {
		try {
			anInt7106++;
			if (i != -53)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pu.D(" + i + ')');
		}
	}

	Class108_Sub19(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}

	final int method725(byte i) {
		try {
			anInt7112++;
			int i_13_ = 1 / ((i - 70) / 51);
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pu.A(" + i + ')');
		}
	}
}
