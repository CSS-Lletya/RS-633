/* Class218 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class218 {
	static int anInt3004;
	static int anInt3005;
	static int anInt3006;
	static int anInt3007;
	static int anInt3008;
	static int anInt3009;
	static int anInt3010;
	static byte[] aByteArray3011 = new byte[2048];
	static int anInt3012;

	public Class218() {
		/* empty */
	}

	static final void sendDynamicMapRegion(int i) {
		do {
			try {
				Class141.anInt1915 = Class3.packetStream
						.readUnsignedByte((byte) 35);
				anInt3012++;
				boolean bool = ((Class3.packetStream
						.readUnsignedByteC(i - 6093) ^ 0xffffffff) == -2);
				int i_0_ = Class3.packetStream.readUnsignedShort128(true);
				int i_1_ = Class3.packetStream.readUnsignedShort((byte) -65);
				int i_2_ = Class3.packetStream.readUnsigned128Byte(true);
				Class33.method291(i - 146);
				Class11_Sub12_Sub2.method3560(i_2_, false);
				Class3.packetStream.method3427(7);
				for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -5; i_3_++) {
					for (int i_4_ = 0; i_4_ < Class300.anInt4051 >> 3; i_4_++) {
						for (int i_5_ = 0; i_5_ < Class108_Sub12.anInt6228 >> 3; i_5_++) {
							int i_6_ = Class3.packetStream.readBits(1,
									(byte) 108);
							if (i_6_ == 1)
								Class108_Sub18.anIntArrayArrayArray6923[i_3_][i_4_][i_5_] = Class3.packetStream
										.readBits(26, (byte) 108);
							else
								Class108_Sub18.anIntArrayArrayArray6923[i_3_][i_4_][i_5_] = -1;
						}
					}
				}
				Class3.packetStream.finishBitAccess((byte) 127);
				int i_7_ = (-((Stream) Class3.packetStream).position + Class37.anInt486) / 16;
				Class321_Sub2.anIntArrayArray6639 = new int[i_7_][4];
				for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
					for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -5; i_9_++)
						Class321_Sub2.anIntArrayArray6639[i_8_][i_9_] = Class3.packetStream
								.readInt(126);
				}
				Class11_Sub45_Sub16_Sub2.aByteArrayArray10171 = new byte[i_7_][];
				Class256.anIntArray3507 = new int[i_7_];
				Class11_Sub2_Sub23.aByteArrayArray9266 = new byte[i_7_][];
				Class376_Sub2.aByteArrayArray5568 = null;
				Class373.anIntArray4880 = null;
				Class11_Sub45_Sub21.aByteArrayArray9775 = new byte[i_7_][];
				Class2_Sub9.anIntArray7281 = new int[i_7_];
				Class345.anIntArray4585 = new int[i_7_];
				Class253_Sub2.anIntArray6535 = new int[i_7_];
				Class183.anIntArray2362 = new int[i_7_];
				Class11_Sub35.aByteArrayArray7006 = new byte[i_7_][];
				i_7_ = 0;
				for (int i_10_ = 0; i_10_ < 4; i_10_++) {
					for (int i_11_ = 0; ((i_11_ ^ 0xffffffff) > (Class300.anInt4051 >> 3 ^ 0xffffffff)); i_11_++) {
						for (int i_12_ = 0; i_12_ < Class108_Sub12.anInt6228 >> 3; i_12_++) {
							int i_13_ = (Class108_Sub18.anIntArrayArrayArray6923[i_10_][i_11_][i_12_]);
							if (i_13_ != -1) {
								int i_14_ = 0x3ff & i_13_ >> 14;
								int i_15_ = (i_13_ & 0x3ffa) >> 3;
								int i_16_ = (i_14_ / 8 << 8) - -(i_15_ / 8);
								for (int i_17_ = 0; i_17_ < i_7_; i_17_++) {
									if ((i_16_ ^ 0xffffffff) == (Class183.anIntArray2362[i_17_] ^ 0xffffffff)) {
										i_16_ = -1;
										break;
									}
								}
								if ((i_16_ ^ 0xffffffff) != 0) {
									Class183.anIntArray2362[i_7_] = i_16_;
									int i_18_ = 0xff & i_16_ >> 8;
									int i_19_ = 0xff & i_16_;
									Class345.anIntArray4585[i_7_] = (Class14.aClass146_125
											.method920(i + 89, "m" + i_18_
													+ "_" + i_19_));
									Class256.anIntArray3507[i_7_] = (Class14.aClass146_125
											.method920(113, "l" + i_18_ + "_"
													+ i_19_));
									Class253_Sub2.anIntArray6535[i_7_] = (Class14.aClass146_125
											.method920(
													Class77.method527(i, -28),
													"um" + i_18_ + "_" + i_19_));
									Class2_Sub9.anIntArray7281[i_7_] = (Class14.aClass146_125
											.method920(-116, "ul" + i_18_ + "_"
													+ i_19_));
									i_7_++;
								}
							}
						}
					}
				}
				Class124.method811(11, bool, i_1_, i_0_, false);
				if (i == 26)
					break;
				anInt3004 = -75;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "kt.A(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method1402(boolean bool) {
		do {
			try {
				aByteArray3011 = null;
				if (bool == true)
					break;
				method1403(-114, 90, 43);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "kt.C(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method1403(int i, int i_20_, int i_21_) {
		try {
			if (i != 11)
				aByteArray3011 = null;
			anInt3009++;
			Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
					-652872096, 5, i_21_);
			class11_sub45_sub15.method3661(0);
			((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363 = i_20_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kt.B(" + i + ','
					+ i_20_ + ',' + i_21_ + ')'));
		}
	}

	public final String toString() {
		try {
			anInt3006++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kt.toString(" + ')');
		}
	}
}
