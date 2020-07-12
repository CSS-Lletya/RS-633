/* Class321_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class321_Sub2 extends Class321 {
	static IncomingPacket aClass160_6635 = new IncomingPacket(18, 7);
	static int anInt6636;
	static int anInt6637;
	int anInt6638;
	static int[][] anIntArrayArray6639;
	private int anInt6640;
	static Class382 aClass382_6641;
	int anInt6642;
	int anInt6643;
	static int anInt6644;
	static int anInt6645;
	private int anInt6646 = -1;
	static int anInt6647;
	static Class163 aClass163_6648;

	static final void method2740(int i, int i_0_) {
		try {
			Class301.aLong4060 = 1000000000L / (long) i_0_;
			anInt6637++;
			int i_1_ = -111 % ((i + 59) / 40);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kv.P(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final boolean method2741(int i, byte i_2_, int i_3_) {
		try {
			anInt6636++;
			if (i_2_ > -95)
				anIntArrayArray6639 = null;
			if ((i_3_ & 0x8000 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kv.Q(" + i + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	public final void method8(int i) {
		try {
			anInt6644++;
			OpenGL.glFramebufferTexture3DEXT(anInt6646, anInt6640,
					((Class321) this).anInt4302, 0, 0, 0);
			if (i < -38) {
				anInt6640 = -1;
				anInt6646 = -1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kv.S(" + i + ')');
		}
	}

	Class321_Sub2(Class163_Sub3 class163_sub3, int i, int i_4_, int i_5_,
			int i_6_) {
		super(class163_sub3, 32879, i, i_5_ * (i_4_ * i_6_), false);
		anInt6640 = -1;
		try {
			((Class321_Sub2) this).anInt6642 = i_6_;
			((Class321_Sub2) this).anInt6638 = i_5_;
			((Class321_Sub2) this).anInt6643 = i_4_;
			((Class321) this).aClass163_Sub3_4282.method3295(this, 90);
			OpenGL.glTexImage3Dub(((Class321) this).anInt4302, 0,
					((Class321) this).anInt4297,
					((Class321_Sub2) this).anInt6643,
					((Class321_Sub2) this).anInt6638,
					((Class321_Sub2) this).anInt6642, 0,
					Class6.method88(true, ((Class321) this).anInt4297), 5121,
					null, 0);
			this.method1963(true, false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kv.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	final void method2742(int i, int i_7_, int i_8_, int i_9_, int i_10_,
			int i_11_, int i_12_, int i_13_) {
		try {
			((Class321) this).aClass163_Sub3_4282.method3295(this, 48);
			anInt6645++;
			OpenGL.glCopyTexSubImage3D(((Class321) this).anInt4302, 0, i_10_,
					i_7_, i_8_, i_11_, i_12_, i_9_, i_13_);
			OpenGL.glFlush();
			int i_14_ = -38 / ((43 - i) / 45);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kv.R(" + i + ','
					+ i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ','
					+ i_11_ + ',' + i_12_ + ',' + i_13_ + ')'));
		}
	}

	Class321_Sub2(Class163_Sub3 class163_sub3, int i, int i_15_, int i_16_,
			int i_17_, byte[] is, int i_18_) {
		super(class163_sub3, 32879, i, i_17_ * (i_16_ * i_15_), false);
		anInt6640 = -1;
		try {
			((Class321_Sub2) this).anInt6638 = i_16_;
			((Class321_Sub2) this).anInt6642 = i_17_;
			((Class321_Sub2) this).anInt6643 = i_15_;
			((Class321) this).aClass163_Sub3_4282.method3295(this, 115);
			OpenGL.glPixelStorei(3317, 1);
			OpenGL.glTexImage3Dub(((Class321) this).anInt4302, 0,
					((Class321) this).anInt4297,
					((Class321_Sub2) this).anInt6643,
					((Class321_Sub2) this).anInt6638,
					((Class321_Sub2) this).anInt6642, 0, i_18_, 5121, is, 0);
			OpenGL.glPixelStorei(3317, 4);
			this.method1963(true, false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kv.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ','
					+ (is != null ? "{...}" : "null") + ',' + i_18_ + ')'));
		}
	}

	public static void method2743(int i) {
		try {
			aClass160_6635 = null;
			if (i == -1) {
				aClass163_6648 = null;
				aClass382_6641 = null;
				anIntArrayArray6639 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kv.O(" + i + ')');
		}
	}
}
