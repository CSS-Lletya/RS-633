/* Class181 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class181 {
	static int anInt2334;
	static int anInt2335 = 1400;
	static Class364[][][] aClass364ArrayArrayArray2336;
	static Class46 aClass46_2337;
	static int anInt2338;

	public static void method1186(int i) {
		try {
			if (i > 69) {
				aClass364ArrayArrayArray2336 = null;
				aClass46_2337 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ii.A(" + i + ')');
		}
	}

	static final void method1187(boolean bool) {
		try {
			Class108_Sub23.anInt7766 = -1;
			Class11_Sub45_Sub1_Sub2.anInt9885 = 1;
			anInt2338++;
			if (bool == false) {
				long l = 0L;
				if (Class286.aString3874 == null)
					Class340.method2051(35, false);
				else {
					Stream stream = new Stream(Class87.method615(
							(Class376_Sub7_Sub4.method3766(
									Class286.aString3874, bool)), -109));
					l = stream.method2516(8919);
					Class309.aLong4144 = stream.method2516(8919);
					Class11_Sub2_Sub4.method3352(
							Class11_Sub49.method3223(l, -2787), true, 0, "");
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ii.B(" + bool + ')');
		}
	}

	static final boolean method1188(int i, int i_0_, int i_1_, int i_2_,
			int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		try {
			anInt2334++;
			if (!Class190.method1236(i, i_6_, i_4_, 3713))
				return false;
			i_4_ = Class303.anIntArray4086[1];
			i_6_ = Class303.anIntArray4086[2];
			i = Class303.anIntArray4086[0];
			if (!Class190.method1236(i_5_, i_8_, i_0_, 3713))
				return false;
			i_8_ = Class303.anIntArray4086[2];
			i_0_ = Class303.anIntArray4086[1];
			i_5_ = Class303.anIntArray4086[i_2_];
			if (!Class190.method1236(i_3_, i_1_, i_7_, i_2_ + 3713))
				return false;
			i_3_ = Class303.anIntArray4086[0];
			i_1_ = Class303.anIntArray4086[2];
			i_7_ = Class303.anIntArray4086[1];
			return Class2_Sub9.method2948(i_0_, i_6_, i_8_, i_7_, i_5_, i_1_,
					i_3_, i, (byte) -126, i_4_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ii.C(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}
}
