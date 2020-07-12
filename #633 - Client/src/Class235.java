/* Class235 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class235 {
	static int anInt3213;
	static IncomingPacket SEND_VAR_BIT_BIG = new IncomingPacket(73, 6);
	static int anInt3215;
	static int anInt3216;
	static Class338[] aClass338Array3217 = new Class338[4];
	static boolean aBool3218;
	static int anInt3219 = -1;

	public static void method1498(int i) {
		do {
			try {
				SEND_VAR_BIT_BIG = null;
				aClass338Array3217 = null;
				if (i == 0)
					break;
				method1499(-115);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "mg.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method1499(int i) {
		try {
			Class56.anInt837 = (int) (34.46 * (double) Class300.anInt4051);
			anInt3213++;
			Class108_Sub9.anInt6100 = 200;
			Class56.anInt837 <<= 2;
			if (Class321_Sub2.aClass163_6648.method1062())
				Class56.anInt837 += 512;
			int i_0_ = -40 / ((57 - i) / 34);
			Class11_Sub45_Sub7.method3447(false, (byte) 122);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mg.B(" + i + ')');
		}
	}

	static {
		aBool3218 = false;
	}
}
