/* Class220 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class220 implements Interface22 {
	static int anInt3021;
	Class253 aClass253_3022;
	private Class146 aClass146_3023;
	static boolean aBool3024 = false;
	static Class22 aClass22_3025 = new Class22(4);
	static int anInt3026;
	static int anInt3027;
	Class57 aClass57_3028;

	public void method36(boolean bool, int i) {
		do {
			try {
				if (bool) {
					int i_0_ = ((((Class57) ((Class220) this).aClass57_3028).aClass118_858
							.method772(Class233.anInt3186,
									((Class220) this).aClass253_3022
											.method1608(), -89)) + (((Class57) ((Class220) this).aClass57_3028).anInt859));
					int i_1_ = ((((Class57) ((Class220) this).aClass57_3028).aClass150_853
							.method948(((Class220) this).aClass253_3022
									.method1622(), 0, Class279.anInt3772)) + (((Class57) ((Class220) this).aClass57_3028).anInt855));
					((Class220) this).aClass253_3022.method1610(i_0_, i_1_);
				}
				anInt3027++;
				if (i == -3340)
					break;
				method1407((byte) 98);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ld.F(" + bool
						+ ',' + i + ')');
			}
			break;
		} while (false);
	}

	public static void method1407(byte i) {
		do {
			try {
				aClass22_3025 = null;
				if (i == 74)
					break;
				method1407((byte) 4);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ld.C(" + i + ')');
			}
			break;
		} while (false);
	}

	public final boolean method24(int i) {
		try {
			anInt3026++;
			if (i != -32252)
				((Class220) this).aClass253_3022 = null;
			return aClass146_3023.method918(
					(((Class57) ((Class220) this).aClass57_3028).anInt857),
					-120);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ld.G(" + i + ')');
		}
	}

	public final void method39(int i) {
		try {
			((Class220) this).aClass253_3022 = Class228.method1473(-20770,
					aClass146_3023,
					((Class57) (((Class220) this).aClass57_3028)).anInt857);
			if (i != 11133)
				((Class220) this).aClass253_3022 = null;
			anInt3021++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ld.B(" + i + ')');
		}
	}

	Class220(Class146 class146, Class57 class57) {
		try {
			((Class220) this).aClass57_3028 = class57;
			aClass146_3023 = class146;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ld.<init>("
					+ (class146 != null ? "{...}" : "null") + ','
					+ (class57 != null ? "{...}" : "null") + ')'));
		}
	}
}
