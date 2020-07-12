/* Class163_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Rectangle;

import jaggl.MapBuffer;
import jaggl.OpenGL;

final class Class163_Sub2_Sub1 extends Class163_Sub2 {
	static int anInt8563;
	static int anInt8564;
	static Class22 aClass22_8565;
	static int anInt8566;
	static int anInt8567;
	static int anInt8568;
	static int anInt8569;
	static int anInt8570;
	static int anInt8571;
	static int anInt8572;
	static int anInt8573;
	static int anInt8574;
	static int anInt8575;
	static int anInt8576;
	static int anInt8577;
	static int anInt8578;
	static int anInt8579;
	static int anInt8580;
	static int anInt8581;
	static int anInt8582;
	static int anInt8583;
	static int anInt8584;
	static int anInt8585;
	static int anInt8586;
	static int anInt8587;
	static int anInt8588;
	static int anInt8589;
	static int anInt8590;
	static int anInt8591;
	static int anInt8592;
	static int anInt8593;
	static int anInt8594;
	static int anInt8595;
	static int anInt8596;
	static int anInt8597;
	static int anInt8598;
	static int anInt8599;
	static int anInt8600;
	static int anInt8601;
	static int anInt8602;
	static int anInt8603;
	static int anInt8604;
	static int anInt8605;
	static int anInt8606;
	static int anInt8607;
	static int anInt8608;
	static int anInt8609;
	static int anInt8610;
	static int anInt8611;
	static int anInt8612;
	static int anInt8613;
	static int anInt8614;
	static int anInt8615;
	static int anInt8616;
	static int anInt8617;
	static int anInt8618;
	static int anInt8619;
	static int anInt8620;
	static int anInt8621;
	static int anInt8622;
	static int anInt8623;
	static int anInt8624;
	static int anInt8625;
	static int anInt8626;
	static int anInt8627;
	private Class84 aClass84_8628 = new Class84();
	static int anInt8629;
	static int anInt8630;
	static int anInt8631;
	static int anInt8632;
	static int anInt8633;
	static int anInt8634;
	static int anInt8635;
	static int anInt8636;
	static int anInt8637;
	static int anInt8638;
	static int anInt8639;
	static int anInt8640;
	static int anInt8641;
	static int anInt8642;
	private OpenGL anOpenGL8643;
	static int anInt8644;
	static int anInt8645;
	static int anInt8646;
	static int anInt8647;
	static int anInt8648;
	static int anInt8649 = 0;
	static int anInt8650;
	static int anInt8651;
	static int anInt8652;
	static int anInt8653;
	private Class84 aClass84_8654 = new Class84();
	static int anInt8655;
	private Class84 aClass84_8656 = new Class84();
	static int anInt8657;
	private Class84 aClass84_8658 = new Class84();
	private Class84 aClass84_8659 = new Class84();
	private Class84 aClass84_8660 = new Class84();
	private Class84 aClass84_8661 = new Class84();
	private boolean aBool8662;
	private boolean aBool8663;
	private boolean aBool8664;
	private Class251_Sub2[] aClass251_Sub2Array8665 = new Class251_Sub2[16];
	private boolean aBool8666;
	private long aLong8667;
	MapBuffer aMapBuffer8668 = new MapBuffer();
	private int anInt8669;
	private boolean aBool8670;
	MapBuffer aMapBuffer8671 = new MapBuffer();
	boolean aBool8672;
	boolean aBool8673;
	private String aString8674;
	private String aString8675;
	private int anInt8676;
	int anInt8677;
	int[] anIntArray8678;
	private boolean aBool8679;
	private int anInt8680 = 0;
	boolean aBool8681;
	boolean aBool8682;
	private boolean aBool8683;

	final Object method3000(Canvas canvas, byte i) {
		try {
			anInt8592++;
			int i_0_ = -18 % ((24 - i) / 54);
			long l = anOpenGL8643.prepareSurface(canvas);
			if ((l ^ 0xffffffffffffffffL) == 0L)
				throw new RuntimeException();
			return new Long(l);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.QE("
					+ (canvas != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method3096(Canvas canvas, Object object, boolean bool) {
		try {
			anInt8627++;
			if (bool == true) {
				Long var_long = (Long) object;
				anOpenGL8643.releaseSurface(canvas, var_long.longValue());
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fha.OI("
					+ (canvas != null ? "{...}" : "null") + ','
					+ (object != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final void method3080(int i) {
		try {
			anInt8585++;
			if (i == 1) {
				OpenGL.glLightfv(16384, 4611,
						((Class163_Sub2) this).aFloatArray7578, 0);
				OpenGL.glLightfv(16385, 4611,
						((Class163_Sub2) this).aFloatArray7555, 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.N(" + i + ')');
		}
	}

	private final void method3399(int i) {
		try {
			anInt8636++;
			if (i != -23846)
				method3053(true, null, (byte) -21, 24);
			if (aBool8662)
				OpenGL.glPopMatrix();
			if (!((Class163_Sub2) this).aClass16_7564.method151(true)) {
				if (((Class163_Sub2) this).aBool7526) {
					OpenGL.glLoadIdentity();
					aBool8662 = false;
				} else {
					OpenGL.glLoadMatrixf(
							((Class163_Sub2) this).aClass33_Sub2_7533
									.method2752(Class240.aFloatArray3260, -125),
							0);
					aBool8662 = false;
				}
			} else {
				if (!aBool8663) {
					OpenGL.glLoadMatrixf(
							((Class163_Sub2) this).aClass33_Sub2_7538
									.method2752(Class240.aFloatArray3260, -49),
							0);
					aBool8663 = true;
					method3080(1);
					method3088((byte) -100);
				}
				if (((Class163_Sub2) this).aBool7526)
					aBool8662 = false;
				else {
					OpenGL.glPushMatrix();
					OpenGL.glMultMatrixf(
							((Class163_Sub2) this).aClass33_Sub2_7533
									.method2752(Class240.aFloatArray3260, -48),
							0);
					aBool8662 = true;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.PJ(" + i + ')');
		}
	}

	final boolean method3009(Class366 class366, Class98 class98, byte i) {
		try {
			anInt8598++;
			if (i != -45)
				((Class163_Sub2_Sub1) this).anInt8677 = 78;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fha.TH("
					+ (class366 != null ? "{...}" : "null") + ','
					+ (class98 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final synchronized void method3400(int i, byte i_1_) {
		try {
			anInt8645++;
			Class11 class11 = new Class11();
			((Class11) class11).aLong91 = (long) i;
			aClass84_8660.method589((byte) -13, class11);
			int i_2_ = -72 / ((i_1_ - 52) / 46);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.NJ(" + i + ','
					+ i_1_ + ')');
		}
	}

	final boolean method1032() {
		try {
			anInt8624++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.RC(" + ')');
		}
	}

	final Interface7 method3045(int i, int i_3_, int i_4_, byte[] is,
			boolean bool, Class98 class98, byte i_5_, int i_6_) {
		try {
			anInt8630++;
			if (i_5_ != -77)
				((Class163_Sub2_Sub1) this).anIntArray8678 = null;
			if (aBool8683
					|| (Class261.method1669(i, (byte) 96) && Class261
							.method1669(i_4_, (byte) 96)))
				return new Class94_Sub2(this, class98, i, i_4_, bool, is, i_3_,
						i_6_);
			if (!aBool8679) {
				Class94_Sub2 class94_sub2 = new Class94_Sub2(this, class98,
						Class366.aClass366_4808, Class11_Sub2_Sub33.method3808(
								126, i), Class11_Sub2_Sub33.method3808(
								i_5_ + 188, i_4_));
				class94_sub2.method23(0, class98, i_4_, 0, i, is, true, i_6_,
						i_3_);
				return class94_sub2;
			}
			return new Class94_Sub1(this, class98, i, i_4_, is, i_3_, i_6_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fha.OH(" + i + ','
					+ i_3_ + ',' + i_4_ + ',' + (is != null ? "{...}" : "null")
					+ ',' + bool + ',' + (class98 != null ? "{...}" : "null")
					+ ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	final Interface27 method3016(byte i, boolean bool) {
		try {
			anInt8586++;
			if (i < 20)
				((Class163_Sub2_Sub1) this).aBool8673 = false;
			return new Class251_Sub1(this, Class366.aClass366_4809, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.BI(" + i + ','
					+ bool + ')');
		}
	}

	final Interface7 method3105(int i, int i_7_, int i_8_, Class98 class98,
			int i_9_, int i_10_, float[] fs, boolean bool) {
		try {
			int i_11_ = 122 % ((i + 11) / 46);
			anInt8593++;
			if (!aBool8683
					&& (!Class261.method1669(i_10_, (byte) 111) || !Class261
							.method1669(i_8_, (byte) 108))) {
				if (aBool8679)
					return new Class94_Sub1(this, class98, i_10_, i_8_, fs,
							i_7_, i_9_);
				Class94_Sub2 class94_sub2 = new Class94_Sub2(this, class98,
						Class366.aClass366_4812, Class11_Sub2_Sub33.method3808(
								125, i_10_), Class11_Sub2_Sub33.method3808(111,
								i_8_));
				class94_sub2.method2422(i_7_, i_10_, 0, 0, 33071, class98,
						i_8_, i_9_, fs);
				return class94_sub2;
			}
			return new Class94_Sub2(this, class98, i_10_, i_8_, bool, fs, i_7_,
					i_9_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fha.BG(" + i + ','
					+ i_7_ + ',' + i_8_ + ','
					+ (class98 != null ? "{...}" : "null") + ',' + i_9_ + ','
					+ i_10_ + ',' + (fs != null ? "{...}" : "null") + ','
					+ bool + ')'));
		}
	}

	final int[] na(int i, int i_12_, int i_13_, int i_14_) {
		try {
			anInt8608++;
			int[] is = new int[i_14_ * i_13_];
			for (int i_15_ = 0; (i_14_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++)
				OpenGL.glReadPixelsi(i, (((Class163_Sub2) this).anInt7421
						- i_12_ + (-i_15_ - 1)), i_13_, 1, 32993,
						((Class163_Sub2_Sub1) this).anInt8677, is, i_15_
								* i_13_);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fha.na(" + i + ','
					+ i_12_ + ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}

	final void method3044(int i) {
		do {
			try {
				OpenGL.glTexEnvi(
						8960,
						34161,
						OutgoingPacket
								.method2185(
										false,
										(((Class163_Sub2) this).aClass314Array7592[(((Class163_Sub2) this).anInt7570)])));
				anInt8581++;
				if (i == 26776)
					break;
				aClass84_8656 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205
						.method1298(runtimeexception, "fha.GF(" + i + ')');
			}
			break;
		} while (false);
	}

	final void b(int i, int i_16_, int i_17_, int i_18_, double d) {
		try {
			anInt8641++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fha.b(" + i + ','
					+ i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + d + ')'));
		}
	}

	final synchronized void method3401(long l, byte i) {
		try {
			anInt8648++;
			Class11 class11 = new Class11();
			((Class11) class11).aLong91 = l;
			if (i >= -21)
				((Class163_Sub2_Sub1) this).aBool8681 = false;
			aClass84_8661.method589((byte) -13, class11);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.TJ(" + l + ',' + i
					+ ')');
		}
	}

	final void method1042(float f, float f_19_, float f_20_) {
		try {
			anInt8651++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fha.GD(" + f + ','
					+ f_19_ + ',' + f_20_ + ')'));
		}
	}

	final int I() {
		try {
			anInt8613++;
			return anInt8680;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.I(" + ')');
		}
	}

	final void method3099(byte i) {
		do {
			try {
				anInt8568++;
				if (i == -45) {
					int i_21_ = (((Class163_Sub2_Sub1) this).anIntArray8678[((Class163_Sub2) this).anInt7570]);
					if (i_21_ == 0)
						break;
					((Class163_Sub2_Sub1) this).anIntArray8678[((Class163_Sub2) this).anInt7570] = 0;
					OpenGL.glBindTexture(i_21_, 0);
					OpenGL.glDisable(i_21_);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205
						.method1298(runtimeexception, "fha.AA(" + i + ')');
			}
			break;
		} while (false);
	}

	final float method2987(int i) {
		try {
			anInt8563++;
			int i_22_ = 79 / ((-8 - i) / 54);
			return 0.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.WG(" + i + ')');
		}
	}

	final void method1004(Rectangle[] rectangles, int i, int i_23_, int i_24_)
			throws Exception_Sub1 {
		try {
			anInt8646++;
			method1044(i_23_, i_24_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fha.BD("
					+ (rectangles != null ? "{...}" : "null") + ',' + i + ','
					+ i_23_ + ',' + i_24_ + ')'));
		}
	}

	final Interface3 method3005(boolean bool, int i) {
		try {
			if (i != 30519)
				return null;
			anInt8614++;
			return new Class251_Sub2(this, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.AJ(" + bool + ','
					+ i + ')');
		}
	}

	final void method2976(boolean bool) {
		do {
			try {
				anInt8603++;
				do {
					if (!((Class163_Sub2) this).aBool7605) {
						OpenGL.glDisable(2929);
						if (!client.aBool10531)
							break;
					}
					OpenGL.glEnable(2929);
				} while (false);
				if (bool == true)
					break;
				method3085(109, (byte) 66);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "fha.IF(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	final Class2 method3038(byte i, int i_25_) {
		try {
			int i_26_ = 29 / ((-37 - i) / 54);
			anInt8595++;
			int i_27_ = i_25_;
			while_88_: do {
				while_87_: do {
					do {
						if ((i_27_ ^ 0xffffffff) != -4) {
							if (i_27_ == 4)
								break;
							if (i_27_ != 8)
								break while_88_;
							if (!client.aBool10531)
								break while_87_;
						}
						return new Class2_Sub5(this,
								(((Class163_Sub2) this).aClass146_7513));
					} while (false);
					return new Class2_Sub1(this,
							(((Class163_Sub2) this).aClass146_7513),
							(((Class163_Sub2) this).aClass177_7408));
				} while (false);
				return new Class2_Sub3(this,
						((Class163_Sub2) this).aClass146_7513,
						((Class163_Sub2) this).aClass177_7408);
			} while (false);
			return super.method3038((byte) -98, i_25_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.TG(" + i + ','
					+ i_25_ + ')');
		}
	}

	final Interface10 method1066(Interface8 interface8, Interface26 interface26) {
		try {
			anInt8574++;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fha.ED("
					+ (interface8 != null ? "{...}" : "null") + ','
					+ (interface26 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3402(byte i) {
		try {
			if (i < 82)
				aClass22_8565 = null;
			aClass22_8565 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.SJ(" + i + ')');
		}
	}

	final void method3042(byte i, boolean bool) {
		do {
			try {
				do {
					if (!bool) {
						OpenGL.glDisable(32925);
						if (!client.aBool10531)
							break;
					}
					OpenGL.glEnable(32925);
				} while (false);
				anInt8652++;
				if (i == 115)
					break;
				method2983(30);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "fha.NE(" + i + ','
						+ bool + ')');
			}
			break;
		} while (false);
	}

	static final void method3403(
			Npc class376_sub7_sub5_sub5_sub2,
			boolean bool, int i) {
		try {
			anInt8631++;
			if ((Class52.anInt802 ^ 0xffffffff) > -401) {
				NPCDefinitions class215 = (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501);
				if (((NPCDefinitions) class215).anIntArray2950 != null) {
					class215 = class215.method1375((byte) 29,
							Class11_Sub26.aClass97_6296);
					if (class215 == null)
						return;
				}
				if (((NPCDefinitions) class215).aBool2970) {
					if (i != 3415)
						method3402((byte) -39);
					String string = ((NPCDefinitions) class215).aString2918;
					if (((NPCDefinitions) class215).anInt2910 != 0) {
						String string_28_ = (ISAAC.aClass66_263 == Class198.aClass66_2679 ? (Class26.aClass26_306
								.method217((byte) 116,
										Class11_Sub45_Sub1_Sub2.anInt9884))
								: (Class26.aClass26_304.method217((byte) 117,
										Class11_Sub45_Sub1_Sub2.anInt9884)));
						string += ((Class11_Sub39
								.method2929(
										i ^ ~0x7e15,
										(((Player) (Class11_Sub2_Sub8.myPlayer)).anInt10389),
										((NPCDefinitions) class215).anInt2910))
								+ " ("
								+ (String) string_28_
								+ ((NPCDefinitions) class215).anInt2910 + ")");
					}
					if (Class204.aBool2739 && !bool) {
						Class283 class283 = ((Class254_Sub3.anInt8048 ^ 0xffffffff) != 0 ? (Class187.aClass52_2388
								.method432(Class254_Sub3.anInt8048, (byte) -80))
								: null);
						if ((Class322.anInt4312 & 0x2 ^ 0xffffffff) != -1
								&& (class283 == null || (class215.method1379(
										(Class254_Sub3.anInt8048),
										(((Class283) class283).anInt3827),
										-15359) != ((Class283) class283).anInt3827))) {
							Class108_Sub22
									.method2963(
											false,
											0,
											-1,
											Class374.aString4890,
											false,
											Class11_Sub2_Sub15.anInt9021,
											true,
											50,
											(long) (((Actor) class376_sub7_sub5_sub5_sub2).anInt10319),
											(long) (((Actor) class376_sub7_sub5_sub5_sub2).anInt10319),
											(Class250.aString3444
													+ " -> <col=ffff00>" + string),
											0, 0);
							Class72_Sub2.anInt6912++;
						}
					}
					if (!bool) {
						String[] strings = ((NPCDefinitions) class215).aStringArray2911;
						if (Class219_Sub1.aBool7243)
							strings = Class206_Sub2.method2680(i - 3523,
									strings);
						if (strings != null) {
							for (int i_29_ = 4; i_29_ >= 0; i_29_--) {
								if (strings[i_29_] != null
										&& ((((NPCDefinitions) class215).aByte2960 ^ 0xffffffff) == -1 || !(strings[i_29_]
												.equalsIgnoreCase(Class26.aClass26_299
														.method217(
																(byte) 114,
																(Class11_Sub45_Sub1_Sub2.anInt9884)))))) {
									int i_30_ = 0;
									int i_31_ = Class11_Sub18.anInt5794;
									if ((i_29_ ^ 0xffffffff) == -1)
										i_30_ = 16;
									if (i_29_ == 1)
										i_30_ = 48;
									if ((i_29_ ^ 0xffffffff) == -3)
										i_30_ = 49;
									if (i_29_ == 3)
										i_30_ = 23;
									if (i_29_ == 4)
										i_30_ = 4;
									if ((i_29_ ^ 0xffffffff) == (((NPCDefinitions) class215).anInt2952 ^ 0xffffffff))
										i_31_ = ((NPCDefinitions) class215).anInt2916;
									if ((((NPCDefinitions) class215).anInt2941 ^ 0xffffffff) == (i_29_ ^ 0xffffffff))
										i_31_ = ((NPCDefinitions) class215).anInt2939;
									Class108_Sub22
											.method2963(
													false,
													0,
													-1,
													strings[i_29_],
													false,
													(!(strings[i_29_]
															.equalsIgnoreCase(Class26.aClass26_299
																	.method217(
																			(byte) 109,
																			(Class11_Sub45_Sub1_Sub2.anInt9884)))) ? i_31_
															: ((NPCDefinitions) class215).anInt2961),
													true,
													i_30_,
													(long) (((Actor) class376_sub7_sub5_sub5_sub2).anInt10319),
													(long) (((Actor) class376_sub7_sub5_sub5_sub2).anInt10319),
													"<col=ffff00>" + string, 0,
													i - 3415);
									Class286.anInt3848++;
								}
							}
						}
						if (((NPCDefinitions) class215).aByte2960 == 1
								&& strings != null) {
							for (int i_32_ = 4; (i_32_ ^ 0xffffffff) <= -1; i_32_--) {
								if (strings[i_32_] != null
										&& (strings[i_32_]
												.equalsIgnoreCase(Class26.aClass26_299
														.method217(
																(byte) 86,
																(Class11_Sub45_Sub1_Sub2.anInt9884))))) {
									short i_33_ = 0;
									if (((((Player) (Class11_Sub2_Sub8.myPlayer)).anInt10389) ^ 0xffffffff) > (((NPCDefinitions) class215).anInt2910 ^ 0xffffffff))
										i_33_ = (short) 2000;
									short i_34_ = 0;
									if ((i_32_ ^ 0xffffffff) == -1)
										i_34_ = (short) 16;
									if ((i_32_ ^ 0xffffffff) == -2)
										i_34_ = (short) 48;
									if (i_32_ == 2)
										i_34_ = (short) 49;
									if (i_32_ == 3)
										i_34_ = (short) 23;
									if (i_32_ == 4)
										i_34_ = (short) 4;
									if (i_34_ != 0)
										i_34_ += i_33_;
									Class108_Sub22
											.method2963(
													false,
													0,
													-1,
													strings[i_32_],
													false,
													((NPCDefinitions) class215).anInt2961,
													true,
													i_34_,
													(long) (((Actor) class376_sub7_sub5_sub5_sub2).anInt10319),
													(long) (((Actor) class376_sub7_sub5_sub5_sub2).anInt10319),
													"<col=ffff00>" + string, 0,
													0);
									Class236_Sub3.anInt6240++;
								}
							}
						}
					}
					Class108_Sub22
							.method2963(
									bool,
									0,
									-1,
									(Class26.aClass26_298.method217((byte) 106,
											Class11_Sub45_Sub1_Sub2.anInt9884)),
									false,
									Class258.anInt3515,
									true,
									1008,
									(long) ((Actor) class376_sub7_sub5_sub5_sub2).anInt10319,
									(long) ((Actor) class376_sub7_sub5_sub5_sub2).anInt10319,
									"<col=ffff00>" + string, 0, 0);
					Class11_Sub45_Sub10.anInt8957++;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fha.QJ("
					+ (class376_sub7_sub5_sub5_sub2 != null ? "{...}" : "null")
					+ ',' + bool + ',' + i + ')'));
		}
	}

	final void method1083(int i, int i_35_, int i_36_, int i_37_) {
		try {
			anInt8620++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fha.G(" + i + ','
					+ i_35_ + ',' + i_36_ + ',' + i_37_ + ')'));
		}
	}

	final void method3041(byte i) {
		try {
			if (i != 20)
				((Class163_Sub2_Sub1) this).aBool8681 = false;
			aBool8663 = false;
			anInt8583++;
			method3399(-23846);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.IJ(" + i + ')');
		}
	}

	final void method3058(byte i) {
		try {
			anInt8606++;
			if (i != 55)
				aClass84_8654 = null;
			if (!((Class163_Sub2) this).aBool7640) {
				OpenGL.glDisable(16384);
				OpenGL.glDisable(16385);
			} else {
				OpenGL.glEnable(16384);
				OpenGL.glEnable(16385);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.SI(" + i + ')');
		}
	}

	final void method3082(int i) {
		try {
			OpenGL.glScissor(
					(((Class163_Sub2) this).anInt7614 + ((Class163_Sub2) this).anInt7573),
					(-((Class163_Sub2) this).anInt7554
							+ ((Class163_Sub2) this).anInt7421 + ((Class163_Sub2) this).anInt7610),
					(((Class163_Sub2) this).anInt7631 - ((Class163_Sub2) this).anInt7614),
					(-((Class163_Sub2) this).anInt7543 + ((Class163_Sub2) this).anInt7554));
			if (i != 0)
				method3402((byte) 85);
			anInt8575++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.DH(" + i + ')');
		}
	}

	final void method3053(boolean bool, Class218 class218, byte i, int i_38_) {
		try {
			if (i > -35)
				ya();
			OpenGL.glTexEnvi(8960, i_38_ + 34184,
					Class11_Sub27.method2714(class218, 34166));
			anInt8657++;
			OpenGL.glTexEnvi(8960, i_38_ + 34200, !bool ? 770 : 771);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fha.CH(" + bool + ','
					+ (class218 != null ? "{...}" : "null") + ',' + i + ','
					+ i_38_ + ')'));
		}
	}

	final void method1076(Interface10 interface10) {
		try {
			anInt8589++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.MB("
					+ (interface10 != null ? "{...}" : "null") + ')');
		}
	}

	final void method3072(int i) {
		try {
			anInt8621++;
			OpenGL.glMatrixMode(5889);
			if (i != 11)
				aBool8662 = true;
			OpenGL.glLoadMatrixf(((Class163_Sub2) this).aFloatArray7562, 0);
			OpenGL.glMatrixMode(5888);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.AG(" + i + ')');
		}
	}

	final Interface12 method3060(int i, int[][] is, byte i_39_, boolean bool) {
		try {
			anInt8615++;
			int i_40_ = 53 / ((i_39_ + 34) / 38);
			return new Class94_Sub3(this, i, bool, is);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fha.RE(" + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_39_ + ','
					+ bool + ')'));
		}
	}

	final void method3030(int i) {
		do {
			try {
				do {
					if (((Class163_Sub2) this).aBool7590
							&& ((Class163_Sub2) this).aBool7558
							&& ((Class163_Sub2) this).anInt7600 >= 0) {
						OpenGL.glEnable(2912);
						if (!client.aBool10531)
							break;
					}
					OpenGL.glDisable(2912);
				} while (false);
				anInt8571++;
				if (i > 56)
					break;
				((Class163_Sub2_Sub1) this).anInt8677 = 120;
			} catch (RuntimeException runtimeexception) {
				throw Class205
						.method1298(runtimeexception, "fha.HH(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method3004(byte i) {
		do {
			try {
				if (Class376_Sub7_Sub3_Sub1.aClass282_9845 != ((Class163_Sub2) this).aClass282_7560) {
					if (Class11_Sub2_Sub1.aClass282_8437 == ((Class163_Sub2) this).aClass282_7560)
						OpenGL.glBlendFunc(1, 1);
					else if (Class165.aClass282_2145 == ((Class163_Sub2) this).aClass282_7560)
						OpenGL.glBlendFunc(774, 1);
				} else
					OpenGL.glBlendFunc(770, 771);
				anInt8600++;
				if (i == -83)
					break;
				((Class163_Sub2_Sub1) this).anIntArray8678 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205
						.method1298(runtimeexception, "fha.SH(" + i + ')');
			}
			break;
		} while (false);
	}

	final Interface26 method1071(int i, int i_41_) {
		try {
			anInt8647++;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.JB(" + i + ','
					+ i_41_ + ')');
		}
	}

	final void F(int i, int i_42_) {
		try {
			anInt8587++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.F(" + i + ','
					+ i_42_ + ')');
		}
	}

	final void method3059(byte i) {
		do {
			try {
				anInt8579++;
				do {
					if (!((Class163_Sub2) this).aBool7602
							|| ((Class163_Sub2) this).aBool7582) {
						OpenGL.glDisable(2896);
						if (!client.aBool10531)
							break;
					}
					OpenGL.glEnable(2896);
				} while (false);
				if (i <= -109)
					break;
				method3400(79, (byte) -31);
			} catch (RuntimeException runtimeexception) {
				throw Class205
						.method1298(runtimeexception, "fha.SF(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method3027(int i) {
		do {
			try {
				anInt8625++;
				OpenGL.glMatrixMode(5890);
				do {
					if ((((Class163_Sub2) this).aClass240Array7599[((Class163_Sub2) this).anInt7570]) == Class251_Sub2.aClass240_5429) {
						OpenGL.glLoadIdentity();
						if (!client.aBool10531)
							break;
					}
					OpenGL.glLoadMatrixf(
							((Class163_Sub2) this).aClass33_Sub2Array7568[((Class163_Sub2) this).anInt7570]
									.method2752(Class240.aFloatArray3260, 114),
							0);
				} while (false);
				OpenGL.glMatrixMode(5888);
				if (i == 13225)
					break;
				method3041((byte) -99);
			} catch (RuntimeException runtimeexception) {
				throw Class205
						.method1298(runtimeexception, "fha.GE(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method3089(boolean bool, Class218 class218, int i,
			boolean bool_43_, boolean bool_44_) {
		try {
			if (bool_44_ != false)
				method3028(-20, (byte) -80, 6, null, -82, null);
			anInt8639++;
			OpenGL.glTexEnvi(8960, 34176 - -i,
					Class11_Sub27.method2714(class218, 34166));
			if (!bool_43_)
				OpenGL.glTexEnvi(8960, 34192 - -i, !bool ? 768 : 769);
			else
				OpenGL.glTexEnvi(8960, 34192 - -i, !bool ? 770 : 771);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fha.CI(" + bool + ','
					+ (class218 != null ? "{...}" : "null") + ',' + i + ','
					+ bool_43_ + ',' + bool_44_ + ')'));
		}
	}

	static final int method3404(int i, int i_45_, int i_46_) {
		try {
			anInt8567++;
			if ((i_46_ ^ 0xffffffff) == 1)
				return 12345678;
			if ((i_46_ ^ 0xffffffff) == 0) {
				if ((i_45_ ^ 0xffffffff) <= -3) {
					if (i_45_ > 126)
						i_45_ = 126;
				} else
					i_45_ = 2;
				return i_45_;
			}
			i_45_ = (0x7f & i_46_) * i_45_ >> 7;
			if (i != 2241)
				aClass22_8565 = null;
			if (i_45_ < 2)
				i_45_ = 2;
			else if (i_45_ > 126)
				i_45_ = 126;
			return (0xff80 & i_46_) + i_45_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fha.WJ(" + i + ','
					+ i_45_ + ',' + i_46_ + ')'));
		}
	}

	final void method2985(int i) {
		try {
			if (i > -81)
				((Class163_Sub2_Sub1) this).anIntArray8678 = null;
			anInt8576++;
			OpenGL.glDepthMask(((Class163_Sub2) this).aBool7575
					&& ((Class163_Sub2) this).aBool7547);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.NG(" + i + ')');
		}
	}

	final void method3102(byte i) {
		try {
			if (i != -57)
				anInt8669 = 53;
			Class163.aFloatArray2114[3] = 1.0F;
			Class163.aFloatArray2114[2] = (((Class163_Sub2) this).aFloat7633 * ((Class163_Sub2) this).aFloat7606);
			Class163.aFloatArray2114[1] = (((Class163_Sub2) this).aFloat7606 * ((Class163_Sub2) this).aFloat7613);
			anInt8644++;
			Class163.aFloatArray2114[0] = (((Class163_Sub2) this).aFloat7626 * ((Class163_Sub2) this).aFloat7606);
			OpenGL.glLightModelfv(2899, Class163.aFloatArray2114, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.NI(" + i + ')');
		}
	}

	final void method3051(int i, Canvas canvas, Object object) {
		try {
			anInt8618++;
			if (i != 0)
				aClass84_8656 = null;
			Long var_long = (Long) object;
			if (!anOpenGL8643.setSurface(var_long.longValue()))
				throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fha.CG(" + i + ','
					+ (canvas != null ? "{...}" : "null") + ','
					+ (object != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1006() {
		try {
			anInt8653++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.TB(" + ')');
		}
	}

	final Class234 method1057(Class234 class234, Class234 class234_47_,
			float f, Class234 class234_48_) {
		try {
			anInt8578++;
			if (f < 0.5F)
				return class234;
			return class234_47_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fha.NB("
					+ (class234 != null ? "{...}" : "null") + ','
					+ (class234_47_ != null ? "{...}" : "null") + ',' + f + ','
					+ (class234_48_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3034(int i) {
		try {
			OpenGL.glViewport(((Class163_Sub2) this).anInt7573,
					((Class163_Sub2) this).anInt7610,
					((Class163_Sub2) this).anInt7393,
					((Class163_Sub2) this).anInt7421);
			if (i != 13)
				method3059((byte) -32);
			anInt8610++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.BH(" + i + ')');
		}
	}

	final void GA(int i) {
		try {
			OpenGL.glClearColor((float) (i & 0xff0000) / 1.671168E7F,
					(float) (0xff00 & i) / 65280.0F,
					(float) (i & 0xff) / 255.0F, (float) (i >>> 24) / 255.0F);
			anInt8638++;
			OpenGL.glClear(16384);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.GA(" + i + ')');
		}
	}

	final Class219 method3018(Class315[] class315s, byte i) {
		try {
			int i_49_ = 5 / ((20 - i) / 36);
			anInt8590++;
			return new Class219_Sub1(class315s);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.SG("
					+ (class315s != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method3046(int i) {
		do {
			try {
				do {
					if (!((Class163_Sub2) this).aBool7638) {
						OpenGL.glDisable(3008);
						if (!client.aBool10531)
							break;
					}
					OpenGL.glEnable(3008);
				} while (false);
				anInt8601++;
				if (i <= -30)
					break;
				aBool8664 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class205
						.method1298(runtimeexception, "fha.EG(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method2991(Canvas canvas, int i, Object object) {
		do {
			try {
				anInt8599++;
				Long var_long = (Long) object;
				anOpenGL8643.surfaceResized(var_long.longValue());
				if (i >= 115)
					break;
				aBool8666 = true;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("fha.GG("
						+ (canvas != null ? "{...}" : "null") + ',' + i + ','
						+ (object != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final boolean method1086() {
		try {
			anInt8597++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.ID(" + ')');
		}
	}

	final void method3001(byte i) {
		try {
			anInt8602++;
			OpenGL.glActiveTexture(((Class163_Sub2) this).anInt7570 + 33984);
			int i_50_ = -25 / ((-68 - i) / 49);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.HI(" + i + ')');
		}
	}

	final Class100 method1055() {
		try {
			anInt8566++;
			int i = -1;
			if ((aString8675.indexOf("nvidia") ^ 0xffffffff) != 0)
				i = 4318;
			else if ((aString8675.indexOf("intel") ^ 0xffffffff) != 0)
				i = 32902;
			else if ((aString8675.indexOf("ati") ^ 0xffffffff) != 0)
				i = 4098;
			return new Class100(i, "OpenGL", anInt8676, aString8674, 0L);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.OB(" + ')');
		}
	}

	final void method3071(boolean bool) {
		do {
			try {
				do {
					if (!((Class163_Sub2) this).aBool7559) {
						OpenGL.glDisable(3042);
						if (!client.aBool10531)
							break;
					}
					OpenGL.glEnable(3042);
				} while (false);
				anInt8642++;
				if (bool == true)
					break;
				method3400(104, (byte) -102);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "fha.VI(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	final void method1044(int i, int i_51_) throws Exception_Sub1 {
		try {
			anOpenGL8643.swapBuffers();
			anInt8609++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.PB(" + i + ','
					+ i_51_ + ')');
		}
	}

	final void method3085(int i, byte i_52_) {
		do {
			try {
				anInt8655++;
				if (i_52_ == 70)
					break;
				method3016((byte) -105, false);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "fha.WA(" + i + ','
						+ i_52_ + ')');
			}
			break;
		} while (false);
	}

	final void method3054(byte i) {
		try {
			anInt8623++;
			OpenGL.glTexEnvi(
					8960,
					34162,
					OutgoingPacket
							.method2185(
									false,
									(((Class163_Sub2) this).aClass314Array7572[(((Class163_Sub2) this).anInt7570)])));
			int i_53_ = 43 % ((4 - i) / 56);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.DE(" + i + ')');
		}
	}

	final void method2983(int i) {
		try {
			anInt8632++;
			int i_54_ = -121 % ((-18 - i) / 43);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.FF(" + i + ')');
		}
	}

	static final void method3405(int i, int i_55_, Class146 class146,
			byte i_56_, Class11_Sub6_Sub2 class11_sub6_sub2, boolean bool,
			int i_57_) {
		do {
			try {
				Class91_Sub2.method3111(i_55_, i, 0, bool, class146, i_57_);
				anInt8569++;
				Class334.aClass11_Sub6_Sub2_4425 = class11_sub6_sub2;
				if (i_56_ > 104)
					break;
				anInt8637 = -3;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("fha.RJ(" + i
						+ ',' + i_55_ + ','
						+ (class146 != null ? "{...}" : "null") + ',' + i_56_
						+ ',' + (class11_sub6_sub2 != null ? "{...}" : "null")
						+ ',' + bool + ',' + i_57_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1016() {
		do {
			try {
				anInt8596++;
				super.method1016();
				if (anOpenGL8643 == null)
					break;
				anOpenGL8643.method160();
				anOpenGL8643.release();
				anOpenGL8643 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "fha.J(" + ')');
			}
			break;
		} while (false);
	}

	final void method1053(boolean bool) {
		try {
			anInt8629++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.UA(" + bool + ')');
		}
	}

	final void method1078() {
		try {
			anInt8580++;
			OpenGL.glFinish();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.EC(" + ')');
		}
	}

	final void method3023(boolean bool) {
		try {
			anInt8570++;
			Class163.aFloatArray2114[2] = (((Class163_Sub2) this).aFloat7589 * ((Class163_Sub2) this).aFloat7633);
			Class163.aFloatArray2114[3] = 1.0F;
			if (bool != false)
				method3034(-93);
			Class163.aFloatArray2114[0] = (((Class163_Sub2) this).aFloat7626 * ((Class163_Sub2) this).aFloat7589);
			Class163.aFloatArray2114[1] = (((Class163_Sub2) this).aFloat7589 * ((Class163_Sub2) this).aFloat7613);
			OpenGL.glLightfv(16384, 4609, Class163.aFloatArray2114, 0);
			Class163.aFloatArray2114[2] = (-((Class163_Sub2) this).aFloat7588 * ((Class163_Sub2) this).aFloat7633);
			Class163.aFloatArray2114[3] = 1.0F;
			Class163.aFloatArray2114[0] = (-((Class163_Sub2) this).aFloat7588 * ((Class163_Sub2) this).aFloat7626);
			Class163.aFloatArray2114[1] = (((Class163_Sub2) this).aFloat7613 * -((Class163_Sub2) this).aFloat7588);
			OpenGL.glLightfv(16385, 4609, Class163.aFloatArray2114, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.CA(" + bool + ')');
		}
	}

	final void method2990(Class174 class174, int i) {
		do {
			try {
				do {
					if (Class168.aClass174_2155 != class174) {
						int i_58_ = Applet_Sub1
								.method3999((byte) -71, class174);
						OpenGL.glTexGeni(8192, 9472, i_58_);
						OpenGL.glEnable(3168);
						OpenGL.glTexGeni(8193, 9472, i_58_);
						OpenGL.glEnable(3169);
						OpenGL.glTexGeni(8194, 9472, i_58_);
						OpenGL.glEnable(3170);
						if (!client.aBool10531)
							break;
					}
					OpenGL.glDisable(3168);
					OpenGL.glDisable(3169);
					OpenGL.glDisable(3170);
				} while (false);
				anInt8577++;
				if (i == -1)
					break;
				((Class163_Sub2_Sub1) this).aMapBuffer8671 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("fha.TF(" + (class174 != null ? "{...}" : "null")
								+ ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void method3012(Class219 class219, int i) {
		try {
			anInt8633++;
			Class315[] class315s = (((Class219_Sub1) (Class219_Sub1) class219).aClass315Array7246);
			int i_59_ = 0;
			boolean bool = false;
			boolean bool_60_ = false;
			boolean bool_61_ = false;
			for (int i_62_ = 0; (class315s.length ^ 0xffffffff) < (i_62_ ^ 0xffffffff); i_62_++) {
				Class315 class315 = class315s[i_62_];
				Class251_Sub2 class251_sub2 = aClass251_Sub2Array8665[i_62_];
				int i_63_ = 0;
				int i_64_ = class251_sub2.method2381(-1611);
				long l = class251_sub2.method1599(true);
				class251_sub2.method1600(-24568);
				for (int i_65_ = 0; i_65_ < class315.method1915((byte) 43); i_65_++) {
					Class27 class27 = class315.method1914(i ^ ~0x2d, i_65_);
					if (class27 == Class27.aClass27_345) {
						OpenGL.glVertexPointer(3, 5126, i_64_, (long) i_63_ + l);
						bool_61_ = true;
					} else if (class27 != Class27.aClass27_351) {
						if (class27 == Class27.aClass27_352) {
							bool = true;
							OpenGL.glColorPointer(4, 5121, i_64_, (long) i_63_
									+ l);
						} else if (Class27.aClass27_353 != class27) {
							if (class27 == Class27.aClass27_354) {
								OpenGL.glClientActiveTexture(i_59_++ + 33984);
								OpenGL.glTexCoordPointer(2, 5126, i_64_, l
										+ (long) i_63_);
							} else if (class27 == Class27.aClass27_355) {
								OpenGL.glClientActiveTexture(33984 + i_59_++);
								OpenGL.glTexCoordPointer(3, 5126, i_64_,
										(long) i_63_ + l);
							} else if (class27 == Class27.aClass27_356) {
								OpenGL.glClientActiveTexture(33984 - -i_59_++);
								OpenGL.glTexCoordPointer(4, 5126, i_64_,
										(long) i_63_ + l);
							}
						} else {
							OpenGL.glClientActiveTexture(i_59_++ + 33984);
							OpenGL.glTexCoordPointer(1, 5126, i_64_,
									(long) i_63_ + l);
						}
					} else {
						OpenGL.glNormalPointer(5126, i_64_, l + (long) i_63_);
						bool_60_ = true;
					}
					i_63_ += ((Class27) class27).anInt349;
				}
			}
			if (i != 16)
				method1032();
			if (!aBool8664 != !bool_61_) {
				if (bool_61_)
					OpenGL.glEnableClientState(32884);
				else
					OpenGL.glDisableClientState(32884);
				aBool8664 = bool_61_;
			}
			if (bool_60_ != aBool8670) {
				if (!bool_60_)
					OpenGL.glDisableClientState(32885);
				else
					OpenGL.glEnableClientState(32885);
				aBool8670 = bool_60_;
			}
			if (!bool != !aBool8666) {
				if (!bool)
					OpenGL.glDisableClientState(32886);
				else
					OpenGL.glEnableClientState(32886);
				aBool8666 = bool;
			}
			if (anInt8669 >= i_59_) {
				if ((i_59_ ^ 0xffffffff) > (anInt8669 ^ 0xffffffff)) {
					for (int i_66_ = i_59_; (i_66_ ^ 0xffffffff) > (anInt8669 ^ 0xffffffff); i_66_++) {
						OpenGL.glClientActiveTexture(33984 + i_66_);
						OpenGL.glDisableClientState(32888);
					}
					anInt8669 = i_59_;
				}
			} else {
				for (int i_67_ = anInt8669; (i_59_ ^ 0xffffffff) < (i_67_ ^ 0xffffffff); i_67_++) {
					OpenGL.glClientActiveTexture(i_67_ + 33984);
					OpenGL.glEnableClientState(32888);
				}
				anInt8669 = i_59_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.DI("
					+ (class219 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final synchronized void method1021(int i) {
		try {
			anInt8612++;
			int i_68_ = 0;
			i &= 0x7fffffff;
			while (!aClass84_8654.method576((byte) 27)) {
				Class11_Sub51 class11_sub51 = (Class11_Sub51) aClass84_8654
						.method581((byte) -16);
				Class11_Sub2_Sub17.anIntArray9049[i_68_++] = (int) ((Class11) class11_sub51).aLong91;
				((Class163_Sub2) this).anInt7525 -= ((Class11_Sub51) class11_sub51).anInt8036;
				if (i_68_ == 1000) {
					OpenGL.glDeleteBuffersARB(i_68_,
							(Class11_Sub2_Sub17.anIntArray9049), 0);
					i_68_ = 0;
				}
			}
			if (i_68_ > 0) {
				OpenGL.glDeleteBuffersARB(i_68_,
						Class11_Sub2_Sub17.anIntArray9049, 0);
				i_68_ = 0;
			}
			while (!aClass84_8656.method576((byte) 27)) {
				Class11_Sub51 class11_sub51 = (Class11_Sub51) aClass84_8656
						.method581((byte) -16);
				Class11_Sub2_Sub17.anIntArray9049[i_68_++] = (int) ((Class11) class11_sub51).aLong91;
				((Class163_Sub2) this).anInt7524 -= ((Class11_Sub51) class11_sub51).anInt8036;
				if (i_68_ == 1000) {
					OpenGL.glDeleteTextures(i_68_,
							Class11_Sub2_Sub17.anIntArray9049, 0);
					i_68_ = 0;
				}
			}
			if (i_68_ > 0) {
				OpenGL.glDeleteTextures(i_68_,
						Class11_Sub2_Sub17.anIntArray9049, 0);
				i_68_ = 0;
			}
			while (!aClass84_8658.method576((byte) 27)) {
				Class11_Sub51 class11_sub51 = (Class11_Sub51) aClass84_8658
						.method581((byte) -16);
				Class11_Sub2_Sub17.anIntArray9049[i_68_++] = ((Class11_Sub51) class11_sub51).anInt8036;
				if (i_68_ == 1000) {
					OpenGL.glDeleteFramebuffersEXT(i_68_,
							(Class11_Sub2_Sub17.anIntArray9049), 0);
					i_68_ = 0;
				}
			}
			if (i_68_ > 0) {
				OpenGL.glDeleteFramebuffersEXT(i_68_,
						(Class11_Sub2_Sub17.anIntArray9049), 0);
				i_68_ = 0;
			}
			while (!aClass84_8659.method576((byte) 27)) {
				Class11_Sub51 class11_sub51 = (Class11_Sub51) aClass84_8659
						.method581((byte) -16);
				Class11_Sub2_Sub17.anIntArray9049[i_68_++] = (int) ((Class11) class11_sub51).aLong91;
				((Class163_Sub2) this).anInt7530 -= ((Class11_Sub51) class11_sub51).anInt8036;
				if (i_68_ == 1000) {
					OpenGL.glDeleteRenderbuffersEXT(i_68_,
							(Class11_Sub2_Sub17.anIntArray9049), 0);
					i_68_ = 0;
				}
			}
			if ((i_68_ ^ 0xffffffff) < -1) {
				OpenGL.glDeleteRenderbuffersEXT(i_68_,
						(Class11_Sub2_Sub17.anIntArray9049), 0);
				boolean bool = false;
			}
			while (!aClass84_8628.method576((byte) 27)) {
				Class11_Sub51 class11_sub51 = (Class11_Sub51) aClass84_8628
						.method581((byte) -16);
				OpenGL.glDeleteLists((int) ((Class11) class11_sub51).aLong91,
						(((Class11_Sub51) class11_sub51).anInt8036));
			}
			while (!aClass84_8660.method576((byte) 27)) {
				Class11 class11 = aClass84_8660.method581((byte) -16);
				OpenGL.glDeleteProgramARB((int) ((Class11) class11).aLong91);
			}
			while (!aClass84_8661.method576((byte) 27)) {
				Class11 class11 = aClass84_8661.method581((byte) -16);
				OpenGL.glDeleteObjectARB(((Class11) class11).aLong91);
			}
			while (!aClass84_8628.method576((byte) 27)) {
				Class11_Sub51 class11_sub51 = (Class11_Sub51) aClass84_8628
						.method581((byte) -16);
				OpenGL.glDeleteLists((int) ((Class11) class11_sub51).aLong91,
						(((Class11_Sub51) class11_sub51).anInt8036));
			}
			if (this.E() > 100663296
					&& ((60000L + aLong8667 ^ 0xffffffffffffffffL) > (Class137
							.method878((byte) -78) ^ 0xffffffffffffffffL))) {
				System.gc();
				aLong8667 = Class137.method878((byte) -50);
			}
			super.method1021(i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.O(" + i + ')');
		}
	}

	final void method3022(int i) {
		do {
			try {
				do {
					if (((Class163_Sub2) this).aBool7664) {
						OpenGL.glEnable(3089);
						if (!client.aBool10531)
							break;
					}
					OpenGL.glDisable(3089);
				} while (false);
				anInt8588++;
				if (i == 3)
					break;
				anInt8676 = -89;
			} catch (RuntimeException runtimeexception) {
				throw Class205
						.method1298(runtimeexception, "fha.MI(" + i + ')');
			}
			break;
		} while (false);
	}

	static final int method3406(byte i, int i_69_) {
		try {
			anInt8616++;
			int i_70_ = 0;
			if (i <= 60)
				method3403(null, false, 51);
			if (i_69_ < 0 || (i_69_ ^ 0xffffffff) <= -65537) {
				i_69_ >>>= 16;
				i_70_ += 16;
			}
			if ((i_69_ ^ 0xffffffff) <= -257) {
				i_70_ += 8;
				i_69_ >>>= 8;
			}
			if ((i_69_ ^ 0xffffffff) <= -17) {
				i_69_ >>>= 4;
				i_70_ += 4;
			}
			if ((i_69_ ^ 0xffffffff) <= -5) {
				i_69_ >>>= 2;
				i_70_ += 2;
			}
			if ((i_69_ ^ 0xffffffff) <= -2) {
				i_70_++;
				i_69_ >>>= 1;
			}
			return i_70_ - -i_69_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.OJ(" + i + ','
					+ i_69_ + ')');
		}
	}

	final void method2992(int i) {
		try {
			anInt8617++;
			((Class163_Sub2) this).aFloat7632 = (float) (-((Class163_Sub2) this).anInt7628 + ((Class163_Sub2) this).anInt7569);
			((Class163_Sub2) this).aFloat7607 = (((Class163_Sub2) this).aFloat7632 - (float) ((Class163_Sub2) this).anInt7600);
			if (((Class163_Sub2) this).aFloat7607 < (float) ((Class163_Sub2) this).anInt7571)
				((Class163_Sub2) this).aFloat7607 = (float) ((Class163_Sub2) this).anInt7571;
			OpenGL.glFogf(2915, ((Class163_Sub2) this).aFloat7607);
			OpenGL.glFogf(2916, ((Class163_Sub2) this).aFloat7632);
			Class163.aFloatArray2114[2] = ((float) Class77.method529(255,
					((Class163_Sub2) this).anInt7636) / 255.0F);
			Class163.aFloatArray2114[0] = ((float) Class77.method529(16711680,
					((Class163_Sub2) this).anInt7636) / 1.671168E7F);
			if (i != 5)
				method3027(-76);
			Class163.aFloatArray2114[1] = ((float) Class77.method529(65280,
					((Class163_Sub2) this).anInt7636) / 65280.0F);
			OpenGL.glFogfv(2918, Class163.aFloatArray2114, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.FA(" + i + ')');
		}
	}

	final void method3076(boolean bool) {
		try {
			anInt8594++;
			if (bool != true)
				aClass84_8656 = null;
			method3399(-23846);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.OA(" + bool + ')');
		}
	}

	final void method3040(int i) {
		try {
			Class163.aFloatArray2114[2] = (float) Class77.method529(
					((Class163_Sub2) this).anInt7556, 255) / 255.0F;
			Class163.aFloatArray2114[0] = (float) Class77.method529(
					((Class163_Sub2) this).anInt7556, 16711680) / 1.671168E7F;
			if (i != -5617)
				method3400(-122, (byte) -15);
			Class163.aFloatArray2114[3] = (float) (((Class163_Sub2) this).anInt7556 >>> 24) / 255.0F;
			Class163.aFloatArray2114[1] = (float) Class77.method529(
					((Class163_Sub2) this).anInt7556, 65280) / 65280.0F;
			anInt8626++;
			OpenGL.glTexEnvfv(8960, 8705, Class163.aFloatArray2114, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.AE(" + i + ')');
		}
	}

	Class163_Sub2_Sub1(OpenGL opengl, Canvas canvas, long l,
			Interface1 interface1, Class146 class146, int i) {
		super(canvas, new Long(l), interface1, class146, i, 1);
		try {
			try {
				anOpenGL8643 = opengl;
				anOpenGL8643.method161();
				aString8675 = OpenGL.glGetString(7936).toLowerCase();
				aString8674 = OpenGL.glGetString(7937).toLowerCase();
				if ((aString8675.indexOf("microsoft") ^ 0xffffffff) != 0
						|| (aString8675.indexOf("brian paul") ^ 0xffffffff) != 0
						|| aString8675.indexOf("mesa") != -1)
					throw new RuntimeException("");
				String string = OpenGL.glGetString(7938);
				String[] strings = Class121.method788(11027, ' ',
						string.replace('.', ' '));
				if (strings.length >= 2) {
					try {
						int i_71_ = Class173.method1139(strings[0], -23213);
						int i_72_ = Class173.method1139(strings[1], -23213);
						anInt8676 = i_71_ * 10 - -i_72_;
					} catch (NumberFormatException numberformatexception) {
						throw new RuntimeException("");
					}
				} else
					throw new RuntimeException("");
				if ((anInt8676 ^ 0xffffffff) > -13)
					throw new RuntimeException("");
				if (!anOpenGL8643.method159("GL_ARB_multitexture"))
					throw new RuntimeException("");
				if (!anOpenGL8643.method159("GL_ARB_texture_env_combine"))
					throw new RuntimeException("");
				int[] is = new int[1];
				OpenGL.glGetIntegerv(34018, is, 0);
				((Class163_Sub2) this).anInt7551 = is[0];
				if ((((Class163_Sub2) this).anInt7551 ^ 0xffffffff) > -3)
					throw new RuntimeException("");
				((Class163_Sub2) this).anInt7617 = 8;
				((Class163_Sub2_Sub1) this).aBool8682 = anOpenGL8643
						.method159("GL_ARB_vertex_buffer_object");
				((Class163_Sub2) this).aBool7623 = anOpenGL8643
						.method159("GL_ARB_multisample");
				aBool8679 = anOpenGL8643.method159("GL_ARB_texture_rectangle");
				((Class163_Sub2) this).aBool7549 = anOpenGL8643
						.method159("GL_ARB_texture_cube_map");
				aBool8683 = anOpenGL8643
						.method159("GL_ARB_texture_non_power_of_two");
				((Class163_Sub2) this).aBool7612 = anOpenGL8643
						.method159("GL_EXT_texture3D");
				((Class163_Sub2_Sub1) this).aBool8681 = anOpenGL8643
						.method159("GL_ARB_vertex_shader");
				((Class163_Sub2_Sub1) this).aBool8673 = anOpenGL8643
						.method159("GL_ARB_vertex_program");
				((Class163_Sub2_Sub1) this).aBool8672 = anOpenGL8643
						.method159("GL_ARB_fragment_shader");
				anOpenGL8643.method159("GL_ARB_fragment_program");
				((Class163_Sub2_Sub1) this).anIntArray8678 = new int[((Class163_Sub2) this).anInt7551];
				((Class163_Sub2_Sub1) this).anInt8677 = jaclib.memory.Stream
						.method353() ? 33639 : 5121;
				if (aString8674.indexOf("radeon") != -1) {
					int i_73_ = 0;
					boolean bool = false;
					boolean bool_74_ = false;
					String[] strings_75_ = Class121.method788(11027, ' ',
							aString8674.replace('/', ' '));
					for (int i_76_ = 0; ((strings_75_.length ^ 0xffffffff) < (i_76_ ^ 0xffffffff)); i_76_++) {
						String string_77_ = strings_75_[i_76_];
						try {
							if (string_77_.length() > 0) {
								if ((string_77_.charAt(0) ^ 0xffffffff) == -121
										&& string_77_.length() >= 3
										&& (Class108_Sub16.method2712(
												string_77_.substring(1, 3),
												-17633))) {
									string_77_ = string_77_.substring(1);
									bool_74_ = true;
								}
								if (string_77_.equals("hd"))
									bool = true;
								else {
									if (string_77_.startsWith("hd")) {
										string_77_ = string_77_.substring(2);
										bool = true;
									}
									if (((string_77_.length() ^ 0xffffffff) <= -5)
											&& (Class108_Sub16.method2712(
													string_77_.substring(0, 4),
													-17633))) {
										i_73_ = (Class173.method1139(
												string_77_.substring(0, 4),
												-23213));
										break;
									}
								}
							}
						} catch (Exception exception) {
							/* empty */
						}
					}
					if (!bool_74_ && !bool) {
						if ((i_73_ ^ 0xffffffff) <= -7001
								&& (i_73_ ^ 0xffffffff) >= -9251)
							((Class163_Sub2) this).aBool7612 = false;
						if (i_73_ >= 7000 && i_73_ <= 7999)
							((Class163_Sub2_Sub1) this).aBool8682 = false;
					}
					aBool8679 &= anOpenGL8643
							.method159("GL_ARB_half_float_pixel");
				}
				aString8675.indexOf("intel");
				if (((Class163_Sub2_Sub1) this).aBool8682) {
					try {
						int[] is_78_ = new int[1];
						OpenGL.glGenBuffersARB(1, is_78_, 0);
					} catch (Throwable throwable) {
						throw new RuntimeException("");
					}
				}
			} catch (Throwable throwable) {
				throwable.printStackTrace();
				this.method1072(1);
				throw new RuntimeException("");
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fha.<init>("
					+ (opengl != null ? "{...}" : "null") + ','
					+ (canvas != null ? "{...}" : "null") + ',' + l + ','
					+ (interface1 != null ? "{...}" : "null") + ','
					+ (class146 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final synchronized void method3407(byte i, int i_79_, int i_80_) {
		try {
			anInt8573++;
			Class11_Sub51 class11_sub51 = new Class11_Sub51(i_80_);
			((Class11) class11_sub51).aLong91 = (long) i_79_;
			if (i == -120)
				aClass84_8656.method589((byte) -13, class11_sub51);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fha.VJ(" + i + ','
					+ i_79_ + ',' + i_80_ + ')'));
		}
	}

	final Interface7 method2981(int i, int i_81_, Class98 class98, int i_82_,
			Class366 class366) {
		try {
			if (i_82_ != -20634)
				anInt8637 = 39;
			anInt8640++;
			if (!aBool8683
					&& (!Class261.method1669(i, (byte) 115) || !Class261
							.method1669(i_81_, (byte) 97))) {
				if (!aBool8679)
					return new Class94_Sub2(this, class98, class366,
							Class11_Sub2_Sub33.method3808(i_82_ + 20742, i),
							Class11_Sub2_Sub33.method3808(115, i_81_));
				return new Class94_Sub1(this, class98, class366, i, i_81_);
			}
			return new Class94_Sub2(this, class98, class366, i, i_81_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("fha.HJ(" + i + ',' + i_81_ + ','
							+ (class98 != null ? "{...}" : "null") + ','
							+ i_82_ + ','
							+ (class366 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3008(int i, int i_83_, int i_84_, Class183 class183) {
		try {
			anInt8572++;
			int i_85_;
			int i_86_;
			if (class183 != Class91_Sub2.aClass183_7700) {
				if (Class72_Sub3.aClass183_7316 == class183) {
					i_85_ = 1 + i;
					i_86_ = 3;
				} else if (Class346.aClass183_4590 == class183) {
					i_86_ = 4;
					i_85_ = i * 3;
				} else if (Class7.aClass183_48 != class183) {
					if (Class220_Sub1.aClass183_7150 != class183) {
						i_86_ = 0;
						i_85_ = i;
					} else {
						i_86_ = 5;
						i_85_ = i + 2;
					}
				} else {
					i_86_ = 6;
					i_85_ = 2 + i;
				}
			} else {
				i_85_ = 2 * i;
				i_86_ = 1;
			}
			OpenGL.glDrawArrays(i_86_, i_83_, i_85_);
			int i_87_ = 110 % ((41 - i_84_) / 60);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fha.KF(" + i + ','
					+ i_83_ + ',' + i_84_ + ','
					+ (class183 != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method2977(Class366 class366, Class98 class98, int i) {
		try {
			if (i != 98)
				return false;
			anInt8611++;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fha.KG("
					+ (class366 != null ? "{...}" : "null") + ','
					+ (class98 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method3063(int i, int i_88_, Class183 class183, int i_89_,
			int i_90_, Interface27 interface27, int i_91_) {
		try {
			anInt8605++;
			if (i_89_ != -17390)
				aBool8666 = false;
			int i_92_;
			int i_93_;
			if (class183 != Class91_Sub2.aClass183_7700) {
				if (Class72_Sub3.aClass183_7316 == class183) {
					i_93_ = 3;
					i_92_ = i_88_ + 1;
				} else if (Class346.aClass183_4590 == class183) {
					i_93_ = 4;
					i_92_ = 3 * i_88_;
				} else if (class183 == Class7.aClass183_48) {
					i_93_ = 6;
					i_92_ = i_88_ + 2;
				} else if (class183 != Class220_Sub1.aClass183_7150) {
					i_92_ = i_88_;
					i_93_ = 0;
				} else {
					i_92_ = 2 + i_88_;
					i_93_ = 5;
				}
			} else {
				i_92_ = i_88_ * 2;
				i_93_ = 1;
			}
			Class366 class366 = interface27.method59(-14876);
			Class251_Sub1 class251_sub1 = (Class251_Sub1) interface27;
			class251_sub1.method1600(i_89_ - 7178);
			OpenGL.glDrawElements(
					i_93_,
					i_92_,
					Class11_Sub45_Sub13.method3634(i_89_ ^ ~0x4388, class366),
					(class251_sub1.method1599(true) + (long) (i_91_ * (((Class366) class366).anInt4802))));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("fha.QF(" + i + ',' + i_88_ + ','
							+ (class183 != null ? "{...}" : "null") + ','
							+ i_89_ + ',' + i_90_ + ','
							+ (interface27 != null ? "{...}" : "null") + ','
							+ i_91_ + ')'));
		}
	}

	final Interface8 method1033(int i, int i_94_) {
		try {
			anInt8634++;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.R(" + i + ','
					+ i_94_ + ')');
		}
	}

	final void method3021(byte i) {
		try {
			anInt8607++;
			for (int i_95_ = -1 + ((Class163_Sub2) this).anInt7551; (i_95_ ^ 0xffffffff) <= -1; i_95_--) {
				OpenGL.glActiveTexture(i_95_ + 33984);
				OpenGL.glTexEnvi(8960, 8704, 34160);
				OpenGL.glTexEnvi(8960, 34161, 8448);
				OpenGL.glTexEnvi(8960, 34178, 34166);
				OpenGL.glTexEnvi(8960, 34162, 8448);
				OpenGL.glTexEnvi(8960, 34186, 34166);
			}
			OpenGL.glTexEnvi(8960, 34186, 34168);
			OpenGL.glShadeModel(7425);
			OpenGL.glClearDepth(1.0F);
			OpenGL.glDepthFunc(515);
			OpenGL.glPolygonMode(1028, 6914);
			OpenGL.glEnable(2884);
			OpenGL.glCullFace(1029);
			OpenGL.glAlphaFunc(516, 0.0F);
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadIdentity();
			OpenGL.glColorMaterial(1028, 5634);
			OpenGL.glEnable(2903);
			float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
			for (int i_96_ = 0; i_96_ < 8; i_96_++) {
				int i_97_ = 16384 + i_96_;
				OpenGL.glLightfv(i_97_, 4608, fs, 0);
				OpenGL.glLightf(i_97_, 4615, 0.0F);
				OpenGL.glLightf(i_97_, 4616, 0.0F);
			}
			OpenGL.glFogf(2914, 0.95F);
			OpenGL.glFogi(2917, 9729);
			OpenGL.glHint(3156, 4353);
			anOpenGL8643.setSwapInterval(0);
			super.method3021(i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.AH(" + i + ')');
		}
	}

	final void method1070() {
		try {
			anInt8650++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.VB(" + ')');
		}
	}

	final void method2996(int i, int i_98_, Interface3 interface3) {
		do {
			try {
				anInt8619++;
				aClass251_Sub2Array8665[i] = (Class251_Sub2) interface3;
				if (i_98_ == 1)
					break;
				aClass84_8628 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("fha.RH(" + i
						+ ',' + i_98_ + ','
						+ (interface3 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final Interface17 method3028(int i, byte i_99_, int i_100_,
			Class98 class98, int i_101_, byte[] is) {
		try {
			if (i_99_ >= -56)
				return null;
			anInt8584++;
			return new Class94_Sub4(this, class98, i, i_101_, i_100_, is);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fha.PF(" + i + ','
					+ i_99_ + ',' + i_100_ + ','
					+ (class98 != null ? "{...}" : "null") + ',' + i_101_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void ya() {
		try {
			this.method3039(true, (byte) -110);
			anInt8591++;
			OpenGL.glClear(256);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.ya(" + ')');
		}
	}

	final void method1031() {
		try {
			anInt8622++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.HB(" + ')');
		}
	}

	final void method3088(byte i) {
		try {
			anInt8564++;
			this.method3090((byte) 106);
			int i_102_ = 0;
			if (i > -56)
				((Class163_Sub2_Sub1) this).anIntArray8678 = null;
			for (/**/; ((Class163_Sub2) this).anInt7598 > i_102_; i_102_++) {
				Class11_Sub46 class11_sub46 = ((Class163_Sub2) this).aClass11_Sub46Array7546[i_102_];
				int i_103_ = class11_sub46.method3209((byte) -73);
				int i_104_ = i_102_ + 16386;
				float f = class11_sub46.method3211(-18277) / 255.0F;
				Class163.aFloatArray2114[0] = (float) class11_sub46
						.method3203(false);
				Class163.aFloatArray2114[1] = (float) class11_sub46
						.method3205(121);
				Class163.aFloatArray2114[2] = (float) class11_sub46
						.method3204(true);
				Class163.aFloatArray2114[3] = 1.0F;
				OpenGL.glLightfv(i_104_, 4611, Class163.aFloatArray2114, 0);
				Class163.aFloatArray2114[2] = (float) Class77.method529(255,
						i_103_) * f;
				Class163.aFloatArray2114[0] = f
						* (float) Class77.method529(i_103_ >> 16, 255);
				Class163.aFloatArray2114[1] = (float) Class77.method529(
						i_103_ >> 8, 255) * f;
				Class163.aFloatArray2114[3] = 1.0F;
				OpenGL.glLightfv(i_104_, 4609, Class163.aFloatArray2114, 0);
				OpenGL.glLightf(i_104_, 4617, (1.0F / (float) (class11_sub46
						.method3208(-1) * class11_sub46.method3208(-1))));
				OpenGL.glEnable(i_104_);
			}
			for (/**/; ((i_102_ ^ 0xffffffff) > (((Class163_Sub2) this).anInt7609 ^ 0xffffffff)); i_102_++)
				OpenGL.glDisable(16386 + i_102_);
			super.method3088((byte) -101);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.DF(" + i + ')');
		}
	}

	final void method1043() {
		try {
			anInt8635++;
			if (((Class163_Sub2) this).anInt7393 > 0
					|| ((Class163_Sub2) this).anInt7421 > 0) {
				int i = ((Class163_Sub2) this).anInt7614;
				int i_105_ = ((Class163_Sub2) this).anInt7631;
				int i_106_ = ((Class163_Sub2) this).anInt7543;
				int i_107_ = ((Class163_Sub2) this).anInt7554;
				this.la();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				this.method3019(false);
				this.method3057(false, 8406);
				this.method3068(false, -22042);
				this.method3050(false, -32);
				this.method3039(false, (byte) -82);
				this.method3094(null, -2);
				this.method2998(false, -2, 32242, false);
				this.method3037((byte) 114, 1);
				this.method2994(-1, 0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glCopyPixels(0, 0, ((Class163_Sub2) this).anInt7393,
						((Class163_Sub2) this).anInt7421, 6144);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				this.KA(i, i_106_, i_105_, i_107_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fha.BC(" + ')');
		}
	}

	final synchronized void method3408(int i, int i_108_, int i_109_) {
		do {
			try {
				anInt8604++;
				Class11_Sub51 class11_sub51 = new Class11_Sub51(i_109_);
				((Class11) class11_sub51).aLong91 = (long) i_108_;
				aClass84_8654.method589((byte) -13, class11_sub51);
				if (i >= 42)
					break;
				((Class163_Sub2_Sub1) this).anIntArray8678 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("fha.UJ(" + i
						+ ',' + i_108_ + ',' + i_109_ + ')'));
			}
			break;
		} while (false);
	}

	final Interface7 method2986(int i, int i_110_, int i_111_, int i_112_,
			int i_113_, int[] is, boolean bool) {
		try {
			anInt8582++;
			int i_114_ = -1 / ((50 - i_110_) / 55);
			if (aBool8683
					|| (Class261.method1669(i_111_, (byte) 122) && Class261
							.method1669(i_112_, (byte) 64)))
				return new Class94_Sub2(this, i_111_, i_112_, bool, is, i_113_,
						i);
			if (!aBool8679) {
				Class94_Sub2 class94_sub2 = new Class94_Sub2(this,
						Class364.aClass98_4774, Class366.aClass366_4808,
						Class11_Sub2_Sub33.method3808(112, i_111_),
						Class11_Sub2_Sub33.method3808(109, i_112_));
				class94_sub2
						.method25(i_112_, i, is, 0, true, i_113_, i_111_, 0);
				return class94_sub2;
			}
			return new Class94_Sub1(this, i_111_, i_112_, is, i_113_, i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fha.NF(" + i + ','
					+ i_110_ + ',' + i_111_ + ',' + i_112_ + ',' + i_113_ + ','
					+ (is != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	static {
		aClass22_8565 = new Class22(8);
	}
}
