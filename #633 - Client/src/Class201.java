/* Class201 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class201 {
	static int anInt2710;
	static int anInt2711;
	static int anInt2712;
	static int anInt2713 = 0;

	static final void method1289(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_, int i_5_) {
		try {
			anInt2712++;
			Class97.method659(128, i_5_);
			int i_6_ = 0;
			int i_7_ = -i_1_ + i_5_;
			if (i_7_ < 0)
				i_7_ = 0;
			int i_8_ = i_5_;
			int i_9_ = -i_5_;
			int i_10_ = i_7_;
			int i_11_ = -i_7_;
			int i_12_ = -1;
			int i_13_ = -1;
			int[] is = Class297.anIntArrayArray4026[i_2_];
			int i_14_ = -i_7_ + i_0_;
			if (i != 2)
				method1289(-57, 52, 101, -17, -48, -28, 15);
			int i_15_ = i_0_ - -i_7_;
			Class11_Sub2_Sub32_Sub1.method3883(i_0_ + -i_5_, is, (byte) 75,
					i_3_, i_14_);
			Class11_Sub2_Sub32_Sub1.method3883(i_14_, is, (byte) 126, i_4_,
					i_15_);
			Class11_Sub2_Sub32_Sub1.method3883(i_15_, is, (byte) 104, i_3_,
					i_5_ + i_0_);
			while (i_6_ < i_8_) {
				i_12_ += 2;
				i_13_ += 2;
				i_9_ += i_12_;
				i_11_ += i_13_;
				if ((i_11_ ^ 0xffffffff) <= -1 && (i_10_ ^ 0xffffffff) <= -2) {
					Class91_Sub3_Sub1.anIntArray9340[i_10_] = i_6_;
					i_10_--;
					i_11_ -= i_10_ << 1;
				}
				i_6_++;
				if (i_9_ >= 0) {
					i_8_--;
					i_9_ -= i_8_ << 1;
					if (i_7_ > i_8_) {
						int[] is_16_ = Class297.anIntArrayArray4026[i_8_ + i_2_];
						int[] is_17_ = Class297.anIntArrayArray4026[-i_8_
								+ i_2_];
						int i_18_ = Class91_Sub3_Sub1.anIntArray9340[i_8_];
						int i_19_ = i_6_ + i_0_;
						int i_20_ = -i_6_ + i_0_;
						int i_21_ = i_0_ - -i_18_;
						int i_22_ = i_0_ + -i_18_;
						Class11_Sub2_Sub32_Sub1.method3883(i_20_, is_16_,
								(byte) 92, i_3_, i_22_);
						Class11_Sub2_Sub32_Sub1.method3883(i_22_, is_16_,
								(byte) 82, i_4_, i_21_);
						Class11_Sub2_Sub32_Sub1.method3883(i_21_, is_16_,
								(byte) 99, i_3_, i_19_);
						Class11_Sub2_Sub32_Sub1.method3883(i_20_, is_17_,
								(byte) 57, i_3_, i_22_);
						Class11_Sub2_Sub32_Sub1.method3883(i_22_, is_17_,
								(byte) 77, i_4_, i_21_);
						Class11_Sub2_Sub32_Sub1.method3883(i_21_, is_17_,
								(byte) 123, i_3_, i_19_);
					} else {
						int[] is_23_ = Class297.anIntArrayArray4026[i_2_ + i_8_];
						int[] is_24_ = Class297.anIntArrayArray4026[-i_8_
								+ i_2_];
						int i_25_ = i_6_ + i_0_;
						int i_26_ = -i_6_ + i_0_;
						Class11_Sub2_Sub32_Sub1.method3883(i_26_, is_23_,
								(byte) 65, i_3_, i_25_);
						Class11_Sub2_Sub32_Sub1.method3883(i_26_, is_24_,
								(byte) 73, i_3_, i_25_);
					}
				}
				int[] is_27_ = Class297.anIntArrayArray4026[i_2_ - -i_6_];
				int[] is_28_ = Class297.anIntArrayArray4026[-i_6_ + i_2_];
				int i_29_ = i_0_ - -i_8_;
				int i_30_ = i_0_ - i_8_;
				if ((i_7_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff)) {
					int i_31_ = (i_10_ < i_6_ ? Class91_Sub3_Sub1.anIntArray9340[i_6_]
							: i_10_);
					int i_32_ = i_31_ + i_0_;
					int i_33_ = -i_31_ + i_0_;
					Class11_Sub2_Sub32_Sub1.method3883(i_30_, is_27_,
							(byte) 117, i_3_, i_33_);
					Class11_Sub2_Sub32_Sub1.method3883(i_33_, is_27_,
							(byte) 122, i_4_, i_32_);
					Class11_Sub2_Sub32_Sub1.method3883(i_32_, is_27_,
							(byte) 59, i_3_, i_29_);
					Class11_Sub2_Sub32_Sub1.method3883(i_30_, is_28_,
							(byte) 63, i_3_, i_33_);
					Class11_Sub2_Sub32_Sub1.method3883(i_33_, is_28_,
							(byte) 49, i_4_, i_32_);
					Class11_Sub2_Sub32_Sub1.method3883(i_32_, is_28_,
							(byte) 76, i_3_, i_29_);
				} else {
					Class11_Sub2_Sub32_Sub1.method3883(i_30_, is_27_,
							(byte) 98, i_3_, i_29_);
					Class11_Sub2_Sub32_Sub1.method3883(i_30_, is_28_,
							(byte) 103, i_3_, i_29_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jp.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ')'));
		}
	}

	static final void method1290(int i) {
		try {
			Class376_Sub7_Sub1_Sub1.method3921(i ^ ~0x6ffa);
			if (i != -28577)
				anInt2713 = 111;
			anInt2710++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jp.A(" + i + ')');
		}
	}
}
