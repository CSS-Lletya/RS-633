/* Class_i - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_i extends Class206 implements Interface2 {
	long nativeid;
	private oa anoa5082;
	private ya aya5083;
	Class261[] aClass261Array5084;
	Class110[] aClass110Array5085;

	final native void ZA(Class_i class_i_0_, Class_i class_i_1_, int i,
			boolean bool, boolean bool_2_);

	final native Class11_Sub45_Sub1 ba(Class11_Sub45_Sub1 class11_sub45_sub1);

	final native int ma();

	private final native void D(long l, int i, boolean bool);

	final void method1317() {
		if (((oa) anoa5082).M > 1) {
			synchronized (this) {
				((Class206) this).aBool2765 = false;
				this.notifyAll();
			}
		}
	}

	final void method1321(Class33 class33, Class376_Sub4 class376_sub4, int i) {
		if (class376_sub4 == null)
			anoa5082.B().method108(this, class33, null, i);
		else {
			oa.D[5] = 0;
			anoa5082.B().method108(this, class33, oa.D, i);
			((Class376_Sub4) class376_sub4).anInt6122 = oa.D[0];
			((Class376_Sub4) class376_sub4).anInt6123 = oa.D[1];
			((Class376_Sub4) class376_sub4).anInt6127 = oa.D[2];
			((Class376_Sub4) class376_sub4).anInt6126 = oa.D[3];
			((Class376_Sub4) class376_sub4).anInt6125 = oa.D[4];
			((Class376_Sub4) class376_sub4).aBool6124 = oa.D[5] != 0;
		}
	}

	final native int EA();

	final native void C(int i);

	final native boolean F();

	public final native void w(boolean bool);

	final void method1323(int i, int i_3_, int i_4_, int i_5_) {
		/* empty */
	}

	final Class206 method1313(byte i, int i_6_, boolean bool) {
		return anoa5082.B().method102(this, i, i_6_, bool);
	}

	final Class110[] method1307() {
		return ((Class_i) this).aClass110Array5085;
	}

	final native int ua();

	final boolean method1305(int i, int i_7_, Class33 class33, boolean bool,
			int i_8_, int i_9_) {
		return anoa5082.B().method94(this, i, i_7_, class33, bool, i_9_);
	}

	final void method1306() {
		/* empty */
	}

	final native void a(int i);

	final void method1320(int i, int[] is, int i_10_, int i_11_, int i_12_,
			int i_13_, boolean bool) {
		l(((Class_i) this).nativeid, i, is, i_10_, i_11_, i_12_, i_13_, bool);
	}

	final boolean method1309(int i, int i_14_, Class33 class33, boolean bool,
			int i_15_) {
		return anoa5082.B().method100(this, i, i_14_, class33, bool);
	}

	final native int V();

	final native void H(int i, int i_16_, int i_17_);

	final native int WA();

	final void method1311(Class206 class206, int i, int i_18_, int i_19_,
			boolean bool) {
		anoa5082.B().method98(this, class206, i, i_18_, i_19_, bool);
	}

	final native void FA(int i);

	final void method1318(Class33 class33) {
		method2269(oa.A, class33);
		int i = 0;
		if (((Class_i) this).aClass110Array5085 != null) {
			for (int i_20_ = 0; i_20_ < ((Class_i) this).aClass110Array5085.length; i_20_++) {
				Class110 class110 = ((Class_i) this).aClass110Array5085[i_20_];
				((Class110) class110).anInt1492 = oa.A[i++];
				((Class110) class110).anInt1499 = oa.A[i++];
				((Class110) class110).anInt1505 = oa.A[i++];
				((Class110) class110).anInt1504 = oa.A[i++];
				((Class110) class110).anInt1494 = oa.A[i++];
				((Class110) class110).anInt1493 = oa.A[i++];
				((Class110) class110).anInt1502 = oa.A[i++];
				((Class110) class110).anInt1509 = oa.A[i++];
				((Class110) class110).anInt1491 = oa.A[i++];
			}
		}
		if (((Class_i) this).aClass261Array5084 != null) {
			for (int i_21_ = 0; i_21_ < ((Class_i) this).aClass261Array5084.length; i_21_++) {
				Class261 class261 = ((Class_i) this).aClass261Array5084[i_21_];
				Class261 class261_22_ = class261;
				if (((Class261) class261).aClass261_3591 != null)
					class261_22_ = ((Class261) class261).aClass261_3591;
				if (((Class261) class261).aClass33_3585 != null)
					((Class261) class261).aClass33_3585.method296(class33);
				else
					((Class261) class261).aClass33_3585 = class33.method292();
				((Class261) class261_22_).anInt3586 = oa.A[i++];
				((Class261) class261_22_).anInt3590 = oa.A[i++];
				((Class261) class261_22_).anInt3582 = oa.A[i++];
			}
		}
	}

	private final native void l(long l, int i, int[] is, int i_23_, int i_24_,
			int i_25_, int i_26_, boolean bool);

	final Class261[] method1325() {
		return ((Class_i) this).aClass261Array5084;
	}

	final native void s(int i);

	final native boolean r();

	final native void p(int i, int i_27_, Class12 class12, Class12 class12_28_,
			int i_29_, int i_30_, int i_31_);

	final native int G();

	final native void wa();

	private final native void R(oa var_oa, ya var_ya, int i, int i_32_,
			int[] is, int[] is_33_, int[] is_34_, int[] is_35_, short[] is_36_,
			int i_37_, short[] is_38_, short[] is_39_, short[] is_40_,
			byte[] is_41_, byte[] is_42_, byte[] is_43_, byte[] is_44_,
			short[] is_45_, short[] is_46_, int[] is_47_, byte i_48_,
			short[] is_49_, int i_50_, byte[] is_51_, short[] is_52_,
			short[] is_53_, short[] is_54_, int[] is_55_, int[] is_56_,
			int[] is_57_, byte[] is_58_, byte[] is_59_, int[] is_60_,
			int[] is_61_, int[] is_62_, int[] is_63_, int i_64_, int i_65_,
			int i_66_, int i_67_, int i_68_, int i_69_, int[] is_70_);

	final native void I(int i, int[] is, int i_71_, int i_72_, int i_73_,
			boolean bool, int i_74_, int[] is_75_);

	final native void VA(int i);

	final native void LA(int i);

	private final native void oa(oa var_oa);

	final native void k(int i);

	final native int fa();

	final native boolean NA();

	final native void aa(short i, short i_76_);

	final void method1326() {
		if (((oa) anoa5082).M > 1) {
			synchronized (this) {
				while (((Class206) this).aBool2765) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				((Class206) this).aBool2765 = true;
			}
		}
	}

	final boolean method1328() {
		return true;
	}

	final native void O(int i, int i_77_, int i_78_);

	final native int RA();

	final native int HA();

	final native void ia(short i, short i_79_);

	final void method1329(Class33 class33, Class376_Sub4 class376_sub4, int i,
			int i_80_) {
		if (class376_sub4 == null)
			anoa5082.B().method101(this, class33, null, i, i_80_);
		else {
			oa.D[5] = 0;
			anoa5082.B().method101(this, class33, oa.D, i, i_80_);
			((Class376_Sub4) class376_sub4).anInt6122 = oa.D[0];
			((Class376_Sub4) class376_sub4).anInt6123 = oa.D[1];
			((Class376_Sub4) class376_sub4).anInt6127 = oa.D[2];
			((Class376_Sub4) class376_sub4).anInt6126 = oa.D[3];
			((Class376_Sub4) class376_sub4).anInt6125 = oa.D[4];
			((Class376_Sub4) class376_sub4).aBool6124 = oa.D[5] != 0;
		}
	}

	final native void v();

	final void method1302(Class33 class33, int i, boolean bool) {
		D(((ja) (ja) class33).nativeid, i, bool);
	}

	final native int da();

	final native int na();

	private final void method2269(int[] is, Class33 class33) {
		anoa5082.B().method99(this, is, class33);
	}

	Class_i(oa var_oa, ya var_ya, Class179 class179, int i, int i_81_,
			int i_82_, int i_83_) {
		anoa5082 = var_oa;
		aya5083 = var_ya;
		((Class_i) this).aClass110Array5085 = ((Class179) class179).aClass110Array2299;
		((Class_i) this).aClass261Array5084 = ((Class179) class179).aClass261Array2270;
		int i_84_ = (((Class179) class179).aClass110Array2299 == null ? 0
				: ((Class179) class179).aClass110Array2299.length);
		int i_85_ = (((Class179) class179).aClass261Array2270 == null ? 0
				: ((Class179) class179).aClass261Array2270.length);
		int i_86_ = 0;
		int[] is = new int[i_84_ * 3 + i_85_];
		for (int i_87_ = 0; i_87_ < i_84_; i_87_++) {
			is[i_86_++] = (((Class110) ((Class_i) this).aClass110Array5085[i_87_]).anInt1506);
			is[i_86_++] = (((Class110) ((Class_i) this).aClass110Array5085[i_87_]).anInt1510);
			is[i_86_++] = (((Class110) ((Class_i) this).aClass110Array5085[i_87_]).anInt1497);
		}
		for (int i_88_ = 0; i_88_ < i_85_; i_88_++)
			is[i_86_++] = (((Class261) ((Class_i) this).aClass261Array5084[i_88_]).anInt3577);
		int i_89_ = (((Class179) class179).aClass210Array2292 == null ? 0
				: ((Class179) class179).aClass210Array2292.length);
		int[] is_90_ = new int[i_89_ * 8];
		int i_91_ = 0;
		for (int i_92_ = 0; i_92_ < i_89_; i_92_++) {
			Class210 class210 = ((Class179) class179).aClass210Array2292[i_92_];
			Class268 class268 = Class11_Sub45_Sub20_Sub2.method3940(0,
					((Class210) class210).anInt2849);
			is_90_[i_91_++] = ((Class210) class210).anInt2847;
			is_90_[i_91_++] = ((Class268) class268).anInt3634;
			is_90_[i_91_++] = ((Class268) class268).anInt3629;
			is_90_[i_91_++] = ((Class268) class268).anInt3631;
			is_90_[i_91_++] = ((Class268) class268).anInt3642;
			is_90_[i_91_++] = ((Class268) class268).anInt3641;
			is_90_[i_91_++] = ((Class268) class268).aBool3638 ? -1 : 0;
		}
		for (int i_93_ = 0; i_93_ < i_89_; i_93_++) {
			Class210 class210 = ((Class179) class179).aClass210Array2292[i_93_];
			is_90_[i_91_++] = ((Class210) class210).anInt2852;
		}
		R(anoa5082, aya5083, ((Class179) class179).anInt2278,
				((Class179) class179).anInt2311,
				((Class179) class179).anIntArray2288,
				((Class179) class179).anIntArray2322,
				((Class179) class179).anIntArray2269,
				((Class179) class179).anIntArray2317,
				((Class179) class179).aShortArray2272,
				((Class179) class179).anInt2318,
				((Class179) class179).aShortArray2297,
				((Class179) class179).aShortArray2287,
				((Class179) class179).aShortArray2282,
				((Class179) class179).aByteArray2289,
				((Class179) class179).aByteArray2305,
				((Class179) class179).aByteArray2294,
				((Class179) class179).aByteArray2323,
				((Class179) class179).aShortArray2298,
				((Class179) class179).aShortArray2306,
				((Class179) class179).anIntArray2293,
				((Class179) class179).aByte2321,
				((Class179) class179).aShortArray2276,
				((Class179) class179).anInt2300,
				((Class179) class179).aByteArray2290,
				((Class179) class179).aShortArray2275,
				((Class179) class179).aShortArray2273,
				((Class179) class179).aShortArray2303,
				((Class179) class179).anIntArray2280,
				((Class179) class179).anIntArray2301,
				((Class179) class179).anIntArray2315,
				((Class179) class179).aByteArray2271,
				((Class179) class179).aByteArray2284,
				((Class179) class179).anIntArray2312,
				((Class179) class179).anIntArray2296,
				((Class179) class179).anIntArray2313, is, i_84_, i_85_, i,
				i_81_, i_82_, i_83_, is_90_);
	}

	protected final void finalize() {
		if (((Class_i) this).nativeid != 0L)
			Class257.method1642((byte) 123, this);
	}

	Class_i(oa var_oa) {
		anoa5082 = var_oa;
		aya5083 = null;
		oa(var_oa);
	}

	final native void P(int i, int i_94_, int i_95_, int i_96_);
}
