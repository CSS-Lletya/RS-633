/* Class132 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class132 {
	private int anInt1838;
	private int anInt1839;
	private int anInt1840 = Class11_Sub13.method2397(16);
	private int[] anIntArray1841;
	private int anInt1842;
	private int anInt1843;
	private int anInt1844 = Class11_Sub13.method2397(24);

	final void method858(float[] fs, int i, boolean bool) {
		for (int i_0_ = 0; i_0_ < i; i_0_++)
			fs[i_0_] = 0.0F;
		if (!bool) {
			int i_1_ = (((Class354) Class11_Sub13.aClass354Array5459[anInt1839]).anInt4647);
			int i_2_ = anInt1838 - anInt1844;
			int i_3_ = i_2_ / anInt1842;
			int[] is = new int[i_3_];
			for (int i_4_ = 0; i_4_ < 8; i_4_++) {
				int i_5_ = 0;
				while (i_5_ < i_3_) {
					if (i_4_ == 0) {
						int i_6_ = Class11_Sub13.aClass354Array5459[anInt1839]
								.method2121();
						for (int i_7_ = i_1_ - 1; i_7_ >= 0; i_7_--) {
							if (i_5_ + i_7_ < i_3_)
								is[i_5_ + i_7_] = i_6_ % anInt1843;
							i_6_ /= anInt1843;
						}
					}
					for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
						int i_9_ = is[i_5_];
						int i_10_ = anIntArray1841[i_9_ * 8 + i_4_];
						if (i_10_ >= 0) {
							int i_11_ = anInt1844 + i_5_ * anInt1842;
							Class354 class354 = Class11_Sub13.aClass354Array5459[i_10_];
							if (anInt1840 == 0) {
								int i_12_ = (anInt1842 / ((Class354) class354).anInt4647);
								for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
									float[] fs_14_ = class354.method2119();
									for (int i_15_ = 0; (i_15_ < ((Class354) class354).anInt4647); i_15_++)
										fs[i_11_ + i_13_ + i_15_ * i_12_] += fs_14_[i_15_];
								}
							} else {
								int i_16_ = 0;
								while (i_16_ < anInt1842) {
									float[] fs_17_ = class354.method2119();
									for (int i_18_ = 0; (i_18_ < ((Class354) class354).anInt4647); i_18_++) {
										fs[i_11_ + i_16_] += fs_17_[i_18_];
										i_16_++;
									}
								}
							}
						}
						if (++i_5_ >= i_3_)
							break;
					}
				}
			}
		}
	}

	Class132() {
		anInt1838 = Class11_Sub13.method2397(24);
		anInt1842 = Class11_Sub13.method2397(24) + 1;
		anInt1843 = Class11_Sub13.method2397(6) + 1;
		anInt1839 = Class11_Sub13.method2397(8);
		int[] is = new int[anInt1843];
		for (int i = 0; i < anInt1843; i++) {
			int i_19_ = 0;
			int i_20_ = Class11_Sub13.method2397(3);
			boolean bool = Class11_Sub13.method2390() != 0;
			if (bool)
				i_19_ = Class11_Sub13.method2397(5);
			is[i] = i_19_ << 3 | i_20_;
		}
		anIntArray1841 = new int[anInt1843 * 8];
		for (int i = 0; i < anInt1843 * 8; i++)
			anIntArray1841[i] = ((is[i >> 3] & 1 << (i & 0x7)) != 0 ? Class11_Sub13
					.method2397(8) : -1);
	}
}
