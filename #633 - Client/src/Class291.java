/* Class291 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;

final class Class291 {
	static int anInt3926;
	static int anInt3927;
	private int anInt3928 = -1;
	private int[][][] anIntArrayArrayArray3929;
	static int anInt3930;
	static Color[] aColorArray3931;
	static int anInt3932 = 1;
	private Class84 aClass84_3933;
	static int anInt3934;
	static int anInt3935;
	static int anInt3936;
	private int anInt3937 = 0;
	static int anInt3938;
	private int anInt3939;
	private int anInt3940;
	private Class11_Sub5[] aClass11_Sub5Array3941;
	static int anInt3942;
	boolean aBool3943;
	static Class9 aClass9_3944;

	public static void method1795(int i) {
		do {
			try {
				aClass9_3944 = null;
				aColorArray3931 = null;
				if (i > 52)
					break;
				aClass9_3944 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "qj.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method1796(byte i, Class163 class163) {
		do {
			try {
				anInt3934++;
				if ((Class52.anInt802 >= 2 || Class204.aBool2739)
						&& Class11_Sub2_Sub32_Sub1.aClass192_9889 == null) {
					String string;
					if (!Class204.aBool2739
							|| (Class52.anInt802 ^ 0xffffffff) <= -3) {
						if (!Class11_Sub45_Sub3.aBool8529
								|| !Class11_Sub2_Sub19.aClass1_9098.method60(0,
										81)
								|| (Class52.anInt802 ^ 0xffffffff) >= -3) {
							Class11_Sub45_Sub5 class11_sub45_sub5 = Class11_Sub19.aClass11_Sub45_Sub5_5815;
							if (class11_sub45_sub5 == null)
								break;
							string = Class164.method1091(class11_sub45_sub5,
									-119);
							int[] is = null;
							if (Class135
									.method872(
											-46,
											(((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760)))
								is = ((Class249) (Packet.aClass223_8723
										.method1430(
												(int) ((Class11_Sub45_Sub5) class11_sub45_sub5).aLong8771,
												false))).anIntArray3368;
							else if ((((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8759) == -1) {
								if (Class26
										.method221(
												(((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760),
												(byte) -94)) {
									Class11_Sub25 class11_sub25 = ((Class11_Sub25) (Class11_Sub2_Sub25.aClass213_9322
											.method1369(
													(byte) 26,
													(long) (int) (((Class11_Sub45_Sub5) class11_sub45_sub5).aLong8771))));
									if (class11_sub25 != null) {
										Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) class11_sub25).aNpc_2373);
										NPCDefinitions class215 = (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501);
										if ((((NPCDefinitions) class215).anIntArray2950) != null)
											class215 = (class215
													.method1375(
															(byte) 29,
															(Class11_Sub26.aClass97_6296)));
										if (class215 != null)
											is = (((NPCDefinitions) class215).anIntArray2925);
									}
								} else if (Class11_Sub45_Sub16_Sub2
										.method3931(
												8071,
												((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760)) {
									Object object = null;
									Class42 class42;
									if (((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760 != 1004)
										class42 = (Class11_Sub4.aClass290_5237
												.method1793(
														(byte) -22,
														(int) (0x7fffffffL & (((Class11_Sub45_Sub5) class11_sub45_sub5).aLong8771) >>> 32)));
									else
										class42 = (Class11_Sub4.aClass290_5237
												.method1793(
														(byte) 2,
														(int) (((Class11_Sub45_Sub5) class11_sub45_sub5).aLong8771)));
									if (((Class42) class42).anIntArray683 != null)
										class42 = (class42.method380(
												Class11_Sub26.aClass97_6296, 0));
									if (class42 != null)
										is = ((Class42) class42).anIntArray676;
								}
							} else
								is = ((Class249) (Packet.aClass223_8723
										.method1430(
												((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8759,
												false))).anIntArray3368;
							if (is != null)
								string += Class11_Sub32.method2795(is,
										(byte) 101);
						} else
							string = (Class164.method1091(
									Class11_Sub19.aClass11_Sub45_Sub5_5815,
									-122));
					} else
						string = (Class374.aString4890
								+ (Class26.aClass26_308.method217((byte) 112,
										Class11_Sub45_Sub1_Sub2.anInt9884))
								+ Class250.aString3444 + " ->");
					if ((Class52.anInt802 ^ 0xffffffff) < -3)
						string += ("<col=ffffff> / " + (Class52.anInt802 - 2) + (Class26.aClass26_301
								.method217((byte) 95,
										Class11_Sub45_Sub1_Sub2.anInt9884)));
					if (Class15.aClass192_132 == null) {
						if (Class108_Sub8.aClass192_5734 != null
								&& (Class198.aClass66_2679 == Class142.aClass66_1925)) {
							int i_0_ = (Class98.aClass107_1308.method712(
									Class205.anInt2758, Class254.aRandom3482,
									Class204.anInt2748 + 4, string,
									16 + Class11_Sub18.anInt5792, 0, 16777215,
									(byte) -28,
									Class376_Sub7_Sub5_Sub4.anIntArray10126,
									Class46.aClass253Array722));
							Class304.method1869(
									Class256_Sub1.aClass292_5320.method1805(
											string, (byte) -121) + i_0_, 16,
									-17012, Class11_Sub18.anInt5792,
									4 + Class204.anInt2748);
						}
					} else {
						Class107 class107 = Class15.aClass192_132.method1252(
								class163, 0);
						if (class107 == null)
							class107 = Class98.aClass107_1308;
						class107.method715(
								((IComponentDefinitions) Class15.aClass192_132).anInt2610,
								string,
								((IComponentDefinitions) Class15.aClass192_132).anInt2554,
								((IComponentDefinitions) Class15.aClass192_132).anInt2546,
								Class11_Sub51.anIntArray8033,
								Class17.anInt145,
								Class376_Sub7_Sub5_Sub4.anIntArray10126,
								((IComponentDefinitions) Class15.aClass192_132).anInt2607,
								Class46.aClass253Array722,
								((IComponentDefinitions) Class15.aClass192_132).anInt2577,
								Class254.aRandom3482,
								0,
								Class205.anInt2758,
								Class239.anInt3250,
								((IComponentDefinitions) Class15.aClass192_132).anInt2589);
						Class304.method1869(Class11_Sub51.anIntArray8033[2],
								Class11_Sub51.anIntArray8033[3], -17012,
								Class11_Sub51.anIntArray8033[1],
								Class11_Sub51.anIntArray8033[0]);
					}
					if (i < -87)
						break;
					anInt3932 = 70;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("qj.C(" + i + ','
						+ (class163 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final boolean method1797(int i) {
		try {
			anInt3935++;
			if (i != -15377)
				return true;
			try {
				Class191 class191 = new Class191();
				byte[] is = class191.method1239(Class45.aByteArray717,
						(byte) -73);
				Class325.method1978(is, i + 15486);
				return true;
			} catch (Exception exception) {
				return false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qj.D(" + i + ')');
		}
	}

	final int[][][] method1798(int i) {
		try {
			if (i != 1)
				method1803(17, -35, 86);
			anInt3926++;
			if ((anInt3940 ^ 0xffffffff) != (anInt3939 ^ 0xffffffff))
				throw new RuntimeException(
						"Can only retrieve a full image cache");
			for (int i_1_ = 0; (anInt3939 ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++)
				aClass11_Sub5Array3941[i_1_] = Class72_Sub3.aClass11_Sub5_7315;
			return anIntArrayArrayArray3929;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qj.I(" + i + ')');
		}
	}

	final int[][] method1799(int i, int i_2_) {
		try {
			anInt3942++;
			if (i != 0)
				aClass84_3933 = null;
			if (anInt3940 == anInt3939) {
				((Class291) this).aBool3943 = aClass11_Sub5Array3941[i_2_] == null;
				aClass11_Sub5Array3941[i_2_] = Class72_Sub3.aClass11_Sub5_7315;
				return anIntArrayArrayArray3929[i_2_];
			}
			if ((anInt3939 ^ 0xffffffff) == -2) {
				((Class291) this).aBool3943 = i_2_ != anInt3928;
				anInt3928 = i_2_;
				return anIntArrayArrayArray3929[0];
			}
			Class11_Sub5 class11_sub5 = aClass11_Sub5Array3941[i_2_];
			if (class11_sub5 == null) {
				((Class291) this).aBool3943 = true;
				if (anInt3937 < anInt3939) {
					class11_sub5 = new Class11_Sub5(i_2_, anInt3937);
					anInt3937++;
				} else {
					Class11_Sub5 class11_sub5_3_ = (Class11_Sub5) aClass84_3933
							.method582(110);
					class11_sub5 = new Class11_Sub5(i_2_,
							(((Class11_Sub5) class11_sub5_3_).anInt5241));
					aClass11_Sub5Array3941[(((Class11_Sub5) class11_sub5_3_).anInt5242)] = null;
					class11_sub5_3_.method122(-92);
				}
				aClass11_Sub5Array3941[i_2_] = class11_sub5;
			} else
				((Class291) this).aBool3943 = false;
			aClass84_3933.method588(class11_sub5, -39);
			return (anIntArrayArrayArray3929[((Class11_Sub5) class11_sub5).anInt5241]);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qj.E(" + i + ','
					+ i_2_ + ')');
		}
	}

	static final void method1800(String[] strings, int i, boolean bool,
			short[] is, int i_4_) {
		do {
			try {
				if (bool == true) {
					anInt3936++;
					if ((i ^ 0xffffffff) >= (i_4_ ^ 0xffffffff))
						break;
					int i_5_ = (i_4_ + i) / 2;
					int i_6_ = i_4_;
					String string = strings[i_5_];
					strings[i_5_] = strings[i];
					strings[i] = string;
					short i_7_ = is[i_5_];
					is[i_5_] = is[i];
					is[i] = i_7_;
					for (int i_8_ = i_4_; (i ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++) {
						if (string == null
								|| (strings[i_8_] != null && ((i_8_ & 0x1 ^ 0xffffffff) < (strings[i_8_]
										.compareTo(string) ^ 0xffffffff)))) {
							String string_9_ = strings[i_8_];
							strings[i_8_] = strings[i_6_];
							strings[i_6_] = string_9_;
							short i_10_ = is[i_8_];
							is[i_8_] = is[i_6_];
							is[i_6_++] = i_10_;
						}
					}
					strings[i] = strings[i_6_];
					strings[i_6_] = string;
					is[i] = is[i_6_];
					is[i_6_] = i_7_;
					method1800(strings, i_6_ - 1, true, is, i_4_);
					method1800(strings, i, true, is, i_6_ + 1);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("qj.G("
						+ (strings != null ? "{...}" : "null") + ',' + i + ','
						+ bool + ',' + (is != null ? "{...}" : "null") + ','
						+ i_4_ + ')'));
			}
			break;
		} while (false);
	}

	static final Class11_Sub6_Sub2 method1801(
			Class11_Sub6_Sub2 class11_sub6_sub2, byte i) {
		try {
			anInt3927++;
			Class11_Sub6_Sub2 class11_sub6_sub2_11_ = (class11_sub6_sub2 != null ? new Class11_Sub6_Sub2(
					class11_sub6_sub2) : new Class11_Sub6_Sub2());
			class11_sub6_sub2_11_.method3492(i ^ ~0x9, 128, 9);
			if (i != 9)
				aColorArray3931 = null;
			return class11_sub6_sub2_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qj.H("
					+ (class11_sub6_sub2 != null ? "{...}" : "null") + ',' + i
					+ ')');
		}
	}

	final void method1802(int i) {
		try {
			anInt3930++;
			for (int i_12_ = 0; anInt3939 > i_12_; i_12_++) {
				anIntArrayArrayArray3929[i_12_][0] = null;
				anIntArrayArrayArray3929[i_12_][1] = null;
				anIntArrayArrayArray3929[i_12_][2] = null;
				anIntArrayArrayArray3929[i_12_] = null;
			}
			aClass11_Sub5Array3941 = null;
			anIntArrayArrayArray3929 = null;
			if (i == -12665) {
				aClass84_3933.method586((byte) -19);
				aClass84_3933 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qj.F(" + i + ')');
		}
	}

	static final void method1803(int i, int i_13_, int i_14_) {
		Class364 class364 = Class181.aClass364ArrayArrayArray2336[i][i_13_][i_14_];
		if (class364 != null) {
			Class351.method2105(((Class364) class364).aClass376_Sub7_Sub2_4777);
			if (((Class364) class364).aClass376_Sub7_Sub2_4777 != null)
				((Class364) class364).aClass376_Sub7_Sub2_4777 = null;
		}
	}

	Class291(int i, int i_15_, int i_16_) {
		aClass84_3933 = new Class84();
		((Class291) this).aBool3943 = false;
		try {
			anInt3940 = i_15_;
			anInt3939 = i;
			anIntArrayArrayArray3929 = new int[anInt3939][3][i_16_];
			aClass11_Sub5Array3941 = new Class11_Sub5[anInt3940];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qj.<init>(" + i + ','
					+ i_15_ + ',' + i_16_ + ')'));
		}
	}

	static {
		aColorArray3931 = new Color[] { new Color(16777215),
				new Color(16777215), new Color(16741381), new Color(16741381) };
		aClass9_3944 = new Class9(0, 1);
	}
}
