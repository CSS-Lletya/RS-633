/* Class73 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class73 {
	static float aFloat1005;
	static int anInt1006;
	static int anInt1007 = -1;
	private Class22 aClass22_1008 = new Class22(256);
	static int anInt1009;
	static int anInt1010;
	private Interface1 anInterface1_1011;
	static int anInt1012 = -1;
	static String[] aStringArray1013;
	static int anInt1014;
	static int anInt1015;
	private Class163_Sub3 aClass163_Sub3_1016;
	static int[] anIntArray1017 = new int[14];

	final void method518(int i) {
		try {
			anInt1009++;
			aClass22_1008.method182(i, (byte) -73);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ad.A(" + i + ')');
		}
	}

	final void method519(boolean bool) {
		try {
			if (bool != true)
				aStringArray1013 = null;
			aClass22_1008.method189((byte) -126);
			anInt1010++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ad.B(" + bool + ')');
		}
	}

	final Class321_Sub3 method520(int i, int i_0_) {
		try {
			anInt1015++;
			Object object = aClass22_1008.method188((long) i, (byte) -94);
			if (object != null)
				return (Class321_Sub3) object;
			if (!anInterface1_1011.method2(i, -105))
				return null;
			Class188 class188 = anInterface1_1011.method7((byte) 127, i);
			int i_1_ = (((Class188) class188).aBool2430 ? 64
					: ((Class163_Sub3) aClass163_Sub3_1016).anInt8264);
			Class321_Sub3 class321_sub3;
			if (((Class188) class188).aBool2412
					&& aClass163_Sub3_1016.method1086()) {
				float[] fs = anInterface1_1011.method5(i_1_, -23173, i_1_, i,
						0.7F, false);
				class321_sub3 = new Class321_Sub3(aClass163_Sub3_1016, 3553,
						34842, i_1_, i_1_,
						(((Class188) class188).aByte2422 ^ 0xffffffff) != -1,
						fs, 6408);
			} else {
				int[] is;
				if (((Class188) class188).anInt2425 == 2
						|| !Class10.method118((byte) -51,
								((Class188) class188).aByte2426))
					is = anInterface1_1011.method3(i_1_, -96, false, 0.7F,
							i_1_, i);
				else
					is = anInterface1_1011.method6(true, i_1_, 20377, i_1_,
							0.7F, i);
				class321_sub3 = new Class321_Sub3(aClass163_Sub3_1016, 3553,
						6408, i_1_, i_1_, ((Class188) class188).aByte2422 != 0,
						is, 0, 0, false);
			}
			class321_sub3.method2855(((Class188) class188).aBool2419,
					((Class188) class188).aBool2420, 105);
			if (i_0_ > -101)
				aStringArray1013 = null;
			aClass22_1008.method184((byte) 125, class321_sub3, (long) i);
			return class321_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ad.D(" + i + ','
					+ i_0_ + ')');
		}
	}

	public static void method521(int i) {
		try {
			aStringArray1013 = null;
			if (i != -21052)
				method522(false, 103, 113, 20);
			anIntArray1017 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ad.C(" + i + ')');
		}
	}

	static final int method522(boolean bool, int i, int i_2_, int i_3_) {
		try {
			if (i_2_ > -2)
				return -85;
			anInt1006++;
			Class11_Sub37 class11_sub37 = Class26.method218(bool, -9854, i);
			if (class11_sub37 == null)
				return 0;
			if (i_3_ < 0
					|| (((Class11_Sub37) class11_sub37).anIntArray7088.length ^ 0xffffffff) >= (i_3_ ^ 0xffffffff))
				return 0;
			return ((Class11_Sub37) class11_sub37).anIntArray7088[i_3_];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ad.E(" + bool + ','
					+ i + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	Class73(Class163_Sub3 class163_sub3, Interface1 interface1) {
		try {
			aClass163_Sub3_1016 = class163_sub3;
			anInterface1_1011 = interface1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ad.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ','
					+ (interface1 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		anInt1014 = 1405;
	}
}
