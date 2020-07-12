/* Class266 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class266 {
	static int anInt3616;
	static short aShort3617 = 32767;
	int anInt3618;
	int anInt3619;
	static short[] aShortArray3620 = new short[256];
	static IncomingPacket aClass160_3621;
	static int anInt3622;
	static int anInt3623;
	int anInt3624;

	static final String method1683(String string, String string_0_, int i,
			String string_1_) {
		try {
			anInt3622++;
			int i_2_ = string_1_.indexOf(string);
			if (i != 0)
				method1684(-12);
			for (/**/; (i_2_ ^ 0xffffffff) != 0; i_2_ = string_1_.indexOf(
					string, i_2_ + string_0_.length()))
				string_1_ = (string_1_.substring(0, i_2_) + string_0_ + string_1_
						.substring(string.length() + i_2_));
			return string_1_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public static void method1684(int i) {
		do {
			try {
				aShortArray3620 = null;
				aClass160_3621 = null;
				if (i == 0)
					break;
				aShortArray3620 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "op.B(" + i + ')');
			}
			break;
		} while (false);
	}

	public Class266() {
		/* empty */
	}
}
