/* Class93 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

final class Class93 {
	static int anInt1246;
	static int anInt1247;
	static Class203[] aClass203Array1248;
	static Rectangle[] aRectangleArray1249 = new Rectangle[100];
	static float aFloat1250;

	static final boolean method627(int i, int i_0_) {
		try {
			anInt1246++;
			if (i >= -96)
				method629(false);
			if (i_0_ != 0 && (i_0_ ^ 0xffffffff) != -2
					&& (i_0_ ^ 0xffffffff) != -3)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bs.C(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final boolean method628(int i, int i_1_, int i_2_) {
		try {
			anInt1247++;
			if (i_2_ != 30743)
				aRectangleArray1249 = null;
			if ((0x10 & i_1_) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bs.A(" + i + ','
					+ i_1_ + ',' + i_2_ + ')'));
		}
	}

	public static void method629(boolean bool) {
		do {
			try {
				aRectangleArray1249 = null;
				aClass203Array1248 = null;
				if (bool == true)
					break;
				aClass203Array1248 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "bs.B(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	static {
		for (int i = 0; i < 100; i++)
			aRectangleArray1249[i] = new Rectangle();
	}
}
