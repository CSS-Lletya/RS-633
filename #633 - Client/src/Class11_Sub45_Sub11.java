/* Class11_Sub45_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub45_Sub11 extends Class11_Sub45 {
	static int anInt9153;
	Class261 aClass261_9154;
	Class343 aClass343_9155;
	int anInt9156;
	static int anInt9157;
	static int anInt9158;
	static int anInt9159 = 0;
	int anInt9160;
	int anInt9161;
	static Class146 aClass146_9162;
	int anInt9163;
	static int anInt9164;
	static Class146 aClass146_9165;
	static int anInt9166;
	int anInt9167;

	public static void method3579(int i) {
		do {
			try {
				aClass146_9165 = null;
				aClass146_9162 = null;
				if (i == -4220)
					break;
				anInt9153 = 82;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "jq.C(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method3580(int i) {
		try {
			anInt9158++;
			((Class11_Sub45_Sub11) this).anInt9161 = (((Class261) ((Class11_Sub45_Sub11) this).aClass261_9154).anInt3586);
			((Class11_Sub45_Sub11) this).anInt9163 = (((Class261) ((Class11_Sub45_Sub11) this).aClass261_9154).anInt3582);
			((Class11_Sub45_Sub11) this).anInt9167 = (((Class261) ((Class11_Sub45_Sub11) this).aClass261_9154).anInt3590);
			if (i == -24485) {
				if ((((Class261) ((Class11_Sub45_Sub11) this).aClass261_9154).aClass33_3585) != null)
					((Class261) ((Class11_Sub45_Sub11) this).aClass261_9154).aClass33_3585
							.method294(
									((Class343) (((Class11_Sub45_Sub11) this).aClass343_9155)).anInt4550,
									((Class343) (((Class11_Sub45_Sub11) this).aClass343_9155)).anInt4546,
									((Class343) (((Class11_Sub45_Sub11) this).aClass343_9155)).anInt4557,
									Class261.anIntArray3584);
				((Class11_Sub45_Sub11) this).anInt9160 = Class261.anIntArray3584[0];
				((Class11_Sub45_Sub11) this).anInt9156 = Class261.anIntArray3584[2];
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jq.A(" + i + ')');
		}
	}

	static final int method3581(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_, int i_5_, int i_6_, int i_7_, int[] is, int i_8_,
			int[] is_9_, Class338 class338, int i_10_, boolean bool) {
		try {
			for (int i_11_ = 0; i_11_ < 128; i_11_++) {
				for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > -129; i_12_++) {
					Class275.anIntArrayArray3703[i_11_][i_12_] = 0;
					Class183.anIntArrayArray2364[i_11_][i_12_] = 99999999;
				}
			}
			anInt9166++;
			boolean bool_13_;
			if ((i ^ 0xffffffff) != -2) {
				if ((i ^ 0xffffffff) != -3)
					bool_13_ = Class111.method747(class338, i_5_, i_4_, i,
							i_10_, i_1_, i_2_, i_0_, i_7_, i_3_ + 29375, i_6_,
							i_8_);
				else
					bool_13_ = Class243.method1537(i_0_, i_7_, i_6_, i_1_,
							i_8_, class338, -118, i_10_, i_5_, i_2_, i_4_);
			} else
				bool_13_ = Class11_Sub2_Sub29.method3733(i_0_, i_10_, class338,
						i_4_, i_2_, i_7_, i_8_, i_1_, i_5_, 112, i_6_);
			int i_14_ = -64 + i_0_;
			int i_15_ = i_1_ - 64;
			int i_16_ = Class304.anInt4094;
			int i_17_ = Class189.anInt2435;
			if (!bool_13_) {
				if (!bool)
					return -1;
				int i_18_ = 2147483647;
				int i_19_ = 2147483647;
				int i_20_ = 10;
				for (int i_21_ = i_7_ + -i_20_; (i_21_ ^ 0xffffffff) >= (i_7_
						- -i_20_ ^ 0xffffffff); i_21_++) {
					for (int i_22_ = i_6_ + -i_20_; (i_22_ ^ 0xffffffff) >= (i_20_
							+ i_6_ ^ 0xffffffff); i_22_++) {
						int i_23_ = -i_14_ + i_21_;
						int i_24_ = i_22_ - i_15_;
						if ((i_23_ ^ 0xffffffff) <= -1
								&& (i_24_ ^ 0xffffffff) <= -1
								&& i_23_ < 128
								&& (i_24_ ^ 0xffffffff) > -129
								&& (Class183.anIntArrayArray2364[i_23_][i_24_] ^ 0xffffffff) > -101) {
							int i_25_ = 0;
							if ((i_7_ ^ 0xffffffff) >= (i_21_ ^ 0xffffffff)) {
								if ((i_7_ - (-i_4_ + 1) ^ 0xffffffff) > (i_21_ ^ 0xffffffff))
									i_25_ = i_21_ - i_4_ - i_7_ + 1;
							} else
								i_25_ = i_7_ + -i_21_;
							int i_26_ = 0;
							if (i_22_ < i_6_)
								i_26_ = -i_22_ + i_6_;
							else if ((i_22_ ^ 0xffffffff) < (-1 + i_6_ + i_5_ ^ 0xffffffff))
								i_26_ = i_22_ + -i_5_ + (-i_6_ + 1);
							int i_27_ = i_25_ * i_25_ - -(i_26_ * i_26_);
							if (i_27_ < i_18_
									|| (i_27_ == i_18_ && (Class183.anIntArrayArray2364[i_23_][i_24_]) < i_19_)) {
								i_19_ = (Class183.anIntArrayArray2364[i_23_][i_24_]);
								i_16_ = i_21_;
								i_17_ = i_22_;
								i_18_ = i_27_;
							}
						}
					}
				}
				if ((i_18_ ^ 0xffffffff) == -2147483648)
					return -1;
			}
			if ((i_16_ ^ 0xffffffff) == (i_0_ ^ 0xffffffff) && i_1_ == i_17_)
				return 0;
			int i_28_ = 0;
			Class275.anIntArray3706[i_28_] = i_16_;
			Class299.anIntArray4038[i_28_++] = i_17_;
			int i_30_;
			int i_29_ = i_30_ = (Class275.anIntArrayArray3703[i_16_ + -i_14_][i_17_
					- i_15_]);
			while ((i_16_ ^ 0xffffffff) != (i_0_ ^ 0xffffffff) || i_1_ != i_17_) {
				if ((i_30_ ^ 0xffffffff) != (i_29_ ^ 0xffffffff)) {
					Class275.anIntArray3706[i_28_] = i_16_;
					i_30_ = i_29_;
					Class299.anIntArray4038[i_28_++] = i_17_;
				}
				if ((0x1 & i_29_ ^ 0xffffffff) == -1) {
					if ((i_29_ & 0x4 ^ 0xffffffff) != -1)
						i_17_--;
				} else
					i_17_++;
				if ((i_29_ & 0x2) != 0)
					i_16_++;
				else if ((i_29_ & 0x8 ^ 0xffffffff) != -1)
					i_16_--;
				i_29_ = (Class275.anIntArrayArray3703[-i_14_ + i_16_][-i_15_
						+ i_17_]);
			}
			if (i_3_ != -29375)
				method3582(-32, 48, (byte) 58);
			int i_31_ = 0;
			while (i_28_-- > 0) {
				is_9_[i_31_] = Class275.anIntArray3706[i_28_];
				is[i_31_++] = Class299.anIntArray4038[i_28_];
				if ((i_31_ ^ 0xffffffff) <= (is_9_.length ^ 0xffffffff))
					break;
			}
			return i_31_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jq.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ','
					+ (is != null ? "{...}" : "null") + ',' + i_8_ + ','
					+ (is_9_ != null ? "{...}" : "null") + ','
					+ (class338 != null ? "{...}" : "null") + ',' + i_10_ + ','
					+ bool + ')'));
		}
	}

	static final boolean method3582(int i, int i_32_, byte i_33_) {
		try {
			anInt9164++;
			if ((Class351.method2104(i_33_ + 127, i, i_32_) | (i_32_ & 0x10000) != 0)
					|| Class322.method1967(i, (byte) -44, i_32_))
				return true;
			if (i_33_ != -27)
				return false;
			if ((0x37 & i ^ 0xffffffff) != -1
					|| !Class376_Sub7_Sub4_Sub2.method3911(4285, i_32_, i))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jq.D(" + i + ','
					+ i_32_ + ',' + i_33_ + ')'));
		}
	}

	Class11_Sub45_Sub11(Class261 class261, Class376_Sub10 class376_sub10) {
		try {
			((Class11_Sub45_Sub11) this).aClass261_9154 = class261;
			((Class11_Sub45_Sub11) this).aClass343_9155 = ((Class11_Sub45_Sub11) this).aClass261_9154
					.method1663(124);
			method3580(-24485);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jq.<init>("
					+ (class261 != null ? "{...}" : "null") + ','
					+ (class376_sub10 != null ? "{...}" : "null") + ')'));
		}
	}
}
