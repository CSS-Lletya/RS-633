/* Class108_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108_Sub10 extends Class108 {
	static int anInt6128;
	static int anInt6129;
	static boolean aBool6130 = true;
	static int anInt6131;
	static int anInt6132;
	static int[] anIntArray6133 = new int[3];
	static int anInt6134;
	static int anInt6135;
	static int anInt6136;
	static int anInt6137;
	static int anInt6138;
	static int anInt6139;
	static int anInt6140;
	static int anInt6141;

	public static void method2614(byte i) {
		try {
			anIntArray6133 = null;
			int i_0_ = 1 % ((31 - i) / 33);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sia.J(" + i + ')');
		}
	}

	static final void method2615(int i, int[] is, int[] is_1_,
			Player class376_sub7_sub5_sub5_sub1, int[] is_2_) {
		try {
			int i_3_ = 0;
			if (i < 71)
				aBool6130 = true;
			for (/**/; is.length > i_3_; i_3_++) {
				int i_4_ = is[i_3_];
				int i_5_ = is_1_[i_3_];
				int i_6_ = is_2_[i_3_];
				for (int i_7_ = 0; i_5_ != 0
						&& (((Actor) class376_sub7_sub5_sub5_sub1).aClass208Array10342).length > i_7_; i_5_ >>>= 1) {
					if ((0x1 & i_5_ ^ 0xffffffff) != -1) {
						if (i_4_ == -1)
							((Actor) class376_sub7_sub5_sub5_sub1).aClass208Array10342[i_7_] = null;
						else {
							Class281 class281 = Class108_Sub23.aClass198_7760
									.method1284(i_4_, (byte) 109);
							int i_8_ = ((Class281) class281).anInt3816;
							Class208 class208 = (((Actor) class376_sub7_sub5_sub5_sub1).aClass208Array10342[i_7_]);
							if (class208 != null) {
								if ((((Class208) class208).anInt2807 ^ 0xffffffff) != (i_4_ ^ 0xffffffff)) {
									if (((Class281) class281).anInt3792 >= ((Class281) (Class108_Sub23.aClass198_7760
											.method1284(
													((Class208) class208).anInt2807,
													(byte) 123))).anInt3792)
										class208 = ((Actor) class376_sub7_sub5_sub5_sub1).aClass208Array10342[i_7_] = null;
								} else if ((i_8_ ^ 0xffffffff) == -1)
									class208 = ((Actor) class376_sub7_sub5_sub5_sub1).aClass208Array10342[i_7_] = null;
								else if ((i_8_ ^ 0xffffffff) != -2) {
									if (i_8_ == 2)
										((Class208) class208).anInt2804 = 0;
								} else {
									((Class208) class208).anInt2809 = i_6_;
									((Class208) class208).anInt2810 = 0;
									((Class208) class208).anInt2804 = 0;
									((Class208) class208).anInt2805 = 0;
									((Class208) class208).anInt2803 = 1;
									if (!((Actor) class376_sub7_sub5_sub5_sub1).aBool10331)
										Class268.method1690(-701644944, 0,
												class376_sub7_sub5_sub5_sub1,
												class281);
								}
							}
							if (class208 == null) {
								class208 = ((Actor) class376_sub7_sub5_sub5_sub1).aClass208Array10342[i_7_] = new Class208();
								((Class208) class208).anInt2803 = 1;
								((Class208) class208).anInt2804 = 0;
								((Class208) class208).anInt2809 = i_6_;
								((Class208) class208).anInt2810 = 0;
								((Class208) class208).anInt2805 = 0;
								((Class208) class208).anInt2807 = i_4_;
								if (!((Actor) class376_sub7_sub5_sub5_sub1).aBool10331)
									Class268.method1690(-701644944, 0,
											class376_sub7_sub5_sub5_sub1,
											class281);
							}
						}
					}
					i_7_++;
				}
			}
			anInt6134++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sia.H(" + i + ','
					+ (is != null ? "{...}" : "null") + ','
					+ (is_1_ != null ? "{...}" : "null") + ','
					+ (class376_sub7_sub5_sub5_sub1 != null ? "{...}" : "null")
					+ ',' + (is_2_ != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2616(Class146 class146, int i) {
		try {
			anInt6141++;
			Class57.anInt861 = class146.method920(-119, "hitmarks");
			Class236_Sub7.anInt6975 = class146.method920(i + 14016,
					"hitbar_default");
			Class307.anInt4119 = class146.method920(111, "timerbar_default");
			Class236_Sub3.anInt6253 = class146.method920(i ^ 0x3604,
					"headicons_pk");
			Class335_Sub3.anInt7800 = class146.method920(i ^ ~0x3634,
					"headicons_prayer");
			anInt6140 = class146.method920(115, "hint_headicons");
			anInt6139 = class146.method920(-115, "hint_mapmarkers");
			Class234_Sub2_Sub1.anInt8450 = class146.method920(-19, "mapflag");
			Class11_Sub2_Sub3.anInt8478 = class146.method920(i ^ 0x3619,
					"cross");
			Class196.anInt2657 = class146.method920(i ^ ~0x3638, "mapdots");
			Class104.anInt1388 = class146.method920(109, "scrollbar");
			Class1.anInt5 = class146.method920(121, "name_icons");
			Class147.anInt1991 = class146.method920(111, "floorshadows");
			Class9.anInt66 = class146.method920(111, "compass");
			Class67.anInt951 = class146.method920(i + 13849, "otherlevel");
			if (i != -13903)
				method2618((byte) 103, -7);
			Class353.anInt4643 = class146.method920(-50, "hint_mapedge");
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sia.I("
					+ (class146 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final int method725(byte i) {
		try {
			int i_9_ = -120 % ((i - 70) / 51);
			anInt6136++;
			if (!((Class108) this).aClass11_Sub17_1458.method2456(-18373)) {
				if (((Class11_Sub17) ((Class108) this).aClass11_Sub17_1458).aClass108_Sub28_5696
						.method3183(5)
						&& Class377
								.method2208(
										((Class11_Sub17) (((Class108) this).aClass11_Sub17_1458)).aClass108_Sub28_5696
												.method3181(false), (byte) 120))
					return 1;
				return 0;
			}
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sia.A(" + i + ')');
		}
	}

	final int method2617(boolean bool) {
		try {
			anInt6135++;
			if (bool != false)
				anInt6140 = -53;
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sia.B(" + bool + ')');
		}
	}

	final void method726(boolean bool) {
		do {
			try {
				anInt6131++;
				if (((Class108) this).aClass11_Sub17_1458.method2456(-18373))
					((Class108) this).anInt1459 = 2;
				if (((Class108) this).anInt1459 < 0
						|| ((Class108) this).anInt1459 > 2)
					((Class108) this).anInt1459 = method725((byte) -70);
				if (bool == false)
					break;
				method725((byte) 53);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "sia.E(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	Class108_Sub10(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}

	static final void method2618(byte i, int i_10_) {
		do {
			try {
				anInt6137++;
				Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
						-652872096, 7, i_10_);
				class11_sub45_sub15.method3660(0);
				if (i <= -17)
					break;
				method2614((byte) 93);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "sia.G(" + i + ','
						+ i_10_ + ')');
			}
			break;
		} while (false);
	}

	final void method728(int i, int i_11_) {
		do {
			try {
				((Class108) this).anInt1459 = i_11_;
				anInt6132++;
				if (i == 0)
					break;
				anInt6140 = -3;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "sia.C(" + i + ','
						+ i_11_ + ')');
			}
			break;
		} while (false);
	}

	final int method721(int i, int i_12_) {
		try {
			if (i_12_ < 10)
				return -119;
			anInt6129++;
			if (((Class108) this).aClass11_Sub17_1458.method2456(-18373))
				return 3;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sia.F(" + i + ','
					+ i_12_ + ')');
		}
	}

	Class108_Sub10(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
	}

	final boolean method2619(byte i) {
		try {
			if (i != -53)
				method728(-36, -53);
			anInt6128++;
			if (!((Class108) this).aClass11_Sub17_1458.method2456(i - 18320))
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sia.D(" + i + ')');
		}
	}
}
