/* Class376_Sub7_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class376_Sub7_Sub2_Sub1 extends Class376_Sub7_Sub2 implements
		Interface13 {
	static int anInt10173;
	private byte aByte10174;
	private boolean aBool10175;
	private boolean aBool10176;
	static int anInt10177;
	static int anInt10178;
	private boolean aBool10179;
	static Class213 aClass213_10180;
	static int anInt10181;
	static int anInt10182;
	static int anInt10183;
	static int anInt10184;
	static int anInt10185;
	static int anInt10186;
	static int anInt10187;
	static int anInt10188;
	static int anInt10189;
	private Class11_Sub45_Sub1 aClass11_Sub45_Sub1_10190;
	private Class206 aClass206_10191;
	static int anInt10192;
	static int anInt10193;
	static int anInt10194;
	static int anInt10195;
	private Class212 aClass212_10196;
	static int anInt10197;
	private short aShort10198;
	static int anInt10199;
	static int anInt10200;
	static int anInt10201;
	static short aShort10202 = 256;
	static int anInt10203;
	static Class22 aClass22_10204;
	private boolean aBool10205;
	static int anInt10206;
	static Class118 aClass118_10207;
	static int[] anIntArray10208;
	static int anInt10209;
	/* synthetic */static Class aClass10210;

	final boolean method2870(boolean bool) {
		try {
			anInt10194++;
			if (bool != false)
				return true;
			if (aClass206_10191 != null)
				return aClass206_10191.F();
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sc.DA(" + bool + ')');
		}
	}

	static final boolean method3933(byte i, int i_0_, int i_1_, int i_2_) {
		try {
			anInt10197++;
			boolean bool = true;
			Interface13 interface13 = (Interface13) Class209.method1342(i_2_,
					i_1_, i_0_);
			if (interface13 != null)
				bool &= Class55.method446(interface13, false);
			if (i != 92)
				aClass213_10180 = null;
			interface13 = ((Interface13) Class180.method1185(i_2_, i_1_, i_0_,
					(aClass10210 != null ? aClass10210
							: (aClass10210 = getClassByName("Interface13")))));
			if (interface13 != null)
				bool &= Class55.method446(interface13, false);
			interface13 = (Interface13) Class159.method988(i_2_, i_1_, i_0_);
			if (interface13 != null)
				bool &= Class55.method446(interface13, false);
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sc.R(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	public final boolean method40(byte i) {
		try {
			anInt10201++;
			if (i < 82)
				anInt10206 = -77;
			return aBool10176;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sc.I(" + i + ')');
		}
	}

	final boolean method2873(Class163 class163, int i, int i_3_, int i_4_) {
		try {
			if (i != 0)
				method2873(null, -97, -108, -5);
			anInt10203++;
			Class206 class206 = method3935(i - 102, class163, 131072);
			if (class206 != null) {
				Class33 class33 = class163.method1048();
				class33.method301(((Class376_Sub7) this).anInt7045,
						((Class376_Sub7) this).anInt7036,
						((Class376_Sub7) this).anInt7031);
				if (Class11_Sub45_Sub1.aBool8490)
					return class206.method1305(i_4_, i_3_, class33, false, 0,
							Class117.anInt1597);
				return class206.method1309(i_4_, i_3_, class33, false, 0);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sc.M("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	final void method2872(int i) {
		do {
			try {
				anInt10173++;
				aBool10175 = false;
				if (i != 26062)
					anIntArray10208 = null;
				if (aClass206_10191 == null)
					break;
				aClass206_10191.s(aClass206_10191.ua() & ~0x10000);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "sc.L(" + i + ')');
			}
			break;
		} while (false);
	}

	public final void method44(Class163 class163, byte i) {
		do {
			try {
				anInt10192++;
				Object object = null;
				if (i != -73)
					method44(null, (byte) 74);
				Class11_Sub45_Sub1 class11_sub45_sub1;
				if (aClass11_Sub45_Sub1_10190 == null && aBool10176) {
					Class189 class189 = method3936(110, class163, 262144, true);
					class11_sub45_sub1 = (class189 != null ? ((Class189) class189).aClass11_Sub45_Sub1_2432
							: null);
				} else {
					class11_sub45_sub1 = aClass11_Sub45_Sub1_10190;
					aClass11_Sub45_Sub1_10190 = null;
				}
				if (class11_sub45_sub1 == null)
					break;
				Class222.method1419(class11_sub45_sub1,
						((Class376_Sub7) this).aByte7039,
						((Class376_Sub7) this).anInt7045,
						((Class376_Sub7) this).anInt7031, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("sc.F(" + (class163 != null ? "{...}" : "null") + ','
								+ i + ')'));
			}
			break;
		} while (false);
	}

	final Class376_Sub5 method2876(byte i, Class163 class163) {
		try {
			anInt10195++;
			if (aClass206_10191 == null)
				return null;
			Class33 class33 = class163.method1048();
			class33.method301(((Class376_Sub7) this).anInt7045,
					((Class376_Sub7) this).anInt7036,
					((Class376_Sub7) this).anInt7031);
			Class376_Sub5 class376_sub5 = Class11_Sub11.method2370(aBool10205,
					1, 24824);
			do {
				if (Class11_Sub45_Sub1.aBool8490) {
					aClass206_10191
							.method1329(
									class33,
									(((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[0]),
									Class117.anInt1597, 0);
					if (!client.aBool10531)
						break;
				}
				aClass206_10191
						.method1321(
								class33,
								(((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[0]),
								0);
			} while (false);
			if (i != -127)
				method2862(17);
			return class376_sub5;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sc.U(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3934(boolean bool, byte i,
			Actor class376_sub7_sub5_sub5) {
		do {
			try {
				anInt10186++;
				Class39 class39 = class376_sub7_sub5_sub5.method3960(21816);
				if ((((Actor) class376_sub7_sub5_sub5).anInt10375) == 0) {
					Class85.anInt1171 = 0;
					Class67.anInt950 = -1;
					((Actor) class376_sub7_sub5_sub5).anInt10373 = 0;
				} else {
					if ((((Actor) class376_sub7_sub5_sub5).anInt10352) != -1
							&& (((Actor) class376_sub7_sub5_sub5).anInt10286) == 0) {
						Class281 class281 = (Class108_Sub23.aClass198_7760
								.method1284(
										((Actor) class376_sub7_sub5_sub5).anInt10352,
										(byte) -109));
						if ((((Actor) class376_sub7_sub5_sub5).anInt10368 ^ 0xffffffff) < -1
								&& ((((Class281) class281).anInt3791 ^ 0xffffffff) == -1)) {
							Class67.anInt950 = -1;
							((Actor) class376_sub7_sub5_sub5).anInt10373++;
							Class85.anInt1171 = 0;
							break;
						}
						if (((Actor) class376_sub7_sub5_sub5).anInt10368 <= 0
								&& ((((Class281) class281).anInt3807 ^ 0xffffffff) == -1)) {
							((Actor) class376_sub7_sub5_sub5).anInt10373++;
							Class67.anInt950 = -1;
							Class85.anInt1171 = 0;
							break;
						}
					}
					if (((((Actor) class376_sub7_sub5_sub5).anInt10289) ^ 0xffffffff) != 0
							&& (((Actor) class376_sub7_sub5_sub5).anInt10301) <= Class11_Sub25.anInt6279) {
						Class224 class224 = (Class254.aClass227_3495
								.method1465(
										((Actor) class376_sub7_sub5_sub5).anInt10289,
										(byte) 49));
						if (((Class224) class224).aBool3073
								&& ((Class224) class224).anInt3079 != -1) {
							Class281 class281 = (Class108_Sub23.aClass198_7760
									.method1284(
											((Class224) class224).anInt3079,
											(byte) -121));
							if (((Actor) class376_sub7_sub5_sub5).anInt10368 > 0
									&& ((Class281) class281).anInt3791 == 0) {
								Class67.anInt950 = -1;
								((Actor) class376_sub7_sub5_sub5).anInt10373++;
								Class85.anInt1171 = 0;
								break;
							}
							if ((((Actor) class376_sub7_sub5_sub5).anInt10368 ^ 0xffffffff) >= -1
									&& (((Class281) class281).anInt3807 ^ 0xffffffff) == -1) {
								((Actor) class376_sub7_sub5_sub5).anInt10373++;
								Class67.anInt950 = -1;
								Class85.anInt1171 = 0;
								break;
							}
						}
					}
					if (((((Actor) class376_sub7_sub5_sub5).anInt10289) ^ 0xffffffff) != 0
							&& (Class11_Sub25.anInt6279 >= ((Actor) class376_sub7_sub5_sub5).anInt10301)) {
						Class224 class224 = (Class254.aClass227_3495
								.method1465(
										((Actor) class376_sub7_sub5_sub5).anInt10289,
										(byte) -107));
						if (((Class224) class224).aBool3073
								&& ((((Class224) class224).anInt3079 ^ 0xffffffff) != 0)) {
							Class281 class281 = (Class108_Sub23.aClass198_7760
									.method1284(
											((Class224) class224).anInt3079,
											(byte) 119));
							if ((((Actor) class376_sub7_sub5_sub5).anInt10368 ^ 0xffffffff) < -1
									&& ((Class281) class281).anInt3791 == 0) {
								((Actor) class376_sub7_sub5_sub5).anInt10373++;
								Class67.anInt950 = -1;
								Class85.anInt1171 = 0;
								break;
							}
							if (((Actor) class376_sub7_sub5_sub5).anInt10368 <= 0
									&& ((Class281) class281).anInt3807 == 0) {
								((Actor) class376_sub7_sub5_sub5).anInt10373++;
								Class67.anInt950 = -1;
								Class85.anInt1171 = 0;
								break;
							}
						}
					}
					int i_5_ = ((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045;
					int i_6_ = ((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031;
					int i_7_ = ((((Actor) class376_sub7_sub5_sub5).anIntArray10370[((Actor) class376_sub7_sub5_sub5).anInt10375 - 1]) * 512 - -(256 * class376_sub7_sub5_sub5
							.method3968((byte) 127)));
					int i_8_ = (512 * (((Actor) class376_sub7_sub5_sub5).anIntArray10376[-1
							+ ((Actor) class376_sub7_sub5_sub5).anInt10375]) + 256 * class376_sub7_sub5_sub5
							.method3968((byte) 127));
					if (i_5_ >= i_7_) {
						if (i_5_ > i_7_) {
							if (i_6_ < i_8_)
								class376_sub7_sub5_sub5.method3953(8192, 6144);
							else if (i_6_ <= i_8_)
								class376_sub7_sub5_sub5.method3953(8192, 4096);
							else
								class376_sub7_sub5_sub5.method3953(8192, 2048);
						} else if (i_6_ >= i_8_) {
							if (i_8_ < i_6_)
								class376_sub7_sub5_sub5.method3953(8192, 0);
						} else
							class376_sub7_sub5_sub5.method3953(8192, 8192);
					} else if ((i_8_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff))
						class376_sub7_sub5_sub5.method3953(8192, 10240);
					else if (i_8_ < i_6_)
						class376_sub7_sub5_sub5.method3953(8192, 14336);
					else
						class376_sub7_sub5_sub5.method3953(8192, 12288);
					if (i <= 25)
						method3934(false, (byte) 30, null);
					byte i_9_ = (((Actor) class376_sub7_sub5_sub5).aByteArray10372[-1
							+ ((Actor) class376_sub7_sub5_sub5).anInt10375]);
					if (!bool
							&& (-i_5_ + i_7_ > 1024
									|| (i_7_ - i_5_ ^ 0xffffffff) > 1023
									|| -i_6_ + i_8_ > 1024 || -i_6_ + i_8_ < -1024)) {
						((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045 = i_7_;
						((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031 = i_8_;
						class376_sub7_sub5_sub5
								.method3961(
										false,
										-126,
										((Actor) class376_sub7_sub5_sub5).anInt10363);
						if ((((Actor) class376_sub7_sub5_sub5).anInt10368 ^ 0xffffffff) < -1)
							((Actor) class376_sub7_sub5_sub5).anInt10368--;
						((Actor) class376_sub7_sub5_sub5).anInt10375--;
						Class67.anInt950 = -1;
						Class85.anInt1171 = 0;
					} else {
						int i_10_ = 16;
						boolean bool_11_ = true;
						if (class376_sub7_sub5_sub5 instanceof Npc)
							bool_11_ = ((NPCDefinitions) (((Npc) (Npc) class376_sub7_sub5_sub5).aClass215_10501)).aBool2969;
						if (bool_11_) {
							int i_12_ = (((Actor) class376_sub7_sub5_sub5).anInt10363 + -(((Class173) (((Actor) class376_sub7_sub5_sub5).aClass173_10278)).anInt2220));
							if ((i_12_ ^ 0xffffffff) != -1
									&& ((Actor) class376_sub7_sub5_sub5).faceEntity == -1
									&& (((Actor) class376_sub7_sub5_sub5).anInt10320 ^ 0xffffffff) != -1)
								i_10_ = 8;
							if (!bool
									&& ((Actor) class376_sub7_sub5_sub5).anInt10375 > 2)
								i_10_ = 24;
							if (!bool
									&& ((Actor) class376_sub7_sub5_sub5).anInt10375 > 3)
								i_10_ = 32;
						} else {
							if (!bool
									&& ((Actor) class376_sub7_sub5_sub5).anInt10375 > 1)
								i_10_ = 24;
							if (!bool
									&& (((Actor) class376_sub7_sub5_sub5).anInt10375 ^ 0xffffffff) < -3)
								i_10_ = 32;
						}
						if ((((Actor) class376_sub7_sub5_sub5).anInt10373 ^ 0xffffffff) < -1
								&& ((Actor) class376_sub7_sub5_sub5).anInt10375 > 1) {
							((Actor) class376_sub7_sub5_sub5).anInt10373--;
							i_10_ = 32;
						}
						if (i_9_ != 2) {
							if ((i_9_ ^ 0xffffffff) == -1)
								i_10_ >>= 1;
						} else
							i_10_ <<= 1;
						if ((((Class39) class39).anInt533 ^ 0xffffffff) != 0) {
							i_10_ <<= 9;
							if (((Actor) class376_sub7_sub5_sub5).anInt10375 == 1) {
								int i_13_ = (((Actor) class376_sub7_sub5_sub5).anInt10374 * ((Actor) class376_sub7_sub5_sub5).anInt10374);
								int i_14_ = ((i_7_ >= (((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045) ? i_7_
										- (((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045)
										: -i_7_
												+ (((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045)) << 9);
								int i_15_ = (i_8_ >= (((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031) ? -(((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031)
										+ i_8_
										: (((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031)
												- i_8_) << 9;
								int i_16_ = ((i_14_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff) ? i_14_
										: i_15_);
								int i_17_ = 2 * ((Class39) class39).anInt533
										* i_16_;
								if (i_17_ < i_13_)
									((Actor) class376_sub7_sub5_sub5).anInt10374 /= 2;
								else if ((i_16_ ^ 0xffffffff) > (i_13_ / 2 ^ 0xffffffff)) {
									((Actor) class376_sub7_sub5_sub5).anInt10374 -= ((Class39) class39).anInt533;
									if (((Actor) class376_sub7_sub5_sub5).anInt10374 < 0)
										((Actor) class376_sub7_sub5_sub5).anInt10374 = 0;
								} else if ((i_10_ ^ 0xffffffff) < ((((Actor) class376_sub7_sub5_sub5).anInt10374) ^ 0xffffffff)) {
									((Actor) class376_sub7_sub5_sub5).anInt10374 += ((Class39) class39).anInt533;
									if ((((Actor) class376_sub7_sub5_sub5).anInt10374 ^ 0xffffffff) < (i_10_ ^ 0xffffffff))
										((Actor) class376_sub7_sub5_sub5).anInt10374 = i_10_;
								}
							} else if ((i_10_ ^ 0xffffffff) >= (((Actor) class376_sub7_sub5_sub5).anInt10374 ^ 0xffffffff)) {
								if ((((Actor) class376_sub7_sub5_sub5).anInt10374 ^ 0xffffffff) < -1) {
									((Actor) class376_sub7_sub5_sub5).anInt10374 -= ((Class39) class39).anInt533;
									if ((((Actor) class376_sub7_sub5_sub5).anInt10374 ^ 0xffffffff) > -1)
										((Actor) class376_sub7_sub5_sub5).anInt10374 = 0;
								}
							} else {
								((Actor) class376_sub7_sub5_sub5).anInt10374 += ((Class39) class39).anInt533;
								if ((((Actor) class376_sub7_sub5_sub5).anInt10374 ^ 0xffffffff) < (i_10_ ^ 0xffffffff))
									((Actor) class376_sub7_sub5_sub5).anInt10374 = i_10_;
							}
							i_10_ = ((Actor) class376_sub7_sub5_sub5).anInt10374 >> 9;
							if ((i_10_ ^ 0xffffffff) > -2)
								i_10_ = 1;
						}
						Class85.anInt1171 = 0;
						if ((i_7_ ^ 0xffffffff) != (i_5_ ^ 0xffffffff)
								|| i_6_ != i_8_) {
							if (i_7_ > i_5_) {
								((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045 += i_10_;
								Class85.anInt1171 |= 0x4;
								if (((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045) ^ 0xffffffff) < (i_7_ ^ 0xffffffff))
									((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045 = i_7_;
							} else if ((i_5_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff)) {
								Class85.anInt1171 |= 0x8;
								((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045 -= i_10_;
								if (((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045) ^ 0xffffffff) > (i_7_ ^ 0xffffffff))
									((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045 = i_7_;
							}
							if ((i_10_ ^ 0xffffffff) <= -33)
								Class67.anInt950 = 2;
							else
								Class67.anInt950 = i_9_;
							if ((i_8_ ^ 0xffffffff) >= (i_6_ ^ 0xffffffff)) {
								if ((i_8_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff)) {
									Class85.anInt1171 |= 0x2;
									((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031 -= i_10_;
									if (i_8_ > ((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031)
										((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031 = i_8_;
								}
							} else {
								((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031 += i_10_;
								Class85.anInt1171 |= 0x1;
								if (((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031) ^ 0xffffffff) < (i_8_ ^ 0xffffffff))
									((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031 = i_8_;
							}
						} else
							Class67.anInt950 = -1;
						if (((i_7_ ^ 0xffffffff) != ((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045) ^ 0xffffffff))
								|| ((i_8_ ^ 0xffffffff) != ((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031) ^ 0xffffffff)))
							break;
						((Actor) class376_sub7_sub5_sub5).anInt10375--;
						if ((((Actor) class376_sub7_sub5_sub5).anInt10368 ^ 0xffffffff) >= -1)
							break;
						((Actor) class376_sub7_sub5_sub5).anInt10368--;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("sc.N("
								+ bool
								+ ','
								+ i
								+ ','
								+ (class376_sub7_sub5_sub5 != null ? "{...}"
										: "null") + ')'));
			}
			break;
		} while (false);
	}

	public final void method41(int i, Class163 class163) {
		do {
			try {
				if (i > 15) {
					anInt10178++;
					Object object = null;
					Class11_Sub45_Sub1 class11_sub45_sub1;
					if (aClass11_Sub45_Sub1_10190 != null || !aBool10176) {
						class11_sub45_sub1 = aClass11_Sub45_Sub1_10190;
						aClass11_Sub45_Sub1_10190 = null;
					} else {
						Class189 class189 = method3936(121, class163, 262144,
								true);
						class11_sub45_sub1 = (class189 == null ? null
								: (((Class189) class189).aClass11_Sub45_Sub1_2432));
					}
					if (class11_sub45_sub1 == null)
						break;
					Class11_Sub45.method3188(class11_sub45_sub1,
							((Class376_Sub7) this).aByte7039,
							((Class376_Sub7) this).anInt7045,
							((Class376_Sub7) this).anInt7031, null);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("sc.B(" + i + ','
						+ (class163 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final int method2867(int i) {
		try {
			if (i != 32767)
				method41(30, null);
			anInt10193++;
			if (aClass206_10191 != null)
				return aClass206_10191.fa();
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sc.EA(" + i + ')');
		}
	}

	private final Class206 method3935(int i, Class163 class163, int i_18_) {
		try {
			anInt10209++;
			if (i >= -74)
				aShort10198 = (short) 103;
			if (aClass206_10191 != null
					&& class163.method1065(aClass206_10191.ua(), i_18_) == 0)
				return aClass206_10191;
			Class189 class189 = method3936(118, class163, i_18_, false);
			if (class189 == null)
				return null;
			return ((Class189) class189).aClass206_2431;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("sc.H(" + i + ',' + (class163 != null ? "{...}" : "null")
							+ ',' + i_18_ + ')'));
		}
	}

	public final int method30(int i) {
		try {
			anInt10189++;
			if (i != 30374)
				method2868((byte) -72);
			return aByte10174;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sc.O(" + i + ')');
		}
	}

	final boolean method2863(int i) {
		try {
			anInt10199++;
			if (i > -106)
				return false;
			if (aClass206_10191 != null) {
				if (aClass206_10191.r())
					return false;
				return true;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sc.AA(" + i + ')');
		}
	}

	final void method2874(byte i, Class163 class163) {
		try {
			anInt10185++;
			int i_19_ = -30 % ((i - 18) / 40);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sc.K(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2871(boolean bool, Class163 class163, int i, int i_20_,
			Class376_Sub7 class376_sub7, int i_21_, int i_22_) {
		try {
			if (class376_sub7 instanceof Class376_Sub7_Sub2_Sub1) {
				Class376_Sub7_Sub2_Sub1 class376_sub7_sub2_sub1_23_ = (Class376_Sub7_Sub2_Sub1) class376_sub7;
				if (aClass206_10191 != null
						&& class376_sub7_sub2_sub1_23_.aClass206_10191 != null)
					aClass206_10191.method1311(
							(class376_sub7_sub2_sub1_23_.aClass206_10191),
							i_22_, i, i_20_, bool);
			}
			if (i_21_ != 22501)
				anInt10206 = -115;
			anInt10187++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sc.G(" + bool + ','
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_20_ + ',' + (class376_sub7 != null ? "{...}" : "null")
					+ ',' + i_21_ + ',' + i_22_ + ')'));
		}
	}

	private final Class189 method3936(int i, Class163 class163, int i_24_,
			boolean bool) {
		try {
			anInt10188++;
			Class42 class42 = Class11_Sub4.aClass290_5237.method1793(
					(byte) -94, 0xffff & aShort10198);
			int i_25_ = -104 / ((19 - i) / 35);
			Class12 class12;
			Class12 class12_26_;
			if (!aBool10179) {
				class12_26_ = (Class11_Sub2_Sub38.aClass12Array9796[((Class376_Sub7) this).aByte7039]);
				if ((((Class376_Sub7) this).aByte7039 ^ 0xffffffff) <= -4)
					class12 = null;
				else
					class12 = (Class11_Sub2_Sub38.aClass12Array9796[((Class376_Sub7) this).aByte7039 + 1]);
			} else {
				class12 = Class11_Sub2_Sub38.aClass12Array9796[0];
				class12_26_ = (Class234_Sub1_Sub1.aClass12Array9729[((Class376_Sub7) this).aByte7039]);
			}
			return class42.method384(-86, ((Class376_Sub7) this).anInt7036,
					class12_26_, class12, bool, aByte10174,
					((Class376_Sub7) this).anInt7045,
					((Class376_Sub7) this).anInt7031, class163, i_24_, 22);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sc.Q(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ',' + i_24_ + ','
					+ bool + ')'));
		}
	}

	Class376_Sub7_Sub2_Sub1(Class163 class163, Class42 class42, int i,
			int i_27_, int i_28_, int i_29_, int i_30_, boolean bool,
			int i_31_, boolean bool_32_) {
		super(i_28_, i_29_, i_30_, i, i_27_, ((Class42) class42).anInt607);
		do {
			try {
				aBool10175 = bool_32_;
				((Class376_Sub7) this).anInt7031 = i_30_;
				aByte10174 = (byte) i_31_;
				((Class376_Sub7) this).anInt7045 = i_28_;
				aBool10179 = bool;
				aShort10198 = (short) ((Class42) class42).anInt693;
				aBool10205 = ((((Class42) class42).anInt664 ^ 0xffffffff) != -1 && !bool);
				aBool10176 = (class163.method1084()
						&& ((Class42) class42).aBool634 && !aBool10179 && (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub26_5717
						.method3147(false) ^ 0xffffffff) != -1);
				int i_33_ = 2048;
				if (aBool10175)
					i_33_ |= 0x10000;
				Class189 class189 = method3936(-104, class163, i_33_,
						aBool10176);
				if (class189 == null)
					break;
				aClass206_10191 = ((Class189) class189).aClass206_2431;
				aClass11_Sub45_Sub1_10190 = ((Class189) class189).aClass11_Sub45_Sub1_2432;
				if (!aBool10175)
					break;
				aClass206_10191 = aClass206_10191.method1313((byte) 0, i_33_,
						false);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("sc.<init>("
						+ (class163 != null ? "{...}" : "null") + ','
						+ (class42 != null ? "{...}" : "null") + ',' + i + ','
						+ i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ','
						+ bool + ',' + i_31_ + ',' + bool_32_ + ')'));
			}
			break;
		} while (false);
	}

	public final void method43(byte i) {
		do {
			try {
				if (i != -62)
					aBool10179 = true;
				anInt10177++;
				if (aClass206_10191 == null)
					break;
				aClass206_10191.method1306();
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "sc.E(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method2868(byte i) {
		try {
			anInt10200++;
			if (i != 14)
				return -61;
			if (aClass206_10191 != null)
				return aClass206_10191.ma();
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sc.GA(" + i + ')');
		}
	}

	final boolean method2862(int i) {
		try {
			anInt10182++;
			if (i > -103)
				method42((byte) 114);
			return aBool10175;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sc.W(" + i + ')');
		}
	}

	final Class212 method2860(int i, Class163 class163) {
		try {
			if (i != 0)
				aClass118_10207 = null;
			if (aClass212_10196 == null)
				aClass212_10196 = (Class236_Sub8.method2879(
						((Class376_Sub7) this).anInt7036,
						method3935(-109, class163, 0),
						((Class376_Sub7) this).anInt7045,
						((Class376_Sub7) this).anInt7031, (byte) 14));
			anInt10181++;
			return aClass212_10196;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sc.D(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	public final int method29(byte i) {
		try {
			anInt10183++;
			if (i != -10)
				method30(97);
			return 22;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sc.J(" + i + ')');
		}
	}

	public final int method42(byte i) {
		try {
			anInt10184++;
			if (i != -17)
				aClass206_10191 = null;
			return aShort10198 & 0xffff;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sc.A(" + i + ')');
		}
	}

	public static void method3937(int i) {
		do {
			try {
				aClass213_10180 = null;
				aClass118_10207 = null;
				aClass22_10204 = null;
				anIntArray10208 = null;
				if (i == -1)
					break;
				aClass213_10180 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "sc.P(" + i + ')');
			}
			break;
		} while (false);
	}

	/* synthetic */static Class getClassByName(String string) {
		try {
			System.out.println(string);
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}

	static {
		aClass213_10180 = new Class213(512);
		aClass22_10204 = new Class22(50);
		anIntArray10208 = new int[13];
		aClass118_10207 = new Class118();
	}
}
