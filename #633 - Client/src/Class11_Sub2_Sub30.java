/* Class11_Sub2_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub30 extends Class11_Sub2 {
	static int anInt9608;
	static int anInt9609;
	static int anInt9610;
	private int anInt9611 = 0;
	static int anInt9612;
	static int anInt9613;
	private int anInt9614 = 4096;
	static int anInt9615;
	static IncomingPacket aClass160_9616 = new IncomingPacket(29, 10);
	static int[][] anIntArrayArray9617;
	static Class146 aClass146_9618;

	static final boolean method3792(int i, int i_0_, int i_1_, int i_2_) {
		try {
			anInt9610++;
			if (!Class108_Sub10.aBool6130 || !Class236_Sub5.aBool6848)
				return false;
			if (Class217.anInt3003 < 100)
				return false;
			int i_3_ = Class321_Sub3.anIntArrayArrayArray7024[i][i_2_][i_1_];
			if ((-Class11_Sub2_Sub11.anInt8861 ^ 0xffffffff) == (i_3_ ^ 0xffffffff))
				return false;
			if ((i_3_ ^ 0xffffffff) == (Class11_Sub2_Sub11.anInt8861 ^ 0xffffffff))
				return true;
			if (Class234_Sub1_Sub1.aClass12Array9729 == Class315.aClass12Array4179)
				return false;
			if (i_0_ != 843095752)
				method3792(126, 19, 84, 12);
			int i_4_ = i_2_ << Class11_Sub2_Sub8.anInt8751;
			int i_5_ = i_1_ << Class11_Sub2_Sub8.anInt8751;
			if (!(Class181.method1188(1 + i_4_, Class315.aClass12Array4179[i]
					.method131((byte) 123, 1 + i_1_, 1 + i_2_),
					Class376_Sub7_Sub3_Sub2.anInt10141 + (i_5_ - 1), 0,
					1 + i_4_, Class315.aClass12Array4179[i].method131(
							(byte) 126, i_1_, i_2_),
					Class376_Sub7_Sub3_Sub2.anInt10141 + i_4_ - 1, i_5_ + 1,
					Class315.aClass12Array4179[i].method131((byte) 122,
							1 + i_1_, i_2_), -1
							+ (i_5_ + Class376_Sub7_Sub3_Sub2.anInt10141)))
					|| !(Class181.method1188(1 + i_4_,
							Class315.aClass12Array4179[i].method131((byte) -21,
									i_1_, i_2_ + 1),
							-1 + (i_5_ + Class376_Sub7_Sub3_Sub2.anInt10141),
							i_0_ + -843095752,
							-1 + Class376_Sub7_Sub3_Sub2.anInt10141 + i_4_,
							Class315.aClass12Array4179[i].method131((byte) 123,
									i_1_, i_2_),
							-1 + Class376_Sub7_Sub3_Sub2.anInt10141 + i_4_,
							i_5_ + 1, Class315.aClass12Array4179[i].method131(
									(byte) 122, i_1_ + 1, i_2_ + 1), i_5_ + 1))) {
				Class321_Sub3.anIntArrayArrayArray7024[i][i_2_][i_1_] = -Class11_Sub2_Sub11.anInt8861;
				return false;
			}
			Class2.anInt19++;
			Class321_Sub3.anIntArrayArrayArray7024[i][i_2_][i_1_] = Class11_Sub2_Sub11.anInt8861;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ica.F(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	public static void method3793(int i) {
		try {
			aClass160_9616 = null;
			anIntArrayArray9617 = null;
			if (i == -128)
				aClass146_9618 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ica.G(" + i + ')');
		}
	}

	static final void method3794(boolean bool, int i, int i_6_, byte i_7_,
			int i_8_, int i_9_) {
		try {
			anInt9608++;
			if (Class181.aClass364ArrayArrayArray2336 == null)
				Class321_Sub2.aClass163_6648.method1035(-16777216, i_8_, i_9_,
						(byte) 56, i, i_6_);
			else if ((((Class376_Sub7) Class11_Sub2_Sub8.myPlayer).anInt7045) < 0
					|| (((Class376_Sub7) Class11_Sub2_Sub8.myPlayer).anInt7045) >= Class300.anInt4051 * 512
					|| (((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7031 ^ 0xffffffff) > -1
					|| ((Class108_Sub12.anInt6228 * 512 ^ 0xffffffff) >= (((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7031 ^ 0xffffffff)))
				Class321_Sub2.aClass163_6648.method1035(-16777216, i_8_, i_9_,
						(byte) 66, i, i_6_);
			else {
				Class283.anInt3835++;
				if ((Class11_Sub2_Sub8.myPlayer != null)
						&& ((((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7045 - 256 * (-1 + Class11_Sub2_Sub8.myPlayer
								.method3968((byte) 127))) >> 9 ^ 0xffffffff) == (Class321.anInt4284 ^ 0xffffffff)
						&& ((((Class376_Sub7) Class11_Sub2_Sub8.myPlayer).anInt7031)
								- Class11_Sub2_Sub8.myPlayer
										.method3968((byte) 127) * 256 + 256) >> 9 == Class220_Sub1.anInt7153) {
					Class220_Sub1.anInt7153 = -1;
					Class321.anInt4284 = -1;
					Class11_Sub45_Sub1.method3344(125);
				}
				Class11_Sub7.method2325(-125);
				if (!bool)
					Class91_Sub3_Sub1.method3650((byte) 121);
				Applet_Sub1.method3986(103);
				Class194.method1269(false, true, i_9_, i, i_6_, i_8_);
				i_9_ = Class233.anInt3201;
				i_6_ = IComponentDefinitions.anInt2624;
				i = Class108_Sub16.anInt6545;
				Class117.anInt1597 = Class117.anInt1595;
				i_8_ = Class103.anInt1384;
				if (Class191.anInt2453 != 1) {
					if (Class191.anInt2453 != 4) {
						if ((Class191.anInt2453 ^ 0xffffffff) == -6)
							Class327.method1987(i, -128);
					} else {
						int i_10_ = (int) Class219_Sub1.aFloat7244;
						if (i_10_ < Class300.anInt4050 >> 8)
							i_10_ = Class300.anInt4050 >> 8;
						if (Class11_Sub45_Sub19.aBoolArray9711[4]
								&& ((Class339.anIntArray4488[4] + 128 ^ 0xffffffff) < (i_10_ ^ 0xffffffff)))
							i_10_ = 128 + Class339.anIntArray4488[4];
						int i_11_ = 0x3fff & (int) Class2_Sub8.aFloat6868;
						Class134.method862(
								Class318.method1931(113, Class201.anInt2713,
										Class376_Sub7_Sub2.anInt9242,
										Class38.anInt508) - 200, (byte) -106,
								3 * (i_10_ >> 3) + 600 << 2,
								Class94_Sub4.anInt7728, Class279.anInt3771, i,
								i_11_, i_10_);
					}
				} else {
					int i_12_ = (int) Class219_Sub1.aFloat7244;
					if (i_12_ < Class300.anInt4050 >> 8)
						i_12_ = Class300.anInt4050 >> 8;
					if (Class11_Sub45_Sub19.aBoolArray9711[4]
							&& ((Class339.anIntArray4488[4] + 128 ^ 0xffffffff) < (i_12_ ^ 0xffffffff)))
						i_12_ = 128 + Class339.anIntArray4488[4];
					int i_13_ = 0x3fff & ((int) Class2_Sub8.aFloat6868 - -Class256_Sub2.anInt7703);
					Class134.method862(
							((Class318
									.method1931(
											84,
											((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7031,
											Class376_Sub7_Sub2.anInt9242,
											((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7045)) - 200),
							(byte) -126, client.gameZoom + 3 * (i_12_ >> 3) << 2,
							Class94_Sub4.anInt7728, Class279.anInt3771, i,
							i_13_, i_12_);
				}
				int i_14_ = Class11_Sub45_Sub11.anInt9157;
				if (i_7_ >= -127)
					method3795(null, 111);
				int i_15_ = Class218.anInt3007;
				int i_16_ = Class303.anInt4088;
				int i_17_ = Class266.anInt3616;
				int i_18_ = Class171.anInt2193;
				for (int i_19_ = 0; i_19_ < 5; i_19_++) {
					if (Class11_Sub45_Sub19.aBoolArray9711[i_19_]) {
						int i_20_ = (int) ((Math.random() * (double) (2 * (Class240.anIntArray3256[i_19_]) + 1))
								- (double) Class240.anIntArray3256[i_19_] + (Math
								.sin((double) (Class61.anIntArray903[i_19_])
										* ((double) (Class2_Sub9.anIntArray7273[i_19_]) / 100.0)) * (double) (Class339.anIntArray4488[i_19_])));
						if ((i_19_ ^ 0xffffffff) == -4)
							Class171.anInt2193 = 0x3fff & i_20_
									+ Class171.anInt2193;
						if ((i_19_ ^ 0xffffffff) == -5) {
							Class266.anInt3616 += i_20_;
							if (Class266.anInt3616 >= 1024) {
								if ((Class266.anInt3616 ^ 0xffffffff) < -3073)
									Class266.anInt3616 = 3072;
							} else
								Class266.anInt3616 = 1024;
						}
						if (i_19_ == 2)
							Class303.anInt4088 += i_20_ << 2;
						if (i_19_ == 1)
							Class218.anInt3007 += i_20_ << 2;
						if (i_19_ == 0)
							Class11_Sub45_Sub11.anInt9157 += i_20_ << 2;
					}
				}
				if ((Class11_Sub45_Sub11.anInt9157 ^ 0xffffffff) > -1)
					Class11_Sub45_Sub11.anInt9157 = 0;
				if (Class303.anInt4088 < 0)
					Class303.anInt4088 = 0;
				if (-1 + (Class138.anInt1886 << 9) < Class11_Sub45_Sub11.anInt9157)
					Class11_Sub45_Sub11.anInt9157 = (Class138.anInt1886 << 9) - 1;
				if (((Class82.anInt1133 << 9) - 1 ^ 0xffffffff) > (Class303.anInt4088 ^ 0xffffffff))
					Class303.anInt4088 = -1 + (Class82.anInt1133 << 9);
				Class11_Sub2_Sub33.method3810((byte) 116);
				Class101.method670((byte) -68);
				Class321_Sub2.aClass163_6648.KA(i_8_, i_9_, i_6_ + i_8_, i
						+ i_9_);
				Class11_Sub45_Sub7.method3447(true, (byte) -78);
				if (Class11_Sub2_Sub19.aBool9087) {
					Class11_Sub45_Sub9.method3482((byte) -87,
							Class346.anInt4588);
					if (Class117.anInt1597 != Class73.anInt1012)
						Class333.aBool4411 = true;
					Class73.anInt1012 = Class117.anInt1597;
				} else {
					Class321_Sub2.aClass163_6648.ya();
					int i_21_ = Class346.anInt4588;
					if (Class108_Sub18.aClass141_6924 != null)
						Class108_Sub18.aClass141_6924.method893(i_21_,
								Class171.anInt2193, i_9_, 5063,
								Class11_Sub45_Sub9.anInt8878 << 3,
								Class266.anInt3616, i_8_, i, i_6_,
								Class321_Sub2.aClass163_6648);
					else
						Class321_Sub2.aClass163_6648.GA(i_21_);
				}
				Class34.method304((byte) 69);
				Class236.aClass33_3224.method300(Class11_Sub45_Sub11.anInt9157,
						Class218.anInt3007, Class303.anInt4088,
						0x3fff & -Class266.anInt3616,
						0x3fff & -Class171.anInt2193,
						0x3fff & -Class211.anInt2857);
				Class321_Sub2.aClass163_6648.method1080(Class236.aClass33_3224);
				Class321_Sub2.aClass163_6648.DA(i_8_ - -(i_6_ / 2), i_9_ + i
						/ 2, Class33_Sub2.anInt6670 << 1,
						Class33_Sub2.anInt6670 << 1);
				Class11_Sub2_Sub14.method3544(Class33_Sub2.anInt6670 << 1,
						Class33_Sub2.anInt6670 << 1, 1, i_9_ + i / 2, i_6_ / 2
								+ i_8_);
				Class11_Sub45_Sub4.method3391(-Class171.anInt2193 & 0x3fff,
						Class11_Sub45_Sub11.anInt9157,
						0x3fff & -Class211.anInt2857, Class218.anInt3007,
						0x3fff & -Class266.anInt3616, Class303.anInt4088,
						(byte) 106);
				byte i_22_ = (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub24_5684
						.method3144(false) == 2 ? (byte) Class283.anInt3835
						: (byte) 1);
				if (Class11_Sub2_Sub19.aBool9087) {
					Class376_Sub7_Sub3.method3618(-Class171.anInt2193 & 0x3fff,
							0x3fff & -Class266.anInt3616,
							-Class211.anInt2857 & 0x3fff, -1);
					Class108_Sub23
							.method3129(
									((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047 + 1,
									Class1_Sub1.aByteArrayArrayArray7130,
									Class303.anInt4088,
									Class11_Sub20_Sub2.anIntArray9503,
									i_22_,
									Class234.anIntArray3208,
									Class151.anIntArray2008,
									Class218.anInt3007,
									Class11_Sub45_Sub11.anInt9157,
									Class117.anInt1597,
									true,
									0,
									Class11_Sub25.anInt6279,
									(((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7031 >> 9),
									Class360.anIntArray4696,
									Class221.anIntArray3040,
									((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub20_5687
											.method2935(false) == 0,
									(((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7045 >> 9));
				} else
					Class11_Sub2_Sub5
							.method3393(
									Class11_Sub25.anInt6279,
									Class11_Sub45_Sub11.anInt9157,
									Class218.anInt3007,
									Class303.anInt4088,
									Class1_Sub1.aByteArrayArrayArray7130,
									Class234.anIntArray3208,
									Class151.anIntArray2008,
									Class11_Sub20_Sub2.anIntArray9503,
									Class221.anIntArray3040,
									Class360.anIntArray4696,
									1 + ((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047,
									i_22_,
									(((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7045 >> 9),
									(((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7031 >> 9),
									(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub20_5687
											.method2935(false) ^ 0xffffffff) == -1,
									true,
									(Class11_Sub45_Sub1.aBool8490 ? Class117.anInt1597
											: -1), 0, false);
				Class34.method304((byte) -91);
				if (Class285.anInt3846 == 10) {
					Class3.method81(false, 256, i_6_, i, i_9_, i_8_, 256);
					Class104.method687(i, (byte) 10, i_9_, i_6_, 256, i_8_, 256);
					Class376_Sub7_Sub5.method3796(256, i_6_, i_8_, i_9_, i,
							(byte) -91, 256);
					Class236_Sub3.method2650(i_8_, (byte) 71, i_6_, i_9_, i);
				}
				Class11_Sub50_Sub1.method3473();
				Class218.anInt3007 = i_15_;
				Class303.anInt4088 = i_16_;
				Class11_Sub45_Sub11.anInt9157 = i_14_;
				Class266.anInt3616 = i_17_;
				Class171.anInt2193 = i_18_;
				if (InputStream_Sub1.aBool6286
						&& Class52.aClass187_810.method1230(true) == 0)
					InputStream_Sub1.aBool6286 = false;
				if (InputStream_Sub1.aBool6286) {
					Class321_Sub2.aClass163_6648.method1035(-16777216, i_8_,
							i_9_, (byte) 103, i, i_6_);
					Class11_Sub2_Sub8.method3433(Class161.aClass292_2096,
							(Class26.aClass26_288.method217((byte) 95,
									Class11_Sub45_Sub1_Sub2.anInt9884)), false,
							124, OutputStream_Sub2.aClass107_7949,
							Class321_Sub2.aClass163_6648);
				}
				Class11_Sub45_Sub7.method3447(false, (byte) 125);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ica.E(" + bool + ',' + i + ',' + i_6_ + ',' + i_7_ + ','
							+ i_8_ + ',' + i_9_ + ')'));
		}
	}

	static final int method3795(String string, int i) {
		try {
			anInt9613++;
			int i_23_ = string.length();
			int i_24_ = 0;
			int i_25_ = 0;
			if (i != -27550)
				return -90;
			for (/**/; i_23_ > i_25_; i_25_++)
				i_24_ = (i_24_ << 5) - (i_24_ - string.charAt(i_25_));
			return i_24_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ica.C("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final int[] method2254(int i, boolean bool) {
		try {
			anInt9612++;
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (bool != true)
				method2254(88, true);
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
				int[] is_26_ = this.method2260(4463, 0, i);
				for (int i_27_ = 0; ((Class33_Sub2.anInt6696 ^ 0xffffffff) < (i_27_ ^ 0xffffffff)); i_27_++) {
					int i_28_ = is_26_[i_27_];
					if ((i_28_ ^ 0xffffffff) > (anInt9611 ^ 0xffffffff))
						is[i_27_] = anInt9611;
					else if (i_28_ > anInt9614)
						is[i_27_] = anInt9614;
					else
						is[i_27_] = i_28_;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ica.A(" + i + ','
					+ bool + ')');
		}
	}

	final void method2263(int i, Stream stream, int i_29_) {
		while_187_: do {
			try {
				if (i != 3731)
					aClass160_9616 = null;
				anInt9609++;
				int i_30_ = i_29_;
				while_186_: do {
					do {
						if (i_30_ != 0) {
							if (i_30_ == 1)
								break;
							if ((i_30_ ^ 0xffffffff) != -3)
								break while_187_;
							if (!client.aBool10531)
								break while_186_;
						}
						anInt9611 = stream.readUnsignedShort((byte) -65);
						return;
					} while (false);
					anInt9614 = stream.readUnsignedShort((byte) -65);
					return;
				} while (false);
				((Class11_Sub2) this).aBool5044 = stream
						.readUnsignedByte((byte) 35) == 1;
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("ica.B(" + i + ','
								+ (stream != null ? "{...}" : "null") + ','
								+ i_29_ + ')'));
			}
		} while (false);
	}

	public Class11_Sub2_Sub30() {
		super(1, false);
	}

	final int[][] method2255(int i, int i_31_) {
		try {
			anInt9615++;
			int[][] is = ((Class11_Sub2) this).aClass291_5038.method1799(0, i);
			if (i_31_ != 1)
				method3795(null, -85);
			if (((Class291) ((Class11_Sub2) this).aClass291_5038).aBool3943) {
				int[][] is_32_ = this.method2262(i, -24, 0);
				int[] is_33_ = is_32_[0];
				int[] is_34_ = is_32_[1];
				int[] is_35_ = is_32_[2];
				int[] is_36_ = is[0];
				int[] is_37_ = is[1];
				int[] is_38_ = is[2];
				for (int i_39_ = 0; ((Class33_Sub2.anInt6696 ^ 0xffffffff) < (i_39_ ^ 0xffffffff)); i_39_++) {
					int i_40_ = is_33_[i_39_];
					int i_41_ = is_34_[i_39_];
					int i_42_ = is_35_[i_39_];
					if ((i_40_ ^ 0xffffffff) <= (anInt9611 ^ 0xffffffff)) {
						if (anInt9614 < i_40_)
							is_36_[i_39_] = anInt9614;
						else
							is_36_[i_39_] = i_40_;
					} else
						is_36_[i_39_] = anInt9611;
					if (anInt9611 > i_41_)
						is_37_[i_39_] = anInt9611;
					else if (i_41_ > anInt9614)
						is_37_[i_39_] = anInt9614;
					else
						is_37_[i_39_] = i_41_;
					if (i_42_ >= anInt9611) {
						if (anInt9614 < i_42_)
							is_38_[i_39_] = anInt9614;
						else
							is_38_[i_39_] = i_42_;
					} else
						is_38_[i_39_] = anInt9611;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ica.I(" + i + ','
					+ i_31_ + ')');
		}
	}
}
