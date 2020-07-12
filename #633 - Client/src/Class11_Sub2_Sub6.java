/* Class11_Sub2_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub6 extends Class11_Sub2 {
	static int anInt8698;
	static Class79 aClass79_8699;
	static int anInt8700;
	private int anInt8701 = 0;
	static int anInt8702 = 0;
	static int anInt8703;
	static int anInt8704;
	private int anInt8705 = 0;
	static String[] aStringArray8706;
	static int anInt8707 = 52;
	private int anInt8708 = 1;

	final int[] method2254(int i, boolean bool) {
		try {
			if (bool != true)
				return null;
			anInt8704++;
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
				int i_0_ = Class171.anIntArray2199[i];
				int i_1_ = -2048 + i_0_ >> 1;
				for (int i_2_ = 0; ((Class33_Sub2.anInt6696 ^ 0xffffffff) < (i_2_ ^ 0xffffffff)); i_2_++) {
					int i_3_ = Class208.anIntArray2808[i_2_];
					int i_4_ = i_3_ - 2048 >> 1;
					int i_5_;
					if (anInt8701 != 0) {
						int i_6_ = i_4_ * i_4_ + i_1_ * i_1_ >> 12;
						i_5_ = (int) (Math
								.sqrt((double) ((float) i_6_ / 4096.0F)) * 4096.0);
						i_5_ = (int) (3.141592653589793 * (double) (anInt8708 * i_5_));
					} else
						i_5_ = anInt8708 * (-i_0_ + i_3_);
					i_5_ -= ~0xfff & i_5_;
					if ((anInt8705 ^ 0xffffffff) == -1)
						i_5_ = 4096 + (Class11_Sub19.anIntArray5818[(i_5_ & 0xff1) >> 4]) >> 1;
					else if ((anInt8705 ^ 0xffffffff) == -3) {
						i_5_ -= 2048;
						if ((i_5_ ^ 0xffffffff) > -1)
							i_5_ = -i_5_;
						i_5_ = -i_5_ + 2048 << 1;
					}
					is[i_2_] = i_5_;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ac.A(" + i + ','
					+ bool + ')');
		}
	}

	public static void method3412(int i) {
		try {
			if (i == -4096) {
				aClass79_8699 = null;
				aStringArray8706 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ac.C(" + i + ')');
		}
	}

	static final int method3413(int i, int i_7_, boolean bool) {
		try {
			anInt8703++;
			if (bool != true)
				return -47;
			if (i == 1 || (i ^ 0xffffffff) == -4)
				return Class344.anIntArray4575[i_7_ & 0x3];
			return Class11_Sub20_Sub2.anIntArray9501[i_7_ & 0x3];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ac.E(" + i + ','
					+ i_7_ + ',' + bool + ')'));
		}
	}

	final void method2263(int i, Stream stream, int i_8_) {
		do {
			try {
				anInt8700++;
				int i_9_ = i_8_;
				while_104_: do {
					do {
						if ((i_9_ ^ 0xffffffff) != -1) {
							if ((i_9_ ^ 0xffffffff) != -2) {
								if (i_9_ == 3)
									break;
								break while_104_;
							}
						} else {
							anInt8701 = stream.readUnsignedByte((byte) 35);
							break while_104_;
						}
						anInt8705 = stream.readUnsignedByte((byte) 35);
						break while_104_;
					} while (false);
					anInt8708 = stream.readUnsignedByte((byte) 35);
				} while (false);
				if (i == 3731)
					break;
				aStringArray8706 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("ac.B(" + i + ','
								+ (stream != null ? "{...}" : "null") + ','
								+ i_8_ + ')'));
			}
			break;
		} while (false);
	}

	public Class11_Sub2_Sub6() {
		super(0, true);
	}

	final void method2256(int i) {
		do {
			try {
				anInt8698++;
				Class234_Sub1_Sub1.method3829(false);
				if (i == 7)
					break;
				method2254(-76, true);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ac.D(" + i + ')');
			}
			break;
		} while (false);
	}

	static {
		aClass79_8699 = new Class79(7, 0, 1, 1);
	}
}
