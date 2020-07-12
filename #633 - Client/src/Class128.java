/* Class128 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class128 {
	static int anInt1723;
	static Class11_Sub4 aClass11_Sub4_1724 = new Class11_Sub4(0, 0);
	static int anInt1725;
	static Class98 aClass98_1726 = new Class98(1);
	static int anInt1727;
	static int[] anIntArray1728 = new int[6];

	public static void method834(byte i) {
		try {
			aClass98_1726 = null;
			if (i == -64) {
				aClass11_Sub4_1724 = null;
				anIntArray1728 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ec.B(" + i + ')');
		}
	}

	static final void method835(int i, boolean bool, int i_0_, int i_1_) {
		do {
			try {
				if (Class111.aClass213_1522.method1369((byte) 26, (long) i) == null) {
					if (!Class254_Sub2.aBool6994)
						Class306.method1878(true, i, bool);
					else {
						Class11_Sub26 class11_sub26 = (new Class11_Sub26(i,
								new Class28_Sub1(4096,
										Class11_Sub8.aClass146_5310, i), i_0_,
								bool));
						((Class11_Sub26) class11_sub26).aClass28_Sub1_6305
								.method242(
										10,
										(Class11_Sub32.aStringArray6878[Class11_Sub45_Sub1_Sub2.anInt9884]));
						Class111.aClass213_1522.method1368((long) i,
								class11_sub26, (byte) -26);
					}
				}
				anInt1725++;
				if (i_1_ == 4096)
					break;
				aClass11_Sub4_1724 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ec.C(" + i + ','
						+ bool + ',' + i_0_ + ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	static final Class195_Sub1 method836(int i, int i_2_) {
		try {
			anInt1723++;
			if (!Class108_Sub7.aBool5634 || Class108_Sub12.anInt6226 > i_2_
					|| (i_2_ ^ 0xffffffff) < (Class343.anInt4554 ^ 0xffffffff))
				return null;
			int i_3_ = 69 % ((-17 - i) / 57);
			return (Class47.aClass195_Sub1Array745[i_2_
					+ -Class108_Sub12.anInt6226]);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ec.A(" + i + ','
					+ i_2_ + ')');
		}
	}
}
