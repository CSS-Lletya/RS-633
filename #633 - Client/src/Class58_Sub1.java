/* Class58_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class58_Sub1 extends Class58 {
	static Class39 aClass39_7287;
	static int anInt7288;
	static int anInt7289;
	private int anInt7290;
	static boolean aBool7291 = false;
	static int anInt7292;
	private byte[] aByteArray7293;
	static int anInt7294;
	static int anInt7295;
	static int anInt7296;
	private int[] anIntArray7297;
	static int anInt7298;
	private int anInt7299;

	static final byte[] method2950(byte[] is, boolean bool) {
		try {
			anInt7292++;
			Stream stream = new Stream(is);
			int i = stream.readUnsignedByte((byte) 35);
			if (bool != false)
				aBool7291 = true;
			int i_0_ = stream.readInt(107);
			if (i_0_ < 0
					|| (Class234_Sub1_Sub1.anInt9730 != 0 && ((Class234_Sub1_Sub1.anInt9730 ^ 0xffffffff) > (i_0_ ^ 0xffffffff))))
				throw new RuntimeException();
			if (i != 0) {
				int i_1_ = stream.readInt(127);
				if (i_1_ > 10000000
						|| i_1_ < 0
						|| ((Class234_Sub1_Sub1.anInt9730 ^ 0xffffffff) != -1 && ((Class234_Sub1_Sub1.anInt9730 ^ 0xffffffff) > (i_1_ ^ 0xffffffff))))
					return new byte[100];
				byte[] is_2_ = new byte[i_1_];
				if ((i ^ 0xffffffff) == -2)
					Class284.method1756(is_2_, i_1_, is, i_0_, 9);
				else {
					synchronized (Class130.aClass191_1820) {
						Class130.aClass191_1820
								.method1238(false, is_2_, stream);
					}
				}
				return is_2_;
			}
			byte[] is_3_ = new byte[i_0_];
			stream.readBytes(is_3_, 4, i_0_, 0);
			return is_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rw.T("
					+ (is != null ? "{...}" : "null") + ',' + bool + ')');
		}
	}

	final void method453(int i, int i_4_, int i_5_) {
		do {
			try {
				anInt7290 += anIntArray7297[i] * i_4_ >> 12;
				anInt7289++;
				if (i_5_ == -101)
					break;
				aClass39_7287 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("rw.A(" + i + ','
						+ i_4_ + ',' + i_5_ + ')'));
			}
			break;
		} while (false);
	}

	void method2951(boolean bool, byte i, int i_6_) {
		do {
			try {
				anInt7295++;
				aByteArray7293[anInt7299++] = (byte) (127 + Class77.method529(
						127, i >> 1));
				if (bool == false)
					break;
				method2950(null, false);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("rw.D(" + bool
						+ ',' + i + ',' + i_6_ + ')'));
			}
			break;
		} while (false);
	}

	final void method461(int i) {
		try {
			anInt7299 = 0;
			if (i == 3) {
				anInt7290 = 0;
				anInt7296++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rw.I(" + i + ')');
		}
	}

	final void method454(byte i) {
		do {
			try {
				anInt7288++;
				anInt7290 = Math.abs(anInt7290);
				if ((anInt7290 ^ 0xffffffff) <= -4097)
					anInt7290 = 4095;
				method2951(false, (byte) (anInt7290 >> 4), anInt7299++);
				anInt7290 = 0;
				if (i == 58)
					break;
				method454((byte) -7);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "rw.E(" + i + ')');
			}
			break;
		} while (false);
	}

	Class58_Sub1(int i, int i_7_, int i_8_, int i_9_, int i_10_, float f) {
		super(i, i_7_, i_8_, i_9_, i_10_);
		try {
			anIntArray7297 = new int[((Class58) this).anInt869];
			for (int i_11_ = 0; ((i_11_ ^ 0xffffffff) > (((Class58) this).anInt869 ^ 0xffffffff)); i_11_++)
				anIntArray7297[i_11_] = (short) (int) (4096.0 * Math.pow(
						(double) f, (double) i_11_));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("rw.<init>(" + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_
							+ ',' + i_10_ + ',' + f + ')'));
		}
	}

	static final void method2952(int i) {
		try {
			anInt7298++;
			int i_12_ = Class190.anInt2446;
			int[] is = Class6.anIntArray40;
			for (int i_13_ = i; i_13_ < i_12_; i_13_++) {
				Player class376_sub7_sub5_sub5_sub1 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[is[i_13_]]);
				if (class376_sub7_sub5_sub5_sub1 != null)
					Class119.method778(i ^ ~0x46a0,
							class376_sub7_sub5_sub5_sub1,
							class376_sub7_sub5_sub5_sub1.method3968((byte) 127));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rw.U(" + i + ')');
		}
	}

	public static void method2953(boolean bool) {
		try {
			if (bool != true)
				aClass39_7287 = null;
			aClass39_7287 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rw.H(" + bool + ')');
		}
	}

	static final boolean method2954(int i, int i_14_, int i_15_) {
		try {
			anInt7294++;
			if (i != 33)
				return true;
			if ((0x21 & i_14_) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rw.J(" + i + ','
					+ i_14_ + ',' + i_15_ + ')'));
		}
	}

	static {
		aClass39_7287 = new Class39();
	}
}
