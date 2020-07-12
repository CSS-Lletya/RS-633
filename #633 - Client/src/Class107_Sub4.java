/* Class107_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class107_Sub4 extends Class107 {
	private int[] anIntArray7868;
	private byte[][] aByteArrayArray7869;
	private Class163_Sub1 aClass163_Sub1_7870;
	private int[] anIntArray7871;
	private int[] anIntArray7872;
	private int[] anIntArray7873;

	final void fa(char c, int i, int i_0_, int i_1_, boolean bool) {
		i += anIntArray7872[c];
		i_0_ += anIntArray7873[c];
		int i_2_ = anIntArray7868[c];
		int i_3_ = anIntArray7871[c];
		int i_4_ = ((Class163_Sub1) aClass163_Sub1_7870).anInt5206;
		int i_5_ = i + i_0_ * i_4_;
		int i_6_ = i_4_ - i_2_;
		int i_7_ = 0;
		int i_8_ = 0;
		if (i_0_ < ((Class163_Sub1) aClass163_Sub1_7870).anInt5177) {
			int i_9_ = ((Class163_Sub1) aClass163_Sub1_7870).anInt5177 - i_0_;
			i_3_ -= i_9_;
			i_0_ = ((Class163_Sub1) aClass163_Sub1_7870).anInt5177;
			i_8_ += i_9_ * i_2_;
			i_5_ += i_9_ * i_4_;
		}
		if (i_0_ + i_3_ > ((Class163_Sub1) aClass163_Sub1_7870).anInt5193)
			i_3_ -= (i_0_ + i_3_ - ((Class163_Sub1) aClass163_Sub1_7870).anInt5193);
		if (i < ((Class163_Sub1) aClass163_Sub1_7870).anInt5186) {
			int i_10_ = ((Class163_Sub1) aClass163_Sub1_7870).anInt5186 - i;
			i_2_ -= i_10_;
			i = ((Class163_Sub1) aClass163_Sub1_7870).anInt5186;
			i_8_ += i_10_;
			i_5_ += i_10_;
			i_7_ += i_10_;
			i_6_ += i_10_;
		}
		if (i + i_2_ > ((Class163_Sub1) aClass163_Sub1_7870).anInt5178) {
			int i_11_ = i + i_2_
					- ((Class163_Sub1) aClass163_Sub1_7870).anInt5178;
			i_2_ -= i_11_;
			i_7_ += i_11_;
			i_6_ += i_11_;
		}
		if (i_2_ > 0 && i_3_ > 0) {
			if ((i_1_ & ~0xffffff) == -16777216)
				method3161(aByteArrayArray7869[c],
						(((Class163_Sub1) aClass163_Sub1_7870).anIntArray5214),
						i_1_, i_8_, i_5_, i_2_, i_3_, i_6_, i_7_);
			else if ((i_1_ & ~0xffffff) != 0)
				method3160(aByteArrayArray7869[c],
						(((Class163_Sub1) aClass163_Sub1_7870).anIntArray5214),
						i_1_, i_8_, i_5_, i_2_, i_3_, i_6_, i_7_);
		}
	}

	private final void method3160(byte[] is, int[] is_12_, int i, int i_13_,
			int i_14_, int i_15_, int i_16_, int i_17_, int i_18_) {
		int i_19_ = i >>> 24;
		int i_20_ = 255 - i_19_;
		for (int i_21_ = -i_16_; i_21_ < 0; i_21_++) {
			for (int i_22_ = -i_15_; i_22_ < 0; i_22_++) {
				if (is[i_13_++] != 0) {
					int i_23_ = ((((i & 0xff00ff) * i_19_ & ~0xff00ff) + ((i & 0xff00)
							* i_19_ & 0xff0000)) >> 8);
					int i_24_ = is_12_[i_14_];
					is_12_[i_14_++] = ((((i_24_ & 0xff00ff) * i_20_ & ~0xff00ff) + ((i_24_ & 0xff00)
							* i_20_ & 0xff0000)) >> 8)
							+ i_23_;
				} else
					i_14_++;
			}
			i_14_ += i_17_;
			i_13_ += i_18_;
		}
	}

	Class107_Sub4(Class163_Sub1 class163_sub1, Class292 class292,
			Class80[] class80s, int[] is, int[] is_25_) {
		super(class163_sub1, class292);
		aClass163_Sub1_7870 = class163_sub1;
		anIntArray7868 = is;
		anIntArray7871 = is_25_;
		aByteArrayArray7869 = new byte[class80s.length][];
		anIntArray7873 = new int[class80s.length];
		anIntArray7872 = new int[class80s.length];
		for (int i = 0; i < class80s.length; i++) {
			aByteArrayArray7869[i] = ((Class80) class80s[i]).aByteArray1079;
			anIntArray7873[i] = ((Class80) class80s[i]).anInt1077;
			anIntArray7872[i] = ((Class80) class80s[i]).anInt1080;
		}
	}

	private final void method3161(byte[] is, int[] is_26_, int i, int i_27_,
			int i_28_, int i_29_, int i_30_, int i_31_, int i_32_) {
		int i_33_ = -(i_29_ >> 2);
		i_29_ = -(i_29_ & 0x3);
		for (int i_34_ = -i_30_; i_34_ < 0; i_34_++) {
			for (int i_35_ = i_33_; i_35_ < 0; i_35_++) {
				if (is[i_27_++] != 0)
					is_26_[i_28_++] = i;
				else
					i_28_++;
				if (is[i_27_++] != 0)
					is_26_[i_28_++] = i;
				else
					i_28_++;
				if (is[i_27_++] != 0)
					is_26_[i_28_++] = i;
				else
					i_28_++;
				if (is[i_27_++] != 0)
					is_26_[i_28_++] = i;
				else
					i_28_++;
			}
			for (int i_36_ = i_29_; i_36_ < 0; i_36_++) {
				if (is[i_27_++] != 0)
					is_26_[i_28_++] = i;
				else
					i_28_++;
			}
			i_28_ += i_31_;
			i_27_ += i_32_;
		}
	}

	private final void method3162(byte[] is, int[] is_37_, int i, int i_38_,
			int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_,
			int i_45_, int i_46_, Class72 class72, int i_47_, int i_48_) {
		Class72_Sub2 class72_sub2 = (Class72_Sub2) class72;
		int[] is_49_ = ((Class72_Sub2) class72_sub2).anIntArray6909;
		int[] is_50_ = ((Class72_Sub2) class72_sub2).anIntArray6911;
		int i_51_ = i_45_;
		if (i_48_ > i_51_) {
			i_51_ = i_48_;
			i_39_ += ((i_48_ - i_45_) * ((Class163_Sub1) aClass163_Sub1_7870).anInt5206);
			i_38_ += (i_48_ - i_45_) * i_46_;
		}
		int i_52_ = (i_48_ + is_49_.length < i_45_ + i_41_ ? i_48_
				+ is_49_.length : i_45_ + i_41_);
		for (int i_53_ = i_51_; i_53_ < i_52_; i_53_++) {
			int i_54_ = i_47_ + is_49_[i_53_ - i_48_];
			int i_55_ = is_50_[i_53_ - i_48_];
			int i_56_ = i_40_;
			if (i_44_ > i_54_) {
				int i_57_ = i_44_ - i_54_;
				if (i_57_ >= i_55_) {
					i_38_ += i_40_ + i_43_;
					i_39_ += i_40_ + i_42_;
					continue;
				}
				i_55_ -= i_57_;
			} else {
				int i_58_ = i_54_ - i_44_;
				if (i_58_ >= i_40_) {
					i_38_ += i_40_ + i_43_;
					i_39_ += i_40_ + i_42_;
					continue;
				}
				i_38_ += i_58_;
				i_56_ -= i_58_;
				i_39_ += i_58_;
			}
			int i_59_ = 0;
			if (i_56_ < i_55_)
				i_55_ = i_56_;
			else
				i_59_ = i_56_ - i_55_;
			for (int i_60_ = 0; i_60_ < i_55_; i_60_++) {
				if (is[i_38_++] != 0)
					is_37_[i_39_++] = i;
				else
					i_39_++;
			}
			i_38_ += i_59_ + i_43_;
			i_39_ += i_59_ + i_42_;
		}
	}

	final void method703(char c, int i, int i_61_, int i_62_, boolean bool,
			Class72 class72, int i_63_, int i_64_) {
		if (class72 == null)
			fa(c, i, i_61_, i_62_, bool);
		else {
			i += anIntArray7872[c];
			i_61_ += anIntArray7873[c];
			int i_65_ = anIntArray7868[c];
			int i_66_ = anIntArray7871[c];
			int i_67_ = ((Class163_Sub1) aClass163_Sub1_7870).anInt5206;
			int i_68_ = i + i_61_ * i_67_;
			int i_69_ = i_67_ - i_65_;
			int i_70_ = 0;
			int i_71_ = 0;
			if (i_61_ < ((Class163_Sub1) aClass163_Sub1_7870).anInt5177) {
				int i_72_ = ((Class163_Sub1) aClass163_Sub1_7870).anInt5177
						- i_61_;
				i_66_ -= i_72_;
				i_61_ = ((Class163_Sub1) aClass163_Sub1_7870).anInt5177;
				i_71_ += i_72_ * i_65_;
				i_68_ += i_72_ * i_67_;
			}
			if (i_61_ + i_66_ > ((Class163_Sub1) aClass163_Sub1_7870).anInt5193)
				i_66_ -= (i_61_ + i_66_ - ((Class163_Sub1) aClass163_Sub1_7870).anInt5193);
			if (i < ((Class163_Sub1) aClass163_Sub1_7870).anInt5186) {
				int i_73_ = ((Class163_Sub1) aClass163_Sub1_7870).anInt5186 - i;
				i_65_ -= i_73_;
				i = ((Class163_Sub1) aClass163_Sub1_7870).anInt5186;
				i_71_ += i_73_;
				i_68_ += i_73_;
				i_70_ += i_73_;
				i_69_ += i_73_;
			}
			if (i + i_65_ > ((Class163_Sub1) aClass163_Sub1_7870).anInt5178) {
				int i_74_ = (i + i_65_ - ((Class163_Sub1) aClass163_Sub1_7870).anInt5178);
				i_65_ -= i_74_;
				i_70_ += i_74_;
				i_69_ += i_74_;
			}
			if (i_65_ > 0 && i_66_ > 0) {
				if ((i_62_ & ~0xffffff) == -16777216)
					method3162(
							aByteArrayArray7869[c],
							(((Class163_Sub1) aClass163_Sub1_7870).anIntArray5214),
							i_62_, i_71_, i_68_, i_65_, i_66_, i_69_, i_70_, i,
							i_61_, anIntArray7868[c], class72, i_63_, i_64_);
				else
					method3163(
							aByteArrayArray7869[c],
							(((Class163_Sub1) aClass163_Sub1_7870).anIntArray5214),
							i_62_, i_71_, i_68_, i_65_, i_66_, i_69_, i_70_, i,
							i_61_, anIntArray7868[c], class72, i_63_, i_64_);
			}
		}
	}

	private final void method3163(byte[] is, int[] is_75_, int i, int i_76_,
			int i_77_, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_,
			int i_83_, int i_84_, Class72 class72, int i_85_, int i_86_) {
		Class72_Sub2 class72_sub2 = (Class72_Sub2) class72;
		int[] is_87_ = ((Class72_Sub2) class72_sub2).anIntArray6909;
		int[] is_88_ = ((Class72_Sub2) class72_sub2).anIntArray6911;
		int i_89_ = i_82_ - ((Class163_Sub1) aClass163_Sub1_7870).anInt5186;
		int i_90_ = i_83_;
		if (i_86_ > i_90_) {
			i_90_ = i_86_;
			i_77_ += ((i_86_ - i_83_) * ((Class163_Sub1) aClass163_Sub1_7870).anInt5206);
			i_76_ += (i_86_ - i_83_) * i_84_;
		}
		int i_91_ = (i_86_ + is_87_.length < i_83_ + i_79_ ? i_86_
				+ is_87_.length : i_83_ + i_79_);
		int i_92_ = i >>> 24;
		int i_93_ = 255 - i_92_;
		for (int i_94_ = i_90_; i_94_ < i_91_; i_94_++) {
			int i_95_ = is_87_[i_94_ - i_86_] + i_85_;
			int i_96_ = is_88_[i_94_ - i_86_];
			int i_97_ = i_78_;
			if (i_89_ > i_95_) {
				int i_98_ = i_89_ - i_95_;
				if (i_98_ >= i_96_) {
					i_76_ += i_78_ + i_81_;
					i_77_ += i_78_ + i_80_;
					continue;
				}
				i_96_ -= i_98_;
			} else {
				int i_99_ = i_95_ - i_89_;
				if (i_99_ >= i_78_) {
					i_76_ += i_78_ + i_81_;
					i_77_ += i_78_ + i_80_;
					continue;
				}
				i_76_ += i_99_;
				i_97_ -= i_99_;
				i_77_ += i_99_;
			}
			int i_100_ = 0;
			if (i_97_ < i_96_)
				i_96_ = i_97_;
			else
				i_100_ = i_97_ - i_96_;
			for (int i_101_ = -i_96_; i_101_ < 0; i_101_++) {
				if (is[i_76_++] != 0) {
					int i_102_ = ((((i & 0xff00ff) * i_92_ & ~0xff00ff) + ((i & 0xff00)
							* i_92_ & 0xff0000)) >> 8);
					int i_103_ = is_75_[i_77_];
					is_75_[i_77_++] = ((((i_103_ & 0xff00ff) * i_93_ & ~0xff00ff) + ((i_103_ & 0xff00)
							* i_93_ & 0xff0000)) >> 8)
							+ i_102_;
				} else
					i_77_++;
			}
			i_76_ += i_100_ + i_81_;
			i_77_ += i_100_ + i_80_;
		}
	}
}
