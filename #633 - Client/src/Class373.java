/* Class373 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class373 {
	static int anInt4877;
	boolean aBool4878;
	Interface27 anInterface27_4879;
	static int[] anIntArray4880;
	static int anInt4881;
	static int anInt4882;
	static int anInt4883;
	boolean aBool4884;
	Interface27 anInterface27_4885;
	static int[] anIntArray4886 = new int[2048];
	static int anInt4887;

	public static void method2196(byte i) {
		try {
			if (i > -45)
				anInt4881 = -127;
			anIntArray4880 = null;
			anIntArray4886 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vda.A(" + i + ')');
		}
	}

	final void method2197(int i) {
		try {
			int i_0_ = -25 % ((i + 61) / 50);
			if (((Class373) this).anInterface27_4885 != null)
				((Class373) this).anInterface27_4885.method8(5342);
			anInt4882++;
			((Class373) this).aBool4884 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vda.C(" + i + ')');
		}
	}

	final boolean method2198(int i) {
		try {
			if (i != 3816)
				return false;
			anInt4877++;
			if (!((Class373) this).aBool4884 || ((Class373) this).aBool4878)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vda.D(" + i + ')');
		}
	}

	static final String method2199(int i, boolean bool, byte i_1_, int i_2_) {
		try {
			anInt4887++;
			if ((i_2_ ^ 0xffffffff) > -3 || i_2_ > 36)
				throw new IllegalArgumentException("Invalid radix:" + i_2_);
			if (!bool || i < 0)
				return Integer.toString(i, i_2_);
			int i_3_ = 2;
			int i_4_ = i / i_2_;
			if (i_1_ != 41)
				return null;
			while ((i_4_ ^ 0xffffffff) != -1) {
				i_4_ /= i_2_;
				i_3_++;
			}
			char[] cs = new char[i_3_];
			cs[0] = '+';
			for (int i_5_ = i_3_ - 1; (i_5_ ^ 0xffffffff) < -1; i_5_--) {
				int i_6_ = i;
				i /= i_2_;
				int i_7_ = i_6_ - i * i_2_;
				if ((i_7_ ^ 0xffffffff) > -11)
					cs[i_5_] = (char) (48 + i_7_);
				else
					cs[i_5_] = (char) (87 + i_7_);
			}
			return new String(cs);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vda.B(" + i + ','
					+ bool + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	Class373(boolean bool) {
		try {
			((Class373) this).aBool4878 = bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vda.<init>(" + bool
					+ ')');
		}
	}

	static {
		anInt4883 = 1;
		anInt4881 = 0;
	}
}
