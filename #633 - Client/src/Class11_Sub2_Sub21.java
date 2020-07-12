/* Class11_Sub2_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub21 extends Class11_Sub2 {
	static int anInt9193;
	static int anInt9194;
	static String[] aStringArray9195 = new String[100];
	static int anInt9196;
	static boolean aBool9197;
	static int anInt9198 = 0;
	static int anInt9199;
	static int anInt9200;
	static int anInt9201;

	final int[] method2254(int i, boolean bool) {
		try {
			anInt9199++;
			if (bool != true)
				return null;
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
				for (int i_0_ = 0; Class33_Sub2.anInt6696 > i_0_; i_0_++) {
					method3596(i, i_0_, -2048);
					int[] is_1_ = this.method2260(4463, 0,
							Class163_Sub2.anInt7442);
					is[i_0_] = is_1_[Class150.anInt2003];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ke.A(" + i + ','
					+ bool + ')');
		}
	}

	final void method2263(int i, Stream stream, int i_2_) {
		try {
			if (i_2_ == 0)
				((Class11_Sub2) this).aBool5044 = stream
						.readUnsignedByte((byte) 35) == 1;
			if (i != 3731)
				method2255(-8, -73);
			anInt9194++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ke.B(" + i + ','
					+ (stream != null ? "{...}" : "null") + ',' + i_2_ + ')'));
		}
	}

	public static void method3595(byte i) {
		try {
			if (i <= -40)
				aStringArray9195 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ke.E(" + i + ')');
		}
	}

	private final void method3596(int i, int i_3_, int i_4_) {
		try {
			anInt9200++;
			int i_5_ = Class208.anIntArray2808[i_3_];
			int i_6_ = Class171.anIntArray2199[i];
			float f = (float) Math.atan2((double) (-2048 + i_5_),
					(double) (i_6_ + i_4_));
			if (!((double) f >= -3.141592653589793)
					|| !((double) f <= -2.356194490192345)) {
				if (!((double) f <= -1.5707963267948966)
						|| !((double) f >= -2.356194490192345)) {
					if (!((double) f <= -0.7853981633974483)
							|| !((double) f >= -1.5707963267948966)) {
						if (!(f <= 0.0F)
								|| !((double) f >= -0.7853981633974483)) {
							if (!(f >= 0.0F)
									|| !((double) f <= 0.7853981633974483)) {
								if ((double) f >= 0.7853981633974483
										&& (double) f <= 1.5707963267948966) {
									Class163_Sub2.anInt7442 = Class29.anInt398
											- i_3_;
									Class150.anInt2003 = -i
											+ Class33_Sub2.anInt6696;
								} else if ((double) f >= 1.5707963267948966
										&& ((double) f <= 2.356194490192345)) {
									Class163_Sub2.anInt7442 = -i_3_
											+ Class29.anInt398;
									Class150.anInt2003 = i;
								} else if ((double) f >= 2.356194490192345
										&& ((double) f <= 3.141592653589793)) {
									Class150.anInt2003 = -i_3_
											+ Class33_Sub2.anInt6696;
									Class163_Sub2.anInt7442 = i;
								}
							} else {
								Class163_Sub2.anInt7442 = -i + Class29.anInt398;
								Class150.anInt2003 = -i_3_
										+ Class33_Sub2.anInt6696;
							}
						} else {
							Class150.anInt2003 = i_3_;
							Class163_Sub2.anInt7442 = Class29.anInt398 + -i;
						}
					} else {
						Class150.anInt2003 = -i + Class33_Sub2.anInt6696;
						Class163_Sub2.anInt7442 = i_3_;
					}
				} else {
					Class150.anInt2003 = i;
					Class163_Sub2.anInt7442 = i_3_;
				}
			} else {
				Class163_Sub2.anInt7442 = i;
				Class150.anInt2003 = i_3_;
			}
			Class150.anInt2003 &= Class297.anInt4024;
			Class163_Sub2.anInt7442 &= Class11_Sub45_Sub16_Sub2.anInt10167;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ke.C(" + i + ','
					+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	public Class11_Sub2_Sub21() {
		super(1, false);
	}

	final int[][] method2255(int i, int i_7_) {
		try {
			anInt9196++;
			if (i_7_ != 1)
				aStringArray9195 = null;
			int[][] is = ((Class11_Sub2) this).aClass291_5038.method1799(0, i);
			if (((Class291) ((Class11_Sub2) this).aClass291_5038).aBool3943) {
				int[] is_8_ = is[0];
				int[] is_9_ = is[1];
				int[] is_10_ = is[2];
				for (int i_11_ = 0; i_11_ < Class33_Sub2.anInt6696; i_11_++) {
					method3596(i, i_11_, i_7_ - 2049);
					int[][] is_12_ = this.method2262(Class163_Sub2.anInt7442,
							127, 0);
					is_8_[i_11_] = is_12_[0][Class150.anInt2003];
					is_9_[i_11_] = is_12_[1][Class150.anInt2003];
					is_10_[i_11_] = is_12_[2][Class150.anInt2003];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ke.I(" + i + ','
					+ i_7_ + ')');
		}
	}

	static {
		aBool9197 = false;
	}
}
