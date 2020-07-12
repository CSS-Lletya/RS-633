/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

abstract class Class58 {
	static int anInt863;
	static int anInt864;
	private int anInt865;
	static int anInt866;
	static int anInt867;
	private short[] aShortArray868 = new short[512];
	int anInt869;
	static int anInt870;
	private int anInt871;
	private int anInt872;
	static Class11_Sub45_Sub14 aClass11_Sub45_Sub14_873 = null;
	static int anInt874;
	static int anInt875;
	private short[] aShortArray876;
	static int anInt877;
	private int anInt878;

	abstract void method453(int i, int i_0_, int i_1_);

	abstract void method454(byte i);

	private final void method455(int i) {
		do {
			try {
				aShortArray876 = new short[((Class58) this).anInt869];
				anInt874++;
				for (int i_2_ = 0; ((i_2_ ^ 0xffffffff) > (((Class58) this).anInt869 ^ 0xffffffff)); i_2_++)
					aShortArray876[i_2_] = (short) (int) Math.pow(2.0,
							(double) i_2_);
				if (i <= -21)
					break;
				aClass11_Sub45_Sub14_873 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "uba.P(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method456(int i, int i_3_, int i_4_, int i_5_, byte i_6_) {
		do {
			try {
				int i_7_ = 21 / ((51 - i_6_) / 52);
				anInt870++;
				if ((i_5_ ^ 0xffffffff) > (Class26.anInt340 ^ 0xffffffff)
						|| i_5_ > Class11_Sub45_Sub1_Sub2.anInt9880)
					break;
				i_3_ = Class244.method1540(i_3_, Class292.anInt3962, false,
						Class351.anInt4618);
				i_4_ = Class244.method1540(i_4_, Class292.anInt3962, false,
						Class351.anInt4618);
				Class170.method1116(i_5_, i_4_, i, i_3_, -8220);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("uba.Q(" + i + ','
						+ i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
			}
			break;
		} while (false);
	}

	final void method457(int i, int i_8_, boolean bool, int i_9_) {
		try {
			anInt877++;
			if (bool != false)
				method464(false);
			int[] is = new int[i];
			int[] is_10_ = new int[i_9_];
			for (int i_11_ = 0; i_11_ < i; i_11_++)
				is[i_11_] = (i_11_ << 12) / i;
			int[] is_12_ = new int[i_8_];
			for (int i_13_ = 0; (i_9_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_13_++)
				is_10_[i_13_] = (i_13_ << 12) / i_9_;
			for (int i_14_ = 0; i_8_ > i_14_; i_14_++)
				is_12_[i_14_] = (i_14_ << 12) / i_8_;
			method461(3);
			for (int i_15_ = 0; (i_8_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
				for (int i_16_ = 0; i_9_ > i_16_; i_16_++) {
					for (int i_17_ = 0; (i ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
						for (int i_18_ = 0; i_18_ < ((Class58) this).anInt869; i_18_++) {
							int i_19_ = aShortArray876[i_18_] << 12;
							int i_20_ = is_12_[i_15_] * i_19_ >> 12;
							int i_21_ = anInt872 * i_19_ >> 12;
							int i_22_ = anInt878 * i_19_ >> 12;
							int i_23_ = i_19_ * anInt865 >> 12;
							int i_24_ = is_10_[i_16_] * i_19_ >> 12;
							int i_25_ = i_19_ * is[i_17_] >> 12;
							i_20_ *= anInt878;
							i_25_ *= anInt865;
							i_24_ *= anInt872;
							int i_26_ = i_25_ >> 12;
							int i_27_ = 1 + i_26_;
							int i_28_ = i_24_ >> 12;
							i_26_ &= 0xff;
							int i_29_ = i_28_ + 1;
							int i_30_ = i_20_ >> 12;
							i_28_ &= 0xff;
							int i_31_ = i_30_ + 1;
							i_20_ &= 0xfff;
							if ((i_22_ ^ 0xffffffff) >= (i_31_ ^ 0xffffffff))
								i_31_ = 0;
							else
								i_31_ &= 0xff;
							i_25_ &= 0xfff;
							if ((i_21_ ^ 0xffffffff) < (i_29_ ^ 0xffffffff))
								i_29_ &= 0xff;
							else
								i_29_ = 0;
							i_30_ &= 0xff;
							if (i_27_ < i_23_)
								i_27_ &= 0xff;
							else
								i_27_ = 0;
							i_24_ &= 0xfff;
							int i_32_ = aShortArray868[i_31_];
							int i_33_ = i_25_ - 4096;
							int i_34_ = i_24_ - 4096;
							int i_35_ = Class11_Sub24.anIntArray6239[i_25_];
							int i_36_ = aShortArray868[i_30_];
							int i_37_ = -4096 + i_20_;
							int i_38_ = Class11_Sub24.anIntArray6239[i_20_];
							int i_39_ = Class11_Sub24.anIntArray6239[i_24_];
							int i_40_ = aShortArray868[i_29_ + i_32_];
							int i_41_ = aShortArray868[i_28_ + i_36_];
							int i_42_ = aShortArray868[i_29_ - -i_36_];
							int i_43_ = aShortArray868[i_28_ - -i_32_];
							int i_44_ = Class117.method766(i_20_,
									(aShortArray868[i_41_ + i_26_]), i_24_,
									i_25_, (byte) -77);
							int i_45_ = Class117.method766(i_20_,
									(aShortArray868[i_41_ + i_27_]), i_24_,
									i_33_, (byte) -113);
							int i_46_ = (i_35_ * (i_45_ - i_44_) >> 12) + i_44_;
							i_44_ = Class117.method766(i_20_,
									(aShortArray868[i_26_ - -i_42_]), i_34_,
									i_25_, (byte) -62);
							i_45_ = Class117.method766(i_20_,
									(aShortArray868[i_42_ + i_27_]), i_34_,
									i_33_, (byte) -87);
							int i_47_ = ((i_45_ + -i_44_) * i_35_ >> 12)
									+ i_44_;
							int i_48_ = i_46_
									- -(i_39_ * (i_47_ - i_46_) >> 12);
							i_44_ = Class117.method766(i_37_,
									(aShortArray868[i_43_ + i_26_]), i_24_,
									i_25_, (byte) -73);
							i_45_ = Class117.method766(i_37_,
									(aShortArray868[i_43_ + i_27_]), i_24_,
									i_33_, (byte) -86);
							i_46_ = (i_35_ * (i_45_ + -i_44_) >> 12) + i_44_;
							i_44_ = Class117.method766(i_37_,
									(aShortArray868[i_26_ + i_40_]), i_34_,
									i_25_, (byte) -102);
							i_45_ = Class117.method766(i_37_,
									(aShortArray868[i_40_ + i_27_]), i_34_,
									i_33_, (byte) -95);
							i_47_ = i_44_ + (i_35_ * (i_45_ - i_44_) >> 12);
							int i_49_ = (i_39_ * (-i_46_ + i_47_) >> 12)
									+ i_46_;
							method453(i_18_, i_48_
									+ (i_38_ * (-i_48_ + i_49_) >> 12), -101);
						}
						method454((byte) 58);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("uba.O(" + i + ','
					+ i_8_ + ',' + bool + ',' + i_9_ + ')'));
		}
	}

	static final int method458(int i, int i_50_) {
		try {
			anInt866++;
			if (i_50_ != 0)
				method464(true);
			return i >>> 7;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uba.S(" + i + ','
					+ i_50_ + ')');
		}
	}

	static final void method459(int i, int i_51_, int i_52_, int i_53_,
			int i_54_, int i_55_, int i_56_) {
		try {
			if (i_53_ > -98)
				aClass11_Sub45_Sub14_873 = null;
			anInt867++;
			if ((Class26.anInt340 ^ 0xffffffff) < (-i + i_56_ ^ 0xffffffff)
					|| i + i_56_ > Class11_Sub45_Sub1_Sub2.anInt9880
					|| Class292.anInt3962 > -i + i_52_
					|| (Class351.anInt4618 ^ 0xffffffff) > (i + i_52_ ^ 0xffffffff))
				Class91_Sub1.method2810(i, i_52_, i_56_, true, i_54_, i_55_,
						i_51_);
			else
				Class201.method1289(2, i_56_, i_54_, i_52_, i_55_, i_51_, i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("uba.K(" + i + ','
					+ i_51_ + ',' + i_52_ + ',' + i_53_ + ',' + i_54_ + ','
					+ i_55_ + ',' + i_56_ + ')'));
		}
	}

	private final void method460(int i) {
		try {
			anInt875++;
			Random random = new Random((long) anInt871);
			for (int i_57_ = 0; i_57_ < 255; i_57_++)
				aShortArray868[i_57_] = (short) i_57_;
			if (i != -256)
				anInt878 = -37;
			for (int i_58_ = 0; i_58_ < 255; i_58_++) {
				int i_59_ = 255 - i_58_;
				int i_60_ = Class302.method1863(i_59_, random, (byte) -119);
				short i_61_ = aShortArray868[i_60_];
				aShortArray868[i_60_] = aShortArray868[i_59_];
				aShortArray868[i_59_] = aShortArray868[i_59_ + 256] = i_61_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uba.M(" + i + ')');
		}
	}

	abstract void method461(int i);

	static final void method462(boolean bool) {
		try {
			if (Class334.anInt4423 > 1) {
				Class334.anInt4423--;
				Class219.anInt3019 = Class219_Sub1.anInt7238;
			}
			anInt864++;
			if (Class38.aBool505) {
				Class38.aBool505 = false;
				Class287.method1777((byte) 103);
			} else {
				if (!Class306.aBool4114)
					Class2_Sub5.method2406(-2);
				for (int i = 0; (i ^ 0xffffffff) > -101; i++) {
					if (!Class11_Sub2_Sub34.method3812(-51))
						break;
				}
				if (Class285.anInt3846 == 10) {
					while (Class260.method1662((byte) -115)) {
						Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
								(Class11_Sub3.aClass25_5113),
								(Class108_Sub2.aClass370_5080), (byte) -57);
						((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
								.writeByte(0, -1528071456);
						int i = (((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position);
						Class117.method768(
								true,
								(((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397));
						((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
								.method2530(
										(((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position - i),
										(byte) 123);
						Class79.method541(class11_sub10, -20);
					}
					if (Class253_Sub2.aClass11_Sub31_6536 == null) {
						if (Class2.aLong20 <= Class137.method878((byte) -41))
							Class253_Sub2.aClass11_Sub31_6536 = (Class95.aClass164_1277
									.method1093(
											(((Class46) Class275.aClass46_3705).aString733),
											(byte) 54));
					} else if ((((Class11_Sub31) Class253_Sub2.aClass11_Sub31_6536).anInt6700 ^ 0xffffffff) != 0) {
						Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
								(Class11_Sub3.aClass25_5113),
								(Class11_Sub45_Sub1_Sub1.aClass370_9831),
								(byte) 80);
						((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
								.writeShort(
										-122,
										((Class11_Sub31) Class253_Sub2.aClass11_Sub31_6536).anInt6700);
						Class79.method541(class11_sub10, -21);
						Class253_Sub2.aClass11_Sub31_6536 = null;
						Class2.aLong20 = 30000L + Class137
								.method878((byte) -53);
					}
					Class11_Sub23 class11_sub23 = ((Class11_Sub23) Class108_Sub13.aClass84_6264
							.method584(-12261));
					if (class11_sub23 != null
							|| ((-2000L + Class137.method878((byte) -61) ^ 0xffffffffffffffffL) < (Class89.aLong1223 ^ 0xffffffffffffffffL))) {
						Class11_Sub10 class11_sub10 = null;
						int i = 0;
						for (Class11_Sub23 class11_sub23_62_ = (Class11_Sub23) Class11_Sub45_Sub6.aClass84_8782
								.method584(-12261); class11_sub23_62_ != null; class11_sub23_62_ = (Class11_Sub23) Class11_Sub45_Sub6.aClass84_8782
								.method578(-15361)) {
							if (class11_sub10 != null
									&& (-i
											+ (((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position) ^ 0xffffffff) <= -241)
								break;
							class11_sub23_62_.method122(-126);
							int i_63_ = class11_sub23_62_.method2569(-124);
							if (i_63_ >= -1) {
								if ((i_63_ ^ 0xffffffff) < -65535)
									i_63_ = 65534;
							} else
								i_63_ = -1;
							int i_64_ = class11_sub23_62_.method2568((byte) 74);
							if (i_64_ >= -1) {
								if ((i_64_ ^ 0xffffffff) < -65535)
									i_64_ = 65534;
							} else
								i_64_ = -1;
							if ((i_64_ ^ 0xffffffff) != (Class120.anInt1628 ^ 0xffffffff)
									|| Class264.anInt3601 != i_63_) {
								if (class11_sub10 == null) {
									class11_sub10 = (Class11_Sub48.method3215(
											Class11_Sub3.aClass25_5113,
											Class11_Sub50_Sub2.aClass370_9078,
											(byte) -103));
									Class330.anInt4386++;
									((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
											.writeByte(0, -1528071456);
									i = (((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position);
								}
								int i_65_ = i_64_ + -Class120.anInt1628;
								Class120.anInt1628 = i_64_;
								int i_66_ = -Class264.anInt3601 + i_63_;
								Class264.anInt3601 = i_63_;
								int i_67_ = (int) ((class11_sub23_62_
										.method2573(126) + -Class89.aLong1223) / 20L);
								if (i_67_ < 8 && i_65_ >= -32
										&& (i_65_ ^ 0xffffffff) >= -32
										&& i_66_ >= -32
										&& (i_66_ ^ 0xffffffff) >= -32) {
									i_66_ += 32;
									i_65_ += 32;
									((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
											.writeShort(-127, i_66_
													+ (i_65_ << 6)
													+ (i_67_ << 12));
								} else if (i_67_ >= 32
										|| (i_65_ ^ 0xffffffff) > 127
										|| i_65_ > 127
										|| (i_66_ ^ 0xffffffff) > 127
										|| (i_66_ ^ 0xffffffff) < -128) {
									if (i_67_ < 32) {
										((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
												.writeByte(192 + i_67_,
														-1528071456);
										if (i_64_ == 1 || i_63_ == -1)
											((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
													.writeInt(-49, -2147483648);
										else
											((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
													.writeInt(-49, i_63_ << 16
															| i_64_);
									} else {
										((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
												.writeShort(-113,
														57344 - -i_67_);
										if (i_64_ != 1 && i_63_ != -1)
											((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
													.writeInt(-49, i_64_
															| i_63_ << 16);
										else
											((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
													.writeInt(-49, -2147483648);
									}
								} else {
									((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
											.writeByte(i_67_ + 128, -1528071456);
									i_65_ += 128;
									i_66_ += 128;
									((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
											.writeShort(-118, (i_65_ << 8)
													- -i_66_);
								}
								Class89.aLong1223 = class11_sub23_62_
										.method2573(76);
							}
						}
						if (class11_sub10 != null) {
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.method2530(
											(((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position)
													+ -i, (byte) 118);
							Class79.method541(class11_sub10, -64);
						}
					}
					if (class11_sub23 != null) {
						long l = ((class11_sub23.method2573(92) + -Class239_Sub2.aLong7909) / 50L);
						Class239_Sub2.aLong7909 = class11_sub23.method2573(95);
						if ((l ^ 0xffffffffffffffffL) < -32768L)
							l = 32767L;
						int i = class11_sub23.method2569(-123);
						if ((i ^ 0xffffffff) > -1)
							i = 0;
						else if ((i ^ 0xffffffff) < -65536)
							i = 65535;
						int i_68_ = class11_sub23.method2568((byte) 78);
						if ((i_68_ ^ 0xffffffff) <= -1) {
							if ((i_68_ ^ 0xffffffff) < -65536)
								i_68_ = 65535;
						} else
							i_68_ = 0;
						int i_69_ = 0;
						if ((class11_sub23.method2570(0) ^ 0xffffffff) == -3)
							i_69_ = 1;
						Class321_Sub3.anInt7026++;
						int i_70_ = (int) l;
						Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
								(Class11_Sub3.aClass25_5113),
								Class340.aClass370_4490, (byte) -55);
						((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
								.writeShort(-120, i_70_ | i_69_ << 15);
						((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
								.method2551(i << 16 | i_68_, (byte) -67);
						Class79.method541(class11_sub10, -92);
					}
					if (Class304.anInt4091 > 0) {
						Class11_Sub28.anInt6584++;
						Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
								(Class11_Sub3.aClass25_5113),
								Class219.aClass370_3016, (byte) -40);
						((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
								.writeByte(3 * Class304.anInt4091, -1528071456);
						for (int i = 0; ((Class304.anInt4091 ^ 0xffffffff) < (i ^ 0xffffffff)); i++) {
							Interface25 interface25 = Class316.anInterface25Array4188[i];
							long l = ((interface25.method55(32678) - Class17.aLong144) / 50L);
							Class17.aLong144 = interface25.method55(32678);
							if ((l ^ 0xffffffffffffffffL) < -65536L)
								l = 65535L;
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeByte(interface25.method30(120),
											-1528071456);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort(-128, (int) l);
						}
						Class79.method541(class11_sub10, -54);
					}
					if (Class295.anInt3982 > 0)
						Class295.anInt3982--;
					if (Class313.aBool4153 && Class295.anInt3982 <= 0) {
						Class225_Sub1.anInt4994++;
						Class313.aBool4153 = false;
						Class295.anInt3982 = 20;
						Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
								(Class11_Sub3.aClass25_5113),
								(Class11_Sub15.aClass370_5611), (byte) 82);
						((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
								.writeShort(-112,
										(int) Class2_Sub8.aFloat6868 >> 3);
						((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
								.writeShort(-119,
										(int) Class219_Sub1.aFloat7244 >> 3);
						Class79.method541(class11_sub10, -68);
					}
					if (Class38.aBool509 == !Class11_Sub12_Sub4.aBool9452) {
						Class38.aBool509 = Class11_Sub12_Sub4.aBool9452;
						Class323.anInt4319++;
						Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
								(Class11_Sub3.aClass25_5113),
								(Class11_Sub6_Sub5.aClass370_9607), (byte) 102);
						((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
								.writeByte(!Class11_Sub12_Sub4.aBool9452 ? 0
										: 1, -1528071456);
						Class79.method541(class11_sub10, -52);
					}
					if (!Class236_Sub1.aBool6093) {
						Class72_Sub3.anInt7313++;
						Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
								(Class11_Sub3.aClass25_5113),
								Class112.aClass370_1541, (byte) 65);
						((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
								.writeByte(0, -1528071456);
						int i = (((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position);
						Stream stream = Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
								.method2457((byte) -94);
						((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
								.writeBytes(!bool, ((Stream) stream).buffer,
										((Stream) stream).position, 0);
						((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
								.method2530(
										-i
												+ (((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position),
										(byte) 127);
						Class79.method541(class11_sub10, -52);
						Class236_Sub1.aBool6093 = true;
					}
					if (Class181.aClass364ArrayArrayArray2336 != null) {
						if ((Class191.anInt2453 ^ 0xffffffff) != -3) {
							if (Class191.anInt2453 == 3)
								Class298.method1849((byte) 126);
						} else
							Class319.method1937(-256);
					}
					if (Class63.aBool924)
						Class63.aBool924 = false;
					else
						Class171.aFloat2192 /= 2.0F;
					if (!Class11_Sub28.aBool6576)
						Class175.aFloat2228 /= 2.0F;
					else
						Class11_Sub28.aBool6576 = false;
					Class11_Sub45_Sub18.method3757((byte) -6);
					if (Class285.anInt3846 == 10) {
						Class101.method670((byte) -118);
						Class2_Sub5.method2403(-1);
						Class101.method671((byte) 45);
						Class47.anInt742++;
						if ((Class47.anInt742 ^ 0xffffffff) < -751)
							Class287.method1777((byte) 91);
						else {
							Class58_Sub1.method2952(0);
							Class164.method1090(52);
							Class180.method1179((byte) 40);
							for (int i = Class11_Sub26.aClass97_6296.method656(
									true, 71); i != -1; i = Class11_Sub26.aClass97_6296
									.method656(false, -85)) {
								Class228.method1469(127, i);
								Class11_Sub45_Sub2.anIntArray8510[Class77
										.method529(Class167.anInt2154++, 31)] = i;
							}
							for (Class11_Sub45_Sub15 class11_sub45_sub15 = Class11_Sub45_Sub18
									.method3762(30548); class11_sub45_sub15 != null; class11_sub45_sub15 = Class11_Sub45_Sub18
									.method3762(30548)) {
								int i = class11_sub45_sub15
										.method3655((byte) -91);
								int i_71_ = class11_sub45_sub15.method3657(6);
								if (i == 1) {
									Class11_Sub2_Sub20.anIntArray9148[i_71_] = ((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363;
									Class217_Sub1.aBool5525 |= Class299.aBoolArray4037[i_71_];
									Class11_Sub7.anIntArray5260[Class77
											.method529(
													Class11_Sub45_Sub15.anInt9374++,
													31)] = i_71_;
								} else if ((i ^ 0xffffffff) == -3) {
									Class138.aStringArray1888[i_71_] = ((Class11_Sub45_Sub15) class11_sub45_sub15).aString9366;
									Class11_Sub45_Sub16.anIntArray9393[Class77
											.method529(
													Class11_Sub10.anInt5390++,
													31)] = i_71_;
								} else if (i == 3) {
									IComponentDefinitions class192 = Class11_Sub2_Sub13
											.method3533((byte) -119, i_71_);
									if (!((Class11_Sub45_Sub15) class11_sub45_sub15).aString9366
											.equals(((IComponentDefinitions) class192).aString2481)) {
										((IComponentDefinitions) class192).aString2481 = (((Class11_Sub45_Sub15) class11_sub45_sub15).aString9366);
										Class232.method1484(class192, 1);
									}
								} else if ((i ^ 0xffffffff) != -5) {
									if ((i ^ 0xffffffff) != -6) {
										if ((i ^ 0xffffffff) != -7) {
											if (i == 7) {
												IComponentDefinitions class192 = (Class11_Sub2_Sub13
														.method3533(
																(byte) -123,
																i_71_));
												boolean bool_72_ = (((((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363) ^ 0xffffffff) == -2);
												if (!bool_72_ != !(((IComponentDefinitions) class192).aBool2535)) {
													((IComponentDefinitions) class192).aBool2535 = bool_72_;
													Class232.method1484(
															class192, 1);
												}
											} else if ((i ^ 0xffffffff) == -9) {
												IComponentDefinitions class192 = (Class11_Sub2_Sub13
														.method3533((byte) -93,
																i_71_));
												if (((((IComponentDefinitions) class192).anInt2496) != (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363))
														|| (((((IComponentDefinitions) class192).anInt2578) ^ 0xffffffff) != ((((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9369) ^ 0xffffffff))
														|| ((((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9367) != (((IComponentDefinitions) class192).anInt2598))) {
													((IComponentDefinitions) class192).anInt2578 = (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9369);
													((IComponentDefinitions) class192).anInt2598 = (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9367);
													((IComponentDefinitions) class192).anInt2496 = (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363);
													if ((((IComponentDefinitions) class192).anInt2467) != -1) {
														if (((((IComponentDefinitions) class192).anInt2616) ^ 0xffffffff) >= -1) {
															if (((((IComponentDefinitions) class192).anInt2613) ^ 0xffffffff) < -1)
																((IComponentDefinitions) class192).anInt2598 = ((((IComponentDefinitions) class192).anInt2598) * 32 / (((IComponentDefinitions) class192).anInt2613));
														} else
															((IComponentDefinitions) class192).anInt2598 = (32 * (((IComponentDefinitions) class192).anInt2598) / (((IComponentDefinitions) class192).anInt2616));
													}
													Class232.method1484(
															class192, 1);
												}
											} else if ((i ^ 0xffffffff) != -10) {
												if (i != 10) {
													if ((i ^ 0xffffffff) == -12) {
														IComponentDefinitions class192 = (Class11_Sub2_Sub13
																.method3533(
																		(byte) -81,
																		i_71_));
														((IComponentDefinitions) class192).anInt2469 = ((IComponentDefinitions) class192).anInt2615 = (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363);
														((IComponentDefinitions) class192).anInt2490 = ((IComponentDefinitions) class192).anInt2550 = (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9369);
														((IComponentDefinitions) class192).aByte2473 = (byte) 0;
														((IComponentDefinitions) class192).aByte2617 = (byte) 0;
														Class232.method1484(
																class192, 1);
													} else if (i == 12) {
														IComponentDefinitions class192 = (Class11_Sub2_Sub13
																.method3533(
																		(byte) -102,
																		i_71_));
														int i_73_ = (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363);
														if (class192 != null
																&& ((((IComponentDefinitions) class192).anInt2531) == 0)) {
															if ((((((IComponentDefinitions) class192).anInt2484) + -(((IComponentDefinitions) class192).anInt2546)) ^ 0xffffffff) > (i_73_ ^ 0xffffffff))
																i_73_ = (-(((IComponentDefinitions) class192).anInt2546) + (((IComponentDefinitions) class192).anInt2484));
															if (i_73_ < 0)
																i_73_ = 0;
															if (((((IComponentDefinitions) class192).anInt2588) ^ 0xffffffff) != (i_73_ ^ 0xffffffff)) {
																((IComponentDefinitions) class192).anInt2588 = i_73_;
																Class232.method1484(
																		class192,
																		1);
															}
														}
													} else if (i != 14) {
														if (i != 15) {
															if ((i ^ 0xffffffff) == -17) {
																IComponentDefinitions class192 = (Class11_Sub2_Sub13
																		.method3533(
																				(byte) -116,
																				i_71_));
																((IComponentDefinitions) class192).anInt2488 = (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363);
															} else if ((i ^ 0xffffffff) == -18) {
																IComponentDefinitions class192 = (Class11_Sub2_Sub13
																		.method3533(
																				(byte) -87,
																				i_71_));
																((IComponentDefinitions) class192).anInt2552 = (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363);
															}
														} else {
															Class11_Sub2_Sub3.aBool8473 = true;
															Class220_Sub1.anInt7153 = (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9369);
															Class321.anInt4284 = (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363);
														}
													} else {
														IComponentDefinitions class192 = (Class11_Sub2_Sub13
																.method3533(
																		(byte) -105,
																		i_71_));
														((IComponentDefinitions) class192).anInt2544 = (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363);
													}
												} else {
													IComponentDefinitions class192 = (Class11_Sub2_Sub13
															.method3533(
																	(byte) -123,
																	i_71_));
													if (((((IComponentDefinitions) class192).anInt2595) != (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363))
															|| ((((IComponentDefinitions) class192).anInt2516) != (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9369))
															|| (((((IComponentDefinitions) class192).anInt2526) ^ 0xffffffff) != ((((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9367) ^ 0xffffffff))) {
														((IComponentDefinitions) class192).anInt2526 = (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9367);
														((IComponentDefinitions) class192).anInt2595 = (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363);
														((IComponentDefinitions) class192).anInt2516 = (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9369);
														Class232.method1484(
																class192, 1);
													}
												}
											} else {
												IComponentDefinitions class192 = (Class11_Sub2_Sub13
														.method3533(
																(byte) -117,
																i_71_));
												if ((((((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363) ^ 0xffffffff) != ((((IComponentDefinitions) class192).anInt2467) ^ 0xffffffff))
														|| ((((IComponentDefinitions) class192).anInt2572) != (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9369))) {
													((IComponentDefinitions) class192).anInt2467 = (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363);
													((IComponentDefinitions) class192).anInt2572 = (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9369);
													Class232.method1484(
															class192, 1);
												}
											}
										} else {
											int i_74_ = (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363);
											int i_75_ = i_74_ >> 10 & 0x1f;
											int i_76_ = 0x1f & i_74_ >> 5;
											int i_77_ = 0x1f & i_74_;
											int i_78_ = ((i_77_ << 3)
													+ (i_75_ << 19) - -(i_76_ << 11));
											IComponentDefinitions class192 = (Class11_Sub2_Sub13
													.method3533((byte) -81,
															i_71_));
											if (((((IComponentDefinitions) class192).anInt2577) ^ 0xffffffff) != (i_78_ ^ 0xffffffff)) {
												((IComponentDefinitions) class192).anInt2577 = i_78_;
												Class232.method1484(class192, 1);
											}
										}
									} else {
										IComponentDefinitions class192 = (Class11_Sub2_Sub13
												.method3533((byte) -93, i_71_));
										if ((((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363 != (((IComponentDefinitions) class192).anInt2491))
												|| (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363 ^ 0xffffffff) == 0) {
											((IComponentDefinitions) class192).anInt2502 = 0;
											((IComponentDefinitions) class192).anInt2491 = (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363);
											((IComponentDefinitions) class192).anInt2545 = 1;
											((IComponentDefinitions) class192).anInt2539 = 0;
											Class281 class281 = ((((IComponentDefinitions) class192).anInt2491) == -1 ? null
													: (Class108_Sub23.aClass198_7760
															.method1284(
																	(((IComponentDefinitions) class192).anInt2491),
																	(byte) -46)));
											if (class281 != null)
												Class318.method1936(
														(byte) 126,
														(((IComponentDefinitions) class192).anInt2539),
														class281);
											Class232.method1484(class192, 1);
										}
									}
								} else {
									IComponentDefinitions class192 = Class11_Sub2_Sub13
											.method3533((byte) -97, i_71_);
									int i_79_ = (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363);
									int i_80_ = (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9369);
									int i_81_ = (((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9367);
									if (((i_79_ ^ 0xffffffff) != (((IComponentDefinitions) class192).anInt2597 ^ 0xffffffff))
											|| ((((IComponentDefinitions) class192).anInt2512 ^ 0xffffffff) != (i_80_ ^ 0xffffffff))
											|| ((i_81_ ^ 0xffffffff) != (((IComponentDefinitions) class192).anInt2562 ^ 0xffffffff))) {
										((IComponentDefinitions) class192).anInt2562 = i_81_;
										((IComponentDefinitions) class192).anInt2597 = i_79_;
										((IComponentDefinitions) class192).anInt2512 = i_80_;
										Class232.method1484(class192, 1);
									}
								}
							}
							Class104.anInt1398++;
							if (Class228.anInt3149 != 0) {
								Class378.anInt4935 += 20;
								if ((Class378.anInt4935 ^ 0xffffffff) <= -401)
									Class228.anInt3149 = 0;
							}
							if (Class112.aClass192_1539 != null) {
								OutgoingPacket.anInt4858++;
								if (OutgoingPacket.anInt4858 >= 15) {
									Class232.method1484(
											(Class112.aClass192_1539), 1);
									Class112.aClass192_1539 = null;
								}
							}
							Class11_Sub2_Sub34.aBool9690 = false;
							Class333.aClass192_4417 = null;
							Class42.aClass192_692 = null;
							Class376_Sub6.aBool6950 = bool;
							Class330.method1996(-1, -1, null, 0);
							Class376_Sub7_Sub5_Sub1.method3884(null, -1, -54,
									-1);
							if (!Class204.aBool2739)
								Class325.anInt4329 = -1;
							Class34.method306(25);
							Class219_Sub1.anInt7238++;
							if (Class235.aBool3218) {
								Class94_Sub3.anInt6904++;
								Class11_Sub10 class11_sub10 = (Class11_Sub48
										.method3215(Class11_Sub3.aClass25_5113,
												Class209.aClass370_2844,
												(byte) -46));
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.method2551(
												(Class337.anInt4450 << 28
														| RuntimeException_Sub1.anInt9964 << 14 | Class11_Sub46.anInt7980),
												(byte) -113);
								Class79.method541(class11_sub10, -127);
								Class235.aBool3218 = false;
							}
							for (;;) {
								Class11_Sub48 class11_sub48 = ((Class11_Sub48) Class11_Sub43.aClass84_7327
										.method581((byte) -16));
								if (class11_sub48 == null)
									break;
								IComponentDefinitions class192 = (((Class11_Sub48) class11_sub48).aClass192_7999);
								if ((((IComponentDefinitions) class192).anInt2459 ^ 0xffffffff) <= -1) {
									IComponentDefinitions class192_82_ = (Class11_Sub2_Sub13
											.method3533(
													(byte) -86,
													((IComponentDefinitions) class192).anInt2593));
									if (class192_82_ == null
											|| (((IComponentDefinitions) class192_82_).aClass192Array2524) == null
											|| (((IComponentDefinitions) class192).anInt2459 >= (((IComponentDefinitions) class192_82_).aClass192Array2524).length)
											|| ((((IComponentDefinitions) class192_82_).aClass192Array2524[((IComponentDefinitions) class192).anInt2459]) != class192))
										continue;
								}
								Class86.method610(class11_sub48);
							}
							for (;;) {
								Class11_Sub48 class11_sub48 = ((Class11_Sub48) Class2_Sub10.aClass84_7920
										.method581((byte) -16));
								if (class11_sub48 == null)
									break;
								IComponentDefinitions class192 = (((Class11_Sub48) class11_sub48).aClass192_7999);
								if ((((IComponentDefinitions) class192).anInt2459 ^ 0xffffffff) <= -1) {
									IComponentDefinitions class192_83_ = (Class11_Sub2_Sub13
											.method3533(
													(byte) -128,
													((IComponentDefinitions) class192).anInt2593));
									if (class192_83_ == null
											|| (((IComponentDefinitions) class192_83_).aClass192Array2524) == null
											|| (((IComponentDefinitions) class192).anInt2459 >= (((IComponentDefinitions) class192_83_).aClass192Array2524).length)
											|| ((((IComponentDefinitions) class192_83_).aClass192Array2524[((IComponentDefinitions) class192).anInt2459]) != class192))
										continue;
								}
								Class86.method610(class11_sub48);
							}
							for (;;) {
								Class11_Sub48 class11_sub48 = ((Class11_Sub48) Class180.aClass84_2332
										.method581((byte) -16));
								if (class11_sub48 == null)
									break;
								IComponentDefinitions class192 = (((Class11_Sub48) class11_sub48).aClass192_7999);
								if ((((IComponentDefinitions) class192).anInt2459 ^ 0xffffffff) <= -1) {
									IComponentDefinitions class192_84_ = (Class11_Sub2_Sub13
											.method3533(
													(byte) -107,
													((IComponentDefinitions) class192).anInt2593));
									if (class192_84_ == null
											|| (((IComponentDefinitions) class192_84_).aClass192Array2524) == null
											|| (((IComponentDefinitions) class192).anInt2459 >= (((IComponentDefinitions) class192_84_).aClass192Array2524).length)
											|| (class192 != (((IComponentDefinitions) class192_84_).aClass192Array2524[(((IComponentDefinitions) class192).anInt2459)])))
										continue;
								}
								Class86.method610(class11_sub48);
							}
							if (Class333.aClass192_4417 == null)
								Class254_Sub1.anInt5519 = 0;
							if (Class11_Sub2_Sub32_Sub1.aClass192_9889 != null)
								Class280.method1730(31167);
						
							if ((Class256_Sub2.anInt7713 ^ 0xffffffff) < -1
									&& Class11_Sub2_Sub19.aClass1_9098
											.method60(0, 82)
									&& Class11_Sub2_Sub19.aClass1_9098
											.method60(0, 81)
									&& (Class154.anInt2032 ^ 0xffffffff) != -1) {
								
								int i = (-Class154.anInt2032 + (((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047));
								if (i < 0)
									i = 0;
								else if ((i ^ 0xffffffff) < -4)
									i = 3;
								Class200.method1288(
										(Class118.anInt1605 + (((Actor) (Class11_Sub2_Sub8.myPlayer)).anIntArray10376[0])),
										-91,
										(Class194.anInt2641 - -(((Actor) (Class11_Sub2_Sub8.myPlayer)).anIntArray10370[0])),
										i);
							}
							Class204.method1294(-30726);
							for (int i = 0; i < 5; i++)
								Class61.anIntArray903[i]++;
							if (Class217_Sub1.aBool5525
									&& (Class347.aLong4598 < (-60000L + Class137
											.method878((byte) -105))))
								Class11_Sub2_Sub28.method3716(false);
							for (Class376_Sub1_Sub2 class376_sub1_sub2 = ((Class376_Sub1_Sub2) Class2_Sub1.aClass131_5063
									.method847(-31182)); class376_sub1_sub2 != null; class376_sub1_sub2 = ((Class376_Sub1_Sub2) Class2_Sub1.aClass131_5063
									.method856(29))) {
								if ((long) ((Class376_Sub1_Sub2) class376_sub1_sub2).anInt9742 < (Class137
										.method878((byte) -42) / 1000L - 5L)) {
									if ((((Class376_Sub1_Sub2) class376_sub1_sub2).aShort9743 ^ 0xffffffff) < -1)
										Class300.method1852(
												-128,
												(((Class376_Sub1_Sub2) class376_sub1_sub2).aString9744 + (Class26.aClass26_295
														.method217(
																(byte) 111,
																(Class11_Sub45_Sub1_Sub2.anInt9884)))),
												"", 0, "", "", 5);
									if (((Class376_Sub1_Sub2) class376_sub1_sub2).aShort9743 == 0)
										Class300.method1852(
												-73,
												(((Class376_Sub1_Sub2) class376_sub1_sub2).aString9744 + (Class26.aClass26_296
														.method217(
																(byte) 91,
																(Class11_Sub45_Sub1_Sub2.anInt9884)))),
												"", 0, "", "", 5);
									class376_sub1_sub2.method2207((byte) -110);
								}
							}
							Class11_Sub22.anInt5982++;
							if ((Class11_Sub22.anInt5982 ^ 0xffffffff) < -501) {
								Class11_Sub22.anInt5982 = 0;
								int i = (int) (8.0 * Math.random());
								if ((i & 0x4) == 4)
									Class256_Sub2.anInt7703 += Class11_Sub46_Sub3.anInt9553;
								if ((i & 0x2) == 2)
									Class91_Sub3_Sub1.anInt9335 += Class376_Sub1_Sub1.anInt8695;
								if ((i & 0x1) == 1)
									Class376_Sub8.anInt7749 += Class339.anInt4482;
							}
							if (Class376_Sub8.anInt7749 < -50)
								Class339.anInt4482 = 2;
							if ((Class376_Sub8.anInt7749 ^ 0xffffffff) < -51)
								Class339.anInt4482 = -2;
							if (Class91_Sub3_Sub1.anInt9335 < -55)
								Class376_Sub1_Sub1.anInt8695 = 2;
							if ((Class91_Sub3_Sub1.anInt9335 ^ 0xffffffff) < -56)
								Class376_Sub1_Sub1.anInt8695 = -2;
							if ((Class256_Sub2.anInt7703 ^ 0xffffffff) > 39)
								Class11_Sub46_Sub3.anInt9553 = 1;
							if ((Class256_Sub2.anInt7703 ^ 0xffffffff) < -41)
								Class11_Sub46_Sub3.anInt9553 = -1;
							Class11_Sub45_Sub4.anInt8539++;
							if (Class11_Sub45_Sub4.anInt8539 > 500) {
								Class11_Sub45_Sub4.anInt8539 = 0;
								int i = (int) (Math.random() * 8.0);
								if ((0x1 & i) == 1)
									Class328.anInt4371 += Class110.anInt1489;
								if ((0x2 & i ^ 0xffffffff) == -3)
									Class11_Sub45_Sub1.anInt8493 += Class264.anInt3603;
							}
							if (Class328.anInt4371 < -60)
								Class110.anInt1489 = 2;
							if ((Class11_Sub45_Sub1.anInt8493 ^ 0xffffffff) > 19)
								Class264.anInt3603 = 1;
							if (Class328.anInt4371 > 60)
								Class110.anInt1489 = -2;
							Class70.anInt984++;
							if (Class11_Sub45_Sub1.anInt8493 > 10)
								Class264.anInt3603 = -1;
							if ((Class70.anInt984 ^ 0xffffffff) < -51) {
								Class11_Sub45_Sub1_Sub2.anInt9876++;
								Class11_Sub10 class11_sub10 = (Class11_Sub48
										.method3215(Class11_Sub3.aClass25_5113,
												Class234_Sub1.aClass370_5644,
												(byte) 118));
								Class79.method541(class11_sub10, -16);
							}
							if (Class4.aBool26) {
								Class173.method1133(-1);
								Class4.aBool26 = false;
							}
							try {
								Class234_Sub2_Sub2.method3540((byte) 124);
							} catch (java.io.IOException ioexception) {
								Class287.method1777((byte) 103);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uba.N(" + bool + ')');
		}
	}

	static final void method463(int i) {
		try {
			anInt863++;
			if (i >= 55 && !Class63.aBool924) {
				Class63.aBool924 = true;
				Class313.aBool4153 = true;
				Class171.aFloat2192 += (-Class171.aFloat2192 + -24.0F) / 2.0F;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uba.L(" + i + ')');
		}
	}

	public static void method464(boolean bool) {
		do {
			try {
				aClass11_Sub45_Sub14_873 = null;
				if (bool == true)
					break;
				aClass11_Sub45_Sub14_873 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "uba.R(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	Class58(int i, int i_85_, int i_86_, int i_87_, int i_88_) {
		anInt865 = 4;
		anInt872 = 4;
		anInt871 = 0;
		((Class58) this).anInt869 = 4;
		anInt878 = 4;
		try {
			anInt865 = i_86_;
			anInt878 = i_88_;
			anInt872 = i_87_;
			((Class58) this).anInt869 = i_85_;
			anInt871 = i;
			method455(-101);
			method460(-256);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("uba.<init>(" + i + ',' + i_85_ + ',' + i_86_ + ','
							+ i_87_ + ',' + i_88_ + ')'));
		}
	}
}
