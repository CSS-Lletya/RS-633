/* Class_t - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_t extends Class12 implements Interface2 {
	private oa anoa5116;
	long nativeid;
	private Class84 aClass84_5117 = new Class84();
	private int anInt5118 = -1;

	final native void wa(Class11_Sub45_Sub1 class11_sub45_sub1, int i,
			int i_0_, int i_1_, int i_2_, boolean bool);

	final void method133(int i, int i_3_, int i_4_, int i_5_, int i_6_,
			int i_7_, int i_8_, boolean[][] bools) {
		anoa5116.B().method105(this, i, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_,
				bools);
	}

	private final native void q(float[] fs);

	final void method127(int i, int i_9_) {
		if (anInt5118 < 0)
			anoa5116.B().method104(this, i, i_9_);
		else
			anoa5116.B().method93(this, i, i_9_, anInt5118);
	}

	final native void CA(Class11_Sub45_Sub1 class11_sub45_sub1, int i,
			int i_10_, int i_11_, int i_12_, boolean bool);

	final boolean method128(Class11_Sub45_Sub1 class11_sub45_sub1, int i,
			int i_13_, int i_14_, int i_15_, boolean bool) {
		return true;
	}

	final native void YA();

	final void method135(int i, int i_16_, int i_17_, boolean[][] bools,
			boolean bool, int i_18_, int i_19_) {
		anInt5118 = i_18_;
		int i_20_ = 0;
		float[] fs = new float[aClass84_5117.method583(34)];
		for (Class11_Sub46 class11_sub46 = (Class11_Sub46) aClass84_5117
				.method584(-12261); class11_sub46 != null; class11_sub46 = (Class11_Sub46) aClass84_5117
				.method578(-15361))
			fs[i_20_++] = class11_sub46.method3211(-18277);
		q(fs);
		for (int i_21_ = 0; i_21_ < i_17_ + i_17_; i_21_++) {
			for (int i_22_ = 0; i_22_ < i_17_ + i_17_; i_22_++) {
				if (bools[i_21_][i_22_]) {
					int i_23_ = i - i_17_ + i_21_;
					int i_24_ = i_16_ - i_17_ + i_22_;
					if (i_23_ >= 0 && i_23_ < ((Class12) this).anInt103
							&& i_24_ >= 0 && i_24_ < ((Class12) this).anInt98)
						method127(i_23_, i_24_);
				}
			}
		}
	}

	final native void ka(int i, int i_25_, int i_26_);

	public final native void w(boolean bool);

	Class_t(oa var_oa, ya var_ya, int i, int i_27_, int[][] is, int[][] is_28_,
			int i_29_, int i_30_, int i_31_) {
		super(i, i_27_, i_29_, is);
		anoa5116 = var_oa;
		ga(anoa5116, var_ya, i, i_27_, ((Class12) this).anIntArrayArray100,
				is_28_, i_29_, i_30_, i_31_);
	}

	final void method137(int i, int i_32_, int[] is, int[] is_33_,
			int[] is_34_, int[] is_35_, int[] is_36_, int[] is_37_,
			int[] is_38_, int[] is_39_, int[] is_40_, int[] is_41_,
			int[] is_42_, int i_43_, int i_44_, int i_45_, boolean bool) {
		boolean bool_46_ = false;
		if (is_39_ != null) {
			int[] is_47_ = is_39_;
			for (int i_48_ = 0; i_48_ < is_47_.length; i_48_++) {
				int i_49_ = is_47_[i_48_];
				if (i_49_ != -1) {
					bool_46_ = true;
					break;
				}
			}
		}
		int i_50_ = is_39_.length;
		int[] is_51_ = new int[i_50_ * 3];
		int[] is_52_ = new int[i_50_ * 3];
		int[] is_53_ = new int[i_50_ * 3];
		int[] is_54_ = new int[i_50_ * 3];
		int[] is_55_ = new int[i_50_ * 3];
		int[] is_56_ = is_40_ != null ? new int[i_50_ * 3] : null;
		int[] is_57_ = is_33_ != null ? new int[i_50_ * 3] : null;
		int[] is_58_ = is_35_ != null ? new int[i_50_ * 3] : null;
		int i_59_ = 0;
		for (int i_60_ = 0; i_60_ < i_50_; i_60_++) {
			int i_61_ = is_36_[i_60_];
			int i_62_ = is_37_[i_60_];
			int i_63_ = is_38_[i_60_];
			is_51_[i_59_] = is[i_61_];
			is_52_[i_59_] = is_34_[i_61_];
			is_53_[i_59_] = is_39_[i_60_];
			is_54_[i_59_] = is_41_[i_60_];
			is_55_[i_59_] = is_42_[i_60_];
			if (is_40_ != null)
				is_56_[i_59_] = is_40_[i_60_];
			if (is_33_ != null)
				is_57_[i_59_] = is_33_[i_61_];
			if (is_35_ != null)
				is_58_[i_59_] = is_35_[i_61_];
			i_59_++;
			is_51_[i_59_] = is[i_62_];
			is_52_[i_59_] = is_34_[i_62_];
			is_53_[i_59_] = is_39_[i_60_];
			is_54_[i_59_] = is_41_[i_60_];
			is_55_[i_59_] = is_42_[i_60_];
			if (is_40_ != null)
				is_56_[i_59_] = is_40_[i_60_];
			if (is_33_ != null)
				is_57_[i_59_] = is_33_[i_62_];
			if (is_35_ != null)
				is_58_[i_59_] = is_35_[i_62_];
			i_59_++;
			is_51_[i_59_] = is[i_63_];
			is_52_[i_59_] = is_34_[i_63_];
			is_53_[i_59_] = is_39_[i_60_];
			is_54_[i_59_] = is_41_[i_60_];
			is_55_[i_59_] = is_42_[i_60_];
			if (is_40_ != null)
				is_56_[i_59_] = is_40_[i_60_];
			if (is_33_ != null)
				is_57_[i_59_] = is_33_[i_63_];
			if (is_35_ != null)
				is_58_[i_59_] = is_35_[i_63_];
			i_59_++;
		}
		if (bool_46_ || is_56_ != null)
			U(i, i_32_, is_51_, is_57_, is_52_, is_58_, is_53_, is_56_, is_54_,
					is_55_, i_43_, i_44_, i_45_, bool);
	}

	protected final void finalize() {
		if (((Class_t) this).nativeid != 0L)
			Class257.method1642((byte) 123, this);
	}

	final native Class11_Sub45_Sub1 fa(int i, int i_64_,
			Class11_Sub45_Sub1 class11_sub45_sub1);

	private final native void V(int i, int i_65_, int i_66_, int i_67_,
			int i_68_, int i_69_, int[] is);

	final void method136(Class11_Sub46 class11_sub46, int[] is) {
		aClass84_5117.method589((byte) -13, class11_sub46);
		V(class11_sub46.hashCode(), class11_sub46.method3203(false),
				class11_sub46.method3205(-109), class11_sub46.method3204(true),
				class11_sub46.method3208(-1),
				class11_sub46.method3209((byte) -106), is);
	}

	final native void U(int i, int i_70_, int[] is, int[] is_71_, int[] is_72_,
			int[] is_73_, int[] is_74_, int[] is_75_, int[] is_76_,
			int[] is_77_, int i_78_, int i_79_, int i_80_, boolean bool);

	private final native void ga(oa var_oa, ya var_ya, int i, int i_81_,
			int[][] is, int[][] is_82_, int i_83_, int i_84_, int i_85_);

	final void method132(int i, int i_86_, int i_87_, boolean[][] bools,
			boolean bool, int i_88_) {
		anInt5118 = -1;
		int i_89_ = 0;
		float[] fs = new float[aClass84_5117.method583(66)];
		for (Class11_Sub46 class11_sub46 = (Class11_Sub46) aClass84_5117
				.method584(-12261); class11_sub46 != null; class11_sub46 = (Class11_Sub46) aClass84_5117
				.method578(-15361))
			fs[i_89_++] = class11_sub46.method3211(-18277);
		q(fs);
		for (int i_90_ = 0; i_90_ < i_87_ + i_87_; i_90_++) {
			for (int i_91_ = 0; i_91_ < i_87_ + i_87_; i_91_++) {
				if (bools[i_90_][i_91_]) {
					int i_92_ = i - i_87_ + i_90_;
					int i_93_ = i_86_ - i_87_ + i_91_;
					if (i_92_ >= 0 && i_92_ < ((Class12) this).anInt103
							&& i_93_ >= 0 && i_93_ < ((Class12) this).anInt98)
						method127(i_92_, i_93_);
				}
			}
		}
	}
}
