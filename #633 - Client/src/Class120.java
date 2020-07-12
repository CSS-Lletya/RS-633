/* Class120 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120 {
	static int anInt1625;
	static boolean[][] aBoolArrayArray1626;
	static float[] aFloatArray1627;
	static int anInt1628 = -1;
	static int anInt1629;
	static int anInt1630;
	static int anInt1631;

	static final void method783(
			Actor class376_sub7_sub5_sub5, byte i) {
		try {
			anInt1629++;
			if ((((Actor) class376_sub7_sub5_sub5).anIntArray10349) != null
					|| (((Actor) class376_sub7_sub5_sub5).anIntArray10324) != null) {
				boolean bool = true;
				for (int i_0_ = 0; ((((Actor) class376_sub7_sub5_sub5).anIntArray10349).length > i_0_); i_0_++) {
					int i_1_ = -1;
					if ((((Actor) class376_sub7_sub5_sub5).anIntArray10349) != null)
						i_1_ = ((Actor) class376_sub7_sub5_sub5).anIntArray10349[i_0_];
					if (i_1_ == -1) {
						if (!class376_sub7_sub5_sub5.method3969(i_0_, true, -1))
							bool = false;
					} else {
						bool = false;
						boolean bool_2_ = false;
						boolean bool_3_ = false;
						int i_4_;
						int i_5_;
						if ((~0x3fffffff & i_1_) != -1073741824) {
							if ((i_1_ & 0x8000) != 0) {
								int i_6_ = i_1_ & 0x7fff;
								Player class376_sub7_sub5_sub5_sub1 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_6_]);
								if (class376_sub7_sub5_sub5_sub1 != null) {
									i_4_ = (((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045 - (((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7045));
									i_5_ = (((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031 + -(((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7031));
								} else {
									class376_sub7_sub5_sub5.method3969(i_0_,
											true, -1);
									continue;
								}
							} else {
								Class11_Sub25 class11_sub25 = ((Class11_Sub25) (Class11_Sub2_Sub25.aClass213_9322
										.method1369((byte) 26, (long) i_1_)));
								if (class11_sub25 == null) {
									class376_sub7_sub5_sub5.method3969(i_0_,
											true, -1);
									continue;
								}
								Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) class11_sub25).aNpc_2373);
								i_5_ = (-(((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7031) + ((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031);
								i_4_ = (-(((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7045) + ((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045);
							}
						} else {
							int i_7_ = 0xfffffff & i_1_;
							int i_8_ = i_7_ >> 14;
							int i_9_ = 0x3fff & i_7_;
							i_4_ = (-(512 * (-Class194.anInt2641 + i_8_)) - 256 + (((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045));
							i_5_ = -256
									+ (-(512 * (-Class118.anInt1605 + i_9_)) + (((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031));
						}
						if ((i_4_ ^ 0xffffffff) != -1
								|| (i_5_ ^ 0xffffffff) != -1)
							class376_sub7_sub5_sub5
									.method3969(
											i_0_,
											true,
											0x3fff & (int) (2607.5945876176133 * Math
													.atan2((double) i_4_,
															(double) i_5_)));
					}
				}
				if (bool) {
					((Actor) class376_sub7_sub5_sub5).anIntArray10324 = null;
					((Actor) class376_sub7_sub5_sub5).anIntArray10349 = null;
				}
				int i_10_ = 68 % ((-88 - i) / 34);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qca.A("
					+ (class376_sub7_sub5_sub5 != null ? "{...}" : "null")
					+ ',' + i + ')'));
		}
	}

	static final int method784(int i, boolean bool) {
		try {
			anInt1625++;
			if (Class244.anIntArray3314 == null)
				return 0;
			if (!bool && InputStream_Sub2.aClass143Array6948 != null)
				return 2 * Class244.anIntArray3314.length;
			int i_11_ = 0;
			if (i > -27)
				return 121;
			for (int i_12_ = 0; ((Class244.anIntArray3314.length ^ 0xffffffff) < (i_12_ ^ 0xffffffff)); i_12_++) {
				int i_13_ = Class244.anIntArray3314[i_12_];
				if (Class41.aClass146_595.method918(i_13_, 119))
					i_11_++;
				if (Class286_Sub1.aClass146_7138.method918(i_13_, 97))
					i_11_++;
			}
			return i_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qca.B(" + i + ','
					+ bool + ')');
		}
	}

	public static void method785(boolean bool) {
		try {
			aFloatArray1627 = null;
			if (bool != false)
				method784(-99, true);
			aBoolArrayArray1626 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qca.C(" + bool + ')');
		}
	}

	static {
		aFloatArray1627 = new float[4];
		anInt1631 = -1;
	}
}
