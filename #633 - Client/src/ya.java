/* ya - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ya extends Class11_Sub50 implements Interface2 {
	long nativeid;

	final native void ga();

	final native void r();

	protected final void finalize() {
		if (((ya) this).nativeid != 0L)
			Class257.method1642((byte) 123, this);
	}

	private final native void aa(oa var_oa, int i);

	public final native void w(boolean bool);

	ya(oa var_oa, int i) {
		aa(var_oa, i);
	}
}
