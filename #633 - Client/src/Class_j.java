/* Class_j - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_j extends Class253 implements Interface2 {
	long nativeid;

	final void method1613(int i, int i_0_, int i_1_) {
		N(((Class_j) this).nativeid, i, i_0_, i_1_);
	}

	private final native void UA(long l, float f, float f_2_, float f_3_,
			float f_4_, float f_5_, float f_6_, int i, long l_7_, int i_8_,
			int i_9_);

	final int method1608() {
		return wa(((Class_j) this).nativeid);
	}

	final void method1625(int i, int i_10_, int i_11_, int i_12_, int i_13_,
			int i_14_, int i_15_) {
		P(((Class_j) this).nativeid, i, i_10_, i_11_, i_12_, i_13_, i_14_,
				i_15_);
	}

	final void method1612(int i, int i_16_, Class72 class72, int i_17_,
			int i_18_) {
		V(((Class_j) this).nativeid, i, i_16_, ((na) (na) class72).nativeid,
				i_17_, i_18_);
	}

	final void method1611(int i, int i_19_, int i_20_, int i_21_, int i_22_,
			int i_23_) {
		YA(((Class_j) this).nativeid, i, i_19_, i_20_, i_21_, i_22_, i_23_);
	}

	final void method1617(float f, float f_24_, float f_25_, float f_26_,
			float f_27_, float f_28_, int i, int i_29_, int i_30_, int i_31_) {
		b(((Class_j) this).nativeid, f, f_24_, f_25_, f_26_, f_27_, f_28_, i,
				i_29_, i_30_, i_31_);
	}

	private final native void ua(oa var_oa, int[] is, int i, int i_32_,
			int i_33_, int i_34_, boolean bool);

	private final native int JA(long l);

	final int method1622() {
		return JA(((Class_j) this).nativeid);
	}

	private final native void EA(oa var_oa, int i, int i_35_);

	private final native int wa(long l);

	private final native void ma(oa var_oa, int[] is, byte[] is_36_,
			byte[] is_37_, int i, int i_38_, int i_39_, int i_40_);

	final void method1628(float f, float f_41_, float f_42_, float f_43_,
			float f_44_, float f_45_, int i, Class72 class72, int i_46_,
			int i_47_) {
		UA(((Class_j) this).nativeid, f, f_41_, f_42_, f_43_, f_44_, f_45_, i,
				((na) (na) class72).nativeid, i_46_, i_47_);
	}

	protected final void finalize() {
		if (((Class_j) this).nativeid != 0L)
			Class257.method1642((byte) 123, this);
	}

	final void method1607(int i, int i_48_, int i_49_, int i_50_) {
		A(((Class_j) this).nativeid, i, i_48_, i_49_, i_50_);
	}

	final int method1615() {
		return I(((Class_j) this).nativeid);
	}

	private final native void W(long l, int i, int i_51_, int i_52_, int i_53_,
			int i_54_);

	private final native void P(long l, int i, int i_55_, int i_56_, int i_57_,
			int i_58_, int i_59_, int i_60_);

	private final native int M(long l);

	private final native void A(long l, int i, int i_61_, int i_62_, int i_63_);

	public final void w(boolean bool) {
		R(((Class_j) this).nativeid, bool);
	}

	final void method1626(int i, int i_64_, int i_65_, int i_66_, int i_67_,
			int i_68_, int i_69_, int i_70_) {
		RA(((Class_j) this).nativeid, i, i_64_, i_65_, i_66_, i_67_, i_68_,
				i_69_, i_70_);
	}

	final int method1609() {
		return M(((Class_j) this).nativeid);
	}

	private final native void b(long l, float f, float f_71_, float f_72_,
			float f_73_, float f_74_, float f_75_, int i, int i_76_, int i_77_,
			int i_78_);

	private final native void RA(long l, int i, int i_79_, int i_80_,
			int i_81_, int i_82_, int i_83_, int i_84_, int i_85_);

	private final native void h(oa var_oa, int i, int i_86_, int i_87_,
			int i_88_, boolean bool);

	Class_j(oa var_oa, int i, int i_89_) {
		EA(var_oa, i, i_89_);
	}

	private final native void N(long l, int i, int i_90_, int i_91_);

	private final native int I(long l);

	Class_j(oa var_oa, int[] is, int i, int i_92_, int i_93_, int i_94_,
			boolean bool) {
		ua(var_oa, is, i, i_92_, i_93_, i_94_, bool);
	}

	final void method1624(int i, int i_95_, int i_96_, int i_97_, int i_98_) {
		W(((Class_j) this).nativeid, i, i_95_, i_96_, i_97_, i_98_);
	}

	private final native void R(long l, boolean bool);

	private final native void YA(long l, int i, int i_99_, int i_100_,
			int i_101_, int i_102_, int i_103_);

	private final native void V(long l, int i, int i_104_, long l_105_,
			int i_106_, int i_107_);

	Class_j(oa var_oa, int[] is, byte[] is_108_, byte[] is_109_, int i,
			int i_110_, int i_111_, int i_112_) {
		ma(var_oa, is, is_108_, is_109_, i, i_110_, i_111_, i_112_);
	}

	Class_j(oa var_oa, int i, int i_113_, int i_114_, int i_115_, boolean bool) {
		h(var_oa, i, i_113_, i_114_, i_115_, bool);
	}
}
