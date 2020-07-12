/* Class79 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class79 {
	static int anInt1064;
	int anInt1065;
	static int anInt1066 = 0;
	int anInt1067;
	static Class11_Sub45_Sub18[] aClass11_Sub45_Sub18Array1068 = new Class11_Sub45_Sub18[14];
	static int anInt1069;
	int anInt1070;
	int anInt1071;
	static int anInt1072;
	static int anInt1073;

	public static void method540(int i) {
		try {
			int i_0_ = -97 / ((58 - i) / 54);
			aClass11_Sub45_Sub18Array1068 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "as.B(" + i + ')');
		}
	}

	public final String toString() {
		try {
			anInt1073++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "as.toString(" + ')');
		}
	}

	Class79(int i, int i_1_, int i_2_, int i_3_) {
		try {
			((Class79) this).anInt1067 = i_2_;
			((Class79) this).anInt1065 = i_3_;
			((Class79) this).anInt1070 = i;
			((Class79) this).anInt1071 = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("as.<init>(" + i + ','
					+ i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final void method541(Class11_Sub10 class11_sub10, int i) {
		try {
			anInt1069++;
			Class139.aClass84_1890.method589((byte) -13, class11_sub10);
			if (i < -4) {
				((Class11_Sub10) class11_sub10).anInt5392 = ((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position;
				Class11_Sub43.anInt7337 += ((Class11_Sub10) class11_sub10).anInt5392;
				((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "as.A("
					+ (class11_sub10 != null ? "{...}" : "null") + ',' + i
					+ ')');
		}
	}

	static final boolean method542(int i) {
		try {
			anInt1064++;
			if (i < (Class285.anInt3846 ^ 0xffffffff))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "as.C(" + i + ')');
		}
	}
}
