/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class57 implements Interface6 {
	Class150 aClass150_853;
	static int anInt854;
	int anInt855;
	static boolean aBool856 = false;
	int anInt857;
	Class118 aClass118_858;
	int anInt859;
	static int anInt860;
	static int anInt861;
	static float aFloat862;

	static final void method452(int i, int i_0_,
			IComponentDefinitions class192, int i_1_) {
		do {
			try {
				anInt860++;
				if (((IComponentDefinitions) class192).aByte2617 == 0)
					((IComponentDefinitions) class192).anInt2490 = ((IComponentDefinitions) class192).anInt2550;
				else if ((((IComponentDefinitions) class192).aByte2617 ^ 0xffffffff) == -2)
					((IComponentDefinitions) class192).anInt2490 = ((i_0_ - ((IComponentDefinitions) class192).anInt2546) / 2 + ((IComponentDefinitions) class192).anInt2550);
				else if ((((IComponentDefinitions) class192).aByte2617 ^ 0xffffffff) != -3) {
					if ((((IComponentDefinitions) class192).aByte2617 ^ 0xffffffff) != -4) {
						if (((IComponentDefinitions) class192).aByte2617 != 4)
							((IComponentDefinitions) class192).anInt2490 = (-(i_0_
									* ((IComponentDefinitions) class192).anInt2550 >> 14) + (-((IComponentDefinitions) class192).anInt2546 + i_0_));
						else
							((IComponentDefinitions) class192).anInt2490 = (((i_0_ + -((IComponentDefinitions) class192).anInt2546) / 2) - -(i_0_
									* ((IComponentDefinitions) class192).anInt2550 >> 14));
					} else
						((IComponentDefinitions) class192).anInt2490 = i_0_
								* ((IComponentDefinitions) class192).anInt2550 >> 14;
				} else
					((IComponentDefinitions) class192).anInt2490 = (-((IComponentDefinitions) class192).anInt2546 + (i_0_ - ((IComponentDefinitions) class192).anInt2550));
				int i_2_ = 43 % ((i - 79) / 47);
				if (((IComponentDefinitions) class192).aByte2473 == 0)
					((IComponentDefinitions) class192).anInt2469 = ((IComponentDefinitions) class192).anInt2615;
				else if (((IComponentDefinitions) class192).aByte2473 != 1) {
					if ((((IComponentDefinitions) class192).aByte2473 ^ 0xffffffff) != -3) {
						if (((IComponentDefinitions) class192).aByte2473 == 3)
							((IComponentDefinitions) class192).anInt2469 = i_1_
									* ((IComponentDefinitions) class192).anInt2615 >> 14;
						else if (((IComponentDefinitions) class192).aByte2473 != 4)
							((IComponentDefinitions) class192).anInt2469 = i_1_
									+ (-((IComponentDefinitions) class192).anInt2610 + -((((IComponentDefinitions) class192).anInt2615 * i_1_) >> 14));
						else
							((IComponentDefinitions) class192).anInt2469 = ((i_1_
									* ((IComponentDefinitions) class192).anInt2615 >> 14) + ((i_1_ - ((IComponentDefinitions) class192).anInt2610) / 2));
					} else
						((IComponentDefinitions) class192).anInt2469 = (-((IComponentDefinitions) class192).anInt2610 + (i_1_ + -((IComponentDefinitions) class192).anInt2615));
				} else
					((IComponentDefinitions) class192).anInt2469 = (((IComponentDefinitions) class192).anInt2615 + (i_1_ + -((IComponentDefinitions) class192).anInt2610) / 2);
				if (!Class11_Sub2_Sub14.aBool9010)
					break;
				if (((InterfaceSettings) client.method4013(class192)).anInt5349 != 0
						|| ((IComponentDefinitions) class192).anInt2531 == 0) {
					if ((((IComponentDefinitions) class192).anInt2469 ^ 0xffffffff) <= -1) {
						if (((((IComponentDefinitions) class192).anInt2469 - -((IComponentDefinitions) class192).anInt2610) ^ 0xffffffff) < (i_1_ ^ 0xffffffff))
							((IComponentDefinitions) class192).anInt2469 = i_1_
									+ -((IComponentDefinitions) class192).anInt2610;
					} else
						((IComponentDefinitions) class192).anInt2469 = 0;
					if ((((IComponentDefinitions) class192).anInt2490 ^ 0xffffffff) <= -1) {
						if ((((IComponentDefinitions) class192).anInt2546 + ((IComponentDefinitions) class192).anInt2490) > i_0_)
							((IComponentDefinitions) class192).anInt2490 = -((IComponentDefinitions) class192).anInt2546
									+ i_0_;
					} else
						((IComponentDefinitions) class192).anInt2490 = 0;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("wfa.B(" + i + ','
						+ i_0_ + ',' + (class192 != null ? "{...}" : "null")
						+ ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	Class57(int i, Class118 class118, Class150 class150, int i_3_, int i_4_) {
		try {
			((Class57) this).aClass150_853 = class150;
			((Class57) this).anInt859 = i_3_;
			((Class57) this).anInt855 = i_4_;
			((Class57) this).aClass118_858 = class118;
			((Class57) this).anInt857 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wfa.<init>(" + i
					+ ',' + (class118 != null ? "{...}" : "null") + ','
					+ (class150 != null ? "{...}" : "null") + ',' + i_3_ + ','
					+ i_4_ + ')'));
		}
	}

	public Class9 method21(boolean bool) {
		try {
			if (bool != false)
				return null;
			anInt854++;
			return Class265.aClass9_3610;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wfa.A(" + bool + ')');
		}
	}
}
