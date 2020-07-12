/* Class142 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class142 {
	static Class103 aClass103_1921 = new Class103(true);
	static int anInt1922;
	static int anInt1923;
	static int anInt1924;
	static Class66 aClass66_1925 = new Class66("runescape", 0);
	static int anInt1926;
	static float aFloat1927;

	static final int method896(byte i, boolean bool) {
		try {
			if (i != 41)
				return -3;
			anInt1922++;
			int i_0_ = OutputStream_Sub1.anInt5845;
			while_48_: do {
				while_47_: do {
					do {
						if (i_0_ != 0) {
							if (i_0_ == 1)
								break;
							if (i_0_ != 2)
								break while_48_;
							if (!client.aBool10531)
								break while_47_;
						}
						if (!bool)
							return Class292.anInt3955;
						return 0;
					} while (false);
					return Class292.anInt3955;
				} while (false);
				return 0;
			} while (false);
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fi.C(" + i + ','
					+ bool + ')');
		}
	}

	static final String method897(byte i, boolean bool, int i_1_, long l,
			int i_2_) {
		try {
			anInt1923++;
			char c = ',';
			char c_3_ = '.';
			if (i_1_ == 0) {
				c = '.';
				c_3_ = ',';
			}
			if (i_1_ == 2)
				c_3_ = '\u00a0';
			boolean bool_4_ = false;
			if ((l ^ 0xffffffffffffffffL) > -1L) {
				bool_4_ = true;
				l = -l;
			}
			StringBuffer stringbuffer = new StringBuffer(26);
			if ((i_2_ ^ 0xffffffff) < -1) {
				for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff); i_5_++) {
					int i_6_ = (int) l;
					l /= 10L;
					stringbuffer.append((char) (-(10 * (int) l) + (i_6_ + 48)));
				}
				stringbuffer.append(c);
			}
			if (i < 20)
				return null;
			int i_7_ = 0;
			for (;;) {
				int i_8_ = (int) l;
				l /= 10L;
				stringbuffer.append((char) (i_8_ + 48 + -((int) l * 10)));
				if ((l ^ 0xffffffffffffffffL) == -1L)
					break;
				if (bool && ++i_7_ % 3 == 0)
					stringbuffer.append(c_3_);
			}
			if (bool_4_)
				stringbuffer.append('-');
			return stringbuffer.reverse().toString();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fi.B(" + i + ','
					+ bool + ',' + i_1_ + ',' + l + ',' + i_2_ + ')'));
		}
	}

	public static void method898(boolean bool) {
		do {
			try {
				aClass66_1925 = null;
				aClass103_1921 = null;
				if (bool == false)
					break;
				aFloat1927 = 3.0636134F;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "fi.A(" + bool
						+ ')');
			}
			break;
		} while (false);
	}
}
