/* Class321 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

abstract class Class321 implements Interface18 {
	static int anInt4279;
	static Class33 aClass33_4280;
	static int anInt4281;
	Class163_Sub3 aClass163_Sub3_4282;
	int anInt4283;
	static int anInt4284 = -1;
	static int anInt4285;
	static int anInt4286;
	static int anInt4287;
	static int anInt4288;
	static int anInt4289;
	private int anInt4290;
	static int anInt4291;
	private boolean aBool4292;
	static Class146 aClass146_4293;
	private boolean aBool4294 = false;
	static int anInt4295 = -1;
	static int anInt4296;
	int anInt4297;
	static int anInt4298;
	static int anInt4299;
	static int anInt4300;
	static int anInt4301;
	int anInt4302;

	private final void method1951(boolean bool) {
		try {
			anInt4296++;
			((Class321) this).aClass163_Sub3_4282.method3295(this, 48);
			if (bool != true)
				((Class321) this).anInt4297 = -115;
			if (aBool4294) {
				OpenGL.glTexParameteri(((Class321) this).anInt4302, 10241,
						!aBool4292 ? 9729 : 9987);
				OpenGL.glTexParameteri(((Class321) this).anInt4302, 10240, 9729);
			} else {
				OpenGL.glTexParameteri(((Class321) this).anInt4302, 10241,
						!aBool4292 ? 9728 : 9984);
				OpenGL.glTexParameteri(((Class321) this).anInt4302, 10240, 9728);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ta.D(" + bool + ')');
		}
	}

	final void method1952(boolean bool) {
		do {
			try {
				anInt4291++;
				if (bool == true) {
					if (((Class321) this).anInt4283 <= 0)
						break;
					((Class321) this).aClass163_Sub3_4282.method3301(
							method1955(90), -188, ((Class321) this).anInt4283);
					((Class321) this).anInt4283 = 0;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ta.J(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	protected final void finalize() throws Throwable {
		try {
			method1952(true);
			anInt4288++;
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ta.finalize(" + ')');
		}
	}

	public static void method1953(int i) {
		try {
			if (i == -22076) {
				aClass146_4293 = null;
				aClass33_4280 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ta.N(" + i + ')');
		}
	}

	final void method1954(int i, boolean bool) {
		try {
			if (i != 10240)
				method1952(false);
			if (!bool != !aBool4292) {
				int i_0_ = method1955(i - 10212);
				aBool4292 = true;
				method1951(true);
				method1964(17328, i_0_);
			}
			anInt4298++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ta.H(" + i + ','
					+ bool + ')');
		}
	}

	private final int method1955(int i) {
		try {
			anInt4286++;
			int i_1_ = (((Class321) this).aClass163_Sub3_4282.method3249(
					-22330, ((Class321) this).anInt4297) * anInt4290);
			if (i < 18)
				method1951(false);
			if (!aBool4292)
				return i_1_;
			return 4 * i_1_ / 3;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ta.L(" + i + ')');
		}
	}

	final boolean method1956(int i) {
		try {
			anInt4287++;
			if (i != 0)
				method1955(-85);
			if (((Class163_Sub3) ((Class321) this).aClass163_Sub3_4282).aBool8341) {
				int i_2_ = method1955(37);
				((Class321) this).aClass163_Sub3_4282.method3295(this, 127);
				OpenGL.glGenerateMipmapEXT(((Class321) this).anInt4302);
				aBool4292 = true;
				method1951(true);
				method1964(i ^ 0x43b0, i_2_);
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ta.K(" + i + ')');
		}
	}

	final int method1957(int i) {
		try {
			anInt4299++;
			if (i != -32626)
				method1951(true);
			return ((Class321) this).anInt4283;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ta.E(" + i + ')');
		}
	}

	static final void method1958(Class376_Sub7 class376_sub7,
			Class11_Sub46[] class11_sub46s) {
		if (Class11_Sub2_Sub17.aBool9051) {
			int i = class376_sub7.method2859(class11_sub46s, -1);
			Class87.aClass163_1210.method1001(i, class11_sub46s);
		}
		if (Class234_Sub1_Sub1.aClass12Array9729 == Class315.aClass12Array4179) {
			boolean bool = false;
			boolean bool_3_ = false;
			int i;
			int i_4_;
			if (class376_sub7 instanceof Class376_Sub7_Sub5) {
				i = (((Class376_Sub7_Sub5) (Class376_Sub7_Sub5) class376_sub7).aShort9626);
				i_4_ = ((Class376_Sub7_Sub5) (Class376_Sub7_Sub5) class376_sub7).aShort9629;
			} else {
				i = (((Class376_Sub7) class376_sub7).anInt7045 >> Class11_Sub2_Sub8.anInt8751);
				i_4_ = (((Class376_Sub7) class376_sub7).anInt7031 >> Class11_Sub2_Sub8.anInt8751);
			}
			Class87.aClass163_1210.EA((Class11_Sub2_Sub38.aClass12Array9796[0]
					.method130(((Class376_Sub7) class376_sub7).anInt7031,
							((Class376_Sub7) class376_sub7).anInt7045, -127)),
					Class108_Sub17.method2733(i, i_4_), Class29.method249(i,
							i_4_), Class140.method888(i, i_4_));
		}
		Class376_Sub5 class376_sub5 = class376_sub7.method2876((byte) -127,
				Class87.aClass163_1210);
		if (class376_sub5 != null) {
			if (((Class376_Sub7) class376_sub7).aBool7044) {
				Class376_Sub4[] class376_sub4s = ((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916;
				for (int i = 0; i < class376_sub4s.length; i++) {
					Class376_Sub4 class376_sub4 = class376_sub4s[i];
					if (((Class376_Sub4) class376_sub4).aBool6124)
						Class11.method123(
								(((Class376_Sub4) class376_sub4).anInt6126 + ((Class376_Sub4) class376_sub4).anInt6125),
								(((Class376_Sub4) class376_sub4).anInt6127 + ((Class376_Sub4) class376_sub4).anInt6125),
								(byte) -86,
								(((Class376_Sub4) class376_sub4).anInt6122 - ((Class376_Sub4) class376_sub4).anInt6125),
								(((Class376_Sub4) class376_sub4).anInt6123 - ((Class376_Sub4) class376_sub4).anInt6125));
				}
			}
			if (((Class376_Sub5) class376_sub5).aBool6914) {
				((Class376_Sub5) class376_sub5).aClass376_Sub7_6917 = class376_sub7;
				if (Class376_Sub1.aBool5098) {
					synchronized (Class206.aClass103_2779) {
						Class206.aClass103_2779.method683((byte) -91,
								class376_sub5);
					}
				} else
					Class206.aClass103_2779.method683((byte) -107,
							class376_sub5);
			} else
				Class16.method155(0, class376_sub5);
		}
	}

	static final float[] method1959(int i, byte i_5_, float[] fs) {
		try {
			if (i_5_ != 31)
				method1959(-67, (byte) -23, null);
			anInt4300++;
			float[] fs_6_ = new float[i];
			Class311.method1897(fs, 0, fs_6_, 0, i);
			return fs_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ta.G(" + i + ','
					+ i_5_ + ',' + (fs != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class277 method1960(boolean bool, int i,
			Class163_Sub3 class163_sub3, String string) {
		try {
			anInt4279++;
			if (bool != true)
				anInt4284 = 78;
			int i_7_ = OpenGL.glGenProgramARB();
			OpenGL.glBindProgramARB(i, i_7_);
			OpenGL.glProgramStringARB(i, 34933, string);
			OpenGL.glGetIntegerv(34379, Class189.anIntArray2436, 0);
			if (Class189.anIntArray2436[0] != -1) {
				OpenGL.glBindProgramARB(i, 0);
				return null;
			}
			OpenGL.glBindProgramARB(i, 0);
			return new Class277(class163_sub3, i, i_7_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ta.F(" + bool + ','
					+ i + ',' + (class163_sub3 != null ? "{...}" : "null")
					+ ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1961(Class146 class146, byte i,
			Interface1 interface1) {
		try {
			Class314.aClass146_4165 = class146;
			if (i > -107)
				method1961(null, (byte) 15, null);
			Class129.anInterface1_1753 = interface1;
			anInt4289++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ta.B("
					+ (class146 != null ? "{...}" : "null") + ',' + i + ','
					+ (interface1 != null ? "{...}" : "null") + ')'));
		}
	}

	static final boolean method1962(byte i, int i_8_, int i_9_) {
		try {
			if (i > -84)
				method1962((byte) 25, 40, -126);
			anInt4285++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ta.A(" + i + ','
					+ i_8_ + ',' + i_9_ + ')'));
		}
	}

	final void method1963(boolean bool, boolean bool_10_) {
		try {
			if (!bool == aBool4294) {
				aBool4294 = bool;
				method1951(!bool_10_);
			}
			if (bool_10_ != false)
				method1961(null, (byte) -38, null);
			anInt4281++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ta.C(" + bool + ','
					+ bool_10_ + ')');
		}
	}

	private final void method1964(int i, int i_11_) {
		try {
			((Class163_Sub3) ((Class321) this).aClass163_Sub3_4282).anInt8286 -= i_11_;
			anInt4301++;
			if (i != 17328)
				((Class321) this).aClass163_Sub3_4282 = null;
			((Class163_Sub3) ((Class321) this).aClass163_Sub3_4282).anInt8286 += method1955(i ^ 0x4395);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ta.I(" + i + ','
					+ i_11_ + ')');
		}
	}

	Class321(Class163_Sub3 class163_sub3, int i, int i_12_, int i_13_,
			boolean bool) {
		try {
			((Class321) this).anInt4302 = i;
			aBool4292 = bool;
			((Class321) this).aClass163_Sub3_4282 = class163_sub3;
			((Class321) this).anInt4297 = i_12_;
			anInt4290 = i_13_;
			OpenGL.glGenTextures(1, InputStream_Sub1.anIntArray6284, 0);
			((Class321) this).anInt4283 = InputStream_Sub1.anIntArray6284[0];
			method1964(17328, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ta.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_12_ + ',' + i_13_ + ',' + bool + ')'));
		}
	}

	public abstract void method8(int i);
}
