/* Class11_Sub40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub40 extends Class11 {
	int anInt7225;
	private int[] anIntArray7226;
	private static int[] anIntArray7227;
	int anInt7228;
	boolean aBool7229;
	private int anInt7230;

	final int[] method2931() {
		return anIntArray7226;
	}

	public static void method2932() {
		anIntArray7227 = null;
	}

	final void method2933(int i, int i_0_) {
		if (i != 0 || i_0_ != 0) {
			if (anIntArray7227 == null
					|| anIntArray7227.length != anIntArray7226.length)
				anIntArray7227 = new int[anIntArray7226.length];
			int i_1_ = anIntArray7226.length;
			int i_2_ = i;
			int i_3_ = anInt7230 - 1;
			int i_4_ = anInt7230 * i_0_;
			int i_5_ = i_1_ - 1;
			for (int i_6_ = 0; i_6_ < i_1_; i_6_ += anInt7230) {
				int i_7_ = i_6_ + i_4_ & i_5_;
				for (int i_8_ = 0; i_8_ < anInt7230; i_8_++) {
					int i_9_ = i_6_ + i_8_;
					int i_10_ = i_7_ + (i_8_ + i_2_ & i_3_);
					anIntArray7227[i_9_] = anIntArray7226[i_10_];
				}
			}
			int[] is = anIntArray7226;
			anIntArray7226 = anIntArray7227;
			anIntArray7227 = is;
		}
	}

	Class11_Sub40(int i, int i_11_, int[] is, boolean bool) {
		((Class11_Sub40) this).anInt7228 = i;
		anInt7230 = i_11_;
		anIntArray7226 = is;
		if (bool) {
			int[] is_12_ = new int[anInt7230];
			int[] is_13_ = new int[anInt7230];
			int[] is_14_ = new int[anInt7230];
			int[] is_15_ = new int[anInt7230];
			if (anIntArray7227 == null
					|| anIntArray7227.length != anIntArray7226.length)
				anIntArray7227 = new int[anIntArray7226.length];
			int i_16_ = anInt7230;
			int i_17_ = anInt7230;
			int i_18_ = i_16_ - 1;
			int i_19_ = i_17_ - 1;
			int i_20_ = i_16_ * i_17_;
			int i_22_;
			int i_21_ = i_22_ = i_16_;
			for (int i_23_ = 2; i_23_ >= 0; i_23_--) {
				for (int i_24_ = i_18_; i_24_ >= 0; i_24_--) {
					int i_25_ = anIntArray7226[--i_22_];
					is_12_[i_24_] += i_25_ >> 24 & 0xff;
					is_13_[i_24_] += i_25_ >> 16 & 0xff;
					is_14_[i_24_] += i_25_ >> 8 & 0xff;
					is_15_[i_24_] += i_25_ & 0xff;
				}
				if (i_22_ == 0)
					i_22_ = i_20_;
			}
			int i_26_ = i_20_;
			for (int i_27_ = i_19_; i_27_ >= 0; i_27_--) {
				int i_28_ = 1;
				int i_29_ = 1;
				int i_31_;
				int i_32_;
				int i_33_;
				int i_30_ = i_31_ = i_32_ = i_33_ = 0;
				for (int i_34_ = 2; i_34_ >= 0; i_34_--) {
					i_29_--;
					i_30_ += is_12_[i_29_];
					i_31_ += is_13_[i_29_];
					i_33_ += is_14_[i_29_];
					i_32_ += is_15_[i_29_];
					if (i_29_ == 0)
						i_29_ = i_16_;
				}
				for (int i_35_ = i_18_; i_35_ >= 0; i_35_--) {
					i_29_--;
					i_28_--;
					int i_36_ = i_30_ / 9;
					int i_37_ = i_31_ / 9;
					int i_38_ = i_33_ / 9;
					int i_39_ = i_32_ / 9;
					anIntArray7227[--i_26_] = i_36_ << 24 | i_37_ << 16
							| i_38_ << 8 | i_39_;
					i_30_ += is_12_[i_29_] - is_12_[i_28_];
					i_31_ += is_13_[i_29_] - is_13_[i_28_];
					i_32_ += is_15_[i_29_] - is_15_[i_28_];
					i_33_ += is_14_[i_29_] - is_14_[i_28_];
					if (i_29_ == 0)
						i_29_ = i_16_;
					if (i_28_ == 0)
						i_28_ = i_16_;
				}
				for (int i_40_ = i_18_; i_40_ >= 0; i_40_--) {
					int i_41_ = anIntArray7226[--i_22_];
					int i_42_ = anIntArray7226[--i_21_];
					is_12_[i_40_] += (i_41_ >> 24 & 0xff)
							- (i_42_ >> 24 & 0xff);
					is_13_[i_40_] += (i_41_ >> 16 & 0xff)
							- (i_42_ >> 16 & 0xff);
					is_14_[i_40_] += (i_41_ >> 8 & 0xff) - (i_42_ >> 8 & 0xff);
					is_15_[i_40_] += (i_41_ & 0xff) - (i_42_ & 0xff);
				}
				if (i_22_ == 0)
					i_22_ = i_20_;
				if (i_21_ == 0)
					i_21_ = i_20_;
			}
			int[] is_43_ = anIntArray7226;
			anIntArray7226 = anIntArray7227;
			anIntArray7227 = is_43_;
		}
	}
}
