/* Class11_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;

abstract class Class11_Sub30 extends Class11 {
	int[] anIntArray6611;
	static int anInt6612;
	int anInt6613;
	static IComponentDefinitions[] aClass192Array6614;
	static int anInt6615;
	static int anInt6616;
	int anInt6617;

	static final long method2728(int i, String string) {
		try {
			if (i != 57)
				method2728(-31, null);
			anInt6616++;
			long l = 0L;
			int i_0_ = string.length();
			for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff); i_1_++) {
				l *= 37L;
				int i_2_ = string.charAt(i_1_);
				if (i_2_ >= 65 && (i_2_ ^ 0xffffffff) >= -91)
					l += (long) (1 - (-i_2_ + 65));
				else if (i_2_ < 97 || (i_2_ ^ 0xffffffff) < -123) {
					if ((i_2_ ^ 0xffffffff) <= -49 && i_2_ <= 57)
						l += (long) (-21 + i_2_);
				} else
					l += (long) (-97 + (i_2_ + 1));
				if ((l ^ 0xffffffffffffffffL) <= -177917621779460414L)
					break;
			}
			for (/**/; ((l % 37L ^ 0xffffffffffffffffL) == -1L && (l ^ 0xffffffffffffffffL) != -1L); l /= 37L) {
				/* empty */
			}
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kq.B(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2729(int i) {
		do {
			try {
				aClass192Array6614 = null;
				if (i <= -122)
					break;
				method2728(58, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "kq.A(" + i + ')');
			}
			break;
		} while (false);
	}

	abstract void method2730(int i, int i_3_, int i_4_, int i_5_, int i_6_,
			int i_7_, int i_8_, Graphics graphics);

	abstract void method2731(int i, int i_9_, boolean bool, Canvas canvas);

	public Class11_Sub30() {
		/* empty */
	}
}
