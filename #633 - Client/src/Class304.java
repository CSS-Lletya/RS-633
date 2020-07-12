/* Class304 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

final class Class304 {
	static int anInt4089;
	static int anInt4090;
	static int anInt4091 = 0;
	static long aLong4092;
	static int anInt4093;
	static int anInt4094;

	static final void method1869(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		do {
			try {
				for (int i_4_ = 0; i_4_ < Class11_Sub2_Sub6.anInt8702; i_4_++) {
					Rectangle rectangle = Class93.aRectangleArray1249[i_4_];
					if (rectangle.x + rectangle.width > i_3_
							&& rectangle.x < i + i_3_
							&& i_2_ < rectangle.y + rectangle.height
							&& rectangle.y < i_2_ - -i_0_)
						Class11_Sub45.aBoolArray7907[i_4_] = true;
				}
				anInt4089++;
				Class11.method123(i_2_ - -i_0_, i_3_ + i, (byte) -111, i_3_,
						i_2_);
				if (i_1_ == -17012)
					break;
				method1870(-123);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("rl.B(" + i + ','
						+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method1870(int i) {
		try {
			anInt4090++;
			if (i == -19310) {
				if (Class321_Sub2.aClass382_6641 != null)
					Class321_Sub2.aClass382_6641.method2238((byte) 118);
				if (Class351.aThread4620 != null) {
					for (;;) {
						try {
							Class351.aThread4620.join();
							break;
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rl.A(" + i + ')');
		}
	}
}
