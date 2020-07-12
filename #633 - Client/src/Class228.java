/* Class228 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class228 {
	static int anInt3138;
	static int anInt3139;
	private Class38 aClass38_3140;
	private Class11_Sub45 aClass11_Sub45_3141;
	static Class240 aClass240_3142 = new Class240();
	static int anInt3143;
	static int anInt3144;
	static int anInt3145;
	static int anInt3146;
	static int anInt3147;
	static int anInt3148;
	static int anInt3149 = 0;
	static int anInt3150;
	static int anInt3151;

	static final void method1468(int i) {
		do {
			try {
				anInt3145++;
				Class141.method891((byte) 65, false);
				Class335.anInt4439 = 0;
				boolean bool = true;
				for (int i_0_ = 0; i_0_ < Class11_Sub2_Sub23.aByteArrayArray9266.length; i_0_++) {
					if (Class345.anIntArray4585[i_0_] != -1
							&& (Class11_Sub2_Sub23.aByteArrayArray9266[i_0_] == null)) {
						Class11_Sub2_Sub23.aByteArrayArray9266[i_0_] = Class14.aClass146_125
								.method930(0, (byte) 112,
										(Class345.anIntArray4585[i_0_]));
						if (Class11_Sub2_Sub23.aByteArrayArray9266[i_0_] == null) {
							Class335.anInt4439++;
							bool = false;
						}
					}
					if ((Class256.anIntArray3507[i_0_] ^ 0xffffffff) != 0
							&& (Class11_Sub45_Sub21.aByteArrayArray9775[i_0_] == null)) {
						Class11_Sub45_Sub21.aByteArrayArray9775[i_0_] = (Class14.aClass146_125
								.method933(
										Class256.anIntArray3507[i_0_],
										Class321_Sub2.anIntArrayArray6639[i_0_],
										(byte) 105, 0));
						if (Class11_Sub45_Sub21.aByteArrayArray9775[i_0_] == null) {
							Class335.anInt4439++;
							bool = false;
						}
					}
					if (Class253_Sub2.anIntArray6535[i_0_] != -1
							&& Class11_Sub35.aByteArrayArray7006[i_0_] == null) {
						Class11_Sub35.aByteArrayArray7006[i_0_] = Class14.aClass146_125
								.method930(0, (byte) 112,
										(Class253_Sub2.anIntArray6535[i_0_]));
						if (Class11_Sub35.aByteArrayArray7006[i_0_] == null) {
							Class335.anInt4439++;
							bool = false;
						}
					}
					if ((Class2_Sub9.anIntArray7281[i_0_] ^ 0xffffffff) != 0
							&& (Class11_Sub45_Sub16_Sub2.aByteArrayArray10171[i_0_] == null)) {
						Class11_Sub45_Sub16_Sub2.aByteArrayArray10171[i_0_] = Class14.aClass146_125
								.method930(0, (byte) 112,
										(Class2_Sub9.anIntArray7281[i_0_]));
						if (Class11_Sub45_Sub16_Sub2.aByteArrayArray10171[i_0_] == null) {
							bool = false;
							Class335.anInt4439++;
						}
					}
					if (Class373.anIntArray4880 != null
							&& Class376_Sub2.aByteArrayArray5568[i_0_] == null
							&& (Class373.anIntArray4880[i_0_] ^ 0xffffffff) != 0) {
						Class376_Sub2.aByteArrayArray5568[i_0_] = (Class14.aClass146_125
								.method933(
										Class373.anIntArray4880[i_0_],
										Class321_Sub2.anIntArrayArray6639[i_0_],
										(byte) 105, 0));
						if (Class376_Sub2.aByteArrayArray5568[i_0_] == null) {
							Class335.anInt4439++;
							bool = false;
						}
					}
				}
				if (Class204.aClass342_2749 == null) {
					if (Class113.aClass11_Sub45_Sub19_1559 == null
							|| !(Class11_Sub2_Sub30.aClass146_9618
									.method923(
											(byte) 117,
											(((Class11_Sub45_Sub19) Class113.aClass11_Sub45_Sub19_1559).aString9696)
													+ "_staticelements")))
						Class204.aClass342_2749 = new Class342(0);
					else if (!Class11_Sub2_Sub30.aClass146_9618
							.method921(
									(((Class11_Sub45_Sub19) Class113.aClass11_Sub45_Sub19_1559).aString9696)
											+ "_staticelements", -2)) {
						bool = false;
						Class335.anInt4439++;
					} else
						Class204.aClass342_2749 = (Class53
								.method438(
										Class233.aBool3197,
										Class11_Sub2_Sub30.aClass146_9618,
										(byte) -68,
										(((Class11_Sub45_Sub19) Class113.aClass11_Sub45_Sub19_1559).aString9696)
												+ "_staticelements"));
				}
				if (!bool)
					Class253_Sub1.anInt5868 = 1;
				else {
					bool = true;
					Class7.anInt45 = 0;
					if (i > -22)
						anInt3148 = -22;
					for (int i_1_ = 0; ((i_1_ ^ 0xffffffff) > (Class11_Sub2_Sub23.aByteArrayArray9266.length ^ 0xffffffff)); i_1_++) {
						byte[] is = Class11_Sub45_Sub21.aByteArrayArray9775[i_1_];
						if (is != null) {
							int i_2_ = ((Class183.anIntArray2362[i_1_] >> 8) * 64 - Class194.anInt2641);
							int i_3_ = (-Class118.anInt1605 + 64 * (Class183.anIntArray2362[i_1_] & 0xff));
							if (Class141.anInt1915 != 0) {
								i_2_ = 10;
								i_3_ = 10;
							}
							bool &= Class333.method2005(Class300.anInt4051, is,
									(Class108_Sub12.anInt6228), i_3_,
									(byte) -78, i_2_);
						}
						is = (Class11_Sub45_Sub16_Sub2.aByteArrayArray10171[i_1_]);
						if (is != null) {
							int i_4_ = ((Class183.anIntArray2362[i_1_] >> 8) * 64 - Class194.anInt2641);
							int i_5_ = (64 * (0xff & Class183.anIntArray2362[i_1_]) - Class118.anInt1605);
							if ((Class141.anInt1915 ^ 0xffffffff) != -1) {
								i_4_ = 10;
								i_5_ = 10;
							}
							bool &= Class333.method2005(Class300.anInt4051, is,
									(Class108_Sub12.anInt6228), i_5_,
									(byte) -82, i_4_);
						}
					}
					if (!bool)
						Class253_Sub1.anInt5868 = 2;
					else {
						if ((Class253_Sub1.anInt5868 ^ 0xffffffff) != -1)
							Class11_Sub2_Sub8
									.method3433(
											Class161.aClass292_2096,
											((Class26.aClass26_288
													.method217(
															(byte) 90,
															Class11_Sub45_Sub1_Sub2.anInt9884)) + "<br>(100%)"),
											true, 123,
											OutputStream_Sub2.aClass107_7949,
											Class321_Sub2.aClass163_6648);
						Class34.method304((byte) -117);
						Class11_Sub2_Sub2.method3337((byte) -73);
						Packet.method3414(-5685);
						boolean bool_6_ = false;
						if (Class321_Sub2.aClass163_6648.method1019()
								&& (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub5_5695
										.method2373(false) == 2)) {
							for (int i_7_ = 0; ((i_7_ ^ 0xffffffff) > ((Class11_Sub2_Sub23.aByteArrayArray9266).length ^ 0xffffffff)); i_7_++) {
								if ((Class11_Sub45_Sub16_Sub2.aByteArrayArray10171[i_7_]) != null
										|| (Class11_Sub35.aByteArrayArray7006[i_7_] != null)) {
									bool_6_ = true;
									break;
								}
							}
						}
						int i_8_;
						if (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub19_5732
								.method2892(false) != 1)
							i_8_ = (Class58_Sub2_Sub1.anIntArray9247[Class236_Sub7.anInt6976]);
						else
							i_8_ = (Class209.anIntArray2842[Class236_Sub7.anInt6976]);
						if (Class321_Sub2.aClass163_6648.method1062())
							i_8_++;
						Class11_Sub29.method2721(Class321_Sub2.aClass163_6648,
								Class291.anInt3932, 9, 4, Class300.anInt4051,
								Class108_Sub12.anInt6228, i_8_, bool_6_,
								Class321_Sub2.aClass163_6648.method1026() > 0);
						Class193.method1265(NPCDefinitions.anInt2949);
						if (NPCDefinitions.anInt2949 != 0)
							Class126.method819(Class298.aClass107_4028);
						else
							Class126.method819(null);
						for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -5; i_9_++)
							Class235.aClass338Array3217[i_9_]
									.method2044((byte) 83);
						Class339.method2049(109);
						Class23.method198(false, -257);
						Class11_Sub2_Sub5.method3394(-125);
						Class108_Sub18.aClass141_6924 = null;
						Class118.aBool1602 = false;
						Class34.method304((byte) -106);
						System.gc();
						Class141.method891((byte) 78, true);
						Class11.method125((byte) -73);
						Class227.anInt3135 = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub26_5717
								.method3147(false);
						Class2_Sub1.aBool5069 = (Class177.anInt2245 ^ 0xffffffff) <= -97;
						Class30.aBool405 = (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub5_5695
								.method2373(false) ^ 0xffffffff) == -3;
						Class134.aBool1853 = (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub11_5723
								.method2623(false) ^ 0xffffffff) == -2;
						Class2_Sub5.anInt5507 = (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub27_5707
								.method3158(false) != 1 ? Class51.anInt800 : -1);
						Class14.aBool129 = (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub16_5721
								.method2710(false) ^ 0xffffffff) == -2;
						Class273.aBool3680 = (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub6_5697
								.method2429(false) ^ 0xffffffff) == -2;
						Class376_Sub6.aClass286_Sub1_6949 = new Class286_Sub1(
								4, Class300.anInt4051,
								Class108_Sub12.anInt6228, false);
						if (Class141.anInt1915 == 0)
							Class224.method1433((byte) 99,
									(Class11_Sub2_Sub23.aByteArrayArray9266),
									(Class376_Sub6.aClass286_Sub1_6949));
						else
							Class11_Sub2_Sub38.method3853(-1,
									Class376_Sub6.aClass286_Sub1_6949,
									Class11_Sub2_Sub23.aByteArrayArray9266);
						Class41.method370(Class300.anInt4051 >> 4,
								Class108_Sub12.anInt6228 >> 4, false);
						Class101.method670((byte) -116);
						if (bool_6_) {
							Class11_Sub2_Sub9.method3471(true);
							Class147.aClass286_Sub1_1995 = new Class286_Sub1(1,
									Class300.anInt4051,
									Class108_Sub12.anInt6228, true);
							if ((Class141.anInt1915 ^ 0xffffffff) == -1) {
								Class224.method1433((byte) 108,
										(Class11_Sub35.aByteArrayArray7006),
										(Class147.aClass286_Sub1_1995));
								Class141.method891((byte) 126, true);
							} else {
								Class11_Sub2_Sub38.method3853(-1,
										Class147.aClass286_Sub1_1995,
										Class11_Sub35.aByteArrayArray7006);
								Class141.method891((byte) 63, true);
							}
							Class147.aClass286_Sub1_1995
									.method1765(
											(((Class286) Class376_Sub6.aClass286_Sub1_6949).anIntArrayArrayArray3866[0]),
											true, 0);
							Class147.aClass286_Sub1_1995.method1771(null, null,
									Class321_Sub2.aClass163_6648, 127);
							Class11_Sub2_Sub9.method3471(false);
						}
						Class376_Sub6.aClass286_Sub1_6949
								.method1771(
										Class235.aClass338Array3217,
										(!bool_6_ ? null
												: (((Class286) Class147.aClass286_Sub1_1995).anIntArrayArrayArray3866)),
										Class321_Sub2.aClass163_6648, -111);
						if ((Class141.anInt1915 ^ 0xffffffff) != -1) {
							Class141.method891((byte) 101, true);
							Class11_Sub17.method2459(
									(Class11_Sub45_Sub21.aByteArrayArray9775),
									(Class376_Sub6.aClass286_Sub1_6949), 9454);
						} else {
							Class141.method891((byte) 87, true);
							Class376_Sub3.method2612(
									(Class376_Sub6.aClass286_Sub1_6949),
									-1754610264,
									(Class11_Sub45_Sub21.aByteArrayArray9775));
							if (Class376_Sub2.aByteArrayArray5568 != null)
								Class27.method225((byte) -77);
						}
						Class11_Sub2_Sub2.method3337((byte) -73);
						if (Class177.anInt2245 < 96)
							Class31.method258(false);
						Class141.method891((byte) 111, true);
						Class376_Sub6.aClass286_Sub1_6949
								.method1773(
										(bool_6_ ? Class234_Sub1_Sub1.aClass12Array9729[0]
												: null), -1,
										Class321_Sub2.aClass163_6648, null);
						Class376_Sub6.aClass286_Sub1_6949.method2907(
								Class321_Sub2.aClass163_6648, false,
								(byte) -105);
						Class141.method891((byte) 92, true);
						if (bool_6_) {
							Class11_Sub2_Sub9.method3471(true);
							Class141.method891((byte) 53, true);
							if (Class141.anInt1915 == 0)
								Class376_Sub3
										.method2612(
												Class147.aClass286_Sub1_1995,
												-1754610264,
												(Class11_Sub45_Sub16_Sub2.aByteArrayArray10171));
							else
								Class11_Sub17
										.method2459(
												(Class11_Sub45_Sub16_Sub2.aByteArrayArray10171),
												Class147.aClass286_Sub1_1995,
												9454);
							Class11_Sub2_Sub2.method3337((byte) -73);
							Class141.method891((byte) 83, true);
							Class147.aClass286_Sub1_1995.method1773(null, -1,
									Class321_Sub2.aClass163_6648,
									Class11_Sub2_Sub38.aClass12Array9796[0]);
							Class147.aClass286_Sub1_1995.method2907(
									Class321_Sub2.aClass163_6648, true,
									(byte) -80);
							Class141.method891((byte) 79, true);
							Class11_Sub2_Sub9.method3471(false);
						}
						Class91.method624(true);
						int i_10_ = (((Class286_Sub1) Class376_Sub6.aClass286_Sub1_6949).anInt7146);
						if ((i_10_ ^ 0xffffffff) < (Class376_Sub7_Sub2.anInt9242 ^ 0xffffffff))
							i_10_ = Class376_Sub7_Sub2.anInt9242;
						if ((i_10_ ^ 0xffffffff) > (Class376_Sub7_Sub2.anInt9242 - 1 ^ 0xffffffff))
							i_10_ = Class376_Sub7_Sub2.anInt9242 - 1;
						if (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub27_5707
								.method3158(false) != 0)
							Class53.method441(0);
						else
							Class53.method441(i_10_);
						for (int i_11_ = 0; i_11_ < 4; i_11_++) {
							for (int i_12_ = 0; ((i_12_ ^ 0xffffffff) > (Class300.anInt4051 ^ 0xffffffff)); i_12_++) {
								for (int i_13_ = 0; ((i_13_ ^ 0xffffffff) > (Class108_Sub12.anInt6228 ^ 0xffffffff)); i_13_++)
									Class295.method1830(i_13_, i_12_, -10615,
											i_11_);
							}
						}
						Class11_Sub18.method2476(-124);
						Class34.method304((byte) 118);
						Class219_Sub1.method2937(-126);
						Class11_Sub2_Sub2.method3337((byte) -73);
						Class38.method329(27920);
						if (Class376_Sub5.aFrame6918 != null
								&& Class108_Sub2.aClass217_5081 != null
								&& (Class285.anInt3846 ^ 0xffffffff) == -12) {
							Class198.anInt2681++;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class264.aClass370_3600),
											(byte) 111);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeInt(-49, 1057001181);
							Class79.method541(class11_sub10, -65);
						}
						if (Class141.anInt1915 == 0) {
							int i_14_ = ((Class350.anInt4617 + -(Class300.anInt4051 >> 4)) / 8);
							int i_15_ = ((Class350.anInt4617 - -(Class300.anInt4051 >> 4)) / 8);
							int i_16_ = ((-(Class108_Sub12.anInt6228 >> 4) + Class376_Sub7_Sub3_Sub1.anInt9867) / 8);
							int i_17_ = ((Class376_Sub7_Sub3_Sub1.anInt9867 + (Class108_Sub12.anInt6228 >> 4)) / 8);
							for (int i_18_ = i_14_ - 1; ((1 + i_15_ ^ 0xffffffff) <= (i_18_ ^ 0xffffffff)); i_18_++) {
								for (int i_19_ = -1 + i_16_; ((1 + i_17_ ^ 0xffffffff) <= (i_19_ ^ 0xffffffff)); i_19_++) {
									if (i_18_ < i_14_
											|| i_18_ > i_15_
											|| i_16_ > i_19_
											|| ((i_19_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff))) {
										Class14.aClass146_125.method936(
												(byte) -95, "m" + i_18_ + "_"
														+ i_19_);
										Class14.aClass146_125.method936(
												(byte) -17, "l" + i_18_ + "_"
														+ i_19_);
									}
								}
							}
						}
						if (Class285.anInt3846 != 4) {
							if (Class285.anInt3846 == 8)
								Class83.method575(false, 7);
							else {
								Class83.method575(false, 10);
								if (Class108_Sub2.aClass217_5081 != null) {
									Class11_Sub10 class11_sub10 = (Class11_Sub48
											.method3215(
													Class11_Sub3.aClass25_5113,
													Class88.aClass370_1220,
													(byte) -76));
									Class79.method541(class11_sub10, -20);
								}
							}
						} else
							Class83.method575(false, 3);
						Class376_Sub7_Sub3.method3620(true);
						Class34.method304((byte) -91);
						Class250.method1595((byte) 92);
						Class333.aBool4411 = true;
						if (!Class196.aBool2664)
							break;
						Class314.method1912(
								("Took: "
										+ (-Class167.aLong2151 + Class137
												.method878((byte) -66)) + "ms"),
								(byte) 77);
						Class196.aBool2664 = false;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "lt.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method1469(int i, int i_20_) {
		do {
			try {
				anInt3138++;
				int i_21_ = -7 / ((i - 81) / 45);
				Class134.method864(-64);
				int i_22_ = (((Class71) Class91_Sub1.aClass171_6937.method1119(
						i_20_, (byte) 108)).anInt996);
				if (i_22_ != 0) {
					int i_23_ = (((Class97) Class11_Sub26.aClass97_6296).anIntArray1294[i_20_]);
					if ((i_22_ ^ 0xffffffff) == -7)
						Class101.anInt1357 = i_23_;
					if ((i_22_ ^ 0xffffffff) != -6)
						break;
					Class11_Sub2_Sub23.anInt9269 = i_23_;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "lt.G(" + i + ','
						+ i_20_ + ')');
			}
			break;
		} while (false);
	}

	public static void method1470(int i) {
		try {
			if (i != 0)
				method1474(-54, 19);
			aClass240_3142 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lt.F(" + i + ')');
		}
	}

	final Class11_Sub45 method1471(byte i) {
		try {
			if (i != 106)
				method1469(11, 61);
			anInt3139++;
			Class11_Sub45 class11_sub45 = aClass11_Sub45_3141;
			if (class11_sub45 == ((Class38) aClass38_3140).aClass11_Sub45_515) {
				aClass11_Sub45_3141 = null;
				return null;
			}
			aClass11_Sub45_3141 = ((Class11_Sub45) class11_sub45).aClass11_Sub45_7903;
			return class11_sub45;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lt.B(" + i + ')');
		}
	}

	public Class228() {
		/* empty */
	}

	final Class11_Sub45 method1472(boolean bool) {
		try {
			anInt3146++;
			Class11_Sub45 class11_sub45 = (((Class11_Sub45) ((Class38) aClass38_3140).aClass11_Sub45_515).aClass11_Sub45_7903);
			if (((Class38) aClass38_3140).aClass11_Sub45_515 == class11_sub45) {
				aClass11_Sub45_3141 = null;
				return null;
			}
			aClass11_Sub45_3141 = ((Class11_Sub45) class11_sub45).aClass11_Sub45_7903;
			if (bool != true)
				aClass38_3140 = null;
			return class11_sub45;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lt.A(" + bool + ')');
		}
	}

	static final Class253 method1473(int i, Class146 class146, int i_24_) {
		try {
			if (i != -20770)
				anInt3151 = -26;
			anInt3144++;
			Class253 class253 = ((Class253) Class11_Sub2_Sub14.aClass22_9013
					.method188((long) i_24_, (byte) 98));
			if (class253 == null) {
				do {
					if (!Class94_Sub4.aBool7726) {
						class253 = (Class325.method1978(
								class146.method938(i_24_, i + 20770), 111));
						if (!client.aBool10531)
							break;
					}
					class253 = (Class321_Sub2.aClass163_6648.method1081(
							Class80.method555(class146, i_24_), true));
				} while (false);
				Class11_Sub2_Sub14.aClass22_9013.method184((byte) 127,
						class253, (long) i_24_);
			}
			return class253;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("lt.E(" + i + ',' + (class146 != null ? "{...}" : "null")
							+ ',' + i_24_ + ')'));
		}
	}

	Class228(Class38 class38) {
		try {
			aClass38_3140 = class38;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lt.<init>("
					+ (class38 != null ? "{...}" : "null") + ')');
		}
	}

	static final boolean method1474(int i, int i_25_) {
		try {
			if (i != 0)
				return false;
			anInt3143++;
			if (i_25_ != 3 && i_25_ != 4)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lt.D(" + i + ','
					+ i_25_ + ')');
		}
	}

	static {
		anInt3148 = 0;
		anInt3150 = -1;
	}
}
