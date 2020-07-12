/* Class_a - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_a implements Interface2 {
	Runnable aRunnable50;
	private Class_i ani51;
	private oa anoa52;
	private Class_i ani53;
	private Class_i ani54;
	long nativeid;
	private Class_i ani55;
	private Class_i ani56;
	private Class_i ani57;
	private Class_i ani58;
	private Class_i ani59;
	private Class_i ani60;
	private Class_i ani61;

	private final native void Z(long l, long l_0_, int i, int i_1_, int i_2_);

	private final native void f(long l, long l_3_, long l_4_, int[] is, int i,
			int i_5_);

	private final native void na(long l, Class163 class163, int i, int i_6_,
			int i_7_, int i_8_, int i_9_, int i_10_, int i_11_);

	final void method93(Class12 class12, int i, int i_12_, int i_13_) {
		Z(((Class_a) this).nativeid, ((Class_t) (Class_t) class12).nativeid, i,
				i_12_, i_13_);
	}

	final boolean method94(Class206 class206, int i, int i_14_,
			Class33 class33, boolean bool, int i_15_) {
		return n(((Class_a) this).nativeid,
				((Class_i) (Class_i) class206).nativeid, i, i_14_,
				((ja) (ja) class33).nativeid, bool, i_15_);
	}

	final void method95() {
		((Class_a) this).aRunnable50 = Thread.currentThread();
		method97();
	}

	final void method96(Class163 class163, int i, int i_16_, int i_17_,
			int i_18_, int i_19_, int i_20_, int i_21_) {
		na(((Class_a) this).nativeid, class163, i, i_16_, i_17_, i_18_, i_19_,
				i_20_, i_21_);
	}

	private final void method97() {
		M(((Class_a) this).nativeid);
	}

	private final native boolean R(long l, long l_22_, int i, int i_23_,
			long l_24_, boolean bool);

	private final native void M(long l);

	private final native void W(long l);

	final void method98(Class206 class206, Class206 class206_25_, int i,
			int i_26_, int i_27_, boolean bool) {
		r(((Class_a) this).nativeid, ((Class_i) (Class_i) class206).nativeid,
				((Class_i) (Class_i) class206_25_).nativeid, i, i_26_, i_27_,
				bool);
	}

	final void method99(Class206 class206, int[] is, Class33 class33) {
		e(((Class_a) this).nativeid, ((Class_i) (Class_i) class206).nativeid,
				is, ((ja) (ja) class33).nativeid);
	}

	private final native void UA(long l, long l_28_, long l_29_, int[] is, int i);

	final boolean method100(Class206 class206, int i, int i_30_,
			Class33 class33, boolean bool) {
		return R(((Class_a) this).nativeid,
				((Class_i) (Class_i) class206).nativeid, i, i_30_,
				((ja) (ja) class33).nativeid, bool);
	}

	final void method101(Class206 class206, Class33 class33, int[] is, int i,
			int i_31_) {
		f(((Class_a) this).nativeid, ((Class_i) (Class_i) class206).nativeid,
				((ja) (ja) class33).nativeid, is, i, i_31_);
	}

	private final native void ta(long l, long l_32_, int i, int i_33_,
			int i_34_, int i_35_, int i_36_, int i_37_, int i_38_,
			boolean[][] bools);

	final Class206 method102(Class_i class_i, byte i, int i_39_, boolean bool) {
		Class_i class_i_40_;
		Class_i class_i_41_;
		if (i == 1) {
			class_i_40_ = ani61;
			class_i_41_ = ani57;
		} else if (i == 2) {
			class_i_40_ = ani56;
			class_i_41_ = ani53;
		} else if (i == 3) {
			class_i_40_ = ani55;
			class_i_41_ = ani58;
		} else if (i == 4) {
			class_i_40_ = ani51;
			class_i_41_ = ani60;
		} else if (i == 5) {
			class_i_40_ = ani54;
			class_i_41_ = ani59;
		} else
			class_i_41_ = class_i_40_ = new Class_i(anoa52);
		class_i.ZA(class_i_41_, class_i_40_, i_39_, i != 0, bool);
		((Class_i) class_i_41_).aClass110Array5085 = ((Class_i) class_i).aClass110Array5085;
		((Class_i) class_i_41_).aClass261Array5084 = ((Class_i) class_i).aClass261Array5084;
		return class_i_41_;
	}

	public final void w(boolean bool) {
		E(((Class_a) this).nativeid, bool);
	}

	final void method103(Class163 class163, int[] is, int[] is_42_,
			int[] is_43_, short[] is_44_, int i) {
		O(((Class_a) this).nativeid, class163, is, is_42_, is_43_, is_44_, i);
	}

	private final native void HA(long l, Class163 class163, int i, int i_45_);

	final void method104(Class12 class12, int i, int i_46_) {
		H(((Class_a) this).nativeid, ((Class_t) (Class_t) class12).nativeid, i,
				i_46_);
	}

	private final native boolean n(long l, long l_47_, int i, int i_48_,
			long l_49_, boolean bool, int i_50_);

	private final native void H(long l, long l_51_, int i, int i_52_);

	final void method105(Class12 class12, int i, int i_53_, int i_54_,
			int i_55_, int i_56_, int i_57_, int i_58_, boolean[][] bools) {
		ta(((Class_a) this).nativeid, ((Class_t) (Class_t) class12).nativeid,
				i, i_53_, i_54_, i_55_, i_56_, i_57_, i_58_, bools);
	}

	private final native void O(long l, Class163 class163, int[] is,
			int[] is_59_, int[] is_60_, short[] is_61_, int i);

	private final native void E(long l, boolean bool);

	private final native void r(long l, long l_62_, long l_63_, int i,
			int i_64_, int i_65_, boolean bool);

	final void method106() {
		((Class_a) this).aRunnable50 = null;
		method107();
	}

	private final native void e(long l, long l_66_, int[] is, long l_67_);

	protected final void finalize() {
		if (((Class_a) this).nativeid != 0L)
			Class257.method1642((byte) 123, this);
	}

	private final void method107() {
		W(((Class_a) this).nativeid);
	}

	final void method108(Class206 class206, Class33 class33, int[] is, int i) {
		UA(((Class_a) this).nativeid, ((Class_i) (Class_i) class206).nativeid,
				((ja) (ja) class33).nativeid, is, i);
	}

	Class_a(oa var_oa, int i, int i_68_) {
		anoa52 = var_oa;
		ani57 = new Class_i(anoa52);
		ani53 = new Class_i(anoa52);
		ani58 = new Class_i(anoa52);
		ani60 = new Class_i(anoa52);
		ani59 = new Class_i(anoa52);
		ani61 = new Class_i(anoa52);
		ani56 = new Class_i(anoa52);
		ani55 = new Class_i(anoa52);
		ani51 = new Class_i(anoa52);
		ani54 = new Class_i(anoa52);
		HA(((Class_a) this).nativeid, var_oa, i, i_68_);
	}
}
