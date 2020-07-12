/* Class256 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class256 {
	static boolean[] aBoolArray3505;
	int anInt3506;
	static int[] anIntArray3507;
	static Class182 aClass182_3508;
	int anInt3509;
	int anInt3510;

	abstract void method1636(int i, int i_0_, int i_1_);

	abstract void method1637(boolean bool, int i, int i_2_);

	public static void method1638(int i) {
		do {
			try {
				aBoolArray3505 = null;
				aClass182_3508 = null;
				anIntArray3507 = null;
				if (i > 55)
					break;
				method1638(29);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "kaa.G(" + i + ')');
			}
			break;
		} while (false);
	}

	Class256(int i, int i_3_, int i_4_) {
		try {
			((Class256) this).anInt3509 = i_4_;
			((Class256) this).anInt3510 = i;
			((Class256) this).anInt3506 = i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kaa.<init>(" + i
					+ ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	abstract void method1639(int i, int i_5_, int i_6_);
}
