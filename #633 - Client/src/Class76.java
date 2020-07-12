/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class76 implements Interface16 {
	private String aString1037;
	static OutgoingPacket aClass370_1038 = new OutgoingPacket(48, 2);
	static int anInt1039;
	static int anInt1040;
	static int anInt1041;
	private boolean aBool1042;

	public final int method30(int i) {
		try {
			anInt1039++;
			int i_0_ = Class11_Sub12_Sub4.method3719(aString1037, 88);
			if ((i_0_ ^ 0xffffffff) <= -1 && (i_0_ ^ 0xffffffff) >= -101)
				return i_0_;
			aBool1042 = true;
			if (i != 6340)
				aClass370_1038 = null;
			return 100;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "an.A(" + i + ')');
		}
	}

	public static void method525(int i) {
		try {
			if (i != 48)
				method525(26);
			aClass370_1038 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "an.C(" + i + ')');
		}
	}

	final boolean method526(byte i) {
		try {
			anInt1041++;
			int i_1_ = 67 / ((i + 64) / 55);
			return aBool1042;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "an.D(" + i + ')');
		}
	}

	public final Class117 method47(int i) {
		try {
			int i_2_ = -68 / ((i + 19) / 60);
			anInt1040++;
			return Class117.aClass117_1593;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "an.B(" + i + ')');
		}
	}

	Class76(String string) {
		try {
			aString1037 = string;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "an.<init>("
					+ (string != null ? "{...}" : "null") + ')');
		}
	}
}
