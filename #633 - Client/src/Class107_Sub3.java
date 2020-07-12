/* Class107_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class107_Sub3 extends Class107 {
	private byte[][] aByteArrayArray5371;
	private int[] anIntArray5372;
	private Class163_Sub1 aClass163_Sub1_5373;
	private int[] anIntArray5374;
	private int[] anIntArray5375;
	private int[] anIntArray5376;
	private int[] anIntArray5377;

	final void fa(char c, int i, int i_0_, int i_1_, boolean bool) {
		i += anIntArray5372[c];
		i_0_ += anIntArray5376[c];
		int i_2_ = anIntArray5375[c];
		int i_3_ = anIntArray5374[c];
		int i_4_ = ((Class163_Sub1) aClass163_Sub1_5373).anInt5206;
		int i_5_ = i + i_0_ * i_4_;
		int i_6_ = i_4_ - i_2_;
		int i_7_ = 0;
		int i_8_ = 0;
		if (i_0_ < ((Class163_Sub1) aClass163_Sub1_5373).anInt5177) {
			int i_9_ = ((Class163_Sub1) aClass163_Sub1_5373).anInt5177 - i_0_;
			i_3_ -= i_9_;
			i_0_ = ((Class163_Sub1) aClass163_Sub1_5373).anInt5177;
			i_8_ += i_9_ * i_2_;
			i_5_ += i_9_ * i_4_;
		}
		if (i_0_ + i_3_ > ((Class163_Sub1) aClass163_Sub1_5373).anInt5193)
			i_3_ -= (i_0_ + i_3_ - ((Class163_Sub1) aClass163_Sub1_5373).anInt5193);
		if (i < ((Class163_Sub1) aClass163_Sub1_5373).anInt5186) {
			int i_10_ = ((Class163_Sub1) aClass163_Sub1_5373).anInt5186 - i;
			i_2_ -= i_10_;
			i = ((Class163_Sub1) aClass163_Sub1_5373).anInt5186;
			i_8_ += i_10_;
			i_5_ += i_10_;
			i_7_ += i_10_;
			i_6_ += i_10_;
		}
		if (i + i_2_ > ((Class163_Sub1) aClass163_Sub1_5373).anInt5178) {
			int i_11_ = i + i_2_
					- ((Class163_Sub1) aClass163_Sub1_5373).anInt5178;
			i_2_ -= i_11_;
			i_7_ += i_11_;
			i_6_ += i_11_;
		}
		if (i_2_ > 0 && i_3_ > 0) {
			if (bool)
				method2357(aByteArrayArray5371[c],
						(((Class163_Sub1) aClass163_Sub1_5373).anIntArray5214),
						i_1_, i_8_, i_5_, i_2_, i_3_, i_6_, i_7_);
			else
				method2360(aByteArrayArray5371[c],
						(((Class163_Sub1) aClass163_Sub1_5373).anIntArray5214),
						anIntArray5377, i_8_, i_5_, i_2_, i_3_, i_6_, i_7_);
		}
	}

	private final void method2357(byte[] is, int[] is_12_, int i, int i_13_,
			int i_14_, int i_15_, int i_16_, int i_17_, int i_18_) {
		int i_19_ = -(i_15_ >> 2);
		i_15_ = -(i_15_ & 0x3);
		for (int i_20_ = -i_16_; i_20_ < 0; i_20_++) {
			for (int i_21_ = i_19_; i_21_ < 0; i_21_++) {
				if (is[i_13_++] != 0)
					is_12_[i_14_++] = i;
				else
					i_14_++;
				if (is[i_13_++] != 0)
					is_12_[i_14_++] = i;
				else
					i_14_++;
				if (is[i_13_++] != 0)
					is_12_[i_14_++] = i;
				else
					i_14_++;
				if (is[i_13_++] != 0)
					is_12_[i_14_++] = i;
				else
					i_14_++;
			}
			for (int i_22_ = i_15_; i_22_ < 0; i_22_++) {
				if (is[i_13_++] != 0)
					is_12_[i_14_++] = i;
				else
					i_14_++;
			}
			i_14_ += i_17_;
			i_13_ += i_18_;
		}
	}

	private final void method2358(byte[] is, int[] is_23_, int i, int i_24_,
			int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_,
			int i_31_, int i_32_, Class72 class72, int i_33_, int i_34_) {
		Class72_Sub2 class72_sub2 = (Class72_Sub2) class72;
		int[] is_35_ = ((Class72_Sub2) class72_sub2).anIntArray6909;
		int[] is_36_ = ((Class72_Sub2) class72_sub2).anIntArray6911;
		int i_37_ = i_30_ - ((Class163_Sub1) aClass163_Sub1_5373).anInt5186;
		int i_38_ = i_31_;
		if (i_34_ > i_38_) {
			i_38_ = i_34_;
			i_25_ += ((i_34_ - i_31_) * ((Class163_Sub1) aClass163_Sub1_5373).anInt5206);
			i_24_ += (i_34_ - i_31_) * i_32_;
		}
		int i_39_ = (i_34_ + is_35_.length < i_31_ + i_27_ ? i_34_
				+ is_35_.length : i_31_ + i_27_);
		for (int i_40_ = i_38_; i_40_ < i_39_; i_40_++) {
			int i_41_ = is_35_[i_40_ - i_34_] + i_33_;
			int i_42_ = is_36_[i_40_ - i_34_];
			int i_43_ = i_26_;
			if (i_37_ > i_41_) {
				int i_44_ = i_37_ - i_41_;
				if (i_44_ >= i_42_) {
					i_24_ += i_26_ + i_29_;
					i_25_ += i_26_ + i_28_;
					continue;
				}
				i_42_ -= i_44_;
			} else {
				int i_45_ = i_41_ - i_37_;
				if (i_45_ >= i_26_) {
					i_24_ += i_26_ + i_29_;
					i_25_ += i_26_ + i_28_;
					continue;
				}
				i_24_ += i_45_;
				i_43_ -= i_45_;
				i_25_ += i_45_;
			}
			int i_46_ = 0;
			if (i_43_ < i_42_)
				i_42_ = i_43_;
			else
				i_46_ = i_43_ - i_42_;
			for (int i_47_ = -i_42_; i_47_ < 0; i_47_++) {
				if (is[i_24_++] != 0)
					is_23_[i_25_++] = i;
				else
					i_25_++;
			}
			i_24_ += i_46_ + i_24_;
			i_25_ += i_46_ + i_28_;
		}
	}

	private final void method2359(byte[] is, int[] is_48_, int[] is_49_, int i,
			int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_,
			int i_56_, int i_57_, int i_58_, Class72 class72, int i_59_,
			int i_60_) {
		Class72_Sub2 class72_sub2 = (Class72_Sub2) class72;
		int[] is_61_ = ((Class72_Sub2) class72_sub2).anIntArray6909;
		int[] is_62_ = ((Class72_Sub2) class72_sub2).anIntArray6911;
		int i_63_ = i_56_ - ((Class163_Sub1) aClass163_Sub1_5373).anInt5186;
		int i_64_ = i_57_;
		if (i_60_ > i_64_) {
			i_64_ = i_60_;
			i_51_ += ((i_60_ - i_57_) * ((Class163_Sub1) aClass163_Sub1_5373).anInt5206);
			i_50_ += (i_60_ - i_57_) * i_58_;
		}
		int i_65_ = (i_60_ + is_61_.length < i_57_ + i_53_ ? i_60_
				+ is_61_.length : i_57_ + i_53_);
		boolean bool = false;
		for (int i_66_ = i_64_; i_66_ < i_65_; i_66_++) {
			int i_67_ = is_61_[i_66_ - i_60_] + i_59_;
			int i_68_ = is_62_[i_66_ - i_60_];
			int i_69_ = i_52_;
			if (i_63_ > i_67_) {
				int i_70_ = i_63_ - i_67_;
				if (i_70_ >= i_68_) {
					i_50_ += i_52_ + i_55_;
					i_51_ += i_52_ + i_54_;
					continue;
				}
				i_68_ -= i_70_;
			} else {
				int i_71_ = i_67_ - i_63_;
				if (i_71_ >= i_52_) {
					i_50_ += i_52_ + i_55_;
					i_51_ += i_52_ + i_54_;
					continue;
				}
				i_50_ += i_71_;
				i_69_ -= i_71_;
				i_51_ += i_71_;
			}
			int i_72_ = 0;
			if (i_69_ < i_68_)
				i_68_ = i_69_;
			else
				i_72_ = i_69_ - i_68_;
			for (int i_73_ = -i_68_; i_73_ < 0; i_73_++) {
				int i_74_;
				if ((i_74_ = is[i_50_++]) != 0)
					is_48_[i_51_++] = is_49_[i_74_ & 0xff];
				else
					i_51_++;
			}
			i_50_ += i_72_ + i_55_;
			i_51_ += i_72_ + i_54_;
		}
	}

	Class107_Sub3(Class163_Sub1 class163_sub1, Class292 class292,
			Class80[] class80s, int[] is, int[] is_75_) {
		super(class163_sub1, class292);
		aClass163_Sub1_5373 = class163_sub1;
		aClass163_Sub1_5373 = class163_sub1;
		anIntArray5375 = is;
		anIntArray5374 = is_75_;
		aByteArrayArray5371 = new byte[class80s.length][];
		anIntArray5376 = new int[class80s.length];
		anIntArray5372 = new int[class80s.length];
		for (int i = 0; i < class80s.length; i++) {
			aByteArrayArray5371[i] = ((Class80) class80s[i]).aByteArray1079;
			anIntArray5376[i] = ((Class80) class80s[i]).anInt1077;
			anIntArray5372[i] = ((Class80) class80s[i]).anInt1080;
		}
		anIntArray5377 = ((Class80) class80s[0]).anIntArray1074;
	}

	final void method703(char c, int i, int i_76_, int i_77_, boolean bool,
			Class72 class72, int i_78_, int i_79_) {
		if (class72 == null)
			fa(c, i, i_76_, i_77_, bool);
		else {
			i += anIntArray5372[c];
			i_76_ += anIntArray5376[c];
			int i_80_ = anIntArray5375[c];
			int i_81_ = anIntArray5374[c];
			int i_82_ = ((Class163_Sub1) aClass163_Sub1_5373).anInt5206;
			int i_83_ = i + i_76_ * i_82_;
			int i_84_ = i_82_ - i_80_;
			int i_85_ = 0;
			int i_86_ = 0;
			if (i_76_ < ((Class163_Sub1) aClass163_Sub1_5373).anInt5177) {
				int i_87_ = ((Class163_Sub1) aClass163_Sub1_5373).anInt5177
						- i_76_;
				i_81_ -= i_87_;
				i_76_ = ((Class163_Sub1) aClass163_Sub1_5373).anInt5177;
				i_86_ += i_87_ * i_80_;
				i_83_ += i_87_ * i_82_;
			}
			if (i_76_ + i_81_ > ((Class163_Sub1) aClass163_Sub1_5373).anInt5193)
				i_81_ -= (i_76_ + i_81_ - ((Class163_Sub1) aClass163_Sub1_5373).anInt5193);
			if (i < ((Class163_Sub1) aClass163_Sub1_5373).anInt5186) {
				int i_88_ = ((Class163_Sub1) aClass163_Sub1_5373).anInt5186 - i;
				i_80_ -= i_88_;
				i = ((Class163_Sub1) aClass163_Sub1_5373).anInt5186;
				i_86_ += i_88_;
				i_83_ += i_88_;
				i_85_ += i_88_;
				i_84_ += i_88_;
			}
			if (i + i_80_ > ((Class163_Sub1) aClass163_Sub1_5373).anInt5178) {
				int i_89_ = (i + i_80_ - ((Class163_Sub1) aClass163_Sub1_5373).anInt5178);
				i_80_ -= i_89_;
				i_85_ += i_89_;
				i_84_ += i_89_;
			}
			if (i_80_ > 0 && i_81_ > 0) {
				if (bool)
					method2358(
							aByteArrayArray5371[c],
							(((Class163_Sub1) aClass163_Sub1_5373).anIntArray5214),
							i_77_, i_86_, i_83_, i_80_, i_81_, i_84_, i_85_, i,
							i_76_, anIntArray5375[c], class72, i_78_, i_79_);
				else
					method2359(
							aByteArrayArray5371[c],
							(((Class163_Sub1) aClass163_Sub1_5373).anIntArray5214),
							anIntArray5377, i_77_, i_86_, i_83_, i_80_, i_81_,
							i_84_, i_85_, i, i_76_, anIntArray5375[c], class72,
							i_78_, i_79_);
			}
		}
	}

	private final void method2360(byte[] is, int[] is_90_, int[] is_91_, int i,
			int i_92_, int i_93_, int i_94_, int i_95_, int i_96_) {
		int i_97_ = -(i_93_ >> 2);
		i_93_ = -(i_93_ & 0x3);
		boolean bool = false;
		for (int i_98_ = -i_94_; i_98_ < 0; i_98_++) {
			for (int i_99_ = i_97_; i_99_ < 0; i_99_++) {
				int i_100_;
				if ((i_100_ = is[i++]) != 0)
					is_90_[i_92_++] = is_91_[i_100_ & 0xff];
				else
					i_92_++;
				if ((i_100_ = is[i++]) != 0)
					is_90_[i_92_++] = is_91_[i_100_ & 0xff];
				else
					i_92_++;
				if ((i_100_ = is[i++]) != 0)
					is_90_[i_92_++] = is_91_[i_100_ & 0xff];
				else
					i_92_++;
				if ((i_100_ = is[i++]) != 0)
					is_90_[i_92_++] = is_91_[i_100_ & 0xff];
				else
					i_92_++;
			}
			for (int i_101_ = i_93_; i_101_ < 0; i_101_++) {
				int i_102_;
				if ((i_102_ = is[i++]) != 0)
					is_90_[i_92_++] = is_91_[i_102_ & 0xff];
				else
					i_92_++;
			}
			i_92_ += i_95_;
			i += i_96_;
		}
	}
}
