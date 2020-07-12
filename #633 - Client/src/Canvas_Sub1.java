/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

final class Canvas_Sub1 extends Canvas {
	static IComponentDefinitions[][] aClass192ArrayArray9228;
	static int[] anIntArray9229 = { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1,
			2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };
	static int anInt9230;
	static int anInt9231;
	private Component aComponent9232;
	static int anInt9233;
	static int anInt9234;
	static int anInt9235;
	static int anInt9236;

	public final void paint(Graphics graphics) {
		try {
			anInt9235++;
			aComponent9232.paint(graphics);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mba.paint("
					+ (graphics != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3605(int i, int i_0_, int i_1_, float[] fs,
			int i_2_, int i_3_, int i_4_, float f, int i_5_, float[] fs_6_,
			int i_7_) {
		try {
			i_1_ -= i_3_;
			anInt9234++;
			i_0_ -= i_2_;
			i_7_ -= i;
			float f_8_ = (fs[1] * (float) i_1_ + (float) i_0_ * fs[0] + (float) i_7_
					* fs[2]);
			float f_9_ = ((float) i_7_ * fs[5] + (fs[3] * (float) i_0_ + fs[4]
					* (float) i_1_));
			float f_10_ = ((float) i_1_ * fs[i_5_] + fs[6] * (float) i_0_ + (float) i_7_
					* fs[8]);
			float f_11_ = (float) Math.sqrt((double) (f_10_ * f_10_ + (f_8_
					* f_8_ + f_9_ * f_9_)));
			float f_12_ = 0.5F + ((float) Math.atan2((double) f_8_,
					(double) f_10_) / 6.2831855F);
			float f_13_ = ((float) Math.asin((double) (f_9_ / f_11_)) / 3.1415927F + 0.5F + f);
			if ((i_4_ ^ 0xffffffff) != -2) {
				if (i_4_ != 2) {
					if ((i_4_ ^ 0xffffffff) == -4) {
						float f_14_ = f_12_;
						f_12_ = f_13_;
						f_13_ = -f_14_;
					}
				} else {
					f_12_ = -f_12_;
					f_13_ = -f_13_;
				}
			} else {
				float f_15_ = f_12_;
				f_12_ = -f_13_;
				f_13_ = f_15_;
			}
			fs_6_[1] = f_13_;
			fs_6_[0] = f_12_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mba.E(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + (fs != null ? "{...}" : "null")
					+ ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + f + ','
					+ i_5_ + ',' + (fs_6_ != null ? "{...}" : "null") + ','
					+ i_7_ + ')'));
		}
	}

	static final void method3606(int i) {
		try {
			Class46.method402(0);
			anInt9231++;
			Class259.aClass234_3572 = null;
			Class11_Sub31.aClass163_6702 = null;
			if (i == 16) {
				Class109.aClass104ArrayArray1477 = null;
				Class372.aClass234_4876 = null;
				Class96.aClass234_1289 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mba.C(" + i + ')');
		}
	}

	static final void method3607(int i, int i_16_, int i_17_, int i_18_) {
		Class364 class364 = Class181.aClass364ArrayArrayArray2336[i][i_16_][i_17_];
		if (class364 != null) {
			Class376_Sub7_Sub4 class376_sub7_sub4 = ((Class364) class364).aClass376_Sub7_Sub4_4778;
			Class376_Sub7_Sub4 class376_sub7_sub4_19_ = ((Class364) class364).aClass376_Sub7_Sub4_4789;
			if (class376_sub7_sub4 != null) {
				((Class376_Sub7_Sub4) class376_sub7_sub4).aShort9536 = (short) ((((Class376_Sub7_Sub4) class376_sub7_sub4).aShort9536)
						* i_18_ / (16 << Class11_Sub2_Sub8.anInt8751 - 7));
				((Class376_Sub7_Sub4) class376_sub7_sub4).aShort9541 = (short) ((((Class376_Sub7_Sub4) class376_sub7_sub4).aShort9541)
						* i_18_ / (16 << Class11_Sub2_Sub8.anInt8751 - 7));
			}
			if (class376_sub7_sub4_19_ != null) {
				((Class376_Sub7_Sub4) class376_sub7_sub4_19_).aShort9536 = (short) ((((Class376_Sub7_Sub4) class376_sub7_sub4_19_).aShort9536)
						* i_18_ / (16 << Class11_Sub2_Sub8.anInt8751 - 7));
				((Class376_Sub7_Sub4) class376_sub7_sub4_19_).aShort9541 = (short) ((((Class376_Sub7_Sub4) class376_sub7_sub4_19_).aShort9541)
						* i_18_ / (16 << Class11_Sub2_Sub8.anInt8751 - 7));
			}
		}
	}

	public final void update(Graphics graphics) {
		try {
			anInt9230++;
			aComponent9232.update(graphics);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mba.update("
					+ (graphics != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class7 method3608(Stream stream, int i) {
		try {
			anInt9236++;
			Class7 class7 = new Class7();
			((Class7) class7).anInt43 = stream.readUnsignedShort((byte) -65);
			int i_20_ = -69 / ((i - 54) / 32);
			((Class7) class7).aClass11_Sub45_Sub13_46 = Class11_Sub2_Sub10.aClass352_8851
					.method2107(((Class7) class7).anInt43, false);
			return class7;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mba.D("
					+ (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	Canvas_Sub1(Component component) {
		try {
			aComponent9232 = component;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mba.<init>("
					+ (component != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3609(byte i) {
		try {
			aClass192ArrayArray9228 = null;
			int i_21_ = 34 / ((i + 61) / 32);
			anIntArray9229 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mba.A(" + i + ')');
		}
	}
}
