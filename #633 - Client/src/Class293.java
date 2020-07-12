/* Class293 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class293 {
	int anInt3963;
	static int anInt3964;
	int anInt3965;
	int anInt3966;
	static float aFloat3967;
	static int anInt3968;
	static boolean aBool3969 = false;
	int anInt3970;
	static int anInt3971;

	static final int method1815(int i, int i_0_, int i_1_) {
		try {
			int i_2_ = -56 % ((i - 78) / 38);
			anInt3968++;
			int i_3_;
			if ((i_1_ ^ 0xffffffff) < -20001) {
				i_3_ = 4;
				Class11_Sub2_Sub32_Sub1.method3881(-1);
			} else if (i_1_ > 10000) {
				Class11_Sub12_Sub2.method3556(1);
				i_3_ = 3;
			} else if (i_1_ > 5000) {
				IComponentDefinitions.method1251(-65536);
				i_3_ = 2;
			} else {
				i_3_ = 1;
				Class126.method828(76, true);
			}
			if (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5696
					.method3181(false) != i_0_) {
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								i_0_,
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5730));
				Class239.method1521(false, 0, i_0_);
			}
			Class186.method1212(10343);
			return i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qn.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method1816(boolean bool, byte i) {
		try {
			anInt3964++;
			if ((Class267.aString3625.length() ^ 0xffffffff) != -1) {
				Class314.method1912("--> " + Class267.aString3625, (byte) 59);
				Class344.method2084(Class267.aString3625, false, bool, -123);
				Class11_Sub2_Sub5.anInt8559 = 0;
				Class267.aString3625 = "";
				if (i <= 24)
					method1817(null, null, (byte) 122, -70);
				Class108_Sub4.anInt5385 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qn.C(" + bool + ','
					+ i + ')');
		}
	}

	static final Class47 method1817(byte[] is,
			Class163_Sub2_Sub1 class163_sub2_sub1, byte i, int i_4_) {
		try {
			anInt3971++;
			if (is == null)
				return null;
			int i_5_ = OpenGL.glGenProgramARB();
			OpenGL.glBindProgramARB(i_4_, i_5_);
			OpenGL.glProgramRawARB(i_4_, 34933, is);
			OpenGL.glGetIntegerv(34379, Class295.anIntArray3987, 0);
			if (Class295.anIntArray3987[0] != -1) {
				OpenGL.glBindProgramARB(i_4_, 0);
				return null;
			}
			OpenGL.glBindProgramARB(i_4_, 0);
			int i_6_ = -52 / ((-62 - i) / 40);
			return new Class47(class163_sub2_sub1, i_4_, i_5_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qn.B("
					+ (is != null ? "{...}" : "null") + ','
					+ (class163_sub2_sub1 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_4_ + ')'));
		}
	}

	public Class293() {
		/* empty */
	}
}
