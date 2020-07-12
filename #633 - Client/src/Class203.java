/* Class203 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class203 {
	static int anInt2721;
	static int[] anIntArray2722 = { 0, 1, 2, 3, 4, 5, 6, 14 };
	short aShort2723;
	int[] anIntArray2724;
	int[] anIntArray2725;
	short[] aShortArray2726;
	short aShort2727;
	static int anInt2728;
	byte aByte2729;
	static Class253[] aClass253Array2730;
	byte aByte2731;
	short[] aShortArray2732;
	static int anInt2733;
	int[] anIntArray2734;
	short[] aShortArray2735;
	short aShort2736;
	short aShort2737;

	static final void method1291(byte i, int i_0_,
			IComponentDefinitions[] class192s) {
		try {
			if (i != -70)
				method1291((byte) -57, 41, null);
			for (int i_1_ = 0; class192s.length > i_1_; i_1_++) {
				IComponentDefinitions class192 = class192s[i_1_];
				if (class192 != null) {
					if (((IComponentDefinitions) class192).anInt2531 == 0) {
						if (((IComponentDefinitions) class192).aClass192Array2524 != null)
							method1291(
									(byte) -70,
									i_0_,
									(((IComponentDefinitions) class192).aClass192Array2524));
						Class11_Sub24 class11_sub24 = ((Class11_Sub24) (Class75_Sub2.aClass213_7160
								.method1369(
										(byte) 26,
										(long) ((IComponentDefinitions) class192).anInt2471)));
						if (class11_sub24 != null)
							Class11_Sub12_Sub1
									.method3466(
											i_0_,
											-85,
											(((Class11_Sub24) class11_sub24).anInt6233));
					}
					if (i_0_ == 0
							&& ((IComponentDefinitions) class192).anObjectArray2532 != null) {
						Class11_Sub48 class11_sub48 = new Class11_Sub48();
						((Class11_Sub48) class11_sub48).parameters = ((IComponentDefinitions) class192).anObjectArray2532;
						((Class11_Sub48) class11_sub48).aClass192_7999 = class192;
						Class86.method610(class11_sub48);
					}
					if ((i_0_ ^ 0xffffffff) == -2
							&& ((IComponentDefinitions) class192).anObjectArray2563 != null) {
						if (((IComponentDefinitions) class192).anInt2459 >= 0) {
							IComponentDefinitions class192_2_ = Class11_Sub2_Sub13
									.method3533(
											(byte) -85,
											(((IComponentDefinitions) class192).anInt2471));
							if (class192_2_ == null
									|| (((IComponentDefinitions) class192_2_).aClass192Array2524 == null)
									|| ((((IComponentDefinitions) class192_2_).aClass192Array2524).length <= ((IComponentDefinitions) class192).anInt2459)
									|| ((((IComponentDefinitions) class192_2_).aClass192Array2524[((IComponentDefinitions) class192).anInt2459]) != class192))
								continue;
						}
						Class11_Sub48 class11_sub48 = new Class11_Sub48();
						((Class11_Sub48) class11_sub48).parameters = ((IComponentDefinitions) class192).anObjectArray2563;
						((Class11_Sub48) class11_sub48).aClass192_7999 = class192;
						Class86.method610(class11_sub48);
					}
				}
			}
			anInt2728++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("jt.C(" + i + ',' + i_0_ + ','
							+ (class192s != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1292(int i, byte i_3_, Class163 class163, int i_4_,
			int i_5_, Interface1 interface1, int i_6_) {
		do {
			try {
				anInt2733++;
				if (Class164.anInt2133 < 100)
					Class33_Sub1.method2633(interface1, class163, i_3_ ^ ~0x17);
				class163.KA(i_5_, i_4_, i_5_ - -i, i_4_ + i_6_);
				if ((Class164.anInt2133 ^ 0xffffffff) > -101) {
					int i_7_ = 20;
					int i_8_ = i_5_ + i / 2;
					int i_9_ = -18 + i_4_ + (i_6_ / 2 + -i_7_);
					class163.aa(i_5_, i_4_, i, i_6_, -16777216, 0);
					class163.method1051(i_8_ - 152, i_9_, 304, 34,
							Class190.aColorArray2447[Class33_Sub1.anInt6178]
									.getRGB(), 0);
					class163.aa(-150 + i_8_, i_9_ + 2, Class164.anInt2133 * 3,
							30,
							Class281.aColorArray3806[Class33_Sub1.anInt6178]
									.getRGB(), 0);
					Class98.aClass107_1308.method709(i_9_ + i_7_, i_8_, -1,
							false,
							Class291.aColorArray3931[Class33_Sub1.anInt6178]
									.getRGB(), (Class26.aClass26_294.method217(
									(byte) 91,
									Class11_Sub45_Sub1_Sub2.anInt9884)));
				} else {
					int i_10_ = (Class14.anInt124 - (int) ((float) i / Class32.aFloat428));
					int i_11_ = (Class239_Sub2.anInt7912 + (int) ((float) i_6_ / Class32.aFloat428));
					int i_12_ = ((int) ((float) i / Class32.aFloat428) + Class14.anInt124);
					int i_13_ = (Class239_Sub2.anInt7912 + -(int) ((float) i_6_ / Class32.aFloat428));
					Class189.anInt2433 = Class14.anInt124
							+ -(int) ((float) i / Class32.aFloat428);
					Class104.anInt1395 = (Class239_Sub2.anInt7912 + -(int) ((float) i_6_ / Class32.aFloat428));
					Class91_Sub3_Sub1.anInt9343 = (int) ((float) (2 * i) / Class32.aFloat428);
					Class320.anInt4259 = (int) ((float) (2 * i_6_) / Class32.aFloat428);
					Class32.method269(Class32.anInt441 + i_10_,
							Class32.anInt451 + i_11_, i_12_ + Class32.anInt441,
							Class32.anInt451 + i_13_, i_5_, i_4_, i_5_ - -i,
							1 + (i_4_ + i_6_));
					if (i_3_ != -80)
						anIntArray2722 = null;
					Class32.method261(class163);
					Class84 class84 = Class32.method268(class163);
					Class108_Sub22.method2961(class84, class163, 1, 0, 0);
					if ((Class308.anInt4126 ^ 0xffffffff) < -1) {
						Class108.anInt1455--;
						if (Class108.anInt1455 == 0) {
							Class308.anInt4126--;
							Class108.anInt1455 = 20;
						}
					}
					if (!Class107.aBool1454)
						break;
					int i_14_ = i + i_5_ - 5;
					int i_15_ = i_6_ + (i_4_ - 8);
					OutputStream_Sub2.aClass107_7949.method716((byte) -92, -1,
							i_14_, "Fps:" + Class11_Sub2_Sub11.anInt8855,
							16776960, i_15_);
					i_15_ -= 15;
					Runtime runtime = Runtime.getRuntime();
					int i_16_ = (int) ((runtime.totalMemory() + -runtime
							.freeMemory()) / 1024L);
					int i_17_ = 16776960;
					if (i_16_ > 65536)
						i_17_ = 16711680;
					OutputStream_Sub2.aClass107_7949.method716((byte) -92, -1,
							i_14_, ("Mem:" + i_16_ + "k"), i_17_, i_15_);
					i_15_ -= 15;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("jt.B(" + i + ',' + i_3_ + ','
								+ (class163 != null ? "{...}" : "null") + ','
								+ i_4_ + ',' + i_5_ + ','
								+ (interface1 != null ? "{...}" : "null") + ','
								+ i_6_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method1293(int i) {
		do {
			try {
				aClass253Array2730 = null;
				anIntArray2722 = null;
				if (i == -18226)
					break;
				anIntArray2722 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "jt.A(" + i + ')');
			}
			break;
		} while (false);
	}

	Class203(int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_,
			int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_,
			int i_29_, int i_30_) {
		try {
			((Class203) this).anIntArray2724 = new int[4];
			((Class203) this).anIntArray2734 = new int[4];
			((Class203) this).anIntArray2725 = new int[4];
			((Class203) this).aByte2729 = (byte) i_18_;
			((Class203) this).aByte2731 = (byte) i;
			((Class203) this).anIntArray2724[0] = i_19_;
			((Class203) this).anIntArray2724[2] = i_21_;
			((Class203) this).anIntArray2724[1] = i_20_;
			((Class203) this).anIntArray2724[3] = i_22_;
			((Class203) this).anIntArray2734[1] = i_24_;
			((Class203) this).anIntArray2734[3] = i_26_;
			((Class203) this).anIntArray2734[0] = i_23_;
			((Class203) this).anIntArray2734[2] = i_25_;
			((Class203) this).anIntArray2725[0] = i_27_;
			((Class203) this).aShort2723 = (short) (i_19_ >> Class11_Sub2_Sub8.anInt8751);
			((Class203) this).anIntArray2725[1] = i_28_;
			((Class203) this).anIntArray2725[2] = i_29_;
			((Class203) this).anIntArray2725[3] = i_30_;
			((Class203) this).aShort2737 = (short) (i_21_ >> Class11_Sub2_Sub8.anInt8751);
			((Class203) this).aShort2736 = (short) (i_27_ >> Class11_Sub2_Sub8.anInt8751);
			((Class203) this).aShortArray2732 = new short[4];
			((Class203) this).aShort2727 = (short) (i_29_ >> Class11_Sub2_Sub8.anInt8751);
			((Class203) this).aShortArray2726 = new short[4];
			((Class203) this).aShortArray2735 = new short[4];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jt.<init>(" + i + ','
					+ i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ','
					+ i_22_ + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ','
					+ i_26_ + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ','
					+ i_30_ + ')'));
		}
	}
}
