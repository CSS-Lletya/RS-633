/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class74 {
	private static short[] aShortArray1018;
	boolean aBool1019 = false;
	Class11_Sub29 aClass11_Sub29_1020;
	int anInt1021 = 0;
	private static short[] aShortArray1022;
	private static byte[] aByteArray1023;
	private static short[] aShortArray1024 = new short[500];
	short[] aShortArray1025;
	short[] aShortArray1026;
	short[] aShortArray1027;
	private static short[] aShortArray1028;
	short[] aShortArray1029;
	private static short[] aShortArray1030;
	byte[] aByteArray1031;
	short[] aShortArray1032;
	boolean aBool1033;
	boolean aBool1034;

	public static void method523() {
		aShortArray1028 = null;
		aShortArray1018 = null;
		aShortArray1022 = null;
		aShortArray1030 = null;
		aShortArray1024 = null;
		aByteArray1023 = null;
	}

	Class74(byte[] is, Class11_Sub29 class11_sub29) {
		((Class74) this).aClass11_Sub29_1020 = null;
		((Class74) this).aBool1033 = false;
		((Class74) this).aBool1034 = false;
		((Class74) this).aClass11_Sub29_1020 = class11_sub29;
		try {
			Stream stream = new Stream(is);
			Stream stream_0_ = new Stream(is);
			stream.readUnsignedByte((byte) 35);
			((Stream) stream).position += 2;
			int i = stream.readUnsignedByte((byte) 35);
			int i_1_ = 0;
			int i_2_ = -1;
			int i_3_ = -1;
			((Stream) stream_0_).position = ((Stream) stream).position + i;
			for (int i_4_ = 0; i_4_ < i; i_4_++) {
				int i_5_ = (((Class11_Sub29) ((Class74) this).aClass11_Sub29_1020).anIntArray6592[i_4_]);
				if (i_5_ == 0)
					i_2_ = i_4_;
				int i_6_ = stream.readUnsignedByte((byte) 35);
				if (i_6_ > 0) {
					if (i_5_ == 0)
						i_3_ = i_4_;
					aShortArray1028[i_1_] = (short) i_4_;
					short i_7_ = 0;
					if (i_5_ == 3 || i_5_ == 10)
						i_7_ = (short) 128;
					if ((i_6_ & 0x1) != 0)
						aShortArray1018[i_1_] = (short) stream_0_
								.method2532(-5929);
					else
						aShortArray1018[i_1_] = i_7_;
					if ((i_6_ & 0x2) != 0)
						aShortArray1022[i_1_] = (short) stream_0_
								.method2532(-5929);
					else
						aShortArray1022[i_1_] = i_7_;
					if ((i_6_ & 0x4) != 0)
						aShortArray1030[i_1_] = (short) stream_0_
								.method2532(-5929);
					else
						aShortArray1030[i_1_] = i_7_;
					aByteArray1023[i_1_] = (byte) (i_6_ >>> 3 & 0x3);
					if (i_5_ == 2 || i_5_ == 9) {
						aShortArray1018[i_1_] = (short) (aShortArray1018[i_1_] << 2 & 0x3fff);
						aShortArray1022[i_1_] = (short) (aShortArray1022[i_1_] << 2 & 0x3fff);
						aShortArray1030[i_1_] = (short) (aShortArray1030[i_1_] << 2 & 0x3fff);
					}
					aShortArray1024[i_1_] = (short) -1;
					if (i_5_ == 1 || i_5_ == 2 || i_5_ == 3) {
						if (i_2_ > i_3_) {
							aShortArray1024[i_1_] = (short) i_2_;
							i_3_ = i_2_;
						}
					} else if (i_5_ == 5)
						((Class74) this).aBool1019 = true;
					else if (i_5_ == 7)
						((Class74) this).aBool1033 = true;
					else if (i_5_ == 9 || i_5_ == 10 || i_5_ == 8)
						((Class74) this).aBool1034 = true;
					i_1_++;
				}
			}
			if (((Stream) stream_0_).position != is.length)
				throw new RuntimeException();
			((Class74) this).anInt1021 = i_1_;
			((Class74) this).aShortArray1026 = new short[i_1_];
			((Class74) this).aShortArray1027 = new short[i_1_];
			((Class74) this).aShortArray1025 = new short[i_1_];
			((Class74) this).aShortArray1029 = new short[i_1_];
			((Class74) this).aShortArray1032 = new short[i_1_];
			((Class74) this).aByteArray1031 = new byte[i_1_];
			for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
				((Class74) this).aShortArray1026[i_8_] = aShortArray1028[i_8_];
				((Class74) this).aShortArray1027[i_8_] = aShortArray1018[i_8_];
				((Class74) this).aShortArray1025[i_8_] = aShortArray1022[i_8_];
				((Class74) this).aShortArray1029[i_8_] = aShortArray1030[i_8_];
				((Class74) this).aShortArray1032[i_8_] = aShortArray1024[i_8_];
				((Class74) this).aByteArray1031[i_8_] = aByteArray1023[i_8_];
			}
		} catch (Exception exception) {
			((Class74) this).anInt1021 = 0;
			((Class74) this).aBool1019 = false;
			((Class74) this).aBool1033 = false;
		}
	}

	static {
		aShortArray1022 = new short[500];
		aShortArray1018 = new short[500];
		aByteArray1023 = new byte[500];
		aShortArray1028 = new short[500];
		aShortArray1030 = new short[500];
	}
}
