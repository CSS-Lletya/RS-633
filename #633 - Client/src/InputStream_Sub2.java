/* InputStream_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.InputStream;

final class InputStream_Sub2 extends InputStream {
	static int anInt6939;
	static int anInt6940;
	static int anInt6941;
	static int anInt6942;
	static Class174 aClass174_6943 = new Class174();
	static int anInt6944;
	static int anInt6945;
	static int anInt6946;
	static Class324 aClass324_6947;
	static Class143[] aClass143Array6948 = null;

	static final int method2812(int i, int i_0_, boolean bool) {
		try {
			if (bool != false)
				return 56;
			anInt6942++;
			int i_1_ = i_0_ - 1 & i >> 31;
			return i_1_ + (i - -(i >>> 31)) % i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nn.G(" + i + ','
					+ i_0_ + ',' + bool + ')'));
		}
	}

	static final Class140 method2813(int i, int i_2_, int i_3_) {
		Class364 class364 = Class181.aClass364ArrayArrayArray2336[i][i_2_][i_3_];
		if (class364 == null)
			return null;
		return ((Class364) class364).aClass140_4781;
	}

	static final void method2814(boolean bool, int i) {
		try {
			anInt6940++;
			if (Class108_Sub2.aClass217_5081 != null) {
				Class108_Sub2.aClass217_5081.method1398(-2147483648);
				Class108_Sub2.aClass217_5081 = null;
			}
			Class94_Sub1.loginStep = 0;
			Class11_Sub2_Sub2.method3337((byte) -73);
			Class98.method665();
			for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -5; i_4_++)
				Class235.aClass338Array3217[i_4_].method2044((byte) 85);
			Class236_Sub1.method2605((byte) 113, false);
			System.gc();
			Class11_Sub2_Sub8.method3430(2, 1);
			Class376_Sub7.aBool7049 = false;
			Class11_Sub12_Sub1.anInt8828 = -1;
			Class295.method1829(-1);
			Class23.method198(true, -257);
			Class350.anInt4617 = 0;
			Class118.anInt1605 = 0;
			Class103.anInt1383 = Class141.anInt1915 = 0;
			Class194.anInt2641 = 0;
			Class376_Sub7_Sub3_Sub1.anInt9867 = 0;
			for (int i_5_ = 0; ((IncomingPacket.aClass275Array2082.length ^ 0xffffffff) < (i_5_ ^ 0xffffffff)); i_5_++)
				IncomingPacket.aClass275Array2082[i_5_] = null;
			Exception_Sub1.method3738(-127);
			for (int i_6_ = 0; i_6_ < 2048; i_6_++)
				Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_6_] = null;
			Class23.anInt249 = 0;
			Class11_Sub2_Sub25.aClass213_9322.method1364((byte) 126);
			Class108_Sub17.anInt6619 = 0;
			Class106.aClass213_1433.method1364((byte) 111);
			Class11_Sub2_Sub36.method3839((byte) 59);
			Class199.anInt2692 = 0;
			Class11_Sub26.aClass97_6296.method654((byte) 75);
			Class11_Sub45_Sub20.method3832(i + 25625);
			if (i != -25626)
				anInt6945 = -16;
			Class45.method400(-110);
			Class253_Sub2.aClass11_Sub31_6536 = null;
			Class2.aLong20 = 0L;
			if (!bool) {
				Class83.method575(false, 3);
				try {
					Class36.method311("loggedout", 109,
							Class108_Sub16.anApplet6538);
				} catch (Throwable throwable) {
					/* empty */
				}
			} else
				Class83.method575(false, 12);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nn.E(" + bool + ','
					+ i + ')');
		}
	}

	static final void method2815(int i) {
		do {
			try {
				if (i == 0) {
					anInt6946++;
					if (Class186.aClass163_2375 == null)
						break;
					Class186.aClass163_2375.method1072(1);
					Class196.aClass107_2663 = null;
					Class186.aClass163_2375 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "nn.D(" + i + ')');
			}
			break;
		} while (false);
	}

	public final int read() {
		try {
			Class11_Sub51.method3236(30000L, 0);
			anInt6941++;
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nn.read(" + ')');
		}
	}

	public static void method2816(int i) {
		try {
			aClass174_6943 = null;
			aClass143Array6948 = null;
			int i_7_ = 35 / ((i + 78) / 34);
			aClass324_6947 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nn.F(" + i + ')');
		}
	}

	static final void method2817(int i) {
		try {
			if (i == 30695) {
				Class11_Sub45_Sub5.aClass192ArrayArray8772 = (new IComponentDefinitions[Class47.aClass146_746
						.method928((byte) 20)][]);
				anInt6944++;
				Canvas_Sub1.aClass192ArrayArray9228 = (new IComponentDefinitions[Class47.aClass146_746
						.method928((byte) 20)][]);
				Class256.aBoolArray3505 = new boolean[Class47.aClass146_746
						.method928((byte) 20)];
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nn.A(" + i + ')');
		}
	}

	static final Class72_Sub1 method2818(Class163_Sub2 class163_sub2, int[] is,
			int i, int[] is_8_, int i_9_, int i_10_) {
		try {
			if (i_9_ != 2871)
				aClass174_6943 = null;
			anInt6939++;
			if (class163_sub2.method3009(Class366.aClass366_4808,
					Class128.aClass98_1726, (byte) -45)) {
				byte[] is_11_ = new byte[i_10_ * i];
				for (int i_12_ = 0; i_10_ > i_12_; i_12_++) {
					int i_13_ = is_8_[i_12_] + i_12_ * i;
					for (int i_14_ = 0; (is[i_12_] ^ 0xffffffff) < (i_14_ ^ 0xffffffff); i_14_++)
						is_11_[i_13_++] = (byte) -1;
				}
				return new Class72_Sub1(class163_sub2, i, i_10_, is_11_);
			}
			int[] is_15_ = new int[i_10_ * i];
			for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff); i_16_++) {
				int i_17_ = is_8_[i_16_] + i_16_ * i;
				for (int i_18_ = 0; (is[i_16_] ^ 0xffffffff) < (i_18_ ^ 0xffffffff); i_18_++)
					is_15_[i_17_++] = -16777216;
			}
			return new Class72_Sub1(class163_sub2, i, i_10_, is_15_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nn.C("
					+ (class163_sub2 != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ',' + i + ','
					+ (is_8_ != null ? "{...}" : "null") + ',' + i_9_ + ','
					+ i_10_ + ')'));
		}
	}
}
