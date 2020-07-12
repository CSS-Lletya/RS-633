/* Class11_Sub2_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub37 extends Class11_Sub2 {
	static int anInt9757 = -2;
	static int anInt9758;
	static int anInt9759;
	static int anInt9760;
	static int anInt9761;

	static final void method3840(int i, boolean bool, int i_0_) {
		try {
			Class127.anInt1720 = -Class32.anInt441 + i_0_;
			anInt9758++;
			if (bool != true)
				method3841(null, false, 61, 74);
			Class11_Sub12.anInt5446 = i - Class32.anInt451;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gea.C(" + i + ','
					+ bool + ',' + i_0_ + ')'));
		}
	}

	static final int method3841(byte[] is, boolean bool, int i, int i_1_) {
		try {
			anInt9761++;
			int i_2_ = -1;
			if (bool != true)
				anInt9757 = -63;
			for (int i_3_ = i_1_; i > i_3_; i_3_++)
				i_2_ = i_2_ >>> 8
						^ (Class11_Sub30_Sub1.anIntArray8977[(is[i_3_] ^ i_2_) & 0xff]);
			i_2_ ^= 0xffffffff;
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gea.E("
					+ (is != null ? "{...}" : "null") + ',' + bool + ',' + i
					+ ',' + i_1_ + ')'));
		}
	}

	public Class11_Sub2_Sub37() {
		super(0, true);
	}

	static final Class307[] method3842(int i) {
		try {
			anInt9760++;
			if (i != 12686)
				anInt9757 = -15;
			return (new Class307[] { Class350.aClass307_4608,
					Class376_Sub7.aClass307_7038, Class316.aClass307_4181 });
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gea.F(" + i + ')');
		}
	}

	final int[] method2254(int i, boolean bool) {
		try {
			anInt9759++;
			if (bool != true)
				return null;
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421)
				Class311.method1899(is, 0, Class33_Sub2.anInt6696,
						Class171.anIntArray2199[i]);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gea.A(" + i + ','
					+ bool + ')');
		}
	}
}
