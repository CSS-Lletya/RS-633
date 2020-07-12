/* Class246 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246 {
	static int anInt3320;
	static int anInt3321;
	static OutgoingPacket ACTION_BUTTON6 = new OutgoingPacket(72, 8);
	static int anInt3323;
	static int anInt3324;
	static int anInt3325;
	static int anInt3326;
	static boolean aBool3327;
	static int[] anIntArray3328 = new int[4096];
	Class376_Sub1 aClass376_Sub1_3329 = new Class376_Sub1();
	static int anInt3330 = -1;
	private Class376_Sub1 aClass376_Sub1_3331;

	final Class376_Sub1 method1548(int i) {
		try {
			anInt3325++;
			if (i != 0)
				anInt3321 = -23;
			Class376_Sub1 class376_sub1 = aClass376_Sub1_3331;
			if (class376_sub1 == ((Class246) this).aClass376_Sub1_3329) {
				aClass376_Sub1_3331 = null;
				return null;
			}
			aClass376_Sub1_3331 = ((Class376_Sub1) class376_sub1).aClass376_Sub1_5095;
			return class376_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ne.F(" + i + ')');
		}
	}

	public static void method1549(int i) {
		do {
			try {
				ACTION_BUTTON6 = null;
				anIntArray3328 = null;
				if (i == -1)
					break;
				method1549(98);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ne.A(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1550(int i, Class376_Sub1 class376_sub1) {
		do {
			try {
				anInt3323++;
				if (((Class376_Sub1) class376_sub1).aClass376_Sub1_5092 != null)
					class376_sub1.method2274((byte) -30);
				((Class376_Sub1) class376_sub1).aClass376_Sub1_5095 = ((Class246) this).aClass376_Sub1_3329;
				((Class376_Sub1) class376_sub1).aClass376_Sub1_5092 = (((Class376_Sub1) ((Class246) this).aClass376_Sub1_3329).aClass376_Sub1_5092);
				((Class376_Sub1) (((Class376_Sub1) class376_sub1).aClass376_Sub1_5092)).aClass376_Sub1_5095 = class376_sub1;
				((Class376_Sub1) (((Class376_Sub1) class376_sub1).aClass376_Sub1_5095)).aClass376_Sub1_5092 = class376_sub1;
				if (i == 4096)
					break;
				method1550(-75, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ne.E(" + i + ','
						+ (class376_sub1 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method1551(int i) {
		try {
			anInt3324++;
			if (i == 4096) {
				for (;;) {
					Class376_Sub1 class376_sub1 = (((Class376_Sub1) ((Class246) this).aClass376_Sub1_3329).aClass376_Sub1_5095);
					if (((Class246) this).aClass376_Sub1_3329 == class376_sub1)
						break;
					class376_sub1.method2274((byte) -58);
				}
				aClass376_Sub1_3331 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ne.C(" + i + ')');
		}
	}

	final int method1552(int i) {
		try {
			anInt3326++;
			int i_0_ = i;
			for (Class376_Sub1 class376_sub1 = (((Class376_Sub1) ((Class246) this).aClass376_Sub1_3329).aClass376_Sub1_5095); ((Class246) this).aClass376_Sub1_3329 != class376_sub1; class376_sub1 = ((Class376_Sub1) class376_sub1).aClass376_Sub1_5095)
				i_0_++;
			return i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ne.D(" + i + ')');
		}
	}

	final Class376_Sub1 method1553(int i) {
		try {
			if (i != -1)
				anInt3330 = 88;
			anInt3320++;
			Class376_Sub1 class376_sub1 = (((Class376_Sub1) ((Class246) this).aClass376_Sub1_3329).aClass376_Sub1_5095);
			if (((Class246) this).aClass376_Sub1_3329 == class376_sub1) {
				aClass376_Sub1_3331 = null;
				return null;
			}
			aClass376_Sub1_3331 = ((Class376_Sub1) class376_sub1).aClass376_Sub1_5095;
			return class376_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ne.B(" + i + ')');
		}
	}

	public Class246() {
		try {
			((Class376_Sub1) ((Class246) this).aClass376_Sub1_3329).aClass376_Sub1_5095 = ((Class246) this).aClass376_Sub1_3329;
			((Class376_Sub1) ((Class246) this).aClass376_Sub1_3329).aClass376_Sub1_5092 = ((Class246) this).aClass376_Sub1_3329;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ne.<init>(" + ')');
		}
	}
}
