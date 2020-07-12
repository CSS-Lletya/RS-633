/* Class_n - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_n extends Class107 implements Interface2 {
	long nativeid;

	final void method703(char c, int i, int i_0_, int i_1_, boolean bool,
			Class72 class72, int i_2_, int i_3_) {
		PA(c, i, i_0_, i_1_, bool, class72, i_2_, i_3_);
	}

	Class_n(oa var_oa, ya var_ya, Class292 class292, Class80[] class80s,
			Class253[] class253s) {
		super(var_oa, class292);
		byte[][] is = new byte[class80s.length][];
		int[] is_4_ = new int[class80s.length];
		int[] is_5_ = new int[class80s.length];
		int[] is_6_ = new int[class80s.length];
		int[] is_7_ = new int[class80s.length];
		for (int i = 0; i < class80s.length; i++) {
			is[i] = ((Class80) class80s[i]).aByteArray1079;
			is_4_[i] = ((Class80) class80s[i]).anInt1075;
			is_5_[i] = ((Class80) class80s[i]).anInt1082;
			is_6_[i] = ((Class80) class80s[i]).anInt1080;
			is_7_[i] = ((Class80) class80s[i]).anInt1077;
		}
		S(var_oa, var_ya, is, ((Class80) class80s[0]).anIntArray1074, is_4_,
				is_5_, is_6_, is_7_);
	}

	private final native void S(oa var_oa, ya var_ya, byte[][] is, int[] is_8_,
			int[] is_9_, int[] is_10_, int[] is_11_, int[] is_12_);

	final native void fa(char c, int i, int i_13_, int i_14_, boolean bool);

	private final native void PA(char c, int i, int i_15_, int i_16_,
			boolean bool, Class72 class72, int i_17_, int i_18_);

	public final native void w(boolean bool);

	protected final void finalize() {
		if (((Class_n) this).nativeid != 0L)
			Class257.method1642((byte) 123, this);
	}
}
