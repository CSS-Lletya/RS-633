/* Class11_Sub35_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

import jaggl.OpenGL;

final class Class11_Sub35_Sub1 extends Class11_Sub35 {
	private Class321_Sub3 aClass321_Sub3_9100;
	private int anInt9101;
	private Class21 aClass21_9102;
	static int anInt9103;
	static int anInt9104;
	static int anInt9105;
	private Class21 aClass21_9106;
	static int anInt9107;
	static int anInt9108;
	static Class314 aClass314_9109 = new Class314();
	static int anInt9110;
	private int anInt9111;
	private int anInt9112;
	private Class321_Sub3 aClass321_Sub3_9113;
	static int anInt9114;
	static int anInt9115;
	private Class321_Sub3[] aClass321_Sub3Array9116;
	private Class378 aClass378_9117;
	static int anInt9118;
	private Class378 aClass378_9119;
	private Class21 aClass21_9120;
	private int anInt9121;
	private Class21 aClass21_9122;
	static int anInt9123;
	static int anInt9124;
	static Class374 aClass374_9125;
	static Class285 aClass285_9126;

	final void method2846(Class321_Sub3 class321_sub3,
			Class321_Sub3 class321_sub3_0_, int i, byte i_1_) {
		try {
			OpenGL.glPushAttrib(2048);
			anInt9103++;
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
			if (aClass321_Sub3Array9116 == null) {
				((Class11_Sub35) this).aClass163_Sub3_7008.method3295(
						class321_sub3, 75);
				((Class11_Sub35) this).aClass163_Sub3_7008.method3246(
						(byte) -27, aClass378_9119);
				aClass378_9119.method2214(0, -64);
				OpenGL.glViewport(0, 0, 256, 256);
				long l = ((Class21) aClass21_9102).aLong176;
				OpenGL.glUseProgramObjectARB(l);
				OpenGL.glUniform1iARB(
						OpenGL.glGetUniformLocationARB(l, "sceneTex"), 0);
				OpenGL.glUniform3fARB(
						OpenGL.glGetUniformLocationARB(l, "params"),
						Class11_Sub2_Sub27.aFloat9411, 0.0F, 0.0F);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(0, 0);
				OpenGL.glTexCoord2f((float) anInt9112, 0.0F);
				OpenGL.glVertex2i(1, 0);
				OpenGL.glTexCoord2f((float) anInt9112, (float) anInt9121);
				OpenGL.glVertex2i(1, 1);
				OpenGL.glTexCoord2f(0.0F, (float) anInt9121);
				OpenGL.glVertex2i(0, 1);
				OpenGL.glEnd();
			} else {
				((Class11_Sub35) this).aClass163_Sub3_7008.method3246(
						(byte) -64, aClass378_9117);
				int i_2_ = Class94.method635(-1350259935, anInt9112);
				int i_3_ = Class94.method635(-1350259935, anInt9121);
				int i_4_ = 0;
				while ((i_2_ ^ 0xffffffff) < -257 || i_3_ > 256) {
					OpenGL.glViewport(0, 0, i_2_, i_3_);
					aClass378_9117.method2220(0, 0,
							aClass321_Sub3Array9116[i_4_]);
					if ((i_3_ ^ 0xffffffff) < -257)
						i_3_ >>= 1;
					if (i_2_ > 256)
						i_2_ >>= 1;
					if (i_4_ == 0) {
						((Class11_Sub35) this).aClass163_Sub3_7008.method3295(
								class321_sub3, 45);
						OpenGL.glBegin(7);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glVertex2i(0, 0);
						OpenGL.glTexCoord2f((float) anInt9112, 0.0F);
						OpenGL.glVertex2i(1, 0);
						OpenGL.glTexCoord2f((float) anInt9112,
								(float) anInt9121);
						OpenGL.glVertex2i(1, 1);
						OpenGL.glTexCoord2f(0.0F, (float) anInt9121);
						OpenGL.glVertex2i(0, 1);
						OpenGL.glEnd();
					} else {
						((Class11_Sub35) this).aClass163_Sub3_7008.method3295(
								aClass321_Sub3Array9116[i_4_ - 1], 99);
						OpenGL.glBegin(7);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glVertex2i(0, 0);
						OpenGL.glTexCoord2f(1.0F, 0.0F);
						OpenGL.glVertex2i(1, 0);
						OpenGL.glTexCoord2f(1.0F, 1.0F);
						OpenGL.glVertex2i(1, 1);
						OpenGL.glTexCoord2f(0.0F, 1.0F);
						OpenGL.glVertex2i(0, 1);
						OpenGL.glEnd();
					}
					i_4_++;
				}
				((Class11_Sub35) this).aClass163_Sub3_7008.method3282(
						aClass378_9117, (byte) -127);
				((Class11_Sub35) this).aClass163_Sub3_7008.method3295(
						aClass321_Sub3Array9116[-1 + i_4_], 100);
				((Class11_Sub35) this).aClass163_Sub3_7008.method3246(
						(byte) -83, aClass378_9119);
				aClass378_9119.method2214(0, 81);
				OpenGL.glViewport(0, 0, 256, 256);
				long l = ((Class21) aClass21_9122).aLong176;
				OpenGL.glUseProgramObjectARB(l);
				OpenGL.glUniform1iARB(
						OpenGL.glGetUniformLocationARB(l, "sceneTex"), 0);
				OpenGL.glUniform3fARB(
						OpenGL.glGetUniformLocationARB(l, "params"),
						Class11_Sub2_Sub27.aFloat9411, 0.0F, 0.0F);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(0, 0);
				OpenGL.glTexCoord2f(1.0F, 0.0F);
				OpenGL.glVertex2i(1, 0);
				OpenGL.glTexCoord2f(1.0F, 1.0F);
				OpenGL.glVertex2i(1, 1);
				OpenGL.glTexCoord2f(0.0F, 1.0F);
				OpenGL.glVertex2i(0, 1);
				OpenGL.glEnd();
			}
			aClass378_9119.method2214(1, -73);
			((Class11_Sub35) this).aClass163_Sub3_7008.method3295(
					aClass321_Sub3_9100, 55);
			if (i_1_ >= 108) {
				long l = ((Class21) aClass21_9120).aLong176;
				OpenGL.glUseProgramObjectARB(l);
				OpenGL.glUniform1iARB(
						OpenGL.glGetUniformLocationARB(l, "baseTex"), 0);
				OpenGL.glUniform3fARB(
						OpenGL.glGetUniformLocationARB(l, "step"), 0.00390625F,
						0.0F, 0.0F);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(0, 0);
				OpenGL.glTexCoord2f(1.0F, 0.0F);
				OpenGL.glVertex2i(1, 0);
				OpenGL.glTexCoord2f(1.0F, 1.0F);
				OpenGL.glVertex2i(1, 1);
				OpenGL.glTexCoord2f(0.0F, 1.0F);
				OpenGL.glVertex2i(0, 1);
				OpenGL.glEnd();
				aClass378_9119.method2214(0, -79);
				((Class11_Sub35) this).aClass163_Sub3_7008.method3295(
						aClass321_Sub3_9113, 60);
				OpenGL.glUniform3fARB(
						OpenGL.glGetUniformLocationARB(l, "step"), 0.0F,
						0.00390625F, 0.0F);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(0, 0);
				OpenGL.glTexCoord2f(1.0F, 0.0F);
				OpenGL.glVertex2i(1, 0);
				OpenGL.glTexCoord2f(1.0F, 1.0F);
				OpenGL.glVertex2i(1, 1);
				OpenGL.glTexCoord2f(0.0F, 1.0F);
				OpenGL.glVertex2i(0, 1);
				OpenGL.glEnd();
				OpenGL.glPopAttrib();
				OpenGL.glPopMatrix();
				OpenGL.glMatrixMode(5888);
				((Class11_Sub35) this).aClass163_Sub3_7008.method3282(
						aClass378_9119, (byte) -128);
				long l_5_ = ((Class21) aClass21_9106).aLong176;
				OpenGL.glUseProgramObjectARB(l_5_);
				OpenGL.glUniform1iARB(
						OpenGL.glGetUniformLocationARB(l_5_, "sceneTex"), 0);
				OpenGL.glUniform1iARB(
						OpenGL.glGetUniformLocationARB(l_5_, "bloomTex"), 1);
				OpenGL.glUniform3fARB(
						OpenGL.glGetUniformLocationARB(l_5_, "params"),
						Class356.aFloat4664, Class108.aFloat1463, 0.0F);
				((Class11_Sub35) this).aClass163_Sub3_7008.method3253(1, true);
				((Class11_Sub35) this).aClass163_Sub3_7008.method3295(
						aClass321_Sub3_9100, 53);
				((Class11_Sub35) this).aClass163_Sub3_7008.method3253(0, true);
				((Class11_Sub35) this).aClass163_Sub3_7008.method3295(
						class321_sub3, 94);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("oda.K("
					+ (class321_sub3 != null ? "{...}" : "null") + ','
					+ (class321_sub3_0_ != null ? "{...}" : "null") + ',' + i
					+ ',' + i_1_ + ')'));
		}
	}

	static final byte[] method3567(File file, int i) {
		try {
			anInt9108++;
			if (i != 26308)
				aClass314_9109 = null;
			return Class11_Sub31.method2765((int) file.length(), (byte) -124,
					file);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oda.H("
					+ (file != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final boolean method3568(byte i) {
		try {
			int i_6_ = -122 % ((i - 40) / 56);
			anInt9110++;
			if (!(((Class163_Sub3) ((Class11_Sub35) this).aClass163_Sub3_7008).aBool8341)
					|| !((Class163_Sub3) ((Class11_Sub35) this).aClass163_Sub3_7008).aBool8397
					|| !((Class163_Sub3) ((Class11_Sub35) this).aClass163_Sub3_7008).aBool8400)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oda.C(" + i + ')');
		}
	}

	static final int method3569(int i, int i_7_) {
		try {
			anInt9114++;
			int i_8_ = 122 / ((-47 - i) / 46);
			return 0xff & i_7_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oda.F(" + i + ','
					+ i_7_ + ')');
		}
	}

	final boolean method2837(int i) {
		try {
			if (i != 67)
				return false;
			anInt9124++;
			if (aClass378_9119 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oda.E(" + i + ')');
		}
	}

	Class11_Sub35_Sub1(Class163_Sub3 class163_sub3) {
		super(class163_sub3);
	}

	static final char method3570(int i, int i_9_, char c) {
		try {
			anInt9115++;
			if (i_9_ > -8)
				method3571(-2);
			if ((c ^ 0xffffffff) <= -193 && (c ^ 0xffffffff) >= -256) {
				if ((c ^ 0xffffffff) <= -193 && c <= 198)
					return 'A';
				if (c == 199)
					return 'C';
				if (c >= 200 && (c ^ 0xffffffff) >= -204)
					return 'E';
				if ((c ^ 0xffffffff) <= -205 && (c ^ 0xffffffff) >= -208)
					return 'I';
				if (c >= 210 && c <= 214)
					return 'O';
				if ((c ^ 0xffffffff) <= -218 && (c ^ 0xffffffff) >= -221)
					return 'U';
				if ((c ^ 0xffffffff) == -222)
					return 'Y';
				if ((c ^ 0xffffffff) == -224)
					return 's';
				if (c >= 224 && (c ^ 0xffffffff) >= -231)
					return 'a';
				if (c == 231)
					return 'c';
				if (c >= 232 && c <= 235)
					return 'e';
				if (c >= 236 && c <= 239)
					return 'i';
				if (c >= 242 && (c ^ 0xffffffff) >= -247)
					return 'o';
				if (c >= 249 && c <= 252)
					return 'u';
				if (c == 253 || (c ^ 0xffffffff) == -256)
					return 'y';
			}
			if ((c ^ 0xffffffff) == -339)
				return 'O';
			if (c == 339)
				return 'o';
			if (c == 376)
				return 'Y';
			return c;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("oda.A(" + i + ','
					+ i_9_ + ',' + c + ')'));
		}
	}

	final int method2844(byte i) {
		try {
			if (i != 48)
				method2836(84, -24);
			anInt9104++;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oda.D(" + i + ')');
		}
	}

	public static void method3571(int i) {
		try {
			if (i != 1)
				method3569(-114, 75);
			aClass285_9126 = null;
			aClass314_9109 = null;
			aClass374_9125 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oda.L(" + i + ')');
		}
	}

	final void method2843(int i) {
		try {
			aClass21_9122 = null;
			aClass21_9102 = null;
			anInt9123++;
			aClass321_Sub3Array9116 = null;
			aClass321_Sub3_9113 = null;
			aClass21_9106 = null;
			if (i == -16008) {
				aClass378_9119 = null;
				aClass21_9120 = null;
				aClass378_9117 = null;
				aClass321_Sub3_9100 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oda.G(" + i + ')');
		}
	}

	final void method2836(int i, int i_10_) {
		try {
			anInt9107++;
			OpenGL.glUseProgramObjectARB((long) i);
			((Class11_Sub35) this).aClass163_Sub3_7008.method3253(1, true);
			((Class11_Sub35) this).aClass163_Sub3_7008.method3295(null, 43);
			((Class11_Sub35) this).aClass163_Sub3_7008.method3253(0, true);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oda.J(" + i + ','
					+ i_10_ + ')');
		}
	}

	final void method2842(int i, int i_11_, int i_12_) {
		try {
			anInt9112 = i;
			anInt9121 = i_11_;
			if (i_12_ != 11441)
				aClass314_9109 = null;
			anInt9118++;
			int i_13_ = Class94.method635(i_12_ + -1350271376, anInt9112);
			int i_14_ = Class94.method635(-1350259935, anInt9121);
			if (i_13_ != anInt9111
					|| (i_14_ ^ 0xffffffff) != (anInt9101 ^ 0xffffffff)) {
				if (aClass321_Sub3Array9116 != null) {
					for (int i_15_ = 0; ((aClass321_Sub3Array9116.length ^ 0xffffffff) < (i_15_ ^ 0xffffffff)); i_15_++)
						aClass321_Sub3Array9116[i_15_].method1952(true);
					aClass321_Sub3Array9116 = null;
				}
				if ((i_13_ ^ 0xffffffff) >= -257 && i_14_ <= 256)
					aClass378_9117 = null;
				else {
					int i_16_ = i_13_;
					int i_17_ = i_14_;
					int i_18_ = 0;
					if (aClass378_9117 == null)
						aClass378_9117 = new Class378(
								((Class11_Sub35) this).aClass163_Sub3_7008);
					while (i_16_ > 256 || (i_17_ ^ 0xffffffff) < -257) {
						if (i_16_ > 256)
							i_16_ >>= 1;
						i_18_++;
						if (i_17_ > 256)
							i_17_ >>= 1;
					}
					i_16_ = i_13_;
					i_17_ = i_14_;
					aClass321_Sub3Array9116 = new Class321_Sub3[i_18_];
					i_18_ = 0;
					while ((i_16_ ^ 0xffffffff) < -257
							|| (i_17_ ^ 0xffffffff) < -257) {
						aClass321_Sub3Array9116[i_18_++] = new Class321_Sub3(
								(((Class11_Sub35) this).aClass163_Sub3_7008),
								3553, 34842, i_16_, i_17_);
						if (i_16_ > 256)
							i_16_ >>= 1;
						if (i_17_ > 256)
							i_17_ >>= 1;
					}
				}
				anInt9101 = i_14_;
				anInt9111 = i_13_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("oda.B(" + i + ','
					+ i_11_ + ',' + i_12_ + ')'));
		}
	}

	final boolean method2839(byte i) {
		try {
			anInt9105++;
			if (i >= -7)
				aClass378_9119 = null;
			if ((((Class163_Sub3) ((Class11_Sub35) this).aClass163_Sub3_7008).aBool8341)
					&& ((Class163_Sub3) ((Class11_Sub35) this).aClass163_Sub3_7008).aBool8397
					&& ((Class163_Sub3) ((Class11_Sub35) this).aClass163_Sub3_7008).aBool8400) {
				aClass378_9119 = new Class378(
						((Class11_Sub35) this).aClass163_Sub3_7008);
				aClass321_Sub3_9100 = new Class321_Sub3(
						(((Class11_Sub35) this).aClass163_Sub3_7008), 3553,
						34842, 256, 256);
				aClass321_Sub3_9100.method2855(false, false, 119);
				aClass321_Sub3_9113 = new Class321_Sub3(
						(((Class11_Sub35) this).aClass163_Sub3_7008), 3553,
						34842, 256, 256);
				aClass321_Sub3_9113.method2855(false, false, 115);
				((Class11_Sub35) this).aClass163_Sub3_7008.method3246(
						(byte) -54, aClass378_9119);
				aClass378_9119.method2220(0, 0, aClass321_Sub3_9100);
				aClass378_9119.method2220(1, 0, aClass321_Sub3_9113);
				aClass378_9119.method2214(0, 94);
				if (!aClass378_9119.method2210((byte) -116)) {
					((Class11_Sub35) this).aClass163_Sub3_7008.method3282(
							aClass378_9119, (byte) -128);
					return false;
				}
				((Class11_Sub35) this).aClass163_Sub3_7008.method3282(
						aClass378_9119, (byte) -127);
				aClass21_9102 = (Class11_Sub2_Sub4
						.method3351(
								(new Class95[] { Class324
										.method1975(
												(byte) 120,
												((Class11_Sub35) this).aClass163_Sub3_7008,
												"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n",
												35632) }), -1,
								((Class11_Sub35) this).aClass163_Sub3_7008));
				aClass21_9122 = (Class11_Sub2_Sub4
						.method3351(
								(new Class95[] { Class324
										.method1975(
												(byte) 120,
												((Class11_Sub35) this).aClass163_Sub3_7008,
												"uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n",
												35632) }), -1,
								((Class11_Sub35) this).aClass163_Sub3_7008));
				aClass21_9106 = (Class11_Sub2_Sub4
						.method3351(
								(new Class95[] { Class324
										.method1975(
												(byte) 120,
												((Class11_Sub35) this).aClass163_Sub3_7008,
												"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n",
												35632) }), -1,
								((Class11_Sub35) this).aClass163_Sub3_7008));
				aClass21_9120 = (Class11_Sub2_Sub4
						.method3351(
								(new Class95[] { Class324
										.method1975(
												(byte) 120,
												((Class11_Sub35) this).aClass163_Sub3_7008,
												"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n",
												35632) }), -1,
								((Class11_Sub35) this).aClass163_Sub3_7008));
				if (aClass21_9122 == null || aClass21_9102 == null
						|| aClass21_9106 == null || aClass21_9120 == null)
					return false;
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oda.I(" + i + ')');
		}
	}
}
