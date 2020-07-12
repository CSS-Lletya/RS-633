/* Class315 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class315 {
	static int anInt4170 = 0;
	static int anInt4171;
	static int anInt4172;
	static boolean[] aBoolArray4173 = new boolean[8];
	static int anInt4174;
	static IncomingPacket aClass160_4175 = new IncomingPacket(116, 2);
	private long aLong4176;
	static int anInt4177;
	private int anInt4178;
	static Class12[] aClass12Array4179;

	public static void method1913(int i) {
		try {
			aClass12Array4179 = null;
			if (i < 118)
				method1913(-66);
			aBoolArray4173 = null;
			aClass160_4175 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sj.B(" + i + ')');
		}
	}

	final Class27 method1914(int i, int i_0_) {
		try {
			anInt4171++;
			int i_1_ = 9 / ((i - 20) / 48);
			return Class27.method227((byte) 38, method1917(i_0_, (byte) 111));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sj.C(" + i + ','
					+ i_0_ + ')');
		}
	}

	final int method1915(byte i) {
		try {
			anInt4177++;
			if (i != 43)
				aBoolArray4173 = null;
			return anInt4178;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sj.A(" + i + ')');
		}
	}

	private final void method1916(Class27 class27, byte i) {
		do {
			try {
				anInt4172++;
				aLong4176 |= (long) (((Class27) class27).anInt343 << Class27.anInt357
						* anInt4178++);
				if (i > 77)
					break;
				method1915((byte) -95);
			} catch (RuntimeException runtimeexception) {
				throw Class205
						.method1298(runtimeexception, ("sj.E("
								+ (class27 != null ? "{...}" : "null") + ','
								+ i + ')'));
			}
			break;
		} while (false);
	}

	Class315(Class27 class27) {
		try {
			aLong4176 = (long) ((Class27) class27).anInt343;
			anInt4178 = 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sj.<init>("
					+ (class27 != null ? "{...}" : "null") + ')');
		}
	}

	private final int method1917(int i, byte i_2_) {
		try {
			if (i_2_ < 4)
				return -93;
			anInt4174++;
			return (int) (aLong4176 >> i * Class27.anInt357) & 0xf;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sj.D(" + i + ','
					+ i_2_ + ')');
		}
	}

	Class315(Class27[] class27s) {
		try {
			for (int i = 0; (class27s.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
				method1916(class27s[i], (byte) 121);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sj.<init>("
					+ (class27s != null ? "{...}" : "null") + ')'));
		}
	}
}
