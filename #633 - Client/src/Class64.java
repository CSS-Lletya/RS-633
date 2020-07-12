/* Class64 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64 {
	static int anInt925;
	static int anInt926;
	static Class83 aClass83_927 = new Class83(2, 8);
	static int anInt928;

	public static void method484(int i) {
		do {
			try {
				aClass83_927 = null;
				if (i == 0)
					break;
				method485(-84, 60, 104, -123, 48, -43, 111, true, 77);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "dca.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static final boolean method485(int i, int i_0_, int i_1_, int i_2_,
			int i_3_, int i_4_, int i_5_, boolean bool, int i_6_) {
		try {
			anInt926++;
			int i_7_ = (((Actor) Class11_Sub2_Sub8.myPlayer).anIntArray10370[0]);
			int i_8_ = (((Actor) Class11_Sub2_Sub8.myPlayer).anIntArray10376[0]);
			if (i_7_ < 0
					|| (Class300.anInt4051 ^ 0xffffffff) >= (i_7_ ^ 0xffffffff)
					|| (i_8_ ^ 0xffffffff) > -1
					|| (i_8_ ^ 0xffffffff) <= (Class108_Sub12.anInt6228 ^ 0xffffffff))
				return false;
			if (i_5_ < 0
					|| Class300.anInt4051 <= i_5_
					|| i_6_ < 0
					|| (i_6_ ^ 0xffffffff) <= (Class108_Sub12.anInt6228 ^ 0xffffffff))
				return false;
			int i_9_ = (Class11_Sub45_Sub11
					.method3581(
							Class11_Sub2_Sub8.myPlayer.method3968((byte) 127),
							i_7_,
							i_8_,
							i_0_,
							-29375,
							i_2_,
							i_3_,
							i_6_,
							i_5_,
							Class212.anIntArray2881,
							i_4_,
							Class295.anIntArray3981,
							(Class235.aClass338Array3217[(((Class376_Sub7) Class11_Sub2_Sub8.myPlayer).aByte7047)]),
							i, bool));
			if (i_9_ < 1)
				return false;
			Class321.anInt4284 = Class295.anIntArray3981[-1 + i_9_];
			Class220_Sub1.anInt7153 = Class212.anIntArray2881[i_9_ - i_1_];
			Class11_Sub2_Sub3.aBool8473 = false;
			Class11_Sub45_Sub1.method3344(i_1_ + 122);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("dca.C(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ',' + bool + ',' + i_6_ + ')'));
		}
	}

	static final char method486(byte i, int i_10_) {
		try {
			if (i_10_ != 0)
				method485(-67, 63, -34, 86, -107, -4, -61, true, 88);
			anInt928++;
			int i_11_ = i & 0xff;
			if ((i_11_ ^ 0xffffffff) == -1)
				throw new IllegalArgumentException("Non cp1252 character 0x"
						+ Integer.toString(i_11_, 16) + " provided");
			if (i_11_ >= 128 && i_11_ < 160) {
				int i_12_ = Class108.aCharArray1465[i_11_ - 128];
				if ((i_12_ ^ 0xffffffff) == -1)
					i_12_ = 63;
				i_11_ = i_12_;
			}
			return (char) i_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dca.A(" + i + ','
					+ i_10_ + ')');
		}
	}
}
