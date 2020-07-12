/* Class108_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class Class108_Sub14 extends Class108 {
	static int anInt6268;
	static int anInt6269;
	static int anInt6270;
	static int anInt6271;
	static long aLong6272;
	static int anInt6273;
	static float[] aFloatArray6274 = new float[2];
	static int anInt6275;
	static int anInt6276;
	static int anInt6277;
	static int anInt6278;

	final int method725(byte i) {
		try {
			int i_0_ = -32 / ((70 - i) / 51);
			anInt6277++;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hc.A(" + i + ')');
		}
	}

	final void method728(int i, int i_1_) {
		do {
			try {
				((Class108) this).anInt1459 = i_1_;
				anInt6273++;
				if (i == 0)
					break;
				method2658(false);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "hc.C(" + i + ','
						+ i_1_ + ')');
			}
			break;
		} while (false);
	}

	static final long method2656(byte i) {
		try {
			anInt6271++;
			if (i != 84)
				method2660(71, (byte) -75);
			return Class272.aClass264_3672.method1673((byte) 79);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hc.D(" + i + ')');
		}
	}

	Class108_Sub14(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}

	public static void method2657(int i) {
		do {
			try {
				aFloatArray6274 = null;
				if (i <= -22)
					break;
				aFloatArray6274 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "hc.H(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method726(boolean bool) {
		do {
			try {
				anInt6276++;
				if (bool == false)
					break;
				aFloatArray6274 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "hc.E(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	final int method2658(boolean bool) {
		try {
			anInt6270++;
			if (bool != false)
				method726(true);
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hc.B(" + bool + ')');
		}
	}

	static final Class37 method2659(int i, Component component, int i_2_,
			byte i_3_, Class341 class341) {
		try {
			anInt6269++;
			if ((Class119.anInt1610 ^ 0xffffffff) == -1)
				throw new IllegalStateException();
			if (i_2_ < 0 || i_2_ >= 2)
				throw new IllegalArgumentException();
			if (i < 256)
				i = 256;
			try {
				Class37 class37 = (Class37) Class.forName("Class37_Sub1")
						.newInstance();
				((Class37) class37).anIntArray472 = new int[256 * (Class236_Sub1.aBool6092 ? 2
						: 1)];
				((Class37) class37).anInt501 = i;
				class37.method312(component);
				((Class37) class37).anInt503 = 1024 + (i & ~0x3ff);
				if (((Class37) class37).anInt503 > 16384)
					((Class37) class37).anInt503 = 16384;
				int i_4_ = 63 / ((-43 - i_3_) / 33);
				class37.method317(((Class37) class37).anInt503);
				if ((Class218.anInt3010 ^ 0xffffffff) < -1
						&& Class30.aClass175_403 == null) {
					Class30.aClass175_403 = new Class175();
					((Class175) Class30.aClass175_403).aClass341_2235 = class341;
					class341.method2063(2, Class30.aClass175_403,
							Class218.anInt3010);
				}
				if (Class30.aClass175_403 != null) {
					if ((((Class175) Class30.aClass175_403).aClass37Array2232[i_2_]) != null)
						throw new IllegalArgumentException();
					((Class175) Class30.aClass175_403).aClass37Array2232[i_2_] = class37;
				}
				return class37;
			} catch (Throwable throwable) {
				try {
					Class37_Sub2 class37_sub2 = new Class37_Sub2(class341, i_2_);
					((Class37) class37_sub2).anIntArray472 = new int[(!Class236_Sub1.aBool6092 ? 1
							: 2) * 256];
					((Class37) class37_sub2).anInt501 = i;
					class37_sub2.method312(component);
					((Class37) class37_sub2).anInt503 = 16384;
					class37_sub2.method317(((Class37) class37_sub2).anInt503);
					if ((Class218.anInt3010 ^ 0xffffffff) < -1
							&& Class30.aClass175_403 == null) {
						Class30.aClass175_403 = new Class175();
						((Class175) Class30.aClass175_403).aClass341_2235 = class341;
						class341.method2063(2, Class30.aClass175_403,
								Class218.anInt3010);
					}
					if (Class30.aClass175_403 != null) {
						if ((((Class175) Class30.aClass175_403).aClass37Array2232[i_2_]) != null)
							throw new IllegalArgumentException();
						((Class175) Class30.aClass175_403).aClass37Array2232[i_2_] = class37_sub2;
					}
					return class37_sub2;
				} catch (Throwable throwable_5_) {
					return new Class37();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("hc.I(" + i + ','
							+ (component != null ? "{...}" : "null") + ','
							+ i_2_ + ',' + i_3_ + ','
							+ (class341 != null ? "{...}" : "null") + ')'));
		}
	}

	Class108_Sub14(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
	}

	static final void method2660(int i, byte i_6_) {
		do {
			try {
				anInt6278++;
				Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
						-652872096, 4, i);
				class11_sub45_sub15.method3660(0);
				if (i_6_ > 1)
					break;
				method2657(29);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "hc.G(" + i + ','
						+ i_6_ + ')');
			}
			break;
		} while (false);
	}

	final int method721(int i, int i_7_) {
		try {
			anInt6268++;
			if (i_7_ <= 10)
				return 12;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hc.F(" + i + ','
					+ i_7_ + ')');
		}
	}
}
