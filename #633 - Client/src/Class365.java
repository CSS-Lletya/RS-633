/* Class365 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class365 {
	static int[] anIntArray4790 = new int[16];
	static int anInt4791;
	private Class146 aClass146_4792;
	static int anInt4793;
	private Class146 aClass146_4794;
	static int anInt4795;
	static int anInt4796;
	static volatile int anInt4797 = -1;
	private Class213 aClass213_4798 = new Class213(256);
	static int anInt4799;
	static int anInt4800 = -1;
	private Class213 aClass213_4801 = new Class213(256);

	private final Class11_Sub14_Sub1 method2159(int i, int i_0_, int[] is,
			int i_1_) {
		try {
			anInt4799++;
			int i_2_ = i_0_ ^ (i >>> 12 | (0xfff & i) << 4);
			if (i_1_ <= 103)
				method2164(true);
			i_2_ |= i << 16;
			long l = (long) i_2_;
			Class11_Sub14_Sub1 class11_sub14_sub1 = (Class11_Sub14_Sub1) aClass213_4801
					.method1369((byte) 26, l);
			if (class11_sub14_sub1 != null)
				return class11_sub14_sub1;
			if (is != null && is[0] <= 0)
				return null;
			Class69 class69 = Class69.method506(aClass146_4792, i, i_0_);
			if (class69 == null)
				return null;
			class11_sub14_sub1 = class69.method504();
			aClass213_4801.method1368(l, class11_sub14_sub1, (byte) -26);
			if (is != null)
				is[0] -= (((Class11_Sub14_Sub1) class11_sub14_sub1).aByteArray9358).length;
			return class11_sub14_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("wr.E(" + i + ',' + i_0_
							+ ',' + (is != null ? "{...}" : "null") + ','
							+ i_1_ + ')'));
		}
	}

	public static void method2160(int i) {
		try {
			if (i != -1)
				method2160(51);
			anIntArray4790 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wr.G(" + i + ')');
		}
	}

	final Class11_Sub14_Sub1 method2161(int[] is, int i, int i_3_) {
		try {
			anInt4793++;
			if (aClass146_4794.method928((byte) 20) == 1)
				return method2162(0, i, is, (byte) 81);
			if ((aClass146_4794.method914(i, i_3_ ^ i_3_) ^ 0xffffffff) == -2)
				return method2162(i, 0, is, (byte) 81);
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("wr.A(" + (is != null ? "{...}" : "null") + ',' + i + ','
							+ i_3_ + ')'));
		}
	}

	private final Class11_Sub14_Sub1 method2162(int i, int i_4_, int[] is,
			byte i_5_) {
		try {
			if (i_5_ != 81)
				aClass146_4794 = null;
			anInt4795++;
			int i_6_ = i_4_ ^ (i >>> 12 | (i & 0x20000fff) << 4);
			i_6_ |= i << 16;
			long l = (long) i_6_ ^ 0x100000000L;
			Class11_Sub14_Sub1 class11_sub14_sub1 = (Class11_Sub14_Sub1) aClass213_4801
					.method1369((byte) 26, l);
			if (class11_sub14_sub1 != null)
				return class11_sub14_sub1;
			if (is != null && (is[0] ^ 0xffffffff) >= -1)
				return null;
			Class11_Sub13 class11_sub13 = (Class11_Sub13) aClass213_4798
					.method1369((byte) 26, l);
			if (class11_sub13 == null) {
				class11_sub13 = Class11_Sub13.method2395(aClass146_4794, i,
						i_4_);
				if (class11_sub13 == null)
					return null;
				aClass213_4798.method1368(l, class11_sub13, (byte) -26);
			}
			class11_sub14_sub1 = class11_sub13.method2398(is);
			if (class11_sub14_sub1 == null)
				return null;
			class11_sub13.method122(-38);
			aClass213_4801.method1368(l, class11_sub14_sub1, (byte) -26);
			return class11_sub14_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("wr.D(" + i + ',' + i_4_
							+ ',' + (is != null ? "{...}" : "null") + ','
							+ i_5_ + ')'));
		}
	}

	static final void method2163(int i, int i_7_, int i_8_, int i_9_,
			Class376_Sub7_Sub1 class376_sub7_sub1) {
		Class364 class364 = Class221.method1414(i, i_7_, i_8_);
		if (class364 != null) {
			((Class376_Sub7) class376_sub7_sub1).anInt7045 = (i_7_ << Class11_Sub2_Sub8.anInt8751)
					+ Class19.anInt152;
			((Class376_Sub7) class376_sub7_sub1).anInt7036 = i_9_;
			((Class376_Sub7) class376_sub7_sub1).anInt7031 = (i_8_ << Class11_Sub2_Sub8.anInt8751)
					+ Class19.anInt152;
			((Class364) class364).aClass376_Sub7_Sub1_4782 = class376_sub7_sub1;
			int i_10_ = ((Class315.aClass12Array4179 == Class234_Sub1_Sub1.aClass12Array9729) ? 1
					: 0);
			if (class376_sub7_sub1.method2863(-126)) {
				if (class376_sub7_sub1.method2870(false)) {
					((Class376_Sub7) class376_sub7_sub1).aClass376_Sub7_7032 = Class11_Sub2_Sub25.aClass376_Sub7Array9326[i_10_];
					Class11_Sub2_Sub25.aClass376_Sub7Array9326[i_10_] = class376_sub7_sub1;
				} else {
					((Class376_Sub7) class376_sub7_sub1).aClass376_Sub7_7032 = Class382.aClass376_Sub7Array4971[i_10_];
					Class382.aClass376_Sub7Array4971[i_10_] = class376_sub7_sub1;
					Class333.aBool4411 = true;
				}
			} else {
				((Class376_Sub7) class376_sub7_sub1).aClass376_Sub7_7032 = Class11_Sub45_Sub4.aClass376_Sub7Array8534[i_10_];
				Class11_Sub45_Sub4.aClass376_Sub7Array8534[i_10_] = class376_sub7_sub1;
			}
		}
	}

	static final boolean method2164(boolean bool) {
		try {
			if (bool != true)
				anInt4797 = 64;
			anInt4791++;
			if ((Class318.anInt4230 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wr.C(" + bool + ')');
		}
	}

	final Class11_Sub14_Sub1 method2165(int i, int i_11_, int[] is) {
		try {
			anInt4796++;
			if ((aClass146_4792.method928((byte) 20) ^ 0xffffffff) == -2)
				return method2159(0, i, is, 115);
			if ((aClass146_4792.method914(i, i_11_ ^ ~0x1) ^ 0xffffffff) == i_11_)
				return method2159(i, 0, is, 118);
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wr.B(" + i + ','
					+ i_11_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	Class365(Class146 class146, Class146 class146_12_) {
		try {
			aClass146_4792 = class146;
			aClass146_4794 = class146_12_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wr.<init>("
					+ (class146 != null ? "{...}" : "null") + ','
					+ (class146_12_ != null ? "{...}" : "null") + ')'));
		}
	}
}
