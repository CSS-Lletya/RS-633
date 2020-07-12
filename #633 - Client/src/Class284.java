/* Class284 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class284 {
	private static Class276 aClass276_3837 = new Class276();

	private static final byte method1749(Class276 class276) {
		return (byte) method1755(1, class276);
	}

	private static final void method1750(Class276 class276) {
		byte i = ((Class276) class276).aByte3724;
		int i_0_ = ((Class276) class276).anInt3710;
		int i_1_ = ((Class276) class276).anInt3714;
		int i_2_ = ((Class276) class276).anInt3735;
		int[] is = Class251_Sub1.anIntArray5424;
		int i_3_ = ((Class276) class276).anInt3733;
		byte[] is_4_ = ((Class276) class276).aByteArray3720;
		int i_5_ = ((Class276) class276).anInt3712;
		int i_6_ = ((Class276) class276).anInt3728;
		int i_7_ = i_6_;
		int i_8_ = ((Class276) class276).anInt3722 + 1;
		while_149_: for (;;) {
			if (i_0_ > 0) {
				for (;;) {
					if (i_6_ == 0)
						break while_149_;
					if (i_0_ == 1)
						break;
					is_4_[i_5_] = i;
					i_0_--;
					i_5_++;
					i_6_--;
				}
				if (i_6_ == 0) {
					i_0_ = 1;
					break;
				}
				is_4_[i_5_] = i;
				i_5_++;
				i_6_--;
			}
			for (;;) {
				if (i_1_ == i_8_) {
					i_0_ = 0;
					break while_149_;
				}
				i = (byte) i_2_;
				i_3_ = is[i_3_];
				int i_9_ = (byte) i_3_;
				i_3_ >>= 8;
				i_1_++;
				if (i_9_ != i_2_) {
					i_2_ = i_9_;
					if (i_6_ == 0) {
						i_0_ = 1;
						break while_149_;
					}
					is_4_[i_5_] = i;
					i_5_++;
					i_6_--;
				} else {
					if (i_1_ != i_8_)
						break;
					if (i_6_ == 0) {
						i_0_ = 1;
						break while_149_;
					}
					is_4_[i_5_] = i;
					i_5_++;
					i_6_--;
				}
			}
			i_0_ = 2;
			i_3_ = is[i_3_];
			int i_10_ = (byte) i_3_;
			i_3_ >>= 8;
			if (++i_1_ != i_8_) {
				if (i_10_ != i_2_)
					i_2_ = i_10_;
				else {
					i_0_ = 3;
					i_3_ = is[i_3_];
					i_10_ = (byte) i_3_;
					i_3_ >>= 8;
					if (++i_1_ != i_8_) {
						if (i_10_ != i_2_)
							i_2_ = i_10_;
						else {
							i_3_ = is[i_3_];
							i_10_ = (byte) i_3_;
							i_3_ >>= 8;
							i_1_++;
							i_0_ = (i_10_ & 0xff) + 4;
							i_3_ = is[i_3_];
							i_2_ = (byte) i_3_;
							i_3_ >>= 8;
							i_1_++;
						}
					}
				}
			}
		}
		int i_11_ = ((Class276) class276).anInt3709;
		((Class276) class276).anInt3709 += i_7_ - i_6_;
		((Class276) class276).aByte3724 = i;
		((Class276) class276).anInt3710 = i_0_;
		((Class276) class276).anInt3714 = i_1_;
		((Class276) class276).anInt3735 = i_2_;
		Class251_Sub1.anIntArray5424 = is;
		((Class276) class276).anInt3733 = i_3_;
		((Class276) class276).aByteArray3720 = is_4_;
		((Class276) class276).anInt3712 = i_5_;
		((Class276) class276).anInt3728 = i_6_;
	}

	private static final void method1751(Class276 class276) {
		boolean bool = false;
		boolean bool_12_ = false;
		boolean bool_13_ = false;
		boolean bool_14_ = false;
		boolean bool_15_ = false;
		boolean bool_16_ = false;
		boolean bool_17_ = false;
		boolean bool_18_ = false;
		boolean bool_19_ = false;
		boolean bool_20_ = false;
		boolean bool_21_ = false;
		boolean bool_22_ = false;
		boolean bool_23_ = false;
		boolean bool_24_ = false;
		boolean bool_25_ = false;
		boolean bool_26_ = false;
		boolean bool_27_ = false;
		boolean bool_28_ = false;
		int i = 0;
		int[] is = null;
		int[] is_29_ = null;
		int[] is_30_ = null;
		((Class276) class276).anInt3736 = 1;
		if (Class251_Sub1.anIntArray5424 == null)
			Class251_Sub1.anIntArray5424 = new int[((Class276) class276).anInt3736 * 100000];
		boolean bool_31_ = true;
		while (bool_31_) {
			byte i_32_ = method1752(class276);
			if (i_32_ == 23)
				break;
			i_32_ = method1752(class276);
			i_32_ = method1752(class276);
			i_32_ = method1752(class276);
			i_32_ = method1752(class276);
			i_32_ = method1752(class276);
			i_32_ = method1752(class276);
			i_32_ = method1752(class276);
			i_32_ = method1752(class276);
			i_32_ = method1752(class276);
			i_32_ = method1749(class276);
			((Class276) class276).anInt3719 = 0;
			int i_33_ = method1752(class276);
			((Class276) class276).anInt3719 = ((Class276) class276).anInt3719 << 8
					| i_33_ & 0xff;
			i_33_ = method1752(class276);
			((Class276) class276).anInt3719 = ((Class276) class276).anInt3719 << 8
					| i_33_ & 0xff;
			i_33_ = method1752(class276);
			((Class276) class276).anInt3719 = ((Class276) class276).anInt3719 << 8
					| i_33_ & 0xff;
			for (int i_34_ = 0; i_34_ < 16; i_34_++) {
				i_32_ = method1749(class276);
				if (i_32_ == 1)
					((Class276) class276).aBoolArray3731[i_34_] = true;
				else
					((Class276) class276).aBoolArray3731[i_34_] = false;
			}
			for (int i_35_ = 0; i_35_ < 256; i_35_++)
				((Class276) class276).aBoolArray3715[i_35_] = false;
			for (int i_36_ = 0; i_36_ < 16; i_36_++) {
				if (((Class276) class276).aBoolArray3731[i_36_]) {
					for (int i_37_ = 0; i_37_ < 16; i_37_++) {
						i_32_ = method1749(class276);
						if (i_32_ == 1)
							((Class276) class276).aBoolArray3715[(i_36_ * 16 + i_37_)] = true;
					}
				}
			}
			method1754(class276);
			int i_38_ = ((Class276) class276).anInt3740 + 2;
			int i_39_ = method1755(3, class276);
			int i_40_ = method1755(15, class276);
			for (int i_41_ = 0; i_41_ < i_40_; i_41_++) {
				int i_42_ = 0;
				for (;;) {
					i_32_ = method1749(class276);
					if (i_32_ == 0)
						break;
					i_42_++;
				}
				((Class276) class276).aByteArray3713[i_41_] = (byte) i_42_;
			}
			byte[] is_43_ = new byte[6];
			for (byte i_44_ = 0; i_44_ < i_39_; i_44_++)
				is_43_[i_44_] = i_44_;
			for (int i_45_ = 0; i_45_ < i_40_; i_45_++) {
				byte i_46_ = ((Class276) class276).aByteArray3713[i_45_];
				byte i_47_ = is_43_[i_46_];
				for (/**/; i_46_ > 0; i_46_--)
					is_43_[i_46_] = is_43_[i_46_ - 1];
				is_43_[0] = i_47_;
				((Class276) class276).aByteArray3739[i_45_] = i_47_;
			}
			for (int i_48_ = 0; i_48_ < i_39_; i_48_++) {
				int i_49_ = method1755(5, class276);
				for (int i_50_ = 0; i_50_ < i_38_; i_50_++) {
					for (;;) {
						i_32_ = method1749(class276);
						if (i_32_ == 0)
							break;
						i_32_ = method1749(class276);
						if (i_32_ == 0)
							i_49_++;
						else
							i_49_--;
					}
					((Class276) class276).aByteArrayArray3734[i_48_][i_50_] = (byte) i_49_;
				}
			}
			for (int i_51_ = 0; i_51_ < i_39_; i_51_++) {
				int i_52_ = 32;
				byte i_53_ = 0;
				for (int i_54_ = 0; i_54_ < i_38_; i_54_++) {
					if (((Class276) class276).aByteArrayArray3734[i_51_][i_54_] > i_53_)
						i_53_ = (((Class276) class276).aByteArrayArray3734[i_51_][i_54_]);
					if (((Class276) class276).aByteArrayArray3734[i_51_][i_54_] < i_52_)
						i_52_ = (((Class276) class276).aByteArrayArray3734[i_51_][i_54_]);
				}
				method1753(((Class276) class276).anIntArrayArray3725[i_51_],
						((Class276) class276).anIntArrayArray3738[i_51_],
						((Class276) class276).anIntArrayArray3716[i_51_],
						((Class276) class276).aByteArrayArray3734[i_51_],
						i_52_, i_53_, i_38_);
				((Class276) class276).anIntArray3732[i_51_] = i_52_;
			}
			int i_55_ = ((Class276) class276).anInt3740 + 1;
			int i_56_ = -1;
			int i_57_ = 0;
			for (int i_58_ = 0; i_58_ <= 255; i_58_++)
				((Class276) class276).anIntArray3718[i_58_] = 0;
			int i_59_ = 4095;
			for (int i_60_ = 15; i_60_ >= 0; i_60_--) {
				for (int i_61_ = 15; i_61_ >= 0; i_61_--) {
					((Class276) class276).aByteArray3729[i_59_] = (byte) (i_60_ * 16 + i_61_);
					i_59_--;
				}
				((Class276) class276).anIntArray3730[i_60_] = i_59_ + 1;
			}
			int i_62_ = 0;
			if (i_57_ == 0) {
				i_56_++;
				i_57_ = 50;
				byte i_63_ = ((Class276) class276).aByteArray3739[i_56_];
				i = ((Class276) class276).anIntArray3732[i_63_];
				is = ((Class276) class276).anIntArrayArray3725[i_63_];
				is_30_ = ((Class276) class276).anIntArrayArray3716[i_63_];
				is_29_ = ((Class276) class276).anIntArrayArray3738[i_63_];
			}
			i_57_--;
			int i_64_ = i;
			int i_65_;
			int i_66_;
			for (i_66_ = method1755(i_64_, class276); i_66_ > is[i_64_]; i_66_ = i_66_ << 1
					| i_65_) {
				i_64_++;
				i_65_ = method1749(class276);
			}
			int i_67_ = is_30_[i_66_ - is_29_[i_64_]];
			while (i_67_ != i_55_) {
				if (i_67_ == 0 || i_67_ == 1) {
					int i_68_ = -1;
					int i_69_ = 1;
					do {
						if (i_67_ == 0)
							i_68_ += i_69_;
						else if (i_67_ == 1)
							i_68_ += 2 * i_69_;
						i_69_ *= 2;
						if (i_57_ == 0) {
							i_56_++;
							i_57_ = 50;
							byte i_70_ = ((Class276) class276).aByteArray3739[i_56_];
							i = ((Class276) class276).anIntArray3732[i_70_];
							is = (((Class276) class276).anIntArrayArray3725[i_70_]);
							is_30_ = (((Class276) class276).anIntArrayArray3716[i_70_]);
							is_29_ = (((Class276) class276).anIntArrayArray3738[i_70_]);
						}
						i_57_--;
						i_64_ = i;
						for (i_66_ = method1755(i_64_, class276); i_66_ > is[i_64_]; i_66_ = i_66_ << 1
								| i_65_) {
							i_64_++;
							i_65_ = method1749(class276);
						}
						i_67_ = is_30_[i_66_ - is_29_[i_64_]];
					} while (i_67_ == 0 || i_67_ == 1);
					i_68_++;
					i_33_ = (((Class276) class276).aByteArray3737[((((Class276) class276).aByteArray3729[((Class276) class276).anIntArray3730[0]]) & 0xff)]);
					((Class276) class276).anIntArray3718[i_33_ & 0xff] += i_68_;
					for (/**/; i_68_ > 0; i_68_--) {
						Class251_Sub1.anIntArray5424[i_62_] = i_33_ & 0xff;
						i_62_++;
					}
				} else {
					int i_71_ = i_67_ - 1;
					if (i_71_ < 16) {
						int i_72_ = ((Class276) class276).anIntArray3730[0];
						i_32_ = (((Class276) class276).aByteArray3729[i_72_
								+ i_71_]);
						for (/**/; i_71_ > 3; i_71_ -= 4) {
							int i_73_ = i_72_ + i_71_;
							((Class276) class276).aByteArray3729[i_73_] = (((Class276) class276).aByteArray3729[i_73_ - 1]);
							((Class276) class276).aByteArray3729[i_73_ - 1] = (((Class276) class276).aByteArray3729[i_73_ - 2]);
							((Class276) class276).aByteArray3729[i_73_ - 2] = (((Class276) class276).aByteArray3729[i_73_ - 3]);
							((Class276) class276).aByteArray3729[i_73_ - 3] = (((Class276) class276).aByteArray3729[i_73_ - 4]);
						}
						for (/**/; i_71_ > 0; i_71_--)
							((Class276) class276).aByteArray3729[i_72_ + i_71_] = (((Class276) class276).aByteArray3729[i_72_
									+ i_71_ - 1]);
						((Class276) class276).aByteArray3729[i_72_] = i_32_;
					} else {
						int i_74_ = i_71_ / 16;
						int i_75_ = i_71_ % 16;
						int i_76_ = (((Class276) class276).anIntArray3730[i_74_] + i_75_);
						i_32_ = ((Class276) class276).aByteArray3729[i_76_];
						for (/**/; (i_76_ > ((Class276) class276).anIntArray3730[i_74_]); i_76_--)
							((Class276) class276).aByteArray3729[i_76_] = (((Class276) class276).aByteArray3729[i_76_ - 1]);
						((Class276) class276).anIntArray3730[i_74_]++;
						for (/**/; i_74_ > 0; i_74_--) {
							((Class276) class276).anIntArray3730[i_74_]--;
							((Class276) class276).aByteArray3729[((Class276) class276).anIntArray3730[i_74_]] = (((Class276) class276).aByteArray3729[(((Class276) class276).anIntArray3730[i_74_ - 1]) + 16 - 1]);
						}
						((Class276) class276).anIntArray3730[0]--;
						((Class276) class276).aByteArray3729[((Class276) class276).anIntArray3730[0]] = i_32_;
						if (((Class276) class276).anIntArray3730[0] == 0) {
							int i_77_ = 4095;
							for (int i_78_ = 15; i_78_ >= 0; i_78_--) {
								for (int i_79_ = 15; i_79_ >= 0; i_79_--) {
									((Class276) class276).aByteArray3729[i_77_] = (((Class276) class276).aByteArray3729[(((Class276) class276).anIntArray3730[i_78_])
											+ i_79_]);
									i_77_--;
								}
								((Class276) class276).anIntArray3730[i_78_] = i_77_ + 1;
							}
						}
					}
					((Class276) class276).anIntArray3718[(((Class276) class276).aByteArray3737[i_32_ & 0xff] & 0xff)]++;
					Class251_Sub1.anIntArray5424[i_62_] = (((Class276) class276).aByteArray3737[i_32_ & 0xff] & 0xff);
					i_62_++;
					if (i_57_ == 0) {
						i_56_++;
						i_57_ = 50;
						byte i_80_ = ((Class276) class276).aByteArray3739[i_56_];
						i = ((Class276) class276).anIntArray3732[i_80_];
						is = ((Class276) class276).anIntArrayArray3725[i_80_];
						is_30_ = ((Class276) class276).anIntArrayArray3716[i_80_];
						is_29_ = ((Class276) class276).anIntArrayArray3738[i_80_];
					}
					i_57_--;
					i_64_ = i;
					for (i_66_ = method1755(i_64_, class276); i_66_ > is[i_64_]; i_66_ = i_66_ << 1
							| i_65_) {
						i_64_++;
						i_65_ = method1749(class276);
					}
					i_67_ = is_30_[i_66_ - is_29_[i_64_]];
				}
			}
			((Class276) class276).anInt3710 = 0;
			((Class276) class276).aByte3724 = (byte) 0;
			((Class276) class276).anIntArray3727[0] = 0;
			for (int i_81_ = 1; i_81_ <= 256; i_81_++)
				((Class276) class276).anIntArray3727[i_81_] = ((Class276) class276).anIntArray3718[i_81_ - 1];
			for (int i_82_ = 1; i_82_ <= 256; i_82_++)
				((Class276) class276).anIntArray3727[i_82_] += ((Class276) class276).anIntArray3727[i_82_ - 1];
			for (int i_83_ = 0; i_83_ < i_62_; i_83_++) {
				i_33_ = (byte) (Class251_Sub1.anIntArray5424[i_83_] & 0xff);
				Class251_Sub1.anIntArray5424[(((Class276) class276).anIntArray3727[i_33_ & 0xff])] |= i_83_ << 8;
				((Class276) class276).anIntArray3727[i_33_ & 0xff]++;
			}
			((Class276) class276).anInt3733 = (Class251_Sub1.anIntArray5424[((Class276) class276).anInt3719]) >> 8;
			((Class276) class276).anInt3714 = 0;
			((Class276) class276).anInt3733 = (Class251_Sub1.anIntArray5424[((Class276) class276).anInt3733]);
			((Class276) class276).anInt3735 = (byte) (((Class276) class276).anInt3733 & 0xff);
			((Class276) class276).anInt3733 >>= 8;
			((Class276) class276).anInt3714++;
			((Class276) class276).anInt3722 = i_62_;
			method1750(class276);
			if ((((Class276) class276).anInt3714 == ((Class276) class276).anInt3722 + 1)
					&& ((Class276) class276).anInt3710 == 0)
				bool_31_ = true;
			else
				bool_31_ = false;
		}
	}

	private static final byte method1752(Class276 class276) {
		return (byte) method1755(8, class276);
	}

	private static final void method1753(int[] is, int[] is_84_, int[] is_85_,
			byte[] is_86_, int i, int i_87_, int i_88_) {
		int i_89_ = 0;
		for (int i_90_ = i; i_90_ <= i_87_; i_90_++) {
			for (int i_91_ = 0; i_91_ < i_88_; i_91_++) {
				if (is_86_[i_91_] == i_90_) {
					is_85_[i_89_] = i_91_;
					i_89_++;
				}
			}
		}
		for (int i_92_ = 0; i_92_ < 23; i_92_++)
			is_84_[i_92_] = 0;
		for (int i_93_ = 0; i_93_ < i_88_; i_93_++)
			is_84_[is_86_[i_93_] + 1]++;
		for (int i_94_ = 1; i_94_ < 23; i_94_++)
			is_84_[i_94_] += is_84_[i_94_ - 1];
		for (int i_95_ = 0; i_95_ < 23; i_95_++)
			is[i_95_] = 0;
		int i_96_ = 0;
		for (int i_97_ = i; i_97_ <= i_87_; i_97_++) {
			i_96_ += is_84_[i_97_ + 1] - is_84_[i_97_];
			is[i_97_] = i_96_ - 1;
			i_96_ <<= 1;
		}
		for (int i_98_ = i + 1; i_98_ <= i_87_; i_98_++)
			is_84_[i_98_] = (is[i_98_ - 1] + 1 << 1) - is_84_[i_98_];
	}

	private static final void method1754(Class276 class276) {
		((Class276) class276).anInt3740 = 0;
		for (int i = 0; i < 256; i++) {
			if (((Class276) class276).aBoolArray3715[i]) {
				((Class276) class276).aByteArray3737[(((Class276) class276).anInt3740)] = (byte) i;
				((Class276) class276).anInt3740++;
			}
		}
	}

	private static final int method1755(int i, Class276 class276) {
		for (;;) {
			if (((Class276) class276).anInt3723 >= i) {
				int i_99_ = ((((Class276) class276).anInt3721 >> ((Class276) class276).anInt3723
						- i) & (1 << i) - 1);
				((Class276) class276).anInt3723 -= i;
				return i_99_;
			}
			((Class276) class276).anInt3721 = (((Class276) class276).anInt3721 << 8 | (((Class276) class276).aByteArray3717[((Class276) class276).anInt3711]) & 0xff);
			((Class276) class276).anInt3723 += 8;
			((Class276) class276).anInt3711++;
			((Class276) class276).anInt3726++;
		}
	}

	static final int method1756(byte[] is, int i, byte[] is_100_, int i_101_,
			int i_102_) {
		synchronized (aClass276_3837) {
			((Class276) aClass276_3837).aByteArray3717 = is_100_;
			((Class276) aClass276_3837).anInt3711 = i_102_;
			((Class276) aClass276_3837).aByteArray3720 = is;
			((Class276) aClass276_3837).anInt3712 = 0;
			((Class276) aClass276_3837).anInt3728 = i;
			((Class276) aClass276_3837).anInt3723 = 0;
			((Class276) aClass276_3837).anInt3721 = 0;
			((Class276) aClass276_3837).anInt3726 = 0;
			((Class276) aClass276_3837).anInt3709 = 0;
			method1751(aClass276_3837);
			i -= ((Class276) aClass276_3837).anInt3728;
			((Class276) aClass276_3837).aByteArray3717 = null;
			((Class276) aClass276_3837).aByteArray3720 = null;
			return i;
		}
	}

	public static void method1757() {
		aClass276_3837 = null;
	}
}
