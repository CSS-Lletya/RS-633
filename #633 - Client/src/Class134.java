/* Class134 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class134 {
	static int anInt1848;
	static int anInt1849;
	static int anInt1850;
	static long aLong1851 = (long) (9.999999999E9 * Math.random());
	static int anInt1852;
	static boolean aBool1853 = false;
	static int anInt1854;
	private Class22 aClass22_1855 = new Class22(256);
	static int anInt1856 = 0;
	private Interface1 anInterface1_1857;
	static int anInt1858;
	static int anInt1859;
	static int anInt1860;
	private Class163_Sub2 aClass163_Sub2_1861;
	/* synthetic */static Class aClass1862;

	static final void method862(int i, byte i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_, int i_5_, int i_6_) {
		try {
			anInt1852++;
			int i_7_ = i_4_ - 334;
			if (i_7_ >= 0) {
				if ((i_7_ ^ 0xffffffff) < -101)
					i_7_ = 100;
			} else
				i_7_ = 0;
			int i_8_ = ((-Class11_Sub6_Sub3.aShort9139 + Class108_Sub23.aShort7762)
					* i_7_ / 100 + Class11_Sub6_Sub3.aShort9139);
			Class117.anInt1597 = Class117.anInt1595 * i_8_ >> 8;
			i_1_ = i_1_ * i_8_ >> 8;
			int i_9_ = 0x3fff & -i_6_ + 16384;
			int i_10_ = 16384 + -i_5_ & 0x3fff;
			int i_11_ = 0;
			if (i_0_ > -81)
				method868(null, -83, 11, -22, 72, -64, -85, -84, null);
			int i_12_ = 0;
			int i_13_ = i_1_;
			if ((i_9_ ^ 0xffffffff) != -1) {
				i_12_ = -i_13_ * Class335.anIntArray4436[i_9_] >> 14;
				i_13_ = i_13_ * Class335.anIntArray4430[i_9_] >> 14;
			}
			if ((i_10_ ^ 0xffffffff) != -1) {
				i_11_ = i_13_ * Class335.anIntArray4436[i_10_] >> 14;
				i_13_ = Class335.anIntArray4430[i_10_] * i_13_ >> 14;
			}
			Class266.anInt3616 = i_6_;
			Class171.anInt2193 = i_5_;
			Class11_Sub45_Sub11.anInt9157 = i_2_ + -i_11_;
			Class303.anInt4088 = -i_13_ + i_3_;
			Class218.anInt3007 = i + -i_12_;
			Class211.anInt2857 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("er.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	final void method863(boolean bool) {
		try {
			anInt1849++;
			if (bool != true)
				method867(-102, false);
			aClass22_1855.method182(5, (byte) -73);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "er.D(" + bool + ')');
		}
	}

	static final void method864(int i) {
		try {
			Class11_Sub19 class11_sub19 = (Class11_Sub19) Class332.aClass84_4407
					.method584(-12261);
			if (i > -47)
				anInt1856 = 29;
			for (/**/; class11_sub19 != null; class11_sub19 = ((Class11_Sub19) Class332.aClass84_4407
					.method578(-15361))) {
				if (((Class11_Sub19) class11_sub19).aBool5831)
					class11_sub19.method2482(83);
			}
			anInt1858++;
			for (Class11_Sub19 class11_sub19_14_ = ((Class11_Sub19) Class339.aClass84_4487
					.method584(-12261)); class11_sub19_14_ != null; class11_sub19_14_ = (Class11_Sub19) Class339.aClass84_4487
					.method578(-15361)) {
				if (((Class11_Sub19) class11_sub19_14_).aBool5831)
					class11_sub19_14_.method2482(83);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "er.C(" + i + ')');
		}
	}

	final void method865(int i) {
		do {
			try {
				anInt1850++;
				aClass22_1855.method189((byte) -33);
				if (i == 3969)
					break;
				aClass22_1855 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "er.G(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method866() {
		for (int i = 0; i < Class11_Sub26.anInt6303; i++) {
			if (!Class232.aBoolArray3176[i]) {
				Class248 class248 = Class309.aClass248Array4132[i];
				Class11_Sub46 class11_sub46 = ((Class248) class248).aClass11_Sub46_3357;
				int i_15_ = ((Class248) class248).anInt3345;
				int i_16_ = class11_sub46.method3208(-1) - Class19.anInt152;
				int i_17_ = 1 + (2 * i_16_ >> Class11_Sub2_Sub8.anInt8751);
				int i_18_ = 0;
				int[] is = new int[i_17_ * i_17_];
				int i_19_ = (class11_sub46.method3203(false) - i_16_ >> Class11_Sub2_Sub8.anInt8751);
				int i_20_ = (class11_sub46.method3204(true) - i_16_ >> Class11_Sub2_Sub8.anInt8751);
				int i_21_ = (class11_sub46.method3204(true) + i_16_ >> Class11_Sub2_Sub8.anInt8751);
				if (i_20_ < 0) {
					i_18_ -= i_20_;
					i_20_ = 0;
				}
				if (i_21_ >= Class82.anInt1133)
					i_21_ = Class82.anInt1133 - 1;
				for (int i_22_ = i_20_; i_22_ <= i_21_; i_22_++) {
					int i_23_ = ((Class248) class248).aShortArray3344[i_18_];
					int i_24_ = i_23_ >>> 8;
					int i_25_ = i_18_ * i_17_ + i_24_;
					int i_26_ = i_19_ + (i_23_ >>> 8);
					int i_27_ = i_26_ + (i_23_ & 0xff) - 1;
					if (i_26_ < 0) {
						i_25_ -= i_26_;
						i_26_ = 0;
					}
					if (i_27_ >= Class138.anInt1886)
						i_27_ = Class138.anInt1886 - 1;
					for (int i_28_ = i_26_; i_28_ <= i_27_; i_28_++) {
						int i_29_ = 1;
						Class376_Sub7_Sub5 class376_sub7_sub5 = (Class180
								.method1185(
										i_15_,
										i_28_,
										i_22_,
										(aClass1862 != null ? aClass1862
												: (aClass1862 = getClassByName("Class376_Sub7_Sub5")))));
						if (class376_sub7_sub5 != null
								&& (((Class376_Sub7_Sub5) class376_sub7_sub5).aByte9627) != 0) {
							if ((((Class376_Sub7_Sub5) class376_sub7_sub5).aByte9627) == 1) {
								boolean bool = i_28_ - 1 >= i_26_;
								boolean bool_30_ = i_28_ + 1 <= i_27_;
								if (!bool && i_22_ + 1 <= i_21_) {
									int i_31_ = (((Class248) class248).aShortArray3344[i_18_ + 1]);
									int i_32_ = i_19_ + (i_31_ >>> 8);
									int i_33_ = i_32_ + (i_31_ & 0xff);
									bool = i_28_ > i_32_ && i_28_ < i_33_;
								}
								if (!bool_30_ && i_22_ - 1 >= i_20_) {
									int i_34_ = (((Class248) class248).aShortArray3344[i_18_ - 1]);
									int i_35_ = i_19_ + (i_34_ >>> 8);
									int i_36_ = i_35_ + (i_34_ & 0xff);
									bool_30_ = i_28_ > i_35_ && i_28_ < i_36_;
								}
								if (bool && !bool_30_)
									i_29_ = 4;
								else if (bool_30_ && !bool)
									i_29_ = 2;
							} else {
								boolean bool = i_28_ - 1 >= i_26_;
								boolean bool_37_ = i_28_ + 1 <= i_27_;
								if (!bool && i_22_ - 1 >= i_20_) {
									int i_38_ = (((Class248) class248).aShortArray3344[i_18_ - 1]);
									int i_39_ = i_19_ + (i_38_ >>> 8);
									int i_40_ = i_39_ + (i_38_ & 0xff);
									bool = i_28_ > i_39_ && i_28_ < i_40_;
								}
								if (!bool_37_ && i_22_ + 1 <= i_21_) {
									int i_41_ = (((Class248) class248).aShortArray3344[i_18_ + 1]);
									int i_42_ = i_19_ + (i_41_ >>> 8);
									int i_43_ = i_42_ + (i_41_ & 0xff);
									bool_37_ = i_28_ > i_42_ && i_28_ < i_43_;
								}
								if (bool && !bool_37_)
									i_29_ = 3;
								else if (bool_37_ && !bool)
									i_29_ = 5;
							}
						}
						is[i_25_++] = i_29_;
					}
					i_18_++;
				}
				Class232.aBoolArray3176[i] = true;
				Class315.aClass12Array4179[i_15_].method136(class11_sub46, is);
			}
		}
	}

	final Interface7 method867(int i, boolean bool) {
		try {
			anInt1860++;
			Object object = aClass22_1855.method188((long) i, (byte) -66);
			if (bool != true)
				anInt1848 = -26;
			if (object != null)
				return (Interface7) object;
			if (!anInterface1_1857.method2(i, 45))
				return null;
			Class188 class188 = anInterface1_1857.method7((byte) 127, i);
			int i_44_ = (((Class188) class188).aBool2430 ? 64
					: ((Class163_Sub2) aClass163_Sub2_1861).anInt7552);
			Interface7 interface7;
			if (((Class188) class188).aBool2412
					&& aClass163_Sub2_1861.method1086()) {
				float[] fs = anInterface1_1857.method5(i_44_, -23173, i_44_, i,
						0.7F, false);
				interface7 = aClass163_Sub2_1861.method3104(i_44_,
						Class364.aClass98_4774,
						((((Class188) class188).aByte2422) ^ 0xffffffff) != -1,
						i_44_, (byte) -53, fs);
			} else {
				int[] is;
				if (((Class188) class188).anInt2425 == 2
						|| !Class10.method118((byte) -104,
								((Class188) class188).aByte2426))
					is = anInterface1_1857.method3(i_44_, -116, false, 0.7F,
							i_44_, i);
				else
					is = anInterface1_1857.method6(true, i_44_, 20377, i_44_,
							0.7F, i);
				interface7 = aClass163_Sub2_1861.method3075(i_44_, is,
						((((Class188) class188).aByte2422) ^ 0xffffffff) != -1,
						i_44_, false);
			}
			interface7.method26(28970, ((Class188) class188).aBool2420,
					((Class188) class188).aBool2419);
			aClass22_1855.method184((byte) 127, interface7, (long) i);
			return interface7;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "er.E(" + i + ','
					+ bool + ')');
		}
	}

	static final void method868(byte[] is, int i, int i_45_, int i_46_,
			int i_47_, int i_48_, int i_49_, int i_50_, byte[] is_51_) {
		try {
			anInt1859++;
			int i_52_ = -(i_50_ >> 2);
			i_50_ = -(i_50_ & 0x3);
			if (i_46_ != 1)
				method862(-65, (byte) 97, 79, -43, 53, 71, 71, 114);
			for (int i_53_ = -i_48_; i_53_ < 0; i_53_++) {
				for (int i_54_ = i_52_; (i_54_ ^ 0xffffffff) > -1; i_54_++) {
					is[i_47_++] += is_51_[i++];
					is[i_47_++] += is_51_[i++];
					is[i_47_++] += is_51_[i++];
					is[i_47_++] += is_51_[i++];
				}
				for (int i_55_ = i_50_; (i_55_ ^ 0xffffffff) > -1; i_55_++)
					is[i_47_++] += is_51_[i++];
				i_47_ += i_49_;
				i += i_45_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("er.F(" + (is != null ? "{...}" : "null") + ',' + i + ','
							+ i_45_ + ',' + i_46_ + ',' + i_47_ + ',' + i_48_
							+ ',' + i_49_ + ',' + i_50_ + ','
							+ (is_51_ != null ? "{...}" : "null") + ')'));
		}
	}

	Class134(Class163_Sub2 class163_sub2, Interface1 interface1) {
		try {
			anInterface1_1857 = interface1;
			aClass163_Sub2_1861 = class163_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("er.<init>("
					+ (class163_sub2 != null ? "{...}" : "null") + ','
					+ (interface1 != null ? "{...}" : "null") + ')'));
		}
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
		anInt1854 = 100;
		anInt1848 = -1;
	}
}
