/* Class_h - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_h extends Class107 implements Interface2 {
	long nativeid;

	Class_h(oa var_oa, ya var_ya, Class292 class292, Class80[] class80s,
			Class253[] class253s) {
		super(var_oa, class292);
		byte[][] is = new byte[class80s.length][];
		int[] is_0_ = new int[class80s.length];
		int[] is_1_ = new int[class80s.length];
		int[] is_2_ = new int[class80s.length];
		int[] is_3_ = new int[class80s.length];
		for (int i = 0; i < class80s.length; i++) {
			is[i] = ((Class80) class80s[i]).aByteArray1079;
			is_0_[i] = ((Class80) class80s[i]).anInt1075;
			is_1_[i] = ((Class80) class80s[i]).anInt1082;
			is_2_[i] = ((Class80) class80s[i]).anInt1080;
			is_3_[i] = ((Class80) class80s[i]).anInt1077;
		}
		JA(var_oa, var_ya, is, is_0_, is_1_, is_2_, is_3_);
	}

	private final native void NA(char c, int i, int i_4_, int i_5_,
			boolean bool, Class72 class72, int i_6_, int i_7_);

	final void method703(char c, int i, int i_8_, int i_9_, boolean bool,
			Class72 class72, int i_10_, int i_11_) {
		NA(c, i, i_8_, i_9_, bool, class72, i_10_, i_11_);
	}

	protected final void finalize() {
		if (((Class_h) this).nativeid != 0L)
			Class257.method1642((byte) 123, this);
	}

	private final native void JA(oa var_oa, ya var_ya, byte[][] is,
			int[] is_12_, int[] is_13_, int[] is_14_, int[] is_15_);

	final native void fa(char c, int i, int i_16_, int i_17_, boolean bool);

	public final native void w(boolean bool);
}
