/* Class139 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class139 {
	static Class84 aClass84_1890 = new Class84();
	static int anInt1891;

	static final void method882(int i, int i_0_, byte i_1_, int i_2_, int i_3_,
			int i_4_, Actor class376_sub7_sub5_sub5) {
		try {
			Class11_Sub33.method2796(i, (byte) -59,
					((Class376_Sub7) class376_sub7_sub5_sub5).aByte7047, i_4_,
					i_0_, i_3_,
					((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045, 0,
					i_2_, ((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031);
			if (i_1_ < 22)
				aClass84_1890 = null;
			anInt1891++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("fa.A("
							+ i
							+ ','
							+ i_0_
							+ ','
							+ i_1_
							+ ','
							+ i_2_
							+ ','
							+ i_3_
							+ ','
							+ i_4_
							+ ','
							+ (class376_sub7_sub5_sub5 != null ? "{...}"
									: "null") + ')'));
		}
	}

	public static void method883(int i) {
		try {
			if (i <= 83)
				aClass84_1890 = null;
			aClass84_1890 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fa.B(" + i + ')');
		}
	}
}
