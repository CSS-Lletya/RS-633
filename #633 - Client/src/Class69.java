/* Class69 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class69 {
	private int anInt977;
	private int anInt978;
	private Class317[] aClass317Array979;

	final Class11_Sub14_Sub1 method504() {
		byte[] is = method505();
		return new Class11_Sub14_Sub1(22050, is, 22050 * anInt978 / 1000,
				22050 * anInt977 / 1000);
	}

	private final byte[] method505() {
		int i = 0;
		for (int i_0_ = 0; i_0_ < 10; i_0_++) {
			if (aClass317Array979[i_0_] != null
					&& (((Class317) aClass317Array979[i_0_]).anInt4193 + ((Class317) aClass317Array979[i_0_]).anInt4195) > i)
				i = (((Class317) aClass317Array979[i_0_]).anInt4193 + ((Class317) aClass317Array979[i_0_]).anInt4195);
		}
		if (i == 0)
			return new byte[0];
		int i_1_ = 22050 * i / 1000;
		byte[] is = new byte[i_1_];
		for (int i_2_ = 0; i_2_ < 10; i_2_++) {
			if (aClass317Array979[i_2_] != null) {
				int i_3_ = (((Class317) aClass317Array979[i_2_]).anInt4193 * 22050 / 1000);
				int i_4_ = (((Class317) aClass317Array979[i_2_]).anInt4195 * 22050 / 1000);
				int[] is_5_ = (aClass317Array979[i_2_].method1925(i_3_,
						((Class317) aClass317Array979[i_2_]).anInt4193));
				for (int i_6_ = 0; i_6_ < i_3_; i_6_++) {
					int i_7_ = is[i_6_ + i_4_] + (is_5_[i_6_] >> 8);
					if ((i_7_ + 128 & ~0xff) != 0)
						i_7_ = i_7_ >> 31 ^ 0x7f;
					is[i_6_ + i_4_] = (byte) i_7_;
				}
			}
		}
		return is;
	}

	static final Class69 method506(Class146 class146, int i, int i_8_) {
		byte[] is = class146.method930(i_8_, (byte) 112, i);
		if (is == null)
			return null;
		return new Class69(new Stream(is));
	}

	final int method507() {
		int i = 9999999;
		for (int i_9_ = 0; i_9_ < 10; i_9_++) {
			if (aClass317Array979[i_9_] != null
					&& ((Class317) aClass317Array979[i_9_]).anInt4195 / 20 < i)
				i = ((Class317) aClass317Array979[i_9_]).anInt4195 / 20;
		}
		if (anInt978 < anInt977 && anInt978 / 20 < i)
			i = anInt978 / 20;
		if (i == 9999999 || i == 0)
			return 0;
		for (int i_10_ = 0; i_10_ < 10; i_10_++) {
			if (aClass317Array979[i_10_] != null)
				((Class317) aClass317Array979[i_10_]).anInt4195 -= i * 20;
		}
		if (anInt978 < anInt977) {
			anInt978 -= i * 20;
			anInt977 -= i * 20;
		}
		return i;
	}

	private Class69(Stream stream) {
		aClass317Array979 = new Class317[10];
		for (int i = 0; i < 10; i++) {
			int i_11_ = stream.readUnsignedByte((byte) 35);
			if (i_11_ != 0) {
				((Stream) stream).position--;
				aClass317Array979[i] = new Class317();
				aClass317Array979[i].method1927(stream);
			}
		}
		anInt978 = stream.readUnsignedShort((byte) -65);
		anInt977 = stream.readUnsignedShort((byte) -65);
	}

	private Class69() {
		aClass317Array979 = new Class317[10];
	}
}
