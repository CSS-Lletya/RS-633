/* Class11_Sub2_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class11_Sub2_Sub29 extends Class11_Sub2 {
	static Object anObject9467;
	private int anInt9468;
	static float aFloat9469;
	private int anInt9470 = 2000;
	private int anInt9471;
	static int anInt9472;
	private int anInt9473;
	static boolean aBool9474 = false;
	static int anInt9475;
	private int anInt9476 = 4096;
	static int anInt9477;
	static int anInt9478;
	static int anInt9479;

	final void method2256(int i) {
		try {
			if (i != 7)
				anInt9471 = -51;
			anInt9478++;
			Class234_Sub1_Sub1.method3829(false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qi.D(" + i + ')');
		}
	}

	final void method2263(int i, Stream stream, int i_0_) {
		try {
			if (i != 3731)
				method2263(-90, null, -29);
			int i_1_ = i_0_;
			while_152_: do {
				while_151_: do {
					while_150_: do {
						do {
							if (i_1_ != 0) {
								if ((i_1_ ^ 0xffffffff) != -2) {
									if (i_1_ != 2) {
										if ((i_1_ ^ 0xffffffff) != -4) {
											if ((i_1_ ^ 0xffffffff) == -5)
												break while_151_;
											break while_152_;
										}
									} else
										break;
									break while_150_;
								}
							} else {
								anInt9473 = stream.readUnsignedByte((byte) 35);
								break while_152_;
							}
							anInt9470 = stream.readUnsignedShort((byte) -65);
							break while_152_;
						} while (false);
						anInt9471 = stream.readUnsignedByte((byte) 35);
						break while_152_;
					} while (false);
					anInt9468 = stream.readUnsignedShort((byte) -65);
					break while_152_;
				} while (false);
				anInt9476 = stream.readUnsignedShort((byte) -65);
			} while (false);
			anInt9475++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qi.B(" + i + ','
					+ (stream != null ? "{...}" : "null") + ',' + i_0_ + ')'));
		}
	}

	final int[] method2254(int i, boolean bool) {
		try {
			anInt9472++;
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (bool != true)
				aBool9474 = true;
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
				int i_2_ = anInt9476 >> 1;
				int[][] is_3_ = ((Class11_Sub2) this).aClass105_5043
						.method692(true);
				Random random = new Random((long) anInt9473);
				for (int i_4_ = 0; i_4_ < anInt9470; i_4_++) {
					int i_5_ = (anInt9476 > 0 ? (anInt9468
							- -Class302.method1863(anInt9476, random,
									(byte) -119) - i_2_) : anInt9468);
					i_5_ = (0xff2 & i_5_) >> 4;
					int i_6_ = Class302.method1863(Class33_Sub2.anInt6696,
							random, (byte) -119);
					int i_7_ = Class302.method1863(Class29.anInt398, random,
							(byte) -119);
					int i_8_ = ((Class191.anIntArray2457[i_5_] * anInt9471 >> 12) + i_6_);
					int i_9_ = ((Class11_Sub19.anIntArray5818[i_5_] * anInt9471 >> 12) + i_7_);
					int i_10_ = -i_7_ + i_9_;
					int i_11_ = -i_6_ + i_8_;
					if ((i_11_ ^ 0xffffffff) != -1
							|| (i_10_ ^ 0xffffffff) != -1) {
						if (i_11_ < 0)
							i_11_ = -i_11_;
						if ((i_10_ ^ 0xffffffff) > -1)
							i_10_ = -i_10_;
						boolean bool_12_ = i_10_ > i_11_;
						if (bool_12_) {
							int i_13_ = i_6_;
							i_6_ = i_7_;
							int i_14_ = i_8_;
							i_7_ = i_13_;
							i_8_ = i_9_;
							i_9_ = i_14_;
						}
						if ((i_6_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff)) {
							int i_15_ = i_6_;
							int i_16_ = i_7_;
							i_6_ = i_8_;
							i_8_ = i_15_;
							i_7_ = i_9_;
							i_9_ = i_16_;
						}
						int i_17_ = i_7_;
						int i_18_ = -i_6_ + i_8_;
						int i_19_ = -i_7_ + i_9_;
						int i_20_ = -i_18_ / 2;
						int i_21_ = 2048 / i_18_;
						int i_22_ = 1024 - (Class302.method1863(4096, random,
								(byte) -119) >> 2);
						if ((i_19_ ^ 0xffffffff) > -1)
							i_19_ = -i_19_;
						int i_23_ = i_7_ < i_9_ ? 1 : -1;
						for (int i_24_ = i_6_; (i_8_ ^ 0xffffffff) < (i_24_ ^ 0xffffffff); i_24_++) {
							int i_25_ = (i_24_ + -i_6_) * i_21_
									+ (1024 + i_22_);
							int i_26_ = Class297.anInt4024 & i_24_;
							int i_27_ = i_17_
									& Class11_Sub45_Sub16_Sub2.anInt10167;
							i_20_ += i_19_;
							if (bool_12_)
								is_3_[i_27_][i_26_] = i_25_;
							else
								is_3_[i_26_][i_27_] = i_25_;
							if ((i_20_ ^ 0xffffffff) < -1) {
								i_17_ = i_23_ + i_17_;
								i_20_ = -i_18_ + i_20_;
							}
						}
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qi.A(" + i + ','
					+ bool + ')');
		}
	}

	public static void method3732(int i) {
		try {
			if (i != -1)
				method3733(-17, 83, null, -122, 38, -16, 39, 123, -6, -57, 1);
			anObject9467 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qi.C(" + i + ')');
		}
	}

	static final boolean method3733(int i, int i_28_, Class338 class338,
			int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_,
			int i_35_, int i_36_) {
		try {
			anInt9479++;
			int i_37_ = i;
			int i_38_ = i_33_;
			int i_39_ = 64;
			int i_40_ = 64;
			int i_41_ = i - i_39_;
			if (i_35_ < 111)
				method3732(17);
			int i_42_ = -i_40_ + i_33_;
			Class275.anIntArrayArray3703[i_39_][i_40_] = 99;
			Class183.anIntArrayArray2364[i_39_][i_40_] = 0;
			int i_43_ = 0;
			Class275.anIntArray3706[i_43_] = i_37_;
			int i_44_ = 0;
			Class299.anIntArray4038[i_43_++] = i_38_;
			int[][] is = ((Class338) class338).anIntArrayArray4459;
			while ((i_44_ ^ 0xffffffff) != (i_43_ ^ 0xffffffff)) {
				i_37_ = Class275.anIntArray3706[i_44_];
				i_38_ = Class299.anIntArray4038[i_44_];
				int i_45_ = -((Class338) class338).anInt4470 + i_37_;
				i_40_ = i_38_ - i_42_;
				i_39_ = -i_41_ + i_37_;
				i_44_ = 0xfff & 1 + i_44_;
				int i_46_ = -((Class338) class338).anInt4465 + i_38_;
				int i_47_ = i_28_;
				while_156_: do {
					while_155_: do {
						while_154_: do {
							while_153_: do {
								do {
									if ((i_47_ ^ 0xffffffff) != 3) {
										if (i_47_ != -3) {
											if ((i_47_ ^ 0xffffffff) != 1) {
												if (i_47_ != -1) {
													if (((i_47_ ^ 0xffffffff) == -1)
															|| (i_47_ ^ 0xffffffff) == -2
															|| i_47_ == 2
															|| i_47_ == 3
															|| i_47_ == 9)
														break while_154_;
													break while_155_;
												}
											} else
												break;
											break while_153_;
										}
									} else {
										if (((i_31_ ^ 0xffffffff) == (i_37_ ^ 0xffffffff))
												&& ((i_36_ ^ 0xffffffff) == (i_38_ ^ 0xffffffff))) {
											Class304.anInt4094 = i_37_;
											Class189.anInt2435 = i_38_;
											return true;
										}
										break while_156_;
									}
									if (Class11_Sub3.method2284(i_29_, i_31_,
											1, i_38_, i_34_, true, 1, i_37_,
											i_36_)) {
										Class304.anInt4094 = i_37_;
										Class189.anInt2435 = i_38_;
										return true;
									}
									break while_156_;
								} while (false);
								if (class338.method2039(i_34_, i_29_, 1, i_38_,
										i_31_, -1, 1, i_36_, i_30_, i_37_)) {
									Class189.anInt2435 = i_38_;
									Class304.anInt4094 = i_37_;
									return true;
								}
								break while_156_;
							} while (false);
							if (class338.method2038(i_37_, i_34_, i_29_, i_38_,
									i_36_, 1, i_31_, i_30_, false)) {
								Class304.anInt4094 = i_37_;
								Class189.anInt2435 = i_38_;
								return true;
							}
							break while_156_;
						} while (false);
						if (class338.method2045(i_37_, i_38_, i_31_, 1, i_28_,
								i_36_, i_32_, -1)) {
							Class189.anInt2435 = i_38_;
							Class304.anInt4094 = i_37_;
							return true;
						}
						break while_156_;
					} while (false);
					if (class338.method2042(i_36_, i_31_, i_32_, i_37_, i_38_,
							(byte) -85, i_28_, 1)) {
						Class304.anInt4094 = i_37_;
						Class189.anInt2435 = i_38_;
						return true;
					}
				} while (false);
				i_47_ = 1 + Class183.anIntArrayArray2364[i_39_][i_40_];
				if ((i_39_ ^ 0xffffffff) < -1
						&& Class275.anIntArrayArray3703[i_39_ - 1][i_40_] == 0
						&& ((is[i_45_ - 1][i_46_] & 0x42240000 ^ 0xffffffff) == -1)) {
					Class275.anIntArray3706[i_43_] = i_37_ - 1;
					Class299.anIntArray4038[i_43_] = i_38_;
					i_43_ = i_43_ + 1 & 0xfff;
					Class275.anIntArrayArray3703[-1 + i_39_][i_40_] = 2;
					Class183.anIntArrayArray2364[i_39_ - 1][i_40_] = i_47_;
				}
				if (i_39_ < 127
						&& Class275.anIntArrayArray3703[1 + i_39_][i_40_] == 0
						&& (is[1 + i_45_][i_46_] & 0x60240000) == 0) {
					Class275.anIntArray3706[i_43_] = i_37_ + 1;
					Class299.anIntArray4038[i_43_] = i_38_;
					i_43_ = 1 + i_43_ & 0xfff;
					Class275.anIntArrayArray3703[1 + i_39_][i_40_] = 8;
					Class183.anIntArrayArray2364[i_39_ + 1][i_40_] = i_47_;
				}
				if ((i_40_ ^ 0xffffffff) < -1
						&& Class275.anIntArrayArray3703[i_39_][-1 + i_40_] == 0
						&& (0x40a40000 & is[i_45_][i_46_ - 1]) == 0) {
					Class275.anIntArray3706[i_43_] = i_37_;
					Class299.anIntArray4038[i_43_] = i_38_ - 1;
					i_43_ = 0xfff & i_43_ + 1;
					Class275.anIntArrayArray3703[i_39_][i_40_ - 1] = 1;
					Class183.anIntArrayArray2364[i_39_][-1 + i_40_] = i_47_;
				}
				if ((i_40_ ^ 0xffffffff) > -128
						&& (Class275.anIntArrayArray3703[i_39_][i_40_ + 1] ^ 0xffffffff) == -1
						&& (0x48240000 & is[i_45_][1 + i_46_]) == 0) {
					Class275.anIntArray3706[i_43_] = i_37_;
					Class299.anIntArray4038[i_43_] = 1 + i_38_;
					i_43_ = i_43_ + 1 & 0xfff;
					Class275.anIntArrayArray3703[i_39_][i_40_ + 1] = 4;
					Class183.anIntArrayArray2364[i_39_][1 + i_40_] = i_47_;
				}
				if (i_39_ > 0
						&& (i_40_ ^ 0xffffffff) < -1
						&& (Class275.anIntArrayArray3703[-1 + i_39_][-1 + i_40_] ^ 0xffffffff) == -1
						&& (0x43a40000 & is[-1 + i_45_][-1 + i_46_]) == 0
						&& (0x42240000 & is[i_45_ - 1][i_46_] ^ 0xffffffff) == -1
						&& (is[i_45_][i_46_ - 1] & 0x40a40000) == 0) {
					Class275.anIntArray3706[i_43_] = -1 + i_37_;
					Class299.anIntArray4038[i_43_] = -1 + i_38_;
					i_43_ = i_43_ + 1 & 0xfff;
					Class275.anIntArrayArray3703[-1 + i_39_][-1 + i_40_] = 3;
					Class183.anIntArrayArray2364[i_39_ - 1][-1 + i_40_] = i_47_;
				}
				if ((i_39_ ^ 0xffffffff) > -128
						&& (i_40_ ^ 0xffffffff) < -1
						&& (Class275.anIntArrayArray3703[1 + i_39_][-1 + i_40_] ^ 0xffffffff) == -1
						&& ((is[i_45_ + 1][-1 + i_46_] & 0x60e40000 ^ 0xffffffff) == -1)
						&& (is[i_45_ + 1][i_46_] & 0x60240000 ^ 0xffffffff) == -1
						&& (is[i_45_][-1 + i_46_] & 0x40a40000) == 0) {
					Class275.anIntArray3706[i_43_] = 1 + i_37_;
					Class299.anIntArray4038[i_43_] = i_38_ - 1;
					i_43_ = i_43_ + 1 & 0xfff;
					Class275.anIntArrayArray3703[1 + i_39_][-1 + i_40_] = 9;
					Class183.anIntArrayArray2364[i_39_ + 1][-1 + i_40_] = i_47_;
				}
				if (i_39_ > 0
						&& i_40_ < 127
						&& (Class275.anIntArrayArray3703[-1 + i_39_][1 + i_40_] ^ 0xffffffff) == -1
						&& ((0x4e240000 & is[-1 + i_45_][1 + i_46_] ^ 0xffffffff) == -1)
						&& (0x42240000 & is[i_45_ - 1][i_46_]) == 0
						&& ((is[i_45_][i_46_ + 1] & 0x48240000 ^ 0xffffffff) == -1)) {
					Class275.anIntArray3706[i_43_] = i_37_ - 1;
					Class299.anIntArray4038[i_43_] = i_38_ + 1;
					i_43_ = 1 + i_43_ & 0xfff;
					Class275.anIntArrayArray3703[i_39_ - 1][i_40_ + 1] = 6;
					Class183.anIntArrayArray2364[-1 + i_39_][i_40_ + 1] = i_47_;
				}
				if ((i_39_ ^ 0xffffffff) > -128
						&& i_40_ < 127
						&& Class275.anIntArrayArray3703[i_39_ + 1][i_40_ + 1] == 0
						&& (0x78240000 & is[1 + i_45_][i_46_ + 1]) == 0
						&& (is[1 + i_45_][i_46_] & 0x60240000) == 0
						&& (0x48240000 & is[i_45_][1 + i_46_]) == 0) {
					Class275.anIntArray3706[i_43_] = 1 + i_37_;
					Class299.anIntArray4038[i_43_] = 1 + i_38_;
					i_43_ = i_43_ + 1 & 0xfff;
					Class275.anIntArrayArray3703[i_39_ + 1][1 + i_40_] = 12;
					Class183.anIntArrayArray2364[1 + i_39_][1 + i_40_] = i_47_;
				}
			}
			Class304.anInt4094 = i_37_;
			Class189.anInt2435 = i_38_;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qi.E(" + i + ','
					+ i_28_ + ',' + (class338 != null ? "{...}" : "null") + ','
					+ i_29_ + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ','
					+ i_33_ + ',' + i_34_ + ',' + i_35_ + ',' + i_36_ + ')'));
		}
	}

	public Class11_Sub2_Sub29() {
		super(0, true);
		anInt9471 = 16;
		anInt9473 = 0;
		anInt9468 = 0;
	}
}
