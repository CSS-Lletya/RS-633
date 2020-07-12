/* Class94_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class94_Sub3 extends Class94 implements Interface12 {
	static int anInt6904;
	static int[] anIntArray6905 = new int[250];
	static IncomingPacket aClass160_6906 = new IncomingPacket(25, 6);
	static Class83 aClass83_6907 = new Class83(13, 19);
	static OutgoingPacket aClass370_6908 = new OutgoingPacket(15, 2);

	Class94_Sub3(Class163_Sub2_Sub1 class163_sub2_sub1, int i, boolean bool,
			int[][] is) {
		super(class163_sub2_sub1, 34067, Class364.aClass98_4774,
				Class366.aClass366_4808, 6 * i * i, bool);
		try {
			((Class94) this).aClass163_Sub2_Sub1_1259.method3094(this, -2);
			if (bool) {
				for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -7; i_0_++)
					this.method636(i, (byte) -2, i_0_ + 34069, i, is[i_0_]);
			} else {
				for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -7; i_1_++)
					OpenGL.glTexImage2Di(
							i_1_ + 34069,
							0,
							this.method637(-89),
							i,
							i,
							0,
							Class11_Sub45_Sub17.method3749((byte) -80,
									(((Class94) this).aClass98_1269)),
							((Class163_Sub2_Sub1) ((Class94) this).aClass163_Sub2_Sub1_1259).anInt8677,
							is[i_1_], 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("mc.<init>("
							+ (class163_sub2_sub1 != null ? "{...}" : "null")
							+ ',' + i + ',' + bool + ','
							+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2798(int i) {
		try {
			int i_2_ = -24 / ((-37 - i) / 40);
			aClass370_6908 = null;
			anIntArray6905 = null;
			aClass83_6907 = null;
			aClass160_6906 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mc.C(" + i + ')');
		}
	}
}
