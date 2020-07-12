/* Class107_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class107_Sub1 extends Class107 {
	private int[] anIntArray5086;
	private byte[][] aByteArrayArray5087;
	private int[] anIntArray5088;
	private int[] anIntArray5089;
	private int[] anIntArray5090;
	private Class163_Sub1 aClass163_Sub1_5091;

	Class107_Sub1(Class163_Sub1 class163_sub1, Class292 class292,
			Class80[] class80s, int[] is, int[] is_0_) {
		super(class163_sub1, class292);
		aClass163_Sub1_5091 = class163_sub1;
		aClass163_Sub1_5091 = class163_sub1;
		anIntArray5088 = is;
		anIntArray5086 = is_0_;
		aByteArrayArray5087 = new byte[class80s.length][];
		anIntArray5090 = new int[class80s.length];
		anIntArray5089 = new int[class80s.length];
		for (int i = 0; i < class80s.length; i++) {
			Class80 class80 = class80s[i];
			if (((Class80) class80).aByteArray1078 != null)
				aByteArrayArray5087[i] = ((Class80) class80).aByteArray1078;
			else {
				byte[] is_1_ = ((Class80) class80).aByteArray1079;
				byte[] is_2_ = aByteArrayArray5087[i] = new byte[is_1_.length];
				for (int i_3_ = 0; i_3_ < is_1_.length; i_3_++)
					is_2_[i_3_] = (byte) (is_1_[i_3_] == 0 ? 0 : -1);
			}
			anIntArray5090[i] = ((Class80) class80).anInt1077;
			anIntArray5089[i] = ((Class80) class80).anInt1080;
		}
	}

	final void fa(char c, int i, int i_4_, int i_5_, boolean bool) {
		i += anIntArray5089[c];
		i_4_ += anIntArray5090[c];
		int i_6_ = anIntArray5088[c];
		int i_7_ = anIntArray5086[c];
		int i_8_ = ((Class163_Sub1) aClass163_Sub1_5091).anInt5206;
		int i_9_ = i + i_4_ * i_8_;
		int i_10_ = i_8_ - i_6_;
		int i_11_ = 0;
		int i_12_ = 0;
		if (i_4_ < ((Class163_Sub1) aClass163_Sub1_5091).anInt5177) {
			int i_13_ = ((Class163_Sub1) aClass163_Sub1_5091).anInt5177 - i_4_;
			i_7_ -= i_13_;
			i_4_ = ((Class163_Sub1) aClass163_Sub1_5091).anInt5177;
			i_12_ += i_13_ * i_6_;
			i_9_ += i_13_ * i_8_;
		}
		if (i_4_ + i_7_ > ((Class163_Sub1) aClass163_Sub1_5091).anInt5193)
			i_7_ -= (i_4_ + i_7_ - ((Class163_Sub1) aClass163_Sub1_5091).anInt5193);
		if (i < ((Class163_Sub1) aClass163_Sub1_5091).anInt5186) {
			int i_14_ = ((Class163_Sub1) aClass163_Sub1_5091).anInt5186 - i;
			i_6_ -= i_14_;
			i = ((Class163_Sub1) aClass163_Sub1_5091).anInt5186;
			i_12_ += i_14_;
			i_9_ += i_14_;
			i_11_ += i_14_;
			i_10_ += i_14_;
		}
		if (i + i_6_ > ((Class163_Sub1) aClass163_Sub1_5091).anInt5178) {
			int i_15_ = i + i_6_
					- ((Class163_Sub1) aClass163_Sub1_5091).anInt5178;
			i_6_ -= i_15_;
			i_11_ += i_15_;
			i_10_ += i_15_;
		}
		if (i_6_ > 0 && i_7_ > 0)
			method2271(aByteArrayArray5087[c],
					((Class163_Sub1) aClass163_Sub1_5091).anIntArray5214, i_5_,
					i_12_, i_9_, i_6_, i_7_, i_10_, i_11_);
	}

	private final void method2270(byte[] is, int[] is_16_, int i, int i_17_,
			int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_,
			int i_24_, int i_25_, Class72 class72, int i_26_, int i_27_) {
		Class72_Sub2 class72_sub2 = (Class72_Sub2) class72;
		int[] is_28_ = ((Class72_Sub2) class72_sub2).anIntArray6909;
		int[] is_29_ = ((Class72_Sub2) class72_sub2).anIntArray6911;
		int i_30_ = i_23_ - ((Class163_Sub1) aClass163_Sub1_5091).anInt5186;
		int i_31_ = i_24_;
		if (i_27_ > i_31_) {
			i_31_ = i_27_;
			i_18_ += ((i_27_ - i_24_) * ((Class163_Sub1) aClass163_Sub1_5091).anInt5206);
			i_17_ += (i_27_ - i_24_) * i_25_;
		}
		int i_32_ = (i_27_ + is_28_.length < i_24_ + i_20_ ? i_27_
				+ is_28_.length : i_24_ + i_20_);
		for (int i_33_ = i_31_; i_33_ < i_32_; i_33_++) {
			int i_34_ = is_28_[i_33_ - i_27_] + i_26_;
			int i_35_ = is_29_[i_33_ - i_27_];
			int i_36_ = i_19_;
			if (i_30_ > i_34_) {
				int i_37_ = i_30_ - i_34_;
				if (i_37_ >= i_35_) {
					i_17_ += i_19_ + i_22_;
					i_18_ += i_19_ + i_21_;
					continue;
				}
				i_35_ -= i_37_;
			} else {
				int i_38_ = i_34_ - i_30_;
				if (i_38_ >= i_19_) {
					i_17_ += i_19_ + i_22_;
					i_18_ += i_19_ + i_21_;
					continue;
				}
				i_17_ += i_38_;
				i_36_ -= i_38_;
				i_18_ += i_38_;
			}
			int i_39_ = 0;
			if (i_36_ < i_35_)
				i_35_ = i_36_;
			else
				i_39_ = i_36_ - i_35_;
			for (int i_40_ = -i_35_; i_40_ < 0; i_40_++) {
				int i_41_ = is[i_17_++] & 0xff;
				if (i_41_ != 0) {
					int i_42_ = ((((i & 0xff00ff) * i_41_ & ~0xff00ff) + ((i & 0xff00)
							* i_41_ & 0xff0000)) >> 8);
					i_41_ = 256 - i_41_;
					int i_43_ = is_16_[i_18_];
					is_16_[i_18_++] = ((((i_43_ & 0xff00ff) * i_41_ & ~0xff00ff) + ((i_43_ & 0xff00)
							* i_41_ & 0xff0000)) >> 8)
							+ i_42_;
				} else
					i_18_++;
			}
			i_17_ += i_39_ + i_22_;
			i_18_ += i_39_ + i_21_;
		}
	}

	final void method703(char c, int i, int i_44_, int i_45_, boolean bool,
			Class72 class72, int i_46_, int i_47_) {
		if (class72 == null)
			fa(c, i, i_44_, i_45_, bool);
		else {
			i += anIntArray5089[c];
			i_44_ += anIntArray5090[c];
			int i_48_ = anIntArray5088[c];
			int i_49_ = anIntArray5086[c];
			int i_50_ = ((Class163_Sub1) aClass163_Sub1_5091).anInt5206;
			int i_51_ = i + i_44_ * i_50_;
			int i_52_ = i_50_ - i_48_;
			int i_53_ = 0;
			int i_54_ = 0;
			if (i_44_ < ((Class163_Sub1) aClass163_Sub1_5091).anInt5177) {
				int i_55_ = ((Class163_Sub1) aClass163_Sub1_5091).anInt5177
						- i_44_;
				i_49_ -= i_55_;
				i_44_ = ((Class163_Sub1) aClass163_Sub1_5091).anInt5177;
				i_54_ += i_55_ * i_48_;
				i_51_ += i_55_ * i_50_;
			}
			if (i_44_ + i_49_ > ((Class163_Sub1) aClass163_Sub1_5091).anInt5193)
				i_49_ -= (i_44_ + i_49_ - ((Class163_Sub1) aClass163_Sub1_5091).anInt5193);
			if (i < ((Class163_Sub1) aClass163_Sub1_5091).anInt5186) {
				int i_56_ = ((Class163_Sub1) aClass163_Sub1_5091).anInt5186 - i;
				i_48_ -= i_56_;
				i = ((Class163_Sub1) aClass163_Sub1_5091).anInt5186;
				i_54_ += i_56_;
				i_51_ += i_56_;
				i_53_ += i_56_;
				i_52_ += i_56_;
			}
			if (i + i_48_ > ((Class163_Sub1) aClass163_Sub1_5091).anInt5178) {
				int i_57_ = (i + i_48_ - ((Class163_Sub1) aClass163_Sub1_5091).anInt5178);
				i_48_ -= i_57_;
				i_53_ += i_57_;
				i_52_ += i_57_;
			}
			if (i_48_ > 0 && i_49_ > 0)
				method2270(aByteArrayArray5087[c],
						(((Class163_Sub1) aClass163_Sub1_5091).anIntArray5214),
						i_45_, i_54_, i_51_, i_48_, i_49_, i_52_, i_53_, i,
						i_44_, anIntArray5088[c], class72, i_46_, i_47_);
		}
	}

	private final void method2271(byte[] is, int[] is_58_, int i, int i_59_,
			int i_60_, int i_61_, int i_62_, int i_63_, int i_64_) {
		for (int i_65_ = -i_62_; i_65_ < 0; i_65_++) {
			for (int i_66_ = -i_61_; i_66_ < 0; i_66_++) {
				int i_67_ = is[i_59_++] & 0xff;
				if (i_67_ != 0) {
					int i_68_ = ((((i & 0xff00ff) * i_67_ & ~0xff00ff) + ((i & 0xff00)
							* i_67_ & 0xff0000)) >> 8);
					i_67_ = 256 - i_67_;
					int i_69_ = is_58_[i_60_];
					is_58_[i_60_++] = ((((i_69_ & 0xff00ff) * i_67_ & ~0xff00ff) + ((i_69_ & 0xff00)
							* i_67_ & 0xff0000)) >> 8)
							+ i_68_;
				} else
					i_60_++;
			}
			i_60_ += i_63_;
			i_59_ += i_64_;
		}
	}
}
