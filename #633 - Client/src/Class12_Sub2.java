/* Class12_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class12_Sub2 extends Class12 {
	private byte[][] aByteArrayArray5273;
	private Class136[][] aClass136ArrayArray5274;
	private float aFloat5275;
	private Class241[][] aClass241ArrayArray5276;
	private Class252[][] aClass252ArrayArray5277;
	private float aFloat5278;
	private float aFloat5279;
	private int anInt5280 = -1;
	private float aFloat5281;
	private float aFloat5282;
	private float aFloat5283;
	private float aFloat5284;
	private float aFloat5285;
	private float aFloat5286;
	private Class99[][] aClass99ArrayArray5287;
	private float aFloat5288;
	private float aFloat5289;
	private byte[][] aByteArrayArray5290;
	private float aFloat5291;
	private Class158[][] aClass158ArrayArray5292;
	private int anInt5293;
	private Class163_Sub1 aClass163_Sub1_5294;

	private final void method2330(int i, int i_0_, int i_1_) {
		Class363 class363 = aClass163_Sub1_5294.method2306(Thread
				.currentThread());
		((Class296) ((Class363) class363).aClass296_4767).anInt3997 = 0;
		if (aClass99ArrayArray5287 != null)
			method2332(i, i_0_, ((Class363) class363).aBool4728, class363,
					((Class363) class363).aClass296_4767,
					((Class363) class363).anIntArray4738,
					((Class363) class363).anIntArray4751,
					((Class363) class363).anIntArray4743,
					((Class363) class363).anIntArray4753, i_1_);
		else if (aClass158ArrayArray5292 != null)
			method2331(i, i_0_, ((Class363) class363).aClass296_4767,
					((Class363) class363).anIntArray4738,
					((Class363) class363).anIntArray4751,
					((Class363) class363).anIntArray4743,
					((Class363) class363).anIntArray4753, i_1_);
		else if (aClass136ArrayArray5274 != null)
			method2337(i, i_0_, ((Class363) class363).aBool4728, class363,
					((Class363) class363).aClass296_4767,
					((Class363) class363).anIntArray4738,
					((Class363) class363).anIntArray4751,
					((Class363) class363).anIntArray4743,
					((Class363) class363).anIntArray4753, i_1_);
	}

	private final void method2331(int i, int i_2_, Class296 class296, int[] is,
			int[] is_3_, int[] is_4_, int[] is_5_, int i_6_) {
		Class158 class158 = aClass158ArrayArray5292[i][i_2_];
		if (class158 != null) {
			if ((((Class158) class158).aByte2066 & 0x2) == 0) {
				if (i_6_ != 0) {
					if ((((Class158) class158).aByte2066 & 0x4) != 0) {
						if ((i_6_ & 0x1) != 0)
							return;
					} else if ((i_6_ & 0x2) != 0)
						return;
				}
				int i_7_ = i * ((Class12) this).anInt93;
				int i_8_ = i_7_ + ((Class12) this).anInt93;
				int i_9_ = i_2_ * ((Class12) this).anInt93;
				int i_10_ = i_9_ + ((Class12) this).anInt93;
				float f;
				float f_11_;
				float f_12_;
				float f_13_;
				int i_14_;
				int i_15_;
				int i_16_;
				int i_17_;
				int i_18_;
				int i_19_;
				int i_20_;
				int i_21_;
				if ((((Class158) class158).aByte2066 & 0x1) != 0) {
					int i_22_ = ((Class12) this).anIntArrayArray100[i][i_2_];
					float f_23_ = aFloat5281 * (float) i_22_;
					if (anInt5280 == -1) {
						f = aFloat5284
								+ (aFloat5283 * (float) i_7_ + f_23_ + aFloat5278
										* (float) i_9_);
						if (f <= (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5200))
							return;
						f_11_ = aFloat5284
								+ (aFloat5283 * (float) i_8_ + f_23_ + aFloat5278
										* (float) i_9_);
						if (f_11_ <= (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5200))
							return;
						f_12_ = aFloat5284
								+ (aFloat5283 * (float) i_8_ + f_23_ + aFloat5278
										* (float) i_10_);
						if (f_12_ <= (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5200))
							return;
						f_13_ = aFloat5284
								+ (aFloat5283 * (float) i_7_ + f_23_ + aFloat5278
										* (float) i_10_);
						if (f_13_ <= (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5200))
							return;
					} else {
						f = aFloat5284
								+ (aFloat5283 * (float) i_7_ + f_23_ + aFloat5278
										* (float) i_9_);
						f_11_ = aFloat5284
								+ (aFloat5283 * (float) i_8_ + f_23_ + aFloat5278
										* (float) i_9_);
						f_12_ = aFloat5284
								+ (aFloat5283 * (float) i_8_ + f_23_ + aFloat5278
										* (float) i_10_);
						f_13_ = aFloat5284
								+ (aFloat5283 * (float) i_7_ + f_23_ + aFloat5278
										* (float) i_10_);
					}
					float f_24_ = aFloat5285 * (float) i_22_;
					float f_25_ = aFloat5288 * (float) i_22_;
					if (anInt5280 == -1) {
						float f_26_ = aFloat5291
								+ (aFloat5282 * (float) i_7_ + f_24_ + aFloat5275
										* (float) i_9_);
						i_14_ = (((Class296) class296).anInt3993 + (int) (f_26_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / f));
						float f_27_ = aFloat5289
								+ (aFloat5279 * (float) i_7_ + f_25_ + aFloat5286
										* (float) i_9_);
						i_15_ = (((Class296) class296).anInt4000 + (int) (f_27_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / f));
						float f_28_ = aFloat5291
								+ (aFloat5282 * (float) i_8_ + f_24_ + aFloat5275
										* (float) i_9_);
						i_16_ = (((Class296) class296).anInt3993 + (int) (f_28_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / f_11_));
						float f_29_ = aFloat5289
								+ (aFloat5279 * (float) i_8_ + f_25_ + aFloat5286
										* (float) i_9_);
						i_17_ = (((Class296) class296).anInt4000 + (int) (f_29_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / f_11_));
						float f_30_ = aFloat5291
								+ (aFloat5282 * (float) i_8_ + f_24_ + aFloat5275
										* (float) i_10_);
						i_18_ = (((Class296) class296).anInt3993 + (int) (f_30_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / f_12_));
						float f_31_ = aFloat5289
								+ (aFloat5279 * (float) i_8_ + f_25_ + aFloat5286
										* (float) i_10_);
						i_19_ = (((Class296) class296).anInt4000 + (int) (f_31_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / f_12_));
						float f_32_ = aFloat5291
								+ (aFloat5282 * (float) i_7_ + f_24_ + aFloat5275
										* (float) i_10_);
						i_20_ = (((Class296) class296).anInt3993 + (int) (f_32_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / f_13_));
						float f_33_ = aFloat5289
								+ (aFloat5279 * (float) i_7_ + f_25_ + aFloat5286
										* (float) i_10_);
						i_21_ = (((Class296) class296).anInt4000 + (int) (f_33_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / f_13_));
					} else {
						float f_34_ = aFloat5291
								+ (aFloat5282 * (float) i_7_ + f_24_ + aFloat5275
										* (float) i_9_);
						i_14_ = (((Class296) class296).anInt3993 + (int) (f_34_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / (float) anInt5280));
						float f_35_ = aFloat5289
								+ (aFloat5279 * (float) i_7_ + f_25_ + aFloat5286
										* (float) i_9_);
						i_15_ = (((Class296) class296).anInt4000 + (int) (f_35_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / (float) anInt5280));
						float f_36_ = aFloat5291
								+ (aFloat5282 * (float) i_8_ + f_24_ + aFloat5275
										* (float) i_9_);
						i_16_ = (((Class296) class296).anInt3993 + (int) (f_36_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / (float) anInt5280));
						float f_37_ = aFloat5289
								+ (aFloat5279 * (float) i_8_ + f_25_ + aFloat5286
										* (float) i_9_);
						i_17_ = (((Class296) class296).anInt4000 + (int) (f_37_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / (float) anInt5280));
						float f_38_ = aFloat5291
								+ (aFloat5282 * (float) i_8_ + f_24_ + aFloat5275
										* (float) i_10_);
						i_18_ = (((Class296) class296).anInt3993 + (int) (f_38_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / (float) anInt5280));
						float f_39_ = aFloat5289
								+ (aFloat5279 * (float) i_8_ + f_25_ + aFloat5286
										* (float) i_10_);
						i_19_ = (((Class296) class296).anInt4000 + (int) (f_39_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / (float) anInt5280));
						float f_40_ = aFloat5291
								+ (aFloat5282 * (float) i_7_ + f_24_ + aFloat5275
										* (float) i_10_);
						i_20_ = (((Class296) class296).anInt3993 + (int) (f_40_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / (float) anInt5280));
						float f_41_ = aFloat5289
								+ (aFloat5279 * (float) i_7_ + f_25_ + aFloat5286
										* (float) i_10_);
						i_21_ = (((Class296) class296).anInt4000 + (int) (f_41_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / (float) anInt5280));
					}
				} else {
					int i_42_ = ((Class12) this).anIntArrayArray100[i][i_2_];
					int i_43_ = ((Class12) this).anIntArrayArray100[i + 1][i_2_];
					int i_44_ = ((Class12) this).anIntArrayArray100[i + 1][i_2_ + 1];
					int i_45_ = ((Class12) this).anIntArrayArray100[i][i_2_ + 1];
					if (anInt5280 == -1) {
						f = aFloat5284
								+ (aFloat5283 * (float) i_7_ + aFloat5281
										* (float) i_42_ + aFloat5278
										* (float) i_9_);
						if (f <= (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5200))
							return;
						f_11_ = aFloat5284
								+ (aFloat5283 * (float) i_8_ + aFloat5281
										* (float) i_43_ + aFloat5278
										* (float) i_9_);
						if (f_11_ <= (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5200))
							return;
						f_12_ = aFloat5284
								+ (aFloat5283 * (float) i_8_ + aFloat5281
										* (float) i_44_ + aFloat5278
										* (float) i_10_);
						if (f_12_ <= (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5200))
							return;
						f_13_ = aFloat5284
								+ (aFloat5283 * (float) i_7_ + aFloat5281
										* (float) i_45_ + aFloat5278
										* (float) i_10_);
						if (f_13_ <= (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5200))
							return;
						float f_46_ = aFloat5291
								+ (aFloat5282 * (float) i_7_ + aFloat5285
										* (float) i_42_ + aFloat5275
										* (float) i_9_);
						i_14_ = (((Class296) class296).anInt3993 + (int) (f_46_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / f));
						float f_47_ = aFloat5289
								+ (aFloat5279 * (float) i_7_ + aFloat5288
										* (float) i_42_ + aFloat5286
										* (float) i_9_);
						i_15_ = (((Class296) class296).anInt4000 + (int) (f_47_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / f));
						float f_48_ = aFloat5291
								+ (aFloat5282 * (float) i_8_ + aFloat5285
										* (float) i_43_ + aFloat5275
										* (float) i_9_);
						i_16_ = (((Class296) class296).anInt3993 + (int) (f_48_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / f_11_));
						float f_49_ = aFloat5289
								+ (aFloat5279 * (float) i_8_ + aFloat5288
										* (float) i_43_ + aFloat5286
										* (float) i_9_);
						i_17_ = (((Class296) class296).anInt4000 + (int) (f_49_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / f_11_));
						float f_50_ = aFloat5291
								+ (aFloat5282 * (float) i_8_ + aFloat5285
										* (float) i_44_ + aFloat5275
										* (float) i_10_);
						i_18_ = (((Class296) class296).anInt3993 + (int) (f_50_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / f_12_));
						float f_51_ = aFloat5289
								+ (aFloat5279 * (float) i_8_ + aFloat5288
										* (float) i_44_ + aFloat5286
										* (float) i_10_);
						i_19_ = (((Class296) class296).anInt4000 + (int) (f_51_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / f_12_));
						float f_52_ = aFloat5291
								+ (aFloat5282 * (float) i_7_ + aFloat5285
										* (float) i_45_ + aFloat5275
										* (float) i_10_);
						i_20_ = (((Class296) class296).anInt3993 + (int) (f_52_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / f_13_));
						float f_53_ = aFloat5289
								+ (aFloat5279 * (float) i_7_ + aFloat5288
										* (float) i_45_ + aFloat5286
										* (float) i_10_);
						i_21_ = (((Class296) class296).anInt4000 + (int) (f_53_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / f_13_));
					} else {
						f = aFloat5284
								+ (aFloat5283 * (float) i_7_ + aFloat5281
										* (float) i_42_ + aFloat5278
										* (float) i_9_);
						f_11_ = aFloat5284
								+ (aFloat5283 * (float) i_8_ + aFloat5281
										* (float) i_43_ + aFloat5278
										* (float) i_9_);
						f_12_ = aFloat5284
								+ (aFloat5283 * (float) i_8_ + aFloat5281
										* (float) i_44_ + aFloat5278
										* (float) i_10_);
						f_13_ = aFloat5284
								+ (aFloat5283 * (float) i_7_ + aFloat5281
										* (float) i_45_ + aFloat5278
										* (float) i_10_);
						float f_54_ = aFloat5291
								+ (aFloat5282 * (float) i_7_ + aFloat5285
										* (float) i_42_ + aFloat5275
										* (float) i_9_);
						i_14_ = (((Class296) class296).anInt3993 + (int) (f_54_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / (float) anInt5280));
						float f_55_ = aFloat5289
								+ (aFloat5279 * (float) i_7_ + aFloat5288
										* (float) i_42_ + aFloat5286
										* (float) i_9_);
						i_15_ = (((Class296) class296).anInt4000 + (int) (f_55_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / (float) anInt5280));
						float f_56_ = aFloat5291
								+ (aFloat5282 * (float) i_8_ + aFloat5285
										* (float) i_43_ + aFloat5275
										* (float) i_9_);
						i_16_ = (((Class296) class296).anInt3993 + (int) (f_56_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / (float) anInt5280));
						float f_57_ = aFloat5289
								+ (aFloat5279 * (float) i_8_ + aFloat5288
										* (float) i_43_ + aFloat5286
										* (float) i_9_);
						i_17_ = (((Class296) class296).anInt4000 + (int) (f_57_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / (float) anInt5280));
						float f_58_ = aFloat5291
								+ (aFloat5282 * (float) i_8_ + aFloat5285
										* (float) i_44_ + aFloat5275
										* (float) i_10_);
						i_18_ = (((Class296) class296).anInt3993 + (int) (f_58_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / (float) anInt5280));
						float f_59_ = aFloat5289
								+ (aFloat5279 * (float) i_8_ + aFloat5288
										* (float) i_44_ + aFloat5286
										* (float) i_10_);
						i_19_ = (((Class296) class296).anInt4000 + (int) (f_59_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / (float) anInt5280));
						float f_60_ = aFloat5291
								+ (aFloat5282 * (float) i_7_ + aFloat5285
										* (float) i_45_ + aFloat5275
										* (float) i_10_);
						i_20_ = (((Class296) class296).anInt3993 + (int) (f_60_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / (float) anInt5280));
						float f_61_ = aFloat5289
								+ (aFloat5279 * (float) i_7_ + aFloat5288
										* (float) i_45_ + aFloat5286
										* (float) i_10_);
						i_21_ = (((Class296) class296).anInt4000 + (int) (f_61_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / (float) anInt5280));
					}
				}
				if (anInt5280 == -1) {
					if (((i_18_ - i_20_) * (i_17_ - i_21_) - (i_19_ - i_21_)
							* (i_16_ - i_20_)) > 0) {
						((Class296) class296).aBool4001 = (i_18_ < 0
								|| i_20_ < 0 || i_16_ < 0
								|| i_18_ > ((Class296) class296).anInt3995
								|| i_20_ > ((Class296) class296).anInt3995 || i_16_ > ((Class296) class296).anInt3995);
						if (((Class158) class158).aShort2067 >= 0)
							class296.method1845(
									(float) i_19_,
									(float) i_21_,
									(float) i_17_,
									(float) i_18_,
									(float) i_20_,
									(float) i_16_,
									f_12_,
									f_13_,
									f_11_,
									1.0F,
									0.0F,
									1.0F,
									1.0F,
									1.0F,
									0.0F,
									(~0xffffff | (Class219_Sub1.anIntArray7248[(((Class158) class158).aShort2070 & 0xffff)]) & 0xffffff),
									(~0xffffff | (Class219_Sub1.anIntArray7248[(((Class158) class158).aShort2065 & 0xffff)]) & 0xffffff),
									(~0xffffff | (Class219_Sub1.anIntArray7248[(((Class158) class158).aShort2069 & 0xffff)]) & 0xffffff),
									0, 0, 0, 0,
									((Class158) class158).aShort2067);
						else
							class296.method1841(
									(float) i_19_,
									(float) i_21_,
									(float) i_17_,
									(float) i_18_,
									(float) i_20_,
									(float) i_16_,
									(float) (int) f_12_,
									(float) (int) f_13_,
									(float) (int) f_11_,
									(float) (((Class158) class158).aShort2070 & 0xffff),
									(float) (((Class158) class158).aShort2065 & 0xffff),
									(float) (((Class158) class158).aShort2069 & 0xffff));
					}
					if (((i_14_ - i_16_) * (i_21_ - i_17_) - (i_15_ - i_17_)
							* (i_20_ - i_16_)) > 0) {
						((Class296) class296).aBool4001 = (i_14_ < 0
								|| i_16_ < 0 || i_20_ < 0
								|| i_14_ > ((Class296) class296).anInt3995
								|| i_16_ > ((Class296) class296).anInt3995 || i_20_ > ((Class296) class296).anInt3995);
						if (((Class158) class158).aShort2067 >= 0)
							class296.method1845(
									(float) i_15_,
									(float) i_17_,
									(float) i_21_,
									(float) i_14_,
									(float) i_16_,
									(float) i_20_,
									f,
									f_11_,
									f_13_,
									0.0F,
									1.0F,
									1.0F,
									0.0F,
									0.0F,
									1.0F,
									(~0xffffff | (Class219_Sub1.anIntArray7248[(((Class158) class158).aShort2071 & 0xffff)]) & 0xffffff),
									(~0xffffff | (Class219_Sub1.anIntArray7248[(((Class158) class158).aShort2069 & 0xffff)]) & 0xffffff),
									(~0xffffff | (Class219_Sub1.anIntArray7248[(((Class158) class158).aShort2065 & 0xffff)]) & 0xffffff),
									0, 0, 0, 0,
									((Class158) class158).aShort2067);
						else
							class296.method1841(
									(float) i_15_,
									(float) i_17_,
									(float) i_21_,
									(float) i_14_,
									(float) i_16_,
									(float) i_20_,
									(float) (int) f,
									(float) (int) f_11_,
									(float) (int) f_13_,
									(float) (((Class158) class158).aShort2071 & 0xffff),
									(float) (((Class158) class158).aShort2069 & 0xffff),
									(float) (((Class158) class158).aShort2065 & 0xffff));
					}
				} else {
					if (((i_18_ - i_20_) * (i_17_ - i_21_) - (i_19_ - i_21_)
							* (i_16_ - i_20_)) > 0) {
						((Class296) class296).aBool4001 = (i_18_ < 0
								|| i_20_ < 0 || i_16_ < 0
								|| i_18_ > ((Class296) class296).anInt3995
								|| i_20_ > ((Class296) class296).anInt3995 || i_16_ > ((Class296) class296).anInt3995);
						if (((Class158) class158).aShort2067 >= 0)
							class296.method1845(
									(float) i_19_,
									(float) i_21_,
									(float) i_17_,
									(float) i_18_,
									(float) i_20_,
									(float) i_16_,
									f_12_,
									f_13_,
									f_11_,
									1.0F,
									0.0F,
									1.0F,
									1.0F,
									1.0F,
									0.0F,
									(~0xffffff | (Class219_Sub1.anIntArray7248[(((Class158) class158).aShort2070 & 0xffff)]) & 0xffffff),
									(~0xffffff | (Class219_Sub1.anIntArray7248[(((Class158) class158).aShort2065 & 0xffff)]) & 0xffffff),
									(~0xffffff | (Class219_Sub1.anIntArray7248[(((Class158) class158).aShort2069 & 0xffff)]) & 0xffffff),
									0, 0, 0, 0,
									((Class158) class158).aShort2067);
						else
							class296.method1841(
									(float) i_19_,
									(float) i_21_,
									(float) i_17_,
									(float) i_18_,
									(float) i_20_,
									(float) i_16_,
									(float) (int) f_12_,
									(float) (int) f_13_,
									(float) (int) f_11_,
									(float) (((Class158) class158).aShort2070 & 0xffff),
									(float) (((Class158) class158).aShort2065 & 0xffff),
									(float) (((Class158) class158).aShort2069 & 0xffff));
					}
					if (((i_14_ - i_16_) * (i_21_ - i_17_) - (i_15_ - i_17_)
							* (i_20_ - i_16_)) > 0) {
						((Class296) class296).aBool4001 = (i_14_ < 0
								|| i_16_ < 0 || i_20_ < 0
								|| i_14_ > ((Class296) class296).anInt3995
								|| i_16_ > ((Class296) class296).anInt3995 || i_20_ > ((Class296) class296).anInt3995);
						if (((Class158) class158).aShort2067 >= 0)
							class296.method1845(
									(float) i_15_,
									(float) i_17_,
									(float) i_21_,
									(float) i_14_,
									(float) i_16_,
									(float) i_20_,
									f,
									f_11_,
									f_13_,
									0.0F,
									1.0F,
									1.0F,
									0.0F,
									0.0F,
									1.0F,
									(~0xffffff | (Class219_Sub1.anIntArray7248[(((Class158) class158).aShort2071 & 0xffff)]) & 0xffffff),
									(~0xffffff | (Class219_Sub1.anIntArray7248[(((Class158) class158).aShort2069 & 0xffff)]) & 0xffffff),
									(~0xffffff | (Class219_Sub1.anIntArray7248[(((Class158) class158).aShort2065 & 0xffff)]) & 0xffffff),
									0, 0, 0, 0,
									((Class158) class158).aShort2067);
						else
							class296.method1841(
									(float) i_15_,
									(float) i_17_,
									(float) i_21_,
									(float) i_14_,
									(float) i_16_,
									(float) i_20_,
									(float) (int) f,
									(float) (int) f_11_,
									(float) (int) f_13_,
									(float) (((Class158) class158).aShort2071 & 0xffff),
									(float) (((Class158) class158).aShort2069 & 0xffff),
									(float) (((Class158) class158).aShort2065 & 0xffff));
					}
				}
			}
		} else {
			Class252 class252 = aClass252ArrayArray5277[i][i_2_];
			if (class252 != null) {
				if (i_6_ != 0) {
					if ((((Class252) class252).aByte3478 & 0x4) != 0) {
						if ((i_6_ & 0x1) != 0)
							return;
					} else if ((i_6_ & 0x2) != 0)
						return;
				}
				if (anInt5280 == -1) {
					for (int i_62_ = 0; i_62_ < ((Class252) class252).aShort3469; i_62_++) {
						int i_63_ = (((Class252) class252).aShortArray3468[i_62_] + (i << ((Class12) this).anInt97));
						short i_64_ = ((Class252) class252).aShortArray3475[i_62_];
						int i_65_ = (((Class252) class252).aShortArray3466[i_62_] + (i_2_ << ((Class12) this).anInt97));
						float f = aFloat5284
								+ (aFloat5283 * (float) i_63_ + aFloat5281
										* (float) i_64_ + aFloat5278
										* (float) i_65_);
						if (f <= (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5200))
							return;
						float f_66_ = aFloat5291
								+ (aFloat5282 * (float) i_63_ + aFloat5285
										* (float) i_64_ + aFloat5275
										* (float) i_65_);
						float f_67_ = aFloat5289
								+ (aFloat5279 * (float) i_63_ + aFloat5288
										* (float) i_64_ + aFloat5286
										* (float) i_65_);
						is[i_62_] = (((Class296) class296).anInt3993 + (int) (f_66_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / f));
						is_3_[i_62_] = (((Class296) class296).anInt4000 + (int) (f_67_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / f));
						is_4_[i_62_] = (int) f;
					}
				} else {
					for (int i_68_ = 0; i_68_ < ((Class252) class252).aShort3469; i_68_++) {
						int i_69_ = (((Class252) class252).aShortArray3468[i_68_] + (i << ((Class12) this).anInt97));
						short i_70_ = ((Class252) class252).aShortArray3475[i_68_];
						int i_71_ = (((Class252) class252).aShortArray3466[i_68_] + (i_2_ << ((Class12) this).anInt97));
						float f = aFloat5284
								+ (aFloat5283 * (float) i_69_ + aFloat5281
										* (float) i_70_ + aFloat5278
										* (float) i_71_);
						float f_72_ = aFloat5291
								+ (aFloat5282 * (float) i_69_ + aFloat5285
										* (float) i_70_ + aFloat5275
										* (float) i_71_);
						float f_73_ = aFloat5289
								+ (aFloat5279 * (float) i_69_ + aFloat5288
										* (float) i_70_ + aFloat5286
										* (float) i_71_);
						is[i_68_] = (((Class296) class296).anInt3993 + (int) (f_72_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / (float) anInt5280));
						is_3_[i_68_] = (((Class296) class296).anInt4000 + (int) (f_73_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / (float) anInt5280));
						is_4_[i_68_] = (int) f;
					}
				}
				if (((Class252) class252).aShortArray3473 != null) {
					if (anInt5280 == -1) {
						for (int i_74_ = 0; i_74_ < ((Class252) class252).aShort3470; i_74_++) {
							short i_75_ = ((Class252) class252).aShortArray3479[i_74_];
							short i_76_ = ((Class252) class252).aShortArray3477[i_74_];
							short i_77_ = ((Class252) class252).aShortArray3476[i_74_];
							int i_78_ = is[i_75_];
							int i_79_ = is[i_76_];
							int i_80_ = is[i_77_];
							int i_81_ = is_3_[i_75_];
							int i_82_ = is_3_[i_76_];
							int i_83_ = is_3_[i_77_];
							if (((i_78_ - i_79_) * (i_83_ - i_82_) - (i_81_ - i_82_)
									* (i_80_ - i_79_)) > 0) {
								((Class296) class296).aBool4001 = (i_78_ < 0
										|| i_79_ < 0
										|| i_80_ < 0
										|| (i_78_ > ((Class296) class296).anInt3995)
										|| (i_79_ > ((Class296) class296).anInt3995) || (i_80_ > ((Class296) class296).anInt3995));
								short i_84_ = (((Class252) class252).aShortArray3473[i_74_]);
								if (i_84_ != -1)
									class296.method1845(
											(float) i_81_,
											(float) i_82_,
											(float) i_83_,
											(float) i_78_,
											(float) i_79_,
											(float) i_80_,
											(float) is_4_[i_75_],
											(float) is_4_[i_76_],
											(float) is_4_[i_77_],
											((float) (((Class252) class252).aShortArray3468[i_75_]) / (float) ((Class12) this).anInt93),
											((float) (((Class252) class252).aShortArray3468[i_76_]) / (float) ((Class12) this).anInt93),
											((float) (((Class252) class252).aShortArray3468[i_77_]) / (float) ((Class12) this).anInt93),
											((float) (((Class252) class252).aShortArray3466[i_75_]) / (float) ((Class12) this).anInt93),
											((float) (((Class252) class252).aShortArray3466[i_76_]) / (float) ((Class12) this).anInt93),
											((float) (((Class252) class252).aShortArray3466[i_77_]) / (float) ((Class12) this).anInt93),
											(~0xffffff | (Class219_Sub1.anIntArray7248[((((Class252) class252).aShortArray3472[i_75_]) & 0xffff)]) & 0xffffff),
											(~0xffffff | (Class219_Sub1.anIntArray7248[((((Class252) class252).aShortArray3472[i_76_]) & 0xffff)]) & 0xffffff),
											(~0xffffff | (Class219_Sub1.anIntArray7248[((((Class252) class252).aShortArray3472[i_77_]) & 0xffff)]) & 0xffffff),
											0, 0, 0, 0, i_84_);
								else {
									int i_85_ = (((Class252) class252).anIntArray3474[i_74_]);
									if (i_85_ != -1)
										class296.method1841(
												(float) i_81_,
												(float) i_82_,
												(float) i_83_,
												(float) i_78_,
												(float) i_79_,
												(float) i_80_,
												(float) is_4_[i_75_],
												(float) is_4_[i_76_],
												(float) is_4_[i_77_],
												(float) (Class2_Sub9
														.method2949(
																(((Class252) class252).aShortArray3472[i_75_]),
																i_85_,
																(byte) -127)),
												(float) (Class2_Sub9
														.method2949(
																(((Class252) class252).aShortArray3472[i_76_]),
																i_85_,
																(byte) -115)),
												(float) (Class2_Sub9
														.method2949(
																(((Class252) class252).aShortArray3472[i_77_]),
																i_85_,
																(byte) -101)));
								}
							}
						}
					} else {
						for (int i_86_ = 0; i_86_ < ((Class252) class252).aShort3470; i_86_++) {
							short i_87_ = ((Class252) class252).aShortArray3479[i_86_];
							short i_88_ = ((Class252) class252).aShortArray3477[i_86_];
							short i_89_ = ((Class252) class252).aShortArray3476[i_86_];
							int i_90_ = is[i_87_];
							int i_91_ = is[i_88_];
							int i_92_ = is[i_89_];
							int i_93_ = is_3_[i_87_];
							int i_94_ = is_3_[i_88_];
							int i_95_ = is_3_[i_89_];
							if (((i_90_ - i_91_) * (i_95_ - i_94_) - (i_93_ - i_94_)
									* (i_92_ - i_91_)) > 0) {
								((Class296) class296).aBool4001 = (i_90_ < 0
										|| i_91_ < 0
										|| i_92_ < 0
										|| (i_90_ > ((Class296) class296).anInt3995)
										|| (i_91_ > ((Class296) class296).anInt3995) || (i_92_ > ((Class296) class296).anInt3995));
								short i_96_ = (((Class252) class252).aShortArray3473[i_86_]);
								if (i_96_ != -1)
									class296.method1845(
											(float) i_93_,
											(float) i_94_,
											(float) i_95_,
											(float) i_90_,
											(float) i_91_,
											(float) i_92_,
											(float) is_4_[i_87_],
											(float) is_4_[i_88_],
											(float) is_4_[i_89_],
											((float) (((Class252) class252).aShortArray3468[i_87_]) / (float) ((Class12) this).anInt93),
											((float) (((Class252) class252).aShortArray3468[i_88_]) / (float) ((Class12) this).anInt93),
											((float) (((Class252) class252).aShortArray3468[i_89_]) / (float) ((Class12) this).anInt93),
											((float) (((Class252) class252).aShortArray3466[i_87_]) / (float) ((Class12) this).anInt93),
											((float) (((Class252) class252).aShortArray3466[i_88_]) / (float) ((Class12) this).anInt93),
											((float) (((Class252) class252).aShortArray3466[i_89_]) / (float) ((Class12) this).anInt93),
											(~0xffffff | (Class219_Sub1.anIntArray7248[((((Class252) class252).aShortArray3472[i_87_]) & 0xffff)]) & 0xffffff),
											(~0xffffff | (Class219_Sub1.anIntArray7248[((((Class252) class252).aShortArray3472[i_88_]) & 0xffff)]) & 0xffffff),
											(~0xffffff | (Class219_Sub1.anIntArray7248[((((Class252) class252).aShortArray3472[i_89_]) & 0xffff)]) & 0xffffff),
											0, 0, 0, 0, i_96_);
								else {
									int i_97_ = (((Class252) class252).anIntArray3474[i_86_]);
									if (i_97_ != -1)
										class296.method1841(
												(float) i_93_,
												(float) i_94_,
												(float) i_95_,
												(float) i_90_,
												(float) i_91_,
												(float) i_92_,
												(float) is_4_[i_87_],
												(float) is_4_[i_88_],
												(float) is_4_[i_89_],
												(float) (Class2_Sub9
														.method2949(
																(((Class252) class252).aShortArray3472[i_87_]),
																i_97_,
																(byte) -100)),
												(float) (Class2_Sub9
														.method2949(
																(((Class252) class252).aShortArray3472[i_88_]),
																i_97_,
																(byte) -84)),
												(float) (Class2_Sub9
														.method2949(
																(((Class252) class252).aShortArray3472[i_89_]),
																i_97_,
																(byte) -86)));
								}
							}
						}
					}
				} else {
					for (int i_98_ = 0; i_98_ < ((Class252) class252).aShort3470; i_98_++) {
						short i_99_ = ((Class252) class252).aShortArray3479[i_98_];
						short i_100_ = ((Class252) class252).aShortArray3477[i_98_];
						short i_101_ = ((Class252) class252).aShortArray3476[i_98_];
						int i_102_ = is[i_99_];
						int i_103_ = is[i_100_];
						int i_104_ = is[i_101_];
						int i_105_ = is_3_[i_99_];
						int i_106_ = is_3_[i_100_];
						int i_107_ = is_3_[i_101_];
						if (((i_102_ - i_103_) * (i_107_ - i_106_) - (i_105_ - i_106_)
								* (i_104_ - i_103_)) > 0) {
							int i_108_ = ((Class252) class252).anIntArray3474[i_98_];
							if (i_108_ != -1) {
								((Class296) class296).aBool4001 = (i_102_ < 0
										|| i_103_ < 0
										|| i_104_ < 0
										|| (i_102_ > ((Class296) class296).anInt3995)
										|| (i_103_ > ((Class296) class296).anInt3995) || (i_104_ > ((Class296) class296).anInt3995));
								class296.method1841(
										(float) i_105_,
										(float) i_106_,
										(float) i_107_,
										(float) i_102_,
										(float) i_103_,
										(float) i_104_,
										(float) is_4_[i_99_],
										(float) is_4_[i_100_],
										(float) is_4_[i_101_],
										(float) (Class2_Sub9
												.method2949(
														(((Class252) class252).aShortArray3472[i_99_]),
														i_108_, (byte) -89)),
										(float) (Class2_Sub9
												.method2949(
														(((Class252) class252).aShortArray3472[i_100_]),
														i_108_, (byte) -96)),
										(float) (Class2_Sub9
												.method2949(
														(((Class252) class252).aShortArray3472[i_101_]),
														i_108_, (byte) -71)));
							}
						}
					}
				}
			}
		}
	}

	final void method133(int i, int i_109_, int i_110_, int i_111_, int i_112_,
			int i_113_, int i_114_, boolean[][] bools) {
		Class363 class363 = aClass163_Sub1_5294.method2306(Thread
				.currentThread());
		Class296 class296 = ((Class363) class363).aClass296_4767;
		((Class296) class296).anInt3997 = 0;
		((Class296) class296).aBool4001 = true;
		aClass163_Sub1_5294.ya();
		if (aClass99ArrayArray5287 != null || aClass136ArrayArray5274 != null)
			method2333(i, i_109_, i_110_, i_111_, i_112_, i_113_, i_114_,
					bools, class363, class296,
					((Class363) class363).anIntArray4738,
					((Class363) class363).anIntArray4751);
		else if (aClass158ArrayArray5292 != null)
			method2335(i, i_109_, i_110_, i_111_, i_112_, i_113_, i_114_,
					bools, class363, class296,
					((Class363) class363).anIntArray4738,
					((Class363) class363).anIntArray4751);
	}

	final void method127(int i, int i_115_) {
		method2330(i, i_115_, 0);
	}

	Class12_Sub2(Class163_Sub1 class163_sub1, int i, int i_116_, int i_117_,
			int i_118_, int[][] is, int[][] is_119_, int i_120_) {
		super(i_117_, i_118_, i_120_, is);
		aClass163_Sub1_5294 = class163_sub1;
		anInt5293 = i_116_;
		aByteArrayArray5273 = new byte[i_117_ + 1][i_118_ + 1];
		int i_121_ = ((Class163_Sub1) aClass163_Sub1_5294).anInt5185 >> 9;
		for (int i_122_ = 1; i_122_ < i_118_; i_122_++) {
			for (int i_123_ = 1; i_123_ < i_117_; i_123_++) {
				int i_124_ = i_121_;
				int i_125_ = (is_119_[i_123_ + 1][i_122_] - is_119_[i_123_ - 1][i_122_]);
				int i_126_ = (is_119_[i_123_][i_122_ + 1] - is_119_[i_123_][i_122_ - 1]);
				int i_127_ = (int) Math.sqrt((double) (i_125_ * i_125_ + 512
						* i_120_ + i_126_ * i_126_));
				int i_128_ = (i_125_ << 8) / i_127_;
				int i_129_ = -512 * i_120_ / i_127_;
				int i_130_ = (i_126_ << 8) / i_127_;
				i_124_ += ((((Class163_Sub1) aClass163_Sub1_5294).anInt5210 * i_128_)
						+ (((Class163_Sub1) aClass163_Sub1_5294).anInt5189 * i_129_) + (((Class163_Sub1) aClass163_Sub1_5294).anInt5180 * i_130_)) >> 17;
				i_124_ >>= 1;
				if (i_124_ < 2)
					i_124_ = 2;
				else if (i_124_ > 126)
					i_124_ = 126;
				aByteArrayArray5273[i_123_][i_122_] = (byte) i_124_;
			}
		}
		aByteArrayArray5290 = new byte[i_117_ + 1][i_118_ + 1];
	}

	final void method137(int i, int i_131_, int[] is, int[] is_132_,
			int[] is_133_, int[] is_134_, int[] is_135_, int[] is_136_,
			int[] is_137_, int[] is_138_, int[] is_139_, int[] is_140_,
			int[] is_141_, int i_142_, int i_143_, int i_144_, boolean bool) {
		if (aClass158ArrayArray5292 == null) {
			aClass158ArrayArray5292 = (new Class158[((Class12) this).anInt103][((Class12) this).anInt98]);
			aClass252ArrayArray5277 = (new Class252[((Class12) this).anInt103][((Class12) this).anInt98]);
		} else if (aClass99ArrayArray5287 != null
				|| aClass136ArrayArray5274 != null)
			throw new IllegalStateException();
		boolean bool_145_ = false;
		if (is_138_.length == 2
				&& is_135_.length == 2
				&& (is_138_[0] == is_138_[1] || is_140_[0] != -1
						&& is_140_[0] == is_140_[1])) {
			bool_145_ = true;
			for (int i_146_ = 1; i_146_ < 2; i_146_++) {
				int i_147_ = is[is_135_[i_146_]];
				int i_148_ = is_133_[is_135_[i_146_]];
				if (i_147_ != 0 && i_147_ != ((Class12) this).anInt93
						|| i_148_ != 0 && i_148_ != ((Class12) this).anInt93) {
					bool_145_ = false;
					break;
				}
			}
		}
		if (!bool_145_) {
			Class252 class252 = new Class252();
			short i_149_ = (short) is.length;
			int i_150_ = (short) is_138_.length;
			((Class252) class252).aShort3469 = i_149_;
			((Class252) class252).aShortArray3472 = new short[i_149_];
			((Class252) class252).aShortArray3468 = new short[i_149_];
			((Class252) class252).aShortArray3475 = new short[i_149_];
			((Class252) class252).aShortArray3466 = new short[i_149_];
			for (int i_151_ = 0; i_151_ < i_149_; i_151_++) {
				int i_152_ = is[i_151_];
				int i_153_ = is_133_[i_151_];
				if (i_152_ == 0 && i_153_ == 0)
					((Class252) class252).aShortArray3472[i_151_] = (short) (aByteArrayArray5273[i][i_131_] - aByteArrayArray5290[i][i_131_]);
				else if (i_152_ == 0 && i_153_ == ((Class12) this).anInt93)
					((Class252) class252).aShortArray3472[i_151_] = (short) (aByteArrayArray5273[i][i_131_ + 1] - aByteArrayArray5290[i][i_131_ + 1]);
				else if (i_152_ == ((Class12) this).anInt93
						&& i_153_ == ((Class12) this).anInt93)
					((Class252) class252).aShortArray3472[i_151_] = (short) (aByteArrayArray5273[i + 1][i_131_ + 1] - aByteArrayArray5290[i + 1][i_131_ + 1]);
				else if (i_152_ == ((Class12) this).anInt93 && i_153_ == 0)
					((Class252) class252).aShortArray3472[i_151_] = (short) (aByteArrayArray5273[i + 1][i_131_] - aByteArrayArray5290[i + 1][i_131_]);
				else {
					int i_154_ = (((aByteArrayArray5273[i][i_131_] - aByteArrayArray5290[i][i_131_]) * (((Class12) this).anInt93 - i_152_)) + (aByteArrayArray5273[i + 1][i_131_] - aByteArrayArray5290[i + 1][i_131_])
							* i_152_);
					int i_155_ = (((aByteArrayArray5273[i][i_131_ + 1] - aByteArrayArray5290[i][i_131_ + 1]) * (((Class12) this).anInt93 - i_152_)) + ((aByteArrayArray5273[i + 1][i_131_ + 1] - aByteArrayArray5290[i + 1][i_131_ + 1]) * i_152_));
					((Class252) class252).aShortArray3472[i_151_] = (short) (i_154_
							* (((Class12) this).anInt93 - i_153_)
							+ i_155_
							* i_153_ >> 2 * ((Class12) this).anInt97);
				}
				int i_156_ = (i << ((Class12) this).anInt97) + i_152_;
				int i_157_ = (i_131_ << ((Class12) this).anInt97) + i_153_;
				((Class252) class252).aShortArray3468[i_151_] = (short) i_152_;
				((Class252) class252).aShortArray3466[i_151_] = (short) i_153_;
				((Class252) class252).aShortArray3475[i_151_] = (short) (this
						.method130(i_157_, i_156_, 23) + (is_132_ != null ? is_132_[i_151_]
						: 0));
				if (((Class252) class252).aShortArray3472[i_151_] < 2)
					((Class252) class252).aShortArray3472[i_151_] = (short) 2;
			}
			boolean bool_158_ = false;
			int i_159_ = 0;
			for (int i_160_ = 0; i_160_ < i_150_; i_160_++) {
				if (is_138_[i_160_] >= 0 || is_139_ != null
						&& is_139_[i_160_] >= 0)
					i_159_++;
				int i_161_ = is_140_[i_160_];
				if (i_161_ != -1) {
					Class188 class188 = ((Class163) aClass163_Sub1_5294).anInterface1_2118
							.method7((byte) 127, i_161_);
					if (!((Class188) class188).aBool2416) {
						bool_158_ = true;
						if (method2336(((Class188) class188).aByte2426)
								|| ((Class188) class188).aByte2429 != 0
								|| ((Class188) class188).aByte2415 != 0)
							((Class252) class252).aByte3478 |= 0x4;
					}
				}
			}
			((Class252) class252).anIntArray3474 = new int[i_159_];
			if (is_139_ != null)
				((Class252) class252).anIntArray3471 = new int[i_159_];
			((Class252) class252).aShortArray3479 = new short[i_159_];
			((Class252) class252).aShortArray3477 = new short[i_159_];
			((Class252) class252).aShortArray3476 = new short[i_159_];
			if (bool_158_) {
				((Class252) class252).aShortArray3473 = new short[i_159_];
				((Class252) class252).aShortArray3467 = new short[i_159_];
			}
			for (int i_162_ = 0; i_162_ < i_150_; i_162_++) {
				if (is_138_[i_162_] >= 0 || is_139_ != null
						&& is_139_[i_162_] >= 0) {
					if (is_138_[i_162_] >= 0)
						((Class252) class252).anIntArray3474[((Class252) class252).aShort3470] = Class147
								.method942(0, is_138_[i_162_]);
					else
						((Class252) class252).anIntArray3474[((Class252) class252).aShort3470] = -1;
					if (is_139_ != null) {
						if (is_139_[i_162_] != -1)
							((Class252) class252).anIntArray3471[((Class252) class252).aShort3470] = Class147
									.method942(0, is_139_[i_162_]);
						else
							((Class252) class252).anIntArray3471[((Class252) class252).aShort3470] = -1;
					}
					((Class252) class252).aShortArray3479[((Class252) class252).aShort3470] = (short) is_135_[i_162_];
					((Class252) class252).aShortArray3477[((Class252) class252).aShort3470] = (short) is_136_[i_162_];
					((Class252) class252).aShortArray3476[((Class252) class252).aShort3470] = (short) is_137_[i_162_];
					if (bool_158_) {
						if (is_140_[i_162_] != -1
								&& !(((Class188) ((Class163) aClass163_Sub1_5294).anInterface1_2118
										.method7((byte) 127, is_140_[i_162_])).aBool2416)) {
							((Class252) class252).aShortArray3473[((Class252) class252).aShort3470] = (short) is_140_[i_162_];
							((Class252) class252).aShortArray3467[((Class252) class252).aShort3470] = (short) is_141_[i_162_];
						} else
							((Class252) class252).aShortArray3473[((Class252) class252).aShort3470] = (short) -1;
					}
					((Class252) class252).aShort3470++;
				}
			}
			aClass252ArrayArray5277[i][i_131_] = class252;
		} else if (is_138_[0] >= 0 || is_139_ != null && is_139_[0] >= 0) {
			Class158 class158 = new Class158();
			int i_163_ = is_138_[0];
			int i_164_ = is_140_[0];
			if (is_139_ != null) {
				((Class158) class158).anInt2068 = Class2_Sub9
						.method2949(
								(aByteArrayArray5273[i][i_131_] - (aByteArrayArray5290[i][i_131_])),
								Class147.method942(0, is_139_[0]), (byte) -83);
				if (i_163_ == -1)
					((Class158) class158).aByte2066 |= 0x2;
			}
			if ((((Class12) this).anIntArrayArray100[i][i_131_] == ((Class12) this).anIntArrayArray100[i + 1][i_131_])
					&& (((Class12) this).anIntArrayArray100[i][i_131_] == ((Class12) this).anIntArrayArray100[i + 1][i_131_ + 1])
					&& (((Class12) this).anIntArrayArray100[i][i_131_] == ((Class12) this).anIntArrayArray100[i][i_131_ + 1]))
				((Class158) class158).aByte2066 |= 0x1;
			Class188 class188 = null;
			if (i_164_ != -1)
				class188 = ((Class163) aClass163_Sub1_5294).anInterface1_2118
						.method7((byte) 127, i_164_);
			if (class188 != null
					&& (((Class158) class158).aByte2066 & 0x2) == 0
					&& !((Class188) class188).aBool2416) {
				((Class158) class158).aShort2071 = (short) (aByteArrayArray5273[i][i_131_] - aByteArrayArray5290[i][i_131_]);
				((Class158) class158).aShort2069 = (short) (aByteArrayArray5273[i + 1][i_131_] - aByteArrayArray5290[i + 1][i_131_]);
				((Class158) class158).aShort2070 = (short) (aByteArrayArray5273[i + 1][i_131_ + 1] - aByteArrayArray5290[i + 1][i_131_ + 1]);
				((Class158) class158).aShort2065 = (short) (aByteArrayArray5273[i][i_131_ + 1] - aByteArrayArray5290[i][i_131_ + 1]);
				((Class158) class158).aShort2067 = (short) i_164_;
				if (method2336(((Class188) class188).aByte2426)
						|| ((Class188) class188).aByte2429 != 0
						|| ((Class188) class188).aByte2415 != 0)
					((Class158) class158).aByte2066 |= 0x4;
			} else {
				short i_165_ = Class147.method942(0, i_163_);
				((Class158) class158).aShort2071 = (short) Class2_Sub9
						.method2949(
								((aByteArrayArray5273[i][i_131_]) - (aByteArrayArray5290[i][i_131_])),
								i_165_, (byte) -91);
				((Class158) class158).aShort2069 = (short) Class2_Sub9
						.method2949(
								((aByteArrayArray5273[i + 1][i_131_]) - (aByteArrayArray5290[i + 1][i_131_])),
								i_165_, (byte) -128);
				((Class158) class158).aShort2070 = (short) Class2_Sub9
						.method2949(
								((aByteArrayArray5273[i + 1][i_131_ + 1]) - (aByteArrayArray5290[i + 1][i_131_ + 1])),
								i_165_, (byte) -73);
				((Class158) class158).aShort2065 = (short) Class2_Sub9
						.method2949(
								((aByteArrayArray5273[i][i_131_ + 1]) - (aByteArrayArray5290[i][i_131_ + 1])),
								i_165_, (byte) -123);
				((Class158) class158).aShort2067 = (short) -1;
			}
			aClass158ArrayArray5292[i][i_131_] = class158;
		}
	}

	private final void method2332(int i, int i_166_, boolean bool,
			Class363 class363, Class296 class296, int[] is, int[] is_167_,
			int[] is_168_, int[] is_169_, int i_170_) {
		Class99 class99 = aClass99ArrayArray5287[i][i_166_];
		if (class99 != null) {
			if ((((Class99) class99).aByte1315 & 0x2) == 0) {
				if (i_170_ != 0) {
					if ((((Class99) class99).aByte1315 & 0x4) != 0) {
						if ((i_170_ & 0x1) != 0)
							return;
					} else if ((i_170_ & 0x2) != 0)
						return;
				}
				int i_171_ = i * ((Class12) this).anInt93;
				int i_172_ = i_171_ + ((Class12) this).anInt93;
				int i_173_ = i_166_ * ((Class12) this).anInt93;
				int i_174_ = i_173_ + ((Class12) this).anInt93;
				int i_175_ = 0;
				int i_176_ = 0;
				int i_177_ = 0;
				int i_178_ = 0;
				float f;
				float f_179_;
				float f_180_;
				float f_181_;
				int i_182_;
				int i_183_;
				int i_184_;
				int i_185_;
				int i_186_;
				int i_187_;
				int i_188_;
				int i_189_;
				if ((((Class99) class99).aByte1315 & 0x1) != 0 && !bool) {
					int i_190_ = ((Class12) this).anIntArrayArray100[i][i_166_];
					float f_191_ = aFloat5281 * (float) i_190_;
					if (anInt5280 == -1) {
						f = aFloat5284
								+ (aFloat5283 * (float) i_171_ + f_191_ + aFloat5278
										* (float) i_173_);
						if (f <= (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5200))
							return;
						f_179_ = aFloat5284
								+ (aFloat5283 * (float) i_172_ + f_191_ + aFloat5278
										* (float) i_173_);
						if (f_179_ <= (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5200))
							return;
						f_180_ = aFloat5284
								+ (aFloat5283 * (float) i_172_ + f_191_ + aFloat5278
										* (float) i_174_);
						if (f_180_ <= (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5200))
							return;
						f_181_ = aFloat5284
								+ (aFloat5283 * (float) i_171_ + f_191_ + aFloat5278
										* (float) i_174_);
						if (f_181_ <= (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5200))
							return;
					} else {
						f = aFloat5284
								+ (aFloat5283 * (float) i_171_ + f_191_ + aFloat5278
										* (float) i_173_);
						f_179_ = aFloat5284
								+ (aFloat5283 * (float) i_172_ + f_191_ + aFloat5278
										* (float) i_173_);
						f_180_ = aFloat5284
								+ (aFloat5283 * (float) i_172_ + f_191_ + aFloat5278
										* (float) i_174_);
						f_181_ = aFloat5284
								+ (aFloat5283 * (float) i_171_ + f_191_ + aFloat5278
										* (float) i_174_);
					}
					if (((Class363) class363).aBool4723) {
						int i_192_ = (int) (f - (float) (((Class363) class363).anInt4724));
						if (i_192_ > 0) {
							i_175_ = i_192_;
							if (i_175_ > 255)
								i_175_ = 255;
						}
						i_192_ = (int) (f_179_ - (float) (((Class363) class363).anInt4724));
						if (i_192_ > 0) {
							i_176_ = i_192_;
							if (i_176_ > 255)
								i_176_ = 255;
						}
						i_192_ = (int) (f_180_ - (float) (((Class363) class363).anInt4724));
						if (i_192_ > 0) {
							i_177_ = i_192_;
							if (i_177_ > 255)
								i_177_ = 255;
						}
						i_192_ = (int) (f_181_ - (float) (((Class363) class363).anInt4724));
						if (i_192_ > 0) {
							i_178_ = i_192_;
							if (i_178_ > 255)
								i_178_ = 255;
						}
					}
					float f_193_ = aFloat5285 * (float) i_190_;
					float f_194_ = aFloat5288 * (float) i_190_;
					if (anInt5280 == -1) {
						float f_195_ = (aFloat5291 + (aFloat5282
								* (float) i_171_ + f_193_ + aFloat5275
								* (float) i_173_));
						i_182_ = (((Class296) class296).anInt3993 + (int) (f_195_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / f));
						float f_196_ = (aFloat5289 + (aFloat5279
								* (float) i_171_ + f_194_ + aFloat5286
								* (float) i_173_));
						i_183_ = (((Class296) class296).anInt4000 + (int) (f_196_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / f));
						float f_197_ = (aFloat5291 + (aFloat5282
								* (float) i_172_ + f_193_ + aFloat5275
								* (float) i_173_));
						i_184_ = (((Class296) class296).anInt3993 + (int) (f_197_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / f_179_));
						float f_198_ = (aFloat5289 + (aFloat5279
								* (float) i_172_ + f_194_ + aFloat5286
								* (float) i_173_));
						i_185_ = (((Class296) class296).anInt4000 + (int) (f_198_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / f_179_));
						float f_199_ = (aFloat5291 + (aFloat5282
								* (float) i_172_ + f_193_ + aFloat5275
								* (float) i_174_));
						i_186_ = (((Class296) class296).anInt3993 + (int) (f_199_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / f_180_));
						float f_200_ = (aFloat5289 + (aFloat5279
								* (float) i_172_ + f_194_ + aFloat5286
								* (float) i_174_));
						i_187_ = (((Class296) class296).anInt4000 + (int) (f_200_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / f_180_));
						float f_201_ = (aFloat5291 + (aFloat5282
								* (float) i_171_ + f_193_ + aFloat5275
								* (float) i_174_));
						i_188_ = (((Class296) class296).anInt3993 + (int) (f_201_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / f_181_));
						float f_202_ = (aFloat5289 + (aFloat5279
								* (float) i_171_ + f_194_ + aFloat5286
								* (float) i_174_));
						i_189_ = (((Class296) class296).anInt4000 + (int) (f_202_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / f_181_));
					} else {
						float f_203_ = (aFloat5291 + (aFloat5282
								* (float) i_171_ + f_193_ + aFloat5275
								* (float) i_173_));
						i_182_ = (((Class296) class296).anInt3993 + (int) (f_203_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / (float) anInt5280));
						float f_204_ = (aFloat5289 + (aFloat5279
								* (float) i_171_ + f_194_ + aFloat5286
								* (float) i_173_));
						i_183_ = (((Class296) class296).anInt4000 + (int) (f_204_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / (float) anInt5280));
						float f_205_ = (aFloat5291 + (aFloat5282
								* (float) i_172_ + f_193_ + aFloat5275
								* (float) i_173_));
						i_184_ = (((Class296) class296).anInt3993 + (int) (f_205_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / (float) anInt5280));
						float f_206_ = (aFloat5289 + (aFloat5279
								* (float) i_172_ + f_194_ + aFloat5286
								* (float) i_173_));
						i_185_ = (((Class296) class296).anInt4000 + (int) (f_206_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / (float) anInt5280));
						float f_207_ = (aFloat5291 + (aFloat5282
								* (float) i_172_ + f_193_ + aFloat5275
								* (float) i_174_));
						i_186_ = (((Class296) class296).anInt3993 + (int) (f_207_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / (float) anInt5280));
						float f_208_ = (aFloat5289 + (aFloat5279
								* (float) i_172_ + f_194_ + aFloat5286
								* (float) i_174_));
						i_187_ = (((Class296) class296).anInt4000 + (int) (f_208_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / (float) anInt5280));
						float f_209_ = (aFloat5291 + (aFloat5282
								* (float) i_171_ + f_193_ + aFloat5275
								* (float) i_174_));
						i_188_ = (((Class296) class296).anInt3993 + (int) (f_209_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / (float) anInt5280));
						float f_210_ = (aFloat5289 + (aFloat5279
								* (float) i_171_ + f_194_ + aFloat5286
								* (float) i_174_));
						i_189_ = (((Class296) class296).anInt4000 + (int) (f_210_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / (float) anInt5280));
					}
				} else {
					int i_211_ = ((Class12) this).anIntArrayArray100[i][i_166_];
					int i_212_ = ((Class12) this).anIntArrayArray100[i + 1][i_166_];
					int i_213_ = (((Class12) this).anIntArrayArray100[i + 1][i_166_ + 1]);
					int i_214_ = ((Class12) this).anIntArrayArray100[i][i_166_ + 1];
					if (anInt5280 == -1) {
						f = aFloat5284
								+ (aFloat5283 * (float) i_171_ + aFloat5281
										* (float) i_211_ + aFloat5278
										* (float) i_173_);
						if (f <= (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5200))
							return;
						f_179_ = aFloat5284
								+ (aFloat5283 * (float) i_172_ + aFloat5281
										* (float) i_212_ + aFloat5278
										* (float) i_173_);
						if (f_179_ <= (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5200))
							return;
						f_180_ = aFloat5284
								+ (aFloat5283 * (float) i_172_ + aFloat5281
										* (float) i_213_ + aFloat5278
										* (float) i_174_);
						if (f_180_ <= (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5200))
							return;
						f_181_ = aFloat5284
								+ (aFloat5283 * (float) i_171_ + aFloat5281
										* (float) i_214_ + aFloat5278
										* (float) i_174_);
						if (f_181_ <= (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5200))
							return;
					} else {
						f = aFloat5284
								+ (aFloat5283 * (float) i_171_ + aFloat5281
										* (float) i_211_ + aFloat5278
										* (float) i_173_);
						f_179_ = aFloat5284
								+ (aFloat5283 * (float) i_172_ + aFloat5281
										* (float) i_212_ + aFloat5278
										* (float) i_173_);
						f_180_ = aFloat5284
								+ (aFloat5283 * (float) i_172_ + aFloat5281
										* (float) i_213_ + aFloat5278
										* (float) i_174_);
						f_181_ = aFloat5284
								+ (aFloat5283 * (float) i_171_ + aFloat5281
										* (float) i_214_ + aFloat5278
										* (float) i_174_);
					}
					if (bool) {
						int i_215_ = (int) (f - (float) (((Class363) class363).anInt4724));
						if (i_215_ > 255)
							i_215_ = 255;
						if (i_215_ > 0) {
							i_175_ = i_215_;
							int i_216_ = (((Class99) class99).aShort1313
									* i_215_ / 255);
							if (i_216_ > 0)
								i_211_ -= i_216_;
						}
						i_215_ = (int) (f_179_ - (float) (((Class363) class363).anInt4724));
						if (i_215_ > 255)
							i_215_ = 255;
						if (i_215_ > 0) {
							i_176_ = i_215_;
							int i_217_ = (((Class99) class99).aShort1320
									* i_215_ / 255);
							if (i_217_ > 0)
								i_212_ -= i_217_;
						}
						i_215_ = (int) (f_180_ - (float) (((Class363) class363).anInt4724));
						if (i_215_ > 255)
							i_215_ = 255;
						if (i_215_ > 0) {
							i_177_ = i_215_;
							int i_218_ = (((Class99) class99).aShort1321
									* i_215_ / 255);
							if (i_218_ > 0)
								i_213_ -= i_218_;
						}
						i_215_ = (int) (f_181_ - (float) (((Class363) class363).anInt4724));
						if (i_215_ > 255)
							i_215_ = 255;
						if (i_215_ > 0) {
							i_178_ = i_215_;
							int i_219_ = (((Class99) class99).aShort1314
									* i_215_ / 255);
							if (i_219_ > 0)
								i_214_ -= i_219_;
						}
					} else if (((Class363) class363).aBool4723) {
						int i_220_ = (int) (f - (float) (((Class363) class363).anInt4724));
						if (i_220_ > 0) {
							i_175_ = i_220_;
							if (i_175_ > 255)
								i_175_ = 255;
						}
						i_220_ = (int) (f_179_ - (float) (((Class363) class363).anInt4724));
						if (i_220_ > 0) {
							i_176_ = i_220_;
							if (i_176_ > 255)
								i_176_ = 255;
						}
						i_220_ = (int) (f_180_ - (float) (((Class363) class363).anInt4724));
						if (i_220_ > 0) {
							i_177_ = i_220_;
							if (i_177_ > 255)
								i_177_ = 255;
						}
						i_220_ = (int) (f_181_ - (float) (((Class363) class363).anInt4724));
						if (i_220_ > 0) {
							i_178_ = i_220_;
							if (i_178_ > 255)
								i_178_ = 255;
						}
					}
					if (anInt5280 == -1) {
						float f_221_ = aFloat5291
								+ (aFloat5282 * (float) i_171_ + aFloat5285
										* (float) i_211_ + aFloat5275
										* (float) i_173_);
						i_182_ = (((Class296) class296).anInt3993 + (int) (f_221_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / f));
						float f_222_ = aFloat5289
								+ (aFloat5279 * (float) i_171_ + aFloat5288
										* (float) i_211_ + aFloat5286
										* (float) i_173_);
						i_183_ = (((Class296) class296).anInt4000 + (int) (f_222_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / f));
						float f_223_ = aFloat5291
								+ (aFloat5282 * (float) i_172_ + aFloat5285
										* (float) i_212_ + aFloat5275
										* (float) i_173_);
						i_184_ = (((Class296) class296).anInt3993 + (int) (f_223_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / f_179_));
						float f_224_ = aFloat5289
								+ (aFloat5279 * (float) i_172_ + aFloat5288
										* (float) i_212_ + aFloat5286
										* (float) i_173_);
						i_185_ = (((Class296) class296).anInt4000 + (int) (f_224_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / f_179_));
						float f_225_ = aFloat5291
								+ (aFloat5282 * (float) i_172_ + aFloat5285
										* (float) i_213_ + aFloat5275
										* (float) i_174_);
						i_186_ = (((Class296) class296).anInt3993 + (int) (f_225_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / f_180_));
						float f_226_ = aFloat5289
								+ (aFloat5279 * (float) i_172_ + aFloat5288
										* (float) i_213_ + aFloat5286
										* (float) i_174_);
						i_187_ = (((Class296) class296).anInt4000 + (int) (f_226_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / f_180_));
						float f_227_ = aFloat5291
								+ (aFloat5282 * (float) i_171_ + aFloat5285
										* (float) i_214_ + aFloat5275
										* (float) i_174_);
						i_188_ = (((Class296) class296).anInt3993 + (int) (f_227_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / f_181_));
						float f_228_ = aFloat5289
								+ (aFloat5279 * (float) i_171_ + aFloat5288
										* (float) i_214_ + aFloat5286
										* (float) i_174_);
						i_189_ = (((Class296) class296).anInt4000 + (int) (f_228_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / f_181_));
					} else {
						float f_229_ = aFloat5291
								+ (aFloat5282 * (float) i_171_ + aFloat5285
										* (float) i_211_ + aFloat5275
										* (float) i_173_);
						i_182_ = (((Class296) class296).anInt3993 + (int) (f_229_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / (float) anInt5280));
						float f_230_ = aFloat5289
								+ (aFloat5279 * (float) i_171_ + aFloat5288
										* (float) i_211_ + aFloat5286
										* (float) i_173_);
						i_183_ = (((Class296) class296).anInt4000 + (int) (f_230_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / (float) anInt5280));
						float f_231_ = aFloat5291
								+ (aFloat5282 * (float) i_172_ + aFloat5285
										* (float) i_212_ + aFloat5275
										* (float) i_173_);
						i_184_ = (((Class296) class296).anInt3993 + (int) (f_231_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / (float) anInt5280));
						float f_232_ = aFloat5289
								+ (aFloat5279 * (float) i_172_ + aFloat5288
										* (float) i_212_ + aFloat5286
										* (float) i_173_);
						i_185_ = (((Class296) class296).anInt4000 + (int) (f_232_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / (float) anInt5280));
						float f_233_ = aFloat5291
								+ (aFloat5282 * (float) i_172_ + aFloat5285
										* (float) i_213_ + aFloat5275
										* (float) i_174_);
						i_186_ = (((Class296) class296).anInt3993 + (int) (f_233_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / (float) anInt5280));
						float f_234_ = aFloat5289
								+ (aFloat5279 * (float) i_172_ + aFloat5288
										* (float) i_213_ + aFloat5286
										* (float) i_174_);
						i_187_ = (((Class296) class296).anInt4000 + (int) (f_234_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / (float) anInt5280));
						float f_235_ = aFloat5291
								+ (aFloat5282 * (float) i_171_ + aFloat5285
										* (float) i_214_ + aFloat5275
										* (float) i_174_);
						i_188_ = (((Class296) class296).anInt3993 + (int) (f_235_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / (float) anInt5280));
						float f_236_ = aFloat5289
								+ (aFloat5279 * (float) i_171_ + aFloat5288
										* (float) i_214_ + aFloat5286
										* (float) i_174_);
						i_189_ = (((Class296) class296).anInt4000 + (int) (f_236_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / (float) anInt5280));
					}
				}
				boolean bool_237_ = (((Class99) class99).aShort1316 != -1 && method2336(((Class188) (((Class163) aClass163_Sub1_5294).anInterface1_2118
						.method7((byte) 127, ((Class99) class99).aShort1316))).aByte2426));
				if (anInt5280 == -1) {
					int i_238_ = i_176_ + i_177_ + i_178_;
					if (((i_186_ - i_188_) * (i_185_ - i_189_) - (i_187_ - i_189_)
							* (i_184_ - i_188_)) > 0) {
						((Class296) class296).aBool4001 = (i_186_ < 0
								|| i_188_ < 0 || i_184_ < 0
								|| i_186_ > ((Class296) class296).anInt3995
								|| i_188_ > ((Class296) class296).anInt3995 || i_184_ > ((Class296) class296).anInt3995);
						if (i_238_ < 765) {
							if (i_238_ > 0) {
								if (((Class99) class99).aShort1316 >= 0) {
									int i_239_ = -16777216;
									if (bool_237_)
										i_239_ = -1694498816;
									class296.method1845(
											(float) i_187_,
											(float) i_189_,
											(float) i_185_,
											(float) i_186_,
											(float) i_188_,
											(float) i_184_,
											f_180_,
											f_181_,
											f_179_,
											1.0F,
											0.0F,
											1.0F,
											1.0F,
											1.0F,
											0.0F,
											i_239_
													| (((Class99) class99).anInt1312)
													& 0xffffff,
											i_239_
													| (((Class99) class99).anInt1317)
													& 0xffffff,
											i_239_
													| (((Class99) class99).anInt1318)
													& 0xffffff,
											((Class363) class363).anInt4726,
											i_177_, i_178_, i_176_,
											((Class99) class99).aShort1316);
								} else {
									if (bool_237_)
										((Class296) class296).anInt3997 = 100;
									class296.method1840(
											(float) i_187_,
											(float) i_189_,
											(float) i_185_,
											(float) i_186_,
											(float) i_188_,
											(float) i_184_,
											(float) (int) f_180_,
											(float) (int) f_181_,
											(float) (int) f_179_,
											(Class343
													.method2078(
															((Class99) class99).anInt1312,
															109,
															(i_177_ << 24 | (((Class363) class363).anInt4726)))),
											(Class343
													.method2078(
															((Class99) class99).anInt1317,
															100,
															(i_178_ << 24 | (((Class363) class363).anInt4726)))),
											(Class343
													.method2078(
															((Class99) class99).anInt1318,
															-91,
															(i_176_ << 24 | (((Class363) class363).anInt4726)))));
									((Class296) class296).anInt3997 = 0;
								}
							} else if (((Class99) class99).aShort1316 >= 0) {
								int i_240_ = -16777216;
								if (bool_237_)
									i_240_ = -1694498816;
								class296.method1845(
										(float) i_187_,
										(float) i_189_,
										(float) i_185_,
										(float) i_186_,
										(float) i_188_,
										(float) i_184_,
										f_180_,
										f_181_,
										f_179_,
										1.0F,
										0.0F,
										1.0F,
										1.0F,
										1.0F,
										0.0F,
										i_240_
												| (((Class99) class99).anInt1312 & 0xffffff),
										i_240_
												| (((Class99) class99).anInt1317 & 0xffffff),
										i_240_
												| (((Class99) class99).anInt1318 & 0xffffff),
										0, 0, 0, 0,
										((Class99) class99).aShort1316);
							} else {
								if (bool_237_)
									((Class296) class296).anInt3997 = 100;
								class296.method1840((float) i_187_,
										(float) i_189_, (float) i_185_,
										(float) i_186_, (float) i_188_,
										(float) i_184_, (float) (int) f_180_,
										(float) (int) f_181_,
										(float) (int) f_179_,
										((Class99) class99).anInt1312,
										((Class99) class99).anInt1317,
										((Class99) class99).anInt1318);
								((Class296) class296).anInt3997 = 0;
							}
						} else
							class296.method1834((float) i_187_, (float) i_189_,
									(float) i_185_, (float) i_186_,
									(float) i_188_, (float) i_184_,
									(float) (int) f_180_, (float) (int) f_181_,
									(float) (int) f_179_,
									(((Class363) class363).anInt4726));
					}
					i_238_ = i_175_ + i_176_ + i_178_;
					if (((i_182_ - i_184_) * (i_189_ - i_185_) - (i_183_ - i_185_)
							* (i_188_ - i_184_)) > 0) {
						((Class296) class296).aBool4001 = (i_182_ < 0
								|| i_184_ < 0 || i_188_ < 0
								|| i_182_ > ((Class296) class296).anInt3995
								|| i_184_ > ((Class296) class296).anInt3995 || i_188_ > ((Class296) class296).anInt3995);
						if (i_238_ < 765) {
							if (bool_237_)
								((Class296) class296).anInt3997 = -1694498816;
							if (i_238_ > 0) {
								if (((Class99) class99).aShort1316 >= 0) {
									int i_241_ = -16777216;
									if (bool_237_)
										i_241_ = -1694498816;
									class296.method1845(
											(float) i_183_,
											(float) i_185_,
											(float) i_189_,
											(float) i_182_,
											(float) i_184_,
											(float) i_188_,
											f,
											f_179_,
											f_181_,
											0.0F,
											1.0F,
											1.0F,
											0.0F,
											0.0F,
											1.0F,
											i_241_
													| (((Class99) class99).anInt1322)
													& 0xffffff,
											i_241_
													| (((Class99) class99).anInt1318)
													& 0xffffff,
											i_241_
													| (((Class99) class99).anInt1317)
													& 0xffffff,
											((Class363) class363).anInt4726,
											i_175_, i_176_, i_178_,
											((Class99) class99).aShort1316);
								} else {
									if (bool_237_)
										((Class296) class296).anInt3997 = 100;
									class296.method1840(
											(float) i_183_,
											(float) i_185_,
											(float) i_189_,
											(float) i_182_,
											(float) i_184_,
											(float) i_188_,
											(float) (int) f,
											(float) (int) f_179_,
											(float) (int) f_181_,
											(Class343
													.method2078(
															((Class99) class99).anInt1322,
															108,
															(i_175_ << 24 | (((Class363) class363).anInt4726)))),
											(Class343
													.method2078(
															((Class99) class99).anInt1318,
															93,
															(i_176_ << 24 | (((Class363) class363).anInt4726)))),
											(Class343
													.method2078(
															((Class99) class99).anInt1317,
															127,
															(i_178_ << 24 | (((Class363) class363).anInt4726)))));
									((Class296) class296).anInt3997 = 0;
								}
							} else if (((Class99) class99).aShort1316 >= 0) {
								int i_242_ = -16777216;
								if (bool_237_)
									i_242_ = -1694498816;
								class296.method1845(
										(float) i_183_,
										(float) i_185_,
										(float) i_189_,
										(float) i_182_,
										(float) i_184_,
										(float) i_188_,
										f,
										f_179_,
										f_181_,
										0.0F,
										1.0F,
										1.0F,
										0.0F,
										0.0F,
										1.0F,
										i_242_
												| (((Class99) class99).anInt1322 & 0xffffff),
										i_242_
												| (((Class99) class99).anInt1318 & 0xffffff),
										i_242_
												| (((Class99) class99).anInt1317 & 0xffffff),
										0, 0, 0, 0,
										((Class99) class99).aShort1316);
							} else {
								if (bool_237_)
									((Class296) class296).anInt3997 = 100;
								class296.method1840((float) i_183_,
										(float) i_185_, (float) i_189_,
										(float) i_182_, (float) i_184_,
										(float) i_188_, (float) (int) f,
										(float) (int) f_179_,
										(float) (int) f_181_,
										((Class99) class99).anInt1322,
										((Class99) class99).anInt1318,
										((Class99) class99).anInt1317);
								((Class296) class296).anInt3997 = 0;
							}
						} else
							class296.method1834((float) i_183_, (float) i_185_,
									(float) i_189_, (float) i_182_,
									(float) i_184_, (float) i_188_,
									(float) (int) f, (float) (int) f_179_,
									(float) (int) f_181_,
									(((Class363) class363).anInt4726));
					}
				} else {
					int i_243_ = i_176_ + i_177_ + i_178_;
					if (((i_186_ - i_188_) * (i_185_ - i_189_) - (i_187_ - i_189_)
							* (i_184_ - i_188_)) > 0) {
						((Class296) class296).aBool4001 = (i_186_ < 0
								|| i_188_ < 0 || i_184_ < 0
								|| i_186_ > ((Class296) class296).anInt3995
								|| i_188_ > ((Class296) class296).anInt3995 || i_184_ > ((Class296) class296).anInt3995);
						if (i_243_ < 765) {
							if (bool_237_)
								((Class296) class296).anInt3997 = -1694498816;
							if (i_243_ > 0) {
								if (((Class99) class99).aShort1316 >= 0) {
									int i_244_ = -16777216;
									if (bool_237_)
										i_244_ = -1694498816;
									class296.method1845(
											(float) i_187_,
											(float) i_189_,
											(float) i_185_,
											(float) i_186_,
											(float) i_188_,
											(float) i_184_,
											f_180_,
											f_181_,
											f_179_,
											1.0F,
											0.0F,
											1.0F,
											1.0F,
											1.0F,
											0.0F,
											i_244_
													| (((Class99) class99).anInt1312)
													& 0xffffff,
											i_244_
													| (((Class99) class99).anInt1317)
													& 0xffffff,
											i_244_
													| (((Class99) class99).anInt1318)
													& 0xffffff,
											((Class363) class363).anInt4726,
											i_177_, i_178_, i_176_,
											((Class99) class99).aShort1316);
								} else {
									if (bool_237_)
										((Class296) class296).anInt3997 = 100;
									class296.method1840(
											(float) i_187_,
											(float) i_189_,
											(float) i_185_,
											(float) i_186_,
											(float) i_188_,
											(float) i_184_,
											(float) (int) f_180_,
											(float) (int) f_181_,
											(float) (int) f_179_,
											(Class343
													.method2078(
															((Class99) class99).anInt1312,
															112,
															(i_177_ << 24 | (((Class363) class363).anInt4726)))),
											(Class343
													.method2078(
															((Class99) class99).anInt1317,
															-67,
															(i_178_ << 24 | (((Class363) class363).anInt4726)))),
											(Class343
													.method2078(
															((Class99) class99).anInt1318,
															87,
															(i_176_ << 24 | (((Class363) class363).anInt4726)))));
									((Class296) class296).anInt3997 = 0;
								}
							} else if (((Class99) class99).aShort1316 >= 0) {
								int i_245_ = -16777216;
								if (bool_237_)
									i_245_ = -1694498816;
								class296.method1845(
										(float) i_187_,
										(float) i_189_,
										(float) i_185_,
										(float) i_186_,
										(float) i_188_,
										(float) i_184_,
										f_180_,
										f_181_,
										f_179_,
										1.0F,
										0.0F,
										1.0F,
										1.0F,
										1.0F,
										0.0F,
										i_245_
												| (((Class99) class99).anInt1312 & 0xffffff),
										i_245_
												| (((Class99) class99).anInt1317 & 0xffffff),
										i_245_
												| (((Class99) class99).anInt1318 & 0xffffff),
										0, 0, 0, 0,
										((Class99) class99).aShort1316);
							} else {
								if (bool_237_)
									((Class296) class296).anInt3997 = 100;
								class296.method1840((float) i_187_,
										(float) i_189_, (float) i_185_,
										(float) i_186_, (float) i_188_,
										(float) i_184_, (float) (int) f_180_,
										(float) (int) f_181_,
										(float) (int) f_179_,
										((Class99) class99).anInt1312,
										((Class99) class99).anInt1317,
										((Class99) class99).anInt1318);
								((Class296) class296).anInt3997 = 0;
							}
						} else
							class296.method1834((float) i_187_, (float) i_189_,
									(float) i_185_, (float) i_186_,
									(float) i_188_, (float) i_184_,
									(float) (int) f_180_, (float) (int) f_181_,
									(float) (int) f_179_,
									(((Class363) class363).anInt4726));
					}
					i_243_ = i_175_ + i_176_ + i_178_;
					if (((i_182_ - i_184_) * (i_189_ - i_185_) - (i_183_ - i_185_)
							* (i_188_ - i_184_)) > 0) {
						((Class296) class296).aBool4001 = (i_182_ < 0
								|| i_184_ < 0 || i_188_ < 0
								|| i_182_ > ((Class296) class296).anInt3995
								|| i_184_ > ((Class296) class296).anInt3995 || i_188_ > ((Class296) class296).anInt3995);
						if (i_243_ < 765) {
							if (bool_237_)
								((Class296) class296).anInt3997 = -1694498816;
							if (i_243_ > 0) {
								if (((Class99) class99).aShort1316 >= 0) {
									int i_246_ = -16777216;
									if (bool_237_)
										i_246_ = -1694498816;
									class296.method1845(
											(float) i_183_,
											(float) i_185_,
											(float) i_189_,
											(float) i_182_,
											(float) i_184_,
											(float) i_188_,
											f,
											f_179_,
											f_181_,
											0.0F,
											1.0F,
											1.0F,
											0.0F,
											0.0F,
											1.0F,
											i_246_
													| (((Class99) class99).anInt1322)
													& 0xffffff,
											i_246_
													| (((Class99) class99).anInt1318)
													& 0xffffff,
											i_246_
													| (((Class99) class99).anInt1317)
													& 0xffffff,
											((Class363) class363).anInt4726,
											i_175_, i_176_, i_178_,
											((Class99) class99).aShort1316);
								} else {
									if (bool_237_)
										((Class296) class296).anInt3997 = 100;
									class296.method1840(
											(float) i_183_,
											(float) i_185_,
											(float) i_189_,
											(float) i_182_,
											(float) i_184_,
											(float) i_188_,
											(float) (int) f,
											(float) (int) f_179_,
											(float) (int) f_181_,
											(Class343
													.method2078(
															((Class99) class99).anInt1322,
															120,
															(i_175_ << 24 | (((Class363) class363).anInt4726)))),
											(Class343
													.method2078(
															((Class99) class99).anInt1318,
															-24,
															(i_176_ << 24 | (((Class363) class363).anInt4726)))),
											(Class343
													.method2078(
															((Class99) class99).anInt1317,
															-127,
															(i_178_ << 24 | (((Class363) class363).anInt4726)))));
									((Class296) class296).anInt3997 = 0;
								}
							} else if (((Class99) class99).aShort1316 >= 0) {
								int i_247_ = -16777216;
								if (bool_237_)
									i_247_ = -1694498816;
								class296.method1845(
										(float) i_183_,
										(float) i_185_,
										(float) i_189_,
										(float) i_182_,
										(float) i_184_,
										(float) i_188_,
										f,
										f_179_,
										f_181_,
										0.0F,
										1.0F,
										1.0F,
										0.0F,
										0.0F,
										1.0F,
										i_247_
												| (((Class99) class99).anInt1322 & 0xffffff),
										i_247_
												| (((Class99) class99).anInt1318 & 0xffffff),
										i_247_
												| (((Class99) class99).anInt1317 & 0xffffff),
										0, 0, 0, 0,
										((Class99) class99).aShort1316);
							} else {
								if (bool_237_)
									((Class296) class296).anInt3997 = 100;
								class296.method1840((float) i_183_,
										(float) i_185_, (float) i_189_,
										(float) i_182_, (float) i_184_,
										(float) i_188_, (float) (int) f,
										(float) (int) f_179_,
										(float) (int) f_181_,
										((Class99) class99).anInt1322,
										((Class99) class99).anInt1318,
										((Class99) class99).anInt1317);
								((Class296) class296).anInt3997 = 0;
							}
						} else
							class296.method1834((float) i_183_, (float) i_185_,
									(float) i_189_, (float) i_182_,
									(float) i_184_, (float) i_188_,
									(float) (int) f, (float) (int) f_179_,
									(float) (int) f_181_,
									(((Class363) class363).anInt4726));
					}
				}
			}
		} else {
			Class241 class241 = aClass241ArrayArray5276[i][i_166_];
			if (class241 != null) {
				if (i_170_ != 0) {
					if ((((Class241) class241).aByte3268 & 0x4) != 0) {
						if ((i_170_ & 0x1) != 0)
							return;
					} else if ((i_170_ & 0x2) != 0)
						return;
				}
				if (anInt5280 == -1) {
					for (int i_248_ = 0; i_248_ < ((Class241) class241).aShort3276; i_248_++) {
						int i_249_ = (((Class241) class241).aShortArray3271[i_248_] + (i << ((Class12) this).anInt97));
						int i_250_ = ((Class241) class241).aShortArray3275[i_248_];
						int i_251_ = (((Class241) class241).aShortArray3267[i_248_] + (i_166_ << ((Class12) this).anInt97));
						float f = aFloat5284
								+ (aFloat5283 * (float) i_249_ + aFloat5281
										* (float) i_250_ + aFloat5278
										* (float) i_251_);
						if (f <= (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5200))
							return;
						is_169_[i_248_] = 0;
						if (bool) {
							int i_252_ = (int) (f - (float) (((Class363) class363).anInt4724));
							if (i_252_ > 255)
								i_252_ = 255;
							if (i_252_ > 0) {
								is_169_[i_248_] = i_252_;
								int i_253_ = ((((Class241) class241).aShortArray3273[i_248_])
										* i_252_ / 255);
								if (i_253_ > 0)
									i_250_ -= i_253_;
							}
						} else if (((Class363) class363).aBool4723) {
							int i_254_ = (int) (f - (float) (((Class363) class363).anInt4724));
							if (i_254_ > 0) {
								is_169_[i_248_] = i_254_;
								if (is_169_[i_248_] > 255)
									is_169_[i_248_] = 255;
							}
						}
						float f_255_ = aFloat5291
								+ (aFloat5282 * (float) i_249_ + aFloat5285
										* (float) i_250_ + aFloat5275
										* (float) i_251_);
						float f_256_ = aFloat5289
								+ (aFloat5279 * (float) i_249_ + aFloat5288
										* (float) i_250_ + aFloat5286
										* (float) i_251_);
						is[i_248_] = (((Class296) class296).anInt3993 + (int) (f_255_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / f));
						is_167_[i_248_] = (((Class296) class296).anInt4000 + (int) (f_256_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / f));
						is_168_[i_248_] = (int) f;
					}
				} else {
					for (int i_257_ = 0; i_257_ < ((Class241) class241).aShort3276; i_257_++) {
						int i_258_ = (((Class241) class241).aShortArray3271[i_257_] + (i << ((Class12) this).anInt97));
						int i_259_ = ((Class241) class241).aShortArray3275[i_257_];
						int i_260_ = (((Class241) class241).aShortArray3267[i_257_] + (i_166_ << ((Class12) this).anInt97));
						float f = aFloat5284
								+ (aFloat5283 * (float) i_258_ + aFloat5281
										* (float) i_259_ + aFloat5278
										* (float) i_260_);
						is_169_[i_257_] = 0;
						if (bool) {
							int i_261_ = anInt5280
									- ((Class363) class363).anInt4724;
							if (i_261_ > 255)
								i_261_ = 255;
							if (i_261_ > 0) {
								is_169_[i_257_] = i_261_;
								int i_262_ = ((((Class241) class241).aShortArray3273[i_257_])
										* i_261_ / 255);
								if (i_262_ > 0)
									i_259_ -= i_262_;
							}
						} else if (((Class363) class363).aBool4723) {
							int i_263_ = anInt5280
									- ((Class363) class363).anInt4724;
							if (i_263_ > 0) {
								is_169_[i_257_] = i_263_;
								if (is_169_[i_257_] > 255)
									is_169_[i_257_] = 255;
							}
						}
						float f_264_ = aFloat5291
								+ (aFloat5282 * (float) i_258_ + aFloat5285
										* (float) i_259_ + aFloat5275
										* (float) i_260_);
						float f_265_ = aFloat5289
								+ (aFloat5279 * (float) i_258_ + aFloat5288
										* (float) i_259_ + aFloat5286
										* (float) i_260_);
						is[i_257_] = (((Class296) class296).anInt3993 + (int) (f_264_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / (float) anInt5280));
						is_167_[i_257_] = (((Class296) class296).anInt4000 + (int) (f_265_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / (float) anInt5280));
						is_168_[i_257_] = (int) f;
					}
				}
				if (((Class241) class241).aShortArray3277 != null) {
					if (anInt5280 == -1) {
						for (int i_266_ = 0; i_266_ < ((Class241) class241).aShort3274; i_266_++) {
							int i_267_ = i_266_ * 3;
							int i_268_ = i_267_ + 1;
							int i_269_ = i_268_ + 1;
							int i_270_ = is[i_267_];
							int i_271_ = is[i_268_];
							int i_272_ = is[i_269_];
							int i_273_ = is_167_[i_267_];
							int i_274_ = is_167_[i_268_];
							int i_275_ = is_167_[i_269_];
							int i_276_ = (is_169_[i_267_] + is_169_[i_268_] + is_169_[i_269_]);
							if (((i_270_ - i_271_) * (i_275_ - i_274_) - (i_273_ - i_274_)
									* (i_272_ - i_271_)) > 0) {
								((Class296) class296).aBool4001 = (i_270_ < 0
										|| i_271_ < 0
										|| i_272_ < 0
										|| (i_270_ > ((Class296) class296).anInt3995)
										|| (i_271_ > ((Class296) class296).anInt3995) || (i_272_ > ((Class296) class296).anInt3995));
								short i_277_ = (((Class241) class241).aShortArray3277[i_266_]);
								if (i_276_ < 765) {
									if (i_276_ > 0) {
										if (i_277_ != -1) {
											int i_278_ = -16777216;
											if (i_277_ != -1
													&& (method2336(((Class188) (((Class163) aClass163_Sub1_5294).anInterface1_2118
															.method7(
																	(byte) 127,
																	i_277_))).aByte2426)))
												i_278_ = -1694498816;
											class296.method1845(
													(float) i_273_,
													(float) i_274_,
													(float) i_275_,
													(float) i_270_,
													(float) i_271_,
													(float) i_272_,
													(float) is_168_[i_267_],
													(float) is_168_[i_268_],
													(float) is_168_[i_269_],
													((float) (((Class241) class241).aShortArray3271[i_267_]) / (float) (((Class12) this).anInt93)),
													((float) (((Class241) class241).aShortArray3271[i_268_]) / (float) (((Class12) this).anInt93)),
													((float) (((Class241) class241).aShortArray3271[i_269_]) / (float) (((Class12) this).anInt93)),
													((float) (((Class241) class241).aShortArray3267[i_267_]) / (float) (((Class12) this).anInt93)),
													((float) (((Class241) class241).aShortArray3267[i_268_]) / (float) (((Class12) this).anInt93)),
													((float) (((Class241) class241).aShortArray3267[i_269_]) / (float) (((Class12) this).anInt93)),
													(i_278_ | ((((Class241) class241).anIntArray3270[i_267_]) & 0xffffff)),
													(i_278_ | ((((Class241) class241).anIntArray3270[i_268_]) & 0xffffff)),
													(i_278_ | ((((Class241) class241).anIntArray3270[i_269_]) & 0xffffff)),
													(((Class363) class363).anInt4726),
													is_169_[i_267_],
													is_169_[i_268_],
													is_169_[i_269_], i_277_);
										} else if (((((Class241) class241).anIntArray3270[i_267_]) & 0xffffff) != 0) {
											if (i_277_ != -1
													&& (method2336(((Class188) (((Class163) aClass163_Sub1_5294).anInterface1_2118
															.method7(
																	(byte) 127,
																	i_277_))).aByte2426)))
												((Class296) class296).anInt3997 = -1694498816;
											class296.method1840(
													(float) i_273_,
													(float) i_274_,
													(float) i_275_,
													(float) i_270_,
													(float) i_271_,
													(float) i_272_,
													(float) is_168_[i_267_],
													(float) is_168_[i_268_],
													(float) is_168_[i_269_],
													(Class343
															.method2078(
																	(((Class241) class241).anIntArray3270[i_267_]),
																	105,
																	(is_169_[i_267_] << 24 | (((Class363) class363).anInt4726)))),
													(Class343
															.method2078(
																	(((Class241) class241).anIntArray3270[i_268_]),
																	97,
																	(is_169_[i_268_] << 24 | (((Class363) class363).anInt4726)))),
													(Class343
															.method2078(
																	(((Class241) class241).anIntArray3270[i_269_]),
																	-38,
																	(is_169_[i_269_] << 24 | (((Class363) class363).anInt4726)))));
											((Class296) class296).anInt3997 = 0;
										}
									} else if (i_277_ != -1) {
										int i_279_ = -16777216;
										if (i_277_ != -1
												&& (method2336(((Class188) (((Class163) aClass163_Sub1_5294).anInterface1_2118
														.method7((byte) 127,
																i_277_))).aByte2426)))
											i_279_ = -1694498816;
										class296.method1845(
												(float) i_273_,
												(float) i_274_,
												(float) i_275_,
												(float) i_270_,
												(float) i_271_,
												(float) i_272_,
												(float) is_168_[i_267_],
												(float) is_168_[i_268_],
												(float) is_168_[i_269_],
												((float) (((Class241) class241).aShortArray3271[i_267_]) / (float) (((Class12) this).anInt93)),
												((float) (((Class241) class241).aShortArray3271[i_268_]) / (float) (((Class12) this).anInt93)),
												((float) (((Class241) class241).aShortArray3271[i_269_]) / (float) (((Class12) this).anInt93)),
												((float) (((Class241) class241).aShortArray3267[i_267_]) / (float) (((Class12) this).anInt93)),
												((float) (((Class241) class241).aShortArray3267[i_268_]) / (float) (((Class12) this).anInt93)),
												((float) (((Class241) class241).aShortArray3267[i_269_]) / (float) (((Class12) this).anInt93)),
												i_279_
														| (((Class241) class241).anIntArray3270[i_267_])
														& 0xffffff,
												i_279_
														| (((Class241) class241).anIntArray3270[i_268_])
														& 0xffffff,
												i_279_
														| (((Class241) class241).anIntArray3270[i_269_])
														& 0xffffff, 0, 0, 0, 0,
												i_277_);
									} else if (((((Class241) class241).anIntArray3270[i_267_]) & 0xffffff) != 0) {
										if (i_277_ != -1
												&& (method2336(((Class188) (((Class163) aClass163_Sub1_5294).anInterface1_2118
														.method7((byte) 127,
																i_277_))).aByte2426)))
											((Class296) class296).anInt3997 = -1694498816;
										class296.method1840(
												(float) i_273_,
												(float) i_274_,
												(float) i_275_,
												(float) i_270_,
												(float) i_271_,
												(float) i_272_,
												(float) is_168_[i_267_],
												(float) is_168_[i_268_],
												(float) is_168_[i_269_],
												(((Class241) class241).anIntArray3270[i_267_]),
												(((Class241) class241).anIntArray3270[i_268_]),
												(((Class241) class241).anIntArray3270[i_269_]));
										((Class296) class296).anInt3997 = 0;
									}
								} else
									class296.method1834((float) i_273_,
											(float) i_274_, (float) i_275_,
											(float) i_270_, (float) i_271_,
											(float) i_272_,
											(float) is_168_[i_267_],
											(float) is_168_[i_268_],
											(float) is_168_[i_269_],
											((Class363) class363).anInt4726);
							}
						}
					} else {
						for (int i_280_ = 0; i_280_ < ((Class241) class241).aShort3274; i_280_++) {
							int i_281_ = i_280_ * 3;
							int i_282_ = i_281_ + 1;
							int i_283_ = i_282_ + 1;
							int i_284_ = is[i_281_];
							int i_285_ = is[i_282_];
							int i_286_ = is[i_283_];
							int i_287_ = is_167_[i_281_];
							int i_288_ = is_167_[i_282_];
							int i_289_ = is_167_[i_283_];
							int i_290_ = (is_169_[i_281_] + is_169_[i_282_] + is_169_[i_283_]);
							if (((i_284_ - i_285_) * (i_289_ - i_288_) - (i_287_ - i_288_)
									* (i_286_ - i_285_)) > 0) {
								((Class296) class296).aBool4001 = (i_284_ < 0
										|| i_285_ < 0
										|| i_286_ < 0
										|| (i_284_ > ((Class296) class296).anInt3995)
										|| (i_285_ > ((Class296) class296).anInt3995) || (i_286_ > ((Class296) class296).anInt3995));
								short i_291_ = (((Class241) class241).aShortArray3277[i_280_]);
								if (i_290_ < 765) {
									if (i_291_ != -1
											&& (method2336(((Class188) ((Class163) aClass163_Sub1_5294).anInterface1_2118
													.method7((byte) 127, i_291_)).aByte2426)))
										((Class296) class296).anInt3997 = -1694498816;
									if (i_290_ > 0) {
										if (i_291_ != -1) {
											int i_292_ = -16777216;
											if (i_291_ != -1
													&& (method2336(((Class188) (((Class163) aClass163_Sub1_5294).anInterface1_2118
															.method7(
																	(byte) 127,
																	i_291_))).aByte2426)))
												i_292_ = -1694498816;
											class296.method1845(
													(float) i_287_,
													(float) i_288_,
													(float) i_289_,
													(float) i_284_,
													(float) i_285_,
													(float) i_286_,
													(float) is_168_[i_281_],
													(float) is_168_[i_282_],
													(float) is_168_[i_283_],
													((float) (((Class241) class241).aShortArray3271[i_281_]) / (float) (((Class12) this).anInt93)),
													((float) (((Class241) class241).aShortArray3271[i_282_]) / (float) (((Class12) this).anInt93)),
													((float) (((Class241) class241).aShortArray3271[i_283_]) / (float) (((Class12) this).anInt93)),
													((float) (((Class241) class241).aShortArray3267[i_281_]) / (float) (((Class12) this).anInt93)),
													((float) (((Class241) class241).aShortArray3267[i_282_]) / (float) (((Class12) this).anInt93)),
													((float) (((Class241) class241).aShortArray3267[i_283_]) / (float) (((Class12) this).anInt93)),
													(i_292_ | ((((Class241) class241).anIntArray3270[i_281_]) & 0xffffff)),
													(i_292_ | ((((Class241) class241).anIntArray3270[i_282_]) & 0xffffff)),
													(i_292_ | ((((Class241) class241).anIntArray3270[i_283_]) & 0xffffff)),
													(((Class363) class363).anInt4726),
													is_169_[i_281_],
													is_169_[i_282_],
													is_169_[i_283_], i_291_);
										} else if (((((Class241) class241).anIntArray3270[i_281_]) & 0xffffff) != 0) {
											if (i_291_ != -1
													&& (method2336(((Class188) (((Class163) aClass163_Sub1_5294).anInterface1_2118
															.method7(
																	(byte) 127,
																	i_291_))).aByte2426)))
												((Class296) class296).anInt3997 = -1694498816;
											class296.method1840(
													(float) i_287_,
													(float) i_288_,
													(float) i_289_,
													(float) i_284_,
													(float) i_285_,
													(float) i_286_,
													(float) is_168_[i_281_],
													(float) is_168_[i_282_],
													(float) is_168_[i_283_],
													(Class343
															.method2078(
																	(((Class241) class241).anIntArray3270[i_281_]),
																	-64,
																	(is_169_[i_281_] << 24 | (((Class363) class363).anInt4726)))),
													(Class343
															.method2078(
																	(((Class241) class241).anIntArray3270[i_282_]),
																	-65,
																	(is_169_[i_282_] << 24 | (((Class363) class363).anInt4726)))),
													(Class343
															.method2078(
																	(((Class241) class241).anIntArray3270[i_283_]),
																	-40,
																	(is_169_[i_283_] << 24 | (((Class363) class363).anInt4726)))));
											((Class296) class296).anInt3997 = 0;
										}
									} else if (i_291_ != -1) {
										int i_293_ = -16777216;
										if (i_291_ != -1
												&& (method2336(((Class188) (((Class163) aClass163_Sub1_5294).anInterface1_2118
														.method7((byte) 127,
																i_291_))).aByte2426)))
											i_293_ = -1694498816;
										class296.method1845(
												(float) i_287_,
												(float) i_288_,
												(float) i_289_,
												(float) i_284_,
												(float) i_285_,
												(float) i_286_,
												(float) is_168_[i_281_],
												(float) is_168_[i_282_],
												(float) is_168_[i_283_],
												((float) (((Class241) class241).aShortArray3271[i_281_]) / (float) (((Class12) this).anInt93)),
												((float) (((Class241) class241).aShortArray3271[i_282_]) / (float) (((Class12) this).anInt93)),
												((float) (((Class241) class241).aShortArray3271[i_283_]) / (float) (((Class12) this).anInt93)),
												((float) (((Class241) class241).aShortArray3267[i_281_]) / (float) (((Class12) this).anInt93)),
												((float) (((Class241) class241).aShortArray3267[i_282_]) / (float) (((Class12) this).anInt93)),
												((float) (((Class241) class241).aShortArray3267[i_283_]) / (float) (((Class12) this).anInt93)),
												i_293_
														| (((Class241) class241).anIntArray3270[i_281_])
														& 0xffffff,
												i_293_
														| (((Class241) class241).anIntArray3270[i_282_])
														& 0xffffff,
												i_293_
														| (((Class241) class241).anIntArray3270[i_283_])
														& 0xffffff, 0, 0, 0, 0,
												i_291_);
									} else if (((((Class241) class241).anIntArray3270[i_281_]) & 0xffffff) != 0) {
										if (i_291_ != -1
												&& (method2336(((Class188) (((Class163) aClass163_Sub1_5294).anInterface1_2118
														.method7((byte) 127,
																i_291_))).aByte2426)))
											((Class296) class296).anInt3997 = -1694498816;
										class296.method1840(
												(float) i_287_,
												(float) i_288_,
												(float) i_289_,
												(float) i_284_,
												(float) i_285_,
												(float) i_286_,
												(float) is_168_[i_281_],
												(float) is_168_[i_282_],
												(float) is_168_[i_283_],
												(((Class241) class241).anIntArray3270[i_281_]),
												(((Class241) class241).anIntArray3270[i_282_]),
												(((Class241) class241).anIntArray3270[i_283_]));
										((Class296) class296).anInt3997 = 0;
									}
									((Class296) class296).anInt3997 = 0;
								} else
									class296.method1834((float) i_287_,
											(float) i_288_, (float) i_289_,
											(float) i_284_, (float) i_285_,
											(float) i_286_,
											(float) is_168_[i_281_],
											(float) is_168_[i_282_],
											(float) is_168_[i_283_],
											((Class363) class363).anInt4726);
							}
						}
					}
				} else {
					for (int i_294_ = 0; i_294_ < ((Class241) class241).aShort3274; i_294_++) {
						int i_295_ = i_294_ * 3;
						int i_296_ = i_295_ + 1;
						int i_297_ = i_296_ + 1;
						int i_298_ = is[i_295_];
						int i_299_ = is[i_296_];
						int i_300_ = is[i_297_];
						int i_301_ = is_167_[i_295_];
						int i_302_ = is_167_[i_296_];
						int i_303_ = is_167_[i_297_];
						int i_304_ = (is_169_[i_295_] + is_169_[i_296_] + is_169_[i_297_]);
						if (((i_298_ - i_299_) * (i_303_ - i_302_) - (i_301_ - i_302_)
								* (i_300_ - i_299_)) > 0) {
							((Class296) class296).aBool4001 = (i_298_ < 0
									|| i_299_ < 0 || i_300_ < 0
									|| i_298_ > ((Class296) class296).anInt3995
									|| i_299_ > ((Class296) class296).anInt3995 || (i_300_ > ((Class296) class296).anInt3995));
							if (i_304_ < 765) {
								if (i_304_ > 0) {
									if (((((Class241) class241).anIntArray3270[i_295_]) & 0xffffff) != 0)
										class296.method1840(
												(float) i_301_,
												(float) i_302_,
												(float) i_303_,
												(float) i_298_,
												(float) i_299_,
												(float) i_300_,
												(float) is_168_[i_295_],
												(float) is_168_[i_296_],
												(float) is_168_[i_297_],
												(Class191
														.method1237(
																is_169_[i_295_],
																((Class363) class363).anInt4726,
																(((Class241) class241).anIntArray3270[i_295_]),
																-39)),
												(Class191
														.method1237(
																is_169_[i_296_],
																((Class363) class363).anInt4726,
																(((Class241) class241).anIntArray3270[i_296_]),
																-60)),
												(Class191
														.method1237(
																is_169_[i_297_],
																((Class363) class363).anInt4726,
																(((Class241) class241).anIntArray3270[i_297_]),
																-33)));
								} else if (((((Class241) class241).anIntArray3270[i_295_]) & 0xffffff) != 0)
									class296.method1840(
											(float) i_301_,
											(float) i_302_,
											(float) i_303_,
											(float) i_298_,
											(float) i_299_,
											(float) i_300_,
											(float) is_168_[i_295_],
											(float) is_168_[i_296_],
											(float) is_168_[i_297_],
											(((Class241) class241).anIntArray3270[i_295_]),
											(((Class241) class241).anIntArray3270[i_296_]),
											(((Class241) class241).anIntArray3270[i_297_]));
							} else
								class296.method1834((float) i_301_,
										(float) i_302_, (float) i_303_,
										(float) i_298_, (float) i_299_,
										(float) i_300_,
										(float) is_168_[i_295_],
										(float) is_168_[i_296_],
										(float) is_168_[i_297_],
										(((Class363) class363).anInt4726));
						}
					}
				}
			}
		}
	}

	final void method136(Class11_Sub46 class11_sub46, int[] is) {
		/* empty */
	}

	private final void method2333(int i, int i_305_, int i_306_, int i_307_,
			int i_308_, int i_309_, int i_310_, boolean[][] bools,
			Class363 class363, Class296 class296, int[] is, int[] is_311_) {
		int i_312_ = (i_310_ - i_308_) * i_306_ / 256;
		int i_313_ = i_306_ >> 8;
		boolean bool = ((Class363) class363).aBool4731;
		aClass163_Sub1_5294.C(false);
		((Class296) class296).aBool4003 = false;
		((Class296) class296).aBool3992 = false;
		int i_314_ = i;
		int i_315_ = i_305_ + i_312_;
		for (int i_316_ = i_307_; i_316_ < i_309_; i_316_++) {
			for (int i_317_ = i_308_; i_317_ < i_310_; i_317_++) {
				if (bools[i_316_ - i_307_][i_317_ - i_308_]) {
					if (aClass99ArrayArray5287 != null) {
						if (aClass99ArrayArray5287[i_316_][i_317_] != null) {
							Class99 class99 = aClass99ArrayArray5287[i_316_][i_317_];
							if (((Class99) class99).aShort1316 != -1
									&& (((Class99) class99).aByte1315 & 0x2) == 0
									&& ((Class99) class99).anInt1319 == 0) {
								int i_318_ = (aClass163_Sub1_5294
										.method2294(((Class99) class99).aShort1316));
								class296.method1841((float) (i_315_ - i_313_),
										(float) (i_315_ - i_313_),
										(float) i_315_,
										(float) (i_314_ + i_313_),
										(float) i_314_,
										(float) (i_314_ + i_313_), 100.0F,
										100.0F, 100.0F,
										(float) (Class2_Sub9.method2949(
												((Class99) class99).anInt1312,
												i_318_, (byte) -66)),
										(float) (Class2_Sub9.method2949(
												((Class99) class99).anInt1317,
												i_318_, (byte) -95)),
										(float) (Class2_Sub9.method2949(
												((Class99) class99).anInt1318,
												i_318_, (byte) -86)));
								class296.method1841((float) i_315_,
										(float) i_315_,
										(float) (i_315_ - i_313_),
										(float) i_314_,
										(float) (i_314_ + i_313_),
										(float) i_314_, 100.0F, 100.0F, 100.0F,
										(float) (Class2_Sub9.method2949(
												((Class99) class99).anInt1322,
												i_318_, (byte) -108)),
										(float) (Class2_Sub9.method2949(
												((Class99) class99).anInt1318,
												i_318_, (byte) -89)),
										(float) (Class2_Sub9.method2949(
												((Class99) class99).anInt1317,
												i_318_, (byte) -128)));
							} else if (((Class99) class99).anInt1319 == 0) {
								class296.method1840((float) (i_315_ - i_313_),
										(float) (i_315_ - i_313_),
										(float) i_315_,
										(float) (i_314_ + i_313_),
										(float) i_314_,
										(float) (i_314_ + i_313_), 100.0F,
										100.0F, 100.0F,
										((Class99) class99).anInt1312,
										((Class99) class99).anInt1317,
										((Class99) class99).anInt1318);
								class296.method1840((float) i_315_,
										(float) i_315_,
										(float) (i_315_ - i_313_),
										(float) i_314_,
										(float) (i_314_ + i_313_),
										(float) i_314_, 100.0F, 100.0F, 100.0F,
										((Class99) class99).anInt1322,
										((Class99) class99).anInt1318,
										((Class99) class99).anInt1317);
							} else {
								int i_319_ = ((Class99) class99).anInt1319;
								class296.method1840(
										(float) (i_315_ - i_313_),
										(float) (i_315_ - i_313_),
										(float) i_315_,
										(float) (i_314_ + i_313_),
										(float) i_314_,
										(float) (i_314_ + i_313_),
										100.0F,
										100.0F,
										100.0F,
										Class343.method2078(
												i_319_,
												124,
												((((Class99) class99).anInt1312) & ~0xffffff)),
										Class343.method2078(
												i_319_,
												-40,
												((((Class99) class99).anInt1317) & ~0xffffff)),
										Class343.method2078(
												i_319_,
												112,
												((((Class99) class99).anInt1318) & ~0xffffff)));
								class296.method1840(
										(float) i_315_,
										(float) i_315_,
										(float) (i_315_ - i_313_),
										(float) i_314_,
										(float) (i_314_ + i_313_),
										(float) i_314_,
										100.0F,
										100.0F,
										100.0F,
										Class343.method2078(
												i_319_,
												87,
												((((Class99) class99).anInt1322) & ~0xffffff)),
										Class343.method2078(
												i_319_,
												-85,
												((((Class99) class99).anInt1318) & ~0xffffff)),
										Class343.method2078(
												i_319_,
												-80,
												((((Class99) class99).anInt1317) & ~0xffffff)));
							}
						} else if (aClass241ArrayArray5276[i_316_][i_317_] != null) {
							Class241 class241 = aClass241ArrayArray5276[i_316_][i_317_];
							for (int i_320_ = 0; i_320_ < ((Class241) class241).aShort3276; i_320_++) {
								is[i_320_] = i_314_
										+ ((((Class241) class241).aShortArray3271[i_320_])
												* i_313_ / ((Class12) this).anInt93);
								is_311_[i_320_] = i_315_
										- ((((Class241) class241).aShortArray3267[i_320_])
												* i_313_ / ((Class12) this).anInt93);
							}
							for (int i_321_ = 0; i_321_ < ((Class241) class241).aShort3274; i_321_++) {
								int i_322_ = i_321_ * 3;
								int i_323_ = i_322_ + 1;
								int i_324_ = i_323_ + 1;
								int i_325_ = is[i_322_];
								int i_326_ = is[i_323_];
								int i_327_ = is[i_324_];
								int i_328_ = is_311_[i_322_];
								int i_329_ = is_311_[i_323_];
								int i_330_ = is_311_[i_324_];
								if ((((Class241) class241).anIntArray3269 != null)
										&& (((Class241) class241).anIntArray3269[i_321_]) != 0
										&& ((((Class241) class241).aShortArray3277 == null) || ((((Class241) class241).aShortArray3277) != null && ((((Class241) class241).aShortArray3277[i_321_]) == -1)))) {
									int i_331_ = (((Class241) class241).anIntArray3269[i_321_]);
									class296.method1840(
											(float) i_328_,
											(float) i_329_,
											(float) i_330_,
											(float) i_325_,
											(float) i_326_,
											(float) i_327_,
											100.0F,
											100.0F,
											100.0F,
											(Class343
													.method2078(
															i_331_,
															-66,
															-16777216
																	- ((((Class241) class241).anIntArray3270[i_322_]) & ~0xffffff))),
											(Class343
													.method2078(
															i_331_,
															-65,
															-16777216
																	- ((((Class241) class241).anIntArray3270[i_323_]) & ~0xffffff))),
											(Class343
													.method2078(
															i_331_,
															81,
															-16777216
																	- ((((Class241) class241).anIntArray3270[i_324_]) & ~0xffffff))));
								} else if ((((Class241) class241).aShortArray3277) != null
										&& ((((Class241) class241).aShortArray3277[i_321_]) != -1)) {
									int i_332_ = (aClass163_Sub1_5294
											.method2294(((Class241) class241).aShortArray3277[i_321_]));
									class296.method1841((float) i_328_,
											(float) i_329_, (float) i_330_,
											(float) i_325_, (float) i_326_,
											(float) i_327_, 100.0F, 100.0F,
											100.0F, (float) i_332_,
											(float) i_332_, (float) i_332_);
								} else
									class296.method1840(
											(float) i_328_,
											(float) i_329_,
											(float) i_330_,
											(float) i_325_,
											(float) i_326_,
											(float) i_327_,
											100.0F,
											100.0F,
											100.0F,
											(((Class241) class241).anIntArray3270[i_322_]),
											(((Class241) class241).anIntArray3270[i_323_]),
											(((Class241) class241).anIntArray3270[i_324_]));
							}
						}
					} else if (aClass136ArrayArray5274[i_316_][i_317_] != null) {
						Class136 class136 = aClass136ArrayArray5274[i_316_][i_317_];
						for (int i_333_ = 0; i_333_ < ((Class136) class136).aShort1875; i_333_++) {
							is[i_333_] = i_314_
									+ ((((Class136) class136).aShortArray1878[i_333_])
											* i_313_ / ((Class12) this).anInt93);
							is_311_[i_333_] = i_315_
									- ((((Class136) class136).aShortArray1876[i_333_])
											* i_313_ / ((Class12) this).anInt93);
						}
						for (int i_334_ = 0; i_334_ < ((Class136) class136).aShort1871; i_334_++) {
							int i_335_ = i_334_ * 3;
							int i_336_ = i_335_ + 1;
							int i_337_ = i_336_ + 1;
							int i_338_ = is[i_335_];
							int i_339_ = is[i_336_];
							int i_340_ = is[i_337_];
							int i_341_ = is_311_[i_335_];
							int i_342_ = is_311_[i_336_];
							int i_343_ = is_311_[i_337_];
							if (((Class136) class136).anIntArray1877 != null
									&& (((Class136) class136).anIntArray1877[i_334_]) != 0) {
								int i_344_ = (((Class136) class136).anIntArray1877[i_334_]);
								class296.method1840((float) i_341_,
										(float) i_342_, (float) i_343_,
										(float) i_338_, (float) i_339_,
										(float) i_340_, 100.0F, 100.0F, 100.0F,
										i_344_, i_344_, i_344_);
							} else
								class296.method1840(
										(float) i_341_,
										(float) i_342_,
										(float) i_343_,
										(float) i_338_,
										(float) i_339_,
										(float) i_340_,
										100.0F,
										100.0F,
										100.0F,
										(((Class136) class136).anIntArray1874[i_335_]),
										(((Class136) class136).anIntArray1874[i_336_]),
										(((Class136) class136).anIntArray1874[i_337_]));
						}
					}
				}
				i_315_ -= i_313_;
			}
			i_315_ = i_305_ + i_312_;
			i_314_ += i_313_;
		}
		((Class296) class296).aBool4003 = true;
		aClass163_Sub1_5294.C(bool);
	}

	private static final int method2334(int i, int i_345_) {
		int i_346_ = (i & 0xff0000) * i_345_ >> 23;
		if (i_346_ < 2)
			i_346_ = 2;
		else if (i_346_ > 253)
			i_346_ = 253;
		int i_347_ = (i & 0xff00) * i_345_ >> 15;
		if (i_347_ < 2)
			i_347_ = 2;
		else if (i_347_ > 253)
			i_347_ = 253;
		int i_348_ = (i & 0xff) * i_345_ >> 7;
		if (i_348_ < 2)
			i_348_ = 2;
		else if (i_348_ > 253)
			i_348_ = 253;
		return i_346_ << 16 | i_347_ << 8 | i_348_;
	}

	final Class11_Sub45_Sub1 fa(int i, int i_349_,
			Class11_Sub45_Sub1 class11_sub45_sub1) {
		return null;
	}

	final void YA() {
		aByteArrayArray5273 = null;
		aByteArrayArray5290 = null;
	}

	final boolean method128(Class11_Sub45_Sub1 class11_sub45_sub1, int i,
			int i_350_, int i_351_, int i_352_, boolean bool) {
		return false;
	}

	final void wa(Class11_Sub45_Sub1 class11_sub45_sub1, int i, int i_353_,
			int i_354_, int i_355_, boolean bool) {
		/* empty */
	}

	final void U(int i, int i_356_, int[] is, int[] is_357_, int[] is_358_,
			int[] is_359_, int[] is_360_, int[] is_361_, int[] is_362_,
			int[] is_363_, int i_364_, int i_365_, int i_366_, boolean bool) {
		boolean bool_367_ = (anInt5293 & 0x20) == 0;
		if (aClass99ArrayArray5287 == null && !bool_367_) {
			aClass99ArrayArray5287 = (new Class99[((Class12) this).anInt103][((Class12) this).anInt98]);
			aClass241ArrayArray5276 = (new Class241[((Class12) this).anInt103][((Class12) this).anInt98]);
		} else if (aClass136ArrayArray5274 == null && bool_367_)
			aClass136ArrayArray5274 = (new Class136[((Class12) this).anInt103][((Class12) this).anInt98]);
		else if (aClass158ArrayArray5292 != null)
			throw new IllegalStateException();
		if (is != null && is.length != 0) {
			for (int i_368_ = 0; i_368_ < is_360_.length; i_368_++) {
				if (is_360_[i_368_] == -1)
					is_360_[i_368_] = 0;
				else
					is_360_[i_368_] = ((Class219_Sub1.anIntArray7248[Class147
							.method942(0, is_360_[i_368_]) & 0xffff]) << 8) | 0xff;
			}
			if (is_361_ != null) {
				for (int i_369_ = 0; i_369_ < is_361_.length; i_369_++) {
					if (is_361_[i_369_] == -1)
						is_361_[i_369_] = 0;
					else
						is_361_[i_369_] = (Class219_Sub1.anIntArray7248[(Class147
								.method942(0, is_361_[i_369_]) & 0xffff)]) << 8 | 0xff;
				}
			}
			if (bool_367_) {
				Class136 class136 = new Class136();
				((Class136) class136).aShort1875 = (short) is.length;
				((Class136) class136).aShort1871 = (short) (is.length / 3);
				((Class136) class136).aShortArray1878 = new short[((Class136) class136).aShort1875];
				((Class136) class136).aShortArray1872 = new short[((Class136) class136).aShort1875];
				((Class136) class136).aShortArray1876 = new short[((Class136) class136).aShort1875];
				((Class136) class136).anIntArray1874 = new int[((Class136) class136).aShort1875];
				((Class136) class136).aShortArray1870 = new short[((Class136) class136).aShort1875];
				((Class136) class136).aShortArray1869 = new short[((Class136) class136).aShort1875];
				((Class136) class136).aByteArray1873 = new byte[((Class136) class136).aShort1875];
				if (is_359_ != null)
					((Class136) class136).aShortArray1868 = new short[((Class136) class136).aShort1875];
				for (int i_370_ = 0; i_370_ < ((Class136) class136).aShort1875; i_370_++) {
					int i_371_ = is[i_370_];
					int i_372_ = is_358_[i_370_];
					boolean bool_373_ = false;
					int i_374_;
					if (i_371_ == 0 && i_372_ == 0)
						i_374_ = (aByteArrayArray5273[i][i_356_] - aByteArrayArray5290[i][i_356_]);
					else if (i_371_ == 0 && i_372_ == ((Class12) this).anInt93)
						i_374_ = (aByteArrayArray5273[i][i_356_ + 1] - aByteArrayArray5290[i][i_356_ + 1]);
					else if (i_371_ == ((Class12) this).anInt93
							&& i_372_ == ((Class12) this).anInt93)
						i_374_ = (aByteArrayArray5273[i + 1][i_356_ + 1] - aByteArrayArray5290[i + 1][i_356_ + 1]);
					else if (i_371_ == ((Class12) this).anInt93 && i_372_ == 0)
						i_374_ = (aByteArrayArray5273[i + 1][i_356_] - aByteArrayArray5290[i + 1][i_356_]);
					else {
						int i_375_ = (((aByteArrayArray5273[i][i_356_] - aByteArrayArray5290[i][i_356_]) * (((Class12) this).anInt93 - i_371_)) + ((aByteArrayArray5273[i + 1][i_356_] - aByteArrayArray5290[i + 1][i_356_]) * i_371_));
						int i_376_ = (((aByteArrayArray5273[i][i_356_ + 1] - aByteArrayArray5290[i][i_356_ + 1]) * (((Class12) this).anInt93 - i_371_)) + ((aByteArrayArray5273[i + 1][i_356_ + 1] - aByteArrayArray5290[i + 1][i_356_ + 1]) * i_371_));
						i_374_ = ((i_375_ * (((Class12) this).anInt93 - i_372_) + i_376_
								* i_372_) >> 2 * ((Class12) this).anInt97);
					}
					int i_377_ = (i << ((Class12) this).anInt97) + i_371_;
					int i_378_ = (i_356_ << ((Class12) this).anInt97) + i_372_;
					((Class136) class136).aShortArray1878[i_370_] = (short) i_371_;
					((Class136) class136).aShortArray1876[i_370_] = (short) i_372_;
					((Class136) class136).aShortArray1872[i_370_] = (short) (this
							.method130(i_378_, i_377_, 52) + (is_357_ != null ? is_357_[i_370_]
							: 0));
					if (i_374_ < 0)
						i_374_ = 0;
					if (is_360_[i_370_] == 0) {
						((Class136) class136).anIntArray1874[i_370_] = 0;
						if (is_361_ != null)
							((Class136) class136).aByteArray1873[i_370_] = (byte) i_374_;
					} else {
						int i_379_ = 0;
						if (is_359_ != null) {
							int i_380_ = (((Class136) class136).aShortArray1868[i_370_] = (short) is_359_[i_370_]);
							if (i_365_ != 0) {
								i_379_ = 255 * i_380_ / i_365_;
								if (i_379_ < 0)
									i_379_ = 0;
								else if (i_379_ > 255)
									i_379_ = 255;
							}
						}
						int i_381_ = -16777216;
						if (is_362_[i_370_] != -1
								&& method2336(((Class188) (((Class163) aClass163_Sub1_5294).anInterface1_2118
										.method7((byte) 127, is_362_[i_370_]))).aByte2426))
							i_381_ = -1694498816;
						((Class136) class136).anIntArray1874[i_370_] = (i_381_ | Class191
								.method1237(
										i_379_,
										i_364_,
										method2334(((is_360_[i_370_]) >> 8),
												i_374_), -128));
						if (is_361_ != null)
							((Class136) class136).aByteArray1873[i_370_] = (byte) i_374_;
					}
					((Class136) class136).aShortArray1870[i_370_] = (short) is_362_[i_370_];
					((Class136) class136).aShortArray1869[i_370_] = (short) is_363_[i_370_];
				}
				if (is_361_ != null)
					((Class136) class136).anIntArray1877 = new int[((Class136) class136).aShort1871];
				for (int i_382_ = 0; i_382_ < ((Class136) class136).aShort1871; i_382_++) {
					int i_383_ = i_382_ * 3;
					if (is_361_ != null && is_361_[i_383_] != 0)
						((Class136) class136).anIntArray1877[i_382_] = ~0xffffff
								| is_361_[i_383_] >> 8;
				}
				aClass136ArrayArray5274[i][i_356_] = class136;
			} else {
				boolean bool_384_ = true;
				int i_385_ = -1;
				int i_386_ = -1;
				int i_387_ = -1;
				int i_388_ = -1;
				if (is.length == 6) {
					for (int i_389_ = 0; i_389_ < 6; i_389_++) {
						if (is[i_389_] == 0 && is_358_[i_389_] == 0) {
							if (i_385_ != -1
									&& is_360_[i_385_] != is_360_[i_389_]) {
								bool_384_ = false;
								break;
							}
							i_385_ = i_389_;
						} else if (is[i_389_] == ((Class12) this).anInt93
								&& is_358_[i_389_] == 0) {
							if (i_386_ != -1
									&& is_360_[i_386_] != is_360_[i_389_]) {
								bool_384_ = false;
								break;
							}
							i_386_ = i_389_;
						} else if (is[i_389_] == ((Class12) this).anInt93
								&& (is_358_[i_389_] == ((Class12) this).anInt93)) {
							if (i_387_ != -1
									&& is_360_[i_387_] != is_360_[i_389_]) {
								bool_384_ = false;
								break;
							}
							i_387_ = i_389_;
						} else if (is[i_389_] == 0
								&& (is_358_[i_389_] == ((Class12) this).anInt93)) {
							if (i_388_ != -1
									&& is_360_[i_388_] != is_360_[i_389_]) {
								bool_384_ = false;
								break;
							}
							i_388_ = i_389_;
						}
					}
					if (i_385_ == -1 || i_386_ == -1 || i_387_ == -1
							|| i_388_ == -1)
						bool_384_ = false;
					if (bool_384_) {
						if (is_357_ != null) {
							for (int i_390_ = 0; i_390_ < 4; i_390_++) {
								if (is_357_[i_390_] != 0) {
									bool_384_ = false;
									break;
								}
							}
						}
						if (bool_384_) {
							for (int i_391_ = 1; i_391_ < 4; i_391_++) {
								if (is[i_391_] != is[0]
										&& (is[i_391_] != is[0]
												+ ((Class12) this).anInt93)
										&& (is[i_391_] != is[0]
												- ((Class12) this).anInt93)) {
									bool_384_ = false;
									break;
								}
								if (is_358_[i_391_] != is_358_[0]
										&& (is_358_[i_391_] != (is_358_[0] + ((Class12) this).anInt93))
										&& (is_358_[i_391_] != (is_358_[0] - ((Class12) this).anInt93))) {
									bool_384_ = false;
									break;
								}
							}
						}
					}
				} else
					bool_384_ = false;
				if (bool_384_) {
					Class99 class99 = new Class99();
					int i_392_ = is_360_[0];
					int i_393_ = is_362_[0];
					if (is_361_ != null) {
						((Class99) class99).anInt1319 = is_361_[0] >> 8;
						if (i_392_ == 0)
							((Class99) class99).aByte1315 |= 0x2;
					} else if (i_392_ == 0)
						return;
					if ((((Class12) this).anIntArrayArray100[i][i_356_] == ((Class12) this).anIntArrayArray100[i + 1][i_356_])
							&& (((Class12) this).anIntArrayArray100[i][i_356_] == (((Class12) this).anIntArrayArray100[i + 1][i_356_ + 1]))
							&& (((Class12) this).anIntArrayArray100[i][i_356_] == (((Class12) this).anIntArrayArray100[i][i_356_ + 1])))
						((Class99) class99).aByte1315 |= 0x1;
					if (i_393_ != -1
							&& (((Class99) class99).aByte1315 & 0x2) == 0
							&& !(((Class188) ((Class163) aClass163_Sub1_5294).anInterface1_2118
									.method7((byte) 127, i_393_)).aBool2416)) {
						int i_394_;
						if (is_359_ != null && i_365_ != 0) {
							i_394_ = 255 * is_359_[i_385_] / i_365_;
							if (i_394_ < 0)
								i_394_ = 0;
							else if (i_394_ > 255)
								i_394_ = 255;
						} else
							i_394_ = 0;
						((Class99) class99).anInt1322 = (Class191
								.method1237(
										i_394_,
										i_364_,
										method2334(
												is_360_[i_385_] >> 8,
												(aByteArrayArray5273[i][i_356_] - aByteArrayArray5290[i][i_356_])),
										-112));
						if (((Class99) class99).anInt1319 != 0)
							((Class99) class99).anInt1322 |= (255 - (aByteArrayArray5273[i][i_356_] - aByteArrayArray5290[i][i_356_]) << 25);
						if (is_359_ != null && i_365_ != 0) {
							i_394_ = 255 * is_359_[i_386_] / i_365_;
							if (i_394_ < 0)
								i_394_ = 0;
							else if (i_394_ > 255)
								i_394_ = 255;
						} else
							i_394_ = 0;
						((Class99) class99).anInt1318 = (Class191
								.method1237(
										i_394_,
										i_364_,
										method2334(
												is_360_[i_386_] >> 8,
												(aByteArrayArray5273[i + 1][i_356_] - (aByteArrayArray5290[i + 1][i_356_]))),
										-76));
						if (((Class99) class99).anInt1319 != 0)
							((Class99) class99).anInt1318 |= 255 - (aByteArrayArray5273[i + 1][i_356_] - (aByteArrayArray5290[i + 1][i_356_])) << 25;
						if (is_359_ != null && i_365_ != 0) {
							i_394_ = 255 * is_359_[i_387_] / i_365_;
							if (i_394_ < 0)
								i_394_ = 0;
							else if (i_394_ > 255)
								i_394_ = 255;
						} else
							i_394_ = 0;
						((Class99) class99).anInt1312 = (Class191
								.method1237(
										i_394_,
										i_364_,
										method2334(
												is_360_[i_387_] >> 8,
												((aByteArrayArray5273[i + 1][i_356_ + 1]) - (aByteArrayArray5290[i + 1][i_356_ + 1]))),
										-67));
						if (((Class99) class99).anInt1319 != 0)
							((Class99) class99).anInt1312 |= (255 - (aByteArrayArray5273[i + 1][i_356_ + 1] - (aByteArrayArray5290[i + 1][i_356_ + 1]))) << 25;
						if (is_359_ != null && i_365_ != 0) {
							i_394_ = 255 * is_359_[i_388_] / i_365_;
							if (i_394_ < 0)
								i_394_ = 0;
							else if (i_394_ > 255)
								i_394_ = 255;
						} else
							i_394_ = 0;
						((Class99) class99).anInt1317 = (Class191
								.method1237(
										i_394_,
										i_364_,
										method2334(
												is_360_[i_388_] >> 8,
												(aByteArrayArray5273[i][i_356_ + 1] - (aByteArrayArray5290[i][i_356_ + 1]))),
										-95));
						((Class99) class99).aShort1316 = (short) i_393_;
					} else {
						int i_395_;
						if (is_359_ != null && i_365_ != 0) {
							i_395_ = 255 * is_359_[i_385_] / i_365_;
							if (i_395_ < 0)
								i_395_ = 0;
							else if (i_395_ > 255)
								i_395_ = 255;
						} else
							i_395_ = 0;
						((Class99) class99).anInt1322 = (Class191
								.method1237(
										i_395_,
										i_364_,
										method2334(
												is_360_[i_385_] >> 8,
												(aByteArrayArray5273[i][i_356_] - aByteArrayArray5290[i][i_356_])),
										-94));
						if (((Class99) class99).anInt1319 != 0)
							((Class99) class99).anInt1322 |= (255 - (aByteArrayArray5273[i][i_356_] - aByteArrayArray5290[i][i_356_]) << 25);
						if (is_359_ != null && i_365_ != 0) {
							i_395_ = 255 * is_359_[i_386_] / i_365_;
							if (i_395_ < 0)
								i_395_ = 0;
							else if (i_395_ > 255)
								i_395_ = 255;
						} else
							i_395_ = 0;
						((Class99) class99).anInt1318 = (Class191
								.method1237(
										i_395_,
										i_364_,
										method2334(
												is_360_[i_386_] >> 8,
												(aByteArrayArray5273[i + 1][i_356_] - (aByteArrayArray5290[i + 1][i_356_]))),
										-83));
						if (((Class99) class99).anInt1319 != 0)
							((Class99) class99).anInt1318 |= 255 - (aByteArrayArray5273[i + 1][i_356_] - (aByteArrayArray5290[i + 1][i_356_])) << 25;
						if (is_359_ != null && i_365_ != 0) {
							i_395_ = 255 * is_359_[i_387_] / i_365_;
							if (i_395_ < 0)
								i_395_ = 0;
							else if (i_395_ > 255)
								i_395_ = 255;
						} else
							i_395_ = 0;
						((Class99) class99).anInt1312 = (Class191
								.method1237(
										i_395_,
										i_364_,
										method2334(
												is_360_[i_387_] >> 8,
												((aByteArrayArray5273[i + 1][i_356_ + 1]) - (aByteArrayArray5290[i + 1][i_356_ + 1]))),
										-117));
						if (((Class99) class99).anInt1319 != 0)
							((Class99) class99).anInt1312 |= (255 - (aByteArrayArray5273[i + 1][i_356_ + 1] - (aByteArrayArray5290[i + 1][i_356_ + 1]))) << 25;
						if (is_359_ != null && i_365_ != 0) {
							i_395_ = 255 * is_359_[i_388_] / i_365_;
							if (i_395_ < 0)
								i_395_ = 0;
							else if (i_395_ > 255)
								i_395_ = 255;
						} else
							i_395_ = 0;
						((Class99) class99).anInt1317 = (Class191
								.method1237(
										i_395_,
										i_364_,
										method2334(
												is_360_[i_388_] >> 8,
												(aByteArrayArray5273[i][i_356_ + 1] - (aByteArrayArray5290[i][i_356_ + 1]))),
										-45));
						if (((Class99) class99).anInt1319 != 0)
							((Class99) class99).anInt1317 |= 255 - (aByteArrayArray5273[i][i_356_ + 1] - (aByteArrayArray5290[i][i_356_ + 1])) << 25;
						((Class99) class99).aShort1316 = (short) -1;
					}
					if (is_359_ != null) {
						((Class99) class99).aShort1321 = (short) is_359_[i_387_];
						((Class99) class99).aShort1314 = (short) is_359_[i_388_];
						((Class99) class99).aShort1320 = (short) is_359_[i_386_];
						((Class99) class99).aShort1313 = (short) is_359_[i_385_];
					}
					aClass99ArrayArray5287[i][i_356_] = class99;
				} else {
					Class241 class241 = new Class241();
					((Class241) class241).aShort3276 = (short) is.length;
					((Class241) class241).aShort3274 = (short) (is.length / 3);
					((Class241) class241).aShortArray3271 = new short[((Class241) class241).aShort3276];
					((Class241) class241).aShortArray3275 = new short[((Class241) class241).aShort3276];
					((Class241) class241).aShortArray3267 = new short[((Class241) class241).aShort3276];
					((Class241) class241).anIntArray3270 = new int[((Class241) class241).aShort3276];
					if (is_359_ != null)
						((Class241) class241).aShortArray3273 = new short[((Class241) class241).aShort3276];
					for (int i_396_ = 0; i_396_ < ((Class241) class241).aShort3276; i_396_++) {
						int i_397_ = is[i_396_];
						int i_398_ = is_358_[i_396_];
						boolean bool_399_ = false;
						int i_400_;
						if (i_397_ == 0 && i_398_ == 0)
							i_400_ = (aByteArrayArray5273[i][i_356_] - aByteArrayArray5290[i][i_356_]);
						else if (i_397_ == 0
								&& i_398_ == ((Class12) this).anInt93)
							i_400_ = (aByteArrayArray5273[i][i_356_ + 1] - aByteArrayArray5290[i][i_356_ + 1]);
						else if (i_397_ == ((Class12) this).anInt93
								&& i_398_ == ((Class12) this).anInt93)
							i_400_ = (aByteArrayArray5273[i + 1][i_356_ + 1] - aByteArrayArray5290[i + 1][i_356_ + 1]);
						else if (i_397_ == ((Class12) this).anInt93
								&& i_398_ == 0)
							i_400_ = (aByteArrayArray5273[i + 1][i_356_] - aByteArrayArray5290[i + 1][i_356_]);
						else {
							int i_401_ = (((aByteArrayArray5273[i][i_356_] - aByteArrayArray5290[i][i_356_]) * (((Class12) this).anInt93 - i_397_)) + ((aByteArrayArray5273[i + 1][i_356_] - aByteArrayArray5290[i + 1][i_356_]) * i_397_));
							int i_402_ = (((aByteArrayArray5273[i][i_356_ + 1] - aByteArrayArray5290[i][i_356_ + 1]) * (((Class12) this).anInt93 - i_397_)) + (aByteArrayArray5273[i + 1][i_356_ + 1] - (aByteArrayArray5290[i + 1][i_356_ + 1]))
									* i_397_);
							i_400_ = (i_401_
									* (((Class12) this).anInt93 - i_398_)
									+ i_402_ * i_398_ >> 2 * ((Class12) this).anInt97);
						}
						int i_403_ = (i << ((Class12) this).anInt97) + i_397_;
						int i_404_ = (i_356_ << ((Class12) this).anInt97)
								+ i_398_;
						((Class241) class241).aShortArray3271[i_396_] = (short) i_397_;
						((Class241) class241).aShortArray3267[i_396_] = (short) i_398_;
						((Class241) class241).aShortArray3275[i_396_] = (short) (this
								.method130(i_404_, i_403_, -123) + (is_357_ != null ? is_357_[i_396_]
								: 0));
						if (i_400_ < 0)
							i_400_ = 0;
						if (is_360_[i_396_] == 0) {
							if (is_361_ != null)
								((Class241) class241).anIntArray3270[i_396_] = i_400_ << 25;
							else
								((Class241) class241).anIntArray3270[i_396_] = 0;
						} else {
							int i_405_ = 0;
							if (is_359_ != null) {
								int i_406_ = (((Class241) class241).aShortArray3273[i_396_] = (short) is_359_[i_396_]);
								if (i_365_ != 0) {
									i_405_ = 255 * i_406_ / i_365_;
									if (i_405_ < 0)
										i_405_ = 0;
									else if (i_405_ > 255)
										i_405_ = 255;
								}
							}
							((Class241) class241).anIntArray3270[i_396_] = Class191
									.method1237(
											i_405_,
											i_364_,
											method2334(
													((is_360_[i_396_]) >> 8),
													i_400_), -80);
							if (is_361_ != null)
								((Class241) class241).anIntArray3270[i_396_] |= i_400_ << 25;
						}
					}
					boolean bool_407_ = false;
					for (int i_408_ = 0; i_408_ < ((Class241) class241).aShort3274; i_408_++) {
						if (is_362_[i_408_ * 3] != -1
								&& !((Class188) (((Class163) aClass163_Sub1_5294).anInterface1_2118
										.method7((byte) 127,
												is_362_[i_408_ * 3]))).aBool2416)
							bool_407_ = true;
					}
					if (is_361_ != null)
						((Class241) class241).anIntArray3269 = new int[((Class241) class241).aShort3274];
					if (bool_407_) {
						((Class241) class241).aShortArray3277 = new short[((Class241) class241).aShort3274];
						((Class241) class241).aShortArray3272 = new short[((Class241) class241).aShort3274];
					}
					for (int i_409_ = 0; i_409_ < ((Class241) class241).aShort3274; i_409_++) {
						int i_410_ = i_409_ * 3;
						if (is_361_ != null && is_361_[i_410_] != 0)
							((Class241) class241).anIntArray3269[i_409_] = is_361_[i_410_] >> 8;
						if (bool_407_) {
							int i_411_ = i_410_ + 1;
							int i_412_ = i_411_ + 1;
							boolean bool_413_ = false;
							boolean bool_414_ = true;
							int i_415_ = is_362_[i_410_];
							if (i_415_ == -1
									|| (((Class188) ((Class163) aClass163_Sub1_5294).anInterface1_2118
											.method7((byte) 127, i_415_)).aBool2416))
								bool_414_ = false;
							else
								bool_413_ = true;
							i_415_ = is_362_[i_411_];
							if (i_415_ == -1
									|| (((Class188) ((Class163) aClass163_Sub1_5294).anInterface1_2118
											.method7((byte) 127, i_415_)).aBool2416))
								bool_414_ = false;
							else
								bool_413_ = true;
							i_415_ = is_362_[i_412_];
							if (i_415_ == -1
									|| (((Class188) ((Class163) aClass163_Sub1_5294).anInterface1_2118
											.method7((byte) 127, i_415_)).aBool2416))
								bool_414_ = false;
							else
								bool_413_ = true;
							if (bool_414_) {
								((Class241) class241).aShortArray3277[i_409_] = (short) i_415_;
								((Class241) class241).aShortArray3272[i_409_] = (short) is_363_[i_410_];
							} else {
								if (bool_413_) {
									i_415_ = is_362_[i_410_];
									if (i_415_ != -1
											&& !(((Class188) ((Class163) aClass163_Sub1_5294).anInterface1_2118
													.method7((byte) 127, i_415_)).aBool2416))
										((Class241) class241).anIntArray3270[i_410_] = (Class219_Sub1.anIntArray7248[((Class147
												.method942(
														0,
														(((Class188) (((Class163) aClass163_Sub1_5294).anInterface1_2118
																.method7(
																		(byte) 127,
																		i_415_))).aShort2413) & 0xffff)) & 0xffff)]);
									i_415_ = is_362_[i_411_];
									if (i_415_ != -1
											&& !(((Class188) ((Class163) aClass163_Sub1_5294).anInterface1_2118
													.method7((byte) 127, i_415_)).aBool2416))
										((Class241) class241).anIntArray3270[i_411_] = (Class219_Sub1.anIntArray7248[((Class147
												.method942(
														0,
														(((Class188) (((Class163) aClass163_Sub1_5294).anInterface1_2118
																.method7(
																		(byte) 127,
																		i_415_))).aShort2413) & 0xffff)) & 0xffff)]);
									i_415_ = is_362_[i_412_];
									if (i_415_ != -1
											&& !(((Class188) ((Class163) aClass163_Sub1_5294).anInterface1_2118
													.method7((byte) 127, i_415_)).aBool2416))
										((Class241) class241).anIntArray3270[i_412_] = (Class219_Sub1.anIntArray7248[((Class147
												.method942(
														0,
														(((Class188) (((Class163) aClass163_Sub1_5294).anInterface1_2118
																.method7(
																		(byte) 127,
																		i_415_))).aShort2413) & 0xffff)) & 0xffff)]);
								}
								((Class241) class241).aShortArray3277[i_409_] = (short) -1;
							}
						}
					}
					aClass241ArrayArray5276[i][i_356_] = class241;
				}
			}
		}
	}

	final void CA(Class11_Sub45_Sub1 class11_sub45_sub1, int i, int i_416_,
			int i_417_, int i_418_, boolean bool) {
		/* empty */
	}

	final void method135(int i, int i_419_, int i_420_, boolean[][] bools,
			boolean bool, int i_421_, int i_422_) {
		Class33_Sub3 class33_sub3 = ((Class163_Sub1) aClass163_Sub1_5294).aClass33_Sub3_5207;
		anInt5280 = i_421_;
		aFloat5282 = ((Class33_Sub3) class33_sub3).aFloat7164;
		aFloat5285 = ((Class33_Sub3) class33_sub3).aFloat7195;
		aFloat5275 = ((Class33_Sub3) class33_sub3).aFloat7193;
		aFloat5291 = ((Class33_Sub3) class33_sub3).aFloat7197;
		aFloat5279 = ((Class33_Sub3) class33_sub3).aFloat7179;
		aFloat5288 = ((Class33_Sub3) class33_sub3).aFloat7186;
		aFloat5286 = ((Class33_Sub3) class33_sub3).aFloat7182;
		aFloat5289 = ((Class33_Sub3) class33_sub3).aFloat7190;
		aFloat5283 = ((Class33_Sub3) class33_sub3).aFloat7196;
		aFloat5281 = ((Class33_Sub3) class33_sub3).aFloat7185;
		aFloat5278 = ((Class33_Sub3) class33_sub3).aFloat7166;
		aFloat5284 = ((Class33_Sub3) class33_sub3).aFloat7175;
		for (int i_423_ = 0; i_423_ < i_420_ + i_420_; i_423_++) {
			for (int i_424_ = 0; i_424_ < i_420_ + i_420_; i_424_++) {
				if (bools[i_423_][i_424_]) {
					int i_425_ = i - i_420_ + i_423_;
					int i_426_ = i_419_ - i_420_ + i_424_;
					if (i_425_ >= 0 && i_425_ < ((Class12) this).anInt103
							&& i_426_ >= 0 && i_426_ < ((Class12) this).anInt98)
						method2330(i_425_, i_426_, i_422_);
				}
			}
		}
	}

	final void ka(int i, int i_427_, int i_428_) {
		if (aByteArrayArray5290[i][i_427_] < i_428_)
			aByteArrayArray5290[i][i_427_] = (byte) i_428_;
	}

	private final void method2335(int i, int i_429_, int i_430_, int i_431_,
			int i_432_, int i_433_, int i_434_, boolean[][] bools,
			Class363 class363, Class296 class296, int[] is, int[] is_435_) {
		int i_436_ = (i_434_ - i_432_) * i_430_ / 256;
		int i_437_ = i_430_ >> 8;
		boolean bool = ((Class363) class363).aBool4731;
		aClass163_Sub1_5294.C(false);
		((Class296) class296).aBool4003 = false;
		((Class296) class296).aBool3992 = false;
		int i_438_ = i;
		int i_439_ = i_429_ + i_436_;
		for (int i_440_ = i_431_; i_440_ < i_433_; i_440_++) {
			for (int i_441_ = i_432_; i_441_ < i_434_; i_441_++) {
				if (bools[i_440_ - i_431_][i_441_ - i_432_]) {
					if (aClass158ArrayArray5292[i_440_][i_441_] != null) {
						Class158 class158 = aClass158ArrayArray5292[i_440_][i_441_];
						if (((Class158) class158).aShort2067 != -1
								&& (((Class158) class158).aByte2066 & 0x2) == 0
								&& ((Class158) class158).anInt2068 == -1) {
							int i_442_ = aClass163_Sub1_5294
									.method2294(((Class158) class158).aShort2067);
							class296.method1841(
									(float) (i_439_ - i_437_),
									(float) (i_439_ - i_437_),
									(float) i_439_,
									(float) (i_438_ + i_437_),
									(float) i_438_,
									(float) (i_438_ + i_437_),
									100.0F,
									100.0F,
									100.0F,
									(float) Class2_Sub9
											.method2949(
													((((Class158) class158).aShort2070) & 0xffff),
													i_442_, (byte) -89),
									(float) Class2_Sub9
											.method2949(
													((((Class158) class158).aShort2065) & 0xffff),
													i_442_, (byte) -79),
									(float) Class2_Sub9
											.method2949(
													((((Class158) class158).aShort2069) & 0xffff),
													i_442_, (byte) -99));
							class296.method1841(
									(float) i_439_,
									(float) i_439_,
									(float) (i_439_ - i_437_),
									(float) i_438_,
									(float) (i_438_ + i_437_),
									(float) i_438_,
									100.0F,
									100.0F,
									100.0F,
									(float) Class2_Sub9
											.method2949(
													((((Class158) class158).aShort2071) & 0xffff),
													i_442_, (byte) -107),
									(float) Class2_Sub9
											.method2949(
													((((Class158) class158).aShort2069) & 0xffff),
													i_442_, (byte) -94),
									(float) Class2_Sub9
											.method2949(
													((((Class158) class158).aShort2065) & 0xffff),
													i_442_, (byte) -110));
						} else if (((Class158) class158).anInt2068 == -1) {
							class296.method1841(
									(float) (i_439_ - i_437_),
									(float) (i_439_ - i_437_),
									(float) i_439_,
									(float) (i_438_ + i_437_),
									(float) i_438_,
									(float) (i_438_ + i_437_),
									100.0F,
									100.0F,
									100.0F,
									(float) (((Class158) class158).aShort2070 & 0xffff),
									(float) (((Class158) class158).aShort2065 & 0xffff),
									(float) (((Class158) class158).aShort2069 & 0xffff));
							class296.method1841(
									(float) i_439_,
									(float) i_439_,
									(float) (i_439_ - i_437_),
									(float) i_438_,
									(float) (i_438_ + i_437_),
									(float) i_438_,
									100.0F,
									100.0F,
									100.0F,
									(float) (((Class158) class158).aShort2071 & 0xffff),
									(float) (((Class158) class158).aShort2069 & 0xffff),
									(float) (((Class158) class158).aShort2065 & 0xffff));
						} else {
							int i_443_ = ((Class158) class158).anInt2068;
							class296.method1841((float) (i_439_ - i_437_),
									(float) (i_439_ - i_437_), (float) i_439_,
									(float) (i_438_ + i_437_), (float) i_438_,
									(float) (i_438_ + i_437_), 100.0F, 100.0F,
									100.0F, (float) i_443_, (float) i_443_,
									(float) i_443_);
							class296.method1841((float) i_439_, (float) i_439_,
									(float) (i_439_ - i_437_), (float) i_438_,
									(float) (i_438_ + i_437_), (float) i_438_,
									100.0F, 100.0F, 100.0F, (float) i_443_,
									(float) i_443_, (float) i_443_);
						}
					} else if (aClass252ArrayArray5277[i_440_][i_441_] != null) {
						Class252 class252 = aClass252ArrayArray5277[i_440_][i_441_];
						for (int i_444_ = 0; i_444_ < ((Class252) class252).aShort3469; i_444_++) {
							is[i_444_] = i_438_
									+ ((((Class252) class252).aShortArray3468[i_444_])
											* i_437_ / ((Class12) this).anInt93);
							is_435_[i_444_] = i_439_
									- ((((Class252) class252).aShortArray3466[i_444_])
											* i_437_ / ((Class12) this).anInt93);
						}
						for (int i_445_ = 0; i_445_ < ((Class252) class252).aShort3470; i_445_++) {
							short i_446_ = (((Class252) class252).aShortArray3479[i_445_]);
							short i_447_ = (((Class252) class252).aShortArray3477[i_445_]);
							short i_448_ = (((Class252) class252).aShortArray3476[i_445_]);
							int i_449_ = is[i_446_];
							int i_450_ = is[i_447_];
							int i_451_ = is[i_448_];
							int i_452_ = is_435_[i_446_];
							int i_453_ = is_435_[i_447_];
							int i_454_ = is_435_[i_448_];
							if (((Class252) class252).anIntArray3471 != null
									&& (((Class252) class252).anIntArray3471[i_445_]) != -1) {
								int i_455_ = (((Class252) class252).anIntArray3471[i_445_]);
								class296.method1841(
										(float) i_452_,
										(float) i_453_,
										(float) i_454_,
										(float) i_449_,
										(float) i_450_,
										(float) i_451_,
										100.0F,
										100.0F,
										100.0F,
										(float) (Class2_Sub9
												.method2949(
														(((Class252) class252).aShortArray3472[i_446_]),
														i_455_, (byte) -123)),
										(float) (Class2_Sub9
												.method2949(
														(((Class252) class252).aShortArray3472[i_447_]),
														i_455_, (byte) -67)),
										(float) (Class2_Sub9
												.method2949(
														(((Class252) class252).aShortArray3472[i_448_]),
														i_455_, (byte) -100)));
							} else if ((((Class252) class252).aShortArray3473 != null)
									&& (((Class252) class252).aShortArray3473[i_445_]) != -1) {
								int i_456_ = (aClass163_Sub1_5294
										.method2294(((Class252) class252).aShortArray3473[i_445_]));
								class296.method1841(
										(float) i_452_,
										(float) i_453_,
										(float) i_454_,
										(float) i_449_,
										(float) i_450_,
										(float) i_451_,
										100.0F,
										100.0F,
										100.0F,
										(float) (Class2_Sub9
												.method2949(
														(((Class252) class252).aShortArray3472[i_446_]),
														i_456_, (byte) -122)),
										(float) (Class2_Sub9
												.method2949(
														(((Class252) class252).aShortArray3472[i_447_]),
														i_456_, (byte) -86)),
										(float) (Class2_Sub9
												.method2949(
														(((Class252) class252).aShortArray3472[i_448_]),
														i_456_, (byte) -126)));
							} else {
								int i_457_ = (((Class252) class252).anIntArray3474[i_445_]);
								class296.method1841(
										(float) i_452_,
										(float) i_453_,
										(float) i_454_,
										(float) i_449_,
										(float) i_450_,
										(float) i_451_,
										100.0F,
										100.0F,
										100.0F,
										(float) (Class2_Sub9
												.method2949(
														(((Class252) class252).aShortArray3472[i_446_]),
														i_457_, (byte) -105)),
										(float) (Class2_Sub9
												.method2949(
														(((Class252) class252).aShortArray3472[i_447_]),
														i_457_, (byte) -120)),
										(float) (Class2_Sub9
												.method2949(
														(((Class252) class252).aShortArray3472[i_448_]),
														i_457_, (byte) -83)));
							}
						}
					}
				}
				i_439_ -= i_437_;
			}
			i_439_ = i_429_ + i_436_;
			i_438_ += i_437_;
		}
		((Class296) class296).aBool4003 = true;
		aClass163_Sub1_5294.C(bool);
	}

	private final boolean method2336(int i) {
		if ((anInt5293 & 0x8) == 0)
			return false;
		if (i == 4)
			return true;
		if (i == 8)
			return true;
		if (i == 9)
			return true;
		return false;
	}

	final void method132(int i, int i_458_, int i_459_, boolean[][] bools,
			boolean bool, int i_460_) {
		Class33_Sub3 class33_sub3 = ((Class163_Sub1) aClass163_Sub1_5294).aClass33_Sub3_5207;
		anInt5280 = -1;
		aFloat5282 = ((Class33_Sub3) class33_sub3).aFloat7164;
		aFloat5285 = ((Class33_Sub3) class33_sub3).aFloat7195;
		aFloat5275 = ((Class33_Sub3) class33_sub3).aFloat7193;
		aFloat5291 = ((Class33_Sub3) class33_sub3).aFloat7197;
		aFloat5279 = ((Class33_Sub3) class33_sub3).aFloat7179;
		aFloat5288 = ((Class33_Sub3) class33_sub3).aFloat7186;
		aFloat5286 = ((Class33_Sub3) class33_sub3).aFloat7182;
		aFloat5289 = ((Class33_Sub3) class33_sub3).aFloat7190;
		aFloat5283 = ((Class33_Sub3) class33_sub3).aFloat7196;
		aFloat5281 = ((Class33_Sub3) class33_sub3).aFloat7185;
		aFloat5278 = ((Class33_Sub3) class33_sub3).aFloat7166;
		aFloat5284 = ((Class33_Sub3) class33_sub3).aFloat7175;
		for (int i_461_ = 0; i_461_ < i_459_ + i_459_; i_461_++) {
			for (int i_462_ = 0; i_462_ < i_459_ + i_459_; i_462_++) {
				if (bools[i_461_][i_462_]) {
					int i_463_ = i - i_459_ + i_461_;
					int i_464_ = i_458_ - i_459_ + i_462_;
					if (i_463_ >= 0 && i_463_ < ((Class12) this).anInt103
							&& i_464_ >= 0 && i_464_ < ((Class12) this).anInt98)
						method2330(i_463_, i_464_, i_460_);
				}
			}
		}
	}

	private final void method2337(int i, int i_465_, boolean bool,
			Class363 class363, Class296 class296, int[] is, int[] is_466_,
			int[] is_467_, int[] is_468_, int i_469_) {
		Class136 class136 = aClass136ArrayArray5274[i][i_465_];
		if (i_469_ == 0 || (i_469_ & 0x2) == 0) {
			if (class136 != null) {
				if (anInt5280 == -1) {
					for (int i_470_ = 0; i_470_ < ((Class136) class136).aShort1875; i_470_++) {
						int i_471_ = (((Class136) class136).aShortArray1878[i_470_] + (i << ((Class12) this).anInt97));
						int i_472_ = ((Class136) class136).aShortArray1872[i_470_];
						int i_473_ = (((Class136) class136).aShortArray1876[i_470_] + (i_465_ << ((Class12) this).anInt97));
						float f = aFloat5284
								+ (aFloat5283 * (float) i_471_ + aFloat5281
										* (float) i_472_ + aFloat5278
										* (float) i_473_);
						if (f <= (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5200))
							return;
						is_468_[i_470_] = 0;
						if (bool) {
							int i_474_ = (int) (f - (float) (((Class363) class363).anInt4724));
							if (i_474_ > 255)
								i_474_ = 255;
							if (i_474_ > 0) {
								is_468_[i_470_] = i_474_;
								int i_475_ = ((((Class136) class136).aShortArray1868[i_470_])
										* i_474_ / 255);
								if (i_475_ > 0)
									i_472_ -= i_475_;
							}
						} else if (((Class363) class363).aBool4723) {
							int i_476_ = (int) (f - (float) (((Class363) class363).anInt4724));
							if (i_476_ > 0) {
								is_468_[i_470_] = i_476_;
								if (is_468_[i_470_] > 255)
									is_468_[i_470_] = 255;
							}
						}
						float f_477_ = aFloat5291
								+ (aFloat5282 * (float) i_471_ + aFloat5285
										* (float) i_472_ + aFloat5275
										* (float) i_473_);
						float f_478_ = aFloat5289
								+ (aFloat5279 * (float) i_471_ + aFloat5288
										* (float) i_472_ + aFloat5286
										* (float) i_473_);
						is[i_470_] = (((Class296) class296).anInt3993 + (int) (f_477_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / f));
						is_466_[i_470_] = (((Class296) class296).anInt4000 + (int) (f_478_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / f));
						is_467_[i_470_] = (int) f;
					}
				} else {
					for (int i_479_ = 0; i_479_ < ((Class136) class136).aShort1875; i_479_++) {
						int i_480_ = (((Class136) class136).aShortArray1878[i_479_] + (i << ((Class12) this).anInt97));
						int i_481_ = ((Class136) class136).aShortArray1872[i_479_];
						int i_482_ = (((Class136) class136).aShortArray1876[i_479_] + (i_465_ << ((Class12) this).anInt97));
						float f = aFloat5284
								+ (aFloat5283 * (float) i_480_ + aFloat5281
										* (float) i_481_ + aFloat5278
										* (float) i_482_);
						is_468_[i_479_] = 0;
						if (bool) {
							int i_483_ = anInt5280
									- ((Class363) class363).anInt4724;
							if (i_483_ > 255)
								i_483_ = 255;
							if (i_483_ > 0) {
								is_468_[i_479_] = i_483_;
								int i_484_ = ((((Class136) class136).aShortArray1868[i_479_])
										* i_483_ / 255);
								if (i_484_ > 0)
									i_481_ -= i_484_;
							}
						} else if (((Class363) class363).aBool4723) {
							int i_485_ = anInt5280
									- ((Class363) class363).anInt4724;
							if (i_485_ > 0) {
								is_468_[i_479_] = i_485_;
								if (is_468_[i_479_] > 255)
									is_468_[i_479_] = 255;
							}
						}
						float f_486_ = aFloat5291
								+ (aFloat5282 * (float) i_480_ + aFloat5285
										* (float) i_481_ + aFloat5275
										* (float) i_482_);
						float f_487_ = aFloat5289
								+ (aFloat5279 * (float) i_480_ + aFloat5288
										* (float) i_481_ + aFloat5286
										* (float) i_482_);
						is[i_479_] = (((Class296) class296).anInt3993 + (int) (f_486_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5215) / (float) anInt5280));
						is_466_[i_479_] = (((Class296) class296).anInt4000 + (int) (f_487_
								* (float) (((Class163_Sub1) aClass163_Sub1_5294).anInt5205) / (float) anInt5280));
						is_467_[i_479_] = (int) f;
					}
				}
				float f = (float) ((Class12) this).anInt93;
				for (int i_488_ = 0; i_488_ < ((Class136) class136).aShort1871; i_488_++) {
					int i_489_ = i_488_ * 3;
					int i_490_ = i_489_ + 1;
					int i_491_ = i_490_ + 1;
					int i_492_ = is[i_489_];
					int i_493_ = is[i_490_];
					int i_494_ = is[i_491_];
					int i_495_ = is_466_[i_489_];
					int i_496_ = is_466_[i_490_];
					int i_497_ = is_466_[i_491_];
					if (((i_492_ - i_493_) * (i_497_ - i_496_) - (i_495_ - i_496_)
							* (i_494_ - i_493_)) > 0) {
						((Class296) class296).aBool4001 = (i_492_ < 0
								|| i_493_ < 0 || i_494_ < 0
								|| i_492_ > ((Class296) class296).anInt3995
								|| i_493_ > ((Class296) class296).anInt3995 || i_494_ > ((Class296) class296).anInt3995);
						if (is_468_[i_489_] + is_468_[i_490_] + is_468_[i_491_] < 765) {
							int i_498_ = i << ((Class12) this).anInt97;
							int i_499_ = i_465_ << ((Class12) this).anInt97;
							if ((((Class136) class136).anIntArray1874[i_489_] & 0xffffff) != 0) {
								if (((((Class136) class136).aShortArray1870[i_489_]) == (((Class136) class136).aShortArray1870[i_490_]))
										&& ((((Class136) class136).aShortArray1870[i_489_]) == (((Class136) class136).aShortArray1870[i_491_]))
										&& ((((Class136) class136).aShortArray1869[i_489_]) == (((Class136) class136).aShortArray1869[i_490_]))
										&& ((((Class136) class136).aShortArray1869[i_489_]) == (((Class136) class136).aShortArray1869[i_491_])))
									class296.method1845(
											(float) i_495_,
											(float) i_496_,
											(float) i_497_,
											(float) i_492_,
											(float) i_493_,
											(float) i_494_,
											(float) is_467_[i_489_],
											(float) is_467_[i_490_],
											(float) is_467_[i_491_],
											((float) (i_498_ + (((Class136) class136).aShortArray1878[i_489_])) / (float) (((Class136) class136).aShortArray1869[i_489_])),
											((float) (i_498_ + (((Class136) class136).aShortArray1878[i_490_])) / (float) (((Class136) class136).aShortArray1869[i_490_])),
											((float) (i_498_ + (((Class136) class136).aShortArray1878[i_491_])) / (float) (((Class136) class136).aShortArray1869[i_491_])),
											((float) (i_499_ + (((Class136) class136).aShortArray1876[i_489_])) / (float) (((Class136) class136).aShortArray1869[i_489_])),
											((float) (i_499_ + (((Class136) class136).aShortArray1876[i_490_])) / (float) (((Class136) class136).aShortArray1869[i_490_])),
											((float) (i_499_ + (((Class136) class136).aShortArray1876[i_491_])) / (float) (((Class136) class136).aShortArray1869[i_491_])),
											(((Class136) class136).anIntArray1874[i_489_]),
											(((Class136) class136).anIntArray1874[i_490_]),
											(((Class136) class136).anIntArray1874[i_491_]),
											((Class363) class363).anInt4726,
											is_468_[i_489_],
											is_468_[i_490_],
											is_468_[i_491_],
											(((Class136) class136).aShortArray1870[i_489_]));
								else
									class296.method1833(
											(float) i_495_,
											(float) i_496_,
											(float) i_497_,
											(float) i_492_,
											(float) i_493_,
											(float) i_494_,
											(float) is_467_[i_489_],
											(float) is_467_[i_490_],
											(float) is_467_[i_491_],
											(float) (i_498_ + (((Class136) class136).aShortArray1878[i_489_]))
													/ f,
											(float) (i_498_ + (((Class136) class136).aShortArray1878[i_490_]))
													/ f,
											(float) (i_498_ + (((Class136) class136).aShortArray1878[i_491_]))
													/ f,
											(float) (i_499_ + (((Class136) class136).aShortArray1876[i_489_]))
													/ f,
											(float) (i_499_ + (((Class136) class136).aShortArray1876[i_490_]))
													/ f,
											(float) (i_499_ + (((Class136) class136).aShortArray1876[i_491_]))
													/ f,
											(((Class136) class136).anIntArray1874[i_489_]),
											(((Class136) class136).anIntArray1874[i_490_]),
											(((Class136) class136).anIntArray1874[i_491_]),
											((Class363) class363).anInt4726,
											is_468_[i_489_],
											is_468_[i_490_],
											is_468_[i_491_],
											(((Class136) class136).aShortArray1870[i_489_]),
											f
													/ (float) (((Class136) class136).aShortArray1869[i_489_]),
											(((Class136) class136).aShortArray1870[i_490_]),
											f
													/ (float) (((Class136) class136).aShortArray1869[i_490_]),
											(((Class136) class136).aShortArray1870[i_491_]),
											f
													/ (float) (((Class136) class136).aShortArray1869[i_491_]));
							}
						} else
							class296.method1834((float) i_495_, (float) i_496_,
									(float) i_497_, (float) i_492_,
									(float) i_493_, (float) i_494_,
									(float) is_467_[i_489_],
									(float) is_467_[i_490_],
									(float) is_467_[i_491_],
									(((Class363) class363).anInt4726));
					}
				}
			}
		}
	}
}
