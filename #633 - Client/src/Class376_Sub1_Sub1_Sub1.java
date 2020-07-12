/* Class376_Sub1_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class376_Sub1_Sub1_Sub1 extends Class376_Sub1_Sub1 {
	private int anInt10251;
	private short aShort10252;
	private short aShort10253;
	private short aShort10254;
	Class376_Sub2 aClass376_Sub2_10255;
	private short aShort10256;
	private short aShort10257;
	private short aShort10258;
	private int anInt10259;

	final void method3946(Class376_Sub2 class376_sub2, int i, int i_0_,
			int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_,
			int i_7_, int i_8_, int i_9_, boolean bool, boolean bool_10_) {
		((Class376_Sub1_Sub1_Sub1) this).aClass376_Sub2_10255 = class376_sub2;
		((Class376_Sub1_Sub1) this).anInt8689 = i << 12;
		((Class376_Sub1_Sub1) this).anInt8691 = i_0_ << 12;
		((Class376_Sub1_Sub1) this).anInt8684 = i_1_ << 12;
		((Class376_Sub1_Sub1) this).anInt8696 = i_7_;
		aShort10253 = aShort10257 = (short) i_6_;
		((Class376_Sub1_Sub1) this).anInt8692 = i_8_;
		((Class376_Sub1_Sub1) this).anInt8694 = i_9_;
		((Class376_Sub1_Sub1) this).aBool8686 = bool_10_;
		aShort10254 = (short) i_2_;
		aShort10256 = (short) i_3_;
		aShort10252 = (short) i_4_;
		anInt10259 = i_5_;
		((Class376_Sub1_Sub1) this).aByte8697 = ((Class110) (((Class376_Sub2) (((Class376_Sub1_Sub1_Sub1) this).aClass376_Sub2_10255)).aClass110_5564)).aByte1503;
		method3949();
	}

	final void method3947() {
		((Class376_Sub10) (((Class376_Sub2) (((Class376_Sub1_Sub1_Sub1) this).aClass376_Sub2_10255)).aClass376_Sub10_5561)).aClass376_Sub1_Sub1_Sub1Array7879[aShort10258] = null;
		Class11_Sub28.aClass376_Sub1_Sub1_Sub1Array6559[Class4.anInt33] = this;
		Class4.anInt33 = Class4.anInt33 + 1 & 0x3ff;
		this.method2207((byte) -127);
		this.method2274((byte) 88);
	}

	final void method3948(Class163 class163, long l) {
		int i = (((Class376_Sub1_Sub1) this).anInt8689 >> 12 + Class11_Sub2_Sub8.anInt8751);
		int i_11_ = (((Class376_Sub1_Sub1) this).anInt8684 >> 12 + Class11_Sub2_Sub8.anInt8751);
		int i_12_ = ((Class376_Sub1_Sub1) this).anInt8691 >> 12;
		if (i_12_ > 0 || i_12_ < -262144 || i < 0 || i >= Class138.anInt1886
				|| i_11_ < 0 || i_11_ >= Class82.anInt1133)
			method3947();
		else {
			Class376_Sub10 class376_sub10 = (((Class376_Sub2) ((Class376_Sub1_Sub1_Sub1) this).aClass376_Sub2_10255).aClass376_Sub10_5561);
			Class129 class129 = (((Class376_Sub2) ((Class376_Sub1_Sub1_Sub1) this).aClass376_Sub2_10255).aClass129_5559);
			Class12[] class12s = Class315.aClass12Array4179;
			int i_13_ = ((Class376_Sub10) class376_sub10).anInt7886;
			Class364 class364 = (Class181.aClass364ArrayArrayArray2336[((Class376_Sub10) class376_sub10).anInt7886][i][i_11_]);
			if (class364 != null)
				i_13_ = ((Class364) class364).aByte4785;
			int i_14_ = class12s[i_13_].method131((byte) -110, i_11_, i);
			int i_15_;
			if (i_13_ < Class155.anInt2044 - 1)
				i_15_ = class12s[i_13_ + 1].method131((byte) 124, i_11_, i);
			else
				i_15_ = i_14_ - (8 << Class11_Sub2_Sub8.anInt8751);
			if (((Class129) class129).aBool1736) {
				if (((Class129) class129).anInt1737 == -1 && i_12_ > i_14_) {
					method3947();
					return;
				}
				if (((Class129) class129).anInt1737 >= 0
						&& i_12_ > class12s[((Class129) class129).anInt1737]
								.method131((byte) 122, i_11_, i)) {
					method3947();
					return;
				}
				if (((Class129) class129).anInt1774 == -1 && i_12_ < i_15_) {
					method3947();
					return;
				}
				if (((Class129) class129).anInt1774 >= 0
						&& i_12_ < class12s[((Class129) class129).anInt1774 + 1]
								.method131((byte) 127, i_11_, i)) {
					method3947();
					return;
				}
			}
			int i_16_;
			for (i_16_ = Class155.anInt2044 - 1; (i_16_ > 0 && i_12_ > class12s[i_16_]
					.method131((byte) -109, i_11_, i)); i_16_--) {
				/* empty */
			}
			if (((Class129) class129).aBool1798 && i_16_ == 0
					&& i_12_ > class12s[0].method131((byte) -109, i_11_, i))
				method3947();
			else if (i_16_ == Class155.anInt2044 - 1
					&& (class12s[i_16_].method131((byte) 127, i_11_, i) - i_12_) > 8 << Class11_Sub2_Sub8.anInt8751)
				method3947();
			else {
				class364 = Class181.aClass364ArrayArrayArray2336[i_16_][i][i_11_];
				if (class364 == null) {
					if (i_16_ == 0
							|| (Class181.aClass364ArrayArrayArray2336[0][i][i_11_] == null))
						class364 = Class181.aClass364ArrayArrayArray2336[0][i][i_11_] = new Class364(
								0);
					boolean bool = (((Class364) (Class181.aClass364ArrayArrayArray2336[0][i][i_11_])).aClass364_4783 != null);
					if (i_16_ == 3 && bool) {
						method3947();
						return;
					}
					for (int i_17_ = 1; i_17_ <= i_16_; i_17_++) {
						if ((Class181.aClass364ArrayArrayArray2336[i_17_][i][i_11_]) == null) {
							class364 = Class181.aClass364ArrayArrayArray2336[i_17_][i][i_11_] = new Class364(
									i_17_);
							if (bool)
								((Class364) class364).aByte4785++;
						}
					}
				}
				if (((Class129) class129).aBool1794) {
					int i_18_ = ((Class376_Sub1_Sub1) this).anInt8689 >> 12;
					int i_19_ = ((Class376_Sub1_Sub1) this).anInt8684 >> 12;
					if (((Class364) class364).aClass376_Sub7_Sub3_4780 != null) {
						Class212 class212 = ((Class364) class364).aClass376_Sub7_Sub3_4780
								.method2860(0, class163);
						if (class212 != null
								&& class212.method1358(i_19_, i_12_, i_18_,
										(byte) 90)) {
							method3947();
							return;
						}
					}
					if (((Class364) class364).aClass376_Sub7_Sub3_4776 != null) {
						Class212 class212 = ((Class364) class364).aClass376_Sub7_Sub3_4776
								.method2860(0, class163);
						if (class212 != null
								&& class212.method1358(i_19_, i_12_, i_18_,
										(byte) 94)) {
							method3947();
							return;
						}
					}
					if (((Class364) class364).aClass376_Sub7_Sub2_4777 != null) {
						Class212 class212 = ((Class364) class364).aClass376_Sub7_Sub2_4777
								.method2860(0, class163);
						if (class212 != null
								&& class212.method1358(i_19_, i_12_, i_18_,
										(byte) -64)) {
							method3947();
							return;
						}
					}
					for (Class140 class140 = ((Class364) class364).aClass140_4781; class140 != null; class140 = ((Class140) class140).aClass140_1895) {
						Class212 class212 = ((Class140) class140).aClass376_Sub7_Sub5_1896
								.method2860(0, class163);
						if (class212 != null
								&& class212.method1358(i_19_, i_12_, i_18_,
										(byte) 93)) {
							method3947();
							return;
						}
					}
				}
				((Class116) ((Class376_Sub10) class376_sub10).aClass116_7889).aClass246_1584
						.method1550(4096, this);
			}
		}
	}

	private final void method3949() {
		int i = (((Class376_Sub10) ((Class376_Sub2) (((Class376_Sub1_Sub1_Sub1) this).aClass376_Sub2_10255)).aClass376_Sub10_5561).anInt7880);
		if ((((Class376_Sub10) ((Class376_Sub2) (((Class376_Sub1_Sub1_Sub1) this).aClass376_Sub2_10255)).aClass376_Sub10_5561).aClass376_Sub1_Sub1_Sub1Array7879[i]) != null)
			((Class376_Sub10) ((Class376_Sub2) (((Class376_Sub1_Sub1_Sub1) this).aClass376_Sub2_10255)).aClass376_Sub10_5561).aClass376_Sub1_Sub1_Sub1Array7879[i]
					.method3947();
		((Class376_Sub10) (((Class376_Sub2) (((Class376_Sub1_Sub1_Sub1) this).aClass376_Sub2_10255)).aClass376_Sub10_5561)).aClass376_Sub1_Sub1_Sub1Array7879[i] = this;
		aShort10258 = (short) ((Class376_Sub10) (((Class376_Sub2) ((Class376_Sub1_Sub1_Sub1) this).aClass376_Sub2_10255).aClass376_Sub10_5561)).anInt7880;
		((Class376_Sub10) (((Class376_Sub2) (((Class376_Sub1_Sub1_Sub1) this).aClass376_Sub2_10255)).aClass376_Sub10_5561)).anInt7880 = i + 1 & 0x1fff;
		((Class376_Sub2) ((Class376_Sub1_Sub1_Sub1) this).aClass376_Sub2_10255).aClass131_5569
				.method853(0, this);
	}

	final void method3950(long l, int i) {
		aShort10257 -= i;
		if (aShort10257 <= 0)
			method3947();
		else {
			int i_20_ = ((Class376_Sub1_Sub1) this).anInt8689 >> 12;
			int i_21_ = ((Class376_Sub1_Sub1) this).anInt8691 >> 12;
			int i_22_ = ((Class376_Sub1_Sub1) this).anInt8684 >> 12;
			Class376_Sub10 class376_sub10 = (((Class376_Sub2) ((Class376_Sub1_Sub1_Sub1) this).aClass376_Sub2_10255).aClass376_Sub10_5561);
			Class129 class129 = (((Class376_Sub2) ((Class376_Sub1_Sub1_Sub1) this).aClass376_Sub2_10255).aClass129_5559);
			if (((Class129) class129).anInt1756 != 0) {
				if (aShort10253 - aShort10257 <= ((Class129) class129).anInt1789) {
					int i_23_ = ((((Class376_Sub1_Sub1) this).anInt8696 >> 8 & 0xff00)
							+ (anInt10251 >> 16 & 0xff) + ((Class129) class129).anInt1784
							* i);
					int i_24_ = ((((Class376_Sub1_Sub1) this).anInt8696 & 0xff00)
							+ (anInt10251 >> 8 & 0xff) + ((Class129) class129).anInt1790
							* i);
					int i_25_ = ((((Class376_Sub1_Sub1) this).anInt8696 << 8 & 0xff00)
							+ (anInt10251 & 0xff) + ((Class129) class129).anInt1732
							* i);
					if (i_23_ < 0)
						i_23_ = 0;
					else if (i_23_ > 65535)
						i_23_ = 65535;
					if (i_24_ < 0)
						i_24_ = 0;
					else if (i_24_ > 65535)
						i_24_ = 65535;
					if (i_25_ < 0)
						i_25_ = 0;
					else if (i_25_ > 65535)
						i_25_ = 65535;
					((Class376_Sub1_Sub1) this).anInt8696 &= ~0xffffff;
					((Class376_Sub1_Sub1) this).anInt8696 |= (((i_23_ & 0xff00) << 8)
							+ (i_24_ & 0xff00) + ((i_25_ & 0xff00) >> 8));
					anInt10251 &= ~0xffffff;
					anInt10251 |= (((i_23_ & 0xff) << 16)
							+ ((i_24_ & 0xff) << 8) + (i_25_ & 0xff));
				}
				if (aShort10253 - aShort10257 <= ((Class129) class129).anInt1782) {
					int i_26_ = ((((Class376_Sub1_Sub1) this).anInt8696 >> 16 & 0xff00)
							+ (anInt10251 >> 24 & 0xff) + ((Class129) class129).anInt1744
							* i);
					if (i_26_ < 0)
						i_26_ = 0;
					else if (i_26_ > 65535)
						i_26_ = 65535;
					((Class376_Sub1_Sub1) this).anInt8696 &= 0xffffff;
					((Class376_Sub1_Sub1) this).anInt8696 |= (i_26_ & 0xff00) << 16;
					anInt10251 &= 0xffffff;
					anInt10251 |= (i_26_ & 0xff) << 24;
				}
			}
			if (((Class129) class129).anInt1757 != -1
					&& (aShort10253 - aShort10257 <= ((Class129) class129).anInt1767))
				anInt10259 += ((Class129) class129).anInt1751 * i;
			if (((Class129) class129).anInt1792 != -1
					&& (aShort10253 - aShort10257 <= ((Class129) class129).anInt1785))
				((Class376_Sub1_Sub1) this).anInt8692 += ((Class129) class129).anInt1733
						* i;
			double d = (double) aShort10254;
			double d_27_ = (double) aShort10256;
			double d_28_ = (double) aShort10252;
			boolean bool = false;
			if (((Class129) class129).anInt1788 == 1) {
				int i_29_ = i_20_
						- ((Class87) (((Class376_Sub2) (((Class376_Sub1_Sub1_Sub1) this).aClass376_Sub2_10255)).aClass87_5563)).anInt1206;
				int i_30_ = i_21_
						- ((Class87) (((Class376_Sub2) (((Class376_Sub1_Sub1_Sub1) this).aClass376_Sub2_10255)).aClass87_5563)).anInt1208;
				int i_31_ = i_22_
						- ((Class87) (((Class376_Sub2) (((Class376_Sub1_Sub1_Sub1) this).aClass376_Sub2_10255)).aClass87_5563)).anInt1216;
				int i_32_ = ((int) Math.sqrt((double) (i_29_ * i_29_ + i_30_
						* i_30_ + i_31_ * i_31_)) >> 2);
				long l_33_ = (long) (((Class129) class129).anInt1787 * i_32_ * i);
				anInt10259 -= (long) anInt10259 * l_33_ >> 18;
			} else if (((Class129) class129).anInt1788 == 2) {
				int i_34_ = i_20_
						- ((Class87) (((Class376_Sub2) (((Class376_Sub1_Sub1_Sub1) this).aClass376_Sub2_10255)).aClass87_5563)).anInt1206;
				int i_35_ = i_21_
						- ((Class87) (((Class376_Sub2) (((Class376_Sub1_Sub1_Sub1) this).aClass376_Sub2_10255)).aClass87_5563)).anInt1208;
				int i_36_ = i_22_
						- ((Class87) (((Class376_Sub2) (((Class376_Sub1_Sub1_Sub1) this).aClass376_Sub2_10255)).aClass87_5563)).anInt1216;
				int i_37_ = i_34_ * i_34_ + i_35_ * i_35_ + i_36_ * i_36_;
				long l_38_ = (long) (((Class129) class129).anInt1787 * i_37_ * i);
				anInt10259 -= (long) anInt10259 * l_38_ >> 28;
			}
			if (((Class129) class129).anIntArray1783 != null) {
				Class11 class11 = ((Class84) (((Class376_Sub10) class376_sub10).aClass84_7883)).aClass11_1149;
				for (Class11 class11_39_ = ((Class11) class11).aClass11_88; class11_39_ != class11; class11_39_ = ((Class11) class11_39_).aClass11_88) {
					Class11_Sub45_Sub11 class11_sub45_sub11 = (Class11_Sub45_Sub11) class11_39_;
					Class343 class343 = (((Class11_Sub45_Sub11) class11_sub45_sub11).aClass343_9155);
					if (((Class343) class343).anInt4542 != 1) {
						boolean bool_40_ = false;
						for (int i_41_ = 0; (i_41_ < ((Class129) class129).anIntArray1783.length); i_41_++) {
							if (((Class129) class129).anIntArray1783[i_41_] == ((Class343) class343).anInt4545) {
								bool_40_ = true;
								break;
							}
						}
						if (bool_40_) {
							double d_42_ = (double) (i_20_ - ((Class11_Sub45_Sub11) class11_sub45_sub11).anInt9161);
							double d_43_ = (double) (i_21_ - ((Class11_Sub45_Sub11) class11_sub45_sub11).anInt9167);
							double d_44_ = (double) (i_22_ - ((Class11_Sub45_Sub11) class11_sub45_sub11).anInt9163);
							double d_45_ = (d_42_ * d_42_ + d_43_ * d_43_ + d_44_
									* d_44_);
							if (!(d_45_ > (double) (((Class343) class343).aLong4549))) {
								double d_46_ = Math.sqrt(d_45_);
								if (d_46_ == 0.0)
									d_46_ = 1.0;
								double d_47_ = (((d_42_ * (double) (((Class11_Sub45_Sub11) class11_sub45_sub11).anInt9160))
										+ d_43_
										* (double) ((Class343) class343).anInt4546 + (d_44_ * (double) (((Class11_Sub45_Sub11) class11_sub45_sub11).anInt9156))) * 65535.0 / ((double) (((Class343) class343).anInt4551) * d_46_));
								if (!(d_47_ < (double) (((Class343) class343).anInt4544))) {
									double d_48_ = 0.0;
									if (((Class343) class343).anInt4553 == 1)
										d_48_ = (d_46_ / 16.0 * (double) (((Class343) class343).anInt4548));
									else if (((Class343) class343).anInt4553 == 2)
										d_48_ = (d_46_ / 16.0 * (d_46_ / 16.0) * (double) (((Class343) class343).anInt4548));
									if (((Class343) class343).anInt4541 == 0) {
										if (((Class343) class343).anInt4552 == 0) {
											d += ((double) (((Class11_Sub45_Sub11) class11_sub45_sub11).anInt9160) - d_48_)
													* (double) i;
											d_27_ += ((double) (((Class343) class343).anInt4546) - d_48_)
													* (double) i;
											d_28_ += ((double) (((Class11_Sub45_Sub11) class11_sub45_sub11).anInt9156) - d_48_)
													* (double) i;
											bool = true;
										} else {
											((Class376_Sub1_Sub1) this).anInt8689 += ((double) (((Class11_Sub45_Sub11) class11_sub45_sub11).anInt9160) - d_48_)
													* (double) i;
											((Class376_Sub1_Sub1) this).anInt8691 += ((double) (((Class343) class343).anInt4546) - d_48_)
													* (double) i;
											((Class376_Sub1_Sub1) this).anInt8684 += ((double) (((Class11_Sub45_Sub11) class11_sub45_sub11).anInt9156) - d_48_)
													* (double) i;
										}
									} else {
										double d_49_ = (d_42_ / d_46_ * (double) (((Class343) class343).anInt4551));
										double d_50_ = (d_43_ / d_46_ * (double) (((Class343) class343).anInt4551));
										double d_51_ = (d_44_ / d_46_ * (double) (((Class343) class343).anInt4551));
										if (((Class343) class343).anInt4552 == 0) {
											d += d_49_ * (double) i;
											d_27_ += d_50_ * (double) i;
											d_28_ += d_51_ * (double) i;
											bool = true;
										} else {
											((Class376_Sub1_Sub1) this).anInt8689 += d_49_
													* (double) i;
											((Class376_Sub1_Sub1) this).anInt8691 += d_50_
													* (double) i;
											((Class376_Sub1_Sub1) this).anInt8684 += d_51_
													* (double) i;
										}
									}
								}
							}
						}
					}
				}
			}
			if (((Class129) class129).anIntArray1740 != null) {
				for (int i_52_ = 0; i_52_ < ((Class129) class129).anIntArray1740.length; i_52_++) {
					Class11_Sub45_Sub11 class11_sub45_sub11 = ((Class11_Sub45_Sub11) (Class180.aClass65_2333
							.method490(
									-1,
									(long) (((Class129) class129).anIntArray1740[i_52_]))));
					while (class11_sub45_sub11 != null) {
						Class343 class343 = (((Class11_Sub45_Sub11) class11_sub45_sub11).aClass343_9155);
						double d_53_ = (double) (i_20_ - ((Class11_Sub45_Sub11) class11_sub45_sub11).anInt9161);
						double d_54_ = (double) (i_21_ - ((Class11_Sub45_Sub11) class11_sub45_sub11).anInt9167);
						double d_55_ = (double) (i_22_ - ((Class11_Sub45_Sub11) class11_sub45_sub11).anInt9163);
						double d_56_ = d_53_ * d_53_ + d_54_ * d_54_ + d_55_
								* d_55_;
						if (d_56_ > (double) ((Class343) class343).aLong4549)
							class11_sub45_sub11 = ((Class11_Sub45_Sub11) Class180.aClass65_2333
									.method491(-23702));
						else {
							double d_57_ = Math.sqrt(d_56_);
							if (d_57_ == 0.0)
								d_57_ = 1.0;
							double d_58_ = ((d_53_
									* (double) (((Class11_Sub45_Sub11) class11_sub45_sub11).anInt9160)
									+ d_54_
									* (double) (((Class343) class343).anInt4546) + d_55_
									* (double) (((Class11_Sub45_Sub11) class11_sub45_sub11).anInt9156)) * 65535.0 / ((double) ((Class343) class343).anInt4551 * d_57_));
							if (d_58_ < (double) ((Class343) class343).anInt4544)
								class11_sub45_sub11 = ((Class11_Sub45_Sub11) Class180.aClass65_2333
										.method491(-23702));
							else {
								double d_59_ = 0.0;
								if (((Class343) class343).anInt4553 == 1)
									d_59_ = (d_57_ / 16.0 * (double) (((Class343) class343).anInt4548));
								else if (((Class343) class343).anInt4553 == 2)
									d_59_ = (d_57_ / 16.0 * (d_57_ / 16.0) * (double) (((Class343) class343).anInt4548));
								if (((Class343) class343).anInt4541 == 0) {
									if (((Class343) class343).anInt4552 == 0) {
										d += ((double) (((Class11_Sub45_Sub11) class11_sub45_sub11).anInt9160) - d_59_)
												* (double) i;
										d_27_ += ((double) (((Class343) class343).anInt4546) - d_59_)
												* (double) i;
										d_28_ += ((double) (((Class11_Sub45_Sub11) class11_sub45_sub11).anInt9156) - d_59_)
												* (double) i;
										bool = true;
									} else {
										((Class376_Sub1_Sub1) this).anInt8689 += ((double) (((Class11_Sub45_Sub11) class11_sub45_sub11).anInt9160) - d_59_)
												* (double) i;
										((Class376_Sub1_Sub1) this).anInt8691 += ((double) (((Class343) class343).anInt4546) - d_59_)
												* (double) i;
										((Class376_Sub1_Sub1) this).anInt8684 += ((double) (((Class11_Sub45_Sub11) class11_sub45_sub11).anInt9156) - d_59_)
												* (double) i;
									}
								} else {
									double d_60_ = (d_53_ / d_57_ * (double) (((Class343) class343).anInt4551));
									double d_61_ = (d_54_ / d_57_ * (double) (((Class343) class343).anInt4551));
									double d_62_ = (d_55_ / d_57_ * (double) (((Class343) class343).anInt4551));
									if (((Class343) class343).anInt4552 == 0) {
										d += d_60_ * (double) i;
										d_27_ += d_61_ * (double) i;
										d_28_ += d_62_ * (double) i;
										bool = true;
									} else {
										((Class376_Sub1_Sub1) this).anInt8689 += d_60_
												* (double) i;
										((Class376_Sub1_Sub1) this).anInt8691 += d_61_
												* (double) i;
										((Class376_Sub1_Sub1) this).anInt8684 += d_62_
												* (double) i;
									}
								}
								class11_sub45_sub11 = ((Class11_Sub45_Sub11) Class180.aClass65_2333
										.method491(-23702));
							}
						}
					}
				}
			}
			if (((Class129) class129).anIntArray1762 != null) {
				if (((Class129) class129).anIntArray1734 == null) {
					((Class129) class129).anIntArray1734 = new int[((Class129) class129).anIntArray1762.length];
					for (int i_63_ = 0; i_63_ < ((Class129) class129).anIntArray1762.length; i_63_++) {
						Class37.method318(
								(((Class129) class129).anIntArray1762[i_63_]),
								false);
						((Class129) class129).anIntArray1734[i_63_] = (((Class11_Sub51) (Class11_Sub51) (Class35.aClass213_465
								.method1369(
										(byte) 26,
										(long) (((Class129) class129).anIntArray1762[i_63_])))).anInt8036);
					}
				}
				for (int i_64_ = 0; i_64_ < ((Class129) class129).anIntArray1734.length; i_64_++) {
					Class343 class343 = (Class49.aClass343Array756[((Class129) class129).anIntArray1734[i_64_]]);
					if (((Class343) class343).anInt4552 == 0) {
						d += (double) (((Class343) class343).anInt4550 * i);
						d_27_ += (double) (((Class343) class343).anInt4546 * i);
						d_28_ += (double) (((Class343) class343).anInt4557 * i);
						bool = true;
					} else {
						((Class376_Sub1_Sub1) this).anInt8689 += ((Class343) class343).anInt4550
								* i;
						((Class376_Sub1_Sub1) this).anInt8691 += ((Class343) class343).anInt4546
								* i;
						((Class376_Sub1_Sub1) this).anInt8684 += ((Class343) class343).anInt4557
								* i;
					}
				}
			}
			if (bool) {
				while (d > 32767.0 || d_27_ > 32767.0 || d_28_ > 32767.0
						|| d < -32767.0 || d_27_ < -32767.0 || d_28_ < -32767.0) {
					d /= 2.0;
					d_27_ /= 2.0;
					d_28_ /= 2.0;
					anInt10259 <<= 1;
				}
				aShort10254 = (short) (int) d;
				aShort10256 = (short) (int) d_27_;
				aShort10252 = (short) (int) d_28_;
			}
			((Class376_Sub1_Sub1) this).anInt8689 += (((long) aShort10254
					* (long) (anInt10259 << 2) >> 23) * (long) i);
			((Class376_Sub1_Sub1) this).anInt8691 += (((long) aShort10256
					* (long) (anInt10259 << 2) >> 23) * (long) i);
			((Class376_Sub1_Sub1) this).anInt8684 += (((long) aShort10252
					* (long) (anInt10259 << 2) >> 23) * (long) i);
		}
	}

	Class376_Sub1_Sub1_Sub1(Class376_Sub2 class376_sub2, int i, int i_65_,
			int i_66_, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_,
			int i_72_, int i_73_, int i_74_, boolean bool, boolean bool_75_) {
		((Class376_Sub1_Sub1_Sub1) this).aClass376_Sub2_10255 = class376_sub2;
		((Class376_Sub1_Sub1) this).anInt8689 = i << 12;
		((Class376_Sub1_Sub1) this).anInt8691 = i_65_ << 12;
		((Class376_Sub1_Sub1) this).anInt8684 = i_66_ << 12;
		((Class376_Sub1_Sub1) this).anInt8696 = i_72_;
		aShort10253 = aShort10257 = (short) i_71_;
		((Class376_Sub1_Sub1) this).anInt8692 = i_73_;
		((Class376_Sub1_Sub1) this).anInt8694 = i_74_;
		((Class376_Sub1_Sub1) this).aBool8686 = bool_75_;
		aShort10254 = (short) i_67_;
		aShort10256 = (short) i_68_;
		aShort10252 = (short) i_69_;
		anInt10259 = i_70_;
		((Class376_Sub1_Sub1) this).aByte8697 = ((Class110) (((Class376_Sub2) (((Class376_Sub1_Sub1_Sub1) this).aClass376_Sub2_10255)).aClass110_5564)).aByte1503;
		method3949();
	}
}
