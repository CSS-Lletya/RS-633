/* Class308 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class308 {
	static Class11_Sub45_Sub18[] aClass11_Sub45_Sub18Array4125 = new Class11_Sub45_Sub18[14];
	static int anInt4126;
	static boolean aBool4127;
	static Class146 aClass146_4128;
	static int anInt4129;

	static final String method1885(String string, byte i, String string_0_,
			char c) {
		try {
			anInt4129++;
			int i_1_ = string_0_.length();
			int i_2_ = string.length();
			int i_3_ = i_1_;
			if (i != 122)
				method1886(-60);
			int i_4_ = i_2_ - 1;
			if (i_4_ != 0) {
				int i_5_ = 0;
				for (;;) {
					i_5_ = string_0_.indexOf(c, i_5_);
					if ((i_5_ ^ 0xffffffff) > -1)
						break;
					i_3_ += i_4_;
					i_5_++;
				}
			}
			StringBuffer stringbuffer = new StringBuffer(i_3_);
			int i_6_ = 0;
			for (;;) {
				int i_7_ = string_0_.indexOf(c, i_6_);
				if ((i_7_ ^ 0xffffffff) > -1)
					break;
				stringbuffer.append(string_0_.substring(i_6_, i_7_));
				i_6_ = 1 + i_7_;
				stringbuffer.append(string);
			}
			stringbuffer.append(string_0_.substring(i_6_));
			return stringbuffer.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kea.B("
					+ (string != null ? "{...}" : "null") + ',' + i + ','
					+ (string_0_ != null ? "{...}" : "null") + ',' + c + ')'));
		}
	}

	public static void method1886(int i) {
		try {
			if (i != -6958)
				aBool4127 = false;
			aClass11_Sub45_Sub18Array4125 = null;
			aClass146_4128 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kea.A(" + i + ')');
		}
	}
}
