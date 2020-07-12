/* Class243 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class243 {
	private Class182 aClass182_3294 = null;
	static int anInt3295;
	static int anInt3296;
	static int anInt3297;
	static int anInt3298;
	static int anInt3299;
	static int anInt3300;
	static Class83 aClass83_3301 = new Class83(4, 3);
	private int anInt3302;
	private Class182 aClass182_3303 = null;
	private int anInt3304 = 65000;
	static int anInt3305;
	static int anInt3306;
	static int anInt3307;
	static Class163 aClass163_3308;

	private final boolean method1532(boolean bool, int i, byte[] is, int i_0_,
			int i_1_) {
		try {
			anInt3296++;
			synchronized (aClass182_3294) {
				try {
					int i_2_;
					if (bool) {
						if ((long) (i_0_ * 6 + 6) > aClass182_3303
								.method1190(-74))
							return false;
						aClass182_3303.method1192((long) (i_0_ * 6), true);
						aClass182_3303.method1195(0,
								(IOException_Sub1.aByteArray9968), 6,
								(byte) -78);
						i_2_ = ((0xff & IOException_Sub1.aByteArray9968[5]) + ((0xff00 & IOException_Sub1.aByteArray9968[4] << 8) + (0xff0000 & (IOException_Sub1.aByteArray9968[3] << 16))));
						if (i_2_ <= 0
								|| (aClass182_3294.method1190(-38) / 520L < (long) i_2_))
							return false;
					} else {
						i_2_ = (int) ((519L + aClass182_3294.method1190(-66)) / 520L);
						if ((i_2_ ^ 0xffffffff) == -1)
							i_2_ = 1;
					}
					IOException_Sub1.aByteArray9968[4] = (byte) (i_2_ >> 8);
					IOException_Sub1.aByteArray9968[5] = (byte) i_2_;
					IOException_Sub1.aByteArray9968[0] = (byte) (i_1_ >> 16);
					IOException_Sub1.aByteArray9968[2] = (byte) i_1_;
					IOException_Sub1.aByteArray9968[3] = (byte) (i_2_ >> 16);
					IOException_Sub1.aByteArray9968[1] = (byte) (i_1_ >> 8);
					aClass182_3303.method1192((long) (6 * i_0_), true);
					aClass182_3303.method1189(6, (byte) 125,
							IOException_Sub1.aByteArray9968, 0);
					int i_3_ = 0;
					int i_4_ = -121 % ((i - 65) / 56);
					int i_5_ = 0;
					while (i_1_ > i_3_) {
						int i_6_ = 0;
						if (bool) {
							aClass182_3294
									.method1192((long) (i_2_ * 520), true);
							try {
								aClass182_3294.method1195(0,
										(IOException_Sub1.aByteArray9968), 8,
										(byte) -78);
							} catch (java.io.EOFException eofexception) {
								break;
							}
							int i_7_ = ((IOException_Sub1.aByteArray9968[0] << 8 & 0xff00) + (0xff & IOException_Sub1.aByteArray9968[1]));
							int i_8_ = ((IOException_Sub1.aByteArray9968[3] & 0xff) + (0xff00 & (IOException_Sub1.aByteArray9968[2] << 8)));
							i_6_ = (((IOException_Sub1.aByteArray9968[4] & 0xff) << 16)
									+ ((0xff & IOException_Sub1.aByteArray9968[5]) << 8) - -(IOException_Sub1.aByteArray9968[6] & 0xff));
							int i_9_ = IOException_Sub1.aByteArray9968[7] & 0xff;
							if ((i_7_ ^ 0xffffffff) != (i_0_ ^ 0xffffffff)
									|| i_5_ != i_8_
									|| (anInt3302 ^ 0xffffffff) != (i_9_ ^ 0xffffffff))
								return false;
							if (i_6_ < 0
									|| (((long) i_6_ ^ 0xffffffffffffffffL) < (aClass182_3294
											.method1190(-18) / 520L ^ 0xffffffffffffffffL)))
								return false;
						}
						if ((i_6_ ^ 0xffffffff) == -1) {
							bool = false;
							i_6_ = (int) ((519L + aClass182_3294
									.method1190(-103)) / 520L);
							if ((i_6_ ^ 0xffffffff) == -1)
								i_6_++;
							if (i_6_ == i_2_)
								i_6_++;
						}
						IOException_Sub1.aByteArray9968[3] = (byte) i_5_;
						IOException_Sub1.aByteArray9968[1] = (byte) i_0_;
						IOException_Sub1.aByteArray9968[2] = (byte) (i_5_ >> 8);
						IOException_Sub1.aByteArray9968[0] = (byte) (i_0_ >> 8);
						if (i_1_ - i_3_ <= 512)
							i_6_ = 0;
						IOException_Sub1.aByteArray9968[5] = (byte) (i_6_ >> 8);
						IOException_Sub1.aByteArray9968[6] = (byte) i_6_;
						IOException_Sub1.aByteArray9968[7] = (byte) anInt3302;
						IOException_Sub1.aByteArray9968[4] = (byte) (i_6_ >> 16);
						aClass182_3294.method1192((long) (i_2_ * 520), true);
						aClass182_3294.method1189(8, (byte) 119,
								(IOException_Sub1.aByteArray9968), 0);
						int i_10_ = -i_3_ + i_1_;
						if (i_10_ > 512)
							i_10_ = 512;
						aClass182_3294.method1189(i_10_, (byte) 97, is, i_3_);
						i_2_ = i_6_;
						i_3_ += i_10_;
						i_5_++;
					}
					return true;
				} catch (java.io.IOException ioexception) {
					return false;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mda.H(" + bool + ','
					+ i + ',' + (is != null ? "{...}" : "null") + ',' + i_0_
					+ ',' + i_1_ + ')'));
		}
	}

	final boolean method1533(int i, int i_11_, int i_12_, byte[] is) {
		try {
			anInt3305++;
			synchronized (aClass182_3294) {
				if (i_11_ < i_12_
						|| (i_11_ ^ 0xffffffff) < (anInt3304 ^ 0xffffffff))
					throw new IllegalArgumentException();
				boolean bool = method1532(true, -47, is, i, i_11_);
				if (!bool)
					bool = method1532(false, 122, is, i, i_11_);
				return bool;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mda.A(" + i + ','
					+ i_11_ + ',' + i_12_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final byte[] method1534(int i, int i_13_) {
		try {
			anInt3299++;
			synchronized (aClass182_3294) {
				try {
					if ((aClass182_3303.method1190(-77) ^ 0xffffffffffffffffL) > ((long) (i_13_ * 6 + 6) ^ 0xffffffffffffffffL))
						return null;
					aClass182_3303.method1192((long) (6 * i_13_), true);
					aClass182_3303.method1195(0,
							IOException_Sub1.aByteArray9968, 6, (byte) -78);
					int i_14_ = ((IOException_Sub1.aByteArray9968[2] & i)
							+ ((IOException_Sub1.aByteArray9968[0] & 0xff) << 16) + (IOException_Sub1.aByteArray9968[1] << 8 & 0xff00));
					int i_15_ = ((0xff & IOException_Sub1.aByteArray9968[5]) + ((0xff0000 & IOException_Sub1.aByteArray9968[3] << 16) + ((IOException_Sub1.aByteArray9968[4] & 0xff) << 8)));
					if ((i_14_ ^ 0xffffffff) > -1 || anInt3304 < i_14_)
						return null;
					if ((i_15_ ^ 0xffffffff) >= -1
							|| (aClass182_3294.method1190(-57) / 520L < (long) i_15_))
						return null;
					byte[] is = new byte[i_14_];
					int i_16_ = 0;
					int i_17_ = 0;
					while (i_16_ < i_14_) {
						if ((i_15_ ^ 0xffffffff) == -1)
							return null;
						aClass182_3294.method1192((long) (i_15_ * 520), true);
						int i_18_ = -i_16_ + i_14_;
						if ((i_18_ ^ 0xffffffff) < -513)
							i_18_ = 512;
						aClass182_3294.method1195(0,
								(IOException_Sub1.aByteArray9968), 8 + i_18_,
								(byte) -78);
						int i_19_ = ((IOException_Sub1.aByteArray9968[1] & 0xff) + (IOException_Sub1.aByteArray9968[0] << 8 & 0xff00));
						int i_20_ = ((0xff & IOException_Sub1.aByteArray9968[3]) + (0xff00 & IOException_Sub1.aByteArray9968[2] << 8));
						int i_21_ = ((0xff & IOException_Sub1.aByteArray9968[6]) + ((IOException_Sub1.aByteArray9968[4] << 16 & 0xff0000) - -(0xff00 & (IOException_Sub1.aByteArray9968[5] << 8))));
						int i_22_ = IOException_Sub1.aByteArray9968[7] & 0xff;
						if ((i_19_ ^ 0xffffffff) != (i_13_ ^ 0xffffffff)
								|| i_20_ != i_17_ || i_22_ != anInt3302)
							return null;
						if (i_21_ < 0
								|| (((long) i_21_ ^ 0xffffffffffffffffL) < (aClass182_3294
										.method1190(-45) / 520L ^ 0xffffffffffffffffL)))
							return null;
						for (int i_23_ = 0; i_23_ < i_18_; i_23_++)
							is[i_16_++] = IOException_Sub1.aByteArray9968[i_23_ + 8];
						i_17_++;
						i_15_ = i_21_;
					}
					return is;
				} catch (java.io.IOException ioexception) {
					return null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mda.E(" + i + ','
					+ i_13_ + ')');
		}
	}

	public static void method1535(int i) {
		do {
			try {
				aClass163_3308 = null;
				aClass83_3301 = null;
				if (i == -28916)
					break;
				aClass163_3308 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "mda.F(" + i + ')');
			}
			break;
		} while (false);
	}

	static final boolean method1536(int i, int i_24_, int i_25_, int i_26_,
			byte i_27_, int i_28_, int i_29_) {
		try {
			anInt3306++;
			int i_30_ = i_25_ + i_29_;
			int i_31_ = i + i_28_;
			int i_32_ = i_24_ + i_26_;
			if (!Class181.method1188(i_29_, i_31_, i_32_, 0, i_29_, i_31_,
					i_30_, i_26_, i_31_, i_32_))
				return false;
			if (!Class181.method1188(i_29_, i_31_, i_32_, 0, i_30_, i_31_,
					i_30_, i_26_, i_31_, i_26_))
				return false;
			if ((Class11_Sub2_Sub25.anInt9333 ^ 0xffffffff) >= (i_29_ ^ 0xffffffff)) {
				if (!Class181.method1188(i_30_, i_31_, i_32_, 0, i_30_, i_28_,
						i_30_, i_32_, i_31_, i_26_))
					return false;
				if (!Class181.method1188(i_30_, i_28_, i_26_, 0, i_30_, i_28_,
						i_30_, i_32_, i_31_, i_26_))
					return false;
			} else {
				if (!Class181.method1188(i_29_, i_31_, i_32_, 0, i_29_, i_28_,
						i_29_, i_32_, i_31_, i_26_))
					return false;
				if (!Class181.method1188(i_29_, i_28_, i_26_, 0, i_29_, i_28_,
						i_29_, i_32_, i_31_, i_26_))
					return false;
			}
			if (i_27_ < 64)
				method1535(-62);
			if ((i_26_ ^ 0xffffffff) > (Class108_Sub3.anInt5330 ^ 0xffffffff)) {
				if (!Class181.method1188(i_29_, i_31_, i_26_, 0, i_29_, i_28_,
						i_30_, i_26_, i_31_, i_26_))
					return false;
				if (!Class181.method1188(i_29_, i_28_, i_26_, 0, i_30_, i_28_,
						i_30_, i_26_, i_31_, i_26_))
					return false;
			} else {
				if (!Class181.method1188(i_29_, i_31_, i_32_, 0, i_29_, i_28_,
						i_30_, i_32_, i_31_, i_32_))
					return false;
				if (!Class181.method1188(i_29_, i_28_, i_32_, 0, i_30_, i_28_,
						i_30_, i_32_, i_31_, i_32_))
					return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mda.B(" + i + ','
					+ i_24_ + ',' + i_25_ + ',' + i_26_ + ',' + i_27_ + ','
					+ i_28_ + ',' + i_29_ + ')'));
		}
	}

	static final boolean method1537(int i, int i_33_, int i_34_, int i_35_,
			int i_36_, Class338 class338, int i_37_, int i_38_, int i_39_,
			int i_40_, int i_41_) {
		try {
			anInt3298++;
			if (i_37_ >= -76)
				method1537(11, -97, -84, 60, 66, null, -46, 29, -65, -74, -67);
			int i_42_ = i;
			int i_43_ = i_35_;
			int i_44_ = 64;
			int i_45_ = 64;
			int i_46_ = -i_44_ + i;
			int i_47_ = -i_45_ + i_35_;
			Class275.anIntArrayArray3703[i_44_][i_45_] = 99;
			Class183.anIntArrayArray2364[i_44_][i_45_] = 0;
			int i_48_ = 0;
			Class275.anIntArray3706[i_48_] = i_42_;
			int i_49_ = 0;
			Class299.anIntArray4038[i_48_++] = i_43_;
			int[][] is = ((Class338) class338).anIntArrayArray4459;
			while (i_49_ != i_48_) {
				i_43_ = Class299.anIntArray4038[i_49_];
				i_42_ = Class275.anIntArray3706[i_49_];
				i_45_ = i_43_ - i_47_;
				i_44_ = i_42_ + -i_46_;
				i_49_ = i_49_ + 1 & 0xfff;
				int i_50_ = -((Class338) class338).anInt4470 + i_42_;
				int i_51_ = i_43_ - ((Class338) class338).anInt4465;
				int i_52_ = i_38_;
				while_79_: do {
					while_78_: do {
						while_77_: do {
							while_76_: do {
								do {
									if (i_52_ != -4) {
										if ((i_52_ ^ 0xffffffff) != 2) {
											if (i_52_ != -2) {
												if (i_52_ != -1) {
													if (i_52_ == 0
															|| i_52_ == 1
															|| i_52_ == 2
															|| (i_52_ ^ 0xffffffff) == -4
															|| ((i_52_ ^ 0xffffffff) == -10))
														break while_77_;
													break while_78_;
												}
											} else
												break;
											break while_76_;
										}
									} else {
										if (((i_33_ ^ 0xffffffff) == (i_42_ ^ 0xffffffff))
												&& ((i_43_ ^ 0xffffffff) == (i_34_ ^ 0xffffffff))) {
											Class189.anInt2435 = i_43_;
											Class304.anInt4094 = i_42_;
											return true;
										}
										break while_79_;
									}
									if (Class11_Sub3.method2284(i_41_, i_33_,
											2, i_43_, i_39_, true, 2, i_42_,
											i_34_)) {
										Class304.anInt4094 = i_42_;
										Class189.anInt2435 = i_43_;
										return true;
									}
									break while_79_;
								} while (false);
								if (class338.method2039(i_39_, i_41_, 2, i_43_,
										i_33_, -1, 2, i_34_, i_40_, i_42_)) {
									Class189.anInt2435 = i_43_;
									Class304.anInt4094 = i_42_;
									return true;
								}
								break while_79_;
							} while (false);
							if (class338.method2038(i_42_, i_39_, i_41_, i_43_,
									i_34_, 2, i_33_, i_40_, false)) {
								Class304.anInt4094 = i_42_;
								Class189.anInt2435 = i_43_;
								return true;
							}
							break while_79_;
						} while (false);
						if (class338.method2045(i_42_, i_43_, i_33_, 2, i_38_,
								i_34_, i_36_, -1)) {
							Class189.anInt2435 = i_43_;
							Class304.anInt4094 = i_42_;
							return true;
						}
						break while_79_;
					} while (false);
					if (class338.method2042(i_34_, i_33_, i_36_, i_42_, i_43_,
							(byte) 99, i_38_, 2)) {
						Class189.anInt2435 = i_43_;
						Class304.anInt4094 = i_42_;
						return true;
					}
				} while (false);
				i_52_ = 1 + Class183.anIntArrayArray2364[i_44_][i_45_];
				if (i_44_ > 0
						&& (Class275.anIntArrayArray3703[i_44_ - 1][i_45_] ^ 0xffffffff) == -1
						&& (is[-1 + i_50_][i_51_] & 0x43a40000) == 0
						&& (is[-1 + i_50_][1 + i_51_] & 0x4e240000) == 0) {
					Class275.anIntArray3706[i_48_] = -1 + i_42_;
					Class299.anIntArray4038[i_48_] = i_43_;
					Class275.anIntArrayArray3703[i_44_ - 1][i_45_] = 2;
					i_48_ = 0xfff & 1 + i_48_;
					Class183.anIntArrayArray2364[-1 + i_44_][i_45_] = i_52_;
				}
				if (i_44_ < 126
						&& Class275.anIntArrayArray3703[1 + i_44_][i_45_] == 0
						&& (is[2 + i_50_][i_51_] & 0x60e40000) == 0
						&& ((is[i_50_ + 2][1 + i_51_] & 0x78240000 ^ 0xffffffff) == -1)) {
					Class275.anIntArray3706[i_48_] = 1 + i_42_;
					Class299.anIntArray4038[i_48_] = i_43_;
					i_48_ = 0xfff & 1 + i_48_;
					Class275.anIntArrayArray3703[i_44_ + 1][i_45_] = 8;
					Class183.anIntArrayArray2364[i_44_ + 1][i_45_] = i_52_;
				}
				if ((i_45_ ^ 0xffffffff) < -1
						&& Class275.anIntArrayArray3703[i_44_][-1 + i_45_] == 0
						&& (is[i_50_][-1 + i_51_] & 0x43a40000) == 0
						&& ((0x60e40000 & is[i_50_ + 1][-1 + i_51_] ^ 0xffffffff) == -1)) {
					Class275.anIntArray3706[i_48_] = i_42_;
					Class299.anIntArray4038[i_48_] = -1 + i_43_;
					i_48_ = 1 + i_48_ & 0xfff;
					Class275.anIntArrayArray3703[i_44_][-1 + i_45_] = 1;
					Class183.anIntArrayArray2364[i_44_][i_45_ - 1] = i_52_;
				}
				if ((i_45_ ^ 0xffffffff) > -127
						&& Class275.anIntArrayArray3703[i_44_][i_45_ + 1] == 0
						&& (is[i_50_][i_51_ + 2] & 0x4e240000 ^ 0xffffffff) == -1
						&& (is[1 + i_50_][i_51_ + 2] & 0x78240000) == 0) {
					Class275.anIntArray3706[i_48_] = i_42_;
					Class299.anIntArray4038[i_48_] = i_43_ + 1;
					Class275.anIntArrayArray3703[i_44_][1 + i_45_] = 4;
					i_48_ = 0xfff & 1 + i_48_;
					Class183.anIntArrayArray2364[i_44_][1 + i_45_] = i_52_;
				}
				if ((i_44_ ^ 0xffffffff) < -1
						&& i_45_ > 0
						&& (Class275.anIntArrayArray3703[i_44_ - 1][i_45_ - 1] ^ 0xffffffff) == -1
						&& (0x4fa40000 & is[i_50_ - 1][i_51_] ^ 0xffffffff) == -1
						&& (is[i_50_ - 1][-1 + i_51_] & 0x43a40000) == 0
						&& ((0x63e40000 & is[i_50_][-1 + i_51_] ^ 0xffffffff) == -1)) {
					Class275.anIntArray3706[i_48_] = -1 + i_42_;
					Class299.anIntArray4038[i_48_] = -1 + i_43_;
					i_48_ = 1 + i_48_ & 0xfff;
					Class275.anIntArrayArray3703[-1 + i_44_][-1 + i_45_] = 3;
					Class183.anIntArrayArray2364[i_44_ - 1][i_45_ - 1] = i_52_;
				}
				if ((i_44_ ^ 0xffffffff) > -127
						&& i_45_ > 0
						&& (Class275.anIntArrayArray3703[1 + i_44_][-1 + i_45_] ^ 0xffffffff) == -1
						&& ((0x63e40000 & is[i_50_ + 1][i_51_ - 1] ^ 0xffffffff) == -1)
						&& (0x60e40000 & is[i_50_ + 2][i_51_ - 1]) == 0
						&& (0x78e40000 & is[2 + i_50_][i_51_]) == 0) {
					Class275.anIntArray3706[i_48_] = 1 + i_42_;
					Class299.anIntArray4038[i_48_] = i_43_ - 1;
					i_48_ = i_48_ + 1 & 0xfff;
					Class275.anIntArrayArray3703[1 + i_44_][i_45_ - 1] = 9;
					Class183.anIntArrayArray2364[i_44_ + 1][i_45_ - 1] = i_52_;
				}
				if (i_44_ > 0
						&& (i_45_ ^ 0xffffffff) > -127
						&& (Class275.anIntArrayArray3703[i_44_ - 1][i_45_ + 1] ^ 0xffffffff) == -1
						&& (is[-1 + i_50_][1 + i_51_] & 0x4fa40000) == 0
						&& (is[i_50_ - 1][2 + i_51_] & 0x4e240000) == 0
						&& ((is[i_50_][i_51_ + 2] & 0x7e240000 ^ 0xffffffff) == -1)) {
					Class275.anIntArray3706[i_48_] = -1 + i_42_;
					Class299.anIntArray4038[i_48_] = 1 + i_43_;
					i_48_ = i_48_ + 1 & 0xfff;
					Class275.anIntArrayArray3703[i_44_ - 1][i_45_ + 1] = 6;
					Class183.anIntArrayArray2364[i_44_ - 1][i_45_ + 1] = i_52_;
				}
				if (i_44_ < 126
						&& i_45_ < 126
						&& (Class275.anIntArrayArray3703[1 + i_44_][1 + i_45_] ^ 0xffffffff) == -1
						&& (is[i_50_ + 1][i_51_ + 2] & 0x7e240000) == 0
						&& (0x78240000 & is[2 + i_50_][2 + i_51_]) == 0
						&& ((0x78e40000 & is[2 + i_50_][1 + i_51_] ^ 0xffffffff) == -1)) {
					Class275.anIntArray3706[i_48_] = i_42_ + 1;
					Class299.anIntArray4038[i_48_] = 1 + i_43_;
					Class275.anIntArrayArray3703[1 + i_44_][1 + i_45_] = 12;
					i_48_ = 0xfff & i_48_ + 1;
					Class183.anIntArrayArray2364[1 + i_44_][i_45_ + 1] = i_52_;
				}
			}
			Class189.anInt2435 = i_43_;
			Class304.anInt4094 = i_42_;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mda.D(" + i + ','
					+ i_33_ + ',' + i_34_ + ',' + i_35_ + ',' + i_36_ + ','
					+ (class338 != null ? "{...}" : "null") + ',' + i_37_ + ','
					+ i_38_ + ',' + i_39_ + ',' + i_40_ + ',' + i_41_ + ')'));
		}
	}

	static final boolean method1538(int i, int i_53_, int i_54_) {
		try {
			anInt3307++;
			if (i_54_ != -6947)
				aClass83_3301 = null;
			if (!((i & 0x40000) != 0 | Class95.method642((byte) 9, i_53_, i))
					&& !Class46.method403(i_53_, i, 55))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mda.G(" + i + ','
					+ i_53_ + ',' + i_54_ + ')'));
		}
	}

	public final String toString() {
		try {
			anInt3295++;
			return "Cache:" + anInt3302;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mda.toString(" + ')');
		}
	}

	static final int method1539(int i, int i_55_) {
		try {
			anInt3300++;
			if (i_55_ != 6)
				method1538(-57, -95, -41);
			return 0x7f & i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mda.C(" + i + ','
					+ i_55_ + ')');
		}
	}

	Class243(int i, Class182 class182, Class182 class182_56_, int i_57_) {
		try {
			anInt3304 = i_57_;
			aClass182_3294 = class182;
			aClass182_3303 = class182_56_;
			anInt3302 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("mda.<init>(" + i + ','
							+ (class182 != null ? "{...}" : "null") + ','
							+ (class182_56_ != null ? "{...}" : "null") + ','
							+ i_57_ + ')'));
		}
	}
}
