/* Class68 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

final class Class68 {
	static int anInt954;
	static float aFloat955;
	static int anInt956;
	private Class376_Sub1_Sub1[][] aClass376_Sub1_Sub1ArrayArray957;
	static int anInt958;
	private Interface27 anInterface27_959;
	static int anInt960;
	private Class376_Sub1_Sub1[][] aClass376_Sub1_Sub1ArrayArray961 = new Class376_Sub1_Sub1[1600][64];
	static Class218 aClass218_962 = new Class218();
	private int anInt963;
	private Class219 aClass219_964;
	static int anInt965;
	private int[] anIntArray966;
	static int anInt967;
	static int[] anIntArray968;
	static int anInt969;
	private int[] anIntArray970;
	private Interface3 anInterface3_971;
	private Interface3 anInterface3_972;
	private int[] anIntArray973;
	static int anInt974;
	static OutgoingPacket ACTION_BUTTON1;
	static int anInt976 = 0;

	private final void method496(byte i, Class163_Sub2 class163_sub2, int i_0_) {
		try {
			anInt960++;
			Class258.aFloat3528 = ((Class163_Sub2) class163_sub2).aFloat7606;
			class163_sub2.method3069((float) i_0_, 31823);
			if (i >= 44) {
				class163_sub2.method2995(1);
				class163_sub2.method3015(0, false);
				class163_sub2.method3039(false, (byte) -31);
				class163_sub2.method3090((byte) 100);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ufa.C(" + i + ','
							+ (class163_sub2 != null ? "{...}" : "null") + ','
							+ i_0_ + ')'));
		}
	}

	public static void method497(int i) {
		try {
			aClass218_962 = null;
			ACTION_BUTTON1 = null;
			int i_1_ = -11 / ((84 - i) / 34);
			anIntArray968 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ufa.G(" + i + ')');
		}
	}

	private final void method498(int i, Class163_Sub2 class163_sub2, byte i_2_) {
		do {
			try {
				anInt965++;
				int i_3_ = 0;
				Class33_Sub2 class33_sub2 = class163_sub2.method3081(-75);
				float f = ((Class33_Sub2) class33_sub2).aFloat6651;
				float f_4_ = ((Class33_Sub2) class33_sub2).aFloat6661;
				float f_5_ = ((Class33_Sub2) class33_sub2).aFloat6676;
				float f_6_ = ((Class33_Sub2) class33_sub2).aFloat6678;
				float f_7_ = ((Class33_Sub2) class33_sub2).aFloat6682;
				float f_8_ = ((Class33_Sub2) class33_sub2).aFloat6691;
				float f_9_ = f + f_6_;
				float f_10_ = f_4_ + f_7_;
				if (i_2_ >= -10)
					method497(-86);
				float f_11_ = f_5_ + f_8_;
				float f_12_ = f - f_6_;
				float f_13_ = -f_7_ + f_4_;
				float f_14_ = f_5_ - f_8_;
				float f_15_ = -f + f_6_;
				float f_16_ = -f_4_ + f_7_;
				float f_17_ = f_8_ - f_5_;
				Buffer buffer = anInterface3_971.method12(-5419, true);
				if (buffer != null) {
					jaclib.memory.Stream stream = class163_sub2.method3098(
							buffer, true);
					if (!jaclib.memory.Stream.method353()) {
						for (int i_18_ = i - 1; i_18_ >= 0; i_18_--) {
							int i_19_ = ((anIntArray970[i_18_] ^ 0xffffffff) >= -65 ? anIntArray970[i_18_]
									: 64);
							if (i_19_ > 0) {
								for (int i_20_ = -1 + i_19_; i_20_ >= 0; i_20_--) {
									Class376_Sub1_Sub1 class376_sub1_sub1 = (aClass376_Sub1_Sub1ArrayArray961[i_18_][i_20_]);
									int i_21_ = (((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8696);
									byte i_22_ = (byte) (i_21_ >> 16);
									byte i_23_ = (byte) (i_21_ >> 8);
									byte i_24_ = (byte) i_21_;
									byte i_25_ = (byte) (i_21_ >>> 24);
									float f_26_ = (float) ((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8689) >> 12);
									float f_27_ = (float) ((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8691) >> 12);
									float f_28_ = (float) ((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8684) >> 12);
									int i_29_ = (((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8692 >> 12);
									stream.method349(f_9_ * (float) -i_29_
											+ f_26_);
									stream.method349(f_27_ + (float) -i_29_
											* f_10_);
									stream.method349((float) -i_29_ * f_11_
											+ f_28_);
									if ((((Class163_Sub2) class163_sub2).anInt7608) != 0)
										stream.method343(i_22_, i_23_, i_24_,
												i_25_);
									else
										stream.method356(i_22_, i_23_, i_24_,
												i_25_);
									stream.method349(0.0F);
									stream.method349(0.0F);
									stream.method349(f_12_ * (float) i_29_
											+ f_26_);
									stream.method349(f_13_ * (float) i_29_
											+ f_27_);
									stream.method349(f_28_ + (float) i_29_
											* f_14_);
									if (((((Class163_Sub2) class163_sub2).anInt7608) ^ 0xffffffff) == -1)
										stream.method356(i_22_, i_23_, i_24_,
												i_25_);
									else
										stream.method343(i_22_, i_23_, i_24_,
												i_25_);
									stream.method349(1.0F);
									stream.method349(0.0F);
									stream.method349(f_26_ + (float) i_29_
											* f_9_);
									stream.method349((float) i_29_ * f_10_
											+ f_27_);
									stream.method349((float) i_29_ * f_11_
											+ f_28_);
									if ((((Class163_Sub2) class163_sub2).anInt7608) != 0)
										stream.method343(i_22_, i_23_, i_24_,
												i_25_);
									else
										stream.method356(i_22_, i_23_, i_24_,
												i_25_);
									stream.method349(1.0F);
									stream.method349(1.0F);
									stream.method349(f_26_ + (float) i_29_
											* f_15_);
									stream.method349(f_27_ + f_16_
											* (float) i_29_);
									stream.method349(f_28_ + (float) i_29_
											* f_17_);
									if ((((Class163_Sub2) class163_sub2).anInt7608) != 0)
										stream.method343(i_22_, i_23_, i_24_,
												i_25_);
									else
										stream.method356(i_22_, i_23_, i_24_,
												i_25_);
									stream.method349(0.0F);
									stream.method349(1.0F);
									i_3_++;
								}
								if ((anIntArray970[i_18_] ^ 0xffffffff) < -65) {
									int i_30_ = -64 + anIntArray970[i_18_] - 1;
									for (int i_31_ = anIntArray966[i_30_] - 1; i_31_ >= 0; i_31_--) {
										Class376_Sub1_Sub1 class376_sub1_sub1 = (aClass376_Sub1_Sub1ArrayArray957[i_30_][i_31_]);
										int i_32_ = (((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8696);
										byte i_33_ = (byte) (i_32_ >> 16);
										byte i_34_ = (byte) (i_32_ >> 8);
										byte i_35_ = (byte) i_32_;
										byte i_36_ = (byte) (i_32_ >>> 24);
										float f_37_ = (float) ((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8689) >> 12);
										float f_38_ = (float) ((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8691) >> 12);
										float f_39_ = (float) ((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8684) >> 12);
										int i_40_ = (((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8692 >> 12);
										stream.method349(f_37_
												+ ((float) -i_40_ * f_9_));
										stream.method349((float) -i_40_ * f_10_
												+ f_38_);
										stream.method349(f_11_ * (float) -i_40_
												+ f_39_);
										if (((((Class163_Sub2) class163_sub2).anInt7608) ^ 0xffffffff) == -1)
											stream.method356(i_33_, i_34_,
													i_35_, i_36_);
										else
											stream.method343(i_33_, i_34_,
													i_35_, i_36_);
										stream.method349(0.0F);
										stream.method349(0.0F);
										stream.method349(f_12_ * (float) i_40_
												+ f_37_);
										stream.method349((float) i_40_ * f_13_
												+ f_38_);
										stream.method349(f_39_
												+ ((float) i_40_ * f_14_));
										if ((((Class163_Sub2) class163_sub2).anInt7608) != 0)
											stream.method343(i_33_, i_34_,
													i_35_, i_36_);
										else
											stream.method356(i_33_, i_34_,
													i_35_, i_36_);
										stream.method349(1.0F);
										stream.method349(0.0F);
										stream.method349(f_37_
												+ (f_9_ * (float) i_40_));
										stream.method349(f_10_ * (float) i_40_
												+ f_38_);
										stream.method349((float) i_40_ * f_11_
												+ f_39_);
										if ((((Class163_Sub2) class163_sub2).anInt7608) != 0)
											stream.method343(i_33_, i_34_,
													i_35_, i_36_);
										else
											stream.method356(i_33_, i_34_,
													i_35_, i_36_);
										stream.method349(1.0F);
										stream.method349(1.0F);
										stream.method349((float) i_40_ * f_15_
												+ f_37_);
										stream.method349(f_16_ * (float) i_40_
												+ f_38_);
										stream.method349(f_39_
												+ ((float) i_40_ * f_17_));
										if (((((Class163_Sub2) class163_sub2).anInt7608) ^ 0xffffffff) != -1)
											stream.method343(i_33_, i_34_,
													i_35_, i_36_);
										else
											stream.method356(i_33_, i_34_,
													i_35_, i_36_);
										stream.method349(0.0F);
										stream.method349(1.0F);
										i_3_++;
									}
								}
							}
						}
					} else {
						for (int i_41_ = i - 1; i_41_ >= 0; i_41_--) {
							int i_42_ = ((anIntArray970[i_41_] ^ 0xffffffff) < -65 ? 64
									: anIntArray970[i_41_]);
							if (i_42_ > 0) {
								for (int i_43_ = -1 + i_42_; i_43_ >= 0; i_43_--) {
									Class376_Sub1_Sub1 class376_sub1_sub1 = (aClass376_Sub1_Sub1ArrayArray961[i_41_][i_43_]);
									int i_44_ = (((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8696);
									byte i_45_ = (byte) (i_44_ >> 16);
									byte i_46_ = (byte) (i_44_ >> 8);
									byte i_47_ = (byte) i_44_;
									byte i_48_ = (byte) (i_44_ >>> 24);
									float f_49_ = (float) ((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8689) >> 12);
									float f_50_ = (float) ((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8691) >> 12);
									float f_51_ = (float) ((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8684) >> 12);
									int i_52_ = (((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8692 >> 12);
									stream.method357((float) -i_52_ * f_9_
											+ f_49_);
									stream.method357(f_50_ + (float) -i_52_
											* f_10_);
									stream.method357(f_51_ + f_11_
											* (float) -i_52_);
									if (((((Class163_Sub2) class163_sub2).anInt7608) ^ 0xffffffff) == -1)
										stream.method356(i_45_, i_46_, i_47_,
												i_48_);
									else
										stream.method343(i_45_, i_46_, i_47_,
												i_48_);
									stream.method357(0.0F);
									stream.method357(0.0F);
									stream.method357(f_12_ * (float) i_52_
											+ f_49_);
									stream.method357(f_13_ * (float) i_52_
											+ f_50_);
									stream.method357(f_14_ * (float) i_52_
											+ f_51_);
									if (((((Class163_Sub2) class163_sub2).anInt7608) ^ 0xffffffff) != -1)
										stream.method343(i_45_, i_46_, i_47_,
												i_48_);
									else
										stream.method356(i_45_, i_46_, i_47_,
												i_48_);
									stream.method357(1.0F);
									stream.method357(0.0F);
									stream.method357(f_9_ * (float) i_52_
											+ f_49_);
									stream.method357((float) i_52_ * f_10_
											+ f_50_);
									stream.method357(f_51_ + f_11_
											* (float) i_52_);
									if ((((Class163_Sub2) class163_sub2).anInt7608) == 0)
										stream.method356(i_45_, i_46_, i_47_,
												i_48_);
									else
										stream.method343(i_45_, i_46_, i_47_,
												i_48_);
									stream.method357(1.0F);
									stream.method357(1.0F);
									stream.method357(f_15_ * (float) i_52_
											+ f_49_);
									stream.method357(f_50_ + (float) i_52_
											* f_16_);
									stream.method357(f_17_ * (float) i_52_
											+ f_51_);
									if ((((Class163_Sub2) class163_sub2).anInt7608) == 0)
										stream.method356(i_45_, i_46_, i_47_,
												i_48_);
									else
										stream.method343(i_45_, i_46_, i_47_,
												i_48_);
									stream.method357(0.0F);
									i_3_++;
									stream.method357(1.0F);
								}
								if (anIntArray970[i_41_] > 64) {
									int i_53_ = -64 + anIntArray970[i_41_] - 1;
									for (int i_54_ = -1 + anIntArray966[i_53_]; i_54_ >= 0; i_54_--) {
										Class376_Sub1_Sub1 class376_sub1_sub1 = (aClass376_Sub1_Sub1ArrayArray957[i_53_][i_54_]);
										int i_55_ = (((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8696);
										byte i_56_ = (byte) (i_55_ >> 16);
										byte i_57_ = (byte) (i_55_ >> 8);
										byte i_58_ = (byte) i_55_;
										byte i_59_ = (byte) (i_55_ >>> 24);
										float f_60_ = (float) ((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8689) >> 12);
										float f_61_ = (float) ((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8691) >> 12);
										float f_62_ = (float) ((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8684) >> 12);
										int i_63_ = (((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8692 >> 12);
										stream.method357(f_60_
												+ ((float) -i_63_ * f_9_));
										stream.method357(f_61_
												+ ((float) -i_63_ * f_10_));
										stream.method357(f_62_
												+ ((float) -i_63_ * f_11_));
										if ((((Class163_Sub2) class163_sub2).anInt7608) == 0)
											stream.method356(i_56_, i_57_,
													i_58_, i_59_);
										else
											stream.method343(i_56_, i_57_,
													i_58_, i_59_);
										stream.method357(0.0F);
										stream.method357(0.0F);
										stream.method357(f_60_
												+ (f_12_ * (float) i_63_));
										stream.method357((float) i_63_ * f_13_
												+ f_61_);
										stream.method357((float) i_63_ * f_14_
												+ f_62_);
										if ((((Class163_Sub2) class163_sub2).anInt7608) != 0)
											stream.method343(i_56_, i_57_,
													i_58_, i_59_);
										else
											stream.method356(i_56_, i_57_,
													i_58_, i_59_);
										stream.method357(1.0F);
										stream.method357(0.0F);
										stream.method357((float) i_63_ * f_9_
												+ f_60_);
										stream.method357(f_61_
												+ ((float) i_63_ * f_10_));
										stream.method357(f_11_ * (float) i_63_
												+ f_62_);
										if ((((Class163_Sub2) class163_sub2).anInt7608) == 0)
											stream.method356(i_56_, i_57_,
													i_58_, i_59_);
										else
											stream.method343(i_56_, i_57_,
													i_58_, i_59_);
										stream.method357(1.0F);
										stream.method357(1.0F);
										stream.method357(f_60_
												+ (f_15_ * (float) i_63_));
										stream.method357((float) i_63_ * f_16_
												+ f_61_);
										stream.method357((float) i_63_ * f_17_
												+ f_62_);
										if (((((Class163_Sub2) class163_sub2).anInt7608) ^ 0xffffffff) == -1)
											stream.method356(i_56_, i_57_,
													i_58_, i_59_);
										else
											stream.method343(i_56_, i_57_,
													i_58_, i_59_);
										stream.method357(0.0F);
										stream.method357(1.0F);
										i_3_++;
									}
								}
							}
						}
					}
					stream.method347();
					if (!anInterface3_971.method9(-17151))
						break;
					class163_sub2.method2996(0, 1, anInterface3_971);
					class163_sub2.method2996(1, 1, anInterface3_972);
					class163_sub2.method3012(aClass219_964, 16);
					class163_sub2.method3063(4 * i_3_, i_3_ * 2,
							Class346.aClass183_4590, -17390, 0,
							anInterface27_959, 0);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ufa.H(" + i + ','
						+ (class163_sub2 != null ? "{...}" : "null") + ','
						+ i_2_ + ')'));
			}
			break;
		} while (false);
	}

	final void method499(Class163_Sub2 class163_sub2, Class116 class116, int i,
			byte i_64_) {
		try {
			anInt954++;
			if (((Class163_Sub2) class163_sub2).aClass33_Sub2_7535 != null) {
				if ((i ^ 0xffffffff) > -1)
					method500(class163_sub2, (byte) 121);
				else
					method496((byte) 122, class163_sub2, i);
				float f = (((Class33_Sub2) ((Class163_Sub2) class163_sub2).aClass33_Sub2_7535).aFloat6666);
				if (i_64_ == -49) {
					float f_65_ = (((Class33_Sub2) ((Class163_Sub2) class163_sub2).aClass33_Sub2_7535).aFloat6655);
					float f_66_ = (((Class33_Sub2) ((Class163_Sub2) class163_sub2).aClass33_Sub2_7535).aFloat6679);
					float f_67_ = (((Class33_Sub2) ((Class163_Sub2) class163_sub2).aClass33_Sub2_7535).aFloat6697);
					try {
						int i_68_ = 0;
						int i_69_ = 2147483647;
						int i_70_ = 0;
						Class376_Sub1 class376_sub1 = (((Class246) ((Class116) class116).aClass246_1584).aClass376_Sub1_3329);
						for (Class376_Sub1 class376_sub1_71_ = (((Class376_Sub1) class376_sub1).aClass376_Sub1_5095); class376_sub1_71_ != class376_sub1; class376_sub1_71_ = (((Class376_Sub1) class376_sub1_71_).aClass376_Sub1_5095)) {
							Class376_Sub1_Sub1 class376_sub1_sub1 = (Class376_Sub1_Sub1) class376_sub1_71_;
							int i_72_ = (int) (f_67_ + ((f_66_ * (float) ((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8684) >> 12)) + ((f * (float) ((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8689) >> 12)) + (f_65_ * (float) ((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8691) >> 12)))));
							if ((i_70_ ^ 0xffffffff) > (i_72_ ^ 0xffffffff))
								i_70_ = i_72_;
							anIntArray973[i_68_++] = i_72_;
							if (i_69_ > i_72_)
								i_69_ = i_72_;
						}
						int i_73_ = i_70_ + -i_69_;
						int i_74_;
						if ((2 + i_73_ ^ 0xffffffff) >= -1601) {
							i_74_ = 0;
							i_73_ += 2;
						} else {
							i_74_ = (Class163_Sub2_Sub1.method3406((byte) 97,
									i_73_) + (1 + -Class11_Sub23_Sub2.anInt9510));
							i_73_ = 2 + (i_73_ >> i_74_);
						}
						i_68_ = 0;
						Class376_Sub1 class376_sub1_75_ = (((Class376_Sub1) class376_sub1).aClass376_Sub1_5095);
						int i_76_ = -2;
						boolean bool = true;
						boolean bool_77_ = true;
						while (class376_sub1 != class376_sub1_75_) {
							anInt963 = 0;
							for (int i_78_ = 0; i_78_ < i_73_; i_78_++)
								anIntArray970[i_78_] = 0;
							for (int i_79_ = 0; (i_79_ ^ 0xffffffff) > -65; i_79_++)
								anIntArray966[i_79_] = 0;
							for (/**/; class376_sub1 != class376_sub1_75_; class376_sub1_75_ = (((Class376_Sub1) class376_sub1_75_).aClass376_Sub1_5095)) {
								Class376_Sub1_Sub1 class376_sub1_sub1 = (Class376_Sub1_Sub1) class376_sub1_75_;
								if (bool_77_) {
									bool = ((Class376_Sub1_Sub1) class376_sub1_sub1).aBool8686;
									i_76_ = ((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8694;
									bool_77_ = false;
								}
								if ((i_68_ ^ 0xffffffff) < -1
										&& ((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8694 ^ 0xffffffff) != (i_76_ ^ 0xffffffff) || (((Class376_Sub1_Sub1) class376_sub1_sub1).aBool8686 != bool))) {
									bool_77_ = true;
									break;
								}
								int i_80_ = anIntArray973[i_68_++] + -i_69_ >> i_74_;
								if ((i_80_ ^ 0xffffffff) > -1601) {
									if ((anIntArray970[i_80_] ^ 0xffffffff) > -65)
										aClass376_Sub1_Sub1ArrayArray961[i_80_][anIntArray970[i_80_]++] = class376_sub1_sub1;
									else {
										if ((anIntArray970[i_80_] ^ 0xffffffff) == -65) {
											if ((anInt963 ^ 0xffffffff) == -65)
												continue;
											anIntArray970[i_80_] += 1 + anInt963++;
										}
										aClass376_Sub1_Sub1ArrayArray957[-1
												+ (anIntArray970[i_80_] - 64)][anIntArray966[anIntArray970[i_80_] - 65]++] = class376_sub1_sub1;
									}
								}
							}
							class163_sub2.method2998(false, i_76_ >= 0 ? i_76_
									: -1, 32242, false);
							if (bool
									&& (Class258.aFloat3528 != (((Class163_Sub2) class163_sub2).aFloat7606)))
								class163_sub2.xa(Class258.aFloat3528);
							else if (((Class163_Sub2) class163_sub2).aFloat7606 != 1.0F)
								class163_sub2.xa(1.0F);
							method498(i_73_, class163_sub2, (byte) -68);
						}
					} catch (Exception exception) {
						/* empty */
					}
					method502(class163_sub2, 0);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ufa.B("
					+ (class163_sub2 != null ? "{...}" : "null") + ','
					+ (class116 != null ? "{...}" : "null") + ',' + i + ','
					+ i_64_ + ')'));
		}
	}

	private final void method500(Class163_Sub2 class163_sub2, byte i) {
		try {
			anInt967++;
			Class258.aFloat3528 = ((Class163_Sub2) class163_sub2).aFloat7606;
			if (i < 90)
				anInt976 = 60;
			class163_sub2.method2997(false);
			class163_sub2.method3015(0, false);
			class163_sub2.method3039(false, (byte) -32);
			class163_sub2.method3090((byte) 100);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ufa.A("
					+ (class163_sub2 != null ? "{...}" : "null") + ',' + i
					+ ')');
		}
	}

	final void method501(int i) {
		try {
			anInt956++;
			if (i <= 109)
				method496((byte) 96, null, -104);
			anInterface3_971.method8(5342);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ufa.F(" + i + ')');
		}
	}

	private final void method502(Class163_Sub2 class163_sub2, int i) {
		do {
			try {
				anInt969++;
				class163_sub2.method3039(true, (byte) -100);
				class163_sub2.method3015(i + i, true);
				if (Class258.aFloat3528 == ((Class163_Sub2) class163_sub2).aFloat7606)
					break;
				class163_sub2.xa(Class258.aFloat3528);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("ufa.E(" + (class163_sub2 != null ? "{...}" : "null")
								+ ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void method503(byte i, Class163_Sub2 class163_sub2) {
		try {
			anInt958++;
			if (i >= 84)
				anInterface3_971.method10(22, 24, 786336);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ufa.D(" + i + ','
					+ (class163_sub2 != null ? "{...}" : "null") + ')'));
		}
	}

	Class68(Class163_Sub2 class163_sub2) {
		aClass376_Sub1_Sub1ArrayArray957 = new Class376_Sub1_Sub1[64][768];
		anInt963 = 0;
		anIntArray966 = new int[64];
		anIntArray973 = new int[8191];
		anIntArray970 = new int[1600];
		do {
			try {
				aClass219_964 = (class163_sub2.method3018((new Class315[] {
						new Class315(new Class27[] { Class27.aClass27_345,
								Class27.aClass27_352, Class27.aClass27_354 }),
						new Class315(Class27.aClass27_351) }), (byte) 108));
				anInterface3_971 = class163_sub2.method3005(true, 30519);
				anInterface3_972 = class163_sub2.method3005(false, 30519);
				anInterface3_972.method10(-124, 12, 393168);
				anInterface27_959 = class163_sub2.method3016((byte) 92, false);
				anInterface27_959.method17(49146, (byte) 69);
				Buffer buffer = anInterface27_959.method12(27599, true);
				if (buffer != null) {
					jaclib.memory.Stream stream = class163_sub2.method3098(
							buffer, true);
					if (!jaclib.memory.Stream.method353()) {
						for (int i = 0; (i ^ 0xffffffff) > -8192; i++) {
							int i_81_ = i * 4;
							stream.method346(i_81_);
							stream.method346(i_81_ + 1);
							stream.method346(2 + i_81_);
							stream.method346(2 + i_81_);
							stream.method346(i_81_ + 3);
							stream.method346(i_81_);
						}
					} else {
						for (int i = 0; i < 8191; i++) {
							int i_82_ = i * 4;
							stream.method345(i_82_);
							stream.method345(i_82_ + 1);
							stream.method345(i_82_ + 2);
							stream.method345(i_82_ + 2);
							stream.method345(3 + i_82_);
							stream.method345(i_82_);
						}
					}
					stream.method347();
					anInterface27_959.method40((byte) 112);
				}
				Buffer buffer_83_ = anInterface3_972.method12(-5419, true);
				if (buffer_83_ == null)
					break;
				jaclib.memory.Stream stream = class163_sub2.method3098(
						buffer_83_, true);
				if (jaclib.memory.Stream.method353()) {
					for (int i = 0; i < 8191; i++) {
						stream.method357(0.0F);
						stream.method357(-1.0F);
						stream.method357(0.0F);
						stream.method357(0.0F);
						stream.method357(-1.0F);
						stream.method357(0.0F);
						stream.method357(0.0F);
						stream.method357(-1.0F);
						stream.method357(0.0F);
						stream.method357(0.0F);
						stream.method357(-1.0F);
						stream.method357(0.0F);
					}
				} else {
					for (int i = 0; i < 8191; i++) {
						stream.method349(0.0F);
						stream.method349(-1.0F);
						stream.method349(0.0F);
						stream.method349(0.0F);
						stream.method349(-1.0F);
						stream.method349(0.0F);
						stream.method349(0.0F);
						stream.method349(-1.0F);
						stream.method349(0.0F);
						stream.method349(0.0F);
						stream.method349(-1.0F);
						stream.method349(0.0F);
					}
				}
				stream.method347();
				anInterface3_972.method9(-17151);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ufa.<init>("
						+ (class163_sub2 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static {
		ACTION_BUTTON1 = new OutgoingPacket(11, 8);
	}
}
