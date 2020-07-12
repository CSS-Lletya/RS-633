/* Class374 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class374 {
	static int anInt4888;
	static int anInt4889;
	static String aString4890 = null;
	private Class22 aClass22_4891 = new Class22(128);
	static int anInt4892;
	private Class146 aClass146_4893;
	static int anInt4894;

	static final long method2200(int i, String string) {
		try {
			anInt4892++;
			int i_0_ = string.length();
			long l = 0L;
			for (int i_1_ = i; i_0_ > i_1_; i_1_++)
				l = (long) string.charAt(i_1_) + ((l << 5) - l);
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gga.C(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	final Class20 method2201(int i, int i_2_) {
		try {
			anInt4889++;
			Class20 class20;
			synchronized (aClass22_4891) {
				class20 = (Class20) aClass22_4891
						.method188((long) i, (byte) 86);
			}
			if (class20 != null)
				return class20;
			byte[] is = aClass146_4893.method930(
					Class170.method1114(i, (byte) -68), (byte) 112,
					Class63.method481((byte) -58, i));
			if (i_2_ < 93)
				aString4890 = null;
			class20 = new Class20();
			if (is != null)
				class20.method168(new Stream(is), -1);
			synchronized (aClass22_4891) {
				aClass22_4891.method184((byte) 124, class20, (long) i);
			}
			return class20;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gga.B(" + i + ','
					+ i_2_ + ')');
		}
	}

	Class374(Class66 class66, int i, Class146 class146) {
		do {
			try {
				aClass146_4893 = class146;
				if (aClass146_4893 == null)
					break;
				int i_3_ = -1 + aClass146_4893.method928((byte) 20);
				aClass146_4893.method914(i_3_, 0);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("gga.<init>("
						+ (class66 != null ? "{...}" : "null") + ',' + i + ','
						+ (class146 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method2202(boolean bool) {
		do {
			try {
				aString4890 = null;
				if (bool == true)
					break;
				method2202(true);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "gga.A(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	static {
		anInt4888 = 0;
	}
}
