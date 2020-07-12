/* Class11_Sub47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub47 extends Class11 {
	static int anInt7985;
	byte[] aByteArray7986;
	static int anInt7987;
	static int anInt7988;

	static final void decodeLocalNPCMasks(int i) {
		do {
			try {
				for (int i_0_ = 0; i_0_ < Class11_Sub2_Sub22.anInt9204; i_0_++) {
					int i_1_ = Class94_Sub3.anIntArray6905[i_0_];
					Npc npc = (((Class11_Sub25) Class11_Sub2_Sub25.aClass213_9322
							.method1369((byte) 26, (long) i_1_)).aNpc_2373);

					int mask = Class3.packetStream.readUnsignedByte((byte) 35);
					if ((mask & 0x2) != 0)
						mask += Class3.packetStream.readUnsignedByte((byte) 35) << 8;

					if ((0x400 & mask) != 0) { // 1
						int i_3_ = Class3.packetStream
								.readUnsignedByte128(7925);
						int[] is = new int[i_3_];
						int[] is_4_ = new int[i_3_];
						for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff); i_5_++) {
							int i_6_ = Class3.packetStream
									.readUnsignedShortLE128(127);
							if ((0xc000 & i_6_) != 49152)
								is[i_5_] = i_6_;
							else {
								int i_7_ = Class3.packetStream
										.readUnsignedShort((byte) -65);
								is[i_5_] = Class173
										.method1134(i_7_, i_6_ << 16);
							}
							is_4_[i_5_] = Class3.packetStream
									.readUnsignedShortLE(25651);
						}
						npc.method3963(0, is, is_4_);
					}
					if ((0x1000 & mask ^ 0xffffffff) != -1) { // 2
						npc.aByte10323 = Class3.packetStream
								.readByte(1854307120);
						npc.aByte10275 = Class3.packetStream
								.readByte(1854307120);
						npc.aByte10358 = Class3.packetStream
								.method2515((byte) -14);
						npc.aByte10332 = (byte) Class3.packetStream
								.readUnsignedByte((byte) 35);
						npc.anInt10360 = (Class11_Sub25.anInt6279 - -Class3.packetStream
								.readUnsignedShortLE128(126));
						npc.anInt10344 = (Class11_Sub25.anInt6279 - -Class3.packetStream
								.readUnsignedShortLE(25651));
					}
					if ((0x1 & mask ^ 0xffffffff) != -1) { // 3 force talk
						npc.aString10298 = Class3.packetStream.readString(-1);
						npc.anInt10285 = 100;
					}
					if ((mask & 0x40) != 0) { // 4
						int i_8_ = Class3.packetStream.readSmart(106);
						int i_9_ = Class3.packetStream
								.readUnsignedByte128(7925);
						npc.method3965(0, (Class11_Sub25.anInt6279), i_8_, i_9_);
						npc.anInt10355 = Class11_Sub25.anInt6279 + 300;
						npc.anInt10348 = Class3.packetStream
								.readUnsignedByte128(7925);
					}
					if ((mask & 0x20 ^ 0xffffffff) != -1) { // 5 face coords
						((Npc) npc).anInt10507 = Class3.packetStream
								.readUnsignedShortLE(25651);
						((Npc) npc).anInt10505 = Class3.packetStream
								.readUnsignedShort128(true);
					}
					if ((0x10 & mask ^ 0xffffffff) != -1) { // 6 face entity
						npc.faceEntity = Class3.packetStream
								.readUnsignedShort128(true);
						if ((((Actor) npc).faceEntity ^ 0xffffffff) == -65536)
							npc.faceEntity = -1;
					}
					if ((0x200 & mask ^ 0xffffffff) != -1) { // 7
						npc.anInt10333 = Class3.packetStream
								.method2515((byte) -14);
						npc.anInt10341 = Class3.packetStream.read128Byte(15);
						npc.anInt10308 = Class3.packetStream
								.readByte(1854307120);
						npc.anInt10328 = Class3.packetStream.readByteC(0);
						npc.anInt10315 = (Class3.packetStream
								.readUnsignedShort128(true) - -Class11_Sub25.anInt6279);
						npc.anInt10330 = (Class3.packetStream
								.readUnsignedShort128(true) + Class11_Sub25.anInt6279);
						npc.anInt10294 = Class3.packetStream
								.readUnsignedByte((byte) 35);
						npc.anInt10328 += (((Actor) npc).anIntArray10376[0]);
						npc.anInt10308 += (((Actor) npc).anIntArray10370[0]);
						npc.anInt10341 += (((Actor) npc).anIntArray10376[0]);
						npc.anInt10333 += (((Actor) npc).anIntArray10370[0]);
						npc.anInt10368 = 0;
						npc.anInt10375 = 1;
					}
					if ((mask & 0x4 ^ 0xffffffff) != -1) { // 8 gfx1
						int i_10_ = Class3.packetStream
								.readUnsignedShort128(true);
						int i_11_ = Class3.packetStream.readIntV2((byte) 93);
						if ((i_10_ ^ 0xffffffff) == -65536)
							i_10_ = -1;
						int i_12_ = Class3.packetStream
								.readUnsignedByteC(-6067);
						int i_13_ = 0x7 & i_12_;
						int i_14_ = (i_12_ & 0x7c) >> 3;
						if (i_14_ == 15)
							i_14_ = -1;
						npc.sendGraphics(i_10_, i_14_, false, (byte) 114,
								i_11_, i_13_);
					}
					if ((0x2000 & mask) != 0) { // 9 gfx 2
						int i_15_ = Class3.packetStream
								.readUnsignedShort((byte) -65);
						if (i_15_ == 65535)
							i_15_ = -1;
						int i_16_ = Class3.packetStream.readIntV1(27326);
						int i_17_ = Class3.packetStream
								.readUnsignedByte((byte) 35);
						int i_18_ = i_17_ & 0x7;
						int i_19_ = 0xf & i_17_ >> 3;
						if (i_19_ == 15)
							i_19_ = -1;
						npc.sendGraphics(i_15_, i_19_, true, (byte) 114, i_16_,
								i_18_);
					}
					if ((mask & 0x4000 ^ 0xffffffff) != -1) {// 10
						int i_20_ = Class3.packetStream
								.readUnsignedShortLE(25651);
						npc.anInt10336 = Class3.packetStream
								.readUnsignedByteC(-6067);
						npc.anInt10365 = Class3.packetStream
								.readUnsignedByteC(-6067);
						npc.anInt10339 = 0x7fff & i_20_;
						npc.aBool10287 = (i_20_ & 0x8000 ^ 0xffffffff) != -1;
						npc.anInt10359 = (Class11_Sub25.anInt6279
								+ ((Actor) npc).anInt10339 + ((Actor) npc).anInt10336);
					}
					if ((mask & 0x80) != 0) { // animation 11
						int[] is = new int[4];
						for (int i_21_ = 0; i_21_ < 4; i_21_++) {
							is[i_21_] = Class3.packetStream
									.readUnsignedShort128(true);
							if ((is[i_21_] ^ 0xffffffff) == -65536)
								is[i_21_] = -1;
						}
						int i_22_ = Class3.packetStream
								.readUnsignedByteC(-6067);
						Class108_Sub29.method3231(npc, i_22_, is, (byte) 99);
					}
					if ((0x8 & mask ^ 0xffffffff) != -1) { //12 transform
						if (npc.aClass215_10501.method1376(106)) {
							Class82.method566(-119, npc);
						}
						npc.method4005(-1, (Class11_Sub19.aClass318_5817
								.getNPCDefinitions(Class3.packetStream
										.readUnsignedShort128(true), false)));
						npc.method3954(-21, npc.aClass215_10501.anInt2975);
						npc.anInt10320 = npc.aClass215_10501.anInt2959 << 3;
						if (((Npc) npc).aClass215_10501.method1376(116))
							Class11_Sub30_Sub1
									.method3530(
											null,
											(((Actor) npc).anIntArray10376[0]),
											0,
											null,
											((Class376_Sub7) npc).aByte7047,
											(((Actor) npc).anIntArray10370[0]),
											82, npc);
					}
					if ((mask & 0x100 ^ 0xffffffff) != -1) {
						int i_23_ = Class3.packetStream.readSmart(103);
						int i_24_ = Class3.packetStream
								.readUnsignedByte128(7925);
						npc.method3965(0, (Class11_Sub25.anInt6279), i_23_,
								i_24_);
					}
					if ((mask & 0x800 ^ 0xffffffff) != -1) {
						int i_25_ = Class3.packetStream
								.readUnsignedByte128(7925);
						int[] is = new int[i_25_];
						int[] is_26_ = new int[i_25_];
						int[] is_27_ = new int[i_25_];
						for (int i_28_ = 0; i_28_ < i_25_; i_28_++) {
							int i_29_ = Class3.packetStream
									.readUnsignedShortLE(25651);
							if ((i_29_ ^ 0xffffffff) == -65536)
								i_29_ = -1;
							is[i_28_] = i_29_;
							is_26_[i_28_] = Class3.packetStream
									.readUnsignedByteC(-6067);
							is_27_[i_28_] = Class3.packetStream
									.readUnsignedShortLE128(127);
						}
						Class236_Sub5.method2785(is_26_, is_27_, -1, npc, is);
					}
				}
				anInt7987++;
				if (i > 65)
					break;
				method3214((byte) -35);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "wp.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method3214(byte i) {
		do {
			try {
				anInt7985++;
				Class11_Sub30.aClass192Array6614 = null;
				if (Class11_Sub2_Sub19.aBool9087
						&& Class187.method1227((byte) 54) != 1)
					Class11_Sub2_Sub30
							.method3794(
									((Class285.anInt3846 ^ 0xffffffff) == -4 || (Class285.anInt3846 ^ 0xffffffff) == -8),
									Class108_Sub4.method2365((byte) 53),
									Class11_Sub19.method2481(-2), (byte) -128,
									0, 0);
				int i_30_ = 0;
				if (i < -64) {
					int i_31_ = 0;
					if (Class11_Sub2_Sub19.aBool9087) {
						i_30_ = Class54.method443(5467);
						i_31_ = Class376_Sub7_Sub4_Sub1.method3887((byte) -121);
					}
					Class261.method1665(50, i_31_, i_31_,
							Class11_Sub36.anInt7079 + i_30_, i_30_,
							Class365.anInt4797, i_30_, -1, i_31_
									+ Class153.anInt2025);
					if (Class11_Sub30.aClass192Array6614 == null)
						break;
					Class376_Sub7_Sub2
							.method3610(
									true,
									-1412584499,
									-13123,
									Class11_Sub36.anInt7079 + i_30_,
									i_31_ + Class153.anInt2025,
									i_30_,
									((IComponentDefinitions) Exception_Sub1.aClass192_9486).anInt2525,
									Class165.anInt2139, i_31_,
									Class239_Sub2.anInt7915,
									Class11_Sub30.aClass192Array6614);
					Class11_Sub30.aClass192Array6614 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "wp.B(" + i + ')');
			}
			break;
		} while (false);
	}

	Class11_Sub47(byte[] is) {
		try {
			((Class11_Sub47) this).aByteArray7986 = is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wp.<init>("
					+ (is != null ? "{...}" : "null") + ')');
		}
	}
}
