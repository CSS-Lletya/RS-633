/* Class107_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

final class Class107_Sub5 extends Class107 {
	private Interface7 anInterface7_8426;
	private boolean aBool8427;
	private Class163_Sub2 aClass163_Sub2_8428;
	private Interface3 anInterface3_8429;

	final void fa(char c, int i, int i_0_, int i_1_, boolean bool) {
		aClass163_Sub2_8428.method3061(256);
		aClass163_Sub2_8428.method3094(anInterface7_8426, -2);
		if (aBool8427 || bool) {
			aClass163_Sub2_8428.method3013(-30, Class121.aClass314_1643,
					Class188.aClass314_2424);
			aClass163_Sub2_8428.method3095((byte) -102, Class68.aClass218_962,
					0);
			aClass163_Sub2_8428.method3062(true, i_1_);
		} else
			aClass163_Sub2_8428.method3013(-30, Class121.aClass314_1643,
					Class121.aClass314_1643);
		Class33_Sub2 class33_sub2 = aClass163_Sub2_8428.method2969(3);
		class33_sub2.method301(i, i_0_, 0);
		aClass163_Sub2_8428.method3093(2);
		aClass163_Sub2_8428.method2996(0, 1, anInterface3_8429);
		aClass163_Sub2_8428.method3012(
				(((Class163_Sub2) aClass163_Sub2_8428).aClass219_7656), 16);
		aClass163_Sub2_8428.method3008(2, c * '\004', 113, Class7.aClass183_48);
		if (aBool8427 || bool)
			aClass163_Sub2_8428.method3095((byte) -92,
					Class11_Sub45_Sub12.aClass218_9187, 0);
	}

	final void method703(char c, int i, int i_2_, int i_3_, boolean bool,
			Class72 class72, int i_4_, int i_5_) {
		/* empty */
	}

	Class107_Sub5(Class163_Sub2 class163_sub2, Class292 class292,
			Class80[] class80s, boolean bool) {
		super(class163_sub2, class292);
		aClass163_Sub2_8428 = class163_sub2;
		int i = 0;
		for (int i_6_ = 0; i_6_ < 256; i_6_++) {
			Class80 class80 = class80s[i_6_];
			if (((Class80) class80).anInt1082 > i)
				i = ((Class80) class80).anInt1082;
			if (((Class80) class80).anInt1075 > i)
				i = ((Class80) class80).anInt1075;
		}
		int i_7_ = i * 16;
		if (bool) {
			byte[] is = new byte[i_7_ * i_7_];
			for (int i_8_ = 0; i_8_ < 256; i_8_++) {
				Class80 class80 = class80s[i_8_];
				int i_9_ = ((Class80) class80).anInt1082;
				int i_10_ = ((Class80) class80).anInt1075;
				int i_11_ = i_8_ % 16 * i;
				int i_12_ = i_8_ / 16 * i;
				int i_13_ = i_12_ * i_7_ + i_11_;
				int i_14_ = 0;
				if (((Class80) class80).aByteArray1078 == null) {
					byte[] is_15_ = ((Class80) class80).aByteArray1079;
					for (int i_16_ = 0; i_16_ < i_9_; i_16_++) {
						for (int i_17_ = 0; i_17_ < i_10_; i_17_++)
							is[i_13_++] = (byte) (is_15_[i_14_++] == 0 ? 0 : -1);
						i_13_ += i_7_ - i_10_;
					}
				} else {
					byte[] is_18_ = ((Class80) class80).aByteArray1078;
					for (int i_19_ = 0; i_19_ < i_9_; i_19_++) {
						for (int i_20_ = 0; i_20_ < i_10_; i_20_++)
							is[i_13_++] = is_18_[i_14_++];
						i_13_ += i_7_ - i_10_;
					}
				}
			}
			if (!class163_sub2.method3009(Class366.aClass366_4808,
					Class128.aClass98_1726, (byte) -45)) {
				int[] is_21_ = new int[is.length];
				for (int i_22_ = 0; i_22_ < is.length; i_22_++)
					is_21_[i_22_] = is[i_22_] << 24;
				anInterface7_8426 = class163_sub2.method3075(i_7_, is_21_,
						false, i_7_, false);
			} else
				anInterface7_8426 = class163_sub2.method3011(false,
						Class128.aClass98_1726, is, 121, i_7_, i_7_);
			aBool8427 = true;
		} else {
			int[] is = new int[i_7_ * i_7_];
			for (int i_23_ = 0; i_23_ < 256; i_23_++) {
				Class80 class80 = class80s[i_23_];
				int[] is_24_ = ((Class80) class80).anIntArray1074;
				byte[] is_25_ = ((Class80) class80).aByteArray1078;
				byte[] is_26_ = ((Class80) class80).aByteArray1079;
				int i_27_ = ((Class80) class80).anInt1082;
				int i_28_ = ((Class80) class80).anInt1075;
				int i_29_ = i_23_ % 16 * i;
				int i_30_ = i_23_ / 16 * i;
				int i_31_ = i_30_ * i_7_ + i_29_;
				int i_32_ = 0;
				if (is_25_ != null) {
					for (int i_33_ = 0; i_33_ < i_27_; i_33_++) {
						for (int i_34_ = 0; i_34_ < i_28_; i_34_++) {
							is[i_31_++] = (is_25_[i_32_] << 24 | is_24_[is_26_[i_32_] & 0xff]);
							i_32_++;
						}
						i_31_ += i_7_ - i_28_;
					}
				} else {
					for (int i_35_ = 0; i_35_ < i_27_; i_35_++) {
						for (int i_36_ = 0; i_36_ < i_28_; i_36_++) {
							int i_37_;
							if ((i_37_ = is_26_[i_32_++]) != 0)
								is[i_31_++] = ~0xffffff | is_24_[i_37_ & 0xff];
							else
								i_31_++;
						}
						i_31_ += i_7_ - i_28_;
					}
				}
			}
			anInterface7_8426 = class163_sub2.method3075(i_7_, is, false, i_7_,
					false);
			aBool8427 = false;
		}
		anInterface7_8426.method46(Class271.aClass34_3655, -21969);
		anInterface3_8429 = class163_sub2.method3005(false, 30519);
		anInterface3_8429.method10(-126, 20, 20480);
		for (int i_38_ = 0; i_38_ < 4; i_38_++) {
			Buffer buffer = anInterface3_8429.method12(-5419, true);
			if (buffer != null) {
				jaclib.memory.Stream stream = aClass163_Sub2_8428.method3098(
						buffer, true);
				float f = (anInterface7_8426.method22((byte) 119, (float) i_7_) / (float) i_7_);
				float f_39_ = (anInterface7_8426.method28(true, (float) i_7_) / (float) i_7_);
				for (int i_40_ = 0; i_40_ < 256; i_40_++) {
					Class80 class80 = class80s[i_40_];
					int i_41_ = ((Class80) class80).anInt1082;
					int i_42_ = ((Class80) class80).anInt1075;
					int i_43_ = ((Class80) class80).anInt1077;
					int i_44_ = ((Class80) class80).anInt1080;
					float f_45_ = (float) (i_40_ % 16 * i);
					float f_46_ = (float) (i_40_ / 16 * i);
					float f_47_ = f_45_ * f;
					float f_48_ = f_46_ * f_39_;
					float f_49_ = (f_45_ + (float) i_42_) * f;
					float f_50_ = (f_46_ + (float) i_41_) * f_39_;
					if (jaclib.memory.Stream.method353()) {
						stream.method357((float) i_44_);
						stream.method357((float) i_43_);
						stream.method357(0.0F);
						stream.method357(f_47_);
						stream.method357(f_48_);
						stream.method357((float) i_44_);
						stream.method357((float) (i_43_ + i_41_));
						stream.method357(0.0F);
						stream.method357(f_47_);
						stream.method357(f_50_);
						stream.method357((float) (i_44_ + i_42_));
						stream.method357((float) (i_43_ + i_41_));
						stream.method357(0.0F);
						stream.method357(f_49_);
						stream.method357(f_50_);
						stream.method357((float) (i_44_ + i_42_));
						stream.method357((float) i_43_);
						stream.method357(0.0F);
						stream.method357(f_49_);
						stream.method357(f_48_);
					} else {
						stream.method349((float) i_44_);
						stream.method349((float) i_43_);
						stream.method349(0.0F);
						stream.method349(f_47_);
						stream.method349(f_48_);
						stream.method349((float) i_44_);
						stream.method349((float) (i_43_ + i_41_));
						stream.method349(0.0F);
						stream.method349(f_47_);
						stream.method349(f_50_);
						stream.method349((float) (i_44_ + i_42_));
						stream.method349((float) (i_43_ + i_41_));
						stream.method349(0.0F);
						stream.method349(f_49_);
						stream.method349(f_50_);
						stream.method349((float) (i_44_ + i_42_));
						stream.method349((float) i_43_);
						stream.method349(0.0F);
						stream.method349(f_49_);
						stream.method349(f_48_);
					}
				}
				stream.method347();
				if (anInterface3_8429.method9(-17151))
					break;
			}
		}
	}
}
