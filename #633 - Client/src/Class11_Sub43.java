/* Class11_Sub43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub43 extends Class11 {
	byte[] aByteArray7326;
	static Class84 aClass84_7327 = new Class84();
	static int anInt7328;
	byte[] aByteArray7329;
	byte[] aByteArray7330;
	Class344[] aClass344Array7331;
	Class11_Sub14_Sub1[] aClass11_Sub14_Sub1Array7332;
	static int anInt7333;
	int anInt7334;
	short[] aShortArray7335;
	static int anInt7336;
	static int anInt7337 = 0;
	static IncomingPacket aClass160_7338 = new IncomingPacket(98, -1);
	static byte aByte7339;
	private int[] anIntArray7340;

	final boolean method2965(Class365 class365, int[] is, byte[] is_0_, int i) {
		try {
			anInt7336++;
			boolean bool = true;
			int i_1_ = 0;
			Class11_Sub14_Sub1 class11_sub14_sub1 = null;
			int i_2_ = 0;
			if (i != -1881228126)
				return true;
			for (/**/; (i_2_ ^ 0xffffffff) > -129; i_2_++) {
				if (is_0_ == null || (is_0_[i_2_] ^ 0xffffffff) != -1) {
					int i_3_ = anIntArray7340[i_2_];
					if ((i_3_ ^ 0xffffffff) != -1) {
						if (i_1_ != i_3_) {
							i_1_ = i_3_;
							if ((--i_3_ & 0x1 ^ 0xffffffff) == -1)
								class11_sub14_sub1 = class365.method2165(
										i_3_ >> 2, -2, is);
							else
								class11_sub14_sub1 = class365.method2161(is,
										i_3_ >> 2, -3177);
							if (class11_sub14_sub1 == null)
								bool = false;
						}
						if (class11_sub14_sub1 != null) {
							((Class11_Sub43) this).aClass11_Sub14_Sub1Array7332[i_2_] = class11_sub14_sub1;
							anIntArray7340[i_2_] = 0;
						}
					}
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sq.A("
					+ (class365 != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ','
					+ (is_0_ != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public static void method2966(int i) {
		try {
			if (i == -2) {
				aClass84_7327 = null;
				aClass160_7338 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sq.C(" + i + ')');
		}
	}

	static final boolean method2967(int i, int i_4_) {
		try {
			if (i_4_ < 106)
				return true;
			anInt7333++;
			if ((i ^ 0xffffffff) > -13 || (i ^ 0xffffffff) < -18)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sq.D(" + i + ','
					+ i_4_ + ')');
		}
	}

	final void method2968(int i) {
		try {
			anIntArray7340 = null;
			if (i == 2)
				anInt7328++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sq.B(" + i + ')');
		}
	}

	public Class11_Sub43() {
		/* empty */
	}

	Class11_Sub43(byte[] is) {
		try {
			((Class11_Sub43) this).aByteArray7326 = new byte[128];
			((Class11_Sub43) this).aClass344Array7331 = new Class344[128];
			((Class11_Sub43) this).aByteArray7329 = new byte[128];
			anIntArray7340 = new int[128];
			((Class11_Sub43) this).aShortArray7335 = new short[128];
			((Class11_Sub43) this).aByteArray7330 = new byte[128];
			((Class11_Sub43) this).aClass11_Sub14_Sub1Array7332 = new Class11_Sub14_Sub1[128];
			Stream stream = new Stream(is);
			int i;
			for (i = 0; ((((Stream) stream).buffer[((Stream) stream).position
					+ i]) != 0); i++) {
				/* empty */
			}
			byte[] is_5_ = new byte[i];
			for (int i_6_ = 0; i_6_ < i; i_6_++)
				is_5_[i_6_] = stream.readByte(1854307120);
			((Stream) stream).position++;
			i++;
			int i_7_ = ((Stream) stream).position;
			((Stream) stream).position += i;
			int i_8_;
			for (i_8_ = 0; (((((Stream) stream).buffer[i_8_
					+ ((Stream) stream).position]) ^ 0xffffffff) != -1); i_8_++) {
				/* empty */
			}
			byte[] is_9_ = new byte[i_8_];
			for (int i_10_ = 0; i_8_ > i_10_; i_10_++)
				is_9_[i_10_] = stream.readByte(1854307120);
			((Stream) stream).position++;
			i_8_++;
			int i_11_ = ((Stream) stream).position;
			((Stream) stream).position += i_8_;
			int i_12_;
			for (i_12_ = 0; (((((Stream) stream).buffer[((Stream) stream).position
					- -i_12_]) ^ 0xffffffff) != -1); i_12_++) {
				/* empty */
			}
			byte[] is_13_ = new byte[i_12_];
			for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff); i_14_++)
				is_13_[i_14_] = stream.readByte(1854307120);
			i_12_++;
			((Stream) stream).position++;
			byte[] is_15_ = new byte[i_12_];
			int i_16_;
			if ((i_12_ ^ 0xffffffff) >= -2)
				i_16_ = i_12_;
			else {
				is_15_[1] = (byte) 1;
				i_16_ = 2;
				int i_17_ = 1;
				for (int i_18_ = 2; (i_12_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff); i_18_++) {
					int i_19_ = stream.readUnsignedByte((byte) 35);
					if (i_19_ == 0)
						i_17_ = i_16_++;
					else {
						if ((i_19_ ^ 0xffffffff) >= (i_17_ ^ 0xffffffff))
							i_19_--;
						i_17_ = i_19_;
					}
					is_15_[i_18_] = (byte) i_17_;
				}
			}
			Class344[] class344s = new Class344[i_16_];
			for (int i_20_ = 0; i_20_ < class344s.length; i_20_++) {
				Class344 class344 = class344s[i_20_] = new Class344();
				int i_21_ = stream.readUnsignedByte((byte) 35);
				if ((i_21_ ^ 0xffffffff) < -1)
					((Class344) class344).aByteArray4563 = new byte[2 * i_21_];
				i_21_ = stream.readUnsignedByte((byte) 35);
				if (i_21_ > 0) {
					((Class344) class344).aByteArray4571 = new byte[2 + i_21_ * 2];
					((Class344) class344).aByteArray4571[1] = (byte) 64;
				}
			}
			int i_22_ = stream.readUnsignedByte((byte) 35);
			byte[] is_23_ = (i_22_ ^ 0xffffffff) < -1 ? new byte[i_22_ * 2]
					: null;
			i_22_ = stream.readUnsignedByte((byte) 35);
			byte[] is_24_ = (i_22_ ^ 0xffffffff) < -1 ? new byte[i_22_ * 2]
					: null;
			int i_25_;
			for (i_25_ = 0; ((((Stream) stream).buffer[i_25_
					+ ((Stream) stream).position]) != 0); i_25_++) {
				/* empty */
			}
			byte[] is_26_ = new byte[i_25_];
			for (int i_27_ = 0; i_25_ > i_27_; i_27_++)
				is_26_[i_27_] = stream.readByte(1854307120);
			i_25_++;
			((Stream) stream).position++;
			int i_28_ = 0;
			for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > -129; i_29_++) {
				i_28_ += stream.readUnsignedByte((byte) 35);
				((Class11_Sub43) this).aShortArray7335[i_29_] = (short) i_28_;
			}
			i_28_ = 0;
			for (int i_30_ = 0; i_30_ < 128; i_30_++) {
				i_28_ += stream.readUnsignedByte((byte) 35);
				((Class11_Sub43) this).aShortArray7335[i_30_] += i_28_ << 8;
			}
			int i_31_ = 0;
			int i_32_ = 0;
			int i_33_ = 0;
			for (int i_34_ = 0; i_34_ < 128; i_34_++) {
				if (i_31_ == 0) {
					if (is_26_.length > i_32_)
						i_31_ = is_26_[i_32_++];
					else
						i_31_ = -1;
					i_33_ = stream.method2544((byte) 122);
				}
				((Class11_Sub43) this).aShortArray7335[i_34_] += Class77
						.method529(i_33_ - 1, 2) << 14;
				i_31_--;
				anIntArray7340[i_34_] = i_33_;
			}
			i_32_ = 0;
			i_31_ = 0;
			int i_35_ = 0;
			for (int i_36_ = 0; (i_36_ ^ 0xffffffff) > -129; i_36_++) {
				if (anIntArray7340[i_36_] != 0) {
					if ((i_31_ ^ 0xffffffff) == -1) {
						if ((i_32_ ^ 0xffffffff) <= (is_5_.length ^ 0xffffffff))
							i_31_ = -1;
						else
							i_31_ = is_5_[i_32_++];
						i_35_ = ((Stream) stream).buffer[i_7_++] - 1;
					}
					((Class11_Sub43) this).aByteArray7326[i_36_] = (byte) i_35_;
					i_31_--;
				}
			}
			i_32_ = 0;
			i_31_ = 0;
			int i_37_ = 0;
			for (int i_38_ = 0; i_38_ < 128; i_38_++) {
				if ((anIntArray7340[i_38_] ^ 0xffffffff) != -1) {
					if ((i_31_ ^ 0xffffffff) == -1) {
						if (i_32_ < is_9_.length)
							i_31_ = is_9_[i_32_++];
						else
							i_31_ = -1;
						i_37_ = (((Stream) stream).buffer[i_11_++] + 16 << 2);
					}
					i_31_--;
					((Class11_Sub43) this).aByteArray7330[i_38_] = (byte) i_37_;
				}
			}
			i_32_ = 0;
			i_31_ = 0;
			Class344 class344 = null;
			for (int i_39_ = 0; i_39_ < 128; i_39_++) {
				if (anIntArray7340[i_39_] != 0) {
					if (i_31_ == 0) {
						class344 = class344s[is_15_[i_32_]];
						if ((i_32_ ^ 0xffffffff) > (is_13_.length ^ 0xffffffff))
							i_31_ = is_13_[i_32_++];
						else
							i_31_ = -1;
					}
					((Class11_Sub43) this).aClass344Array7331[i_39_] = class344;
					i_31_--;
				}
			}
			i_31_ = 0;
			i_32_ = 0;
			int i_40_ = 0;
			for (int i_41_ = 0; i_41_ < 128; i_41_++) {
				if ((i_31_ ^ 0xffffffff) == -1) {
					if ((is_26_.length ^ 0xffffffff) >= (i_32_ ^ 0xffffffff))
						i_31_ = -1;
					else
						i_31_ = is_26_[i_32_++];
					if (anIntArray7340[i_41_] > 0)
						i_40_ = stream.readUnsignedByte((byte) 35) + 1;
				}
				i_31_--;
				((Class11_Sub43) this).aByteArray7329[i_41_] = (byte) i_40_;
			}
			((Class11_Sub43) this).anInt7334 = stream
					.readUnsignedByte((byte) 35) + 1;
			for (int i_42_ = 0; i_16_ > i_42_; i_42_++) {
				Class344 class344_43_ = class344s[i_42_];
				if (((Class344) class344_43_).aByteArray4563 != null) {
					for (int i_44_ = 1; ((i_44_ ^ 0xffffffff) > (((Class344) class344_43_).aByteArray4563.length ^ 0xffffffff)); i_44_ += 2)
						((Class344) class344_43_).aByteArray4563[i_44_] = stream
								.readByte(1854307120);
				}
				if (((Class344) class344_43_).aByteArray4571 != null) {
					for (int i_45_ = 3; ((((Class344) class344_43_).aByteArray4571.length - 2 ^ 0xffffffff) < (i_45_ ^ 0xffffffff)); i_45_ += 2)
						((Class344) class344_43_).aByteArray4571[i_45_] = stream
								.readByte(1854307120);
				}
			}
			if (is_23_ != null) {
				for (int i_46_ = 1; is_23_.length > i_46_; i_46_ += 2)
					is_23_[i_46_] = stream.readByte(1854307120);
			}
			if (is_24_ != null) {
				for (int i_47_ = 1; (i_47_ ^ 0xffffffff) > (is_24_.length ^ 0xffffffff); i_47_ += 2)
					is_24_[i_47_] = stream.readByte(1854307120);
			}
			for (int i_48_ = 0; i_16_ > i_48_; i_48_++) {
				Class344 class344_49_ = class344s[i_48_];
				if (((Class344) class344_49_).aByteArray4571 != null) {
					i_28_ = 0;
					for (int i_50_ = 2; ((i_50_ ^ 0xffffffff) > (((Class344) class344_49_).aByteArray4571.length ^ 0xffffffff)); i_50_ += 2) {
						i_28_ = i_28_ + 1 - -stream.readUnsignedByte((byte) 35);
						((Class344) class344_49_).aByteArray4571[i_50_] = (byte) i_28_;
					}
				}
			}
			for (int i_51_ = 0; i_51_ < i_16_; i_51_++) {
				Class344 class344_52_ = class344s[i_51_];
				if (((Class344) class344_52_).aByteArray4563 != null) {
					i_28_ = 0;
					for (int i_53_ = 2; (((Class344) class344_52_).aByteArray4563.length > i_53_); i_53_ += 2) {
						i_28_ -= -1 - stream.readUnsignedByte((byte) 35);
						((Class344) class344_52_).aByteArray4563[i_53_] = (byte) i_28_;
					}
				}
			}
			if (is_23_ != null) {
				i_28_ = stream.readUnsignedByte((byte) 35);
				is_23_[0] = (byte) i_28_;
				for (int i_54_ = 2; (i_54_ ^ 0xffffffff) > (is_23_.length ^ 0xffffffff); i_54_ += 2) {
					i_28_ = stream.readUnsignedByte((byte) 35) + i_28_ + 1;
					is_23_[i_54_] = (byte) i_28_;
				}
				int i_55_ = is_23_[0];
				int i_56_ = is_23_[1];
				for (int i_57_ = 0; i_55_ > i_57_; i_57_++)
					((Class11_Sub43) this).aByteArray7329[i_57_] = (byte) ((((Class11_Sub43) this).aByteArray7329[i_57_] * i_56_) + 32 >> 6);
				int i_58_ = 2;
				while ((is_23_.length ^ 0xffffffff) < (i_58_ ^ 0xffffffff)) {
					int i_59_ = is_23_[i_58_];
					int i_60_ = is_23_[1 + i_58_];
					int i_61_ = (-i_55_ + i_59_) * i_56_ + (-i_55_ + i_59_) / 2;
					for (int i_62_ = i_55_; i_62_ < i_59_; i_62_++) {
						int i_63_ = Class11_Sub2_Sub15.method3546(-2070226657,
								-i_55_ + i_59_, i_61_);
						((Class11_Sub43) this).aByteArray7329[i_62_] = (byte) (32
								+ (((Class11_Sub43) this).aByteArray7329[i_62_])
								* i_63_ >> 6);
						i_61_ += -i_56_ + i_60_;
					}
					i_55_ = i_59_;
					i_58_ += 2;
					i_56_ = i_60_;
				}
				for (int i_64_ = i_55_; (i_64_ ^ 0xffffffff) > -129; i_64_++)
					((Class11_Sub43) this).aByteArray7329[i_64_] = (byte) (i_56_
							* (((Class11_Sub43) this).aByteArray7329[i_64_])
							+ 32 >> 6);
				Object object = null;
			}
			if (is_24_ != null) {
				i_28_ = stream.readUnsignedByte((byte) 35);
				is_24_[0] = (byte) i_28_;
				for (int i_65_ = 2; i_65_ < is_24_.length; i_65_ += 2) {
					i_28_ = stream.readUnsignedByte((byte) 35) + i_28_ + 1;
					is_24_[i_65_] = (byte) i_28_;
				}
				int i_66_ = is_24_[0];
				int i_67_ = is_24_[1] << 1;
				for (int i_68_ = 0; i_68_ < i_66_; i_68_++) {
					int i_69_ = ((((Class11_Sub43) this).aByteArray7330[i_68_] & 0xff) + i_67_);
					if ((i_69_ ^ 0xffffffff) > -1)
						i_69_ = 0;
					if (i_69_ > 128)
						i_69_ = 128;
					((Class11_Sub43) this).aByteArray7330[i_68_] = (byte) i_69_;
				}
				for (int i_70_ = 2; (is_24_.length ^ 0xffffffff) < (i_70_ ^ 0xffffffff); i_70_ += 2) {
					int i_71_ = is_24_[i_70_];
					int i_72_ = is_24_[i_70_ + 1] << 1;
					int i_73_ = (-i_66_ + i_71_) / 2 + (-i_66_ + i_71_) * i_67_;
					for (int i_74_ = i_66_; (i_74_ ^ 0xffffffff) > (i_71_ ^ 0xffffffff); i_74_++) {
						int i_75_ = Class11_Sub2_Sub15.method3546(-2070226657,
								-i_66_ + i_71_, i_73_);
						int i_76_ = (i_75_ + (((Class11_Sub43) this).aByteArray7330[i_74_] & 0xff));
						if ((i_76_ ^ 0xffffffff) > -1)
							i_76_ = 0;
						if (i_76_ > 128)
							i_76_ = 128;
						i_73_ += -i_67_ + i_72_;
						((Class11_Sub43) this).aByteArray7330[i_74_] = (byte) i_76_;
					}
					i_66_ = i_71_;
					i_67_ = i_72_;
				}
				Object object = null;
				for (int i_77_ = i_66_; (i_77_ ^ 0xffffffff) > -129; i_77_++) {
					int i_78_ = ((((Class11_Sub43) this).aByteArray7330[i_77_] & 0xff) + i_67_);
					if ((i_78_ ^ 0xffffffff) > -1)
						i_78_ = 0;
					if (i_78_ > 128)
						i_78_ = 128;
					((Class11_Sub43) this).aByteArray7330[i_77_] = (byte) i_78_;
				}
			}
			for (int i_79_ = 0; i_16_ > i_79_; i_79_++)
				((Class344) class344s[i_79_]).anInt4572 = stream
						.readUnsignedByte((byte) 35);
			for (int i_80_ = 0; i_80_ < i_16_; i_80_++) {
				Class344 class344_81_ = class344s[i_80_];
				if (((Class344) class344_81_).aByteArray4563 != null)
					((Class344) class344_81_).anInt4573 = stream
							.readUnsignedByte((byte) 35);
				if (((Class344) class344_81_).aByteArray4571 != null)
					((Class344) class344_81_).anInt4569 = stream
							.readUnsignedByte((byte) 35);
				if (((Class344) class344_81_).anInt4572 > 0)
					((Class344) class344_81_).anInt4576 = stream
							.readUnsignedByte((byte) 35);
			}
			for (int i_82_ = 0; i_16_ > i_82_; i_82_++)
				((Class344) class344s[i_82_]).anInt4577 = stream
						.readUnsignedByte((byte) 35);
			for (int i_83_ = 0; (i_16_ ^ 0xffffffff) < (i_83_ ^ 0xffffffff); i_83_++) {
				Class344 class344_84_ = class344s[i_83_];
				if (((Class344) class344_84_).anInt4577 > 0)
					((Class344) class344_84_).anInt4574 = stream
							.readUnsignedByte((byte) 35);
			}
			for (int i_85_ = 0; (i_85_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff); i_85_++) {
				Class344 class344_86_ = class344s[i_85_];
				if (((Class344) class344_86_).anInt4574 > 0)
					((Class344) class344_86_).anInt4561 = stream
							.readUnsignedByte((byte) 35);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sq.<init>("
					+ (is != null ? "{...}" : "null") + ')');
		}
		if (Applet_Sub1.aBool10473)
			client.aBool10531 = true;
	}
}
