/* Class194 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class194 {
	static Class16 aClass16_2639;
	static Class146 aClass146_2640;
	static int anInt2641;
	static int anInt2642;
	static int anInt2643;
	static int[] anIntArray2644 = { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
	static int anInt2645;
	static int[] anIntArray2646;

	static final void method1269(boolean bool, boolean bool_0_, int i,
			int i_1_, int i_2_, int i_3_) {
		try {
			if (i_2_ < 1)
				i_2_ = 1;
			if ((i_1_ ^ 0xffffffff) > -2)
				i_1_ = 1;
			anInt2643++;
			int i_4_ = i_1_ - 334;
			if ((i_4_ ^ 0xffffffff) <= -1) {
				if (i_4_ > 100)
					i_4_ = 100;
			} else
				i_4_ = 0;
			int i_5_ = (Class376_Sub7_Sub2_Sub1.aShort10202 - -(i_4_
					* (Class11_Sub2_Sub14.aShort9014 - Class376_Sub7_Sub2_Sub1.aShort10202) / 100));
			if (bool == false) {
				if ((Class11_Sub49.aShort8017 ^ 0xffffffff) >= (i_5_ ^ 0xffffffff)) {
					if ((Class254.aShort3497 ^ 0xffffffff) > (i_5_ ^ 0xffffffff))
						i_5_ = Class254.aShort3497;
				} else
					i_5_ = Class11_Sub49.aShort8017;
				int i_6_ = 512 * (i_5_ * i_1_) / (i_2_ * 334);
				if (i_6_ >= Class51.aShort799) {
					if (Class266.aShort3617 < i_6_) {
						i_6_ = Class266.aShort3617;
						i_5_ = 334 * (i_2_ * i_6_) / (i_1_ * 512);
						if (i_5_ < Class11_Sub49.aShort8017) {
							i_5_ = Class11_Sub49.aShort8017;
							int i_7_ = i_6_ * i_2_ * 334 / (512 * i_5_);
							int i_8_ = (i_1_ - i_7_) / 2;
							if (bool_0_) {
								Class321_Sub2.aClass163_6648.la();
								Class321_Sub2.aClass163_6648.method1035(
										-16777216, i_3_, i, (byte) 115, i_8_,
										i_2_);
								Class321_Sub2.aClass163_6648.method1035(
										-16777216, i_3_, i_1_ + i - i_8_,
										(byte) 58, i_8_, i_2_);
							}
							i += i_8_;
							i_1_ -= 2 * i_8_;
						}
					}
				} else {
					i_6_ = Class51.aShort799;
					i_5_ = i_6_ * (i_2_ * 334) / (i_1_ * 512);
					if (i_5_ > Class254.aShort3497) {
						i_5_ = Class254.aShort3497;
						int i_9_ = i_5_ * (i_1_ * 512) / (i_6_ * 334);
						int i_10_ = (i_2_ - i_9_) / 2;
						if (bool_0_) {
							Class321_Sub2.aClass163_6648.la();
							Class321_Sub2.aClass163_6648.method1035(-16777216,
									i_3_, i, (byte) 105, i_1_, i_10_);
							Class321_Sub2.aClass163_6648.method1035(-16777216,
									-i_10_ + (i_2_ + i_3_), i, (byte) 92, i_1_,
									i_10_);
						}
						i_2_ -= 2 * i_10_;
						i_3_ += i_10_;
					}
				}
				Class33_Sub2.anInt6670 = i_5_ * i_1_ / 334;
				Class103.anInt1384 = i_3_;
				Class108_Sub16.anInt6545 = (short) i_1_;
				Class233.anInt3201 = i;
				IComponentDefinitions.anInt2624 = (short) i_2_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("jd.C(" + bool + ',' + bool_0_ + ',' + i + ',' + i_1_
							+ ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final Class292 method1270(Class146 class146, int i, int i_11_) {
		try {
			anInt2642++;
			byte[] is = class146.method938(i_11_, 0);
			if (i != 2)
				aClass16_2639 = null;
			if (is == null)
				return null;
			return new Class292(is);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jd.B("
					+ (class146 != null ? "{...}" : "null") + ',' + i + ','
					+ i_11_ + ')'));
		}
	}

	public static void method1271(int i) {
		do {
			try {
				anIntArray2646 = null;
				anIntArray2644 = null;
				aClass16_2639 = null;
				aClass146_2640 = null;
				if (i == -3778)
					break;
				anIntArray2644 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "jd.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static {
		aClass16_2639 = new Class16();
		anIntArray2646 = new int[2];
	}
}
