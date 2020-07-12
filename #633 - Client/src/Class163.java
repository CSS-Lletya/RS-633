/* Class163 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Rectangle;

abstract class Class163 {
	int anInt2103;
	static int anInt2104;
	static int anInt2105;
	static int anInt2106;
	static int anInt2107;
	static int anInt2108;
	static int anInt2109;
	static int anInt2110;
	static int anInt2111;
	static int anInt2112;
	static int anInt2113;
	static float[] aFloatArray2114 = new float[4];
	static int anInt2115;
	static int anInt2116;
	static int anInt2117;
	Interface1 anInterface1_2118;
	static int anInt2119;
	static int anInt2120;

	abstract Class11_Sub50 method1000(int i);

	abstract void method1001(int i, Class11_Sub46[] class11_sub46s);

	abstract void method1002(boolean bool);

	abstract boolean method1003();

	protected void finalize() {
		try {
			anInt2119++;
			method1072(1);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ha.finalize(" + ')');
		}
	}

	abstract void method1004(Rectangle[] rectangles, int i, int i_0_, int i_1_)
			throws Exception_Sub1;

	abstract void method1005();

	abstract void method1006();

	abstract void method1007(int i, int i_2_, int i_3_, int i_4_, int i_5_,
			int i_6_);

	abstract void method1008(Class116 class116, int i);

	abstract Class253 method1009(int i, int i_7_, boolean bool);

	abstract void method1010(Class116 class116);

	abstract int I();

	abstract void method1011(int i, int i_8_, int i_9_, int i_10_, int i_11_,
			int i_12_, Class72 class72, int i_13_, int i_14_);

	final void method1012(Rectangle[] rectangles, int i, int i_15_)
			throws Exception_Sub1 {
		try {
			if (i != 14629)
				anInt2113 = -72;
			anInt2109++;
			method1004(rectangles, i_15_, 0, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ha.UD("
					+ (rectangles != null ? "{...}" : "null") + ',' + i + ','
					+ i_15_ + ')'));
		}
	}

	abstract void method1013(Canvas canvas, int i, int i_16_);

	abstract Class253 method1014(int i, int i_17_, int i_18_, int i_19_,
			boolean bool);

	abstract int i();

	public static void method1015(byte i) {
		try {
			if (i <= 39)
				aFloatArray2114 = null;
			aFloatArray2114 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ha.MD(" + i + ')');
		}
	}

	abstract void method1016();

	abstract void ZA(int i, float f, float f_20_, float f_21_, float f_22_,
			float f_23_);

	abstract void DA(int i, int i_24_, int i_25_, int i_26_);

	abstract boolean method1017();

	final void method1018(int i, int i_27_, int i_28_, int i_29_, int i_30_,
			int i_31_) {
		try {
			if (i_30_ <= 42)
				method1006();
			method1051(i_31_, i, i_29_, i_28_, i_27_, 1);
			anInt2112++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ha.WD(" + i + ','
					+ i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ','
					+ i_31_ + ')'));
		}
	}

	abstract void T(int i, int i_32_, int i_33_, int i_34_);

	abstract int[] Y();

	abstract boolean method1019();

	abstract Class206 method1020(Class179 class179, int i, int i_35_,
			int i_36_, int i_37_);

	abstract void K(int[] is);

	abstract void method1021(int i);

	final void method1022(int i, int i_38_, int i_39_, int i_40_, int i_41_) {
		try {
			P(i_38_, i_39_, i_40_, i_41_, 1);
			if (i <= 117)
				KA(-75, -80, -32, 112);
			anInt2117++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ha.KD(" + i + ','
					+ i_38_ + ',' + i_39_ + ',' + i_40_ + ',' + i_41_ + ')'));
		}
	}

	final void method1023(byte i, Class253 class253) {
		try {
			if (i == 26) {
				method1076(method1066(
						class253,
						method1071(class253.method1609(), class253.method1615())));
				anInt2115++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ha.ND(" + i + ','
					+ (class253 != null ? "{...}" : "null") + ')'));
		}
	}

	abstract void method1024(int i);

	abstract void method1025(Canvas canvas, int i, int i_42_);

	abstract int method1026();

	abstract void method1027(Class234 class234);

	abstract void xa(float f);

	abstract int M();

	abstract void method1028(int i);

	abstract int[] na(int i, int i_43_, int i_44_, int i_45_);

	final void method1029(int i, int i_46_, int i_47_, int i_48_, int i_49_,
			int i_50_) {
		do {
			try {
				anInt2110++;
				method1007(i_50_, i_46_, i_48_, i_47_, i_49_, 1);
				if (i >= 49)
					break;
				H(101, 93, 116, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ha.JD(" + i + ','
						+ i_46_ + ',' + i_47_ + ',' + i_48_ + ',' + i_49_ + ','
						+ i_50_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method1030(String string, int i, int i_51_,
			String string_52_, boolean bool) {
		try {
			Class11_Sub26.method2669(i, string_52_, true, -1, bool, true,
					string);
			if (i_51_ == 7059)
				anInt2105++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ha.PD("
					+ (string != null ? "{...}" : "null") + ',' + i + ','
					+ i_51_ + ',' + (string_52_ != null ? "{...}" : "null")
					+ ',' + bool + ')'));
		}
	}

	abstract void method1031();

	abstract boolean method1032();

	abstract void pa();

	abstract Interface8 method1033(int i, int i_53_);

	abstract void method1034(int i);

	final void method1035(int i, int i_54_, int i_55_, byte i_56_, int i_57_,
			int i_58_) {
		do {
			try {
				anInt2106++;
				aa(i_54_, i_55_, i_58_, i_57_, i, 1);
				if (i_56_ >= 51)
					break;
				((Class163) this).anInt2103 = -115;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ha.SD(" + i + ','
						+ i_54_ + ',' + i_55_ + ',' + i_56_ + ',' + i_57_ + ','
						+ i_58_ + ')'));
			}
			break;
		} while (false);
	}

	abstract void L(int i, int i_59_, int i_60_);

	abstract Class12 method1036(int i, int i_61_, int[][] is, int[][] is_62_,
			int i_63_, int i_64_, int i_65_);

	abstract void method1037(int[] is);

	abstract Class253 method1038(int[] is, int i, int i_66_, int i_67_,
			int i_68_, boolean bool);

	abstract void ra(int i, int i_69_, int i_70_, int i_71_);

	abstract void da(int i, int i_72_, int i_73_, int[] is);

	abstract void la();

	final void method1039(int i, int i_74_, int i_75_, byte i_76_, int i_77_) {
		try {
			if (i_76_ >= 90) {
				anInt2104++;
				za(i_74_, i_77_, i_75_, i, 1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ha.RD(" + i + ','
					+ i_74_ + ',' + i_75_ + ',' + i_76_ + ',' + i_77_ + ')'));
		}
	}

	final Class253 method1040(int i, int i_78_, int[] is, int i_79_, int i_80_,
			int i_81_) {
		try {
			anInt2111++;
			if (i_79_ != -1)
				((Class163) this).anInt2103 = -39;
			return method1038(is, i_81_, i, i_80_, i_78_, true);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ha.OD(" + i + ','
					+ i_78_ + ',' + (is != null ? "{...}" : "null") + ','
					+ i_79_ + ',' + i_80_ + ',' + i_81_ + ')'));
		}
	}

	abstract Class33 method1041();

	abstract void method1042(float f, float f_82_, float f_83_);

	abstract void GA(int i);

	abstract void P(int i, int i_84_, int i_85_, int i_86_, int i_87_);

	abstract void aa(int i, int i_88_, int i_89_, int i_90_, int i_91_,
			int i_92_);

	abstract void method1043();

	abstract void U(int i, int i_93_, int i_94_, int i_95_, int i_96_);

	abstract int XA();

	abstract void method1044(int i, int i_97_) throws Exception_Sub1;

	abstract Class33 method1045();

	abstract void method1046(int i, int i_98_, int i_99_, int i_100_,
			int i_101_, int i_102_, int i_103_);

	abstract boolean method1047();

	abstract Class33 method1048();

	abstract void ya();

	abstract boolean method1049();

	abstract int JA(int i, int i_104_, int i_105_, int i_106_, int i_107_,
			int i_108_);

	abstract void method1050(int i);

	abstract void EA(int i, int i_109_, int i_110_, int i_111_);

	abstract void method1051(int i, int i_112_, int i_113_, int i_114_,
			int i_115_, int i_116_);

	abstract void H(int i, int i_117_, int i_118_, int[] is);

	abstract void A(int i, Class72 class72, int i_119_, int i_120_);

	abstract Class234 method1052(int i, int i_121_, int i_122_, int i_123_,
			int i_124_, int i_125_);

	abstract void method1053(boolean bool);

	abstract void method1054(Canvas canvas);

	abstract Class100 method1055();

	final void method1056(int i) throws Exception_Sub1 {
		try {
			method1044(0, i);
			anInt2116++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ha.TD(" + i + ')');
		}
	}

	abstract Class234 method1057(Class234 class234, Class234 class234_126_,
			float f, Class234 class234_127_);

	abstract int r(int i, int i_128_, int i_129_, int i_130_, int i_131_,
			int i_132_, int i_133_);

	abstract void f(int i, int i_134_);

	abstract void method1058(int i, int i_135_, int i_136_, int i_137_,
			int i_138_, int i_139_, Class72 class72, int i_140_, int i_141_,
			int i_142_, int i_143_, int i_144_);

	abstract void X(int i);

	final void method1059(int i, int i_145_, int i_146_, int i_147_, int i_148_) {
		try {
			U(i, i_145_, i_147_, i_148_, 1);
			if (i_146_ == 8985)
				anInt2108++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ha.VD(" + i + ',' + i_145_ + ',' + i_146_ + ',' + i_147_
							+ ',' + i_148_ + ')'));
		}
	}

	abstract Class107 method1060(Class292 class292, Class80[] class80s,
			boolean bool);

	abstract void method1061(Class11_Sub50 class11_sub50);

	abstract void za(int i, int i_149_, int i_150_, int i_151_, int i_152_);

	abstract boolean method1062();

	abstract boolean method1063();

	abstract void method1064(int i, int i_153_, int i_154_, int i_155_,
			int i_156_, int i_157_, int i_158_, int i_159_, int i_160_);

	abstract int E();

	abstract int method1065(int i, int i_161_);

	abstract Interface10 method1066(Interface8 interface8,
			Interface26 interface26);

	abstract boolean method1067();

	abstract void KA(int i, int i_162_, int i_163_, int i_164_);

	abstract void method1068(int i);

	abstract boolean method1069();

	abstract void method1070();

	abstract Interface26 method1071(int i, int i_165_);

	final void method1072(int i) {
		try {
			if (i == 1) {
				Class315.aBoolArray4173[((Class163) this).anInt2103] = false;
				anInt2120++;
				method1016();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ha.QD(" + i + ')');
		}
	}

	abstract Class11_Sub46 method1073(int i, int i_166_, int i_167_,
			int i_168_, int i_169_, float f);

	abstract boolean method1074();

	abstract void method1075(Canvas canvas);

	abstract void method1076(Interface10 interface10);

	abstract int method1077(int i, int i_170_);

	abstract void HA(int i, int i_171_, int i_172_, int i_173_, int[] is);

	abstract void method1078();

	abstract void method1079(int i, int i_174_, int i_175_, int i_176_,
			int i_177_, int i_178_, int i_179_, int i_180_, int i_181_,
			int i_182_, int i_183_, int i_184_, int i_185_);

	abstract void method1080(Class33 class33);

	abstract Class253 method1081(Class80 class80, boolean bool);

	static final synchronized Class163 method1082(int i, Class146 class146,
			int i_186_, Canvas canvas, int i_187_, int i_188_,
			Interface1 interface1, int i_189_) {
		try {
			anInt2107++;
			if ((i_188_ ^ 0xffffffff) == -1)
				return Class108_Sub7.method2436(i_186_, interface1, i_189_,
						(byte) 76, canvas);
			if ((i_188_ ^ 0xffffffff) == -3)
				return Class94_Sub4.method3117(interface1, i_186_, -14883,
						canvas, i_189_);
			if ((i_188_ ^ 0xffffffff) == -2)
				return Class11_Sub50_Sub2.method3563(i_187_, interface1,
						canvas, 18785);
			if (i_188_ == 5)
				return Class11_Sub2_Sub20.method3576(i_187_, interface1,
						canvas, -31955, class146);
			if ((i_188_ ^ 0xffffffff) == -4)
				return Class148.method945(interface1, canvas, class146, i_187_,
						-18090);
			if (i != -1346)
				return null;
			throw new IllegalArgumentException("UM");
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ha.LD(" + i + ',' + (class146 != null ? "{...}" : "null")
							+ ',' + i_186_ + ','
							+ (canvas != null ? "{...}" : "null") + ','
							+ i_187_ + ',' + i_188_ + ','
							+ (interface1 != null ? "{...}" : "null") + ','
							+ i_189_ + ')'));
		}
	}

	abstract void method1083(int i, int i_190_, int i_191_, int i_192_);

	abstract boolean method1084();

	Class163(Interface1 interface1) {
		try {
			((Class163) this).anInterface1_2118 = interface1;
			int i = -1;
			for (int i_193_ = 0; (i_193_ ^ 0xffffffff) > -9; i_193_++) {
				if (!Class315.aBoolArray4173[i_193_]) {
					i = i_193_;
					Class315.aBoolArray4173[i_193_] = true;
					break;
				}
			}
			if (i == -1)
				throw new IllegalStateException("NFTI");
			((Class163) this).anInt2103 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ha.<init>("
					+ (interface1 != null ? "{...}" : "null") + ')');
		}
	}

	abstract void Q(int i, int i_194_, int i_195_, int i_196_, int i_197_,
			int i_198_, byte[] is, int i_199_, int i_200_);

	abstract Class72 method1085(int i, int i_201_, int[] is, int[] is_202_);

	abstract void C(boolean bool);

	abstract boolean method1086();

	abstract void F(int i, int i_203_);

	abstract void b(int i, int i_204_, int i_205_, int i_206_, double d);
}
