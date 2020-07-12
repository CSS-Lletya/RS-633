/* Class72_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class72_Sub3 extends Class72 {
	Class321_Sub3_Sub1 aClass321_Sub3_Sub1_7312;
	static int anInt7313;
	static int anInt7314;
	static Class11_Sub5 aClass11_Sub5_7315 = new Class11_Sub5(0, 0);
	static Class183 aClass183_7316 = new Class183();

	Class72_Sub3(Class163_Sub3 class163_sub3, int i, int i_0_, byte[] is) {
		try {
			((Class72_Sub3) this).aClass321_Sub3_Sub1_7312 = Class236_Sub9
					.method3119(true, i_0_, false, i, is, class163_sub3, 6406,
							6406);
			((Class72_Sub3) this).aClass321_Sub3_Sub1_7312.method2855(false,
					false, 94);
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("sg.<init>("
							+ (class163_sub3 != null ? "{...}" : "null") + ','
							+ i + ',' + i_0_ + ','
							+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2959(int i) {
		try {
			int i_1_ = 26 % ((i - 1) / 45);
			Class343.aClass56Array4543 = new Class56[50];
			anInt7314++;
			Class376_Sub7_Sub3_Sub1.anInt9863 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sg.C(" + i + ')');
		}
	}

	public static void method2960(boolean bool) {
		do {
			try {
				aClass11_Sub5_7315 = null;
				aClass183_7316 = null;
				if (bool == false)
					break;
				method2960(true);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "sg.B(" + bool
						+ ')');
			}
			break;
		} while (false);
	}
}
