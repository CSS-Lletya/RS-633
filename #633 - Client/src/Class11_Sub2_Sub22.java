/* Class11_Sub2_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub22 extends Class11_Sub2 {
	static boolean aBool9202 = false;
	static Class253 aClass253_9203;
	static int anInt9204;
	static int anInt9205;
	static int anInt9206;
	private int anInt9207 = 4096;
	static int anInt9208 = 999999;
	static int anInt9209;

	final void method2263(int i, Stream stream, int i_0_) {
		try {
			if (i == 3731) {
				int i_1_ = i_0_;
				if (i_1_ == 0)
					anInt9207 = (stream.readUnsignedByte((byte) 35) << 12) / 255;
				anInt9205++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ko.B(" + i + ','
					+ (stream != null ? "{...}" : "null") + ',' + i_0_ + ')'));
		}
	}

	public Class11_Sub2_Sub22() {
		this(4096);
	}

	final int[] method2254(int i, boolean bool) {
		try {
			anInt9209++;
			if (bool != true)
				method3597(true);
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421)
				Class311.method1899(is, 0, Class33_Sub2.anInt6696, anInt9207);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ko.A(" + i + ','
					+ bool + ')');
		}
	}

	Class11_Sub2_Sub22(int i) {
		super(0, true);
		try {
			anInt9207 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ko.<init>(" + i + ')');
		}
	}

	public static void method3597(boolean bool) {
		try {
			if (bool == false)
				aClass253_9203 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ko.C(" + bool + ')');
		}
	}

	static {
		anInt9206 = -1;
		anInt9204 = 0;
	}
}
