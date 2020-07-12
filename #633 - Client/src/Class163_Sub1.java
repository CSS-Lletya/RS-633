/* Class163_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;

final class Class163_Sub1 extends Class163 {
	private boolean aBool5169 = false;
	Class11_Sub30 aClass11_Sub30_5170;
	private int anInt5171;
	private int anInt5172;
	private int anInt5173;
	private boolean aBool5174 = false;
	private Canvas aCanvas5175;
	private Class213 aClass213_5176 = new Class213(4);
	int anInt5177;
	int anInt5178 = 0;
	int anInt5179;
	int anInt5180;
	int anInt5181;
	private Class22 aClass22_5182;
	private int anInt5183;
	private int anInt5184;
	int anInt5185 = 75518;
	int anInt5186;
	float[] aFloatArray5187;
	private Class363[] aClass363Array5188;
	int anInt5189;
	private Class22 aClass22_5190;
	private boolean aBool5191 = false;
	private int anInt5192;
	int anInt5193;
	int anInt5194;
	private Class340 aClass340_5195;
	private int anInt5196;
	int anInt5197;
	private int anInt5198;
	int anInt5199;
	int anInt5200;
	int anInt5201;
	int anInt5202;
	int anInt5203;
	float[] aFloatArray5204;
	int anInt5205;
	int anInt5206;
	Class33_Sub3 aClass33_Sub3_5207;
	int anInt5208;
	private int anInt5209;
	int anInt5210;
	int anInt5211;
	int anInt5212;
	private int anInt5213;
	int[] anIntArray5214;
	int anInt5215;
	private Class253 aClass253_5216;
	private int anInt5217;

	final boolean method1074() {
		return true;
	}

	final boolean method2293() {
		return aBool5174;
	}

	final void method1061(Class11_Sub50 class11_sub50) {
		/* empty */
	}

	final int XA() {
		return ((Class163_Sub1) this).anInt5201;
	}

	final int method2294(int i) {
		return (((Class188) ((Class163) this).anInterface1_2118.method7(
				(byte) 127, i)).aShort2413 & 0xffff);
	}

	final void method1042(float f, float f_0_, float f_1_) {
		/* empty */
	}

	final Class234 method1057(Class234 class234, Class234 class234_2_, float f,
			Class234 class234_3_) {
		return null;
	}

	final int i() {
		return ((Class163_Sub1) this).anInt5200;
	}

	final void method1046(int i, int i_4_, int i_5_, int i_6_, int i_7_,
			int i_8_, int i_9_) {
		Class363 class363 = method2306(Thread.currentThread());
		Class296 class296 = ((Class363) class363).aClass296_4767;
		int i_10_ = i_5_ - i;
		int i_11_ = i_6_ - i_4_;
		int i_12_ = i_10_ >= 0 ? i_10_ : -i_10_;
		int i_13_ = i_11_ >= 0 ? i_11_ : -i_11_;
		int i_14_ = i_12_;
		if (i_14_ < i_13_)
			i_14_ = i_13_;
		if (i_14_ != 0) {
			int i_15_ = (i_10_ << 16) / i_14_;
			int i_16_ = (i_11_ << 16) / i_14_;
			i_10_ += i_15_ >> 16;
			i_11_ += i_16_ >> 16;
			if (i_16_ <= i_15_)
				i_15_ = -i_15_;
			else
				i_16_ = -i_16_;
			int i_17_ = i_8_ * i_16_ >> 17;
			int i_18_ = i_8_ * i_16_ + 1 >> 17;
			int i_19_ = i_8_ * i_15_ >> 17;
			int i_20_ = i_8_ * i_15_ + 1 >> 17;
			i -= class296.method1835();
			i_4_ -= class296.method1838();
			int i_21_ = i + i_17_;
			int i_22_ = i - i_18_;
			int i_23_ = i + i_10_ - i_18_;
			int i_24_ = i + i_10_ + i_17_;
			int i_25_ = i_4_ + i_19_;
			int i_26_ = i_4_ - i_20_;
			int i_27_ = i_4_ + i_11_ - i_20_;
			int i_28_ = i_4_ + i_11_ + i_19_;
			if (i_9_ == 0)
				((Class296) class296).anInt3997 = 0;
			else if (i_9_ == 1)
				((Class296) class296).anInt3997 = 255 - (i_7_ >>> 24);
			else
				throw new IllegalArgumentException();
			C(false);
			((Class296) class296).aBool4001 = (i_21_ < 0
					|| i_21_ > ((Class296) class296).anInt3995 || i_22_ < 0
					|| i_22_ > ((Class296) class296).anInt3995 || i_23_ < 0 || i_23_ > ((Class296) class296).anInt3995);
			class296.method1834((float) i_25_, (float) i_26_, (float) i_27_,
					(float) i_21_, (float) i_22_, (float) i_23_, 100.0F,
					100.0F, 100.0F, i_7_);
			((Class296) class296).aBool4001 = (i_21_ < 0
					|| i_21_ > ((Class296) class296).anInt3995 || i_23_ < 0
					|| i_23_ > ((Class296) class296).anInt3995 || i_24_ < 0 || i_24_ > ((Class296) class296).anInt3995);
			class296.method1834((float) i_25_, (float) i_27_, (float) i_28_,
					(float) i_21_, (float) i_23_, (float) i_24_, 100.0F,
					100.0F, 100.0F, i_7_);
			C(true);
		}
	}

	final boolean method1067() {
		return false;
	}

	final Class33 method1048() {
		Class363 class363 = method2306(Thread.currentThread());
		return ((Class363) class363).aClass33_Sub3_4721;
	}

	final void K(int[] is) {
		is[0] = ((Class163_Sub1) this).anInt5186;
		is[1] = ((Class163_Sub1) this).anInt5177;
		is[2] = ((Class163_Sub1) this).anInt5178;
		is[3] = ((Class163_Sub1) this).anInt5193;
	}

	final int method1065(int i, int i_29_) {
		i |= 0x20800;
		return i & i_29_ ^ i_29_;
	}

	final void method1001(int i, Class11_Sub46[] class11_sub46s) {
		/* empty */
	}

	final void method1021(int i) {
		int i_30_ = i - anInt5171;
		for (Object object = aClass22_5182.method186((byte) -93); object != null; object = aClass22_5182
				.method187(true)) {
			Class11_Sub40 class11_sub40 = (Class11_Sub40) object;
			if (((Class11_Sub40) class11_sub40).aBool7229) {
				((Class11_Sub40) class11_sub40).anInt7225 += i_30_;
				int i_31_ = ((Class11_Sub40) class11_sub40).anInt7225 / 20;
				if (i_31_ > 0) {
					Class188 class188 = (((Class163) this).anInterface1_2118
							.method7((byte) 127,
									((Class11_Sub40) class11_sub40).anInt7228));
					class11_sub40
							.method2933((((Class188) class188).aByte2429
									* i_30_ * 50 / 1000),
									(((Class188) class188).aByte2415 * i_30_
											* 50 / 1000));
					((Class11_Sub40) class11_sub40).anInt7225 -= i_31_ * 20;
				}
				((Class11_Sub40) class11_sub40).aBool7229 = false;
			}
		}
		anInt5171 = i;
		aClass22_5190.method182(5, (byte) -73);
		aClass22_5182.method182(5, (byte) -73);
	}

	final void L(int i, int i_32_, int i_33_) {
		for (int i_34_ = 0; i_34_ < aClass363Array5188.length; i_34_++) {
			Class363 class363 = aClass363Array5188[i_34_];
			((Class363) class363).anInt4726 = i & 0xffffff;
			int i_35_ = ((Class363) class363).anInt4726 >>> 16 & 0xff;
			if (i_35_ < 2)
				i_35_ = 2;
			int i_36_ = ((Class363) class363).anInt4726 >> 8 & 0xff;
			if (i_36_ < 2)
				i_36_ = 2;
			int i_37_ = ((Class363) class363).anInt4726 & 0xff;
			if (i_37_ < 2)
				i_37_ = 2;
			((Class363) class363).anInt4726 = i_35_ << 16 | i_36_ << 8 | i_37_;
			if (i_32_ < 0)
				((Class363) class363).aBool4723 = false;
			else
				((Class363) class363).aBool4723 = true;
		}
	}

	final void method1080(Class33 class33) {
		((Class163_Sub1) this).aClass33_Sub3_5207 = (Class33_Sub3) class33;
	}

	final boolean method1032() {
		return false;
	}

	final void method2295(int i, int i_38_, int i_39_, int i_40_, int i_41_,
			int i_42_, int i_43_, int i_44_, int i_45_, int i_46_) {
		if (i_40_ != 0 && i_41_ != 0) {
			if (i_43_ != 65535
					&& !((Class188) ((Class163) this).anInterface1_2118
							.method7((byte) 127, i_43_)).aBool2416) {
				if (anInt5217 != i_43_) {
					Class253 class253 = ((Class253) aClass22_5190.method188(
							(long) i_43_, (byte) 127));
					if (class253 == null) {
						int[] is = method2304(i_43_);
						if (is == null)
							return;
						int i_47_ = (method2298(i_43_) ? 64
								: ((Class163_Sub1) this).anInt5211);
						class253 = this.method1040(i_47_, i_47_, is, -1, i_47_,
								0);
						aClass22_5190.method184((byte) 126, class253,
								(long) i_43_);
					}
					anInt5217 = i_43_;
					aClass253_5216 = class253;
				}
				((Class253_Sub3) aClass253_5216).method3106(i - i_40_, i_38_
						- i_41_, i_39_, i_40_ << 1, i_41_ << 1, i_45_, i_44_,
						i_46_, 1);
			} else
				method2297(i, i_38_, i_39_, i_40_, i_44_, i_46_);
		}
	}

	final Class11_Sub46 method1073(int i, int i_48_, int i_49_, int i_50_,
			int i_51_, float f) {
		return null;
	}

	final Class33 method1041() {
		return new Class33_Sub3();
	}

	final void method1083(int i, int i_52_, int i_53_, int i_54_) {
		/* empty */
	}

	final Class12 method1036(int i, int i_55_, int[][] is, int[][] is_56_,
			int i_57_, int i_58_, int i_59_) {
		return new Class12_Sub2(this, i_58_, i_59_, i, i_55_, is, is_56_, i_57_);
	}

	private final void method2296() {
		((Class163_Sub1) this).anInt5212 = (((Class163_Sub1) this).anInt5186 - ((Class163_Sub1) this).anInt5181);
		((Class163_Sub1) this).anInt5203 = (((Class163_Sub1) this).anInt5178 - ((Class163_Sub1) this).anInt5181);
		((Class163_Sub1) this).anInt5179 = (((Class163_Sub1) this).anInt5177 - ((Class163_Sub1) this).anInt5197);
		((Class163_Sub1) this).anInt5202 = (((Class163_Sub1) this).anInt5193 - ((Class163_Sub1) this).anInt5197);
		for (int i = 0; i < ((Class163_Sub1) this).anInt5194; i++) {
			Class296 class296 = ((Class363) aClass363Array5188[i]).aClass296_4767;
			((Class296) class296).anInt3993 = (((Class163_Sub1) this).anInt5181 - ((Class163_Sub1) this).anInt5186);
			((Class296) class296).anInt4000 = (((Class163_Sub1) this).anInt5197 - ((Class163_Sub1) this).anInt5177);
			((Class296) class296).anInt3995 = (((Class163_Sub1) this).anInt5178 - ((Class163_Sub1) this).anInt5186);
			((Class296) class296).anInt3996 = (((Class163_Sub1) this).anInt5193 - ((Class163_Sub1) this).anInt5177);
		}
		int i = ((((Class163_Sub1) this).anInt5177 * ((Class163_Sub1) this).anInt5206) + ((Class163_Sub1) this).anInt5186);
		for (int i_60_ = ((Class163_Sub1) this).anInt5177; i_60_ < ((Class163_Sub1) this).anInt5193; i_60_++) {
			for (int i_61_ = 0; i_61_ < ((Class163_Sub1) this).anInt5194; i_61_++)
				((Class296) ((Class363) aClass363Array5188[i_61_]).aClass296_4767).anIntArray3991[i_60_
						- ((Class163_Sub1) this).anInt5177] = i;
			i += ((Class163_Sub1) this).anInt5206;
		}
	}

	final void X(int i) {
		/* empty */
	}

	final void method1027(Class234 class234) {
		/* empty */
	}

	final void aa(int i, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_) {
		if (i < ((Class163_Sub1) this).anInt5186) {
			i_63_ -= ((Class163_Sub1) this).anInt5186 - i;
			i = ((Class163_Sub1) this).anInt5186;
		}
		if (i_62_ < ((Class163_Sub1) this).anInt5177) {
			i_64_ -= ((Class163_Sub1) this).anInt5177 - i_62_;
			i_62_ = ((Class163_Sub1) this).anInt5177;
		}
		if (i + i_63_ > ((Class163_Sub1) this).anInt5178)
			i_63_ = ((Class163_Sub1) this).anInt5178 - i;
		if (i_62_ + i_64_ > ((Class163_Sub1) this).anInt5193)
			i_64_ = ((Class163_Sub1) this).anInt5193 - i_62_;
		if (i_63_ > 0 && i_64_ > 0 && i <= ((Class163_Sub1) this).anInt5178
				&& i_62_ <= ((Class163_Sub1) this).anInt5193) {
			int i_67_ = ((Class163_Sub1) this).anInt5206 - i_63_;
			int i_68_ = i + i_62_ * ((Class163_Sub1) this).anInt5206;
			int i_69_ = i_65_ >>> 24;
			if (i_66_ == 0 || i_66_ == 1 && i_69_ == 255) {
				int i_70_ = i_63_ >> 3;
				int i_71_ = i_63_ & 0x7;
				i_63_ = i_68_ - 1;
				for (int i_72_ = -i_64_; i_72_ < 0; i_72_++) {
					if (i_70_ > 0) {
						i = i_70_;
						do {
							((Class163_Sub1) this).anIntArray5214[++i_63_] = i_65_;
							((Class163_Sub1) this).anIntArray5214[++i_63_] = i_65_;
							((Class163_Sub1) this).anIntArray5214[++i_63_] = i_65_;
							((Class163_Sub1) this).anIntArray5214[++i_63_] = i_65_;
							((Class163_Sub1) this).anIntArray5214[++i_63_] = i_65_;
							((Class163_Sub1) this).anIntArray5214[++i_63_] = i_65_;
							((Class163_Sub1) this).anIntArray5214[++i_63_] = i_65_;
							((Class163_Sub1) this).anIntArray5214[++i_63_] = i_65_;
						} while (--i > 0);
					}
					if (i_71_ > 0) {
						i = i_71_;
						do
							((Class163_Sub1) this).anIntArray5214[++i_63_] = i_65_;
						while (--i > 0);
					}
					i_63_ += i_67_;
				}
			} else if (i_66_ == 1) {
				i_65_ = (((i_65_ & 0xff00ff) * i_69_ >> 8 & 0xff00ff) + (((i_65_ & ~0xff00ff) >>> 8)
						* i_69_ & ~0xff00ff));
				int i_73_ = 256 - i_69_;
				for (int i_74_ = 0; i_74_ < i_64_; i_74_++) {
					for (int i_75_ = -i_63_; i_75_ < 0; i_75_++) {
						int i_76_ = ((Class163_Sub1) this).anIntArray5214[i_68_];
						i_76_ = (((i_76_ & 0xff00ff) * i_73_ >> 8 & 0xff00ff) + (((i_76_ & ~0xff00ff) >>> 8)
								* i_73_ & ~0xff00ff));
						((Class163_Sub1) this).anIntArray5214[i_68_++] = i_65_
								+ i_76_;
					}
					i_68_ += i_67_;
				}
			} else if (i_66_ == 2) {
				for (int i_77_ = 0; i_77_ < i_64_; i_77_++) {
					for (int i_78_ = -i_63_; i_78_ < 0; i_78_++) {
						int i_79_ = ((Class163_Sub1) this).anIntArray5214[i_68_];
						int i_80_ = i_65_ + i_79_;
						int i_81_ = (i_65_ & 0xff00ff) + (i_79_ & 0xff00ff);
						i_79_ = (i_81_ & 0x1000100) + (i_80_ - i_81_ & 0x10000);
						((Class163_Sub1) this).anIntArray5214[i_68_++] = i_80_
								- i_79_ | i_79_ - (i_79_ >>> 8);
					}
					i_68_ += i_67_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	final int I() {
		int i = anInt5184;
		anInt5184 = 0;
		return i;
	}

	final boolean method1086() {
		return false;
	}

	final void C(boolean bool) {
		Class363 class363 = method2306(Thread.currentThread());
		((Class363) class363).aBool4731 = bool;
	}

	final Class100 method1055() {
		return new Class100(0, "Pure Java", 1, "CPU", 0L);
	}

	final int[] Y() {
		return new int[] { ((Class163_Sub1) this).anInt5181,
				((Class163_Sub1) this).anInt5197,
				((Class163_Sub1) this).anInt5215,
				((Class163_Sub1) this).anInt5205 };
	}

	final boolean method1019() {
		return true;
	}

	private final void method2297(int i, int i_82_, int i_83_, int i_84_,
			int i_85_, int i_86_) {
		if (i_84_ < 0)
			i_84_ = -i_84_;
		int i_87_ = i_82_ - i_84_;
		if (i_87_ < ((Class163_Sub1) this).anInt5177)
			i_87_ = ((Class163_Sub1) this).anInt5177;
		int i_88_ = i_82_ + i_84_ + 1;
		if (i_88_ > ((Class163_Sub1) this).anInt5193)
			i_88_ = ((Class163_Sub1) this).anInt5193;
		int i_89_ = i_87_;
		int i_90_ = i_84_ * i_84_;
		int i_91_ = 0;
		int i_92_ = i_82_ - i_89_;
		int i_93_ = i_92_ * i_92_;
		int i_94_ = i_93_ - i_92_;
		if (i_82_ > i_88_)
			i_82_ = i_88_;
		int i_95_ = i_85_ >>> 24;
		if (i_86_ == 0 || i_86_ == 1 && i_95_ == 255) {
			while (i_89_ < i_82_) {
				for (/**/; i_94_ <= i_90_ || i_93_ <= i_90_; i_94_ += i_91_++
						+ i_91_)
					i_93_ += i_91_ + i_91_;
				int i_96_ = i - i_91_ + 1;
				if (i_96_ < ((Class163_Sub1) this).anInt5186)
					i_96_ = ((Class163_Sub1) this).anInt5186;
				int i_97_ = i + i_91_;
				if (i_97_ > ((Class163_Sub1) this).anInt5178)
					i_97_ = ((Class163_Sub1) this).anInt5178;
				int i_98_ = i_96_ + i_89_ * ((Class163_Sub1) this).anInt5206;
				for (int i_99_ = i_96_; i_99_ < i_97_; i_99_++) {
					if ((float) i_83_ < ((Class163_Sub1) this).aFloatArray5204[i_98_])
						((Class163_Sub1) this).anIntArray5214[i_98_] = i_85_;
					i_98_++;
				}
				i_89_++;
				i_93_ -= i_92_-- + i_92_;
				i_94_ -= i_92_ + i_92_;
			}
			i_91_ = i_84_;
			i_92_ = i_89_ - i_82_;
			i_94_ = i_92_ * i_92_ + i_90_;
			i_93_ = i_94_ - i_91_;
			i_94_ -= i_92_;
			while (i_89_ < i_88_) {
				for (/**/; i_94_ > i_90_ && i_93_ > i_90_; i_93_ -= i_91_
						+ i_91_)
					i_94_ -= i_91_-- + i_91_;
				int i_100_ = i - i_91_;
				if (i_100_ < ((Class163_Sub1) this).anInt5186)
					i_100_ = ((Class163_Sub1) this).anInt5186;
				int i_101_ = i + i_91_;
				if (i_101_ > ((Class163_Sub1) this).anInt5178 - 1)
					i_101_ = ((Class163_Sub1) this).anInt5178 - 1;
				int i_102_ = i_100_ + i_89_ * ((Class163_Sub1) this).anInt5206;
				for (int i_103_ = i_100_; i_103_ <= i_101_; i_103_++) {
					if ((float) i_83_ < ((Class163_Sub1) this).aFloatArray5204[i_102_])
						((Class163_Sub1) this).anIntArray5214[i_102_] = i_85_;
					i_102_++;
				}
				i_89_++;
				i_94_ += i_92_ + i_92_;
				i_93_ += i_92_++ + i_92_;
			}
		} else if (i_86_ == 1) {
			i_85_ = (((i_85_ & 0xff00ff) * i_95_ >> 8 & 0xff00ff)
					+ ((i_85_ & 0xff00) * i_95_ >> 8 & 0xff00) + (i_95_ << 24));
			int i_104_ = 256 - i_95_;
			while (i_89_ < i_82_) {
				for (/**/; i_94_ <= i_90_ || i_93_ <= i_90_; i_94_ += i_91_++
						+ i_91_)
					i_93_ += i_91_ + i_91_;
				int i_105_ = i - i_91_ + 1;
				if (i_105_ < ((Class163_Sub1) this).anInt5186)
					i_105_ = ((Class163_Sub1) this).anInt5186;
				int i_106_ = i + i_91_;
				if (i_106_ > ((Class163_Sub1) this).anInt5178)
					i_106_ = ((Class163_Sub1) this).anInt5178;
				int i_107_ = i_105_ + i_89_ * ((Class163_Sub1) this).anInt5206;
				for (int i_108_ = i_105_; i_108_ < i_106_; i_108_++) {
					if ((float) i_83_ < ((Class163_Sub1) this).aFloatArray5204[i_107_]) {
						int i_109_ = ((Class163_Sub1) this).anIntArray5214[i_107_];
						i_109_ = (((i_109_ & 0xff00ff) * i_104_ >> 8 & 0xff00ff) + ((i_109_ & 0xff00)
								* i_104_ >> 8 & 0xff00));
						((Class163_Sub1) this).anIntArray5214[i_107_] = i_85_
								+ i_109_;
					}
					i_107_++;
				}
				i_89_++;
				i_93_ -= i_92_-- + i_92_;
				i_94_ -= i_92_ + i_92_;
			}
			i_91_ = i_84_;
			i_92_ = -i_92_;
			i_94_ = i_92_ * i_92_ + i_90_;
			i_93_ = i_94_ - i_91_;
			i_94_ -= i_92_;
			while (i_89_ < i_88_) {
				for (/**/; i_94_ > i_90_ && i_93_ > i_90_; i_93_ -= i_91_
						+ i_91_)
					i_94_ -= i_91_-- + i_91_;
				int i_110_ = i - i_91_;
				if (i_110_ < ((Class163_Sub1) this).anInt5186)
					i_110_ = ((Class163_Sub1) this).anInt5186;
				int i_111_ = i + i_91_;
				if (i_111_ > ((Class163_Sub1) this).anInt5178 - 1)
					i_111_ = ((Class163_Sub1) this).anInt5178 - 1;
				int i_112_ = i_110_ + i_89_ * ((Class163_Sub1) this).anInt5206;
				for (int i_113_ = i_110_; i_113_ <= i_111_; i_113_++) {
					if ((float) i_83_ < ((Class163_Sub1) this).aFloatArray5204[i_112_]) {
						int i_114_ = ((Class163_Sub1) this).anIntArray5214[i_112_];
						i_114_ = (((i_114_ & 0xff00ff) * i_104_ >> 8 & 0xff00ff) + ((i_114_ & 0xff00)
								* i_104_ >> 8 & 0xff00));
						((Class163_Sub1) this).anIntArray5214[i_112_] = i_85_
								+ i_114_;
					}
					i_112_++;
				}
				i_89_++;
				i_94_ += i_92_ + i_92_;
				i_93_ += i_92_++ + i_92_;
			}
		} else if (i_86_ == 2) {
			while (i_89_ < i_82_) {
				for (/**/; i_94_ <= i_90_ || i_93_ <= i_90_; i_94_ += i_91_++
						+ i_91_)
					i_93_ += i_91_ + i_91_;
				int i_115_ = i - i_91_ + 1;
				if (i_115_ < ((Class163_Sub1) this).anInt5186)
					i_115_ = ((Class163_Sub1) this).anInt5186;
				int i_116_ = i + i_91_;
				if (i_116_ > ((Class163_Sub1) this).anInt5178)
					i_116_ = ((Class163_Sub1) this).anInt5178;
				int i_117_ = i_115_ + i_89_ * ((Class163_Sub1) this).anInt5206;
				for (int i_118_ = i_115_; i_118_ < i_116_; i_118_++) {
					if ((float) i_83_ < ((Class163_Sub1) this).aFloatArray5204[i_117_]) {
						int i_119_ = ((Class163_Sub1) this).anIntArray5214[i_117_];
						int i_120_ = i_85_ + i_119_;
						int i_121_ = (i_85_ & 0xff00ff) + (i_119_ & 0xff00ff);
						i_119_ = (i_121_ & 0x1000100)
								+ (i_120_ - i_121_ & 0x10000);
						((Class163_Sub1) this).anIntArray5214[i_117_] = i_120_
								- i_119_ | i_119_ - (i_119_ >>> 8);
					}
					i_117_++;
				}
				i_89_++;
				i_93_ -= i_92_-- + i_92_;
				i_94_ -= i_92_ + i_92_;
			}
			i_91_ = i_84_;
			i_92_ = -i_92_;
			i_94_ = i_92_ * i_92_ + i_90_;
			i_93_ = i_94_ - i_91_;
			i_94_ -= i_92_;
			while (i_89_ < i_88_) {
				for (/**/; i_94_ > i_90_ && i_93_ > i_90_; i_93_ -= i_91_
						+ i_91_)
					i_94_ -= i_91_-- + i_91_;
				int i_122_ = i - i_91_;
				if (i_122_ < ((Class163_Sub1) this).anInt5186)
					i_122_ = ((Class163_Sub1) this).anInt5186;
				int i_123_ = i + i_91_;
				if (i_123_ > ((Class163_Sub1) this).anInt5178 - 1)
					i_123_ = ((Class163_Sub1) this).anInt5178 - 1;
				int i_124_ = i_122_ + i_89_ * ((Class163_Sub1) this).anInt5206;
				for (int i_125_ = i_122_; i_125_ <= i_123_; i_125_++) {
					if ((float) i_83_ < ((Class163_Sub1) this).aFloatArray5204[i_124_]) {
						int i_126_ = ((Class163_Sub1) this).anIntArray5214[i_124_];
						int i_127_ = i_85_ + i_126_;
						int i_128_ = (i_85_ & 0xff00ff) + (i_126_ & 0xff00ff);
						i_126_ = (i_128_ & 0x1000100)
								+ (i_127_ - i_128_ & 0x10000);
						((Class163_Sub1) this).anIntArray5214[i_124_] = i_127_
								- i_126_ | i_126_ - (i_126_ >>> 8);
					}
					i_124_++;
				}
				i_89_++;
				i_94_ += i_92_ + i_92_;
				i_93_ += i_92_++ + i_92_;
			}
		} else
			throw new IllegalArgumentException();
	}

	final int[] na(int i, int i_129_, int i_130_, int i_131_) {
		int[] is = new int[i_130_ * i_131_];
		int i_132_ = 0;
		for (int i_133_ = 0; i_133_ < i_131_; i_133_++) {
			int i_134_ = (i_129_ + i_133_) * ((Class163_Sub1) this).anInt5206
					+ i;
			for (int i_135_ = 0; i_135_ < i_130_; i_135_++)
				is[i_132_++] = ((Class163_Sub1) this).anIntArray5214[i_134_
						+ i_135_];
		}
		return is;
	}

	final void method1016() {
		if (aBool5169) {
			Class95.method640(false, true, (byte) 66);
			aBool5169 = false;
		}
		((Class163_Sub1) this).aClass11_Sub30_5170 = null;
		aCanvas5175 = null;
		anInt5173 = 0;
		anInt5172 = 0;
		aClass213_5176 = null;
		aBool5174 = true;
	}

	final boolean method2298(int i) {
		if (aBool5191
				|| ((Class188) ((Class163) this).anInterface1_2118.method7(
						(byte) 127, i)).aBool2430)
			return true;
		return false;
	}

	final void method1068(int i) {
		Class206_Sub1.anInt6021 = Class206_Sub1.anInt6017 = i;
		if (((Class163_Sub1) this).anInt5194 > 1)
			throw new IllegalStateException("No MT");
		method1024(((Class163_Sub1) this).anInt5194);
		method1050(0);
	}

	final void H(int i, int i_136_, int i_137_, int[] is) {
		float f = ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7175) + ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7196)
				* (float) i
				+ (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7185)
				* (float) i_136_ + (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7166)
				* (float) i_137_));
		if (f == 0.0F)
			is[0] = is[1] = is[2] = -1;
		else {
			int i_138_ = (int) ((float) ((Class163_Sub1) this).anInt5215
					* (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7197 + ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7164)
							* (float) i
							+ (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7195)
							* (float) i_136_ + (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7193)
							* (float) i_137_)) / f);
			int i_139_ = (int) ((float) ((Class163_Sub1) this).anInt5205
					* (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7190 + ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7179)
							* (float) i
							+ (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7186)
							* (float) i_136_ + (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7182)
							* (float) i_137_)) / f);
			is[0] = i_138_ - ((Class163_Sub1) this).anInt5212;
			is[1] = i_139_ - ((Class163_Sub1) this).anInt5179;
			is[2] = (int) f;
		}
	}

	final void pa() {
		for (int i = 0; i < aClass363Array5188.length; i++) {
			((Class363) aClass363Array5188[i]).anInt4726 = ((Class363) aClass363Array5188[i]).anInt4729;
			((Class363) aClass363Array5188[i]).aBool4728 = false;
		}
	}

	final boolean method1063() {
		return false;
	}

	final void KA(int i, int i_140_, int i_141_, int i_142_) {
		if (i < 0)
			i = 0;
		if (i_140_ < 0)
			i_140_ = 0;
		if (i_141_ > ((Class163_Sub1) this).anInt5206)
			i_141_ = ((Class163_Sub1) this).anInt5206;
		if (i_142_ > anInt5183)
			i_142_ = anInt5183;
		((Class163_Sub1) this).anInt5186 = i;
		((Class163_Sub1) this).anInt5178 = i_141_;
		((Class163_Sub1) this).anInt5177 = i_140_;
		((Class163_Sub1) this).anInt5193 = i_142_;
		method2296();
	}

	final void U(int i, int i_143_, int i_144_, int i_145_, int i_146_) {
		if (i_143_ >= ((Class163_Sub1) this).anInt5177
				&& i_143_ < ((Class163_Sub1) this).anInt5193) {
			if (i < ((Class163_Sub1) this).anInt5186) {
				i_144_ -= ((Class163_Sub1) this).anInt5186 - i;
				i = ((Class163_Sub1) this).anInt5186;
			}
			if (i + i_144_ > ((Class163_Sub1) this).anInt5178)
				i_144_ = ((Class163_Sub1) this).anInt5178 - i;
			int i_147_ = i + i_143_ * ((Class163_Sub1) this).anInt5206;
			int i_148_ = i_145_ >>> 24;
			if (i_146_ == 0 || i_146_ == 1 && i_148_ == 255) {
				for (int i_149_ = 0; i_149_ < i_144_; i_149_++)
					((Class163_Sub1) this).anIntArray5214[i_147_ + i_149_] = i_145_;
			} else if (i_146_ == 1) {
				i_145_ = (((i_145_ & 0xff00ff) * i_148_ >> 8 & 0xff00ff)
						+ ((i_145_ & 0xff00) * i_148_ >> 8 & 0xff00) + (i_148_ << 24));
				int i_150_ = 256 - i_148_;
				for (int i_151_ = 0; i_151_ < i_144_; i_151_++) {
					int i_152_ = (((Class163_Sub1) this).anIntArray5214[i_147_
							+ i_151_]);
					i_152_ = (((i_152_ & 0xff00ff) * i_150_ >> 8 & 0xff00ff) + ((i_152_ & 0xff00)
							* i_150_ >> 8 & 0xff00));
					((Class163_Sub1) this).anIntArray5214[i_147_ + i_151_] = i_145_
							+ i_152_;
				}
			} else if (i_146_ == 2) {
				for (int i_153_ = 0; i_153_ < i_144_; i_153_++) {
					int i_154_ = (((Class163_Sub1) this).anIntArray5214[i_147_
							+ i_153_]);
					int i_155_ = i_145_ + i_154_;
					int i_156_ = (i_145_ & 0xff00ff) + (i_154_ & 0xff00ff);
					i_154_ = (i_156_ & 0x1000100) + (i_155_ - i_156_ & 0x10000);
					((Class163_Sub1) this).anIntArray5214[i_147_ + i_153_] = i_155_
							- i_154_ | i_154_ - (i_154_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	final void DA(int i, int i_157_, int i_158_, int i_159_) {
		((Class163_Sub1) this).anInt5181 = i;
		((Class163_Sub1) this).anInt5197 = i_157_;
		((Class163_Sub1) this).anInt5215 = i_158_;
		((Class163_Sub1) this).anInt5205 = i_159_;
		method2296();
	}

	final void method1006() {
		/* empty */
	}

	final void b(int i, int i_160_, int i_161_, int i_162_, double d) {
		int i_163_ = anInt5213 - i_161_;
		int i_164_ = i_160_ * anInt5213 + i;
		float[] fs = ((Class163_Sub1) this).aFloatArray5204;
		int i_165_ = 0;
		while (i_165_ < i_162_) {
			int i_166_ = 0;
			while (i_166_ < i_161_) {
				float f = fs[i_164_];
				if (f != 2.14748365E9F)
					fs[i_164_] = (float) ((double) f + d);
				i_166_++;
				i_164_++;
			}
			i_165_++;
			i_164_ += i_163_;
		}
	}

	final void ZA(int i, float f, float f_167_, float f_168_, float f_169_,
			float f_170_) {
		((Class163_Sub1) this).anInt5199 = (int) (f * 65535.0F);
		((Class163_Sub1) this).anInt5208 = (int) (f_167_ * 65535.0F);
		float f_171_ = (float) Math.sqrt((double) (f_168_ * f_168_ + f_169_
				* f_169_ + f_170_ * f_170_));
		((Class163_Sub1) this).anInt5210 = (int) (f_168_ * 65535.0F / f_171_);
		((Class163_Sub1) this).anInt5189 = (int) (f_169_ * 65535.0F / f_171_);
		((Class163_Sub1) this).anInt5180 = (int) (f_170_ * 65535.0F / f_171_);
	}

	final Class253 method1014(int i, int i_172_, int i_173_, int i_174_,
			boolean bool) {
		int[] is = new int[i_173_ * i_174_];
		int i_175_ = i_172_ * ((Class163_Sub1) this).anInt5206 + i;
		int i_176_ = ((Class163_Sub1) this).anInt5206 - i_173_;
		for (int i_177_ = 0; i_177_ < i_174_; i_177_++) {
			int i_178_ = i_177_ * i_173_;
			for (int i_179_ = 0; i_179_ < i_173_; i_179_++)
				is[i_178_ + i_179_] = ((Class163_Sub1) this).anIntArray5214[i_175_++];
			i_175_ += i_176_;
		}
		if (bool)
			return new Class253_Sub3_Sub2(this, is, i_173_, i_174_);
		return new Class253_Sub3_Sub3(this, is, i_173_, i_174_);
	}

	final void method1008(Class116 class116, int i) {
		Class363 class363 = method2306(Thread.currentThread());
		Class376_Sub1 class376_sub1 = (((Class246) ((Class116) class116).aClass246_1584).aClass376_Sub1_3329);
		for (Class376_Sub1 class376_sub1_180_ = ((Class376_Sub1) class376_sub1).aClass376_Sub1_5095; class376_sub1_180_ != class376_sub1; class376_sub1_180_ = ((Class376_Sub1) class376_sub1_180_).aClass376_Sub1_5095) {
			Class376_Sub1_Sub1 class376_sub1_sub1 = (Class376_Sub1_Sub1) class376_sub1_180_;
			int i_181_ = ((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8689 >> 12;
			int i_182_ = ((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8691 >> 12;
			int i_183_ = ((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8684 >> 12;
			float f = ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7175) + ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7196 * (float) i_181_)
					+ (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7185 * (float) i_182_) + (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7166 * (float) i_183_)));
			if (!(f < (float) ((Class163_Sub1) this).anInt5200)
					&& !(f > (float) ((Class363) class363).anInt4724)) {
				int i_184_ = (((Class163_Sub1) this).anInt5181 + (int) ((float) ((Class163_Sub1) this).anInt5215
						* ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7197) + ((((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7164)
								* (float) i_181_
								+ (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7195 * (float) i_182_) + (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7193 * (float) i_183_))) / (float) i));
				int i_185_ = (((Class163_Sub1) this).anInt5197 + (int) ((float) ((Class163_Sub1) this).anInt5205
						* ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7190) + ((((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7179)
								* (float) i_181_
								+ (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7186 * (float) i_182_) + (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7182 * (float) i_183_))) / (float) i));
				if (i_184_ >= ((Class163_Sub1) this).anInt5186
						&& i_184_ <= ((Class163_Sub1) this).anInt5178
						&& i_185_ >= ((Class163_Sub1) this).anInt5177
						&& i_185_ <= ((Class163_Sub1) this).anInt5193) {
					if (f == 0.0F)
						f = 1.0F;
					method2301(
							class376_sub1_sub1,
							i_184_,
							i_185_,
							(int) f,
							((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8692)
									* ((Class163_Sub1) this).anInt5215 >> 12)
									/ i);
				}
			}
		}
	}

	final int E() {
		return 0;
	}

	final void f(int i, int i_186_) {
		Class363 class363 = method2306(Thread.currentThread());
		((Class163_Sub1) this).anInt5200 = i;
		((Class163_Sub1) this).anInt5201 = i_186_;
		((Class363) class363).anInt4724 = ((Class163_Sub1) this).anInt5201 - 255;
	}

	final Interface10 method1066(Interface8 interface8, Interface26 interface26) {
		return new Class340(this, (Class253) interface8, (Class377) interface26);
	}

	final void method1011(int i, int i_187_, int i_188_, int i_189_,
			int i_190_, int i_191_, Class72 class72, int i_192_, int i_193_) {
		Class72_Sub2 class72_sub2 = (Class72_Sub2) class72;
		int[] is = ((Class72_Sub2) class72_sub2).anIntArray6909;
		int[] is_194_ = ((Class72_Sub2) class72_sub2).anIntArray6911;
		int i_195_ = (((Class163_Sub1) this).anInt5177 > i_193_ ? ((Class163_Sub1) this).anInt5177
				: i_193_);
		int i_196_ = (((Class163_Sub1) this).anInt5193 < i_193_ + is.length ? ((Class163_Sub1) this).anInt5193
				: i_193_ + is.length);
		i_188_ -= i;
		i_189_ -= i_187_;
		if (i_188_ + i_189_ < 0) {
			i += i_188_;
			i_188_ = -i_188_;
			i_187_ += i_189_;
			i_189_ = -i_189_;
		}
		if (i_188_ > i_189_) {
			i_187_ <<= 16;
			i_187_ += 32768;
			i_189_ <<= 16;
			int i_197_ = (int) Math.floor((double) i_189_ / (double) i_188_
					+ 0.5);
			i_188_ += i;
			if (i < ((Class163_Sub1) this).anInt5186) {
				i_187_ += i_197_ * (((Class163_Sub1) this).anInt5186 - i);
				i = ((Class163_Sub1) this).anInt5186;
			}
			if (i_188_ >= ((Class163_Sub1) this).anInt5178)
				i_188_ = ((Class163_Sub1) this).anInt5178 - 1;
			int i_198_ = i_190_ >>> 24;
			if (i_191_ == 0 || i_191_ == 1 && i_198_ == 255) {
				for (/**/; i <= i_188_; i++) {
					int i_199_ = i_187_ >> 16;
					int i_200_ = i_199_ - i_193_;
					if (i_199_ >= i_195_ && i_199_ < i_196_) {
						int i_201_ = i_192_ + is[i_200_];
						if (i >= i_201_ && i < i_201_ + is_194_[i_200_])
							((Class163_Sub1) this).anIntArray5214[i + i_199_
									* ((Class163_Sub1) this).anInt5206] = i_190_;
					}
					i_187_ += i_197_;
				}
				return;
			}
			if (i_191_ == 1) {
				i_190_ = (((i_190_ & 0xff00ff) * i_198_ >> 8 & 0xff00ff)
						+ ((i_190_ & 0xff00) * i_198_ >> 8 & 0xff00) + (i_198_ << 24));
				int i_202_ = 256 - i_198_;
				for (/**/; i <= i_188_; i++) {
					int i_203_ = i_187_ >> 16;
					int i_204_ = i_203_ - i_193_;
					if (i_203_ >= i_195_ && i_203_ < i_196_) {
						int i_205_ = i_192_ + is[i_204_];
						if (i >= i_205_ && i < i_205_ + is_194_[i_204_]) {
							int i_206_ = i + i_203_
									* (((Class163_Sub1) this).anInt5206);
							int i_207_ = (((Class163_Sub1) this).anIntArray5214[i_206_]);
							i_207_ = (((i_207_ & 0xff00ff) * i_202_ >> 8 & 0xff00ff) + ((i_207_ & 0xff00)
									* i_202_ >> 8 & 0xff00));
							((Class163_Sub1) this).anIntArray5214[i_206_] = i_190_
									+ i_207_;
						}
					}
					i_187_ += i_197_;
				}
				return;
			}
			if (i_191_ == 2) {
				for (/**/; i <= i_188_; i++) {
					int i_208_ = i_187_ >> 16;
					int i_209_ = i_208_ - i_193_;
					if (i_208_ >= i_195_ && i_208_ < i_196_) {
						int i_210_ = i_192_ + is[i_209_];
						if (i >= i_210_ && i < i_210_ + is_194_[i_209_]) {
							int i_211_ = i + i_208_
									* (((Class163_Sub1) this).anInt5206);
							int i_212_ = (((Class163_Sub1) this).anIntArray5214[i_211_]);
							int i_213_ = i_190_ + i_212_;
							int i_214_ = (i_190_ & 0xff00ff)
									+ (i_212_ & 0xff00ff);
							i_212_ = (i_214_ & 0x1000100)
									+ (i_213_ - i_214_ & 0x10000);
							((Class163_Sub1) this).anIntArray5214[i_211_] = i_213_
									- i_212_ | i_212_ - (i_212_ >>> 8);
						}
					}
					i_187_ += i_197_;
				}
				return;
			}
			throw new IllegalArgumentException();
		}
		i <<= 16;
		i += 32768;
		i_188_ <<= 16;
		int i_215_ = (int) Math.floor((double) i_188_ / (double) i_189_ + 0.5);
		i_189_ += i_187_;
		if (i_187_ < i_195_) {
			i += i_215_ * (i_195_ - i_187_);
			i_187_ = i_195_;
		}
		if (i_189_ >= i_196_)
			i_189_ = i_196_ - 1;
		int i_216_ = i_190_ >>> 24;
		if (i_191_ == 0 || i_191_ == 1 && i_216_ == 255) {
			for (/**/; i_187_ <= i_189_; i_187_++) {
				int i_217_ = i >> 16;
				int i_218_ = i_187_ - i_193_;
				int i_219_ = i_192_ + is[i_218_];
				if (i_217_ >= ((Class163_Sub1) this).anInt5186
						&& i_217_ < ((Class163_Sub1) this).anInt5178
						&& i_217_ >= i_219_
						&& i_217_ < i_219_ + is_194_[i_218_])
					((Class163_Sub1) this).anIntArray5214[i_217_ + i_187_
							* ((Class163_Sub1) this).anInt5206] = i_190_;
				i += i_215_;
			}
		} else if (i_191_ == 1) {
			i_190_ = (((i_190_ & 0xff00ff) * i_216_ >> 8 & 0xff00ff)
					+ ((i_190_ & 0xff00) * i_216_ >> 8 & 0xff00) + (i_216_ << 24));
			int i_220_ = 256 - i_216_;
			for (/**/; i_187_ <= i_189_; i_187_++) {
				int i_221_ = i >> 16;
				int i_222_ = i_187_ - i_193_;
				int i_223_ = i_192_ + is[i_222_];
				if (i_221_ >= ((Class163_Sub1) this).anInt5186
						&& i_221_ < ((Class163_Sub1) this).anInt5178
						&& i_221_ >= i_223_
						&& i_221_ < i_223_ + is_194_[i_222_]) {
					int i_224_ = i_221_ + i_187_
							* ((Class163_Sub1) this).anInt5206;
					int i_225_ = ((Class163_Sub1) this).anIntArray5214[i_224_];
					i_225_ = (((i_225_ & 0xff00ff) * i_220_ >> 8 & 0xff00ff) + ((i_225_ & 0xff00)
							* i_220_ >> 8 & 0xff00));
					((Class163_Sub1) this).anIntArray5214[i_221_ + i_187_
							* ((Class163_Sub1) this).anInt5206] = i_190_
							+ i_225_;
				}
				i += i_215_;
			}
		} else if (i_191_ == 2) {
			for (/**/; i_187_ <= i_189_; i_187_++) {
				int i_226_ = i >> 16;
				int i_227_ = i_187_ - i_193_;
				int i_228_ = i_192_ + is[i_227_];
				if (i_226_ >= ((Class163_Sub1) this).anInt5186
						&& i_226_ < ((Class163_Sub1) this).anInt5178
						&& i_226_ >= i_228_
						&& i_226_ < i_228_ + is_194_[i_227_]) {
					int i_229_ = i_226_ + i_187_
							* ((Class163_Sub1) this).anInt5206;
					int i_230_ = ((Class163_Sub1) this).anIntArray5214[i_229_];
					int i_231_ = i_190_ + i_230_;
					int i_232_ = (i_190_ & 0xff00ff) + (i_230_ & 0xff00ff);
					i_230_ = (i_232_ & 0x1000100) + (i_231_ - i_232_ & 0x10000);
					((Class163_Sub1) this).anIntArray5214[i_229_] = i_231_
							- i_230_ | i_230_ - (i_230_ >>> 8);
				}
				i += i_215_;
			}
		} else
			throw new IllegalArgumentException();
	}

	final void EA(int i, int i_233_, int i_234_, int i_235_) {
		Class363 class363 = method2306(Thread.currentThread());
		((Class363) class363).anInt4720 = i;
		((Class363) class363).anInt4726 = i_233_;
		((Class363) class363).anInt4735 = i_234_;
	}

	final int method1077(int i, int i_236_) {
		return i | i_236_;
	}

	final void la() {
		((Class163_Sub1) this).anInt5186 = 0;
		((Class163_Sub1) this).anInt5177 = 0;
		((Class163_Sub1) this).anInt5178 = ((Class163_Sub1) this).anInt5206;
		((Class163_Sub1) this).anInt5193 = anInt5183;
		method2296();
	}

	final void method1037(int[] is) {
		is[0] = ((Class163_Sub1) this).anInt5206;
		is[1] = anInt5183;
	}

	final Class253 method1081(Class80 class80, boolean bool) {
		int[] is = ((Class80) class80).anIntArray1074;
		byte[] is_237_ = ((Class80) class80).aByteArray1079;
		int i = ((Class80) class80).anInt1075;
		int i_238_ = ((Class80) class80).anInt1082;
		Class253_Sub3 class253_sub3;
		if (bool && ((Class80) class80).aByteArray1078 == null) {
			int[] is_239_ = new int[is.length];
			byte[] is_240_ = new byte[i * i_238_];
			for (int i_241_ = 0; i_241_ < i_238_; i_241_++) {
				int i_242_ = i_241_ * i;
				for (int i_243_ = 0; i_243_ < i; i_243_++)
					is_240_[i_242_ + i_243_] = is_237_[i_242_ + i_243_];
			}
			for (int i_244_ = 0; i_244_ < is.length; i_244_++)
				is_239_[i_244_] = is[i_244_];
			class253_sub3 = new Class253_Sub3_Sub1(this, is_240_, is_239_, i,
					i_238_);
		} else {
			int[] is_245_ = new int[i * i_238_];
			byte[] is_246_ = ((Class80) class80).aByteArray1078;
			if (is_246_ != null) {
				for (int i_247_ = 0; i_247_ < i_238_; i_247_++) {
					int i_248_ = i_247_ * i;
					for (int i_249_ = 0; i_249_ < i; i_249_++)
						is_245_[i_248_ + i_249_] = (is[is_237_[i_248_ + i_249_] & 0xff] | is_246_[i_248_
								+ i_249_] << 24);
				}
				class253_sub3 = new Class253_Sub3_Sub2(this, is_245_, i, i_238_);
			} else {
				for (int i_250_ = 0; i_250_ < i_238_; i_250_++) {
					int i_251_ = i_250_ * i;
					for (int i_252_ = 0; i_252_ < i; i_252_++) {
						int i_253_ = is[is_237_[i_251_ + i_252_] & 0xff];
						is_245_[i_251_ + i_252_] = i_253_ != 0 ? ~0xffffff
								| i_253_ : 0;
					}
				}
				class253_sub3 = new Class253_Sub3_Sub3(this, is_245_, i, i_238_);
			}
		}
		class253_sub3.method1607(((Class80) class80).anInt1080,
				((Class80) class80).anInt1077, ((Class80) class80).anInt1076,
				((Class80) class80).anInt1081);
		return class253_sub3;
	}

	final void GA(int i) {
		aa(0, 0, ((Class163_Sub1) this).anInt5206, anInt5183, i, 0);
	}

	final void method1058(int i, int i_254_, int i_255_, int i_256_,
			int i_257_, int i_258_, Class72 class72, int i_259_, int i_260_,
			int i_261_, int i_262_, int i_263_) {
		Class72_Sub2 class72_sub2 = (Class72_Sub2) class72;
		int[] is = ((Class72_Sub2) class72_sub2).anIntArray6909;
		int[] is_264_ = ((Class72_Sub2) class72_sub2).anIntArray6911;
		int i_265_ = (((Class163_Sub1) this).anInt5177 > i_260_ ? ((Class163_Sub1) this).anInt5177
				: i_260_);
		int i_266_ = (((Class163_Sub1) this).anInt5193 < i_260_ + is.length ? ((Class163_Sub1) this).anInt5193
				: i_260_ + is.length);
		i_263_ <<= 8;
		i_261_ <<= 8;
		i_262_ <<= 8;
		int i_267_ = i_261_ + i_262_;
		i_263_ %= i_267_;
		i_255_ -= i;
		i_256_ -= i_254_;
		if (i_255_ + i_256_ < 0) {
			int i_268_ = (int) (Math.sqrt((double) (i_255_ * i_255_ + i_256_
					* i_256_)) * 256.0);
			int i_269_ = i_268_ % i_267_;
			i_263_ = i_267_ + i_261_ - i_263_ - i_269_;
			i_263_ %= i_267_;
			if (i_263_ < 0)
				i_263_ += i_267_;
			i += i_255_;
			i_255_ = -i_255_;
			i_254_ += i_256_;
			i_256_ = -i_256_;
		}
		if (i_255_ > i_256_) {
			i_254_ <<= 16;
			i_254_ += 32768;
			i_256_ <<= 16;
			int i_270_ = (int) Math.floor((double) i_256_ / (double) i_255_
					+ 0.5);
			i_255_ += i;
			int i_271_ = i_257_ >>> 24;
			int i_272_ = (int) Math.sqrt((double) (65536 + (i_270_ >> 8)
					* (i_270_ >> 8)));
			if (i_258_ == 0 || i_258_ == 1 && i_271_ == 255) {
				while (i <= i_255_) {
					int i_273_ = i_254_ >> 16;
					int i_274_ = i_273_ - i_260_;
					if (i >= ((Class163_Sub1) this).anInt5186
							&& i < ((Class163_Sub1) this).anInt5178
							&& i_273_ >= i_265_ && i_273_ < i_266_
							&& i_263_ < i_261_) {
						int i_275_ = i_259_ + is[i_274_];
						if (i >= i_275_ && i < i_275_ + is_264_[i_274_])
							((Class163_Sub1) this).anIntArray5214[i + i_273_
									* ((Class163_Sub1) this).anInt5206] = i_257_;
					}
					i_254_ += i_270_;
					i++;
					i_263_ += i_272_;
					i_263_ %= i_267_;
				}
				return;
			}
			if (i_258_ == 1) {
				i_257_ = (((i_257_ & 0xff00ff) * i_271_ >> 8 & 0xff00ff)
						+ ((i_257_ & 0xff00) * i_271_ >> 8 & 0xff00) + (i_271_ << 24));
				int i_276_ = 256 - i_271_;
				while (i <= i_255_) {
					int i_277_ = i_254_ >> 16;
					int i_278_ = i_277_ - i_260_;
					if (i >= ((Class163_Sub1) this).anInt5186
							&& i < ((Class163_Sub1) this).anInt5178
							&& i_277_ >= i_265_ && i_277_ < i_266_
							&& i_263_ < i_261_) {
						int i_279_ = i_259_ + is[i_278_];
						if (i >= i_279_ && i < i_279_ + is_264_[i_278_]) {
							int i_280_ = i + i_277_
									* (((Class163_Sub1) this).anInt5206);
							int i_281_ = (((Class163_Sub1) this).anIntArray5214[i_280_]);
							i_281_ = (((i_281_ & 0xff00ff) * i_276_ >> 8 & 0xff00ff) + ((i_281_ & 0xff00)
									* i_276_ >> 8 & 0xff00));
							((Class163_Sub1) this).anIntArray5214[i_280_] = i_257_
									+ i_281_;
						}
					}
					i_254_ += i_270_;
					i++;
					i_263_ += i_272_;
					i_263_ %= i_267_;
				}
				return;
			}
			if (i_258_ == 2) {
				while (i <= i_255_) {
					int i_282_ = i_254_ >> 16;
					int i_283_ = i_282_ - i_260_;
					if (i >= ((Class163_Sub1) this).anInt5186
							&& i < ((Class163_Sub1) this).anInt5178
							&& i_282_ >= i_265_ && i_282_ < i_266_
							&& i_263_ < i_261_) {
						int i_284_ = i_259_ + is[i_283_];
						if (i >= i_284_ && i < i_284_ + is_264_[i_283_]) {
							int i_285_ = i + i_282_
									* (((Class163_Sub1) this).anInt5206);
							int i_286_ = (((Class163_Sub1) this).anIntArray5214[i_285_]);
							int i_287_ = i_257_ + i_286_;
							int i_288_ = (i_257_ & 0xff00ff)
									+ (i_286_ & 0xff00ff);
							i_286_ = (i_288_ & 0x1000100)
									+ (i_287_ - i_288_ & 0x10000);
							((Class163_Sub1) this).anIntArray5214[i_285_] = i_287_
									- i_286_ | i_286_ - (i_286_ >>> 8);
						}
					}
					i_254_ += i_270_;
					i++;
					i_263_ += i_272_;
					i_263_ %= i_267_;
				}
				return;
			}
			throw new IllegalArgumentException();
		}
		i <<= 16;
		i += 32768;
		i_255_ <<= 16;
		int i_289_ = (int) Math.floor((double) i_255_ / (double) i_256_ + 0.5);
		int i_290_ = (int) Math.sqrt((double) (65536 + (i_289_ >> 8)
				* (i_289_ >> 8)));
		i_256_ += i_254_;
		int i_291_ = i_257_ >>> 24;
		if (i_258_ == 0 || i_258_ == 1 && i_291_ == 255) {
			while (i_254_ <= i_256_) {
				int i_292_ = i >> 16;
				int i_293_ = i_254_ - i_260_;
				if (i_254_ >= i_265_ && i_254_ < i_266_
						&& i_292_ >= ((Class163_Sub1) this).anInt5186
						&& i_292_ < ((Class163_Sub1) this).anInt5178
						&& i_263_ < i_261_ && i_292_ >= i_259_ + is[i_293_]
						&& i_292_ < i_259_ + is[i_293_] + is_264_[i_293_])
					((Class163_Sub1) this).anIntArray5214[i_292_ + i_254_
							* ((Class163_Sub1) this).anInt5206] = i_257_;
				i += i_289_;
				i_254_++;
				i_263_ += i_290_;
				i_263_ %= i_267_;
			}
		} else if (i_258_ == 1) {
			i_257_ = (((i_257_ & 0xff00ff) * i_291_ >> 8 & 0xff00ff)
					+ ((i_257_ & 0xff00) * i_291_ >> 8 & 0xff00) + (i_291_ << 24));
			int i_294_ = 256 - i_291_;
			while (i_254_ <= i_256_) {
				int i_295_ = i >> 16;
				int i_296_ = i_254_ - i_260_;
				if (i_254_ >= i_265_ && i_254_ < i_266_
						&& i_295_ >= ((Class163_Sub1) this).anInt5186
						&& i_295_ < ((Class163_Sub1) this).anInt5178
						&& i_263_ < i_261_ && i_295_ >= i_259_ + is[i_296_]
						&& i_295_ < i_259_ + is[i_296_] + is_264_[i_296_]) {
					int i_297_ = i_295_ + i_254_
							* ((Class163_Sub1) this).anInt5206;
					int i_298_ = ((Class163_Sub1) this).anIntArray5214[i_297_];
					i_298_ = (((i_298_ & 0xff00ff) * i_294_ >> 8 & 0xff00ff) + ((i_298_ & 0xff00)
							* i_294_ >> 8 & 0xff00));
					((Class163_Sub1) this).anIntArray5214[i_295_ + i_254_
							* ((Class163_Sub1) this).anInt5206] = i_257_
							+ i_298_;
				}
				i += i_289_;
				i_254_++;
				i_263_ += i_290_;
				i_263_ %= i_267_;
			}
		} else if (i_258_ == 2) {
			while (i_254_ <= i_256_) {
				int i_299_ = i >> 16;
				int i_300_ = i_254_ - i_260_;
				if (i_254_ >= i_265_ && i_254_ < i_266_
						&& i_299_ >= ((Class163_Sub1) this).anInt5186
						&& i_299_ < ((Class163_Sub1) this).anInt5178
						&& i_263_ < i_261_ && i_299_ >= i_259_ + is[i_300_]
						&& i_299_ < i_259_ + is[i_300_] + is_264_[i_300_]) {
					int i_301_ = i_299_ + i_254_
							* ((Class163_Sub1) this).anInt5206;
					int i_302_ = ((Class163_Sub1) this).anIntArray5214[i_301_];
					int i_303_ = i_257_ + i_302_;
					int i_304_ = (i_257_ & 0xff00ff) + (i_302_ & 0xff00ff);
					i_302_ = (i_304_ & 0x1000100) + (i_303_ - i_304_ & 0x10000);
					((Class163_Sub1) this).anIntArray5214[i_301_] = i_303_
							- i_302_ | i_302_ - (i_302_ >>> 8);
				}
				i += i_289_;
				i_254_++;
				i_263_ += i_290_;
				i_263_ %= i_267_;
			}
		} else
			throw new IllegalArgumentException();
	}

	final void method1005() {
		aClass22_5182.method189((byte) -34);
		aClass22_5190.method189((byte) 11);
	}

	final void method1034(int i) {
		aClass363Array5188[i].method2153((byte) -126, null);
	}

	final Class253 method1009(int i, int i_305_, boolean bool) {
		if (bool)
			return new Class253_Sub3_Sub2(this, i, i_305_);
		return new Class253_Sub3_Sub3(this, i, i_305_);
	}

	final Class33 method1045() {
		return ((Class163_Sub1) this).aClass33_Sub3_5207;
	}

	private final void method2299(int i, int i_306_, int i_307_, int i_308_,
			int i_309_, int i_310_, int i_311_, int i_312_) {
		if (i_306_ >= ((Class163_Sub1) this).anInt5177
				&& i_306_ < ((Class163_Sub1) this).anInt5193) {
			int i_313_ = i + i_306_ * ((Class163_Sub1) this).anInt5206;
			int i_314_ = i_308_ >>> 24;
			int i_315_ = i_310_ + i_311_;
			int i_316_ = i_312_ % i_315_;
			if (i_309_ == 0 || i_309_ == 1 && i_314_ == 255) {
				int i_317_ = 0;
				while (i_317_ < i_307_) {
					if (i + i_317_ >= ((Class163_Sub1) this).anInt5186
							&& i + i_317_ < ((Class163_Sub1) this).anInt5178
							&& i_316_ < i_310_)
						((Class163_Sub1) this).anIntArray5214[i_313_ + i_317_] = i_308_;
					i_317_++;
					i_316_ = ++i_316_ % i_315_;
				}
			} else if (i_309_ == 1) {
				i_308_ = (((i_308_ & 0xff00ff) * i_314_ >> 8 & 0xff00ff)
						+ ((i_308_ & 0xff00) * i_314_ >> 8 & 0xff00) + (i_314_ << 24));
				int i_318_ = 256 - i_314_;
				int i_319_ = 0;
				while (i_319_ < i_307_) {
					if (i + i_319_ >= ((Class163_Sub1) this).anInt5186
							&& i + i_319_ < ((Class163_Sub1) this).anInt5178
							&& i_316_ < i_310_) {
						int i_320_ = (((Class163_Sub1) this).anIntArray5214[i_313_
								+ i_319_]);
						i_320_ = (((i_320_ & 0xff00ff) * i_318_ >> 8 & 0xff00ff) + ((i_320_ & 0xff00)
								* i_318_ >> 8 & 0xff00));
						((Class163_Sub1) this).anIntArray5214[i_313_ + i_319_] = i_308_
								+ i_320_;
					}
					i_319_++;
					i_316_ = ++i_316_ % i_315_;
				}
			} else if (i_309_ == 2) {
				int i_321_ = 0;
				while (i_321_ < i_307_) {
					if (i + i_321_ >= ((Class163_Sub1) this).anInt5186
							&& i + i_321_ < ((Class163_Sub1) this).anInt5178
							&& i_316_ < i_310_) {
						int i_322_ = (((Class163_Sub1) this).anIntArray5214[i_313_
								+ i_321_]);
						int i_323_ = i_308_ + i_322_;
						int i_324_ = (i_308_ & 0xff00ff) + (i_322_ & 0xff00ff);
						i_322_ = (i_324_ & 0x1000100)
								+ (i_323_ - i_324_ & 0x10000);
						((Class163_Sub1) this).anIntArray5214[i_313_ + i_321_] = i_323_
								- i_322_ | i_322_ - (i_322_ >>> 8);
					}
					i_321_++;
					i_316_ = ++i_316_ % i_315_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	final int method1026() {
		return 0;
	}

	private Class163_Sub1(Interface1 interface1) {
		super(interface1);
		((Class163_Sub1) this).anInt5177 = 0;
		((Class163_Sub1) this).anInt5199 = 45823;
		((Class163_Sub1) this).anInt5193 = 0;
		((Class163_Sub1) this).anInt5208 = 78642;
		anInt5184 = 0;
		((Class163_Sub1) this).anInt5201 = 3500;
		((Class163_Sub1) this).anInt5200 = 50;
		((Class163_Sub1) this).anInt5186 = 0;
		((Class163_Sub1) this).anInt5211 = 128;
		((Class163_Sub1) this).anInt5205 = 512;
		anInt5209 = 0;
		((Class163_Sub1) this).anInt5215 = 512;
		aClass22_5190 = new Class22(16);
		anInt5217 = -1;
		try {
			aClass22_5182 = new Class22(256);
			((Class163_Sub1) this).aClass33_Sub3_5207 = new Class33_Sub3();
			method1024(1);
			method1050(0);
			Class258.method1648(-28, true, true);
			aBool5169 = true;
			anInt5171 = (int) Class137.method878((byte) -106);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			this.method1072(1);
			throw new RuntimeException("");
		}
	}

	final void method1025(Canvas canvas, int i, int i_325_) {
		Class11_Sub30 class11_sub30 = ((Class11_Sub30) aClass213_5176
				.method1369((byte) 26, (long) canvas.hashCode()));
		if (class11_sub30 == null) {
			class11_sub30 = Class21.method178(i, i_325_, 4380, canvas);
			aClass213_5176.method1368((long) canvas.hashCode(), class11_sub30,
					(byte) -26);
		} else if (((Class11_Sub30) class11_sub30).anInt6613 != i
				|| ((Class11_Sub30) class11_sub30).anInt6617 != i_325_)
			method1013(canvas, i, i_325_);
	}

	final void ra(int i, int i_326_, int i_327_, int i_328_) {
		for (int i_329_ = 0; i_329_ < aClass363Array5188.length; i_329_++) {
			((Class363) aClass363Array5188[i_329_]).anInt4729 = ((Class363) aClass363Array5188[i_329_]).anInt4726;
			((Class363) aClass363Array5188[i_329_]).anInt4720 = i;
			((Class363) aClass363Array5188[i_329_]).anInt4726 = i_326_;
			((Class363) aClass363Array5188[i_329_]).anInt4735 = i_327_;
			((Class363) aClass363Array5188[i_329_]).aBool4728 = true;
		}
	}

	final void method1078() {
		/* empty */
	}

	final Class206 method1020(Class179 class179, int i, int i_330_, int i_331_,
			int i_332_) {
		return new Class206_Sub1(this, class179, i, i_331_, i_332_, i_330_);
	}

	final int[] method2300(int i) {
		Class11_Sub40 class11_sub40;
		synchronized (aClass22_5182) {
			class11_sub40 = (Class11_Sub40) aClass22_5182.method188((long) i,
					(byte) -107);
			if (class11_sub40 == null) {
				if (!((Class163) this).anInterface1_2118.method2(i, 71))
					return null;
				Class188 class188 = ((Class163) this).anInterface1_2118
						.method7((byte) 127, i);
				int i_333_ = (((Class188) class188).aBool2430 || aBool5191 ? 64
						: ((Class163_Sub1) this).anInt5211);
				class11_sub40 = (new Class11_Sub40(i, i_333_,
						((Class163) this).anInterface1_2118.method6(true,
								i_333_, 20377, i_333_, 0.7F, i),
						((Class188) class188).anInt2425 != 1));
				aClass22_5182.method184((byte) 125, class11_sub40, (long) i);
			}
		}
		((Class11_Sub40) class11_sub40).aBool7229 = true;
		return class11_sub40.method2931();
	}

	final void P(int i, int i_334_, int i_335_, int i_336_, int i_337_) {
		if (i >= ((Class163_Sub1) this).anInt5186
				&& i < ((Class163_Sub1) this).anInt5178) {
			if (i_334_ < ((Class163_Sub1) this).anInt5177) {
				i_335_ -= ((Class163_Sub1) this).anInt5177 - i_334_;
				i_334_ = ((Class163_Sub1) this).anInt5177;
			}
			if (i_334_ + i_335_ > ((Class163_Sub1) this).anInt5193)
				i_335_ = ((Class163_Sub1) this).anInt5193 - i_334_;
			int i_338_ = i + i_334_ * ((Class163_Sub1) this).anInt5206;
			int i_339_ = i_336_ >>> 24;
			if (i_337_ == 0 || i_337_ == 1 && i_339_ == 255) {
				for (int i_340_ = 0; i_340_ < i_335_; i_340_++)
					((Class163_Sub1) this).anIntArray5214[i_338_ + i_340_
							* ((Class163_Sub1) this).anInt5206] = i_336_;
			} else if (i_337_ == 1) {
				i_336_ = (((i_336_ & 0xff00ff) * i_339_ >> 8 & 0xff00ff)
						+ ((i_336_ & 0xff00) * i_339_ >> 8 & 0xff00) + (i_339_ << 24));
				int i_341_ = 256 - i_339_;
				for (int i_342_ = 0; i_342_ < i_335_; i_342_++) {
					int i_343_ = i_338_ + i_342_
							* ((Class163_Sub1) this).anInt5206;
					int i_344_ = ((Class163_Sub1) this).anIntArray5214[i_343_];
					i_344_ = (((i_344_ & 0xff00ff) * i_341_ >> 8 & 0xff00ff) + ((i_344_ & 0xff00)
							* i_341_ >> 8 & 0xff00));
					((Class163_Sub1) this).anIntArray5214[i_343_] = i_336_
							+ i_344_;
				}
			} else if (i_337_ == 2) {
				for (int i_345_ = 0; i_345_ < i_335_; i_345_++) {
					int i_346_ = i_338_ + i_345_
							* ((Class163_Sub1) this).anInt5206;
					int i_347_ = ((Class163_Sub1) this).anIntArray5214[i_346_];
					int i_348_ = i_336_ + i_347_;
					int i_349_ = (i_336_ & 0xff00ff) + (i_347_ & 0xff00ff);
					i_347_ = (i_349_ & 0x1000100) + (i_348_ - i_349_ & 0x10000);
					((Class163_Sub1) this).anIntArray5214[i_346_] = i_348_
							- i_347_ | i_347_ - (i_347_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	Class163_Sub1(Canvas canvas, Interface1 interface1, int i, int i_350_) {
		this(interface1);
		try {
			method1025(canvas, i, i_350_);
			method1054(canvas);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			this.method1072(1);
			throw new RuntimeException("");
		}
	}

	final void method1079(int i, int i_351_, int i_352_, int i_353_,
			int i_354_, int i_355_, int i_356_, int i_357_, int i_358_,
			int i_359_, int i_360_, int i_361_, int i_362_) {
		Class363 class363 = method2306(Thread.currentThread());
		Class296 class296 = ((Class363) class363).aClass296_4767;
		((Class296) class296).aBool4003 = false;
		i -= ((Class163_Sub1) this).anInt5212;
		i_353_ -= ((Class163_Sub1) this).anInt5212;
		i_356_ -= ((Class163_Sub1) this).anInt5212;
		i_351_ -= ((Class163_Sub1) this).anInt5179;
		i_354_ -= ((Class163_Sub1) this).anInt5179;
		i_357_ -= ((Class163_Sub1) this).anInt5179;
		((Class296) class296).aBool4001 = (i < 0
				|| i > ((Class296) class296).anInt3995 || i_353_ < 0
				|| i_353_ > ((Class296) class296).anInt3995 || i_356_ < 0 || i_356_ > ((Class296) class296).anInt3995);
		int i_363_ = i_359_ >>> 24;
		if (i_362_ == 0 || i_362_ == 1 && i_363_ == 255) {
			((Class296) class296).anInt3997 = 0;
			((Class296) class296).aBool3992 = false;
			class296.method1840((float) i_351_, (float) i_354_, (float) i_357_,
					(float) i, (float) i_353_, (float) i_356_, (float) i_352_,
					(float) i_355_, (float) i_358_, i_359_, i_360_, i_361_);
		} else if (i_362_ == 1) {
			((Class296) class296).anInt3997 = 255 - i_363_;
			((Class296) class296).aBool3992 = false;
			class296.method1840((float) i_351_, (float) i_354_, (float) i_357_,
					(float) i, (float) i_353_, (float) i_356_, (float) i_352_,
					(float) i_355_, (float) i_358_, i_359_, i_360_, i_361_);
		} else if (i_362_ == 2) {
			((Class296) class296).anInt3997 = 128;
			((Class296) class296).aBool3992 = true;
			class296.method1840((float) i_351_, (float) i_354_, (float) i_357_,
					(float) i, (float) i_353_, (float) i_356_, (float) i_352_,
					(float) i_355_, (float) i_358_, i_359_, i_360_, i_361_);
		} else
			throw new IllegalArgumentException();
		((Class296) class296).aBool4003 = true;
	}

	final boolean method1049() {
		return true;
	}

	final int M() {
		int i = anInt5209;
		anInt5209 = 0;
		return i;
	}

	final void F(int i, int i_364_) {
		int i_365_ = i_364_ * ((Class163_Sub1) this).anInt5206 + i;
		int i_366_ = i_364_ * anInt5213 + i;
		if (i_365_ != 0 || i_366_ != 0) {
			int[] is = ((Class163_Sub1) this).anIntArray5214;
			float[] fs = ((Class163_Sub1) this).aFloatArray5204;
			if (i_365_ < 0) {
				int i_367_ = is.length + i_365_;
				Class311.method1896(is, -i_365_, is, 0, i_367_);
			} else if (i_365_ > 0) {
				int i_368_ = is.length - i_365_;
				Class311.method1896(is, 0, is, i_365_, i_368_);
			}
			if (i_366_ < 0) {
				int i_369_ = fs.length + i_366_;
				Class311.method1897(fs, -i_366_, fs, 0, i_369_);
			} else if (i_366_ > 0) {
				int i_370_ = fs.length - i_366_;
				Class311.method1897(fs, 0, fs, i_366_, i_370_);
			}
		}
	}

	final void method1002(boolean bool) {
		aBool5191 = bool;
		aClass22_5182.method189((byte) -124);
	}

	final void method1076(Interface10 interface10) {
		Class340 class340 = (Class340) interface10;
		((Class163_Sub1) this).anInt5206 = ((Class340) class340).anInt4497;
		anInt5183 = ((Class340) class340).anInt4495;
		((Class163_Sub1) this).anIntArray5214 = ((Class340) class340).anIntArray4493;
		aClass340_5195 = class340;
		anInt5213 = ((Class340) class340).anInt4497;
		anInt5198 = ((Class340) class340).anInt4495;
		((Class163_Sub1) this).aFloatArray5204 = ((Class340) class340).aFloatArray4500;
		method2302();
	}

	private final void method2301(Class376_Sub1_Sub1 class376_sub1_sub1, int i,
			int i_371_, int i_372_, int i_373_) {
		int i_374_ = ((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8694;
		int i_375_ = i_373_;
		i_373_ <<= 1;
		if (i_374_ == -1)
			method2297(i, i_371_, i_372_, i_375_,
					((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8696, 1);
		else {
			if (anInt5217 != i_374_) {
				Class253 class253 = ((Class253) aClass22_5190.method188(
						(long) i_374_, (byte) 83));
				if (class253 == null) {
					int[] is = method2304(i_374_);
					if (is != null) {
						int i_376_ = (method2298(i_374_) ? 64
								: ((Class163_Sub1) this).anInt5211);
						class253 = this.method1040(i_376_, i_376_, is, -1,
								i_376_, 0);
						aClass22_5190.method184((byte) 126, class253,
								(long) i_374_);
					} else
						return;
				}
				anInt5217 = i_374_;
				aClass253_5216 = class253;
			}
			i_373_++;
			((Class253_Sub3) aClass253_5216).method3106(i - i_375_, i_371_
					- i_375_, i_372_, i_373_, i_373_, 0,
					((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8696, 1, 1);
		}
	}

	final void da(int i, int i_377_, int i_378_, int[] is) {
		float f = ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7175) + ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7196)
				* (float) i
				+ (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7185)
				* (float) i_377_ + (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7166)
				* (float) i_378_));
		if (f < (float) ((Class163_Sub1) this).anInt5200
				|| f > (float) ((Class163_Sub1) this).anInt5201)
			is[0] = is[1] = is[2] = -1;
		else {
			int i_379_ = (int) ((float) ((Class163_Sub1) this).anInt5215
					* (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7197 + ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7164)
							* (float) i
							+ (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7195)
							* (float) i_377_ + (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7193)
							* (float) i_378_)) / f);
			int i_380_ = (int) ((float) ((Class163_Sub1) this).anInt5205
					* (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7190 + ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7179)
							* (float) i
							+ (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7186)
							* (float) i_377_ + (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7182)
							* (float) i_378_)) / f);
			if (i_379_ >= ((Class163_Sub1) this).anInt5212
					&& i_379_ <= ((Class163_Sub1) this).anInt5203
					&& i_380_ >= ((Class163_Sub1) this).anInt5179
					&& i_380_ <= ((Class163_Sub1) this).anInt5202) {
				is[0] = i_379_ - ((Class163_Sub1) this).anInt5212;
				is[1] = i_380_ - ((Class163_Sub1) this).anInt5179;
				is[2] = (int) f;
			} else
				is[0] = is[1] = is[2] = -1;
		}
	}

	final void ya() {
		if (((Class163_Sub1) this).anInt5186 == 0
				&& (((Class163_Sub1) this).anInt5178 == ((Class163_Sub1) this).anInt5206)
				&& ((Class163_Sub1) this).anInt5177 == 0
				&& ((Class163_Sub1) this).anInt5193 == anInt5183) {
			int i = ((Class163_Sub1) this).aFloatArray5204.length;
			int i_381_ = i - (i & 0x7);
			int i_382_ = 0;
			while (i_382_ < i_381_) {
				((Class163_Sub1) this).aFloatArray5204[i_382_++] = 2.14748365E9F;
				((Class163_Sub1) this).aFloatArray5204[i_382_++] = 2.14748365E9F;
				((Class163_Sub1) this).aFloatArray5204[i_382_++] = 2.14748365E9F;
				((Class163_Sub1) this).aFloatArray5204[i_382_++] = 2.14748365E9F;
				((Class163_Sub1) this).aFloatArray5204[i_382_++] = 2.14748365E9F;
				((Class163_Sub1) this).aFloatArray5204[i_382_++] = 2.14748365E9F;
				((Class163_Sub1) this).aFloatArray5204[i_382_++] = 2.14748365E9F;
				((Class163_Sub1) this).aFloatArray5204[i_382_++] = 2.14748365E9F;
			}
			while (i_382_ < i)
				((Class163_Sub1) this).aFloatArray5204[i_382_++] = 2.14748365E9F;
		} else {
			int i = (((Class163_Sub1) this).anInt5178 - ((Class163_Sub1) this).anInt5186);
			int i_383_ = (((Class163_Sub1) this).anInt5193 - ((Class163_Sub1) this).anInt5177);
			int i_384_ = ((Class163_Sub1) this).anInt5206 - i;
			int i_385_ = (((Class163_Sub1) this).anInt5186 + (((Class163_Sub1) this).anInt5177 * ((Class163_Sub1) this).anInt5206));
			int i_386_ = i >> 3;
			int i_387_ = i & 0x7;
			i = i_385_ - 1;
			for (int i_388_ = -i_383_; i_388_ < 0; i_388_++) {
				if (i_386_ > 0) {
					int i_389_ = i_386_;
					do {
						((Class163_Sub1) this).aFloatArray5204[++i] = 2.14748365E9F;
						((Class163_Sub1) this).aFloatArray5204[++i] = 2.14748365E9F;
						((Class163_Sub1) this).aFloatArray5204[++i] = 2.14748365E9F;
						((Class163_Sub1) this).aFloatArray5204[++i] = 2.14748365E9F;
						((Class163_Sub1) this).aFloatArray5204[++i] = 2.14748365E9F;
						((Class163_Sub1) this).aFloatArray5204[++i] = 2.14748365E9F;
						((Class163_Sub1) this).aFloatArray5204[++i] = 2.14748365E9F;
						((Class163_Sub1) this).aFloatArray5204[++i] = 2.14748365E9F;
					} while (--i_389_ > 0);
				}
				if (i_387_ > 0) {
					int i_390_ = i_387_;
					do
						((Class163_Sub1) this).aFloatArray5204[++i] = 2.14748365E9F;
					while (--i_390_ > 0);
				}
				i += i_384_;
			}
		}
	}

	final Class107 method1060(Class292 class292, Class80[] class80s,
			boolean bool) {
		int[] is = new int[class80s.length];
		int[] is_391_ = new int[class80s.length];
		boolean bool_392_ = false;
		for (int i = 0; i < class80s.length; i++) {
			is[i] = ((Class80) class80s[i]).anInt1075;
			is_391_[i] = ((Class80) class80s[i]).anInt1082;
			if (((Class80) class80s[i]).aByteArray1078 != null)
				bool_392_ = true;
		}
		if (bool) {
			if (bool_392_)
				return new Class107_Sub1(this, class292, class80s, is, is_391_);
			return new Class107_Sub4(this, class292, class80s, is, is_391_);
		}
		if (bool_392_)
			throw new IllegalArgumentException("");
		return new Class107_Sub3(this, class292, class80s, is, is_391_);
	}

	private final void method2302() {
		for (int i = 0; i < ((Class163_Sub1) this).anInt5194; i++)
			aClass363Array5188[i].method2156((byte) 58);
		la();
	}

	final void method1031() {
		if (aCanvas5175 != null) {
			((Class163_Sub1) this).anIntArray5214 = (((Class11_Sub30) ((Class163_Sub1) this).aClass11_Sub30_5170).anIntArray6611);
			((Class163_Sub1) this).anInt5206 = (((Class11_Sub30) ((Class163_Sub1) this).aClass11_Sub30_5170).anInt6613);
			anInt5183 = (((Class11_Sub30) ((Class163_Sub1) this).aClass11_Sub30_5170).anInt6617);
			((Class163_Sub1) this).aFloatArray5204 = ((Class163_Sub1) this).aFloatArray5187;
			anInt5213 = anInt5192;
			anInt5198 = anInt5196;
		} else {
			((Class163_Sub1) this).anInt5206 = 1;
			anInt5183 = 1;
			((Class163_Sub1) this).anIntArray5214 = null;
			anInt5213 = 1;
			anInt5198 = 1;
			((Class163_Sub1) this).aFloatArray5204 = null;
		}
		aClass340_5195 = null;
		method2302();
	}

	final Class72 method1085(int i, int i_393_, int[] is, int[] is_394_) {
		return new Class72_Sub2(i, i_393_, is, is_394_);
	}

	final Interface26 method1071(int i, int i_395_) {
		return new Class377(i, i_395_);
	}

	final void method1054(Canvas canvas) {
		if (canvas != null) {
			Class11_Sub30 class11_sub30 = ((Class11_Sub30) aClass213_5176
					.method1369((byte) 26, (long) canvas.hashCode()));
			if (class11_sub30 != null) {
				aCanvas5175 = canvas;
				Dimension dimension = canvas.getSize();
				anInt5173 = dimension.width;
				anInt5172 = dimension.height;
				((Class163_Sub1) this).aClass11_Sub30_5170 = class11_sub30;
				if (aClass340_5195 == null) {
					((Class163_Sub1) this).anIntArray5214 = ((Class11_Sub30) class11_sub30).anIntArray6611;
					((Class163_Sub1) this).anInt5206 = ((Class11_Sub30) class11_sub30).anInt6613;
					anInt5183 = ((Class11_Sub30) class11_sub30).anInt6617;
					if (((Class163_Sub1) this).anInt5206 != anInt5213
							|| anInt5183 != anInt5198) {
						anInt5192 = anInt5213 = ((Class163_Sub1) this).anInt5206;
						anInt5196 = anInt5198 = anInt5183;
						((Class163_Sub1) this).aFloatArray5187 = ((Class163_Sub1) this).aFloatArray5204 = new float[anInt5213
								* anInt5198];
					}
					method2302();
				}
			}
		} else {
			aCanvas5175 = null;
			((Class163_Sub1) this).aClass11_Sub30_5170 = null;
			if (aClass340_5195 == null) {
				((Class163_Sub1) this).anIntArray5214 = null;
				((Class163_Sub1) this).anInt5206 = anInt5183 = 1;
				anInt5213 = anInt5198 = 1;
				method2302();
			}
		}
	}

	final int r(int i, int i_396_, int i_397_, int i_398_, int i_399_,
			int i_400_, int i_401_) {
		float f = ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7196)
				* (float) i
				+ (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7185)
				* (float) i_396_
				+ (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7166)
				* (float) i_397_ + (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7175));
		float f_402_ = ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7196)
				* (float) i_398_
				+ (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7185)
				* (float) i_399_
				+ (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7166)
				* (float) i_400_ + (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7175));
		int i_403_ = 0;
		if (f < (float) ((Class163_Sub1) this).anInt5200
				&& f_402_ < (float) ((Class163_Sub1) this).anInt5200)
			i_403_ |= 0x10;
		else if (f > (float) ((Class163_Sub1) this).anInt5201
				&& f_402_ > (float) ((Class163_Sub1) this).anInt5201)
			i_403_ |= 0x20;
		int i_404_ = (int) ((float) ((Class163_Sub1) this).anInt5215
				* ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7164 * (float) i)
						+ (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7195 * (float) i_396_)
						+ (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7193 * (float) i_397_) + ((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7197) / (float) i_401_);
		int i_405_ = (int) ((float) ((Class163_Sub1) this).anInt5215
				* ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7164 * (float) i_398_)
						+ (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7195 * (float) i_399_)
						+ (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7193 * (float) i_400_) + ((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7197) / (float) i_401_);
		if (i_404_ < ((Class163_Sub1) this).anInt5212
				&& i_405_ < ((Class163_Sub1) this).anInt5212)
			i_403_ |= 0x1;
		else if (i_404_ > ((Class163_Sub1) this).anInt5203
				&& i_405_ > ((Class163_Sub1) this).anInt5203)
			i_403_ |= 0x2;
		int i_406_ = (int) ((float) ((Class163_Sub1) this).anInt5205
				* ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7179 * (float) i)
						+ (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7186 * (float) i_396_)
						+ (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7182 * (float) i_397_) + ((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7190) / (float) i_401_);
		int i_407_ = (int) ((float) ((Class163_Sub1) this).anInt5205
				* ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7179 * (float) i_398_)
						+ (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7186 * (float) i_399_)
						+ (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7182 * (float) i_400_) + ((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7190) / (float) i_401_);
		if (i_406_ < ((Class163_Sub1) this).anInt5179
				&& i_407_ < ((Class163_Sub1) this).anInt5179)
			i_403_ |= 0x4;
		else if (i_406_ > ((Class163_Sub1) this).anInt5202
				&& i_407_ > ((Class163_Sub1) this).anInt5202)
			i_403_ |= 0x8;
		return i_403_;
	}

	final boolean method1047() {
		return true;
	}

	final Interface8 method1033(int i, int i_408_) {
		return method1009(i, i_408_, false);
	}

	final boolean method1003() {
		return false;
	}

	final int method2303(int i) {
		return (((Class188) ((Class163) this).anInterface1_2118.method7(
				(byte) 127, i)).anInt2425);
	}

	final void T(int i, int i_409_, int i_410_, int i_411_) {
		if (((Class163_Sub1) this).anInt5186 < i)
			((Class163_Sub1) this).anInt5186 = i;
		if (((Class163_Sub1) this).anInt5177 < i_409_)
			((Class163_Sub1) this).anInt5177 = i_409_;
		if (((Class163_Sub1) this).anInt5178 > i_410_)
			((Class163_Sub1) this).anInt5178 = i_410_;
		if (((Class163_Sub1) this).anInt5193 > i_411_)
			((Class163_Sub1) this).anInt5193 = i_411_;
		method2296();
	}

	final void method1024(int i) {
		((Class163_Sub1) this).anInt5194 = i;
		aClass363Array5188 = new Class363[((Class163_Sub1) this).anInt5194];
		for (int i_412_ = 0; i_412_ < ((Class163_Sub1) this).anInt5194; i_412_++)
			aClass363Array5188[i_412_] = new Class363(this);
	}

	final void method1075(Canvas canvas) {
		if (aCanvas5175 == canvas)
			method1054(null);
		Class11_Sub30 class11_sub30 = ((Class11_Sub30) aClass213_5176
				.method1369((byte) 26, (long) canvas.hashCode()));
		if (class11_sub30 != null)
			class11_sub30.method122(-47);
	}

	final void method1044(int i, int i_413_) throws Exception_Sub1 {
		if (aCanvas5175 == null
				|| ((Class163_Sub1) this).aClass11_Sub30_5170 == null)
			throw new IllegalStateException("off");
		try {
			Graphics graphics = aCanvas5175.getGraphics();
			((Class163_Sub1) this).aClass11_Sub30_5170.method2730(anInt5172, 0,
					anInt5173, -86, 0, i_413_, i, graphics);
		} catch (Exception exception) {
			aCanvas5175.repaint();
		}
	}

	final void method1051(int i, int i_414_, int i_415_, int i_416_,
			int i_417_, int i_418_) {
		U(i, i_414_, i_415_, i_417_, i_418_);
		U(i, i_414_ + i_416_ - 1, i_415_, i_417_, i_418_);
		P(i, i_414_ + 1, i_416_ - 2, i_417_, i_418_);
		P(i + i_415_ - 1, i_414_ + 1, i_416_ - 2, i_417_, i_418_);
	}

	final void method1007(int i, int i_419_, int i_420_, int i_421_,
			int i_422_, int i_423_) {
		i_420_ -= i;
		i_421_ -= i_419_;
		if (i_421_ == 0) {
			if (i_420_ >= 0)
				U(i, i_419_, i_420_ + 1, i_422_, i_423_);
			else
				U(i + i_420_, i_419_, -i_420_ + 1, i_422_, i_423_);
		} else if (i_420_ == 0) {
			if (i_421_ >= 0)
				P(i, i_419_, i_421_ + 1, i_422_, i_423_);
			else
				P(i, i_419_ + i_421_, -i_421_ + 1, i_422_, i_423_);
		} else {
			if (i_420_ + i_421_ < 0) {
				i += i_420_;
				i_420_ = -i_420_;
				i_419_ += i_421_;
				i_421_ = -i_421_;
			}
			if (i_420_ > i_421_) {
				i_419_ <<= 16;
				i_419_ += 32768;
				i_421_ <<= 16;
				int i_424_ = (int) Math.floor((double) i_421_ / (double) i_420_
						+ 0.5);
				i_420_ += i;
				if (i < ((Class163_Sub1) this).anInt5186) {
					i_419_ += i_424_ * (((Class163_Sub1) this).anInt5186 - i);
					i = ((Class163_Sub1) this).anInt5186;
				}
				if (i_420_ >= ((Class163_Sub1) this).anInt5178)
					i_420_ = ((Class163_Sub1) this).anInt5178 - 1;
				int i_425_ = i_422_ >>> 24;
				if (i_423_ == 0 || i_423_ == 1 && i_425_ == 255) {
					for (/**/; i <= i_420_; i++) {
						int i_426_ = i_419_ >> 16;
						if (i_426_ >= ((Class163_Sub1) this).anInt5177
								&& i_426_ < ((Class163_Sub1) this).anInt5193)
							((Class163_Sub1) this).anIntArray5214[i + i_426_
									* ((Class163_Sub1) this).anInt5206] = i_422_;
						i_419_ += i_424_;
					}
					return;
				}
				if (i_423_ == 1) {
					i_422_ = (((i_422_ & 0xff00ff) * i_425_ >> 8 & 0xff00ff)
							+ ((i_422_ & 0xff00) * i_425_ >> 8 & 0xff00) + (i_425_ << 24));
					int i_427_ = 256 - i_425_;
					for (/**/; i <= i_420_; i++) {
						int i_428_ = i_419_ >> 16;
						if (i_428_ >= ((Class163_Sub1) this).anInt5177
								&& i_428_ < ((Class163_Sub1) this).anInt5193) {
							int i_429_ = i + i_428_
									* (((Class163_Sub1) this).anInt5206);
							int i_430_ = (((Class163_Sub1) this).anIntArray5214[i_429_]);
							i_430_ = (((i_430_ & 0xff00ff) * i_427_ >> 8 & 0xff00ff) + ((i_430_ & 0xff00)
									* i_427_ >> 8 & 0xff00));
							((Class163_Sub1) this).anIntArray5214[i_429_] = i_422_
									+ i_430_;
						}
						i_419_ += i_424_;
					}
					return;
				}
				if (i_423_ == 2) {
					for (/**/; i <= i_420_; i++) {
						int i_431_ = i_419_ >> 16;
						if (i_431_ >= ((Class163_Sub1) this).anInt5177
								&& i_431_ < ((Class163_Sub1) this).anInt5193) {
							int i_432_ = i + i_431_
									* (((Class163_Sub1) this).anInt5206);
							int i_433_ = (((Class163_Sub1) this).anIntArray5214[i_432_]);
							int i_434_ = i_422_ + i_433_;
							int i_435_ = (i_422_ & 0xff00ff)
									+ (i_433_ & 0xff00ff);
							i_433_ = (i_435_ & 0x1000100)
									+ (i_434_ - i_435_ & 0x10000);
							((Class163_Sub1) this).anIntArray5214[i_432_] = i_434_
									- i_433_ | i_433_ - (i_433_ >>> 8);
						}
						i_419_ += i_424_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			i <<= 16;
			i += 32768;
			i_420_ <<= 16;
			int i_436_ = (int) Math.floor((double) i_420_ / (double) i_421_
					+ 0.5);
			i_421_ += i_419_;
			if (i_419_ < ((Class163_Sub1) this).anInt5177) {
				i += i_436_ * (((Class163_Sub1) this).anInt5177 - i_419_);
				i_419_ = ((Class163_Sub1) this).anInt5177;
			}
			if (i_421_ >= ((Class163_Sub1) this).anInt5193)
				i_421_ = ((Class163_Sub1) this).anInt5193 - 1;
			int i_437_ = i_422_ >>> 24;
			if (i_423_ == 0 || i_423_ == 1 && i_437_ == 255) {
				for (/**/; i_419_ <= i_421_; i_419_++) {
					int i_438_ = i >> 16;
					if (i_438_ >= ((Class163_Sub1) this).anInt5186
							&& i_438_ < ((Class163_Sub1) this).anInt5178)
						((Class163_Sub1) this).anIntArray5214[(i_438_ + i_419_
								* ((Class163_Sub1) this).anInt5206)] = i_422_;
					i += i_436_;
				}
			} else if (i_423_ == 1) {
				i_422_ = (((i_422_ & 0xff00ff) * i_437_ >> 8 & 0xff00ff)
						+ ((i_422_ & 0xff00) * i_437_ >> 8 & 0xff00) + (i_437_ << 24));
				int i_439_ = 256 - i_437_;
				for (/**/; i_419_ <= i_421_; i_419_++) {
					int i_440_ = i >> 16;
					if (i_440_ >= ((Class163_Sub1) this).anInt5186
							&& i_440_ < ((Class163_Sub1) this).anInt5178) {
						int i_441_ = (i_440_ + i_419_
								* ((Class163_Sub1) this).anInt5206);
						int i_442_ = ((Class163_Sub1) this).anIntArray5214[i_441_];
						i_442_ = (((i_442_ & 0xff00ff) * i_439_ >> 8 & 0xff00ff) + ((i_442_ & 0xff00)
								* i_439_ >> 8 & 0xff00));
						((Class163_Sub1) this).anIntArray5214[(i_440_ + i_419_
								* ((Class163_Sub1) this).anInt5206)] = i_422_
								+ i_442_;
					}
					i += i_436_;
				}
			} else if (i_423_ == 2) {
				for (/**/; i_419_ <= i_421_; i_419_++) {
					int i_443_ = i >> 16;
					if (i_443_ >= ((Class163_Sub1) this).anInt5186
							&& i_443_ < ((Class163_Sub1) this).anInt5178) {
						int i_444_ = (i_443_ + i_419_
								* ((Class163_Sub1) this).anInt5206);
						int i_445_ = ((Class163_Sub1) this).anIntArray5214[i_444_];
						int i_446_ = i_422_ + i_445_;
						int i_447_ = (i_422_ & 0xff00ff) + (i_445_ & 0xff00ff);
						i_445_ = (i_447_ & 0x1000100)
								+ (i_446_ - i_447_ & 0x10000);
						((Class163_Sub1) this).anIntArray5214[i_444_] = i_446_
								- i_445_ | i_445_ - (i_445_ >>> 8);
					}
					i += i_436_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	final void method1053(boolean bool) {
		/* empty */
	}

	final boolean method1084() {
		return false;
	}

	final void method1028(int i) {
		((Class163_Sub1) this).anInt5211 = i;
		aClass22_5182.method189((byte) 64);
	}

	final void method1013(Canvas canvas, int i, int i_448_) {
		Class11_Sub30 class11_sub30 = ((Class11_Sub30) aClass213_5176
				.method1369((byte) 26, (long) canvas.hashCode()));
		if (class11_sub30 != null) {
			class11_sub30.method122(-48);
			class11_sub30 = Class21.method178(i, i_448_, 4380, canvas);
			aClass213_5176.method1368((long) canvas.hashCode(), class11_sub30,
					(byte) -26);
			if (aCanvas5175 == canvas && aClass340_5195 == null) {
				Dimension dimension = canvas.getSize();
				anInt5173 = dimension.width;
				anInt5172 = dimension.height;
				((Class163_Sub1) this).aClass11_Sub30_5170 = class11_sub30;
				((Class163_Sub1) this).anIntArray5214 = ((Class11_Sub30) class11_sub30).anIntArray6611;
				((Class163_Sub1) this).anInt5206 = ((Class11_Sub30) class11_sub30).anInt6613;
				anInt5183 = ((Class11_Sub30) class11_sub30).anInt6617;
				if (((Class163_Sub1) this).anInt5206 != anInt5213
						|| anInt5183 != anInt5198) {
					anInt5192 = anInt5213 = ((Class163_Sub1) this).anInt5206;
					anInt5196 = anInt5198 = anInt5183;
					((Class163_Sub1) this).aFloatArray5187 = ((Class163_Sub1) this).aFloatArray5204 = new float[anInt5213
							* anInt5198];
				}
				method2302();
			}
		}
	}

	final void xa(float f) {
		((Class163_Sub1) this).anInt5185 = (int) (f * 65535.0F);
	}

	final int[] method2304(int i) {
		Class11_Sub40 class11_sub40;
		synchronized (aClass22_5182) {
			class11_sub40 = ((Class11_Sub40) aClass22_5182.method188((long) i
					| ~0x7fffffffffffffffL, (byte) 119));
			if (class11_sub40 == null) {
				if (!((Class163) this).anInterface1_2118.method2(i, -113))
					return null;
				Class188 class188 = ((Class163) this).anInterface1_2118
						.method7((byte) 127, i);
				int i_449_ = (((Class188) class188).aBool2430 || aBool5191 ? 64
						: ((Class163_Sub1) this).anInt5211);
				class11_sub40 = new Class11_Sub40(i, i_449_,
						(((Class163) this).anInterface1_2118.method3(i_449_,
								-99, true, 0.7F, i_449_, i)),
						((Class188) class188).anInt2425 != 1);
				aClass22_5182.method184((byte) 124, class11_sub40, (long) i
						| ~0x7fffffffffffffffL);
			}
		}
		((Class11_Sub40) class11_sub40).aBool7229 = true;
		return class11_sub40.method2931();
	}

	final void Q(int i, int i_450_, int i_451_, int i_452_, int i_453_,
			int i_454_, byte[] is, int i_455_, int i_456_) {
		if (i_451_ > 0 && i_452_ > 0) {
			int i_457_ = 0;
			int i_458_ = 0;
			int i_459_ = (i_455_ << 16) / i_451_;
			int i_460_ = (is.length / i_455_ << 16) / i_452_;
			int i_461_ = i + i_450_ * ((Class163_Sub1) this).anInt5206;
			int i_462_ = ((Class163_Sub1) this).anInt5206 - i_451_;
			if (i_450_ + i_452_ > ((Class163_Sub1) this).anInt5193)
				i_452_ -= i_450_ + i_452_ - ((Class163_Sub1) this).anInt5193;
			if (i_450_ < ((Class163_Sub1) this).anInt5177) {
				int i_463_ = ((Class163_Sub1) this).anInt5177 - i_450_;
				i_452_ -= i_463_;
				i_461_ += i_463_ * ((Class163_Sub1) this).anInt5206;
				i_458_ += i_460_ * i_463_;
			}
			if (i + i_451_ > ((Class163_Sub1) this).anInt5178) {
				int i_464_ = i + i_451_ - ((Class163_Sub1) this).anInt5178;
				i_451_ -= i_464_;
				i_462_ += i_464_;
			}
			if (i < ((Class163_Sub1) this).anInt5186) {
				int i_465_ = ((Class163_Sub1) this).anInt5186 - i;
				i_451_ -= i_465_;
				i_461_ += i_465_;
				i_457_ += i_459_ * i_465_;
				i_462_ += i_465_;
			}
			int i_466_ = i_453_ >>> 24;
			int i_467_ = i_454_ >>> 24;
			if (i_456_ == 0 || i_456_ == 1 && i_466_ == 255 && i_467_ == 255) {
				int i_468_ = i_457_;
				for (int i_469_ = -i_452_; i_469_ < 0; i_469_++) {
					int i_470_ = (i_458_ >> 16) * i_455_;
					for (int i_471_ = -i_451_; i_471_ < 0; i_471_++) {
						if (is[(i_457_ >> 16) + i_470_] != 0)
							((Class163_Sub1) this).anIntArray5214[i_461_++] = i_454_;
						else
							((Class163_Sub1) this).anIntArray5214[i_461_++] = i_453_;
						i_457_ += i_459_;
					}
					i_458_ += i_460_;
					i_457_ = i_468_;
					i_461_ += i_462_;
				}
			} else if (i_456_ == 1) {
				int i_472_ = i_457_;
				for (int i_473_ = -i_452_; i_473_ < 0; i_473_++) {
					int i_474_ = (i_458_ >> 16) * i_455_;
					for (int i_475_ = -i_451_; i_475_ < 0; i_475_++) {
						int i_476_ = i_453_;
						if (is[(i_457_ >> 16) + i_474_] != 0)
							i_476_ = i_454_;
						int i_477_ = i_476_ >>> 24;
						int i_478_ = 255 - i_477_;
						int i_479_ = ((Class163_Sub1) this).anIntArray5214[i_461_];
						((Class163_Sub1) this).anIntArray5214[i_461_++] = ((((i_476_ & 0xff00ff)
								* i_477_ + (i_479_ & 0xff00ff) * i_478_) & ~0xff00ff) + (((i_476_ & 0xff00)
								* i_477_ + (i_479_ & 0xff00) * i_478_) & 0xff0000)) >> 8;
						i_457_ += i_459_;
					}
					i_458_ += i_460_;
					i_457_ = i_472_;
					i_461_ += i_462_;
				}
			} else if (i_456_ == 2) {
				int i_480_ = i_457_;
				for (int i_481_ = -i_452_; i_481_ < 0; i_481_++) {
					int i_482_ = (i_458_ >> 16) * i_455_;
					for (int i_483_ = -i_451_; i_483_ < 0; i_483_++) {
						int i_484_ = i_453_;
						if (is[(i_457_ >> 16) + i_482_] != 0)
							i_484_ = i_454_;
						if (i_484_ != 0) {
							int i_485_ = (((Class163_Sub1) this).anIntArray5214[i_461_]);
							int i_486_ = i_484_ + i_485_;
							int i_487_ = (i_484_ & 0xff00ff)
									+ (i_485_ & 0xff00ff);
							i_485_ = (i_487_ & 0x1000100)
									+ (i_486_ - i_487_ & 0x10000);
							((Class163_Sub1) this).anIntArray5214[i_461_++] = i_486_
									- i_485_ | i_485_ - (i_485_ >>> 8);
						} else
							i_461_++;
						i_457_ += i_459_;
					}
					i_458_ += i_460_;
					i_457_ = i_480_;
					i_461_ += i_462_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	final void za(int i, int i_488_, int i_489_, int i_490_, int i_491_) {
		if (i_489_ < 0)
			i_489_ = -i_489_;
		int i_492_ = i_488_ - i_489_;
		if (i_492_ < ((Class163_Sub1) this).anInt5177)
			i_492_ = ((Class163_Sub1) this).anInt5177;
		int i_493_ = i_488_ + i_489_ + 1;
		if (i_493_ > ((Class163_Sub1) this).anInt5193)
			i_493_ = ((Class163_Sub1) this).anInt5193;
		int i_494_ = i_492_;
		int i_495_ = i_489_ * i_489_;
		int i_496_ = 0;
		int i_497_ = i_488_ - i_494_;
		int i_498_ = i_497_ * i_497_;
		int i_499_ = i_498_ - i_497_;
		if (i_488_ > i_493_)
			i_488_ = i_493_;
		int i_500_ = i_490_ >>> 24;
		if (i_491_ == 0 || i_491_ == 1 && i_500_ == 255) {
			while (i_494_ < i_488_) {
				for (/**/; i_499_ <= i_495_ || i_498_ <= i_495_; i_499_ += i_496_++
						+ i_496_)
					i_498_ += i_496_ + i_496_;
				int i_501_ = i - i_496_ + 1;
				if (i_501_ < ((Class163_Sub1) this).anInt5186)
					i_501_ = ((Class163_Sub1) this).anInt5186;
				int i_502_ = i + i_496_;
				if (i_502_ > ((Class163_Sub1) this).anInt5178)
					i_502_ = ((Class163_Sub1) this).anInt5178;
				int i_503_ = i_501_ + i_494_ * ((Class163_Sub1) this).anInt5206;
				for (int i_504_ = i_501_; i_504_ < i_502_; i_504_++)
					((Class163_Sub1) this).anIntArray5214[i_503_++] = i_490_;
				i_494_++;
				i_498_ -= i_497_-- + i_497_;
				i_499_ -= i_497_ + i_497_;
			}
			i_496_ = i_489_;
			i_497_ = i_494_ - i_488_;
			i_499_ = i_497_ * i_497_ + i_495_;
			i_498_ = i_499_ - i_496_;
			i_499_ -= i_497_;
			while (i_494_ < i_493_) {
				for (/**/; i_499_ > i_495_ && i_498_ > i_495_; i_498_ -= i_496_
						+ i_496_)
					i_499_ -= i_496_-- + i_496_;
				int i_505_ = i - i_496_;
				if (i_505_ < ((Class163_Sub1) this).anInt5186)
					i_505_ = ((Class163_Sub1) this).anInt5186;
				int i_506_ = i + i_496_;
				if (i_506_ > ((Class163_Sub1) this).anInt5178 - 1)
					i_506_ = ((Class163_Sub1) this).anInt5178 - 1;
				int i_507_ = i_505_ + i_494_ * ((Class163_Sub1) this).anInt5206;
				for (int i_508_ = i_505_; i_508_ <= i_506_; i_508_++)
					((Class163_Sub1) this).anIntArray5214[i_507_++] = i_490_;
				i_494_++;
				i_499_ += i_497_ + i_497_;
				i_498_ += i_497_++ + i_497_;
			}
		} else if (i_491_ == 1) {
			i_490_ = (((i_490_ & 0xff00ff) * i_500_ >> 8 & 0xff00ff)
					+ ((i_490_ & 0xff00) * i_500_ >> 8 & 0xff00) + (i_500_ << 24));
			int i_509_ = 256 - i_500_;
			while (i_494_ < i_488_) {
				for (/**/; i_499_ <= i_495_ || i_498_ <= i_495_; i_499_ += i_496_++
						+ i_496_)
					i_498_ += i_496_ + i_496_;
				int i_510_ = i - i_496_ + 1;
				if (i_510_ < ((Class163_Sub1) this).anInt5186)
					i_510_ = ((Class163_Sub1) this).anInt5186;
				int i_511_ = i + i_496_;
				if (i_511_ > ((Class163_Sub1) this).anInt5178)
					i_511_ = ((Class163_Sub1) this).anInt5178;
				int i_512_ = i_510_ + i_494_ * ((Class163_Sub1) this).anInt5206;
				for (int i_513_ = i_510_; i_513_ < i_511_; i_513_++) {
					int i_514_ = ((Class163_Sub1) this).anIntArray5214[i_512_];
					i_514_ = (((i_514_ & 0xff00ff) * i_509_ >> 8 & 0xff00ff) + ((i_514_ & 0xff00)
							* i_509_ >> 8 & 0xff00));
					((Class163_Sub1) this).anIntArray5214[i_512_++] = i_490_
							+ i_514_;
				}
				i_494_++;
				i_498_ -= i_497_-- + i_497_;
				i_499_ -= i_497_ + i_497_;
			}
			i_496_ = i_489_;
			i_497_ = -i_497_;
			i_499_ = i_497_ * i_497_ + i_495_;
			i_498_ = i_499_ - i_496_;
			i_499_ -= i_497_;
			while (i_494_ < i_493_) {
				for (/**/; i_499_ > i_495_ && i_498_ > i_495_; i_498_ -= i_496_
						+ i_496_)
					i_499_ -= i_496_-- + i_496_;
				int i_515_ = i - i_496_;
				if (i_515_ < ((Class163_Sub1) this).anInt5186)
					i_515_ = ((Class163_Sub1) this).anInt5186;
				int i_516_ = i + i_496_;
				if (i_516_ > ((Class163_Sub1) this).anInt5178 - 1)
					i_516_ = ((Class163_Sub1) this).anInt5178 - 1;
				int i_517_ = i_515_ + i_494_ * ((Class163_Sub1) this).anInt5206;
				for (int i_518_ = i_515_; i_518_ <= i_516_; i_518_++) {
					int i_519_ = ((Class163_Sub1) this).anIntArray5214[i_517_];
					i_519_ = (((i_519_ & 0xff00ff) * i_509_ >> 8 & 0xff00ff) + ((i_519_ & 0xff00)
							* i_509_ >> 8 & 0xff00));
					((Class163_Sub1) this).anIntArray5214[i_517_++] = i_490_
							+ i_519_;
				}
				i_494_++;
				i_499_ += i_497_ + i_497_;
				i_498_ += i_497_++ + i_497_;
			}
		} else if (i_491_ == 2) {
			while (i_494_ < i_488_) {
				for (/**/; i_499_ <= i_495_ || i_498_ <= i_495_; i_499_ += i_496_++
						+ i_496_)
					i_498_ += i_496_ + i_496_;
				int i_520_ = i - i_496_ + 1;
				if (i_520_ < ((Class163_Sub1) this).anInt5186)
					i_520_ = ((Class163_Sub1) this).anInt5186;
				int i_521_ = i + i_496_;
				if (i_521_ > ((Class163_Sub1) this).anInt5178)
					i_521_ = ((Class163_Sub1) this).anInt5178;
				int i_522_ = i_520_ + i_494_ * ((Class163_Sub1) this).anInt5206;
				for (int i_523_ = i_520_; i_523_ < i_521_; i_523_++) {
					int i_524_ = ((Class163_Sub1) this).anIntArray5214[i_522_];
					int i_525_ = i_490_ + i_524_;
					int i_526_ = (i_490_ & 0xff00ff) + (i_524_ & 0xff00ff);
					i_524_ = (i_526_ & 0x1000100) + (i_525_ - i_526_ & 0x10000);
					((Class163_Sub1) this).anIntArray5214[i_522_++] = i_525_
							- i_524_ | i_524_ - (i_524_ >>> 8);
				}
				i_494_++;
				i_498_ -= i_497_-- + i_497_;
				i_499_ -= i_497_ + i_497_;
			}
			i_496_ = i_489_;
			i_497_ = -i_497_;
			i_499_ = i_497_ * i_497_ + i_495_;
			i_498_ = i_499_ - i_496_;
			i_499_ -= i_497_;
			while (i_494_ < i_493_) {
				for (/**/; i_499_ > i_495_ && i_498_ > i_495_; i_498_ -= i_496_
						+ i_496_)
					i_499_ -= i_496_-- + i_496_;
				int i_527_ = i - i_496_;
				if (i_527_ < ((Class163_Sub1) this).anInt5186)
					i_527_ = ((Class163_Sub1) this).anInt5186;
				int i_528_ = i + i_496_;
				if (i_528_ > ((Class163_Sub1) this).anInt5178 - 1)
					i_528_ = ((Class163_Sub1) this).anInt5178 - 1;
				int i_529_ = i_527_ + i_494_ * ((Class163_Sub1) this).anInt5206;
				for (int i_530_ = i_527_; i_530_ <= i_528_; i_530_++) {
					int i_531_ = ((Class163_Sub1) this).anIntArray5214[i_529_];
					int i_532_ = i_490_ + i_531_;
					int i_533_ = (i_490_ & 0xff00ff) + (i_531_ & 0xff00ff);
					i_531_ = (i_533_ & 0x1000100) + (i_532_ - i_533_ & 0x10000);
					((Class163_Sub1) this).anIntArray5214[i_529_++] = i_532_
							- i_531_ | i_531_ - (i_531_ >>> 8);
				}
				i_494_++;
				i_499_ += i_497_ + i_497_;
				i_498_ += i_497_++ + i_497_;
			}
		} else
			throw new IllegalArgumentException();
	}

	final boolean method1017() {
		return false;
	}

	final void HA(int i, int i_534_, int i_535_, int i_536_, int[] is) {
		float f = ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7175) + ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7196)
				* (float) i
				+ (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7185)
				* (float) i_534_ + (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7166)
				* (float) i_535_));
		if (f < (float) ((Class163_Sub1) this).anInt5200
				|| f > (float) ((Class163_Sub1) this).anInt5201)
			is[0] = is[1] = is[2] = -1;
		else {
			int i_537_ = (int) ((float) ((Class163_Sub1) this).anInt5215
					* (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7197 + ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7164)
							* (float) i
							+ (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7195)
							* (float) i_534_ + (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7193)
							* (float) i_535_)) / (float) i_536_);
			int i_538_ = (int) ((float) ((Class163_Sub1) this).anInt5205
					* (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7190 + ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7179)
							* (float) i
							+ (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7186)
							* (float) i_534_ + (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7182)
							* (float) i_535_)) / (float) i_536_);
			if (i_537_ >= ((Class163_Sub1) this).anInt5212
					&& i_537_ <= ((Class163_Sub1) this).anInt5203
					&& i_538_ >= ((Class163_Sub1) this).anInt5179
					&& i_538_ <= ((Class163_Sub1) this).anInt5202) {
				is[0] = i_537_ - ((Class163_Sub1) this).anInt5212;
				is[1] = i_538_ - ((Class163_Sub1) this).anInt5179;
				is[2] = (int) f;
			} else
				is[0] = is[1] = is[2] = -1;
		}
	}

	final void method1010(Class116 class116) {
		Class363 class363 = method2306(Thread.currentThread());
		Class376_Sub1 class376_sub1 = (((Class246) ((Class116) class116).aClass246_1584).aClass376_Sub1_3329);
		for (Class376_Sub1 class376_sub1_539_ = ((Class376_Sub1) class376_sub1).aClass376_Sub1_5095; class376_sub1_539_ != class376_sub1; class376_sub1_539_ = ((Class376_Sub1) class376_sub1_539_).aClass376_Sub1_5095) {
			Class376_Sub1_Sub1 class376_sub1_sub1 = (Class376_Sub1_Sub1) class376_sub1_539_;
			int i = ((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8689 >> 12;
			int i_540_ = ((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8691 >> 12;
			int i_541_ = ((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8684 >> 12;
			float f = ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7175) + ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7196 * (float) i)
					+ (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7185 * (float) i_540_) + (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7166 * (float) i_541_)));
			if (!(f < (float) ((Class163_Sub1) this).anInt5200)
					&& !(f > (float) ((Class363) class363).anInt4724)) {
				int i_542_ = (((Class163_Sub1) this).anInt5181 + (int) ((float) ((Class163_Sub1) this).anInt5215
						* ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7197) + ((((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7164)
								* (float) i
								+ (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7195 * (float) i_540_) + (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7193 * (float) i_541_))) / f));
				int i_543_ = (((Class163_Sub1) this).anInt5197 + (int) ((float) ((Class163_Sub1) this).anInt5205
						* ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7190) + ((((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7179)
								* (float) i
								+ (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7186 * (float) i_540_) + (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7182 * (float) i_541_))) / f));
				if (i_542_ >= ((Class163_Sub1) this).anInt5186
						&& i_542_ <= ((Class163_Sub1) this).anInt5178
						&& i_543_ >= ((Class163_Sub1) this).anInt5177
						&& i_543_ <= ((Class163_Sub1) this).anInt5193) {
					if (f == 0.0F)
						f = 1.0F;
					method2301(
							class376_sub1_sub1,
							i_542_,
							i_543_,
							(int) f,
							(int) ((float) ((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8692 * (((Class163_Sub1) this).anInt5215)) >> 12) / f));
				}
			}
		}
	}

	final boolean method2305(int i) {
		return ((Class163) this).anInterface1_2118.method2(i, -99);
	}

	final void method1070() {
		/* empty */
	}

	final Class11_Sub50 method1000(int i) {
		return null;
	}

	final Class363 method2306(Runnable runnable) {
		for (int i = 0; i < ((Class163_Sub1) this).anInt5194; i++) {
			if (((Class363) aClass363Array5188[i]).aRunnable4722 == runnable)
				return aClass363Array5188[i];
		}
		return null;
	}

	private final void method2307(int i, int i_544_, int i_545_, int i_546_,
			int i_547_, int i_548_, int i_549_, int i_550_) {
		if (i >= ((Class163_Sub1) this).anInt5186
				&& i < ((Class163_Sub1) this).anInt5178) {
			int i_551_ = i + i_544_ * ((Class163_Sub1) this).anInt5206;
			int i_552_ = i_546_ >>> 24;
			int i_553_ = i_548_ + i_549_;
			int i_554_ = i_550_ % i_553_;
			if (i_547_ == 0 || i_547_ == 1 && i_552_ == 255) {
				int i_555_ = 0;
				while (i_555_ < i_545_) {
					if (i_544_ + i_555_ >= ((Class163_Sub1) this).anInt5177
							&& i_544_ + i_555_ < ((Class163_Sub1) this).anInt5193
							&& i_554_ < i_548_)
						((Class163_Sub1) this).anIntArray5214[(i_551_ + i_555_
								* ((Class163_Sub1) this).anInt5206)] = i_546_;
					i_555_++;
					i_554_ = ++i_554_ % i_553_;
				}
			} else if (i_547_ == 1) {
				i_546_ = (((i_546_ & 0xff00ff) * i_552_ >> 8 & 0xff00ff)
						+ ((i_546_ & 0xff00) * i_552_ >> 8 & 0xff00) + (i_552_ << 24));
				int i_556_ = 256 - i_552_;
				int i_557_ = 0;
				while (i_557_ < i_545_) {
					if (i_544_ + i_557_ >= ((Class163_Sub1) this).anInt5177
							&& i_544_ + i_557_ < ((Class163_Sub1) this).anInt5193
							&& i_554_ < i_548_) {
						int i_558_ = (i_551_ + i_557_
								* ((Class163_Sub1) this).anInt5206);
						int i_559_ = ((Class163_Sub1) this).anIntArray5214[i_558_];
						i_559_ = (((i_559_ & 0xff00ff) * i_556_ >> 8 & 0xff00ff) + ((i_559_ & 0xff00)
								* i_556_ >> 8 & 0xff00));
						((Class163_Sub1) this).anIntArray5214[i_558_] = i_546_
								+ i_559_;
					}
					i_557_++;
					i_554_ = ++i_554_ % i_553_;
				}
			} else if (i_547_ == 2) {
				int i_560_ = 0;
				while (i_560_ < i_545_) {
					if (i_544_ + i_560_ >= ((Class163_Sub1) this).anInt5177
							&& i_544_ + i_560_ < ((Class163_Sub1) this).anInt5193
							&& i_554_ < i_548_) {
						int i_561_ = (i_551_ + i_560_
								* ((Class163_Sub1) this).anInt5206);
						int i_562_ = ((Class163_Sub1) this).anIntArray5214[i_561_];
						int i_563_ = i_546_ + i_562_;
						int i_564_ = (i_546_ & 0xff00ff) + (i_562_ & 0xff00ff);
						i_562_ = (i_564_ & 0x1000100)
								+ (i_563_ - i_564_ & 0x10000);
						((Class163_Sub1) this).anIntArray5214[i_561_] = i_563_
								- i_562_ | i_562_ - (i_562_ >>> 8);
					}
					i_560_++;
					i_554_ = ++i_554_ % i_553_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	final void method1050(int i) {
		aClass363Array5188[i].method2153((byte) -126, Thread.currentThread());
	}

	final boolean method1062() {
		return false;
	}

	final Class253 method1038(int[] is, int i, int i_565_, int i_566_,
			int i_567_, boolean bool) {
		boolean bool_568_ = false;
		int i_569_ = i;
		while_46_: for (int i_570_ = 0; i_570_ < i_567_; i_570_++) {
			for (int i_571_ = 0; i_571_ < i_566_; i_571_++) {
				int i_572_ = is[i_569_++] >>> 24;
				if (i_572_ != 0 && i_572_ != 255) {
					bool_568_ = true;
					break while_46_;
				}
			}
		}
		if (bool_568_)
			return new Class253_Sub3_Sub2(this, is, i, i_565_, i_566_, i_567_,
					bool);
		return new Class253_Sub3_Sub3(this, is, i, i_565_, i_566_, i_567_, bool);
	}

	final void method1064(int i, int i_573_, int i_574_, int i_575_,
			int i_576_, int i_577_, int i_578_, int i_579_, int i_580_) {
		i_574_ -= i;
		i_575_ -= i_573_;
		if (i_575_ == 0) {
			if (i_574_ >= 0)
				method2299(i, i_573_, i_574_ + 1, i_576_, i_577_, i_578_,
						i_579_, i_580_);
			else {
				int i_581_ = i_578_ + i_579_;
				i_580_ %= i_581_;
				i_580_ = i_581_ + i_578_ - i_580_ - (-i_574_ + 1) % i_581_;
				i_580_ %= i_581_;
				if (i_580_ < 0)
					i_580_ += i_581_;
				method2299(i + i_574_, i_573_, -i_574_ + 1, i_576_, i_577_,
						i_578_, i_579_, i_580_);
			}
		} else if (i_574_ == 0) {
			if (i_575_ >= 0)
				method2307(i, i_573_, i_575_ + 1, i_576_, i_577_, i_578_,
						i_579_, i_580_);
			else {
				int i_582_ = i_578_ + i_579_;
				i_580_ %= i_582_;
				i_580_ = i_582_ + i_578_ - i_580_ - (-i_575_ + 1) % i_582_;
				i_580_ %= i_582_;
				if (i_580_ < 0)
					i_580_ += i_582_;
				method2307(i, i_573_ + i_575_, -i_575_ + 1, i_576_, i_577_,
						i_578_, i_579_, i_580_);
			}
		} else {
			i_580_ <<= 8;
			i_578_ <<= 8;
			i_579_ <<= 8;
			int i_583_ = i_578_ + i_579_;
			i_580_ %= i_583_;
			if (i_574_ + i_575_ < 0) {
				int i_584_ = (int) (Math
						.sqrt((double) (i_574_ * i_574_ + i_575_ * i_575_)) * 256.0);
				int i_585_ = i_584_ % i_583_;
				i_580_ = i_583_ + i_578_ - i_580_ - i_585_;
				i_580_ %= i_583_;
				if (i_580_ < 0)
					i_580_ += i_583_;
				i += i_574_;
				i_574_ = -i_574_;
				i_573_ += i_575_;
				i_575_ = -i_575_;
			}
			if (i_574_ > i_575_) {
				i_573_ <<= 16;
				i_573_ += 32768;
				i_575_ <<= 16;
				int i_586_ = (int) Math.floor((double) i_575_ / (double) i_574_
						+ 0.5);
				i_574_ += i;
				int i_587_ = i_576_ >>> 24;
				int i_588_ = (int) Math.sqrt((double) (65536 + (i_586_ >> 8)
						* (i_586_ >> 8)));
				if (i_577_ == 0 || i_577_ == 1 && i_587_ == 255) {
					while (i <= i_574_) {
						int i_589_ = i_573_ >> 16;
						if (i >= ((Class163_Sub1) this).anInt5186
								&& i < ((Class163_Sub1) this).anInt5178
								&& i_589_ >= ((Class163_Sub1) this).anInt5177
								&& i_589_ < ((Class163_Sub1) this).anInt5193
								&& i_580_ < i_578_)
							((Class163_Sub1) this).anIntArray5214[i + i_589_
									* ((Class163_Sub1) this).anInt5206] = i_576_;
						i_573_ += i_586_;
						i++;
						i_580_ += i_588_;
						i_580_ %= i_583_;
					}
					return;
				}
				if (i_577_ == 1) {
					i_576_ = (((i_576_ & 0xff00ff) * i_587_ >> 8 & 0xff00ff)
							+ ((i_576_ & 0xff00) * i_587_ >> 8 & 0xff00) + (i_587_ << 24));
					int i_590_ = 256 - i_587_;
					while (i <= i_574_) {
						int i_591_ = i_573_ >> 16;
						if (i >= ((Class163_Sub1) this).anInt5186
								&& i < ((Class163_Sub1) this).anInt5178
								&& i_591_ >= ((Class163_Sub1) this).anInt5177
								&& i_591_ < ((Class163_Sub1) this).anInt5193
								&& i_580_ < i_578_) {
							int i_592_ = i + i_591_
									* (((Class163_Sub1) this).anInt5206);
							int i_593_ = (((Class163_Sub1) this).anIntArray5214[i_592_]);
							i_593_ = (((i_593_ & 0xff00ff) * i_590_ >> 8 & 0xff00ff) + ((i_593_ & 0xff00)
									* i_590_ >> 8 & 0xff00));
							((Class163_Sub1) this).anIntArray5214[i_592_] = i_576_
									+ i_593_;
						}
						i_573_ += i_586_;
						i++;
						i_580_ += i_588_;
						i_580_ %= i_583_;
					}
					return;
				}
				if (i_577_ == 2) {
					while (i <= i_574_) {
						int i_594_ = i_573_ >> 16;
						if (i >= ((Class163_Sub1) this).anInt5186
								&& i < ((Class163_Sub1) this).anInt5178
								&& i_594_ >= ((Class163_Sub1) this).anInt5177
								&& i_594_ < ((Class163_Sub1) this).anInt5193
								&& i_580_ < i_578_) {
							int i_595_ = i + i_594_
									* (((Class163_Sub1) this).anInt5206);
							int i_596_ = (((Class163_Sub1) this).anIntArray5214[i_595_]);
							int i_597_ = i_576_ + i_596_;
							int i_598_ = (i_576_ & 0xff00ff)
									+ (i_596_ & 0xff00ff);
							i_596_ = (i_598_ & 0x1000100)
									+ (i_597_ - i_598_ & 0x10000);
							((Class163_Sub1) this).anIntArray5214[i_595_] = i_597_
									- i_596_ | i_596_ - (i_596_ >>> 8);
						}
						i_573_ += i_586_;
						i++;
						i_580_ += i_588_;
						i_580_ %= i_583_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			i <<= 16;
			i += 32768;
			i_574_ <<= 16;
			int i_599_ = (int) Math.floor((double) i_574_ / (double) i_575_
					+ 0.5);
			i_575_ += i_573_;
			int i_600_ = i_576_ >>> 24;
			int i_601_ = (int) Math.sqrt((double) (65536 + (i_599_ >> 8)
					* (i_599_ >> 8)));
			if (i_577_ == 0 || i_577_ == 1 && i_600_ == 255) {
				while (i_573_ <= i_575_) {
					int i_602_ = i >> 16;
					if (i_573_ >= ((Class163_Sub1) this).anInt5177
							&& i_573_ < ((Class163_Sub1) this).anInt5193
							&& i_602_ >= ((Class163_Sub1) this).anInt5186
							&& i_602_ < ((Class163_Sub1) this).anInt5178
							&& i_580_ < i_578_)
						((Class163_Sub1) this).anIntArray5214[(i_602_ + i_573_
								* ((Class163_Sub1) this).anInt5206)] = i_576_;
					i += i_599_;
					i_573_++;
					i_580_ += i_601_;
					i_580_ %= i_583_;
				}
			} else if (i_577_ == 1) {
				i_576_ = (((i_576_ & 0xff00ff) * i_600_ >> 8 & 0xff00ff)
						+ ((i_576_ & 0xff00) * i_600_ >> 8 & 0xff00) + (i_600_ << 24));
				int i_603_ = 256 - i_600_;
				while (i_573_ <= i_575_) {
					int i_604_ = i >> 16;
					if (i_573_ >= ((Class163_Sub1) this).anInt5177
							&& i_573_ < ((Class163_Sub1) this).anInt5193
							&& i_604_ >= ((Class163_Sub1) this).anInt5186
							&& i_604_ < ((Class163_Sub1) this).anInt5178
							&& i_580_ < i_578_) {
						int i_605_ = (i_604_ + i_573_
								* ((Class163_Sub1) this).anInt5206);
						int i_606_ = ((Class163_Sub1) this).anIntArray5214[i_605_];
						i_606_ = (((i_606_ & 0xff00ff) * i_603_ >> 8 & 0xff00ff) + ((i_606_ & 0xff00)
								* i_603_ >> 8 & 0xff00));
						((Class163_Sub1) this).anIntArray5214[(i_604_ + i_573_
								* ((Class163_Sub1) this).anInt5206)] = i_576_
								+ i_606_;
					}
					i += i_599_;
					i_573_++;
					i_580_ += i_601_;
					i_580_ %= i_583_;
				}
			} else if (i_577_ == 2) {
				while (i_573_ <= i_575_) {
					int i_607_ = i >> 16;
					if (i_573_ >= ((Class163_Sub1) this).anInt5177
							&& i_573_ < ((Class163_Sub1) this).anInt5193
							&& i_607_ >= ((Class163_Sub1) this).anInt5186
							&& i_607_ < ((Class163_Sub1) this).anInt5178
							&& i_580_ < i_578_) {
						int i_608_ = (i_607_ + i_573_
								* ((Class163_Sub1) this).anInt5206);
						int i_609_ = ((Class163_Sub1) this).anIntArray5214[i_608_];
						int i_610_ = i_576_ + i_609_;
						int i_611_ = (i_576_ & 0xff00ff) + (i_609_ & 0xff00ff);
						i_609_ = (i_611_ & 0x1000100)
								+ (i_610_ - i_611_ & 0x10000);
						((Class163_Sub1) this).anIntArray5214[i_608_] = i_610_
								- i_609_ | i_609_ - (i_609_ >>> 8);
					}
					i += i_599_;
					i_573_++;
					i_580_ += i_601_;
					i_580_ %= i_583_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	final Class234 method1052(int i, int i_612_, int i_613_, int i_614_,
			int i_615_, int i_616_) {
		return null;
	}

	final void A(int i, Class72 class72, int i_617_, int i_618_) {
		Class72_Sub2 class72_sub2 = (Class72_Sub2) class72;
		int[] is = ((Class72_Sub2) class72_sub2).anIntArray6909;
		int[] is_619_ = ((Class72_Sub2) class72_sub2).anIntArray6911;
		int i_620_;
		if (((Class163_Sub1) this).anInt5193 < i_618_ + is.length)
			i_620_ = ((Class163_Sub1) this).anInt5193 - i_618_;
		else
			i_620_ = is.length;
		int i_621_;
		if (((Class163_Sub1) this).anInt5177 > i_618_) {
			i_621_ = ((Class163_Sub1) this).anInt5177 - i_618_;
			i_618_ = ((Class163_Sub1) this).anInt5177;
		} else
			i_621_ = 0;
		if (i_620_ - i_621_ > 0) {
			int i_622_ = i_618_ * ((Class163_Sub1) this).anInt5206;
			for (int i_623_ = i_621_; i_623_ < i_620_; i_623_++) {
				int i_624_ = i_617_ + is[i_623_];
				int i_625_ = is_619_[i_623_];
				if (((Class163_Sub1) this).anInt5186 > i_624_) {
					i_625_ -= ((Class163_Sub1) this).anInt5186 - i_624_;
					i_624_ = ((Class163_Sub1) this).anInt5186;
				}
				if (((Class163_Sub1) this).anInt5178 < i_624_ + i_625_)
					i_625_ = ((Class163_Sub1) this).anInt5178 - i_624_;
				i_624_ += i_622_;
				for (int i_626_ = -i_625_; i_626_ < 0; i_626_++)
					((Class163_Sub1) this).anIntArray5214[i_624_++] = i;
				i_622_ += ((Class163_Sub1) this).anInt5206;
			}
		}
	}

	final boolean method1069() {
		return false;
	}

	final boolean method2308(int i) {
		if (!((Class188) ((Class163) this).anInterface1_2118.method7(
				(byte) 127, i)).aBool2420
				&& !((Class188) ((Class163) this).anInterface1_2118.method7(
						(byte) 127, i)).aBool2419)
			return false;
		return true;
	}

	final void method1004(Rectangle[] rectangles, int i, int i_627_, int i_628_)
			throws Exception_Sub1 {
		if (aCanvas5175 == null
				|| ((Class163_Sub1) this).aClass11_Sub30_5170 == null)
			throw new IllegalStateException("off");
		try {
			Graphics graphics = aCanvas5175.getGraphics();
			for (int i_629_ = 0; i_629_ < i; i_629_++) {
				Rectangle rectangle = rectangles[i_629_];
				if (rectangle.x + i_627_ <= ((Class163_Sub1) this).anInt5206
						&& rectangle.y + i_628_ <= anInt5183
						&& rectangle.x + i_627_ + rectangle.width > 0
						&& rectangle.y + i_628_ + rectangle.height > 0)
					((Class163_Sub1) this).aClass11_Sub30_5170.method2730(
							rectangle.height, rectangle.x, rectangle.width,
							-72, rectangle.y, rectangle.y + i_628_, rectangle.x
									+ i_627_, graphics);
			}
		} catch (Exception exception) {
			aCanvas5175.repaint();
		}
	}

	final int JA(int i, int i_630_, int i_631_, int i_632_, int i_633_,
			int i_634_) {
		int i_635_ = 0;
		float f = ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7196)
				* (float) i
				+ (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7185)
				* (float) i_630_
				+ (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7166)
				* (float) i_631_ + (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7175));
		if (f < 1.0F)
			f = 1.0F;
		float f_636_ = ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7196)
				* (float) i_632_
				+ (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7185)
				* (float) i_633_
				+ (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7166)
				* (float) i_634_ + (((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7175));
		if (f_636_ < 1.0F)
			f_636_ = 1.0F;
		if (f < (float) ((Class163_Sub1) this).anInt5200
				&& f_636_ < (float) ((Class163_Sub1) this).anInt5200)
			i_635_ |= 0x10;
		else if (f > (float) ((Class163_Sub1) this).anInt5201
				&& f_636_ > (float) ((Class163_Sub1) this).anInt5201)
			i_635_ |= 0x20;
		int i_637_ = (int) ((float) ((Class163_Sub1) this).anInt5215
				* ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7164 * (float) i)
						+ (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7195 * (float) i_630_)
						+ (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7193 * (float) i_631_) + ((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7197) / f);
		int i_638_ = (int) ((float) ((Class163_Sub1) this).anInt5215
				* ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7164 * (float) i_632_)
						+ (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7195 * (float) i_633_)
						+ (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7193 * (float) i_634_) + ((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7197) / f_636_);
		if (i_637_ < ((Class163_Sub1) this).anInt5212
				&& i_638_ < ((Class163_Sub1) this).anInt5212)
			i_635_ |= 0x1;
		else if (i_637_ > ((Class163_Sub1) this).anInt5203
				&& i_638_ > ((Class163_Sub1) this).anInt5203)
			i_635_ |= 0x2;
		int i_639_ = (int) ((float) ((Class163_Sub1) this).anInt5205
				* ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7179 * (float) i)
						+ (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7186 * (float) i_630_)
						+ (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7182 * (float) i_631_) + ((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7190) / f);
		int i_640_ = (int) ((float) ((Class163_Sub1) this).anInt5205
				* ((((Class33_Sub3) ((Class163_Sub1) this).aClass33_Sub3_5207).aFloat7179 * (float) i_632_)
						+ (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7186 * (float) i_633_)
						+ (((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7182 * (float) i_634_) + ((Class33_Sub3) (((Class163_Sub1) this).aClass33_Sub3_5207)).aFloat7190) / f_636_);
		if (i_639_ < ((Class163_Sub1) this).anInt5179
				&& i_640_ < ((Class163_Sub1) this).anInt5179)
			i_635_ |= 0x4;
		else if (i_639_ > ((Class163_Sub1) this).anInt5202
				&& i_640_ > ((Class163_Sub1) this).anInt5202)
			i_635_ |= 0x8;
		return i_635_;
	}

	final void method1043() {
		/* empty */
	}
}
