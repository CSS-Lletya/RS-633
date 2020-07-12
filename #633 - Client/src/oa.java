/* oa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;

final class oa extends Class163 implements Interface2 {
	long nativeid;
	private Class84 s;
	private static int[] t = new int[Math.max(Math.max(104, 20), 24573)];
	private boolean u = false;
	private ya v;
	private static int[] w;
	private static int[] x;
	private static byte[] y;
	private static float[] z;
	static int[] A = t;
	private Class33 B;
	private Class33 C;
	static int[] D = new int[6];
	private static short[] E;
	private static int[] F;
	private int G;
	private int H;
	private static float[] I;
	private static int[] J;
	private Class_p K;
	private Class213 L;
	int M;
	private Class_a[] N;
	private boolean O;

	final Class72 method1085(int i, int i_0_, int[] is, int[] is_1_) {
		return new na(this, v, i, i_0_, is, is_1_);
	}

	final boolean method1032() {
		return false;
	}

	private final Object OA() {
		return new ba(this);
	}

	final native void pa();

	final void method1078() {
		/* empty */
	}

	final native void L(int i, int i_2_, int i_3_);

	final void method1021(int i) {
		Class257.method1644(-9657);
		d(i);
		for (ya var_ya = (ya) s.method584(-12261); var_ya != null; var_ya = (ya) s
				.method578(-15361))
			var_ya.r();
	}

	final Class253 method1009(int i, int i_4_, boolean bool) {
		return new Class_j(this, i, i_4_);
	}

	final Class33 method1048() {
		return B;
	}

	final Class234 method1057(Class234 class234, Class234 class234_5_, float f,
			Class234 class234_6_) {
		return null;
	}

	final native void C(boolean bool);

	private final native void CA(short i, int[] is, short i_7_, int i_8_,
			byte i_9_, byte i_10_, int i_11_, boolean bool, byte i_12_,
			byte i_13_, byte i_14_, byte i_15_, boolean bool_16_,
			boolean bool_17_, boolean bool_18_, boolean bool_19_,
			boolean bool_20_, byte i_21_, boolean bool_22_, boolean bool_23_,
			int i_24_);

	final void method1079(int i, int i_25_, int i_26_, int i_27_, int i_28_,
			int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_,
			int i_35_, int i_36_) {
		/* empty */
	}

	final native int[] na(int i, int i_37_, int i_38_, int i_39_);

	final void method1064(int i, int i_40_, int i_41_, int i_42_, int i_43_,
			int i_44_, int i_45_, int i_46_, int i_47_) {
		/* empty */
	}

	private final void a(Class116 class116, boolean bool) {
		int i = 0;
		int i_48_ = 0;
		int i_49_ = 0;
		int i_50_ = 0;
		int i_51_ = 0;
		for (Class376_Sub1_Sub1 class376_sub1_sub1 = ((Class376_Sub1_Sub1) ((Class116) class116).aClass246_1584
				.method1553(-1)); class376_sub1_sub1 != null; class376_sub1_sub1 = ((Class376_Sub1_Sub1) ((Class116) class116).aClass246_1584
				.method1548(0))) {
			J[i++] = ((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8689;
			J[i++] = ((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8691;
			J[i++] = ((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8684;
			F[i_48_++] = ((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8696;
			E[i_50_++] = (short) ((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8694;
			x[i_49_++] = ((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8692;
			if (bool)
				y[i_51_++] = ((Class376_Sub1_Sub1) class376_sub1_sub1).aByte8697;
		}
	}

	private final native void n(long l, long l_52_);

	final native int r(int i, int i_53_, int i_54_, int i_55_, int i_56_,
			int i_57_, int i_58_);

	final native int E();

	final void method1001(int i, Class11_Sub46[] class11_sub46s) {
		int i_59_ = 0;
		for (int i_60_ = 0; i_60_ < i; i_60_++) {
			w[i_59_++] = class11_sub46s[i_60_].method3203(false);
			w[i_59_++] = class11_sub46s[i_60_].method3205(-115);
			w[i_59_++] = class11_sub46s[i_60_].method3204(true);
			w[i_59_++] = class11_sub46s[i_60_].method3208(-1);
			z[i_60_] = class11_sub46s[i_60_].method3211(-18277);
			w[i_59_++] = class11_sub46s[i_60_].method3209((byte) 112);
		}
		N(i, w, z);
	}

	final void method1008(Class116 class116, int i) {
		a(class116, false);
		B().method103(this, J, F, x, E,
				((Class116) class116).aClass246_1584.method1552(0));
	}

	final void method1080(Class33 class33) {
		C = class33;
		ma(((ja) (ja) class33).nativeid);
	}

	private final void g() {
		System.gc();
		System.runFinalization();
		Class257.method1644(-9657);
	}

	final native int M();

	final Class253 method1014(int i, int i_61_, int i_62_, int i_63_,
			boolean bool) {
		return new Class_j(this, i, i_61_, i_62_, i_63_, !bool);
	}

	final Class253 method1081(Class80 class80, boolean bool) {
		Class_j class_j = new Class_j(this, ((Class80) class80).anIntArray1074,
				((Class80) class80).aByteArray1079,
				((Class80) class80).aByteArray1078, 0,
				((Class80) class80).anInt1075, ((Class80) class80).anInt1075,
				((Class80) class80).anInt1082);
		class_j.method1607(((Class80) class80).anInt1080,
				((Class80) class80).anInt1077, ((Class80) class80).anInt1076,
				((Class80) class80).anInt1081);
		return class_j;
	}

	final boolean method1047() {
		return true;
	}

	private final native void FA();

	private final boolean c(short i) {
		synchronized (this) {
			Class188 class188 = ((Class163) this).anInterface1_2118.method7(
					(byte) 127, i);
			if (class188 == null)
				return false;
			AA(i, ((Class188) class188).aShort2413,
					((Class188) class188).anInt2425,
					((Class188) class188).aByte2426,
					((Class188) class188).aByte2417,
					((Class188) class188).anInt2421,
					((Class188) class188).aBool2430,
					((Class188) class188).aByte2414,
					((Class188) class188).aByte2418,
					((Class188) class188).aByte2429,
					((Class188) class188).aByte2415,
					((Class188) class188).aBool2416,
					((Class188) class188).aBool2423,
					((Class188) class188).aBool2410,
					((Class188) class188).aBool2420,
					((Class188) class188).aBool2419,
					((Class188) class188).aByte2422,
					((Class188) class188).aBool2412,
					((Class188) class188).aBool2427,
					((Class188) class188).anInt2411);
		}
		return true;
	}

	final boolean method1003() {
		return false;
	}

	public final native void w(boolean bool);

	final Class100 method1055() {
		return new Class100(0, "SSE", 1, "CPU", 0L);
	}

	final void method1068(int i) {
		H = G = i;
		if (((oa) this).M > 1)
			throw new IllegalStateException("No MT");
		method1024(((oa) this).M);
		method1050(0);
	}

	final boolean method1063() {
		return true;
	}

	final void method1076(Interface10 interface10) {
		wa var_wa = (wa) interface10;
		n(((Class_j) ((wa) var_wa).aj4646).nativeid,
				((xa) ((wa) var_wa).axa4645).nativeid);
	}

	final Class11_Sub50 method1000(int i) {
		ya var_ya = new ya(this, i);
		s.method589((byte) -13, var_ya);
		return var_ya;
	}

	final Interface26 method1071(int i, int i_64_) {
		return new xa(i, i_64_);
	}

	final native void EA(int i, int i_65_, int i_66_, int i_67_);

	final void method1027(Class234 class234) {
		/* empty */
	}

	final native void F(int i, int i_68_);

	final native int JA(int i, int i_69_, int i_70_, int i_71_, int i_72_,
			int i_73_);

	final native void A(int i, Class72 class72, int i_74_, int i_75_);

	final native void KA(int i, int i_76_, int i_77_, int i_78_);

	final Class107 method1060(Class292 class292, Class80[] class80s,
			boolean bool) {
		int[] is = new int[class80s.length];
		int[] is_79_ = new int[class80s.length];
		boolean bool_80_ = false;
		for (int i = 0; i < class80s.length; i++) {
			is[i] = ((Class80) class80s[i]).anInt1075;
			is_79_[i] = ((Class80) class80s[i]).anInt1082;
			if (((Class80) class80s[i]).aByteArray1078 != null)
				bool_80_ = true;
		}
		if (bool) {
			if (bool_80_)
				throw new IllegalArgumentException(
						"Cannot specify alpha with non-mono font unless someone writes it");
			return new Class_h(this, v, class292, class80s, null);
		}
		if (bool_80_)
			throw new IllegalArgumentException(
					"Cannot specify alpha with non-mono font unless someone writes it");
		return new Class_n(this, v, class292, class80s, null);
	}

	final void method1058(int i, int i_81_, int i_82_, int i_83_, int i_84_,
			int i_85_, Class72 class72, int i_86_, int i_87_, int i_88_,
			int i_89_, int i_90_) {
		/* empty */
	}

	private final native void wa(int i, int i_91_, int i_92_, int i_93_,
			int i_94_, int i_95_);

	final void method1070() {
		/* empty */
	}

	final Interface10 method1066(Interface8 interface8, Interface26 interface26) {
		return new wa(this, (Class_j) interface8, (xa) interface26);
	}

	final native void da(int i, int i_96_, int i_97_, int[] is);

	final boolean method1069() {
		return true;
	}

	private final native void Z(int i, int i_98_, int i_99_, int i_100_,
			int i_101_, int i_102_, Class72 class72, int i_103_, int i_104_);

	final void method1054(Canvas canvas) {
		if (canvas != null) {
			Class_p class_p = (Class_p) L.method1369((byte) 26,
					(long) canvas.hashCode());
			K = class_p;
			t(class_p);
		} else {
			K = null;
			t(null);
		}
	}

	final native void H(int i, int i_105_, int i_106_, int[] is);

	final Interface8 method1033(int i, int i_107_) {
		return method1009(i, i_107_, false);
	}

	final boolean method1062() {
		return true;
	}

	final Class11_Sub46 method1073(int i, int i_108_, int i_109_, int i_110_,
			int i_111_, float f) {
		return new Class11_Sub46_Sub2(i, i_108_, i_109_, i_110_, i_111_, f);
	}

	final boolean method1019() {
		return true;
	}

	final native void ZA(int i, float f, float f_112_, float f_113_,
			float f_114_, float f_115_);

	final void method1004(Rectangle[] rectangles, int i, int i_116_, int i_117_)
			throws Exception_Sub1 {
		if (K == null)
			throw new IllegalStateException("off");
		K.method2281(rectangles, i, i_116_, i_117_);
	}

	final void method1006() {
		/* empty */
	}

	final native void U(int i, int i_118_, int i_119_, int i_120_, int i_121_);

	final native void DA(int i, int i_122_, int i_123_, int i_124_);

	final boolean method1017() {
		return true;
	}

	final native int XA();

	final native void P(int i, int i_125_, int i_126_, int i_127_, int i_128_);

	final native void K(int[] is);

	final boolean method1086() {
		return false;
	}

	final Class33 method1041() {
		return new ja();
	}

	final native void xa(float f);

	final native void T(int i, int i_129_, int i_130_, int i_131_);

	final boolean method1049() {
		return true;
	}

	final native void GA(int i);

	final boolean method1067() {
		return false;
	}

	final Class_a B() {
		for (int i = 0; i < ((oa) this).M; i++) {
			if (((Class_a) N[i]).aRunnable50 == Thread.currentThread())
				return N[i];
		}
		return null;
	}

	final int method1077(int i, int i_132_) {
		return i | i_132_;
	}

	final native int[] Y();

	final void method1016() {
		if (!u) {
			N = null;
			K = null;
			v = null;
			B = null;
			L.method1364((byte) 84);
			for (ya var_ya = (ya) s.method584(-12261); var_ya != null; var_ya = (ya) s
					.method578(-15361))
				var_ya.ga();
			s.method586((byte) -19);
			FA();
			if (O) {
				Class95.method640(true, false, (byte) 66);
				O = false;
			}
			g();
			Class257.method1640(111);
			u = true;
		}
	}

	final void method1044(int i, int i_133_) throws Exception_Sub1 {
		if (K == null)
			throw new IllegalStateException("off");
		K.method2283(i, i_133_);
	}

	final native void Q(int i, int i_134_, int i_135_, int i_136_, int i_137_,
			int i_138_, byte[] is, int i_139_, int i_140_);

	final void method1005() {
		/* empty */
	}

	final native void X(int i);

	public oa(Canvas canvas, Interface1 interface1, int i, int i_141_) {
		super(interface1);
		((oa) this).nativeid = 0L;
		s = new Class84();
		G = 4096;
		H = 4096;
		L = new Class213(4);
		O = false;
		do {
			try {
				if (!Class335_Sub3_Sub1.method3711("sw3d", true))
					throw new RuntimeException("");
				Class257.method1641(-51);
				MA(((Class163) this).anInterface1_2118, 0, 0);
				Class258.method1648(-16, false, true);
				O = true;
				B = new ja();
				method1080(new ja());
				method1024(1);
				method1050(0);
				if (canvas == null)
					break;
				method1025(canvas, i, i_141_);
				method1054(canvas);
			} catch (Throwable throwable) {
				this.method1072(1);
				throw new RuntimeException();
			}
			break;
		} while (false);
	}

	final Class12 method1036(int i, int i_142_, int[][] is, int[][] is_143_,
			int i_144_, int i_145_, int i_146_) {
		return new Class_t(this, v, i, i_142_, is, is_143_, i_144_, i_145_,
				i_146_);
	}

	final void method1075(Canvas canvas) {
		if (((Class_p) K).aCanvas5104 == canvas)
			method1054(null);
		Class_p class_p = (Class_p) L.method1369((byte) 26,
				(long) canvas.hashCode());
		if (class_p != null) {
			class_p.method122(-44);
			class_p.method2279();
		}
	}

	final void method1011(int i, int i_147_, int i_148_, int i_149_,
			int i_150_, int i_151_, Class72 class72, int i_152_, int i_153_) {
		Z(i, i_147_, i_148_, i_149_, i_150_, i_151_, class72, i_152_, i_153_);
	}

	final native void la();

	final void method1037(int[] is) {
		Dimension dimension = ((Class_p) K).aCanvas5104.getSize();
		is[0] = dimension.width;
		is[1] = dimension.height;
	}

	final void method1013(Canvas canvas, int i, int i_154_) {
		Class_p class_p = (Class_p) L.method1369((byte) 26,
				(long) canvas.hashCode());
		class_p.method2280(canvas, i, i_154_);
		if (canvas != null && canvas == ((Class_p) K).aCanvas5104)
			method1054(canvas);
	}

	protected final synchronized void finalize() {
		this.method1072(1);
		if (((oa) this).nativeid != 0L)
			Class257.method1642((byte) 123, this);
	}

	private final native void MA(Interface1 interface1, int i, int i_155_);

	final native void HA(int i, int i_156_, int i_157_, int i_158_, int[] is);

	final void method1010(Class116 class116) {
		if (((Class116) class116).aClass246_1584.method1552(0) != 0) {
			a(class116, false);
			B().method103(this, J, F, x, E,
					((Class116) class116).aClass246_1584.method1552(0));
		}
	}

	final void method1007(int i, int i_159_, int i_160_, int i_161_,
			int i_162_, int i_163_) {
		wa(i, i_159_, i_160_, i_161_, i_162_, i_163_);
	}

	final Class206 method1020(Class179 class179, int i, int i_164_, int i_165_,
			int i_166_) {
		return new Class_i(this, v, class179, i, i_164_, i_165_, i_166_);
	}

	final native int I();

	final native void ya();

	final void method1053(boolean bool) {
		/* empty */
	}

	final Class33 method1045() {
		return C;
	}

	final boolean method1074() {
		return true;
	}

	private final boolean WA(short i) {
		synchronized (((Class163) this).anInterface1_2118) {
			if (!((Class163) this).anInterface1_2118.method2(i, 103))
				return false;
			Class188 class188 = ((Class163) this).anInterface1_2118.method7(
					(byte) 127, i);
			if (class188 == null)
				return false;
			int[] is;
			if (((Class188) class188).anInt2425 != 2)
				is = ((Class163) this).anInterface1_2118.method6(true, 128,
						20377, 128, 0.7F, i);
			else
				is = ((Class163) this).anInterface1_2118.method3(128, -106,
						true, 0.7F, 128, i);
			CA(i, is, ((Class188) class188).aShort2413,
					((Class188) class188).anInt2425,
					((Class188) class188).aByte2426,
					((Class188) class188).aByte2417,
					((Class188) class188).anInt2421,
					((Class188) class188).aBool2430,
					((Class188) class188).aByte2414,
					((Class188) class188).aByte2418,
					((Class188) class188).aByte2429,
					((Class188) class188).aByte2415,
					((Class188) class188).aBool2416,
					((Class188) class188).aBool2423,
					((Class188) class188).aBool2410,
					((Class188) class188).aBool2420,
					((Class188) class188).aBool2419,
					((Class188) class188).aByte2422,
					((Class188) class188).aBool2412,
					((Class188) class188).aBool2427,
					((Class188) class188).anInt2411);
		}
		return true;
	}

	private final native void t(Class_p class_p);

	final native void aa(int i, int i_167_, int i_168_, int i_169_, int i_170_,
			int i_171_);

	final void method1031() {
		method1054(((Class_p) K).aCanvas5104);
	}

	final native void ra(int i, int i_172_, int i_173_, int i_174_);

	final void method1050(int i) {
		N[i].method95();
	}

	final native void b(int i, int i_175_, int i_176_, int i_177_, double d);

	final boolean method1084() {
		return true;
	}

	final void method1083(int i, int i_178_, int i_179_, int i_180_) {
		/* empty */
	}

	final Class253 method1038(int[] is, int i, int i_181_, int i_182_,
			int i_183_, boolean bool) {
		return new Class_j(this, is, i, i_181_, i_182_, i_183_, false);
	}

	private final native void d(int i);

	final void method1051(int i, int i_184_, int i_185_, int i_186_,
			int i_187_, int i_188_) {
		U(i, i_184_, i_185_, i_187_, i_188_);
		U(i, i_184_ + i_186_ - 1, i_185_, i_187_, i_188_);
		P(i, i_184_ + 1, i_186_ - 1, i_187_, i_188_);
		P(i + i_185_ - 1, i_184_ + 1, i_186_ - 1, i_187_, i_188_);
	}

	final native void f(int i, int i_189_);

	final void method1061(Class11_Sub50 class11_sub50) {
		v = (ya) class11_sub50;
		va(class11_sub50);
	}

	final native int i();

	private final native void N(int i, int[] is, float[] fs);

	private final native void ma(long l);

	final void method1046(int i, int i_190_, int i_191_, int i_192_,
			int i_193_, int i_194_, int i_195_) {
		B().method96(this, i, i_190_, i_191_, i_192_, i_193_, i_194_, i_195_);
	}

	final void method1002(boolean bool) {
		/* empty */
	}

	final void method1028(int i) {
		throw new IllegalStateException();
	}

	private final native void va(Class11_Sub50 class11_sub50);

	final void method1042(float f, float f_196_, float f_197_) {
		/* empty */
	}

	final void method1034(int i) {
		N[i].method106();
	}

	final void method1043() {
		/* empty */
	}

	private final native void AA(short i, short i_198_, int i_199_,
			byte i_200_, byte i_201_, int i_202_, boolean bool, byte i_203_,
			byte i_204_, byte i_205_, byte i_206_, boolean bool_207_,
			boolean bool_208_, boolean bool_209_, boolean bool_210_,
			boolean bool_211_, byte i_212_, boolean bool_213_,
			boolean bool_214_, int i_215_);

	final int method1026() {
		return 4;
	}

	final Class234 method1052(int i, int i_216_, int i_217_, int i_218_,
			int i_219_, int i_220_) {
		return null;
	}

	final void method1024(int i) {
		((oa) this).M = i;
		N = new Class_a[((oa) this).M];
		for (int i_221_ = 0; i_221_ < ((oa) this).M; i_221_++)
			N[i_221_] = new Class_a(this, H, G);
	}

	final int method1065(int i, int i_222_) {
		int i_223_ = i & 0xfffff;
		int i_224_ = i_222_ & 0xfffff;
		return i_223_ & i_224_ ^ i_224_;
	}

	final native void za(int i, int i_225_, int i_226_, int i_227_, int i_228_);

	final void method1025(Canvas canvas, int i, int i_229_) {
		Class_p class_p = (Class_p) L.method1369((byte) 26,
				(long) canvas.hashCode());
		if (class_p == null) {
			try {
				Class var_class = Class.forName("java.awt.Canvas");
				Method method = var_class.getMethod("setIgnoreRepaint",
						new Class[] { Boolean.TYPE });
				method.invoke(canvas, new Object[] { Boolean.TRUE });
			} catch (Exception exception) {
				/* empty */
			}
			class_p = new Class_p(this, canvas, i, i_229_);
			L.method1368((long) canvas.hashCode(), class_p, (byte) -26);
		} else if (((Class_p) class_p).anInt5106 != i
				|| ((Class_p) class_p).anInt5105 != i_229_)
			class_p.method2280(canvas, i, i_229_);
	}

	static {
		w = t;
		y = new byte[8191];
		x = new int[8191];
		E = new short[8191];
		F = new int[8191];
		J = t;
		I = new float[20];
		z = I;
	}
}
