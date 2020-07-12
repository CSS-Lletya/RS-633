/* Class113 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class113 implements Interface6 {
	static int anInt1544;
	Class150 aClass150_1545;
	String aString1546;
	int anInt1547;
	static int anInt1548;
	int anInt1549;
	int anInt1550;
	int anInt1551;
	int anInt1552;
	int anInt1553;
	int anInt1554;
	static int anInt1555;
	Class118 aClass118_1556;
	static float aFloat1557;
	int anInt1558;
	static Class11_Sub45_Sub19 aClass11_Sub45_Sub19_1559;
	int anInt1560;
	int anInt1561;

	public static void method755(byte i) {
		try {
			if (i == 122)
				aClass11_Sub45_Sub19_1559 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dj.B(" + i + ')');
		}
	}

	static final void method756(int i, boolean bool, int i_0_, int i_1_,
			int i_2_) {
		try {
			Class89.method621(-1);
			anInt1548++;
			Class11_Sub12_Sub1.aLong8825 = 0L;
			if (i != 3)
				method755((byte) 96);
			int i_3_ = Class187.method1227((byte) 54);
			if ((i_0_ ^ 0xffffffff) == -4 || i_3_ == 3)
				bool = true;
			if (!Class321_Sub2.aClass163_6648.method1047())
				bool = true;
			Class16.method152(bool, i_2_, i_0_, i_3_, i_1_, (byte) -102);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("dj.C(" + i + ','
					+ bool + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final boolean method757(int i, int i_4_) {
		try {
			anInt1555++;
			if (i_4_ != -6)
				method756(-119, true, -71, -62, 118);
			if (i != 3 && (i ^ 0xffffffff) != -6 && i != 6)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dj.D(" + i + ','
					+ i_4_ + ')');
		}
	}

	public final Class9 method21(boolean bool) {
		try {
			if (bool != false)
				return null;
			anInt1544++;
			return Class209.aClass9_2843;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dj.A(" + bool + ')');
		}
	}

	Class113(String string, Class118 class118, Class150 class150, int i,
			int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_,
			int i_11_, int i_12_, int i_13_) {
		try {
			((Class113) this).anInt1551 = i_11_;
			((Class113) this).anInt1561 = i;
			((Class113) this).anInt1547 = i_13_;
			((Class113) this).anInt1550 = i_9_;
			((Class113) this).anInt1558 = i_6_;
			((Class113) this).aClass118_1556 = class118;
			((Class113) this).anInt1552 = i_12_;
			((Class113) this).aString1546 = string;
			((Class113) this).aClass150_1545 = class150;
			((Class113) this).anInt1553 = i_8_;
			((Class113) this).anInt1560 = i_5_;
			((Class113) this).anInt1549 = i_10_;
			((Class113) this).anInt1554 = i_7_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("dj.<init>(" + (string != null ? "{...}" : "null") + ','
							+ (class118 != null ? "{...}" : "null") + ','
							+ (class150 != null ? "{...}" : "null") + ',' + i
							+ ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_
							+ ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ','
							+ i_12_ + ',' + i_13_ + ')'));
		}
	}
}
