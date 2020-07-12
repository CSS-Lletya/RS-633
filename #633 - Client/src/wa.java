/* wa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class wa implements Interface10 {
	private long aLong4644 = 0L;
	xa axa4645;
	Class_j aj4646;

	public final void method35(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_, boolean bool, boolean bool_5_) {
		Z(aLong4644, ((Class_j) ((wa) this).aj4646).nativeid,
				((xa) ((wa) this).axa4645).nativeid, i, i_0_, i_1_, i_2_, i_3_,
				i_4_, bool, bool_5_);
	}

	public final void method34(int i, int i_6_, int i_7_, int i_8_, int i_9_,
			int i_10_, boolean bool, boolean bool_11_) {
		X(aLong4644, ((Class_j) ((wa) this).aj4646).nativeid,
				((xa) ((wa) this).axa4645).nativeid, i, i_6_, i_7_, i_8_, i_9_,
				i_10_, bool, bool_11_);
	}

	private final native void Z(long l, long l_12_, long l_13_, int i,
			int i_14_, int i_15_, int i_16_, int i_17_, int i_18_,
			boolean bool, boolean bool_19_);

	private final native void X(long l, long l_20_, long l_21_, int i,
			int i_22_, int i_23_, int i_24_, int i_25_, int i_26_,
			boolean bool, boolean bool_27_);

	wa(oa var_oa, Class_j class_j, xa var_xa) {
		aLong4644 = ((oa) var_oa).nativeid;
		((wa) this).aj4646 = class_j;
		((wa) this).axa4645 = var_xa;
	}
}
