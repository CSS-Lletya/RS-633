/* Class371 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class371 {
	static int anInt4863;
	int[] anIntArray4864 = new int[2];
	private int[] anIntArray4865 = new int[2];
	private int[][][] anIntArrayArrayArray4866;
	private static float[][] aFloatArrayArray4867 = new float[2][8];
	static int[][] anIntArrayArray4868 = new int[2][8];
	private int[][][] anIntArrayArrayArray4869 = new int[2][2][4];
	private static float aFloat4870;

	final int method2187(int i, float f) {
		if (i == 0) {
			float f_0_ = ((float) anIntArray4865[0] + (float) (anIntArray4865[1] - anIntArray4865[0])
					* f);
			f_0_ *= 0.0030517578F;
			aFloat4870 = (float) Math.pow(0.1, (double) (f_0_ / 20.0F));
			anInt4863 = (int) (aFloat4870 * 65536.0F);
		}
		if (((Class371) this).anIntArray4864[i] == 0)
			return 0;
		float f_1_ = method2188(i, 0, f);
		aFloatArrayArray4867[i][0] = -2.0F * f_1_
				* (float) Math.cos((double) method2189(i, 0, f));
		aFloatArrayArray4867[i][1] = f_1_ * f_1_;
		for (int i_2_ = 1; i_2_ < ((Class371) this).anIntArray4864[i]; i_2_++) {
			f_1_ = method2188(i, i_2_, f);
			float f_3_ = (-2.0F * f_1_ * (float) Math.cos((double) method2189(
					i, i_2_, f)));
			float f_4_ = f_1_ * f_1_;
			aFloatArrayArray4867[i][i_2_ * 2 + 1] = aFloatArrayArray4867[i][i_2_ * 2 - 1]
					* f_4_;
			aFloatArrayArray4867[i][i_2_ * 2] = (aFloatArrayArray4867[i][i_2_ * 2 - 1]
					* f_3_ + aFloatArrayArray4867[i][i_2_ * 2 - 2] * f_4_);
			for (int i_5_ = i_2_ * 2 - 1; i_5_ >= 2; i_5_--)
				aFloatArrayArray4867[i][i_5_] += (aFloatArrayArray4867[i][i_5_ - 1]
						* f_3_ + aFloatArrayArray4867[i][i_5_ - 2] * f_4_);
			aFloatArrayArray4867[i][1] += aFloatArrayArray4867[i][0] * f_3_
					+ f_4_;
			aFloatArrayArray4867[i][0] += f_3_;
		}
		if (i == 0) {
			for (int i_6_ = 0; i_6_ < ((Class371) this).anIntArray4864[0] * 2; i_6_++)
				aFloatArrayArray4867[0][i_6_] *= aFloat4870;
		}
		for (int i_7_ = 0; i_7_ < ((Class371) this).anIntArray4864[i] * 2; i_7_++)
			anIntArrayArray4868[i][i_7_] = (int) (aFloatArrayArray4867[i][i_7_] * 65536.0F);
		return ((Class371) this).anIntArray4864[i] * 2;
	}

	private final float method2188(int i, int i_8_, float f) {
		float f_9_ = ((float) anIntArrayArrayArray4869[i][0][i_8_] + f
				* (float) (anIntArrayArrayArray4869[i][1][i_8_] - anIntArrayArrayArray4869[i][0][i_8_]));
		f_9_ *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0, (double) (-f_9_ / 20.0F));
	}

	private final float method2189(int i, int i_10_, float f) {
		float f_11_ = ((float) anIntArrayArrayArray4866[i][0][i_10_] + f
				* (float) (anIntArrayArrayArray4866[i][1][i_10_] - anIntArrayArrayArray4866[i][0][i_10_]));
		f_11_ *= 1.2207031E-4F;
		return method2191(f_11_);
	}

	final void method2190(Stream stream, Class43 class43) {
		int i = stream.readUnsignedByte((byte) 35);
		((Class371) this).anIntArray4864[0] = i >> 4;
		((Class371) this).anIntArray4864[1] = i & 0xf;
		if (i != 0) {
			anIntArray4865[0] = stream.readUnsignedShort((byte) -65);
			anIntArray4865[1] = stream.readUnsignedShort((byte) -65);
			int i_12_ = stream.readUnsignedByte((byte) 35);
			for (int i_13_ = 0; i_13_ < 2; i_13_++) {
				for (int i_14_ = 0; i_14_ < ((Class371) this).anIntArray4864[i_13_]; i_14_++) {
					anIntArrayArrayArray4866[i_13_][0][i_14_] = stream
							.readUnsignedShort((byte) -65);
					anIntArrayArrayArray4869[i_13_][0][i_14_] = stream
							.readUnsignedShort((byte) -65);
				}
			}
			for (int i_15_ = 0; i_15_ < 2; i_15_++) {
				for (int i_16_ = 0; i_16_ < ((Class371) this).anIntArray4864[i_15_]; i_16_++) {
					if ((i_12_ & 1 << i_15_ * 4 << i_16_) != 0) {
						anIntArrayArrayArray4866[i_15_][1][i_16_] = stream
								.readUnsignedShort((byte) -65);
						anIntArrayArrayArray4869[i_15_][1][i_16_] = stream
								.readUnsignedShort((byte) -65);
					} else {
						anIntArrayArrayArray4866[i_15_][1][i_16_] = anIntArrayArrayArray4866[i_15_][0][i_16_];
						anIntArrayArrayArray4869[i_15_][1][i_16_] = anIntArrayArrayArray4869[i_15_][0][i_16_];
					}
				}
			}
			if (i_12_ != 0 || anIntArray4865[1] != anIntArray4865[0])
				class43.method393(stream);
		} else
			anIntArray4865[0] = anIntArray4865[1] = 0;
	}

	private static final float method2191(float f) {
		float f_17_ = 32.703197F * (float) Math.pow(2.0, (double) f);
		return f_17_ * 3.1415927F / 11025.0F;
	}

	public Class371() {
		anIntArrayArrayArray4866 = new int[2][2][4];
	}

	public static void method2192() {
		aFloatArrayArray4867 = null;
		anIntArrayArray4868 = null;
	}
}
