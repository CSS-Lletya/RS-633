/* Class2_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class2_Sub9 extends Class2 {
	static int anInt7272;
	static int[] anIntArray7273 = new int[5];
	static int anInt7274;
	static int anInt7275;
	static int anInt7276;
	static int[][] anIntArrayArray7277 = { { 12, 12, 12, 12 },
			{ 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 },
			{ 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 },
			{ 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 },
			{ 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };
	static int anInt7278;
	static int anInt7279;
	static int anInt7280;
	static int[] anIntArray7281;
	static int anInt7282;
	static int anInt7283;
	static int anInt7284;
	static int anInt7285;
	static int anInt7286;

	static final void method2943(int i, byte i_0_,
			Player class376_sub7_sub5_sub5_sub1, int i_1_, int i_2_) {
		try {
			anInt7283++;
			int i_3_ = (((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10370[0]);
			int i_4_ = (((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10376[0]);
			if (i_1_ != -8958)
				anIntArray7281 = null;
			if (i_3_ >= 0
					&& (i_3_ ^ 0xffffffff) > (Class300.anInt4051 ^ 0xffffffff)
					&& i_4_ >= 0
					&& (i_4_ ^ 0xffffffff) > (Class108_Sub12.anInt6228 ^ 0xffffffff)
					&& ((i ^ 0xffffffff) <= -1 && i < Class300.anInt4051
							&& (i_2_ ^ 0xffffffff) <= -1 && (i_2_ ^ 0xffffffff) > (Class108_Sub12.anInt6228 ^ 0xffffffff))) {
				int i_5_ = (Class11_Sub45_Sub11
						.method3581(
								class376_sub7_sub5_sub5_sub1
										.method3968((byte) 127),
								i_3_,
								i_4_,
								0,
								-29375,
								0,
								0,
								i_2_,
								i,
								Class212.anIntArray2881,
								0,
								Class295.anIntArray3981,
								(Class235.aClass338Array3217[(((Class376_Sub7) class376_sub7_sub5_sub5_sub1).aByte7047)]),
								-4, true));
				if ((i_5_ ^ 0xffffffff) <= -2 && (i_5_ ^ 0xffffffff) >= -4) {
					for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (-1 + i_5_ ^ 0xffffffff); i_6_++)
						class376_sub7_sub5_sub5_sub1.method3977(
								Class212.anIntArray2881[i_6_], i_0_, -106,
								Class295.anIntArray3981[i_6_]);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mia.O(" + i + ','
					+ i_0_ + ','
					+ (class376_sub7_sub5_sub5_sub1 != null ? "{...}" : "null")
					+ ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	final void method78(int i, int i_7_, int i_8_) {
		try {
			if (i_7_ <= 91)
				method68(false, 13);
			anInt7282++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mia.J(" + i + ','
					+ i_7_ + ',' + i_8_ + ')'));
		}
	}

	final void method68(boolean bool, int i) {
		try {
			if (i >= -64)
				anIntArray7273 = null;
			anInt7285++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mia.G(" + bool + ','
					+ i + ')');
		}
	}

	final void method71(int i, boolean bool) {
		try {
			if (i != 5486)
				anIntArray7281 = null;
			anInt7280++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mia.M(" + i + ','
					+ bool + ')');
		}
	}

	static final void method2944(int i, int i_9_) {
		try {
			if (i >= -57)
				anIntArray7281 = null;
			for (Class11 class11 = Class376_Sub7_Sub2_Sub1.aClass213_10180
					.method1365(24490); class11 != null; class11 = Class376_Sub7_Sub2_Sub1.aClass213_10180
					.method1367((byte) 71)) {
				if ((long) i_9_ == (((Class11) class11).aLong91 >> 48 & 0xffffL))
					class11.method122(-95);
			}
			anInt7284++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mia.A(" + i + ','
					+ i_9_ + ')');
		}
	}

	static final void method2945(int i, String string) {
		do {
			try {
				anInt7274++;
				Class11_Sub2_Sub5.aString8552 = string;
				if (Class108_Sub16.anApplet6538 != null) {
					try {
						String string_10_ = Class108_Sub16.anApplet6538
								.getParameter("cookieprefix");
						String string_11_ = Class108_Sub16.anApplet6538
								.getParameter("cookiehost");
						String string_12_ = (string_10_ + "settings=" + string
								+ "; version=1; path=/; domain=" + string_11_);
						do {
							if ((string.length() ^ 0xffffffff) != -1) {
								string_12_ += ("; Expires="
										+ (Class239
												.method1522(
														(byte) 89,
														(Class137
																.method878((byte) -43) + 94608000000L)))
										+ "; Max-Age=" + 94608000L);
								if (!client.aBool10531)
									break;
							}
							string_12_ += "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
						} while (false);
						Class36.method310(
								("document.cookie=\"" + string_12_ + "\""),
								Class108_Sub16.anApplet6538, 87);
					} catch (Throwable throwable) {
						/* empty */
					}
					if (i == 29167)
						break;
					method2949(-1, -31, (byte) 101);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("mia.C(" + i + ','
						+ (string != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method67(byte i) {
		try {
			anInt7286++;
			int i_13_ = -52 / ((-26 - i) / 56);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mia.E(" + i + ')');
		}
	}

	public static void method2946(byte i) {
		try {
			anIntArray7281 = null;
			anIntArrayArray7277 = null;
			if (i != -82)
				anIntArray7281 = null;
			anIntArray7273 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mia.N(" + i + ')');
		}
	}

	final void method70(Interface15 interface15, int i, int i_14_) {
		try {
			anInt7279++;
			((Class2) this).aClass163_Sub2_13.method3094(interface15, -2);
			if (i_14_ == 3)
				((Class2) this).aClass163_Sub2_13.method3037((byte) 117, i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mia.I("
					+ (interface15 != null ? "{...}" : "null") + ',' + i + ','
					+ i_14_ + ')'));
		}
	}

	static final Class146 method2947(int i, int i_15_, boolean bool, int i_16_) {
		try {
			if (i_15_ != 5)
				return null;
			anInt7278++;
			Class243 class243 = null;
			if (Class77.aClass182_1046 != null)
				class243 = new Class243(i, Class77.aClass182_1046,
						Class206_Sub2.aClass182Array6440[i], 1000000);
			Class11_Sub2_Sub31.aClass19_Sub1Array9644[i] = Class321_Sub4.aClass231_8007
					.method1483(i, i_15_ - 4, Class4.aClass243_24, class243);
			Class11_Sub2_Sub31.aClass19_Sub1Array9644[i].method2472((byte) 68);
			return new Class146(Class11_Sub2_Sub31.aClass19_Sub1Array9644[i],
					bool, i_16_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mia.F(" + i + ','
					+ i_15_ + ',' + bool + ',' + i_16_ + ')'));
		}
	}

	final boolean method75(int i) {
		try {
			anInt7272++;
			if (i <= 19)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mia.B(" + i + ')');
		}
	}

	Class2_Sub9(Class163_Sub2 class163_sub2) {
		super(class163_sub2);
	}

	static final boolean method2948(int i, int i_17_, int i_18_, int i_19_,
			int i_20_, int i_21_, int i_22_, int i_23_, byte i_24_, int i_25_) {
		try {
			anInt7275++;
			if ((i_25_ ^ 0xffffffff) < -2001 || (i ^ 0xffffffff) < -2001
					|| i_19_ > 2000 || (i_23_ ^ 0xffffffff) < -2001
					|| (i_20_ ^ 0xffffffff) < -2001
					|| (i_22_ ^ 0xffffffff) < -2001)
				return false;
			if (i_25_ < -2000 || i < -2000 || (i_19_ ^ 0xffffffff) > 1999
					|| (i_23_ ^ 0xffffffff) > 1999 || i_20_ < -2000
					|| (i_22_ ^ 0xffffffff) > 1999)
				return false;
			if ((Class126.anInt1708 ^ 0xffffffff) == -3) {
				int i_26_ = i_23_ + i_25_ * Class2_Sub1.anInt5065;
				if ((i_26_ ^ 0xffffffff) <= -1
						&& Class11_Sub2_Sub1.anIntArray8436.length > i_26_
						&& ((i_17_ << 8) - 38400 < Class11_Sub2_Sub1.anIntArray8436[i_26_]))
					return false;
				i_26_ = i * Class2_Sub1.anInt5065 + i_20_;
				if (i_26_ >= 0
						&& ((i_26_ ^ 0xffffffff) > (Class11_Sub2_Sub1.anIntArray8436.length ^ 0xffffffff))
						&& ((-38400 + (i_18_ << 8) ^ 0xffffffff) > (Class11_Sub2_Sub1.anIntArray8436[i_26_] ^ 0xffffffff)))
					return false;
				i_26_ = i_22_ - -(i_19_ * Class2_Sub1.anInt5065);
				if ((i_26_ ^ 0xffffffff) <= -1
						&& i_26_ < Class11_Sub2_Sub1.anIntArray8436.length
						&& (((i_21_ << 8) - 38400 ^ 0xffffffff) > (Class11_Sub2_Sub1.anIntArray8436[i_26_] ^ 0xffffffff)))
					return false;
			}
			int i_27_ = -i_23_ + i_20_;
			int i_28_ = i + -i_25_;
			int i_29_ = -i_23_ + i_22_;
			int i_30_ = -i_25_ + i_19_;
			int i_31_ = -i_17_ + i_18_;
			if ((i_25_ ^ 0xffffffff) > (i ^ 0xffffffff)
					&& (i_19_ ^ 0xffffffff) < (i_19_ ^ 0xffffffff)) {
				if (i <= i_19_)
					i_19_++;
				else
					i++;
				i_25_--;
			} else if (i_19_ > i) {
				if (i_25_ > i_19_)
					i_25_++;
				else
					i_19_++;
				i--;
			} else {
				if ((i_25_ ^ 0xffffffff) >= (i ^ 0xffffffff))
					i++;
				else
					i_25_++;
				i_19_--;
			}
			int i_32_ = -i_17_ + i_21_;
			int i_33_ = 0;
			if (i_25_ != i)
				i_33_ = (-i_23_ + i_20_ << 12) / (i - i_25_);
			int i_34_ = 0;
			if ((i_19_ ^ 0xffffffff) != (i ^ 0xffffffff))
				i_34_ = (-i_20_ + i_22_ << 12) / (-i + i_19_);
			int i_35_ = 0;
			if (i_25_ != i_19_)
				i_35_ = (-i_22_ + i_23_ << 12) / (i_25_ - i_19_);
			int i_36_ = -(i_29_ * i_28_) + i_30_ * i_27_;
			if ((i_36_ ^ 0xffffffff) == -1)
				return false;
			int i_37_ = (-(i_32_ * i_28_) + i_31_ * i_30_ << 8) / i_36_;
			if (i_24_ != -126)
				method2949(-81, -76, (byte) -39);
			int i_38_ = (-(i_31_ * i_29_) + i_32_ * i_27_ << 8) / i_36_;
			if (i >= i_25_ && i_25_ <= i_19_) {
				if (Class6.anInt39 <= i_25_)
					return true;
				if ((i ^ 0xffffffff) < (Class6.anInt39 ^ 0xffffffff))
					i = Class6.anInt39;
				i_17_ = i_37_ + ((i_17_ << 8) + -(i_23_ * i_37_));
				if (Class6.anInt39 < i_19_)
					i_19_ = Class6.anInt39;
				if (i_19_ <= i) {
					i_20_ = i_23_ <<= 12;
					i_22_ <<= 12;
					if ((i_25_ ^ 0xffffffff) > -1) {
						i_17_ -= i_38_ * i_25_;
						i_23_ -= i_25_ * i_33_;
						i_20_ -= i_25_ * i_35_;
						i_25_ = 0;
					}
					if (i_19_ < 0) {
						i_22_ -= i_34_ * i_19_;
						i_19_ = 0;
					}
					if (((i_25_ ^ 0xffffffff) == (i_19_ ^ 0xffffffff) || i_33_ <= i_35_)
							&& ((i_19_ ^ 0xffffffff) != (i_25_ ^ 0xffffffff) || i_34_ <= i_33_)) {
						i -= i_19_;
						i_19_ -= i_25_;
						i_25_ *= Class2_Sub1.anInt5065;
						while ((--i_19_ ^ 0xffffffff) <= -1) {
							if (!Class350.method2101(i_17_, i_37_, -1
									+ (i_23_ >> 12), (byte) -74, 0,
									1 + (i_20_ >> 12),
									(Class11_Sub2_Sub1.anIntArray8436), i_25_))
								return false;
							i_23_ += i_33_;
							i_20_ += i_35_;
							i_17_ += i_38_;
							i_25_ += Class2_Sub1.anInt5065;
						}
						while ((--i ^ 0xffffffff) <= -1) {
							if (!Class350.method2101(i_17_, i_37_, -1
									+ (i_23_ >> 12), (byte) -52, 0,
									(i_22_ >> 12) + 1,
									(Class11_Sub2_Sub1.anIntArray8436), i_25_))
								return false;
							i_23_ += i_33_;
							i_25_ += Class2_Sub1.anInt5065;
							i_22_ += i_34_;
							i_17_ += i_38_;
						}
						return true;
					}
					i -= i_19_;
					i_19_ -= i_25_;
					i_25_ = Class2_Sub1.anInt5065 * i_25_;
					while ((--i_19_ ^ 0xffffffff) <= -1) {
						if (!Class350.method2101(i_17_, i_37_,
								(i_20_ >> 12) - 1, (byte) -54, 0,
								1 + (i_23_ >> 12),
								(Class11_Sub2_Sub1.anIntArray8436), i_25_))
							return false;
						i_17_ += i_38_;
						i_25_ += Class2_Sub1.anInt5065;
						i_23_ += i_33_;
						i_20_ += i_35_;
					}
					while ((--i ^ 0xffffffff) <= -1) {
						if (!Class350.method2101(i_17_, i_37_,
								(i_22_ >> 12) - 1, (byte) -121, 0,
								(i_23_ >> 12) + 1,
								(Class11_Sub2_Sub1.anIntArray8436), i_25_))
							return false;
						i_17_ += i_38_;
						i_22_ += i_34_;
						i_23_ += i_33_;
						i_25_ += Class2_Sub1.anInt5065;
					}
					return true;
				}
				i_22_ = i_23_ <<= 12;
				i_20_ <<= 12;
				if ((i_25_ ^ 0xffffffff) > -1) {
					i_22_ -= i_35_ * i_25_;
					i_17_ -= i_25_ * i_38_;
					i_23_ -= i_33_ * i_25_;
					i_25_ = 0;
				}
				if ((i ^ 0xffffffff) > -1) {
					i_20_ -= i_34_ * i;
					i = 0;
				}
				if ((i == i_25_ || i_35_ >= i_33_)
						&& (i_25_ != i || i_34_ >= i_35_)) {
					i_19_ -= i;
					i -= i_25_;
					i_25_ *= Class2_Sub1.anInt5065;
					while ((--i ^ 0xffffffff) <= -1) {
						if (!Class350.method2101(i_17_, i_37_,
								(i_23_ >> 12) - 1, (byte) -76, 0,
								(i_22_ >> 12) + 1,
								(Class11_Sub2_Sub1.anIntArray8436), i_25_))
							return false;
						i_17_ += i_38_;
						i_25_ += Class2_Sub1.anInt5065;
						i_23_ += i_33_;
						i_22_ += i_35_;
					}
					while (--i_19_ >= 0) {
						if (!Class350.method2101(i_17_, i_37_,
								(i_20_ >> 12) - 1, (byte) -94, 0,
								(i_22_ >> 12) + 1,
								(Class11_Sub2_Sub1.anIntArray8436), i_25_))
							return false;
						i_20_ += i_34_;
						i_25_ += Class2_Sub1.anInt5065;
						i_22_ += i_35_;
						i_17_ += i_38_;
					}
					return true;
				}
				i_19_ -= i;
				i -= i_25_;
				i_25_ *= Class2_Sub1.anInt5065;
				while (--i >= 0) {
					if (!Class350.method2101(i_17_, i_37_, (i_22_ >> 12) - 1,
							(byte) -58, 0, 1 + (i_23_ >> 12),
							Class11_Sub2_Sub1.anIntArray8436, i_25_))
						return false;
					i_22_ += i_35_;
					i_17_ += i_38_;
					i_23_ += i_33_;
					i_25_ += Class2_Sub1.anInt5065;
				}
				while ((--i_19_ ^ 0xffffffff) <= -1) {
					if (!Class350.method2101(i_17_, i_37_, (i_22_ >> 12) - 1,
							(byte) -77, 0, 1 + (i_20_ >> 12),
							Class11_Sub2_Sub1.anIntArray8436, i_25_))
						return false;
					i_22_ += i_35_;
					i_20_ += i_34_;
					i_17_ += i_38_;
					i_25_ += Class2_Sub1.anInt5065;
				}
				return true;
			}
			if (i > i_19_) {
				if ((Class6.anInt39 ^ 0xffffffff) >= (i_19_ ^ 0xffffffff))
					return true;
				if ((Class6.anInt39 ^ 0xffffffff) > (i ^ 0xffffffff))
					i = Class6.anInt39;
				i_21_ = i_37_ + (-(i_37_ * i_22_) + (i_21_ << 8));
				if ((Class6.anInt39 ^ 0xffffffff) > (i_25_ ^ 0xffffffff))
					i_25_ = Class6.anInt39;
				if ((i_25_ ^ 0xffffffff) > (i ^ 0xffffffff)) {
					i_20_ = i_22_ <<= 12;
					i_23_ <<= 12;
					if (i_19_ < 0) {
						i_21_ -= i_38_ * i_19_;
						i_22_ -= i_35_ * i_19_;
						i_20_ -= i_19_ * i_34_;
						i_19_ = 0;
					}
					if (i_25_ < 0) {
						i_23_ -= i_25_ * i_33_;
						i_25_ = 0;
					}
					if (i_35_ > i_34_) {
						i -= i_25_;
						i_25_ -= i_19_;
						i_19_ *= Class2_Sub1.anInt5065;
						while ((--i_25_ ^ 0xffffffff) <= -1) {
							if (!Class350.method2101(i_21_, i_37_,
									(i_20_ >> 12) - 1, (byte) -61, 0,
									1 + (i_22_ >> 12),
									(Class11_Sub2_Sub1.anIntArray8436), i_19_))
								return false;
							i_21_ += i_38_;
							i_20_ += i_34_;
							i_22_ += i_35_;
							i_19_ += Class2_Sub1.anInt5065;
						}
						while ((--i ^ 0xffffffff) <= -1) {
							if (!Class350.method2101(i_21_, i_37_,
									(i_20_ >> 12) - 1, (byte) -64, 0,
									(i_23_ >> 12) + 1,
									(Class11_Sub2_Sub1.anIntArray8436), i_19_))
								return false;
							i_23_ += i_33_;
							i_20_ += i_34_;
							i_21_ += i_38_;
							i_19_ += Class2_Sub1.anInt5065;
						}
						return true;
					}
					i -= i_25_;
					i_25_ -= i_19_;
					i_19_ *= Class2_Sub1.anInt5065;
					while (--i_25_ >= 0) {
						if (!Class350.method2101(i_21_, i_37_, -1
								+ (i_22_ >> 12), (byte) -128, 0,
								(i_20_ >> 12) + 1,
								(Class11_Sub2_Sub1.anIntArray8436), i_19_))
							return false;
						i_21_ += i_38_;
						i_19_ += Class2_Sub1.anInt5065;
						i_20_ += i_34_;
						i_22_ += i_35_;
					}
					while ((--i ^ 0xffffffff) <= -1) {
						if (!Class350.method2101(i_21_, i_37_, -1
								+ (i_23_ >> 12), (byte) -55, 0,
								(i_20_ >> 12) + 1,
								(Class11_Sub2_Sub1.anIntArray8436), i_19_))
							return false;
						i_23_ += i_33_;
						i_19_ += Class2_Sub1.anInt5065;
						i_20_ += i_34_;
						i_21_ += i_38_;
					}
					return true;
				}
				i_23_ = i_22_ <<= 12;
				i_20_ <<= 12;
				if (i_19_ < 0) {
					i_22_ -= i_19_ * i_35_;
					i_23_ -= i_19_ * i_34_;
					i_21_ -= i_38_ * i_19_;
					i_19_ = 0;
				}
				if ((i ^ 0xffffffff) > -1) {
					i_20_ -= i_33_ * i;
					i = 0;
				}
				if (i_35_ > i_34_) {
					i_25_ -= i;
					i -= i_19_;
					i_19_ = Class2_Sub1.anInt5065 * i_19_;
					while (--i >= 0) {
						if (!Class350.method2101(i_21_, i_37_,
								(i_23_ >> 12) - 1, (byte) -71, 0,
								(i_22_ >> 12) + 1,
								(Class11_Sub2_Sub1.anIntArray8436), i_19_))
							return false;
						i_21_ += i_38_;
						i_23_ += i_34_;
						i_19_ += Class2_Sub1.anInt5065;
						i_22_ += i_35_;
					}
					while ((--i_25_ ^ 0xffffffff) <= -1) {
						if (!Class350.method2101(i_21_, i_37_,
								(i_20_ >> 12) - 1, (byte) 121, 0,
								(i_22_ >> 12) + 1,
								(Class11_Sub2_Sub1.anIntArray8436), i_19_))
							return false;
						i_19_ += Class2_Sub1.anInt5065;
						i_21_ += i_38_;
						i_22_ += i_35_;
						i_20_ += i_33_;
					}
					return true;
				}
				i_25_ -= i;
				i -= i_19_;
				i_19_ *= Class2_Sub1.anInt5065;
				while ((--i ^ 0xffffffff) <= -1) {
					if (!Class350.method2101(i_21_, i_37_, -1 + (i_22_ >> 12),
							(byte) 125, 0, (i_23_ >> 12) + 1,
							Class11_Sub2_Sub1.anIntArray8436, i_19_))
						return false;
					i_22_ += i_35_;
					i_23_ += i_34_;
					i_19_ += Class2_Sub1.anInt5065;
					i_21_ += i_38_;
				}
				while ((--i_25_ ^ 0xffffffff) <= -1) {
					if (!Class350.method2101(i_21_, i_37_, -1 + (i_22_ >> 12),
							(byte) 75, 0, 1 + (i_20_ >> 12),
							Class11_Sub2_Sub1.anIntArray8436, i_19_))
						return false;
					i_20_ += i_33_;
					i_21_ += i_38_;
					i_19_ += Class2_Sub1.anInt5065;
					i_22_ += i_35_;
				}
				return true;
			}
			if ((Class6.anInt39 ^ 0xffffffff) >= (i ^ 0xffffffff))
				return true;
			if ((Class6.anInt39 ^ 0xffffffff) > (i_25_ ^ 0xffffffff))
				i_25_ = Class6.anInt39;
			i_18_ = (i_18_ << 8) - (i_37_ * i_20_ + -i_37_);
			if ((i_19_ ^ 0xffffffff) < (Class6.anInt39 ^ 0xffffffff))
				i_19_ = Class6.anInt39;
			if (i_19_ < i_25_) {
				i_23_ = i_20_ <<= 12;
				i_22_ <<= 12;
				if (i < 0) {
					i_18_ -= i * i_38_;
					i_23_ -= i_33_ * i;
					i_20_ -= i * i_34_;
					i = 0;
				}
				if ((i_19_ ^ 0xffffffff) > -1) {
					i_22_ -= i_19_ * i_35_;
					i_19_ = 0;
				}
				if ((i_19_ == i || i_34_ <= i_33_)
						&& (i != i_19_ || i_33_ <= i_35_)) {
					i_25_ -= i_19_;
					i_19_ -= i;
					i *= Class2_Sub1.anInt5065;
					while (--i_19_ >= 0) {
						if (!Class350.method2101(i_18_, i_37_,
								(i_20_ >> 12) - 1, (byte) 68, 0,
								1 + (i_23_ >> 12),
								(Class11_Sub2_Sub1.anIntArray8436), i))
							return false;
						i_18_ += i_38_;
						i_20_ += i_34_;
						i_23_ += i_33_;
						i += Class2_Sub1.anInt5065;
					}
					while (--i_25_ >= 0) {
						if (!Class350.method2101(i_18_, i_37_,
								(i_22_ >> 12) - 1, (byte) -128, 0,
								1 + (i_23_ >> 12),
								(Class11_Sub2_Sub1.anIntArray8436), i))
							return false;
						i_18_ += i_38_;
						i_22_ += i_35_;
						i += Class2_Sub1.anInt5065;
						i_23_ += i_33_;
					}
					return true;
				}
				i_25_ -= i_19_;
				i_19_ -= i;
				i = Class2_Sub1.anInt5065 * i;
				while ((--i_19_ ^ 0xffffffff) <= -1) {
					if (!Class350.method2101(i_18_, i_37_, (i_23_ >> 12) - 1,
							(byte) -107, 0, (i_20_ >> 12) + 1,
							Class11_Sub2_Sub1.anIntArray8436, i))
						return false;
					i_18_ += i_38_;
					i_23_ += i_33_;
					i_20_ += i_34_;
					i += Class2_Sub1.anInt5065;
				}
				while ((--i_25_ ^ 0xffffffff) <= -1) {
					if (!Class350.method2101(i_18_, i_37_, (i_23_ >> 12) - 1,
							(byte) -49, 0, 1 + (i_22_ >> 12),
							Class11_Sub2_Sub1.anIntArray8436, i))
						return false;
					i_23_ += i_33_;
					i += Class2_Sub1.anInt5065;
					i_18_ += i_38_;
					i_22_ += i_35_;
				}
				return true;
			}
			i_22_ = i_20_ <<= 12;
			if (i < 0) {
				i_20_ -= i_34_ * i;
				i_18_ -= i_38_ * i;
				i_22_ -= i * i_33_;
				i = 0;
			}
			i_23_ <<= 12;
			if ((i_25_ ^ 0xffffffff) > -1) {
				i_23_ -= i_35_ * i_25_;
				i_25_ = 0;
			}
			if (i_33_ >= i_34_) {
				i_19_ -= i_25_;
				i_25_ -= i;
				i = Class2_Sub1.anInt5065 * i;
				while ((--i_25_ ^ 0xffffffff) <= -1) {
					if (!Class350.method2101(i_18_, i_37_, -1 + (i_20_ >> 12),
							(byte) -57, 0, 1 + (i_22_ >> 12),
							Class11_Sub2_Sub1.anIntArray8436, i))
						return false;
					i_20_ += i_34_;
					i_22_ += i_33_;
					i += Class2_Sub1.anInt5065;
					i_18_ += i_38_;
				}
				while (--i_19_ >= 0) {
					if (!Class350.method2101(i_18_, i_37_, (i_20_ >> 12) - 1,
							(byte) -107, 0, (i_23_ >> 12) + 1,
							Class11_Sub2_Sub1.anIntArray8436, i))
						return false;
					i_23_ += i_35_;
					i_18_ += i_38_;
					i_20_ += i_34_;
					i += Class2_Sub1.anInt5065;
				}
				return true;
			}
			i_19_ -= i_25_;
			i_25_ -= i;
			i *= Class2_Sub1.anInt5065;
			while (--i_25_ >= 0) {
				if (!Class350.method2101(i_18_, i_37_, -1 + (i_22_ >> 12),
						(byte) 70, 0, 1 + (i_20_ >> 12),
						Class11_Sub2_Sub1.anIntArray8436, i))
					return false;
				i += Class2_Sub1.anInt5065;
				i_18_ += i_38_;
				i_20_ += i_34_;
				i_22_ += i_33_;
			}
			while ((--i_19_ ^ 0xffffffff) <= -1) {
				if (!Class350.method2101(i_18_, i_37_, (i_23_ >> 12) - 1,
						(byte) -73, 0, 1 + (i_20_ >> 12),
						Class11_Sub2_Sub1.anIntArray8436, i))
					return false;
				i_20_ += i_34_;
				i_18_ += i_38_;
				i += Class2_Sub1.anInt5065;
				i_23_ += i_35_;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mia.D(" + i + ','
					+ i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ','
					+ i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ','
					+ i_25_ + ')'));
		}
	}

	static final int method2949(int i, int i_39_, byte i_40_) {
		try {
			anInt7276++;
			i = i * (i_39_ & 0x7f) >> 7;
			if (i >= 2) {
				if ((i ^ 0xffffffff) < -127)
					i = 126;
			} else
				i = 2;
			if (i_40_ > -64)
				anIntArray7273 = null;
			return i + (0xff80 & i_39_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mia.H(" + i + ','
					+ i_39_ + ',' + i_40_ + ')'));
		}
	}
}
