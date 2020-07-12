/* Class138 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class138 {
	static int anInt1884;
	static int[] anIntArray1885;
	static int anInt1886;
	static int anInt1887 = 2;
	static String[] aStringArray1888;
	static int anInt1889;

	static final void method879(int i) {
		try {
			anInt1889++;
			if (Class58.aClass11_Sub45_Sub14_873 != null) {
				Class58.aClass11_Sub45_Sub14_873 = null;
				if (i == 1)
					Class304.method1869(Class11_Sub2_Sub36.anInt9753,
							Class98.anInt1305, -17012,
							Class11_Sub2_Sub25.anInt9328, Class66.anInt942);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ew.B(" + i + ')');
		}
	}

	static final void method880(int i, int i_0_, int i_1_) {
		try {
			anInt1884++;
			if (Class243.aClass163_3308 != null) {
				int i_2_ = Class39.anInt556;
				int i_3_ = Class11_Sub45_Sub10.anInt8958;
				Class71.method514(i, i_1_, (byte) 89);
				if (i_0_ == OutputStream_Sub1.anInt5845) {
					Class11_Sub2_Sub32_Sub1.anInterface10_9891 = null;
					Class11_Sub2_Sub32_Sub1.anInterface10_9891 = (Class243.aClass163_3308
							.method1066(Class243.aClass163_3308.method1033(
									(Class11_Sub39.anInt7215),
									(Class11_Sub33.anInt6897)),
									Class243.aClass163_3308.method1071(
											(Class11_Sub39.anInt7215),
											(Class11_Sub33.anInt6897))));
				} else if (OutputStream_Sub1.anInt5845 == 1
						&& (Class286.anInterface10Array3872 == null
								|| (i_2_ ^ 0xffffffff) != (Class39.anInt556 ^ 0xffffffff) || Class11_Sub45_Sub10.anInt8958 != i_3_)) {
					Class286.anInterface10Array3872 = (new Interface10[Class39.anInt556
							* Class11_Sub45_Sub10.anInt8958]);
					for (int i_4_ = 0; i_4_ < Class286.anInterface10Array3872.length; i_4_++)
						Class286.anInterface10Array3872[i_4_] = (Class243.aClass163_3308
								.method1066((Class243.aClass163_3308
										.method1033(Class11_Sub27.anInt6556,
												Class11_Sub24.anInt6238)),
										(Class243.aClass163_3308.method1071(
												Class11_Sub27.anInt6556,
												Class11_Sub24.anInt6238))));
					Class78.anInt1057 = 1;
					Class175.anIntArray2231 = (new int[Class39.anInt556
							* Class11_Sub45_Sub10.anInt8958]);
				}
				Class333.aBool4411 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ew.C(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	public static void method881(byte i) {
		try {
			if (i != 5)
				aStringArray1888 = null;
			aStringArray1888 = null;
			anIntArray1885 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ew.A(" + i + ')');
		}
	}
}
