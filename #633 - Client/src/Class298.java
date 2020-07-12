/* Class298 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class298 implements Interface23 {
	static int anInt4027;
	static Class107 aClass107_4028;
	int anInt4029;
	static int anInt4030;

	public final String toString() {
		try {
			anInt4027++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rb.toString(" + ')');
		}
	}

	static final void method1849(byte i) {
		try {
			anInt4030++;
			if (Class71.anInt989 != -1 && Class344.anInt4564 != -1) {
				int i_0_ = (Class251_Sub2.anInt5432 - -(((Class335_Sub3_Sub1.anInt9415 - Class251_Sub2.anInt5432) * Class11_Sub26.anInt6298) >> 16));
				Class11_Sub26.anInt6298 += i_0_;
				if ((Class11_Sub26.anInt6298 ^ 0xffffffff) > -65536) {
					Class11_Sub2_Sub19.aBool9097 = false;
					Class11_Sub45_Sub1_Sub2.aBool9877 = false;
				} else {
					Class11_Sub26.anInt6298 = 65535;
					if (!Class11_Sub45_Sub1_Sub2.aBool9877)
						Class11_Sub2_Sub19.aBool9097 = true;
					else
						Class11_Sub2_Sub19.aBool9097 = false;
					Class11_Sub45_Sub1_Sub2.aBool9877 = true;
				}
				float f = (float) Class11_Sub26.anInt6298 / 65535.0F;
				float[] fs = new float[3];
				int i_1_ = Class149.anInt1996 * 2;
				for (int i_2_ = 0; i_2_ < 3; i_2_++) {
					int i_3_ = ((Class11_Sub39.anIntArrayArrayArray7210[Class71.anInt989][i_1_][i_2_]) * 3);
					int i_4_ = 3 * (Class11_Sub39.anIntArrayArrayArray7210[Class71.anInt989][1 + i_1_][i_2_]);
					int i_5_ = ((-(Class11_Sub39.anIntArrayArrayArray7210[Class71.anInt989][3 + i_1_][i_2_]) - (-(Class11_Sub39.anIntArrayArrayArray7210[Class71.anInt989][i_1_ + 2][i_2_]) - (Class11_Sub39.anIntArrayArrayArray7210[Class71.anInt989][2 + i_1_][i_2_]))) * 3);
					int i_6_ = (Class11_Sub39.anIntArrayArrayArray7210[Class71.anInt989][i_1_][i_2_]);
					int i_7_ = -i_3_ + i_4_;
					int i_8_ = -(i_4_ * 2) + i_3_ - -i_5_;
					int i_9_ = (-i_5_ + i_4_ + ((Class11_Sub39.anIntArrayArrayArray7210[Class71.anInt989][2 + i_1_][i_2_]) + -i_6_));
					fs[i_2_] = (float) i_6_
							+ f
							* ((float) i_7_ + ((float) i_8_ + (float) i_9_ * f)
									* f);
				}
				Class11_Sub45_Sub11.anInt9157 = -(Class194.anInt2641 * 512)
						+ (int) fs[0];
				Class303.anInt4088 = -(512 * Class118.anInt1605) + (int) fs[2];
				if (i <= 108)
					aClass107_4028 = null;
				Class218.anInt3007 = (int) fs[1] * -1;
				float[] fs_10_ = new float[3];
				int i_11_ = 2 * Class108_Sub16.anInt6550;
				for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > -4; i_12_++) {
					int i_13_ = 3 * (Class11_Sub39.anIntArrayArrayArray7210[Class344.anInt4564][i_11_][i_12_]);
					int i_14_ = 3 * (Class11_Sub39.anIntArrayArrayArray7210[Class344.anInt4564][i_11_ + 1][i_12_]);
					int i_15_ = 3 * (-(Class11_Sub39.anIntArrayArrayArray7210[Class344.anInt4564][i_11_ + 3][i_12_]) + ((Class11_Sub39.anIntArrayArrayArray7210[Class344.anInt4564][2 + i_11_][i_12_]) + (Class11_Sub39.anIntArrayArrayArray7210[Class344.anInt4564][i_11_ + 2][i_12_])));
					int i_16_ = (Class11_Sub39.anIntArrayArrayArray7210[Class344.anInt4564][i_11_][i_12_]);
					int i_17_ = -i_13_ + i_14_;
					int i_18_ = i_13_ + (-(i_14_ * 2) + i_15_);
					int i_19_ = (-i_15_ + (i_14_ + -i_16_ + (Class11_Sub39.anIntArrayArrayArray7210[Class344.anInt4564][2 + i_11_][i_12_])));
					fs_10_[i_12_] = ((float) i_16_ + ((float) i_17_ + ((float) i_18_ + (float) i_19_
							* f)
							* f)
							* f);
				}
				float f_20_ = fs_10_[0] - fs[0];
				float f_21_ = -1.0F * (fs_10_[1] - fs[1]);
				float f_22_ = fs_10_[2] - fs[2];
				double d = Math.sqrt((double) (f_20_ * f_20_ + f_22_ * f_22_));
				Class266.anInt3616 = 0x3fff & (int) (Math.atan2((double) f_21_,
						d) * 2607.5945876176133);
				Class171.anInt2193 = ((int) (2607.5945876176133 * -Math.atan2(
						(double) f_20_, (double) f_22_)) & 0x3fff);
				Class211.anInt2857 = (((Class11_Sub26.anInt6298 * (-(Class11_Sub39.anIntArrayArrayArray7210[Class71.anInt989][i_1_][3]) + (Class11_Sub39.anIntArrayArrayArray7210[Class71.anInt989][i_1_ + 2][3]))) >> 16) + (Class11_Sub39.anIntArrayArrayArray7210[Class71.anInt989][i_1_][3]));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rb.A(" + i + ')');
		}
	}

	public static void method1850(int i) {
		try {
			if (i == -1)
				aClass107_4028 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rb.B(" + i + ')');
		}
	}

	Class298(String string, int i) {
		try {
			((Class298) this).anInt4029 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rb.<init>("
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
