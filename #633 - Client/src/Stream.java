/* Stream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.math.BigInteger;

class Stream extends Class11 {
	static int anInt5889;
	int position;
	static int anInt5891;
	static int anInt5892;
	static int anInt5893;
	static int anInt5894;
	static int anInt5895;
	static int anInt5896;
	static int anInt5897;
	byte[] buffer;
	static int anInt5899;
	static int anInt5900;
	static int anInt5901;
	static int anInt5902;
	static int anInt5903;
	static int anInt5904;
	static int anInt5905;
	static int anInt5906;
	static int anInt5907;
	static int anInt5908;
	static int anInt5909;
	static int anInt5910;
	static int anInt5911;
	static int anInt5912;
	static int anInt5913;
	static int anInt5914;
	static int anInt5915;
	static int anInt5916;
	static int anInt5917;
	static int anInt5918;
	static int anInt5919;
	static int anInt5920;
	static Class253[] aClass253Array5921;
	static int anInt5922;
	static int anInt5923;
	static int anInt5924;
	static int anInt5925;
	static int anInt5926;
	static int anInt5927;
	static int anInt5928;
	static int anInt5929;
	static int anInt5930;
	static int anInt5931;
	static int anInt5932;
	static int anInt5933;
	static int anInt5934;
	static int anInt5935;
	static int anInt5936;
	static int anInt5937;
	static int anInt5938;
	static int anInt5939;
	static int anInt5940;
	static int anInt5941;
	static int anInt5942;
	static int anInt5943;
	static int anInt5944;
	static int anInt5945;
	static int anInt5946;
	static int anInt5947;
	static int anInt5948;
	static int anInt5949;
	static int anInt5950;
	static int anInt5951;
	static int anInt5952;
	static int anInt5953;
	static int anInt5954;
	static int anInt5955;
	static int anInt5956;
	static int anInt5957;
	static int anInt5958;
	static int anInt5959;
	static int anInt5960;

	final int readUnsignedByte128(int i) {
		try {
			anInt5943++;
			if (i != 7925)
				return 52;
			return (-128 + (((Stream) this).buffer[((Stream) this).position++]) & 0xff);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.JC(" + i + ')');
		}
	}

	final boolean method2491(int i) {
		try {
			anInt5906++;
			((Stream) this).position -= 4;
			int i_0_ = Class11_Sub2_Sub37.method3841(((Stream) this).buffer,
					true, ((Stream) this).position, 0);
			if (i != -1487750560)
				endPacketVarShort(-40, (byte) -50);
			int i_1_ = readInt(119);
			if (i_0_ == i_1_)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.CB(" + i + ')');
		}
	}

	final void method2492(int i, int i_2_) {
		try {
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i_2_ >> 8);
			anInt5892++;
			((Stream) this).buffer[((Stream) this).position++] = (byte) i_2_;
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i_2_ >> 24);
			if (i >= 12)
				((Stream) this).buffer[((Stream) this).position++] = (byte) (i_2_ >> 16);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.HC(" + i + ','
					+ i_2_ + ')');
		}
	}

	final int readIntV2(byte i) {
		try {
			((Stream) this).position += 4;
			int i_3_ = 40 / ((i + 17) / 55);
			anInt5904++;
			return (((((Stream) this).buffer[-2 + ((Stream) this).position]) & 0xff)
					+ (0xff00 & (((Stream) this).buffer[-1
							+ ((Stream) this).position]) << 8) + ((~0xffffff & (((Stream) this).buffer[-3
					+ ((Stream) this).position]) << 24) + (0xff0000 & (((Stream) this).buffer[-4
					+ ((Stream) this).position]) << 16)));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.BA(" + i + ')');
		}
	}

	final void writeLong(byte i, long l) {
		try {
			((Stream) this).buffer[((Stream) this).position++] = (byte) (int) (l >> 56);
			anInt5931++;
			((Stream) this).buffer[((Stream) this).position++] = (byte) (int) (l >> 48);
			((Stream) this).buffer[((Stream) this).position++] = (byte) (int) (l >> 40);
			if (i != -103)
				((Stream) this).position = -109;
			((Stream) this).buffer[((Stream) this).position++] = (byte) (int) (l >> 32);
			((Stream) this).buffer[((Stream) this).position++] = (byte) (int) (l >> 24);
			((Stream) this).buffer[((Stream) this).position++] = (byte) (int) (l >> 16);
			((Stream) this).buffer[((Stream) this).position++] = (byte) (int) (l >> 8);
			((Stream) this).buffer[((Stream) this).position++] = (byte) (int) l;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.LB(" + i + ',' + l
					+ ')');
		}
	}

	final int readSmart(int i) {
		try {
			anInt5928++;
			int i_4_ = -105 % ((i - 63) / 35);
			int i_5_ = 0xff & (((Stream) this).buffer[((Stream) this).position]);
			if (i_5_ >= 128)
				return readUnsignedShort((byte) -65) - 32768;
			return readUnsignedByte((byte) 35);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.W(" + i + ')');
		}
	}

	final void writeByte(int i, int i_6_) {
		do {
			try {
				anInt5905++;
				((Stream) this).buffer[((Stream) this).position++] = (byte) i;
				if (i_6_ == -1528071456)
					break;
				method2513((byte) -116, 12);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ee.WA(" + i + ','
						+ i_6_ + ')');
			}
			break;
		} while (false);
	}

	final void encryptXTEA(int i, int[] is, int i_7_, int i_8_) {
		try {
			anInt5960++;
			int i_9_ = ((Stream) this).position;
			((Stream) this).position = i_8_;
			int i_10_ = (-i_8_ + i) / 8;
			if (i_7_ <= 86)
				((Stream) this).position = 60;
			for (int i_11_ = 0; i_10_ > i_11_; i_11_++) {
				int i_12_ = readInt(120);
				int i_13_ = readInt(101);
				int i_14_ = 0;
				int i_15_ = -1640531527;
				int i_16_ = 32;
				while (i_16_-- > 0) {
					i_12_ += (is[i_14_ & 0x3] + i_14_ ^ (i_13_ << 4 ^ i_13_ >>> 5)
							+ i_13_);
					i_14_ += i_15_;
					i_13_ += (i_14_ - -is[~0x89ffffc & i_14_ >>> 11] ^ i_12_
							+ (i_12_ >>> 5 ^ i_12_ << 4));
				}
				((Stream) this).position -= 8;
				writeInt(-49, i_12_);
				writeInt(-49, i_13_);
			}
			((Stream) this).position = i_9_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ee.SC(" + i + ',' + (is != null ? "{...}" : "null") + ','
							+ i_7_ + ',' + i_8_ + ')'));
		}
	}

	static final void method2498(int i, int i_17_, int i_18_, int i_19_,
			int i_20_) {
		try {
			anInt5957++;
			if (i != 20783)
				aClass253Array5921 = null;
			if ((i_18_ ^ 0xffffffff) == -9 || i_18_ == 16) {
				for (int i_21_ = 0; (Class265.anInt3614 ^ 0xffffffff) < (i_21_ ^ 0xffffffff); i_21_++) {
					Class203 class203 = Class58_Sub1_Sub1.aClass203Array9173[i_21_];
					if ((((Class203) class203).aByte2731 == i_18_
							&& ((Class203) class203).aShort2723 == i_19_ && ((((Class203) class203).aShort2736 ^ 0xffffffff) == (i_17_ ^ 0xffffffff)))
							|| (i_19_ == ((Class203) class203).aShort2737 && i_17_ == ((Class203) class203).aShort2736)) {
						if ((Class265.anInt3614 ^ 0xffffffff) != (i_21_ ^ 0xffffffff))
							Class311.method1901(
									Class58_Sub1_Sub1.aClass203Array9173,
									i_21_ + 1,
									Class58_Sub1_Sub1.aClass203Array9173,
									i_21_,
									(Class58_Sub1_Sub1.aClass203Array9173.length - (1 + i_21_)));
						Class265.anInt3614--;
						break;
					}
				}
			} else {
				Class364 class364 = (Class181.aClass364ArrayArrayArray2336[i_20_][i_19_][i_17_]);
				if (class364 != null) {
					if ((i_18_ ^ 0xffffffff) != -2) {
						if ((i_18_ ^ 0xffffffff) == -3)
							((Class364) class364).aShort4787 = (short) 0;
					} else
						((Class364) class364).aShort4784 = (short) 0;
				}
				Class236_Sub3.method2648(0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ee.QB(" + i + ','
					+ i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ')'));
		}
	}

	final String readString(int i) {
		try {
			anInt5909++;
			int i_22_ = ((Stream) this).position;
			while ((((Stream) this).buffer[((Stream) this).position++] ^ 0xffffffff) != -1) {
				/* empty */
			}
			int i_23_ = -1 + (-i_22_ + ((Stream) this).position);
			if ((i_23_ ^ 0xffffffff) == i)
				return "";
			return Class11_Sub45_Sub20_Sub2.method3941(
					(((Stream) this).buffer), i_22_, 63, i_23_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.LA(" + i + ')');
		}
	}

	final byte readByteC(int i) {
		try {
			if (i != 0)
				method2510(108);
			anInt5959++;
			return (byte) -(((Stream) this).buffer[((Stream) this).position++]);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.EC(" + i + ')');
		}
	}

	final int method2501(int i) {
		try {
			((Stream) this).position += 2;
			if (i != -8)
				((Stream) this).position = 67;
			anInt5934++;
			int i_24_ = ((((((Stream) this).buffer[((Stream) this).position - 1]) & 0xff) << 8) + (0xff & -128
					+ (((Stream) this).buffer[-2 + ((Stream) this).position])));
			if ((i_24_ ^ 0xffffffff) < -32768)
				i_24_ -= 65536;
			return i_24_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.JB(" + i + ')');
		}
	}

	final int readIntV1(int i) {
		try {
			anInt5952++;
			if (i != 27326)
				aClass253Array5921 = null;
			((Stream) this).position += 4;
			return (((((Stream) this).buffer[-3 + ((Stream) this).position]) & 0xff)
					+ ((((((Stream) this).buffer[((Stream) this).position - 4]) & 0xff) << 8) + ((0xff & (((Stream) this).buffer[-2
							+ ((Stream) this).position])) << 24)) - -((((Stream) this).buffer[-1
					+ ((Stream) this).position]) << 16 & 0xff0000));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.CA(" + i + ')');
		}
	}

	Stream(int i) {
		try {
			((Stream) this).buffer = Class295.method1832(-7251, i);
			((Stream) this).position = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.<init>(" + i + ')');
		}
	}

	final void writeShort128(int i, byte i_25_) {
		try {
			if (i_25_ > -43)
				readBytes(null, 35, -108, 2);
			anInt5925++;
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i >> 8);
			((Stream) this).buffer[((Stream) this).position++] = (byte) (128 + i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.CC(" + i + ','
					+ i_25_ + ')');
		}
	}

	final void writeByte128(byte i, int i_26_) {
		do {
			try {
				((Stream) this).buffer[((Stream) this).position++] = (byte) (i_26_ + 128);
				anInt5908++;
				if (i == -5)
					break;
				((Stream) this).buffer = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ee.MC(" + i + ','
						+ i_26_ + ')');
			}
			break;
		} while (false);
	}

	final int readInt(int i) {
		try {
			if (i < 87)
				method2498(-92, 96, 46, -44, -127);
			((Stream) this).position += 4;
			anInt5918++;
			return (((0xff & (((Stream) this).buffer[((Stream) this).position - 3])) << 16)
					+ ((~0xffffff & (((Stream) this).buffer[((Stream) this).position - 4]) << 24) + (0xff00 & (((Stream) this).buffer[((Stream) this).position - 2]) << 8)) - -(0xff & (((Stream) this).buffer[-1
					+ ((Stream) this).position])));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.DC(" + i + ')');
		}
	}

	final void method2506(long l, boolean bool, int i) {
		try {
			anInt5897++;
			i--;
			if (bool != false)
				readString(78);
			if ((i ^ 0xffffffff) > -1 || i > 7)
				throw new IllegalArgumentException();
			for (int i_27_ = i * 8; i_27_ >= 0; i_27_ -= 8)
				((Stream) this).buffer[((Stream) this).position++] = (byte) (int) (l >> i_27_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ee.MA(" + l + ','
					+ bool + ',' + i + ')'));
		}
	}

	final void encodeRSA(BigInteger biginteger, int i, BigInteger biginteger_28_) {
		do {
			try {
				anInt5893++;
				int i_29_ = ((Stream) this).position;
				((Stream) this).position = 0;
				byte[] is = new byte[i_29_];
				readBytes(is, 4, i_29_, 0);
				BigInteger biginteger_30_ = new BigInteger(is);
				BigInteger biginteger_31_ = biginteger_30_.modPow(biginteger,
						biginteger_28_);
				byte[] is_32_ = biginteger_31_.toByteArray();
				((Stream) this).position = 0;
				writeShort(-112, is_32_.length);
				writeBytes(true, is_32_, is_32_.length, 0);
				if (i == 22832)
					break;
				((Stream) this).position = -35;
			} catch (RuntimeException runtimeexception) {
				throw Class205
						.method1298(runtimeexception,
								("ee.PB("
										+ (biginteger != null ? "{...}"
												: "null")
										+ ','
										+ i
										+ ','
										+ (biginteger_28_ != null ? "{...}"
												: "null") + ')'));
			}
			break;
		} while (false);
	}

	final int method2508(byte i) {
		try {
			anInt5923++;
			((Stream) this).position += 2;
			int i_33_ = (((((Stream) this).buffer[((Stream) this).position - 1]) & 0xff) + ((((Stream) this).buffer[-2
					+ ((Stream) this).position]) << 8 & 0xff00));
			int i_34_ = 58 % ((-38 - i) / 38);
			if ((i_33_ ^ 0xffffffff) < -32768)
				i_33_ -= 65536;
			return i_33_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.IB(" + i + ')');
		}
	}

	final void method2509(String string, byte i) {
		try {
			anInt5900++;
			int i_35_ = string.indexOf('\0');
			if (i_35_ >= 0)
				throw new IllegalArgumentException("NUL character at " + i_35_
						+ " - cannot pjstr2");
			if (i == -52) {
				((Stream) this).buffer[((Stream) this).position++] = (byte) 0;
				((Stream) this).position += Class239_Sub1.method2941(0,
						(byte) -30, ((Stream) this).buffer, string.length(),
						string, ((Stream) this).position);
				((Stream) this).buffer[((Stream) this).position++] = (byte) 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.VB("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void method2510(int i) {
		do {
			try {
				anInt5924++;
				for (Class11_Sub26 class11_sub26 = ((Class11_Sub26) Class111.aClass213_1522
						.method1365(24490)); class11_sub26 != null; class11_sub26 = ((Class11_Sub26) Class111.aClass213_1522
						.method1367((byte) 71))) {
					if (((Class11_Sub26) class11_sub26).aClass28_Sub1_6305
							.method238(0))
						Class46.method404(
								(((Class11_Sub26) class11_sub26).anInt6297),
								(byte) 107);
					else {
						((Class11_Sub26) class11_sub26).aClass28_Sub1_6305
								.method2726(true);
						try {
							((Class11_Sub26) class11_sub26).aClass28_Sub1_6305
									.method230(114);
						} catch (Exception exception) {
							Class11_Sub12_Sub3
									.method3602(
											(byte) -91,
											("TV: " + (((Class11_Sub26) class11_sub26).anInt6297)),
											exception);
							Class46.method404(
									(((Class11_Sub26) class11_sub26).anInt6297),
									(byte) 116);
						}
						if (!((Class11_Sub26) class11_sub26).aBool6307
								&& !((Class11_Sub26) class11_sub26).aBool6304) {
							Class11_Sub12_Sub2 class11_sub12_sub2 = ((Class11_Sub26) class11_sub26).aClass28_Sub1_6305
									.method244(false);
							if (class11_sub12_sub2 != null) {
								Class11_Sub6_Sub5 class11_sub6_sub5 = class11_sub12_sub2
										.method3561((byte) 87);
								if (class11_sub6_sub5 != null) {
									class11_sub6_sub5
											.method3782(
													0,
													(((Class11_Sub26) class11_sub26).anInt6302));
									Class233.aClass11_Sub6_Sub1_3185
											.method3459(class11_sub6_sub5);
									((Class11_Sub26) class11_sub26).aBool6307 = true;
								}
							}
						}
					}
				}
				if (i == -14392)
					break;
				method2524(null, -21, (byte) -117);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ee.FB(" + i + ')');
			}
			break;
		} while (false);
	}

	final void writeShortLE(int i, int i_36_) {
		try {
			anInt5926++;
			if (i != 1815869672)
				method2529(24);
			((Stream) this).buffer[((Stream) this).position++] = (byte) i_36_;
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i_36_ >> 8);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.GB(" + i + ','
					+ i_36_ + ')');
		}
	}

	final int readUnsignedByteC(int i) {
		try {
			if (i != -6067)
				return 29;
			anInt5948++;
			return 0xff & -(((Stream) this).buffer[((Stream) this).position++]);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.GA(" + i + ')');
		}
	}

	final void method2513(byte i, int i_37_) {
		try {
			if ((i_37_ & ~0x7f) != 0) {
				if ((i_37_ & ~0x3fff ^ 0xffffffff) != -1) {
					if ((~0x1fffff & i_37_) != 0) {
						if ((i_37_ & ~0xfffffff ^ 0xffffffff) != -1)
							writeByte(i_37_ >>> 28 | 0x80, -1528071456);
						writeByte((0x10050212 | i_37_) >>> 21, -1528071456);
					}
					writeByte((i_37_ | 0x203f6b) >>> 14, -1528071456);
				}
				writeByte(i_37_ >>> 7 | 0x80, -1528071456);
			}
			anInt5919++;
			if (i != 16)
				((Stream) this).position = 71;
			writeByte(0x7f & i_37_, i + -1528071472);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.HA(" + i + ','
					+ i_37_ + ')');
		}
	}

	final byte read128Byte(int i) {
		try {
			int i_38_ = -10 % ((71 - i) / 53);
			anInt5946++;
			return (byte) (-(((Stream) this).buffer[((Stream) this).position++]) + 128);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.RC(" + i + ')');
		}
	}

	final byte method2515(byte i) {
		try {
			if (i != -14)
				return (byte) 10;
			anInt5922++;
			return (byte) ((((Stream) this).buffer[((Stream) this).position++]) - 128);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.IA(" + i + ')');
		}
	}

	final long method2516(int i) {
		try {
			if (i != 8919)
				((Stream) this).position = 102;
			anInt5895++;
			long l = (long) readInt(i - 8800) & 0xffffffffL;
			long l_39_ = (long) readInt(120) & 0xffffffffL;
			return (l << 32) - -l_39_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.O(" + i + ')');
		}
	}

	final long method2517(int i, int i_40_) {
		try {
			anInt5933++;
			if (--i_40_ < 0 || (i_40_ ^ 0xffffffff) < -8)
				throw new IllegalArgumentException();
			int i_41_ = 8 * i_40_;
			if (i != 5225)
				return -122L;
			long l = 0L;
			for (/**/; i_41_ >= 0; i_41_ -= 8)
				l |= ((long) (((Stream) this).buffer[((Stream) this).position++]) & 0xffL) << i_41_;
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.GC(" + i + ','
					+ i_40_ + ')');
		}
	}

	public static void method2518(byte i) {
		try {
			if (i != -118)
				method2498(-2, -47, -122, 121, 39);
			aClass253Array5921 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.UA(" + i + ')');
		}
	}

	final int readUnsignedShortLE(int i) {
		try {
			if (i != 25651)
				return 99;
			((Stream) this).position += 2;
			anInt5911++;
			return ((0xff00 & (((Stream) this).buffer[((Stream) this).position - 1]) << 8) + (0xff & (((Stream) this).buffer[-2
					+ ((Stream) this).position])));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.KC(" + i + ')');
		}
	}

	final void writeShortLE128(byte i, int i_42_) {
		try {
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i_42_ + 128);
			anInt5902++;
			if (i <= 47)
				method2509(null, (byte) 26);
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i_42_ >> 8);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.LC(" + i + ','
					+ i_42_ + ')');
		}
	}

	final byte readByte(int i) {
		try {
			if (i != 1854307120)
				method2554(64);
			anInt5950++;
			return ((Stream) this).buffer[((Stream) this).position++];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.MB(" + i + ')');
		}
	}

	final void method2522(byte i, int i_43_) {
		try {
			if (i != 100)
				readByte(-18);
			anInt5907++;
			((Stream) this).buffer[(-4 + ((Stream) this).position + -i_43_)] = (byte) (i_43_ >> 24);
			((Stream) this).buffer[-3 + (-i_43_ + ((Stream) this).position)] = (byte) (i_43_ >> 16);
			((Stream) this).buffer[(-2 + ((Stream) this).position + -i_43_)] = (byte) (i_43_ >> 8);
			((Stream) this).buffer[((Stream) this).position + (-i_43_ - 1)] = (byte) i_43_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.RB(" + i + ','
					+ i_43_ + ')');
		}
	}

	final void method2523(byte i) {
		try {
			if (((Stream) this).buffer != null)
				Class295.method1828(((Stream) this).buffer, 100);
			anInt5930++;
			int i_44_ = 1 % ((i - 44) / 45);
			((Stream) this).buffer = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.EB(" + i + ')');
		}
	}

	static final void method2524(String string, int i, byte i_45_) {
		try {
			anInt5901++;
			Class314.anInt4168++;
			Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
					Class11_Sub3.aClass25_5113, Class195.aClass370_2654,
					(byte) -75);
			if (i_45_ <= 30)
				aClass253Array5921 = null;
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397.writeByte(
					1 - -Class98.method660(string, 0), -1528071456);
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
					.method2553((byte) -100, i);
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
					.writeString((byte) 27, string);
			Class79.method541(class11_sub10, -59);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ee.KA("
					+ (string != null ? "{...}" : "null") + ',' + i + ','
					+ i_45_ + ')'));
		}
	}

	final void readBytes(byte[] is, int i, int i_46_, int i_47_) {
		try {
			anInt5939++;
			int i_48_ = i_47_;
			if (i != 4)
				((Stream) this).buffer = null;
			for (/**/; i_46_ + i_47_ > i_48_; i_48_++)
				is[i_48_] = (((Stream) this).buffer[((Stream) this).position++]);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ee.KB("
					+ (is != null ? "{...}" : "null") + ',' + i + ',' + i_46_
					+ ',' + i_47_ + ')'));
		}
	}

	final void writeByteC(int i, byte i_49_) {
		try {
			int i_50_ = 103 % ((i_49_ + 62) / 45);
			anInt5958++;
			((Stream) this).buffer[((Stream) this).position++] = (byte) -i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.WB(" + i + ','
					+ i_49_ + ')');
		}
	}

	final void method2527(int i, int i_51_) {
		try {
			((Stream) this).buffer[((Stream) this).position++] = (byte) i;
			anInt5915++;
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i >> 8);
			if (i_51_ != 0)
				aClass253Array5921 = null;
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i >> 16);
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i >> 24);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.P(" + i + ','
					+ i_51_ + ')');
		}
	}

	final String method2528(int i) {
		try {
			anInt5916++;
			byte i_52_ = ((Stream) this).buffer[((Stream) this).position++];
			if (i > -17)
				aClass253Array5921 = null;
			if ((i_52_ ^ 0xffffffff) != -1)
				throw new IllegalStateException("Bad version number in gjstr2");
			int i_53_ = ((Stream) this).position;
			while ((((Stream) this).buffer[((Stream) this).position++] ^ 0xffffffff) != -1) {
				/* empty */
			}
			int i_54_ = -i_53_ + (((Stream) this).position - 1);
			if (i_54_ == 0)
				return "";
			return Class11_Sub45_Sub20_Sub2.method3941(
					(((Stream) this).buffer), i_53_, 63, i_54_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.UB(" + i + ')');
		}
	}

	final long method2529(int i) {
		try {
			anInt5913++;
			long l = 0xffffffffL & (long) method2540((byte) 105);
			if (i != -15100)
				return -85L;
			long l_55_ = (long) method2540((byte) 105) & 0xffffffffL;
			return l + (l_55_ << 32);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.SB(" + i + ')');
		}
	}

	final void method2530(int i, byte i_56_) {
		do {
			try {
				((Stream) this).buffer[(((Stream) this).position + (-i - 1))] = (byte) i;
				anInt5956++;
				if (i_56_ > 103)
					break;
				((Stream) this).position = 124;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ee.AC(" + i + ','
						+ i_56_ + ')');
			}
			break;
		} while (false);
	}

	final int readIntLE(byte i) {
		try {
			if (i <= 13)
				return 70;
			((Stream) this).position += 4;
			anInt5942++;
			return ((((((Stream) this).buffer[((Stream) this).position - 3]) & 0xff) << 8) + ((0xff0000 & (((Stream) this).buffer[-2
					+ ((Stream) this).position]) << 16) + (((((Stream) this).buffer[-1
					+ ((Stream) this).position]) << 24 & ~0xffffff) + (0xff & (((Stream) this).buffer[((Stream) this).position - 4])))));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.BC(" + i + ')');
		}
	}

	final int method2532(int i) {
		try {
			anInt5941++;
			int i_57_ = (((Stream) this).buffer[((Stream) this).position] & 0xff);
			if (i != -5929)
				return 19;
			if ((i_57_ ^ 0xffffffff) <= -129)
				return readUnsignedShort((byte) -65) + -49152;
			return -64 + readUnsignedByte((byte) 35);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.NA(" + i + ')');
		}
	}

	final void method2533(int i, int[] is, int i_58_, byte i_59_) {
		try {
			anInt5929++;
			int i_60_ = ((Stream) this).position;
			((Stream) this).position = i;
			int i_61_ = (-i + i_58_) / 8;
			for (int i_62_ = 0; (i_61_ ^ 0xffffffff) < (i_62_ ^ 0xffffffff); i_62_++) {
				int i_63_ = readInt(109);
				int i_64_ = readInt(99);
				int i_65_ = -957401312;
				int i_66_ = -1640531527;
				int i_67_ = 32;
				while (i_67_-- > 0) {
					i_64_ -= (is[i_65_ >>> 11 & ~0x4d9ffffc] + i_65_ ^ i_63_
							+ (i_63_ >>> 5 ^ i_63_ << 4));
					i_65_ -= i_66_;
					i_63_ -= (i_64_ + (i_64_ << 4 ^ i_64_ >>> 5) ^ is[i_65_ & 0x3]
							+ i_65_);
				}
				((Stream) this).position -= 8;
				writeInt(-49, i_63_);
				writeInt(-49, i_64_);
			}
			if (i_59_ >= -93)
				aClass253Array5921 = null;
			((Stream) this).position = i_60_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ee.NB(" + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_58_ + ','
					+ i_59_ + ')'));
		}
	}

	static final void method2534(int i, byte i_68_, int i_69_, int i_70_,
			int i_71_) {
		do {
			try {
				if (Class26.anInt340 <= -i_69_ + i_70_
						&& ((Class11_Sub45_Sub1_Sub2.anInt9880 ^ 0xffffffff) <= (i_69_
								+ i_70_ ^ 0xffffffff))
						&& (Class292.anInt3962 ^ 0xffffffff) >= (-i_69_ + i_71_ ^ 0xffffffff)
						&& Class351.anInt4618 >= i_69_ + i_71_)
					Class329.method1992(i_68_ ^ 0x39, i_71_, i_69_, i, i_70_);
				else
					Class289.method1781(i_71_, i_69_, i, i_70_, i_68_ ^ ~0x30);
				anInt5937++;
				if (i_68_ == 79)
					break;
				aClass253Array5921 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("ee.TC(" + i + ',' + i_68_ + ',' + i_69_ + ',' + i_70_
								+ ',' + i_71_ + ')'));
			}
			break;
		} while (false);
	}

	Stream(byte[] is) {
		try {
			((Stream) this).buffer = is;
			((Stream) this).position = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.<init>("
					+ (is != null ? "{...}" : "null") + ')');
		}
	}

	final void writeInt(int i, int i_72_) {
		try {
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i_72_ >> 24);
			anInt5955++;
			if (i != -49)
				encodeRSA(null, -48, null);
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i_72_ >> 16);
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i_72_ >> 8);
			((Stream) this).buffer[((Stream) this).position++] = (byte) i_72_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.TB(" + i + ','
					+ i_72_ + ')');
		}
	}

	final int readUnsignedShortLE128(int i) {
		try {
			if (i <= 122)
				return -9;
			((Stream) this).position += 2;
			anInt5912++;
			return ((0xff00 & (((Stream) this).buffer[-1
					+ ((Stream) this).position]) << 8) - -((((Stream) this).buffer[((Stream) this).position - 2]) - 128 & 0xff));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.NC(" + i + ')');
		}
	}

	final void method2537(int i, byte i_73_) {
		try {
			if (i_73_ >= 83) {
				anInt5944++;
				if ((i ^ 0xffffffff) <= -1 && (i ^ 0xffffffff) > -129)
					writeByte(i, -1528071456);
				else if ((i ^ 0xffffffff) <= -1 && (i ^ 0xffffffff) > -32769)
					writeShort(-111, i + 32768);
				else
					throw new IllegalArgumentException();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.OC(" + i + ','
					+ i_73_ + ')');
		}
	}

	final int readUnsigned128Byte(boolean bool) {
		try {
			if (bool != true)
				return -40;
			anInt5938++;
			return 0xff & 128 + -(((Stream) this).buffer[((Stream) this).position++]);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.FA(" + bool + ')');
		}
	}

	final void method2539(int i, int i_74_) {
		try {
			((Stream) this).buffer[((Stream) this).position++] = (byte) i;
			if (i_74_ != -1682769048)
				aClass253Array5921 = null;
			anInt5954++;
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i >> 8);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.AA(" + i + ','
					+ i_74_ + ')');
		}
	}

	final int method2540(byte i) {
		try {
			if (i != 105)
				((Stream) this).buffer = null;
			((Stream) this).position += 4;
			anInt5953++;
			return (((((Stream) this).buffer[-4 + ((Stream) this).position]) & 0xff) + (((((Stream) this).buffer[((Stream) this).position - 2]) << 16 & 0xff0000) + ((~0xffffff & (((Stream) this).buffer[-1
					+ ((Stream) this).position]) << 24) + ((((Stream) this).buffer[-3
					+ ((Stream) this).position]) << 8 & 0xff00))));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.QA(" + i + ')');
		}
	}

	final int method2541(int i) {
		try {
			((Stream) this).position += 2;
			anInt5910++;
			if (i != 0)
				((Stream) this).buffer = null;
			int i_75_ = (((((Stream) this).buffer[((Stream) this).position - 1]) << 8 & 0xff00) - -((((Stream) this).buffer[((Stream) this).position - 2]) & 0xff));
			if ((i_75_ ^ 0xffffffff) < -32768)
				i_75_ -= 65536;
			return i_75_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.OB(" + i + ')');
		}
	}

	static final int method2542(int i) {
		try {
			anInt5951++;
			int i_76_ = 71 % ((i + 19) / 47);
			Class163 class163 = Class321_Sub2.aClass163_6648;
			boolean bool = false;
			if ((((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5696
					.method3181(false) ^ 0xffffffff) != -1) {
				Canvas canvas = new Canvas();
				canvas.setSize(100, 100);
				bool = true;
				class163 = NPCDefinitions.method1385(null, null, 0, canvas, 0,
						(byte) -112);
			}
			long l = Class137.method878((byte) -122);
			for (int i_77_ = 0; (i_77_ ^ 0xffffffff) > -10001; i_77_++)
				class163.method1079(5, 10, 100, 75, 50, 100, 15, 90, 100,
						-65536, -65536, -65536, 1);
			int i_78_ = (int) (Class137.method878((byte) -106) - l);
			class163.method1035(-16777216, 0, 0, (byte) 61, 100, 100);
			if (bool)
				class163.method1072(1);
			return i_78_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.HB(" + i + ')');
		}
	}

	final void endPacketVarShort(int i, byte i_79_) {
		try {
			((Stream) this).buffer[-2 + (((Stream) this).position - i)] = (byte) (i >> 8);
			if (i_79_ != -87)
				method2553((byte) 17, 23);
			anInt5949++;
			((Stream) this).buffer[((Stream) this).position + -i - 1] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.QC(" + i + ','
					+ i_79_ + ')');
		}
	}

	final int method2544(byte i) {
		try {
			anInt5940++;
			int i_80_ = ((Stream) this).buffer[((Stream) this).position++];
			int i_81_ = 0;
			for (/**/; i_80_ < 0; i_80_ = (((Stream) this).buffer[((Stream) this).position++]))
				i_81_ = (i_81_ | 0x7f & i_80_) << 7;
			if (i != 122)
				writeInt(33, -8);
			return i_81_ | i_80_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.JA(" + i + ')');
		}
	}

	final int read24BitInteger(int i) {
		try {
			((Stream) this).position += 3;
			anInt5947++;
			if (i != 0)
				method2537(-97, (byte) 122);
			return (((((Stream) this).buffer[-2 + ((Stream) this).position]) & 0xff)
					+ (0xff0000 & (((Stream) this).buffer[-3
							+ ((Stream) this).position]) << 16) + ((0xff & (((Stream) this).buffer[-1
					+ ((Stream) this).position])) << 8));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.EA(" + i + ')');
		}
	}

	final int readUnsignedShort128(boolean bool) {
		try {
			((Stream) this).position += 2;
			if (bool != true)
				return -18;
			anInt5891++;
			return ((-128
					+ (((Stream) this).buffer[((Stream) this).position - 1]) & 0xff) + (0xff00 & (((Stream) this).buffer[((Stream) this).position - 2]) << 8));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.RA(" + bool + ')');
		}
	}

	final void writeShort(int i, int i_82_) {
		try {
			if (i >= -109)
				((Stream) this).buffer = null;
			anInt5945++;
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i_82_ >> 8);
			((Stream) this).buffer[((Stream) this).position++] = (byte) i_82_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.VA(" + i + ','
					+ i_82_ + ')');
		}
	}

	final int method2548(int i, byte i_83_) {
		try {
			anInt5889++;
			if (i_83_ >= -74)
				method2524(null, -9, (byte) 42);
			int i_84_ = Class11_Sub2_Sub37.method3841(((Stream) this).buffer,
					true, ((Stream) this).position, i);
			writeInt(-49, i_84_);
			return i_84_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.S(" + i + ','
					+ i_83_ + ')');
		}
	}

	final void writeString(byte i, String string) {
		try {
			anInt5896++;
			int i_85_ = string.indexOf('\0');
			if ((i_85_ ^ 0xffffffff) <= -1)
				throw new IllegalArgumentException("NUL character at " + i_85_
						+ " - cannot pjstr");
			if (i == 27) {
				((Stream) this).position += Class239_Sub1.method2941(0,
						(byte) -30, ((Stream) this).buffer, string.length(),
						string, ((Stream) this).position);
				((Stream) this).buffer[((Stream) this).position++] = (byte) 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ee.TA(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	final void writeBytes(boolean bool, byte[] is, int i, int i_86_) {
		try {
			if (bool != true)
				aClass253Array5921 = null;
			for (int i_87_ = i_86_; i_87_ < i + i_86_; i_87_++)
				((Stream) this).buffer[((Stream) this).position++] = is[i_87_];
			anInt5914++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ee.PA(" + bool + ',' + (is != null ? "{...}" : "null")
							+ ',' + i + ',' + i_86_ + ')'));
		}
	}

	final void method2551(int i, byte i_88_) {
		try {
			anInt5899++;
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i >> 16);
			if (i_88_ >= -48)
				((Stream) this).buffer = null;
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i >> 24);
			((Stream) this).buffer[((Stream) this).position++] = (byte) i;
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i >> 8);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.BB(" + i + ','
					+ i_88_ + ')');
		}
	}

	final int readUnsignedByte(byte i) {
		try {
			anInt5920++;
			if (i != 35)
				return -107;
			return 0xff & (((Stream) this).buffer[((Stream) this).position++]);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.AB(" + i + ')');
		}
	}

	final void method2553(byte i, int i_89_) {
		try {
			((Stream) this).buffer[((Stream) this).position++] = (byte) (-i_89_ + 128);
			if (i >= 0)
				aClass253Array5921 = null;
			anInt5935++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.IC(" + i + ','
					+ i_89_ + ')');
		}
	}

	final int method2554(int i) {
		try {
			anInt5936++;
			((Stream) this).position += 3;
			int i_90_ = ((0xff & (((Stream) this).buffer[-1
					+ ((Stream) this).position]))
					+ (((((Stream) this).buffer[-3 + ((Stream) this).position]) & 0xff) << 16) - -((((Stream) this).buffer[((Stream) this).position - 2]) << 8 & 0xff00));
			int i_91_ = 72 / ((78 - i) / 42);
			if ((i_90_ ^ 0xffffffff) < -8388608)
				i_90_ -= 16777216;
			return i_90_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.DB(" + i + ')');
		}
	}

	final void method2555(int i, int i_92_) {
		try {
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i_92_ >> 16);
			if (i != 1333491824)
				writeLong((byte) -38, -102L);
			anInt5917++;
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i_92_ >> 8);
			((Stream) this).buffer[((Stream) this).position++] = (byte) i_92_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.SA(" + i + ','
					+ i_92_ + ')');
		}
	}

	final String method2556(int i) {
		try {
			if (i <= 58)
				method2553((byte) 18, 113);
			anInt5932++;
			if (((Stream) this).buffer[((Stream) this).position] == 0) {
				((Stream) this).position++;
				return null;
			}
			return readString(-1);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.PC(" + i + ')');
		}
	}

	final int method2557(int i) {
		try {
			anInt5927++;
			int i_93_ = 0;
			int i_94_ = readSmart(-21);
			while (i_94_ == 32767) {
				i_94_ = readSmart(i ^ ~0x7c);
				i_93_ += 32767;
			}
			i_93_ += i_94_;
			if (i != -2)
				return -52;
			return i_93_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.OA(" + i + ')');
		}
	}

	final int method2558(boolean bool) {
		try {
			if (bool != false)
				encryptXTEA(-119, null, 16, -6);
			anInt5903++;
			((Stream) this).position += 3;
			return (((((Stream) this).buffer[((Stream) this).position - 1]) & 0xff) + ((((((Stream) this).buffer[-2
					+ ((Stream) this).position]) & 0xff) << 8) + ((0xff & (((Stream) this).buffer[-3
					+ ((Stream) this).position])) << 16)));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.DA(" + bool + ')');
		}
	}

	final int readUnsignedShort(byte i) {
		try {
			anInt5894++;
			((Stream) this).position += 2;
			if (i != -65)
				return -101;
			return ((0xff00 & (((Stream) this).buffer[-2
					+ ((Stream) this).position]) << 8) - -((((Stream) this).buffer[((Stream) this).position - 1]) & 0xff));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ee.FC(" + i + ')');
		}
	}
}
