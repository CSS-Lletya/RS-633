/* Class376_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class376_Sub6 extends Class376 {
	static Class286_Sub1 aClass286_Sub1_6949;
	static boolean aBool6950 = false;
	static int anInt6951;
	static Class98 aClass98_6952 = new Class98(2);
	int anInt6953;

	public static void method2819(byte i) {
		try {
			int i_0_ = -57 % ((52 - i) / 45);
			aClass286_Sub1_6949 = null;
			aClass98_6952 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ns.B(" + i + ')');
		}
	}

	static final void method2820(int i, int i_1_, int i_2_, int i_3_, int i_4_,
			int i_5_, float[] fs, int i_6_, float f, float f_7_, float[] fs_8_,
			int i_9_, float f_10_, int i_11_) {
		try {
			anInt6951++;
			i_2_ -= i_11_;
			i_5_ -= i_9_;
			i_6_ -= i_3_;
			if (i_1_ > 45) {
				float f_12_ = (fs_8_[2] * (float) i_6_ + (fs_8_[0]
						* (float) i_5_ + (float) i_2_ * fs_8_[1]));
				float f_13_ = ((float) i_6_ * fs_8_[5] + (fs_8_[3]
						* (float) i_5_ + fs_8_[4] * (float) i_2_));
				float f_14_ = ((float) i_5_ * fs_8_[6] + fs_8_[7]
						* (float) i_2_ + (float) i_6_ * fs_8_[8]);
				float f_15_;
				float f_16_;
				if (i != 0) {
					if ((i ^ 0xffffffff) == -2) {
						f_15_ = 0.5F + (f_14_ + f);
						f_16_ = f_12_ + f_10_ + 0.5F;
					} else if ((i ^ 0xffffffff) != -3) {
						if (i != 3) {
							if (i != 4) {
								f_15_ = -f_13_ + f_7_ + 0.5F;
								f_16_ = -f_14_ + f + 0.5F;
							} else {
								f_15_ = 0.5F + (-f_13_ + f_7_);
								f_16_ = f_14_ + f + 0.5F;
							}
						} else {
							f_16_ = 0.5F + (f_12_ + f_10_);
							f_15_ = -f_13_ + f_7_ + 0.5F;
						}
					} else {
						f_16_ = -f_12_ + f_10_ + 0.5F;
						f_15_ = -f_13_ + f_7_ + 0.5F;
					}
				} else {
					f_15_ = -f_14_ + f + 0.5F;
					f_16_ = f_12_ + f_10_ + 0.5F;
				}
				if (i_4_ != 1) {
					if ((i_4_ ^ 0xffffffff) == -3) {
						f_16_ = -f_16_;
						f_15_ = -f_15_;
					} else if ((i_4_ ^ 0xffffffff) == -4) {
						float f_17_ = f_16_;
						f_16_ = f_15_;
						f_15_ = -f_17_;
					}
				} else {
					float f_18_ = f_16_;
					f_16_ = -f_15_;
					f_15_ = f_18_;
				}
				fs[1] = f_15_;
				fs[0] = f_16_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ns.A(" + i + ','
					+ i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_
					+ ',' + (fs != null ? "{...}" : "null") + ',' + i_6_ + ','
					+ f + ',' + f_7_ + ',' + (fs_8_ != null ? "{...}" : "null")
					+ ',' + i_9_ + ',' + f_10_ + ',' + i_11_ + ')'));
		}
	}

	Class376_Sub6(int i) {
		try {
			((Class376_Sub6) this).anInt6953 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ns.<init>(" + i + ')');
		}
	}
}
