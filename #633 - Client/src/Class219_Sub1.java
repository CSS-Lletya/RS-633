/* Class219_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class219_Sub1 extends Class219 {
	static int anInt7238;
	static int anInt7239;
	static int anInt7240;
	static boolean aBool7241;
	static byte[][] aByteArrayArray7242;
	static boolean aBool7243;
	static float aFloat7244 = 1024.0F;
	static int RUN_ENERGY;
	Class315[] aClass315Array7246;
	static int anInt7247;
	static int[] anIntArray7248;

	static final void method2937(int i) {
		try {
			if (i >= -111)
				aBool7243 = true;
			anInt7247++;
			for (Class11_Sub15 class11_sub15 = ((Class11_Sub15) Class198.aClass84_2686
					.method584(-12261)); class11_sub15 != null; class11_sub15 = ((Class11_Sub15) Class198.aClass84_2686
					.method578(-15361))) {
				if (((Class11_Sub15) class11_sub15).anInt5600 == -1) {
					((Class11_Sub15) class11_sub15).anInt5608 = 0;
					if ((((Class11_Sub15) class11_sub15).anInt5596 ^ 0xffffffff) <= -1
							&& ((Class11_Sub15) class11_sub15).anInt5595 >= 0
							&& (Class300.anInt4051 > ((Class11_Sub15) class11_sub15).anInt5596)
							&& (((Class11_Sub15) class11_sub15).anInt5595 < Class108_Sub12.anInt6228))
						Class369.method2175(class11_sub15, true);
				} else
					class11_sub15.method122(-92);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ro.C(" + i + ')');
		}
	}

	static final boolean method2938(int i, int i_0_, int i_1_) {
		try {
			if (i_1_ != -31423)
				anInt7240 = -47;
			anInt7239++;
			return (OutgoingPacket.method2184(i_0_, i, 1485) & (Class11_Sub45_Sub5
					.method3437((byte) 33, i, i_0_)
					| (i_0_ & 0x2000 ^ 0xffffffff) != -1 | Class11_Sub46
						.method3207(i_0_, (byte) -94, i)));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ro.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	public static void method2939(int i) {
		try {
			if (i == -12529) {
				anIntArray7248 = null;
				aByteArrayArray7242 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ro.B(" + i + ')');
		}
	}

	Class219_Sub1(Class315[] class315s) {
		try {
			((Class219_Sub1) this).aClass315Array7246 = class315s;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ro.<init>("
					+ (class315s != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		anInt7238 = 1;
		aBool7243 = false;
		aBool7241 = false;
		aByteArrayArray7242 = new byte[250][];
		RUN_ENERGY = 0;
	}
}
