/* Class133 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class133 {
	static int anInt1845;
	static int anInt1846;
	static float[] aFloatArray1847 = { 0.0F, -1.0F, 0.0F, 0.0F };

	public static void method859(int i) {
		try {
			if (i != -32084)
				aFloatArray1847 = null;
			aFloatArray1847 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ep.C(" + i + ')');
		}
	}

	static final void method860(int i, int i_0_, byte i_1_, int i_2_, int i_3_,
			int i_4_) {
		try {
			if ((((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5702
					.method2462(false) ^ 0xffffffff) != -1
					&& i_2_ != 0
					&& (Class376_Sub7_Sub3_Sub1.anInt9863 ^ 0xffffffff) > -51
					&& i_3_ != -1)
				Class343.aClass56Array4543[Class376_Sub7_Sub3_Sub1.anInt9863++] = new Class56(
						(byte) 1, i_3_, i_2_, i_4_, i_0_, 0, i, null);
			if (i_1_ <= 15)
				method859(78);
			anInt1846++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ep.A(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ','
							+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	static final void method861(int i, Class11_Sub45 class11_sub45,
			Class11_Sub45 class11_sub45_5_) {
		try {
			if (((Class11_Sub45) class11_sub45_5_).aClass11_Sub45_7902 != null)
				class11_sub45_5_.method3187(100);
			anInt1845++;
			if (i > -42)
				method860(-68, -81, (byte) 99, -95, -15, -69);
			((Class11_Sub45) class11_sub45_5_).aClass11_Sub45_7903 = class11_sub45;
			((Class11_Sub45) class11_sub45_5_).aClass11_Sub45_7902 = ((Class11_Sub45) class11_sub45).aClass11_Sub45_7902;
			((Class11_Sub45) (((Class11_Sub45) class11_sub45_5_).aClass11_Sub45_7902)).aClass11_Sub45_7903 = class11_sub45_5_;
			((Class11_Sub45) (((Class11_Sub45) class11_sub45_5_).aClass11_Sub45_7903)).aClass11_Sub45_7902 = class11_sub45_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ep.B(" + i + ','
					+ (class11_sub45 != null ? "{...}" : "null") + ','
					+ (class11_sub45_5_ != null ? "{...}" : "null") + ')'));
		}
	}
}
