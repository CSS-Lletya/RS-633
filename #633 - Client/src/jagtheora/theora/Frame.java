/* Frame - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class Frame extends SimplePeer {
	public int anInt5369;
	public int anInt5370;
	public int[] pixels;

	public Frame(int i, int i_0_) {
		try {
			anInt5370 = i_0_;
			anInt5369 = i;
			pixels = new int[anInt5370 * anInt5369];
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private static final native void init();

	protected final native void clear();

	static {
		init();
	}
}
