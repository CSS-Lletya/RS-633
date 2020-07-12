/* Class307 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class307 {
	int anInt4115;
	static int[] anIntArray4116 = new int[1];
	static int anInt4117;
	static int anInt4118;
	static int anInt4119;
	static int anInt4120;
	static int anInt4121;
	static int anInt4122;
	static int anInt4123 = 0;
	static int anInt4124;

	static final void method1879(int i) {
		do {
			try {
				for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -101; i_0_++)
					Class11_Sub45.aBoolArray7907[i_0_] = true;
				anInt4120++;
				if (i == -101)
					break;
				method1880(-79, 105, -30);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "rq.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static final boolean method1880(int i, int i_1_, int i_2_) {
		try {
			anInt4117++;
			if (i_1_ != -10698)
				method1881(null, 18);
			boolean bool = ((0x37 & i ^ 0xffffffff) == -1 ? Class46.method403(
					i, i_2_, 55) : Class219_Sub1.method2938(i, i_2_,
					i_1_ ^ 0x5377));
			return (bool | ((0x10000 & i_2_ ^ 0xffffffff) != -1 | Class11_Sub45_Sub5
					.method3437((byte) 33, i, i_2_)));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rq.E(" + i + ','
					+ i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method1881(Class83 class83, int i) {
		try {
			anInt4124++;
			if (Class11_Sub2_Sub5.aClass83_8560 == class83) {
				int i_3_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_4_ = Class122.anInt1659 + ((0x7f & i_3_) >> 4);
				int i_5_ = Class225_Sub1.anInt5009 - -(i_3_ & 0x7);
				int i_6_ = Class3.packetStream.readUnsignedShort((byte) -65);
				int i_7_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_8_ = Class3.packetStream.readUnsignedShort((byte) -65);
				int i_9_ = Class3.packetStream.readUnsignedByte((byte) 35);
				if (i_4_ >= 0
						&& (i_5_ ^ 0xffffffff) <= -1
						&& Class300.anInt4051 > i_4_
						&& ((Class108_Sub12.anInt6228 ^ 0xffffffff) < (i_5_ ^ 0xffffffff))) {
					int i_10_ = 512 * i_4_ + 256;
					int i_11_ = 512 * i_5_ + 256;
					int i_12_ = Class222.anInt3048;
					if ((i_12_ ^ 0xffffffff) > -4
							&& Class321_Sub3_Sub1.method3613((byte) -126, i_4_,
									i_5_))
						i_12_++;
					Class376_Sub7_Sub5_Sub3 class376_sub7_sub5_sub3 = (new Class376_Sub7_Sub5_Sub3(
							i_6_, i_8_, Class11_Sub25.anInt6279,
							Class222.anInt3048, i_12_, i_10_,
							Class318.method1931(69, i_11_, Class222.anInt3048,
									i_10_) - i_7_, i_11_, i_4_, i_4_, i_5_,
							i_5_, i_9_));
					Class376.aClass84_4911.method589((byte) -13,
							new Class11_Sub45_Sub10(class376_sub7_sub5_sub3));
				}
			} else if (class83 == Class11_Sub8.aClass83_5307) {
				int i_13_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_14_ = (0x7 & i_13_) + Class225_Sub1.anInt5009;
				int i_15_ = i_14_ + Class118.anInt1605;
				int i_16_ = Class122.anInt1659 - -(i_13_ >> 4 & 0x7);
				int i_17_ = Class194.anInt2641 + i_16_;
				int i_18_ = Class3.packetStream.readUnsignedShort((byte) -65);
				int i_19_ = Class3.packetStream.readUnsignedShort((byte) -65);
				int i_20_ = Class3.packetStream.readUnsignedShort((byte) -65);
				if (Class106.aClass213_1433 != null) {
					Class11_Sub27 class11_sub27 = ((Class11_Sub27) (Class106.aClass213_1433
							.method1369((byte) 26, (long) (i_15_ << 14
									| Class222.anInt3048 << 28 | i_17_))));
					if (class11_sub27 != null) {
						for (Class11_Sub36 class11_sub36 = ((Class11_Sub36) ((Class11_Sub27) class11_sub27).aClass84_6554
								.method584(-12261)); class11_sub36 != null; class11_sub36 = ((Class11_Sub36) ((Class11_Sub27) class11_sub27).aClass84_6554
								.method578(-15361))) {
							if ((((Class11_Sub36) class11_sub36).anInt7081 == (0x7fff & i_18_))
									&& ((i_19_ ^ 0xffffffff) == ((((Class11_Sub36) class11_sub36).anInt7078) ^ 0xffffffff))) {
								class11_sub36.method122(-127);
								((Class11_Sub36) class11_sub36).anInt7078 = i_20_;
								Class108_Sub23.method3130((byte) -112,
										class11_sub36, Class222.anInt3048,
										i_17_, i_15_);
								break;
							}
						}
						if ((i_16_ ^ 0xffffffff) <= -1 && i_14_ >= 0
								&& i_16_ < Class300.anInt4051
								&& i_14_ < Class108_Sub12.anInt6228)
							Class295.method1830(i_14_, i_16_, i - 10614,
									Class222.anInt3048);
					}
				}
			} else if (class83 == Class94_Sub3.aClass83_6907) {
				int i_21_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_22_ = (i_21_ >> 4 & 0xf) + 2 * Class122.anInt1659;
				int i_23_ = 2 * Class225_Sub1.anInt5009 - -(i_21_ & 0xf);
				int i_24_ = Class3.packetStream.readUnsignedByte((byte) 35);
				boolean bool = (0x1 & i_24_) != 0;
				boolean bool_25_ = (i_24_ & 0x2) != 0;
				int i_26_ = !bool_25_ ? -1 : i_24_ >> 2;
				int i_27_ = (Class3.packetStream.readByte(i ^ ~0x6e867b30) + i_22_);
				int i_28_ = i_23_ - -Class3.packetStream.readByte(1854307120);
				int i_29_ = Class3.packetStream.method2508((byte) -121);
				int i_30_ = Class3.packetStream.method2508((byte) 84);
				int i_31_ = Class3.packetStream.readUnsignedShort((byte) -65);
				int i_32_ = Class3.packetStream.readUnsignedByte((byte) 35);
				if (bool_25_)
					i_32_ = (byte) i_32_;
				else
					i_32_ *= 4;
				int i_33_ = 4 * Class3.packetStream.readUnsignedByte((byte) 35);
				int i_34_ = Class3.packetStream.readUnsignedShort((byte) -65);
				int i_35_ = Class3.packetStream.readUnsignedShort((byte) -65);
				int i_36_ = Class3.packetStream.readUnsignedByte((byte) 35);
				if (i_36_ == 255)
					i_36_ = -1;
				int i_37_ = Class3.packetStream.readUnsignedShort((byte) -65);
				if (i_22_ >= 0
						&& (i_23_ ^ 0xffffffff) <= -1
						&& (2 * Class300.anInt4051 ^ 0xffffffff) < (i_22_ ^ 0xffffffff)
						&& i_23_ < 2 * Class300.anInt4051
						&& i_27_ >= 0
						&& (i_28_ ^ 0xffffffff) <= -1
						&& ((Class108_Sub12.anInt6228 * 2 ^ 0xffffffff) < (i_27_ ^ 0xffffffff))
						&& i_28_ < Class108_Sub12.anInt6228 * 2
						&& i_31_ != 65535) {
					i_37_ <<= 2;
					i_23_ *= 256;
					i_33_ <<= 2;
					i_22_ *= 256;
					i_32_ <<= 2;
					i_27_ = 256 * i_27_;
					i_28_ = 256 * i_28_;
					if (i_29_ != 0 && (i_26_ ^ 0xffffffff) != 0) {
						Actor class376_sub7_sub5_sub5 = null;
						if (i_29_ >= 0) {
							int i_38_ = -1 + i_29_;
							Class11_Sub25 class11_sub25 = ((Class11_Sub25) Class11_Sub2_Sub25.aClass213_9322
									.method1369((byte) 26, (long) i_38_));
							if (class11_sub25 != null)
								class376_sub7_sub5_sub5 = (((Class11_Sub25) class11_sub25).aNpc_2373);
						} else {
							int i_39_ = -i_29_ - 1;
							if ((Class11_Sub44.anInt7791 ^ 0xffffffff) == (i_39_ ^ 0xffffffff))
								class376_sub7_sub5_sub5 = (Class11_Sub2_Sub8.myPlayer);
							else
								class376_sub7_sub5_sub5 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_39_]);
						}
						if (class376_sub7_sub5_sub5 != null) {
							Class39 class39 = class376_sub7_sub5_sub5
									.method3960(21816);
							if (((Class39) class39).anIntArrayArray564 != null
									&& (((Class39) class39).anIntArrayArray564[i_26_]) != null)
								i_32_ -= (((Class39) class39).anIntArrayArray564[i_26_][1]);
							if (((Class39) class39).anIntArrayArray529 != null
									&& (((Class39) class39).anIntArrayArray529[i_26_]) != null)
								i_32_ -= (((Class39) class39).anIntArrayArray529[i_26_][1]);
						}
					}
					Class376_Sub7_Sub5_Sub2 class376_sub7_sub5_sub2 = (new Class376_Sub7_Sub5_Sub2(
							i_31_, Class222.anInt3048, Class222.anInt3048,
							i_22_, i_23_, i_32_, Class11_Sub25.anInt6279
									+ i_34_, i_35_ - -Class11_Sub25.anInt6279,
							i_36_, i_37_, i_29_, i_30_, i_33_, bool, i_26_));
					class376_sub7_sub5_sub2.method3903(
							Class318.method1931(80, i_28_, Class222.anInt3048,
									i_27_) - i_33_, i_27_, 0, i_28_,
							Class11_Sub25.anInt6279 + i_34_);
					Class51.aClass84_796.method589((byte) -13,
							new Class11_Sub45_Sub17(class376_sub7_sub5_sub2));
				}
			} else if (Class237.aClass83_3238 == class83) {
				int i_40_ = Class3.packetStream.readUnsigned128Byte(true);
				int i_41_ = i_40_ >> 2;
				int i_42_ = 0x3 & i_40_;
				int i_43_ = Class361.anIntArray4698[i_41_];
				int i_44_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_45_ = Class122.anInt1659 - -(0x7 & i_44_ >> 4);
				int i_46_ = Class225_Sub1.anInt5009 - -(0x7 & i_44_);
				if (Class228.method1474(0, Class141.anInt1915)
						|| (i_45_ >= 0
								&& i_46_ >= 0
								&& (i_45_ ^ 0xffffffff) > (Class300.anInt4051 ^ 0xffffffff) && (i_46_ ^ 0xffffffff) > (Class108_Sub12.anInt6228 ^ 0xffffffff)))
					Class11_Sub12_Sub3
							.method3600(i_41_, -1, i_45_, i_46_, i_42_,
									(byte) 123, Class222.anInt3048, i_43_, -1,
									0);
			} else if (Class376_Sub7_Sub4_Sub1.aClass83_9942 == class83) {
				int i_47_ = Class3.packetStream.readUnsignedShort((byte) -65);
				int i_48_ = Class3.packetStream.readUnsignedByte128(7925);
				int i_49_ = (i_48_ & 0x7) + Class225_Sub1.anInt5009;
				int i_50_ = i_49_ + Class118.anInt1605;
				int i_51_ = Class122.anInt1659 - -(0x7 & i_48_ >> 4);
				int i_52_ = Class194.anInt2641 - -i_51_;
				int i_53_ = Class3.packetStream.readUnsignedShortLE128(125);
				boolean bool = ((i_51_ ^ 0xffffffff) <= -1 && i_49_ >= 0
						&& Class300.anInt4051 > i_51_ && i_49_ < Class108_Sub12.anInt6228);
				if (bool
						|| Class228.method1474(i ^ 0xffffffff,
								Class141.anInt1915)) {
					Class108_Sub23.method3130((byte) -117, new Class11_Sub36(
							i_53_, i_47_), Class222.anInt3048, i_52_, i_50_);
					if (bool)
						Class295.method1830(i_49_, i_51_, i - 10614,
								Class222.anInt3048);
				}
			} else if (Class64.aClass83_927 == class83) {
				int i_54_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_55_ = (i_54_ >> 4 & 0x7) + Class122.anInt1659;
				int i_56_ = Class225_Sub1.anInt5009 - -(i_54_ & 0x7);
				int i_57_ = Class3.packetStream.readUnsignedShort((byte) -65);
				if (i_57_ == 65535)
					i_57_ = -1;
				int i_58_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_59_ = 0xf & i_58_ >> 4;
				int i_60_ = 0x7 & i_58_;
				int i_61_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_62_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_63_ = Class3.packetStream.readUnsignedShort((byte) -65);
				if ((i_55_ ^ 0xffffffff) <= -1 && (i_56_ ^ 0xffffffff) <= -1
						&& i_55_ < Class300.anInt4051
						&& Class108_Sub12.anInt6228 > i_56_) {
					int i_64_ = i_59_ + 1;
					if (((-i_64_ + i_55_ ^ 0xffffffff) >= ((((Actor) (Class11_Sub2_Sub8.myPlayer)).anIntArray10370[0]) ^ 0xffffffff))
							&& ((((Actor) (Class11_Sub2_Sub8.myPlayer)).anIntArray10370[0]) ^ 0xffffffff) >= (i_55_
									- -i_64_ ^ 0xffffffff)
							&& (((Actor) (Class11_Sub2_Sub8.myPlayer)).anIntArray10376[0]) >= -i_64_
									+ i_56_
							&& ((i_64_ + i_56_ ^ 0xffffffff) <= ((((Actor) (Class11_Sub2_Sub8.myPlayer)).anIntArray10376[0]) ^ 0xffffffff)))
						Class108_Sub13.method2655((byte) 1,
								((i_56_ << 8) + (Class222.anInt3048 << 24)
										+ (i_55_ << 16) + i_59_), i_62_, i_57_,
								i_61_, i_63_, i_60_);
				}
			} else if (Class55.aClass83_835 == class83) {
				int i_65_ = Class3.packetStream.readUnsignedByte((byte) 35);
				boolean bool = (0x80 & i_65_) != 0;
				int i_66_ = Class122.anInt1659 - -(i_65_ >> 3 & 0x7);
				int i_67_ = Class225_Sub1.anInt5009 - -(0x7 & i_65_);
				int i_68_ = (i_66_ + Class3.packetStream.readByte(1854307120));
				int i_69_ = (Class3.packetStream.readByte(i ^ ~0x6e867b30) + i_67_);
				int i_70_ = Class3.packetStream.method2508((byte) 25);
				int i_71_ = Class3.packetStream.readUnsignedShort((byte) -65);
				int i_72_ = Class3.packetStream.readUnsignedByte((byte) 35) * 4;
				int i_73_ = 4 * Class3.packetStream.readUnsignedByte((byte) 35);
				int i_74_ = Class3.packetStream.readUnsignedShort((byte) -65);
				int i_75_ = Class3.packetStream.readUnsignedShort((byte) -65);
				int i_76_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_77_ = Class3.packetStream.readUnsignedShort((byte) -65);
				if ((i_76_ ^ 0xffffffff) == -256)
					i_76_ = -1;
				if (i_66_ >= 0
						&& (i_67_ ^ 0xffffffff) <= -1
						&& Class300.anInt4051 > i_66_
						&& i_67_ < Class108_Sub12.anInt6228
						&& (i_68_ ^ 0xffffffff) <= -1
						&& i_69_ >= 0
						&& (i_68_ ^ 0xffffffff) > (Class300.anInt4051 ^ 0xffffffff)
						&& Class108_Sub12.anInt6228 > i_69_
						&& (i_71_ ^ 0xffffffff) != -65536) {
					i_77_ <<= 2;
					i_67_ = 256 + i_67_ * 512;
					i_73_ <<= 2;
					i_66_ = i_66_ * 512 + 256;
					i_69_ = 256 + i_69_ * 512;
					i_72_ <<= 2;
					i_68_ = 256 + 512 * i_68_;
					Class376_Sub7_Sub5_Sub2 class376_sub7_sub5_sub2 = (new Class376_Sub7_Sub5_Sub2(
							i_71_, Class222.anInt3048, Class222.anInt3048,
							i_66_, i_67_, i_72_, i_74_
									+ Class11_Sub25.anInt6279, i_75_
									+ Class11_Sub25.anInt6279, i_76_, i_77_, 0,
							i_70_, i_73_, bool, -1));
					class376_sub7_sub5_sub2.method3903(
							-i_73_
									+ Class318.method1931(i + 88, i_69_,
											Class222.anInt3048, i_68_), i_68_,
							0, i_69_, i_74_ - -Class11_Sub25.anInt6279);
					Class51.aClass84_796.method589((byte) -13,
							new Class11_Sub45_Sub17(class376_sub7_sub5_sub2));
				}
			} else if (class83 == Class357.aClass83_4665) {
				Class3.packetStream.readUnsignedByte((byte) 35);
				int i_78_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_79_ = ((0x76 & i_78_) >> 4) + Class122.anInt1659;
				int i_80_ = Class225_Sub1.anInt5009 + (0x7 & i_78_);
				int i_81_ = Class3.packetStream.readUnsignedShort((byte) -65);
				int i_82_ = Class3.packetStream.readUnsignedByte((byte) 35);
				int i_83_ = Class3.packetStream.method2558(false);
				String string = Class3.packetStream.readString(-1);
				Class110.method742(i_82_, false, string, i_79_, i_81_,
						Class222.anInt3048, i_80_, i_83_);
			} else if (Class376_Sub1.aClass83_5101 == class83) {
				int i_84_ = Class3.packetStream.readUnsignedShortLE(25651);
				int i_85_ = Class3.packetStream.readUnsignedShortLE(25651);
				int i_86_ = Class3.packetStream.readUnsigned128Byte(true);
				int i_87_ = (i_86_ & 0x7) + Class225_Sub1.anInt5009;
				int i_88_ = Class118.anInt1605 + i_87_;
				int i_89_ = ((i_86_ & 0x74) >> 4) + Class122.anInt1659;
				int i_90_ = Class194.anInt2641 + i_89_;
				int i_91_ = Class3.packetStream.readUnsignedShort128(true);
				if (Class11_Sub44.anInt7791 != i_91_) {
					boolean bool = ((i_89_ ^ 0xffffffff) <= -1 && i_87_ >= 0
							&& i_89_ < Class300.anInt4051 && ((Class108_Sub12.anInt6228 ^ 0xffffffff) < (i_87_ ^ 0xffffffff)));
					if (bool || Class228.method1474(0, Class141.anInt1915)) {
						Class108_Sub23.method3130((byte) -80,
								new Class11_Sub36(i_85_, i_84_),
								Class222.anInt3048, i_90_, i_88_);
						if (bool)
							Class295.method1830(i_87_, i_89_, i ^ 0x2976,
									Class222.anInt3048);
					}
				}
			} else if (class83 == Class243.aClass83_3301) {
				int i_92_ = Class3.packetStream.readUnsignedShort128(true);
				int i_93_ = Class3.packetStream.readUnsigned128Byte(true);
				int i_94_ = Class225_Sub1.anInt5009 + (0x7 & i_93_);
				int i_95_ = i_94_ + Class118.anInt1605;
				int i_96_ = ((i_93_ & 0x79) >> 4) + Class122.anInt1659;
				int i_97_ = i_96_ + Class194.anInt2641;
				Class11_Sub27 class11_sub27 = ((Class11_Sub27) (Class106.aClass213_1433
						.method1369(
								(byte) 26,
								(long) (i_97_ | (i_95_ << 14 | Class222.anInt3048 << 28)))));
				if (class11_sub27 != null) {
					for (Class11_Sub36 class11_sub36 = (Class11_Sub36) ((Class11_Sub27) class11_sub27).aClass84_6554
							.method584(i ^ 0x2fe4); class11_sub36 != null; class11_sub36 = (Class11_Sub36) ((Class11_Sub27) class11_sub27).aClass84_6554
							.method578(i ^ 0x3c00)) {
						if ((((Class11_Sub36) class11_sub36).anInt7081 ^ 0xffffffff) == (i_92_ & 0x7fff ^ 0xffffffff)) {
							class11_sub36.method122(i ^ 0x1b);
							break;
						}
					}
					if (((Class11_Sub27) class11_sub27).aClass84_6554
							.method576((byte) 27))
						class11_sub27.method122(-91);
					if ((i_96_ ^ 0xffffffff) <= -1
							&& (i_94_ ^ 0xffffffff) <= -1
							&& (Class300.anInt4051 ^ 0xffffffff) < (i_96_ ^ 0xffffffff)
							&& Class108_Sub12.anInt6228 > i_94_)
						Class295.method1830(i_94_, i_96_, -10615,
								Class222.anInt3048);
				}
			} else {
				if (i != -1)
					method1881(null, 97);
				if (class83 == Class323.aClass83_4318) {
					int i_98_ = Class3.packetStream.readUnsignedByte((byte) 35);
					int i_99_ = ((0x78 & i_98_) >> 4) + Class122.anInt1659;
					int i_100_ = Class225_Sub1.anInt5009 - -(i_98_ & 0x7);
					int i_101_ = Class3.packetStream
							.readUnsignedShort((byte) -65);
					if ((i_101_ ^ 0xffffffff) == -65536)
						i_101_ = -1;
					int i_102_ = Class3.packetStream
							.readUnsignedByte((byte) 35);
					int i_103_ = (0xf1 & i_102_) >> 4;
					int i_104_ = 0x7 & i_102_;
					int i_105_ = Class3.packetStream
							.readUnsignedByte((byte) 35);
					int i_106_ = Class3.packetStream
							.readUnsignedByte((byte) 35);
					int i_107_ = Class3.packetStream
							.readUnsignedShort((byte) -65);
					if (i_99_ >= 0
							&& i_100_ >= 0
							&& (Class300.anInt4051 ^ 0xffffffff) < (i_99_ ^ 0xffffffff)
							&& i_100_ < Class108_Sub12.anInt6228) {
						int i_108_ = i_103_ + 1;
						if (((((Actor) (Class11_Sub2_Sub8.myPlayer)).anIntArray10370[0]) ^ 0xffffffff) <= (i_99_
								+ -i_108_ ^ 0xffffffff)
								&& ((i_99_ - -i_108_ ^ 0xffffffff) <= ((((Actor) (Class11_Sub2_Sub8.myPlayer)).anIntArray10370[0]) ^ 0xffffffff))
								&& (((((Actor) (Class11_Sub2_Sub8.myPlayer)).anIntArray10376[0]) ^ 0xffffffff) <= (-i_108_
										+ i_100_ ^ 0xffffffff))
								&& ((i_108_ + i_100_ ^ 0xffffffff) <= ((((Actor) (Class11_Sub2_Sub8.myPlayer)).anIntArray10376[0]) ^ 0xffffffff)))
							Class117.method765(
									i_105_,
									-18,
									i_104_,
									false,
									i_103_
											+ ((i_100_ << 8) + (i_99_ << 16) + (Class222.anInt3048 << 24)),
									i_106_, i_101_, i_107_);
					}
				} else if (class83 == Class190.aClass83_2441) {
					int i_109_ = Class3.packetStream.readUnsignedByteC(-6067);
					int i_110_ = ((i_109_ & 0x7d) >> 4) + Class122.anInt1659;
					int i_111_ = (i_109_ & 0x7) + Class225_Sub1.anInt5009;
					int i_112_ = Class3.packetStream
							.readUnsignedByte128(i + 7926);
					int i_113_ = i_112_ >> 2;
					int i_114_ = i_112_ & 0x3;
					int i_115_ = Class361.anIntArray4698[i_113_];
					int i_116_ = Class3.packetStream
							.readUnsignedShortLE(i + 25652);
					if (i_116_ == 65535)
						i_116_ = -1;
					Class11_Sub35.method2847(i_115_, i_111_, false, i_113_,
							i_114_, Class222.anInt3048, i_110_, i_116_);
				} else if (class83 == Class254.aClass83_3496) {
					int i_117_ = Class3.packetStream
							.readUnsignedShort((byte) -65);
					int i_118_ = Class3.packetStream
							.readUnsignedByte((byte) 35);
					Class11_Sub4.aClass290_5237.method1793((byte) 8, i_117_)
							.method373(true, i_118_);
				} else if (Class11_Sub15.aClass83_5610 == class83) {
					int i_119_ = Class3.packetStream
							.readUnsignedShort((byte) -65);
					int i_120_ = Class3.packetStream
							.readUnsignedByteC(i ^ 0x17b2);
					int i_121_ = Class122.anInt1659 + ((0x7b & i_120_) >> 4);
					int i_122_ = Class225_Sub1.anInt5009 + (i_120_ & 0x7);
					int i_123_ = Class3.packetStream
							.readUnsignedByte((byte) 35);
					int i_124_ = i_123_ >> 2;
					int i_125_ = 0x3 & i_123_;
					int i_126_ = Class361.anIntArray4698[i_124_];
					if (Class228.method1474(0, Class141.anInt1915)
							|| (i_121_ >= 0
									&& i_122_ >= 0
									&& ((Class300.anInt4051 ^ 0xffffffff) < (i_121_ ^ 0xffffffff)) && i_122_ < Class108_Sub12.anInt6228))
						Class11_Sub12_Sub3.method3600(i_124_, i_119_, i_121_,
								i_122_, i_125_, (byte) 125, Class222.anInt3048,
								i_126_, -1, 0);
				} else {
					Class11_Sub12_Sub3.method3602((byte) -45,
							"T3 - " + class83, null);
					InputStream_Sub2.method2814(false, -25626);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rq.F("
					+ (class83 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final boolean method1882(Class364[][][] class364s, int i,
			int i_127_, boolean bool, int i_128_, int i_129_) {
		try {
			if (i_129_ != 6721)
				return false;
			anInt4122++;
			byte i_130_ = !bool ? (byte) (Class283.anInt3835 & 0xff) : (byte) 1;
			if ((i_130_ ^ 0xffffffff) == ((Class1_Sub1.aByteArrayArrayArray7130[Class376_Sub7_Sub2.anInt9242][i_127_][i]) ^ 0xffffffff))
				return false;
			if (((Class11_Sub45_Sub17.aByteArrayArrayArray9509[Class376_Sub7_Sub2.anInt9242][i_127_][i]) & 0x4) == 0)
				return false;
			int i_131_ = 0;
			int i_132_ = 0;
			Class27.anIntArray358[i_131_] = i_127_;
			Class246.anIntArray3328[i_131_++] = i;
			Class1_Sub1.aByteArrayArrayArray7130[Class376_Sub7_Sub2.anInt9242][i_127_][i] = i_130_;
			while ((i_131_ ^ 0xffffffff) != (i_132_ ^ 0xffffffff)) {
				int i_133_ = Class27.anIntArray358[i_132_] & 0xffff;
				int i_134_ = (0xffab82 & Class27.anIntArray358[i_132_]) >> 16;
				int i_135_ = 0xff & Class27.anIntArray358[i_132_] >> 24;
				int i_136_ = Class246.anIntArray3328[i_132_] & 0xffff;
				int i_137_ = (0xffbd68 & Class246.anIntArray3328[i_132_]) >> 16;
				i_132_ = i_132_ + 1 & 0xfff;
				boolean bool_138_ = false;
				if ((0x4 & (Class11_Sub45_Sub17.aByteArrayArrayArray9509[Class376_Sub7_Sub2.anInt9242][i_133_][i_136_]) ^ 0xffffffff) == -1)
					bool_138_ = true;
				boolean bool_139_ = false;
				if (class364s != null) {
					int i_140_ = 1 + Class376_Sub7_Sub2.anInt9242;
					while_1_: for (/**/; i_140_ <= 3; i_140_++) {
						if (class364s[i_140_] != null
								&& (0x8 & (Class11_Sub45_Sub17.aByteArrayArrayArray9509[i_140_][i_133_][i_136_]) ^ 0xffffffff) == -1) {
							if (bool_138_
									&& class364s[i_140_][i_133_][i_136_] != null) {
								if ((((Class364) class364s[i_140_][i_133_][i_136_]).aClass376_Sub7_Sub3_4780) != null) {
									int i_141_ = Class2.method66(-86, i_134_);
									if ((((Class376_Sub7_Sub3) (((Class364) class364s[i_140_][i_133_][i_136_]).aClass376_Sub7_Sub3_4780)).aShort9274) == i_141_
											|| ((((Class364) (class364s[i_140_][i_133_][i_136_])).aClass376_Sub7_Sub3_4776) != null && (i_141_ == (((Class376_Sub7_Sub3) (((Class364) (class364s[i_140_][i_133_][i_136_])).aClass376_Sub7_Sub3_4776)).aShort9274))))
										continue;
									if ((i_135_ ^ 0xffffffff) != -1) {
										int i_142_ = Class2
												.method66(69, i_135_);
										if (((i_142_ ^ 0xffffffff) == ((((Class376_Sub7_Sub3) (((Class364) (class364s[i_140_][i_133_][i_136_])).aClass376_Sub7_Sub3_4780)).aShort9274) ^ 0xffffffff))
												|| (((((Class364) (class364s[i_140_][i_133_][i_136_])).aClass376_Sub7_Sub3_4776) != null) && (i_142_ == (((Class376_Sub7_Sub3) (((Class364) (class364s[i_140_][i_133_][i_136_])).aClass376_Sub7_Sub3_4776)).aShort9274))))
											continue;
									}
									if (i_137_ != 0) {
										int i_143_ = Class2.method66(109,
												i_137_);
										if ((((((Class376_Sub7_Sub3) (((Class364) (class364s[i_140_][i_133_][i_136_])).aClass376_Sub7_Sub3_4780)).aShort9274) ^ 0xffffffff) == (i_143_ ^ 0xffffffff))
												|| (((((Class364) (class364s[i_140_][i_133_][i_136_])).aClass376_Sub7_Sub3_4776) != null) && (((Class376_Sub7_Sub3) (((Class364) (class364s[i_140_][i_133_][i_136_])).aClass376_Sub7_Sub3_4776)).aShort9274) == i_143_))
											continue;
									}
								}
								Class364 class364 = class364s[i_140_][i_133_][i_136_];
								if (((Class364) class364).aClass140_4781 != null) {
									for (Class140 class140 = (((Class364) class364).aClass140_4781); class140 != null; class140 = (((Class140) class140).aClass140_1895)) {
										Class376_Sub7_Sub5 class376_sub7_sub5 = (((Class140) class140).aClass376_Sub7_Sub5_1896);
										if (class376_sub7_sub5 instanceof Interface13) {
											Interface13 interface13 = ((Interface13) class376_sub7_sub5);
											int i_144_ = interface13
													.method29((byte) -10);
											int i_145_ = interface13
													.method30(30374);
											if (i_144_ == 21)
												i_144_ = 19;
											int i_146_ = i_145_ << 6 | i_144_;
											if (i_146_ == i_134_
													|| (i_135_ != 0 && ((i_135_ ^ 0xffffffff) == (i_146_ ^ 0xffffffff)))
													|| ((i_137_ ^ 0xffffffff) != -1 && i_146_ == i_137_))
												continue while_1_;
										}
									}
								}
							}
							Class364 class364 = class364s[i_140_][i_133_][i_136_];
							if (class364 != null
									&& (((Class364) class364).aClass140_4781 != null)) {
								for (Class140 class140 = (((Class364) class364).aClass140_4781); class140 != null; class140 = (((Class140) class140).aClass140_1895)) {
									Class376_Sub7_Sub5 class376_sub7_sub5 = (((Class140) class140).aClass376_Sub7_Sub5_1896);
									if (((((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9624 ^ 0xffffffff) != (((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9626 ^ 0xffffffff))
											|| (((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9629 != (((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9620))) {
										for (int i_147_ = (((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9626); (((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9624 >= i_147_); i_147_++) {
											for (int i_148_ = (((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9629); ((((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9620) >= i_148_); i_148_++)
												Class1_Sub1.aByteArrayArrayArray7130[i_140_][i_147_][i_148_] = i_130_;
										}
									}
								}
							}
							bool_139_ = true;
							Class1_Sub1.aByteArrayArrayArray7130[i_140_][i_133_][i_136_] = i_130_;
						}
					}
				}
				if (bool_139_) {
					int i_149_ = Class315.aClass12Array4179[Class376_Sub7_Sub2.anInt9242 + 1]
							.method131((byte) 125, i_136_, i_133_);
					if (i_149_ > Class234.anIntArray3208[i_128_])
						Class234.anIntArray3208[i_128_] = i_149_;
					int i_150_ = i_133_ << 9;
					if ((i_150_ ^ 0xffffffff) > (Class151.anIntArray2008[i_128_] ^ 0xffffffff))
						Class151.anIntArray2008[i_128_] = i_150_;
					else if ((Class11_Sub20_Sub2.anIntArray9503[i_128_] ^ 0xffffffff) > (i_150_ ^ 0xffffffff))
						Class11_Sub20_Sub2.anIntArray9503[i_128_] = i_150_;
					int i_151_ = i_136_ << 9;
					if (i_151_ < Class360.anIntArray4696[i_128_])
						Class360.anIntArray4696[i_128_] = i_151_;
					else if (i_151_ > Class221.anIntArray3040[i_128_])
						Class221.anIntArray3040[i_128_] = i_151_;
				}
				if (!bool_138_) {
					if (i_133_ >= 1
							&& ((i_130_ ^ 0xffffffff) != ((Class1_Sub1.aByteArrayArrayArray7130[Class376_Sub7_Sub2.anInt9242][i_133_ - 1][i_136_]) ^ 0xffffffff))) {
						Class27.anIntArray358[i_131_] = (Class173.method1134(
								-754974720,
								Class173.method1134(-1 + i_133_, 1179648)));
						Class246.anIntArray3328[i_131_] = Class173.method1134(
								1245184, i_136_);
						i_131_ = 1 + i_131_ & 0xfff;
						Class1_Sub1.aByteArrayArrayArray7130[Class376_Sub7_Sub2.anInt9242][-1
								+ i_133_][i_136_] = i_130_;
					}
					if ((Class108_Sub12.anInt6228 ^ 0xffffffff) < (++i_136_ ^ 0xffffffff)) {
						if (i_133_ - 1 >= 0
								&& ((i_130_ ^ 0xffffffff) != ((Class1_Sub1.aByteArrayArrayArray7130[Class376_Sub7_Sub2.anInt9242][i_133_ - 1][i_136_]) ^ 0xffffffff))
								&& (0x4 & (Class11_Sub45_Sub17.aByteArrayArrayArray9509[Class376_Sub7_Sub2.anInt9242][i_133_][i_136_]) ^ 0xffffffff) == -1
								&& ((Class11_Sub45_Sub17.aByteArrayArrayArray9509[Class376_Sub7_Sub2.anInt9242][i_133_ - 1][-1
										+ i_136_]) & 0x4) == 0) {
							Class27.anIntArray358[i_131_] = (Class173
									.method1134(1375731712, Class173
											.method1134(1179648, i_133_ - 1)));
							Class246.anIntArray3328[i_131_] = Class173
									.method1134(1245184, i_136_);
							i_131_ = 1 + i_131_ & 0xfff;
							Class1_Sub1.aByteArrayArrayArray7130[Class376_Sub7_Sub2.anInt9242][-1
									+ i_133_][i_136_] = i_130_;
						}
						if (((Class1_Sub1.aByteArrayArrayArray7130[Class376_Sub7_Sub2.anInt9242][i_133_][i_136_]) ^ 0xffffffff) != (i_130_ ^ 0xffffffff)) {
							Class27.anIntArray358[i_131_] = (Class173
									.method1134(318767104, Class173.method1134(
											i_133_, 5373952)));
							Class246.anIntArray3328[i_131_] = Class173
									.method1134(i_136_, 5439488);
							Class1_Sub1.aByteArrayArrayArray7130[Class376_Sub7_Sub2.anInt9242][i_133_][i_136_] = i_130_;
							i_131_ = 0xfff & i_131_ + 1;
						}
						if ((1 + i_133_ ^ 0xffffffff) > (Class300.anInt4051 ^ 0xffffffff)
								&& i_130_ != (Class1_Sub1.aByteArrayArrayArray7130[Class376_Sub7_Sub2.anInt9242][i_133_ + 1][i_136_])
								&& ((Class11_Sub45_Sub17.aByteArrayArrayArray9509[Class376_Sub7_Sub2.anInt9242][i_133_][i_136_]) & 0x4) == 0
								&& (0x4 & (Class11_Sub45_Sub17.aByteArrayArrayArray9509[Class376_Sub7_Sub2.anInt9242][1 + i_133_][-1
										+ i_136_]) ^ 0xffffffff) == -1) {
							Class27.anIntArray358[i_131_] = (Class173
									.method1134(Class173.method1134(1 + i_133_,
											5373952), -1845493760));
							Class246.anIntArray3328[i_131_] = Class173
									.method1134(i_136_, 5439488);
							i_131_ = 0xfff & 1 + i_131_;
							Class1_Sub1.aByteArrayArrayArray7130[Class376_Sub7_Sub2.anInt9242][1 + i_133_][i_136_] = i_130_;
						}
					}
					i_136_--;
					if ((i_133_ + 1 ^ 0xffffffff) > (Class300.anInt4051 ^ 0xffffffff)
							&& ((Class1_Sub1.aByteArrayArrayArray7130[Class376_Sub7_Sub2.anInt9242][i_133_ + 1][i_136_]) ^ 0xffffffff) != (i_130_ ^ 0xffffffff)) {
						Class27.anIntArray358[i_131_] = (Class173.method1134(
								Class173.method1134(1 + i_133_, 9568256),
								1392508928));
						Class246.anIntArray3328[i_131_] = Class173.method1134(
								9633792, i_136_);
						i_131_ = i_131_ + 1 & 0xfff;
						Class1_Sub1.aByteArrayArrayArray7130[Class376_Sub7_Sub2.anInt9242][i_133_ + 1][i_136_] = i_130_;
					}
					if (--i_136_ >= 0) {
						if ((i_133_ - 1 ^ 0xffffffff) <= -1
								&& (Class1_Sub1.aByteArrayArrayArray7130[Class376_Sub7_Sub2.anInt9242][-1
										+ i_133_][i_136_]) != i_130_
								&& ((Class11_Sub45_Sub17.aByteArrayArrayArray9509[Class376_Sub7_Sub2.anInt9242][i_133_][i_136_]) & 0x4) == 0
								&& ((Class11_Sub45_Sub17.aByteArrayArrayArray9509[Class376_Sub7_Sub2.anInt9242][-1
										+ i_133_][i_136_ + 1]) & 0x4 ^ 0xffffffff) == -1) {
							Class27.anIntArray358[i_131_] = (Class173
									.method1134(Class173.method1134(13762560,
											i_133_ - 1), 301989888));
							Class246.anIntArray3328[i_131_] = Class173
									.method1134(13828096, i_136_);
							i_131_ = 1 + i_131_ & 0xfff;
							Class1_Sub1.aByteArrayArrayArray7130[Class376_Sub7_Sub2.anInt9242][i_133_ - 1][i_136_] = i_130_;
						}
						if (i_130_ != (Class1_Sub1.aByteArrayArrayArray7130[Class376_Sub7_Sub2.anInt9242][i_133_][i_136_])) {
							Class27.anIntArray358[i_131_] = (Class173
									.method1134(Class173.method1134(13762560,
											i_133_), -1828716544));
							Class246.anIntArray3328[i_131_] = Class173
									.method1134(13828096, i_136_);
							Class1_Sub1.aByteArrayArrayArray7130[Class376_Sub7_Sub2.anInt9242][i_133_][i_136_] = i_130_;
							i_131_ = 0xfff & i_131_ + 1;
						}
						if ((1 + i_133_ ^ 0xffffffff) > (Class300.anInt4051 ^ 0xffffffff)
								&& ((i_130_ ^ 0xffffffff) != ((Class1_Sub1.aByteArrayArrayArray7130[Class376_Sub7_Sub2.anInt9242][i_133_ + 1][i_136_]) ^ 0xffffffff))
								&& ((Class11_Sub45_Sub17.aByteArrayArrayArray9509[Class376_Sub7_Sub2.anInt9242][i_133_][i_136_]) & 0x4) == 0
								&& (0x4 & (Class11_Sub45_Sub17.aByteArrayArrayArray9509[Class376_Sub7_Sub2.anInt9242][i_133_ + 1][i_136_ + 1])) == 0) {
							Class27.anIntArray358[i_131_] = (Class173
									.method1134(Class173.method1134(i_133_ + 1,
											9568256), -771751936));
							Class246.anIntArray3328[i_131_] = Class173
									.method1134(i_136_, 9633792);
							Class1_Sub1.aByteArrayArrayArray7130[Class376_Sub7_Sub2.anInt9242][i_133_ + 1][i_136_] = i_130_;
							i_131_ = 0xfff & 1 + i_131_;
						}
					}
				}
			}
			if ((Class234.anIntArray3208[i_128_] ^ 0xffffffff) != 999999) {
				Class234.anIntArray3208[i_128_] += 40;
				Class151.anIntArray2008[i_128_] -= 512;
				Class11_Sub20_Sub2.anIntArray9503[i_128_] += 512;
				Class221.anIntArray3040[i_128_] += 512;
				Class360.anIntArray4696[i_128_] -= 512;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rq.C("
					+ (class364s != null ? "{...}" : "null") + ',' + i + ','
					+ i_127_ + ',' + bool + ',' + i_128_ + ',' + i_129_ + ')'));
		}
	}

	public final String toString() {
		try {
			anInt4118++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rq.toString(" + ')');
		}
	}

	final int method1883(int i) {
		try {
			anInt4121++;
			int i_152_ = 63 / ((i + 47) / 54);
			return ((Class307) this).anInt4115;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rq.D(" + i + ')');
		}
	}

	Class307(String string, int i) {
		try {
			((Class307) this).anInt4115 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rq.<init>("
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public static void method1884(int i) {
		try {
			if (i == -25086)
				anIntArray4116 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rq.A(" + i + ')');
		}
	}
}
