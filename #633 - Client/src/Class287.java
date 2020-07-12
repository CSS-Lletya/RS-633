/* Class287 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class287 implements Interface22 {
	static int anInt3881;
	private Class167 aClass167_3882;
	static Class213 aClass213_3883 = new Class213(8);
	static int anInt3884;
	static int anInt3885;
	static int anInt3886;
	static Class146 aClass146_3887;
	static int anInt3888;
	private static short[][] aShortArrayArray3889;
	private static short[][] aShortArrayArray3890;
	static short[][][] aShortArrayArrayArray3891;
	private static short[][] aShortArrayArray3892;

	static final void method1777(byte i) {
		try {
			anInt3881++;
			if ((Class285.anInt3846 ^ 0xffffffff) == -8)
				InputStream_Sub2.method2814(false, -25626);
			else {
				Class321_Sub3.aClass217_7017 = Class108_Sub2.aClass217_5081;
				Class108_Sub2.aClass217_5081 = null;
				if (i < 90)
					method1778((byte) 64);
				Class83.method575(false, 13);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qe.C(" + i + ')');
		}
	}

	public final boolean method24(int i) {
		try {
			anInt3886++;
			if (i != -32252)
				method39(24);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qe.G(" + i + ')');
		}
	}

	public static void method1778(byte i) {
		try {
			aShortArrayArray3890 = null;
			aShortArrayArrayArray3891 = null;
			aClass146_3887 = null;
			aShortArrayArray3892 = null;
			int i_0_ = -82 % ((i + 34) / 47);
			aShortArrayArray3889 = null;
			aClass213_3883 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qe.A(" + i + ')');
		}
	}

	Class287(Class167 class167) {
		try {
			aClass167_3882 = class167;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qe.<init>("
					+ (class167 != null ? "{...}" : "null") + ')'));
		}
	}

	public final void method39(int i) {
		try {
			if (i != 11133)
				aShortArrayArray3890 = null;
			anInt3885++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qe.B(" + i + ')');
		}
	}

	public final void method36(boolean bool, int i) {
		do {
			try {
				anInt3884++;
				if (bool)
					Class321_Sub2.aClass163_6648.aa(0, 0,
							Class11_Sub36.anInt7079, Class153.anInt2025,
							((Class167) aClass167_3882).anInt2153, 0);
				if (i == -3340)
					break;
				method1777((byte) -119);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "qe.F(" + bool
						+ ',' + i + ')');
			}
			break;
		} while (false);
	}

	static {
		new Class298("", 76);
		aShortArrayArray3890 = (new short[][] {
				{ 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108,
						7719, 14241, 22443, 30247, -29781, -25675, -21568,
						-17472, -12373, -8256, -3545 },
				{ 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108,
						7719, 14241, 22443, 30247, -29781, -25675, -21568,
						-17472, -12373, -8256, -3545 },
				{ 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760,
						9108, 7719, 14241, 22443, 30247, -29781, -25675,
						-21568, -17472, -12373, -8256, -3545 },
				{ 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108,
						7719, 14241, 22443, 30247, -29781, -25675, -21568,
						-17472, -12373, -8256, -3545 },
				{ 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108,
						7719, 14241, 22443, 30247, -29781, -25675, -21568,
						-17472, -12373, -8256, -3545 } });
		aShortArrayArray3889 = new short[][] { new short[0], new short[0],
				new short[0], new short[0], new short[0] };
		aShortArrayArray3892 = new short[][] { new short[0], new short[0],
				new short[0], new short[0], new short[0] };
		aShortArrayArrayArray3891 = new short[][][] { aShortArrayArray3890,
				aShortArrayArray3889, aShortArrayArray3892 };
	}
}
