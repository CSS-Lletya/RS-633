/* Class380 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class380 {
	static int anInt4958;
	static int anInt4959;
	static Class314 aClass314_4960 = new Class314();

	static final Class264 method2227(byte i) {
		try {
			anInt4958++;
			try {
				return new Class264_Sub2();
			} catch (Throwable throwable) {
				try {
					int i_0_ = -78 / ((-86 - i) / 40);
					return (Class264) Class.forName("Class264_Sub1")
							.newInstance();
				} catch (Throwable throwable_1_) {
					return new Class264_Sub3();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tca.A(" + i + ')');
		}
	}

	public static void method2228(int i) {
		do {
			try {
				aClass314_4960 = null;
				if (i > 50)
					break;
				method2228(22);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "tca.B(" + i + ')');
			}
			break;
		} while (false);
	}
}
