/* Class376_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class376_Sub7 extends Class376 {
	int anInt7031;
	Class376_Sub7 aClass376_Sub7_7032;
	static int anInt7033;
	int anInt7034;
	static int anInt7035;
	int anInt7036;
	static int anInt7037;
	static Class307 aClass307_7038 = new Class307("RC", 1);
	byte aByte7039;
	static int anInt7040;
	int anInt7041;
	static int anInt7042;
	boolean aBool7043;
	boolean aBool7044 = false;
	int anInt7045;
	static Class298 aClass298_7046 = new Class298("", 14);
	byte aByte7047;
	int anInt7048;
	static boolean aBool7049 = false;
	static boolean aBool7050 = false;

	final int method2857(int i, Class11_Sub46[] class11_sub46s, byte i_0_,
			int i_1_) {
		try {
			anInt7037++;
			long l = (Class216.aLongArrayArrayArray2995[((Class376_Sub7) this).aByte7047][i][i_1_]);
			if (i_0_ > -18)
				method2858(-89);
			long l_2_ = 0L;
			int i_3_ = 0;
			while (l_2_ <= 48L) {
				int i_4_ = (int) (0xffffL & l >> (int) l_2_);
				if ((i_4_ ^ 0xffffffff) >= -1)
					break;
				l_2_ += 16L;
				class11_sub46s[i_3_++] = (((Class248) Class309.aClass248Array4132[i_4_ - 1]).aClass11_Sub46_3357);
			}
			for (int i_5_ = i_3_; i_5_ < 4; i_5_++)
				class11_sub46s[i_5_] = null;
			return i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kba.VA(" + i + ','
					+ (class11_sub46s != null ? "{...}" : "null") + ',' + i_0_
					+ ',' + i_1_ + ')'));
		}
	}

	static final void method2858(int i) {
		try {
			anInt7042++;
			Class364.aClass11_Sub6_Sub2_4773.method3490(108);
			Class318.anInt4230 = 1;
			Class29.aClass146_397 = null;
			int i_6_ = 13 / ((66 - i) / 37);
			Class334.aClass11_Sub6_Sub2_4425 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kba.UA(" + i + ')');
		}
	}

	abstract int method2859(Class11_Sub46[] class11_sub46s, int i);

	abstract Class212 method2860(int i, Class163 class163);

	public static void method2861(int i) {
		try {
			if (i != -17340)
				method2866(-69);
			aClass307_7038 = null;
			aClass298_7046 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kba.SA(" + i + ')');
		}
	}

	abstract boolean method2862(int i);

	abstract boolean method2863(int i);

	int method2864(int i) {
		try {
			if (i < 72)
				return -114;
			anInt7040++;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kba.TA(" + i + ')');
		}
	}

	abstract boolean method2865(int i);

	static final void method2866(int i) {
		try {
			if (i != 1)
				aClass298_7046 = null;
			for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -101; i_7_++)
				Class1.aClass326Array3[i_7_] = null;
			anInt7033++;
			Class11_Sub45_Sub2.anInt8512 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kba.RA(" + i + ')');
		}
	}

	abstract int method2867(int i);

	abstract int method2868(byte i);

	abstract boolean method2869(int i);

	abstract boolean method2870(boolean bool);

	abstract void method2871(boolean bool, Class163 class163, int i, int i_8_,
			Class376_Sub7 class376_sub7_9_, int i_10_, int i_11_);

	abstract void method2872(int i);

	abstract boolean method2873(Class163 class163, int i, int i_12_, int i_13_);

	abstract void method2874(byte i, Class163 class163);

	static final void method2875(int i, int i_14_) {
		try {
			if (i_14_ == 19412) {
				anInt7035++;
				Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
						i_14_ + -652891508, 6, i);
				class11_sub45_sub15.method3660(0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kba.QA(" + i + ','
					+ i_14_ + ')');
		}
	}

	abstract Class376_Sub5 method2876(byte i, Class163 class163);

	public Class376_Sub7() {
		/* empty */
	}
}
