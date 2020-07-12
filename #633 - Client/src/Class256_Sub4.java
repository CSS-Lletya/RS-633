/* Class256_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class256_Sub4 extends Class256 {
	static int anInt7959;
	static int anInt7960;
	private int anInt7961;
	private int anInt7962;
	private int anInt7963;
	static int anInt7964;
	static int anInt7965;
	static int anInt7966;
	static int anInt7967;
	private int anInt7968;

	static final Class254_Sub3 method3199(byte i, Stream stream) {
		try {
			if (i != 48)
				method3199((byte) 87, null);
			anInt7967++;
			Class254 class254 = Class262.method1670(stream, (byte) -128);
			int i_0_ = stream.readInt(i + 48);
			int i_1_ = stream.readInt(i ^ 0x5b);
			return new Class254_Sub3(((Class254) class254).aClass118_3483,
					((Class254) class254).aClass150_3492,
					((Class254) class254).anInt3487,
					((Class254) class254).anInt3491,
					((Class254) class254).anInt3489,
					((Class254) class254).anInt3490,
					((Class254) class254).anInt3481,
					((Class254) class254).anInt3480,
					((Class254) class254).anInt3488, i_0_, i_1_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wc.D(" + i + ','
					+ (stream != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1637(boolean bool, int i, int i_2_) {
		do {
			try {
				anInt7960++;
				if (bool == false)
					break;
				anInt7962 = -88;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("wc.C(" + bool
						+ ',' + i + ',' + i_2_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method3200(Class163 class163, int i, byte i_3_,
			Class203 class203) {
		try {
			anInt7959++;
			if (Class138.anIntArray1885 != null
					&& (i ^ 0xffffffff) >= (((Class203) class203).aByte2729 ^ 0xffffffff)) {
				for (int i_4_ = 0; ((i_4_ ^ 0xffffffff) > (Class138.anIntArray1885.length ^ 0xffffffff)); i_4_++) {
					if (Class138.anIntArray1885[i_4_] != -1000000
							&& (((((Class203) class203).anIntArray2734[0] ^ 0xffffffff) >= (Class138.anIntArray1885[i_4_] ^ 0xffffffff))
									|| ((((Class203) class203).anIntArray2734[1] ^ 0xffffffff) >= (Class138.anIntArray1885[i_4_] ^ 0xffffffff))
									|| ((Class138.anIntArray1885[i_4_] ^ 0xffffffff) <= (((Class203) class203).anIntArray2734[2] ^ 0xffffffff)) || ((Class138.anIntArray1885[i_4_] ^ 0xffffffff) <= (((Class203) class203).anIntArray2734[3] ^ 0xffffffff)))
							&& ((((Class203) class203).anIntArray2724[0] <= Class112.anIntArray1535[i_4_])
									|| ((((Class203) class203).anIntArray2724[1] ^ 0xffffffff) >= (Class112.anIntArray1535[i_4_] ^ 0xffffffff))
									|| ((((Class203) class203).anIntArray2724[2] ^ 0xffffffff) >= (Class112.anIntArray1535[i_4_] ^ 0xffffffff)) || (Class112.anIntArray1535[i_4_] >= ((Class203) class203).anIntArray2724[3]))
							&& ((((Class203) class203).anIntArray2724[0] >= Class112.anIntArray1538[i_4_])
									|| ((((Class203) class203).anIntArray2724[1] ^ 0xffffffff) <= (Class112.anIntArray1538[i_4_] ^ 0xffffffff))
									|| ((Class112.anIntArray1538[i_4_] ^ 0xffffffff) >= (((Class203) class203).anIntArray2724[2] ^ 0xffffffff)) || (((Class203) class203).anIntArray2724[3] >= Class112.anIntArray1538[i_4_]))
							&& ((Class108_Sub27.anIntArray7864[i_4_] >= ((Class203) class203).anIntArray2725[0])
									|| ((((Class203) class203).anIntArray2725[1] ^ 0xffffffff) >= (Class108_Sub27.anIntArray7864[i_4_] ^ 0xffffffff))
									|| (Class108_Sub27.anIntArray7864[i_4_] >= ((Class203) class203).anIntArray2725[2]) || (((Class203) class203).anIntArray2725[3] <= Class108_Sub27.anIntArray7864[i_4_]))
							&& (((((Class203) class203).anIntArray2725[0] ^ 0xffffffff) <= (Class242.anIntArray3290[i_4_] ^ 0xffffffff))
									|| (((Class203) class203).anIntArray2725[1] >= Class242.anIntArray3290[i_4_])
									|| (Class242.anIntArray3290[i_4_] <= ((Class203) class203).anIntArray2725[2]) || (((Class203) class203).anIntArray2725[3] >= Class242.anIntArray3290[i_4_])))
						return;
				}
			}
			if (i_3_ <= 22)
				method3201(-87, -70);
			if ((((Class203) class203).aByte2731 ^ 0xffffffff) == -2) {
				int i_5_ = (Class94_Sub4.anInt7730
						+ ((Class203) class203).aShort2723 - Class11_Sub45_Sub7.anInt8807);
				if ((i_5_ ^ 0xffffffff) <= -1
						&& (Class94_Sub4.anInt7730 + Class94_Sub4.anInt7730 ^ 0xffffffff) <= (i_5_ ^ 0xffffffff)) {
					int i_6_ = (Class94_Sub4.anInt7730 + (((Class203) class203).aShort2736 - Class15.anInt134));
					if (i_6_ >= 0) {
						if ((Class94_Sub4.anInt7730 + Class94_Sub4.anInt7730 ^ 0xffffffff) > (i_6_ ^ 0xffffffff))
							return;
					} else
						i_6_ = 0;
					int i_7_ = (-Class15.anInt134
							+ ((Class203) class203).aShort2727 + Class94_Sub4.anInt7730);
					if (Class94_Sub4.anInt7730 + Class94_Sub4.anInt7730 < i_7_)
						i_7_ = Class94_Sub4.anInt7730 + Class94_Sub4.anInt7730;
					else if (i_7_ < 0)
						return;
					boolean bool = false;
					while ((i_6_ ^ 0xffffffff) >= (i_7_ ^ 0xffffffff)) {
						if (Class11_Sub2_Sub19.aBoolArrayArray9091[i_5_][i_6_++]) {
							bool = true;
							break;
						}
					}
					if (bool) {
						float f = (float) (-((Class203) class203).anIntArray2724[0] + Class11_Sub2_Sub25.anInt9333);
						if (f < 0.0F)
							f *= -1.0F;
						if (!(f < (float) InterfaceSettings.anInt5353)
								&& Class23.method205(0, class203, (byte) -83)
								&& Class23.method205(1, class203, (byte) -83)
								&& Class23.method205(2, class203, (byte) -83)
								&& Class23.method205(3, class203, (byte) -83))
							Class93.aClass203Array1248[Class108_Sub16.anInt6551++] = class203;
					}
				}
			} else if ((((Class203) class203).aByte2731 ^ 0xffffffff) == -3) {
				int i_8_ = (Class94_Sub4.anInt7730 + (-Class15.anInt134 + ((Class203) class203).aShort2736));
				if ((i_8_ ^ 0xffffffff) <= -1
						&& (i_8_ <= Class94_Sub4.anInt7730
								- -Class94_Sub4.anInt7730)) {
					int i_9_ = (((Class203) class203).aShort2723
							+ -Class11_Sub45_Sub7.anInt8807 - -Class94_Sub4.anInt7730);
					if (i_9_ < 0)
						i_9_ = 0;
					else if (i_9_ > Class94_Sub4.anInt7730
							+ Class94_Sub4.anInt7730)
						return;
					int i_10_ = (Class94_Sub4.anInt7730
							+ ((Class203) class203).aShort2737 - Class11_Sub45_Sub7.anInt8807);
					if ((Class94_Sub4.anInt7730 + Class94_Sub4.anInt7730 ^ 0xffffffff) > (i_10_ ^ 0xffffffff))
						i_10_ = Class94_Sub4.anInt7730 + Class94_Sub4.anInt7730;
					else if ((i_10_ ^ 0xffffffff) > -1)
						return;
					boolean bool = false;
					while (i_10_ >= i_9_) {
						if (Class11_Sub2_Sub19.aBoolArrayArray9091[i_9_++][i_8_]) {
							bool = true;
							break;
						}
					}
					if (bool) {
						float f = (float) (-((Class203) class203).anIntArray2725[0] + Class108_Sub3.anInt5330);
						if (f < 0.0F)
							f *= -1.0F;
						if (!(f < (float) InterfaceSettings.anInt5353)
								&& Class23.method205(0, class203, (byte) -83)
								&& Class23.method205(1, class203, (byte) -83)
								&& Class23.method205(2, class203, (byte) -83)
								&& Class23.method205(3, class203, (byte) -83))
							Class93.aClass203Array1248[Class108_Sub16.anInt6551++] = class203;
					}
				}
			} else if (((Class203) class203).aByte2731 == 16
					|| ((((Class203) class203).aByte2731 ^ 0xffffffff) == -9)) {
				int i_11_ = (((Class203) class203).aShort2723 + (-Class11_Sub45_Sub7.anInt8807 + Class94_Sub4.anInt7730));
				if ((i_11_ ^ 0xffffffff) <= -1
						&& ((i_11_ ^ 0xffffffff) >= (Class94_Sub4.anInt7730
								+ Class94_Sub4.anInt7730 ^ 0xffffffff))) {
					int i_12_ = (Class94_Sub4.anInt7730 + (-Class15.anInt134 + ((Class203) class203).aShort2736));
					if (i_12_ >= 0
							&& (Class94_Sub4.anInt7730 + Class94_Sub4.anInt7730 >= i_12_)
							&& (Class11_Sub2_Sub19.aBoolArrayArray9091[i_11_][i_12_])) {
						float f = (float) (-((Class203) class203).anIntArray2724[0] + Class11_Sub2_Sub25.anInt9333);
						if (f < 0.0F)
							f *= -1.0F;
						float f_13_ = (float) (Class108_Sub3.anInt5330 - (((Class203) class203).anIntArray2725[0]));
						if (f_13_ < 0.0F)
							f_13_ *= -1.0F;
						if ((!(f < (float) InterfaceSettings.anInt5353) || !((float) InterfaceSettings.anInt5353 > f_13_))
								&& Class23.method205(0, class203, (byte) -83)
								&& Class23.method205(1, class203, (byte) -83)
								&& Class23.method205(2, class203, (byte) -83)
								&& Class23.method205(3, class203, (byte) -83))
							Class93.aClass203Array1248[Class108_Sub16.anInt6551++] = class203;
					}
				}
			} else if ((((Class203) class203).aByte2731 ^ 0xffffffff) == -5) {
				float f = (float) (((Class203) class203).anIntArray2734[0] + -Class235.anInt3215);
				if (!(f <= (float) Class367.anInt4830)) {
					int i_14_ = (((Class203) class203).aShort2736
							+ -Class15.anInt134 - -Class94_Sub4.anInt7730);
					if (i_14_ >= 0) {
						if ((Class94_Sub4.anInt7730 + Class94_Sub4.anInt7730 ^ 0xffffffff) > (i_14_ ^ 0xffffffff))
							return;
					} else
						i_14_ = 0;
					int i_15_ = (((Class203) class203).aShort2727
							+ -Class15.anInt134 - -Class94_Sub4.anInt7730);
					if ((i_15_ ^ 0xffffffff) >= (Class94_Sub4.anInt7730
							+ Class94_Sub4.anInt7730 ^ 0xffffffff)) {
						if ((i_15_ ^ 0xffffffff) > -1)
							return;
					} else
						i_15_ = Class94_Sub4.anInt7730 + Class94_Sub4.anInt7730;
					int i_16_ = (Class94_Sub4.anInt7730
							+ ((Class203) class203).aShort2723 - Class11_Sub45_Sub7.anInt8807);
					if ((i_16_ ^ 0xffffffff) <= -1) {
						if (Class94_Sub4.anInt7730 - -Class94_Sub4.anInt7730 < i_16_)
							return;
					} else
						i_16_ = 0;
					int i_17_ = (Class94_Sub4.anInt7730
							+ -Class11_Sub45_Sub7.anInt8807 + ((Class203) class203).aShort2737);
					if ((Class94_Sub4.anInt7730 + Class94_Sub4.anInt7730 ^ 0xffffffff) > (i_17_ ^ 0xffffffff))
						i_17_ = Class94_Sub4.anInt7730 + Class94_Sub4.anInt7730;
					else if (i_17_ < 0)
						return;
					boolean bool = false;
					while_85_: for (int i_18_ = i_16_; (i_18_ ^ 0xffffffff) >= (i_17_ ^ 0xffffffff); i_18_++) {
						for (int i_19_ = i_14_; i_19_ <= i_15_; i_19_++) {
							if (Class11_Sub2_Sub19.aBoolArrayArray9091[i_18_][i_19_]) {
								bool = true;
								break while_85_;
							}
						}
					}
					if (bool && Class23.method205(0, class203, (byte) -83)
							&& Class23.method205(1, class203, (byte) -83)
							&& Class23.method205(2, class203, (byte) -83)
							&& Class23.method205(3, class203, (byte) -83))
						Class93.aClass203Array1248[Class108_Sub16.anInt6551++] = class203;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("wc.F("
							+ (class163 != null ? "{...}" : "null") + ',' + i
							+ ',' + i_3_ + ','
							+ (class203 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3201(int i, int i_20_) {
		try {
			anInt7966++;
			Class221.anIntArray3040 = new int[i];
			Class151.anIntArray2008 = new int[i];
			Class234.anIntArray3208 = new int[i];
			Class360.anIntArray4696 = new int[i];
			Class11_Sub20_Sub2.anIntArray9503 = new int[i];
			if (i_20_ != 3721)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wc.B(" + i + ','
					+ i_20_ + ')');
		}
	}

	Class256_Sub4(int i, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_) {
		super(-1, i_24_, i_25_);
		try {
			anInt7963 = i;
			anInt7961 = i_23_;
			anInt7968 = i_21_;
			anInt7962 = i_22_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wc.<init>(" + i + ','
					+ i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ','
					+ i_25_ + ')'));
		}
	}

	final void method1636(int i, int i_26_, int i_27_) {
		try {
			int i_28_ = 59 % ((-7 - i_26_) / 42);
			anInt7965++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wc.E(" + i + ','
					+ i_26_ + ',' + i_27_ + ')'));
		}
	}

	final void method1639(int i, int i_29_, int i_30_) {
		try {
			anInt7964++;
			int i_31_ = i_30_ * anInt7963 >> 12;
			if (i_29_ == -12939) {
				int i_32_ = i_30_ * anInt7962 >> 12;
				int i_33_ = i * anInt7968 >> 12;
				int i_34_ = i * anInt7961 >> 12;
				Class75_Sub1.method2407(i_31_, i_32_, true,
						((Class256) this).anInt3506, i_34_, i_33_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wc.A(" + i + ','
					+ i_29_ + ',' + i_30_ + ')'));
		}
	}
}
