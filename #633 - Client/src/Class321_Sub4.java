/* Class321_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class321_Sub4 extends Class321 {
	static Class361 aClass361_8006;
	static Class231 aClass231_8007;
	static int anInt8008;
	private int anInt8009;
	static IComponentDefinitions aClass192_8010 = null;
	static int anInt8011;

	Class321_Sub4(Class163_Sub3 class163_sub3, int i, int i_0_, byte[] is,
			int i_1_) {
		super(class163_sub3, 3552, i, i_0_, false);
		try {
			anInt8009 = i_0_;
			((Class321) this).aClass163_Sub3_4282.method3295(this, 39);
			OpenGL.glPixelStorei(3317, 1);
			OpenGL.glTexImage1Dub(((Class321) this).anInt4302, 0,
					((Class321) this).anInt4297, anInt8009, 0, i_1_, 5121, is,
					0);
			OpenGL.glPixelStorei(3317, 4);
			this.method1963(true, false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wu.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_0_ + ',' + (is != null ? "{...}" : "null") + ','
					+ i_1_ + ')'));
		}
	}

	public final void method8(int i) {
		do {
			try {
				anInt8011++;
				if (i < -38)
					break;
				method3220((byte) 71);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "wu.S(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method3219(boolean bool, boolean bool_2_) {
		do {
			try {
				anInt8008++;
				((Class321) this).aClass163_Sub3_4282.method3295(this, 88);
				OpenGL.glTexParameteri(((Class321) this).anInt4302, 10242,
						!bool ? 33071 : 10497);
				if (bool_2_ == false)
					break;
				aClass192_8010 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("wu.P(" + bool
						+ ',' + bool_2_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method3220(byte i) {
		try {
			aClass192_8010 = null;
			if (i != 70)
				method3220((byte) -25);
			aClass361_8006 = null;
			aClass231_8007 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wu.O(" + i + ')');
		}
	}
}
