/* Class236_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class236_Sub8 extends Class236 {
	private boolean aBool7051;
	static int anInt7052;
	static int anInt7053;
	static int anInt7054;
	static int anInt7055;
	private Class277 aClass277_7056;
	private Class277 aClass277_7057;
	private boolean aBool7058;
	static IncomingPacket SEND_MINIMAP_FLAG_IN_PACKET = new IncomingPacket(93,
			2);
	static int anInt7060;
	static int anInt7061;
	static int anInt7062;
	static int anInt7063;
	static int anInt7064;
	static int anInt7065;
	static int anInt7066;
	static int anInt7067;
	private Class321_Sub3 aClass321_Sub3_7068;
	static Class33 aClass33_7069;
	private boolean aBool7070;
	static int anInt7071;
	static int anInt7072;
	private Class277 aClass277_7073;
	private boolean aBool7074 = false;
	private Class277 aClass277_7075;
	static IncomingPacket aClass160_7076 = new IncomingPacket(77, 1);

	final void method1502(int i) {
		do {
			try {
				anInt7054++;
				if (aBool7058) {
					OpenGL.glBindProgramARB(34336, 0);
					OpenGL.glDisable(34820);
					OpenGL.glDisable(34336);
					aBool7058 = false;
				}
				((Class236) this).aClass163_Sub3_3222.method3253(1, true);
				if (i > 74) {
					((Class236) this).aClass163_Sub3_3222.method3295(null, 74);
					((Class236) this).aClass163_Sub3_3222.method3315(false,
							8448, 8448);
					((Class236) this).aClass163_Sub3_3222.method3252((byte) 34,
							0, 768, 5890);
					((Class236) this).aClass163_Sub3_3222.method3252((byte) 34,
							2, 770, 34166);
					((Class236) this).aClass163_Sub3_3222.method3317(5890, 0,
							770, (byte) -95);
					((Class236) this).aClass163_Sub3_3222.method3253(0, true);
					if (!aBool7074)
						break;
					((Class236) this).aClass163_Sub3_3222.method3252((byte) 34,
							0, 768, 5890);
					((Class236) this).aClass163_Sub3_3222.method3317(5890, 0,
							770, (byte) 73);
					aBool7074 = false;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "pb.C(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1505(boolean bool, boolean bool_0_) {
		try {
			aBool7051 = bool_0_;
			anInt7052++;
			((Class236) this).aClass163_Sub3_3222.method3253(1, bool);
			((Class236) this).aClass163_Sub3_3222.method3295(
					aClass321_Sub3_7068, 59);
			((Class236) this).aClass163_Sub3_3222
					.method3315(!bool, 34165, 7681);
			((Class236) this).aClass163_Sub3_3222.method3252((byte) 34, 0, 768,
					34166);
			((Class236) this).aClass163_Sub3_3222.method3252((byte) 34, 2, 770,
					5890);
			((Class236) this).aClass163_Sub3_3222.method3317(34168, 0, 770,
					(byte) 80);
			((Class236) this).aClass163_Sub3_3222.method3253(0, bool);
			method2881((byte) -87);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pb.H(" + bool + ','
					+ bool_0_ + ')');
		}
	}

	final void method2877(int i) {
		do {
			try {
				anInt7071++;
				if (i != 34336)
					aBool7051 = true;
				if (!aBool7058)
					break;
				int i_1_ = ((Class236) this).aClass163_Sub3_3222.XA();
				int i_2_ = ((Class236) this).aClass163_Sub3_3222.i();
				float f = (float) i_1_ - (float) (i_1_ + -i_2_) * 0.125F;
				float f_3_ = (float) i_1_ - 0.25F * (float) (-i_2_ + i_1_);
				OpenGL.glProgramLocalParameter4fARB(
						34336,
						0,
						f_3_,
						f,
						1.0F / (float) (((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).anInt8366),
						((float) ((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).anInt8411 / 255.0F));
				((Class236) this).aClass163_Sub3_3222.method3253(1, true);
				((Class236) this).aClass163_Sub3_3222
						.method3302(
								(((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).anInt8405),
								(byte) 28);
				((Class236) this).aClass163_Sub3_3222.method3253(0, true);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "pb.M(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1504(int i, int i_4_, Class321 class321) {
		try {
			anInt7062++;
			do {
				if (class321 != null) {
					if (aBool7074) {
						((Class236) this).aClass163_Sub3_3222.method3252(
								(byte) 34, 0, 768, 5890);
						((Class236) this).aClass163_Sub3_3222.method3317(5890,
								0, 770, (byte) -100);
						aBool7074 = false;
					}
					((Class236) this).aClass163_Sub3_3222.method3295(class321,
							87);
					((Class236) this).aClass163_Sub3_3222.method3260(i,
							(byte) 17);
					if (!client.aBool10531)
						break;
				}
				if (!aBool7074) {
					((Class236) this).aClass163_Sub3_3222
							.method3295(
									(((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aClass321_Sub3_8321),
									112);
					((Class236) this).aClass163_Sub3_3222.method3260(1,
							(byte) 17);
					((Class236) this).aClass163_Sub3_3222.method3252((byte) 34,
							0, 768, 34168);
					((Class236) this).aClass163_Sub3_3222.method3317(34168, 0,
							770, (byte) 118);
					aBool7074 = true;
				}
			} while (false);
			int i_5_ = 107 % ((52 - i_4_) / 62);
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(
							runtimeexception,
							("pb.I(" + i + ',' + i_4_ + ','
									+ (class321 != null ? "{...}" : "null") + ')'));
		}
	}

	static final String method2878(boolean bool) {
		try {
			if (bool != false)
				return null;
			anInt7066++;
			if (Class306.aBool4114
					|| Class11_Sub19.aClass11_Sub45_Sub5_5815 == null)
				return "";
			return (((Class11_Sub45_Sub5) Class11_Sub19.aClass11_Sub45_Sub5_5815).aString8756);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pb.N(" + bool + ')');
		}
	}

	static final Class212 method2879(int i, Class206 class206, int i_6_,
			int i_7_, byte i_8_) {
		try {
			anInt7072++;
			if (i_8_ != 14)
				return null;
			if (class206 == null)
				return null;
			Class212 class212 = new Class212(i_6_, i, i_7_, class206.na(),
					class206.V(), class206.RA(), class206.fa(), class206.EA(),
					class206.HA(), class206.G());
			return class212;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pb.L(" + i + ','
					+ (class206 != null ? "{...}" : "null") + ',' + i_6_ + ','
					+ i_7_ + ',' + i_8_ + ')'));
		}
	}

	static final void method2880(int i, int i_9_, int i_10_, int i_11_,
			int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_) {
		do {
			try {
				anInt7063++;
				if ((i_10_ ^ 0xffffffff) != (i_11_ ^ 0xffffffff)
						|| (i_13_ ^ 0xffffffff) != (i_17_ ^ 0xffffffff)
						|| i_15_ != i_16_ || i_9_ != i_14_) {
					int i_18_ = i_10_;
					int i_19_ = i_17_;
					int i_20_ = 3 * i_10_;
					int i_21_ = i_17_ * 3;
					int i_22_ = 3 * i_11_;
					int i_23_ = 3 * i_13_;
					int i_24_ = i_15_ * 3;
					int i_25_ = 3 * i_9_;
					int i_26_ = -i_10_ + i_22_ + (i_16_ + -i_24_);
					int i_27_ = -i_17_ + (i_14_ + (-i_25_ - -i_23_));
					int i_28_ = i_20_ + -i_22_ + i_24_ - i_22_;
					int i_29_ = i_21_ + -i_23_ + i_25_ - i_23_;
					int i_30_ = -i_20_ + i_22_;
					int i_31_ = -i_21_ + i_23_;
					for (int i_32_ = 128; i_32_ <= 4096; i_32_ += 128) {
						int i_33_ = i_32_ * i_32_ >> 12;
						int i_34_ = i_33_ * i_32_ >> 12;
						int i_35_ = i_34_ * i_26_;
						int i_36_ = i_27_ * i_34_;
						int i_37_ = i_28_ * i_33_;
						int i_38_ = i_33_ * i_29_;
						int i_39_ = i_30_ * i_32_;
						int i_40_ = i_32_ * i_31_;
						int i_41_ = i_10_ - -(i_39_ + (i_37_ + i_35_) >> 12);
						int i_42_ = i_17_ - -(i_40_ + i_36_ - -i_38_ >> 12);
						Class153.method960(i_19_, i_18_, i_42_, i_12_, i_41_,
								120);
						i_18_ = i_41_;
						i_19_ = i_42_;
					}
				} else
					Class153.method960(i_17_, i_10_, i_14_, i_12_, i_16_,
							i + 41);
				if (i == 3)
					break;
				SEND_MINIMAP_FLAG_IN_PACKET = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("pb.P(" + i + ','
						+ i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ','
						+ i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ','
						+ i_17_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1506(int i, int i_43_, int i_44_) {
		try {
			if (i_43_ > 72)
				anInt7055++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pb.B(" + i + ','
					+ i_43_ + ',' + i_44_ + ')'));
		}
	}

	Class236_Sub8(Class163_Sub3 class163_sub3) {
		super(class163_sub3);
		try {
			if (!((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aBool8404)
				aBool7070 = false;
			else {
				aClass277_7056 = (Class321
						.method1960(
								true,
								34336,
								((Class236) this).aClass163_Sub3_3222,
								"!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
				aClass277_7075 = (Class321
						.method1960(
								true,
								34336,
								((Class236) this).aClass163_Sub3_3222,
								"!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
				aClass277_7057 = (Class321
						.method1960(
								true,
								34336,
								((Class236) this).aClass163_Sub3_3222,
								"!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
				aClass277_7073 = (Class321
						.method1960(
								true,
								34336,
								((Class236) this).aClass163_Sub3_3222,
								"!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
				if (aClass277_7073 != null
						& (aClass277_7057 != null & (aClass277_7075 != null & aClass277_7056 != null))) {
					aClass321_Sub3_7068 = new Class321_Sub3(class163_sub3,
							3553, 6406, 2, 1, false, new byte[] { 0, -1 },
							6406, false);
					aClass321_Sub3_7068.method2855(false, false, 107);
					aBool7070 = true;
				} else
					aBool7070 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pb.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ')');
		}
	}

	final void method2881(byte i) {
		try {
			anInt7061++;
			if (i <= -11) {
				Class33_Sub1 class33_sub1 = (((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aClass33_Sub1_8305);
				if (!aBool7051)
					OpenGL.glBindProgramARB(
							34336,
							((((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).anInt8386 ^ 0xffffffff) != -2147483648 ? ((Class277) aClass277_7057).anInt3741
									: ((Class277) aClass277_7056).anInt3741));
				else
					OpenGL.glBindProgramARB(
							34336,
							((((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).anInt8386) == 2147483647 ? ((Class277) aClass277_7075).anInt3741
									: ((Class277) aClass277_7073).anInt3741));
				class33_sub1
						.method2629(
								(float) (((Class163_Sub3) (((Class236) this).aClass163_Sub3_3222)).anInt8386),
								-1.0F, Class133.aFloatArray1847, 0.0F, 0.0F,
								(byte) 124);
				OpenGL.glProgramLocalParameter4fARB(34336, 1,
						Class133.aFloatArray1847[0],
						Class133.aFloatArray1847[1],
						Class133.aFloatArray1847[2],
						Class133.aFloatArray1847[3]);
				OpenGL.glEnable(34336);
				aBool7058 = true;
				method2877(34336);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pb.O(" + i + ')');
		}
	}

	final void method1508(int i, boolean bool) {
		do {
			try {
				anInt7067++;
				if (i == 17660)
					break;
				method2883(81);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "pb.A(" + i + ','
						+ bool + ')');
			}
			break;
		} while (false);
	}

	static final int method2882(int i, int i_45_, int i_46_, int i_47_,
			int i_48_, int i_49_, int i_50_) {
		try {
			anInt7060++;
			if ((0x1 & i_50_ ^ 0xffffffff) == -2) {
				int i_51_ = i;
				i = i_46_;
				i_46_ = i_51_;
			}
			if (i_45_ != 31172)
				method2882(-11, -82, 79, -8, 12, 95, -119);
			i_49_ &= 0x3;
			if (i_49_ == 0)
				return i_48_;
			if ((i_49_ ^ 0xffffffff) == -2)
				return -i_47_ + 8 + -i;
			if ((i_49_ ^ 0xffffffff) == -3)
				return -i_46_ + 1 + (7 + -i_48_);
			return i_47_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pb.J(" + i + ','
					+ i_45_ + ',' + i_46_ + ',' + i_47_ + ',' + i_48_ + ','
					+ i_49_ + ',' + i_50_ + ')'));
		}
	}

	final boolean method1500(byte i) {
		try {
			int i_52_ = 92 % ((-9 - i) / 53);
			anInt7065++;
			return aBool7070;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pb.D(" + i + ')');
		}
	}

	public static void method2883(int i) {
		try {
			if (i < 23)
				method2878(true);
			SEND_MINIMAP_FLAG_IN_PACKET = null;
			aClass33_7069 = null;
			aClass160_7076 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pb.K(" + i + ')');
		}
	}
}
