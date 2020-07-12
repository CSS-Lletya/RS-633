/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class23 {
	private int anInt196;
	static int anInt197;
	byte[] aByteArray198;
	String[] aStringArray199 = new String[5];
	static int anInt200;
	private int anInt201 = -1;
	static int anInt202;
	int anInt203;
	int anInt204;
	int anInt205;
	boolean aBool206;
	int anInt207 = -1;
	int anInt208;
	static int anInt209;
	boolean aBool210;
	int anInt211;
	private Class213 aClass213_212;
	private int anInt213;
	static int anInt214;
	int anInt215;
	private int anInt216;
	static int anInt217;
	int anInt218;
	static int anInt219;
	int[] anIntArray220;
	private int anInt221;
	int anInt222;
	Class280 aClass280_223;
	int anInt224;
	int anInt225;
	static int anInt226;
	private int anInt227;
	static long[] aLongArray228 = new long[256];
	int anInt229;
	private int anInt230;
	int anInt231;
	static int anInt232;
	int anInt233;
	int anInt234;
	static int anInt235;
	String aString236;
	int anInt237;
	boolean aBool238;
	boolean aBool239;
	static int anInt240;
	int anInt241;
	int[] anIntArray242;
	private int anInt243;
	int anInt244;
	static int anInt245;
	int anInt246;
	String aString247;
	private int anInt248;
	static int anInt249;
	static int anInt250;
	static long aLong251;

	final int method195(int i, byte i_0_, int i_1_) {
		try {
			anInt214++;
			if (i_0_ >= -127)
				return 58;
			if (aClass213_212 == null)
				return i;
			Class11_Sub51 class11_sub51 = ((Class11_Sub51) aClass213_212
					.method1369((byte) 26, (long) i_1_));
			if (class11_sub51 == null)
				return i;
			return ((Class11_Sub51) class11_sub51).anInt8036;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("afa.L(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	final boolean method196(Interface20 interface20, int i) {
		try {
			anInt200++;
			int i_2_;
			if (anInt230 == -1) {
				if (anInt201 == -1)
					return true;
				i_2_ = interface20.method51(anInt201, i ^ 0x6945);
			} else
				i_2_ = interface20.method50(-1, anInt230);
			if (i != 2)
				anInt230 = -95;
			if (anInt221 > i_2_
					|| (anInt216 ^ 0xffffffff) > (i_2_ ^ 0xffffffff))
				return false;
			boolean bool = false;
			int i_3_;
			if ((anInt213 ^ 0xffffffff) == 0) {
				if ((anInt196 ^ 0xffffffff) == 0)
					return true;
				i_3_ = interface20.method51(anInt196, i + 26949);
			} else
				i_3_ = interface20.method50(-1, anInt213);
			if ((anInt248 ^ 0xffffffff) < (i_3_ ^ 0xffffffff)
					|| (i_3_ ^ 0xffffffff) < (anInt243 ^ 0xffffffff))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "afa.D("
					+ (interface20 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method197(byte i) {
		try {
			anInt219++;
			if (((Class23) this).anIntArray242 != null) {
				for (int i_4_ = 0; ((Class23) this).anIntArray242.length > i_4_; i_4_ += 2) {
					if (((Class23) this).anIntArray242[i_4_] < ((Class23) this).anInt234)
						((Class23) this).anInt234 = ((Class23) this).anIntArray242[i_4_];
					else if ((((Class23) this).anIntArray242[i_4_] ^ 0xffffffff) < (((Class23) this).anInt225 ^ 0xffffffff))
						((Class23) this).anInt225 = ((Class23) this).anIntArray242[i_4_];
					if (((Class23) this).anIntArray242[i_4_ + 1] < ((Class23) this).anInt241)
						((Class23) this).anInt241 = ((Class23) this).anIntArray242[1 + i_4_];
					else if (((Class23) this).anInt204 < ((Class23) this).anIntArray242[i_4_ + 1])
						((Class23) this).anInt204 = ((Class23) this).anIntArray242[1 + i_4_];
				}
			}
			int i_5_ = 86 / ((i + 16) / 50);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "afa.C(" + i + ')');
		}
	}

	static final void method198(boolean bool, int i) {
		do {
			try {
				anInt235++;
				if (i != -257)
					method204(true);
				for (Class11_Sub19 class11_sub19 = ((Class11_Sub19) Class332.aClass84_4407
						.method584(-12261)); class11_sub19 != null; class11_sub19 = (Class11_Sub19) Class332.aClass84_4407
						.method578(-15361)) {
					if (((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830 != null) {
						Class233.aClass11_Sub6_Sub1_3185
								.method3464(((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830);
						((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830 = null;
					}
					if (((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5838 != null) {
						Class233.aClass11_Sub6_Sub1_3185
								.method3464(((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5838);
						((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5838 = null;
					}
					class11_sub19.method122(i + 215);
				}
				if (!bool)
					break;
				for (Class11_Sub19 class11_sub19 = ((Class11_Sub19) Class339.aClass84_4487
						.method584(i - 12004)); class11_sub19 != null; class11_sub19 = ((Class11_Sub19) Class339.aClass84_4487
						.method578(i - 15104))) {
					if (((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830 != null) {
						Class233.aClass11_Sub6_Sub1_3185
								.method3464(((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830);
						((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830 = null;
					}
					class11_sub19.method122(-88);
				}
				for (Class11_Sub19 class11_sub19 = ((Class11_Sub19) Class151.aClass213_2009
						.method1365(i + 24747)); class11_sub19 != null; class11_sub19 = ((Class11_Sub19) Class151.aClass213_2009
						.method1367((byte) 71))) {
					if (((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830 != null) {
						Class233.aClass11_Sub6_Sub1_3185
								.method3464(((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830);
						((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830 = null;
					}
					class11_sub19.method122(-35);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "afa.I(" + bool
						+ ',' + i + ')');
			}
			break;
		} while (false);
	}

	final void method199(Stream stream, int i) {
		do {
			try {
				for (;;) {
					int i_6_ = stream.readUnsignedByte((byte) 35);
					if (i_6_ == 0)
						break;
					method200((byte) 86, i_6_, stream);
				}
				anInt232++;
				if (i == -1961)
					break;
				anInt213 = 106;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("afa.K("
						+ (stream != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	private final void method200(byte i, int i_7_, Stream stream) {
		try {
			if ((i_7_ ^ 0xffffffff) == -2)
				((Class23) this).anInt203 = stream
						.readUnsignedShort((byte) -65);
			else if (i_7_ != 2) {
				if ((i_7_ ^ 0xffffffff) == -4)
					((Class23) this).aString247 = stream.readString(-1);
				else if (i_7_ == 4)
					((Class23) this).anInt246 = stream.method2558(false);
				else if (i_7_ == 5)
					((Class23) this).anInt244 = stream.method2558(false);
				else if (i_7_ != 6) {
					if (i_7_ == 7) {
						int i_8_ = stream.readUnsignedByte((byte) 35);
						if ((0x1 & i_8_ ^ 0xffffffff) == -1)
							((Class23) this).aBool238 = false;
						if ((0x2 & i_8_ ^ 0xffffffff) == -3)
							((Class23) this).aBool210 = true;
					} else if ((i_7_ ^ 0xffffffff) == -9)
						((Class23) this).aBool239 = stream
								.readUnsignedByte((byte) 35) == 1;
					else if (i_7_ == 9) {
						anInt201 = stream.readUnsignedShort((byte) -65);
						if (anInt201 == 65535)
							anInt201 = -1;
						anInt230 = stream.readUnsignedShort((byte) -65);
						if ((anInt230 ^ 0xffffffff) == -65536)
							anInt230 = -1;
						anInt221 = stream.readInt(115);
						anInt216 = stream.readInt(127);
					} else if ((i_7_ ^ 0xffffffff) > -11 || i_7_ > 14) {
						if (i_7_ == 15) {
							int i_9_ = stream.readUnsignedByte((byte) 35);
							((Class23) this).anIntArray242 = new int[i_9_ * 2];
							for (int i_10_ = 0; ((i_9_ * 2 ^ 0xffffffff) < (i_10_ ^ 0xffffffff)); i_10_++)
								((Class23) this).anIntArray242[i_10_] = stream
										.method2508((byte) 67);
							((Class23) this).anInt231 = stream.readInt(123);
							int i_11_ = stream.readUnsignedByte((byte) 35);
							((Class23) this).anIntArray220 = new int[i_11_];
							for (int i_12_ = 0; i_12_ < ((Class23) this).anIntArray220.length; i_12_++)
								((Class23) this).anIntArray220[i_12_] = stream
										.readInt(121);
							((Class23) this).aByteArray198 = new byte[i_9_];
							for (int i_13_ = 0; i_13_ < i_9_; i_13_++)
								((Class23) this).aByteArray198[i_13_] = stream
										.readByte(1854307120);
						} else if ((i_7_ ^ 0xffffffff) != -17) {
							if ((i_7_ ^ 0xffffffff) == -18)
								((Class23) this).aString236 = stream
										.readString(-1);
							else if ((i_7_ ^ 0xffffffff) == -19)
								anInt227 = stream.readUnsignedShort((byte) -65);
							else if (i_7_ != 19) {
								if (i_7_ != 20) {
									if (i_7_ != 21) {
										if ((i_7_ ^ 0xffffffff) == -23)
											((Class23) this).anInt229 = stream
													.readInt(98);
										else if ((i_7_ ^ 0xffffffff) == -24) {
											((Class23) this).anInt215 = stream
													.readUnsignedByte((byte) 35);
											((Class23) this).anInt222 = stream
													.readUnsignedByte((byte) 35);
											((Class23) this).anInt237 = stream
													.readUnsignedByte((byte) 35);
										} else if (i_7_ != 24) {
											if (i_7_ == 249) {
												int i_14_ = (stream
														.readUnsignedByte((byte) 35));
												if (aClass213_212 == null) {
													int i_15_ = (Class11_Sub2_Sub33
															.method3808(117,
																	i_14_));
													aClass213_212 = new Class213(
															i_15_);
												}
												for (int i_16_ = 0; i_14_ > i_16_; i_16_++) {
													boolean bool = ((stream
															.readUnsignedByte((byte) 35)) == 1);
													int i_17_ = (stream
															.method2558(false));
													Class11 class11;
													if (bool)
														class11 = (new Class11_Sub3(
																stream.readString(-1)));
													else
														class11 = (new Class11_Sub51(
																stream.readInt(101)));
													aClass213_212
															.method1368(
																	(long) i_17_,
																	class11,
																	(byte) -26);
												}
											}
										} else {
											((Class23) this).anInt211 = stream
													.method2508((byte) -92);
											((Class23) this).anInt218 = stream
													.method2508((byte) -86);
										}
									} else
										((Class23) this).anInt224 = stream
												.readInt(110);
								} else {
									anInt196 = stream
											.readUnsignedShort((byte) -65);
									if ((anInt196 ^ 0xffffffff) == -65536)
										anInt196 = -1;
									anInt213 = stream
											.readUnsignedShort((byte) -65);
									if (anInt213 == 65535)
										anInt213 = -1;
									anInt248 = stream.readInt(103);
									anInt243 = stream.readInt(107);
								}
							} else
								((Class23) this).anInt207 = stream
										.readUnsignedShort((byte) -65);
						} else
							((Class23) this).aBool206 = false;
					} else
						((Class23) this).aStringArray199[-10 + i_7_] = stream
								.readString(-1);
				} else
					((Class23) this).anInt208 = stream
							.readUnsignedByte((byte) 35);
			} else
				((Class23) this).anInt205 = stream
						.readUnsignedShort((byte) -65);
			if (i <= 40)
				method203(null, (byte) -12, true);
			anInt217++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("afa.A(" + i + ','
					+ i_7_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	final String method201(byte i, String string, int i_18_) {
		try {
			anInt197++;
			if (aClass213_212 == null)
				return string;
			if (i >= -62)
				((Class23) this).anInt246 = 25;
			Class11_Sub3 class11_sub3 = ((Class11_Sub3) aClass213_212
					.method1369((byte) 26, (long) i_18_));
			if (class11_sub3 == null)
				return string;
			return ((Class11_Sub3) class11_sub3).aString5110;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("afa.H(" + i + ','
					+ (string != null ? "{...}" : "null") + ',' + i_18_ + ')'));
		}
	}

	final Class253 method202(Class163 class163, int i) {
		try {
			anInt226++;
			Class253 class253 = ((Class253) (((Class280) ((Class23) this).aClass280_223).aClass22_3785
					.method188(
							(long) (anInt227 | i | ((Class163) class163).anInt2103 << 29),
							(byte) 120)));
			if (class253 != null)
				return class253;
			((Class280) ((Class23) this).aClass280_223).aClass146_3782
					.method918(anInt227, -111);
			Class80 class80 = Class80
					.method545(
							(((Class280) (((Class23) this).aClass280_223)).aClass146_3782),
							anInt227, 0);
			if (class80 != null) {
				class253 = class163.method1081(class80, true);
				((Class280) ((Class23) this).aClass280_223).aClass22_3785
						.method184(
								(byte) 127,
								class253,
								(long) (0x20000 | anInt227 | ((Class163) class163).anInt2103 << 29));
			}
			return class253;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "afa.B("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final Class253 method203(Class163 class163, byte i, boolean bool) {
		try {
			anInt202++;
			int i_19_ = bool ? ((Class23) this).anInt205
					: ((Class23) this).anInt203;
			if (i >= -5)
				((Class23) this).anInt233 = 89;
			int i_20_ = ((Class163) class163).anInt2103 << 29 | i_19_;
			Class253 class253 = ((Class253) ((Class280) ((Class23) this).aClass280_223).aClass22_3785
					.method188((long) i_20_, (byte) 79));
			if (class253 != null)
				return class253;
			if (!((Class280) ((Class23) this).aClass280_223).aClass146_3782
					.method918(i_19_, -51))
				return null;
			Class80 class80 = Class80
					.method545(
							(((Class280) (((Class23) this).aClass280_223)).aClass146_3782),
							i_19_, 0);
			if (class80 != null) {
				class253 = class163.method1081(class80, true);
				((Class280) ((Class23) this).aClass280_223).aClass22_3785
						.method184((byte) 124, class253, (long) i_20_);
			}
			return class253;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("afa.E("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ bool + ')'));
		}
	}

	public static void method204(boolean bool) {
		do {
			try {
				aLongArray228 = null;
				if (bool == false)
					break;
				method205(92, null, (byte) -3);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "afa.J(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	static final boolean method205(int i, Class203 class203, byte i_21_) {
		try {
			anInt209++;
			Class236_Sub8.aClass33_7069.method295(
					((Class203) class203).anIntArray2724[i],
					((Class203) class203).anIntArray2734[i],
					((Class203) class203).anIntArray2725[i],
					Class303.anIntArray4086);
			int i_22_ = Class303.anIntArray4086[2];
			if ((i_22_ ^ 0xffffffff) > -51)
				return false;
			((Class203) class203).aShortArray2726[i] = (short) (Class228.anInt3151 + (Class71.anInt997
					* Class303.anIntArray4086[0] / i_22_));
			((Class203) class203).aShortArray2732[i] = (short) (Class323.anInt4320 + (Class303.anIntArray4086[1]
					* Class11_Sub2_Sub33.anInt9669 / i_22_));
			((Class203) class203).aShortArray2735[i] = (short) i_22_;
			if (i_21_ != -83)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("afa.F(" + i + ',' + (class203 != null ? "{...}" : "null")
							+ ',' + i_21_ + ')'));
		}
	}

	static final void method206(int i, int i_23_) {
		try {
			anInt240++;
			Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(i
					^ ~0x26ea0991, i, i_23_);
			class11_sub45_sub15.method3660(0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "afa.G(" + i + ','
					+ i_23_ + ')');
		}
	}

	public Class23() {
		((Class23) this).aBool206 = true;
		((Class23) this).anInt204 = -2147483648;
		((Class23) this).anInt222 = -1;
		anInt230 = -1;
		((Class23) this).aBool210 = false;
		((Class23) this).anInt205 = -1;
		((Class23) this).anInt203 = -1;
		anInt196 = -1;
		((Class23) this).aBool238 = true;
		((Class23) this).aBool239 = true;
		((Class23) this).anInt225 = -2147483648;
		((Class23) this).anInt237 = -1;
		anInt213 = -1;
		((Class23) this).anInt234 = 2147483647;
		((Class23) this).anInt244 = -1;
		((Class23) this).anInt215 = -1;
		anInt227 = -1;
		((Class23) this).anInt208 = 0;
		((Class23) this).anInt241 = 2147483647;
	}

	static {
		for (int i = 0; (i ^ 0xffffffff) > -257; i++) {
			long l = (long) i;
			for (int i_24_ = 0; i_24_ < 8; i_24_++) {
				if ((0x1L & l ^ 0xffffffffffffffffL) != -2L)
					l >>>= 1;
				else
					l = ~0x3693a86a2878f0bdL ^ l >>> 1;
			}
			aLongArray228[i] = l;
		}
		anInt249 = 0;
		aLong251 = 0L;
	}
}
