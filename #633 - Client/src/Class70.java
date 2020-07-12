/* Class70 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class70 {
	String aString980;
	static int[] anIntArray981;
	static Stream[] cachedAppearances = new Stream[2048];
	static Class9 aClass9_983;
	static int anInt984;
	String aString985;
	static Class118 aClass118_986;
	static int anInt987;
	String aString988;

	static final boolean method508(byte i, int i_0_) {
		try {
			if (i >= -45)
				anIntArray981 = null;
			anInt987++;
			if ((i_0_ < 0 || (i_0_ ^ 0xffffffff) < -4) && i_0_ != 9)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "baa.B(" + i + ','
					+ i_0_ + ')');
		}
	}

	public static void method509(boolean bool) {
		do {
			try {
				anIntArray981 = null;
				cachedAppearances = null;
				aClass9_983 = null;
				aClass118_986 = null;
				if (bool == true)
					break;
				method508((byte) -65, -126);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "baa.A(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	Class70(String string, String string_1_, String string_2_) {
		try {
			((Class70) this).aString985 = string;
			((Class70) this).aString988 = string_1_;
			((Class70) this).aString980 = string_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("baa.<init>("
					+ (string != null ? "{...}" : "null") + ','
					+ (string_1_ != null ? "{...}" : "null") + ','
					+ (string_2_ != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		anIntArray981 = new int[1000];
		aClass9_983 = new Class9(3, 2);
		anInt984 = 0;
	}
}
