/* Class286_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class286_Sub1 extends Class286 {
	static Class146 aClass146_7138;
	static int anInt7139;
	static int anInt7140;
	static int anInt7141;
	static int anInt7142;
	static int anInt7143;
	static int anInt7144;
	static int anInt7145;
	int anInt7146 = 99;
	static int anInt7147;
	/* synthetic */static Class aClass7148;

	final void method2905(int i, byte[] is, int i_0_, Class163 class163,
			int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_,
			Class338[] class338s) {
		try {
			anInt7145++;
			Stream stream = new Stream(is);
			int i_7_ = -1;
			if (i_6_ > -122)
				method2905(-103, null, -67, null, 27, 46, -73, -123, -8, -36,
						null);
			for (;;) {
				int i_8_ = stream.method2557(-2);
				if (i_8_ == 0)
					break;
				i_7_ += i_8_;
				int i_9_ = 0;
				for (;;) {
					int i_10_ = stream.readSmart(114);
					if ((i_10_ ^ 0xffffffff) == -1)
						break;
					i_9_ += i_10_ - 1;
					int i_11_ = i_9_ & 0x3f;
					int i_12_ = (0xfce & i_9_) >> 6;
					int i_13_ = i_9_ >> 12;
					int i_14_ = stream.readUnsignedByte((byte) 35);
					int i_15_ = i_14_ >> 2;
					int i_16_ = 0x3 & i_14_;
					if ((i_13_ ^ 0xffffffff) == (i_0_ ^ 0xffffffff)
							&& i_12_ >= i_3_ && i_12_ < 8 + i_3_
							&& (i_4_ ^ 0xffffffff) >= (i_11_ ^ 0xffffffff)
							&& i_4_ + 8 > i_11_) {
						Class42 class42 = Class11_Sub4.aClass290_5237
								.method1793((byte) -79, i_7_);
						int i_17_ = (Class63
								.method478(0x7 & i_11_,
										((Class42) class42).anInt682,
										i_12_ & 0x7,
										((Class42) class42).anInt687, i_1_,
										i_16_, true) + i_2_);
						int i_18_ = i
								- -(Class236_Sub8.method2882(
										((Class42) class42).anInt682, 31172,
										((Class42) class42).anInt687,
										0x7 & i_12_, i_11_ & 0x7, i_1_, i_16_));
						if ((i_17_ ^ 0xffffffff) < -1
								&& (i_18_ ^ 0xffffffff) < -1
								&& i_17_ < ((Class286) this).anInt3865 - 1
								&& i_18_ < -1 + ((Class286) this).anInt3876) {
							Class338 class338 = null;
							if (!((Class286) this).aBool3870) {
								int i_19_ = i_5_;
								if ((0x2 & (Class11_Sub45_Sub17.aByteArrayArrayArray9509[1][i_17_][i_18_])) == 2)
									i_19_--;
								if ((i_19_ ^ 0xffffffff) <= -1)
									class338 = class338s[i_19_];
							}
							method2911(i_5_, i_16_ + i_1_ & 0x3, -1, i_7_,
									i_5_, class163, i_18_, i_17_, (byte) -127,
									class338, i_15_);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ql.A(" + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_0_ + ','
					+ (class163 != null ? "{...}" : "null") + ',' + i_1_ + ','
					+ i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_
					+ ',' + (class338s != null ? "{...}" : "null") + ')'));
		}
	}

	Class286_Sub1(int i, int i_20_, int i_21_, boolean bool) {
		super(i, i_20_, i_21_, bool, Class205.aClass302_2761,
				Class58_Sub2_Sub2.aClass353_9819);
	}

	public static void method2906(int i) {
		do {
			try {
				aClass146_7138 = null;
				if (i == 17518)
					break;
				aClass146_7138 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ql.F(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method2907(Class163 class163, boolean bool, byte i) {
		try {
			anInt7147++;
			Class234_Sub1_Sub1.method3827();
			int i_22_ = 29 / ((-15 - i) / 55);
			if (!bool) {
				if (((Class286) this).anInt3880 > 1) {
					for (int i_23_ = 0; i_23_ < ((Class286) this).anInt3865; i_23_++) {
						for (int i_24_ = 0; ((i_24_ ^ 0xffffffff) > (((Class286) this).anInt3876 ^ 0xffffffff)); i_24_++) {
							if ((0x2 & (Class11_Sub45_Sub17.aByteArrayArrayArray9509[1][i_23_][i_24_])) == 2)
								Class16.method153(i_23_, i_24_);
						}
					}
				}
				for (int i_25_ = 0; ((((Class286) this).anInt3880 ^ 0xffffffff) < (i_25_ ^ 0xffffffff)); i_25_++) {
					for (int i_26_ = 0; ((((Class286) this).anInt3876 ^ 0xffffffff) <= (i_26_ ^ 0xffffffff)); i_26_++) {
						for (int i_27_ = 0; ((i_27_ ^ 0xffffffff) >= (((Class286) this).anInt3865 ^ 0xffffffff)); i_27_++) {
							if ((0x4 & (((Class286) this).aByteArrayArrayArray3857[i_25_][i_27_][i_26_]) ^ 0xffffffff) != -1) {
								int i_28_ = i_27_;
								int i_29_ = i_27_;
								int i_30_ = i_26_;
								int i_31_ = i_26_;
								for (/**/; (i_30_ > 0 && (0x4 & (((Class286) this).aByteArrayArrayArray3857[i_25_][i_27_][i_30_ - 1]) ^ 0xffffffff) != -1); i_30_--) {
									if (i_31_ + -i_30_ >= 10)
										break;
								}
								for (/**/; (((Class286) this).anInt3876 > i_31_ && (0x4 & (((Class286) this).aByteArrayArrayArray3857[i_25_][i_27_][1 + i_31_]) ^ 0xffffffff) != -1); i_31_++) {
									if (-i_30_ + i_31_ >= 10)
										break;
								}
								while_28_: for (/**/; i_28_ > 0; i_28_--) {
									if (-i_28_ + i_29_ >= 10)
										break;
									for (int i_32_ = i_30_; i_32_ <= i_31_; i_32_++) {
										if ((0x4 & (((Class286) this).aByteArrayArrayArray3857[i_25_][i_28_ - 1][i_32_])) == 0)
											break while_28_;
									}
								}
								while_29_: for (/**/; (((Class286) this).anInt3865 > i_29_ && -i_28_
										+ i_29_ < 10); i_29_++) {
									for (int i_33_ = i_30_; ((i_33_ ^ 0xffffffff) >= (i_31_ ^ 0xffffffff)); i_33_++) {
										if ((0x4 & (((Class286) this).aByteArrayArrayArray3857[i_25_][1 + i_29_][i_33_])) == 0)
											break while_29_;
									}
								}
								if (((-i_30_ + i_31_ + 1)
										* (1 + -i_28_ + i_29_) ^ 0xffffffff) <= -5) {
									int i_34_ = (((Class286) this).anIntArrayArrayArray3866[i_25_][i_28_][i_30_]);
									Class265.method1679(i_28_ << 9, i_34_,
											i_34_, i_25_, -116,
											512 + (i_31_ << 9), i_30_ << 9, 4,
											512 + (i_29_ << 9));
									for (int i_35_ = i_28_; i_29_ >= i_35_; i_35_++) {
										for (int i_36_ = i_30_; ((i_36_ ^ 0xffffffff) >= (i_31_ ^ 0xffffffff)); i_36_++)
											((Class286) this).aByteArrayArrayArray3857[i_25_][i_35_][i_36_] = (byte) (Class77
													.method529(
															(((Class286) this).aByteArrayArrayArray3857[i_25_][i_35_][i_36_]),
															-5));
									}
								}
							}
						}
					}
				}
				Class11_Sub45_Sub7.method3451((byte) 8);
			}
			((Class286) this).aByteArrayArrayArray3857 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ql.D("
					+ (class163 != null ? "{...}" : "null") + ',' + bool + ','
					+ i + ')'));
		}
	}

	final void method2908(Stream stream, int i, int[] is, Class163 class163,
			int i_37_, int i_38_) {
		do {
			try {
				anInt7142++;
				if (!((Class286) this).aBool3870) {
					boolean bool = false;
					if (is != null)
						is[0] = -1;
					Class104 class104 = null;
					while ((((Stream) stream).position ^ 0xffffffff) > (((Stream) stream).buffer.length ^ 0xffffffff)) {
						int i_39_ = stream.readUnsignedByte((byte) 35);
						if (i_39_ == 0)
							class104 = new Class104(stream);
						else if (i_39_ != 1) {
							if (i_39_ != 2) {
								if (i_39_ != 128) {
									if ((i_39_ ^ 0xffffffff) == -130) {
										if ((((Class286) this).aByteArrayArrayArray3856) == null)
											((Class286) this).aByteArrayArrayArray3856 = new byte[4][][];
										bool = true;
										for (int i_40_ = 0; i_40_ < 4; i_40_++) {
											byte i_41_ = stream
													.readByte(1854307120);
											if ((i_41_ ^ 0xffffffff) == -1
													&& (((Class286) this).aByteArrayArrayArray3856[i_40_]) != null) {
												int i_42_ = i_38_;
												int i_43_ = i_38_ + 64;
												int i_44_ = i_37_;
												if (i_42_ >= 0) {
													if (i_42_ >= (((Class286) this).anInt3865))
														i_42_ = ((Class286) this).anInt3865;
												} else
													i_42_ = 0;
												if (i_44_ < 0)
													i_44_ = 0;
												else if (((((Class286) this).anInt3876) ^ 0xffffffff) >= (i_44_ ^ 0xffffffff))
													i_44_ = (((Class286) this).anInt3876);
												if (i_43_ >= 0) {
													if ((((Class286) this).anInt3865) <= i_43_)
														i_43_ = ((Class286) this).anInt3865;
												} else
													i_43_ = 0;
												int i_45_ = 64 + i_37_;
												if (i_45_ < 0)
													i_45_ = 0;
												else if ((i_45_ ^ 0xffffffff) <= ((((Class286) this).anInt3876) ^ 0xffffffff))
													i_45_ = (((Class286) this).anInt3876);
												for (/**/; i_42_ < i_43_; i_42_++) {
													for (/**/; i_44_ < i_45_; i_44_++)
														((Class286) this).aByteArrayArrayArray3856[i_40_][i_42_][i_44_] = (byte) 0;
												}
											} else if (i_41_ != 1) {
												if ((i_41_ ^ 0xffffffff) == -3) {
													if ((((Class286) this).aByteArrayArrayArray3856[i_40_]) == null)
														((Class286) this).aByteArrayArrayArray3856[i_40_] = (new byte[((((Class286) this).anInt3865) + 1)][((((Class286) this).anInt3876) + 1)]);
													if (i_40_ > 0) {
														int i_46_ = i_38_;
														int i_47_ = 64 + i_38_;
														int i_48_ = i_37_;
														if (i_48_ >= 0) {
															if (((((Class286) this).anInt3876) ^ 0xffffffff) >= (i_48_ ^ 0xffffffff))
																i_48_ = (((Class286) this).anInt3876);
														} else
															i_48_ = 0;
														int i_49_ = i_37_ + 64;
														if (i_46_ < 0)
															i_46_ = 0;
														else if (((((Class286) this).anInt3865) ^ 0xffffffff) >= (i_46_ ^ 0xffffffff))
															i_46_ = (((Class286) this).anInt3865);
														if ((i_47_ ^ 0xffffffff) > -1)
															i_47_ = 0;
														else if ((((Class286) this).anInt3865) <= i_47_)
															i_47_ = (((Class286) this).anInt3865);
														if ((i_49_ ^ 0xffffffff) > -1)
															i_49_ = 0;
														else if ((i_49_ ^ 0xffffffff) <= ((((Class286) this).anInt3876) ^ 0xffffffff))
															i_49_ = (((Class286) this).anInt3876);
														for (/**/; i_47_ > i_46_; i_46_++) {
															for (/**/; i_48_ < i_49_; i_48_++)
																((Class286) this).aByteArrayArrayArray3856[i_40_][i_46_][i_48_] = (((Class286) this).aByteArrayArrayArray3856[(i_40_ - 1)][i_46_][i_48_]);
														}
													}
												}
											} else {
												if ((((Class286) this).aByteArrayArrayArray3856[i_40_]) == null)
													((Class286) this).aByteArrayArrayArray3856[i_40_] = (new byte[1 + (((Class286) this).anInt3865)][(((Class286) this).anInt3876) + 1]);
												for (int i_50_ = 0; ((i_50_ ^ 0xffffffff) > -65); i_50_ += 4) {
													for (int i_51_ = 0; ((i_51_ ^ 0xffffffff) > -65); i_51_ += 4) {
														byte i_52_ = (stream
																.readByte(1854307120));
														for (int i_53_ = (i_38_ + i_50_); ((i_53_ ^ 0xffffffff) > (i_38_
																+ (i_50_ + 4) ^ 0xffffffff)); i_53_++) {
															for (int i_54_ = (i_51_ - -i_37_); ((i_51_
																	+ i_37_ + 4) > i_54_); i_54_++) {
																if (i_53_ >= 0
																		&& ((((Class286) this).anInt3865) > i_53_)
																		&& ((i_54_ ^ 0xffffffff) <= -1)
																		&& ((((Class286) this).anInt3876) > i_54_))
																	((Class286) this).aByteArrayArrayArray3856[i_40_][i_53_][i_54_] = i_52_;
															}
														}
													}
												}
											}
										}
									} else
										throw new IllegalStateException("");
								} else if (is != null) {
									is[0] = stream
											.readUnsignedShort((byte) -65);
									is[1] = stream.method2508((byte) 13);
									is[2] = stream.method2508((byte) -119);
									is[3] = stream.method2508((byte) -116);
									is[4] = stream
											.readUnsignedShort((byte) -65);
								} else
									((Stream) stream).position += 10;
							} else {
								if (class104 == null)
									class104 = new Class104();
								class104.method690(-113, stream);
							}
						} else {
							int i_55_ = stream.readUnsignedByte((byte) 35);
							if ((i_55_ ^ 0xffffffff) < -1) {
								for (int i_56_ = 0; i_55_ > i_56_; i_56_++) {
									Class248 class248 = new Class248(class163,
											stream, 2);
									if (((Class248) class248).anInt3353 == 31) {
										Class112 class112 = (Class299.aClass85_4031
												.method598(
														stream.readUnsignedShort((byte) -65),
														31));
										class248.method1572(
												(byte) 124,
												((Class112) class112).anInt1526,
												((Class112) class112).anInt1531,
												((Class112) class112).anInt1530,
												((Class112) class112).anInt1534);
									}
									if ((class163.method1026() ^ 0xffffffff) < -1) {
										Class11_Sub46 class11_sub46 = (((Class248) class248).aClass11_Sub46_3357);
										int i_57_ = (class11_sub46
												.method3203(false) + (i_38_ << 9));
										int i_58_ = ((i_37_ << 9) + class11_sub46
												.method3204(true));
										int i_59_ = i_57_ >> 9;
										int i_60_ = i_58_ >> 9;
										if (i_59_ >= 0
												&& (i_60_ ^ 0xffffffff) <= -1
												&& ((((Class286) this).anInt3865 ^ 0xffffffff) < (i_59_ ^ 0xffffffff))
												&& (((Class286) this).anInt3876 > i_60_)) {
											class11_sub46
													.method3212(
															i_57_,
															i_58_,
															((((Class286) this).anIntArrayArrayArray3866[(((Class248) class248).anInt3345)][i_59_][i_60_]) + -class11_sub46
																	.method3205(-15)),
															16);
											Class75_Sub2.method2916(class248);
										}
									}
								}
							}
						}
					}
					int i_61_ = 119 % ((i - 52) / 56);
					if (class104 != null) {
						for (int i_62_ = 0; (i_62_ ^ 0xffffffff) > -9; i_62_++) {
							for (int i_63_ = 0; (i_63_ ^ 0xffffffff) > -9; i_63_++) {
								int i_64_ = i_62_ + (i_38_ >> 3);
								int i_65_ = i_63_ + (i_37_ >> 3);
								if ((i_64_ ^ 0xffffffff) <= -1
										&& ((Class286) this).anInt3865 >> 3 > i_64_
										&& i_65_ >= 0
										&& (i_65_ < ((Class286) this).anInt3876 >> 3))
									Class236_Sub9.method3120(class104, i_64_,
											i_65_, -87);
							}
						}
					}
					if (bool
							|| ((Class286) this).aByteArrayArrayArray3856 == null)
						break;
					for (int i_66_ = 0; (i_66_ ^ 0xffffffff) > -5; i_66_++) {
						if (((Class286) this).aByteArrayArrayArray3856[i_66_] != null) {
							for (int i_67_ = 0; i_67_ < 16; i_67_++) {
								for (int i_68_ = 0; i_68_ < 16; i_68_++) {
									int i_69_ = (i_38_ >> 2) + i_67_;
									int i_70_ = (i_37_ >> 2) - -i_68_;
									if ((i_69_ ^ 0xffffffff) <= -1
											&& (i_69_ ^ 0xffffffff) > -27
											&& i_70_ >= 0 && i_70_ < 26)
										((Class286) this).aByteArrayArrayArray3856[i_66_][i_69_][i_70_] = (byte) 0;
								}
							}
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ql.I("
						+ (stream != null ? "{...}" : "null") + ',' + i + ','
						+ (is != null ? "{...}" : "null") + ','
						+ (class163 != null ? "{...}" : "null") + ',' + i_37_
						+ ',' + i_38_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2909(int i, int i_71_, int i_72_, Stream stream,
			int i_73_, int[] is, int i_74_, Class163 class163, int i_75_,
			int i_76_, int i_77_) {
		do {
			try {
				anInt7140++;
				if (!((Class286) this).aBool3870) {
					boolean bool = false;
					if (is != null)
						is[0] = -1;
					Class104 class104 = null;
					int i_78_ = (i_75_ & 0x7) * 8;
					if (i_74_ <= -9) {
						int i_79_ = (0x7 & i_73_) * 8;
						while ((((Stream) stream).buffer.length ^ 0xffffffff) < (((Stream) stream).position ^ 0xffffffff)) {
							int i_80_ = stream.readUnsignedByte((byte) 35);
							if ((i_80_ ^ 0xffffffff) != -1) {
								if ((i_80_ ^ 0xffffffff) == -2) {
									int i_81_ = stream
											.readUnsignedByte((byte) 35);
									if (i_81_ > 0) {
										for (int i_82_ = 0; i_81_ > i_82_; i_82_++) {
											Class248 class248 = new Class248(
													class163, stream, 2);
											if (((((Class248) class248).anInt3353) ^ 0xffffffff) == -32) {
												Class112 class112 = (Class299.aClass85_4031
														.method598(
																(stream.readUnsignedShort((byte) -65)),
																31));
												class248.method1572(
														(byte) 106,
														(((Class112) class112).anInt1526),
														(((Class112) class112).anInt1531),
														(((Class112) class112).anInt1530),
														(((Class112) class112).anInt1534));
											}
											if (class163.method1026() > 0) {
												Class11_Sub46 class11_sub46 = (((Class248) class248).aClass11_Sub46_3357);
												int i_83_ = (class11_sub46
														.method3203(false) >> 9);
												int i_84_ = (class11_sub46
														.method3204(true) >> 9);
												if (((i_71_ ^ 0xffffffff) == ((((Class248) class248).anInt3345) ^ 0xffffffff))
														&& ((i_78_ ^ 0xffffffff) >= (i_83_ ^ 0xffffffff))
														&& i_83_ < 8 + i_78_
														&& ((i_84_ ^ 0xffffffff) <= (i_79_ ^ 0xffffffff))
														&& 8 + i_79_ > i_84_) {
													int i_85_ = ((Class211
															.method1355(
																	(class11_sub46
																			.method3203(false)) & 0xfff,
																	201,
																	i_72_,
																	(class11_sub46
																			.method3204(true)) & 0xfff)) + (i_76_ << 9));
													i_83_ = i_85_ >> 9;
													int i_86_ = ((Class277
															.method1711(
																	-94,
																	i_72_,
																	(class11_sub46
																			.method3204(true)) & 0xfff,
																	(0xfff & (class11_sub46
																			.method3203(false))))) + (i << 9));
													i_84_ = i_86_ >> 9;
													if (((i_83_ ^ 0xffffffff) <= -1)
															&& i_84_ >= 0
															&& ((i_83_ ^ 0xffffffff) > (((Class286) this).anInt3865 ^ 0xffffffff))
															&& (i_84_ < (((Class286) this).anInt3876))) {
														class11_sub46
																.method3212(
																		i_85_,
																		i_86_,
																		((((Class286) this).anIntArrayArrayArray3866[i_71_][i_83_][i_84_]) - (class11_sub46
																				.method3205(105))),
																		16);
														Class75_Sub2
																.method2916(class248);
													}
												}
											}
										}
									}
								} else if ((i_80_ ^ 0xffffffff) != -3) {
									if (i_80_ != 128) {
										if ((i_80_ ^ 0xffffffff) != -130)
											throw new IllegalStateException("");
										if ((((Class286) this).aByteArrayArrayArray3856) == null)
											((Class286) this).aByteArrayArrayArray3856 = new byte[4][][];
										for (int i_87_ = 0; (i_87_ ^ 0xffffffff) > -5; i_87_++) {
											byte i_88_ = stream
													.readByte(1854307120);
											if ((i_88_ ^ 0xffffffff) == -1
													&& (((Class286) this).aByteArrayArrayArray3856[i_77_]) != null) {
												if ((i_87_ ^ 0xffffffff) >= (i_71_ ^ 0xffffffff)) {
													int i_89_ = i_76_;
													int i_90_ = i_76_ + 7;
													int i_91_ = i;
													if ((i_90_ ^ 0xffffffff) <= -1) {
														if (i_90_ >= (((Class286) this).anInt3865))
															i_90_ = (((Class286) this).anInt3865);
													} else
														i_90_ = 0;
													int i_92_ = i + 7;
													if (i_91_ < 0)
														i_91_ = 0;
													else if ((((Class286) this).anInt3876) <= i_91_)
														i_91_ = ((Class286) this).anInt3876;
													if (i_89_ < 0)
														i_89_ = 0;
													else if ((((Class286) this).anInt3865) <= i_89_)
														i_89_ = ((Class286) this).anInt3865;
													if (i_92_ >= 0) {
														if (((((Class286) this).anInt3876) ^ 0xffffffff) >= (i_92_ ^ 0xffffffff))
															i_92_ = (((Class286) this).anInt3876);
													} else
														i_92_ = 0;
													for (/**/; i_90_ > i_89_; i_89_++) {
														for (/**/; ((i_92_ ^ 0xffffffff) < (i_91_ ^ 0xffffffff)); i_91_++)
															((Class286) this).aByteArrayArrayArray3856[i_77_][i_89_][i_91_] = (byte) 0;
													}
												}
											} else if ((i_88_ ^ 0xffffffff) == -2) {
												if ((((Class286) this).aByteArrayArrayArray3856[i_77_]) == null)
													((Class286) this).aByteArrayArrayArray3856[i_77_] = (new byte[(((Class286) this).anInt3865) + 1][1 + (((Class286) this).anInt3876)]);
												for (int i_93_ = 0; ((i_93_ ^ 0xffffffff) > -65); i_93_ += 4) {
													for (int i_94_ = 0; i_94_ < 64; i_94_ += 4) {
														byte i_95_ = (stream
																.readByte(1854307120));
														if ((i_87_ ^ 0xffffffff) >= (i_71_ ^ 0xffffffff)) {
															for (int i_96_ = i_93_; (i_93_ + 4 > i_96_); i_96_++) {
																for (int i_97_ = i_94_; (((i_94_ + 4) ^ 0xffffffff) < (i_97_ ^ 0xffffffff)); i_97_++) {
																	if (((i_78_ ^ 0xffffffff) >= (i_96_ ^ 0xffffffff))
																			&& ((i_78_ + 8) > i_96_)
																			&& (i_79_ <= i_97_)
																			&& ((i_79_ ^ 0xffffffff) > (8 + i_79_ ^ 0xffffffff))) {
																		int i_98_ = Class316
																				.method1923(
																						(byte) 16,
																						i_96_ & 0x7,
																						i_97_ & 0x7,
																						i_72_)
																				+ i_76_;
																		int i_99_ = Class78
																				.method535(
																						i_72_,
																						i_97_ & 0x7,
																						3,
																						i_96_ & 0x7)
																				+ i;
																		if ((i_98_ >= 0)
																				&& (((Class286) this).anInt3865 ^ 0xffffffff) < (i_98_ ^ 0xffffffff)
																				&& (i_99_ ^ 0xffffffff) <= -1
																				&& ((Class286) this).anInt3876 > i_99_)
																			((Class286) this).aByteArrayArrayArray3856[i_77_][i_98_][i_99_] = i_95_;
																	}
																}
															}
														}
													}
												}
											}
										}
									} else if (is != null) {
										is[0] = stream
												.readUnsignedShort((byte) -65);
										is[1] = stream.method2508((byte) 122);
										is[2] = stream.method2508((byte) -76);
										is[3] = stream.method2508((byte) -90);
										is[4] = stream
												.readUnsignedShort((byte) -65);
									} else
										((Stream) stream).position += 10;
								} else {
									if (class104 == null)
										class104 = new Class104();
									class104.method690(-101, stream);
								}
							} else
								class104 = new Class104(stream);
						}
						if (class104 != null)
							Class236_Sub9.method3120(class104, i_76_ >> 3,
									i >> 3, -127);
						if (bool
								|| (((Class286) this).aByteArrayArrayArray3856 == null)
								|| (((Class286) this).aByteArrayArrayArray3856[i_77_]) == null)
							break;
						int i_100_ = i_76_ + 7;
						int i_101_ = 7 + i;
						for (int i_102_ = i_76_; i_100_ > i_102_; i_102_++) {
							for (int i_103_ = i; (i_101_ ^ 0xffffffff) < (i_103_ ^ 0xffffffff); i_103_++)
								((Class286) this).aByteArrayArrayArray3856[i_77_][i_102_][i_103_] = (byte) 0;
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ql.C(" + i + ','
						+ i_71_ + ',' + i_72_ + ','
						+ (stream != null ? "{...}" : "null") + ',' + i_73_
						+ ',' + (is != null ? "{...}" : "null") + ',' + i_74_
						+ ',' + (class163 != null ? "{...}" : "null") + ','
						+ i_75_ + ',' + i_76_ + ',' + i_77_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2910(Class163 class163, int i, Class338[] class338s,
			int i_104_, int i_105_, byte[] is) {
		try {
			anInt7144++;
			if (i_105_ == 3) {
				Stream stream = new Stream(is);
				int i_106_ = -1;
				for (;;) {
					int i_107_ = stream.method2557(i_105_ - 5);
					if ((i_107_ ^ 0xffffffff) == -1)
						break;
					i_106_ += i_107_;
					int i_108_ = 0;
					for (;;) {
						int i_109_ = stream.readSmart(-100);
						if (i_109_ == 0)
							break;
						i_108_ += i_109_ - 1;
						int i_110_ = 0x3f & i_108_;
						int i_111_ = i_108_ >> 6 & 0x3f;
						int i_112_ = i_108_ >> 12;
						int i_113_ = stream.readUnsignedByte((byte) 35);
						int i_114_ = i_113_ >> 2;
						int i_115_ = 0x3 & i_113_;
						int i_116_ = i_111_ - -i;
						int i_117_ = i_110_ + i_104_;
						if (i_116_ > 0
								&& i_117_ > 0
								&& ((-1 + ((Class286) this).anInt3865 ^ 0xffffffff) < (i_116_ ^ 0xffffffff))
								&& ((i_117_ ^ 0xffffffff) > (-1
										+ ((Class286) this).anInt3876 ^ 0xffffffff))) {
							Class338 class338 = null;
							if (!((Class286) this).aBool3870) {
								int i_118_ = i_112_;
								if ((0x2 & (Class11_Sub45_Sub17.aByteArrayArrayArray9509[1][i_116_][i_117_])) == 2)
									i_118_--;
								if ((i_118_ ^ 0xffffffff) <= -1)
									class338 = class338s[i_118_];
							}
							method2911(i_112_, i_115_, -1, i_106_, i_112_,
									class163, i_117_, i_116_, (byte) -127,
									class338, i_114_);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ql.G(" + (class163 != null ? "{...}" : "null") + ',' + i
							+ ',' + (class338s != null ? "{...}" : "null")
							+ ',' + i_104_ + ',' + i_105_ + ','
							+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2911(int i, int i_119_, int i_120_, int i_121_,
			int i_122_, Class163 class163, int i_123_, int i_124_, byte i_125_,
			Class338 class338, int i_126_) {
		try {
			anInt7143++;
			if (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub27_5707
					.method3158(false) != 0
					|| Class173.method1131(i_123_, -1, i_122_, i_124_,
							Class51.anInt800)) {
				if (((Class286_Sub1) this).anInt7146 > i)
					((Class286_Sub1) this).anInt7146 = i;
				Class42 class42 = Class11_Sub4.aClass290_5237.method1793(
						(byte) 23, i_121_);
				if ((((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub6_5697
						.method2429(false) ^ 0xffffffff) != -1
						|| !((Class42) class42).aBool643) {
					if (i_125_ != -127)
						method2908(null, 64, null, null, -43, 64);
					int i_127_;
					int i_128_;
					if (i_119_ != 1 && i_119_ != 3) {
						i_128_ = ((Class42) class42).anInt687;
						i_127_ = ((Class42) class42).anInt682;
					} else {
						i_127_ = ((Class42) class42).anInt687;
						i_128_ = ((Class42) class42).anInt682;
					}
					int i_129_;
					int i_130_;
					if ((i_124_ + i_127_ ^ 0xffffffff) < (((Class286) this).anInt3865 ^ 0xffffffff)) {
						i_129_ = i_124_;
						i_130_ = 1 + i_124_;
					} else {
						i_129_ = (i_127_ >> 1) + i_124_;
						i_130_ = (i_127_ + 1 >> 1) + i_124_;
					}
					int i_131_;
					int i_132_;
					if ((i_128_ + i_123_ ^ 0xffffffff) >= (((Class286) this).anInt3876 ^ 0xffffffff)) {
						i_132_ = i_123_ - -(i_128_ + 1 >> 1);
						i_131_ = i_123_ - -(i_128_ >> 1);
					} else {
						i_131_ = i_123_;
						i_132_ = 1 + i_123_;
					}
					Class12 class12 = Class315.aClass12Array4179[i_122_];
					int i_133_ = ((class12
							.method131((byte) 127, i_131_, i_129_)
							- -class12.method131((byte) 122, i_131_, i_130_) - (-class12
							.method131((byte) 20, i_132_, i_129_) + -class12
							.method131((byte) 123, i_132_, i_130_))) >> 2);
					int i_134_ = (i_124_ << 9) - -(i_127_ << 8);
					int i_135_ = (i_123_ << 9) + (i_128_ << 8);
					boolean bool = (Class11_Sub46_Sub2.aBool9060
							&& !((Class286) this).aBool3870 && ((Class42) class42).aBool681);
					if (class42.method375((byte) 114))
						Class11_Sub30_Sub1.method3530(class42, i_123_, i_119_,
								null, i, i_124_, -106, null);
					boolean bool_136_ = ((i_120_ ^ 0xffffffff) == 0
							&& (((Class42) class42).anInt688 ^ 0xffffffff) == 0
							&& ((Class42) class42).anIntArray669 == null
							&& ((Class42) class42).anIntArray683 == null && !((Class42) class42).aBool615);
					if (!Class198.aBool2677
							|| ((!Class70.method508((byte) -59, i_126_) || ((Class42) class42).anInt652 == 1) && (!Class11_Sub43
									.method2967(i_126_, i_125_ ^ ~0x4) || ((Class42) class42).anInt652 != 0))) {
						if ((i_126_ ^ 0xffffffff) == -23) {
							if (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub3_5703
									.method2347(false) != 0
									|| ((Class42) class42).anInt664 != 0
									|| ((Class42) class42).anInt685 == 1
									|| ((Class42) class42).aBool604) {
								Class376_Sub7_Sub2 class376_sub7_sub2;
								if (!bool_136_)
									class376_sub7_sub2 = (new Class376_Sub7_Sub2_Sub2(
											class163, class42, i, i_122_,
											i_134_, i_133_, i_135_,
											((Class286) this).aBool3870,
											i_119_, i_120_));
								else {
									Class376_Sub7_Sub2_Sub1 class376_sub7_sub2_sub1 = (new Class376_Sub7_Sub2_Sub1(
											class163, class42, i, i_122_,
											i_134_, i_133_, i_135_,
											((Class286) this).aBool3870,
											i_119_, bool));
									if (class376_sub7_sub2_sub1
											.method40((byte) 119))
										class376_sub7_sub2_sub1.method41(30,
												class163);
									class376_sub7_sub2 = class376_sub7_sub2_sub1;
								}
								Class347.method2094(i, i_124_, i_123_,
										class376_sub7_sub2);
								if ((((Class42) class42).anInt685 ^ 0xffffffff) == -2
										&& class338 != null)
									class338.method2033(i_123_, i_124_, false);
							}
						} else if ((i_126_ ^ 0xffffffff) == -11
								|| (i_126_ ^ 0xffffffff) == -12) {
							Class376_Sub7_Sub5_Sub4 class376_sub7_sub5_sub4 = null;
							Class376_Sub7_Sub5 class376_sub7_sub5;
							int i_137_;
							if (bool_136_) {
								Class376_Sub7_Sub5_Sub4 class376_sub7_sub5_sub4_138_ = (new Class376_Sub7_Sub5_Sub4(
										class163, class42, i, i_122_, i_134_,
										i_133_, i_135_,
										((Class286) this).aBool3870, i_124_,
										i_124_ + (i_127_ - 1), i_123_, -1
												+ (i_128_ + i_123_), i_126_,
										i_119_, bool));
								i_137_ = class376_sub7_sub5_sub4_138_
										.method3922(-83);
								class376_sub7_sub5 = class376_sub7_sub5_sub4_138_;
								class376_sub7_sub5_sub4 = class376_sub7_sub5_sub4_138_;
							} else {
								class376_sub7_sub5 = (new Class376_Sub7_Sub5_Sub1(
										class163, class42, i, i_122_, i_134_,
										i_133_, i_135_,
										((Class286) this).aBool3870, i_124_, -1
												+ i_127_ + i_124_, i_123_, -1
												+ i_123_ + i_128_, i_126_,
										i_119_, i_120_));
								i_137_ = 15;
							}
							if (Class98.method661(class376_sub7_sub5, false)) {
								if (class376_sub7_sub5_sub4 != null
										&& class376_sub7_sub5_sub4
												.method40((byte) 118))
									class376_sub7_sub5_sub4.method41(98,
											class163);
								if (((Class42) class42).aBool671
										&& Class11_Sub46_Sub2.aBool9060) {
									if ((i_137_ ^ 0xffffffff) < -31)
										i_137_ = 30;
									for (int i_139_ = 0; ((i_139_ ^ 0xffffffff) >= (i_127_ ^ 0xffffffff)); i_139_++) {
										for (int i_140_ = 0; ((i_140_ ^ 0xffffffff) >= (i_128_ ^ 0xffffffff)); i_140_++)
											class12.ka(i_124_ + i_139_, i_123_
													+ i_140_, i_137_);
									}
								}
							}
							if (((((Class42) class42).anInt685 ^ 0xffffffff) != -1)
									&& class338 != null)
								class338.method2047(i_123_, i_127_,
										(((Class42) class42).aBool618), 256,
										i_128_, i_124_,
										!(((Class42) class42).aBool624));
						} else if (i_126_ >= 12
								&& i_126_ <= 17
								|| ((i_126_ ^ 0xffffffff) <= -19 && (i_126_ ^ 0xffffffff) >= -22)) {
							Class376_Sub7_Sub5 class376_sub7_sub5;
							if (bool_136_) {
								Class376_Sub7_Sub5_Sub4 class376_sub7_sub5_sub4 = (new Class376_Sub7_Sub5_Sub4(
										class163, class42, i, i_122_, i_134_,
										i_133_, i_135_,
										((Class286) this).aBool3870, i_124_, -1
												+ (i_124_ + i_127_), i_123_,
										i_128_ + i_123_ - 1, i_126_, i_119_,
										bool));
								if (class376_sub7_sub5_sub4
										.method40((byte) 108))
									class376_sub7_sub5_sub4.method41(83,
											class163);
								class376_sub7_sub5 = class376_sub7_sub5_sub4;
							} else
								class376_sub7_sub5 = (new Class376_Sub7_Sub5_Sub1(
										class163, class42, i, i_122_, i_134_,
										i_133_, i_135_,
										((Class286) this).aBool3870, i_124_, -1
												+ i_124_ + i_127_, i_123_, -1
												+ (i_128_ + i_123_), i_126_,
										i_119_, i_120_));
							Class98.method661(class376_sub7_sub5, false);
							if (Class11_Sub46_Sub2.aBool9060
									&& !((Class286) this).aBool3870
									&& i_126_ >= 12
									&& (i_126_ ^ 0xffffffff) >= -18
									&& (i_126_ ^ 0xffffffff) != -14
									&& (i ^ 0xffffffff) < -1
									&& ((((Class42) class42).anInt652 ^ 0xffffffff) != -1))
								((Class286) this).aByteArrayArrayArray3857[i][i_124_][i_123_] = (byte) (Class173
										.method1134(
												(((Class286) this).aByteArrayArrayArray3857[i][i_124_][i_123_]),
												4));
							if (((Class42) class42).anInt685 != 0
									&& class338 != null)
								class338.method2047(i_123_, i_127_,
										(((Class42) class42).aBool618), 256,
										i_128_, i_124_,
										!(((Class42) class42).aBool624));
						} else if (i_126_ == 0) {
							int i_141_ = ((Class42) class42).anInt652;
							if (Class11_Sub45_Sub14.aBool9314
									&& ((((Class42) class42).anInt652 ^ 0xffffffff) == 0))
								i_141_ = 1;
							Class376_Sub7_Sub3 class376_sub7_sub3;
							if (bool_136_) {
								Class376_Sub7_Sub3_Sub1 class376_sub7_sub3_sub1 = (new Class376_Sub7_Sub3_Sub1(
										class163, class42, i, i_122_, i_134_,
										i_133_, i_135_,
										((Class286) this).aBool3870, i_126_,
										i_119_, bool));
								if (class376_sub7_sub3_sub1
										.method40((byte) 104))
									class376_sub7_sub3_sub1.method41(58,
											class163);
								class376_sub7_sub3 = class376_sub7_sub3_sub1;
							} else
								class376_sub7_sub3 = (new Class376_Sub7_Sub3_Sub2(
										class163, class42, i, i_122_, i_134_,
										i_133_, i_135_,
										((Class286) this).aBool3870, i_126_,
										i_119_, i_120_));
							Class61.method473(i, i_124_, i_123_,
									class376_sub7_sub3, null);
							if (i_119_ != 0) {
								if ((i_119_ ^ 0xffffffff) == -2) {
									if (Class11_Sub46_Sub2.aBool9060
											&& ((Class42) class42).aBool671) {
										class12.ka(i_124_, i_123_ + 1, 50);
										class12.ka(i_124_ + 1, 1 + i_123_, 50);
									}
									if ((i_141_ ^ 0xffffffff) == -2
											&& !((Class286) this).aBool3870)
										Class376_Sub7_Sub5.method3799(
												1 + i_123_, i, i_124_,
												-((Class42) class42).anInt630,
												2,
												((Class42) class42).anInt657,
												(byte) -48);
								} else if (i_119_ == 2) {
									if (Class11_Sub46_Sub2.aBool9060
											&& ((Class42) class42).aBool671) {
										class12.ka(i_124_ + 1, i_123_, 50);
										class12.ka(i_124_ + 1, i_123_ + 1, 50);
									}
									if (i_141_ == 1
											&& !((Class286) this).aBool3870)
										Class376_Sub7_Sub5.method3799(i_123_,
												i, 1 + i_124_,
												-((Class42) class42).anInt630,
												1,
												((Class42) class42).anInt657,
												(byte) 126);
								} else if (i_119_ == 3) {
									if (Class11_Sub46_Sub2.aBool9060
											&& ((Class42) class42).aBool671) {
										class12.ka(i_124_, i_123_, 50);
										class12.ka(i_124_ + 1, i_123_, 50);
									}
									if (i_141_ == 1
											&& !((Class286) this).aBool3870)
										Class376_Sub7_Sub5.method3799(i_123_,
												i, i_124_,
												((Class42) class42).anInt630,
												2,
												((Class42) class42).anInt657,
												(byte) -34);
								}
							} else {
								if (Class11_Sub46_Sub2.aBool9060
										&& ((Class42) class42).aBool671) {
									class12.ka(i_124_, i_123_, 50);
									class12.ka(i_124_, i_123_ + 1, 50);
								}
								if (i_141_ == 1 && !((Class286) this).aBool3870)
									Class376_Sub7_Sub5.method3799(i_123_, i,
											i_124_,
											((Class42) class42).anInt630, 1,
											((Class42) class42).anInt657,
											(byte) -50);
							}
							if (((((Class42) class42).anInt685 ^ 0xffffffff) != -1)
									&& class338 != null)
								class338.method2030(i_124_, i_119_, i_123_, 1,
										!(((Class42) class42).aBool624),
										i_126_, (((Class42) class42).aBool618));
							if (((Class42) class42).anInt612 != 64)
								Canvas_Sub1.method3607(i, i_124_, i_123_,
										(((Class42) class42).anInt612));
						} else if (i_126_ == 1) {
							Class376_Sub7_Sub3 class376_sub7_sub3;
							if (!bool_136_)
								class376_sub7_sub3 = (new Class376_Sub7_Sub3_Sub2(
										class163, class42, i, i_122_, i_134_,
										i_133_, i_135_,
										((Class286) this).aBool3870, i_126_,
										i_119_, i_120_));
							else {
								Class376_Sub7_Sub3_Sub1 class376_sub7_sub3_sub1 = (new Class376_Sub7_Sub3_Sub1(
										class163, class42, i, i_122_, i_134_,
										i_133_, i_135_,
										((Class286) this).aBool3870, i_126_,
										i_119_, bool));
								class376_sub7_sub3 = class376_sub7_sub3_sub1;
								if (class376_sub7_sub3_sub1.method40((byte) 93))
									class376_sub7_sub3_sub1.method41(115,
											class163);
							}
							Class61.method473(i, i_124_, i_123_,
									class376_sub7_sub3, null);
							if (((Class42) class42).aBool671
									&& Class11_Sub46_Sub2.aBool9060) {
								if (i_119_ == 0)
									class12.ka(i_124_, i_123_ + 1, 50);
								else if ((i_119_ ^ 0xffffffff) == -2)
									class12.ka(i_124_ + 1, i_123_ + 1, 50);
								else if (i_119_ != 2) {
									if ((i_119_ ^ 0xffffffff) == -4)
										class12.ka(i_124_, i_123_, 50);
								} else
									class12.ka(i_124_ + 1, i_123_, 50);
							}
							if (((Class42) class42).anInt685 != 0
									&& class338 != null)
								class338.method2030(i_124_, i_119_, i_123_,
										i_125_ ^ ~0x7f,
										!((Class42) class42).aBool624, i_126_,
										((Class42) class42).aBool618);
						} else if ((i_126_ ^ 0xffffffff) == -3) {
							int i_142_ = 0x3 & i_119_ + 1;
							Class376_Sub7_Sub3 class376_sub7_sub3;
							Class376_Sub7_Sub3 class376_sub7_sub3_143_;
							if (!bool_136_) {
								class376_sub7_sub3_143_ = (new Class376_Sub7_Sub3_Sub2(
										class163, class42, i, i_122_, i_134_,
										i_133_, i_135_,
										((Class286) this).aBool3870, i_126_,
										4 + i_119_, i_120_));
								class376_sub7_sub3 = (new Class376_Sub7_Sub3_Sub2(
										class163, class42, i, i_122_, i_134_,
										i_133_, i_135_,
										((Class286) this).aBool3870, i_126_,
										i_142_, i_120_));
							} else {
								Class376_Sub7_Sub3_Sub1 class376_sub7_sub3_sub1 = (new Class376_Sub7_Sub3_Sub1(
										class163, class42, i, i_122_, i_134_,
										i_133_, i_135_,
										((Class286) this).aBool3870, i_126_,
										i_119_ + 4, bool));
								Class376_Sub7_Sub3_Sub1 class376_sub7_sub3_sub1_144_ = (new Class376_Sub7_Sub3_Sub1(
										class163, class42, i, i_122_, i_134_,
										i_133_, i_135_,
										((Class286) this).aBool3870, i_126_,
										i_142_, bool));
								if (class376_sub7_sub3_sub1.method40((byte) 85))
									class376_sub7_sub3_sub1.method41(111,
											class163);
								class376_sub7_sub3 = class376_sub7_sub3_sub1_144_;
								class376_sub7_sub3_143_ = class376_sub7_sub3_sub1;
								if (class376_sub7_sub3_sub1_144_
										.method40((byte) 100))
									class376_sub7_sub3_sub1_144_.method41(81,
											class163);
							}
							Class61.method473(i, i_124_, i_123_,
									class376_sub7_sub3_143_, class376_sub7_sub3);
							if ((((Class42) class42).anInt652 == 1 || (Class11_Sub45_Sub14.aBool9314 && ((Class42) class42).anInt652 == -1))
									&& !((Class286) this).aBool3870) {
								if ((i_119_ ^ 0xffffffff) == -1) {
									Class376_Sub7_Sub5.method3799(i_123_, i,
											i_124_,
											((Class42) class42).anInt630, 1,
											((Class42) class42).anInt657,
											(byte) 124);
									Class376_Sub7_Sub5.method3799(i_123_ + 1,
											i, i_124_,
											((Class42) class42).anInt630, 2,
											((Class42) class42).anInt657,
											(byte) -89);
								} else if (i_119_ != 1) {
									if (i_119_ == 2) {
										Class376_Sub7_Sub5.method3799(i_123_,
												i, 1 + i_124_,
												((Class42) class42).anInt630,
												1,
												((Class42) class42).anInt657,
												(byte) 126);
										Class376_Sub7_Sub5.method3799(i_123_,
												i, i_124_,
												((Class42) class42).anInt630,
												2,
												((Class42) class42).anInt657,
												(byte) -110);
									} else if (i_119_ == 3) {
										Class376_Sub7_Sub5.method3799(i_123_,
												i, i_124_,
												((Class42) class42).anInt630,
												1,
												((Class42) class42).anInt657,
												(byte) 125);
										Class376_Sub7_Sub5.method3799(i_123_,
												i, i_124_,
												((Class42) class42).anInt630,
												2,
												((Class42) class42).anInt657,
												(byte) 124);
									}
								} else {
									Class376_Sub7_Sub5.method3799(i_123_, i,
											1 + i_124_,
											((Class42) class42).anInt630, 1,
											((Class42) class42).anInt657,
											(byte) -40);
									Class376_Sub7_Sub5.method3799(i_123_ + 1,
											i, i_124_,
											((Class42) class42).anInt630, 2,
											((Class42) class42).anInt657,
											(byte) 124);
								}
							}
							if (((Class42) class42).anInt685 != 0
									&& class338 != null)
								class338.method2030(i_124_, i_119_, i_123_, 1,
										!(((Class42) class42).aBool624),
										i_126_, (((Class42) class42).aBool618));
							if (((Class42) class42).anInt612 != 64)
								Canvas_Sub1.method3607(i, i_124_, i_123_,
										(((Class42) class42).anInt612));
						} else if (i_126_ == 3) {
							Class376_Sub7_Sub3 class376_sub7_sub3;
							if (bool_136_) {
								Class376_Sub7_Sub3_Sub1 class376_sub7_sub3_sub1 = (new Class376_Sub7_Sub3_Sub1(
										class163, class42, i, i_122_, i_134_,
										i_133_, i_135_,
										((Class286) this).aBool3870, i_126_,
										i_119_, bool));
								class376_sub7_sub3 = class376_sub7_sub3_sub1;
								if (class376_sub7_sub3_sub1
										.method40((byte) 119))
									class376_sub7_sub3_sub1.method41(
											i_125_ + 235, class163);
							} else
								class376_sub7_sub3 = (new Class376_Sub7_Sub3_Sub2(
										class163, class42, i, i_122_, i_134_,
										i_133_, i_135_,
										((Class286) this).aBool3870, i_126_,
										i_119_, i_120_));
							Class61.method473(i, i_124_, i_123_,
									class376_sub7_sub3, null);
							if (((Class42) class42).aBool671
									&& Class11_Sub46_Sub2.aBool9060) {
								if (i_119_ == 0)
									class12.ka(i_124_, 1 + i_123_, 50);
								else if ((i_119_ ^ 0xffffffff) == -2)
									class12.ka(i_124_ + 1, i_123_ + 1, 50);
								else if (i_119_ != 2) {
									if ((i_119_ ^ 0xffffffff) == -4)
										class12.ka(i_124_, i_123_, 50);
								} else
									class12.ka(1 + i_124_, i_123_, 50);
							}
							if (((Class42) class42).anInt685 != 0
									&& class338 != null)
								class338.method2030(i_124_, i_119_, i_123_, 1,
										!(((Class42) class42).aBool624),
										i_126_, (((Class42) class42).aBool618));
						} else if (i_126_ == 9) {
							Class376_Sub7_Sub5 class376_sub7_sub5;
							if (!bool_136_)
								class376_sub7_sub5 = (new Class376_Sub7_Sub5_Sub1(
										class163, class42, i, i_122_, i_134_,
										i_133_, i_135_,
										((Class286) this).aBool3870, i_124_,
										i_127_ + (i_124_ - 1), i_123_, i_123_
												- -i_128_ - 1, i_126_, i_119_,
										i_120_));
							else {
								Class376_Sub7_Sub5_Sub4 class376_sub7_sub5_sub4 = (new Class376_Sub7_Sub5_Sub4(
										class163, class42, i, i_122_, i_134_,
										i_133_, i_135_,
										((Class286) this).aBool3870, i_124_,
										i_124_, i_123_, i_123_, i_126_, i_119_,
										bool));
								if (class376_sub7_sub5_sub4
										.method40((byte) 113))
									class376_sub7_sub5_sub4.method41(121,
											class163);
								class376_sub7_sub5 = class376_sub7_sub5_sub4;
							}
							Class98.method661(class376_sub7_sub5, false);
							if (((Class42) class42).anInt652 == 1
									&& !((Class286) this).aBool3870) {
								int i_145_;
								if ((i_119_ & 0x1) != 0)
									i_145_ = 16;
								else
									i_145_ = 8;
								Class376_Sub7_Sub5.method3799(i_123_, i,
										i_124_, 0, i_145_,
										((Class42) class42).anInt657,
										(byte) 123);
							}
							if (((Class42) class42).anInt685 != 0
									&& class338 != null)
								class338.method2047(i_123_, i_127_,
										(((Class42) class42).aBool618), 256,
										i_128_, i_124_,
										!(((Class42) class42).aBool624));
							if (((Class42) class42).anInt612 != 64)
								Canvas_Sub1.method3607(i, i_124_, i_123_,
										(((Class42) class42).anInt612));
						} else if ((i_126_ ^ 0xffffffff) == -5) {
							Class376_Sub7_Sub4 class376_sub7_sub4;
							if (bool_136_) {
								Class376_Sub7_Sub4_Sub1 class376_sub7_sub4_sub1 = (new Class376_Sub7_Sub4_Sub1(
										class163, class42, i, i_122_, i_134_,
										i_133_, i_135_,
										((Class286) this).aBool3870, 0, 0,
										i_126_, i_119_));
								class376_sub7_sub4 = class376_sub7_sub4_sub1;
								if (class376_sub7_sub4_sub1.method40((byte) 93))
									class376_sub7_sub4_sub1.method41(39,
											class163);
							} else
								class376_sub7_sub4 = (new Class376_Sub7_Sub4_Sub2(
										class163, class42, i, i_122_, i_134_,
										i_133_, i_135_,
										((Class286) this).aBool3870, 0, 0,
										i_126_, i_119_, i_120_));
							Class1_Sub1.method2902(i, i_124_, i_123_,
									class376_sub7_sub4, null);
						} else if (i_126_ == 5) {
							int i_146_ = 65;
							Interface13 interface13 = ((Interface13) Class209
									.method1342(i, i_124_, i_123_));
							if (interface13 != null)
								i_146_ = 1 + (((Class42) (Class11_Sub4.aClass290_5237
										.method1793((byte) 118, interface13
												.method42((byte) -17)))).anInt612);
							Class376_Sub7_Sub4 class376_sub7_sub4;
							if (bool_136_) {
								Class376_Sub7_Sub4_Sub1 class376_sub7_sub4_sub1 = (new Class376_Sub7_Sub4_Sub1(
										class163,
										class42,
										i,
										i_122_,
										i_134_,
										i_133_,
										i_135_,
										((Class286) this).aBool3870,
										Class38.anIntArray512[i_119_] * i_146_,
										i_146_
												* (Class11_Sub7.anIntArray5269[i_119_]),
										i_126_, i_119_));
								if (class376_sub7_sub4_sub1
										.method40((byte) 104))
									class376_sub7_sub4_sub1.method41(74,
											class163);
								class376_sub7_sub4 = class376_sub7_sub4_sub1;
							} else
								class376_sub7_sub4 = (new Class376_Sub7_Sub4_Sub2(
										class163,
										class42,
										i,
										i_122_,
										i_134_,
										i_133_,
										i_135_,
										((Class286) this).aBool3870,
										Class38.anIntArray512[i_119_] * i_146_,
										i_146_
												* (Class11_Sub7.anIntArray5269[i_119_]),
										i_126_, i_119_, i_120_));
							Class1_Sub1.method2902(i, i_124_, i_123_,
									class376_sub7_sub4, null);
						} else if ((i_126_ ^ 0xffffffff) == -7) {
							int i_147_ = 33;
							Interface13 interface13 = ((Interface13) Class209
									.method1342(i, i_124_, i_123_));
							if (interface13 != null)
								i_147_ = 1 + (((Class42) (Class11_Sub4.aClass290_5237
										.method1793((byte) 18, interface13
												.method42((byte) -17)))).anInt612) / 2;
							Class376_Sub7_Sub4 class376_sub7_sub4;
							if (!bool_136_)
								class376_sub7_sub4 = (new Class376_Sub7_Sub4_Sub2(
										class163,
										class42,
										i,
										i_122_,
										i_134_,
										i_133_,
										i_135_,
										((Class286) this).aBool3870,
										(i_147_ * Class166.anIntArray2147[i_119_]),
										i_147_
												* (Class11_Sub32.anIntArray6890[i_119_]),
										i_126_, i_119_ + 4, i_120_));
							else {
								Class376_Sub7_Sub4_Sub1 class376_sub7_sub4_sub1 = (new Class376_Sub7_Sub4_Sub1(
										class163,
										class42,
										i,
										i_122_,
										i_134_,
										i_133_,
										i_135_,
										((Class286) this).aBool3870,
										Class38.anIntArray512[i_119_] * i_147_,
										(Class11_Sub7.anIntArray5269[i_119_] * i_147_),
										i_126_, i_119_ + 4));
								if (class376_sub7_sub4_sub1
										.method40((byte) 125))
									class376_sub7_sub4_sub1.method41(104,
											class163);
								class376_sub7_sub4 = class376_sub7_sub4_sub1;
							}
							Class1_Sub1.method2902(i, i_124_, i_123_,
									class376_sub7_sub4, null);
						} else if ((i_126_ ^ 0xffffffff) == -8) {
							int i_148_ = 0x3 & 2 + i_119_;
							Class376_Sub7_Sub4 class376_sub7_sub4;
							if (bool_136_) {
								Class376_Sub7_Sub4_Sub1 class376_sub7_sub4_sub1 = (new Class376_Sub7_Sub4_Sub1(
										class163, class42, i, i_122_, i_134_,
										i_133_, i_135_,
										((Class286) this).aBool3870, 0, 0,
										i_126_, 4 + i_148_));
								if (class376_sub7_sub4_sub1
										.method40((byte) 100))
									class376_sub7_sub4_sub1.method41(120,
											class163);
								class376_sub7_sub4 = class376_sub7_sub4_sub1;
							} else
								class376_sub7_sub4 = (new Class376_Sub7_Sub4_Sub2(
										class163, class42, i, i_122_, i_134_,
										i_133_, i_135_,
										((Class286) this).aBool3870, 0, 0,
										i_126_, i_148_ + 4, i_120_));
							Class1_Sub1.method2902(i, i_124_, i_123_,
									class376_sub7_sub4, null);
						} else if ((i_126_ ^ 0xffffffff) == -9) {
							int i_149_ = 0x3 & 2 + i_119_;
							int i_150_ = 33;
							Interface13 interface13 = ((Interface13) Class209
									.method1342(i, i_124_, i_123_));
							if (interface13 != null)
								i_150_ = (((Class42) (Class11_Sub4.aClass290_5237
										.method1793((byte) 33, interface13
												.method42((byte) -17)))).anInt612) / 2 + 1;
							Class376_Sub7_Sub4 class376_sub7_sub4;
							Class376_Sub7_Sub4 class376_sub7_sub4_151_;
							if (bool_136_) {
								Class376_Sub7_Sub4_Sub1 class376_sub7_sub4_sub1 = (new Class376_Sub7_Sub4_Sub1(
										class163,
										class42,
										i,
										i_122_,
										i_134_,
										i_133_,
										i_135_,
										((Class286) this).aBool3870,
										(i_150_ * Class166.anIntArray2147[i_119_]),
										(Class11_Sub32.anIntArray6890[i_119_] * i_150_),
										i_126_, 4 + i_119_));
								Class376_Sub7_Sub4_Sub1 class376_sub7_sub4_sub1_152_ = (new Class376_Sub7_Sub4_Sub1(
										class163, class42, i, i_122_, i_134_,
										i_133_, i_135_,
										((Class286) this).aBool3870, 0, 0,
										i_126_, i_149_ + 4));
								if (class376_sub7_sub4_sub1
										.method40((byte) 103))
									class376_sub7_sub4_sub1.method41(122,
											class163);
								class376_sub7_sub4_151_ = class376_sub7_sub4_sub1_152_;
								class376_sub7_sub4 = class376_sub7_sub4_sub1;
								if (class376_sub7_sub4_sub1_152_
										.method40((byte) 86))
									class376_sub7_sub4_sub1_152_.method41(
											i_125_ + 239, class163);
							} else {
								Class376_Sub7_Sub4_Sub2 class376_sub7_sub4_sub2 = (new Class376_Sub7_Sub4_Sub2(
										class163,
										class42,
										i,
										i_122_,
										i_134_,
										i_133_,
										i_135_,
										((Class286) this).aBool3870,
										(i_150_ * Class166.anIntArray2147[i_119_]),
										i_150_
												* (Class11_Sub32.anIntArray6890[i_119_]),
										i_126_, 4 + i_119_, i_120_));
								Class376_Sub7_Sub4_Sub2 class376_sub7_sub4_sub2_153_ = (new Class376_Sub7_Sub4_Sub2(
										class163, class42, i, i_122_, i_134_,
										i_133_, i_135_,
										((Class286) this).aBool3870, 0, 0,
										i_126_, 4 + i_149_, i_120_));
								class376_sub7_sub4 = class376_sub7_sub4_sub2;
								class376_sub7_sub4_151_ = class376_sub7_sub4_sub2_153_;
							}
							Class1_Sub1
									.method2902(i, i_124_, i_123_,
											class376_sub7_sub4,
											class376_sub7_sub4_151_);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ql.E(" + i + ',' + i_119_ + ',' + i_120_ + ',' + i_121_
							+ ',' + i_122_ + ','
							+ (class163 != null ? "{...}" : "null") + ','
							+ i_123_ + ',' + i_124_ + ',' + i_125_ + ','
							+ (class338 != null ? "{...}" : "null") + ','
							+ i_126_ + ')'));
		}
	}

	private final Interface13 method2912(int i, int i_154_, int i_155_,
			int i_156_, int i_157_) {
		try {
			anInt7141++;
			Interface13 interface13 = null;
			if (i_155_ == 0)
				interface13 = (Interface13) Class209.method1342(i, i_157_,
						i_156_);
			if (i_155_ == 1)
				interface13 = (Interface13) Class108_Sub9.method2608(i, i_157_,
						i_156_);
			if (i_154_ == i_155_)
				interface13 = ((Interface13) Class180
						.method1185(
								i,
								i_157_,
								i_156_,
								(aClass7148 != null ? aClass7148
										: (aClass7148 = getClassByName("Interface13")))));
			if ((i_155_ ^ 0xffffffff) == -4)
				interface13 = (Interface13) Class159.method988(i, i_157_,
						i_156_);
			return interface13;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ql.B(" + i + ',' + i_154_ + ',' + i_155_ + ',' + i_156_
							+ ',' + i_157_ + ')'));
		}
	}

	final void method2913(int i, int i_158_, Class338 class338,
			Class163 class163, int i_159_, byte i_160_, int i_161_) {
		do {
			try {
				anInt7139++;
				Interface13 interface13 = method2912(i_158_, i_160_ ^ 0x6d,
						i_161_, i_159_, i);
				if (interface13 != null) {
					Class42 class42 = (Class11_Sub4.aClass290_5237.method1793(
							(byte) 38, interface13.method42((byte) -17)));
					int i_162_ = interface13.method29((byte) -10);
					int i_163_ = interface13.method30(i_160_ + 30263);
					if (class42.method375((byte) 114))
						Class29.method245(i_158_, i_159_, class42, i, 16131);
					if (interface13.method40((byte) 108))
						interface13.method44(class163, (byte) -73);
					if (i_161_ == 0) {
						Class11_Sub45_Sub18.method3761(i_158_, i, i_159_);
						if ((((Class42) class42).anInt685 ^ 0xffffffff) != -1)
							class338.method2032(i_163_,
									((Class42) class42).aBool618, i,
									!((Class42) class42).aBool624, i_159_, 0,
									i_162_);
						if (((Class42) class42).anInt652 == 1) {
							if (i_163_ != 0) {
								if ((i_163_ ^ 0xffffffff) == -2)
									Stream.method2498(20783, 1 + i_159_, 2, i,
											i_158_);
								else if ((i_163_ ^ 0xffffffff) != -3) {
									if (i_163_ == 3)
										Stream.method2498(i_160_ ^ 0x5140,
												i_159_, 2, i, i_158_);
								} else
									Stream.method2498(20783, i_159_, 1, i + 1,
											i_158_);
							} else
								Stream.method2498(20783, i_159_, 1, i, i_158_);
						}
					} else if (i_161_ != 1) {
						if (i_161_ != 2) {
							if (i_161_ == 3) {
								Class291.method1803(i_158_, i, i_159_);
								if (((Class42) class42).anInt685 == 1)
									class338.method2041(i_159_, i, 26964);
							}
						} else {
							InterfaceSettings
									.method2352(
											i_158_,
											i,
											i_159_,
											(aClass7148 != null ? aClass7148
													: (aClass7148 = getClassByName("Interface13"))));
							if (((Class42) class42).anInt685 != 0
									&& (((Class42) class42).anInt682 + i < ((Class286) this).anInt3865)
									&& ((((Class286) this).anInt3876 ^ 0xffffffff) < (((Class42) class42).anInt682
											+ i_159_ ^ 0xffffffff))
									&& ((i - -((Class42) class42).anInt687 ^ 0xffffffff) > (((Class286) this).anInt3865 ^ 0xffffffff))
									&& (((Class42) class42).anInt687 + i_159_ < ((Class286) this).anInt3876))
								class338.method2031(
										!((Class42) class42).aBool624, i_159_,
										(byte) 74, i, i_163_,
										((Class42) class42).aBool618,
										((Class42) class42).anInt687,
										((Class42) class42).anInt682);
							if ((i_162_ ^ 0xffffffff) == -10) {
								if ((0x1 & i_163_) != 0)
									Stream.method2498(i_160_ ^ 0x5140, i_159_,
											16, i, i_158_);
								else
									Stream.method2498(20783, i_159_, 8, i,
											i_158_);
							}
						}
					} else
						Class276.method1710(i_158_, i, i_159_);
				}
				if (i_160_ == 111)
					break;
				method2908(null, -81, null, null, -55, 65);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ql.H(" + i + ','
						+ i_158_ + ',' + (class338 != null ? "{...}" : "null")
						+ ',' + (class163 != null ? "{...}" : "null") + ','
						+ i_159_ + ',' + i_160_ + ',' + i_161_ + ')'));
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
}
