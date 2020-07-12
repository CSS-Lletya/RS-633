/* Class334 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class334 {
	static int anInt4419;
	private Class21 aClass21_4420;
	static float aFloat4421;
	static int anInt4422;
	static int anInt4423 = 0;
	private Class163_Sub3 aClass163_Sub3_4424;
	static Class11_Sub6_Sub2 aClass11_Sub6_Sub2_4425;

	final boolean method2010(boolean bool) {
		try {
			if (bool != true)
				method2012(6);
			if (((Class163_Sub3) aClass163_Sub3_4424).aBool8341
					&& ((Class163_Sub3) aClass163_Sub3_4424).aBool8397
					&& aClass21_4420 == null) {
				Class95 class95 = (Class324
						.method1975(
								(byte) 120,
								aClass163_Sub3_4424,
								"uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n",
								35632));
				if (class95 != null)
					aClass21_4420 = Class11_Sub2_Sub4.method3351(
							(new Class95[] { class95 }), -1,
							aClass163_Sub3_4424);
			}
			anInt4419++;
			if (aClass21_4420 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ug.A(" + bool + ')');
		}
	}

	final boolean method2011(float f, Class321_Sub2 class321_sub2, int i,
			Class321_Sub2 class321_sub2_0_) {
		try {
			anInt4422++;
			if (!method2010(true))
				return false;
			Class378 class378 = ((Class163_Sub3) aClass163_Sub3_4424).aClass378_8394;
			Class11_Sub45_Sub4 class11_sub45_sub4 = new Class11_Sub45_Sub4(
					aClass163_Sub3_4424, 6408,
					(((Class321_Sub2) class321_sub2_0_).anInt6643),
					(((Class321_Sub2) class321_sub2_0_).anInt6638));
			aClass163_Sub3_4424.method3246((byte) -119, class378);
			boolean bool = false;
			class378.method2217(0, 1, class11_sub45_sub4);
			if (class378.method2210((byte) -116)) {
				OpenGL.glPushMatrix();
				OpenGL.glLoadIdentity();
				OpenGL.glMatrixMode(5889);
				OpenGL.glPushMatrix();
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glPushAttrib(2048);
				OpenGL.glViewport(0, 0,
						((Class321_Sub2) class321_sub2_0_).anInt6643,
						(((Class321_Sub2) class321_sub2_0_).anInt6638));
				OpenGL.glUseProgramObjectARB(((Class21) aClass21_4420).aLong176);
				OpenGL.glUniform1iARB((OpenGL.glGetUniformLocationARB(
						((Class21) aClass21_4420).aLong176, "heightMap")), 0);
				OpenGL.glUniform1fARB((OpenGL.glGetUniformLocationARB(
						((Class21) aClass21_4420).aLong176, "rcpRelief")),
						1.0F / f);
				OpenGL.glUniform2fARB(
						OpenGL.glGetUniformLocationARB(
								(((Class21) aClass21_4420).aLong176),
								"sampleSize"),
						1.0F / (float) ((Class321_Sub2) class321_sub2).anInt6643,
						1.0F / (float) ((Class321_Sub2) class321_sub2).anInt6638);
				for (int i_1_ = 0; ((((Class321_Sub2) class321_sub2_0_).anInt6642 ^ 0xffffffff) < (i_1_ ^ 0xffffffff)); i_1_++) {
					float f_2_ = ((float) i_1_ / (float) (((Class321_Sub2) class321_sub2_0_).anInt6642));
					aClass163_Sub3_4424.method3295(class321_sub2, 43);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord3f(0.0F, 0.0F, f_2_);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3f(1.0F, 0.0F, f_2_);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3f(1.0F, 1.0F, f_2_);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3f(0.0F, 1.0F, f_2_);
					OpenGL.glVertex2f(0.0F, 1.0F);
					OpenGL.glEnd();
					class321_sub2_0_.method2742(i ^ ~0x4a, 0, i_1_,
							((Class321_Sub2) class321_sub2_0_).anInt6643, 0, 0,
							0, ((Class321_Sub2) class321_sub2_0_).anInt6638);
				}
				OpenGL.glUseProgramObjectARB(0L);
				OpenGL.glPopAttrib();
				OpenGL.glPopMatrix();
				OpenGL.glMatrixMode(5888);
				OpenGL.glPopMatrix();
				bool = true;
			}
			class378.method2216(1, i);
			aClass163_Sub3_4424.method3282(class378, (byte) -127);
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(
							runtimeexception,
							("ug.C("
									+ f
									+ ','
									+ (class321_sub2 != null ? "{...}" : "null")
									+ ','
									+ i
									+ ','
									+ (class321_sub2_0_ != null ? "{...}"
											: "null") + ')'));
		}
	}

	public static void method2012(int i) {
		do {
			try {
				aClass11_Sub6_Sub2_4425 = null;
				if (i == 1)
					break;
				aClass11_Sub6_Sub2_4425 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ug.B(" + i + ')');
			}
			break;
		} while (false);
	}

	Class334(Class163_Sub3 class163_sub3) {
		try {
			aClass163_Sub3_4424 = class163_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ug.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ')');
		}
	}
}
