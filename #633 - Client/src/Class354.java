/* Class354 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class354 {
	int anInt4647;
	private float[][] aFloatArrayArray4648;
	private int anInt4649;
	private int[] anIntArray4650;
	private int[] anIntArray4651;
	private int[] anIntArray4652;

	final float[] method2119() {
		return aFloatArrayArray4648[method2121()];
	}

	private final void method2120() {
		int[] is = new int[anInt4649];
		int[] is_0_ = new int[33];
		for (int i = 0; i < anInt4649; i++) {
			int i_1_ = anIntArray4651[i];
			if (i_1_ != 0) {
				int i_2_ = 1 << 32 - i_1_;
				int i_3_ = is_0_[i_1_];
				is[i] = i_3_;
				int i_4_;
				if ((i_3_ & i_2_) != 0)
					i_4_ = is_0_[i_1_ - 1];
				else {
					i_4_ = i_3_ | i_2_;
					for (int i_5_ = i_1_ - 1; i_5_ >= 1; i_5_--) {
						int i_6_ = is_0_[i_5_];
						if (i_6_ != i_3_)
							break;
						int i_7_ = 1 << 32 - i_5_;
						if ((i_6_ & i_7_) != 0) {
							is_0_[i_5_] = is_0_[i_5_ - 1];
							break;
						}
						is_0_[i_5_] = i_6_ | i_7_;
					}
				}
				is_0_[i_1_] = i_4_;
				for (int i_8_ = i_1_ + 1; i_8_ <= 32; i_8_++) {
					int i_9_ = is_0_[i_8_];
					if (i_9_ == i_3_)
						is_0_[i_8_] = i_4_;
				}
			}
		}
		anIntArray4652 = new int[8];
		int i = 0;
		for (int i_10_ = 0; i_10_ < anInt4649; i_10_++) {
			int i_11_ = anIntArray4651[i_10_];
			if (i_11_ != 0) {
				int i_12_ = is[i_10_];
				int i_13_ = 0;
				for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
					int i_15_ = -2147483648 >>> i_14_;
					if ((i_12_ & i_15_) != 0) {
						if (anIntArray4652[i_13_] == 0)
							anIntArray4652[i_13_] = i;
						i_13_ = anIntArray4652[i_13_];
					} else
						i_13_++;
					if (i_13_ >= anIntArray4652.length) {
						int[] is_16_ = new int[anIntArray4652.length * 2];
						for (int i_17_ = 0; i_17_ < anIntArray4652.length; i_17_++)
							is_16_[i_17_] = anIntArray4652[i_17_];
						anIntArray4652 = is_16_;
					}
					i_15_ >>>= 1;
				}
				anIntArray4652[i_13_] = i_10_ ^ 0xffffffff;
				if (i_13_ >= i)
					i = i_13_ + 1;
			}
		}
	}

	final int method2121() {
		int i;
		for (i = 0; anIntArray4652[i] >= 0; i = Class11_Sub13.method2390() != 0 ? anIntArray4652[i]
				: i + 1) {
			/* empty */
		}
		return anIntArray4652[i] ^ 0xffffffff;
	}

	private static final int method2122(int i, int i_18_) {
		int i_19_;
		for (i_19_ = (int) Math.pow((double) i, 1.0 / (double) i_18_) + 1; Class11_Sub45_Sub7
				.method3448((byte) -115, i_18_, i_19_) > i; i_19_--) {
			/* empty */
		}
		return i_19_;
	}

	Class354() {
		Class11_Sub13.method2397(24);
		((Class354) this).anInt4647 = Class11_Sub13.method2397(16);
		anInt4649 = Class11_Sub13.method2397(24);
		anIntArray4651 = new int[anInt4649];
		boolean bool = Class11_Sub13.method2390() != 0;
		if (bool) {
			int i = 0;
			int i_20_ = Class11_Sub13.method2397(5) + 1;
			while (i < anInt4649) {
				int i_21_ = (Class11_Sub13.method2397(Class163_Sub2_Sub1
						.method3406((byte) 102, anInt4649 - i)));
				for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
					anIntArray4651[i++] = i_20_;
				i_20_++;
			}
		} else {
			boolean bool_23_ = Class11_Sub13.method2390() != 0;
			for (int i = 0; i < anInt4649; i++) {
				if (bool_23_ && Class11_Sub13.method2390() == 0)
					anIntArray4651[i] = 0;
				else
					anIntArray4651[i] = Class11_Sub13.method2397(5) + 1;
			}
		}
		method2120();
		int i = Class11_Sub13.method2397(4);
		if (i > 0) {
			float f = Class11_Sub13.method2389(Class11_Sub13.method2397(32));
			float f_24_ = Class11_Sub13
					.method2389(Class11_Sub13.method2397(32));
			int i_25_ = Class11_Sub13.method2397(4) + 1;
			boolean bool_26_ = Class11_Sub13.method2390() != 0;
			int i_27_;
			if (i == 1)
				i_27_ = method2122(anInt4649, ((Class354) this).anInt4647);
			else
				i_27_ = anInt4649 * ((Class354) this).anInt4647;
			anIntArray4650 = new int[i_27_];
			for (int i_28_ = 0; i_28_ < i_27_; i_28_++)
				anIntArray4650[i_28_] = Class11_Sub13.method2397(i_25_);
			aFloatArrayArray4648 = new float[anInt4649][((Class354) this).anInt4647];
			if (i == 1) {
				for (int i_29_ = 0; i_29_ < anInt4649; i_29_++) {
					float f_30_ = 0.0F;
					int i_31_ = 1;
					for (int i_32_ = 0; i_32_ < ((Class354) this).anInt4647; i_32_++) {
						int i_33_ = i_29_ / i_31_ % i_27_;
						float f_34_ = ((float) anIntArray4650[i_33_] * f_24_
								+ f + f_30_);
						aFloatArrayArray4648[i_29_][i_32_] = f_34_;
						if (bool_26_)
							f_30_ = f_34_;
						i_31_ *= i_27_;
					}
				}
			} else {
				for (int i_35_ = 0; i_35_ < anInt4649; i_35_++) {
					float f_36_ = 0.0F;
					int i_37_ = i_35_ * ((Class354) this).anInt4647;
					for (int i_38_ = 0; i_38_ < ((Class354) this).anInt4647; i_38_++) {
						float f_39_ = ((float) anIntArray4650[i_37_] * f_24_
								+ f + f_36_);
						aFloatArrayArray4648[i_35_][i_38_] = f_39_;
						if (bool_26_)
							f_36_ = f_39_;
						i_37_++;
					}
				}
			}
		}
	}
}
