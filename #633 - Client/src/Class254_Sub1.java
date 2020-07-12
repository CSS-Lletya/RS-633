/* Class254_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class254_Sub1 extends Class254 {
	static int anInt5519 = 0;
	static int anInt5520;
	int anInt5521;
	static int anInt5522;
	static int anInt5523;
	int anInt5524;

	Class254_Sub1(Class118 class118, Class150 class150, int i, int i_0_,
			int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_,
			int i_7_, int i_8_) {
		super(class118, class150, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_);
		try {
			((Class254_Sub1) this).anInt5524 = i_7_;
			((Class254_Sub1) this).anInt5521 = i_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("uha.<init>("
					+ (class118 != null ? "{...}" : "null") + ','
					+ (class150 != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	public final Class9 method21(boolean bool) {
		try {
			if (bool != false)
				method2408(109, null);
			anInt5523++;
			return Class15.aClass9_131;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uha.A(" + bool + ')');
		}
	}

	static final void method2408(int i, Class12 class12) {
		Class315.aClass12Array4179[i] = class12;
	}

	static final void method2409(int i, int i_9_, Class163 class163) {
		do {
			try {
				anInt5522++;
				if (!Class108_Sub10.aBool6130 || !Class236_Sub5.aBool6848)
					Class108_Sub16.anInt6551 = 0;
				else {
					if (Class11_Sub45_Sub12.aBool9189)
						Class65.aLong941 = InputStream_Sub2.aClass324_6947
								.method1976(false);
					Class112.anInt1540 = 0;
					Class2.anInt19 = 0;
					Class201.anInt2711 = 0;
					int[] is = class163.Y();
					Class11_Sub2_Sub33.anInt9669 = (int) ((float) is[3] / 3.0F);
					Class71.anInt997 = (int) ((float) is[2] / 3.0F);
					class163.method1037(Class194.anIntArray2646);
					if (((int) ((float) Class194.anIntArray2646[0] / 3.0F) ^ 0xffffffff) != (Class2_Sub1.anInt5065 ^ 0xffffffff)
							|| ((int) ((float) Class194.anIntArray2646[1] / 3.0F) != Class6.anInt39)) {
						Class2_Sub1.anInt5065 = (int) ((float) Class194.anIntArray2646[0] / 3.0F);
						Class6.anInt39 = (int) ((float) Class194.anIntArray2646[1] / 3.0F);
						Class11_Sub2_Sub1.anIntArray8436 = new int[Class6.anInt39
								* Class2_Sub1.anInt5065];
						Class323.anInt4320 = Class6.anInt39 >> 1;
						Class228.anInt3151 = Class2_Sub1.anInt5065 >> 1;
					}
					Class236_Sub8.aClass33_7069 = class163.method1045();
					Class108_Sub16.anInt6551 = 0;
					for (int i_10_ = 0; Class142.anInt1926 > i_10_; i_10_++)
						Class256_Sub4.method3200(class163, i, (byte) 95,
								(Class242.aClass203Array3287[i_10_]));
					for (int i_11_ = 0; ((i_11_ ^ 0xffffffff) > (Class11_Sub30.anInt6612 ^ 0xffffffff)); i_11_++)
						Class256_Sub4.method3200(class163, i, (byte) 79,
								(Class11_Sub2_Sub28.aClass203Array9423[i_11_]));
					for (int i_12_ = 0; ((i_12_ ^ 0xffffffff) > (Class265.anInt3614 ^ 0xffffffff)); i_12_++)
						Class256_Sub4.method3200(class163, i, (byte) 124,
								(Class58_Sub1_Sub1.aClass203Array9173[i_12_]));
					Class217.anInt3003 = 0;
					if (Class108_Sub16.anInt6551 > i_9_) {
						int i_13_ = Class11_Sub2_Sub1.anIntArray8436.length;
						int i_14_ = 0x7 & i_13_ - i_13_;
						int i_15_ = 0;
						while (i_15_ < i_14_) {
							Class11_Sub2_Sub1.anIntArray8436[i_15_++] = 2147483647;
							Class11_Sub2_Sub1.anIntArray8436[i_15_++] = 2147483647;
							Class11_Sub2_Sub1.anIntArray8436[i_15_++] = 2147483647;
							Class11_Sub2_Sub1.anIntArray8436[i_15_++] = 2147483647;
							Class11_Sub2_Sub1.anIntArray8436[i_15_++] = 2147483647;
							Class11_Sub2_Sub1.anIntArray8436[i_15_++] = 2147483647;
							Class11_Sub2_Sub1.anIntArray8436[i_15_++] = 2147483647;
							Class11_Sub2_Sub1.anIntArray8436[i_15_++] = 2147483647;
						}
						while (i_13_ > i_15_)
							Class11_Sub2_Sub1.anIntArray8436[i_15_++] = 2147483647;
						Class126.anInt1708 = 1;
						for (int i_16_ = 0; ((Class108_Sub16.anInt6551 ^ 0xffffffff) < (i_16_ ^ 0xffffffff)); i_16_++) {
							Class203 class203 = Class93.aClass203Array1248[i_16_];
							Class2_Sub9.method2948(
									((Class203) class203).aShortArray2732[1],
									((Class203) class203).aShortArray2735[0],
									((Class203) class203).aShortArray2735[1],
									((Class203) class203).aShortArray2732[3],
									((Class203) class203).aShortArray2726[1],
									((Class203) class203).aShortArray2735[3],
									((Class203) class203).aShortArray2726[3],
									((Class203) class203).aShortArray2726[0],
									(byte) -126,
									((Class203) class203).aShortArray2732[0]);
							Class2_Sub9.method2948(
									((Class203) class203).aShortArray2732[2],
									((Class203) class203).aShortArray2735[1],
									((Class203) class203).aShortArray2735[2],
									((Class203) class203).aShortArray2732[3],
									((Class203) class203).aShortArray2726[2],
									((Class203) class203).aShortArray2735[3],
									((Class203) class203).aShortArray2726[3],
									((Class203) class203).aShortArray2726[1],
									(byte) -126,
									((Class203) class203).aShortArray2732[1]);
						}
						Class126.anInt1708 = 2;
					}
					if (!Class11_Sub45_Sub12.aBool9189)
						break;
					Class11_Sub2_Sub10.aLong8850 = (InputStream_Sub2.aClass324_6947
							.method1976(false) + -Class65.aLong941);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("uha.B(" + i + ',' + i_9_ + ','
								+ (class163 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final Class83[] method2410(int i) {
		try {
			if (i >= -72)
				return null;
			anInt5520++;
			return (new Class83[] { Class11_Sub15.aClass83_5610,
					Class323.aClass83_4318, Class64.aClass83_927,
					Class376_Sub7_Sub4_Sub1.aClass83_9942,
					Class243.aClass83_3301, Class190.aClass83_2441,
					Class357.aClass83_4665, Class376_Sub1.aClass83_5101,
					Class11_Sub8.aClass83_5307, Class254.aClass83_3496,
					Class237.aClass83_3238, Class11_Sub2_Sub5.aClass83_8560,
					Class55.aClass83_835, Class94_Sub3.aClass83_6907 });
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uha.D(" + i + ')');
		}
	}
}
