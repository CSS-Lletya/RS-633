/* Class11_Sub51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub51 extends Class11 {
	static int anInt8031;
	static int anInt8032;
	static int[] anIntArray8033 = new int[4];
	static int anInt8034;
	static int anInt8035;
	int anInt8036;
	static int anInt8037;

	static final void method3232(int i, int[] is, int[] is_0_) {
		try {
			anInt8035++;
			if (is == null || is_0_ == null) {
				Class59.aByteArrayArrayArray884 = null;
				Class11_Sub37.anIntArray7085 = null;
				Class4.anIntArray32 = null;
			} else {
				Class4.anIntArray32 = is;
				Class11_Sub37.anIntArray7085 = new int[is.length];
				if (i != 19035)
					anIntArray8033 = null;
				Class59.aByteArrayArrayArray884 = new byte[is.length][][];
				for (int i_1_ = 0; ((Class4.anIntArray32.length ^ 0xffffffff) < (i_1_ ^ 0xffffffff)); i_1_++)
					Class59.aByteArrayArrayArray884[i_1_] = new byte[is_0_[i_1_]][];
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("eca.C(" + i + ','
					+ (is != null ? "{...}" : "null") + ','
					+ (is_0_ != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3233(int i) {
		do {
			try {
				anIntArray8033 = null;
				if (i == 17511)
					break;
				method3232(97, null, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "eca.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final boolean method3234(char c, int i) {
		try {
			anInt8031++;
			if (Character.isISOControl(c))
				return false;
			if (Class236_Sub6.method2823(c, -98))
				return true;
			char[] cs = Class89.aCharArray1225;
			for (int i_2_ = i; (cs.length ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
				int i_3_ = cs[i_2_];
				if (i_3_ == c)
					return true;
			}
			char[] cs_4_ = Class58_Sub2_Sub2.aCharArray9820;
			for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (cs_4_.length ^ 0xffffffff); i_5_++) {
				int i_6_ = cs_4_[i_5_];
				if ((c ^ 0xffffffff) == (i_6_ ^ 0xffffffff))
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eca.B(" + c + ',' + i
					+ ')');
		}
	}

	static final void method3235(int i, int i_7_) {
		try {
			Class108.anInt1455 = 100;
			Class108_Sub8.anInt5737 = i_7_;
			Class134.anInt1848 = -1;
			if (i == 29372) {
				anInt8034++;
				Class308.anInt4126 = 3;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eca.D(" + i + ','
					+ i_7_ + ')');
		}
	}

	public Class11_Sub51() {
		/* empty */
	}

	static final void method3236(long l, int i) {
		try {
			anInt8037++;
			if ((long) i < l) {
				if ((l % 10L ^ 0xffffffffffffffffL) == -1L) {
					Class256_Sub2.method3115(l - 1L, 52);
					Class256_Sub2.method3115(1L, i + 52);
				} else
					Class256_Sub2.method3115(l, i + 52);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eca.E(" + l + ',' + i
					+ ')');
		}
	}

	Class11_Sub51(int i) {
		try {
			((Class11_Sub51) this).anInt8036 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, "eca.<init>(" + i + ')');
		}
	}
}
