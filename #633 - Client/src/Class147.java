/* Class147 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class147 {
	static int anInt1990;
	static int anInt1991;
	static boolean aBool1992 = false;
	static int anInt1993;
	static int anInt1994 = 0;
	static Class286_Sub1 aClass286_Sub1_1995;

	static final short method942(int i, int i_0_) {
		try {
			anInt1993++;
			int i_1_ = 0x3f & i_0_ >> 10;
			int i_2_ = 0x70 & i_0_ >> 3;
			int i_3_ = 0x7f & i_0_;
			i_2_ = ((i_3_ ^ 0xffffffff) >= -65 ? i_3_ * i_2_ >> 7
					: (-i_3_ + 127) * i_2_ >> 7);
			int i_4_ = i_2_ + i_3_;
			int i_5_;
			if (i != i_4_)
				i_5_ = (i_2_ << 8) / i_4_;
			else
				i_5_ = i_2_ << 1;
			int i_6_ = i_4_;
			return (short) (i_6_ | (i_5_ >> 4 << 7 | i_1_ << 10));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fq.B(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final void method943(int i, String string, int i_7_) {
		try {
			if (i > -118)
				method943(58, null, 89);
			anInt1990++;
			Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
					-652872096, 2, i_7_);
			class11_sub45_sub15.method3661(0);
			((Class11_Sub45_Sub15) class11_sub45_sub15).aString9366 = string;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fq.A(" + i + ','
					+ (string != null ? "{...}" : "null") + ',' + i_7_ + ')'));
		}
	}

	public static void method944(int i) {
		do {
			try {
				aClass286_Sub1_1995 = null;
				if (i == -1608275071)
					break;
				method942(69, 54);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "fq.C(" + i + ')');
			}
			break;
		} while (false);
	}
}
