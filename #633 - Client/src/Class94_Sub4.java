/* Class94_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

import jaggl.OpenGL;

final class Class94_Sub4 extends Class94 implements Interface17 {
	static int anInt7723;
	static IncomingPacket aClass160_7724 = new IncomingPacket(46, 7);
	private int anInt7725;
	static boolean aBool7726;
	private int anInt7727;
	static int anInt7728;
	private int anInt7729;
	static int anInt7730;

	Class94_Sub4(Class163_Sub2_Sub1 class163_sub2_sub1, Class98 class98, int i,
			int i_0_, int i_1_, byte[] is) {
		super(class163_sub2_sub1, 32879, class98, Class366.aClass366_4808, i_1_
				* (i_0_ * i), false);
		try {
			anInt7729 = i;
			anInt7727 = i_1_;
			anInt7725 = i_0_;
			((Class94) this).aClass163_Sub2_Sub1_1259.method3094(this, -2);
			OpenGL.glPixelStorei(3317, 1);
			OpenGL.glTexImage3Dub(((Class94) this).anInt1261, 0, this
					.method637(-78), anInt7729, anInt7725, anInt7727, 0,
					Class11_Sub45_Sub17.method3749((byte) -97,
							((Class94) this).aClass98_1269), 5121, is, 0);
			OpenGL.glPixelStorei(3317, 4);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("td.<init>("
							+ (class163_sub2_sub1 != null ? "{...}" : "null")
							+ ',' + (class98 != null ? "{...}" : "null") + ','
							+ i + ',' + i_0_ + ',' + i_1_ + ','
							+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3116(byte i) {
		do {
			try {
				aClass160_7724 = null;
				if (i > 34)
					break;
				anInt7728 = 92;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "td.D(" + i + ')');
			}
			break;
		} while (false);
	}

	static final Class163 method3117(Interface1 interface1, int i, int i_2_,
			Canvas canvas, int i_3_) {
		try {
			if (i_2_ != -14883)
				anInt7730 = 8;
			anInt7723++;
			return new oa(canvas, interface1, i, i_3_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("td.C("
					+ (interface1 != null ? "{...}" : "null") + ',' + i + ','
					+ i_2_ + ',' + (canvas != null ? "{...}" : "null") + ','
					+ i_3_ + ')'));
		}
	}
}
