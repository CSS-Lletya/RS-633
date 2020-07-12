/* Class11_Sub45_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub45_Sub21 extends Class11_Sub45 {
	static int anInt9762;
	char[] aCharArray9763;
	static int[] anIntArray9764;
	static int anInt9765 = 50;
	static int anInt9766;
	static int anInt9767;
	String aString9768;
	static String[] aStringArray9769;
	static int[] anIntArray9770 = new int[anInt9765];
	int[] anIntArray9771;
	int[] anIntArray9772;
	static int[] anIntArray9773;
	static int[] anIntArray9774;
	static byte[][] aByteArrayArray9775;
	static int[] anIntArray9776;
	static int anInt9777;
	static int anInt9778;
	static int anInt9779;
	char[] aCharArray9780;
	static int[] anIntArray9781;

	static final void method3843(int i, Stream stream) {
		try {
			if (i == 32768) {
				for (int i_0_ = 0; i_0_ < Class57_Sub1.anInt5884; i_0_++) {
					int i_1_ = stream.readSmart(-90);
					int i_2_ = stream.readUnsignedShort((byte) -65);
					if (i_2_ == 65535)
						i_2_ = -1;
					if (Class47.aClass195_Sub1Array745[i_1_] != null)
						((Class195) Class47.aClass195_Sub1Array745[i_1_]).anInt2650 = i_2_;
				}
				anInt9778++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("eaa.E(" + i + ','
					+ (stream != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method3844(Stream stream, int i, int i_3_) {
		try {
			if (i_3_ == -12558) {
				anInt9779++;
				if (i == 1)
					((Class11_Sub45_Sub21) this).aString9768 = stream
							.readString(-1);
				else if ((i ^ 0xffffffff) != -3) {
					if (i == 3) {
						int i_4_ = stream.readUnsignedByte((byte) 35);
						((Class11_Sub45_Sub21) this).anIntArray9772 = new int[i_4_];
						((Class11_Sub45_Sub21) this).aCharArray9763 = new char[i_4_];
						for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
							((Class11_Sub45_Sub21) this).anIntArray9772[i_5_] = stream
									.readUnsignedShort((byte) -65);
							byte i_6_ = stream.readByte(1854307120);
							((Class11_Sub45_Sub21) this).aCharArray9763[i_5_] = (i_6_ == 0 ? '\0'
									: Class64.method486(i_6_, i_3_ + 12558));
						}
					}
				} else {
					int i_7_ = stream.readUnsignedByte((byte) 35);
					((Class11_Sub45_Sub21) this).aCharArray9780 = new char[i_7_];
					((Class11_Sub45_Sub21) this).anIntArray9771 = new int[i_7_];
					for (int i_8_ = 0; i_7_ > i_8_; i_8_++) {
						((Class11_Sub45_Sub21) this).anIntArray9771[i_8_] = stream
								.readUnsignedShort((byte) -65);
						byte i_9_ = stream.readByte(1854307120);
						((Class11_Sub45_Sub21) this).aCharArray9780[i_8_] = ((i_9_ ^ 0xffffffff) != -1 ? Class64
								.method486(i_9_, 0) : '\0');
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("eaa.G("
					+ (stream != null ? "{...}" : "null") + ',' + i + ','
					+ i_3_ + ')'));
		}
	}

	final void method3845(byte i) {
		do {
			try {
				if (((Class11_Sub45_Sub21) this).anIntArray9772 != null) {
					for (int i_10_ = 0; i_10_ < (((Class11_Sub45_Sub21) this).anIntArray9772).length; i_10_++)
						((Class11_Sub45_Sub21) this).anIntArray9772[i_10_] = Class173
								.method1134(
										(((Class11_Sub45_Sub21) this).anIntArray9772[i_10_]),
										32768);
				}
				anInt9762++;
				if (((Class11_Sub45_Sub21) this).anIntArray9771 != null) {
					for (int i_11_ = 0; i_11_ < (((Class11_Sub45_Sub21) this).anIntArray9771).length; i_11_++)
						((Class11_Sub45_Sub21) this).anIntArray9771[i_11_] = Class173
								.method1134(
										(((Class11_Sub45_Sub21) this).anIntArray9771[i_11_]),
										32768);
				}
				if (i == 101)
					break;
				method3843(-87, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "eaa.A(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method3846(char c, int i) {
		try {
			anInt9767++;
			if (((Class11_Sub45_Sub21) this).anIntArray9772 == null)
				return -1;
			int i_12_ = 0;
			if (i <= 112)
				method3843(101, null);
			for (/**/; ((i_12_ ^ 0xffffffff) > (((Class11_Sub45_Sub21) this).anIntArray9772.length ^ 0xffffffff)); i_12_++) {
				if ((((Class11_Sub45_Sub21) this).aCharArray9763[i_12_] ^ 0xffffffff) == (c ^ 0xffffffff))
					return ((Class11_Sub45_Sub21) this).anIntArray9772[i_12_];
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eaa.C(" + c + ',' + i
					+ ')');
		}
	}

	public static void method3847(byte i) {
		do {
			try {
				aByteArrayArray9775 = null;
				aStringArray9769 = null;
				anIntArray9773 = null;
				anIntArray9781 = null;
				anIntArray9774 = null;
				anIntArray9770 = null;
				anIntArray9776 = null;
				anIntArray9764 = null;
				if (i >= 54)
					break;
				anIntArray9764 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "eaa.D(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method3848(Stream stream, int i) {
		try {
			anInt9777++;
			for (;;) {
				int i_13_ = stream.readUnsignedByte((byte) 35);
				if (i_13_ == 0)
					break;
				method3844(stream, i_13_, -12558);
			}
			int i_14_ = -120 / ((-47 - i) / 58);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eaa.B("
					+ (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final int method3849(byte i, char c) {
		try {
			anInt9766++;
			if (i != -43)
				return -15;
			if (((Class11_Sub45_Sub21) this).anIntArray9771 == null)
				return -1;
			for (int i_15_ = 0; i_15_ < ((Class11_Sub45_Sub21) this).anIntArray9771.length; i_15_++) {
				if (((Class11_Sub45_Sub21) this).aCharArray9780[i_15_] == c)
					return ((Class11_Sub45_Sub21) this).anIntArray9771[i_15_];
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eaa.F(" + i + ',' + c
					+ ')');
		}
	}

	public Class11_Sub45_Sub21() {
		/* empty */
	}

	static {
		aStringArray9769 = new String[anInt9765];
		anIntArray9773 = new int[anInt9765];
		anIntArray9774 = new int[anInt9765];
		anIntArray9764 = new int[anInt9765];
		anIntArray9781 = new int[anInt9765];
		anIntArray9776 = new int[anInt9765];
	}
}
