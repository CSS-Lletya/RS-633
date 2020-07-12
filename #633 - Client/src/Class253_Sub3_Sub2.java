/* Class253_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class253_Sub3_Sub2 extends Class253_Sub3 {
	int[] anIntArray8799;

	Class253_Sub3_Sub2(Class163_Sub1 class163_sub1, int[] is, int i, int i_0_,
			int i_1_, int i_2_, boolean bool) {
		super(class163_sub1, i_1_, i_2_);
		if (bool)
			((Class253_Sub3_Sub2) this).anIntArray8799 = new int[i_1_ * i_2_];
		else
			((Class253_Sub3_Sub2) this).anIntArray8799 = is;
		i_0_ -= ((Class253_Sub3) this).anInt7679;
		int i_3_ = 0;
		for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
			for (int i_5_ = 0; i_5_ < i_1_; i_5_++)
				((Class253_Sub3_Sub2) this).anIntArray8799[i_3_++] = is[i++];
			i += i_0_;
		}
	}

	final void method1626(int i, int i_6_, int i_7_, int i_8_, int i_9_,
			int i_10_, int i_11_, int i_12_) {
		if (((Class253_Sub3) this).aClass163_Sub1_7698.method2293())
			throw new IllegalStateException();
		if (i_7_ > 0 && i_8_ > 0) {
			int i_13_ = 0;
			int i_14_ = 0;
			int i_15_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5206);
			int i_16_ = (((Class253_Sub3) this).anInt7689
					+ ((Class253_Sub3) this).anInt7679 + ((Class253_Sub3) this).anInt7681);
			int i_17_ = (((Class253_Sub3) this).anInt7691
					+ ((Class253_Sub3) this).anInt7671 + ((Class253_Sub3) this).anInt7667);
			int i_18_ = (i_16_ << 16) / i_7_;
			int i_19_ = (i_17_ << 16) / i_8_;
			if (((Class253_Sub3) this).anInt7689 > 0) {
				int i_20_ = (((((Class253_Sub3) this).anInt7689 << 16) + i_18_ - 1) / i_18_);
				i += i_20_;
				i_13_ += i_20_ * i_18_
						- (((Class253_Sub3) this).anInt7689 << 16);
			}
			if (((Class253_Sub3) this).anInt7691 > 0) {
				int i_21_ = (((((Class253_Sub3) this).anInt7691 << 16) + i_19_ - 1) / i_19_);
				i_6_ += i_21_;
				i_14_ += i_21_ * i_19_
						- (((Class253_Sub3) this).anInt7691 << 16);
			}
			if (((Class253_Sub3) this).anInt7679 < i_16_)
				i_7_ = ((((Class253_Sub3) this).anInt7679 << 16) - i_13_
						+ i_18_ - 1)
						/ i_18_;
			if (((Class253_Sub3) this).anInt7671 < i_17_)
				i_8_ = ((((Class253_Sub3) this).anInt7671 << 16) - i_14_
						+ i_19_ - 1)
						/ i_19_;
			int i_22_ = i + i_6_ * i_15_;
			int i_23_ = i_15_ - i_7_;
			if (i_6_ + i_8_ > (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5193))
				i_8_ -= i_6_
						+ i_8_
						- (((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5193);
			if (i_6_ < (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177)) {
				int i_24_ = (((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5177 - i_6_);
				i_8_ -= i_24_;
				i_22_ += i_24_ * i_15_;
				i_14_ += i_19_ * i_24_;
			}
			if (i + i_7_ > (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5178)) {
				int i_25_ = (i + i_7_ - ((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5178);
				i_7_ -= i_25_;
				i_23_ += i_25_;
			}
			if (i < (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186)) {
				int i_26_ = (((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5186 - i);
				i_7_ -= i_26_;
				i_22_ += i_26_;
				i_13_ += i_18_ * i_26_;
				i_23_ += i_26_;
			}
			int[] is = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anIntArray5214);
			if (i_11_ == 0) {
				if (i_9_ == 1) {
					int i_27_ = i_13_;
					for (int i_28_ = -i_8_; i_28_ < 0; i_28_++) {
						int i_29_ = (i_14_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_30_ = -i_7_; i_30_ < 0; i_30_++) {
							is[i_22_++] = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_13_ >> 16)
									+ i_29_]);
							i_13_ += i_18_;
						}
						i_14_ += i_19_;
						i_13_ = i_27_;
						i_22_ += i_23_;
					}
					return;
				}
				if (i_9_ == 0) {
					int i_31_ = (i_10_ & 0xff0000) >> 16;
					int i_32_ = (i_10_ & 0xff00) >> 8;
					int i_33_ = i_10_ & 0xff;
					int i_34_ = i_13_;
					for (int i_35_ = -i_8_; i_35_ < 0; i_35_++) {
						int i_36_ = (i_14_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_37_ = -i_7_; i_37_ < 0; i_37_++) {
							int i_38_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_13_ >> 16)
									+ i_36_]);
							int i_39_ = (i_38_ & 0xff0000) * i_31_ & ~0xffffff;
							int i_40_ = (i_38_ & 0xff00) * i_32_ & 0xff0000;
							int i_41_ = (i_38_ & 0xff) * i_33_ & 0xff00;
							is[i_22_++] = (i_39_ | i_40_ | i_41_) >>> 8;
							i_13_ += i_18_;
						}
						i_14_ += i_19_;
						i_13_ = i_34_;
						i_22_ += i_23_;
					}
					return;
				}
				if (i_9_ == 3) {
					int i_42_ = i_13_;
					for (int i_43_ = -i_8_; i_43_ < 0; i_43_++) {
						int i_44_ = (i_14_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_45_ = -i_7_; i_45_ < 0; i_45_++) {
							int i_46_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_13_ >> 16)
									+ i_44_]);
							int i_47_ = i_46_ + i_10_;
							int i_48_ = (i_46_ & 0xff00ff) + (i_10_ & 0xff00ff);
							int i_49_ = ((i_48_ & 0x1000100) + (i_47_ - i_48_ & 0x10000));
							is[i_22_++] = i_47_ - i_49_ | i_49_ - (i_49_ >>> 8);
							i_13_ += i_18_;
						}
						i_14_ += i_19_;
						i_13_ = i_42_;
						i_22_ += i_23_;
					}
					return;
				}
				if (i_9_ == 2) {
					int i_50_ = i_10_ >>> 24;
					int i_51_ = 256 - i_50_;
					int i_52_ = (i_10_ & 0xff00ff) * i_51_ & ~0xff00ff;
					int i_53_ = (i_10_ & 0xff00) * i_51_ & 0xff0000;
					i_10_ = (i_52_ | i_53_) >>> 8;
					int i_54_ = i_13_;
					for (int i_55_ = -i_8_; i_55_ < 0; i_55_++) {
						int i_56_ = (i_14_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_57_ = -i_7_; i_57_ < 0; i_57_++) {
							int i_58_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_13_ >> 16)
									+ i_56_]);
							i_52_ = (i_58_ & 0xff00ff) * i_50_ & ~0xff00ff;
							i_53_ = (i_58_ & 0xff00) * i_50_ & 0xff0000;
							is[i_22_++] = ((i_52_ | i_53_) >>> 8) + i_10_;
							i_13_ += i_18_;
						}
						i_14_ += i_19_;
						i_13_ = i_54_;
						i_22_ += i_23_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_11_ == 1) {
				if (i_9_ == 1) {
					int i_59_ = i_13_;
					for (int i_60_ = -i_8_; i_60_ < 0; i_60_++) {
						int i_61_ = (i_14_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_62_ = -i_7_; i_62_ < 0; i_62_++) {
							int i_63_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_13_ >> 16)
									+ i_61_]);
							int i_64_ = i_63_ >>> 24;
							int i_65_ = 256 - i_64_;
							int i_66_ = is[i_22_];
							is[i_22_++] = (((((i_63_ & 0xff00ff) * i_64_ + (i_66_ & 0xff00ff)
									* i_65_) & ~0xff00ff) >> 8) + ((((i_63_ & ~0xff00ff) >>> 8)
									* i_64_ + ((i_66_ & ~0xff00ff) >>> 8)
									* i_65_) & ~0xff00ff));
							i_13_ += i_18_;
						}
						i_14_ += i_19_;
						i_13_ = i_59_;
						i_22_ += i_23_;
					}
					return;
				}
				if (i_9_ == 0) {
					int i_67_ = i_13_;
					if ((i_10_ & 0xffffff) == 16777215) {
						for (int i_68_ = -i_8_; i_68_ < 0; i_68_++) {
							int i_69_ = ((i_14_ >> 16) * ((Class253_Sub3) this).anInt7679);
							for (int i_70_ = -i_7_; i_70_ < 0; i_70_++) {
								int i_71_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_13_ >> 16)
										+ i_69_]);
								int i_72_ = (i_71_ >>> 24) * (i_10_ >>> 24) >> 8;
								int i_73_ = 256 - i_72_;
								int i_74_ = is[i_22_];
								is[i_22_++] = ((((i_71_ & 0xff00ff) * i_72_ + (i_74_ & 0xff00ff)
										* i_73_) & ~0xff00ff) + (((i_71_ & 0xff00)
										* i_72_ + (i_74_ & 0xff00) * i_73_) & 0xff0000)) >> 8;
								i_13_ += i_18_;
							}
							i_14_ += i_19_;
							i_13_ = i_67_;
							i_22_ += i_23_;
						}
					} else {
						int i_75_ = (i_10_ & 0xff0000) >> 16;
						int i_76_ = (i_10_ & 0xff00) >> 8;
						int i_77_ = i_10_ & 0xff;
						for (int i_78_ = -i_8_; i_78_ < 0; i_78_++) {
							int i_79_ = ((i_14_ >> 16) * ((Class253_Sub3) this).anInt7679);
							for (int i_80_ = -i_7_; i_80_ < 0; i_80_++) {
								int i_81_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_13_ >> 16)
										+ i_79_]);
								int i_82_ = (i_81_ >>> 24) * (i_10_ >>> 24) >> 8;
								int i_83_ = 256 - i_82_;
								if (i_82_ != 255) {
									int i_84_ = ((i_81_ & 0xff0000) * i_75_ & ~0xffffff);
									int i_85_ = (i_81_ & 0xff00) * i_76_
											& 0xff0000;
									int i_86_ = (i_81_ & 0xff) * i_77_ & 0xff00;
									i_81_ = (i_84_ | i_85_ | i_86_) >>> 8;
									int i_87_ = is[i_22_];
									is[i_22_++] = ((((i_81_ & 0xff00ff) * i_82_ + (i_87_ & 0xff00ff)
											* i_83_) & ~0xff00ff) + (((i_81_ & 0xff00)
											* i_82_ + (i_87_ & 0xff00) * i_83_) & 0xff0000)) >> 8;
								} else {
									int i_88_ = ((i_81_ & 0xff0000) * i_75_ & ~0xffffff);
									int i_89_ = (i_81_ & 0xff00) * i_76_
											& 0xff0000;
									int i_90_ = (i_81_ & 0xff) * i_77_ & 0xff00;
									is[i_22_++] = (i_88_ | i_89_ | i_90_) >>> 8;
								}
								i_13_ += i_18_;
							}
							i_14_ += i_19_;
							i_13_ = i_67_;
							i_22_ += i_23_;
						}
						return;
					}
					return;
				}
				if (i_9_ == 3) {
					int i_91_ = i_13_;
					for (int i_92_ = -i_8_; i_92_ < 0; i_92_++) {
						int i_93_ = (i_14_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_94_ = -i_7_; i_94_ < 0; i_94_++) {
							int i_95_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_13_ >> 16)
									+ i_93_]);
							int i_96_ = i_95_ + i_10_;
							int i_97_ = (i_95_ & 0xff00ff) + (i_10_ & 0xff00ff);
							int i_98_ = ((i_97_ & 0x1000100) + (i_96_ - i_97_ & 0x10000));
							i_98_ = i_96_ - i_98_ | i_98_ - (i_98_ >>> 8);
							int i_99_ = (i_98_ >>> 24) * (i_10_ >>> 24) >> 8;
							int i_100_ = 256 - i_99_;
							if (i_99_ != 255) {
								i_95_ = i_98_;
								i_98_ = is[i_22_];
								i_98_ = ((((i_95_ & 0xff00ff) * i_99_ + (i_98_ & 0xff00ff)
										* i_100_) & ~0xff00ff) + (((i_95_ & 0xff00)
										* i_99_ + (i_98_ & 0xff00) * i_100_) & 0xff0000)) >> 8;
							}
							is[i_22_++] = i_98_;
							i_13_ += i_18_;
						}
						i_14_ += i_19_;
						i_13_ = i_91_;
						i_22_ += i_23_;
					}
					return;
				}
				if (i_9_ == 2) {
					int i_101_ = i_10_ >>> 24;
					int i_102_ = 256 - i_101_;
					int i_103_ = (i_10_ & 0xff00ff) * i_102_ & ~0xff00ff;
					int i_104_ = (i_10_ & 0xff00) * i_102_ & 0xff0000;
					i_10_ = (i_103_ | i_104_) >>> 8;
					int i_105_ = i_13_;
					for (int i_106_ = -i_8_; i_106_ < 0; i_106_++) {
						int i_107_ = (i_14_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_108_ = -i_7_; i_108_ < 0; i_108_++) {
							int i_109_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_13_ >> 16)
									+ i_107_]);
							int i_110_ = i_109_ >>> 24;
							int i_111_ = 256 - i_110_;
							i_103_ = (i_109_ & 0xff00ff) * i_101_ & ~0xff00ff;
							i_104_ = (i_109_ & 0xff00) * i_101_ & 0xff0000;
							i_109_ = ((i_103_ | i_104_) >>> 8) + i_10_;
							int i_112_ = is[i_22_];
							is[i_22_++] = ((((i_109_ & 0xff00ff) * i_110_ + (i_112_ & 0xff00ff)
									* i_111_) & ~0xff00ff) + (((i_109_ & 0xff00)
									* i_110_ + (i_112_ & 0xff00) * i_111_) & 0xff0000)) >> 8;
							i_13_ += i_18_;
						}
						i_14_ += i_19_;
						i_13_ = i_105_;
						i_22_ += i_23_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_11_ == 2) {
				if (i_9_ == 1) {
					int i_113_ = i_13_;
					for (int i_114_ = -i_8_; i_114_ < 0; i_114_++) {
						int i_115_ = (i_14_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_116_ = -i_7_; i_116_ < 0; i_116_++) {
							int i_117_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_13_ >> 16)
									+ i_115_]);
							if (i_117_ != 0) {
								int i_118_ = is[i_22_];
								int i_119_ = i_117_ + i_118_;
								int i_120_ = ((i_117_ & 0xff00ff) + (i_118_ & 0xff00ff));
								i_118_ = (i_120_ & 0x1000100)
										+ (i_119_ - i_120_ & 0x10000);
								is[i_22_++] = i_119_ - i_118_ | i_118_
										- (i_118_ >>> 8);
							} else
								i_22_++;
							i_13_ += i_18_;
						}
						i_14_ += i_19_;
						i_13_ = i_113_;
						i_22_ += i_23_;
					}
					return;
				}
				if (i_9_ == 0) {
					int i_121_ = i_13_;
					int i_122_ = (i_10_ & 0xff0000) >> 16;
					int i_123_ = (i_10_ & 0xff00) >> 8;
					int i_124_ = i_10_ & 0xff;
					for (int i_125_ = -i_8_; i_125_ < 0; i_125_++) {
						int i_126_ = (i_14_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_127_ = -i_7_; i_127_ < 0; i_127_++) {
							int i_128_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_13_ >> 16)
									+ i_126_]);
							if (i_128_ != 0) {
								int i_129_ = (i_128_ & 0xff0000) * i_122_
										& ~0xffffff;
								int i_130_ = (i_128_ & 0xff00) * i_123_
										& 0xff0000;
								int i_131_ = (i_128_ & 0xff) * i_124_ & 0xff00;
								i_128_ = (i_129_ | i_130_ | i_131_) >>> 8;
								int i_132_ = is[i_22_];
								int i_133_ = i_128_ + i_132_;
								int i_134_ = ((i_128_ & 0xff00ff) + (i_132_ & 0xff00ff));
								i_132_ = (i_134_ & 0x1000100)
										+ (i_133_ - i_134_ & 0x10000);
								is[i_22_++] = i_133_ - i_132_ | i_132_
										- (i_132_ >>> 8);
							} else
								i_22_++;
							i_13_ += i_18_;
						}
						i_14_ += i_19_;
						i_13_ = i_121_;
						i_22_ += i_23_;
					}
					return;
				}
				if (i_9_ == 3) {
					int i_135_ = i_13_;
					for (int i_136_ = -i_8_; i_136_ < 0; i_136_++) {
						int i_137_ = (i_14_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_138_ = -i_7_; i_138_ < 0; i_138_++) {
							int i_139_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_13_ >> 16)
									+ i_137_]);
							int i_140_ = i_139_ + i_10_;
							int i_141_ = (i_139_ & 0xff00ff)
									+ (i_10_ & 0xff00ff);
							int i_142_ = ((i_141_ & 0x1000100) + (i_140_
									- i_141_ & 0x10000));
							i_139_ = i_140_ - i_142_ | i_142_ - (i_142_ >>> 8);
							i_142_ = is[i_22_];
							i_140_ = i_139_ + i_142_;
							i_141_ = (i_139_ & 0xff00ff) + (i_142_ & 0xff00ff);
							i_142_ = (i_141_ & 0x1000100)
									+ (i_140_ - i_141_ & 0x10000);
							is[i_22_++] = i_140_ - i_142_ | i_142_
									- (i_142_ >>> 8);
							i_13_ += i_18_;
						}
						i_14_ += i_19_;
						i_13_ = i_135_;
						i_22_ += i_23_;
					}
					return;
				}
				if (i_9_ == 2) {
					int i_143_ = i_10_ >>> 24;
					int i_144_ = 256 - i_143_;
					int i_145_ = (i_10_ & 0xff00ff) * i_144_ & ~0xff00ff;
					int i_146_ = (i_10_ & 0xff00) * i_144_ & 0xff0000;
					i_10_ = (i_145_ | i_146_) >>> 8;
					int i_147_ = i_13_;
					for (int i_148_ = -i_8_; i_148_ < 0; i_148_++) {
						int i_149_ = (i_14_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_150_ = -i_7_; i_150_ < 0; i_150_++) {
							int i_151_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_13_ >> 16)
									+ i_149_]);
							if (i_151_ != 0) {
								i_145_ = (i_151_ & 0xff00ff) * i_143_
										& ~0xff00ff;
								i_146_ = (i_151_ & 0xff00) * i_143_ & 0xff0000;
								i_151_ = ((i_145_ | i_146_) >>> 8) + i_10_;
								int i_152_ = is[i_22_];
								int i_153_ = i_151_ + i_152_;
								int i_154_ = ((i_151_ & 0xff00ff) + (i_152_ & 0xff00ff));
								i_152_ = (i_154_ & 0x1000100)
										+ (i_153_ - i_154_ & 0x10000);
								is[i_22_++] = i_153_ - i_152_ | i_152_
										- (i_152_ >>> 8);
							} else
								i_22_++;
							i_13_ += i_18_;
						}
						i_14_ += i_19_;
						i_13_ = i_147_;
						i_22_ += i_23_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}

	final void method3106(int i, int i_155_, int i_156_, int i_157_,
			int i_158_, int i_159_, int i_160_, int i_161_, int i_162_) {
		if (i_157_ > 0 && i_158_ > 0) {
			int i_163_ = 0;
			int i_164_ = 0;
			int i_165_ = (((Class253_Sub3) this).anInt7689
					+ ((Class253_Sub3) this).anInt7679 + ((Class253_Sub3) this).anInt7681);
			int i_166_ = (((Class253_Sub3) this).anInt7691
					+ ((Class253_Sub3) this).anInt7671 + ((Class253_Sub3) this).anInt7667);
			int i_167_ = (i_165_ << 16) / i_157_;
			int i_168_ = (i_166_ << 16) / i_158_;
			if (((Class253_Sub3) this).anInt7689 > 0) {
				int i_169_ = (((((Class253_Sub3) this).anInt7689 << 16)
						+ i_167_ - 1) / i_167_);
				i += i_169_;
				i_163_ += i_169_ * i_167_
						- (((Class253_Sub3) this).anInt7689 << 16);
			}
			if (((Class253_Sub3) this).anInt7691 > 0) {
				int i_170_ = (((((Class253_Sub3) this).anInt7691 << 16)
						+ i_168_ - 1) / i_168_);
				i_155_ += i_170_;
				i_164_ += i_170_ * i_168_
						- (((Class253_Sub3) this).anInt7691 << 16);
			}
			if (((Class253_Sub3) this).anInt7679 < i_165_)
				i_157_ = ((((Class253_Sub3) this).anInt7679 << 16) - i_163_
						+ i_167_ - 1)
						/ i_167_;
			if (((Class253_Sub3) this).anInt7671 < i_166_)
				i_158_ = ((((Class253_Sub3) this).anInt7671 << 16) - i_164_
						+ i_168_ - 1)
						/ i_168_;
			int i_171_ = i
					+ i_155_
					* (((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5206);
			int i_172_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5206)
					- i_157_;
			if (i_155_ + i_158_ > (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5193))
				i_158_ -= i_155_
						+ i_158_
						- ((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5193;
			if (i_155_ < (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177)) {
				int i_173_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177 - i_155_);
				i_158_ -= i_173_;
				i_171_ += i_173_
						* (((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5206);
				i_164_ += i_168_ * i_173_;
			}
			if (i + i_157_ > (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5178)) {
				int i_174_ = (i + i_157_ - ((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5178);
				i_157_ -= i_174_;
				i_172_ += i_174_;
			}
			if (i < (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186)) {
				int i_175_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186 - i);
				i_157_ -= i_175_;
				i_171_ += i_175_;
				i_163_ += i_167_ * i_175_;
				i_172_ += i_175_;
			}
			float[] fs = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).aFloatArray5204);
			int[] is = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anIntArray5214);
			if (i_161_ == 0) {
				if (i_159_ == 1) {
					int i_176_ = i_163_;
					for (int i_177_ = -i_158_; i_177_ < 0; i_177_++) {
						int i_178_ = ((i_164_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_179_ = -i_157_; i_179_ < 0; i_179_++) {
							if ((float) i_156_ < fs[i_171_]) {
								is[i_171_] = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_163_ >> 16)
										+ i_178_]);
								fs[i_171_] = (float) i_156_;
							}
							i_163_ += i_167_;
							i_171_++;
						}
						i_164_ += i_168_;
						i_163_ = i_176_;
						i_171_ += i_172_;
					}
					return;
				}
				if (i_159_ == 0) {
					int i_180_ = (i_160_ & 0xff0000) >> 16;
					int i_181_ = (i_160_ & 0xff00) >> 8;
					int i_182_ = i_160_ & 0xff;
					int i_183_ = i_163_;
					for (int i_184_ = -i_158_; i_184_ < 0; i_184_++) {
						int i_185_ = ((i_164_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_186_ = -i_157_; i_186_ < 0; i_186_++) {
							if ((float) i_156_ < fs[i_171_]) {
								int i_187_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_163_ >> 16)
										+ i_185_]);
								int i_188_ = (i_187_ & 0xff0000) * i_180_
										& ~0xffffff;
								int i_189_ = (i_187_ & 0xff00) * i_181_
										& 0xff0000;
								int i_190_ = (i_187_ & 0xff) * i_182_ & 0xff00;
								is[i_171_] = (i_188_ | i_189_ | i_190_) >>> 8;
								fs[i_171_] = (float) i_156_;
							}
							i_163_ += i_167_;
							i_171_++;
						}
						i_164_ += i_168_;
						i_163_ = i_183_;
						i_171_ += i_172_;
					}
					return;
				}
				if (i_159_ == 3) {
					int i_191_ = i_163_;
					for (int i_192_ = -i_158_; i_192_ < 0; i_192_++) {
						int i_193_ = ((i_164_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_194_ = -i_157_; i_194_ < 0; i_194_++) {
							if ((float) i_156_ < fs[i_171_]) {
								int i_195_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_163_ >> 16)
										+ i_193_]);
								int i_196_ = i_195_ + i_160_;
								int i_197_ = ((i_195_ & 0xff00ff) + (i_160_ & 0xff00ff));
								int i_198_ = ((i_197_ & 0x1000100) + (i_196_
										- i_197_ & 0x10000));
								is[i_171_] = i_196_ - i_198_ | i_198_
										- (i_198_ >>> 8);
								fs[i_171_] = (float) i_156_;
							}
							i_163_ += i_167_;
							i_171_++;
						}
						i_164_ += i_168_;
						i_163_ = i_191_;
						i_171_ += i_172_;
					}
					return;
				}
				if (i_159_ == 2) {
					int i_199_ = i_160_ >>> 24;
					int i_200_ = 256 - i_199_;
					int i_201_ = (i_160_ & 0xff00ff) * i_200_ & ~0xff00ff;
					int i_202_ = (i_160_ & 0xff00) * i_200_ & 0xff0000;
					i_160_ = (i_201_ | i_202_) >>> 8;
					int i_203_ = i_163_;
					for (int i_204_ = -i_158_; i_204_ < 0; i_204_++) {
						int i_205_ = ((i_164_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_206_ = -i_157_; i_206_ < 0; i_206_++) {
							if ((float) i_156_ < fs[i_171_]) {
								int i_207_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_163_ >> 16)
										+ i_205_]);
								i_201_ = (i_207_ & 0xff00ff) * i_199_
										& ~0xff00ff;
								i_202_ = (i_207_ & 0xff00) * i_199_ & 0xff0000;
								is[i_171_] = ((i_201_ | i_202_) >>> 8) + i_160_;
								fs[i_171_] = (float) i_156_;
							}
							i_163_ += i_167_;
							i_171_++;
						}
						i_164_ += i_168_;
						i_163_ = i_203_;
						i_171_ += i_172_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_161_ == 1) {
				if (i_159_ == 1) {
					int i_208_ = i_163_;
					for (int i_209_ = -i_158_; i_209_ < 0; i_209_++) {
						int i_210_ = ((i_164_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_211_ = -i_157_; i_211_ < 0; i_211_++) {
							if ((float) i_156_ < fs[i_171_]) {
								int i_212_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_163_ >> 16)
										+ i_210_]);
								int i_213_ = i_212_ >>> 24;
								int i_214_ = 256 - i_213_;
								int i_215_ = is[i_171_];
								is[i_171_] = (((((i_212_ & 0xff00ff) * i_213_ + (i_215_ & 0xff00ff)
										* i_214_) & ~0xff00ff) >> 8) + (((((i_212_ & ~0xff00ff) >>> 8) * i_213_) + (((i_215_ & ~0xff00ff) >>> 8) * i_214_)) & ~0xff00ff));
								fs[i_171_] = (float) i_156_;
							}
							i_163_ += i_167_;
							i_171_++;
						}
						i_164_ += i_168_;
						i_163_ = i_208_;
						i_171_ += i_172_;
					}
					return;
				}
				if (i_159_ == 0) {
					int i_216_ = i_163_;
					if ((i_160_ & 0xffffff) == 16777215) {
						for (int i_217_ = -i_158_; i_217_ < 0; i_217_++) {
							int i_218_ = ((i_164_ >> 16) * ((Class253_Sub3) this).anInt7679);
							for (int i_219_ = -i_157_; i_219_ < 0; i_219_++) {
								if ((float) i_156_ < fs[i_171_]) {
									int i_220_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_163_ >> 16)
											+ i_218_]);
									int i_221_ = ((i_220_ >>> 24)
											* (i_160_ >>> 24) >> 8);
									int i_222_ = 256 - i_221_;
									int i_223_ = is[i_171_];
									is[i_171_] = ((((i_220_ & 0xff00ff)
											* i_221_ + (i_223_ & 0xff00ff)
											* i_222_) & ~0xff00ff) + (((i_220_ & 0xff00)
											* i_221_ + (i_223_ & 0xff00)
											* i_222_) & 0xff0000)) >> 8;
									fs[i_171_] = (float) i_156_;
								}
								i_163_ += i_167_;
								i_171_++;
							}
							i_164_ += i_168_;
							i_163_ = i_216_;
							i_171_ += i_172_;
						}
					} else {
						int i_224_ = (i_160_ & 0xff0000) >> 16;
						int i_225_ = (i_160_ & 0xff00) >> 8;
						int i_226_ = i_160_ & 0xff;
						for (int i_227_ = -i_158_; i_227_ < 0; i_227_++) {
							int i_228_ = ((i_164_ >> 16) * ((Class253_Sub3) this).anInt7679);
							for (int i_229_ = -i_157_; i_229_ < 0; i_229_++) {
								if ((float) i_156_ < fs[i_171_]) {
									int i_230_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_163_ >> 16)
											+ i_228_]);
									int i_231_ = ((i_230_ >>> 24)
											* (i_160_ >>> 24) >> 8);
									int i_232_ = 256 - i_231_;
									if (i_231_ != 255) {
										int i_233_ = ((i_230_ & 0xff0000)
												* i_224_ & ~0xffffff);
										int i_234_ = ((i_230_ & 0xff00)
												* i_225_ & 0xff0000);
										int i_235_ = ((i_230_ & 0xff) * i_226_ & 0xff00);
										i_230_ = (i_233_ | i_234_ | i_235_) >>> 8;
										int i_236_ = is[i_171_];
										is[i_171_] = ((((i_230_ & 0xff00ff)
												* i_231_ + ((i_236_ & 0xff00ff) * i_232_)) & ~0xff00ff) + (((i_230_ & 0xff00)
												* i_231_ + ((i_236_ & 0xff00) * i_232_)) & 0xff0000)) >> 8;
										fs[i_171_] = (float) i_156_;
									} else {
										int i_237_ = ((i_230_ & 0xff0000)
												* i_224_ & ~0xffffff);
										int i_238_ = ((i_230_ & 0xff00)
												* i_225_ & 0xff0000);
										int i_239_ = ((i_230_ & 0xff) * i_226_ & 0xff00);
										is[i_171_] = (i_237_ | i_238_ | i_239_) >>> 8;
										fs[i_171_] = (float) i_156_;
									}
								}
								i_163_ += i_167_;
								i_171_++;
							}
							i_164_ += i_168_;
							i_163_ = i_216_;
							i_171_ += i_172_;
						}
						return;
					}
					return;
				}
				if (i_159_ == 3) {
					int i_240_ = i_163_;
					for (int i_241_ = -i_158_; i_241_ < 0; i_241_++) {
						int i_242_ = ((i_164_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_243_ = -i_157_; i_243_ < 0; i_243_++) {
							if ((float) i_156_ < fs[i_171_]) {
								int i_244_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_163_ >> 16)
										+ i_242_]);
								int i_245_ = i_244_ + i_160_;
								int i_246_ = ((i_244_ & 0xff00ff) + (i_160_ & 0xff00ff));
								int i_247_ = ((i_246_ & 0x1000100) + (i_245_
										- i_246_ & 0x10000));
								i_247_ = i_245_ - i_247_ | i_247_
										- (i_247_ >>> 8);
								int i_248_ = (i_247_ >>> 24) * (i_160_ >>> 24) >> 8;
								int i_249_ = 256 - i_248_;
								if (i_248_ != 255) {
									i_244_ = i_247_;
									i_247_ = is[i_171_];
									i_247_ = ((((i_244_ & 0xff00ff) * i_248_ + (i_247_ & 0xff00ff)
											* i_249_) & ~0xff00ff) + (((i_244_ & 0xff00)
											* i_248_ + (i_247_ & 0xff00)
											* i_249_) & 0xff0000)) >> 8;
								}
								is[i_171_] = i_247_;
								fs[i_171_] = (float) i_156_;
							}
							i_163_ += i_167_;
							i_171_++;
						}
						i_164_ += i_168_;
						i_163_ = i_240_;
						i_171_ += i_172_;
					}
					return;
				}
				if (i_159_ == 2) {
					int i_250_ = i_160_ >>> 24;
					int i_251_ = 256 - i_250_;
					int i_252_ = (i_160_ & 0xff00ff) * i_251_ & ~0xff00ff;
					int i_253_ = (i_160_ & 0xff00) * i_251_ & 0xff0000;
					i_160_ = (i_252_ | i_253_) >>> 8;
					int i_254_ = i_163_;
					for (int i_255_ = -i_158_; i_255_ < 0; i_255_++) {
						int i_256_ = ((i_164_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_257_ = -i_157_; i_257_ < 0; i_257_++) {
							if ((float) i_156_ < fs[i_171_]) {
								int i_258_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_163_ >> 16)
										+ i_256_]);
								int i_259_ = i_258_ >>> 24;
								int i_260_ = 256 - i_259_;
								i_252_ = (i_258_ & 0xff00ff) * i_250_
										& ~0xff00ff;
								i_253_ = (i_258_ & 0xff00) * i_250_ & 0xff0000;
								i_258_ = ((i_252_ | i_253_) >>> 8) + i_160_;
								int i_261_ = is[i_171_];
								is[i_171_] = ((((i_258_ & 0xff00ff) * i_259_ + (i_261_ & 0xff00ff)
										* i_260_) & ~0xff00ff) + (((i_258_ & 0xff00)
										* i_259_ + (i_261_ & 0xff00) * i_260_) & 0xff0000)) >> 8;
								fs[i_171_] = (float) i_156_;
							}
							i_163_ += i_167_;
							i_171_++;
						}
						i_164_ += i_168_;
						i_163_ = i_254_;
						i_171_ += i_172_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_161_ == 2) {
				if (i_159_ == 1) {
					int i_262_ = i_163_;
					for (int i_263_ = -i_158_; i_263_ < 0; i_263_++) {
						int i_264_ = ((i_164_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_265_ = -i_157_; i_265_ < 0; i_265_++) {
							if ((float) i_156_ < fs[i_171_]) {
								int i_266_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_163_ >> 16)
										+ i_264_]);
								if (i_266_ != 0) {
									int i_267_ = is[i_171_];
									int i_268_ = i_266_ + i_267_;
									int i_269_ = ((i_266_ & 0xff00ff) + (i_267_ & 0xff00ff));
									i_267_ = ((i_269_ & 0x1000100) + (i_268_
											- i_269_ & 0x10000));
									is[i_171_] = i_268_ - i_267_ | i_267_
											- (i_267_ >>> 8);
									fs[i_171_] = (float) i_156_;
								}
							}
							i_163_ += i_167_;
							i_171_++;
						}
						i_164_ += i_168_;
						i_163_ = i_262_;
						i_171_ += i_172_;
					}
					return;
				}
				if (i_159_ == 0) {
					int i_270_ = i_163_;
					int i_271_ = (i_160_ & 0xff0000) >> 16;
					int i_272_ = (i_160_ & 0xff00) >> 8;
					int i_273_ = i_160_ & 0xff;
					for (int i_274_ = -i_158_; i_274_ < 0; i_274_++) {
						int i_275_ = ((i_164_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_276_ = -i_157_; i_276_ < 0; i_276_++) {
							if ((float) i_156_ < fs[i_171_]) {
								int i_277_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_163_ >> 16)
										+ i_275_]);
								if (i_277_ != 0) {
									int i_278_ = ((i_277_ & 0xff0000) * i_271_ & ~0xffffff);
									int i_279_ = ((i_277_ & 0xff00) * i_272_ & 0xff0000);
									int i_280_ = (i_277_ & 0xff) * i_273_
											& 0xff00;
									i_277_ = (i_278_ | i_279_ | i_280_) >>> 8;
									int i_281_ = is[i_171_];
									int i_282_ = i_277_ + i_281_;
									int i_283_ = ((i_277_ & 0xff00ff) + (i_281_ & 0xff00ff));
									i_281_ = ((i_283_ & 0x1000100) + (i_282_
											- i_283_ & 0x10000));
									is[i_171_] = i_282_ - i_281_ | i_281_
											- (i_281_ >>> 8);
									fs[i_171_] = (float) i_156_;
								}
							}
							i_163_ += i_167_;
							i_171_++;
						}
						i_164_ += i_168_;
						i_163_ = i_270_;
						i_171_ += i_172_;
					}
					return;
				}
				if (i_159_ == 3) {
					int i_284_ = i_163_;
					for (int i_285_ = -i_158_; i_285_ < 0; i_285_++) {
						int i_286_ = ((i_164_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_287_ = -i_157_; i_287_ < 0; i_287_++) {
							if ((float) i_156_ < fs[i_171_]) {
								int i_288_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_163_ >> 16)
										+ i_286_]);
								int i_289_ = i_288_ + i_160_;
								int i_290_ = ((i_288_ & 0xff00ff) + (i_160_ & 0xff00ff));
								int i_291_ = ((i_290_ & 0x1000100) + (i_289_
										- i_290_ & 0x10000));
								i_288_ = i_289_ - i_291_ | i_291_
										- (i_291_ >>> 8);
								i_291_ = is[i_171_];
								i_289_ = i_288_ + i_291_;
								i_290_ = (i_288_ & 0xff00ff)
										+ (i_291_ & 0xff00ff);
								i_291_ = (i_290_ & 0x1000100)
										+ (i_289_ - i_290_ & 0x10000);
								is[i_171_] = i_289_ - i_291_ | i_291_
										- (i_291_ >>> 8);
								fs[i_171_] = (float) i_156_;
							}
							i_163_ += i_167_;
							i_171_++;
						}
						i_164_ += i_168_;
						i_163_ = i_284_;
						i_171_ += i_172_;
					}
					return;
				}
				if (i_159_ == 2) {
					int i_292_ = i_160_ >>> 24;
					int i_293_ = 256 - i_292_;
					int i_294_ = (i_160_ & 0xff00ff) * i_293_ & ~0xff00ff;
					int i_295_ = (i_160_ & 0xff00) * i_293_ & 0xff0000;
					i_160_ = (i_294_ | i_295_) >>> 8;
					int i_296_ = i_163_;
					for (int i_297_ = -i_158_; i_297_ < 0; i_297_++) {
						int i_298_ = ((i_164_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_299_ = -i_157_; i_299_ < 0; i_299_++) {
							if ((float) i_156_ < fs[i_171_]) {
								int i_300_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(i_163_ >> 16)
										+ i_298_]);
								if (i_300_ != 0) {
									i_294_ = ((i_300_ & 0xff00ff) * i_292_ & ~0xff00ff);
									i_295_ = ((i_300_ & 0xff00) * i_292_ & 0xff0000);
									i_300_ = ((i_294_ | i_295_) >>> 8) + i_160_;
									int i_301_ = is[i_171_];
									int i_302_ = i_300_ + i_301_;
									int i_303_ = ((i_300_ & 0xff00ff) + (i_301_ & 0xff00ff));
									i_301_ = ((i_303_ & 0x1000100) + (i_302_
											- i_303_ & 0x10000));
									is[i_171_] = i_302_ - i_301_ | i_301_
											- (i_301_ >>> 8);
									fs[i_171_] = (float) i_156_;
								}
							}
							i_163_ += i_167_;
							i_171_++;
						}
						i_164_ += i_168_;
						i_163_ = i_296_;
						i_171_ += i_172_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}

	final void method3107(int i, int i_304_) {
		int[] is = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anIntArray5214);
		if (Class253_Sub3.anInt7676 == 0) {
			if (Class253_Sub3.anInt7675 == 0) {
				int i_305_ = Class253_Sub3.anInt7692;
				while (i_305_ < 0) {
					int i_306_ = Class253_Sub3.anInt7695;
					int i_307_ = Class253_Sub3.anInt7677;
					int i_308_ = Class253_Sub3.anInt7694;
					int i_309_ = Class253_Sub3.anInt7687;
					if (i_307_ >= 0
							&& i_308_ >= 0
							&& (i_307_
									- (((Class253_Sub3) this).anInt7679 << 12) < 0)
							&& (i_308_
									- (((Class253_Sub3) this).anInt7671 << 12) < 0)) {
						for (/**/; i_309_ < 0; i_309_++) {
							int i_310_ = (((i_308_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_307_ >> 12));
							int i_311_ = i_306_++;
							int[] is_312_ = is;
							int i_313_ = i;
							int i_314_ = i_304_;
							if (i_314_ == 0) {
								if (i_313_ == 1)
									is_312_[i_311_] = (((Class253_Sub3_Sub2) this).anIntArray8799[i_310_]);
								else if (i_313_ == 0) {
									int i_315_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_310_++]);
									int i_316_ = (((i_315_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_317_ = (((i_315_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_318_ = (((i_315_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									is_312_[i_311_] = (i_316_ | i_317_ | i_318_) >>> 8;
								} else if (i_313_ == 3) {
									int i_319_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_310_++]);
									int i_320_ = Class253_Sub3.anInt7670;
									int i_321_ = i_319_ + i_320_;
									int i_322_ = ((i_319_ & 0xff00ff) + (i_320_ & 0xff00ff));
									int i_323_ = ((i_322_ & 0x1000100) + (i_321_
											- i_322_ & 0x10000));
									is_312_[i_311_] = i_321_ - i_323_ | i_323_
											- (i_323_ >>> 8);
								} else if (i_313_ == 2) {
									int i_324_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_310_]);
									int i_325_ = (((i_324_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_326_ = (((i_324_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									is_312_[i_311_] = (((i_325_ | i_326_) >>> 8) + Class253_Sub3.anInt7683);
								} else
									throw new IllegalArgumentException();
							} else if (i_314_ == 1) {
								if (i_313_ == 1) {
									int i_327_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_310_]);
									int i_328_ = i_327_ >>> 24;
									int i_329_ = 256 - i_328_;
									int i_330_ = is_312_[i_311_];
									is_312_[i_311_] = ((((i_327_ & 0xff00ff)
											* i_328_ + (i_330_ & 0xff00ff)
											* i_329_) & ~0xff00ff) + (((i_327_ & 0xff00)
											* i_328_ + (i_330_ & 0xff00)
											* i_329_) & 0xff0000)) >> 8;
								} else if (i_313_ == 0) {
									int i_331_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_310_]);
									int i_332_ = (((i_331_ >>> 24) * Class253_Sub3.anInt7696) >> 8);
									int i_333_ = 256 - i_332_;
									if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
										int i_334_ = is_312_[i_311_];
										is_312_[i_311_] = ((((i_331_ & 0xff00ff)
												* i_332_ + ((i_334_ & 0xff00ff) * i_333_)) & ~0xff00ff) + (((i_331_ & 0xff00)
												* i_332_ + ((i_334_ & 0xff00) * i_333_)) & 0xff0000)) >> 8;
									} else if (i_332_ != 255) {
										int i_335_ = (((i_331_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_336_ = (((i_331_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_337_ = (((i_331_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										i_331_ = (i_335_ | i_336_ | i_337_) >>> 8;
										int i_338_ = is_312_[i_311_];
										is_312_[i_311_] = ((((i_331_ & 0xff00ff)
												* i_332_ + ((i_338_ & 0xff00ff) * i_333_)) & ~0xff00ff) + (((i_331_ & 0xff00)
												* i_332_ + ((i_338_ & 0xff00) * i_333_)) & 0xff0000)) >> 8;
									} else {
										int i_339_ = (((i_331_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_340_ = (((i_331_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_341_ = (((i_331_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										is_312_[i_311_] = (i_339_ | i_340_ | i_341_) >>> 8;
									}
								} else if (i_313_ == 3) {
									int i_342_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_310_]);
									int i_343_ = Class253_Sub3.anInt7670;
									int i_344_ = i_342_ + i_343_;
									int i_345_ = ((i_342_ & 0xff00ff) + (i_343_ & 0xff00ff));
									int i_346_ = ((i_345_ & 0x1000100) + (i_344_
											- i_345_ & 0x10000));
									i_346_ = i_344_ - i_346_ | i_346_
											- (i_346_ >>> 8);
									int i_347_ = (((i_342_ >>> 24) * Class253_Sub3.anInt7696) >> 8);
									int i_348_ = 256 - i_347_;
									if (i_347_ != 255) {
										i_342_ = i_346_;
										i_346_ = is_312_[i_311_];
										i_346_ = ((((i_342_ & 0xff00ff)
												* i_347_ + ((i_346_ & 0xff00ff) * i_348_)) & ~0xff00ff) + (((i_342_ & 0xff00)
												* i_347_ + ((i_346_ & 0xff00) * i_348_)) & 0xff0000)) >> 8;
									}
									is_312_[i_311_] = i_346_;
								} else if (i_313_ == 2) {
									int i_349_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_310_]);
									int i_350_ = i_349_ >>> 24;
									int i_351_ = 256 - i_350_;
									int i_352_ = (((i_349_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_353_ = (((i_349_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									i_349_ = (((i_352_ | i_353_) >>> 8) + Class253_Sub3.anInt7683);
									int i_354_ = is_312_[i_311_];
									is_312_[i_311_] = ((((i_349_ & 0xff00ff)
											* i_350_ + (i_354_ & 0xff00ff)
											* i_351_) & ~0xff00ff) + (((i_349_ & 0xff00)
											* i_350_ + (i_354_ & 0xff00)
											* i_351_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_314_ == 2) {
								if (i_313_ == 1) {
									int i_355_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_310_]);
									int i_356_ = is_312_[i_311_];
									int i_357_ = i_355_ + i_356_;
									int i_358_ = ((i_355_ & 0xff00ff) + (i_356_ & 0xff00ff));
									i_356_ = ((i_358_ & 0x1000100) + (i_357_
											- i_358_ & 0x10000));
									is_312_[i_311_] = i_357_ - i_356_ | i_356_
											- (i_356_ >>> 8);
								} else if (i_313_ == 0) {
									int i_359_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_310_]);
									int i_360_ = (((i_359_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_361_ = (((i_359_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_362_ = (((i_359_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									i_359_ = (i_360_ | i_361_ | i_362_) >>> 8;
									int i_363_ = is_312_[i_311_];
									int i_364_ = i_359_ + i_363_;
									int i_365_ = ((i_359_ & 0xff00ff) + (i_363_ & 0xff00ff));
									i_363_ = ((i_365_ & 0x1000100) + (i_364_
											- i_365_ & 0x10000));
									is_312_[i_311_] = i_364_ - i_363_ | i_363_
											- (i_363_ >>> 8);
								} else if (i_313_ == 3) {
									int i_366_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_310_]);
									int i_367_ = Class253_Sub3.anInt7670;
									int i_368_ = i_366_ + i_367_;
									int i_369_ = ((i_366_ & 0xff00ff) + (i_367_ & 0xff00ff));
									int i_370_ = ((i_369_ & 0x1000100) + (i_368_
											- i_369_ & 0x10000));
									i_366_ = i_368_ - i_370_ | i_370_
											- (i_370_ >>> 8);
									i_370_ = is_312_[i_311_];
									i_368_ = i_366_ + i_370_;
									i_369_ = (i_366_ & 0xff00ff)
											+ (i_370_ & 0xff00ff);
									i_370_ = ((i_369_ & 0x1000100) + (i_368_
											- i_369_ & 0x10000));
									is_312_[i_311_] = i_368_ - i_370_ | i_370_
											- (i_370_ >>> 8);
								} else if (i_313_ == 2) {
									int i_371_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_310_]);
									int i_372_ = (((i_371_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_373_ = (((i_371_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									i_371_ = (((i_372_ | i_373_) >>> 8) + Class253_Sub3.anInt7683);
									int i_374_ = is_312_[i_311_];
									int i_375_ = i_371_ + i_374_;
									int i_376_ = ((i_371_ & 0xff00ff) + (i_374_ & 0xff00ff));
									i_374_ = ((i_376_ & 0x1000100) + (i_375_
											- i_376_ & 0x10000));
									is_312_[i_311_] = i_375_ - i_374_ | i_374_
											- (i_374_ >>> 8);
								}
							} else
								throw new IllegalArgumentException();
						}
					}
					i_305_++;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			} else if (Class253_Sub3.anInt7675 < 0) {
				int i_377_ = Class253_Sub3.anInt7692;
				while (i_377_ < 0) {
					int i_378_ = Class253_Sub3.anInt7695;
					int i_379_ = Class253_Sub3.anInt7677;
					int i_380_ = Class253_Sub3.anInt7694
							+ Class253_Sub3.anInt7697;
					int i_381_ = Class253_Sub3.anInt7687;
					if (i_379_ >= 0
							&& (i_379_
									- (((Class253_Sub3) this).anInt7679 << 12) < 0)) {
						int i_382_;
						if ((i_382_ = i_380_
								- (((Class253_Sub3) this).anInt7671 << 12)) >= 0) {
							i_382_ = ((Class253_Sub3.anInt7675 - i_382_) / Class253_Sub3.anInt7675);
							i_381_ += i_382_;
							i_380_ += Class253_Sub3.anInt7675 * i_382_;
							i_378_ += i_382_;
						}
						if ((i_382_ = ((i_380_ - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_381_)
							i_381_ = i_382_;
						for (/**/; i_381_ < 0; i_381_++) {
							int i_383_ = (((i_380_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_379_ >> 12));
							int i_384_ = i_378_++;
							int[] is_385_ = is;
							int i_386_ = i;
							int i_387_ = i_304_;
							if (i_387_ == 0) {
								if (i_386_ == 1)
									is_385_[i_384_] = (((Class253_Sub3_Sub2) this).anIntArray8799[i_383_]);
								else if (i_386_ == 0) {
									int i_388_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_383_++]);
									int i_389_ = (((i_388_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_390_ = (((i_388_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_391_ = (((i_388_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									is_385_[i_384_] = (i_389_ | i_390_ | i_391_) >>> 8;
								} else if (i_386_ == 3) {
									int i_392_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_383_++]);
									int i_393_ = Class253_Sub3.anInt7670;
									int i_394_ = i_392_ + i_393_;
									int i_395_ = ((i_392_ & 0xff00ff) + (i_393_ & 0xff00ff));
									int i_396_ = ((i_395_ & 0x1000100) + (i_394_
											- i_395_ & 0x10000));
									is_385_[i_384_] = i_394_ - i_396_ | i_396_
											- (i_396_ >>> 8);
								} else if (i_386_ == 2) {
									int i_397_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_383_]);
									int i_398_ = (((i_397_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_399_ = (((i_397_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									is_385_[i_384_] = (((i_398_ | i_399_) >>> 8) + Class253_Sub3.anInt7683);
								} else
									throw new IllegalArgumentException();
							} else if (i_387_ == 1) {
								if (i_386_ == 1) {
									int i_400_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_383_]);
									int i_401_ = i_400_ >>> 24;
									int i_402_ = 256 - i_401_;
									int i_403_ = is_385_[i_384_];
									is_385_[i_384_] = ((((i_400_ & 0xff00ff)
											* i_401_ + (i_403_ & 0xff00ff)
											* i_402_) & ~0xff00ff) + (((i_400_ & 0xff00)
											* i_401_ + (i_403_ & 0xff00)
											* i_402_) & 0xff0000)) >> 8;
								} else if (i_386_ == 0) {
									int i_404_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_383_]);
									int i_405_ = (((i_404_ >>> 24) * Class253_Sub3.anInt7696) >> 8);
									int i_406_ = 256 - i_405_;
									if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
										int i_407_ = is_385_[i_384_];
										is_385_[i_384_] = ((((i_404_ & 0xff00ff)
												* i_405_ + ((i_407_ & 0xff00ff) * i_406_)) & ~0xff00ff) + (((i_404_ & 0xff00)
												* i_405_ + ((i_407_ & 0xff00) * i_406_)) & 0xff0000)) >> 8;
									} else if (i_405_ != 255) {
										int i_408_ = (((i_404_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_409_ = (((i_404_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_410_ = (((i_404_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										i_404_ = (i_408_ | i_409_ | i_410_) >>> 8;
										int i_411_ = is_385_[i_384_];
										is_385_[i_384_] = ((((i_404_ & 0xff00ff)
												* i_405_ + ((i_411_ & 0xff00ff) * i_406_)) & ~0xff00ff) + (((i_404_ & 0xff00)
												* i_405_ + ((i_411_ & 0xff00) * i_406_)) & 0xff0000)) >> 8;
									} else {
										int i_412_ = (((i_404_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_413_ = (((i_404_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_414_ = (((i_404_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										is_385_[i_384_] = (i_412_ | i_413_ | i_414_) >>> 8;
									}
								} else if (i_386_ == 3) {
									int i_415_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_383_]);
									int i_416_ = Class253_Sub3.anInt7670;
									int i_417_ = i_415_ + i_416_;
									int i_418_ = ((i_415_ & 0xff00ff) + (i_416_ & 0xff00ff));
									int i_419_ = ((i_418_ & 0x1000100) + (i_417_
											- i_418_ & 0x10000));
									i_419_ = i_417_ - i_419_ | i_419_
											- (i_419_ >>> 8);
									int i_420_ = (((i_415_ >>> 24) * Class253_Sub3.anInt7696) >> 8);
									int i_421_ = 256 - i_420_;
									if (i_420_ != 255) {
										i_415_ = i_419_;
										i_419_ = is_385_[i_384_];
										i_419_ = ((((i_415_ & 0xff00ff)
												* i_420_ + ((i_419_ & 0xff00ff) * i_421_)) & ~0xff00ff) + (((i_415_ & 0xff00)
												* i_420_ + ((i_419_ & 0xff00) * i_421_)) & 0xff0000)) >> 8;
									}
									is_385_[i_384_] = i_419_;
								} else if (i_386_ == 2) {
									int i_422_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_383_]);
									int i_423_ = i_422_ >>> 24;
									int i_424_ = 256 - i_423_;
									int i_425_ = (((i_422_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_426_ = (((i_422_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									i_422_ = (((i_425_ | i_426_) >>> 8) + Class253_Sub3.anInt7683);
									int i_427_ = is_385_[i_384_];
									is_385_[i_384_] = ((((i_422_ & 0xff00ff)
											* i_423_ + (i_427_ & 0xff00ff)
											* i_424_) & ~0xff00ff) + (((i_422_ & 0xff00)
											* i_423_ + (i_427_ & 0xff00)
											* i_424_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_387_ == 2) {
								if (i_386_ == 1) {
									int i_428_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_383_]);
									int i_429_ = is_385_[i_384_];
									int i_430_ = i_428_ + i_429_;
									int i_431_ = ((i_428_ & 0xff00ff) + (i_429_ & 0xff00ff));
									i_429_ = ((i_431_ & 0x1000100) + (i_430_
											- i_431_ & 0x10000));
									is_385_[i_384_] = i_430_ - i_429_ | i_429_
											- (i_429_ >>> 8);
								} else if (i_386_ == 0) {
									int i_432_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_383_]);
									int i_433_ = (((i_432_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_434_ = (((i_432_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_435_ = (((i_432_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									i_432_ = (i_433_ | i_434_ | i_435_) >>> 8;
									int i_436_ = is_385_[i_384_];
									int i_437_ = i_432_ + i_436_;
									int i_438_ = ((i_432_ & 0xff00ff) + (i_436_ & 0xff00ff));
									i_436_ = ((i_438_ & 0x1000100) + (i_437_
											- i_438_ & 0x10000));
									is_385_[i_384_] = i_437_ - i_436_ | i_436_
											- (i_436_ >>> 8);
								} else if (i_386_ == 3) {
									int i_439_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_383_]);
									int i_440_ = Class253_Sub3.anInt7670;
									int i_441_ = i_439_ + i_440_;
									int i_442_ = ((i_439_ & 0xff00ff) + (i_440_ & 0xff00ff));
									int i_443_ = ((i_442_ & 0x1000100) + (i_441_
											- i_442_ & 0x10000));
									i_439_ = i_441_ - i_443_ | i_443_
											- (i_443_ >>> 8);
									i_443_ = is_385_[i_384_];
									i_441_ = i_439_ + i_443_;
									i_442_ = (i_439_ & 0xff00ff)
											+ (i_443_ & 0xff00ff);
									i_443_ = ((i_442_ & 0x1000100) + (i_441_
											- i_442_ & 0x10000));
									is_385_[i_384_] = i_441_ - i_443_ | i_443_
											- (i_443_ >>> 8);
								} else if (i_386_ == 2) {
									int i_444_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_383_]);
									int i_445_ = (((i_444_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_446_ = (((i_444_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									i_444_ = (((i_445_ | i_446_) >>> 8) + Class253_Sub3.anInt7683);
									int i_447_ = is_385_[i_384_];
									int i_448_ = i_444_ + i_447_;
									int i_449_ = ((i_444_ & 0xff00ff) + (i_447_ & 0xff00ff));
									i_447_ = ((i_449_ & 0x1000100) + (i_448_
											- i_449_ & 0x10000));
									is_385_[i_384_] = i_448_ - i_447_ | i_447_
											- (i_447_ >>> 8);
								}
							} else
								throw new IllegalArgumentException();
							i_380_ += Class253_Sub3.anInt7675;
						}
					}
					i_377_++;
					Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			} else {
				int i_450_ = Class253_Sub3.anInt7692;
				while (i_450_ < 0) {
					int i_451_ = Class253_Sub3.anInt7695;
					int i_452_ = Class253_Sub3.anInt7677;
					int i_453_ = Class253_Sub3.anInt7694
							+ Class253_Sub3.anInt7697;
					int i_454_ = Class253_Sub3.anInt7687;
					if (i_452_ >= 0
							&& (i_452_
									- (((Class253_Sub3) this).anInt7679 << 12) < 0)) {
						if (i_453_ < 0) {
							int i_455_ = ((Class253_Sub3.anInt7675 - 1 - i_453_) / Class253_Sub3.anInt7675);
							i_454_ += i_455_;
							i_453_ += Class253_Sub3.anInt7675 * i_455_;
							i_451_ += i_455_;
						}
						int i_456_;
						if ((i_456_ = ((1 + i_453_
								- (((Class253_Sub3) this).anInt7671 << 12) - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_454_)
							i_454_ = i_456_;
						for (/**/; i_454_ < 0; i_454_++) {
							int i_457_ = (((i_453_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_452_ >> 12));
							int i_458_ = i_451_++;
							int[] is_459_ = is;
							int i_460_ = i;
							int i_461_ = i_304_;
							if (i_461_ == 0) {
								if (i_460_ == 1)
									is_459_[i_458_] = (((Class253_Sub3_Sub2) this).anIntArray8799[i_457_]);
								else if (i_460_ == 0) {
									int i_462_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_457_++]);
									int i_463_ = (((i_462_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_464_ = (((i_462_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_465_ = (((i_462_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									is_459_[i_458_] = (i_463_ | i_464_ | i_465_) >>> 8;
								} else if (i_460_ == 3) {
									int i_466_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_457_++]);
									int i_467_ = Class253_Sub3.anInt7670;
									int i_468_ = i_466_ + i_467_;
									int i_469_ = ((i_466_ & 0xff00ff) + (i_467_ & 0xff00ff));
									int i_470_ = ((i_469_ & 0x1000100) + (i_468_
											- i_469_ & 0x10000));
									is_459_[i_458_] = i_468_ - i_470_ | i_470_
											- (i_470_ >>> 8);
								} else if (i_460_ == 2) {
									int i_471_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_457_]);
									int i_472_ = (((i_471_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_473_ = (((i_471_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									is_459_[i_458_] = (((i_472_ | i_473_) >>> 8) + Class253_Sub3.anInt7683);
								} else
									throw new IllegalArgumentException();
							} else if (i_461_ == 1) {
								if (i_460_ == 1) {
									int i_474_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_457_]);
									int i_475_ = i_474_ >>> 24;
									int i_476_ = 256 - i_475_;
									int i_477_ = is_459_[i_458_];
									is_459_[i_458_] = ((((i_474_ & 0xff00ff)
											* i_475_ + (i_477_ & 0xff00ff)
											* i_476_) & ~0xff00ff) + (((i_474_ & 0xff00)
											* i_475_ + (i_477_ & 0xff00)
											* i_476_) & 0xff0000)) >> 8;
								} else if (i_460_ == 0) {
									int i_478_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_457_]);
									int i_479_ = (((i_478_ >>> 24) * Class253_Sub3.anInt7696) >> 8);
									int i_480_ = 256 - i_479_;
									if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
										int i_481_ = is_459_[i_458_];
										is_459_[i_458_] = ((((i_478_ & 0xff00ff)
												* i_479_ + ((i_481_ & 0xff00ff) * i_480_)) & ~0xff00ff) + (((i_478_ & 0xff00)
												* i_479_ + ((i_481_ & 0xff00) * i_480_)) & 0xff0000)) >> 8;
									} else if (i_479_ != 255) {
										int i_482_ = (((i_478_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_483_ = (((i_478_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_484_ = (((i_478_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										i_478_ = (i_482_ | i_483_ | i_484_) >>> 8;
										int i_485_ = is_459_[i_458_];
										is_459_[i_458_] = ((((i_478_ & 0xff00ff)
												* i_479_ + ((i_485_ & 0xff00ff) * i_480_)) & ~0xff00ff) + (((i_478_ & 0xff00)
												* i_479_ + ((i_485_ & 0xff00) * i_480_)) & 0xff0000)) >> 8;
									} else {
										int i_486_ = (((i_478_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_487_ = (((i_478_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_488_ = (((i_478_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										is_459_[i_458_] = (i_486_ | i_487_ | i_488_) >>> 8;
									}
								} else if (i_460_ == 3) {
									int i_489_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_457_]);
									int i_490_ = Class253_Sub3.anInt7670;
									int i_491_ = i_489_ + i_490_;
									int i_492_ = ((i_489_ & 0xff00ff) + (i_490_ & 0xff00ff));
									int i_493_ = ((i_492_ & 0x1000100) + (i_491_
											- i_492_ & 0x10000));
									i_493_ = i_491_ - i_493_ | i_493_
											- (i_493_ >>> 8);
									int i_494_ = (((i_489_ >>> 24) * Class253_Sub3.anInt7696) >> 8);
									int i_495_ = 256 - i_494_;
									if (i_494_ != 255) {
										i_489_ = i_493_;
										i_493_ = is_459_[i_458_];
										i_493_ = ((((i_489_ & 0xff00ff)
												* i_494_ + ((i_493_ & 0xff00ff) * i_495_)) & ~0xff00ff) + (((i_489_ & 0xff00)
												* i_494_ + ((i_493_ & 0xff00) * i_495_)) & 0xff0000)) >> 8;
									}
									is_459_[i_458_] = i_493_;
								} else if (i_460_ == 2) {
									int i_496_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_457_]);
									int i_497_ = i_496_ >>> 24;
									int i_498_ = 256 - i_497_;
									int i_499_ = (((i_496_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_500_ = (((i_496_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									i_496_ = (((i_499_ | i_500_) >>> 8) + Class253_Sub3.anInt7683);
									int i_501_ = is_459_[i_458_];
									is_459_[i_458_] = ((((i_496_ & 0xff00ff)
											* i_497_ + (i_501_ & 0xff00ff)
											* i_498_) & ~0xff00ff) + (((i_496_ & 0xff00)
											* i_497_ + (i_501_ & 0xff00)
											* i_498_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_461_ == 2) {
								if (i_460_ == 1) {
									int i_502_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_457_]);
									int i_503_ = is_459_[i_458_];
									int i_504_ = i_502_ + i_503_;
									int i_505_ = ((i_502_ & 0xff00ff) + (i_503_ & 0xff00ff));
									i_503_ = ((i_505_ & 0x1000100) + (i_504_
											- i_505_ & 0x10000));
									is_459_[i_458_] = i_504_ - i_503_ | i_503_
											- (i_503_ >>> 8);
								} else if (i_460_ == 0) {
									int i_506_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_457_]);
									int i_507_ = (((i_506_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_508_ = (((i_506_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_509_ = (((i_506_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									i_506_ = (i_507_ | i_508_ | i_509_) >>> 8;
									int i_510_ = is_459_[i_458_];
									int i_511_ = i_506_ + i_510_;
									int i_512_ = ((i_506_ & 0xff00ff) + (i_510_ & 0xff00ff));
									i_510_ = ((i_512_ & 0x1000100) + (i_511_
											- i_512_ & 0x10000));
									is_459_[i_458_] = i_511_ - i_510_ | i_510_
											- (i_510_ >>> 8);
								} else if (i_460_ == 3) {
									int i_513_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_457_]);
									int i_514_ = Class253_Sub3.anInt7670;
									int i_515_ = i_513_ + i_514_;
									int i_516_ = ((i_513_ & 0xff00ff) + (i_514_ & 0xff00ff));
									int i_517_ = ((i_516_ & 0x1000100) + (i_515_
											- i_516_ & 0x10000));
									i_513_ = i_515_ - i_517_ | i_517_
											- (i_517_ >>> 8);
									i_517_ = is_459_[i_458_];
									i_515_ = i_513_ + i_517_;
									i_516_ = (i_513_ & 0xff00ff)
											+ (i_517_ & 0xff00ff);
									i_517_ = ((i_516_ & 0x1000100) + (i_515_
											- i_516_ & 0x10000));
									is_459_[i_458_] = i_515_ - i_517_ | i_517_
											- (i_517_ >>> 8);
								} else if (i_460_ == 2) {
									int i_518_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_457_]);
									int i_519_ = (((i_518_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_520_ = (((i_518_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									i_518_ = (((i_519_ | i_520_) >>> 8) + Class253_Sub3.anInt7683);
									int i_521_ = is_459_[i_458_];
									int i_522_ = i_518_ + i_521_;
									int i_523_ = ((i_518_ & 0xff00ff) + (i_521_ & 0xff00ff));
									i_521_ = ((i_523_ & 0x1000100) + (i_522_
											- i_523_ & 0x10000));
									is_459_[i_458_] = i_522_ - i_521_ | i_521_
											- (i_521_ >>> 8);
								}
							} else
								throw new IllegalArgumentException();
							i_453_ += Class253_Sub3.anInt7675;
						}
					}
					i_450_++;
					Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			}
		} else if (Class253_Sub3.anInt7676 < 0) {
			if (Class253_Sub3.anInt7675 == 0) {
				int i_524_ = Class253_Sub3.anInt7692;
				while (i_524_ < 0) {
					int i_525_ = Class253_Sub3.anInt7695;
					int i_526_ = Class253_Sub3.anInt7677
							+ Class253_Sub3.anInt7686;
					int i_527_ = Class253_Sub3.anInt7694;
					int i_528_ = Class253_Sub3.anInt7687;
					if (i_527_ >= 0
							&& (i_527_
									- (((Class253_Sub3) this).anInt7671 << 12) < 0)) {
						int i_529_;
						if ((i_529_ = i_526_
								- (((Class253_Sub3) this).anInt7679 << 12)) >= 0) {
							i_529_ = ((Class253_Sub3.anInt7676 - i_529_) / Class253_Sub3.anInt7676);
							i_528_ += i_529_;
							i_526_ += Class253_Sub3.anInt7676 * i_529_;
							i_525_ += i_529_;
						}
						if ((i_529_ = ((i_526_ - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_528_)
							i_528_ = i_529_;
						for (/**/; i_528_ < 0; i_528_++) {
							int i_530_ = (((i_527_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_526_ >> 12));
							int i_531_ = i_525_++;
							int[] is_532_ = is;
							int i_533_ = i;
							int i_534_ = i_304_;
							if (i_534_ == 0) {
								if (i_533_ == 1)
									is_532_[i_531_] = (((Class253_Sub3_Sub2) this).anIntArray8799[i_530_]);
								else if (i_533_ == 0) {
									int i_535_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_530_++]);
									int i_536_ = (((i_535_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_537_ = (((i_535_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_538_ = (((i_535_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									is_532_[i_531_] = (i_536_ | i_537_ | i_538_) >>> 8;
								} else if (i_533_ == 3) {
									int i_539_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_530_++]);
									int i_540_ = Class253_Sub3.anInt7670;
									int i_541_ = i_539_ + i_540_;
									int i_542_ = ((i_539_ & 0xff00ff) + (i_540_ & 0xff00ff));
									int i_543_ = ((i_542_ & 0x1000100) + (i_541_
											- i_542_ & 0x10000));
									is_532_[i_531_] = i_541_ - i_543_ | i_543_
											- (i_543_ >>> 8);
								} else if (i_533_ == 2) {
									int i_544_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_530_]);
									int i_545_ = (((i_544_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_546_ = (((i_544_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									is_532_[i_531_] = (((i_545_ | i_546_) >>> 8) + Class253_Sub3.anInt7683);
								} else
									throw new IllegalArgumentException();
							} else if (i_534_ == 1) {
								if (i_533_ == 1) {
									int i_547_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_530_]);
									int i_548_ = i_547_ >>> 24;
									int i_549_ = 256 - i_548_;
									int i_550_ = is_532_[i_531_];
									is_532_[i_531_] = ((((i_547_ & 0xff00ff)
											* i_548_ + (i_550_ & 0xff00ff)
											* i_549_) & ~0xff00ff) + (((i_547_ & 0xff00)
											* i_548_ + (i_550_ & 0xff00)
											* i_549_) & 0xff0000)) >> 8;
								} else if (i_533_ == 0) {
									int i_551_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_530_]);
									int i_552_ = (((i_551_ >>> 24) * Class253_Sub3.anInt7696) >> 8);
									int i_553_ = 256 - i_552_;
									if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
										int i_554_ = is_532_[i_531_];
										is_532_[i_531_] = ((((i_551_ & 0xff00ff)
												* i_552_ + ((i_554_ & 0xff00ff) * i_553_)) & ~0xff00ff) + (((i_551_ & 0xff00)
												* i_552_ + ((i_554_ & 0xff00) * i_553_)) & 0xff0000)) >> 8;
									} else if (i_552_ != 255) {
										int i_555_ = (((i_551_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_556_ = (((i_551_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_557_ = (((i_551_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										i_551_ = (i_555_ | i_556_ | i_557_) >>> 8;
										int i_558_ = is_532_[i_531_];
										is_532_[i_531_] = ((((i_551_ & 0xff00ff)
												* i_552_ + ((i_558_ & 0xff00ff) * i_553_)) & ~0xff00ff) + (((i_551_ & 0xff00)
												* i_552_ + ((i_558_ & 0xff00) * i_553_)) & 0xff0000)) >> 8;
									} else {
										int i_559_ = (((i_551_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_560_ = (((i_551_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_561_ = (((i_551_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										is_532_[i_531_] = (i_559_ | i_560_ | i_561_) >>> 8;
									}
								} else if (i_533_ == 3) {
									int i_562_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_530_]);
									int i_563_ = Class253_Sub3.anInt7670;
									int i_564_ = i_562_ + i_563_;
									int i_565_ = ((i_562_ & 0xff00ff) + (i_563_ & 0xff00ff));
									int i_566_ = ((i_565_ & 0x1000100) + (i_564_
											- i_565_ & 0x10000));
									i_566_ = i_564_ - i_566_ | i_566_
											- (i_566_ >>> 8);
									int i_567_ = (((i_562_ >>> 24) * Class253_Sub3.anInt7696) >> 8);
									int i_568_ = 256 - i_567_;
									if (i_567_ != 255) {
										i_562_ = i_566_;
										i_566_ = is_532_[i_531_];
										i_566_ = ((((i_562_ & 0xff00ff)
												* i_567_ + ((i_566_ & 0xff00ff) * i_568_)) & ~0xff00ff) + (((i_562_ & 0xff00)
												* i_567_ + ((i_566_ & 0xff00) * i_568_)) & 0xff0000)) >> 8;
									}
									is_532_[i_531_] = i_566_;
								} else if (i_533_ == 2) {
									int i_569_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_530_]);
									int i_570_ = i_569_ >>> 24;
									int i_571_ = 256 - i_570_;
									int i_572_ = (((i_569_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_573_ = (((i_569_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									i_569_ = (((i_572_ | i_573_) >>> 8) + Class253_Sub3.anInt7683);
									int i_574_ = is_532_[i_531_];
									is_532_[i_531_] = ((((i_569_ & 0xff00ff)
											* i_570_ + (i_574_ & 0xff00ff)
											* i_571_) & ~0xff00ff) + (((i_569_ & 0xff00)
											* i_570_ + (i_574_ & 0xff00)
											* i_571_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_534_ == 2) {
								if (i_533_ == 1) {
									int i_575_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_530_]);
									int i_576_ = is_532_[i_531_];
									int i_577_ = i_575_ + i_576_;
									int i_578_ = ((i_575_ & 0xff00ff) + (i_576_ & 0xff00ff));
									i_576_ = ((i_578_ & 0x1000100) + (i_577_
											- i_578_ & 0x10000));
									is_532_[i_531_] = i_577_ - i_576_ | i_576_
											- (i_576_ >>> 8);
								} else if (i_533_ == 0) {
									int i_579_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_530_]);
									int i_580_ = (((i_579_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_581_ = (((i_579_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_582_ = (((i_579_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									i_579_ = (i_580_ | i_581_ | i_582_) >>> 8;
									int i_583_ = is_532_[i_531_];
									int i_584_ = i_579_ + i_583_;
									int i_585_ = ((i_579_ & 0xff00ff) + (i_583_ & 0xff00ff));
									i_583_ = ((i_585_ & 0x1000100) + (i_584_
											- i_585_ & 0x10000));
									is_532_[i_531_] = i_584_ - i_583_ | i_583_
											- (i_583_ >>> 8);
								} else if (i_533_ == 3) {
									int i_586_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_530_]);
									int i_587_ = Class253_Sub3.anInt7670;
									int i_588_ = i_586_ + i_587_;
									int i_589_ = ((i_586_ & 0xff00ff) + (i_587_ & 0xff00ff));
									int i_590_ = ((i_589_ & 0x1000100) + (i_588_
											- i_589_ & 0x10000));
									i_586_ = i_588_ - i_590_ | i_590_
											- (i_590_ >>> 8);
									i_590_ = is_532_[i_531_];
									i_588_ = i_586_ + i_590_;
									i_589_ = (i_586_ & 0xff00ff)
											+ (i_590_ & 0xff00ff);
									i_590_ = ((i_589_ & 0x1000100) + (i_588_
											- i_589_ & 0x10000));
									is_532_[i_531_] = i_588_ - i_590_ | i_590_
											- (i_590_ >>> 8);
								} else if (i_533_ == 2) {
									int i_591_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_530_]);
									int i_592_ = (((i_591_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_593_ = (((i_591_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									i_591_ = (((i_592_ | i_593_) >>> 8) + Class253_Sub3.anInt7683);
									int i_594_ = is_532_[i_531_];
									int i_595_ = i_591_ + i_594_;
									int i_596_ = ((i_591_ & 0xff00ff) + (i_594_ & 0xff00ff));
									i_594_ = ((i_596_ & 0x1000100) + (i_595_
											- i_596_ & 0x10000));
									is_532_[i_531_] = i_595_ - i_594_ | i_594_
											- (i_594_ >>> 8);
								}
							} else
								throw new IllegalArgumentException();
							i_526_ += Class253_Sub3.anInt7676;
						}
					}
					i_524_++;
					Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			} else if (Class253_Sub3.anInt7675 < 0) {
				int i_597_ = Class253_Sub3.anInt7692;
				while (i_597_ < 0) {
					int i_598_ = Class253_Sub3.anInt7695;
					int i_599_ = Class253_Sub3.anInt7677
							+ Class253_Sub3.anInt7686;
					int i_600_ = Class253_Sub3.anInt7694
							+ Class253_Sub3.anInt7697;
					int i_601_ = Class253_Sub3.anInt7687;
					int i_602_;
					if ((i_602_ = i_599_
							- (((Class253_Sub3) this).anInt7679 << 12)) >= 0) {
						i_602_ = ((Class253_Sub3.anInt7676 - i_602_) / Class253_Sub3.anInt7676);
						i_601_ += i_602_;
						i_599_ += Class253_Sub3.anInt7676 * i_602_;
						i_600_ += Class253_Sub3.anInt7675 * i_602_;
						i_598_ += i_602_;
					}
					if ((i_602_ = ((i_599_ - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_601_)
						i_601_ = i_602_;
					if ((i_602_ = i_600_
							- (((Class253_Sub3) this).anInt7671 << 12)) >= 0) {
						i_602_ = ((Class253_Sub3.anInt7675 - i_602_) / Class253_Sub3.anInt7675);
						i_601_ += i_602_;
						i_599_ += Class253_Sub3.anInt7676 * i_602_;
						i_600_ += Class253_Sub3.anInt7675 * i_602_;
						i_598_ += i_602_;
					}
					if ((i_602_ = ((i_600_ - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_601_)
						i_601_ = i_602_;
					for (/**/; i_601_ < 0; i_601_++) {
						int i_603_ = (((i_600_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_599_ >> 12));
						int i_604_ = i_598_++;
						int[] is_605_ = is;
						int i_606_ = i;
						int i_607_ = i_304_;
						if (i_607_ == 0) {
							if (i_606_ == 1)
								is_605_[i_604_] = (((Class253_Sub3_Sub2) this).anIntArray8799[i_603_]);
							else if (i_606_ == 0) {
								int i_608_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_603_++]);
								int i_609_ = (((i_608_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
								int i_610_ = (((i_608_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
								int i_611_ = (((i_608_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
								is_605_[i_604_] = (i_609_ | i_610_ | i_611_) >>> 8;
							} else if (i_606_ == 3) {
								int i_612_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_603_++]);
								int i_613_ = Class253_Sub3.anInt7670;
								int i_614_ = i_612_ + i_613_;
								int i_615_ = ((i_612_ & 0xff00ff) + (i_613_ & 0xff00ff));
								int i_616_ = ((i_615_ & 0x1000100) + (i_614_
										- i_615_ & 0x10000));
								is_605_[i_604_] = i_614_ - i_616_ | i_616_
										- (i_616_ >>> 8);
							} else if (i_606_ == 2) {
								int i_617_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_603_]);
								int i_618_ = (((i_617_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
								int i_619_ = (((i_617_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
								is_605_[i_604_] = (((i_618_ | i_619_) >>> 8) + Class253_Sub3.anInt7683);
							} else
								throw new IllegalArgumentException();
						} else if (i_607_ == 1) {
							if (i_606_ == 1) {
								int i_620_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_603_]);
								int i_621_ = i_620_ >>> 24;
								int i_622_ = 256 - i_621_;
								int i_623_ = is_605_[i_604_];
								is_605_[i_604_] = ((((i_620_ & 0xff00ff)
										* i_621_ + (i_623_ & 0xff00ff) * i_622_) & ~0xff00ff) + (((i_620_ & 0xff00)
										* i_621_ + (i_623_ & 0xff00) * i_622_) & 0xff0000)) >> 8;
							} else if (i_606_ == 0) {
								int i_624_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_603_]);
								int i_625_ = (((i_624_ >>> 24) * Class253_Sub3.anInt7696) >> 8);
								int i_626_ = 256 - i_625_;
								if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
									int i_627_ = is_605_[i_604_];
									is_605_[i_604_] = ((((i_624_ & 0xff00ff)
											* i_625_ + (i_627_ & 0xff00ff)
											* i_626_) & ~0xff00ff) + (((i_624_ & 0xff00)
											* i_625_ + (i_627_ & 0xff00)
											* i_626_) & 0xff0000)) >> 8;
								} else if (i_625_ != 255) {
									int i_628_ = (((i_624_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_629_ = (((i_624_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_630_ = (((i_624_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									i_624_ = (i_628_ | i_629_ | i_630_) >>> 8;
									int i_631_ = is_605_[i_604_];
									is_605_[i_604_] = ((((i_624_ & 0xff00ff)
											* i_625_ + (i_631_ & 0xff00ff)
											* i_626_) & ~0xff00ff) + (((i_624_ & 0xff00)
											* i_625_ + (i_631_ & 0xff00)
											* i_626_) & 0xff0000)) >> 8;
								} else {
									int i_632_ = (((i_624_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_633_ = (((i_624_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_634_ = (((i_624_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									is_605_[i_604_] = (i_632_ | i_633_ | i_634_) >>> 8;
								}
							} else if (i_606_ == 3) {
								int i_635_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_603_]);
								int i_636_ = Class253_Sub3.anInt7670;
								int i_637_ = i_635_ + i_636_;
								int i_638_ = ((i_635_ & 0xff00ff) + (i_636_ & 0xff00ff));
								int i_639_ = ((i_638_ & 0x1000100) + (i_637_
										- i_638_ & 0x10000));
								i_639_ = i_637_ - i_639_ | i_639_
										- (i_639_ >>> 8);
								int i_640_ = (((i_635_ >>> 24) * Class253_Sub3.anInt7696) >> 8);
								int i_641_ = 256 - i_640_;
								if (i_640_ != 255) {
									i_635_ = i_639_;
									i_639_ = is_605_[i_604_];
									i_639_ = ((((i_635_ & 0xff00ff) * i_640_ + (i_639_ & 0xff00ff)
											* i_641_) & ~0xff00ff) + (((i_635_ & 0xff00)
											* i_640_ + (i_639_ & 0xff00)
											* i_641_) & 0xff0000)) >> 8;
								}
								is_605_[i_604_] = i_639_;
							} else if (i_606_ == 2) {
								int i_642_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_603_]);
								int i_643_ = i_642_ >>> 24;
								int i_644_ = 256 - i_643_;
								int i_645_ = (((i_642_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
								int i_646_ = (((i_642_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
								i_642_ = (((i_645_ | i_646_) >>> 8) + Class253_Sub3.anInt7683);
								int i_647_ = is_605_[i_604_];
								is_605_[i_604_] = ((((i_642_ & 0xff00ff)
										* i_643_ + (i_647_ & 0xff00ff) * i_644_) & ~0xff00ff) + (((i_642_ & 0xff00)
										* i_643_ + (i_647_ & 0xff00) * i_644_) & 0xff0000)) >> 8;
							} else
								throw new IllegalArgumentException();
						} else if (i_607_ == 2) {
							if (i_606_ == 1) {
								int i_648_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_603_]);
								int i_649_ = is_605_[i_604_];
								int i_650_ = i_648_ + i_649_;
								int i_651_ = ((i_648_ & 0xff00ff) + (i_649_ & 0xff00ff));
								i_649_ = (i_651_ & 0x1000100)
										+ (i_650_ - i_651_ & 0x10000);
								is_605_[i_604_] = i_650_ - i_649_ | i_649_
										- (i_649_ >>> 8);
							} else if (i_606_ == 0) {
								int i_652_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_603_]);
								int i_653_ = (((i_652_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
								int i_654_ = (((i_652_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
								int i_655_ = (((i_652_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
								i_652_ = (i_653_ | i_654_ | i_655_) >>> 8;
								int i_656_ = is_605_[i_604_];
								int i_657_ = i_652_ + i_656_;
								int i_658_ = ((i_652_ & 0xff00ff) + (i_656_ & 0xff00ff));
								i_656_ = (i_658_ & 0x1000100)
										+ (i_657_ - i_658_ & 0x10000);
								is_605_[i_604_] = i_657_ - i_656_ | i_656_
										- (i_656_ >>> 8);
							} else if (i_606_ == 3) {
								int i_659_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_603_]);
								int i_660_ = Class253_Sub3.anInt7670;
								int i_661_ = i_659_ + i_660_;
								int i_662_ = ((i_659_ & 0xff00ff) + (i_660_ & 0xff00ff));
								int i_663_ = ((i_662_ & 0x1000100) + (i_661_
										- i_662_ & 0x10000));
								i_659_ = i_661_ - i_663_ | i_663_
										- (i_663_ >>> 8);
								i_663_ = is_605_[i_604_];
								i_661_ = i_659_ + i_663_;
								i_662_ = (i_659_ & 0xff00ff)
										+ (i_663_ & 0xff00ff);
								i_663_ = (i_662_ & 0x1000100)
										+ (i_661_ - i_662_ & 0x10000);
								is_605_[i_604_] = i_661_ - i_663_ | i_663_
										- (i_663_ >>> 8);
							} else if (i_606_ == 2) {
								int i_664_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_603_]);
								int i_665_ = (((i_664_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
								int i_666_ = (((i_664_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
								i_664_ = (((i_665_ | i_666_) >>> 8) + Class253_Sub3.anInt7683);
								int i_667_ = is_605_[i_604_];
								int i_668_ = i_664_ + i_667_;
								int i_669_ = ((i_664_ & 0xff00ff) + (i_667_ & 0xff00ff));
								i_667_ = (i_669_ & 0x1000100)
										+ (i_668_ - i_669_ & 0x10000);
								is_605_[i_604_] = i_668_ - i_667_ | i_667_
										- (i_667_ >>> 8);
							}
						} else
							throw new IllegalArgumentException();
						i_599_ += Class253_Sub3.anInt7676;
						i_600_ += Class253_Sub3.anInt7675;
					}
					i_597_++;
					Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
					Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			} else {
				int i_670_ = Class253_Sub3.anInt7692;
				while (i_670_ < 0) {
					int i_671_ = Class253_Sub3.anInt7695;
					int i_672_ = Class253_Sub3.anInt7677
							+ Class253_Sub3.anInt7686;
					int i_673_ = Class253_Sub3.anInt7694
							+ Class253_Sub3.anInt7697;
					int i_674_ = Class253_Sub3.anInt7687;
					int i_675_;
					if ((i_675_ = i_672_
							- (((Class253_Sub3) this).anInt7679 << 12)) >= 0) {
						i_675_ = ((Class253_Sub3.anInt7676 - i_675_) / Class253_Sub3.anInt7676);
						i_674_ += i_675_;
						i_672_ += Class253_Sub3.anInt7676 * i_675_;
						i_673_ += Class253_Sub3.anInt7675 * i_675_;
						i_671_ += i_675_;
					}
					if ((i_675_ = ((i_672_ - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_674_)
						i_674_ = i_675_;
					if (i_673_ < 0) {
						i_675_ = ((Class253_Sub3.anInt7675 - 1 - i_673_) / Class253_Sub3.anInt7675);
						i_674_ += i_675_;
						i_672_ += Class253_Sub3.anInt7676 * i_675_;
						i_673_ += Class253_Sub3.anInt7675 * i_675_;
						i_671_ += i_675_;
					}
					if ((i_675_ = ((1 + i_673_
							- (((Class253_Sub3) this).anInt7671 << 12) - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_674_)
						i_674_ = i_675_;
					for (/**/; i_674_ < 0; i_674_++) {
						int i_676_ = (((i_673_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_672_ >> 12));
						int i_677_ = i_671_++;
						int[] is_678_ = is;
						int i_679_ = i;
						int i_680_ = i_304_;
						if (i_680_ == 0) {
							if (i_679_ == 1)
								is_678_[i_677_] = (((Class253_Sub3_Sub2) this).anIntArray8799[i_676_]);
							else if (i_679_ == 0) {
								int i_681_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_676_++]);
								int i_682_ = (((i_681_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
								int i_683_ = (((i_681_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
								int i_684_ = (((i_681_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
								is_678_[i_677_] = (i_682_ | i_683_ | i_684_) >>> 8;
							} else if (i_679_ == 3) {
								int i_685_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_676_++]);
								int i_686_ = Class253_Sub3.anInt7670;
								int i_687_ = i_685_ + i_686_;
								int i_688_ = ((i_685_ & 0xff00ff) + (i_686_ & 0xff00ff));
								int i_689_ = ((i_688_ & 0x1000100) + (i_687_
										- i_688_ & 0x10000));
								is_678_[i_677_] = i_687_ - i_689_ | i_689_
										- (i_689_ >>> 8);
							} else if (i_679_ == 2) {
								int i_690_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_676_]);
								int i_691_ = (((i_690_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
								int i_692_ = (((i_690_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
								is_678_[i_677_] = (((i_691_ | i_692_) >>> 8) + Class253_Sub3.anInt7683);
							} else
								throw new IllegalArgumentException();
						} else if (i_680_ == 1) {
							if (i_679_ == 1) {
								int i_693_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_676_]);
								int i_694_ = i_693_ >>> 24;
								int i_695_ = 256 - i_694_;
								int i_696_ = is_678_[i_677_];
								is_678_[i_677_] = ((((i_693_ & 0xff00ff)
										* i_694_ + (i_696_ & 0xff00ff) * i_695_) & ~0xff00ff) + (((i_693_ & 0xff00)
										* i_694_ + (i_696_ & 0xff00) * i_695_) & 0xff0000)) >> 8;
							} else if (i_679_ == 0) {
								int i_697_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_676_]);
								int i_698_ = (((i_697_ >>> 24) * Class253_Sub3.anInt7696) >> 8);
								int i_699_ = 256 - i_698_;
								if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
									int i_700_ = is_678_[i_677_];
									is_678_[i_677_] = ((((i_697_ & 0xff00ff)
											* i_698_ + (i_700_ & 0xff00ff)
											* i_699_) & ~0xff00ff) + (((i_697_ & 0xff00)
											* i_698_ + (i_700_ & 0xff00)
											* i_699_) & 0xff0000)) >> 8;
								} else if (i_698_ != 255) {
									int i_701_ = (((i_697_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_702_ = (((i_697_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_703_ = (((i_697_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									i_697_ = (i_701_ | i_702_ | i_703_) >>> 8;
									int i_704_ = is_678_[i_677_];
									is_678_[i_677_] = ((((i_697_ & 0xff00ff)
											* i_698_ + (i_704_ & 0xff00ff)
											* i_699_) & ~0xff00ff) + (((i_697_ & 0xff00)
											* i_698_ + (i_704_ & 0xff00)
											* i_699_) & 0xff0000)) >> 8;
								} else {
									int i_705_ = (((i_697_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_706_ = (((i_697_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_707_ = (((i_697_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									is_678_[i_677_] = (i_705_ | i_706_ | i_707_) >>> 8;
								}
							} else if (i_679_ == 3) {
								int i_708_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_676_]);
								int i_709_ = Class253_Sub3.anInt7670;
								int i_710_ = i_708_ + i_709_;
								int i_711_ = ((i_708_ & 0xff00ff) + (i_709_ & 0xff00ff));
								int i_712_ = ((i_711_ & 0x1000100) + (i_710_
										- i_711_ & 0x10000));
								i_712_ = i_710_ - i_712_ | i_712_
										- (i_712_ >>> 8);
								int i_713_ = (((i_708_ >>> 24) * Class253_Sub3.anInt7696) >> 8);
								int i_714_ = 256 - i_713_;
								if (i_713_ != 255) {
									i_708_ = i_712_;
									i_712_ = is_678_[i_677_];
									i_712_ = ((((i_708_ & 0xff00ff) * i_713_ + (i_712_ & 0xff00ff)
											* i_714_) & ~0xff00ff) + (((i_708_ & 0xff00)
											* i_713_ + (i_712_ & 0xff00)
											* i_714_) & 0xff0000)) >> 8;
								}
								is_678_[i_677_] = i_712_;
							} else if (i_679_ == 2) {
								int i_715_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_676_]);
								int i_716_ = i_715_ >>> 24;
								int i_717_ = 256 - i_716_;
								int i_718_ = (((i_715_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
								int i_719_ = (((i_715_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
								i_715_ = (((i_718_ | i_719_) >>> 8) + Class253_Sub3.anInt7683);
								int i_720_ = is_678_[i_677_];
								is_678_[i_677_] = ((((i_715_ & 0xff00ff)
										* i_716_ + (i_720_ & 0xff00ff) * i_717_) & ~0xff00ff) + (((i_715_ & 0xff00)
										* i_716_ + (i_720_ & 0xff00) * i_717_) & 0xff0000)) >> 8;
							} else
								throw new IllegalArgumentException();
						} else if (i_680_ == 2) {
							if (i_679_ == 1) {
								int i_721_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_676_]);
								int i_722_ = is_678_[i_677_];
								int i_723_ = i_721_ + i_722_;
								int i_724_ = ((i_721_ & 0xff00ff) + (i_722_ & 0xff00ff));
								i_722_ = (i_724_ & 0x1000100)
										+ (i_723_ - i_724_ & 0x10000);
								is_678_[i_677_] = i_723_ - i_722_ | i_722_
										- (i_722_ >>> 8);
							} else if (i_679_ == 0) {
								int i_725_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_676_]);
								int i_726_ = (((i_725_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
								int i_727_ = (((i_725_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
								int i_728_ = (((i_725_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
								i_725_ = (i_726_ | i_727_ | i_728_) >>> 8;
								int i_729_ = is_678_[i_677_];
								int i_730_ = i_725_ + i_729_;
								int i_731_ = ((i_725_ & 0xff00ff) + (i_729_ & 0xff00ff));
								i_729_ = (i_731_ & 0x1000100)
										+ (i_730_ - i_731_ & 0x10000);
								is_678_[i_677_] = i_730_ - i_729_ | i_729_
										- (i_729_ >>> 8);
							} else if (i_679_ == 3) {
								int i_732_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_676_]);
								int i_733_ = Class253_Sub3.anInt7670;
								int i_734_ = i_732_ + i_733_;
								int i_735_ = ((i_732_ & 0xff00ff) + (i_733_ & 0xff00ff));
								int i_736_ = ((i_735_ & 0x1000100) + (i_734_
										- i_735_ & 0x10000));
								i_732_ = i_734_ - i_736_ | i_736_
										- (i_736_ >>> 8);
								i_736_ = is_678_[i_677_];
								i_734_ = i_732_ + i_736_;
								i_735_ = (i_732_ & 0xff00ff)
										+ (i_736_ & 0xff00ff);
								i_736_ = (i_735_ & 0x1000100)
										+ (i_734_ - i_735_ & 0x10000);
								is_678_[i_677_] = i_734_ - i_736_ | i_736_
										- (i_736_ >>> 8);
							} else if (i_679_ == 2) {
								int i_737_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_676_]);
								int i_738_ = (((i_737_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
								int i_739_ = (((i_737_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
								i_737_ = (((i_738_ | i_739_) >>> 8) + Class253_Sub3.anInt7683);
								int i_740_ = is_678_[i_677_];
								int i_741_ = i_737_ + i_740_;
								int i_742_ = ((i_737_ & 0xff00ff) + (i_740_ & 0xff00ff));
								i_740_ = (i_742_ & 0x1000100)
										+ (i_741_ - i_742_ & 0x10000);
								is_678_[i_677_] = i_741_ - i_740_ | i_740_
										- (i_740_ >>> 8);
							}
						} else
							throw new IllegalArgumentException();
						i_672_ += Class253_Sub3.anInt7676;
						i_673_ += Class253_Sub3.anInt7675;
					}
					i_670_++;
					Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
					Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			}
		} else if (Class253_Sub3.anInt7675 == 0) {
			int i_743_ = Class253_Sub3.anInt7692;
			while (i_743_ < 0) {
				int i_744_ = Class253_Sub3.anInt7695;
				int i_745_ = Class253_Sub3.anInt7677 + Class253_Sub3.anInt7686;
				int i_746_ = Class253_Sub3.anInt7694;
				int i_747_ = Class253_Sub3.anInt7687;
				if (i_746_ >= 0
						&& i_746_ - (((Class253_Sub3) this).anInt7671 << 12) < 0) {
					if (i_745_ < 0) {
						int i_748_ = ((Class253_Sub3.anInt7676 - 1 - i_745_) / Class253_Sub3.anInt7676);
						i_747_ += i_748_;
						i_745_ += Class253_Sub3.anInt7676 * i_748_;
						i_744_ += i_748_;
					}
					int i_749_;
					if ((i_749_ = ((1 + i_745_
							- (((Class253_Sub3) this).anInt7679 << 12) - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_747_)
						i_747_ = i_749_;
					for (/**/; i_747_ < 0; i_747_++) {
						int i_750_ = (((i_746_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_745_ >> 12));
						int i_751_ = i_744_++;
						int[] is_752_ = is;
						int i_753_ = i;
						int i_754_ = i_304_;
						if (i_754_ == 0) {
							if (i_753_ == 1)
								is_752_[i_751_] = (((Class253_Sub3_Sub2) this).anIntArray8799[i_750_]);
							else if (i_753_ == 0) {
								int i_755_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_750_++]);
								int i_756_ = (((i_755_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
								int i_757_ = (((i_755_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
								int i_758_ = (((i_755_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
								is_752_[i_751_] = (i_756_ | i_757_ | i_758_) >>> 8;
							} else if (i_753_ == 3) {
								int i_759_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_750_++]);
								int i_760_ = Class253_Sub3.anInt7670;
								int i_761_ = i_759_ + i_760_;
								int i_762_ = ((i_759_ & 0xff00ff) + (i_760_ & 0xff00ff));
								int i_763_ = ((i_762_ & 0x1000100) + (i_761_
										- i_762_ & 0x10000));
								is_752_[i_751_] = i_761_ - i_763_ | i_763_
										- (i_763_ >>> 8);
							} else if (i_753_ == 2) {
								int i_764_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_750_]);
								int i_765_ = (((i_764_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
								int i_766_ = (((i_764_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
								is_752_[i_751_] = (((i_765_ | i_766_) >>> 8) + Class253_Sub3.anInt7683);
							} else
								throw new IllegalArgumentException();
						} else if (i_754_ == 1) {
							if (i_753_ == 1) {
								int i_767_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_750_]);
								int i_768_ = i_767_ >>> 24;
								int i_769_ = 256 - i_768_;
								int i_770_ = is_752_[i_751_];
								is_752_[i_751_] = ((((i_767_ & 0xff00ff)
										* i_768_ + (i_770_ & 0xff00ff) * i_769_) & ~0xff00ff) + (((i_767_ & 0xff00)
										* i_768_ + (i_770_ & 0xff00) * i_769_) & 0xff0000)) >> 8;
							} else if (i_753_ == 0) {
								int i_771_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_750_]);
								int i_772_ = (((i_771_ >>> 24) * Class253_Sub3.anInt7696) >> 8);
								int i_773_ = 256 - i_772_;
								if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
									int i_774_ = is_752_[i_751_];
									is_752_[i_751_] = ((((i_771_ & 0xff00ff)
											* i_772_ + (i_774_ & 0xff00ff)
											* i_773_) & ~0xff00ff) + (((i_771_ & 0xff00)
											* i_772_ + (i_774_ & 0xff00)
											* i_773_) & 0xff0000)) >> 8;
								} else if (i_772_ != 255) {
									int i_775_ = (((i_771_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_776_ = (((i_771_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_777_ = (((i_771_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									i_771_ = (i_775_ | i_776_ | i_777_) >>> 8;
									int i_778_ = is_752_[i_751_];
									is_752_[i_751_] = ((((i_771_ & 0xff00ff)
											* i_772_ + (i_778_ & 0xff00ff)
											* i_773_) & ~0xff00ff) + (((i_771_ & 0xff00)
											* i_772_ + (i_778_ & 0xff00)
											* i_773_) & 0xff0000)) >> 8;
								} else {
									int i_779_ = (((i_771_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_780_ = (((i_771_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_781_ = (((i_771_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									is_752_[i_751_] = (i_779_ | i_780_ | i_781_) >>> 8;
								}
							} else if (i_753_ == 3) {
								int i_782_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_750_]);
								int i_783_ = Class253_Sub3.anInt7670;
								int i_784_ = i_782_ + i_783_;
								int i_785_ = ((i_782_ & 0xff00ff) + (i_783_ & 0xff00ff));
								int i_786_ = ((i_785_ & 0x1000100) + (i_784_
										- i_785_ & 0x10000));
								i_786_ = i_784_ - i_786_ | i_786_
										- (i_786_ >>> 8);
								int i_787_ = (((i_782_ >>> 24) * Class253_Sub3.anInt7696) >> 8);
								int i_788_ = 256 - i_787_;
								if (i_787_ != 255) {
									i_782_ = i_786_;
									i_786_ = is_752_[i_751_];
									i_786_ = ((((i_782_ & 0xff00ff) * i_787_ + (i_786_ & 0xff00ff)
											* i_788_) & ~0xff00ff) + (((i_782_ & 0xff00)
											* i_787_ + (i_786_ & 0xff00)
											* i_788_) & 0xff0000)) >> 8;
								}
								is_752_[i_751_] = i_786_;
							} else if (i_753_ == 2) {
								int i_789_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_750_]);
								int i_790_ = i_789_ >>> 24;
								int i_791_ = 256 - i_790_;
								int i_792_ = (((i_789_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
								int i_793_ = (((i_789_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
								i_789_ = (((i_792_ | i_793_) >>> 8) + Class253_Sub3.anInt7683);
								int i_794_ = is_752_[i_751_];
								is_752_[i_751_] = ((((i_789_ & 0xff00ff)
										* i_790_ + (i_794_ & 0xff00ff) * i_791_) & ~0xff00ff) + (((i_789_ & 0xff00)
										* i_790_ + (i_794_ & 0xff00) * i_791_) & 0xff0000)) >> 8;
							} else
								throw new IllegalArgumentException();
						} else if (i_754_ == 2) {
							if (i_753_ == 1) {
								int i_795_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_750_]);
								int i_796_ = is_752_[i_751_];
								int i_797_ = i_795_ + i_796_;
								int i_798_ = ((i_795_ & 0xff00ff) + (i_796_ & 0xff00ff));
								i_796_ = (i_798_ & 0x1000100)
										+ (i_797_ - i_798_ & 0x10000);
								is_752_[i_751_] = i_797_ - i_796_ | i_796_
										- (i_796_ >>> 8);
							} else if (i_753_ == 0) {
								int i_799_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_750_]);
								int i_800_ = (((i_799_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
								int i_801_ = (((i_799_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
								int i_802_ = (((i_799_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
								i_799_ = (i_800_ | i_801_ | i_802_) >>> 8;
								int i_803_ = is_752_[i_751_];
								int i_804_ = i_799_ + i_803_;
								int i_805_ = ((i_799_ & 0xff00ff) + (i_803_ & 0xff00ff));
								i_803_ = (i_805_ & 0x1000100)
										+ (i_804_ - i_805_ & 0x10000);
								is_752_[i_751_] = i_804_ - i_803_ | i_803_
										- (i_803_ >>> 8);
							} else if (i_753_ == 3) {
								int i_806_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_750_]);
								int i_807_ = Class253_Sub3.anInt7670;
								int i_808_ = i_806_ + i_807_;
								int i_809_ = ((i_806_ & 0xff00ff) + (i_807_ & 0xff00ff));
								int i_810_ = ((i_809_ & 0x1000100) + (i_808_
										- i_809_ & 0x10000));
								i_806_ = i_808_ - i_810_ | i_810_
										- (i_810_ >>> 8);
								i_810_ = is_752_[i_751_];
								i_808_ = i_806_ + i_810_;
								i_809_ = (i_806_ & 0xff00ff)
										+ (i_810_ & 0xff00ff);
								i_810_ = (i_809_ & 0x1000100)
										+ (i_808_ - i_809_ & 0x10000);
								is_752_[i_751_] = i_808_ - i_810_ | i_810_
										- (i_810_ >>> 8);
							} else if (i_753_ == 2) {
								int i_811_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_750_]);
								int i_812_ = (((i_811_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
								int i_813_ = (((i_811_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
								i_811_ = (((i_812_ | i_813_) >>> 8) + Class253_Sub3.anInt7683);
								int i_814_ = is_752_[i_751_];
								int i_815_ = i_811_ + i_814_;
								int i_816_ = ((i_811_ & 0xff00ff) + (i_814_ & 0xff00ff));
								i_814_ = (i_816_ & 0x1000100)
										+ (i_815_ - i_816_ & 0x10000);
								is_752_[i_751_] = i_815_ - i_814_ | i_814_
										- (i_814_ >>> 8);
							}
						} else
							throw new IllegalArgumentException();
						i_745_ += Class253_Sub3.anInt7676;
					}
				}
				i_743_++;
				Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
				Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
				Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
			}
		} else if (Class253_Sub3.anInt7675 < 0) {
			for (int i_817_ = Class253_Sub3.anInt7692; i_817_ < 0; i_817_++) {
				int i_818_ = Class253_Sub3.anInt7695;
				int i_819_ = Class253_Sub3.anInt7677 + Class253_Sub3.anInt7686;
				int i_820_ = Class253_Sub3.anInt7694 + Class253_Sub3.anInt7697;
				int i_821_ = Class253_Sub3.anInt7687;
				if (i_819_ < 0) {
					int i_822_ = ((Class253_Sub3.anInt7676 - 1 - i_819_) / Class253_Sub3.anInt7676);
					i_821_ += i_822_;
					i_819_ += Class253_Sub3.anInt7676 * i_822_;
					i_820_ += Class253_Sub3.anInt7675 * i_822_;
					i_818_ += i_822_;
				}
				int i_823_;
				if ((i_823_ = (1 + i_819_
						- (((Class253_Sub3) this).anInt7679 << 12) - Class253_Sub3.anInt7676)
						/ Class253_Sub3.anInt7676) > i_821_)
					i_821_ = i_823_;
				if ((i_823_ = i_820_ - (((Class253_Sub3) this).anInt7671 << 12)) >= 0) {
					i_823_ = ((Class253_Sub3.anInt7675 - i_823_) / Class253_Sub3.anInt7675);
					i_821_ += i_823_;
					i_819_ += Class253_Sub3.anInt7676 * i_823_;
					i_820_ += Class253_Sub3.anInt7675 * i_823_;
					i_818_ += i_823_;
				}
				if ((i_823_ = ((i_820_ - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_821_)
					i_821_ = i_823_;
				for (/**/; i_821_ < 0; i_821_++) {
					int i_824_ = ((i_820_ >> 12)
							* ((Class253_Sub3) this).anInt7679 + (i_819_ >> 12));
					int i_825_ = i_818_++;
					int[] is_826_ = is;
					int i_827_ = i;
					int i_828_ = i_304_;
					if (i_828_ == 0) {
						if (i_827_ == 1)
							is_826_[i_825_] = (((Class253_Sub3_Sub2) this).anIntArray8799[i_824_]);
						else if (i_827_ == 0) {
							int i_829_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_824_++]);
							int i_830_ = (((i_829_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
							int i_831_ = ((i_829_ & 0xff00)
									* Class253_Sub3.anInt7690 & 0xff0000);
							int i_832_ = ((i_829_ & 0xff)
									* Class253_Sub3.anInt7685 & 0xff00);
							is_826_[i_825_] = (i_830_ | i_831_ | i_832_) >>> 8;
						} else if (i_827_ == 3) {
							int i_833_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_824_++]);
							int i_834_ = Class253_Sub3.anInt7670;
							int i_835_ = i_833_ + i_834_;
							int i_836_ = (i_833_ & 0xff00ff)
									+ (i_834_ & 0xff00ff);
							int i_837_ = ((i_836_ & 0x1000100) + (i_835_
									- i_836_ & 0x10000));
							is_826_[i_825_] = i_835_ - i_837_ | i_837_
									- (i_837_ >>> 8);
						} else if (i_827_ == 2) {
							int i_838_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_824_]);
							int i_839_ = (((i_838_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
							int i_840_ = ((i_838_ & 0xff00)
									* Class253_Sub3.anInt7696 & 0xff0000);
							is_826_[i_825_] = (((i_839_ | i_840_) >>> 8) + Class253_Sub3.anInt7683);
						} else
							throw new IllegalArgumentException();
					} else if (i_828_ == 1) {
						if (i_827_ == 1) {
							int i_841_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_824_]);
							int i_842_ = i_841_ >>> 24;
							int i_843_ = 256 - i_842_;
							int i_844_ = is_826_[i_825_];
							is_826_[i_825_] = ((((i_841_ & 0xff00ff) * i_842_ + (i_844_ & 0xff00ff)
									* i_843_) & ~0xff00ff) + (((i_841_ & 0xff00)
									* i_842_ + (i_844_ & 0xff00) * i_843_) & 0xff0000)) >> 8;
						} else if (i_827_ == 0) {
							int i_845_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_824_]);
							int i_846_ = ((i_845_ >>> 24)
									* Class253_Sub3.anInt7696 >> 8);
							int i_847_ = 256 - i_846_;
							if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
								int i_848_ = is_826_[i_825_];
								is_826_[i_825_] = ((((i_845_ & 0xff00ff)
										* i_846_ + (i_848_ & 0xff00ff) * i_847_) & ~0xff00ff) + (((i_845_ & 0xff00)
										* i_846_ + (i_848_ & 0xff00) * i_847_) & 0xff0000)) >> 8;
							} else if (i_846_ != 255) {
								int i_849_ = (((i_845_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
								int i_850_ = (((i_845_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
								int i_851_ = (((i_845_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
								i_845_ = (i_849_ | i_850_ | i_851_) >>> 8;
								int i_852_ = is_826_[i_825_];
								is_826_[i_825_] = ((((i_845_ & 0xff00ff)
										* i_846_ + (i_852_ & 0xff00ff) * i_847_) & ~0xff00ff) + (((i_845_ & 0xff00)
										* i_846_ + (i_852_ & 0xff00) * i_847_) & 0xff0000)) >> 8;
							} else {
								int i_853_ = (((i_845_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
								int i_854_ = (((i_845_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
								int i_855_ = (((i_845_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
								is_826_[i_825_] = (i_853_ | i_854_ | i_855_) >>> 8;
							}
						} else if (i_827_ == 3) {
							int i_856_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_824_]);
							int i_857_ = Class253_Sub3.anInt7670;
							int i_858_ = i_856_ + i_857_;
							int i_859_ = (i_856_ & 0xff00ff)
									+ (i_857_ & 0xff00ff);
							int i_860_ = ((i_859_ & 0x1000100) + (i_858_
									- i_859_ & 0x10000));
							i_860_ = i_858_ - i_860_ | i_860_ - (i_860_ >>> 8);
							int i_861_ = ((i_856_ >>> 24)
									* Class253_Sub3.anInt7696 >> 8);
							int i_862_ = 256 - i_861_;
							if (i_861_ != 255) {
								i_856_ = i_860_;
								i_860_ = is_826_[i_825_];
								i_860_ = ((((i_856_ & 0xff00ff) * i_861_ + (i_860_ & 0xff00ff)
										* i_862_) & ~0xff00ff) + (((i_856_ & 0xff00)
										* i_861_ + (i_860_ & 0xff00) * i_862_) & 0xff0000)) >> 8;
							}
							is_826_[i_825_] = i_860_;
						} else if (i_827_ == 2) {
							int i_863_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_824_]);
							int i_864_ = i_863_ >>> 24;
							int i_865_ = 256 - i_864_;
							int i_866_ = (((i_863_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
							int i_867_ = ((i_863_ & 0xff00)
									* Class253_Sub3.anInt7696 & 0xff0000);
							i_863_ = (((i_866_ | i_867_) >>> 8) + Class253_Sub3.anInt7683);
							int i_868_ = is_826_[i_825_];
							is_826_[i_825_] = ((((i_863_ & 0xff00ff) * i_864_ + (i_868_ & 0xff00ff)
									* i_865_) & ~0xff00ff) + (((i_863_ & 0xff00)
									* i_864_ + (i_868_ & 0xff00) * i_865_) & 0xff0000)) >> 8;
						} else
							throw new IllegalArgumentException();
					} else if (i_828_ == 2) {
						if (i_827_ == 1) {
							int i_869_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_824_]);
							int i_870_ = is_826_[i_825_];
							int i_871_ = i_869_ + i_870_;
							int i_872_ = (i_869_ & 0xff00ff)
									+ (i_870_ & 0xff00ff);
							i_870_ = (i_872_ & 0x1000100)
									+ (i_871_ - i_872_ & 0x10000);
							is_826_[i_825_] = i_871_ - i_870_ | i_870_
									- (i_870_ >>> 8);
						} else if (i_827_ == 0) {
							int i_873_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_824_]);
							int i_874_ = (((i_873_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
							int i_875_ = ((i_873_ & 0xff00)
									* Class253_Sub3.anInt7690 & 0xff0000);
							int i_876_ = ((i_873_ & 0xff)
									* Class253_Sub3.anInt7685 & 0xff00);
							i_873_ = (i_874_ | i_875_ | i_876_) >>> 8;
							int i_877_ = is_826_[i_825_];
							int i_878_ = i_873_ + i_877_;
							int i_879_ = (i_873_ & 0xff00ff)
									+ (i_877_ & 0xff00ff);
							i_877_ = (i_879_ & 0x1000100)
									+ (i_878_ - i_879_ & 0x10000);
							is_826_[i_825_] = i_878_ - i_877_ | i_877_
									- (i_877_ >>> 8);
						} else if (i_827_ == 3) {
							int i_880_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_824_]);
							int i_881_ = Class253_Sub3.anInt7670;
							int i_882_ = i_880_ + i_881_;
							int i_883_ = (i_880_ & 0xff00ff)
									+ (i_881_ & 0xff00ff);
							int i_884_ = ((i_883_ & 0x1000100) + (i_882_
									- i_883_ & 0x10000));
							i_880_ = i_882_ - i_884_ | i_884_ - (i_884_ >>> 8);
							i_884_ = is_826_[i_825_];
							i_882_ = i_880_ + i_884_;
							i_883_ = (i_880_ & 0xff00ff) + (i_884_ & 0xff00ff);
							i_884_ = (i_883_ & 0x1000100)
									+ (i_882_ - i_883_ & 0x10000);
							is_826_[i_825_] = i_882_ - i_884_ | i_884_
									- (i_884_ >>> 8);
						} else if (i_827_ == 2) {
							int i_885_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_824_]);
							int i_886_ = (((i_885_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
							int i_887_ = ((i_885_ & 0xff00)
									* Class253_Sub3.anInt7696 & 0xff0000);
							i_885_ = (((i_886_ | i_887_) >>> 8) + Class253_Sub3.anInt7683);
							int i_888_ = is_826_[i_825_];
							int i_889_ = i_885_ + i_888_;
							int i_890_ = (i_885_ & 0xff00ff)
									+ (i_888_ & 0xff00ff);
							i_888_ = (i_890_ & 0x1000100)
									+ (i_889_ - i_890_ & 0x10000);
							is_826_[i_825_] = i_889_ - i_888_ | i_888_
									- (i_888_ >>> 8);
						}
					} else
						throw new IllegalArgumentException();
					i_819_ += Class253_Sub3.anInt7676;
					i_820_ += Class253_Sub3.anInt7675;
				}
				Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
				Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
				Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
			}
		} else {
			for (int i_891_ = Class253_Sub3.anInt7692; i_891_ < 0; i_891_++) {
				int i_892_ = Class253_Sub3.anInt7695;
				int i_893_ = Class253_Sub3.anInt7677 + Class253_Sub3.anInt7686;
				int i_894_ = Class253_Sub3.anInt7694 + Class253_Sub3.anInt7697;
				int i_895_ = Class253_Sub3.anInt7687;
				if (i_893_ < 0) {
					int i_896_ = ((Class253_Sub3.anInt7676 - 1 - i_893_) / Class253_Sub3.anInt7676);
					i_895_ += i_896_;
					i_893_ += Class253_Sub3.anInt7676 * i_896_;
					i_894_ += Class253_Sub3.anInt7675 * i_896_;
					i_892_ += i_896_;
				}
				int i_897_;
				if ((i_897_ = (1 + i_893_
						- (((Class253_Sub3) this).anInt7679 << 12) - Class253_Sub3.anInt7676)
						/ Class253_Sub3.anInt7676) > i_895_)
					i_895_ = i_897_;
				if (i_894_ < 0) {
					i_897_ = ((Class253_Sub3.anInt7675 - 1 - i_894_) / Class253_Sub3.anInt7675);
					i_895_ += i_897_;
					i_893_ += Class253_Sub3.anInt7676 * i_897_;
					i_894_ += Class253_Sub3.anInt7675 * i_897_;
					i_892_ += i_897_;
				}
				if ((i_897_ = (1 + i_894_
						- (((Class253_Sub3) this).anInt7671 << 12) - Class253_Sub3.anInt7675)
						/ Class253_Sub3.anInt7675) > i_895_)
					i_895_ = i_897_;
				for (/**/; i_895_ < 0; i_895_++) {
					int i_898_ = ((i_894_ >> 12)
							* ((Class253_Sub3) this).anInt7679 + (i_893_ >> 12));
					int i_899_ = i_892_++;
					int[] is_900_ = is;
					int i_901_ = i;
					int i_902_ = i_304_;
					if (i_902_ == 0) {
						if (i_901_ == 1)
							is_900_[i_899_] = (((Class253_Sub3_Sub2) this).anIntArray8799[i_898_]);
						else if (i_901_ == 0) {
							int i_903_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_898_++]);
							int i_904_ = (((i_903_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
							int i_905_ = ((i_903_ & 0xff00)
									* Class253_Sub3.anInt7690 & 0xff0000);
							int i_906_ = ((i_903_ & 0xff)
									* Class253_Sub3.anInt7685 & 0xff00);
							is_900_[i_899_] = (i_904_ | i_905_ | i_906_) >>> 8;
						} else if (i_901_ == 3) {
							int i_907_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_898_++]);
							int i_908_ = Class253_Sub3.anInt7670;
							int i_909_ = i_907_ + i_908_;
							int i_910_ = (i_907_ & 0xff00ff)
									+ (i_908_ & 0xff00ff);
							int i_911_ = ((i_910_ & 0x1000100) + (i_909_
									- i_910_ & 0x10000));
							is_900_[i_899_] = i_909_ - i_911_ | i_911_
									- (i_911_ >>> 8);
						} else if (i_901_ == 2) {
							int i_912_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_898_]);
							int i_913_ = (((i_912_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
							int i_914_ = ((i_912_ & 0xff00)
									* Class253_Sub3.anInt7696 & 0xff0000);
							is_900_[i_899_] = (((i_913_ | i_914_) >>> 8) + Class253_Sub3.anInt7683);
						} else
							throw new IllegalArgumentException();
					} else if (i_902_ == 1) {
						if (i_901_ == 1) {
							int i_915_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_898_]);
							int i_916_ = i_915_ >>> 24;
							int i_917_ = 256 - i_916_;
							int i_918_ = is_900_[i_899_];
							is_900_[i_899_] = ((((i_915_ & 0xff00ff) * i_916_ + (i_918_ & 0xff00ff)
									* i_917_) & ~0xff00ff) + (((i_915_ & 0xff00)
									* i_916_ + (i_918_ & 0xff00) * i_917_) & 0xff0000)) >> 8;
						} else if (i_901_ == 0) {
							int i_919_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_898_]);
							int i_920_ = ((i_919_ >>> 24)
									* Class253_Sub3.anInt7696 >> 8);
							int i_921_ = 256 - i_920_;
							if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
								int i_922_ = is_900_[i_899_];
								is_900_[i_899_] = ((((i_919_ & 0xff00ff)
										* i_920_ + (i_922_ & 0xff00ff) * i_921_) & ~0xff00ff) + (((i_919_ & 0xff00)
										* i_920_ + (i_922_ & 0xff00) * i_921_) & 0xff0000)) >> 8;
							} else if (i_920_ != 255) {
								int i_923_ = (((i_919_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
								int i_924_ = (((i_919_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
								int i_925_ = (((i_919_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
								i_919_ = (i_923_ | i_924_ | i_925_) >>> 8;
								int i_926_ = is_900_[i_899_];
								is_900_[i_899_] = ((((i_919_ & 0xff00ff)
										* i_920_ + (i_926_ & 0xff00ff) * i_921_) & ~0xff00ff) + (((i_919_ & 0xff00)
										* i_920_ + (i_926_ & 0xff00) * i_921_) & 0xff0000)) >> 8;
							} else {
								int i_927_ = (((i_919_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
								int i_928_ = (((i_919_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
								int i_929_ = (((i_919_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
								is_900_[i_899_] = (i_927_ | i_928_ | i_929_) >>> 8;
							}
						} else if (i_901_ == 3) {
							int i_930_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_898_]);
							int i_931_ = Class253_Sub3.anInt7670;
							int i_932_ = i_930_ + i_931_;
							int i_933_ = (i_930_ & 0xff00ff)
									+ (i_931_ & 0xff00ff);
							int i_934_ = ((i_933_ & 0x1000100) + (i_932_
									- i_933_ & 0x10000));
							i_934_ = i_932_ - i_934_ | i_934_ - (i_934_ >>> 8);
							int i_935_ = ((i_930_ >>> 24)
									* Class253_Sub3.anInt7696 >> 8);
							int i_936_ = 256 - i_935_;
							if (i_935_ != 255) {
								i_930_ = i_934_;
								i_934_ = is_900_[i_899_];
								i_934_ = ((((i_930_ & 0xff00ff) * i_935_ + (i_934_ & 0xff00ff)
										* i_936_) & ~0xff00ff) + (((i_930_ & 0xff00)
										* i_935_ + (i_934_ & 0xff00) * i_936_) & 0xff0000)) >> 8;
							}
							is_900_[i_899_] = i_934_;
						} else if (i_901_ == 2) {
							int i_937_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_898_]);
							int i_938_ = i_937_ >>> 24;
							int i_939_ = 256 - i_938_;
							int i_940_ = (((i_937_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
							int i_941_ = ((i_937_ & 0xff00)
									* Class253_Sub3.anInt7696 & 0xff0000);
							i_937_ = (((i_940_ | i_941_) >>> 8) + Class253_Sub3.anInt7683);
							int i_942_ = is_900_[i_899_];
							is_900_[i_899_] = ((((i_937_ & 0xff00ff) * i_938_ + (i_942_ & 0xff00ff)
									* i_939_) & ~0xff00ff) + (((i_937_ & 0xff00)
									* i_938_ + (i_942_ & 0xff00) * i_939_) & 0xff0000)) >> 8;
						} else
							throw new IllegalArgumentException();
					} else if (i_902_ == 2) {
						if (i_901_ == 1) {
							int i_943_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_898_]);
							int i_944_ = is_900_[i_899_];
							int i_945_ = i_943_ + i_944_;
							int i_946_ = (i_943_ & 0xff00ff)
									+ (i_944_ & 0xff00ff);
							i_944_ = (i_946_ & 0x1000100)
									+ (i_945_ - i_946_ & 0x10000);
							is_900_[i_899_] = i_945_ - i_944_ | i_944_
									- (i_944_ >>> 8);
						} else if (i_901_ == 0) {
							int i_947_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_898_]);
							int i_948_ = (((i_947_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
							int i_949_ = ((i_947_ & 0xff00)
									* Class253_Sub3.anInt7690 & 0xff0000);
							int i_950_ = ((i_947_ & 0xff)
									* Class253_Sub3.anInt7685 & 0xff00);
							i_947_ = (i_948_ | i_949_ | i_950_) >>> 8;
							int i_951_ = is_900_[i_899_];
							int i_952_ = i_947_ + i_951_;
							int i_953_ = (i_947_ & 0xff00ff)
									+ (i_951_ & 0xff00ff);
							i_951_ = (i_953_ & 0x1000100)
									+ (i_952_ - i_953_ & 0x10000);
							is_900_[i_899_] = i_952_ - i_951_ | i_951_
									- (i_951_ >>> 8);
						} else if (i_901_ == 3) {
							int i_954_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_898_]);
							int i_955_ = Class253_Sub3.anInt7670;
							int i_956_ = i_954_ + i_955_;
							int i_957_ = (i_954_ & 0xff00ff)
									+ (i_955_ & 0xff00ff);
							int i_958_ = ((i_957_ & 0x1000100) + (i_956_
									- i_957_ & 0x10000));
							i_954_ = i_956_ - i_958_ | i_958_ - (i_958_ >>> 8);
							i_958_ = is_900_[i_899_];
							i_956_ = i_954_ + i_958_;
							i_957_ = (i_954_ & 0xff00ff) + (i_958_ & 0xff00ff);
							i_958_ = (i_957_ & 0x1000100)
									+ (i_956_ - i_957_ & 0x10000);
							is_900_[i_899_] = i_956_ - i_958_ | i_958_
									- (i_958_ >>> 8);
						} else if (i_901_ == 2) {
							int i_959_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_898_]);
							int i_960_ = (((i_959_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
							int i_961_ = ((i_959_ & 0xff00)
									* Class253_Sub3.anInt7696 & 0xff0000);
							i_959_ = (((i_960_ | i_961_) >>> 8) + Class253_Sub3.anInt7683);
							int i_962_ = is_900_[i_899_];
							int i_963_ = i_959_ + i_962_;
							int i_964_ = (i_959_ & 0xff00ff)
									+ (i_962_ & 0xff00ff);
							i_962_ = (i_964_ & 0x1000100)
									+ (i_963_ - i_964_ & 0x10000);
							is_900_[i_899_] = i_963_ - i_962_ | i_962_
									- (i_962_ >>> 8);
						}
					} else
						throw new IllegalArgumentException();
					i_893_ += Class253_Sub3.anInt7676;
					i_894_ += Class253_Sub3.anInt7675;
				}
				Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
				Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
				Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
			}
		}
	}

	Class253_Sub3_Sub2(Class163_Sub1 class163_sub1, int[] is, int i, int i_965_) {
		super(class163_sub1, i, i_965_);
		((Class253_Sub3_Sub2) this).anIntArray8799 = is;
	}

	final void method1612(int i, int i_966_, Class72 class72, int i_967_,
			int i_968_) {
		if (((Class253_Sub3) this).aClass163_Sub1_7698.method2293())
			throw new IllegalStateException();
		i += ((Class253_Sub3) this).anInt7689;
		i_966_ += ((Class253_Sub3) this).anInt7691;
		int i_969_ = 0;
		int i_970_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5206);
		int i_971_ = ((Class253_Sub3) this).anInt7679;
		int i_972_ = ((Class253_Sub3) this).anInt7671;
		int i_973_ = i_970_ - i_971_;
		int i_974_ = 0;
		int i_975_ = i + i_966_ * i_970_;
		if (i_966_ < (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177)) {
			int i_976_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177)
					- i_966_;
			i_972_ -= i_976_;
			i_966_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177);
			i_969_ += i_976_ * i_971_;
			i_975_ += i_976_ * i_970_;
		}
		if (i_966_ + i_972_ > (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5193))
			i_972_ -= i_966_
					+ i_972_
					- (((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5193);
		if (i < (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186)) {
			int i_977_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186)
					- i;
			i_971_ -= i_977_;
			i = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186);
			i_969_ += i_977_;
			i_975_ += i_977_;
			i_974_ += i_977_;
			i_973_ += i_977_;
		}
		if (i + i_971_ > (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5178)) {
			int i_978_ = i
					+ i_971_
					- (((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5178);
			i_971_ -= i_978_;
			i_974_ += i_978_;
			i_973_ += i_978_;
		}
		if (i_971_ > 0 && i_972_ > 0) {
			Class72_Sub2 class72_sub2 = (Class72_Sub2) class72;
			int[] is = ((Class72_Sub2) class72_sub2).anIntArray6909;
			int[] is_979_ = ((Class72_Sub2) class72_sub2).anIntArray6911;
			int[] is_980_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anIntArray5214);
			int i_981_ = i_966_;
			if (i_968_ > i_981_) {
				i_981_ = i_968_;
				i_975_ += (i_968_ - i_966_) * i_970_;
				i_969_ += (i_968_ - i_966_) * ((Class253_Sub3) this).anInt7679;
			}
			int i_982_ = (i_968_ + is.length < i_966_ + i_972_ ? i_968_
					+ is.length : i_966_ + i_972_);
			for (int i_983_ = i_981_; i_983_ < i_982_; i_983_++) {
				int i_984_ = is[i_983_ - i_968_] + i_967_;
				int i_985_ = is_979_[i_983_ - i_968_];
				int i_986_ = i_971_;
				if (i > i_984_) {
					int i_987_ = i - i_984_;
					if (i_987_ >= i_985_) {
						i_969_ += i_971_ + i_974_;
						i_975_ += i_971_ + i_973_;
						continue;
					}
					i_985_ -= i_987_;
				} else {
					int i_988_ = i_984_ - i;
					if (i_988_ >= i_971_) {
						i_969_ += i_971_ + i_974_;
						i_975_ += i_971_ + i_973_;
						continue;
					}
					i_969_ += i_988_;
					i_986_ -= i_988_;
					i_975_ += i_988_;
				}
				int i_989_ = 0;
				if (i_986_ < i_985_)
					i_985_ = i_986_;
				else
					i_989_ = i_986_ - i_985_;
				for (int i_990_ = -i_985_; i_990_ < 0; i_990_++) {
					int i_991_ = ((Class253_Sub3_Sub2) this).anIntArray8799[i_969_++];
					int i_992_ = i_991_ >>> 24;
					int i_993_ = 256 - i_992_;
					int i_994_ = is_980_[i_975_];
					is_980_[i_975_++] = ((((i_991_ & 0xff00ff) * i_992_ + (i_994_ & 0xff00ff)
							* i_993_) & ~0xff00ff) + (((i_991_ & 0xff00)
							* i_992_ + (i_994_ & 0xff00) * i_993_) & 0xff0000)) >> 8;
				}
				i_969_ += i_989_ + i_974_;
				i_975_ += i_989_ + i_973_;
			}
		}
	}

	final void method1624(int i, int i_995_, int i_996_, int i_997_, int i_998_) {
		if (((Class253_Sub3) this).aClass163_Sub1_7698.method2293())
			throw new IllegalStateException();
		int i_999_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5206);
		i += ((Class253_Sub3) this).anInt7689;
		i_995_ += ((Class253_Sub3) this).anInt7691;
		int i_1000_ = i_995_ * i_999_ + i;
		int i_1001_ = 0;
		int i_1002_ = ((Class253_Sub3) this).anInt7671;
		int i_1003_ = ((Class253_Sub3) this).anInt7679;
		int i_1004_ = i_999_ - i_1003_;
		int i_1005_ = 0;
		if (i_995_ < (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177)) {
			int i_1006_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177)
					- i_995_;
			i_1002_ -= i_1006_;
			i_995_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177);
			i_1001_ += i_1006_ * i_1003_;
			i_1000_ += i_1006_ * i_999_;
		}
		if (i_995_ + i_1002_ > (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5193))
			i_1002_ -= i_995_
					+ i_1002_
					- (((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5193);
		if (i < (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186)) {
			int i_1007_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186)
					- i;
			i_1003_ -= i_1007_;
			i = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186);
			i_1001_ += i_1007_;
			i_1000_ += i_1007_;
			i_1005_ += i_1007_;
			i_1004_ += i_1007_;
		}
		if (i + i_1003_ > (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5178)) {
			int i_1008_ = (i + i_1003_ - ((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5178);
			i_1003_ -= i_1008_;
			i_1005_ += i_1008_;
			i_1004_ += i_1008_;
		}
		if (i_1003_ > 0 && i_1002_ > 0) {
			int[] is = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anIntArray5214);
			if (i_998_ == 0) {
				if (i_996_ == 1) {
					for (int i_1009_ = -i_1002_; i_1009_ < 0; i_1009_++) {
						int i_1010_ = i_1000_ + i_1003_ - 3;
						while (i_1000_ < i_1010_) {
							is[i_1000_++] = (((Class253_Sub3_Sub2) this).anIntArray8799[i_1001_++]);
							is[i_1000_++] = (((Class253_Sub3_Sub2) this).anIntArray8799[i_1001_++]);
							is[i_1000_++] = (((Class253_Sub3_Sub2) this).anIntArray8799[i_1001_++]);
							is[i_1000_++] = (((Class253_Sub3_Sub2) this).anIntArray8799[i_1001_++]);
						}
						i_1010_ += 3;
						while (i_1000_ < i_1010_)
							is[i_1000_++] = (((Class253_Sub3_Sub2) this).anIntArray8799[i_1001_++]);
						i_1000_ += i_1004_;
						i_1001_ += i_1005_;
					}
					return;
				}
				if (i_996_ == 0) {
					int i_1011_ = (i_997_ & 0xff0000) >> 16;
					int i_1012_ = (i_997_ & 0xff00) >> 8;
					int i_1013_ = i_997_ & 0xff;
					for (int i_1014_ = -i_1002_; i_1014_ < 0; i_1014_++) {
						for (int i_1015_ = -i_1003_; i_1015_ < 0; i_1015_++) {
							int i_1016_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_1001_++]);
							int i_1017_ = (i_1016_ & 0xff0000) * i_1011_
									& ~0xffffff;
							int i_1018_ = (i_1016_ & 0xff00) * i_1012_
									& 0xff0000;
							int i_1019_ = (i_1016_ & 0xff) * i_1013_ & 0xff00;
							is[i_1000_++] = (i_1017_ | i_1018_ | i_1019_) >>> 8;
						}
						i_1000_ += i_1004_;
						i_1001_ += i_1005_;
					}
					return;
				}
				if (i_996_ == 3) {
					for (int i_1020_ = -i_1002_; i_1020_ < 0; i_1020_++) {
						for (int i_1021_ = -i_1003_; i_1021_ < 0; i_1021_++) {
							int i_1022_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_1001_++]);
							int i_1023_ = i_1022_ + i_997_;
							int i_1024_ = (i_1022_ & 0xff00ff)
									+ (i_997_ & 0xff00ff);
							int i_1025_ = ((i_1024_ & 0x1000100) + (i_1023_
									- i_1024_ & 0x10000));
							is[i_1000_++] = i_1023_ - i_1025_ | i_1025_
									- (i_1025_ >>> 8);
						}
						i_1000_ += i_1004_;
						i_1001_ += i_1005_;
					}
					return;
				}
				if (i_996_ == 2) {
					int i_1026_ = i_997_ >>> 24;
					int i_1027_ = 256 - i_1026_;
					int i_1028_ = (i_997_ & 0xff00ff) * i_1027_ & ~0xff00ff;
					int i_1029_ = (i_997_ & 0xff00) * i_1027_ & 0xff0000;
					i_997_ = (i_1028_ | i_1029_) >>> 8;
					for (int i_1030_ = -i_1002_; i_1030_ < 0; i_1030_++) {
						for (int i_1031_ = -i_1003_; i_1031_ < 0; i_1031_++) {
							int i_1032_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_1001_++]);
							i_1028_ = (i_1032_ & 0xff00ff) * i_1026_
									& ~0xff00ff;
							i_1029_ = (i_1032_ & 0xff00) * i_1026_ & 0xff0000;
							is[i_1000_++] = ((i_1028_ | i_1029_) >>> 8)
									+ i_997_;
						}
						i_1000_ += i_1004_;
						i_1001_ += i_1005_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_998_ == 1) {
				if (i_996_ == 1) {
					for (int i_1033_ = -i_1002_; i_1033_ < 0; i_1033_++) {
						for (int i_1034_ = -i_1003_; i_1034_ < 0; i_1034_++) {
							int i_1035_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_1001_++]);
							int i_1036_ = i_1035_ >>> 24;
							int i_1037_ = 256 - i_1036_;
							int i_1038_ = is[i_1000_];
							is[i_1000_++] = (((((i_1035_ & 0xff00ff) * i_1036_ + (i_1038_ & 0xff00ff)
									* i_1037_) & ~0xff00ff) >> 8) + ((((i_1035_ & ~0xff00ff) >>> 8)
									* i_1036_ + (((i_1038_ & ~0xff00ff) >>> 8) * i_1037_)) & ~0xff00ff));
						}
						i_1000_ += i_1004_;
						i_1001_ += i_1005_;
					}
					return;
				}
				if (i_996_ == 0) {
					if ((i_997_ & 0xffffff) == 16777215) {
						for (int i_1039_ = -i_1002_; i_1039_ < 0; i_1039_++) {
							for (int i_1040_ = -i_1003_; i_1040_ < 0; i_1040_++) {
								int i_1041_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_1001_++]);
								int i_1042_ = (i_1041_ >>> 24)
										* (i_997_ >>> 24) >> 8;
								int i_1043_ = 256 - i_1042_;
								int i_1044_ = is[i_1000_];
								is[i_1000_++] = ((((i_1041_ & 0xff00ff)
										* i_1042_ + (i_1044_ & 0xff00ff)
										* i_1043_) & ~0xff00ff) + (((i_1041_ & 0xff00)
										* i_1042_ + (i_1044_ & 0xff00)
										* i_1043_) & 0xff0000)) >> 8;
							}
							i_1000_ += i_1004_;
							i_1001_ += i_1005_;
						}
					} else {
						int i_1045_ = (i_997_ & 0xff0000) >> 16;
						int i_1046_ = (i_997_ & 0xff00) >> 8;
						int i_1047_ = i_997_ & 0xff;
						for (int i_1048_ = -i_1002_; i_1048_ < 0; i_1048_++) {
							for (int i_1049_ = -i_1003_; i_1049_ < 0; i_1049_++) {
								int i_1050_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_1001_++]);
								int i_1051_ = (i_1050_ >>> 24)
										* (i_997_ >>> 24) >> 8;
								int i_1052_ = 256 - i_1051_;
								if (i_1051_ != 255) {
									int i_1053_ = ((i_1050_ & 0xff0000)
											* i_1045_ & ~0xffffff);
									int i_1054_ = ((i_1050_ & 0xff00) * i_1046_ & 0xff0000);
									int i_1055_ = (i_1050_ & 0xff) * i_1047_
											& 0xff00;
									i_1050_ = (i_1053_ | i_1054_ | i_1055_) >>> 8;
									int i_1056_ = is[i_1000_];
									is[i_1000_++] = ((((i_1050_ & 0xff00ff)
											* i_1051_ + (i_1056_ & 0xff00ff)
											* i_1052_) & ~0xff00ff) + (((i_1050_ & 0xff00)
											* i_1051_ + (i_1056_ & 0xff00)
											* i_1052_) & 0xff0000)) >> 8;
								} else {
									int i_1057_ = ((i_1050_ & 0xff0000)
											* i_1045_ & ~0xffffff);
									int i_1058_ = ((i_1050_ & 0xff00) * i_1046_ & 0xff0000);
									int i_1059_ = (i_1050_ & 0xff) * i_1047_
											& 0xff00;
									is[i_1000_++] = (i_1057_ | i_1058_ | i_1059_) >>> 8;
								}
							}
							i_1000_ += i_1004_;
							i_1001_ += i_1005_;
						}
						return;
					}
					return;
				}
				if (i_996_ == 3) {
					for (int i_1060_ = -i_1002_; i_1060_ < 0; i_1060_++) {
						for (int i_1061_ = -i_1003_; i_1061_ < 0; i_1061_++) {
							int i_1062_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_1001_++]);
							int i_1063_ = i_1062_ + i_997_;
							int i_1064_ = (i_1062_ & 0xff00ff)
									+ (i_997_ & 0xff00ff);
							int i_1065_ = ((i_1064_ & 0x1000100) + (i_1063_
									- i_1064_ & 0x10000));
							i_1065_ = i_1063_ - i_1065_ | i_1065_
									- (i_1065_ >>> 8);
							int i_1066_ = (i_1065_ >>> 24) * (i_997_ >>> 24) >> 8;
							int i_1067_ = 256 - i_1066_;
							if (i_1066_ != 255) {
								i_1062_ = i_1065_;
								i_1065_ = is[i_1000_];
								i_1065_ = ((((i_1062_ & 0xff00ff) * i_1066_ + (i_1065_ & 0xff00ff)
										* i_1067_) & ~0xff00ff) + (((i_1062_ & 0xff00)
										* i_1066_ + (i_1065_ & 0xff00)
										* i_1067_) & 0xff0000)) >> 8;
							}
							is[i_1000_++] = i_1065_;
						}
						i_1000_ += i_1004_;
						i_1001_ += i_1005_;
					}
					return;
				}
				if (i_996_ == 2) {
					int i_1068_ = i_997_ >>> 24;
					int i_1069_ = 256 - i_1068_;
					int i_1070_ = (i_997_ & 0xff00ff) * i_1069_ & ~0xff00ff;
					int i_1071_ = (i_997_ & 0xff00) * i_1069_ & 0xff0000;
					i_997_ = (i_1070_ | i_1071_) >>> 8;
					for (int i_1072_ = -i_1002_; i_1072_ < 0; i_1072_++) {
						for (int i_1073_ = -i_1003_; i_1073_ < 0; i_1073_++) {
							int i_1074_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_1001_++]);
							int i_1075_ = i_1074_ >>> 24;
							int i_1076_ = 256 - i_1075_;
							i_1070_ = (i_1074_ & 0xff00ff) * i_1068_
									& ~0xff00ff;
							i_1071_ = (i_1074_ & 0xff00) * i_1068_ & 0xff0000;
							i_1074_ = ((i_1070_ | i_1071_) >>> 8) + i_997_;
							int i_1077_ = is[i_1000_];
							is[i_1000_++] = ((((i_1074_ & 0xff00ff) * i_1075_ + (i_1077_ & 0xff00ff)
									* i_1076_) & ~0xff00ff) + (((i_1074_ & 0xff00)
									* i_1075_ + (i_1077_ & 0xff00) * i_1076_) & 0xff0000)) >> 8;
						}
						i_1000_ += i_1004_;
						i_1001_ += i_1005_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_998_ == 2) {
				if (i_996_ == 1) {
					for (int i_1078_ = -i_1002_; i_1078_ < 0; i_1078_++) {
						for (int i_1079_ = -i_1003_; i_1079_ < 0; i_1079_++) {
							int i_1080_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_1001_++]);
							if (i_1080_ != 0) {
								int i_1081_ = is[i_1000_];
								int i_1082_ = i_1080_ + i_1081_;
								int i_1083_ = ((i_1080_ & 0xff00ff) + (i_1081_ & 0xff00ff));
								i_1081_ = ((i_1083_ & 0x1000100) + (i_1082_
										- i_1083_ & 0x10000));
								is[i_1000_++] = i_1082_ - i_1081_ | i_1081_
										- (i_1081_ >>> 8);
							} else
								i_1000_++;
						}
						i_1000_ += i_1004_;
						i_1001_ += i_1005_;
					}
					return;
				}
				if (i_996_ == 0) {
					int i_1084_ = (i_997_ & 0xff0000) >> 16;
					int i_1085_ = (i_997_ & 0xff00) >> 8;
					int i_1086_ = i_997_ & 0xff;
					for (int i_1087_ = -i_1002_; i_1087_ < 0; i_1087_++) {
						for (int i_1088_ = -i_1003_; i_1088_ < 0; i_1088_++) {
							int i_1089_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_1001_++]);
							if (i_1089_ != 0) {
								int i_1090_ = ((i_1089_ & 0xff0000) * i_1084_ & ~0xffffff);
								int i_1091_ = (i_1089_ & 0xff00) * i_1085_
										& 0xff0000;
								int i_1092_ = (i_1089_ & 0xff) * i_1086_
										& 0xff00;
								i_1089_ = (i_1090_ | i_1091_ | i_1092_) >>> 8;
								int i_1093_ = is[i_1000_];
								int i_1094_ = i_1089_ + i_1093_;
								int i_1095_ = ((i_1089_ & 0xff00ff) + (i_1093_ & 0xff00ff));
								i_1093_ = ((i_1095_ & 0x1000100) + (i_1094_
										- i_1095_ & 0x10000));
								is[i_1000_++] = i_1094_ - i_1093_ | i_1093_
										- (i_1093_ >>> 8);
							} else
								i_1000_++;
						}
						i_1000_ += i_1004_;
						i_1001_ += i_1005_;
					}
					return;
				}
				if (i_996_ == 3) {
					for (int i_1096_ = -i_1002_; i_1096_ < 0; i_1096_++) {
						for (int i_1097_ = -i_1003_; i_1097_ < 0; i_1097_++) {
							int i_1098_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_1001_++]);
							int i_1099_ = i_1098_ + i_997_;
							int i_1100_ = (i_1098_ & 0xff00ff)
									+ (i_997_ & 0xff00ff);
							int i_1101_ = ((i_1100_ & 0x1000100) + (i_1099_
									- i_1100_ & 0x10000));
							i_1098_ = i_1099_ - i_1101_ | i_1101_
									- (i_1101_ >>> 8);
							i_1101_ = is[i_1000_];
							i_1099_ = i_1098_ + i_1101_;
							i_1100_ = (i_1098_ & 0xff00ff)
									+ (i_1101_ & 0xff00ff);
							i_1101_ = (i_1100_ & 0x1000100)
									+ (i_1099_ - i_1100_ & 0x10000);
							is[i_1000_++] = i_1099_ - i_1101_ | i_1101_
									- (i_1101_ >>> 8);
						}
						i_1000_ += i_1004_;
						i_1001_ += i_1005_;
					}
					return;
				}
				if (i_996_ == 2) {
					int i_1102_ = i_997_ >>> 24;
					int i_1103_ = 256 - i_1102_;
					int i_1104_ = (i_997_ & 0xff00ff) * i_1103_ & ~0xff00ff;
					int i_1105_ = (i_997_ & 0xff00) * i_1103_ & 0xff0000;
					i_997_ = (i_1104_ | i_1105_) >>> 8;
					for (int i_1106_ = -i_1002_; i_1106_ < 0; i_1106_++) {
						for (int i_1107_ = -i_1003_; i_1107_ < 0; i_1107_++) {
							int i_1108_ = (((Class253_Sub3_Sub2) this).anIntArray8799[i_1001_++]);
							if (i_1108_ != 0) {
								i_1104_ = ((i_1108_ & 0xff00ff) * i_1102_ & ~0xff00ff);
								i_1105_ = (i_1108_ & 0xff00) * i_1102_
										& 0xff0000;
								i_1108_ = ((i_1104_ | i_1105_) >>> 8) + i_997_;
								int i_1109_ = is[i_1000_];
								int i_1110_ = i_1108_ + i_1109_;
								int i_1111_ = ((i_1108_ & 0xff00ff) + (i_1109_ & 0xff00ff));
								i_1109_ = ((i_1111_ & 0x1000100) + (i_1110_
										- i_1111_ & 0x10000));
								is[i_1000_++] = i_1110_ - i_1109_ | i_1109_
										- (i_1109_ >>> 8);
							} else
								i_1000_++;
						}
						i_1000_ += i_1004_;
						i_1001_ += i_1005_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}

	final void method1613(int i, int i_1112_, int i_1113_) {
		if (i_1113_ == 0) {
			int[] is = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anIntArray5214);
			for (int i_1114_ = 0; i_1114_ < ((Class253_Sub3) this).anInt7671; i_1114_++) {
				int i_1115_ = i_1114_ * ((Class253_Sub3) this).anInt7679;
				int i_1116_ = (((i_1112_ + i_1114_) * ((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5206) + i);
				for (int i_1117_ = 0; i_1117_ < ((Class253_Sub3) this).anInt7679; i_1117_++)
					((Class253_Sub3_Sub2) this).anIntArray8799[(i_1115_ + i_1117_)] = ((((Class253_Sub3_Sub2) this).anIntArray8799[i_1115_
							+ i_1117_]) & 0xffffff | is[i_1116_ + i_1117_] << 8
							& ~0xffffff);
			}
		} else if (i_1113_ == 1) {
			int[] is = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anIntArray5214);
			for (int i_1118_ = 0; i_1118_ < ((Class253_Sub3) this).anInt7671; i_1118_++) {
				int i_1119_ = i_1118_ * ((Class253_Sub3) this).anInt7679;
				int i_1120_ = (((i_1112_ + i_1118_) * ((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5206) + i);
				for (int i_1121_ = 0; i_1121_ < ((Class253_Sub3) this).anInt7679; i_1121_++)
					((Class253_Sub3_Sub2) this).anIntArray8799[(i_1119_ + i_1121_)] = ((((Class253_Sub3_Sub2) this).anIntArray8799[i_1119_
							+ i_1121_]) & 0xffffff | is[i_1120_ + i_1121_] << 16
							& ~0xffffff);
			}
		} else if (i_1113_ == 2) {
			int[] is = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anIntArray5214);
			for (int i_1122_ = 0; i_1122_ < ((Class253_Sub3) this).anInt7671; i_1122_++) {
				int i_1123_ = i_1122_ * ((Class253_Sub3) this).anInt7679;
				int i_1124_ = (((i_1112_ + i_1122_) * ((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5206) + i);
				for (int i_1125_ = 0; i_1125_ < ((Class253_Sub3) this).anInt7679; i_1125_++)
					((Class253_Sub3_Sub2) this).anIntArray8799[(i_1123_ + i_1125_)] = ((((Class253_Sub3_Sub2) this).anIntArray8799[i_1123_
							+ i_1125_]) & 0xffffff | is[i_1124_ + i_1125_] << 24
							& ~0xffffff);
			}
		} else if (i_1113_ == 3) {
			int[] is = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anIntArray5214);
			for (int i_1126_ = 0; i_1126_ < ((Class253_Sub3) this).anInt7671; i_1126_++) {
				int i_1127_ = i_1126_ * ((Class253_Sub3) this).anInt7679;
				int i_1128_ = (((i_1112_ + i_1126_) * ((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5206) + i);
				for (int i_1129_ = 0; i_1129_ < ((Class253_Sub3) this).anInt7679; i_1129_++)
					((Class253_Sub3_Sub2) this).anIntArray8799[(i_1127_ + i_1129_)] = ((((Class253_Sub3_Sub2) this).anIntArray8799[i_1127_
							+ i_1129_]) & 0xffffff | (is[i_1128_ + i_1129_] != 0 ? -16777216
							: 0));
			}
		}
	}

	final void method3109(int[] is, int[] is_1130_, int i, int i_1131_) {
		int[] is_1132_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anIntArray5214);
		if (Class253_Sub3.anInt7676 == 0) {
			if (Class253_Sub3.anInt7675 == 0) {
				int i_1133_ = Class253_Sub3.anInt7692;
				while (i_1133_ < 0) {
					int i_1134_ = i_1133_ + i_1131_;
					if (i_1134_ >= 0) {
						if (i_1134_ >= is.length)
							break;
						int i_1135_ = Class253_Sub3.anInt7695;
						int i_1136_ = Class253_Sub3.anInt7677;
						int i_1137_ = Class253_Sub3.anInt7694;
						int i_1138_ = Class253_Sub3.anInt7687;
						if (i_1136_ >= 0
								&& i_1137_ >= 0
								&& i_1136_
										- (((Class253_Sub3) this).anInt7679 << 12) < 0
								&& i_1137_
										- (((Class253_Sub3) this).anInt7671 << 12) < 0) {
							int i_1139_ = is[i_1134_] - i;
							int i_1140_ = -is_1130_[i_1134_];
							int i_1141_ = (i_1139_ - (i_1135_ - Class253_Sub3.anInt7695));
							if (i_1141_ > 0) {
								i_1135_ += i_1141_;
								i_1138_ += i_1141_;
								i_1136_ += Class253_Sub3.anInt7676 * i_1141_;
								i_1137_ += Class253_Sub3.anInt7675 * i_1141_;
							} else
								i_1140_ -= i_1141_;
							if (i_1138_ < i_1140_)
								i_1138_ = i_1140_;
							for (/**/; i_1138_ < 0; i_1138_++) {
								int i_1142_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(((i_1137_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_1136_ >> 12))]);
								int i_1143_ = i_1142_ >>> 24;
								int i_1144_ = 256 - i_1143_;
								int i_1145_ = is_1132_[i_1135_];
								is_1132_[i_1135_++] = ((((i_1142_ & 0xff00ff)
										* i_1143_ + (i_1145_ & 0xff00ff)
										* i_1144_) & ~0xff00ff) + (((i_1142_ & 0xff00)
										* i_1143_ + (i_1145_ & 0xff00)
										* i_1144_) & 0xff0000)) >> 8;
							}
						}
					}
					i_1133_++;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			} else if (Class253_Sub3.anInt7675 < 0) {
				int i_1146_ = Class253_Sub3.anInt7692;
				while (i_1146_ < 0) {
					int i_1147_ = i_1146_ + i_1131_;
					if (i_1147_ >= 0) {
						if (i_1147_ >= is.length)
							break;
						int i_1148_ = Class253_Sub3.anInt7695;
						int i_1149_ = Class253_Sub3.anInt7677;
						int i_1150_ = (Class253_Sub3.anInt7694 + Class253_Sub3.anInt7697);
						int i_1151_ = Class253_Sub3.anInt7687;
						if (i_1149_ >= 0
								&& i_1149_
										- (((Class253_Sub3) this).anInt7679 << 12) < 0) {
							int i_1152_;
							if ((i_1152_ = i_1150_
									- (((Class253_Sub3) this).anInt7671 << 12)) >= 0) {
								i_1152_ = ((Class253_Sub3.anInt7675 - i_1152_) / Class253_Sub3.anInt7675);
								i_1151_ += i_1152_;
								i_1150_ += Class253_Sub3.anInt7675 * i_1152_;
								i_1148_ += i_1152_;
							}
							if ((i_1152_ = ((i_1150_ - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_1151_)
								i_1151_ = i_1152_;
							int i_1153_ = is[i_1147_] - i;
							int i_1154_ = -is_1130_[i_1147_];
							int i_1155_ = (i_1153_ - (i_1148_ - Class253_Sub3.anInt7695));
							if (i_1155_ > 0) {
								i_1148_ += i_1155_;
								i_1151_ += i_1155_;
								i_1149_ += Class253_Sub3.anInt7676 * i_1155_;
								i_1150_ += Class253_Sub3.anInt7675 * i_1155_;
							} else
								i_1154_ -= i_1155_;
							if (i_1151_ < i_1154_)
								i_1151_ = i_1154_;
							for (/**/; i_1151_ < 0; i_1151_++) {
								int i_1156_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(((i_1150_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_1149_ >> 12))]);
								int i_1157_ = i_1156_ >>> 24;
								int i_1158_ = 256 - i_1157_;
								int i_1159_ = is_1132_[i_1148_];
								is_1132_[i_1148_++] = ((((i_1156_ & 0xff00ff)
										* i_1157_ + (i_1159_ & 0xff00ff)
										* i_1158_) & ~0xff00ff) + (((i_1156_ & 0xff00)
										* i_1157_ + (i_1159_ & 0xff00)
										* i_1158_) & 0xff0000)) >> 8;
								i_1150_ += Class253_Sub3.anInt7675;
							}
						}
					}
					i_1146_++;
					Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			} else {
				int i_1160_ = Class253_Sub3.anInt7692;
				while (i_1160_ < 0) {
					int i_1161_ = i_1160_ + i_1131_;
					if (i_1161_ >= 0) {
						if (i_1161_ >= is.length)
							break;
						int i_1162_ = Class253_Sub3.anInt7695;
						int i_1163_ = Class253_Sub3.anInt7677;
						int i_1164_ = (Class253_Sub3.anInt7694 + Class253_Sub3.anInt7697);
						int i_1165_ = Class253_Sub3.anInt7687;
						if (i_1163_ >= 0
								&& i_1163_
										- (((Class253_Sub3) this).anInt7679 << 12) < 0) {
							if (i_1164_ < 0) {
								int i_1166_ = ((Class253_Sub3.anInt7675 - 1 - i_1164_) / Class253_Sub3.anInt7675);
								i_1165_ += i_1166_;
								i_1164_ += Class253_Sub3.anInt7675 * i_1166_;
								i_1162_ += i_1166_;
							}
							int i_1167_;
							if ((i_1167_ = ((1 + i_1164_
									- (((Class253_Sub3) this).anInt7671 << 12) - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_1165_)
								i_1165_ = i_1167_;
							int i_1168_ = is[i_1161_] - i;
							int i_1169_ = -is_1130_[i_1161_];
							int i_1170_ = (i_1168_ - (i_1162_ - Class253_Sub3.anInt7695));
							if (i_1170_ > 0) {
								i_1162_ += i_1170_;
								i_1165_ += i_1170_;
								i_1163_ += Class253_Sub3.anInt7676 * i_1170_;
								i_1164_ += Class253_Sub3.anInt7675 * i_1170_;
							} else
								i_1169_ -= i_1170_;
							if (i_1165_ < i_1169_)
								i_1165_ = i_1169_;
							for (/**/; i_1165_ < 0; i_1165_++) {
								int i_1171_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(((i_1164_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_1163_ >> 12))]);
								int i_1172_ = i_1171_ >>> 24;
								int i_1173_ = 256 - i_1172_;
								int i_1174_ = is_1132_[i_1162_];
								is_1132_[i_1162_++] = ((((i_1171_ & 0xff00ff)
										* i_1172_ + (i_1174_ & 0xff00ff)
										* i_1173_) & ~0xff00ff) + (((i_1171_ & 0xff00)
										* i_1172_ + (i_1174_ & 0xff00)
										* i_1173_) & 0xff0000)) >> 8;
								i_1164_ += Class253_Sub3.anInt7675;
							}
						}
					}
					i_1160_++;
					Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			}
		} else if (Class253_Sub3.anInt7676 < 0) {
			if (Class253_Sub3.anInt7675 == 0) {
				int i_1175_ = Class253_Sub3.anInt7692;
				while (i_1175_ < 0) {
					int i_1176_ = i_1175_ + i_1131_;
					if (i_1176_ >= 0) {
						if (i_1176_ >= is.length)
							break;
						int i_1177_ = Class253_Sub3.anInt7695;
						int i_1178_ = (Class253_Sub3.anInt7677 + Class253_Sub3.anInt7686);
						int i_1179_ = Class253_Sub3.anInt7694;
						int i_1180_ = Class253_Sub3.anInt7687;
						if (i_1179_ >= 0
								&& i_1179_
										- (((Class253_Sub3) this).anInt7671 << 12) < 0) {
							int i_1181_;
							if ((i_1181_ = i_1178_
									- (((Class253_Sub3) this).anInt7679 << 12)) >= 0) {
								i_1181_ = ((Class253_Sub3.anInt7676 - i_1181_) / Class253_Sub3.anInt7676);
								i_1180_ += i_1181_;
								i_1178_ += Class253_Sub3.anInt7676 * i_1181_;
								i_1177_ += i_1181_;
							}
							if ((i_1181_ = ((i_1178_ - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_1180_)
								i_1180_ = i_1181_;
							int i_1182_ = is[i_1176_] - i;
							int i_1183_ = -is_1130_[i_1176_];
							int i_1184_ = (i_1182_ - (i_1177_ - Class253_Sub3.anInt7695));
							if (i_1184_ > 0) {
								i_1177_ += i_1184_;
								i_1180_ += i_1184_;
								i_1178_ += Class253_Sub3.anInt7676 * i_1184_;
								i_1179_ += Class253_Sub3.anInt7675 * i_1184_;
							} else
								i_1183_ -= i_1184_;
							if (i_1180_ < i_1183_)
								i_1180_ = i_1183_;
							for (/**/; i_1180_ < 0; i_1180_++) {
								int i_1185_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(((i_1179_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_1178_ >> 12))]);
								int i_1186_ = i_1185_ >>> 24;
								int i_1187_ = 256 - i_1186_;
								int i_1188_ = is_1132_[i_1177_];
								is_1132_[i_1177_++] = ((((i_1185_ & 0xff00ff)
										* i_1186_ + (i_1188_ & 0xff00ff)
										* i_1187_) & ~0xff00ff) + (((i_1185_ & 0xff00)
										* i_1186_ + (i_1188_ & 0xff00)
										* i_1187_) & 0xff0000)) >> 8;
								i_1178_ += Class253_Sub3.anInt7676;
							}
						}
					}
					i_1175_++;
					Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			} else if (Class253_Sub3.anInt7675 < 0) {
				int i_1189_ = Class253_Sub3.anInt7692;
				while (i_1189_ < 0) {
					int i_1190_ = i_1189_ + i_1131_;
					if (i_1190_ >= 0) {
						if (i_1190_ >= is.length)
							break;
						int i_1191_ = Class253_Sub3.anInt7695;
						int i_1192_ = (Class253_Sub3.anInt7677 + Class253_Sub3.anInt7686);
						int i_1193_ = (Class253_Sub3.anInt7694 + Class253_Sub3.anInt7697);
						int i_1194_ = Class253_Sub3.anInt7687;
						int i_1195_;
						if ((i_1195_ = i_1192_
								- (((Class253_Sub3) this).anInt7679 << 12)) >= 0) {
							i_1195_ = ((Class253_Sub3.anInt7676 - i_1195_) / Class253_Sub3.anInt7676);
							i_1194_ += i_1195_;
							i_1192_ += Class253_Sub3.anInt7676 * i_1195_;
							i_1193_ += Class253_Sub3.anInt7675 * i_1195_;
							i_1191_ += i_1195_;
						}
						if ((i_1195_ = ((i_1192_ - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_1194_)
							i_1194_ = i_1195_;
						if ((i_1195_ = i_1193_
								- (((Class253_Sub3) this).anInt7671 << 12)) >= 0) {
							i_1195_ = ((Class253_Sub3.anInt7675 - i_1195_) / Class253_Sub3.anInt7675);
							i_1194_ += i_1195_;
							i_1192_ += Class253_Sub3.anInt7676 * i_1195_;
							i_1193_ += Class253_Sub3.anInt7675 * i_1195_;
							i_1191_ += i_1195_;
						}
						if ((i_1195_ = ((i_1193_ - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_1194_)
							i_1194_ = i_1195_;
						int i_1196_ = is[i_1190_] - i;
						int i_1197_ = -is_1130_[i_1190_];
						int i_1198_ = i_1196_
								- (i_1191_ - Class253_Sub3.anInt7695);
						if (i_1198_ > 0) {
							i_1191_ += i_1198_;
							i_1194_ += i_1198_;
							i_1192_ += Class253_Sub3.anInt7676 * i_1198_;
							i_1193_ += Class253_Sub3.anInt7675 * i_1198_;
						} else
							i_1197_ -= i_1198_;
						if (i_1194_ < i_1197_)
							i_1194_ = i_1197_;
						for (/**/; i_1194_ < 0; i_1194_++) {
							int i_1199_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(((i_1193_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_1192_ >> 12))]);
							int i_1200_ = i_1199_ >>> 24;
							int i_1201_ = 256 - i_1200_;
							int i_1202_ = is_1132_[i_1191_];
							is_1132_[i_1191_++] = ((((i_1199_ & 0xff00ff)
									* i_1200_ + (i_1202_ & 0xff00ff) * i_1201_) & ~0xff00ff) + (((i_1199_ & 0xff00)
									* i_1200_ + (i_1202_ & 0xff00) * i_1201_) & 0xff0000)) >> 8;
							i_1192_ += Class253_Sub3.anInt7676;
							i_1193_ += Class253_Sub3.anInt7675;
						}
					}
					i_1189_++;
					Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
					Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			} else {
				int i_1203_ = Class253_Sub3.anInt7692;
				while (i_1203_ < 0) {
					int i_1204_ = i_1203_ + i_1131_;
					if (i_1204_ >= 0) {
						if (i_1204_ >= is.length)
							break;
						int i_1205_ = Class253_Sub3.anInt7695;
						int i_1206_ = (Class253_Sub3.anInt7677 + Class253_Sub3.anInt7686);
						int i_1207_ = (Class253_Sub3.anInt7694 + Class253_Sub3.anInt7697);
						int i_1208_ = Class253_Sub3.anInt7687;
						int i_1209_;
						if ((i_1209_ = i_1206_
								- (((Class253_Sub3) this).anInt7679 << 12)) >= 0) {
							i_1209_ = ((Class253_Sub3.anInt7676 - i_1209_) / Class253_Sub3.anInt7676);
							i_1208_ += i_1209_;
							i_1206_ += Class253_Sub3.anInt7676 * i_1209_;
							i_1207_ += Class253_Sub3.anInt7675 * i_1209_;
							i_1205_ += i_1209_;
						}
						if ((i_1209_ = ((i_1206_ - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_1208_)
							i_1208_ = i_1209_;
						if (i_1207_ < 0) {
							i_1209_ = ((Class253_Sub3.anInt7675 - 1 - i_1207_) / Class253_Sub3.anInt7675);
							i_1208_ += i_1209_;
							i_1206_ += Class253_Sub3.anInt7676 * i_1209_;
							i_1207_ += Class253_Sub3.anInt7675 * i_1209_;
							i_1205_ += i_1209_;
						}
						if ((i_1209_ = ((1 + i_1207_
								- (((Class253_Sub3) this).anInt7671 << 12) - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_1208_)
							i_1208_ = i_1209_;
						int i_1210_ = is[i_1204_] - i;
						int i_1211_ = -is_1130_[i_1204_];
						int i_1212_ = i_1210_
								- (i_1205_ - Class253_Sub3.anInt7695);
						if (i_1212_ > 0) {
							i_1205_ += i_1212_;
							i_1208_ += i_1212_;
							i_1206_ += Class253_Sub3.anInt7676 * i_1212_;
							i_1207_ += Class253_Sub3.anInt7675 * i_1212_;
						} else
							i_1211_ -= i_1212_;
						if (i_1208_ < i_1211_)
							i_1208_ = i_1211_;
						for (/**/; i_1208_ < 0; i_1208_++) {
							int i_1213_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(((i_1207_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_1206_ >> 12))]);
							int i_1214_ = i_1213_ >>> 24;
							int i_1215_ = 256 - i_1214_;
							int i_1216_ = is_1132_[i_1205_];
							is_1132_[i_1205_++] = ((((i_1213_ & 0xff00ff)
									* i_1214_ + (i_1216_ & 0xff00ff) * i_1215_) & ~0xff00ff) + (((i_1213_ & 0xff00)
									* i_1214_ + (i_1216_ & 0xff00) * i_1215_) & 0xff0000)) >> 8;
							i_1206_ += Class253_Sub3.anInt7676;
							i_1207_ += Class253_Sub3.anInt7675;
						}
					}
					i_1203_++;
					Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
					Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			}
		} else if (Class253_Sub3.anInt7675 == 0) {
			int i_1217_ = Class253_Sub3.anInt7692;
			while (i_1217_ < 0) {
				int i_1218_ = i_1217_ + i_1131_;
				if (i_1218_ >= 0) {
					if (i_1218_ >= is.length)
						break;
					int i_1219_ = Class253_Sub3.anInt7695;
					int i_1220_ = Class253_Sub3.anInt7677
							+ Class253_Sub3.anInt7686;
					int i_1221_ = Class253_Sub3.anInt7694;
					int i_1222_ = Class253_Sub3.anInt7687;
					if (i_1221_ >= 0
							&& (i_1221_
									- (((Class253_Sub3) this).anInt7671 << 12) < 0)) {
						if (i_1220_ < 0) {
							int i_1223_ = ((Class253_Sub3.anInt7676 - 1 - i_1220_) / Class253_Sub3.anInt7676);
							i_1222_ += i_1223_;
							i_1220_ += Class253_Sub3.anInt7676 * i_1223_;
							i_1219_ += i_1223_;
						}
						int i_1224_;
						if ((i_1224_ = ((1 + i_1220_
								- (((Class253_Sub3) this).anInt7679 << 12) - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_1222_)
							i_1222_ = i_1224_;
						int i_1225_ = is[i_1218_] - i;
						int i_1226_ = -is_1130_[i_1218_];
						int i_1227_ = i_1225_
								- (i_1219_ - Class253_Sub3.anInt7695);
						if (i_1227_ > 0) {
							i_1219_ += i_1227_;
							i_1222_ += i_1227_;
							i_1220_ += Class253_Sub3.anInt7676 * i_1227_;
							i_1221_ += Class253_Sub3.anInt7675 * i_1227_;
						} else
							i_1226_ -= i_1227_;
						if (i_1222_ < i_1226_)
							i_1222_ = i_1226_;
						for (/**/; i_1222_ < 0; i_1222_++) {
							int i_1228_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(((i_1221_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_1220_ >> 12))]);
							int i_1229_ = i_1228_ >>> 24;
							int i_1230_ = 256 - i_1229_;
							int i_1231_ = is_1132_[i_1219_];
							is_1132_[i_1219_++] = ((((i_1228_ & 0xff00ff)
									* i_1229_ + (i_1231_ & 0xff00ff) * i_1230_) & ~0xff00ff) + (((i_1228_ & 0xff00)
									* i_1229_ + (i_1231_ & 0xff00) * i_1230_) & 0xff0000)) >> 8;
							i_1220_ += Class253_Sub3.anInt7676;
						}
					}
				}
				i_1217_++;
				Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
				Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
				Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
			}
		} else if (Class253_Sub3.anInt7675 < 0) {
			int i_1232_ = Class253_Sub3.anInt7692;
			while (i_1232_ < 0) {
				int i_1233_ = i_1232_ + i_1131_;
				if (i_1233_ >= 0) {
					if (i_1233_ >= is.length)
						break;
					int i_1234_ = Class253_Sub3.anInt7695;
					int i_1235_ = Class253_Sub3.anInt7677
							+ Class253_Sub3.anInt7686;
					int i_1236_ = Class253_Sub3.anInt7694
							+ Class253_Sub3.anInt7697;
					int i_1237_ = Class253_Sub3.anInt7687;
					if (i_1235_ < 0) {
						int i_1238_ = ((Class253_Sub3.anInt7676 - 1 - i_1235_) / Class253_Sub3.anInt7676);
						i_1237_ += i_1238_;
						i_1235_ += Class253_Sub3.anInt7676 * i_1238_;
						i_1236_ += Class253_Sub3.anInt7675 * i_1238_;
						i_1234_ += i_1238_;
					}
					int i_1239_;
					if ((i_1239_ = ((1 + i_1235_
							- (((Class253_Sub3) this).anInt7679 << 12) - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_1237_)
						i_1237_ = i_1239_;
					if ((i_1239_ = i_1236_
							- (((Class253_Sub3) this).anInt7671 << 12)) >= 0) {
						i_1239_ = ((Class253_Sub3.anInt7675 - i_1239_) / Class253_Sub3.anInt7675);
						i_1237_ += i_1239_;
						i_1235_ += Class253_Sub3.anInt7676 * i_1239_;
						i_1236_ += Class253_Sub3.anInt7675 * i_1239_;
						i_1234_ += i_1239_;
					}
					if ((i_1239_ = ((i_1236_ - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_1237_)
						i_1237_ = i_1239_;
					int i_1240_ = is[i_1233_] - i;
					int i_1241_ = -is_1130_[i_1233_];
					int i_1242_ = i_1240_ - (i_1234_ - Class253_Sub3.anInt7695);
					if (i_1242_ > 0) {
						i_1234_ += i_1242_;
						i_1237_ += i_1242_;
						i_1235_ += Class253_Sub3.anInt7676 * i_1242_;
						i_1236_ += Class253_Sub3.anInt7675 * i_1242_;
					} else
						i_1241_ -= i_1242_;
					if (i_1237_ < i_1241_)
						i_1237_ = i_1241_;
					for (/**/; i_1237_ < 0; i_1237_++) {
						int i_1243_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(((i_1236_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_1235_ >> 12))]);
						int i_1244_ = i_1243_ >>> 24;
						int i_1245_ = 256 - i_1244_;
						int i_1246_ = is_1132_[i_1234_];
						is_1132_[i_1234_++] = ((((i_1243_ & 0xff00ff) * i_1244_ + (i_1246_ & 0xff00ff)
								* i_1245_) & ~0xff00ff) + (((i_1243_ & 0xff00)
								* i_1244_ + (i_1246_ & 0xff00) * i_1245_) & 0xff0000)) >> 8;
						i_1235_ += Class253_Sub3.anInt7676;
						i_1236_ += Class253_Sub3.anInt7675;
					}
				}
				i_1232_++;
				Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
				Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
				Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
			}
		} else {
			int i_1247_ = Class253_Sub3.anInt7692;
			while (i_1247_ < 0) {
				int i_1248_ = i_1247_ + i_1131_;
				if (i_1248_ >= 0) {
					if (i_1248_ >= is.length)
						break;
					int i_1249_ = Class253_Sub3.anInt7695;
					int i_1250_ = Class253_Sub3.anInt7677
							+ Class253_Sub3.anInt7686;
					int i_1251_ = Class253_Sub3.anInt7694
							+ Class253_Sub3.anInt7697;
					int i_1252_ = Class253_Sub3.anInt7687;
					if (i_1250_ < 0) {
						int i_1253_ = ((Class253_Sub3.anInt7676 - 1 - i_1250_) / Class253_Sub3.anInt7676);
						i_1252_ += i_1253_;
						i_1250_ += Class253_Sub3.anInt7676 * i_1253_;
						i_1251_ += Class253_Sub3.anInt7675 * i_1253_;
						i_1249_ += i_1253_;
					}
					int i_1254_;
					if ((i_1254_ = ((1 + i_1250_
							- (((Class253_Sub3) this).anInt7679 << 12) - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_1252_)
						i_1252_ = i_1254_;
					if (i_1251_ < 0) {
						i_1254_ = ((Class253_Sub3.anInt7675 - 1 - i_1251_) / Class253_Sub3.anInt7675);
						i_1252_ += i_1254_;
						i_1250_ += Class253_Sub3.anInt7676 * i_1254_;
						i_1251_ += Class253_Sub3.anInt7675 * i_1254_;
						i_1249_ += i_1254_;
					}
					if ((i_1254_ = ((1 + i_1251_
							- (((Class253_Sub3) this).anInt7671 << 12) - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_1252_)
						i_1252_ = i_1254_;
					int i_1255_ = is[i_1248_] - i;
					int i_1256_ = -is_1130_[i_1248_];
					int i_1257_ = i_1255_ - (i_1249_ - Class253_Sub3.anInt7695);
					if (i_1257_ > 0) {
						i_1249_ += i_1257_;
						i_1252_ += i_1257_;
						i_1250_ += Class253_Sub3.anInt7676 * i_1257_;
						i_1251_ += Class253_Sub3.anInt7675 * i_1257_;
					} else
						i_1256_ -= i_1257_;
					if (i_1252_ < i_1256_)
						i_1252_ = i_1256_;
					for (/**/; i_1252_ < 0; i_1252_++) {
						int i_1258_ = (((Class253_Sub3_Sub2) this).anIntArray8799[(((i_1251_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_1250_ >> 12))]);
						int i_1259_ = i_1258_ >>> 24;
						int i_1260_ = 256 - i_1259_;
						int i_1261_ = is_1132_[i_1249_];
						is_1132_[i_1249_++] = ((((i_1258_ & 0xff00ff) * i_1259_ + (i_1261_ & 0xff00ff)
								* i_1260_) & ~0xff00ff) + (((i_1258_ & 0xff00)
								* i_1259_ + (i_1261_ & 0xff00) * i_1260_) & 0xff0000)) >> 8;
						i_1250_ += Class253_Sub3.anInt7676;
						i_1251_ += Class253_Sub3.anInt7675;
					}
				}
				i_1247_++;
				Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
				Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
				Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
			}
		}
	}

	final void method1611(int i, int i_1262_, int i_1263_, int i_1264_,
			int i_1265_, int i_1266_) {
		int[] is = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anIntArray5214);
		for (int i_1267_ = 0; i_1267_ < i_1264_; i_1267_++) {
			int i_1268_ = (i_1262_ + i_1267_) * i_1263_ + i;
			int i_1269_ = (i_1266_ + i_1267_) * i_1263_ + i_1265_;
			for (int i_1270_ = 0; i_1270_ < i_1263_; i_1270_++)
				((Class253_Sub3_Sub2) this).anIntArray8799[i_1268_ + i_1270_] = is[i_1269_
						+ i_1270_] & 0xffffff;
		}
	}

	Class253_Sub3_Sub2(Class163_Sub1 class163_sub1, int i, int i_1271_) {
		super(class163_sub1, i, i_1271_);
		((Class253_Sub3_Sub2) this).anIntArray8799 = new int[i * i_1271_];
	}
}
