/* Class11_Sub45_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub45_Sub5 extends Class11_Sub45 {
	String aString8756;
	boolean aBool8757;
	int anInt8758;
	int anInt8759;
	int anInt8760;
	boolean aBool8761;
	int anInt8762;
	long aLong8763;
	String aString8764;
	static int anInt8765;
	static int anInt8766;
	String aString8767;
	boolean aBool8768;
	int anInt8769;
	static int anInt8770;
	long aLong8771;
	static IComponentDefinitions[][] aClass192ArrayArray8772;
	static int anInt8773;

	public static void method3434(boolean bool) {
		do {
			try {
				aClass192ArrayArray8772 = null;
				if (bool == true)
					break;
				method3436(-126);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "be.D(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method3435(int i, int i_0_, Class163 class163, int i_1_) {
		try {
			anInt8773++;
			if ((i_0_ ^ 0xffffffff) <= -1 && (i_1_ ^ 0xffffffff) <= -1
					&& Class11_Sub50_Sub2.anInt9081 != 0
					&& Class248.anInt3354 != 0) {
				Class33 class33;
				int i_2_;
				int i_3_;
				int i_4_;
				int i_5_;
				int i_6_;
				int i_7_;
				if (!Class11_Sub2_Sub19.aBool9087) {
					class163.DA(Class218.anInt3005,
							Class11_Sub2_Sub2.anInt8459,
							Class11_Sub50_Sub2.anInt9081, Class248.anInt3354);
					i_4_ = Class248.anInt3354;
					i_5_ = Class11_Sub2_Sub2.anInt8459;
					i_3_ = Class218.anInt3005;
					i_2_ = Class11_Sub50_Sub2.anInt9081;
					class163.KA(Class204.anInt2748, Class11_Sub18.anInt5792,
							Class11_Sub50_Sub2.anInt9081, Class248.anInt3354);
					class33 = class163.method1041();
					class33.method300(Class14.anInt116, Class88.anInt1219,
							Class376_Sub3.anInt6117, Class195.anInt2655,
							Class125.anInt1687, Class30.anInt404);
					i_7_ = i_1_;
					class163.method1080(class33);
					i_6_ = i_0_;
				} else {
					Class63.method480(2, false);
					class33 = class163.method1045();
					int[] is = class163.Y();
					i_2_ = is[2];
					i_3_ = is[0];
					i_4_ = is[3];
					i_5_ = is[1];
					i_6_ = i_0_ + Class142.method896((byte) 41, false);
					i_7_ = i_1_ - -Class225.method1450(false, 0);
				}
				if (i_2_ == 0)
					i_2_ = 1;
				if (i_4_ == 0)
					i_4_ = 1;
				int i_8_ = 104 % ((12 - i) / 52);
				Class11_Sub45_Sub7.method3447(true, (byte) -99);
				if (Class11_Sub2_Sub38.aClass12Array9796 != null
						&& (!Class204.aBool2739 || (Class322.anInt4312 & 0x40) != 0)) {
					int i_9_ = -1;
					int i_10_ = -1;
					int i_11_ = class163.i();
					int i_12_ = class163.XA();
					int i_13_;
					int i_14_;
					int i_15_;
					int i_16_;
					if (Class11_Sub45_Sub1.aBool8490) {
						i_15_ = i_16_ = Class117.anInt1597 * (-i_3_ + i_6_)
								/ i_2_;
						i_14_ = i_13_ = (i_7_ - i_5_) * Class117.anInt1597
								/ i_4_;
					} else {
						i_13_ = i_12_ * (-i_5_ + i_7_) / i_4_;
						i_14_ = (-i_5_ + i_7_) * i_11_ / i_4_;
						i_15_ = i_11_ * (-i_3_ + i_6_) / i_2_;
						i_16_ = i_12_ * (-i_3_ + i_6_) / i_2_;
					}
					int[] is = { i_15_, i_14_, i_11_ };
					int[] is_17_ = { i_16_, i_13_, i_12_ };
					class33.method302(is);
					class33.method302(is_17_);
					float f = Class85.method595((float) is[2],
							(float) is_17_[1], (float) is[1], (float) is[0],
							(float) is_17_[2], 94, (float) is_17_[0], 4);
					if (f > 0.0F) {
						int i_18_ = is_17_[0] - is[0];
						int i_19_ = is_17_[2] + -is[2];
						int i_20_ = (int) ((float) is[0] + (float) i_18_ * f);
						int i_21_ = (int) (f * (float) i_19_ + (float) is[2]);
						i_9_ = (-1
								+ Class11_Sub2_Sub8.myPlayer
										.method3968((byte) 127) << 8)
								+ i_20_ >> 9;
						i_10_ = (Class11_Sub2_Sub8.myPlayer
								.method3968((byte) 127) - 1 << 8) + i_21_ >> 9;
						int i_22_ = (((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047);
						if (i_22_ < 3
								&& (0x2 & (Class11_Sub45_Sub17.aByteArrayArrayArray9509[1][i_20_ >> 9][i_21_ >> 9])) != 0)
							i_22_++;
					}
					if (i_9_ != -1 && (i_10_ ^ 0xffffffff) != 0) {
						if (!Class204.aBool2739
								|| (0x40 & Class322.anInt4312 ^ 0xffffffff) == -1) {
							if (Class234_Sub1.aBool5643)
								Class108_Sub22
										.method2963(
												false,
												i_10_,
												-1,
												(Class26.aClass26_303
														.method217(
																(byte) 122,
																Class11_Sub45_Sub1_Sub2.anInt9884)),
												true, -1, true, 11,
												(long) (i_10_ | i_9_ << 0), 0L,
												"", i_9_, 0);
							Class108_Sub22
									.method2963(false, i_10_, -1,
											Class170.aString2181, true,
											Class240.anInt3263, true, 21,
											(long) (i_10_ | i_9_ << 0), 0L, "",
											i_9_, 0);
							Class325.anInt4331++;
						} else {
							IComponentDefinitions class192 = Class146
									.method913(Class163.anInt2113, (byte) 102,
											Class120.anInt1631);
							if (class192 == null)
								method3436(-1);
							else
								Class108_Sub22.method2963(false, i_10_, -1,
										Class374.aString4890, true,
										Class11_Sub2_Sub15.anInt9021, true, 5,
										(long) (i_10_ | i_9_ << 0), 0L, " ->",
										i_9_, 0);
						}
					}
				}
				if (Class11_Sub2_Sub19.aBool9087)
					Class52.method437((byte) 84);
				for (int i_23_ = 0; (((!Class11_Sub2_Sub19.aBool9087 ? 1 : 2) ^ 0xffffffff) < (i_23_ ^ 0xffffffff)); i_23_++) {
					boolean bool = (i_23_ ^ 0xffffffff) == -1;
					Class103 class103 = (!bool ? Class142.aClass103_1921
							: Class206.aClass103_2779);
					int i_24_ = i_0_;
					int i_25_ = i_1_;
					if (Class11_Sub2_Sub19.aBool9087) {
						Class63.method480(2, bool);
						i_24_ += Class142.method896((byte) 41, bool);
						i_25_ += Class225.method1450(bool, 0);
					}
					Class131 class131 = ((Class103) class103).aClass131_1369;
					for (Class376_Sub5 class376_sub5 = (Class376_Sub5) class131
							.method847(-31182); class376_sub5 != null; class376_sub5 = (Class376_Sub5) class131
							.method856(33)) {
						if ((Class108_Sub28.aBool7901 || (((Class376_Sub7) (((Class376_Sub5) class376_sub5).aClass376_Sub7_6917)).aByte7047 == (((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047)))
								&& class376_sub5.method2800(i_25_, class163,
										(byte) -122, i_24_)) {
							boolean bool_26_ = false;
							boolean bool_27_ = false;
							int i_28_;
							int i_29_;
							if (!((((Class376_Sub5) class376_sub5).aClass376_Sub7_6917) instanceof Class376_Sub7_Sub5)) {
								i_29_ = ((Class376_Sub7) (((Class376_Sub5) class376_sub5).aClass376_Sub7_6917)).anInt7045 >> 9;
								i_28_ = ((Class376_Sub7) (((Class376_Sub5) class376_sub5).aClass376_Sub7_6917)).anInt7031 >> 9;
							} else {
								i_28_ = ((Class376_Sub7_Sub5) (Class376_Sub7_Sub5) (((Class376_Sub5) class376_sub5).aClass376_Sub7_6917)).aShort9629;
								i_29_ = ((Class376_Sub7_Sub5) (Class376_Sub7_Sub5) (((Class376_Sub5) class376_sub5).aClass376_Sub7_6917)).aShort9626;
							}
							if ((((Class376_Sub5) class376_sub5).aClass376_Sub7_6917) instanceof Player) {
								Player class376_sub7_sub5_sub5_sub1 = ((Player) (((Class376_Sub5) class376_sub5).aClass376_Sub7_6917));
								int i_30_ = class376_sub7_sub5_sub5_sub1
										.method3968((byte) 127);
								if (((0x1 & i_30_ ^ 0xffffffff) == -1
										&& ((((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7045) & 0x1ff ^ 0xffffffff) == -1 && ((((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7031) & 0x1ff) == 0)
										|| ((i_30_ & 0x1) == 1
												&& (0x1ff & (((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7045)) == 256 && (0x1ff & (((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7031)) == 256)) {
									int i_31_ = ((((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7045) - (-1
											+ class376_sub7_sub5_sub5_sub1
													.method3968((byte) 127) << 8));
									int i_32_ = ((((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7031) + -((-1 + class376_sub7_sub5_sub5_sub1
											.method3968((byte) 127)) << 8));
									for (int i_33_ = 0; ((Class23.anInt249 ^ 0xffffffff) < (i_33_ ^ 0xffffffff)); i_33_++) {
										Class11_Sub25 class11_sub25 = ((Class11_Sub25) (Class11_Sub2_Sub25.aClass213_9322
												.method1369(
														(byte) 26,
														(long) (Class11_Sub52.anIntArray8054[i_33_]))));
										if (class11_sub25 != null) {
											Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) class11_sub25).aNpc_2373);
											if (((Class11_Sub25.anInt6279 ^ 0xffffffff) != ((((Actor) class376_sub7_sub5_sub5_sub2).anInt10300) ^ 0xffffffff))
													&& (((Actor) class376_sub7_sub5_sub5_sub2).aBool10331)) {
												int i_34_ = ((((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7045) + -((-1 + (((NPCDefinitions) (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501)).anInt2975)) << 8));
												int i_35_ = (-((-1 + (((NPCDefinitions) (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501)).anInt2975)) << 8) + (((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7031));
												if (i_31_ <= i_34_
														&& (((((NPCDefinitions) (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501)).anInt2975) ^ 0xffffffff) >= (((class376_sub7_sub5_sub5_sub1
																.method3968((byte) 127)) + -(-i_31_
																+ i_34_ >> 9)) ^ 0xffffffff))
														&& i_35_ >= i_32_
														&& ((((NPCDefinitions) (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501)).anInt2975) <= (-(-i_32_
																+ i_35_ >> 9) + (class376_sub7_sub5_sub5_sub1
																	.method3968((byte) 127))))) {
													Class163_Sub2_Sub1
															.method3403(
																	class376_sub7_sub5_sub5_sub2,
																	(((((Class376_Sub7) (((Class376_Sub5) class376_sub5).aClass376_Sub7_6917)).aByte7047) ^ 0xffffffff) != ((((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047) ^ 0xffffffff)),
																	3415);
													((Actor) class376_sub7_sub5_sub5_sub2).anInt10300 = (Class11_Sub25.anInt6279);
												}
											}
										}
									}
									int i_36_ = Class190.anInt2446;
									int[] is = Class6.anIntArray40;
									for (int i_37_ = 0; ((i_36_ ^ 0xffffffff) < (i_37_ ^ 0xffffffff)); i_37_++) {
										Player class376_sub7_sub5_sub5_sub1_38_ = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[is[i_37_]]);
										if ((class376_sub7_sub5_sub5_sub1_38_ != null)
												&& (Class11_Sub25.anInt6279 != (((Actor) class376_sub7_sub5_sub5_sub1_38_).anInt10300))
												&& (class376_sub7_sub5_sub5_sub1 != class376_sub7_sub5_sub5_sub1_38_)
												&& (((Actor) class376_sub7_sub5_sub5_sub1_38_).aBool10331)) {
											int i_39_ = ((((Class376_Sub7) class376_sub7_sub5_sub5_sub1_38_).anInt7045) - ((class376_sub7_sub5_sub5_sub1_38_
													.method3968((byte) 127)) - 1 << 8));
											int i_40_ = ((((Class376_Sub7) class376_sub7_sub5_sub5_sub1_38_).anInt7031) - ((-1 + (class376_sub7_sub5_sub5_sub1_38_
													.method3968((byte) 127))) << 8));
											if (((i_31_ ^ 0xffffffff) >= (i_39_ ^ 0xffffffff))
													&& ((class376_sub7_sub5_sub5_sub1_38_
															.method3968((byte) 127) ^ 0xffffffff) >= ((-(-i_31_
															+ i_39_ >> 9) + (class376_sub7_sub5_sub5_sub1
																.method3968((byte) 127))) ^ 0xffffffff))
													&& i_40_ >= i_32_
													&& ((class376_sub7_sub5_sub5_sub1_38_
															.method3968((byte) 127) ^ 0xffffffff) >= ((-(i_40_
															- i_32_ >> 9) + (class376_sub7_sub5_sub5_sub1
																.method3968((byte) 127))) ^ 0xffffffff))) {
												Class11_Sub49
														.method3224(
																(((((Class376_Sub7) (((Class376_Sub5) class376_sub5).aClass376_Sub7_6917)).aByte7047) ^ 0xffffffff) != ((((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047) ^ 0xffffffff)),
																(byte) 107,
																class376_sub7_sub5_sub5_sub1_38_);
												((Actor) class376_sub7_sub5_sub5_sub1_38_).anInt10300 = Class11_Sub25.anInt6279;
											}
										}
									}
								}
								if (((Actor) class376_sub7_sub5_sub5_sub1).anInt10300 == Class11_Sub25.anInt6279)
									continue;
								Class11_Sub49
										.method3224(
												(((((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047) ^ 0xffffffff) != (((Class376_Sub7) (((Class376_Sub5) class376_sub5).aClass376_Sub7_6917)).aByte7047 ^ 0xffffffff)),
												(byte) 119,
												class376_sub7_sub5_sub5_sub1);
								((Actor) class376_sub7_sub5_sub5_sub1).anInt10300 = Class11_Sub25.anInt6279;
							}
							if ((((Class376_Sub5) class376_sub5).aClass376_Sub7_6917) instanceof Npc) {
								Npc class376_sub7_sub5_sub5_sub2 = ((Npc) (((Class376_Sub5) class376_sub5).aClass376_Sub7_6917));
								if ((((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501) != null) {
									if ((((0x1 & ((NPCDefinitions) (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501)).anInt2975) ^ 0xffffffff) == -1
											&& ((((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7045) & 0x1ff ^ 0xffffffff) == -1 && ((((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7031) & 0x1ff ^ 0xffffffff) == -1)
											|| ((((NPCDefinitions) (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501)).anInt2975 & 0x1) == 1
													&& ((((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7045) & 0x1ff ^ 0xffffffff) == -257 && ((((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7031) & 0x1ff) == 256)) {
										int i_41_ = (-((-1 + (((NPCDefinitions) (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501)).anInt2975)) << 8) + (((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7045));
										int i_42_ = ((((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7031) + -((-1 + (((NPCDefinitions) (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501)).anInt2975)) << 8));
										for (int i_43_ = 0; i_43_ < Class23.anInt249; i_43_++) {
											Class11_Sub25 class11_sub25 = ((Class11_Sub25) (Class11_Sub2_Sub25.aClass213_9322
													.method1369(
															(byte) 26,
															(long) (Class11_Sub52.anIntArray8054[i_43_]))));
											if (class11_sub25 != null) {
												Npc class376_sub7_sub5_sub5_sub2_44_ = (((Class11_Sub25) class11_sub25).aNpc_2373);
												if ((Class11_Sub25.anInt6279 != (((Actor) class376_sub7_sub5_sub5_sub2_44_).anInt10300))
														&& (class376_sub7_sub5_sub5_sub2_44_ != class376_sub7_sub5_sub5_sub2)
														&& (((Actor) class376_sub7_sub5_sub5_sub2_44_).aBool10331)) {
													int i_45_ = ((((Class376_Sub7) class376_sub7_sub5_sub5_sub2_44_).anInt7045) + -((((NPCDefinitions) (((Npc) class376_sub7_sub5_sub5_sub2_44_).aClass215_10501)).anInt2975) - 1 << 8));
													int i_46_ = (-((((NPCDefinitions) (((Npc) class376_sub7_sub5_sub5_sub2_44_).aClass215_10501)).anInt2975) - 1 << 8) + (((Class376_Sub7) class376_sub7_sub5_sub5_sub2_44_).anInt7031));
													if (((i_41_ ^ 0xffffffff) >= (i_45_ ^ 0xffffffff))
															&& ((((((NPCDefinitions) (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501)).anInt2975) + -((-i_41_ + i_45_) >> 9)) ^ 0xffffffff) <= ((((NPCDefinitions) (((Npc) class376_sub7_sub5_sub5_sub2_44_).aClass215_10501)).anInt2975) ^ 0xffffffff))
															&& i_46_ >= i_42_
															&& ((((NPCDefinitions) (((Npc) class376_sub7_sub5_sub5_sub2_44_).aClass215_10501)).anInt2975) <= (-((i_46_ + -i_42_) >> 9) + (((NPCDefinitions) (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501)).anInt2975)))) {
														Class163_Sub2_Sub1
																.method3403(
																		class376_sub7_sub5_sub5_sub2_44_,
																		(((((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047) ^ 0xffffffff) != ((((Class376_Sub7) (((Class376_Sub5) class376_sub5).aClass376_Sub7_6917)).aByte7047) ^ 0xffffffff)),
																		3415);
														((Actor) class376_sub7_sub5_sub5_sub2_44_).anInt10300 = (Class11_Sub25.anInt6279);
													}
												}
											}
										}
										int i_47_ = Class190.anInt2446;
										int[] is = Class6.anIntArray40;
										for (int i_48_ = 0; i_47_ > i_48_; i_48_++) {
											Player class376_sub7_sub5_sub5_sub1 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[is[i_48_]]);
											if ((class376_sub7_sub5_sub5_sub1 != null)
													&& (Class11_Sub25.anInt6279 != (((Actor) class376_sub7_sub5_sub5_sub1).anInt10300))
													&& (((Actor) class376_sub7_sub5_sub5_sub1).aBool10331)) {
												int i_49_ = ((((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7045) - ((class376_sub7_sub5_sub5_sub1
														.method3968((byte) 127)) - 1 << 8));
												int i_50_ = ((((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7031) + -((-1 + (class376_sub7_sub5_sub5_sub1
														.method3968((byte) 127))) << 8));
												if (((i_41_ ^ 0xffffffff) >= (i_49_ ^ 0xffffffff))
														&& ((class376_sub7_sub5_sub5_sub1
																.method3968((byte) 127)) <= ((((NPCDefinitions) (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501)).anInt2975) + -(-i_41_
																+ i_49_ >> 9)))
														&& ((i_42_ ^ 0xffffffff) >= (i_50_ ^ 0xffffffff))
														&& (((class376_sub7_sub5_sub5_sub1
																.method3968((byte) 127)) ^ 0xffffffff) >= ((-(i_50_
																- i_42_ >> 9) + (((NPCDefinitions) (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501)).anInt2975)) ^ 0xffffffff))) {
													Class11_Sub49
															.method3224(
																	(((((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047) ^ 0xffffffff) != ((((Class376_Sub7) (((Class376_Sub5) class376_sub5).aClass376_Sub7_6917)).aByte7047) ^ 0xffffffff)),
																	(byte) 119,
																	class376_sub7_sub5_sub5_sub1);
													((Actor) class376_sub7_sub5_sub5_sub1).anInt10300 = (Class11_Sub25.anInt6279);
												}
											}
										}
									}
									if ((Class11_Sub25.anInt6279 ^ 0xffffffff) == ((((Actor) class376_sub7_sub5_sub5_sub2).anInt10300) ^ 0xffffffff))
										continue;
									Class163_Sub2_Sub1
											.method3403(
													class376_sub7_sub5_sub5_sub2,
													((((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047) != (((Class376_Sub7) (((Class376_Sub5) class376_sub5).aClass376_Sub7_6917)).aByte7047)),
													3415);
									((Actor) class376_sub7_sub5_sub5_sub2).anInt10300 = Class11_Sub25.anInt6279;
								}
							}
							if ((((Class376_Sub5) class376_sub5).aClass376_Sub7_6917) instanceof Class376_Sub7_Sub1_Sub1) {
								int i_51_ = i_29_ + Class194.anInt2641;
								int i_52_ = i_28_ + Class118.anInt1605;
								Class11_Sub27 class11_sub27 = ((Class11_Sub27) (Class106.aClass213_1433
										.method1369(
												(byte) 26,
												(long) ((((Class376_Sub7) (((Class376_Sub5) class376_sub5).aClass376_Sub7_6917)).aByte7047) << 28
														| i_52_ << 14 | i_51_))));
								if (class11_sub27 != null) {
									int i_53_ = 0;
									Class11_Sub36 class11_sub36 = ((Class11_Sub36) ((Class11_Sub27) class11_sub27).aClass84_6554
											.method582(127));
									while (class11_sub36 != null) {
										Class249 class249 = (Packet.aClass223_8723
												.method1430(
														((Class11_Sub36) class11_sub36).anInt7081,
														false));
										if (Class204.aBool2739
												&& ((((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047) == (((Class376_Sub7) (((Class376_Sub5) class376_sub5).aClass376_Sub7_6917)).aByte7047))) {
											Class283 class283 = ((Class254_Sub3.anInt8048 != -1) ? (Class187.aClass52_2388
													.method432(
															Class254_Sub3.anInt8048,
															(byte) -81))
													: null);
											if ((0x1 & Class322.anInt4312 ^ 0xffffffff) != -1
													&& (class283 == null || (((class249
															.method1593(
																	(((Class283) class283).anInt3827),
																	(Class254_Sub3.anInt8048),
																	91)) ^ 0xffffffff) != ((((Class283) class283).anInt3827) ^ 0xffffffff)))) {
												Class335_Sub3.anInt7793++;
												Class108_Sub22
														.method2963(
																false,
																i_28_,
																-1,
																Class374.aString4890,
																false,
																(Class11_Sub2_Sub15.anInt9021),
																true,
																9,
																(long) i_53_,
																(long) (((Class11_Sub36) class11_sub36).anInt7081),
																(Class250.aString3444
																		+ " -> <col=ff9040>" + (((Class249) class249).aString3359)),
																i_29_, 0);
											}
										}
										if (((((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047) ^ 0xffffffff) == ((((Class376_Sub7) (((Class376_Sub5) class376_sub5).aClass376_Sub7_6917)).aByte7047) ^ 0xffffffff)) {
											String[] strings = (((Class249) class249).aStringArray3360);
											for (int i_54_ = 4; i_54_ >= 0; i_54_--) {
												if (strings != null
														&& (strings[i_54_] != null)) {
													int i_55_ = 0;
													if (i_54_ == 0)
														i_55_ = 45;
													int i_56_ = (Class11_Sub18.anInt5794);
													if (i_54_ == 1)
														i_55_ = 17;
													if (i_54_ == 2)
														i_55_ = 47;
													if ((i_54_ ^ 0xffffffff) == -4)
														i_55_ = 10;
													if ((((Class249) class249).anInt3403) == i_54_)
														i_56_ = (((Class249) class249).anInt3425);
													if ((i_54_ ^ 0xffffffff) == -5)
														i_55_ = 57;
													if (i_54_ == (((Class249) class249).anInt3391))
														i_56_ = (((Class249) class249).anInt3375);
													Class108_Sub22
															.method2963(
																	false,
																	i_28_,
																	-1,
																	strings[i_54_],
																	false,
																	i_56_,
																	true,
																	i_55_,
																	(long) i_53_,
																	(long) (((Class11_Sub36) class11_sub36).anInt7081),
																	("<col=ff9040>" + (((Class249) class249).aString3359)),
																	i_29_, 0);
													Class2.anInt16++;
												}
											}
										}
										Class108_Sub22
												.method2963(
														(((((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047) ^ 0xffffffff) != ((((Class376_Sub7) (((Class376_Sub5) class376_sub5).aClass376_Sub7_6917)).aByte7047) ^ 0xffffffff)),
														i_28_,
														-1,
														(Class26.aClass26_298
																.method217(
																		(byte) 110,
																		(Class11_Sub45_Sub1_Sub2.anInt9884))),
														false,
														Class258.anInt3515,
														true,
														1006,
														(long) i_53_,
														(long) ((Class11_Sub36) class11_sub36).anInt7081,
														("<col=ff9040>" + (((Class249) class249).aString3359)),
														i_29_, 0);
										Class121.anInt1639++;
										class11_sub36 = ((Class11_Sub36) ((Class11_Sub27) class11_sub27).aClass84_6554
												.method579(true));
										i_53_++;
									}
								}
							}
							if ((((Class376_Sub5) class376_sub5).aClass376_Sub7_6917) instanceof Interface13) {
								Interface13 interface13 = ((Interface13) (((Class376_Sub5) class376_sub5).aClass376_Sub7_6917));
								Class42 class42 = (Class11_Sub4.aClass290_5237
										.method1793((byte) 113, interface13
												.method42((byte) -17)));
								if (((Class42) class42).anIntArray683 != null)
									class42 = class42.method380(
											(Class11_Sub26.aClass97_6296), 0);
								if (class42 != null) {
									if (Class204.aBool2739
											&& (((Class376_Sub7) (((Class376_Sub5) class376_sub5).aClass376_Sub7_6917)).aByte7047 == (((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047))) {
										Class283 class283 = ((Class254_Sub3.anInt8048 ^ 0xffffffff) != 0 ? (Class187.aClass52_2388
												.method432(
														Class254_Sub3.anInt8048,
														(byte) -124))
												: null);
										if ((0x4 & Class322.anInt4312) != 0
												&& (class283 == null || ((class42
														.method374(
																Class254_Sub3.anInt8048,
																102,
																(((Class283) class283).anInt3827))) != (((Class283) class283).anInt3827)))) {
											Class108_Sub22
													.method2963(
															false,
															i_28_,
															-1,
															Class374.aString4890,
															false,
															Class11_Sub2_Sub15.anInt9021,
															true,
															51,
															(long) interface13
																	.hashCode(),
															(Class200
																	.method1287(
																			-110,
																			i_29_,
																			interface13,
																			i_28_)),
															(Class250.aString3444
																	+ " -> <col=00ffff>" + (((Class42) class42).aString606)),
															i_29_, 0);
											Class108_Sub26.anInt7824++;
										}
									}
									if (((((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047) ^ 0xffffffff) == (((Class376_Sub7) (((Class376_Sub5) class376_sub5).aClass376_Sub7_6917)).aByte7047 ^ 0xffffffff)) {
										String[] strings = (((Class42) class42).aStringArray599);
										if (strings != null) {
											for (int i_57_ = 4; i_57_ >= 0; i_57_--) {
												if (strings[i_57_] != null) {
													int i_58_ = 0;
													if (i_57_ == 0)
														i_58_ = 3;
													int i_59_ = (Class11_Sub18.anInt5794);
													if ((i_57_ ^ 0xffffffff) == -2)
														i_58_ = 13;
													if ((i_57_ ^ 0xffffffff) == -3)
														i_58_ = 58;
													if ((i_57_ ^ 0xffffffff) == -4)
														i_58_ = 8;
													if ((i_57_ ^ 0xffffffff) == -5)
														i_58_ = 1001;
													if ((i_57_ ^ 0xffffffff) == (((Class42) class42).anInt605 ^ 0xffffffff))
														i_59_ = (((Class42) class42).anInt666);
													if ((i_57_ ^ 0xffffffff) == (((Class42) class42).anInt661 ^ 0xffffffff))
														i_59_ = (((Class42) class42).anInt647);
													Class212.anInt2882++;
													Class108_Sub22
															.method2963(
																	false,
																	i_28_,
																	-1,
																	strings[i_57_],
																	false,
																	i_59_,
																	true,
																	i_58_,
																	(long) (interface13
																			.hashCode()),
																	(Class200
																			.method1287(
																					-77,
																					i_29_,
																					interface13,
																					i_28_)),
																	("<col=00ffff>" + (((Class42) class42).aString606)),
																	i_29_, 0);
												}
											}
										}
										Class66.anInt946++;
										Class108_Sub22
												.method2963(
														((((Class376_Sub7) (((Class376_Sub5) class376_sub5).aClass376_Sub7_6917)).aByte7047) != (((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047)),
														i_28_,
														-1,
														(Class26.aClass26_298
																.method217(
																		(byte) 86,
																		(Class11_Sub45_Sub1_Sub2.anInt9884))),
														false,
														Class258.anInt3515,
														true,
														1004,
														(long) interface13
																.hashCode(),
														(long) (((Class42) class42).anInt693),
														("<col=00ffff>" + (((Class42) class42).aString606)),
														i_29_, 0);
									}
								}
							}
						}
					}
					if (Class11_Sub2_Sub19.aBool9087)
						Class52.method437((byte) 113);
				}
				Class11_Sub45_Sub7.method3447(false, (byte) 106);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("be.C(" + i + ','
					+ i_0_ + ',' + (class163 != null ? "{...}" : "null") + ','
					+ i_1_ + ')'));
		}
	}

	static final void method3436(int i) {
		do {
			try {
				anInt8770++;
				if (Class204.aBool2739) {
					IComponentDefinitions class192 = Class146
							.method913(Class163.anInt2113, (byte) -102,
									Class120.anInt1631);
					if (class192 != null
							&& ((IComponentDefinitions) class192).anObjectArray2527 != null) {
						Class11_Sub48 class11_sub48 = new Class11_Sub48();
						((Class11_Sub48) class11_sub48).parameters = ((IComponentDefinitions) class192).anObjectArray2527;
						((Class11_Sub48) class11_sub48).aClass192_7999 = class192;
						Class86.method610(class11_sub48);
					}
					Class325.anInt4329 = i;
					Class11_Sub2_Sub22.anInt9206 = -1;
					Class204.aBool2739 = false;
					if (class192 == null)
						break;
					Class232.method1484(class192, i + 2);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "be.B(" + i + ')');
			}
			break;
		} while (false);
	}

	Class11_Sub45_Sub5(String string, String string_60_, int i, int i_61_,
			int i_62_, long l, int i_63_, int i_64_, boolean bool,
			boolean bool_65_, long l_66_, boolean bool_67_) {
		try {
			((Class11_Sub45_Sub5) this).anInt8760 = i_61_;
			((Class11_Sub45_Sub5) this).aBool8761 = bool_67_;
			((Class11_Sub45_Sub5) this).anInt8758 = i_63_;
			((Class11_Sub45_Sub5) this).aBool8768 = bool_65_;
			((Class11_Sub45_Sub5) this).anInt8759 = i_62_;
			((Class11_Sub45_Sub5) this).anInt8769 = i;
			((Class11_Sub45_Sub5) this).aBool8757 = bool;
			((Class11_Sub45_Sub5) this).aLong8771 = l;
			((Class11_Sub45_Sub5) this).aLong8763 = l_66_;
			((Class11_Sub45_Sub5) this).anInt8762 = i_64_;
			((Class11_Sub45_Sub5) this).aString8767 = string_60_;
			((Class11_Sub45_Sub5) this).aString8756 = string;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("be.<init>("
					+ (string != null ? "{...}" : "null") + ','
					+ (string_60_ != null ? "{...}" : "null") + ',' + i + ','
					+ i_61_ + ',' + i_62_ + ',' + l + ',' + i_63_ + ',' + i_64_
					+ ',' + bool + ',' + bool_65_ + ',' + l_66_ + ','
					+ bool_67_ + ')'));
		}
	}

	static final boolean method3437(byte i, int i_68_, int i_69_) {
		try {
			if (i != 33)
				method3438(123);
			anInt8766++;
			return (i_69_ & 0x18 ^ 0xffffffff) != -1 | (i_69_ & 0x220) == 544;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("be.E(" + i + ','
					+ i_68_ + ',' + i_69_ + ')'));
		}
	}

	static final void method3438(int i) {
		try {
			if (i != -1)
				method3437((byte) 110, 97, -102);
			anInt8765++;
			Class11_Sub45_Sub16_Sub2.aClass22_10164.method190(0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "be.A(" + i + ')');
		}
	}
}
