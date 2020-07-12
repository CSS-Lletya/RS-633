/* Class2_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class2_Sub5 extends Class2 {
	static int anInt5485;
	static int anInt5486;
	static int anInt5487;
	static int anInt5488;
	private boolean aBool5489;
	private boolean aBool5490;
	private Interface7 anInterface7_5491;
	static int anInt5492;
	private Class47 aClass47_5493;
	private float[] aFloatArray5494 = new float[4];
	static int anInt5495;
	static int anInt5496;
	static int anInt5497;
	private boolean aBool5498;
	static OutgoingPacket aClass370_5499 = new OutgoingPacket(53, 7);
	private Class47 aClass47_5500;
	static int anInt5501;
	static int anInt5502;
	static int anInt5503;
	static int anInt5504;
	static int anInt5505;
	static int anInt5506;
	static int anInt5507 = -1;
	private Class47 aClass47_5508;
	static int[] anIntArray5509 = new int[8];
	private boolean aBool5510 = false;
	private Class47 aClass47_5511;

	static final boolean method2400(byte i, int i_0_) {
		try {
			anInt5485++;
			if (i != 35)
				return true;
			if (i_0_ != 10 && i_0_ != 11 && (i_0_ ^ 0xffffffff) != -13)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ak.N(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final boolean method2401(int i) {
		try {
			anInt5503++;
			if (Class2_Sub10.aClass11_Sub45_Sub5_7925 == null)
				return false;
			if ((((Class11_Sub45_Sub5) Class2_Sub10.aClass11_Sub45_Sub5_7925).anInt8760) >= 2000)
				((Class11_Sub45_Sub5) Class2_Sub10.aClass11_Sub45_Sub5_7925).anInt8760 -= 2000;
			if ((short) i == ((Class11_Sub45_Sub5) Class2_Sub10.aClass11_Sub45_Sub5_7925).anInt8760)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ak.D(" + i + ')');
		}
	}

	final void method67(byte i) {
		do {
			try {
				anInt5505++;
				((Class2) this).aClass163_Sub2_13.method3073(1, (byte) 66);
				((Class2) this).aClass163_Sub2_13.method3094(null, -2);
				((Class2) this).aClass163_Sub2_13.method3013(-30,
						Class188.aClass314_2424, Class188.aClass314_2424);
				((Class2) this).aClass163_Sub2_13.method3095((byte) -101,
						Class11_Sub45_Sub12.aClass218_9187, 0);
				int i_1_ = 86 / ((-26 - i) / 56);
				((Class2) this).aClass163_Sub2_13.method3095((byte) -90,
						Class68.aClass218_962, 2);
				((Class2) this).aClass163_Sub2_13.method2993(
						Class11_Sub45_Sub12.aClass218_9187, 0, 256);
				((Class2) this).aClass163_Sub2_13.method3073(0, (byte) 66);
				if (aBool5510) {
					((Class2) this).aClass163_Sub2_13.method3095((byte) -123,
							Class11_Sub45_Sub12.aClass218_9187, 0);
					((Class2) this).aClass163_Sub2_13.method2993(
							Class11_Sub45_Sub12.aClass218_9187, 0, 256);
					aBool5510 = false;
				}
				if (!aBool5498)
					break;
				OpenGL.glBindProgramARB(34336, 0);
				OpenGL.glDisable(34820);
				OpenGL.glDisable(34336);
				aBool5498 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ak.E(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method71(int i, boolean bool) {
		try {
			if (i != 5486)
				method2403(-126);
			anInt5506++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ak.M(" + i + ','
					+ bool + ')');
		}
	}

	static final void method2402(int i, int i_2_, int i_3_, int i_4_, int i_5_,
			int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_,
			int i_12_) {
		try {
			anInt5492++;
			if (Class11_Sub16.method2449(73, i_11_)) {
				if (i_6_ != -1)
					anIntArray5509 = null;
				if (Canvas_Sub1.aClass192ArrayArray9228[i_11_] == null)
					client.method4014(
							(Class11_Sub45_Sub5.aClass192ArrayArray8772[i_11_]),
							-1, i, i_2_, i_10_, i_3_, i_8_, i_4_, i_12_, i_5_,
							i_9_, i_7_);
				else
					client.method4014(
							(Canvas_Sub1.aClass192ArrayArray9228[i_11_]), -1,
							i, i_2_, i_10_, i_3_, i_8_, i_4_, i_12_, i_5_,
							i_9_, i_7_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ak.A(" + i + ','
					+ i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_
					+ ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ','
					+ i_11_ + ',' + i_12_ + ')'));
		}
	}

	static final void method2403(int i) {
		try {
			anInt5495++;
			if (i == -1) {
				for (Class11_Sub15 class11_sub15 = ((Class11_Sub15) Class198.aClass84_2686
						.method584(-12261)); class11_sub15 != null; class11_sub15 = (Class11_Sub15) Class198.aClass84_2686
						.method578(-15361)) {
					if ((((Class11_Sub15) class11_sub15).anInt5600 ^ 0xffffffff) < -1)
						((Class11_Sub15) class11_sub15).anInt5600--;
					if ((((Class11_Sub15) class11_sub15).anInt5600 ^ 0xffffffff) == -1) {
						if ((((Class11_Sub15) class11_sub15).anInt5601 ^ 0xffffffff) > -1
								|| Class117
										.method767(
												((Class11_Sub15) class11_sub15).anInt5604,
												((Class11_Sub15) class11_sub15).anInt5601,
												11)) {
							Player.method3976(
									((Class11_Sub15) class11_sub15).anInt5597,
									((Class11_Sub15) class11_sub15).anInt5596,
									-1,
									((Class11_Sub15) class11_sub15).anInt5604,
									((Class11_Sub15) class11_sub15).anInt5595,
									((Class11_Sub15) class11_sub15).anInt5603,
									((Class11_Sub15) class11_sub15).anInt5601,
									1,
									((Class11_Sub15) class11_sub15).anInt5609);
							class11_sub15.method122(-45);
						}
					} else {
						if (((Class11_Sub15) class11_sub15).anInt5608 > 0)
							((Class11_Sub15) class11_sub15).anInt5608--;
						if (((Class11_Sub15) class11_sub15).anInt5608 == 0
								&& ((Class11_Sub15) class11_sub15).anInt5596 >= 1
								&& ((Class11_Sub15) class11_sub15).anInt5595 >= 1
								&& ((((Class11_Sub15) class11_sub15).anInt5596 ^ 0xffffffff) >= (Class300.anInt4051 - 2 ^ 0xffffffff))
								&& ((Class108_Sub12.anInt6228 - 2 ^ 0xffffffff) <= (((Class11_Sub15) class11_sub15).anInt5595 ^ 0xffffffff))
								&& (((Class11_Sub15) class11_sub15).anInt5602 < 0 || (Class117
										.method767(
												((Class11_Sub15) class11_sub15).anInt5606,
												((Class11_Sub15) class11_sub15).anInt5602,
												11)))) {
							Player.method3976(
									((Class11_Sub15) class11_sub15).anInt5598,
									((Class11_Sub15) class11_sub15).anInt5596,
									-1,
									((Class11_Sub15) class11_sub15).anInt5606,
									((Class11_Sub15) class11_sub15).anInt5595,
									((Class11_Sub15) class11_sub15).anInt5603,
									((Class11_Sub15) class11_sub15).anInt5602,
									1,
									((Class11_Sub15) class11_sub15).anInt5609);
							((Class11_Sub15) class11_sub15).anInt5608 = -1;
							if ((((Class11_Sub15) class11_sub15).anInt5602 == ((Class11_Sub15) class11_sub15).anInt5601)
									&& (((Class11_Sub15) class11_sub15).anInt5601 ^ 0xffffffff) == 0)
								class11_sub15.method122(-45);
							else if ((((((Class11_Sub15) class11_sub15).anInt5602) ^ 0xffffffff) == ((((Class11_Sub15) class11_sub15).anInt5601) ^ 0xffffffff))
									&& (((((Class11_Sub15) class11_sub15).anInt5597) ^ 0xffffffff) == ((((Class11_Sub15) class11_sub15).anInt5598) ^ 0xffffffff))
									&& (((((Class11_Sub15) class11_sub15).anInt5606) ^ 0xffffffff) == ((((Class11_Sub15) class11_sub15).anInt5604) ^ 0xffffffff)))
								class11_sub15.method122(i ^ 0x7b);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ak.C(" + i + ')');
		}
	}

	final void method74(int i) {
		do {
			try {
				anInt5504++;
				if (i != 25411)
					aBool5489 = false;
				if (!aBool5498)
					break;
				int i_13_ = ((Class2) this).aClass163_Sub2_13.XA();
				int i_14_ = ((Class2) this).aClass163_Sub2_13.i();
				float f = (float) i_13_ - (float) (-i_14_ + i_13_) * 0.125F;
				float f_15_ = -((float) (-i_14_ + i_13_) * 0.25F)
						+ (float) i_13_;
				OpenGL.glProgramLocalParameter4fARB(34336, 0, f_15_, f,
						1.0F / (float) ((Class2) this).aClass163_Sub2_13
								.method3077((byte) -123),
						((float) ((Class2) this).aClass163_Sub2_13
								.method2971(119) / 255.0F));
				((Class2) this).aClass163_Sub2_13.method3073(1, (byte) 66);
				((Class2) this).aClass163_Sub2_13.method3062(true,
						((Class2) this).aClass163_Sub2_13.method3074(3));
				((Class2) this).aClass163_Sub2_13.method3073(0, (byte) 66);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ak.L(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method2404(byte i) {
		do {
			try {
				anIntArray5509 = null;
				aClass370_5499 = null;
				if (i == -104)
					break;
				anInt5507 = -40;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ak.H(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method75(int i) {
		try {
			if (i <= 19)
				return true;
			anInt5496++;
			return aBool5490;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ak.B(" + i + ')');
		}
	}

	Class2_Sub5(Class163_Sub2_Sub1 class163_sub2_sub1, Class146 class146) {
		super(class163_sub2_sub1);
		try {
			if (class146 == null
					|| !((Class163_Sub2_Sub1) class163_sub2_sub1).aBool8673)
				aBool5490 = false;
			else {
				aClass47_5493 = Class293.method1817(
						class146.method932("gl", "uw_ground_unlit", 0),
						class163_sub2_sub1, (byte) -19, 34336);
				aClass47_5500 = Class293.method1817(
						class146.method932("gl", "uw_ground_lit", 0),
						class163_sub2_sub1, (byte) -107, 34336);
				aClass47_5508 = Class293.method1817(
						class146.method932("gl", "uw_model_unlit", 0),
						class163_sub2_sub1, (byte) -9, 34336);
				aClass47_5511 = Class293.method1817(
						class146.method932("gl", "uw_model_lit", 0),
						class163_sub2_sub1, (byte) -106, 34336);
				if (aClass47_5508 != null
						& (aClass47_5493 != null & aClass47_5500 != null)
						& aClass47_5511 != null) {
					anInterface7_5491 = (((Class2) this).aClass163_Sub2_13
							.method3075(1, new int[] { 0, -1 }, false, 2, false));
					anInterface7_5491.method26(28970, false, false);
					aBool5490 = true;
				} else
					aBool5490 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ak.<init>("
					+ (class163_sub2_sub1 != null ? "{...}" : "null") + ','
					+ (class146 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2405(int i, int i_16_, byte i_17_, int i_18_,
			String string, int i_19_, int i_20_, Class163 class163) {
		try {
			if (Class300.aClass253_4052 == null
					|| Class11_Sub2_Sub22.aClass253_9203 == null) {
				if (Class108_Sub7.aClass146_5636.method918(
						Class321_Sub2.anInt6647, -89)
						&& Class108_Sub7.aClass146_5636.method918(
								Class49.anInt754, -64)) {
					Class300.aClass253_4052 = (class163.method1081(Class80
							.method545(Class108_Sub7.aClass146_5636,
									Class321_Sub2.anInt6647, 0), true));
					Class80 class80 = Class80.method545(
							Class108_Sub7.aClass146_5636, Class49.anInt754, 0);
					Class11_Sub2_Sub22.aClass253_9203 = class163.method1081(
							class80, true);
					class80.method547();
					Class124.aClass253_1679 = class163
							.method1081(class80, true);
				} else
					class163.aa(
							i,
							i_19_,
							i_18_,
							i_16_,
							(-Class366.anInt4813 + 255 << 24 | Class42.anInt632),
							1);
			}
			anInt5488++;
			if (i_17_ == -111) {
				if (Class300.aClass253_4052 != null
						&& Class11_Sub2_Sub22.aClass253_9203 != null) {
					int i_21_ = ((-(2 * Class11_Sub2_Sub22.aClass253_9203
							.method1609()) + i_18_) / Class300.aClass253_4052
							.method1609());
					for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > (i_21_ ^ 0xffffffff); i_22_++)
						Class300.aClass253_4052
								.method1610(
										i
												- (-Class11_Sub2_Sub22.aClass253_9203
														.method1609() + -(Class300.aClass253_4052
														.method1609() * i_22_)),
										i_19_);
					Class11_Sub2_Sub22.aClass253_9203.method1610(i, i_19_);
					Class124.aClass253_1679
							.method1610((i - -i_18_ + -Class124.aClass253_1679
									.method1609()), i_19_);
				}
				Class98.aClass107_1308.method708(i + 3, 173,
						(~0xffffff | Class329.anInt4375), 14 + i_19_, string,
						-1);
				class163.aa(i, i_19_ - -i_16_, i_18_, i_20_ - i_16_,
						Class42.anInt632 | -Class366.anInt4813 + 255 << 24, 1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ak.O(" + i + ',' + i_16_ + ',' + i_17_ + ',' + i_18_
							+ ',' + (string != null ? "{...}" : "null") + ','
							+ i_19_ + ',' + i_20_ + ','
							+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method78(int i, int i_23_, int i_24_) {
		do {
			try {
				anInt5497++;
				if (i_23_ >= 91)
					break;
				method2403(7);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ak.J(" + i + ','
						+ i_23_ + ',' + i_24_ + ')'));
			}
			break;
		} while (false);
	}

	final void method70(Interface15 interface15, int i, int i_25_) {
		try {
			do {
				if (interface15 == null) {
					if (aBool5510)
						break;
					((Class2) this).aClass163_Sub2_13
							.method3094(
									(((Class163_Sub2) ((Class2) this).aClass163_Sub2_13).anInterface15_7637),
									-2);
					((Class2) this).aClass163_Sub2_13.method3037((byte) 110, 1);
					((Class2) this).aClass163_Sub2_13.method3095((byte) -121,
							Class6.aClass218_42, 0);
					((Class2) this).aClass163_Sub2_13.method2993(
							Class6.aClass218_42, 0, i_25_ ^ 0x103);
					aBool5510 = true;
					if (!client.aBool10531)
						break;
				}
				if (aBool5510) {
					((Class2) this).aClass163_Sub2_13.method3095((byte) -99,
							Class11_Sub45_Sub12.aClass218_9187, 0);
					((Class2) this).aClass163_Sub2_13.method2993(
							Class11_Sub45_Sub12.aClass218_9187, 0, 256);
					aBool5510 = false;
				}
				((Class2) this).aClass163_Sub2_13.method3094(interface15, -2);
				((Class2) this).aClass163_Sub2_13.method3037((byte) 120, i);
			} while (false);
			if (i_25_ != 3)
				aBool5498 = false;
			anInt5501++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ak.I("
					+ (interface15 != null ? "{...}" : "null") + ',' + i + ','
					+ i_25_ + ')'));
		}
	}

	static final void method2406(int i) {
		try {
			for (Class11_Sub45_Sub14 class11_sub45_sub14 = ((Class11_Sub45_Sub14) Class161.aClass38_2097
					.method331((byte) -7)); class11_sub45_sub14 != null; class11_sub45_sub14 = ((Class11_Sub45_Sub14) Class161.aClass38_2097
					.method333(-101))) {
				if ((((Class11_Sub45_Sub14) class11_sub45_sub14).anInt9313 ^ 0xffffffff) < -2) {
					((Class11_Sub45_Sub14) class11_sub45_sub14).anInt9313 = 0;
					Class196.aClass22_2661
							.method184(
									(byte) 126,
									class11_sub45_sub14,
									((Class11_Sub45_Sub5) (Class11_Sub45_Sub5) (((Class11_Sub45) (((Class38) (((Class11_Sub45_Sub14) class11_sub45_sub14).aClass38_9312)).aClass11_Sub45_515)).aClass11_Sub45_7903)).aLong8763);
					((Class11_Sub45_Sub14) class11_sub45_sub14).aClass38_9312
							.method334(3);
				}
			}
			if (i != -2)
				anInt5507 = 71;
			anInt5502++;
			Class52.anInt802 = 0;
			Class307.anInt4123 = 0;
			Class94_Sub1.aClass84_5220.method586((byte) -19);
			Class376_Sub7_Sub5_Sub4.aClass213_10131.method1364((byte) 90);
			Class161.aClass38_2097.method334(3);
			Class84.method587(Class270.aClass11_Sub45_Sub5_3648, false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ak.F(" + i + ')');
		}
	}

	final void method73(int i) {
		try {
			anInt5487++;
			int i_26_ = ((Class2) this).aClass163_Sub2_13.method2973(0);
			if (i > -62)
				method2405(-73, 22, (byte) 89, 107, null, -66, 94, null);
			Class33_Sub2 class33_sub2 = ((Class2) this).aClass163_Sub2_13
					.method3024(-46);
			do {
				if (!aBool5489) {
					OpenGL.glBindProgramARB(
							34336,
							((i_26_ ^ 0xffffffff) != -2147483648 ? ((Class47) aClass47_5508).anInt736
									: ((Class47) aClass47_5493).anInt736));
					if (!client.aBool10531)
						break;
				}
				OpenGL.glBindProgramARB(
						34336,
						((i_26_ ^ 0xffffffff) == -2147483648 ? ((Class47) aClass47_5500).anInt736
								: (((Class47) aClass47_5511).anInt736)));
			} while (false);
			OpenGL.glEnable(34336);
			aBool5498 = true;
			class33_sub2.method2763((float) i_26_, 0, 0.0F, -1.0F, 0.0F,
					aFloatArray5494);
			OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray5494[0],
					aFloatArray5494[1], aFloatArray5494[2], aFloatArray5494[3]);
			method74(25411);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ak.K(" + i + ')');
		}
	}

	final void method68(boolean bool, int i) {
		try {
			aBool5489 = bool;
			anInt5486++;
			if (i > -64)
				aClass47_5500 = null;
			((Class2) this).aClass163_Sub2_13.method3073(1, (byte) 66);
			((Class2) this).aClass163_Sub2_13.method3094(anInterface7_5491, -2);
			((Class2) this).aClass163_Sub2_13.method3013(-30,
					(Class11_Sub2_Sub19.aClass314_9092),
					(Class121.aClass314_1643));
			((Class2) this).aClass163_Sub2_13.method3095((byte) -100,
					Class68.aClass218_962, 0);
			((Class2) this).aClass163_Sub2_13.method3089(false,
					(Class11_Sub45_Sub12.aClass218_9187), 2, true, false);
			((Class2) this).aClass163_Sub2_13.method2993(Class6.aClass218_42,
					0, 256);
			((Class2) this).aClass163_Sub2_13.method3073(0, (byte) 66);
			method73(-97);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ak.G(" + bool + ','
					+ i + ')');
		}
	}
}
