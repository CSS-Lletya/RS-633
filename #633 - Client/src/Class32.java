/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class32 {
	private static Class353 aClass353_413;
	private static Class213 aClass213_414 = new Class213(16);
	static Class290 aClass290_415;
	static Class146 aClass146_416;
	private static Class302 aClass302_417;
	static Class11_Sub45_Sub19 aClass11_Sub45_Sub19_418;
	static Class29 aClass29_419;
	static Class280 aClass280_420;
	static Interface20 anInterface20_421;
	static int anInt422;
	private static short[] aShortArray423 = new short[1];
	static byte[][][] aByteArrayArrayArray424;
	static Class84 aClass84_425;
	static int anInt426 = (int) (Math.random() * 17.0) - 8;
	private static byte[] aByteArray427;
	static float aFloat428;
	static float aFloat429;
	static int anInt430 = (int) (Math.random() * 11.0) - 5;
	static Class342 aClass342_431;
	static int anInt432;
	static int anInt433;
	private static Class131[][][] aClass131ArrayArrayArray434;
	static int anInt435;
	static int anInt436;
	private static byte[] aByteArray437;
	private static int[] anIntArray438;
	static int anInt439;
	static int anInt440;
	static int anInt441;
	private static byte[] aByteArray442;
	private static byte[] aByteArray443;
	private static short[] aShortArray444;
	static int anInt445;
	private static short[] aShortArray446;
	static int anInt447;
	static int anInt448;
	private static Class213 aClass213_449;
	private static byte[] aByteArray450;
	static int anInt451;
	private static byte[] aByteArray452;
	static int anInt453;

	static final void method261(Class163 class163) {
		int i = anInt433 - anInt439;
		int i_0_ = anInt435 - anInt440;
		int i_1_ = (anInt445 - anInt453 << 16) / i;
		int i_2_ = (anInt448 - anInt436 << 16) / i_0_;
		method265(class163, i_1_, i_2_, 0, 0);
	}

	private static final int method262(Interface1 interface1, int i, int i_3_,
			int i_4_) {
		Class233 class233 = aClass302_417.method1865(4, i);
		if (class233 == null)
			return 0;
		int i_5_ = ((Class233) class233).anInt3188;
		if (i_5_ >= 0
				&& ((Class188) interface1.method7((byte) 127, i_5_)).aBool2416)
			i_5_ = -1;
		int i_6_;
		if (((Class233) class233).anInt3183 >= 0) {
			int i_7_ = ((Class233) class233).anInt3183;
			int i_8_ = (i_7_ & 0x7f) + i_4_;
			if (i_8_ < 0)
				i_8_ = 0;
			else if (i_8_ > 127)
				i_8_ = 127;
			int i_9_ = (i_7_ + i_3_ & 0xfc00) + (i_7_ & 0x380) + i_8_;
			i_6_ = (~0xffffff | (Class219_Sub1.anIntArray7248[(Class147
					.method942(0, Class163_Sub2_Sub1.method3404(2241, 96, i_9_)) & 0xffff)]));
		} else if (i_5_ >= 0)
			i_6_ = (~0xffffff | (Class219_Sub1.anIntArray7248[Class147
					.method942(0, (Class163_Sub2_Sub1
							.method3404(2241, 96, (((Class188) interface1
									.method7((byte) 127, i_5_)).aShort2413)))) & 0xffff]));
		else if (((Class233) class233).anInt3187 == -1)
			i_6_ = 0;
		else {
			int i_10_ = ((Class233) class233).anInt3187;
			int i_11_ = (i_10_ & 0x7f) + i_4_;
			if (i_11_ < 0)
				i_11_ = 0;
			else if (i_11_ > 127)
				i_11_ = 127;
			int i_12_ = (i_10_ + i_3_ & 0xfc00) + (i_10_ & 0x380) + i_11_;
			i_6_ = (~0xffffff | (Class219_Sub1.anIntArray7248[(Class147
					.method942(0,
							Class163_Sub2_Sub1.method3404(2241, 96, i_12_)) & 0xffff)]));
		}
		return i_6_;
	}

	static final void method263(Interface1 interface1, int i, int i_13_) {
		for (int i_14_ = 0; i_14_ < ((Class302) aClass302_417).anInt4072; i_14_++)
			anIntArray438[i_14_ + 1] = method262(interface1, i_14_, i, i_13_);
	}

	static final Class11_Sub45_Sub19 method264(int i, int i_15_) {
		for (Class11_Sub45_Sub19 class11_sub45_sub19 = (Class11_Sub45_Sub19) aClass213_414
				.method1365(24490); class11_sub45_sub19 != null; class11_sub45_sub19 = (Class11_Sub45_Sub19) aClass213_414
				.method1367((byte) 71)) {
			if (((Class11_Sub45_Sub19) class11_sub45_sub19).aBool9699
					&& class11_sub45_sub19.method3819(i, 12800, i_15_))
				return class11_sub45_sub19;
		}
		return null;
	}

	private static final void method265(Class163 class163, int i, int i_16_,
			int i_17_, int i_18_) {
		int i_19_ = anInt433 - anInt439;
		int i_20_ = anInt435 - anInt440;
		if (anInt433 < anInt432)
			i_19_++;
		if (anInt435 < anInt447)
			i_20_++;
		for (int i_21_ = 0; i_21_ < i_19_; i_21_++) {
			int i_22_ = (i_17_ + i * i_21_ >> 16) + anInt453;
			int i_23_ = (i_17_ + i * (i_21_ + 1) >> 16) + anInt453;
			int i_24_ = i_23_ - i_22_;
			if (i_24_ > 0) {
				int i_25_ = anInt439 + i_21_;
				if (i_25_ < 0 || i_25_ >= anInt432) {
					for (int i_26_ = 0; i_26_ < i_20_; i_26_++) {
						int i_27_ = anInt448
								- (i_18_ + i_16_ * (i_26_ + 1) >> 16);
						int i_28_ = anInt448 - (i_18_ + i_16_ * i_26_ >> 16);
						int i_29_ = i_28_ - i_27_;
						int i_30_;
						if ((((Class11_Sub45_Sub19) aClass11_Sub45_Sub19_418).anInt9698) != -1)
							i_30_ = ~0xffffff
									| (((Class11_Sub45_Sub19) aClass11_Sub45_Sub19_418).anInt9698);
						else if ((i_21_ + anInt439 & 0x4) != (i_26_ + anInt435 & 0x4))
							i_30_ = -11840664;
						else
							i_30_ = (anIntArray438[((Class302) aClass302_417).anInt4074 + 1]);
						if (i_30_ == 0)
							i_30_ = -16777216;
						class163.aa(i_22_, i_27_, i_24_, i_29_, i_30_, 0);
					}
				} else {
					for (int i_31_ = 0; i_31_ < i_20_; i_31_++) {
						int i_32_ = anInt448
								- (i_18_ + i_16_ * (i_31_ + 1) >> 16);
						int i_33_ = anInt448 - (i_18_ + i_16_ * i_31_ >> 16);
						int i_34_ = i_33_ - i_32_;
						if (i_34_ > 0) {
							int i_35_ = i_31_ + anInt440;
							int i_36_ = i_25_ + i_35_ * anInt432;
							int i_37_ = 0;
							int i_38_ = 0;
							int i_39_ = 0;
							if (i_35_ >= 0 && i_35_ < anInt447) {
								i_37_ = ((aByteArray443[i_36_] & 0xff) << 16 | aShortArray444[i_36_] & 0xffff);
								if (i_37_ != 0)
									i_37_ |= ~0xffffff;
								i_38_ = aByteArray442[i_36_] & 0xff;
								i_39_ = aShortArray446[i_36_] & 0xffff;
							}
							if (i_37_ == 0 && i_38_ == 0 && i_39_ == 0) {
								if (((Class11_Sub45_Sub19) aClass11_Sub45_Sub19_418).anInt9698 != -1)
									i_37_ = (~0xffffff | (((Class11_Sub45_Sub19) aClass11_Sub45_Sub19_418).anInt9698));
								else if ((i_21_ + anInt439 & 0x4) != (i_31_
										+ anInt435 & 0x4))
									i_37_ = -11840664;
								else
									i_37_ = (anIntArray438[(((Class302) aClass302_417).anInt4074) + 1]);
								if (i_37_ == 0)
									i_37_ = -16777216;
								class163.aa(i_22_, i_32_, i_24_, i_34_, i_37_,
										0);
							} else if (i_39_ > 0) {
								if (i_39_ == 65535) {
									Class11_Sub1 class11_sub1 = ((Class11_Sub1) (aClass213_449
											.method1369(
													(byte) 26,
													(long) (i_25_ << 16 | i_35_))));
									if (class11_sub1 != null)
										method284(
												class163,
												i_22_,
												i_32_,
												i_24_,
												i_34_,
												i_37_,
												i_38_,
												aByteArray452[i_36_],
												(((Class11_Sub1) class11_sub1).aShortArray5034),
												(((Class11_Sub1) class11_sub1).aByteArray5035),
												true);
								} else {
									aShortArray423[0] = (short) (i_39_ - 1);
									aByteArray427[0] = aByteArray437[i_36_];
									method284(class163, i_22_, i_32_, i_24_,
											i_34_, i_37_, i_38_,
											aByteArray452[i_36_],
											aShortArray423, aByteArray427, true);
								}
							} else
								method284(class163, i_22_, i_32_, i_24_, i_34_,
										i_37_, i_38_, aByteArray452[i_36_],
										null, null, true);
						}
					}
				}
			}
		}
		for (int i_40_ = -16; i_40_ < i_19_ + 16; i_40_++) {
			int i_41_ = (i_17_ + i * i_40_ >> 16) + anInt453;
			int i_42_ = (i_17_ + i * (i_40_ + 1) >> 16) + anInt453;
			int i_43_ = i_42_ - i_41_;
			if (i_43_ > 0) {
				int i_44_ = i_40_ + anInt439;
				if (i_44_ >= 0 && i_44_ < anInt432) {
					for (int i_45_ = -16; i_45_ < i_20_ + 16; i_45_++) {
						int i_46_ = anInt448
								- (i_18_ + i_16_ * (i_45_ + 1) >> 16);
						int i_47_ = anInt448 - (i_18_ + i_16_ * i_45_ >> 16);
						int i_48_ = i_47_ - i_46_;
						if (i_48_ > 0) {
							int i_49_ = i_45_ + anInt440;
							if (i_49_ >= 0 && i_49_ < anInt447) {
								int i_50_ = (aShortArray446[i_44_ + i_49_
										* anInt432] & 0xffff);
								if (i_50_ > 0) {
									if (i_50_ == 65535) {
										Class11_Sub1 class11_sub1 = ((Class11_Sub1) (aClass213_449
												.method1369(
														(byte) 26,
														(long) (i_44_ << 16 | i_49_))));
										if (class11_sub1 != null)
											method283(
													class163,
													i_41_,
													i_46_,
													i_43_,
													i_48_,
													(((Class11_Sub1) class11_sub1).aShortArray5034),
													(((Class11_Sub1) class11_sub1).aByteArray5035));
									} else {
										aShortArray423[0] = (short) (i_50_ - 1);
										aByteArray427[0] = (aByteArray437[i_44_
												+ i_49_ * anInt432]);
										method283(class163, i_41_, i_46_,
												i_43_, i_48_, aShortArray423,
												aByteArray427);
									}
								} else
									method283(class163, i_41_, i_46_, i_43_,
											i_48_, null, null);
							}
						}
					}
				}
			}
		}
		int i_51_ = anInt439 >> 6;
		int i_52_ = anInt440 >> 6;
		if (i_51_ < 0)
			i_51_ = 0;
		if (i_52_ < 0)
			i_52_ = 0;
		int i_53_ = anInt433 >> 6;
		int i_54_ = anInt435 >> 6;
		if (i_53_ >= aClass131ArrayArrayArray434[0].length)
			i_53_ = aClass131ArrayArrayArray434[0].length - 1;
		if (i_54_ >= aClass131ArrayArrayArray434[0][0].length)
			i_54_ = aClass131ArrayArrayArray434[0][0].length - 1;
		for (int i_55_ = 0; i_55_ < 3; i_55_++) {
			for (int i_56_ = i_51_; i_56_ <= i_53_; i_56_++) {
				for (int i_57_ = i_52_; i_57_ <= i_54_; i_57_++) {
					Class131 class131 = aClass131ArrayArrayArray434[i_55_][i_56_][i_57_];
					if (class131 != null) {
						int i_58_ = (i_56_ + (anInt441 >> 6)) * 64;
						int i_59_ = (i_57_ + (anInt451 >> 6)) * 64;
						for (Class376_Sub9 class376_sub9 = (Class376_Sub9) class131
								.method847(-31182); class376_sub9 != null; class376_sub9 = (Class376_Sub9) class131
								.method856(29)) {
							int i_60_ = (i_58_
									+ ((Class376_Sub9) class376_sub9).aByte7860
									- anInt441 - anInt439);
							int i_61_ = (i_59_
									+ ((Class376_Sub9) class376_sub9).aByte7856
									- anInt451 - anInt440);
							int i_62_ = (i_17_ + i * i_60_ >> 16) + anInt453;
							int i_63_ = (i_17_ + i * (i_60_ + 1) >> 16)
									+ anInt453;
							int i_64_ = anInt448
									- (i_18_ + i_16_ * (i_61_ + 1) >> 16);
							int i_65_ = anInt448
									- (i_18_ + i_16_ * i_61_ >> 16);
							method284(
									class163,
									i_62_,
									i_64_,
									i_63_ - i_62_,
									i_65_ - i_64_,
									(((Class376_Sub9) class376_sub9).anInt7859),
									(((Class376_Sub9) class376_sub9).aByte7857) & 0xff,
									(((Class376_Sub9) class376_sub9).aByte7854),
									(((Class376_Sub9) class376_sub9).aShortArray7858),
									(((Class376_Sub9) class376_sub9).aByteArray7855),
									false);
						}
					}
				}
			}
			for (int i_66_ = i_51_; i_66_ <= i_53_; i_66_++) {
				for (int i_67_ = i_52_; i_67_ <= i_54_; i_67_++) {
					Class131 class131 = aClass131ArrayArrayArray434[i_55_][i_66_][i_67_];
					if (class131 != null) {
						int i_68_ = (i_66_ + (anInt441 >> 6)) * 64;
						int i_69_ = (i_67_ + (anInt451 >> 6)) * 64;
						for (Class376_Sub9 class376_sub9 = (Class376_Sub9) class131
								.method847(-31182); class376_sub9 != null; class376_sub9 = (Class376_Sub9) class131
								.method856(110)) {
							int i_70_ = (i_68_
									+ ((Class376_Sub9) class376_sub9).aByte7860
									- anInt441 - anInt439);
							int i_71_ = (i_69_
									+ ((Class376_Sub9) class376_sub9).aByte7856
									- anInt451 - anInt440);
							int i_72_ = (i_17_ + i * i_70_ >> 16) + anInt453;
							int i_73_ = (i_17_ + i * (i_70_ + 1) >> 16)
									+ anInt453;
							int i_74_ = anInt448
									- (i_18_ + i_16_ * (i_71_ + 1) >> 16);
							int i_75_ = anInt448
									- (i_18_ + i_16_ * i_71_ >> 16);
							method283(
									class163,
									i_72_,
									i_74_,
									i_73_ - i_72_,
									i_75_ - i_74_,
									(((Class376_Sub9) class376_sub9).aShortArray7858),
									(((Class376_Sub9) class376_sub9).aByteArray7855));
						}
					}
				}
			}
		}
	}

	static final void method266() {
		aByteArray450 = null;
		aByteArray443 = null;
		aShortArray444 = null;
		aByteArray442 = null;
		aByteArray452 = null;
		aShortArray446 = null;
		aByteArray437 = null;
		aClass213_449 = null;
		aClass131ArrayArrayArray434 = null;
		anIntArray438 = null;
	}

	static final void method267(Class146 class146, Class302 class302,
			Class353 class353, Class290 class290, Class280 class280,
			Class29 class29, Interface20 interface20) {
		aClass146_416 = class146;
		aClass302_417 = class302;
		aClass353_413 = class353;
		aClass290_415 = class290;
		aClass280_420 = class280;
		aClass29_419 = class29;
		anInterface20_421 = interface20;
		aClass213_414.method1364((byte) 122);
		int i = aClass146_416.method920(124, "details");
		int[] is = aClass146_416.method907(i, 0);
		if (is != null) {
			for (int i_76_ = 0; i_76_ < is.length; i_76_++) {
				Class11_Sub45_Sub19 class11_sub45_sub19 = IncomingPacket
						.method989(false, is[i_76_], aClass146_416, i);
				aClass213_414
						.method1368(
								(long) (((Class11_Sub45_Sub19) class11_sub45_sub19).anInt9714),
								class11_sub45_sub19, (byte) -26);
			}
		}
		Class258.method1648(-102, true, false);
	}

	static final Class84 method268(Class163 class163) {
		int i = anInt433 - anInt439;
		int i_77_ = anInt435 - anInt440;
		int i_78_ = (anInt445 - anInt453 << 16) / i;
		int i_79_ = (anInt448 - anInt436 << 16) / i_77_;
		return method271(class163, i_78_, i_79_, 0, 0);
	}

	static final void method269(int i, int i_80_, int i_81_, int i_82_,
			int i_83_, int i_84_, int i_85_, int i_86_) {
		anInt439 = i - anInt441;
		anInt435 = i_80_ - anInt451;
		anInt433 = i_81_ - anInt441;
		anInt440 = i_82_ - anInt451;
		anInt453 = i_83_;
		anInt436 = i_84_;
		anInt445 = i_85_;
		anInt448 = i_86_;
	}

	static final void method270() {
		int[] is = new int[3];
		for (int i = 0; i < ((Class342) aClass342_431).anInt4539; i++) {
			boolean bool = (aClass11_Sub45_Sub19_418
					.method3818(
							((Class342) aClass342_431).anIntArray4533[i] >> 28 & 0x3,
							((Class342) aClass342_431).anIntArray4533[i] & 0x3fff,
							(byte) 21,
							(((Class342) aClass342_431).anIntArray4533[i] >> 14 & 0x3fff),
							is));
			if (bool) {
				Class11_Sub21 class11_sub21 = new Class11_Sub21(
						((Class342) aClass342_431).anIntArray4534[i]);
				((Class11_Sub21) class11_sub21).anInt5970 = is[1] - anInt441;
				((Class11_Sub21) class11_sub21).anInt5969 = is[2] - anInt451;
				aClass84_425.method589((byte) -13, class11_sub21);
			}
		}
	}

	private static final Class84 method271(Class163 class163, int i, int i_87_,
			int i_88_, int i_89_) {
		for (Class11_Sub21 class11_sub21 = (Class11_Sub21) aClass84_425
				.method584(-12261); class11_sub21 != null; class11_sub21 = (Class11_Sub21) aClass84_425
				.method578(-15361))
			method274(class163, class11_sub21, i, i_87_, i_88_, i_89_);
		return aClass84_425;
	}

	static final void method272() {
		aByteArray450 = new byte[anInt432 * anInt447];
		aByteArray442 = new byte[anInt432 * anInt447];
		aByteArray452 = new byte[anInt432 * anInt447];
		aShortArray446 = new short[anInt432 * anInt447];
		aByteArray437 = new byte[anInt432 * anInt447];
		aClass213_449 = new Class213(1024);
		aClass131ArrayArrayArray434 = new Class131[3][anInt432 >> 6][anInt447 >> 6];
		anIntArray438 = new int[((Class302) aClass302_417).anInt4072 + 1];
	}

	static final Class38 method273(int i, int i_90_) {
		Class38 class38 = new Class38();
		for (Class11_Sub45_Sub19 class11_sub45_sub19 = (Class11_Sub45_Sub19) aClass213_414
				.method1365(24490); class11_sub45_sub19 != null; class11_sub45_sub19 = (Class11_Sub45_Sub19) aClass213_414
				.method1367((byte) 71)) {
			if (((Class11_Sub45_Sub19) class11_sub45_sub19).aBool9699
					&& class11_sub45_sub19.method3819(i, 12800, i_90_))
				class38.method330(class11_sub45_sub19, 21934);
		}
		return class38;
	}

	private static final void method274(Class163 class163,
			Class11_Sub21 class11_sub21, int i, int i_91_, int i_92_, int i_93_) {
		((Class11_Sub21) class11_sub21).anInt5965 = (anInt453 + (i_92_ + i
				* (((Class11_Sub21) class11_sub21).anInt5970 - anInt439) >> 16));
		((Class11_Sub21) class11_sub21).anInt5967 = (anInt448 - (i_93_ + i_91_
				* (((Class11_Sub21) class11_sub21).anInt5969 - anInt440) >> 16));
	}

	private static final void method275(byte[] is, byte[] is_94_,
			short[] is_95_, int i, int i_96_) {
		int[] is_97_ = new int[anInt447];
		int[] is_98_ = new int[anInt447];
		int[] is_99_ = new int[anInt447];
		int[] is_100_ = new int[anInt447];
		int[] is_101_ = new int[anInt447];
		for (int i_102_ = -5; i_102_ < anInt432; i_102_++) {
			int i_103_ = i_102_ + 5;
			int i_104_ = i_102_ - 5;
			for (int i_105_ = 0; i_105_ < anInt447; i_105_++) {
				if (i_103_ < anInt432) {
					int i_106_ = is[i_103_ + i_105_ * anInt432] & 0xff;
					if (i_106_ > 0) {
						Class327 class327 = aClass353_413.method2113(
								i_106_ - 1, true);
						is_97_[i_105_] += ((Class327) class327).anInt4360;
						is_98_[i_105_] += ((Class327) class327).anInt4361;
						is_99_[i_105_] += ((Class327) class327).anInt4366;
						is_100_[i_105_] += ((Class327) class327).anInt4365;
						is_101_[i_105_]++;
					}
				}
				if (i_104_ >= 0) {
					int i_107_ = is[i_104_ + i_105_ * anInt432] & 0xff;
					if (i_107_ > 0) {
						Class327 class327 = aClass353_413.method2113(
								i_107_ - 1, true);
						is_97_[i_105_] -= ((Class327) class327).anInt4360;
						is_98_[i_105_] -= ((Class327) class327).anInt4361;
						is_99_[i_105_] -= ((Class327) class327).anInt4366;
						is_100_[i_105_] -= ((Class327) class327).anInt4365;
						is_101_[i_105_]--;
					}
				}
			}
			if (i_102_ >= 0) {
				int i_108_ = 0;
				int i_109_ = 0;
				int i_110_ = 0;
				int i_111_ = 0;
				int i_112_ = 0;
				for (int i_113_ = -5; i_113_ < anInt447; i_113_++) {
					int i_114_ = i_113_ + 5;
					if (i_114_ < anInt447) {
						i_108_ += is_97_[i_114_];
						i_109_ += is_98_[i_114_];
						i_110_ += is_99_[i_114_];
						i_111_ += is_100_[i_114_];
						i_112_ += is_101_[i_114_];
					}
					int i_115_ = i_113_ - 5;
					if (i_115_ >= 0) {
						i_108_ -= is_97_[i_115_];
						i_109_ -= is_98_[i_115_];
						i_110_ -= is_99_[i_115_];
						i_111_ -= is_100_[i_115_];
						i_112_ -= is_101_[i_115_];
					}
					if (i_113_ >= 0 && i_112_ > 0) {
						if ((is[i_102_ + i_113_ * anInt432] & 0xff) == 0) {
							int i_116_ = i_102_ + i_113_ * anInt432;
							is_94_[i_116_] = (byte) 0;
							is_95_[i_116_] = (short) 0;
						} else {
							int i_117_ = (i_111_ == 0 ? 0 : (OutputStream_Sub2
									.method3194(i_109_ / i_112_, -1260895222,
											i_110_ / i_112_, i_108_ * 256
													/ i_111_)));
							int i_118_ = (i_117_ & 0x7f) + i_96_;
							if (i_118_ < 0)
								i_118_ = 0;
							else if (i_118_ > 127)
								i_118_ = 127;
							int i_119_ = ((i_117_ + i & 0xfc00)
									+ (i_117_ & 0x380) + i_118_);
							int i_120_ = i_102_ + i_113_ * anInt432;
							int i_121_ = (Class219_Sub1.anIntArray7248[((Class147
									.method942(0,
											Class360.method2143(i_119_, 96, 3))) & 0xffff)]);
							is_94_[i_120_] = (byte) (i_121_ >> 16 & 0xff);
							is_95_[i_120_] = (short) (i_121_ & 0xffff);
						}
					}
				}
			}
		}
	}

	private static final void method276() {
		for (int i = 0; i < anInt432; i++) {
			for (int i_122_ = 0; i_122_ < anInt447; i_122_++) {
				int i_123_ = aShortArray446[i + i_122_ * anInt432] & 0xffff;
				if (i_123_ != 0) {
					if (i_123_ == 65535) {
						Class11_Sub1 class11_sub1 = ((Class11_Sub1) aClass213_449
								.method1369((byte) 26,
										(long) (i << 16 | i_122_)));
						if (class11_sub1 != null) {
							for (int i_124_ = 0; i_124_ < (((Class11_Sub1) class11_sub1).aShortArray5034).length; i_124_++) {
								Class42 class42 = (aClass290_415
										.method1793(
												(byte) -9,
												(((Class11_Sub1) class11_sub1).aShortArray5034[i_124_]) & 0xffff));
								int i_125_ = ((Class42) class42).anInt637;
								if (((Class42) class42).anIntArray683 != null) {
									class42 = class42.method380(
											anInterface20_421, 0);
									if (class42 != null)
										i_125_ = ((Class42) class42).anInt637;
								}
								if (i_125_ != -1) {
									Class11_Sub21 class11_sub21 = new Class11_Sub21(
											i_125_);
									((Class11_Sub21) class11_sub21).anInt5970 = i;
									((Class11_Sub21) class11_sub21).anInt5969 = i_122_;
									aClass84_425.method589((byte) -13,
											class11_sub21);
								}
							}
						}
					} else {
						Class42 class42 = aClass290_415.method1793((byte) 127,
								i_123_ - 1);
						int i_126_ = ((Class42) class42).anInt637;
						if (((Class42) class42).anIntArray683 != null) {
							class42 = class42.method380(anInterface20_421, 0);
							if (class42 != null)
								i_126_ = ((Class42) class42).anInt637;
						}
						if (i_126_ != -1) {
							Class11_Sub21 class11_sub21 = new Class11_Sub21(
									i_126_);
							((Class11_Sub21) class11_sub21).anInt5970 = i;
							((Class11_Sub21) class11_sub21).anInt5969 = i_122_;
							aClass84_425.method589((byte) -13, class11_sub21);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_127_ = 0; i_127_ < aClass131ArrayArrayArray434[0].length; i_127_++) {
				for (int i_128_ = 0; i_128_ < aClass131ArrayArrayArray434[0][0].length; i_128_++) {
					Class131 class131 = aClass131ArrayArrayArray434[i][i_127_][i_128_];
					if (class131 != null) {
						for (Class376_Sub9 class376_sub9 = (Class376_Sub9) class131
								.method847(-31182); class376_sub9 != null; class376_sub9 = (Class376_Sub9) class131
								.method856(23)) {
							if (((Class376_Sub9) class376_sub9).aShortArray7858 != null) {
								for (int i_129_ = 0; i_129_ < (((Class376_Sub9) class376_sub9).aShortArray7858).length; i_129_++) {
									Class42 class42 = (aClass290_415
											.method1793(
													(byte) 125,
													((((Class376_Sub9) class376_sub9).aShortArray7858[i_129_]) & 0xffff)));
									int i_130_ = ((Class42) class42).anInt637;
									if (((Class42) class42).anIntArray683 != null) {
										class42 = (class42.method380(
												anInterface20_421, 0));
										if (class42 != null)
											i_130_ = ((Class42) class42).anInt637;
									}
									if (i_130_ != -1) {
										Class11_Sub21 class11_sub21 = new Class11_Sub21(
												i_130_);
										((Class11_Sub21) class11_sub21).anInt5970 = ((i_127_ + (anInt441 >> 6))
												* 64
												+ ((Class376_Sub9) class376_sub9).aByte7860 - anInt441);
										((Class11_Sub21) class11_sub21).anInt5969 = ((i_128_ + (anInt451 >> 6))
												* 64
												+ ((Class376_Sub9) class376_sub9).aByte7856 - anInt451);
										aClass84_425.method589((byte) -13,
												class11_sub21);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static final Class11_Sub45_Sub19 method277(int i) {
		return ((Class11_Sub45_Sub19) aClass213_414.method1369((byte) 26,
				(long) i));
	}

	static final void method278(Class163 class163, Class11_Sub21 class11_sub21,
			Class23 class23) {
		if (((Class23) class23).anIntArray242 != null) {
			int[] is = new int[((Class23) class23).anIntArray242.length];
			for (int i = 0; i < is.length / 2; i++) {
				int i_131_ = (((Class23) class23).anIntArray242[i * 2] + ((Class11_Sub21) class11_sub21).anInt5970);
				int i_132_ = (((Class23) class23).anIntArray242[i * 2 + 1] + ((Class11_Sub21) class11_sub21).anInt5969);
				is[i * 2] = anInt453
						+ ((anInt445 - anInt453) * (i_131_ - anInt439) / (anInt433 - anInt439));
				is[i * 2 + 1] = anInt448
						- ((anInt448 - anInt436) * (i_132_ - anInt440) / (anInt435 - anInt440));
			}
			Class294.method1822(class163, is, ((Class23) class23).anInt231);
			if (((Class23) class23).anInt215 > 0) {
				for (int i = 0; i < is.length / 2 - 1; i++) {
					int i_133_ = is[i * 2];
					int i_134_ = is[i * 2 + 1];
					int i_135_ = is[(i + 1) * 2];
					int i_136_ = is[(i + 1) * 2 + 1];
					if (i_135_ < i_133_) {
						int i_137_ = i_133_;
						int i_138_ = i_134_;
						i_133_ = i_135_;
						i_134_ = i_136_;
						i_135_ = i_137_;
						i_136_ = i_138_;
					} else if (i_135_ == i_133_ && i_136_ < i_134_) {
						int i_139_ = i_134_;
						i_134_ = i_136_;
						i_136_ = i_139_;
					}
					class163.method1064(
							i_133_,
							i_134_,
							i_135_,
							i_136_,
							(((Class23) class23).anIntArray220[(((Class23) class23).aByteArray198[i] & 0xff)]),
							1, ((Class23) class23).anInt215,
							((Class23) class23).anInt222,
							((Class23) class23).anInt237);
				}
				int i = is[is.length - 2];
				int i_140_ = is[is.length - 1];
				int i_141_ = is[0];
				int i_142_ = is[1];
				if (i_141_ < i) {
					int i_143_ = i;
					int i_144_ = i_140_;
					i = i_141_;
					i_140_ = i_142_;
					i_141_ = i_143_;
					i_142_ = i_144_;
				} else if (i_141_ == i && i_142_ < i_140_) {
					int i_145_ = i_140_;
					i_140_ = i_142_;
					i_142_ = i_145_;
				}
				class163.method1064(
						i,
						i_140_,
						i_141_,
						i_142_,
						(((Class23) class23).anIntArray220[(((Class23) class23).aByteArray198[(((Class23) class23).aByteArray198).length - 1]) & 0xff]),
						1, ((Class23) class23).anInt215,
						((Class23) class23).anInt222,
						((Class23) class23).anInt237);
			} else {
				for (int i = 0; i < is.length / 2 - 1; i++)
					class163.method1029(
							72,
							is[i * 2 + 1],
							is[(i + 1) * 2 + 1],
							is[(i + 1) * 2],
							(((Class23) class23).anIntArray220[(((Class23) class23).aByteArray198[i] & 0xff)]),
							is[i * 2]);
				class163.method1029(
						76,
						is[is.length - 1],
						is[1],
						is[0],
						(((Class23) class23).anIntArray220[(((Class23) class23).aByteArray198[(((Class23) class23).aByteArray198).length - 1]) & 0xff]),
						is[is.length - 2]);
			}
		}
	}

	private static final void method279(Class163 class163, Stream stream,
			int i, int i_146_, int i_147_, int i_148_, int[] is, int[] is_149_) {
		int i_150_ = stream.readUnsignedByte((byte) 35);
		if ((i_150_ & 0x1) == 0) {
			boolean bool = (i_150_ & 0x2) == 0;
			int i_151_ = i_150_ >> 2 & 0x3f;
			if (i_151_ != 62) {
				if (i_151_ == 63)
					i_151_ = stream.readUnsignedByte((byte) 35);
				else if (bool)
					i_151_ = is[i_151_];
				else
					i_151_ = is_149_[i_151_];
				if (bool) {
					aByteArray450[i_147_ + i_148_ * anInt432] = (byte) i_151_;
					aByteArray442[i_147_ + i_148_ * anInt432] = (byte) 0;
				} else {
					aByteArray442[i_147_ + i_148_ * anInt432] = (byte) i_151_;
					aByteArray452[i_147_ + i_148_ * anInt432] = (byte) 0;
					aByteArray450[i_147_ + i_148_ * anInt432] = stream
							.readByte(1854307120);
				}
			}
		} else {
			int i_152_ = (i_150_ >> 1 & 0x3) + 1;
			boolean bool = (i_150_ & 0x8) != 0;
			boolean bool_153_ = (i_150_ & 0x10) != 0;
			for (int i_154_ = 0; i_154_ < i_152_; i_154_++) {
				int i_155_ = stream.readUnsignedByte((byte) 35);
				int i_156_ = 0;
				int i_157_ = 0;
				if (bool) {
					i_156_ = stream.readUnsignedByte((byte) 35);
					i_157_ = stream.readUnsignedByte((byte) 35);
				}
				int i_158_ = 0;
				if (bool_153_)
					i_158_ = stream.readUnsignedByte((byte) 35);
				if (i_154_ == 0) {
					aByteArray450[i_147_ + i_148_ * anInt432] = (byte) i_155_;
					aByteArray442[i_147_ + i_148_ * anInt432] = (byte) i_156_;
					aByteArray452[i_147_ + i_148_ * anInt432] = (byte) i_157_;
					if (i_158_ == 1) {
						aShortArray446[i_147_ + i_148_ * anInt432] = (short) (stream
								.readUnsignedShort((byte) -65) + 1);
						aByteArray437[i_147_ + i_148_ * anInt432] = stream
								.readByte(1854307120);
					} else if (i_158_ > 1) {
						aShortArray446[i_147_ + i_148_ * anInt432] = (short) -1;
						short[] is_159_ = new short[i_158_];
						byte[] is_160_ = new byte[i_158_];
						for (int i_161_ = 0; i_161_ < i_158_; i_161_++) {
							is_159_[i_161_] = (short) stream
									.readUnsignedShort((byte) -65);
							is_160_[i_161_] = stream.readByte(1854307120);
						}
						aClass213_449.method1368(
								(long) (i_147_ << 16 | i_148_),
								new Class11_Sub1(is_159_, is_160_), (byte) -26);
					}
				} else {
					short[] is_162_ = null;
					byte[] is_163_ = null;
					if (i_158_ > 0) {
						is_162_ = new short[i_158_];
						is_163_ = new byte[i_158_];
						for (int i_164_ = 0; i_164_ < i_158_; i_164_++) {
							is_162_[i_164_] = (short) stream
									.readUnsignedShort((byte) -65);
							is_163_[i_164_] = stream.readByte(1854307120);
						}
					}
					if ((aClass131ArrayArrayArray434[i_154_ - 1][i
							- (anInt441 >> 6)][i_146_ - (anInt451 >> 6)]) == null)
						aClass131ArrayArrayArray434[i_154_ - 1][i
								- (anInt441 >> 6)][i_146_ - (anInt451 >> 6)] = new Class131();
					Class376_Sub9 class376_sub9 = new Class376_Sub9(
							i_147_ & 0x3f, i_148_ & 0x3f, i_155_, i_156_,
							i_157_, is_162_, is_163_);
					aClass131ArrayArrayArray434[i_154_ - 1][i - (anInt441 >> 6)][i_146_
							- (anInt451 >> 6)].method853(0, class376_sub9);
				}
			}
		}
	}

	static final void method280(Class163 class163, int i, int i_165_) {
		Stream stream = new Stream(aClass146_416.method932(
				(((Class11_Sub45_Sub19) aClass11_Sub45_Sub19_418).aString9696),
				"area", 0));
		int i_166_ = stream.readUnsignedByte((byte) 35);
		int[] is = new int[i_166_];
		for (int i_167_ = 0; i_167_ < i_166_; i_167_++)
			is[i_167_] = stream.readUnsignedByte((byte) 35);
		int i_168_ = stream.readUnsignedByte((byte) 35);
		int[] is_169_ = new int[i_168_];
		for (int i_170_ = 0; i_170_ < i_168_; i_170_++)
			is_169_[i_170_] = stream.readUnsignedByte((byte) 35);
		while (((Stream) stream).position < ((Stream) stream).buffer.length) {
			if (stream.readUnsignedByte((byte) 35) == 0) {
				int i_171_ = stream.readUnsignedByte((byte) 35);
				int i_172_ = stream.readUnsignedByte((byte) 35);
				for (int i_173_ = 0; i_173_ < 64; i_173_++) {
					for (int i_174_ = 0; i_174_ < 64; i_174_++) {
						int i_175_ = i_171_ * 64 + i_173_ - anInt441;
						int i_176_ = i_172_ * 64 + i_174_ - anInt451;
						method279(class163, stream, i_171_, i_172_, i_175_,
								i_176_, is, is_169_);
					}
				}
			} else {
				int i_177_ = stream.readUnsignedByte((byte) 35);
				int i_178_ = stream.readUnsignedByte((byte) 35);
				int i_179_ = stream.readUnsignedByte((byte) 35);
				int i_180_ = stream.readUnsignedByte((byte) 35);
				for (int i_181_ = 0; i_181_ < 8; i_181_++) {
					for (int i_182_ = 0; i_182_ < 8; i_182_++) {
						int i_183_ = i_177_ * 64 + i_179_ * 8 + i_181_
								- anInt441;
						int i_184_ = i_178_ * 64 + i_180_ * 8 + i_182_
								- anInt451;
						method279(class163, stream, i_177_, i_178_, i_183_,
								i_184_, is, is_169_);
					}
				}
			}
		}
		Object object = null;
		aByteArray443 = new byte[anInt432 * anInt447];
		aShortArray444 = new short[anInt432 * anInt447];
		for (int i_185_ = 0; i_185_ < 3; i_185_++) {
			byte[] is_186_ = new byte[anInt432 * anInt447];
			for (int i_187_ = 0; i_187_ < aClass131ArrayArrayArray434[i_185_].length; i_187_++) {
				for (int i_188_ = 0; i_188_ < aClass131ArrayArrayArray434[i_185_][0].length; i_188_++) {
					Class131 class131 = aClass131ArrayArrayArray434[i_185_][i_187_][i_188_];
					if (class131 != null) {
						for (Class376_Sub9 class376_sub9 = (Class376_Sub9) class131
								.method847(-31182); class376_sub9 != null; class376_sub9 = (Class376_Sub9) class131
								.method856(69))
							is_186_[(i_187_
									* 64
									+ (((Class376_Sub9) class376_sub9).aByte7860) + (i_188_ * 64 + (((Class376_Sub9) class376_sub9).aByte7856))
									* anInt432)] = (byte) (((Class376_Sub9) class376_sub9).anInt7859);
					}
				}
			}
			method275(is_186_, aByteArray443, aShortArray444, i, i_165_);
			for (int i_189_ = 0; i_189_ < aClass131ArrayArrayArray434[i_185_].length; i_189_++) {
				for (int i_190_ = 0; i_190_ < aClass131ArrayArrayArray434[i_185_][0].length; i_190_++) {
					Class131 class131 = aClass131ArrayArrayArray434[i_185_][i_189_][i_190_];
					if (class131 != null) {
						for (Class376_Sub9 class376_sub9 = (Class376_Sub9) class131
								.method847(-31182); class376_sub9 != null; class376_sub9 = (Class376_Sub9) class131
								.method856(24)) {
							int i_191_ = (i_189_ * 64
									+ ((Class376_Sub9) class376_sub9).aByte7860 + (i_190_ * 64 + (((Class376_Sub9) class376_sub9).aByte7856))
									* anInt432);
							((Class376_Sub9) class376_sub9).anInt7859 = ((aByteArray443[i_191_] & 0xff) << 16 | aShortArray444[i_191_] & 0xffff);
							if (((Class376_Sub9) class376_sub9).anInt7859 != 0)
								((Class376_Sub9) class376_sub9).anInt7859 |= ~0xffffff;
						}
					}
				}
			}
		}
		method275(aByteArray450, aByteArray443, aShortArray444, i, i_165_);
		aByteArray450 = null;
		method276();
	}

	static final void method281(int i) {
		aClass11_Sub45_Sub19_418 = (Class11_Sub45_Sub19) aClass213_414
				.method1369((byte) 26, (long) i);
	}

	public static void method282() {
		aClass302_417 = null;
		aClass353_413 = null;
		aClass290_415 = null;
		aClass280_420 = null;
		aClass29_419 = null;
		anInterface20_421 = null;
		aClass11_Sub45_Sub19_418 = null;
		aClass146_416 = null;
		aClass213_414 = null;
		aByteArrayArrayArray424 = null;
		aShortArray423 = null;
		aByteArray427 = null;
		aClass342_431 = null;
		aClass84_425 = null;
		anIntArray438 = null;
		aByteArray450 = null;
		aByteArray443 = null;
		aShortArray444 = null;
		aByteArray442 = null;
		aByteArray452 = null;
		aShortArray446 = null;
		aByteArray437 = null;
		aClass213_449 = null;
		aClass131ArrayArrayArray434 = null;
	}

	private static final void method283(Class163 class163, int i, int i_192_,
			int i_193_, int i_194_, short[] is, byte[] is_195_) {
		if (is != null) {
			for (int i_196_ = 0; i_196_ < is.length; i_196_++) {
				Class42 class42 = aClass290_415.method1793((byte) -108,
						is[i_196_] & 0xffff);
				int i_197_ = ((Class42) class42).anInt600;
				if (i_197_ != -1) {
					Class152 class152 = aClass29_419.method247(9, i_197_);
					Class253 class253 = class152
							.method955(
									(((Class42) class42).aBool628 ? ((Class42) class42).aBool644
											: false),
									(((Class42) class42).aBool627 ? is_195_[i_196_] >> 6 & 0x3
											: 0), class163, false);
					if (class253 != null) {
						int i_198_ = i_193_ * class253.method1608() >> 2;
						int i_199_ = i_194_ * class253.method1622() >> 2;
						if (((Class152) class152).aBool2011) {
							int i_200_ = ((Class42) class42).anInt682;
							int i_201_ = ((Class42) class42).anInt687;
							if ((is_195_[i_196_] >> 6 & 0x1) == 1) {
								int i_202_ = i_200_;
								i_200_ = i_201_;
								i_201_ = i_202_;
							}
							i_198_ = i_200_ * i_193_;
							i_199_ = i_201_ * i_194_;
						}
						if (i_198_ != 0 && i_199_ != 0) {
							if (((Class152) class152).anInt2016 != 0)
								class253.method1606(
										i,
										i_192_ - i_199_ + i_194_,
										i_198_,
										i_199_,
										0,
										(~0xffffff | (((Class152) class152).anInt2016)),
										1);
							else
								class253.method1620(i,
										i_192_ - i_199_ + i_194_, i_198_,
										i_199_);
						}
					}
				}
			}
		}
	}

	private static final void method284(Class163 class163, int i, int i_203_,
			int i_204_, int i_205_, int i_206_, int i_207_, int i_208_,
			short[] is, byte[] is_209_, boolean bool) {
		if (bool || i_206_ != 0 || i_207_ > 0) {
			if (i_207_ == 0)
				class163.aa(i, i_203_, i_204_, i_205_, i_206_, 0);
			else {
				int i_210_ = i_208_ & 0x3f;
				if (i_210_ == 0 || i_204_ <= 1 || i_205_ <= 1) {
					int i_211_ = anIntArray438[i_207_];
					if (bool || i_211_ != 0)
						class163.aa(i, i_203_, i_204_, i_205_, i_211_, 0);
				} else {
					int i_212_ = bool ? 0 : 1;
					Class108_Sub19.method2890(i, i_205_,
							aByteArrayArrayArray424, i_210_, anInt422,
							class163, anIntArray438[i_207_], i_212_, i_204_,
							i_206_, true, i_203_, i_208_ >> 6 & 0x3);
				}
			}
		}
		if (is != null) {
			int i_213_;
			if (i_204_ == 1)
				i_213_ = i;
			else
				i_213_ = i + i_204_ - 1;
			int i_214_;
			if (i_205_ == 1)
				i_214_ = i_203_;
			else
				i_214_ = i_203_ + i_205_ - 1;
			for (int i_215_ = 0; i_215_ < is.length; i_215_++) {
				int i_216_ = is_209_[i_215_] & 0x3f;
				if (i_216_ == 0 || i_216_ == 2 || i_216_ == 3 || i_216_ == 9) {
					Class42 class42 = aClass290_415.method1793((byte) -51,
							is[i_215_] & 0xffff);
					if (((Class42) class42).anInt600 == -1) {
						int i_217_ = -3355444;
						if (((Class42) class42).anInt664 == 1)
							i_217_ = -3407872;
						int i_218_ = is_209_[i_215_] >> 6 & 0x3;
						if (i_216_ == 0) {
							if (i_218_ == 0)
								class163.P(i, i_203_, i_205_, i_217_, 0);
							else if (i_218_ == 1)
								class163.U(i, i_203_, i_204_, i_217_, 0);
							else if (i_218_ == 2)
								class163.P(i_213_, i_203_, i_205_, i_217_, 0);
							else
								class163.U(i, i_214_, i_204_, i_217_, 0);
						} else if (i_216_ == 2) {
							if (i_218_ == 0) {
								class163.P(i, i_203_, i_205_, -1, 0);
								class163.U(i, i_203_, i_204_, i_217_, 0);
							} else if (i_218_ == 1) {
								class163.P(i_213_, i_203_, i_205_, -1, 0);
								class163.U(i, i_203_, i_204_, i_217_, 0);
							} else if (i_218_ == 2) {
								class163.P(i_213_, i_203_, i_205_, -1, 0);
								class163.U(i, i_214_, i_204_, i_217_, 0);
							} else {
								class163.P(i, i_203_, i_205_, -1, 0);
								class163.U(i, i_214_, i_204_, i_217_, 0);
							}
						} else if (i_216_ == 3) {
							if (i_218_ == 0)
								class163.U(i, i_203_, 1, i_217_, 0);
							else if (i_218_ == 1)
								class163.U(i_213_, i_203_, 1, i_217_, 0);
							else if (i_218_ == 2)
								class163.U(i_213_, i_214_, 1, i_217_, 0);
							else
								class163.U(i, i_214_, 1, i_217_, 0);
						} else if (i_216_ == 9) {
							if (i_218_ == 0 || i_218_ == 2) {
								for (int i_219_ = 0; i_219_ < i_205_; i_219_++)
									class163.U(i + i_219_, i_214_ - i_219_, 1,
											i_217_, 0);
							} else {
								for (int i_220_ = 0; i_220_ < i_205_; i_220_++)
									class163.U(i + i_220_, i_203_ + i_220_, 1,
											i_217_, 0);
							}
						}
					}
				}
			}
		}
	}

	static {
		aByteArray427 = new byte[1];
		aClass84_425 = new Class84();
	}
}
