/* Class195_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class195_Sub1 extends Class195 {
	static Class22 aClass22_6153 = new Class22(4);
	String aString6154;
	static int anInt6155;
	int anInt6156 = -1;
	static IncomingPacket BLACKOUT_IN_PACKET = new IncomingPacket(103, 1);
	static int anInt6158;
	int anInt6159;
	String aString6160;
	static int anInt6161;

	static final void method2625(int i, int i_0_, int i_1_, int i_2_,
			Class11_Sub19 class11_sub19, int i_3_) {
		while_244_: do {
			do {
				try {
					anInt6155++;
					if ((((Class11_Sub19) class11_sub19).anInt5842 ^ 0xffffffff) == 0
							&& (((Class11_Sub19) class11_sub19).anIntArray5816 == null))
						break;
					int i_4_ = 0;
					int i_5_ = ((((Class11_Sub19) class11_sub19).anInt5836 * ((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub8_5725
							.method2462(false)) >> 8);
					if (i_1_ != 11908)
						aClass22_6153 = null;
					if ((i_3_ ^ 0xffffffff) >= (((Class11_Sub19) class11_sub19).anInt5819 ^ 0xffffffff)) {
						if ((((Class11_Sub19) class11_sub19).anInt5828 ^ 0xffffffff) < (i_3_ ^ 0xffffffff))
							i_4_ += -i_3_
									+ (((Class11_Sub19) class11_sub19).anInt5828);
					} else
						i_4_ += (-((Class11_Sub19) class11_sub19).anInt5819 + i_3_);
					if (((Class11_Sub19) class11_sub19).anInt5832 < i)
						i_4_ += i - ((Class11_Sub19) class11_sub19).anInt5832;
					else if ((((Class11_Sub19) class11_sub19).anInt5814 ^ 0xffffffff) < (i ^ 0xffffffff))
						i_4_ += ((Class11_Sub19) class11_sub19).anInt5814 - i;
					if ((((Class11_Sub19) class11_sub19).anInt5821 ^ 0xffffffff) == -1
							|| (-256 + i_4_ > ((Class11_Sub19) class11_sub19).anInt5821)
							|| ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5725
									.method2462(false) == 0
							|| i_0_ != ((Class11_Sub19) class11_sub19).anInt5823) {
						if ((((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830) != null) {
							Class233.aClass11_Sub6_Sub1_3185
									.method3464(((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830);
							((Class11_Sub19) class11_sub19).aClass11_Sub14_Sub1_5824 = null;
							((Class11_Sub19) class11_sub19).aClass11_Sub13_5825 = null;
							((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830 = null;
						}
						if ((((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5838) != null) {
							Class233.aClass11_Sub6_Sub1_3185
									.method3464(((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5838);
							((Class11_Sub19) class11_sub19).aClass11_Sub13_5837 = null;
							((Class11_Sub19) class11_sub19).aClass11_Sub14_Sub1_5813 = null;
							((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5838 = null;
						}
						break;
					}
					i_4_ -= 256;
					if (i_4_ < 0)
						i_4_ = 0;
					int i_6_ = (i_5_
							* (((Class11_Sub19) class11_sub19).anInt5821 + -i_4_) / ((Class11_Sub19) class11_sub19).anInt5821);
					Class11_Sub2_Sub8.myPlayer.method3968((byte) 127);
					int i_7_ = 8192;
					int i_8_ = ((((Class11_Sub19) class11_sub19).anInt5828 + ((Class11_Sub19) class11_sub19).anInt5819) / 2 - i_3_);
					int i_9_ = ((((Class11_Sub19) class11_sub19).anInt5832 + ((Class11_Sub19) class11_sub19).anInt5814) / 2 + -i);
					if ((i_8_ ^ 0xffffffff) != -1 || i_9_ != 0) {
						int i_10_ = ((-Class171.anInt2193
								+ -(int) (2607.5945876176133 * Math.atan2(
										(double) i_8_, (double) i_9_)) - 4096) & 0x3fff);
						if (i_10_ > 8192)
							i_10_ = 16384 - i_10_;
						int i_11_;
						if (i_4_ <= 0)
							i_11_ = 8192;
						else if (i_4_ < 4096)
							i_11_ = 8192 - -(i_4_ * 8192 / 4096);
						else
							i_11_ = 16384;
						i_7_ = i_10_ * i_11_ / 8192 + (-i_11_ + 16384 >> 1);
					}
					if (((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830 != null) {
						((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830
								.method3677(i_6_);
						((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830
								.method3679(i_7_);
					} else if ((((Class11_Sub19) class11_sub19).anInt5842 ^ 0xffffffff) <= -1) {
						int i_12_ = (((((Class11_Sub19) class11_sub19).anInt5826 ^ 0xffffffff) != -257 || (((Class11_Sub19) class11_sub19).anInt5835 != 256)) ? (Class335_Sub3
								.method3141(
										i_1_ ^ ~0x2eda,
										((Class11_Sub19) class11_sub19).anInt5826,
										((Class11_Sub19) class11_sub19).anInt5835))
								: 256);
						if (!((Class11_Sub19) class11_sub19).aBool5834) {
							Class69 class69 = Class69.method506(
									Class135.aClass146_1863,
									((Class11_Sub19) class11_sub19).anInt5842,
									0);
							if (class69 != null) {
								Class11_Sub14_Sub1 class11_sub14_sub1 = (class69
										.method504()
										.method3654(Class11_Sub33.aClass165_6902));
								Class11_Sub6_Sub4 class11_sub6_sub4 = (Class11_Sub6_Sub4
										.method3674(class11_sub14_sub1, i_12_,
												i_6_ << 6, i_7_));
								class11_sub6_sub4.method3668(-1);
								Class233.aClass11_Sub6_Sub1_3185
										.method3459(class11_sub6_sub4);
								((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830 = class11_sub6_sub4;
							}
						} else {
							if ((((Class11_Sub19) class11_sub19).aClass11_Sub13_5825) == null)
								((Class11_Sub19) class11_sub19).aClass11_Sub13_5825 = (Class11_Sub13
										.method2388(
												Class280.aClass146_3789,
												(((Class11_Sub19) class11_sub19).anInt5842)));
							if ((((Class11_Sub19) class11_sub19).aClass11_Sub13_5825) != null) {
								if ((((Class11_Sub19) class11_sub19).aClass11_Sub14_Sub1_5824) == null)
									((Class11_Sub19) class11_sub19).aClass11_Sub14_Sub1_5824 = ((Class11_Sub19) class11_sub19).aClass11_Sub13_5825
											.method2398(new int[] { 22050 });
								if ((((Class11_Sub19) class11_sub19).aClass11_Sub14_Sub1_5824) != null) {
									Class11_Sub6_Sub4 class11_sub6_sub4 = (Class11_Sub6_Sub4
											.method3674(
													(((Class11_Sub19) class11_sub19).aClass11_Sub14_Sub1_5824),
													i_12_, i_6_ << 6, i_7_));
									class11_sub6_sub4.method3668(-1);
									Class233.aClass11_Sub6_Sub1_3185
											.method3459(class11_sub6_sub4);
									((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830 = class11_sub6_sub4;
								}
							}
						}
					}
					if (((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5838 == null) {
						if ((((Class11_Sub19) class11_sub19).anIntArray5816 != null)
								&& (((Class11_Sub19) class11_sub19).anInt5827 -= i_2_) <= 0) {
							int i_13_ = (((((Class11_Sub19) class11_sub19).anInt5826 != 256) || (((Class11_Sub19) class11_sub19).anInt5835) != 256) ? (((Class11_Sub19) class11_sub19).anInt5835 + (int) (Math
									.random() * (double) (-(((Class11_Sub19) class11_sub19).anInt5835) + (((Class11_Sub19) class11_sub19).anInt5826))))
									: 256);
							if (!((Class11_Sub19) class11_sub19).aBool5833) {
								int i_14_ = (int) (Math.random() * (double) (((Class11_Sub19) class11_sub19).anIntArray5816).length);
								Class69 class69 = Class69
										.method506(
												(Class135.aClass146_1863),
												(((Class11_Sub19) class11_sub19).anIntArray5816[i_14_]),
												0);
								if (class69 != null) {
									Class11_Sub14_Sub1 class11_sub14_sub1 = (class69
											.method504()
											.method3654(Class11_Sub33.aClass165_6902));
									Class11_Sub6_Sub4 class11_sub6_sub4 = (Class11_Sub6_Sub4
											.method3674(class11_sub14_sub1,
													i_13_, i_6_ << 6, i_7_));
									class11_sub6_sub4.method3668(0);
									Class233.aClass11_Sub6_Sub1_3185
											.method3459(class11_sub6_sub4);
									((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5838 = class11_sub6_sub4;
									((Class11_Sub19) class11_sub19).anInt5827 = ((int) (Math
											.random() * (double) ((((Class11_Sub19) class11_sub19).anInt5822) + -(((Class11_Sub19) class11_sub19).anInt5820))) + (((Class11_Sub19) class11_sub19).anInt5820));
								}
							} else {
								if ((((Class11_Sub19) class11_sub19).aClass11_Sub13_5837) == null) {
									int i_15_ = (int) (Math.random() * (double) (((Class11_Sub19) class11_sub19).anIntArray5816).length);
									((Class11_Sub19) class11_sub19).aClass11_Sub13_5837 = (Class11_Sub13
											.method2388(
													Class280.aClass146_3789,
													(((Class11_Sub19) class11_sub19).anIntArray5816[i_15_])));
								}
								if ((((Class11_Sub19) class11_sub19).aClass11_Sub13_5837) == null)
									break;
								if ((((Class11_Sub19) class11_sub19).aClass11_Sub14_Sub1_5813) == null)
									((Class11_Sub19) class11_sub19).aClass11_Sub14_Sub1_5813 = ((Class11_Sub19) class11_sub19).aClass11_Sub13_5837
											.method2398(new int[] { 22050 });
								if ((((Class11_Sub19) class11_sub19).aClass11_Sub14_Sub1_5813) == null)
									break;
								Class11_Sub6_Sub4 class11_sub6_sub4 = (Class11_Sub6_Sub4
										.method3674(
												(((Class11_Sub19) class11_sub19).aClass11_Sub14_Sub1_5813),
												i_13_, i_6_ << 6, i_7_));
								class11_sub6_sub4.method3668(0);
								Class233.aClass11_Sub6_Sub1_3185
										.method3459(class11_sub6_sub4);
								((Class11_Sub19) class11_sub19).anInt5827 = ((((Class11_Sub19) class11_sub19).anInt5820) - -(int) (Math
										.random() * (double) (-(((Class11_Sub19) class11_sub19).anInt5820) + (((Class11_Sub19) class11_sub19).anInt5822))));
								((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5838 = class11_sub6_sub4;
							}
							break;
						}
					} else {
						((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5838
								.method3677(i_6_);
						((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5838
								.method3679(i_7_);
						if (((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5838
								.method124(0))
							break while_244_;
						((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5838 = null;
						((Class11_Sub19) class11_sub19).aClass11_Sub13_5837 = null;
						((Class11_Sub19) class11_sub19).aClass11_Sub14_Sub1_5813 = null;
					}
				} catch (RuntimeException runtimeexception) {
					throw Class205.method1298(runtimeexception, ("oaa.A(" + i
							+ ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ','
							+ (class11_sub19 != null ? "{...}" : "null") + ','
							+ i_3_ + ')'));
				}
			} while (false);
			break;
		} while (false);
	}

	final Class193 method2626(byte i) {
		try {
			anInt6158++;
			if (i != 111)
				return null;
			return Class115.aClass193Array1570[((Class195) this).anInt2653];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oaa.D(" + i + ')');
		}
	}

	static final void decodeReceivedMapRegions(int i) {
		try {
			anInt6161++;
			Class141.anInt1915 = 0;
			int i_16_ = Class3.packetStream.readUnsignedShortLE(25651);
			int i_17_ = Class3.packetStream.readUnsignedShortLE128(126);
			boolean bool = Class3.packetStream.readUnsignedByte128(7925) == 1;
			int i_18_ = Class3.packetStream.readUnsignedByte128(7925);
			System.out.println(i_16_ + " " + i_17_);
			Class33.method291(-125);
			Class11_Sub12_Sub2.method3560(i_18_, false);
			int i_19_ = ((Class37.anInt486 - ((Stream) Class3.packetStream).position) / 16);
			Class321_Sub2.anIntArrayArray6639 = new int[i_19_][4];
			for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
				for (int i_21_ = 0; i_21_ < 4; i_21_++)
					Class321_Sub2.anIntArrayArray6639[i_20_][i_21_] = Class3.packetStream
							.readInt(117);
			}
			Class183.anIntArray2362 = new int[i_19_];
			Class256.anIntArray3507 = new int[i_19_];
			Class373.anIntArray4880 = null;
			Class11_Sub45_Sub16_Sub2.aByteArrayArray10171 = new byte[i_19_][];
			Class345.anIntArray4585 = new int[i_19_];
			Class376_Sub2.aByteArrayArray5568 = null;
			Class11_Sub45_Sub21.aByteArrayArray9775 = new byte[i_19_][];
			Class11_Sub35.aByteArrayArray7006 = new byte[i_19_][];
			Class253_Sub2.anIntArray6535 = new int[i_19_];
			if (i != 28123)
				method2625(-29, 111, 123, 13, null, -114);
			Class11_Sub2_Sub23.aByteArrayArray9266 = new byte[i_19_][];
			Class2_Sub9.anIntArray7281 = new int[i_19_];
			i_19_ = 0;
			for (int i_22_ = (-(Class300.anInt4051 >> 4) + i_17_) / 8; (i_17_ - -(Class300.anInt4051 >> 4)) / 8 >= i_22_; i_22_++) {
				for (int i_23_ = (i_16_ - (Class108_Sub12.anInt6228 >> 4)) / 8; ((i_23_ ^ 0xffffffff) >= (((Class108_Sub12.anInt6228 >> 4) + i_16_) / 8 ^ 0xffffffff)); i_23_++) {
					Class183.anIntArray2362[i_19_] = i_23_ + (i_22_ << 8);
					Class345.anIntArray4585[i_19_] = Class14.aClass146_125
							.method920(115, "m" + i_22_ + "_" + i_23_);
					Class256.anIntArray3507[i_19_] = Class14.aClass146_125
							.method920(110, "l" + i_22_ + "_" + i_23_);
					Class253_Sub2.anIntArray6535[i_19_] = Class14.aClass146_125
							.method920(118, "um" + i_22_ + "_" + i_23_);
					Class2_Sub9.anIntArray7281[i_19_] = Class14.aClass146_125
							.method920(111, "ul" + i_22_ + "_" + i_23_);
					i_19_++;
				}
			}
			Class124.method811(11, bool, i_17_, i_16_, false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oaa.C(" + i + ')');
		}
	}

	public static void method2628(int i) {
		try {
			if (i != -3759)
				aClass22_6153 = null;
			aClass22_6153 = null;
			BLACKOUT_IN_PACKET = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oaa.B(" + i + ')');
		}
	}
}
