/* Class280 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class280 {
	private Class22 aClass22_3773 = new Class22(128);
	static int anInt3774;
	static int anInt3775;
	static int anInt3776;
	static int anInt3777;
	static int anInt3778;
	private Class146 aClass146_3779;
	static int anInt3780;
	static int anInt3781;
	Class146 aClass146_3782;
	static int anInt3783;
	static IncomingPacket INDEX_15_SOUND_IN_PACKET = new IncomingPacket(67, 6);
	Class22 aClass22_3785 = new Class22(64);
	static Class225 aClass225_3786;
	static int anInt3787 = 2;
	static int anInt3788;
	static Class146 aClass146_3789;
	static int anInt3790;

	static final void method1722(int i) {
		try {
			while (Class3.packetStream.method3425(Class37.anInt486, -3) >= 15) {
				int i_0_ = Class3.packetStream.readBits(15, (byte) 108);
				if (i_0_ == 32767)
					break;
				boolean bool = false;
				Class11_Sub25 class11_sub25 = (Class11_Sub25) Class11_Sub2_Sub25.aClass213_9322
						.method1369((byte) 26, (long) i_0_);
				if (class11_sub25 == null) {
					Npc npc = new Npc();
					npc.anInt10319 = i_0_;
					class11_sub25 = new Class11_Sub25(
							npc);
					Class11_Sub2_Sub25.aClass213_9322.method1368((long) i_0_,
							class11_sub25, (byte) -26);
					Class369.aClass11_Sub25Array4842[Class108_Sub17.anInt6619++] = class11_sub25;
					bool = true;
				}
				Npc npc = class11_sub25.aNpc_2373;
				Class11_Sub52.anIntArray8054[Class23.anInt249++] = i_0_;
				npc.anInt10322 = Class147.anInt1994;
				if (((Npc) npc).aClass215_10501 != null
						&& ((Npc) npc).aClass215_10501
								.method1376(112))
					Class82.method566(-107, npc);
				int i_1_ = Class3.packetStream.readBits(1, (byte) 108);
				int i_2_ = Class3.packetStream.readBits(1, (byte) 108);
				if (i_2_ == 1)
					Class94_Sub3.anIntArray6905[Class11_Sub2_Sub22.anInt9204++] = i_0_;
				npc.method4005(-1,
						(Class11_Sub19.aClass318_5817.getNPCDefinitions(
								Class3.packetStream.readBits(14, (byte) 108),
								false)));
				int i_3_ = 0x3e3c & 4 + Class3.packetStream.readBits(3, //direction
						(byte) 108) << 11;
				int i_4_ = Class3.packetStream.readBits(5, (byte) 108);
				if ((i_4_ ^ 0xffffffff) < -16)
					i_4_ -= 32;
				int i_5_ = Class3.packetStream.readBits(2, (byte) 108);
				int i_6_ = Class3.packetStream.readBits(5, (byte) 108);
				if ((i_6_ ^ 0xffffffff) < -16)
					i_6_ -= 32;
				npc
						.method3954(
								101,
								((NPCDefinitions) (((Npc) npc).aClass215_10501)).anInt2975);
				npc.anInt10320 = ((NPCDefinitions) (((Npc) npc).aClass215_10501)).anInt2959 << 3;
				if (bool)
					npc.method3961(true, -122, i_3_);
				npc
						.method4009(
								(i_1_ ^ 0xffffffff) == -2,
								npc
										.method3968((byte) 127),
								i_5_,
								(((Actor) Class11_Sub2_Sub8.myPlayer).anIntArray10376[0])
										+ i_6_,
								(byte) 75,
								(((Actor) Class11_Sub2_Sub8.myPlayer).anIntArray10370[0])
										- -i_4_);
				if (((Npc) npc).aClass215_10501
						.method1376(96))
					Class11_Sub30_Sub1
							.method3530(
									null,
									npc.anIntArray10376[0],
									0,
									null,
									(((Class376_Sub7) npc).aByte7047),
									npc.anIntArray10370[0],
									64, npc);
			}
			anInt3776++;
			if (i < 37)
				aClass225_3786 = null;
			Class3.packetStream.finishBitAccess((byte) 109);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pt.G(" + i + ')');
		}
	}

	final void method1723(byte i) {
		try {
			synchronized (aClass22_3773) {
				aClass22_3773.method189((byte) 123);
			}
			if (i != -86)
				method1731((byte) -89, -87);
			anInt3788++;
			synchronized (((Class280) this).aClass22_3785) {
				((Class280) this).aClass22_3785.method189((byte) -124);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pt.E(" + i + ')');
		}
	}

	final void method1724(int i, byte i_7_, int i_8_) {
		try {
			aClass22_3773 = new Class22(i_8_);
			if (i_7_ == -16) {
				anInt3783++;
				((Class280) this).aClass22_3785 = new Class22(i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pt.D(" + i + ','
					+ i_7_ + ',' + i_8_ + ')'));
		}
	}

	static final int method1725(String string, int i) {
		try {
			anInt3780++;
			if (string == null)
				return -1;
			int i_9_ = 25 % ((i + 66) / 51);
			for (int i_10_ = 0; i_10_ < Class94_Sub1.anInt5228; i_10_++) {
				if (string.equalsIgnoreCase(Class109.aStringArray1476[i_10_]))
					return i_10_;
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pt.H("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final Class23 method1726(byte i, int i_11_) {
		try {
			anInt3774++;
			Class23 class23;
			synchronized (aClass22_3773) {
				class23 = (Class23) aClass22_3773.method188((long) i_11_,
						(byte) 78);
			}
			if (class23 != null)
				return class23;
			byte[] is;
			synchronized (aClass146_3779) {
				is = aClass146_3779.method930(i_11_, (byte) 112, 36);
			}
			class23 = new Class23();
			if (i >= -68)
				return null;
			((Class23) class23).anInt233 = i_11_;
			((Class23) class23).aClass280_223 = this;
			if (is != null)
				class23.method199(new Stream(is), -1961);
			class23.method197((byte) -114);
			synchronized (aClass22_3773) {
				aClass22_3773.method184((byte) 124, class23, (long) i_11_);
			}
			return class23;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pt.B(" + i + ','
					+ i_11_ + ')');
		}
	}

	public static void method1727(byte i) {
		do {
			try {
				aClass225_3786 = null;
				aClass146_3789 = null;
				INDEX_15_SOUND_IN_PACKET = null;
				if (i == -32)
					break;
				anInt3787 = -1;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "pt.J(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1728(int i) {
		try {
			synchronized (aClass22_3773) {
				aClass22_3773.method190(0);
				if (i >= -29)
					method1728(-48);
			}
			anInt3778++;
			synchronized (((Class280) this).aClass22_3785) {
				((Class280) this).aClass22_3785.method190(0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pt.C(" + i + ')');
		}
	}

	static final IComponentDefinitions method1729(byte i,
			IComponentDefinitions class192) {
		try {
			anInt3781++;
			IComponentDefinitions class192_12_ = client.method4015(class192);
			if (class192_12_ == null)
				class192_12_ = ((IComponentDefinitions) class192).aClass192_2558;
			if (i <= 47)
				return null;
			return class192_12_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pt.F(" + i + ','
					+ (class192 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1730(int i) {
		try {
			anInt3777++;
			Class232.method1484(Class11_Sub2_Sub32_Sub1.aClass192_9889, 1);
			Exception_Sub1.anInt9480++;
			if (!Class11_Sub2_Sub34.aBool9690 || !Class376_Sub6.aBool6950) {
				if ((Exception_Sub1.anInt9480 ^ 0xffffffff) < -2)
					Class11_Sub2_Sub32_Sub1.aClass192_9889 = null;
			} else {
				int i_13_ = 0;
				int i_14_ = 0;
				if (Class11_Sub2_Sub19.aBool9087) {
					i_13_ = Class54.method443(i ^ 0x6ce4);
					i_14_ = Class376_Sub7_Sub4_Sub1.method3887((byte) -119);
				}
				int i_15_ = i_13_ + aClass225_3786.method1449(-83);
				int i_16_ = i_14_ + aClass225_3786.method1448((byte) -63);
				i_15_ -= Class15.anInt133;
				i_16_ -= Class11_Sub45_Sub16.anInt9391;
				if ((IOException_Sub1.anInt9969 ^ 0xffffffff) < (i_15_ ^ 0xffffffff))
					i_15_ = IOException_Sub1.anInt9969;
				if (i_16_ < Class73.anInt1007)
					i_16_ = Class73.anInt1007;
				if (i_15_
						- -((IComponentDefinitions) Class11_Sub2_Sub32_Sub1.aClass192_9889).anInt2610 > (((IComponentDefinitions) Exception_Sub1.aClass192_9486).anInt2610 + IOException_Sub1.anInt9969))
					i_15_ = (((IComponentDefinitions) Exception_Sub1.aClass192_9486).anInt2610
							+ IOException_Sub1.anInt9969 - ((IComponentDefinitions) (Class11_Sub2_Sub32_Sub1.aClass192_9889)).anInt2610);
				if (((Class73.anInt1007 + ((IComponentDefinitions) Exception_Sub1.aClass192_9486).anInt2546) ^ 0xffffffff) > (i_16_
						- -((IComponentDefinitions) (Class11_Sub2_Sub32_Sub1.aClass192_9889)).anInt2546 ^ 0xffffffff))
					i_16_ = (-((IComponentDefinitions) (Class11_Sub2_Sub32_Sub1.aClass192_9889)).anInt2546 + ((((IComponentDefinitions) Exception_Sub1.aClass192_9486).anInt2546) + Class73.anInt1007));
				int i_17_ = (((IComponentDefinitions) Exception_Sub1.aClass192_9486).anInt2561 + (-IOException_Sub1.anInt9969 + i_15_));
				int i_18_ = (i_16_ + -Class73.anInt1007 - -(((IComponentDefinitions) Exception_Sub1.aClass192_9486).anInt2588));
				if (i == 31167) {
					if (aClass225_3786.method1440(-1)) {
						if ((((IComponentDefinitions) Class11_Sub2_Sub32_Sub1.aClass192_9889).anInt2569 ^ 0xffffffff) > (Exception_Sub1.anInt9480 ^ 0xffffffff)) {
							int i_19_ = i_15_ - Class246.anInt3330;
							int i_20_ = -Class365.anInt4800 + i_16_;
							if ((((IComponentDefinitions) (Class11_Sub2_Sub32_Sub1.aClass192_9889)).anInt2571 ^ 0xffffffff) > (i_19_ ^ 0xffffffff)
									|| i_19_ < -((IComponentDefinitions) (Class11_Sub2_Sub32_Sub1.aClass192_9889)).anInt2571
									|| (((IComponentDefinitions) (Class11_Sub2_Sub32_Sub1.aClass192_9889)).anInt2571 < i_20_)
									|| ((i_20_ ^ 0xffffffff) > (-(((IComponentDefinitions) (Class11_Sub2_Sub32_Sub1.aClass192_9889)).anInt2571) ^ 0xffffffff)))
								Class234_Sub2_Sub2.aBool8995 = true;
						}
						if ((((IComponentDefinitions) (Class11_Sub2_Sub32_Sub1.aClass192_9889)).anObjectArray2508 != null)
								&& Class234_Sub2_Sub2.aBool8995) {
							Class11_Sub48 class11_sub48 = new Class11_Sub48();
							((Class11_Sub48) class11_sub48).anInt7990 = i_17_;
							((Class11_Sub48) class11_sub48).anInt8001 = i_18_;
							((Class11_Sub48) class11_sub48).aClass192_7999 = Class11_Sub2_Sub32_Sub1.aClass192_9889;
							((Class11_Sub48) class11_sub48).parameters = (((IComponentDefinitions) Class11_Sub2_Sub32_Sub1.aClass192_9889).anObjectArray2508);
							Class86.method610(class11_sub48);
						}
						
					} else {
						if (!Class234_Sub2_Sub2.aBool8995) {
							if ((Class11_Sub2_Sub23.anInt9269 != 1 && !Class2_Sub5
									.method2401(1002))
									|| (Class52.anInt802 ^ 0xffffffff) >= -3) {
								if (Class63.method483((byte) 127))
									Class11_Sub2_Sub20
											.method3577(
													true,
													Class15.anInt133
															+ Class246.anInt3330,
													(Class11_Sub45_Sub16.anInt9391 + Class365.anInt4800));
							} else
								Class11_Sub2_Sub20
										.method3577(
												true,
												Class246.anInt3330
														+ Class15.anInt133,
												(Class365.anInt4800 + Class11_Sub45_Sub16.anInt9391));
						} else {
							Class11_Sub45_Sub5.method3436(-1);
							if ((((IComponentDefinitions) Class11_Sub2_Sub32_Sub1.aClass192_9889).anObjectArray2559) != null) {
								Class11_Sub48 class11_sub48 = new Class11_Sub48();
								((Class11_Sub48) class11_sub48).parameters = (((IComponentDefinitions) Class11_Sub2_Sub32_Sub1.aClass192_9889).anObjectArray2559);
								((Class11_Sub48) class11_sub48).anInt7990 = i_17_;
								((Class11_Sub48) class11_sub48).anInt8001 = i_18_;
								((Class11_Sub48) class11_sub48).aClass192_7999 = Class11_Sub2_Sub32_Sub1.aClass192_9889;
								((Class11_Sub48) class11_sub48).aClass192_7991 = Class42.aClass192_692;
								Class86.method610(class11_sub48);
							}
							if (Class42.aClass192_692 != null
									&& client
											.method4015(Class11_Sub2_Sub32_Sub1.aClass192_9889) != null)
								Class382.method2230(
										false,
										(Class11_Sub2_Sub32_Sub1.aClass192_9889),
										Class42.aClass192_692);
						}
						Class11_Sub2_Sub32_Sub1.aClass192_9889 = null;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pt.I(" + i + ')');
		}
	}

	Class280(Class66 class66, int i, Class146 class146, Class146 class146_21_) {
		try {
			aClass146_3779 = class146;
			((Class280) this).aClass146_3782 = class146_21_;
			aClass146_3779.method914(36, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pt.<init>("
					+ (class66 != null ? "{...}" : "null") + ',' + i + ','
					+ (class146 != null ? "{...}" : "null") + ','
					+ (class146_21_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1731(byte i, int i_22_) {
		try {
			if (i <= -93) {
				synchronized (aClass22_3773) {
					aClass22_3773.method182(i_22_, (byte) -73);
				}
				anInt3775++;
				synchronized (((Class280) this).aClass22_3785) {
					((Class280) this).aClass22_3785
							.method182(i_22_, (byte) -73);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pt.A(" + i + ','
					+ i_22_ + ')');
		}
	}
}
