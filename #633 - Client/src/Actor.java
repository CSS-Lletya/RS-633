/* Class376_Sub7_Sub5_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Actor extends Class376_Sub7_Sub5 {
	static int anInt10266;
	int anInt10267;
	int anInt10268;
	static int anInt10269;
	int anInt10270;
	static int anInt10271;
	int[] anIntArray10272;
	int anInt10273;
	static int anInt10274;
	byte aByte10275;
	static int anInt10276;
	int anInt10277;
	Class173 aClass173_10278;
	int anInt10279;
	int anInt10280;
	int anInt10281;
	int anInt10282;
	int anInt10283;
	int anInt10284;
	int anInt10285;
	int anInt10286;
	boolean aBool10287;
	int anInt10288 = -1;
	int anInt10289;
	static int anInt10290;
	int anInt10291;
	static int anInt10292;
	static int anInt10293;
	int anInt10294;
	int[] anIntArray10295;
	int anInt10296;
	int anInt10297;
	String aString10298;
	int anInt10299;
	int anInt10300;
	int anInt10301;
	int anInt10302;
	static int anInt10303;
	static int anInt10304;
	int anInt10305;
	static int anInt10306;
	int anInt10307;
	int anInt10308;
	int anInt10309;
	int[] anIntArray10310;
	static int anInt10311;
	static int anInt10312;
	int anInt10313;
	int anInt10314;
	int anInt10315;
	int anInt10316;
	static int anInt10317;
	int anInt10318;
	int anInt10319;
	int anInt10320;
	int anInt10321;
	int anInt10322;
	byte aByte10323;
	int[] anIntArray10324;
	static int anInt10325;
	int anInt10326;
	int anInt10327;
	int anInt10328;
	boolean aBool10329;
	int anInt10330;
	boolean aBool10331;
	byte aByte10332;
	int anInt10333;
	int anInt10334;
	int anInt10335;
	int anInt10336;
	int anInt10337;
	int anInt10338;
	int anInt10339;
	int anInt10340;
	int anInt10341;
	Class208[] aClass208Array10342;
	int anInt10343;
	int anInt10344;
	static int anInt10345;
	int anInt10346;
	int anInt10347;
	int anInt10348;
	int[] anIntArray10349;
	int[] anIntArray10350;
	private int anInt10351;
	int anInt10352;
	static int anInt10353;
	static int anInt10354;
	int anInt10355;
	int anInt10356;
	static int anInt10357;
	byte aByte10358;
	int anInt10359;
	int anInt10360;
	static int anInt10361;
	int faceEntity;
	int anInt10363;
	static int anInt10364;
	int anInt10365;
	private Class173 aClass173_10366;
	private Class173 aClass173_10367;
	int anInt10368;
	Class376_Sub10 aClass376_Sub10_10369;
	int[] anIntArray10370;
	Class206[] aClass206Array10371;
	byte[] aByteArray10372;
	int anInt10373;
	int anInt10374;
	int anInt10375;
	int[] anIntArray10376;
	boolean aBool10377;
	boolean aBool10378;

	final void method3953(int i, int i_0_) {
		try {
			anInt10357++;
			Class39 class39 = method3960(21816);
			if (((Class39) class39).anInt526 != 0
					|| ((Actor) this).anInt10320 != 0) {
				((Actor) this).aClass173_10278
						.method1130(16383);
				int i_1_ = (0x3fff & i_0_
						+ -((Class173) (((Actor) this).aClass173_10278)).anInt2220);
				if (i_1_ > i)
					((Actor) this).anInt10363 = (((Class173) (((Actor) this).aClass173_10278)).anInt2220 + (i_1_ - 16384));
				else
					((Actor) this).anInt10363 = i_1_
							+ ((Class173) (((Actor) this).aClass173_10278)).anInt2220;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wm.DB(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method3954(int i, int i_2_) {
		try {
			int i_3_ = 54 % ((51 - i) / 43);
			anInt10353++;
			anInt10351 = i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wm.IA(" + i + ','
					+ i_2_ + ')');
		}
	}

	final void method3797(boolean bool) {
		do {
			try {
				anInt10364++;
				int i = (anInt10351 - 1 << 8) + 240;
				((Class376_Sub7_Sub5) this).aShort9626 = (short) (-i
						+ ((Class376_Sub7) this).anInt7045 >> 9);
				((Class376_Sub7_Sub5) this).aShort9620 = (short) (i
						+ ((Class376_Sub7) this).anInt7031 >> 9);
				((Class376_Sub7_Sub5) this).aShort9624 = (short) (i
						+ ((Class376_Sub7) this).anInt7045 >> 9);
				((Class376_Sub7_Sub5) this).aShort9629 = (short) (-i
						+ ((Class376_Sub7) this).anInt7031 >> 9);
				if (bool == true)
					break;
				method3959((byte) 7);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "wm.MA(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	abstract int method3955(byte i);

	final int method2867(int i) {
		try {
			anInt10361++;
			if (i == (((Actor) this).anInt10335 ^ 0xffffffff))
				return 0;
			return ((Actor) this).anInt10335;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wm.EA(" + i + ')');
		}
	}

	final void method3956(int i, int i_4_, int i_5_, int i_6_, byte i_7_,
			int i_8_) {
		try {
			anInt10306++;
			int i_9_ = ((((Class376_Sub7_Sub5) this).aShort9624 + ((Class376_Sub7_Sub5) this).aShort9626) >> 1);
			int i_10_ = ((((Class376_Sub7_Sub5) this).aShort9629 + ((Class376_Sub7_Sub5) this).aShort9620) >> 1);
			int i_11_ = Class335.anIntArray4436[i_6_];
			int i_12_ = Class335.anIntArray4430[i_6_];
			int i_13_ = -i_4_ / 2;
			int i_14_ = -i_8_ / 2;
			int i_15_ = i_13_ * i_12_ + i_11_ * i_14_ >> 14;
			int i_16_ = i_14_ * i_12_ + -(i_13_ * i_11_) >> 14;
			if (i_7_ >= -3)
				method3966((byte) 63, null);
			int i_17_ = (Class11_Sub45_Sub4.method3389(
					((Class376_Sub7) this).aByte7047, 18016, i_10_, i_9_, i_15_
							+ ((Class376_Sub7) this).anInt7045,
					((Class376_Sub7) this).anInt7031 + i_16_));
			int i_18_ = i_4_ / 2;
			int i_19_ = -i_8_ / 2;
			int i_20_ = i_12_ * i_18_ + i_11_ * i_19_ >> 14;
			int i_21_ = i_12_ * i_19_ + -(i_18_ * i_11_) >> 14;
			int i_22_ = (Class11_Sub45_Sub4.method3389(
					((Class376_Sub7) this).aByte7047, 18016, i_10_, i_9_, i_20_
							+ ((Class376_Sub7) this).anInt7045,
					((Class376_Sub7) this).anInt7031 - -i_21_));
			int i_23_ = -i_4_ / 2;
			int i_24_ = i_8_ / 2;
			int i_25_ = i_11_ * i_24_ - -(i_12_ * i_23_) >> 14;
			int i_26_ = -(i_11_ * i_23_) + i_12_ * i_24_ >> 14;
			int i_27_ = (Class11_Sub45_Sub4.method3389(
					((Class376_Sub7) this).aByte7047, 18016, i_10_, i_9_,
					((Class376_Sub7) this).anInt7045 - -i_25_,
					((Class376_Sub7) this).anInt7031 - -i_26_));
			int i_28_ = i_4_ / 2;
			int i_29_ = i_8_ / 2;
			int i_30_ = i_11_ * i_29_ - -(i_12_ * i_28_) >> 14;
			int i_31_ = -(i_11_ * i_28_) + i_29_ * i_12_ >> 14;
			int i_32_ = (Class11_Sub45_Sub4.method3389(
					((Class376_Sub7) this).aByte7047, 18016, i_10_, i_9_,
					((Class376_Sub7) this).anInt7045 + i_30_, i_31_
							+ ((Class376_Sub7) this).anInt7031));
			int i_33_ = (i_22_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff) ? i_17_
					: i_22_;
			int i_34_ = (i_32_ ^ 0xffffffff) < (i_27_ ^ 0xffffffff) ? i_27_
					: i_32_;
			int i_35_ = (i_22_ ^ 0xffffffff) > (i_32_ ^ 0xffffffff) ? i_22_
					: i_32_;
			int i_36_ = (i_27_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff) ? i_17_
					: i_27_;
			((Actor) this).anInt10309 = (int) (2607.5945876176133 * Math
					.atan2((double) (i_33_ + -i_34_), (double) i_8_)) & 0x3fff;
			((Actor) this).anInt10302 = 0x3fff & (int) (2607.5945876176133 * Math
					.atan2((double) (i_36_ - i_35_), (double) i_4_));
			if (((((Actor) this).anInt10309 ^ 0xffffffff) != -1)
					&& (i ^ 0xffffffff) != -1) {
				int i_37_ = 16384 + -i;
				if ((((Actor) this).anInt10309 ^ 0xffffffff) >= -8193) {
					if ((((Actor) this).anInt10309 ^ 0xffffffff) < (i ^ 0xffffffff))
						((Actor) this).anInt10309 = i;
				} else if ((i_37_ ^ 0xffffffff) < (((Actor) this).anInt10309 ^ 0xffffffff))
					((Actor) this).anInt10309 = i_37_;
			}
			((Actor) this).anInt10318 = i_17_ - -i_32_;
			if (((((Actor) this).anInt10302 ^ 0xffffffff) != -1)
					&& (i_5_ ^ 0xffffffff) != -1) {
				int i_38_ = -i_5_ + 16384;
				if (((Actor) this).anInt10302 > 8192) {
					if (i_38_ > ((Actor) this).anInt10302)
						((Actor) this).anInt10302 = i_38_;
				} else if ((i_5_ ^ 0xffffffff) > (((Actor) this).anInt10302 ^ 0xffffffff))
					((Actor) this).anInt10302 = i_5_;
			}
			if ((i_27_ + i_22_ ^ 0xffffffff) > (((Actor) this).anInt10318 ^ 0xffffffff))
				((Actor) this).anInt10318 = i_22_ - -i_27_;
			((Actor) this).anInt10318 = (-((Class376_Sub7) this).anInt7036 + (((Actor) this).anInt10318 >> 1));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("wm.WA(" + i + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ','
							+ i_7_ + ',' + i_8_ + ')'));
		}
	}

	final int method2868(byte i) {
		try {
			anInt10311++;
			if (i != 14)
				return 2;
			return ((Actor) this).anInt10356;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wm.GA(" + i + ')');
		}
	}

	int method3957(int i) {
		try {
			anInt10266++;
			Class39 class39 = method3960(21816);
			if (i != (((Class39) class39).anInt565 ^ 0xffffffff))
				return ((Class39) class39).anInt565;
			if (((Actor) this).anInt10335 == -32768)
				return 200;
			return -((Actor) this).anInt10335;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wm.KA(" + i + ')');
		}
	}

	final void sendGraphics(int i, int i_39_, boolean bool, byte i_40_,
			int i_41_, int i_42_) {
		do {
			try {
				anInt10303++;
				if (i_40_ != 114)
					method3964(70);
				int i_43_ = (!bool ? ((Actor) this).anInt10289
						: ((Actor) this).anInt10338);
				if (i != -1 && (i_43_ ^ 0xffffffff) != 0) {
					if ((i_43_ ^ 0xffffffff) != (i ^ 0xffffffff)) {
						Class224 class224 = Class254.aClass227_3495.method1465(
								i, (byte) 67);
						Class224 class224_44_ = Class254.aClass227_3495
								.method1465(i_43_, (byte) 125);
						if ((((Class224) class224).anInt3079 ^ 0xffffffff) != 0
								&& ((Class224) class224_44_).anInt3079 != -1) {
							Class281 class281 = (Class108_Sub23.aClass198_7760
									.method1284(
											((Class224) class224).anInt3079,
											(byte) -85));
							Class281 class281_45_ = (Class108_Sub23.aClass198_7760
									.method1284(
											((Class224) class224_44_).anInt3079,
											(byte) -29));
							if (((Class281) class281).anInt3792 < ((Class281) class281_45_).anInt3792)
								break;
						}
					} else {
						Class224 class224 = Class254.aClass227_3495.method1465(
								i, (byte) -121);
						if (((Class224) class224).aBool3073
								&& ((Class224) class224).anInt3079 != -1) {
							Class281 class281 = (Class108_Sub23.aClass198_7760
									.method1284(
											((Class224) class224).anInt3079,
											(byte) 109));
							int i_46_ = ((Class281) class281).anInt3816;
							if (i_46_ == 0)
								break;
							if (i_46_ == 2) {
								if (bool)
									((Actor) this).anInt10270 = 0;
								else {
									((Actor) this).anInt10340 = 0;
									break;
								}
								break;
							}
						}
					}
				}
				int i_47_ = Class11_Sub25.anInt6279;
				if (bool) {
					((Actor) this).anInt10347 = i_41_ >> 16;
					((Actor) this).anInt10280 = i_47_
							- -(0xffff & i_41_);
					((Actor) this).anInt10314 = 0;
					((Actor) this).anInt10334 = i_42_;
					((Actor) this).anInt10316 = i_39_;
					((Actor) this).anInt10338 = i;
					((Actor) this).anInt10273 = 0;
					((Actor) this).anInt10313 = 1;
					if ((i_47_ ^ 0xffffffff) > (((Actor) this).anInt10280 ^ 0xffffffff))
						((Actor) this).anInt10314 = -1;
					if (((Actor) this).anInt10338 != -1
							&& (((Actor) this).anInt10280 == i_47_)) {
						int i_48_ = (((Class224) (Class254.aClass227_3495
								.method1465(
										((Actor) this).anInt10338,
										(byte) -64))).anInt3079);
						if (i_48_ != -1) {
							Class281 class281 = Class108_Sub23.aClass198_7760
									.method1284(i_48_, (byte) -35);
							if (class281 != null
									&& ((Class281) class281).anIntArray3794 != null
									&& !(((Actor) this).aBool10331))
								Class268.method1690(i_40_ + -701645058, 0,
										this, class281);
						}
					}
				} else {
					((Actor) this).anInt10301 = i_47_
							+ (0xffff & i_41_);
					((Actor) this).anInt10289 = i;
					((Actor) this).anInt10284 = 0;
					((Actor) this).anInt10337 = i_39_;
					((Actor) this).anInt10297 = i_42_;
					((Actor) this).anInt10299 = i_41_ >> 16;
					((Actor) this).anInt10327 = 0;
					((Actor) this).anInt10281 = 1;
					if ((((Actor) this).anInt10301 ^ 0xffffffff) < (i_47_ ^ 0xffffffff))
						((Actor) this).anInt10327 = -1;
					if ((((Actor) this).anInt10289 ^ 0xffffffff) == 0
							|| (((Actor) this).anInt10301 != i_47_))
						break;
					int i_49_ = ((Class224) (Class254.aClass227_3495
							.method1465(
									((Actor) this).anInt10289,
									(byte) -86))).anInt3079;
					if (i_49_ == -1)
						break;
					Class281 class281 = Class108_Sub23.aClass198_7760
							.method1284(i_49_, (byte) 110);
					if (class281 == null
							|| ((Class281) class281).anIntArray3794 == null
							|| ((Actor) this).aBool10331)
						break;
					Class268.method1690(-701644944, 0, this, class281);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("wm.BB(" + i + ','
						+ i_39_ + ',' + bool + ',' + i_40_ + ',' + i_41_ + ','
						+ i_42_ + ')'));
			}
			break;
		} while (false);
	}

	final int method3959(byte i) {
		try {
			if (i < 26)
				method3960(92);
			anInt10317++;
			Class39 class39 = method3960(21816);
			int i_50_ = (((Class173) ((Actor) this).aClass173_10278).anInt2220);
			boolean bool;
			if ((((Class39) class39).anInt526 ^ 0xffffffff) != -1)
				bool = (((Actor) this).aClass173_10278
						.method1138(16383,
								((Actor) this).anInt10363,
								((Class39) class39).anInt526,
								((Class39) class39).anInt521));
			else
				bool = (((Actor) this).aClass173_10278
						.method1138(16383,
								((Actor) this).anInt10363,
								((Actor) this).anInt10320,
								((Actor) this).anInt10320));
			int i_51_ = (((Class173) (((Actor) this).aClass173_10278)).anInt2220 - i_50_);
			if (i_51_ == 0) {
				((Actor) this).anInt10321 = 0;
				((Actor) this).aClass173_10278.method1137(
						-24223, ((Actor) this).anInt10363);
			} else
				((Actor) this).anInt10321++;
			if (bool) {
				if (((Class39) class39).anInt541 != 0) {
					if ((i_51_ ^ 0xffffffff) >= -1)
						aClass173_10366.method1138(16383,
								-((Class39) class39).anInt562,
								((Class39) class39).anInt541,
								((Class39) class39).anInt543);
					else
						aClass173_10366.method1138(16383,
								((Class39) class39).anInt562,
								((Class39) class39).anInt541,
								((Class39) class39).anInt543);
				}
				if (((Class39) class39).anInt550 != 0)
					aClass173_10367.method1138(16383,
							((Class39) class39).anInt563,
							((Class39) class39).anInt550,
							((Class39) class39).anInt536);
			} else {
				if (((Class39) class39).anInt541 != 0)
					aClass173_10366.method1138(16383, 0,
							((Class39) class39).anInt541,
							((Class39) class39).anInt543);
				else
					aClass173_10366.method1137(-24223, 0);
				if (((Class39) class39).anInt550 == 0)
					aClass173_10367.method1137(-24223, 0);
				else
					aClass173_10367.method1138(16383, 0,
							((Class39) class39).anInt550,
							((Class39) class39).anInt536);
			}
			return i_51_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wm.NA(" + i + ')');
		}
	}

	final Class39 method3960(int i) {
		try {
			if (i != 21816)
				return null;
			anInt10269++;
			int i_52_ = method3964(2);
			if ((i_52_ ^ 0xffffffff) != 0)
				return Class108_Sub26.aClass127_7833.method829(i_52_, 64);
			return Class58_Sub1.aClass39_7287;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wm.FB(" + i + ')');
		}
	}

	final boolean method2863(int i) {
		try {
			if (i > -106)
				((Actor) this).aClass376_Sub10_10369 = null;
			anInt10312++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wm.AA(" + i + ')');
		}
	}

	final void method3961(boolean bool, int i, int i_53_) {
		try {
			anInt10354++;
			int i_54_ = 108 / ((-50 - i) / 54);
			Class39 class39 = method3960(21816);
			if (bool || ((Class39) class39).anInt526 != 0
					|| ((Actor) this).anInt10320 != 0) {
				((Actor) this).anInt10363 = i_53_ & 0x3fff;
				((Actor) this).aClass173_10278.method1137(
						-24223, ((Actor) this).anInt10363);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wm.IB(" + bool + ','
					+ i + ',' + i_53_ + ')'));
		}
	}

	final void method3962(boolean bool, Class33 class33, Class163 class163,
			Class206[] class206s, boolean bool_55_) {
		do {
			try {
				if (bool_55_) {
					if (((Actor) this).aClass376_Sub10_10369 != null)
						((Actor) this).aClass376_Sub10_10369
								.method3168((long) Class11_Sub25.anInt6279);
				} else {
					Class206 class206 = class206s[0];
					Class206 class206_56_ = class206s[1];
					Class206 class206_57_ = class206s[2];
					if (class206 != null) {
						class206.method1318(class33);
						int i = 0;
						int i_58_ = 0;
						int i_59_ = 0;
						int i_60_ = 0;
						Class110[] class110s = class206.method1307();
						Class261[] class261s = class206.method1325();
						if (class110s != null) {
							i += class110s.length;
							i_58_++;
						}
						if (class261s != null) {
							i_59_ += class261s.length;
							i_60_++;
						}
						Class110[] class110s_61_ = null;
						Class261[] class261s_62_ = null;
						if (class206_56_ != null) {
							class206_56_.method1318(class33);
							class110s_61_ = class206_56_.method1307();
							class261s_62_ = class206_56_.method1325();
						}
						if (class110s_61_ != null) {
							i += class110s_61_.length;
							i_58_++;
						}
						if (class261s_62_ != null) {
							i_59_ += class261s_62_.length;
							i_60_++;
						}
						Class110[] class110s_63_ = null;
						Class261[] class261s_64_ = null;
						if (class206_57_ != null) {
							class206_57_.method1318(class33);
							class110s_63_ = class206_57_.method1307();
							class261s_64_ = class206_57_.method1325();
						}
						if (class110s_63_ != null) {
							i_58_++;
							i += class110s_63_.length;
						}
						if (class261s_64_ != null) {
							i_60_++;
							i_59_ += class261s_64_.length;
						}
						if (((((Actor) this).aClass376_Sub10_10369) == null || ((Class376_Sub10) (((Actor) this).aClass376_Sub10_10369)).aBool7877)
								&& ((i_58_ ^ 0xffffffff) < -1 || i_60_ > 0))
							((Actor) this).aClass376_Sub10_10369 = Class376_Sub10
									.method3166((Class11_Sub25.anInt6279), true);
						if ((((Actor) this).aClass376_Sub10_10369) != null) {
							Object object = null;
							Class110[] class110s_65_;
							if ((i_58_ ^ 0xffffffff) != -2) {
								class110s_65_ = new Class110[i];
								int i_66_ = 0;
								if (class110s != null) {
									Class311.method1901(class110s, 0,
											class110s_65_, i_66_,
											class110s.length);
									i_66_ += class110s.length;
								}
								if (class110s_61_ != null) {
									Class311.method1901(class110s_61_, 0,
											class110s_65_, i_66_,
											class110s_61_.length);
									i_66_ += class110s_61_.length;
								}
								if (class110s_63_ != null)
									Class311.method1901(class110s_63_, 0,
											class110s_65_, i_66_,
											class110s_63_.length);
							} else if (class110s_61_ == null) {
								if (class110s_63_ != null)
									class110s_65_ = class110s_63_;
								else
									class110s_65_ = class110s;
							} else
								class110s_65_ = class110s_61_;
							Object object_67_ = null;
							Class261[] class261s_68_;
							if ((i_60_ ^ 0xffffffff) != -2) {
								class261s_68_ = new Class261[i_59_];
								int i_69_ = 0;
								if (class261s != null) {
									Class311.method1901(class261s, 0,
											class261s_68_, i_69_,
											class261s.length);
									i_69_ += class261s.length;
								}
								if (class261s_62_ != null) {
									Class311.method1901(class261s_62_, 0,
											class261s_68_, i_69_,
											class261s_62_.length);
									i_69_ += class261s_62_.length;
								}
								if (class261s_64_ != null)
									Class311.method1901(class261s_64_, 0,
											class261s_68_, i_69_,
											class261s_64_.length);
							} else if (class261s_62_ == null) {
								if (class261s_64_ != null)
									class261s_68_ = class261s_64_;
								else
									class261s_68_ = class261s;
							} else
								class261s_68_ = class261s_62_;
							((Actor) this).aClass376_Sub10_10369
									.method3176(class163,
											(long) Class11_Sub25.anInt6279,
											class110s_65_, class261s_68_, false);
						}
						((Actor) this).aBool10377 = true;
					}
				}
				anInt10274++;
				if (bool == true) {
					if (((Actor) this).aClass376_Sub10_10369 == null)
						break;
					((Actor) this).aClass376_Sub10_10369
							.method3170(((Class376_Sub7) this).aByte7047,
									((Class376_Sub7_Sub5) this).aShort9626,
									((Class376_Sub7_Sub5) this).aShort9624,
									((Class376_Sub7_Sub5) this).aShort9629,
									((Class376_Sub7_Sub5) this).aShort9620);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("wm.AB(" + bool
						+ ',' + (class33 != null ? "{...}" : "null") + ','
						+ (class163 != null ? "{...}" : "null") + ','
						+ (class206s != null ? "{...}" : "null") + ','
						+ bool_55_ + ')'));
			}
			break;
		} while (false);
	}

	final void method3963(int i, int[] is, int[] is_70_) {
		try {
			anInt10271++;
			if (((Actor) this).anIntArray10349 == null
					&& is != null)
				((Actor) this).anIntArray10349 = new int[12];
			else if (is == null) {
				((Actor) this).anIntArray10349 = null;
				return;
			}
			for (int i_71_ = i; (i_71_ < ((Actor) this).anIntArray10349.length); i_71_++)
				((Actor) this).anIntArray10349[i_71_] = -1;
			for (int i_72_ = 0; (i_72_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_72_++) {
				int i_73_ = is_70_[i_72_];
				for (int i_74_ = 0; (i_74_ ^ 0xffffffff) > ((((Actor) this).anIntArray10349).length ^ 0xffffffff); i_74_++) {
					if ((0x1 & i_73_ ^ 0xffffffff) != -1)
						((Actor) this).anIntArray10349[i_74_] = is[i_72_];
					i_73_ >>= 1;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wm.HB(" + i + ','
					+ (is != null ? "{...}" : "null") + ','
					+ (is_70_ != null ? "{...}" : "null") + ')'));
		}
	}

	abstract int method3964(int i);

	protected final void finalize() {
		do {
			try {
				anInt10345++;
				if (((Actor) this).aClass376_Sub10_10369 == null)
					break;
				((Actor) this).aClass376_Sub10_10369
						.method3171();
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						"wm.finalize(" + ')');
			}
			break;
		} while (false);
	}

	final void method3965(int i, int i_75_, int i_76_, int i_77_) {
		try {
			anInt10276++;
			for (int i_78_ = i; i_78_ < 4; i_78_++) {
				if (((Actor) this).anIntArray10295[i_78_] <= i_75_) {
					((Actor) this).anIntArray10310[i_78_] = i_76_;
					((Actor) this).anIntArray10350[i_78_] = i_77_;
					((Actor) this).anIntArray10295[i_78_] = i_75_ + 70;
					break;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wm.GB(" + i + ','
					+ i_75_ + ',' + i_76_ + ',' + i_77_ + ')'));
		}
	}

	public Actor() {
		super(0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
		((Actor) this).anInt10284 = 0;
		((Actor) this).anInt10277 = 0;
		((Actor) this).anInt10300 = -1;
		((Actor) this).aString10298 = null;
		((Actor) this).anIntArray10272 = null;
		((Actor) this).anInt10281 = -1;
		((Actor) this).anInt10273 = 0;
		((Actor) this).anInt10283 = -1;
		((Actor) this).anInt10285 = 100;
		((Actor) this).anInt10270 = 0;
		((Actor) this).anInt10313 = -1;
		((Actor) this).anInt10314 = 0;
		((Actor) this).anIntArray10310 = new int[4];
		((Actor) this).anInt10286 = 0;
		((Actor) this).anInt10326 = 0;
		((Actor) this).aByte10332 = (byte) 0;
		((Actor) this).anInt10296 = 0;
		((Actor) this).anInt10267 = 0;
		((Actor) this).anInt10316 = -1;
		((Actor) this).aBool10287 = false;
		((Actor) this).anInt10282 = 0;
		((Actor) this).anInt10338 = -1;
		((Actor) this).aBool10329 = false;
		((Actor) this).anInt10289 = -1;
		((Actor) this).anInt10335 = -32768;
		((Actor) this).anInt10337 = -1;
		((Actor) this).anInt10279 = 0;
		((Actor) this).anInt10344 = -1;
		((Actor) this).anInt10321 = 0;
		((Actor) this).aClass208Array10342 = new Class208[12];
		((Actor) this).anInt10343 = 0;
		((Actor) this).anInt10305 = 0;
		((Actor) this).anInt10340 = 0;
		anInt10351 = 1;
		((Actor) this).anInt10320 = 256;
		((Actor) this).anInt10327 = 0;
		((Actor) this).anInt10346 = 0;
		((Actor) this).aBool10331 = true;
		((Actor) this).anInt10307 = 0;
		((Actor) this).anInt10352 = -1;
		((Actor) this).anInt10291 = -1;
		((Actor) this).anInt10356 = 0;
		((Actor) this).anInt10322 = 0;
		((Actor) this).anInt10360 = -1;
		((Actor) this).anInt10359 = -1000;
		((Actor) this).anInt10355 = -1000;
		((Actor) this).faceEntity = -1;
		((Actor) this).anIntArray10350 = new int[4];
		((Actor) this).anIntArray10295 = new int[4];
		((Actor) this).aClass173_10278 = new Class173();
		aClass173_10366 = new Class173();
		aClass173_10367 = new Class173();
		((Actor) this).anInt10368 = 0;
		((Actor) this).aByteArray10372 = new byte[10];
		((Actor) this).anInt10373 = 0;
		((Actor) this).aClass206Array10371 = new Class206[3];
		((Actor) this).anIntArray10376 = new int[10];
		((Actor) this).anIntArray10370 = new int[10];
		((Actor) this).anInt10375 = 0;
		((Actor) this).anInt10374 = 0;
		((Actor) this).aBool10377 = false;
		((Actor) this).aBool10378 = false;
	}

	final void method3966(byte i, Class206 class206) {
		try {
			anInt10293++;
			int i_79_ = ((Class173) aClass173_10366).anInt2220;
			int i_80_ = ((Class173) aClass173_10367).anInt2220;
			if (i > -84)
				((Actor) this).anInt10334 = 122;
			if ((i_79_ ^ 0xffffffff) != -1 || (i_80_ ^ 0xffffffff) != -1) {
				int i_81_ = class206.fa() / 2;
				class206.H(0, -i_81_, 0);
				class206.VA(i_79_ & 0x3fff);
				class206.FA(0x3fff & i_80_);
				class206.H(0, i_81_, 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wm.CB(" + i + ','
					+ (class206 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3967(int i) {
		try {
			if (i != -876801394)
				((Actor) this).anInt10267 = 67;
			((Actor) this).anInt10375 = 0;
			((Actor) this).anInt10368 = 0;
			anInt10292++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wm.PA(" + i + ')');
		}
	}

	final boolean method2870(boolean bool) {
		try {
			if (bool != false)
				return true;
			anInt10325++;
			return ((Actor) this).aBool10378;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wm.DA(" + bool + ')');
		}
	}

	int method3968(byte i) {
		try {
			anInt10290++;
			if (i != 127)
				sendGraphics(-124, 83, false, (byte) 70, 98, -13);
			return anInt10351;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wm.I(" + i + ')');
		}
	}

	final boolean method3969(int i, boolean bool, int i_82_) {
		try {
			anInt10304++;
			if (((Actor) this).anIntArray10324 == null) {
				if ((i_82_ ^ 0xffffffff) == 0)
					return true;
				((Actor) this).anIntArray10324 = new int[12];
				for (int i_83_ = 0; (i_83_ ^ 0xffffffff) > -13; i_83_++)
					((Actor) this).anIntArray10324[i_83_] = -1;
			}
			if (bool != true)
				method3957(7);
			Class39 class39 = method3960(21816);
			int i_84_ = 256;
			if (((Class39) class39).anIntArray537 != null
					&& ((Class39) class39).anIntArray537[i] > 0)
				i_84_ = ((Class39) class39).anIntArray537[i];
			if (i_82_ == -1) {
				if (((Actor) this).anIntArray10324[i] == -1)
					return true;
				int i_85_ = ((Actor) this).aClass173_10278
						.method1140(-1);
				int i_86_ = ((Actor) this).anIntArray10324[i];
				int i_87_ = i_85_ + -i_86_;
				if (-i_84_ <= i_87_
						&& (i_87_ ^ 0xffffffff) >= (i_84_ ^ 0xffffffff)) {
					((Actor) this).anIntArray10324[i] = -1;
					for (int i_88_ = 0; i_88_ < 12; i_88_++) {
						if ((((Actor) this).anIntArray10324[i_88_]) != -1)
							return true;
					}
					((Actor) this).anIntArray10324 = null;
					return true;
				}
				if (((i_87_ ^ 0xffffffff) >= -1 || i_87_ > 8192)
						&& i_87_ > -8192)
					((Actor) this).anIntArray10324[i] = Class77
							.method529(-i_84_ + i_86_, 16383);
				else
					((Actor) this).anIntArray10324[i] = Class77
							.method529(i_86_ + i_84_, 16383);
				return false;
			}
			if ((((Actor) this).anIntArray10324[i] ^ 0xffffffff) == 0)
				((Actor) this).anIntArray10324[i] = ((Actor) this).aClass173_10278
						.method1140(-1);
			int i_89_ = ((Actor) this).anIntArray10324[i];
			int i_90_ = -i_89_ + i_82_;
			if ((-i_84_ ^ 0xffffffff) >= (i_90_ ^ 0xffffffff)
					&& (i_90_ ^ 0xffffffff) >= (i_84_ ^ 0xffffffff)) {
				((Actor) this).anIntArray10324[i] = i_82_;
				return true;
			}
			if ((i_90_ ^ 0xffffffff) < -1 && (i_90_ ^ 0xffffffff) >= -8193
					|| i_90_ <= -8192)
				((Actor) this).anIntArray10324[i] = Class77
						.method529(i_84_ + i_89_, 16383);
			else
				((Actor) this).anIntArray10324[i] = Class77
						.method529(-i_84_ + i_89_, 16383);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wm.EB(" + i + ','
					+ bool + ',' + i_82_ + ')'));
		}
	}
}
