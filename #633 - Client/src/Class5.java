/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class5 {
	static IncomingPacket aClass160_34 = new IncomingPacket(1, 4);
	static int anInt35;

	static final int method84(String string, byte i) {
		try {
			anInt35++;
			int i_0_ = string.length();
			int i_1_ = 0;
			if (i > -21)
				method84(null, (byte) -34);
			for (int i_2_ = 0; i_2_ < i_0_; i_2_++)
				i_1_ = (Class355.method2125(string.charAt(i_2_), -8910)
						+ (i_1_ << 5) + -i_1_);
			return i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rba.B("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method85(byte i) {
		do {
			try {
				aClass160_34 = null;
				if (i == 126)
					break;
				method85((byte) 75);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "rba.A(" + i + ')');
			}
			break;
		} while (false);
	}
}
