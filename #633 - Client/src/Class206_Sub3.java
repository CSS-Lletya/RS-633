/* Class206_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class206_Sub3 extends Class206 {
	private Class271 aClass271_6721;
	static OutgoingPacket ACTION_BUTTON9 = new OutgoingPacket(18, 8);
	static int anInt6723;
	private Class350 aClass350_6724;
	private Class350 aClass350_6725;
	static int anInt6726;
	private short[] aShortArray6727;
	static int anInt6728;
	static int anInt6729;
	static int anInt6730;
	static int anInt6731;
	private short[] aShortArray6732;
	private byte aByte6733;
	static int anInt6734;
	private byte[] aByteArray6735;
	static int anInt6736;
	static int anInt6737;
	static int anInt6738;
	private short aShort6739;
	private int anInt6740;
	private boolean aBool6741 = false;
	private int anInt6742;
	static int anInt6743;
	private int[] anIntArray6744;
	private int[][] anIntArrayArray6745;
	static int anInt6746;
	static int anInt6747;
	static int anInt6748;
	static int anInt6749;
	static int anInt6750;
	private short aShort6751;
	private int[] anIntArray6752;
	private short[] aShortArray6753;
	static int anInt6754;
	static int anInt6755;
	private short[] aShortArray6756;
	private int[] anIntArray6757;
	private short[] aShortArray6758;
	private int anInt6759 = 0;
	private float[] aFloatArray6760;
	static int anInt6761;
	private short aShort6762;
	private int[] anIntArray6763;
	private short[] aShortArray6764;
	static int anInt6765;
	static int anInt6766;
	private Interface19 anInterface19_6767;
	private int anInt6768;
	private float[] aFloatArray6769;
	static int anInt6770;
	static int anInt6771;
	static int anInt6772;
	static int anInt6773;
	static int anInt6774;
	private int[] anIntArray6775;
	private int[][] anIntArrayArray6776;
	static int anInt6777;
	static int anInt6778;
	static int anInt6779;
	private short aShort6780;
	static int anInt6781;
	private short aShort6782;
	static int anInt6783;
	static int anInt6784;
	static int anInt6785;
	static int anInt6786;
	private short[] aShortArray6787;
	static int anInt6788;
	static int anInt6789;
	static int anInt6790;
	private Class163_Sub3 aClass163_Sub3_6791;
	private int anInt6792 = 0;
	static int anInt6793;
	static int anInt6794;
	private Class261[] aClass261Array6795;
	static int anInt6796;
	static int anInt6797;
	private Class110[] aClass110Array6798;
	static int anInt6799;
	private short[] aShortArray6800;
	static int anInt6801;
	private int anInt6802;
	static int anInt6803;
	private boolean aBool6804;
	private short aShort6805;
	static int anInt6806;
	private int[][] anIntArrayArray6807;
	private Class381 aClass381_6808;
	static int anInt6809;
	private Class350 aClass350_6810;
	private Interface9 anInterface9_6811;
	private short[] aShortArray6812;
	private short aShort6813;
	private Class350 aClass350_6814;
	static int anInt6815;
	private boolean aBool6816;
	private short aShort6817;
	private boolean aBool6818 = false;
	static int anInt6819;
	private int anInt6820;
	static int anInt6821;
	private short aShort6822;
	static int anInt6823;
	private short aShort6824;
	private int anInt6825;
	private short[] aShortArray6826;
	static int anInt6827;
	static int anInt6828;
	private short[] aShortArray6829;
	private byte[] aByteArray6830;
	static int anInt6831;
	static int anInt6832;
	static int anInt6833;
	static int anInt6834;
	static int anInt6835;
	static IncomingPacket aClass160_6836 = new IncomingPacket(10, 0);
	static int anInt6837;
	private Class199[] aClass199Array6838;
	static int anInt6839;
	static int anInt6840;
	private Class330[] aClass330Array6841;
	static int anInt6842;

	private final void method2770(byte i, boolean bool) {
		do {
			try {
				anInt6799++;
				if ((((Stream) (((Class163_Sub3) aClass163_Sub3_6791).aClass11_Sub20_Sub2_8406)).buffer).length >= 6 * anInt6759)
					((Stream) (((Class163_Sub3) aClass163_Sub3_6791).aClass11_Sub20_Sub2_8406)).position = 0;
				else
					((Class163_Sub3) aClass163_Sub3_6791).aClass11_Sub20_Sub2_8406 = new Class11_Sub20_Sub2(
							6 * (100 + anInt6759));
				Class11_Sub20_Sub2 class11_sub20_sub2 = (((Class163_Sub3) aClass163_Sub3_6791).aClass11_Sub20_Sub2_8406);
				if (((Class163_Sub3) aClass163_Sub3_6791).aBool8348) {
					for (int i_0_ = 0; i_0_ < anInt6759; i_0_++) {
						class11_sub20_sub2.writeShort(-120,
								aShortArray6829[i_0_]);
						class11_sub20_sub2.writeShort(-125,
								aShortArray6800[i_0_]);
						class11_sub20_sub2.writeShort(-123,
								aShortArray6732[i_0_]);
					}
				} else {
					for (int i_1_ = 0; anInt6759 > i_1_; i_1_++) {
						class11_sub20_sub2.method2539(aShortArray6829[i_1_],
								-1682769048);
						class11_sub20_sub2.method2539(aShortArray6800[i_1_],
								-1682769048);
						class11_sub20_sub2.method2539(aShortArray6732[i_1_],
								-1682769048);
					}
				}
				if (((Stream) class11_sub20_sub2).position != 0) {
					if (i < 26)
						NA();
					if (!bool)
						((Class381) aClass381_6808).anInterface19_4961 = (aClass163_Sub3_6791
								.method3245(-16889,
										((Stream) class11_sub20_sub2).buffer,
										((Stream) class11_sub20_sub2).position,
										5123, false));
					else {
						if (anInterface19_6767 == null)
							anInterface19_6767 = (aClass163_Sub3_6791
									.method3245(
											-16889,
											(((Stream) class11_sub20_sub2).buffer),
											((Stream) class11_sub20_sub2).position,
											5123, true));
						else
							anInterface19_6767.method49(5123,
									((Stream) class11_sub20_sub2).position,
									((Stream) class11_sub20_sub2).buffer, -128);
						((Class381) aClass381_6808).anInterface19_4961 = anInterface19_6767;
					}
					if (bool)
						break;
					aBool6804 = true;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "li.W(" + i + ','
						+ bool + ')');
			}
			break;
		} while (false);
	}

	private final void method2771(boolean bool, byte i) {
		do {
			try {
				anInt6789++;
				boolean bool_2_ = (aClass350_6814 != null && (((Class350) aClass350_6814).anInterface9_4613 == null));
				boolean bool_3_ = (aClass350_6724 != null && (((Class350) aClass350_6724).anInterface9_4613 == null));
				boolean bool_4_ = (aClass350_6810 != null && (((Class350) aClass350_6810).anInterface9_4613 == null));
				boolean bool_5_ = (aClass350_6725 != null && (((Class350) aClass350_6725).anInterface9_4613 == null));
				if (bool) {
					bool_2_ = bool_2_ & (aByte6733 & 0x2) != 0;
					bool_5_ = bool_5_ & (aByte6733 & 0x8) != 0;
					bool_3_ = bool_3_ & (0x4 & aByte6733) != 0;
					bool_4_ = bool_4_ & (aByte6733 & 0x1 ^ 0xffffffff) != -1;
				}
				byte i_6_ = 0;
				byte i_7_ = 0;
				byte i_8_ = 0;
				byte i_9_ = 0;
				if (bool_4_) {
					i_7_ = i_6_;
					i_6_ += 12;
				}
				byte i_10_ = 0;
				if (bool_2_) {
					i_8_ = i_6_;
					i_6_ += 4;
				}
				if (bool_3_) {
					i_9_ = i_6_;
					i_6_ += 12;
				}
				if (bool_5_) {
					i_10_ = i_6_;
					i_6_ += 8;
				}
				if ((i_6_ ^ 0xffffffff) != -1) {
					if (i != 83)
						aShortArray6787 = null;
					if (((((Stream) (((Class163_Sub3) aClass163_Sub3_6791).aClass11_Sub20_Sub2_8406)).buffer).length ^ 0xffffffff) <= (i_6_
							* anInt6820 ^ 0xffffffff))
						((Stream) (((Class163_Sub3) aClass163_Sub3_6791).aClass11_Sub20_Sub2_8406)).position = 0;
					else
						((Class163_Sub3) aClass163_Sub3_6791).aClass11_Sub20_Sub2_8406 = new Class11_Sub20_Sub2(
								i_6_ * (anInt6820 + 100));
					Class11_Sub20_Sub2 class11_sub20_sub2 = (((Class163_Sub3) aClass163_Sub3_6791).aClass11_Sub20_Sub2_8406);
					if (bool_4_) {
						if (((Class163_Sub3) aClass163_Sub3_6791).aBool8348) {
							for (int i_11_ = 0; i_11_ < anInt6802; i_11_++) {
								int i_12_ = (jaclib.memory.Stream
										.floatToRawIntBits((float) anIntArray6775[i_11_]));
								int i_13_ = (jaclib.memory.Stream
										.floatToRawIntBits((float) anIntArray6744[i_11_]));
								int i_14_ = (jaclib.memory.Stream
										.floatToRawIntBits((float) anIntArray6757[i_11_]));
								int i_15_ = anIntArray6763[i_11_];
								int i_16_ = anIntArray6763[1 + i_11_];
								for (int i_17_ = i_15_; i_16_ > i_17_; i_17_++) {
									int i_18_ = -1 + aShortArray6764[i_17_];
									if ((i_18_ ^ 0xffffffff) == 0)
										break;
									((Stream) class11_sub20_sub2).position = i_18_
											* i_6_;
									class11_sub20_sub2.writeInt(-49, i_12_);
									class11_sub20_sub2.writeInt(-49, i_13_);
									class11_sub20_sub2.writeInt(-49, i_14_);
								}
							}
						} else {
							for (int i_19_ = 0; ((anInt6802 ^ 0xffffffff) < (i_19_ ^ 0xffffffff)); i_19_++) {
								int i_20_ = (jaclib.memory.Stream
										.floatToRawIntBits((float) anIntArray6775[i_19_]));
								int i_21_ = (jaclib.memory.Stream
										.floatToRawIntBits((float) anIntArray6744[i_19_]));
								int i_22_ = (jaclib.memory.Stream
										.floatToRawIntBits((float) anIntArray6757[i_19_]));
								int i_23_ = anIntArray6763[i_19_];
								int i_24_ = anIntArray6763[i_19_ + 1];
								for (int i_25_ = i_23_; i_24_ > i_25_; i_25_++) {
									int i_26_ = aShortArray6764[i_25_] - 1;
									if ((i_26_ ^ 0xffffffff) == 0)
										break;
									((Stream) class11_sub20_sub2).position = i_26_
											* i_6_;
									class11_sub20_sub2.method2527(i_20_, 0);
									class11_sub20_sub2.method2527(i_21_, 0);
									class11_sub20_sub2.method2527(i_22_, 0);
								}
							}
						}
					}
					if (bool_2_) {
						if (aClass350_6724 != null) {
							for (int i_27_ = 0; i_27_ < anInt6792; i_27_++) {
								int i_28_ = method2778(aShortArray6753[i_27_],
										aByteArray6735[i_27_], aShort6751, 79,
										aShortArray6812[i_27_]);
								((Stream) class11_sub20_sub2).position = i_8_
										- -(aShortArray6829[i_27_] * i_6_);
								class11_sub20_sub2.writeInt(-49, i_28_);
								((Stream) class11_sub20_sub2).position = i_8_
										+ aShortArray6800[i_27_] * i_6_;
								class11_sub20_sub2.writeInt(-49, i_28_);
								((Stream) class11_sub20_sub2).position = i_8_
										- -(i_6_ * aShortArray6732[i_27_]);
								class11_sub20_sub2.writeInt(i - 132, i_28_);
							}
						} else {
							short[] is;
							short[] is_29_;
							byte[] is_30_;
							short[] is_31_;
							if (aClass271_6721 == null) {
								is = aShortArray6727;
								is_30_ = aByteArray6830;
								is_31_ = aShortArray6826;
								is_29_ = aShortArray6787;
							} else {
								is = (((Class271) aClass271_6721).aShortArray3654);
								is_29_ = (((Class271) aClass271_6721).aShortArray3653);
								is_30_ = (((Class271) aClass271_6721).aByteArray3657);
								is_31_ = (((Class271) aClass271_6721).aShortArray3656);
							}
							float f = (((Class163_Sub3) aClass163_Sub3_6791).aFloatArray8328[0]);
							float f_32_ = (((Class163_Sub3) aClass163_Sub3_6791).aFloatArray8328[1]);
							float f_33_ = (((Class163_Sub3) aClass163_Sub3_6791).aFloatArray8328[2]);
							float f_34_ = (((Class163_Sub3) aClass163_Sub3_6791).aFloat8349);
							float f_35_ = ((((Class163_Sub3) aClass163_Sub3_6791).aFloat8375) * 768.0F / (float) aShort6805);
							float f_36_ = ((((Class163_Sub3) aClass163_Sub3_6791).aFloat8403) * 768.0F / (float) aShort6805);
							for (int i_37_ = 0; i_37_ < anInt6792; i_37_++) {
								int i_38_ = method2778(aShortArray6753[i_37_],
										aByteArray6735[i_37_], aShort6751,
										i ^ 0x37, aShortArray6812[i_37_]);
								float f_39_ = ((((Class163_Sub3) aClass163_Sub3_6791).aFloat8334) * (float) ((i_38_ & 0xff61) >> 8));
								int i_40_ = aShortArray6829[i_37_];
								float f_41_ = ((float) (i_38_ >>> 24) * (((Class163_Sub3) aClass163_Sub3_6791).aFloat8402));
								float f_42_ = ((float) ((i_38_ & 0xff0773) >> 16) * (((Class163_Sub3) aClass163_Sub3_6791).aFloat8378));
								short i_43_ = (short) is_30_[i_40_];
								float f_44_;
								if ((i_43_ ^ 0xffffffff) == -1)
									f_44_ = ((f_33_ * (float) is_31_[i_40_] + ((float) is[i_40_]
											* f_32_ + (float) is_29_[i_40_] * f)) * 0.0026041667F);
								else
									f_44_ = ((f_33_ * (float) is_31_[i_40_] + ((float) is[i_40_]
											* f_32_ + f * (float) is_29_[i_40_])) / (float) (i_43_ * 256));
								float f_45_ = f_34_ + f_44_
										* (!(f_44_ < 0.0F) ? f_35_ : f_36_);
								int i_46_ = (int) (f_45_ * f_41_);
								int i_47_ = (int) (f_42_ * f_45_);
								if ((i_46_ ^ 0xffffffff) > -1)
									i_46_ = 0;
								else if ((i_46_ ^ 0xffffffff) < -256)
									i_46_ = 255;
								int i_48_ = (int) (f_45_ * f_39_);
								if ((i_47_ ^ 0xffffffff) <= -1) {
									if (i_47_ > 255)
										i_47_ = 255;
								} else
									i_47_ = 0;
								if (i_48_ >= 0) {
									if (i_48_ > 255)
										i_48_ = 255;
								} else
									i_48_ = 0;
								((Stream) class11_sub20_sub2).position = i_8_
										+ i_6_ * i_40_;
								class11_sub20_sub2
										.writeByte(i_46_, -1528071456);
								class11_sub20_sub2
										.writeByte(i_47_, -1528071456);
								class11_sub20_sub2
										.writeByte(i_48_, -1528071456);
								class11_sub20_sub2
										.writeByte(
												-((aByteArray6735[i_37_]) & 0xff) + 255,
												-1528071456);
								i_40_ = aShortArray6800[i_37_];
								i_43_ = (short) is_30_[i_40_];
								if (i_43_ != 0)
									f_44_ = ((f_32_ * (float) is[i_40_] + f
											* (float) is_29_[i_40_] + f_33_
											* (float) is_31_[i_40_]) / (float) (i_43_ * 256));
								else
									f_44_ = (((float) is_29_[i_40_] * f + f_32_
											* (float) is[i_40_] + (float) is_31_[i_40_]
											* f_33_) * 0.0026041667F);
								f_45_ = (f_44_ * (f_44_ < 0.0F ? f_36_ : f_35_) + f_34_);
								i_46_ = (int) (f_41_ * f_45_);
								i_47_ = (int) (f_42_ * f_45_);
								if (i_46_ < 0)
									i_46_ = 0;
								else if (i_46_ > 255)
									i_46_ = 255;
								if (i_47_ >= 0) {
									if (i_47_ > 255)
										i_47_ = 255;
								} else
									i_47_ = 0;
								i_48_ = (int) (f_39_ * f_45_);
								((Stream) class11_sub20_sub2).position = i_8_
										+ i_6_ * i_40_;
								if (i_48_ < 0)
									i_48_ = 0;
								else if ((i_48_ ^ 0xffffffff) < -256)
									i_48_ = 255;
								class11_sub20_sub2
										.writeByte(i_46_, -1528071456);
								class11_sub20_sub2
										.writeByte(i_47_, -1528071456);
								class11_sub20_sub2
										.writeByte(i_48_, -1528071456);
								class11_sub20_sub2.writeByte(
										-(0xff & aByteArray6735[i_37_]) + 255,
										i ^ ~0x5b14854c);
								i_40_ = aShortArray6732[i_37_];
								i_43_ = (short) is_30_[i_40_];
								if ((i_43_ ^ 0xffffffff) != -1)
									f_44_ = ((f_32_ * (float) is[i_40_]
											+ (float) is_29_[i_40_] * f + (float) is_31_[i_40_]
											* f_33_) / (float) (i_43_ * 256));
								else
									f_44_ = (0.0026041667F * ((float) is_29_[i_40_]
											* f + (float) is[i_40_] * f_32_ + (f_33_ * (float) is_31_[i_40_])));
								f_45_ = ((!(f_44_ < 0.0F) ? f_35_ : f_36_) * f_44_)
										+ f_34_;
								i_46_ = (int) (f_41_ * f_45_);
								if (i_46_ >= 0) {
									if (i_46_ > 255)
										i_46_ = 255;
								} else
									i_46_ = 0;
								i_47_ = (int) (f_45_ * f_42_);
								i_48_ = (int) (f_45_ * f_39_);
								if (i_47_ >= 0) {
									if (i_47_ > 255)
										i_47_ = 255;
								} else
									i_47_ = 0;
								((Stream) class11_sub20_sub2).position = i_8_
										+ i_6_ * i_40_;
								if (i_48_ >= 0) {
									if ((i_48_ ^ 0xffffffff) < -256)
										i_48_ = 255;
								} else
									i_48_ = 0;
								class11_sub20_sub2
										.writeByte(i_46_, -1528071456);
								class11_sub20_sub2
										.writeByte(i_47_, -1528071456);
								class11_sub20_sub2
										.writeByte(i_48_, -1528071456);
								class11_sub20_sub2
										.writeByte(
												-((aByteArray6735[i_37_]) & 0xff) + 255,
												-1528071456);
							}
						}
					}
					if (bool_3_) {
						byte[] is;
						short[] is_49_;
						short[] is_50_;
						short[] is_51_;
						if (aClass271_6721 != null) {
							is_49_ = ((Class271) aClass271_6721).aShortArray3656;
							is_50_ = ((Class271) aClass271_6721).aShortArray3653;
							is_51_ = ((Class271) aClass271_6721).aShortArray3654;
							is = ((Class271) aClass271_6721).aByteArray3657;
						} else {
							is = aByteArray6830;
							is_49_ = aShortArray6826;
							is_50_ = aShortArray6787;
							is_51_ = aShortArray6727;
						}
						float f = 3.0F / (float) aShort6805;
						float f_52_ = 3.0F / (float) (aShort6805 / 2 + aShort6805);
						((Stream) class11_sub20_sub2).position = i_9_;
						if (((Class163_Sub3) aClass163_Sub3_6791).aBool8348) {
							for (int i_53_ = 0; ((i_53_ ^ 0xffffffff) > (anInt6820 ^ 0xffffffff)); i_53_++) {
								int i_54_ = 0xff & is[i_53_];
								if (i_54_ == 0) {
									class11_sub20_sub2.method3744(
											(float) is_50_[i_53_] * f_52_,
											-32197);
									class11_sub20_sub2.method3744(f_52_
											* (float) is_51_[i_53_], -32197);
									class11_sub20_sub2.method3744(
											(float) is_49_[i_53_] * f_52_,
											-32197);
								} else {
									float f_55_ = f / (float) i_54_;
									class11_sub20_sub2.method3744(f_55_
											* (float) is_50_[i_53_], -32197);
									class11_sub20_sub2.method3744(
											(float) is_51_[i_53_] * f_55_,
											-32197);
									class11_sub20_sub2.method3744(
											(float) is_49_[i_53_] * f_55_,
											i - 32280);
								}
								((Stream) class11_sub20_sub2).position += -12
										+ i_6_;
							}
						} else {
							for (int i_56_ = 0; ((anInt6820 ^ 0xffffffff) < (i_56_ ^ 0xffffffff)); i_56_++) {
								int i_57_ = 0xff & is[i_56_];
								if ((i_57_ ^ 0xffffffff) != -1) {
									float f_58_ = f / (float) i_57_;
									class11_sub20_sub2.method3743(-1526311408,
											f_58_ * (float) is_50_[i_56_]);
									class11_sub20_sub2.method3743(-1526311408,
											f_58_ * (float) is_51_[i_56_]);
									class11_sub20_sub2.method3743(-1526311408,
											(float) is_49_[i_56_] * f_58_);
								} else {
									class11_sub20_sub2.method3743(i
											+ -1526311491,
											(float) is_50_[i_56_] * f_52_);
									class11_sub20_sub2.method3743(-1526311408,
											f_52_ * (float) is_51_[i_56_]);
									class11_sub20_sub2.method3743(-1526311408,
											f_52_ * (float) is_49_[i_56_]);
								}
								((Stream) class11_sub20_sub2).position += -12
										+ i_6_;
							}
						}
					}
					if (bool_5_) {
						((Stream) class11_sub20_sub2).position = i_10_;
						if (((Class163_Sub3) aClass163_Sub3_6791).aBool8348) {
							for (int i_59_ = 0; anInt6820 > i_59_; i_59_++) {
								class11_sub20_sub2.method3744(
										(aFloatArray6760[i_59_]), -32197);
								class11_sub20_sub2.method3744(
										(aFloatArray6769[i_59_]), -32197);
								((Stream) class11_sub20_sub2).position += -8
										+ i_6_;
							}
						} else {
							for (int i_60_ = 0; ((i_60_ ^ 0xffffffff) > (anInt6820 ^ 0xffffffff)); i_60_++) {
								class11_sub20_sub2.method3743(i + -1526311491,
										(aFloatArray6760[i_60_]));
								class11_sub20_sub2.method3743(-1526311408,
										(aFloatArray6769[i_60_]));
								((Stream) class11_sub20_sub2).position += -8
										+ i_6_;
							}
						}
					}
					((Stream) class11_sub20_sub2).position = i_6_ * anInt6820;
					Interface9 interface9;
					if (bool) {
						if (anInterface9_6811 == null)
							anInterface9_6811 = (aClass163_Sub3_6791
									.method3272(
											(((Stream) class11_sub20_sub2).buffer),
											((Stream) class11_sub20_sub2).position,
											i_6_, true, (byte) 46));
						else
							anInterface9_6811.method31(
									((Stream) class11_sub20_sub2).position,
									506, i_6_,
									((Stream) class11_sub20_sub2).buffer);
						aByte6733 = (byte) 0;
						interface9 = anInterface9_6811;
					} else {
						interface9 = (aClass163_Sub3_6791.method3272(
								((Stream) class11_sub20_sub2).buffer,
								((Stream) class11_sub20_sub2).position, i_6_,
								false, (byte) 46));
						aBool6804 = true;
					}
					if (bool_4_) {
						((Class350) aClass350_6810).anInterface9_4613 = interface9;
						((Class350) aClass350_6810).aByte4609 = i_7_;
					}
					if (bool_5_) {
						((Class350) aClass350_6725).anInterface9_4613 = interface9;
						((Class350) aClass350_6725).aByte4609 = i_10_;
					}
					if (bool_2_) {
						((Class350) aClass350_6814).anInterface9_4613 = interface9;
						((Class350) aClass350_6814).aByte4609 = i_8_;
					}
					if (!bool_3_)
						break;
					((Class350) aClass350_6724).aByte4609 = i_9_;
					((Class350) aClass350_6724).anInterface9_4613 = interface9;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "li.CA(" + bool
						+ ',' + i + ')');
			}
			break;
		} while (false);
	}

	final void VA(int i) {
		do {
			try {
				anInt6730++;
				int i_61_ = Class335.anIntArray4436[i];
				int i_62_ = Class335.anIntArray4430[i];
				for (int i_63_ = 0; (i_63_ ^ 0xffffffff) > (anInt6802 ^ 0xffffffff); i_63_++) {
					int i_64_ = ((anIntArray6775[i_63_] * i_62_ + anIntArray6744[i_63_]
							* i_61_) >> 14);
					anIntArray6744[i_63_] = (anIntArray6744[i_63_] * i_62_ - i_61_
							* anIntArray6775[i_63_]) >> 14;
					anIntArray6775[i_63_] = i_64_;
				}
				aBool6741 = false;
				if (aClass350_6810 == null)
					break;
				((Class350) aClass350_6810).anInterface9_4613 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "li.VA(" + i + ')');
			}
			break;
		} while (false);
	}

	final void p(int i, int i_65_, Class12 class12, Class12 class12_66_,
			int i_67_, int i_68_, int i_69_) {
		do {
			try {
				if (!aBool6741)
					method2775((byte) -127);
				anInt6731++;
				int i_70_ = i_67_ + aShort6739;
				int i_71_ = i_67_ + aShort6817;
				int i_72_ = aShort6822 + i_69_;
				int i_73_ = i_69_ - -aShort6824;
				if ((i != 1 && i != 2 && (i ^ 0xffffffff) != -4 && (i ^ 0xffffffff) != -6)
						|| ((i_70_ ^ 0xffffffff) <= -1
								&& ((((Class12) class12).anInt103 ^ 0xffffffff) < ((((Class12) class12).anInt93
										+ i_71_ >> ((Class12) class12).anInt97) ^ 0xffffffff))
								&& (i_72_ ^ 0xffffffff) <= -1 && (((Class12) class12).anInt98 > (((Class12) class12).anInt93
								+ i_73_ >> ((Class12) class12).anInt97)))) {
					if ((i ^ 0xffffffff) != -5 && i != 5) {
						i_70_ >>= ((Class12) class12).anInt97;
						i_71_ = (-1 + ((Class12) class12).anInt93 + i_71_ >> ((Class12) class12).anInt97);
						i_72_ >>= ((Class12) class12).anInt97;
						i_73_ = (((Class12) class12).anInt93 - 1 + i_73_ >> ((Class12) class12).anInt97);
						if (class12.method131((byte) 27, i_72_, i_70_) == i_68_
								&& (class12
										.method131((byte) -107, i_72_, i_71_) ^ 0xffffffff) == (i_68_ ^ 0xffffffff)
								&& ((i_68_ ^ 0xffffffff) == (class12.method131(
										(byte) -60, i_73_, i_70_) ^ 0xffffffff))
								&& (class12.method131((byte) 6, i_73_, i_71_) ^ 0xffffffff) == (i_68_ ^ 0xffffffff))
							break;
					} else if (class12_66_ == null
							|| ((i_70_ ^ 0xffffffff) > -1
									|| ((((Class12) class12_66_).anInt103 ^ 0xffffffff) >= (((((Class12) class12_66_).anInt93 + i_71_) >> ((Class12) class12_66_).anInt97) ^ 0xffffffff))
									|| i_72_ < 0 || ((((Class12) class12_66_).anInt98 ^ 0xffffffff) >= (((i_73_ + ((Class12) class12_66_).anInt93) >> ((Class12) class12_66_).anInt97) ^ 0xffffffff))))
						break;
					if ((i ^ 0xffffffff) != -2) {
						if ((i ^ 0xffffffff) == -3) {
							int i_74_ = aShort6762;
							if (i_74_ == 0)
								break;
							for (int i_75_ = 0; ((i_75_ ^ 0xffffffff) > (anInt6802 ^ 0xffffffff)); i_75_++) {
								int i_76_ = (anIntArray6744[i_75_] << 16)
										/ i_74_;
								if ((i_65_ ^ 0xffffffff) < (i_76_ ^ 0xffffffff))
									anIntArray6744[i_75_] = (anIntArray6744[i_75_] + ((i_65_ + -i_76_)
											* ((class12
													.method130(
															(anIntArray6757[i_75_] - -i_69_),
															(anIntArray6775[i_75_] + i_67_),
															47)) - i_68_) / i_65_));
							}
						} else if ((i ^ 0xffffffff) == -4) {
							int i_77_ = 4 * (0xff & i_65_);
							int i_78_ = 4 * (0xff & i_65_ >> 8);
							int i_79_ = 0x3fc0 & i_65_ >> 16 << 6;
							int i_80_ = 0x3fc0 & i_65_ >> 24 << 6;
							if ((i_67_ - (i_77_ >> 1) ^ 0xffffffff) > -1
									|| (((i_77_ >> 1) + i_67_ - -((Class12) class12).anInt93) >= (((Class12) class12).anInt103 << ((Class12) class12).anInt97))
									|| (-(i_78_ >> 1) + i_69_ ^ 0xffffffff) > -1
									|| (((i_69_ - -(i_78_ >> 1) + ((Class12) class12).anInt93) ^ 0xffffffff) <= ((((Class12) class12).anInt98 << ((Class12) class12).anInt97) ^ 0xffffffff)))
								break;
							this.method1322(i_79_, class12, i_67_, i_78_,
									i_80_, -3, i_69_, i_77_, i_68_);
						} else if ((i ^ 0xffffffff) == -5) {
							int i_81_ = aShort6782 - aShort6762;
							for (int i_82_ = 0; ((i_82_ ^ 0xffffffff) > (anInt6802 ^ 0xffffffff)); i_82_++)
								anIntArray6744[i_82_] = (i_81_ + (anIntArray6744[i_82_]
										+ (class12_66_.method130(
												anIntArray6757[i_82_] - -i_69_,
												anIntArray6775[i_82_] + i_67_,
												-127)) - i_68_));
						} else if (i == 5) {
							int i_83_ = -aShort6762 + aShort6782;
							for (int i_84_ = 0; ((i_84_ ^ 0xffffffff) > (anInt6802 ^ 0xffffffff)); i_84_++) {
								int i_85_ = i_67_ + anIntArray6775[i_84_];
								int i_86_ = anIntArray6757[i_84_] - -i_69_;
								int i_87_ = class12.method130(i_86_, i_85_,
										-128);
								int i_88_ = class12_66_.method130(i_86_, i_85_,
										-128);
								int i_89_ = i_87_ + (-i_88_ - i_65_);
								anIntArray6744[i_84_] = (-i_68_ + i_87_ + (i_89_
										* ((anIntArray6744[i_84_] << 8) / i_83_) >> 8));
							}
						}
					} else {
						for (int i_90_ = 0; (i_90_ ^ 0xffffffff) > (anInt6802 ^ 0xffffffff); i_90_++)
							anIntArray6744[i_90_] = (-i_68_
									+ anIntArray6744[i_90_] + class12
									.method130(i_69_ + (anIntArray6757[i_90_]),
											i_67_ + (anIntArray6775[i_90_]),
											-12));
					}
					aBool6741 = false;
					if (aClass350_6810 == null)
						break;
					((Class350) aClass350_6810).anInterface9_4613 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("li.p(" + i + ','
						+ i_65_ + ',' + (class12 != null ? "{...}" : "null")
						+ ',' + (class12_66_ != null ? "{...}" : "null") + ','
						+ i_67_ + ',' + i_68_ + ',' + i_69_ + ')'));
			}
			break;
		} while (false);
	}

	final void aa(short i, short i_91_) {
		do {
			try {
				anInt6771++;
				Interface1 interface1 = ((Class163) aClass163_Sub3_6791).anInterface1_2118;
				for (int i_92_ = 0; i_92_ < anInt6792; i_92_++) {
					if (i == aShortArray6812[i_92_])
						aShortArray6812[i_92_] = i_91_;
				}
				byte i_93_ = 0;
				byte i_94_ = 0;
				if ((i ^ 0xffffffff) != 0) {
					Class188 class188 = interface1.method7((byte) 127,
							0xffff & i);
					i_93_ = ((Class188) class188).aByte2414;
					i_94_ = ((Class188) class188).aByte2418;
				}
				byte i_95_ = 0;
				byte i_96_ = 0;
				if ((i_91_ ^ 0xffffffff) != 0) {
					Class188 class188 = interface1.method7((byte) 127,
							0xffff & i_91_);
					if (((Class188) class188).aByte2429 != 0
							|| ((Class188) class188).aByte2415 != 0)
						aBool6816 = true;
					i_96_ = ((Class188) class188).aByte2418;
					i_95_ = ((Class188) class188).aByte2414;
				}
				if (!(i_93_ != i_95_ | (i_96_ ^ 0xffffffff) != (i_94_ ^ 0xffffffff)))
					break;
				if (aClass199Array6838 != null) {
					for (int i_97_ = 0; i_97_ < anInt6742; i_97_++) {
						Class199 class199 = aClass199Array6838[i_97_];
						Class330 class330 = aClass330Array6841[i_97_];
						((Class330) class330).anInt4382 = ((0xffffff & (Class27.anIntArray359[aShortArray6753[(((Class199) class199).anInt2695)] & 0xffff])) | ~0xffffff
								& ((Class330) class330).anInt4382);
					}
				}
				if (aClass350_6814 == null)
					break;
				((Class350) aClass350_6814).anInterface9_4613 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "li.aa(" + i + ','
						+ i_91_ + ')');
			}
			break;
		} while (false);
	}

	final void method1326() {
		try {
			anInt6779++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.JA(" + ')');
		}
	}

	final void LA(int i) {
		do {
			try {
				anInt6840++;
				if (aClass350_6814 != null)
					((Class350) aClass350_6814).anInterface9_4613 = null;
				aShort6805 = (short) i;
				if (aClass350_6724 == null)
					break;
				((Class350) aClass350_6724).anInterface9_4613 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "li.LA(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1323(int i, int i_98_, int i_99_, int i_100_) {
		do {
			try {
				anInt6832++;
				for (int i_101_ = 0; anInt6792 > i_101_; i_101_++) {
					int i_102_ = aShortArray6753[i_101_] & 0xffff;
					int i_103_ = (i_102_ & 0xfe68) >> 10;
					int i_104_ = (0x3cf & i_102_) >> 7;
					if ((i_98_ ^ 0xffffffff) != 0)
						i_104_ -= -((-i_104_ + i_98_) * i_100_ >> 7);
					if ((i ^ 0xffffffff) != 0)
						i_103_ = (i_100_ * (i + -i_103_) >> 7) + i_103_;
					int i_105_ = i_102_ & 0x7f;
					if ((i_99_ ^ 0xffffffff) != 0)
						i_105_ = (i_100_ * (-i_105_ + i_99_) >> 7) + i_105_;
					aShortArray6753[i_101_] = (short) (Class173.method1134(
							Class173.method1134(i_103_ << 10, i_104_ << 7),
							i_105_));
				}
				if (aClass199Array6838 != null) {
					for (int i_106_ = 0; (anInt6742 ^ 0xffffffff) < (i_106_ ^ 0xffffffff); i_106_++) {
						Class199 class199 = aClass199Array6838[i_106_];
						Class330 class330 = aClass330Array6841[i_106_];
						((Class330) class330).anInt4382 = ((Class27.anIntArray359[(0xffff & aShortArray6753[(((Class199) class199).anInt2695)])]) & 0xffffff | ~0xffffff
								& ((Class330) class330).anInt4382);
					}
				}
				if (aClass350_6814 == null)
					break;
				((Class350) aClass350_6814).anInterface9_4613 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("li.T(" + i + ','
						+ i_98_ + ',' + i_99_ + ',' + i_100_ + ')'));
			}
			break;
		} while (false);
	}

	private static final boolean method2772(int i, int i_107_, byte i_108_) {
		try {
			if (i_108_ != -53)
				anInt6833 = 17;
			anInt6778++;
			if ((0xc580 & i) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("li.BA(" + i + ','
					+ i_107_ + ',' + i_108_ + ')'));
		}
	}

	final Class261[] method1325() {
		try {
			anInt6766++;
			return aClass261Array6795;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.QA(" + ')');
		}
	}

	private final Class206 method2773(Class206_Sub3 class206_sub3_109_, byte i,
			boolean bool, boolean bool_110_, int i_111_,
			Class206_Sub3 class206_sub3_112_) {
		try {
			class206_sub3_112_.anInt6759 = anInt6759;
			class206_sub3_112_.aByte6733 = (byte) 0;
			class206_sub3_112_.aBool6816 = aBool6816;
			class206_sub3_112_.anInt6825 = anInt6825;
			class206_sub3_112_.anInt6792 = anInt6792;
			class206_sub3_112_.anInt6802 = anInt6802;
			anInt6738++;
			class206_sub3_112_.anInt6742 = anInt6742;
			if ((0x100 & i_111_ ^ 0xffffffff) == -1)
				class206_sub3_112_.aBool6818 = aBool6818;
			else
				class206_sub3_112_.aBool6818 = true;
			class206_sub3_112_.anInt6768 = i_111_;
			class206_sub3_112_.anInt6820 = anInt6820;
			class206_sub3_112_.aShort6751 = aShort6751;
			class206_sub3_112_.aShort6805 = aShort6805;
			class206_sub3_112_.anInt6740 = anInt6740;
			boolean bool_113_ = Class58_Sub1.method2954(33, i_111_, anInt6740);
			boolean bool_114_ = Class38
					.method335(i_111_, anInt6740, (byte) -77);
			boolean bool_115_ = Class256_Sub2.method3112(anInt6740, -129767092,
					i_111_);
			boolean bool_116_ = bool_115_ | (bool_113_ | bool_114_);
			if (bool_116_) {
				if (bool_113_) {
					if (class206_sub3_109_.anIntArray6775 != null
							&& (class206_sub3_109_.anIntArray6775.length >= anInt6825))
						class206_sub3_112_.anIntArray6775 = class206_sub3_109_.anIntArray6775;
					else
						class206_sub3_112_.anIntArray6775 = class206_sub3_109_.anIntArray6775 = new int[anInt6825];
				} else
					class206_sub3_112_.anIntArray6775 = anIntArray6775;
				if (bool_114_) {
					if (class206_sub3_109_.anIntArray6744 == null
							|| (class206_sub3_109_.anIntArray6744.length < anInt6825))
						class206_sub3_112_.anIntArray6744 = class206_sub3_109_.anIntArray6744 = new int[anInt6825];
					else
						class206_sub3_112_.anIntArray6744 = class206_sub3_109_.anIntArray6744;
				} else
					class206_sub3_112_.anIntArray6744 = anIntArray6744;
				if (bool_115_) {
					if (class206_sub3_109_.anIntArray6757 != null
							&& (anInt6825 <= class206_sub3_109_.anIntArray6757.length))
						class206_sub3_112_.anIntArray6757 = class206_sub3_109_.anIntArray6757;
					else
						class206_sub3_112_.anIntArray6757 = class206_sub3_109_.anIntArray6757 = new int[anInt6825];
				} else
					class206_sub3_112_.anIntArray6757 = anIntArray6757;
				for (int i_117_ = 0; (i_117_ ^ 0xffffffff) > (anInt6825 ^ 0xffffffff); i_117_++) {
					if (bool_113_)
						class206_sub3_112_.anIntArray6775[i_117_] = anIntArray6775[i_117_];
					if (bool_114_)
						class206_sub3_112_.anIntArray6744[i_117_] = anIntArray6744[i_117_];
					if (bool_115_)
						class206_sub3_112_.anIntArray6757[i_117_] = anIntArray6757[i_117_];
				}
			} else {
				class206_sub3_112_.anIntArray6744 = anIntArray6744;
				class206_sub3_112_.anIntArray6775 = anIntArray6775;
				class206_sub3_112_.anIntArray6757 = anIntArray6757;
			}
			int i_118_ = -73 % ((i + 51) / 55);
			if (Class251_Sub1.method2378((byte) 127, anInt6740, i_111_)) {
				class206_sub3_112_.aClass350_6810 = class206_sub3_109_.aClass350_6810;
				if (bool_110_)
					class206_sub3_112_.aByte6733 |= 0x1;
				((Class350) class206_sub3_112_.aClass350_6810).aByte4609 = ((Class350) aClass350_6810).aByte4609;
				((Class350) class206_sub3_112_.aClass350_6810).anInterface9_4613 = ((Class350) aClass350_6810).anInterface9_4613;
			} else if (Class57_Sub1.method2488(true, anInt6740, i_111_))
				class206_sub3_112_.aClass350_6810 = aClass350_6810;
			else
				class206_sub3_112_.aClass350_6810 = null;
			if (Class155.method972(9, i_111_, anInt6740)) {
				if (class206_sub3_109_.aShortArray6753 == null
						|| anInt6792 > class206_sub3_109_.aShortArray6753.length)
					class206_sub3_112_.aShortArray6753 = class206_sub3_109_.aShortArray6753 = new short[anInt6792];
				else
					class206_sub3_112_.aShortArray6753 = class206_sub3_109_.aShortArray6753;
				for (int i_119_ = 0; anInt6792 > i_119_; i_119_++)
					class206_sub3_112_.aShortArray6753[i_119_] = aShortArray6753[i_119_];
			} else
				class206_sub3_112_.aShortArray6753 = aShortArray6753;
			if (!Class173.method1135(i_111_, 125, anInt6740))
				class206_sub3_112_.aByteArray6735 = aByteArray6735;
			else {
				if (class206_sub3_109_.aByteArray6735 != null
						&& anInt6792 <= class206_sub3_109_.aByteArray6735.length)
					class206_sub3_112_.aByteArray6735 = class206_sub3_109_.aByteArray6735;
				else
					class206_sub3_112_.aByteArray6735 = class206_sub3_109_.aByteArray6735 = new byte[anInt6792];
				for (int i_120_ = 0; (i_120_ ^ 0xffffffff) > (anInt6792 ^ 0xffffffff); i_120_++)
					class206_sub3_112_.aByteArray6735[i_120_] = aByteArray6735[i_120_];
			}
			if (Class376_Sub7_Sub4_Sub2.method3911(4285, i_111_, anInt6740)) {
				if (bool_110_)
					class206_sub3_112_.aByte6733 |= 0x2;
				class206_sub3_112_.aClass350_6814 = class206_sub3_109_.aClass350_6814;
				((Class350) class206_sub3_112_.aClass350_6814).aByte4609 = ((Class350) aClass350_6814).aByte4609;
				((Class350) class206_sub3_112_.aClass350_6814).anInterface9_4613 = ((Class350) aClass350_6814).anInterface9_4613;
			} else if (Class11_Sub45_Sub20_Sub1.method3893(-124, i_111_,
					anInt6740))
				class206_sub3_112_.aClass350_6814 = aClass350_6814;
			else
				class206_sub3_112_.aClass350_6814 = null;
			if (!Class351.method2104(100, anInt6740, i_111_)) {
				class206_sub3_112_.aShortArray6826 = aShortArray6826;
				class206_sub3_112_.aClass271_6721 = aClass271_6721;
				class206_sub3_112_.aByteArray6830 = aByteArray6830;
				class206_sub3_112_.aShortArray6787 = aShortArray6787;
				class206_sub3_112_.aShortArray6727 = aShortArray6727;
			} else {
				if (class206_sub3_109_.aShortArray6787 == null
						|| ((anInt6820 ^ 0xffffffff) < (class206_sub3_109_.aShortArray6787.length ^ 0xffffffff))) {
					int i_121_ = anInt6820;
					class206_sub3_112_.aShortArray6787 = class206_sub3_109_.aShortArray6787 = new short[i_121_];
					class206_sub3_112_.aShortArray6826 = class206_sub3_109_.aShortArray6826 = new short[i_121_];
					class206_sub3_112_.aShortArray6727 = class206_sub3_109_.aShortArray6727 = new short[i_121_];
				} else {
					class206_sub3_112_.aShortArray6787 = class206_sub3_109_.aShortArray6787;
					class206_sub3_112_.aShortArray6826 = class206_sub3_109_.aShortArray6826;
					class206_sub3_112_.aShortArray6727 = class206_sub3_109_.aShortArray6727;
				}
				if (aClass271_6721 != null) {
					if (class206_sub3_109_.aClass271_6721 == null)
						class206_sub3_109_.aClass271_6721 = new Class271();
					Class271 class271 = (class206_sub3_112_.aClass271_6721 = class206_sub3_109_.aClass271_6721);
					if (((Class271) class271).aShortArray3653 == null
							|| ((anInt6820 ^ 0xffffffff) < (((Class271) class271).aShortArray3653.length ^ 0xffffffff))) {
						int i_122_ = anInt6820;
						((Class271) class271).aShortArray3656 = new short[i_122_];
						((Class271) class271).aShortArray3654 = new short[i_122_];
						((Class271) class271).aByteArray3657 = new byte[i_122_];
						((Class271) class271).aShortArray3653 = new short[i_122_];
					}
					for (int i_123_ = 0; (i_123_ ^ 0xffffffff) > (anInt6820 ^ 0xffffffff); i_123_++) {
						class206_sub3_112_.aShortArray6787[i_123_] = aShortArray6787[i_123_];
						class206_sub3_112_.aShortArray6727[i_123_] = aShortArray6727[i_123_];
						class206_sub3_112_.aShortArray6826[i_123_] = aShortArray6826[i_123_];
						((Class271) class271).aShortArray3653[i_123_] = (((Class271) aClass271_6721).aShortArray3653[i_123_]);
						((Class271) class271).aShortArray3654[i_123_] = (((Class271) aClass271_6721).aShortArray3654[i_123_]);
						((Class271) class271).aShortArray3656[i_123_] = (((Class271) aClass271_6721).aShortArray3656[i_123_]);
						((Class271) class271).aByteArray3657[i_123_] = (((Class271) aClass271_6721).aByteArray3657[i_123_]);
					}
				} else {
					for (int i_124_ = 0; (anInt6820 ^ 0xffffffff) < (i_124_ ^ 0xffffffff); i_124_++) {
						class206_sub3_112_.aShortArray6787[i_124_] = aShortArray6787[i_124_];
						class206_sub3_112_.aShortArray6727[i_124_] = aShortArray6727[i_124_];
						class206_sub3_112_.aShortArray6826[i_124_] = aShortArray6826[i_124_];
					}
				}
				class206_sub3_112_.aByteArray6830 = aByteArray6830;
			}
			if (Class322.method1967(anInt6740, (byte) -44, i_111_)) {
				class206_sub3_112_.aClass350_6724 = class206_sub3_109_.aClass350_6724;
				if (bool_110_)
					class206_sub3_112_.aByte6733 |= 0x4;
				((Class350) class206_sub3_112_.aClass350_6724).anInterface9_4613 = ((Class350) aClass350_6724).anInterface9_4613;
				((Class350) class206_sub3_112_.aClass350_6724).aByte4609 = ((Class350) aClass350_6724).aByte4609;
			} else if (!Class37.method315(i_111_, anInt6740, 0))
				class206_sub3_112_.aClass350_6724 = null;
			else
				class206_sub3_112_.aClass350_6724 = aClass350_6724;
			if (Class180.method1178(8, i_111_, anInt6740)) {
				if (class206_sub3_109_.aFloatArray6760 != null
						&& ((anInt6792 ^ 0xffffffff) >= (class206_sub3_109_.aFloatArray6760.length ^ 0xffffffff))) {
					class206_sub3_112_.aFloatArray6760 = class206_sub3_109_.aFloatArray6760;
					class206_sub3_112_.aFloatArray6769 = class206_sub3_109_.aFloatArray6769;
				} else {
					int i_125_ = anInt6820;
					class206_sub3_112_.aFloatArray6769 = class206_sub3_109_.aFloatArray6769 = new float[i_125_];
					class206_sub3_112_.aFloatArray6760 = class206_sub3_109_.aFloatArray6760 = new float[i_125_];
				}
				for (int i_126_ = 0; anInt6820 > i_126_; i_126_++) {
					class206_sub3_112_.aFloatArray6760[i_126_] = aFloatArray6760[i_126_];
					class206_sub3_112_.aFloatArray6769[i_126_] = aFloatArray6769[i_126_];
				}
			} else {
				class206_sub3_112_.aFloatArray6769 = aFloatArray6769;
				class206_sub3_112_.aFloatArray6760 = aFloatArray6760;
			}
			if (Class108_Sub19.method2891(anInt6740, i_111_, -81)) {
				if (bool_110_)
					class206_sub3_112_.aByte6733 |= 0x8;
				class206_sub3_112_.aClass350_6725 = class206_sub3_109_.aClass350_6725;
				((Class350) class206_sub3_112_.aClass350_6725).anInterface9_4613 = ((Class350) aClass350_6725).anInterface9_4613;
				((Class350) class206_sub3_112_.aClass350_6725).aByte4609 = ((Class350) aClass350_6725).aByte4609;
			} else if (!Class363.method2152(anInt6740, false, i_111_))
				class206_sub3_112_.aClass350_6725 = null;
			else
				class206_sub3_112_.aClass350_6725 = aClass350_6725;
			if (!Class93.method628(anInt6740, i_111_, 30743)) {
				class206_sub3_112_.aShortArray6800 = aShortArray6800;
				class206_sub3_112_.aShortArray6732 = aShortArray6732;
				class206_sub3_112_.aShortArray6829 = aShortArray6829;
			} else {
				if (class206_sub3_109_.aShortArray6829 == null
						|| class206_sub3_109_.aShortArray6829.length < anInt6792) {
					int i_127_ = anInt6792;
					class206_sub3_112_.aShortArray6829 = class206_sub3_109_.aShortArray6829 = new short[i_127_];
					class206_sub3_112_.aShortArray6800 = class206_sub3_109_.aShortArray6800 = new short[i_127_];
					class206_sub3_112_.aShortArray6732 = class206_sub3_109_.aShortArray6732 = new short[i_127_];
				} else {
					class206_sub3_112_.aShortArray6732 = class206_sub3_109_.aShortArray6732;
					class206_sub3_112_.aShortArray6829 = class206_sub3_109_.aShortArray6829;
					class206_sub3_112_.aShortArray6800 = class206_sub3_109_.aShortArray6800;
				}
				for (int i_128_ = 0; (anInt6792 ^ 0xffffffff) < (i_128_ ^ 0xffffffff); i_128_++) {
					class206_sub3_112_.aShortArray6829[i_128_] = aShortArray6829[i_128_];
					class206_sub3_112_.aShortArray6800[i_128_] = aShortArray6800[i_128_];
					class206_sub3_112_.aShortArray6732[i_128_] = aShortArray6732[i_128_];
				}
			}
			if (Class197.method1279(5, anInt6740, i_111_)) {
				class206_sub3_112_.aClass381_6808 = class206_sub3_109_.aClass381_6808;
				if (bool_110_)
					class206_sub3_112_.aByte6733 |= 0x10;
				((Class381) class206_sub3_112_.aClass381_6808).anInterface19_4961 = ((Class381) aClass381_6808).anInterface19_4961;
			} else if (!Class313.method1906(i_111_, (byte) 123, anInt6740))
				class206_sub3_112_.aClass381_6808 = null;
			else
				class206_sub3_112_.aClass381_6808 = aClass381_6808;
			if (!Class321_Sub2.method2741(anInt6740, (byte) -107, i_111_))
				class206_sub3_112_.aShortArray6812 = aShortArray6812;
			else {
				if (class206_sub3_109_.aShortArray6812 == null
						|| (class206_sub3_109_.aShortArray6812.length ^ 0xffffffff) > (anInt6792 ^ 0xffffffff)) {
					int i_129_ = anInt6792;
					class206_sub3_112_.aShortArray6812 = class206_sub3_109_.aShortArray6812 = new short[i_129_];
				} else
					class206_sub3_112_.aShortArray6812 = class206_sub3_109_.aShortArray6812;
				for (int i_130_ = 0; anInt6792 > i_130_; i_130_++)
					class206_sub3_112_.aShortArray6812[i_130_] = aShortArray6812[i_130_];
			}
			if (!method2772(i_111_, anInt6740, (byte) -53))
				class206_sub3_112_.aClass330Array6841 = aClass330Array6841;
			else if (class206_sub3_109_.aClass330Array6841 != null
					&& (class206_sub3_109_.aClass330Array6841.length ^ 0xffffffff) <= (anInt6742 ^ 0xffffffff)) {
				class206_sub3_112_.aClass330Array6841 = class206_sub3_109_.aClass330Array6841;
				for (int i_131_ = 0; (i_131_ ^ 0xffffffff) > (anInt6742 ^ 0xffffffff); i_131_++)
					class206_sub3_112_.aClass330Array6841[i_131_].method1998(
							(byte) -126, aClass330Array6841[i_131_]);
			} else {
				int i_132_ = anInt6742;
				class206_sub3_112_.aClass330Array6841 = class206_sub3_109_.aClass330Array6841 = new Class330[i_132_];
				for (int i_133_ = 0; anInt6742 > i_133_; i_133_++)
					class206_sub3_112_.aClass330Array6841[i_133_] = aClass330Array6841[i_133_]
							.method1999((byte) 75);
			}
			class206_sub3_112_.aShortArray6764 = aShortArray6764;
			class206_sub3_112_.anIntArrayArray6745 = anIntArrayArray6745;
			class206_sub3_112_.aClass261Array6795 = aClass261Array6795;
			if (!aBool6741)
				class206_sub3_112_.aBool6741 = false;
			else {
				class206_sub3_112_.aShort6817 = aShort6817;
				class206_sub3_112_.aShort6762 = aShort6762;
				class206_sub3_112_.aShort6782 = aShort6782;
				class206_sub3_112_.aShort6822 = aShort6822;
				class206_sub3_112_.aShort6824 = aShort6824;
				class206_sub3_112_.aShort6739 = aShort6739;
				class206_sub3_112_.aBool6741 = true;
				class206_sub3_112_.aShort6813 = aShort6813;
				class206_sub3_112_.aShort6780 = aShort6780;
			}
			class206_sub3_112_.aClass199Array6838 = aClass199Array6838;
			class206_sub3_112_.aClass110Array6798 = aClass110Array6798;
			class206_sub3_112_.anIntArray6752 = anIntArray6752;
			class206_sub3_112_.anIntArray6763 = anIntArray6763;
			class206_sub3_112_.anIntArrayArray6807 = anIntArrayArray6807;
			class206_sub3_112_.aShortArray6756 = aShortArray6756;
			class206_sub3_112_.aShortArray6758 = aShortArray6758;
			class206_sub3_112_.anIntArrayArray6776 = anIntArrayArray6776;
			return class206_sub3_112_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("li.J("
					+ (class206_sub3_109_ != null ? "{...}" : "null") + ',' + i
					+ ',' + bool + ',' + bool_110_ + ',' + i_111_ + ','
					+ (class206_sub3_112_ != null ? "{...}" : "null") + ')'));
		}
	}

	final int na() {
		try {
			anInt6788++;
			if (!aBool6741)
				method2775((byte) -128);
			return aShort6813;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.na(" + ')');
		}
	}

	final boolean NA() {
		try {
			anInt6785++;
			if (anIntArrayArray6807 == null)
				return false;
			for (int i = 0; (anInt6825 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				anIntArray6775[i] <<= 4;
				anIntArray6744[i] <<= 4;
				anIntArray6757[i] <<= 4;
			}
			Class318.anInt4225 = 0;
			Class78.anInt1052 = 0;
			Class322.anInt4311 = 0;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.NA(" + ')');
		}
	}

	public static void method2774(int i) {
		try {
			if (i != 0)
				method2774(-83);
			ACTION_BUTTON9 = null;
			aClass160_6836 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.N(" + i + ')');
		}
	}

	final boolean F() {
		try {
			anInt6736++;
			return aBool6818;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.F(" + ')');
		}
	}

	final void ia(short i, short i_134_) {
		do {
			try {
				anInt6835++;
				for (int i_135_ = 0; (anInt6792 ^ 0xffffffff) < (i_135_ ^ 0xffffffff); i_135_++) {
					if ((aShortArray6753[i_135_] ^ 0xffffffff) == (i ^ 0xffffffff))
						aShortArray6753[i_135_] = i_134_;
				}
				if (aClass199Array6838 != null) {
					for (int i_136_ = 0; (i_136_ ^ 0xffffffff) > (anInt6742 ^ 0xffffffff); i_136_++) {
						Class199 class199 = aClass199Array6838[i_136_];
						Class330 class330 = aClass330Array6841[i_136_];
						((Class330) class330).anInt4382 = ((Class27.anIntArray359[(0xffff & aShortArray6753[(((Class199) class199).anInt2695)])]) & 0xffffff | ~0xffffff
								& ((Class330) class330).anInt4382);
					}
				}
				if (aClass350_6814 == null)
					break;
				((Class350) aClass350_6814).anInterface9_4613 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "li.ia(" + i + ','
						+ i_134_ + ')');
			}
			break;
		} while (false);
	}

	final int ua() {
		try {
			anInt6801++;
			return anInt6768;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.ua(" + ')');
		}
	}

	final int HA() {
		try {
			if (!aBool6741)
				method2775((byte) -126);
			anInt6827++;
			return aShort6822;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.HA(" + ')');
		}
	}

	final void wa() {
		try {
			anInt6772++;
			for (int i = 0; (anInt6825 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				anIntArray6775[i] = 7 + anIntArray6775[i] >> 4;
				anIntArray6744[i] = 7 + anIntArray6744[i] >> 4;
				anIntArray6757[i] = 7 + anIntArray6757[i] >> 4;
			}
			if (aClass350_6810 != null)
				((Class350) aClass350_6810).anInterface9_4613 = null;
			aBool6741 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.wa(" + ')');
		}
	}

	private final void method2775(byte i) {
		try {
			anInt6828++;
			int i_137_ = 32767;
			int i_138_ = 32767;
			int i_139_ = 32767;
			if (i > -125)
				aBool6816 = true;
			int i_140_ = -32768;
			int i_141_ = -32768;
			int i_142_ = -32768;
			int i_143_ = 0;
			int i_144_ = 0;
			for (int i_145_ = 0; anInt6802 > i_145_; i_145_++) {
				int i_146_ = anIntArray6775[i_145_];
				int i_147_ = anIntArray6744[i_145_];
				if ((i_141_ ^ 0xffffffff) > (i_147_ ^ 0xffffffff))
					i_141_ = i_147_;
				int i_148_ = anIntArray6757[i_145_];
				if ((i_137_ ^ 0xffffffff) < (i_146_ ^ 0xffffffff))
					i_137_ = i_146_;
				if ((i_140_ ^ 0xffffffff) > (i_146_ ^ 0xffffffff))
					i_140_ = i_146_;
				if (i_147_ < i_138_)
					i_138_ = i_147_;
				if (i_142_ < i_148_)
					i_142_ = i_148_;
				if (i_148_ < i_139_)
					i_139_ = i_148_;
				int i_149_ = i_148_ * i_148_ + i_146_ * i_146_;
				if (i_143_ < i_149_)
					i_143_ = i_149_;
				i_149_ = i_147_ * i_147_ + (i_148_ * i_148_ + i_146_ * i_146_);
				if ((i_149_ ^ 0xffffffff) < (i_144_ ^ 0xffffffff))
					i_144_ = i_149_;
			}
			aShort6822 = (short) i_139_;
			aShort6762 = (short) i_138_;
			aShort6817 = (short) i_140_;
			aShort6782 = (short) i_141_;
			aShort6824 = (short) i_142_;
			aShort6739 = (short) i_137_;
			aShort6813 = (short) (int) (0.99 + Math.sqrt((double) i_143_));
			aShort6780 = (short) (int) (0.99 + Math.sqrt((double) i_144_));
			aBool6741 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.AA(" + i + ')');
		}
	}

	final void method1321(Class33 class33, Class376_Sub4 class376_sub4, int i) {
		try {
			anInt6784++;
			if (anInt6820 != 0) {
				Class33_Sub1 class33_sub1 = ((Class163_Sub3) aClass163_Sub3_6791).aClass33_Sub1_8299;
				Class33_Sub1 class33_sub1_150_ = (Class33_Sub1) class33;
				if (!aBool6741)
					method2775((byte) -128);
				Class164.aFloat2132 = (((Class33_Sub1) class33_sub1).aFloat6168 + ((((Class33_Sub1) class33_sub1).aFloat6174 * ((Class33_Sub1) class33_sub1_150_).aFloat6168) + ((((Class33_Sub1) class33_sub1).aFloat6197 * ((Class33_Sub1) class33_sub1_150_).aFloat6201) + (((Class33_Sub1) class33_sub1_150_).aFloat6191 * ((Class33_Sub1) class33_sub1).aFloat6192))));
				Class286.aFloat3879 = ((((Class33_Sub1) class33_sub1).aFloat6174 * ((Class33_Sub1) class33_sub1_150_).aFloat6192) + ((((Class33_Sub1) class33_sub1_150_).aFloat6185 * ((Class33_Sub1) class33_sub1).aFloat6192) + (((Class33_Sub1) class33_sub1_150_).aFloat6200 * ((Class33_Sub1) class33_sub1).aFloat6197)));
				float f = (Class286.aFloat3879 * (float) aShort6762 + Class164.aFloat2132);
				float f_151_ = (Class164.aFloat2132 + (float) aShort6782
						* Class286.aFloat3879);
				float f_152_;
				float f_153_;
				if (f > f_151_) {
					f_153_ = f + (float) aShort6813;
					f_152_ = f_151_ - (float) aShort6813;
				} else {
					f_152_ = (float) -aShort6813 + f;
					f_153_ = (float) aShort6813 + f_151_;
				}
				if (!(f_152_ >= ((Class163_Sub3) aClass163_Sub3_6791).aFloat8316)
						&& !(f_153_ <= (float) (((Class163_Sub3) aClass163_Sub3_6791).anInt8390))) {
					Class11_Sub23_Sub2.aFloat9521 = ((((Class33_Sub1) class33_sub1).aFloat6200 * ((Class33_Sub1) class33_sub1_150_).aFloat6185)
							+ (((Class33_Sub1) class33_sub1).aFloat6164 * ((Class33_Sub1) class33_sub1_150_).aFloat6200) + (((Class33_Sub1) class33_sub1).aFloat6179 * (((Class33_Sub1) class33_sub1_150_).aFloat6192)));
					RuntimeException_Sub1.aFloat9966 = (((Class33_Sub1) class33_sub1).aFloat6201 + ((((Class33_Sub1) class33_sub1).aFloat6179 * ((Class33_Sub1) class33_sub1_150_).aFloat6168) + ((((Class33_Sub1) class33_sub1_150_).aFloat6191 * ((Class33_Sub1) class33_sub1).aFloat6200) + ((((Class33_Sub1) class33_sub1_150_).aFloat6201) * (((Class33_Sub1) class33_sub1).aFloat6164)))));
					float f_154_ = (RuntimeException_Sub1.aFloat9966 + (Class11_Sub23_Sub2.aFloat9521 * (float) aShort6762));
					float f_155_ = ((float) aShort6782
							* Class11_Sub23_Sub2.aFloat9521 + RuntimeException_Sub1.aFloat9966);
					float f_156_;
					float f_157_;
					if (!(f_155_ < f_154_)) {
						f_157_ = ((float) (((Class163_Sub3) aClass163_Sub3_6791).anInt8393) * (f_155_ + (float) aShort6813));
						f_156_ = ((float) (((Class163_Sub3) aClass163_Sub3_6791).anInt8393) * (f_154_ - (float) aShort6813));
					} else {
						f_156_ = ((float) (((Class163_Sub3) aClass163_Sub3_6791).anInt8393) * ((float) -aShort6813 + f_155_));
						f_157_ = (((float) aShort6813 + f_154_) * (float) (((Class163_Sub3) aClass163_Sub3_6791).anInt8393));
					}
					if (!(((Class163_Sub3) aClass163_Sub3_6791).aFloat8326 <= f_156_
							/ f_153_)
							&& !(((Class163_Sub3) aClass163_Sub3_6791).aFloat8374 >= f_157_
									/ f_153_)) {
						Class375.aFloat4896 = (((Class33_Sub1) class33_sub1).aFloat6191 + ((((Class33_Sub1) class33_sub1).aFloat6185 * (((Class33_Sub1) class33_sub1_150_).aFloat6191))
								+ (((Class33_Sub1) class33_sub1).aFloat6162 * (((Class33_Sub1) class33_sub1_150_).aFloat6201)) + ((((Class33_Sub1) class33_sub1_150_).aFloat6168) * (((Class33_Sub1) class33_sub1).aFloat6183))));
						Class230.aFloat3155 = ((((Class33_Sub1) class33_sub1_150_).aFloat6192 * ((Class33_Sub1) class33_sub1).aFloat6183) + ((((Class33_Sub1) class33_sub1).aFloat6185 * (((Class33_Sub1) class33_sub1_150_).aFloat6185)) + ((((Class33_Sub1) class33_sub1_150_).aFloat6200) * (((Class33_Sub1) class33_sub1).aFloat6162))));
						float f_158_ = (Class230.aFloat3155
								* (float) aShort6762 + Class375.aFloat4896);
						float f_159_ = (Class375.aFloat4896 + Class230.aFloat3155
								* (float) aShort6782);
						float f_160_;
						float f_161_;
						if (f_158_ > f_159_) {
							f_161_ = ((float) ((Class163_Sub3) aClass163_Sub3_6791).anInt8327 * (f_159_ - (float) aShort6813));
							f_160_ = ((float) ((Class163_Sub3) aClass163_Sub3_6791).anInt8327 * (f_158_ + (float) aShort6813));
						} else {
							f_160_ = ((f_159_ + (float) aShort6813) * (float) ((Class163_Sub3) aClass163_Sub3_6791).anInt8327);
							f_161_ = ((float) ((Class163_Sub3) aClass163_Sub3_6791).anInt8327 * (f_158_ - (float) aShort6813));
						}
						if (!(((Class163_Sub3) aClass163_Sub3_6791).aFloat8331 <= f_161_
								/ f_153_)
								&& !((((Class163_Sub3) aClass163_Sub3_6791).aFloat8315) >= f_160_
										/ f_153_)) {
							if (class376_sub4 != null
									|| aClass199Array6838 != null) {
								Class326.aFloat4352 = (((((Class33_Sub1) class33_sub1_150_).aFloat6183) * (((Class33_Sub1) class33_sub1).aFloat6200))
										+ ((((Class33_Sub1) class33_sub1_150_).aFloat6179) * (((Class33_Sub1) class33_sub1).aFloat6164)) + ((((Class33_Sub1) class33_sub1).aFloat6179) * (((Class33_Sub1) class33_sub1_150_).aFloat6174)));
								Class272.aFloat3676 = (((((Class33_Sub1) class33_sub1_150_).aFloat6179) * (((Class33_Sub1) class33_sub1).aFloat6162))
										+ ((((Class33_Sub1) class33_sub1).aFloat6185) * (((Class33_Sub1) class33_sub1_150_).aFloat6183)) + ((((Class33_Sub1) class33_sub1_150_).aFloat6174) * (((Class33_Sub1) class33_sub1).aFloat6183)));
								Class142.aFloat1927 = (((((Class33_Sub1) class33_sub1_150_).aFloat6162) * (((Class33_Sub1) class33_sub1).aFloat6200))
										+ ((((Class33_Sub1) class33_sub1).aFloat6164) * (((Class33_Sub1) class33_sub1_150_).aFloat6164)) + ((((Class33_Sub1) class33_sub1).aFloat6179) * (((Class33_Sub1) class33_sub1_150_).aFloat6197)));
								Class82.aFloat1128 = (((((Class33_Sub1) class33_sub1).aFloat6192) * (((Class33_Sub1) class33_sub1_150_).aFloat6162))
										+ ((((Class33_Sub1) class33_sub1).aFloat6197) * (((Class33_Sub1) class33_sub1_150_).aFloat6164)) + ((((Class33_Sub1) class33_sub1).aFloat6174) * (((Class33_Sub1) class33_sub1_150_).aFloat6197)));
								Class11_Sub45_Sub1_Sub1.aFloat9835 = (((((Class33_Sub1) class33_sub1).aFloat6185) * (((Class33_Sub1) class33_sub1_150_).aFloat6162))
										+ ((((Class33_Sub1) class33_sub1_150_).aFloat6164) * (((Class33_Sub1) class33_sub1).aFloat6162)) + ((((Class33_Sub1) class33_sub1).aFloat6183) * (((Class33_Sub1) class33_sub1_150_).aFloat6197)));
								Class2_Sub10.aFloat7924 = (((((Class33_Sub1) class33_sub1_150_).aFloat6179) * (((Class33_Sub1) class33_sub1).aFloat6197))
										+ ((((Class33_Sub1) class33_sub1).aFloat6192) * (((Class33_Sub1) class33_sub1_150_).aFloat6183)) + ((((Class33_Sub1) class33_sub1_150_).aFloat6174) * (((Class33_Sub1) class33_sub1).aFloat6174)));
							}
							if (class376_sub4 != null) {
								boolean bool = false;
								boolean bool_162_ = true;
								int i_163_ = aShort6817 + aShort6739 >> 1;
								int i_164_ = aShort6822 - -aShort6824 >> 1;
								int i_165_ = (int) (RuntimeException_Sub1.aFloat9966
										+ ((float) i_163_ * Class142.aFloat1927)
										+ ((float) aShort6762 * (Class11_Sub23_Sub2.aFloat9521)) + (Class326.aFloat4352 * (float) i_164_));
								int i_166_ = (int) (Class375.aFloat4896
										+ ((float) i_163_ * (Class11_Sub45_Sub1_Sub1.aFloat9835))
										+ ((float) aShort6762 * Class230.aFloat3155) + ((float) i_164_ * Class272.aFloat3676));
								int i_167_ = (int) (((float) i_164_ * Class2_Sub10.aFloat7924) + (((float) aShort6762 * Class286.aFloat3879) + (Class164.aFloat2132 + ((float) i_163_ * Class82.aFloat1128))));
								if (i_167_ >= (((Class163_Sub3) aClass163_Sub3_6791).anInt8390)) {
									((Class376_Sub4) class376_sub4).anInt6123 = ((((Class163_Sub3) aClass163_Sub3_6791).anInt8327
											* i_166_ / i_167_) + ((Class163_Sub3) aClass163_Sub3_6791).anInt8384);
									((Class376_Sub4) class376_sub4).anInt6122 = (((Class163_Sub3) aClass163_Sub3_6791).anInt8367 + (((Class163_Sub3) aClass163_Sub3_6791).anInt8393
											* i_165_ / i_167_));
								} else
									bool = true;
								int i_168_ = (int) ((Class11_Sub23_Sub2.aFloat9521 * (float) aShort6782)
										+ (((float) i_163_ * Class142.aFloat1927) + (RuntimeException_Sub1.aFloat9966)) + ((float) i_164_ * Class326.aFloat4352));
								int i_169_ = (int) (((float) i_164_ * Class272.aFloat3676) + ((Class11_Sub45_Sub1_Sub1.aFloat9835)
										* (float) i_163_ + Class375.aFloat4896 + ((float) aShort6782 * Class230.aFloat3155)));
								int i_170_ = (int) (((float) i_164_ * Class2_Sub10.aFloat7924) + (Class164.aFloat2132
										+ ((float) i_163_ * Class82.aFloat1128) + (Class286.aFloat3879 * (float) aShort6782)));
								if ((i_170_ ^ 0xffffffff) <= ((((Class163_Sub3) aClass163_Sub3_6791).anInt8390) ^ 0xffffffff)) {
									((Class376_Sub4) class376_sub4).anInt6127 = (i_168_
											* (((Class163_Sub3) aClass163_Sub3_6791).anInt8393)
											/ i_170_ + ((Class163_Sub3) aClass163_Sub3_6791).anInt8367);
									((Class376_Sub4) class376_sub4).anInt6126 = ((((Class163_Sub3) aClass163_Sub3_6791).anInt8327
											* i_169_ / i_170_) + ((Class163_Sub3) aClass163_Sub3_6791).anInt8384);
								} else
									bool = true;
								if (bool) {
									if (i_167_ < (((Class163_Sub3) aClass163_Sub3_6791).anInt8390)
											&& ((((Class163_Sub3) aClass163_Sub3_6791).anInt8390 ^ 0xffffffff) < (i_170_ ^ 0xffffffff)))
										bool_162_ = false;
									else if (((Class163_Sub3) aClass163_Sub3_6791).anInt8390 <= i_167_) {
										if ((((Class163_Sub3) aClass163_Sub3_6791).anInt8390 ^ 0xffffffff) < (i_170_ ^ 0xffffffff)) {
											int i_171_ = ((-(((Class163_Sub3) aClass163_Sub3_6791).anInt8390)
													+ i_167_ << 16) / (-i_170_ + i_167_));
											int i_172_ = (((-i_168_ + i_165_)
													* i_171_ >> 16) + i_165_);
											((Class376_Sub4) class376_sub4).anInt6122 = (((((Class163_Sub3) aClass163_Sub3_6791).anInt8393)
													* i_172_ / (((Class163_Sub3) aClass163_Sub3_6791).anInt8390)) + (((Class163_Sub3) aClass163_Sub3_6791).anInt8367));
											int i_173_ = ((i_171_
													* (i_166_ - i_169_) >> 16) + i_166_);
											((Class376_Sub4) class376_sub4).anInt6123 = ((((Class163_Sub3) aClass163_Sub3_6791).anInt8384) + (i_173_
													* (((Class163_Sub3) aClass163_Sub3_6791).anInt8327) / (((Class163_Sub3) aClass163_Sub3_6791).anInt8390)));
										}
									} else {
										int i_174_ = ((-(((Class163_Sub3) aClass163_Sub3_6791).anInt8390)
												+ i_170_ << 16) / (i_170_ + -i_167_));
										int i_175_ = ((i_174_
												* (-i_165_ + i_168_) >> 16) + i_168_);
										int i_176_ = (i_169_ + ((-i_166_ + i_169_)
												* i_174_ >> 16));
										((Class376_Sub4) class376_sub4).anInt6122 = ((i_175_
												* (((Class163_Sub3) aClass163_Sub3_6791).anInt8393) / (((Class163_Sub3) aClass163_Sub3_6791).anInt8390)) + (((Class163_Sub3) aClass163_Sub3_6791).anInt8367));
										((Class376_Sub4) class376_sub4).anInt6123 = (((Class163_Sub3) aClass163_Sub3_6791).anInt8384 - -(i_176_
												* (((Class163_Sub3) aClass163_Sub3_6791).anInt8327) / (((Class163_Sub3) aClass163_Sub3_6791).anInt8390)));
									}
								}
								if (bool_162_) {
									if (i_170_ >= i_167_)
										((Class376_Sub4) class376_sub4).anInt6125 = (((i_168_ - -aShort6813)
												* (((Class163_Sub3) aClass163_Sub3_6791).anInt8393) / i_170_)
												+ (((Class163_Sub3) aClass163_Sub3_6791).anInt8367) + -((Class376_Sub4) class376_sub4).anInt6127);
									else
										((Class376_Sub4) class376_sub4).anInt6125 = (-((Class376_Sub4) class376_sub4).anInt6122
												+ ((i_165_ + aShort6813)
														* (((Class163_Sub3) aClass163_Sub3_6791).anInt8393) / i_167_) + (((Class163_Sub3) aClass163_Sub3_6791).anInt8367));
									((Class376_Sub4) class376_sub4).aBool6124 = true;
								}
							}
							aClass163_Sub3_6791.method3308(32);
							aClass163_Sub3_6791.method3262((byte) 81,
									class33_sub1_150_);
							method2777((byte) 44);
							aClass163_Sub3_6791.method3247(-124);
							method2776(7);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("li.B(" + (class33 != null ? "{...}" : "null") + ','
							+ (class376_sub4 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	final void a(int i) {
		do {
			try {
				anInt6806++;
				int i_177_ = Class335.anIntArray4436[i];
				int i_178_ = Class335.anIntArray4430[i];
				for (int i_179_ = 0; i_179_ < anInt6802; i_179_++) {
					int i_180_ = ((i_177_ * anIntArray6757[i_179_] + anIntArray6775[i_179_]
							* i_178_) >> 14);
					anIntArray6757[i_179_] = (-(i_177_ * anIntArray6775[i_179_]) + i_178_
							* anIntArray6757[i_179_]) >> 14;
					anIntArray6775[i_179_] = i_180_;
				}
				aBool6741 = false;
				if (aClass350_6810 == null)
					break;
				((Class350) aClass350_6810).anInterface9_4613 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "li.a(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method1309(int i, int i_181_, Class33 class33, boolean bool,
			int i_182_) {
		try {
			anInt6777++;
			return method2780(i, class33, i_182_, bool, -1, i_181_, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("li.E(" + i + ','
					+ i_181_ + ',' + (class33 != null ? "{...}" : "null") + ','
					+ bool + ',' + i_182_ + ')'));
		}
	}

	final void method1320(int i, int[] is, int i_183_, int i_184_, int i_185_,
			int i_186_, boolean bool) {
		try {
			anInt6726++;
			int i_187_ = is.length;
			if (i == 0) {
				i_185_ <<= 4;
				i_184_ <<= 4;
				i_183_ <<= 4;
				Class322.anInt4311 = 0;
				Class78.anInt1052 = 0;
				int i_188_ = 0;
				Class318.anInt4225 = 0;
				for (int i_189_ = 0; i_187_ > i_189_; i_189_++) {
					int i_190_ = is[i_189_];
					if (anIntArrayArray6807.length > i_190_) {
						int[] is_191_ = anIntArrayArray6807[i_190_];
						for (int i_192_ = 0; ((i_192_ ^ 0xffffffff) > (is_191_.length ^ 0xffffffff)); i_192_++) {
							int i_193_ = is_191_[i_192_];
							Class322.anInt4311 += anIntArray6775[i_193_];
							Class78.anInt1052 += anIntArray6744[i_193_];
							i_188_++;
							Class318.anInt4225 += anIntArray6757[i_193_];
						}
					}
				}
				if (i_188_ > 0) {
					Class78.anInt1052 = Class78.anInt1052 / i_188_ - -i_184_;
					Class318.anInt4225 = Class318.anInt4225 / i_188_ - -i_185_;
					Class322.anInt4311 = Class322.anInt4311 / i_188_ - -i_183_;
				} else {
					Class318.anInt4225 = i_185_;
					Class78.anInt1052 = i_184_;
					Class322.anInt4311 = i_183_;
				}
			} else if ((i ^ 0xffffffff) == -2) {
				i_184_ <<= 4;
				i_185_ <<= 4;
				i_183_ <<= 4;
				for (int i_194_ = 0; (i_187_ ^ 0xffffffff) < (i_194_ ^ 0xffffffff); i_194_++) {
					int i_195_ = is[i_194_];
					if (i_195_ < anIntArrayArray6807.length) {
						int[] is_196_ = anIntArrayArray6807[i_195_];
						for (int i_197_ = 0; ((is_196_.length ^ 0xffffffff) < (i_197_ ^ 0xffffffff)); i_197_++) {
							int i_198_ = is_196_[i_197_];
							anIntArray6775[i_198_] += i_183_;
							anIntArray6744[i_198_] += i_184_;
							anIntArray6757[i_198_] += i_185_;
						}
					}
				}
			} else if (i == 2) {
				for (int i_199_ = 0; i_199_ < i_187_; i_199_++) {
					int i_200_ = is[i_199_];
					if ((i_200_ ^ 0xffffffff) > (anIntArrayArray6807.length ^ 0xffffffff)) {
						int[] is_201_ = anIntArrayArray6807[i_200_];
						if ((0x1 & i_186_ ^ 0xffffffff) == -1) {
							for (int i_202_ = 0; ((i_202_ ^ 0xffffffff) > (is_201_.length ^ 0xffffffff)); i_202_++) {
								int i_203_ = is_201_[i_202_];
								anIntArray6775[i_203_] -= Class322.anInt4311;
								anIntArray6744[i_203_] -= Class78.anInt1052;
								anIntArray6757[i_203_] -= Class318.anInt4225;
								if ((i_185_ ^ 0xffffffff) != -1) {
									int i_204_ = Class335.anIntArray4436[i_185_];
									int i_205_ = Class335.anIntArray4430[i_185_];
									int i_206_ = ((anIntArray6744[i_203_]
											* i_204_ + (i_205_
											* anIntArray6775[i_203_] + 16383)) >> 14);
									anIntArray6744[i_203_] = (-(anIntArray6775[i_203_] * i_204_) + (i_205_
											* anIntArray6744[i_203_] + 16383)) >> 14;
									anIntArray6775[i_203_] = i_206_;
								}
								if ((i_183_ ^ 0xffffffff) != -1) {
									int i_207_ = Class335.anIntArray4436[i_183_];
									int i_208_ = Class335.anIntArray4430[i_183_];
									int i_209_ = ((16383 + -(i_207_ * anIntArray6757[i_203_]) + i_208_
											* anIntArray6744[i_203_]) >> 14);
									anIntArray6757[i_203_] = (16383 + (i_208_
											* anIntArray6757[i_203_] + i_207_
											* (anIntArray6744[i_203_]))) >> 14;
									anIntArray6744[i_203_] = i_209_;
								}
								if (i_184_ != 0) {
									int i_210_ = Class335.anIntArray4436[i_184_];
									int i_211_ = Class335.anIntArray4430[i_184_];
									int i_212_ = ((16383 + (anIntArray6775[i_203_]
											* i_211_ + (i_210_ * anIntArray6757[i_203_]))) >> 14);
									anIntArray6757[i_203_] = (16383 + (-(i_210_ * anIntArray6775[i_203_]) + i_211_
											* (anIntArray6757[i_203_])) >> 14);
									anIntArray6775[i_203_] = i_212_;
								}
								anIntArray6775[i_203_] += Class322.anInt4311;
								anIntArray6744[i_203_] += Class78.anInt1052;
								anIntArray6757[i_203_] += Class318.anInt4225;
							}
						} else {
							for (int i_213_ = 0; is_201_.length > i_213_; i_213_++) {
								int i_214_ = is_201_[i_213_];
								anIntArray6775[i_214_] -= Class322.anInt4311;
								anIntArray6744[i_214_] -= Class78.anInt1052;
								anIntArray6757[i_214_] -= Class318.anInt4225;
								if (i_183_ != 0) {
									int i_215_ = Class335.anIntArray4436[i_183_];
									int i_216_ = Class335.anIntArray4430[i_183_];
									int i_217_ = ((16383 + -(anIntArray6757[i_214_] * i_215_) + i_216_
											* anIntArray6744[i_214_]) >> 14);
									anIntArray6757[i_214_] = (16383 + (anIntArray6757[i_214_]
											* i_216_ + (anIntArray6744[i_214_] * i_215_))) >> 14;
									anIntArray6744[i_214_] = i_217_;
								}
								if ((i_185_ ^ 0xffffffff) != -1) {
									int i_218_ = Class335.anIntArray4436[i_185_];
									int i_219_ = Class335.anIntArray4430[i_185_];
									int i_220_ = ((16383 + i_218_
											* anIntArray6744[i_214_] - -(i_219_ * anIntArray6775[i_214_])) >> 14);
									anIntArray6744[i_214_] = (anIntArray6744[i_214_]
											* i_219_ - (i_218_
											* anIntArray6775[i_214_] - 16383)) >> 14;
									anIntArray6775[i_214_] = i_220_;
								}
								if (i_184_ != 0) {
									int i_221_ = Class335.anIntArray4436[i_184_];
									int i_222_ = Class335.anIntArray4430[i_184_];
									int i_223_ = ((i_222_
											* anIntArray6775[i_214_]
											+ anIntArray6757[i_214_] * i_221_ + 16383) >> 14);
									anIntArray6757[i_214_] = ((16383
											+ anIntArray6757[i_214_] * i_222_ - i_221_
											* anIntArray6775[i_214_]) >> 14);
									anIntArray6775[i_214_] = i_223_;
								}
								anIntArray6775[i_214_] += Class322.anInt4311;
								anIntArray6744[i_214_] += Class78.anInt1052;
								anIntArray6757[i_214_] += Class318.anInt4225;
							}
						}
					}
				}
				if (bool) {
					for (int i_224_ = 0; i_187_ > i_224_; i_224_++) {
						int i_225_ = is[i_224_];
						if (i_225_ < anIntArrayArray6807.length) {
							int[] is_226_ = anIntArrayArray6807[i_225_];
							for (int i_227_ = 0; ((is_226_.length ^ 0xffffffff) < (i_227_ ^ 0xffffffff)); i_227_++) {
								int i_228_ = is_226_[i_227_];
								int i_229_ = anIntArray6763[i_228_];
								int i_230_ = anIntArray6763[1 + i_228_];
								for (int i_231_ = i_229_; i_230_ > i_231_; i_231_++) {
									int i_232_ = aShortArray6764[i_231_] - 1;
									if ((i_232_ ^ 0xffffffff) == 0)
										break;
									if (i_185_ != 0) {
										int i_233_ = Class335.anIntArray4436[i_185_];
										int i_234_ = Class335.anIntArray4430[i_185_];
										int i_235_ = (i_234_
												* aShortArray6787[i_232_]
												+ (i_233_ * aShortArray6727[i_232_]) + 16383) >> 14;
										aShortArray6727[i_232_] = (short) ((16383 + -(i_233_ * (aShortArray6787[i_232_])) + (aShortArray6727[i_232_])
												* i_234_) >> 14);
										aShortArray6787[i_232_] = (short) i_235_;
									}
									if ((i_183_ ^ 0xffffffff) != -1) {
										int i_236_ = Class335.anIntArray4436[i_183_];
										int i_237_ = Class335.anIntArray4430[i_183_];
										int i_238_ = ((16383 + (i_237_ * aShortArray6727[i_232_]) - (i_236_ * aShortArray6826[i_232_])) >> 14);
										aShortArray6826[i_232_] = (short) (((i_237_ * (aShortArray6826[i_232_])) + ((aShortArray6727[i_232_])
												* i_236_ + 16383)) >> 14);
										aShortArray6727[i_232_] = (short) i_238_;
									}
									if (i_184_ != 0) {
										int i_239_ = Class335.anIntArray4436[i_184_];
										int i_240_ = Class335.anIntArray4430[i_184_];
										int i_241_ = ((16383 + ((i_240_ * aShortArray6787[i_232_]) + (aShortArray6826[i_232_] * i_239_))) >> 14);
										aShortArray6826[i_232_] = (short) ((16383 + ((aShortArray6826[i_232_])
												* i_240_ + -(i_239_ * (aShortArray6787[i_232_])))) >> 14);
										aShortArray6787[i_232_] = (short) i_241_;
									}
								}
							}
						}
					}
					if (aClass350_6724 == null && aClass350_6814 != null)
						((Class350) aClass350_6814).anInterface9_4613 = null;
					if (aClass350_6724 != null)
						((Class350) aClass350_6724).anInterface9_4613 = null;
				}
			} else if ((i ^ 0xffffffff) == -4) {
				for (int i_242_ = 0; (i_187_ ^ 0xffffffff) < (i_242_ ^ 0xffffffff); i_242_++) {
					int i_243_ = is[i_242_];
					if (anIntArrayArray6807.length > i_243_) {
						int[] is_244_ = anIntArrayArray6807[i_243_];
						for (int i_245_ = 0; is_244_.length > i_245_; i_245_++) {
							int i_246_ = is_244_[i_245_];
							anIntArray6775[i_246_] -= Class322.anInt4311;
							anIntArray6744[i_246_] -= Class78.anInt1052;
							anIntArray6757[i_246_] -= Class318.anInt4225;
							anIntArray6775[i_246_] = anIntArray6775[i_246_]
									* i_183_ >> 7;
							anIntArray6744[i_246_] = anIntArray6744[i_246_]
									* i_184_ >> 7;
							anIntArray6757[i_246_] = i_185_
									* anIntArray6757[i_246_] >> 7;
							anIntArray6775[i_246_] += Class322.anInt4311;
							anIntArray6744[i_246_] += Class78.anInt1052;
							anIntArray6757[i_246_] += Class318.anInt4225;
						}
					}
				}
			} else if (i == 5) {
				if (anIntArrayArray6745 != null) {
					for (int i_247_ = 0; (i_247_ ^ 0xffffffff) > (i_187_ ^ 0xffffffff); i_247_++) {
						int i_248_ = is[i_247_];
						if ((anIntArrayArray6745.length ^ 0xffffffff) < (i_248_ ^ 0xffffffff)) {
							int[] is_249_ = anIntArrayArray6745[i_248_];
							for (int i_250_ = 0; i_250_ < is_249_.length; i_250_++) {
								int i_251_ = is_249_[i_250_];
								int i_252_ = ((0xff & aByteArray6735[i_251_]) + i_183_ * 8);
								if (i_252_ >= 0) {
									if ((i_252_ ^ 0xffffffff) < -256)
										i_252_ = 255;
								} else
									i_252_ = 0;
								aByteArray6735[i_251_] = (byte) i_252_;
							}
							if (is_249_.length > 0 && aClass350_6814 != null)
								((Class350) aClass350_6814).anInterface9_4613 = null;
						}
					}
					if (aClass199Array6838 != null) {
						for (int i_253_ = 0; anInt6742 > i_253_; i_253_++) {
							Class199 class199 = aClass199Array6838[i_253_];
							Class330 class330 = aClass330Array6841[i_253_];
							((Class330) class330).anInt4382 = (255 - (0xff & (aByteArray6735[(((Class199) class199).anInt2695)])) << 24 | (0xffffff & ((Class330) class330).anInt4382));
						}
					}
				}
			} else if ((i ^ 0xffffffff) == -8) {
				if (anIntArrayArray6745 != null) {
					for (int i_254_ = 0; i_187_ > i_254_; i_254_++) {
						int i_255_ = is[i_254_];
						if (anIntArrayArray6745.length > i_255_) {
							int[] is_256_ = anIntArrayArray6745[i_255_];
							for (int i_257_ = 0; is_256_.length > i_257_; i_257_++) {
								int i_258_ = is_256_[i_257_];
								int i_259_ = 0xffff & aShortArray6753[i_258_];
								int i_260_ = 0x3f & i_259_ >> 10;
								int i_261_ = (0x3d3 & i_259_) >> 7;
								i_260_ = 0x3f & i_260_ - -i_183_;
								i_261_ += i_184_ / 4;
								int i_262_ = 0x7f & i_259_;
								if (i_261_ >= 0) {
									if ((i_261_ ^ 0xffffffff) < -8)
										i_261_ = 7;
								} else
									i_261_ = 0;
								i_262_ += i_185_;
								if ((i_262_ ^ 0xffffffff) <= -1) {
									if (i_262_ > 127)
										i_262_ = 127;
								} else
									i_262_ = 0;
								aShortArray6753[i_258_] = (short) (Class173
										.method1134(Class173.method1134(
												(i_260_ << 10), (i_261_ << 7)),
												i_262_));
							}
							if ((is_256_.length ^ 0xffffffff) < -1
									&& aClass350_6814 != null)
								((Class350) aClass350_6814).anInterface9_4613 = null;
						}
					}
					if (aClass199Array6838 != null) {
						for (int i_263_ = 0; i_263_ < anInt6742; i_263_++) {
							Class199 class199 = aClass199Array6838[i_263_];
							Class330 class330 = aClass330Array6841[i_263_];
							((Class330) class330).anInt4382 = (((Class330) class330).anInt4382
									& ~0xffffff | (Class27.anIntArray359[0xffff & (aShortArray6753[(((Class199) class199).anInt2695)])]) & 0xffffff);
						}
					}
				}
			} else if ((i ^ 0xffffffff) == -9) {
				if (anIntArrayArray6776 != null) {
					for (int i_264_ = 0; (i_264_ ^ 0xffffffff) > (i_187_ ^ 0xffffffff); i_264_++) {
						int i_265_ = is[i_264_];
						if (anIntArrayArray6776.length > i_265_) {
							int[] is_266_ = anIntArrayArray6776[i_265_];
							for (int i_267_ = 0; is_266_.length > i_267_; i_267_++) {
								Class330 class330 = aClass330Array6841[is_266_[i_267_]];
								((Class330) class330).anInt4388 += i_184_;
								((Class330) class330).anInt4380 += i_183_;
							}
						}
					}
				}
			} else if ((i ^ 0xffffffff) == -11) {
				if (anIntArrayArray6776 != null) {
					for (int i_268_ = 0; i_187_ > i_268_; i_268_++) {
						int i_269_ = is[i_268_];
						if ((anIntArrayArray6776.length ^ 0xffffffff) < (i_269_ ^ 0xffffffff)) {
							int[] is_270_ = anIntArrayArray6776[i_269_];
							for (int i_271_ = 0; ((i_271_ ^ 0xffffffff) > (is_270_.length ^ 0xffffffff)); i_271_++) {
								Class330 class330 = aClass330Array6841[is_270_[i_271_]];
								((Class330) class330).anInt4384 = (i_183_
										* ((Class330) class330).anInt4384 >> 7);
								((Class330) class330).anInt4379 = (i_184_
										* ((Class330) class330).anInt4379 >> 7);
							}
						}
					}
				}
			} else if ((i ^ 0xffffffff) == -10) {
				if (anIntArrayArray6776 != null) {
					for (int i_272_ = 0; (i_272_ ^ 0xffffffff) > (i_187_ ^ 0xffffffff); i_272_++) {
						int i_273_ = is[i_272_];
						if ((anIntArrayArray6776.length ^ 0xffffffff) < (i_273_ ^ 0xffffffff)) {
							int[] is_274_ = anIntArrayArray6776[i_273_];
							for (int i_275_ = 0; i_275_ < is_274_.length; i_275_++) {
								Class330 class330 = aClass330Array6841[is_274_[i_275_]];
								((Class330) class330).anInt4387 = 0x3fff
										& i_183_
										+ (((Class330) class330).anInt4387);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("li.GA(" + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_183_ + ','
					+ i_184_ + ',' + i_185_ + ',' + i_186_ + ',' + bool + ')'));
		}
	}

	final void method1318(Class33 class33) {
		do {
			try {
				anInt6797++;
				Class33_Sub1 class33_sub1 = (Class33_Sub1) class33;
				if (aClass110Array6798 != null) {
					for (int i = 0; aClass110Array6798.length > i; i++) {
						Class110 class110 = aClass110Array6798[i];
						Class110 class110_276_ = class110;
						if (((Class110) class110).aClass110_1498 != null)
							class110_276_ = ((Class110) class110).aClass110_1498;
						((Class110) class110_276_).anInt1492 = (int) (((Class33_Sub1) class33_sub1).aFloat6201 + (((float) (anIntArray6775[(((Class110) class110).anInt1506)]) * (((Class33_Sub1) class33_sub1).aFloat6164))
								+ ((float) (anIntArray6744[(((Class110) class110).anInt1506)]) * (((Class33_Sub1) class33_sub1).aFloat6200)) + ((float) (anIntArray6757[(((Class110) class110).anInt1506)]) * (((Class33_Sub1) class33_sub1).aFloat6179))));
						((Class110) class110_276_).anInt1499 = (int) (((float) (anIntArray6757[(((Class110) class110).anInt1506)]) * (((Class33_Sub1) class33_sub1).aFloat6183))
								+ (((float) (anIntArray6775[(((Class110) class110).anInt1506)]) * (((Class33_Sub1) class33_sub1).aFloat6162)) + ((((Class33_Sub1) class33_sub1).aFloat6185) * (float) (anIntArray6744[(((Class110) class110).anInt1506)]))) + (((Class33_Sub1) class33_sub1).aFloat6191));
						((Class110) class110_276_).anInt1505 = (int) ((((Class33_Sub1) class33_sub1).aFloat6192 * (float) (anIntArray6744[(((Class110) class110).anInt1506)]))
								+ ((float) (anIntArray6775[(((Class110) class110).anInt1506)]) * (((Class33_Sub1) class33_sub1).aFloat6197))
								+ ((float) (anIntArray6757[(((Class110) class110).anInt1506)]) * (((Class33_Sub1) class33_sub1).aFloat6174)) + (((Class33_Sub1) class33_sub1).aFloat6168));
						((Class110) class110_276_).anInt1504 = (int) (((Class33_Sub1) class33_sub1).aFloat6201 + (((((Class33_Sub1) class33_sub1).aFloat6179) * (float) (anIntArray6757[(((Class110) class110).anInt1510)])) + (((float) (anIntArray6775[(((Class110) class110).anInt1510)]) * (((Class33_Sub1) class33_sub1).aFloat6164)) + ((float) (anIntArray6744[(((Class110) class110).anInt1510)]) * (((Class33_Sub1) class33_sub1).aFloat6200)))));
						((Class110) class110_276_).anInt1494 = (int) (((Class33_Sub1) class33_sub1).aFloat6191 + (((((Class33_Sub1) class33_sub1).aFloat6183) * (float) (anIntArray6757[(((Class110) class110).anInt1510)])) + (((float) (anIntArray6775[(((Class110) class110).anInt1510)]) * (((Class33_Sub1) class33_sub1).aFloat6162)) + ((float) (anIntArray6744[(((Class110) class110).anInt1510)]) * (((Class33_Sub1) class33_sub1).aFloat6185)))));
						((Class110) class110_276_).anInt1493 = (int) (((float) (anIntArray6775[(((Class110) class110).anInt1510)]) * (((Class33_Sub1) class33_sub1).aFloat6197))
								+ ((float) (anIntArray6744[(((Class110) class110).anInt1510)]) * (((Class33_Sub1) class33_sub1).aFloat6192))
								+ ((float) (anIntArray6757[(((Class110) class110).anInt1510)]) * (((Class33_Sub1) class33_sub1).aFloat6174)) + (((Class33_Sub1) class33_sub1).aFloat6168));
						((Class110) class110_276_).anInt1502 = (int) (((Class33_Sub1) class33_sub1).aFloat6201 + (((((Class33_Sub1) class33_sub1).aFloat6164) * (float) (anIntArray6775[(((Class110) class110).anInt1497)]))
								+ ((((Class33_Sub1) class33_sub1).aFloat6200) * (float) (anIntArray6744[(((Class110) class110).anInt1497)])) + ((float) (anIntArray6757[(((Class110) class110).anInt1497)]) * (((Class33_Sub1) class33_sub1).aFloat6179))));
						((Class110) class110_276_).anInt1509 = (int) (((Class33_Sub1) class33_sub1).aFloat6191 + (((float) (anIntArray6744[(((Class110) class110).anInt1497)]) * (((Class33_Sub1) class33_sub1).aFloat6185))
								+ ((float) (anIntArray6775[(((Class110) class110).anInt1497)]) * (((Class33_Sub1) class33_sub1).aFloat6162)) + ((float) (anIntArray6757[(((Class110) class110).anInt1497)]) * (((Class33_Sub1) class33_sub1).aFloat6183))));
						((Class110) class110_276_).anInt1491 = (int) (((Class33_Sub1) class33_sub1).aFloat6168 + (((((Class33_Sub1) class33_sub1).aFloat6192) * (float) (anIntArray6744[(((Class110) class110).anInt1497)]))
								+ ((float) (anIntArray6775[(((Class110) class110).anInt1497)]) * (((Class33_Sub1) class33_sub1).aFloat6197)) + ((float) (anIntArray6757[(((Class110) class110).anInt1497)]) * (((Class33_Sub1) class33_sub1).aFloat6174))));
					}
				}
				if (aClass261Array6795 == null)
					break;
				for (int i = 0; (i ^ 0xffffffff) > (aClass261Array6795.length ^ 0xffffffff); i++) {
					Class261 class261 = aClass261Array6795[i];
					Class261 class261_277_ = class261;
					if (((Class261) class261).aClass261_3591 != null)
						class261_277_ = ((Class261) class261).aClass261_3591;
					if (((Class261) class261).aClass33_3585 != null)
						((Class261) class261).aClass33_3585
								.method296(class33_sub1);
					else
						((Class261) class261).aClass33_3585 = class33_sub1
								.method292();
					((Class261) class261_277_).anInt3586 = (int) (((Class33_Sub1) class33_sub1).aFloat6201 + (((float) (anIntArray6757[(((Class261) class261).anInt3577)]) * (((Class33_Sub1) class33_sub1).aFloat6179)) + (((((Class33_Sub1) class33_sub1).aFloat6164) * (float) (anIntArray6775[(((Class261) class261).anInt3577)])) + ((float) (anIntArray6744[(((Class261) class261).anInt3577)]) * (((Class33_Sub1) class33_sub1).aFloat6200)))));
					((Class261) class261_277_).anInt3590 = (int) (((float) (anIntArray6744[((Class261) class261).anInt3577]) * ((Class33_Sub1) class33_sub1).aFloat6185)
							+ ((float) (anIntArray6775[((Class261) class261).anInt3577]) * ((Class33_Sub1) class33_sub1).aFloat6162)
							+ (((Class33_Sub1) class33_sub1).aFloat6183 * (float) (anIntArray6757[(((Class261) class261).anInt3577)])) + ((Class33_Sub1) class33_sub1).aFloat6191);
					((Class261) class261_277_).anInt3582 = (int) (((Class33_Sub1) class33_sub1).aFloat6168 + ((((Class33_Sub1) class33_sub1).aFloat6174 * (float) (anIntArray6757[(((Class261) class261).anInt3577)])) + (((float) (anIntArray6744[(((Class261) class261).anInt3577)]) * (((Class33_Sub1) class33_sub1).aFloat6192)) + ((((Class33_Sub1) class33_sub1).aFloat6197) * (float) (anIntArray6775[(((Class261) class261).anInt3577)])))));
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "li.UA("
						+ (class33 != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	final void v() {
		do {
			try {
				anInt6755++;
				for (int i = 0; (anInt6802 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
					anIntArray6757[i] = -anIntArray6757[i];
				for (int i = 0; i < anInt6820; i++)
					aShortArray6826[i] = (short) -aShortArray6826[i];
				for (int i = 0; (i ^ 0xffffffff) > (anInt6792 ^ 0xffffffff); i++) {
					short i_278_ = aShortArray6829[i];
					aShortArray6829[i] = aShortArray6732[i];
					aShortArray6732[i] = i_278_;
				}
				if (aClass350_6724 == null && aClass350_6814 != null)
					((Class350) aClass350_6814).anInterface9_4613 = null;
				if (aClass350_6724 != null)
					((Class350) aClass350_6724).anInterface9_4613 = null;
				if (aClass381_6808 != null)
					((Class381) aClass381_6808).anInterface19_4961 = null;
				aBool6741 = false;
				if (aClass350_6810 == null)
					break;
				((Class350) aClass350_6810).anInterface9_4613 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "li.v(" + ')');
			}
			break;
		} while (false);
	}

	private final void method2776(int i) {
		try {
			if (i == 7) {
				if (aClass199Array6838 != null) {
					Class33_Sub1 class33_sub1 = (((Class163_Sub3) aClass163_Sub3_6791).aClass33_Sub1_8268);
					aClass163_Sub3_6791.method3297((byte) -114);
					aClass163_Sub3_6791.C(!aBool6818);
					aClass163_Sub3_6791.method3267(false, -25994);
					aClass163_Sub3_6791
							.method3304(
									null,
									((Class163_Sub3) aClass163_Sub3_6791).aClass350_8338,
									null,
									(byte) 99,
									((Class163_Sub3) aClass163_Sub3_6791).aClass350_8310);
					for (int i_279_ = 0; (anInt6742 ^ 0xffffffff) < (i_279_ ^ 0xffffffff); i_279_++) {
						Class199 class199 = aClass199Array6838[i_279_];
						Class330 class330 = aClass330Array6841[i_279_];
						if (!((Class199) class199).aBool2691
								|| !aClass163_Sub3_6791.method1086()) {
							float f = ((float) ((anIntArray6775[((Class199) class199).anInt2698])
									+ (anIntArray6775[(((Class199) class199).anInt2689)]) + (anIntArray6775[(((Class199) class199).anInt2700)])) * 0.3333333F);
							float f_280_ = (0.3333333F * (float) ((anIntArray6744[(((Class199) class199).anInt2698)]) + ((anIntArray6744[(((Class199) class199).anInt2700)]) + (anIntArray6744[(((Class199) class199).anInt2689)]))));
							float f_281_ = ((float) ((anIntArray6757[((Class199) class199).anInt2700]) - (-(anIntArray6757[(((Class199) class199).anInt2689)]) + -(anIntArray6757[(((Class199) class199).anInt2698)]))) * 0.3333333F);
							float f_282_ = (RuntimeException_Sub1.aFloat9966 + (Class326.aFloat4352
									* f_281_ + (f_280_
									* Class11_Sub23_Sub2.aFloat9521 + f
									* Class142.aFloat1927)));
							float f_283_ = (Class272.aFloat3676
									* f_281_
									+ (f_280_ * Class230.aFloat3155 + Class11_Sub45_Sub1_Sub1.aFloat9835
											* f) + Class375.aFloat4896);
							float f_284_ = (Class2_Sub10.aFloat7924
									* f_281_
									+ (Class286.aFloat3879 * f_280_ + f
											* Class82.aFloat1128) + Class164.aFloat2132);
							float f_285_ = ((float) (1.0 / (Math
									.sqrt((double) (f_283_ * f_283_ + f_282_
											* f_282_ + f_284_ * f_284_)))) * (float) ((Class199) class199).anInt2702);
							class33_sub1
									.method2636(
											1,
											(((Class199) class199).aShort2694 * ((Class330) class330).anInt4379) >> 7,
											-f_284_ + f_285_ * f_284_,
											(((Class330) class330).anInt4384 * ((Class199) class199).aShort2699) >> 7,
											((float) ((Class330) class330).anInt4380
													+ f_282_ - f_285_ * f_282_),
											((float) ((Class330) class330).anInt4388
													- f_283_ + f_285_ * f_283_),
											((Class330) class330).anInt4387);
							aClass163_Sub3_6791.method3323(class33_sub1, 73);
							int i_286_ = ((Class330) class330).anInt4382;
							OpenGL.glColor4ub((byte) (i_286_ >> 16),
									(byte) (i_286_ >> 8), (byte) i_286_,
									(byte) (i_286_ >> 24));
							aClass163_Sub3_6791.method3291(i + 116,
									(((Class199) class199).aShort2696));
							aClass163_Sub3_6791.method3283(1,
									(((Class199) class199).aByte2693));
							aClass163_Sub3_6791.method3268(7, 4, 0, 67);
						}
					}
					aClass163_Sub3_6791.C(true);
					aClass163_Sub3_6791.method3247(-124);
				}
				anInt6834++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.A(" + i + ')');
		}
	}

	final void H(int i, int i_287_, int i_288_) {
		try {
			for (int i_289_ = 0; (i_289_ ^ 0xffffffff) > (anInt6802 ^ 0xffffffff); i_289_++) {
				if (i != 0)
					anIntArray6775[i_289_] += i;
				if (i_287_ != 0)
					anIntArray6744[i_289_] += i_287_;
				if ((i_288_ ^ 0xffffffff) != -1)
					anIntArray6757[i_289_] += i_288_;
			}
			anInt6790++;
			if (aClass350_6810 != null)
				((Class350) aClass350_6810).anInterface9_4613 = null;
			aBool6741 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("li.H(" + i + ','
					+ i_287_ + ',' + i_288_ + ')'));
		}
	}

	private final void method2777(byte i) {
		try {
			anInt6749++;
			if (anInt6759 != 0) {
				if ((aByte6733 ^ 0xffffffff) != -1)
					method2771(true, (byte) 83);
				method2771(false, (byte) 83);
				if (i < 37)
					aByte6733 = (byte) 77;
				if (aClass381_6808 != null) {
					if (((Class381) aClass381_6808).anInterface19_4961 == null)
						method2770((byte) 116, (aByte6733 & 0x10) != 0);
					if (((Class381) aClass381_6808).anInterface19_4961 != null) {
						aClass163_Sub3_6791.method3267(aClass350_6724 != null,
								-25994);
						aClass163_Sub3_6791.method3304(aClass350_6724,
								aClass350_6810, aClass350_6814, (byte) 115,
								aClass350_6725);
						int i_290_ = anIntArray6752.length - 1;
						for (int i_291_ = 0; i_291_ < i_290_; i_291_++) {
							int i_292_ = anIntArray6752[i_291_];
							int i_293_ = anIntArray6752[i_291_ + 1];
							int i_294_ = aShortArray6812[i_292_] & 0xffff;
							if ((i_294_ ^ 0xffffffff) == -65536)
								i_294_ = -1;
							aClass163_Sub3_6791
									.method3294((aClass350_6724 != null),
											(byte) 93, i_294_);
							aClass163_Sub3_6791
									.method3288(
											97,
											i_292_ * 3,
											4,
											3 * (i_293_ + -i_292_),
											(((Class381) aClass381_6808).anInterface19_4961));
						}
					}
				}
				method2779(-1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.Q(" + i + ')');
		}
	}

	final void k(int i) {
		try {
			anInt6794++;
			int i_295_ = Class335.anIntArray4436[i];
			int i_296_ = Class335.anIntArray4430[i];
			for (int i_297_ = 0; i_297_ < anInt6802; i_297_++) {
				int i_298_ = ((anIntArray6757[i_297_] * i_295_ - -(i_296_ * anIntArray6775[i_297_])) >> 14);
				anIntArray6757[i_297_] = (-(i_295_ * anIntArray6775[i_297_]) + i_296_
						* anIntArray6757[i_297_]) >> 14;
				anIntArray6775[i_297_] = i_298_;
			}
			for (int i_299_ = 0; (i_299_ ^ 0xffffffff) > (anInt6820 ^ 0xffffffff); i_299_++) {
				int i_300_ = ((i_296_ * aShortArray6787[i_299_] + i_295_
						* aShortArray6826[i_299_]) >> 14);
				aShortArray6826[i_299_] = (short) ((i_296_
						* aShortArray6826[i_299_] + -(i_295_ * aShortArray6787[i_299_])) >> 14);
				aShortArray6787[i_299_] = (short) i_300_;
			}
			if (aClass350_6724 == null && aClass350_6814 != null)
				((Class350) aClass350_6814).anInterface9_4613 = null;
			if (aClass350_6724 != null)
				((Class350) aClass350_6724).anInterface9_4613 = null;
			if (aClass350_6810 != null)
				((Class350) aClass350_6810).anInterface9_4613 = null;
			aBool6741 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.k(" + i + ')');
		}
	}

	final int fa() {
		try {
			anInt6815++;
			if (!aBool6741)
				method2775((byte) -128);
			return aShort6762;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.fa(" + ')');
		}
	}

	final void O(int i, int i_301_, int i_302_) {
		try {
			for (int i_303_ = 0; i_303_ < anInt6802; i_303_++) {
				if ((i ^ 0xffffffff) != -129)
					anIntArray6775[i_303_] = i * anIntArray6775[i_303_] >> 7;
				if ((i_301_ ^ 0xffffffff) != -129)
					anIntArray6744[i_303_] = anIntArray6744[i_303_] * i_301_ >> 7;
				if (i_302_ != 128)
					anIntArray6757[i_303_] = i_302_ * anIntArray6757[i_303_] >> 7;
			}
			anInt6831++;
			if (aClass350_6810 != null)
				((Class350) aClass350_6810).anInterface9_4613 = null;
			aBool6741 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("li.O(" + i + ','
					+ i_301_ + ',' + i_302_ + ')'));
		}
	}

	final int WA() {
		try {
			anInt6723++;
			return aShort6751;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.WA(" + ')');
		}
	}

	final int RA() {
		try {
			if (!aBool6741)
				method2775((byte) -126);
			anInt6781++;
			return aShort6817;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.RA(" + ')');
		}
	}

	final void C(int i) {
		try {
			if (aClass350_6814 != null)
				((Class350) aClass350_6814).anInterface9_4613 = null;
			aShort6751 = (short) i;
			anInt6823++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.C(" + i + ')');
		}
	}

	final void P(int i, int i_304_, int i_305_, int i_306_) {
		try {
			anInt6837++;
			if ((i ^ 0xffffffff) == -1) {
				int i_307_ = 0;
				Class78.anInt1052 = 0;
				Class318.anInt4225 = 0;
				Class322.anInt4311 = 0;
				for (int i_308_ = 0; (anInt6802 ^ 0xffffffff) < (i_308_ ^ 0xffffffff); i_308_++) {
					Class322.anInt4311 += anIntArray6775[i_308_];
					Class78.anInt1052 += anIntArray6744[i_308_];
					Class318.anInt4225 += anIntArray6757[i_308_];
					i_307_++;
				}
				if (i_307_ > 0) {
					Class78.anInt1052 = Class78.anInt1052 / i_307_ - -i_305_;
					Class318.anInt4225 = Class318.anInt4225 / i_307_ + i_306_;
					Class322.anInt4311 = Class322.anInt4311 / i_307_ - -i_304_;
				} else {
					Class322.anInt4311 = i_304_;
					Class78.anInt1052 = i_305_;
					Class318.anInt4225 = i_306_;
				}
			} else if ((i ^ 0xffffffff) == -2) {
				for (int i_309_ = 0; i_309_ < anInt6802; i_309_++) {
					anIntArray6775[i_309_] += i_304_;
					anIntArray6744[i_309_] += i_305_;
					anIntArray6757[i_309_] += i_306_;
				}
			} else if (i == 2) {
				for (int i_310_ = 0; (anInt6802 ^ 0xffffffff) < (i_310_ ^ 0xffffffff); i_310_++) {
					anIntArray6775[i_310_] -= Class322.anInt4311;
					anIntArray6744[i_310_] -= Class78.anInt1052;
					anIntArray6757[i_310_] -= Class318.anInt4225;
					if ((i_306_ ^ 0xffffffff) != -1) {
						int i_311_ = Class335.anIntArray4436[i_306_];
						int i_312_ = Class335.anIntArray4430[i_306_];
						int i_313_ = (16383 + (i_311_ * anIntArray6744[i_310_] - -(i_312_ * anIntArray6775[i_310_])) >> 14);
						anIntArray6744[i_310_] = ((i_312_
								* anIntArray6744[i_310_]
								+ -(anIntArray6775[i_310_] * i_311_) + 16383) >> 14);
						anIntArray6775[i_310_] = i_313_;
					}
					if (i_304_ != 0) {
						int i_314_ = Class335.anIntArray4436[i_304_];
						int i_315_ = Class335.anIntArray4430[i_304_];
						int i_316_ = ((anIntArray6744[i_310_] * i_315_ + (-(anIntArray6757[i_310_] * i_314_) + 16383)) >> 14);
						anIntArray6757[i_310_] = (16383 + (i_314_
								* anIntArray6744[i_310_] - -(anIntArray6757[i_310_] * i_315_)) >> 14);
						anIntArray6744[i_310_] = i_316_;
					}
					if (i_305_ != 0) {
						int i_317_ = Class335.anIntArray4436[i_305_];
						int i_318_ = Class335.anIntArray4430[i_305_];
						int i_319_ = ((i_318_ * anIntArray6775[i_310_] + i_317_
								* anIntArray6757[i_310_] + 16383) >> 14);
						anIntArray6757[i_310_] = (16383 + (-(i_317_ * anIntArray6775[i_310_]) + anIntArray6757[i_310_]
								* i_318_) >> 14);
						anIntArray6775[i_310_] = i_319_;
					}
					anIntArray6775[i_310_] += Class322.anInt4311;
					anIntArray6744[i_310_] += Class78.anInt1052;
					anIntArray6757[i_310_] += Class318.anInt4225;
				}
			} else if (i == 3) {
				for (int i_320_ = 0; (anInt6802 ^ 0xffffffff) < (i_320_ ^ 0xffffffff); i_320_++) {
					anIntArray6775[i_320_] -= Class322.anInt4311;
					anIntArray6744[i_320_] -= Class78.anInt1052;
					anIntArray6757[i_320_] -= Class318.anInt4225;
					anIntArray6775[i_320_] = i_304_ * anIntArray6775[i_320_]
							/ 128;
					anIntArray6744[i_320_] = anIntArray6744[i_320_] * i_305_
							/ 128;
					anIntArray6757[i_320_] = i_306_ * anIntArray6757[i_320_]
							/ 128;
					anIntArray6775[i_320_] += Class322.anInt4311;
					anIntArray6744[i_320_] += Class78.anInt1052;
					anIntArray6757[i_320_] += Class318.anInt4225;
				}
			} else if ((i ^ 0xffffffff) == -6) {
				for (int i_321_ = 0; (i_321_ ^ 0xffffffff) > (anInt6792 ^ 0xffffffff); i_321_++) {
					int i_322_ = 8 * i_304_ + (aByteArray6735[i_321_] & 0xff);
					if ((i_322_ ^ 0xffffffff) <= -1) {
						if ((i_322_ ^ 0xffffffff) < -256)
							i_322_ = 255;
					} else
						i_322_ = 0;
					aByteArray6735[i_321_] = (byte) i_322_;
				}
				if (aClass350_6814 != null)
					((Class350) aClass350_6814).anInterface9_4613 = null;
				if (aClass199Array6838 != null) {
					for (int i_323_ = 0; anInt6742 > i_323_; i_323_++) {
						Class199 class199 = aClass199Array6838[i_323_];
						Class330 class330 = aClass330Array6841[i_323_];
						((Class330) class330).anInt4382 = (((Class330) class330).anInt4382 & 0xffffff | -((aByteArray6735[((Class199) class199).anInt2695]) & 0xff) + 255 << 24);
					}
				}
			} else if ((i ^ 0xffffffff) == -8) {
				for (int i_324_ = 0; i_324_ < anInt6792; i_324_++) {
					int i_325_ = aShortArray6753[i_324_] & 0xffff;
					int i_326_ = 0x3f & i_325_ >> 10;
					int i_327_ = 0x7 & i_325_ >> 7;
					i_327_ += i_305_ / 4;
					int i_328_ = 0x7f & i_325_;
					i_326_ = i_326_ + i_304_ & 0x3f;
					if ((i_327_ ^ 0xffffffff) <= -1) {
						if ((i_327_ ^ 0xffffffff) < -8)
							i_327_ = 7;
					} else
						i_327_ = 0;
					i_328_ += i_306_;
					if (i_328_ >= 0) {
						if (i_328_ > 127)
							i_328_ = 127;
					} else
						i_328_ = 0;
					aShortArray6753[i_324_] = (short) (Class173.method1134(
							Class173.method1134(i_327_ << 7, i_326_ << 10),
							i_328_));
				}
				if (aClass350_6814 != null)
					((Class350) aClass350_6814).anInterface9_4613 = null;
				if (aClass199Array6838 != null) {
					for (int i_329_ = 0; (anInt6742 ^ 0xffffffff) < (i_329_ ^ 0xffffffff); i_329_++) {
						Class199 class199 = aClass199Array6838[i_329_];
						Class330 class330 = aClass330Array6841[i_329_];
						((Class330) class330).anInt4382 = ((Class27.anIntArray359[(0xffff & aShortArray6753[(((Class199) class199).anInt2695)])]) & 0xffffff | ((Class330) class330).anInt4382
								& ~0xffffff);
					}
				}
			} else if ((i ^ 0xffffffff) == -9) {
				for (int i_330_ = 0; (i_330_ ^ 0xffffffff) > (anInt6742 ^ 0xffffffff); i_330_++) {
					Class330 class330 = aClass330Array6841[i_330_];
					((Class330) class330).anInt4388 += i_305_;
					((Class330) class330).anInt4380 += i_304_;
				}
			} else if ((i ^ 0xffffffff) == -11) {
				for (int i_331_ = 0; i_331_ < anInt6742; i_331_++) {
					Class330 class330 = aClass330Array6841[i_331_];
					((Class330) class330).anInt4379 = i_305_
							* ((Class330) class330).anInt4379 >> 7;
					((Class330) class330).anInt4384 = i_304_
							* ((Class330) class330).anInt4384 >> 7;
				}
			} else if ((i ^ 0xffffffff) == -10) {
				for (int i_332_ = 0; i_332_ < anInt6742; i_332_++) {
					Class330 class330 = aClass330Array6841[i_332_];
					((Class330) class330).anInt4387 = i_304_
							+ ((Class330) class330).anInt4387 & 0x3fff;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("li.P(" + i + ','
					+ i_304_ + ',' + i_305_ + ',' + i_306_ + ')'));
		}
	}

	private final int method2778(int i, byte i_333_, int i_334_, int i_335_,
			short i_336_) {
		try {
			anInt6750++;
			if (i_335_ < 21)
				return -43;
			int i_337_ = Class27.anIntArray359[Class289.method1782(116, i,
					i_334_)];
			if ((i_336_ ^ 0xffffffff) != 0) {
				Class188 class188 = ((Class163) aClass163_Sub3_6791).anInterface1_2118
						.method7((byte) 127, 0xffff & i_336_);
				int i_338_ = ((Class188) class188).aByte2414 & 0xff;
				if (i_338_ != 0) {
					int i_339_;
					if ((i_334_ ^ 0xffffffff) > -1)
						i_339_ = 0;
					else if (i_334_ > 127)
						i_339_ = 16777215;
					else
						i_339_ = i_334_ * 131586;
					if (i_338_ != 256) {
						int i_340_ = i_338_;
						int i_341_ = -i_338_ + 256;
						i_337_ = ((~0xff00ff & ((i_337_ & 0xff00ff) * i_341_ + i_340_
								* (0xff00ff & i_339_))) + ((i_340_
								* (0xff00 & i_339_) - -((i_337_ & 0xff00) * i_341_)) & 0xff0000)) >> 8;
					} else
						i_337_ = i_339_;
				}
				int i_342_ = 0xff & ((Class188) class188).aByte2418;
				if (i_342_ != 0) {
					i_342_ += 256;
					int i_343_ = ((0xff0000 & i_337_) >> 16) * i_342_;
					if (i_343_ > 65535)
						i_343_ = 65535;
					int i_344_ = (i_337_ >> 8 & 0xff) * i_342_;
					if (i_344_ > 65535)
						i_344_ = 65535;
					int i_345_ = (0xff & i_337_) * i_342_;
					if (i_345_ > 65535)
						i_345_ = 65535;
					i_337_ = (i_345_ >> 8) + (0xff00 & i_344_)
							+ (i_343_ << 8 & 0xff000c);
				}
			}
			return -(0xff & i_333_) + 255 + (i_337_ << 8);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("li.M(" + i + ',' + i_333_ + ',' + i_334_ + ',' + i_335_
							+ ',' + i_336_ + ')'));
		}
	}

	final void method1302(Class33 class33, int i, boolean bool) {
		try {
			anInt6748++;
			if (aShortArray6758 != null) {
				int[] is = new int[3];
				for (int i_346_ = 0; anInt6802 > i_346_; i_346_++) {
					if ((i & aShortArray6758[i_346_] ^ 0xffffffff) != -1) {
						if (bool)
							class33.method287(anIntArray6775[i_346_],
									anIntArray6744[i_346_],
									anIntArray6757[i_346_], is);
						else
							class33.method295(anIntArray6775[i_346_],
									anIntArray6744[i_346_],
									anIntArray6757[i_346_], is);
						anIntArray6775[i_346_] = is[0];
						anIntArray6744[i_346_] = is[1];
						anIntArray6757[i_346_] = is[2];
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("li.za("
					+ (class33 != null ? "{...}" : "null") + ',' + i + ','
					+ bool + ')'));
		}
	}

	final boolean r() {
		try {
			anInt6754++;
			return aBool6816;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.r(" + ')');
		}
	}

	final boolean method1305(int i, int i_347_, Class33 class33, boolean bool,
			int i_348_, int i_349_) {
		try {
			anInt6734++;
			return method2780(i, class33, i_348_, bool, i_349_, i_347_, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("li.S(" + i + ','
					+ i_347_ + ',' + (class33 != null ? "{...}" : "null") + ','
					+ bool + ',' + i_348_ + ',' + i_349_ + ')'));
		}
	}

	final void method1317() {
		try {
			anInt6842++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.AB(" + ')');
		}
	}

	final int EA() {
		try {
			if (!aBool6741)
				method2775((byte) -126);
			anInt6803++;
			return aShort6782;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.EA(" + ')');
		}
	}

	final Class206 method1313(byte i, int i_350_, boolean bool) {
		try {
			anInt6809++;
			Class206_Sub3 class206_sub3_351_;
			Class206_Sub3 class206_sub3_352_;
			if ((i ^ 0xffffffff) == -2) {
				class206_sub3_352_ = (((Class163_Sub3) aClass163_Sub3_6791).aClass206_Sub3_8385);
				class206_sub3_351_ = (((Class163_Sub3) aClass163_Sub3_6791).aClass206_Sub3_8333);
			} else if (i == 2) {
				class206_sub3_351_ = (((Class163_Sub3) aClass163_Sub3_6791).aClass206_Sub3_8382);
				class206_sub3_352_ = (((Class163_Sub3) aClass163_Sub3_6791).aClass206_Sub3_8354);
			} else if ((i ^ 0xffffffff) != -4) {
				if ((i ^ 0xffffffff) == -5) {
					class206_sub3_352_ = (((Class163_Sub3) aClass163_Sub3_6791).aClass206_Sub3_8342);
					class206_sub3_351_ = (((Class163_Sub3) aClass163_Sub3_6791).aClass206_Sub3_8343);
				} else if (i == 5) {
					class206_sub3_352_ = (((Class163_Sub3) aClass163_Sub3_6791).aClass206_Sub3_8356);
					class206_sub3_351_ = (((Class163_Sub3) aClass163_Sub3_6791).aClass206_Sub3_8319);
				} else
					class206_sub3_352_ = class206_sub3_351_ = new Class206_Sub3(
							aClass163_Sub3_6791);
			} else {
				class206_sub3_351_ = (((Class163_Sub3) aClass163_Sub3_6791).aClass206_Sub3_8379);
				class206_sub3_352_ = (((Class163_Sub3) aClass163_Sub3_6791).aClass206_Sub3_8410);
			}
			return method2773(class206_sub3_351_, (byte) 25, bool,
					(i ^ 0xffffffff) != -1, i_350_, class206_sub3_352_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("li.DA(" + i + ','
					+ i_350_ + ',' + bool + ')'));
		}
	}

	final int G() {
		try {
			if (!aBool6741)
				method2775((byte) -126);
			anInt6793++;
			return aShort6824;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.G(" + ')');
		}
	}

	final void I(int i, int[] is, int i_353_, int i_354_, int i_355_,
			boolean bool, int i_356_, int[] is_357_) {
		try {
			anInt6728++;
			int i_358_ = is.length;
			if (i == 0) {
				i_355_ <<= 4;
				i_354_ <<= 4;
				i_353_ <<= 4;
				Class318.anInt4225 = 0;
				Class322.anInt4311 = 0;
				int i_359_ = 0;
				Class78.anInt1052 = 0;
				for (int i_360_ = 0; (i_360_ ^ 0xffffffff) > (i_358_ ^ 0xffffffff); i_360_++) {
					int i_361_ = is[i_360_];
					if ((i_361_ ^ 0xffffffff) > (anIntArrayArray6807.length ^ 0xffffffff)) {
						int[] is_362_ = anIntArrayArray6807[i_361_];
						for (int i_363_ = 0; i_363_ < is_362_.length; i_363_++) {
							int i_364_ = is_362_[i_363_];
							if (aShortArray6758 == null
									|| (aShortArray6758[i_364_] & i_356_) != 0) {
								Class322.anInt4311 += anIntArray6775[i_364_];
								Class78.anInt1052 += anIntArray6744[i_364_];
								Class318.anInt4225 += anIntArray6757[i_364_];
								i_359_++;
							}
						}
					}
				}
				if (i_359_ <= 0) {
					Class322.anInt4311 = i_353_;
					Class78.anInt1052 = i_354_;
					Class318.anInt4225 = i_355_;
				} else {
					Class78.anInt1052 = Class78.anInt1052 / i_359_ + i_354_;
					Class318.anInt4225 = i_355_ + Class318.anInt4225 / i_359_;
					Class75_Sub2.aBool7161 = true;
					Class322.anInt4311 = i_353_ + Class322.anInt4311 / i_359_;
				}
			} else if ((i ^ 0xffffffff) == -2) {
				if (is_357_ != null) {
					int i_365_ = ((8192 + i_355_ * is_357_[2] + is_357_[0]
							* i_353_ - -(i_354_ * is_357_[1])) >> 14);
					int i_366_ = ((8192 + i_355_ * is_357_[5] + i_353_
							* is_357_[3] - -(is_357_[4] * i_354_)) >> 14);
					int i_367_ = (8192 + (i_355_ * is_357_[8] + (i_354_
							* is_357_[7] + is_357_[6] * i_353_)) >> 14);
					i_353_ = i_365_;
					i_355_ = i_367_;
					i_354_ = i_366_;
				}
				i_354_ <<= 4;
				i_353_ <<= 4;
				i_355_ <<= 4;
				for (int i_368_ = 0; (i_368_ ^ 0xffffffff) > (i_358_ ^ 0xffffffff); i_368_++) {
					int i_369_ = is[i_368_];
					if ((i_369_ ^ 0xffffffff) > (anIntArrayArray6807.length ^ 0xffffffff)) {
						int[] is_370_ = anIntArrayArray6807[i_369_];
						for (int i_371_ = 0; ((i_371_ ^ 0xffffffff) > (is_370_.length ^ 0xffffffff)); i_371_++) {
							int i_372_ = is_370_[i_371_];
							if (aShortArray6758 == null
									|| (aShortArray6758[i_372_] & i_356_) != 0) {
								anIntArray6775[i_372_] += i_353_;
								anIntArray6744[i_372_] += i_354_;
								anIntArray6757[i_372_] += i_355_;
							}
						}
					}
				}
			} else if (i == 2) {
				if (is_357_ != null) {
					int i_373_ = is_357_[9] << 4;
					int i_374_ = is_357_[10] << 4;
					int i_375_ = is_357_[11] << 4;
					int i_376_ = is_357_[12] << 4;
					int i_377_ = is_357_[13] << 4;
					int i_378_ = is_357_[14] << 4;
					if (Class75_Sub2.aBool7161) {
						int i_379_ = (8192 + (is_357_[0] * Class322.anInt4311
								+ Class78.anInt1052 * is_357_[3] + is_357_[6]
								* Class318.anInt4225) >> 14);
						int i_380_ = ((is_357_[4] * Class78.anInt1052
								+ is_357_[1] * Class322.anInt4311
								+ Class318.anInt4225 * is_357_[7] + 8192) >> 14);
						int i_381_ = ((8192 + (is_357_[2] * Class322.anInt4311 - -(Class78.anInt1052 * is_357_[5])) - -(Class318.anInt4225 * is_357_[8])) >> 14);
						i_380_ += i_377_;
						i_379_ += i_376_;
						i_381_ += i_378_;
						Class78.anInt1052 = i_380_;
						Class322.anInt4311 = i_379_;
						Class75_Sub2.aBool7161 = false;
						Class318.anInt4225 = i_381_;
					}
					int[] is_382_ = new int[9];
					int i_383_ = Class335.anIntArray4430[i_353_];
					int i_384_ = Class335.anIntArray4436[i_353_];
					int i_385_ = Class335.anIntArray4430[i_354_];
					int i_386_ = Class335.anIntArray4436[i_354_];
					int i_387_ = Class335.anIntArray4430[i_355_];
					int i_388_ = Class335.anIntArray4436[i_355_];
					int i_389_ = 8192 + i_387_ * i_384_ >> 14;
					int i_390_ = i_388_ * i_384_ + 8192 >> 14;
					is_382_[5] = -i_384_;
					is_382_[1] = 8192 + (i_389_ * i_386_ + -i_385_ * i_388_) >> 14;
					is_382_[8] = i_385_ * i_383_ + 8192 >> 14;
					is_382_[6] = i_387_ * -i_386_ - (-(i_385_ * i_390_) - 8192) >> 14;
					is_382_[7] = i_386_ * i_388_ - (-(i_389_ * i_385_) - 8192) >> 14;
					is_382_[4] = 8192 + i_383_ * i_387_ >> 14;
					is_382_[2] = i_383_ * i_386_ + 8192 >> 14;
					is_382_[3] = i_383_ * i_388_ + 8192 >> 14;
					is_382_[0] = 8192 + i_386_ * i_390_ + i_385_ * i_387_ >> 14;
					int i_391_ = ((8192 + is_382_[0] * -Class322.anInt4311
							- -(-Class78.anInt1052 * is_382_[1]) + -Class318.anInt4225
							* is_382_[2]) >> 14);
					int i_392_ = ((is_382_[5] * -Class318.anInt4225
							+ is_382_[3] * -Class322.anInt4311 - (-(-Class78.anInt1052 * is_382_[4]) - 8192)) >> 14);
					int i_393_ = ((-Class322.anInt4311 * is_382_[6] + (-Class78.anInt1052
							* is_382_[7] + -Class318.anInt4225 * is_382_[8] + 8192)) >> 14);
					int i_394_ = i_391_ + Class322.anInt4311;
					int i_395_ = i_392_ + Class78.anInt1052;
					int i_396_ = Class318.anInt4225 + i_393_;
					int[] is_397_ = new int[9];
					for (int i_398_ = 0; i_398_ < 3; i_398_++) {
						for (int i_399_ = 0; i_399_ < 3; i_399_++) {
							int i_400_ = 0;
							for (int i_401_ = 0; (i_401_ ^ 0xffffffff) > -4; i_401_++)
								i_400_ += (is_382_[i_401_ + 3 * i_398_] * is_357_[i_401_
										+ 3 * i_399_]);
							is_397_[i_399_ + 3 * i_398_] = 8192 + i_400_ >> 14;
						}
					}
					int i_402_ = (8192 + is_382_[2] * i_378_
							+ (i_377_ * is_382_[1] + i_376_ * is_382_[0]) >> 14);
					int i_403_ = (is_382_[5]
							* i_378_
							+ (is_382_[4] * i_377_ + (is_382_[3] * i_376_ + 8192)) >> 14);
					i_403_ += i_395_;
					int i_404_ = ((8192 + is_382_[6] * i_376_ + (i_377_
							* is_382_[7] - -(i_378_ * is_382_[8]))) >> 14);
					i_402_ += i_394_;
					i_404_ += i_396_;
					int[] is_405_ = new int[9];
					for (int i_406_ = 0; (i_406_ ^ 0xffffffff) > -4; i_406_++) {
						for (int i_407_ = 0; i_407_ < 3; i_407_++) {
							int i_408_ = 0;
							for (int i_409_ = 0; i_409_ < 3; i_409_++)
								i_408_ += (is_357_[i_406_ * 3 + i_409_] * is_397_[i_407_
										+ 3 * i_409_]);
							is_405_[i_407_ + 3 * i_406_] = 8192 + i_408_ >> 14;
						}
					}
					int i_410_ = ((i_404_ * is_357_[2] + i_402_ * is_357_[0]
							- -(i_403_ * is_357_[1]) + 8192) >> 14);
					int i_411_ = (i_403_
							* is_357_[4]
							+ (i_402_ * is_357_[3] + i_404_ * is_357_[5] + 8192) >> 14);
					int i_412_ = ((8192 + (i_404_ * is_357_[8] + is_357_[7]
							* i_403_) + is_357_[6] * i_402_) >> 14);
					i_411_ += i_374_;
					i_410_ += i_373_;
					i_412_ += i_375_;
					for (int i_413_ = 0; i_358_ > i_413_; i_413_++) {
						int i_414_ = is[i_413_];
						if (anIntArrayArray6807.length > i_414_) {
							int[] is_415_ = anIntArrayArray6807[i_414_];
							for (int i_416_ = 0; ((is_415_.length ^ 0xffffffff) < (i_416_ ^ 0xffffffff)); i_416_++) {
								int i_417_ = is_415_[i_416_];
								if (aShortArray6758 == null
										|| (i_356_ & aShortArray6758[i_417_] ^ 0xffffffff) != -1) {
									int i_418_ = ((8192
											+ (anIntArray6757[i_417_] * is_405_[2])
											+ (is_405_[1] * anIntArray6744[i_417_]) + (is_405_[0] * anIntArray6775[i_417_])) >> 14);
									int i_419_ = ((8192 + ((anIntArray6757[i_417_] * is_405_[5])
											+ (is_405_[3] * anIntArray6775[i_417_]) - -(is_405_[4] * anIntArray6744[i_417_]))) >> 14);
									int i_420_ = ((anIntArray6757[i_417_]
											* is_405_[8]
											+ (is_405_[7] * anIntArray6744[i_417_]) + ((is_405_[6] * anIntArray6775[i_417_]) + 8192)) >> 14);
									i_418_ += i_410_;
									i_419_ += i_411_;
									anIntArray6775[i_417_] = i_418_;
									i_420_ += i_412_;
									anIntArray6744[i_417_] = i_419_;
									anIntArray6757[i_417_] = i_420_;
								}
							}
						}
					}
				} else {
					for (int i_421_ = 0; (i_358_ ^ 0xffffffff) < (i_421_ ^ 0xffffffff); i_421_++) {
						int i_422_ = is[i_421_];
						if (i_422_ < anIntArrayArray6807.length) {
							int[] is_423_ = anIntArrayArray6807[i_422_];
							for (int i_424_ = 0; ((i_424_ ^ 0xffffffff) > (is_423_.length ^ 0xffffffff)); i_424_++) {
								int i_425_ = is_423_[i_424_];
								if (aShortArray6758 == null
										|| ((i_356_ & aShortArray6758[i_425_]) != 0)) {
									anIntArray6775[i_425_] -= Class322.anInt4311;
									anIntArray6744[i_425_] -= Class78.anInt1052;
									anIntArray6757[i_425_] -= Class318.anInt4225;
									if ((i_355_ ^ 0xffffffff) != -1) {
										int i_426_ = Class335.anIntArray4436[i_355_];
										int i_427_ = Class335.anIntArray4430[i_355_];
										int i_428_ = ((16383 + (i_426_ * anIntArray6744[i_425_]) - -(anIntArray6775[i_425_] * i_427_)) >> 14);
										anIntArray6744[i_425_] = (16383 + (-(i_426_ * anIntArray6775[i_425_]) + (anIntArray6744[i_425_] * i_427_))) >> 14;
										anIntArray6775[i_425_] = i_428_;
									}
									if ((i_353_ ^ 0xffffffff) != -1) {
										int i_429_ = Class335.anIntArray4436[i_353_];
										int i_430_ = Class335.anIntArray4430[i_353_];
										int i_431_ = ((anIntArray6744[i_425_]
												* i_430_ + (-(i_429_ * anIntArray6757[i_425_]) + 16383)) >> 14);
										anIntArray6757[i_425_] = (anIntArray6744[i_425_]
												* i_429_ + ((i_430_ * anIntArray6757[i_425_]) + 16383)) >> 14;
										anIntArray6744[i_425_] = i_431_;
									}
									if ((i_354_ ^ 0xffffffff) != -1) {
										int i_432_ = Class335.anIntArray4436[i_354_];
										int i_433_ = Class335.anIntArray4430[i_354_];
										int i_434_ = (16383 + (anIntArray6775[i_425_] * i_433_) + (anIntArray6757[i_425_] * i_432_)) >> 14;
										anIntArray6757[i_425_] = (-(i_432_ * anIntArray6775[i_425_]) + ((i_433_ * anIntArray6757[i_425_]) + 16383)) >> 14;
										anIntArray6775[i_425_] = i_434_;
									}
									anIntArray6775[i_425_] += Class322.anInt4311;
									anIntArray6744[i_425_] += Class78.anInt1052;
									anIntArray6757[i_425_] += Class318.anInt4225;
								}
							}
						}
					}
					if (bool) {
						for (int i_435_ = 0; (i_358_ ^ 0xffffffff) < (i_435_ ^ 0xffffffff); i_435_++) {
							int i_436_ = is[i_435_];
							if ((i_436_ ^ 0xffffffff) > (anIntArrayArray6807.length ^ 0xffffffff)) {
								int[] is_437_ = anIntArrayArray6807[i_436_];
								for (int i_438_ = 0; ((is_437_.length ^ 0xffffffff) < (i_438_ ^ 0xffffffff)); i_438_++) {
									int i_439_ = is_437_[i_438_];
									if (aShortArray6758 == null
											|| ((aShortArray6758[i_439_] & i_356_) != 0)) {
										int i_440_ = anIntArray6763[i_439_];
										int i_441_ = anIntArray6763[i_439_ + 1];
										for (int i_442_ = i_440_; i_441_ > i_442_; i_442_++) {
											int i_443_ = aShortArray6764[i_442_] - 1;
											if (i_443_ == -1)
												break;
											if (i_355_ != 0) {
												int i_444_ = (Class335.anIntArray4436[i_355_]);
												int i_445_ = (Class335.anIntArray4430[i_355_]);
												int i_446_ = ((16383 + (i_445_ * (aShortArray6787[i_443_])) + (i_444_ * (aShortArray6727[i_443_]))) >> 14);
												aShortArray6727[i_443_] = (short) ((-(i_444_ * (aShortArray6787[i_443_]))
														+ (i_445_ * (aShortArray6727[i_443_])) + 16383) >> 14);
												aShortArray6787[i_443_] = (short) i_446_;
											}
											if (i_353_ != 0) {
												int i_447_ = (Class335.anIntArray4436[i_353_]);
												int i_448_ = (Class335.anIntArray4430[i_353_]);
												int i_449_ = ((aShortArray6727[i_443_] * i_448_) - ((i_447_ * (aShortArray6826[i_443_])) - 16383)) >> 14;
												aShortArray6826[i_443_] = (short) ((((aShortArray6826[i_443_]) * i_448_)
														+ ((aShortArray6727[i_443_]) * i_447_) + 16383) >> 14);
												aShortArray6727[i_443_] = (short) i_449_;
											}
											if (i_354_ != 0) {
												int i_450_ = (Class335.anIntArray4436[i_354_]);
												int i_451_ = (Class335.anIntArray4430[i_354_]);
												int i_452_ = ((16383 + ((aShortArray6787[i_443_])
														* i_451_ + ((aShortArray6826[i_443_]) * i_450_))) >> 14);
												aShortArray6826[i_443_] = (short) ((16383 + (-(i_450_ * (aShortArray6787[i_443_])) + ((aShortArray6826[i_443_]) * i_451_))) >> 14);
												aShortArray6787[i_443_] = (short) i_452_;
											}
										}
									}
								}
							}
						}
						if (aClass350_6724 == null && aClass350_6814 != null)
							((Class350) aClass350_6814).anInterface9_4613 = null;
						if (aClass350_6724 != null)
							((Class350) aClass350_6724).anInterface9_4613 = null;
					}
				}
			} else if (i == 3) {
				if (is_357_ != null) {
					int i_453_ = is_357_[9] << 4;
					int i_454_ = is_357_[10] << 4;
					int i_455_ = is_357_[11] << 4;
					int i_456_ = is_357_[12] << 4;
					int i_457_ = is_357_[13] << 4;
					int i_458_ = is_357_[14] << 4;
					if (Class75_Sub2.aBool7161) {
						int i_459_ = ((8192 + (Class78.anInt1052 * is_357_[3] + is_357_[0]
								* Class322.anInt4311) + Class318.anInt4225
								* is_357_[6]) >> 14);
						int i_460_ = ((8192 + is_357_[7] * Class318.anInt4225 + (is_357_[4]
								* Class78.anInt1052 + Class322.anInt4311
								* is_357_[1])) >> 14);
						i_459_ += i_456_;
						int i_461_ = ((Class322.anInt4311 * is_357_[2] + (Class78.anInt1052
								* is_357_[5] + (Class318.anInt4225 * is_357_[8] + 8192))) >> 14);
						i_460_ += i_457_;
						Class78.anInt1052 = i_460_;
						i_461_ += i_458_;
						Class322.anInt4311 = i_459_;
						Class75_Sub2.aBool7161 = false;
						Class318.anInt4225 = i_461_;
					}
					int i_462_ = i_353_ << 15 >> 7;
					int i_463_ = i_354_ << 15 >> 7;
					int i_464_ = i_355_ << 15 >> 7;
					int i_465_ = 8192 + -Class322.anInt4311 * i_462_ >> 14;
					int i_466_ = 8192 + -Class78.anInt1052 * i_463_ >> 14;
					int i_467_ = i_464_ * -Class318.anInt4225 + 8192 >> 14;
					int i_468_ = i_465_ + Class322.anInt4311;
					int i_469_ = i_466_ + Class78.anInt1052;
					int i_470_ = i_467_ + Class318.anInt4225;
					int[] is_471_ = new int[9];
					is_471_[2] = i_462_ * is_357_[6] + 8192 >> 14;
					is_471_[0] = 8192 + is_357_[0] * i_462_ >> 14;
					is_471_[1] = is_357_[3] * i_462_ + 8192 >> 14;
					is_471_[3] = i_463_ * is_357_[1] + 8192 >> 14;
					is_471_[4] = 8192 + is_357_[4] * i_463_ >> 14;
					is_471_[6] = is_357_[2] * i_464_ + 8192 >> 14;
					is_471_[5] = 8192 + is_357_[7] * i_463_ >> 14;
					is_471_[8] = is_357_[8] * i_464_ + 8192 >> 14;
					is_471_[7] = is_357_[5] * i_464_ + 8192 >> 14;
					int i_472_ = i_462_ * i_456_ + 8192 >> 14;
					int i_473_ = 8192 + i_457_ * i_463_ >> 14;
					i_473_ += i_469_;
					int i_474_ = i_464_ * i_458_ + 8192 >> 14;
					i_472_ += i_468_;
					i_474_ += i_470_;
					int[] is_475_ = new int[9];
					for (int i_476_ = 0; i_476_ < 3; i_476_++) {
						for (int i_477_ = 0; (i_477_ ^ 0xffffffff) > -4; i_477_++) {
							int i_478_ = 0;
							for (int i_479_ = 0; (i_479_ ^ 0xffffffff) > -4; i_479_++)
								i_478_ += (is_357_[i_479_ + 3 * i_476_] * is_471_[i_479_
										* 3 + i_477_]);
							is_475_[i_477_ + i_476_ * 3] = i_478_ + 8192 >> 14;
						}
					}
					int i_480_ = (is_357_[2]
							* i_474_
							+ (i_473_ * is_357_[1] + (is_357_[0] * i_472_ + 8192)) >> 14);
					int i_481_ = ((8192 + i_472_ * is_357_[3] + i_473_
							* is_357_[4] - -(i_474_ * is_357_[5])) >> 14);
					i_480_ += i_453_;
					i_481_ += i_454_;
					int i_482_ = ((is_357_[8] * i_474_ + i_473_ * is_357_[7]
							+ i_472_ * is_357_[6] + 8192) >> 14);
					i_482_ += i_455_;
					for (int i_483_ = 0; i_358_ > i_483_; i_483_++) {
						int i_484_ = is[i_483_];
						if ((i_484_ ^ 0xffffffff) > (anIntArrayArray6807.length ^ 0xffffffff)) {
							int[] is_485_ = anIntArrayArray6807[i_484_];
							for (int i_486_ = 0; i_486_ < is_485_.length; i_486_++) {
								int i_487_ = is_485_[i_486_];
								if (aShortArray6758 == null
										|| ((aShortArray6758[i_487_] & i_356_) != 0)) {
									int i_488_ = ((anIntArray6744[i_487_]
											* is_475_[1] + ((is_475_[0] * anIntArray6775[i_487_]) - (-(anIntArray6757[i_487_] * is_475_[2]) - 8192))) >> 14);
									int i_489_ = (8192 + (anIntArray6775[i_487_] * is_475_[3]) + ((anIntArray6744[i_487_] * is_475_[4]) - -(anIntArray6757[i_487_] * is_475_[5]))) >> 14;
									i_488_ += i_480_;
									int i_490_ = ((is_475_[8]
											* anIntArray6757[i_487_]
											+ (is_475_[7] * anIntArray6744[i_487_]) + ((is_475_[6] * anIntArray6775[i_487_]) + 8192)) >> 14);
									i_489_ += i_481_;
									anIntArray6775[i_487_] = i_488_;
									i_490_ += i_482_;
									anIntArray6744[i_487_] = i_489_;
									anIntArray6757[i_487_] = i_490_;
								}
							}
						}
					}
				} else {
					for (int i_491_ = 0; i_491_ < i_358_; i_491_++) {
						int i_492_ = is[i_491_];
						if ((i_492_ ^ 0xffffffff) > (anIntArrayArray6807.length ^ 0xffffffff)) {
							int[] is_493_ = anIntArrayArray6807[i_492_];
							for (int i_494_ = 0; ((i_494_ ^ 0xffffffff) > (is_493_.length ^ 0xffffffff)); i_494_++) {
								int i_495_ = is_493_[i_494_];
								if (aShortArray6758 == null
										|| ((i_356_ & aShortArray6758[i_495_]) != 0)) {
									anIntArray6775[i_495_] -= Class322.anInt4311;
									anIntArray6744[i_495_] -= Class78.anInt1052;
									anIntArray6757[i_495_] -= Class318.anInt4225;
									anIntArray6775[i_495_] = anIntArray6775[i_495_]
											* i_353_ >> 7;
									anIntArray6744[i_495_] = anIntArray6744[i_495_]
											* i_354_ >> 7;
									anIntArray6757[i_495_] = i_355_
											* anIntArray6757[i_495_] >> 7;
									anIntArray6775[i_495_] += Class322.anInt4311;
									anIntArray6744[i_495_] += Class78.anInt1052;
									anIntArray6757[i_495_] += Class318.anInt4225;
								}
							}
						}
					}
				}
			} else if ((i ^ 0xffffffff) == -6) {
				if (anIntArrayArray6745 != null) {
					for (int i_496_ = 0; (i_358_ ^ 0xffffffff) < (i_496_ ^ 0xffffffff); i_496_++) {
						int i_497_ = is[i_496_];
						if (anIntArrayArray6745.length > i_497_) {
							int[] is_498_ = anIntArrayArray6745[i_497_];
							for (int i_499_ = 0; is_498_.length > i_499_; i_499_++) {
								int i_500_ = is_498_[i_499_];
								if (aShortArray6756 == null
										|| ((aShortArray6756[i_500_] & i_356_) != 0)) {
									int i_501_ = (i_353_ * 8 + (aByteArray6735[i_500_] & 0xff));
									if (i_501_ >= 0) {
										if (i_501_ > 255)
											i_501_ = 255;
									} else
										i_501_ = 0;
									aByteArray6735[i_500_] = (byte) i_501_;
									if (aClass350_6814 != null)
										((Class350) aClass350_6814).anInterface9_4613 = null;
								}
							}
						}
					}
					if (aClass199Array6838 != null) {
						for (int i_502_ = 0; anInt6742 > i_502_; i_502_++) {
							Class199 class199 = aClass199Array6838[i_502_];
							Class330 class330 = aClass330Array6841[i_502_];
							((Class330) class330).anInt4382 = (255 + -(0xff & (aByteArray6735[(((Class199) class199).anInt2695)])) << 24 | (((Class330) class330).anInt4382 & 0xffffff));
						}
					}
				}
			} else if ((i ^ 0xffffffff) == -8) {
				if (anIntArrayArray6745 != null) {
					for (int i_503_ = 0; (i_358_ ^ 0xffffffff) < (i_503_ ^ 0xffffffff); i_503_++) {
						int i_504_ = is[i_503_];
						if (anIntArrayArray6745.length > i_504_) {
							int[] is_505_ = anIntArrayArray6745[i_504_];
							for (int i_506_ = 0; is_505_.length > i_506_; i_506_++) {
								int i_507_ = is_505_[i_506_];
								if (aShortArray6756 == null
										|| (aShortArray6756[i_507_] & i_356_ ^ 0xffffffff) != -1) {
									int i_508_ = 0xffff & aShortArray6753[i_507_];
									int i_509_ = 0x3f & i_508_ >> 10;
									int i_510_ = 0x7 & i_508_ >> 7;
									i_509_ = i_353_ + i_509_ & 0x3f;
									int i_511_ = i_508_ & 0x7f;
									i_510_ += i_354_ / 4;
									if (i_510_ < 0)
										i_510_ = 0;
									else if ((i_510_ ^ 0xffffffff) < -8)
										i_510_ = 7;
									i_511_ += i_355_;
									if (i_511_ >= 0) {
										if (i_511_ > 127)
											i_511_ = 127;
									} else
										i_511_ = 0;
									aShortArray6753[i_507_] = (short) (Class173
											.method1134(i_511_, (Class173
													.method1134(i_509_ << 10,
															i_510_ << 7))));
									if (aClass350_6814 != null)
										((Class350) aClass350_6814).anInterface9_4613 = null;
								}
							}
						}
					}
					if (aClass199Array6838 != null) {
						for (int i_512_ = 0; (anInt6742 ^ 0xffffffff) < (i_512_ ^ 0xffffffff); i_512_++) {
							Class199 class199 = aClass199Array6838[i_512_];
							Class330 class330 = aClass330Array6841[i_512_];
							((Class330) class330).anInt4382 = (((Class27.anIntArray359[aShortArray6753[(((Class199) class199).anInt2695)] & 0xffff]) & 0xffffff) | (((Class330) class330).anInt4382 & ~0xffffff));
						}
					}
				}
			} else if ((i ^ 0xffffffff) == -9) {
				if (anIntArrayArray6776 != null) {
					for (int i_513_ = 0; i_513_ < i_358_; i_513_++) {
						int i_514_ = is[i_513_];
						if (i_514_ < anIntArrayArray6776.length) {
							int[] is_515_ = anIntArrayArray6776[i_514_];
							for (int i_516_ = 0; is_515_.length > i_516_; i_516_++) {
								Class330 class330 = aClass330Array6841[is_515_[i_516_]];
								((Class330) class330).anInt4380 += i_353_;
								((Class330) class330).anInt4388 += i_354_;
							}
						}
					}
				}
			} else if (i == 10) {
				if (anIntArrayArray6776 != null) {
					for (int i_517_ = 0; i_358_ > i_517_; i_517_++) {
						int i_518_ = is[i_517_];
						if (i_518_ < anIntArrayArray6776.length) {
							int[] is_519_ = anIntArrayArray6776[i_518_];
							for (int i_520_ = 0; ((i_520_ ^ 0xffffffff) > (is_519_.length ^ 0xffffffff)); i_520_++) {
								Class330 class330 = aClass330Array6841[is_519_[i_520_]];
								((Class330) class330).anInt4384 = (((Class330) class330).anInt4384
										* i_353_ >> 7);
								((Class330) class330).anInt4379 = (((Class330) class330).anInt4379
										* i_354_ >> 7);
							}
						}
					}
				}
			} else if ((i ^ 0xffffffff) == -10) {
				if (anIntArrayArray6776 != null) {
					for (int i_521_ = 0; i_358_ > i_521_; i_521_++) {
						int i_522_ = is[i_521_];
						if ((i_522_ ^ 0xffffffff) > (anIntArrayArray6776.length ^ 0xffffffff)) {
							int[] is_523_ = anIntArrayArray6776[i_522_];
							for (int i_524_ = 0; ((is_523_.length ^ 0xffffffff) < (i_524_ ^ 0xffffffff)); i_524_++) {
								Class330 class330 = aClass330Array6841[is_523_[i_524_]];
								((Class330) class330).anInt4387 = (((Class330) class330).anInt4387
										+ i_353_ & 0x3fff);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("li.I(" + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_353_ + ','
					+ i_354_ + ',' + i_355_ + ',' + bool + ',' + i_356_ + ','
					+ (is_357_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void FA(int i) {
		try {
			anInt6786++;
			int i_525_ = Class335.anIntArray4436[i];
			int i_526_ = Class335.anIntArray4430[i];
			for (int i_527_ = 0; anInt6802 > i_527_; i_527_++) {
				int i_528_ = ((-(i_525_ * anIntArray6757[i_527_]) + i_526_
						* anIntArray6744[i_527_]) >> 14);
				anIntArray6757[i_527_] = (i_525_ * anIntArray6744[i_527_] + i_526_
						* anIntArray6757[i_527_]) >> 14;
				anIntArray6744[i_527_] = i_528_;
			}
			if (aClass350_6810 != null)
				((Class350) aClass350_6810).anInterface9_4613 = null;
			aBool6741 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.FA(" + i + ')');
		}
	}

	private final void method2779(int i) {
		do {
			try {
				anInt6747++;
				if (aBool6804) {
					aBool6804 = false;
					if (aClass110Array6798 == null
							&& aClass261Array6795 == null
							&& aClass199Array6838 == null) {
						if (anIntArray6775 != null
								&& !Class11_Sub2_Sub10.method3477(anInt6768,
										anInt6740, -72)) {
							if (aClass350_6810 == null
									|| (((Class350) aClass350_6810).anInterface9_4613) != null) {
								if (!aBool6741)
									method2775((byte) -127);
								anIntArray6775 = null;
							} else
								aBool6804 = true;
						}
						if (anIntArray6744 != null
								&& !Class11_Sub45_Sub7.method3450(false,
										anInt6740, anInt6768)) {
							if (aClass350_6810 != null
									&& (((Class350) aClass350_6810).anInterface9_4613) == null)
								aBool6804 = true;
							else {
								if (!aBool6741)
									method2775((byte) -126);
								anIntArray6744 = null;
							}
						}
						if (anIntArray6757 != null
								&& !(Class11_Sub45_Sub1_Sub1.method3864(
										(byte) -36, anInt6740, anInt6768))) {
							if (aClass350_6810 == null
									|| (((Class350) aClass350_6810).anInterface9_4613) != null) {
								if (!aBool6741)
									method2775((byte) -126);
								anIntArray6757 = null;
							} else
								aBool6804 = true;
						}
					}
					if (aShortArray6764 != null && anIntArray6775 == null
							&& anIntArray6744 == null && anIntArray6757 == null) {
						anIntArray6763 = null;
						aShortArray6764 = null;
					}
					if (aByteArray6830 != null
							&& !Class11_Sub45_Sub11.method3582(anInt6740,
									anInt6768, (byte) -27)) {
						if (aClass350_6724 == null) {
							if (aClass350_6814 != null
									&& (((Class350) aClass350_6814).anInterface9_4613) == null)
								aBool6804 = true;
							else {
								aByteArray6830 = null;
								aShortArray6787 = aShortArray6727 = aShortArray6826 = null;
							}
						} else if ((((Class350) aClass350_6724).anInterface9_4613) != null) {
							aByteArray6830 = null;
							aShortArray6787 = aShortArray6727 = aShortArray6826 = null;
						} else
							aBool6804 = true;
					}
					if (aShortArray6753 != null
							&& !Class11_Sub12_Sub4.method3721(-71, anInt6740,
									anInt6768)) {
						if (aClass350_6814 != null
								&& (((Class350) aClass350_6814).anInterface9_4613 == null))
							aBool6804 = true;
						else
							aShortArray6753 = null;
					}
					if (aByteArray6735 != null
							&& !Class249.method1585(anInt6740, anInt6768,
									-14976)) {
						if (aClass350_6814 == null
								|| (((Class350) aClass350_6814).anInterface9_4613 != null))
							aByteArray6735 = null;
						else
							aBool6804 = true;
					}
					if (aFloatArray6760 != null
							&& !Class320.method1946(anInt6740, anInt6768,
									(byte) 68)) {
						if (aClass350_6725 == null
								|| (((Class350) aClass350_6725).anInterface9_4613 != null))
							aFloatArray6760 = aFloatArray6769 = null;
						else
							aBool6804 = true;
					}
					if (aShortArray6812 != null
							&& !Class105.method691(anInt6740, anInt6768,
									(byte) 5)) {
						if (aClass350_6814 == null
								|| (((Class350) aClass350_6814).anInterface9_4613 != null))
							aShortArray6812 = null;
						else
							aBool6804 = true;
					}
					if (aShortArray6829 != null
							&& !Class11_Sub23_Sub2.method3754(anInt6740,
									anInt6768, (byte) -6)) {
						if ((aClass381_6808 != null && (((Class381) aClass381_6808).anInterface19_4961 == null))
								|| (aClass350_6814 != null && (((Class350) aClass350_6814).anInterface9_4613) == null))
							aBool6804 = true;
						else
							aShortArray6829 = aShortArray6800 = aShortArray6732 = null;
					}
					if (anIntArrayArray6745 != null
							&& !Class61.method470(anInt6740, (byte) -65,
									anInt6768)) {
						aShortArray6756 = null;
						anIntArrayArray6745 = null;
					}
					if (anIntArrayArray6807 != null
							&& !Class11_Sub45_Sub20_Sub1.method3895(12869,
									anInt6740, anInt6768)) {
						aShortArray6758 = null;
						anIntArrayArray6807 = null;
					}
					if (i == -1) {
						if (anIntArrayArray6776 != null
								&& !Class11_Sub8.method2338(i ^ 0x7d,
										anInt6740, anInt6768))
							anIntArrayArray6776 = null;
						if (anIntArray6752 == null
								|| (0x800 & anInt6768 ^ 0xffffffff) != -1
								|| (0x40000 & anInt6768 ^ 0xffffffff) != -1)
							break;
						anIntArray6752 = null;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "li.IA(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1329(Class33 class33, Class376_Sub4 class376_sub4, int i,
			int i_529_) {
		try {
			anInt6821++;
			if (anInt6820 != 0) {
				Class33_Sub1 class33_sub1 = ((Class163_Sub3) aClass163_Sub3_6791).aClass33_Sub1_8299;
				Class33_Sub1 class33_sub1_530_ = (Class33_Sub1) class33;
				if (!aBool6741)
					method2775((byte) -128);
				Class164.aFloat2132 = (((Class33_Sub1) class33_sub1).aFloat6168 + ((((Class33_Sub1) class33_sub1).aFloat6197 * ((Class33_Sub1) class33_sub1_530_).aFloat6201)
						+ (((Class33_Sub1) class33_sub1).aFloat6192 * ((Class33_Sub1) class33_sub1_530_).aFloat6191) + (((Class33_Sub1) class33_sub1).aFloat6174 * (((Class33_Sub1) class33_sub1_530_).aFloat6168))));
				Class286.aFloat3879 = ((((Class33_Sub1) class33_sub1_530_).aFloat6185 * ((Class33_Sub1) class33_sub1).aFloat6192)
						+ (((Class33_Sub1) class33_sub1).aFloat6197 * ((Class33_Sub1) class33_sub1_530_).aFloat6200) + (((Class33_Sub1) class33_sub1).aFloat6174 * ((Class33_Sub1) class33_sub1_530_).aFloat6192));
				float f = ((float) aShort6762 * Class286.aFloat3879 + Class164.aFloat2132);
				float f_531_ = (Class286.aFloat3879 * (float) aShort6782 + Class164.aFloat2132);
				float f_532_;
				float f_533_;
				if (f > f_531_) {
					f_533_ = f_531_ - (float) aShort6813;
					f_532_ = (float) aShort6813 + f;
				} else {
					f_532_ = f_531_ + (float) aShort6813;
					f_533_ = f - (float) aShort6813;
				}
				if (!(((Class163_Sub3) aClass163_Sub3_6791).aFloat8383 <= f_533_)
						&& !((float) (((Class163_Sub3) aClass163_Sub3_6791).anInt8390) >= f_532_)) {
					Class11_Sub23_Sub2.aFloat9521 = ((((Class33_Sub1) class33_sub1_530_).aFloat6200 * ((Class33_Sub1) class33_sub1).aFloat6164)
							+ (((Class33_Sub1) class33_sub1).aFloat6200 * ((Class33_Sub1) class33_sub1_530_).aFloat6185) + (((Class33_Sub1) class33_sub1_530_).aFloat6192 * ((Class33_Sub1) class33_sub1).aFloat6179));
					RuntimeException_Sub1.aFloat9966 = (((Class33_Sub1) class33_sub1).aFloat6201 + ((((Class33_Sub1) class33_sub1_530_).aFloat6191 * ((Class33_Sub1) class33_sub1).aFloat6200)
							+ (((Class33_Sub1) class33_sub1).aFloat6164 * (((Class33_Sub1) class33_sub1_530_).aFloat6201)) + (((Class33_Sub1) class33_sub1).aFloat6179 * (((Class33_Sub1) class33_sub1_530_).aFloat6168))));
					float f_534_ = (Class11_Sub23_Sub2.aFloat9521
							* (float) aShort6762 + RuntimeException_Sub1.aFloat9966);
					float f_535_ = (RuntimeException_Sub1.aFloat9966 + ((float) aShort6782 * Class11_Sub23_Sub2.aFloat9521));
					float f_536_;
					float f_537_;
					if (!(f_535_ < f_534_)) {
						f_536_ = ((float) (((Class163_Sub3) aClass163_Sub3_6791).anInt8393) * (f_534_ - (float) aShort6813));
						f_537_ = ((float) (((Class163_Sub3) aClass163_Sub3_6791).anInt8393) * ((float) aShort6813 + f_535_));
					} else {
						f_536_ = ((float) (((Class163_Sub3) aClass163_Sub3_6791).anInt8393) * (f_535_ - (float) aShort6813));
						f_537_ = ((f_534_ + (float) aShort6813) * (float) (((Class163_Sub3) aClass163_Sub3_6791).anInt8393));
					}
					if (!(((Class163_Sub3) aClass163_Sub3_6791).aFloat8326 <= f_536_
							/ (float) i)
							&& !(((Class163_Sub3) aClass163_Sub3_6791).aFloat8374 >= f_537_
									/ (float) i)) {
						Class375.aFloat4896 = ((((Class33_Sub1) class33_sub1_530_).aFloat6168 * ((Class33_Sub1) class33_sub1).aFloat6183)
								+ (((((Class33_Sub1) class33_sub1_530_).aFloat6201) * ((Class33_Sub1) class33_sub1).aFloat6162) + ((((Class33_Sub1) class33_sub1_530_).aFloat6191) * (((Class33_Sub1) class33_sub1).aFloat6185))) + ((Class33_Sub1) class33_sub1).aFloat6191);
						Class230.aFloat3155 = ((((Class33_Sub1) class33_sub1).aFloat6162 * (((Class33_Sub1) class33_sub1_530_).aFloat6200))
								+ (((Class33_Sub1) class33_sub1).aFloat6185 * (((Class33_Sub1) class33_sub1_530_).aFloat6185)) + (((Class33_Sub1) class33_sub1).aFloat6183 * (((Class33_Sub1) class33_sub1_530_).aFloat6192)));
						float f_538_ = ((float) aShort6762
								* Class230.aFloat3155 + Class375.aFloat4896);
						float f_539_ = (Class375.aFloat4896 + Class230.aFloat3155
								* (float) aShort6782);
						float f_540_;
						float f_541_;
						if (!(f_538_ > f_539_)) {
							f_541_ = ((float) ((Class163_Sub3) aClass163_Sub3_6791).anInt8327 * (f_538_ - (float) aShort6813));
							f_540_ = ((float) ((Class163_Sub3) aClass163_Sub3_6791).anInt8327 * (f_539_ + (float) aShort6813));
						} else {
							f_540_ = ((float) ((Class163_Sub3) aClass163_Sub3_6791).anInt8327 * ((float) aShort6813 + f_538_));
							f_541_ = ((f_539_ - (float) aShort6813) * (float) ((Class163_Sub3) aClass163_Sub3_6791).anInt8327);
						}
						if (!(f_541_ / (float) i >= (((Class163_Sub3) aClass163_Sub3_6791).aFloat8331))
								&& !((((Class163_Sub3) aClass163_Sub3_6791).aFloat8315) >= f_540_
										/ (float) i)) {
							if (class376_sub4 != null
									|| aClass199Array6838 != null) {
								Class11_Sub45_Sub1_Sub1.aFloat9835 = (((((Class33_Sub1) class33_sub1_530_).aFloat6197) * (((Class33_Sub1) class33_sub1).aFloat6183)) + (((((Class33_Sub1) class33_sub1).aFloat6162) * ((Class33_Sub1) class33_sub1_530_).aFloat6164) + ((((Class33_Sub1) class33_sub1).aFloat6185) * (((Class33_Sub1) class33_sub1_530_).aFloat6162))));
								Class326.aFloat4352 = (((((Class33_Sub1) class33_sub1).aFloat6179) * (((Class33_Sub1) class33_sub1_530_).aFloat6174)) + (((((Class33_Sub1) class33_sub1_530_).aFloat6183) * (((Class33_Sub1) class33_sub1).aFloat6200)) + (((Class33_Sub1) class33_sub1_530_).aFloat6179 * (((Class33_Sub1) class33_sub1).aFloat6164))));
								Class272.aFloat3676 = (((((Class33_Sub1) class33_sub1_530_).aFloat6179) * (((Class33_Sub1) class33_sub1).aFloat6162))
										+ ((((Class33_Sub1) class33_sub1_530_).aFloat6183) * (((Class33_Sub1) class33_sub1).aFloat6185)) + ((((Class33_Sub1) class33_sub1).aFloat6183) * (((Class33_Sub1) class33_sub1_530_).aFloat6174)));
								Class82.aFloat1128 = (((((Class33_Sub1) class33_sub1_530_).aFloat6164) * (((Class33_Sub1) class33_sub1).aFloat6197))
										+ ((((Class33_Sub1) class33_sub1_530_).aFloat6162) * (((Class33_Sub1) class33_sub1).aFloat6192)) + ((((Class33_Sub1) class33_sub1).aFloat6174) * (((Class33_Sub1) class33_sub1_530_).aFloat6197)));
								Class142.aFloat1927 = (((((Class33_Sub1) class33_sub1_530_).aFloat6197) * (((Class33_Sub1) class33_sub1).aFloat6179)) + (((((Class33_Sub1) class33_sub1_530_).aFloat6164) * (((Class33_Sub1) class33_sub1).aFloat6164)) + ((((Class33_Sub1) class33_sub1).aFloat6200) * (((Class33_Sub1) class33_sub1_530_).aFloat6162))));
								Class2_Sub10.aFloat7924 = (((((Class33_Sub1) class33_sub1_530_).aFloat6174) * (((Class33_Sub1) class33_sub1).aFloat6174)) + (((((Class33_Sub1) class33_sub1).aFloat6197) * ((Class33_Sub1) class33_sub1_530_).aFloat6179) + (((Class33_Sub1) class33_sub1_530_).aFloat6183 * (((Class33_Sub1) class33_sub1).aFloat6192))));
							}
							if (class376_sub4 != null) {
								int i_542_ = aShort6739 + aShort6817 >> 1;
								int i_543_ = aShort6822 + aShort6824 >> 1;
								int i_544_ = (int) (((float) i_543_ * Class326.aFloat4352) + (((float) i_542_ * Class142.aFloat1927)
										+ (RuntimeException_Sub1.aFloat9966) + ((Class11_Sub23_Sub2.aFloat9521) * (float) aShort6762)));
								int i_545_ = (int) (((float) i_542_ * (Class11_Sub45_Sub1_Sub1.aFloat9835))
										+ Class375.aFloat4896
										+ (Class230.aFloat3155 * (float) aShort6762) + ((float) i_543_ * Class272.aFloat3676));
								int i_546_ = (int) ((Class82.aFloat1128 * (float) i_542_)
										+ Class164.aFloat2132
										+ ((float) aShort6762 * Class286.aFloat3879) + ((float) i_543_ * Class2_Sub10.aFloat7924));
								int i_547_ = (int) ((Class326.aFloat4352 * (float) i_543_) + ((Class11_Sub23_Sub2.aFloat9521 * (float) aShort6782) + (((float) i_542_ * Class142.aFloat1927) + (RuntimeException_Sub1.aFloat9966))));
								int i_548_ = (int) (((float) i_543_ * Class272.aFloat3676) + (Class375.aFloat4896
										+ ((Class11_Sub45_Sub1_Sub1.aFloat9835) * (float) i_542_) + ((float) aShort6782 * Class230.aFloat3155)));
								((Class376_Sub4) class376_sub4).anInt6122 = (i_544_
										* (((Class163_Sub3) aClass163_Sub3_6791).anInt8393)
										/ i + (((Class163_Sub3) aClass163_Sub3_6791).anInt8367));
								((Class376_Sub4) class376_sub4).anInt6123 = ((((Class163_Sub3) aClass163_Sub3_6791).anInt8384) + i_545_
										* (((Class163_Sub3) aClass163_Sub3_6791).anInt8327)
										/ i);
								((Class376_Sub4) class376_sub4).anInt6127 = ((((Class163_Sub3) aClass163_Sub3_6791).anInt8393)
										* i_547_ / i + (((Class163_Sub3) aClass163_Sub3_6791).anInt8367));
								((Class376_Sub4) class376_sub4).anInt6126 = ((((Class163_Sub3) aClass163_Sub3_6791).anInt8327)
										* i_548_ / i + (((Class163_Sub3) aClass163_Sub3_6791).anInt8384));
								int i_549_ = (int) ((Class2_Sub10.aFloat7924 * (float) i_543_) + (Class164.aFloat2132
										+ ((float) i_542_ * Class82.aFloat1128) + (Class286.aFloat3879 * (float) aShort6782)));
								if (((i_546_ ^ 0xffffffff) <= ((((Class163_Sub3) aClass163_Sub3_6791).anInt8390) ^ 0xffffffff))
										|| ((i_549_ ^ 0xffffffff) <= (((Class163_Sub3) aClass163_Sub3_6791).anInt8390 ^ 0xffffffff))) {
									((Class376_Sub4) class376_sub4).aBool6124 = true;
									((Class376_Sub4) class376_sub4).anInt6125 = (-(((Class376_Sub4) class376_sub4).anInt6122)
											+ ((Class163_Sub3) aClass163_Sub3_6791).anInt8367 - -(((Class163_Sub3) aClass163_Sub3_6791).anInt8393
											* (i_544_ - -aShort6813) / i));
								}
							}
							aClass163_Sub3_6791.method3321((float) i,
									(byte) -124);
							aClass163_Sub3_6791.method3279(-17);
							aClass163_Sub3_6791.method3262((byte) 93,
									class33_sub1_530_);
							method2777((byte) 117);
							aClass163_Sub3_6791.method3247(-127);
							method2776(7);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("li.BB("
					+ (class33 != null ? "{...}" : "null") + ','
					+ (class376_sub4 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_529_ + ')'));
		}
	}

	final int V() {
		try {
			if (!aBool6741)
				method2775((byte) -128);
			anInt6774++;
			return aShort6739;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.V(" + ')');
		}
	}

	final boolean method1328() {
		try {
			anInt6783++;
			if (aShortArray6812 == null)
				return true;
			for (int i = 0; aShortArray6812.length > i; i++) {
				if ((aShortArray6812[i] ^ 0xffffffff) != 0
						&& !((Class163) aClass163_Sub3_6791).anInterface1_2118
								.method2(aShortArray6812[i], 69))
					return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.TA(" + ')');
		}
	}

	final Class11_Sub45_Sub1 ba(Class11_Sub45_Sub1 class11_sub45_sub1) {
		try {
			anInt6770++;
			if (anInt6820 == 0)
				return null;
			if (!aBool6741)
				method2775((byte) -126);
			int i;
			int i_550_;
			if (((Class163_Sub3) aClass163_Sub3_6791).anInt8362 > 0) {
				i = ((aShort6739 + -((aShort6782 * ((Class163_Sub3) aClass163_Sub3_6791).anInt8362) >> 8)) >> ((Class163_Sub3) aClass163_Sub3_6791).anInt8269);
				i_550_ = (-((((Class163_Sub3) aClass163_Sub3_6791).anInt8362 * aShort6762) >> 8)
						+ aShort6817 >> ((Class163_Sub3) aClass163_Sub3_6791).anInt8269);
			} else {
				i = (-((aShort6762 * ((Class163_Sub3) aClass163_Sub3_6791).anInt8362) >> 8)
						+ aShort6739 >> ((Class163_Sub3) aClass163_Sub3_6791).anInt8269);
				i_550_ = (aShort6817
						- ((((Class163_Sub3) aClass163_Sub3_6791).anInt8362)
								* aShort6782 >> 8) >> ((Class163_Sub3) aClass163_Sub3_6791).anInt8269);
			}
			int i_551_;
			int i_552_;
			if (((Class163_Sub3) aClass163_Sub3_6791).anInt8339 <= 0) {
				i_551_ = (-((aShort6762 * ((Class163_Sub3) aClass163_Sub3_6791).anInt8339) >> 8)
						+ aShort6822 >> ((Class163_Sub3) aClass163_Sub3_6791).anInt8269);
				i_552_ = (aShort6824
						- ((((Class163_Sub3) aClass163_Sub3_6791).anInt8339)
								* aShort6782 >> 8) >> ((Class163_Sub3) aClass163_Sub3_6791).anInt8269);
			} else {
				i_551_ = (-((aShort6782 * ((Class163_Sub3) aClass163_Sub3_6791).anInt8339) >> 8)
						+ aShort6822 >> ((Class163_Sub3) aClass163_Sub3_6791).anInt8269);
				i_552_ = (-((((Class163_Sub3) aClass163_Sub3_6791).anInt8339 * aShort6762) >> 8)
						+ aShort6824 >> ((Class163_Sub3) aClass163_Sub3_6791).anInt8269);
			}
			int i_553_ = -i + i_550_ + 1;
			int i_554_ = -i_551_ + (i_552_ + 1);
			Class11_Sub45_Sub1_Sub2 class11_sub45_sub1_sub2 = (Class11_Sub45_Sub1_Sub2) class11_sub45_sub1;
			Class11_Sub45_Sub1_Sub2 class11_sub45_sub1_sub2_555_;
			if (class11_sub45_sub1_sub2 == null
					|| !class11_sub45_sub1_sub2.method3874(i_554_, i_553_,
							(byte) -37))
				class11_sub45_sub1_sub2_555_ = new Class11_Sub45_Sub1_Sub2(
						aClass163_Sub3_6791, i_553_, i_554_);
			else {
				class11_sub45_sub1_sub2_555_ = class11_sub45_sub1_sub2;
				class11_sub45_sub1_sub2_555_.method3877(84);
			}
			class11_sub45_sub1_sub2_555_.method3875(i, i_552_, 0, i_550_,
					i_551_);
			method2782(class11_sub45_sub1_sub2_555_, (byte) -72);
			return class11_sub45_sub1_sub2_555_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.ba("
					+ (class11_sub45_sub1 != null ? "{...}" : "null") + ')');
		}
	}

	final int ma() {
		try {
			anInt6796++;
			if (!aBool6741)
				method2775((byte) -128);
			return aShort6780;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.ma(" + ')');
		}
	}

	final int da() {
		try {
			anInt6761++;
			return aShort6805;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.da(" + ')');
		}
	}

	private final boolean method2780(int i, Class33 class33, int i_556_,
			boolean bool, int i_557_, int i_558_, int i_559_) {
		try {
			anInt6743++;
			Class33_Sub1 class33_sub1 = (Class33_Sub1) class33;
			Class33_Sub1 class33_sub1_560_ = ((Class163_Sub3) aClass163_Sub3_6791).aClass33_Sub1_8299;
			float f = ((((Class33_Sub1) class33_sub1_560_).aFloat6179 * ((Class33_Sub1) class33_sub1).aFloat6168)
					+ ((((Class33_Sub1) class33_sub1).aFloat6191 * ((Class33_Sub1) class33_sub1_560_).aFloat6200) + (((Class33_Sub1) class33_sub1_560_).aFloat6164 * ((Class33_Sub1) class33_sub1).aFloat6201)) + ((Class33_Sub1) class33_sub1_560_).aFloat6201);
			float f_561_ = (((Class33_Sub1) class33_sub1_560_).aFloat6191 + ((((Class33_Sub1) class33_sub1_560_).aFloat6162 * ((Class33_Sub1) class33_sub1).aFloat6201)
					+ (((Class33_Sub1) class33_sub1_560_).aFloat6185 * ((Class33_Sub1) class33_sub1).aFloat6191) + (((Class33_Sub1) class33_sub1_560_).aFloat6183 * ((Class33_Sub1) class33_sub1).aFloat6168)));
			Class272.aFloat3676 = ((((Class33_Sub1) class33_sub1_560_).aFloat6185 * ((Class33_Sub1) class33_sub1).aFloat6183)
					+ (((Class33_Sub1) class33_sub1).aFloat6179 * ((Class33_Sub1) class33_sub1_560_).aFloat6162) + (((Class33_Sub1) class33_sub1_560_).aFloat6183 * ((Class33_Sub1) class33_sub1).aFloat6174));
			float f_562_ = (((Class33_Sub1) class33_sub1_560_).aFloat6168 + ((((Class33_Sub1) class33_sub1).aFloat6168 * ((Class33_Sub1) class33_sub1_560_).aFloat6174) + ((((Class33_Sub1) class33_sub1_560_).aFloat6192 * ((Class33_Sub1) class33_sub1).aFloat6191) + (((Class33_Sub1) class33_sub1_560_).aFloat6197 * ((Class33_Sub1) class33_sub1).aFloat6201))));
			Class142.aFloat1927 = ((((Class33_Sub1) class33_sub1).aFloat6197 * ((Class33_Sub1) class33_sub1_560_).aFloat6179) + ((((Class33_Sub1) class33_sub1).aFloat6162 * ((Class33_Sub1) class33_sub1_560_).aFloat6200) + (((Class33_Sub1) class33_sub1).aFloat6164 * ((Class33_Sub1) class33_sub1_560_).aFloat6164)));
			Class326.aFloat4352 = ((((Class33_Sub1) class33_sub1_560_).aFloat6179 * ((Class33_Sub1) class33_sub1).aFloat6174) + ((((Class33_Sub1) class33_sub1_560_).aFloat6200 * ((Class33_Sub1) class33_sub1).aFloat6183) + (((Class33_Sub1) class33_sub1_560_).aFloat6164 * ((Class33_Sub1) class33_sub1).aFloat6179)));
			Class286.aFloat3879 = ((((Class33_Sub1) class33_sub1).aFloat6200 * ((Class33_Sub1) class33_sub1_560_).aFloat6197)
					+ (((Class33_Sub1) class33_sub1).aFloat6185 * ((Class33_Sub1) class33_sub1_560_).aFloat6192) + (((Class33_Sub1) class33_sub1).aFloat6192 * ((Class33_Sub1) class33_sub1_560_).aFloat6174));
			Class11_Sub23_Sub2.aFloat9521 = ((((Class33_Sub1) class33_sub1).aFloat6192 * ((Class33_Sub1) class33_sub1_560_).aFloat6179) + ((((Class33_Sub1) class33_sub1_560_).aFloat6200 * ((Class33_Sub1) class33_sub1).aFloat6185) + (((Class33_Sub1) class33_sub1_560_).aFloat6164 * ((Class33_Sub1) class33_sub1).aFloat6200)));
			Class2_Sub10.aFloat7924 = ((((Class33_Sub1) class33_sub1).aFloat6179 * ((Class33_Sub1) class33_sub1_560_).aFloat6197)
					+ (((Class33_Sub1) class33_sub1).aFloat6183 * ((Class33_Sub1) class33_sub1_560_).aFloat6192) + (((Class33_Sub1) class33_sub1).aFloat6174 * ((Class33_Sub1) class33_sub1_560_).aFloat6174));
			Class11_Sub45_Sub1_Sub1.aFloat9835 = ((((Class33_Sub1) class33_sub1_560_).aFloat6183 * ((Class33_Sub1) class33_sub1).aFloat6197) + ((((Class33_Sub1) class33_sub1).aFloat6162 * ((Class33_Sub1) class33_sub1_560_).aFloat6185) + (((Class33_Sub1) class33_sub1_560_).aFloat6162 * ((Class33_Sub1) class33_sub1).aFloat6164)));
			Class230.aFloat3155 = ((((Class33_Sub1) class33_sub1).aFloat6192 * ((Class33_Sub1) class33_sub1_560_).aFloat6183) + ((((Class33_Sub1) class33_sub1).aFloat6185 * ((Class33_Sub1) class33_sub1_560_).aFloat6185) + (((Class33_Sub1) class33_sub1).aFloat6200 * ((Class33_Sub1) class33_sub1_560_).aFloat6162)));
			Class82.aFloat1128 = ((((Class33_Sub1) class33_sub1_560_).aFloat6192 * ((Class33_Sub1) class33_sub1).aFloat6162)
					+ (((Class33_Sub1) class33_sub1).aFloat6164 * ((Class33_Sub1) class33_sub1_560_).aFloat6197) + (((Class33_Sub1) class33_sub1_560_).aFloat6174 * ((Class33_Sub1) class33_sub1).aFloat6197));
			boolean bool_563_ = false;
			float f_564_ = 3.4028235E38F;
			float f_565_ = -3.4028235E38F;
			float f_566_ = 3.4028235E38F;
			float f_567_ = -3.4028235E38F;
			int i_568_ = ((Class163_Sub3) aClass163_Sub3_6791).anInt8393;
			int i_569_ = ((Class163_Sub3) aClass163_Sub3_6791).anInt8327;
			if (!aBool6741)
				method2775((byte) -126);
			int i_570_ = -aShort6739 + aShort6817 >> 1;
			int i_571_ = -aShort6762 + aShort6782 >> 1;
			int i_572_ = aShort6824 + -aShort6822 >> 1;
			int i_573_ = aShort6739 + i_570_;
			int i_574_ = i_571_ + aShort6762;
			int i_575_ = i_572_ + aShort6822;
			int i_576_ = i_573_ - (i_570_ << i_556_);
			int i_577_ = i_574_ + -(i_571_ << i_556_);
			int i_578_ = i_575_ + -(i_572_ << i_556_);
			int i_579_ = (i_570_ << i_556_) + i_573_;
			int i_580_ = i_574_ - -(i_571_ << i_556_);
			Class237.anIntArray3239[0] = i_576_;
			int i_581_ = (i_572_ << i_556_) + i_575_;
			Class62.anIntArray905[0] = i_577_;
			Class237.anIntArray3239[1] = i_579_;
			Class11_Sub45_Sub20_Sub2.anIntArray10220[0] = i_578_;
			Class62.anIntArray905[i_559_] = i_577_;
			Class11_Sub45_Sub20_Sub2.anIntArray10220[1] = i_578_;
			Class237.anIntArray3239[2] = i_576_;
			Class62.anIntArray905[2] = i_580_;
			Class237.anIntArray3239[3] = i_579_;
			Class11_Sub45_Sub20_Sub2.anIntArray10220[2] = i_578_;
			Class62.anIntArray905[3] = i_580_;
			Class237.anIntArray3239[4] = i_576_;
			Class11_Sub45_Sub20_Sub2.anIntArray10220[3] = i_578_;
			Class62.anIntArray905[4] = i_577_;
			Class11_Sub45_Sub20_Sub2.anIntArray10220[4] = i_581_;
			Class237.anIntArray3239[5] = i_579_;
			Class62.anIntArray905[5] = i_577_;
			Class237.anIntArray3239[6] = i_576_;
			Class11_Sub45_Sub20_Sub2.anIntArray10220[5] = i_581_;
			Class62.anIntArray905[6] = i_580_;
			Class11_Sub45_Sub20_Sub2.anIntArray10220[6] = i_581_;
			Class237.anIntArray3239[7] = i_579_;
			Class62.anIntArray905[7] = i_580_;
			Class11_Sub45_Sub20_Sub2.anIntArray10220[7] = i_581_;
			for (int i_582_ = 0; (i_582_ ^ 0xffffffff) > -9; i_582_++) {
				float f_583_ = (float) Class11_Sub45_Sub20_Sub2.anIntArray10220[i_582_];
				float f_584_ = (float) Class62.anIntArray905[i_582_];
				float f_585_ = (float) Class237.anIntArray3239[i_582_];
				float f_586_ = f_561_
						+ (Class272.aFloat3676 * f_583_ + (Class11_Sub45_Sub1_Sub1.aFloat9835
								* f_585_ + Class230.aFloat3155 * f_584_));
				float f_587_ = (Class11_Sub23_Sub2.aFloat9521 * f_584_ + f_585_
						* Class142.aFloat1927 + f_583_ * Class326.aFloat4352 + f);
				float f_588_ = (Class82.aFloat1128 * f_585_
						+ Class286.aFloat3879 * f_584_ + f_583_
						* Class2_Sub10.aFloat7924 + f_562_);
				if (f_588_ >= (float) (((Class163_Sub3) aClass163_Sub3_6791).anInt8390)) {
					if ((i_557_ ^ 0xffffffff) < -1)
						f_588_ = (float) i_557_;
					float f_589_ = ((float) i_568_ * f_587_ / f_588_ + (float) (((Class163_Sub3) aClass163_Sub3_6791).anInt8367));
					float f_590_ = ((float) i_569_ * f_586_ / f_588_ + (float) (((Class163_Sub3) aClass163_Sub3_6791).anInt8384));
					if (f_589_ < f_564_)
						f_564_ = f_589_;
					if (f_589_ > f_565_)
						f_565_ = f_589_;
					if (f_590_ < f_566_)
						f_566_ = f_590_;
					bool_563_ = true;
					if (f_590_ > f_567_)
						f_567_ = f_590_;
				}
			}
			if (bool_563_ && (float) i > f_564_ && f_565_ > (float) i
					&& (float) i_558_ > f_566_ && f_567_ > (float) i_558_) {
				if (bool)
					return true;
				if (anInt6820 > (((Class163_Sub3) aClass163_Sub3_6791).anIntArray8422).length) {
					((Class163_Sub3) aClass163_Sub3_6791).anIntArray8422 = new int[anInt6820];
					((Class163_Sub3) aClass163_Sub3_6791).anIntArray8420 = new int[anInt6820];
				}
				int[] is = ((Class163_Sub3) aClass163_Sub3_6791).anIntArray8422;
				int[] is_591_ = ((Class163_Sub3) aClass163_Sub3_6791).anIntArray8420;
				for (int i_592_ = 0; (i_592_ ^ 0xffffffff) > (anInt6802 ^ 0xffffffff); i_592_++) {
					float f_593_ = (float) anIntArray6757[i_592_];
					float f_594_ = (float) anIntArray6744[i_592_];
					float f_595_ = (float) anIntArray6775[i_592_];
					float f_596_ = (Class11_Sub23_Sub2.aFloat9521 * f_594_
							+ f_595_ * Class142.aFloat1927 + f_593_
							* Class326.aFloat4352 + f);
					float f_597_ = (f_594_ * Class230.aFloat3155
							+ Class11_Sub45_Sub1_Sub1.aFloat9835 * f_595_
							+ f_593_ * Class272.aFloat3676 + f_561_);
					float f_598_ = (f_593_
							* Class2_Sub10.aFloat7924
							+ (Class286.aFloat3879 * f_594_ + Class82.aFloat1128
									* f_595_) + f_562_);
					if (!((float) (((Class163_Sub3) aClass163_Sub3_6791).anInt8390) <= f_598_)) {
						int i_599_ = anIntArray6763[i_592_];
						int i_600_ = anIntArray6763[1 + i_592_];
						for (int i_601_ = i_599_; (i_600_ ^ 0xffffffff) < (i_601_ ^ 0xffffffff); i_601_++) {
							int i_602_ = -1 + aShortArray6764[i_601_];
							if (i_602_ == -1)
								break;
							is[-1 + aShortArray6764[i_601_]] = -999999;
						}
					} else {
						if (i_557_ > 0)
							f_598_ = (float) i_557_;
						int i_603_ = (int) ((float) i_568_ * f_596_ / f_598_ + (float) (((Class163_Sub3) aClass163_Sub3_6791).anInt8367));
						int i_604_ = (int) ((float) ((Class163_Sub3) aClass163_Sub3_6791).anInt8384 + f_597_
								* (float) i_569_ / f_598_);
						int i_605_ = anIntArray6763[i_592_];
						int i_606_ = anIntArray6763[i_592_ + 1];
						for (int i_607_ = i_605_; i_606_ > i_607_; i_607_++) {
							int i_608_ = -1 + aShortArray6764[i_607_];
							if ((i_608_ ^ 0xffffffff) == 0)
								break;
							is[i_608_] = i_603_;
							is_591_[i_608_] = i_604_;
						}
					}
				}
				for (int i_609_ = 0; (anInt6792 ^ 0xffffffff) < (i_609_ ^ 0xffffffff); i_609_++) {
					if (is[aShortArray6829[i_609_]] != -999999
							&& (is[aShortArray6800[i_609_]] ^ 0xffffffff) != 999998
							&& (is[aShortArray6732[i_609_]] ^ 0xffffffff) != 999998
							&& method2783(is_591_[aShortArray6800[i_609_]], i,
									is[aShortArray6829[i_609_]],
									is[aShortArray6732[i_609_]], i_559_ - 111,
									i_558_, is_591_[aShortArray6732[i_609_]],
									is[aShortArray6800[i_609_]],
									is_591_[aShortArray6829[i_609_]]))
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("li.L(" + i + ','
					+ (class33 != null ? "{...}" : "null") + ',' + i_556_ + ','
					+ bool + ',' + i_557_ + ',' + i_558_ + ',' + i_559_ + ')'));
		}
	}

	private final short method2781(float f, float f_610_, int i, int i_611_,
			int i_612_, int i_613_, long l, int i_614_, Class179 class179,
			int i_615_) {
		try {
			anInt6746++;
			int i_616_ = anIntArray6763[i_612_];
			int i_617_ = anIntArray6763[i_612_ + 1];
			int i_618_ = 0;
			if (i_613_ > -59)
				anInt6742 = -126;
			for (int i_619_ = i_616_; (i_619_ ^ 0xffffffff) > (i_617_ ^ 0xffffffff); i_619_++) {
				short i_620_ = aShortArray6764[i_619_];
				if ((i_620_ ^ 0xffffffff) == -1) {
					i_618_ = i_619_;
					break;
				}
				if (l == Class11_Sub8.aLongArray5309[i_619_])
					return (short) (-1 + i_620_);
			}
			aShortArray6764[i_618_] = (short) (anInt6820 + 1);
			Class11_Sub8.aLongArray5309[i_618_] = l;
			aShortArray6787[anInt6820] = (short) i_614_;
			aShortArray6727[anInt6820] = (short) i_615_;
			aShortArray6826[anInt6820] = (short) i;
			aByteArray6830[anInt6820] = (byte) i_611_;
			aFloatArray6760[anInt6820] = f_610_;
			aFloatArray6769[anInt6820] = f;
			return (short) anInt6820++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("li.K(" + f + ',' + f_610_ + ',' + i + ',' + i_611_ + ','
							+ i_612_ + ',' + i_613_ + ',' + l + ',' + i_614_
							+ ',' + (class179 != null ? "{...}" : "null") + ','
							+ i_615_ + ')'));
		}
	}

	private final void method2782(
			Class11_Sub45_Sub1_Sub2 class11_sub45_sub1_sub2, byte i) {
		try {
			anInt6819++;
			if ((((Class163_Sub3) aClass163_Sub3_6791).anIntArray8422.length ^ 0xffffffff) > (anInt6820 ^ 0xffffffff)) {
				((Class163_Sub3) aClass163_Sub3_6791).anIntArray8420 = new int[anInt6820];
				((Class163_Sub3) aClass163_Sub3_6791).anIntArray8422 = new int[anInt6820];
			}
			if (i > -59)
				anIntArray6744 = null;
			int[] is = ((Class163_Sub3) aClass163_Sub3_6791).anIntArray8422;
			int[] is_621_ = ((Class163_Sub3) aClass163_Sub3_6791).anIntArray8420;
			for (int i_622_ = 0; anInt6802 > i_622_; i_622_++) {
				int i_623_ = ((-((anIntArray6744[i_622_] * ((Class163_Sub3) aClass163_Sub3_6791).anInt8362) >> 8)
						+ anIntArray6775[i_622_] >> ((Class163_Sub3) aClass163_Sub3_6791).anInt8269) - (((Class11_Sub45_Sub1_Sub2) class11_sub45_sub1_sub2).anInt9883));
				int i_624_ = (((anIntArray6757[i_622_] + -((anIntArray6744[i_622_] * (((Class163_Sub3) aClass163_Sub3_6791).anInt8339)) >> 8)) >> ((Class163_Sub3) aClass163_Sub3_6791).anInt8269) - (((Class11_Sub45_Sub1_Sub2) class11_sub45_sub1_sub2).anInt9873));
				int i_625_ = anIntArray6763[i_622_];
				int i_626_ = anIntArray6763[i_622_ + 1];
				for (int i_627_ = i_625_; (i_627_ ^ 0xffffffff) > (i_626_ ^ 0xffffffff); i_627_++) {
					int i_628_ = -1 + aShortArray6764[i_627_];
					if (i_628_ == -1)
						break;
					is[i_628_] = i_623_;
					is_621_[i_628_] = i_624_;
				}
			}
			for (int i_629_ = 0; i_629_ < anInt6759; i_629_++) {
				if (aByteArray6735 == null || aByteArray6735[i_629_] <= 128) {
					short i_630_ = aShortArray6829[i_629_];
					short i_631_ = aShortArray6800[i_629_];
					short i_632_ = aShortArray6732[i_629_];
					int i_633_ = is[i_630_];
					int i_634_ = is[i_631_];
					int i_635_ = is[i_632_];
					int i_636_ = is_621_[i_630_];
					int i_637_ = is_621_[i_631_];
					int i_638_ = is_621_[i_632_];
					if (((-((i_635_ + -i_634_) * (i_637_ - i_636_)) + (i_633_ + -i_634_)
							* (i_637_ - i_638_)) ^ 0xffffffff) < -1)
						class11_sub45_sub1_sub2.method3878(i_633_, i_634_,
								i_635_, -122, i_636_, i_637_, i_638_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("li.R("
					+ (class11_sub45_sub1_sub2 != null ? "{...}" : "null")
					+ ',' + i + ')'));
		}
	}

	final void method1306() {
		try {
			anInt6737++;
			if (anInt6820 > 0 && (anInt6759 ^ 0xffffffff) < -1) {
				method2771(false, (byte) 83);
				if ((0x10 & aByte6733 ^ 0xffffffff) == -1
						&& ((Class381) aClass381_6808).anInterface19_4961 == null)
					method2770((byte) 125, false);
				method2779(-1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.EB(" + ')');
		}
	}

	final void s(int i) {
		try {
			anInt6768 = i;
			anInt6839++;
			aBool6804 = true;
			if (aClass271_6721 != null && (anInt6768 & 0x10000) == 0) {
				aShortArray6727 = ((Class271) aClass271_6721).aShortArray3654;
				aByteArray6830 = ((Class271) aClass271_6721).aByteArray3657;
				aShortArray6787 = ((Class271) aClass271_6721).aShortArray3653;
				aShortArray6826 = ((Class271) aClass271_6721).aShortArray3656;
				aClass271_6721 = null;
			}
			method2779(-1);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.s(" + i + ')');
		}
	}

	private final boolean method2783(int i, int i_639_, int i_640_, int i_641_,
			int i_642_, int i_643_, int i_644_, int i_645_, int i_646_) {
		try {
			anInt6765++;
			if ((i_646_ ^ 0xffffffff) < (i_643_ ^ 0xffffffff) && i_643_ < i
					&& i_644_ > i_643_)
				return false;
			if ((i_646_ ^ 0xffffffff) > (i_643_ ^ 0xffffffff) && i < i_643_
					&& (i_643_ ^ 0xffffffff) < (i_644_ ^ 0xffffffff))
				return false;
			if ((i_640_ ^ 0xffffffff) < (i_639_ ^ 0xffffffff)
					&& (i_639_ ^ 0xffffffff) > (i_645_ ^ 0xffffffff)
					&& i_641_ > i_639_)
				return false;
			if (i_642_ >= -53)
				method2773(null, (byte) -68, true, true, 101, null);
			if (i_639_ > i_640_
					&& (i_639_ ^ 0xffffffff) < (i_645_ ^ 0xffffffff)
					&& i_641_ < i_639_)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("li.D(" + i + ',' + i_639_ + ',' + i_640_ + ',' + i_641_
							+ ',' + i_642_ + ',' + i_643_ + ',' + i_644_ + ','
							+ i_645_ + ',' + i_646_ + ')'));
		}
	}

	final Class110[] method1307() {
		try {
			anInt6729++;
			return aClass110Array6798;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.KA(" + ')');
		}
	}

	final void method1311(Class206 class206, int i, int i_647_, int i_648_,
			boolean bool) {
		try {
			anInt6773++;
			Class206_Sub3 class206_sub3_649_ = (Class206_Sub3) class206;
			if (anInt6792 != 0
					&& (class206_sub3_649_.anInt6792 ^ 0xffffffff) != -1) {
				int i_650_ = class206_sub3_649_.anInt6802;
				int[] is = class206_sub3_649_.anIntArray6775;
				int[] is_651_ = class206_sub3_649_.anIntArray6744;
				int[] is_652_ = class206_sub3_649_.anIntArray6757;
				short[] is_653_ = class206_sub3_649_.aShortArray6787;
				short[] is_654_ = class206_sub3_649_.aShortArray6727;
				short[] is_655_ = class206_sub3_649_.aShortArray6826;
				byte[] is_656_ = class206_sub3_649_.aByteArray6830;
				short[] is_657_;
				short[] is_658_;
				byte[] is_659_;
				short[] is_660_;
				if (aClass271_6721 != null) {
					is_659_ = ((Class271) aClass271_6721).aByteArray3657;
					is_660_ = ((Class271) aClass271_6721).aShortArray3656;
					is_658_ = ((Class271) aClass271_6721).aShortArray3653;
					is_657_ = ((Class271) aClass271_6721).aShortArray3654;
				} else {
					is_657_ = null;
					is_658_ = null;
					is_659_ = null;
					is_660_ = null;
				}
				short[] is_661_;
				short[] is_662_;
				short[] is_663_;
				byte[] is_664_;
				if (class206_sub3_649_.aClass271_6721 == null) {
					is_664_ = null;
					is_662_ = null;
					is_663_ = null;
					is_661_ = null;
				} else {
					is_661_ = (((Class271) class206_sub3_649_.aClass271_6721).aShortArray3656);
					is_662_ = (((Class271) class206_sub3_649_.aClass271_6721).aShortArray3654);
					is_663_ = (((Class271) class206_sub3_649_.aClass271_6721).aShortArray3653);
					is_664_ = (((Class271) class206_sub3_649_.aClass271_6721).aByteArray3657);
				}
				int[] is_665_ = class206_sub3_649_.anIntArray6763;
				short[] is_666_ = class206_sub3_649_.aShortArray6764;
				if (!class206_sub3_649_.aBool6741)
					class206_sub3_649_.method2775((byte) -127);
				int i_667_ = class206_sub3_649_.aShort6762;
				int i_668_ = class206_sub3_649_.aShort6782;
				int i_669_ = class206_sub3_649_.aShort6739;
				int i_670_ = class206_sub3_649_.aShort6817;
				int i_671_ = class206_sub3_649_.aShort6822;
				int i_672_ = class206_sub3_649_.aShort6824;
				for (int i_673_ = 0; (anInt6802 ^ 0xffffffff) < (i_673_ ^ 0xffffffff); i_673_++) {
					int i_674_ = anIntArray6744[i_673_] + -i_647_;
					if ((i_667_ ^ 0xffffffff) >= (i_674_ ^ 0xffffffff)
							&& i_668_ >= i_674_) {
						int i_675_ = -i + anIntArray6775[i_673_];
						if (i_675_ >= i_669_ && i_675_ <= i_670_) {
							int i_676_ = anIntArray6757[i_673_] + -i_648_;
							if (i_676_ >= i_671_
									&& (i_672_ ^ 0xffffffff) <= (i_676_ ^ 0xffffffff)) {
								int i_677_ = -1;
								int i_678_ = anIntArray6763[i_673_];
								int i_679_ = anIntArray6763[i_673_ + 1];
								for (int i_680_ = i_678_; ((i_679_ ^ 0xffffffff) < (i_680_ ^ 0xffffffff)); i_680_++) {
									i_677_ = -1 + aShortArray6764[i_680_];
									if (i_677_ == -1
											|| (aByteArray6830[i_677_] ^ 0xffffffff) != -1)
										break;
								}
								if ((i_677_ ^ 0xffffffff) != 0) {
									for (int i_681_ = 0; ((i_681_ ^ 0xffffffff) > (i_650_ ^ 0xffffffff)); i_681_++) {
										if (((i_675_ ^ 0xffffffff) == (is[i_681_] ^ 0xffffffff))
												&& ((is_652_[i_681_] ^ 0xffffffff) == (i_676_ ^ 0xffffffff))
												&& i_674_ == is_651_[i_681_]) {
											int i_682_ = -1;
											i_679_ = is_665_[1 + i_681_];
											i_678_ = is_665_[i_681_];
											for (int i_683_ = i_678_; i_679_ > i_683_; i_683_++) {
												i_682_ = is_666_[i_683_] - 1;
												if ((i_682_ ^ 0xffffffff) == 0
														|| is_656_[i_682_] != 0)
													break;
											}
											if (i_682_ != -1) {
												if (is_658_ == null) {
													aClass271_6721 = new Class271();
													is_658_ = ((Class271) aClass271_6721).aShortArray3653 = (Class11_Sub24
															.method2644(
																	aShortArray6787,
																	95));
													is_657_ = ((Class271) aClass271_6721).aShortArray3654 = (Class11_Sub24
															.method2644(
																	aShortArray6727,
																	63));
													is_660_ = ((Class271) aClass271_6721).aShortArray3656 = (Class11_Sub24
															.method2644(
																	aShortArray6826,
																	62));
													is_659_ = ((Class271) aClass271_6721).aByteArray3657 = (Class11_Sub12_Sub2
															.method3557(
																	aByteArray6830,
																	true));
												}
												if (is_663_ == null) {
													Class271 class271 = (class206_sub3_649_.aClass271_6721 = new Class271());
													is_663_ = ((Class271) class271).aShortArray3653 = (Class11_Sub24
															.method2644(
																	is_653_,
																	108));
													is_662_ = ((Class271) class271).aShortArray3654 = (Class11_Sub24
															.method2644(
																	is_654_, 31));
													is_661_ = ((Class271) class271).aShortArray3656 = (Class11_Sub24
															.method2644(
																	is_655_,
																	126));
													is_664_ = ((Class271) class271).aByteArray3657 = (Class11_Sub12_Sub2
															.method3557(
																	is_656_,
																	true));
												}
												short i_684_ = aShortArray6787[i_677_];
												short i_685_ = aShortArray6727[i_677_];
												short i_686_ = aShortArray6826[i_677_];
												byte i_687_ = aByteArray6830[i_677_];
												i_678_ = is_665_[i_681_];
												i_679_ = is_665_[i_681_ + 1];
												for (int i_688_ = i_678_; i_688_ < i_679_; i_688_++) {
													int i_689_ = -1
															+ is_666_[i_688_];
													if ((i_689_ ^ 0xffffffff) == 0)
														break;
													if ((is_664_[i_689_] ^ 0xffffffff) != -1) {
														is_663_[i_689_] += i_684_;
														is_662_[i_689_] += i_685_;
														is_661_[i_689_] += i_686_;
														is_664_[i_689_] += i_687_;
													}
												}
												i_686_ = is_655_[i_682_];
												i_679_ = (anIntArray6763[1 + i_673_]);
												i_678_ = anIntArray6763[i_673_];
												i_684_ = is_653_[i_682_];
												i_687_ = is_656_[i_682_];
												i_685_ = is_654_[i_682_];
												for (int i_690_ = i_678_; i_690_ < i_679_; i_690_++) {
													int i_691_ = -1
															+ (aShortArray6764[i_690_]);
													if (i_691_ == -1)
														break;
													if (is_659_[i_691_] != 0) {
														is_658_[i_691_] += i_684_;
														is_657_[i_691_] += i_685_;
														is_660_[i_691_] += i_686_;
														is_659_[i_691_] += i_687_;
													}
												}
												if (aClass350_6724 == null
														&& aClass350_6814 != null)
													((Class350) aClass350_6814).anInterface9_4613 = null;
												if (aClass350_6724 != null)
													((Class350) aClass350_6724).anInterface9_4613 = null;
												if ((class206_sub3_649_.aClass350_6724) == null
														&& ((class206_sub3_649_.aClass350_6814) != null))
													((Class350) (class206_sub3_649_.aClass350_6814)).anInterface9_4613 = null;
												if ((class206_sub3_649_.aClass350_6724) != null)
													((Class350) (class206_sub3_649_.aClass350_6724)).anInterface9_4613 = null;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("li.U("
					+ (class206 != null ? "{...}" : "null") + ',' + i + ','
					+ i_647_ + ',' + i_648_ + ',' + bool + ')'));
		}
	}

	Class206_Sub3(Class163_Sub3 class163_sub3) {
		anInt6802 = 0;
		aBool6804 = true;
		anInt6825 = 0;
		aBool6816 = false;
		anInt6820 = 0;
		try {
			aClass163_Sub3_6791 = class163_sub3;
			aClass350_6810 = new Class350(null, 5126, 3, 0);
			aClass350_6725 = new Class350(null, 5126, 2, 0);
			aClass350_6724 = new Class350(null, 5126, 3, 0);
			aClass350_6814 = new Class350(null, 5121, 4, 0);
			aClass381_6808 = new Class381();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "li.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ')');
		}
	}

	Class206_Sub3(Class163_Sub3 class163_sub3, Class179 class179, int i,
			int i_692_, int i_693_, int i_694_) {
		anInt6802 = 0;
		aBool6804 = true;
		anInt6825 = 0;
		aBool6816 = false;
		anInt6820 = 0;
		do {
			try {
				aClass163_Sub3_6791 = class163_sub3;
				anInt6768 = i;
				anInt6740 = i_694_;
				if (Class57_Sub1.method2488(true, i_694_, i))
					aClass350_6810 = new Class350(null, 5126, 3, 0);
				if (Class363.method2152(i_694_, false, i))
					aClass350_6725 = new Class350(null, 5126, 2, 0);
				if (Class37.method315(i, i_694_, 0))
					aClass350_6724 = new Class350(null, 5126, 3, 0);
				if (Class11_Sub45_Sub20_Sub1.method3893(-117, i, i_694_))
					aClass350_6814 = new Class350(null, 5121, 4, 0);
				if (Class313.method1906(i, (byte) 126, i_694_))
					aClass381_6808 = new Class381();
				Interface1 interface1 = ((Class163) class163_sub3).anInterface1_2118;
				anIntArray6763 = new int[((Class179) class179).anInt2311 + 1];
				int[] is = new int[((Class179) class179).anInt2318];
				for (int i_695_ = 0; i_695_ < ((Class179) class179).anInt2318; i_695_++) {
					if (((Class179) class179).aByteArray2289 == null
							|| (((Class179) class179).aByteArray2289[i_695_] ^ 0xffffffff) != -3) {
						if (((Class179) class179).aShortArray2306 != null
								&& (((Class179) class179).aShortArray2306[i_695_] != -1)) {
							Class188 class188 = interface1
									.method7(
											(byte) 127,
											(((Class179) class179).aShortArray2306[i_695_]) & 0xffff);
							if (((0x40 & anInt6740) == 0 || !((Class188) class188).aBool2416)
									&& ((Class188) class188).aBool2423)
								continue;
						}
						is[anInt6792++] = i_695_;
						anIntArray6763[(((Class179) class179).aShortArray2297[i_695_])]++;
						anIntArray6763[(((Class179) class179).aShortArray2287[i_695_])]++;
						anIntArray6763[(((Class179) class179).aShortArray2282[i_695_])]++;
					}
				}
				anInt6759 = anInt6792;
				long[] ls = new long[anInt6792];
				boolean bool = (0x100 & anInt6768) != 0;
				for (int i_696_ = 0; anInt6792 > i_696_; i_696_++) {
					int i_697_ = is[i_696_];
					Class188 class188 = null;
					int i_698_ = 0;
					int i_699_ = 0;
					int i_700_ = 0;
					int i_701_ = 0;
					if (((Class179) class179).aClass210Array2292 != null) {
						boolean bool_702_ = false;
						for (int i_703_ = 0; (((Class179) class179).aClass210Array2292.length > i_703_); i_703_++) {
							Class210 class210 = (((Class179) class179).aClass210Array2292[i_703_]);
							if ((i_697_ ^ 0xffffffff) == (((Class210) class210).anInt2847 ^ 0xffffffff)) {
								Class268 class268 = (Class11_Sub45_Sub20_Sub2
										.method3940(0,
												((Class210) class210).anInt2849));
								if (((Class268) class268).aBool3638)
									bool_702_ = true;
								if (((Class268) class268).anInt3631 != -1) {
									Class188 class188_704_ = interface1
											.method7(
													(byte) 127,
													(((Class268) class268).anInt3631));
									if (((Class188) class188_704_).anInt2425 == 2)
										aBool6818 = true;
								}
							}
						}
						if (bool_702_) {
							ls[i_696_] = 9223372036854775807L;
							anInt6759--;
							continue;
						}
					}
					int i_705_ = -1;
					if (((Class179) class179).aShortArray2306 != null) {
						i_705_ = ((Class179) class179).aShortArray2306[i_697_];
						if (i_705_ != -1) {
							class188 = interface1.method7((byte) 127,
									i_705_ & 0xffff);
							if ((anInt6740 & 0x40 ^ 0xffffffff) != -1
									&& ((Class188) class188).aBool2416) {
								i_705_ = -1;
								class188 = null;
							} else {
								if (((Class188) class188).aByte2429 != 0
										|| ((Class188) class188).aByte2415 != 0)
									aBool6816 = true;
								i_701_ = ((Class188) class188).aByte2417;
								i_700_ = ((Class188) class188).aByte2426;
							}
						}
					}
					boolean bool_706_ = ((((Class179) class179).aByteArray2294 != null && (((Class179) class179).aByteArray2294[i_697_] ^ 0xffffffff) != -1) || (class188 != null && (((Class188) class188).anInt2425 ^ 0xffffffff) != -1));
					if ((bool || bool_706_)
							&& ((Class179) class179).aByteArray2305 != null)
						i_698_ += (((Class179) class179).aByteArray2305[i_697_] << 17);
					if (bool_706_)
						i_698_ += 65536;
					i_698_ += (i_700_ & 0xff) << 8;
					i_699_ += i_705_ << 16 & ~0xffff;
					i_698_ += i_701_ & 0xff;
					i_699_ += 0xffff & i_696_;
					ls[i_696_] = ((long) i_698_ << 32) - -(long) i_699_;
					aBool6818 |= bool_706_;
					Class206_Sub3 class206_sub3_707_ = this;
					class206_sub3_707_.aBool6816 = (class206_sub3_707_.aBool6816 | (class188 != null && (((Class188) class188).aByte2429 != 0 || (((Class188) class188).aByte2415 ^ 0xffffffff) != -1)));
				}
				Class376_Sub7_Sub4_Sub2.method3913(is, (byte) -122, ls);
				anIntArray6757 = ((Class179) class179).anIntArray2269;
				anInt6802 = ((Class179) class179).anInt2311;
				anIntArray6744 = ((Class179) class179).anIntArray2322;
				anInt6825 = ((Class179) class179).anInt2278;
				aShortArray6758 = ((Class179) class179).aShortArray2272;
				anIntArray6775 = ((Class179) class179).anIntArray2288;
				aClass261Array6795 = ((Class179) class179).aClass261Array2270;
				Class293[] class293s = new Class293[anInt6802];
				aClass110Array6798 = ((Class179) class179).aClass110Array2299;
				if (((Class179) class179).aClass210Array2292 != null) {
					anInt6742 = ((Class179) class179).aClass210Array2292.length;
					aClass199Array6838 = new Class199[anInt6742];
					aClass330Array6841 = new Class330[anInt6742];
					for (int i_708_ = 0; anInt6742 > i_708_; i_708_++) {
						Class210 class210 = ((Class179) class179).aClass210Array2292[i_708_];
						Class268 class268 = (Class11_Sub45_Sub20_Sub2
								.method3940(0, ((Class210) class210).anInt2849));
						int i_709_ = -1;
						for (int i_710_ = 0; (anInt6792 ^ 0xffffffff) < (i_710_ ^ 0xffffffff); i_710_++) {
							if (is[i_710_] == ((Class210) class210).anInt2847) {
								i_709_ = i_710_;
								break;
							}
						}
						if ((i_709_ ^ 0xffffffff) == 0)
							throw new RuntimeException();
						int i_711_ = (0xffffff & (Class27.anIntArray359[((((Class179) class179).aShortArray2298[((Class210) class210).anInt2847]) & 0xffff)]));
						i_711_ = (i_711_ | -(((Class179) class179).aByteArray2294 != null ? (((Class179) class179).aByteArray2294[((Class210) class210).anInt2847])
								: 0) + 255 << 24);
						aClass199Array6838[i_708_] = new Class199(
								i_709_,
								(((Class179) class179).aShortArray2297[((Class210) class210).anInt2847]),
								(((Class179) class179).aShortArray2287[((Class210) class210).anInt2847]),
								(((Class179) class179).aShortArray2282[((Class210) class210).anInt2847]),
								((Class268) class268).anInt3634,
								((Class268) class268).anInt3629,
								((Class268) class268).anInt3631,
								((Class268) class268).anInt3642,
								((Class268) class268).anInt3641,
								((Class268) class268).aBool3638,
								((Class268) class268).aBool3637,
								((Class210) class210).anInt2855);
						aClass330Array6841[i_708_] = new Class330(i_711_);
					}
				}
				int i_712_ = 3 * anInt6792;
				aShortArray6753 = new short[anInt6792];
				Class11_Sub8.aLongArray5309 = new long[i_712_];
				aShort6805 = (short) i_693_;
				aShortArray6787 = new short[i_712_];
				aShortArray6826 = new short[i_712_];
				aShortArray6732 = new short[anInt6792];
				if (((Class179) class179).aShortArray2276 != null)
					aShortArray6756 = new short[anInt6792];
				aShortArray6829 = new short[anInt6792];
				aShortArray6812 = new short[anInt6792];
				aShort6751 = (short) i_692_;
				aByteArray6735 = new byte[anInt6792];
				aFloatArray6769 = new float[i_712_];
				aByteArray6830 = new byte[i_712_];
				aShortArray6764 = new short[i_712_];
				aShortArray6800 = new short[anInt6792];
				aFloatArray6760 = new float[i_712_];
				aShortArray6727 = new short[i_712_];
				int i_713_ = 0;
				for (int i_714_ = 0; ((i_714_ ^ 0xffffffff) > (((Class179) class179).anInt2311 ^ 0xffffffff)); i_714_++) {
					int i_715_ = anIntArray6763[i_714_];
					anIntArray6763[i_714_] = i_713_;
					i_713_ += i_715_;
					class293s[i_714_] = new Class293();
				}
				anIntArray6763[((Class179) class179).anInt2311] = i_713_;
				Class54 class54 = Class26.method219(anInt6792, is, class179,
						24582);
				Class358[] class358s = new Class358[((Class179) class179).anInt2318];
				for (int i_716_ = 0; ((Class179) class179).anInt2318 > i_716_; i_716_++) {
					short i_717_ = ((Class179) class179).aShortArray2297[i_716_];
					short i_718_ = ((Class179) class179).aShortArray2287[i_716_];
					short i_719_ = ((Class179) class179).aShortArray2282[i_716_];
					int i_720_ = -anIntArray6775[i_717_]
							+ anIntArray6775[i_718_];
					int i_721_ = -anIntArray6744[i_717_]
							+ anIntArray6744[i_718_];
					int i_722_ = anIntArray6757[i_718_]
							+ -anIntArray6757[i_717_];
					int i_723_ = anIntArray6775[i_719_]
							- anIntArray6775[i_717_];
					int i_724_ = -anIntArray6744[i_717_]
							+ anIntArray6744[i_719_];
					int i_725_ = -anIntArray6757[i_717_]
							+ anIntArray6757[i_719_];
					int i_726_ = i_721_ * i_725_ - i_722_ * i_724_;
					int i_727_ = i_722_ * i_723_ - i_720_ * i_725_;
					int i_728_;
					for (i_728_ = i_720_ * i_724_ - i_721_ * i_723_; ((i_726_ ^ 0xffffffff) < -8193
							|| (i_727_ ^ 0xffffffff) < -8193
							|| i_728_ > 8192
							|| (i_726_ ^ 0xffffffff) > 8191 || i_727_ < -8192 || i_728_ < -8192); i_728_ >>= 1) {
						i_726_ >>= 1;
						i_727_ >>= 1;
					}
					int i_729_ = (int) Math
							.sqrt((double) (i_728_ * i_728_ + (i_726_ * i_726_ + i_727_
									* i_727_)));
					if (i_729_ <= 0)
						i_729_ = 1;
					i_726_ = i_726_ * 256 / i_729_;
					i_728_ = 256 * i_728_ / i_729_;
					i_727_ = i_727_ * 256 / i_729_;
					byte i_730_ = (((Class179) class179).aByteArray2289 != null ? ((Class179) class179).aByteArray2289[i_716_]
							: (byte) 0);
					if ((i_730_ ^ 0xffffffff) == -1) {
						Class293 class293 = class293s[i_717_];
						((Class293) class293).anInt3966 += i_726_;
						((Class293) class293).anInt3970++;
						((Class293) class293).anInt3965 += i_728_;
						((Class293) class293).anInt3963 += i_727_;
						class293 = class293s[i_718_];
						((Class293) class293).anInt3970++;
						((Class293) class293).anInt3966 += i_726_;
						((Class293) class293).anInt3963 += i_727_;
						((Class293) class293).anInt3965 += i_728_;
						class293 = class293s[i_719_];
						((Class293) class293).anInt3970++;
						((Class293) class293).anInt3966 += i_726_;
						((Class293) class293).anInt3965 += i_728_;
						((Class293) class293).anInt3963 += i_727_;
					} else if (i_730_ == 1) {
						Class358 class358 = class358s[i_716_] = new Class358();
						((Class358) class358).anInt4669 = i_727_;
						((Class358) class358).anInt4668 = i_728_;
						((Class358) class358).anInt4673 = i_726_;
					}
				}
				for (int i_731_ = 0; anInt6792 > i_731_; i_731_++) {
					int i_732_ = is[i_731_];
					int i_733_ = (((Class179) class179).aShortArray2298[i_732_] & 0xffff);
					int i_734_;
					if (((Class179) class179).aByteArray2323 != null)
						i_734_ = ((Class179) class179).aByteArray2323[i_732_];
					else
						i_734_ = -1;
					int i_735_;
					if (((Class179) class179).aByteArray2294 != null)
						i_735_ = 0xff & (((Class179) class179).aByteArray2294[i_732_]);
					else
						i_735_ = 0;
					short i_736_ = (((Class179) class179).aShortArray2306 == null ? (short) -1
							: ((Class179) class179).aShortArray2306[i_732_]);
					if ((i_736_ ^ 0xffffffff) != 0 && (anInt6740 & 0x40) != 0) {
						Class188 class188 = interface1.method7((byte) 127,
								i_736_ & 0xffff);
						if (((Class188) class188).aBool2416)
							i_736_ = (short) -1;
					}
					float f = 0.0F;
					float f_737_ = 0.0F;
					float f_738_ = 0.0F;
					float f_739_ = 0.0F;
					float f_740_ = 0.0F;
					float f_741_ = 0.0F;
					int i_742_ = 0;
					int i_743_ = 0;
					int i_744_ = 0;
					if ((i_736_ ^ 0xffffffff) != 0) {
						if ((i_734_ ^ 0xffffffff) != 0) {
							i_734_ &= 0xff;
							byte i_745_ = ((Class179) class179).aByteArray2290[i_734_];
							if (i_745_ == 0) {
								short i_746_ = (((Class179) class179).aShortArray2297[i_732_]);
								short i_747_ = (((Class179) class179).aShortArray2287[i_732_]);
								short i_748_ = (((Class179) class179).aShortArray2282[i_732_]);
								short i_749_ = (((Class179) class179).aShortArray2275[i_734_]);
								short i_750_ = (((Class179) class179).aShortArray2273[i_734_]);
								short i_751_ = (((Class179) class179).aShortArray2303[i_734_]);
								float f_752_ = (float) (((Class179) class179).anIntArray2288[i_749_]);
								float f_753_ = (float) (((Class179) class179).anIntArray2322[i_749_]);
								float f_754_ = (float) (((Class179) class179).anIntArray2269[i_749_]);
								float f_755_ = (-f_752_ + (float) (((Class179) class179).anIntArray2288[i_750_]));
								float f_756_ = ((float) (((Class179) class179).anIntArray2322[i_750_]) - f_753_);
								float f_757_ = ((float) (((Class179) class179).anIntArray2269[i_750_]) - f_754_);
								float f_758_ = (-f_752_ + (float) (((Class179) class179).anIntArray2288[i_751_]));
								float f_759_ = ((float) (((Class179) class179).anIntArray2322[i_751_]) - f_753_);
								float f_760_ = (-f_754_ + (float) (((Class179) class179).anIntArray2269[i_751_]));
								float f_761_ = ((float) (((Class179) class179).anIntArray2288[i_746_]) - f_752_);
								float f_762_ = (-f_753_ + (float) (((Class179) class179).anIntArray2322[i_746_]));
								float f_763_ = (-f_754_ + (float) (((Class179) class179).anIntArray2269[i_746_]));
								float f_764_ = ((float) (((Class179) class179).anIntArray2288[i_747_]) - f_752_);
								float f_765_ = ((float) (((Class179) class179).anIntArray2322[i_747_]) - f_753_);
								float f_766_ = (-f_754_ + (float) (((Class179) class179).anIntArray2269[i_747_]));
								float f_767_ = ((float) (((Class179) class179).anIntArray2288[i_748_]) - f_752_);
								float f_768_ = (-f_753_ + (float) (((Class179) class179).anIntArray2322[i_748_]));
								float f_769_ = ((float) (((Class179) class179).anIntArray2269[i_748_]) - f_754_);
								float f_770_ = -(f_759_ * f_757_) + f_756_
										* f_760_;
								float f_771_ = -(f_755_ * f_760_) + f_757_
										* f_758_;
								float f_772_ = f_755_ * f_759_ - f_758_
										* f_756_;
								float f_773_ = f_772_ * f_759_ - f_760_
										* f_771_;
								float f_774_ = f_770_ * f_760_ - f_758_
										* f_772_;
								float f_775_ = -(f_759_ * f_770_) + f_771_
										* f_758_;
								float f_776_ = 1.0F / (f_775_ * f_757_ + (f_774_
										* f_756_ + f_755_ * f_773_));
								f_738_ = (f_766_ * f_775_ + (f_764_ * f_773_ + f_774_
										* f_765_))
										* f_776_;
								f_740_ = (f_775_ * f_769_ + (f_774_ * f_768_ + f_767_
										* f_773_))
										* f_776_;
								f = f_776_
										* (f_775_ * f_763_ + (f_773_ * f_761_ + f_762_
												* f_774_));
								f_775_ = f_755_ * f_771_ - f_770_ * f_756_;
								f_773_ = f_772_ * f_756_ - f_757_ * f_771_;
								f_774_ = -(f_772_ * f_755_) + f_770_ * f_757_;
								f_776_ = 1.0F / (f_759_ * f_774_ + f_758_
										* f_773_ + f_760_ * f_775_);
								f_737_ = f_776_
										* (f_762_ * f_774_ + f_761_ * f_773_ + f_763_
												* f_775_);
								f_741_ = f_776_
										* (f_767_ * f_773_ + f_768_ * f_774_ + f_769_
												* f_775_);
								f_739_ = (f_766_ * f_775_ + (f_764_ * f_773_ + f_774_
										* f_765_))
										* f_776_;
							} else {
								short i_777_ = (((Class179) class179).aShortArray2297[i_732_]);
								short i_778_ = (((Class179) class179).aShortArray2287[i_732_]);
								short i_779_ = (((Class179) class179).aShortArray2282[i_732_]);
								int i_780_ = (((Class54) class54).anIntArray820[i_734_]);
								int i_781_ = (((Class54) class54).anIntArray826[i_734_]);
								int i_782_ = (((Class54) class54).anIntArray828[i_734_]);
								float[] fs = (((Class54) class54).aFloatArrayArray822[i_734_]);
								byte i_783_ = (((Class179) class179).aByteArray2284[i_734_]);
								float f_784_ = ((float) (((Class179) class179).anIntArray2312[i_734_]) / 256.0F);
								if ((i_745_ ^ 0xffffffff) == -2) {
									float f_785_ = ((float) (((Class179) class179).anIntArray2315[i_734_]) / 1024.0F);
									Class11_Sub45_Sub2
											.method3353(
													(byte) -25,
													i_780_,
													f_784_,
													i_781_,
													fs,
													(((Class179) class179).anIntArray2269[i_777_]),
													(((Class179) class179).anIntArray2288[i_777_]),
													i_783_,
													IncomingPacket.aFloatArray2087,
													i_782_,
													(((Class179) class179).anIntArray2322[i_777_]),
													f_785_);
									f = IncomingPacket.aFloatArray2087[0];
									f_737_ = IncomingPacket.aFloatArray2087[1];
									Class11_Sub45_Sub2
											.method3353(
													(byte) -25,
													i_780_,
													f_784_,
													i_781_,
													fs,
													(((Class179) class179).anIntArray2269[i_778_]),
													(((Class179) class179).anIntArray2288[i_778_]),
													i_783_,
													IncomingPacket.aFloatArray2087,
													i_782_,
													(((Class179) class179).anIntArray2322[i_778_]),
													f_785_);
									f_738_ = IncomingPacket.aFloatArray2087[0];
									f_739_ = IncomingPacket.aFloatArray2087[1];
									Class11_Sub45_Sub2
											.method3353(
													(byte) -25,
													i_780_,
													f_784_,
													i_781_,
													fs,
													(((Class179) class179).anIntArray2269[i_779_]),
													(((Class179) class179).anIntArray2288[i_779_]),
													i_783_,
													IncomingPacket.aFloatArray2087,
													i_782_,
													(((Class179) class179).anIntArray2322[i_779_]),
													f_785_);
									f_740_ = IncomingPacket.aFloatArray2087[0];
									f_741_ = IncomingPacket.aFloatArray2087[1];
									float f_786_ = f_785_ / 2.0F;
									if ((0x1 & i_783_) == 0) {
										if (f_740_ - f > f_786_) {
											i_743_ = 1;
											f_740_ -= f_785_;
										} else if (f_786_ < f - f_740_) {
											f_740_ += f_785_;
											i_743_ = 2;
										}
										if (!(-f + f_738_ > f_786_)) {
											if (f - f_738_ > f_786_) {
												f_738_ += f_785_;
												i_742_ = 2;
											}
										} else {
											i_742_ = 1;
											f_738_ -= f_785_;
										}
									} else {
										if (-f_737_ + f_739_ > f_786_) {
											f_739_ -= f_785_;
											i_742_ = 1;
										} else if (-f_739_ + f_737_ > f_786_) {
											f_739_ += f_785_;
											i_742_ = 2;
										}
										if (!(f_741_ - f_737_ > f_786_)) {
											if (f_786_ < f_737_ - f_741_) {
												f_741_ += f_785_;
												i_743_ = 2;
											}
										} else {
											f_741_ -= f_785_;
											i_743_ = 1;
										}
									}
								} else if (i_745_ == 2) {
									float f_787_ = ((float) (((Class179) class179).anIntArray2296[i_734_]) / 256.0F);
									float f_788_ = ((float) (((Class179) class179).anIntArray2313[i_734_]) / 256.0F);
									int i_789_ = (-(((Class179) class179).anIntArray2288[i_777_]) + (((Class179) class179).anIntArray2288[i_778_]));
									int i_790_ = (-(((Class179) class179).anIntArray2322[i_777_]) + (((Class179) class179).anIntArray2322[i_778_]));
									int i_791_ = (-(((Class179) class179).anIntArray2269[i_777_]) + (((Class179) class179).anIntArray2269[i_778_]));
									int i_792_ = ((((Class179) class179).anIntArray2288[i_779_]) - (((Class179) class179).anIntArray2288[i_777_]));
									int i_793_ = ((((Class179) class179).anIntArray2322[i_779_]) + -(((Class179) class179).anIntArray2322[i_777_]));
									int i_794_ = ((((Class179) class179).anIntArray2269[i_779_]) + -(((Class179) class179).anIntArray2269[i_777_]));
									int i_795_ = -(i_791_ * i_793_) + i_794_
											* i_790_;
									int i_796_ = i_791_ * i_792_
											+ -(i_789_ * i_794_);
									int i_797_ = i_789_ * i_793_ - i_792_
											* i_790_;
									float f_798_ = (64.0F / (float) (((Class179) class179).anIntArray2280[i_734_]));
									float f_799_ = (64.0F / (float) (((Class179) class179).anIntArray2301[i_734_]));
									float f_800_ = (64.0F / (float) (((Class179) class179).anIntArray2315[i_734_]));
									float f_801_ = (((float) i_797_ * fs[2] + (fs[0]
											* (float) i_795_ + (float) i_796_
											* fs[1])) / f_798_);
									float f_802_ = (((float) i_797_ * fs[5] + (fs[4]
											* (float) i_796_ + fs[3]
											* (float) i_795_)) / f_799_);
									float f_803_ = (((float) i_797_ * fs[8] + (fs[6]
											* (float) i_795_ + fs[7]
											* (float) i_796_)) / f_800_);
									i_744_ = (Class11_Sub20_Sub2.method3745(
											f_802_, f_801_, f_803_, (byte) 57));
									Class376_Sub6
											.method2820(
													i_744_,
													101,
													(((Class179) class179).anIntArray2322[i_777_]),
													i_782_,
													i_783_,
													(((Class179) class179).anIntArray2288[i_777_]),
													IncomingPacket.aFloatArray2087,
													(((Class179) class179).anIntArray2269[i_777_]),
													f_788_, f_787_, fs, i_780_,
													f_784_, i_781_);
									f = IncomingPacket.aFloatArray2087[0];
									f_737_ = IncomingPacket.aFloatArray2087[1];
									Class376_Sub6
											.method2820(
													i_744_,
													49,
													(((Class179) class179).anIntArray2322[i_778_]),
													i_782_,
													i_783_,
													(((Class179) class179).anIntArray2288[i_778_]),
													IncomingPacket.aFloatArray2087,
													(((Class179) class179).anIntArray2269[i_778_]),
													f_788_, f_787_, fs, i_780_,
													f_784_, i_781_);
									f_739_ = IncomingPacket.aFloatArray2087[1];
									f_738_ = IncomingPacket.aFloatArray2087[0];
									Class376_Sub6
											.method2820(
													i_744_,
													78,
													(((Class179) class179).anIntArray2322[i_779_]),
													i_782_,
													i_783_,
													(((Class179) class179).anIntArray2288[i_779_]),
													IncomingPacket.aFloatArray2087,
													(((Class179) class179).anIntArray2269[i_779_]),
													f_788_, f_787_, fs, i_780_,
													f_784_, i_781_);
									f_740_ = IncomingPacket.aFloatArray2087[0];
									f_741_ = IncomingPacket.aFloatArray2087[1];
								} else if ((i_745_ ^ 0xffffffff) == -4) {
									Canvas_Sub1
											.method3605(
													i_782_,
													(((Class179) class179).anIntArray2288[i_777_]),
													(((Class179) class179).anIntArray2322[i_777_]),
													fs,
													i_780_,
													i_781_,
													i_783_,
													f_784_,
													7,
													IncomingPacket.aFloatArray2087,
													(((Class179) class179).anIntArray2269[i_777_]));
									f_737_ = IncomingPacket.aFloatArray2087[1];
									f = IncomingPacket.aFloatArray2087[0];
									Canvas_Sub1
											.method3605(
													i_782_,
													(((Class179) class179).anIntArray2288[i_778_]),
													(((Class179) class179).anIntArray2322[i_778_]),
													fs,
													i_780_,
													i_781_,
													i_783_,
													f_784_,
													7,
													IncomingPacket.aFloatArray2087,
													(((Class179) class179).anIntArray2269[i_778_]));
									f_739_ = IncomingPacket.aFloatArray2087[1];
									f_738_ = IncomingPacket.aFloatArray2087[0];
									Canvas_Sub1
											.method3605(
													i_782_,
													(((Class179) class179).anIntArray2288[i_779_]),
													(((Class179) class179).anIntArray2322[i_779_]),
													fs,
													i_780_,
													i_781_,
													i_783_,
													f_784_,
													7,
													IncomingPacket.aFloatArray2087,
													(((Class179) class179).anIntArray2269[i_779_]));
									f_741_ = IncomingPacket.aFloatArray2087[1];
									f_740_ = IncomingPacket.aFloatArray2087[0];
									if ((0x1 & i_783_) == 0) {
										if (f_740_ - f > 0.5F) {
											f_740_--;
											i_743_ = 1;
										} else if (f - f_740_ > 0.5F) {
											i_743_ = 2;
											f_740_++;
										}
										if (!(f_738_ - f > 0.5F)) {
											if (-f_738_ + f > 0.5F) {
												f_738_++;
												i_742_ = 2;
											}
										} else {
											f_738_--;
											i_742_ = 1;
										}
									} else {
										if (f_741_ - f_737_ > 0.5F) {
											f_741_--;
											i_743_ = 1;
										} else if (f_737_ - f_741_ > 0.5F) {
											f_741_++;
											i_743_ = 2;
										}
										if (f_739_ - f_737_ > 0.5F) {
											i_742_ = 1;
											f_739_--;
										} else if (f_737_ - f_739_ > 0.5F) {
											f_739_++;
											i_742_ = 2;
										}
									}
								}
							}
						} else {
							f = 0.0F;
							i_742_ = 1;
							f_738_ = 1.0F;
							f_740_ = 0.0F;
							i_743_ = 2;
							f_739_ = 1.0F;
							f_741_ = 0.0F;
							f_737_ = 1.0F;
						}
					}
					byte i_804_;
					if (((Class179) class179).aByteArray2289 == null)
						i_804_ = (byte) 0;
					else
						i_804_ = ((Class179) class179).aByteArray2289[i_732_];
					if (i_804_ == 0) {
						long l = ((((long) (i_744_ << 24)
								- -(long) (i_733_ << 8) - -(long) i_735_) << 32) + (long) (i_734_ << 2));
						short i_805_ = ((Class179) class179).aShortArray2297[i_732_];
						short i_806_ = ((Class179) class179).aShortArray2287[i_732_];
						short i_807_ = ((Class179) class179).aShortArray2282[i_732_];
						Class293 class293 = class293s[i_805_];
						aShortArray6829[i_731_] = method2781(f_737_, f,
								((Class293) class293).anInt3965,
								((Class293) class293).anInt3970, i_805_, -88,
								l, ((Class293) class293).anInt3966, class179,
								((Class293) class293).anInt3963);
						class293 = class293s[i_806_];
						aShortArray6800[i_731_] = method2781(f_739_, f_738_,
								((Class293) class293).anInt3965,
								((Class293) class293).anInt3970, i_806_, -111,
								l + (long) i_742_,
								((Class293) class293).anInt3966, class179,
								((Class293) class293).anInt3963);
						class293 = class293s[i_807_];
						aShortArray6732[i_731_] = method2781(f_741_, f_740_,
								((Class293) class293).anInt3965,
								((Class293) class293).anInt3970, i_807_, -125,
								l + (long) i_743_,
								((Class293) class293).anInt3966, class179,
								((Class293) class293).anInt3963);
					} else if ((i_804_ ^ 0xffffffff) == -2) {
						Class358 class358 = class358s[i_732_];
						long l = (((long) (i_744_ << 24)
								+ ((long) (i_733_ << 8) - -(long) i_735_) << 32) + (long) ((((Class358) class358).anInt4668 + 256 << 22)
								+ ((((Class358) class358).anInt4669 + 256) << 12)
								+ (i_734_ << 2) - -((((Class358) class358).anInt4673 > 0) ? 1024
								: 2048)));
						aShortArray6829[i_731_] = method2781(
								f_737_,
								f,
								((Class358) class358).anInt4668,
								0,
								(((Class179) class179).aShortArray2297[i_732_]),
								-83, l, ((Class358) class358).anInt4673,
								class179, ((Class358) class358).anInt4669);
						aShortArray6800[i_731_] = method2781(
								f_739_,
								f_738_,
								((Class358) class358).anInt4668,
								0,
								(((Class179) class179).aShortArray2287[i_732_]),
								-63, (long) i_742_ + l,
								((Class358) class358).anInt4673, class179,
								((Class358) class358).anInt4669);
						aShortArray6732[i_731_] = method2781(
								f_741_,
								f_740_,
								((Class358) class358).anInt4668,
								0,
								(((Class179) class179).aShortArray2282[i_732_]),
								-82, l + (long) i_743_,
								((Class358) class358).anInt4673, class179,
								((Class358) class358).anInt4669);
					}
					if (((Class179) class179).aByteArray2294 != null)
						aByteArray6735[i_731_] = ((Class179) class179).aByteArray2294[i_732_];
					if (((Class179) class179).aShortArray2276 != null)
						aShortArray6756[i_731_] = ((Class179) class179).aShortArray2276[i_732_];
					aShortArray6753[i_731_] = ((Class179) class179).aShortArray2298[i_732_];
					aShortArray6812[i_731_] = i_736_;
				}
				int i_808_ = 0;
				short i_809_ = -10000;
				for (int i_810_ = 0; anInt6759 > i_810_; i_810_++) {
					short i_811_ = aShortArray6812[i_810_];
					if (i_809_ != i_811_) {
						i_809_ = i_811_;
						i_808_++;
					}
				}
				anIntArray6752 = new int[1 + i_808_];
				i_808_ = 0;
				i_809_ = (short) -10000;
				for (int i_812_ = 0; (i_812_ ^ 0xffffffff) > (anInt6759 ^ 0xffffffff); i_812_++) {
					short i_813_ = aShortArray6812[i_812_];
					if (i_809_ != i_813_) {
						i_809_ = i_813_;
						anIntArray6752[i_808_++] = i_812_;
					}
				}
				anIntArray6752[i_808_] = anInt6759;
				Class11_Sub8.aLongArray5309 = null;
				aShortArray6787 = Class11_Sub45_Sub1.method3349(anInt6820,
						aShortArray6787, (byte) -75);
				aShortArray6727 = Class11_Sub45_Sub1.method3349(anInt6820,
						aShortArray6727, (byte) -75);
				aShortArray6826 = Class11_Sub45_Sub1.method3349(anInt6820,
						aShortArray6826, (byte) -75);
				aByteArray6830 = Class125.method816(27773, aByteArray6830,
						anInt6820);
				aFloatArray6760 = Class321.method1959(anInt6820, (byte) 31,
						aFloatArray6760);
				aFloatArray6769 = Class321.method1959(anInt6820, (byte) 31,
						aFloatArray6769);
				if (((Class179) class179).anIntArray2317 != null
						&& Class11_Sub45_Sub20_Sub1.method3895(12869,
								anInt6740, i))
					anIntArrayArray6807 = class179.method1168(-6395, false);
				if (((Class179) class179).aClass210Array2292 != null
						&& Class11_Sub8.method2338(-128, anInt6740, i))
					anIntArrayArray6776 = class179.method1175(-127);
				if (((Class179) class179).anIntArray2293 == null
						|| !Class61.method470(anInt6740, (byte) -65, i))
					break;
				int i_814_ = 0;
				int[] is_815_ = new int[256];
				for (int i_816_ = 0; anInt6792 > i_816_; i_816_++) {
					int i_817_ = ((Class179) class179).anIntArray2293[is[i_816_]];
					if ((i_817_ ^ 0xffffffff) <= -1) {
						is_815_[i_817_]++;
						if (i_814_ < i_817_)
							i_814_ = i_817_;
					}
				}
				anIntArrayArray6745 = new int[i_814_ + 1][];
				for (int i_818_ = 0; (i_818_ ^ 0xffffffff) >= (i_814_ ^ 0xffffffff); i_818_++) {
					anIntArrayArray6745[i_818_] = new int[is_815_[i_818_]];
					is_815_[i_818_] = 0;
				}
				for (int i_819_ = 0; anInt6792 > i_819_; i_819_++) {
					int i_820_ = ((Class179) class179).anIntArray2293[is[i_819_]];
					if ((i_820_ ^ 0xffffffff) <= -1)
						anIntArrayArray6745[i_820_][is_815_[i_820_]++] = i_819_;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("li.<init>("
						+ (class163_sub3 != null ? "{...}" : "null") + ','
						+ (class179 != null ? "{...}" : "null") + ',' + i + ','
						+ i_692_ + ',' + i_693_ + ',' + i_694_ + ')'));
			}
			break;
		} while (false);
	}
}
