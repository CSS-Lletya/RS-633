/* Class351 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class351 {
	static int anInt4618 = 100;
	static int anInt4619;
	static Thread aThread4620;
	static int anInt4621;

	static final void method2103(int i) {
		do {
			try {
				anInt4621++;
				Class11_Sub31.aClass163_6702
						.xa((0.1F * (float) ((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub9_5685
								.method2607(false) + 0.7F)
								* Class11_Sub2_Sub29.aFloat9469);
				Class11_Sub31.aClass163_6702.ZA(Class206_Sub3.anInt6833,
						Class221.aFloat3037, Class245.aFloat3318,
						(float) (Class180.anInt2331 << 2),
						(float) (Class11_Sub2_Sub19.anInt9095 << 2),
						(float) (Class1_Sub1.anInt7118 << 2));
				Class11_Sub31.aClass163_6702
						.method1027(Class372.aClass234_4876);
				if (i == -5100)
					break;
				aThread4620 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "vq.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final boolean method2104(int i, int i_0_, int i_1_) {
		try {
			anInt4619++;
			if (i != 100)
				method2105(null);
			return (0x220 & i_1_) == 544 | (0x18 & i_1_) != 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vq.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method2105(Class376_Sub7 class376_sub7) {
		if (class376_sub7 != null) {
			for (int i = 0; i < 2; i++) {
				Class376_Sub7 class376_sub7_2_ = null;
				for (Class376_Sub7 class376_sub7_3_ = Class382.aClass376_Sub7Array4971[i]; class376_sub7_3_ != null; class376_sub7_3_ = (((Class376_Sub7) class376_sub7_3_).aClass376_Sub7_7032)) {
					if (class376_sub7_3_ == class376_sub7) {
						if (class376_sub7_2_ != null)
							((Class376_Sub7) class376_sub7_2_).aClass376_Sub7_7032 = (((Class376_Sub7) class376_sub7_3_).aClass376_Sub7_7032);
						else
							Class382.aClass376_Sub7Array4971[i] = (((Class376_Sub7) class376_sub7_3_).aClass376_Sub7_7032);
						Class333.aBool4411 = true;
						return;
					}
					class376_sub7_2_ = class376_sub7_3_;
				}
				class376_sub7_2_ = null;
				for (Class376_Sub7 class376_sub7_4_ = Class11_Sub2_Sub25.aClass376_Sub7Array9326[i]; class376_sub7_4_ != null; class376_sub7_4_ = (((Class376_Sub7) class376_sub7_4_).aClass376_Sub7_7032)) {
					if (class376_sub7_4_ == class376_sub7) {
						if (class376_sub7_2_ != null)
							((Class376_Sub7) class376_sub7_2_).aClass376_Sub7_7032 = (((Class376_Sub7) class376_sub7_4_).aClass376_Sub7_7032);
						else
							Class11_Sub2_Sub25.aClass376_Sub7Array9326[i] = (((Class376_Sub7) class376_sub7_4_).aClass376_Sub7_7032);
						Class333.aBool4411 = true;
						return;
					}
					class376_sub7_2_ = class376_sub7_4_;
				}
				class376_sub7_2_ = null;
				for (Class376_Sub7 class376_sub7_5_ = Class11_Sub45_Sub4.aClass376_Sub7Array8534[i]; class376_sub7_5_ != null; class376_sub7_5_ = (((Class376_Sub7) class376_sub7_5_).aClass376_Sub7_7032)) {
					if (class376_sub7_5_ == class376_sub7) {
						if (class376_sub7_2_ != null)
							((Class376_Sub7) class376_sub7_2_).aClass376_Sub7_7032 = (((Class376_Sub7) class376_sub7_5_).aClass376_Sub7_7032);
						else
							Class11_Sub45_Sub4.aClass376_Sub7Array8534[i] = (((Class376_Sub7) class376_sub7_5_).aClass376_Sub7_7032);
						Class333.aBool4411 = true;
						return;
					}
					class376_sub7_2_ = class376_sub7_5_;
				}
			}
		}
	}

	public static void method2106(int i) {
		try {
			if (i != 24)
				aThread4620 = null;
			aThread4620 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vq.C(" + i + ')');
		}
	}
}
