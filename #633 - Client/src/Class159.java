/* Class159 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class159 {
	static int[] anIntArray2072;
	static int[][] anIntArrayArray2073 = { { 2, 4 }, { 2, 4 }, { 5, 2, 4 },
			{ 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 },
			{ 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 },
			{ 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 },
			{ 1, 6, 7, 1 }, { 1, 6, 7, 1 } };
	static int anInt2074;

	static final void method986(int i, Class163 class163) {
		try {
			anInt2074++;
			int i_0_ = 0;
			int i_1_ = 0;
			if (Class11_Sub2_Sub19.aBool9087) {
				i_0_ = Class54.method443(5467);
				i_1_ = Class376_Sub7_Sub4_Sub1.method3887((byte) -113);
			}
			int i_2_ = Class319.anInt4242 - -i_0_;
			int i_3_ = Class144.anInt1944 - -i_1_;
			int i_4_ = Class205.anInt2757;
			int i_5_ = Class239_Sub1.anInt7270 - 3;
			int i_6_ = 20;
			Class2_Sub5.method2405(i_0_ + Class319.anInt4242, i_6_,
					(byte) -111, Class205.anInt2757, Class26.aClass26_300
							.method217((byte) 125,
									Class11_Sub45_Sub1_Sub2.anInt9884),
					Class144.anInt1944 - -i_1_, Class239_Sub1.anInt7270,
					class163);
			if (i != -31204)
				anIntArray2072 = null;
			int i_7_ = i_0_ + Class280.aClass225_3786.method1449(-116);
			int i_8_ = Class280.aClass225_3786.method1448((byte) -63) + i_1_;
			if (Class11_Sub2_Sub14.aBool9015) {
				int i_9_ = 0;
				for (Class11_Sub45_Sub14 class11_sub45_sub14 = ((Class11_Sub45_Sub14) Class161.aClass38_2097
						.method331((byte) -7)); class11_sub45_sub14 != null; class11_sub45_sub14 = ((Class11_Sub45_Sub14) Class161.aClass38_2097
						.method333(-90))) {
					int i_10_ = i_3_ - (-i_6_ - 13 + -(i_9_ * 16));
					i_9_++;
					if (((Class319.anInt4242 - -i_0_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff))
							&& (Class205.anInt2757 + i_0_ + Class319.anInt4242 > i_7_)
							&& i_10_ - 13 < i_8_
							&& (4 + i_10_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff)
							&& ((((Class11_Sub45_Sub14) class11_sub45_sub14).anInt9313) > 1 || ((Class11_Sub45_Sub5) (Class11_Sub45_Sub5) (((Class11_Sub45) ((Class38) (((Class11_Sub45_Sub14) class11_sub45_sub14).aClass38_9312)).aClass11_Sub45_515).aClass11_Sub45_7903)).aBool8757))
						class163.aa(
								i_0_ + Class319.anInt4242,
								-12 + i_10_,
								Class205.anInt2757,
								16,
								(-Class94_Sub2.anInt5589 + 255 << 24 | Class11_Sub2_Sub38.anInt9797),
								1);
				}
				if (Class58.aClass11_Sub45_Sub14_873 != null) {
					i_9_ = 0;
					Class2_Sub5
							.method2405(
									Class66.anInt942,
									i_6_,
									(byte) -111,
									Class11_Sub2_Sub36.anInt9753,
									(((Class11_Sub45_Sub14) Class58.aClass11_Sub45_Sub14_873).aString9315),
									Class11_Sub2_Sub25.anInt9328,
									Class98.anInt1305, class163);
					for (Class11_Sub45_Sub5 class11_sub45_sub5 = ((Class11_Sub45_Sub5) ((Class11_Sub45_Sub14) Class58.aClass11_Sub45_Sub14_873).aClass38_9312
							.method331((byte) -7)); class11_sub45_sub5 != null; class11_sub45_sub5 = ((Class11_Sub45_Sub5) ((Class11_Sub45_Sub14) Class58.aClass11_Sub45_Sub14_873).aClass38_9312
							.method333(-46))) {
						int i_11_ = (i_6_ + (Class11_Sub2_Sub25.anInt9328 + 13) + i_9_ * 16);
						if ((i_7_ ^ 0xffffffff) < (Class66.anInt942 ^ 0xffffffff)
								&& i_7_ < (Class66.anInt942 - -Class11_Sub2_Sub36.anInt9753)
								&& (i_8_ ^ 0xffffffff) < (i_11_ - 13 ^ 0xffffffff)
								&& (i_11_ + 4 ^ 0xffffffff) < (i_8_ ^ 0xffffffff)
								&& (((Class11_Sub45_Sub5) class11_sub45_sub5).aBool8757))
							class163.aa(
									Class66.anInt942,
									-12 + i_11_,
									Class11_Sub2_Sub36.anInt9753,
									16,
									(Class11_Sub2_Sub38.anInt9797 | 255 - Class94_Sub2.anInt5589 << 24),
									1);
						i_9_++;
					}
					Class11_Sub45_Sub17.method3750(i_6_,
							Class11_Sub2_Sub36.anInt9753,
							Class11_Sub2_Sub25.anInt9328, i ^ ~0x79e3,
							Class98.anInt1305, Class66.anInt942, class163);
				}
			} else {
				int i_12_ = 0;
				for (Class11_Sub45_Sub5 class11_sub45_sub5 = ((Class11_Sub45_Sub5) Class94_Sub1.aClass84_5220
						.method584(-12261)); class11_sub45_sub5 != null; class11_sub45_sub5 = ((Class11_Sub45_Sub5) Class94_Sub1.aClass84_5220
						.method578(-15361))) {
					int i_13_ = 13
							+ i_6_
							+ (i_3_ - -(16 * (-1 + (Class52.anInt802 - i_12_))));
					i_12_++;
					if ((i_7_ ^ 0xffffffff) < (Class319.anInt4242 + i_0_ ^ 0xffffffff)
							&& i_7_ < Class205.anInt2757
									+ (Class319.anInt4242 + i_0_)
							&& -13 + i_13_ < i_8_
							&& (i_13_ + 4 ^ 0xffffffff) < (i_8_ ^ 0xffffffff)
							&& ((Class11_Sub45_Sub5) class11_sub45_sub5).aBool8757)
						class163.aa(
								i_0_ + Class319.anInt4242,
								-12 + i_13_,
								Class205.anInt2757,
								16,
								(Class11_Sub2_Sub38.anInt9797 | 255 - Class94_Sub2.anInt5589 << 24),
								1);
				}
			}
			Class11_Sub45_Sub17.method3750(i_6_, Class205.anInt2757, i_1_
					+ Class144.anInt1944, 0, Class239_Sub1.anInt7270,
					Class319.anInt4242 - -i_0_, class163);
			if (Class11_Sub2_Sub14.aBool9015) {
				int i_14_ = 0;
				for (Class11_Sub45_Sub14 class11_sub45_sub14 = ((Class11_Sub45_Sub14) Class161.aClass38_2097
						.method331((byte) -7)); class11_sub45_sub14 != null; class11_sub45_sub14 = ((Class11_Sub45_Sub14) Class161.aClass38_2097
						.method333(-115))) {
					int i_15_ = 16 * i_14_ + 13
							+ (i_6_ + i_1_ + Class144.anInt1944);
					if ((((Class11_Sub45_Sub14) class11_sub45_sub14).anInt9313 ^ 0xffffffff) == -2)
						Class353.method2118(
								Class144.anInt1944 + i_1_,
								~0xffffff | Class127.anInt1721,
								Class329.anInt4375 | ~0xffffff,
								class163,
								Class239_Sub1.anInt7270,
								i_8_,
								i_7_,
								((Class11_Sub45_Sub5) (((Class11_Sub45) (((Class38) (((Class11_Sub45_Sub14) class11_sub45_sub14).aClass38_9312)).aClass11_Sub45_515)).aClass11_Sub45_7903)),
								i + 31213, Class205.anInt2757, i_15_,
								Class319.anInt4242 + i_0_);
					else
						Class47.method410(255, i_8_, class163,
								Class329.anInt4375 | ~0xffffff,
								Class205.anInt2757, i_15_, i_7_, i_1_
										+ Class144.anInt1944,
								class11_sub45_sub14, Class319.anInt4242 + i_0_,
								Class239_Sub1.anInt7270, Class127.anInt1721
										| ~0xffffff);
					i_14_++;
				}
				if (Class58.aClass11_Sub45_Sub14_873 != null) {
					i_14_ = 0;
					for (Class11_Sub45_Sub5 class11_sub45_sub5 = ((Class11_Sub45_Sub5) ((Class11_Sub45_Sub14) Class58.aClass11_Sub45_Sub14_873).aClass38_9312
							.method331((byte) -7)); class11_sub45_sub5 != null; class11_sub45_sub5 = ((Class11_Sub45_Sub5) ((Class11_Sub45_Sub14) Class58.aClass11_Sub45_Sub14_873).aClass38_9312
							.method333(-123))) {
						int i_16_ = (i_14_ * 16 + Class11_Sub2_Sub25.anInt9328
								- -i_6_ + 13);
						i_14_++;
						Class353.method2118(Class11_Sub2_Sub25.anInt9328,
								Class127.anInt1721 | ~0xffffff, ~0xffffff
										| Class329.anInt4375, class163,
								Class98.anInt1305, i_8_, i_7_,
								class11_sub45_sub5, 9,
								Class11_Sub2_Sub36.anInt9753, i_16_,
								Class66.anInt942);
					}
					Class321_Sub1.method2737(i + 23049,
							Class11_Sub2_Sub36.anInt9753, Class98.anInt1305,
							Class11_Sub2_Sub25.anInt9328, Class66.anInt942);
				}
			} else {
				int i_17_ = 0;
				for (Class11_Sub45_Sub5 class11_sub45_sub5 = ((Class11_Sub45_Sub5) Class94_Sub1.aClass84_5220
						.method584(-12261)); class11_sub45_sub5 != null; class11_sub45_sub5 = ((Class11_Sub45_Sub5) Class94_Sub1.aClass84_5220
						.method578(-15361))) {
					int i_18_ = (16 * (-1 + Class52.anInt802 + -i_17_) + 13 + (i_6_ + i_3_));
					Class353.method2118(i_3_, ~0xffffff | Class127.anInt1721,
							Class329.anInt4375 | ~0xffffff, class163, i_5_,
							i_8_, i_7_, class11_sub45_sub5, 9, i_4_, i_18_,
							i_2_);
					i_17_++;
				}
			}
			Class321_Sub1.method2737(-8155, Class205.anInt2757,
					Class239_Sub1.anInt7270, Class144.anInt1944 - -i_1_,
					Class319.anInt4242 + i_0_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gr.B(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method987(int i) {
		do {
			try {
				anIntArrayArray2073 = null;
				anIntArray2072 = null;
				if (i >= 100)
					break;
				method987(-3);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "gr.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final Class376_Sub7_Sub2 method988(int i, int i_19_, int i_20_) {
		Class364 class364 = Class181.aClass364ArrayArrayArray2336[i][i_19_][i_20_];
		if (class364 == null
				|| ((Class364) class364).aClass376_Sub7_Sub2_4777 == null)
			return null;
		return ((Class364) class364).aClass376_Sub7_Sub2_4777;
	}

	static {
		anIntArray2072 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0,
				4 };
	}
}
