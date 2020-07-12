/* Class335 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class335 implements Interface22 {
	static int anInt4426;
	Class146 aClass146_4427;
	static int anInt4428;
	static int anInt4429;
	static int[] anIntArray4430;
	private Class146 aClass146_4431;
	private long aLong4432;
	static Class146 aClass146_4433;
	Class254 aClass254_4434;
	private Class107 aClass107_4435;
	static int[] anIntArray4436 = new int[16384];
	static int anInt4437;
	private int anInt4438;
	static int anInt4439;

	abstract void method2013(boolean bool, int i, byte i_0_, int i_1_);

	public boolean method24(int i) {
		try {
			if (i != -32252)
				method2015((byte) 114);
			anInt4426++;
			boolean bool = true;
			if (!((Class335) this).aClass146_4427.method918(
					((Class254) ((Class335) this).aClass254_4434).anInt3480,
					i ^ 0x7d8a))
				bool = false;
			if (!aClass146_4431.method918(
					(((Class254) ((Class335) this).aClass254_4434).anInt3480),
					90))
				bool = false;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uh.G(" + i + ')');
		}
	}

	public void method39(int i) {
		try {
			if (i != 11133)
				((Class335) this).aClass146_4427 = null;
			anInt4429++;
			Class292 class292 = Class194.method1270(aClass146_4431, 2,
					(((Class254) ((Class335) this).aClass254_4434).anInt3480));
			aClass107_4435 = (Class321_Sub2.aClass163_6648
					.method1060(
							class292,
							Class80.method544(
									((Class335) this).aClass146_4427,
									(((Class254) ((Class335) this).aClass254_4434).anInt3480)),
							true));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uh.B(" + i + ')');
		}
	}

	public final void method36(boolean bool, int i) {
		try {
			anInt4437++;
			int i_2_ = ((((Class254) ((Class335) this).aClass254_4434).aClass118_3483
					.method772(
							Class233.anInt3186,
							((Class254) ((Class335) this).aClass254_4434).anInt3489,
							-117)) + ((Class254) ((Class335) this).aClass254_4434).anInt3487);
			int i_3_ = ((((Class254) ((Class335) this).aClass254_4434).aClass150_3492
					.method948(
							((Class254) ((Class335) this).aClass254_4434).anInt3490,
							i + 3340, Class279.anInt3772)) - -((Class254) ((Class335) this).aClass254_4434).anInt3491);
			if (i == -3340) {
				method2013(bool, i_2_, (byte) -104, i_3_);
				method2014(i_3_, i_2_, bool, (byte) -90);
				String string = Class321_Sub2.aClass382_6641
						.method2232((byte) -45);
				if ((-aLong4432 + Class137.method878((byte) -55) ^ 0xffffffffffffffffL) < -10001L)
					string += " ("
							+ Class321_Sub2.aClass382_6641.method2234(
									(byte) -114).method1341((byte) -110) + ")";
				aClass107_4435
						.method709(
								(4
										+ (((Class254) ((Class335) this).aClass254_4434).anInt3490)
										/ 2 + i_3_ + (((Class254) ((Class335) this).aClass254_4434).anInt3481)),
								i_2_
										- -((((Class254) ((Class335) this).aClass254_4434).anInt3489) / 2),
								-1,
								false,
								((Class254) ((Class335) this).aClass254_4434).anInt3488,
								string);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uh.F(" + bool + ','
					+ i + ')');
		}
	}

	abstract void method2014(int i, int i_4_, boolean bool, byte i_5_);

	public static void method2015(byte i) {
		try {
			anIntArray4436 = null;
			if (i < -45) {
				aClass146_4433 = null;
				anIntArray4430 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uh.K(" + i + ')');
		}
	}

	final int method2016(int i) {
		try {
			anInt4428++;
			int i_6_ = Class321_Sub2.aClass382_6641.method2241(-1);
			if (i != 2)
				return 32;
			int i_7_ = 100 * i_6_;
			if ((i_6_ ^ 0xffffffff) != (anInt4438 ^ 0xffffffff)
					|| (i_6_ ^ 0xffffffff) == -1) {
				anInt4438 = i_6_;
				aLong4432 = Class137.method878((byte) -92);
			} else {
				int i_8_ = Class321_Sub2.aClass382_6641.method2243((byte) 96);
				if ((i_6_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff)) {
					long l = aLong4432
							- Class321_Sub2.aClass382_6641.method2244(i ^ 0x76);
					if (l > 0L) {
						long l_9_ = 10000L * l / (long) i_6_
								* (long) (-i_6_ + i_8_);
						long l_10_ = 10000L * (Class137.method878((byte) -84) - aLong4432);
						if ((l_9_ ^ 0xffffffffffffffffL) < (l_10_ ^ 0xffffffffffffffffL))
							i_7_ = (int) ((long) (i_6_ * 100) + (100L * l_10_
									* (long) (i_8_ + -i_6_) / l_9_));
						else
							i_7_ = i_8_ * 100;
					}
				}
			}
			return i_7_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uh.J(" + i + ')');
		}
	}

	Class335(Class146 class146, Class146 class146_11_, Class254 class254) {
		try {
			aClass146_4431 = class146_11_;
			((Class335) this).aClass254_4434 = class254;
			((Class335) this).aClass146_4427 = class146;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("uh.<init>("
					+ (class146 != null ? "{...}" : "null") + ','
					+ (class146_11_ != null ? "{...}" : "null") + ','
					+ (class254 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		anIntArray4430 = new int[16384];
		double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			anIntArray4436[i] = (int) (Math.sin((double) i * d) * 16384.0);
			anIntArray4430[i] = (int) (Math.cos((double) i * d) * 16384.0);
		}
		anInt4439 = 0;
	}
}
