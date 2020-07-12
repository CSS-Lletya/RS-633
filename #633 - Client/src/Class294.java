/* Class294 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class294 {
	private static int anInt3972;
	private static int anInt3973;
	private static int anInt3974;
	private static int[] anIntArray3975;
	private static int anInt3976;
	private static int anInt3977;
	private static int anInt3978;
	private static int anInt3979;

	static final void method1818(Class163 class163, int[] is, int i,
			int[] is_0_, int[] is_1_) {
		method1823(class163, is, 0, is.length, i, is_0_, is_1_);
	}

	private static final void method1819() {
		anInt3972 = 0;
	}

	public static void method1820() {
		anIntArray3975 = null;
	}

	private static final void method1821(int[] is, int i, int i_2_) {
		int i_3_ = anInt3972 + (i_2_ << 1);
		if (anIntArray3975 == null || anIntArray3975.length < i_3_) {
			int[] is_4_ = new int[i_3_];
			for (int i_5_ = 0; i_5_ < anInt3972; i_5_++)
				is_4_[i_5_] = anIntArray3975[i_5_];
			anIntArray3975 = is_4_;
		}
		i_2_ += i;
		int i_6_ = i_2_ - 2;
		for (int i_7_ = i; i_7_ < i_2_; i_7_ += 2) {
			int i_8_ = is[i_6_ + 1];
			int i_9_ = is[i_7_ + 1];
			if (i_8_ < i_9_) {
				anIntArray3975[anInt3972++] = is[i_6_];
				anIntArray3975[anInt3972++] = i_8_;
				anIntArray3975[anInt3972++] = is[i_7_];
				anIntArray3975[anInt3972++] = i_9_;
			} else if (i_9_ < i_8_) {
				anIntArray3975[anInt3972++] = is[i_7_];
				anIntArray3975[anInt3972++] = i_9_;
				anIntArray3975[anInt3972++] = is[i_6_];
				anIntArray3975[anInt3972++] = i_8_;
			}
			i_6_ = i_7_;
		}
	}

	static final void method1822(Class163 class163, int[] is, int i) {
		method1823(class163, is, 0, is.length, i, null, null);
	}

	private static final void method1823(Class163 class163, int[] is, int i,
			int i_10_, int i_11_, int[] is_12_, int[] is_13_) {
		int[] is_14_ = new int[4];
		class163.K(is_14_);
		if (is_12_ != null && is_14_[3] - is_14_[1] != is_12_.length)
			throw new IllegalStateException();
		method1819();
		method1821(is, i, i_10_);
		method1827(is_14_[1]);
		while (method1824(is_14_[3])) {
			int i_15_ = anInt3977;
			int i_16_ = anInt3979;
			int i_17_ = anInt3976;
			if (is_12_ != null) {
				int i_18_ = i_17_ - is_14_[1];
				if (i_15_ < is_12_[i_18_] + is_14_[0])
					i_15_ = is_12_[i_18_] + is_14_[0];
				if (i_16_ > is_12_[i_18_] + is_13_[i_18_] + is_14_[0])
					i_16_ = is_12_[i_18_] + is_13_[i_18_] + is_14_[0];
				if (i_16_ - i_15_ <= 0)
					continue;
			}
			class163.U(i_15_, i_17_, i_16_ - i_15_, i_11_, 1);
		}
	}

	private static final boolean method1824(int i) {
		int i_19_ = anInt3973;
		int i_20_ = anInt3974;
		int i_21_ = anInt3976;
		int i_22_;
		for (/**/; i_20_ >= i_19_; i_20_ = i_22_) {
			anInt3976 = ++i_21_;
			if (i_21_ >= i)
				return false;
			i_22_ = anInt3978;
			for (/**/; i_19_ < anInt3972; i_19_ += 4) {
				int i_23_ = anIntArray3975[i_19_ + 1];
				if (i_21_ < i_23_)
					break;
				int i_24_ = anIntArray3975[i_19_];
				int i_25_ = anIntArray3975[i_19_ + 2];
				int i_26_ = anIntArray3975[i_19_ + 3];
				int i_27_ = (i_25_ - i_24_ << 16) / (i_26_ - i_23_);
				int i_28_ = (i_24_ << 16) + 32768;
				anIntArray3975[i_19_] = i_28_;
				anIntArray3975[i_19_ + 2] = i_27_;
			}
			for (int i_29_ = i_22_; i_29_ < i_19_; i_29_ += 4) {
				int i_30_ = anIntArray3975[i_29_ + 3];
				if (i_21_ >= i_30_) {
					anIntArray3975[i_29_] = anIntArray3975[i_22_];
					anIntArray3975[i_29_ + 1] = anIntArray3975[i_22_ + 1];
					anIntArray3975[i_29_ + 2] = anIntArray3975[i_22_ + 2];
					anIntArray3975[i_29_ + 3] = anIntArray3975[i_22_ + 3];
					i_22_ += 4;
				}
			}
			if (i_22_ == anInt3972) {
				anInt3972 = 0;
				return false;
			}
			method1826(i_22_, i_19_);
			anInt3978 = i_22_;
			anInt3973 = i_19_;
		}
		anInt3977 = anIntArray3975[i_20_] >> 16;
		anInt3979 = anIntArray3975[i_20_ + 4] >> 16;
		anIntArray3975[i_20_] += anIntArray3975[i_20_ + 2];
		anIntArray3975[i_20_ + 4] += anIntArray3975[i_20_ + 6];
		i_20_ += 8;
		anInt3974 = i_20_;
		return true;
	}

	private static final void method1825(int i, int i_31_) {
		if (i_31_ > i + 4) {
			int i_32_ = i;
			int i_33_ = anIntArray3975[i_32_];
			int i_34_ = anIntArray3975[i_32_ + 1];
			int i_35_ = anIntArray3975[i_32_ + 2];
			int i_36_ = anIntArray3975[i_32_ + 3];
			for (int i_37_ = i + 4; i_37_ < i_31_; i_37_ += 4) {
				int i_38_ = anIntArray3975[i_37_ + 1];
				if (i_38_ < i_34_) {
					anIntArray3975[i_32_] = anIntArray3975[i_37_];
					anIntArray3975[i_32_ + 1] = i_38_;
					anIntArray3975[i_32_ + 2] = anIntArray3975[i_37_ + 2];
					anIntArray3975[i_32_ + 3] = anIntArray3975[i_37_ + 3];
					i_32_ += 4;
					anIntArray3975[i_37_] = anIntArray3975[i_32_];
					anIntArray3975[i_37_ + 1] = anIntArray3975[i_32_ + 1];
					anIntArray3975[i_37_ + 2] = anIntArray3975[i_32_ + 2];
					anIntArray3975[i_37_ + 3] = anIntArray3975[i_32_ + 3];
				}
			}
			anIntArray3975[i_32_] = i_33_;
			anIntArray3975[i_32_ + 1] = i_34_;
			anIntArray3975[i_32_ + 2] = i_35_;
			anIntArray3975[i_32_ + 3] = i_36_;
			method1825(i, i_32_);
			method1825(i_32_ + 4, i_31_);
		}
	}

	private static final void method1826(int i, int i_39_) {
		for (/**/; i_39_ >= i + 8; i_39_ -= 4) {
			boolean bool = true;
			for (int i_40_ = i + 4; i_40_ < i_39_; i_40_ += 4) {
				int i_41_ = anIntArray3975[i_40_ - 4];
				int i_42_ = anIntArray3975[i_40_];
				if (i_41_ > i_42_) {
					bool = false;
					anIntArray3975[i_40_ - 4] = i_42_;
					anIntArray3975[i_40_] = i_41_;
					i_41_ = anIntArray3975[i_40_ - 2];
					anIntArray3975[i_40_ - 2] = anIntArray3975[i_40_ + 2];
					anIntArray3975[i_40_ + 2] = i_41_;
					i_41_ = anIntArray3975[i_40_ - 1];
					anIntArray3975[i_40_ - 1] = anIntArray3975[i_40_ + 3];
					anIntArray3975[i_40_ + 3] = i_41_;
				}
			}
			if (bool)
				break;
		}
	}

	private static final void method1827(int i) {
		if (anInt3972 < 0) {
			anInt3978 = anInt3973 = anInt3974 = 0;
			anInt3976 = 2147483646;
		} else {
			method1825(0, anInt3972);
			int i_43_ = anIntArray3975[1];
			if (i_43_ < i)
				i_43_ = i;
			int i_44_ = 0;
			int i_45_;
			for (i_45_ = 0; i_45_ < anInt3972; i_45_ += 4) {
				int i_46_ = anIntArray3975[i_45_ + 1];
				if (i_43_ < i_46_)
					break;
				int i_47_ = anIntArray3975[i_45_];
				int i_48_ = anIntArray3975[i_45_ + 2];
				int i_49_ = anIntArray3975[i_45_ + 3];
				int i_50_ = (i_48_ - i_47_ << 16) / (i_49_ - i_46_);
				int i_51_ = (i_47_ << 16) + 32768;
				anIntArray3975[i_45_] = i_51_ + (i_43_ - i_46_) * i_50_;
				anIntArray3975[i_45_ + 2] = i_50_;
			}
			anInt3978 = i_44_;
			anInt3973 = i_45_;
			anInt3974 = i_45_;
			anInt3976 = i_43_ - 1;
		}
	}
}
