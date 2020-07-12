/* Class234_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class234_Sub1_Sub1 extends Class234_Sub1 {
	private int anInt9716;
	static int anInt9717;
	private int anInt9718;
	private Interface12 anInterface12_9719;
	static IncomingPacket ICOMPONENT_TEXT_IN_PACKET = new IncomingPacket(64, -2);
	static int anInt9721;
	static int anInt9722;
	private int anInt9723;
	private Class163_Sub2 aClass163_Sub2_9724;
	static int anInt9725;
	private int anInt9726;
	static int anInt9727;
	private int anInt9728;
	static Class12[] aClass12Array9729;
	static int anInt9730 = 0;
	static boolean aBool9731 = false;
	private int anInt9732;
	static int[] anIntArray9733 = new int[64];
	static int anInt9734;

	static final int method3824(boolean bool, int i, int i_0_) {
		try {
			anInt9721++;
			int i_1_ = (Class11_Sub45_Sub12.method3592(i_0_ - -91923, 4,
					(byte) 93, 45365 + i) - (128 + (-(Class11_Sub45_Sub12
					.method3592(i_0_ + 37821, 2, (byte) 93, 10294 + i) - 128 >> 1) + -(-128
					+ Class11_Sub45_Sub12.method3592(i_0_, 1, (byte) 93, i) >> 2))));
			i_1_ = 35 + (int) (0.3 * (double) i_1_);
			do {
				if ((i_1_ ^ 0xffffffff) > -11) {
					i_1_ = 10;
					if (!client.aBool10531)
						break;
				}
				if (i_1_ > 60)
					i_1_ = 60;
			} while (false);
			if (bool != false)
				return 43;
			return i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vr.D(" + bool + ','
					+ i + ',' + i_0_ + ')'));
		}
	}

	static final void method3825(int i) {
		try {
			anInt9727++;
			Class11_Sub12_Sub2
					.method3560(
							((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub29_5689
									.method3230(false), false);
			int i_2_ = ((Class11_Sub45_Sub11.anInt9157 >> 12) + (Class194.anInt2641 >> 3));
			Class376_Sub7_Sub2.anInt9242 = ((Class376_Sub7) Class11_Sub2_Sub8.myPlayer).aByte7047 = (byte) 0;
			int i_3_ = (Class303.anInt4088 >> 12) + (Class118.anInt1605 >> 3);
			Class11_Sub2_Sub8.myPlayer.method3973(8, (byte) -40, i);
			int i_4_ = 18;
			Class345.anIntArray4585 = new int[i_4_];
			Class256.anIntArray3507 = new int[i_4_];
			Class11_Sub2_Sub23.aByteArrayArray9266 = new byte[i_4_][];
			Class373.anIntArray4880 = new int[i_4_];
			Class11_Sub35.aByteArrayArray7006 = new byte[i_4_][];
			Class2_Sub9.anIntArray7281 = new int[i_4_];
			Class11_Sub45_Sub21.aByteArrayArray9775 = new byte[i_4_][];
			Class376_Sub2.aByteArrayArray5568 = new byte[i_4_][];
			Class253_Sub2.anIntArray6535 = new int[i_4_];
			Class183.anIntArray2362 = new int[i_4_];
			Class321_Sub2.anIntArrayArray6639 = new int[i_4_][4];
			Class11_Sub45_Sub16_Sub2.aByteArrayArray10171 = new byte[i_4_][];
			i_4_ = 0;
			for (int i_5_ = (-(Class300.anInt4051 >> 4) + i_2_) / 8; ((i_5_ ^ 0xffffffff) >= (((Class300.anInt4051 >> 4) + i_2_) / 8 ^ 0xffffffff)); i_5_++) {
				for (int i_6_ = (-(Class108_Sub12.anInt6228 >> 4) + i_3_) / 8; ((i_6_ ^ 0xffffffff) >= ((i_3_ - -(Class108_Sub12.anInt6228 >> 4)) / 8 ^ 0xffffffff)); i_6_++) {
					int i_7_ = i_6_ + (i_5_ << 8);
					Class183.anIntArray2362[i_4_] = i_7_;
					Class345.anIntArray4585[i_4_] = Class14.aClass146_125
							.method920(-86, "m" + i_5_ + "_" + i_6_);
					Class256.anIntArray3507[i_4_] = (Class14.aClass146_125
							.method920(Class77.method527(i, -68), "l" + i_5_
									+ "_" + i_6_));
					Class373.anIntArray4880[i_4_] = Class14.aClass146_125
							.method920(-69, "n" + i_5_ + "_" + i_6_);
					Class253_Sub2.anIntArray6535[i_4_] = Class14.aClass146_125
							.method920(-72, "um" + i_5_ + "_" + i_6_);
					Class2_Sub9.anIntArray7281[i_4_] = Class14.aClass146_125
							.method920(-18, "ul" + i_5_ + "_" + i_6_);
					if ((Class373.anIntArray4880[i_4_] ^ 0xffffffff) == 0) {
						Class345.anIntArray4585[i_4_] = -1;
						Class256.anIntArray3507[i_4_] = -1;
						Class253_Sub2.anIntArray6535[i_4_] = -1;
						Class2_Sub9.anIntArray7281[i_4_] = -1;
					}
					i_4_++;
				}
			}
			for (int i_8_ = i_4_; ((i_8_ ^ 0xffffffff) > (Class373.anIntArray4880.length ^ 0xffffffff)); i_8_++) {
				Class373.anIntArray4880[i_8_] = -1;
				Class345.anIntArray4585[i_8_] = -1;
				Class256.anIntArray3507[i_8_] = -1;
				Class253_Sub2.anIntArray6535[i_8_] = -1;
				Class2_Sub9.anIntArray7281[i_8_] = -1;
			}
			int i_9_;
			if (Class285.anInt3846 == 3)
				i_9_ = 4;
			else
				i_9_ = 8;
			Class124.method811(i_9_, false, i_2_, i_3_, false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vr.G(" + i + ')');
		}
	}

	public static void method3826(int i) {
		try {
			anIntArray9733 = null;
			aClass12Array9729 = null;
			if (i == -6804)
				ICOMPONENT_TEXT_IN_PACKET = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vr.H(" + i + ')');
		}
	}

	static final void method3827() {
		for (int i = Class11_Sub45_Sub7.anInt8803; i < Class155.anInt2044; i++) {
			for (int i_10_ = 0; i_10_ < Class138.anInt1886; i_10_++) {
				for (int i_11_ = 0; i_11_ < Class82.anInt1133; i_11_++) {
					Class364 class364 = (Class181.aClass364ArrayArrayArray2336[i][i_10_][i_11_]);
					if (class364 != null) {
						Class376_Sub7_Sub3 class376_sub7_sub3 = ((Class364) class364).aClass376_Sub7_Sub3_4780;
						Class376_Sub7_Sub3 class376_sub7_sub3_12_ = ((Class364) class364).aClass376_Sub7_Sub3_4776;
						if (class376_sub7_sub3 != null
								&& class376_sub7_sub3.method2862(-110)) {
							Class11_Sub45_Sub1_Sub1.method3870(
									class376_sub7_sub3, i, i_10_, i_11_, 1, 1);
							if (class376_sub7_sub3_12_ != null
									&& class376_sub7_sub3_12_.method2862(-113)) {
								Class11_Sub45_Sub1_Sub1.method3870(
										class376_sub7_sub3_12_, i, i_10_,
										i_11_, 1, 1);
								class376_sub7_sub3_12_.method2871(false,
										Class87.aClass163_1210, 0, 0,
										class376_sub7_sub3, 22501, 0);
								class376_sub7_sub3_12_.method2872(26062);
							}
							class376_sub7_sub3.method2872(26062);
						}
						for (Class140 class140 = ((Class364) class364).aClass140_4781; class140 != null; class140 = ((Class140) class140).aClass140_1895) {
							Class376_Sub7_Sub5 class376_sub7_sub5 = (((Class140) class140).aClass376_Sub7_Sub5_1896);
							if (class376_sub7_sub5 != null
									&& class376_sub7_sub5.method2862(-122)) {
								Class11_Sub45_Sub1_Sub1
										.method3870(
												class376_sub7_sub5,
												i,
												i_10_,
												i_11_,
												(((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9624
														- ((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9626 + 1),
												(((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9620
														- ((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9629 + 1));
								class376_sub7_sub5.method2872(26062);
							}
						}
						Class376_Sub7_Sub2 class376_sub7_sub2 = ((Class364) class364).aClass376_Sub7_Sub2_4777;
						if (class376_sub7_sub2 != null
								&& class376_sub7_sub2.method2862(-108)) {
							Class11_Sub45_Sub18.method3756(class376_sub7_sub2,
									i, i_10_, i_11_);
							class376_sub7_sub2.method2872(26062);
						}
					}
				}
			}
		}
	}

	static final void method3828(long[] ls, int i, Object[] objects) {
		try {
			anInt9717++;
			Class11_Sub46_Sub2.method3554(i, i ^ 0x7268, ls, ls.length - 1,
					objects);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vr.E("
					+ (ls != null ? "{...}" : "null") + ',' + i + ','
					+ (objects != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3829(boolean bool) {
		do {
			try {
				if (Class11_Sub19.anIntArray5818 == null
						|| Class191.anIntArray2457 == null) {
					Class11_Sub19.anIntArray5818 = new int[256];
					Class191.anIntArray2457 = new int[256];
					for (int i = 0; (i ^ 0xffffffff) > -257; i++) {
						double d = (double) i / 255.0 * 6.283185307179586;
						Class11_Sub19.anIntArray5818[i] = (int) (4096.0 * Math
								.sin(d));
						Class191.anIntArray2457[i] = (int) (Math.cos(d) * 4096.0);
					}
				}
				anInt9722++;
				if (bool == false)
					break;
				aBool9731 = true;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "vr.C(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	final Interface12 method2439(int i) {
		try {
			anInt9725++;
			if (anInterface12_9719 == null) {
				Class108_Sub11.anIntArray6149[4] = anInt9723;
				Class108_Sub11.anIntArray6149[1] = anInt9728;
				Class108_Sub11.anIntArray6149[0] = anInt9732;
				Class108_Sub11.anIntArray6149[3] = anInt9726;
				Class108_Sub11.anIntArray6149[2] = anInt9718;
				Class108_Sub11.anIntArray6149[5] = anInt9716;
				Interface1 interface1 = ((Class163) aClass163_Sub2_9724).anInterface1_2118;
				int i_13_ = 0;
				int i_14_ = 0;
				for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -7; i_15_++) {
					if (!interface1.method2(
							(Class108_Sub11.anIntArray6149[i_15_]), i + 107))
						return null;
					Class188 class188 = interface1.method7((byte) 127,
							(Class108_Sub11.anIntArray6149[i_15_]));
					int i_16_ = ((Class188) class188).aBool2430 ? 64 : 128;
					if (i_14_ < i_16_)
						i_14_ = i_16_;
					if ((((Class188) class188).aByte2422 ^ 0xffffffff) < -1)
						i_13_ = 1;
				}
				for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > -7; i_17_++)
					Class11_Sub2_Sub5.anIntArrayArray8553[i_17_] = interface1
							.method6(false, i_14_, 20377, i_14_, 1.0F,
									(Class108_Sub11.anIntArray6149[i_17_]));
				anInterface12_9719 = aClass163_Sub2_9724.method3060(i_14_,
						(Class11_Sub2_Sub5.anIntArrayArray8553), (byte) 76,
						((i_13_ ^ 0xffffffff) != -1));
			}
			if (i != 14)
				return null;
			return anInterface12_9719;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vr.B(" + i + ')');
		}
	}

	Class234_Sub1_Sub1(Class163_Sub2 class163_sub2, int i, int i_18_,
			int i_19_, int i_20_, int i_21_, int i_22_) {
		try {
			anInt9723 = i_21_;
			aClass163_Sub2_9724 = class163_sub2;
			anInt9718 = i_19_;
			anInt9728 = i_18_;
			anInt9716 = i_22_;
			anInt9726 = i_20_;
			anInt9732 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vr.<init>("
					+ (class163_sub2 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + i_21_
					+ ',' + i_22_ + ')'));
		}
	}
}
