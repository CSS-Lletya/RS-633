/* Class107 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

abstract class Class107 {
	private Class292 aClass292_1435;
	static int anInt1436;
	static int anInt1437;
	static int anInt1438;
	static int anInt1439;
	static Class9 aClass9_1440 = new Class9(1, 2);
	static int anInt1441;
	static int anInt1442;
	private Class163 aClass163_1443;
	static int anInt1444;
	static int anInt1445;
	static int anInt1446;
	static int anInt1447;
	static int anInt1448;
	static int anInt1449;
	static int anInt1450;
	static int anInt1451;
	static int anInt1452;
	static int anInt1453;
	static boolean aBool1454 = false;

	abstract void method703(char c, int i, int i_0_, int i_1_, boolean bool,
			Class72 class72, int i_2_, int i_3_);

	private final void method704(int i, byte i_4_, int i_5_) {
		try {
			Class278.anInt3764 = Class42.anInt695 = i;
			Class376_Sub3.anInt6116 = -1;
			Class236_Sub1.anInt6086 = -1;
			if (i_4_ >= -87)
				aBool1454 = false;
			Class374.anInt4888 = 0;
			anInt1438++;
			Class318.anInt4226 = 0;
			if ((i_5_ ^ 0xffffffff) == 0)
				i_5_ = 0;
			Class11_Sub2_Sub21.anInt9198 = Class11_Sub2_Sub33.anInt9678 = i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("da.T(" + i + ','
					+ i_4_ + ',' + i_5_ + ')'));
		}
	}

	final void method705(int i, int i_6_, int i_7_, int i_8_, int i_9_,
			int i_10_, String string) {
		try {
			anInt1442++;
			if (string != null) {
				method704(i_8_, (byte) -100, i);
				int i_11_ = string.length();
				if (i_9_ < 111)
					method719(false, -89, null, null, null, null, -114, null);
				int[] is = new int[i_11_];
				int[] is_12_ = new int[i_11_];
				for (int i_13_ = 0; i_11_ > i_13_; i_13_++) {
					is[i_13_] = (int) (Math.sin((double) i_13_ / 5.0
							+ (double) i_7_ / 5.0) * 5.0);
					is_12_[i_13_] = (int) (5.0 * Math.sin((double) i_7_ / 5.0
							+ (double) i_13_ / 3.0));
				}
				method719(
						true,
						i_6_
								+ -(aClass292_1435
										.method1805(string, (byte) -5) / 2),
						is, string, null, is_12_, i_10_, null);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("da.F(" + i + ','
					+ i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_
					+ ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method706(String string, int i) {
		do {
			try {
				try {
					if (string.startsWith("col="))
						Class278.anInt3764 = (Class278.anInt3764 & ~0xffffff | 0xffffff & (Class376_Sub7_Sub1
								.method3444(string.substring(4), -6671, 16)));
					else if (string.equals("/col"))
						Class278.anInt3764 = (Class278.anInt3764 & ~0xffffff | 0xffffff & Class42.anInt695);
					if (string.startsWith("argb="))
						Class278.anInt3764 = Class376_Sub7_Sub1.method3444(
								string.substring(5), -6671, 16);
					else if (!string.equals("/argb")) {
						if (!string.startsWith("str=")) {
							if (!string.equals("str")) {
								if (!string.equals("/str")) {
									if (!string.startsWith("u=")) {
										if (!string.equals("u")) {
											if (!string.equals("/u")) {
												if (!string
														.equalsIgnoreCase("shad=-1")) {
													if (!string
															.startsWith("shad=")) {
														if (string
																.equals("shad"))
															Class11_Sub2_Sub21.anInt9198 = (~0xffffff & (Class278.anInt3764));
														else if (string
																.equals("/shad"))
															Class11_Sub2_Sub21.anInt9198 = (Class11_Sub2_Sub33.anInt9678);
														else if (string
																.equals("br"))
															method704(
																	(Class42.anInt695),
																	(byte) -121,
																	(Class11_Sub2_Sub33.anInt9678));
													} else
														Class11_Sub2_Sub21.anInt9198 = ((~0xffffff & (Class278.anInt3764)) | (Class376_Sub7_Sub1
																.method3444(
																		(string.substring(5)),
																		-6671,
																		16)));
												} else
													Class11_Sub2_Sub21.anInt9198 = 0;
											} else
												Class376_Sub3.anInt6116 = -1;
										} else
											Class376_Sub3.anInt6116 = (~0xffffff & Class278.anInt3764);
									} else
										Class376_Sub3.anInt6116 = (~0xffffff
												& Class278.anInt3764 | (Class376_Sub7_Sub1
												.method3444(
														string.substring(2),
														-6671, 16)));
								} else
									Class236_Sub1.anInt6086 = -1;
							} else
								Class236_Sub1.anInt6086 = (0x800000 | ~0xffffff
										& Class278.anInt3764);
						} else
							Class236_Sub1.anInt6086 = (Class278.anInt3764
									& ~0xffffff | (Class376_Sub7_Sub1
									.method3444(string.substring(4), -6671, 16)));
					} else
						Class278.anInt3764 = Class42.anInt695;
				} catch (Exception exception) {
					/* empty */
				}
				anInt1453++;
				if (i == 1937763080)
					break;
				method720(56, -25, 68, null, 111, -35, null, 37, -115, 8, 96,
						112, 0, null, null, (byte) 8);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("da.R("
						+ (string != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	abstract void fa(char c, int i, int i_14_, int i_15_, boolean bool);

	private final void method707(int i, String string, int i_16_) {
		do {
			try {
				anInt1449++;
				if (i != -20971)
					method714(-127, -90, -123, null, -114, 44, -9);
				int i_17_ = 0;
				boolean bool = false;
				for (int i_18_ = 0; string.length() > i_18_; i_18_++) {
					int i_19_ = string.charAt(i_18_);
					if (i_19_ != 60) {
						if ((i_19_ ^ 0xffffffff) != -63) {
							if (!bool && i_19_ == 32)
								i_17_++;
						} else
							bool = false;
					} else
						bool = true;
				}
				if (i_17_ <= 0)
					break;
				Class374.anInt4888 = (i_16_
						- aClass292_1435.method1805(string, (byte) -67) << 8)
						/ i_17_;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("da.I(" + i + ','
								+ (string != null ? "{...}" : "null") + ','
								+ i_16_ + ')'));
			}
			break;
		} while (false);
	}

	final void method708(int i, int i_20_, int i_21_, int i_22_, String string,
			int i_23_) {
		try {
			anInt1445++;
			if (string != null) {
				method704(i_21_, (byte) -118, i_23_);
				if (i_20_ == 173)
					method713(string, null, null, 0, i, 0, 64, i_22_, null);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("da.V(" + i + ','
					+ i_20_ + ',' + i_21_ + ',' + i_22_ + ','
					+ (string != null ? "{...}" : "null") + ',' + i_23_ + ')'));
		}
	}

	final void method709(int i, int i_24_, int i_25_, boolean bool, int i_26_,
			String string) {
		try {
			anInt1437++;
			if (string != null && bool == false) {
				method704(i_26_, (byte) -101, i_25_);
				method713(
						string,
						null,
						null,
						0,
						(i_24_ - aClass292_1435.method1805(string, (byte) -6) / 2),
						0, 107, i, null);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("da.K(" + i + ','
					+ i_24_ + ',' + i_25_ + ',' + bool + ',' + i_26_ + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	final int method710(int i, int i_27_, Class253[] class253s, int i_28_,
			int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_,
			int i_35_, int i_36_, int[] is, int i_37_, String string,
			int i_38_, Class72 class72) {
		try {
			int i_39_ = -97 % ((i_27_ - 65) / 41);
			anInt1446++;
			if (string == null)
				return 0;
			method704(i_37_, (byte) -124, i_33_);
			if (i_28_ == 0)
				i_28_ = ((Class292) aClass292_1435).anInt3947;
			int[] is_40_;
			if (i_36_ < (((Class292) aClass292_1435).anInt3959
					+ ((Class292) aClass292_1435).anInt3951 + i_28_)
					&& i_28_ + i_28_ > i_36_)
				is_40_ = null;
			else
				is_40_ = new int[] { i_32_ };
			int i_41_ = aClass292_1435.method1806(string,
					Class33_Sub1.aStringArray6176, is_40_, 60, class253s);
			if ((i ^ 0xffffffff) == 0) {
				i = i_36_ / i_28_;
				if ((i ^ 0xffffffff) >= -1)
					i = 1;
			}
			if (i > 0 && i_41_ >= i) {
				Class33_Sub1.aStringArray6176[i - 1] = aClass292_1435
						.method1812(-103,
								(Class33_Sub1.aStringArray6176[-1 + i]), i_32_,
								class253s);
				i_41_ = i;
			}
			if (i_34_ == 3 && i_41_ == 1)
				i_34_ = 1;
			int i_42_;
			if (i_34_ != 0) {
				if (i_34_ == 1)
					i_42_ = (((Class292) aClass292_1435).anInt3951 + (i_35_ + (-((Class292) aClass292_1435).anInt3959
							+ i_36_ + (-((Class292) aClass292_1435).anInt3951 - i_28_
							* (-1 + i_41_))) / 2));
				else if (i_34_ != 2) {
					int i_43_ = (-((Class292) aClass292_1435).anInt3951 + i_36_ + (-((Class292) aClass292_1435).anInt3959 + -(i_28_ * (-1 + i_41_))))
							/ (1 + i_41_);
					if ((i_43_ ^ 0xffffffff) > -1)
						i_43_ = 0;
					i_28_ += i_43_;
					i_42_ = (i_35_ - -((Class292) aClass292_1435).anInt3951 - -i_43_);
				} else
					i_42_ = (i_35_ + i_36_ + (-((Class292) aClass292_1435).anInt3959 - (-1 + i_41_)
							* i_28_));
			} else
				i_42_ = ((Class292) aClass292_1435).anInt3951 + i_35_;
			for (int i_44_ = 0; i_41_ > i_44_; i_44_++) {
				if ((i_30_ ^ 0xffffffff) != -1) {
					if (i_30_ == 1)
						method713(Class33_Sub1.aStringArray6176[i_44_],
								class72, class253s, i_31_,
								(i_38_ + (-(aClass292_1435.method1805(
										Class33_Sub1.aStringArray6176[i_44_],
										(byte) -64)) + i_32_) / 2), i_29_, 61,
								i_42_, is);
					else if (i_30_ == 2)
						method713(Class33_Sub1.aStringArray6176[i_44_],
								class72, class253s, i_31_,
								(i_32_ + i_38_ - (aClass292_1435.method1805(
										Class33_Sub1.aStringArray6176[i_44_],
										(byte) -61))), i_29_, 93, i_42_, is);
					else if (i_44_ == i_41_ - 1)
						method713(Class33_Sub1.aStringArray6176[i_44_],
								class72, class253s, i_31_, i_38_, i_29_, 64,
								i_42_, is);
					else {
						method707(-20971, Class33_Sub1.aStringArray6176[i_44_],
								i_32_);
						method713(Class33_Sub1.aStringArray6176[i_44_],
								class72, class253s, i_31_, i_38_, i_29_, 51,
								i_42_, is);
						Class374.anInt4888 = 0;
					}
				} else
					method713(Class33_Sub1.aStringArray6176[i_44_], class72,
							class253s, i_31_, i_38_, i_29_, 67, i_42_, is);
				i_42_ += i_28_;
			}
			return i_41_;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("da.W(" + i + ',' + i_27_
							+ ',' + (class253s != null ? "{...}" : "null")
							+ ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ','
							+ i_31_ + ',' + i_32_ + ',' + i_33_ + ',' + i_34_
							+ ',' + i_35_ + ',' + i_36_ + ','
							+ (is != null ? "{...}" : "null") + ',' + i_37_
							+ ',' + (string != null ? "{...}" : "null") + ','
							+ i_38_ + ','
							+ (class72 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method711(int i) {
		try {
			if (i != 15578)
				aBool1454 = false;
			aClass9_1440 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "da.O(" + i + ')');
		}
	}

	final int method712(int i, Random random, int i_45_, String string,
			int i_46_, int i_47_, int i_48_, byte i_49_, int[] is,
			Class253[] class253s) {
		try {
			anInt1452++;
			if (string == null)
				return 0;
			random.setSeed((long) i);
			int i_50_ = 192 + (random.nextInt() & 0x1f);
			int i_51_ = 125 / ((i_49_ - 42) / 57);
			method704(0xffffff & i_48_ | i_50_ << 24, (byte) -94, 0xffffff
					& i_47_ | i_50_ << 24);
			int i_52_ = string.length();
			int[] is_53_ = new int[i_52_];
			int i_54_ = 0;
			for (int i_55_ = 0; (i_55_ ^ 0xffffffff) > (i_52_ ^ 0xffffffff); i_55_++) {
				is_53_[i_55_] = i_54_;
				if ((0x3 & random.nextInt()) == 0)
					i_54_++;
			}
			method719(true, i_45_, is_53_, string, class253s, null, i_46_, is);
			return i_54_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("da.H(" + i + ','
					+ (random != null ? "{...}" : "null") + ',' + i_45_ + ','
					+ (string != null ? "{...}" : "null") + ',' + i_46_ + ','
					+ i_47_ + ',' + i_48_ + ',' + i_49_ + ','
					+ (is != null ? "{...}" : "null") + ','
					+ (class253s != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method713(String string, Class72 class72,
			Class253[] class253s, int i, int i_56_, int i_57_, int i_58_,
			int i_59_, int[] is) {
		try {
			i_59_ -= ((Class292) aClass292_1435).anInt3947;
			anInt1441++;
			int i_60_ = -1;
			int i_61_ = -1;
			int i_62_ = string.length();
			int i_63_ = 0;
			if (i_58_ <= 33)
				method705(-71, -34, -51, 29, -39, -108, null);
			for (/**/; i_63_ < i_62_; i_63_++) {
				char c = (char) (0xff & Class355.method2125(
						string.charAt(i_63_), -8910));
				if ((c ^ 0xffffffff) == -61)
					i_60_ = i_63_;
				else {
					if (c == 62 && i_60_ != -1) {
						String string_64_ = string.substring(1 + i_60_, i_63_);
						i_60_ = -1;
						if (string_64_.equals("lt"))
							c = '<';
						else if (!string_64_.equals("gt")) {
							if (string_64_.equals("nbsp"))
								c = '\u00a0';
							else if (!string_64_.equals("shy")) {
								if (string_64_.equals("times"))
									c = '\u00d7';
								else if (!string_64_.equals("euro")) {
									if (!string_64_.equals("copy")) {
										if (!string_64_.equals("reg")) {
											if (!string_64_.startsWith("img="))
												method706(string_64_,
														1937763080);
											else {
												try {
													int i_65_ = (Class173
															.method1139(
																	string_64_
																			.substring(4),
																	-23213));
													Class253 class253 = class253s[i_65_];
													int i_66_ = (is != null ? is[i_65_]
															: (class253
																	.method1622()));
													if (((~0xffffff & Class278.anInt3764) ^ 0xffffffff) == 16777215)
														class253.method1624(
																i_56_,
																(-i_66_ + i_59_ - -(((Class292) aClass292_1435).anInt3947)),
																1, 0, 1);
													else
														class253.method1624(
																i_56_,
																(-i_66_ + ((((Class292) aClass292_1435).anInt3947) + i_59_)),
																0,
																(0xffffff | ((Class278.anInt3764) & ~0xffffff)),
																1);
													i_56_ += class253s[i_65_]
															.method1608();
													i_61_ = -1;
												} catch (Exception exception) {
													/* empty */
												}
											}
											continue;
										}
										c = '\u00ae';
									} else
										c = '\u00a9';
								} else
									c = '\u20ac';
							} else
								c = '\u00ad';
						} else
							c = '>';
					}
					if ((i_60_ ^ 0xffffffff) == 0) {
						if (i_61_ != -1)
							i_56_ += aClass292_1435.method1808(i_61_, false, c);
						if (c != 32) {
							if (class72 == null) {
								if ((~0xffffff & Class11_Sub2_Sub21.anInt9198) != 0)
									fa(c, i_56_ + 1, 1 + i_59_,
											Class11_Sub2_Sub21.anInt9198, true);
								fa(c, i_56_, i_59_, Class278.anInt3764, false);
							} else {
								if ((~0xffffff & Class11_Sub2_Sub21.anInt9198 ^ 0xffffffff) != -1)
									method703(c, 1 + i_56_, 1 + i_59_,
											Class11_Sub2_Sub21.anInt9198, true,
											class72, i, i_57_);
								method703(c, i_56_, i_59_, Class278.anInt3764,
										false, class72, i, i_57_);
							}
						} else if ((Class374.anInt4888 ^ 0xffffffff) < -1) {
							Class318.anInt4226 += Class374.anInt4888;
							i_56_ += Class318.anInt4226 >> 8;
							Class318.anInt4226 &= 0xff;
						}
						int i_67_ = aClass292_1435.method1810(c, 7125);
						if ((Class236_Sub1.anInt6086 ^ 0xffffffff) != 0)
							aClass163_1443
									.method1059(
											i_56_,
											i_59_
													- -(int) ((double) (((Class292) aClass292_1435).anInt3947) * 0.7),
											8985, i_67_,
											Class236_Sub1.anInt6086);
						if ((Class376_Sub3.anInt6116 ^ 0xffffffff) != 0)
							aClass163_1443
									.method1059(
											i_56_,
											1 + (i_59_ + (((Class292) aClass292_1435).anInt3947)),
											8985, i_67_,
											Class376_Sub3.anInt6116);
						i_56_ += i_67_;
						i_61_ = c;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("da.Q("
					+ (string != null ? "{...}" : "null") + ','
					+ (class72 != null ? "{...}" : "null") + ','
					+ (class253s != null ? "{...}" : "null") + ',' + i + ','
					+ i_56_ + ',' + i_57_ + ',' + i_58_ + ',' + i_59_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method714(int i, int i_68_, int i_69_, String string, int i_70_,
			int i_71_, int i_72_) {
		try {
			if (i_71_ != 20066)
				method704(12, (byte) 58, -75);
			anInt1444++;
			if (string != null) {
				method704(i, (byte) -107, i_69_);
				int i_73_ = string.length();
				int[] is = new int[i_73_];
				for (int i_74_ = 0; i_74_ < i_73_; i_74_++)
					is[i_74_] = (int) (5.0 * Math.sin((double) i_72_ / 5.0
							+ (double) i_74_ / 2.0));
				method719(
						true,
						i_68_
								+ -(aClass292_1435.method1805(string,
										(byte) -70) / 2), null, string, null,
						is, i_70_, null);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("da.G(" + i + ','
					+ i_68_ + ',' + i_69_ + ','
					+ (string != null ? "{...}" : "null") + ',' + i_70_ + ','
					+ i_71_ + ',' + i_72_ + ')'));
		}
	}

	final int method715(int i, String string, int i_75_, int i_76_, int[] is,
			int i_77_, int[] is_78_, int i_79_, Class253[] class253s,
			int i_80_, Random random, int i_81_, int i_82_, int i_83_, int i_84_) {
		try {
			anInt1439++;
			if (string == null)
				return 0;
			random.setSeed((long) i_82_);
			int i_85_ = (random.nextInt() & 0x1f) + 192;
			method704(i_80_ & 0xffffff | i_85_ << 24, (byte) -120, i_85_ << 24
					| 0xffffff & i_75_);
			int i_86_ = string.length();
			int[] is_87_ = new int[i_86_];
			int i_88_ = 0;
			for (int i_89_ = i_81_; (i_89_ ^ 0xffffffff) > (i_86_ ^ 0xffffffff); i_89_++) {
				is_87_[i_89_] = i_88_;
				if ((0x3 & random.nextInt() ^ 0xffffffff) == -1)
					i_88_++;
			}
			int i_90_ = i_77_;
			int i_91_ = ((Class292) aClass292_1435).anInt3951 + i_83_;
			int i_92_ = -1;
			if (i_84_ == 1)
				i_91_ += ((-((Class292) aClass292_1435).anInt3959 + (i_76_ + -((Class292) aClass292_1435).anInt3951)) / 2);
			else if ((i_84_ ^ 0xffffffff) == -3)
				i_91_ = i_76_ + (i_83_ - ((Class292) aClass292_1435).anInt3959);
			if (i_79_ == 1) {
				i_92_ = aClass292_1435.method1805(string, (byte) -84) + i_88_;
				i_90_ += (-i_92_ + i) / 2;
			} else if ((i_79_ ^ 0xffffffff) == -3) {
				i_92_ = aClass292_1435.method1805(string, (byte) -24) + i_88_;
				i_90_ += -i_92_ + i;
			}
			method719(true, i_90_, is_87_, string, class253s, null, i_91_,
					is_78_);
			if (is != null) {
				if ((i_92_ ^ 0xffffffff) == 0)
					i_92_ = (aClass292_1435.method1805(string, (byte) -36) + i_88_);
				is[3] = (((Class292) aClass292_1435).anInt3951 - -((Class292) aClass292_1435).anInt3959);
				is[0] = i_90_;
				is[1] = i_91_ + -((Class292) aClass292_1435).anInt3951;
				is[2] = i_92_;
			}
			return i_88_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("da.N(" + i + ',' + (string != null ? "{...}" : "null")
							+ ',' + i_75_ + ',' + i_76_ + ','
							+ (is != null ? "{...}" : "null") + ',' + i_77_
							+ ',' + (is_78_ != null ? "{...}" : "null") + ','
							+ i_79_ + ','
							+ (class253s != null ? "{...}" : "null") + ','
							+ i_80_ + ',' + (random != null ? "{...}" : "null")
							+ ',' + i_81_ + ',' + i_82_ + ',' + i_83_ + ','
							+ i_84_ + ')'));
		}
	}

	final void method716(byte i, int i_93_, int i_94_, String string,
			int i_95_, int i_96_) {
		try {
			anInt1447++;
			if (i < -79 && string != null) {
				method704(i_95_, (byte) -93, i_93_);
				method713(
						string,
						null,
						null,
						0,
						(-aClass292_1435.method1805(string, (byte) -7) + i_94_),
						0, 80, i_96_, null);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("da.M(" + i + ','
					+ i_93_ + ',' + i_94_ + ','
					+ (string != null ? "{...}" : "null") + ',' + i_95_ + ','
					+ i_96_ + ')'));
		}
	}

	final void method717(int i, int i_97_, int i_98_, int i_99_, int i_100_,
			String string, int i_101_, int i_102_) {
		try {
			anInt1451++;
			if (string != null) {
				method704(i_98_, (byte) -105, i);
				double d = 7.0 - (double) i_101_ / 8.0;
				if (d < 0.0)
					d = 0.0;
				int i_103_ = string.length();
				int[] is = new int[i_103_];
				for (int i_104_ = 0; (i_104_ ^ 0xffffffff) > (i_103_ ^ 0xffffffff); i_104_++)
					is[i_104_] = (int) (Math.sin((double) i_104_ / 1.5
							+ (double) i_100_) * d);
				method719(
						true,
						i_99_
								+ -(aClass292_1435.method1805(string,
										(byte) -53) / i_102_), null, string,
						null, is, i_97_, null);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("da.P(" + i + ','
					+ i_97_ + ',' + i_98_ + ',' + i_99_ + ',' + i_100_ + ','
					+ (string != null ? "{...}" : "null") + ',' + i_101_ + ','
					+ i_102_ + ')'));
		}
	}

	final void method718(int i, int i_105_, int i_106_, int i_107_,
			Class253[] class253s, String string, int[] is, int i_108_) {
		try {
			anInt1448++;
			if (i_106_ <= 96)
				aClass163_1443 = null;
			if (string != null) {
				method704(i_105_, (byte) -116, i);
				method713(string, null, class253s, 0, i_107_, 0, 36, i_108_, is);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("da.U(" + i + ','
					+ i_105_ + ',' + i_106_ + ',' + i_107_ + ','
					+ (class253s != null ? "{...}" : "null") + ','
					+ (string != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ',' + i_108_ + ')'));
		}
	}

	Class107(Class163 class163, Class292 class292) {
		try {
			aClass292_1435 = class292;
			aClass163_1443 = class163;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("da.<init>("
					+ (class163 != null ? "{...}" : "null") + ','
					+ (class292 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method719(boolean bool, int i, int[] is, String string,
			Class253[] class253s, int[] is_109_, int i_110_, int[] is_111_) {
		try {
			i_110_ -= ((Class292) aClass292_1435).anInt3947;
			anInt1436++;
			int i_112_ = -1;
			if (bool == true) {
				int i_113_ = -1;
				int i_114_ = 0;
				int i_115_ = string.length();
				int i_116_ = 0;
				for (/**/; (i_116_ ^ 0xffffffff) > (i_115_ ^ 0xffffffff); i_116_++) {
					char c = (char) (Class355.method2125(string.charAt(i_116_),
							-8910) & 0xff);
					if (c == 60)
						i_112_ = i_116_;
					else {
						if (c == 62 && i_112_ != -1) {
							String string_117_ = string.substring(1 + i_112_,
									i_116_);
							i_112_ = -1;
							if (string_117_.equals("lt"))
								c = '<';
							else if (string_117_.equals("gt"))
								c = '>';
							else if (string_117_.equals("nbsp"))
								c = '\u00a0';
							else if (!string_117_.equals("shy")) {
								if (string_117_.equals("times"))
									c = '\u00d7';
								else if (!string_117_.equals("euro")) {
									if (string_117_.equals("copy"))
										c = '\u00a9';
									else {
										if (!string_117_.equals("reg")) {
											if (!string_117_.startsWith("img="))
												method706(string_117_,
														1937763080);
											else {
												try {
													int i_118_;
													if (is == null)
														i_118_ = 0;
													else
														i_118_ = is[i_114_];
													int i_119_;
													if (is_109_ == null)
														i_119_ = 0;
													else
														i_119_ = is_109_[i_114_];
													i_114_++;
													int i_120_ = (Class173
															.method1139(
																	string_117_
																			.substring(4),
																	-23213));
													Class253 class253 = class253s[i_120_];
													int i_121_ = (is_111_ == null ? class253
															.method1622()
															: is_111_[i_120_]);
													class253.method1624(
															i_118_ + i,
															((((Class292) aClass292_1435).anInt3947) + (i_110_
																	- i_121_ - -i_119_)),
															1, 0, 1);
													i_113_ = -1;
													i += class253s[i_120_]
															.method1608();
												} catch (Exception exception) {
													/* empty */
												}
											}
											continue;
										}
										c = '\u00ae';
									}
								} else
									c = '\u20ac';
							} else
								c = '\u00ad';
						}
						if (i_112_ == -1) {
							if (i_113_ != -1)
								i += aClass292_1435
										.method1808(i_113_, false, c);
							int i_122_;
							if (is != null)
								i_122_ = is[i_114_];
							else
								i_122_ = 0;
							int i_123_;
							if (is_109_ == null)
								i_123_ = 0;
							else
								i_123_ = is_109_[i_114_];
							if (c != 32) {
								if ((~0xffffff & Class11_Sub2_Sub21.anInt9198) != 0)
									fa(c, i + 1 + i_122_, 1 + i_110_ + i_123_,
											Class11_Sub2_Sub21.anInt9198, true);
								fa(c, i - -i_122_, i_110_ + i_123_,
										Class278.anInt3764, false);
							} else if ((Class374.anInt4888 ^ 0xffffffff) < -1) {
								Class318.anInt4226 += Class374.anInt4888;
								i += Class318.anInt4226 >> 8;
								Class318.anInt4226 &= 0xff;
							}
							i_114_++;
							int i_124_ = aClass292_1435.method1810(c, 7125);
							if (Class236_Sub1.anInt6086 != -1)
								aClass163_1443
										.method1059(
												i,
												((int) (0.7 * (double) (((Class292) aClass292_1435).anInt3947)) + i_110_),
												8985, i_124_,
												Class236_Sub1.anInt6086);
							if (Class376_Sub3.anInt6116 != -1)
								aClass163_1443
										.method1059(
												i,
												(i_110_ + ((Class292) aClass292_1435).anInt3947),
												8985, i_124_,
												Class376_Sub3.anInt6116);
							i += i_124_;
							i_113_ = c;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("da.J(" + bool + ','
					+ i + ',' + (is != null ? "{...}" : "null") + ','
					+ (string != null ? "{...}" : "null") + ','
					+ (class253s != null ? "{...}" : "null") + ','
					+ (is_109_ != null ? "{...}" : "null") + ',' + i_110_ + ','
					+ (is_111_ != null ? "{...}" : "null") + ')'));
		}
	}

	final int method720(int i, int i_125_, int i_126_, Class253[] class253s,
			int i_127_, int i_128_, Class72 class72, int i_129_, int i_130_,
			int i_131_, int i_132_, int i_133_, int i_134_, int[] is,
			String string, byte i_135_) {
		try {
			if (i_135_ != 100)
				return 71;
			anInt1450++;
			return method710(0, 116, class253s, i_127_, i_125_, i_129_, i_133_,
					i_126_, i_130_, i_132_, i, i_131_, is, i_128_, string,
					i_134_, class72);
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("da.L(" + i + ',' + i_125_
							+ ',' + i_126_ + ','
							+ (class253s != null ? "{...}" : "null") + ','
							+ i_127_ + ',' + i_128_ + ','
							+ (class72 != null ? "{...}" : "null") + ','
							+ i_129_ + ',' + i_130_ + ',' + i_131_ + ','
							+ i_132_ + ',' + i_133_ + ',' + i_134_ + ','
							+ (is != null ? "{...}" : "null") + ','
							+ (string != null ? "{...}" : "null") + ','
							+ i_135_ + ')'));
		}
	}
}
