/* Class236_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class236_Sub2 extends Class236 {
	private float[] aFloatArray6207;
	static int anInt6208;
	static int anInt6209;
	static int anInt6210;
	private int anInt6211;
	private Class299 aClass299_6212;
	static int anInt6213;
	private Class277 aClass277_6214;
	static int anInt6215;
	static int anInt6216;
	private float aFloat6217;
	static int anInt6218;
	static int anInt6219;
	static int anInt6220;
	private Class337 aClass337_6221;
	static int anInt6222;

	final void method1502(int i) {
		try {
			anInt6220++;
			if (aClass337_6221 != null && i >= 74) {
				aClass337_6221.method2026(-52, '\001');
				((Class236) this).aClass163_Sub3_3222.method3253(1, true);
				((Class236) this).aClass163_Sub3_3222.method3295(null, 99);
				((Class236) this).aClass163_Sub3_3222.method3253(0, true);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gh.C(" + i + ')');
		}
	}

	private final void method2639(int i) {
		try {
			anInt6216++;
			aClass337_6221 = new Class337(
					((Class236) this).aClass163_Sub3_3222, 2);
			aClass337_6221.method2028(0, 107);
			((Class236) this).aClass163_Sub3_3222.method3253(1, true);
			((Class236) this).aClass163_Sub3_3222.method3302(-16777216,
					(byte) 28);
			((Class236) this).aClass163_Sub3_3222.method3315(false, 260, i);
			((Class236) this).aClass163_Sub3_3222.method3317(34166, 0, 770,
					(byte) -95);
			((Class236) this).aClass163_Sub3_3222.method3253(0, true);
			OpenGL.glBindProgramARB(34336,
					((Class277) aClass277_6214).anInt3741);
			OpenGL.glEnable(34336);
			aClass337_6221.method2027(-50135600);
			aClass337_6221.method2028(1, 64);
			((Class236) this).aClass163_Sub3_3222.method3253(1, true);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			((Class236) this).aClass163_Sub3_3222.method3260(0, (byte) 17);
			((Class236) this).aClass163_Sub3_3222.method3317(5890, 0, 770,
					(byte) 98);
			((Class236) this).aClass163_Sub3_3222.method3253(0, true);
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34336);
			OpenGL.glDisable(34820);
			aClass337_6221.method2027(-50135600);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gh.J(" + i + ')');
		}
	}

	static final void method2640(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_) {
		try {
			if (i_1_ > 98) {
				anInt6222++;
				Class11_Sub2_Sub32_Sub1.method3883(i_4_,
						(Class297.anIntArrayArray4026[i_2_++]), (byte) 87,
						i_0_, i);
				Class11_Sub2_Sub32_Sub1.method3883(i_4_,
						(Class297.anIntArrayArray4026[i_3_--]), (byte) 88,
						i_0_, i);
				for (int i_5_ = i_2_; (i_5_ ^ 0xffffffff) >= (i_3_ ^ 0xffffffff); i_5_++) {
					int[] is = Class297.anIntArrayArray4026[i_5_];
					is[i_4_] = is[i] = i_0_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("gh.K(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ','
							+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	Class236_Sub2(Class163_Sub3 class163_sub3, Class299 class299) {
		super(class163_sub3);
		do {
			try {
				aClass299_6212 = class299;
				if (!(((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aBool8404)
						|| (((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).anInt8344 ^ 0xffffffff) > -3)
					break;
				aClass277_6214 = (Class321
						.method1960(
								true,
								34336,
								((Class236) this).aClass163_Sub3_3222,
								"!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND"));
				if (aClass277_6214 != null) {
					int[][] is = Class11_Sub45_Sub13.method3628(4, 0, 3,
							(byte) -108, false, 64, 256, 0.4F, 4);
					int[][] is_6_ = Class11_Sub45_Sub13.method3628(4, 8, 3,
							(byte) -121, false, 64, 256, 0.4F, 4);
					int i = 0;
					aFloatArray6207 = new float[32768];
					for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -257; i_7_++) {
						int[] is_8_ = is[i_7_];
						int[] is_9_ = is_6_[i_7_];
						for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -65; i_10_++) {
							aFloatArray6207[i++] = (float) is_8_[i_10_] / 4096.0F;
							aFloatArray6207[i++] = (float) is_9_[i_10_] / 4096.0F;
						}
					}
					method2639(7681);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("gh.<init>("
						+ (class163_sub3 != null ? "{...}" : "null") + ','
						+ (class299 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method1508(int i, boolean bool) {
		try {
			if (i != 17660)
				method1506(106, -127, 106);
			anInt6210++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gh.A(" + i + ','
					+ bool + ')');
		}
	}

	final void method1505(boolean bool, boolean bool_11_) {
		do {
			try {
				anInt6213++;
				if (aClass337_6221 != null) {
					aClass337_6221.method2026(-114, '\0');
					((Class236) this).aClass163_Sub3_3222.method3253(1, bool);
					OpenGL.glMatrixMode(5890);
					OpenGL.glLoadMatrixf(
							((Class163_Sub3) (((Class236) this).aClass163_Sub3_3222)).aClass33_Sub1_8306
									.method2634(111), 0);
					OpenGL.glMatrixMode(5888);
					if (bool != true)
						anInt6211 = -71;
					((Class236) this).aClass163_Sub3_3222.method3253(0, bool);
					if (((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).anInt8273 == anInt6211)
						break;
					int i = (((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).anInt8273 % 5000 * 128 / 5000);
					for (int i_12_ = 0; i_12_ < 64; i_12_++) {
						OpenGL.glProgramLocalParameter4fvARB(34336, i_12_,
								aFloatArray6207, i);
						i += 2;
					}
					if (((Class299) aClass299_6212).aBool4034)
						aFloat6217 = (float) ((((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).anInt8273) % 4000) / 4000.0F;
					else
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F,
								0.0F, 0.0F, 1.0F);
					anInt6211 = ((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).anInt8273;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("gh.H(" + bool
						+ ',' + bool_11_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1504(int i, int i_13_, Class321 class321) {
		try {
			anInt6215++;
			((Class236) this).aClass163_Sub3_3222.method3295(class321, 127);
			int i_14_ = 69 % ((i_13_ - 52) / 62);
			((Class236) this).aClass163_Sub3_3222.method3260(i, (byte) 17);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("gh.I(" + i + ',' + i_13_ + ','
							+ (class321 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1506(int i, int i_15_, int i_16_) {
		try {
			anInt6219++;
			if (aClass337_6221 != null) {
				((Class236) this).aClass163_Sub3_3222.method3253(1, true);
				if ((i & 0x80 ^ 0xffffffff) != -1)
					((Class236) this).aClass163_Sub3_3222.method3295(null, 94);
				else if ((0x1 & i_16_) == 1) {
					if (!((Class299) aClass299_6212).aBool4034) {
						int i_17_ = ((((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).anInt8273) % 4000 * 16 / 4000);
						((Class236) this).aClass163_Sub3_3222
								.method3295(
										(((Class299) aClass299_6212).aClass321_Sub3Array4039[i_17_]),
										102);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F,
								0.0F, 0.0F, 1.0F);
					} else {
						((Class236) this).aClass163_Sub3_3222
								.method3295(
										((Class299) aClass299_6212).aClass321_Sub2_4040,
										56);
						OpenGL.glProgramLocalParameter4fARB(34336, 65,
								aFloat6217, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (!((Class299) aClass299_6212).aBool4034)
						((Class236) this).aClass163_Sub3_3222
								.method3295(
										(((Class299) aClass299_6212).aClass321_Sub3Array4039[0]),
										108);
					else
						((Class236) this).aClass163_Sub3_3222
								.method3295(
										((Class299) aClass299_6212).aClass321_Sub2_4040,
										36);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
				}
				((Class236) this).aClass163_Sub3_3222.method3253(0, true);
				if (i_15_ < 72)
					method1504(107, -128, null);
				if ((0x40 & i) != 0)
					OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F,
							1.0F, 1.0F);
				else {
					Class163_Sub3.aFloatArray8251[2] = (((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aFloat8334 * (((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aFloat8349));
					Class163_Sub3.aFloatArray8251[0] = (((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aFloat8402 * (((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aFloat8349));
					Class163_Sub3.aFloatArray8251[1] = (((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aFloat8349 * (((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aFloat8378));
					OpenGL.glProgramLocalParameter4fvARB(34336, 66,
							(Class163_Sub3.aFloatArray8251), 0);
				}
				int i_18_ = i & 0x3;
				if ((i_18_ ^ 0xffffffff) != -3) {
					if ((i_18_ ^ 0xffffffff) == -4)
						OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F,
								1.0F, 1.0F, 1.0F);
					else
						OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F,
								1.0F, 1.0F, 1.0F);
				} else
					OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F,
							1.0F, 1.0F);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gh.B(" + i + ','
					+ i_15_ + ',' + i_16_ + ')'));
		}
	}

	static final boolean method2641(int i) {
		try {
			anInt6208++;
			try {
				if (Class318.anInt4230 == 2) {
					if (Class66.aClass11_Sub34_949 == null) {
						Class66.aClass11_Sub34_949 = Class11_Sub34.method2802(
								Class29.aClass146_397,
								(Class108_Sub16.anInt6539),
								(Class234_Sub2.anInt5986));
						if (Class66.aClass11_Sub34_949 == null)
							return false;
					}
					if (Class108_Sub8.aClass365_5740 == null)
						Class108_Sub8.aClass365_5740 = new Class365(
								Class131.aClass146_1824,
								(Class11_Sub45_Sub16_Sub2.aClass146_10170));
					Class11_Sub6_Sub2 class11_sub6_sub2 = Class364.aClass11_Sub6_Sub2_4773;
					if (Class334.aClass11_Sub6_Sub2_4425 != null)
						class11_sub6_sub2 = Class334.aClass11_Sub6_Sub2_4425;
					if (class11_sub6_sub2.method3513(19196, 22050,
							Class234_Sub2_Sub2.aClass146_8997,
							Class108_Sub8.aClass365_5740,
							Class66.aClass11_Sub34_949)) {
						Class364.aClass11_Sub6_Sub2_4773 = class11_sub6_sub2;
						Class364.aClass11_Sub6_Sub2_4773.method3522((byte) 125);
						if (IncomingPacket.anInt2084 > 0) {
							Class318.anInt4230 = 3;
							Class364.aClass11_Sub6_Sub2_4773
									.method3515(
											((Class376_Sub7_Sub3.anInt9278 < IncomingPacket.anInt2084) ? Class376_Sub7_Sub3.anInt9278
													: IncomingPacket.anInt2084),
											100);
							for (int i_19_ = 0; ((Class301.anIntArray4058.length ^ 0xffffffff) < (i_19_ ^ 0xffffffff)); i_19_++) {
								Class364.aClass11_Sub6_Sub2_4773.method3491(
										i_19_, (byte) 113,
										Class301.anIntArray4058[i_19_]);
								Class301.anIntArray4058[i_19_] = 255;
							}
						} else {
							Class318.anInt4230 = 0;
							Class364.aClass11_Sub6_Sub2_4773.method3515(
									Class376_Sub7_Sub3.anInt9278, 93);
							for (int i_20_ = 0; ((i_20_ ^ 0xffffffff) > (Class301.anIntArray4058.length ^ 0xffffffff)); i_20_++) {
								Class364.aClass11_Sub6_Sub2_4773.method3491(
										i_20_, (byte) 113,
										Class301.anIntArray4058[i_20_]);
								Class301.anIntArray4058[i_20_] = 255;
							}
						}
						if (Class334.aClass11_Sub6_Sub2_4425 == null) {
							if (Class91.aLong1234 <= 0L)
								Class364.aClass11_Sub6_Sub2_4773.method3516(
										true, Class66.aClass11_Sub34_949,
										Class226.aBool3113);
							else
								Class364.aClass11_Sub6_Sub2_4773.method3493(
										true, Class66.aClass11_Sub34_949,
										false, Class91.aLong1234,
										Class226.aBool3113);
						}
						if (Class11_Sub45_Sub7.aClass37_8800 != null)
							Class11_Sub45_Sub7.aClass37_8800.method326(true,
									Class364.aClass11_Sub6_Sub2_4773);
						Class334.aClass11_Sub6_Sub2_4425 = null;
						Class66.aClass11_Sub34_949 = null;
						Class29.aClass146_397 = null;
						Class108_Sub8.aClass365_5740 = null;
						Class91.aLong1234 = 0L;
						return true;
					}
				}
			} catch (Exception exception) {
				exception.printStackTrace();
				Class364.aClass11_Sub6_Sub2_4773.method3490(i ^ ~0x5832);
				Class334.aClass11_Sub6_Sub2_4425 = null;
				Class66.aClass11_Sub34_949 = null;
				Class318.anInt4230 = 0;
				Class108_Sub8.aClass365_5740 = null;
				Class29.aClass146_397 = null;
			}
			if (i != -22595)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gh.L(" + i + ')');
		}
	}

	final boolean method1500(byte i) {
		try {
			anInt6218++;
			int i_21_ = 100 / ((i + 9) / 53);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gh.D(" + i + ')');
		}
	}
}
