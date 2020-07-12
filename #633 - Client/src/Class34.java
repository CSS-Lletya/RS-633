/* Class34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class34 {
	static int anInt458;
	static int[] anIntArray459 = new int[25];
	static int anInt460;
	static int anInt461;
	static int anInt462;
	static short[][][] aShortArrayArrayArray463;

	static final void method304(byte i) {
		do {
			try {
				if (Class254.aClass37_3498 != null)
					Class254.aClass37_3498.method314(-8910);
				int i_0_ = -4 % ((-26 - i) / 49);
				anInt462++;
				if (Class343.aClass37_4540 == null)
					break;
				Class343.aClass37_4540.method314(-8910);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "lda.B(" + i + ')');
			}
			break;
		} while (false);
	}

	public Class34() {
		/* empty */
	}

	public final String toString() {
		try {
			anInt461++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lda.toString(" + ')');
		}
	}

	static final void method305(int i) {
		try {
			anInt460++;
			if (Class358.aBool4670) {
				if (i <= 96)
					aShortArrayArrayArray463 = null;
				while ((Class362.anInt4716 ^ 0xffffffff) > (Class65.aClass195_Sub1Array940.length ^ 0xffffffff)) {
					Class195_Sub1 class195_sub1 = Class65.aClass195_Sub1Array940[Class362.anInt4716];
					if (class195_sub1 == null
							|| ((Class195_Sub1) class195_sub1).anInt6156 != -1)
						Class362.anInt4716++;
					else {
						if (Class11_Sub25.aClass11_Sub31_6280 == null)
							Class11_Sub25.aClass11_Sub31_6280 = (Class95.aClass164_1277
									.method1093(
											(((Class195_Sub1) class195_sub1).aString6154),
											(byte) 54));
						int i_1_ = (((Class11_Sub31) Class11_Sub25.aClass11_Sub31_6280).anInt6700);
						if (i_1_ == -1)
							break;
						Class362.anInt4716++;
						Class11_Sub25.aClass11_Sub31_6280 = null;
						((Class195_Sub1) class195_sub1).anInt6156 = i_1_;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lda.D(" + i + ')');
		}
	}

	static final void method306(int i) {
		do {
			try {
				anInt458++;
				if (Class365.anInt4797 != -1) {
					int i_2_ = Class280.aClass225_3786.method1449(-108);
					int i_3_ = Class280.aClass225_3786.method1448((byte) -63);
					Class11_Sub23 class11_sub23 = (Class11_Sub23) Class108_Sub13.aClass84_6264
							.method584(i ^ ~0x2ffd);
					if (i != 25)
						anIntArray459 = null;
					if (class11_sub23 != null) {
						i_2_ = class11_sub23.method2568((byte) -76);
						i_3_ = class11_sub23.method2569(-121);
					}
					int i_4_ = 0;
					int i_5_ = 0;
					if (Class11_Sub2_Sub19.aBool9087) {
						i_4_ = Class54.method443(i + 5442);
						i_5_ = Class376_Sub7_Sub4_Sub1.method3887((byte) -126);
					}
					Class2_Sub5.method2402(i_4_, i_5_, Class153.anInt2025
							+ i_5_, i_5_, i_3_, -1, i_3_ + i_5_, i_4_, i_2_
							+ i_4_, i_4_ - -Class11_Sub36.anInt7079,
							Class365.anInt4797, i_2_);
					if (Class333.aClass192_4417 == null)
						break;
					Class376_Sub7_Sub5_Sub1.method3886(i_5_ + i_3_, 0, i_2_
							+ i_4_);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "lda.A(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method307(int i) {
		try {
			if (i != 421)
				method305(76);
			aShortArrayArrayArray463 = null;
			anIntArray459 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lda.C(" + i + ')');
		}
	}
}
