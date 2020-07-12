/* Class11_Sub30_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;

final class Class11_Sub30_Sub1 extends Class11_Sub30 implements ImageProducer {
	static int anInt8961;
	private Image anImage8962;
	static int anInt8963;
	private Canvas aCanvas8964;
	static IncomingPacket aClass160_8965 = new IncomingPacket(107, -1);
	static int anInt8966;
	private ColorModel aColorModel8967;
	static int anInt8968;
	static int anInt8969;
	static int anInt8970;
	private ImageConsumer anImageConsumer8971;
	static int anInt8972;
	static int anInt8973;
	static int anInt8974;
	static int anInt8975;
	static int anInt8976;
	static int[] anIntArray8977 = new int[256];
	static String currentUsername;
	static Class347 aClass347_8979;
	static Class182 aClass182_8980;

	static final void method3526(byte i, int i_0_,
			Class11_Sub45_Sub5 class11_sub45_sub5, int i_1_) {
		do {
			try {
				anInt8963++;
				if (class11_sub45_sub5 != null
						&& (((Class84) Class94_Sub1.aClass84_5220).aClass11_1149 != class11_sub45_sub5)) {
					int i_2_ = ((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8758;
					int i_3_ = ((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8762;
					int i_4_ = ((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760;
					int i_5_ = (int) (((Class11_Sub45_Sub5) class11_sub45_sub5).aLong8771);
					if (i < -3) {
						long l = (((Class11_Sub45_Sub5) class11_sub45_sub5).aLong8771);
						if (i_4_ >= 2000)
							i_4_ -= 2000;
						if (i_4_ == 59) {
							Player class376_sub7_sub5_sub5_sub1 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_5_]);
							if (class376_sub7_sub5_sub5_sub1 != null) {
								Class33_Sub1.anInt6180++;
								Class318.anInt4220 = i_0_;
								Class11_Sub23.anInt5988 = i_1_;
								Class228.anInt3149 = 2;
								Class378.anInt4935 = 0;
								Class11_Sub10 class11_sub10 = (Class11_Sub48
										.method3215(Class11_Sub3.aClass25_5113,
												Class335_Sub1.aClass370_6445,
												(byte) -39));
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeShortLE128((byte) 116, i_5_);
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeByte(
												!Class11_Sub2_Sub19.aClass1_9098
														.method60(0, 82) ? 0
														: 1, -1528071456);
								Class79.method541(class11_sub10, -77);
								Class64.method485(
										-2,
										0,
										1,
										class376_sub7_sub5_sub5_sub1
												.method3968((byte) 127),
										class376_sub7_sub5_sub5_sub1
												.method3968((byte) 127),
										0,
										(((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10370[0]),
										true,
										(((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10376[0]));
							}
						}
						if (i_4_ == 23) {
							Class11_Sub25 class11_sub25 = ((Class11_Sub25) Class11_Sub2_Sub25.aClass213_9322
									.method1369((byte) 26, (long) i_5_));
							if (class11_sub25 != null) {
								Class318.anInt4220 = i_0_;
								Class378.anInt4935 = 0;
								Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) class11_sub25).aNpc_2373);
								Class361.anInt4704++;
								Class228.anInt3149 = 2;
								Class11_Sub23.anInt5988 = i_1_;
								Class11_Sub10 class11_sub10 = (Class11_Sub48
										.method3215(Class11_Sub3.aClass25_5113,
												Class19.aClass370_151,
												(byte) -126));
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeByte(
												!Class11_Sub2_Sub19.aClass1_9098
														.method60(0, 82) ? 0
														: 1, -1528071456);
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeShortLE(1815869672, i_5_);
								Class79.method541(class11_sub10, -39);
								Class64.method485(
										-2,
										0,
										1,
										class376_sub7_sub5_sub5_sub2
												.method3968((byte) 127),
										class376_sub7_sub5_sub5_sub2
												.method3968((byte) 127),
										0,
										(((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10370[0]),
										true,
										(((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10376[0]));
							}
						}
						if (i_4_ == 57) {
							Class11_Sub23.anInt5988 = i_1_;
							Class318.anInt4220 = i_0_;
							Class228.anInt3149 = 2;
							Class353.anInt4641++;
							Class378.anInt4935 = 0;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(OutputStream_Sub2.aClass370_7946),
											(byte) -112);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort(-122, i_2_ + Class194.anInt2641);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE128((byte) 121, i_3_
											- -Class118.anInt1605);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.method2553((byte) -48,
											!Class11_Sub2_Sub19.aClass1_9098
													.method60(0, 82) ? 0 : 1);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE(1815869672, i_5_);
							Class79.method541(class11_sub10, -24);
							Class362.method2149(0, i_2_, i_3_);
						}
						if (i_4_ == 2) {
							Player class376_sub7_sub5_sub5_sub1 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_5_]);
							if (class376_sub7_sub5_sub5_sub1 != null) {
								Class318.anInt4220 = i_0_;
								Class378.anInt4935 = 0;
								Class165.anInt2136++;
								Class228.anInt3149 = 2;
								Class11_Sub23.anInt5988 = i_1_;
								Class11_Sub10 class11_sub10 = (Class11_Sub48
										.method3215(Class11_Sub3.aClass25_5113,
												Class265.aClass370_3615,
												(byte) 115));
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeShort128(
												Class11_Sub2_Sub22.anInt9206,
												(byte) -86);
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeShortLE(1815869672,
												Class120.anInt1631);
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeShortLE128((byte) 88, i_5_);
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeByteC(
												!Class11_Sub2_Sub19.aClass1_9098
														.method60(0, 82) ? 0
														: 1, (byte) 62);
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeInt(-49, Class163.anInt2113);
								Class79.method541(class11_sub10, -35);
								Class64.method485(
										-2,
										0,
										1,
										class376_sub7_sub5_sub5_sub1
												.method3968((byte) 127),
										class376_sub7_sub5_sub5_sub1
												.method3968((byte) 127),
										0,
										(((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10370[0]),
										true,
										(((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10376[0]));
							}
						}
						if ((i_4_ ^ 0xffffffff) == -19) {
							Player class376_sub7_sub5_sub5_sub1 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_5_]);
							if (class376_sub7_sub5_sub5_sub1 != null) {
								Class378.anInt4935 = 0;
								Class11_Sub23.anInt5988 = i_1_;
								Class11_Sub2_Sub28.anInt9428++;
								Class228.anInt3149 = 2;
								Class318.anInt4220 = i_0_;
								Class11_Sub10 class11_sub10 = (Class11_Sub48
										.method3215(Class11_Sub3.aClass25_5113,
												Class163_Sub3.aClass370_8216,
												(byte) 94));
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeByte(
												Class11_Sub2_Sub19.aClass1_9098
														.method60(0, 82) ? 1
														: 0, -1528071456);
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeShort128(i_5_, (byte) -73);
								Class79.method541(class11_sub10, -89);
								Class64.method485(
										-2,
										0,
										1,
										class376_sub7_sub5_sub5_sub1
												.method3968((byte) 127),
										class376_sub7_sub5_sub5_sub1
												.method3968((byte) 127),
										0,
										(((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10370[0]),
										true,
										(((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10376[0]));
							}
						}
						if ((i_4_ ^ 0xffffffff) == -14) {
							Class380.anInt4959++;
							Class11_Sub23.anInt5988 = i_1_;
							Class378.anInt4935 = 0;
							Class228.anInt3149 = 2;
							Class318.anInt4220 = i_0_;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class379.aClass370_4954),
											(byte) 66);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort128(i_2_ - -Class194.anInt2641,
											(byte) -125);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE128((byte) 104,
											(int) (l >>> 32) & 0x7fffffff);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.method2553((byte) -70,
											!Class11_Sub2_Sub19.aClass1_9098
													.method60(0, 82) ? 0 : 1);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE128((byte) 64,
											Class118.anInt1605 + i_3_);
							Class79.method541(class11_sub10, -12);
							Class171.method1125(i_3_, i_2_, 108, l);
						}
						if (i_4_ == 51) {
							Class378.anInt4935 = 0;
							Class108_Sub12.anInt6231++;
							Class318.anInt4220 = i_0_;
							Class228.anInt3149 = 2;
							Class11_Sub23.anInt5988 = i_1_;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class220_Sub1.aClass370_7151),
											(byte) -54);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort(-126, Class120.anInt1631);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE(1815869672,
											Class11_Sub2_Sub22.anInt9206);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE(1815869672,
											0x7fffffff & (int) (l >>> 32));
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort(-110, i_3_
											- -Class118.anInt1605);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeByteC(
											(Class11_Sub2_Sub19.aClass1_9098
													.method60(0, 82) ? 1 : 0),
											(byte) -125);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeInt(-49, Class163.anInt2113);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort128(Class194.anInt2641 + i_2_,
											(byte) -82);
							Class79.method541(class11_sub10, -122);
							Class171.method1125(i_3_, i_2_, 122, l);
						}
						if ((i_4_ ^ 0xffffffff) == -26
								|| (i_4_ ^ 0xffffffff) == -1003)
							Class15.method150(
									i_3_,
									i_5_,
									i_2_,
									((Class11_Sub45_Sub5) class11_sub45_sub5).aString8767,
									(byte) 125);
						if (i_4_ == 45) {
							Class318.anInt4220 = i_0_;
							Class228.anInt3149 = 2;
							Class378.anInt4935 = 0;
							Class11_Sub23.anInt5988 = i_1_;
							Class58_Sub2_Sub1.anInt9246++;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class342.aClass370_4535),
											(byte) 48);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort128(i_2_ - -Class194.anInt2641,
											(byte) -72);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE(1815869672,
											Class118.anInt1605 + i_3_);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE(1815869672, i_5_);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.method2553((byte) -80,
											!Class11_Sub2_Sub19.aClass1_9098
													.method60(0, 82) ? 0 : 1);
							Class79.method541(class11_sub10, -59);
							Class362.method2149(0, i_2_, i_3_);
						}
						if (i_4_ == 1008) {
							Class228.anInt3149 = 2;
							Class378.anInt4935 = 0;
							Class318.anInt4220 = i_0_;
							Class11_Sub23.anInt5988 = i_1_;
							Class11_Sub25 class11_sub25 = ((Class11_Sub25) Class11_Sub2_Sub25.aClass213_9322
									.method1369((byte) 26, (long) i_5_));
							if (class11_sub25 != null) {
								Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) class11_sub25).aNpc_2373);
								NPCDefinitions class215 = (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501);
								if (((NPCDefinitions) class215).anIntArray2950 != null)
									class215 = (class215.method1375((byte) 29,
											Class11_Sub26.aClass97_6296));
								if (class215 != null) {
									Npc.anInt10511++;
									Class11_Sub10 class11_sub10 = (Class11_Sub48
											.method3215(
													Class11_Sub3.aClass25_5113,
													Class94_Sub3.aClass370_6908,
													(byte) -99));
									((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
											.writeShort(
													-113,
													((NPCDefinitions) class215).anInt2904);
									Class79.method541(class11_sub10, -121);
								}
							}
						}
						if (i_4_ == 4) {
							Class11_Sub25 class11_sub25 = ((Class11_Sub25) Class11_Sub2_Sub25.aClass213_9322
									.method1369((byte) 26, (long) i_5_));
							if (class11_sub25 != null) {
								Class222.anInt3041++;
								Class11_Sub23.anInt5988 = i_1_;
								Class318.anInt4220 = i_0_;
								Class228.anInt3149 = 2;
								Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) class11_sub25).aNpc_2373);
								Class378.anInt4935 = 0;
								Class11_Sub10 class11_sub10 = (Class11_Sub48
										.method3215(Class11_Sub3.aClass25_5113,
												Class31.aClass370_412,
												(byte) 104));
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeByteC(
												Class11_Sub2_Sub19.aClass1_9098
														.method60(0, 82) ? 1
														: 0, (byte) 14);
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeShort(-110, i_5_);
								Class79.method541(class11_sub10, -17);
								Class64.method485(
										-2,
										0,
										1,
										class376_sub7_sub5_sub5_sub2
												.method3968((byte) 127),
										class376_sub7_sub5_sub5_sub2
												.method3968((byte) 127),
										0,
										(((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10370[0]),
										true,
										(((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10376[0]));
							}
						}
						if ((i_4_ ^ 0xffffffff) == -61) {
							Player class376_sub7_sub5_sub5_sub1 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_5_]);
							if (class376_sub7_sub5_sub5_sub1 != null) {
								Class378.anInt4935 = 0;
								Class228.anInt3149 = 2;
								Class11_Sub23.anInt5988 = i_1_;
								Class225_Sub1.anInt4997++;
								Class318.anInt4220 = i_0_;
								Class11_Sub10 class11_sub10 = (Class11_Sub48
										.method3215(Class11_Sub3.aClass25_5113,
												Class38.aClass370_514,
												(byte) -85));
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeShort(-124, i_5_);
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeByte(
												!Class11_Sub2_Sub19.aClass1_9098
														.method60(0, 82) ? 0
														: 1, -1528071456);
								Class79.method541(class11_sub10, -49);
								Class64.method485(
										-2,
										0,
										1,
										class376_sub7_sub5_sub5_sub1
												.method3968((byte) 127),
										class376_sub7_sub5_sub5_sub1
												.method3968((byte) 127),
										0,
										(((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10370[0]),
										true,
										(((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10376[0]));
							}
						}
						if ((i_4_ ^ 0xffffffff) == -13
								&& Class72.aClass192_1004 == null) {
							Class289.method1784(i_2_, i_3_, 2);
							Class72.aClass192_1004 = Class146.method913(i_3_,
									(byte) 43, i_2_);
							Class232.method1484(Class72.aClass192_1004, 1);
						}
						if (i_4_ == 47) {
							Class228.anInt3149 = 2;
							Class378.anInt4935 = 0;
							Class204.anInt2751++;
							Class11_Sub23.anInt5988 = i_1_;
							Class318.anInt4220 = i_0_;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class339.aClass370_4483),
											(byte) 120);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort128(i_2_ - -Class194.anInt2641,
											(byte) -63);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort(-122, i_5_);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE128((byte) 54, i_3_
											- -Class118.anInt1605);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.method2553((byte) -113,
											!Class11_Sub2_Sub19.aClass1_9098
													.method60(0, 82) ? 0 : 1);
							Class79.method541(class11_sub10, -73);
							Class362.method2149(0, i_2_, i_3_);
						}
						if (i_4_ == 30) {
							IComponentDefinitions class192 = Class146
									.method913(i_3_, (byte) 109, i_2_);
							if (class192 != null)
								Class103.method685(19192, class192);
						}
						if (i_4_ == 58) {
							Class378.anInt4935 = 0;
							Class228.anInt3149 = 2;
							Class318.anInt4220 = i_0_;
							Class382.anInt4966++;
							Class11_Sub23.anInt5988 = i_1_;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class91_Sub1_Sub1.aClass370_8982),
											(byte) 56);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort128(i_2_ + Class194.anInt2641,
											(byte) -48);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort128(Class118.anInt1605 + i_3_,
											(byte) -52);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeByte((Class11_Sub2_Sub19.aClass1_9098
											.method60(0, 82) ? 1 : 0),
											-1528071456);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort128(0x7fffffff & (int) (l >>> 32),
											(byte) -120);
							Class79.method541(class11_sub10, -34);
							Class171.method1125(i_3_, i_2_, 110, l);
						}
						if ((i_4_ ^ 0xffffffff) == -45) {
							Player class376_sub7_sub5_sub5_sub1 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_5_]);
							if (class376_sub7_sub5_sub5_sub1 != null) {
								Class11_Sub23.anInt5988 = i_1_;
								Class143.anInt1928++;
								Class378.anInt4935 = 0;
								Class318.anInt4220 = i_0_;
								Class228.anInt3149 = 2;
								Class11_Sub10 class11_sub10 = (Class11_Sub48
										.method3215(Class11_Sub3.aClass25_5113,
												Class362.aClass370_4714,
												(byte) 116));
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeShort128(i_5_, (byte) -119);
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.method2553((byte) -101,
												Class11_Sub2_Sub19.aClass1_9098
														.method60(0, 82) ? 1
														: 0);
								Class79.method541(class11_sub10, -126);
								Class64.method485(
										-2,
										0,
										1,
										class376_sub7_sub5_sub5_sub1
												.method3968((byte) 127),
										class376_sub7_sub5_sub5_sub1
												.method3968((byte) 127),
										0,
										(((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10370[0]),
										true,
										(((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10376[0]));
							}
						}
						if ((i_4_ ^ 0xffffffff) == -10) {
							Class318.anInt4220 = i_0_;
							Class11_Sub23.anInt5988 = i_1_;
							Class228.anInt3149 = 2;
							Class378.anInt4935 = 0;
							Class108_Sub14.anInt6275++;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class91.aClass370_1235),
											(byte) -38);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.method2492(28, Class163.anInt2113);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort(-123, Class120.anInt1631);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE(1815869672, i_2_
											- -Class194.anInt2641);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort128(i_3_ + Class118.anInt1605,
											(byte) -65);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort128(i_5_, (byte) -126);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE(1815869672,
											Class11_Sub2_Sub22.anInt9206);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeByte(
											(!Class11_Sub2_Sub19.aClass1_9098
													.method60(0, 82) ? 0 : 1),
											-1528071456);
							Class79.method541(class11_sub10, -86);
							Class362.method2149(0, i_2_, i_3_);
						}
						if ((i_4_ ^ 0xffffffff) == -51) {
							Class11_Sub25 class11_sub25 = ((Class11_Sub25) Class11_Sub2_Sub25.aClass213_9322
									.method1369((byte) 26, (long) i_5_));
							if (class11_sub25 != null) {
								Class228.anInt3149 = 2;
								Class64.anInt925++;
								Class11_Sub23.anInt5988 = i_1_;
								Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) class11_sub25).aNpc_2373);
								Class318.anInt4220 = i_0_;
								Class378.anInt4935 = 0;
								Class11_Sub10 class11_sub10 = (Class11_Sub48
										.method3215(Class11_Sub3.aClass25_5113,
												Class328_Sub1.aClass370_6290,
												(byte) 91));
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeShortLE128((byte) 125,
												Class120.anInt1631);
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.method2551(Class163.anInt2113,
												(byte) -85);
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeShort128(
												Class11_Sub2_Sub22.anInt9206,
												(byte) -94);
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeShortLE128((byte) 113, i_5_);
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeByte128((byte) -5,
												Class11_Sub2_Sub19.aClass1_9098
														.method60(0, 82) ? 1
														: 0);
								Class79.method541(class11_sub10, -66);
								Class64.method485(
										-2,
										0,
										1,
										class376_sub7_sub5_sub5_sub2
												.method3968((byte) 127),
										class376_sub7_sub5_sub5_sub2
												.method3968((byte) 127),
										0,
										(((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10370[0]),
										true,
										(((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10376[0]));
							}
						}
						if ((i_4_ ^ 0xffffffff) == -20) {
							Class11_Sub23.anInt5988 = i_1_;
							Class318.anInt4220 = i_0_;
							Class165.anInt2136++;
							Class378.anInt4935 = 0;
							Class228.anInt3149 = 2;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class265.aClass370_3615),
											(byte) -57);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort128(Class11_Sub2_Sub22.anInt9206,
											(byte) -114);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE(1815869672,
											Class120.anInt1631);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE128(
											(byte) 61,
											(((Actor) (Class11_Sub2_Sub8.myPlayer)).anInt10319));
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeByteC(
											(Class11_Sub2_Sub19.aClass1_9098
													.method60(0, 82) ? 1 : 0),
											(byte) -111);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeInt(-49, Class163.anInt2113);
							Class79.method541(class11_sub10, -126);
						}
						if ((i_4_ ^ 0xffffffff) == -49) {
							Class11_Sub25 class11_sub25 = ((Class11_Sub25) Class11_Sub2_Sub25.aClass213_9322
									.method1369((byte) 26, (long) i_5_));
							if (class11_sub25 != null) {
								Class378.anInt4935 = 0;
								Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) class11_sub25).aNpc_2373);
								Class228.anInt3149 = 2;
								Class11_Sub23.anInt5988 = i_1_;
								Class318.anInt4220 = i_0_;
								Class206.anInt2777++;
								Class11_Sub10 class11_sub10 = (Class11_Sub48
										.method3215(
												Class11_Sub3.aClass25_5113,
												Class11_Sub2_Sub2.aClass370_8455,
												(byte) -42));
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeByteC(
												!Class11_Sub2_Sub19.aClass1_9098
														.method60(0, 82) ? 0
														: 1, (byte) 48);
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeShort128(i_5_, (byte) -110);
								Class79.method541(class11_sub10, -115);
								Class64.method485(
										-2,
										0,
										1,
										class376_sub7_sub5_sub5_sub2
												.method3968((byte) 127),
										class376_sub7_sub5_sub5_sub2
												.method3968((byte) 127),
										0,
										(((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10370[0]),
										true,
										(((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10376[0]));
							}
						}
						if ((i_4_ ^ 0xffffffff) == -9) {
							Class318.anInt4220 = i_0_;
							Class378.anInt4935 = 0;
							Class228.anInt3149 = 2;
							Class11_Sub23.anInt5988 = i_1_;
							Class222.anInt3047++;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class44.aClass370_707), (byte) 57);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE(1815869672,
											Class194.anInt2641 + i_2_);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort128(Class118.anInt1605 + i_3_,
											(byte) -118);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE128((byte) 70,
											(int) (l >>> 32) & 0x7fffffff);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeByteC(
											(!Class11_Sub2_Sub19.aClass1_9098
													.method60(0, 82) ? 0 : 1),
											(byte) 0);
							Class79.method541(class11_sub10, -123);
							Class171.method1125(i_3_, i_2_, 125, l);
						}
						if (i_4_ == 1001) {
							Class228.anInt3149 = 2;
							Class55.anInt830++;
							Class11_Sub23.anInt5988 = i_1_;
							Class318.anInt4220 = i_0_;
							Class378.anInt4935 = 0;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class164.aClass370_2128),
											(byte) 120);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE(1815869672,
											Class194.anInt2641 + i_2_);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort128((int) (l >>> 32) & 0x7fffffff,
											(byte) -66);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeByte128((byte) -5,
											!Class11_Sub2_Sub19.aClass1_9098
													.method60(0, 82) ? 0 : 1);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort128(i_3_ + Class118.anInt1605,
											(byte) -75);
							Class79.method541(class11_sub10, -38);
							Class171.method1125(i_3_, i_2_, 102, l);
						}
						if ((i_4_ ^ 0xffffffff) == -17) {
							Class11_Sub25 class11_sub25 = ((Class11_Sub25) Class11_Sub2_Sub25.aClass213_9322
									.method1369((byte) 26, (long) i_5_));
							if (class11_sub25 != null) {
								Class378.anInt4935 = 0;
								Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) class11_sub25).aNpc_2373);
								Class11_Sub23.anInt5988 = i_1_;
								Class11_Sub28.anInt6570++;
								Class318.anInt4220 = i_0_;
								Class228.anInt3149 = 2;
								Class11_Sub10 class11_sub10 = (Class11_Sub48
										.method3215(Class11_Sub3.aClass25_5113,
												Class48.aClass370_751,
												(byte) 62));
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeShort(-125, i_5_);
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.method2553(
												(byte) -59,
												!Class11_Sub2_Sub19.aClass1_9098
														.method60(0, 82) ? 0
														: 1);
								Class79.method541(class11_sub10, -121);
								Class64.method485(
										-2,
										0,
										1,
										class376_sub7_sub5_sub5_sub2
												.method3968((byte) 127),
										class376_sub7_sub5_sub5_sub2
												.method3968((byte) 127),
										0,
										(((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10370[0]),
										true,
										(((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10376[0]));
							}
						}
						if (i_4_ == 17) {
							Class318.anInt4220 = i_0_;
							Class101.anInt1339++;
							Class378.anInt4935 = 0;
							Class11_Sub23.anInt5988 = i_1_;
							Class228.anInt3149 = 2;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class2_Sub5.aClass370_5499),
											(byte) 117);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeByteC(
											(!Class11_Sub2_Sub19.aClass1_9098
													.method60(0, 82) ? 0 : 1),
											(byte) -111);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort(-121, i_2_
											- -Class194.anInt2641);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE128((byte) 112,
											Class118.anInt1605 + i_3_);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE(1815869672, i_5_);
							Class79.method541(class11_sub10, -54);
							Class362.method2149(0, i_2_, i_3_);
						}
						if (i_4_ == 5) {
							Class108_Sub10.anInt6138++;
							Class318.anInt4220 = i_0_;
							Class11_Sub23.anInt5988 = i_1_;
							Class228.anInt3149 = 1;
							Class378.anInt4935 = 0;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class63.aClass370_922), (byte) 88);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort(-117,
											Class11_Sub2_Sub22.anInt9206);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort(-121, Class118.anInt1605
											- -i_3_);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE128((byte) 74,
											Class120.anInt1631);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE128((byte) 126, i_2_
											+ Class194.anInt2641);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.method2551(Class163.anInt2113, (byte) -65);
							Class79.method541(class11_sub10, -66);
							Class64.method485(-4, 0, 1, 1, 1, 0, i_2_, true,
									i_3_);
						}
						if ((i_4_ ^ 0xffffffff) == -1007) {
							Class318.anInt4220 = i_0_;
							Class228.anInt3149 = 2;
							Class11_Sub23.anInt5988 = i_1_;
							Class378.anInt4935 = 0;
							Class11_Sub28.anInt6588++;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class76.aClass370_1038), (byte) 84);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort(-128, i_5_);
							Class79.method541(class11_sub10, -12);
						}
						if (i_4_ == 22) {
							Player class376_sub7_sub5_sub5_sub1 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_5_]);
							if (class376_sub7_sub5_sub5_sub1 != null) {
								Class236_Sub2.anInt6209++;
								Class318.anInt4220 = i_0_;
								Class11_Sub23.anInt5988 = i_1_;
								Class378.anInt4935 = 0;
								Class228.anInt3149 = 2;
								Class11_Sub10 class11_sub10 = (Class11_Sub48
										.method3215(Class11_Sub3.aClass25_5113,
												Class77.aClass370_1043,
												(byte) -21));
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeShort128(i_5_, (byte) -57);
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeByte(
												Class11_Sub2_Sub19.aClass1_9098
														.method60(0, 82) ? 1
														: 0, -1528071456);
								Class79.method541(class11_sub10, -48);
								Class64.method485(
										-2,
										0,
										1,
										class376_sub7_sub5_sub5_sub1
												.method3968((byte) 127),
										class376_sub7_sub5_sub5_sub1
												.method3968((byte) 127),
										0,
										(((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10370[0]),
										true,
										(((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10376[0]));
							}
						}
						if ((i_4_ ^ 0xffffffff) == -22) {
							if (Class256_Sub2.anInt7713 <= 0
									|| !Class11_Sub2_Sub19.aClass1_9098
											.method60(0, 82)
									|| !Class11_Sub2_Sub19.aClass1_9098
											.method60(0, 81)) {
								Class11_Sub10 class11_sub10 = Class376_Sub7_Sub5_Sub2
										.method3906(-58, i_2_, i_3_, i_5_);
								if ((i_5_ ^ 0xffffffff) == -2) {
									((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
											.writeByte(-1, -1528071456);
									((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
											.writeByte(-1, -1528071456);
									((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
											.writeShort(
													-126,
													(int) Class2_Sub8.aFloat6868);
									((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
											.writeByte(57, -1528071456);
									((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
											.writeByte(Class328.anInt4371,
													-1528071456);
									((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
											.writeByte(
													Class11_Sub45_Sub1.anInt8493,
													-1528071456);
									((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
											.writeByte(89, -1528071456);
									((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
											.writeShort(
													-118,
													(((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7045));
									((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
											.writeShort(
													-122,
													(((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7031));
									((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
											.writeByte(63, -1528071456);
								} else {
									Class318.anInt4220 = i_0_;
									Class228.anInt3149 = 1;
									Class11_Sub23.anInt5988 = i_1_;
									Class378.anInt4935 = 0;
								}
								Class79.method541(class11_sub10, -7);
								Class64.method485(-4, 0, 1, 1, 1, 0, i_2_,
										true, i_3_);
							} else
								Class200.method1288(
										i_3_ + Class118.anInt1605,
										-86,
										i_2_ + Class194.anInt2641,
										(((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047));
						}
						if (i_4_ == 11) {
							if ((Class256_Sub2.anInt7713 ^ 0xffffffff) < -1
									&& Class11_Sub2_Sub19.aClass1_9098
											.method60(0, 82)
									&& Class11_Sub2_Sub19.aClass1_9098
											.method60(0, 81))
								Class200.method1288(
										Class118.anInt1605 + i_3_,
										-85,
										Class194.anInt2641 + i_2_,
										(((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047));
							else {
								Class378.anInt4935 = 0;
								Class228.anInt3149 = 1;
								Class318.anInt4220 = i_0_;
								Class11_Sub23.anInt5988 = i_1_;
								Class104.anInt1389++;
								Class11_Sub10 class11_sub10 = (Class11_Sub48
										.method3215(Class11_Sub3.aClass25_5113,
												Class151.aClass370_2007,
												(byte) -73));
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeShortLE(1815869672,
												Class118.anInt1605 + i_3_);
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeShort128(i_2_ + Class194.anInt2641,
												(byte) -123);
								Class79.method541(class11_sub10, -7);
							}
						}
						if (i_4_ == 10) {
							Class318.anInt4220 = i_0_;
							Class11_Sub23.anInt5988 = i_1_;
							Class228.anInt3149 = 2;
							Class154.anInt2035++;
							Class378.anInt4935 = 0;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class163_Sub3.aClass370_8266),
											(byte) 54);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort128(Class118.anInt1605 + i_3_,
											(byte) -78);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeByte(
											(!Class11_Sub2_Sub19.aClass1_9098
													.method60(0, 82) ? 0 : 1),
											-1528071456);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE(1815869672, i_5_);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE(1815869672, i_2_
											- -Class194.anInt2641);
							Class79.method541(class11_sub10, -24);
							Class362.method2149(0, i_2_, i_3_);
						}
						if (i_4_ == 1004) {
							Class11_Sub23.anInt5988 = i_1_;
							Class318.anInt4220 = i_0_;
							Class378.anInt4935 = 0;
							Class228.anInt3149 = 2;
							Class323.anInt4317++;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class55.aClass370_834), (byte) 73);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShort(-124, i_5_);
							Class79.method541(class11_sub10, -128);
						}
						if (i_4_ == 46) {
							Player class376_sub7_sub5_sub5_sub1 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_5_]);
							if (class376_sub7_sub5_sub5_sub1 != null) {
								Class11_Sub23.anInt5988 = i_1_;
								Class378.anInt4935 = 0;
								Class91_Sub1.anInt6938++;
								Class228.anInt3149 = 2;
								Class318.anInt4220 = i_0_;
								Class11_Sub10 class11_sub10 = (Class11_Sub48
										.method3215(Class11_Sub3.aClass25_5113,
												Class206.aClass370_2781,
												(byte) -47));
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeShort128(i_5_, (byte) -55);
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeByte128(
												(byte) -5,
												!Class11_Sub2_Sub19.aClass1_9098
														.method60(0, 82) ? 0
														: 1);
								Class79.method541(class11_sub10, -64);
								Class64.method485(
										-2,
										0,
										1,
										class376_sub7_sub5_sub5_sub1
												.method3968((byte) 127),
										class376_sub7_sub5_sub5_sub1
												.method3968((byte) 127),
										0,
										(((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10370[0]),
										true,
										(((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10376[0]));
							}
						}
						if (i_4_ == 1010 || i_4_ == 1007 || i_4_ == 1003
								|| i_4_ == 1009 || (i_4_ ^ 0xffffffff) == -1013)
							Class366.method2167(i_2_, i_5_, i_4_, false);
						if ((i_4_ ^ 0xffffffff) == -21) {
							Player class376_sub7_sub5_sub5_sub1 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_5_]);
							if (class376_sub7_sub5_sub5_sub1 != null) {
								Class58_Sub1_Sub2.anInt9487++;
								Class228.anInt3149 = 2;
								Class378.anInt4935 = 0;
								Class11_Sub23.anInt5988 = i_1_;
								Class318.anInt4220 = i_0_;
								Class11_Sub10 class11_sub10 = (Class11_Sub48
										.method3215(Class11_Sub3.aClass25_5113,
												client.aClass370_10513,
												(byte) 76));
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.method2553(
												(byte) -14,
												!Class11_Sub2_Sub19.aClass1_9098
														.method60(0, 82) ? 0
														: 1);
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeShort128(i_5_, (byte) -112);
								Class79.method541(class11_sub10, -45);
								Class64.method485(
										-2,
										0,
										1,
										class376_sub7_sub5_sub5_sub1
												.method3968((byte) 127),
										class376_sub7_sub5_sub5_sub1
												.method3968((byte) 127),
										0,
										(((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10370[0]),
										true,
										(((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10376[0]));
							}
						}
						if ((i_4_ ^ 0xffffffff) == -4) {
							Class228.anInt3149 = 2;
							Class11_Sub2_Sub32.anInt9650++;
							Class318.anInt4220 = i_0_;
							Class11_Sub23.anInt5988 = i_1_;
							Class378.anInt4935 = 0;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class11_Sub2_Sub4.aClass370_8494),
											(byte) 110);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE(1815869672, i_2_
											+ Class194.anInt2641);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE(1815869672,
											Class118.anInt1605 + i_3_);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeByte128((byte) -5,
											!Class11_Sub2_Sub19.aClass1_9098
													.method60(0, 82) ? 0 : 1);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeShortLE(1815869672,
											0x7fffffff & (int) (l >>> 32));
							Class79.method541(class11_sub10, -115);
							Class171.method1125(i_3_, i_2_, 126, l);
						}
						if ((i_4_ ^ 0xffffffff) == -7) {
							Player class376_sub7_sub5_sub5_sub1 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_5_]);
							if (class376_sub7_sub5_sub5_sub1 != null) {
								Class318.anInt4220 = i_0_;
								Class228.anInt3149 = 2;
								Class11_Sub23.anInt5988 = i_1_;
								Class378.anInt4935 = 0;
								Class11_Sub12_Sub1.anInt8827++;
								Class11_Sub10 class11_sub10 = (Class11_Sub48
										.method3215(Class11_Sub3.aClass25_5113,
												Class108.aClass370_1457,
												(byte) 55));
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeShort(-118, i_5_);
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeByteC(
												Class11_Sub2_Sub19.aClass1_9098
														.method60(0, 82) ? 1
														: 0, (byte) -122);
								Class79.method541(class11_sub10, -102);
								Class64.method485(
										-2,
										0,
										1,
										class376_sub7_sub5_sub5_sub1
												.method3968((byte) 127),
										class376_sub7_sub5_sub5_sub1
												.method3968((byte) 127),
										0,
										(((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10370[0]),
										true,
										(((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10376[0]));
							}
						}
						if ((i_4_ ^ 0xffffffff) == -50) {
							Class11_Sub25 class11_sub25 = ((Class11_Sub25) Class11_Sub2_Sub25.aClass213_9322
									.method1369((byte) 26, (long) i_5_));
							if (class11_sub25 != null) {
								Class236_Sub4.anInt6715++;
								Class228.anInt3149 = 2;
								Class378.anInt4935 = 0;
								Class318.anInt4220 = i_0_;
								Class11_Sub23.anInt5988 = i_1_;
								Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) class11_sub25).aNpc_2373);
								Class11_Sub10 class11_sub10 = (Class11_Sub48
										.method3215(Class11_Sub3.aClass25_5113,
												Class161.aClass370_2089,
												(byte) -44));
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.writeShortLE128((byte) 60, i_5_);
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
										.method2553(
												(byte) -65,
												!Class11_Sub2_Sub19.aClass1_9098
														.method60(0, 82) ? 0
														: 1);
								Class79.method541(class11_sub10, -113);
								Class64.method485(
										-2,
										0,
										1,
										class376_sub7_sub5_sub5_sub2
												.method3968((byte) 127),
										class376_sub7_sub5_sub5_sub2
												.method3968((byte) 127),
										0,
										(((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10370[0]),
										true,
										(((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10376[0]));
							}
						}
						if ((i_4_ ^ 0xffffffff) == -16) {
							IComponentDefinitions class192 = Class146
									.method913(i_3_, (byte) 26, i_2_);
							if (class192 != null) {
								Class11_Sub45_Sub5.method3436(-1);
								InterfaceSettings class11_sub9 = client
										.method4013(class192);
								Class180.method1184(
										class11_sub9.method2353(false),
										((InterfaceSettings) class11_sub9).anInt5354,
										class192, true);
								Class374.aString4890 = Class11_Sub45_Sub3
										.method3384(class192, -10402);
								Class250.aString3444 = (((IComponentDefinitions) class192).aString2506 + "<col=ffffff>");
								if (Class374.aString4890 == null)
									Class374.aString4890 = "Null";
							}
						} else {
							if (Class204.aBool2739)
								Class11_Sub45_Sub5.method3436(-1);
							if (Class112.aClass192_1539 == null
									|| OutgoingPacket.anInt4858 != 0)
								break;
							Class232.method1484(Class112.aClass192_1539, 1);
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("eq.J(" + i + ','
						+ i_0_ + ','
						+ (class11_sub45_sub5 != null ? "{...}" : "null") + ','
						+ i_1_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method3527(int i) {
		try {
			aClass160_8965 = null;
			currentUsername = null;
			anIntArray8977 = null;
			aClass347_8979 = null;
			int i_6_ = 107 / ((i + 37) / 48);
			aClass182_8980 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eq.E(" + i + ')');
		}
	}

	public final void startProduction(ImageConsumer imageconsumer) {
		try {
			anInt8970++;
			addConsumer(imageconsumer);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("eq.startProduction("
					+ (imageconsumer != null ? "{...}" : "null") + ')'));
		}
	}

	private final synchronized void method3528(boolean bool) {
		do {
			try {
				anInt8966++;
				if (anImageConsumer8971 != null) {
					anImageConsumer8971.setPixels(0, 0,
							((Class11_Sub30) this).anInt6613,
							((Class11_Sub30) this).anInt6617, aColorModel8967,
							((Class11_Sub30) this).anIntArray6611, 0,
							((Class11_Sub30) this).anInt6613);
					anImageConsumer8971.imageComplete(2);
					if (bool == true)
						break;
					aCanvas8964 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "eq.H(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	final void method2730(int i, int i_7_, int i_8_, int i_9_, int i_10_,
			int i_11_, int i_12_, Graphics graphics) {
		try {
			int i_13_ = 117 % ((16 - i_9_) / 62);
			method3529(i, i_11_, i_12_, 24613, i_8_);
			anInt8969++;
			Shape shape = graphics.getClip();
			graphics.clipRect(i_7_, i_10_, i_8_, i);
			graphics.drawImage(anImage8962, -i_12_ + i_7_, -i_11_ + i_10_,
					aCanvas8964);
			graphics.setClip(shape);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("eq.C(" + i + ','
					+ i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ','
					+ i_11_ + ',' + i_12_ + ','
					+ (graphics != null ? "{...}" : "null") + ')'));
		}
	}

	public final synchronized boolean isConsumer(ImageConsumer imageconsumer) {
		try {
			anInt8961++;
			if (imageconsumer != anImageConsumer8971)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eq.isConsumer("
					+ (imageconsumer != null ? "{...}" : "null") + ')');
		}
	}

	final void method2731(int i, int i_14_, boolean bool, Canvas canvas) {
		do {
			try {
				aCanvas8964 = canvas;
				((Class11_Sub30) this).anInt6617 = i;
				((Class11_Sub30) this).anInt6613 = i_14_;
				anInt8968++;
				((Class11_Sub30) this).anIntArray6611 = new int[(((Class11_Sub30) this).anInt6613 * ((Class11_Sub30) this).anInt6617)];
				aColorModel8967 = new DirectColorModel(32, 16711680, 65280, 255);
				anImage8962 = aCanvas8964.createImage(this);
				method3528(true);
				aCanvas8964.prepareImage(anImage8962, aCanvas8964);
				method3528(true);
				aCanvas8964.prepareImage(anImage8962, aCanvas8964);
				method3528(!bool);
				aCanvas8964.prepareImage(anImage8962, aCanvas8964);
				if (bool == false)
					break;
				method3528(false);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("eq.D(" + i + ','
						+ i_14_ + ',' + bool + ','
						+ (canvas != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	private final synchronized void method3529(int i, int i_15_, int i_16_,
			int i_17_, int i_18_) {
		try {
			anInt8974++;
			if (anImageConsumer8971 != null && i_17_ == 24613) {
				anImageConsumer8971.setPixels(i_16_, i_15_, i_18_, i,
						aColorModel8967, ((Class11_Sub30) this).anIntArray6611,
						i_16_ + ((Class11_Sub30) this).anInt6613 * i_15_,
						((Class11_Sub30) this).anInt6613);
				anImageConsumer8971.imageComplete(2);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("eq.I(" + i + ','
					+ i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ')'));
		}
	}

	public final synchronized void removeConsumer(ImageConsumer imageconsumer) {
		do {
			try {
				anInt8973++;
				if (anImageConsumer8971 != imageconsumer)
					break;
				anImageConsumer8971 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205
						.method1298(runtimeexception,
								("eq.removeConsumer("
										+ (imageconsumer != null ? "{...}"
												: "null") + ')'));
			}
			break;
		} while (false);
	}

	static final void method3530(Class42 class42, int i, int i_19_,
			Player class376_sub7_sub5_sub5_sub1, int i_20_, int i_21_,
			int i_22_, Npc class376_sub7_sub5_sub5_sub2) {
		try {
			anInt8976++;
			Class11_Sub19 class11_sub19 = new Class11_Sub19();
			((Class11_Sub19) class11_sub19).anInt5823 = i_20_;
			int i_23_ = 83 / ((-24 - i_22_) / 35);
			((Class11_Sub19) class11_sub19).anInt5828 = i_21_ << 9;
			((Class11_Sub19) class11_sub19).anInt5814 = i << 9;
			if (class42 == null) {
				if (class376_sub7_sub5_sub5_sub2 != null) {
					((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub2_5844 = class376_sub7_sub5_sub5_sub2;
					NPCDefinitions class215 = (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501);
					if (((NPCDefinitions) class215).anIntArray2950 != null) {
						((Class11_Sub19) class11_sub19).aBool5831 = true;
						class215 = class215.method1375((byte) 29,
								Class11_Sub26.aClass97_6296);
					}
					if (class215 != null) {
						((Class11_Sub19) class11_sub19).anInt5819 = ((NPCDefinitions) class215).anInt2975
								+ i_21_ << 9;
						((Class11_Sub19) class11_sub19).anInt5832 = i
								+ ((NPCDefinitions) class215).anInt2975 << 9;
						((Class11_Sub19) class11_sub19).anInt5842 = Class9
								.method114((byte) -74,
										class376_sub7_sub5_sub5_sub2);
						((Class11_Sub19) class11_sub19).anInt5821 = ((NPCDefinitions) class215).anInt2923 << 9;
						((Class11_Sub19) class11_sub19).anInt5835 = ((NPCDefinitions) class215).anInt2927;
						((Class11_Sub19) class11_sub19).aBool5834 = ((NPCDefinitions) class215).aBool2936;
						((Class11_Sub19) class11_sub19).anInt5826 = ((NPCDefinitions) class215).anInt2935;
						((Class11_Sub19) class11_sub19).anInt5836 = ((NPCDefinitions) class215).anInt2934;
					}
					Class339.aClass84_4487.method589((byte) -13, class11_sub19);
				} else if (class376_sub7_sub5_sub5_sub1 != null) {
					((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub1_5841 = class376_sub7_sub5_sub5_sub1;
					((Class11_Sub19) class11_sub19).anInt5819 = (class376_sub7_sub5_sub5_sub1
							.method3968((byte) 127) + i_21_) << 9;
					((Class11_Sub19) class11_sub19).anInt5832 = i
							- -class376_sub7_sub5_sub5_sub1
									.method3968((byte) 127) << 9;
					((Class11_Sub19) class11_sub19).anInt5842 = Class180
							.method1180(class376_sub7_sub5_sub5_sub1, -23426);
					((Class11_Sub19) class11_sub19).anInt5836 = ((Player) class376_sub7_sub5_sub5_sub1).anInt10394;
					((Class11_Sub19) class11_sub19).anInt5821 = ((Player) class376_sub7_sub5_sub5_sub1).anInt10383 << 9;
					((Class11_Sub19) class11_sub19).aBool5834 = ((Player) class376_sub7_sub5_sub5_sub1).hasDisplayName;
					((Class11_Sub19) class11_sub19).anInt5826 = 256;
					((Class11_Sub19) class11_sub19).anInt5835 = 256;
					Class151.aClass213_2009
							.method1368(
									(long) ((Actor) class376_sub7_sub5_sub5_sub1).anInt10319,
									class11_sub19, (byte) -26);
				}
			} else {
				((Class11_Sub19) class11_sub19).aClass42_5840 = class42;
				int i_24_ = ((Class42) class42).anInt682;
				int i_25_ = ((Class42) class42).anInt687;
				if (i_19_ == 1 || (i_19_ ^ 0xffffffff) == -4) {
					i_24_ = ((Class42) class42).anInt687;
					i_25_ = ((Class42) class42).anInt682;
				}
				((Class11_Sub19) class11_sub19).anInt5836 = ((Class42) class42).anInt609;
				((Class11_Sub19) class11_sub19).anInt5822 = ((Class42) class42).anInt668;
				((Class11_Sub19) class11_sub19).anInt5826 = ((Class42) class42).anInt598;
				((Class11_Sub19) class11_sub19).aBool5833 = ((Class42) class42).aBool603;
				((Class11_Sub19) class11_sub19).anInt5820 = ((Class42) class42).anInt617;
				((Class11_Sub19) class11_sub19).anInt5832 = i - -i_25_ << 9;
				((Class11_Sub19) class11_sub19).anInt5821 = ((Class42) class42).anInt689 << 9;
				((Class11_Sub19) class11_sub19).anInt5819 = i_24_ + i_21_ << 9;
				((Class11_Sub19) class11_sub19).anIntArray5816 = ((Class42) class42).anIntArray631;
				((Class11_Sub19) class11_sub19).aBool5834 = ((Class42) class42).aBool613;
				((Class11_Sub19) class11_sub19).anInt5835 = ((Class42) class42).anInt651;
				((Class11_Sub19) class11_sub19).anInt5842 = ((Class42) class42).anInt680;
				if (((Class42) class42).anIntArray683 != null) {
					((Class11_Sub19) class11_sub19).aBool5831 = true;
					class11_sub19.method2482(43);
				}
				if (((Class11_Sub19) class11_sub19).anIntArray5816 != null)
					((Class11_Sub19) class11_sub19).anInt5827 = ((int) (Math
							.random() * (double) (-(((Class11_Sub19) class11_sub19).anInt5820) + ((Class11_Sub19) class11_sub19).anInt5822)) + ((Class11_Sub19) class11_sub19).anInt5820);
				Class332.aClass84_4407.method589((byte) -13, class11_sub19);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("eq.F("
							+ (class42 != null ? "{...}" : "null")
							+ ','
							+ i
							+ ','
							+ i_19_
							+ ','
							+ (class376_sub7_sub5_sub5_sub1 != null ? "{...}"
									: "null")
							+ ','
							+ i_20_
							+ ','
							+ i_21_
							+ ','
							+ i_22_
							+ ','
							+ (class376_sub7_sub5_sub5_sub2 != null ? "{...}"
									: "null") + ')'));
		}
	}

	static final boolean method3531(Class376_Sub7 class376_sub7, boolean bool,
			byte[][][] is, int i, byte i_26_) {
		if (!Class246.aBool3327)
			return false;
		int i_27_ = (((Class376_Sub7) class376_sub7).anInt7045 >> Class11_Sub2_Sub8.anInt8751);
		int i_28_ = i_27_;
		int i_29_ = (((Class376_Sub7) class376_sub7).anInt7031 >> Class11_Sub2_Sub8.anInt8751);
		int i_30_ = i_29_;
		if (class376_sub7 instanceof Class376_Sub7_Sub5) {
			i_28_ = (((Class376_Sub7_Sub5) (Class376_Sub7_Sub5) class376_sub7).aShort9624);
			i_30_ = (((Class376_Sub7_Sub5) (Class376_Sub7_Sub5) class376_sub7).aShort9620);
			i_27_ = (((Class376_Sub7_Sub5) (Class376_Sub7_Sub5) class376_sub7).aShort9626);
			i_29_ = (((Class376_Sub7_Sub5) (Class376_Sub7_Sub5) class376_sub7).aShort9629);
		}
		for (int i_31_ = i_27_; i_31_ <= i_28_; i_31_++) {
			for (int i_32_ = i_29_; i_32_ <= i_30_; i_32_++) {
				if ((((Class376_Sub7) class376_sub7).aByte7039 < Class155.anInt2044)
						&& i_31_ >= Class244.anInt3312
						&& i_31_ < Class331.anInt4398
						&& i_32_ >= Class33.anInt456
						&& i_32_ < Class179.anInt2291) {
					if ((is != null
							&& ((Class376_Sub7) class376_sub7).aByte7047 >= i && (is[((Class376_Sub7) class376_sub7).aByte7047][i_31_][i_32_]) == i_26_)
							|| !class376_sub7.method2869(-21499)
							|| class376_sub7.method2865(-113)) {
						if (!bool && i_31_ >= Class11_Sub45_Sub7.anInt8807 - 16
								&& i_31_ <= Class11_Sub45_Sub7.anInt8807 + 16
								&& i_32_ >= Class15.anInt134 - 16
								&& i_32_ <= Class15.anInt134 + 16) {
							if (Class376_Sub1.aBool5098) {
								Class376_Sub1_Sub1.aClass322Array8690[Class163_Sub2_Sub1.anInt8649++]
										.method1968(class376_sub7, 8192);
								Class163_Sub2_Sub1.anInt8649 %= Class205.anInt2763;
							} else
								class376_sub7.method2874((byte) -119,
										(Class87.aClass163_1210));
						}
					} else
						return false;
				}
			}
		}
		return true;
	}

	public final synchronized void addConsumer(ImageConsumer imageconsumer) {
		try {
			anImageConsumer8971 = imageconsumer;
			anInt8972++;
			imageconsumer.setDimensions(((Class11_Sub30) this).anInt6613,
					((Class11_Sub30) this).anInt6617);
			imageconsumer.setProperties(null);
			imageconsumer.setColorModel(aColorModel8967);
			imageconsumer.setHints(14);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("eq.addConsumer("
					+ (imageconsumer != null ? "{...}" : "null") + ')'));
		}
	}

	public final void requestTopDownLeftRightResend(ImageConsumer imageconsumer) {
		try {
			anInt8975++;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(
							runtimeexception,
							("eq.requestTopDownLeftRightResend("
									+ (imageconsumer != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		for (int i = 0; (i ^ 0xffffffff) > -257; i++) {
			int i_33_ = i;
			for (int i_34_ = 0; i_34_ < 8; i_34_++) {
				if ((i_33_ & 0x1) == 1)
					i_33_ = ~0x12477cdf ^ i_33_ >>> 1;
				else
					i_33_ >>>= 1;
			}
			anIntArray8977[i] = i_33_;
		}
		currentUsername = "";
		aClass347_8979 = new Class347("LOCAL", 4);
	}
}
