/* Class337 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class337 {
	static int anInt4449;
	static int anInt4450;
	private int anInt4451;
	static int anInt4452;
	static int anInt4453;
	static int anInt4454;
	static int anInt4455;
	static int anInt4456;
	static Class33 aClass33_4457;

	static final boolean method2023(boolean bool) {
		try {
			anInt4454++;
			if (bool != false)
				method2023(true);
			return Class11_Sub50_Sub2.aBool9085;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "up.C(" + bool + ')');
		}
	}

	static final void method2024(Class78 class78, int i) {
		try {
			int i_0_ = 24 / ((-30 - i) / 51);
			anInt4452++;
			Class314.aClass78_4169 = class78;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "up.B("
					+ (class78 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method2025(boolean bool) {
		try {
			if (bool == false)
				aClass33_4457 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "up.G(" + bool + ')');
		}
	}

	final void method2026(int i, char c) {
		do {
			try {
				anInt4449++;
				OpenGL.glCallList(anInt4451 + c);
				if (i < -7)
					break;
				anInt4451 = -69;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "up.E(" + i + ','
						+ c + ')');
			}
			break;
		} while (false);
	}

	final void method2027(int i) {
		do {
			try {
				OpenGL.glEndList();
				anInt4453++;
				if (i == -50135600)
					break;
				anInt4451 = -35;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "up.F(" + i + ')');
			}
			break;
		} while (false);
	}

	Class337(Class163_Sub3 class163_sub3, int i) {
		try {
			anInt4451 = OpenGL.glGenLists(i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("up.<init>(" + (class163_sub3 != null ? "{...}" : "null")
							+ ',' + i + ')'));
		}
	}

	final void method2028(int i, int i_1_) {
		do {
			try {
				OpenGL.glNewList(anInt4451 + i, 4864);
				anInt4456++;
				if (i_1_ > 38)
					break;
				aClass33_4457 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "up.D(" + i + ','
						+ i_1_ + ')');
			}
			break;
		} while (false);
	}

	static final Class11_Sub45_Sub6 method2029(int i, int i_2_,
			Class298 class298, int i_3_) {
		try {
			anInt4455++;
			int i_4_ = i_3_ << 10 | ((Class298) class298).anInt4029;
			Class11_Sub45_Sub6 class11_sub45_sub6 = (Class11_Sub45_Sub6) Class376_Sub7_Sub5_Sub1.aClass124_9902
					.method813(-110, (long) i_4_ << 16);
			if (i_2_ >= -23)
				return null;
			if (class11_sub45_sub6 != null)
				return class11_sub45_sub6;
			byte[] is = (Class335.aClass146_4433.method938(
					Class335.aClass146_4433.method941(false, i_4_), 0));
			if (is != null) {
				if (is.length <= 1)
					return null;
				try {
					class11_sub45_sub6 = Class270.method1694(is, 0);
				} catch (Exception exception) {
					throw new RuntimeException(exception.getMessage() + " S: "
							+ i_4_);
				}
				((Class11_Sub45_Sub6) class11_sub45_sub6).aClass298_8777 = class298;
				Class376_Sub7_Sub5_Sub1.aClass124_9902.method812(
						class11_sub45_sub6, (byte) 36, (long) i_4_ << 16);
				return class11_sub45_sub6;
			}
			i_4_ = ((Class298) class298).anInt4029 | 65536 + i << 10;
			class11_sub45_sub6 = (Class11_Sub45_Sub6) Class376_Sub7_Sub5_Sub1.aClass124_9902
					.method813(-115, (long) i_4_ << 16);
			if (class11_sub45_sub6 != null)
				return class11_sub45_sub6;
			is = Class335.aClass146_4433.method938(
					Class335.aClass146_4433.method941(false, i_4_), 0);
			if (is != null) {
				if ((is.length ^ 0xffffffff) >= -2)
					return null;
				try {
					class11_sub45_sub6 = Class270.method1694(is, 0);
				} catch (Exception exception) {
					throw new RuntimeException(exception.getMessage() + " S: "
							+ i_4_);
				}
				((Class11_Sub45_Sub6) class11_sub45_sub6).aClass298_8777 = class298;
				Class376_Sub7_Sub5_Sub1.aClass124_9902.method812(
						class11_sub45_sub6, (byte) 36, (long) i_4_ << 16);
				return class11_sub45_sub6;
			}
			i_4_ = 0x3fffc00 | ((Class298) class298).anInt4029;
			class11_sub45_sub6 = (Class11_Sub45_Sub6) Class376_Sub7_Sub5_Sub1.aClass124_9902
					.method813(-114, (long) i_4_ << 16);
			if (class11_sub45_sub6 != null)
				return class11_sub45_sub6;
			is = Class335.aClass146_4433.method938(
					Class335.aClass146_4433.method941(false, i_4_), 0);
			if (is != null) {
				if ((is.length ^ 0xffffffff) >= -2)
					return null;
				try {
					class11_sub45_sub6 = Class270.method1694(is, 0);
				} catch (Exception exception) {
					throw new RuntimeException(exception.getMessage() + " S: "
							+ i_4_);
				}
				((Class11_Sub45_Sub6) class11_sub45_sub6).aClass298_8777 = class298;
				Class376_Sub7_Sub5_Sub1.aClass124_9902.method812(
						class11_sub45_sub6, (byte) 36, (long) i_4_ << 16);
				return class11_sub45_sub6;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("up.A(" + i + ','
					+ i_2_ + ',' + (class298 != null ? "{...}" : "null") + ','
					+ i_3_ + ')'));
		}
	}
}
