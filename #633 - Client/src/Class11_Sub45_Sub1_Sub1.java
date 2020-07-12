/* Class11_Sub45_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub45_Sub1_Sub1 extends Class11_Sub45_Sub1 {
	int anInt9823;
	static int anInt9824;
	byte[] aByteArray9825;
	static int anInt9826;
	int anInt9827;
	static int anInt9828;
	int anInt9829;
	static int anInt9830;
	static OutgoingPacket aClass370_9831 = new OutgoingPacket(8, 2);
	static int anInt9832;
	static int anInt9833;
	int anInt9834;
	static float aFloat9835;
	static int anInt9836;
	static OutgoingPacket aClass370_9837 = new OutgoingPacket(52, 3);

	static final boolean method3862(int i, byte i_0_, int i_1_) {
		try {
			anInt9832++;
			int i_2_ = 37 % ((i_0_ - 32) / 61);
			if ((i & 0x34) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("l.E(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method3863(int i, int i_3_, int i_4_, int i_5_, byte i_6_,
			int i_7_, int i_8_) {
		try {
			anInt9833++;
			if (i_6_ == -34) {
				int i_9_ = 0;
				if ((i_7_ ^ 0xffffffff) != (i_5_ ^ 0xffffffff))
					i_9_ = (-i_3_ + i_4_ << 16) / (i_7_ - i_5_);
				int i_10_ = 0;
				if ((i_7_ ^ 0xffffffff) != (i_8_ ^ 0xffffffff))
					i_10_ = (-i_4_ + i << 16) / (i_8_ - i_7_);
				int i_11_ = 0;
				if (i_5_ != i_8_)
					i_11_ = (-i + i_3_ << 16) / (-i_8_ + i_5_);
				if ((i_7_ ^ 0xffffffff) <= (i_5_ ^ 0xffffffff) && i_8_ >= i_5_) {
					if (i_8_ > i_7_) {
						i = i_3_ <<= 16;
						i_4_ <<= 16;
						if ((i_5_ ^ 0xffffffff) > -1) {
							i -= i_11_ * i_5_;
							i_3_ -= i_5_ * i_9_;
							i_5_ = 0;
						}
						if ((i_7_ ^ 0xffffffff) > -1) {
							i_4_ -= i_7_ * i_10_;
							i_7_ = 0;
						}
						if (((i_7_ ^ 0xffffffff) == (i_5_ ^ 0xffffffff) || i_11_ >= i_9_)
								&& (i_7_ != i_5_ || i_10_ >= i_11_)) {
							i_8_ -= i_7_;
							i_7_ -= i_5_;
							i_5_ = (((Class11_Sub45_Sub1_Sub1) this).anInt9827 * i_5_);
							while ((--i_7_ ^ 0xffffffff) <= -1) {
								Exception_Sub1
										.method3734(
												0,
												i_5_,
												i_3_ >> 16,
												(byte) 61,
												i >> 16,
												(((Class11_Sub45_Sub1_Sub1) this).aByteArray9825));
								i_3_ += i_9_;
								i_5_ += (((Class11_Sub45_Sub1_Sub1) this).anInt9827);
								i += i_11_;
							}
							while ((--i_8_ ^ 0xffffffff) <= -1) {
								Exception_Sub1
										.method3734(
												0,
												i_5_,
												i_4_ >> 16,
												(byte) 80,
												i >> 16,
												(((Class11_Sub45_Sub1_Sub1) this).aByteArray9825));
								i_5_ += (((Class11_Sub45_Sub1_Sub1) this).anInt9827);
								i_4_ += i_10_;
								i += i_11_;
							}
						} else {
							i_8_ -= i_7_;
							i_7_ -= i_5_;
							i_5_ *= ((Class11_Sub45_Sub1_Sub1) this).anInt9827;
							while ((--i_7_ ^ 0xffffffff) <= -1) {
								Exception_Sub1
										.method3734(
												0,
												i_5_,
												i >> 16,
												(byte) 91,
												i_3_ >> 16,
												(((Class11_Sub45_Sub1_Sub1) this).aByteArray9825));
								i += i_11_;
								i_5_ += (((Class11_Sub45_Sub1_Sub1) this).anInt9827);
								i_3_ += i_9_;
							}
							while (--i_8_ >= 0) {
								Exception_Sub1
										.method3734(
												0,
												i_5_,
												i >> 16,
												(byte) 110,
												i_4_ >> 16,
												(((Class11_Sub45_Sub1_Sub1) this).aByteArray9825));
								i_5_ += (((Class11_Sub45_Sub1_Sub1) this).anInt9827);
								i_4_ += i_10_;
								i += i_11_;
							}
						}
					} else {
						i_4_ = i_3_ <<= 16;
						i <<= 16;
						if ((i_5_ ^ 0xffffffff) > -1) {
							i_4_ -= i_11_ * i_5_;
							i_3_ -= i_5_ * i_9_;
							i_5_ = 0;
						}
						if (i_8_ < 0) {
							i -= i_10_ * i_8_;
							i_8_ = 0;
						}
						if (((i_5_ ^ 0xffffffff) != (i_8_ ^ 0xffffffff) && i_11_ < i_9_)
								|| i_5_ == i_8_
								&& ((i_10_ ^ 0xffffffff) < (i_9_ ^ 0xffffffff))) {
							i_7_ -= i_8_;
							i_8_ -= i_5_;
							i_5_ *= ((Class11_Sub45_Sub1_Sub1) this).anInt9827;
							while ((--i_8_ ^ 0xffffffff) <= -1) {
								Exception_Sub1
										.method3734(
												0,
												i_5_,
												i_4_ >> 16,
												(byte) 108,
												i_3_ >> 16,
												(((Class11_Sub45_Sub1_Sub1) this).aByteArray9825));
								i_4_ += i_11_;
								i_5_ += (((Class11_Sub45_Sub1_Sub1) this).anInt9827);
								i_3_ += i_9_;
							}
							while ((--i_7_ ^ 0xffffffff) <= -1) {
								Exception_Sub1
										.method3734(
												0,
												i_5_,
												i >> 16,
												(byte) 58,
												i_3_ >> 16,
												(((Class11_Sub45_Sub1_Sub1) this).aByteArray9825));
								i_5_ += (((Class11_Sub45_Sub1_Sub1) this).anInt9827);
								i_3_ += i_9_;
								i += i_10_;
							}
						} else {
							i_7_ -= i_8_;
							i_8_ -= i_5_;
							i_5_ *= ((Class11_Sub45_Sub1_Sub1) this).anInt9827;
							while ((--i_8_ ^ 0xffffffff) <= -1) {
								Exception_Sub1
										.method3734(
												0,
												i_5_,
												i_3_ >> 16,
												(byte) 92,
												i_4_ >> 16,
												(((Class11_Sub45_Sub1_Sub1) this).aByteArray9825));
								i_4_ += i_11_;
								i_5_ += (((Class11_Sub45_Sub1_Sub1) this).anInt9827);
								i_3_ += i_9_;
							}
							while ((--i_7_ ^ 0xffffffff) <= -1) {
								Exception_Sub1
										.method3734(
												0,
												i_5_,
												i_3_ >> 16,
												(byte) 93,
												i >> 16,
												(((Class11_Sub45_Sub1_Sub1) this).aByteArray9825));
								i_5_ += (((Class11_Sub45_Sub1_Sub1) this).anInt9827);
								i_3_ += i_9_;
								i += i_10_;
							}
						}
					}
				} else if (i_8_ < i_7_) {
					if (i_7_ <= i_5_) {
						i_3_ = i <<= 16;
						i_4_ <<= 16;
						if ((i_8_ ^ 0xffffffff) > -1) {
							i_3_ -= i_8_ * i_10_;
							i -= i_11_ * i_8_;
							i_8_ = 0;
						}
						if (i_7_ < 0) {
							i_4_ -= i_7_ * i_9_;
							i_7_ = 0;
						}
						if (i_10_ < i_11_) {
							i_5_ -= i_7_;
							i_7_ -= i_8_;
							i_8_ = (((Class11_Sub45_Sub1_Sub1) this).anInt9827 * i_8_);
							while ((--i_7_ ^ 0xffffffff) <= -1) {
								Exception_Sub1
										.method3734(
												0,
												i_8_,
												i_3_ >> 16,
												(byte) 107,
												i >> 16,
												(((Class11_Sub45_Sub1_Sub1) this).aByteArray9825));
								i_3_ += i_10_;
								i_8_ += (((Class11_Sub45_Sub1_Sub1) this).anInt9827);
								i += i_11_;
							}
							while ((--i_5_ ^ 0xffffffff) <= -1) {
								Exception_Sub1
										.method3734(
												0,
												i_8_,
												i_4_ >> 16,
												(byte) 44,
												i >> 16,
												(((Class11_Sub45_Sub1_Sub1) this).aByteArray9825));
								i_8_ += (((Class11_Sub45_Sub1_Sub1) this).anInt9827);
								i_4_ += i_9_;
								i += i_11_;
							}
						} else {
							i_5_ -= i_7_;
							i_7_ -= i_8_;
							i_8_ = (((Class11_Sub45_Sub1_Sub1) this).anInt9827 * i_8_);
							while ((--i_7_ ^ 0xffffffff) <= -1) {
								Exception_Sub1
										.method3734(
												0,
												i_8_,
												i >> 16,
												(byte) 39,
												i_3_ >> 16,
												(((Class11_Sub45_Sub1_Sub1) this).aByteArray9825));
								i += i_11_;
								i_8_ += (((Class11_Sub45_Sub1_Sub1) this).anInt9827);
								i_3_ += i_10_;
							}
							while ((--i_5_ ^ 0xffffffff) <= -1) {
								Exception_Sub1
										.method3734(
												0,
												i_8_,
												i >> 16,
												(byte) 27,
												i_4_ >> 16,
												(((Class11_Sub45_Sub1_Sub1) this).aByteArray9825));
								i_8_ += (((Class11_Sub45_Sub1_Sub1) this).anInt9827);
								i_4_ += i_9_;
								i += i_11_;
							}
						}
					} else {
						i_4_ = i <<= 16;
						if ((i_8_ ^ 0xffffffff) > -1) {
							i -= i_11_ * i_8_;
							i_4_ -= i_10_ * i_8_;
							i_8_ = 0;
						}
						i_3_ <<= 16;
						if (i_5_ < 0) {
							i_3_ -= i_5_ * i_9_;
							i_5_ = 0;
						}
						if (i_11_ <= i_10_) {
							i_7_ -= i_5_;
							i_5_ -= i_8_;
							i_8_ *= ((Class11_Sub45_Sub1_Sub1) this).anInt9827;
							while (--i_5_ >= 0) {
								Exception_Sub1
										.method3734(
												0,
												i_8_,
												i >> 16,
												(byte) 91,
												i_4_ >> 16,
												(((Class11_Sub45_Sub1_Sub1) this).aByteArray9825));
								i_4_ += i_10_;
								i += i_11_;
								i_8_ += (((Class11_Sub45_Sub1_Sub1) this).anInt9827);
							}
							while (--i_7_ >= 0) {
								Exception_Sub1
										.method3734(
												0,
												i_8_,
												i_3_ >> 16,
												(byte) 53,
												i_4_ >> 16,
												(((Class11_Sub45_Sub1_Sub1) this).aByteArray9825));
								i_4_ += i_10_;
								i_3_ += i_9_;
								i_8_ += (((Class11_Sub45_Sub1_Sub1) this).anInt9827);
							}
						} else {
							i_7_ -= i_5_;
							i_5_ -= i_8_;
							i_8_ = (((Class11_Sub45_Sub1_Sub1) this).anInt9827 * i_8_);
							while ((--i_5_ ^ 0xffffffff) <= -1) {
								Exception_Sub1
										.method3734(
												0,
												i_8_,
												i_4_ >> 16,
												(byte) 121,
												i >> 16,
												(((Class11_Sub45_Sub1_Sub1) this).aByteArray9825));
								i_4_ += i_10_;
								i_8_ += (((Class11_Sub45_Sub1_Sub1) this).anInt9827);
								i += i_11_;
							}
							while ((--i_7_ ^ 0xffffffff) <= -1) {
								Exception_Sub1
										.method3734(
												0,
												i_8_,
												i_4_ >> 16,
												(byte) 99,
												i_3_ >> 16,
												(((Class11_Sub45_Sub1_Sub1) this).aByteArray9825));
								i_3_ += i_9_;
								i_4_ += i_10_;
								i_8_ += (((Class11_Sub45_Sub1_Sub1) this).anInt9827);
							}
						}
					}
				} else if (i_8_ < i_5_) {
					i_3_ = i_4_ <<= 16;
					if (i_7_ < 0) {
						i_4_ -= i_7_ * i_10_;
						i_3_ -= i_7_ * i_9_;
						i_7_ = 0;
					}
					i <<= 16;
					if (i_8_ < 0) {
						i -= i_8_ * i_11_;
						i_8_ = 0;
					}
					if ((i_8_ == i_7_ || i_9_ >= i_10_)
							&& (i_7_ != i_8_ || (i_11_ ^ 0xffffffff) <= (i_9_ ^ 0xffffffff))) {
						i_5_ -= i_8_;
						i_8_ -= i_7_;
						i_7_ *= ((Class11_Sub45_Sub1_Sub1) this).anInt9827;
						while ((--i_8_ ^ 0xffffffff) <= -1) {
							Exception_Sub1
									.method3734(
											0,
											i_7_,
											i_4_ >> 16,
											(byte) 68,
											i_3_ >> 16,
											(((Class11_Sub45_Sub1_Sub1) this).aByteArray9825));
							i_7_ += ((Class11_Sub45_Sub1_Sub1) this).anInt9827;
							i_3_ += i_9_;
							i_4_ += i_10_;
						}
						while (--i_5_ >= 0) {
							Exception_Sub1
									.method3734(
											0,
											i_7_,
											i >> 16,
											(byte) 23,
											i_3_ >> 16,
											(((Class11_Sub45_Sub1_Sub1) this).aByteArray9825));
							i_7_ += ((Class11_Sub45_Sub1_Sub1) this).anInt9827;
							i += i_11_;
							i_3_ += i_9_;
						}
					} else {
						i_5_ -= i_8_;
						i_8_ -= i_7_;
						i_7_ = (((Class11_Sub45_Sub1_Sub1) this).anInt9827 * i_7_);
						while ((--i_8_ ^ 0xffffffff) <= -1) {
							Exception_Sub1
									.method3734(
											0,
											i_7_,
											i_3_ >> 16,
											(byte) 53,
											i_4_ >> 16,
											(((Class11_Sub45_Sub1_Sub1) this).aByteArray9825));
							i_3_ += i_9_;
							i_4_ += i_10_;
							i_7_ += ((Class11_Sub45_Sub1_Sub1) this).anInt9827;
						}
						while ((--i_5_ ^ 0xffffffff) <= -1) {
							Exception_Sub1
									.method3734(
											0,
											i_7_,
											i_3_ >> 16,
											(byte) 100,
											i >> 16,
											(((Class11_Sub45_Sub1_Sub1) this).aByteArray9825));
							i += i_11_;
							i_3_ += i_9_;
							i_7_ += ((Class11_Sub45_Sub1_Sub1) this).anInt9827;
						}
					}
				} else {
					i = i_4_ <<= 16;
					if ((i_7_ ^ 0xffffffff) > -1) {
						i -= i_7_ * i_9_;
						i_4_ -= i_7_ * i_10_;
						i_7_ = 0;
					}
					i_3_ <<= 16;
					if ((i_5_ ^ 0xffffffff) > -1) {
						i_3_ -= i_5_ * i_11_;
						i_5_ = 0;
					}
					if ((i_10_ ^ 0xffffffff) >= (i_9_ ^ 0xffffffff)) {
						i_8_ -= i_5_;
						i_5_ -= i_7_;
						i_7_ = (((Class11_Sub45_Sub1_Sub1) this).anInt9827 * i_7_);
						while (--i_5_ >= 0) {
							Exception_Sub1
									.method3734(
											0,
											i_7_,
											i_4_ >> 16,
											(byte) 77,
											i >> 16,
											(((Class11_Sub45_Sub1_Sub1) this).aByteArray9825));
							i_4_ += i_10_;
							i += i_9_;
							i_7_ += ((Class11_Sub45_Sub1_Sub1) this).anInt9827;
						}
						while ((--i_8_ ^ 0xffffffff) <= -1) {
							Exception_Sub1
									.method3734(
											0,
											i_7_,
											i_4_ >> 16,
											(byte) 83,
											i_3_ >> 16,
											(((Class11_Sub45_Sub1_Sub1) this).aByteArray9825));
							i_7_ += ((Class11_Sub45_Sub1_Sub1) this).anInt9827;
							i_3_ += i_11_;
							i_4_ += i_10_;
						}
					} else {
						i_8_ -= i_5_;
						i_5_ -= i_7_;
						i_7_ *= ((Class11_Sub45_Sub1_Sub1) this).anInt9827;
						while (--i_5_ >= 0) {
							Exception_Sub1
									.method3734(
											0,
											i_7_,
											i >> 16,
											(byte) 127,
											i_4_ >> 16,
											(((Class11_Sub45_Sub1_Sub1) this).aByteArray9825));
							i += i_9_;
							i_7_ += ((Class11_Sub45_Sub1_Sub1) this).anInt9827;
							i_4_ += i_10_;
						}
						while (--i_8_ >= 0) {
							Exception_Sub1
									.method3734(
											0,
											i_7_,
											i_3_ >> 16,
											(byte) 85,
											i_4_ >> 16,
											(((Class11_Sub45_Sub1_Sub1) this).aByteArray9825));
							i_4_ += i_10_;
							i_7_ += ((Class11_Sub45_Sub1_Sub1) this).anInt9827;
							i_3_ += i_11_;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("l.G(" + i + ','
					+ i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_
					+ ',' + i_8_ + ')'));
		}
	}

	static final boolean method3864(byte i, int i_12_, int i_13_) {
		try {
			if (i != -36)
				return true;
			anInt9830++;
			if (!(Class256_Sub2.method3112(i_12_, i ^ 0x7bc1690, i_13_) | (i_13_ & 0x70000 ^ 0xffffffff) != -1)
					&& !Class251_Sub1.method2378((byte) 108, i_12_, i_13_))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("l.C(" + i + ','
					+ i_12_ + ',' + i_13_ + ')'));
		}
	}

	final void method3865(byte i) {
		try {
			anInt9836++;
			int i_14_ = -1;
			if (i >= 52) {
				int i_15_ = -8
						+ (((Class11_Sub45_Sub1_Sub1) this).aByteArray9825).length;
				while ((i_15_ ^ 0xffffffff) < (i_14_ ^ 0xffffffff)) {
					((Class11_Sub45_Sub1_Sub1) this).aByteArray9825[++i_14_] = (byte) 0;
					((Class11_Sub45_Sub1_Sub1) this).aByteArray9825[++i_14_] = (byte) 0;
					((Class11_Sub45_Sub1_Sub1) this).aByteArray9825[++i_14_] = (byte) 0;
					((Class11_Sub45_Sub1_Sub1) this).aByteArray9825[++i_14_] = (byte) 0;
					((Class11_Sub45_Sub1_Sub1) this).aByteArray9825[++i_14_] = (byte) 0;
					((Class11_Sub45_Sub1_Sub1) this).aByteArray9825[++i_14_] = (byte) 0;
					((Class11_Sub45_Sub1_Sub1) this).aByteArray9825[++i_14_] = (byte) 0;
					((Class11_Sub45_Sub1_Sub1) this).aByteArray9825[++i_14_] = (byte) 0;
				}
				while (((((Class11_Sub45_Sub1_Sub1) this).aByteArray9825.length - 1) ^ 0xffffffff) < (i_14_ ^ 0xffffffff))
					((Class11_Sub45_Sub1_Sub1) this).aByteArray9825[++i_14_] = (byte) 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "l.F(" + i + ')');
		}
	}

	final void method3866(int i, int i_16_, int i_17_, int i_18_, int i_19_) {
		try {
			((Class11_Sub45_Sub1_Sub1) this).anInt9827 = -i_19_ + i_16_;
			if (i_18_ != -18678)
				((Class11_Sub45_Sub1_Sub1) this).anInt9823 = -109;
			anInt9828++;
			((Class11_Sub45_Sub1_Sub1) this).anInt9834 = i_19_;
			((Class11_Sub45_Sub1_Sub1) this).anInt9823 = i;
			((Class11_Sub45_Sub1_Sub1) this).anInt9829 = i_17_ - i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("l.H(" + i + ','
					+ i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ')'));
		}
	}

	final boolean method3867(int i, int i_20_, int i_21_) {
		try {
			if (i != 27928)
				method3869(-46);
			anInt9826++;
			if ((((Class11_Sub45_Sub1_Sub1) this).aByteArray9825.length ^ 0xffffffff) > (i_20_
					* i_21_ ^ 0xffffffff))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("l.D(" + i + ','
					+ i_20_ + ',' + i_21_ + ')'));
		}
	}

	static final boolean method3868(int i, int i_22_) {
		try {
			if (i != -3)
				method3864((byte) 80, 3, 31);
			anInt9824++;
			if ((i_22_ ^ 0xffffffff) != -1 && (i_22_ ^ 0xffffffff) != -3)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "l.A(" + i + ','
					+ i_22_ + ')');
		}
	}

	public static void method3869(int i) {
		try {
			aClass370_9837 = null;
			if (i != -1)
				aClass370_9837 = null;
			aClass370_9831 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "l.B(" + i + ')');
		}
	}

	static final void method3870(Class376_Sub7 class376_sub7, int i, int i_23_,
			int i_24_, int i_25_, int i_26_) {
		boolean bool = true;
		int i_27_ = i_23_;
		int i_28_ = i_23_ + i_25_;
		int i_29_ = i_24_ - 1;
		int i_30_ = i_24_ + i_26_;
		for (int i_31_ = i; i_31_ <= i + 1; i_31_++) {
			if (i_31_ != Class155.anInt2044) {
				for (int i_32_ = i_27_; i_32_ <= i_28_; i_32_++) {
					if (i_32_ >= 0 && i_32_ < Class138.anInt1886) {
						for (int i_33_ = i_29_; i_33_ <= i_30_; i_33_++) {
							if (i_33_ >= 0
									&& i_33_ < Class82.anInt1133
									&& (!bool || i_32_ >= i_28_
											|| i_33_ >= i_30_ || i_33_ < i_24_
											&& i_32_ != i_23_)) {
								Class364 class364 = (Class181.aClass364ArrayArrayArray2336[i_31_][i_32_][i_33_]);
								if (class364 != null) {
									int i_34_ = (((Class315.aClass12Array4179[i_31_]
											.method131((byte) -82, i_33_, i_32_))
											+ (Class315.aClass12Array4179[i_31_]
													.method131((byte) 121,
															i_33_, i_32_ + 1))
											+ (Class315.aClass12Array4179[i_31_]
													.method131((byte) 23,
															i_33_ + 1, i_32_)) + (Class315.aClass12Array4179[i_31_]
											.method131((byte) -127, i_33_ + 1,
													i_32_ + 1))) / 4 - ((Class315.aClass12Array4179[i]
											.method131((byte) 54, i_24_, i_23_))
											+ (Class315.aClass12Array4179[i]
													.method131((byte) 126,
															i_24_, i_23_ + 1))
											+ (Class315.aClass12Array4179[i]
													.method131((byte) 124,
															i_24_ + 1, i_23_)) + (Class315.aClass12Array4179[i]
											.method131((byte) -61, i_24_ + 1,
													i_23_ + 1))) / 4);
									Class376_Sub7_Sub3 class376_sub7_sub3 = (((Class364) class364).aClass376_Sub7_Sub3_4780);
									Class376_Sub7_Sub3 class376_sub7_sub3_35_ = (((Class364) class364).aClass376_Sub7_Sub3_4776);
									if (class376_sub7_sub3 != null
											&& class376_sub7_sub3
													.method2862(-105))
										class376_sub7
												.method2871(
														bool,
														Class87.aClass163_1210,
														i_34_,
														(((i_33_ - i_24_) * (Class376_Sub7_Sub3_Sub2.anInt10141)) + ((1 - i_26_) * Class19.anInt152)),
														class376_sub7_sub3,
														22501,
														(((i_32_ - i_23_) * (Class376_Sub7_Sub3_Sub2.anInt10141)) + ((1 - i_25_) * Class19.anInt152)));
									if (class376_sub7_sub3_35_ != null
											&& class376_sub7_sub3_35_
													.method2862(-115))
										class376_sub7
												.method2871(
														bool,
														Class87.aClass163_1210,
														i_34_,
														(((i_33_ - i_24_) * (Class376_Sub7_Sub3_Sub2.anInt10141)) + ((1 - i_26_) * Class19.anInt152)),
														class376_sub7_sub3_35_,
														22501,
														(((i_32_ - i_23_) * (Class376_Sub7_Sub3_Sub2.anInt10141)) + ((1 - i_25_) * Class19.anInt152)));
									for (Class140 class140 = (((Class364) class364).aClass140_4781); class140 != null; class140 = (((Class140) class140).aClass140_1895)) {
										Class376_Sub7_Sub5 class376_sub7_sub5 = (((Class140) class140).aClass376_Sub7_Sub5_1896);
										if (class376_sub7_sub5 != null
												&& class376_sub7_sub5
														.method2862(-107)
												&& (i_32_ == (((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9626) || i_32_ == i_27_)
												&& (i_33_ == (((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9629) || i_33_ == i_29_)) {
											int i_36_ = ((((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9624)
													- (((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9626) + 1);
											int i_37_ = ((((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9620)
													- (((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9629) + 1);
											class376_sub7
													.method2871(
															bool,
															Class87.aClass163_1210,
															i_34_,
															((((((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9629) - i_24_) * (Class376_Sub7_Sub3_Sub2.anInt10141)) + ((i_37_ - i_26_) * Class19.anInt152)),
															class376_sub7_sub5,
															22501,
															((((((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9626) - i_23_) * (Class376_Sub7_Sub3_Sub2.anInt10141)) + ((i_36_ - i_25_) * Class19.anInt152)));
										}
									}
								}
							}
						}
					}
				}
				i_27_--;
				bool = false;
			}
		}
	}

	Class11_Sub45_Sub1_Sub1(Class163_Sub2 class163_sub2, int i, int i_38_) {
		try {
			((Class11_Sub45_Sub1_Sub1) this).aByteArray9825 = new byte[i_38_
					* i];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("l.<init>("
					+ (class163_sub2 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_38_ + ')'));
		}
	}
}
