/* Class278 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

final class Class278 {
	static int anInt3748;
	int anInt3749;
	private Interface27 anInterface27_3750;
	private int anInt3751;
	private int anInt3752;
	private Interface7 anInterface7_3753;
	static int anInt3754;
	static IncomingPacket aClass160_3755 = new IncomingPacket(55, 4);
	private Class163_Sub2 aClass163_Sub2_3756;
	private Class226 aClass226_3757;
	private int anInt3758;
	static int anInt3759;
	private int anInt3760 = -1;
	boolean aBool3761 = true;
	static Class253[] aClass253Array3762;
	static int anInt3763;
	static int anInt3764 = 0;
	private static char[] aCharArray3765 = new char[64];
	private int anInt3766;
	static int anInt3767;

	static final void method1714(boolean bool, Class146 class146) {
		try {
			Class11_Sub45_Sub14.anInt9318 = class146.method920(119, "p11_full");
			if (bool == false) {
				anInt3748++;
				Class372.anInt4874 = class146.method920(117, "p12_full");
				Class58_Sub2.anInt7839 = class146.method920(115, "b12_full");
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pp.B(" + bool + ','
					+ (class146 != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method1715(int i, Class11_Sub45_Sub5 class11_sub45_sub5) {
		try {
			anInt3759++;
			String string = Class164.method1091(class11_sub45_sub5, -127);
			int[] is = null;
			if (!Class135.method872(-46,
					(((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760))) {
				if ((((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8759 ^ 0xffffffff) != 0)
					is = ((Class249) (Packet.aClass223_8723
							.method1430(
									(((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8759),
									false))).anIntArray3368;
				else if (Class26.method221(
						((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760,
						(byte) -94)) {
					Class11_Sub25 class11_sub25 = ((Class11_Sub25) (Class11_Sub2_Sub25.aClass213_9322
							.method1369(
									(byte) 26,
									(long) (int) ((Class11_Sub45_Sub5) class11_sub45_sub5).aLong8771)));
					if (class11_sub25 != null) {
						Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) class11_sub25).aNpc_2373);
						NPCDefinitions class215 = (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501);
						if (((NPCDefinitions) class215).anIntArray2950 != null)
							class215 = class215.method1375((byte) 29,
									(Class11_Sub26.aClass97_6296));
						if (class215 != null)
							is = ((NPCDefinitions) class215).anIntArray2925;
					}
				} else if (Class11_Sub45_Sub16_Sub2.method3931(8071,
						(((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760))) {
					Object object = null;
					Class42 class42;
					if ((((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760 ^ 0xffffffff) != -1005)
						class42 = (Class11_Sub4.aClass290_5237
								.method1793(
										(byte) -117,
										(int) ((((Class11_Sub45_Sub5) class11_sub45_sub5).aLong8771) >>> 32 & 0x7fffffffL)));
					else
						class42 = (Class11_Sub4.aClass290_5237
								.method1793(
										(byte) 117,
										(int) ((Class11_Sub45_Sub5) class11_sub45_sub5).aLong8771));
					if (((Class42) class42).anIntArray683 != null)
						class42 = class42.method380(
								Class11_Sub26.aClass97_6296, i ^ 0x4);
					if (class42 != null)
						is = ((Class42) class42).anIntArray676;
				}
			} else
				is = ((Class249) (Packet.aClass223_8723
						.method1430(
								(int) ((Class11_Sub45_Sub5) class11_sub45_sub5).aLong8771,
								false))).anIntArray3368;
			if (i != 4)
				method1715(101, null);
			if (is != null)
				string += Class11_Sub32.method2795(is, (byte) 104);
			int i_0_ = Class256_Sub1.aClass292_5320.method1804(
					Class46.aClass253Array722, 15, string);
			if (((Class11_Sub45_Sub5) class11_sub45_sub5).aBool8768)
				i_0_ += 4 + Class108.aClass253_1464.method1609();
			return i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pp.C(" + i + ','
					+ (class11_sub45_sub5 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1716(byte i) {
		try {
			aClass253Array3762 = null;
			if (i != 28)
				aClass253Array3762 = null;
			aClass160_3755 = null;
			aCharArray3765 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pp.D(" + i + ')');
		}
	}

	final void method1717(int i, Interface27 interface27, int i_1_) {
		do {
			try {
				anInt3754++;
				if (i_1_ > 0) {
					method1718((byte) -99);
					aClass163_Sub2_3756.method3094(anInterface7_3753, -2);
					aClass163_Sub2_3756.method3063(1 + anInt3766 + -anInt3752,
							i_1_, Class346.aClass183_4590, -17390, anInt3752,
							interface27, 0);
				}
				if (i == 20369)
					break;
				anInterface7_3753 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("pp.A(" + i + ','
								+ (interface27 != null ? "{...}" : "null")
								+ ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	private final void method1718(byte i) {
		try {
			anInt3767++;
			if (((Class278) this).aBool3761) {
				((Class278) this).aBool3761 = false;
				byte[] is = ((Class226) aClass226_3757).aByteArray3106;
				int i_2_ = 0;
				int i_3_ = ((Class226) aClass226_3757).anInt3120;
				int i_4_ = (anInt3758 * ((Class226) aClass226_3757).anInt3120 + anInt3751);
				if (i == -99) {
					for (int i_5_ = -128; (i_5_ ^ 0xffffffff) > -1; i_5_++) {
						i_2_ = -i_2_ + (i_2_ << 8);
						for (int i_6_ = -128; i_6_ < 0; i_6_++) {
							if ((is[i_4_++] ^ 0xffffffff) != -1)
								i_2_++;
						}
						i_4_ += -128 + i_3_;
					}
					if (anInterface7_3753 != null
							&& (i_2_ ^ 0xffffffff) == (anInt3760 ^ 0xffffffff))
						((Class278) this).aBool3761 = false;
					else {
						anInt3760 = i_2_;
						i_4_ = anInt3751 + i_3_ * anInt3758;
						int i_7_ = 0;
						if (aClass163_Sub2_3756.method3009(
								(Class366.aClass366_4808),
								(Class128.aClass98_1726), (byte) -45)) {
							if (Class206_Sub2.aByteArray6439 == null)
								Class206_Sub2.aByteArray6439 = new byte[16384];
							byte[] is_8_ = Class206_Sub2.aByteArray6439;
							for (int i_9_ = -128; (i_9_ ^ 0xffffffff) > -1; i_9_++) {
								for (int i_10_ = -128; (i_10_ ^ 0xffffffff) > -1; i_10_++) {
									if (is[i_4_] == 0) {
										int i_11_ = 0;
										if (is[-1 + i_4_] != 0)
											i_11_++;
										if (is[1 + i_4_] != 0)
											i_11_++;
										if ((is[-i_3_ + i_4_] ^ 0xffffffff) != -1)
											i_11_++;
										if ((is[i_3_ + i_4_] ^ 0xffffffff) != -1)
											i_11_++;
										is_8_[i_7_++] = (byte) (17 * i_11_);
									} else
										is_8_[i_7_++] = (byte) 68;
									i_4_++;
								}
								i_4_ += -128
										+ (((Class226) aClass226_3757).anInt3120);
							}
							if (anInterface7_3753 != null)
								anInterface7_3753.method23(0,
										Class128.aClass98_1726, 128, 0, 128,
										Class206_Sub2.aByteArray6439, true,
										128, 0);
							else {
								anInterface7_3753 = (aClass163_Sub2_3756
										.method3011(false,
												Class128.aClass98_1726,
												Class206_Sub2.aByteArray6439,
												108, 128, 128));
								anInterface7_3753.method26(28970, false, false);
							}
						} else {
							if (Class198.anIntArray2685 == null)
								Class198.anIntArray2685 = new int[16384];
							int[] is_12_ = Class198.anIntArray2685;
							for (int i_13_ = -128; (i_13_ ^ 0xffffffff) > -1; i_13_++) {
								for (int i_14_ = -128; (i_14_ ^ 0xffffffff) > -1; i_14_++) {
									if (is[i_4_] == 0) {
										int i_15_ = 0;
										if (is[-1 + i_4_] != 0)
											i_15_++;
										if ((is[i_4_ + 1] ^ 0xffffffff) != -1)
											i_15_++;
										if ((is[i_4_ - i_3_] ^ 0xffffffff) != -1)
											i_15_++;
										if (is[i_3_ + i_4_] != 0)
											i_15_++;
										is_12_[i_7_++] = 17 * i_15_ << 24;
									} else
										is_12_[i_7_++] = 1140850688;
									i_4_++;
								}
								i_4_ += -128
										+ (((Class226) aClass226_3757).anInt3120);
							}
							if (anInterface7_3753 == null) {
								anInterface7_3753 = (aClass163_Sub2_3756
										.method3075(128,
												Class198.anIntArray2685, false,
												128, false));
								anInterface7_3753.method26(28970, false, false);
							} else
								anInterface7_3753.method25(128, 128,
										(Class198.anIntArray2685), 0, true, 0,
										128, 0);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pp.E(" + i + ')');
		}
	}

	final void method1719(int i) {
		try {
			if (i == 0) {
				method1717(20369, anInterface27_3750,
						((Class278) this).anInt3749);
				anInt3763++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pp.F(" + i + ')');
		}
	}

	Class278(Class163_Sub2 class163_sub2, Class226 class226,
			Class12_Sub1 class12_sub1, int i, int i_16_, int i_17_, int i_18_,
			int i_19_) {
		try {
			anInt3758 = i_19_;
			aClass163_Sub2_3756 = class163_sub2;
			aClass226_3757 = class226;
			anInt3751 = i_18_;
			int i_20_ = 1 << i_17_;
			int i_21_ = 0;
			int i_22_ = i << i_17_;
			int i_23_ = i_16_ << i_17_;
			for (int i_24_ = 0; (i_20_ ^ 0xffffffff) < (i_24_ ^ 0xffffffff); i_24_++) {
				int i_25_ = (i_22_ + (i_23_ - -i_24_)
						* ((Class12) class12_sub1).anInt103);
				for (int i_26_ = 0; i_20_ > i_26_; i_26_++) {
					short[] is = (((Class12_Sub1) class12_sub1).aShortArrayArray5125[i_25_++]);
					if (is != null)
						i_21_ += is.length;
				}
			}
			if ((i_21_ ^ 0xffffffff) >= -1) {
				((Class278) this).anInt3749 = 0;
				anInterface7_3753 = null;
			} else {
				anInt3766 = -2147483648;
				anInt3752 = 2147483647;
				anInterface27_3750 = aClass163_Sub2_3756.method3016((byte) 111,
						false);
				anInterface27_3750.method17(i_21_, (byte) -92);
				for (int i_27_ = 0; (i_27_ ^ 0xffffffff) > -5; i_27_++) {
					Buffer buffer = anInterface27_3750.method12(27599, true);
					if (buffer != null) {
						jaclib.memory.Stream stream = aClass163_Sub2_3756
								.method3098(buffer, true);
						if (jaclib.memory.Stream.method353()) {
							for (int i_28_ = 0; i_20_ > i_28_; i_28_++) {
								int i_29_ = (i_22_ + (((Class12) class12_sub1).anInt103 * (i_23_ + i_28_)));
								for (int i_30_ = 0; ((i_20_ ^ 0xffffffff) < (i_30_ ^ 0xffffffff)); i_30_++) {
									short[] is = (((Class12_Sub1) class12_sub1).aShortArrayArray5125[i_29_++]);
									if (is != null) {
										for (int i_31_ = 0; ((i_31_ ^ 0xffffffff) > (is.length ^ 0xffffffff)); i_31_++) {
											int i_32_ = 0xffff & is[i_31_];
											if ((i_32_ ^ 0xffffffff) > (anInt3752 ^ 0xffffffff))
												anInt3752 = i_32_;
											if (anInt3766 < i_32_)
												anInt3766 = i_32_;
											stream.method345(i_32_);
										}
									}
								}
							}
						} else {
							for (int i_33_ = 0; i_33_ < i_20_; i_33_++) {
								int i_34_ = (i_22_ + (((Class12) class12_sub1).anInt103 * (i_33_ + i_23_)));
								for (int i_35_ = 0; i_35_ < i_20_; i_35_++) {
									short[] is = (((Class12_Sub1) class12_sub1).aShortArrayArray5125[i_34_++]);
									if (is != null) {
										for (int i_36_ = 0; ((i_36_ ^ 0xffffffff) > (is.length ^ 0xffffffff)); i_36_++) {
											int i_37_ = is[i_36_] & 0xffff;
											if ((i_37_ ^ 0xffffffff) > (anInt3752 ^ 0xffffffff))
												anInt3752 = i_37_;
											if ((anInt3766 ^ 0xffffffff) > (i_37_ ^ 0xffffffff))
												anInt3766 = i_37_;
											stream.method346(i_37_);
										}
									}
								}
							}
						}
						stream.method347();
						if (anInterface27_3750.method40((byte) 117))
							break;
					}
				}
				((Class278) this).anInt3749 = i_21_ / 3;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pp.<init>("
					+ (class163_sub2 != null ? "{...}" : "null") + ','
					+ (class226 != null ? "{...}" : "null") + ','
					+ (class12_sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ')'));
		}
	}

	static {
		for (int i = 0; i < 26; i++)
			aCharArray3765[i] = (char) (65 + i);
		for (int i = 26; (i ^ 0xffffffff) > -53; i++)
			aCharArray3765[i] = (char) (71 + i);
		for (int i = 52; i < 62; i++)
			aCharArray3765[i] = (char) (-52 + (48 + i));
		aCharArray3765[62] = '*';
		aCharArray3765[63] = '-';
	}
}
