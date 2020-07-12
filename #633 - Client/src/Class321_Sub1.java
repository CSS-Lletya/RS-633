/* Class321_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

import jaggl.OpenGL;

final class Class321_Sub1 extends Class321 {
	static int anInt6628;
	static int anInt6629;
	int anInt6630;
	private int anInt6631 = -1;
	static int anInt6632;
	private int anInt6633 = -1;
	static int anInt6634;

	static final void method2737(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		try {
			anInt6628++;
			int i_4_ = 0;
			if (i == -8155) {
				for (/**/; ((Class11_Sub2_Sub6.anInt8702 ^ 0xffffffff) < (i_4_ ^ 0xffffffff)); i_4_++) {
					Rectangle rectangle = Class93.aRectangleArray1249[i_4_];
					if ((i_3_ ^ 0xffffffff) > (rectangle.width + rectangle.x ^ 0xffffffff)
							&& (rectangle.x ^ 0xffffffff) > (i_3_ - -i_0_ ^ 0xffffffff)
							&& ((i_2_ ^ 0xffffffff) > (rectangle.y
									+ rectangle.height ^ 0xffffffff))
							&& (i_2_ - -i_1_ ^ 0xffffffff) < (rectangle.y ^ 0xffffffff))
						Class254.aBoolArray3493[i_4_] = true;
				}
				Class11.method123(i_2_ - -i_1_, i_3_ - -i_0_, (byte) -73, i_3_,
						i_2_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ku.Q(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	Class321_Sub1(Class163_Sub3 class163_sub3, int i, int i_5_, boolean bool,
			byte[][] is, int i_6_) {
		super(class163_sub3, 34067, i, 6 * i_5_ * i_5_, bool);
		try {
			((Class321_Sub1) this).anInt6630 = i_5_;
			((Class321) this).aClass163_Sub3_4282.method3295(this, 79);
			for (int i_7_ = 0; i_7_ < 6; i_7_++)
				OpenGL.glTexImage2Dub(i_7_ + 34069, 0,
						((Class321) this).anInt4297, i_5_, i_5_, 0, i_6_, 5121,
						is[i_7_], 0);
			this.method1963(true, false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ku.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_5_ + ',' + bool + ','
					+ (is != null ? "{...}" : "null") + ',' + i_6_ + ')'));
		}
	}

	static final void method2738(Class11_Sub45 class11_sub45, int i,
			Class11_Sub45 class11_sub45_8_) {
		try {
			if (i == 1589) {
				if (((Class11_Sub45) class11_sub45).aClass11_Sub45_7902 != null)
					class11_sub45.method3187(i ^ 0x651);
				anInt6632++;
				((Class11_Sub45) class11_sub45).aClass11_Sub45_7902 = class11_sub45_8_;
				((Class11_Sub45) class11_sub45).aClass11_Sub45_7903 = ((Class11_Sub45) class11_sub45_8_).aClass11_Sub45_7903;
				((Class11_Sub45) (((Class11_Sub45) class11_sub45).aClass11_Sub45_7902)).aClass11_Sub45_7903 = class11_sub45;
				((Class11_Sub45) (((Class11_Sub45) class11_sub45).aClass11_Sub45_7903)).aClass11_Sub45_7902 = class11_sub45;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(
							runtimeexception,
							("ku.O("
									+ (class11_sub45 != null ? "{...}" : "null")
									+ ','
									+ i
									+ ','
									+ (class11_sub45_8_ != null ? "{...}"
											: "null") + ')'));
		}
	}

	Class321_Sub1(Class163_Sub3 class163_sub3, int i, int i_9_, boolean bool,
			int[][] is) {
		super(class163_sub3, 34067, i, i_9_ * (i_9_ * 6), bool);
		try {
			((Class321_Sub1) this).anInt6630 = i_9_;
			((Class321) this).aClass163_Sub3_4282.method3295(this, 35);
			if (!bool) {
				for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -7; i_10_++)
					OpenGL.glTexImage2Di(
							i_10_ + 34069,
							0,
							((Class321) this).anInt4297,
							i_9_,
							i_9_,
							0,
							32993,
							((Class163_Sub3) (((Class321) this).aClass163_Sub3_4282)).anInt8332,
							is[i_10_], 0);
			} else {
				for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -7; i_11_++)
					Class11_Sub45_Sub1
							.method3346(
									i_11_ + 34069,
									(byte) -90,
									is[i_11_],
									i_9_,
									32993,
									i_9_,
									((Class321) this).anInt4297,
									(((Class163_Sub3) (((Class321) this).aClass163_Sub3_4282)).anInt8332));
			}
			this.method1963(true, false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ku.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_9_ + ',' + bool + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	public final void method8(int i) {
		do {
			try {
				OpenGL.glFramebufferTexture2DEXT(anInt6633, anInt6631, 3553, 0,
						0);
				anInt6629++;
				anInt6631 = -1;
				anInt6633 = -1;
				if (i <= -38)
					break;
				method2739(-111, -29, false, -61, -10);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ku.S(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method2739(int i, int i_12_, boolean bool, int i_13_, int i_14_) {
		try {
			anInt6634++;
			if (bool != false)
				((Class321_Sub1) this).anInt6630 = 63;
			OpenGL.glFramebufferTexture2DEXT(i_14_, i, i_12_,
					((Class321) this).anInt4283, i_13_);
			anInt6631 = i;
			anInt6633 = i_14_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ku.P(" + i + ','
					+ i_12_ + ',' + bool + ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}

	Class321_Sub1(Class163_Sub3 class163_sub3, int i, int i_15_) {
		super(class163_sub3, 34067, i, i_15_ * (i_15_ * 6), false);
		try {
			((Class321_Sub1) this).anInt6630 = i_15_;
			((Class321) this).aClass163_Sub3_4282.method3295(this, 71);
			for (int i_16_ = 0; i_16_ < 6; i_16_++)
				OpenGL.glTexImage2Dub(34069 + i_16_, 0,
						((Class321) this).anInt4297, i_15_, i_15_, 0,
						Class6.method88(true, (((Class321) this).anInt4297)),
						5121, null, 0);
			this.method1963(true, false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ku.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_15_ + ')'));
		}
	}
}
