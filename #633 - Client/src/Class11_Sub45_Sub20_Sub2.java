/* Class11_Sub45_Sub20_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub45_Sub20_Sub2 extends Class11_Sub45_Sub20 {
	static int anInt10211;
	byte aByte10212;
	static int anInt10213;
	static int[] anIntArray10214 = new int[4];
	int anInt10215;
	static int anInt10216;
	static int anInt10217;
	Stream aClass11_Sub20_10218;
	static int anInt10219;
	static int[] anIntArray10220 = new int[8];
	static int anInt10221;

	static final int method3939(byte i, Packet class11_sub20_sub1) {
		try {
			anInt10211++;
			if (i != -5)
				anIntArray10220 = null;
			int i_0_ = class11_sub20_sub1.readBits(2, (byte) 108);
			int i_1_;
			if (i_0_ == 0)
				i_1_ = 0;
			else if ((i_0_ ^ 0xffffffff) == -2)
				i_1_ = class11_sub20_sub1.readBits(5, (byte) 108);
			else if ((i_0_ ^ 0xffffffff) == -3)
				i_1_ = class11_sub20_sub1.readBits(8, (byte) 108);
			else
				i_1_ = class11_sub20_sub1.readBits(11, (byte) 108);
			return i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("iba.A(" + i + ','
					+ (class11_sub20_sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class268 method3940(int i, int i_2_) {
		try {
			anInt10217++;
			Class268 class268 = ((Class268) Class2.aClass22_12.method188(
					(long) i_2_, (byte) 108));
			if (class268 != null)
				return class268;
			byte[] is = Class11_Sub45_Sub11.aClass146_9162.method930(i_2_,
					(byte) 112, i);
			class268 = new Class268();
			if (is != null)
				class268.method1688(new Stream(is), i_2_, (byte) -43);
			Class2.aClass22_12.method184((byte) 127, class268, (long) i_2_);
			return class268;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iba.G(" + i + ','
					+ i_2_ + ')');
		}
	}

	final int method3830(int i) {
		try {
			anInt10221++;
			if (((Class11_Sub45_Sub20_Sub2) this).aClass11_Sub20_10218 == null)
				return 0;
			if (i != 0)
				return 86;
			return (((Stream) (((Class11_Sub45_Sub20_Sub2) this).aClass11_Sub20_10218)).position * 100 / (-((Class11_Sub45_Sub20_Sub2) this).aByte10212 + (((Stream) (((Class11_Sub45_Sub20_Sub2) this).aClass11_Sub20_10218)).buffer).length));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iba.E(" + i + ')');
		}
	}

	final byte[] method3833(byte i) {
		try {
			anInt10216++;
			if (((Class11_Sub45_Sub20) this).aBool9737
					|| (((-((Class11_Sub45_Sub20_Sub2) this).aByte10212 + (((Stream) (((Class11_Sub45_Sub20_Sub2) this).aClass11_Sub20_10218)).buffer).length) ^ 0xffffffff) < (((Stream) (((Class11_Sub45_Sub20_Sub2) this).aClass11_Sub20_10218)).position ^ 0xffffffff)))
				throw new RuntimeException();
			if (i != 68)
				((Class11_Sub45_Sub20_Sub2) this).aByte10212 = (byte) -69;
			return (((Stream) ((Class11_Sub45_Sub20_Sub2) this).aClass11_Sub20_10218).buffer);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iba.C(" + i + ')');
		}
	}

	static final String method3941(byte[] is, int i, int i_3_, int i_4_) {
		try {
			anInt10219++;
			if (i_3_ != 63)
				return null;
			char[] cs = new char[i_4_];
			int i_5_ = 0;
			for (int i_6_ = 0; (i_4_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++) {
				int i_7_ = 0xff & is[i_6_ + i];
				if ((i_7_ ^ 0xffffffff) != -1) {
					if ((i_7_ ^ 0xffffffff) <= -129
							&& (i_7_ ^ 0xffffffff) > -161) {
						int i_8_ = Class108.aCharArray1465[-128 + i_7_];
						if (i_8_ == 0)
							i_8_ = 63;
						i_7_ = i_8_;
					}
					cs[i_5_++] = (char) i_7_;
				}
			}
			return new String(cs, 0, i_5_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("iba.D("
					+ (is != null ? "{...}" : "null") + ',' + i + ',' + i_3_
					+ ',' + i_4_ + ')'));
		}
	}

	public static void method3942(int i) {
		try {
			if (i != 4)
				method3941(null, 93, 3, -108);
			anIntArray10220 = null;
			anIntArray10214 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iba.F(" + i + ')');
		}
	}

	static final byte[] method3943(byte[] is, byte i) {
		try {
			anInt10213++;
			if (i != 95)
				method3942(-101);
			int i_9_ = is.length;
			byte[] is_10_ = new byte[i_9_];
			Class311.method1898(is, 0, is_10_, 0, i_9_);
			return is_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iba.B("
					+ (is != null ? "{...}" : "null") + ',' + i + ')');
		}
	}
}
