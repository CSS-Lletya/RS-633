/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class7 {
	int anInt43;
	static String aString44;
	static int anInt45 = 0;
	Class11_Sub45_Sub13 aClass11_Sub45_Sub13_46;
	int[] anIntArray47;
	static Class183 aClass183_48;
	static Class253 aClass253_49;

	public static void method91(boolean bool) {
		try {
			aClass183_48 = null;
			if (bool != false)
				method91(false);
			aString44 = null;
			aClass253_49 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cfa.B(" + bool + ')');
		}
	}

	static long method92(long l, long l_0_) {
		try {
			return l ^ l_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cfa.A(" + l + ','
					+ l_0_ + ')');
		}
	}

	public Class7() {
		/* empty */
	}

	static {
		aString44 = null;
		aClass183_48 = new Class183();
	}
}
