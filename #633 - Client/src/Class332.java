/* Class332 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class332 {
	static int anInt4405;
	static int anInt4406;
	static Class84 aClass84_4407 = new Class84();
	static int anInt4408;
	static volatile boolean aBool4409 = false;

	public static void method2001(int i) {
		try {
			if (i == -27527)
				aClass84_4407 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ud.A(" + i + ')');
		}
	}

	static final boolean method2002(int i, int i_0_, int i_1_) {
		try {
			if (i_1_ != 458752)
				aClass84_4407 = null;
			anInt4405++;
			if (!(Class11_Sub45_Sub9_Sub2.method3951((byte) 48, i_0_, i) | (i_0_ & 0x70000 ^ 0xffffffff) != -1)
					&& !Class376_Sub1.method2273((byte) 84, i, i_0_))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ud.C(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final boolean method2003(int i, int i_2_, boolean bool) {
		try {
			anInt4406++;
			if (bool != false)
				return true;
			if ((i_2_ & 0x8000) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ud.D(" + i + ','
					+ i_2_ + ',' + bool + ')'));
		}
	}

	static final void method2004(byte[] is, int i) {
		try {
			anInt4408++;
			if (i != 16143)
				aClass84_4407 = null;
			Stream stream = new Stream(is);
			for (;;) {
				int i_3_ = stream.readUnsignedByte((byte) 35);
				if ((i_3_ ^ 0xffffffff) == -1)
					break;
				if ((i_3_ ^ 0xffffffff) == -3)
					Class11_Sub8.anInt5308 = stream
							.readUnsignedShort((byte) -65);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ud.B("
					+ (is != null ? "{...}" : "null") + ',' + i + ')');
		}
	}
}
