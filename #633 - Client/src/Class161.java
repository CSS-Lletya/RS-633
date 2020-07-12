/* Class161 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class161 {
	static int anInt2088;
	static OutgoingPacket aClass370_2089 = new OutgoingPacket(24, 3);
	int anInt2090 = 1;
	static int anInt2091;
	char aChar2092;
	static int anInt2093;
	static int anInt2094;
	static int anInt2095;
	static Class292 aClass292_2096;
	static Class38 aClass38_2097 = new Class38();
	static Class213 aClass213_2098 = new Class213(8);
	static float aFloat2099;

	final void method994(int i, Stream stream) {
		try {
			if (i < 44)
				aClass213_2098 = null;
			for (;;) {
				int i_0_ = stream.readUnsignedByte((byte) 35);
				if (i_0_ == 0)
					break;
				method999(false, stream, i_0_);
			}
			anInt2094++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gt.E(" + i + ','
					+ (stream != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method995(byte i) {
		try {
			aClass370_2089 = null;
			aClass213_2098 = null;
			int i_1_ = 1 % ((14 - i) / 50);
			aClass292_2096 = null;
			aClass38_2097 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gt.C(" + i + ')');
		}
	}

	static final boolean method996(byte i) throws IOException {
		try {
			anInt2091++;
			if (Class108_Sub2.aClass217_5081 == null)
				return false;
			if (Class236_Sub9.incomingPacket == null) {
				if (Class232.aBool3177) {
					if (!Class108_Sub2.aClass217_5081.method1399((byte) 53, 1))
						return false;
					Class108_Sub2.aClass217_5081.method1396(-1,
							(((Stream) Class3.packetStream).buffer), 0, 1);
					Class47.anInt742 = 0;
					Class236_Sub8.anInt7064++;
					Class232.aBool3177 = false;
				}
				((Stream) Class3.packetStream).position = 0;
				if (Class3.packetStream.method3418((byte) 113)) {
					if (!Class108_Sub2.aClass217_5081.method1399((byte) 53, 1))
						return false;
					Class108_Sub2.aClass217_5081.method1396(-1,
							(((Stream) Class3.packetStream).buffer), 1, 1);
					Class236_Sub8.anInt7064++;
					Class47.anInt742 = 0;
				}
				Class232.aBool3177 = true;
				IncomingPacket[] class160s = Class11_Sub12_Sub4
						.method3731(i - 4524);
				int i_2_ = Class3.packetStream.readPacket((byte) -21);
				if (i_2_ < 0
						|| (i_2_ ^ 0xffffffff) <= (class160s.length ^ 0xffffffff))
					throw new IOException("invo:" + i_2_ + " ip:"
							+ (((Stream) Class3.packetStream).position));
				Class236_Sub9.incomingPacket = class160s[i_2_];
				Class37.anInt486 = ((IncomingPacket) Class236_Sub9.incomingPacket).anInt2083;
			}
			if ((Class37.anInt486 ^ 0xffffffff) == 0) {
				if (!Class108_Sub2.aClass217_5081.method1399((byte) 53, 1))
					return false;
				Class108_Sub2.aClass217_5081.method1396(-1,
						((Stream) Class3.packetStream).buffer, 0, 1);
				Class47.anInt742 = 0;
				Class37.anInt486 = 0xff & (((Stream) Class3.packetStream).buffer[0]);
				Class236_Sub8.anInt7064++;
			}
			if ((Class37.anInt486 ^ 0xffffffff) == 1) {
				if (!Class108_Sub2.aClass217_5081.method1399((byte) 53, 2))
					return false;
				Class108_Sub2.aClass217_5081.method1396(-1,
						((Stream) Class3.packetStream).buffer, 0, 2);
				((Stream) Class3.packetStream).position = 0;
				Class37.anInt486 = Class3.packetStream
						.readUnsignedShort((byte) -65);
				Class236_Sub8.anInt7064 += 2;
				Class47.anInt742 = 0;
			}
			if (Class37.anInt486 > 0) {
				if (!Class108_Sub2.aClass217_5081.method1399((byte) 53,
						Class37.anInt486))
					return false;
				((Stream) Class3.packetStream).position = 0;
				Class108_Sub2.aClass217_5081.method1396(-1,
						((Stream) Class3.packetStream).buffer, 0,
						Class37.anInt486);
				Class47.anInt742 = 0;
				Class236_Sub8.anInt7064 += Class37.anInt486;
			}
			Class266.aClass160_3621 = Class340.aClass160_4489;
			Class340.aClass160_4489 = Class336.aClass160_4440;
			Class336.aClass160_4440 = Class236_Sub9.incomingPacket;
			if (Class236_Sub9.incomingPacket == Class227.aClass160_3131) {
				Class222.anInt3048 = Class3.packetStream
						.readUnsignedByteC(-6067);
				Class122.anInt1659 = (Class3.packetStream
						.readByte(i + 1854307234) << 3);
				Class225_Sub1.anInt5009 = (Class3.packetStream
						.method2515((byte) -14) << 3);
				while (((Stream) Class3.packetStream).position < Class37.anInt486) {
					Class83 class83 = (Class254_Sub1.method2410(-84)[Class3.packetStream
							.readUnsignedByte((byte) 35)]);
					Class307.method1881(class83, i + 113);
				}
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class300.aClass160_4044) {
				int i_3_ = Class3.packetStream.readUnsignedByte128(7925);
				int[] is = new int[4];
				for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -5; i_4_++)
					is[i_4_] = Class3.packetStream.readUnsignedShort128(true);
				int i_5_ = Class3.packetStream.readUnsignedShortLE(25651);
				Class11_Sub25 class11_sub25 = (Class11_Sub25) Class11_Sub2_Sub25.aClass213_9322
						.method1369((byte) 26, (long) i_5_);
				if (class11_sub25 != null)
					Class108_Sub29
							.method3231(
									(((Class11_Sub25) class11_sub25).aNpc_2373),
									i_3_, is, (byte) 120);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class59.aClass160_882) {
				Class2_Sub9.method2945(29167,
						Class3.packetStream.readString(-1));
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class234.aClass160_3206) {
				Class307.method1881(Class323.aClass83_4318, i + 113);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class11_Sub4.aClass160_5236) {
				int i_6_ = Class3.packetStream.readUnsignedShort((byte) -65);
				int i_7_ = Class3.packetStream.readUnsignedShort((byte) -65);
				int i_8_ = Class3.packetStream.readUnsignedShort((byte) -65);
				Class245.method1545(false);
				if (Class11_Sub45_Sub5.aClass192ArrayArray8772[i_6_] != null) {
					for (int i_9_ = i_7_; (i_9_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff); i_9_++) {
						int i_10_ = Class3.packetStream.method2558(false);
						if ((i_9_ ^ 0xffffffff) > ((Class11_Sub45_Sub5.aClass192ArrayArray8772[i_6_]).length ^ 0xffffffff)
								&& (Class11_Sub45_Sub5.aClass192ArrayArray8772[i_6_][i_9_]) != null)
							((IComponentDefinitions) (Class11_Sub45_Sub5.aClass192ArrayArray8772[i_6_][i_9_])).anInt2487 = i_10_;
					}
				}
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class5.aClass160_34) {
				Class307.method1881(Class11_Sub15.aClass83_5610, i + 113);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class2_Sub6.RUN_SCRIPT_IN_PACKET) {
				String string = Class3.packetStream.readString(-1);
				Object[] objects = new Object[1 + string.length()];
				for (int i_11_ = -1 + string.length(); i_11_ >= 0; i_11_--) {
					if (string.charAt(i_11_) == 's')
						objects[1 + i_11_] = Class3.packetStream.readString(-1);
					else
						objects[i_11_ + 1] = new Integer(
								Class3.packetStream.readInt(i + 232));
				}
				objects[0] = new Integer(Class3.packetStream.readInt(120));
				Class245.method1545(false);
				Class11_Sub48 class11_sub48 = new Class11_Sub48();
				((Class11_Sub48) class11_sub48).parameters = objects;
				Class86.method610(class11_sub48);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == IComponentDefinitions.aClass160_2621) {
				int i_12_ = Class3.packetStream.readIntV1(27326);
				int i_13_ = Class3.packetStream.readUnsignedShortLE128(125);
				Class245.method1545(false);
				Class46.method405(i_12_, 36864, i_13_);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class11_Sub30_Sub1.aClass160_8965) {
				int i_14_ = Class3.packetStream.readUnsignedShort((byte) -65);
				Player class376_sub7_sub5_sub5_sub1;
				if (Class11_Sub44.anInt7791 != i_14_)
					class376_sub7_sub5_sub5_sub1 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_14_]);
				else
					class376_sub7_sub5_sub5_sub1 = Class11_Sub2_Sub8.myPlayer;
				if (class376_sub7_sub5_sub5_sub1 == null) {
					Class236_Sub9.incomingPacket = null;
					return true;
				}
				int i_15_ = Class3.packetStream.readUnsignedShort((byte) -65);
				int i_16_ = Class3.packetStream.readUnsignedByte((byte) 35);
				boolean bool = (0x8000 & i_15_) != 0;
				if (((Player) class376_sub7_sub5_sub5_sub1).aString10400 != null
						&& (((Player) class376_sub7_sub5_sub5_sub1).aClass258_10418 != null)) {
					boolean bool_17_ = false;
					if ((i_16_ ^ 0xffffffff) >= -2) {
						if (!bool
								&& ((Class11_Sub2_Sub29.aBool9474 && !Class242.aBool3289) || Class100.aBool1328))
							bool_17_ = true;
						else if (Class11_Sub26
								.method2671(
										((Player) class376_sub7_sub5_sub5_sub1).aString10400,
										(byte) 85))
							bool_17_ = true;
					}
					if (!bool_17_ && Class11_Sub45_Sub15.anInt9364 == 0) {
						int i_18_ = -1;
						String string;
						if (!bool)
							string = (IComponentDefinitions.method1260(
									(Class11_Sub25.method2662(32767,
											Class3.packetStream)), 0));
						else {
							i_15_ &= 0x7fff;
							Class7 class7 = (Canvas_Sub1.method3608(
									Class3.packetStream, 97));
							i_18_ = ((Class7) class7).anInt43;
							string = (((Class7) class7).aClass11_Sub45_Sub13_46
									.method3630(Class3.packetStream, (byte) 78));
						}
						((Actor) class376_sub7_sub5_sub5_sub1).aString10298 = string
								.trim();
						((Actor) class376_sub7_sub5_sub5_sub1).anInt10279 = i_15_ >> 8;
						((Actor) class376_sub7_sub5_sub5_sub1).anInt10296 = i_15_ & 0xff;
						((Actor) class376_sub7_sub5_sub5_sub1).anInt10285 = 150;
						int i_19_;
						if ((i_16_ ^ 0xffffffff) == -2
								|| (i_16_ ^ 0xffffffff) == -3)
							i_19_ = !bool ? 1 : 17;
						else
							i_19_ = bool ? 17 : 2;
						if (i_16_ == 2)
							Class153.method958(
									string,
									i_19_,
									0,
									true,
									null,
									i_18_,
									"<img=1>"
											+ class376_sub7_sub5_sub5_sub1
													.method3981(-75, true),
									((Player) class376_sub7_sub5_sub5_sub1).aString10408,
									"<img=1>"
											+ class376_sub7_sub5_sub5_sub1
													.method3970(true, false));
						else if (i_16_ != 1)
							Class153.method958(
									string,
									i_19_,
									0,
									true,
									null,
									i_18_,
									class376_sub7_sub5_sub5_sub1.method3981(
											-66, true),
									(((Player) class376_sub7_sub5_sub5_sub1).aString10408),
									class376_sub7_sub5_sub5_sub1.method3970(
											true, false));
						else
							Class153.method958(
									string,
									i_19_,
									0,
									true,
									null,
									i_18_,
									"<img=0>"
											+ class376_sub7_sub5_sub5_sub1
													.method3981(-108, true),
									((Player) class376_sub7_sub5_sub5_sub1).aString10408,
									"<img=0>"
											+ class376_sub7_sub5_sub5_sub1
													.method3970(true, false));
					}
				}
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class59.aClass160_885) {
				int i_20_ = Class3.packetStream.readUnsignedShort((byte) -65);
				if ((i_20_ ^ 0xffffffff) == -65536)
					i_20_ = -1;
				int i_21_ = Class3.packetStream.readInt(127);
				Class245.method1545(false);
				Class11_Sub2_Sub24.method3623(i_20_, i_21_, (byte) -111);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class11_Sub2_Sub24.aClass160_9283 == Class236_Sub9.incomingPacket) {
				int i_22_ = Class3.packetStream.readIntLE((byte) 66);
				int i_23_ = Class3.packetStream.readUnsignedShortLE128(124);
				Class245.method1545(false);
				Class102.method679(i_22_, i_23_, false);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class198.aClass160_2683) {
				Class307.method1881(Class94_Sub3.aClass83_6907, -1);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class31.aClass160_411 == Class236_Sub9.incomingPacket) {
				String string = Class3.packetStream.readString(-1);
				int i_24_ = Class3.packetStream.readUnsignedShort128(true);
				Class245.method1545(false);
				Class147.method943(-124, string, i_24_);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class109.aClass160_1474) {
				Class222.anInt3048 = Class3.packetStream
						.readUnsignedByte128(7925);
				Class225_Sub1.anInt5009 = (Class3.packetStream
						.readByte(1854307120) << 3);
				Class122.anInt1659 = (Class3.packetStream
						.method2515((byte) -14) << 3);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class11_Sub2_Sub26.aClass160_9352 == Class236_Sub9.incomingPacket) {
				int i_25_ = Class3.packetStream.readIntV2((byte) -77);
				Class245.method1545(false);
				Class234_Sub2_Sub2.method3539(0, i_25_,
						Class11_Sub44.anInt7791, 5, 126);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class112.aClass160_1532) {
				((Stream) Class3.packetStream).position += 28;
				if (Class3.packetStream.method2491(-1487750560))
					Class11_Sub48.method3216(Class3.packetStream, 0, -28
							+ (((Stream) (Class3.packetStream)).position));
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class360.aClass160_4693 == Class236_Sub9.incomingPacket) {
				int i_26_ = Class3.packetStream.readUnsignedShortLE128(126);
				int i_27_ = Class3.packetStream.readUnsigned128Byte(true);
				Class245.method1545(false);
				if (i_27_ == 2)
					Class211.method1350((byte) 110);
				Class365.anInt4797 = i_26_;
				Class153.method959(i_26_, (byte) -123);
				Class321_Sub3_Sub1.method3614(false, i - 14429);
				Class86.parseIComponentScript(Class365.anInt4797);
				for (int i_28_ = 0; i_28_ < 100; i_28_++)
					Class11_Sub45.aBoolArray7907[i_28_] = true;
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class11_Sub45_Sub12.aClass160_9191) {
				boolean bool = ((Class3.packetStream
						.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2);
				String string = Class3.packetStream.readString(-1);
				String string_29_ = string;
				if (bool)
					string_29_ = Class3.packetStream.readString(-1);
				long l = Class3.packetStream.method2516(8919);
				long l_30_ = (long) Class3.packetStream
						.readUnsignedShort((byte) -65);
				long l_31_ = (long) Class3.packetStream.method2558(false);
				int i_32_ = Class3.packetStream.readUnsignedByte((byte) 35);
				long l_33_ = l_31_ + (l_30_ << 32);
				boolean bool_34_ = false;
				while_50_: do {
					for (int i_35_ = 0; i_35_ < 100; i_35_++) {
						if ((Class15.aLongArray136[i_35_] ^ 0xffffffffffffffffL) == (l_33_ ^ 0xffffffffffffffffL)) {
							bool_34_ = true;
							break while_50_;
						}
					}
					if (i_32_ <= 1) {
						if (Class11_Sub2_Sub29.aBool9474 && !Class242.aBool3289
								|| Class100.aBool1328)
							bool_34_ = true;
						else if (Class11_Sub26.method2671(string_29_,
								(byte) -82))
							bool_34_ = true;
					}
				} while (false);
				if (!bool_34_
						&& (Class11_Sub45_Sub15.anInt9364 ^ 0xffffffff) == -1) {
					Class15.aLongArray136[Class11_Sub2_Sub39.anInt9815] = l_33_;
					Class11_Sub2_Sub39.anInt9815 = (Class11_Sub2_Sub39.anInt9815 + 1) % 100;
					String string_36_ = IComponentDefinitions.method1260(
							(Class11_Sub25.method2662(32767,
									(Class3.packetStream))), 0);
					if (i_32_ != 2 && i_32_ != 3) {
						if ((i_32_ ^ 0xffffffff) == -2)
							Class153.method958(string_36_, 9, 0, true,
									Class42.method385(i ^ ~0x3f, l), -1,
									"<img=0>" + string, string, "<img=0>"
											+ string_29_);
						else
							Class153.method958(string_36_, 9, 0, true,
									Class42.method385(72, l), -1, string,
									string, string_29_);
					} else
						Class153.method958(string_36_, 9, 0, true,
								Class42.method385(45, l), -1, "<img=1>"
										+ string, string, "<img=1>"
										+ string_29_);
				}
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class108_Sub2.aClass160_5076) {
				int i_37_ = Class3.packetStream.readUnsignedShort((byte) -65);
				if (i_37_ == 65535)
					i_37_ = -1;
				int i_38_ = Class3.packetStream.readIntV1(27326);
				Class245.method1545(false);
				Class234_Sub2_Sub2.method3539(-1, i_38_, i_37_, 2, 124);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class376_Sub5.ITEM_CONTAINER_UPDATE_IN_PACKET == Class236_Sub9.incomingPacket) {
				int key = Class3.packetStream.readUnsignedShort((byte) -65);
				int hash = Class3.packetStream.readUnsignedByte((byte) 35);
				boolean keyLessIntegerSize = (hash & 0x1 ^ 0xffffffff) == -2;
				Class211.method1356(key, keyLessIntegerSize, true);
				int i_41_ = Class3.packetStream.readUnsignedShort((byte) -65);
				for (int i_42_ = 0; i_41_ > i_42_; i_42_++) {
					int i_43_ = Class3.packetStream.readUnsignedShortLE(25651);
					int i_44_ = Class3.packetStream.readUnsignedByte((byte) 35);
					if (i_44_ == 255)
						i_44_ = Class3.packetStream.readIntV1(27326);
					Class221.method1411(keyLessIntegerSize, key, (byte) 124,
							i_44_, i_42_, -1 + i_43_);
				}
				Class310.anIntArray4147[Class77.method529(31,
						Class77.anInt1045++)] = key;
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class127.aClass160_1719) {
				Class170.aString2181 = ((Class37.anInt486 ^ 0xffffffff) < -3 ? Class3.packetStream
						.readString(-1) : (Class26.aClass26_302.method217(
						(byte) 86, Class11_Sub45_Sub1_Sub2.anInt9884)));
				Class240.anInt3263 = (Class37.anInt486 > 0 ? Class3.packetStream
						.readUnsignedShort((byte) -65) : -1);
				Class236_Sub9.incomingPacket = null;
				if (Class240.anInt3263 == 65535)
					Class240.anInt3263 = -1;
				return true;
			}
			if (Class11_Sub2_Sub28.aClass160_9422 == Class236_Sub9.incomingPacket) {
				int i_45_ = Class3.packetStream.readIntLE((byte) 63);
				Class245.method1545(false);
				Class234_Sub2_Sub2.method3539(-1, i_45_, -1, 3, 126);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class11_Sub2_Sub31.LOGOUT_IN_PACKET == Class236_Sub9.incomingPacket) {
				InputStream_Sub2.method2814(Class11_Sub2_Sub17.aBool9046,
						-25626);
				Class236_Sub9.incomingPacket = null;
				return false;
			}
			if (Class236_Sub9.incomingPacket == Class312.aClass160_4150) {
				Class307.method1881(Class11_Sub2_Sub5.aClass83_8560, i ^ 0x71);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class279.aClass160_3768) {
				Class315.anInt4170 = Class219_Sub1.anInt7238;
				Class236_Sub9.incomingPacket = null;
				Class12_Sub1.anInt5159 = 1;
				return true;
			}
			if (Class290.aClass160_3919 == Class236_Sub9.incomingPacket) {
				int i_46_ = Class3.packetStream.readUnsignedShort((byte) -65);
				if (i_46_ == 65535)
					i_46_ = -1;
				int i_47_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_48_ = Class3.packetStream.readUnsignedShort((byte) -65);
				int i_49_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_50_ = Class3.packetStream.readUnsignedShort((byte) -65);
				Class254.method1630(i_46_, false, i_47_, i_50_, 9400, i_49_,
						i_48_);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class6.aClass160_36) {
				Class218.sendDynamicMapRegion(26);
				Class236_Sub9.incomingPacket = null;
				return false;
			}
			if (Class321_Sub2.aClass160_6635 == Class236_Sub9.incomingPacket) {
				Class307.method1881(Class376_Sub1.aClass83_5101, -1);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class123.aClass160_1667) {
				Class231.anInt3168 = Class3.packetStream
						.readUnsignedByte((byte) 35);
				for (int i_51_ = 0; (Class231.anInt3168 ^ 0xffffffff) < (i_51_ ^ 0xffffffff); i_51_++) {
					Class11_Sub2_Sub16.aStringArray9034[i_51_] = Class3.packetStream
							.readString(-1);
					Class335_Sub3_Sub1.aStringArray9416[i_51_] = Class3.packetStream
							.readString(-1);
					if (Class335_Sub3_Sub1.aStringArray9416[i_51_].equals(""))
						Class335_Sub3_Sub1.aStringArray9416[i_51_] = Class11_Sub2_Sub16.aStringArray9034[i_51_];
					Class345.aStringArray4584[i_51_] = Class3.packetStream
							.readString(-1);
					Class11_Sub2_Sub21.aStringArray9195[i_51_] = Class3.packetStream
							.readString(i + 113);
					if (Class11_Sub2_Sub21.aStringArray9195[i_51_].equals(""))
						Class11_Sub2_Sub21.aStringArray9195[i_51_] = Class345.aStringArray4584[i_51_];
					Class313.aBoolArray4159[i_51_] = false;
				}
				Class236_Sub9.incomingPacket = null;
				Class315.anInt4170 = Class219_Sub1.anInt7238;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class11_Sub2_Sub8.aClass160_8747) {
				int i_52_ = Class3.packetStream
						.readUnsignedShortLE(i ^ ~0x6442);
				if ((i_52_ ^ 0xffffffff) == -65536)
					i_52_ = -1;
				int i_53_ = Class3.packetStream.readIntV2((byte) 94);
				Class245.method1545(false);
				Class234_Sub2_Sub2.method3539(-1, i_53_, i_52_, 1, 105);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class91_Sub3.aClass160_8425) {
				int i_54_ = Class3.packetStream.readUnsignedShort128(true);
				int i_55_ = Class3.packetStream.readUnsignedShortLE(i + 25765);
				int i_56_ = Class3.packetStream.readIntV1(27326);
				Class245.method1545(false);
				Class11_Sub45_Sub2.method3354((i_54_ << 16) - -i_55_, 11931,
						i_56_);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class108.aClass160_1460 == Class236_Sub9.incomingPacket) {
				int i_57_ = Class3.packetStream.readUnsignedShortLE(i + 25765);
				Class245.method1545(false);
				Class154.method966((byte) 50, i_57_);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class235.SEND_VAR_BIT_BIG == Class236_Sub9.incomingPacket) {
				int i_58_ = Class3.packetStream.readIntLE((byte) 66);
				int i_59_ = Class3.packetStream.readUnsignedShortLE128(124);
				Class11_Sub26.aClass97_6296.method655((byte) -71, i_58_, i_59_);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class356.aClass160_4663 == Class236_Sub9.incomingPacket) {
				int i_60_ = Class3.packetStream.readIntV2((byte) 49);
				int i_61_ = 0x3 & i_60_ >> 28;
				int i_62_ = (i_60_ & 0xffff9ec) >> 14;
				int i_63_ = i_60_ & 0x3fff;
				int i_64_ = Class3.packetStream.readUnsignedByte128(i + 8039);
				int i_65_ = i_64_ >> 2;
				int i_66_ = i_64_ & 0x3;
				int i_67_ = Class361.anIntArray4698[i_65_];
				int i_68_ = Class3.packetStream.readUnsignedShort128(true);
				i_62_ -= Class194.anInt2641;
				if (i_68_ == 65535)
					i_68_ = -1;
				i_63_ -= Class118.anInt1605;
				Class11_Sub35.method2847(i_67_, i_63_, false, i_65_, i_66_,
						i_61_, i_62_, i_68_);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class94_Sub3.aClass160_6906) {
				int i_69_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_70_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_71_ = Class3.packetStream.readUnsignedShort128(true) << 2;
				int i_72_ = Class3.packetStream.readUnsignedByte128(7925);
				int i_73_ = Class3.packetStream.readUnsignedByte((byte) 35);
				Class245.method1545(false);
				Class316.method1918(i_72_, i_69_, i_71_, i_73_, i_70_,
						(byte) 66);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class108_Sub13.aClass160_6259) {
				Class134.anInt1856 = Class3.packetStream
						.readUnsignedByteC(-6067);
				Class81.anInt1090 = Class3.packetStream
						.readUnsignedByte128(7925);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Applet_Sub1.aClass160_10466) {
				int i_74_ = Class3.packetStream.readUnsignedShort((byte) -65);
				String string = Class3.packetStream.readString(-1);
				Class245.method1545(false);
				Class147.method943(-127, string, i_74_);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class118.PLAYER_UPDATE_IN_PACKET) {
				Class11_Sub46_Sub3.decodePlayerUpdate(Class37.anInt486, 114,
						Class3.packetStream);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class11_Sub2_Sub28.aClass160_9434 == Class236_Sub9.incomingPacket) {
				String string = Class3.packetStream.readString(-1);
				String string_75_ = IComponentDefinitions.method1260(
						(Class11_Sub25.method2662(i + 32881,
								Class3.packetStream)), 0);
				Class300.method1852(-75, string_75_, string, 0, string, string,
						6);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class55.aClass160_832 == Class236_Sub9.incomingPacket) {
				int i_76_ = Class3.packetStream.readIntLE((byte) 39);
				int i_77_ = Class3.packetStream.readUnsignedShortLE128(124);
				int i_78_ = Class3.packetStream.readInt(114);
				Class245.method1545(false);
				Class234_Sub2_Sub2.method3539(i_78_, i_76_, i_77_, 5, 111);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class11_Sub45_Sub9.SEND_VAR_BIT_SMALL) {
				int i_79_ = Class3.packetStream.readUnsignedShort128(true);
				int i_80_ = Class3.packetStream
						.readUnsignedByte128(i ^ ~0x1e84);
				Class11_Sub26.aClass97_6296.method655((byte) 74, i_80_, i_79_);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class11_Sub4.aClass160_5232 == Class236_Sub9.incomingPacket) {
				String string = Class3.packetStream.readString(-1);
				int i_81_ = Class3.packetStream.readUnsignedShort((byte) -65);
				if ((i_81_ ^ 0xffffffff) == -65536)
					i_81_ = -1;
				int i_82_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_83_ = Class3.packetStream.readUnsignedByte128(7925);
				if ((i_83_ ^ 0xffffffff) <= -2 && i_83_ <= 8) {
					if (string.equalsIgnoreCase("null"))
						string = null;
					Class11_Sub16.aStringArray5675[-1 + i_83_] = string;
					Class2_Sub5.anIntArray5509[-1 + i_83_] = i_81_;
					Class290.aBoolArray3911[-1 + i_83_] = i_82_ == 0;
				}
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class11_Sub2_Sub31.aClass160_9643 == Class236_Sub9.incomingPacket) {
				int i_84_ = Class3.packetStream.readUnsignedShort128(true);
				int i_85_ = Class3.packetStream
						.readUnsignedShortLE128(i ^ ~0xc);
				int i_86_ = Class3.packetStream.readUnsignedShort128(true);
				int i_87_ = Class3.packetStream.readIntLE((byte) 81);
				int i_88_ = Class3.packetStream.readUnsignedByte((byte) 35);
				boolean bool = (0x80 & i_88_ ^ 0xffffffff) != -1;
				int i_89_ = i_88_ & 0x7;
				int i_90_ = (0x7d & i_88_) >> 3;
				if (i_90_ == 15)
					i_90_ = -1;
				if (i_87_ >> 30 == 0) {
					if ((i_87_ >> 29 ^ 0xffffffff) != -1) {
						int i_91_ = 0xffff & i_87_;
						Class11_Sub25 class11_sub25 = ((Class11_Sub25) Class11_Sub2_Sub25.aClass213_9322
								.method1369((byte) 26, (long) i_91_));
						if (class11_sub25 != null) {
							Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) class11_sub25).aNpc_2373);
							if (i_85_ == 65535)
								i_85_ = -1;
							boolean bool_92_ = true;
							int i_93_ = (!bool ? ((Actor) class376_sub7_sub5_sub5_sub2).anInt10289
									: (((Actor) class376_sub7_sub5_sub5_sub2).anInt10338));
							if (i_85_ != -1 && i_93_ != -1) {
								if ((i_85_ ^ 0xffffffff) == (i_93_ ^ 0xffffffff)) {
									Class224 class224 = Class254.aClass227_3495
											.method1465(i_85_, (byte) 106);
									if (((Class224) class224).aBool3073
											&& (((Class224) class224).anInt3079 != -1)) {
										Class281 class281 = (Class108_Sub23.aClass198_7760
												.method1284(
														(((Class224) class224).anInt3079),
														(byte) 91));
										int i_94_ = ((Class281) class281).anInt3816;
										if (i_94_ != 0 && i_94_ != 2) {
											if (i_94_ == 1)
												bool_92_ = true;
										} else
											bool_92_ = false;
									}
								} else {
									Class224 class224 = Class254.aClass227_3495
											.method1465(i_85_, (byte) 96);
									Class224 class224_95_ = Class254.aClass227_3495
											.method1465(i_93_, (byte) -98);
									if ((((Class224) class224).anInt3079 ^ 0xffffffff) != 0
											&& (((Class224) class224_95_).anInt3079 ^ 0xffffffff) != 0) {
										Class281 class281 = (Class108_Sub23.aClass198_7760
												.method1284(
														(((Class224) class224).anInt3079),
														(byte) 101));
										Class281 class281_96_ = (Class108_Sub23.aClass198_7760
												.method1284(
														(((Class224) class224_95_).anInt3079),
														(byte) -36));
										if (((Class281) class281).anInt3792 < (((Class281) class281_96_).anInt3792))
											bool_92_ = false;
									}
								}
							}
							if (bool_92_) {
								if (bool) {
									((Actor) class376_sub7_sub5_sub5_sub2).anInt10338 = i_85_;
									((Actor) class376_sub7_sub5_sub5_sub2).anInt10316 = i_90_;
									((Actor) class376_sub7_sub5_sub5_sub2).anInt10314 = 0;
									((Actor) class376_sub7_sub5_sub5_sub2).anInt10313 = 1;
									((Actor) class376_sub7_sub5_sub5_sub2).anInt10273 = 0;
									((Actor) class376_sub7_sub5_sub5_sub2).anInt10280 = i_84_
											+ Class11_Sub25.anInt6279;
									((Actor) class376_sub7_sub5_sub5_sub2).anInt10334 = i_89_;
									((Actor) class376_sub7_sub5_sub5_sub2).anInt10347 = i_86_;
									if ((((Actor) class376_sub7_sub5_sub5_sub2).anInt10280) > Class11_Sub25.anInt6279)
										((Actor) class376_sub7_sub5_sub5_sub2).anInt10314 = -1;
									if ((((Actor) class376_sub7_sub5_sub5_sub2).anInt10338) != -1
											&& (Class11_Sub25.anInt6279 == (((Actor) class376_sub7_sub5_sub5_sub2).anInt10280))) {
										int i_97_ = ((Class224) (Class254.aClass227_3495
												.method1465(
														(((Actor) class376_sub7_sub5_sub5_sub2).anInt10338),
														(byte) 126))).anInt3079;
										if (i_97_ != -1) {
											Class281 class281 = (Class108_Sub23.aClass198_7760
													.method1284(i_97_,
															(byte) -68));
											if (class281 != null
													&& (((Class281) class281).anIntArray3794) != null
													&& !(((Actor) class376_sub7_sub5_sub5_sub2).aBool10331))
												Class268.method1690(
														-701644944,
														0,
														class376_sub7_sub5_sub5_sub2,
														class281);
										}
									}
								} else {
									((Actor) class376_sub7_sub5_sub5_sub2).anInt10337 = i_90_;
									((Actor) class376_sub7_sub5_sub5_sub2).anInt10299 = i_86_;
									((Actor) class376_sub7_sub5_sub5_sub2).anInt10301 = Class11_Sub25.anInt6279
											- -i_84_;
									((Actor) class376_sub7_sub5_sub5_sub2).anInt10297 = i_89_;
									((Actor) class376_sub7_sub5_sub5_sub2).anInt10281 = 1;
									((Actor) class376_sub7_sub5_sub5_sub2).anInt10289 = i_85_;
									((Actor) class376_sub7_sub5_sub5_sub2).anInt10284 = 0;
									((Actor) class376_sub7_sub5_sub5_sub2).anInt10327 = 0;
									if ((((Actor) class376_sub7_sub5_sub5_sub2).anInt10301) > Class11_Sub25.anInt6279)
										((Actor) class376_sub7_sub5_sub5_sub2).anInt10327 = -1;
									if (((((Actor) class376_sub7_sub5_sub5_sub2).anInt10289) ^ 0xffffffff) != 0
											&& (Class11_Sub25.anInt6279 == (((Actor) class376_sub7_sub5_sub5_sub2).anInt10301))) {
										int i_98_ = ((Class224) (Class254.aClass227_3495
												.method1465(
														(((Actor) class376_sub7_sub5_sub5_sub2).anInt10289),
														(byte) -110))).anInt3079;
										if ((i_98_ ^ 0xffffffff) != 0) {
											Class281 class281 = (Class108_Sub23.aClass198_7760
													.method1284(i_98_,
															(byte) -63));
											if (class281 != null
													&& (((Class281) class281).anIntArray3794) != null
													&& !(((Actor) class376_sub7_sub5_sub5_sub2).aBool10331))
												Class268.method1690(
														i ^ 0x29d240fe,
														0,
														class376_sub7_sub5_sub5_sub2,
														class281);
										}
									}
								}
							}
						}
					} else if (i_87_ >> 28 != 0) {
						int i_99_ = 0xffff & i_87_;
						Player class376_sub7_sub5_sub5_sub1;
						if ((i_99_ ^ 0xffffffff) != (Class11_Sub44.anInt7791 ^ 0xffffffff))
							class376_sub7_sub5_sub5_sub1 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_99_]);
						else
							class376_sub7_sub5_sub5_sub1 = (Class11_Sub2_Sub8.myPlayer);
						if (class376_sub7_sub5_sub5_sub1 != null) {
							if ((i_85_ ^ 0xffffffff) == -65536)
								i_85_ = -1;
							boolean bool_100_ = true;
							int i_101_ = (!bool ? ((Actor) class376_sub7_sub5_sub5_sub1).anInt10289
									: (((Actor) class376_sub7_sub5_sub5_sub1).anInt10338));
							if ((i_85_ ^ 0xffffffff) != 0 && i_101_ != -1) {
								if ((i_101_ ^ 0xffffffff) != (i_85_ ^ 0xffffffff)) {
									Class224 class224 = Class254.aClass227_3495
											.method1465(i_85_, (byte) -101);
									Class224 class224_102_ = Class254.aClass227_3495
											.method1465(i_101_, (byte) 108);
									if (((Class224) class224).anInt3079 != -1
											&& ((((Class224) class224_102_).anInt3079) ^ 0xffffffff) != 0) {
										Class281 class281 = (Class108_Sub23.aClass198_7760
												.method1284(
														(((Class224) class224).anInt3079),
														(byte) 100));
										Class281 class281_103_ = (Class108_Sub23.aClass198_7760
												.method1284(
														(((Class224) class224_102_).anInt3079),
														(byte) 119));
										if ((((Class281) class281_103_).anInt3792) > ((Class281) class281).anInt3792)
											bool_100_ = false;
									}
								} else {
									Class224 class224 = Class254.aClass227_3495
											.method1465(i_85_, (byte) -90);
									if (((Class224) class224).aBool3073
											&& (((Class224) class224).anInt3079 ^ 0xffffffff) != 0) {
										Class281 class281 = (Class108_Sub23.aClass198_7760
												.method1284(
														(((Class224) class224).anInt3079),
														(byte) -120));
										int i_104_ = ((Class281) class281).anInt3816;
										if ((i_104_ ^ 0xffffffff) != -1
												&& i_104_ != 2) {
											if (i_104_ == 1)
												bool_100_ = true;
										} else
											bool_100_ = false;
									}
								}
							}
							if (bool_100_) {
								if (bool) {
									((Actor) class376_sub7_sub5_sub5_sub1).anInt10316 = i_90_;
									((Actor) class376_sub7_sub5_sub5_sub1).anInt10334 = i_89_;
									((Actor) class376_sub7_sub5_sub5_sub1).anInt10280 = i_84_
											+ Class11_Sub25.anInt6279;
									((Actor) class376_sub7_sub5_sub5_sub1).anInt10338 = i_85_;
									((Actor) class376_sub7_sub5_sub5_sub1).anInt10313 = 1;
									((Actor) class376_sub7_sub5_sub5_sub1).anInt10273 = 0;
									((Actor) class376_sub7_sub5_sub5_sub1).anInt10314 = 0;
									((Actor) class376_sub7_sub5_sub5_sub1).anInt10347 = i_86_;
									if (Class11_Sub25.anInt6279 < (((Actor) class376_sub7_sub5_sub5_sub1).anInt10280))
										((Actor) class376_sub7_sub5_sub5_sub1).anInt10314 = -1;
									if (((((Actor) class376_sub7_sub5_sub5_sub1).anInt10338) ^ 0xffffffff) == -65536)
										((Actor) class376_sub7_sub5_sub5_sub1).anInt10338 = -1;
									if ((((Actor) class376_sub7_sub5_sub5_sub1).anInt10338) != -1
											&& ((((Actor) class376_sub7_sub5_sub5_sub1).anInt10280) == Class11_Sub25.anInt6279)) {
										int i_105_ = ((Class224) (Class254.aClass227_3495
												.method1465(
														(((Actor) class376_sub7_sub5_sub5_sub1).anInt10338),
														(byte) 61))).anInt3079;
										if (i_105_ != -1) {
											Class281 class281 = (Class108_Sub23.aClass198_7760
													.method1284(i_105_,
															(byte) 119));
											if (class281 != null
													&& (((Class281) class281).anIntArray3794) != null
													&& !(((Actor) class376_sub7_sub5_sub5_sub1).aBool10331))
												Class268.method1690(
														-701644944,
														0,
														class376_sub7_sub5_sub5_sub1,
														class281);
										}
									}
								} else {
									((Actor) class376_sub7_sub5_sub5_sub1).anInt10297 = i_89_;
									((Actor) class376_sub7_sub5_sub5_sub1).anInt10289 = i_85_;
									((Actor) class376_sub7_sub5_sub5_sub1).anInt10301 = i_84_
											+ Class11_Sub25.anInt6279;
									((Actor) class376_sub7_sub5_sub5_sub1).anInt10281 = 1;
									((Actor) class376_sub7_sub5_sub5_sub1).anInt10327 = 0;
									((Actor) class376_sub7_sub5_sub5_sub1).anInt10299 = i_86_;
									((Actor) class376_sub7_sub5_sub5_sub1).anInt10284 = 0;
									((Actor) class376_sub7_sub5_sub5_sub1).anInt10337 = i_90_;
									if ((Class11_Sub25.anInt6279 ^ 0xffffffff) > ((((Actor) class376_sub7_sub5_sub5_sub1).anInt10301) ^ 0xffffffff))
										((Actor) class376_sub7_sub5_sub5_sub1).anInt10327 = -1;
									if (((((Actor) class376_sub7_sub5_sub5_sub1).anInt10289) ^ 0xffffffff) == -65536)
										((Actor) class376_sub7_sub5_sub5_sub1).anInt10289 = -1;
									if ((((Actor) class376_sub7_sub5_sub5_sub1).anInt10289) != -1
											&& (Class11_Sub25.anInt6279 == (((Actor) class376_sub7_sub5_sub5_sub1).anInt10301))) {
										int i_106_ = ((Class224) (Class254.aClass227_3495
												.method1465(
														(((Actor) class376_sub7_sub5_sub5_sub1).anInt10289),
														(byte) 127))).anInt3079;
										if (i_106_ != -1) {
											Class281 class281 = (Class108_Sub23.aClass198_7760
													.method1284(i_106_,
															(byte) 101));
											if (class281 != null
													&& (((Class281) class281).anIntArray3794) != null
													&& !(((Actor) class376_sub7_sub5_sub5_sub1).aBool10331))
												Class268.method1690(
														-701644944,
														0,
														class376_sub7_sub5_sub5_sub1,
														class281);
										}
									}
								}
							}
						}
					}
				} else {
					int i_107_ = (i_87_ & 0x374bd4e7) >> 28;
					int i_108_ = -Class194.anInt2641 + (0x3fff & i_87_ >> 14);
					int i_109_ = -Class118.anInt1605 + (0x3fff & i_87_);
					if ((i_108_ ^ 0xffffffff) <= -1
							&& (i_109_ ^ 0xffffffff) <= -1
							&& (Class300.anInt4051 ^ 0xffffffff) < (i_108_ ^ 0xffffffff)
							&& (i_109_ ^ 0xffffffff) > (Class108_Sub12.anInt6228 ^ 0xffffffff)) {
						int i_110_ = 256 + 512 * i_108_;
						int i_111_ = 256 + 512 * i_109_;
						int i_112_ = i_107_;
						if ((i_112_ ^ 0xffffffff) > -4
								&& Class321_Sub3_Sub1.method3613((byte) -101,
										i_108_, i_109_))
							i_112_++;
						Class376_Sub7_Sub5_Sub3 class376_sub7_sub5_sub3 = (new Class376_Sub7_Sub5_Sub3(
								i_85_, i_84_, Class11_Sub25.anInt6279, i_107_,
								i_112_, i_110_, -i_86_
										+ Class318.method1931(92, i_111_,
												i_107_, i_110_), i_111_,
								i_108_, i_108_, i_109_, i_109_, i_89_));
						Class376.aClass84_4911
								.method589((byte) -13, new Class11_Sub45_Sub10(
										class376_sub7_sub5_sub3));
					}
				}
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class236_Sub8.SEND_MINIMAP_FLAG_IN_PACKET) {
				int i_113_ = Class3.packetStream.readUnsignedByte128(i + 8039);
				int i_114_ = Class3.packetStream.readUnsignedByte128(7925);
				if ((i_113_ ^ 0xffffffff) == -256) {
					i_113_ = -1;
					i_114_ = -1;
				}
				Class272.method1698(i_113_, i_114_, 126);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class71.aClass160_991) {
				boolean bool = Class3.packetStream.readUnsignedByte((byte) 35) == 1;
				byte[] is = new byte[-1 + Class37.anInt486];
				Class3.packetStream.readBytes(is, 4, -1 + Class37.anInt486, 0);
				Class15.method148(-51, bool, is);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class108_Sub21.aClass160_7305 == Class236_Sub9.incomingPacket) {
				byte i_115_ = Class3.packetStream.readByte(1854307120);
				int i_116_ = Class3.packetStream.readUnsignedShortLE(25651);
				Class245.method1545(false);
				Class255.method1632(i_115_, false, i_116_);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class376_Sub1.aClass160_5093 == Class236_Sub9.incomingPacket) {
				Class245.method1545(false);
				Class359.method2134((byte) -128);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class85.aClass160_1163) {
				Class225_Sub1.anInt5009 = (Class3.packetStream
						.readByte(1854307120) << 3);
				Class222.anInt3048 = Class3.packetStream
						.readUnsignedByte((byte) 35);
				Class122.anInt1659 = Class3.packetStream.readByte(i
						^ ~0x6e867b41) << 3;
				for (Class11_Sub27 class11_sub27 = ((Class11_Sub27) Class106.aClass213_1433
						.method1365(i + 24604)); class11_sub27 != null; class11_sub27 = ((Class11_Sub27) Class106.aClass213_1433
						.method1367((byte) 71))) {
					int i_117_ = (int) (((Class11) class11_sub27).aLong91 >> 28 & 0x3L);
					int i_118_ = (int) (((Class11) class11_sub27).aLong91 & 0x3fffL);
					int i_119_ = -Class194.anInt2641 + i_118_;
					int i_120_ = (int) (0x3fffL & ((Class11) class11_sub27).aLong91 >> 14);
					int i_121_ = -Class118.anInt1605 + i_120_;
					if ((Class222.anInt3048 ^ 0xffffffff) == (i_117_ ^ 0xffffffff)
							&& (i_119_ ^ 0xffffffff) <= (Class122.anInt1659 ^ 0xffffffff)
							&& Class122.anInt1659 + 8 > i_119_
							&& Class225_Sub1.anInt5009 <= i_121_
							&& (i_121_ ^ 0xffffffff) > (8 + Class225_Sub1.anInt5009 ^ 0xffffffff)) {
						class11_sub27.method122(-97);
						if (i_119_ >= 0
								&& (i_121_ ^ 0xffffffff) <= -1
								&& Class300.anInt4051 > i_119_
								&& ((i_121_ ^ 0xffffffff) > (Class108_Sub12.anInt6228 ^ 0xffffffff)))
							Class295.method1830(i_121_, i_119_, -10615,
									Class222.anInt3048);
					}
				}
				for (Class11_Sub15 class11_sub15 = ((Class11_Sub15) Class198.aClass84_2686
						.method584(-12261)); class11_sub15 != null; class11_sub15 = ((Class11_Sub15) Class198.aClass84_2686
						.method578(i - 15247))) {
					if (((Class122.anInt1659 ^ 0xffffffff) >= (((Class11_Sub15) class11_sub15).anInt5596 ^ 0xffffffff))
							&& (((Class11_Sub15) class11_sub15).anInt5596 < Class122.anInt1659 + 8)
							&& (Class225_Sub1.anInt5009 <= ((Class11_Sub15) class11_sub15).anInt5595)
							&& ((Class225_Sub1.anInt5009 + 8 ^ 0xffffffff) < (((Class11_Sub15) class11_sub15).anInt5595 ^ 0xffffffff))
							&& (((Class11_Sub15) class11_sub15).anInt5609 ^ 0xffffffff) == (Class222.anInt3048 ^ 0xffffffff))
						((Class11_Sub15) class11_sub15).anInt5600 = 0;
				}
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class11_Sub15.aClass160_5599) {
				Class307.method1881(Class376_Sub7_Sub4_Sub1.aClass83_9942,
						i ^ 0x71);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Applet_Sub1.aClass160_10462) {
				Class195_Sub1.decodeReceivedMapRegions(28123);
				Class236_Sub9.incomingPacket = null;
				return false;
			}
			if (Class236_Sub9.incomingPacket == Class57_Sub1.aClass160_5882) {
				int i_122_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_123_ = i_122_ >> 5;
				int i_124_ = i_122_ & 0x1f;
				if ((i_124_ ^ 0xffffffff) == -1) {
					IncomingPacket.aClass275Array2082[i_123_] = null;
					Class236_Sub9.incomingPacket = null;
					return true;
				}
				Class275 class275 = new Class275();
				((Class275) class275).anInt3697 = i_124_;
				((Class275) class275).anInt3695 = Class3.packetStream
						.readUnsignedByte((byte) 35);
				if (((Class275) class275).anInt3695 >= 0
						&& ((((Class275) class275).anInt3695 ^ 0xffffffff) > (Class268.aClass253Array3635.length ^ 0xffffffff))) {
					if ((((Class275) class275).anInt3697 ^ 0xffffffff) == -2
							|| ((Class275) class275).anInt3697 == 10) {
						((Class275) class275).anInt3707 = Class3.packetStream
								.readUnsignedShort((byte) -65);
						((Stream) Class3.packetStream).position += 6;
					} else if (((Class275) class275).anInt3697 >= 2
							&& ((Class275) class275).anInt3697 <= 6) {
						if (((Class275) class275).anInt3697 == 2) {
							((Class275) class275).anInt3699 = 256;
							((Class275) class275).anInt3704 = 256;
						}
						if (((Class275) class275).anInt3697 == 3) {
							((Class275) class275).anInt3699 = 256;
							((Class275) class275).anInt3704 = 0;
						}
						if ((((Class275) class275).anInt3697 ^ 0xffffffff) == -5) {
							((Class275) class275).anInt3704 = 512;
							((Class275) class275).anInt3699 = 256;
						}
						if (((Class275) class275).anInt3697 == 5) {
							((Class275) class275).anInt3704 = 256;
							((Class275) class275).anInt3699 = 0;
						}
						if (((Class275) class275).anInt3697 == 6) {
							((Class275) class275).anInt3699 = 512;
							((Class275) class275).anInt3704 = 256;
						}
						((Class275) class275).anInt3697 = 2;
						((Class275) class275).anInt3700 = Class3.packetStream
								.readUnsignedByte((byte) 35);
						((Class275) class275).anInt3704 += (Class3.packetStream
								.readUnsignedShort((byte) -65) - Class194.anInt2641) << 9;
						((Class275) class275).anInt3699 += (Class3.packetStream
								.readUnsignedShort((byte) -65) + -Class118.anInt1605) << 9;
						((Class275) class275).anInt3701 = Class3.packetStream
								.readUnsignedByte((byte) 35) << 2;
						((Class275) class275).anInt3708 = Class3.packetStream
								.readUnsignedShort((byte) -65);
					}
					((Class275) class275).anInt3698 = Class3.packetStream
							.readUnsignedShort((byte) -65);
					if (((Class275) class275).anInt3698 == 65535)
						((Class275) class275).anInt3698 = -1;
					IncomingPacket.aClass275Array2082[i_123_] = class275;
				}
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class11_Sub6_Sub5.aClass160_9604 == Class236_Sub9.incomingPacket) {
				int i_125_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_126_ = Class3.packetStream.readUnsignedByteC(-6067);
				int i_127_ = Class3.packetStream.readUnsigned128Byte(true);
				int i_128_ = Class3.packetStream.readUnsignedByteC(-6067);
				int i_129_ = (Class3.packetStream.readUnsignedShort((byte) -65) << 2);
				Class245.method1545(false);
				Class108_Sub6.method2433(i_125_, (byte) -59, i_127_, true,
						i_126_, i_128_, i_129_);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class123.aClass160_1664) {
				int i_130_ = Class3.packetStream.readInt(i + 218);
				int i_131_ = Class3.packetStream.readUnsignedShortLE(25651);
				Class245.method1545(false);
				Class97.method652(i_130_, i_131_, i ^ ~0xb);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class364.aClass160_4775 == Class236_Sub9.incomingPacket) {
				int icomponentHash = Class3.packetStream.readIntV2((byte) -108);
				int settingsHash = Class3.packetStream.readUnsignedShortLE128(126);
				int i_134_ = Class3.packetStream.readUnsignedShortLE128(126);
				if ((i_134_ ^ 0xffffffff) == -65536)
					i_134_ = -1;
				int toSlot = Class3.packetStream.readUnsignedShortLE(25651);
				if ((toSlot ^ 0xffffffff) == -65536)
					toSlot = -1;
				Class245.method1545(false);
				for (int slot = i_134_; (slot ^ 0xffffffff) >= (toSlot ^ 0xffffffff); slot++) {
					long l = ((long) icomponentHash << 32) - -(long) slot;
					InterfaceSettings class11_sub9 = ((InterfaceSettings) Class376_Sub7_Sub2_Sub1.aClass213_10180
							.method1369((byte) 26, l));
					InterfaceSettings class11_sub9_137_;
					if (class11_sub9 != null) {
						class11_sub9_137_ = new InterfaceSettings(
								(((InterfaceSettings) class11_sub9).anInt5349),
								settingsHash);
						class11_sub9.method122(-101);
					} else if ((slot ^ 0xffffffff) != 0)
						class11_sub9_137_ = new InterfaceSettings(0, settingsHash);
					else
						class11_sub9_137_ = (new InterfaceSettings(
								((InterfaceSettings) (((IComponentDefinitions) Class11_Sub2_Sub13
										.method3533((byte) -97, icomponentHash)).aClass11_Sub9_2586)).anInt5349,
								settingsHash));
					Class376_Sub7_Sub2_Sub1.aClass213_10180.method1368(l,
							class11_sub9_137_, (byte) -26);
				}
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (i != -114)
				aClass213_2098 = null;
			if (Class121.aClass160_1642 == Class236_Sub9.incomingPacket) {
				Class307.method1881(Class254.aClass83_3496, i + 113);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class11_Sub2_Sub19.aClass160_9093) {
				Class232.anInt3174 = Class219_Sub1.anInt7238;
				if ((Class37.anInt486 ^ 0xffffffff) == -1) {
					Class236_Sub9.incomingPacket = null;
					Class1_Sub1.anInt7124 = 0;
					Class7.aString44 = null;
					Class11_Sub2_Sub25.aString9332 = null;
					Class81.aClass92Array1096 = null;
					return true;
				}
				Class11_Sub2_Sub25.aString9332 = Class3.packetStream
						.readString(-1);
				boolean bool = ((Class3.packetStream
						.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2);
				if (bool)
					Class3.packetStream.readString(-1);
				long l = Class3.packetStream.method2516(8919);
				Class7.aString44 = Class11_Sub49.method3223(l, -2787);
				Class234.aByte3207 = Class3.packetStream.readByte(1854307120);
				int i_138_ = Class3.packetStream.readUnsignedByte((byte) 35);
				if ((i_138_ ^ 0xffffffff) == -256) {
					Class236_Sub9.incomingPacket = null;
					return true;
				}
				Class1_Sub1.anInt7124 = i_138_;
				Class92[] class92s = new Class92[100];
				for (int i_139_ = 0; Class1_Sub1.anInt7124 > i_139_; i_139_++) {
					class92s[i_139_] = new Class92();
					((Class92) class92s[i_139_]).aString1241 = Class3.packetStream
							.readString(i ^ 0x71);
					bool = (Class3.packetStream.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2;
					if (!bool)
						((Class92) class92s[i_139_]).aString1243 = ((Class92) class92s[i_139_]).aString1241;
					else
						((Class92) class92s[i_139_]).aString1243 = Class3.packetStream
								.readString(i + 113);
					((Class92) class92s[i_139_]).aString1242 = Class282
							.method1742(0,
									(((Class92) class92s[i_139_]).aString1243));
					((Class92) class92s[i_139_]).anInt1239 = Class3.packetStream
							.readUnsignedShort((byte) -65);
					((Class92) class92s[i_139_]).aByte1240 = Class3.packetStream
							.readByte(i ^ ~0x6e867b41);
					((Class92) class92s[i_139_]).aString1245 = Class3.packetStream
							.readString(-1);
					if (((Class92) class92s[i_139_]).aString1243
							.equals(((Player) Class11_Sub2_Sub8.myPlayer).aString10400))
						Class11_Sub43.aByte7339 = ((Class92) class92s[i_139_]).aByte1240;
				}
				boolean bool_140_ = false;
				int i_141_ = Class1_Sub1.anInt7124;
				while ((i_141_ ^ 0xffffffff) < -1) {
					i_141_--;
					bool_140_ = true;
					for (int i_142_ = 0; i_142_ < i_141_; i_142_++) {
						if ((((Class92) class92s[i_142_]).aString1242
								.compareTo(((Class92) class92s[i_142_ + 1]).aString1242)) > 0) {
							Class92 class92 = class92s[i_142_];
							class92s[i_142_] = class92s[1 + i_142_];
							class92s[i_142_ + 1] = class92;
							bool_140_ = false;
						}
					}
					if (bool_140_)
						break;
				}
				Class236_Sub9.incomingPacket = null;
				Class81.aClass92Array1096 = class92s;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class11_Sub2_Sub30.aClass160_9616) {
				int i_143_ = Class3.packetStream.readUnsignedShort128(true);
				int i_144_ = Class3.packetStream.readIntV1(27326);
				int i_145_ = Class3.packetStream.readUnsignedShortLE128(i
						^ ~0xc);
				int i_146_ = Class3.packetStream.readUnsignedShortLE128(126);
				Class245.method1545(false);
				Class234_Sub2_Sub2.method3539(i_143_, i_144_, i_145_
						| i_146_ << 16, 7, 116);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class11_Sub45_Sub9_Sub2.aClass160_10261 == Class236_Sub9.incomingPacket) {
				int i_147_ = Class3.packetStream.readInt(116);
				int i_148_ = Class3.packetStream.readUnsignedShortLE128(125);
				if ((i_148_ ^ 0xffffffff) == -65536)
					i_148_ = -1;
				int i_149_ = Class3.packetStream.readIntLE((byte) 85);
				Class245.method1545(false);
				Class91_Sub3.method3327(i_147_, i_148_, i_149_, -4847);
				Class249 class249 = Packet.aClass223_8723.method1430(i_148_,
						false);
				Class125.method817(((Class249) class249).anInt3408, i_147_,
						((Class249) class249).anInt3387, (byte) -81,
						((Class249) class249).anInt3383);
				Class11_Sub2_Sub10.method3478(-818245748,
						((Class249) class249).anInt3394, i_147_,
						((Class249) class249).anInt3379,
						((Class249) class249).anInt3413);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub8.aClass160_7076 == Class236_Sub9.incomingPacket) {
				Class313.aClass153_4152 = Class89.method620(121,
						Class3.packetStream.readUnsignedByte((byte) 35));
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class11_Sub8.aClass160_5302) {
				Class307.method1881(Class190.aClass83_2441, -1);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class108_Sub2.aClass160_5079) {
				Class108_Sub1.anInt5029 = Class3.packetStream.method2554(-109);
				Class11_Sub2_Sub29.aBool9474 = Class3.packetStream
						.readUnsignedByte((byte) 35) == 1;
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class15.ICOMPONENTSETTINGS_IN_PACKET == Class236_Sub9.incomingPacket) {
				int icompHash = Class3.packetStream.readIntV1(i + 27440);
				int fromSlot = Class3.packetStream.readUnsignedShortLE(25651);
				if (fromSlot == 65535)
					fromSlot = -1;
				int toSlot = Class3.packetStream.readUnsignedShortLE128(124);
				if ((toSlot ^ 0xffffffff) == -65536)
					toSlot = -1;
				int settingsHash = Class3.packetStream.readIntV1(27326);
				Class245.method1545(false);
				for (int slot = fromSlot; (slot ^ 0xffffffff) >= (toSlot ^ 0xffffffff); slot++) {
					long l = (long) slot + ((long) icompHash << 32);
					InterfaceSettings class11_sub9 = ((InterfaceSettings) Class376_Sub7_Sub2_Sub1.aClass213_10180
							.method1369((byte) 26, l));
					InterfaceSettings class11_sub9_155_;
					if (class11_sub9 != null) {
						class11_sub9_155_ = new InterfaceSettings(settingsHash,
								(((InterfaceSettings) class11_sub9).anInt5354));
						class11_sub9.method122(-60);
					} else if ((slot ^ 0xffffffff) == 0)
						class11_sub9_155_ = (new InterfaceSettings(
								settingsHash,
								((InterfaceSettings) (((IComponentDefinitions) Class11_Sub2_Sub13
										.method3533((byte) -104, icompHash)).aClass11_Sub9_2586)).anInt5354));
					else
						class11_sub9_155_ = new InterfaceSettings(settingsHash, -1);
					Class376_Sub7_Sub2_Sub1.aClass213_10180.method1368(l,
							class11_sub9_155_, (byte) -26);
				}
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class278.aClass160_3755 == Class236_Sub9.incomingPacket) {
				int i_156_ = Class3.packetStream.readInt(112);
				Class11_Sub2_Sub4.aClass368_8500 = Class108_Sub21.aClass341_7304
						.method2069(i_156_, (byte) 0);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class3.aClass160_23 == Class236_Sub9.incomingPacket) {
				String string = Class3.packetStream.readString(-1);
				boolean bool = ((Class3.packetStream
						.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2);
				String string_157_;
				if (bool)
					string_157_ = Class3.packetStream.readString(-1);
				else
					string_157_ = string;
				int i_158_ = Class3.packetStream.readUnsignedShort((byte) -65);
				byte i_159_ = Class3.packetStream.readByte(i + 1854307234);
				boolean bool_160_ = false;
				if ((i_159_ ^ 0xffffffff) == 127)
					bool_160_ = true;
				if (!bool_160_) {
					String string_161_ = Class3.packetStream.readString(-1);
					Class92 class92 = new Class92();
					((Class92) class92).aString1243 = string_157_;
					((Class92) class92).aString1241 = string;
					((Class92) class92).aString1242 = Class282.method1742(0,
							((Class92) class92).aString1243);
					((Class92) class92).aString1245 = string_161_;
					((Class92) class92).anInt1239 = i_158_;
					((Class92) class92).aByte1240 = i_159_;
					int i_162_;
					for (i_162_ = Class1_Sub1.anInt7124 - 1; (i_162_ ^ 0xffffffff) <= -1; i_162_--) {
						int i_163_ = ((Class92) Class81.aClass92Array1096[i_162_]).aString1242
								.compareTo(((Class92) class92).aString1242);
						if ((i_163_ ^ 0xffffffff) == -1) {
							((Class92) Class81.aClass92Array1096[i_162_]).anInt1239 = i_158_;
							((Class92) Class81.aClass92Array1096[i_162_]).aByte1240 = i_159_;
							((Class92) Class81.aClass92Array1096[i_162_]).aString1245 = string_161_;
							if (string_157_
									.equals(((Player) (Class11_Sub2_Sub8.myPlayer)).aString10400))
								Class11_Sub43.aByte7339 = i_159_;
							Class236_Sub9.incomingPacket = null;
							Class232.anInt3174 = Class219_Sub1.anInt7238;
							return true;
						}
						if ((i_163_ ^ 0xffffffff) > -1)
							break;
					}
					if (Class1_Sub1.anInt7124 >= Class81.aClass92Array1096.length) {
						Class236_Sub9.incomingPacket = null;
						return true;
					}
					for (int i_164_ = Class1_Sub1.anInt7124 - 1; (i_164_ ^ 0xffffffff) < (i_162_ ^ 0xffffffff); i_164_--)
						Class81.aClass92Array1096[i_164_ + 1] = Class81.aClass92Array1096[i_164_];
					if ((Class1_Sub1.anInt7124 ^ 0xffffffff) == -1)
						Class81.aClass92Array1096 = new Class92[100];
					Class81.aClass92Array1096[1 + i_162_] = class92;
					Class1_Sub1.anInt7124++;
					if (string_157_
							.equals(((Player) Class11_Sub2_Sub8.myPlayer).aString10400))
						Class11_Sub43.aByte7339 = i_159_;
				} else {
					if (Class1_Sub1.anInt7124 == 0) {
						Class236_Sub9.incomingPacket = null;
						return true;
					}
					boolean bool_165_ = false;
					int i_166_;
					for (i_166_ = 0; ((i_166_ ^ 0xffffffff) > (Class1_Sub1.anInt7124 ^ 0xffffffff)); i_166_++) {
						if (((Class92) Class81.aClass92Array1096[i_166_]).aString1243
								.equals(string_157_)
								&& ((((Class92) Class81.aClass92Array1096[i_166_]).anInt1239) ^ 0xffffffff) == (i_158_ ^ 0xffffffff))
							break;
					}
					if (Class1_Sub1.anInt7124 > i_166_) {
						for (/**/; ((i_166_ ^ 0xffffffff) > (Class1_Sub1.anInt7124 - 1 ^ 0xffffffff)); i_166_++)
							Class81.aClass92Array1096[i_166_] = Class81.aClass92Array1096[1 + i_166_];
						Class1_Sub1.anInt7124--;
						Class81.aClass92Array1096[Class1_Sub1.anInt7124] = null;
					}
				}
				Class232.anInt3174 = Class219_Sub1.anInt7238;
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class11_Sub21.GAME_MESSAGE_IN_PACKET) {
				int i_167_ = Class3.packetStream.readSmart(120);
				int i_168_ = Class3.packetStream.readInt(90);
				int i_169_ = Class3.packetStream.readUnsignedByte((byte) 35);
				String string = "";
				String string_170_ = string;
				if ((i_169_ & 0x1) != 0) {
					string = Class3.packetStream.readString(i + 113);
					if ((i_169_ & 0x2) != 0)
						string_170_ = Class3.packetStream.readString(i + 113);
					else
						string_170_ = string;
				}
				String string_171_ = Class3.packetStream.readString(-1);
				if ((i_167_ ^ 0xffffffff) == -100)
					Class314.method1912(string_171_, (byte) 41);
				else {
					if (!string_170_.equals("")
							&& Class11_Sub26
									.method2671(string_170_, (byte) -91)) {
						Class236_Sub9.incomingPacket = null;
						return true;
					}
					Class300.method1852(-112, string_171_, string_170_, i_168_,
							string, string, i_167_);
				}
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class11_Sub45_Sub10.aClass160_8954) {
				int i_172_ = Class3.packetStream.readUnsignedShortLE(25651);
				int i_173_ = Class3.packetStream.readInt(124);
				Class245.method1545(false);
				Class355.method2126((byte) 76, i_173_, i_172_);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class11_Sub5.RUN_ENERGY_IN_PACKET == Class236_Sub9.incomingPacket) {
				Class219_Sub1.RUN_ENERGY = Class3.packetStream
						.readUnsignedByte((byte) 35);
				Class219.anInt3019 = Class219_Sub1.anInt7238;
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class123.aClass160_1665 == Class236_Sub9.incomingPacket) {
				int i_174_ = Class3.packetStream.method2541(0);
				int i_175_ = Class3.packetStream.readIntLE((byte) 105);
				int i_176_ = Class3.packetStream.method2501(-8);
				Class245.method1545(false);
				Class335_Sub3.method3143(i_176_, i_175_, i_174_, true);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class28_Sub1.aClass160_6605) {
				int i_177_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_178_ = Class3.packetStream.readUnsignedShort((byte) -65);
				boolean bool = (i_177_ & 0x1 ^ 0xffffffff) == -2;
				Class150.method950(bool, i_178_, (byte) 95);
				Class310.anIntArray4147[Class77.method529(31,
						Class77.anInt1045++)] = i_178_;
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class234_Sub1_Sub1.ICOMPONENT_TEXT_IN_PACKET == Class236_Sub9.incomingPacket) {
				int i_179_ = Class3.packetStream.readIntV2((byte) 72);
				String string = Class3.packetStream.readString(-1);
				Class245.method1545(false);
				Class41.method365(i_179_, string, i + 117);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class11_Sub43.aClass160_7338) {
				boolean bool = ((Class3.packetStream
						.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2);
				String string = Class3.packetStream.readString(i + 113);
				String string_180_ = string;
				if (bool)
					string_180_ = Class3.packetStream.readString(-1);
				int i_181_ = Class3.packetStream.readUnsignedByte((byte) 35);
				boolean bool_182_ = false;
				if ((i_181_ ^ 0xffffffff) >= -2) {
					if (Class11_Sub2_Sub29.aBool9474 && !Class242.aBool3289
							|| Class100.aBool1328)
						bool_182_ = true;
					else if (i_181_ <= 1
							&& Class11_Sub26
									.method2671(string_180_, (byte) -88))
						bool_182_ = true;
				}
				if (!bool_182_ && Class11_Sub45_Sub15.anInt9364 == 0) {
					String string_183_ = IComponentDefinitions.method1260(
							(Class11_Sub25.method2662(32767,
									(Class3.packetStream))), 0);
					if (i_181_ == 2)
						Class153.method958(string_183_, 24, 0, true, null, -1,
								"<img=1>" + string, string, "<img=1>"
										+ string_180_);
					else if (i_181_ != 1)
						Class153.method958(string_183_, 24, 0, true, null, -1,
								string, string, string_180_);
					else
						Class153.method958(string_183_, 24, 0, true, null, -1,
								"<img=0>" + string, string, "<img=0>"
										+ string_180_);
				}
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class236_Sub4.aClass160_6719) {
				if (Class355.aFrame4658 != null)
					Class113.method756(
							i + 117,
							false,
							((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub13_5726
									.method2654(false), -1, -1);
				byte[] is = new byte[Class37.anInt486];
				Class3.packetStream.method3426(true, 0, Class37.anInt486, is);
				String string = Class11_Sub45_Sub20_Sub2.method3941(is, 0, 63,
						Class37.anInt486);
				Class342.method2074(
						true,
						string,
						(byte) 123,
						Class108_Sub21.aClass341_7304,
						((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub28_5696
								.method3181(false) == 1);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class264.aClass160_3602) {
				int i_184_ = Class3.packetStream.readIntLE((byte) 46);
				int i_185_ = Class3.packetStream.readIntLE((byte) 124);
				Class245.method1545(false);
				Class11_Sub24 class11_sub24 = ((Class11_Sub24) Class75_Sub2.aClass213_7160
						.method1369((byte) 26, (long) i_184_));
				Class11_Sub24 class11_sub24_186_ = ((Class11_Sub24) Class75_Sub2.aClass213_7160
						.method1369((byte) 26, (long) i_185_));
				if (class11_sub24_186_ != null)
					NPCDefinitions.method1377(
							false,
							(class11_sub24 == null || (((((Class11_Sub24) class11_sub24).anInt6233) ^ 0xffffffff) != (((Class11_Sub24) class11_sub24_186_).anInt6233 ^ 0xffffffff))),
							class11_sub24_186_, i + 76);
				if (class11_sub24 != null) {
					class11_sub24.method122(-105);
					Class75_Sub2.aClass213_7160.method1368((long) i_185_,
							class11_sub24, (byte) -26);
				}
				IComponentDefinitions class192 = Class11_Sub2_Sub13.method3533(
						(byte) -82, i_184_);
				if (class192 != null)
					Class232.method1484(class192, 1);
				class192 = Class11_Sub2_Sub13.method3533((byte) -78, i_185_);
				if (class192 != null) {
					Class232.method1484(class192, i + 115);
					Class130.method843(true, true, class192);
				}
				if (Class365.anInt4797 != -1)
					Class11_Sub12_Sub1.method3466(1, -115, Class365.anInt4797);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class206_Sub3.aClass160_6836) {
				InputStream_Sub2.method2814(false, i ^ 0x6468);
				Class236_Sub9.incomingPacket = null;
				return false;
			}
			if (Class236_Sub9.incomingPacket == Class124.aClass160_1680) {
				int i_187_ = Class3.packetStream.readUnsignedShort128(true);
				int i_188_ = Class3.packetStream.readInt(91);
				Class245.method1545(false);
				Class255.method1632(i_188_, false, i_187_);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class376_Sub3.aClass160_6114 == Class236_Sub9.incomingPacket) {
				Class307.method1881(Class64.aClass83_927, -1);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class209.aClass160_2845) {
				int i_189_ = Class3.packetStream.readUnsignedByte((byte) 35);
				boolean bool = (i_189_ & 0x1 ^ 0xffffffff) == -2;
				String string = Class3.packetStream.readString(-1);
				String string_190_ = Class3.packetStream.readString(-1);
				if (string_190_.equals(""))
					string_190_ = string;
				String string_191_ = Class3.packetStream.readString(i + 113);
				String string_192_ = Class3.packetStream.readString(i ^ 0x71);
				if (string_192_.equals(""))
					string_192_ = string_191_;
				if (!bool) {
					Class11_Sub2_Sub16.aStringArray9034[Class231.anInt3168] = string;
					Class335_Sub3_Sub1.aStringArray9416[Class231.anInt3168] = string_190_;
					Class345.aStringArray4584[Class231.anInt3168] = string_191_;
					Class11_Sub2_Sub21.aStringArray9195[Class231.anInt3168] = string_192_;
					Class313.aBoolArray4159[Class231.anInt3168] = Class77
							.method529(2, i_189_) == 2;
					Class231.anInt3168++;
				} else {
					for (int i_193_ = 0; ((Class231.anInt3168 ^ 0xffffffff) < (i_193_ ^ 0xffffffff)); i_193_++) {
						if (Class335_Sub3_Sub1.aStringArray9416[i_193_]
								.equals(string_192_)) {
							Class11_Sub2_Sub16.aStringArray9034[i_193_] = string;
							Class335_Sub3_Sub1.aStringArray9416[i_193_] = string_190_;
							Class345.aStringArray4584[i_193_] = string_191_;
							Class11_Sub2_Sub21.aStringArray9195[i_193_] = string_192_;
							break;
						}
					}
				}
				Class315.anInt4170 = Class219_Sub1.anInt7238;
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class108_Sub11.aClass160_6146) {
				String string = Class3.packetStream.readString(-1);
				int i_194_ = Class3.packetStream.readUnsignedShort((byte) -65);
				String string_195_ = (Class11_Sub2_Sub10.aClass352_8851
						.method2107(i_194_, false).method3630(
						Class3.packetStream, (byte) 78));
				Class153.method958(string_195_, 19, 0, true, null, i_194_,
						string, string, string);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class234_Sub2.aClass160_5985) {
				Class307.method1881(Class243.aClass83_3301, -1);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class96.aClass160_1282 == Class236_Sub9.incomingPacket) {
				int i_196_ = Class3.packetStream.readUnsignedByteC(-6067);
				int i_197_ = Class3.packetStream.readUnsigned128Byte(true);
				int i_198_ = Class3.packetStream.readUnsignedByte128(7925);
				int i_199_ = Class3.packetStream.readUnsignedShort128(true);
				int i_200_ = Class3.packetStream.readUnsignedByte128(i + 8039);
				Class245.method1545(false);
				Class11_Sub45_Sub19.aBoolArray9711[i_197_] = true;
				Class240.anIntArray3256[i_197_] = i_200_;
				Class339.anIntArray4488[i_197_] = i_196_;
				Class2_Sub9.anIntArray7273[i_197_] = i_198_;
				Class61.anIntArray903[i_197_] = i_199_;
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class37.aClass160_483 == Class236_Sub9.incomingPacket) {
				for (int i_201_ = 0; ((i_201_ ^ 0xffffffff) > (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814.length ^ 0xffffffff)); i_201_++) {
					if (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_201_] != null) {
						((Actor) (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_201_])).anIntArray10272 = null;
						((Actor) (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_201_])).anInt10352 = -1;
					}
				}
				for (int i_202_ = 0; Class108_Sub17.anInt6619 > i_202_; i_202_++) {
					((Actor) (((Class11_Sub25) Class369.aClass11_Sub25Array4842[i_202_]).aNpc_2373)).anIntArray10272 = null;
					((Actor) (((Class11_Sub25) Class369.aClass11_Sub25Array4842[i_202_]).aNpc_2373)).anInt10352 = -1;
				}
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class52.UPDATE_ITEMS_IN_PACKET == Class236_Sub9.incomingPacket) {
				int i_203_ = Class3.packetStream.readUnsignedShort((byte) -65);
				int i_204_ = Class3.packetStream.readUnsignedByte((byte) 35);
				boolean bool = (0x1 & i_204_) == 1;
				while ((((Stream) Class3.packetStream).position ^ 0xffffffff) > (Class37.anInt486 ^ 0xffffffff)) {
					int i_205_ = Class3.packetStream.readSmart(i + 116);
					int i_206_ = Class3.packetStream
							.readUnsignedShort((byte) -65);
					int i_207_ = 0;
					if ((i_206_ ^ 0xffffffff) != -1) {
						i_207_ = Class3.packetStream
								.readUnsignedByte((byte) 35);
						if (i_207_ == 255)
							i_207_ = Class3.packetStream.readInt(119);
					}
					Class221.method1411(bool, i_203_, (byte) 111, i_207_,
							i_205_, i_206_ - 1);
				}
				Class310.anIntArray4147[Class77.method529(31,
						Class77.anInt1045++)] = i_203_;
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class219.aClass160_3014 == Class236_Sub9.incomingPacket) {
				int i_208_ = Class3.packetStream.readUnsignedByte128(7925);
				Class245.method1545(false);
				Class236_Sub9.incomingPacket = null;
				Class373.anInt4881 = i_208_;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class378.aClass160_4921) {
				int i_209_ = Class3.packetStream.readInt(93);
				Class245.method1545(false);
				if ((i_209_ ^ 0xffffffff) == 0) {
					Class170.anInt2186 = -1;
					Canvas_Sub1.anInt9233 = -1;
				} else {
					int i_210_ = 0x3fff & i_209_ >> 14;
					int i_211_ = i_209_ & 0x3fff;
					i_210_ -= Class194.anInt2641;
					if ((i_210_ ^ 0xffffffff) > -1)
						i_210_ = 0;
					else if (i_210_ >= Class300.anInt4051)
						i_210_ = Class300.anInt4051;
					i_211_ -= Class118.anInt1605;
					Canvas_Sub1.anInt9233 = 256 + (i_210_ << 9);
					if ((i_211_ ^ 0xffffffff) <= -1) {
						if ((i_211_ ^ 0xffffffff) <= (Class108_Sub12.anInt6228 ^ 0xffffffff))
							i_211_ = Class108_Sub12.anInt6228;
					} else
						i_211_ = 0;
					Class170.anInt2186 = 256 + (i_211_ << 9);
				}
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class11_Sub12_Sub1.aClass160_8823) {
				byte i_212_ = Class3.packetStream.readByte(1854307120);
				int i_213_ = Class3.packetStream.readUnsignedByteC(-6067);
				Class245.method1545(false);
				Class376_Sub7_Sub5_Sub2.method3907(i_212_, 127, i_213_);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class11_Sub2_Sub19.aClass160_9094 == Class236_Sub9.incomingPacket) {
				int i_214_ = Class3.packetStream.readUnsignedByte128(7925);
				int i_215_ = Class3.packetStream.readUnsignedShort128(true);
				Class245.method1545(false);
				Class128.method835(i_215_, true, i_214_, 4096);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class10.INDEX_14_SOUND_IN_PACKET == Class236_Sub9.incomingPacket) {
				int i_216_ = Class3.packetStream.readUnsignedShort((byte) -65);
				if (i_216_ == 65535)
					i_216_ = -1;
				int i_217_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_218_ = Class3.packetStream.readUnsignedShort((byte) -65);
				int i_219_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_220_ = Class3.packetStream.readUnsignedShort((byte) -65);
				Class133.method860(i_220_, i_219_, (byte) 85, i_217_, i_216_,
						i_218_);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class140.aClass160_1899) {
				boolean bool = Class3.packetStream.readUnsignedByte((byte) 35) == 1;
				String string = Class3.packetStream.readString(i ^ 0x71);
				String string_221_ = string;
				if (bool)
					string_221_ = Class3.packetStream.readString(i ^ 0x71);
				long l = (long) Class3.packetStream
						.readUnsignedShort((byte) -65);
				long l_222_ = (long) Class3.packetStream.method2558(false);
				int i_223_ = Class3.packetStream.readUnsignedByte((byte) 35);
				long l_224_ = l_222_ + (l << 32);
				boolean bool_225_ = false;
				while_51_: do {
					for (int i_226_ = 0; (i_226_ ^ 0xffffffff) > -101; i_226_++) {
						if (l_224_ == Class15.aLongArray136[i_226_]) {
							bool_225_ = true;
							break while_51_;
						}
					}
					if (i_223_ <= 1) {
						if (Class11_Sub2_Sub29.aBool9474 && !Class242.aBool3289
								|| Class100.aBool1328)
							bool_225_ = true;
						else if (Class11_Sub26.method2671(string_221_,
								(byte) -127))
							bool_225_ = true;
					}
				} while (false);
				if (!bool_225_ && Class11_Sub45_Sub15.anInt9364 == 0) {
					Class15.aLongArray136[Class11_Sub2_Sub39.anInt9815] = l_224_;
					Class11_Sub2_Sub39.anInt9815 = (1 + Class11_Sub2_Sub39.anInt9815) % 100;
					String string_227_ = IComponentDefinitions.method1260(
							(Class11_Sub25.method2662(i + 32881,
									(Class3.packetStream))), 0);
					if ((i_223_ ^ 0xffffffff) != -3) {
						if (i_223_ == 1)
							Class153.method958(string_227_, 7, 0, true, null,
									-1, "<img=0>" + string, string, "<img=0>"
											+ string_221_);
						else
							Class153.method958(string_227_, 3, 0, true, null,
									-1, string, string, string_221_);
					} else
						Class153.method958(string_227_, 7, 0, true, null, -1,
								"<img=1>" + string, string, "<img=1>"
										+ string_221_);
				}
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class11_Sub2_Sub27.SEND_VARP_SMALL_IN_PACKET == Class236_Sub9.incomingPacket) {
				int i_228_ = Class3.packetStream.readUnsignedShortLE(25651);
				byte i_229_ = Class3.packetStream.read128Byte(127);
				Class11_Sub26.aClass97_6296.method651(i_229_, i_228_, false);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class321_Sub3_Sub1.aClass160_9261) {
				int i_230_ = Class3.packetStream.readUnsignedShortLE(i
						^ ~0x6442);
				int i_231_ = Class3.packetStream.readUnsignedShortLE128(125);
				Class245.method1545(false);
				Class2_Sub6.method2413(0, i ^ ~0x72, i_230_, i_231_);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class271.SEND_VARP_BIG == Class236_Sub9.incomingPacket) {
				int i_232_ = Class3.packetStream.readUnsignedShortLE(25651);
				int i_233_ = Class3.packetStream.readIntV2((byte) -114);
				Class11_Sub26.aClass97_6296.method651(i_233_, i_232_, false);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class11_Sub46_Sub1.MUSIC_IN_PACKET) {
				int i_234_ = Class3.packetStream.readUnsignedByte128(7925);
				int i_235_ = Class3.packetStream.readUnsignedShort((byte) -65);
				if (i_235_ == 65535)
					i_235_ = -1;
				int i_236_ = Class3.packetStream.readUnsignedByteC(-6067);
				Class11_Sub6_Sub3.method3575(i_234_, 123, i_235_, i_236_);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (IComponentDefinitions.MUSIC_EFFECT_IN_PACKET == Class236_Sub9.incomingPacket) {
				int i_237_ = Class3.packetStream.readUnsignedShort((byte) -65);
				if ((i_237_ ^ 0xffffffff) == -65536)
					i_237_ = -1;
				int i_238_ = Class3.packetStream.readUnsigned128Byte(true);
				int i_239_ = Class3.packetStream.read24BitInteger(i + 114);
				Class91_Sub3.method3328(i_239_, i_237_, i_238_, false);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class295.aClass160_3980) {
				boolean bool = ((Class3.packetStream
						.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2);
				String string = Class3.packetStream.readString(i + 113);
				String string_240_ = string;
				if (bool)
					string_240_ = Class3.packetStream.readString(-1);
				int i_241_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_242_ = Class3.packetStream.readUnsignedShort((byte) -65);
				boolean bool_243_ = false;
				if ((i_241_ ^ 0xffffffff) >= -2
						&& Class11_Sub26.method2671(string_240_, (byte) -62))
					bool_243_ = true;
				if (!bool_243_ && Class11_Sub45_Sub15.anInt9364 == 0) {
					String string_244_ = (Class11_Sub2_Sub10.aClass352_8851
							.method2107(i_242_, false).method3630(
							Class3.packetStream, (byte) 78));
					if ((i_241_ ^ 0xffffffff) != -3) {
						if (i_241_ != 1)
							Class153.method958(string_244_, 25, 0, true, null,
									i_242_, string, string, string_240_);
						else
							Class153.method958(string_244_, 25, 0, true, null,
									i_242_, "<img=0>" + string, string,
									"<img=0>" + string_240_);
					} else
						Class153.method958(string_244_, 25, 0, true, null,
								i_242_, "<img=1>" + string, string, "<img=1>"
										+ string_240_);
				}
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class280.INDEX_15_SOUND_IN_PACKET == Class236_Sub9.incomingPacket) {
				int i_245_ = Class3.packetStream.readUnsignedShort((byte) -65);
				if ((i_245_ ^ 0xffffffff) == -65536)
					i_245_ = -1;
				int i_246_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_247_ = Class3.packetStream.readUnsignedShort((byte) -65);
				int i_248_ = Class3.packetStream.readUnsignedByte((byte) 35);
				Class254.method1630(i_245_, true, i_246_, 256, 9400, i_248_,
						i_247_);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class35.aClass160_469) {
				boolean bool = Class3.packetStream.readUnsignedByte((byte) 35) == 1;
				String string = Class3.packetStream.readString(-1);
				String string_249_ = string;
				if (bool)
					string_249_ = Class3.packetStream.readString(i ^ 0x71);
				long l = Class3.packetStream.method2516(i ^ ~0x22a6);
				long l_250_ = (long) Class3.packetStream
						.readUnsignedShort((byte) -65);
				long l_251_ = (long) Class3.packetStream.method2558(false);
				int i_252_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_253_ = Class3.packetStream.readUnsignedShort((byte) -65);
				long l_254_ = l_251_ + (l_250_ << 32);
				boolean bool_255_ = false;
				while_52_: do {
					for (int i_256_ = 0; i_256_ < 100; i_256_++) {
						if (l_254_ == Class15.aLongArray136[i_256_]) {
							bool_255_ = true;
							break while_52_;
						}
					}
					if (i_252_ <= 1
							&& Class11_Sub26.method2671(string_249_, (byte) 95))
						bool_255_ = true;
				} while (false);
				if (!bool_255_ && Class11_Sub45_Sub15.anInt9364 == 0) {
					Class15.aLongArray136[Class11_Sub2_Sub39.anInt9815] = l_254_;
					Class11_Sub2_Sub39.anInt9815 = (1 + Class11_Sub2_Sub39.anInt9815) % 100;
					String string_257_ = (Class11_Sub2_Sub10.aClass352_8851
							.method2107(i_253_, false).method3630(
							Class3.packetStream, (byte) 78));
					if ((i_252_ ^ 0xffffffff) == -3)
						Class153.method958(string_257_, 20, 0, true,
								Class42.method385(39, l), i_253_, "<img=1>"
										+ string, string, "<img=1>"
										+ string_249_);
					else if ((i_252_ ^ 0xffffffff) != -2)
						Class153.method958(string_257_, 20, 0, true,
								Class42.method385(i ^ ~0x65, l), i_253_,
								string, string, string_249_);
					else
						Class153.method958(string_257_, 20, 0, true,
								Class42.method385(i ^ ~0x49, l), i_253_,
								"<img=0>" + string, string, "<img=0>"
										+ string_249_);
				}
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class239_Sub1.aClass160_7266 == Class236_Sub9.incomingPacket) {
				while ((((Stream) Class3.packetStream).position ^ 0xffffffff) > (Class37.anInt486 ^ 0xffffffff)) {
					boolean bool = ((Class3.packetStream
							.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2);
					String string = Class3.packetStream.readString(-1);
					String string_258_ = Class3.packetStream
							.readString(i ^ 0x71);
					int i_259_ = Class3.packetStream
							.readUnsignedShort((byte) -65);
					int i_260_ = Class3.packetStream
							.readUnsignedByte((byte) 35);
					String string_261_ = "";
					boolean bool_262_ = false;
					if (i_259_ > 0) {
						string_261_ = Class3.packetStream.readString(-1);
						bool_262_ = Class3.packetStream
								.readUnsignedByte((byte) 35) == 1;
					}
					for (int i_263_ = 0; ((i_263_ ^ 0xffffffff) > (Class94_Sub1.anInt5228 ^ 0xffffffff)); i_263_++) {
						if (bool) {
							if (string_258_
									.equals(Class109.aStringArray1476[i_263_])) {
								Class109.aStringArray1476[i_263_] = string;
								Class137.aStringArray1882[i_263_] = string_258_;
								string = null;
								break;
							}
						} else if (string
								.equals(Class109.aStringArray1476[i_263_])) {
							if ((Class326.anIntArray4337[i_263_] ^ 0xffffffff) != (i_259_ ^ 0xffffffff)) {
								boolean bool_264_ = true;
								for (Class376_Sub1_Sub2 class376_sub1_sub2 = ((Class376_Sub1_Sub2) Class2_Sub1.aClass131_5063
										.method847(-31182)); class376_sub1_sub2 != null; class376_sub1_sub2 = ((Class376_Sub1_Sub2) Class2_Sub1.aClass131_5063
										.method856(i + 221))) {
									if (((Class376_Sub1_Sub2) class376_sub1_sub2).aString9744
											.equals(string)) {
										if ((i_259_ ^ 0xffffffff) != -1
												&& (((Class376_Sub1_Sub2) class376_sub1_sub2).aShort9743 ^ 0xffffffff) == -1) {
											class376_sub1_sub2
													.method2207((byte) -120);
											bool_264_ = false;
										} else if ((i_259_ ^ 0xffffffff) == -1
												&& ((((Class376_Sub1_Sub2) class376_sub1_sub2).aShort9743) ^ 0xffffffff) != -1) {
											bool_264_ = false;
											class376_sub1_sub2
													.method2207((byte) -105);
										}
									}
								}
								if (bool_264_)
									Class2_Sub1.aClass131_5063.method853(0,
											new Class376_Sub1_Sub2(string,
													i_259_));
								Class326.anIntArray4337[i_263_] = i_259_;
							}
							Class137.aStringArray1882[i_263_] = string_258_;
							Class285.aStringArray3844[i_263_] = string_261_;
							Class101.anIntArray1351[i_263_] = i_260_;
							string = null;
							Class376_Sub8.aBoolArray7757[i_263_] = bool_262_;
							break;
						}
					}
					if (string != null && Class94_Sub1.anInt5228 < 200) {
						Class109.aStringArray1476[Class94_Sub1.anInt5228] = string;
						Class137.aStringArray1882[Class94_Sub1.anInt5228] = string_258_;
						Class326.anIntArray4337[Class94_Sub1.anInt5228] = i_259_;
						Class285.aStringArray3844[Class94_Sub1.anInt5228] = string_261_;
						Class101.anIntArray1351[Class94_Sub1.anInt5228] = i_260_;
						Class376_Sub8.aBoolArray7757[Class94_Sub1.anInt5228] = bool_262_;
						Class94_Sub1.anInt5228++;
					}
				}
				Class12_Sub1.anInt5159 = 2;
				Class315.anInt4170 = Class219_Sub1.anInt7238;
				boolean bool = false;
				int i_265_ = Class94_Sub1.anInt5228;
				while ((i_265_ ^ 0xffffffff) < -1) {
					i_265_--;
					bool = true;
					for (int i_266_ = 0; (i_265_ ^ 0xffffffff) < (i_266_ ^ 0xffffffff); i_266_++) {
						if ((((Class326.anIntArray4337[i_266_] ^ 0xffffffff) != (((Class46) Class275.aClass46_3705).anInt730 ^ 0xffffffff)) && (Class326.anIntArray4337[1 + i_266_] == (((Class46) Class275.aClass46_3705).anInt730)))
								|| (((Class326.anIntArray4337[i_266_] ^ 0xffffffff) == -1) && Class326.anIntArray4337[i_266_ + 1] != 0)) {
							int i_267_ = Class326.anIntArray4337[i_266_];
							Class326.anIntArray4337[i_266_] = Class326.anIntArray4337[1 + i_266_];
							Class326.anIntArray4337[1 + i_266_] = i_267_;
							String string = Class285.aStringArray3844[i_266_];
							Class285.aStringArray3844[i_266_] = Class285.aStringArray3844[1 + i_266_];
							Class285.aStringArray3844[i_266_ + 1] = string;
							String string_268_ = Class109.aStringArray1476[i_266_];
							Class109.aStringArray1476[i_266_] = Class109.aStringArray1476[i_266_ + 1];
							Class109.aStringArray1476[1 + i_266_] = string_268_;
							String string_269_ = Class137.aStringArray1882[i_266_];
							Class137.aStringArray1882[i_266_] = Class137.aStringArray1882[i_266_ + 1];
							Class137.aStringArray1882[1 + i_266_] = string_269_;
							int i_270_ = Class101.anIntArray1351[i_266_];
							Class101.anIntArray1351[i_266_] = Class101.anIntArray1351[i_266_ + 1];
							Class101.anIntArray1351[i_266_ + 1] = i_270_;
							boolean bool_271_ = Class376_Sub8.aBoolArray7757[i_266_];
							Class376_Sub8.aBoolArray7757[i_266_] = Class376_Sub8.aBoolArray7757[i_266_ + 1];
							Class376_Sub8.aBoolArray7757[i_266_ + 1] = bool_271_;
							bool = false;
						}
					}
					if (bool)
						break;
				}
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class179.aClass160_2274 == Class236_Sub9.incomingPacket) {
				if (!Class221.method1416(Class285.anInt3846, i - 8600))
					Class334.anInt4423 = 30 * Class3.packetStream
							.readUnsignedShort((byte) -65);
				else
					Class334.anInt4423 = (int) ((float) Class3.packetStream
							.readUnsignedShort((byte) -65) * 2.5F);
				Class219.anInt3019 = Class219_Sub1.anInt7238;
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class108_Sub13.LOCAL_NPC_UPDATE_IN_PACKET) {
				Class116.decodeLocalNPCUpdate(-111);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class376_Sub2.SKILL_LEVEL_IN_PACKET) {
				int xp = Class3.packetStream.readIntV1(27326);
				int skillId = Class3.packetStream.readUnsignedByte128(7925);
				int lvl = Class3.packetStream.readUnsignedByte((byte) 35);
				Class301.anIntArray4061[skillId] = xp;
				Class34.anIntArray459[skillId] = lvl;
				Class236_Sub5.anIntArray6854[skillId] = 1;
				int i_275_ = -1 + Class302.anIntArray4068[skillId];
				for (int i_276_ = 0; i_276_ < i_275_; i_276_++) {
					if ((xp ^ 0xffffffff) <= (Class204.anIntArray2752[i_276_] ^ 0xffffffff))
						Class236_Sub5.anIntArray6854[skillId] = 2 + i_276_;
				}
				Class44.anIntArray709[Class77.method529(31,
						Class11_Sub45_Sub13.anInt9305++)] = skillId;
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class253_Sub2.aClass160_6511 == Class236_Sub9.incomingPacket) {
				Class236_Sub9.incomingPacket = null;
				return false;
			}
			if (Class236_Sub9.incomingPacket == Class22.aClass160_190) {
				int i_277_ = Class3.packetStream.readUnsignedByte((byte) 35);
				if ((Class3.packetStream.readUnsignedByte((byte) 35) ^ 0xffffffff) == -1)
					Class254_Sub2.aClass111Array6987[i_277_] = new Class111();
				else {
					((Stream) Class3.packetStream).position--;
					Class254_Sub2.aClass111Array6987[i_277_] = new Class111(
							Class3.packetStream);
				}
				Class236_Sub9.incomingPacket = null;
				Class267.anInt3628 = Class219_Sub1.anInt7238;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class315.aClass160_4175) {
				int i_278_ = Class3.packetStream.readUnsignedShort128(true);
				Class245.method1545(false);
				Class46.method404(i_278_, (byte) 109);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class94_Sub4.aClass160_7724) {
				Class307.method1881(Class11_Sub8.aClass83_5307, -1);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class11_Sub22.aClass160_5971 == Class236_Sub9.incomingPacket) {
				boolean bool = ((Class3.packetStream
						.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2);
				String string = Class3.packetStream.readString(i + 113);
				String string_279_ = string;
				if (bool)
					string_279_ = Class3.packetStream.readString(-1);
				long l = (long) Class3.packetStream
						.readUnsignedShort((byte) -65);
				long l_280_ = (long) Class3.packetStream.method2558(false);
				int i_281_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_282_ = Class3.packetStream.readUnsignedShort((byte) -65);
				long l_283_ = (l << 32) - -l_280_;
				boolean bool_284_ = false;
				while_53_: do {
					for (int i_285_ = 0; i_285_ < 100; i_285_++) {
						if (l_283_ == Class15.aLongArray136[i_285_]) {
							bool_284_ = true;
							break while_53_;
						}
					}
					if ((i_281_ ^ 0xffffffff) >= -2
							&& Class11_Sub26
									.method2671(string_279_, (byte) -86))
						bool_284_ = true;
				} while (false);
				if (!bool_284_
						&& (Class11_Sub45_Sub15.anInt9364 ^ 0xffffffff) == -1) {
					Class15.aLongArray136[Class11_Sub2_Sub39.anInt9815] = l_283_;
					Class11_Sub2_Sub39.anInt9815 = (1 + Class11_Sub2_Sub39.anInt9815) % 100;
					String string_286_ = (Class11_Sub2_Sub10.aClass352_8851
							.method2107(i_282_, false).method3630(
							Class3.packetStream, (byte) 78));
					if (i_281_ != 2) {
						if (i_281_ == 1)
							Class153.method958(string_286_, 18, 0, true, null,
									i_282_, "<img=0>" + string, string,
									"<img=0>" + string_279_);
						else
							Class153.method958(string_286_, 18, 0, true, null,
									i_282_, string, string, string_279_);
					} else
						Class153.method958(string_286_, 18, 0, true, null,
								i_282_, "<img=1>" + string, string, "<img=1>"
										+ string_279_);
				}
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class29.aClass160_392) {
				int i_287_ = Class3.packetStream.method2541(i + 114);
				int i_288_ = Class3.packetStream.readIntLE((byte) 78);
				Class245.method1545(false);
				Class218.method1403(11, i_287_, i_288_);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class227.aClass160_3134) {
				Class307.method1881(Class55.aClass83_835, -1);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class11_Sub2_Sub14.aClass160_9005 == Class236_Sub9.incomingPacket) {
				int i_289_ = Class3.packetStream.readUnsignedShort((byte) -65);
				int i_290_ = Class3.packetStream.readInt(i + 214);
				int i_291_ = Class3.packetStream.readUnsignedShort128(true);
				int i_292_ = Class3.packetStream.readUnsignedShort((byte) -65);
				Class245.method1545(false);
				Class125.method817(i_292_, i_290_, i_289_, (byte) -81, i_291_);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class254_Sub3.aClass160_8042) {
				Class307.method1881(Class237.aClass83_3238, -1);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class11_Sub2_Sub35.aClass160_9749) {
				Class19_Sub1.method2473(Class37.anInt486,
						Class108_Sub21.aClass341_7304, Class3.packetStream,
						(byte) 0);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class165.aClass160_2134) {
				int i_293_ = Class3.packetStream.readUnsignedByteC(i - 5953);
				int i_294_ = Class3.packetStream.readInt(i + 202);
				int i_295_ = Class3.packetStream.readUnsignedShort((byte) -65);
				Class245.method1545(false);
				Class11_Sub24 class11_sub24 = ((Class11_Sub24) Class75_Sub2.aClass213_7160
						.method1369((byte) 26, (long) i_294_));
				if (class11_sub24 != null)
					NPCDefinitions.method1377(
							false,
							(((Class11_Sub24) class11_sub24).anInt6233) != i_295_,
							class11_sub24, -44);
				Class11_Sub3.method2287(i_294_, (byte) -112, i_293_, i_295_,
						false);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class290.aClass160_3908) {
				Class11_Sub26.aClass97_6296.method654((byte) 126);
				Class167.anInt2154 += 32;
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class217_Sub1.aClass160_5540 == Class236_Sub9.incomingPacket) {
				boolean bool = Class3.packetStream.readUnsignedByte((byte) 35) == 1;
				Class245.method1545(false);
				Class236_Sub9.incomingPacket = null;
				Class234_Sub1.aBool5643 = bool;
				return true;
			}
			if (Class193.HIDE_INTERFACE_COMPONENT_IN_PACKET == Class236_Sub9.incomingPacket) {
				int icomponentHash = Class3.packetStream.readInt(126);
				int hidden = Class3.packetStream.readUnsignedByteC(-6067);
				Class245.method1545(false);
				IncomingPacket.method992(7, hidden, icomponentHash);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class11_Sub2_Sub31.aClass160_9645) {
				if ((Class365.anInt4797 ^ 0xffffffff) != 0)
					Class11_Sub12_Sub1.method3466(0, -97, Class365.anInt4797);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class58_Sub1_Sub1.RESET_SOUNDS_IN_PACKET == Class236_Sub9.incomingPacket) {
				OutputStream_Sub2.method3195(0);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class195_Sub1.BLACKOUT_IN_PACKET == Class236_Sub9.incomingPacket) {
				Class2_Sub1.anInt5068 = Class3.packetStream
						.readUnsignedByte((byte) 35);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class11_Sub45_Sub14.aClass160_9311) {
				Class245.method1545(false);
				Class11_Sub2_Sub36.method3839((byte) 48);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class91_Sub1_Sub1.aClass160_8981 == Class236_Sub9.incomingPacket) {
				int i_298_ = Class3.packetStream.readInt(106);
				Class245.method1545(false);
				Class11_Sub24 class11_sub24 = ((Class11_Sub24) Class75_Sub2.aClass213_7160
						.method1369((byte) 26, (long) i_298_));
				if (class11_sub24 != null)
					NPCDefinitions.method1377(false, true, class11_sub24, -110);
				if (Class72.aClass192_1004 != null) {
					Class232.method1484(Class72.aClass192_1004, 1);
					Class72.aClass192_1004 = null;
				}
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			if (Class236_Sub9.incomingPacket == Class11_Sub2_Sub10.aClass160_8847) {
				Class11_Sub48.anInt8000 = Class3.packetStream
						.method2508((byte) 108);
				Class236_Sub9.incomingPacket = null;
				Class219.anInt3019 = Class219_Sub1.anInt7238;
				return true;
			}
			if (Class83.aClass160_1140 == Class236_Sub9.incomingPacket) {
				Class307.method1881(Class357.aClass83_4665, -1);
				Class236_Sub9.incomingPacket = null;
				return true;
			}
			Class11_Sub12_Sub3
					.method3602(
							(byte) -52,
							("T1 - "
									+ (Class236_Sub9.incomingPacket == null ? -1
											: Class236_Sub9.incomingPacket
													.method993((byte) 126))
									+ ","
									+ (Class340.aClass160_4489 != null ? Class340.aClass160_4489
											.method993((byte) 126) : -1)
									+ ","
									+ (Class266.aClass160_3621 != null ? Class266.aClass160_3621
											.method993((byte) 125) : -1)
									+ " - " + Class37.anInt486), null);
			InputStream_Sub2.method2814(false, -25626);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gt.B(" + i + ')');
		}
	}

	static final Class253 method997(int i, int i_299_, Class163 class163) {
		try {
			if (i != 2107742921)
				return null;
			anInt2095++;
			Class11_Sub26 class11_sub26 = ((Class11_Sub26) Class111.aClass213_1522
					.method1369((byte) 26, (long) i_299_));
			if (class11_sub26 != null) {
				Class11_Sub12_Sub4 class11_sub12_sub4 = ((Class11_Sub26) class11_sub26).aClass28_Sub1_6305
						.method236(-2);
				((Class11_Sub26) class11_sub26).aBool6293 = true;
				if (class11_sub12_sub4 != null)
					return class11_sub12_sub4.method3728(-1, class163);
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("gt.F(" + i + ',' + i_299_ + ','
							+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class161() {
		/* empty */
	}

	static final void method998(byte i) {
		try {
			anInt2093++;
			Class321.aClass33_4280 = null;
			if (i <= -83) {
				Class11_Sub2_Sub34.aClass33_9692 = null;
				Class243.aClass163_3308 = null;
				Class141.anInt1903 = -1;
				OutputStream_Sub1.anInt5845 = -1;
				Class11_Sub2_Sub39.anInt9813 = -1;
				Class175.anIntArray2231 = null;
				Class337.aClass33_4457 = null;
				Class11_Sub2_Sub32_Sub1.anInterface10_9891 = null;
				Class11_Sub32.anInt6873 = -1;
				Class286.anInterface10Array3872 = null;
				Class142.aClass103_1921.method682(-109);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gt.D(" + i + ')');
		}
	}

	private final void method999(boolean bool, Stream stream, int i) {
		try {
			if (bool != false)
				aClass213_2098 = null;
			anInt2088++;
			if (i != 1) {
				if (i == 2)
					((Class161) this).anInt2090 = 0;
			} else
				((Class161) this).aChar2092 = Class64.method486(
						stream.readByte(1854307120), 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gt.A(" + bool + ','
					+ (stream != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
