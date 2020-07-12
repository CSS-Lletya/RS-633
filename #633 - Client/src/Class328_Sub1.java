/* Class328_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class328_Sub1 extends Class328 {
	static int anInt6288;
	static int anInt6289;
	static OutgoingPacket aClass370_6290 = new OutgoingPacket(2, 11);
	private int[] anIntArray6291 = new int[512];

	final void method1991(int i, float[] fs, int i_0_, int i_1_, int i_2_,
			float f, float f_3_, float f_4_, float f_5_, int i_6_, int i_7_) {
		try {
			anInt6288++;
			int i_8_ = (int) (-1.0F + (float) i_7_ * f_4_);
			i_8_ &= 0xff;
			int i_9_ = (int) (f * (float) i_6_ - 1.0F);
			i_9_ &= 0xff;
			int i_10_ = (int) ((float) i * f_5_ - 1.0F);
			i_10_ &= 0xff;
			float f_11_ = f_5_ * (float) i_1_;
			int i_12_ = (int) f_11_;
			int i_13_ = 1 + i_12_;
			float f_14_ = (float) -i_12_ + f_11_;
			float f_15_ = -f_14_ + 1.0F;
			float f_16_ = Class11_Sub6_Sub2.method3504(-7700, f_14_);
			i_12_ &= i_10_;
			i_13_ &= i_10_;
			int i_17_ = anIntArray6291[i_12_];
			int i_18_ = anIntArray6291[i_13_];
			if (i_2_ < 43)
				anIntArray6291 = null;
			for (int i_19_ = 0; i_19_ < i_6_; i_19_++) {
				float f_20_ = (float) i_19_ * f;
				int i_21_ = (int) f_20_;
				int i_22_ = 1 + i_21_;
				float f_23_ = f_20_ - (float) i_21_;
				float f_24_ = -f_23_ + 1.0F;
				i_22_ &= i_9_;
				float f_25_ = Class11_Sub6_Sub2.method3504(-7700, f_23_);
				i_21_ &= i_9_;
				int i_26_ = anIntArray6291[i_21_ + i_17_];
				int i_27_ = anIntArray6291[i_22_ - -i_17_];
				int i_28_ = anIntArray6291[i_21_ + i_18_];
				int i_29_ = anIntArray6291[i_18_ + i_22_];
				for (int i_30_ = 0; i_7_ > i_30_; i_30_++) {
					float f_31_ = (float) i_30_ * f_4_;
					int i_32_ = (int) f_31_;
					int i_33_ = i_32_ + 1;
					float f_34_ = f_31_ - (float) i_32_;
					float f_35_ = 1.0F - f_34_;
					i_33_ &= i_8_;
					i_32_ &= i_8_;
					float f_36_ = Class11_Sub6_Sub2.method3504(-7700, f_34_);
					fs[i_0_++] = (Class57_Sub1
							.method2489(
									1,
									(Class57_Sub1.method2489(
											1,
											(Class57_Sub1
													.method2489(
															1,
															(Class11_Sub28
																	.method2719(
																			f_35_,
																			Class77.method529(
																					7,
																					(anIntArray6291[i_32_
																							+ i_26_])),
																			f_24_,
																			(byte) -126,
																			f_15_)),
															(Class11_Sub28
																	.method2719(
																			f_34_,
																			Class77.method529(
																					(anIntArray6291[i_33_
																							+ i_26_]),
																					7),
																			f_24_,
																			(byte) -87,
																			f_15_)),
															f_36_)),
											(Class57_Sub1
													.method2489(
															1,
															(Class11_Sub28
																	.method2719(
																			f_35_,
																			Class77.method529(
																					(anIntArray6291[i_27_
																							+ i_32_]),
																					7),
																			f_23_,
																			(byte) -53,
																			f_15_)),
															(Class11_Sub28
																	.method2719(
																			f_34_,
																			Class77.method529(
																					7,
																					(anIntArray6291[i_27_
																							+ i_33_])),
																			f_23_,
																			(byte) -83,
																			f_15_)),
															f_36_)), f_25_)),
									(Class57_Sub1.method2489(
											1,
											(Class57_Sub1
													.method2489(
															1,
															(Class11_Sub28
																	.method2719(
																			f_35_,
																			Class77.method529(
																					(anIntArray6291[i_28_
																							+ i_32_]),
																					7),
																			f_24_,
																			(byte) -107,
																			f_14_)),
															(Class11_Sub28
																	.method2719(
																			f_34_,
																			Class77.method529(
																					7,
																					(anIntArray6291[i_33_
																							+ i_28_])),
																			f_24_,
																			(byte) -64,
																			f_14_)),
															f_36_)),
											(Class57_Sub1
													.method2489(
															1,
															(Class11_Sub28
																	.method2719(
																			f_35_,
																			Class77.method529(
																					(anIntArray6291[i_32_
																							+ i_29_]),
																					7),
																			f_23_,
																			(byte) -121,
																			f_14_)),
															(Class11_Sub28
																	.method2719(
																			f_34_,
																			Class77.method529(
																					7,
																					(anIntArray6291[i_33_
																							+ i_29_])),
																			f_23_,
																			(byte) -45,
																			f_14_)),
															f_36_)), f_25_)),
									f_16_))
							* f_3_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hi.B(" + i + ','
					+ (fs != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_
					+ ',' + i_2_ + ',' + f + ',' + f_3_ + ',' + f_4_ + ','
					+ f_5_ + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	public static void method2666(byte i) {
		try {
			if (i > 41)
				aClass370_6290 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hi.C(" + i + ')');
		}
	}

	static final void method2667(int i) {
		try {
			int i_37_ = -94 / ((i + 37) / 38);
			anInt6289++;
			if ((Class11_Sub2_Sub7.anInt8734 ^ 0xffffffff) < -2)
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								4,
								(((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub1_5715));
			else
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								2,
								(((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub1_5715));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hi.A(" + i + ')');
		}
	}

	Class328_Sub1(int i) {
		try {
			Random random = new Random((long) i);
			for (int i_38_ = 0; (i_38_ ^ 0xffffffff) > -257; i_38_++)
				anIntArray6291[i_38_] = anIntArray6291[256 + i_38_] = i_38_;
			for (int i_39_ = 0; i_39_ < 256; i_39_++) {
				int i_40_ = random.nextInt() & 0xff;
				int i_41_ = anIntArray6291[i_40_];
				anIntArray6291[i_40_] = anIntArray6291[i_40_ + 256] = anIntArray6291[i_39_];
				anIntArray6291[i_39_] = anIntArray6291[256 + i_39_] = i_41_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hi.<init>(" + i + ')');
		}
	}
}
