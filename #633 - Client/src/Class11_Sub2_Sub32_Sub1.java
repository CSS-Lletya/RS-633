/* Class11_Sub2_Sub32_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub32_Sub1 extends Class11_Sub2_Sub32 {
	static int anInt9888;
	static IComponentDefinitions aClass192_9889 = null;
	static int anInt9890;
	static Interface10 anInterface10_9891;
	static int anInt9892;
	static int anInt9893;
	static int anInt9894;

	static final void method3879(int i, byte i_0_, int i_1_,
			IComponentDefinitions class192) {
		do {
			try {
				anInt9888++;
				if (Class204.aBool2739) {
					Class283 class283 = ((Class254_Sub3.anInt8048 ^ 0xffffffff) != 0 ? Class187.aClass52_2388
							.method432((Class254_Sub3.anInt8048), (byte) -125)
							: null);
					if (client.method4013(class192).method2351(127)
							&& (Class322.anInt4312 & 0x20) != 0
							&& (class283 == null || (class192.method1242(
									(((Class283) class283).anInt3827),
									Class254_Sub3.anInt8048, (byte) 30) != ((Class283) class283).anInt3827))) {
						Class108_Sub22
								.method2963(
										false,
										((IComponentDefinitions) class192).anInt2471,
										((IComponentDefinitions) class192).anInt2467,
										Class374.aString4890,
										false,
										Class11_Sub2_Sub15.anInt9021,
										true,
										30,
										(long) (((IComponentDefinitions) class192).anInt2459 << 0 | ((IComponentDefinitions) class192).anInt2471),
										0L,
										(Class250.aString3444 + " -> " + ((IComponentDefinitions) class192).aString2506),
										((IComponentDefinitions) class192).anInt2459,
										0);
						Class336.anInt4447++;
					}
				}
				if (i_0_ < 94)
					aClass192_9889 = null;
				for (int i_2_ = 9; (i_2_ ^ 0xffffffff) <= -6; i_2_--) {
					String string = Class11_Sub2_Sub33.method3807(i_2_,
							(byte) 113, class192);
					if (string != null) {
						Class108_Sub22
								.method2963(
										false,
										((IComponentDefinitions) class192).anInt2471,
										((IComponentDefinitions) class192).anInt2467,
										string,
										false,
										Class98.method663(class192, 19161, i_2_),
										true,
										1002,
										(long) (((IComponentDefinitions) class192).anInt2459 << 0 | ((IComponentDefinitions) class192).anInt2471),
										(long) (i_2_ + 1),
										((IComponentDefinitions) class192).aString2506,
										((IComponentDefinitions) class192).anInt2459,
										0);
						Class11_Sub2_Sub21.anInt9201++;
					}
				}
				String string = Class11_Sub45_Sub3.method3384(class192, -10402);
				if (string != null) {
					Class108_Sub22
							.method2963(
									false,
									((IComponentDefinitions) class192).anInt2471,
									((IComponentDefinitions) class192).anInt2467,
									string,
									false,
									((IComponentDefinitions) class192).anInt2622,
									true,
									15,
									(long) (((IComponentDefinitions) class192).anInt2471 | ((IComponentDefinitions) class192).anInt2459 << 0),
									0L,
									((IComponentDefinitions) class192).aString2506,
									((IComponentDefinitions) class192).anInt2459,
									0);
					Class84.anInt1152++;
				}
				for (int i_3_ = 4; i_3_ >= 0; i_3_--) {
					String string_4_ = Class11_Sub2_Sub33.method3807(i_3_,
							(byte) 113, class192);
					if (string_4_ != null) {
						Class11_Sub2_Sub21.anInt9201++;
						Class108_Sub22
								.method2963(
										false,
										((IComponentDefinitions) class192).anInt2471,
										((IComponentDefinitions) class192).anInt2467,
										string_4_,
										false,
										Class98.method663(class192, 19161, i_3_),
										true,
										25,
										(long) (((IComponentDefinitions) class192).anInt2459 << 0 | ((IComponentDefinitions) class192).anInt2471),
										(long) (1 + i_3_),
										((IComponentDefinitions) class192).aString2506,
										((IComponentDefinitions) class192).anInt2459,
										0);
					}
				}
				if (!client.method4013(class192).method2355(-124))
					break;
				if (((IComponentDefinitions) class192).aString2504 == null)
					Class108_Sub22
							.method2963(
									false,
									((IComponentDefinitions) class192).anInt2471,
									((IComponentDefinitions) class192).anInt2467,
									(Class26.aClass26_285.method217((byte) 88,
											Class11_Sub45_Sub1_Sub2.anInt9884)),
									false,
									-1,
									true,
									12,
									(long) (((IComponentDefinitions) class192).anInt2471 | ((IComponentDefinitions) class192).anInt2459 << 0),
									0L,
									"",
									((IComponentDefinitions) class192).anInt2459,
									0);
				else
					Class108_Sub22
							.method2963(
									false,
									((IComponentDefinitions) class192).anInt2471,
									((IComponentDefinitions) class192).anInt2467,
									((IComponentDefinitions) class192).aString2504,
									false,
									-1,
									true,
									12,
									(long) (((IComponentDefinitions) class192).anInt2459 << 0 | ((IComponentDefinitions) class192).anInt2471),
									0L,
									"",
									((IComponentDefinitions) class192).anInt2459,
									0);
				Class194.anInt2645++;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("lca.G(" + i + ','
						+ i_0_ + ',' + i_1_ + ','
						+ (class192 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final int[][] method2255(int i, int i_5_) {
		try {
			anInt9893++;
			int[][] is = ((Class11_Sub2) this).aClass291_5038.method1799(0, i);
			if (((Class291) ((Class11_Sub2) this).aClass291_5038).aBool3943
					&& this.method3803(2250)) {
				int[] is_6_ = is[0];
				int[] is_7_ = is[1];
				int[] is_8_ = is[2];
				int i_9_ = (((Class11_Sub2_Sub32) this).anInt9648 * (i % ((Class11_Sub2_Sub32) this).anInt9648));
				for (int i_10_ = 0; ((Class33_Sub2.anInt6696 ^ 0xffffffff) < (i_10_ ^ 0xffffffff)); i_10_++) {
					int i_11_ = (((Class11_Sub2_Sub32) this).anIntArray9657[(i_10_
							% ((Class11_Sub2_Sub32) this).anInt9656 + i_9_)]);
					is_8_[i_10_] = Class77.method529(255, i_11_) << 4;
					is_7_[i_10_] = Class77.method529(65280, i_11_) >> 4;
					is_6_[i_10_] = Class77.method529(4080, i_11_ >> 12);
				}
			}
			if (i_5_ != 1)
				method3879(93, (byte) -47, 112, null);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lca.I(" + i + ','
					+ i_5_ + ')');
		}
	}

	public static void method3880(int i) {
		try {
			if (i > -72)
				aClass192_9889 = null;
			anInterface10_9891 = null;
			aClass192_9889 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lca.E(" + i + ')');
		}
	}

	static final void method3881(int i) {
		try {
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							1,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub27_5718));
			anInt9890++;
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							1,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub27_5707));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							2,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub24_5682));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							2,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub24_5684));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							1,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub3_5703));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							i ^ ~0xee1dc08,
							1,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub16_5721));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							i ^ ~0xee1dc08,
							1,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub18_5686));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							1,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub20_5687));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							1,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub21_5700));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							i + 249682953,
							1,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub6_5697));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							i + 249682953,
							2,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub26_5717));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							1,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub11_5723));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							2,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub5_5695));
			if (i == -1) {
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								1,
								(((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub19_5732));
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								0,
								(((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub15_5712));
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								0,
								(((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub15_5728));
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								2,
								(((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub4_5691));
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								0,
								(((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub29_5689));
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								0,
								(((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub23_5699));
				Class328_Sub1.method2667(15);
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								0,
								(((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub10_5727));
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								4,
								(((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub7_5683));
				Class108_Sub13.method2653((byte) -109);
				Class376_Sub1.method2276(16711680);
				Class295.aBool3989 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lca.H(" + i + ')');
		}
	}

	public Class11_Sub2_Sub32_Sub1() {
		/* empty */
	}

	static final void method3882(int i, int i_12_, int i_13_, boolean bool,
			int i_14_, int i_15_, int i_16_) {
		try {
			anInt9894++;
			int i_17_ = Class244.method1540(i_15_, Class292.anInt3962, false,
					Class351.anInt4618);
			int i_18_ = Class244.method1540(i_12_, Class292.anInt3962, !bool,
					Class351.anInt4618);
			int i_19_ = Class244.method1540(i_16_, Class26.anInt340, false,
					Class11_Sub45_Sub1_Sub2.anInt9880);
			int i_20_ = Class244.method1540(i_13_, Class26.anInt340, false,
					Class11_Sub45_Sub1_Sub2.anInt9880);
			int i_21_ = Class244.method1540(i + i_15_, Class292.anInt3962,
					!bool, Class351.anInt4618);
			int i_22_ = Class244.method1540(i_12_ - i, Class292.anInt3962,
					false, Class351.anInt4618);
			for (int i_23_ = i_17_; i_23_ < i_21_; i_23_++)
				method3883(i_19_, Class297.anIntArrayArray4026[i_23_],
						(byte) 116, i_14_, i_20_);
			for (int i_24_ = i_18_; i_24_ > i_22_; i_24_--)
				method3883(i_19_, Class297.anIntArrayArray4026[i_24_],
						(byte) 85, i_14_, i_20_);
			if (bool == true) {
				int i_25_ = Class244.method1540(i_16_ + i, Class26.anInt340,
						false, Class11_Sub45_Sub1_Sub2.anInt9880);
				int i_26_ = Class244.method1540(i_13_ + -i, Class26.anInt340,
						false, Class11_Sub45_Sub1_Sub2.anInt9880);
				for (int i_27_ = i_21_; (i_22_ ^ 0xffffffff) <= (i_27_ ^ 0xffffffff); i_27_++) {
					int[] is = Class297.anIntArrayArray4026[i_27_];
					method3883(i_19_, is, (byte) 127, i_14_, i_25_);
					method3883(i_26_, is, (byte) 123, i_14_, i_20_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lca.C(" + i + ','
					+ i_12_ + ',' + i_13_ + ',' + bool + ',' + i_14_ + ','
					+ i_15_ + ',' + i_16_ + ')'));
		}
	}

	static final void method3883(int i, int[] is, byte i_28_, int i_29_,
			int i_30_) {
		do {
			try {
				i--;
				anInt9892++;
				int i_31_ = --i_30_ - 7;
				while ((i_31_ ^ 0xffffffff) < (i ^ 0xffffffff)) {
					is[++i] = i_29_;
					is[++i] = i_29_;
					is[++i] = i_29_;
					is[++i] = i_29_;
					is[++i] = i_29_;
					is[++i] = i_29_;
					is[++i] = i_29_;
					is[++i] = i_29_;
				}
				while ((i_30_ ^ 0xffffffff) < (i ^ 0xffffffff))
					is[++i] = i_29_;
				if (i_28_ >= 47)
					break;
				method3879(59, (byte) 109, 62, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("lca.F(" + i + ','
						+ (is != null ? "{...}" : "null") + ',' + i_28_ + ','
						+ i_29_ + ',' + i_30_ + ')'));
			}
			break;
		} while (false);
	}
}
