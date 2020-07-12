/* OutputStream_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.io.IOException;
import java.io.OutputStream;

final class OutputStream_Sub2 extends OutputStream {
	static int anInt7944;
	static int anInt7945;
	static OutgoingPacket aClass370_7946 = new OutgoingPacket(0, 7);
	static int anInt7947;
	static Applet anApplet7948;
	static Class107 aClass107_7949;

	public final void write(int i) throws IOException {
		try {
			anInt7945++;
			throw new IOException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iea.write(" + i + ')');
		}
	}

	static final int method3194(int i, int i_0_, int i_1_, int i_2_) {
		try {
			if (i_0_ != -1260895222)
				aClass107_7949 = null;
			anInt7944++;
			if ((i_1_ ^ 0xffffffff) >= -244) {
				if ((i_1_ ^ 0xffffffff) < -218)
					i >>= 3;
				else if (i_1_ <= 192) {
					if (i_1_ > 179)
						i >>= 1;
				} else
					i >>= 2;
			} else
				i >>= 4;
			return ((0xff & i_2_) >> 2 << 10) + (i >> 5 << 7) - -(i_1_ >> 1);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("iea.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method3195(int i) {
		try {
			anInt7947++;
			for (int i_3_ = i; ((i_3_ ^ 0xffffffff) > (Class376_Sub7_Sub3_Sub1.anInt9863 ^ 0xffffffff)); i_3_++) {
				Class56 class56 = Class343.aClass56Array4543[i_3_];
				if (((Class56) class56).aByte844 == 3) {
					if (((Class56) class56).aClass11_Sub6_Sub4_851 != null)
						Class233.aClass11_Sub6_Sub1_3185
								.method3464(((Class56) class56).aClass11_Sub6_Sub4_851);
					else
						((Class56) class56).anInt845 = -2147483648;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iea.C(" + i + ')');
		}
	}

	public static void method3196(boolean bool) {
		try {
			anApplet7948 = null;
			aClass370_7946 = null;
			if (bool != false)
				method3196(false);
			aClass107_7949 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iea.B(" + bool + ')');
		}
	}
}
