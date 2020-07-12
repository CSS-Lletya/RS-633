/* Class253_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class253_Sub3_Sub1 extends Class253_Sub3 {
	private int[] anIntArray8561;
	private byte[] aByteArray8562;

	final void method1612(int i, int i_0_, Class72 class72, int i_1_, int i_2_) {
		if (((Class253_Sub3) this).aClass163_Sub1_7698.method2293())
			throw new IllegalStateException();
		i += ((Class253_Sub3) this).anInt7689;
		i_0_ += ((Class253_Sub3) this).anInt7691;
		int i_3_ = 0;
		int i_4_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5206);
		int i_5_ = ((Class253_Sub3) this).anInt7679;
		int i_6_ = ((Class253_Sub3) this).anInt7671;
		int i_7_ = i_4_ - i_5_;
		int i_8_ = 0;
		int i_9_ = i + i_0_ * i_4_;
		if (i_0_ < (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177)) {
			int i_10_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177)
					- i_0_;
			i_6_ -= i_10_;
			i_0_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177);
			i_3_ += i_10_ * i_5_;
			i_9_ += i_10_ * i_4_;
		}
		if (i_0_ + i_6_ > (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5193))
			i_6_ -= i_0_
					+ i_6_
					- (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5193);
		if (i < (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186)) {
			int i_11_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186)
					- i;
			i_5_ -= i_11_;
			i = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186);
			i_3_ += i_11_;
			i_9_ += i_11_;
			i_8_ += i_11_;
			i_7_ += i_11_;
		}
		if (i + i_5_ > (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5178)) {
			int i_12_ = (i + i_5_ - ((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5178);
			i_5_ -= i_12_;
			i_8_ += i_12_;
			i_7_ += i_12_;
		}
		if (i_5_ > 0 && i_6_ > 0) {
			Class72_Sub2 class72_sub2 = (Class72_Sub2) class72;
			int[] is = ((Class72_Sub2) class72_sub2).anIntArray6909;
			int[] is_13_ = ((Class72_Sub2) class72_sub2).anIntArray6911;
			int[] is_14_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anIntArray5214);
			int i_15_ = i_0_;
			if (i_2_ > i_15_) {
				i_15_ = i_2_;
				i_9_ += (i_2_ - i_0_) * i_4_;
				i_3_ += (i_2_ - i_0_) * ((Class253_Sub3) this).anInt7679;
			}
			int i_16_ = (i_2_ + is.length < i_0_ + i_6_ ? i_2_ + is.length
					: i_0_ + i_6_);
			for (int i_17_ = i_15_; i_17_ < i_16_; i_17_++) {
				int i_18_ = is[i_17_ - i_2_] + i_1_;
				int i_19_ = is_13_[i_17_ - i_2_];
				int i_20_ = i_5_;
				if (i > i_18_) {
					int i_21_ = i - i_18_;
					if (i_21_ >= i_19_) {
						i_3_ += i_5_ + i_8_;
						i_9_ += i_5_ + i_7_;
						continue;
					}
					i_19_ -= i_21_;
				} else {
					int i_22_ = i_18_ - i;
					if (i_22_ >= i_5_) {
						i_3_ += i_5_ + i_8_;
						i_9_ += i_5_ + i_7_;
						continue;
					}
					i_3_ += i_22_;
					i_20_ -= i_22_;
					i_9_ += i_22_;
				}
				int i_23_ = 0;
				if (i_20_ < i_19_)
					i_19_ = i_20_;
				else
					i_23_ = i_20_ - i_19_;
				for (int i_24_ = -i_19_; i_24_ < 0; i_24_++) {
					int i_25_ = aByteArray8562[i_3_++];
					if (i_25_ != 0)
						is_14_[i_9_++] = anIntArray8561[i_25_ & 0xff];
					else
						i_9_++;
				}
				i_3_ += i_23_ + i_8_;
				i_9_ += i_23_ + i_7_;
			}
		}
	}

	Class253_Sub3_Sub1(Class163_Sub1 class163_sub1, byte[] is, int[] is_26_,
			int i, int i_27_) {
		super(class163_sub1, i, i_27_);
		aByteArray8562 = is;
		anIntArray8561 = is_26_;
	}

	final void method3106(int i, int i_28_, int i_29_, int i_30_, int i_31_,
			int i_32_, int i_33_, int i_34_, int i_35_) {
		if (i_30_ > 0 && i_31_ > 0) {
			int i_36_ = 0;
			int i_37_ = 0;
			int i_38_ = (((Class253_Sub3) this).anInt7689
					+ ((Class253_Sub3) this).anInt7679 + ((Class253_Sub3) this).anInt7681);
			int i_39_ = (((Class253_Sub3) this).anInt7691
					+ ((Class253_Sub3) this).anInt7671 + ((Class253_Sub3) this).anInt7667);
			int i_40_ = (i_38_ << 16) / i_30_;
			int i_41_ = (i_39_ << 16) / i_31_;
			if (((Class253_Sub3) this).anInt7689 > 0) {
				int i_42_ = (((((Class253_Sub3) this).anInt7689 << 16) + i_40_ - 1) / i_40_);
				i += i_42_;
				i_36_ += i_42_ * i_40_
						- (((Class253_Sub3) this).anInt7689 << 16);
			}
			if (((Class253_Sub3) this).anInt7691 > 0) {
				int i_43_ = (((((Class253_Sub3) this).anInt7691 << 16) + i_41_ - 1) / i_41_);
				i_28_ += i_43_;
				i_37_ += i_43_ * i_41_
						- (((Class253_Sub3) this).anInt7691 << 16);
			}
			if (((Class253_Sub3) this).anInt7679 < i_38_)
				i_30_ = ((((Class253_Sub3) this).anInt7679 << 16) - i_36_
						+ i_40_ - 1)
						/ i_40_;
			if (((Class253_Sub3) this).anInt7671 < i_39_)
				i_31_ = ((((Class253_Sub3) this).anInt7671 << 16) - i_37_
						+ i_41_ - 1)
						/ i_41_;
			int i_44_ = i
					+ i_28_
					* (((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5206);
			int i_45_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5206)
					- i_30_;
			if (i_28_ + i_31_ > (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5193))
				i_31_ -= i_28_
						+ i_31_
						- ((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5193;
			if (i_28_ < (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177)) {
				int i_46_ = (((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5177 - i_28_);
				i_31_ -= i_46_;
				i_44_ += i_46_
						* (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5206);
				i_37_ += i_41_ * i_46_;
			}
			if (i + i_30_ > (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5178)) {
				int i_47_ = (i + i_30_ - ((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5178);
				i_30_ -= i_47_;
				i_45_ += i_47_;
			}
			if (i < (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186)) {
				int i_48_ = (((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5186 - i);
				i_30_ -= i_48_;
				i_44_ += i_48_;
				i_36_ += i_40_ * i_48_;
				i_45_ += i_48_;
			}
			float[] fs = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).aFloatArray5204);
			int[] is = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anIntArray5214);
			if (i_34_ == 0) {
				if (i_32_ == 1) {
					int i_49_ = i_36_;
					for (int i_50_ = -i_31_; i_50_ < 0; i_50_++) {
						int i_51_ = (i_37_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_52_ = -i_30_; i_52_ < 0; i_52_++) {
							if ((float) i_29_ < fs[i_44_]) {
								is[i_44_] = (anIntArray8561[(aByteArray8562[(i_36_ >> 16)
										+ i_51_] & 0xff)]);
								fs[i_44_] = (float) i_29_;
							}
							i_36_ += i_40_;
							i_44_++;
						}
						i_37_ += i_41_;
						i_36_ = i_49_;
						i_44_ += i_45_;
					}
					return;
				}
				if (i_32_ == 0) {
					int i_53_ = (i_33_ & 0xff0000) >> 16;
					int i_54_ = (i_33_ & 0xff00) >> 8;
					int i_55_ = i_33_ & 0xff;
					int i_56_ = i_36_;
					for (int i_57_ = -i_31_; i_57_ < 0; i_57_++) {
						int i_58_ = (i_37_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_59_ = -i_30_; i_59_ < 0; i_59_++) {
							if ((float) i_29_ < fs[i_44_]) {
								int i_60_ = (anIntArray8561[(aByteArray8562[(i_36_ >> 16)
										+ i_58_] & 0xff)]);
								int i_61_ = (i_60_ & 0xff0000) * i_53_
										& ~0xffffff;
								int i_62_ = (i_60_ & 0xff00) * i_54_ & 0xff0000;
								int i_63_ = (i_60_ & 0xff) * i_55_ & 0xff00;
								is[i_44_] = (i_61_ | i_62_ | i_63_) >>> 8;
								fs[i_44_] = (float) i_29_;
							}
							i_36_ += i_40_;
							i_44_++;
						}
						i_37_ += i_41_;
						i_36_ = i_56_;
						i_44_ += i_45_;
					}
					return;
				}
				if (i_32_ == 3) {
					int i_64_ = i_36_;
					for (int i_65_ = -i_31_; i_65_ < 0; i_65_++) {
						int i_66_ = (i_37_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_67_ = -i_30_; i_67_ < 0; i_67_++) {
							if ((float) i_29_ < fs[i_44_]) {
								byte i_68_ = aByteArray8562[(i_36_ >> 16)
										+ i_66_];
								int i_69_ = i_68_ > 0 ? anIntArray8561[i_68_]
										: 0;
								int i_70_ = i_69_ + i_33_;
								int i_71_ = (i_69_ & 0xff00ff)
										+ (i_33_ & 0xff00ff);
								int i_72_ = ((i_71_ & 0x1000100) + (i_70_
										- i_71_ & 0x10000));
								is[i_44_] = i_70_ - i_72_ | i_72_
										- (i_72_ >>> 8);
								fs[i_44_] = (float) i_29_;
							}
							i_36_ += i_40_;
							i_44_++;
						}
						i_37_ += i_41_;
						i_36_ = i_64_;
						i_44_ += i_45_;
					}
					return;
				}
				if (i_32_ == 2) {
					int i_73_ = i_33_ >>> 24;
					int i_74_ = 256 - i_73_;
					int i_75_ = (i_33_ & 0xff00ff) * i_74_ & ~0xff00ff;
					int i_76_ = (i_33_ & 0xff00) * i_74_ & 0xff0000;
					i_33_ = (i_75_ | i_76_) >>> 8;
					int i_77_ = i_36_;
					for (int i_78_ = -i_31_; i_78_ < 0; i_78_++) {
						int i_79_ = (i_37_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_80_ = -i_30_; i_80_ < 0; i_80_++) {
							if ((float) i_29_ < fs[i_44_]) {
								int i_81_ = (anIntArray8561[(aByteArray8562[(i_36_ >> 16)
										+ i_79_] & 0xff)]);
								i_75_ = (i_81_ & 0xff00ff) * i_73_ & ~0xff00ff;
								i_76_ = (i_81_ & 0xff00) * i_73_ & 0xff0000;
								is[i_44_] = ((i_75_ | i_76_) >>> 8) + i_33_;
								fs[i_44_] = (float) i_29_;
							}
							i_36_ += i_40_;
							i_44_++;
						}
						i_37_ += i_41_;
						i_36_ = i_77_;
						i_44_ += i_45_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_34_ == 1) {
				if (i_32_ == 1) {
					int i_82_ = i_36_;
					for (int i_83_ = -i_31_; i_83_ < 0; i_83_++) {
						int i_84_ = (i_37_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_85_ = -i_30_; i_85_ < 0; i_85_++) {
							if ((float) i_29_ < fs[i_44_]) {
								int i_86_ = aByteArray8562[(i_36_ >> 16)
										+ i_84_];
								if (i_86_ != 0) {
									is[i_44_] = anIntArray8561[i_86_ & 0xff];
									fs[i_44_] = (float) i_29_;
								}
							}
							i_36_ += i_40_;
							i_44_++;
						}
						i_37_ += i_41_;
						i_36_ = i_82_;
						i_44_ += i_45_;
					}
					return;
				}
				if (i_32_ == 0) {
					int i_87_ = i_36_;
					if ((i_33_ & 0xffffff) == 16777215) {
						int i_88_ = i_33_ >>> 24;
						int i_89_ = 256 - i_88_;
						for (int i_90_ = -i_31_; i_90_ < 0; i_90_++) {
							int i_91_ = ((i_37_ >> 16) * ((Class253_Sub3) this).anInt7679);
							for (int i_92_ = -i_30_; i_92_ < 0; i_92_++) {
								if ((float) i_29_ < fs[i_44_]) {
									int i_93_ = (aByteArray8562[(i_36_ >> 16)
											+ i_91_]);
									if (i_93_ != 0) {
										int i_94_ = anIntArray8561[i_93_ & 0xff];
										int i_95_ = is[i_44_];
										is[i_44_] = ((((i_94_ & 0xff00ff)
												* i_88_ + (i_95_ & 0xff00ff)
												* i_89_) & ~0xff00ff) + (((i_94_ & 0xff00)
												* i_88_ + (i_95_ & 0xff00)
												* i_89_) & 0xff0000)) >> 8;
										fs[i_44_] = (float) i_29_;
									}
								}
								i_36_ += i_40_;
								i_44_++;
							}
							i_37_ += i_41_;
							i_36_ = i_87_;
							i_44_ += i_45_;
						}
					} else {
						int i_96_ = (i_33_ & 0xff0000) >> 16;
						int i_97_ = (i_33_ & 0xff00) >> 8;
						int i_98_ = i_33_ & 0xff;
						int i_99_ = i_33_ >>> 24;
						int i_100_ = 256 - i_99_;
						for (int i_101_ = -i_31_; i_101_ < 0; i_101_++) {
							int i_102_ = ((i_37_ >> 16) * ((Class253_Sub3) this).anInt7679);
							for (int i_103_ = -i_30_; i_103_ < 0; i_103_++) {
								if ((float) i_29_ < fs[i_44_]) {
									int i_104_ = (aByteArray8562[(i_36_ >> 16)
											+ i_102_]);
									if (i_104_ != 0) {
										int i_105_ = anIntArray8561[i_104_ & 0xff];
										if (i_99_ != 255) {
											int i_106_ = ((i_105_ & 0xff0000)
													* i_96_ & ~0xffffff);
											int i_107_ = ((i_105_ & 0xff00)
													* i_97_ & 0xff0000);
											int i_108_ = ((i_105_ & 0xff)
													* i_98_ & 0xff00);
											i_105_ = (i_106_ | i_107_ | i_108_) >>> 8;
											int i_109_ = is[i_44_];
											is[i_44_] = (((((i_105_ & 0xff00ff) * i_99_) + ((i_109_ & 0xff00ff) * i_100_)) & ~0xff00ff) + ((((i_105_ & 0xff00) * i_99_) + ((i_109_ & 0xff00) * i_100_)) & 0xff0000)) >> 8;
											fs[i_44_] = (float) i_29_;
										} else {
											int i_110_ = ((i_105_ & 0xff0000)
													* i_96_ & ~0xffffff);
											int i_111_ = ((i_105_ & 0xff00)
													* i_97_ & 0xff0000);
											int i_112_ = ((i_105_ & 0xff)
													* i_98_ & 0xff00);
											is[i_44_] = (i_110_ | i_111_ | i_112_) >>> 8;
											fs[i_44_] = (float) i_29_;
										}
									}
								}
								i_36_ += i_40_;
								i_44_++;
							}
							i_37_ += i_41_;
							i_36_ = i_87_;
							i_44_ += i_45_;
						}
						return;
					}
					return;
				}
				if (i_32_ == 3) {
					int i_113_ = i_36_;
					int i_114_ = i_33_ >>> 24;
					int i_115_ = 256 - i_114_;
					for (int i_116_ = -i_31_; i_116_ < 0; i_116_++) {
						int i_117_ = (i_37_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_118_ = -i_30_; i_118_ < 0; i_118_++) {
							if ((float) i_29_ < fs[i_44_]) {
								byte i_119_ = aByteArray8562[(i_36_ >> 16)
										+ i_117_];
								int i_120_ = i_119_ > 0 ? anIntArray8561[i_119_]
										: 0;
								int i_121_ = i_120_ + i_33_;
								int i_122_ = (i_120_ & 0xff00ff)
										+ (i_33_ & 0xff00ff);
								int i_123_ = ((i_122_ & 0x1000100) + (i_121_
										- i_122_ & 0x10000));
								i_123_ = i_121_ - i_123_ | i_123_
										- (i_123_ >>> 8);
								if (i_120_ == 0 && i_114_ != 255) {
									i_120_ = i_123_;
									i_123_ = is[i_44_];
									i_123_ = ((((i_120_ & 0xff00ff) * i_114_ + (i_123_ & 0xff00ff)
											* i_115_) & ~0xff00ff) + (((i_120_ & 0xff00)
											* i_114_ + (i_123_ & 0xff00)
											* i_115_) & 0xff0000)) >> 8;
								}
								is[i_44_] = i_123_;
								fs[i_44_] = (float) i_29_;
							}
							i_36_ += i_40_;
							i_44_++;
						}
						i_37_ += i_41_;
						i_36_ = i_113_;
						i_44_ += i_45_;
					}
					return;
				}
				if (i_32_ == 2) {
					int i_124_ = i_33_ >>> 24;
					int i_125_ = 256 - i_124_;
					int i_126_ = (i_33_ & 0xff00ff) * i_125_ & ~0xff00ff;
					int i_127_ = (i_33_ & 0xff00) * i_125_ & 0xff0000;
					i_33_ = (i_126_ | i_127_) >>> 8;
					int i_128_ = i_36_;
					for (int i_129_ = -i_31_; i_129_ < 0; i_129_++) {
						int i_130_ = (i_37_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_131_ = -i_30_; i_131_ < 0; i_131_++) {
							if ((float) i_29_ < fs[i_44_]) {
								int i_132_ = aByteArray8562[(i_36_ >> 16)
										+ i_130_];
								if (i_132_ != 0) {
									int i_133_ = anIntArray8561[i_132_ & 0xff];
									i_126_ = ((i_133_ & 0xff00ff) * i_124_ & ~0xff00ff);
									i_127_ = ((i_133_ & 0xff00) * i_124_ & 0xff0000);
									is[i_44_] = ((i_126_ | i_127_) >>> 8)
											+ i_33_;
									fs[i_44_] = (float) i_29_;
								}
							}
							i_36_ += i_40_;
							i_44_++;
						}
						i_37_ += i_41_;
						i_36_ = i_128_;
						i_44_ += i_45_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_34_ == 2) {
				if (i_32_ == 1) {
					int i_134_ = i_36_;
					for (int i_135_ = -i_31_; i_135_ < 0; i_135_++) {
						int i_136_ = (i_37_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_137_ = -i_30_; i_137_ < 0; i_137_++) {
							if ((float) i_29_ < fs[i_44_]) {
								int i_138_ = aByteArray8562[(i_36_ >> 16)
										+ i_136_];
								if (i_138_ != 0) {
									int i_139_ = anIntArray8561[i_138_ & 0xff];
									int i_140_ = is[i_44_];
									int i_141_ = i_139_ + i_140_;
									int i_142_ = ((i_139_ & 0xff00ff) + (i_140_ & 0xff00ff));
									i_140_ = ((i_142_ & 0x1000100) + (i_141_
											- i_142_ & 0x10000));
									is[i_44_] = i_141_ - i_140_ | i_140_
											- (i_140_ >>> 8);
									fs[i_44_] = (float) i_29_;
								}
							}
							i_36_ += i_40_;
							i_44_++;
						}
						i_37_ += i_41_;
						i_36_ = i_134_;
						i_44_ += i_45_;
					}
					return;
				}
				if (i_32_ == 0) {
					int i_143_ = i_36_;
					int i_144_ = (i_33_ & 0xff0000) >> 16;
					int i_145_ = (i_33_ & 0xff00) >> 8;
					int i_146_ = i_33_ & 0xff;
					for (int i_147_ = -i_31_; i_147_ < 0; i_147_++) {
						int i_148_ = (i_37_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_149_ = -i_30_; i_149_ < 0; i_149_++) {
							if ((float) i_29_ < fs[i_44_]) {
								int i_150_ = aByteArray8562[(i_36_ >> 16)
										+ i_148_];
								if (i_150_ != 0) {
									int i_151_ = anIntArray8561[i_150_ & 0xff];
									int i_152_ = ((i_151_ & 0xff0000) * i_144_ & ~0xffffff);
									int i_153_ = ((i_151_ & 0xff00) * i_145_ & 0xff0000);
									int i_154_ = (i_151_ & 0xff) * i_146_
											& 0xff00;
									i_151_ = (i_152_ | i_153_ | i_154_) >>> 8;
									int i_155_ = is[i_44_];
									int i_156_ = i_151_ + i_155_;
									int i_157_ = ((i_151_ & 0xff00ff) + (i_155_ & 0xff00ff));
									i_155_ = ((i_157_ & 0x1000100) + (i_156_
											- i_157_ & 0x10000));
									is[i_44_] = i_156_ - i_155_ | i_155_
											- (i_155_ >>> 8);
									fs[i_44_] = (float) i_29_;
								}
							}
							i_36_ += i_40_;
							i_44_++;
						}
						i_37_ += i_41_;
						i_36_ = i_143_;
						i_44_ += i_45_;
					}
					return;
				}
				if (i_32_ == 3) {
					int i_158_ = i_36_;
					for (int i_159_ = -i_31_; i_159_ < 0; i_159_++) {
						int i_160_ = (i_37_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_161_ = -i_30_; i_161_ < 0; i_161_++) {
							if ((float) i_29_ < fs[i_44_]) {
								byte i_162_ = aByteArray8562[(i_36_ >> 16)
										+ i_160_];
								int i_163_ = i_162_ > 0 ? anIntArray8561[i_162_]
										: 0;
								int i_164_ = i_163_ + i_33_;
								int i_165_ = (i_163_ & 0xff00ff)
										+ (i_33_ & 0xff00ff);
								int i_166_ = ((i_165_ & 0x1000100) + (i_164_
										- i_165_ & 0x10000));
								i_163_ = i_164_ - i_166_ | i_166_
										- (i_166_ >>> 8);
								i_166_ = is[i_44_];
								i_164_ = i_163_ + i_166_;
								i_165_ = (i_163_ & 0xff00ff)
										+ (i_166_ & 0xff00ff);
								i_166_ = (i_165_ & 0x1000100)
										+ (i_164_ - i_165_ & 0x10000);
								is[i_44_] = i_164_ - i_166_ | i_166_
										- (i_166_ >>> 8);
								fs[i_44_] = (float) i_29_;
							}
							i_36_ += i_40_;
							i_44_++;
						}
						i_37_ += i_41_;
						i_36_ = i_158_;
						i_44_ += i_45_;
					}
					return;
				}
				if (i_32_ == 2) {
					int i_167_ = i_33_ >>> 24;
					int i_168_ = 256 - i_167_;
					int i_169_ = (i_33_ & 0xff00ff) * i_168_ & ~0xff00ff;
					int i_170_ = (i_33_ & 0xff00) * i_168_ & 0xff0000;
					i_33_ = (i_169_ | i_170_) >>> 8;
					int i_171_ = i_36_;
					for (int i_172_ = -i_31_; i_172_ < 0; i_172_++) {
						int i_173_ = (i_37_ >> 16)
								* ((Class253_Sub3) this).anInt7679;
						for (int i_174_ = -i_30_; i_174_ < 0; i_174_++) {
							if ((float) i_29_ < fs[i_44_]) {
								int i_175_ = aByteArray8562[(i_36_ >> 16)
										+ i_173_];
								if (i_175_ != 0) {
									int i_176_ = anIntArray8561[i_175_ & 0xff];
									i_169_ = ((i_176_ & 0xff00ff) * i_167_ & ~0xff00ff);
									i_170_ = ((i_176_ & 0xff00) * i_167_ & 0xff0000);
									i_176_ = ((i_169_ | i_170_) >>> 8) + i_33_;
									int i_177_ = is[i_44_];
									int i_178_ = i_176_ + i_177_;
									int i_179_ = ((i_176_ & 0xff00ff) + (i_177_ & 0xff00ff));
									i_177_ = ((i_179_ & 0x1000100) + (i_178_
											- i_179_ & 0x10000));
									is[i_44_] = i_178_ - i_177_ | i_177_
											- (i_177_ >>> 8);
									fs[i_44_] = (float) i_29_;
								}
							}
							i_36_ += i_40_;
							i_44_++;
						}
						i_37_ += i_41_;
						i_36_ = i_171_;
						i_44_ += i_45_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}

	final void method3109(int[] is, int[] is_180_, int i, int i_181_) {
		int[] is_182_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anIntArray5214);
		if (Class253_Sub3.anInt7676 == 0) {
			if (Class253_Sub3.anInt7675 == 0) {
				int i_183_ = Class253_Sub3.anInt7692;
				while (i_183_ < 0) {
					int i_184_ = i_183_ + i_181_;
					if (i_184_ >= 0) {
						if (i_184_ >= is.length)
							break;
						int i_185_ = Class253_Sub3.anInt7695;
						int i_186_ = Class253_Sub3.anInt7677;
						int i_187_ = Class253_Sub3.anInt7694;
						int i_188_ = Class253_Sub3.anInt7687;
						if (i_186_ >= 0
								&& i_187_ >= 0
								&& i_186_
										- (((Class253_Sub3) this).anInt7679 << 12) < 0
								&& i_187_
										- (((Class253_Sub3) this).anInt7671 << 12) < 0) {
							int i_189_ = is[i_184_] - i;
							int i_190_ = -is_180_[i_184_];
							int i_191_ = i_189_
									- (i_185_ - Class253_Sub3.anInt7695);
							if (i_191_ > 0) {
								i_185_ += i_191_;
								i_188_ += i_191_;
								i_186_ += Class253_Sub3.anInt7676 * i_191_;
								i_187_ += Class253_Sub3.anInt7675 * i_191_;
							} else
								i_190_ -= i_191_;
							if (i_188_ < i_190_)
								i_188_ = i_190_;
							for (/**/; i_188_ < 0; i_188_++) {
								int i_192_ = (aByteArray8562[(((i_187_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_186_ >> 12))]);
								if (i_192_ != 0)
									is_182_[i_185_++] = anIntArray8561[i_192_ & 0xff];
								else
									i_185_++;
							}
						}
					}
					i_183_++;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			} else if (Class253_Sub3.anInt7675 < 0) {
				int i_193_ = Class253_Sub3.anInt7692;
				while (i_193_ < 0) {
					int i_194_ = i_193_ + i_181_;
					if (i_194_ >= 0) {
						if (i_194_ >= is.length)
							break;
						int i_195_ = Class253_Sub3.anInt7695;
						int i_196_ = Class253_Sub3.anInt7677;
						int i_197_ = (Class253_Sub3.anInt7694 + Class253_Sub3.anInt7697);
						int i_198_ = Class253_Sub3.anInt7687;
						if (i_196_ >= 0
								&& i_196_
										- (((Class253_Sub3) this).anInt7679 << 12) < 0) {
							int i_199_;
							if ((i_199_ = i_197_
									- (((Class253_Sub3) this).anInt7671 << 12)) >= 0) {
								i_199_ = ((Class253_Sub3.anInt7675 - i_199_) / Class253_Sub3.anInt7675);
								i_198_ += i_199_;
								i_197_ += Class253_Sub3.anInt7675 * i_199_;
								i_195_ += i_199_;
							}
							if ((i_199_ = ((i_197_ - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_198_)
								i_198_ = i_199_;
							int i_200_ = is[i_194_] - i;
							int i_201_ = -is_180_[i_194_];
							int i_202_ = i_200_
									- (i_195_ - Class253_Sub3.anInt7695);
							if (i_202_ > 0) {
								i_195_ += i_202_;
								i_198_ += i_202_;
								i_196_ += Class253_Sub3.anInt7676 * i_202_;
								i_197_ += Class253_Sub3.anInt7675 * i_202_;
							} else
								i_201_ -= i_202_;
							if (i_198_ < i_201_)
								i_198_ = i_201_;
							for (/**/; i_198_ < 0; i_198_++) {
								int i_203_ = (aByteArray8562[(((i_197_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_196_ >> 12))]);
								if (i_203_ != 0)
									is_182_[i_195_++] = anIntArray8561[i_203_ & 0xff];
								else
									i_195_++;
								i_197_ += Class253_Sub3.anInt7675;
							}
						}
					}
					i_193_++;
					Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			} else {
				int i_204_ = Class253_Sub3.anInt7692;
				while (i_204_ < 0) {
					int i_205_ = i_204_ + i_181_;
					if (i_205_ >= 0) {
						if (i_205_ >= is.length)
							break;
						int i_206_ = Class253_Sub3.anInt7695;
						int i_207_ = Class253_Sub3.anInt7677;
						int i_208_ = (Class253_Sub3.anInt7694 + Class253_Sub3.anInt7697);
						int i_209_ = Class253_Sub3.anInt7687;
						if (i_207_ >= 0
								&& i_207_
										- (((Class253_Sub3) this).anInt7679 << 12) < 0) {
							if (i_208_ < 0) {
								int i_210_ = ((Class253_Sub3.anInt7675 - 1 - i_208_) / Class253_Sub3.anInt7675);
								i_209_ += i_210_;
								i_208_ += Class253_Sub3.anInt7675 * i_210_;
								i_206_ += i_210_;
							}
							int i_211_;
							if ((i_211_ = ((1 + i_208_
									- (((Class253_Sub3) this).anInt7671 << 12) - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_209_)
								i_209_ = i_211_;
							int i_212_ = is[i_205_] - i;
							int i_213_ = -is_180_[i_205_];
							int i_214_ = i_212_
									- (i_206_ - Class253_Sub3.anInt7695);
							if (i_214_ > 0) {
								i_206_ += i_214_;
								i_209_ += i_214_;
								i_207_ += Class253_Sub3.anInt7676 * i_214_;
								i_208_ += Class253_Sub3.anInt7675 * i_214_;
							} else
								i_213_ -= i_214_;
							if (i_209_ < i_213_)
								i_209_ = i_213_;
							for (/**/; i_209_ < 0; i_209_++) {
								int i_215_ = (aByteArray8562[(((i_208_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_207_ >> 12))]);
								if (i_215_ != 0)
									is_182_[i_206_++] = anIntArray8561[i_215_ & 0xff];
								else
									i_206_++;
								i_208_ += Class253_Sub3.anInt7675;
							}
						}
					}
					i_204_++;
					Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			}
		} else if (Class253_Sub3.anInt7676 < 0) {
			if (Class253_Sub3.anInt7675 == 0) {
				int i_216_ = Class253_Sub3.anInt7692;
				while (i_216_ < 0) {
					int i_217_ = i_216_ + i_181_;
					if (i_217_ >= 0) {
						if (i_217_ >= is.length)
							break;
						int i_218_ = Class253_Sub3.anInt7695;
						int i_219_ = (Class253_Sub3.anInt7677 + Class253_Sub3.anInt7686);
						int i_220_ = Class253_Sub3.anInt7694;
						int i_221_ = Class253_Sub3.anInt7687;
						if (i_220_ >= 0
								&& i_220_
										- (((Class253_Sub3) this).anInt7671 << 12) < 0) {
							int i_222_;
							if ((i_222_ = i_219_
									- (((Class253_Sub3) this).anInt7679 << 12)) >= 0) {
								i_222_ = ((Class253_Sub3.anInt7676 - i_222_) / Class253_Sub3.anInt7676);
								i_221_ += i_222_;
								i_219_ += Class253_Sub3.anInt7676 * i_222_;
								i_218_ += i_222_;
							}
							if ((i_222_ = ((i_219_ - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_221_)
								i_221_ = i_222_;
							int i_223_ = is[i_217_] - i;
							int i_224_ = -is_180_[i_217_];
							int i_225_ = i_223_
									- (i_218_ - Class253_Sub3.anInt7695);
							if (i_225_ > 0) {
								i_218_ += i_225_;
								i_221_ += i_225_;
								i_219_ += Class253_Sub3.anInt7676 * i_225_;
								i_220_ += Class253_Sub3.anInt7675 * i_225_;
							} else
								i_224_ -= i_225_;
							if (i_221_ < i_224_)
								i_221_ = i_224_;
							for (/**/; i_221_ < 0; i_221_++) {
								int i_226_ = (aByteArray8562[(((i_220_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_219_ >> 12))]);
								if (i_226_ != 0)
									is_182_[i_218_++] = anIntArray8561[i_226_ & 0xff];
								else
									i_218_++;
								i_219_ += Class253_Sub3.anInt7676;
							}
						}
					}
					i_216_++;
					Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			} else if (Class253_Sub3.anInt7675 < 0) {
				int i_227_ = Class253_Sub3.anInt7692;
				while (i_227_ < 0) {
					int i_228_ = i_227_ + i_181_;
					if (i_228_ >= 0) {
						if (i_228_ >= is.length)
							break;
						int i_229_ = Class253_Sub3.anInt7695;
						int i_230_ = (Class253_Sub3.anInt7677 + Class253_Sub3.anInt7686);
						int i_231_ = (Class253_Sub3.anInt7694 + Class253_Sub3.anInt7697);
						int i_232_ = Class253_Sub3.anInt7687;
						int i_233_;
						if ((i_233_ = i_230_
								- (((Class253_Sub3) this).anInt7679 << 12)) >= 0) {
							i_233_ = ((Class253_Sub3.anInt7676 - i_233_) / Class253_Sub3.anInt7676);
							i_232_ += i_233_;
							i_230_ += Class253_Sub3.anInt7676 * i_233_;
							i_231_ += Class253_Sub3.anInt7675 * i_233_;
							i_229_ += i_233_;
						}
						if ((i_233_ = ((i_230_ - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_232_)
							i_232_ = i_233_;
						if ((i_233_ = i_231_
								- (((Class253_Sub3) this).anInt7671 << 12)) >= 0) {
							i_233_ = ((Class253_Sub3.anInt7675 - i_233_) / Class253_Sub3.anInt7675);
							i_232_ += i_233_;
							i_230_ += Class253_Sub3.anInt7676 * i_233_;
							i_231_ += Class253_Sub3.anInt7675 * i_233_;
							i_229_ += i_233_;
						}
						if ((i_233_ = ((i_231_ - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_232_)
							i_232_ = i_233_;
						int i_234_ = is[i_228_] - i;
						int i_235_ = -is_180_[i_228_];
						int i_236_ = i_234_
								- (i_229_ - Class253_Sub3.anInt7695);
						if (i_236_ > 0) {
							i_229_ += i_236_;
							i_232_ += i_236_;
							i_230_ += Class253_Sub3.anInt7676 * i_236_;
							i_231_ += Class253_Sub3.anInt7675 * i_236_;
						} else
							i_235_ -= i_236_;
						if (i_232_ < i_235_)
							i_232_ = i_235_;
						for (/**/; i_232_ < 0; i_232_++) {
							int i_237_ = (aByteArray8562[(((i_231_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_230_ >> 12))]);
							if (i_237_ != 0)
								is_182_[i_229_++] = anIntArray8561[i_237_ & 0xff];
							else
								i_229_++;
							i_230_ += Class253_Sub3.anInt7676;
							i_231_ += Class253_Sub3.anInt7675;
						}
					}
					i_227_++;
					Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
					Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			} else {
				int i_238_ = Class253_Sub3.anInt7692;
				while (i_238_ < 0) {
					int i_239_ = i_238_ + i_181_;
					if (i_239_ >= 0) {
						if (i_239_ >= is.length)
							break;
						int i_240_ = Class253_Sub3.anInt7695;
						int i_241_ = (Class253_Sub3.anInt7677 + Class253_Sub3.anInt7686);
						int i_242_ = (Class253_Sub3.anInt7694 + Class253_Sub3.anInt7697);
						int i_243_ = Class253_Sub3.anInt7687;
						int i_244_;
						if ((i_244_ = i_241_
								- (((Class253_Sub3) this).anInt7679 << 12)) >= 0) {
							i_244_ = ((Class253_Sub3.anInt7676 - i_244_) / Class253_Sub3.anInt7676);
							i_243_ += i_244_;
							i_241_ += Class253_Sub3.anInt7676 * i_244_;
							i_242_ += Class253_Sub3.anInt7675 * i_244_;
							i_240_ += i_244_;
						}
						if ((i_244_ = ((i_241_ - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_243_)
							i_243_ = i_244_;
						if (i_242_ < 0) {
							i_244_ = ((Class253_Sub3.anInt7675 - 1 - i_242_) / Class253_Sub3.anInt7675);
							i_243_ += i_244_;
							i_241_ += Class253_Sub3.anInt7676 * i_244_;
							i_242_ += Class253_Sub3.anInt7675 * i_244_;
							i_240_ += i_244_;
						}
						if ((i_244_ = ((1 + i_242_
								- (((Class253_Sub3) this).anInt7671 << 12) - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_243_)
							i_243_ = i_244_;
						int i_245_ = is[i_239_] - i;
						int i_246_ = -is_180_[i_239_];
						int i_247_ = i_245_
								- (i_240_ - Class253_Sub3.anInt7695);
						if (i_247_ > 0) {
							i_240_ += i_247_;
							i_243_ += i_247_;
							i_241_ += Class253_Sub3.anInt7676 * i_247_;
							i_242_ += Class253_Sub3.anInt7675 * i_247_;
						} else
							i_246_ -= i_247_;
						if (i_243_ < i_246_)
							i_243_ = i_246_;
						for (/**/; i_243_ < 0; i_243_++) {
							int i_248_ = (aByteArray8562[(((i_242_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_241_ >> 12))]);
							if (i_248_ != 0)
								is_182_[i_240_++] = anIntArray8561[i_248_ & 0xff];
							else
								i_240_++;
							i_241_ += Class253_Sub3.anInt7676;
							i_242_ += Class253_Sub3.anInt7675;
						}
					}
					i_238_++;
					Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
					Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			}
		} else if (Class253_Sub3.anInt7675 == 0) {
			int i_249_ = Class253_Sub3.anInt7692;
			while (i_249_ < 0) {
				int i_250_ = i_249_ + i_181_;
				if (i_250_ >= 0) {
					if (i_250_ >= is.length)
						break;
					int i_251_ = Class253_Sub3.anInt7695;
					int i_252_ = Class253_Sub3.anInt7677
							+ Class253_Sub3.anInt7686;
					int i_253_ = Class253_Sub3.anInt7694;
					int i_254_ = Class253_Sub3.anInt7687;
					if (i_253_ >= 0
							&& (i_253_
									- (((Class253_Sub3) this).anInt7671 << 12) < 0)) {
						if (i_252_ < 0) {
							int i_255_ = ((Class253_Sub3.anInt7676 - 1 - i_252_) / Class253_Sub3.anInt7676);
							i_254_ += i_255_;
							i_252_ += Class253_Sub3.anInt7676 * i_255_;
							i_251_ += i_255_;
						}
						int i_256_;
						if ((i_256_ = ((1 + i_252_
								- (((Class253_Sub3) this).anInt7679 << 12) - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_254_)
							i_254_ = i_256_;
						int i_257_ = is[i_250_] - i;
						int i_258_ = -is_180_[i_250_];
						int i_259_ = i_257_
								- (i_251_ - Class253_Sub3.anInt7695);
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
							int i_260_ = (aByteArray8562[(((i_253_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_252_ >> 12))]);
							if (i_260_ != 0)
								is_182_[i_251_++] = anIntArray8561[i_260_ & 0xff];
							else
								i_251_++;
							i_252_ += Class253_Sub3.anInt7676;
						}
					}
				}
				i_249_++;
				Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
				Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
				Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
			}
		} else if (Class253_Sub3.anInt7675 < 0) {
			int i_261_ = Class253_Sub3.anInt7692;
			while (i_261_ < 0) {
				int i_262_ = i_261_ + i_181_;
				if (i_262_ >= 0) {
					if (i_262_ >= is.length)
						break;
					int i_263_ = Class253_Sub3.anInt7695;
					int i_264_ = Class253_Sub3.anInt7677
							+ Class253_Sub3.anInt7686;
					int i_265_ = Class253_Sub3.anInt7694
							+ Class253_Sub3.anInt7697;
					int i_266_ = Class253_Sub3.anInt7687;
					if (i_264_ < 0) {
						int i_267_ = ((Class253_Sub3.anInt7676 - 1 - i_264_) / Class253_Sub3.anInt7676);
						i_266_ += i_267_;
						i_264_ += Class253_Sub3.anInt7676 * i_267_;
						i_265_ += Class253_Sub3.anInt7675 * i_267_;
						i_263_ += i_267_;
					}
					int i_268_;
					if ((i_268_ = ((1 + i_264_
							- (((Class253_Sub3) this).anInt7679 << 12) - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_266_)
						i_266_ = i_268_;
					if ((i_268_ = i_265_
							- (((Class253_Sub3) this).anInt7671 << 12)) >= 0) {
						i_268_ = ((Class253_Sub3.anInt7675 - i_268_) / Class253_Sub3.anInt7675);
						i_266_ += i_268_;
						i_264_ += Class253_Sub3.anInt7676 * i_268_;
						i_265_ += Class253_Sub3.anInt7675 * i_268_;
						i_263_ += i_268_;
					}
					if ((i_268_ = ((i_265_ - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_266_)
						i_266_ = i_268_;
					int i_269_ = is[i_262_] - i;
					int i_270_ = -is_180_[i_262_];
					int i_271_ = i_269_ - (i_263_ - Class253_Sub3.anInt7695);
					if (i_271_ > 0) {
						i_263_ += i_271_;
						i_266_ += i_271_;
						i_264_ += Class253_Sub3.anInt7676 * i_271_;
						i_265_ += Class253_Sub3.anInt7675 * i_271_;
					} else
						i_270_ -= i_271_;
					if (i_266_ < i_270_)
						i_266_ = i_270_;
					for (/**/; i_266_ < 0; i_266_++) {
						int i_272_ = (aByteArray8562[(((i_265_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_264_ >> 12))]);
						if (i_272_ != 0)
							is_182_[i_263_++] = anIntArray8561[i_272_ & 0xff];
						else
							i_263_++;
						i_264_ += Class253_Sub3.anInt7676;
						i_265_ += Class253_Sub3.anInt7675;
					}
				}
				i_261_++;
				Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
				Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
				Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
			}
		} else {
			int i_273_ = Class253_Sub3.anInt7692;
			while (i_273_ < 0) {
				int i_274_ = i_273_ + i_181_;
				if (i_274_ >= 0) {
					if (i_274_ >= is.length)
						break;
					int i_275_ = Class253_Sub3.anInt7695;
					int i_276_ = Class253_Sub3.anInt7677
							+ Class253_Sub3.anInt7686;
					int i_277_ = Class253_Sub3.anInt7694
							+ Class253_Sub3.anInt7697;
					int i_278_ = Class253_Sub3.anInt7687;
					if (i_276_ < 0) {
						int i_279_ = ((Class253_Sub3.anInt7676 - 1 - i_276_) / Class253_Sub3.anInt7676);
						i_278_ += i_279_;
						i_276_ += Class253_Sub3.anInt7676 * i_279_;
						i_277_ += Class253_Sub3.anInt7675 * i_279_;
						i_275_ += i_279_;
					}
					int i_280_;
					if ((i_280_ = ((1 + i_276_
							- (((Class253_Sub3) this).anInt7679 << 12) - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_278_)
						i_278_ = i_280_;
					if (i_277_ < 0) {
						i_280_ = ((Class253_Sub3.anInt7675 - 1 - i_277_) / Class253_Sub3.anInt7675);
						i_278_ += i_280_;
						i_276_ += Class253_Sub3.anInt7676 * i_280_;
						i_277_ += Class253_Sub3.anInt7675 * i_280_;
						i_275_ += i_280_;
					}
					if ((i_280_ = ((1 + i_277_
							- (((Class253_Sub3) this).anInt7671 << 12) - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_278_)
						i_278_ = i_280_;
					int i_281_ = is[i_274_] - i;
					int i_282_ = -is_180_[i_274_];
					int i_283_ = i_281_ - (i_275_ - Class253_Sub3.anInt7695);
					if (i_283_ > 0) {
						i_275_ += i_283_;
						i_278_ += i_283_;
						i_276_ += Class253_Sub3.anInt7676 * i_283_;
						i_277_ += Class253_Sub3.anInt7675 * i_283_;
					} else
						i_282_ -= i_283_;
					if (i_278_ < i_282_)
						i_278_ = i_282_;
					for (/**/; i_278_ < 0; i_278_++) {
						int i_284_ = (aByteArray8562[(((i_277_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_276_ >> 12))]);
						if (i_284_ != 0)
							is_182_[i_275_++] = anIntArray8561[i_284_ & 0xff];
						else
							i_275_++;
						i_276_ += Class253_Sub3.anInt7676;
						i_277_ += Class253_Sub3.anInt7675;
					}
				}
				i_273_++;
				Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
				Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
				Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
			}
		}
	}

	final void method1611(int i, int i_285_, int i_286_, int i_287_,
			int i_288_, int i_289_) {
		throw new IllegalStateException();
	}

	final void method3107(int i, int i_290_) {
		int[] is = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anIntArray5214);
		if (Class253_Sub3.anInt7676 == 0) {
			if (Class253_Sub3.anInt7675 == 0) {
				int i_291_ = Class253_Sub3.anInt7692;
				while (i_291_ < 0) {
					int i_292_ = Class253_Sub3.anInt7695;
					int i_293_ = Class253_Sub3.anInt7677;
					int i_294_ = Class253_Sub3.anInt7694;
					int i_295_ = Class253_Sub3.anInt7687;
					if (i_293_ >= 0
							&& i_294_ >= 0
							&& (i_293_
									- (((Class253_Sub3) this).anInt7679 << 12) < 0)
							&& (i_294_
									- (((Class253_Sub3) this).anInt7671 << 12) < 0)) {
						for (/**/; i_295_ < 0; i_295_++) {
							int i_296_ = (((i_294_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_293_ >> 12));
							int i_297_ = i_292_++;
							int[] is_298_ = is;
							int i_299_ = i;
							int i_300_ = i_290_;
							if (i_300_ == 0) {
								if (i_299_ == 1)
									is_298_[i_297_] = (anIntArray8561[aByteArray8562[i_296_] & 0xff]);
								else if (i_299_ == 0) {
									int i_301_ = (anIntArray8561[aByteArray8562[i_296_] & 0xff]);
									int i_302_ = (((i_301_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_303_ = (((i_301_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_304_ = (((i_301_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									is_298_[i_297_] = (i_302_ | i_303_ | i_304_) >>> 8;
								} else if (i_299_ == 3) {
									int i_305_ = (anIntArray8561[aByteArray8562[i_296_] & 0xff]);
									int i_306_ = Class253_Sub3.anInt7670;
									int i_307_ = i_305_ + i_306_;
									int i_308_ = ((i_305_ & 0xff00ff) + (i_306_ & 0xff00ff));
									int i_309_ = ((i_308_ & 0x1000100) + (i_307_
											- i_308_ & 0x10000));
									is_298_[i_297_] = i_307_ - i_309_ | i_309_
											- (i_309_ >>> 8);
								} else if (i_299_ == 2) {
									int i_310_ = (anIntArray8561[aByteArray8562[i_296_] & 0xff]);
									int i_311_ = (((i_310_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_312_ = (((i_310_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									is_298_[i_297_] = (((i_311_ | i_312_) >>> 8) + Class253_Sub3.anInt7683);
								} else
									throw new IllegalArgumentException();
							} else if (i_300_ == 1) {
								if (i_299_ == 1) {
									int i_313_ = aByteArray8562[i_296_];
									if (i_313_ != 0)
										is_298_[i_297_] = anIntArray8561[i_313_ & 0xff];
								} else if (i_299_ == 0) {
									int i_314_ = aByteArray8562[i_296_];
									if (i_314_ != 0) {
										int i_315_ = anIntArray8561[i_314_ & 0xff];
										if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
											int i_316_ = (Class253_Sub3.anInt7670 >>> 24);
											int i_317_ = 256 - i_316_;
											int i_318_ = is_298_[i_297_];
											is_298_[i_297_] = (((((i_315_ & 0xff00ff) * i_316_) + ((i_318_ & 0xff00ff) * i_317_)) & ~0xff00ff) + ((((i_315_ & 0xff00) * i_316_) + ((i_318_ & 0xff00) * i_317_)) & 0xff0000)) >> 8;
										} else if (Class253_Sub3.anInt7696 != 255) {
											int i_319_ = (((i_315_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
											int i_320_ = (((i_315_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
											int i_321_ = (((i_315_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
											i_315_ = (i_319_ | i_320_ | i_321_) >>> 8;
											int i_322_ = is_298_[i_297_];
											is_298_[i_297_] = (((((i_315_ & 0xff00ff) * (Class253_Sub3.anInt7696)) + ((i_322_ & 0xff00ff) * (Class253_Sub3.anInt7666))) & ~0xff00ff) + ((((i_315_ & 0xff00) * (Class253_Sub3.anInt7696)) + ((i_322_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
										} else {
											int i_323_ = (((i_315_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
											int i_324_ = (((i_315_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
											int i_325_ = (((i_315_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
											is_298_[i_297_] = (i_323_ | i_324_ | i_325_) >>> 8;
										}
									}
								} else if (i_299_ == 3) {
									byte i_326_ = aByteArray8562[i_296_];
									int i_327_ = (i_326_ > 0 ? anIntArray8561[i_326_]
											: 0);
									int i_328_ = Class253_Sub3.anInt7670;
									int i_329_ = i_327_ + i_328_;
									int i_330_ = ((i_327_ & 0xff00ff) + (i_328_ & 0xff00ff));
									int i_331_ = ((i_330_ & 0x1000100) + (i_329_
											- i_330_ & 0x10000));
									i_331_ = i_329_ - i_331_ | i_331_
											- (i_331_ >>> 8);
									if (i_327_ == 0
											&& Class253_Sub3.anInt7696 != 255) {
										i_327_ = i_331_;
										i_331_ = is_298_[i_297_];
										i_331_ = (((((i_327_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_331_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_327_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_331_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
									}
									is_298_[i_297_] = i_331_;
								} else if (i_299_ == 2) {
									int i_332_ = aByteArray8562[i_296_];
									if (i_332_ != 0) {
										int i_333_ = anIntArray8561[i_332_ & 0xff];
										int i_334_ = (((i_333_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
										int i_335_ = (((i_333_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
										is_298_[i_297_++] = (((i_334_ | i_335_) >>> 8) + Class253_Sub3.anInt7683);
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_300_ == 2) {
								if (i_299_ == 1) {
									int i_336_ = aByteArray8562[i_296_];
									if (i_336_ != 0) {
										int i_337_ = anIntArray8561[i_336_ & 0xff];
										int i_338_ = is_298_[i_297_];
										int i_339_ = i_337_ + i_338_;
										int i_340_ = ((i_337_ & 0xff00ff) + (i_338_ & 0xff00ff));
										i_338_ = ((i_340_ & 0x1000100) + (i_339_
												- i_340_ & 0x10000));
										is_298_[i_297_] = (i_339_ - i_338_ | i_338_
												- (i_338_ >>> 8));
									}
								} else if (i_299_ == 0) {
									int i_341_ = aByteArray8562[i_296_];
									if (i_341_ != 0) {
										int i_342_ = anIntArray8561[i_341_ & 0xff];
										int i_343_ = (((i_342_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_344_ = (((i_342_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_345_ = (((i_342_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										i_342_ = (i_343_ | i_344_ | i_345_) >>> 8;
										int i_346_ = is_298_[i_297_];
										int i_347_ = i_342_ + i_346_;
										int i_348_ = ((i_342_ & 0xff00ff) + (i_346_ & 0xff00ff));
										i_346_ = ((i_348_ & 0x1000100) + (i_347_
												- i_348_ & 0x10000));
										is_298_[i_297_] = (i_347_ - i_346_ | i_346_
												- (i_346_ >>> 8));
									}
								} else if (i_299_ == 3) {
									byte i_349_ = aByteArray8562[i_296_];
									int i_350_ = (i_349_ > 0 ? anIntArray8561[i_349_]
											: 0);
									int i_351_ = Class253_Sub3.anInt7670;
									int i_352_ = i_350_ + i_351_;
									int i_353_ = ((i_350_ & 0xff00ff) + (i_351_ & 0xff00ff));
									int i_354_ = ((i_353_ & 0x1000100) + (i_352_
											- i_353_ & 0x10000));
									i_354_ = i_352_ - i_354_ | i_354_
											- (i_354_ >>> 8);
									if (i_350_ == 0
											&& Class253_Sub3.anInt7696 != 255) {
										i_350_ = i_354_;
										i_354_ = is_298_[i_297_];
										i_354_ = (((((i_350_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_354_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_350_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_354_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
									}
									is_298_[i_297_] = i_354_;
								} else if (i_299_ == 2) {
									int i_355_ = aByteArray8562[i_296_];
									if (i_355_ != 0) {
										int i_356_ = anIntArray8561[i_355_ & 0xff];
										int i_357_ = (((i_356_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
										int i_358_ = (((i_356_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
										i_356_ = (((i_357_ | i_358_) >>> 8) + Class253_Sub3.anInt7683);
										int i_359_ = is_298_[i_297_];
										int i_360_ = i_356_ + i_359_;
										int i_361_ = ((i_356_ & 0xff00ff) + (i_359_ & 0xff00ff));
										i_359_ = ((i_361_ & 0x1000100) + (i_360_
												- i_361_ & 0x10000));
										is_298_[i_297_] = (i_360_ - i_359_ | i_359_
												- (i_359_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
						}
					}
					i_291_++;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			} else if (Class253_Sub3.anInt7675 < 0) {
				int i_362_ = Class253_Sub3.anInt7692;
				while (i_362_ < 0) {
					int i_363_ = Class253_Sub3.anInt7695;
					int i_364_ = Class253_Sub3.anInt7677;
					int i_365_ = Class253_Sub3.anInt7694
							+ Class253_Sub3.anInt7697;
					int i_366_ = Class253_Sub3.anInt7687;
					if (i_364_ >= 0
							&& (i_364_
									- (((Class253_Sub3) this).anInt7679 << 12) < 0)) {
						int i_367_;
						if ((i_367_ = i_365_
								- (((Class253_Sub3) this).anInt7671 << 12)) >= 0) {
							i_367_ = ((Class253_Sub3.anInt7675 - i_367_) / Class253_Sub3.anInt7675);
							i_366_ += i_367_;
							i_365_ += Class253_Sub3.anInt7675 * i_367_;
							i_363_ += i_367_;
						}
						if ((i_367_ = ((i_365_ - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_366_)
							i_366_ = i_367_;
						for (/**/; i_366_ < 0; i_366_++) {
							int i_368_ = (((i_365_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_364_ >> 12));
							int i_369_ = i_363_++;
							int[] is_370_ = is;
							int i_371_ = i;
							int i_372_ = i_290_;
							if (i_372_ == 0) {
								if (i_371_ == 1)
									is_370_[i_369_] = (anIntArray8561[aByteArray8562[i_368_] & 0xff]);
								else if (i_371_ == 0) {
									int i_373_ = (anIntArray8561[aByteArray8562[i_368_] & 0xff]);
									int i_374_ = (((i_373_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_375_ = (((i_373_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_376_ = (((i_373_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									is_370_[i_369_] = (i_374_ | i_375_ | i_376_) >>> 8;
								} else if (i_371_ == 3) {
									int i_377_ = (anIntArray8561[aByteArray8562[i_368_] & 0xff]);
									int i_378_ = Class253_Sub3.anInt7670;
									int i_379_ = i_377_ + i_378_;
									int i_380_ = ((i_377_ & 0xff00ff) + (i_378_ & 0xff00ff));
									int i_381_ = ((i_380_ & 0x1000100) + (i_379_
											- i_380_ & 0x10000));
									is_370_[i_369_] = i_379_ - i_381_ | i_381_
											- (i_381_ >>> 8);
								} else if (i_371_ == 2) {
									int i_382_ = (anIntArray8561[aByteArray8562[i_368_] & 0xff]);
									int i_383_ = (((i_382_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_384_ = (((i_382_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									is_370_[i_369_] = (((i_383_ | i_384_) >>> 8) + Class253_Sub3.anInt7683);
								} else
									throw new IllegalArgumentException();
							} else if (i_372_ == 1) {
								if (i_371_ == 1) {
									int i_385_ = aByteArray8562[i_368_];
									if (i_385_ != 0)
										is_370_[i_369_] = anIntArray8561[i_385_ & 0xff];
								} else if (i_371_ == 0) {
									int i_386_ = aByteArray8562[i_368_];
									if (i_386_ != 0) {
										int i_387_ = anIntArray8561[i_386_ & 0xff];
										if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
											int i_388_ = (Class253_Sub3.anInt7670 >>> 24);
											int i_389_ = 256 - i_388_;
											int i_390_ = is_370_[i_369_];
											is_370_[i_369_] = (((((i_387_ & 0xff00ff) * i_388_) + ((i_390_ & 0xff00ff) * i_389_)) & ~0xff00ff) + ((((i_387_ & 0xff00) * i_388_) + ((i_390_ & 0xff00) * i_389_)) & 0xff0000)) >> 8;
										} else if (Class253_Sub3.anInt7696 != 255) {
											int i_391_ = (((i_387_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
											int i_392_ = (((i_387_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
											int i_393_ = (((i_387_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
											i_387_ = (i_391_ | i_392_ | i_393_) >>> 8;
											int i_394_ = is_370_[i_369_];
											is_370_[i_369_] = (((((i_387_ & 0xff00ff) * (Class253_Sub3.anInt7696)) + ((i_394_ & 0xff00ff) * (Class253_Sub3.anInt7666))) & ~0xff00ff) + ((((i_387_ & 0xff00) * (Class253_Sub3.anInt7696)) + ((i_394_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
										} else {
											int i_395_ = (((i_387_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
											int i_396_ = (((i_387_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
											int i_397_ = (((i_387_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
											is_370_[i_369_] = (i_395_ | i_396_ | i_397_) >>> 8;
										}
									}
								} else if (i_371_ == 3) {
									byte i_398_ = aByteArray8562[i_368_];
									int i_399_ = (i_398_ > 0 ? anIntArray8561[i_398_]
											: 0);
									int i_400_ = Class253_Sub3.anInt7670;
									int i_401_ = i_399_ + i_400_;
									int i_402_ = ((i_399_ & 0xff00ff) + (i_400_ & 0xff00ff));
									int i_403_ = ((i_402_ & 0x1000100) + (i_401_
											- i_402_ & 0x10000));
									i_403_ = i_401_ - i_403_ | i_403_
											- (i_403_ >>> 8);
									if (i_399_ == 0
											&& Class253_Sub3.anInt7696 != 255) {
										i_399_ = i_403_;
										i_403_ = is_370_[i_369_];
										i_403_ = (((((i_399_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_403_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_399_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_403_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
									}
									is_370_[i_369_] = i_403_;
								} else if (i_371_ == 2) {
									int i_404_ = aByteArray8562[i_368_];
									if (i_404_ != 0) {
										int i_405_ = anIntArray8561[i_404_ & 0xff];
										int i_406_ = (((i_405_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
										int i_407_ = (((i_405_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
										is_370_[i_369_++] = (((i_406_ | i_407_) >>> 8) + Class253_Sub3.anInt7683);
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_372_ == 2) {
								if (i_371_ == 1) {
									int i_408_ = aByteArray8562[i_368_];
									if (i_408_ != 0) {
										int i_409_ = anIntArray8561[i_408_ & 0xff];
										int i_410_ = is_370_[i_369_];
										int i_411_ = i_409_ + i_410_;
										int i_412_ = ((i_409_ & 0xff00ff) + (i_410_ & 0xff00ff));
										i_410_ = ((i_412_ & 0x1000100) + (i_411_
												- i_412_ & 0x10000));
										is_370_[i_369_] = (i_411_ - i_410_ | i_410_
												- (i_410_ >>> 8));
									}
								} else if (i_371_ == 0) {
									int i_413_ = aByteArray8562[i_368_];
									if (i_413_ != 0) {
										int i_414_ = anIntArray8561[i_413_ & 0xff];
										int i_415_ = (((i_414_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_416_ = (((i_414_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_417_ = (((i_414_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										i_414_ = (i_415_ | i_416_ | i_417_) >>> 8;
										int i_418_ = is_370_[i_369_];
										int i_419_ = i_414_ + i_418_;
										int i_420_ = ((i_414_ & 0xff00ff) + (i_418_ & 0xff00ff));
										i_418_ = ((i_420_ & 0x1000100) + (i_419_
												- i_420_ & 0x10000));
										is_370_[i_369_] = (i_419_ - i_418_ | i_418_
												- (i_418_ >>> 8));
									}
								} else if (i_371_ == 3) {
									byte i_421_ = aByteArray8562[i_368_];
									int i_422_ = (i_421_ > 0 ? anIntArray8561[i_421_]
											: 0);
									int i_423_ = Class253_Sub3.anInt7670;
									int i_424_ = i_422_ + i_423_;
									int i_425_ = ((i_422_ & 0xff00ff) + (i_423_ & 0xff00ff));
									int i_426_ = ((i_425_ & 0x1000100) + (i_424_
											- i_425_ & 0x10000));
									i_426_ = i_424_ - i_426_ | i_426_
											- (i_426_ >>> 8);
									if (i_422_ == 0
											&& Class253_Sub3.anInt7696 != 255) {
										i_422_ = i_426_;
										i_426_ = is_370_[i_369_];
										i_426_ = (((((i_422_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_426_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_422_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_426_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
									}
									is_370_[i_369_] = i_426_;
								} else if (i_371_ == 2) {
									int i_427_ = aByteArray8562[i_368_];
									if (i_427_ != 0) {
										int i_428_ = anIntArray8561[i_427_ & 0xff];
										int i_429_ = (((i_428_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
										int i_430_ = (((i_428_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
										i_428_ = (((i_429_ | i_430_) >>> 8) + Class253_Sub3.anInt7683);
										int i_431_ = is_370_[i_369_];
										int i_432_ = i_428_ + i_431_;
										int i_433_ = ((i_428_ & 0xff00ff) + (i_431_ & 0xff00ff));
										i_431_ = ((i_433_ & 0x1000100) + (i_432_
												- i_433_ & 0x10000));
										is_370_[i_369_] = (i_432_ - i_431_ | i_431_
												- (i_431_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_365_ += Class253_Sub3.anInt7675;
						}
					}
					i_362_++;
					Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			} else {
				int i_434_ = Class253_Sub3.anInt7692;
				while (i_434_ < 0) {
					int i_435_ = Class253_Sub3.anInt7695;
					int i_436_ = Class253_Sub3.anInt7677;
					int i_437_ = Class253_Sub3.anInt7694
							+ Class253_Sub3.anInt7697;
					int i_438_ = Class253_Sub3.anInt7687;
					if (i_436_ >= 0
							&& (i_436_
									- (((Class253_Sub3) this).anInt7679 << 12) < 0)) {
						if (i_437_ < 0) {
							int i_439_ = ((Class253_Sub3.anInt7675 - 1 - i_437_) / Class253_Sub3.anInt7675);
							i_438_ += i_439_;
							i_437_ += Class253_Sub3.anInt7675 * i_439_;
							i_435_ += i_439_;
						}
						int i_440_;
						if ((i_440_ = ((1 + i_437_
								- (((Class253_Sub3) this).anInt7671 << 12) - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_438_)
							i_438_ = i_440_;
						for (/**/; i_438_ < 0; i_438_++) {
							int i_441_ = (((i_437_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_436_ >> 12));
							int i_442_ = i_435_++;
							int[] is_443_ = is;
							int i_444_ = i;
							int i_445_ = i_290_;
							if (i_445_ == 0) {
								if (i_444_ == 1)
									is_443_[i_442_] = (anIntArray8561[aByteArray8562[i_441_] & 0xff]);
								else if (i_444_ == 0) {
									int i_446_ = (anIntArray8561[aByteArray8562[i_441_] & 0xff]);
									int i_447_ = (((i_446_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_448_ = (((i_446_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_449_ = (((i_446_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									is_443_[i_442_] = (i_447_ | i_448_ | i_449_) >>> 8;
								} else if (i_444_ == 3) {
									int i_450_ = (anIntArray8561[aByteArray8562[i_441_] & 0xff]);
									int i_451_ = Class253_Sub3.anInt7670;
									int i_452_ = i_450_ + i_451_;
									int i_453_ = ((i_450_ & 0xff00ff) + (i_451_ & 0xff00ff));
									int i_454_ = ((i_453_ & 0x1000100) + (i_452_
											- i_453_ & 0x10000));
									is_443_[i_442_] = i_452_ - i_454_ | i_454_
											- (i_454_ >>> 8);
								} else if (i_444_ == 2) {
									int i_455_ = (anIntArray8561[aByteArray8562[i_441_] & 0xff]);
									int i_456_ = (((i_455_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_457_ = (((i_455_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									is_443_[i_442_] = (((i_456_ | i_457_) >>> 8) + Class253_Sub3.anInt7683);
								} else
									throw new IllegalArgumentException();
							} else if (i_445_ == 1) {
								if (i_444_ == 1) {
									int i_458_ = aByteArray8562[i_441_];
									if (i_458_ != 0)
										is_443_[i_442_] = anIntArray8561[i_458_ & 0xff];
								} else if (i_444_ == 0) {
									int i_459_ = aByteArray8562[i_441_];
									if (i_459_ != 0) {
										int i_460_ = anIntArray8561[i_459_ & 0xff];
										if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
											int i_461_ = (Class253_Sub3.anInt7670 >>> 24);
											int i_462_ = 256 - i_461_;
											int i_463_ = is_443_[i_442_];
											is_443_[i_442_] = (((((i_460_ & 0xff00ff) * i_461_) + ((i_463_ & 0xff00ff) * i_462_)) & ~0xff00ff) + ((((i_460_ & 0xff00) * i_461_) + ((i_463_ & 0xff00) * i_462_)) & 0xff0000)) >> 8;
										} else if (Class253_Sub3.anInt7696 != 255) {
											int i_464_ = (((i_460_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
											int i_465_ = (((i_460_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
											int i_466_ = (((i_460_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
											i_460_ = (i_464_ | i_465_ | i_466_) >>> 8;
											int i_467_ = is_443_[i_442_];
											is_443_[i_442_] = (((((i_460_ & 0xff00ff) * (Class253_Sub3.anInt7696)) + ((i_467_ & 0xff00ff) * (Class253_Sub3.anInt7666))) & ~0xff00ff) + ((((i_460_ & 0xff00) * (Class253_Sub3.anInt7696)) + ((i_467_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
										} else {
											int i_468_ = (((i_460_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
											int i_469_ = (((i_460_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
											int i_470_ = (((i_460_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
											is_443_[i_442_] = (i_468_ | i_469_ | i_470_) >>> 8;
										}
									}
								} else if (i_444_ == 3) {
									byte i_471_ = aByteArray8562[i_441_];
									int i_472_ = (i_471_ > 0 ? anIntArray8561[i_471_]
											: 0);
									int i_473_ = Class253_Sub3.anInt7670;
									int i_474_ = i_472_ + i_473_;
									int i_475_ = ((i_472_ & 0xff00ff) + (i_473_ & 0xff00ff));
									int i_476_ = ((i_475_ & 0x1000100) + (i_474_
											- i_475_ & 0x10000));
									i_476_ = i_474_ - i_476_ | i_476_
											- (i_476_ >>> 8);
									if (i_472_ == 0
											&& Class253_Sub3.anInt7696 != 255) {
										i_472_ = i_476_;
										i_476_ = is_443_[i_442_];
										i_476_ = (((((i_472_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_476_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_472_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_476_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
									}
									is_443_[i_442_] = i_476_;
								} else if (i_444_ == 2) {
									int i_477_ = aByteArray8562[i_441_];
									if (i_477_ != 0) {
										int i_478_ = anIntArray8561[i_477_ & 0xff];
										int i_479_ = (((i_478_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
										int i_480_ = (((i_478_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
										is_443_[i_442_++] = (((i_479_ | i_480_) >>> 8) + Class253_Sub3.anInt7683);
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_445_ == 2) {
								if (i_444_ == 1) {
									int i_481_ = aByteArray8562[i_441_];
									if (i_481_ != 0) {
										int i_482_ = anIntArray8561[i_481_ & 0xff];
										int i_483_ = is_443_[i_442_];
										int i_484_ = i_482_ + i_483_;
										int i_485_ = ((i_482_ & 0xff00ff) + (i_483_ & 0xff00ff));
										i_483_ = ((i_485_ & 0x1000100) + (i_484_
												- i_485_ & 0x10000));
										is_443_[i_442_] = (i_484_ - i_483_ | i_483_
												- (i_483_ >>> 8));
									}
								} else if (i_444_ == 0) {
									int i_486_ = aByteArray8562[i_441_];
									if (i_486_ != 0) {
										int i_487_ = anIntArray8561[i_486_ & 0xff];
										int i_488_ = (((i_487_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_489_ = (((i_487_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_490_ = (((i_487_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										i_487_ = (i_488_ | i_489_ | i_490_) >>> 8;
										int i_491_ = is_443_[i_442_];
										int i_492_ = i_487_ + i_491_;
										int i_493_ = ((i_487_ & 0xff00ff) + (i_491_ & 0xff00ff));
										i_491_ = ((i_493_ & 0x1000100) + (i_492_
												- i_493_ & 0x10000));
										is_443_[i_442_] = (i_492_ - i_491_ | i_491_
												- (i_491_ >>> 8));
									}
								} else if (i_444_ == 3) {
									byte i_494_ = aByteArray8562[i_441_];
									int i_495_ = (i_494_ > 0 ? anIntArray8561[i_494_]
											: 0);
									int i_496_ = Class253_Sub3.anInt7670;
									int i_497_ = i_495_ + i_496_;
									int i_498_ = ((i_495_ & 0xff00ff) + (i_496_ & 0xff00ff));
									int i_499_ = ((i_498_ & 0x1000100) + (i_497_
											- i_498_ & 0x10000));
									i_499_ = i_497_ - i_499_ | i_499_
											- (i_499_ >>> 8);
									if (i_495_ == 0
											&& Class253_Sub3.anInt7696 != 255) {
										i_495_ = i_499_;
										i_499_ = is_443_[i_442_];
										i_499_ = (((((i_495_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_499_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_495_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_499_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
									}
									is_443_[i_442_] = i_499_;
								} else if (i_444_ == 2) {
									int i_500_ = aByteArray8562[i_441_];
									if (i_500_ != 0) {
										int i_501_ = anIntArray8561[i_500_ & 0xff];
										int i_502_ = (((i_501_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
										int i_503_ = (((i_501_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
										i_501_ = (((i_502_ | i_503_) >>> 8) + Class253_Sub3.anInt7683);
										int i_504_ = is_443_[i_442_];
										int i_505_ = i_501_ + i_504_;
										int i_506_ = ((i_501_ & 0xff00ff) + (i_504_ & 0xff00ff));
										i_504_ = ((i_506_ & 0x1000100) + (i_505_
												- i_506_ & 0x10000));
										is_443_[i_442_] = (i_505_ - i_504_ | i_504_
												- (i_504_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_437_ += Class253_Sub3.anInt7675;
						}
					}
					i_434_++;
					Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			}
		} else if (Class253_Sub3.anInt7676 < 0) {
			if (Class253_Sub3.anInt7675 == 0) {
				int i_507_ = Class253_Sub3.anInt7692;
				while (i_507_ < 0) {
					int i_508_ = Class253_Sub3.anInt7695;
					int i_509_ = Class253_Sub3.anInt7677
							+ Class253_Sub3.anInt7686;
					int i_510_ = Class253_Sub3.anInt7694;
					int i_511_ = Class253_Sub3.anInt7687;
					if (i_510_ >= 0
							&& (i_510_
									- (((Class253_Sub3) this).anInt7671 << 12) < 0)) {
						int i_512_;
						if ((i_512_ = i_509_
								- (((Class253_Sub3) this).anInt7679 << 12)) >= 0) {
							i_512_ = ((Class253_Sub3.anInt7676 - i_512_) / Class253_Sub3.anInt7676);
							i_511_ += i_512_;
							i_509_ += Class253_Sub3.anInt7676 * i_512_;
							i_508_ += i_512_;
						}
						if ((i_512_ = ((i_509_ - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_511_)
							i_511_ = i_512_;
						for (/**/; i_511_ < 0; i_511_++) {
							int i_513_ = (((i_510_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_509_ >> 12));
							int i_514_ = i_508_++;
							int[] is_515_ = is;
							int i_516_ = i;
							int i_517_ = i_290_;
							if (i_517_ == 0) {
								if (i_516_ == 1)
									is_515_[i_514_] = (anIntArray8561[aByteArray8562[i_513_] & 0xff]);
								else if (i_516_ == 0) {
									int i_518_ = (anIntArray8561[aByteArray8562[i_513_] & 0xff]);
									int i_519_ = (((i_518_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_520_ = (((i_518_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_521_ = (((i_518_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									is_515_[i_514_] = (i_519_ | i_520_ | i_521_) >>> 8;
								} else if (i_516_ == 3) {
									int i_522_ = (anIntArray8561[aByteArray8562[i_513_] & 0xff]);
									int i_523_ = Class253_Sub3.anInt7670;
									int i_524_ = i_522_ + i_523_;
									int i_525_ = ((i_522_ & 0xff00ff) + (i_523_ & 0xff00ff));
									int i_526_ = ((i_525_ & 0x1000100) + (i_524_
											- i_525_ & 0x10000));
									is_515_[i_514_] = i_524_ - i_526_ | i_526_
											- (i_526_ >>> 8);
								} else if (i_516_ == 2) {
									int i_527_ = (anIntArray8561[aByteArray8562[i_513_] & 0xff]);
									int i_528_ = (((i_527_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_529_ = (((i_527_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									is_515_[i_514_] = (((i_528_ | i_529_) >>> 8) + Class253_Sub3.anInt7683);
								} else
									throw new IllegalArgumentException();
							} else if (i_517_ == 1) {
								if (i_516_ == 1) {
									int i_530_ = aByteArray8562[i_513_];
									if (i_530_ != 0)
										is_515_[i_514_] = anIntArray8561[i_530_ & 0xff];
								} else if (i_516_ == 0) {
									int i_531_ = aByteArray8562[i_513_];
									if (i_531_ != 0) {
										int i_532_ = anIntArray8561[i_531_ & 0xff];
										if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
											int i_533_ = (Class253_Sub3.anInt7670 >>> 24);
											int i_534_ = 256 - i_533_;
											int i_535_ = is_515_[i_514_];
											is_515_[i_514_] = (((((i_532_ & 0xff00ff) * i_533_) + ((i_535_ & 0xff00ff) * i_534_)) & ~0xff00ff) + ((((i_532_ & 0xff00) * i_533_) + ((i_535_ & 0xff00) * i_534_)) & 0xff0000)) >> 8;
										} else if (Class253_Sub3.anInt7696 != 255) {
											int i_536_ = (((i_532_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
											int i_537_ = (((i_532_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
											int i_538_ = (((i_532_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
											i_532_ = (i_536_ | i_537_ | i_538_) >>> 8;
											int i_539_ = is_515_[i_514_];
											is_515_[i_514_] = (((((i_532_ & 0xff00ff) * (Class253_Sub3.anInt7696)) + ((i_539_ & 0xff00ff) * (Class253_Sub3.anInt7666))) & ~0xff00ff) + ((((i_532_ & 0xff00) * (Class253_Sub3.anInt7696)) + ((i_539_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
										} else {
											int i_540_ = (((i_532_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
											int i_541_ = (((i_532_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
											int i_542_ = (((i_532_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
											is_515_[i_514_] = (i_540_ | i_541_ | i_542_) >>> 8;
										}
									}
								} else if (i_516_ == 3) {
									byte i_543_ = aByteArray8562[i_513_];
									int i_544_ = (i_543_ > 0 ? anIntArray8561[i_543_]
											: 0);
									int i_545_ = Class253_Sub3.anInt7670;
									int i_546_ = i_544_ + i_545_;
									int i_547_ = ((i_544_ & 0xff00ff) + (i_545_ & 0xff00ff));
									int i_548_ = ((i_547_ & 0x1000100) + (i_546_
											- i_547_ & 0x10000));
									i_548_ = i_546_ - i_548_ | i_548_
											- (i_548_ >>> 8);
									if (i_544_ == 0
											&& Class253_Sub3.anInt7696 != 255) {
										i_544_ = i_548_;
										i_548_ = is_515_[i_514_];
										i_548_ = (((((i_544_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_548_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_544_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_548_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
									}
									is_515_[i_514_] = i_548_;
								} else if (i_516_ == 2) {
									int i_549_ = aByteArray8562[i_513_];
									if (i_549_ != 0) {
										int i_550_ = anIntArray8561[i_549_ & 0xff];
										int i_551_ = (((i_550_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
										int i_552_ = (((i_550_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
										is_515_[i_514_++] = (((i_551_ | i_552_) >>> 8) + Class253_Sub3.anInt7683);
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_517_ == 2) {
								if (i_516_ == 1) {
									int i_553_ = aByteArray8562[i_513_];
									if (i_553_ != 0) {
										int i_554_ = anIntArray8561[i_553_ & 0xff];
										int i_555_ = is_515_[i_514_];
										int i_556_ = i_554_ + i_555_;
										int i_557_ = ((i_554_ & 0xff00ff) + (i_555_ & 0xff00ff));
										i_555_ = ((i_557_ & 0x1000100) + (i_556_
												- i_557_ & 0x10000));
										is_515_[i_514_] = (i_556_ - i_555_ | i_555_
												- (i_555_ >>> 8));
									}
								} else if (i_516_ == 0) {
									int i_558_ = aByteArray8562[i_513_];
									if (i_558_ != 0) {
										int i_559_ = anIntArray8561[i_558_ & 0xff];
										int i_560_ = (((i_559_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_561_ = (((i_559_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_562_ = (((i_559_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										i_559_ = (i_560_ | i_561_ | i_562_) >>> 8;
										int i_563_ = is_515_[i_514_];
										int i_564_ = i_559_ + i_563_;
										int i_565_ = ((i_559_ & 0xff00ff) + (i_563_ & 0xff00ff));
										i_563_ = ((i_565_ & 0x1000100) + (i_564_
												- i_565_ & 0x10000));
										is_515_[i_514_] = (i_564_ - i_563_ | i_563_
												- (i_563_ >>> 8));
									}
								} else if (i_516_ == 3) {
									byte i_566_ = aByteArray8562[i_513_];
									int i_567_ = (i_566_ > 0 ? anIntArray8561[i_566_]
											: 0);
									int i_568_ = Class253_Sub3.anInt7670;
									int i_569_ = i_567_ + i_568_;
									int i_570_ = ((i_567_ & 0xff00ff) + (i_568_ & 0xff00ff));
									int i_571_ = ((i_570_ & 0x1000100) + (i_569_
											- i_570_ & 0x10000));
									i_571_ = i_569_ - i_571_ | i_571_
											- (i_571_ >>> 8);
									if (i_567_ == 0
											&& Class253_Sub3.anInt7696 != 255) {
										i_567_ = i_571_;
										i_571_ = is_515_[i_514_];
										i_571_ = (((((i_567_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_571_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_567_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_571_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
									}
									is_515_[i_514_] = i_571_;
								} else if (i_516_ == 2) {
									int i_572_ = aByteArray8562[i_513_];
									if (i_572_ != 0) {
										int i_573_ = anIntArray8561[i_572_ & 0xff];
										int i_574_ = (((i_573_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
										int i_575_ = (((i_573_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
										i_573_ = (((i_574_ | i_575_) >>> 8) + Class253_Sub3.anInt7683);
										int i_576_ = is_515_[i_514_];
										int i_577_ = i_573_ + i_576_;
										int i_578_ = ((i_573_ & 0xff00ff) + (i_576_ & 0xff00ff));
										i_576_ = ((i_578_ & 0x1000100) + (i_577_
												- i_578_ & 0x10000));
										is_515_[i_514_] = (i_577_ - i_576_ | i_576_
												- (i_576_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_509_ += Class253_Sub3.anInt7676;
						}
					}
					i_507_++;
					Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			} else if (Class253_Sub3.anInt7675 < 0) {
				int i_579_ = Class253_Sub3.anInt7692;
				while (i_579_ < 0) {
					int i_580_ = Class253_Sub3.anInt7695;
					int i_581_ = Class253_Sub3.anInt7677
							+ Class253_Sub3.anInt7686;
					int i_582_ = Class253_Sub3.anInt7694
							+ Class253_Sub3.anInt7697;
					int i_583_ = Class253_Sub3.anInt7687;
					int i_584_;
					if ((i_584_ = i_581_
							- (((Class253_Sub3) this).anInt7679 << 12)) >= 0) {
						i_584_ = ((Class253_Sub3.anInt7676 - i_584_) / Class253_Sub3.anInt7676);
						i_583_ += i_584_;
						i_581_ += Class253_Sub3.anInt7676 * i_584_;
						i_582_ += Class253_Sub3.anInt7675 * i_584_;
						i_580_ += i_584_;
					}
					if ((i_584_ = ((i_581_ - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_583_)
						i_583_ = i_584_;
					if ((i_584_ = i_582_
							- (((Class253_Sub3) this).anInt7671 << 12)) >= 0) {
						i_584_ = ((Class253_Sub3.anInt7675 - i_584_) / Class253_Sub3.anInt7675);
						i_583_ += i_584_;
						i_581_ += Class253_Sub3.anInt7676 * i_584_;
						i_582_ += Class253_Sub3.anInt7675 * i_584_;
						i_580_ += i_584_;
					}
					if ((i_584_ = ((i_582_ - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_583_)
						i_583_ = i_584_;
					for (/**/; i_583_ < 0; i_583_++) {
						int i_585_ = (((i_582_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_581_ >> 12));
						int i_586_ = i_580_++;
						int[] is_587_ = is;
						int i_588_ = i;
						int i_589_ = i_290_;
						if (i_589_ == 0) {
							if (i_588_ == 1)
								is_587_[i_586_] = (anIntArray8561[aByteArray8562[i_585_] & 0xff]);
							else if (i_588_ == 0) {
								int i_590_ = (anIntArray8561[aByteArray8562[i_585_] & 0xff]);
								int i_591_ = (((i_590_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
								int i_592_ = (((i_590_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
								int i_593_ = (((i_590_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
								is_587_[i_586_] = (i_591_ | i_592_ | i_593_) >>> 8;
							} else if (i_588_ == 3) {
								int i_594_ = (anIntArray8561[aByteArray8562[i_585_] & 0xff]);
								int i_595_ = Class253_Sub3.anInt7670;
								int i_596_ = i_594_ + i_595_;
								int i_597_ = ((i_594_ & 0xff00ff) + (i_595_ & 0xff00ff));
								int i_598_ = ((i_597_ & 0x1000100) + (i_596_
										- i_597_ & 0x10000));
								is_587_[i_586_] = i_596_ - i_598_ | i_598_
										- (i_598_ >>> 8);
							} else if (i_588_ == 2) {
								int i_599_ = (anIntArray8561[aByteArray8562[i_585_] & 0xff]);
								int i_600_ = (((i_599_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
								int i_601_ = (((i_599_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
								is_587_[i_586_] = (((i_600_ | i_601_) >>> 8) + Class253_Sub3.anInt7683);
							} else
								throw new IllegalArgumentException();
						} else if (i_589_ == 1) {
							if (i_588_ == 1) {
								int i_602_ = aByteArray8562[i_585_];
								if (i_602_ != 0)
									is_587_[i_586_] = anIntArray8561[i_602_ & 0xff];
							} else if (i_588_ == 0) {
								int i_603_ = aByteArray8562[i_585_];
								if (i_603_ != 0) {
									int i_604_ = anIntArray8561[i_603_ & 0xff];
									if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
										int i_605_ = Class253_Sub3.anInt7670 >>> 24;
										int i_606_ = 256 - i_605_;
										int i_607_ = is_587_[i_586_];
										is_587_[i_586_] = ((((i_604_ & 0xff00ff)
												* i_605_ + ((i_607_ & 0xff00ff) * i_606_)) & ~0xff00ff) + (((i_604_ & 0xff00)
												* i_605_ + ((i_607_ & 0xff00) * i_606_)) & 0xff0000)) >> 8;
									} else if (Class253_Sub3.anInt7696 != 255) {
										int i_608_ = (((i_604_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_609_ = (((i_604_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_610_ = (((i_604_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										i_604_ = (i_608_ | i_609_ | i_610_) >>> 8;
										int i_611_ = is_587_[i_586_];
										is_587_[i_586_] = (((((i_604_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_611_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_604_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_611_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
									} else {
										int i_612_ = (((i_604_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_613_ = (((i_604_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_614_ = (((i_604_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										is_587_[i_586_] = (i_612_ | i_613_ | i_614_) >>> 8;
									}
								}
							} else if (i_588_ == 3) {
								byte i_615_ = aByteArray8562[i_585_];
								int i_616_ = i_615_ > 0 ? anIntArray8561[i_615_]
										: 0;
								int i_617_ = Class253_Sub3.anInt7670;
								int i_618_ = i_616_ + i_617_;
								int i_619_ = ((i_616_ & 0xff00ff) + (i_617_ & 0xff00ff));
								int i_620_ = ((i_619_ & 0x1000100) + (i_618_
										- i_619_ & 0x10000));
								i_620_ = i_618_ - i_620_ | i_620_
										- (i_620_ >>> 8);
								if (i_616_ == 0
										&& Class253_Sub3.anInt7696 != 255) {
									i_616_ = i_620_;
									i_620_ = is_587_[i_586_];
									i_620_ = (((((i_616_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_620_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_616_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_620_ & 0xff00) * Class253_Sub3.anInt7666)) & 0xff0000)) >> 8;
								}
								is_587_[i_586_] = i_620_;
							} else if (i_588_ == 2) {
								int i_621_ = aByteArray8562[i_585_];
								if (i_621_ != 0) {
									int i_622_ = anIntArray8561[i_621_ & 0xff];
									int i_623_ = (((i_622_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_624_ = (((i_622_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									is_587_[i_586_++] = (((i_623_ | i_624_) >>> 8) + Class253_Sub3.anInt7683);
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_589_ == 2) {
							if (i_588_ == 1) {
								int i_625_ = aByteArray8562[i_585_];
								if (i_625_ != 0) {
									int i_626_ = anIntArray8561[i_625_ & 0xff];
									int i_627_ = is_587_[i_586_];
									int i_628_ = i_626_ + i_627_;
									int i_629_ = ((i_626_ & 0xff00ff) + (i_627_ & 0xff00ff));
									i_627_ = ((i_629_ & 0x1000100) + (i_628_
											- i_629_ & 0x10000));
									is_587_[i_586_] = i_628_ - i_627_ | i_627_
											- (i_627_ >>> 8);
								}
							} else if (i_588_ == 0) {
								int i_630_ = aByteArray8562[i_585_];
								if (i_630_ != 0) {
									int i_631_ = anIntArray8561[i_630_ & 0xff];
									int i_632_ = (((i_631_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_633_ = (((i_631_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_634_ = (((i_631_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									i_631_ = (i_632_ | i_633_ | i_634_) >>> 8;
									int i_635_ = is_587_[i_586_];
									int i_636_ = i_631_ + i_635_;
									int i_637_ = ((i_631_ & 0xff00ff) + (i_635_ & 0xff00ff));
									i_635_ = ((i_637_ & 0x1000100) + (i_636_
											- i_637_ & 0x10000));
									is_587_[i_586_] = i_636_ - i_635_ | i_635_
											- (i_635_ >>> 8);
								}
							} else if (i_588_ == 3) {
								byte i_638_ = aByteArray8562[i_585_];
								int i_639_ = i_638_ > 0 ? anIntArray8561[i_638_]
										: 0;
								int i_640_ = Class253_Sub3.anInt7670;
								int i_641_ = i_639_ + i_640_;
								int i_642_ = ((i_639_ & 0xff00ff) + (i_640_ & 0xff00ff));
								int i_643_ = ((i_642_ & 0x1000100) + (i_641_
										- i_642_ & 0x10000));
								i_643_ = i_641_ - i_643_ | i_643_
										- (i_643_ >>> 8);
								if (i_639_ == 0
										&& Class253_Sub3.anInt7696 != 255) {
									i_639_ = i_643_;
									i_643_ = is_587_[i_586_];
									i_643_ = (((((i_639_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_643_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_639_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_643_ & 0xff00) * Class253_Sub3.anInt7666)) & 0xff0000)) >> 8;
								}
								is_587_[i_586_] = i_643_;
							} else if (i_588_ == 2) {
								int i_644_ = aByteArray8562[i_585_];
								if (i_644_ != 0) {
									int i_645_ = anIntArray8561[i_644_ & 0xff];
									int i_646_ = (((i_645_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_647_ = (((i_645_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									i_645_ = (((i_646_ | i_647_) >>> 8) + Class253_Sub3.anInt7683);
									int i_648_ = is_587_[i_586_];
									int i_649_ = i_645_ + i_648_;
									int i_650_ = ((i_645_ & 0xff00ff) + (i_648_ & 0xff00ff));
									i_648_ = ((i_650_ & 0x1000100) + (i_649_
											- i_650_ & 0x10000));
									is_587_[i_586_] = i_649_ - i_648_ | i_648_
											- (i_648_ >>> 8);
								}
							}
						} else
							throw new IllegalArgumentException();
						i_581_ += Class253_Sub3.anInt7676;
						i_582_ += Class253_Sub3.anInt7675;
					}
					i_579_++;
					Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
					Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			} else {
				int i_651_ = Class253_Sub3.anInt7692;
				while (i_651_ < 0) {
					int i_652_ = Class253_Sub3.anInt7695;
					int i_653_ = Class253_Sub3.anInt7677
							+ Class253_Sub3.anInt7686;
					int i_654_ = Class253_Sub3.anInt7694
							+ Class253_Sub3.anInt7697;
					int i_655_ = Class253_Sub3.anInt7687;
					int i_656_;
					if ((i_656_ = i_653_
							- (((Class253_Sub3) this).anInt7679 << 12)) >= 0) {
						i_656_ = ((Class253_Sub3.anInt7676 - i_656_) / Class253_Sub3.anInt7676);
						i_655_ += i_656_;
						i_653_ += Class253_Sub3.anInt7676 * i_656_;
						i_654_ += Class253_Sub3.anInt7675 * i_656_;
						i_652_ += i_656_;
					}
					if ((i_656_ = ((i_653_ - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_655_)
						i_655_ = i_656_;
					if (i_654_ < 0) {
						i_656_ = ((Class253_Sub3.anInt7675 - 1 - i_654_) / Class253_Sub3.anInt7675);
						i_655_ += i_656_;
						i_653_ += Class253_Sub3.anInt7676 * i_656_;
						i_654_ += Class253_Sub3.anInt7675 * i_656_;
						i_652_ += i_656_;
					}
					if ((i_656_ = ((1 + i_654_
							- (((Class253_Sub3) this).anInt7671 << 12) - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_655_)
						i_655_ = i_656_;
					for (/**/; i_655_ < 0; i_655_++) {
						int i_657_ = (((i_654_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_653_ >> 12));
						int i_658_ = i_652_++;
						int[] is_659_ = is;
						int i_660_ = i;
						int i_661_ = i_290_;
						if (i_661_ == 0) {
							if (i_660_ == 1)
								is_659_[i_658_] = (anIntArray8561[aByteArray8562[i_657_] & 0xff]);
							else if (i_660_ == 0) {
								int i_662_ = (anIntArray8561[aByteArray8562[i_657_] & 0xff]);
								int i_663_ = (((i_662_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
								int i_664_ = (((i_662_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
								int i_665_ = (((i_662_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
								is_659_[i_658_] = (i_663_ | i_664_ | i_665_) >>> 8;
							} else if (i_660_ == 3) {
								int i_666_ = (anIntArray8561[aByteArray8562[i_657_] & 0xff]);
								int i_667_ = Class253_Sub3.anInt7670;
								int i_668_ = i_666_ + i_667_;
								int i_669_ = ((i_666_ & 0xff00ff) + (i_667_ & 0xff00ff));
								int i_670_ = ((i_669_ & 0x1000100) + (i_668_
										- i_669_ & 0x10000));
								is_659_[i_658_] = i_668_ - i_670_ | i_670_
										- (i_670_ >>> 8);
							} else if (i_660_ == 2) {
								int i_671_ = (anIntArray8561[aByteArray8562[i_657_] & 0xff]);
								int i_672_ = (((i_671_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
								int i_673_ = (((i_671_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
								is_659_[i_658_] = (((i_672_ | i_673_) >>> 8) + Class253_Sub3.anInt7683);
							} else
								throw new IllegalArgumentException();
						} else if (i_661_ == 1) {
							if (i_660_ == 1) {
								int i_674_ = aByteArray8562[i_657_];
								if (i_674_ != 0)
									is_659_[i_658_] = anIntArray8561[i_674_ & 0xff];
							} else if (i_660_ == 0) {
								int i_675_ = aByteArray8562[i_657_];
								if (i_675_ != 0) {
									int i_676_ = anIntArray8561[i_675_ & 0xff];
									if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
										int i_677_ = Class253_Sub3.anInt7670 >>> 24;
										int i_678_ = 256 - i_677_;
										int i_679_ = is_659_[i_658_];
										is_659_[i_658_] = ((((i_676_ & 0xff00ff)
												* i_677_ + ((i_679_ & 0xff00ff) * i_678_)) & ~0xff00ff) + (((i_676_ & 0xff00)
												* i_677_ + ((i_679_ & 0xff00) * i_678_)) & 0xff0000)) >> 8;
									} else if (Class253_Sub3.anInt7696 != 255) {
										int i_680_ = (((i_676_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_681_ = (((i_676_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_682_ = (((i_676_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										i_676_ = (i_680_ | i_681_ | i_682_) >>> 8;
										int i_683_ = is_659_[i_658_];
										is_659_[i_658_] = (((((i_676_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_683_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_676_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_683_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
									} else {
										int i_684_ = (((i_676_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_685_ = (((i_676_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_686_ = (((i_676_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										is_659_[i_658_] = (i_684_ | i_685_ | i_686_) >>> 8;
									}
								}
							} else if (i_660_ == 3) {
								byte i_687_ = aByteArray8562[i_657_];
								int i_688_ = i_687_ > 0 ? anIntArray8561[i_687_]
										: 0;
								int i_689_ = Class253_Sub3.anInt7670;
								int i_690_ = i_688_ + i_689_;
								int i_691_ = ((i_688_ & 0xff00ff) + (i_689_ & 0xff00ff));
								int i_692_ = ((i_691_ & 0x1000100) + (i_690_
										- i_691_ & 0x10000));
								i_692_ = i_690_ - i_692_ | i_692_
										- (i_692_ >>> 8);
								if (i_688_ == 0
										&& Class253_Sub3.anInt7696 != 255) {
									i_688_ = i_692_;
									i_692_ = is_659_[i_658_];
									i_692_ = (((((i_688_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_692_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_688_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_692_ & 0xff00) * Class253_Sub3.anInt7666)) & 0xff0000)) >> 8;
								}
								is_659_[i_658_] = i_692_;
							} else if (i_660_ == 2) {
								int i_693_ = aByteArray8562[i_657_];
								if (i_693_ != 0) {
									int i_694_ = anIntArray8561[i_693_ & 0xff];
									int i_695_ = (((i_694_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_696_ = (((i_694_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									is_659_[i_658_++] = (((i_695_ | i_696_) >>> 8) + Class253_Sub3.anInt7683);
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_661_ == 2) {
							if (i_660_ == 1) {
								int i_697_ = aByteArray8562[i_657_];
								if (i_697_ != 0) {
									int i_698_ = anIntArray8561[i_697_ & 0xff];
									int i_699_ = is_659_[i_658_];
									int i_700_ = i_698_ + i_699_;
									int i_701_ = ((i_698_ & 0xff00ff) + (i_699_ & 0xff00ff));
									i_699_ = ((i_701_ & 0x1000100) + (i_700_
											- i_701_ & 0x10000));
									is_659_[i_658_] = i_700_ - i_699_ | i_699_
											- (i_699_ >>> 8);
								}
							} else if (i_660_ == 0) {
								int i_702_ = aByteArray8562[i_657_];
								if (i_702_ != 0) {
									int i_703_ = anIntArray8561[i_702_ & 0xff];
									int i_704_ = (((i_703_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_705_ = (((i_703_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_706_ = (((i_703_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									i_703_ = (i_704_ | i_705_ | i_706_) >>> 8;
									int i_707_ = is_659_[i_658_];
									int i_708_ = i_703_ + i_707_;
									int i_709_ = ((i_703_ & 0xff00ff) + (i_707_ & 0xff00ff));
									i_707_ = ((i_709_ & 0x1000100) + (i_708_
											- i_709_ & 0x10000));
									is_659_[i_658_] = i_708_ - i_707_ | i_707_
											- (i_707_ >>> 8);
								}
							} else if (i_660_ == 3) {
								byte i_710_ = aByteArray8562[i_657_];
								int i_711_ = i_710_ > 0 ? anIntArray8561[i_710_]
										: 0;
								int i_712_ = Class253_Sub3.anInt7670;
								int i_713_ = i_711_ + i_712_;
								int i_714_ = ((i_711_ & 0xff00ff) + (i_712_ & 0xff00ff));
								int i_715_ = ((i_714_ & 0x1000100) + (i_713_
										- i_714_ & 0x10000));
								i_715_ = i_713_ - i_715_ | i_715_
										- (i_715_ >>> 8);
								if (i_711_ == 0
										&& Class253_Sub3.anInt7696 != 255) {
									i_711_ = i_715_;
									i_715_ = is_659_[i_658_];
									i_715_ = (((((i_711_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_715_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_711_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_715_ & 0xff00) * Class253_Sub3.anInt7666)) & 0xff0000)) >> 8;
								}
								is_659_[i_658_] = i_715_;
							} else if (i_660_ == 2) {
								int i_716_ = aByteArray8562[i_657_];
								if (i_716_ != 0) {
									int i_717_ = anIntArray8561[i_716_ & 0xff];
									int i_718_ = (((i_717_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_719_ = (((i_717_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									i_717_ = (((i_718_ | i_719_) >>> 8) + Class253_Sub3.anInt7683);
									int i_720_ = is_659_[i_658_];
									int i_721_ = i_717_ + i_720_;
									int i_722_ = ((i_717_ & 0xff00ff) + (i_720_ & 0xff00ff));
									i_720_ = ((i_722_ & 0x1000100) + (i_721_
											- i_722_ & 0x10000));
									is_659_[i_658_] = i_721_ - i_720_ | i_720_
											- (i_720_ >>> 8);
								}
							}
						} else
							throw new IllegalArgumentException();
						i_653_ += Class253_Sub3.anInt7676;
						i_654_ += Class253_Sub3.anInt7675;
					}
					i_651_++;
					Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
					Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
					Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
				}
			}
		} else if (Class253_Sub3.anInt7675 == 0) {
			int i_723_ = Class253_Sub3.anInt7692;
			while (i_723_ < 0) {
				int i_724_ = Class253_Sub3.anInt7695;
				int i_725_ = Class253_Sub3.anInt7677 + Class253_Sub3.anInt7686;
				int i_726_ = Class253_Sub3.anInt7694;
				int i_727_ = Class253_Sub3.anInt7687;
				if (i_726_ >= 0
						&& i_726_ - (((Class253_Sub3) this).anInt7671 << 12) < 0) {
					if (i_725_ < 0) {
						int i_728_ = ((Class253_Sub3.anInt7676 - 1 - i_725_) / Class253_Sub3.anInt7676);
						i_727_ += i_728_;
						i_725_ += Class253_Sub3.anInt7676 * i_728_;
						i_724_ += i_728_;
					}
					int i_729_;
					if ((i_729_ = ((1 + i_725_
							- (((Class253_Sub3) this).anInt7679 << 12) - Class253_Sub3.anInt7676) / Class253_Sub3.anInt7676)) > i_727_)
						i_727_ = i_729_;
					for (/**/; i_727_ < 0; i_727_++) {
						int i_730_ = (((i_726_ >> 12) * ((Class253_Sub3) this).anInt7679) + (i_725_ >> 12));
						int i_731_ = i_724_++;
						int[] is_732_ = is;
						int i_733_ = i;
						int i_734_ = i_290_;
						if (i_734_ == 0) {
							if (i_733_ == 1)
								is_732_[i_731_] = (anIntArray8561[aByteArray8562[i_730_] & 0xff]);
							else if (i_733_ == 0) {
								int i_735_ = (anIntArray8561[aByteArray8562[i_730_] & 0xff]);
								int i_736_ = (((i_735_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
								int i_737_ = (((i_735_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
								int i_738_ = (((i_735_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
								is_732_[i_731_] = (i_736_ | i_737_ | i_738_) >>> 8;
							} else if (i_733_ == 3) {
								int i_739_ = (anIntArray8561[aByteArray8562[i_730_] & 0xff]);
								int i_740_ = Class253_Sub3.anInt7670;
								int i_741_ = i_739_ + i_740_;
								int i_742_ = ((i_739_ & 0xff00ff) + (i_740_ & 0xff00ff));
								int i_743_ = ((i_742_ & 0x1000100) + (i_741_
										- i_742_ & 0x10000));
								is_732_[i_731_] = i_741_ - i_743_ | i_743_
										- (i_743_ >>> 8);
							} else if (i_733_ == 2) {
								int i_744_ = (anIntArray8561[aByteArray8562[i_730_] & 0xff]);
								int i_745_ = (((i_744_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
								int i_746_ = (((i_744_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
								is_732_[i_731_] = (((i_745_ | i_746_) >>> 8) + Class253_Sub3.anInt7683);
							} else
								throw new IllegalArgumentException();
						} else if (i_734_ == 1) {
							if (i_733_ == 1) {
								int i_747_ = aByteArray8562[i_730_];
								if (i_747_ != 0)
									is_732_[i_731_] = anIntArray8561[i_747_ & 0xff];
							} else if (i_733_ == 0) {
								int i_748_ = aByteArray8562[i_730_];
								if (i_748_ != 0) {
									int i_749_ = anIntArray8561[i_748_ & 0xff];
									if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
										int i_750_ = Class253_Sub3.anInt7670 >>> 24;
										int i_751_ = 256 - i_750_;
										int i_752_ = is_732_[i_731_];
										is_732_[i_731_] = ((((i_749_ & 0xff00ff)
												* i_750_ + ((i_752_ & 0xff00ff) * i_751_)) & ~0xff00ff) + (((i_749_ & 0xff00)
												* i_750_ + ((i_752_ & 0xff00) * i_751_)) & 0xff0000)) >> 8;
									} else if (Class253_Sub3.anInt7696 != 255) {
										int i_753_ = (((i_749_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_754_ = (((i_749_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_755_ = (((i_749_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										i_749_ = (i_753_ | i_754_ | i_755_) >>> 8;
										int i_756_ = is_732_[i_731_];
										is_732_[i_731_] = (((((i_749_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_756_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_749_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_756_ & 0xff00) * (Class253_Sub3.anInt7666))) & 0xff0000)) >> 8;
									} else {
										int i_757_ = (((i_749_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
										int i_758_ = (((i_749_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
										int i_759_ = (((i_749_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
										is_732_[i_731_] = (i_757_ | i_758_ | i_759_) >>> 8;
									}
								}
							} else if (i_733_ == 3) {
								byte i_760_ = aByteArray8562[i_730_];
								int i_761_ = i_760_ > 0 ? anIntArray8561[i_760_]
										: 0;
								int i_762_ = Class253_Sub3.anInt7670;
								int i_763_ = i_761_ + i_762_;
								int i_764_ = ((i_761_ & 0xff00ff) + (i_762_ & 0xff00ff));
								int i_765_ = ((i_764_ & 0x1000100) + (i_763_
										- i_764_ & 0x10000));
								i_765_ = i_763_ - i_765_ | i_765_
										- (i_765_ >>> 8);
								if (i_761_ == 0
										&& Class253_Sub3.anInt7696 != 255) {
									i_761_ = i_765_;
									i_765_ = is_732_[i_731_];
									i_765_ = (((((i_761_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_765_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_761_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_765_ & 0xff00) * Class253_Sub3.anInt7666)) & 0xff0000)) >> 8;
								}
								is_732_[i_731_] = i_765_;
							} else if (i_733_ == 2) {
								int i_766_ = aByteArray8562[i_730_];
								if (i_766_ != 0) {
									int i_767_ = anIntArray8561[i_766_ & 0xff];
									int i_768_ = (((i_767_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_769_ = (((i_767_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									is_732_[i_731_++] = (((i_768_ | i_769_) >>> 8) + Class253_Sub3.anInt7683);
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_734_ == 2) {
							if (i_733_ == 1) {
								int i_770_ = aByteArray8562[i_730_];
								if (i_770_ != 0) {
									int i_771_ = anIntArray8561[i_770_ & 0xff];
									int i_772_ = is_732_[i_731_];
									int i_773_ = i_771_ + i_772_;
									int i_774_ = ((i_771_ & 0xff00ff) + (i_772_ & 0xff00ff));
									i_772_ = ((i_774_ & 0x1000100) + (i_773_
											- i_774_ & 0x10000));
									is_732_[i_731_] = i_773_ - i_772_ | i_772_
											- (i_772_ >>> 8);
								}
							} else if (i_733_ == 0) {
								int i_775_ = aByteArray8562[i_730_];
								if (i_775_ != 0) {
									int i_776_ = anIntArray8561[i_775_ & 0xff];
									int i_777_ = (((i_776_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_778_ = (((i_776_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_779_ = (((i_776_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									i_776_ = (i_777_ | i_778_ | i_779_) >>> 8;
									int i_780_ = is_732_[i_731_];
									int i_781_ = i_776_ + i_780_;
									int i_782_ = ((i_776_ & 0xff00ff) + (i_780_ & 0xff00ff));
									i_780_ = ((i_782_ & 0x1000100) + (i_781_
											- i_782_ & 0x10000));
									is_732_[i_731_] = i_781_ - i_780_ | i_780_
											- (i_780_ >>> 8);
								}
							} else if (i_733_ == 3) {
								byte i_783_ = aByteArray8562[i_730_];
								int i_784_ = i_783_ > 0 ? anIntArray8561[i_783_]
										: 0;
								int i_785_ = Class253_Sub3.anInt7670;
								int i_786_ = i_784_ + i_785_;
								int i_787_ = ((i_784_ & 0xff00ff) + (i_785_ & 0xff00ff));
								int i_788_ = ((i_787_ & 0x1000100) + (i_786_
										- i_787_ & 0x10000));
								i_788_ = i_786_ - i_788_ | i_788_
										- (i_788_ >>> 8);
								if (i_784_ == 0
										&& Class253_Sub3.anInt7696 != 255) {
									i_784_ = i_788_;
									i_788_ = is_732_[i_731_];
									i_788_ = (((((i_784_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_788_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_784_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_788_ & 0xff00) * Class253_Sub3.anInt7666)) & 0xff0000)) >> 8;
								}
								is_732_[i_731_] = i_788_;
							} else if (i_733_ == 2) {
								int i_789_ = aByteArray8562[i_730_];
								if (i_789_ != 0) {
									int i_790_ = anIntArray8561[i_789_ & 0xff];
									int i_791_ = (((i_790_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
									int i_792_ = (((i_790_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
									i_790_ = (((i_791_ | i_792_) >>> 8) + Class253_Sub3.anInt7683);
									int i_793_ = is_732_[i_731_];
									int i_794_ = i_790_ + i_793_;
									int i_795_ = ((i_790_ & 0xff00ff) + (i_793_ & 0xff00ff));
									i_793_ = ((i_795_ & 0x1000100) + (i_794_
											- i_795_ & 0x10000));
									is_732_[i_731_] = i_794_ - i_793_ | i_793_
											- (i_793_ >>> 8);
								}
							}
						} else
							throw new IllegalArgumentException();
						i_725_ += Class253_Sub3.anInt7676;
					}
				}
				i_723_++;
				Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
				Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
				Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
			}
		} else if (Class253_Sub3.anInt7675 < 0) {
			for (int i_796_ = Class253_Sub3.anInt7692; i_796_ < 0; i_796_++) {
				int i_797_ = Class253_Sub3.anInt7695;
				int i_798_ = Class253_Sub3.anInt7677 + Class253_Sub3.anInt7686;
				int i_799_ = Class253_Sub3.anInt7694 + Class253_Sub3.anInt7697;
				int i_800_ = Class253_Sub3.anInt7687;
				if (i_798_ < 0) {
					int i_801_ = ((Class253_Sub3.anInt7676 - 1 - i_798_) / Class253_Sub3.anInt7676);
					i_800_ += i_801_;
					i_798_ += Class253_Sub3.anInt7676 * i_801_;
					i_799_ += Class253_Sub3.anInt7675 * i_801_;
					i_797_ += i_801_;
				}
				int i_802_;
				if ((i_802_ = (1 + i_798_
						- (((Class253_Sub3) this).anInt7679 << 12) - Class253_Sub3.anInt7676)
						/ Class253_Sub3.anInt7676) > i_800_)
					i_800_ = i_802_;
				if ((i_802_ = i_799_ - (((Class253_Sub3) this).anInt7671 << 12)) >= 0) {
					i_802_ = ((Class253_Sub3.anInt7675 - i_802_) / Class253_Sub3.anInt7675);
					i_800_ += i_802_;
					i_798_ += Class253_Sub3.anInt7676 * i_802_;
					i_799_ += Class253_Sub3.anInt7675 * i_802_;
					i_797_ += i_802_;
				}
				if ((i_802_ = ((i_799_ - Class253_Sub3.anInt7675) / Class253_Sub3.anInt7675)) > i_800_)
					i_800_ = i_802_;
				for (/**/; i_800_ < 0; i_800_++) {
					int i_803_ = ((i_799_ >> 12)
							* ((Class253_Sub3) this).anInt7679 + (i_798_ >> 12));
					int i_804_ = i_797_++;
					int[] is_805_ = is;
					int i_806_ = i;
					int i_807_ = i_290_;
					if (i_807_ == 0) {
						if (i_806_ == 1)
							is_805_[i_804_] = (anIntArray8561[aByteArray8562[i_803_] & 0xff]);
						else if (i_806_ == 0) {
							int i_808_ = (anIntArray8561[aByteArray8562[i_803_] & 0xff]);
							int i_809_ = (((i_808_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
							int i_810_ = ((i_808_ & 0xff00)
									* Class253_Sub3.anInt7690 & 0xff0000);
							int i_811_ = ((i_808_ & 0xff)
									* Class253_Sub3.anInt7685 & 0xff00);
							is_805_[i_804_] = (i_809_ | i_810_ | i_811_) >>> 8;
						} else if (i_806_ == 3) {
							int i_812_ = (anIntArray8561[aByteArray8562[i_803_] & 0xff]);
							int i_813_ = Class253_Sub3.anInt7670;
							int i_814_ = i_812_ + i_813_;
							int i_815_ = (i_812_ & 0xff00ff)
									+ (i_813_ & 0xff00ff);
							int i_816_ = ((i_815_ & 0x1000100) + (i_814_
									- i_815_ & 0x10000));
							is_805_[i_804_] = i_814_ - i_816_ | i_816_
									- (i_816_ >>> 8);
						} else if (i_806_ == 2) {
							int i_817_ = (anIntArray8561[aByteArray8562[i_803_] & 0xff]);
							int i_818_ = (((i_817_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
							int i_819_ = ((i_817_ & 0xff00)
									* Class253_Sub3.anInt7696 & 0xff0000);
							is_805_[i_804_] = (((i_818_ | i_819_) >>> 8) + Class253_Sub3.anInt7683);
						} else
							throw new IllegalArgumentException();
					} else if (i_807_ == 1) {
						if (i_806_ == 1) {
							int i_820_ = aByteArray8562[i_803_];
							if (i_820_ != 0)
								is_805_[i_804_] = anIntArray8561[i_820_ & 0xff];
						} else if (i_806_ == 0) {
							int i_821_ = aByteArray8562[i_803_];
							if (i_821_ != 0) {
								int i_822_ = anIntArray8561[i_821_ & 0xff];
								if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
									int i_823_ = Class253_Sub3.anInt7670 >>> 24;
									int i_824_ = 256 - i_823_;
									int i_825_ = is_805_[i_804_];
									is_805_[i_804_] = ((((i_822_ & 0xff00ff)
											* i_823_ + (i_825_ & 0xff00ff)
											* i_824_) & ~0xff00ff) + (((i_822_ & 0xff00)
											* i_823_ + (i_825_ & 0xff00)
											* i_824_) & 0xff0000)) >> 8;
								} else if (Class253_Sub3.anInt7696 != 255) {
									int i_826_ = (((i_822_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_827_ = (((i_822_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_828_ = (((i_822_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									i_822_ = (i_826_ | i_827_ | i_828_) >>> 8;
									int i_829_ = is_805_[i_804_];
									is_805_[i_804_] = (((((i_822_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_829_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_822_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_829_ & 0xff00) * Class253_Sub3.anInt7666)) & 0xff0000)) >> 8;
								} else {
									int i_830_ = (((i_822_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_831_ = (((i_822_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_832_ = (((i_822_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									is_805_[i_804_] = (i_830_ | i_831_ | i_832_) >>> 8;
								}
							}
						} else if (i_806_ == 3) {
							byte i_833_ = aByteArray8562[i_803_];
							int i_834_ = i_833_ > 0 ? anIntArray8561[i_833_]
									: 0;
							int i_835_ = Class253_Sub3.anInt7670;
							int i_836_ = i_834_ + i_835_;
							int i_837_ = (i_834_ & 0xff00ff)
									+ (i_835_ & 0xff00ff);
							int i_838_ = ((i_837_ & 0x1000100) + (i_836_
									- i_837_ & 0x10000));
							i_838_ = i_836_ - i_838_ | i_838_ - (i_838_ >>> 8);
							if (i_834_ == 0 && Class253_Sub3.anInt7696 != 255) {
								i_834_ = i_838_;
								i_838_ = is_805_[i_804_];
								i_838_ = (((((i_834_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_838_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_834_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_838_ & 0xff00) * Class253_Sub3.anInt7666)) & 0xff0000)) >> 8;
							}
							is_805_[i_804_] = i_838_;
						} else if (i_806_ == 2) {
							int i_839_ = aByteArray8562[i_803_];
							if (i_839_ != 0) {
								int i_840_ = anIntArray8561[i_839_ & 0xff];
								int i_841_ = (((i_840_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
								int i_842_ = (((i_840_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
								is_805_[i_804_++] = (((i_841_ | i_842_) >>> 8) + Class253_Sub3.anInt7683);
							}
						} else
							throw new IllegalArgumentException();
					} else if (i_807_ == 2) {
						if (i_806_ == 1) {
							int i_843_ = aByteArray8562[i_803_];
							if (i_843_ != 0) {
								int i_844_ = anIntArray8561[i_843_ & 0xff];
								int i_845_ = is_805_[i_804_];
								int i_846_ = i_844_ + i_845_;
								int i_847_ = ((i_844_ & 0xff00ff) + (i_845_ & 0xff00ff));
								i_845_ = (i_847_ & 0x1000100)
										+ (i_846_ - i_847_ & 0x10000);
								is_805_[i_804_] = i_846_ - i_845_ | i_845_
										- (i_845_ >>> 8);
							}
						} else if (i_806_ == 0) {
							int i_848_ = aByteArray8562[i_803_];
							if (i_848_ != 0) {
								int i_849_ = anIntArray8561[i_848_ & 0xff];
								int i_850_ = (((i_849_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
								int i_851_ = (((i_849_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
								int i_852_ = (((i_849_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
								i_849_ = (i_850_ | i_851_ | i_852_) >>> 8;
								int i_853_ = is_805_[i_804_];
								int i_854_ = i_849_ + i_853_;
								int i_855_ = ((i_849_ & 0xff00ff) + (i_853_ & 0xff00ff));
								i_853_ = (i_855_ & 0x1000100)
										+ (i_854_ - i_855_ & 0x10000);
								is_805_[i_804_] = i_854_ - i_853_ | i_853_
										- (i_853_ >>> 8);
							}
						} else if (i_806_ == 3) {
							byte i_856_ = aByteArray8562[i_803_];
							int i_857_ = i_856_ > 0 ? anIntArray8561[i_856_]
									: 0;
							int i_858_ = Class253_Sub3.anInt7670;
							int i_859_ = i_857_ + i_858_;
							int i_860_ = (i_857_ & 0xff00ff)
									+ (i_858_ & 0xff00ff);
							int i_861_ = ((i_860_ & 0x1000100) + (i_859_
									- i_860_ & 0x10000));
							i_861_ = i_859_ - i_861_ | i_861_ - (i_861_ >>> 8);
							if (i_857_ == 0 && Class253_Sub3.anInt7696 != 255) {
								i_857_ = i_861_;
								i_861_ = is_805_[i_804_];
								i_861_ = (((((i_857_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_861_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_857_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_861_ & 0xff00) * Class253_Sub3.anInt7666)) & 0xff0000)) >> 8;
							}
							is_805_[i_804_] = i_861_;
						} else if (i_806_ == 2) {
							int i_862_ = aByteArray8562[i_803_];
							if (i_862_ != 0) {
								int i_863_ = anIntArray8561[i_862_ & 0xff];
								int i_864_ = (((i_863_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
								int i_865_ = (((i_863_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
								i_863_ = (((i_864_ | i_865_) >>> 8) + Class253_Sub3.anInt7683);
								int i_866_ = is_805_[i_804_];
								int i_867_ = i_863_ + i_866_;
								int i_868_ = ((i_863_ & 0xff00ff) + (i_866_ & 0xff00ff));
								i_866_ = (i_868_ & 0x1000100)
										+ (i_867_ - i_868_ & 0x10000);
								is_805_[i_804_] = i_867_ - i_866_ | i_866_
										- (i_866_ >>> 8);
							}
						}
					} else
						throw new IllegalArgumentException();
					i_798_ += Class253_Sub3.anInt7676;
					i_799_ += Class253_Sub3.anInt7675;
				}
				Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
				Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
				Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
			}
		} else {
			for (int i_869_ = Class253_Sub3.anInt7692; i_869_ < 0; i_869_++) {
				int i_870_ = Class253_Sub3.anInt7695;
				int i_871_ = Class253_Sub3.anInt7677 + Class253_Sub3.anInt7686;
				int i_872_ = Class253_Sub3.anInt7694 + Class253_Sub3.anInt7697;
				int i_873_ = Class253_Sub3.anInt7687;
				if (i_871_ < 0) {
					int i_874_ = ((Class253_Sub3.anInt7676 - 1 - i_871_) / Class253_Sub3.anInt7676);
					i_873_ += i_874_;
					i_871_ += Class253_Sub3.anInt7676 * i_874_;
					i_872_ += Class253_Sub3.anInt7675 * i_874_;
					i_870_ += i_874_;
				}
				int i_875_;
				if ((i_875_ = (1 + i_871_
						- (((Class253_Sub3) this).anInt7679 << 12) - Class253_Sub3.anInt7676)
						/ Class253_Sub3.anInt7676) > i_873_)
					i_873_ = i_875_;
				if (i_872_ < 0) {
					i_875_ = ((Class253_Sub3.anInt7675 - 1 - i_872_) / Class253_Sub3.anInt7675);
					i_873_ += i_875_;
					i_871_ += Class253_Sub3.anInt7676 * i_875_;
					i_872_ += Class253_Sub3.anInt7675 * i_875_;
					i_870_ += i_875_;
				}
				if ((i_875_ = (1 + i_872_
						- (((Class253_Sub3) this).anInt7671 << 12) - Class253_Sub3.anInt7675)
						/ Class253_Sub3.anInt7675) > i_873_)
					i_873_ = i_875_;
				for (/**/; i_873_ < 0; i_873_++) {
					int i_876_ = ((i_872_ >> 12)
							* ((Class253_Sub3) this).anInt7679 + (i_871_ >> 12));
					int i_877_ = i_870_++;
					int[] is_878_ = is;
					int i_879_ = i;
					int i_880_ = i_290_;
					if (i_880_ == 0) {
						if (i_879_ == 1)
							is_878_[i_877_] = (anIntArray8561[aByteArray8562[i_876_] & 0xff]);
						else if (i_879_ == 0) {
							int i_881_ = (anIntArray8561[aByteArray8562[i_876_] & 0xff]);
							int i_882_ = (((i_881_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
							int i_883_ = ((i_881_ & 0xff00)
									* Class253_Sub3.anInt7690 & 0xff0000);
							int i_884_ = ((i_881_ & 0xff)
									* Class253_Sub3.anInt7685 & 0xff00);
							is_878_[i_877_] = (i_882_ | i_883_ | i_884_) >>> 8;
						} else if (i_879_ == 3) {
							int i_885_ = (anIntArray8561[aByteArray8562[i_876_] & 0xff]);
							int i_886_ = Class253_Sub3.anInt7670;
							int i_887_ = i_885_ + i_886_;
							int i_888_ = (i_885_ & 0xff00ff)
									+ (i_886_ & 0xff00ff);
							int i_889_ = ((i_888_ & 0x1000100) + (i_887_
									- i_888_ & 0x10000));
							is_878_[i_877_] = i_887_ - i_889_ | i_889_
									- (i_889_ >>> 8);
						} else if (i_879_ == 2) {
							int i_890_ = (anIntArray8561[aByteArray8562[i_876_] & 0xff]);
							int i_891_ = (((i_890_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
							int i_892_ = ((i_890_ & 0xff00)
									* Class253_Sub3.anInt7696 & 0xff0000);
							is_878_[i_877_] = (((i_891_ | i_892_) >>> 8) + Class253_Sub3.anInt7683);
						} else
							throw new IllegalArgumentException();
					} else if (i_880_ == 1) {
						if (i_879_ == 1) {
							int i_893_ = aByteArray8562[i_876_];
							if (i_893_ != 0)
								is_878_[i_877_] = anIntArray8561[i_893_ & 0xff];
						} else if (i_879_ == 0) {
							int i_894_ = aByteArray8562[i_876_];
							if (i_894_ != 0) {
								int i_895_ = anIntArray8561[i_894_ & 0xff];
								if ((Class253_Sub3.anInt7670 & 0xffffff) == 16777215) {
									int i_896_ = Class253_Sub3.anInt7670 >>> 24;
									int i_897_ = 256 - i_896_;
									int i_898_ = is_878_[i_877_];
									is_878_[i_877_] = ((((i_895_ & 0xff00ff)
											* i_896_ + (i_898_ & 0xff00ff)
											* i_897_) & ~0xff00ff) + (((i_895_ & 0xff00)
											* i_896_ + (i_898_ & 0xff00)
											* i_897_) & 0xff0000)) >> 8;
								} else if (Class253_Sub3.anInt7696 != 255) {
									int i_899_ = (((i_895_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_900_ = (((i_895_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_901_ = (((i_895_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									i_895_ = (i_899_ | i_900_ | i_901_) >>> 8;
									int i_902_ = is_878_[i_877_];
									is_878_[i_877_] = (((((i_895_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_902_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_895_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_902_ & 0xff00) * Class253_Sub3.anInt7666)) & 0xff0000)) >> 8;
								} else {
									int i_903_ = (((i_895_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
									int i_904_ = (((i_895_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
									int i_905_ = (((i_895_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
									is_878_[i_877_] = (i_903_ | i_904_ | i_905_) >>> 8;
								}
							}
						} else if (i_879_ == 3) {
							byte i_906_ = aByteArray8562[i_876_];
							int i_907_ = i_906_ > 0 ? anIntArray8561[i_906_]
									: 0;
							int i_908_ = Class253_Sub3.anInt7670;
							int i_909_ = i_907_ + i_908_;
							int i_910_ = (i_907_ & 0xff00ff)
									+ (i_908_ & 0xff00ff);
							int i_911_ = ((i_910_ & 0x1000100) + (i_909_
									- i_910_ & 0x10000));
							i_911_ = i_909_ - i_911_ | i_911_ - (i_911_ >>> 8);
							if (i_907_ == 0 && Class253_Sub3.anInt7696 != 255) {
								i_907_ = i_911_;
								i_911_ = is_878_[i_877_];
								i_911_ = (((((i_907_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_911_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_907_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_911_ & 0xff00) * Class253_Sub3.anInt7666)) & 0xff0000)) >> 8;
							}
							is_878_[i_877_] = i_911_;
						} else if (i_879_ == 2) {
							int i_912_ = aByteArray8562[i_876_];
							if (i_912_ != 0) {
								int i_913_ = anIntArray8561[i_912_ & 0xff];
								int i_914_ = (((i_913_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
								int i_915_ = (((i_913_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
								is_878_[i_877_++] = (((i_914_ | i_915_) >>> 8) + Class253_Sub3.anInt7683);
							}
						} else
							throw new IllegalArgumentException();
					} else if (i_880_ == 2) {
						if (i_879_ == 1) {
							int i_916_ = aByteArray8562[i_876_];
							if (i_916_ != 0) {
								int i_917_ = anIntArray8561[i_916_ & 0xff];
								int i_918_ = is_878_[i_877_];
								int i_919_ = i_917_ + i_918_;
								int i_920_ = ((i_917_ & 0xff00ff) + (i_918_ & 0xff00ff));
								i_918_ = (i_920_ & 0x1000100)
										+ (i_919_ - i_920_ & 0x10000);
								is_878_[i_877_] = i_919_ - i_918_ | i_918_
										- (i_918_ >>> 8);
							}
						} else if (i_879_ == 0) {
							int i_921_ = aByteArray8562[i_876_];
							if (i_921_ != 0) {
								int i_922_ = anIntArray8561[i_921_ & 0xff];
								int i_923_ = (((i_922_ & 0xff0000) * Class253_Sub3.anInt7682) & ~0xffffff);
								int i_924_ = (((i_922_ & 0xff00) * Class253_Sub3.anInt7690) & 0xff0000);
								int i_925_ = (((i_922_ & 0xff) * Class253_Sub3.anInt7685) & 0xff00);
								i_922_ = (i_923_ | i_924_ | i_925_) >>> 8;
								int i_926_ = is_878_[i_877_];
								int i_927_ = i_922_ + i_926_;
								int i_928_ = ((i_922_ & 0xff00ff) + (i_926_ & 0xff00ff));
								i_926_ = (i_928_ & 0x1000100)
										+ (i_927_ - i_928_ & 0x10000);
								is_878_[i_877_] = i_927_ - i_926_ | i_926_
										- (i_926_ >>> 8);
							}
						} else if (i_879_ == 3) {
							byte i_929_ = aByteArray8562[i_876_];
							int i_930_ = i_929_ > 0 ? anIntArray8561[i_929_]
									: 0;
							int i_931_ = Class253_Sub3.anInt7670;
							int i_932_ = i_930_ + i_931_;
							int i_933_ = (i_930_ & 0xff00ff)
									+ (i_931_ & 0xff00ff);
							int i_934_ = ((i_933_ & 0x1000100) + (i_932_
									- i_933_ & 0x10000));
							i_934_ = i_932_ - i_934_ | i_934_ - (i_934_ >>> 8);
							if (i_930_ == 0 && Class253_Sub3.anInt7696 != 255) {
								i_930_ = i_934_;
								i_934_ = is_878_[i_877_];
								i_934_ = (((((i_930_ & 0xff00ff) * Class253_Sub3.anInt7696) + ((i_934_ & 0xff00ff) * Class253_Sub3.anInt7666)) & ~0xff00ff) + ((((i_930_ & 0xff00) * Class253_Sub3.anInt7696) + ((i_934_ & 0xff00) * Class253_Sub3.anInt7666)) & 0xff0000)) >> 8;
							}
							is_878_[i_877_] = i_934_;
						} else if (i_879_ == 2) {
							int i_935_ = aByteArray8562[i_876_];
							if (i_935_ != 0) {
								int i_936_ = anIntArray8561[i_935_ & 0xff];
								int i_937_ = (((i_936_ & 0xff00ff) * Class253_Sub3.anInt7696) & ~0xff00ff);
								int i_938_ = (((i_936_ & 0xff00) * Class253_Sub3.anInt7696) & 0xff0000);
								i_936_ = (((i_937_ | i_938_) >>> 8) + Class253_Sub3.anInt7683);
								int i_939_ = is_878_[i_877_];
								int i_940_ = i_936_ + i_939_;
								int i_941_ = ((i_936_ & 0xff00ff) + (i_939_ & 0xff00ff));
								i_939_ = (i_941_ & 0x1000100)
										+ (i_940_ - i_941_ & 0x10000);
								is_878_[i_877_] = i_940_ - i_939_ | i_939_
										- (i_939_ >>> 8);
							}
						}
					} else
						throw new IllegalArgumentException();
					i_871_ += Class253_Sub3.anInt7676;
					i_872_ += Class253_Sub3.anInt7675;
				}
				Class253_Sub3.anInt7677 += Class253_Sub3.anInt7672;
				Class253_Sub3.anInt7694 += Class253_Sub3.anInt7673;
				Class253_Sub3.anInt7695 += Class253_Sub3.anInt7684;
			}
		}
	}

	final void method1613(int i, int i_942_, int i_943_) {
		throw new IllegalStateException();
	}

	final void method1626(int i, int i_944_, int i_945_, int i_946_,
			int i_947_, int i_948_, int i_949_, int i_950_) {
		if (((Class253_Sub3) this).aClass163_Sub1_7698.method2293())
			throw new IllegalStateException();
		if (i_945_ > 0 && i_946_ > 0) {
			int i_951_ = 0;
			int i_952_ = 0;
			int i_953_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5206);
			int i_954_ = (((Class253_Sub3) this).anInt7689
					+ ((Class253_Sub3) this).anInt7679 + ((Class253_Sub3) this).anInt7681);
			int i_955_ = (((Class253_Sub3) this).anInt7691
					+ ((Class253_Sub3) this).anInt7671 + ((Class253_Sub3) this).anInt7667);
			int i_956_ = (i_954_ << 16) / i_945_;
			int i_957_ = (i_955_ << 16) / i_946_;
			if (((Class253_Sub3) this).anInt7689 > 0) {
				int i_958_ = (((((Class253_Sub3) this).anInt7689 << 16)
						+ i_956_ - 1) / i_956_);
				i += i_958_;
				i_951_ += i_958_ * i_956_
						- (((Class253_Sub3) this).anInt7689 << 16);
			}
			if (((Class253_Sub3) this).anInt7691 > 0) {
				int i_959_ = (((((Class253_Sub3) this).anInt7691 << 16)
						+ i_957_ - 1) / i_957_);
				i_944_ += i_959_;
				i_952_ += i_959_ * i_957_
						- (((Class253_Sub3) this).anInt7691 << 16);
			}
			if (((Class253_Sub3) this).anInt7679 < i_954_)
				i_945_ = ((((Class253_Sub3) this).anInt7679 << 16) - i_951_
						+ i_956_ - 1)
						/ i_956_;
			if (((Class253_Sub3) this).anInt7671 < i_955_)
				i_946_ = ((((Class253_Sub3) this).anInt7671 << 16) - i_952_
						+ i_957_ - 1)
						/ i_957_;
			int i_960_ = i + i_944_ * i_953_;
			int i_961_ = i_953_ - i_945_;
			if (i_944_ + i_946_ > (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5193))
				i_946_ -= i_944_
						+ i_946_
						- ((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5193;
			if (i_944_ < (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177)) {
				int i_962_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177 - i_944_);
				i_946_ -= i_962_;
				i_960_ += i_962_ * i_953_;
				i_952_ += i_957_ * i_962_;
			}
			if (i + i_945_ > (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5178)) {
				int i_963_ = (i + i_945_ - ((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5178);
				i_945_ -= i_963_;
				i_961_ += i_963_;
			}
			if (i < (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186)) {
				int i_964_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186 - i);
				i_945_ -= i_964_;
				i_960_ += i_964_;
				i_951_ += i_956_ * i_964_;
				i_961_ += i_964_;
			}
			int[] is = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anIntArray5214);
			if (i_949_ == 0) {
				if (i_947_ == 1) {
					int i_965_ = i_951_;
					for (int i_966_ = -i_946_; i_966_ < 0; i_966_++) {
						int i_967_ = ((i_952_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_968_ = -i_945_; i_968_ < 0; i_968_++) {
							is[i_960_++] = (anIntArray8561[(aByteArray8562[(i_951_ >> 16)
									+ i_967_] & 0xff)]);
							i_951_ += i_956_;
						}
						i_952_ += i_957_;
						i_951_ = i_965_;
						i_960_ += i_961_;
					}
					return;
				}
				if (i_947_ == 0) {
					int i_969_ = (i_948_ & 0xff0000) >> 16;
					int i_970_ = (i_948_ & 0xff00) >> 8;
					int i_971_ = i_948_ & 0xff;
					int i_972_ = i_951_;
					for (int i_973_ = -i_946_; i_973_ < 0; i_973_++) {
						int i_974_ = ((i_952_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_975_ = -i_945_; i_975_ < 0; i_975_++) {
							int i_976_ = (anIntArray8561[(aByteArray8562[(i_951_ >> 16)
									+ i_974_] & 0xff)]);
							int i_977_ = (i_976_ & 0xff0000) * i_969_
									& ~0xffffff;
							int i_978_ = (i_976_ & 0xff00) * i_970_ & 0xff0000;
							int i_979_ = (i_976_ & 0xff) * i_971_ & 0xff00;
							is[i_960_++] = (i_977_ | i_978_ | i_979_) >>> 8;
							i_951_ += i_956_;
						}
						i_952_ += i_957_;
						i_951_ = i_972_;
						i_960_ += i_961_;
					}
					return;
				}
				if (i_947_ == 3) {
					int i_980_ = i_951_;
					for (int i_981_ = -i_946_; i_981_ < 0; i_981_++) {
						int i_982_ = ((i_952_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_983_ = -i_945_; i_983_ < 0; i_983_++) {
							byte i_984_ = aByteArray8562[(i_951_ >> 16)
									+ i_982_];
							int i_985_ = i_984_ > 0 ? anIntArray8561[i_984_]
									: 0;
							int i_986_ = i_985_ + i_948_;
							int i_987_ = (i_985_ & 0xff00ff)
									+ (i_948_ & 0xff00ff);
							int i_988_ = ((i_987_ & 0x1000100) + (i_986_
									- i_987_ & 0x10000));
							is[i_960_++] = i_986_ - i_988_ | i_988_
									- (i_988_ >>> 8);
							i_951_ += i_956_;
						}
						i_952_ += i_957_;
						i_951_ = i_980_;
						i_960_ += i_961_;
					}
					return;
				}
				if (i_947_ == 2) {
					int i_989_ = i_948_ >>> 24;
					int i_990_ = 256 - i_989_;
					int i_991_ = (i_948_ & 0xff00ff) * i_990_ & ~0xff00ff;
					int i_992_ = (i_948_ & 0xff00) * i_990_ & 0xff0000;
					i_948_ = (i_991_ | i_992_) >>> 8;
					int i_993_ = i_951_;
					for (int i_994_ = -i_946_; i_994_ < 0; i_994_++) {
						int i_995_ = ((i_952_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_996_ = -i_945_; i_996_ < 0; i_996_++) {
							int i_997_ = (anIntArray8561[(aByteArray8562[(i_951_ >> 16)
									+ i_995_] & 0xff)]);
							i_991_ = (i_997_ & 0xff00ff) * i_989_ & ~0xff00ff;
							i_992_ = (i_997_ & 0xff00) * i_989_ & 0xff0000;
							is[i_960_++] = ((i_991_ | i_992_) >>> 8) + i_948_;
							i_951_ += i_956_;
						}
						i_952_ += i_957_;
						i_951_ = i_993_;
						i_960_ += i_961_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_949_ == 1) {
				if (i_947_ == 1) {
					int i_998_ = i_951_;
					for (int i_999_ = -i_946_; i_999_ < 0; i_999_++) {
						int i_1000_ = ((i_952_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_1001_ = -i_945_; i_1001_ < 0; i_1001_++) {
							int i_1002_ = aByteArray8562[(i_951_ >> 16)
									+ i_1000_];
							if (i_1002_ != 0)
								is[i_960_++] = anIntArray8561[i_1002_ & 0xff];
							else
								i_960_++;
							i_951_ += i_956_;
						}
						i_952_ += i_957_;
						i_951_ = i_998_;
						i_960_ += i_961_;
					}
					return;
				}
				if (i_947_ == 0) {
					int i_1003_ = i_951_;
					if ((i_948_ & 0xffffff) == 16777215) {
						int i_1004_ = i_948_ >>> 24;
						int i_1005_ = 256 - i_1004_;
						for (int i_1006_ = -i_946_; i_1006_ < 0; i_1006_++) {
							int i_1007_ = ((i_952_ >> 16) * ((Class253_Sub3) this).anInt7679);
							for (int i_1008_ = -i_945_; i_1008_ < 0; i_1008_++) {
								int i_1009_ = aByteArray8562[(i_951_ >> 16)
										+ i_1007_];
								if (i_1009_ != 0) {
									int i_1010_ = anIntArray8561[i_1009_ & 0xff];
									int i_1011_ = is[i_960_];
									is[i_960_++] = ((((i_1010_ & 0xff00ff)
											* i_1004_ + (i_1011_ & 0xff00ff)
											* i_1005_) & ~0xff00ff) + (((i_1010_ & 0xff00)
											* i_1004_ + (i_1011_ & 0xff00)
											* i_1005_) & 0xff0000)) >> 8;
								} else
									i_960_++;
								i_951_ += i_956_;
							}
							i_952_ += i_957_;
							i_951_ = i_1003_;
							i_960_ += i_961_;
						}
					} else {
						int i_1012_ = (i_948_ & 0xff0000) >> 16;
						int i_1013_ = (i_948_ & 0xff00) >> 8;
						int i_1014_ = i_948_ & 0xff;
						int i_1015_ = i_948_ >>> 24;
						int i_1016_ = 256 - i_1015_;
						for (int i_1017_ = -i_946_; i_1017_ < 0; i_1017_++) {
							int i_1018_ = ((i_952_ >> 16) * ((Class253_Sub3) this).anInt7679);
							for (int i_1019_ = -i_945_; i_1019_ < 0; i_1019_++) {
								int i_1020_ = aByteArray8562[(i_951_ >> 16)
										+ i_1018_];
								if (i_1020_ != 0) {
									int i_1021_ = anIntArray8561[i_1020_ & 0xff];
									if (i_1015_ != 255) {
										int i_1022_ = ((i_1021_ & 0xff0000)
												* i_1012_ & ~0xffffff);
										int i_1023_ = ((i_1021_ & 0xff00)
												* i_1013_ & 0xff0000);
										int i_1024_ = ((i_1021_ & 0xff)
												* i_1014_ & 0xff00);
										i_1021_ = (i_1022_ | i_1023_ | i_1024_) >>> 8;
										int i_1025_ = is[i_960_];
										is[i_960_++] = ((((i_1021_ & 0xff00ff)
												* i_1015_ + ((i_1025_ & 0xff00ff) * i_1016_)) & ~0xff00ff) + (((i_1021_ & 0xff00)
												* i_1015_ + ((i_1025_ & 0xff00) * i_1016_)) & 0xff0000)) >> 8;
									} else {
										int i_1026_ = ((i_1021_ & 0xff0000)
												* i_1012_ & ~0xffffff);
										int i_1027_ = ((i_1021_ & 0xff00)
												* i_1013_ & 0xff0000);
										int i_1028_ = ((i_1021_ & 0xff)
												* i_1014_ & 0xff00);
										is[i_960_++] = (i_1026_ | i_1027_ | i_1028_) >>> 8;
									}
								} else
									i_960_++;
								i_951_ += i_956_;
							}
							i_952_ += i_957_;
							i_951_ = i_1003_;
							i_960_ += i_961_;
						}
						return;
					}
					return;
				}
				if (i_947_ == 3) {
					int i_1029_ = i_951_;
					int i_1030_ = i_948_ >>> 24;
					int i_1031_ = 256 - i_1030_;
					for (int i_1032_ = -i_946_; i_1032_ < 0; i_1032_++) {
						int i_1033_ = ((i_952_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_1034_ = -i_945_; i_1034_ < 0; i_1034_++) {
							byte i_1035_ = aByteArray8562[(i_951_ >> 16)
									+ i_1033_];
							int i_1036_ = i_1035_ > 0 ? anIntArray8561[i_1035_]
									: 0;
							int i_1037_ = i_1036_ + i_948_;
							int i_1038_ = (i_1036_ & 0xff00ff)
									+ (i_948_ & 0xff00ff);
							int i_1039_ = ((i_1038_ & 0x1000100) + (i_1037_
									- i_1038_ & 0x10000));
							i_1039_ = i_1037_ - i_1039_ | i_1039_
									- (i_1039_ >>> 8);
							if (i_1036_ == 0 && i_1030_ != 255) {
								i_1036_ = i_1039_;
								i_1039_ = is[i_960_];
								i_1039_ = ((((i_1036_ & 0xff00ff) * i_1030_ + (i_1039_ & 0xff00ff)
										* i_1031_) & ~0xff00ff) + (((i_1036_ & 0xff00)
										* i_1030_ + (i_1039_ & 0xff00)
										* i_1031_) & 0xff0000)) >> 8;
							}
							is[i_960_++] = i_1039_;
							i_951_ += i_956_;
						}
						i_952_ += i_957_;
						i_951_ = i_1029_;
						i_960_ += i_961_;
					}
					return;
				}
				if (i_947_ == 2) {
					int i_1040_ = i_948_ >>> 24;
					int i_1041_ = 256 - i_1040_;
					int i_1042_ = (i_948_ & 0xff00ff) * i_1041_ & ~0xff00ff;
					int i_1043_ = (i_948_ & 0xff00) * i_1041_ & 0xff0000;
					i_948_ = (i_1042_ | i_1043_) >>> 8;
					int i_1044_ = i_951_;
					for (int i_1045_ = -i_946_; i_1045_ < 0; i_1045_++) {
						int i_1046_ = ((i_952_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_1047_ = -i_945_; i_1047_ < 0; i_1047_++) {
							int i_1048_ = aByteArray8562[(i_951_ >> 16)
									+ i_1046_];
							if (i_1048_ != 0) {
								int i_1049_ = anIntArray8561[i_1048_ & 0xff];
								i_1042_ = ((i_1049_ & 0xff00ff) * i_1040_ & ~0xff00ff);
								i_1043_ = (i_1049_ & 0xff00) * i_1040_
										& 0xff0000;
								is[i_960_++] = ((i_1042_ | i_1043_) >>> 8)
										+ i_948_;
							} else
								i_960_++;
							i_951_ += i_956_;
						}
						i_952_ += i_957_;
						i_951_ = i_1044_;
						i_960_ += i_961_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_949_ == 2) {
				if (i_947_ == 1) {
					int i_1050_ = i_951_;
					for (int i_1051_ = -i_946_; i_1051_ < 0; i_1051_++) {
						int i_1052_ = ((i_952_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_1053_ = -i_945_; i_1053_ < 0; i_1053_++) {
							int i_1054_ = aByteArray8562[(i_951_ >> 16)
									+ i_1052_];
							if (i_1054_ != 0) {
								int i_1055_ = anIntArray8561[i_1054_ & 0xff];
								int i_1056_ = is[i_960_];
								int i_1057_ = i_1055_ + i_1056_;
								int i_1058_ = ((i_1055_ & 0xff00ff) + (i_1056_ & 0xff00ff));
								i_1056_ = ((i_1058_ & 0x1000100) + (i_1057_
										- i_1058_ & 0x10000));
								is[i_960_++] = i_1057_ - i_1056_ | i_1056_
										- (i_1056_ >>> 8);
							} else
								i_960_++;
							i_951_ += i_956_;
						}
						i_952_ += i_957_;
						i_951_ = i_1050_;
						i_960_ += i_961_;
					}
					return;
				}
				if (i_947_ == 0) {
					int i_1059_ = i_951_;
					int i_1060_ = (i_948_ & 0xff0000) >> 16;
					int i_1061_ = (i_948_ & 0xff00) >> 8;
					int i_1062_ = i_948_ & 0xff;
					for (int i_1063_ = -i_946_; i_1063_ < 0; i_1063_++) {
						int i_1064_ = ((i_952_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_1065_ = -i_945_; i_1065_ < 0; i_1065_++) {
							int i_1066_ = aByteArray8562[(i_951_ >> 16)
									+ i_1064_];
							if (i_1066_ != 0) {
								int i_1067_ = anIntArray8561[i_1066_ & 0xff];
								int i_1068_ = ((i_1067_ & 0xff0000) * i_1060_ & ~0xffffff);
								int i_1069_ = (i_1067_ & 0xff00) * i_1061_
										& 0xff0000;
								int i_1070_ = (i_1067_ & 0xff) * i_1062_
										& 0xff00;
								i_1067_ = (i_1068_ | i_1069_ | i_1070_) >>> 8;
								int i_1071_ = is[i_960_];
								int i_1072_ = i_1067_ + i_1071_;
								int i_1073_ = ((i_1067_ & 0xff00ff) + (i_1071_ & 0xff00ff));
								i_1071_ = ((i_1073_ & 0x1000100) + (i_1072_
										- i_1073_ & 0x10000));
								is[i_960_++] = i_1072_ - i_1071_ | i_1071_
										- (i_1071_ >>> 8);
							} else
								i_960_++;
							i_951_ += i_956_;
						}
						i_952_ += i_957_;
						i_951_ = i_1059_;
						i_960_ += i_961_;
					}
					return;
				}
				if (i_947_ == 3) {
					int i_1074_ = i_951_;
					for (int i_1075_ = -i_946_; i_1075_ < 0; i_1075_++) {
						int i_1076_ = ((i_952_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_1077_ = -i_945_; i_1077_ < 0; i_1077_++) {
							byte i_1078_ = aByteArray8562[(i_951_ >> 16)
									+ i_1076_];
							int i_1079_ = i_1078_ > 0 ? anIntArray8561[i_1078_]
									: 0;
							int i_1080_ = i_1079_ + i_948_;
							int i_1081_ = (i_1079_ & 0xff00ff)
									+ (i_948_ & 0xff00ff);
							int i_1082_ = ((i_1081_ & 0x1000100) + (i_1080_
									- i_1081_ & 0x10000));
							i_1079_ = i_1080_ - i_1082_ | i_1082_
									- (i_1082_ >>> 8);
							i_1082_ = is[i_960_];
							i_1080_ = i_1079_ + i_1082_;
							i_1081_ = (i_1079_ & 0xff00ff)
									+ (i_1082_ & 0xff00ff);
							i_1082_ = (i_1081_ & 0x1000100)
									+ (i_1080_ - i_1081_ & 0x10000);
							is[i_960_++] = i_1080_ - i_1082_ | i_1082_
									- (i_1082_ >>> 8);
							i_951_ += i_956_;
						}
						i_952_ += i_957_;
						i_951_ = i_1074_;
						i_960_ += i_961_;
					}
					return;
				}
				if (i_947_ == 2) {
					int i_1083_ = i_948_ >>> 24;
					int i_1084_ = 256 - i_1083_;
					int i_1085_ = (i_948_ & 0xff00ff) * i_1084_ & ~0xff00ff;
					int i_1086_ = (i_948_ & 0xff00) * i_1084_ & 0xff0000;
					i_948_ = (i_1085_ | i_1086_) >>> 8;
					int i_1087_ = i_951_;
					for (int i_1088_ = -i_946_; i_1088_ < 0; i_1088_++) {
						int i_1089_ = ((i_952_ >> 16) * ((Class253_Sub3) this).anInt7679);
						for (int i_1090_ = -i_945_; i_1090_ < 0; i_1090_++) {
							int i_1091_ = aByteArray8562[(i_951_ >> 16)
									+ i_1089_];
							if (i_1091_ != 0) {
								int i_1092_ = anIntArray8561[i_1091_ & 0xff];
								i_1085_ = ((i_1092_ & 0xff00ff) * i_1083_ & ~0xff00ff);
								i_1086_ = (i_1092_ & 0xff00) * i_1083_
										& 0xff0000;
								i_1092_ = ((i_1085_ | i_1086_) >>> 8) + i_948_;
								int i_1093_ = is[i_960_];
								int i_1094_ = i_1092_ + i_1093_;
								int i_1095_ = ((i_1092_ & 0xff00ff) + (i_1093_ & 0xff00ff));
								i_1093_ = ((i_1095_ & 0x1000100) + (i_1094_
										- i_1095_ & 0x10000));
								is[i_960_++] = i_1094_ - i_1093_ | i_1093_
										- (i_1093_ >>> 8);
							} else
								i_960_++;
							i_951_ += i_956_;
						}
						i_952_ += i_957_;
						i_951_ = i_1087_;
						i_960_ += i_961_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}

	final void method1624(int i, int i_1096_, int i_1097_, int i_1098_,
			int i_1099_) {
		if (((Class253_Sub3) this).aClass163_Sub1_7698.method2293())
			throw new IllegalStateException();
		int i_1100_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5206);
		i += ((Class253_Sub3) this).anInt7689;
		i_1096_ += ((Class253_Sub3) this).anInt7691;
		int i_1101_ = i_1096_ * i_1100_ + i;
		int i_1102_ = 0;
		int i_1103_ = ((Class253_Sub3) this).anInt7671;
		int i_1104_ = ((Class253_Sub3) this).anInt7679;
		int i_1105_ = i_1100_ - i_1104_;
		int i_1106_ = 0;
		if (i_1096_ < (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177)) {
			int i_1107_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177)
					- i_1096_;
			i_1103_ -= i_1107_;
			i_1096_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5177);
			i_1102_ += i_1107_ * i_1104_;
			i_1101_ += i_1107_ * i_1100_;
		}
		if (i_1096_ + i_1103_ > (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5193))
			i_1103_ -= (i_1096_ + i_1103_ - ((Class163_Sub1) (((Class253_Sub3) this).aClass163_Sub1_7698)).anInt5193);
		if (i < (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186)) {
			int i_1108_ = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186)
					- i;
			i_1104_ -= i_1108_;
			i = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5186);
			i_1102_ += i_1108_;
			i_1101_ += i_1108_;
			i_1106_ += i_1108_;
			i_1105_ += i_1108_;
		}
		if (i + i_1104_ > (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5178)) {
			int i_1109_ = (i + i_1104_ - ((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anInt5178);
			i_1104_ -= i_1109_;
			i_1106_ += i_1109_;
			i_1105_ += i_1109_;
		}
		if (i_1104_ > 0 && i_1103_ > 0) {
			int[] is = (((Class163_Sub1) ((Class253_Sub3) this).aClass163_Sub1_7698).anIntArray5214);
			if (i_1099_ == 0) {
				if (i_1097_ == 1) {
					for (int i_1110_ = -i_1103_; i_1110_ < 0; i_1110_++) {
						int i_1111_ = i_1101_ + i_1104_ - 3;
						while (i_1101_ < i_1111_) {
							is[i_1101_++] = (anIntArray8561[aByteArray8562[i_1102_++] & 0xff]);
							is[i_1101_++] = (anIntArray8561[aByteArray8562[i_1102_++] & 0xff]);
							is[i_1101_++] = (anIntArray8561[aByteArray8562[i_1102_++] & 0xff]);
							is[i_1101_++] = (anIntArray8561[aByteArray8562[i_1102_++] & 0xff]);
						}
						i_1111_ += 3;
						while (i_1101_ < i_1111_)
							is[i_1101_++] = (anIntArray8561[aByteArray8562[i_1102_++] & 0xff]);
						i_1101_ += i_1105_;
						i_1102_ += i_1106_;
					}
					return;
				}
				if (i_1097_ == 0) {
					int i_1112_ = (i_1098_ & 0xff0000) >> 16;
					int i_1113_ = (i_1098_ & 0xff00) >> 8;
					int i_1114_ = i_1098_ & 0xff;
					for (int i_1115_ = -i_1103_; i_1115_ < 0; i_1115_++) {
						for (int i_1116_ = -i_1104_; i_1116_ < 0; i_1116_++) {
							int i_1117_ = (anIntArray8561[aByteArray8562[i_1102_++] & 0xff]);
							int i_1118_ = (i_1117_ & 0xff0000) * i_1112_
									& ~0xffffff;
							int i_1119_ = (i_1117_ & 0xff00) * i_1113_
									& 0xff0000;
							int i_1120_ = (i_1117_ & 0xff) * i_1114_ & 0xff00;
							is[i_1101_++] = (i_1118_ | i_1119_ | i_1120_) >>> 8;
						}
						i_1101_ += i_1105_;
						i_1102_ += i_1106_;
					}
					return;
				}
				if (i_1097_ == 3) {
					for (int i_1121_ = -i_1103_; i_1121_ < 0; i_1121_++) {
						for (int i_1122_ = -i_1104_; i_1122_ < 0; i_1122_++) {
							int i_1123_ = (anIntArray8561[aByteArray8562[i_1102_++] & 0xff]);
							int i_1124_ = i_1123_ + i_1098_;
							int i_1125_ = (i_1123_ & 0xff00ff)
									+ (i_1098_ & 0xff00ff);
							int i_1126_ = ((i_1125_ & 0x1000100) + (i_1124_
									- i_1125_ & 0x10000));
							is[i_1101_++] = i_1124_ - i_1126_ | i_1126_
									- (i_1126_ >>> 8);
						}
						i_1101_ += i_1105_;
						i_1102_ += i_1106_;
					}
					return;
				}
				if (i_1097_ == 2) {
					int i_1127_ = i_1098_ >>> 24;
					int i_1128_ = 256 - i_1127_;
					int i_1129_ = (i_1098_ & 0xff00ff) * i_1128_ & ~0xff00ff;
					int i_1130_ = (i_1098_ & 0xff00) * i_1128_ & 0xff0000;
					i_1098_ = (i_1129_ | i_1130_) >>> 8;
					for (int i_1131_ = -i_1103_; i_1131_ < 0; i_1131_++) {
						for (int i_1132_ = -i_1104_; i_1132_ < 0; i_1132_++) {
							int i_1133_ = (anIntArray8561[aByteArray8562[i_1102_++] & 0xff]);
							i_1129_ = (i_1133_ & 0xff00ff) * i_1127_
									& ~0xff00ff;
							i_1130_ = (i_1133_ & 0xff00) * i_1127_ & 0xff0000;
							is[i_1101_++] = ((i_1129_ | i_1130_) >>> 8)
									+ i_1098_;
						}
						i_1101_ += i_1105_;
						i_1102_ += i_1106_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_1099_ == 1) {
				if (i_1097_ == 1) {
					for (int i_1134_ = -i_1103_; i_1134_ < 0; i_1134_++) {
						for (int i_1135_ = -i_1104_; i_1135_ < 0; i_1135_++) {
							int i_1136_ = aByteArray8562[i_1102_++];
							if (i_1136_ != 0) {
								int i_1137_ = (anIntArray8561[i_1136_ & 0xff] | ~0xffffff);
								int i_1138_ = 255;
								int i_1139_ = 0;
								int i_1140_ = is[i_1101_];
								is[i_1101_++] = (((((i_1137_ & 0xff00ff)
										* i_1138_ + (i_1140_ & 0xff00ff)
										* i_1139_) & ~0xff00ff) >> 8) + (((((i_1137_ & ~0xff00ff) >>> 8) * i_1138_) + (((i_1140_ & ~0xff00ff) >>> 8) * i_1139_)) & ~0xff00ff));
							} else
								i_1101_++;
						}
						i_1101_ += i_1105_;
						i_1102_ += i_1106_;
					}
					return;
				}
				if (i_1097_ == 0) {
					if ((i_1098_ & 0xffffff) == 16777215) {
						int i_1141_ = i_1098_ >>> 24;
						int i_1142_ = 256 - i_1141_;
						for (int i_1143_ = -i_1103_; i_1143_ < 0; i_1143_++) {
							for (int i_1144_ = -i_1104_; i_1144_ < 0; i_1144_++) {
								int i_1145_ = aByteArray8562[i_1102_++];
								if (i_1145_ != 0) {
									int i_1146_ = anIntArray8561[i_1145_ & 0xff];
									int i_1147_ = is[i_1101_];
									is[i_1101_++] = ((((i_1146_ & 0xff00ff)
											* i_1141_ + (i_1147_ & 0xff00ff)
											* i_1142_) & ~0xff00ff) + (((i_1146_ & 0xff00)
											* i_1141_ + (i_1147_ & 0xff00)
											* i_1142_) & 0xff0000)) >> 8;
								} else
									i_1101_++;
							}
							i_1101_ += i_1105_;
							i_1102_ += i_1106_;
						}
					} else {
						int i_1148_ = (i_1098_ & 0xff0000) >> 16;
						int i_1149_ = (i_1098_ & 0xff00) >> 8;
						int i_1150_ = i_1098_ & 0xff;
						int i_1151_ = i_1098_ >>> 24;
						int i_1152_ = 256 - i_1151_;
						for (int i_1153_ = -i_1103_; i_1153_ < 0; i_1153_++) {
							for (int i_1154_ = -i_1104_; i_1154_ < 0; i_1154_++) {
								int i_1155_ = aByteArray8562[i_1102_++];
								if (i_1155_ != 0) {
									int i_1156_ = anIntArray8561[i_1155_ & 0xff];
									if (i_1151_ != 255) {
										int i_1157_ = ((i_1156_ & 0xff0000)
												* i_1148_ & ~0xffffff);
										int i_1158_ = ((i_1156_ & 0xff00)
												* i_1149_ & 0xff0000);
										int i_1159_ = ((i_1156_ & 0xff)
												* i_1150_ & 0xff00);
										i_1156_ = (i_1157_ | i_1158_ | i_1159_) >>> 8;
										int i_1160_ = is[i_1101_];
										is[i_1101_++] = ((((i_1156_ & 0xff00ff)
												* i_1151_ + ((i_1160_ & 0xff00ff) * i_1152_)) & ~0xff00ff) + (((i_1156_ & 0xff00)
												* i_1151_ + ((i_1160_ & 0xff00) * i_1152_)) & 0xff0000)) >> 8;
									} else {
										int i_1161_ = ((i_1156_ & 0xff0000)
												* i_1148_ & ~0xffffff);
										int i_1162_ = ((i_1156_ & 0xff00)
												* i_1149_ & 0xff0000);
										int i_1163_ = ((i_1156_ & 0xff)
												* i_1150_ & 0xff00);
										is[i_1101_++] = (i_1161_ | i_1162_ | i_1163_) >>> 8;
									}
								} else
									i_1101_++;
							}
							i_1101_ += i_1105_;
							i_1102_ += i_1106_;
						}
						return;
					}
					return;
				}
				if (i_1097_ == 3) {
					int i_1164_ = i_1098_ >>> 24;
					int i_1165_ = 256 - i_1164_;
					for (int i_1166_ = -i_1103_; i_1166_ < 0; i_1166_++) {
						for (int i_1167_ = -i_1104_; i_1167_ < 0; i_1167_++) {
							byte i_1168_ = aByteArray8562[i_1102_++];
							int i_1169_ = i_1168_ > 0 ? anIntArray8561[i_1168_]
									: 0;
							int i_1170_ = i_1169_ + i_1098_;
							int i_1171_ = (i_1169_ & 0xff00ff)
									+ (i_1098_ & 0xff00ff);
							int i_1172_ = ((i_1171_ & 0x1000100) + (i_1170_
									- i_1171_ & 0x10000));
							i_1172_ = i_1170_ - i_1172_ | i_1172_
									- (i_1172_ >>> 8);
							if (i_1169_ == 0 && i_1164_ != 255) {
								i_1169_ = i_1172_;
								i_1172_ = is[i_1101_];
								i_1172_ = ((((i_1169_ & 0xff00ff) * i_1164_ + (i_1172_ & 0xff00ff)
										* i_1165_) & ~0xff00ff) + (((i_1169_ & 0xff00)
										* i_1164_ + (i_1172_ & 0xff00)
										* i_1165_) & 0xff0000)) >> 8;
							}
							is[i_1101_++] = i_1172_;
						}
						i_1101_ += i_1105_;
						i_1102_ += i_1106_;
					}
					return;
				}
				if (i_1097_ == 2) {
					int i_1173_ = i_1098_ >>> 24;
					int i_1174_ = 256 - i_1173_;
					int i_1175_ = (i_1098_ & 0xff00ff) * i_1174_ & ~0xff00ff;
					int i_1176_ = (i_1098_ & 0xff00) * i_1174_ & 0xff0000;
					i_1098_ = (i_1175_ | i_1176_) >>> 8;
					for (int i_1177_ = -i_1103_; i_1177_ < 0; i_1177_++) {
						for (int i_1178_ = -i_1104_; i_1178_ < 0; i_1178_++) {
							int i_1179_ = aByteArray8562[i_1102_++];
							if (i_1179_ != 0) {
								int i_1180_ = anIntArray8561[i_1179_ & 0xff];
								i_1175_ = ((i_1180_ & 0xff00ff) * i_1173_ & ~0xff00ff);
								i_1176_ = (i_1180_ & 0xff00) * i_1173_
										& 0xff0000;
								is[i_1101_++] = ((i_1175_ | i_1176_) >>> 8)
										+ i_1098_;
							} else
								i_1101_++;
						}
						i_1101_ += i_1105_;
						i_1102_ += i_1106_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_1099_ == 2) {
				if (i_1097_ == 1) {
					for (int i_1181_ = -i_1103_; i_1181_ < 0; i_1181_++) {
						for (int i_1182_ = -i_1104_; i_1182_ < 0; i_1182_++) {
							int i_1183_ = aByteArray8562[i_1102_++];
							if (i_1183_ != 0) {
								int i_1184_ = anIntArray8561[i_1183_ & 0xff];
								int i_1185_ = is[i_1101_];
								int i_1186_ = i_1184_ + i_1185_;
								int i_1187_ = ((i_1184_ & 0xff00ff) + (i_1185_ & 0xff00ff));
								i_1185_ = ((i_1187_ & 0x1000100) + (i_1186_
										- i_1187_ & 0x10000));
								is[i_1101_++] = i_1186_ - i_1185_ | i_1185_
										- (i_1185_ >>> 8);
							} else
								i_1101_++;
						}
						i_1101_ += i_1105_;
						i_1102_ += i_1106_;
					}
					return;
				}
				if (i_1097_ == 0) {
					int i_1188_ = (i_1098_ & 0xff0000) >> 16;
					int i_1189_ = (i_1098_ & 0xff00) >> 8;
					int i_1190_ = i_1098_ & 0xff;
					for (int i_1191_ = -i_1103_; i_1191_ < 0; i_1191_++) {
						for (int i_1192_ = -i_1104_; i_1192_ < 0; i_1192_++) {
							int i_1193_ = aByteArray8562[i_1102_++];
							if (i_1193_ != 0) {
								int i_1194_ = anIntArray8561[i_1193_ & 0xff];
								int i_1195_ = ((i_1194_ & 0xff0000) * i_1188_ & ~0xffffff);
								int i_1196_ = (i_1194_ & 0xff00) * i_1189_
										& 0xff0000;
								int i_1197_ = (i_1194_ & 0xff) * i_1190_
										& 0xff00;
								i_1194_ = (i_1195_ | i_1196_ | i_1197_) >>> 8;
								int i_1198_ = is[i_1101_];
								int i_1199_ = i_1194_ + i_1198_;
								int i_1200_ = ((i_1194_ & 0xff00ff) + (i_1198_ & 0xff00ff));
								i_1198_ = ((i_1200_ & 0x1000100) + (i_1199_
										- i_1200_ & 0x10000));
								is[i_1101_++] = i_1199_ - i_1198_ | i_1198_
										- (i_1198_ >>> 8);
							} else
								i_1101_++;
						}
						i_1101_ += i_1105_;
						i_1102_ += i_1106_;
					}
					return;
				}
				if (i_1097_ == 3) {
					for (int i_1201_ = -i_1103_; i_1201_ < 0; i_1201_++) {
						for (int i_1202_ = -i_1104_; i_1202_ < 0; i_1202_++) {
							byte i_1203_ = aByteArray8562[i_1102_++];
							int i_1204_ = i_1203_ > 0 ? anIntArray8561[i_1203_]
									: 0;
							int i_1205_ = i_1204_ + i_1098_;
							int i_1206_ = (i_1204_ & 0xff00ff)
									+ (i_1098_ & 0xff00ff);
							int i_1207_ = ((i_1206_ & 0x1000100) + (i_1205_
									- i_1206_ & 0x10000));
							i_1204_ = i_1205_ - i_1207_ | i_1207_
									- (i_1207_ >>> 8);
							i_1207_ = is[i_1101_];
							i_1205_ = i_1204_ + i_1207_;
							i_1206_ = (i_1204_ & 0xff00ff)
									+ (i_1207_ & 0xff00ff);
							i_1207_ = (i_1206_ & 0x1000100)
									+ (i_1205_ - i_1206_ & 0x10000);
							is[i_1101_++] = i_1205_ - i_1207_ | i_1207_
									- (i_1207_ >>> 8);
						}
						i_1101_ += i_1105_;
						i_1102_ += i_1106_;
					}
					return;
				}
				if (i_1097_ == 2) {
					int i_1208_ = i_1098_ >>> 24;
					int i_1209_ = 256 - i_1208_;
					int i_1210_ = (i_1098_ & 0xff00ff) * i_1209_ & ~0xff00ff;
					int i_1211_ = (i_1098_ & 0xff00) * i_1209_ & 0xff0000;
					i_1098_ = (i_1210_ | i_1211_) >>> 8;
					for (int i_1212_ = -i_1103_; i_1212_ < 0; i_1212_++) {
						for (int i_1213_ = -i_1104_; i_1213_ < 0; i_1213_++) {
							int i_1214_ = aByteArray8562[i_1102_++];
							if (i_1214_ != 0) {
								int i_1215_ = anIntArray8561[i_1214_ & 0xff];
								i_1210_ = ((i_1215_ & 0xff00ff) * i_1208_ & ~0xff00ff);
								i_1211_ = (i_1215_ & 0xff00) * i_1208_
										& 0xff0000;
								i_1215_ = ((i_1210_ | i_1211_) >>> 8) + i_1098_;
								int i_1216_ = is[i_1101_];
								int i_1217_ = i_1215_ + i_1216_;
								int i_1218_ = ((i_1215_ & 0xff00ff) + (i_1216_ & 0xff00ff));
								i_1216_ = ((i_1218_ & 0x1000100) + (i_1217_
										- i_1218_ & 0x10000));
								is[i_1101_++] = i_1217_ - i_1216_ | i_1216_
										- (i_1216_ >>> 8);
							} else
								i_1101_++;
						}
						i_1101_ += i_1105_;
						i_1102_ += i_1106_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}
}
