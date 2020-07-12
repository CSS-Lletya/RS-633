/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class54 {
	static short[][] aShortArrayArray818;
	private static short[] aShortArray819 = { 6798, 8741, 25238, 4626, 4550 };
	int[] anIntArray820;
	private static short[] aShortArray821 = { -10304, 9104, 25485, 4620, 4540 };
	float[][] aFloatArrayArray822;
	static int anInt823;
	private static short[] aShortArray824 = { -1, -1, -1, -1, -1 };
	static int anInt825;
	int[] anIntArray826;
	static Class146 aClass146_827;
	int[] anIntArray828;

	static final int method443(int i) {
		try {
			anInt823++;
			if (i != 5467)
				method443(-127);
			if (OutputStream_Sub1.anInt5845 == 1)
				return Class292.anInt3955;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hga.C(" + i + ')');
		}
	}

	public static void method444(int i) {
		do {
			try {
				aShortArrayArray818 = null;
				aShortArray824 = null;
				aShortArray819 = null;
				aShortArray821 = null;
				aClass146_827 = null;
				if (i < -95)
					break;
				aShortArray821 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "hga.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method445(Class163 class163, int i, int i_0_, int i_1_,
			int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			anInt825++;
			Class243.aClass163_3308 = class163;
			Class321.aClass33_4280 = Class243.aClass163_3308.method1041();
			Class11_Sub2_Sub34.aClass33_9692 = Class243.aClass163_3308
					.method1041();
			Class337.aClass33_4457 = Class243.aClass163_3308.method1041();
			Class128.anInt1727 = 0;
			Class275.anInt3696 = 0;
			Class11_Sub24.anInt6238 = i_2_;
			Class11_Sub2_Sub23.anInt9264 = i_4_;
			Class58_Sub2_Sub1.anInt9251 = i_3_;
			Class11_Sub27.anInt6556 = i;
			Class11_Sub2_Sub32_Sub1.anInterface10_9891 = null;
			int i_6_ = 19 / ((57 - i_1_) / 38);
			OutputStream_Sub1.anInt5845 = 1;
			Class138.method880(i_5_, 0, i_0_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hga.B("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ')'));
		}
	}

	Class54(int[] is, int[] is_7_, int[] is_8_, float[][] fs) {
		try {
			((Class54) this).anIntArray826 = is_7_;
			((Class54) this).aFloatArrayArray822 = fs;
			((Class54) this).anIntArray828 = is_8_;
			((Class54) this).anIntArray820 = is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hga.<init>("
					+ (is != null ? "{...}" : "null") + ','
					+ (is_7_ != null ? "{...}" : "null") + ','
					+ (is_8_ != null ? "{...}" : "null") + ','
					+ (fs != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aShortArrayArray818 = new short[][] { aShortArray819, aShortArray821,
				aShortArray824 };
	}
}
