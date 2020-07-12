/* Class183 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class183 {
	static int[] anIntArray2362;
	static int anInt2363;
	static int[][] anIntArrayArray2364 = new int[128][128];
	static int anInt2365;
	static OutgoingPacket aClass370_2366 = new OutgoingPacket(61, 6);
	static int anInt2367;
	static int anInt2368;

	public static void method1199(boolean bool) {
		try {
			if (bool != true)
				anInt2368 = 76;
			anIntArrayArray2364 = null;
			aClass370_2366 = null;
			anIntArray2362 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ik.B(" + bool + ')');
		}
	}

	static final void method1200(int i, Class163 class163, int i_0_, int i_1_,
			IComponentDefinitions class192) {
		try {
			if (i_0_ == 1) {
				anInt2367++;
				Class72 class72 = class192.method1254((byte) 116, class163);
				if (class72 != null) {
					class163.KA(
							i_1_,
							i,
							((IComponentDefinitions) class192).anInt2610 + i_1_,
							((IComponentDefinitions) class192).anInt2546 + i);
					if (Class2_Sub1.anInt5068 != 2
							&& (Class2_Sub1.anInt5068 ^ 0xffffffff) != -6
							&& Class237.aClass253_3237 != null) {
						int i_2_;
						int i_3_;
						int i_4_;
						int i_5_;
						if ((Class191.anInt2453 ^ 0xffffffff) == -5) {
							i_4_ = Class201.anInt2713;
							i_3_ = 0x3fff & (int) -Class2_Sub8.aFloat6868;
							i_2_ = 4096;
							i_5_ = Class38.anInt508;
						} else {
							i_2_ = -(Class11_Sub45_Sub1.anInt8493 * 16) + 4096;
							i_3_ = 0x3fff & (Class328.anInt4371 + (int) -Class2_Sub8.aFloat6868);
							i_4_ = (((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7031);
							i_5_ = (((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7045);
						}
						int i_6_ = (i_5_ / 128
								+ (48 + -(2 * Class300.anInt4051)) + 208);
						int i_7_ = (Class108_Sub12.anInt6228 * 4 + 48 + (-(i_4_ / 128) + -(2 * (-104 + Class108_Sub12.anInt6228))));
						Class237.aClass253_3237
								.method1627(
										((float) ((IComponentDefinitions) class192).anInt2610 / 2.0F + (float) i_1_),
										((float) ((IComponentDefinitions) class192).anInt2546 / 2.0F + (float) i),
										(float) i_6_, (float) i_7_, i_2_,
										i_3_ << 2, class72, i_1_, i);
						for (Class11_Sub51 class11_sub51 = ((Class11_Sub51) Class361.aClass84_4700
								.method584(-12261)); class11_sub51 != null; class11_sub51 = (Class11_Sub51) Class361.aClass84_4700
								.method578(-15361)) {
							int i_8_ = ((Class11_Sub51) class11_sub51).anInt8036;
							int i_9_ = (((((Class342) Class204.aClass342_2749).anIntArray4533[i_8_]) >> 14 & 0x3fff) - Class194.anInt2641);
							int i_10_ = (-Class118.anInt1605 + ((((Class342) Class204.aClass342_2749).anIntArray4533[i_8_]) & 0x3fff));
							int i_11_ = 4 * i_9_ - (-2 + i_5_ / 128);
							int i_12_ = -(i_4_ / 128) + (4 * i_10_ + 2);
							Class47.method412(
									i_1_,
									(((Class342) Class204.aClass342_2749).anIntArray4534[i_8_]),
									i, class163, class192, class72, -13, i_12_,
									i_11_);
						}
						for (int i_13_ = 0; i_13_ < NPCDefinitions.anInt2906; i_13_++) {
							int i_14_ = (4 * Class277.anIntArray3744[i_13_] + 2 + -(i_5_ / 128));
							int i_15_ = (Class50.anIntArray782[i_13_] * 4 + (2 - i_4_ / 128));
							Class42 class42 = (Class11_Sub4.aClass290_5237
									.method1793((byte) -72,
											Class70.anIntArray981[i_13_]));
							if (((Class42) class42).anIntArray683 != null) {
								class42 = class42.method380(
										(Class11_Sub26.aClass97_6296), 0);
								if (class42 == null
										|| (((Class42) class42).anInt637 ^ 0xffffffff) == 0)
									continue;
							}
							Class47.method412(i_1_,
									((Class42) class42).anInt637, i, class163,
									class192, class72, i_0_ - 14, i_15_, i_14_);
						}
						for (Class11_Sub27 class11_sub27 = ((Class11_Sub27) Class106.aClass213_1433
								.method1365(24490)); class11_sub27 != null; class11_sub27 = ((Class11_Sub27) Class106.aClass213_1433
								.method1367((byte) 71))) {
							int i_16_ = (int) (0x3L & (((Class11) class11_sub27).aLong91 >> 28));
							if ((Class228.anInt3150 ^ 0xffffffff) == (i_16_ ^ 0xffffffff)) {
								int i_17_ = (-Class194.anInt2641 + (int) (0x3fffL & (((Class11) class11_sub27).aLong91)));
								int i_18_ = (-Class118.anInt1605 + (int) ((((Class11) class11_sub27).aLong91) >> 14 & 0x3fffL));
								int i_19_ = -(i_5_ / 128) + (2 + i_17_ * 4);
								int i_20_ = i_18_ * 4 - (-2 - -(i_4_ / 128));
								Class310.method1894(-123, i, i_19_, class72,
										(Class47.aClass253Array743[0]), i_20_,
										i_1_, class192);
							}
						}
						for (int i_21_ = 0; ((i_21_ ^ 0xffffffff) > (Class23.anInt249 ^ 0xffffffff)); i_21_++) {
							Class11_Sub25 class11_sub25 = ((Class11_Sub25) (Class11_Sub2_Sub25.aClass213_9322
									.method1369(
											(byte) 26,
											(long) (Class11_Sub52.anIntArray8054[i_21_]))));
							if (class11_sub25 != null) {
								Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) class11_sub25).aNpc_2373);
								if (class376_sub7_sub5_sub5_sub2
										.method4007(92160000)
										&& ((((Class376_Sub7) class376_sub7_sub5_sub5_sub2).aByte7047) == (((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047))) {
									NPCDefinitions class215 = (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501);
									if (class215 != null
											&& (((NPCDefinitions) class215).anIntArray2950) != null)
										class215 = (class215.method1375(
												(byte) 29,
												Class11_Sub26.aClass97_6296));
									if (class215 != null
											&& ((NPCDefinitions) class215).aBool2915
											&& ((NPCDefinitions) class215).aBool2970) {
										int i_22_ = (-(i_5_ / 128) + (((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7045) / 128);
										int i_23_ = (-(i_4_ / 128) + (((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7031) / 128);
										if (((NPCDefinitions) class215).anInt2964 != -1)
											Class47.method412(
													i_1_,
													(((NPCDefinitions) class215).anInt2964),
													i, class163, class192,
													class72, -13, i_23_, i_22_);
										else
											Class310.method1894(
													i_0_ ^ ~0x76,
													i,
													i_22_,
													class72,
													Class47.aClass253Array743[1],
													i_23_, i_1_, class192);
									}
								}
							}
						}
						int i_24_ = Class190.anInt2446;
						int[] is = Class6.anIntArray40;
						for (int i_25_ = 0; i_24_ > i_25_; i_25_++) {
							Player class376_sub7_sub5_sub5_sub1 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[is[i_25_]]);
							if (class376_sub7_sub5_sub5_sub1 != null
									&& class376_sub7_sub5_sub5_sub1
											.method3975(92160000)
									&& !((Player) class376_sub7_sub5_sub5_sub1).aBool10382
									&& ((Class11_Sub2_Sub8.myPlayer) != class376_sub7_sub5_sub5_sub1)
									&& (((Class376_Sub7) class376_sub7_sub5_sub5_sub1).aByte7047 == (((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047))) {
								int i_26_ = ((((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7045) / 128 - i_5_ / 128);
								int i_27_ = (-(i_4_ / 128) + (((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7031) / 128);
								boolean bool = false;
								for (int i_28_ = 0; Class94_Sub1.anInt5228 > i_28_; i_28_++) {
									if ((((Player) class376_sub7_sub5_sub5_sub1).aString10400
											.equals(Class109.aStringArray1476[i_28_]))
											&& (Class326.anIntArray4337[i_28_] ^ 0xffffffff) != -1) {
										bool = true;
										break;
									}
								}
								boolean bool_29_ = false;
								for (int i_30_ = 0; ((i_30_ ^ 0xffffffff) > (Class1_Sub1.anInt7124 ^ 0xffffffff)); i_30_++) {
									if (((Player) class376_sub7_sub5_sub5_sub1).aString10400
											.equals(((Class92) (Class81.aClass92Array1096[i_30_])).aString1243)) {
										bool_29_ = true;
										break;
									}
								}
								boolean bool_31_ = false;
								if (((((Player) (Class11_Sub2_Sub8.myPlayer)).anInt10422) ^ 0xffffffff) != -1
										&& ((((Player) class376_sub7_sub5_sub5_sub1).anInt10422) ^ 0xffffffff) != -1
										&& (((((Player) class376_sub7_sub5_sub5_sub1).anInt10422) ^ 0xffffffff) == ((((Player) (Class11_Sub2_Sub8.myPlayer)).anInt10422) ^ 0xffffffff)))
									bool_31_ = true;
								if (!((Player) class376_sub7_sub5_sub5_sub1).aBool10420) {
									if (bool)
										Class310.method1894(-128, i, i_26_,
												class72,
												(Class47.aClass253Array743[3]),
												i_27_, i_1_, class192);
									else if (bool_29_)
										Class310.method1894(-126, i, i_26_,
												class72,
												(Class47.aClass253Array743[5]),
												i_27_, i_1_, class192);
									else if (!bool_31_)
										Class310.method1894(-124, i, i_26_,
												class72,
												(Class47.aClass253Array743[2]),
												i_27_, i_1_, class192);
									else
										Class310.method1894(-115, i, i_26_,
												class72,
												(Class47.aClass253Array743[4]),
												i_27_, i_1_, class192);
								} else
									Class310.method1894(-119, i, i_26_,
											class72,
											(Class47.aClass253Array743[6]),
											i_27_, i_1_, class192);
							}
						}
						Class275[] class275s = IncomingPacket.aClass275Array2082;
						for (int i_32_ = 0; ((i_32_ ^ 0xffffffff) > (class275s.length ^ 0xffffffff)); i_32_++) {
							Class275 class275 = class275s[i_32_];
							if (class275 != null
									&& ((Class275) class275).anInt3697 != 0
									&& Class11_Sub25.anInt6279 % 20 < 10) {
								if (((Class275) class275).anInt3697 == 1) {
									Class11_Sub25 class11_sub25 = ((Class11_Sub25) (Class11_Sub2_Sub25.aClass213_9322
											.method1369(
													(byte) 26,
													(long) (((Class275) class275).anInt3707))));
									if (class11_sub25 != null) {
										Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) class11_sub25).aNpc_2373);
										int i_33_ = (-(i_5_ / 128) + (((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7045) / 128);
										int i_34_ = ((((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7031) / 128 - i_4_ / 128);
										Class236_Sub9
												.method3118(
														i_1_,
														2,
														i,
														((Class275) class275).anInt3695,
														i_34_, class192,
														360000L, class72, i_33_);
									}
								}
								if (((Class275) class275).anInt3697 == 2) {
									int i_35_ = (-(i_5_ / 128) + (((Class275) class275).anInt3704 / 128));
									int i_36_ = ((((Class275) class275).anInt3699 / 128) - i_4_ / 128);
									long l = (long) ((((Class275) class275).anInt3708) << 7);
									l *= l;
									Class236_Sub9.method3118(i_1_, 2, i,
											((Class275) class275).anInt3695,
											i_36_, class192, l, class72, i_35_);
								}
								if ((((Class275) class275).anInt3697 ^ 0xffffffff) == -11
										&& (((Class275) class275).anInt3707 ^ 0xffffffff) <= -1
										&& (((Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814).length ^ 0xffffffff) < (((Class275) class275).anInt3707 ^ 0xffffffff))) {
									Player class376_sub7_sub5_sub5_sub1 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[((Class275) class275).anInt3707]);
									if (class376_sub7_sub5_sub5_sub1 != null) {
										int i_37_ = ((((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7045) / 128 + -(i_5_ / 128));
										int i_38_ = (-(i_4_ / 128) + (((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7031) / 128);
										Class236_Sub9
												.method3118(
														i_1_,
														2,
														i,
														((Class275) class275).anInt3695,
														i_38_, class192,
														360000L, class72, i_37_);
									}
								}
							}
						}
						if ((Class191.anInt2453 ^ 0xffffffff) != -5) {
							if ((Class321.anInt4284 ^ 0xffffffff) != -1) {
								int i_39_ = (2 + (Class321.anInt4284 * 4 + (-(i_5_ / 128) - 2)) + (2 * Class11_Sub2_Sub8.myPlayer
										.method3968((byte) 127)));
								int i_40_ = (2 + 4 * Class220_Sub1.anInt7153 + (-(i_4_ / 128) - -(2 * (Class11_Sub2_Sub8.myPlayer
										.method3968((byte) 127) - 1))));
								Class310.method1894(
										-122,
										i,
										i_39_,
										class72,
										(Class347.aClass253Array4600[(Class11_Sub2_Sub3.aBool8473) ? 1
												: 0]), i_40_, i_1_, class192);
							}
							if (!((Player) (Class11_Sub2_Sub8.myPlayer)).aBool10382)
								class163.method1035(
										-1,
										-1
												+ (((IComponentDefinitions) class192).anInt2610 / 2 + i_1_),
										-1
												+ i
												- -(((IComponentDefinitions) class192).anInt2546 / 2),
										(byte) 126, 3, 3);
						}
					} else
						class163.A(-16777216, class72, i_1_, i);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("ik.A(" + i + ','
							+ (class163 != null ? "{...}" : "null") + ','
							+ i_0_ + ',' + i_1_ + ','
							+ (class192 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1201(int i) {
		try {
			synchronized (Class376_Sub1_Sub1.aClass22_8685) {
				Class376_Sub1_Sub1.aClass22_8685.method190(0);
				if (i != -1842)
					method1201(64);
			}
			anInt2365++;
			synchronized (Class186.aClass22_2379) {
				Class186.aClass22_2379.method190(0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ik.C(" + i + ')');
		}
	}

	public Class183() {
		/* empty */
	}

	public final String toString() {
		try {
			anInt2363++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ik.toString(" + ')');
		}
	}
}
