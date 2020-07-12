/* Class247 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class247 {
	private static byte[] aByteArray3332 = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
			2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
			2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
			2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2,
			2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0 };
	private Stream aClass11_Sub20_3333;
	private int[] anIntArray3334;
	private int[] anIntArray3335;
	int[] anIntArray3336;
	private int anInt3337;
	private int[] anIntArray3338;
	private long aLong3339;
	int anInt3340;

	final boolean method1554() {
		int i = anIntArray3338.length;
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			if (anIntArray3338[i_0_] >= 0)
				return false;
		}
		return true;
	}

	private final int method1555(int i, int i_1_) {
		if (i_1_ == 255) {
			int i_2_ = aClass11_Sub20_3333.readUnsignedByte((byte) 35);
			int i_3_ = aClass11_Sub20_3333.method2544((byte) 122);
			if (i_2_ == 47) {
				((Stream) aClass11_Sub20_3333).position += i_3_;
				return 1;
			}
			if (i_2_ == 81) {
				int i_4_ = aClass11_Sub20_3333.method2558(false);
				i_3_ -= 3;
				int i_5_ = ((Class247) this).anIntArray3336[i];
				aLong3339 += (long) i_5_ * (long) (anInt3337 - i_4_);
				anInt3337 = i_4_;
				((Stream) aClass11_Sub20_3333).position += i_3_;
				return 2;
			}
			((Stream) aClass11_Sub20_3333).position += i_3_;
			return 3;
		}
		byte i_6_ = aByteArray3332[i_1_ - 128];
		int i_7_ = i_1_;
		if (i_6_ >= 1)
			i_7_ |= aClass11_Sub20_3333.readUnsignedByte((byte) 35) << 8;
		if (i_6_ >= 2)
			i_7_ |= aClass11_Sub20_3333.readUnsignedByte((byte) 35) << 16;
		return i_7_;
	}

	final int method1556(int i) {
		int i_8_ = method1568(i);
		return i_8_;
	}

	final void method1557(int i) {
		int i_9_ = aClass11_Sub20_3333.method2544((byte) 122);
		((Class247) this).anIntArray3336[i] += i_9_;
	}

	final int method1558() {
		int i = anIntArray3338.length;
		int i_10_ = -1;
		int i_11_ = 2147483647;
		for (int i_12_ = 0; i_12_ < i; i_12_++) {
			if (anIntArray3338[i_12_] >= 0
					&& ((Class247) this).anIntArray3336[i_12_] < i_11_) {
				i_10_ = i_12_;
				i_11_ = ((Class247) this).anIntArray3336[i_12_];
			}
		}
		return i_10_;
	}

	final void method1559(int i) {
		anIntArray3338[i] = ((Stream) aClass11_Sub20_3333).position;
	}

	final void method1560(byte[] is) {
		((Stream) aClass11_Sub20_3333).buffer = is;
		((Stream) aClass11_Sub20_3333).position = 10;
		int i = aClass11_Sub20_3333.readUnsignedShort((byte) -65);
		((Class247) this).anInt3340 = aClass11_Sub20_3333
				.readUnsignedShort((byte) -65);
		anInt3337 = 500000;
		anIntArray3335 = new int[i];
		int i_13_ = 0;
		while (i_13_ < i) {
			int i_14_ = aClass11_Sub20_3333.readInt(118);
			int i_15_ = aClass11_Sub20_3333.readInt(117);
			if (i_14_ == 1297379947) {
				anIntArray3335[i_13_] = ((Stream) aClass11_Sub20_3333).position;
				i_13_++;
			}
			((Stream) aClass11_Sub20_3333).position += i_15_;
		}
		aLong3339 = 0L;
		anIntArray3338 = new int[i];
		for (int i_16_ = 0; i_16_ < i; i_16_++)
			anIntArray3338[i_16_] = anIntArray3335[i_16_];
		((Class247) this).anIntArray3336 = new int[i];
		anIntArray3334 = new int[i];
	}

	final void method1561() {
		((Stream) aClass11_Sub20_3333).buffer = null;
		anIntArray3335 = null;
		anIntArray3338 = null;
		((Class247) this).anIntArray3336 = null;
		anIntArray3334 = null;
	}

	public static void method1562() {
		aByteArray3332 = null;
	}

	final void method1563(long l) {
		aLong3339 = l;
		int i = anIntArray3338.length;
		for (int i_17_ = 0; i_17_ < i; i_17_++) {
			((Class247) this).anIntArray3336[i_17_] = 0;
			anIntArray3334[i_17_] = 0;
			((Stream) aClass11_Sub20_3333).position = anIntArray3335[i_17_];
			method1557(i_17_);
			anIntArray3338[i_17_] = ((Stream) aClass11_Sub20_3333).position;
		}
	}

	final void method1564() {
		((Stream) aClass11_Sub20_3333).position = -1;
	}

	final int method1565() {
		return anIntArray3338.length;
	}

	final long method1566(int i) {
		return aLong3339 + (long) i * (long) anInt3337;
	}

	final boolean method1567() {
		if (((Stream) aClass11_Sub20_3333).buffer == null)
			return false;
		return true;
	}

	private final int method1568(int i) {
		int i_18_ = (((Stream) aClass11_Sub20_3333).buffer[((Stream) aClass11_Sub20_3333).position]);
		if (i_18_ < 0) {
			i_18_ &= 0xff;
			anIntArray3334[i] = i_18_;
			((Stream) aClass11_Sub20_3333).position++;
		} else
			i_18_ = anIntArray3334[i];
		if (i_18_ == 240 || i_18_ == 247) {
			int i_19_ = aClass11_Sub20_3333.method2544((byte) 122);
			if (i_18_ == 247 && i_19_ > 0) {
				int i_20_ = ((((Stream) aClass11_Sub20_3333).buffer[((Stream) aClass11_Sub20_3333).position]) & 0xff);
				if (i_20_ >= 241 && i_20_ <= 243 || i_20_ == 246
						|| i_20_ == 248 || i_20_ >= 250 && i_20_ <= 252
						|| i_20_ == 254) {
					((Stream) aClass11_Sub20_3333).position++;
					anIntArray3334[i] = i_20_;
					return method1555(i, i_20_);
				}
			}
			((Stream) aClass11_Sub20_3333).position += i_19_;
			return 0;
		}
		return method1555(i, i_18_);
	}

	final void method1569(int i) {
		((Stream) aClass11_Sub20_3333).position = anIntArray3338[i];
	}

	public Class247() {
		aClass11_Sub20_3333 = new Stream(null);
	}

	Class247(byte[] is) {
		aClass11_Sub20_3333 = new Stream(null);
		method1560(is);
	}
}
