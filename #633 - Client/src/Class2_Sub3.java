/* Class2_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class2_Sub3 extends Class2 {
	private boolean aBool5357;
	private Class300 aClass300_5358;
	static int[][] anIntArrayArray5359 = { { 12, 12, 12, 12 },
			{ 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 },
			{ 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 },
			{ 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 },
			{ 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 },
			{ 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };
	private boolean aBool5360;
	static int anInt5361;
	static int anInt5362;
	private Class177 aClass177_5363;
	static int anInt5364;
	static int anInt5365;
	static int anInt5366;
	static int anInt5367;
	static int anInt5368;

	Class2_Sub3(Class163_Sub2_Sub1 class163_sub2_sub1, Class146 class146,
			Class177 class177) {
		super(class163_sub2_sub1);
		try {
			aClass177_5363 = class177;
			if (class146 == null
					|| !((Class163_Sub2_Sub1) class163_sub2_sub1).aBool8681
					|| !((Class163_Sub2_Sub1) class163_sub2_sub1).aBool8672)
				aBool5357 = false;
			else {
				Class274 class274 = (Class111.method746(class146.method932(
						"gl", "environment_mapped_water_v", 0), 35633,
						class163_sub2_sub1, 1625554944));
				Class274 class274_0_ = (Class111.method746(class146.method932(
						"gl", "environment_mapped_water_f", 0), 35632,
						class163_sub2_sub1, 1625554944));
				aClass300_5358 = Class171.method1121(-127, class163_sub2_sub1,
						new Class274[] { class274, class274_0_ });
				aBool5357 = (aClass300_5358 != null && aClass177_5363
						.method1148(false));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jea.<init>("
					+ (class163_sub2_sub1 != null ? "{...}" : "null") + ','
					+ (class146 != null ? "{...}" : "null") + ','
					+ (class177 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method70(Interface15 interface15, int i, int i_1_) {
		try {
			if (!aBool5360) {
				((Class2) this).aClass163_Sub2_13.method3094(interface15,
						i_1_ - 5);
				((Class2) this).aClass163_Sub2_13.method3037((byte) 14, i);
			}
			if (i_1_ == 3)
				anInt5364++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jea.I("
					+ (interface15 != null ? "{...}" : "null") + ',' + i + ','
					+ i_1_ + ')'));
		}
	}

	final void method68(boolean bool, int i) {
		do {
			try {
				anInt5362++;
				Interface12 interface12 = ((Class2) this).aClass163_Sub2_13
						.method2972(65);
				if (i < -64) {
					if (!aBool5357 || interface12 == null)
						break;
					((Class2) this).aClass163_Sub2_13.method3073(1, (byte) 66);
					((Class2) this).aClass163_Sub2_13.method3094(interface12,
							-2);
					((Class2) this).aClass163_Sub2_13.method3073(0, (byte) 66);
					((Class2) this).aClass163_Sub2_13.method3094(
							((Class177) aClass177_5363).anInterface17_2248, -2);
					long l = ((Class300) aClass300_5358).aLong4043;
					OpenGL.glUseProgramObjectARB(l);
					OpenGL.glUniform1iARB(
							OpenGL.glGetUniformLocationARB(l, "normalSampler"),
							0);
					OpenGL.glUniform1iARB(
							OpenGL.glGetUniformLocationARB(l, "envMapSampler"),
							1);
					OpenGL.glUniform3fARB(
							OpenGL.glGetUniformLocationARB(l, "sunDir"),
							-(((Class163_Sub2) ((Class2) this).aClass163_Sub2_13).aFloatArray7578[0]),
							-(((Class163_Sub2) ((Class2) this).aClass163_Sub2_13).aFloatArray7578[1]),
							-(((Class163_Sub2) ((Class2) this).aClass163_Sub2_13).aFloatArray7578[2]));
					OpenGL.glUniform4fARB(
							OpenGL.glGetUniformLocationARB(l, "sunColour"),
							(((Class163_Sub2) ((Class2) this).aClass163_Sub2_13).aFloat7626),
							(((Class163_Sub2) ((Class2) this).aClass163_Sub2_13).aFloat7613),
							(((Class163_Sub2) ((Class2) this).aClass163_Sub2_13).aFloat7633),
							1.0F);
					OpenGL.glUniform1fARB(
							OpenGL.glGetUniformLocationARB(l, "sunExponent"),
							96.0F + 928.0F * Math
									.abs(((Class163_Sub2) (((Class2) this).aClass163_Sub2_13)).aFloatArray7578[1]));
					aBool5360 = true;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "jea.G(" + bool
						+ ',' + i + ')');
			}
			break;
		} while (false);
	}

	final void method78(int i, int i_2_, int i_3_) {
		do {
			try {
				anInt5365++;
				if (aBool5360) {
					int i_4_ = 1 << (0x3 & i_3_);
					float f = (float) (1 << (0x7 & i_3_ >> 3)) / 32.0F;
					int i_5_ = 0xffff & i;
					float f_6_ = (float) ((i & 0x38ee6) >> 16) / 8.0F;
					long l = ((Class300) aClass300_5358).aLong4043;
					OpenGL.glUniform1fARB(
							OpenGL.glGetUniformLocationARB(l, "time"),
							(float) (i_4_
									* (((Class163_Sub2) ((Class2) this).aClass163_Sub2_13).anInt7576) % 40000) / 40000.0F);
					OpenGL.glUniform1fARB(
							OpenGL.glGetUniformLocationARB(l, "scale"), f);
					OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l,
							"breakWaterDepth"), (float) i_5_);
					OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l,
							"breakWaterOffset"), f_6_);
				}
				if (i_2_ >= 91)
					break;
				method68(true, 35);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("jea.J(" + i + ','
						+ i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method2356(int i) {
		try {
			if (i != 5)
				anInt5366 = 37;
			anIntArrayArray5359 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jea.A(" + i + ')');
		}
	}

	final void method67(byte i) {
		try {
			if (aBool5360) {
				((Class2) this).aClass163_Sub2_13.method3073(1, (byte) 66);
				((Class2) this).aClass163_Sub2_13.method3094(null, -2);
				((Class2) this).aClass163_Sub2_13.method3073(0, (byte) 66);
				((Class2) this).aClass163_Sub2_13.method3094(null, -2);
				OpenGL.glUseProgramObjectARB(0L);
				aBool5360 = false;
			}
			anInt5367++;
			int i_7_ = 10 / ((i + 26) / 56);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jea.E(" + i + ')');
		}
	}

	final void method71(int i, boolean bool) {
		try {
			if (i != 5486)
				method71(102, true);
			anInt5361++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jea.M(" + i + ','
					+ bool + ')');
		}
	}

	final boolean method75(int i) {
		try {
			if (i <= 19)
				method70(null, 20, 2);
			anInt5368++;
			return aBool5357;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jea.B(" + i + ')');
		}
	}
}
