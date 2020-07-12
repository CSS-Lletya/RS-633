/* Class111 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class111 {
	private byte aByte1511;
	static int anInt1512;
	int anInt1513;
	static int anInt1514;
	static Class22 aClass22_1515 = new Class22(64);
	static int anInt1516;
	static int anInt1517;
	int anInt1518;
	int anInt1519;
	int anInt1520;
	static int anInt1521;
	static Class213 aClass213_1522 = new Class213(4);
	int anInt1523;
	static Interface11[] anInterface11Array1524;

	final int method743(int i) {
		try {
			int i_0_ = 28 / ((77 - i) / 47);
			anInt1512++;
			if ((0x8 & aByte1511) != 8)
				return 0;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "df.D(" + i + ')');
		}
	}

	public static void method744(int i) {
		try {
			if (i != -1)
				anInterface11Array1524 = null;
			aClass213_1522 = null;
			anInterface11Array1524 = null;
			aClass22_1515 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "df.C(" + i + ')');
		}
	}

	static final void method745(int i, int i_1_, byte i_2_, boolean bool,
			boolean bool_3_) {
		try {
			Class58_Sub2.method3153(i, i_1_, 28048, bool, -1
					+ Class65.aClass195_Sub1Array940.length, bool_3_, 0);
			anInt1514++;
			Class362.anInt4716 = 0;
			if (i_2_ <= 52)
				method744(39);
			Class11_Sub25.aClass11_Sub31_6280 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("df.A(" + i + ','
					+ i_1_ + ',' + i_2_ + ',' + bool + ',' + bool_3_ + ')'));
		}
	}

	static final Class274 method746(byte[] is, int i,
			Class163_Sub2_Sub1 class163_sub2_sub1, int i_4_) {
		try {
			anInt1521++;
			if (i_4_ != 1625554944)
				aClass22_1515 = null;
			if (is == null || is.length == 0)
				return null;
			long l = OpenGL.glCreateShaderObjectARB(i);
			OpenGL.glShaderSourceRawARB(l, is);
			OpenGL.glCompileShaderARB(l);
			OpenGL.glGetObjectParameterivARB(l, 35713, Class84.anIntArray1145,
					0);
			if ((Class84.anIntArray1145[0] ^ 0xffffffff) == -1) {
				if ((Class84.anIntArray1145[0] ^ 0xffffffff) == -1)
					System.out.println("Shader compile failed:");
				OpenGL.glGetObjectParameterivARB(l, 35716,
						Class84.anIntArray1145, 1);
				if ((Class84.anIntArray1145[1] ^ 0xffffffff) < -2) {
					byte[] is_5_ = new byte[Class84.anIntArray1145[1]];
					OpenGL.glGetInfoLogARB(l, Class84.anIntArray1145[1],
							Class84.anIntArray1145, 0, is_5_, 0);
					System.out.println(new String(is_5_));
				}
				if ((Class84.anIntArray1145[0] ^ 0xffffffff) == -1) {
					OpenGL.glDeleteObjectARB(l);
					return null;
				}
			}
			return new Class274(class163_sub2_sub1, l, i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("df.E("
					+ (is != null ? "{...}" : "null") + ',' + i + ','
					+ (class163_sub2_sub1 != null ? "{...}" : "null") + ','
					+ i_4_ + ')'));
		}
	}

	static final boolean method747(Class338 class338, int i, int i_6_,
			int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_,
			int i_13_, int i_14_, int i_15_) {
		try {
			anInt1516++;
			int i_16_ = i_11_;
			int i_17_ = i_9_;
			int i_18_ = 64;
			int i_19_ = 64;
			int i_20_ = i_11_ - i_18_;
			int i_21_ = -i_19_ + i_9_;
			Class275.anIntArrayArray3703[i_18_][i_19_] = 99;
			Class183.anIntArrayArray2364[i_18_][i_19_] = 0;
			int i_22_ = 0;
			int i_23_ = i_13_;
			Class275.anIntArray3706[i_22_] = i_16_;
			Class299.anIntArray4038[i_22_++] = i_17_;
			int[][] is = ((Class338) class338).anIntArrayArray4459;
			while_18_: while (i_22_ != i_23_) {
				i_17_ = Class299.anIntArray4038[i_23_];
				i_16_ = Class275.anIntArray3706[i_23_];
				i_19_ = i_17_ + -i_21_;
				i_18_ = i_16_ + -i_20_;
				i_23_ = 0xfff & i_23_ + 1;
				int i_24_ = i_16_ - ((Class338) class338).anInt4470;
				int i_25_ = i_17_ + -((Class338) class338).anInt4465;
				int i_26_ = i_8_;
				while_10_: do {
					while_9_: do {
						while_8_: do {
							while_7_: do {
								do {
									if ((i_26_ ^ 0xffffffff) != 3) {
										if (i_26_ != -3) {
											if ((i_26_ ^ 0xffffffff) != 1) {
												if (i_26_ != -1) {
													if (i_26_ == 0
															|| i_26_ == 1
															|| (i_26_ ^ 0xffffffff) == -3
															|| (i_26_ ^ 0xffffffff) == -4
															|| i_26_ == 9)
														break while_8_;
													break while_9_;
												}
											} else
												break;
											break while_7_;
										}
									} else {
										if (i_16_ == i_12_
												&& ((i_14_ ^ 0xffffffff) == (i_17_ ^ 0xffffffff))) {
											Class189.anInt2435 = i_17_;
											Class304.anInt4094 = i_16_;
											return true;
										}
										break while_10_;
									}
									if (Class11_Sub3.method2284(i_6_, i_12_,
											i_7_, i_17_, i, true, i_7_, i_16_,
											i_14_)) {
										Class189.anInt2435 = i_17_;
										Class304.anInt4094 = i_16_;
										return true;
									}
									break while_10_;
								} while (false);
								if (class338.method2039(i, i_6_, i_7_, i_17_,
										i_12_, -1, i_7_, i_14_, i_10_, i_16_)) {
									Class189.anInt2435 = i_17_;
									Class304.anInt4094 = i_16_;
									return true;
								}
								break while_10_;
							} while (false);
							if (class338.method2038(i_16_, i, i_6_, i_17_,
									i_14_, i_7_, i_12_, i_10_, false)) {
								Class304.anInt4094 = i_16_;
								Class189.anInt2435 = i_17_;
								return true;
							}
							break while_10_;
						} while (false);
						if (class338.method2045(i_16_, i_17_, i_12_, i_7_,
								i_8_, i_14_, i_15_, i_13_ - 1)) {
							Class304.anInt4094 = i_16_;
							Class189.anInt2435 = i_17_;
							return true;
						}
						break while_10_;
					} while (false);
					if (class338.method2042(i_14_, i_12_, i_15_, i_16_, i_17_,
							(byte) 100, i_8_, i_7_)) {
						Class189.anInt2435 = i_17_;
						Class304.anInt4094 = i_16_;
						return true;
					}
				} while (false);
				i_26_ = 1 + Class183.anIntArrayArray2364[i_18_][i_19_];
				while_11_: do {
					if (i_18_ > 0
							&& (Class275.anIntArrayArray3703[-1 + i_18_][i_19_] ^ 0xffffffff) == -1
							&& ((is[-1 + i_24_][i_25_] & 0x43a40000 ^ 0xffffffff) == -1)
							&& (0x4e240000 & is[-1 + i_24_][i_7_ + i_25_ - 1] ^ 0xffffffff) == -1) {
						for (int i_27_ = 1; -1 + i_7_ > i_27_; i_27_++) {
							if ((0x4fa40000 & is[-1 + i_24_][i_25_ + i_27_]) != 0)
								break while_11_;
						}
						Class275.anIntArray3706[i_22_] = i_16_ - 1;
						Class299.anIntArray4038[i_22_] = i_17_;
						Class275.anIntArrayArray3703[-1 + i_18_][i_19_] = 2;
						i_22_ = 0xfff & 1 + i_22_;
						Class183.anIntArrayArray2364[-1 + i_18_][i_19_] = i_26_;
					}
				} while (false);
				while_12_: do {
					if (i_18_ < 128 - i_7_
							&& (Class275.anIntArrayArray3703[1 + i_18_][i_19_] ^ 0xffffffff) == -1
							&& (is[i_7_ + i_24_][i_25_] & 0x60e40000) == 0
							&& (is[i_24_ + i_7_][i_25_ + (i_7_ - 1)] & 0x78240000 ^ 0xffffffff) == -1) {
						for (int i_28_ = 1; (i_28_ ^ 0xffffffff) > (-1 + i_7_ ^ 0xffffffff); i_28_++) {
							if ((0x78e40000 & is[i_24_ - -i_7_][i_25_ + i_28_] ^ 0xffffffff) != -1)
								break while_12_;
						}
						Class275.anIntArray3706[i_22_] = 1 + i_16_;
						Class299.anIntArray4038[i_22_] = i_17_;
						Class275.anIntArrayArray3703[1 + i_18_][i_19_] = 8;
						i_22_ = i_22_ + 1 & 0xfff;
						Class183.anIntArrayArray2364[1 + i_18_][i_19_] = i_26_;
					}
				} while (false);
				while_13_: do {
					if ((i_19_ ^ 0xffffffff) < -1
							&& Class275.anIntArrayArray3703[i_18_][i_19_ - 1] == 0
							&& ((is[i_24_][i_25_ - 1] & 0x43a40000 ^ 0xffffffff) == -1)
							&& ((is[i_24_ - -i_7_ - 1][-1 + i_25_] & 0x60e40000) == 0)) {
						for (int i_29_ = 1; i_29_ < i_7_ - 1; i_29_++) {
							if ((is[i_29_ + i_24_][-1 + i_25_] & 0x63e40000) != 0)
								break while_13_;
						}
						Class275.anIntArray3706[i_22_] = i_16_;
						Class299.anIntArray4038[i_22_] = -1 + i_17_;
						Class275.anIntArrayArray3703[i_18_][-1 + i_19_] = 1;
						i_22_ = 0xfff & i_22_ + 1;
						Class183.anIntArrayArray2364[i_18_][-1 + i_19_] = i_26_;
					}
				} while (false);
				while_14_: do {
					if ((128 - i_7_ ^ 0xffffffff) < (i_19_ ^ 0xffffffff)
							&& (Class275.anIntArrayArray3703[i_18_][i_19_ + 1] ^ 0xffffffff) == -1
							&& ((0x4e240000 & is[i_24_][i_7_ + i_25_] ^ 0xffffffff) == -1)
							&& ((0x78240000 & is[-1 + i_24_ + i_7_][i_25_
									- -i_7_]) == 0)) {
						for (int i_30_ = 1; (i_30_ ^ 0xffffffff) > (-1 + i_7_ ^ 0xffffffff); i_30_++) {
							if ((is[i_24_ + i_30_][i_7_ + i_25_] & 0x7e240000) != 0)
								break while_14_;
						}
						Class275.anIntArray3706[i_22_] = i_16_;
						Class299.anIntArray4038[i_22_] = i_17_ + 1;
						i_22_ = i_22_ + 1 & 0xfff;
						Class275.anIntArrayArray3703[i_18_][1 + i_19_] = 4;
						Class183.anIntArrayArray2364[i_18_][i_19_ + 1] = i_26_;
					}
				} while (false);
				while_15_: do {
					if (i_18_ > 0
							&& (i_19_ ^ 0xffffffff) < -1
							&& (Class275.anIntArrayArray3703[i_18_ - 1][-1
									+ i_19_] == 0)
							&& (0x43a40000 & is[-1 + i_24_][-1 + i_25_] ^ 0xffffffff) == -1) {
						for (int i_31_ = 1; (i_31_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff); i_31_++) {
							if (((is[-1 + i_24_][i_25_ - (1 + -i_31_)] & 0x4fa40000) ^ 0xffffffff) != -1
									|| ((is[i_31_ + (i_24_ - 1)][-1 + i_25_] & 0x63e40000) ^ 0xffffffff) != -1)
								break while_15_;
						}
						Class275.anIntArray3706[i_22_] = i_16_ - 1;
						Class299.anIntArray4038[i_22_] = i_17_ - 1;
						Class275.anIntArrayArray3703[i_18_ - 1][-1 + i_19_] = 3;
						i_22_ = 0xfff & i_22_ + 1;
						Class183.anIntArrayArray2364[-1 + i_18_][-1 + i_19_] = i_26_;
					}
				} while (false);
				while_16_: do {
					if ((i_18_ ^ 0xffffffff) > (-i_7_ + 128 ^ 0xffffffff)
							&& (i_19_ ^ 0xffffffff) < -1
							&& (Class275.anIntArrayArray3703[1 + i_18_][i_19_ - 1] == 0)
							&& (is[i_7_ + i_24_][-1 + i_25_] & 0x60e40000 ^ 0xffffffff) == -1) {
						for (int i_32_ = 1; i_32_ < i_7_; i_32_++) {
							if (((0x78e40000 & is[i_24_ - -i_7_][-1
									+ (i_25_ + i_32_)]) != 0)
									|| (0x63e40000 & is[i_32_ + i_24_][i_25_ - 1] ^ 0xffffffff) != -1)
								break while_16_;
						}
						Class275.anIntArray3706[i_22_] = 1 + i_16_;
						Class299.anIntArray4038[i_22_] = -1 + i_17_;
						Class275.anIntArrayArray3703[1 + i_18_][-1 + i_19_] = 9;
						i_22_ = i_22_ + 1 & 0xfff;
						Class183.anIntArrayArray2364[1 + i_18_][-1 + i_19_] = i_26_;
					}
				} while (false);
				while_17_: do {
					if (i_18_ > 0
							&& i_19_ < -i_7_ + 128
							&& (Class275.anIntArrayArray3703[-1 + i_18_][i_19_ + 1] == 0)
							&& (is[-1 + i_24_][i_7_ + i_25_] & 0x4e240000 ^ 0xffffffff) == -1) {
						for (int i_33_ = 1; (i_33_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff); i_33_++) {
							if ((is[i_24_ - 1][i_25_ - -i_33_] & 0x4fa40000 ^ 0xffffffff) != -1
									|| ((is[i_33_ - 1 + i_24_][i_25_ + i_7_] & 0x7e240000) ^ 0xffffffff) != -1)
								break while_17_;
						}
						Class275.anIntArray3706[i_22_] = -1 + i_16_;
						Class299.anIntArray4038[i_22_] = 1 + i_17_;
						i_22_ = 0xfff & i_22_ + 1;
						Class275.anIntArrayArray3703[-1 + i_18_][i_19_ + 1] = 6;
						Class183.anIntArrayArray2364[-1 + i_18_][1 + i_19_] = i_26_;
					}
				} while (false);
				if ((128 - i_7_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff)
						&& i_19_ < 128 - i_7_
						&& Class275.anIntArrayArray3703[1 + i_18_][i_19_ + 1] == 0
						&& (is[i_24_ - -i_7_][i_25_ + i_7_] & 0x78240000) == 0) {
					for (int i_34_ = 1; (i_34_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff); i_34_++) {
						if (((is[i_34_ + i_24_][i_25_ - -i_7_] & 0x7e240000) != 0)
								|| (is[i_7_ + i_24_][i_34_ + i_25_] & 0x78e40000 ^ 0xffffffff) != -1)
							continue while_18_;
					}
					Class275.anIntArray3706[i_22_] = i_16_ + 1;
					Class299.anIntArray4038[i_22_] = 1 + i_17_;
					Class275.anIntArrayArray3703[i_18_ + 1][1 + i_19_] = 12;
					i_22_ = 1 + i_22_ & 0xfff;
					Class183.anIntArrayArray2364[i_18_ + 1][1 + i_19_] = i_26_;
				}
			}
			Class189.anInt2435 = i_17_;
			Class304.anInt4094 = i_16_;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("df.B("
					+ (class338 != null ? "{...}" : "null") + ',' + i + ','
					+ i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_
					+ ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_
					+ ',' + i_15_ + ')'));
		}
	}

	final int method748(int i) {
		try {
			if (i != 4095)
				return -9;
			anInt1517++;
			return 0x7 & aByte1511;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "df.F(" + i + ')');
		}
	}

	public Class111() {
		/* empty */
	}

	Class111(Stream stream) {
		try {
			aByte1511 = stream.readByte(1854307120);
			((Class111) this).anInt1523 = stream.readUnsignedShort((byte) -65);
			((Class111) this).anInt1520 = stream.readInt(114);
			((Class111) this).anInt1513 = stream.readInt(113);
			((Class111) this).anInt1518 = stream.readInt(120);
			((Class111) this).anInt1519 = stream.readInt(120);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "df.<init>("
					+ (stream != null ? "{...}" : "null") + ')');
		}
	}
}
