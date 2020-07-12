/* Class11_Sub2_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

import jaggl.OpenGL;

final class Class11_Sub2_Sub20 extends Class11_Sub2 {
	static int anInt9142;
	private int anInt9143 = 0;
	static int anInt9144;
	static int anInt9145;
	private int anInt9146 = 4096;
	static int anInt9147;
	static int[] anIntArray9148;

	final int[] method2254(int i, boolean bool) {
		try {
			if (bool != true)
				method3578(3);
			anInt9145++;
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
				int[] is_0_ = this.method2260(4463, 0, i);
				for (int i_1_ = 0; Class33_Sub2.anInt6696 > i_1_; i_1_++) {
					int i_2_ = is_0_[i_1_];
					is[i_1_] = ((i_2_ ^ 0xffffffff) > (anInt9143 ^ 0xffffffff) || i_2_ > anInt9146) ? 0
							: 4096;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jn.A(" + i + ','
					+ bool + ')');
		}
	}

	static final Class163 method3576(int i, Interface1 interface1,
			Canvas canvas, int i_3_, Class146 class146) {
		try {
			anInt9147++;
			if (!OutputStream_Sub1.method2484(1))
				throw new RuntimeException("");
			if (!Class335_Sub3_Sub1.method3711("jaggl", true))
				throw new RuntimeException("");
			OpenGL opengl = new OpenGL();
			if (i_3_ != -31955)
				return null;
			long l = opengl.init(canvas, 8, 8, 8, 24, 0, i);
			if (l == 0L)
				throw new RuntimeException("");
			Class163_Sub2_Sub1 class163_sub2_sub1 = new Class163_Sub2_Sub1(
					opengl, canvas, l, interface1, class146, i);
			class163_sub2_sub1.method2974((byte) 55);
			return class163_sub2_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jn.F(" + i + ','
					+ (interface1 != null ? "{...}" : "null") + ','
					+ (canvas != null ? "{...}" : "null") + ',' + i_3_ + ','
					+ (class146 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2263(int i, Stream stream, int i_4_) {
		try {
			int i_5_ = i_4_;
			do {
				if ((i_5_ ^ 0xffffffff) != -1) {
					if (i_5_ != 1)
						break;
				} else {
					anInt9143 = stream.readUnsignedShort((byte) -65);
					break;
				}
				anInt9146 = stream.readUnsignedShort((byte) -65);
			} while (false);
			if (i != 3731)
				anInt9143 = -108;
			anInt9142++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jn.B(" + i + ','
					+ (stream != null ? "{...}" : "null") + ',' + i_4_ + ')'));
		}
	}

	static final void method3577(boolean bool, int i, int i_6_) {
		try {
			anInt9144++;
			if (bool != true)
				anIntArray9148 = null;
			if (Class197.anInt2668 != 1) {
				if ((Class197.anInt2668 ^ 0xffffffff) == -3) {
					if (Class11_Sub2_Sub19.aBool9087)
						Class118.method774(
								Class376_Sub7_Sub4_Sub1.method3887((byte) -127)
										+ i_6_, 118,
								i - -Class54.method443(5467));
					else
						Class118.method774(i_6_, 118, i);
				}
			} else
				Class11_Sub30_Sub1.method3526((byte) -47, i,
						(Class342.aClass11_Sub45_Sub5_4538), i_6_);
			Class342.aClass11_Sub45_Sub5_4538 = null;
			Class197.anInt2668 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jn.E(" + bool + ','
					+ i + ',' + i_6_ + ')'));
		}
	}

	public Class11_Sub2_Sub20() {
		super(1, true);
	}

	public static void method3578(int i) {
		do {
			try {
				anIntArray9148 = null;
				if (i == 2535)
					break;
				method3578(11);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "jn.C(" + i + ')');
			}
			break;
		} while (false);
	}
}
