/* Class253 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class253 implements Interface8 {
	private final void method1605(float f, float f_0_, float f_1_, float f_2_,
			int i, int i_3_, int i_4_, int i_5_, int i_6_) {
		if (i != 0) {
			double d = (double) (i_3_ & 0xffff) * 9.587379924285257E-5;
			float f_7_ = (float) Math.sin(d) * (float) i;
			float f_8_ = (float) Math.cos(d) * (float) i;
			float f_9_ = (-f_1_ * f_8_ + -f_2_ * f_7_) / 4096.0F + f;
			float f_10_ = (f_1_ * f_7_ + -f_2_ * f_8_) / 4096.0F + f_0_;
			float f_11_ = ((((float) method1608() - f_1_) * f_8_ + -f_2_ * f_7_) / 4096.0F + f);
			float f_12_ = ((-((float) method1608() - f_1_) * f_7_ + -f_2_
					* f_8_) / 4096.0F + f_0_);
			float f_13_ = ((-f_1_ * f_8_ + ((float) method1622() - f_2_) * f_7_) / 4096.0F + f);
			float f_14_ = ((f_1_ * f_7_ + ((float) method1622() - f_2_) * f_8_) / 4096.0F + f_0_);
			method1614(f_9_, f_10_, f_11_, f_12_, f_13_, f_14_, i_4_, i_5_,
					i_6_);
		}
	}

	final void method1606(int i, int i_15_, int i_16_, int i_17_, int i_18_,
			int i_19_, int i_20_) {
		method1626(i, i_15_, i_16_, i_17_, i_18_, i_19_, i_20_, 1);
	}

	abstract void method1607(int i, int i_21_, int i_22_, int i_23_);

	abstract int method1608();

	abstract int method1609();

	final void method1610(int i, int i_24_) {
		method1624(i, i_24_, 1, 0, 1);
	}

	abstract void method1611(int i, int i_25_, int i_26_, int i_27_, int i_28_,
			int i_29_);

	abstract void method1612(int i, int i_30_, Class72 class72, int i_31_,
			int i_32_);

	abstract void method1613(int i, int i_33_, int i_34_);

	private final void method1614(float f, float f_35_, float f_36_,
			float f_37_, float f_38_, float f_39_, int i, int i_40_, int i_41_) {
		method1617(f, f_35_, f_36_, f_37_, f_38_, f_39_, i, i_40_, i_41_, 1);
	}

	abstract int method1615();

	final void method1616(float f, float f_42_, int i, int i_43_) {
		method1605(f, f_42_, (float) method1608() / 2.0F,
				(float) method1622() / 2.0F, i, i_43_, 1, 0, 1);
	}

	abstract void method1617(float f, float f_44_, float f_45_, float f_46_,
			float f_47_, float f_48_, int i, int i_49_, int i_50_, int i_51_);

	final void method1618(int i, int i_52_, int i_53_, int i_54_) {
		method1625(i, i_52_, i_53_, i_54_, 1, 0, 1);
	}

	private final void method1619(float f, float f_55_, float f_56_,
			float f_57_, float f_58_, float f_59_, Class72 class72, int i,
			int i_60_) {
		method1628(f, f_55_, f_56_, f_57_, f_58_, f_59_, 1, class72, i, i_60_);
	}

	final void method1620(int i, int i_61_, int i_62_, int i_63_) {
		method1626(i, i_61_, i_62_, i_63_, 1, 0, 1, 1);
	}

	final void method1621(float f, float f_64_, int i, int i_65_, int i_66_,
			int i_67_, int i_68_) {
		method1605(f, f_64_, (float) method1608() / 2.0F,
				(float) method1622() / 2.0F, i, i_65_, i_66_, i_67_, i_68_);
	}

	abstract int method1622();

	public Class253() {
		/* empty */
	}

	final void method1623(float f, float f_69_, int i, int i_70_,
			Class72 class72, int i_71_, int i_72_) {
		method1627(f, f_69_, (float) method1608() / 2.0F,
				(float) method1622() / 2.0F, i, i_70_, class72, i_71_, i_72_);
	}

	abstract void method1624(int i, int i_73_, int i_74_, int i_75_, int i_76_);

	abstract void method1625(int i, int i_77_, int i_78_, int i_79_, int i_80_,
			int i_81_, int i_82_);

	abstract void method1626(int i, int i_83_, int i_84_, int i_85_, int i_86_,
			int i_87_, int i_88_, int i_89_);

	final void method1627(float f, float f_90_, float f_91_, float f_92_,
			int i, int i_93_, Class72 class72, int i_94_, int i_95_) {
		if (i != 0) {
			double d = (double) (i_93_ & 0xffff) * 9.587379924285257E-5;
			float f_96_ = (float) Math.sin(d) * (float) i;
			float f_97_ = (float) Math.cos(d) * (float) i;
			float f_98_ = (-f_91_ * f_97_ + -f_92_ * f_96_) / 4096.0F + f;
			float f_99_ = (f_91_ * f_96_ + -f_92_ * f_97_) / 4096.0F + f_90_;
			float f_100_ = ((((float) method1608() - f_91_) * f_97_ + -f_92_
					* f_96_) / 4096.0F + f);
			float f_101_ = ((-((float) method1608() - f_91_) * f_96_ + -f_92_
					* f_97_) / 4096.0F + f_90_);
			float f_102_ = (((-f_91_ * f_97_ + ((float) method1622() - f_92_)
					* f_96_) / 4096.0F) + f);
			float f_103_ = (((f_91_ * f_96_ + ((float) method1622() - f_92_)
					* f_97_) / 4096.0F) + f_90_);
			method1619(f_98_, f_99_, f_100_, f_101_, f_102_, f_103_, class72,
					i_94_, i_95_);
		}
	}

	abstract void method1628(float f, float f_104_, float f_105_, float f_106_,
			float f_107_, float f_108_, int i, Class72 class72, int i_109_,
			int i_110_);
}
