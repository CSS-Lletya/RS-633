/* Class108_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108_Sub23 extends Class108 {
	static int anInt7758;
	static Class46 aClass46_7759;
	static Class198 aClass198_7760;
	static int anInt7761;
	static short aShort7762 = 320;
	static int anInt7763;
	static int anInt7764;
	static int anInt7765;
	static int anInt7766 = -1;
	static int anInt7767;
	static int anInt7768;
	static int anInt7769;
	static int anInt7770;

	Class108_Sub23(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
	}

	final void method726(boolean bool) {
		try {
			anInt7769++;
			if (bool != false)
				method3127((byte) -90);
			if (((Class11_Sub17) ((Class108) this).aClass11_Sub17_1458).aClass108_Sub28_5696
					.method3183(5)
					&& !Class108_Sub28
							.method3180(
									((Class11_Sub17) (((Class108) this).aClass11_Sub17_1458)).aClass108_Sub28_5696
											.method3181(false), bool))
				((Class108) this).anInt1459 = 0;
			if ((((Class108) this).anInt1459 ^ 0xffffffff) > -1
					|| ((Class108) this).anInt1459 > 1)
				((Class108) this).anInt1459 = method725((byte) 123);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tk.E(" + bool + ')');
		}
	}

	public static void method3125(byte i) {
		try {
			if (i != -126)
				method3129(-53, null, -32, null, (byte) 117, null, null, -84,
						47, -64, false, 34, -16, -42, null, null, false, 19);
			aClass46_7759 = null;
			aClass198_7760 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tk.G(" + i + ')');
		}
	}

	final int method3126(boolean bool) {
		try {
			anInt7767++;
			if (bool != false)
				return 98;
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tk.B(" + bool + ')');
		}
	}

	final boolean method3127(byte i) {
		try {
			anInt7763++;
			if (!Class108_Sub28
					.method3180(
							((Class11_Sub17) (((Class108) this).aClass11_Sub17_1458)).aClass108_Sub28_5696
									.method3181(false), false))
				return false;
			if (i != -53)
				method726(true);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tk.D(" + i + ')');
		}
	}

	final int method725(byte i) {
		try {
			int i_0_ = 47 % ((70 - i) / 51);
			anInt7758++;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tk.A(" + i + ')');
		}
	}

	static final int method3128(String string, int i) {
		try {
			anInt7761++;
			for (int i_1_ = 0; ((Class11_Sub32.aStringArray6878.length ^ 0xffffffff) < (i_1_ ^ 0xffffffff)); i_1_++) {
				if (Class11_Sub32.aStringArray6878[i_1_]
						.equalsIgnoreCase(string))
					return i_1_;
			}
			if (i != 1)
				aShort7762 = (short) -87;
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tk.H("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void method3129(int i, byte[][][] is, int i_2_, int[] is_3_,
			byte i_4_, int[] is_5_, int[] is_6_, int i_7_, int i_8_, int i_9_,
			boolean bool, int i_10_, int i_11_, int i_12_, int[] is_13_,
			int[] is_14_, boolean bool_15_, int i_16_) {
		try {
			anInt7768++;
			if (OutputStream_Sub1.anInt5845 != -1) {
				int[] is_17_ = Class243.aClass163_3308.Y();
				int i_18_ = is_17_[0];
				int i_19_ = is_17_[1];
				int i_20_ = is_17_[2];
				int i_21_ = is_17_[3];
				int i_22_ = i_20_;
				int i_23_ = i_21_;
				if ((OutputStream_Sub1.anInt5845 ^ 0xffffffff) == -2) {
					i_22_ = (int) ((double) Class376_Sub7_Sub3_Sub2.anInt10143
							* (double) i_20_ / (double) Class11_Sub33.anInt6897);
					i_23_ = (int) ((double) i_21_
							* (double) Class376_Sub7_Sub3_Sub2.anInt10143 / (double) Class11_Sub33.anInt6897);
				}
				if (!Class333.aBool4411) {
					if (OutputStream_Sub1.anInt5845 == 1)
						Class376_Sub7_Sub4_Sub2.method3912((byte) -27);
					int i_24_ = -Class142.anInt1924 + i_8_;
					int i_25_ = -Class108_Sub25.anInt7817 + i_7_;
					int i_26_ = i_2_ + -Class11_Sub2_Sub1.anInt8434;
					int i_27_ = (int) ((double) i_22_
							* ((double) i_25_ * Class149.aDouble1997
									+ Class177.aDouble2242 * (double) i_24_ + (double) i_26_
									* Class377.aDouble4912) / (double) i_9_);
					int i_28_ = (int) ((double) i_23_
							* ((Class11_Sub45_Sub8.aDouble8810 * (double) i_24_)
									+ Class105.aDouble1408 * (double) i_25_ + (double) i_26_
									* Class357.aDouble4666) / (double) i_9_);
					double d = ((double) i_26_ * Class108_Sub22.aDouble7317 + ((double) i_24_
							* Class114.aDouble1563 + ((double) i_25_ * Class11_Sub2_Sub24.aDouble9286)));
					int i_29_ = (Class163_Sub2_Sub1.anInt8637 + (i_27_ + -Class11_Sub22.anInt5981));
					int i_30_ = -Class275.anInt3702
							+ (Class264.anInt3604 - -i_28_);
					int i_31_ = i_29_ + Class11_Sub2_Sub16.anInt9038;
					int i_32_ = i_30_ + Class376_Sub7_Sub3_Sub2.anInt10143;
					if ((i_29_ >= 0 && i_30_ >= 0
							&& Class11_Sub39.anInt7215 >= i_31_ && (i_32_ ^ 0xffffffff) >= (Class11_Sub33.anInt6897 ^ 0xffffffff))
							|| OutputStream_Sub1.anInt5845 == 2) {
						Class218.anInt3004 = i_30_;
						Class292.anInt3955 = i_29_;
						if (OutputStream_Sub1.anInt5845 == 2)
							Class91.aDouble1238 = -d;
					} else if (i_31_ <= 0
							|| i_32_ <= 0
							|| ((Class11_Sub39.anInt7215 ^ 0xffffffff) >= (i_29_ ^ 0xffffffff))
							|| i_30_ >= Class11_Sub33.anInt6897)
						Class333.aBool4411 = true;
					else {
						int i_33_ = -Class163_Sub2_Sub1.anInt8637 + i_29_;
						int i_34_ = i_30_ + -Class264.anInt3604;
						int i_35_ = 0;
						int i_36_ = 0;
						int i_37_ = 0;
						int i_38_ = 0;
						double d_39_ = 0.0;
						if ((OutputStream_Sub1.anInt5845 ^ 0xffffffff) != -1) {
							if ((OutputStream_Sub1.anInt5845 ^ 0xffffffff) == -2) {
								i_37_ = i_33_ / Class11_Sub27.anInt6556;
								i_38_ = i_34_ / Class11_Sub24.anInt6238;
								i_36_ = i_38_ * Class11_Sub24.anInt6238;
								i_35_ = i_37_ * Class11_Sub27.anInt6556;
								d_39_ = ((Class91.aDouble1238 + d)
										* (double) (i_34_ * i_36_ + i_33_
												* i_35_) / (double) (i_33_
										* i_33_ + i_34_ * i_34_));
							}
						} else {
							d_39_ = Class91.aDouble1238 + d;
							i_36_ = i_34_;
							i_35_ = i_33_;
						}
						d_39_ = -d_39_;
						int i_40_ = 0;
						int i_41_ = 0;
						int i_42_ = 0;
						int i_43_ = 0;
						int i_44_ = 0;
						int i_45_;
						int i_46_;
						int i_47_;
						int i_48_;
						if (i_35_ >= 0) {
							i_45_ = Class11_Sub39.anInt7215 + -i_35_;
							i_47_ = 0;
							i_46_ = i_45_;
							if (OutputStream_Sub1.anInt5845 == 1) {
								i_44_ = i_37_;
								i_42_ = -i_37_ + Class39.anInt556;
							}
							i_48_ = i_35_;
						} else {
							i_45_ = i_35_ + Class11_Sub39.anInt7215;
							i_46_ = 0;
							i_47_ = -i_35_;
							i_48_ = i_47_;
							if (OutputStream_Sub1.anInt5845 == 1) {
								i_42_ = 0;
								i_44_ = -i_37_;
							}
						}
						int i_49_ = 0;
						int i_50_;
						int i_51_;
						int i_52_;
						int i_53_;
						int i_54_;
						int i_55_;
						if (i_36_ >= 0) {
							i_52_ = -i_36_ + Class11_Sub33.anInt6897;
							i_51_ = 0;
							i_53_ = i_36_;
							i_54_ = 0;
							i_50_ = i_52_;
							i_55_ = i_52_;
							if ((OutputStream_Sub1.anInt5845 ^ 0xffffffff) == -2) {
								i_40_ = -i_38_ + Class11_Sub45_Sub10.anInt8958;
								i_41_ = i_38_;
								i_43_ = 0;
								i_49_ = i_40_;
							}
						} else {
							i_50_ = 0;
							i_51_ = -i_36_;
							i_52_ = i_36_ + Class11_Sub33.anInt6897;
							i_53_ = i_51_;
							i_54_ = i_53_;
							if (OutputStream_Sub1.anInt5845 == 1) {
								i_40_ = 0;
								i_41_ = -i_38_;
								i_43_ = i_41_;
								i_49_ = Class11_Sub45_Sub10.anInt8958 - -i_38_;
							}
							i_55_ = i_52_;
						}
						Class131 class131 = (((Class103) Class142.aClass103_1921).aClass131_1369);
						for (Class376_Sub5 class376_sub5 = ((Class376_Sub5) class131
								.method847(i_10_ ^ ~0x79cd)); class376_sub5 != null; class376_sub5 = (Class376_Sub5) class131
								.method856(56)) {
							Class376_Sub4[] class376_sub4s = (((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916);
							boolean bool_56_ = true;
							for (int i_57_ = 0; class376_sub4s.length > i_57_; i_57_++) {
								Class376_Sub4 class376_sub4 = class376_sub4s[i_57_];
								int i_58_ = (((Class376_Sub4) class376_sub4).anInt6122);
								int i_59_ = (((Class376_Sub4) class376_sub4).anInt6123);
								int i_60_ = (((Class376_Sub4) class376_sub4).anInt6127);
								int i_61_ = (((Class376_Sub4) class376_sub4).anInt6126);
								int i_62_ = (((Class376_Sub4) class376_sub4).anInt6125);
								((Class376_Sub4) class376_sub4).anInt6126 = i_61_ += -i_36_;
								((Class376_Sub4) class376_sub4).anInt6123 = i_59_ = -i_36_
										+ i_59_;
								((Class376_Sub4) class376_sub4).anInt6122 = i_58_ -= i_35_;
								((Class376_Sub4) class376_sub4).anInt6127 = i_60_ = -i_35_
										+ i_60_;
								if (bool_56_) {
									int i_63_ = -i_62_
											+ (i_58_ < i_60_ ? i_58_ : i_60_);
									if (Class11_Sub39.anInt7215 >= i_63_) {
										int i_64_ = (-i_62_ + (((i_59_ ^ 0xffffffff) > (i_61_ ^ 0xffffffff)) ? i_59_
												: i_61_));
										if ((Class11_Sub33.anInt6897 ^ 0xffffffff) <= (i_64_ ^ 0xffffffff)) {
											int i_65_ = (i_62_ + (((i_58_ ^ 0xffffffff) > (i_60_ ^ 0xffffffff)) ? i_60_
													: i_58_));
											if (i_65_ >= 0) {
												int i_66_ = (i_62_ + (i_61_ <= i_59_ ? i_59_
														: i_61_));
												if (i_66_ >= 0)
													bool_56_ = false;
											}
										}
									}
								}
							}
							if (bool_56_) {
								class376_sub5.method2207((byte) -111);
								Class16.method155(0, class376_sub5);
							}
						}
						if ((OutputStream_Sub1.anInt5845 ^ 0xffffffff) == -1)
							Class243.aClass163_3308
									.method1076(Class11_Sub2_Sub32_Sub1.anInterface10_9891);
						Class243.aClass163_3308.F(-i_35_, -i_36_);
						Class243.aClass163_3308.b(i_47_, i_51_, i_45_, i_52_,
								d_39_);
						Class274.method1708(Class91.aDouble1238 + d_39_,
								(byte) 104);
						Class273.aDouble3679 = d_39_ + Class91.aDouble1238;
						if (OutputStream_Sub1.anInt5845 == 1) {
							Class236_Sub8.anInt7053 = -i_36_
									+ (-Class275.anInt3702 + i_19_);
							Class58_Sub1_Sub1.anInt9174 = -i_35_
									+ (-Class11_Sub22.anInt5981 + i_18_);
							Class11_Sub32.anInt6872 = i_23_;
							Class79.anInt1072 = i_22_;
							Class243.aClass163_3308.DA(
									(Class58_Sub1_Sub1.anInt9174),
									Class236_Sub8.anInt7053, Class79.anInt1072,
									(Class11_Sub32.anInt6872));
						} else {
							Class11_Sub32.anInt6872 = i_23_;
							Class58_Sub1_Sub1.anInt9174 = -i_35_
									+ (-Class11_Sub22.anInt5981 + (i_18_ + (Class163_Sub2_Sub1.anInt8637)));
							Class236_Sub8.anInt7053 = (-i_36_
									+ -Class275.anInt3702 + i_19_ + Class264.anInt3604);
							Class79.anInt1072 = i_22_;
							Class243.aClass163_3308.DA(
									(Class58_Sub1_Sub1.anInt9174),
									Class236_Sub8.anInt7053, Class79.anInt1072,
									(Class11_Sub32.anInt6872));
						}
						Class62.method475(Class142.aClass103_1921);
						if ((i_53_ ^ 0xffffffff) < -1) {
							Class243.aClass163_3308.KA(0, i_50_,
									Class11_Sub39.anInt7215, i_53_ + i_50_);
							Class243.aClass163_3308.ya();
							Class243.aClass163_3308.GA(Class52.anInt812);
							Class11_Sub2_Sub5.method3393(i_11_, i_8_, i_7_,
									i_2_, is, is_5_, is_6_, is_3_, is_14_,
									is_13_, i, i_4_, i_16_, i_12_, bool_15_,
									bool, i_9_, 1, false);
						}
						if (i_48_ > 0) {
							Class243.aClass163_3308.KA(i_46_, i_54_, i_46_
									- -i_48_, i_54_ + i_55_);
							Class243.aClass163_3308.ya();
							Class243.aClass163_3308.GA(Class52.anInt812);
							Class11_Sub2_Sub5.method3393(i_11_, i_8_, i_7_,
									i_2_, is, is_5_, is_6_, is_3_, is_14_,
									is_13_, i, i_4_, i_16_, i_12_, bool_15_,
									bool, i_9_, 1, false);
						}
						Class243.aClass163_3308.la();
						Class376.method2205();
						if (OutputStream_Sub1.anInt5845 == 0)
							Class243.aClass163_3308.method1031();
						Class91.aDouble1238 += d_39_;
						Class11_Sub22.anInt5981 += i_35_;
						Class275.anInt3702 += i_36_;
						Class292.anInt3955 = (Class163_Sub2_Sub1.anInt8637 + (i_27_ + -Class11_Sub22.anInt5981));
						Class218.anInt3004 = -Class275.anInt3702
								+ (i_28_ + Class264.anInt3604);
						if ((OutputStream_Sub1.anInt5845 ^ 0xffffffff) == -2) {
							Class275.anInt3696 += i_37_;
							Class128.anInt1727 += i_38_;
							for (int i_67_ = 0; i_67_ < Class11_Sub45_Sub10.anInt8958; i_67_++) {
								int i_68_ = ((InputStream_Sub2.method2812(
										Class128.anInt1727 + i_67_,
										Class11_Sub45_Sub10.anInt8958, false)) * Class39.anInt556);
								for (int i_69_ = 0; ((i_69_ ^ 0xffffffff) > (Class39.anInt556 ^ 0xffffffff)); i_69_++) {
									int i_70_ = (i_68_ - -(InputStream_Sub2
											.method2812(i_69_
													+ Class275.anInt3696,
													Class39.anInt556, false)));
									boolean bool_71_ = ((i_67_ >= i_40_ && ((i_40_
											+ i_41_ ^ 0xffffffff) < (i_67_ ^ 0xffffffff))) || (((i_67_ ^ 0xffffffff) <= (i_43_ ^ 0xffffffff))
											&& i_43_ - -i_49_ > i_67_
											&& i_42_ <= i_69_ && ((i_42_
											+ i_44_ ^ 0xffffffff) < (i_69_ ^ 0xffffffff))));
									Class286.anInterface10Array3872[i_70_]
											.method34(i_69_
													* Class11_Sub27.anInt6556,
													Class11_Sub24.anInt6238
															* i_67_,
													Class11_Sub27.anInt6556,
													Class11_Sub24.anInt6238, 0,
													0, bool_71_, true);
								}
							}
						}
					}
				}
				if (Class333.aBool4411) {
					Class11_Sub22.anInt5981 = 0;
					Class91.aDouble1238 = 0.0;
					Class142.anInt1924 = i_8_;
					Class108_Sub25.anInt7817 = i_7_;
					Class11_Sub2_Sub1.anInt8434 = i_2_;
					Class218.anInt3004 = Class264.anInt3604;
					Class292.anInt3955 = Class163_Sub2_Sub1.anInt8637;
					Class275.anInt3702 = 0;
					if ((OutputStream_Sub1.anInt5845 ^ 0xffffffff) == -1)
						Class243.aClass163_3308
								.method1076(Class11_Sub2_Sub32_Sub1.anInterface10_9891);
					Class243.aClass163_3308.la();
					Class243.aClass163_3308.ya();
					Class243.aClass163_3308.GA(Class52.anInt812);
					Class321.aClass33_4280.method300(Class142.anInt1924,
							Class108_Sub25.anInt7817,
							Class11_Sub2_Sub1.anInt8434, Class141.anInt1903,
							Class11_Sub32.anInt6873,
							Class11_Sub2_Sub39.anInt9813);
					Class243.aClass163_3308.method1080(Class321.aClass33_4280);
					if (OutputStream_Sub1.anInt5845 != 1) {
						Class79.anInt1072 = i_22_;
						Class58_Sub1_Sub1.anInt9174 = Class163_Sub2_Sub1.anInt8637
								+ i_18_;
						Class236_Sub8.anInt7053 = i_19_ - -Class264.anInt3604;
						Class11_Sub32.anInt6872 = i_23_;
						Class243.aClass163_3308.DA(Class58_Sub1_Sub1.anInt9174,
								Class236_Sub8.anInt7053, Class79.anInt1072,
								Class11_Sub32.anInt6872);
					} else {
						Class79.anInt1072 = i_22_;
						Class236_Sub8.anInt7053 = i_19_;
						Class58_Sub1_Sub1.anInt9174 = i_18_;
						Class11_Sub32.anInt6872 = i_23_;
						Class243.aClass163_3308.DA(Class58_Sub1_Sub1.anInt9174,
								Class236_Sub8.anInt7053, Class79.anInt1072,
								Class11_Sub32.anInt6872);
					}
					Class273.aDouble3679 = 0.0;
					Class142.aClass103_1921.method682(-109);
					Class62.method475(Class142.aClass103_1921);
					Class11_Sub2_Sub5.method3393(i_11_, i_8_, i_7_, i_2_, is,
							is_5_, is_6_, is_3_, is_14_, is_13_, i, i_4_,
							i_16_, i_12_, bool_15_, bool, i_9_, 1, false);
					Class376.method2205();
					Class333.aBool4411 = false;
					if ((OutputStream_Sub1.anInt5845 ^ 0xffffffff) == -1)
						Class243.aClass163_3308.method1031();
					if ((OutputStream_Sub1.anInt5845 ^ 0xffffffff) == -2)
						Class254.method1629((byte) 109);
				}
				if ((OutputStream_Sub1.anInt5845 ^ 0xffffffff) == -1)
					Class11_Sub2_Sub32_Sub1.anInterface10_9891.method35(
							Class292.anInt3955, Class218.anInt3004,
							Class11_Sub2_Sub16.anInt9038,
							Class376_Sub7_Sub3_Sub2.anInt10143, 0, 0, true,
							true);
				Class78.anInt1057++;
				Class274.method1708(Class91.aDouble1238, (byte) 116);
				Class11_Sub2_Sub19.aDouble9096 = Class91.aDouble1238;
				if (i_10_ != OutputStream_Sub1.anInt5845
						&& OutputStream_Sub1.anInt5845 != 2) {
					if ((OutputStream_Sub1.anInt5845 ^ 0xffffffff) == -2) {
						Class11_Sub47.anInt7988 = i_23_;
						Class319.anInt4240 = i_19_ - Class275.anInt3702;
						Class256_Sub2.anInt7712 = i_22_;
						Class11_Sub12_Sub3.anInt9214 = i_18_
								+ -Class11_Sub22.anInt5981;
						Class243.aClass163_3308.DA(
								(Class11_Sub12_Sub3.anInt9214),
								Class319.anInt4240, Class256_Sub2.anInt7712,
								Class11_Sub47.anInt7988);
						Class243.aClass163_3308
								.KA(Class292.anInt3955,
										Class218.anInt3004,
										Class292.anInt3955
												+ Class11_Sub2_Sub16.anInt9038,
										(Class376_Sub7_Sub3_Sub2.anInt10143 + Class218.anInt3004));
					}
				} else {
					if ((OutputStream_Sub1.anInt5845 ^ 0xffffffff) == -3) {
						Class243.aClass163_3308.GA(Class52.anInt812);
						Class243.aClass163_3308.ya();
					}
					Class256_Sub2.anInt7712 = i_22_;
					Class319.anInt4240 = (-Class218.anInt3004
							+ -Class275.anInt3702 + (Class264.anInt3604 + i_19_));
					Class11_Sub12_Sub3.anInt9214 = (-Class11_Sub22.anInt5981 + (Class163_Sub2_Sub1.anInt8637
							+ i_18_ + -Class292.anInt3955));
					Class11_Sub47.anInt7988 = i_23_;
					Class243.aClass163_3308.DA(Class11_Sub12_Sub3.anInt9214,
							Class319.anInt4240, Class256_Sub2.anInt7712,
							Class11_Sub47.anInt7988);
				}
				Class11_Sub2_Sub5.method3393(i_11_, i_8_, i_7_, i_2_, is,
						is_5_, is_6_, is_3_, is_14_, is_13_, i, i_4_, i_16_,
						i_12_, bool_15_, bool, i_9_,
						(OutputStream_Sub1.anInt5845 == 2 ? 0 : 2),
						OutputStream_Sub1.anInt5845 == 1);
				Class243.aClass163_3308.la();
				Class243.aClass163_3308.DA(i_18_, i_19_, i_20_, i_21_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tk.I(" + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_2_ + ','
					+ (is_3_ != null ? "{...}" : "null") + ',' + i_4_ + ','
					+ (is_5_ != null ? "{...}" : "null") + ','
					+ (is_6_ != null ? "{...}" : "null") + ',' + i_7_ + ','
					+ i_8_ + ',' + i_9_ + ',' + bool + ',' + i_10_ + ','
					+ i_11_ + ',' + i_12_ + ','
					+ (is_13_ != null ? "{...}" : "null") + ','
					+ (is_14_ != null ? "{...}" : "null") + ',' + bool_15_
					+ ',' + i_16_ + ')'));
		}
	}

	final void method728(int i, int i_72_) {
		do {
			try {
				((Class108) this).anInt1459 = i_72_;
				anInt7764++;
				if (i == 0)
					break;
				method726(true);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "tk.C(" + i + ','
						+ i_72_ + ')');
			}
			break;
		} while (false);
	}

	final int method721(int i, int i_73_) {
		try {
			anInt7770++;
			if (!Class108_Sub28
					.method3180(
							((Class11_Sub17) (((Class108) this).aClass11_Sub17_1458)).aClass108_Sub28_5696
									.method3181(false), false))
				return 3;
			if (i_73_ <= 10)
				method725((byte) -19);
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tk.F(" + i + ','
					+ i_73_ + ')');
		}
	}

	static final void method3130(byte i, Class11_Sub36 class11_sub36,
			int i_74_, int i_75_, int i_76_) {
		try {
			anInt7765++;
			if (i > -78)
				anInt7766 = 37;
			long l = (long) (i_75_ | (i_76_ << 14 | i_74_ << 28));
			Class11_Sub27 class11_sub27 = ((Class11_Sub27) Class106.aClass213_1433
					.method1369((byte) 26, l));
			if (class11_sub27 == null) {
				class11_sub27 = new Class11_Sub27();
				Class106.aClass213_1433
						.method1368(l, class11_sub27, (byte) -26);
				((Class11_Sub27) class11_sub27).aClass84_6554.method589(
						(byte) -13, class11_sub36);
			} else {
				Class249 class249 = (Packet.aClass223_8723.method1430(
						((Class11_Sub36) class11_sub36).anInt7081, false));
				int i_77_ = ((Class249) class249).anInt3390;
				if ((((Class249) class249).anInt3416 ^ 0xffffffff) == -2)
					i_77_ *= 1 + ((Class11_Sub36) class11_sub36).anInt7078;
				for (Class11_Sub36 class11_sub36_78_ = (Class11_Sub36) ((Class11_Sub27) class11_sub27).aClass84_6554
						.method584(-12261); class11_sub36_78_ != null; class11_sub36_78_ = (Class11_Sub36) ((Class11_Sub27) class11_sub27).aClass84_6554
						.method578(-15361)) {
					class249 = (Packet.aClass223_8723.method1430(
							((Class11_Sub36) class11_sub36_78_).anInt7081,
							false));
					int i_79_ = ((Class249) class249).anInt3390;
					if (((Class249) class249).anInt3416 == 1)
						i_79_ *= 1 + (((Class11_Sub36) class11_sub36_78_).anInt7078);
					if (i_77_ > i_79_) {
						Class31.method259((byte) -102, class11_sub36_78_,
								class11_sub36);
						return;
					}
				}
				((Class11_Sub27) class11_sub27).aClass84_6554.method589(
						(byte) -13, class11_sub36);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tk.J(" + i + ','
					+ (class11_sub36 != null ? "{...}" : "null") + ',' + i_74_
					+ ',' + i_75_ + ',' + i_76_ + ')'));
		}
	}

	Class108_Sub23(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}
}
