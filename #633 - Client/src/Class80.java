/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class80 {
	int[] anIntArray1074;
	int anInt1075;
	int anInt1076;
	int anInt1077;
	byte[] aByteArray1078;
	byte[] aByteArray1079;
	int anInt1080;
	int anInt1081;
	int anInt1082;

	static final Class80[] method543(Class146 class146, int i, int i_0_) {
		byte[] is = class146.method930(i_0_, (byte) 112, i);
		if (is == null)
			return null;
		return method551(is);
	}

	static final Class80[] method544(Class146 class146, int i) {
		byte[] is = class146.method938(i, 0);
		if (is == null)
			return null;
		return method551(is);
	}

	static final Class80 method545(Class146 class146, int i, int i_1_) {
		byte[] is = class146.method930(i_1_, (byte) 112, i);
		if (is == null)
			return null;
		return method551(is)[0];
	}

	final void method546() {
		byte[] is = (new byte[((Class80) this).anInt1075
				* ((Class80) this).anInt1082]);
		int i = 0;
		if (((Class80) this).aByteArray1078 == null) {
			for (int i_2_ = 0; i_2_ < ((Class80) this).anInt1075; i_2_++) {
				for (int i_3_ = ((Class80) this).anInt1082 - 1; i_3_ >= 0; i_3_--)
					is[i++] = (((Class80) this).aByteArray1079[i_2_ + i_3_
							* ((Class80) this).anInt1075]);
			}
			((Class80) this).aByteArray1079 = is;
		} else {
			byte[] is_4_ = (new byte[((Class80) this).anInt1075
					* ((Class80) this).anInt1082]);
			for (int i_5_ = 0; i_5_ < ((Class80) this).anInt1075; i_5_++) {
				for (int i_6_ = ((Class80) this).anInt1082 - 1; i_6_ >= 0; i_6_--) {
					is[i] = (((Class80) this).aByteArray1079[i_5_ + i_6_
							* ((Class80) this).anInt1075]);
					is_4_[i++] = (((Class80) this).aByteArray1078[i_5_ + i_6_
							* ((Class80) this).anInt1075]);
				}
			}
			((Class80) this).aByteArray1079 = is;
			((Class80) this).aByteArray1078 = is_4_;
		}
		int i_7_ = ((Class80) this).anInt1077;
		((Class80) this).anInt1077 = ((Class80) this).anInt1080;
		((Class80) this).anInt1080 = ((Class80) this).anInt1081;
		((Class80) this).anInt1081 = ((Class80) this).anInt1076;
		((Class80) this).anInt1076 = ((Class80) this).anInt1077;
		i_7_ = ((Class80) this).anInt1082;
		((Class80) this).anInt1082 = ((Class80) this).anInt1075;
		((Class80) this).anInt1075 = i_7_;
	}

	final void method547() {
		byte[] is = ((Class80) this).aByteArray1079;
		if (((Class80) this).aByteArray1078 == null) {
			for (int i = ((Class80) this).anInt1082 - 1; i >= 0; i--) {
				int i_8_ = i * ((Class80) this).anInt1075;
				for (int i_9_ = (i + 1) * ((Class80) this).anInt1075; i_8_ < i_9_; i_8_++) {
					i_9_--;
					byte i_10_ = is[i_8_];
					is[i_8_] = is[i_9_];
					is[i_9_] = i_10_;
				}
			}
		} else {
			byte[] is_11_ = ((Class80) this).aByteArray1078;
			for (int i = ((Class80) this).anInt1082 - 1; i >= 0; i--) {
				int i_12_ = i * ((Class80) this).anInt1075;
				for (int i_13_ = (i + 1) * ((Class80) this).anInt1075; i_12_ < i_13_; i_12_++) {
					i_13_--;
					byte i_14_ = is[i_12_];
					is[i_12_] = is[i_13_];
					is[i_13_] = i_14_;
					i_14_ = is_11_[i_12_];
					is_11_[i_12_] = is_11_[i_13_];
					is_11_[i_13_] = i_14_;
				}
			}
		}
		int i = ((Class80) this).anInt1080;
		((Class80) this).anInt1080 = ((Class80) this).anInt1076;
		((Class80) this).anInt1076 = i;
	}

	final void method548() {
		byte[] is = ((Class80) this).aByteArray1079;
		if (((Class80) this).aByteArray1078 == null) {
			for (int i = (((Class80) this).anInt1082 >> 1) - 1; i >= 0; i--) {
				int i_15_ = i * ((Class80) this).anInt1075;
				int i_16_ = ((((Class80) this).anInt1082 - i - 1) * ((Class80) this).anInt1075);
				for (int i_17_ = -((Class80) this).anInt1075; i_17_ < 0; i_17_++) {
					byte i_18_ = is[i_15_];
					is[i_15_] = is[i_16_];
					is[i_16_] = i_18_;
					i_15_++;
					i_16_++;
				}
			}
		} else {
			byte[] is_19_ = ((Class80) this).aByteArray1078;
			for (int i = (((Class80) this).anInt1082 >> 1) - 1; i >= 0; i--) {
				int i_20_ = i * ((Class80) this).anInt1075;
				int i_21_ = ((((Class80) this).anInt1082 - i - 1) * ((Class80) this).anInt1075);
				for (int i_22_ = -((Class80) this).anInt1075; i_22_ < 0; i_22_++) {
					byte i_23_ = is[i_20_];
					is[i_20_] = is[i_21_];
					is[i_21_] = i_23_;
					i_23_ = is_19_[i_20_];
					is_19_[i_20_] = is_19_[i_21_];
					is_19_[i_21_] = i_23_;
					i_20_++;
					i_21_++;
				}
			}
		}
		int i = ((Class80) this).anInt1077;
		((Class80) this).anInt1077 = ((Class80) this).anInt1081;
		((Class80) this).anInt1081 = i;
	}

	final int method549() {
		return (((Class80) this).anInt1082 + ((Class80) this).anInt1077 + ((Class80) this).anInt1081);
	}

	final int method550() {
		return (((Class80) this).anInt1075 + ((Class80) this).anInt1080 + ((Class80) this).anInt1076);
	}

	private static final Class80[] method551(byte[] is) {
		Stream stream = new Stream(is);
		((Stream) stream).position = is.length - 2;
		int i = stream.readUnsignedShort((byte) -65);
		Class80[] class80s = new Class80[i];
		for (int i_24_ = 0; i_24_ < i; i_24_++)
			class80s[i_24_] = new Class80();
		((Stream) stream).position = is.length - 7 - i * 8;
		int i_25_ = stream.readUnsignedShort((byte) -65);
		int i_26_ = stream.readUnsignedShort((byte) -65);
		int i_27_ = (stream.readUnsignedByte((byte) 35) & 0xff) + 1;
		for (int i_28_ = 0; i_28_ < i; i_28_++)
			((Class80) class80s[i_28_]).anInt1080 = stream
					.readUnsignedShort((byte) -65);
		for (int i_29_ = 0; i_29_ < i; i_29_++)
			((Class80) class80s[i_29_]).anInt1077 = stream
					.readUnsignedShort((byte) -65);
		for (int i_30_ = 0; i_30_ < i; i_30_++)
			((Class80) class80s[i_30_]).anInt1075 = stream
					.readUnsignedShort((byte) -65);
		for (int i_31_ = 0; i_31_ < i; i_31_++)
			((Class80) class80s[i_31_]).anInt1082 = stream
					.readUnsignedShort((byte) -65);
		for (int i_32_ = 0; i_32_ < i; i_32_++) {
			Class80 class80 = class80s[i_32_];
			((Class80) class80).anInt1076 = (i_25_
					- ((Class80) class80).anInt1075 - ((Class80) class80).anInt1080);
			((Class80) class80).anInt1081 = (i_26_
					- ((Class80) class80).anInt1082 - ((Class80) class80).anInt1077);
		}
		((Stream) stream).position = is.length - 7 - i * 8 - (i_27_ - 1) * 3;
		int[] is_33_ = new int[i_27_];
		for (int i_34_ = 1; i_34_ < i_27_; i_34_++) {
			is_33_[i_34_] = stream.method2558(false);
			if (is_33_[i_34_] == 0)
				is_33_[i_34_] = 1;
		}
		for (int i_35_ = 0; i_35_ < i; i_35_++)
			((Class80) class80s[i_35_]).anIntArray1074 = is_33_;
		((Stream) stream).position = 0;
		for (int i_36_ = 0; i_36_ < i; i_36_++) {
			Class80 class80 = class80s[i_36_];
			int i_37_ = (((Class80) class80).anInt1075 * ((Class80) class80).anInt1082);
			((Class80) class80).aByteArray1079 = new byte[i_37_];
			int i_38_ = stream.readUnsignedByte((byte) 35);
			if ((i_38_ & 0x2) == 0) {
				if ((i_38_ & 0x1) == 0) {
					for (int i_39_ = 0; i_39_ < i_37_; i_39_++)
						((Class80) class80).aByteArray1079[i_39_] = stream
								.readByte(1854307120);
				} else {
					for (int i_40_ = 0; i_40_ < ((Class80) class80).anInt1075; i_40_++) {
						for (int i_41_ = 0; i_41_ < ((Class80) class80).anInt1082; i_41_++)
							((Class80) class80).aByteArray1079[i_40_ + i_41_
									* ((Class80) class80).anInt1075] = stream
									.readByte(1854307120);
					}
				}
			} else {
				boolean bool = false;
				((Class80) class80).aByteArray1078 = new byte[i_37_];
				if ((i_38_ & 0x1) == 0) {
					for (int i_42_ = 0; i_42_ < i_37_; i_42_++)
						((Class80) class80).aByteArray1079[i_42_] = stream
								.readByte(1854307120);
					for (int i_43_ = 0; i_43_ < i_37_; i_43_++) {
						byte i_44_ = (((Class80) class80).aByteArray1078[i_43_] = stream
								.readByte(1854307120));
						bool = bool | i_44_ != -1;
					}
				} else {
					for (int i_45_ = 0; i_45_ < ((Class80) class80).anInt1075; i_45_++) {
						for (int i_46_ = 0; i_46_ < ((Class80) class80).anInt1082; i_46_++)
							((Class80) class80).aByteArray1079[i_45_ + i_46_
									* ((Class80) class80).anInt1075] = stream
									.readByte(1854307120);
					}
					for (int i_47_ = 0; i_47_ < ((Class80) class80).anInt1075; i_47_++) {
						for (int i_48_ = 0; i_48_ < ((Class80) class80).anInt1082; i_48_++) {
							byte i_49_ = (((Class80) class80).aByteArray1078[i_47_
									+ i_48_ * (((Class80) class80).anInt1075)] = stream
									.readByte(1854307120));
							bool = bool | i_49_ != -1;
						}
					}
				}
				if (!bool)
					((Class80) class80).aByteArray1078 = null;
			}
		}
		return class80s;
	}

	final int[] method552() {
		int i = method550();
		int[] is = new int[i * method549()];
		if (((Class80) this).aByteArray1078 != null) {
			for (int i_50_ = 0; i_50_ < ((Class80) this).anInt1082; i_50_++) {
				int i_51_ = i_50_ * ((Class80) this).anInt1075;
				int i_52_ = (((Class80) this).anInt1080 + (i_50_ + ((Class80) this).anInt1077)
						* i);
				for (int i_53_ = 0; i_53_ < ((Class80) this).anInt1075; i_53_++) {
					is[i_52_++] = (((Class80) this).aByteArray1078[i_51_] << 24 | (((Class80) this).anIntArray1074[(((Class80) this).aByteArray1079[i_51_] & 0xff)]));
					i_51_++;
				}
			}
		} else {
			for (int i_54_ = 0; i_54_ < ((Class80) this).anInt1082; i_54_++) {
				int i_55_ = i_54_ * ((Class80) this).anInt1075;
				int i_56_ = (((Class80) this).anInt1080 + (i_54_ + ((Class80) this).anInt1077)
						* i);
				for (int i_57_ = 0; i_57_ < ((Class80) this).anInt1075; i_57_++) {
					int i_58_ = (((Class80) this).anIntArray1074[((Class80) this).aByteArray1079[i_55_++] & 0xff]);
					if (i_58_ != 0)
						is[i_56_++] = ~0xffffff | i_58_;
					else
						is[i_56_++] = 0;
				}
			}
		}
		return is;
	}

	final void method553(int i) {
		int i_59_ = method550();
		int i_60_ = method549();
		if (((Class80) this).anInt1075 != i_59_
				|| ((Class80) this).anInt1082 != i_60_) {
			int i_61_ = i;
			if (i_61_ > ((Class80) this).anInt1080)
				i_61_ = ((Class80) this).anInt1080;
			int i_62_ = i;
			if (i_62_ + ((Class80) this).anInt1080 + ((Class80) this).anInt1075 > i_59_)
				i_62_ = (i_59_ - ((Class80) this).anInt1080 - ((Class80) this).anInt1075);
			int i_63_ = i;
			if (i_63_ > ((Class80) this).anInt1077)
				i_63_ = ((Class80) this).anInt1077;
			int i_64_ = i;
			if (i_64_ + ((Class80) this).anInt1077 + ((Class80) this).anInt1082 > i_60_)
				i_64_ = (i_60_ - ((Class80) this).anInt1077 - ((Class80) this).anInt1082);
			int i_65_ = ((Class80) this).anInt1075 + i_61_ + i_62_;
			int i_66_ = ((Class80) this).anInt1082 + i_63_ + i_64_;
			byte[] is = new byte[i_65_ * i_66_];
			if (((Class80) this).aByteArray1078 == null) {
				for (int i_67_ = 0; i_67_ < ((Class80) this).anInt1082; i_67_++) {
					int i_68_ = i_67_ * ((Class80) this).anInt1075;
					int i_69_ = (i_67_ + i_63_) * i_65_ + i_61_;
					for (int i_70_ = 0; i_70_ < ((Class80) this).anInt1075; i_70_++)
						is[i_69_++] = ((Class80) this).aByteArray1079[i_68_++];
				}
			} else {
				byte[] is_71_ = new byte[i_65_ * i_66_];
				for (int i_72_ = 0; i_72_ < ((Class80) this).anInt1082; i_72_++) {
					int i_73_ = i_72_ * ((Class80) this).anInt1075;
					int i_74_ = (i_72_ + i_63_) * i_65_ + i_61_;
					for (int i_75_ = 0; i_75_ < ((Class80) this).anInt1075; i_75_++) {
						is_71_[i_74_] = ((Class80) this).aByteArray1078[i_73_];
						is[i_74_++] = ((Class80) this).aByteArray1079[i_73_++];
					}
				}
				((Class80) this).aByteArray1078 = is_71_;
			}
			((Class80) this).anInt1080 -= i_61_;
			((Class80) this).anInt1077 -= i_63_;
			((Class80) this).anInt1076 -= i_62_;
			((Class80) this).anInt1081 -= i_64_;
			((Class80) this).anInt1075 = i_65_;
			((Class80) this).anInt1082 = i_66_;
			((Class80) this).aByteArray1079 = is;
		}
	}

	final void method554(int i) {
		int i_76_ = -1;
		if (((Class80) this).anIntArray1074.length < 255) {
			for (int i_77_ = 0; i_77_ < ((Class80) this).anIntArray1074.length; i_77_++) {
				if (((Class80) this).anIntArray1074[i_77_] == i) {
					i_76_ = i_77_;
					break;
				}
			}
			if (i_76_ == -1) {
				i_76_ = ((Class80) this).anIntArray1074.length;
				int[] is = new int[((Class80) this).anIntArray1074.length + 1];
				Class311.method1896(((Class80) this).anIntArray1074, 0, is, 0,
						((Class80) this).anIntArray1074.length);
				((Class80) this).anIntArray1074 = is;
				is[i_76_] = i;
			}
		} else {
			int i_78_ = 2147483647;
			int i_79_ = i >> 16 & 0xff;
			int i_80_ = i >> 8 & 0xff;
			int i_81_ = i & 0xff;
			for (int i_82_ = 0; i_82_ < ((Class80) this).anIntArray1074.length; i_82_++) {
				int i_83_ = ((Class80) this).anIntArray1074[i_82_];
				int i_84_ = i_83_ >> 16 & 0xff;
				int i_85_ = i_83_ >> 8 & 0xff;
				int i_86_ = i_83_ & 0xff;
				int i_87_ = i_79_ - i_84_;
				if (i_87_ < 0)
					i_87_ = -i_87_;
				int i_88_ = i_80_ - i_85_;
				if (i_88_ < 0)
					i_88_ = -i_88_;
				int i_89_ = i_81_ - i_86_;
				if (i_89_ < 0)
					i_89_ = -i_89_;
				int i_90_ = i_87_ + i_88_ + i_89_;
				if (i_90_ < i_78_) {
					i_78_ = i_90_;
					i_76_ = i_82_;
				}
			}
		}
		int i_91_ = 0;
		byte[] is = (new byte[((Class80) this).anInt1075
				* ((Class80) this).anInt1082]);
		for (int i_92_ = 0; i_92_ < ((Class80) this).anInt1082; i_92_++) {
			for (int i_93_ = 0; i_93_ < ((Class80) this).anInt1075; i_93_++) {
				int i_94_ = ((Class80) this).aByteArray1079[i_91_] & 0xff;
				if (((Class80) this).anIntArray1074[i_94_] == 0) {
					if (i_93_ > 0
							&& (((Class80) this).anIntArray1074[(((Class80) this).aByteArray1079[i_91_ - 1] & 0xff)]) != 0)
						i_94_ = i_76_;
					else if (i_92_ > 0
							&& (((Class80) this).anIntArray1074[((((Class80) this).aByteArray1079[i_91_
									- ((Class80) this).anInt1075]) & 0xff)]) != 0)
						i_94_ = i_76_;
					else if (i_93_ < ((Class80) this).anInt1075 - 1
							&& (((Class80) this).anIntArray1074[(((Class80) this).aByteArray1079[i_91_ + 1] & 0xff)]) != 0)
						i_94_ = i_76_;
					else if (i_92_ < ((Class80) this).anInt1082 - 1
							&& (((Class80) this).anIntArray1074[((((Class80) this).aByteArray1079[i_91_
									+ ((Class80) this).anInt1075]) & 0xff)]) != 0)
						i_94_ = i_76_;
				}
				is[i_91_++] = (byte) i_94_;
			}
		}
		((Class80) this).aByteArray1079 = is;
	}

	static final Class80 method555(Class146 class146, int i) {
		byte[] is = class146.method938(i, 0);
		if (is == null)
			return null;
		return method551(is)[0];
	}

	final void method556() {
		int i = method550();
		int i_95_ = method549();
		if (((Class80) this).anInt1075 != i
				|| ((Class80) this).anInt1082 != i_95_) {
			byte[] is = new byte[i * i_95_];
			if (((Class80) this).aByteArray1078 != null) {
				byte[] is_96_ = new byte[i * i_95_];
				for (int i_97_ = 0; i_97_ < ((Class80) this).anInt1082; i_97_++) {
					int i_98_ = i_97_ * ((Class80) this).anInt1075;
					int i_99_ = ((i_97_ + ((Class80) this).anInt1077) * i + ((Class80) this).anInt1080);
					for (int i_100_ = 0; i_100_ < ((Class80) this).anInt1075; i_100_++) {
						is[i_99_] = ((Class80) this).aByteArray1079[i_98_];
						is_96_[i_99_++] = ((Class80) this).aByteArray1078[i_98_++];
					}
				}
				((Class80) this).aByteArray1078 = is_96_;
			} else {
				for (int i_101_ = 0; i_101_ < ((Class80) this).anInt1082; i_101_++) {
					int i_102_ = i_101_ * ((Class80) this).anInt1075;
					int i_103_ = ((i_101_ + ((Class80) this).anInt1077) * i + ((Class80) this).anInt1080);
					for (int i_104_ = 0; i_104_ < ((Class80) this).anInt1075; i_104_++)
						is[i_103_++] = ((Class80) this).aByteArray1079[i_102_++];
				}
			}
			((Class80) this).anInt1080 = ((Class80) this).anInt1076 = ((Class80) this).anInt1077 = ((Class80) this).anInt1081 = 0;
			((Class80) this).anInt1075 = i;
			((Class80) this).anInt1082 = i_95_;
			((Class80) this).aByteArray1079 = is;
		}
	}

	final void method557(int i) {
		int i_105_ = -1;
		if (((Class80) this).anIntArray1074.length < 255) {
			for (int i_106_ = 0; i_106_ < ((Class80) this).anIntArray1074.length; i_106_++) {
				if (((Class80) this).anIntArray1074[i_106_] == i) {
					i_105_ = i_106_;
					break;
				}
			}
			if (i_105_ == -1) {
				i_105_ = ((Class80) this).anIntArray1074.length;
				int[] is = new int[((Class80) this).anIntArray1074.length + 1];
				Class311.method1896(((Class80) this).anIntArray1074, 0, is, 0,
						((Class80) this).anIntArray1074.length);
				((Class80) this).anIntArray1074 = is;
				is[i_105_] = i;
			}
		} else {
			int i_107_ = 2147483647;
			int i_108_ = i >> 16 & 0xff;
			int i_109_ = i >> 8 & 0xff;
			int i_110_ = i & 0xff;
			for (int i_111_ = 0; i_111_ < ((Class80) this).anIntArray1074.length; i_111_++) {
				int i_112_ = ((Class80) this).anIntArray1074[i_111_];
				int i_113_ = i_112_ >> 16 & 0xff;
				int i_114_ = i_112_ >> 8 & 0xff;
				int i_115_ = i_112_ & 0xff;
				int i_116_ = i_108_ - i_113_;
				if (i_116_ < 0)
					i_116_ = -i_116_;
				int i_117_ = i_109_ - i_114_;
				if (i_117_ < 0)
					i_117_ = -i_117_;
				int i_118_ = i_110_ - i_115_;
				if (i_118_ < 0)
					i_118_ = -i_118_;
				int i_119_ = i_116_ + i_117_ + i_118_;
				if (i_119_ < i_107_) {
					i_107_ = i_119_;
					i_105_ = i_111_;
				}
			}
		}
		for (int i_120_ = ((Class80) this).anInt1082 - 1; i_120_ > 0; i_120_--) {
			int i_121_ = i_120_ * ((Class80) this).anInt1075;
			for (int i_122_ = ((Class80) this).anInt1075 - 1; i_122_ > 0; i_122_--) {
				if ((((Class80) this).anIntArray1074[(((Class80) this).aByteArray1079[i_122_
						+ i_121_] & 0xff)]) == 0
						&& (((Class80) this).anIntArray1074[((((Class80) this).aByteArray1079[i_122_
								+ i_121_ - 1 - ((Class80) this).anInt1075]) & 0xff)]) != 0)
					((Class80) this).aByteArray1079[i_122_ + i_121_] = (byte) i_105_;
			}
		}
	}

	public Class80() {
		/* empty */
	}
}
