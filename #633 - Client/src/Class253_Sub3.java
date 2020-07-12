/* Class253_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class253_Sub3 extends Class253 {
	static int anInt7666 = 0;
	int anInt7667;
	private static int anInt7668;
	private static int anInt7669;
	static int anInt7670;
	int anInt7671;
	static int anInt7672;
	static int anInt7673;
	private static int anInt7674 = 0;
	static int anInt7675;
	static int anInt7676;
	static int anInt7677;
	private int[] anIntArray7678;
	int anInt7679;
	private static int anInt7680;
	int anInt7681;
	static int anInt7682;
	static int anInt7683;
	static int anInt7684;
	static int anInt7685 = 0;
	static int anInt7686;
	static int anInt7687;
	private static int anInt7688;
	int anInt7689;
	static int anInt7690;
	int anInt7691;
	static int anInt7692;
	private static int anInt7693;
	static int anInt7694;
	static int anInt7695;
	static int anInt7696;
	static int anInt7697;
	Class163_Sub1 aClass163_Sub1_7698;

	final int method1622() {
		return (((Class253_Sub3) this).anInt7691
				+ ((Class253_Sub3) this).anInt7671 + ((Class253_Sub3) this).anInt7667);
	}

	final void method1625(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_, int i_5_) {
		if (((Class253_Sub3) this).aClass163_Sub1_7698.method2293())
			throw new IllegalStateException();
		if (anIntArray7678 == null)
			anIntArray7678 = new int[4];
		((Class253_Sub3) this).aClass163_Sub1_7698.K(anIntArray7678);
		((Class253_Sub3) this).aClass163_Sub1_7698
				.T((((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186),
						(((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177),
						i + i_1_, i_0_ + i_2_);
		int i_6_ = method1608();
		int i_7_ = method1622();
		int i_8_ = (i_1_ + i_6_ - 1) / i_6_;
		int i_9_ = (i_2_ + i_7_ - 1) / i_7_;
		for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
			int i_11_ = i_10_ * i_7_;
			for (int i_12_ = 0; i_12_ < i_8_; i_12_++)
				method1624(i + i_12_ * i_6_, i_0_ + i_11_, i_3_, i_4_, i_5_);
		}
		((Class253_Sub3) this).aClass163_Sub1_7698.KA(anIntArray7678[0],
				anIntArray7678[1], anIntArray7678[2], anIntArray7678[3]);
	}

	abstract void method3106(int i, int i_13_, int i_14_, int i_15_, int i_16_,
			int i_17_, int i_18_, int i_19_, int i_20_);

	abstract void method1624(int i, int i_21_, int i_22_, int i_23_, int i_24_);

	final void method1617(float f, float f_25_, float f_26_, float f_27_,
			float f_28_, float f_29_, int i, int i_30_, int i_31_, int i_32_) {
		if (((Class253_Sub3) this).aClass163_Sub1_7698.method2293())
			throw new IllegalStateException();
		if (method3108(f, f_25_, f_26_, f_27_, f_28_, f_29_)) {
			anInt7670 = i_30_;
			if (i != 1) {
				anInt7696 = i_30_ >>> 24;
				anInt7666 = 256 - anInt7696;
				if (i == 0) {
					anInt7682 = (i_30_ & 0xff0000) >> 16;
					anInt7690 = (i_30_ & 0xff00) >> 8;
					anInt7685 = i_30_ & 0xff;
				} else if (i == 2) {
					anInt7688 = i_30_ >>> 24;
					anInt7674 = 256 - anInt7688;
					int i_33_ = (i_30_ & 0xff00ff) * anInt7674 & ~0xff00ff;
					int i_34_ = (i_30_ & 0xff00) * anInt7674 & 0xff0000;
					anInt7683 = (i_33_ | i_34_) >>> 8;
				}
			}
			if (i == 1) {
				if (i_31_ == 0)
					method3107(1, 0);
				else if (i_31_ == 1)
					method3107(1, 1);
				else if (i_31_ == 2)
					method3107(1, 2);
			} else if (i == 0) {
				if (i_31_ == 0)
					method3107(0, 0);
				else if (i_31_ == 1)
					method3107(0, 1);
				else if (i_31_ == 2)
					method3107(0, 2);
			} else if (i == 3) {
				if (i_31_ == 0)
					method3107(3, 0);
				else if (i_31_ == 1)
					method3107(3, 1);
				else if (i_31_ == 2)
					method3107(3, 2);
			} else if (i == 2) {
				if (i_31_ == 0)
					method3107(2, 0);
				else if (i_31_ == 1)
					method3107(2, 1);
				else if (i_31_ == 2)
					method3107(2, 2);
			}
		}
	}

	final int method1609() {
		return ((Class253_Sub3) this).anInt7679;
	}

	final int method1608() {
		return (((Class253_Sub3) this).anInt7689
				+ ((Class253_Sub3) this).anInt7679 + ((Class253_Sub3) this).anInt7681);
	}

	abstract void method3107(int i, int i_35_);

	final void method1628(float f, float f_36_, float f_37_, float f_38_,
			float f_39_, float f_40_, int i, Class72 class72, int i_41_,
			int i_42_) {
		if (((Class253_Sub3) this).aClass163_Sub1_7698.method2293())
			throw new IllegalStateException();
		if (method3108(f, f_36_, f_37_, f_38_, f_39_, f_40_)) {
			Class72_Sub2 class72_sub2 = (Class72_Sub2) class72;
			method3109(((Class72_Sub2) class72_sub2).anIntArray6909,
					((Class72_Sub2) class72_sub2).anIntArray6911, anInt7680
							- i_41_, -i_42_ - (anInt7692 - anInt7668));
		}
	}

	final void method1607(int i, int i_43_, int i_44_, int i_45_) {
		((Class253_Sub3) this).anInt7689 = i;
		((Class253_Sub3) this).anInt7691 = i_43_;
		((Class253_Sub3) this).anInt7681 = i_44_;
		((Class253_Sub3) this).anInt7667 = i_45_;
	}

	final int method1615() {
		return ((Class253_Sub3) this).anInt7671;
	}

	abstract void method1612(int i, int i_46_, Class72 class72, int i_47_,
			int i_48_);

	private final boolean method3108(float f, float f_49_, float f_50_,
			float f_51_, float f_52_, float f_53_) {
		int i = (((Class253_Sub3) this).anInt7689
				+ ((Class253_Sub3) this).anInt7679 + ((Class253_Sub3) this).anInt7681);
		int i_54_ = (((Class253_Sub3) this).anInt7691
				+ ((Class253_Sub3) this).anInt7671 + ((Class253_Sub3) this).anInt7667);
		if (i != ((Class253_Sub3) this).anInt7679
				|| i_54_ != ((Class253_Sub3) this).anInt7671) {
			float f_55_ = (f_50_ - f) / (float) i;
			float f_56_ = (f_51_ - f_49_) / (float) i;
			float f_57_ = (f_52_ - f) / (float) i_54_;
			float f_58_ = (f_53_ - f_49_) / (float) i_54_;
			float f_59_ = f_57_ * (float) ((Class253_Sub3) this).anInt7691;
			float f_60_ = f_58_ * (float) ((Class253_Sub3) this).anInt7691;
			float f_61_ = f_55_ * (float) ((Class253_Sub3) this).anInt7689;
			float f_62_ = f_56_ * (float) ((Class253_Sub3) this).anInt7689;
			float f_63_ = -f_55_ * (float) ((Class253_Sub3) this).anInt7681;
			float f_64_ = -f_56_ * (float) ((Class253_Sub3) this).anInt7681;
			float f_65_ = -f_57_ * (float) ((Class253_Sub3) this).anInt7667;
			float f_66_ = -f_58_ * (float) ((Class253_Sub3) this).anInt7667;
			f += f_61_ + f_59_;
			f_49_ += f_62_ + f_60_;
			f_50_ += f_63_ + f_59_;
			f_51_ += f_64_ + f_60_;
			f_52_ += f_61_ + f_65_;
			f_53_ += f_62_ + f_66_;
		}
		float f_67_ = f_52_ + (f_50_ - f);
		float f_68_ = f_51_ + (f_53_ - f_49_);
		float f_69_;
		float f_70_;
		if (f < f_50_) {
			f_69_ = f;
			f_70_ = f_50_;
		} else {
			f_69_ = f_50_;
			f_70_ = f;
		}
		if (f_52_ < f_69_)
			f_69_ = f_52_;
		if (f_67_ < f_69_)
			f_69_ = f_67_;
		if (f_52_ > f_70_)
			f_70_ = f_52_;
		if (f_67_ > f_70_)
			f_70_ = f_67_;
		float f_71_;
		float f_72_;
		if (f_49_ < f_51_) {
			f_71_ = f_49_;
			f_72_ = f_51_;
		} else {
			f_71_ = f_51_;
			f_72_ = f_49_;
		}
		if (f_53_ < f_71_)
			f_71_ = f_53_;
		if (f_68_ < f_71_)
			f_71_ = f_68_;
		if (f_53_ > f_72_)
			f_72_ = f_53_;
		if (f_68_ > f_72_)
			f_72_ = f_68_;
		if (f_69_ < (float) ((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5186)
			f_69_ = (float) ((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5186;
		if (f_70_ > (float) ((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5178)
			f_70_ = (float) ((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5178;
		if (f_71_ < (float) ((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5177)
			f_71_ = (float) ((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5177;
		if (f_72_ > (float) ((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5193)
			f_72_ = (float) ((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5193;
		f_70_ = f_69_ - f_70_;
		if (f_70_ >= 0.0F)
			return false;
		f_72_ = f_71_ - f_72_;
		if (f_72_ >= 0.0F)
			return false;
		anInt7684 = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5206);
		anInt7695 = (int) ((float) ((int) f_71_ * anInt7684) + f_69_);
		float f_73_ = (f_50_ - f) * (f_53_ - f_49_) - (f_51_ - f_49_)
				* (f_52_ - f);
		float f_74_ = (f_52_ - f) * (f_51_ - f_49_) - (f_53_ - f_49_)
				* (f_50_ - f);
		anInt7676 = (int) ((f_53_ - f_49_) * 4096.0F
				* (float) ((Class253_Sub3) this).anInt7679 / f_73_);
		anInt7675 = (int) ((f_51_ - f_49_) * 4096.0F
				* (float) ((Class253_Sub3) this).anInt7671 / f_74_);
		anInt7672 = (int) ((f_52_ - f) * 4096.0F
				* (float) ((Class253_Sub3) this).anInt7679 / f_74_);
		anInt7673 = (int) ((f_50_ - f) * 4096.0F
				* (float) ((Class253_Sub3) this).anInt7671 / f_73_);
		anInt7693 = (int) (f_69_ * 16.0F + 8.0F - (f + f_50_ + f_52_ + f_67_) / 4.0F * 16.0F);
		anInt7669 = (int) (f_71_ * 16.0F + 8.0F - (f_49_ + f_51_ + f_53_ + f_68_) / 4.0F * 16.0F);
		anInt7677 = ((((Class253_Sub3) this).anInt7679 >> 1 << 12) + (anInt7669
				* anInt7672 >> 4));
		anInt7694 = ((((Class253_Sub3) this).anInt7671 >> 1 << 12) + (anInt7669
				* anInt7673 >> 4));
		anInt7686 = anInt7693 * anInt7676 >> 4;
		anInt7697 = anInt7693 * anInt7675 >> 4;
		anInt7680 = (int) f_69_;
		anInt7687 = (int) f_70_;
		anInt7668 = (int) f_71_;
		anInt7692 = (int) f_72_;
		return true;
	}

	abstract void method3109(int[] is, int[] is_75_, int i, int i_76_);

	abstract void method1626(int i, int i_77_, int i_78_, int i_79_, int i_80_,
			int i_81_, int i_82_, int i_83_);

	Class253_Sub3(Class163_Sub1 class163_sub1, int i, int i_84_) {
		((Class253_Sub3) this).aClass163_Sub1_7698 = class163_sub1;
		((Class253_Sub3) this).anInt7679 = i;
		((Class253_Sub3) this).anInt7671 = i_84_;
	}

	static {
		anInt7683 = 0;
		anInt7682 = 0;
		anInt7688 = 0;
		anInt7690 = 0;
		anInt7696 = 0;
	}
}
