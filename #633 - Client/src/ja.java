/* ja - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ja extends Class33 implements Interface2 {
	long nativeid;

	private final native void XA(long l, int i, int i_0_, int i_1_, int[] is);

	final void method289() {
		u(((ja) this).nativeid);
	}

	private final native void va(long l, int i, int i_2_, int i_3_, int[] is);

	final void method287(int i, int i_4_, int i_5_, int[] is) {
		va(((ja) this).nativeid, i, i_4_, i_5_, is);
	}

	private final native void u(long l);

	private final native void l(long l, long l_6_);

	private final native void za(long l, int i);

	public final void w(boolean bool) {
		AA(((ja) this).nativeid, bool);
	}

	private final native void NA(long l, int i);

	final void method302(int[] is) {
		w(((ja) this).nativeid, is);
	}

	private final native void AA(long l, boolean bool);

	final void method296(Class33 class33) {
		l(((ja) this).nativeid, ((ja) (ja) class33).nativeid);
	}

	final Class33 method292() {
		ja var_ja_7_ = new ja();
		var_ja_7_.method296(this);
		return var_ja_7_;
	}

	private final native void w(long l, int[] is);

	final void method298(int i) {
		t(((ja) this).nativeid, i);
	}

	final void method301(int i, int i_8_, int i_9_) {
		FA(((ja) this).nativeid, i, i_8_, i_9_);
	}

	final void method295(int i, int i_10_, int i_11_, int[] is) {
		b(((ja) this).nativeid, i, i_10_, i_11_, is);
	}

	final void method299(int i, int i_12_, int i_13_) {
		a(((ja) this).nativeid, i, i_12_, i_13_);
	}

	private final native void t(long l, int i);

	protected final void finalize() {
		if (((ja) this).nativeid != 0L)
			Class257.method1642((byte) 123, this);
	}

	final void method303(int i) {
		J(((ja) this).nativeid, i);
	}

	private final native void VA(long l, int i);

	final void method286(int i) {
		VA(((ja) this).nativeid, i);
	}

	final void method294(int i, int i_14_, int i_15_, int[] is) {
		XA(((ja) this).nativeid, i, i_14_, i_15_, is);
	}

	private final native void FA(long l, int i, int i_16_, int i_17_);

	private final native void b(long l, int i, int i_18_, int i_19_, int[] is);

	private final native void la();

	final void method300(int i, int i_20_, int i_21_, int i_22_, int i_23_,
			int i_24_) {
		P(((ja) this).nativeid, i, i_20_, i_21_, i_22_, i_23_, i_24_);
	}

	final void method293(int i) {
		m(((ja) this).nativeid, i);
	}

	private final native void P(long l, int i, int i_25_, int i_26_, int i_27_,
			int i_28_, int i_29_);

	private final native void J(long l, int i);

	private final native void a(long l, int i, int i_30_, int i_31_);

	private final native void m(long l, int i);

	ja() {
		la();
	}

	final void method288(int i) {
		NA(((ja) this).nativeid, i);
	}

	final void method297(int i) {
		za(((ja) this).nativeid, i);
	}
}
