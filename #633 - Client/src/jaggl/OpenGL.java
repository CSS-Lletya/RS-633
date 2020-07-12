/* OpenGL - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaggl;

import java.awt.Canvas;
import java.util.Hashtable;

public class OpenGL {
	private Hashtable aHashtable147;
	long peer;
	private Thread aThread148;
	private static Hashtable aHashtable149 = new Hashtable();

	public static final native void glUniform1iARB(int i, int i_0_);

	public static final native void glTexCoord2f(float f, float f_1_);

	public static final native void glDeleteLists(int i, int i_2_);

	public static final native void glTexImage2Dub(int i, int i_3_, int i_4_,
			int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, byte[] is,
			int i_10_);

	public final native void surfaceResized(long l);

	public static final native void glGetObjectParameterivARB(long l, int i,
			int[] is, int i_11_);

	public static final native void glAlphaFunc(int i, float f);

	public static final native void glDisable(int i);

	public static final native void glCopyPixels(int i, int i_12_, int i_13_,
			int i_14_, int i_15_);

	public static final native void glTexParameterf(int i, int i_16_, float f);

	public static final native void glDeleteBuffersARB(int i, int[] is,
			int i_17_);

	public static final native void glBufferSubDataARBub(int i, int i_18_,
			int i_19_, byte[] is, int i_20_);

	public static final native void glEnableClientState(int i);

	public static final native void glProgramStringARB(int i, int i_21_,
			String string);

	public static final native void glDepthMask(boolean bool);

	public static final native void glDisableClientState(int i);

	public static final native void glPointSize(float f);

	public static final native void glTexCoord3f(float f, float f_22_,
			float f_23_);

	public static final native void glClear(int i);

	public static final native void glActiveTexture(int i);

	public static final native void glDetachObjectARB(long l, long l_24_);

	public static final native void glUniformMatrix2fvARB(int i, int i_25_,
			boolean bool, float[] fs, int i_26_);

	public static final native void glUniformMatrix3fvARB(int i, int i_27_,
			boolean bool, float[] fs, int i_28_);

	public static final native void glGetFloatv(int i, float[] fs, int i_29_);

	public static final native void glGetIntegerv(int i, int[] is, int i_30_);

	public static final native void glClientActiveTexture(int i);

	public static final native void glDrawBuffer(int i);

	public static final native void glStencilOp(int i, int i_31_, int i_32_);

	public static final native long glCreateShaderObjectARB(int i);

	public static final native void glTexEnvi(int i, int i_33_, int i_34_);

	public static final native void glUseProgramObjectARB(long l);

	public static final native void glRasterPos2i(int i, int i_35_);

	public static final native void glReadBuffer(int i);

	public final native void releaseSurface(Canvas canvas, long l);

	public static final native void glUniform2fARB(int i, float f, float f_36_);

	public static final native int glGenProgramARB();

	public static final native long glCreateProgramObjectARB();

	public static final native void glColor4f(float f, float f_37_,
			float f_38_, float f_39_);

	public static final native void glLinkProgramARB(long l);

	public static final native void glTexImage2Di(int i, int i_40_, int i_41_,
			int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, int[] is,
			int i_47_);

	public static final native void glDepthFunc(int i);

	public static final native void glRotatef(float f, float f_48_,
			float f_49_, float f_50_);

	public static final native void glLoadIdentity();

	public final native void setSwapInterval(int i);

	public static final native void glPopAttrib();

	public static final native void glReadPixelsub(int i, int i_51_, int i_52_,
			int i_53_, int i_54_, int i_55_, byte[] is, int i_56_);

	public static final native void glColor3f(float f, float f_57_, float f_58_);

	public static final native void glVertex3f(float f, float f_59_, float f_60_);

	public static final native void glGenBuffersARB(int i, int[] is, int i_61_);

	public static final native int glGenLists(int i);

	public static final native void glLoadMatrixf(float[] fs, int i);

	public static final native void glLightf(int i, int i_62_, float f);

	public final native boolean setSurface(long l);

	public static final native void glCopyTexSubImage3D(int i, int i_63_,
			int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_,
			int i_70_);

	public static final native void glGetInfoLogARB(long l, int i, int[] is,
			int i_71_, byte[] is_72_, int i_73_);

	public static final native void glDrawPixelsi(int i, int i_74_, int i_75_,
			int i_76_, int[] is, int i_77_);

	public final native long prepareSurface(Canvas canvas);

	public static final native void glTexCoord3i(int i, int i_78_, int i_79_);

	public final boolean method159(String string) {
		try {
			if (aHashtable147 == null) {
				aHashtable147 = new Hashtable();
				String string_80_ = glGetString(7939);
				int i = 0;
				for (;;) {
					int i_81_ = string_80_.indexOf(' ', i);
					if (i_81_ == -1)
						break;
					String string_82_ = string_80_.substring(i, i_81_).trim();
					if (string_82_.length() != 0)
						aHashtable147.put(string_82_, string_82_);
					i = i_81_ + 1;
				}
				String string_83_ = string_80_.substring(i).trim();
				if ((string_83_.length() ^ 0xffffffff) != -1)
					aHashtable147.put(string_83_, string_83_);
			}
			return aHashtable147.containsKey(string);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public static final native void glTexGeni(int i, int i_84_, int i_85_);

	public static final native void glTexParameteri(int i, int i_86_, int i_87_);

	public static final native int glCheckFramebufferStatusEXT(int i);

	public static final native void glMaterialfv(int i, int i_88_, float[] fs,
			int i_89_);

	public static final native void glTexImage3Dub(int i, int i_90_, int i_91_,
			int i_92_, int i_93_, int i_94_, int i_95_, int i_96_, int i_97_,
			byte[] is, int i_98_);

	public static final native void glNormalPointer(int i, int i_99_, long l);

	public final native void swapBuffers();

	public static final native void glTranslatef(float f, float f_100_,
			float f_101_);

	public static final native void glCompileShaderARB(long l);

	public static final native void glEnable(int i);

	public static final native void glShaderSourceARB(long l, String string);

	public static final native void glScalef(float f, float f_102_, float f_103_);

	public static final native String glGetString(int i);

	public static final native void glLineWidth(float f);

	public static final native void glGenerateMipmapEXT(int i);

	public static final native void glNewList(int i, int i_104_);

	public static final native void glBindTexture(int i, int i_105_);

	public static final native void glTexGenfv(int i, int i_106_, float[] fs,
			int i_107_);

	public static final native void glColorPointer(int i, int i_108_,
			int i_109_, long l);

	public static final native void glFrustum(double d, double d_110_,
			double d_111_, double d_112_, double d_113_, double d_114_);

	public static final native void glViewport(int i, int i_115_, int i_116_,
			int i_117_);

	public static final native void glFogf(int i, float f);

	public static final native void glCallList(int i);

	public static final native void glFramebufferTexture3DEXT(int i,
			int i_118_, int i_119_, int i_120_, int i_121_, int i_122_);

	public static final native void glProgramLocalParameter4fvARB(int i,
			int i_123_, float[] fs, int i_124_);

	public static final native void glColor3ub(byte i, byte i_125_, byte i_126_);

	public static final native void glPushMatrix();

	public static final native void glOrtho(double d, double d_127_,
			double d_128_, double d_129_, double d_130_, double d_131_);

	public final native void release();

	static final native long glMapBufferARB(int i, int i_132_);

	public static final native void glDrawElements(int i, int i_133_,
			int i_134_, long l);

	public static final native void glShadeModel(int i);

	static final native boolean glUnmapBufferARB(int i);

	public static final native int glGetUniformLocationARB(long l, String string);

	public static final native void glRenderbufferStorageMultisampleEXT(int i,
			int i_135_, int i_136_, int i_137_, int i_138_);

	public static final native void glBindRenderbufferEXT(int i, int i_139_);

	public static final native void glTexSubImage2Df(int i, int i_140_,
			int i_141_, int i_142_, int i_143_, int i_144_, int i_145_,
			int i_146_, float[] fs, int i_147_);

	public static final native void glGenFramebuffersEXT(int i, int[] is,
			int i_148_);

	public static final native void glGenRenderbuffersEXT(int i, int[] is,
			int i_149_);

	public static final native void glEnd();

	public static final native void glMultiTexCoord3i(int i, int i_150_,
			int i_151_, int i_152_);

	public static final native void glGetTexImagei(int i, int i_153_,
			int i_154_, int i_155_, int[] is, int i_156_);

	public static final native void glBufferSubDataARBa(int i, int i_157_,
			int i_158_, long l);

	public static final native void glTexImage1Dub(int i, int i_159_,
			int i_160_, int i_161_, int i_162_, int i_163_, int i_164_,
			byte[] is, int i_165_);

	public static final native void glFlush();

	public static final native void glTexCoord2i(int i, int i_166_);

	public static final native void glBindProgramARB(int i, int i_167_);

	public static final native void glTexEnvf(int i, int i_168_, float f);

	public static final native void glVertex2i(int i, int i_169_);

	public static final native void glTexImage2Df(int i, int i_170_,
			int i_171_, int i_172_, int i_173_, int i_174_, int i_175_,
			int i_176_, float[] fs, int i_177_);

	public final native long createPbuffer(int i, int i_178_);

	private final native boolean attachPeer();

	public static final native void glCullFace(int i);

	public final native void setPbuffer(long l);

	public static final native void glDrawArrays(int i, int i_179_, int i_180_);

	public static final native void glDrawPixelsub(int i, int i_181_,
			int i_182_, int i_183_, byte[] is, int i_184_);

	public static final native void glBindBufferARB(int i, int i_185_);

	public static final native void glTexEnvfv(int i, int i_186_, float[] fs,
			int i_187_);

	public static final native void glPixelStorei(int i, int i_188_);

	public static final native void glBufferDataARBub(int i, int i_189_,
			byte[] is, int i_190_, int i_191_);

	public static final native void glTexSubImage2Dub(int i, int i_192_,
			int i_193_, int i_194_, int i_195_, int i_196_, int i_197_,
			int i_198_, byte[] is, int i_199_);

	public static final native void glGetTexImageub(int i, int i_200_,
			int i_201_, int i_202_, byte[] is, int i_203_);

	public static final native void glColor4ub(byte i, byte i_204_,
			byte i_205_, byte i_206_);

	public static final native void glClearDepth(float f);

	public static final native void glGetProgramivARB(int i, int i_207_,
			int[] is, int i_208_);

	public static final native void glNormal3f(float f, float f_209_,
			float f_210_);

	public static final native void glUniform4fARB(int i, float f,
			float f_211_, float f_212_, float f_213_);

	public static final native void glBegin(int i);

	public static final native void glPopMatrix();

	public static final native void glStencilFunc(int i, int i_214_, int i_215_);

	public static final native void glHint(int i, int i_216_);

	public static final native void glMatrixMode(int i);

	private final native void detachPeer();

	public static final native void glScissor(int i, int i_217_, int i_218_,
			int i_219_);

	public static final native void glPushAttrib(int i);

	public final native boolean arePbuffersAvailable();

	public static final native void glFogfv(int i, float[] fs, int i_220_);

	public static final native void glPolygonMode(int i, int i_221_);

	public static final native int glGetError();

	public static final native void glDrawBuffersARB(int i, int[] is, int i_222_);

	public static final native void glPixelTransferf(int i, float f);

	public final native void releasePbuffer(long l);

	public static final native void glBlendFunc(int i, int i_223_);

	public final synchronized boolean method160() {
		try {
			if (aThread148 != Thread.currentThread())
				return false;
			detachPeer();
			aHashtable149.remove(aThread148);
			aThread148 = null;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public static final native void glGenTextures(int i, int[] is, int i_224_);

	public static final native void glShaderSourceRawARB(long l, byte[] is);

	public static final native void glBlitFramebufferEXT(int i, int i_225_,
			int i_226_, int i_227_, int i_228_, int i_229_, int i_230_,
			int i_231_, int i_232_, int i_233_);

	public static final native void glLightModelfv(int i, float[] fs, int i_234_);

	public static final native void glBufferDataARBa(int i, int i_235_, long l,
			int i_236_);

	public static final native void glMultMatrixf(float[] fs, int i);

	public static final native void glVertex2f(float f, float f_237_);

	public static final native void glTexSubImage2Di(int i, int i_238_,
			int i_239_, int i_240_, int i_241_, int i_242_, int i_243_,
			int i_244_, int[] is, int i_245_);

	public static final native void glDeleteRenderbuffersEXT(int i, int[] is,
			int i_246_);

	public final synchronized boolean method161() {
		try {
			Thread thread = Thread.currentThread();
			if (attachPeer()) {
				OpenGL opengl_247_ = (OpenGL) aHashtable149.put(thread, this);
				if (opengl_247_ != null)
					opengl_247_.aThread148 = null;
				aThread148 = thread;
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public static final native void glPixelZoom(float f, float f_248_);

	public static final native void glFogi(int i, int i_249_);

	public static final native void glMultiTexCoord2i(int i, int i_250_,
			int i_251_);

	public static final native void glFramebufferRenderbufferEXT(int i,
			int i_252_, int i_253_, int i_254_);

	public static final native void glUniform1fARB(int i, float f);

	public static final native void glColorMaterial(int i, int i_255_);

	public static final native void glAttachObjectARB(long l, long l_256_);

	public static final native void glFramebufferTexture2DEXT(int i,
			int i_257_, int i_258_, int i_259_, int i_260_);

	public static final native void glBindFramebufferEXT(int i, int i_261_);

	public static final native void glMultiTexCoord2f(int i, float f,
			float f_262_);

	public static final native void glDeleteTextures(int i, int[] is, int i_263_);

	public static final native void glColorMask(boolean bool,
			boolean bool_264_, boolean bool_265_, boolean bool_266_);

	public static final native void glLightfv(int i, int i_267_, float[] fs,
			int i_268_);

	public static final native void glDeleteFramebuffersEXT(int i, int[] is,
			int i_269_);

	public static final native void glProgramLocalParameter4fARB(int i,
			int i_270_, float f, float f_271_, float f_272_, float f_273_);

	public final native long init(Canvas canvas, int i, int i_274_, int i_275_,
			int i_276_, int i_277_, int i_278_);

	public static final native void glReadPixelsi(int i, int i_279_,
			int i_280_, int i_281_, int i_282_, int i_283_, int[] is, int i_284_);

	public static final native void glCopyTexSubImage2D(int i, int i_285_,
			int i_286_, int i_287_, int i_288_, int i_289_, int i_290_,
			int i_291_);

	public static final native void glDeleteProgramARB(int i);

	public static final native void glEndList();

	public static final native void glClearColor(float f, float f_292_,
			float f_293_, float f_294_);

	public static final native void glFinish();

	public static final native void glCopyTexImage2D(int i, int i_295_,
			int i_296_, int i_297_, int i_298_, int i_299_, int i_300_,
			int i_301_);

	public static final native void glTexCoordPointer(int i, int i_302_,
			int i_303_, long l);

	public static final native void glVertexPointer(int i, int i_304_,
			int i_305_, long l);

	public static final native void glUniformMatrix4fvARB(int i, int i_306_,
			boolean bool, float[] fs, int i_307_);

	public static final native void glUniform3fARB(int i, float f,
			float f_308_, float f_309_);

	public static final native void glRenderbufferStorageEXT(int i, int i_310_,
			int i_311_, int i_312_);

	public static final native void glDeleteObjectARB(long l);

	public static final native void glProgramRawARB(int i, int i_313_, byte[] is);
}
