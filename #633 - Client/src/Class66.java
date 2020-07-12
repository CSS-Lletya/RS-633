/* Class66 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class66 {
	static int anInt942;
	static int anInt943;
	String aString944;
	int anInt945;
	static int anInt946;
	static OutgoingPacket ACTION_BUTTON5 = new OutgoingPacket(32, 8);
	static int anInt948;
	static Class11_Sub34 aClass11_Sub34_949;

	public static void method493(byte i) {
		try {
			aClass11_Sub34_949 = null;
			ACTION_BUTTON5 = null;
			int i_0_ = -69 % ((79 - i) / 41);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "saa.B(" + i + ')');
		}
	}

	static final void method494(int i, int i_1_, int i_2_, int i_3_,
			boolean bool, long l, Class146 class146, boolean bool_4_) {
		try {
			Class318.anInt4230 = 1;
			Class376_Sub7_Sub3.anInt9278 = i_2_;
			Class29.aClass146_397 = class146;
			Class78.anInt1060 = 10000;
			Class108_Sub16.anInt6539 = i_1_;
			IncomingPacket.anInt2084 = i;
			if (bool != true)
				method494(64, 95, 37, 109, true, -48L, null, false);
			Class334.aClass11_Sub6_Sub2_4425 = null;
			Class234_Sub2.anInt5986 = i_3_;
			Class226.aBool3113 = bool_4_;
			Class91.aLong1234 = l;
			anInt943++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("saa.A(" + i + ','
					+ i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + bool + ',' + l
					+ ',' + (class146 != null ? "{...}" : "null") + ','
					+ bool_4_ + ')'));
		}
	}

	public final String toString() {
		try {
			anInt948++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "saa.toString(" + ')');
		}
	}

	Class66(String string, int i) {
		try {
			((Class66) this).anInt945 = i;
			((Class66) this).aString944 = string;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("saa.<init>("
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
