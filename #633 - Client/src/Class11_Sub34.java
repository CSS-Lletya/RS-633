/* Class11_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub34 extends Class11 {
	Class213 aClass213_6920;
	byte[] aByteArray6921;

	static final Class11_Sub34 method2802(Class146 class146, int i, int i_0_) {
		byte[] is = class146.method930(i_0_, (byte) 112, i);
		if (is == null)
			return null;
		return new Class11_Sub34(new Stream(is));
	}

	final void method2803() {
		((Class11_Sub34) this).aClass213_6920 = null;
	}

	final void method2804() {
		if (((Class11_Sub34) this).aClass213_6920 == null) {
			((Class11_Sub34) this).aClass213_6920 = new Class213(16);
			int[] is = new int[16];
			int[] is_1_ = new int[16];
			is[9] = is_1_[9] = 128;
			Class247 class247 = new Class247(
					((Class11_Sub34) this).aByteArray6921);
			int i = class247.method1565();
			for (int i_2_ = 0; i_2_ < i; i_2_++) {
				class247.method1569(i_2_);
				class247.method1557(i_2_);
				class247.method1559(i_2_);
			}
			while_6_: for (;;) {
				int i_3_ = class247.method1558();
				int i_4_ = ((Class247) class247).anIntArray3336[i_3_];
				while (((Class247) class247).anIntArray3336[i_3_] == i_4_) {
					class247.method1569(i_3_);
					int i_5_ = class247.method1556(i_3_);
					if (i_5_ == 1) {
						class247.method1564();
						class247.method1559(i_3_);
						if (!class247.method1554())
							break;
						break while_6_;
					}
					int i_6_ = i_5_ & 0xf0;
					if (i_6_ == 176) {
						int i_7_ = i_5_ & 0xf;
						int i_8_ = i_5_ >> 8 & 0x7f;
						int i_9_ = i_5_ >> 16 & 0x7f;
						if (i_8_ == 0)
							is[i_7_] = (is[i_7_] & ~0x1fc000) + (i_9_ << 14);
						if (i_8_ == 32)
							is[i_7_] = (is[i_7_] & ~0x3f80) + (i_9_ << 7);
					}
					if (i_6_ == 192) {
						int i_10_ = i_5_ & 0xf;
						int i_11_ = i_5_ >> 8 & 0x7f;
						is_1_[i_10_] = is[i_10_] + i_11_;
					}
					if (i_6_ == 144) {
						int i_12_ = i_5_ & 0xf;
						int i_13_ = i_5_ >> 8 & 0x7f;
						int i_14_ = i_5_ >> 16 & 0x7f;
						if (i_14_ > 0) {
							int i_15_ = is_1_[i_12_];
							Class11_Sub47 class11_sub47 = ((Class11_Sub47) ((Class11_Sub34) this).aClass213_6920
									.method1369((byte) 26, (long) i_15_));
							if (class11_sub47 == null) {
								class11_sub47 = new Class11_Sub47(new byte[128]);
								((Class11_Sub34) this).aClass213_6920
										.method1368((long) i_15_,
												class11_sub47, (byte) -26);
							}
							((Class11_Sub47) class11_sub47).aByteArray7986[i_13_] = (byte) 1;
						}
					}
					class247.method1557(i_3_);
					class247.method1559(i_3_);
				}
			}
		}
	}

	private Class11_Sub34(Stream stream) {
		((Stream) stream).position = ((Stream) stream).buffer.length - 3;
		int i = stream.readUnsignedByte((byte) 35);
		int i_16_ = stream.readUnsignedShort((byte) -65);
		int i_17_ = 14 + i * 10;
		((Stream) stream).position = 0;
		int i_18_ = 0;
		int i_19_ = 0;
		int i_20_ = 0;
		int i_21_ = 0;
		int i_22_ = 0;
		int i_23_ = 0;
		int i_24_ = 0;
		int i_25_ = 0;
		while_4_: for (int i_26_ = 0; i_26_ < i; i_26_++) {
			int i_27_ = -1;
			for (;;) {
				int i_28_ = stream.readUnsignedByte((byte) 35);
				if (i_28_ != i_27_)
					i_17_++;
				i_27_ = i_28_ & 0xf;
				if (i_28_ == 7)
					continue while_4_;
				if (i_28_ == 23)
					i_18_++;
				else if (i_27_ == 0)
					i_20_++;
				else if (i_27_ == 1)
					i_21_++;
				else if (i_27_ == 2)
					i_19_++;
				else if (i_27_ == 3)
					i_22_++;
				else if (i_27_ == 4)
					i_23_++;
				else if (i_27_ == 5)
					i_24_++;
				else {
					if (i_27_ != 6)
						break;
					i_25_++;
				}
			}
			throw new RuntimeException();
		}
		i_17_ += 5 * i_18_;
		i_17_ += 2 * (i_20_ + i_21_ + i_19_ + i_22_ + i_24_);
		i_17_ += i_23_ + i_25_;
		int i_29_ = ((Stream) stream).position;
		int i_30_ = (i + i_18_ + i_19_ + i_20_ + i_21_ + i_22_ + i_23_ + i_24_ + i_25_);
		for (int i_31_ = 0; i_31_ < i_30_; i_31_++)
			stream.method2544((byte) 122);
		i_17_ += ((Stream) stream).position - i_29_;
		int i_32_ = ((Stream) stream).position;
		int i_33_ = 0;
		int i_34_ = 0;
		int i_35_ = 0;
		int i_36_ = 0;
		int i_37_ = 0;
		int i_38_ = 0;
		int i_39_ = 0;
		int i_40_ = 0;
		int i_41_ = 0;
		int i_42_ = 0;
		int i_43_ = 0;
		int i_44_ = 0;
		int i_45_ = 0;
		for (int i_46_ = 0; i_46_ < i_19_; i_46_++) {
			i_45_ = i_45_ + stream.readUnsignedByte((byte) 35) & 0x7f;
			if (i_45_ == 0 || i_45_ == 32)
				i_25_++;
			else if (i_45_ == 1)
				i_33_++;
			else if (i_45_ == 33)
				i_34_++;
			else if (i_45_ == 7)
				i_35_++;
			else if (i_45_ == 39)
				i_36_++;
			else if (i_45_ == 10)
				i_37_++;
			else if (i_45_ == 42)
				i_38_++;
			else if (i_45_ == 99)
				i_39_++;
			else if (i_45_ == 98)
				i_40_++;
			else if (i_45_ == 101)
				i_41_++;
			else if (i_45_ == 100)
				i_42_++;
			else if (i_45_ == 64 || i_45_ == 65 || i_45_ == 120 || i_45_ == 121
					|| i_45_ == 123)
				i_43_++;
			else
				i_44_++;
		}
		int i_47_ = 0;
		int i_48_ = ((Stream) stream).position;
		((Stream) stream).position += i_43_;
		int i_49_ = ((Stream) stream).position;
		((Stream) stream).position += i_24_;
		int i_50_ = ((Stream) stream).position;
		((Stream) stream).position += i_23_;
		int i_51_ = ((Stream) stream).position;
		((Stream) stream).position += i_22_;
		int i_52_ = ((Stream) stream).position;
		((Stream) stream).position += i_33_;
		int i_53_ = ((Stream) stream).position;
		((Stream) stream).position += i_35_;
		int i_54_ = ((Stream) stream).position;
		((Stream) stream).position += i_37_;
		int i_55_ = ((Stream) stream).position;
		((Stream) stream).position += i_20_ + i_21_ + i_24_;
		int i_56_ = ((Stream) stream).position;
		((Stream) stream).position += i_20_;
		int i_57_ = ((Stream) stream).position;
		((Stream) stream).position += i_44_;
		int i_58_ = ((Stream) stream).position;
		((Stream) stream).position += i_21_;
		int i_59_ = ((Stream) stream).position;
		((Stream) stream).position += i_34_;
		int i_60_ = ((Stream) stream).position;
		((Stream) stream).position += i_36_;
		int i_61_ = ((Stream) stream).position;
		((Stream) stream).position += i_38_;
		int i_62_ = ((Stream) stream).position;
		((Stream) stream).position += i_25_;
		int i_63_ = ((Stream) stream).position;
		((Stream) stream).position += i_22_;
		int i_64_ = ((Stream) stream).position;
		((Stream) stream).position += i_39_;
		int i_65_ = ((Stream) stream).position;
		((Stream) stream).position += i_40_;
		int i_66_ = ((Stream) stream).position;
		((Stream) stream).position += i_41_;
		int i_67_ = ((Stream) stream).position;
		((Stream) stream).position += i_42_;
		int i_68_ = ((Stream) stream).position;
		((Stream) stream).position += i_18_ * 3;
		((Class11_Sub34) this).aByteArray6921 = new byte[i_17_];
		Stream stream_69_ = new Stream(((Class11_Sub34) this).aByteArray6921);
		stream_69_.writeInt(-49, 1297377380);
		stream_69_.writeInt(-49, 6);
		stream_69_.writeShort(-128, i > 1 ? 1 : 0);
		stream_69_.writeShort(-110, i);
		stream_69_.writeShort(-121, i_16_);
		((Stream) stream).position = i_29_;
		int i_70_ = 0;
		int i_71_ = 0;
		int i_72_ = 0;
		int i_73_ = 0;
		int i_74_ = 0;
		int i_75_ = 0;
		int i_76_ = 0;
		int[] is = new int[128];
		i_45_ = 0;
		for (int i_77_ = 0; i_77_ < i; i_77_++) {
			stream_69_.writeInt(-49, 1297379947);
			((Stream) stream_69_).position += 4;
			int i_78_ = ((Stream) stream_69_).position;
			int i_79_ = -1;
			while_5_: do {
				for (;;) {
					int i_80_ = stream.method2544((byte) 122);
					stream_69_.method2513((byte) 16, i_80_);
					int i_81_ = ((Stream) stream).buffer[i_47_++] & 0xff;
					boolean bool = i_81_ != i_79_;
					i_79_ = i_81_ & 0xf;
					if (i_81_ == 7) {
						if (bool)
							stream_69_.writeByte(255, -1528071456);
						stream_69_.writeByte(47, -1528071456);
						stream_69_.writeByte(0, -1528071456);
						break while_5_;
					}
					if (i_81_ == 23) {
						if (bool)
							stream_69_.writeByte(255, -1528071456);
						stream_69_.writeByte(81, -1528071456);
						stream_69_.writeByte(3, -1528071456);
						stream_69_.writeByte(
								(((Stream) stream).buffer[i_68_++]),
								-1528071456);
						stream_69_.writeByte(
								(((Stream) stream).buffer[i_68_++]),
								-1528071456);
						stream_69_.writeByte(
								(((Stream) stream).buffer[i_68_++]),
								-1528071456);
					} else {
						i_70_ ^= i_81_ >> 4;
						if (i_79_ == 0) {
							if (bool)
								stream_69_.writeByte(144 + i_70_, -1528071456);
							i_71_ += ((Stream) stream).buffer[i_55_++];
							i_72_ += ((Stream) stream).buffer[i_56_++];
							stream_69_.writeByte(i_71_ & 0x7f, -1528071456);
							stream_69_.writeByte(i_72_ & 0x7f, -1528071456);
						} else if (i_79_ == 1) {
							if (bool)
								stream_69_.writeByte(128 + i_70_, -1528071456);
							i_71_ += ((Stream) stream).buffer[i_55_++];
							i_73_ += ((Stream) stream).buffer[i_58_++];
							stream_69_.writeByte(i_71_ & 0x7f, -1528071456);
							stream_69_.writeByte(i_73_ & 0x7f, -1528071456);
						} else if (i_79_ == 2) {
							if (bool)
								stream_69_.writeByte(176 + i_70_, -1528071456);
							i_45_ = i_45_ + (((Stream) stream).buffer[i_32_++])
									& 0x7f;
							stream_69_.writeByte(i_45_, -1528071456);
							int i_82_;
							if (i_45_ == 0 || i_45_ == 32)
								i_82_ = (((Stream) stream).buffer[i_62_++]);
							else if (i_45_ == 1)
								i_82_ = (((Stream) stream).buffer[i_52_++]);
							else if (i_45_ == 33)
								i_82_ = (((Stream) stream).buffer[i_59_++]);
							else if (i_45_ == 7)
								i_82_ = (((Stream) stream).buffer[i_53_++]);
							else if (i_45_ == 39)
								i_82_ = (((Stream) stream).buffer[i_60_++]);
							else if (i_45_ == 10)
								i_82_ = (((Stream) stream).buffer[i_54_++]);
							else if (i_45_ == 42)
								i_82_ = (((Stream) stream).buffer[i_61_++]);
							else if (i_45_ == 99)
								i_82_ = (((Stream) stream).buffer[i_64_++]);
							else if (i_45_ == 98)
								i_82_ = (((Stream) stream).buffer[i_65_++]);
							else if (i_45_ == 101)
								i_82_ = (((Stream) stream).buffer[i_66_++]);
							else if (i_45_ == 100)
								i_82_ = (((Stream) stream).buffer[i_67_++]);
							else if (i_45_ == 64 || i_45_ == 65 || i_45_ == 120
									|| i_45_ == 121 || i_45_ == 123)
								i_82_ = (((Stream) stream).buffer[i_48_++]);
							else
								i_82_ = (((Stream) stream).buffer[i_57_++]);
							i_82_ += is[i_45_];
							is[i_45_] = i_82_;
							stream_69_.writeByte(i_82_ & 0x7f, -1528071456);
						} else if (i_79_ == 3) {
							if (bool)
								stream_69_.writeByte(224 + i_70_, -1528071456);
							i_74_ += ((Stream) stream).buffer[i_63_++];
							i_74_ += (((Stream) stream).buffer[i_51_++] << 7);
							stream_69_.writeByte(i_74_ & 0x7f, -1528071456);
							stream_69_
									.writeByte(i_74_ >> 7 & 0x7f, -1528071456);
						} else if (i_79_ == 4) {
							if (bool)
								stream_69_.writeByte(208 + i_70_, -1528071456);
							i_75_ += ((Stream) stream).buffer[i_50_++];
							stream_69_.writeByte(i_75_ & 0x7f, -1528071456);
						} else if (i_79_ == 5) {
							if (bool)
								stream_69_.writeByte(160 + i_70_, -1528071456);
							i_71_ += ((Stream) stream).buffer[i_55_++];
							i_76_ += ((Stream) stream).buffer[i_49_++];
							stream_69_.writeByte(i_71_ & 0x7f, -1528071456);
							stream_69_.writeByte(i_76_ & 0x7f, -1528071456);
						} else {
							if (i_79_ != 6)
								break;
							if (bool)
								stream_69_.writeByte(192 + i_70_, -1528071456);
							stream_69_.writeByte(
									(((Stream) stream).buffer[i_62_++]),
									-1528071456);
						}
					}
				}
				throw new RuntimeException();
			} while (false);
			stream_69_.method2522((byte) 100, ((Stream) stream_69_).position
					- i_78_);
		}
	}
}
