/* Class11_Sub45_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub45_Sub7 extends Class11_Sub45 {
	static Class37 aClass37_8800;
	static int[] anIntArray8801;
	static int anInt8802;
	static int anInt8803 = 0;
	static int anInt8804;
	static int anInt8805;
	byte[] aByteArray8806;
	static int anInt8807;
	static int anInt8808;
	static int anInt8809;

	static final void method3447(boolean bool, byte i) {
		try {
			anInt8804++;
			int i_0_ = 77 % ((53 - i) / 36);
			int i_1_ = Class56.anInt837;
			int i_2_ = Class108_Sub9.anInt6100;
			if (bool && Class11_Sub45_Sub1.aBool8490) {
				i_1_ <<= 1;
				i_2_ = -i_1_;
			}
			Class321_Sub2.aClass163_6648.f(i_2_, i_1_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cg.F(" + bool + ','
					+ i + ')');
		}
	}

	static final int method3448(byte i, int i_3_, int i_4_) {
		try {
			if (i > -48)
				method3449((byte) 33);
			anInt8805++;
			int i_5_ = 1;
			for (/**/; (i_3_ ^ 0xffffffff) < -2; i_3_ >>= 1) {
				if ((i_3_ & 0x1) != 0)
					i_5_ *= i_4_;
				i_4_ *= i_4_;
			}
			if (i_3_ == 1)
				return i_4_ * i_5_;
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("cg.D(" + i + ','
					+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	public static void method3449(byte i) {
		try {
			if (i < 105)
				aClass37_8800 = null;
			anIntArray8801 = null;
			aClass37_8800 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cg.B(" + i + ')');
		}
	}

	static final boolean method3450(boolean bool, int i, int i_6_) {
		try {
			if (bool != false)
				method3452(-111, null, null, null);
			anInt8808++;
			if (!(Class38.method335(i_6_, i, (byte) -96) | (i_6_ & 0x70000) != 0)
					&& !Class251_Sub1.method2378((byte) 106, i, i_6_))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("cg.E(" + bool + ','
					+ i + ',' + i_6_ + ')'));
		}
	}

	Class11_Sub45_Sub7(byte[] is) {
		try {
			((Class11_Sub45_Sub7) this).aByteArray8806 = is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cg.<init>("
					+ (is != null ? "{...}" : "null") + ')');
		}
	}

	static final void method3451(byte i) {
		do {
			try {
				Class236_Sub3.method2648(0);
				anInt8809++;
				if (i == 8)
					break;
				method3451((byte) 88);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "cg.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method3452(int i, int[] is, Class146 class146,
			Class146 class146_7_) {
		do {
			try {
				if (i == 458752) {
					Class286_Sub1.aClass146_7138 = class146;
					anInt8802++;
					Class41.aClass146_595 = class146_7_;
					if (is == null)
						break;
					Class244.anIntArray3314 = is;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("cg.A(" + i + ','
						+ (is != null ? "{...}" : "null") + ','
						+ (class146 != null ? "{...}" : "null") + ','
						+ (class146_7_ != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static {
		anIntArray8801 = new int[2048];
	}
}
