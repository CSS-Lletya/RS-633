/* Class11_Sub45_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub45_Sub1_Sub2 extends Class11_Sub45_Sub1 {
	int anInt9872;
	int anInt9873;
	static int anInt9874;
	int anInt9875;
	static int anInt9876;
	static boolean aBool9877 = false;
	static int[] anIntArray9878;
	static int anInt9879;
	static int anInt9880 = 100;
	byte[] aByteArray9881;
	static int anInt9882;
	int anInt9883;
	static int anInt9884 = 0;
	static int anInt9885;
	static Class146 aClass146_9886;
	static int anInt9887;

	final boolean method3874(int i, int i_0_, byte i_1_) {
		try {
			int i_2_ = 25 / ((i_1_ - 11) / 34);
			anInt9874++;
			if (i * i_0_ > ((Class11_Sub45_Sub1_Sub2) this).aByteArray9881.length)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lba.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method3875(int i, int i_3_, int i_4_, int i_5_, int i_6_) {
		try {
			((Class11_Sub45_Sub1_Sub2) this).anInt9875 = -i_6_ + i_3_;
			((Class11_Sub45_Sub1_Sub2) this).anInt9872 = i_5_ - i;
			anInt9879++;
			if (i_4_ == 0) {
				((Class11_Sub45_Sub1_Sub2) this).anInt9883 = i;
				((Class11_Sub45_Sub1_Sub2) this).anInt9873 = i_6_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lba.D(" + i + ','
					+ i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	public static void method3876(int i) {
		try {
			if (i != 230)
				anInt9884 = -95;
			anIntArray9878 = null;
			aClass146_9886 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lba.B(" + i + ')');
		}
	}

	final void method3877(int i) {
		try {
			anInt9887++;
			if (i >= 81) {
				int i_7_ = -1;
				int i_8_ = (((Class11_Sub45_Sub1_Sub2) this).aByteArray9881.length - 8);
				while (i_8_ > i_7_) {
					((Class11_Sub45_Sub1_Sub2) this).aByteArray9881[++i_7_] = (byte) 0;
					((Class11_Sub45_Sub1_Sub2) this).aByteArray9881[++i_7_] = (byte) 0;
					((Class11_Sub45_Sub1_Sub2) this).aByteArray9881[++i_7_] = (byte) 0;
					((Class11_Sub45_Sub1_Sub2) this).aByteArray9881[++i_7_] = (byte) 0;
					((Class11_Sub45_Sub1_Sub2) this).aByteArray9881[++i_7_] = (byte) 0;
					((Class11_Sub45_Sub1_Sub2) this).aByteArray9881[++i_7_] = (byte) 0;
					((Class11_Sub45_Sub1_Sub2) this).aByteArray9881[++i_7_] = (byte) 0;
					((Class11_Sub45_Sub1_Sub2) this).aByteArray9881[++i_7_] = (byte) 0;
				}
				while (i_7_ < -1
						+ (((Class11_Sub45_Sub1_Sub2) this).aByteArray9881).length)
					((Class11_Sub45_Sub1_Sub2) this).aByteArray9881[++i_7_] = (byte) 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lba.E(" + i + ')');
		}
	}

	final void method3878(int i, int i_9_, int i_10_, int i_11_, int i_12_,
			int i_13_, int i_14_) {
		try {
			anInt9882++;
			if (i_11_ > -93)
				method3877(88);
			int i_15_ = 0;
			if ((i_12_ ^ 0xffffffff) != (i_13_ ^ 0xffffffff))
				i_15_ = (i_9_ + -i << 16) / (i_13_ - i_12_);
			int i_16_ = 0;
			if (i_14_ != i_13_)
				i_16_ = (-i_9_ + i_10_ << 16) / (i_14_ + -i_13_);
			int i_17_ = 0;
			if ((i_14_ ^ 0xffffffff) != (i_12_ ^ 0xffffffff))
				i_17_ = (-i_10_ + i << 16) / (-i_14_ + i_12_);
			if (i_13_ >= i_12_ && (i_14_ ^ 0xffffffff) <= (i_12_ ^ 0xffffffff)) {
				if ((i_13_ ^ 0xffffffff) <= (i_14_ ^ 0xffffffff)) {
					i_9_ = i <<= 16;
					i_10_ <<= 16;
					if (i_12_ < 0) {
						i -= i_12_ * i_15_;
						i_9_ -= i_17_ * i_12_;
						i_12_ = 0;
					}
					if (i_14_ < 0) {
						i_10_ -= i_14_ * i_16_;
						i_14_ = 0;
					}
					if (((i_12_ ^ 0xffffffff) == (i_14_ ^ 0xffffffff) || i_15_ <= i_17_)
							&& ((i_14_ ^ 0xffffffff) != (i_12_ ^ 0xffffffff) || (i_16_ ^ 0xffffffff) >= (i_15_ ^ 0xffffffff))) {
						i_13_ -= i_14_;
						i_14_ -= i_12_;
						i_12_ = (((Class11_Sub45_Sub1_Sub2) this).anInt9872 * i_12_);
						while ((--i_14_ ^ 0xffffffff) <= -1) {
							Class11_Sub2_Sub35
									.method3837(
											i >> 16,
											i_9_ >> 16,
											0,
											i_12_,
											(((Class11_Sub45_Sub1_Sub2) this).aByteArray9881),
											-1212415540);
							i += i_15_;
							i_12_ += ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
							i_9_ += i_17_;
						}
						while ((--i_13_ ^ 0xffffffff) <= -1) {
							Class11_Sub2_Sub35
									.method3837(
											i >> 16,
											i_10_ >> 16,
											0,
											i_12_,
											(((Class11_Sub45_Sub1_Sub2) this).aByteArray9881),
											-1212415540);
							i += i_15_;
							i_10_ += i_16_;
							i_12_ += ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
						}
					} else {
						i_13_ -= i_14_;
						i_14_ -= i_12_;
						i_12_ = (((Class11_Sub45_Sub1_Sub2) this).anInt9872 * i_12_);
						while (--i_14_ >= 0) {
							Class11_Sub2_Sub35
									.method3837(
											i_9_ >> 16,
											i >> 16,
											0,
											i_12_,
											(((Class11_Sub45_Sub1_Sub2) this).aByteArray9881),
											-1212415540);
							i_12_ += ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
							i += i_15_;
							i_9_ += i_17_;
						}
						while ((--i_13_ ^ 0xffffffff) <= -1) {
							Class11_Sub2_Sub35
									.method3837(
											i_10_ >> 16,
											i >> 16,
											0,
											i_12_,
											(((Class11_Sub45_Sub1_Sub2) this).aByteArray9881),
											-1212415540);
							i_12_ += ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
							i += i_15_;
							i_10_ += i_16_;
						}
					}
				} else {
					i_10_ = i <<= 16;
					if ((i_12_ ^ 0xffffffff) > -1) {
						i -= i_15_ * i_12_;
						i_10_ -= i_12_ * i_17_;
						i_12_ = 0;
					}
					i_9_ <<= 16;
					if (i_13_ < 0) {
						i_9_ -= i_16_ * i_13_;
						i_13_ = 0;
					}
					if (i_12_ != i_13_
							&& (i_17_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff)
							|| (i_12_ == i_13_ && (i_17_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff))) {
						i_14_ -= i_13_;
						i_13_ -= i_12_;
						i_12_ *= ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
						while ((--i_13_ ^ 0xffffffff) <= -1) {
							Class11_Sub2_Sub35
									.method3837(
											i_10_ >> 16,
											i >> 16,
											0,
											i_12_,
											(((Class11_Sub45_Sub1_Sub2) this).aByteArray9881),
											-1212415540);
							i_12_ += ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
							i_10_ += i_17_;
							i += i_15_;
						}
						while ((--i_14_ ^ 0xffffffff) <= -1) {
							Class11_Sub2_Sub35
									.method3837(
											i_10_ >> 16,
											i_9_ >> 16,
											0,
											i_12_,
											(((Class11_Sub45_Sub1_Sub2) this).aByteArray9881),
											-1212415540);
							i_10_ += i_17_;
							i_12_ += ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
							i_9_ += i_16_;
						}
					} else {
						i_14_ -= i_13_;
						i_13_ -= i_12_;
						i_12_ = (((Class11_Sub45_Sub1_Sub2) this).anInt9872 * i_12_);
						while ((--i_13_ ^ 0xffffffff) <= -1) {
							Class11_Sub2_Sub35
									.method3837(
											i >> 16,
											i_10_ >> 16,
											0,
											i_12_,
											(((Class11_Sub45_Sub1_Sub2) this).aByteArray9881),
											-1212415540);
							i += i_15_;
							i_10_ += i_17_;
							i_12_ += ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
						}
						while ((--i_14_ ^ 0xffffffff) <= -1) {
							Class11_Sub2_Sub35
									.method3837(
											i_9_ >> 16,
											i_10_ >> 16,
											0,
											i_12_,
											(((Class11_Sub45_Sub1_Sub2) this).aByteArray9881),
											-1212415540);
							i_9_ += i_16_;
							i_10_ += i_17_;
							i_12_ += ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
						}
					}
				}
			} else if ((i_14_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff)) {
				if (i_12_ < i_13_) {
					i_9_ = i_10_ <<= 16;
					if ((i_14_ ^ 0xffffffff) > -1) {
						i_9_ -= i_16_ * i_14_;
						i_10_ -= i_14_ * i_17_;
						i_14_ = 0;
					}
					i <<= 16;
					if (i_12_ < 0) {
						i -= i_12_ * i_15_;
						i_12_ = 0;
					}
					if (i_17_ <= i_16_) {
						i_13_ -= i_12_;
						i_12_ -= i_14_;
						i_14_ = (((Class11_Sub45_Sub1_Sub2) this).anInt9872 * i_14_);
						while (--i_12_ >= 0) {
							Class11_Sub2_Sub35
									.method3837(
											i_10_ >> 16,
											i_9_ >> 16,
											0,
											i_14_,
											(((Class11_Sub45_Sub1_Sub2) this).aByteArray9881),
											-1212415540);
							i_14_ += ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
							i_9_ += i_16_;
							i_10_ += i_17_;
						}
						while (--i_13_ >= 0) {
							Class11_Sub2_Sub35
									.method3837(
											i >> 16,
											i_9_ >> 16,
											0,
											i_14_,
											(((Class11_Sub45_Sub1_Sub2) this).aByteArray9881),
											-1212415540);
							i += i_15_;
							i_14_ += ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
							i_9_ += i_16_;
						}
					} else {
						i_13_ -= i_12_;
						i_12_ -= i_14_;
						i_14_ *= ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
						while ((--i_12_ ^ 0xffffffff) <= -1) {
							Class11_Sub2_Sub35
									.method3837(
											i_9_ >> 16,
											i_10_ >> 16,
											0,
											i_14_,
											(((Class11_Sub45_Sub1_Sub2) this).aByteArray9881),
											-1212415540);
							i_9_ += i_16_;
							i_10_ += i_17_;
							i_14_ += ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
						}
						while (--i_13_ >= 0) {
							Class11_Sub2_Sub35
									.method3837(
											i_9_ >> 16,
											i >> 16,
											0,
											i_14_,
											(((Class11_Sub45_Sub1_Sub2) this).aByteArray9881),
											-1212415540);
							i += i_15_;
							i_14_ += ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
							i_9_ += i_16_;
						}
					}
				} else {
					i = i_10_ <<= 16;
					i_9_ <<= 16;
					if (i_14_ < 0) {
						i_10_ -= i_17_ * i_14_;
						i -= i_16_ * i_14_;
						i_14_ = 0;
					}
					if ((i_13_ ^ 0xffffffff) > -1) {
						i_9_ -= i_13_ * i_15_;
						i_13_ = 0;
					}
					if (i_17_ <= i_16_) {
						i_12_ -= i_13_;
						i_13_ -= i_14_;
						i_14_ = (((Class11_Sub45_Sub1_Sub2) this).anInt9872 * i_14_);
						while (--i_13_ >= 0) {
							Class11_Sub2_Sub35
									.method3837(
											i_10_ >> 16,
											i >> 16,
											0,
											i_14_,
											(((Class11_Sub45_Sub1_Sub2) this).aByteArray9881),
											-1212415540);
							i_10_ += i_17_;
							i += i_16_;
							i_14_ += ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
						}
						while (--i_12_ >= 0) {
							Class11_Sub2_Sub35
									.method3837(
											i_10_ >> 16,
											i_9_ >> 16,
											0,
											i_14_,
											(((Class11_Sub45_Sub1_Sub2) this).aByteArray9881),
											-1212415540);
							i_10_ += i_17_;
							i_9_ += i_15_;
							i_14_ += ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
						}
					} else {
						i_12_ -= i_13_;
						i_13_ -= i_14_;
						i_14_ *= ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
						while (--i_13_ >= 0) {
							Class11_Sub2_Sub35
									.method3837(
											i >> 16,
											i_10_ >> 16,
											0,
											i_14_,
											(((Class11_Sub45_Sub1_Sub2) this).aByteArray9881),
											-1212415540);
							i += i_16_;
							i_10_ += i_17_;
							i_14_ += ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
						}
						while (--i_12_ >= 0) {
							Class11_Sub2_Sub35
									.method3837(
											i_9_ >> 16,
											i_10_ >> 16,
											0,
											i_14_,
											(((Class11_Sub45_Sub1_Sub2) this).aByteArray9881),
											-1212415540);
							i_9_ += i_15_;
							i_14_ += ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
							i_10_ += i_17_;
						}
					}
				}
			} else if ((i_14_ ^ 0xffffffff) <= (i_12_ ^ 0xffffffff)) {
				i_10_ = i_9_ <<= 16;
				i <<= 16;
				if ((i_13_ ^ 0xffffffff) > -1) {
					i_9_ -= i_13_ * i_16_;
					i_10_ -= i_15_ * i_13_;
					i_13_ = 0;
				}
				if (i_12_ < 0) {
					i -= i_17_ * i_12_;
					i_12_ = 0;
				}
				if (i_15_ < i_16_) {
					i_14_ -= i_12_;
					i_12_ -= i_13_;
					i_13_ = ((Class11_Sub45_Sub1_Sub2) this).anInt9872 * i_13_;
					while ((--i_12_ ^ 0xffffffff) <= -1) {
						Class11_Sub2_Sub35
								.method3837(
										i_10_ >> 16,
										i_9_ >> 16,
										0,
										i_13_,
										((Class11_Sub45_Sub1_Sub2) this).aByteArray9881,
										-1212415540);
						i_10_ += i_15_;
						i_13_ += ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
						i_9_ += i_16_;
					}
					while ((--i_14_ ^ 0xffffffff) <= -1) {
						Class11_Sub2_Sub35
								.method3837(
										i >> 16,
										i_9_ >> 16,
										0,
										i_13_,
										((Class11_Sub45_Sub1_Sub2) this).aByteArray9881,
										-1212415540);
						i_13_ += ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
						i_9_ += i_16_;
						i += i_17_;
					}
				} else {
					i_14_ -= i_12_;
					i_12_ -= i_13_;
					i_13_ *= ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
					while (--i_12_ >= 0) {
						Class11_Sub2_Sub35
								.method3837(
										i_9_ >> 16,
										i_10_ >> 16,
										0,
										i_13_,
										((Class11_Sub45_Sub1_Sub2) this).aByteArray9881,
										-1212415540);
						i_13_ += ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
						i_9_ += i_16_;
						i_10_ += i_15_;
					}
					while ((--i_14_ ^ 0xffffffff) <= -1) {
						Class11_Sub2_Sub35
								.method3837(
										i_9_ >> 16,
										i >> 16,
										0,
										i_13_,
										((Class11_Sub45_Sub1_Sub2) this).aByteArray9881,
										-1212415540);
						i += i_17_;
						i_9_ += i_16_;
						i_13_ += ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
					}
				}
			} else {
				i = i_9_ <<= 16;
				i_10_ <<= 16;
				if (i_13_ < 0) {
					i -= i_13_ * i_15_;
					i_9_ -= i_13_ * i_16_;
					i_13_ = 0;
				}
				if (i_14_ < 0) {
					i_10_ -= i_17_ * i_14_;
					i_14_ = 0;
				}
				if ((i_13_ == i_14_ || i_15_ >= i_16_)
						&& ((i_14_ ^ 0xffffffff) != (i_13_ ^ 0xffffffff) || i_17_ >= i_15_)) {
					i_12_ -= i_14_;
					i_14_ -= i_13_;
					i_13_ = ((Class11_Sub45_Sub1_Sub2) this).anInt9872 * i_13_;
					while ((--i_14_ ^ 0xffffffff) <= -1) {
						Class11_Sub2_Sub35
								.method3837(
										i_9_ >> 16,
										i >> 16,
										0,
										i_13_,
										((Class11_Sub45_Sub1_Sub2) this).aByteArray9881,
										-1212415540);
						i += i_15_;
						i_9_ += i_16_;
						i_13_ += ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
					}
					while (--i_12_ >= 0) {
						Class11_Sub2_Sub35
								.method3837(
										i_10_ >> 16,
										i >> 16,
										0,
										i_13_,
										((Class11_Sub45_Sub1_Sub2) this).aByteArray9881,
										-1212415540);
						i_13_ += ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
						i_10_ += i_17_;
						i += i_15_;
					}
				} else {
					i_12_ -= i_14_;
					i_14_ -= i_13_;
					i_13_ *= ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
					while ((--i_14_ ^ 0xffffffff) <= -1) {
						Class11_Sub2_Sub35
								.method3837(
										i >> 16,
										i_9_ >> 16,
										0,
										i_13_,
										((Class11_Sub45_Sub1_Sub2) this).aByteArray9881,
										-1212415540);
						i_9_ += i_16_;
						i += i_15_;
						i_13_ += ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
					}
					while (--i_12_ >= 0) {
						Class11_Sub2_Sub35
								.method3837(
										i >> 16,
										i_10_ >> 16,
										0,
										i_13_,
										((Class11_Sub45_Sub1_Sub2) this).aByteArray9881,
										-1212415540);
						i_13_ += ((Class11_Sub45_Sub1_Sub2) this).anInt9872;
						i_10_ += i_17_;
						i += i_15_;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lba.C(" + i + ','
					+ i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ','
					+ i_13_ + ',' + i_14_ + ')'));
		}
	}

	Class11_Sub45_Sub1_Sub2(Class163_Sub3 class163_sub3, int i, int i_18_) {
		try {
			((Class11_Sub45_Sub1_Sub2) this).aByteArray9881 = new byte[i
					* i_18_];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lba.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_18_ + ')'));
		}
	}
}
