/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class104 {
	float aFloat1385;
	Class234 aClass234_1386;
	float aFloat1387 = 1.0F;
	static int anInt1388;
	static int anInt1389;
	static int anInt1390;
	int anInt1391;
	float aFloat1392 = 1.0F;
	float aFloat1393;
	int anInt1394;
	static int anInt1395;
	int anInt1396;
	float aFloat1397 = 0.25F;
	static int anInt1398 = 0;
	int anInt1399;
	static int anInt1400;
	int anInt1401;
	static int anInt1402;
	int anInt1403;
	float aFloat1404;
	static int anInt1405;

	static final void method687(int i, byte i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_, int i_5_) {
		try {
			anInt1390++;
			int i_6_ = Class190.anInt2446;
			if (i_0_ != 10)
				anInt1388 = -11;
			Class301.anInt4054 = 0;
			int[] is = Class6.anIntArray40;
			for (int i_7_ = 0; Class23.anInt249 + i_6_ > i_7_; i_7_++) {
				NPCDefinitions class215 = null;
				Actor class376_sub7_sub5_sub5;
				if (i_7_ >= i_6_) {
					class376_sub7_sub5_sub5 = (((Class11_Sub25) (Class11_Sub25) (Class11_Sub2_Sub25.aClass213_9322
							.method1369((byte) 26,
									(long) (Class11_Sub52.anIntArray8054[-i_6_
											+ i_7_])))).aNpc_2373);
					class215 = ((Npc) (Npc) class376_sub7_sub5_sub5).aClass215_10501;
					if (((NPCDefinitions) class215).anIntArray2950 != null) {
						class215 = class215.method1375((byte) 29,
								Class11_Sub26.aClass97_6296);
						if (class215 == null)
							continue;
					}
				} else
					class376_sub7_sub5_sub5 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[is[i_7_]]);
				if (((((Actor) class376_sub7_sub5_sub5).anInt10346) ^ 0xffffffff) <= -1
						&& ((((Actor) class376_sub7_sub5_sub5).anInt10268) == Class283.anInt3835 || ((((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047 ^ 0xffffffff) == ((((Class376_Sub7) class376_sub7_sub5_sub5).aByte7047) ^ 0xffffffff)))) {
					Class139.method882(class376_sub7_sub5_sub5.method3957(0),
							i_3_, (byte) 86, i_2_ >> 1, i_5_, i >> 1,
							class376_sub7_sub5_sub5);
					if (Class12.anIntArray104[0] >= 0) {
						if (((Actor) class376_sub7_sub5_sub5).aString10298 != null
								&& (i_7_ >= i_6_
										|| (Class81.anInt1090 ^ 0xffffffff) == -1
										|| (Class81.anInt1090 ^ 0xffffffff) == -4 || (Class81.anInt1090 == 1 && (Class16
										.method156(
												(((Player) (Player) class376_sub7_sub5_sub5).aString10400),
												0))))
								&& ((Class11_Sub45_Sub21.anInt9765 ^ 0xffffffff) < (Class301.anInt4054 ^ 0xffffffff))) {
							Class11_Sub45_Sub21.anIntArray9764[(Class301.anInt4054)] = (Class256_Sub1.aClass292_5320
									.method1805(
											((Actor) class376_sub7_sub5_sub5).aString10298,
											(byte) -70)) / 2;
							Class11_Sub45_Sub21.anIntArray9781[(Class301.anInt4054)] = Class12.anIntArray104[0];
							Class11_Sub45_Sub21.anIntArray9770[(Class301.anInt4054)] = Class12.anIntArray104[1];
							Class11_Sub45_Sub21.anIntArray9774[(Class301.anInt4054)] = ((Actor) class376_sub7_sub5_sub5).anInt10279;
							Class11_Sub45_Sub21.anIntArray9773[(Class301.anInt4054)] = ((Actor) class376_sub7_sub5_sub5).anInt10296;
							Class11_Sub45_Sub21.anIntArray9776[(Class301.anInt4054)] = ((Actor) class376_sub7_sub5_sub5).anInt10285;
							Class11_Sub45_Sub21.aStringArray9769[(Class301.anInt4054)] = ((Actor) class376_sub7_sub5_sub5).aString10298;
							Class301.anInt4054++;
						}
						int i_8_ = i_1_ + Class12.anIntArray104[1];
						if (((Actor) class376_sub7_sub5_sub5).aBool10331
								|| ((Class11_Sub25.anInt6279 ^ 0xffffffff) <= (((Actor) class376_sub7_sub5_sub5).anInt10355 ^ 0xffffffff)))
							i_8_ -= Math
									.max((((Class292) Class256_Sub1.aClass292_5320).anInt3951),
											Class203.aClass253Array2730[0]
													.method1615());
						else {
							int i_9_ = -1;
							int i_10_ = 1;
							if (i_6_ <= i_7_) {
								i_9_ = ((NPCDefinitions) class215).anInt2976;
								if ((i_9_ ^ 0xffffffff) == 0)
									i_9_ = (((Class39) class376_sub7_sub5_sub5
											.method3960(21816)).anInt542);
							} else {
								Player class376_sub7_sub5_sub5_sub1 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[is[i_7_]]);
								i_9_ = (((Class39) class376_sub7_sub5_sub5
										.method3960(21816)).anInt542);
								if (((Player) class376_sub7_sub5_sub5_sub1).aBool10420)
									i_10_ = 2;
							}
							Class253[] class253s = Class203.aClass253Array2730;
							if ((i_9_ ^ 0xffffffff) != 0) {
								Class253[] class253s_11_ = ((Class253[]) Class11_Sub45_Sub1.aClass22_8487
										.method188((long) i_9_, (byte) 75));
								if (class253s_11_ == null) {
									Class80[] class80s = Class80.method543(
											(Class108_Sub7.aClass146_5636),
											i_9_, 0);
									if (class80s != null) {
										class253s_11_ = new Class253[class80s.length];
										for (int i_12_ = 0; class80s.length > i_12_; i_12_++)
											class253s_11_[i_12_] = (Class321_Sub2.aClass163_6648
													.method1081(
															class80s[i_12_],
															true));
										Class11_Sub45_Sub1.aClass22_8487
												.method184((byte) 126,
														class253s_11_,
														(long) i_9_);
									}
								}
								if (class253s_11_ != null
										&& class253s_11_.length >= 2)
									class253s = class253s_11_;
							}
							if ((class253s.length ^ 0xffffffff) >= (i_10_ ^ 0xffffffff))
								i_10_ = 1;
							Class253 class253 = class253s[0];
							Class253 class253_13_ = class253s[i_10_];
							i_8_ -= Math
									.max((((Class292) Class256_Sub1.aClass292_5320).anInt3951),
											class253.method1615());
							int i_14_ = i_4_
									- (-Class12.anIntArray104[0] + (class253
											.method1609() >> 1));
							int i_15_ = (class253.method1609()
									* ((Actor) class376_sub7_sub5_sub5).anInt10348 / 255);
							int i_16_ = class253.method1615();
							if ((((Actor) class376_sub7_sub5_sub5).anInt10348 ^ 0xffffffff) < -1
									&& (i_15_ ^ 0xffffffff) > -3)
								i_15_ = 2;
							class253.method1610(i_14_, i_8_);
							Class321_Sub2.aClass163_6648.T(i_14_, i_8_, i_14_
									- -i_15_, i_16_ + i_8_);
							class253_13_.method1610(i_14_, i_8_);
							Class321_Sub2.aClass163_6648.KA(i_4_, i_1_, i_4_
									- -i_2_, i + i_1_);
							Class11.method123(i_8_ - -i_16_,
									class253.method1608() + i_14_, (byte) -92,
									i_14_, i_8_);
						}
						i_8_ -= 2;
						if (!((Actor) class376_sub7_sub5_sub5).aBool10331) {
							if (Class11_Sub25.anInt6279 < ((Actor) class376_sub7_sub5_sub5).anInt10359) {
								Class253 class253 = (Class313.aClass253Array4155[(!((Actor) class376_sub7_sub5_sub5).aBool10287 ? 0
										: 2)]);
								Class253 class253_17_ = (Class313.aClass253Array4155[(!((Actor) class376_sub7_sub5_sub5).aBool10287 ? 1
										: 3)]);
								int i_18_ = -1;
								if (class376_sub7_sub5_sub5 instanceof Npc) {
									i_18_ = ((NPCDefinitions) class215).anInt2933;
									if ((i_18_ ^ 0xffffffff) == 0)
										i_18_ = (((Class39) class376_sub7_sub5_sub5
												.method3960(21816)).anInt545);
								} else
									i_18_ = (((Class39) class376_sub7_sub5_sub5
											.method3960(21816)).anInt545);
								if (i_18_ != -1) {
									Class253[] class253s = ((Class253[]) (Class355.aClass22_4657
											.method188((long) i_18_, (byte) 124)));
									if (class253s == null) {
										Class80[] class80s = (Class80
												.method543(
														Class108_Sub7.aClass146_5636,
														i_18_, 0));
										if (class80s != null) {
											class253s = (new Class253[class80s.length]);
											for (int i_19_ = 0; class80s.length > i_19_; i_19_++)
												class253s[i_19_] = (Class321_Sub2.aClass163_6648
														.method1081(
																class80s[i_19_],
																true));
											Class355.aClass22_4657.method184(
													(byte) 124, class253s,
													(long) i_18_);
										}
									}
									if (class253s != null
											&& class253s.length == 4) {
										class253_17_ = (class253s[!(((Actor) class376_sub7_sub5_sub5).aBool10287) ? 1
												: 3]);
										class253 = (class253s[!(((Actor) class376_sub7_sub5_sub5).aBool10287) ? 0
												: 2]);
									}
								}
								int i_20_ = (-Class11_Sub25.anInt6279 + ((Actor) class376_sub7_sub5_sub5).anInt10359);
								int i_21_;
								if (((Actor) class376_sub7_sub5_sub5).anInt10336 < i_20_) {
									i_20_ -= (((Actor) class376_sub7_sub5_sub5).anInt10336);
									int i_22_ = ((((Actor) class376_sub7_sub5_sub5).anInt10365) != 0 ? ((((Actor) class376_sub7_sub5_sub5).anInt10365) * (((((Actor) class376_sub7_sub5_sub5).anInt10339) - i_20_) / (((Actor) class376_sub7_sub5_sub5).anInt10365)))
											: 0);
									i_21_ = (i_22_ * class253.method1609() / (((Actor) class376_sub7_sub5_sub5).anInt10339));
								} else
									i_21_ = class253.method1609();
								int i_23_ = class253.method1615();
								i_8_ -= i_23_;
								int i_24_ = (Class12.anIntArray104[0] + i_4_ - (class253
										.method1609() >> 1));
								class253.method1610(i_24_, i_8_);
								Class321_Sub2.aClass163_6648.T(i_24_, i_8_,
										i_21_ + i_24_, i_8_ - -i_23_);
								class253_17_.method1610(i_24_, i_8_);
								Class321_Sub2.aClass163_6648.KA(i_4_, i_1_,
										i_2_ + i_4_, i_1_ - -i);
								Class11.method123(i_8_ - -i_23_,
										(i_24_ - -class253.method1608()),
										(byte) -127, i_24_, i_8_);
								i_8_ -= 2;
							}
							if ((i_7_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff)) {
								Player class376_sub7_sub5_sub5_sub1 = ((Player) class376_sub7_sub5_sub5);
								if (((Player) class376_sub7_sub5_sub5_sub1).anInt10398 != -1) {
									i_8_ -= 25;
									Class253 class253 = (Stream.aClass253Array5921[(((Player) class376_sub7_sub5_sub5_sub1).anInt10398)]);
									class253.method1610(
											(-12 + (i_4_ + (Class12.anIntArray104[0]))),
											i_8_);
									Class11.method123(
											i_8_ - -class253.method1622(),
											i_4_
													- (-Class12.anIntArray104[0] + (12 - class253
															.method1608())),
											(byte) -84,
											-12
													+ (Class12.anIntArray104[0] + i_4_),
											i_8_);
									i_8_ -= 2;
								}
								if (((Player) class376_sub7_sub5_sub5_sub1).anInt10414 != -1) {
									i_8_ -= 25;
									Class253 class253 = (Class278.aClass253Array3762[(((Player) class376_sub7_sub5_sub5_sub1).anInt10414)]);
									class253.method1610(
											(-12 + (i_4_ - -(Class12.anIntArray104[0]))),
											i_8_);
									Class11.method123(
											i_8_ + class253.method1622(),
											(i_4_ - -Class12.anIntArray104[0] - (12 + -class253
													.method1608())),
											(byte) -100, -12
													+ Class12.anIntArray104[0]
													+ i_4_, i_8_);
									i_8_ -= 2;
								}
							} else if (((NPCDefinitions) class215).anInt2932 >= 0
									&& (((NPCDefinitions) class215).anInt2932 < (Class278.aClass253Array3762).length)) {
								Class253 class253 = (Class278.aClass253Array3762[((NPCDefinitions) class215).anInt2932]);
								i_8_ -= 25;
								class253.method1610(
										(Class12.anIntArray104[0] + (i_4_ + -(class253
												.method1609() >> 1))), i_8_);
								Class11.method123(
										class253.method1622() + i_8_,
										(i_4_ - -Class12.anIntArray104[0] - ((class253
												.method1609() >> 1) - class253
												.method1608())),
										(byte) -80,
										(Class12.anIntArray104[0] + (i_4_ + -(class253
												.method1609() >> 1))), i_8_);
								i_8_ -= 2;
							}
						}
						if (class376_sub7_sub5_sub5 instanceof Player) {
							if ((i_7_ ^ 0xffffffff) <= -1) {
								int i_25_ = 0;
								Class275[] class275s = IncomingPacket.aClass275Array2082;
								for (int i_26_ = 0; class275s.length > i_26_; i_26_++) {
									Class275 class275 = class275s[i_26_];
									if (class275 != null
											&& (((Class275) class275).anInt3697 == 10)
											&& ((((Class275) class275).anInt3707 ^ 0xffffffff) == (is[i_7_] ^ 0xffffffff))) {
										Class253 class253 = (Class268.aClass253Array3635[(((Class275) class275).anInt3695)]);
										if (class253.method1615() > i_25_)
											i_25_ = class253.method1615();
										class253.method1610(
												i_4_
														- (-Class12.anIntArray104[0] + 12),
												i_8_ + -class253.method1615());
										Class11.method123(
												(i_8_ - class253.method1615() - -class253
														.method1622()),
												(-12 + (Class12.anIntArray104[0] + (i_4_ + class253
														.method1608()))),
												(byte) -88,
												(i_4_
														- -Class12.anIntArray104[0] - 12),
												-class253.method1615() + i_8_);
									}
								}
								if ((i_25_ ^ 0xffffffff) < -1)
									i_8_ -= i_25_ + 2;
							}
						} else {
							int i_27_ = 0;
							Class275[] class275s = IncomingPacket.aClass275Array2082;
							for (int i_28_ = 0; ((class275s.length ^ 0xffffffff) < (i_28_ ^ 0xffffffff)); i_28_++) {
								Class275 class275 = class275s[i_28_];
								if (class275 != null
										&& ((Class275) class275).anInt3697 == 1
										&& ((Class11_Sub52.anIntArray8054[-i_6_
												+ i_7_]) == ((Class275) class275).anInt3707)) {
									Class253 class253 = (Class268.aClass253Array3635[((Class275) class275).anInt3695]);
									if ((i_27_ ^ 0xffffffff) > (class253
											.method1615() ^ 0xffffffff))
										i_27_ = class253.method1615();
									if ((Class11_Sub25.anInt6279 % 20 ^ 0xffffffff) > -11) {
										class253.method1610(
												(-12 + (i_4_ + Class12.anIntArray104[0])),
												i_8_ + -class253.method1615());
										Class11.method123(
												(-class253.method1615() + i_8_ + class253
														.method1622()),
												(i_4_
														- -Class12.anIntArray104[0] - (12 - class253
														.method1608())),
												(byte) -103,
												(i_4_
														- -Class12.anIntArray104[0] - 12),
												-class253.method1615() + i_8_);
									}
								}
							}
							if (i_27_ > 0)
								i_8_ -= 2 + i_27_;
						}
						for (int i_29_ = 0; i_29_ < 4; i_29_++) {
							if ((Class11_Sub25.anInt6279 ^ 0xffffffff) > ((((Actor) class376_sub7_sub5_sub5).anIntArray10295[i_29_]) ^ 0xffffffff)) {
								int i_30_ = (class376_sub7_sub5_sub5
										.method3957(0) / 2);
								Class139.method882(i_30_, i_3_, (byte) 110,
										i_2_ >> 1, i_5_, i >> 1,
										class376_sub7_sub5_sub5);
								if (Class12.anIntArray104[0] > -1) {
									int i_31_ = Class11_Sub33.aClass253Array6895[(((Actor) class376_sub7_sub5_sub5).anIntArray10350[i_29_])]
											.method1609();
									if (i_29_ == 1)
										Class12.anIntArray104[1] -= 20;
									if (i_29_ == 2) {
										Class12.anIntArray104[0] -= i_31_ - 9;
										Class12.anIntArray104[1] -= 10;
									}
									if (i_29_ == 3) {
										Class12.anIntArray104[0] += i_31_ - 9;
										Class12.anIntArray104[1] -= 10;
									}
									Class11_Sub33.aClass253Array6895[(((Actor) class376_sub7_sub5_sub5).anIntArray10350[i_29_])]
											.method1610(
													(-(i_31_ >> 1)
															+ Class12.anIntArray104[0] + i_4_),
													-12
															+ (Class12.anIntArray104[1] + i_1_));
									Class298.aClass107_4028
											.method709(
													3 + (Class12.anIntArray104[1] + i_1_),
													-1
															+ (Class12.anIntArray104[0] + i_4_),
													0,
													false,
													-1,
													(Integer.toString(((Actor) class376_sub7_sub5_sub5).anIntArray10310[i_29_])));
								}
							}
						}
					}
				}
			}
			for (int i_32_ = 0; i_32_ < Class261.anInt3588; i_32_++) {
				int i_33_ = Class11_Sub46_Sub1.anIntArray8834[i_32_];
				Actor class376_sub7_sub5_sub5;
				if (i_33_ >= 2048)
					class376_sub7_sub5_sub5 = (((Class11_Sub25) (Class11_Sub25) Class11_Sub2_Sub25.aClass213_9322
							.method1369((byte) 26, (long) (i_33_ - 2048))).aNpc_2373);
				else
					class376_sub7_sub5_sub5 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_33_]);
				int i_34_ = Class234_Sub2_Sub1.anIntArray8448[i_32_];
				Actor class376_sub7_sub5_sub5_35_;
				if ((i_34_ ^ 0xffffffff) <= -2049)
					class376_sub7_sub5_sub5_35_ = (((Class11_Sub25) (Class11_Sub25) Class11_Sub2_Sub25.aClass213_9322
							.method1369((byte) 26, (long) (i_34_ - 2048))).aNpc_2373);
				else
					class376_sub7_sub5_sub5_35_ = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_34_]);
				Class9.method111(
						i_3_,
						i_2_,
						class376_sub7_sub5_sub5_35_,
						class376_sub7_sub5_sub5,
						--((Actor) class376_sub7_sub5_sub5).anInt10277,
						i, i_5_, (byte) -39, i_1_, i_4_);
			}
			int i_36_ = (((Class292) Class256_Sub1.aClass292_5320).anInt3951 - (-((Class292) Class256_Sub1.aClass292_5320).anInt3959 - 2));
			for (int i_37_ = 0; (i_37_ ^ 0xffffffff) > (Class301.anInt4054 ^ 0xffffffff); i_37_++) {
				int i_38_ = Class11_Sub45_Sub21.anIntArray9781[i_37_];
				int i_39_ = Class11_Sub45_Sub21.anIntArray9770[i_37_];
				int i_40_ = Class11_Sub45_Sub21.anIntArray9764[i_37_];
				boolean bool = true;
				while (bool) {
					bool = false;
					for (int i_41_ = 0; (i_37_ ^ 0xffffffff) < (i_41_ ^ 0xffffffff); i_41_++) {
						if (i_39_ + 2 > (Class11_Sub45_Sub21.anIntArray9770[i_41_])
								- i_36_
								&& (Class11_Sub45_Sub21.anIntArray9770[i_41_] + 2 > -i_36_
										+ i_39_)
								&& ((Class11_Sub45_Sub21.anIntArray9764[i_41_] + Class11_Sub45_Sub21.anIntArray9781[i_41_]) > i_38_
										+ -i_40_)
								&& ((Class11_Sub45_Sub21.anIntArray9781[i_41_] - Class11_Sub45_Sub21.anIntArray9764[i_41_]) < i_40_
										+ i_38_)
								&& i_39_ > (Class11_Sub45_Sub21.anIntArray9770[i_41_])
										+ -i_36_) {
							i_39_ = -i_36_
									+ (Class11_Sub45_Sub21.anIntArray9770[i_41_]);
							bool = true;
						}
					}
				}
				Class11_Sub45_Sub21.anIntArray9770[i_37_] = i_39_;
				String string = Class11_Sub45_Sub21.aStringArray9769[i_37_];
				int i_42_ = Class256_Sub1.aClass292_5320.method1805(string,
						(byte) -94);
				int i_43_ = i_38_ + i_4_;
				int i_44_ = (-((Class292) Class256_Sub1.aClass292_5320).anInt3951 + (i_39_ + i_1_));
				int i_45_ = i_42_ + i_43_;
				int i_46_ = (((Class292) Class256_Sub1.aClass292_5320).anInt3959 + (i_39_ + i_1_));
				if ((Class101.anInt1357 ^ 0xffffffff) == -1) {
					int i_47_ = 16776960;
					if ((Class11_Sub45_Sub21.anIntArray9774[i_37_] ^ 0xffffffff) > -7)
						i_47_ = (Class11_Sub2_Sub9.anIntArray8841[Class11_Sub45_Sub21.anIntArray9774[i_37_]]);
					if (Class11_Sub45_Sub21.anIntArray9774[i_37_] == 6)
						i_47_ = (Class283.anInt3835 % 20 < 10 ? 16711680
								: 16776960);
					if (Class11_Sub45_Sub21.anIntArray9774[i_37_] == 7)
						i_47_ = ((Class283.anInt3835 % 20 ^ 0xffffffff) <= -11 ? 65535
								: 255);
					if (Class11_Sub45_Sub21.anIntArray9774[i_37_] == 8)
						i_47_ = ((Class283.anInt3835 % 20 ^ 0xffffffff) > -11 ? 45056
								: 8454016);
					if ((Class11_Sub45_Sub21.anIntArray9774[i_37_] ^ 0xffffffff) == -10) {
						int i_48_ = -Class11_Sub45_Sub21.anIntArray9776[i_37_] + 150;
						if ((i_48_ ^ 0xffffffff) <= -51) {
							if ((i_48_ ^ 0xffffffff) > -101)
								i_47_ = 16776960 + -(327680 * i_48_)
										- -16384000;
							else if ((i_48_ ^ 0xffffffff) > -151)
								i_47_ = 65280 - (-(5 * i_48_) + 500);
						} else
							i_47_ = 16711680 + 1280 * i_48_;
					}
					if (Class11_Sub45_Sub21.anIntArray9774[i_37_] == 10) {
						int i_49_ = -Class11_Sub45_Sub21.anIntArray9776[i_37_] + 150;
						if (i_49_ < 50)
							i_47_ = 16711680 - -(5 * i_49_);
						else if ((i_49_ ^ 0xffffffff) > -101)
							i_47_ = -(i_49_ * 327680) - -33095935;
						else if (i_49_ < 150)
							i_47_ = -(5 * (i_49_ - 100)) + 255
									- -((-100 + i_49_) * 327680);
					}
					if (Class11_Sub45_Sub21.anIntArray9774[i_37_] == 11) {
						int i_50_ = 150 - Class11_Sub45_Sub21.anIntArray9776[i_37_];
						if (i_50_ >= 50) {
							if (i_50_ >= 100) {
								if ((i_50_ ^ 0xffffffff) > -151)
									i_47_ = 16777215 + -((-100 + i_50_) * 327680);
							} else
								i_47_ = 65280 - -(327685 * (i_50_ - 50));
						} else
							i_47_ = 16777215 - i_50_ * 327685;
					}
					int i_51_ = i_47_ | ~0xffffff;
					if ((Class11_Sub45_Sub21.anIntArray9773[i_37_] ^ 0xffffffff) == -1) {
						i_45_ -= i_42_ >> 1;
						i_43_ -= i_42_ >> 1;
						Class98.aClass107_1308.method709(i_1_ - -i_39_, i_38_
								+ i_4_, -16777216, false, i_51_, string);
					}
					if (Class11_Sub45_Sub21.anIntArray9773[i_37_] == 1) {
						i_44_ -= 5;
						i_43_ -= i_42_ >> 1;
						Class98.aClass107_1308.method714(i_51_, i_4_ + i_38_,
								-16777216, string, i_1_ - -i_39_, 20066,
								Class283.anInt3835);
						i_45_ -= i_42_ >> 1;
						i_46_ += 5;
					}
					if (Class11_Sub45_Sub21.anIntArray9773[i_37_] == 2) {
						i_46_ += 5;
						i_45_ -= (i_42_ >> 1) - 5;
						i_43_ -= 5 + (i_42_ >> 1);
						Class98.aClass107_1308.method705(-16777216, i_4_
								- -i_38_, Class283.anInt3835, i_51_,
								i_0_ ^ 0x75, i_1_ - -i_39_, string);
						i_44_ -= 5;
					}
					if (Class11_Sub45_Sub21.anIntArray9773[i_37_] == 3) {
						Class98.aClass107_1308
								.method717(
										-16777216,
										i_1_ - -i_39_,
										i_51_,
										i_4_ + i_38_,
										Class283.anInt3835,
										string,
										-Class11_Sub45_Sub21.anIntArray9776[i_37_] + 150,
										2);
						i_43_ -= i_42_ >> 1;
						i_44_ -= 7;
						i_45_ -= i_42_ >> 1;
						i_46_ += 7;
					}
					if ((Class11_Sub45_Sub21.anIntArray9773[i_37_] ^ 0xffffffff) == -5) {
						int i_52_ = ((150 - Class11_Sub45_Sub21.anIntArray9776[i_37_])
								* (Class256_Sub1.aClass292_5320.method1805(
										string, (byte) -114) + 100) / 150);
						Class321_Sub2.aClass163_6648.T(i_38_ + i_4_ - 50, i_1_,
								50 + (i_4_ - -i_38_), i_1_ - -i);
						i_43_ += 50 + -i_52_;
						i_45_ += -i_52_ + 50;
						Class98.aClass107_1308.method708(
								(i_38_ + i_4_ + (50 - i_52_)), 173, i_51_, i_1_
										+ i_39_, string, -16777216);
						Class321_Sub2.aClass163_6648.KA(i_4_, i_1_,
								i_4_ + i_2_, i_1_ - -i);
					}
					if ((Class11_Sub45_Sub21.anIntArray9773[i_37_] ^ 0xffffffff) == -6) {
						int i_53_ = -Class11_Sub45_Sub21.anIntArray9776[i_37_] + 150;
						int i_54_ = 0;
						if ((i_53_ ^ 0xffffffff) <= -26) {
							if ((i_53_ ^ 0xffffffff) < -126)
								i_54_ = i_53_ - 125;
						} else
							i_54_ = -25 + i_53_;
						int i_55_ = ((((Class292) Class256_Sub1.aClass292_5320).anInt3959) + (((Class292) Class256_Sub1.aClass292_5320).anInt3951));
						Class321_Sub2.aClass163_6648.T(i_4_, -1 + i_1_
								+ (i_39_ + -i_55_), i_4_ - -i_2_, 5 + i_39_
								+ i_1_);
						Class98.aClass107_1308.method709(
								i_54_ + (i_1_ + i_39_), i_38_ + i_4_,
								-16777216, false, i_51_, string);
						i_46_ += i_54_;
						i_44_ += i_54_;
						i_43_ -= i_42_ >> 1;
						i_45_ -= i_42_ >> 1;
						Class321_Sub2.aClass163_6648.KA(i_4_, i_1_,
								i_2_ + i_4_, i_1_ + i);
					}
				} else {
					Class98.aClass107_1308.method709(i_1_ - -i_39_, i_38_
							+ i_4_, -16777216, false, -256, string);
					i_45_ -= i_42_ >> 1;
					i_43_ -= i_42_ >> 1;
				}
				Class11.method123(1 + i_46_, 1 + i_45_, (byte) -81, i_43_,
						i_44_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ct.C(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ')'));
		}
	}

	static final void method688(int i) {
		do {
			try {
				if (Class229.anObject3153 == null) {
					Class58_Sub2_Sub2 class58_sub2_sub2 = new Class58_Sub2_Sub2();
					byte[] is = class58_sub2_sub2.method3859(128, 128, 16,
							false);
					Class229.anObject3153 = Class254_Sub3.method3238(121,
							false, is);
				}
				anInt1400++;
				if (Class118.anObject1608 == null) {
					Class58_Sub1_Sub1 class58_sub1_sub1 = new Class58_Sub1_Sub1();
					byte[] is = class58_sub1_sub1.method3586(128, (byte) -56,
							16, 128);
					Class118.anObject1608 = Class254_Sub3.method3238(122,
							false, is);
				}
				if (i == 16)
					break;
				method688(-45);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ct.D(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method689(Class104 class104_56_, byte i) {
		try {
			anInt1405++;
			if (i != 115)
				method690(-16, null);
			if ((((Class104) this).anInt1401 != ((Class104) class104_56_).anInt1401)
					|| (((Class104) this).aFloat1385 != ((Class104) class104_56_).aFloat1385)
					|| (((Class104) this).aFloat1404 != ((Class104) class104_56_).aFloat1404)
					|| (((Class104) class104_56_).aFloat1393 != ((Class104) this).aFloat1393)
					|| (((Class104) class104_56_).aFloat1397 != ((Class104) this).aFloat1397)
					|| (((Class104) this).aFloat1387 != ((Class104) class104_56_).aFloat1387)
					|| (((Class104) this).aFloat1392 != ((Class104) class104_56_).aFloat1392)
					|| (((Class104) this).anInt1403 != ((Class104) class104_56_).anInt1403)
					|| (((Class104) this).anInt1396 != ((Class104) class104_56_).anInt1396)
					|| (((Class104) this).aClass234_1386 != ((Class104) class104_56_).aClass234_1386))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, "ct.B("
							+ (class104_56_ != null ? "{...}" : "null") + ','
							+ i + ')');
		}
	}

	final void method690(int i, Stream stream) {
		try {
			((Class104) this).aFloat1387 = (float) (stream
					.readUnsignedByte((byte) 35) * 8) / 255.0F;
			anInt1402++;
			((Class104) this).aFloat1397 = (float) (8 * stream
					.readUnsignedByte((byte) 35)) / 255.0F;
			int i_57_ = -99 / ((-41 - i) / 48);
			((Class104) this).aFloat1392 = (float) (stream
					.readUnsignedByte((byte) 35) * 8) / 255.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ct.A(" + i + ','
					+ (stream != null ? "{...}" : "null") + ')'));
		}
	}

	public Class104() {
		try {
			((Class104) this).aClass234_1386 = Class96.aClass234_1289;
			((Class104) this).anInt1396 = 0;
			((Class104) this).anInt1391 = -50;
			((Class104) this).aFloat1404 = 0.69921875F;
			((Class104) this).anInt1399 = -50;
			((Class104) this).aFloat1385 = 1.1523438F;
			((Class104) this).aFloat1393 = 1.2F;
			((Class104) this).anInt1401 = Class106.anInt1434;
			((Class104) this).anInt1403 = Class253_Sub1.anInt5855;
			((Class104) this).anInt1394 = -60;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ct.<init>(" + ')');
		}
	}

	Class104(Stream stream) {
		try {
			int i = stream.readUnsignedByte((byte) 35);
			if (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub11_5723
					.method2623(false) != 1
					|| ((Class11_Sub31.aClass163_6702.method1026() ^ 0xffffffff) >= -1)) {
				if ((i & 0x1) != 0)
					stream.readInt(114);
				if ((i & 0x2) != 0)
					stream.readUnsignedShort((byte) -65);
				if ((i & 0x4) != 0)
					stream.readUnsignedShort((byte) -65);
				if ((0x8 & i ^ 0xffffffff) != -1)
					stream.readUnsignedShort((byte) -65);
				((Class104) this).anInt1401 = Class106.anInt1434;
				((Class104) this).aFloat1385 = 1.1523438F;
				((Class104) this).aFloat1393 = 1.2F;
				((Class104) this).aFloat1404 = 0.69921875F;
			} else {
				if ((0x1 & i) == 0)
					((Class104) this).anInt1401 = Class106.anInt1434;
				else
					((Class104) this).anInt1401 = stream.readInt(111);
				if ((0x2 & i) != 0)
					((Class104) this).aFloat1385 = (float) stream
							.readUnsignedShort((byte) -65) / 256.0F;
				else
					((Class104) this).aFloat1385 = 1.1523438F;
				if ((0x4 & i ^ 0xffffffff) == -1)
					((Class104) this).aFloat1404 = 0.69921875F;
				else
					((Class104) this).aFloat1404 = (float) stream
							.readUnsignedShort((byte) -65) / 256.0F;
				if ((0x8 & i ^ 0xffffffff) != -1)
					((Class104) this).aFloat1393 = (float) stream
							.readUnsignedShort((byte) -65) / 256.0F;
				else
					((Class104) this).aFloat1393 = 1.2F;
			}
			if ((i & 0x10 ^ 0xffffffff) != -1) {
				((Class104) this).anInt1391 = stream.method2508((byte) 75);
				((Class104) this).anInt1394 = stream.method2508((byte) -122);
				((Class104) this).anInt1399 = stream.method2508((byte) 10);
			} else {
				((Class104) this).anInt1391 = -50;
				((Class104) this).anInt1394 = -60;
				((Class104) this).anInt1399 = -50;
			}
			if ((0x20 & i ^ 0xffffffff) != -1)
				((Class104) this).anInt1403 = stream.readInt(95);
			else
				((Class104) this).anInt1403 = Class253_Sub1.anInt5855;
			if ((0x40 & i ^ 0xffffffff) != -1)
				((Class104) this).anInt1396 = stream
						.readUnsignedShort((byte) -65);
			else
				((Class104) this).anInt1396 = 0;
			if ((0x80 & i) != 0) {
				int i_58_ = stream.readUnsignedShort((byte) -65);
				int i_59_ = stream.readUnsignedShort((byte) -65);
				int i_60_ = stream.readUnsignedShort((byte) -65);
				int i_61_ = stream.readUnsignedShort((byte) -65);
				int i_62_ = stream.readUnsignedShort((byte) -65);
				int i_63_ = stream.readUnsignedShort((byte) -65);
				((Class104) this).aClass234_1386 = Class273.method1706(
						(byte) -111, i_60_, i_61_, i_62_, i_63_, i_58_, i_59_);
			} else
				((Class104) this).aClass234_1386 = Class96.aClass234_1289;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ct.<init>("
					+ (stream != null ? "{...}" : "null") + ')');
		}
	}
}
