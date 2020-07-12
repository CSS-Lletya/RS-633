/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.Socket;
import java.net.URL;

final class Class71 {
	static int anInt989 = -1;
	static int anInt990;
	static IncomingPacket aClass160_991 = new IncomingPacket(119, -2);
	static int anInt992;
	static int anInt993;
	static int anInt994;
	static int anInt995;
	int anInt996 = 0;
	static int anInt997;
	static OutgoingPacket aClass370_998 = new OutgoingPacket(54, -1);
	/* synthetic */static Class aClass999;
	/* synthetic */static Class aClass1000;

	public static void method510(byte i) {
		do {
			try {
				aClass160_991 = null;
				aClass370_998 = null;
				if (i < -47)
					break;
				method514(-45, 43, (byte) 118);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "sca.C(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method511(int i, Stream stream, boolean bool) {
		try {
			if (bool != true)
				method514(118, 36, (byte) -70);
			if ((i ^ 0xffffffff) == -6)
				((Class71) this).anInt996 = stream
						.readUnsignedShort((byte) -65);
			anInt990++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sca.B(" + i + ','
					+ (stream != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	static final void processLogin(byte i) {
		do {
			try {
				anInt992++;
				if (Class94_Sub1.loginStep != 0 && Class94_Sub1.loginStep != 5) {
					try {
						int i_0_;
						if ((Class225_Sub1.anInt5007 ^ 0xffffffff) != -1)
							i_0_ = 2000;
						else
							i_0_ = 250;
						if (++Class231.anInt3170 > i_0_) {
							if (Class108_Sub2.aClass217_5081 != null) {
								Class108_Sub2.aClass217_5081
										.method1398(-2147483648);
								Class108_Sub2.aClass217_5081 = null;
							}
							if (Class225_Sub1.anInt5007 >= 3) {
								Class94_Sub1.loginStep = 0;
								Class340.method2051(-5, false);
								break;
							}
							if (Class11_Sub45_Sub1_Sub2.anInt9885 != 2)
								Class108_Sub23.aClass46_7759.method409(-110);
							else
								Class275.aClass46_3705.method409(-57);
							Class94_Sub1.loginStep = 1;
							Class231.anInt3170 = 0;
							Class225_Sub1.anInt5007++;
						}
						if (Class94_Sub1.loginStep == 1) {
							if (Class11_Sub45_Sub1_Sub2.anInt9885 == 2)
								Class108_Sub13.aClass368_6267 = (Class275.aClass46_3705
										.method406(
												Class108_Sub21.aClass341_7304,
												(byte) -112));
							else
								Class108_Sub13.aClass368_6267 = (Class108_Sub23.aClass46_7759
										.method406(
												Class108_Sub21.aClass341_7304,
												(byte) -89));
							Class94_Sub1.loginStep = 2;
						}
						if (Class94_Sub1.loginStep == 2) {
							if (Class108_Sub13.aClass368_6267.anInt4837 == 2)
								throw new IOException();
							if (Class108_Sub13.aClass368_6267.anInt4837 != 1)
								break;
							Class108_Sub2.aClass217_5081 = Class338
									.method2034(
											7500,
											(Socket) (Class108_Sub13.aClass368_6267.anObject4838),
											93);
							Class108_Sub13.aClass368_6267 = null;
							Class58_Sub2.method3152(0);
							Class11_Sub10 class11_sub10 = Class11_Sub45_Sub6
									.method3441(-107);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeByte(
											(((Class289) Class11_Sub37.aClass289_7089).opcode),
											-1528071456);
							Class79.method541(class11_sub10, -7);
							Class234_Sub2_Sub2.method3540((byte) -31);
							Class94_Sub1.loginStep = 3;
						}
						if (Class94_Sub1.loginStep == 3) {
							if (!Class108_Sub2.aClass217_5081.method1399(
									(byte) 53, 1))
								break;
							Class108_Sub2.aClass217_5081.method1396(-1,
									(((Stream) Class3.packetStream).buffer), 0,
									1);
							int i_1_ = ((((Stream) Class3.packetStream).buffer[0]) & 0xff);
							if ((i_1_ ^ 0xffffffff) != -1) {
								Class94_Sub1.loginStep = 0;
								Class340.method2051(i_1_, false);
								Class108_Sub2.aClass217_5081
										.method1398(-2147483648);
								Class108_Sub2.aClass217_5081 = null;
								Class11_Sub50.method3228(false);
								break;
							}
							((Stream) Class3.packetStream).position = 0;
							Stream stream = new Stream(518);
							int[] is = new int[4];
							is[2] = (int) (9.9999999E7 * Math.random());
							is[1] = (int) (Math.random() * 9.9999999E7);
							is[3] = (int) (9.9999999E7 * Math.random());
							is[0] = (int) (9.9999999E7 * Math.random());
							stream.writeByte(10, -1528071456);
							stream.writeInt(-49, is[0]);
							stream.writeInt(-49, is[1]);
							stream.writeInt(-49, is[2]);
							stream.writeInt(-49, is[3]);
							stream.writeLong((byte) -103, 0L);
							stream.writeString((byte) 27,
									Class11_Sub45_Sub8.currentPassword);
							stream.writeLong((byte) -103, Class309.aLong4144);
							stream.writeLong((byte) -103, Class134.aLong1851);
							stream.encodeRSA(
									(Class11_Sub2_Sub5.loginExponentRSA),
									22832, Class11_Sub46.loginModulusRSA);
							Class58_Sub2.method3152(0);
							Class11_Sub10 class11_sub10 = Class11_Sub45_Sub6
									.method3441(-104);
							Packet packet = (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397);
							if (Class11_Sub45_Sub1_Sub2.anInt9885 != 2) {
								// LOBBY LOGIN
								packet.writeByte(
										(((Class289) Class11_Sub37.aClass289_7095).opcode),
										-1528071456);
								packet.writeShort(-111, 0);
								int i_2_ = ((Stream) packet).position;
								packet.writeInt(-49, 633);
								packet.writeBytes(true,
										((Stream) stream).buffer,
										((Stream) stream).position, 0);
								int i_3_ = ((Stream) packet).position;
								packet.writeString((byte) 27,
										Class11_Sub30_Sub1.currentUsername);
								packet.writeByte(
										(((Class66) Class198.aClass66_2679).anInt945),
										-1528071456);
								packet.writeByte(
										Class11_Sub45_Sub1_Sub2.anInt9884,
										-1528071456);
								Class83.method573(packet, (byte) 105);
								packet.writeString((byte) 27,
										Class11_Sub2_Sub5.aString8552);
								packet.writeInt(-49, Class53.anInt817);
								Class301.method1855(-3203, packet);
								packet.encryptXTEA(((Stream) packet).position,
										is, 100, i_3_);
								packet.endPacketVarShort(-i_2_
										+ (((Stream) packet).position),
										(byte) -87);
							} else {
								// normal login
								if (Class285.anInt3846 == 13)
									packet.writeByte(
											(((Class289) Class11_Sub37.aClass289_7094).opcode),
											-1528071456);
								else
									packet.writeByte(
											(((Class289) Class11_Sub37.aClass289_7092).opcode),
											-1528071456);
								packet.writeShort(-121, 0);
								int i_4_ = ((Stream) packet).position;
								packet.writeInt(-49, 633);
								packet.writeBytes(true,
										((Stream) stream).buffer,
										((Stream) stream).position, 0);
								int i_5_ = ((Stream) packet).position;
								packet.writeString((byte) 27,
										Class11_Sub30_Sub1.currentUsername);
								packet.writeByte((Class108_Sub23.anInt7766),
										-1528071456);
								packet.writeByte(
										Class187.method1227((byte) 54),
										-1528071456);
								packet.writeShort(-116, Class11_Sub36.anInt7079);
								packet.writeShort(-120, Class153.anInt2025);
								packet.writeByte(
										((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub15_5728
												.method2698(false), -1528071456);
								Class83.method573(packet,// skip these UID 24
															// bytes
										(byte) 104);
								packet.writeString((byte) 27,
										Class11_Sub2_Sub5.aString8552);
								packet.writeInt(-49, Class53.anInt817);

								// we skip these
								Stream stream_6_ = Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
										.method2457((byte) 86);
								packet.writeByte(
										(((Stream) stream_6_).position),
										-1528071456);
								packet.writeBytes(true,
										((Stream) stream_6_).buffer,
										((Stream) stream_6_).position, 0);

								Class236_Sub1.aBool6093 = true;

								// We skip these too. Size: 31
								Stream stream_7_ = new Stream(
										Class205.aClass11_Sub16_2755
												.method2448((byte) -10));
								Class205.aClass11_Sub16_2755.method2447(false,
										stream_7_);
								packet.writeBytes(true,
										((Stream) stream_7_).buffer,
										(((Stream) stream_7_).buffer).length, 0);

								packet.writeShort(-117, Class199.anInt2692);
								packet.writeLong((byte) -103,
										(Class118.aLong1607));
								packet.writeByte(
										(Class11_Sub2_Sub1.aString8438 != null ? 1
												: 0), -1528071456);
								if (Class11_Sub2_Sub1.aString8438 != null)
									packet.writeString((byte) 27,
											Class11_Sub2_Sub1.aString8438);
								packet.writeByte(
										(!Class11_Sub2_Sub3.method3338(
												(byte) -75, "jagtheora") ? 0
												: 1), -1528071456);
								Class301.method1855(-3203, packet);// index crcs
								packet.encryptXTEA(((Stream) packet).position,
										is, 114, i_5_);
								packet.endPacketVarShort(
										(((Stream) packet).position + -i_4_),
										(byte) -87);
							}
							Class79.method541(class11_sub10, -72);
							Class234_Sub2_Sub2.method3540((byte) 125);
							Class11_Sub3.aClass25_5113 = new ISAAC(is);
							for (int i_8_ = 0; i_8_ < 4; i_8_++)
								is[i_8_] += 50;
							Class3.packetStream.method3424(is, -16797);
							Class94_Sub1.loginStep = 4;
						}
						if (Class94_Sub1.loginStep == 4) {
							if (!Class108_Sub2.aClass217_5081.method1399(
									(byte) 53, 1))
								break;
							Class108_Sub2.aClass217_5081.method1396(-1,
									(((Stream) Class3.packetStream).buffer), 0,
									1);
							int i_9_ = (0xff & (((Stream) Class3.packetStream).buffer[0]));
							if ((i_9_ ^ 0xffffffff) != -22) {
								if (i_9_ != 29) {
									if (i_9_ == 1) {
										Class94_Sub1.loginStep = 5;
										Class340.method2051(i_9_, false);
										break;
									}
									if (i_9_ != 2) {
										if (i_9_ == 15) {
											Class37.anInt486 = -2;
											Class94_Sub1.loginStep = 14;
										} else {
											if ((i_9_ ^ 0xffffffff) == -24
													&& (Class225_Sub1.anInt5007 ^ 0xffffffff) > -4) {
												Class231.anInt3170 = 0;
												Class225_Sub1.anInt5007++;
												Class94_Sub1.loginStep = 1;
												Class108_Sub2.aClass217_5081
														.method1398(-2147483648);
												Class108_Sub2.aClass217_5081 = null;
											} else {
												Class94_Sub1.loginStep = 0;
												Class340.method2051(i_9_, false);
												Class108_Sub2.aClass217_5081
														.method1398(-2147483648);
												Class108_Sub2.aClass217_5081 = null;
												Class11_Sub50.method3228(false);
												break;
											}
											break;
										}
									} else
										Class94_Sub1.loginStep = 8;
								} else
									Class94_Sub1.loginStep = 13;
							} else
								Class94_Sub1.loginStep = 7;
						}
						if (Class94_Sub1.loginStep == 6) {
							Class58_Sub2.method3152(0);
							Class11_Sub10 class11_sub10 = Class11_Sub45_Sub6
									.method3441(-115);
							Packet class11_sub20_sub1 = (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397);
							class11_sub20_sub1.method3422(
									Class11_Sub3.aClass25_5113, 12693);
							class11_sub20_sub1
									.method3420(
											-16073,
											(((Class289) (Class11_Sub37.aClass289_7101)).opcode));
							Class79.method541(class11_sub10, -29);
							Class234_Sub2_Sub2.method3540((byte) -65);
							Class94_Sub1.loginStep = 4;
							break;
						}
						if ((Class94_Sub1.loginStep ^ 0xffffffff) == -8) {
							if (Class108_Sub2.aClass217_5081.method1399(
									(byte) 53, 1)) {
								Class108_Sub2.aClass217_5081
										.method1396(
												-1,
												(((Stream) Class3.packetStream).buffer),
												0, 1);
								int i_10_ = (((Stream) Class3.packetStream).buffer[0]) & 0xff;
								Class330.anInt4383 = 60 * (i_10_ + 3);
								Class94_Sub1.loginStep = 0;
								Class340.method2051(21, false);
								Class108_Sub2.aClass217_5081
										.method1398(-2147483648);
								Class108_Sub2.aClass217_5081 = null;
								Class11_Sub50.method3228(false);
								break;
							}
							break;
						}
						if (Class94_Sub1.loginStep == 13) {
							if (Class108_Sub2.aClass217_5081.method1399(
									(byte) 53, 1)) {
								Class108_Sub2.aClass217_5081
										.method1396(
												-1,
												(((Stream) Class3.packetStream).buffer),
												0, 1);
								Class94_Sub1.loginStep = 0;
								Class261.anInt3589 = 0xff & (((Stream) Class3.packetStream).buffer[0]);
								Class340.method2051(29, false);
								Class108_Sub2.aClass217_5081
										.method1398(-2147483648);
								Class108_Sub2.aClass217_5081 = null;
								Class11_Sub50.method3228(false);
								break;
							}
							break;
						}
						if (Class94_Sub1.loginStep == 8) {
							if (Class108_Sub2.aClass217_5081.method1399(
									(byte) 53, 1)) {
								Class108_Sub2.aClass217_5081
										.method1396(
												-1,
												(((Stream) Class3.packetStream).buffer),
												0, 1);
								Class209.anInt2846 = 0xff & (((Stream) Class3.packetStream).buffer[0]);
								Class94_Sub1.loginStep = 9;
								break;
							}
							break;
						}
						if (Class94_Sub1.loginStep == 9) {
							Packet class11_sub20_sub1 = Class3.packetStream;
							if ((Class11_Sub45_Sub1_Sub2.anInt9885 ^ 0xffffffff) == -3) {
								if (!Class108_Sub2.aClass217_5081.method1399(
										(byte) 53, Class209.anInt2846))
									break;
								Class108_Sub2.aClass217_5081.method1396(-1,
										(((Stream) class11_sub20_sub1).buffer),
										0, Class209.anInt2846);
								((Stream) class11_sub20_sub1).position = 0;
								Class256_Sub2.anInt7713 = class11_sub20_sub1
										.readUnsignedByte((byte) 35);
								Class193.anInt2634 = class11_sub20_sub1
										.readUnsignedByte((byte) 35);
								Class11_Sub2_Sub29.aBool9474 = (class11_sub20_sub1
										.readUnsignedByte((byte) 35) == 1);
								Class242.aBool3289 = (class11_sub20_sub1
										.readUnsignedByte((byte) 35) == 1);
								Class11_Sub2_Sub22.aBool9202 = (class11_sub20_sub1
										.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2;
								Class100.aBool1328 = (class11_sub20_sub1
										.readUnsignedByte((byte) 35) == 1);
								Class11_Sub44.anInt7791 = class11_sub20_sub1
										.readUnsignedShort((byte) -65);
								Class240.aBool3259 = (class11_sub20_sub1
										.readUnsignedByte((byte) 35) == 1);
								Class108_Sub1.anInt5029 = class11_sub20_sub1
										.method2554(19);
								Class233.aBool3197 = (class11_sub20_sub1
										.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2;
								Class11_Sub4.aClass290_5237.method1786(8,
										Class233.aBool3197);
								Packet.aClass223_8723.method1421(
										Class233.aBool3197, 255);
								Class11_Sub19.aClass318_5817.method1932(-100,
										Class233.aBool3197);
							} else {
								if (!Class108_Sub2.aClass217_5081.method1399(
										(byte) 53, Class209.anInt2846))
									break;
								Class108_Sub2.aClass217_5081.method1396(-1,
										(((Stream) class11_sub20_sub1).buffer),
										0, Class209.anInt2846);
								((Stream) class11_sub20_sub1).position = 0;
								Class256_Sub2.anInt7713 = class11_sub20_sub1
										.readUnsignedByte((byte) 35);
								Class193.anInt2634 = class11_sub20_sub1
										.readUnsignedByte((byte) 35);
								Class11_Sub2_Sub29.aBool9474 = (class11_sub20_sub1
										.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2;
								Class242.aBool3289 = (class11_sub20_sub1
										.readUnsignedByte((byte) 35) == 1);
								Class11_Sub2_Sub22.aBool9202 = (class11_sub20_sub1
										.readUnsignedByte((byte) 35) == 1);
								Class236_Sub5.anInt6855 = class11_sub20_sub1
										.method2508((byte) 69);
								Class240.aBool3259 = Class236_Sub5.anInt6855 > 0;
								Class98.anInt1309 = class11_sub20_sub1
										.readUnsignedShort((byte) -65);
								Class11_Sub2_Sub36.anInt9755 = class11_sub20_sub1
										.readUnsignedShort((byte) -65);
								Class11.anInt84 = class11_sub20_sub1
										.readUnsignedShort((byte) -65);
								Class11_Sub2_Sub16.anInt9043 = class11_sub20_sub1
										.readInt(107);
								Class11_Sub2_Sub4.aClass368_8500 = (Class108_Sub21.aClass341_7304
										.method2069(
												Class11_Sub2_Sub16.anInt9043,
												(byte) 0));
								Class11_Sub6_Sub3.anInt9128 = class11_sub20_sub1
										.readUnsignedByte((byte) 35);
								Class300.anInt4049 = class11_sub20_sub1
										.readUnsignedShort((byte) -65);
								Class197.anInt2667 = class11_sub20_sub1
										.readUnsignedShort((byte) -65);
								Class379.aBool4957 = (class11_sub20_sub1
										.readUnsignedByte((byte) 35) == 1);
								((Player) (Class11_Sub2_Sub8.myPlayer)).aString10400 = ((Player) (Class11_Sub2_Sub8.myPlayer)).aString10408 = Class126.aString1691 = class11_sub20_sub1
										.method2528(-63);
								Class11_Sub2_Sub7.anInt8731 = class11_sub20_sub1
										.readUnsignedByte((byte) 35);
								Class94_Sub2.anInt5588 = class11_sub20_sub1
										.readInt(125);
								Class11_Sub45_Sub20_Sub1.aClass46_9960 = new Class46();
								((Class46) (Class11_Sub45_Sub20_Sub1.aClass46_9960)).anInt730 = class11_sub20_sub1
										.readUnsignedShort((byte) -65);
								if ((((Class46) (Class11_Sub45_Sub20_Sub1.aClass46_9960)).anInt730 ^ 0xffffffff) == -65536)
									((Class46) (Class11_Sub45_Sub20_Sub1.aClass46_9960)).anInt730 = -1;
								((Class46) (Class11_Sub45_Sub20_Sub1.aClass46_9960)).aString733 = class11_sub20_sub1
										.method2528(-94);
								if (Class362.aClass347_4711 != Class11_Sub2_Sub24.aClass347_9284) {
									((Class46) (Class11_Sub45_Sub20_Sub1.aClass46_9960)).anInt726 = 50000 + ((Class46) (Class11_Sub45_Sub20_Sub1.aClass46_9960)).anInt730;
									((Class46) (Class11_Sub45_Sub20_Sub1.aClass46_9960)).anInt720 = 40000 - -((Class46) (Class11_Sub45_Sub20_Sub1.aClass46_9960)).anInt730;
								}
								if ((Class11_Sub2_Sub24.aClass347_9284 != Class11_Sub30_Sub1.aClass347_8979)
										&& ((Class275.aClass46_3705.method407(
												62, Class181.aClass46_2337)) || (Class275.aClass46_3705
												.method407(
														-100,
														Class2_Sub8.aClass46_6867))))
									Class349.method2100((byte) 71);
							}
							if ((Class11_Sub2_Sub29.aBool9474 && !Class11_Sub2_Sub22.aBool9202)
									|| Class240.aBool3259) {
								try {
									Class36.method311("zap", 87,
											(Class108_Sub16.anApplet6538));
								} catch (Throwable throwable) {
									if (Class58_Sub1.aBool7291) {
										try {
											Class108_Sub16.anApplet6538
													.getAppletContext()
													.showDocument(
															new URL(
																	Class108_Sub16.anApplet6538
																			.getCodeBase(),
																	"blank.ws"),
															"tbi");
										} catch (Exception exception) {
											/* empty */
										}
									}
								}
							} else {
								try {
									Class36.method311("unzap", 117,
											(Class108_Sub16.anApplet6538));
								} catch (Throwable throwable) {
									/* empty */
								}
							}
							if (Class362.aClass347_4711 == Class11_Sub2_Sub24.aClass347_9284) {
								try {
									Class36.method311("loggedin", 107,
											(Class108_Sub16.anApplet6538));
								} catch (Throwable throwable) {
									/* empty */
								}
							}
							if (Class11_Sub45_Sub1_Sub2.anInt9885 == 2)
								Class94_Sub1.loginStep = 11;
							else {
								Class94_Sub1.loginStep = 0;
								Class340.method2051(2, false);
								Class201.method1290(-28577);
								Class83.method575(false, 7);
								Class236_Sub9.incomingPacket = null;
								break;
							}
						}
						if ((Class94_Sub1.loginStep ^ 0xffffffff) == -12) {
							if (!Class108_Sub2.aClass217_5081.method1399(
									(byte) 53, 3))
								break;
							Class108_Sub2.aClass217_5081.method1396(-1,
									(((Stream) Class3.packetStream).buffer), 0,
									3);
							Class94_Sub1.loginStep = 12;
						}
						if ((Class94_Sub1.loginStep ^ 0xffffffff) == -13) {
							Packet class11_sub20_sub1 = Class3.packetStream;
							((Stream) class11_sub20_sub1).position = 0;
							if (class11_sub20_sub1.method3418((byte) 83)) {
								if (!Class108_Sub2.aClass217_5081.method1399(
										(byte) 53, 1))
									break;
								Class108_Sub2.aClass217_5081.method1396(-1,
										(((Stream) class11_sub20_sub1).buffer),
										3, 1);
							}
							Class236_Sub9.incomingPacket = (Class11_Sub12_Sub4
									.method3731(-4638)[class11_sub20_sub1
									.readPacket((byte) -21)]);
							Class37.anInt486 = class11_sub20_sub1
									.readUnsignedShort((byte) -65);
							Class94_Sub1.loginStep = 10;
						}
						if (Class94_Sub1.loginStep == 10) {
							if (Class108_Sub2.aClass217_5081.method1399(
									(byte) 53, Class37.anInt486)) {
								Class108_Sub2.aClass217_5081
										.method1396(
												-1,
												(((Stream) Class3.packetStream).buffer),
												0, Class37.anInt486);
								((Stream) Class3.packetStream).position = 0;
								Class94_Sub1.loginStep = 0;
								int i_11_ = Class37.anInt486;
								Class340.method2051(2, false);
								Class96.method647(true);
								Class2_Sub7.method2609((byte) 51,
										Class3.packetStream);
								Class350.anInt4617 = -1;
								if (Class6.aClass160_36 != Class236_Sub9.incomingPacket)
									Class195_Sub1
											.decodeReceivedMapRegions(28123);
								else
									Class218.sendDynamicMapRegion(26);
								if ((((Stream) Class3.packetStream).position) != i_11_)
									throw new RuntimeException(
											"lswp pos:"
													+ (((Stream) (Class3.packetStream)).position)
													+ " psize:" + i_11_);
								Class236_Sub9.incomingPacket = null;
								break;
							}
							break;
						}
						if (Class94_Sub1.loginStep == 14) {
							if (Class37.anInt486 == -2) {
								if (!Class108_Sub2.aClass217_5081.method1399(
										(byte) 53, 2))
									break;
								Class108_Sub2.aClass217_5081
										.method1396(
												-1,
												(((Stream) Class3.packetStream).buffer),
												0, 2);
								((Stream) Class3.packetStream).position = 0;
								Class37.anInt486 = Class3.packetStream
										.readUnsignedShort((byte) -65);
							}
							if (Class108_Sub2.aClass217_5081.method1399(
									(byte) 53, Class37.anInt486)) {
								Class108_Sub2.aClass217_5081
										.method1396(
												-1,
												(((Stream) Class3.packetStream).buffer),
												0, Class37.anInt486);
								((Stream) Class3.packetStream).position = 0;
								Class94_Sub1.loginStep = 0;
								int i_12_ = Class37.anInt486;
								Class340.method2051(15, false);
								Class11_Sub45_Sub15.method3659(-79);
								Class2_Sub7.method2609((byte) 17,
										Class3.packetStream);
								if ((((Stream) Class3.packetStream).position) != i_12_)
									throw new RuntimeException(
											"lswpr pos:"
													+ (((Stream) (Class3.packetStream)).position)
													+ " psize:" + i_12_);
								Class236_Sub9.incomingPacket = null;
								break;
							}
							break;
						}
					} catch (IOException ioexception) {
						if (Class108_Sub2.aClass217_5081 != null) {
							Class108_Sub2.aClass217_5081
									.method1398(-2147483648);
							Class108_Sub2.aClass217_5081 = null;
						}
						if (Class225_Sub1.anInt5007 >= 3) {
							Class94_Sub1.loginStep = 0;
							Class340.method2051(-4, false);
							Class11_Sub50.method3228(false);
						} else {
							if (Class11_Sub45_Sub1_Sub2.anInt9885 != 2)
								Class108_Sub23.aClass46_7759.method409(104);
							else
								Class275.aClass46_3705.method409(-53);
							Class94_Sub1.loginStep = 1;
							Class225_Sub1.anInt5007++;
							Class231.anInt3170 = 0;
						}
					}
					if (i >= 114)
						break;
					aClass370_998 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "sca.E(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method513(Stream stream, byte i) {
		do {
			try {
				anInt993++;
				for (;;) {
					int i_13_ = stream.readUnsignedByte((byte) 35);
					if (i_13_ == 0)
						break;
					method511(i_13_, stream, true);
				}
				if (i <= -44)
					break;
				method511(-31, null, false);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("sca.A("
						+ (stream != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final void method514(int i, int i_14_, byte i_15_) {
		try {
			anInt995++;
			if (i_15_ <= 23)
				method514(46, 64, (byte) 125);
			Class11_Sub2_Sub16.anInt9038 = i_14_;
			Class376_Sub7_Sub3_Sub2.anInt10143 = i;
			if (OutputStream_Sub1.anInt5845 != 0) {
				if (OutputStream_Sub1.anInt5845 != 1) {
					if ((OutputStream_Sub1.anInt5845 ^ 0xffffffff) == -3) {
						Class11_Sub39.anInt7215 = Class11_Sub2_Sub16.anInt9038;
						Class11_Sub33.anInt6897 = Class376_Sub7_Sub3_Sub2.anInt10143;
					}
				} else {
					Class39.anInt556 = (Class11_Sub2_Sub23.anInt9264 + 2 + (Class11_Sub2_Sub16.anInt9038 / Class11_Sub27.anInt6556));
					Class11_Sub45_Sub10.anInt8958 = (Class58_Sub2_Sub1.anInt9251
							+ (Class376_Sub7_Sub3_Sub2.anInt10143 / Class11_Sub24.anInt6238) + 2);
					Class11_Sub33.anInt6897 = (Class11_Sub45_Sub10.anInt8958 * Class11_Sub24.anInt6238);
					Class11_Sub39.anInt7215 = Class11_Sub27.anInt6556
							* Class39.anInt556;
					Class163_Sub2_Sub1.anInt8637 = (Class11_Sub39.anInt7215 - Class11_Sub2_Sub16.anInt9038) >> 1;
					Class264.anInt3604 = (Class11_Sub33.anInt6897 + -Class376_Sub7_Sub3_Sub2.anInt10143) >> 1;
				}
			} else {
				Class11_Sub33.anInt6897 = (Class376_Sub7_Sub3_Sub2.anInt10143 - -(2 * Class264.anInt3604));
				Class11_Sub39.anInt7215 = (Class11_Sub2_Sub16.anInt9038 + 2 * Class163_Sub2_Sub1.anInt8637);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sca.F(" + i + ','
					+ i_14_ + ',' + i_15_ + ')'));
		}
	}

	static final int method515(byte i) {
		try {
			anInt994++;
			int i_16_ = 0;
			Field[] fields = (aClass999 != null ? aClass999
					: (aClass999 = getClassByName("Class11_Sub17")))
					.getDeclaredFields();
			Field[] fields_17_ = fields;
			int i_18_ = 0;
			if (i != 100)
				return -91;
			for (/**/; fields_17_.length > i_18_; i_18_++) {
				Field field = fields_17_[i_18_];
				if ((aClass1000 != null ? aClass1000
						: (aClass1000 = getClassByName("Class108")))
						.isAssignableFrom(field.getType()))
					i_16_++;
			}
			return i_16_ + 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sca.D(" + i + ')');
		}
	}

	public Class71() {
		/* empty */
	}

	/* synthetic */static Class getClassByName(String string) {
		try {
			System.out.println(string);
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
