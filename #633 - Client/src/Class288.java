/* Class288 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class288 {
	static int anInt3893;
	static String[] aStringArray3894 = { "Sun", "Mon", "Tue", "Wed", "Thu",
			"Fri", "Sat" };

	static final int method1779(boolean bool, byte i, int i_0_) {
		try {
			anInt3893++;
			if (bool)
				return 0;
			Class11_Sub37 class11_sub37 = Class26.method218(bool, i - 9953,
					i_0_);
			if (class11_sub37 == null)
				return (((Class11_Sub45_Sub8) Class1.aClass197_4.method1278(
						i_0_, true)).anInt8816);
			int i_1_ = 0;
			if (i != 99)
				aStringArray3894 = null;
			for (int i_2_ = 0; i_2_ < ((Class11_Sub37) class11_sub37).anIntArray7082.length; i_2_++) {
				if ((((Class11_Sub37) class11_sub37).anIntArray7082[i_2_] ^ 0xffffffff) == 0)
					i_1_++;
			}
			i_1_ += (((Class11_Sub45_Sub8) Class1.aClass197_4.method1278(i_0_,
					true)).anInt8816 + -((Class11_Sub37) class11_sub37).anIntArray7082.length);
			return i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qf.B(" + bool + ','
					+ i + ',' + i_0_ + ')'));
		}
	}

	public static void method1780(byte i) {
		try {
			if (i == 102)
				aStringArray3894 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qf.A(" + i + ')');
		}
	}
}
