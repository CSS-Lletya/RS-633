/* Class171 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class171 {
	static int anInt2187;
	static int anInt2188;
	static int anInt2189;
	int anInt2190;
	static int anInt2191;
	static float aFloat2192 = 0.0F;
	static int anInt2193;
	static int anInt2194;
	static int anInt2195;
	static int anInt2196;
	private Class146 aClass146_2197;
	static String[] aStringArray2198;
	static int[] anIntArray2199;
	private Class22 aClass22_2200 = new Class22(64);

	final Class71 method1119(int i, byte i_0_) {
		try {
			anInt2195++;
			Class71 class71;
			synchronized (aClass22_2200) {
				class71 = (Class71) aClass22_2200
						.method188((long) i, (byte) 87);
			}
			if (class71 != null)
				return class71;
			byte[] is;
			synchronized (aClass146_2197) {
				int i_1_ = 73 % ((59 - i_0_) / 36);
				is = aClass146_2197.method930(i, (byte) 112, 16);
			}
			class71 = new Class71();
			if (is != null)
				class71.method513(new Stream(is), (byte) -117);
			synchronized (aClass22_2200) {
				aClass22_2200.method184((byte) 125, class71, (long) i);
			}
			return class71;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hn.G(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method1120(byte i, int i_2_) {
		try {
			anInt2194++;
			synchronized (aClass22_2200) {
				if (i != -31)
					aClass22_2200 = null;
				aClass22_2200.method182(i_2_, (byte) -73);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hn.H(" + i + ','
					+ i_2_ + ')');
		}
	}

	static final Class300 method1121(int i,
			Class163_Sub2_Sub1 class163_sub2_sub1, Class274[] class274s) {
		try {
			anInt2187++;
			int i_3_ = 0;
			if (i > -126)
				method1125(99, -115, -3, 127L);
			for (/**/; i_3_ < class274s.length; i_3_++) {
				if (class274s[i_3_] == null
						|| (((Class274) class274s[i_3_]).aLong3690 ^ 0xffffffffffffffffL) >= -1L)
					return null;
			}
			long l = OpenGL.glCreateProgramObjectARB();
			for (int i_4_ = 0; class274s.length > i_4_; i_4_++)
				OpenGL.glAttachObjectARB(l,
						(((Class274) class274s[i_4_]).aLong3690));
			OpenGL.glLinkProgramARB(l);
			OpenGL.glGetObjectParameterivARB(l, 35714, Class182.anIntArray2346,
					0);
			if (Class182.anIntArray2346[0] == 0) {
				if ((Class182.anIntArray2346[0] ^ 0xffffffff) == -1)
					System.out.println("Shader linking failed:");
				OpenGL.glGetObjectParameterivARB(l, 35716,
						Class182.anIntArray2346, 1);
				if ((Class182.anIntArray2346[1] ^ 0xffffffff) < -2) {
					byte[] is = new byte[Class182.anIntArray2346[1]];
					OpenGL.glGetInfoLogARB(l, Class182.anIntArray2346[1],
							Class182.anIntArray2346, 0, is, 0);
					System.out.println(new String(is));
				}
				if (Class182.anIntArray2346[0] == 0) {
					for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (class274s.length ^ 0xffffffff); i_5_++)
						OpenGL.glDetachObjectARB(l,
								(((Class274) class274s[i_5_]).aLong3690));
					OpenGL.glDeleteObjectARB(l);
					return null;
				}
			}
			return new Class300(class163_sub2_sub1, l, class274s);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hn.E(" + i + ','
					+ (class163_sub2_sub1 != null ? "{...}" : "null") + ','
					+ (class274s != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1122(int i) {
		do {
			try {
				anIntArray2199 = null;
				aStringArray2198 = null;
				if (i == 15)
					break;
				method1125(-85, 117, -3, 63L);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "hn.B(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1123(int i) {
		do {
			try {
				anInt2196++;
				synchronized (aClass22_2200) {
					aClass22_2200.method189((byte) -127);
				}
				if (i == 15)
					break;
				method1124(-113);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "hn.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final Class150[] method1124(int i) {
		try {
			if (i != 25992)
				anIntArray2199 = null;
			anInt2191++;
			return (new Class150[] { Class11_Sub2_Sub3.aClass150_8466,
					Class53.aClass150_816, Class108_Sub1.aClass150_5028 });
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hn.F(" + i + ')');
		}
	}

	static final void method1125(int i, int i_6_, int i_7_, long l) {
		try {
			if (i_7_ <= 88)
				method1124(67);
			anInt2188++;
			int i_8_ = (0x7c93a & (int) l) >> 14;
			int i_9_ = ((int) l & 0x308bfb) >> 20;
			int i_10_ = 0x7fffffff & (int) (l >>> 32);
			if ((i_8_ ^ 0xffffffff) == -11 || (i_8_ ^ 0xffffffff) == -12
					|| (i_8_ ^ 0xffffffff) == -23) {
				Class42 class42 = Class11_Sub4.aClass290_5237.method1793(
						(byte) 124, i_10_);
				int i_11_;
				int i_12_;
				if (i_9_ != 0 && i_9_ != 2) {
					i_12_ = ((Class42) class42).anInt682;
					i_11_ = ((Class42) class42).anInt687;
				} else {
					i_11_ = ((Class42) class42).anInt682;
					i_12_ = ((Class42) class42).anInt687;
				}
				int i_13_ = ((Class42) class42).anInt639;
				if ((i_9_ ^ 0xffffffff) != -1)
					i_13_ = (i_13_ << i_9_ & 0xf) - -(i_13_ >> 4 - i_9_);
				Class64.method485(0, i_13_, 1, i_11_, i_12_, 0, i_6_, true, i);
			} else
				Class64.method485(i_8_, 0, 1, 0, 0, i_9_, i_6_, true, i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hn.D(" + i + ','
					+ i_6_ + ',' + i_7_ + ',' + l + ')'));
		}
	}

	final void method1126(int i) {
		try {
			synchronized (aClass22_2200) {
				aClass22_2200.method190(i ^ i);
			}
			anInt2189++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hn.C(" + i + ')');
		}
	}

	Class171(Class66 class66, int i, Class146 class146) {
		try {
			aClass146_2197 = class146;
			if (aClass146_2197 == null)
				((Class171) this).anInt2190 = 0;
			else
				((Class171) this).anInt2190 = aClass146_2197.method914(16, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hn.<init>("
					+ (class66 != null ? "{...}" : "null") + ',' + i + ','
					+ (class146 != null ? "{...}" : "null") + ')'));
		}
	}
}
