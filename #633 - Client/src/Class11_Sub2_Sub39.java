/* Class11_Sub2_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub39 extends Class11_Sub2 {
	int anInt9798;
	private byte[] aByteArray9799 = new byte[512];
	int anInt9800;
	static int anInt9801;
	private short[] aShortArray9802;
	static int anInt9803;
	int anInt9804;
	static int anInt9805;
	boolean aBool9806;
	static int anInt9807 = 0;
	static int anInt9808;
	static int anInt9809;
	static int anInt9810;
	private short[] aShortArray9811;
	int anInt9812;
	static int anInt9813 = -1;
	int anInt9814;
	static int anInt9815 = 0;

	private final int method3855(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_, byte i_5_) {
		try {
			anInt9803++;
			int i_6_ = -26 % ((24 - i_5_) / 61);
			int i_7_ = i_1_ >> 12;
			int i_8_ = i_7_ + 1;
			i_7_ &= 0xff;
			i_1_ &= 0xfff;
			if ((i_0_ ^ 0xffffffff) >= (i_8_ ^ 0xffffffff))
				i_8_ = 0;
			i_8_ &= 0xff;
			int i_9_ = -4096 + i_2_;
			int i_10_ = i_1_ - 4096;
			int i_11_ = Class11_Sub24.anIntArray6239[i_1_];
			int i_12_ = aByteArray9799[i + i_7_] & 0x3;
			int i_13_;
			if ((i_12_ ^ 0xffffffff) >= -2)
				i_13_ = i_12_ != 0 ? i_2_ - i_1_ : i_2_ + i_1_;
			else
				i_13_ = (i_12_ ^ 0xffffffff) == -3 ? i_1_ + -i_2_ : -i_1_
						- i_2_;
			i_12_ = 0x3 & aByteArray9799[i_8_ - -i];
			int i_14_;
			if ((i_12_ ^ 0xffffffff) >= -2)
				i_14_ = i_12_ == 0 ? i_10_ + i_2_ : -i_10_ + i_2_;
			else
				i_14_ = ((i_12_ ^ 0xffffffff) == -3 ? i_10_ + -i_2_ : -i_10_
						- i_2_);
			i_12_ = aByteArray9799[i_4_ + i_7_] & 0x3;
			int i_15_ = i_13_ + ((-i_13_ + i_14_) * i_11_ >> 12);
			if ((i_12_ ^ 0xffffffff) < -2)
				i_13_ = (i_12_ ^ 0xffffffff) == -3 ? -i_9_ + i_1_ : -i_1_
						- i_9_;
			else
				i_13_ = (i_12_ ^ 0xffffffff) != -1 ? i_9_ + -i_1_ : i_1_
						- -i_9_;
			i_12_ = 0x3 & aByteArray9799[i_8_ - -i_4_];
			if (i_12_ > 1)
				i_14_ = ((i_12_ ^ 0xffffffff) != -3 ? -i_10_ + -i_9_ : i_10_
						- i_9_);
			else
				i_14_ = (i_12_ ^ 0xffffffff) == -1 ? i_10_ + i_9_ : i_9_
						- i_10_;
			int i_16_ = ((-i_13_ + i_14_) * i_11_ >> 12) + i_13_;
			return i_15_ + (i_3_ * (i_16_ + -i_15_) >> 12);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("taa.C(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ')'));
		}
	}

	final int[] method2254(int i, boolean bool) {
		try {
			anInt9808++;
			if (bool != true)
				((Class11_Sub2_Sub39) this).anInt9804 = -126;
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421)
				method3857(!bool, i, is);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "taa.A(" + i + ','
					+ bool + ')');
		}
	}

	private final void method3856(int i) {
		do {
			try {
				anInt9805++;
				if (i >= -43)
					((Class11_Sub2_Sub39) this).anInt9798 = 115;
				if (((Class11_Sub2_Sub39) this).anInt9814 > 0) {
					aShortArray9811 = new short[((Class11_Sub2_Sub39) this).anInt9800];
					aShortArray9802 = new short[((Class11_Sub2_Sub39) this).anInt9800];
					for (int i_17_ = 0; ((i_17_ ^ 0xffffffff) > (((Class11_Sub2_Sub39) this).anInt9800 ^ 0xffffffff)); i_17_++) {
						aShortArray9811[i_17_] = (short) (int) ((Math
								.pow((double) ((float) (((Class11_Sub2_Sub39) this).anInt9814) / 4096.0F),
										(double) i_17_)) * 4096.0);
						aShortArray9802[i_17_] = (short) (int) Math.pow(2.0,
								(double) i_17_);
					}
				} else {
					if (aShortArray9811 == null
							|| ((aShortArray9811.length ^ 0xffffffff) != (((Class11_Sub2_Sub39) this).anInt9800 ^ 0xffffffff)))
						break;
					aShortArray9802 = new short[((Class11_Sub2_Sub39) this).anInt9800];
					for (int i_18_ = 0; ((i_18_ ^ 0xffffffff) > (((Class11_Sub2_Sub39) this).anInt9800 ^ 0xffffffff)); i_18_++)
						aShortArray9802[i_18_] = (short) (int) Math.pow(2.0,
								(double) i_18_);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "taa.E(" + i + ')');
			}
			break;
		} while (false);
	}

	public Class11_Sub2_Sub39() {
		super(0, true);
		((Class11_Sub2_Sub39) this).anInt9798 = 4;
		((Class11_Sub2_Sub39) this).anInt9800 = 4;
		((Class11_Sub2_Sub39) this).aBool9806 = true;
		((Class11_Sub2_Sub39) this).anInt9804 = 4;
		((Class11_Sub2_Sub39) this).anInt9812 = 0;
		((Class11_Sub2_Sub39) this).anInt9814 = 1638;
	}

	final void method3857(boolean bool, int i, int[] is) {
		try {
			anInt9809++;
			int i_19_ = (((Class11_Sub2_Sub39) this).anInt9798 * Class171.anIntArray2199[i]);
			if (bool == false) {
				if (((Class11_Sub2_Sub39) this).anInt9800 != 1) {
					int i_20_ = aShortArray9811[0];
					if (i_20_ > 8 || i_20_ < -8) {
						int i_21_ = aShortArray9802[0] << 12;
						int i_22_ = i_19_ * i_21_ >> 12;
						int i_23_ = (i_21_
								* ((Class11_Sub2_Sub39) this).anInt9804 >> 12);
						int i_24_ = (((Class11_Sub2_Sub39) this).anInt9798
								* i_21_ >> 12);
						int i_25_ = i_22_ >> 12;
						int i_26_ = i_25_ + 1;
						if (i_26_ >= i_24_)
							i_26_ = 0;
						i_22_ &= 0xfff;
						int i_27_ = 0xff & aByteArray9799[i_25_ & 0xff];
						int i_28_ = aByteArray9799[0xff & i_26_] & 0xff;
						int i_29_ = Class11_Sub24.anIntArray6239[i_22_];
						for (int i_30_ = 0; ((i_30_ ^ 0xffffffff) > (Class33_Sub2.anInt6696 ^ 0xffffffff)); i_30_++) {
							int i_31_ = (((Class11_Sub2_Sub39) this).anInt9804 * Class208.anIntArray2808[i_30_]);
							int i_32_ = method3855(i_27_, i_23_,
									i_31_ * i_21_ >> 12, i_22_, i_29_, i_28_,
									(byte) -121);
							is[i_30_] = i_32_ * i_20_ >> 12;
						}
					}
					for (int i_33_ = 1; ((i_33_ ^ 0xffffffff) > (((Class11_Sub2_Sub39) this).anInt9800 ^ 0xffffffff)); i_33_++) {
						i_20_ = aShortArray9811[i_33_];
						if (i_20_ > 8 || i_20_ < -8) {
							int i_34_ = aShortArray9802[i_33_] << 12;
							int i_35_ = ((((Class11_Sub2_Sub39) this).anInt9804 * i_34_) >> 12);
							int i_36_ = (i_34_
									* (((Class11_Sub2_Sub39) this).anInt9798) >> 12);
							int i_37_ = i_34_ * i_19_ >> 12;
							int i_38_ = i_37_ >> 12;
							int i_39_ = 1 + i_38_;
							i_37_ &= 0xfff;
							if ((i_36_ ^ 0xffffffff) >= (i_39_ ^ 0xffffffff))
								i_39_ = 0;
							int i_40_ = Class11_Sub24.anIntArray6239[i_37_];
							int i_41_ = aByteArray9799[0xff & i_38_] & 0xff;
							int i_42_ = aByteArray9799[i_39_ & 0xff] & 0xff;
							if (((Class11_Sub2_Sub39) this).aBool9806
									&& ((i_33_ ^ 0xffffffff) == ((((Class11_Sub2_Sub39) this).anInt9800 - 1) ^ 0xffffffff))) {
								for (int i_43_ = 0; ((i_43_ ^ 0xffffffff) > (Class33_Sub2.anInt6696 ^ 0xffffffff)); i_43_++) {
									int i_44_ = (Class208.anIntArray2808[i_43_] * (((Class11_Sub2_Sub39) this).anInt9804));
									int i_45_ = method3855(i_41_, i_35_, i_34_
											* i_44_ >> 12, i_37_, i_40_, i_42_,
											(byte) -114);
									i_45_ = is[i_43_] + (i_45_ * i_20_ >> 12);
									is[i_43_] = 2048 + (i_45_ >> 1);
								}
							} else {
								for (int i_46_ = 0; i_46_ < Class33_Sub2.anInt6696; i_46_++) {
									int i_47_ = ((((Class11_Sub2_Sub39) this).anInt9804) * Class208.anIntArray2808[i_46_]);
									int i_48_ = method3855(i_41_, i_35_, i_34_
											* i_47_ >> 12, i_37_, i_40_, i_42_,
											(byte) -99);
									is[i_46_] += i_20_ * i_48_ >> 12;
								}
							}
						}
					}
				} else {
					int i_49_ = aShortArray9802[0] << 12;
					int i_50_ = aShortArray9811[0];
					int i_51_ = i_49_ * i_19_ >> 12;
					int i_52_ = ((Class11_Sub2_Sub39) this).anInt9798 * i_49_ >> 12;
					int i_53_ = ((Class11_Sub2_Sub39) this).anInt9804 * i_49_ >> 12;
					int i_54_ = i_51_ >> 12;
					int i_55_ = i_54_ + 1;
					if (i_55_ >= i_52_)
						i_55_ = 0;
					i_51_ &= 0xfff;
					int i_56_ = Class11_Sub24.anIntArray6239[i_51_];
					int i_57_ = aByteArray9799[0xff & i_54_] & 0xff;
					int i_58_ = aByteArray9799[i_55_ & 0xff] & 0xff;
					if (((Class11_Sub2_Sub39) this).aBool9806) {
						for (int i_59_ = 0; ((i_59_ ^ 0xffffffff) > (Class33_Sub2.anInt6696 ^ 0xffffffff)); i_59_++) {
							int i_60_ = (((Class11_Sub2_Sub39) this).anInt9804 * Class208.anIntArray2808[i_59_]);
							int i_61_ = method3855(i_57_, i_53_,
									i_49_ * i_60_ >> 12, i_51_, i_56_, i_58_,
									(byte) 109);
							i_61_ = i_61_ * i_50_ >> 12;
							is[i_59_] = 2048 - -(i_61_ >> 1);
						}
					} else {
						for (int i_62_ = 0; ((i_62_ ^ 0xffffffff) > (Class33_Sub2.anInt6696 ^ 0xffffffff)); i_62_++) {
							int i_63_ = (((Class11_Sub2_Sub39) this).anInt9804 * Class208.anIntArray2808[i_62_]);
							int i_64_ = method3855(i_57_, i_53_,
									i_49_ * i_63_ >> 12, i_51_, i_56_, i_58_,
									(byte) 95);
							is[i_62_] = i_64_ * i_50_ >> 12;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("taa.F(" + bool + ','
					+ i + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2263(int i, Stream stream, int i_65_) {
		try {
			int i_66_ = i_65_;
			while_143_: do {
				while_142_: do {
					while_141_: do {
						while_140_: do {
							while_139_: do {
								do {
									if ((i_66_ ^ 0xffffffff) != -1) {
										if (i_66_ != 1) {
											if (i_66_ != 2) {
												if (i_66_ != 3) {
													if ((i_66_ ^ 0xffffffff) != -5) {
														if (i_66_ != 5) {
															if (i_66_ == 6)
																break while_142_;
															break while_143_;
														}
													} else
														break while_140_;
													break while_141_;
												}
											} else
												break;
											break while_139_;
										}
									} else {
										((Class11_Sub2_Sub39) this).aBool9806 = (stream
												.readUnsignedByte((byte) 35) == 1);
										break while_143_;
									}
									((Class11_Sub2_Sub39) this).anInt9800 = stream
											.readUnsignedByte((byte) 35);
									break while_143_;
								} while (false);
								((Class11_Sub2_Sub39) this).anInt9814 = stream
										.method2508((byte) -94);
								if ((((Class11_Sub2_Sub39) this).anInt9814 ^ 0xffffffff) > -1) {
									aShortArray9811 = new short[((Class11_Sub2_Sub39) this).anInt9800];
									for (i_66_ = 0; (((Class11_Sub2_Sub39) this).anInt9800 > i_66_); i_66_++)
										aShortArray9811[i_66_] = (short) (stream
												.method2508((byte) -123));
								}
								break while_143_;
							} while (false);
							((Class11_Sub2_Sub39) this).anInt9804 = ((Class11_Sub2_Sub39) this).anInt9798 = stream
									.readUnsignedByte((byte) 35);
							break while_143_;
						} while (false);
						((Class11_Sub2_Sub39) this).anInt9812 = stream
								.readUnsignedByte((byte) 35);
						break while_143_;
					} while (false);
					((Class11_Sub2_Sub39) this).anInt9804 = stream
							.readUnsignedByte((byte) 35);
					break while_143_;
				} while (false);
				((Class11_Sub2_Sub39) this).anInt9798 = stream
						.readUnsignedByte((byte) 35);
			} while (false);
			if (i == 3731)
				anInt9801++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("taa.B(" + i + ','
					+ (stream != null ? "{...}" : "null") + ',' + i_65_ + ')'));
		}
	}

	final void method2256(int i) {
		while_144_: do {
			try {
				aByteArray9799 = Class210.method1349((byte) 69,
						(((Class11_Sub2_Sub39) this).anInt9812));
				anInt9810++;
				if (i != 7)
					method2256(-53);
				method3856(i - 123);
				for (int i_67_ = -1 + ((Class11_Sub2_Sub39) this).anInt9800; (i_67_ ^ 0xffffffff) <= -2; i_67_--) {
					short i_68_ = aShortArray9811[i_67_];
					if ((i_68_ ^ 0xffffffff) < -9)
						break while_144_;
					if ((i_68_ ^ 0xffffffff) > 7)
						break;
					((Class11_Sub2_Sub39) this).anInt9800--;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "taa.D(" + i + ')');
			}
			break;
		} while (false);
	}
}
