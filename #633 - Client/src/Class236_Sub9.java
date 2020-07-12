/* Class236_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class236_Sub9 extends Class236 {
	static int anInt7731;
	private Class299 aClass299_7732;
	static long aLong7733;
	static int anInt7734;
	static int anInt7735;
	static int anInt7736;
	private boolean aBool7737 = false;
	private boolean aBool7738 = false;
	static IncomingPacket incomingPacket = null;
	static int anInt7740;
	static int anInt7741;
	static int anInt7742;
	static int anInt7743;
	static int anInt7744;
	static int anInt7745;
	private Class21 aClass21_7746;

	final boolean method1500(byte i) {
		try {
			int i_0_ = -58 % ((-9 - i) / 53);
			anInt7740++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tf.D(" + i + ')');
		}
	}

	final void method1504(int i, int i_1_, Class321 class321) {
		try {
			anInt7734++;
			if (!aBool7737) {
				((Class236) this).aClass163_Sub3_3222.method3295(class321, 118);
				((Class236) this).aClass163_Sub3_3222.method3260(i, (byte) 17);
			}
			int i_2_ = -122 % ((i_1_ - 52) / 62);
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(
							runtimeexception,
							("tf.I(" + i + ',' + i_1_ + ','
									+ (class321 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3118(int i, int i_3_, int i_4_, int i_5_, int i_6_,
			IComponentDefinitions class192, long l, Class72 class72, int i_7_) {
		try {
			anInt7741++;
			int i_8_ = i_7_ * i_7_ - -(i_6_ * i_6_);
			if (l >= (long) i_8_) {
				int i_9_ = Math.min(
						((IComponentDefinitions) class192).anInt2610 / 2,
						((IComponentDefinitions) class192).anInt2546 / i_3_);
				if (i_8_ <= i_9_ * i_9_)
					Class310.method1894(-111, i_4_, i_7_, class72,
							(Class58_Sub2_Sub1.aClass253Array9248[i_5_]), i_6_,
							i, class192);
				else {
					i_9_ -= 10;
					int i_10_;
					if ((Class191.anInt2453 ^ 0xffffffff) != -5)
						i_10_ = 0x3fff & (Class328.anInt4371 + (int) Class2_Sub8.aFloat6868);
					else
						i_10_ = 0x3fff & (int) Class2_Sub8.aFloat6868;
					int i_11_ = Class335.anIntArray4436[i_10_];
					int i_12_ = Class335.anIntArray4430[i_10_];
					if (Class191.anInt2453 != 4) {
						i_12_ = i_12_ * 256
								/ (Class11_Sub45_Sub1.anInt8493 + 256);
						i_11_ = 256 * i_11_
								/ (256 + Class11_Sub45_Sub1.anInt8493);
					}
					int i_13_ = i_6_ * i_11_ - -(i_7_ * i_12_) >> 14;
					int i_14_ = -(i_7_ * i_11_) + i_6_ * i_12_ >> 14;
					double d = Math.atan2((double) i_13_, (double) i_14_);
					int i_15_ = (int) (Math.sin(d) * (double) i_9_);
					int i_16_ = (int) ((double) i_9_ * Math.cos(d));
					Class367.aClass253Array4820[i_5_]
							.method1616(
									((float) i_15_ + ((float) ((IComponentDefinitions) class192).anInt2610 / 2.0F + (float) i)),
									((float) i_4_
											+ (float) ((IComponentDefinitions) class192).anInt2546
											/ 2.0F - (float) i_16_), 4096,
									(int) (-d / 6.283185307179586 * 65535.0));
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tf.K(" + i + ','
					+ i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ','
					+ (class192 != null ? "{...}" : "null") + ',' + l + ','
					+ (class72 != null ? "{...}" : "null") + ',' + i_7_ + ')'));
		}
	}

	static final Class321_Sub3_Sub1 method3119(boolean bool, int i,
			boolean bool_17_, int i_18_, byte[] is,
			Class163_Sub3 class163_sub3, int i_19_, int i_20_) {
		try {
			if (bool != true)
				incomingPacket = null;
			anInt7743++;
			if (((Class163_Sub3) class163_sub3).aBool8352
					|| (Class261.method1669(i_18_, (byte) 68) && Class261
							.method1669(i, (byte) 105)))
				return new Class321_Sub3_Sub1(class163_sub3, 3553, i_19_,
						i_18_, i, bool_17_, is, i_20_);
			if (((Class163_Sub3) class163_sub3).aBool8389)
				return new Class321_Sub3_Sub1(class163_sub3, 34037, i_19_,
						i_18_, i, bool_17_, is, i_20_);
			return new Class321_Sub3_Sub1(class163_sub3, i_19_, i_18_, i,
					Class11_Sub2_Sub33.method3808(116, i_18_),
					Class11_Sub2_Sub33.method3808(106, i), is, i_20_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tf.L(" + bool + ','
					+ i + ',' + bool_17_ + ',' + i_18_ + ','
					+ (is != null ? "{...}" : "null") + ','
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i_19_
					+ ',' + i_20_ + ')'));
		}
	}

	static final void method3120(Class104 class104, int i, int i_21_, int i_22_) {
		try {
			if (i_22_ <= -56) {
				Class109.aClass104ArrayArray1477[i][i_21_] = class104;
				anInt7735++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tf.M("
					+ (class104 != null ? "{...}" : "null") + ',' + i + ','
					+ i_21_ + ',' + i_22_ + ')'));
		}
	}

	final void method1502(int i) {
		do {
			try {
				anInt7742++;
				if (aBool7737) {
					((Class236) this).aClass163_Sub3_3222.method3253(1, true);
					((Class236) this).aClass163_Sub3_3222.method3295(null, 87);
					((Class236) this).aClass163_Sub3_3222.method3253(0, true);
					((Class236) this).aClass163_Sub3_3222.method3295(null, 78);
					OpenGL.glUseProgramObjectARB(0L);
					aBool7737 = false;
				}
				if (i >= 74)
					break;
				aClass299_7732 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "tf.C(" + i + ')');
			}
			break;
		} while (false);
	}

	Class236_Sub9(Class163_Sub3 class163_sub3, Class299 class299) {
		super(class163_sub3);
		do {
			try {
				aClass299_7732 = class299;
				if (((Class299) aClass299_7732).aClass321_Sub2_4033 == null
						|| !((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aBool8358
						|| !((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aBool8397)
					break;
				Class95 class95 = (Class324
						.method1975(
								(byte) 120,
								((Class236) this).aClass163_Sub3_3222,
								"uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n",
								35633));
				Class95 class95_23_ = (Class324
						.method1975(
								(byte) 120,
								((Class236) this).aClass163_Sub3_3222,
								"varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n",
								35632));
				aClass21_7746 = Class11_Sub2_Sub4.method3351((new Class95[] {
						class95, class95_23_ }), -1,
						(((Class236) this).aClass163_Sub3_3222));
				aBool7738 = aClass21_7746 != null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("tf.<init>("
						+ (class163_sub3 != null ? "{...}" : "null") + ','
						+ (class299 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method3121(byte i) {
		try {
			if (i >= -35)
				method3119(true, 23, true, 9, null, null, -120, 84);
			incomingPacket = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tf.N(" + i + ')');
		}
	}

	final void method1506(int i, int i_24_, int i_25_) {
		try {
			if (aBool7737) {
				int i_26_ = 1 << (i & 0x3);
				float f = (float) (1 << ((i & 0x3f) >> 3)) / 32.0F;
				int i_27_ = 0xffff & i_25_;
				float f_28_ = (float) (i_25_ >> 16 & 0x3) / 8.0F;
				long l = ((Class21) aClass21_7746).aLong176;
				OpenGL.glUniform1fARB(
						OpenGL.glGetUniformLocationARB(l, "time"),
						(float) ((((Class163_Sub3) (((Class236) this).aClass163_Sub3_3222)).anInt8273)
								* i_26_ % 40000) / 40000.0F);
				OpenGL.glUniform1fARB(
						OpenGL.glGetUniformLocationARB(l, "scale"), f);
				OpenGL.glUniform1fARB(
						OpenGL.glGetUniformLocationARB(l, "breakWaterDepth"),
						(float) i_27_);
				OpenGL.glUniform1fARB(
						OpenGL.glGetUniformLocationARB(l, "breakWaterOffset"),
						f_28_);
			}
			if (i_24_ < 72)
				aClass21_7746 = null;
			anInt7736++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tf.B(" + i + ','
					+ i_24_ + ',' + i_25_ + ')'));
		}
	}

	static final byte[] method3122(int i, boolean bool, Object object) {
		try {
			anInt7731++;
			if (i != 2)
				return null;
			if (object == null)
				return null;
			if (object instanceof byte[]) {
				byte[] is = (byte[]) object;
				if (!bool)
					return is;
				return Class11_Sub45_Sub20_Sub2.method3943(is, (byte) 95);
			}
			if (object instanceof Class61) {
				Class61 class61 = (Class61) object;
				return class61.method472(126);
			}
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tf.J(" + i + ','
					+ bool + ',' + (object != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1505(boolean bool, boolean bool_29_) {
		do {
			try {
				anInt7745++;
				Class321_Sub1 class321_sub1 = ((Class236) this).aClass163_Sub3_3222
						.method3298(0);
				if (aBool7738 && class321_sub1 != null) {
					((Class236) this).aClass163_Sub3_3222.method3253(1, true);
					((Class236) this).aClass163_Sub3_3222.method3295(
							class321_sub1, 90);
					((Class236) this).aClass163_Sub3_3222.method3253(0, true);
					((Class236) this).aClass163_Sub3_3222
							.method3295(
									((Class299) aClass299_7732).aClass321_Sub2_4033,
									69);
					long l = ((Class21) aClass21_7746).aLong176;
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
							((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aFloat8402,
							((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aFloat8378,
							((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aFloat8334,
							1.0F);
					OpenGL.glUniform1fARB(
							OpenGL.glGetUniformLocationARB(l, "sunExponent"),
							(96.0F + Math
									.abs(((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aFloatArray8328[1]) * 928.0F));
					aBool7737 = true;
				}
				if (bool == true)
					break;
				method1502(-119);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("tf.H(" + bool
						+ ',' + bool_29_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1508(int i, boolean bool) {
		try {
			if (i != 17660)
				aLong7733 = -26L;
			anInt7744++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tf.A(" + i + ','
					+ bool + ')');
		}
	}

	static {
		aLong7733 = 0L;
	}
}
