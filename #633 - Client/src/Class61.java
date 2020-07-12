/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class61 {
	static int anInt899;
	static int anInt900;
	static Class11_Sub45_Sub18[] aClass11_Sub45_Sub18Array901 = new Class11_Sub45_Sub18[14];
	static int anInt902 = 0;
	static int[] anIntArray903 = new int[5];

	public static void method468(byte i) {
		do {
			try {
				aClass11_Sub45_Sub18Array901 = null;
				anIntArray903 = null;
				if (i == 17)
					break;
				anInt902 = 19;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "wha.F(" + i + ')');
			}
			break;
		} while (false);
	}

	abstract byte[] method469(int i, boolean bool, int i_0_);

	static final boolean method470(int i, byte i_1_, int i_2_) {
		try {
			anInt899++;
			if (i_1_ != -65)
				method470(-85, (byte) 114, -2);
			if ((i_2_ & 0x180) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wha.E(" + i + ','
					+ i_1_ + ',' + i_2_ + ')'));
		}
	}

	abstract void method471(int i, byte[] is);

	abstract byte[] method472(int i);

	static final void method473(int i, int i_3_, int i_4_,
			Class376_Sub7_Sub3 class376_sub7_sub3,
			Class376_Sub7_Sub3 class376_sub7_sub3_5_) {
		Class364 class364 = Class221.method1414(i, i_3_, i_4_);
		if (class364 != null) {
			((Class364) class364).aClass376_Sub7_Sub3_4780 = class376_sub7_sub3;
			((Class364) class364).aClass376_Sub7_Sub3_4776 = class376_sub7_sub3_5_;
			int i_6_ = ((Class315.aClass12Array4179 == Class234_Sub1_Sub1.aClass12Array9729) ? 1
					: 0);
			if (class376_sub7_sub3.method2863(-122)) {
				if (class376_sub7_sub3.method2870(false)) {
					((Class376_Sub7) class376_sub7_sub3).aClass376_Sub7_7032 = Class11_Sub2_Sub25.aClass376_Sub7Array9326[i_6_];
					Class11_Sub2_Sub25.aClass376_Sub7Array9326[i_6_] = class376_sub7_sub3;
				} else {
					((Class376_Sub7) class376_sub7_sub3).aClass376_Sub7_7032 = Class382.aClass376_Sub7Array4971[i_6_];
					Class382.aClass376_Sub7Array4971[i_6_] = class376_sub7_sub3;
					Class333.aBool4411 = true;
				}
			} else {
				((Class376_Sub7) class376_sub7_sub3).aClass376_Sub7_7032 = Class11_Sub45_Sub4.aClass376_Sub7Array8534[i_6_];
				Class11_Sub45_Sub4.aClass376_Sub7Array8534[i_6_] = class376_sub7_sub3;
			}
			if (class376_sub7_sub3_5_ != null) {
				if (class376_sub7_sub3_5_.method2863(-107)) {
					if (class376_sub7_sub3_5_.method2870(false)) {
						((Class376_Sub7) class376_sub7_sub3_5_).aClass376_Sub7_7032 = Class11_Sub2_Sub25.aClass376_Sub7Array9326[i_6_];
						Class11_Sub2_Sub25.aClass376_Sub7Array9326[i_6_] = class376_sub7_sub3_5_;
					} else {
						((Class376_Sub7) class376_sub7_sub3_5_).aClass376_Sub7_7032 = Class382.aClass376_Sub7Array4971[i_6_];
						Class382.aClass376_Sub7Array4971[i_6_] = class376_sub7_sub3_5_;
						Class333.aBool4411 = true;
					}
				} else {
					((Class376_Sub7) class376_sub7_sub3_5_).aClass376_Sub7_7032 = Class11_Sub45_Sub4.aClass376_Sub7Array8534[i_6_];
					Class11_Sub45_Sub4.aClass376_Sub7Array8534[i_6_] = class376_sub7_sub3_5_;
				}
			}
		}
	}
}
