/* Class236_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class236_Sub1 extends Class236 {
	static int[] anIntArray6080 = new int[1000];
	static int anInt6081;
	private Class21 aClass21_6082;
	static int anInt6083;
	static int anInt6084;
	static int anInt6085;
	static int anInt6086 = -1;
	static int anInt6087;
	private Class299 aClass299_6088;
	static int anInt6089;
	private boolean aBool6090;
	static int anInt6091;
	static boolean aBool6092;
	static boolean aBool6093 = true;
	private boolean aBool6094 = false;
	static int anInt6095;

	final void method1506(int i, int i_0_, int i_1_) {
		do {
			try {
				if (aBool6090) {
					int i_2_ = 1 << (i & 0x3);
					float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
					int i_3_ = 0xffff & i_1_;
					float f_4_ = (float) ((i_1_ & 0x3598a) >> 16) / 8.0F;
					float f_5_ = (float) ((0x7dea02 & i_1_) >> 19) / 16.0F;
					float f_6_ = (float) (i_1_ >> 23 & 0xf) / 16.0F;
					int i_7_ = 0xf & i_1_ >> 27;
					long l = ((Class21) aClass21_6082).aLong176;
					OpenGL.glUniform1fARB(
							OpenGL.glGetUniformLocationARB(l, "time"),
							(float) ((((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).anInt8273)
									* i_2_ % 40000) / 40000.0F);
					OpenGL.glUniform1fARB(
							OpenGL.glGetUniformLocationARB(l, "scale"), f);
					OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l,
							"breakWaterDepth"), (float) i_3_);
					OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l,
							"breakWaterOffset"), f_4_);
					OpenGL.glUniform2fARB(
							OpenGL.glGetUniformLocationARB(l, "waveIntensity"),
							f_6_, f_5_);
					OpenGL.glUniform1fARB(
							OpenGL.glGetUniformLocationARB(l, "waveExponent"),
							(float) i_7_);
				}
				anInt6081++;
				if (i_0_ > 72)
					break;
				aBool6093 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("fb.B(" + i + ','
						+ i_0_ + ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1504(int i, int i_8_, Class321 class321) {
		try {
			if (!aBool6090) {
				((Class236) this).aClass163_Sub3_3222.method3295(class321, 56);
				((Class236) this).aClass163_Sub3_3222.method3260(i, (byte) 17);
			}
			int i_9_ = 29 / ((52 - i_8_) / 62);
			anInt6091++;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(
							runtimeexception,
							("fb.I(" + i + ',' + i_8_ + ','
									+ (class321 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1505(boolean bool, boolean bool_10_) {
		do {
			try {
				anInt6089++;
				if (bool == true) {
					Class321_Sub1 class321_sub1 = ((Class236) this).aClass163_Sub3_3222
							.method3298(0);
					if (!aBool6094 || class321_sub1 == null)
						break;
					float f = ((1.0F - Math
							.abs(((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aFloatArray8328[1])) * 2.0F + 1.0F);
					((Class236) this).aClass163_Sub3_3222.method3253(1, bool);
					((Class236) this).aClass163_Sub3_3222.method3295(
							class321_sub1, 73);
					((Class236) this).aClass163_Sub3_3222.method3253(0, true);
					((Class236) this).aClass163_Sub3_3222
							.method3295(
									((Class299) aClass299_6088).aClass321_Sub2_4033,
									51);
					long l = ((Class21) aClass21_6082).aLong176;
					OpenGL.glUseProgramObjectARB(l);
					OpenGL.glUniform1iARB(
							OpenGL.glGetUniformLocationARB(l, "normalSampler"),
							0);
					OpenGL.glUniform1iARB(
							OpenGL.glGetUniformLocationARB(l, "envMapSampler"),
							1);
					OpenGL.glUniform3fARB(
							OpenGL.glGetUniformLocationARB(l, "sunDir"),
							-(((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aFloatArray8328[0]),
							-(((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aFloatArray8328[1]),
							-(((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aFloatArray8328[2]));
					OpenGL.glUniform4fARB(
							OpenGL.glGetUniformLocationARB(l, "sunColour"),
							f
									* (((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aFloat8402),
							f
									* (((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aFloat8378),
							(((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aFloat8334 * f),
							1.0F);
					OpenGL.glUniform1fARB(
							OpenGL.glGetUniformLocationARB(l, "sunExponent"),
							(64.0F + Math
									.abs(((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aFloatArray8328[1]) * 928.0F));
					aBool6090 = true;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("fb.H(" + bool
						+ ',' + bool_10_ + ')'));
			}
			break;
		} while (false);
	}

	Class236_Sub1(Class163_Sub3 class163_sub3, Class299 class299) {
		super(class163_sub3);
		aBool6090 = false;
		do {
			try {
				aClass299_6088 = class299;
				if (((Class299) aClass299_6088).aClass321_Sub2_4033 == null
						|| !((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aBool8358
						|| !((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aBool8397)
					break;
				Class95 class95 = (Class324
						.method1975(
								(byte) 120,
								((Class236) this).aClass163_Sub3_3222,
								"uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n",
								35633));
				Class95 class95_11_ = (Class324
						.method1975(
								(byte) 120,
								((Class236) this).aClass163_Sub3_3222,
								"varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n",
								35632));
				aClass21_6082 = Class11_Sub2_Sub4.method3351((new Class95[] {
						class95, class95_11_ }), -1,
						(((Class236) this).aClass163_Sub3_3222));
				aBool6094 = aClass21_6082 != null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("fb.<init>("
						+ (class163_sub3 != null ? "{...}" : "null") + ','
						+ (class299 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final int method2604(Class146 class146, int i) {
		try {
			anInt6083++;
			int i_12_ = 0;
			if (class146.method918(Class57.anInt861, 108))
				i_12_++;
			if (class146.method918(Class236_Sub7.anInt6975, 93))
				i_12_++;
			if (class146.method918(Class307.anInt4119, -46))
				i_12_++;
			if (class146.method918(Class236_Sub3.anInt6253, -30))
				i_12_++;
			if (i > -20)
				return 64;
			if (class146.method918(Class335_Sub3.anInt7800, 95))
				i_12_++;
			if (class146.method918(Class108_Sub10.anInt6140, 113))
				i_12_++;
			if (class146.method918(Class108_Sub10.anInt6139, 116))
				i_12_++;
			if (class146.method918(Class234_Sub2_Sub1.anInt8450, 120))
				i_12_++;
			if (class146.method918(Class11_Sub2_Sub3.anInt8478, 92))
				i_12_++;
			if (class146.method918(Class196.anInt2657, -63))
				i_12_++;
			if (class146.method918(Class104.anInt1388, -35))
				i_12_++;
			if (class146.method918(Class1.anInt5, -105))
				i_12_++;
			if (class146.method918(Class147.anInt1991, 92))
				i_12_++;
			if (class146.method918(Class9.anInt66, -39))
				i_12_++;
			if (class146.method918(Class67.anInt951, -125))
				i_12_++;
			if (class146.method918(Class353.anInt4643, -59))
				i_12_++;
			return i_12_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fb.K("
					+ (class146 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method1508(int i, boolean bool) {
		try {
			if (i == 17660)
				anInt6085++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fb.A(" + i + ','
					+ bool + ')');
		}
	}

	final void method1502(int i) {
		try {
			if (i <= 74)
				aBool6092 = true;
			if (aBool6090) {
				((Class236) this).aClass163_Sub3_3222.method3253(1, true);
				((Class236) this).aClass163_Sub3_3222.method3295(null, 37);
				((Class236) this).aClass163_Sub3_3222.method3253(0, true);
				((Class236) this).aClass163_Sub3_3222.method3295(null, 79);
				OpenGL.glUseProgramObjectARB(0L);
				aBool6090 = false;
			}
			anInt6084++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fb.C(" + i + ')');
		}
	}

	final boolean method1500(byte i) {
		try {
			anInt6095++;
			int i_13_ = -14 / ((i + 9) / 53);
			return aBool6094;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fb.D(" + i + ')');
		}
	}

	static final void method2605(byte i, boolean bool) {
		try {
			if (!bool || Class32.aClass11_Sub45_Sub19_418 == null)
				Class62.anInt908 = -1;
			else
				Class62.anInt908 = (((Class11_Sub45_Sub19) Class32.aClass11_Sub45_Sub19_418).anInt9714);
			anInt6087++;
			ISAAC.aClass84_265 = null;
			Class32.aClass11_Sub45_Sub19_418 = null;
			Class333.aClass192_4417 = null;
			Class164.anInt2133 = 0;
			Class32.method266();
			Class32.aClass84_425.method586((byte) -19);
			if (i != 113)
				anInt6086 = -16;
			Class112.aClass40_1543 = null;
			Class108_Sub11.aClass40_6150 = null;
			Class11_Sub45_Sub12.aClass40_9190 = null;
			Class300.aClass40_4048 = null;
			Class32.aClass342_431 = null;
			Class211.aClass40_2860 = null;
			Class117.aClass40_1596 = null;
			Class127.anInt1720 = -1;
			Class11_Sub32.aClass40_6869 = null;
			Class11_Sub12.anInt5446 = -1;
			Class272.aClass253_3673 = null;
			Class357.aClass40_4667 = null;
			if (Class32.aClass280_420 != null) {
				Class32.aClass280_420.method1723((byte) -86);
				Class32.aClass280_420.method1724(64, (byte) -16, 128);
			}
			if (Class32.aClass29_419 != null)
				Class32.aClass29_419.method251(2060105417, 64, 64);
			if (Class32.aClass290_415 != null)
				Class32.aClass290_415.method1792(64, i ^ 0xd);
			Class11_Sub50_Sub2.aClass369_9082.method2181(i ^ ~0x71, 64);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fb.J(" + i + ','
					+ bool + ')');
		}
	}

	public static void method2606(int i) {
		try {
			if (i != -28581)
				aBool6093 = true;
			anIntArray6080 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fb.L(" + i + ')');
		}
	}
}
