/* Class343 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class343 {
	static Class37 aClass37_4540;
	int anInt4541;
	int anInt4542;
	static Class56[] aClass56Array4543 = new Class56[50];
	int anInt4544;
	int anInt4545;
	int anInt4546;
	private boolean aBool4547 = false;
	int anInt4548;
	long aLong4549;
	int anInt4550;
	int anInt4551;
	int anInt4552 = 0;
	int anInt4553;
	static int anInt4554;
	static int anInt4555;
	static int anInt4556;
	int anInt4557;
	private int anInt4558;
	static int anInt4559;
	static int anInt4560;

	public static void method2077(byte i) {
		do {
			try {
				aClass37_4540 = null;
				aClass56Array4543 = null;
				if (i == 103)
					break;
				method2077((byte) -88);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ve.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final int method2078(int i, int i_0_, int i_1_) {
		try {
			anInt4560++;
			int i_2_ = i_1_ >>> 24;
			int i_3_ = 34 / ((i_0_ - 34) / 47);
			int i_4_ = 255 + -i_2_;
			i_1_ = ((0xff00 & i_1_) * i_2_ & 0xff0000 | ~0xff00ff
					& (0xff00ff & i_1_) * i_2_) >>> 8;
			return i_1_
					+ ((0xff0000 & (0xff00 & i) * i_4_ | ~0xff00ff & i_4_
							* (0xff00ff & i)) >>> 8);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ve.D(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method2079(byte i, Stream stream) {
		try {
			if (i >= -13)
				anInt4554 = -102;
			for (;;) {
				int i_5_ = stream.readUnsignedByte((byte) 35);
				if (i_5_ == 0)
					break;
				method2081((byte) 119, i_5_, stream);
			}
			anInt4555++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ve.B(" + i + ','
					+ (stream != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2080(byte i) {
		do {
			try {
				anInt4559++;
				((Class343) this).anInt4544 = Class335.anIntArray4430[anInt4558 << 3];
				long l = (long) ((Class343) this).anInt4550;
				long l_6_ = (long) ((Class343) this).anInt4546;
				long l_7_ = (long) ((Class343) this).anInt4557;
				((Class343) this).anInt4551 = (int) Math.sqrt((double) (l_7_
						* l_7_ + l * l + l_6_ * l_6_));
				if ((((Class343) this).anInt4548 ^ 0xffffffff) == -1)
					((Class343) this).anInt4548 = 1;
				if ((((Class343) this).anInt4553 ^ 0xffffffff) == -1)
					((Class343) this).aLong4549 = 2147483647L;
				else if (((Class343) this).anInt4553 == 1) {
					((Class343) this).aLong4549 = (long) (((Class343) this).anInt4551 * 8 / ((Class343) this).anInt4548);
					((Class343) this).aLong4549 *= ((Class343) this).aLong4549;
				} else if ((((Class343) this).anInt4553 ^ 0xffffffff) == -3)
					((Class343) this).aLong4549 = (long) (8 * ((Class343) this).anInt4551 / ((Class343) this).anInt4548);
				if (aBool4547)
					((Class343) this).anInt4551 *= -1;
				if (i >= 53)
					break;
				((Class343) this).anInt4550 = -27;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ve.C(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method2081(byte i, int i_8_, Stream stream) {
		do {
			try {
				anInt4556++;
				if (i_8_ != 1) {
					if ((i_8_ ^ 0xffffffff) == -3)
						stream.readUnsignedByte((byte) 35);
					else if (i_8_ != 3) {
						if ((i_8_ ^ 0xffffffff) != -5) {
							if (i_8_ == 6)
								((Class343) this).anInt4542 = stream
										.readUnsignedByte((byte) 35);
							else if ((i_8_ ^ 0xffffffff) == -9)
								((Class343) this).anInt4552 = 1;
							else if (i_8_ != 9) {
								if ((i_8_ ^ 0xffffffff) == -11)
									aBool4547 = true;
							} else
								((Class343) this).anInt4541 = 1;
						} else {
							((Class343) this).anInt4553 = stream
									.readUnsignedByte((byte) 35);
							((Class343) this).anInt4548 = stream.readInt(122);
						}
					} else {
						((Class343) this).anInt4550 = stream.readInt(96);
						((Class343) this).anInt4546 = stream.readInt(103);
						((Class343) this).anInt4557 = stream.readInt(99);
					}
				} else
					anInt4558 = stream.readUnsignedShort((byte) -65);
				if (i > 83)
					break;
				aClass56Array4543 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("ve.E(" + i + ',' + i_8_ + ','
								+ (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public Class343() {
		((Class343) this).anInt4541 = 0;
	}
}
