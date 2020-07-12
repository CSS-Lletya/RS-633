/* Class376_Sub7_Sub5_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Player extends Actor {
	static int anInt10379;
	static int anInt10380;
	boolean aBool10381;
	boolean aBool10382 = false;
	int anInt10383 = 0;
	static int anInt10384;
	int anInt10385;
	static int anInt10386;
	static int anInt10387;
	static int anInt10388;
	int anInt10389 = 0;
	static int anInt10390;
	static int anInt10391;
	int anInt10392;
	boolean aBool10393 = false;
	int anInt10394;
	private byte genderId;
	private int anInt10396;
	static int anInt10397;
	int anInt10398;
	static int anInt10399;
	String aString10400;
	int anInt10401;
	int anInt10402;
	int anInt10403;
	static int anInt10404;
	private byte aByte10405;
	boolean hasDisplayName;
	static int anInt10407;
	String aString10408;
	int anInt10409;
	int anInt10410;
	static int anInt10411;
	static int anInt10412;
	static int anInt10413;
	int anInt10414;
	static int anInt10415;
	static int anInt10416;
	int anInt10417;
	Class258 aClass258_10418;
	static int anInt10419;
	boolean aBool10420;
	static int[] anIntArray10421;
	int anInt10422;
	static int anInt10423;
	int anInt10424;
	static int anInt10425 = 100;
	static int anInt10426;
	static int anInt10427;
	int anInt10428;
	static int anInt10429;
	static int anInt10430;
	private byte aByte10431;

	final String method3970(boolean bool, boolean bool_0_) {
		try {
			if (bool != true)
				return null;
			anInt10399++;
			if (!bool_0_)
				return aString10400;
			return aString10408;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kd.F(" + bool + ','
					+ bool_0_ + ')');
		}
	}

	final boolean method2862(int i) {
		try {
			anInt10404++;
			if (i > -103)
				anInt10409 = 81;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kd.W(" + i + ')');
		}
	}

	final void method3971(boolean bool, int i, int i_1_, byte i_2_) {
		try {
			if (bool != false)
				anInt10428 = -36;
			anInt10386++;
			if (((Actor) this).anInt10352 != -1
					&& ((Class281) (Class108_Sub23.aClass198_7760.method1284(
							((Actor) this).anInt10352,
							(byte) -55))).anInt3807 == 1) {
				((Actor) this).anInt10352 = -1;
				((Actor) this).anIntArray10272 = null;
			}
			if (((Actor) this).anInt10289 != -1) {
				Class224 class224 = (Class254.aClass227_3495
						.method1465(
								((Actor) this).anInt10289,
								(byte) 104));
				if (((Class224) class224).aBool3073
						&& (((Class224) class224).anInt3079 ^ 0xffffffff) != 0
						&& (((Class281) Class108_Sub23.aClass198_7760
								.method1284((((Class224) class224).anInt3079),
										(byte) -127)).anInt3807) == 1)
					((Actor) this).anInt10289 = -1;
			}
			if ((((Actor) this).anInt10338 ^ 0xffffffff) != 0) {
				Class224 class224 = (Class254.aClass227_3495.method1465(
						((Actor) this).anInt10338,
						(byte) -120));
				if (((Class224) class224).aBool3073
						&& ((Class224) class224).anInt3079 != -1
						&& (((Class281) Class108_Sub23.aClass198_7760
								.method1284((((Class224) class224).anInt3079),
										(byte) 86)).anInt3807) == 1)
					((Actor) this).anInt10338 = -1;
			}
			anInt10401 = -1;
			if (i >= 0 && Class300.anInt4051 > i && (i_1_ ^ 0xffffffff) <= -1
					&& Class108_Sub12.anInt6228 > i_1_) {
				if ((((Actor) this).anIntArray10370[0] ^ 0xffffffff) > -1
						|| (((Actor) this).anIntArray10370[0] ^ 0xffffffff) <= (Class300.anInt4051 ^ 0xffffffff)
						|| ((Actor) this).anIntArray10376[0] < 0
						|| (((Actor) this).anIntArray10376[0] >= Class108_Sub12.anInt6228))
					method3973(i_1_, (byte) -57, i);
				else {
					if ((i_2_ ^ 0xffffffff) == -3)
						Class2_Sub9.method2943(i, (byte) 2, this, -8958, i_1_);
					method3977(i_1_, i_2_, -111, i);
				}
			} else
				method3973(i_1_, (byte) 85, i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kd.H(" + bool + ','
					+ i + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method3972(int i, Class11_Sub10 class11_sub10, int i_3_,
			int i_4_, int i_5_) {
		do {
			try {
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeInt(-49, i_5_);
				anInt10413++;
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeShortLE128((byte) 52, i);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeShortLE128((byte) 99, i_3_);
				if (i_4_ == 2)
					break;
				method3976(24, 50, 110, 19, 34, 41, -60, -47, -13);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("kd.B(" + i + ','
						+ (class11_sub10 != null ? "{...}" : "null") + ','
						+ i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
			}
			break;
		} while (false);
	}

	final boolean method2873(Class163 class163, int i, int i_6_, int i_7_) {
		try {
			anInt10391++;
			if (aClass258_10418 == null || !method3982(131072, class163, true))
				return false;
			Class33 class33 = class163.method1048();
			int i_8_ = ((Actor) this).aClass173_10278
					.method1140(-1);
			class33.method298(i_8_);
			class33.method299(((Class376_Sub7) this).anInt7045,
					((Class376_Sub7) this).anInt7036,
					((Class376_Sub7) this).anInt7031);
			boolean bool = false;
			for (int i_9_ = i; (((Actor) this).aClass206Array10371.length > i_9_); i_9_++) {
				if ((((Actor) this).aClass206Array10371[i_9_] != null)
						&& (!Class11_Sub45_Sub1.aBool8490 ? ((Actor) this).aClass206Array10371[i_9_]
								.method1309(i_7_, i_6_, class33, true, 0)
								: (((Actor) this).aClass206Array10371[i_9_]
										.method1305(i_7_, i_6_, class33, true,
												0, Class117.anInt1597)))) {
					bool = true;
					break;
				}
			}
			((Actor) this).aClass206Array10371[0] = ((Actor) this).aClass206Array10371[1] = ((Actor) this).aClass206Array10371[2] = null;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kd.M("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_6_ + ',' + i_7_ + ')'));
		}
	}

	final void method2874(byte i, Class163 class163) {
		try {
			int i_10_ = 107 / ((i - 18) / 40);
			anInt10388++;
			if (aClass258_10418 != null
					&& (((Actor) this).aBool10377 || method3982(
							0, class163, true))) {
				Class33 class33 = class163.method1048();
				class33.method298(((Actor) this).aClass173_10278
						.method1140(-1));
				class33.method299(((Class376_Sub7) this).anInt7045, -5
						+ ((Class376_Sub7) this).anInt7036,
						((Class376_Sub7) this).anInt7031);
				this.method3962(true, class33, class163,
						(((Actor) this).aClass206Array10371),
						((Actor) this).aBool10377);
				((Actor) this).aClass206Array10371[0] = ((Actor) this).aClass206Array10371[1] = ((Actor) this).aClass206Array10371[2] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kd.K(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3973(int i, byte i_11_, int i_12_) {
		do {
			try {
				anInt10427++;
				((Actor) this).anInt10373 = 0;
				((Actor) this).anInt10375 = 0;
				((Actor) this).anInt10368 = 0;
				((Actor) this).anIntArray10370[0] = i_12_;
				((Actor) this).anIntArray10376[0] = i;
				int i_13_ = method3968((byte) 127);
				((Class376_Sub7) this).anInt7031 = 256 * i_13_
						+ (((Actor) this).anIntArray10376[0])
						* 512;
				((Class376_Sub7) this).anInt7045 = i_13_ * 256 + 512
						* (((Actor) this).anIntArray10370[0]);
				if (Class11_Sub2_Sub8.myPlayer == this)
					Class376_Sub1.method2276(16711680);
				int i_14_ = 20 % ((i_11_ - 32) / 48);
				if (((Actor) this).aClass376_Sub10_10369 == null)
					break;
				((Actor) this).aClass376_Sub10_10369
						.method3167();
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("kd.E(" + i + ','
						+ i_11_ + ',' + i_12_ + ')'));
			}
			break;
		} while (false);
	}

	final void readAppearance(Stream stream, int i) {
		do {
			try {
				stream.position = 0;
				anInt10415++;
				int hash = stream.readUnsignedByte((byte) 35);
				genderId = (byte) (0x1 & hash);
				boolean bool = hasDisplayName;
				hasDisplayName = (hash & 0x2 ^ 0xffffffff) != -1;
				boolean bool_16_ = (0x4 & hash) != 0;
				int i_17_ = super.method3968((byte) 127);
				this.method3954(-84, 1 + ((0x3d & hash) >> 3));
				aByte10431 = (byte) ((hash & 0xe1) >> 6);
				((Class376_Sub7) this).anInt7045 += -i_17_
						+ method3968((byte) 127) << 8;
				((Class376_Sub7) this).anInt7031 += -i_17_
						+ method3968((byte) 127) << 8;
				aByte10405 = stream.readByte(1854307120);
				anInt10398 = stream.readByte(1854307120);
				anInt10414 = stream.readByte(1854307120);
				aBool10382 = (stream.readByte(1854307120) ^ 0xffffffff) == -2;
				if ((Class11_Sub2_Sub24.aClass347_9284 == Class362.aClass347_4711)
						&& Class256_Sub2.anInt7713 >= 2)
					aBool10382 = false;
				int npcId = -1;
				anInt10422 = 0;
				int[] equipIds = new int[12];
				for (int i_19_ = 0; i_19_ < 12; i_19_++) {
					int i_20_ = stream.readUnsignedByte((byte) 35);
					if (i_20_ == 0)
						equipIds[i_19_] = 0;
					else {
						int i_21_ = stream.readUnsignedByte((byte) 35);
						int i_22_ = i_21_ + (i_20_ << 8);
						if (i_19_ == 0 && (i_22_ ^ 0xffffffff) == -65536) {
							npcId = stream.readUnsignedShort((byte) -65);
							anInt10422 = stream.readUnsignedByte((byte) 35);
							break;
						}
						/*
						 * if (i_22_ >= 32768) { i_22_ =
						 * Class143.anIntArray1929[i_22_ - 32768]; is[i_19_] =
						 * Class173.method1134(1073741824, i_22_); int i_23_ =
						 * (((Class249) Packet.aClass223_8723 .method1430(i_22_,
						 * false)).anInt3424); if ((i_23_ ^ 0xffffffff) != -1)
						 * anInt10422 = i_23_; } else is[i_19_] =
						 * Class173.method1134(-256 + i_22_, -2147483648); /
						 */

						if (i_22_ >= 16384) {
							i_22_ -= 16384;
							equipIds[i_19_] = Class173.method1134(1073741824,
									i_22_);
							int i_23_ = (((Class249) Packet.aClass223_8723
									.method1430(i_22_, false)).anInt3424);
							if ((i_23_ ^ 0xffffffff) != -1)
								anInt10422 = i_23_;
						} else
							equipIds[i_19_] = Class173.method1134(-256 + i_22_,
									-2147483648);
					}
				}
				int[] is_24_ = new int[5];
				for (int i_25_ = 0; i_25_ < 5; i_25_++) {
					int i_26_ = stream.readUnsignedByte((byte) 35);
					if (Class34.aShortArrayArrayArray463.length < 1
							|| (i_26_ ^ 0xffffffff) > -1
							|| (i_26_ ^ 0xffffffff) <= ((Class34.aShortArrayArrayArray463[0][i_25_]).length ^ 0xffffffff))
						i_26_ = 0;
					is_24_[i_25_] = i_26_;
				}
				anInt10396 = stream.readUnsignedShort((byte) -65);
				aString10408 = stream.readString(-1);
				if (Class11_Sub2_Sub8.myPlayer == this)
					Class126.aString1691 = aString10408;
				aString10400 = aString10408;
				anInt10389 = stream.readUnsignedByte((byte) 35);
				if (!bool_16_) {
					anInt10385 = 0;
					anInt10417 = stream.readUnsignedByte((byte) 35);
					anInt10409 = stream.readUnsignedByte((byte) 35);
					if (anInt10409 == 255)
						anInt10409 = -1;
				} else {
					anInt10385 = stream.readUnsignedShort((byte) -65);
					anInt10417 = anInt10389;
					if ((anInt10385 ^ 0xffffffff) == -65536)
						anInt10385 = -1;
					anInt10409 = -1;
				}
				int i_27_ = anInt10383;
				anInt10383 = stream.readUnsignedByte((byte) 35);
				if ((anInt10383 ^ 0xffffffff) != -1) {
					int i_28_ = anInt10428;
					int i_29_ = anInt10392;
					int i_30_ = anInt10403;
					int i_31_ = anInt10410;
					int i_32_ = anInt10394;
					anInt10428 = stream.readUnsignedShort((byte) -65);
					anInt10392 = stream.readUnsignedShort((byte) -65);
					anInt10403 = stream.readUnsignedShort((byte) -65);
					anInt10410 = stream.readUnsignedShort((byte) -65);
					anInt10394 = stream.readUnsignedByte((byte) 35);
					if ((!hasDisplayName != !bool)
							|| (anInt10383 ^ 0xffffffff) != (i_27_ ^ 0xffffffff)
							|| i_28_ != (anInt10428) || i_29_ != (anInt10392)
							|| i_30_ != (anInt10403) || i_31_ != (anInt10410)
							|| i_32_ != (anInt10394))
						Class14.method147(0, this);
				} else
					Class167.method1101(27, this);
				if (aClass258_10418 == null)
					aClass258_10418 = new Class258();
				int i_33_ = (((Class258) (aClass258_10418)).anInt3516);
				int[] is_34_ = (((Class258) aClass258_10418).anIntArray3529);
				aClass258_10418.method1654(is_24_, equipIds, npcId, (byte) 20,
						method3964(2), (genderId ^ 0xffffffff) == -2);
				if ((npcId ^ 0xffffffff) != (i_33_ ^ 0xffffffff)) {
					((Class376_Sub7) this).anInt7045 = (((Actor) this).anIntArray10370[0] << 9)
							+ (method3968((byte) 127) << 8);
					((Class376_Sub7) this).anInt7031 = (((Actor) this).anIntArray10376[0] << 9)
							+ (method3968((byte) 127) << 8);
				}
				if (i <= 48)
					method3979(null, 79, null, 12, null, -96, (byte) -51, 118);
				if (((Class11_Sub44.anInt7791 ^ 0xffffffff) == (((Actor) this).anInt10319 ^ 0xffffffff))
						&& is_34_ != null) {
					for (int i_35_ = 0; (i_35_ ^ 0xffffffff) > (is_24_.length ^ 0xffffffff); i_35_++) {
						if ((is_34_[i_35_] ^ 0xffffffff) != (is_24_[i_35_] ^ 0xffffffff)) {
							Packet.aClass223_8723.method1428(false);
							break;
						}
					}
				}
				if (((Actor) this).aClass376_Sub10_10369 != null)
					((Actor) this).aClass376_Sub10_10369
							.method3167();
				if (((Actor) this).anInt10291 == -1
						|| !((Actor) this).aBool10329)
					break;
				Class39 class39 = this.method3960(21816);
				if (class39.method339(
						(((Actor) this).anInt10291),
						(byte) 28))
					break;
				((Actor) this).aBool10329 = false;
				((Actor) this).anInt10291 = -1;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("kd.P("
						+ (stream != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void method2871(boolean bool, Class163 class163, int i, int i_36_,
			Class376_Sub7 class376_sub7, int i_37_, int i_38_) {
		try {
			if (i_37_ != 22501)
				method2862(106);
			anInt10426++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kd.G(" + bool + ','
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_36_ + ',' + (class376_sub7 != null ? "{...}" : "null")
					+ ',' + i_37_ + ',' + i_38_ + ')'));
		}
	}

	final boolean method3975(int i) {
		try {
			if (i != 92160000)
				anInt10422 = -104;
			anInt10390++;
			if (aClass258_10418 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kd.T(" + i + ')');
		}
	}

	final int method3968(byte i) {
		try {
			if (i != 127)
				aBool10381 = true;
			anInt10397++;
			if (aClass258_10418 != null
					&& (((Class258) (aClass258_10418)).anInt3516 ^ 0xffffffff) != 0)
				return (((NPCDefinitions) (Class11_Sub19.aClass318_5817.getNPCDefinitions(
						((Class258) (aClass258_10418)).anInt3516, false))).anInt2975);
			return super.method3968((byte) 127);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kd.I(" + i + ')');
		}
	}

	static final void method3976(int i, int i_39_, int i_40_, int i_41_,
			int i_42_, int i_43_, int i_44_, int i_45_, int i_46_) {
		do {
			try {
				anInt10412++;
				if (i_45_ > i_39_
						|| i_42_ < 1
						|| (i_39_ ^ 0xffffffff) < (-2 + Class300.anInt4051 ^ 0xffffffff)
						|| Class108_Sub12.anInt6228 - 2 < i_42_)
					break;
				int i_47_ = i_46_;
				if ((i_47_ ^ 0xffffffff) > -4
						&& Class321_Sub3_Sub1.method3613((byte) -69, i_39_,
								i_42_))
					i_47_++;
				if ((((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub27_5707
						.method3158(false) != 0 || Class173.method1131(i_42_,
						-1, i_47_, i_39_, Class51.anInt800))
						&& Class181.aClass364ArrayArrayArray2336 != null) {
					Class376_Sub6.aClass286_Sub1_6949.method2913(i_39_, i_46_,
							Class235.aClass338Array3217[i_46_],
							Class321_Sub2.aClass163_6648, i_42_, (byte) 111,
							i_43_);
					if ((i_44_ ^ 0xffffffff) > -1)
						break;
					int i_48_ = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub3_5703
							.method2347(false);
					Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
							.method2460(
									i_45_ ^ 0xee1dc09,
									1,
									(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub3_5703));
					Class376_Sub6.aClass286_Sub1_6949.method2911(i_46_, i,
							i_40_, i_44_, i_47_, Class321_Sub2.aClass163_6648,
							i_42_, i_39_, (byte) -127,
							Class235.aClass338Array3217[i_46_], i_41_);
					Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
							.method2460(
									249682952,
									i_48_,
									(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub3_5703));
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("kd.S(" + i + ',' + i_39_ + ',' + i_40_ + ',' + i_41_
								+ ',' + i_42_ + ',' + i_43_ + ',' + i_44_ + ','
								+ i_45_ + ',' + i_46_ + ')'));
			}
			break;
		} while (false);
	}

	final Class376_Sub5 method2876(byte i, Class163 class163) {
		try {
			anInt10379++;
			if (aClass258_10418 == null || !method3982(2048, class163, true))
				return null;
			Class33 class33 = class163.method1048();
			int i_49_ = ((Actor) this).aClass173_10278
					.method1140(-1);
			class33.method298(i_49_);
			Class364 class364 = (Class181.aClass364ArrayArrayArray2336[((Class376_Sub7) this).aByte7047][(((Class376_Sub7) this).anInt7045 >> Class11_Sub2_Sub8.anInt8751)][(((Class376_Sub7) this).anInt7031 >> Class11_Sub2_Sub8.anInt8751)]);
			if (class364 != null
					&& ((Class364) class364).aClass376_Sub7_Sub2_4777 != null) {
				int i_50_ = (-(((Class376_Sub7_Sub2) ((Class364) class364).aClass376_Sub7_Sub2_4777).aShort9237) + ((Actor) this).anInt10307);
				((Actor) this).anInt10307 -= (float) i_50_ / 10.0F;
			} else
				((Actor) this).anInt10307 -= ((float) ((Actor) this).anInt10307 / 10.0F);
			class33.method299(((Class376_Sub7) this).anInt7045,
					(-((Actor) this).anInt10307
							+ ((Class376_Sub7) this).anInt7036 - 20),
					((Class376_Sub7) this).anInt7031);
			((Actor) this).aBool10378 = false;
			Class376_Sub5 class376_sub5 = null;
			if ((((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub21_5700
					.method2958(false) ^ 0xffffffff) == -2) {
				Class39 class39 = this.method3960(i ^ ~0x5546);
				if (((Class39) class39).aBool534
						&& (((Class258) (aClass258_10418)).anInt3516 == -1 || ((NPCDefinitions) (Class11_Sub19.aClass318_5817
								.getNPCDefinitions(
										((Class258) aClass258_10418).anInt3516,
										false))).aBool2947)) {
					Class281 class281 = (((((Actor) this).anInt10352 ^ 0xffffffff) == 0 || (((Actor) this).anInt10286 ^ 0xffffffff) != -1) ? null
							: (Class108_Sub23.aClass198_7760
									.method1284(
											((Actor) this).anInt10352,
											(byte) -86)));
					Class281 class281_51_ = ((((Actor) this).anInt10291 != -1
							&& !(aBool10381) && (!((Actor) this).aBool10329 || class281 == null)) ? (Class108_Sub23.aClass198_7760
							.method1284(
									((Actor) this).anInt10291,
									(byte) 104))
							: null);
					Class206 class206 = (Class11_Sub45_Sub3
							.method3386(
									160,
									((Actor) this).anInt10309,
									((Actor) this).anInt10302,
									((Actor) this).anInt10318,
									240,
									class163,
									21525,
									(((Actor) this).aClass206Array10371[0]),
									0,
									1,
									0,
									(class281_51_ != null ? ((Actor) this).anInt10267
											: ((Actor) this).anInt10326),
									class281_51_ != null ? class281_51_
											: class281, i_49_));
					if (class206 != null) {
						class376_sub5 = (Class11_Sub11
								.method2370(
										true,
										(((Actor) this).aClass206Array10371).length + 1,
										i ^ ~0x6086));
						((Actor) this).aBool10378 = true;
						class163.C(false);
						if (Class11_Sub45_Sub1.aBool8490)
							class206.method1329(
									class33,
									(((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[(((Actor) this).aClass206Array10371).length]),
									Class117.anInt1597, 0);
						else
							class206.method1321(
									class33,
									(((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[(((Actor) this).aClass206Array10371).length]),
									0);
						class163.C(true);
					}
				}
			}
			if (Class11_Sub2_Sub8.myPlayer == this) {
				class33.method301(((Class376_Sub7) this).anInt7045,
						((Class376_Sub7) this).anInt7036,
						((Class376_Sub7) this).anInt7031);
				for (int i_52_ = IncomingPacket.aClass275Array2082.length - 1; (i_52_ ^ 0xffffffff) <= -1; i_52_--) {
					Class275 class275 = IncomingPacket.aClass275Array2082[i_52_];
					if (class275 != null
							&& ((Class275) class275).anInt3698 != -1) {
						if ((((Class275) class275).anInt3697 ^ 0xffffffff) == -2) {
							Class11_Sub25 class11_sub25 = ((Class11_Sub25) (Class11_Sub2_Sub25.aClass213_9322
									.method1369(
											(byte) 26,
											(long) ((Class275) class275).anInt3707)));
							if (class11_sub25 != null) {
								Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) class11_sub25).aNpc_2373);
								int i_53_ = (((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7045 - (((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7045));
								int i_54_ = (-(((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7031) + (((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7031));
								if (!Class11_Sub45_Sub1.aBool8490)
									method3979(
											((Actor) this).aClass206Array10371[0],
											((Class275) class275).anInt3698,
											class33, i_54_, class163, i_53_,
											(byte) 16, 92160000);
								else
									method3978(
											((Actor) this).aClass206Array10371[0],
											class163, Class117.anInt1597,
											92160000,
											((Class275) class275).anInt3698,
											i_53_, i_54_, class33, -81);
							}
						}
						if (((Class275) class275).anInt3697 == 2) {
							int i_55_ = (256 + (((Class275) class275).anInt3704 + -(((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7045)));
							int i_56_ = (-(((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7031) + 256 + ((Class275) class275).anInt3699);
							int i_57_ = ((Class275) class275).anInt3708 << 9;
							i_57_ *= i_57_;
							if (Class11_Sub45_Sub1.aBool8490)
								method3978(
										(((Actor) this).aClass206Array10371[0]),
										class163, Class117.anInt1597, i_57_,
										((Class275) class275).anInt3698, i_55_,
										i_56_, class33, 125);
							else
								method3979(
										(((Actor) this).aClass206Array10371[0]),
										((Class275) class275).anInt3698,
										class33, i_56_, class163, i_55_,
										(byte) 16, i_57_);
						}
						if (((Class275) class275).anInt3697 == 10
								&& ((Class275) class275).anInt3707 >= 0
								&& (((Class275) class275).anInt3707 < (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814).length)) {
							Player class376_sub7_sub5_sub5_sub1_58_ = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[((Class275) class275).anInt3707]);
							if (class376_sub7_sub5_sub5_sub1_58_ != null) {
								int i_59_ = (-(((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7045) + (((Class376_Sub7) class376_sub7_sub5_sub5_sub1_58_).anInt7045));
								int i_60_ = ((((Class376_Sub7) class376_sub7_sub5_sub5_sub1_58_).anInt7031) + -(((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7031));
								if (!Class11_Sub45_Sub1.aBool8490)
									method3979(
											((Actor) this).aClass206Array10371[0],
											((Class275) class275).anInt3698,
											class33, i_60_, class163, i_59_,
											(byte) 16, 92160000);
								else
									method3978(
											((Actor) this).aClass206Array10371[0],
											class163, Class117.anInt1597,
											92160000,
											((Class275) class275).anInt3698,
											i_59_, i_60_, class33, i ^ 0x14);
							}
						}
					}
				}
				class33.method298(i_49_);
				class33.method299(((Class376_Sub7) this).anInt7045,
						((Class376_Sub7) this).anInt7036,
						((Class376_Sub7) this).anInt7031);
			}
			if (i != -127)
				readAppearance(null, 6);
			class33.method298(i_49_);
			class33.method299(
					((Class376_Sub7) this).anInt7045,
					(-((Actor) this).anInt10307 + (-5 + ((Class376_Sub7) this).anInt7036)),
					((Class376_Sub7) this).anInt7031);
			if (class376_sub5 == null)
				class376_sub5 = Class11_Sub11
						.method2370(
								true,
								(((Actor) this).aClass206Array10371).length,
								i ^ ~0x6086);
			this.method3962(true, class33, class163,
					(((Actor) this).aClass206Array10371),
					false);
			if (Class11_Sub45_Sub1.aBool8490) {
				for (int i_61_ = 0; ((((Actor) this).aClass206Array10371).length > i_61_); i_61_++) {
					if ((((Actor) this).aClass206Array10371[i_61_]) != null)
						((Actor) this).aClass206Array10371[i_61_]
								.method1329(
										class33,
										(((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[i_61_]),
										Class117.anInt1597,
										((Class11_Sub2_Sub8.myPlayer) != this ? 0
												: 1));
				}
			} else {
				for (int i_62_ = 0; (((((Actor) this).aClass206Array10371).length ^ 0xffffffff) < (i_62_ ^ 0xffffffff)); i_62_++) {
					if ((((Actor) this).aClass206Array10371[i_62_]) != null)
						((Actor) this).aClass206Array10371[i_62_]
								.method1321(
										class33,
										(((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[i_62_]),
										(this != (Class11_Sub2_Sub8.myPlayer) ? 0
												: 1));
				}
			}
			if (((Actor) this).aClass376_Sub10_10369 != null) {
				Class116 class116 = ((Actor) this).aClass376_Sub10_10369
						.method3172();
				if (!Class11_Sub45_Sub1.aBool8490)
					class163.method1010(class116);
				else
					class163.method1008(class116, Class117.anInt1597);
			}
			for (int i_63_ = 0; ((((Actor) this).aClass206Array10371.length ^ 0xffffffff) < (i_63_ ^ 0xffffffff)); i_63_++) {
				if (((Actor) this).aClass206Array10371[i_63_] != null)
					((Actor) this).aBool10378 |= ((Actor) this).aClass206Array10371[i_63_]
							.F();
			}
			((Actor) this).aClass206Array10371[0] = ((Actor) this).aClass206Array10371[1] = ((Actor) this).aClass206Array10371[2] = null;
			((Actor) this).anInt10268 = Class283.anInt3835;
			return class376_sub5;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kd.U(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	final int method3955(byte i) {
		try {
			if (i != 72)
				anInt10424 = 121;
			anInt10419++;
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kd.Q(" + i + ')');
		}
	}

	final void method3977(int i, byte i_64_, int i_65_, int i_66_) {
		try {
			anInt10380++;
			if ((((Actor) this).anInt10375 ^ 0xffffffff) > -10)
				((Actor) this).anInt10375++;
			for (int i_67_ = ((Actor) this).anInt10375; i_67_ > 0; i_67_--) {
				((Actor) this).anIntArray10370[i_67_] = (((Actor) this).anIntArray10370[i_67_ - 1]);
				((Actor) this).anIntArray10376[i_67_] = (((Actor) this).anIntArray10376[i_67_ - 1]);
				((Actor) this).aByteArray10372[i_67_] = (((Actor) this).aByteArray10372[i_67_ - 1]);
			}
			((Actor) this).anIntArray10370[0] = i_66_;
			((Actor) this).aByteArray10372[0] = i_64_;
			if (i_65_ >= -80)
				anInt10398 = 59;
			((Actor) this).anIntArray10376[0] = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kd.V(" + i + ','
					+ i_64_ + ',' + i_65_ + ',' + i_66_ + ')'));
		}
	}

	private final void method3978(Class206 class206, Class163 class163, int i,
			int i_68_, int i_69_, int i_70_, int i_71_, Class33 class33,
			int i_72_) {
		do {
			try {
				anInt10423++;
				int i_73_ = i_70_ * i_70_ - -(i_71_ * i_71_);
				if ((i_73_ ^ 0xffffffff) <= -262145
						&& (i_73_ ^ 0xffffffff) >= (i_68_ ^ 0xffffffff)) {
					int i_74_ = -59 / ((81 - i_72_) / 39);
					int i_75_ = ((int) (2607.5945876176133 * Math.atan2(
							(double) i_70_, (double) i_71_)) & 0x3fff);
					Class206 class206_76_ = (Class251.method1602(
							((Actor) this).anInt10302,
							class163, i_75_,
							((Actor) this).anInt10309,
							((Actor) this).anInt10318, i_69_,
							-104));
					if (class206_76_ == null)
						break;
					class163.C(false);
					class206_76_.method1329(class33, null, i, 0);
					class163.C(true);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("kd.C(" + (class206 != null ? "{...}" : "null") + ','
								+ (class163 != null ? "{...}" : "null") + ','
								+ i + ',' + i_68_ + ',' + i_69_ + ',' + i_70_
								+ ',' + i_71_ + ','
								+ (class33 != null ? "{...}" : "null") + ','
								+ i_72_ + ')'));
			}
			break;
		} while (false);
	}

	final Class212 method2860(int i, Class163 class163) {
		try {
			if (i != 0)
				anInt10422 = -83;
			anInt10416++;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kd.D(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method3979(Class206 class206, int i, Class33 class33,
			int i_77_, Class163 class163, int i_78_, byte i_79_, int i_80_) {
		do {
			try {
				anInt10429++;
				int i_81_ = i_77_ * i_77_ + i_78_ * i_78_;
				if ((i_81_ ^ 0xffffffff) <= -262145 && i_81_ <= i_80_) {
					if (i_79_ != 16)
						method2871(true, null, -19, 106, null, 100, 66);
					int i_82_ = ((int) (Math.atan2((double) i_78_,
							(double) i_77_) * 2607.5945876176133) & 0x3fff);
					Class206 class206_83_ = (Class251
							.method1602(
									((Actor) this).anInt10302,
									class163,
									i_82_,
									((Actor) this).anInt10309,
									((Actor) this).anInt10318,
									i, -85));
					if (class206_83_ == null)
						break;
					class163.C(false);
					class206_83_.method1321(class33, null, 0);
					class163.C(true);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("kd.R("
						+ (class206 != null ? "{...}" : "null") + ',' + i + ','
						+ (class33 != null ? "{...}" : "null") + ',' + i_77_
						+ ',' + (class163 != null ? "{...}" : "null") + ','
						+ i_78_ + ',' + i_79_ + ',' + i_80_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2872(int i) {
		try {
			anInt10407++;
			if (i != 26062)
				anInt10425 = -52;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kd.L(" + i + ')');
		}
	}

	public static void method3980(byte i) {
		do {
			try {
				anIntArray10421 = null;
				if (i <= -70)
					break;
				method3976(74, 91, 79, -120, 41, 30, 86, 95, -18);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "kd.J(" + i + ')');
			}
			break;
		} while (false);
	}

	final String method3981(int i, boolean bool) {
		try {
			anInt10430++;
			if (i > -36)
				aBool10382 = false;
			String string = "";
			if (Class339.aStringArray4486 != null)
				string += Class339.aStringArray4486[aByte10431];
			int[] is;
			if (genderId == 1 && Class105.anIntArray1411 != null)
				is = Class105.anIntArray1411;
			else
				is = Class258.anIntArray3532;
			if (is != null && is[aByte10431] != -1) {
				Class20 class20 = Class11_Sub35_Sub1.aClass374_9125.method2201(
						is[aByte10431], 111);
				if ((((Class20) class20).aChar166 ^ 0xffffffff) != -116) {
					Class11_Sub12_Sub3.method3602((byte) -114, "gdn1",
							new Throwable());
					is[aByte10431] = -1;
				} else
					string += class20.method172(-27058, aByte10405 & 0xff);
			}
			if (!bool)
				string += aString10400;
			else
				string += aString10408;
			if (Class73.aStringArray1013 != null)
				string += Class73.aStringArray1013[aByte10431];
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kd.A(" + i + ','
					+ bool + ')');
		}
	}

	final int method3964(int i) {
		try {
			anInt10387++;
			if (i != 2)
				method2876((byte) -56, null);
			return anInt10396;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kd.O(" + i + ')');
		}
	}

	private final boolean method3982(int i, Class163 class163, boolean bool) {
		try {
			anInt10384++;
			int i_84_ = i;
			Class39 class39 = this.method3960(21816);
			Class281 class281 = ((((Actor) this).anInt10352 != -1 && ((Actor) this).anInt10286 == 0) ? (Class108_Sub23.aClass198_7760
					.method1284(((Actor) this).anInt10352,
							(byte) -56)) : null);
			Class281 class281_85_ = ((((((Actor) this).anInt10291 ^ 0xffffffff) != 0)
					&& !aBool10381 && (!((Actor) this).aBool10329 || class281 == null)) ? (Class108_Sub23.aClass198_7760
					.method1284(((Actor) this).anInt10291,
							(byte) 95)) : null);
			int i_86_ = ((Class39) class39).anInt558;
			int i_87_ = ((Class39) class39).anInt571;
			if (i_86_ != 0 || (i_87_ ^ 0xffffffff) != -1
					|| ((Class39) class39).anInt562 != 0
					|| ((Class39) class39).anInt563 != 0)
				i |= 0x7;
			int i_88_ = ((Actor) this).aClass173_10278
					.method1140(-1);
			boolean bool_89_ = (((Actor) this).aByte10332 != 0
					&& (((Actor) this).anInt10360 <= Class11_Sub25.anInt6279) && ((Class11_Sub25.anInt6279 ^ 0xffffffff) > (((Actor) this).anInt10344 ^ 0xffffffff)));
			if (bool_89_)
				i |= 0x80000;
			Class206 class206 = (((Actor) this).aClass206Array10371[0] = (aClass258_10418
					.method1646(
							((Actor) this).anInt10282,
							i,
							class281_85_,
							((Actor) this).anInt10288,
							((Actor) this).anInt10267,
							Packet.aClass223_8723,
							((Actor) this).anInt10343,
							Class108_Sub26.aClass127_7833,
							class163,
							i_88_,
							class281,
							((Actor) this).anIntArray10324,
							((Actor) this).anInt10283,
							Class2.aClass221_18,
							Class108_Sub23.aClass198_7760,
							bool,
							((Actor) this).aClass208Array10342,
							((Actor) this).anInt10326,
							Class11_Sub19.aClass318_5817,
							Class11_Sub26.aClass97_6296, 0)));
			int i_90_ = Class108_Sub11.method2621(-24897);
			if (Class177.anInt2245 < 96 && i_90_ > 50)
				Class31.method258(!bool);
			if (Class11_Sub2_Sub24.aClass347_9284 == Class362.aClass347_4711
					|| i_90_ >= 50) {
				if (Class11_Sub2_Sub24.aClass347_9284 != Class362.aClass347_4711) {
					Class91_Sub3_Sub1.aByteArrayArray9337 = new byte[50][];
					Class11_Sub45.anInt7905 = 0;
				}
			} else {
				int i_91_;
				for (i_91_ = 50 + -i_90_; i_91_ > Class11_Sub45.anInt7905; Class11_Sub45.anInt7905++)
					Class91_Sub3_Sub1.aByteArrayArray9337[(Class11_Sub45.anInt7905)] = new byte[102400];
				while (Class11_Sub45.anInt7905 > i_91_) {
					Class11_Sub45.anInt7905--;
					Class91_Sub3_Sub1.aByteArrayArray9337[(Class11_Sub45.anInt7905)] = null;
				}
			}
			if (class206 == null)
				return false;
			((Actor) this).anInt10335 = class206.fa();
			((Actor) this).anInt10356 = class206.ma();
			this.method3966((byte) -127, class206);
			if ((i_86_ ^ 0xffffffff) == -1 && i_87_ == 0)
				this.method3956(0, method3968((byte) 127) << 9, 0, i_88_,
						(byte) -86, method3968((byte) 127) << 9);
			else {
				this.method3956(((Class39) class39).anInt535, i_86_,
						((Class39) class39).anInt575, i_88_, (byte) -85, i_87_);
				if (((Actor) this).anInt10309 != 0)
					class206.FA(((Actor) this).anInt10309);
				if (((Actor) this).anInt10302 != 0)
					class206.VA(((Actor) this).anInt10302);
				if (((Actor) this).anInt10318 != 0)
					class206.H(0, ((Actor) this).anInt10318,
							0);
			}
			if (bool_89_)
				class206.method1323(
						((Actor) this).aByte10323,
						((Actor) this).aByte10275,
						((Actor) this).aByte10358,
						0xff & ((Actor) this).aByte10332);
			if (!aBool10381
					&& ((((Actor) this).anInt10289 ^ 0xffffffff) != 0)
					&& ((((Actor) this).anInt10327 ^ 0xffffffff) != 0)) {
				Class224 class224 = (Class254.aClass227_3495.method1465(
						((Actor) this).anInt10289,
						(byte) -118));
				boolean bool_92_ = (((Class224) class224).aByte3075 == 3 && ((i_86_ ^ 0xffffffff) != -1 || (i_87_ ^ 0xffffffff) != -1));
				int i_93_ = i_84_;
				if (!bool_92_) {
					if ((((Actor) this).anInt10297 ^ 0xffffffff) != -1)
						i_93_ |= 0x5;
					if ((((Actor) this).anInt10299 ^ 0xffffffff) != -1)
						i_93_ |= 0x2;
					if (((Actor) this).anInt10337 >= 0)
						i_93_ |= 0x7;
				} else
					i_93_ |= 0x7;
				Class206 class206_94_ = (((Actor) this).aClass206Array10371[1] = (class224
						.method1436(class163, (byte) 6,
								((Actor) this).anInt10281,
								((Actor) this).anInt10327,
								((Actor) this).anInt10284,
								i_93_, Class108_Sub23.aClass198_7760)));
				if (class206_94_ != null) {
					if ((((Actor) this).anInt10337 ^ 0xffffffff) > -1
							|| ((Class39) class39).anIntArrayArray564 == null
							|| ((((Class39) class39).anIntArrayArray564[((Actor) this).anInt10337]) == null)) {
						if (((Actor) this).anInt10297 != 0)
							class206_94_
									.a(2048 * ((Actor) this).anInt10297);
					} else {
						int i_95_ = 0;
						int i_96_ = 0;
						int i_97_ = 0;
						if (((Class39) class39).anIntArrayArray564 != null
								&& ((((Class39) class39).anIntArrayArray564[((Actor) this).anInt10337]) != null)) {
							i_96_ += (((Class39) class39).anIntArrayArray564[(((Actor) this).anInt10337)][1]);
							i_97_ += (((Class39) class39).anIntArrayArray564[(((Actor) this).anInt10337)][2]);
							i_95_ += (((Class39) class39).anIntArrayArray564[(((Actor) this).anInt10337)][0]);
						}
						if (((Class39) class39).anIntArrayArray529 != null
								&& ((((Class39) class39).anIntArrayArray529[((Actor) this).anInt10337]) != null)) {
							i_97_ += (((Class39) class39).anIntArrayArray529[(((Actor) this).anInt10337)][2]);
							i_95_ += (((Class39) class39).anIntArrayArray529[(((Actor) this).anInt10337)][0]);
							i_96_ += (((Class39) class39).anIntArrayArray529[(((Actor) this).anInt10337)][1]);
						}
						if (i_97_ != 0 || i_95_ != 0) {
							int i_98_ = i_88_;
							if ((((Actor) this).anIntArray10324) != null
									&& (((Actor) this).anIntArray10324[(((Actor) this).anInt10337)]) != -1)
								i_98_ = (((Actor) this).anIntArray10324[(((Actor) this).anInt10337)]);
							int i_99_ = (-i_88_
									+ (((Actor) this).anInt10297)
									* 2048 + i_98_ & 0x3fff);
							if (i_99_ != 0)
								class206_94_.a(i_99_);
							int i_100_ = Class335.anIntArray4436[i_99_];
							int i_101_ = Class335.anIntArray4430[i_99_];
							int i_102_ = i_101_ * i_95_ + i_100_ * i_97_ >> 14;
							i_97_ = i_101_ * i_97_ + -(i_95_ * i_100_) >> 14;
							i_95_ = i_102_;
						}
						class206_94_.H(i_95_, i_96_, i_97_);
					}
					if ((((Actor) this).anInt10299 ^ 0xffffffff) != -1)
						class206_94_
								.H(0,
										-(((Actor) this).anInt10299) << 2,
										0);
					if (bool_92_) {
						if ((((Actor) this).anInt10309 ^ 0xffffffff) != -1)
							class206_94_
									.FA(((Actor) this).anInt10309);
						if (((Actor) this).anInt10302 != 0)
							class206_94_
									.VA(((Actor) this).anInt10302);
						if ((((Actor) this).anInt10318 ^ 0xffffffff) != -1)
							class206_94_
									.H(0,
											(((Actor) this).anInt10318),
											0);
					}
				}
			} else
				((Actor) this).aClass206Array10371[1] = null;
			if (aBool10381
					|| ((((Actor) this).anInt10338 ^ 0xffffffff) == 0)
					|| ((((Actor) this).anInt10314 ^ 0xffffffff) == 0))
				((Actor) this).aClass206Array10371[2] = null;
			else {
				Class224 class224 = (Class254.aClass227_3495
						.method1465(
								((Actor) this).anInt10338,
								(byte) 108));
				boolean bool_103_ = (((Class224) class224).aByte3075 == 3 && (i_86_ != 0 || i_87_ != 0));
				int i_104_ = i_84_;
				if (bool_103_)
					i_104_ |= 0x7;
				else {
					if ((((Actor) this).anInt10334 ^ 0xffffffff) != -1)
						i_104_ |= 0x5;
					if ((((Actor) this).anInt10347 ^ 0xffffffff) != -1)
						i_104_ |= 0x2;
					if ((((Actor) this).anInt10316 ^ 0xffffffff) <= -1)
						i_104_ |= 0x7;
				}
				Class206 class206_105_ = (((Actor) this).aClass206Array10371[2] = (class224
						.method1431(
								((Actor) this).anInt10314,
								Class108_Sub23.aClass198_7760, class163,
								i_104_,
								((Actor) this).anInt10273,
								((Actor) this).anInt10313,
								(byte) -95)));
				if (class206_105_ != null) {
					if ((((Actor) this).anInt10316 ^ 0xffffffff) <= -1
							&& ((Class39) class39).anIntArrayArray564 != null
							&& ((((Class39) class39).anIntArrayArray564[((Actor) this).anInt10316]) != null)) {
						int i_106_ = 0;
						int i_107_ = 0;
						int i_108_ = 0;
						if (((Class39) class39).anIntArrayArray564 != null
								&& ((((Class39) class39).anIntArrayArray564[((Actor) this).anInt10316]) != null)) {
							i_108_ += (((Class39) class39).anIntArrayArray564[(((Actor) this).anInt10316)][2]);
							i_106_ += (((Class39) class39).anIntArrayArray564[(((Actor) this).anInt10316)][0]);
							i_107_ += (((Class39) class39).anIntArrayArray564[(((Actor) this).anInt10316)][1]);
						}
						if (((Class39) class39).anIntArrayArray529 != null
								&& ((((Class39) class39).anIntArrayArray529[((Actor) this).anInt10316]) != null)) {
							i_106_ += (((Class39) class39).anIntArrayArray529[(((Actor) this).anInt10316)][0]);
							i_108_ += (((Class39) class39).anIntArrayArray529[(((Actor) this).anInt10316)][2]);
							i_107_ += (((Class39) class39).anIntArrayArray529[(((Actor) this).anInt10316)][1]);
						}
						if (i_108_ != 0 || (i_106_ ^ 0xffffffff) != -1) {
							int i_109_ = i_88_;
							if ((((Actor) this).anIntArray10324) != null
									&& ((((Actor) this).anIntArray10324[(((Actor) this).anInt10316)]) ^ 0xffffffff) != 0)
								i_109_ = (((Actor) this).anIntArray10324[(((Actor) this).anInt10316)]);
							int i_110_ = (0x3fff & (2048 * (((Actor) this).anInt10334) - (-i_109_ - -i_88_)));
							if (i_110_ != 0)
								class206_105_.a(i_110_);
							int i_111_ = Class335.anIntArray4436[i_110_];
							int i_112_ = Class335.anIntArray4430[i_110_];
							int i_113_ = i_108_ * i_111_ + i_112_ * i_106_ >> 14;
							i_108_ = -(i_111_ * i_106_) + i_112_ * i_108_ >> 14;
							i_106_ = i_113_;
						}
						class206_105_.H(i_106_, i_107_, i_108_);
					} else if (((Actor) this).anInt10334 != 0)
						class206_105_
								.a((((Actor) this).anInt10334) * 2048);
					if (((Actor) this).anInt10347 != 0)
						class206_105_
								.H(0,
										-(((Actor) this).anInt10347) << 2,
										0);
					if (bool_103_) {
						if (((Actor) this).anInt10309 != 0)
							class206_105_
									.FA(((Actor) this).anInt10309);
						if ((((Actor) this).anInt10302 ^ 0xffffffff) != -1)
							class206_105_
									.VA(((Actor) this).anInt10302);
						if (((Actor) this).anInt10318 != 0)
							class206_105_
									.H(0,
											(((Actor) this).anInt10318),
											0);
					}
				}
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("kd.N(" + i + ','
							+ (class163 != null ? "{...}" : "null") + ','
							+ bool + ')'));
		}
	}

	public Player() {
		aBool10381 = false;
		anInt10385 = 0;
		anInt10401 = -1;
		anInt10394 = 255;
		anInt10392 = -1;
		anInt10403 = -1;
		anInt10409 = -1;
		aByte10405 = (byte) 0;
		anInt10414 = -1;
		aBool10420 = false;
		anInt10422 = 0;
		anInt10417 = 0;
		anInt10410 = -1;
		hasDisplayName = false;
		anInt10428 = -1;
		anInt10398 = -1;
		genderId = (byte) 0;
		aByte10431 = (byte) 0;
	}

	static {
		anIntArray10421 = new int[] { 16, 32, 64, 128 };
	}
}
