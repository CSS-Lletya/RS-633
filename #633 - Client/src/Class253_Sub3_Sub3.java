/* Class253_Sub3_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class253_Sub3_Sub3 extends Class253_Sub3 {
	int[] anIntArray9002;

	Class253_Sub3_Sub3(Class163_Sub1 class163_sub1, int i, int i_0_) {
		super(class163_sub1, i, i_0_);
		((Class253_Sub3_Sub3) this).anIntArray9002 = new int[i * i_0_];
	}

	final void method1611(int i, int i_1_, int i_2_, int i_3_, int i_4_,
			int i_5_) {
		int[] is = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anIntArray5214);
		for (int i_6_ = 0; i_6_ < i_3_; i_6_++) {
			int i_7_ = (i_1_ + i_6_) * ((Class253_Sub3) this).anInt7679 + i;
			int i_8_ = ((i_5_ + i_6_)
					* (((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5206) + i_4_);
			for (int i_9_ = 0; i_9_ < i_2_; i_9_++)
				((Class253_Sub3_Sub3) this).anIntArray9002[i_7_ + i_9_] = is[i_8_
						+ i_9_];
		}
	}

	final void method1613(int i, int i_10_, int i_11_) {
		throw new IllegalStateException(
				"Can't capture alpha into a java_sprite_24");
	}

	Class253_Sub3_Sub3(Class163_Sub1 class163_sub1, int[] is, int i, int i_12_) {
		super(class163_sub1, i, i_12_);
		((Class253_Sub3_Sub3) this).anIntArray9002 = is;
	}

	final void method1626(int i, int i_13_, int i_14_, int i_15_, int i_16_,
			int i_17_, int i_18_, int i_19_) {
		if (((Class253_Sub3) this).aClass163_Sub1_7698.method2293())
			throw new IllegalStateException();
		if (i_14_ > 0 && i_15_ > 0) {
			int i_20_ = 0;
			int i_21_ = 0;
			int i_22_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5206);
			int i_23_ = (((Class253_Sub3) this).anInt7689
					+ ((Class253_Sub3) this).anInt7679 + ((Class253_Sub3) this).anInt7681);
			int i_24_ = (((Class253_Sub3) this).anInt7691
					+ ((Class253_Sub3) this).anInt7671 + ((Class253_Sub3) this).anInt7667);
			int i_25_ = (i_23_ << 16) / i_14_;
			int i_26_ = (i_24_ << 16) / i_15_;
			if (((Class253_Sub3) this).anInt7689 > 0) {
				int i_27_ = (((((Class253_Sub3) this).anInt7689 << 16) + i_25_ - 1) / i_25_);
				i += i_27_;
				i_20_ += i_27_ * i_25_
						- (((Class253_Sub3) this).anInt7689 << 16);
			}
			if (((Class253_Sub3) this).anInt7691 > 0) {
				int i_28_ = (((((Class253_Sub3) this).anInt7691 << 16) + i_26_ - 1) / i_26_);
				i_13_ += i_28_;
				i_21_ += i_28_ * i_26_
						- (((Class253_Sub3) this).anInt7691 << 16);
			}
			if (((Class253_Sub3) this).anInt7679 < i_23_)
				i_14_ = ((((Class253_Sub3) this).anInt7679 << 16) - i_20_
						+ i_25_ - 1)
						/ i_25_;
			if (((Class253_Sub3) this).anInt7671 < i_24_)
				i_15_ = ((((Class253_Sub3) this).anInt7671 << 16) - i_21_
						+ i_26_ - 1)
						/ i_26_;
			int i_29_ = i + i_13_ * i_22_;
			int i_30_ = i_22_ - i_14_;
			if (i_13_ + i_15_ > (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5193))
				i_15_ -= i_13_
						+ i_15_
						- ((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5193;
			if (i_13_ < (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177)) {
				int i_31_ = (((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5177 - i_13_);
				i_15_ -= i_31_;
				i_29_ += i_31_ * i_22_;
				i_21_ += i_26_ * i_31_;
			}
			if (i + i_14_ > (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5178)) {
				int i_32_ = (i + i_14_ - ((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5178);
				i_14_ -= i_32_;
				i_30_ += i_32_;
			}
			if (i < (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186)) {
				int i_33_ = (((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5186 - i);
				i_14_ -= i_33_;
				i_29_ += i_33_;
				i_20_ += i_25_ * i_33_;
				i_30_ += i_33_;
			}
			int[] is = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anIntArray5214);
			if (i_18_ == 0) {
				if (i_16_ == 1) {
					int i_34_ = i_20_;
					for (int i_35_ = -i_15_; i_35_ < 0; i_35_++) {
						int i_36_ = (i_21_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_37_ = -i_14_; i_37_ < 0; i_37_++) {
							is[i_29_++] = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_20_ >> 16)
									+ i_36_]);
							i_20_ += i_25_;
						}
						i_21_ += i_26_;
						i_20_ = i_34_;
						i_29_ += i_30_;
					}
					return;
				}
				if (i_16_ == 0) {
					int i_38_ = (i_17_ & 0xff0000) >> 16;
					int i_39_ = (i_17_ & 0xff00) >> 8;
					int i_40_ = i_17_ & 0xff;
					int i_41_ = i_20_;
					for (int i_42_ = -i_15_; i_42_ < 0; i_42_++) {
						int i_43_ = (i_21_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_44_ = -i_14_; i_44_ < 0; i_44_++) {
							int i_45_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_20_ >> 16)
									+ i_43_]);
							int i_46_ = (i_45_ & 0xff0000) * i_38_ & ~0xffffff;
							int i_47_ = (i_45_ & 0xff00) * i_39_ & 0xff0000;
							int i_48_ = (i_45_ & 0xff) * i_40_ & 0xff00;
							is[i_29_++] = (i_46_ | i_47_ | i_48_) >>> 8;
							i_20_ += i_25_;
						}
						i_21_ += i_26_;
						i_20_ = i_41_;
						i_29_ += i_30_;
					}
					return;
				}
				if (i_16_ == 3) {
					int i_49_ = i_20_;
					for (int i_50_ = -i_15_; i_50_ < 0; i_50_++) {
						int i_51_ = (i_21_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_52_ = -i_14_; i_52_ < 0; i_52_++) {
							int i_53_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_20_ >> 16)
									+ i_51_]);
							int i_54_ = i_53_ + i_17_;
							int i_55_ = (i_53_ & 0xff00ff) + (i_17_ & 0xff00ff);
							int i_56_ = ((i_55_ & 0x1000100) + (i_54_ - i_55_ & 0x10000));
							is[i_29_++] = i_54_ - i_56_ | i_56_ - (i_56_ >>> 8);
							i_20_ += i_25_;
						}
						i_21_ += i_26_;
						i_20_ = i_49_;
						i_29_ += i_30_;
					}
					return;
				}
				if (i_16_ == 2) {
					int i_57_ = i_17_ >>> 24;
					int i_58_ = 256 - i_57_;
					int i_59_ = (i_17_ & 0xff00ff) * i_58_ & ~0xff00ff;
					int i_60_ = (i_17_ & 0xff00) * i_58_ & 0xff0000;
					i_17_ = (i_59_ | i_60_) >>> 8;
					int i_61_ = i_20_;
					for (int i_62_ = -i_15_; i_62_ < 0; i_62_++) {
						int i_63_ = (i_21_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_64_ = -i_14_; i_64_ < 0; i_64_++) {
							int i_65_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_20_ >> 16)
									+ i_63_]);
							i_59_ = (i_65_ & 0xff00ff) * i_57_ & ~0xff00ff;
							i_60_ = (i_65_ & 0xff00) * i_57_ & 0xff0000;
							is[i_29_++] = ((i_59_ | i_60_) >>> 8) + i_17_;
							i_20_ += i_25_;
						}
						i_21_ += i_26_;
						i_20_ = i_61_;
						i_29_ += i_30_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_18_ == 1) {
				if (i_16_ == 1) {
					int i_66_ = i_20_;
					for (int i_67_ = -i_15_; i_67_ < 0; i_67_++) {
						int i_68_ = (i_21_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_69_ = -i_14_; i_69_ < 0; i_69_++) {
							int i_70_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_20_ >> 16)
									+ i_68_]);
							if (i_70_ != 0)
								is[i_29_++] = i_70_;
							else
								i_29_++;
							i_20_ += i_25_;
						}
						i_21_ += i_26_;
						i_20_ = i_66_;
						i_29_ += i_30_;
					}
					return;
				}
				if (i_16_ == 0) {
					int i_71_ = i_20_;
					if ((i_17_ & 0xffffff) == 16777215) {
						int i_72_ = i_17_ >>> 24;
						int i_73_ = 256 - i_72_;
						for (int i_74_ = -i_15_; i_74_ < 0; i_74_++) {
							int i_75_ = ((i_21_ >> 16) * ((Class253_Sub3) this).anInt7679);
							for (int i_76_ = -i_14_; i_76_ < 0; i_76_++) {
								int i_77_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_20_ >> 16)
										+ i_75_]);
								if (i_77_ != 0) {
									int i_78_ = is[i_29_];
									is[i_29_++] = ((((i_77_ & 0xff00ff) * i_72_ + (i_78_ & 0xff00ff)
											* i_73_) & ~0xff00ff) + (((i_77_ & 0xff00)
											* i_72_ + (i_78_ & 0xff00) * i_73_) & 0xff0000)) >> 8;
								} else
									i_29_++;
								i_20_ += i_25_;
							}
							i_21_ += i_26_;
							i_20_ = i_71_;
							i_29_ += i_30_;
						}
					} else {
						int i_79_ = (i_17_ & 0xff0000) >> 16;
						int i_80_ = (i_17_ & 0xff00) >> 8;
						int i_81_ = i_17_ & 0xff;
						int i_82_ = i_17_ >>> 24;
						int i_83_ = 256 - i_82_;
						for (int i_84_ = -i_15_; i_84_ < 0; i_84_++) {
							int i_85_ = ((i_21_ >> 16) * ((Class253_Sub3) this).anInt7679);
							for (int i_86_ = -i_14_; i_86_ < 0; i_86_++) {
								int i_87_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_20_ >> 16)
										+ i_85_]);
								if (i_87_ != 0) {
									if (i_82_ != 255) {
										int i_88_ = ((i_87_ & 0xff0000) * i_79_ & ~0xffffff);
										int i_89_ = ((i_87_ & 0xff00) * i_80_ & 0xff0000);
										int i_90_ = (i_87_ & 0xff) * i_81_
												& 0xff00;
										i_87_ = (i_88_ | i_89_ | i_90_) >>> 8;
										int i_91_ = is[i_29_];
										is[i_29_++] = ((((i_87_ & 0xff00ff)
												* i_82_ + (i_91_ & 0xff00ff)
												* i_83_) & ~0xff00ff) + (((i_87_ & 0xff00)
												* i_82_ + (i_91_ & 0xff00)
												* i_83_) & 0xff0000)) >> 8;
									} else {
										int i_92_ = ((i_87_ & 0xff0000) * i_79_ & ~0xffffff);
										int i_93_ = ((i_87_ & 0xff00) * i_80_ & 0xff0000);
										int i_94_ = (i_87_ & 0xff) * i_81_
												& 0xff00;
										is[i_29_++] = (i_92_ | i_93_ | i_94_) >>> 8;
									}
								} else
									i_29_++;
								i_20_ += i_25_;
							}
							i_21_ += i_26_;
							i_20_ = i_71_;
							i_29_ += i_30_;
						}
						return;
					}
					return;
				}
				if (i_16_ == 3) {
					int i_95_ = i_20_;
					int i_96_ = i_17_ >>> 24;
					int i_97_ = 256 - i_96_;
					for (int i_98_ = -i_15_; i_98_ < 0; i_98_++) {
						int i_99_ = (i_21_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_100_ = -i_14_; i_100_ < 0; i_100_++) {
							int i_101_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_20_ >> 16)
									+ i_99_]);
							int i_102_ = i_101_ + i_17_;
							int i_103_ = (i_101_ & 0xff00ff)
									+ (i_17_ & 0xff00ff);
							int i_104_ = ((i_103_ & 0x1000100) + (i_102_
									- i_103_ & 0x10000));
							i_104_ = i_102_ - i_104_ | i_104_ - (i_104_ >>> 8);
							if (i_101_ == 0 && i_96_ != 255) {
								i_101_ = i_104_;
								i_104_ = is[i_29_];
								i_104_ = ((((i_101_ & 0xff00ff) * i_96_ + (i_104_ & 0xff00ff)
										* i_97_) & ~0xff00ff) + (((i_101_ & 0xff00)
										* i_96_ + (i_104_ & 0xff00) * i_97_) & 0xff0000)) >> 8;
							}
							is[i_29_++] = i_104_;
							i_20_ += i_25_;
						}
						i_21_ += i_26_;
						i_20_ = i_95_;
						i_29_ += i_30_;
					}
					return;
				}
				if (i_16_ == 2) {
					int i_105_ = i_17_ >>> 24;
					int i_106_ = 256 - i_105_;
					int i_107_ = (i_17_ & 0xff00ff) * i_106_ & ~0xff00ff;
					int i_108_ = (i_17_ & 0xff00) * i_106_ & 0xff0000;
					i_17_ = (i_107_ | i_108_) >>> 8;
					int i_109_ = i_20_;
					for (int i_110_ = -i_15_; i_110_ < 0; i_110_++) {
						int i_111_ = (i_21_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_112_ = -i_14_; i_112_ < 0; i_112_++) {
							int i_113_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_20_ >> 16)
									+ i_111_]);
							if (i_113_ != 0) {
								i_107_ = (i_113_ & 0xff00ff) * i_105_
										& ~0xff00ff;
								i_108_ = (i_113_ & 0xff00) * i_105_ & 0xff0000;
								is[i_29_++] = ((i_107_ | i_108_) >>> 8) + i_17_;
							} else
								i_29_++;
							i_20_ += i_25_;
						}
						i_21_ += i_26_;
						i_20_ = i_109_;
						i_29_ += i_30_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_18_ == 2) {
				if (i_16_ == 1) {
					int i_114_ = i_20_;
					for (int i_115_ = -i_15_; i_115_ < 0; i_115_++) {
						int i_116_ = (i_21_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_117_ = -i_14_; i_117_ < 0; i_117_++) {
							int i_118_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_20_ >> 16)
									+ i_116_]);
							if (i_118_ != 0) {
								int i_119_ = is[i_29_];
								int i_120_ = i_118_ + i_119_;
								int i_121_ = ((i_118_ & 0xff00ff) + (i_119_ & 0xff00ff));
								i_119_ = (i_121_ & 0x1000100)
										+ (i_120_ - i_121_ & 0x10000);
								is[i_29_++] = i_120_ - i_119_ | i_119_
										- (i_119_ >>> 8);
							} else
								i_29_++;
							i_20_ += i_25_;
						}
						i_21_ += i_26_;
						i_20_ = i_114_;
						i_29_ += i_30_;
					}
					return;
				}
				if (i_16_ == 0) {
					int i_122_ = i_20_;
					int i_123_ = (i_17_ & 0xff0000) >> 16;
					int i_124_ = (i_17_ & 0xff00) >> 8;
					int i_125_ = i_17_ & 0xff;
					for (int i_126_ = -i_15_; i_126_ < 0; i_126_++) {
						int i_127_ = (i_21_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_128_ = -i_14_; i_128_ < 0; i_128_++) {
							int i_129_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_20_ >> 16)
									+ i_127_]);
							if (i_129_ != 0) {
								int i_130_ = (i_129_ & 0xff0000) * i_123_
										& ~0xffffff;
								int i_131_ = (i_129_ & 0xff00) * i_124_
										& 0xff0000;
								int i_132_ = (i_129_ & 0xff) * i_125_ & 0xff00;
								i_129_ = (i_130_ | i_131_ | i_132_) >>> 8;
								int i_133_ = is[i_29_];
								int i_134_ = i_129_ + i_133_;
								int i_135_ = ((i_129_ & 0xff00ff) + (i_133_ & 0xff00ff));
								i_133_ = (i_135_ & 0x1000100)
										+ (i_134_ - i_135_ & 0x10000);
								is[i_29_++] = i_134_ - i_133_ | i_133_
										- (i_133_ >>> 8);
							} else
								i_29_++;
							i_20_ += i_25_;
						}
						i_21_ += i_26_;
						i_20_ = i_122_;
						i_29_ += i_30_;
					}
					return;
				}
				if (i_16_ == 3) {
					int i_136_ = i_20_;
					for (int i_137_ = -i_15_; i_137_ < 0; i_137_++) {
						int i_138_ = (i_21_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_139_ = -i_14_; i_139_ < 0; i_139_++) {
							int i_140_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_20_ >> 16)
									+ i_138_]);
							int i_141_ = i_140_ + i_17_;
							int i_142_ = (i_140_ & 0xff00ff)
									+ (i_17_ & 0xff00ff);
							int i_143_ = ((i_142_ & 0x1000100) + (i_141_
									- i_142_ & 0x10000));
							i_140_ = i_141_ - i_143_ | i_143_ - (i_143_ >>> 8);
							i_143_ = is[i_29_];
							i_141_ = i_140_ + i_143_;
							i_142_ = (i_140_ & 0xff00ff) + (i_143_ & 0xff00ff);
							i_143_ = (i_142_ & 0x1000100)
									+ (i_141_ - i_142_ & 0x10000);
							is[i_29_++] = i_141_ - i_143_ | i_143_
									- (i_143_ >>> 8);
							i_20_ += i_25_;
						}
						i_21_ += i_26_;
						i_20_ = i_136_;
						i_29_ += i_30_;
					}
					return;
				}
				if (i_16_ == 2) {
					int i_144_ = i_17_ >>> 24;
					int i_145_ = 256 - i_144_;
					int i_146_ = (i_17_ & 0xff00ff) * i_145_ & ~0xff00ff;
					int i_147_ = (i_17_ & 0xff00) * i_145_ & 0xff0000;
					i_17_ = (i_146_ | i_147_) >>> 8;
					int i_148_ = i_20_;
					for (int i_149_ = -i_15_; i_149_ < 0; i_149_++) {
						int i_150_ = (i_21_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_151_ = -i_14_; i_151_ < 0; i_151_++) {
							int i_152_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_20_ >> 16)
									+ i_150_]);
							if (i_152_ != 0) {
								i_146_ = (i_152_ & 0xff00ff) * i_144_
										& ~0xff00ff;
								i_147_ = (i_152_ & 0xff00) * i_144_ & 0xff0000;
								i_152_ = ((i_146_ | i_147_) >>> 8) + i_17_;
								int i_153_ = is[i_29_];
								int i_154_ = i_152_ + i_153_;
								int i_155_ = ((i_152_ & 0xff00ff) + (i_153_ & 0xff00ff));
								i_153_ = (i_155_ & 0x1000100)
										+ (i_154_ - i_155_ & 0x10000);
								is[i_29_++] = i_154_ - i_153_ | i_153_
										- (i_153_ >>> 8);
							} else
								i_29_++;
							i_20_ += i_25_;
						}
						i_21_ += i_26_;
						i_20_ = i_148_;
						i_29_ += i_30_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}

	final void method3109(int[] is, int[] is_156_, int i, int i_157_) {
		int[] is_158_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anIntArray5214);
		if (Class253_Sub3.anInt7676 == 0) {
			if (Class253_Sub3.anInt7675 == 0) {
				int i_159_ = Class253_Sub3.anInt7692;
				while (i_159_ < 0) {
					int i_160_ = i_159_ + i_157_;
					if (i_160_ >= 0) {
						if (i_160_ >= is.length)
							break;
						int i_161_ = Class253_Sub3.anInt7695;
						int i_162_ = Class253_Sub3.anInt7677;
						int i_163_ = Class253_Sub3.anInt7694;
						int i_164_ = Class253_Sub3.anInt7687;
						if (i_162_ >= 0
								&& i_163_ >= 0
								&& i_162_
										- (((Class253_Sub3) this).anInt7679 << 12) < 0
								&& i_163_
										- (((Class253_Sub3) this).anInt7671 << 12) < 0) {
							int i_165_ = is[i_160_] - i;
							int i_166_ = -is_156_[i_160_];
							int i_167_ = i_165_
									- (i_161_ - Class253_Sub3.anInt7695);
							if (i_167_ > 0) {
								i_161_ += i_167_;
								i_164_ += i_167_;
								i_162_ += Class253_Sub3.anInt7676 * i_167_;
								i_163_ += Class253_Sub3.anInt7675 * i_167_;
							} else
								i_166_ -= i_167_;
							if (i_164_ < i_166_)
								i_164_ = i_166_;
							for (/**/; i_164_ < 0; i_164_++) {
								int i_168_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(((i_163_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_162_ >> 12))]);
								if (i_168_ != 0)
									is_158_[i_161_++] = i_168_;
								else
									i_161_++;
							}
						}
					}
					i_159_++;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			} else if (Class253_Sub3.anInt7675 < 0) {
				int i_169_ = Class253_Sub3.anInt7692;
				while (i_169_ < 0) {
					int i_170_ = i_169_ + i_157_;
					if (i_170_ >= 0) {
						if (i_170_ >= is.length)
							break;
						int i_171_ = Class253_Sub3.anInt7695;
						int i_172_ = Class253_Sub3.anInt7677;
						int i_173_ = (Class253_Sub3.anInt7694 + Class253_Sub3.anInt7697);
						int i_174_ = Class253_Sub3.anInt7687;
						if (i_172_ >= 0
								&& i_172_
										- (((Class253_Sub3) this).anInt7679 << 12) < 0) {
							int i_175_;
							if ((i_175_ = i_173_
									- (((Class253_Sub3) this).anInt7671 << 12)) >= 0) {
								i_175_ = ((Class253_Sub3.anInt7675 - i_175_) / Class253_Sub3.anInt7675);
								i_174_ += i_175_;
								i_173_ += Class253_Sub3.anInt7675 * i_175_;
								i_171_ += i_175_;
							}
							if ((i_175_ = ((i_173_ - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_174_)
								i_174_ = i_175_;
							int i_176_ = is[i_170_] - i;
							int i_177_ = -is_156_[i_170_];
							int i_178_ = i_176_
									- (i_171_ - Class253_Sub3.anInt7695);
							if (i_178_ > 0) {
								i_171_ += i_178_;
								i_174_ += i_178_;
								i_172_ += Class253_Sub3.anInt7676 * i_178_;
								i_173_ += Class253_Sub3.anInt7675 * i_178_;
							} else
								i_177_ -= i_178_;
							if (i_174_ < i_177_)
								i_174_ = i_177_;
							for (/**/; i_174_ < 0; i_174_++) {
								int i_179_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(((i_173_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_172_ >> 12))]);
								if (i_179_ != 0)
									is_158_[i_171_++] = i_179_;
								else
									i_171_++;
								i_173_ += Class253_Sub3.anInt7675;
							}
						}
					}
					i_169_++;
					Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			} else {
				int i_180_ = Class253_Sub3.anInt7692;
				while (i_180_ < 0) {
					int i_181_ = i_180_ + i_157_;
					if (i_181_ >= 0) {
						if (i_181_ >= is.length)
							break;
						int i_182_ = Class253_Sub3.anInt7695;
						int i_183_ = Class253_Sub3.anInt7677;
						int i_184_ = (Class253_Sub3.anInt7694 + Class253_Sub3.anInt7697);
						int i_185_ = Class253_Sub3.anInt7687;
						if (i_183_ >= 0
								&& i_183_
										- (((Class253_Sub3) this).anInt7679 << 12) < 0) {
							if (i_184_ < 0) {
								int i_186_ = ((Class253_Sub3.anInt7675 - 1 - i_184_) / Class253_Sub3.anInt7675);
								i_185_ += i_186_;
								i_184_ += Class253_Sub3.anInt7675 * i_186_;
								i_182_ += i_186_;
							}
							int i_187_;
							if ((i_187_ = ((1 + i_184_
									- (((Class253_Sub3) this).anInt7671 << 12) - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_185_)
								i_185_ = i_187_;
							int i_188_ = is[i_181_] - i;
							int i_189_ = -is_156_[i_181_];
							int i_190_ = i_188_
									- (i_182_ - Class253_Sub3.anInt7695);
							if (i_190_ > 0) {
								i_182_ += i_190_;
								i_185_ += i_190_;
								i_183_ += Class253_Sub3.anInt7676 * i_190_;
								i_184_ += Class253_Sub3.anInt7675 * i_190_;
							} else
								i_189_ -= i_190_;
							if (i_185_ < i_189_)
								i_185_ = i_189_;
							for (/**/; i_185_ < 0; i_185_++) {
								int i_191_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(((i_184_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_183_ >> 12))]);
								if (i_191_ != 0)
									is_158_[i_182_++] = i_191_;
								else
									i_182_++;
								i_184_ += Class253_Sub3.anInt7675;
							}
						}
					}
					i_180_++;
					Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			}
		} else if (Class253_Sub3.anInt7676 < 0) {
			if (Class253_Sub3.anInt7675 == 0) {
				int i_192_ = Class253_Sub3.anInt7692;
				while (i_192_ < 0) {
					int i_193_ = i_192_ + i_157_;
					if (i_193_ >= 0) {
						if (i_193_ >= is.length)
							break;
						int i_194_ = Class253_Sub3.anInt7695;
						int i_195_ = (Class253_Sub3.anInt7677 + Class253_Sub3.anInt7686);
						int i_196_ = Class253_Sub3.anInt7694;
						int i_197_ = Class253_Sub3.anInt7687;
						if (i_196_ >= 0
								&& i_196_
										- (((Class253_Sub3) this).anInt7671 << 12) < 0) {
							int i_198_;
							if ((i_198_ = i_195_
									- (((Class253_Sub3) this).anInt7679 << 12)) >= 0) {
								i_198_ = ((Class253_Sub3.anInt7676 - i_198_) / Class253_Sub3.anInt7676);
								i_197_ += i_198_;
								i_195_ += Class253_Sub3.anInt7676 * i_198_;
								i_194_ += i_198_;
							}
							if ((i_198_ = ((i_195_ - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_197_)
								i_197_ = i_198_;
							int i_199_ = is[i_193_] - i;
							int i_200_ = -is_156_[i_193_];
							int i_201_ = i_199_
									- (i_194_ - Class253_Sub3.anInt7695);
							if (i_201_ > 0) {
								i_194_ += i_201_;
								i_197_ += i_201_;
								i_195_ += Class253_Sub3.anInt7676 * i_201_;
								i_196_ += Class253_Sub3.anInt7675 * i_201_;
							} else
								i_200_ -= i_201_;
							if (i_197_ < i_200_)
								i_197_ = i_200_;
							for (/**/; i_197_ < 0; i_197_++) {
								int i_202_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(((i_196_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_195_ >> 12))]);
								if (i_202_ != 0)
									is_158_[i_194_++] = i_202_;
								else
									i_194_++;
								i_195_ += Class253_Sub3.anInt7676;
							}
						}
					}
					i_192_++;
					Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			} else if (Class253_Sub3.anInt7675 < 0) {
				int i_203_ = Class253_Sub3.anInt7692;
				while (i_203_ < 0) {
					int i_204_ = i_203_ + i_157_;
					if (i_204_ >= 0) {
						if (i_204_ >= is.length)
							break;
						int i_205_ = Class253_Sub3.anInt7695;
						int i_206_ = (Class253_Sub3.anInt7677 + Class253_Sub3.anInt7686);
						int i_207_ = (Class253_Sub3.anInt7694 + Class253_Sub3.anInt7697);
						int i_208_ = Class253_Sub3.anInt7687;
						int i_209_;
						if ((i_209_ = i_206_
								- (((Class253_Sub3) this).anInt7679 << 12)) >= 0) {
							i_209_ = ((Class253_Sub3.anInt7676 - i_209_) / Class253_Sub3.anInt7676);
							i_208_ += i_209_;
							i_206_ += Class253_Sub3.anInt7676 * i_209_;
							i_207_ += Class253_Sub3.anInt7675 * i_209_;
							i_205_ += i_209_;
						}
						if ((i_209_ = ((i_206_ - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_208_)
							i_208_ = i_209_;
						if ((i_209_ = i_207_
								- (((Class253_Sub3) this).anInt7671 << 12)) >= 0) {
							i_209_ = ((Class253_Sub3.anInt7675 - i_209_) / Class253_Sub3.anInt7675);
							i_208_ += i_209_;
							i_206_ += Class253_Sub3.anInt7676 * i_209_;
							i_207_ += Class253_Sub3.anInt7675 * i_209_;
							i_205_ += i_209_;
						}
						if ((i_209_ = ((i_207_ - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_208_)
							i_208_ = i_209_;
						int i_210_ = is[i_204_] - i;
						int i_211_ = -is_156_[i_204_];
						int i_212_ = i_210_
								- (i_205_ - Class253_Sub3.anInt7695);
						if (i_212_ > 0) {
							i_205_ += i_212_;
							i_208_ += i_212_;
							i_206_ += Class253_Sub3.anInt7676 * i_212_;
							i_207_ += Class253_Sub3.anInt7675 * i_212_;
						} else
							i_211_ -= i_212_;
						if (i_208_ < i_211_)
							i_208_ = i_211_;
						for (/**/; i_208_ < 0; i_208_++) {
							int i_213_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(((i_207_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_206_ >> 12))]);
							if (i_213_ != 0)
								is_158_[i_205_++] = i_213_;
							else
								i_205_++;
							i_206_ += Class253_Sub3.anInt7676;
							i_207_ += Class253_Sub3.anInt7675;
						}
					}
					i_203_++;
					Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
					Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			} else {
				int i_214_ = Class253_Sub3.anInt7692;
				while (i_214_ < 0) {
					int i_215_ = i_214_ + i_157_;
					if (i_215_ >= 0) {
						if (i_215_ >= is.length)
							break;
						int i_216_ = Class253_Sub3.anInt7695;
						int i_217_ = (Class253_Sub3.anInt7677 + Class253_Sub3.anInt7686);
						int i_218_ = (Class253_Sub3.anInt7694 + Class253_Sub3.anInt7697);
						int i_219_ = Class253_Sub3.anInt7687;
						int i_220_;
						if ((i_220_ = i_217_
								- (((Class253_Sub3) this).anInt7679 << 12)) >= 0) {
							i_220_ = ((Class253_Sub3.anInt7676 - i_220_) / Class253_Sub3.anInt7676);
							i_219_ += i_220_;
							i_217_ += Class253_Sub3.anInt7676 * i_220_;
							i_218_ += Class253_Sub3.anInt7675 * i_220_;
							i_216_ += i_220_;
						}
						if ((i_220_ = ((i_217_ - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_219_)
							i_219_ = i_220_;
						if (i_218_ < 0) {
							i_220_ = ((Class253_Sub3.anInt7675 - 1 - i_218_) / Class253_Sub3.anInt7675);
							i_219_ += i_220_;
							i_217_ += Class253_Sub3.anInt7676 * i_220_;
							i_218_ += Class253_Sub3.anInt7675 * i_220_;
							i_216_ += i_220_;
						}
						if ((i_220_ = ((1 + i_218_
								- (((Class253_Sub3) this).anInt7671 << 12) - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_219_)
							i_219_ = i_220_;
						int i_221_ = is[i_215_] - i;
						int i_222_ = -is_156_[i_215_];
						int i_223_ = i_221_
								- (i_216_ - Class253_Sub3.anInt7695);
						if (i_223_ > 0) {
							i_216_ += i_223_;
							i_219_ += i_223_;
							i_217_ += Class253_Sub3.anInt7676 * i_223_;
							i_218_ += Class253_Sub3.anInt7675 * i_223_;
						} else
							i_222_ -= i_223_;
						if (i_219_ < i_222_)
							i_219_ = i_222_;
						for (/**/; i_219_ < 0; i_219_++) {
							int i_224_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(((i_218_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_217_ >> 12))]);
							if (i_224_ != 0)
								is_158_[i_216_++] = i_224_;
							else
								i_216_++;
							i_217_ += Class253_Sub3.anInt7676;
							i_218_ += Class253_Sub3.anInt7675;
						}
					}
					i_214_++;
					Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
					Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			}
		} else if (Class253_Sub3.anInt7675 == 0) {
			int i_225_ = Class253_Sub3.anInt7692;
			while (i_225_ < 0) {
				int i_226_ = i_225_ + i_157_;
				if (i_226_ >= 0) {
					if (i_226_ >= is.length)
						break;
					int i_227_ = Class253_Sub3.anInt7695;
					int i_228_ = Class253_Sub3.anInt7677
							+ Class253_Sub3.anInt7686;
					int i_229_ = Class253_Sub3.anInt7694;
					int i_230_ = Class253_Sub3.anInt7687;
					if (i_229_ >= 0
							&& (i_229_
									- (((Class253_Sub3) this).anInt7671 << 12) < 0)) {
						if (i_228_ < 0) {
							int i_231_ = ((Class253_Sub3.anInt7676 - 1 - i_228_) / Class253_Sub3.anInt7676);
							i_230_ += i_231_;
							i_228_ += Class253_Sub3.anInt7676 * i_231_;
							i_227_ += i_231_;
						}
						int i_232_;
						if ((i_232_ = ((1 + i_228_
								- (((Class253_Sub3) this).anInt7679 << 12) - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_230_)
							i_230_ = i_232_;
						int i_233_ = is[i_226_] - i;
						int i_234_ = -is_156_[i_226_];
						int i_235_ = i_233_
								- (i_227_ - Class253_Sub3.anInt7695);
						if (i_235_ > 0) {
							i_227_ += i_235_;
							i_230_ += i_235_;
							i_228_ += Class253_Sub3.anInt7676 * i_235_;
							i_229_ += Class253_Sub3.anInt7675 * i_235_;
						} else
							i_234_ -= i_235_;
						if (i_230_ < i_234_)
							i_230_ = i_234_;
						for (/**/; i_230_ < 0; i_230_++) {
							int i_236_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(((i_229_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_228_ >> 12))]);
							if (i_236_ != 0)
								is_158_[i_227_++] = i_236_;
							else
								i_227_++;
							i_228_ += Class253_Sub3.anInt7676;
						}
					}
				}
				i_225_++;
				Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
				Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
				Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
			}
		} else if (Class253_Sub3.anInt7675 < 0) {
			int i_237_ = Class253_Sub3.anInt7692;
			while (i_237_ < 0) {
				int i_238_ = i_237_ + i_157_;
				if (i_238_ >= 0) {
					if (i_238_ >= is.length)
						break;
					int i_239_ = Class253_Sub3.anInt7695;
					int i_240_ = Class253_Sub3.anInt7677
							+ Class253_Sub3.anInt7686;
					int i_241_ = Class253_Sub3.anInt7694
							+ Class253_Sub3.anInt7697;
					int i_242_ = Class253_Sub3.anInt7687;
					if (i_240_ < 0) {
						int i_243_ = ((Class253_Sub3.anInt7676 - 1 - i_240_) / Class253_Sub3.anInt7676);
						i_242_ += i_243_;
						i_240_ += Class253_Sub3.anInt7676 * i_243_;
						i_241_ += Class253_Sub3.anInt7675 * i_243_;
						i_239_ += i_243_;
					}
					int i_244_;
					if ((i_244_ = ((1 + i_240_
							- (((Class253_Sub3) this).anInt7679 << 12) - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_242_)
						i_242_ = i_244_;
					if ((i_244_ = i_241_
							- (((Class253_Sub3) this).anInt7671 << 12)) >= 0) {
						i_244_ = ((Class253_Sub3.anInt7675 - i_244_) / Class253_Sub3.anInt7675);
						i_242_ += i_244_;
						i_240_ += Class253_Sub3.anInt7676 * i_244_;
						i_241_ += Class253_Sub3.anInt7675 * i_244_;
						i_239_ += i_244_;
					}
					if ((i_244_ = ((i_241_ - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_242_)
						i_242_ = i_244_;
					int i_245_ = is[i_238_] - i;
					int i_246_ = -is_156_[i_238_];
					int i_247_ = i_245_ - (i_239_ - Class253_Sub3.anInt7695);
					if (i_247_ > 0) {
						i_239_ += i_247_;
						i_242_ += i_247_;
						i_240_ += Class253_Sub3.anInt7676 * i_247_;
						i_241_ += Class253_Sub3.anInt7675 * i_247_;
					} else
						i_246_ -= i_247_;
					if (i_242_ < i_246_)
						i_242_ = i_246_;
					for (/**/; i_242_ < 0; i_242_++) {
						int i_248_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(((i_241_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_240_ >> 12))]);
						if (i_248_ != 0)
							is_158_[i_239_++] = i_248_;
						else
							i_239_++;
						i_240_ += Class253_Sub3.anInt7676;
						i_241_ += Class253_Sub3.anInt7675;
					}
				}
				i_237_++;
				Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
				Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
				Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
			}
		} else {
			int i_249_ = Class253_Sub3.anInt7692;
			while (i_249_ < 0) {
				int i_250_ = i_249_ + i_157_;
				if (i_250_ >= 0) {
					if (i_250_ >= is.length)
						break;
					int i_251_ = Class253_Sub3.anInt7695;
					int i_252_ = Class253_Sub3.anInt7677
							+ Class253_Sub3.anInt7686;
					int i_253_ = Class253_Sub3.anInt7694
							+ Class253_Sub3.anInt7697;
					int i_254_ = Class253_Sub3.anInt7687;
					if (i_252_ < 0) {
						int i_255_ = ((Class253_Sub3.anInt7676 - 1 - i_252_) / Class253_Sub3.anInt7676);
						i_254_ += i_255_;
						i_252_ += Class253_Sub3.anInt7676 * i_255_;
						i_253_ += Class253_Sub3.anInt7675 * i_255_;
						i_251_ += i_255_;
					}
					int i_256_;
					if ((i_256_ = ((1 + i_252_
							- (((Class253_Sub3) this).anInt7679 << 12) - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_254_)
						i_254_ = i_256_;
					if (i_253_ < 0) {
						i_256_ = ((Class253_Sub3.anInt7675 - 1 - i_253_) / Class253_Sub3.anInt7675);
						i_254_ += i_256_;
						i_252_ += Class253_Sub3.anInt7676 * i_256_;
						i_253_ += Class253_Sub3.anInt7675 * i_256_;
						i_251_ += i_256_;
					}
					if ((i_256_ = ((1 + i_253_
							- (((Class253_Sub3) this).anInt7671 << 12) - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_254_)
						i_254_ = i_256_;
					int i_257_ = is[i_250_] - i;
					int i_258_ = -is_156_[i_250_];
					int i_259_ = i_257_ - (i_251_ - Class253_Sub3.anInt7695);
					if (i_259_ > 0) {
						i_251_ += i_259_;
						i_254_ += i_259_;
						i_252_ += Class253_Sub3.anInt7676 * i_259_;
						i_253_ += Class253_Sub3.anInt7675 * i_259_;
					} else
						i_258_ -= i_259_;
					if (i_254_ < i_258_)
						i_254_ = i_258_;
					for (/**/; i_254_ < 0; i_254_++) {
						int i_260_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(((i_253_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_252_ >> 12))]);
						if (i_260_ != 0)
							is_158_[i_251_++] = i_260_;
						else
							i_251_++;
						i_252_ += Class253_Sub3.anInt7676;
						i_253_ += Class253_Sub3.anInt7675;
					}
				}
				i_249_++;
				Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
				Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
				Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
			}
		}
	}

	final void method1612(int i, int i_261_, Class72 class72, int i_262_,
			int i_263_) {
		if (((Class253_Sub3) this).aClass163_Sub1_7698.method2293())
			throw new IllegalStateException();
		i += ((Class253_Sub3) this).anInt7689;
		i_261_ += ((Class253_Sub3) this).anInt7691;
		int i_264_ = 0;
		int i_265_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5206);
		int i_266_ = ((Class253_Sub3) this).anInt7679;
		int i_267_ = ((Class253_Sub3) this).anInt7671;
		int i_268_ = i_265_ - i_266_;
		int i_269_ = 0;
		int i_270_ = i + i_261_ * i_265_;
		if (i_261_ < (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177)) {
			int i_271_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177)
					- i_261_;
			i_267_ -= i_271_;
			i_261_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177);
			i_264_ += i_271_ * i_266_;
			i_270_ += i_271_ * i_265_;
		}
		if (i_261_ + i_267_ > (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5193))
			i_267_ -= i_261_
					+ i_267_
					- (((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5193);
		if (i < (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186)) {
			int i_272_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186)
					- i;
			i_266_ -= i_272_;
			i = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186);
			i_264_ += i_272_;
			i_270_ += i_272_;
			i_269_ += i_272_;
			i_268_ += i_272_;
		}
		if (i + i_266_ > (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5178)) {
			int i_273_ = i
					+ i_266_
					- (((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5178);
			i_266_ -= i_273_;
			i_269_ += i_273_;
			i_268_ += i_273_;
		}
		if (i_266_ > 0 && i_267_ > 0) {
			Class72_Sub2 class72_sub2 = (Class72_Sub2) class72;
			int[] is = ((Class72_Sub2) class72_sub2).anIntArray6909;
			int[] is_274_ = ((Class72_Sub2) class72_sub2).anIntArray6911;
			int[] is_275_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anIntArray5214);
			int i_276_ = i_261_;
			if (i_263_ > i_276_) {
				i_276_ = i_263_;
				i_270_ += (i_263_ - i_261_) * i_265_;
				i_264_ += (i_263_ - i_261_) * ((Class253_Sub3) this).anInt7679;
			}
			int i_277_ = (i_263_ + is.length < i_261_ + i_267_ ? i_263_
					+ is.length : i_261_ + i_267_);
			for (int i_278_ = i_276_; i_278_ < i_277_; i_278_++) {
				int i_279_ = is[i_278_ - i_263_] + i_262_;
				int i_280_ = is_274_[i_278_ - i_263_];
				int i_281_ = i_266_;
				if (i > i_279_) {
					int i_282_ = i - i_279_;
					if (i_282_ >= i_280_) {
						i_264_ += i_266_ + i_269_;
						i_270_ += i_266_ + i_268_;
						continue;
					}
					i_280_ -= i_282_;
				} else {
					int i_283_ = i_279_ - i;
					if (i_283_ >= i_266_) {
						i_264_ += i_266_ + i_269_;
						i_270_ += i_266_ + i_268_;
						continue;
					}
					i_264_ += i_283_;
					i_281_ -= i_283_;
					i_270_ += i_283_;
				}
				int i_284_ = 0;
				if (i_281_ < i_280_)
					i_280_ = i_281_;
				else
					i_284_ = i_281_ - i_280_;
				for (int i_285_ = -i_280_; i_285_ < 0; i_285_++) {
					int i_286_ = ((Class253_Sub3_Sub3) this).anIntArray9002[i_264_++];
					if (i_286_ != 0)
						is_275_[i_270_++] = i_286_;
					else
						i_270_++;
				}
				i_264_ += i_284_ + i_269_;
				i_270_ += i_284_ + i_268_;
			}
		}
	}

	final void method3107(int i, int i_287_) {
		int[] is = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anIntArray5214);
		if (Class253_Sub3.anInt7676 == 0) {
			if (Class253_Sub3.anInt7675 == 0) {
				int i_288_ = Class253_Sub3.anInt7692;
				while (i_288_ < 0) {
					int i_289_ = Class253_Sub3.anInt7695;
					int i_290_ = Class253_Sub3.anInt7677;
					int i_291_ = Class253_Sub3.anInt7694;
					int i_292_ = Class253_Sub3.anInt7687;
					if (i_290_ >= 0
							&& i_291_ >= 0
							&& (i_290_
									- (((Class253_Sub3) this).anInt7679 << 12) < 0)
							&& (i_291_
									- (((Class253_Sub3) this).anInt7671 << 12) < 0)) {
						for (/**/; i_292_ < 0; i_292_++) {
							int i_293_ = (((i_291_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_290_ >> 12));
							int i_294_ = i_289_++;
							int[] is_295_ = is;
							int i_296_ = i;
							int i_297_ = i_287_;
							if (i_297_ == 0) {
								if (i_296_ == 1)
									is_295_[i_294_] = (((Class253_Sub3_Sub3) this).anIntArray9002[i_293_]);
								else if (i_296_ == 0) {
									int i_298_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_293_++]);
									int i_299_ = (((i_298_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_300_ = (((i_298_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_301_ = (((i_298_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									is_295_[i_294_] = (i_299_ | i_300_ | i_301_) >>> 8;
								} else if (i_296_ == 3) {
									int i_302_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_293_++]);
									int i_303_ = Class253_Sub3.anInt7670;
									int i_304_ = i_302_ + i_303_;
									int i_305_ = ((i_302_ & 0xff00ff) + (i_303_ & 0xff00ff));
									int i_306_ = ((i_305_ & 0x1000100) + (i_304_
											- i_305_ & 0x10000));
									is_295_[i_294_] = i_304_ - i_306_ | i_306_
											- (i_306_ >>> 8);
								} else if (i_296_ == 2) {
									int i_307_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_293_]);
									int i_308_ = (((i_307_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_309_ = (((i_307_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									is_295_[i_294_] = (((i_308_ | i_309_) >>> 8) + Class253_Sub3.anInt7683);
								} else
									throw new IllegalArgumentException();
							} else if (i_297_ == 1) {
								if (i_296_ == 1) {
									int i_310_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_293_]);
									if (i_310_ != 0)
										is_295_[i_294_] = i_310_;
								} else if (i_296_ == 0) {
									int i_311_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_293_]);
									if (i_311_ != 0) {
										if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
											int i_312_ = (Class253_Sub3.anInt7670 >>> 24);
											int i_313_ = 256 - i_312_;
											int i_314_ = is_295_[i_294_];
											is_295_[i_294_] = (((((i_311_ & 0xff00ff) * i_312_) + ((i_314_ & 0xff00ff) * i_313_)) & ~0xff00ff) + ((((i_311_ & 0xff00) * i_312_) + ((i_314_ & 0xff00) * i_313_)) & 0xff0000)) >> 8;
										} else if (Class253_Sub3.anInt7696 != 255) {
											int i_315_ = (((i_311_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
											int i_316_ = (((i_311_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
											int i_317_ = (((i_311_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
											i_311_ = (i_315_ | i_316_ | i_317_) >>> 8;
											int i_318_ = is_295_[i_294_];
											is_295_[i_294_] = (((((i_311_ & 0xff00ff) * (Class253_Sub3.anInt7696)) + ((i_318_ & 0xff00ff) * (Class253_Sub3.anInt7666))) & ~0xff00ff) + ((((i_311_ & 0xff00) * (Class253_Sub3.anInt7696)) + ((i_318_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
										} else {
											int i_319_ = (((i_311_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
											int i_320_ = (((i_311_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
											int i_321_ = (((i_311_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
											is_295_[i_294_] = (i_319_ | i_320_ | i_321_) >>> 8;
										}
									}
								} else if (i_296_ == 3) {
									int i_322_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_293_]);
									int i_323_ = Class253_Sub3.anInt7670;
									int i_324_ = i_322_ + i_323_;
									int i_325_ = ((i_322_ & 0xff00ff) + (i_323_ & 0xff00ff));
									int i_326_ = ((i_325_ & 0x1000100) + (i_324_
											- i_325_ & 0x10000));
									i_326_ = i_324_ - i_326_ | i_326_
											- (i_326_ >>> 8);
									if (i_322_ == 0
											&& Class253_Sub3.anInt7696 != 255) {
										i_322_ = i_326_;
										i_326_ = is_295_[i_294_];
										i_326_ = (((((i_322_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_326_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_322_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_326_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
									}
									is_295_[i_294_] = i_326_;
								} else if (i_296_ == 2) {
									int i_327_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_293_]);
									if (i_327_ != 0) {
										int i_328_ = (((i_327_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
										int i_329_ = (((i_327_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
										is_295_[i_294_++] = (((i_328_ | i_329_) >>> 8) + Class253_Sub3.anInt7683);
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_297_ == 2) {
								if (i_296_ == 1) {
									int i_330_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_293_]);
									if (i_330_ != 0) {
										int i_331_ = is_295_[i_294_];
										int i_332_ = i_330_ + i_331_;
										int i_333_ = ((i_330_ & 0xff00ff) + (i_331_ & 0xff00ff));
										i_331_ = ((i_333_ & 0x1000100) + (i_332_
												- i_333_ & 0x10000));
										is_295_[i_294_] = (i_332_ - i_331_ | i_331_
												- (i_331_ >>> 8));
									}
								} else if (i_296_ == 0) {
									int i_334_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_293_]);
									if (i_334_ != 0) {
										int i_335_ = (((i_334_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_336_ = (((i_334_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_337_ = (((i_334_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										i_334_ = (i_335_ | i_336_ | i_337_) >>> 8;
										int i_338_ = is_295_[i_294_];
										int i_339_ = i_334_ + i_338_;
										int i_340_ = ((i_334_ & 0xff00ff) + (i_338_ & 0xff00ff));
										i_338_ = ((i_340_ & 0x1000100) + (i_339_
												- i_340_ & 0x10000));
										is_295_[i_294_] = (i_339_ - i_338_ | i_338_
												- (i_338_ >>> 8));
									}
								} else if (i_296_ == 3) {
									int i_341_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_293_]);
									int i_342_ = Class253_Sub3.anInt7670;
									int i_343_ = i_341_ + i_342_;
									int i_344_ = ((i_341_ & 0xff00ff) + (i_342_ & 0xff00ff));
									int i_345_ = ((i_344_ & 0x1000100) + (i_343_
											- i_344_ & 0x10000));
									i_341_ = i_343_ - i_345_ | i_345_
											- (i_345_ >>> 8);
									i_345_ = is_295_[i_294_];
									i_343_ = i_341_ + i_345_;
									i_344_ = (i_341_ & 0xff00ff)
											+ (i_345_ & 0xff00ff);
									i_345_ = ((i_344_ & 0x1000100) + (i_343_
											- i_344_ & 0x10000));
									is_295_[i_294_] = i_343_ - i_345_ | i_345_
											- (i_345_ >>> 8);
								} else if (i_296_ == 2) {
									int i_346_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_293_]);
									if (i_346_ != 0) {
										int i_347_ = (((i_346_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
										int i_348_ = (((i_346_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
										i_346_ = (((i_347_ | i_348_) >>> 8) + Class253_Sub3.anInt7683);
										int i_349_ = is_295_[i_294_];
										int i_350_ = i_346_ + i_349_;
										int i_351_ = ((i_346_ & 0xff00ff) + (i_349_ & 0xff00ff));
										i_349_ = ((i_351_ & 0x1000100) + (i_350_
												- i_351_ & 0x10000));
										is_295_[i_294_] = (i_350_ - i_349_ | i_349_
												- (i_349_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
						}
					}
					i_288_++;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			} else if (Class253_Sub3.anInt7675 < 0) {
				int i_352_ = Class253_Sub3.anInt7692;
				while (i_352_ < 0) {
					int i_353_ = Class253_Sub3.anInt7695;
					int i_354_ = Class253_Sub3.anInt7677;
					int i_355_ = Class253_Sub3.anInt7694
							+ Class253_Sub3.anInt7697;
					int i_356_ = Class253_Sub3.anInt7687;
					if (i_354_ >= 0
							&& (i_354_
									- (((Class253_Sub3) this).anInt7679 << 12) < 0)) {
						int i_357_;
						if ((i_357_ = i_355_
								- (((Class253_Sub3) this).anInt7671 << 12)) >= 0) {
							i_357_ = ((Class253_Sub3.anInt7675 - i_357_) / Class253_Sub3.anInt7675);
							i_356_ += i_357_;
							i_355_ += Class253_Sub3.anInt7675 * i_357_;
							i_353_ += i_357_;
						}
						if ((i_357_ = ((i_355_ - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_356_)
							i_356_ = i_357_;
						for (/**/; i_356_ < 0; i_356_++) {
							int i_358_ = (((i_355_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_354_ >> 12));
							int i_359_ = i_353_++;
							int[] is_360_ = is;
							int i_361_ = i;
							int i_362_ = i_287_;
							if (i_362_ == 0) {
								if (i_361_ == 1)
									is_360_[i_359_] = (((Class253_Sub3_Sub3) this).anIntArray9002[i_358_]);
								else if (i_361_ == 0) {
									int i_363_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_358_++]);
									int i_364_ = (((i_363_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_365_ = (((i_363_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_366_ = (((i_363_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									is_360_[i_359_] = (i_364_ | i_365_ | i_366_) >>> 8;
								} else if (i_361_ == 3) {
									int i_367_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_358_++]);
									int i_368_ = Class253_Sub3.anInt7670;
									int i_369_ = i_367_ + i_368_;
									int i_370_ = ((i_367_ & 0xff00ff) + (i_368_ & 0xff00ff));
									int i_371_ = ((i_370_ & 0x1000100) + (i_369_
											- i_370_ & 0x10000));
									is_360_[i_359_] = i_369_ - i_371_ | i_371_
											- (i_371_ >>> 8);
								} else if (i_361_ == 2) {
									int i_372_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_358_]);
									int i_373_ = (((i_372_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_374_ = (((i_372_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									is_360_[i_359_] = (((i_373_ | i_374_) >>> 8) + Class253_Sub3.anInt7683);
								} else
									throw new IllegalArgumentException();
							} else if (i_362_ == 1) {
								if (i_361_ == 1) {
									int i_375_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_358_]);
									if (i_375_ != 0)
										is_360_[i_359_] = i_375_;
								} else if (i_361_ == 0) {
									int i_376_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_358_]);
									if (i_376_ != 0) {
										if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
											int i_377_ = (Class253_Sub3.anInt7670 >>> 24);
											int i_378_ = 256 - i_377_;
											int i_379_ = is_360_[i_359_];
											is_360_[i_359_] = (((((i_376_ & 0xff00ff) * i_377_) + ((i_379_ & 0xff00ff) * i_378_)) & ~0xff00ff) + ((((i_376_ & 0xff00) * i_377_) + ((i_379_ & 0xff00) * i_378_)) & 0xff0000)) >> 8;
										} else if (Class253_Sub3.anInt7696 != 255) {
											int i_380_ = (((i_376_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
											int i_381_ = (((i_376_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
											int i_382_ = (((i_376_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
											i_376_ = (i_380_ | i_381_ | i_382_) >>> 8;
											int i_383_ = is_360_[i_359_];
											is_360_[i_359_] = (((((i_376_ & 0xff00ff) * (Class253_Sub3.anInt7696)) + ((i_383_ & 0xff00ff) * (Class253_Sub3.anInt7666))) & ~0xff00ff) + ((((i_376_ & 0xff00) * (Class253_Sub3.anInt7696)) + ((i_383_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
										} else {
											int i_384_ = (((i_376_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
											int i_385_ = (((i_376_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
											int i_386_ = (((i_376_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
											is_360_[i_359_] = (i_384_ | i_385_ | i_386_) >>> 8;
										}
									}
								} else if (i_361_ == 3) {
									int i_387_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_358_]);
									int i_388_ = Class253_Sub3.anInt7670;
									int i_389_ = i_387_ + i_388_;
									int i_390_ = ((i_387_ & 0xff00ff) + (i_388_ & 0xff00ff));
									int i_391_ = ((i_390_ & 0x1000100) + (i_389_
											- i_390_ & 0x10000));
									i_391_ = i_389_ - i_391_ | i_391_
											- (i_391_ >>> 8);
									if (i_387_ == 0
											&& Class253_Sub3.anInt7696 != 255) {
										i_387_ = i_391_;
										i_391_ = is_360_[i_359_];
										i_391_ = (((((i_387_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_391_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_387_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_391_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
									}
									is_360_[i_359_] = i_391_;
								} else if (i_361_ == 2) {
									int i_392_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_358_]);
									if (i_392_ != 0) {
										int i_393_ = (((i_392_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
										int i_394_ = (((i_392_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
										is_360_[i_359_++] = (((i_393_ | i_394_) >>> 8) + Class253_Sub3.anInt7683);
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_362_ == 2) {
								if (i_361_ == 1) {
									int i_395_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_358_]);
									if (i_395_ != 0) {
										int i_396_ = is_360_[i_359_];
										int i_397_ = i_395_ + i_396_;
										int i_398_ = ((i_395_ & 0xff00ff) + (i_396_ & 0xff00ff));
										i_396_ = ((i_398_ & 0x1000100) + (i_397_
												- i_398_ & 0x10000));
										is_360_[i_359_] = (i_397_ - i_396_ | i_396_
												- (i_396_ >>> 8));
									}
								} else if (i_361_ == 0) {
									int i_399_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_358_]);
									if (i_399_ != 0) {
										int i_400_ = (((i_399_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_401_ = (((i_399_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_402_ = (((i_399_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										i_399_ = (i_400_ | i_401_ | i_402_) >>> 8;
										int i_403_ = is_360_[i_359_];
										int i_404_ = i_399_ + i_403_;
										int i_405_ = ((i_399_ & 0xff00ff) + (i_403_ & 0xff00ff));
										i_403_ = ((i_405_ & 0x1000100) + (i_404_
												- i_405_ & 0x10000));
										is_360_[i_359_] = (i_404_ - i_403_ | i_403_
												- (i_403_ >>> 8));
									}
								} else if (i_361_ == 3) {
									int i_406_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_358_]);
									int i_407_ = Class253_Sub3.anInt7670;
									int i_408_ = i_406_ + i_407_;
									int i_409_ = ((i_406_ & 0xff00ff) + (i_407_ & 0xff00ff));
									int i_410_ = ((i_409_ & 0x1000100) + (i_408_
											- i_409_ & 0x10000));
									i_406_ = i_408_ - i_410_ | i_410_
											- (i_410_ >>> 8);
									i_410_ = is_360_[i_359_];
									i_408_ = i_406_ + i_410_;
									i_409_ = (i_406_ & 0xff00ff)
											+ (i_410_ & 0xff00ff);
									i_410_ = ((i_409_ & 0x1000100) + (i_408_
											- i_409_ & 0x10000));
									is_360_[i_359_] = i_408_ - i_410_ | i_410_
											- (i_410_ >>> 8);
								} else if (i_361_ == 2) {
									int i_411_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_358_]);
									if (i_411_ != 0) {
										int i_412_ = (((i_411_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
										int i_413_ = (((i_411_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
										i_411_ = (((i_412_ | i_413_) >>> 8) + Class253_Sub3.anInt7683);
										int i_414_ = is_360_[i_359_];
										int i_415_ = i_411_ + i_414_;
										int i_416_ = ((i_411_ & 0xff00ff) + (i_414_ & 0xff00ff));
										i_414_ = ((i_416_ & 0x1000100) + (i_415_
												- i_416_ & 0x10000));
										is_360_[i_359_] = (i_415_ - i_414_ | i_414_
												- (i_414_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_355_ += Class253_Sub3.anInt7675;
						}
					}
					i_352_++;
					Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			} else {
				int i_417_ = Class253_Sub3.anInt7692;
				while (i_417_ < 0) {
					int i_418_ = Class253_Sub3.anInt7695;
					int i_419_ = Class253_Sub3.anInt7677;
					int i_420_ = Class253_Sub3.anInt7694
							+ Class253_Sub3.anInt7697;
					int i_421_ = Class253_Sub3.anInt7687;
					if (i_419_ >= 0
							&& (i_419_
									- (((Class253_Sub3) this).anInt7679 << 12) < 0)) {
						if (i_420_ < 0) {
							int i_422_ = ((Class253_Sub3.anInt7675 - 1 - i_420_) / Class253_Sub3.anInt7675);
							i_421_ += i_422_;
							i_420_ += Class253_Sub3.anInt7675 * i_422_;
							i_418_ += i_422_;
						}
						int i_423_;
						if ((i_423_ = ((1 + i_420_
								- (((Class253_Sub3) this).anInt7671 << 12) - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_421_)
							i_421_ = i_423_;
						for (/**/; i_421_ < 0; i_421_++) {
							int i_424_ = (((i_420_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_419_ >> 12));
							int i_425_ = i_418_++;
							int[] is_426_ = is;
							int i_427_ = i;
							int i_428_ = i_287_;
							if (i_428_ == 0) {
								if (i_427_ == 1)
									is_426_[i_425_] = (((Class253_Sub3_Sub3) this).anIntArray9002[i_424_]);
								else if (i_427_ == 0) {
									int i_429_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_424_++]);
									int i_430_ = (((i_429_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_431_ = (((i_429_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_432_ = (((i_429_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									is_426_[i_425_] = (i_430_ | i_431_ | i_432_) >>> 8;
								} else if (i_427_ == 3) {
									int i_433_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_424_++]);
									int i_434_ = Class253_Sub3.anInt7670;
									int i_435_ = i_433_ + i_434_;
									int i_436_ = ((i_433_ & 0xff00ff) + (i_434_ & 0xff00ff));
									int i_437_ = ((i_436_ & 0x1000100) + (i_435_
											- i_436_ & 0x10000));
									is_426_[i_425_] = i_435_ - i_437_ | i_437_
											- (i_437_ >>> 8);
								} else if (i_427_ == 2) {
									int i_438_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_424_]);
									int i_439_ = (((i_438_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_440_ = (((i_438_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									is_426_[i_425_] = (((i_439_ | i_440_) >>> 8) + Class253_Sub3.anInt7683);
								} else
									throw new IllegalArgumentException();
							} else if (i_428_ == 1) {
								if (i_427_ == 1) {
									int i_441_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_424_]);
									if (i_441_ != 0)
										is_426_[i_425_] = i_441_;
								} else if (i_427_ == 0) {
									int i_442_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_424_]);
									if (i_442_ != 0) {
										if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
											int i_443_ = (Class253_Sub3.anInt7670 >>> 24);
											int i_444_ = 256 - i_443_;
											int i_445_ = is_426_[i_425_];
											is_426_[i_425_] = (((((i_442_ & 0xff00ff) * i_443_) + ((i_445_ & 0xff00ff) * i_444_)) & ~0xff00ff) + ((((i_442_ & 0xff00) * i_443_) + ((i_445_ & 0xff00) * i_444_)) & 0xff0000)) >> 8;
										} else if (Class253_Sub3.anInt7696 != 255) {
											int i_446_ = (((i_442_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
											int i_447_ = (((i_442_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
											int i_448_ = (((i_442_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
											i_442_ = (i_446_ | i_447_ | i_448_) >>> 8;
											int i_449_ = is_426_[i_425_];
											is_426_[i_425_] = (((((i_442_ & 0xff00ff) * (Class253_Sub3.anInt7696)) + ((i_449_ & 0xff00ff) * (Class253_Sub3.anInt7666))) & ~0xff00ff) + ((((i_442_ & 0xff00) * (Class253_Sub3.anInt7696)) + ((i_449_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
										} else {
											int i_450_ = (((i_442_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
											int i_451_ = (((i_442_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
											int i_452_ = (((i_442_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
											is_426_[i_425_] = (i_450_ | i_451_ | i_452_) >>> 8;
										}
									}
								} else if (i_427_ == 3) {
									int i_453_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_424_]);
									int i_454_ = Class253_Sub3.anInt7670;
									int i_455_ = i_453_ + i_454_;
									int i_456_ = ((i_453_ & 0xff00ff) + (i_454_ & 0xff00ff));
									int i_457_ = ((i_456_ & 0x1000100) + (i_455_
											- i_456_ & 0x10000));
									i_457_ = i_455_ - i_457_ | i_457_
											- (i_457_ >>> 8);
									if (i_453_ == 0
											&& Class253_Sub3.anInt7696 != 255) {
										i_453_ = i_457_;
										i_457_ = is_426_[i_425_];
										i_457_ = (((((i_453_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_457_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_453_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_457_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
									}
									is_426_[i_425_] = i_457_;
								} else if (i_427_ == 2) {
									int i_458_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_424_]);
									if (i_458_ != 0) {
										int i_459_ = (((i_458_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
										int i_460_ = (((i_458_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
										is_426_[i_425_++] = (((i_459_ | i_460_) >>> 8) + Class253_Sub3.anInt7683);
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_428_ == 2) {
								if (i_427_ == 1) {
									int i_461_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_424_]);
									if (i_461_ != 0) {
										int i_462_ = is_426_[i_425_];
										int i_463_ = i_461_ + i_462_;
										int i_464_ = ((i_461_ & 0xff00ff) + (i_462_ & 0xff00ff));
										i_462_ = ((i_464_ & 0x1000100) + (i_463_
												- i_464_ & 0x10000));
										is_426_[i_425_] = (i_463_ - i_462_ | i_462_
												- (i_462_ >>> 8));
									}
								} else if (i_427_ == 0) {
									int i_465_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_424_]);
									if (i_465_ != 0) {
										int i_466_ = (((i_465_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_467_ = (((i_465_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_468_ = (((i_465_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										i_465_ = (i_466_ | i_467_ | i_468_) >>> 8;
										int i_469_ = is_426_[i_425_];
										int i_470_ = i_465_ + i_469_;
										int i_471_ = ((i_465_ & 0xff00ff) + (i_469_ & 0xff00ff));
										i_469_ = ((i_471_ & 0x1000100) + (i_470_
												- i_471_ & 0x10000));
										is_426_[i_425_] = (i_470_ - i_469_ | i_469_
												- (i_469_ >>> 8));
									}
								} else if (i_427_ == 3) {
									int i_472_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_424_]);
									int i_473_ = Class253_Sub3.anInt7670;
									int i_474_ = i_472_ + i_473_;
									int i_475_ = ((i_472_ & 0xff00ff) + (i_473_ & 0xff00ff));
									int i_476_ = ((i_475_ & 0x1000100) + (i_474_
											- i_475_ & 0x10000));
									i_472_ = i_474_ - i_476_ | i_476_
											- (i_476_ >>> 8);
									i_476_ = is_426_[i_425_];
									i_474_ = i_472_ + i_476_;
									i_475_ = (i_472_ & 0xff00ff)
											+ (i_476_ & 0xff00ff);
									i_476_ = ((i_475_ & 0x1000100) + (i_474_
											- i_475_ & 0x10000));
									is_426_[i_425_] = i_474_ - i_476_ | i_476_
											- (i_476_ >>> 8);
								} else if (i_427_ == 2) {
									int i_477_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_424_]);
									if (i_477_ != 0) {
										int i_478_ = (((i_477_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
										int i_479_ = (((i_477_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
										i_477_ = (((i_478_ | i_479_) >>> 8) + Class253_Sub3.anInt7683);
										int i_480_ = is_426_[i_425_];
										int i_481_ = i_477_ + i_480_;
										int i_482_ = ((i_477_ & 0xff00ff) + (i_480_ & 0xff00ff));
										i_480_ = ((i_482_ & 0x1000100) + (i_481_
												- i_482_ & 0x10000));
										is_426_[i_425_] = (i_481_ - i_480_ | i_480_
												- (i_480_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_420_ += Class253_Sub3.anInt7675;
						}
					}
					i_417_++;
					Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			}
		} else if (Class253_Sub3.anInt7676 < 0) {
			if (Class253_Sub3.anInt7675 == 0) {
				int i_483_ = Class253_Sub3.anInt7692;
				while (i_483_ < 0) {
					int i_484_ = Class253_Sub3.anInt7695;
					int i_485_ = Class253_Sub3.anInt7677
							+ Class253_Sub3.anInt7686;
					int i_486_ = Class253_Sub3.anInt7694;
					int i_487_ = Class253_Sub3.anInt7687;
					if (i_486_ >= 0
							&& (i_486_
									- (((Class253_Sub3) this).anInt7671 << 12) < 0)) {
						int i_488_;
						if ((i_488_ = i_485_
								- (((Class253_Sub3) this).anInt7679 << 12)) >= 0) {
							i_488_ = ((Class253_Sub3.anInt7676 - i_488_) / Class253_Sub3.anInt7676);
							i_487_ += i_488_;
							i_485_ += Class253_Sub3.anInt7676 * i_488_;
							i_484_ += i_488_;
						}
						if ((i_488_ = ((i_485_ - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_487_)
							i_487_ = i_488_;
						for (/**/; i_487_ < 0; i_487_++) {
							int i_489_ = (((i_486_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_485_ >> 12));
							int i_490_ = i_484_++;
							int[] is_491_ = is;
							int i_492_ = i;
							int i_493_ = i_287_;
							if (i_493_ == 0) {
								if (i_492_ == 1)
									is_491_[i_490_] = (((Class253_Sub3_Sub3) this).anIntArray9002[i_489_]);
								else if (i_492_ == 0) {
									int i_494_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_489_++]);
									int i_495_ = (((i_494_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_496_ = (((i_494_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_497_ = (((i_494_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									is_491_[i_490_] = (i_495_ | i_496_ | i_497_) >>> 8;
								} else if (i_492_ == 3) {
									int i_498_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_489_++]);
									int i_499_ = Class253_Sub3.anInt7670;
									int i_500_ = i_498_ + i_499_;
									int i_501_ = ((i_498_ & 0xff00ff) + (i_499_ & 0xff00ff));
									int i_502_ = ((i_501_ & 0x1000100) + (i_500_
											- i_501_ & 0x10000));
									is_491_[i_490_] = i_500_ - i_502_ | i_502_
											- (i_502_ >>> 8);
								} else if (i_492_ == 2) {
									int i_503_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_489_]);
									int i_504_ = (((i_503_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_505_ = (((i_503_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									is_491_[i_490_] = (((i_504_ | i_505_) >>> 8) + Class253_Sub3.anInt7683);
								} else
									throw new IllegalArgumentException();
							} else if (i_493_ == 1) {
								if (i_492_ == 1) {
									int i_506_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_489_]);
									if (i_506_ != 0)
										is_491_[i_490_] = i_506_;
								} else if (i_492_ == 0) {
									int i_507_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_489_]);
									if (i_507_ != 0) {
										if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
											int i_508_ = (Class253_Sub3.anInt7670 >>> 24);
											int i_509_ = 256 - i_508_;
											int i_510_ = is_491_[i_490_];
											is_491_[i_490_] = (((((i_507_ & 0xff00ff) * i_508_) + ((i_510_ & 0xff00ff) * i_509_)) & ~0xff00ff) + ((((i_507_ & 0xff00) * i_508_) + ((i_510_ & 0xff00) * i_509_)) & 0xff0000)) >> 8;
										} else if (Class253_Sub3.anInt7696 != 255) {
											int i_511_ = (((i_507_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
											int i_512_ = (((i_507_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
											int i_513_ = (((i_507_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
											i_507_ = (i_511_ | i_512_ | i_513_) >>> 8;
											int i_514_ = is_491_[i_490_];
											is_491_[i_490_] = (((((i_507_ & 0xff00ff) * (Class253_Sub3.anInt7696)) + ((i_514_ & 0xff00ff) * (Class253_Sub3.anInt7666))) & ~0xff00ff) + ((((i_507_ & 0xff00) * (Class253_Sub3.anInt7696)) + ((i_514_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
										} else {
											int i_515_ = (((i_507_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
											int i_516_ = (((i_507_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
											int i_517_ = (((i_507_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
											is_491_[i_490_] = (i_515_ | i_516_ | i_517_) >>> 8;
										}
									}
								} else if (i_492_ == 3) {
									int i_518_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_489_]);
									int i_519_ = Class253_Sub3.anInt7670;
									int i_520_ = i_518_ + i_519_;
									int i_521_ = ((i_518_ & 0xff00ff) + (i_519_ & 0xff00ff));
									int i_522_ = ((i_521_ & 0x1000100) + (i_520_
											- i_521_ & 0x10000));
									i_522_ = i_520_ - i_522_ | i_522_
											- (i_522_ >>> 8);
									if (i_518_ == 0
											&& Class253_Sub3.anInt7696 != 255) {
										i_518_ = i_522_;
										i_522_ = is_491_[i_490_];
										i_522_ = (((((i_518_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_522_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_518_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_522_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
									}
									is_491_[i_490_] = i_522_;
								} else if (i_492_ == 2) {
									int i_523_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_489_]);
									if (i_523_ != 0) {
										int i_524_ = (((i_523_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
										int i_525_ = (((i_523_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
										is_491_[i_490_++] = (((i_524_ | i_525_) >>> 8) + Class253_Sub3.anInt7683);
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_493_ == 2) {
								if (i_492_ == 1) {
									int i_526_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_489_]);
									if (i_526_ != 0) {
										int i_527_ = is_491_[i_490_];
										int i_528_ = i_526_ + i_527_;
										int i_529_ = ((i_526_ & 0xff00ff) + (i_527_ & 0xff00ff));
										i_527_ = ((i_529_ & 0x1000100) + (i_528_
												- i_529_ & 0x10000));
										is_491_[i_490_] = (i_528_ - i_527_ | i_527_
												- (i_527_ >>> 8));
									}
								} else if (i_492_ == 0) {
									int i_530_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_489_]);
									if (i_530_ != 0) {
										int i_531_ = (((i_530_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_532_ = (((i_530_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_533_ = (((i_530_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										i_530_ = (i_531_ | i_532_ | i_533_) >>> 8;
										int i_534_ = is_491_[i_490_];
										int i_535_ = i_530_ + i_534_;
										int i_536_ = ((i_530_ & 0xff00ff) + (i_534_ & 0xff00ff));
										i_534_ = ((i_536_ & 0x1000100) + (i_535_
												- i_536_ & 0x10000));
										is_491_[i_490_] = (i_535_ - i_534_ | i_534_
												- (i_534_ >>> 8));
									}
								} else if (i_492_ == 3) {
									int i_537_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_489_]);
									int i_538_ = Class253_Sub3.anInt7670;
									int i_539_ = i_537_ + i_538_;
									int i_540_ = ((i_537_ & 0xff00ff) + (i_538_ & 0xff00ff));
									int i_541_ = ((i_540_ & 0x1000100) + (i_539_
											- i_540_ & 0x10000));
									i_537_ = i_539_ - i_541_ | i_541_
											- (i_541_ >>> 8);
									i_541_ = is_491_[i_490_];
									i_539_ = i_537_ + i_541_;
									i_540_ = (i_537_ & 0xff00ff)
											+ (i_541_ & 0xff00ff);
									i_541_ = ((i_540_ & 0x1000100) + (i_539_
											- i_540_ & 0x10000));
									is_491_[i_490_] = i_539_ - i_541_ | i_541_
											- (i_541_ >>> 8);
								} else if (i_492_ == 2) {
									int i_542_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_489_]);
									if (i_542_ != 0) {
										int i_543_ = (((i_542_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
										int i_544_ = (((i_542_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
										i_542_ = (((i_543_ | i_544_) >>> 8) + Class253_Sub3.anInt7683);
										int i_545_ = is_491_[i_490_];
										int i_546_ = i_542_ + i_545_;
										int i_547_ = ((i_542_ & 0xff00ff) + (i_545_ & 0xff00ff));
										i_545_ = ((i_547_ & 0x1000100) + (i_546_
												- i_547_ & 0x10000));
										is_491_[i_490_] = (i_546_ - i_545_ | i_545_
												- (i_545_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_485_ += Class253_Sub3.anInt7676;
						}
					}
					i_483_++;
					Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			} else if (Class253_Sub3.anInt7675 < 0) {
				int i_548_ = Class253_Sub3.anInt7692;
				while (i_548_ < 0) {
					int i_549_ = Class253_Sub3.anInt7695;
					int i_550_ = Class253_Sub3.anInt7677
							+ Class253_Sub3.anInt7686;
					int i_551_ = Class253_Sub3.anInt7694
							+ Class253_Sub3.anInt7697;
					int i_552_ = Class253_Sub3.anInt7687;
					int i_553_;
					if ((i_553_ = i_550_
							- (((Class253_Sub3) this).anInt7679 << 12)) >= 0) {
						i_553_ = ((Class253_Sub3.anInt7676 - i_553_) / Class253_Sub3.anInt7676);
						i_552_ += i_553_;
						i_550_ += Class253_Sub3.anInt7676 * i_553_;
						i_551_ += Class253_Sub3.anInt7675 * i_553_;
						i_549_ += i_553_;
					}
					if ((i_553_ = ((i_550_ - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_552_)
						i_552_ = i_553_;
					if ((i_553_ = i_551_
							- (((Class253_Sub3) this).anInt7671 << 12)) >= 0) {
						i_553_ = ((Class253_Sub3.anInt7675 - i_553_) / Class253_Sub3.anInt7675);
						i_552_ += i_553_;
						i_550_ += Class253_Sub3.anInt7676 * i_553_;
						i_551_ += Class253_Sub3.anInt7675 * i_553_;
						i_549_ += i_553_;
					}
					if ((i_553_ = ((i_551_ - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_552_)
						i_552_ = i_553_;
					for (/**/; i_552_ < 0; i_552_++) {
						int i_554_ = (((i_551_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_550_ >> 12));
						int i_555_ = i_549_++;
						int[] is_556_ = is;
						int i_557_ = i;
						int i_558_ = i_287_;
						if (i_558_ == 0) {
							if (i_557_ == 1)
								is_556_[i_555_] = (((Class253_Sub3_Sub3) this).anIntArray9002[i_554_]);
							else if (i_557_ == 0) {
								int i_559_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_554_++]);
								int i_560_ = (((i_559_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
								int i_561_ = (((i_559_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
								int i_562_ = (((i_559_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
								is_556_[i_555_] = (i_560_ | i_561_ | i_562_) >>> 8;
							} else if (i_557_ == 3) {
								int i_563_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_554_++]);
								int i_564_ = Class253_Sub3.anInt7670;
								int i_565_ = i_563_ + i_564_;
								int i_566_ = ((i_563_ & 0xff00ff) + (i_564_ & 0xff00ff));
								int i_567_ = ((i_566_ & 0x1000100) + (i_565_
										- i_566_ & 0x10000));
								is_556_[i_555_] = i_565_ - i_567_ | i_567_
										- (i_567_ >>> 8);
							} else if (i_557_ == 2) {
								int i_568_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_554_]);
								int i_569_ = (((i_568_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
								int i_570_ = (((i_568_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
								is_556_[i_555_] = (((i_569_ | i_570_) >>> 8) + Class253_Sub3.anInt7683);
							} else
								throw new IllegalArgumentException();
						} else if (i_558_ == 1) {
							if (i_557_ == 1) {
								int i_571_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_554_]);
								if (i_571_ != 0)
									is_556_[i_555_] = i_571_;
							} else if (i_557_ == 0) {
								int i_572_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_554_]);
								if (i_572_ != 0) {
									if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
										int i_573_ = Class253_Sub3.anInt7670 >>> 24;
										int i_574_ = 256 - i_573_;
										int i_575_ = is_556_[i_555_];
										is_556_[i_555_] = ((((i_572_ & 0xff00ff)
												* i_573_ + ((i_575_ & 0xff00ff) * i_574_)) & ~0xff00ff) + (((i_572_ & 0xff00)
												* i_573_ + ((i_575_ & 0xff00) * i_574_)) & 0xff0000)) >> 8;
									} else if (Class253_Sub3.anInt7696 != 255) {
										int i_576_ = (((i_572_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_577_ = (((i_572_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_578_ = (((i_572_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										i_572_ = (i_576_ | i_577_ | i_578_) >>> 8;
										int i_579_ = is_556_[i_555_];
										is_556_[i_555_] = (((((i_572_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_579_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_572_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_579_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
									} else {
										int i_580_ = (((i_572_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_581_ = (((i_572_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_582_ = (((i_572_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										is_556_[i_555_] = (i_580_ | i_581_ | i_582_) >>> 8;
									}
								}
							} else if (i_557_ == 3) {
								int i_583_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_554_]);
								int i_584_ = Class253_Sub3.anInt7670;
								int i_585_ = i_583_ + i_584_;
								int i_586_ = ((i_583_ & 0xff00ff) + (i_584_ & 0xff00ff));
								int i_587_ = ((i_586_ & 0x1000100) + (i_585_
										- i_586_ & 0x10000));
								i_587_ = i_585_ - i_587_ | i_587_
										- (i_587_ >>> 8);
								if (i_583_ == 0
										&& Class253_Sub3.anInt7696 != 255) {
									i_583_ = i_587_;
									i_587_ = is_556_[i_555_];
									i_587_ = (((((i_583_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_587_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_583_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_587_ & 0xff00) * Class253_Sub3.anInt7666)) & 0xff0000)) >> 8;
								}
								is_556_[i_555_] = i_587_;
							} else if (i_557_ == 2) {
								int i_588_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_554_]);
								if (i_588_ != 0) {
									int i_589_ = (((i_588_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_590_ = (((i_588_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									is_556_[i_555_++] = (((i_589_ | i_590_) >>> 8) + Class253_Sub3.anInt7683);
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_558_ == 2) {
							if (i_557_ == 1) {
								int i_591_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_554_]);
								if (i_591_ != 0) {
									int i_592_ = is_556_[i_555_];
									int i_593_ = i_591_ + i_592_;
									int i_594_ = ((i_591_ & 0xff00ff) + (i_592_ & 0xff00ff));
									i_592_ = ((i_594_ & 0x1000100) + (i_593_
											- i_594_ & 0x10000));
									is_556_[i_555_] = i_593_ - i_592_ | i_592_
											- (i_592_ >>> 8);
								}
							} else if (i_557_ == 0) {
								int i_595_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_554_]);
								if (i_595_ != 0) {
									int i_596_ = (((i_595_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_597_ = (((i_595_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_598_ = (((i_595_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									i_595_ = (i_596_ | i_597_ | i_598_) >>> 8;
									int i_599_ = is_556_[i_555_];
									int i_600_ = i_595_ + i_599_;
									int i_601_ = ((i_595_ & 0xff00ff) + (i_599_ & 0xff00ff));
									i_599_ = ((i_601_ & 0x1000100) + (i_600_
											- i_601_ & 0x10000));
									is_556_[i_555_] = i_600_ - i_599_ | i_599_
											- (i_599_ >>> 8);
								}
							} else if (i_557_ == 3) {
								int i_602_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_554_]);
								int i_603_ = Class253_Sub3.anInt7670;
								int i_604_ = i_602_ + i_603_;
								int i_605_ = ((i_602_ & 0xff00ff) + (i_603_ & 0xff00ff));
								int i_606_ = ((i_605_ & 0x1000100) + (i_604_
										- i_605_ & 0x10000));
								i_602_ = i_604_ - i_606_ | i_606_
										- (i_606_ >>> 8);
								i_606_ = is_556_[i_555_];
								i_604_ = i_602_ + i_606_;
								i_605_ = (i_602_ & 0xff00ff)
										+ (i_606_ & 0xff00ff);
								i_606_ = (i_605_ & 0x1000100)
										+ (i_604_ - i_605_ & 0x10000);
								is_556_[i_555_] = i_604_ - i_606_ | i_606_
										- (i_606_ >>> 8);
							} else if (i_557_ == 2) {
								int i_607_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_554_]);
								if (i_607_ != 0) {
									int i_608_ = (((i_607_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_609_ = (((i_607_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									i_607_ = (((i_608_ | i_609_) >>> 8) + Class253_Sub3.anInt7683);
									int i_610_ = is_556_[i_555_];
									int i_611_ = i_607_ + i_610_;
									int i_612_ = ((i_607_ & 0xff00ff) + (i_610_ & 0xff00ff));
									i_610_ = ((i_612_ & 0x1000100) + (i_611_
											- i_612_ & 0x10000));
									is_556_[i_555_] = i_611_ - i_610_ | i_610_
											- (i_610_ >>> 8);
								}
							}
						} else
							throw new IllegalArgumentException();
						i_550_ += Class253_Sub3.anInt7676;
						i_551_ += Class253_Sub3.anInt7675;
					}
					i_548_++;
					Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
					Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			} else {
				int i_613_ = Class253_Sub3.anInt7692;
				while (i_613_ < 0) {
					int i_614_ = Class253_Sub3.anInt7695;
					int i_615_ = Class253_Sub3.anInt7677
							+ Class253_Sub3.anInt7686;
					int i_616_ = Class253_Sub3.anInt7694
							+ Class253_Sub3.anInt7697;
					int i_617_ = Class253_Sub3.anInt7687;
					int i_618_;
					if ((i_618_ = i_615_
							- (((Class253_Sub3) this).anInt7679 << 12)) >= 0) {
						i_618_ = ((Class253_Sub3.anInt7676 - i_618_) / Class253_Sub3.anInt7676);
						i_617_ += i_618_;
						i_615_ += Class253_Sub3.anInt7676 * i_618_;
						i_616_ += Class253_Sub3.anInt7675 * i_618_;
						i_614_ += i_618_;
					}
					if ((i_618_ = ((i_615_ - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_617_)
						i_617_ = i_618_;
					if (i_616_ < 0) {
						i_618_ = ((Class253_Sub3.anInt7675 - 1 - i_616_) / Class253_Sub3.anInt7675);
						i_617_ += i_618_;
						i_615_ += Class253_Sub3.anInt7676 * i_618_;
						i_616_ += Class253_Sub3.anInt7675 * i_618_;
						i_614_ += i_618_;
					}
					if ((i_618_ = ((1 + i_616_
							- (((Class253_Sub3) this).anInt7671 << 12) - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_617_)
						i_617_ = i_618_;
					for (/**/; i_617_ < 0; i_617_++) {
						int i_619_ = (((i_616_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_615_ >> 12));
						int i_620_ = i_614_++;
						int[] is_621_ = is;
						int i_622_ = i;
						int i_623_ = i_287_;
						if (i_623_ == 0) {
							if (i_622_ == 1)
								is_621_[i_620_] = (((Class253_Sub3_Sub3) this).anIntArray9002[i_619_]);
							else if (i_622_ == 0) {
								int i_624_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_619_++]);
								int i_625_ = (((i_624_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
								int i_626_ = (((i_624_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
								int i_627_ = (((i_624_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
								is_621_[i_620_] = (i_625_ | i_626_ | i_627_) >>> 8;
							} else if (i_622_ == 3) {
								int i_628_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_619_++]);
								int i_629_ = Class253_Sub3.anInt7670;
								int i_630_ = i_628_ + i_629_;
								int i_631_ = ((i_628_ & 0xff00ff) + (i_629_ & 0xff00ff));
								int i_632_ = ((i_631_ & 0x1000100) + (i_630_
										- i_631_ & 0x10000));
								is_621_[i_620_] = i_630_ - i_632_ | i_632_
										- (i_632_ >>> 8);
							} else if (i_622_ == 2) {
								int i_633_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_619_]);
								int i_634_ = (((i_633_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
								int i_635_ = (((i_633_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
								is_621_[i_620_] = (((i_634_ | i_635_) >>> 8) + Class253_Sub3.anInt7683);
							} else
								throw new IllegalArgumentException();
						} else if (i_623_ == 1) {
							if (i_622_ == 1) {
								int i_636_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_619_]);
								if (i_636_ != 0)
									is_621_[i_620_] = i_636_;
							} else if (i_622_ == 0) {
								int i_637_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_619_]);
								if (i_637_ != 0) {
									if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
										int i_638_ = Class253_Sub3.anInt7670 >>> 24;
										int i_639_ = 256 - i_638_;
										int i_640_ = is_621_[i_620_];
										is_621_[i_620_] = ((((i_637_ & 0xff00ff)
												* i_638_ + ((i_640_ & 0xff00ff) * i_639_)) & ~0xff00ff) + (((i_637_ & 0xff00)
												* i_638_ + ((i_640_ & 0xff00) * i_639_)) & 0xff0000)) >> 8;
									} else if (Class253_Sub3.anInt7696 != 255) {
										int i_641_ = (((i_637_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_642_ = (((i_637_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_643_ = (((i_637_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										i_637_ = (i_641_ | i_642_ | i_643_) >>> 8;
										int i_644_ = is_621_[i_620_];
										is_621_[i_620_] = (((((i_637_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_644_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_637_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_644_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
									} else {
										int i_645_ = (((i_637_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_646_ = (((i_637_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_647_ = (((i_637_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										is_621_[i_620_] = (i_645_ | i_646_ | i_647_) >>> 8;
									}
								}
							} else if (i_622_ == 3) {
								int i_648_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_619_]);
								int i_649_ = Class253_Sub3.anInt7670;
								int i_650_ = i_648_ + i_649_;
								int i_651_ = ((i_648_ & 0xff00ff) + (i_649_ & 0xff00ff));
								int i_652_ = ((i_651_ & 0x1000100) + (i_650_
										- i_651_ & 0x10000));
								i_652_ = i_650_ - i_652_ | i_652_
										- (i_652_ >>> 8);
								if (i_648_ == 0
										&& Class253_Sub3.anInt7696 != 255) {
									i_648_ = i_652_;
									i_652_ = is_621_[i_620_];
									i_652_ = (((((i_648_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_652_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_648_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_652_ & 0xff00) * Class253_Sub3.anInt7666)) & 0xff0000)) >> 8;
								}
								is_621_[i_620_] = i_652_;
							} else if (i_622_ == 2) {
								int i_653_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_619_]);
								if (i_653_ != 0) {
									int i_654_ = (((i_653_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_655_ = (((i_653_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									is_621_[i_620_++] = (((i_654_ | i_655_) >>> 8) + Class253_Sub3.anInt7683);
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_623_ == 2) {
							if (i_622_ == 1) {
								int i_656_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_619_]);
								if (i_656_ != 0) {
									int i_657_ = is_621_[i_620_];
									int i_658_ = i_656_ + i_657_;
									int i_659_ = ((i_656_ & 0xff00ff) + (i_657_ & 0xff00ff));
									i_657_ = ((i_659_ & 0x1000100) + (i_658_
											- i_659_ & 0x10000));
									is_621_[i_620_] = i_658_ - i_657_ | i_657_
											- (i_657_ >>> 8);
								}
							} else if (i_622_ == 0) {
								int i_660_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_619_]);
								if (i_660_ != 0) {
									int i_661_ = (((i_660_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_662_ = (((i_660_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_663_ = (((i_660_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									i_660_ = (i_661_ | i_662_ | i_663_) >>> 8;
									int i_664_ = is_621_[i_620_];
									int i_665_ = i_660_ + i_664_;
									int i_666_ = ((i_660_ & 0xff00ff) + (i_664_ & 0xff00ff));
									i_664_ = ((i_666_ & 0x1000100) + (i_665_
											- i_666_ & 0x10000));
									is_621_[i_620_] = i_665_ - i_664_ | i_664_
											- (i_664_ >>> 8);
								}
							} else if (i_622_ == 3) {
								int i_667_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_619_]);
								int i_668_ = Class253_Sub3.anInt7670;
								int i_669_ = i_667_ + i_668_;
								int i_670_ = ((i_667_ & 0xff00ff) + (i_668_ & 0xff00ff));
								int i_671_ = ((i_670_ & 0x1000100) + (i_669_
										- i_670_ & 0x10000));
								i_667_ = i_669_ - i_671_ | i_671_
										- (i_671_ >>> 8);
								i_671_ = is_621_[i_620_];
								i_669_ = i_667_ + i_671_;
								i_670_ = (i_667_ & 0xff00ff)
										+ (i_671_ & 0xff00ff);
								i_671_ = (i_670_ & 0x1000100)
										+ (i_669_ - i_670_ & 0x10000);
								is_621_[i_620_] = i_669_ - i_671_ | i_671_
										- (i_671_ >>> 8);
							} else if (i_622_ == 2) {
								int i_672_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_619_]);
								if (i_672_ != 0) {
									int i_673_ = (((i_672_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_674_ = (((i_672_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									i_672_ = (((i_673_ | i_674_) >>> 8) + Class253_Sub3.anInt7683);
									int i_675_ = is_621_[i_620_];
									int i_676_ = i_672_ + i_675_;
									int i_677_ = ((i_672_ & 0xff00ff) + (i_675_ & 0xff00ff));
									i_675_ = ((i_677_ & 0x1000100) + (i_676_
											- i_677_ & 0x10000));
									is_621_[i_620_] = i_676_ - i_675_ | i_675_
											- (i_675_ >>> 8);
								}
							}
						} else
							throw new IllegalArgumentException();
						i_615_ += Class253_Sub3.anInt7676;
						i_616_ += Class253_Sub3.anInt7675;
					}
					i_613_++;
					Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
					Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			}
		} else if (Class253_Sub3.anInt7675 == 0) {
			int i_678_ = Class253_Sub3.anInt7692;
			while (i_678_ < 0) {
				int i_679_ = Class253_Sub3.anInt7695;
				int i_680_ = Class253_Sub3.anInt7677 + Class253_Sub3.anInt7686;
				int i_681_ = Class253_Sub3.anInt7694;
				int i_682_ = Class253_Sub3.anInt7687;
				if (i_681_ >= 0
						&& i_681_ - (((Class253_Sub3) this).anInt7671 << 12) < 0) {
					if (i_680_ < 0) {
						int i_683_ = ((Class253_Sub3.anInt7676 - 1 - i_680_) / Class253_Sub3.anInt7676);
						i_682_ += i_683_;
						i_680_ += Class253_Sub3.anInt7676 * i_683_;
						i_679_ += i_683_;
					}
					int i_684_;
					if ((i_684_ = ((1 + i_680_
							- (((Class253_Sub3) this).anInt7679 << 12) - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_682_)
						i_682_ = i_684_;
					for (/**/; i_682_ < 0; i_682_++) {
						int i_685_ = (((i_681_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_680_ >> 12));
						int i_686_ = i_679_++;
						int[] is_687_ = is;
						int i_688_ = i;
						int i_689_ = i_287_;
						if (i_689_ == 0) {
							if (i_688_ == 1)
								is_687_[i_686_] = (((Class253_Sub3_Sub3) this).anIntArray9002[i_685_]);
							else if (i_688_ == 0) {
								int i_690_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_685_++]);
								int i_691_ = (((i_690_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
								int i_692_ = (((i_690_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
								int i_693_ = (((i_690_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
								is_687_[i_686_] = (i_691_ | i_692_ | i_693_) >>> 8;
							} else if (i_688_ == 3) {
								int i_694_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_685_++]);
								int i_695_ = Class253_Sub3.anInt7670;
								int i_696_ = i_694_ + i_695_;
								int i_697_ = ((i_694_ & 0xff00ff) + (i_695_ & 0xff00ff));
								int i_698_ = ((i_697_ & 0x1000100) + (i_696_
										- i_697_ & 0x10000));
								is_687_[i_686_] = i_696_ - i_698_ | i_698_
										- (i_698_ >>> 8);
							} else if (i_688_ == 2) {
								int i_699_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_685_]);
								int i_700_ = (((i_699_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
								int i_701_ = (((i_699_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
								is_687_[i_686_] = (((i_700_ | i_701_) >>> 8) + Class253_Sub3.anInt7683);
							} else
								throw new IllegalArgumentException();
						} else if (i_689_ == 1) {
							if (i_688_ == 1) {
								int i_702_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_685_]);
								if (i_702_ != 0)
									is_687_[i_686_] = i_702_;
							} else if (i_688_ == 0) {
								int i_703_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_685_]);
								if (i_703_ != 0) {
									if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
										int i_704_ = Class253_Sub3.anInt7670 >>> 24;
										int i_705_ = 256 - i_704_;
										int i_706_ = is_687_[i_686_];
										is_687_[i_686_] = ((((i_703_ & 0xff00ff)
												* i_704_ + ((i_706_ & 0xff00ff) * i_705_)) & ~0xff00ff) + (((i_703_ & 0xff00)
												* i_704_ + ((i_706_ & 0xff00) * i_705_)) & 0xff0000)) >> 8;
									} else if (Class253_Sub3.anInt7696 != 255) {
										int i_707_ = (((i_703_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_708_ = (((i_703_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_709_ = (((i_703_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										i_703_ = (i_707_ | i_708_ | i_709_) >>> 8;
										int i_710_ = is_687_[i_686_];
										is_687_[i_686_] = (((((i_703_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_710_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_703_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_710_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
									} else {
										int i_711_ = (((i_703_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_712_ = (((i_703_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_713_ = (((i_703_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										is_687_[i_686_] = (i_711_ | i_712_ | i_713_) >>> 8;
									}
								}
							} else if (i_688_ == 3) {
								int i_714_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_685_]);
								int i_715_ = Class253_Sub3.anInt7670;
								int i_716_ = i_714_ + i_715_;
								int i_717_ = ((i_714_ & 0xff00ff) + (i_715_ & 0xff00ff));
								int i_718_ = ((i_717_ & 0x1000100) + (i_716_
										- i_717_ & 0x10000));
								i_718_ = i_716_ - i_718_ | i_718_
										- (i_718_ >>> 8);
								if (i_714_ == 0
										&& Class253_Sub3.anInt7696 != 255) {
									i_714_ = i_718_;
									i_718_ = is_687_[i_686_];
									i_718_ = (((((i_714_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_718_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_714_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_718_ & 0xff00) * Class253_Sub3.anInt7666)) & 0xff0000)) >> 8;
								}
								is_687_[i_686_] = i_718_;
							} else if (i_688_ == 2) {
								int i_719_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_685_]);
								if (i_719_ != 0) {
									int i_720_ = (((i_719_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_721_ = (((i_719_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									is_687_[i_686_++] = (((i_720_ | i_721_) >>> 8) + Class253_Sub3.anInt7683);
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_689_ == 2) {
							if (i_688_ == 1) {
								int i_722_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_685_]);
								if (i_722_ != 0) {
									int i_723_ = is_687_[i_686_];
									int i_724_ = i_722_ + i_723_;
									int i_725_ = ((i_722_ & 0xff00ff) + (i_723_ & 0xff00ff));
									i_723_ = ((i_725_ & 0x1000100) + (i_724_
											- i_725_ & 0x10000));
									is_687_[i_686_] = i_724_ - i_723_ | i_723_
											- (i_723_ >>> 8);
								}
							} else if (i_688_ == 0) {
								int i_726_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_685_]);
								if (i_726_ != 0) {
									int i_727_ = (((i_726_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_728_ = (((i_726_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_729_ = (((i_726_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									i_726_ = (i_727_ | i_728_ | i_729_) >>> 8;
									int i_730_ = is_687_[i_686_];
									int i_731_ = i_726_ + i_730_;
									int i_732_ = ((i_726_ & 0xff00ff) + (i_730_ & 0xff00ff));
									i_730_ = ((i_732_ & 0x1000100) + (i_731_
											- i_732_ & 0x10000));
									is_687_[i_686_] = i_731_ - i_730_ | i_730_
											- (i_730_ >>> 8);
								}
							} else if (i_688_ == 3) {
								int i_733_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_685_]);
								int i_734_ = Class253_Sub3.anInt7670;
								int i_735_ = i_733_ + i_734_;
								int i_736_ = ((i_733_ & 0xff00ff) + (i_734_ & 0xff00ff));
								int i_737_ = ((i_736_ & 0x1000100) + (i_735_
										- i_736_ & 0x10000));
								i_733_ = i_735_ - i_737_ | i_737_
										- (i_737_ >>> 8);
								i_737_ = is_687_[i_686_];
								i_735_ = i_733_ + i_737_;
								i_736_ = (i_733_ & 0xff00ff)
										+ (i_737_ & 0xff00ff);
								i_737_ = (i_736_ & 0x1000100)
										+ (i_735_ - i_736_ & 0x10000);
								is_687_[i_686_] = i_735_ - i_737_ | i_737_
										- (i_737_ >>> 8);
							} else if (i_688_ == 2) {
								int i_738_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_685_]);
								if (i_738_ != 0) {
									int i_739_ = (((i_738_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_740_ = (((i_738_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									i_738_ = (((i_739_ | i_740_) >>> 8) + Class253_Sub3.anInt7683);
									int i_741_ = is_687_[i_686_];
									int i_742_ = i_738_ + i_741_;
									int i_743_ = ((i_738_ & 0xff00ff) + (i_741_ & 0xff00ff));
									i_741_ = ((i_743_ & 0x1000100) + (i_742_
											- i_743_ & 0x10000));
									is_687_[i_686_] = i_742_ - i_741_ | i_741_
											- (i_741_ >>> 8);
								}
							}
						} else
							throw new IllegalArgumentException();
						i_680_ += Class253_Sub3.anInt7676;
					}
				}
				i_678_++;
				Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
				Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
				Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
			}
		} else if (Class253_Sub3.anInt7675 < 0) {
			for (int i_744_ = Class253_Sub3.anInt7692; i_744_ < 0; i_744_++) {
				int i_745_ = Class253_Sub3.anInt7695;
				int i_746_ = Class253_Sub3.anInt7677 + Class253_Sub3.anInt7686;
				int i_747_ = Class253_Sub3.anInt7694 + Class253_Sub3.anInt7697;
				int i_748_ = Class253_Sub3.anInt7687;
				if (i_746_ < 0) {
					int i_749_ = ((Class253_Sub3.anInt7676 - 1 - i_746_) / Class253_Sub3.anInt7676);
					i_748_ += i_749_;
					i_746_ += Class253_Sub3.anInt7676 * i_749_;
					i_747_ += Class253_Sub3.anInt7675 * i_749_;
					i_745_ += i_749_;
				}
				int i_750_;
				if ((i_750_ = (1 + i_746_
						- (((Class253_Sub3) this).anInt7679 << 12) - Class253_Sub3.anInt7676)
						/ Class253_Sub3.anInt7676) > i_748_)
					i_748_ = i_750_;
				if ((i_750_ = i_747_ - (((Class253_Sub3) this).anInt7671 << 12)) >= 0) {
					i_750_ = ((Class253_Sub3.anInt7675 - i_750_) / Class253_Sub3.anInt7675);
					i_748_ += i_750_;
					i_746_ += Class253_Sub3.anInt7676 * i_750_;
					i_747_ += Class253_Sub3.anInt7675 * i_750_;
					i_745_ += i_750_;
				}
				if ((i_750_ = ((i_747_ - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_748_)
					i_748_ = i_750_;
				for (/**/; i_748_ < 0; i_748_++) {
					int i_751_ = ((i_747_ >> 12)
							* ((Class253_Sub3) this).anInt7679 + (i_746_ >> 12));
					int i_752_ = i_745_++;
					int[] is_753_ = is;
					int i_754_ = i;
					int i_755_ = i_287_;
					if (i_755_ == 0) {
						if (i_754_ == 1)
							is_753_[i_752_] = (((Class253_Sub3_Sub3) this).anIntArray9002[i_751_]);
						else if (i_754_ == 0) {
							int i_756_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_751_++]);
							int i_757_ = (((i_756_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
							int i_758_ = ((i_756_ & 0xff00)
									* Class253_Sub3.anInt7690 & 0xff0000);
							int i_759_ = ((i_756_ & 0xff)
									* Class253_Sub3.anInt7685 & 0xff00);
							is_753_[i_752_] = (i_757_ | i_758_ | i_759_) >>> 8;
						} else if (i_754_ == 3) {
							int i_760_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_751_++]);
							int i_761_ = Class253_Sub3.anInt7670;
							int i_762_ = i_760_ + i_761_;
							int i_763_ = (i_760_ & 0xff00ff)
									+ (i_761_ & 0xff00ff);
							int i_764_ = ((i_763_ & 0x1000100) + (i_762_
									- i_763_ & 0x10000));
							is_753_[i_752_] = i_762_ - i_764_ | i_764_
									- (i_764_ >>> 8);
						} else if (i_754_ == 2) {
							int i_765_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_751_]);
							int i_766_ = (((i_765_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
							int i_767_ = ((i_765_ & 0xff00)
									* Class253_Sub3.anInt7696 & 0xff0000);
							is_753_[i_752_] = (((i_766_ | i_767_) >>> 8) + Class253_Sub3.anInt7683);
						} else
							throw new IllegalArgumentException();
					} else if (i_755_ == 1) {
						if (i_754_ == 1) {
							int i_768_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_751_]);
							if (i_768_ != 0)
								is_753_[i_752_] = i_768_;
						} else if (i_754_ == 0) {
							int i_769_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_751_]);
							if (i_769_ != 0) {
								if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
									int i_770_ = Class253_Sub3.anInt7670 >>> 24;
									int i_771_ = 256 - i_770_;
									int i_772_ = is_753_[i_752_];
									is_753_[i_752_] = ((((i_769_ & 0xff00ff)
											* i_770_ + (i_772_ & 0xff00ff)
											* i_771_) & ~0xff00ff) + (((i_769_ & 0xff00)
											* i_770_ + (i_772_ & 0xff00)
											* i_771_) & 0xff0000)) >> 8;
								} else if (Class253_Sub3.anInt7696 != 255) {
									int i_773_ = (((i_769_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_774_ = (((i_769_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_775_ = (((i_769_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									i_769_ = (i_773_ | i_774_ | i_775_) >>> 8;
									int i_776_ = is_753_[i_752_];
									is_753_[i_752_] = (((((i_769_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_776_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_769_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_776_ & 0xff00) * Class253_Sub3.anInt7666)) & 0xff0000)) >> 8;
								} else {
									int i_777_ = (((i_769_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_778_ = (((i_769_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_779_ = (((i_769_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									is_753_[i_752_] = (i_777_ | i_778_ | i_779_) >>> 8;
								}
							}
						} else if (i_754_ == 3) {
							int i_780_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_751_]);
							int i_781_ = Class253_Sub3.anInt7670;
							int i_782_ = i_780_ + i_781_;
							int i_783_ = (i_780_ & 0xff00ff)
									+ (i_781_ & 0xff00ff);
							int i_784_ = ((i_783_ & 0x1000100) + (i_782_
									- i_783_ & 0x10000));
							i_784_ = i_782_ - i_784_ | i_784_ - (i_784_ >>> 8);
							if (i_780_ == 0 && Class253_Sub3.anInt7696 != 255) {
								i_780_ = i_784_;
								i_784_ = is_753_[i_752_];
								i_784_ = (((((i_780_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_784_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_780_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_784_ & 0xff00) * Class253_Sub3.anInt7666)) & 0xff0000)) >> 8;
							}
							is_753_[i_752_] = i_784_;
						} else if (i_754_ == 2) {
							int i_785_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_751_]);
							if (i_785_ != 0) {
								int i_786_ = (((i_785_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
								int i_787_ = (((i_785_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
								is_753_[i_752_++] = (((i_786_ | i_787_) >>> 8) + Class253_Sub3.anInt7683);
							}
						} else
							throw new IllegalArgumentException();
					} else if (i_755_ == 2) {
						if (i_754_ == 1) {
							int i_788_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_751_]);
							if (i_788_ != 0) {
								int i_789_ = is_753_[i_752_];
								int i_790_ = i_788_ + i_789_;
								int i_791_ = ((i_788_ & 0xff00ff) + (i_789_ & 0xff00ff));
								i_789_ = (i_791_ & 0x1000100)
										+ (i_790_ - i_791_ & 0x10000);
								is_753_[i_752_] = i_790_ - i_789_ | i_789_
										- (i_789_ >>> 8);
							}
						} else if (i_754_ == 0) {
							int i_792_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_751_]);
							if (i_792_ != 0) {
								int i_793_ = (((i_792_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
								int i_794_ = (((i_792_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
								int i_795_ = (((i_792_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
								i_792_ = (i_793_ | i_794_ | i_795_) >>> 8;
								int i_796_ = is_753_[i_752_];
								int i_797_ = i_792_ + i_796_;
								int i_798_ = ((i_792_ & 0xff00ff) + (i_796_ & 0xff00ff));
								i_796_ = (i_798_ & 0x1000100)
										+ (i_797_ - i_798_ & 0x10000);
								is_753_[i_752_] = i_797_ - i_796_ | i_796_
										- (i_796_ >>> 8);
							}
						} else if (i_754_ == 3) {
							int i_799_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_751_]);
							int i_800_ = Class253_Sub3.anInt7670;
							int i_801_ = i_799_ + i_800_;
							int i_802_ = (i_799_ & 0xff00ff)
									+ (i_800_ & 0xff00ff);
							int i_803_ = ((i_802_ & 0x1000100) + (i_801_
									- i_802_ & 0x10000));
							i_799_ = i_801_ - i_803_ | i_803_ - (i_803_ >>> 8);
							i_803_ = is_753_[i_752_];
							i_801_ = i_799_ + i_803_;
							i_802_ = (i_799_ & 0xff00ff) + (i_803_ & 0xff00ff);
							i_803_ = (i_802_ & 0x1000100)
									+ (i_801_ - i_802_ & 0x10000);
							is_753_[i_752_] = i_801_ - i_803_ | i_803_
									- (i_803_ >>> 8);
						} else if (i_754_ == 2) {
							int i_804_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_751_]);
							if (i_804_ != 0) {
								int i_805_ = (((i_804_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
								int i_806_ = (((i_804_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
								i_804_ = (((i_805_ | i_806_) >>> 8) + Class253_Sub3.anInt7683);
								int i_807_ = is_753_[i_752_];
								int i_808_ = i_804_ + i_807_;
								int i_809_ = ((i_804_ & 0xff00ff) + (i_807_ & 0xff00ff));
								i_807_ = (i_809_ & 0x1000100)
										+ (i_808_ - i_809_ & 0x10000);
								is_753_[i_752_] = i_808_ - i_807_ | i_807_
										- (i_807_ >>> 8);
							}
						}
					} else
						throw new IllegalArgumentException();
					i_746_ += Class253_Sub3.anInt7676;
					i_747_ += Class253_Sub3.anInt7675;
				}
				Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
				Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
				Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
			}
		} else {
			for (int i_810_ = Class253_Sub3.anInt7692; i_810_ < 0; i_810_++) {
				int i_811_ = Class253_Sub3.anInt7695;
				int i_812_ = Class253_Sub3.anInt7677 + Class253_Sub3.anInt7686;
				int i_813_ = Class253_Sub3.anInt7694 + Class253_Sub3.anInt7697;
				int i_814_ = Class253_Sub3.anInt7687;
				if (i_812_ < 0) {
					int i_815_ = ((Class253_Sub3.anInt7676 - 1 - i_812_) / Class253_Sub3.anInt7676);
					i_814_ += i_815_;
					i_812_ += Class253_Sub3.anInt7676 * i_815_;
					i_813_ += Class253_Sub3.anInt7675 * i_815_;
					i_811_ += i_815_;
				}
				int i_816_;
				if ((i_816_ = (1 + i_812_
						- (((Class253_Sub3) this).anInt7679 << 12) - Class253_Sub3.anInt7676)
						/ Class253_Sub3.anInt7676) > i_814_)
					i_814_ = i_816_;
				if (i_813_ < 0) {
					i_816_ = ((Class253_Sub3.anInt7675 - 1 - i_813_) / Class253_Sub3.anInt7675);
					i_814_ += i_816_;
					i_812_ += Class253_Sub3.anInt7676 * i_816_;
					i_813_ += Class253_Sub3.anInt7675 * i_816_;
					i_811_ += i_816_;
				}
				if ((i_816_ = (1 + i_813_
						- (((Class253_Sub3) this).anInt7671 << 12) - Class253_Sub3.anInt7675)
						/ Class253_Sub3.anInt7675) > i_814_)
					i_814_ = i_816_;
				for (/**/; i_814_ < 0; i_814_++) {
					int i_817_ = ((i_813_ >> 12)
							* ((Class253_Sub3) this).anInt7679 + (i_812_ >> 12));
					int i_818_ = i_811_++;
					int[] is_819_ = is;
					int i_820_ = i;
					int i_821_ = i_287_;
					if (i_821_ == 0) {
						if (i_820_ == 1)
							is_819_[i_818_] = (((Class253_Sub3_Sub3) this).anIntArray9002[i_817_]);
						else if (i_820_ == 0) {
							int i_822_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_817_++]);
							int i_823_ = (((i_822_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
							int i_824_ = ((i_822_ & 0xff00)
									* Class253_Sub3.anInt7690 & 0xff0000);
							int i_825_ = ((i_822_ & 0xff)
									* Class253_Sub3.anInt7685 & 0xff00);
							is_819_[i_818_] = (i_823_ | i_824_ | i_825_) >>> 8;
						} else if (i_820_ == 3) {
							int i_826_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_817_++]);
							int i_827_ = Class253_Sub3.anInt7670;
							int i_828_ = i_826_ + i_827_;
							int i_829_ = (i_826_ & 0xff00ff)
									+ (i_827_ & 0xff00ff);
							int i_830_ = ((i_829_ & 0x1000100) + (i_828_
									- i_829_ & 0x10000));
							is_819_[i_818_] = i_828_ - i_830_ | i_830_
									- (i_830_ >>> 8);
						} else if (i_820_ == 2) {
							int i_831_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_817_]);
							int i_832_ = (((i_831_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
							int i_833_ = ((i_831_ & 0xff00)
									* Class253_Sub3.anInt7696 & 0xff0000);
							is_819_[i_818_] = (((i_832_ | i_833_) >>> 8) + Class253_Sub3.anInt7683);
						} else
							throw new IllegalArgumentException();
					} else if (i_821_ == 1) {
						if (i_820_ == 1) {
							int i_834_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_817_]);
							if (i_834_ != 0)
								is_819_[i_818_] = i_834_;
						} else if (i_820_ == 0) {
							int i_835_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_817_]);
							if (i_835_ != 0) {
								if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
									int i_836_ = Class253_Sub3.anInt7670 >>> 24;
									int i_837_ = 256 - i_836_;
									int i_838_ = is_819_[i_818_];
									is_819_[i_818_] = ((((i_835_ & 0xff00ff)
											* i_836_ + (i_838_ & 0xff00ff)
											* i_837_) & ~0xff00ff) + (((i_835_ & 0xff00)
											* i_836_ + (i_838_ & 0xff00)
											* i_837_) & 0xff0000)) >> 8;
								} else if (Class253_Sub3.anInt7696 != 255) {
									int i_839_ = (((i_835_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_840_ = (((i_835_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_841_ = (((i_835_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									i_835_ = (i_839_ | i_840_ | i_841_) >>> 8;
									int i_842_ = is_819_[i_818_];
									is_819_[i_818_] = (((((i_835_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_842_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_835_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_842_ & 0xff00) * Class253_Sub3.anInt7666)) & 0xff0000)) >> 8;
								} else {
									int i_843_ = (((i_835_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_844_ = (((i_835_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_845_ = (((i_835_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									is_819_[i_818_] = (i_843_ | i_844_ | i_845_) >>> 8;
								}
							}
						} else if (i_820_ == 3) {
							int i_846_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_817_]);
							int i_847_ = Class253_Sub3.anInt7670;
							int i_848_ = i_846_ + i_847_;
							int i_849_ = (i_846_ & 0xff00ff)
									+ (i_847_ & 0xff00ff);
							int i_850_ = ((i_849_ & 0x1000100) + (i_848_
									- i_849_ & 0x10000));
							i_850_ = i_848_ - i_850_ | i_850_ - (i_850_ >>> 8);
							if (i_846_ == 0 && Class253_Sub3.anInt7696 != 255) {
								i_846_ = i_850_;
								i_850_ = is_819_[i_818_];
								i_850_ = (((((i_846_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_850_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_846_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_850_ & 0xff00) * Class253_Sub3.anInt7666)) & 0xff0000)) >> 8;
							}
							is_819_[i_818_] = i_850_;
						} else if (i_820_ == 2) {
							int i_851_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_817_]);
							if (i_851_ != 0) {
								int i_852_ = (((i_851_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
								int i_853_ = (((i_851_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
								is_819_[i_818_++] = (((i_852_ | i_853_) >>> 8) + Class253_Sub3.anInt7683);
							}
						} else
							throw new IllegalArgumentException();
					} else if (i_821_ == 2) {
						if (i_820_ == 1) {
							int i_854_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_817_]);
							if (i_854_ != 0) {
								int i_855_ = is_819_[i_818_];
								int i_856_ = i_854_ + i_855_;
								int i_857_ = ((i_854_ & 0xff00ff) + (i_855_ & 0xff00ff));
								i_855_ = (i_857_ & 0x1000100)
										+ (i_856_ - i_857_ & 0x10000);
								is_819_[i_818_] = i_856_ - i_855_ | i_855_
										- (i_855_ >>> 8);
							}
						} else if (i_820_ == 0) {
							int i_858_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_817_]);
							if (i_858_ != 0) {
								int i_859_ = (((i_858_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
								int i_860_ = (((i_858_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
								int i_861_ = (((i_858_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
								i_858_ = (i_859_ | i_860_ | i_861_) >>> 8;
								int i_862_ = is_819_[i_818_];
								int i_863_ = i_858_ + i_862_;
								int i_864_ = ((i_858_ & 0xff00ff) + (i_862_ & 0xff00ff));
								i_862_ = (i_864_ & 0x1000100)
										+ (i_863_ - i_864_ & 0x10000);
								is_819_[i_818_] = i_863_ - i_862_ | i_862_
										- (i_862_ >>> 8);
							}
						} else if (i_820_ == 3) {
							int i_865_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_817_]);
							int i_866_ = Class253_Sub3.anInt7670;
							int i_867_ = i_865_ + i_866_;
							int i_868_ = (i_865_ & 0xff00ff)
									+ (i_866_ & 0xff00ff);
							int i_869_ = ((i_868_ & 0x1000100) + (i_867_
									- i_868_ & 0x10000));
							i_865_ = i_867_ - i_869_ | i_869_ - (i_869_ >>> 8);
							i_869_ = is_819_[i_818_];
							i_867_ = i_865_ + i_869_;
							i_868_ = (i_865_ & 0xff00ff) + (i_869_ & 0xff00ff);
							i_869_ = (i_868_ & 0x1000100)
									+ (i_867_ - i_868_ & 0x10000);
							is_819_[i_818_] = i_867_ - i_869_ | i_869_
									- (i_869_ >>> 8);
						} else if (i_820_ == 2) {
							int i_870_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_817_]);
							if (i_870_ != 0) {
								int i_871_ = (((i_870_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
								int i_872_ = (((i_870_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
								i_870_ = (((i_871_ | i_872_) >>> 8) + Class253_Sub3.anInt7683);
								int i_873_ = is_819_[i_818_];
								int i_874_ = i_870_ + i_873_;
								int i_875_ = ((i_870_ & 0xff00ff) + (i_873_ & 0xff00ff));
								i_873_ = (i_875_ & 0x1000100)
										+ (i_874_ - i_875_ & 0x10000);
								is_819_[i_818_] = i_874_ - i_873_ | i_873_
										- (i_873_ >>> 8);
							}
						}
					} else
						throw new IllegalArgumentException();
					i_812_ += Class253_Sub3.anInt7676;
					i_813_ += Class253_Sub3.anInt7675;
				}
				Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
				Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
				Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
			}
		}
	}

	final void method1624(int i, int i_876_, int i_877_, int i_878_, int i_879_) {
		if (((Class253_Sub3) this).aClass163_Sub1_7698.method2293())
			throw new IllegalStateException();
		int i_880_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5206);
		i += ((Class253_Sub3) this).anInt7689;
		i_876_ += ((Class253_Sub3) this).anInt7691;
		int i_881_ = i_876_ * i_880_ + i;
		int i_882_ = 0;
		int i_883_ = ((Class253_Sub3) this).anInt7671;
		int i_884_ = ((Class253_Sub3) this).anInt7679;
		int i_885_ = i_880_ - i_884_;
		int i_886_ = 0;
		if (i_876_ < (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177)) {
			int i_887_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177)
					- i_876_;
			i_883_ -= i_887_;
			i_876_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177);
			i_882_ += i_887_ * i_884_;
			i_881_ += i_887_ * i_880_;
		}
		if (i_876_ + i_883_ > (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5193))
			i_883_ -= i_876_
					+ i_883_
					- (((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5193);
		if (i < (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186)) {
			int i_888_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186)
					- i;
			i_884_ -= i_888_;
			i = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186);
			i_882_ += i_888_;
			i_881_ += i_888_;
			i_886_ += i_888_;
			i_885_ += i_888_;
		}
		if (i + i_884_ > (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5178)) {
			int i_889_ = i
					+ i_884_
					- (((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5178);
			i_884_ -= i_889_;
			i_886_ += i_889_;
			i_885_ += i_889_;
		}
		if (i_884_ > 0 && i_883_ > 0) {
			int[] is = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anIntArray5214);
			if (i_879_ == 0) {
				if (i_877_ == 1) {
					for (int i_890_ = -i_883_; i_890_ < 0; i_890_++) {
						int i_891_ = i_881_ + i_884_ - 3;
						while (i_881_ < i_891_) {
							is[i_881_++] = (((Class253_Sub3_Sub3) this).anIntArray9002[i_882_++]);
							is[i_881_++] = (((Class253_Sub3_Sub3) this).anIntArray9002[i_882_++]);
							is[i_881_++] = (((Class253_Sub3_Sub3) this).anIntArray9002[i_882_++]);
							is[i_881_++] = (((Class253_Sub3_Sub3) this).anIntArray9002[i_882_++]);
						}
						i_891_ += 3;
						while (i_881_ < i_891_)
							is[i_881_++] = (((Class253_Sub3_Sub3) this).anIntArray9002[i_882_++]);
						i_881_ += i_885_;
						i_882_ += i_886_;
					}
					return;
				}
				if (i_877_ == 0) {
					int i_892_ = (i_878_ & 0xff0000) >> 16;
					int i_893_ = (i_878_ & 0xff00) >> 8;
					int i_894_ = i_878_ & 0xff;
					for (int i_895_ = -i_883_; i_895_ < 0; i_895_++) {
						for (int i_896_ = -i_884_; i_896_ < 0; i_896_++) {
							int i_897_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_882_++]);
							int i_898_ = (i_897_ & 0xff0000) * i_892_
									& ~0xffffff;
							int i_899_ = (i_897_ & 0xff00) * i_893_ & 0xff0000;
							int i_900_ = (i_897_ & 0xff) * i_894_ & 0xff00;
							is[i_881_++] = (i_898_ | i_899_ | i_900_) >>> 8;
						}
						i_881_ += i_885_;
						i_882_ += i_886_;
					}
					return;
				}
				if (i_877_ == 3) {
					for (int i_901_ = -i_883_; i_901_ < 0; i_901_++) {
						for (int i_902_ = -i_884_; i_902_ < 0; i_902_++) {
							int i_903_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_882_++]);
							int i_904_ = i_903_ + i_878_;
							int i_905_ = (i_903_ & 0xff00ff)
									+ (i_878_ & 0xff00ff);
							int i_906_ = ((i_905_ & 0x1000100) + (i_904_
									- i_905_ & 0x10000));
							is[i_881_++] = i_904_ - i_906_ | i_906_
									- (i_906_ >>> 8);
						}
						i_881_ += i_885_;
						i_882_ += i_886_;
					}
					return;
				}
				if (i_877_ == 2) {
					int i_907_ = i_878_ >>> 24;
					int i_908_ = 256 - i_907_;
					int i_909_ = (i_878_ & 0xff00ff) * i_908_ & ~0xff00ff;
					int i_910_ = (i_878_ & 0xff00) * i_908_ & 0xff0000;
					i_878_ = (i_909_ | i_910_) >>> 8;
					for (int i_911_ = -i_883_; i_911_ < 0; i_911_++) {
						for (int i_912_ = -i_884_; i_912_ < 0; i_912_++) {
							int i_913_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_882_++]);
							i_909_ = (i_913_ & 0xff00ff) * i_907_ & ~0xff00ff;
							i_910_ = (i_913_ & 0xff00) * i_907_ & 0xff0000;
							is[i_881_++] = ((i_909_ | i_910_) >>> 8) + i_878_;
						}
						i_881_ += i_885_;
						i_882_ += i_886_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_879_ == 1) {
				if (i_877_ == 1) {
					for (int i_914_ = -i_883_; i_914_ < 0; i_914_++) {
						int i_915_ = i_881_ + i_884_ - 3;
						while (i_881_ < i_915_) {
							int i_916_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_882_++]);
							if (i_916_ != 0)
								is[i_881_++] = i_916_;
							else
								i_881_++;
							i_916_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_882_++]);
							if (i_916_ != 0)
								is[i_881_++] = i_916_;
							else
								i_881_++;
							i_916_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_882_++]);
							if (i_916_ != 0)
								is[i_881_++] = i_916_;
							else
								i_881_++;
							i_916_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_882_++]);
							if (i_916_ != 0)
								is[i_881_++] = i_916_;
							else
								i_881_++;
						}
						i_915_ += 3;
						while (i_881_ < i_915_) {
							int i_917_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_882_++]);
							if (i_917_ != 0)
								is[i_881_++] = i_917_;
							else
								i_881_++;
						}
						i_881_ += i_885_;
						i_882_ += i_886_;
					}
					return;
				}
				if (i_877_ == 0) {
					if ((i_878_ & 0xffffff) == 16777215) {
						int i_918_ = i_878_ >>> 24;
						int i_919_ = 256 - i_918_;
						for (int i_920_ = -i_883_; i_920_ < 0; i_920_++) {
							for (int i_921_ = -i_884_; i_921_ < 0; i_921_++) {
								int i_922_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_882_++]);
								if (i_922_ != 0) {
									int i_923_ = is[i_881_];
									is[i_881_++] = ((((i_922_ & 0xff00ff)
											* i_918_ + (i_923_ & 0xff00ff)
											* i_919_) & ~0xff00ff) + (((i_922_ & 0xff00)
											* i_918_ + (i_923_ & 0xff00)
											* i_919_) & 0xff0000)) >> 8;
								} else
									i_881_++;
							}
							i_881_ += i_885_;
							i_882_ += i_886_;
						}
					} else {
						int i_924_ = (i_878_ & 0xff0000) >> 16;
						int i_925_ = (i_878_ & 0xff00) >> 8;
						int i_926_ = i_878_ & 0xff;
						int i_927_ = i_878_ >>> 24;
						int i_928_ = 256 - i_927_;
						for (int i_929_ = -i_883_; i_929_ < 0; i_929_++) {
							for (int i_930_ = -i_884_; i_930_ < 0; i_930_++) {
								int i_931_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_882_++]);
								if (i_931_ != 0) {
									if (i_927_ != 255) {
										int i_932_ = ((i_931_ & 0xff0000)
												* i_924_ & ~0xffffff);
										int i_933_ = ((i_931_ & 0xff00)
												* i_925_ & 0xff0000);
										int i_934_ = ((i_931_ & 0xff) * i_926_ & 0xff00);
										i_931_ = (i_932_ | i_933_ | i_934_) >>> 8;
										int i_935_ = is[i_881_];
										is[i_881_++] = ((((i_931_ & 0xff00ff)
												* i_927_ + ((i_935_ & 0xff00ff) * i_928_)) & ~0xff00ff) + (((i_931_ & 0xff00)
												* i_927_ + ((i_935_ & 0xff00) * i_928_)) & 0xff0000)) >> 8;
									} else {
										int i_936_ = ((i_931_ & 0xff0000)
												* i_924_ & ~0xffffff);
										int i_937_ = ((i_931_ & 0xff00)
												* i_925_ & 0xff0000);
										int i_938_ = ((i_931_ & 0xff) * i_926_ & 0xff00);
										is[i_881_++] = (i_936_ | i_937_ | i_938_) >>> 8;
									}
								} else
									i_881_++;
							}
							i_881_ += i_885_;
							i_882_ += i_886_;
						}
						return;
					}
					return;
				}
				if (i_877_ == 3) {
					int i_939_ = i_878_ >>> 24;
					int i_940_ = 256 - i_939_;
					for (int i_941_ = -i_883_; i_941_ < 0; i_941_++) {
						for (int i_942_ = -i_884_; i_942_ < 0; i_942_++) {
							int i_943_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_882_++]);
							int i_944_ = i_943_ + i_878_;
							int i_945_ = (i_943_ & 0xff00ff)
									+ (i_878_ & 0xff00ff);
							int i_946_ = ((i_945_ & 0x1000100) + (i_944_
									- i_945_ & 0x10000));
							i_946_ = i_944_ - i_946_ | i_946_ - (i_946_ >>> 8);
							if (i_943_ == 0 && i_939_ != 255) {
								i_943_ = i_946_;
								i_946_ = is[i_881_];
								i_946_ = ((((i_943_ & 0xff00ff) * i_939_ + (i_946_ & 0xff00ff)
										* i_940_) & ~0xff00ff) + (((i_943_ & 0xff00)
										* i_939_ + (i_946_ & 0xff00) * i_940_) & 0xff0000)) >> 8;
							}
							is[i_881_++] = i_946_;
						}
						i_881_ += i_885_;
						i_882_ += i_886_;
					}
					return;
				}
				if (i_877_ == 2) {
					int i_947_ = i_878_ >>> 24;
					int i_948_ = 256 - i_947_;
					int i_949_ = (i_878_ & 0xff00ff) * i_948_ & ~0xff00ff;
					int i_950_ = (i_878_ & 0xff00) * i_948_ & 0xff0000;
					i_878_ = (i_949_ | i_950_) >>> 8;
					for (int i_951_ = -i_883_; i_951_ < 0; i_951_++) {
						for (int i_952_ = -i_884_; i_952_ < 0; i_952_++) {
							int i_953_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_882_++]);
							if (i_953_ != 0) {
								i_949_ = (i_953_ & 0xff00ff) * i_947_
										& ~0xff00ff;
								i_950_ = (i_953_ & 0xff00) * i_947_ & 0xff0000;
								is[i_881_++] = ((i_949_ | i_950_) >>> 8)
										+ i_878_;
							} else
								i_881_++;
						}
						i_881_ += i_885_;
						i_882_ += i_886_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_879_ == 2) {
				if (i_877_ == 1) {
					for (int i_954_ = -i_883_; i_954_ < 0; i_954_++) {
						for (int i_955_ = -i_884_; i_955_ < 0; i_955_++) {
							int i_956_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_882_++]);
							if (i_956_ != 0) {
								int i_957_ = is[i_881_];
								int i_958_ = i_956_ + i_957_;
								int i_959_ = ((i_956_ & 0xff00ff) + (i_957_ & 0xff00ff));
								i_957_ = (i_959_ & 0x1000100)
										+ (i_958_ - i_959_ & 0x10000);
								is[i_881_++] = i_958_ - i_957_ | i_957_
										- (i_957_ >>> 8);
							} else
								i_881_++;
						}
						i_881_ += i_885_;
						i_882_ += i_886_;
					}
					return;
				}
				if (i_877_ == 0) {
					int i_960_ = (i_878_ & 0xff0000) >> 16;
					int i_961_ = (i_878_ & 0xff00) >> 8;
					int i_962_ = i_878_ & 0xff;
					for (int i_963_ = -i_883_; i_963_ < 0; i_963_++) {
						for (int i_964_ = -i_884_; i_964_ < 0; i_964_++) {
							int i_965_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_882_++]);
							if (i_965_ != 0) {
								int i_966_ = (i_965_ & 0xff0000) * i_960_
										& ~0xffffff;
								int i_967_ = (i_965_ & 0xff00) * i_961_
										& 0xff0000;
								int i_968_ = (i_965_ & 0xff) * i_962_ & 0xff00;
								i_965_ = (i_966_ | i_967_ | i_968_) >>> 8;
								int i_969_ = is[i_881_];
								int i_970_ = i_965_ + i_969_;
								int i_971_ = ((i_965_ & 0xff00ff) + (i_969_ & 0xff00ff));
								i_969_ = (i_971_ & 0x1000100)
										+ (i_970_ - i_971_ & 0x10000);
								is[i_881_++] = i_970_ - i_969_ | i_969_
										- (i_969_ >>> 8);
							} else
								i_881_++;
						}
						i_881_ += i_885_;
						i_882_ += i_886_;
					}
					return;
				}
				if (i_877_ == 3) {
					for (int i_972_ = -i_883_; i_972_ < 0; i_972_++) {
						for (int i_973_ = -i_884_; i_973_ < 0; i_973_++) {
							int i_974_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_882_++]);
							int i_975_ = i_974_ + i_878_;
							int i_976_ = (i_974_ & 0xff00ff)
									+ (i_878_ & 0xff00ff);
							int i_977_ = ((i_976_ & 0x1000100) + (i_975_
									- i_976_ & 0x10000));
							i_974_ = i_975_ - i_977_ | i_977_ - (i_977_ >>> 8);
							i_977_ = is[i_881_];
							i_975_ = i_974_ + i_977_;
							i_976_ = (i_974_ & 0xff00ff) + (i_977_ & 0xff00ff);
							i_977_ = (i_976_ & 0x1000100)
									+ (i_975_ - i_976_ & 0x10000);
							is[i_881_++] = i_975_ - i_977_ | i_977_
									- (i_977_ >>> 8);
						}
						i_881_ += i_885_;
						i_882_ += i_886_;
					}
					return;
				}
				if (i_877_ == 2) {
					int i_978_ = i_878_ >>> 24;
					int i_979_ = 256 - i_978_;
					int i_980_ = (i_878_ & 0xff00ff) * i_979_ & ~0xff00ff;
					int i_981_ = (i_878_ & 0xff00) * i_979_ & 0xff0000;
					i_878_ = (i_980_ | i_981_) >>> 8;
					for (int i_982_ = -i_883_; i_982_ < 0; i_982_++) {
						for (int i_983_ = -i_884_; i_983_ < 0; i_983_++) {
							int i_984_ = (((Class253_Sub3_Sub3) this).anIntArray9002[i_882_++]);
							if (i_984_ != 0) {
								i_980_ = (i_984_ & 0xff00ff) * i_978_
										& ~0xff00ff;
								i_981_ = (i_984_ & 0xff00) * i_978_ & 0xff0000;
								i_984_ = ((i_980_ | i_981_) >>> 8) + i_878_;
								int i_985_ = is[i_881_];
								int i_986_ = i_984_ + i_985_;
								int i_987_ = ((i_984_ & 0xff00ff) + (i_985_ & 0xff00ff));
								i_985_ = (i_987_ & 0x1000100)
										+ (i_986_ - i_987_ & 0x10000);
								is[i_881_++] = i_986_ - i_985_ | i_985_
										- (i_985_ >>> 8);
							} else
								i_881_++;
						}
						i_881_ += i_885_;
						i_882_ += i_886_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}

	final void method3106(int i, int i_988_, int i_989_, int i_990_,
			int i_991_, int i_992_, int i_993_, int i_994_, int i_995_) {
		if (i_990_ > 0 && i_991_ > 0) {
			int i_996_ = 0;
			int i_997_ = 0;
			int i_998_ = (((Class253_Sub3) this).anInt7689
					+ ((Class253_Sub3) this).anInt7679 + ((Class253_Sub3) this).anInt7681);
			int i_999_ = (((Class253_Sub3) this).anInt7691
					+ ((Class253_Sub3) this).anInt7671 + ((Class253_Sub3) this).anInt7667);
			int i_1000_ = (i_998_ << 16) / i_990_;
			int i_1001_ = (i_999_ << 16) / i_991_;
			if (((Class253_Sub3) this).anInt7689 > 0) {
				int i_1002_ = (((((Class253_Sub3) this).anInt7689 << 16)
						+ i_1000_ - 1) / i_1000_);
				i += i_1002_;
				i_996_ += i_1002_ * i_1000_
						- (((Class253_Sub3) this).anInt7689 << 16);
			}
			if (((Class253_Sub3) this).anInt7691 > 0) {
				int i_1003_ = (((((Class253_Sub3) this).anInt7691 << 16)
						+ i_1001_ - 1) / i_1001_);
				i_988_ += i_1003_;
				i_997_ += i_1003_ * i_1001_
						- (((Class253_Sub3) this).anInt7691 << 16);
			}
			if (((Class253_Sub3) this).anInt7679 < i_998_)
				i_990_ = ((((Class253_Sub3) this).anInt7679 << 16) - i_996_
						+ i_1000_ - 1)
						/ i_1000_;
			if (((Class253_Sub3) this).anInt7671 < i_999_)
				i_991_ = ((((Class253_Sub3) this).anInt7671 << 16) - i_997_
						+ i_1001_ - 1)
						/ i_1001_;
			int i_1004_ = i
					+ i_988_
					* (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5206);
			int i_1005_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5206)
					- i_990_;
			if (i_988_ + i_991_ > (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5193))
				i_991_ -= i_988_
						+ i_991_
						- ((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5193;
			if (i_988_ < (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177)) {
				int i_1006_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177 - i_988_);
				i_991_ -= i_1006_;
				i_1004_ += i_1006_
						* (((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5206);
				i_997_ += i_1001_ * i_1006_;
			}
			if (i + i_990_ > (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5178)) {
				int i_1007_ = (i + i_990_ - ((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5178);
				i_990_ -= i_1007_;
				i_1005_ += i_1007_;
			}
			if (i < (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186)) {
				int i_1008_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186 - i);
				i_990_ -= i_1008_;
				i_1004_ += i_1008_;
				i_996_ += i_1000_ * i_1008_;
				i_1005_ += i_1008_;
			}
			float[] fs = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).aFloatArray5204);
			int[] is = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anIntArray5214);
			if (i_994_ == 0) {
				if (i_992_ == 1) {
					int i_1009_ = i_996_;
					for (int i_1010_ = -i_991_; i_1010_ < 0; i_1010_++) {
						int i_1011_ = ((i_997_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_1012_ = -i_990_; i_1012_ < 0; i_1012_++) {
							if ((float) i_989_ < fs[i_1004_]) {
								is[i_1004_] = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_996_ >> 16)
										+ i_1011_]);
								fs[i_1004_] = (float) i_989_;
							}
							i_996_ += i_1000_;
							i_1004_++;
						}
						i_997_ += i_1001_;
						i_996_ = i_1009_;
						i_1004_ += i_1005_;
					}
					return;
				}
				if (i_992_ == 0) {
					int i_1013_ = (i_993_ & 0xff0000) >> 16;
					int i_1014_ = (i_993_ & 0xff00) >> 8;
					int i_1015_ = i_993_ & 0xff;
					int i_1016_ = i_996_;
					for (int i_1017_ = -i_991_; i_1017_ < 0; i_1017_++) {
						int i_1018_ = ((i_997_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_1019_ = -i_990_; i_1019_ < 0; i_1019_++) {
							if ((float) i_989_ < fs[i_1004_]) {
								int i_1020_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_996_ >> 16)
										+ i_1018_]);
								int i_1021_ = ((i_1020_ & 0xff0000) * i_1013_ & ~0xffffff);
								int i_1022_ = (i_1020_ & 0xff00) * i_1014_
										& 0xff0000;
								int i_1023_ = (i_1020_ & 0xff) * i_1015_
										& 0xff00;
								is[i_1004_] = (i_1021_ | i_1022_ | i_1023_) >>> 8;
								fs[i_1004_] = (float) i_989_;
							}
							i_996_ += i_1000_;
							i_1004_++;
						}
						i_997_ += i_1001_;
						i_996_ = i_1016_;
						i_1004_ += i_1005_;
					}
					return;
				}
				if (i_992_ == 3) {
					int i_1024_ = i_996_;
					for (int i_1025_ = -i_991_; i_1025_ < 0; i_1025_++) {
						int i_1026_ = ((i_997_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_1027_ = -i_990_; i_1027_ < 0; i_1027_++) {
							if ((float) i_989_ < fs[i_1004_]) {
								int i_1028_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_996_ >> 16)
										+ i_1026_]);
								int i_1029_ = i_1028_ + i_993_;
								int i_1030_ = ((i_1028_ & 0xff00ff) + (i_993_ & 0xff00ff));
								int i_1031_ = ((i_1030_ & 0x1000100) + (i_1029_
										- i_1030_ & 0x10000));
								is[i_1004_] = i_1029_ - i_1031_ | i_1031_
										- (i_1031_ >>> 8);
								fs[i_1004_] = (float) i_989_;
							}
							i_996_ += i_1000_;
							i_1004_++;
						}
						i_997_ += i_1001_;
						i_996_ = i_1024_;
						i_1004_ += i_1005_;
					}
					return;
				}
				if (i_992_ == 2) {
					int i_1032_ = i_993_ >>> 24;
					int i_1033_ = 256 - i_1032_;
					int i_1034_ = (i_993_ & 0xff00ff) * i_1033_ & ~0xff00ff;
					int i_1035_ = (i_993_ & 0xff00) * i_1033_ & 0xff0000;
					i_993_ = (i_1034_ | i_1035_) >>> 8;
					int i_1036_ = i_996_;
					for (int i_1037_ = -i_991_; i_1037_ < 0; i_1037_++) {
						int i_1038_ = ((i_997_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_1039_ = -i_990_; i_1039_ < 0; i_1039_++) {
							if ((float) i_989_ < fs[i_1004_]) {
								int i_1040_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_996_ >> 16)
										+ i_1038_]);
								i_1034_ = ((i_1040_ & 0xff00ff) * i_1032_ & ~0xff00ff);
								i_1035_ = (i_1040_ & 0xff00) * i_1032_
										& 0xff0000;
								is[i_1004_] = ((i_1034_ | i_1035_) >>> 8)
										+ i_993_;
								fs[i_1004_] = (float) i_989_;
							}
							i_996_ += i_1000_;
							i_1004_++;
						}
						i_997_ += i_1001_;
						i_996_ = i_1036_;
						i_1004_ += i_1005_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_994_ == 1) {
				if (i_992_ == 1) {
					int i_1041_ = i_996_;
					for (int i_1042_ = -i_991_; i_1042_ < 0; i_1042_++) {
						int i_1043_ = ((i_997_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_1044_ = -i_990_; i_1044_ < 0; i_1044_++) {
							if ((float) i_989_ < fs[i_1004_]) {
								int i_1045_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_996_ >> 16)
										+ i_1043_]);
								if (i_1045_ != 0) {
									is[i_1004_] = i_1045_;
									fs[i_1004_] = (float) i_989_;
								}
							}
							i_996_ += i_1000_;
							i_1004_++;
						}
						i_997_ += i_1001_;
						i_996_ = i_1041_;
						i_1004_ += i_1005_;
					}
					return;
				}
				if (i_992_ == 0) {
					int i_1046_ = i_996_;
					if ((i_993_ & 0xffffff) == 16777215) {
						int i_1047_ = i_993_ >>> 24;
						int i_1048_ = 256 - i_1047_;
						for (int i_1049_ = -i_991_; i_1049_ < 0; i_1049_++) {
							int i_1050_ = ((i_997_ >> 16) * ((Class253_Sub3) this).anInt7679);
							for (int i_1051_ = -i_990_; i_1051_ < 0; i_1051_++) {
								if ((float) i_989_ < fs[i_1004_]) {
									int i_1052_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_996_ >> 16)
											+ i_1050_]);
									if (i_1052_ != 0) {
										int i_1053_ = is[i_1004_];
										is[i_1004_] = ((((i_1052_ & 0xff00ff)
												* i_1047_ + ((i_1053_ & 0xff00ff) * i_1048_)) & ~0xff00ff) + (((i_1052_ & 0xff00)
												* i_1047_ + ((i_1053_ & 0xff00) * i_1048_)) & 0xff0000)) >> 8;
										fs[i_1004_] = (float) i_989_;
									}
								}
								i_996_ += i_1000_;
								i_1004_++;
							}
							i_997_ += i_1001_;
							i_996_ = i_1046_;
							i_1004_ += i_1005_;
						}
					} else {
						int i_1054_ = (i_993_ & 0xff0000) >> 16;
						int i_1055_ = (i_993_ & 0xff00) >> 8;
						int i_1056_ = i_993_ & 0xff;
						int i_1057_ = i_993_ >>> 24;
						int i_1058_ = 256 - i_1057_;
						for (int i_1059_ = -i_991_; i_1059_ < 0; i_1059_++) {
							int i_1060_ = ((i_997_ >> 16) * ((Class253_Sub3) this).anInt7679);
							for (int i_1061_ = -i_990_; i_1061_ < 0; i_1061_++) {
								if ((float) i_989_ < fs[i_1004_]) {
									int i_1062_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_996_ >> 16)
											+ i_1060_]);
									if (i_1062_ != 0) {
										if (i_1057_ != 255) {
											int i_1063_ = (((i_1062_ & 0xff0000) * i_1054_) & ~0xffffff);
											int i_1064_ = ((i_1062_ & 0xff00)
													* i_1055_ & 0xff0000);
											int i_1065_ = ((i_1062_ & 0xff)
													* i_1056_ & 0xff00);
											i_1062_ = (i_1063_ | i_1064_ | i_1065_) >>> 8;
											int i_1066_ = is[i_1004_];
											is[i_1004_] = (((((i_1062_ & 0xff00ff) * i_1057_) + ((i_1066_ & 0xff00ff) * i_1058_)) & ~0xff00ff) + ((((i_1062_ & 0xff00) * i_1057_) + ((i_1066_ & 0xff00) * i_1058_)) & 0xff0000)) >> 8;
											fs[i_1004_] = (float) i_989_;
										} else {
											int i_1067_ = (((i_1062_ & 0xff0000) * i_1054_) & ~0xffffff);
											int i_1068_ = ((i_1062_ & 0xff00)
													* i_1055_ & 0xff0000);
											int i_1069_ = ((i_1062_ & 0xff)
													* i_1056_ & 0xff00);
											is[i_1004_] = (i_1067_ | i_1068_ | i_1069_) >>> 8;
											fs[i_1004_] = (float) i_989_;
										}
									}
								}
								i_996_ += i_1000_;
								i_1004_++;
							}
							i_997_ += i_1001_;
							i_996_ = i_1046_;
							i_1004_ += i_1005_;
						}
						return;
					}
					return;
				}
				if (i_992_ == 3) {
					int i_1070_ = i_996_;
					int i_1071_ = i_993_ >>> 24;
					int i_1072_ = 256 - i_1071_;
					for (int i_1073_ = -i_991_; i_1073_ < 0; i_1073_++) {
						int i_1074_ = ((i_997_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_1075_ = -i_990_; i_1075_ < 0; i_1075_++) {
							if ((float) i_989_ < fs[i_1004_]) {
								int i_1076_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_996_ >> 16)
										+ i_1074_]);
								int i_1077_ = i_1076_ + i_993_;
								int i_1078_ = ((i_1076_ & 0xff00ff) + (i_993_ & 0xff00ff));
								int i_1079_ = ((i_1078_ & 0x1000100) + (i_1077_
										- i_1078_ & 0x10000));
								i_1079_ = i_1077_ - i_1079_ | i_1079_
										- (i_1079_ >>> 8);
								if (i_1076_ == 0 && i_1071_ != 255) {
									i_1076_ = i_1079_;
									i_1079_ = is[i_1004_];
									i_1079_ = ((((i_1076_ & 0xff00ff) * i_1071_ + (i_1079_ & 0xff00ff)
											* i_1072_) & ~0xff00ff) + (((i_1076_ & 0xff00)
											* i_1071_ + (i_1079_ & 0xff00)
											* i_1072_) & 0xff0000)) >> 8;
								}
								is[i_1004_] = i_1079_;
								fs[i_1004_] = (float) i_989_;
							}
							i_996_ += i_1000_;
							i_1004_++;
						}
						i_997_ += i_1001_;
						i_996_ = i_1070_;
						i_1004_ += i_1005_;
					}
					return;
				}
				if (i_992_ == 2) {
					int i_1080_ = i_993_ >>> 24;
					int i_1081_ = 256 - i_1080_;
					int i_1082_ = (i_993_ & 0xff00ff) * i_1081_ & ~0xff00ff;
					int i_1083_ = (i_993_ & 0xff00) * i_1081_ & 0xff0000;
					i_993_ = (i_1082_ | i_1083_) >>> 8;
					int i_1084_ = i_996_;
					for (int i_1085_ = -i_991_; i_1085_ < 0; i_1085_++) {
						int i_1086_ = ((i_997_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_1087_ = -i_990_; i_1087_ < 0; i_1087_++) {
							if ((float) i_989_ < fs[i_1004_]) {
								int i_1088_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_996_ >> 16)
										+ i_1086_]);
								if (i_1088_ != 0) {
									i_1082_ = ((i_1088_ & 0xff00ff) * i_1080_ & ~0xff00ff);
									i_1083_ = ((i_1088_ & 0xff00) * i_1080_ & 0xff0000);
									is[i_1004_] = ((i_1082_ | i_1083_) >>> 8)
											+ i_993_;
									fs[i_1004_] = (float) i_989_;
								}
							}
							i_996_ += i_1000_;
							i_1004_++;
						}
						i_997_ += i_1001_;
						i_996_ = i_1084_;
						i_1004_ += i_1005_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_994_ == 2) {
				if (i_992_ == 1) {
					int i_1089_ = i_996_;
					for (int i_1090_ = -i_991_; i_1090_ < 0; i_1090_++) {
						int i_1091_ = ((i_997_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_1092_ = -i_990_; i_1092_ < 0; i_1092_++) {
							if ((float) i_989_ < fs[i_1004_]) {
								int i_1093_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_996_ >> 16)
										+ i_1091_]);
								if (i_1093_ != 0) {
									int i_1094_ = is[i_1004_];
									int i_1095_ = i_1093_ + i_1094_;
									int i_1096_ = ((i_1093_ & 0xff00ff) + (i_1094_ & 0xff00ff));
									i_1094_ = ((i_1096_ & 0x1000100) + (i_1095_
											- i_1096_ & 0x10000));
									is[i_1004_] = (i_1095_ - i_1094_ | i_1094_
											- (i_1094_ >>> 8));
									fs[i_1004_] = (float) i_989_;
								}
							}
							i_996_ += i_1000_;
							i_1004_++;
						}
						i_997_ += i_1001_;
						i_996_ = i_1089_;
						i_1004_ += i_1005_;
					}
					return;
				}
				if (i_992_ == 0) {
					int i_1097_ = i_996_;
					int i_1098_ = (i_993_ & 0xff0000) >> 16;
					int i_1099_ = (i_993_ & 0xff00) >> 8;
					int i_1100_ = i_993_ & 0xff;
					for (int i_1101_ = -i_991_; i_1101_ < 0; i_1101_++) {
						int i_1102_ = ((i_997_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_1103_ = -i_990_; i_1103_ < 0; i_1103_++) {
							if ((float) i_989_ < fs[i_1004_]) {
								int i_1104_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_996_ >> 16)
										+ i_1102_]);
								if (i_1104_ != 0) {
									int i_1105_ = ((i_1104_ & 0xff0000)
											* i_1098_ & ~0xffffff);
									int i_1106_ = ((i_1104_ & 0xff00) * i_1099_ & 0xff0000);
									int i_1107_ = (i_1104_ & 0xff) * i_1100_
											& 0xff00;
									i_1104_ = (i_1105_ | i_1106_ | i_1107_) >>> 8;
									int i_1108_ = is[i_1004_];
									int i_1109_ = i_1104_ + i_1108_;
									int i_1110_ = ((i_1104_ & 0xff00ff) + (i_1108_ & 0xff00ff));
									i_1108_ = ((i_1110_ & 0x1000100) + (i_1109_
											- i_1110_ & 0x10000));
									is[i_1004_] = (i_1109_ - i_1108_ | i_1108_
											- (i_1108_ >>> 8));
									fs[i_1004_] = (float) i_989_;
								}
							}
							i_996_ += i_1000_;
							i_1004_++;
						}
						i_997_ += i_1001_;
						i_996_ = i_1097_;
						i_1004_ += i_1005_;
					}
					return;
				}
				if (i_992_ == 3) {
					int i_1111_ = i_996_;
					for (int i_1112_ = -i_991_; i_1112_ < 0; i_1112_++) {
						int i_1113_ = ((i_997_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_1114_ = -i_990_; i_1114_ < 0; i_1114_++) {
							if ((float) i_989_ < fs[i_1004_]) {
								int i_1115_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_996_ >> 16)
										+ i_1113_]);
								int i_1116_ = i_1115_ + i_993_;
								int i_1117_ = ((i_1115_ & 0xff00ff) + (i_993_ & 0xff00ff));
								int i_1118_ = ((i_1117_ & 0x1000100) + (i_1116_
										- i_1117_ & 0x10000));
								i_1115_ = i_1116_ - i_1118_ | i_1118_
										- (i_1118_ >>> 8);
								i_1118_ = is[i_1004_];
								i_1116_ = i_1115_ + i_1118_;
								i_1117_ = (i_1115_ & 0xff00ff)
										+ (i_1118_ & 0xff00ff);
								i_1118_ = ((i_1117_ & 0x1000100) + (i_1116_
										- i_1117_ & 0x10000));
								is[i_1004_] = i_1116_ - i_1118_ | i_1118_
										- (i_1118_ >>> 8);
								fs[i_1004_] = (float) i_989_;
							}
							i_996_ += i_1000_;
							i_1004_++;
						}
						i_997_ += i_1001_;
						i_996_ = i_1111_;
						i_1004_ += i_1005_;
					}
					return;
				}
				if (i_992_ == 2) {
					int i_1119_ = i_993_ >>> 24;
					int i_1120_ = 256 - i_1119_;
					int i_1121_ = (i_993_ & 0xff00ff) * i_1120_ & ~0xff00ff;
					int i_1122_ = (i_993_ & 0xff00) * i_1120_ & 0xff0000;
					i_993_ = (i_1121_ | i_1122_) >>> 8;
					int i_1123_ = i_996_;
					for (int i_1124_ = -i_991_; i_1124_ < 0; i_1124_++) {
						int i_1125_ = ((i_997_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_1126_ = -i_990_; i_1126_ < 0; i_1126_++) {
							if ((float) i_989_ < fs[i_1004_]) {
								int i_1127_ = (((Class253_Sub3_Sub3) this).anIntArray9002[(i_996_ >> 16)
										+ i_1125_]);
								if (i_1127_ != 0) {
									i_1121_ = ((i_1127_ & 0xff00ff) * i_1119_ & ~0xff00ff);
									i_1122_ = ((i_1127_ & 0xff00) * i_1119_ & 0xff0000);
									i_1127_ = ((i_1121_ | i_1122_) >>> 8)
											+ i_993_;
									int i_1128_ = is[i_1004_];
									int i_1129_ = i_1127_ + i_1128_;
									int i_1130_ = ((i_1127_ & 0xff00ff) + (i_1128_ & 0xff00ff));
									i_1128_ = ((i_1130_ & 0x1000100) + (i_1129_
											- i_1130_ & 0x10000));
									is[i_1004_] = (i_1129_ - i_1128_ | i_1128_
											- (i_1128_ >>> 8));
									fs[i_1004_] = (float) i_989_;
								}
							}
							i_996_ += i_1000_;
							i_1004_++;
						}
						i_997_ += i_1001_;
						i_996_ = i_1123_;
						i_1004_ += i_1005_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}

	Class253_Sub3_Sub3(Class163_Sub1 class163_sub1, int[] is, int i,
			int i_1131_, int i_1132_, int i_1133_, boolean bool) {
		super(class163_sub1, i_1132_, i_1133_);
		if (bool)
			((Class253_Sub3_Sub3) this).anIntArray9002 = new int[i_1132_
					* i_1133_];
		else
			((Class253_Sub3_Sub3) this).anIntArray9002 = is;
		i_1131_ -= ((Class253_Sub3) this).anInt7679;
		int i_1134_ = 0;
		for (int i_1135_ = 0; i_1135_ < i_1133_; i_1135_++) {
			for (int i_1136_ = 0; i_1136_ < i_1132_; i_1136_++) {
				int i_1137_ = is[i++];
				if (i_1137_ >>> 24 == 255)
					((Class253_Sub3_Sub3) this).anIntArray9002[i_1134_++] = (i_1137_ & 0xffffff) == 0 ? -16777215
							: i_1137_;
				else
					((Class253_Sub3_Sub3) this).anIntArray9002[i_1134_++] = 0;
			}
			i += i_1131_;
		}
	}
}
