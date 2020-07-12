/* Class11_Sub6_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub6_Sub4 extends Class11_Sub6 {
	private int anInt9375;
	private int anInt9376;
	private int anInt9377;
	private int anInt9378;
	private int anInt9379;
	private int anInt9380;
	private int anInt9381;
	private int anInt9382;
	private int anInt9383;
	private int anInt9384;
	private int anInt9385;
	private int anInt9386;
	private boolean aBool9387;
	private int anInt9388;
	private int anInt9389;

	private final int method3662(int[] is, int i, int i_0_, int i_1_, int i_2_) {
		while (anInt9379 > 0) {
			int i_3_ = i + anInt9379;
			if (i_3_ > i_1_)
				i_3_ = i_1_;
			anInt9379 += i;
			if (anInt9388 == 256 && (anInt9389 & 0xff) == 0) {
				if (Class236_Sub1.aBool6092)
					i = method3675(
							0,
							(((Class11_Sub14_Sub1) (Class11_Sub14_Sub1) ((Class11_Sub6) this).aClass11_Sub14_5246).aByteArray9358),
							is, anInt9389, i, anInt9380, anInt9381, anInt9386,
							anInt9375, 0, i_3_, i_0_, this);
				else
					i = method3693(
							(((Class11_Sub14_Sub1) (Class11_Sub14_Sub1) ((Class11_Sub6) this).aClass11_Sub14_5246).aByteArray9358),
							is, anInt9389, i, anInt9378, anInt9377, 0, i_3_,
							i_0_, this);
			} else if (Class236_Sub1.aBool6092)
				i = method3666(
						0,
						0,
						(((Class11_Sub14_Sub1) (Class11_Sub14_Sub1) ((Class11_Sub6) this).aClass11_Sub14_5246).aByteArray9358),
						is, anInt9389, i, anInt9380, anInt9381, anInt9386,
						anInt9375, 0, i_3_, i_0_, this, anInt9388, i_2_);
			else
				i = method3690(
						0,
						0,
						(((Class11_Sub14_Sub1) (Class11_Sub14_Sub1) ((Class11_Sub6) this).aClass11_Sub14_5246).aByteArray9358),
						is, anInt9389, i, anInt9378, anInt9377, 0, i_3_, i_0_,
						this, anInt9388, i_2_);
			anInt9379 -= i;
			if (anInt9379 != 0)
				return i;
			if (method3667())
				return i_1_;
		}
		if (anInt9388 == 256 && (anInt9389 & 0xff) == 0) {
			if (Class236_Sub1.aBool6092)
				return method3689(
						0,
						(((Class11_Sub14_Sub1) (Class11_Sub14_Sub1) ((Class11_Sub6) this).aClass11_Sub14_5246).aByteArray9358),
						is, anInt9389, i, anInt9380, anInt9381, 0, i_1_, i_0_,
						this);
			return method3683(
					(((Class11_Sub14_Sub1) (Class11_Sub14_Sub1) ((Class11_Sub6) this).aClass11_Sub14_5246).aByteArray9358),
					is, anInt9389, i, anInt9378, 0, i_1_, i_0_, this);
		}
		if (Class236_Sub1.aBool6092)
			return method3692(
					0,
					0,
					(((Class11_Sub14_Sub1) (Class11_Sub14_Sub1) ((Class11_Sub6) this).aClass11_Sub14_5246).aByteArray9358),
					is, anInt9389, i, anInt9380, anInt9381, 0, i_1_, i_0_,
					this, anInt9388, i_2_);
		return method3678(
				0,
				0,
				(((Class11_Sub14_Sub1) (Class11_Sub14_Sub1) ((Class11_Sub6) this).aClass11_Sub14_5246).aByteArray9358),
				is, anInt9389, i, anInt9378, 0, i_1_, i_0_, this, anInt9388,
				i_2_);
	}

	final boolean method3663() {
		if (anInt9379 == 0)
			return false;
		return true;
	}

	final synchronized void method3664(int i) {
		int i_4_ = ((((Class11_Sub14_Sub1) (Class11_Sub14_Sub1) ((Class11_Sub6) this).aClass11_Sub14_5246).aByteArray9358).length << 8);
		if (i < -1)
			i = -1;
		if (i > i_4_)
			i = i_4_;
		anInt9389 = i;
	}

	final int method2314() {
		if (anInt9383 == 0 && anInt9379 == 0)
			return 0;
		return 1;
	}

	final synchronized void method3665(int i, int i_5_, int i_6_) {
		if (i == 0)
			method3700(i_5_, i_6_);
		else {
			int i_7_ = method3685(i_5_, i_6_);
			int i_8_ = method3671(i_5_, i_6_);
			if (anInt9380 == i_7_ && anInt9381 == i_8_)
				anInt9379 = 0;
			else {
				int i_9_ = i_5_ - anInt9378;
				if (anInt9378 - i_5_ > i_9_)
					i_9_ = anInt9378 - i_5_;
				if (i_7_ - anInt9380 > i_9_)
					i_9_ = i_7_ - anInt9380;
				if (anInt9380 - i_7_ > i_9_)
					i_9_ = anInt9380 - i_7_;
				if (i_8_ - anInt9381 > i_9_)
					i_9_ = i_8_ - anInt9381;
				if (anInt9381 - i_8_ > i_9_)
					i_9_ = anInt9381 - i_8_;
				if (i > i_9_)
					i = i_9_;
				anInt9379 = i;
				anInt9383 = i_5_;
				anInt9385 = i_6_;
				anInt9377 = (i_5_ - anInt9378) / i;
				anInt9386 = (i_7_ - anInt9380) / i;
				anInt9375 = (i_8_ - anInt9381) / i;
			}
		}
	}

	final synchronized void method2318(int[] is, int i, int i_10_) {
		if (anInt9383 == 0 && anInt9379 == 0)
			method2315(i_10_);
		else {
			Class11_Sub14_Sub1 class11_sub14_sub1 = ((Class11_Sub14_Sub1) ((Class11_Sub6) this).aClass11_Sub14_5246);
			int i_11_ = anInt9384 << 8;
			int i_12_ = anInt9376 << 8;
			int i_13_ = ((((Class11_Sub14_Sub1) class11_sub14_sub1).aByteArray9358).length << 8);
			int i_14_ = i_12_ - i_11_;
			if (i_14_ <= 0)
				anInt9382 = 0;
			int i_15_ = i;
			i_10_ += i;
			if (anInt9389 < 0) {
				if (anInt9388 > 0)
					anInt9389 = 0;
				else {
					method3669();
					this.method122(-99);
					return;
				}
			}
			if (anInt9389 >= i_13_) {
				if (anInt9388 < 0)
					anInt9389 = i_13_ - 1;
				else {
					method3669();
					this.method122(-61);
					return;
				}
			}
			if (anInt9382 < 0) {
				if (aBool9387) {
					if (anInt9388 < 0) {
						i_15_ = method3698(
								is,
								i_15_,
								i_11_,
								i_10_,
								(((Class11_Sub14_Sub1) class11_sub14_sub1).aByteArray9358[anInt9384]));
						if (anInt9389 >= i_11_)
							return;
						anInt9389 = i_11_ + i_11_ - 1 - anInt9389;
						anInt9388 = -anInt9388;
					}
					for (;;) {
						i_15_ = method3662(
								is,
								i_15_,
								i_12_,
								i_10_,
								(((Class11_Sub14_Sub1) class11_sub14_sub1).aByteArray9358[anInt9376 - 1]));
						if (anInt9389 < i_12_)
							break;
						anInt9389 = i_12_ + i_12_ - 1 - anInt9389;
						anInt9388 = -anInt9388;
						i_15_ = method3698(
								is,
								i_15_,
								i_11_,
								i_10_,
								(((Class11_Sub14_Sub1) class11_sub14_sub1).aByteArray9358[anInt9384]));
						if (anInt9389 >= i_11_)
							break;
						anInt9389 = i_11_ + i_11_ - 1 - anInt9389;
						anInt9388 = -anInt9388;
					}
				} else if (anInt9388 < 0) {
					for (;;) {
						i_15_ = method3698(
								is,
								i_15_,
								i_11_,
								i_10_,
								(((Class11_Sub14_Sub1) class11_sub14_sub1).aByteArray9358[anInt9376 - 1]));
						if (anInt9389 >= i_11_)
							break;
						anInt9389 = i_12_ - 1 - (i_12_ - 1 - anInt9389) % i_14_;
					}
				} else {
					for (;;) {
						i_15_ = method3662(
								is,
								i_15_,
								i_12_,
								i_10_,
								(((Class11_Sub14_Sub1) class11_sub14_sub1).aByteArray9358[anInt9384]));
						if (anInt9389 < i_12_)
							break;
						anInt9389 = i_11_ + (anInt9389 - i_11_) % i_14_;
					}
				}
			} else {
				do {
					if (anInt9382 > 0) {
						if (aBool9387) {
							if (anInt9388 < 0) {
								i_15_ = method3698(
										is,
										i_15_,
										i_11_,
										i_10_,
										(((Class11_Sub14_Sub1) class11_sub14_sub1).aByteArray9358[anInt9384]));
								if (anInt9389 >= i_11_)
									return;
								anInt9389 = i_11_ + i_11_ - 1 - anInt9389;
								anInt9388 = -anInt9388;
								if (--anInt9382 == 0)
									break;
							}
							do {
								i_15_ = method3662(
										is,
										i_15_,
										i_12_,
										i_10_,
										(((Class11_Sub14_Sub1) class11_sub14_sub1).aByteArray9358[anInt9376 - 1]));
								if (anInt9389 < i_12_)
									return;
								anInt9389 = i_12_ + i_12_ - 1 - anInt9389;
								anInt9388 = -anInt9388;
								if (--anInt9382 == 0)
									break;
								i_15_ = method3698(
										is,
										i_15_,
										i_11_,
										i_10_,
										(((Class11_Sub14_Sub1) class11_sub14_sub1).aByteArray9358[anInt9384]));
								if (anInt9389 >= i_11_)
									return;
								anInt9389 = i_11_ + i_11_ - 1 - anInt9389;
								anInt9388 = -anInt9388;
							} while (--anInt9382 != 0);
						} else if (anInt9388 < 0) {
							for (;;) {
								i_15_ = method3698(
										is,
										i_15_,
										i_11_,
										i_10_,
										(((Class11_Sub14_Sub1) class11_sub14_sub1).aByteArray9358[anInt9376 - 1]));
								if (anInt9389 >= i_11_)
									return;
								int i_16_ = (i_12_ - 1 - anInt9389) / i_14_;
								if (i_16_ >= anInt9382) {
									anInt9389 += i_14_ * anInt9382;
									anInt9382 = 0;
									break;
								}
								anInt9389 += i_14_ * i_16_;
								anInt9382 -= i_16_;
							}
						} else {
							for (;;) {
								i_15_ = method3662(
										is,
										i_15_,
										i_12_,
										i_10_,
										(((Class11_Sub14_Sub1) class11_sub14_sub1).aByteArray9358[anInt9384]));
								if (anInt9389 < i_12_)
									return;
								int i_17_ = (anInt9389 - i_11_) / i_14_;
								if (i_17_ >= anInt9382) {
									anInt9389 -= i_14_ * anInt9382;
									anInt9382 = 0;
									break;
								}
								anInt9389 -= i_14_ * i_17_;
								anInt9382 -= i_17_;
							}
						}
					}
				} while (false);
				if (anInt9388 < 0) {
					method3698(is, i_15_, 0, i_10_, 0);
					if (anInt9389 < 0) {
						anInt9389 = -1;
						method3669();
						this.method122(-61);
					}
				} else {
					method3662(is, i_15_, i_13_, i_10_, 0);
					if (anInt9389 >= i_13_) {
						anInt9389 = i_13_;
						method3669();
						this.method122(-72);
					}
				}
			}
		}
	}

	private static final int method3666(int i, int i_18_, byte[] is,
			int[] is_19_, int i_20_, int i_21_, int i_22_, int i_23_,
			int i_24_, int i_25_, int i_26_, int i_27_, int i_28_,
			Class11_Sub6_Sub4 class11_sub6_sub4, int i_29_, int i_30_) {
		class11_sub6_sub4.anInt9378 -= class11_sub6_sub4.anInt9377 * i_21_;
		if (i_29_ == 0
				|| (i_26_ = i_21_ + (i_28_ - i_20_ + i_29_ - 257) / i_29_) > i_27_)
			i_26_ = i_27_;
		i_21_ <<= 1;
		i_26_ <<= 1;
		while (i_21_ < i_26_) {
			i_18_ = i_20_ >> 8;
			i = is[i_18_];
			i = (i << 8) + (is[i_18_ + 1] - i) * (i_20_ & 0xff);
			is_19_[i_21_++] += i * i_22_ >> 6;
			i_22_ += i_24_;
			is_19_[i_21_++] += i * i_23_ >> 6;
			i_23_ += i_25_;
			i_20_ += i_29_;
		}
		if (i_29_ == 0
				|| ((i_26_ = (i_21_ >> 1) + (i_28_ - i_20_ + i_29_ - 1) / i_29_) > i_27_))
			i_26_ = i_27_;
		i_26_ <<= 1;
		i_18_ = i_30_;
		while (i_21_ < i_26_) {
			i = is[i_20_ >> 8];
			i = (i << 8) + (i_18_ - i) * (i_20_ & 0xff);
			is_19_[i_21_++] += i * i_22_ >> 6;
			i_22_ += i_24_;
			is_19_[i_21_++] += i * i_23_ >> 6;
			i_23_ += i_25_;
			i_20_ += i_29_;
		}
		i_21_ >>= 1;
		class11_sub6_sub4.anInt9378 += class11_sub6_sub4.anInt9377 * i_21_;
		class11_sub6_sub4.anInt9380 = i_22_;
		class11_sub6_sub4.anInt9381 = i_23_;
		class11_sub6_sub4.anInt9389 = i_20_;
		return i_21_;
	}

	final Class11_Sub6 method2316() {
		return null;
	}

	private final boolean method3667() {
		int i = anInt9383;
		int i_31_;
		int i_32_;
		if (i == -2147483648)
			i = i_31_ = i_32_ = 0;
		else {
			i_31_ = method3685(i, anInt9385);
			i_32_ = method3671(i, anInt9385);
		}
		if (anInt9378 != i || anInt9380 != i_31_ || anInt9381 != i_32_) {
			if (anInt9378 < i) {
				anInt9377 = 1;
				anInt9379 = i - anInt9378;
			} else if (anInt9378 > i) {
				anInt9377 = -1;
				anInt9379 = anInt9378 - i;
			} else
				anInt9377 = 0;
			if (anInt9380 < i_31_) {
				anInt9386 = 1;
				if (anInt9379 == 0 || anInt9379 > i_31_ - anInt9380)
					anInt9379 = i_31_ - anInt9380;
			} else if (anInt9380 > i_31_) {
				anInt9386 = -1;
				if (anInt9379 == 0 || anInt9379 > anInt9380 - i_31_)
					anInt9379 = anInt9380 - i_31_;
			} else
				anInt9386 = 0;
			if (anInt9381 < i_32_) {
				anInt9375 = 1;
				if (anInt9379 == 0 || anInt9379 > i_32_ - anInt9381)
					anInt9379 = i_32_ - anInt9381;
			} else if (anInt9381 > i_32_) {
				anInt9375 = -1;
				if (anInt9379 == 0 || anInt9379 > anInt9381 - i_32_)
					anInt9379 = anInt9381 - i_32_;
			} else
				anInt9375 = 0;
			return false;
		}
		if (anInt9383 == -2147483648) {
			anInt9383 = 0;
			anInt9378 = anInt9380 = anInt9381 = 0;
			this.method122(-74);
			return true;
		}
		method3672();
		return false;
	}

	final synchronized void method3668(int i) {
		anInt9382 = i;
	}

	private final void method3669() {
		if (anInt9379 != 0) {
			if (anInt9383 == -2147483648)
				anInt9383 = 0;
			anInt9379 = 0;
			method3672();
		}
	}

	private static final int method3670(int i, byte[] is, int[] is_33_,
			int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_,
			int i_40_, int i_41_, int i_42_, Class11_Sub6_Sub4 class11_sub6_sub4) {
		i_34_ >>= 8;
		i_42_ >>= 8;
		i_36_ <<= 2;
		i_37_ <<= 2;
		i_38_ <<= 2;
		i_39_ <<= 2;
		if ((i_40_ = i_35_ + i_34_ - (i_42_ - 1)) > i_41_)
			i_40_ = i_41_;
		class11_sub6_sub4.anInt9378 += class11_sub6_sub4.anInt9377
				* (i_40_ - i_35_);
		i_35_ <<= 1;
		i_40_ <<= 1;
		i_40_ -= 6;
		while (i_35_ < i_40_) {
			i = is[i_34_--];
			is_33_[i_35_++] += i * i_36_;
			i_36_ += i_38_;
			is_33_[i_35_++] += i * i_37_;
			i_37_ += i_39_;
			i = is[i_34_--];
			is_33_[i_35_++] += i * i_36_;
			i_36_ += i_38_;
			is_33_[i_35_++] += i * i_37_;
			i_37_ += i_39_;
			i = is[i_34_--];
			is_33_[i_35_++] += i * i_36_;
			i_36_ += i_38_;
			is_33_[i_35_++] += i * i_37_;
			i_37_ += i_39_;
			i = is[i_34_--];
			is_33_[i_35_++] += i * i_36_;
			i_36_ += i_38_;
			is_33_[i_35_++] += i * i_37_;
			i_37_ += i_39_;
		}
		i_40_ += 6;
		while (i_35_ < i_40_) {
			i = is[i_34_--];
			is_33_[i_35_++] += i * i_36_;
			i_36_ += i_38_;
			is_33_[i_35_++] += i * i_37_;
			i_37_ += i_39_;
		}
		class11_sub6_sub4.anInt9380 = i_36_ >> 2;
		class11_sub6_sub4.anInt9381 = i_37_ >> 2;
		class11_sub6_sub4.anInt9389 = i_34_ << 8;
		return i_35_ >> 1;
	}

	private static final int method3671(int i, int i_43_) {
		if (i_43_ < 0)
			return -i;
		return (int) ((double) i * Math.sqrt((double) i_43_ * 1.220703125E-4) + 0.5);
	}

	private final void method3672() {
		anInt9378 = anInt9383;
		anInt9380 = method3685(anInt9383, anInt9385);
		anInt9381 = method3671(anInt9383, anInt9385);
	}

	final synchronized void method3673(int i) {
		if (i == 0) {
			method3688(0);
			this.method122(-117);
		} else if (anInt9380 == 0 && anInt9381 == 0) {
			anInt9379 = 0;
			anInt9383 = 0;
			anInt9378 = 0;
			this.method122(-83);
		} else {
			int i_44_ = -anInt9378;
			if (anInt9378 > i_44_)
				i_44_ = anInt9378;
			if (-anInt9380 > i_44_)
				i_44_ = -anInt9380;
			if (anInt9380 > i_44_)
				i_44_ = anInt9380;
			if (-anInt9381 > i_44_)
				i_44_ = -anInt9381;
			if (anInt9381 > i_44_)
				i_44_ = anInt9381;
			if (i > i_44_)
				i = i_44_;
			anInt9379 = i;
			anInt9383 = -2147483648;
			anInt9377 = -anInt9378 / i;
			anInt9386 = -anInt9380 / i;
			anInt9375 = -anInt9381 / i;
		}
	}

	static final Class11_Sub6_Sub4 method3674(
			Class11_Sub14_Sub1 class11_sub14_sub1, int i, int i_45_, int i_46_) {
		if (((Class11_Sub14_Sub1) class11_sub14_sub1).aByteArray9358 == null
				|| (((Class11_Sub14_Sub1) class11_sub14_sub1).aByteArray9358.length == 0))
			return null;
		return new Class11_Sub6_Sub4(class11_sub14_sub1, i, i_45_, i_46_);
	}

	private static final int method3675(int i, byte[] is, int[] is_47_,
			int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_,
			int i_54_, int i_55_, int i_56_, Class11_Sub6_Sub4 class11_sub6_sub4) {
		i_48_ >>= 8;
		i_56_ >>= 8;
		i_50_ <<= 2;
		i_51_ <<= 2;
		i_52_ <<= 2;
		i_53_ <<= 2;
		if ((i_54_ = i_49_ + i_56_ - i_48_) > i_55_)
			i_54_ = i_55_;
		class11_sub6_sub4.anInt9378 += class11_sub6_sub4.anInt9377
				* (i_54_ - i_49_);
		i_49_ <<= 1;
		i_54_ <<= 1;
		i_54_ -= 6;
		while (i_49_ < i_54_) {
			i = is[i_48_++];
			is_47_[i_49_++] += i * i_50_;
			i_50_ += i_52_;
			is_47_[i_49_++] += i * i_51_;
			i_51_ += i_53_;
			i = is[i_48_++];
			is_47_[i_49_++] += i * i_50_;
			i_50_ += i_52_;
			is_47_[i_49_++] += i * i_51_;
			i_51_ += i_53_;
			i = is[i_48_++];
			is_47_[i_49_++] += i * i_50_;
			i_50_ += i_52_;
			is_47_[i_49_++] += i * i_51_;
			i_51_ += i_53_;
			i = is[i_48_++];
			is_47_[i_49_++] += i * i_50_;
			i_50_ += i_52_;
			is_47_[i_49_++] += i * i_51_;
			i_51_ += i_53_;
		}
		i_54_ += 6;
		while (i_49_ < i_54_) {
			i = is[i_48_++];
			is_47_[i_49_++] += i * i_50_;
			i_50_ += i_52_;
			is_47_[i_49_++] += i * i_51_;
			i_51_ += i_53_;
		}
		class11_sub6_sub4.anInt9380 = i_50_ >> 2;
		class11_sub6_sub4.anInt9381 = i_51_ >> 2;
		class11_sub6_sub4.anInt9389 = i_48_ << 8;
		return i_49_ >> 1;
	}

	final synchronized void method3676(boolean bool) {
		anInt9388 = (anInt9388 ^ anInt9388 >> 31) + (anInt9388 >>> 31);
		if (bool)
			anInt9388 = -anInt9388;
	}

	final Class11_Sub6 method2319() {
		return null;
	}

	final synchronized void method3677(int i) {
		method3700(i << 6, method3699());
	}

	private static final int method3678(int i, int i_57_, byte[] is,
			int[] is_58_, int i_59_, int i_60_, int i_61_, int i_62_,
			int i_63_, int i_64_, Class11_Sub6_Sub4 class11_sub6_sub4,
			int i_65_, int i_66_) {
		if (i_65_ == 0
				|| (i_62_ = i_60_ + (i_64_ - i_59_ + i_65_ - 257) / i_65_) > i_63_)
			i_62_ = i_63_;
		while (i_60_ < i_62_) {
			i_57_ = i_59_ >> 8;
			i = is[i_57_];
			is_58_[i_60_++] += (((i << 8) + (is[i_57_ + 1] - i)
					* (i_59_ & 0xff))
					* i_61_ >> 6);
			i_59_ += i_65_;
		}
		if (i_65_ == 0
				|| (i_62_ = i_60_ + (i_64_ - i_59_ + i_65_ - 1) / i_65_) > i_63_)
			i_62_ = i_63_;
		i_57_ = i_66_;
		while (i_60_ < i_62_) {
			i = is[i_59_ >> 8];
			is_58_[i_60_++] += ((i << 8) + (i_57_ - i) * (i_59_ & 0xff))
					* i_61_ >> 6;
			i_59_ += i_65_;
		}
		class11_sub6_sub4.anInt9389 = i_59_;
		return i_60_;
	}

	final synchronized void method3679(int i) {
		method3700(method3694(), i);
	}

	final synchronized int method3680() {
		if (anInt9388 < 0)
			return -anInt9388;
		return anInt9388;
	}

	final synchronized void method3681(int i, int i_67_) {
		method3665(i, i_67_, method3699());
	}

	private static final int method3682(byte[] is, int[] is_68_, int i,
			int i_69_, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_,
			Class11_Sub6_Sub4 class11_sub6_sub4) {
		i >>= 8;
		i_74_ >>= 8;
		i_70_ <<= 2;
		i_71_ <<= 2;
		if ((i_72_ = i_69_ + i - (i_74_ - 1)) > i_73_)
			i_72_ = i_73_;
		class11_sub6_sub4.anInt9380 += class11_sub6_sub4.anInt9386
				* (i_72_ - i_69_);
		class11_sub6_sub4.anInt9381 += class11_sub6_sub4.anInt9375
				* (i_72_ - i_69_);
		i_72_ -= 3;
		while (i_69_ < i_72_) {
			is_68_[i_69_++] += is[i--] * i_70_;
			i_70_ += i_71_;
			is_68_[i_69_++] += is[i--] * i_70_;
			i_70_ += i_71_;
			is_68_[i_69_++] += is[i--] * i_70_;
			i_70_ += i_71_;
			is_68_[i_69_++] += is[i--] * i_70_;
			i_70_ += i_71_;
		}
		i_72_ += 3;
		while (i_69_ < i_72_) {
			is_68_[i_69_++] += is[i--] * i_70_;
			i_70_ += i_71_;
		}
		class11_sub6_sub4.anInt9378 = i_70_ >> 2;
		class11_sub6_sub4.anInt9389 = i << 8;
		return i_69_;
	}

	private static final int method3683(byte[] is, int[] is_75_, int i,
			int i_76_, int i_77_, int i_78_, int i_79_, int i_80_,
			Class11_Sub6_Sub4 class11_sub6_sub4) {
		i >>= 8;
		i_80_ >>= 8;
		i_77_ <<= 2;
		if ((i_78_ = i_76_ + i_80_ - i) > i_79_)
			i_78_ = i_79_;
		i_78_ -= 3;
		while (i_76_ < i_78_) {
			is_75_[i_76_++] += is[i++] * i_77_;
			is_75_[i_76_++] += is[i++] * i_77_;
			is_75_[i_76_++] += is[i++] * i_77_;
			is_75_[i_76_++] += is[i++] * i_77_;
		}
		i_78_ += 3;
		while (i_76_ < i_78_)
			is_75_[i_76_++] += is[i++] * i_77_;
		class11_sub6_sub4.anInt9389 = i << 8;
		return i_76_;
	}

	final boolean method3684() {
		if (anInt9389 >= 0
				&& anInt9389 < (((Class11_Sub14_Sub1) (Class11_Sub14_Sub1) ((Class11_Sub6) this).aClass11_Sub14_5246).aByteArray9358).length << 8)
			return false;
		return true;
	}

	private static final int method3685(int i, int i_81_) {
		if (i_81_ < 0)
			return i;
		return (int) (((double) i * Math
				.sqrt((double) (16384 - i_81_) * 1.220703125E-4)) + 0.5);
	}

	private static final int method3686(int i, int i_82_, byte[] is,
			int[] is_83_, int i_84_, int i_85_, int i_86_, int i_87_,
			int i_88_, int i_89_, int i_90_,
			Class11_Sub6_Sub4 class11_sub6_sub4, int i_91_, int i_92_) {
		class11_sub6_sub4.anInt9380 -= class11_sub6_sub4.anInt9386 * i_85_;
		class11_sub6_sub4.anInt9381 -= class11_sub6_sub4.anInt9375 * i_85_;
		if (i_91_ == 0
				|| (i_88_ = i_85_ + (i_90_ + 256 - i_84_ + i_91_) / i_91_) > i_89_)
			i_88_ = i_89_;
		while (i_85_ < i_88_) {
			i_82_ = i_84_ >> 8;
			i = is[i_82_ - 1];
			is_83_[i_85_++] += ((i << 8) + (is[i_82_] - i) * (i_84_ & 0xff))
					* i_86_ >> 6;
			i_86_ += i_87_;
			i_84_ += i_91_;
		}
		if (i_91_ == 0
				|| (i_88_ = i_85_ + (i_90_ - i_84_ + i_91_) / i_91_) > i_89_)
			i_88_ = i_89_;
		i = i_92_;
		i_82_ = i_91_;
		while (i_85_ < i_88_) {
			is_83_[i_85_++] += (((i << 8) + (is[i_84_ >> 8] - i)
					* (i_84_ & 0xff))
					* i_86_ >> 6);
			i_86_ += i_87_;
			i_84_ += i_82_;
		}
		class11_sub6_sub4.anInt9380 += class11_sub6_sub4.anInt9386 * i_85_;
		class11_sub6_sub4.anInt9381 += class11_sub6_sub4.anInt9375 * i_85_;
		class11_sub6_sub4.anInt9378 = i_86_;
		class11_sub6_sub4.anInt9389 = i_84_;
		return i_85_;
	}

	private static final int method3687(byte[] is, int[] is_93_, int i,
			int i_94_, int i_95_, int i_96_, int i_97_, int i_98_,
			Class11_Sub6_Sub4 class11_sub6_sub4) {
		i >>= 8;
		i_98_ >>= 8;
		i_95_ <<= 2;
		if ((i_96_ = i_94_ + i - (i_98_ - 1)) > i_97_)
			i_96_ = i_97_;
		i_96_ -= 3;
		while (i_94_ < i_96_) {
			is_93_[i_94_++] += is[i--] * i_95_;
			is_93_[i_94_++] += is[i--] * i_95_;
			is_93_[i_94_++] += is[i--] * i_95_;
			is_93_[i_94_++] += is[i--] * i_95_;
		}
		i_96_ += 3;
		while (i_94_ < i_96_)
			is_93_[i_94_++] += is[i--] * i_95_;
		class11_sub6_sub4.anInt9389 = i << 8;
		return i_94_;
	}

	private final synchronized void method3688(int i) {
		method3700(i, method3699());
	}

	private static final int method3689(int i, byte[] is, int[] is_99_,
			int i_100_, int i_101_, int i_102_, int i_103_, int i_104_,
			int i_105_, int i_106_, Class11_Sub6_Sub4 class11_sub6_sub4) {
		i_100_ >>= 8;
		i_106_ >>= 8;
		i_102_ <<= 2;
		i_103_ <<= 2;
		if ((i_104_ = i_101_ + i_106_ - i_100_) > i_105_)
			i_104_ = i_105_;
		i_101_ <<= 1;
		i_104_ <<= 1;
		i_104_ -= 6;
		while (i_101_ < i_104_) {
			i = is[i_100_++];
			is_99_[i_101_++] += i * i_102_;
			is_99_[i_101_++] += i * i_103_;
			i = is[i_100_++];
			is_99_[i_101_++] += i * i_102_;
			is_99_[i_101_++] += i * i_103_;
			i = is[i_100_++];
			is_99_[i_101_++] += i * i_102_;
			is_99_[i_101_++] += i * i_103_;
			i = is[i_100_++];
			is_99_[i_101_++] += i * i_102_;
			is_99_[i_101_++] += i * i_103_;
		}
		i_104_ += 6;
		while (i_101_ < i_104_) {
			i = is[i_100_++];
			is_99_[i_101_++] += i * i_102_;
			is_99_[i_101_++] += i * i_103_;
		}
		class11_sub6_sub4.anInt9389 = i_100_ << 8;
		return i_101_ >> 1;
	}

	private static final int method3690(int i, int i_107_, byte[] is,
			int[] is_108_, int i_109_, int i_110_, int i_111_, int i_112_,
			int i_113_, int i_114_, int i_115_,
			Class11_Sub6_Sub4 class11_sub6_sub4, int i_116_, int i_117_) {
		class11_sub6_sub4.anInt9380 -= class11_sub6_sub4.anInt9386 * i_110_;
		class11_sub6_sub4.anInt9381 -= class11_sub6_sub4.anInt9375 * i_110_;
		if (i_116_ == 0
				|| ((i_113_ = i_110_ + (i_115_ - i_109_ + i_116_ - 257)
						/ i_116_) > i_114_))
			i_113_ = i_114_;
		while (i_110_ < i_113_) {
			i_107_ = i_109_ >> 8;
			i = is[i_107_];
			is_108_[i_110_++] += (((i << 8) + (is[i_107_ + 1] - i)
					* (i_109_ & 0xff)) * i_111_) >> 6;
			i_111_ += i_112_;
			i_109_ += i_116_;
		}
		if (i_116_ == 0
				|| ((i_113_ = i_110_ + (i_115_ - i_109_ + i_116_ - 1) / i_116_) > i_114_))
			i_113_ = i_114_;
		i_107_ = i_117_;
		while (i_110_ < i_113_) {
			i = is[i_109_ >> 8];
			is_108_[i_110_++] += ((i << 8) + (i_107_ - i) * (i_109_ & 0xff))
					* i_111_ >> 6;
			i_111_ += i_112_;
			i_109_ += i_116_;
		}
		class11_sub6_sub4.anInt9380 += class11_sub6_sub4.anInt9386 * i_110_;
		class11_sub6_sub4.anInt9381 += class11_sub6_sub4.anInt9375 * i_110_;
		class11_sub6_sub4.anInt9378 = i_111_;
		class11_sub6_sub4.anInt9389 = i_109_;
		return i_110_;
	}

	final synchronized void method2315(int i) {
		if (anInt9379 > 0) {
			if (i >= anInt9379) {
				if (anInt9383 == -2147483648) {
					anInt9383 = 0;
					anInt9378 = anInt9380 = anInt9381 = 0;
					this.method122(-36);
					i = anInt9379;
				}
				anInt9379 = 0;
				method3672();
			} else {
				anInt9378 += anInt9377 * i;
				anInt9380 += anInt9386 * i;
				anInt9381 += anInt9375 * i;
				anInt9379 -= i;
			}
		}
		Class11_Sub14_Sub1 class11_sub14_sub1 = (Class11_Sub14_Sub1) ((Class11_Sub6) this).aClass11_Sub14_5246;
		int i_118_ = anInt9384 << 8;
		int i_119_ = anInt9376 << 8;
		int i_120_ = (((Class11_Sub14_Sub1) class11_sub14_sub1).aByteArray9358.length << 8);
		int i_121_ = i_119_ - i_118_;
		if (i_121_ <= 0)
			anInt9382 = 0;
		if (anInt9389 < 0) {
			if (anInt9388 > 0)
				anInt9389 = 0;
			else {
				method3669();
				this.method122(-92);
				return;
			}
		}
		if (anInt9389 >= i_120_) {
			if (anInt9388 < 0)
				anInt9389 = i_120_ - 1;
			else {
				method3669();
				this.method122(-122);
				return;
			}
		}
		anInt9389 += anInt9388 * i;
		if (anInt9382 < 0) {
			if (aBool9387) {
				if (anInt9388 < 0) {
					if (anInt9389 >= i_118_)
						return;
					anInt9389 = i_118_ + i_118_ - 1 - anInt9389;
					anInt9388 = -anInt9388;
				}
				while (anInt9389 >= i_119_) {
					anInt9389 = i_119_ + i_119_ - 1 - anInt9389;
					anInt9388 = -anInt9388;
					if (anInt9389 >= i_118_)
						break;
					anInt9389 = i_118_ + i_118_ - 1 - anInt9389;
					anInt9388 = -anInt9388;
				}
			} else if (anInt9388 < 0) {
				if (anInt9389 < i_118_)
					anInt9389 = i_119_ - 1 - (i_119_ - 1 - anInt9389) % i_121_;
			} else if (anInt9389 >= i_119_)
				anInt9389 = i_118_ + (anInt9389 - i_118_) % i_121_;
		} else {
			do {
				if (anInt9382 > 0) {
					if (aBool9387) {
						if (anInt9388 < 0) {
							if (anInt9389 >= i_118_)
								return;
							anInt9389 = i_118_ + i_118_ - 1 - anInt9389;
							anInt9388 = -anInt9388;
							if (--anInt9382 == 0)
								break;
						}
						do {
							if (anInt9389 < i_119_)
								return;
							anInt9389 = i_119_ + i_119_ - 1 - anInt9389;
							anInt9388 = -anInt9388;
							if (--anInt9382 == 0)
								break;
							if (anInt9389 >= i_118_)
								return;
							anInt9389 = i_118_ + i_118_ - 1 - anInt9389;
							anInt9388 = -anInt9388;
						} while (--anInt9382 != 0);
					} else if (anInt9388 < 0) {
						if (anInt9389 >= i_118_)
							return;
						int i_122_ = (i_119_ - 1 - anInt9389) / i_121_;
						if (i_122_ >= anInt9382) {
							anInt9389 += i_121_ * anInt9382;
							anInt9382 = 0;
						} else {
							anInt9389 += i_121_ * i_122_;
							anInt9382 -= i_122_;
							return;
						}
					} else {
						if (anInt9389 < i_119_)
							return;
						int i_123_ = (anInt9389 - i_118_) / i_121_;
						if (i_123_ >= anInt9382) {
							anInt9389 -= i_121_ * anInt9382;
							anInt9382 = 0;
						} else {
							anInt9389 -= i_121_ * i_123_;
							anInt9382 -= i_123_;
							return;
						}
					}
				}
			} while (false);
			if (anInt9388 < 0) {
				if (anInt9389 < 0) {
					anInt9389 = -1;
					method3669();
					this.method122(-68);
				}
			} else if (anInt9389 >= i_120_) {
				anInt9389 = i_120_;
				method3669();
				this.method122(-42);
			}
		}
	}

	private static final int method3691(int i, int i_124_, byte[] is,
			int[] is_125_, int i_126_, int i_127_, int i_128_, int i_129_,
			int i_130_, int i_131_, int i_132_, int i_133_, int i_134_,
			Class11_Sub6_Sub4 class11_sub6_sub4, int i_135_, int i_136_) {
		class11_sub6_sub4.anInt9378 -= class11_sub6_sub4.anInt9377 * i_127_;
		if (i_135_ == 0
				|| ((i_132_ = i_127_ + (i_134_ + 256 - i_126_ + i_135_)
						/ i_135_) > i_133_))
			i_132_ = i_133_;
		i_127_ <<= 1;
		i_132_ <<= 1;
		while (i_127_ < i_132_) {
			i_124_ = i_126_ >> 8;
			i = is[i_124_ - 1];
			i = (i << 8) + (is[i_124_] - i) * (i_126_ & 0xff);
			is_125_[i_127_++] += i * i_128_ >> 6;
			i_128_ += i_130_;
			is_125_[i_127_++] += i * i_129_ >> 6;
			i_129_ += i_131_;
			i_126_ += i_135_;
		}
		if (i_135_ == 0
				|| ((i_132_ = (i_127_ >> 1) + (i_134_ - i_126_ + i_135_)
						/ i_135_) > i_133_))
			i_132_ = i_133_;
		i_132_ <<= 1;
		i_124_ = i_136_;
		while (i_127_ < i_132_) {
			i = (i_124_ << 8) + (is[i_126_ >> 8] - i_124_) * (i_126_ & 0xff);
			is_125_[i_127_++] += i * i_128_ >> 6;
			i_128_ += i_130_;
			is_125_[i_127_++] += i * i_129_ >> 6;
			i_129_ += i_131_;
			i_126_ += i_135_;
		}
		i_127_ >>= 1;
		class11_sub6_sub4.anInt9378 += class11_sub6_sub4.anInt9377 * i_127_;
		class11_sub6_sub4.anInt9380 = i_128_;
		class11_sub6_sub4.anInt9381 = i_129_;
		class11_sub6_sub4.anInt9389 = i_126_;
		return i_127_;
	}

	final int method2317() {
		int i = anInt9378 * 3 >> 6;
		i = (i ^ i >> 31) + (i >>> 31);
		if (anInt9382 == 0)
			i -= i
					* anInt9389
					/ ((((Class11_Sub14_Sub1) (Class11_Sub14_Sub1) ((Class11_Sub6) this).aClass11_Sub14_5246).aByteArray9358).length << 8);
		else if (anInt9382 >= 0)
			i -= i
					* anInt9384
					/ (((Class11_Sub14_Sub1) (Class11_Sub14_Sub1) ((Class11_Sub6) this).aClass11_Sub14_5246).aByteArray9358).length;
		if (i > 255)
			return 255;
		return i;
	}

	private static final int method3692(int i, int i_137_, byte[] is,
			int[] is_138_, int i_139_, int i_140_, int i_141_, int i_142_,
			int i_143_, int i_144_, int i_145_,
			Class11_Sub6_Sub4 class11_sub6_sub4, int i_146_, int i_147_) {
		if (i_146_ == 0
				|| ((i_143_ = i_140_ + (i_145_ - i_139_ + i_146_ - 257)
						/ i_146_) > i_144_))
			i_143_ = i_144_;
		i_140_ <<= 1;
		i_143_ <<= 1;
		while (i_140_ < i_143_) {
			i_137_ = i_139_ >> 8;
			i = is[i_137_];
			i = (i << 8) + (is[i_137_ + 1] - i) * (i_139_ & 0xff);
			is_138_[i_140_++] += i * i_141_ >> 6;
			is_138_[i_140_++] += i * i_142_ >> 6;
			i_139_ += i_146_;
		}
		if (i_146_ == 0
				|| (i_143_ = (i_140_ >> 1) + (i_145_ - i_139_ + i_146_ - 1)
						/ i_146_) > i_144_)
			i_143_ = i_144_;
		i_143_ <<= 1;
		i_137_ = i_147_;
		while (i_140_ < i_143_) {
			i = is[i_139_ >> 8];
			i = (i << 8) + (i_137_ - i) * (i_139_ & 0xff);
			is_138_[i_140_++] += i * i_141_ >> 6;
			is_138_[i_140_++] += i * i_142_ >> 6;
			i_139_ += i_146_;
		}
		class11_sub6_sub4.anInt9389 = i_139_;
		return i_140_ >> 1;
	}

	private static final int method3693(byte[] is, int[] is_148_, int i,
			int i_149_, int i_150_, int i_151_, int i_152_, int i_153_,
			int i_154_, Class11_Sub6_Sub4 class11_sub6_sub4) {
		i >>= 8;
		i_154_ >>= 8;
		i_150_ <<= 2;
		i_151_ <<= 2;
		if ((i_152_ = i_149_ + i_154_ - i) > i_153_)
			i_152_ = i_153_;
		class11_sub6_sub4.anInt9380 += class11_sub6_sub4.anInt9386
				* (i_152_ - i_149_);
		class11_sub6_sub4.anInt9381 += class11_sub6_sub4.anInt9375
				* (i_152_ - i_149_);
		i_152_ -= 3;
		while (i_149_ < i_152_) {
			is_148_[i_149_++] += is[i++] * i_150_;
			i_150_ += i_151_;
			is_148_[i_149_++] += is[i++] * i_150_;
			i_150_ += i_151_;
			is_148_[i_149_++] += is[i++] * i_150_;
			i_150_ += i_151_;
			is_148_[i_149_++] += is[i++] * i_150_;
			i_150_ += i_151_;
		}
		i_152_ += 3;
		while (i_149_ < i_152_) {
			is_148_[i_149_++] += is[i++] * i_150_;
			i_150_ += i_151_;
		}
		class11_sub6_sub4.anInt9378 = i_150_ >> 2;
		class11_sub6_sub4.anInt9389 = i << 8;
		return i_149_;
	}

	final synchronized int method3694() {
		if (anInt9383 == -2147483648)
			return 0;
		return anInt9383;
	}

	private static final int method3695(int i, int i_155_, byte[] is,
			int[] is_156_, int i_157_, int i_158_, int i_159_, int i_160_,
			int i_161_, int i_162_, int i_163_,
			Class11_Sub6_Sub4 class11_sub6_sub4, int i_164_, int i_165_) {
		if (i_164_ == 0
				|| ((i_161_ = i_158_ + (i_163_ + 256 - i_157_ + i_164_)
						/ i_164_) > i_162_))
			i_161_ = i_162_;
		i_158_ <<= 1;
		i_161_ <<= 1;
		while (i_158_ < i_161_) {
			i_155_ = i_157_ >> 8;
			i = is[i_155_ - 1];
			i = (i << 8) + (is[i_155_] - i) * (i_157_ & 0xff);
			is_156_[i_158_++] += i * i_159_ >> 6;
			is_156_[i_158_++] += i * i_160_ >> 6;
			i_157_ += i_164_;
		}
		if (i_164_ == 0
				|| ((i_161_ = (i_158_ >> 1) + (i_163_ - i_157_ + i_164_)
						/ i_164_) > i_162_))
			i_161_ = i_162_;
		i_161_ <<= 1;
		i_155_ = i_165_;
		while (i_158_ < i_161_) {
			i = (i_155_ << 8) + (is[i_157_ >> 8] - i_155_) * (i_157_ & 0xff);
			is_156_[i_158_++] += i * i_159_ >> 6;
			is_156_[i_158_++] += i * i_160_ >> 6;
			i_157_ += i_164_;
		}
		class11_sub6_sub4.anInt9389 = i_157_;
		return i_158_ >> 1;
	}

	private static final int method3696(int i, int i_166_, byte[] is,
			int[] is_167_, int i_168_, int i_169_, int i_170_, int i_171_,
			int i_172_, int i_173_, Class11_Sub6_Sub4 class11_sub6_sub4,
			int i_174_, int i_175_) {
		if (i_174_ == 0
				|| ((i_171_ = i_169_ + (i_173_ + 256 - i_168_ + i_174_)
						/ i_174_) > i_172_))
			i_171_ = i_172_;
		while (i_169_ < i_171_) {
			i_166_ = i_168_ >> 8;
			i = is[i_166_ - 1];
			is_167_[i_169_++] += (((i << 8) + (is[i_166_] - i)
					* (i_168_ & 0xff))
					* i_170_ >> 6);
			i_168_ += i_174_;
		}
		if (i_174_ == 0
				|| ((i_171_ = i_169_ + (i_173_ - i_168_ + i_174_) / i_174_) > i_172_))
			i_171_ = i_172_;
		i = i_175_;
		i_166_ = i_174_;
		while (i_169_ < i_171_) {
			is_167_[i_169_++] += (((i << 8) + (is[i_168_ >> 8] - i)
					* (i_168_ & 0xff)) * i_170_) >> 6;
			i_168_ += i_166_;
		}
		class11_sub6_sub4.anInt9389 = i_168_;
		return i_169_;
	}

	private static final int method3697(int i, byte[] is, int[] is_176_,
			int i_177_, int i_178_, int i_179_, int i_180_, int i_181_,
			int i_182_, int i_183_, Class11_Sub6_Sub4 class11_sub6_sub4) {
		i_177_ >>= 8;
		i_183_ >>= 8;
		i_179_ <<= 2;
		i_180_ <<= 2;
		if ((i_181_ = i_178_ + i_177_ - (i_183_ - 1)) > i_182_)
			i_181_ = i_182_;
		i_178_ <<= 1;
		i_181_ <<= 1;
		i_181_ -= 6;
		while (i_178_ < i_181_) {
			i = is[i_177_--];
			is_176_[i_178_++] += i * i_179_;
			is_176_[i_178_++] += i * i_180_;
			i = is[i_177_--];
			is_176_[i_178_++] += i * i_179_;
			is_176_[i_178_++] += i * i_180_;
			i = is[i_177_--];
			is_176_[i_178_++] += i * i_179_;
			is_176_[i_178_++] += i * i_180_;
			i = is[i_177_--];
			is_176_[i_178_++] += i * i_179_;
			is_176_[i_178_++] += i * i_180_;
		}
		i_181_ += 6;
		while (i_178_ < i_181_) {
			i = is[i_177_--];
			is_176_[i_178_++] += i * i_179_;
			is_176_[i_178_++] += i * i_180_;
		}
		class11_sub6_sub4.anInt9389 = i_177_ << 8;
		return i_178_ >> 1;
	}

	private final int method3698(int[] is, int i, int i_184_, int i_185_,
			int i_186_) {
		while (anInt9379 > 0) {
			int i_187_ = i + anInt9379;
			if (i_187_ > i_185_)
				i_187_ = i_185_;
			anInt9379 += i;
			if (anInt9388 == -256 && (anInt9389 & 0xff) == 0) {
				if (Class236_Sub1.aBool6092)
					i = method3670(
							0,
							(((Class11_Sub14_Sub1) (Class11_Sub14_Sub1) ((Class11_Sub6) this).aClass11_Sub14_5246).aByteArray9358),
							is, anInt9389, i, anInt9380, anInt9381, anInt9386,
							anInt9375, 0, i_187_, i_184_, this);
				else
					i = method3682(
							(((Class11_Sub14_Sub1) (Class11_Sub14_Sub1) ((Class11_Sub6) this).aClass11_Sub14_5246).aByteArray9358),
							is, anInt9389, i, anInt9378, anInt9377, 0, i_187_,
							i_184_, this);
			} else if (Class236_Sub1.aBool6092)
				i = method3691(
						0,
						0,
						(((Class11_Sub14_Sub1) (Class11_Sub14_Sub1) ((Class11_Sub6) this).aClass11_Sub14_5246).aByteArray9358),
						is, anInt9389, i, anInt9380, anInt9381, anInt9386,
						anInt9375, 0, i_187_, i_184_, this, anInt9388, i_186_);
			else
				i = method3686(
						0,
						0,
						(((Class11_Sub14_Sub1) (Class11_Sub14_Sub1) ((Class11_Sub6) this).aClass11_Sub14_5246).aByteArray9358),
						is, anInt9389, i, anInt9378, anInt9377, 0, i_187_,
						i_184_, this, anInt9388, i_186_);
			anInt9379 -= i;
			if (anInt9379 != 0)
				return i;
			if (method3667())
				return i_185_;
		}
		if (anInt9388 == -256 && (anInt9389 & 0xff) == 0) {
			if (Class236_Sub1.aBool6092)
				return method3697(
						0,
						(((Class11_Sub14_Sub1) (Class11_Sub14_Sub1) ((Class11_Sub6) this).aClass11_Sub14_5246).aByteArray9358),
						is, anInt9389, i, anInt9380, anInt9381, 0, i_185_,
						i_184_, this);
			return method3687(
					(((Class11_Sub14_Sub1) (Class11_Sub14_Sub1) ((Class11_Sub6) this).aClass11_Sub14_5246).aByteArray9358),
					is, anInt9389, i, anInt9378, 0, i_185_, i_184_, this);
		}
		if (Class236_Sub1.aBool6092)
			return method3695(
					0,
					0,
					(((Class11_Sub14_Sub1) (Class11_Sub14_Sub1) ((Class11_Sub6) this).aClass11_Sub14_5246).aByteArray9358),
					is, anInt9389, i, anInt9380, anInt9381, 0, i_185_, i_184_,
					this, anInt9388, i_186_);
		return method3696(
				0,
				0,
				(((Class11_Sub14_Sub1) (Class11_Sub14_Sub1) ((Class11_Sub6) this).aClass11_Sub14_5246).aByteArray9358),
				is, anInt9389, i, anInt9378, 0, i_185_, i_184_, this,
				anInt9388, i_186_);
	}

	final synchronized int method3699() {
		if (anInt9385 < 0)
			return -1;
		return anInt9385;
	}

	private final synchronized void method3700(int i, int i_188_) {
		anInt9383 = i;
		anInt9385 = i_188_;
		anInt9379 = 0;
		method3672();
	}

	final synchronized void method3701(int i) {
		if (anInt9388 < 0)
			anInt9388 = -i;
		else
			anInt9388 = i;
	}

	private Class11_Sub6_Sub4(Class11_Sub14_Sub1 class11_sub14_sub1, int i,
			int i_189_, int i_190_) {
		((Class11_Sub6) this).aClass11_Sub14_5246 = class11_sub14_sub1;
		anInt9384 = ((Class11_Sub14_Sub1) class11_sub14_sub1).anInt9357;
		anInt9376 = ((Class11_Sub14_Sub1) class11_sub14_sub1).anInt9356;
		aBool9387 = ((Class11_Sub14_Sub1) class11_sub14_sub1).aBool9359;
		anInt9388 = i;
		anInt9383 = i_189_;
		anInt9385 = i_190_;
		anInt9389 = 0;
		method3672();
	}
}
