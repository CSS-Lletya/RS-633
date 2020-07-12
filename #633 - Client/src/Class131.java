/* Class131 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class131 {
	static int anInt1822;
	static int anInt1823;
	static Class146 aClass146_1824;
	static Class146 aClass146_1825;
	static int anInt1826;
	static int anInt1827;
	static int anInt1828;
	static int anInt1829;
	private Class376 aClass376_1830 = new Class376();
	static int anInt1831;
	static int anInt1832;
	static int anInt1833;
	private Class376 aClass376_1834;
	static int[] anIntArray1835 = { 3, 7, 15 };
	static int anInt1836;
	static int anInt1837;

	final Class376 method847(int i) {
		try {
			anInt1828++;
			if (i != -31182)
				method848((byte) 73);
			Class376 class376 = ((Class376) aClass376_1830).aClass376_4909;
			if (class376 == aClass376_1830) {
				aClass376_1834 = null;
				return null;
			}
			aClass376_1834 = ((Class376) class376).aClass376_4909;
			return class376;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eh.I(" + i + ')');
		}
	}

	final int method848(byte i) {
		try {
			if (i != 58)
				return -99;
			anInt1829++;
			int i_0_ = 0;
			for (Class376 class376 = ((Class376) aClass376_1830).aClass376_4909; aClass376_1830 != class376; class376 = ((Class376) class376).aClass376_4909)
				i_0_++;
			return i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eh.J(" + i + ')');
		}
	}

	final Class376 method849(byte i) {
		try {
			anInt1827++;
			Class376 class376 = ((Class376) aClass376_1830).aClass376_4909;
			if (aClass376_1830 == class376)
				return null;
			class376.method2207((byte) -119);
			if (i != -37)
				return null;
			return class376;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eh.C(" + i + ')');
		}
	}

	final void method850(int i) {
		try {
			if (i < -51) {
				for (;;) {
					Class376 class376 = ((Class376) aClass376_1830).aClass376_4909;
					if (class376 == aClass376_1830)
						break;
					class376.method2207((byte) -117);
				}
				anInt1833++;
				aClass376_1834 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eh.A(" + i + ')');
		}
	}

	static final void method851(String string, boolean bool, int i) {
		try {
			anInt1823++;
			string = string.toLowerCase();
			short[] is = new short[16];
			int i_1_ = 0;
			int i_2_ = !bool ? 0 : 32768;
			int i_3_ = ((!bool ? ((Class352) Class11_Sub2_Sub10.aClass352_8851).anInt4626
					: ((Class352) Class11_Sub2_Sub10.aClass352_8851).anInt4629) + i_2_);
			if (i >= -34)
				playerMasksHelper(null, -107, null, (byte) -71, 44);
			for (int i_4_ = i_2_; (i_4_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff); i_4_++) {
				Class11_Sub45_Sub13 class11_sub45_sub13 = Class11_Sub2_Sub10.aClass352_8851
						.method2107(i_4_, false);
				if (((Class11_Sub45_Sub13) class11_sub45_sub13).aBool9300
						&& class11_sub45_sub13.method3626(16584).toLowerCase()
								.indexOf(string) != -1) {
					if (i_1_ >= 50) {
						Class177.aShortArray2249 = null;
						Class10.anInt81 = -1;
						return;
					}
					if ((is.length ^ 0xffffffff) >= (i_1_ ^ 0xffffffff)) {
						short[] is_5_ = new short[2 * is.length];
						for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff); i_6_++)
							is_5_[i_6_] = is[i_6_];
						is = is_5_;
					}
					is[i_1_++] = (short) i_4_;
				}
			}
			Class299.anInt4041 = 0;
			Class177.aShortArray2249 = is;
			Class10.anInt81 = i_1_;
			String[] strings = new String[Class10.anInt81];
			for (int i_7_ = 0; i_7_ < Class10.anInt81; i_7_++)
				strings[i_7_] = Class11_Sub2_Sub10.aClass352_8851.method2107(
						is[i_7_], false).method3626(16584);
			Class352.method2108(strings, Class177.aShortArray2249, (byte) 91);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("eh.E("
					+ (string != null ? "{...}" : "null") + ',' + bool + ','
					+ i + ')'));
		}
	}

	final boolean method852(int i) {
		try {
			anInt1837++;
			if (i != 15)
				anIntArray1835 = null;
			if (aClass376_1830 != ((Class376) aClass376_1830).aClass376_4909)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eh.G(" + i + ')');
		}
	}

	final void method853(int i, Class376 class376) {
		try {
			if (i != 0)
				anIntArray1835 = null;
			if (((Class376) class376).aClass376_4910 != null)
				class376.method2207((byte) -112);
			anInt1822++;
			((Class376) class376).aClass376_4910 = ((Class376) aClass376_1830).aClass376_4910;
			((Class376) class376).aClass376_4909 = aClass376_1830;
			((Class376) ((Class376) class376).aClass376_4910).aClass376_4909 = class376;
			((Class376) ((Class376) class376).aClass376_4909).aClass376_4910 = class376;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("eh.H(" + i + ','
					+ (class376 != null ? "{...}" : "null") + ')'));
		}
	}

	final Class376 method854(int i) {
		try {
			anInt1826++;
			Class376 class376 = ((Class376) aClass376_1830).aClass376_4910;
			if (class376 == aClass376_1830) {
				aClass376_1834 = null;
				return null;
			}
			aClass376_1834 = ((Class376) class376).aClass376_4910;
			if (i != 128)
				method850(-1);
			return class376;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eh.F(" + i + ')');
		}
	}

	static final void playerMasksHelper(Player player,
			int i, Packet str, byte i_8_, int playerIndex) {
		try {
			anInt1832++;
			byte temporaryMovementType = -1;
			if ((i & 0x10 ^ 0xffffffff) != -1) { // 1 animation
				int[] is = new int[4];
				for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -5; i_11_++) {
					is[i_11_] = str
							.readUnsignedShort((byte) -65);
					if ((is[i_11_] ^ 0xffffffff) == -65536)
						is[i_11_] = -1;
				}
				int i_12_ = str.readUnsigned128Byte(true);
				Class11_Sub46_Sub1.method3468(-1, is, i_12_,
						player);
			}
			if ((i & 0x100) != 0) { // 2 gfx 2
				int i_13_ = str.readUnsignedShortLE128(123);
				if ((i_13_ ^ 0xffffffff) == -65536)
					i_13_ = -1;
				int i_14_ = str.readIntV1(27326);
				int i_15_ = str.readUnsignedByte128(7925);
				int i_16_ = 0x7 & i_15_;
				int i_17_ = (i_15_ & 0x78) >> 3;
				if (i_17_ == 15)
					i_17_ = -1;
				player.sendGraphics(i_13_, i_17_, true,
						(byte) 114, i_14_, i_16_);
			}
			if ((i & 0x10000 ^ 0xffffffff) != -1) { // 3
				((Actor) player).aByte10323 = str
						.readByte(1854307120);
				((Actor) player).aByte10275 = str
						.readByteC(0);
				((Actor) player).aByte10358 = str
						.readByte(1854307120);
				((Actor) player).aByte10332 = (byte) str
						.readUnsignedByteC(-6067);
				((Actor) player).anInt10360 = (Class11_Sub25.anInt6279 + str
						.readUnsignedShort((byte) -65));
				((Actor) player).anInt10344 = (Class11_Sub25.anInt6279 + str
						.readUnsignedShortLE(25651));
			}
			if ((0x4 & i ^ 0xffffffff) != -1) { // 4
				int i_18_ = str.readUnsignedShort128(true);
				if ((i_18_ ^ 0xffffffff) == -65536)
					i_18_ = -1;
				((Actor) player).faceEntity = i_18_;
			}
			if ((i & 0x400 ^ 0xffffffff) != -1) // 5 
				((Player) player).aBool10420 = (str
						.readUnsigned128Byte(true) ^ 0xffffffff) == -2;
			if ((i & 0x80) != 0) { // 6 face coords
				((Player) player).anInt10401 = str
						.readUnsignedShortLE128(125);
				if (((((Actor) player).anInt10375) ^ 0xffffffff) == -1) {
					player.method3953(8192,
							((Player) player).anInt10401);
					((Player) player).anInt10401 = -1;
				}
			}
			if ((0x200 & i) != 0) {// 7
				((Actor) player).anInt10333 = str
						.method2515((byte) -14);
				((Actor) player).anInt10341 = str
						.readByte(1854307120);
				((Actor) player).anInt10308 = str
						.read128Byte(-125);
				((Actor) player).anInt10328 = str
						.method2515((byte) -14);
				((Actor) player).anInt10315 = (str
						.readUnsignedShort((byte) -65) + Class11_Sub25.anInt6279);
				((Actor) player).anInt10330 = (str
						.readUnsignedShort128(true) + Class11_Sub25.anInt6279);
				((Actor) player).anInt10294 = str
						.readUnsignedByte((byte) 35);
				if (!((Player) player).aBool10393) {
					((Actor) player).anInt10333 += ((Actor) player).anIntArray10370[0];
					((Actor) player).anInt10341 += ((Actor) player).anIntArray10376[0];
					((Actor) player).anInt10328 += ((Actor) player).anIntArray10376[0];
					((Actor) player).anInt10375 = 1;
					((Actor) player).anInt10308 += ((Actor) player).anIntArray10370[0];
				} else {
					((Actor) player).anInt10333 += ((Player) player).anInt10424;
					((Actor) player).anInt10308 += ((Player) player).anInt10424;
					((Actor) player).anInt10375 = 0;
					((Actor) player).anInt10328 += ((Player) player).anInt10402;
					((Actor) player).anInt10341 += ((Player) player).anInt10402;
				}
				((Actor) player).anInt10368 = 0;
			}
			if ((0x8 & i) != 0) { // player app 8
				int i_19_ = str.readUnsigned128Byte(true);
				byte[] is = new byte[i_19_];
				Stream stream = new Stream(is);
				str.readBytes(is, 4, i_19_, 0);
				Class70.cachedAppearances[playerIndex] = stream;
				player.readAppearance(stream, 119);
			}
			if ((0x1 & i) != 0) // 9
				Class206.movementTypes[playerIndex] = str
						.readByteC(0);
			if ((i & 0x40000 ^ 0xffffffff) != -1) { // 10
				int i_20_ = str.readUnsignedByteC(-6067);
				int[] is = new int[i_20_];
				int[] is_21_ = new int[i_20_];
				for (int i_22_ = 0; i_20_ > i_22_; i_22_++) {
					int i_23_ = str.readUnsignedShort128(true);
					if ((i_23_ & 0xc000 ^ 0xffffffff) != -49153)
						is[i_22_] = i_23_;
					else {
						int i_24_ = str
								.readUnsignedShort((byte) -65);
						is[i_22_] = Class173.method1134(i_23_ << 16, i_24_);
					}
					is_21_[i_22_] = str.readUnsignedShort128(true);
				}
				player.method3963(0, is, is_21_);
			}
			if ((i & 0x20 ^ 0xffffffff) != -1) { // 11
				int i_25_ = str.readSmart(-71);
				int i_26_ = str.readUnsignedByteC(-6067);
				player.method3965(0,
						Class11_Sub25.anInt6279, i_25_, i_26_);
				((Actor) player).anInt10355 = 300 + Class11_Sub25.anInt6279;
				((Actor) player).anInt10348 = str
						.readUnsignedByteC(-6067);
			}
			if ((0x1000 & i) != 0) { // 12
				int i_27_ = str.readUnsignedShort((byte) -65);
				((Actor) player).anInt10336 = str
						.readUnsignedByte((byte) 35);
				((Actor) player).anInt10365 = str
						.readUnsigned128Byte(true);
				((Actor) player).anInt10339 = i_27_ & 0x7fff;
				((Actor) player).aBool10287 = (i_27_ & 0x8000) != 0;
				((Actor) player).anInt10359 = (((Actor) player).anInt10336 + (((Actor) player).anInt10339 + Class11_Sub25.anInt6279));
			}
			if ((0x40 & i) != 0) { // 13 gfx1
				int gfxId = str.readUnsignedShortLE128(126);
				int i_29_ = str.readIntV2((byte) -85);
				if ((gfxId ^ 0xffffffff) == -65536)
					gfxId = -1;
				int i_30_ = str.readUnsigned128Byte(true);
				int i_31_ = i_30_ & 0x7;
				int i_32_ = (0x7c & i_30_) >> 3;
				if (i_32_ == 15)
					i_32_ = -1;
				player.sendGraphics(gfxId, i_32_, false,
						(byte) 114, i_29_, i_31_);
			}
			if ((i & 0x20000 ^ 0xffffffff) != -1) { // 14
				int i_33_ = Class11_Sub25.anInt6279;
				int i_34_ = str.readSmart(7);
				int i_35_ = str.readUnsignedByteC(-6067);
				player.method3965(0, i_33_, i_34_, i_35_);
			}
			if ((0x8000 & i) != 0) // 15
				temporaryMovementType = str.readByteC(0);
			if ((i & 0x2000) != 0) {
				((Actor) player).aString10298 = str
						.readString(-1);
				if (((Actor) player).aString10298
						.charAt(0) == '~') {
					((Actor) player).aString10298 = ((Actor) player).aString10298
							.substring(1);
					Class300.method1852(
							-97,
							((Actor) player).aString10298,
							player
									.method3970(true, false),
							0,
							((Player) player).aString10408,
							player.method3981(-47, true),
							2);
				} else if (Class11_Sub2_Sub8.myPlayer == player)
					Class300.method1852(
							-82,
							((Actor) player).aString10298,
							player
									.method3970(true, false),
							0,
							((Player) player).aString10408,
							player.method3981(-69, true),
							2);
				((Actor) player).anInt10296 = 0;
				((Actor) player).anInt10279 = 0;
				((Actor) player).anInt10285 = 150;
			}
			if ((i & 0x800) != 0) {
				int i_36_ = str.readUnsignedByte128(7925);
				int[] is = new int[i_36_];
				int[] is_37_ = new int[i_36_];
				int[] is_38_ = new int[i_36_];
				for (int i_39_ = 0; i_39_ < i_36_; i_39_++) {
					int i_40_ = str.readUnsignedShort128(true);
					if (i_40_ == 65535)
						i_40_ = -1;
					is[i_39_] = i_40_;
					is_37_[i_39_] = str.readUnsignedByteC(-6067);
					is_38_[i_39_] = str
							.readUnsignedShortLE128(123);
				}
				Class108_Sub10.method2615(74, is, is_38_,
						player, is_37_);
			}
			if (((Player) player).aBool10393) {
				if ((temporaryMovementType ^ 0xffffffff) == -128)
					player.method3973(
							((Player) player).anInt10402,
							(byte) -17,
							((Player) player).anInt10424);
				else {
					byte i_41_;
					if ((temporaryMovementType ^ 0xffffffff) == 0)
						i_41_ = Class206.movementTypes[playerIndex];
					else
						i_41_ = temporaryMovementType;
					Class251_Sub2.method2379(i_41_,
							player, -1);
					player.method3971(false,
							((Player) player).anInt10424,
							((Player) player).anInt10402,
							i_41_);
				}
			}
			int i_42_ = -5 % ((-28 - i_8_) / 37);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("eh.B("
					+ (player != null ? "{...}" : "null")
					+ ',' + i + ','
					+ (str != null ? "{...}" : "null") + ','
					+ i_8_ + ',' + playerIndex + ')'));
		}
	}

	final Class376 method856(int i) {
		try {
			anInt1831++;
			Class376 class376 = aClass376_1834;
			if (aClass376_1830 == class376) {
				aClass376_1834 = null;
				return null;
			}
			if (i <= 21)
				playerMasksHelper(null, -102, null, (byte) -64, 41);
			aClass376_1834 = ((Class376) class376).aClass376_4909;
			return class376;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eh.K(" + i + ')');
		}
	}

	public static void method857(int i) {
		do {
			try {
				aClass146_1825 = null;
				anIntArray1835 = null;
				aClass146_1824 = null;
				if (i == 0)
					break;
				aClass146_1824 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "eh.D(" + i + ')');
			}
			break;
		} while (false);
	}

	public Class131() {
		try {
			((Class376) aClass376_1830).aClass376_4910 = aClass376_1830;
			((Class376) aClass376_1830).aClass376_4909 = aClass376_1830;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eh.<init>(" + ')');
		}
	}
}
