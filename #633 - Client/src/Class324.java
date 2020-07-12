/* Class324 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;

import jaggl.OpenGL;

abstract class Class324 {
	static int anInt4321;
	static int anInt4322;
	static int anInt4323;

	public Class324() {
		/* empty */
	}

	static final void method1974(byte i) {
		do {
			try {
				anInt4322++;
				if (Class355.aFrame4658 != null)
					break;
				int i_0_ = Class198.anInt2687;
				int i_1_ = Class124.anInt1677;
				int i_2_ = (-Class11_Sub36.anInt7079 + (Class11_Sub45_Sub18.anInt9531 - i_0_));
				int i_3_ = -41 / ((i + 5) / 37);
				int i_4_ = -i_1_ + (-Class153.anInt2025 + Class231.anInt3160);
				if (i_0_ > 0 || (i_2_ ^ 0xffffffff) < -1 || i_1_ > 0
						|| (i_4_ ^ 0xffffffff) < -1) {
					try {
						java.awt.Container container;
						if (Class376_Sub5.aFrame6918 == null) {
							if (Class108_Sub16.anApplet6538 != null)
								container = Class108_Sub16.anApplet6538;
							else
								container = Class112.anApplet_Sub1_1542;
						} else
							container = Class376_Sub5.aFrame6918;
						int i_5_ = 0;
						int i_6_ = 0;
						if (container == Class376_Sub5.aFrame6918) {
							Insets insets = Class376_Sub5.aFrame6918
									.getInsets();
							i_5_ = insets.left;
							i_6_ = insets.top;
						}
						Graphics graphics = container.getGraphics();
						graphics.setColor(Color.black);
						if ((i_0_ ^ 0xffffffff) < -1)
							graphics.fillRect(i_5_, i_6_, i_0_,
									Class231.anInt3160);
						if ((i_1_ ^ 0xffffffff) < -1)
							graphics.fillRect(i_5_, i_6_,
									Class11_Sub45_Sub18.anInt9531, i_1_);
						if ((i_2_ ^ 0xffffffff) < -1)
							graphics.fillRect(
									(-i_2_ + i_5_ - -(Class11_Sub45_Sub18.anInt9531)),
									i_6_, i_2_, Class231.anInt3160);
						if (i_4_ <= 0)
							break;
						graphics.fillRect(i_5_, -i_4_ + i_6_
								- -Class231.anInt3160,
								Class11_Sub45_Sub18.anInt9531, i_4_);
					} catch (Exception exception) {
						/* empty */
					}
					break;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "tl.C(" + i + ')');
			}
		} while (false);
	}

	static final Class95 method1975(byte i, Class163_Sub3 class163_sub3,
			String string, int i_7_) {
		try {
			anInt4321++;
			long l = OpenGL.glCreateShaderObjectARB(i_7_);
			OpenGL.glShaderSourceARB(l, string);
			if (i != 120)
				anInt4323 = -101;
			OpenGL.glCompileShaderARB(l);
			OpenGL.glGetObjectParameterivARB(l, 35713, Class35.anIntArray470, 0);
			if ((Class35.anIntArray470[0] ^ 0xffffffff) == -1) {
				if ((Class35.anIntArray470[0] ^ 0xffffffff) == -1)
					System.out.println("Shader compile failed:");
				OpenGL.glGetObjectParameterivARB(l, 35716,
						Class35.anIntArray470, 1);
				if (Class35.anIntArray470[1] > 1) {
					byte[] is = new byte[Class35.anIntArray470[1]];
					OpenGL.glGetInfoLogARB(l, Class35.anIntArray470[1],
							Class35.anIntArray470, 0, is, 0);
					System.out.println(new String(is));
				}
				if ((Class35.anIntArray470[0] ^ 0xffffffff) == -1) {
					OpenGL.glDeleteObjectARB(l);
					return null;
				}
			}
			return new Class95(class163_sub3, l, i_7_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tl.B(" + i + ','
					+ (class163_sub3 != null ? "{...}" : "null") + ','
					+ (string != null ? "{...}" : "null") + ',' + i_7_ + ')'));
		}
	}

	abstract long method1976(boolean bool);
}
