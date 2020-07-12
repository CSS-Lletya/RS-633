/* Class11_Sub50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class11_Sub50 extends Class11 {
	static int anInt8020;
	static Class98 aClass98_8021 = new Class98(1);
	static int anInt8022;

	static final void method3226(boolean bool) {
		try {
			Class220_Sub1.anInt7153 = -1;
			if (bool != false)
				method3228(false);
			anInt8020++;
			Class321.anInt4284 = -1;
			Class2_Sub1.anInt5068 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "za.C(" + bool + ')');
		}
	}

	public Class11_Sub50() {
		/* empty */
	}

	public static void method3227(int i) {
		do {
			try {
				aClass98_8021 = null;
				if (i == -1)
					break;
				aClass98_8021 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "za.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method3228(boolean bool) {
		do {
			try {
				if (bool == false) {
					anInt8022++;
					if (Class285.anInt3846 == 9)
						Class83.method575(false, 5);
					else if (Class285.anInt3846 == 5
							|| (Class285.anInt3846 ^ 0xffffffff) == -7)
						Class83.method575(false, 3);
					else {
						if (Class285.anInt3846 != 12)
							break;
						Class83.method575(false, 3);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "za.A(" + bool
						+ ')');
			}
			break;
		} while (false);
	}
}
