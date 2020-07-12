/* Class11_Sub23_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub23_Sub2 extends Class11_Sub23 {
	static int anInt9510 = Class163_Sub2_Sub1.method3406((byte) 112, 1600);
	static int anInt9511;
	static int anInt9512;
	static int anInt9513;
	static int anInt9514;
	int anInt9515;
	int anInt9516;
	static int anInt9517;
	int anInt9518;
	int anInt9519;
	static int anInt9520;
	static float aFloat9521;
	static int anInt9522;
	long aLong9523;
	static int anInt9524;

	static final void method3751() {
		for (int i = 0; i < Packet.aClass13Array8724.length; i++)
			Packet.aClass13Array8724[i].method139();
		Packet.aClass13Array8724 = null;
	}

	final int method2571(int i) {
		try {
			anInt9512++;
			if (i != -5)
				return -71;
			return ((Class11_Sub23_Sub2) this).anInt9518;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rv.C(" + i + ')');
		}
	}

	final long method2573(int i) {
		try {
			if (i <= 75)
				return -25L;
			anInt9513++;
			return ((Class11_Sub23_Sub2) this).aLong9523;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rv.E(" + i + ')');
		}
	}

	static final int method3752(int i, int i_0_, int i_1_, int i_2_) {
		try {
			anInt9511++;
			if (Class164.anInt2133 < 100)
				return -2;
			if (i_2_ != 0)
				return -44;
			int i_3_ = -2;
			int i_4_ = 2147483647;
			int i_5_ = -Class32.anInt441 + i_1_;
			int i_6_ = -Class32.anInt451 + i_0_;
			for (Class11_Sub21 class11_sub21 = ((Class11_Sub21) Class32.aClass84_425
					.method584(i_2_ ^ ~0x2fe4)); class11_sub21 != null; class11_sub21 = ((Class11_Sub21) Class32.aClass84_425
					.method578(-15361))) {
				if ((((Class11_Sub21) class11_sub21).anInt5964 ^ 0xffffffff) == (i ^ 0xffffffff)) {
					int i_7_ = ((Class11_Sub21) class11_sub21).anInt5970;
					int i_8_ = ((Class11_Sub21) class11_sub21).anInt5969;
					int i_9_ = (Class32.anInt451 + i_8_ | i_7_
							+ Class32.anInt441 << 14);
					int i_10_ = ((-i_8_ + i_6_) * (-i_8_ + i_6_) + (-i_7_ + i_5_)
							* (i_5_ - i_7_));
					if (i_3_ < 0 || (i_4_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff)) {
						i_4_ = i_10_;
						i_3_ = i_9_;
					}
				}
			}
			return i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rv.J(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method3753(Class163 class163,
			IComponentDefinitions class192, int i) {
		do {
			try {
				anInt9520++;
				if (i > -108)
					method3754(-28, -5, (byte) 58);
				boolean bool = ((Packet.aClass223_8723
						.method1420(
								class163,
								((IComponentDefinitions) class192).anInt2554
										| ~0xffffff,
								((IComponentDefinitions) class192).anInt2474,
								((IComponentDefinitions) class192).anInt2466,
								(((IComponentDefinitions) class192).aBool2485 ? (((Player) (Class11_Sub2_Sub8.myPlayer)).aClass258_10418)
										: null), (byte) -100,
								((IComponentDefinitions) class192).anInt2572,
								((IComponentDefinitions) class192).anInt2467)) == null);
				if (!bool)
					break;
				Class352.aClass84_4630
						.method589(
								(byte) -13,
								new Class11_Sub33(
										((IComponentDefinitions) class192).anInt2467,
										((IComponentDefinitions) class192).anInt2572,
										((IComponentDefinitions) class192).anInt2466,
										(~0xffffff | ((IComponentDefinitions) class192).anInt2554),
										((IComponentDefinitions) class192).anInt2474,
										((IComponentDefinitions) class192).aBool2485));
				Class232.method1484(class192, 1);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("rv.H(" + (class163 != null ? "{...}" : "null") + ','
								+ (class192 != null ? "{...}" : "null") + ','
								+ i + ')'));
			}
			break;
		} while (false);
	}

	final int method2569(int i) {
		try {
			if (i > -111)
				method2568((byte) -97);
			anInt9524++;
			return ((Class11_Sub23_Sub2) this).anInt9516;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rv.B(" + i + ')');
		}
	}

	static final boolean method3754(int i, int i_11_, byte i_12_) {
		try {
			if (i_12_ != -6)
				anInt9510 = -107;
			anInt9517++;
			if (!(Class93.method628(i, i_11_, 30743) | (i_11_ & 0x60000) != 0)
					&& !Class376_Sub7_Sub4_Sub2.method3911(4285, i_11_, i)
					&& !Class197.method1279(5, i, i_11_))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rv.G(" + i + ','
					+ i_11_ + ',' + i_12_ + ')'));
		}
	}

	final int method2570(int i) {
		try {
			if (i != 0)
				return -67;
			anInt9514++;
			return ((Class11_Sub23_Sub2) this).anInt9515;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rv.D(" + i + ')');
		}
	}

	final int method2568(byte i) {
		try {
			anInt9522++;
			int i_13_ = 84 / ((-14 - i) / 60);
			return ((Class11_Sub23_Sub2) this).anInt9519;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rv.A(" + i + ')');
		}
	}
}
