/* Class224 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Dimension;

final class Class224 {
	boolean aBool3073 = false;
	static int anInt3074;
	byte aByte3075;
	static int anInt3076;
	private short[] aShortArray3077;
	private int anInt3078;
	int anInt3079 = -1;
	private short[] aShortArray3080;
	static int anInt3081;
	private int anInt3082 = 128;
	private int anInt3083;
	Class227 aClass227_3084;
	private int anInt3085;
	private int anInt3086;
	static int anInt3087;
	static int anInt3088;
	private int anInt3089;
	private int anInt3090;
	int anInt3091;
	static int anInt3092;
	static int anInt3093;
	private short[] aShortArray3094;
	static int anInt3095;
	private short[] aShortArray3096;

	final Class206 method1431(int i, Class198 class198, Class163 class163,
			int i_0_, int i_1_, int i_2_, byte i_3_) {
		try {
			int i_4_ = 78 % ((i_3_ - 9) / 54);
			anInt3095++;
			return method1435(i_1_, 0, i_0_, 0, (byte) 5, i, class163, 0,
					false, 748, class198, null, i_2_, null);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lo.B(" + i + ','
					+ (class198 != null ? "{...}" : "null") + ','
					+ (class163 != null ? "{...}" : "null") + ',' + i_0_ + ','
					+ i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	final void method1432(int i, Stream stream) {
		try {
			for (;;) {
				int i_5_ = stream.readUnsignedByte((byte) 35);
				if ((i_5_ ^ 0xffffffff) == -1)
					break;
				method1434(stream, i_5_, true);
			}
			anInt3076++;
			int i_6_ = -3 / ((i + 34) / 40);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lo.C(" + i + ','
					+ (stream != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1433(byte i, byte[][] is,
			Class286_Sub1 class286_sub1) {
		try {
			anInt3074++;
			int i_7_ = 9 / ((26 - i) / 49);
			int[] is_8_ = { -1, 0, 0, 0, 0 };
			int i_9_ = is.length;
			for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
				byte[] is_11_ = is[i_10_];
				if (is_11_ != null) {
					Stream stream = new Stream(is_11_);
					int i_12_ = Class183.anIntArray2362[i_10_] >> 8;
					int i_13_ = 0xff & Class183.anIntArray2362[i_10_];
					int i_14_ = i_12_ * 64 - Class194.anInt2641;
					int i_15_ = -Class118.anInt1605 + i_13_ * 64;
					Class34.method304((byte) 78);
					class286_sub1.method1769(stream, i_15_, i_14_, 0,
							Class118.anInt1605, Class235.aClass338Array3217,
							Class194.anInt2641);
					class286_sub1.method2908(stream, -122, is_8_,
							Class321_Sub2.aClass163_6648, i_15_, i_14_);
					if (!((Class286) class286_sub1).aBool3870
							&& (i_12_ ^ 0xffffffff) == (Class350.anInt4617 / 8 ^ 0xffffffff)
							&& Class376_Sub7_Sub3_Sub1.anInt9867 / 8 == i_13_
							&& (is_8_[0] ^ 0xffffffff) != 0) {
						Class108_Sub18.aClass141_6924 = (Class233.aClass379_3181
								.method2225(is_8_[1], 4,
										Class179.aClass154_2279, is_8_[2],
										is_8_[3], is_8_[0]));
						Class11_Sub45_Sub9.anInt8878 = is_8_[4];
					}
				}
			}
			for (int i_16_ = 0; (i_9_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++) {
				int i_17_ = (-Class194.anInt2641 + (Class183.anIntArray2362[i_16_] >> 8) * 64);
				int i_18_ = (-Class118.anInt1605 + 64 * (Class183.anIntArray2362[i_16_] & 0xff));
				byte[] is_19_ = is[i_16_];
				if (is_19_ == null && Class376_Sub7_Sub3_Sub1.anInt9867 < 800) {
					Class34.method304((byte) 119);
					class286_sub1.method1776(i_18_, 64, i_17_, 64, (byte) 116);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lo.F(" + i + ','
					+ (is != null ? "{...}" : "null") + ','
					+ (class286_sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method1434(Stream stream, int i, boolean bool) {
		try {
			if (i == 1)
				anInt3089 = stream.readUnsignedShort((byte) -65);
			else if (i == 2)
				((Class224) this).anInt3079 = stream
						.readUnsignedShort((byte) -65);
			else if ((i ^ 0xffffffff) != -5) {
				if (i != 5) {
					if ((i ^ 0xffffffff) == -7)
						anInt3085 = stream.readUnsignedShort((byte) -65);
					else if ((i ^ 0xffffffff) != -8) {
						if ((i ^ 0xffffffff) == -9)
							anInt3086 = stream.readUnsignedByte((byte) 35);
						else if (i != 9) {
							if (i != 10) {
								if (i == 11)
									((Class224) this).aByte3075 = (byte) 1;
								else if ((i ^ 0xffffffff) == -13)
									((Class224) this).aByte3075 = (byte) 4;
								else if ((i ^ 0xffffffff) == -14)
									((Class224) this).aByte3075 = (byte) 5;
								else if (i != 14) {
									if ((i ^ 0xffffffff) != -16) {
										if ((i ^ 0xffffffff) == -17) {
											((Class224) this).aByte3075 = (byte) 3;
											anInt3090 = stream.readInt(126);
										} else if (i != 40) {
											if (i == 41) {
												int i_20_ = (stream
														.readUnsignedByte((byte) 35));
												aShortArray3096 = new short[i_20_];
												aShortArray3077 = new short[i_20_];
												for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
													aShortArray3096[i_21_] = (short) (stream
															.readUnsignedShort((byte) -65));
													aShortArray3077[i_21_] = (short) (stream
															.readUnsignedShort((byte) -65));
												}
											}
										} else {
											int i_22_ = stream
													.readUnsignedByte((byte) 35);
											aShortArray3094 = new short[i_22_];
											aShortArray3080 = new short[i_22_];
											for (int i_23_ = 0; i_22_ > i_23_; i_23_++) {
												aShortArray3094[i_23_] = (short) (stream
														.readUnsignedShort((byte) -65));
												aShortArray3080[i_23_] = (short) (stream
														.readUnsignedShort((byte) -65));
											}
										}
									} else {
										((Class224) this).aByte3075 = (byte) 3;
										anInt3090 = stream
												.readUnsignedShort((byte) -65);
									}
								} else {
									((Class224) this).aByte3075 = (byte) 2;
									anInt3090 = stream
											.readUnsignedByte((byte) 35) * 256;
								}
							} else
								((Class224) this).aBool3073 = true;
						} else {
							anInt3090 = 8224;
							((Class224) this).aByte3075 = (byte) 3;
						}
					} else
						anInt3078 = stream.readUnsignedByte((byte) 35);
				} else
					anInt3082 = stream.readUnsignedShort((byte) -65);
			} else
				anInt3083 = stream.readUnsignedShort((byte) -65);
			if (bool == true)
				anInt3093++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lo.E("
					+ (stream != null ? "{...}" : "null") + ',' + i + ','
					+ bool + ')'));
		}
	}

	private final Class206 method1435(int i, int i_24_, int i_25_, int i_26_,
			byte i_27_, int i_28_, Class163 class163, int i_29_, boolean bool,
			int i_30_, Class198 class198, Class12 class12, int i_31_,
			Class12 class12_32_) {
		try {
			anInt3092++;
			int i_33_ = i_25_;
			Class281 class281 = (((((Class224) this).anInt3079 ^ 0xffffffff) == 0 || i_28_ == -1) ? null
					: class198.method1284(((Class224) this).anInt3079,
							(byte) 87));
			bool = bool & (((Class224) this).aByte3075 ^ 0xffffffff) != -1;
			if (class281 != null)
				i_33_ |= class281.method1738(i_31_, i_30_ + 276, false, i_28_);
			if (bool)
				i_33_ = i_33_ | (((Class224) this).aByte3075 != 3 ? 2 : 7);
			if ((anInt3082 ^ 0xffffffff) != -129)
				i_33_ |= 0x2;
			if (anInt3083 != 128 || (anInt3085 ^ 0xffffffff) != -1)
				i_33_ |= 0x5;
			Class206 class206;
			synchronized (((Class227) ((Class224) this).aClass227_3084).aClass22_3132) {
				class206 = ((Class206) (((Class227) ((Class224) this).aClass227_3084).aClass22_3132
						.method188(
								(long) (((Class224) this).anInt3091 |= ((Class163) class163).anInt2103 << 29),
								(byte) 82)));
				if (i_30_ != 748)
					method1436(null, (byte) -44, 87, -17, -10, -8, null);
			}
			if (class206 == null
					|| class163.method1065(class206.ua(), i_33_) != 0) {
				if (class206 != null)
					i_33_ = class163.method1077(i_33_, class206.ua());
				int i_34_ = i_33_;
				if (aShortArray3094 != null)
					i_34_ |= 0x4000;
				if (aShortArray3096 != null)
					i_34_ |= 0x8000;
				Class179 class179 = Class11_Sub16
						.method2443(
								0,
								(((Class227) (((Class224) this).aClass227_3084)).aClass146_3125),
								anInt3089, 0);
				if (class179 == null)
					return null;
				if ((((Class179) class179).anInt2277 ^ 0xffffffff) > -14)
					class179.method1166(2, true);
				class206 = class163
						.method1020(
								class179,
								i_34_,
								(((Class227) ((Class224) this).aClass227_3084).anInt3136),
								anInt3078 + 64, anInt3086 + 850);
				if (aShortArray3094 != null) {
					for (int i_35_ = 0; ((aShortArray3094.length ^ 0xffffffff) < (i_35_ ^ 0xffffffff)); i_35_++)
						class206.ia(aShortArray3094[i_35_],
								aShortArray3080[i_35_]);
				}
				if (aShortArray3096 != null) {
					for (int i_36_ = 0; ((aShortArray3096.length ^ 0xffffffff) < (i_36_ ^ 0xffffffff)); i_36_++)
						class206.aa(aShortArray3096[i_36_],
								aShortArray3077[i_36_]);
				}
				class206.s(i_33_);
				synchronized (((Class227) ((Class224) this).aClass227_3084).aClass22_3132) {
					((Class227) ((Class224) this).aClass227_3084).aClass22_3132
							.method184(
									(byte) 127,
									class206,
									(long) (((Class224) this).anInt3091 |= ((Class163) class163).anInt2103 << 29));
				}
			}
			Class206 class206_37_ = (class281 == null ? class206.method1313(
					i_27_, i_33_, true) : class281.method1732(i_27_, i_33_,
					i_30_ - 492, i_28_, i, class206, 0, i_31_));
			if (anInt3083 != 128 || anInt3082 != 128)
				class206_37_.O(anInt3083, anInt3082, anInt3083);
			if ((anInt3085 ^ 0xffffffff) != -1) {
				if ((anInt3085 ^ 0xffffffff) == -91)
					class206_37_.a(4096);
				if (anInt3085 == 180)
					class206_37_.a(8192);
				if ((anInt3085 ^ 0xffffffff) == -271)
					class206_37_.a(12288);
			}
			if (bool)
				class206_37_.p(((Class224) this).aByte3075, anInt3090, class12,
						class12_32_, i_29_, i_26_, i_24_);
			class206_37_.s(i_25_);
			return class206_37_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lo.G(" + i + ','
					+ i_24_ + ',' + i_25_ + ',' + i_26_ + ',' + i_27_ + ','
					+ i_28_ + ',' + (class163 != null ? "{...}" : "null") + ','
					+ i_29_ + ',' + bool + ',' + i_30_ + ','
					+ (class198 != null ? "{...}" : "null") + ','
					+ (class12 != null ? "{...}" : "null") + ',' + i_31_ + ','
					+ (class12_32_ != null ? "{...}" : "null") + ')'));
		}
	}

	final Class206 method1436(Class163 class163, byte i, int i_38_, int i_39_,
			int i_40_, int i_41_, Class198 class198) {
		try {
			anInt3081++;
			if (i != 6)
				aShortArray3096 = null;
			return method1435(i_40_, 0, i_41_, 0, (byte) 2, i_39_, class163, 0,
					false, 748, class198, null, i_38_, null);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lo.D("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_38_ + ',' + i_39_ + ',' + i_40_ + ',' + i_41_ + ','
					+ (class198 != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method1437(int i, int i_42_, byte i_43_) {
		try {
			anInt3088++;
			if (Class11_Sub8.anInt5308 == -1)
				return 1;
			if (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5696
					.method3181(false) != i_42_) {
				Class321_Sub3.method2851((Class26.aClass26_289.method217(
						(byte) 109, Class11_Sub45_Sub1_Sub2.anInt9884)), i_42_,
						(byte) -60, true);
				if ((i_42_ ^ 0xffffffff) != (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5696
						.method3181(false) ^ 0xffffffff))
					return -1;
			}
			try {
				Dimension dimension = Class11_Sub45_Sub13.aCanvas9308.getSize();
				Class11_Sub2_Sub8.method3433(Class161.aClass292_2096,
						Class26.aClass26_289.method217((byte) 90,
								(Class11_Sub45_Sub1_Sub2.anInt9884)), true,
						-31, OutputStream_Sub2.aClass107_7949,
						Class321_Sub2.aClass163_6648);
				Class179 class179 = Class11_Sub16.method2443(0,
						Class265.aClass146_3607, Class11_Sub8.anInt5308, 0);
				long l = Class137.method878((byte) -85);
				Class321_Sub2.aClass163_6648.la();
				Class236.aClass33_3224.method301(0, Class19.anInt152, 0);
				Class321_Sub2.aClass163_6648.method1080(Class236.aClass33_3224);
				Class321_Sub2.aClass163_6648.DA(dimension.width / 2,
						dimension.height / 2, 512, 512);
				Class321_Sub2.aClass163_6648.xa(1.0F);
				Class321_Sub2.aClass163_6648.ZA(16777215, 0.5F, 0.5F, 20.0F,
						-50.0F, 30.0F);
				Class206 class206 = Class321_Sub2.aClass163_6648.method1020(
						class179, 2048, 64, 64, 768);
				int i_44_ = 0;
				while_57_: for (int i_45_ = 0; i_45_ < 500; i_45_++) {
					Class321_Sub2.aClass163_6648.GA(0);
					Class321_Sub2.aClass163_6648.ya();
					for (int i_46_ = 15; (i_46_ ^ 0xffffffff) <= -1; i_46_--) {
						for (int i_47_ = 0; (i_46_ ^ 0xffffffff) <= (i_47_ ^ 0xffffffff); i_47_++) {
							Class219.aClass33_3017
									.method301(
											(int) ((-((float) i_46_ / 2.0F) + (float) i_47_) * (float) (Class376_Sub7_Sub3_Sub2.anInt10141)),
											0,
											((1 + i_46_) * Class376_Sub7_Sub3_Sub2.anInt10141));
							i_44_++;
							class206.method1321(Class219.aClass33_3017, null, 0);
							if ((Class137.method878((byte) -60) - l ^ 0xffffffffffffffffL) <= ((long) i ^ 0xffffffffffffffffL))
								break while_57_;
						}
					}
				}
				Class321_Sub2.aClass163_6648.method1078();
				long l_48_ = ((long) (i_44_ * 1000) / (Class137
						.method878((byte) -82) + -l));
				Class321_Sub2.aClass163_6648.GA(0);
				if (i_43_ != 83)
					return -124;
				Class321_Sub2.aClass163_6648.ya();
				return (int) l_48_;
			} catch (Throwable throwable) {
				throwable.printStackTrace();
				return -1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lo.A(" + i + ','
					+ i_42_ + ',' + i_43_ + ')'));
		}
	}

	final Class206 method1438(Class12 class12, int i, byte i_49_, int i_50_,
			int i_51_, Class163 class163, int i_52_, boolean bool,
			Class198 class198, int i_53_, Class12 class12_54_, int i_55_,
			int i_56_) {
		try {
			anInt3087++;
			int i_57_ = -120 % ((i_49_ - 16) / 52);
			return method1435(i_55_, i_53_, i_52_, i, (byte) 2, i_51_,
					class163, i_56_, bool, 748, class198, class12_54_, i_50_,
					class12);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lo.H("
					+ (class12 != null ? "{...}" : "null") + ',' + i + ','
					+ i_49_ + ',' + i_50_ + ',' + i_51_ + ','
					+ (class163 != null ? "{...}" : "null") + ',' + i_52_ + ','
					+ bool + ',' + (class198 != null ? "{...}" : "null") + ','
					+ i_53_ + ',' + (class12_54_ != null ? "{...}" : "null")
					+ ',' + i_55_ + ',' + i_56_ + ')'));
		}
	}

	public Class224() {
		((Class224) this).aByte3075 = (byte) 0;
		anInt3078 = 0;
		anInt3083 = 128;
		anInt3085 = 0;
		anInt3086 = 0;
		anInt3090 = -1;
	}
}
