/* na - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class na extends Class72 implements Interface2 {
	long nativeid;

	protected final void finalize() {
		if (((na) this).nativeid != 0L)
			Class257.method1642((byte) 123, this);
	}

	na(oa var_oa, ya var_ya, int i, int i_0_, int[] is, int[] is_1_) {
		ma(var_oa, var_ya, i, i_0_, is, is_1_);
	}

	private final native void ma(oa var_oa, ya var_ya, int i, int i_2_,
			int[] is, int[] is_3_);

	public final native void w(boolean bool);
}
