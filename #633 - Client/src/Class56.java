/* Class56 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class56 {
	static int anInt837;
	Class11_Sub13 aClass11_Sub13_838;
	Class376_Sub7 aClass376_Sub7_839;
	int anInt840;
	static int anInt841 = 0;
	Class11_Sub14_Sub1 aClass11_Sub14_Sub1_842;
	int anInt843;
	byte aByte844;
	int anInt845;
	static int anInt846;
	int anInt847;
	Class69 aClass69_848;
	static int anInt849;
	int anInt850;
	Class11_Sub6_Sub4 aClass11_Sub6_Sub4_851;
	int anInt852;

	static final Class35[] method450(int i) {
		try {
			if (Class72.aClass35Array1002 == null) {
				Class35[] class35s = Class187.method1219(
						Class108_Sub21.aClass341_7304, (byte) 1);
				Class35[] class35s_0_ = new Class35[class35s.length];
				int i_1_ = 0;
				int i_2_ = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub10_5727
						.method2617(false);
				while_252_: for (int i_3_ = 0; (class35s.length ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++) {
					Class35 class35 = class35s[i_3_];
					if ((((Class35) class35).anInt466 <= 0 || ((Class35) class35).anInt466 >= 24)
							&& (((Class35) class35).anInt464 ^ 0xffffffff) <= -801
							&& ((Class35) class35).anInt467 >= 600
							&& (i_2_ != 2 || (((Class35) class35).anInt464 <= 800 && ((Class35) class35).anInt467 <= 600))
							&& (i_2_ != 1 || (((((Class35) class35).anInt464 ^ 0xffffffff) >= -1025) && ((Class35) class35).anInt467 <= 768))) {
						for (int i_4_ = 0; i_4_ < i_1_; i_4_++) {
							Class35 class35_5_ = class35s_0_[i_4_];
							if ((((Class35) class35_5_).anInt464 == ((Class35) class35).anInt464)
									&& (((Class35) class35_5_).anInt467 == ((Class35) class35).anInt467)) {
								if ((((Class35) class35_5_).anInt466 ^ 0xffffffff) > (((Class35) class35).anInt466 ^ 0xffffffff))
									class35s_0_[i_4_] = class35;
								continue while_252_;
							}
						}
						class35s_0_[i_1_] = class35;
						i_1_++;
					}
				}
				Class72.aClass35Array1002 = new Class35[i_1_];
				Class311.method1901(class35s_0_, 0, Class72.aClass35Array1002,
						0, i_1_);
				int[] is = new int[Class72.aClass35Array1002.length];
				for (int i_6_ = 0; i_6_ < Class72.aClass35Array1002.length; i_6_++) {
					Class35 class35 = Class72.aClass35Array1002[i_6_];
					is[i_6_] = (((Class35) class35).anInt467 * ((Class35) class35).anInt464);
				}
				Class225.method1451(120, Class72.aClass35Array1002, is);
			}
			if (i != 17710)
				return null;
			anInt846++;
			return Class72.aClass35Array1002;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fda.B(" + i + ')');
		}
	}

	final boolean method451(byte i) {
		try {
			if (i != -87)
				method451((byte) -62);
			anInt849++;
			if (((Class56) this).aByte844 != 2
					&& (((Class56) this).aByte844 ^ 0xffffffff) != -4)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fda.A(" + i + ')');
		}
	}

	Class56(byte i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_,
			int i_12_, Class376_Sub7 class376_sub7) {
		try {
			((Class56) this).anInt845 = i_9_;
			((Class56) this).aClass376_Sub7_839 = class376_sub7;
			((Class56) this).anInt847 = i_10_;
			((Class56) this).anInt850 = i_11_;
			((Class56) this).anInt852 = i_8_;
			((Class56) this).anInt843 = i_7_;
			((Class56) this).anInt840 = i_12_;
			((Class56) this).aByte844 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fda.<init>(" + i
					+ ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ','
					+ i_11_ + ',' + i_12_ + ','
					+ (class376_sub7 != null ? "{...}" : "null") + ')'));
		}
	}
}
