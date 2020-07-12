/* Class19_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class19_Sub1 extends Class19 {
	private Class243 aClass243_5744;
	private int anInt5745;
	private Class130 aClass130_5746;
	static int anInt5747;
	private Class213 aClass213_5748;
	static int anInt5749;
	private Class11_Sub45_Sub20 aClass11_Sub45_Sub20_5750;
	static int anInt5751;
	private byte[] aByteArray5752;
	static int anInt5753;
	static int anInt5754;
	static int anInt5755;
	private int anInt5756 = 0;
	static int anInt5757;
	static Class22 aClass22_5758 = new Class22(8);
	private int anInt5759;
	private byte[] aByteArray5760;
	private Class243 aClass243_5761;
	static int anInt5762;
	private int anInt5763;
	static int anInt5764;
	static Class209[] aClass209Array5765;
	static int anInt5766;
	private Class82 aClass82_5767;
	static int anInt5768;
	static int anInt5769;
	static int anInt5770;
	static int anInt5771;
	private Class187 aClass187_5772;
	private int anInt5773;
	private Class84 aClass84_5774;
	private boolean aBool5775;
	private boolean aBool5776;
	private Class84 aClass84_5777;
	private boolean aBool5778;
	private long aLong5779;

	static final int method2465(byte i, int i_0_, int i_1_) {
		try {
			anInt5769++;
			int i_2_ = 78 % ((i + 5) / 41);
			int i_3_ = 0;
			while (i_0_ > 0) {
				i_3_ = i_3_ << 1 | 0x1 & i_1_;
				i_0_--;
				i_1_ >>>= 1;
			}
			return i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("cp.H(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method2466(byte i) {
		do {
			try {
				anInt5762++;
				if (aClass84_5774 != null && method166(12607) != null) {
					for (Class11 class11 = aClass84_5777.method584(-12261); class11 != null; class11 = aClass84_5777
							.method578(-15361)) {
						int i_4_ = (int) ((Class11) class11).aLong91;
						if (i_4_ < 0
								|| ((i_4_ ^ 0xffffffff) <= (((Class130) aClass130_5746).anInt1810 ^ 0xffffffff))
								|| ((((Class130) aClass130_5746).anIntArray1807[i_4_]) ^ 0xffffffff) == -1)
							class11.method122(-114);
						else {
							if ((aByteArray5760[i_4_] ^ 0xffffffff) == -1)
								method2471((byte) -82, 1, i_4_);
							if (aByteArray5760[i_4_] == -1)
								method2471((byte) -82, 2, i_4_);
							if ((aByteArray5760[i_4_] ^ 0xffffffff) == -2)
								class11.method122(-31);
						}
					}
					if (i >= 21)
						break;
					method2466((byte) 4);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "cp.O(" + i + ')');
			}
			break;
		} while (false);
	}

	final Class130 method166(int i) {
		try {
			anInt5766++;
			if (aClass130_5746 != null)
				return aClass130_5746;
			if (aClass11_Sub45_Sub20_5750 == null) {
				if (aClass187_5772.method1229((byte) 112))
					return null;
				aClass11_Sub45_Sub20_5750 = aClass187_5772.method1217(
						(byte) 75, true, (byte) 0, anInt5759, 255);
			}
			if (((Class11_Sub45_Sub20) aClass11_Sub45_Sub20_5750).aBool9737)
				return null;
			byte[] is = aClass11_Sub45_Sub20_5750.method3833((byte) 68);
			if (!(aClass11_Sub45_Sub20_5750 instanceof Class11_Sub45_Sub20_Sub1)) {
				try {
					if (is == null)
						throw new RuntimeException();
					aClass130_5746 = new Class130(is, anInt5745, aByteArray5752);
				} catch (RuntimeException runtimeexception) {
					aClass187_5772.method1225((byte) 126);
					aClass130_5746 = null;
					if (!aClass187_5772.method1229((byte) 121))
						aClass11_Sub45_Sub20_5750 = aClass187_5772.method1217(
								(byte) 75, true, (byte) 0, anInt5759, 255);
					else
						aClass11_Sub45_Sub20_5750 = null;
					return null;
				}
				if (aClass243_5761 != null)
					aClass82_5767.method568(is, 29288, aClass243_5761,
							anInt5759);
			} else {
				try {
					if (is == null)
						throw new RuntimeException();
					aClass130_5746 = new Class130(is, anInt5745, aByteArray5752);
					if (anInt5763 != ((Class130) aClass130_5746).anInt1814)
						throw new RuntimeException();
				} catch (RuntimeException runtimeexception) {
					aClass130_5746 = null;
					if (aClass187_5772.method1229((byte) 117))
						aClass11_Sub45_Sub20_5750 = null;
					else
						aClass11_Sub45_Sub20_5750 = aClass187_5772.method1217(
								(byte) 75, true, (byte) 0, anInt5759, 255);
					return null;
				}
			}
			if (aClass243_5744 != null) {
				anInt5756 = 0;
				aByteArray5760 = new byte[((Class130) aClass130_5746).anInt1810];
			}
			if (i != 12607)
				return null;
			aClass11_Sub45_Sub20_5750 = null;
			return aClass130_5746;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cp.B(" + i + ')');
		}
	}

	final int method162(boolean bool, int i) {
		try {
			anInt5754++;
			Class11_Sub45_Sub20 class11_sub45_sub20 = ((Class11_Sub45_Sub20) aClass213_5748
					.method1369((byte) 26, (long) i));
			if (bool != false)
				method165(76, -103);
			if (class11_sub45_sub20 != null)
				return class11_sub45_sub20.method3830(0);
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cp.A(" + bool + ','
					+ i + ')');
		}
	}

	final void method2467(byte i) {
		try {
			anInt5757++;
			if (aClass84_5774 != null) {
				if (method166(12607) == null)
					return;
				if (!aBool5776) {
					if (!aBool5775)
						aClass84_5774 = null;
					else {
						boolean bool = true;
						for (Class11 class11 = aClass84_5774.method584(-12261); class11 != null; class11 = aClass84_5774
								.method578(-15361)) {
							int i_5_ = (int) ((Class11) class11).aLong91;
							if ((aByteArray5760[i_5_] ^ 0xffffffff) != -2)
								method2471((byte) -82, 2, i_5_);
							if (aByteArray5760[i_5_] != 1)
								bool = false;
							else
								class11.method122(-75);
						}
						while ((anInt5773 ^ 0xffffffff) > ((((Class130) aClass130_5746).anIntArray1807).length ^ 0xffffffff)) {
							if ((((Class130) aClass130_5746).anIntArray1807[anInt5773]) == 0)
								anInt5773++;
							else {
								if (aClass187_5772.method1222((byte) 121)) {
									bool = false;
									break;
								}
								if ((aByteArray5760[anInt5773] ^ 0xffffffff) != -2)
									method2471((byte) -82, 2, anInt5773);
								if ((aByteArray5760[anInt5773] ^ 0xffffffff) != -2) {
									Class11 class11 = new Class11();
									((Class11) class11).aLong91 = (long) anInt5773;
									aClass84_5774
											.method589((byte) -13, class11);
									bool = false;
								}
								anInt5773++;
							}
						}
						if (bool) {
							anInt5773 = 0;
							aBool5775 = false;
						}
					}
				} else {
					boolean bool = true;
					for (Class11 class11 = aClass84_5774.method584(-12261); class11 != null; class11 = aClass84_5774
							.method578(-15361)) {
						int i_6_ = (int) ((Class11) class11).aLong91;
						if (aByteArray5760[i_6_] == 0)
							method2471((byte) -82, 1, i_6_);
						if ((aByteArray5760[i_6_] ^ 0xffffffff) == -1)
							bool = false;
						else
							class11.method122(-87);
					}
					while ((((Class130) aClass130_5746).anIntArray1807.length ^ 0xffffffff) < (anInt5773 ^ 0xffffffff)) {
						if (((((Class130) aClass130_5746).anIntArray1807[anInt5773]) ^ 0xffffffff) == -1)
							anInt5773++;
						else {
							if ((((Class82) aClass82_5767).anInt1136 ^ 0xffffffff) <= -251) {
								bool = false;
								break;
							}
							if (aByteArray5760[anInt5773] == 0)
								method2471((byte) -82, 1, anInt5773);
							if ((aByteArray5760[anInt5773] ^ 0xffffffff) == -1) {
								Class11 class11 = new Class11();
								((Class11) class11).aLong91 = (long) anInt5773;
								bool = false;
								aClass84_5774.method589((byte) -13, class11);
							}
							anInt5773++;
						}
					}
					if (bool) {
						anInt5773 = 0;
						aBool5776 = false;
					}
				}
			}
			if (aBool5778
					&& ((aLong5779 ^ 0xffffffffffffffffL) >= (Class137
							.method878((byte) -101) ^ 0xffffffffffffffffL))) {
				for (Class11_Sub45_Sub20 class11_sub45_sub20 = ((Class11_Sub45_Sub20) aClass213_5748
						.method1365(24490)); class11_sub45_sub20 != null; class11_sub45_sub20 = ((Class11_Sub45_Sub20) aClass213_5748
						.method1367((byte) 71))) {
					if (!((Class11_Sub45_Sub20) class11_sub45_sub20).aBool9737) {
						if (!((Class11_Sub45_Sub20) class11_sub45_sub20).aBool9735)
							((Class11_Sub45_Sub20) class11_sub45_sub20).aBool9735 = true;
						else {
							if (!((Class11_Sub45_Sub20) class11_sub45_sub20).aBool9736)
								throw new RuntimeException();
							class11_sub45_sub20.method122(-116);
						}
					}
				}
				aLong5779 = 1000L + Class137.method878((byte) -55);
			}
			int i_7_ = 66 / ((i + 56) / 58);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cp.M(" + i + ')');
		}
	}

	public static void method2468(byte i) {
		do {
			try {
				aClass22_5758 = null;
				aClass209Array5765 = null;
				if (i <= -19)
					break;
				method2468((byte) 101);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "cp.F(" + i + ')');
			}
			break;
		} while (false);
	}

	final byte[] method165(int i, int i_8_) {
		try {
			anInt5770++;
			if (i_8_ != -23159)
				aByteArray5752 = null;
			Class11_Sub45_Sub20 class11_sub45_sub20 = method2471((byte) -82, 0,
					i);
			if (class11_sub45_sub20 == null)
				return null;
			byte[] is = class11_sub45_sub20.method3833((byte) 68);
			class11_sub45_sub20.method122(-55);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cp.E(" + i + ','
					+ i_8_ + ')');
		}
	}

	final int method2469(int i) {
		try {
			anInt5771++;
			if (aClass130_5746 == null)
				return 0;
			if (i != 0)
				anInt5756 = -64;
			return ((Class130) aClass130_5746).anInt1800;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cp.I(" + i + ')');
		}
	}

	final int method2470(boolean bool) {
		try {
			anInt5764++;
			if (aClass130_5746 == null)
				return 0;
			if (!aBool5776)
				return ((Class130) aClass130_5746).anInt1800;
			if (bool != false)
				method2466((byte) -34);
			Class11 class11 = aClass84_5774.method584(-12261);
			if (class11 == null)
				return 0;
			return (int) ((Class11) class11).aLong91;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cp.K(" + bool + ')');
		}
	}

	final void method163(byte i, int i_9_) {
		try {
			anInt5755++;
			if (aClass243_5744 != null) {
				for (Class11 class11 = aClass84_5777.method584(i - 12262); class11 != null; class11 = aClass84_5777
						.method578(-15361)) {
					if (((long) i_9_ ^ 0xffffffffffffffffL) == (((Class11) class11).aLong91 ^ 0xffffffffffffffffL))
						return;
				}
				if (i != 1)
					method2468((byte) 14);
				Class11 class11 = new Class11();
				((Class11) class11).aLong91 = (long) i_9_;
				aClass84_5777.method589((byte) -13, class11);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cp.D(" + i + ','
					+ i_9_ + ')');
		}
	}

	private final Class11_Sub45_Sub20 method2471(byte i, int i_10_, int i_11_) {
		try {
			anInt5768++;
			if (i != -82)
				method2475((byte) 22);
			Class11_Sub45_Sub20 class11_sub45_sub20 = ((Class11_Sub45_Sub20) aClass213_5748
					.method1369((byte) 26, (long) i_11_));
			if (class11_sub45_sub20 != null && i_10_ == 0
					&& !((Class11_Sub45_Sub20) class11_sub45_sub20).aBool9736
					&& ((Class11_Sub45_Sub20) class11_sub45_sub20).aBool9737) {
				class11_sub45_sub20.method122(i - 32);
				class11_sub45_sub20 = null;
			}
			if (class11_sub45_sub20 == null) {
				if ((i_10_ ^ 0xffffffff) != -1) {
					if (i_10_ != 1) {
						if (i_10_ != 2)
							throw new RuntimeException();
						if (aClass243_5744 == null)
							throw new RuntimeException();
						if ((aByteArray5760[i_11_] ^ 0xffffffff) != 0)
							throw new RuntimeException();
						if (!aClass187_5772.method1222((byte) 119))
							class11_sub45_sub20 = aClass187_5772.method1217(
									(byte) 75, false, (byte) 2, i_11_,
									anInt5759);
						else
							return null;
					} else {
						if (aClass243_5744 == null)
							throw new RuntimeException();
						class11_sub45_sub20 = aClass82_5767.method567(i_11_,
								aClass243_5744, 77);
					}
				} else if (aClass243_5744 == null
						|| (aByteArray5760[i_11_] ^ 0xffffffff) == 0) {
					if (!aClass187_5772.method1229((byte) 125))
						class11_sub45_sub20 = aClass187_5772.method1217(
								(byte) 75, true, (byte) 2, i_11_, anInt5759);
					else
						return null;
				} else
					class11_sub45_sub20 = aClass82_5767.method571(i - 10888,
							i_11_, aClass243_5744);
				aClass213_5748.method1368((long) i_11_, class11_sub45_sub20,
						(byte) -26);
			}
			if (((Class11_Sub45_Sub20) class11_sub45_sub20).aBool9737)
				return null;
			byte[] is = class11_sub45_sub20.method3833((byte) 68);
			if (class11_sub45_sub20 instanceof Class11_Sub45_Sub20_Sub1) {
				try {
					if (is == null || is.length <= 2)
						throw new RuntimeException();
					Class376_Sub7_Sub5_Sub2.aCRC32_9984.reset();
					Class376_Sub7_Sub5_Sub2.aCRC32_9984.update(is, 0, -2
							+ is.length);
					int i_12_ = (int) Class376_Sub7_Sub5_Sub2.aCRC32_9984
							.getValue();
					if ((i_12_ ^ 0xffffffff) != (((Class130) aClass130_5746).anIntArray1804[i_11_] ^ 0xffffffff))
						throw new RuntimeException();
					if (((Class130) aClass130_5746).aByteArrayArray1818 != null
							&& (((Class130) aClass130_5746).aByteArrayArray1818[i_11_]) != null) {
						byte[] is_13_ = (((Class130) aClass130_5746).aByteArrayArray1818[i_11_]);
						byte[] is_14_ = Class91_Sub3_Sub1.method3652(is, -2
								+ is.length, -115, 0);
						for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -65; i_15_++) {
							if ((is_14_[i_15_] ^ 0xffffffff) != (is_13_[i_15_] ^ 0xffffffff))
								throw new RuntimeException();
						}
					}
					int i_16_ = ((0xff & is[-1 + is.length]) + ((0xff & is[is.length - 2]) << 8));
					if (i_16_ != (0xffff & (((Class130) aClass130_5746).anIntArray1813[i_11_])))
						throw new RuntimeException();
					if ((aByteArray5760[i_11_] ^ 0xffffffff) != -2) {
						anInt5756++;
						aByteArray5760[i_11_] = (byte) 1;
					}
					if (!((Class11_Sub45_Sub20) class11_sub45_sub20).aBool9736)
						class11_sub45_sub20.method122(-122);
					return class11_sub45_sub20;
				} catch (Exception exception) {
					aByteArray5760[i_11_] = (byte) -1;
					class11_sub45_sub20.method122(-88);
					if (((Class11_Sub45_Sub20) class11_sub45_sub20).aBool9736
							&& !aClass187_5772.method1229((byte) 108)) {
						Class11_Sub45_Sub20_Sub2 class11_sub45_sub20_sub2 = aClass187_5772
								.method1217((byte) 75, true, (byte) 2, i_11_,
										anInt5759);
						aClass213_5748.method1368((long) i_11_,
								class11_sub45_sub20_sub2, (byte) -26);
					}
					return null;
				}
			}
			try {
				if (is == null || (is.length ^ 0xffffffff) >= -3)
					throw new RuntimeException();
				Class376_Sub7_Sub5_Sub2.aCRC32_9984.reset();
				Class376_Sub7_Sub5_Sub2.aCRC32_9984
						.update(is, 0, is.length - 2);
				int i_17_ = (int) Class376_Sub7_Sub5_Sub2.aCRC32_9984
						.getValue();
				if (i_17_ != ((Class130) aClass130_5746).anIntArray1804[i_11_])
					throw new RuntimeException();
				if (((Class130) aClass130_5746).aByteArrayArray1818 != null
						&& (((Class130) aClass130_5746).aByteArrayArray1818[i_11_] != null)) {
					byte[] is_18_ = (((Class130) aClass130_5746).aByteArrayArray1818[i_11_]);
					byte[] is_19_ = Class91_Sub3_Sub1.method3652(is,
							is.length - 2, -113, 0);
					for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > -65; i_20_++) {
						if ((is_19_[i_20_] ^ 0xffffffff) != (is_18_[i_20_] ^ 0xffffffff))
							throw new RuntimeException();
					}
				}
				((Class187) aClass187_5772).anInt2405 = 0;
				((Class187) aClass187_5772).anInt2407 = 0;
			} catch (RuntimeException runtimeexception) {
				aClass187_5772.method1225((byte) 105);
				class11_sub45_sub20.method122(-38);
				if (((Class11_Sub45_Sub20) class11_sub45_sub20).aBool9736
						&& !aClass187_5772.method1229((byte) 110)) {
					Class11_Sub45_Sub20_Sub2 class11_sub45_sub20_sub2 = aClass187_5772
							.method1217((byte) 75, true, (byte) 2, i_11_,
									anInt5759);
					aClass213_5748.method1368((long) i_11_,
							class11_sub45_sub20_sub2, (byte) -26);
				}
				return null;
			}
			is[is.length - 2] = (byte) (((Class130) aClass130_5746).anIntArray1813[i_11_] >>> 8);
			is[is.length - 1] = (byte) ((Class130) aClass130_5746).anIntArray1813[i_11_];
			if (aClass243_5744 != null) {
				aClass82_5767.method568(is, 29288, aClass243_5744, i_11_);
				if (aByteArray5760[i_11_] != 1) {
					anInt5756++;
					aByteArray5760[i_11_] = (byte) 1;
				}
			}
			if (!((Class11_Sub45_Sub20) class11_sub45_sub20).aBool9736)
				class11_sub45_sub20.method122(i + 3);
			return class11_sub45_sub20;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("cp.N(" + i + ','
					+ i_10_ + ',' + i_11_ + ')'));
		}
	}

	final void method2472(byte i) {
		do {
			try {
				anInt5753++;
				if (aClass243_5744 != null) {
					aBool5775 = true;
					if (aClass84_5774 == null)
						aClass84_5774 = new Class84();
					if (i == 68)
						break;
					aBool5775 = false;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "cp.L(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2473(int i, Class341 class341, Stream stream,
			byte i_21_) {
		do {
			try {
				anInt5747++;
				Class11_Sub41 class11_sub41 = new Class11_Sub41();
				((Class11_Sub41) class11_sub41).anInt7251 = stream
						.readUnsignedByte((byte) 35);
				((Class11_Sub41) class11_sub41).anInt7256 = stream.readInt(120);
				((Class11_Sub41) class11_sub41).aByteArrayArrayArray7257 = new byte[((Class11_Sub41) class11_sub41).anInt7251][][];
				((Class11_Sub41) class11_sub41).anIntArray7249 = new int[((Class11_Sub41) class11_sub41).anInt7251];
				((Class11_Sub41) class11_sub41).aClass368Array7253 = new Class368[((Class11_Sub41) class11_sub41).anInt7251];
				((Class11_Sub41) class11_sub41).anIntArray7252 = new int[((Class11_Sub41) class11_sub41).anInt7251];
				((Class11_Sub41) class11_sub41).aClass368Array7250 = new Class368[((Class11_Sub41) class11_sub41).anInt7251];
				((Class11_Sub41) class11_sub41).anIntArray7258 = new int[((Class11_Sub41) class11_sub41).anInt7251];
				for (int i_22_ = 0; ((i_22_ ^ 0xffffffff) > (((Class11_Sub41) class11_sub41).anInt7251 ^ 0xffffffff)); i_22_++) {
					try {
						int i_23_ = stream.readUnsignedByte((byte) 35);
						if ((i_23_ ^ 0xffffffff) != -1 && i_23_ != 1
								&& i_23_ != 2) {
							if (i_23_ == 3 || (i_23_ ^ 0xffffffff) == -5) {
								String string = stream.readString(i_21_ - 1);
								String string_24_ = stream.readString(-1);
								int i_25_ = stream.readUnsignedByte((byte) 35);
								String[] strings = new String[i_25_];
								for (int i_26_ = 0; i_26_ < i_25_; i_26_++)
									strings[i_26_] = stream.readString(-1);
								byte[][] is = new byte[i_25_][];
								if (i_23_ == 3) {
									for (int i_27_ = 0; ((i_27_ ^ 0xffffffff) > (i_25_ ^ 0xffffffff)); i_27_++) {
										int i_28_ = stream.readInt(90);
										is[i_27_] = new byte[i_28_];
										stream.readBytes(is[i_27_], 4, i_28_, 0);
									}
								}
								((Class11_Sub41) class11_sub41).anIntArray7249[i_22_] = i_23_;
								Class[] var_classes = new Class[i_25_];
								for (int i_29_ = 0; i_25_ > i_29_; i_29_++)
									var_classes[i_29_] = Class210
											.getClassByName((strings[i_29_]),
													113);
								((Class11_Sub41) class11_sub41).aClass368Array7253[i_22_] = (class341
										.method2062(255, string_24_,
												var_classes, Class210
														.getClassByName(string,
																109)));
								((Class11_Sub41) class11_sub41).aByteArrayArrayArray7257[i_22_] = is;
							}
						} else {
							String string = stream.readString(-1);
							String string_30_ = stream.readString(-1);
							int i_31_ = 0;
							if (i_23_ == 1)
								i_31_ = stream.readInt(122);
							((Class11_Sub41) class11_sub41).anIntArray7249[i_22_] = i_23_;
							((Class11_Sub41) class11_sub41).anIntArray7258[i_22_] = i_31_;
							((Class11_Sub41) class11_sub41).aClass368Array7250[i_22_] = (class341
									.method2058(Class210.getClassByName(string,
											110), string_30_, 118));
						}
					} catch (ClassNotFoundException classnotfoundexception) {
						((Class11_Sub41) class11_sub41).anIntArray7252[i_22_] = -1;
					} catch (SecurityException securityexception) {
						((Class11_Sub41) class11_sub41).anIntArray7252[i_22_] = -2;
					} catch (NullPointerException nullpointerexception) {
						((Class11_Sub41) class11_sub41).anIntArray7252[i_22_] = -3;
					} catch (Exception exception) {
						((Class11_Sub41) class11_sub41).anIntArray7252[i_22_] = -4;
					} catch (Throwable throwable) {
						((Class11_Sub41) class11_sub41).anIntArray7252[i_22_] = -5;
					}
				}
				Class11_Sub45_Sub20_Sub1.aClass84_9948.method589((byte) -13,
						class11_sub41);
				if (i_21_ == 0)
					break;
				aClass22_5758 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("cp.P(" + i + ','
								+ (class341 != null ? "{...}" : "null") + ','
								+ (stream != null ? "{...}" : "null") + ','
								+ i_21_ + ')'));
			}
			break;
		} while (false);
	}

	final int method2474(boolean bool) {
		try {
			if (bool != true)
				anInt5773 = -24;
			anInt5749++;
			return anInt5756;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cp.J(" + bool + ')');
		}
	}

	final int method2475(byte i) {
		try {
			anInt5751++;
			if (method166(12607) == null) {
				if (aClass11_Sub45_Sub20_5750 == null)
					return 0;
				return aClass11_Sub45_Sub20_5750.method3830(0);
			}
			if (i >= -124)
				return 106;
			return 100;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cp.G(" + i + ')');
		}
	}

	Class19_Sub1(int i, Class243 class243, Class243 class243_32_,
			Class187 class187, Class82 class82, int i_33_, byte[] is,
			int i_34_, boolean bool) {
		aClass213_5748 = new Class213(16);
		anInt5773 = 0;
		aClass84_5777 = new Class84();
		aLong5779 = 0L;
		do {
			try {
				aClass243_5744 = class243;
				anInt5759 = i;
				do {
					if (aClass243_5744 == null) {
						aBool5776 = false;
						if (!client.aBool10531)
							break;
					}
					aBool5776 = true;
					aClass84_5774 = new Class84();
				} while (false);
				aBool5778 = bool;
				aClass243_5761 = class243_32_;
				aByteArray5752 = is;
				aClass82_5767 = class82;
				anInt5745 = i_33_;
				anInt5763 = i_34_;
				aClass187_5772 = class187;
				if (aClass243_5761 == null)
					break;
				aClass11_Sub45_Sub20_5750 = aClass82_5767.method571(-10970,
						anInt5759, aClass243_5761);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("cp.<init>(" + i
						+ ',' + (class243 != null ? "{...}" : "null") + ','
						+ (class243_32_ != null ? "{...}" : "null") + ','
						+ (class187 != null ? "{...}" : "null") + ','
						+ (class82 != null ? "{...}" : "null") + ',' + i_33_
						+ ',' + (is != null ? "{...}" : "null") + ',' + i_34_
						+ ',' + bool + ')'));
			}
			break;
		} while (false);
	}
}
