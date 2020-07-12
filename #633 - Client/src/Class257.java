/* Class257 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class257 {
	private static int anInt3511 = 0;
	private static boolean aBool3512 = false;
	private static Class84 aClass84_3513 = new Class84();

	static final synchronized void method1640(int i) {
		do {
			try {
				if (i > 82) {
					anInt3511--;
					if ((anInt3511 ^ 0xffffffff) != -1)
						break;
					method1644(-9657);
				}
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	static final synchronized void method1641(int i) {
		try {
			anInt3511++;
			int i_0_ = 102 % ((i - 16) / 32);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static final synchronized void method1642(byte i, Interface2 interface2) {
		try {
			if (!aBool3512) {
				if (i != 123)
					method1641(-33);
				if (anInt3511 <= 0)
					interface2.w(false);
				else {
					Class11_Sub42 class11_sub42 = new Class11_Sub42();
					((Class11_Sub42) class11_sub42).anInterface2_7271 = interface2;
					aClass84_3513.method589((byte) -13, class11_sub42);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static final synchronized void method1643(boolean bool, boolean bool_1_) {
		do {
			try {
				aBool3512 = bool;
				if (bool_1_ == true)
					break;
				anInt3511 = 43;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	static final synchronized void method1644(int i) {
		do {
			try {
				for (;;) {
					Class11_Sub42 class11_sub42 = (Class11_Sub42) aClass84_3513
							.method581((byte) -16);
					if (class11_sub42 == null)
						break;
					((Class11_Sub42) class11_sub42).anInterface2_7271.w(true);
					class11_sub42.method122(-30);
				}
				if (i == -9657)
					break;
				aBool3512 = false;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}
}
