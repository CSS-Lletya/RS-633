/* Class338 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

final class Class338 {
	static int anInt4458;
	int[][] anIntArrayArray4459;
	static int anInt4460;
	static int anInt4461;
	static int anInt4462;
	static int anInt4463;
	static int anInt4464;
	int anInt4465;
	static int anInt4466;
	static int anInt4467;
	int anInt4468;
	static int anInt4469;
	int anInt4470;
	static int anInt4471;
	static int anInt4472;
	static int anInt4473;
	static int anInt4474;
	int anInt4475;
	static int anInt4476;
	static int anInt4477;
	static Class79 aClass79_4478 = new Class79(6, 0, 4, 2);
	static int anInt4479;
	static int anInt4480;

	final void method2030(int i, int i_0_, int i_1_, int i_2_, boolean bool,
			int i_3_, boolean bool_4_) {
		do {
			try {
				i_1_ -= ((Class338) this).anInt4465;
				anInt4477++;
				i -= ((Class338) this).anInt4470;
				if ((i_3_ ^ 0xffffffff) == -1) {
					if (i_0_ == 0) {
						method2035(128, i_1_, (byte) 68, i);
						method2035(8, i_1_, (byte) 68, i - 1);
					}
					if (i_0_ == 1) {
						method2035(2, i_1_, (byte) 68, i);
						method2035(32, i_1_ + 1, (byte) 68, i);
					}
					if ((i_0_ ^ 0xffffffff) == -3) {
						method2035(8, i_1_, (byte) 68, i);
						method2035(128, i_1_, (byte) 68, i + 1);
					}
					if (i_0_ == 3) {
						method2035(32, i_1_, (byte) 68, i);
						method2035(2, -1 + i_1_, (byte) 68, i);
					}
				}
				if (i_2_ == i_3_ || i_3_ == 3) {
					if (i_0_ == 0) {
						method2035(1, i_1_, (byte) 68, i);
						method2035(16, 1 + i_1_, (byte) 68, i - 1);
					}
					if ((i_0_ ^ 0xffffffff) == -2) {
						method2035(4, i_1_, (byte) 68, i);
						method2035(64, 1 + i_1_, (byte) 68, i + 1);
					}
					if ((i_0_ ^ 0xffffffff) == -3) {
						method2035(16, i_1_, (byte) 68, i);
						method2035(1, -1 + i_1_, (byte) 68, i + 1);
					}
					if ((i_0_ ^ 0xffffffff) == -4) {
						method2035(64, i_1_, (byte) 68, i);
						method2035(4, i_1_ - 1, (byte) 68, -1 + i);
					}
				}
				if (i_3_ == 2) {
					if ((i_0_ ^ 0xffffffff) == -1) {
						method2035(130, i_1_, (byte) 68, i);
						method2035(8, i_1_, (byte) 68, -1 + i);
						method2035(32, i_1_ + 1, (byte) 68, i);
					}
					if (i_0_ == 1) {
						method2035(10, i_1_, (byte) 68, i);
						method2035(32, 1 + i_1_, (byte) 68, i);
						method2035(128, i_1_, (byte) 68, i + 1);
					}
					if ((i_0_ ^ 0xffffffff) == -3) {
						method2035(40, i_1_, (byte) 68, i);
						method2035(128, i_1_, (byte) 68, i + 1);
						method2035(2, -1 + i_1_, (byte) 68, i);
					}
					if (i_0_ == 3) {
						method2035(160, i_1_, (byte) 68, i);
						method2035(2, -1 + i_1_, (byte) 68, i);
						method2035(8, i_1_, (byte) 68, i - 1);
					}
				}
				if (bool_4_) {
					if (i_3_ == 0) {
						if ((i_0_ ^ 0xffffffff) == -1) {
							method2035(65536, i_1_, (byte) 68, i);
							method2035(4096, i_1_, (byte) 68, i - 1);
						}
						if (i_0_ == 1) {
							method2035(1024, i_1_, (byte) 68, i);
							method2035(16384, 1 + i_1_, (byte) 68, i);
						}
						if (i_0_ == 2) {
							method2035(4096, i_1_, (byte) 68, i);
							method2035(65536, i_1_, (byte) 68, i + 1);
						}
						if ((i_0_ ^ 0xffffffff) == -4) {
							method2035(16384, i_1_, (byte) 68, i);
							method2035(1024, i_1_ - 1, (byte) 68, i);
						}
					}
					if ((i_3_ ^ 0xffffffff) == -2 || i_3_ == 3) {
						if (i_0_ == 0) {
							method2035(512, i_1_, (byte) 68, i);
							method2035(8192, i_1_ + 1, (byte) 68, i - 1);
						}
						if (i_0_ == 1) {
							method2035(2048, i_1_, (byte) 68, i);
							method2035(32768, 1 + i_1_, (byte) 68, i + 1);
						}
						if ((i_0_ ^ 0xffffffff) == -3) {
							method2035(8192, i_1_, (byte) 68, i);
							method2035(512, -1 + i_1_, (byte) 68, 1 + i);
						}
						if ((i_0_ ^ 0xffffffff) == -4) {
							method2035(32768, i_1_, (byte) 68, i);
							method2035(2048, -1 + i_1_, (byte) 68, -1 + i);
						}
					}
					if ((i_3_ ^ 0xffffffff) == -3) {
						if (i_0_ == 0) {
							method2035(66560, i_1_, (byte) 68, i);
							method2035(4096, i_1_, (byte) 68, i - 1);
							method2035(16384, i_1_ + 1, (byte) 68, i);
						}
						if (i_0_ == 1) {
							method2035(5120, i_1_, (byte) 68, i);
							method2035(16384, 1 + i_1_, (byte) 68, i);
							method2035(65536, i_1_, (byte) 68, 1 + i);
						}
						if (i_0_ == 2) {
							method2035(20480, i_1_, (byte) 68, i);
							method2035(65536, i_1_, (byte) 68, i + 1);
							method2035(1024, -1 + i_1_, (byte) 68, i);
						}
						if ((i_0_ ^ 0xffffffff) == -4) {
							method2035(81920, i_1_, (byte) 68, i);
							method2035(1024, -1 + i_1_, (byte) 68, i);
							method2035(4096, i_1_, (byte) 68, -1 + i);
						}
					}
				}
				if (!bool)
					break;
				if ((i_3_ ^ 0xffffffff) == -1) {
					if ((i_0_ ^ 0xffffffff) == -1) {
						method2035(536870912, i_1_, (byte) 68, i);
						method2035(33554432, i_1_, (byte) 68, i - 1);
					}
					if ((i_0_ ^ 0xffffffff) == -2) {
						method2035(8388608, i_1_, (byte) 68, i);
						method2035(134217728, 1 + i_1_, (byte) 68, i);
					}
					if (i_0_ == 2) {
						method2035(33554432, i_1_, (byte) 68, i);
						method2035(536870912, i_1_, (byte) 68, i + 1);
					}
					if ((i_0_ ^ 0xffffffff) == -4) {
						method2035(134217728, i_1_, (byte) 68, i);
						method2035(8388608, i_1_ - 1, (byte) 68, i);
					}
				}
				if (i_3_ == 1 || (i_3_ ^ 0xffffffff) == -4) {
					if (i_0_ == 0) {
						method2035(4194304, i_1_, (byte) 68, i);
						method2035(67108864, i_1_ + 1, (byte) 68, -1 + i);
					}
					if (i_0_ == 1) {
						method2035(16777216, i_1_, (byte) 68, i);
						method2035(268435456, 1 + i_1_, (byte) 68, i + 1);
					}
					if ((i_0_ ^ 0xffffffff) == -3) {
						method2035(67108864, i_1_, (byte) 68, i);
						method2035(4194304, i_1_ - 1, (byte) 68, 1 + i);
					}
					if ((i_0_ ^ 0xffffffff) == -4) {
						method2035(268435456, i_1_, (byte) 68, i);
						method2035(16777216, i_1_ - 1, (byte) 68, -1 + i);
					}
				}
				if (i_3_ != 2)
					break;
				if (i_0_ == 0) {
					method2035(545259520, i_1_, (byte) 68, i);
					method2035(33554432, i_1_, (byte) 68, i - 1);
					method2035(134217728, 1 + i_1_, (byte) 68, i);
				}
				if (i_0_ == 1) {
					method2035(41943040, i_1_, (byte) 68, i);
					method2035(134217728, i_1_ + 1, (byte) 68, i);
					method2035(536870912, i_1_, (byte) 68, i + 1);
				}
				if ((i_0_ ^ 0xffffffff) == -3) {
					method2035(167772160, i_1_, (byte) 68, i);
					method2035(536870912, i_1_, (byte) 68, 1 + i);
					method2035(8388608, -1 + i_1_, (byte) 68, i);
				}
				if ((i_0_ ^ 0xffffffff) != -4)
					break;
				method2035(671088640, i_1_, (byte) 68, i);
				method2035(8388608, i_1_ - 1, (byte) 68, i);
				method2035(33554432, i_1_, (byte) 68, i - 1);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("uu.L(" + i + ','
						+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + bool + ','
						+ i_3_ + ',' + bool_4_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2031(boolean bool, int i, byte i_5_, int i_6_, int i_7_,
			boolean bool_8_, int i_9_, int i_10_) {
		try {
			anInt4472++;
			int i_11_ = 256;
			if (bool_8_)
				i_11_ |= 0x20000;
			i -= ((Class338) this).anInt4465;
			i_6_ -= ((Class338) this).anInt4470;
			if (bool)
				i_11_ |= 0x40000000;
			if (i_7_ == 1 || (i_7_ ^ 0xffffffff) == -4) {
				int i_12_ = i_10_;
				i_10_ = i_9_;
				i_9_ = i_12_;
			}
			if (i_5_ < 31)
				((Class338) this).anInt4465 = -78;
			for (int i_13_ = i_6_; (i_13_ ^ 0xffffffff) > (i_10_ + i_6_ ^ 0xffffffff); i_13_++) {
				if (i_13_ >= 0
						&& ((((Class338) this).anInt4475 ^ 0xffffffff) < (i_13_ ^ 0xffffffff))) {
					for (int i_14_ = i; (i_14_ ^ 0xffffffff) > (i - -i_9_ ^ 0xffffffff); i_14_++) {
						if ((i_14_ ^ 0xffffffff) <= -1
								&& ((Class338) this).anInt4468 > i_14_)
							method2043(i_14_, i_13_, i_11_, false);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("uu.D(" + bool + ','
					+ i + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + bool_8_
					+ ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	final void method2032(int i, boolean bool, int i_15_, boolean bool_16_,
			int i_17_, int i_18_, int i_19_) {
		do {
			try {
				anInt4467++;
				i_15_ -= ((Class338) this).anInt4470;
				i_17_ -= ((Class338) this).anInt4465;
				if (i_18_ != 0)
					method2035(32, -1, (byte) 23, -98);
				if ((i_19_ ^ 0xffffffff) == -1) {
					if (i == 0) {
						method2043(i_17_, i_15_, 128, false);
						method2043(i_17_, i_15_ - 1, 8, false);
					}
					if ((i ^ 0xffffffff) == -2) {
						method2043(i_17_, i_15_, 2, false);
						method2043(1 + i_17_, i_15_, 32, false);
					}
					if (i == 2) {
						method2043(i_17_, i_15_, 8, false);
						method2043(i_17_, i_15_ + 1, 128, false);
					}
					if ((i ^ 0xffffffff) == -4) {
						method2043(i_17_, i_15_, 32, false);
						method2043(i_17_ - 1, i_15_, 2, false);
					}
				}
				if ((i_19_ ^ 0xffffffff) == -2 || (i_19_ ^ 0xffffffff) == -4) {
					if (i == 0) {
						method2043(i_17_, i_15_, 1, false);
						method2043(1 + i_17_, -1 + i_15_, 16, false);
					}
					if ((i ^ 0xffffffff) == -2) {
						method2043(i_17_, i_15_, 4, false);
						method2043(i_17_ + 1, i_15_ + 1, 64, false);
					}
					if (i == 2) {
						method2043(i_17_, i_15_, 16, false);
						method2043(i_17_ - 1, i_15_ + 1, 1, false);
					}
					if ((i ^ 0xffffffff) == -4) {
						method2043(i_17_, i_15_, 64, false);
						method2043(-1 + i_17_, -1 + i_15_, 4, false);
					}
				}
				if (i_19_ == 2) {
					if ((i ^ 0xffffffff) == -1) {
						method2043(i_17_, i_15_, 130, false);
						method2043(i_17_, i_15_ - 1, 8, false);
						method2043(1 + i_17_, i_15_, 32, false);
					}
					if ((i ^ 0xffffffff) == -2) {
						method2043(i_17_, i_15_, 10, false);
						method2043(i_17_ + 1, i_15_, 32, false);
						method2043(i_17_, 1 + i_15_, 128, false);
					}
					if ((i ^ 0xffffffff) == -3) {
						method2043(i_17_, i_15_, 40, false);
						method2043(i_17_, 1 + i_15_, 128, false);
						method2043(i_17_ - 1, i_15_, 2, false);
					}
					if ((i ^ 0xffffffff) == -4) {
						method2043(i_17_, i_15_, 160, false);
						method2043(i_17_ - 1, i_15_, 2, false);
						method2043(i_17_, -1 + i_15_, 8, false);
					}
				}
				if (bool) {
					if ((i_19_ ^ 0xffffffff) == -1) {
						if ((i ^ 0xffffffff) == -1) {
							method2043(i_17_, i_15_, 65536, false);
							method2043(i_17_, i_15_ - 1, 4096, false);
						}
						if ((i ^ 0xffffffff) == -2) {
							method2043(i_17_, i_15_, 1024, false);
							method2043(1 + i_17_, i_15_, 16384, false);
						}
						if ((i ^ 0xffffffff) == -3) {
							method2043(i_17_, i_15_, 4096, false);
							method2043(i_17_, 1 + i_15_, 65536, false);
						}
						if (i == 3) {
							method2043(i_17_, i_15_, 16384, false);
							method2043(i_17_ - 1, i_15_, 1024, false);
						}
					}
					if (i_19_ == 1 || (i_19_ ^ 0xffffffff) == -4) {
						if ((i ^ 0xffffffff) == -1) {
							method2043(i_17_, i_15_, 512, false);
							method2043(1 + i_17_, -1 + i_15_, 8192, false);
						}
						if ((i ^ 0xffffffff) == -2) {
							method2043(i_17_, i_15_, 2048, false);
							method2043(i_17_ + 1, 1 + i_15_, 32768, false);
						}
						if (i == 2) {
							method2043(i_17_, i_15_, 8192, false);
							method2043(i_17_ - 1, i_15_ + 1, 512, false);
						}
						if (i == 3) {
							method2043(i_17_, i_15_, 32768, false);
							method2043(i_17_ - 1, -1 + i_15_, 2048, false);
						}
					}
					if (i_19_ == 2) {
						if ((i ^ 0xffffffff) == -1) {
							method2043(i_17_, i_15_, 66560, false);
							method2043(i_17_, -1 + i_15_, 4096, false);
							method2043(1 + i_17_, i_15_, 16384, false);
						}
						if ((i ^ 0xffffffff) == -2) {
							method2043(i_17_, i_15_, 5120, false);
							method2043(1 + i_17_, i_15_, 16384, false);
							method2043(i_17_, 1 + i_15_, 65536, false);
						}
						if (i == 2) {
							method2043(i_17_, i_15_, 20480, false);
							method2043(i_17_, 1 + i_15_, 65536, false);
							method2043(i_17_ - 1, i_15_, 1024, false);
						}
						if ((i ^ 0xffffffff) == -4) {
							method2043(i_17_, i_15_, 81920, false);
							method2043(-1 + i_17_, i_15_, 1024, false);
							method2043(i_17_, -1 + i_15_, 4096, false);
						}
					}
				}
				if (!bool_16_)
					break;
				if (i_19_ == 0) {
					if (i == 0) {
						method2043(i_17_, i_15_, 536870912, false);
						method2043(i_17_, i_15_ - 1, 33554432, false);
					}
					if ((i ^ 0xffffffff) == -2) {
						method2043(i_17_, i_15_, 8388608, false);
						method2043(1 + i_17_, i_15_, 134217728, false);
					}
					if (i == 2) {
						method2043(i_17_, i_15_, 33554432, false);
						method2043(i_17_, 1 + i_15_, 536870912, false);
					}
					if ((i ^ 0xffffffff) == -4) {
						method2043(i_17_, i_15_, 134217728, false);
						method2043(i_17_ - 1, i_15_, 8388608, false);
					}
				}
				if ((i_19_ ^ 0xffffffff) == -2 || i_19_ == 3) {
					if (i == 0) {
						method2043(i_17_, i_15_, 4194304, false);
						method2043(1 + i_17_, -1 + i_15_, 67108864, false);
					}
					if (i == 1) {
						method2043(i_17_, i_15_, 16777216, false);
						method2043(1 + i_17_, i_15_ + 1, 268435456, false);
					}
					if ((i ^ 0xffffffff) == -3) {
						method2043(i_17_, i_15_, 67108864, false);
						method2043(i_17_ - 1, i_15_ + 1, 4194304, false);
					}
					if ((i ^ 0xffffffff) == -4) {
						method2043(i_17_, i_15_, 268435456, false);
						method2043(i_17_ - 1, -1 + i_15_, 16777216, false);
					}
				}
				if (i_19_ != 2)
					break;
				if ((i ^ 0xffffffff) == -1) {
					method2043(i_17_, i_15_, 545259520, false);
					method2043(i_17_, -1 + i_15_, 33554432, false);
					method2043(i_17_ + 1, i_15_, 134217728, false);
				}
				if (i == 1) {
					method2043(i_17_, i_15_, 41943040, false);
					method2043(1 + i_17_, i_15_, 134217728, false);
					method2043(i_17_, 1 + i_15_, 536870912, false);
				}
				if (i == 2) {
					method2043(i_17_, i_15_, 167772160, false);
					method2043(i_17_, 1 + i_15_, 536870912, false);
					method2043(-1 + i_17_, i_15_, 8388608, false);
				}
				if ((i ^ 0xffffffff) != -4)
					break;
				method2043(i_17_, i_15_, 671088640, false);
				method2043(i_17_ - 1, i_15_, 8388608, false);
				method2043(i_17_, i_15_ - 1, 33554432, false);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("uu.A(" + i + ','
						+ bool + ',' + i_15_ + ',' + bool_16_ + ',' + i_17_
						+ ',' + i_18_ + ',' + i_19_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2033(int i, int i_20_, boolean bool) {
		do {
			try {
				i_20_ -= ((Class338) this).anInt4470;
				i -= ((Class338) this).anInt4465;
				anInt4469++;
				((Class338) this).anIntArrayArray4459[i_20_][i] = Class173
						.method1134(
								(((Class338) this).anIntArrayArray4459[i_20_][i]),
								262144);
				if (bool == false)
					break;
				method2040(-105, true, -103);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("uu.I(" + i + ','
						+ i_20_ + ',' + bool + ')'));
			}
			break;
		} while (false);
	}

	static final Class217 method2034(int i, Socket socket, int i_21_)
			throws IOException {
		try {
			int i_22_ = 36 / ((-42 - i_21_) / 36);
			anInt4462++;
			return new Class217_Sub1(socket, i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("uu.B(" + i + ','
					+ (socket != null ? "{...}" : "null") + ',' + i_21_ + ')'));
		}
	}

	private final void method2035(int i, int i_23_, byte i_24_, int i_25_) {
		try {
			if (i_24_ != 68)
				method2044((byte) -20);
			((Class338) this).anIntArrayArray4459[i_25_][i_23_] = Class173
					.method1134(
							(((Class338) this).anIntArrayArray4459[i_25_][i_23_]),
							i);
			anInt4479++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("uu.Q(" + i + ','
					+ i_23_ + ',' + i_24_ + ',' + i_25_ + ')'));
		}
	}

	final void method2036(byte i, int i_26_, int i_27_) {
		try {
			anInt4474++;
			if (i != -47)
				((Class338) this).anIntArrayArray4459 = null;
			i_26_ -= ((Class338) this).anInt4465;
			i_27_ -= ((Class338) this).anInt4470;
			((Class338) this).anIntArrayArray4459[i_27_][i_26_] = Class77
					.method529(
							(((Class338) this).anIntArrayArray4459[i_27_][i_26_]),
							-2097153);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("uu.K(" + i + ','
					+ i_26_ + ',' + i_27_ + ')'));
		}
	}

	public static void method2037(int i) {
		do {
			try {
				aClass79_4478 = null;
				if (i == -3570)
					break;
				aClass79_4478 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "uu.O(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method2038(int i, int i_28_, int i_29_, int i_30_, int i_31_,
			int i_32_, int i_33_, int i_34_, boolean bool) {
		try {
			anInt4471++;
			if ((i_32_ ^ 0xffffffff) < -2) {
				if (Class11_Sub3.method2284(i_29_, i_33_, i_32_, i_30_, i_28_,
						true, i_32_, i, i_31_))
					return true;
				return method2039(i_28_, i_29_, i_32_, i_30_, i_33_, -1, i_32_,
						i_31_, i_34_, i);
			}
			int i_35_ = -1 + (i_33_ - -i_29_);
			int i_36_ = i_28_ + (i_31_ - 1);
			if (i_33_ <= i && (i_35_ ^ 0xffffffff) <= (i ^ 0xffffffff)
					&& i_31_ <= i_30_
					&& (i_30_ ^ 0xffffffff) >= (i_36_ ^ 0xffffffff))
				return true;
			if (bool != false)
				((Class338) this).anIntArrayArray4459 = null;
			if (-1 + i_33_ == i
					&& (i_30_ ^ 0xffffffff) <= (i_31_ ^ 0xffffffff)
					&& i_36_ >= i_30_
					&& ((((Class338) this).anIntArrayArray4459[i
							+ -((Class338) this).anInt4470][-((Class338) this).anInt4465
							+ i_30_]) & 0x8 ^ 0xffffffff) == -1
					&& (0x8 & i_34_ ^ 0xffffffff) == -1)
				return true;
			if (i == 1 + i_35_
					&& (i_31_ ^ 0xffffffff) >= (i_30_ ^ 0xffffffff)
					&& (i_30_ ^ 0xffffffff) >= (i_36_ ^ 0xffffffff)
					&& (0x80 & (((Class338) this).anIntArrayArray4459[-((Class338) this).anInt4470
							+ i][-((Class338) this).anInt4465 + i_30_])) == 0
					&& (i_34_ & 0x2) == 0)
				return true;
			if ((i_30_ ^ 0xffffffff) == (-1 + i_31_ ^ 0xffffffff)
					&& (i_33_ ^ 0xffffffff) >= (i ^ 0xffffffff)
					&& i_35_ >= i
					&& ((((Class338) this).anIntArrayArray4459[i
							+ -((Class338) this).anInt4470][i_30_
							+ -((Class338) this).anInt4465]) & 0x2 ^ 0xffffffff) == -1
					&& (i_34_ & 0x4) == 0)
				return true;
			if ((i_30_ ^ 0xffffffff) == (1 + i_36_ ^ 0xffffffff)
					&& (i ^ 0xffffffff) <= (i_33_ ^ 0xffffffff)
					&& (i ^ 0xffffffff) >= (i_35_ ^ 0xffffffff)
					&& (0x20 & (((Class338) this).anIntArrayArray4459[i
							- ((Class338) this).anInt4470][i_30_
							+ -((Class338) this).anInt4465])) == 0
					&& (0x1 & i_34_ ^ 0xffffffff) == -1)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("uu.G(" + i + ','
					+ i_28_ + ',' + i_29_ + ',' + i_30_ + ',' + i_31_ + ','
					+ i_32_ + ',' + i_33_ + ',' + i_34_ + ',' + bool + ')'));
		}
	}

	final boolean method2039(int i, int i_37_, int i_38_, int i_39_, int i_40_,
			int i_41_, int i_42_, int i_43_, int i_44_, int i_45_) {
		try {
			anInt4466++;
			int i_46_ = i_45_ + i_42_;
			int i_47_ = i_39_ - -i_38_;
			int i_48_ = i_40_ - -i_37_;
			if (i_41_ != -1)
				((Class338) this).anIntArrayArray4459 = null;
			int i_49_ = i_43_ - -i;
			if (i_48_ != i_45_ || (i_44_ & 0x2) != 0) {
				if ((i_40_ ^ 0xffffffff) != (i_46_ ^ 0xffffffff)
						|| (i_44_ & 0x8) != 0) {
					if (i_49_ != i_39_ || (0x1 & i_44_) != 0) {
						if (i_43_ == i_47_ && (0x4 & i_44_ ^ 0xffffffff) == -1) {
							int i_50_ = i_40_ < i_45_ ? i_45_ : i_40_;
							for (int i_51_ = (((i_46_ ^ 0xffffffff) <= (i_48_ ^ 0xffffffff)) ? i_48_
									: i_46_); i_51_ > i_50_; i_50_++) {
								if ((((((Class338) this).anIntArrayArray4459[-((Class338) this).anInt4470
										+ i_50_][-((Class338) this).anInt4465
										+ i_43_]) & 0x20) ^ 0xffffffff) == -1)
									return true;
							}
						}
					} else {
						int i_52_ = ((i_45_ ^ 0xffffffff) >= (i_40_ ^ 0xffffffff) ? i_40_
								: i_45_);
						for (int i_53_ = ((i_48_ ^ 0xffffffff) < (i_46_ ^ 0xffffffff) ? i_46_
								: i_48_); (i_52_ ^ 0xffffffff) > (i_53_ ^ 0xffffffff); i_52_++) {
							if ((0x2 & (((Class338) this).anIntArrayArray4459[-((Class338) this).anInt4470
									+ i_52_][(-((Class338) this).anInt4465 + (-1 + i_49_))])) == 0)
								return true;
						}
					}
				} else {
					int i_54_ = ((i_39_ ^ 0xffffffff) >= (i_43_ ^ 0xffffffff) ? i_43_
							: i_39_);
					for (int i_55_ = i_49_ > i_47_ ? i_47_ : i_49_; (i_54_ ^ 0xffffffff) > (i_55_ ^ 0xffffffff); i_54_++) {
						if ((0x80 & (((Class338) this).anIntArrayArray4459[-((Class338) this).anInt4470
								+ i_40_][-((Class338) this).anInt4465 + i_54_]) ^ 0xffffffff) == -1)
							return true;
					}
				}
			} else {
				int i_56_ = ((i_43_ ^ 0xffffffff) <= (i_39_ ^ 0xffffffff) ? i_43_
						: i_39_);
				for (int i_57_ = i_49_ <= i_47_ ? i_49_ : i_47_; i_56_ < i_57_; i_56_++) {
					if (((((Class338) this).anIntArrayArray4459[-1
							+ (i_48_ - ((Class338) this).anInt4470)][i_56_
							- ((Class338) this).anInt4465]) & 0x8) == 0)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("uu.M(" + i + ','
					+ i_37_ + ',' + i_38_ + ',' + i_39_ + ',' + i_40_ + ','
					+ i_41_ + ',' + i_42_ + ',' + i_43_ + ',' + i_44_ + ','
					+ i_45_ + ')'));
		}
	}

	final void method2040(int i, boolean bool, int i_58_) {
		try {
			i -= ((Class338) this).anInt4470;
			if (bool != false)
				method2032(127, false, -34, false, 56, 125, 78);
			anInt4458++;
			i_58_ -= ((Class338) this).anInt4465;
			((Class338) this).anIntArrayArray4459[i][i_58_] = Class173
					.method1134(
							(((Class338) this).anIntArrayArray4459[i][i_58_]),
							2097152);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("uu.J(" + i + ','
					+ bool + ',' + i_58_ + ')'));
		}
	}

	final void method2041(int i, int i_59_, int i_60_) {
		try {
			i_59_ -= ((Class338) this).anInt4470;
			if (i_60_ != 26964)
				((Class338) this).anIntArrayArray4459 = null;
			i -= ((Class338) this).anInt4465;
			anInt4473++;
			((Class338) this).anIntArrayArray4459[i_59_][i] = Class77
					.method529(
							(((Class338) this).anIntArrayArray4459[i_59_][i]),
							-262145);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("uu.C(" + i + ','
					+ i_59_ + ',' + i_60_ + ')'));
		}
	}

	final boolean method2042(int i, int i_61_, int i_62_, int i_63_, int i_64_,
			byte i_65_, int i_66_, int i_67_) {
		try {
			anInt4464++;
			if ((i_67_ ^ 0xffffffff) != -2) {
				if ((i_61_ ^ 0xffffffff) <= (i_63_ ^ 0xffffffff)
						&& (-1 + i_67_ + i_63_ ^ 0xffffffff) <= (i_61_ ^ 0xffffffff)
						&& i >= i
						&& (i - (-i_67_ + 1) ^ 0xffffffff) <= (i ^ 0xffffffff))
					return true;
			} else if ((i_63_ ^ 0xffffffff) == (i_61_ ^ 0xffffffff)
					&& (i_64_ ^ 0xffffffff) == (i ^ 0xffffffff))
				return true;
			i_61_ -= ((Class338) this).anInt4470;
			i_64_ -= ((Class338) this).anInt4465;
			int i_68_ = 68 % ((27 - i_65_) / 58);
			i_63_ -= ((Class338) this).anInt4470;
			i -= ((Class338) this).anInt4465;
			if (i_67_ != 1) {
				int i_69_ = -1 + (i_67_ + i_63_);
				int i_70_ = i_64_ + (i_67_ - 1);
				if (i_66_ == 6 || i_66_ == 7) {
					if ((i_66_ ^ 0xffffffff) == -8)
						i_62_ = 0x3 & 2 + i_62_;
					if (i_62_ != 0) {
						if ((i_62_ ^ 0xffffffff) == -2) {
							if (i_61_ + -i_67_ == i_63_
									&& i >= i_64_
									&& i_70_ >= i
									&& ((0x8 & (((Class338) this).anIntArrayArray4459[i_69_][i])) == 0))
								return true;
							if (i_61_ >= i_63_
									&& i_61_ <= i_69_
									&& (i_64_ ^ 0xffffffff) == (i - i_67_ ^ 0xffffffff)
									&& ((((Class338) this).anIntArrayArray4459[i_61_][i_70_]) & 0x2 ^ 0xffffffff) == -1)
								return true;
						} else if (i_62_ == 2) {
							if ((i_63_ ^ 0xffffffff) == (i_61_ - i_67_ ^ 0xffffffff)
									&& (i ^ 0xffffffff) <= (i_64_ ^ 0xffffffff)
									&& (i_70_ ^ 0xffffffff) <= (i ^ 0xffffffff)
									&& ((((Class338) this).anIntArrayArray4459[i_69_][i]) & 0x8) == 0)
								return true;
							if ((i_61_ ^ 0xffffffff) <= (i_63_ ^ 0xffffffff)
									&& i_69_ >= i_61_
									&& (i_64_ ^ 0xffffffff) == (1 + i ^ 0xffffffff)
									&& (0x20 & (((Class338) this).anIntArrayArray4459[i_61_][i_64_]) ^ 0xffffffff) == -1)
								return true;
						} else if (i_62_ == 3) {
							if ((i_61_ + 1 ^ 0xffffffff) == (i_63_ ^ 0xffffffff)
									&& i >= i_64_
									&& i_70_ >= i
									&& ((((Class338) this).anIntArrayArray4459[i_63_][i]) & 0x80) == 0)
								return true;
							if ((i_61_ ^ 0xffffffff) <= (i_63_ ^ 0xffffffff)
									&& i_61_ <= i_69_
									&& (i_64_ ^ 0xffffffff) == (i + 1 ^ 0xffffffff)
									&& ((((Class338) this).anIntArrayArray4459[i_61_][i_64_]) & 0x20 ^ 0xffffffff) == -1)
								return true;
						}
					} else {
						if ((1 + i_61_ ^ 0xffffffff) == (i_63_ ^ 0xffffffff)
								&& i_64_ <= i
								&& i <= i_70_
								&& (0x80 & (((Class338) this).anIntArrayArray4459[i_63_][i]) ^ 0xffffffff) == -1)
							return true;
						if ((i_61_ ^ 0xffffffff) <= (i_63_ ^ 0xffffffff)
								&& (i_61_ ^ 0xffffffff) >= (i_69_ ^ 0xffffffff)
								&& (i_64_ ^ 0xffffffff) == (-i_67_ + i ^ 0xffffffff)
								&& ((((Class338) this).anIntArrayArray4459[i_61_][i_70_]) & 0x2) == 0)
							return true;
					}
				}
				if ((i_66_ ^ 0xffffffff) == -9) {
					if (i_61_ >= i_63_
							&& i_61_ <= i_69_
							&& i_64_ == 1 + i
							&& (0x20 & (((Class338) this).anIntArrayArray4459[i_61_][i_64_])) == 0)
						return true;
					if ((i_63_ ^ 0xffffffff) >= (i_61_ ^ 0xffffffff)
							&& i_61_ <= i_69_
							&& (i - i_67_ ^ 0xffffffff) == (i_64_ ^ 0xffffffff)
							&& (((Class338) this).anIntArrayArray4459[i_61_][i_70_] & 0x2) == 0)
						return true;
					if (-i_67_ + i_61_ == i_63_
							&& (i ^ 0xffffffff) <= (i_64_ ^ 0xffffffff)
							&& i <= i_70_
							&& ((0x8 & ((Class338) this).anIntArrayArray4459[i_69_][i]) == 0))
						return true;
					if ((i_63_ ^ 0xffffffff) == (i_61_ + 1 ^ 0xffffffff)
							&& i_64_ <= i
							&& i_70_ >= i
							&& ((((Class338) this).anIntArrayArray4459[i_63_][i] & 0x80) ^ 0xffffffff) == -1)
						return true;
				}
			} else {
				if ((i_66_ ^ 0xffffffff) == -7 || (i_66_ ^ 0xffffffff) == -8) {
					if ((i_66_ ^ 0xffffffff) == -8)
						i_62_ = 0x3 & 2 + i_62_;
					if (i_62_ != 0) {
						if ((i_62_ ^ 0xffffffff) == -2) {
							if ((i_63_ ^ 0xffffffff) == (i_61_ - 1 ^ 0xffffffff)
									&& i_64_ == i
									&& (0x8 & (((Class338) this).anIntArrayArray4459[i_63_][i_64_]) ^ 0xffffffff) == -1)
								return true;
							if ((i_63_ ^ 0xffffffff) == (i_61_ ^ 0xffffffff)
									&& i - 1 == i_64_
									&& (0x2 & (((Class338) this).anIntArrayArray4459[i_63_][i_64_]) ^ 0xffffffff) == -1)
								return true;
						} else if ((i_62_ ^ 0xffffffff) != -3) {
							if (i_62_ == 3) {
								if ((i_63_ ^ 0xffffffff) == (1 + i_61_ ^ 0xffffffff)
										&& i_64_ == i
										&& (0x80 & (((Class338) this).anIntArrayArray4459[i_63_][i_64_]) ^ 0xffffffff) == -1)
									return true;
								if (i_61_ == i_63_
										&& (i_64_ ^ 0xffffffff) == (i + 1 ^ 0xffffffff)
										&& (0x20 & (((Class338) this).anIntArrayArray4459[i_63_][i_64_]) ^ 0xffffffff) == -1)
									return true;
							}
						} else {
							if ((i_63_ ^ 0xffffffff) == (-1 + i_61_ ^ 0xffffffff)
									&& i_64_ == i
									&& ((((Class338) this).anIntArrayArray4459[i_63_][i_64_]) & 0x8) == 0)
								return true;
							if ((i_63_ ^ 0xffffffff) == (i_61_ ^ 0xffffffff)
									&& (i_64_ ^ 0xffffffff) == (1 + i ^ 0xffffffff)
									&& ((((Class338) this).anIntArrayArray4459[i_63_][i_64_]) & 0x20 ^ 0xffffffff) == -1)
								return true;
						}
					} else {
						if (1 + i_61_ == i_63_
								&& (i ^ 0xffffffff) == (i_64_ ^ 0xffffffff)
								&& (0x80 & (((Class338) this).anIntArrayArray4459[i_63_][i_64_])) == 0)
							return true;
						if ((i_61_ ^ 0xffffffff) == (i_63_ ^ 0xffffffff)
								&& i_64_ == -1 + i
								&& ((((Class338) this).anIntArrayArray4459[i_63_][i_64_]) & 0x2) == 0)
							return true;
					}
				}
				if (i_66_ == 8) {
					if ((i_63_ ^ 0xffffffff) == (i_61_ ^ 0xffffffff)
							&& i + 1 == i_64_
							&& (0x20 & (((Class338) this).anIntArrayArray4459[i_63_][i_64_])) == 0)
						return true;
					if (i_63_ == i_61_
							&& -1 + i == i_64_
							&& ((((Class338) this).anIntArrayArray4459[i_63_][i_64_]) & 0x2 ^ 0xffffffff) == -1)
						return true;
					if (-1 + i_61_ == i_63_
							&& (i_64_ ^ 0xffffffff) == (i ^ 0xffffffff)
							&& (0x8 & (((Class338) this).anIntArrayArray4459[i_63_][i_64_])) == 0)
						return true;
					if (i_63_ == i_61_ + 1
							&& i == i_64_
							&& (((Class338) this).anIntArrayArray4459[i_63_][i_64_] & 0x80) == 0)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("uu.P(" + i + ','
					+ i_61_ + ',' + i_62_ + ',' + i_63_ + ',' + i_64_ + ','
					+ i_65_ + ',' + i_66_ + ',' + i_67_ + ')'));
		}
	}

	private final void method2043(int i, int i_71_, int i_72_, boolean bool) {
		try {
			anInt4461++;
			if (bool != false)
				((Class338) this).anIntArrayArray4459 = null;
			((Class338) this).anIntArrayArray4459[i_71_][i] = Class77
					.method529(
							(((Class338) this).anIntArrayArray4459[i_71_][i]),
							i_72_ ^ 0xffffffff);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("uu.R(" + i + ','
					+ i_71_ + ',' + i_72_ + ',' + bool + ')'));
		}
	}

	final void method2044(byte i) {
		do {
			try {
				for (int i_73_ = 0; ((((Class338) this).anInt4475 ^ 0xffffffff) < (i_73_ ^ 0xffffffff)); i_73_++) {
					for (int i_74_ = 0; ((Class338) this).anInt4468 > i_74_; i_74_++) {
						if ((i_73_ ^ 0xffffffff) != -1
								&& (i_74_ ^ 0xffffffff) != -1
								&& ((-5 + ((Class338) this).anInt4475 ^ 0xffffffff) < (i_73_ ^ 0xffffffff))
								&& i_74_ < -5 + ((Class338) this).anInt4468)
							((Class338) this).anIntArrayArray4459[i_73_][i_74_] = 2097152;
						else
							((Class338) this).anIntArrayArray4459[i_73_][i_74_] = -1;
					}
				}
				anInt4480++;
				if (i >= 74)
					break;
				((Class338) this).anIntArrayArray4459 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "uu.H(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method2045(int i, int i_75_, int i_76_, int i_77_, int i_78_,
			int i_79_, int i_80_, int i_81_) {
		try {
			anInt4476++;
			if (i_77_ != 1) {
				if (i <= i_76_
						&& -1 + (i + i_77_) >= i_76_
						&& (i_79_ ^ 0xffffffff) <= (i_79_ ^ 0xffffffff)
						&& (-1 + (i_79_ + i_77_) ^ 0xffffffff) <= (i_79_ ^ 0xffffffff))
					return true;
			} else if ((i ^ 0xffffffff) == (i_76_ ^ 0xffffffff)
					&& i_75_ == i_79_)
				return true;
			i -= ((Class338) this).anInt4470;
			i_76_ -= ((Class338) this).anInt4470;
			if (i_81_ != -1)
				method2042(75, 123, 39, 102, 33, (byte) 43, -101, -7);
			i_75_ -= ((Class338) this).anInt4465;
			i_79_ -= ((Class338) this).anInt4465;
			if (i_77_ == 1) {
				if ((i_78_ ^ 0xffffffff) == -1) {
					if ((i_80_ ^ 0xffffffff) == -1) {
						if (i == i_76_ - 1
								&& (i_75_ ^ 0xffffffff) == (i_79_ ^ 0xffffffff))
							return true;
						if ((i ^ 0xffffffff) == (i_76_ ^ 0xffffffff)
								&& 1 + i_79_ == i_75_
								&& ((((Class338) this).anIntArrayArray4459[i][i_75_]) & 0x2c0120 ^ 0xffffffff) == -1)
							return true;
						if (i == i_76_
								&& (-1 + i_79_ ^ 0xffffffff) == (i_75_ ^ 0xffffffff)
								&& (0x2c0102 & (((Class338) this).anIntArrayArray4459[i][i_75_]) ^ 0xffffffff) == -1)
							return true;
					} else if ((i_80_ ^ 0xffffffff) == -2) {
						if ((i ^ 0xffffffff) == (i_76_ ^ 0xffffffff)
								&& 1 + i_79_ == i_75_)
							return true;
						if ((i_76_ - 1 ^ 0xffffffff) == (i ^ 0xffffffff)
								&& (i_79_ ^ 0xffffffff) == (i_75_ ^ 0xffffffff)
								&& ((0x2c0108 & (((Class338) this).anIntArrayArray4459[i][i_75_])) == 0))
							return true;
						if ((i ^ 0xffffffff) == (i_76_ + 1 ^ 0xffffffff)
								&& (i_75_ ^ 0xffffffff) == (i_79_ ^ 0xffffffff)
								&& (((Class338) this).anIntArrayArray4459[i][i_75_] & 0x2c0180) == 0)
							return true;
					} else if ((i_80_ ^ 0xffffffff) == -3) {
						if ((i_76_ + 1 ^ 0xffffffff) == (i ^ 0xffffffff)
								&& (i_79_ ^ 0xffffffff) == (i_75_ ^ 0xffffffff))
							return true;
						if ((i_76_ ^ 0xffffffff) == (i ^ 0xffffffff)
								&& i_75_ == 1 + i_79_
								&& (0x2c0120 & (((Class338) this).anIntArrayArray4459[i][i_75_]) ^ 0xffffffff) == -1)
							return true;
						if ((i ^ 0xffffffff) == (i_76_ ^ 0xffffffff)
								&& (i_75_ ^ 0xffffffff) == (-1 + i_79_ ^ 0xffffffff)
								&& ((((Class338) this).anIntArrayArray4459[i][i_75_]) & 0x2c0102 ^ 0xffffffff) == -1)
							return true;
					} else if ((i_80_ ^ 0xffffffff) == -4) {
						if ((i ^ 0xffffffff) == (i_76_ ^ 0xffffffff)
								&& (i_79_ - 1 ^ 0xffffffff) == (i_75_ ^ 0xffffffff))
							return true;
						if ((i ^ 0xffffffff) == (i_76_ - 1 ^ 0xffffffff)
								&& (i_79_ ^ 0xffffffff) == (i_75_ ^ 0xffffffff)
								&& ((((Class338) this).anIntArrayArray4459[i][i_75_]) & 0x2c0108 ^ 0xffffffff) == -1)
							return true;
						if ((i_76_ + 1 ^ 0xffffffff) == (i ^ 0xffffffff)
								&& i_79_ == i_75_
								&& ((0x2c0180 & (((Class338) this).anIntArrayArray4459[i][i_75_])) == 0))
							return true;
					}
				}
				if ((i_78_ ^ 0xffffffff) == -3) {
					if (i_80_ == 0) {
						if ((i ^ 0xffffffff) == (i_76_ - 1 ^ 0xffffffff)
								&& i_79_ == i_75_)
							return true;
						if (i == i_76_
								&& (i_79_ + 1 ^ 0xffffffff) == (i_75_ ^ 0xffffffff))
							return true;
						if ((1 + i_76_ ^ 0xffffffff) == (i ^ 0xffffffff)
								&& i_75_ == i_79_
								&& ((((Class338) this).anIntArrayArray4459[i][i_75_]) & 0x2c0180 ^ 0xffffffff) == -1)
							return true;
						if ((i_76_ ^ 0xffffffff) == (i ^ 0xffffffff)
								&& (i_79_ - 1 ^ 0xffffffff) == (i_75_ ^ 0xffffffff)
								&& (((Class338) this).anIntArrayArray4459[i][i_75_] & 0x2c0102) == 0)
							return true;
					} else if (i_80_ == 1) {
						if (i == -1 + i_76_
								&& (i_79_ ^ 0xffffffff) == (i_75_ ^ 0xffffffff)
								&& ((0x2c0108 & (((Class338) this).anIntArrayArray4459[i][i_75_])) == 0))
							return true;
						if (i == i_76_ && i_75_ == i_79_ + 1)
							return true;
						if ((i ^ 0xffffffff) == (i_76_ + 1 ^ 0xffffffff)
								&& i_75_ == i_79_)
							return true;
						if ((i_76_ ^ 0xffffffff) == (i ^ 0xffffffff)
								&& (i_75_ ^ 0xffffffff) == (i_79_ - 1 ^ 0xffffffff)
								&& (((Class338) this).anIntArrayArray4459[i][i_75_] & 0x2c0102) == 0)
							return true;
					} else if (i_80_ == 2) {
						if ((i ^ 0xffffffff) == (-1 + i_76_ ^ 0xffffffff)
								&& (i_79_ ^ 0xffffffff) == (i_75_ ^ 0xffffffff)
								&& (((Class338) this).anIntArrayArray4459[i][i_75_] & 0x2c0108) == 0)
							return true;
						if (i == i_76_
								&& (i_79_ + 1 ^ 0xffffffff) == (i_75_ ^ 0xffffffff)
								&& (((Class338) this).anIntArrayArray4459[i][i_75_] & 0x2c0120) == 0)
							return true;
						if (1 + i_76_ == i
								&& (i_79_ ^ 0xffffffff) == (i_75_ ^ 0xffffffff))
							return true;
						if (i_76_ == i && -1 + i_79_ == i_75_)
							return true;
					} else if (i_80_ == 3) {
						if (i_76_ - 1 == i
								&& (i_79_ ^ 0xffffffff) == (i_75_ ^ 0xffffffff))
							return true;
						if ((i_76_ ^ 0xffffffff) == (i ^ 0xffffffff)
								&& (1 + i_79_ ^ 0xffffffff) == (i_75_ ^ 0xffffffff)
								&& ((((Class338) this).anIntArrayArray4459[i][i_75_]) & 0x2c0120 ^ 0xffffffff) == -1)
							return true;
						if ((i_76_ + 1 ^ 0xffffffff) == (i ^ 0xffffffff)
								&& i_79_ == i_75_
								&& (0x2c0180 & (((Class338) this).anIntArrayArray4459[i][i_75_]) ^ 0xffffffff) == -1)
							return true;
						if (i == i_76_ && i_79_ - 1 == i_75_)
							return true;
					}
				}
				if (i_78_ == 9) {
					if ((i_76_ ^ 0xffffffff) == (i ^ 0xffffffff)
							&& 1 + i_79_ == i_75_
							&& ((0x20 & ((Class338) this).anIntArrayArray4459[i][i_75_]) ^ 0xffffffff) == -1)
						return true;
					if ((i ^ 0xffffffff) == (i_76_ ^ 0xffffffff)
							&& i_79_ - 1 == i_75_
							&& ((0x2 & ((Class338) this).anIntArrayArray4459[i][i_75_]) ^ 0xffffffff) == -1)
						return true;
					if ((-1 + i_76_ ^ 0xffffffff) == (i ^ 0xffffffff)
							&& i_75_ == i_79_
							&& ((0x8 & ((Class338) this).anIntArrayArray4459[i][i_75_]) == 0))
						return true;
					if ((1 + i_76_ ^ 0xffffffff) == (i ^ 0xffffffff)
							&& (i_79_ ^ 0xffffffff) == (i_75_ ^ 0xffffffff)
							&& ((0x80 & ((Class338) this).anIntArrayArray4459[i][i_75_]) == 0))
						return true;
				}
			} else {
				int i_82_ = i - (-i_77_ + 1);
				int i_83_ = i_75_ - (-i_77_ + 1);
				if ((i_78_ ^ 0xffffffff) == -1) {
					if (i_80_ == 0) {
						if ((i ^ 0xffffffff) == (-i_77_ + i_76_ ^ 0xffffffff)
								&& i_75_ <= i_79_ && i_79_ <= i_83_)
							return true;
						if (i_76_ >= i
								&& i_82_ >= i_76_
								&& i_79_ + 1 == i_75_
								&& (0x2c0120 & (((Class338) this).anIntArrayArray4459[i_76_][i_75_]) ^ 0xffffffff) == -1)
							return true;
						if (i_76_ >= i
								&& i_76_ <= i_82_
								&& (i_75_ ^ 0xffffffff) == (-i_77_ + i_79_ ^ 0xffffffff)
								&& ((((Class338) this).anIntArrayArray4459[i_76_][i_83_]) & 0x2c0102 ^ 0xffffffff) == -1)
							return true;
					} else if (i_80_ != 1) {
						if (i_80_ != 2) {
							if (i_80_ == 3) {
								if (i <= i_76_ && i_82_ >= i_76_
										&& -i_77_ + i_79_ == i_75_)
									return true;
								if ((i ^ 0xffffffff) == (-i_77_ + i_76_ ^ 0xffffffff)
										&& (i_79_ ^ 0xffffffff) <= (i_75_ ^ 0xffffffff)
										&& (i_83_ ^ 0xffffffff) <= (i_79_ ^ 0xffffffff)
										&& (0x2c0108 & (((Class338) this).anIntArrayArray4459[i_82_][i_79_]) ^ 0xffffffff) == -1)
									return true;
								if ((1 + i_76_ ^ 0xffffffff) == (i ^ 0xffffffff)
										&& i_75_ <= i_79_
										&& i_79_ <= i_83_
										&& (0x2c0180 & (((Class338) this).anIntArrayArray4459[i][i_79_])) == 0)
									return true;
							}
						} else {
							if ((i ^ 0xffffffff) == (1 + i_76_ ^ 0xffffffff)
									&& i_75_ <= i_79_ && i_79_ <= i_83_)
								return true;
							if ((i_76_ ^ 0xffffffff) <= (i ^ 0xffffffff)
									&& i_82_ >= i_76_
									&& 1 + i_79_ == i_75_
									&& ((((Class338) this).anIntArrayArray4459[i_76_][i_75_]) & 0x2c0120) == 0)
								return true;
							if ((i_76_ ^ 0xffffffff) <= (i ^ 0xffffffff)
									&& (i_76_ ^ 0xffffffff) >= (i_82_ ^ 0xffffffff)
									&& i_75_ == -i_77_ + i_79_
									&& ((((Class338) this).anIntArrayArray4459[i_76_][i_83_]) & 0x2c0102) == 0)
								return true;
						}
					} else {
						if (i <= i_76_
								&& (i_76_ ^ 0xffffffff) >= (i_82_ ^ 0xffffffff)
								&& i_79_ + 1 == i_75_)
							return true;
						if ((i_76_ - i_77_ ^ 0xffffffff) == (i ^ 0xffffffff)
								&& (i_79_ ^ 0xffffffff) <= (i_75_ ^ 0xffffffff)
								&& i_83_ >= i_79_
								&& (0x2c0108 & (((Class338) this).anIntArrayArray4459[i_82_][i_79_]) ^ 0xffffffff) == -1)
							return true;
						if (i == 1 + i_76_
								&& i_79_ >= i_75_
								&& (i_83_ ^ 0xffffffff) <= (i_79_ ^ 0xffffffff)
								&& ((((Class338) this).anIntArrayArray4459[i][i_79_]) & 0x2c0180 ^ 0xffffffff) == -1)
							return true;
					}
				}
				if ((i_78_ ^ 0xffffffff) == -3) {
					if (i_80_ != 0) {
						if (i_80_ == 1) {
							if (i_76_ - i_77_ == i
									&& i_79_ >= i_75_
									&& i_79_ <= i_83_
									&& (0x2c0108 & (((Class338) this).anIntArrayArray4459[i_82_][i_79_])) == 0)
								return true;
							if (i_76_ >= i && i_76_ <= i_82_
									&& i_79_ + 1 == i_75_)
								return true;
							if (i_76_ + 1 == i
									&& (i_79_ ^ 0xffffffff) <= (i_75_ ^ 0xffffffff)
									&& (i_79_ ^ 0xffffffff) >= (i_83_ ^ 0xffffffff))
								return true;
							if (i <= i_76_
									&& i_76_ <= i_82_
									&& i_79_ - i_77_ == i_75_
									&& (0x2c0102 & (((Class338) this).anIntArrayArray4459[i_76_][i_83_]) ^ 0xffffffff) == -1)
								return true;
						} else if ((i_80_ ^ 0xffffffff) != -3) {
							if ((i_80_ ^ 0xffffffff) == -4) {
								if (-i_77_ + i_76_ == i
										&& (i_79_ ^ 0xffffffff) <= (i_75_ ^ 0xffffffff)
										&& i_83_ >= i_79_)
									return true;
								if ((i_76_ ^ 0xffffffff) <= (i ^ 0xffffffff)
										&& (i_82_ ^ 0xffffffff) <= (i_76_ ^ 0xffffffff)
										&& (i_75_ ^ 0xffffffff) == (1 + i_79_ ^ 0xffffffff)
										&& (0x2c0120 & (((Class338) this).anIntArrayArray4459[i_76_][i_75_]) ^ 0xffffffff) == -1)
									return true;
								if (i == i_76_ + 1
										&& i_75_ <= i_79_
										&& i_83_ >= i_79_
										&& ((((Class338) this).anIntArrayArray4459[i][i_79_]) & 0x2c0180) == 0)
									return true;
								if (i <= i_76_
										&& (i_82_ ^ 0xffffffff) <= (i_76_ ^ 0xffffffff)
										&& (i_75_ ^ 0xffffffff) == (-i_77_
												+ i_79_ ^ 0xffffffff))
									return true;
							}
						} else {
							if ((-i_77_ + i_76_ ^ 0xffffffff) == (i ^ 0xffffffff)
									&& i_79_ >= i_75_
									&& (i_79_ ^ 0xffffffff) >= (i_83_ ^ 0xffffffff)
									&& (0x2c0108 & (((Class338) this).anIntArrayArray4459[i_82_][i_79_])) == 0)
								return true;
							if ((i_76_ ^ 0xffffffff) <= (i ^ 0xffffffff)
									&& (i_82_ ^ 0xffffffff) <= (i_76_ ^ 0xffffffff)
									&& i_79_ + 1 == i_75_
									&& (0x2c0120 & (((Class338) this).anIntArrayArray4459[i_76_][i_75_])) == 0)
								return true;
							if (i_76_ + 1 == i
									&& (i_75_ ^ 0xffffffff) >= (i_79_ ^ 0xffffffff)
									&& i_83_ >= i_79_)
								return true;
							if (i_76_ >= i
									&& i_76_ <= i_82_
									&& (i_75_ ^ 0xffffffff) == (-i_77_ + i_79_ ^ 0xffffffff))
								return true;
						}
					} else {
						if ((-i_77_ + i_76_ ^ 0xffffffff) == (i ^ 0xffffffff)
								&& (i_79_ ^ 0xffffffff) <= (i_75_ ^ 0xffffffff)
								&& (i_79_ ^ 0xffffffff) >= (i_83_ ^ 0xffffffff))
							return true;
						if (i <= i_76_
								&& i_82_ >= i_76_
								&& (i_79_ + 1 ^ 0xffffffff) == (i_75_ ^ 0xffffffff))
							return true;
						if ((1 + i_76_ ^ 0xffffffff) == (i ^ 0xffffffff)
								&& (i_79_ ^ 0xffffffff) <= (i_75_ ^ 0xffffffff)
								&& i_83_ >= i_79_
								&& (((Class338) this).anIntArrayArray4459[i][i_79_] & 0x2c0180) == 0)
							return true;
						if (i_76_ >= i
								&& (i_76_ ^ 0xffffffff) >= (i_82_ ^ 0xffffffff)
								&& i_79_ - i_77_ == i_75_
								&& ((((Class338) this).anIntArrayArray4459[i_76_][i_83_]) & 0x2c0102 ^ 0xffffffff) == -1)
							return true;
					}
				}
				if (i_78_ == 9) {
					if (i_76_ >= i
							&& (i_82_ ^ 0xffffffff) <= (i_76_ ^ 0xffffffff)
							&& (i_75_ ^ 0xffffffff) == (1 + i_79_ ^ 0xffffffff)
							&& (0x2c0120 & (((Class338) this).anIntArrayArray4459[i_76_][i_75_])) == 0)
						return true;
					if ((i ^ 0xffffffff) >= (i_76_ ^ 0xffffffff)
							&& i_76_ <= i_82_
							&& (i_79_ + -i_77_ ^ 0xffffffff) == (i_75_ ^ 0xffffffff)
							&& ((((Class338) this).anIntArrayArray4459[i_76_][i_83_]) & 0x2c0102 ^ 0xffffffff) == -1)
						return true;
					if ((i_76_ - i_77_ ^ 0xffffffff) == (i ^ 0xffffffff)
							&& (i_75_ ^ 0xffffffff) >= (i_79_ ^ 0xffffffff)
							&& (i_79_ ^ 0xffffffff) >= (i_83_ ^ 0xffffffff)
							&& (0x2c0108 & (((Class338) this).anIntArrayArray4459[i_82_][i_79_])) == 0)
						return true;
					if ((1 + i_76_ ^ 0xffffffff) == (i ^ 0xffffffff)
							&& i_75_ <= i_79_
							&& (i_83_ ^ 0xffffffff) <= (i_79_ ^ 0xffffffff)
							&& ((((Class338) this).anIntArrayArray4459[i][i_79_] & 0x2c0180) ^ 0xffffffff) == -1)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("uu.F(" + i + ','
					+ i_75_ + ',' + i_76_ + ',' + i_77_ + ',' + i_78_ + ','
					+ i_79_ + ',' + i_80_ + ',' + i_81_ + ')'));
		}
	}

	static final void method2046(int i, int i_84_) {
		try {
			anInt4463++;
			if (i_84_ == 0) {
				Class310.anInt4148 = i;
				Class10.aClass22_82.method189((byte) 54);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uu.N(" + i + ','
					+ i_84_ + ')');
		}
	}

	final void method2047(int i, int i_85_, boolean bool, int i_86_, int i_87_,
			int i_88_, boolean bool_89_) {
		try {
			anInt4460++;
			int i_90_ = i_86_;
			if (bool)
				i_90_ |= 0x20000;
			if (bool_89_)
				i_90_ |= 0x40000000;
			i -= ((Class338) this).anInt4465;
			i_88_ -= ((Class338) this).anInt4470;
			for (int i_91_ = i_88_; i_85_ + i_88_ > i_91_; i_91_++) {
				if (i_91_ >= 0 && i_91_ < ((Class338) this).anInt4475) {
					for (int i_92_ = i; i_92_ < i + i_87_; i_92_++) {
						if ((i_92_ ^ 0xffffffff) <= -1
								&& ((Class338) this).anInt4468 > i_92_)
							method2035(i_90_, i_92_, (byte) 68, i_91_);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("uu.E(" + i + ','
					+ i_85_ + ',' + bool + ',' + i_86_ + ',' + i_87_ + ','
					+ i_88_ + ',' + bool_89_ + ')'));
		}
	}
}
