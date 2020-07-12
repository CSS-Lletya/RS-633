/* Class11_Sub2_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub28 extends Class11_Sub2 {
	static int anInt9419;
	static int anInt9420 = -1;
	static int anInt9421;
	static IncomingPacket aClass160_9422;
	static Class203[] aClass203Array9423;
	static int anInt9424;
	private int anInt9425 = 4096;
	private int[] anIntArray9426;
	private int anInt9427;
	static int anInt9428;
	static int anInt9429;
	private int anInt9430 = 409;
	static int anInt9431;
	private int anInt9432;
	static int[][] anIntArrayArray9433 = { { 2, 4, 6, 0 }, { 0, 2, 4, 6 },
			{ 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 },
			{ 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 },
			{ 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 },
			{ 2, 4, 6, 0 } };
	static IncomingPacket aClass160_9434;

	static final void method3715(boolean bool, int i, String string) {
		try {
			if (bool != true)
				method3716(false);
			anInt9421++;
			Class300.method1852(-120, string, "", 0, "", "", i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ph.E(" + bool + ','
					+ i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3716(boolean bool) {
		try {
			anInt9419++;
			Class119 class119 = null;
			try {
				class119 = Class341.method2054("2", (byte) -45);
				Stream stream = new Stream(3 + Class236.anInt3221 * 6);
				stream.writeByte(1, -1528071456);
				stream.writeShort(-126, Class236.anInt3221);
				for (int i = 0; i < Class11_Sub2_Sub20.anIntArray9148.length; i++) {
					if (Class299.aBoolArray4037[i]) {
						stream.writeShort(-126, i);
						stream.writeInt(-49,
								(Class11_Sub2_Sub20.anIntArray9148[i]));
					}
				}
				class119.method782(0, ((Stream) stream).position,
						((Stream) stream).buffer, true);
			} catch (Exception exception) {
				/* empty */
			}
			try {
				if (class119 != null)
					class119.method777(-32);
			} catch (Exception exception) {
				/* empty */
			}
			Class347.aLong4598 = Class137.method878((byte) -103);
			Class217_Sub1.aBool5525 = bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ph.F(" + bool + ')');
		}
	}

	final void method2263(int i, Stream stream, int i_0_) {
		while_148_: do {
			try {
				anInt9431++;
				if (i == 3731) {
					int i_1_ = i_0_;
					while_147_: do {
						while_146_: do {
							while_145_: do {
								do {
									if (i_1_ != 0) {
										if ((i_1_ ^ 0xffffffff) == -2)
											break;
										if ((i_1_ ^ 0xffffffff) == -3)
											break while_145_;
										if (i_1_ == 3)
											break while_146_;
										if (i_1_ != 4)
											break while_148_;
										if (!client.aBool10531)
											break while_147_;
									}
									anInt9430 = stream
											.readUnsignedShort((byte) -65);
									return;
								} while (false);
								anInt9432 = stream
										.readUnsignedShort((byte) -65);
								return;
							} while (false);
							anInt9427 = stream.readUnsignedShort((byte) -65);
							return;
						} while (false);
						anInt9425 = stream.readUnsignedShort((byte) -65);
						return;
					} while (false);
					int i_2_ = stream.method2558(false);
					anIntArray9426[2] = Class77.method529(255, i_2_) >> 12;
					anIntArray9426[0] = Class77.method529(267386880, i_2_ << 4);
					anIntArray9426[1] = Class77.method529(4080, i_2_ >> 4);
					break;
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("ph.B(" + i + ','
								+ (stream != null ? "{...}" : "null") + ','
								+ i_0_ + ')'));
			}
		} while (false);
	}

	final int[][] method2255(int i, int i_3_) {
		try {
			anInt9424++;
			int[][] is = ((Class11_Sub2) this).aClass291_5038.method1799(
					i_3_ - 1, i);
			if (i_3_ != 1)
				method2263(89, null, -18);
			if (((Class291) ((Class11_Sub2) this).aClass291_5038).aBool3943) {
				int[][] is_4_ = this.method2262(i, -55, 0);
				int[] is_5_ = is_4_[0];
				int[] is_6_ = is_4_[1];
				int[] is_7_ = is_4_[2];
				int[] is_8_ = is[0];
				int[] is_9_ = is[1];
				int[] is_10_ = is[2];
				for (int i_11_ = 0; Class33_Sub2.anInt6696 > i_11_; i_11_++) {
					int i_12_ = is_5_[i_11_];
					int i_13_ = i_12_ + -anIntArray9426[0];
					if (i_13_ < 0)
						i_13_ = -i_13_;
					if ((anInt9430 ^ 0xffffffff) > (i_13_ ^ 0xffffffff)) {
						is_8_[i_11_] = i_12_;
						is_9_[i_11_] = is_6_[i_11_];
						is_10_[i_11_] = is_7_[i_11_];
					} else {
						int i_14_ = is_6_[i_11_];
						i_13_ = i_14_ + -anIntArray9426[1];
						if (i_13_ < 0)
							i_13_ = -i_13_;
						if (anInt9430 < i_13_) {
							is_8_[i_11_] = i_12_;
							is_9_[i_11_] = i_14_;
							is_10_[i_11_] = is_7_[i_11_];
						} else {
							int i_15_ = is_7_[i_11_];
							i_13_ = i_15_ + -anIntArray9426[2];
							if (i_13_ < 0)
								i_13_ = -i_13_;
							if (anInt9430 < i_13_) {
								is_8_[i_11_] = i_12_;
								is_9_[i_11_] = i_14_;
								is_10_[i_11_] = i_15_;
							} else {
								is_8_[i_11_] = i_12_ * anInt9425 >> 12;
								is_9_[i_11_] = anInt9427 * i_14_ >> 12;
								is_10_[i_11_] = i_15_ * anInt9432 >> 12;
							}
						}
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ph.I(" + i + ','
					+ i_3_ + ')');
		}
	}

	public static void method3717(byte i) {
		try {
			aClass203Array9423 = null;
			if (i >= 0)
				aClass160_9422 = null;
			anIntArrayArray9433 = null;
			aClass160_9422 = null;
			aClass160_9434 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ph.G(" + i + ')');
		}
	}

	public Class11_Sub2_Sub28() {
		super(1, false);
		anInt9427 = 4096;
		anInt9432 = 4096;
		anIntArray9426 = new int[3];
	}

	static final void method3718(int i) {
		try {
			if (i < 72)
				method3715(false, -110, null);
			Class11_Sub31.aClass163_6702.method1042(Class57.aFloat862,
					Class11_Sub31.aFloat6705, (Class11_Sub20_Sub2.aFloat9496));
			anInt9429++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ph.C(" + i + ')');
		}
	}

	static {
		aClass160_9422 = new IncomingPacket(59, 4);
		aClass160_9434 = new IncomingPacket(4, -1);
	}
}
