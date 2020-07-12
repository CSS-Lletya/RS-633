/* Class329 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class329 {
	static Class98 aClass98_4372 = new Class98(1);
	static int anInt4373;
	static int anInt4374;
	static int anInt4375;
	static int anInt4376;

	static final void method1992(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		try {
			anInt4376++;
			int i_4_ = 0;
			int i_5_ = 14 % ((i - 69) / 48);
			int i_6_ = i_1_;
			int i_7_ = -i_1_;
			Class11_Sub2_Sub32_Sub1.method3883(i_3_ - i_1_,
					(Class297.anIntArrayArray4026[i_0_]), (byte) 113, i_2_,
					i_1_ + i_3_);
			int i_8_ = -1;
			while ((i_4_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff)) {
				i_8_ += 2;
				i_4_++;
				i_7_ += i_8_;
				if (i_7_ >= 0) {
					i_6_--;
					i_7_ -= i_6_ << 1;
					int[] is = Class297.anIntArrayArray4026[i_6_ + i_0_];
					int[] is_9_ = Class297.anIntArrayArray4026[-i_6_ + i_0_];
					int i_10_ = i_4_ + i_3_;
					int i_11_ = -i_4_ + i_3_;
					Class11_Sub2_Sub32_Sub1.method3883(i_11_, is, (byte) 123,
							i_2_, i_10_);
					Class11_Sub2_Sub32_Sub1.method3883(i_11_, is_9_,
							(byte) 120, i_2_, i_10_);
				}
				int i_12_ = i_6_ + i_3_;
				int i_13_ = -i_6_ + i_3_;
				int[] is = Class297.anIntArrayArray4026[i_0_ - -i_4_];
				int[] is_14_ = Class297.anIntArrayArray4026[-i_4_ + i_0_];
				Class11_Sub2_Sub32_Sub1.method3883(i_13_, is, (byte) 71, i_2_,
						i_12_);
				Class11_Sub2_Sub32_Sub1.method3883(i_13_, is_14_, (byte) 51,
						i_2_, i_12_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tt.D(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final Class107 method1993(int i, boolean bool, int i_15_,
			Class163 class163) {
		try {
			anInt4373++;
			Class143 class143 = Class11_Sub45_Sub10.method3524(class163, i,
					bool, (byte) -22);
			if (i_15_ != 0)
				anInt4375 = -15;
			if (class143 == null)
				return null;
			return ((Class143) class143).aClass107_1932;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tt.A(" + i + ','
					+ bool + ',' + i_15_ + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1994(int i) {
		do {
			try {
				aClass98_4372 = null;
				if (i == 16491)
					break;
				aClass98_4372 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "tt.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method1995(byte i, Class163 class163) {
		try {
			anInt4374++;
			int i_16_ = 0;
			int i_17_ = 0;
			if (i != 112)
				anInt4375 = 25;
			if (Class11_Sub2_Sub19.aBool9087) {
				i_16_ = Class54.method443(5467);
				i_17_ = Class376_Sub7_Sub4_Sub1.method3887((byte) -104);
			}
			int i_18_ = -10660793;
			Class11_Sub2_Sub5.method3392(Class205.anInt2757, i_17_
					+ Class144.anInt1944, class163, -16777216, true, i_18_,
					Class239_Sub1.anInt7270, Class319.anInt4242 + i_16_);
			Class98.aClass107_1308.method708(i_16_ + (Class319.anInt4242 + 3),
					173, i_18_, 14 + (Class144.anInt1944 - -i_17_),
					Class26.aClass26_300.method217((byte) 118,
							Class11_Sub45_Sub1_Sub2.anInt9884), -1);
			int i_19_ = i_16_ + Class280.aClass225_3786.method1449(i - 198);
			int i_20_ = i_17_ + Class280.aClass225_3786.method1448((byte) -63);
			if (Class11_Sub2_Sub14.aBool9015) {
				int i_21_ = 0;
				for (Class11_Sub45_Sub14 class11_sub45_sub14 = ((Class11_Sub45_Sub14) Class161.aClass38_2097
						.method331((byte) -7)); class11_sub45_sub14 != null; class11_sub45_sub14 = ((Class11_Sub45_Sub14) Class161.aClass38_2097
						.method333(-102))) {
					int i_22_ = i_21_ * 16 + i_17_ + (Class144.anInt1944 + 31);
					i_21_++;
					if ((((Class11_Sub45_Sub14) class11_sub45_sub14).anInt9313 ^ 0xffffffff) == -2)
						Class353.method2118(
								Class144.anInt1944 - -i_17_,
								-256,
								-1,
								class163,
								Class239_Sub1.anInt7270,
								i_20_,
								i_19_,
								((Class11_Sub45_Sub5) ((Class11_Sub45) (((Class38) ((Class11_Sub45_Sub14) class11_sub45_sub14).aClass38_9312).aClass11_Sub45_515)).aClass11_Sub45_7903),
								9, Class205.anInt2757, i_22_,
								Class319.anInt4242 + i_16_);
					else
						Class47.method410(255, i_20_, class163, -1,
								Class205.anInt2757, i_22_, i_19_,
								Class144.anInt1944 - -i_17_,
								class11_sub45_sub14,
								i_16_ + Class319.anInt4242,
								Class239_Sub1.anInt7270, -256);
				}
				if (Class58.aClass11_Sub45_Sub14_873 != null) {
					Class11_Sub2_Sub5.method3392(Class11_Sub2_Sub36.anInt9753,
							Class11_Sub2_Sub25.anInt9328, class163, -16777216,
							true, i_18_, Class98.anInt1305, Class66.anInt942);
					Class98.aClass107_1308
							.method708(
									3 + Class66.anInt942,
									173,
									i_18_,
									14 + Class11_Sub2_Sub25.anInt9328,
									((Class11_Sub45_Sub14) Class58.aClass11_Sub45_Sub14_873).aString9315,
									-1);
					i_21_ = 0;
					for (Class11_Sub45_Sub5 class11_sub45_sub5 = ((Class11_Sub45_Sub5) ((Class11_Sub45_Sub14) Class58.aClass11_Sub45_Sub14_873).aClass38_9312
							.method331((byte) -7)); class11_sub45_sub5 != null; class11_sub45_sub5 = ((Class11_Sub45_Sub5) ((Class11_Sub45_Sub14) Class58.aClass11_Sub45_Sub14_873).aClass38_9312
							.method333(i - 153))) {
						int i_23_ = 16 * i_21_
								+ (31 + Class11_Sub2_Sub25.anInt9328);
						Class353.method2118(Class11_Sub2_Sub25.anInt9328, -256,
								-1, class163, Class98.anInt1305, i_20_, i_19_,
								class11_sub45_sub5, 9,
								Class11_Sub2_Sub36.anInt9753, i_23_,
								Class66.anInt942);
						i_21_++;
					}
					Class321_Sub1.method2737(-8155,
							Class11_Sub2_Sub36.anInt9753, Class98.anInt1305,
							Class11_Sub2_Sub25.anInt9328, Class66.anInt942);
				}
			} else {
				int i_24_ = 0;
				for (Class11_Sub45_Sub5 class11_sub45_sub5 = ((Class11_Sub45_Sub5) Class94_Sub1.aClass84_5220
						.method584(-12261)); class11_sub45_sub5 != null; class11_sub45_sub5 = ((Class11_Sub45_Sub5) Class94_Sub1.aClass84_5220
						.method578(-15361))) {
					int i_25_ = ((-1 + Class52.anInt802 + -i_24_) * 16 + (31 + i_17_ + Class144.anInt1944));
					i_24_++;
					Class353.method2118(Class144.anInt1944 - -i_17_, -256, -1,
							class163, Class239_Sub1.anInt7270, i_20_, i_19_,
							class11_sub45_sub5, 9, Class205.anInt2757, i_25_,
							Class319.anInt4242 - -i_16_);
				}
			}
			Class321_Sub1.method2737(i ^ ~0x1faa, Class205.anInt2757,
					Class239_Sub1.anInt7270, i_17_ + Class144.anInt1944, i_16_
							+ Class319.anInt4242);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tt.C(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}
}
